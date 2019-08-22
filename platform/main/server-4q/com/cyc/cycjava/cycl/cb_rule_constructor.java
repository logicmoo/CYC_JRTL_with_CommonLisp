/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
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
 *  module:      CB-RULE-CONSTRUCTOR
 *  source file: /cyc/top/cycl/cb-rule-constructor.lisp
 *  created:     2019/07/03 17:38:12
 */
public final class cb_rule_constructor extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_rule_constructor() {
    }

    public static final SubLFile me = new cb_rule_constructor();


    // // Definitions
    public static final SubLObject cb_rc_show_cycl_p() {
        return cb_user_interaction_agenda.$cb_uia_show_cyclP$.getGlobalValue();
    }

    public static final SubLObject cb_rc_body(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            SubLObject bgcolor = $sym0$BGCOLOR;
            return list(CLET, list(bq_cons(bgcolor, $list_alt2)), listS(HTML_FANCY_BODY, list($SHOW_COPYRIGHT, NIL, $BACKGROUND_COLOR, bgcolor), append(body, NIL)));
        }
    }

    public static final SubLObject cb_rc_document(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt6);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject state = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt6);
                    state = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject interaction = $sym7$INTERACTION;
                            return list(CLET, list(list(interaction, list(RC_STATE_INTERACTION, state))), list(PIF, list(USER_INTERACTION_P, interaction), list(HTML_DOCUMENT, listS(CB_UIAT_DISPLAY_BODY, list(interaction), append(body, NIL))), list(HTML_DOCUMENT, bq_cons(CB_RC_BODY, append(body, NIL)))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt6);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_rc_show_cycl(SubLObject cycl) {
        return cb_utilities.cb_form(cycl, ZERO_INTEGER, T);
    }

    // deflexical
    private static final SubLSymbol $cb_rc_context_color_map$ = makeSymbol("*CB-RC-CONTEXT-COLOR-MAP*");

    public static final SubLObject cb_rc_context_color(SubLObject v_context) {
        return second(assoc(v_context, $cb_rc_context_color_map$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject cb_rc_show_state(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject state_id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt19);
            state_id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_rule_constructor.rc_find_state_by_id_string(state_id_string);
                    return cb_rc_show_state_guts(state);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt19);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_rc_state(SubLObject state, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt21$_Show_RC_State_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt23$cb_rc_show_state__A, rkf_rule_constructor.rc_state_id(state));
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

    public static final SubLObject cb_rc_show_state_guts(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject interaction = rkf_rule_constructor.rc_state_interaction(state);
                if (NIL != user_interaction_agenda.user_interaction_p(interaction)) {
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
                    if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                        html_script_utilities.html_js_focus_window();
                    }
                    cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
                    html_utilities.html_newline(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
                    html_utilities.html_simple_attribute(html_macros.$html_table_nowrap$.getGlobalValue());
                    if (true) {
                        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(ONE_INTEGER);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (true) {
                        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(FIVE_INTEGER);
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
                                SubLObject _prev_bind_0_1 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_rc_show_rule_actions(state);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_rc_show_rule_lhs(state);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_rc_show_rule_rhs(state);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_rc_show_rule_exceptions(state);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } else {
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    {
                        SubLObject bgcolor = cb_rc_context_color($BACKGROUND);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != bgcolor) {
                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(bgcolor));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                        html_utilities.html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
                                        html_utilities.html_simple_attribute(html_macros.$html_table_nowrap$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(ONE_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(FIVE_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_rc_show_rule_actions(state);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_rc_show_rule_lhs(state);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_rc_show_rule_rhs(state);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_rc_show_rule_exceptions(state);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
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
            }
            return NIL;
        }
    }

    public static final SubLObject cb_rc_show_rule_actions(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject bgcolor = cb_rc_context_color($RULE_ACTIONS);
                SubLObject text = rkf_rule_constructor.rc_state_text(state);
                SubLObject interaction = rkf_rule_constructor.rc_state_interaction(state);
                SubLObject rc_act = (NIL != interaction) ? ((SubLObject) (user_interaction_agenda.ui_state_lookup(interaction, $RC_ACT, UNPROVIDED))) : NIL;
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
                if (NIL != bgcolor) {
                    html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(bgcolor);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($str_alt30$20_);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        cb_utilities.cb_link($RC_STATE, state, $str_alt31$_Refresh_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        if ((NIL != interaction) && (rc_act == $FINISH)) {
                            html_utilities.html_indent(TWO_INTEGER);
                            cb_utilities.cb_link($RC_DISCARD, state, $str_alt34$_Done_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        if ((NIL != interaction) && (NIL != rkf_rule_constructor.rc_rule_ready_p(state))) {
                            html_utilities.html_indent(TWO_INTEGER);
                            cb_utilities.cb_link($RC_ASSERT, state, $str_alt36$_Add_this_Rule_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        html_utilities.html_indent(TWO_INTEGER);
                        cb_utilities.cb_link($RC_DISCARD, state, $str_alt37$_Abandon_Rule_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_indent(TWO_INTEGER);
                        cb_utilities.cb_link($RC_EDIT_IF, state, $str_alt39$_Edit_If_Clause_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != rkf_rule_constructor.rc_state_complete_lhs_p(state)) {
                            html_utilities.html_indent(TWO_INTEGER);
                            cb_utilities.cb_link($RC_EDIT_THEN, state, $str_alt41$_Edit_Then_Clause_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        html_utilities.html_indent(TWO_INTEGER);
                        if (NIL != rkf_rule_constructor.rc_state_exceptions(state)) {
                            cb_utilities.cb_link($RC_EDIT_EXCEPTIONS, state, $str_alt43$_Edit_Exceptions_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            cb_utilities.cb_link($RC_ADD_EXCEPTIONS, state, $str_alt45$_Add_Exceptions_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        html_utilities.html_newline(UNPROVIDED);
                        if (NIL != text) {
                            html_utilities.html_newline(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_utilities.html_princ($str_alt46$Rule_Summary__);
                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                            html_utilities.html_princ(text);
                            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_rc_show_rule_lhs(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject bgcolor = cb_rc_context_color($RULE_LHS);
                SubLObject lhs = rkf_rule_constructor.rc_state_lhs(state);
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
                if (NIL != bgcolor) {
                    html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(bgcolor);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($str_alt30$20_);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (NIL != lhs) {
                            {
                                SubLObject nl_sentence = rkf_rule_constructor.rc_lhs_nl_sentence(lhs);
                                SubLObject constraints = rkf_rule_constructor.rc_lhs_constraints(lhs);
                                SubLObject terms = rkf_rule_constructor.rc_lhs_terms(lhs);
                                if (NIL != nl_sentence) {
                                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_utilities.html_princ($str_alt47$Summary_of_If_Statement__);
                                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                    html_utilities.html_princ(nl_sentence);
                                    html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                    html_utilities.html_newline(TWO_INTEGER);
                                }
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt48$If_);
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                if (NIL != terms) {
                                    html_utilities.html_indent(TWO_INTEGER);
                                    html_utilities.html_princ($str_alt49$We_know_);
                                    {
                                        SubLObject cdolist_list_var = terms;
                                        SubLObject v_term = NIL;
                                        for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                                            cb_rc_show_term(state, v_term, FOUR_INTEGER);
                                        }
                                    }
                                } else {
                                    html_utilities.html_newline(UNPROVIDED);
                                    html_utilities.html_princ($str_alt50$_No_If_terms_have_been_introduced);
                                }
                                if (NIL != constraints) {
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_newline(UNPROVIDED);
                                    html_utilities.html_princ($$$Where);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    {
                                        SubLObject cdolist_list_var = constraints;
                                        SubLObject constraint = NIL;
                                        for (constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint = cdolist_list_var.first()) {
                                            cb_rc_show_constraint(state, constraint, FOUR_INTEGER);
                                        }
                                    }
                                } else {
                                    html_utilities.html_newline(UNPROVIDED);
                                    html_utilities.html_princ($str_alt52$_No_If_constraints_have_been_spec);
                                }
                            }
                        } else {
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ($str_alt48$If_);
                            html_utilities.html_newline(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_princ($str_alt53$_No_If_Clause_has_been_specified_);
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_rc_show_rule_rhs(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject bgcolor = cb_rc_context_color($RULE_RHS);
                SubLObject rhs = rkf_rule_constructor.rc_state_rhs(state);
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
                if (NIL != bgcolor) {
                    html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(bgcolor);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($str_alt30$20_);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (NIL != rhs) {
                            {
                                SubLObject nl_sentence = rkf_rule_constructor.rc_rhs_nl_sentence(rhs);
                                SubLObject constraints = rkf_rule_constructor.rc_rhs_constraints(rhs);
                                SubLObject existential = rkf_rule_constructor.rc_rhs_existential_term(rhs);
                                if (NIL != nl_sentence) {
                                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_utilities.html_princ($str_alt54$Summary_of_Then_Statement__);
                                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                    html_utilities.html_princ(nl_sentence);
                                    html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                    html_utilities.html_newline(TWO_INTEGER);
                                }
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt55$Then_);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                if (NIL != existential) {
                                    html_utilities.html_newline(UNPROVIDED);
                                    html_utilities.html_indent(TWO_INTEGER);
                                    html_utilities.html_princ($str_alt56$There_exists_);
                                    cb_rc_show_term(state, existential, FOUR_INTEGER);
                                    html_utilities.html_princ($str_alt57$_such_that);
                                }
                                if (NIL != constraints) {
                                    {
                                        SubLObject cdolist_list_var = constraints;
                                        SubLObject constraint = NIL;
                                        for (constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint = cdolist_list_var.first()) {
                                            cb_rc_show_constraint(state, constraint, FOUR_INTEGER);
                                        }
                                    }
                                } else {
                                    html_utilities.html_newline(UNPROVIDED);
                                    html_utilities.html_princ($str_alt58$_No_Then_constraints_have_been_sp);
                                }
                            }
                        } else {
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ($str_alt55$Then_);
                            html_utilities.html_newline(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_princ($str_alt59$_No_Then_Clause_has_been_specifie);
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_rc_show_rule_exceptions(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject bgcolor = cb_rc_context_color($RULE_EXCEPTIONS);
                SubLObject exceptions = rkf_rule_constructor.rc_state_exceptions(state);
                if (NIL != exceptions) {
                    {
                        SubLObject cdolist_list_var = exceptions;
                        SubLObject exception = NIL;
                        for (exception = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , exception = cdolist_list_var.first()) {
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
                            if (NIL != bgcolor) {
                                html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(bgcolor);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($str_alt30$20_);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_utilities.html_princ($str_alt60$Exceptions_to_the_above_Rule_);
                                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    {
                                        SubLObject constraints = rkf_rule_constructor.rc_act_exception_constraints(state, exception);
                                        if (NIL != constraints) {
                                            {
                                                SubLObject cdolist_list_var_11 = constraints;
                                                SubLObject constraint = NIL;
                                                for (constraint = cdolist_list_var_11.first(); NIL != cdolist_list_var_11; cdolist_list_var_11 = cdolist_list_var_11.rest() , constraint = cdolist_list_var_11.first()) {
                                                    cb_rc_show_constraint(state, constraint, FOUR_INTEGER);
                                                }
                                            }
                                        } else {
                                            html_utilities.html_newline(UNPROVIDED);
                                            html_utilities.html_princ($str_alt61$_No_exception_constraints_have_be);
                                        }
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_rc_show_term(SubLObject state, SubLObject indexical_record, SubLObject indent) {
        if (indent == UNPROVIDED) {
            indent = FOUR_INTEGER;
        }
        if (NIL != cb_rc_show_cycl_p()) {
            html_utilities.html_newline(UNPROVIDED);
            html_utilities.html_indent(indent);
            cb_rc_show_cycl(rkf_scenario_manipulator.sm_indexical_record_indexical(indexical_record));
        }
        html_utilities.html_newline(UNPROVIDED);
        html_utilities.html_indent(indent);
        html_utilities.html_princ(rkf_scenario_manipulator.sm_indexical_record_preferred_phrase(indexical_record));
        return NIL;
    }

    public static final SubLObject cb_rc_show_constraint(SubLObject state, SubLObject constraint_record, SubLObject indent) {
        if (indent == UNPROVIDED) {
            indent = FOUR_INTEGER;
        }
        if (NIL != cb_rc_show_cycl_p()) {
            html_utilities.html_newline(UNPROVIDED);
            html_utilities.html_indent(indent);
            cb_rc_show_cycl(rkf_scenario_manipulator.sm_constraint_record_sentence(constraint_record));
        }
        {
            SubLObject text = rkf_rule_constructor.rc_act_lhs_constraint_nl_sentence(state, constraint_record);
            html_utilities.html_newline(UNPROVIDED);
            html_utilities.html_indent(indent);
            html_utilities.html_princ(text);
        }
        return NIL;
    }

    public static final SubLObject cb_link_rc_done(SubLObject state, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt34$_Done_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt62$cb_rc_done__A, rkf_rule_constructor.rc_state_id(state));
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

    public static final SubLObject cb_rc_done(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject state_id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt19);
            state_id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_rule_constructor.rc_find_state_by_id_string(state_id_string);
                    SubLObject result = rkf_rule_constructor.rc_act_assert_rule(state);
                    if (NIL != result) {
                        return cb_rc_confirm_success(state);
                    } else {
                        return cb_rc_confirm_failure(state);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt19);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_rc_confirm_success(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject interaction = rkf_rule_constructor.rc_state_interaction(state);
                if (NIL != user_interaction_agenda.user_interaction_p(interaction)) {
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
                    if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                        html_script_utilities.html_js_focus_window();
                    }
                    cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
                    html_utilities.html_princ($str_alt66$The_rule_was_successfully_asserte);
                    html_utilities.html_newline(TWO_INTEGER);
                    cb_utilities.cb_link($RC_DISCARD, state, $str_alt67$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } else {
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    {
                        SubLObject bgcolor = cb_rc_context_color($BACKGROUND);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != bgcolor) {
                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(bgcolor));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt66$The_rule_was_successfully_asserte);
                                        html_utilities.html_newline(TWO_INTEGER);
                                        cb_utilities.cb_link($RC_DISCARD, state, $str_alt67$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
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
            }
            return NIL;
        }
    }

    public static final SubLObject cb_rc_confirm_failure(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject interaction = rkf_rule_constructor.rc_state_interaction(state);
                if (NIL != user_interaction_agenda.user_interaction_p(interaction)) {
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
                    if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                        html_script_utilities.html_js_focus_window();
                    }
                    cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
                    html_utilities.html_princ($str_alt68$This_rule_could_not_be_asserted_);
                    html_utilities.html_newline(TWO_INTEGER);
                    cb_utilities.cb_link($RC_STATE, state, $str_alt67$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_newline(UNPROVIDED);
                    cb_utilities.cb_link($RC_DISCARD, state, $str_alt69$_Forget_it_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } else {
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    {
                        SubLObject bgcolor = cb_rc_context_color($BACKGROUND);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != bgcolor) {
                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(bgcolor));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt68$This_rule_could_not_be_asserted_);
                                        html_utilities.html_newline(TWO_INTEGER);
                                        cb_utilities.cb_link($RC_STATE, state, $str_alt67$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        cb_utilities.cb_link($RC_DISCARD, state, $str_alt69$_Forget_it_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
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
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_rc_assert(SubLObject state, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt70$_Assert_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt71$cb_rc_assert__A, rkf_rule_constructor.rc_state_id(state));
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

    public static final SubLObject cb_rc_assert(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject state_id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt19);
            state_id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_rule_constructor.rc_find_state_by_id_string(state_id_string);
                    SubLObject interaction = rkf_rule_constructor.rc_state_interaction(state);
                    SubLObject rule_cycl = rkf_rule_constructor.rc_act_construct_rule_cycl(state);
                    SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                    SubLObject existing_assertion = rkf_rule_constructor.rkf_find_assertion_for_sentence(rule_cycl, user_interaction_agenda.uia_domain_interaction_mt(v_agenda));
                    if (NIL == existing_assertion) {
                        cb_uia_tools_introduction.uiat_rule_constructor_specify_action(state, $ASSERT_SENTENCE, UNPROVIDED);
                    } else {
                        cb_uia_tools_introduction.uiat_rule_constructor_specify_action(state, $ASSERT_EXCEPTION, existing_assertion);
                    }
                    return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt19);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_rc_discard(SubLObject state, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt76$_Discard_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt77$cb_rc_discard__A, rkf_rule_constructor.rc_state_id(state));
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

    public static final SubLObject cb_rc_discard(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject state_id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt19);
            state_id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_rule_constructor.rc_find_state_by_id_string(state_id_string);
                    SubLObject interaction = rkf_rule_constructor.rc_state_interaction(state);
                    SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                    user_interaction_agenda.uia_act_complete(v_agenda, interaction, NIL);
                    return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt19);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_rc_edit_if(SubLObject state, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt39$_Edit_If_Clause_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt80$cb_rc_edit_if__A, rkf_rule_constructor.rc_state_id(state));
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

    public static final SubLObject cb_rc_edit_if(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject id_string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt82);
                id_string = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject state = rkf_rule_constructor.rc_find_state_by_id_string(id_string);
                        SubLObject interaction = rkf_rule_constructor.rc_state_interaction(state);
                        SubLObject v_scenario = rkf_rule_constructor.rc_state_if_scenario(state);
                        if (NIL != user_interaction_agenda.user_interaction_p(interaction)) {
                            {
                                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                                SubLObject scenario_constructor_action = uia_tools_wizards.uia_act_new_scenario_constructor(v_agenda, NIL, $REQUIRED, v_scenario);
                                user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, scenario_constructor_action);
                                return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                            }
                        }
                        {
                            SubLObject interaction_14 = rkf_rule_constructor.rc_state_interaction(state);
                            if (NIL != user_interaction_agenda.user_interaction_p(interaction_14)) {
                                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                                cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction_14);
                                if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction_14)) {
                                    html_script_utilities.html_js_focus_window();
                                }
                                cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction_14));
                                html_utilities.html_princ($str_alt84$Sorry__editing_an_If_clause_is_no);
                                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } else {
                                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                                {
                                    SubLObject bgcolor = cb_rc_context_color($BACKGROUND);
                                    {
                                        SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                        try {
                                            html_macros.$html_inside_bodyP$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                            if (NIL != bgcolor) {
                                                html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(html_utilities.html_color(bgcolor));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_princ($str_alt84$Sorry__editing_an_If_clause_is_no);
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
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
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt82);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_rc_edit_then(SubLObject state, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt41$_Edit_Then_Clause_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt86$cb_rc_edit_then__A, rkf_rule_constructor.rc_state_id(state));
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

    public static final SubLObject cb_rc_edit_then(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt82);
            id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_rule_constructor.rc_find_state_by_id_string(id_string);
                    cb_rc_edit_then_as_scenario(state);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt82);
            }
        }
        return NIL;
    }

    // defparameter
    private static final SubLSymbol $cb_rc_expert_user_p$ = makeSymbol("*CB-RC-EXPERT-USER-P*");

    public static final SubLObject cb_rc_expert_user_p(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $cb_rc_expert_user_p$.getDynamicValue(thread);
        }
    }

    public static final SubLObject cb_rc_edit_then_as_scenario(SubLObject state) {
        {
            SubLObject interaction = rkf_rule_constructor.rc_state_interaction(state);
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            cb_uia_tools_introduction.uiat_rc_prepare_editing_else_clause(interaction, state);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_rc_expert_edit_then(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject interaction = rkf_rule_constructor.rc_state_interaction(state);
                if (NIL != user_interaction_agenda.user_interaction_p(interaction)) {
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
                    if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                        html_script_utilities.html_js_focus_window();
                    }
                    cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
                    html_utilities.html_princ($$$Under_Construction);
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } else {
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    {
                        SubLObject bgcolor = cb_rc_context_color($BACKGROUND);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != bgcolor) {
                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(bgcolor));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($$$Under_Construction);
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
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
            }
            return NIL;
        }
    }

    public static final SubLObject cb_rc_novice_edit_then(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject rhs = rkf_rule_constructor.rc_state_rhs(state);
                SubLObject nl_sentence = NIL;
                if (NIL != rhs) {
                    {
                        SubLObject constraints = rkf_rule_constructor.rc_rhs_constraints(rhs);
                        if (NIL != constraints) {
                            nl_sentence = rkf_scenario_manipulator.sm_constraint_record_nl_sentence(rkf_rule_constructor.rc_rhs_constraints(rhs).first());
                        }
                    }
                }
                {
                    SubLObject interaction = rkf_rule_constructor.rc_state_interaction(state);
                    if (NIL != user_interaction_agenda.user_interaction_p(interaction)) {
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
                        if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                            html_script_utilities.html_js_focus_window();
                        }
                        cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ($$$Edit_Then_Clause);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_utilities.html_newline(TWO_INTEGER);
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
                                    html_utilities.html_hidden_input($str_alt91$cb_rc_handle_novice_edit_then, T, UNPROVIDED);
                                    html_utilities.html_hidden_input($$$state, rkf_rule_constructor.rc_state_id(state), UNPROVIDED);
                                    html_utilities.html_princ($str_alt93$Please_enter_a_short_sentence_sta);
                                    html_utilities.html_newline(UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($$$conclusion);
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
                                        SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            if (NIL != nl_sentence) {
                                                html_utilities.html_princ(nl_sentence);
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                    html_utilities.html_newline(UNPROVIDED);
                                    html_utilities.html_submit_input($$$Edit, UNPROVIDED, UNPROVIDED);
                                    html_utilities.html_reset_input($$$Restore);
                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                } finally {
                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        }
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } else {
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        {
                            SubLObject bgcolor = cb_rc_context_color($BACKGROUND);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                try {
                                    html_macros.$html_inside_bodyP$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                    if (NIL != bgcolor) {
                                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_color(bgcolor));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_utilities.html_princ($$$Edit_Then_Clause);
                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            html_utilities.html_newline(TWO_INTEGER);
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
                                                    SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_macros.$within_html_form$.bind(T, thread);
                                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                        html_utilities.html_hidden_input($str_alt91$cb_rc_handle_novice_edit_then, T, UNPROVIDED);
                                                        html_utilities.html_hidden_input($$$state, rkf_rule_constructor.rc_state_id(state), UNPROVIDED);
                                                        html_utilities.html_princ($str_alt93$Please_enter_a_short_sentence_sta);
                                                        html_utilities.html_newline(UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup($$$conclusion);
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
                                                            SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                if (NIL != nl_sentence) {
                                                                    html_utilities.html_princ(nl_sentence);
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                                        html_utilities.html_newline(UNPROVIDED);
                                                        html_utilities.html_submit_input($$$Edit, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_reset_input($$$Restore);
                                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                    } finally {
                                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                            }
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
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
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_rc_handle_novice_edit_then(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject state_id_string = html_utilities.html_extract_input($$$state, args);
                SubLObject state = rkf_rule_constructor.rc_find_state_by_id_string(state_id_string);
                SubLObject conclusion_text = html_utilities.html_extract_input($$$conclusion, args);
                SubLObject interaction = rkf_rule_constructor.rc_state_interaction(state);
                if (NIL != user_interaction_agenda.user_interaction_p(interaction)) {
                    {
                        SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                        user_interaction_agenda.ui_state_clear(interaction, $THEN_CYCL_SENTENCE);
                        if (NIL != uia_tools_basic.sentence_finder_trigger_stringP(conclusion_text)) {
                            user_interaction_agenda.ui_state_update(interaction, $RC_ACT, $PASTE_RHS);
                        } else {
                            user_interaction_agenda.ui_state_update(interaction, $THEN_SENTENCE, conclusion_text);
                            user_interaction_agenda.ui_state_update(interaction, $RC_ACT, $PARSE_RHS);
                        }
                        return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                    }
                } else {
                    {
                        SubLObject cycl_sentences = rkf_rule_constructor.rc_act_suggest_rhs_constraint(state, conclusion_text);
                        SubLObject cycl_sentence = cycl_sentences.first();
                        if (NIL == cycl_sentence) {
                            {
                                SubLObject interaction_21 = rkf_rule_constructor.rc_state_interaction(state);
                                if (NIL != user_interaction_agenda.user_interaction_p(interaction_21)) {
                                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                                    cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction_21);
                                    if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction_21)) {
                                        html_script_utilities.html_js_focus_window();
                                    }
                                    cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction_21));
                                    html_utilities.html_princ($str_alt103$The_input__);
                                    html_utilities.html_princ(conclusion_text);
                                    html_utilities.html_princ($str_alt104$__was_not_understood_);
                                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } else {
                                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                                    {
                                        SubLObject bgcolor = cb_rc_context_color($BACKGROUND);
                                        {
                                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                            try {
                                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                                if (NIL != bgcolor) {
                                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_color(bgcolor));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_princ($str_alt103$The_input__);
                                                        html_utilities.html_princ(conclusion_text);
                                                        html_utilities.html_princ($str_alt104$__was_not_understood_);
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
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
                            }
                            return NIL;
                        }
                        rkf_rule_constructor.rc_act_set_rhs_constraint(state, cycl_sentence);
                        return cb_rc_show_state_guts(state);
                    }
                }
            }
        }
    }

    public static final SubLObject cb_link_rc_add_exceptions(SubLObject state, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt45$_Add_Exceptions_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt106$cb_rc_add_exceptions__A, rkf_rule_constructor.rc_state_id(state));
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

    public static final SubLObject cb_rc_add_exceptions(SubLObject args) {
        {
            SubLObject state_id_string = args.first();
            SubLObject state = rkf_rule_constructor.rc_find_state_by_id_string(state_id_string);
            SubLObject interaction = rkf_rule_constructor.rc_state_interaction(state);
            SubLObject v_scenario = rkf_rule_constructor.rc_act_construct_exception_scenario(state);
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject scenario_constructor_action = uia_tools_wizards.uia_act_new_scenario_constructor(v_agenda, $$$Exceptions, $REQUIRED, v_scenario);
            user_interaction_agenda.ui_state_update(scenario_constructor_action, $EXCEPTIONS, $TRUE);
            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, scenario_constructor_action);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_link_rc_edit_exceptions(SubLObject state, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt43$_Edit_Exceptions_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt112$cb_rc_edit_exceptions__A, rkf_rule_constructor.rc_state_id(state));
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

    public static final SubLObject cb_rc_edit_exceptions(SubLObject args) {
        {
            SubLObject state_id_string = args.first();
            SubLObject state = rkf_rule_constructor.rc_find_state_by_id_string(state_id_string);
            SubLObject interaction = rkf_rule_constructor.rc_state_interaction(state);
            SubLObject v_scenario = rkf_rule_constructor.rc_state_exceptions(state).first();
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject scenario_constructor_action = uia_tools_wizards.uia_act_new_scenario_constructor(v_agenda, $$$Exceptions, $REQUIRED, v_scenario);
            user_interaction_agenda.ui_state_update(scenario_constructor_action, $EXCEPTIONS, $TRUE);
            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, scenario_constructor_action);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_rc_find_lhs_scenario_guts(SubLObject state) {
        {
            SubLObject lhs = rkf_rule_constructor.rc_state_lhs(state);
            SubLObject nl_sentence = rkf_rule_constructor.rc_lhs_nl_sentence(lhs);
            SubLObject candidate_scenarios = NIL;
            SubLObject v_scenario = candidate_scenarios.first();
            if (NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario)) {
                return cb_rc_init_lhs_from_scenario(state, v_scenario);
            }
            return cb_rc_confirm_sc_use(state, nl_sentence);
        }
    }

    public static final SubLObject cb_rc_init_lhs_from_scenario(SubLObject state, SubLObject v_scenario) {
        rkf_rule_constructor.rc_act_note_state_if_scenario(state, v_scenario);
        rkf_rule_constructor.rc_act_initialize_lhs_from_scenario(state);
        {
            SubLObject rhs = rkf_rule_constructor.rc_state_rhs(state);
            if (NIL != rkf_rule_constructor.rc_rhs_p(rhs)) {
                {
                    SubLObject nl_sentence = rkf_rule_constructor.rc_rhs_nl_sentence(rhs);
                    SubLObject rhs_cycl = rkf_rule_constructor.rc_rhs_cycl(rhs);
                    SubLObject interaction = rkf_rule_constructor.rc_state_interaction(state);
                    SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                    if (NIL == el_utilities.possibly_sentence_p(rhs_cycl)) {
                        if (nl_sentence.isString()) {
                            if (NIL != uia_tools_basic.sentence_finder_trigger_stringP(nl_sentence)) {
                                user_interaction_agenda.ui_state_update(interaction, $RC_ACT, $PASTE_RHS);
                            } else {
                                user_interaction_agenda.ui_state_update(interaction, $RC_ACT, $PARSE_RHS);
                                user_interaction_agenda.ui_state_update(interaction, $THEN_SENTENCE, nl_sentence);
                            }
                            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                        }
                    }
                }
            }
        }
        return cb_rc_show_state_guts(state);
    }

    public static final SubLObject cb_rc_confirm_sc_use(SubLObject state, SubLObject nl_sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject interaction = rkf_rule_constructor.rc_state_interaction(state);
                if (NIL != user_interaction_agenda.user_interaction_p(interaction)) {
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
                    if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                        html_script_utilities.html_js_focus_window();
                    }
                    cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
                    html_utilities.html_princ($str_alt115$I_didn_t_understand_the_following);
                    html_utilities.html_newline(TWO_INTEGER);
                    html_utilities.html_indent(FIVE_INTEGER);
                    html_utilities.html_princ(nl_sentence);
                    html_utilities.html_newline(TWO_INTEGER);
                    html_utilities.html_princ($str_alt116$Please_use_the_Scenario_Construct);
                    html_utilities.html_newline(TWO_INTEGER);
                    cb_utilities.cb_link($RC_USE_SC, state, $str_alt67$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_indent(FIVE_INTEGER);
                    cb_utilities.cb_link($RC_DISCARD, state, $str_alt69$_Forget_it_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } else {
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    {
                        SubLObject bgcolor = cb_rc_context_color($BACKGROUND);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != bgcolor) {
                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(bgcolor));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt115$I_didn_t_understand_the_following);
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_indent(FIVE_INTEGER);
                                        html_utilities.html_princ(nl_sentence);
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_princ($str_alt116$Please_use_the_Scenario_Construct);
                                        html_utilities.html_newline(TWO_INTEGER);
                                        cb_utilities.cb_link($RC_USE_SC, state, $str_alt67$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_indent(FIVE_INTEGER);
                                        cb_utilities.cb_link($RC_DISCARD, state, $str_alt69$_Forget_it_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
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
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_rc_use_sc(SubLObject state, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt118$_Use_Scenario_Constructor_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt119$cb_rc_use_sc__A, rkf_rule_constructor.rc_state_id(state));
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

    public static final SubLObject cb_rc_use_sc(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt82);
            id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_rule_constructor.rc_find_state_by_id_string(id_string);
                    SubLObject lhs = rkf_rule_constructor.rc_state_lhs(state);
                    SubLObject nl_sentence = rkf_rule_constructor.rc_lhs_nl_sentence(lhs);
                    SubLObject interaction = rkf_rule_constructor.rc_state_interaction(state);
                    SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                    user_interaction_agenda.ui_state_update(interaction, $RC_ACT, $BUILD_SCENARIO);
                    user_interaction_agenda.ui_state_update(interaction, $IF_SENTENCE, nl_sentence);
                    return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt82);
            }
        }
        return NIL;
    }

    public static final SubLObject declare_cb_rule_constructor_file() {
        declareFunction("cb_rc_show_cycl_p", "CB-RC-SHOW-CYCL-P", 0, 0, false);
        declareMacro("cb_rc_body", "CB-RC-BODY");
        declareMacro("cb_rc_document", "CB-RC-DOCUMENT");
        declareFunction("cb_rc_show_cycl", "CB-RC-SHOW-CYCL", 1, 0, false);
        declareFunction("cb_rc_context_color", "CB-RC-CONTEXT-COLOR", 1, 0, false);
        declareFunction("cb_rc_show_state", "CB-RC-SHOW-STATE", 0, 1, false);
        declareFunction("cb_link_rc_state", "CB-LINK-RC-STATE", 1, 1, false);
        declareFunction("cb_rc_show_state_guts", "CB-RC-SHOW-STATE-GUTS", 1, 0, false);
        declareFunction("cb_rc_show_rule_actions", "CB-RC-SHOW-RULE-ACTIONS", 1, 0, false);
        declareFunction("cb_rc_show_rule_lhs", "CB-RC-SHOW-RULE-LHS", 1, 0, false);
        declareFunction("cb_rc_show_rule_rhs", "CB-RC-SHOW-RULE-RHS", 1, 0, false);
        declareFunction("cb_rc_show_rule_exceptions", "CB-RC-SHOW-RULE-EXCEPTIONS", 1, 0, false);
        declareFunction("cb_rc_show_term", "CB-RC-SHOW-TERM", 2, 1, false);
        declareFunction("cb_rc_show_constraint", "CB-RC-SHOW-CONSTRAINT", 2, 1, false);
        declareFunction("cb_link_rc_done", "CB-LINK-RC-DONE", 1, 1, false);
        declareFunction("cb_rc_done", "CB-RC-DONE", 1, 0, false);
        declareFunction("cb_rc_confirm_success", "CB-RC-CONFIRM-SUCCESS", 1, 0, false);
        declareFunction("cb_rc_confirm_failure", "CB-RC-CONFIRM-FAILURE", 1, 0, false);
        declareFunction("cb_link_rc_assert", "CB-LINK-RC-ASSERT", 1, 1, false);
        declareFunction("cb_rc_assert", "CB-RC-ASSERT", 1, 0, false);
        declareFunction("cb_link_rc_discard", "CB-LINK-RC-DISCARD", 1, 1, false);
        declareFunction("cb_rc_discard", "CB-RC-DISCARD", 1, 0, false);
        declareFunction("cb_link_rc_edit_if", "CB-LINK-RC-EDIT-IF", 1, 1, false);
        declareFunction("cb_rc_edit_if", "CB-RC-EDIT-IF", 1, 0, false);
        declareFunction("cb_link_rc_edit_then", "CB-LINK-RC-EDIT-THEN", 1, 1, false);
        declareFunction("cb_rc_edit_then", "CB-RC-EDIT-THEN", 1, 0, false);
        declareFunction("cb_rc_expert_user_p", "CB-RC-EXPERT-USER-P", 1, 0, false);
        declareFunction("cb_rc_edit_then_as_scenario", "CB-RC-EDIT-THEN-AS-SCENARIO", 1, 0, false);
        declareFunction("cb_rc_expert_edit_then", "CB-RC-EXPERT-EDIT-THEN", 1, 0, false);
        declareFunction("cb_rc_novice_edit_then", "CB-RC-NOVICE-EDIT-THEN", 1, 0, false);
        declareFunction("cb_rc_handle_novice_edit_then", "CB-RC-HANDLE-NOVICE-EDIT-THEN", 1, 0, false);
        declareFunction("cb_link_rc_add_exceptions", "CB-LINK-RC-ADD-EXCEPTIONS", 1, 1, false);
        declareFunction("cb_rc_add_exceptions", "CB-RC-ADD-EXCEPTIONS", 1, 0, false);
        declareFunction("cb_link_rc_edit_exceptions", "CB-LINK-RC-EDIT-EXCEPTIONS", 1, 1, false);
        declareFunction("cb_rc_edit_exceptions", "CB-RC-EDIT-EXCEPTIONS", 1, 0, false);
        declareFunction("cb_rc_find_lhs_scenario_guts", "CB-RC-FIND-LHS-SCENARIO-GUTS", 1, 0, false);
        declareFunction("cb_rc_init_lhs_from_scenario", "CB-RC-INIT-LHS-FROM-SCENARIO", 2, 0, false);
        declareFunction("cb_rc_confirm_sc_use", "CB-RC-CONFIRM-SC-USE", 2, 0, false);
        declareFunction("cb_link_rc_use_sc", "CB-LINK-RC-USE-SC", 1, 1, false);
        declareFunction("cb_rc_use_sc", "CB-RC-USE-SC", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_rule_constructor_file() {
        deflexical("*CB-RC-CONTEXT-COLOR-MAP*", list($list_alt14, list($RULE_ACTIONS, html_macros.$html_color_lighter_grey$.getDynamicValue()), list($RULE_LHS, html_macros.$html_color_cyc_logo_light_violet$.getDynamicValue()), list($RULE_RHS, html_macros.$html_color_cyc_logo_lighter_violet$.getDynamicValue()), list($RULE_EXCEPTIONS, html_macros.$html_color_light_blue$.getDynamicValue())));
        defparameter("*CB-RC-EXPERT-USER-P*", NIL);
        return NIL;
    }

    public static final SubLObject setup_cb_rule_constructor_file() {
                html_macros.note_html_handler_function(CB_RC_SHOW_STATE);
        cb_utilities.setup_cb_link_method($RC_STATE, CB_LINK_RC_STATE, TWO_INTEGER);
        cb_utilities.setup_cb_link_method($RC_DONE, CB_LINK_RC_DONE, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_RC_DONE);
        cb_utilities.setup_cb_link_method($RC_ASSERT, CB_LINK_RC_ASSERT, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_RC_ASSERT);
        cb_utilities.setup_cb_link_method($RC_DISCARD, CB_LINK_RC_DISCARD, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_RC_DISCARD);
        cb_utilities.setup_cb_link_method($RC_EDIT_IF, CB_LINK_RC_EDIT_IF, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_RC_EDIT_IF);
        cb_utilities.setup_cb_link_method($RC_EDIT_THEN, CB_LINK_RC_EDIT_THEN, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_RC_EDIT_THEN);
        html_macros.note_html_handler_function(CB_RC_HANDLE_NOVICE_EDIT_THEN);
        cb_utilities.setup_cb_link_method($RC_ADD_EXCEPTIONS, CB_LINK_RC_ADD_EXCEPTIONS, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_RC_ADD_EXCEPTIONS);
        cb_utilities.setup_cb_link_method($RC_EDIT_EXCEPTIONS, CB_LINK_RC_EDIT_EXCEPTIONS, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_RC_EDIT_EXCEPTIONS);
        cb_utilities.setup_cb_link_method($RC_USE_SC, CB_LINK_RC_USE_SC, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_RC_USE_SC);
        return NIL;
    }

    // // Internal Constants
    static private final SubLSymbol $sym0$BGCOLOR = makeUninternedSymbol("BGCOLOR");



    static private final SubLList $list_alt2 = list(list(makeSymbol("CB-RC-CONTEXT-COLOR"), makeKeyword("BACKGROUND")));







    static private final SubLList $list_alt6 = list(list(makeSymbol("STATE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym7$INTERACTION = makeUninternedSymbol("INTERACTION");

    private static final SubLSymbol RC_STATE_INTERACTION = makeSymbol("RC-STATE-INTERACTION");







    private static final SubLSymbol CB_UIAT_DISPLAY_BODY = makeSymbol("CB-UIAT-DISPLAY-BODY");

    private static final SubLSymbol CB_RC_BODY = makeSymbol("CB-RC-BODY");

    static private final SubLList $list_alt14 = list(makeKeyword("BACKGROUND"), makeString("#cfcfcf"));

    private static final SubLSymbol $RULE_ACTIONS = makeKeyword("RULE-ACTIONS");

    private static final SubLSymbol $RULE_LHS = makeKeyword("RULE-LHS");

    private static final SubLSymbol $RULE_RHS = makeKeyword("RULE-RHS");

    private static final SubLSymbol $RULE_EXCEPTIONS = makeKeyword("RULE-EXCEPTIONS");

    static private final SubLList $list_alt19 = list(makeSymbol("STATE-ID-STRING"));

    private static final SubLSymbol CB_RC_SHOW_STATE = makeSymbol("CB-RC-SHOW-STATE");

    static private final SubLString $str_alt21$_Show_RC_State_ = makeString("[Show RC State]");



    static private final SubLString $str_alt23$cb_rc_show_state__A = makeString("cb-rc-show-state&~A");

    private static final SubLSymbol $RC_STATE = makeKeyword("RC-STATE");

    private static final SubLSymbol CB_LINK_RC_STATE = makeSymbol("CB-LINK-RC-STATE");



    private static final SubLSymbol $RC_ACT = makeKeyword("RC-ACT");





    static private final SubLString $str_alt30$20_ = makeString("20%");

    static private final SubLString $str_alt31$_Refresh_ = makeString("[Refresh]");



    private static final SubLSymbol $RC_DISCARD = makeKeyword("RC-DISCARD");

    static private final SubLString $str_alt34$_Done_ = makeString("[Done]");

    private static final SubLSymbol $RC_ASSERT = makeKeyword("RC-ASSERT");

    static private final SubLString $str_alt36$_Add_this_Rule_ = makeString("[Add this Rule]");

    static private final SubLString $str_alt37$_Abandon_Rule_ = makeString("[Abandon Rule]");

    private static final SubLSymbol $RC_EDIT_IF = makeKeyword("RC-EDIT-IF");

    static private final SubLString $str_alt39$_Edit_If_Clause_ = makeString("[Edit If Clause]");

    private static final SubLSymbol $RC_EDIT_THEN = makeKeyword("RC-EDIT-THEN");

    static private final SubLString $str_alt41$_Edit_Then_Clause_ = makeString("[Edit Then Clause]");

    private static final SubLSymbol $RC_EDIT_EXCEPTIONS = makeKeyword("RC-EDIT-EXCEPTIONS");

    static private final SubLString $str_alt43$_Edit_Exceptions_ = makeString("[Edit Exceptions]");

    private static final SubLSymbol $RC_ADD_EXCEPTIONS = makeKeyword("RC-ADD-EXCEPTIONS");

    static private final SubLString $str_alt45$_Add_Exceptions_ = makeString("[Add Exceptions]");

    static private final SubLString $str_alt46$Rule_Summary__ = makeString("Rule Summary: ");

    static private final SubLString $str_alt47$Summary_of_If_Statement__ = makeString("Summary of If Statement: ");

    static private final SubLString $str_alt48$If_ = makeString("If:");

    static private final SubLString $str_alt49$We_know_ = makeString("We know ");

    static private final SubLString $str_alt50$_No_If_terms_have_been_introduced = makeString("(No If terms have been introduced.");

    static private final SubLString $$$Where = makeString("Where");

    static private final SubLString $str_alt52$_No_If_constraints_have_been_spec = makeString("(No If constraints have been specified.)");

    static private final SubLString $str_alt53$_No_If_Clause_has_been_specified_ = makeString("(No If Clause has been specified.)");

    static private final SubLString $str_alt54$Summary_of_Then_Statement__ = makeString("Summary of Then Statement: ");

    static private final SubLString $str_alt55$Then_ = makeString("Then:");

    static private final SubLString $str_alt56$There_exists_ = makeString("There exists ");

    static private final SubLString $str_alt57$_such_that = makeString(" such that");

    static private final SubLString $str_alt58$_No_Then_constraints_have_been_sp = makeString("(No Then constraints have been specified.)");

    static private final SubLString $str_alt59$_No_Then_Clause_has_been_specifie = makeString("(No Then Clause has been specified.)");

    static private final SubLString $str_alt60$Exceptions_to_the_above_Rule_ = makeString("Exceptions to the above Rule:");

    static private final SubLString $str_alt61$_No_exception_constraints_have_be = makeString("(No exception constraints have been specified.)");

    static private final SubLString $str_alt62$cb_rc_done__A = makeString("cb-rc-done&~A");

    private static final SubLSymbol $RC_DONE = makeKeyword("RC-DONE");

    private static final SubLSymbol CB_LINK_RC_DONE = makeSymbol("CB-LINK-RC-DONE");

    private static final SubLSymbol CB_RC_DONE = makeSymbol("CB-RC-DONE");

    static private final SubLString $str_alt66$The_rule_was_successfully_asserte = makeString("The rule was successfully asserted.");

    static private final SubLString $str_alt67$_Continue_ = makeString("[Continue]");

    static private final SubLString $str_alt68$This_rule_could_not_be_asserted_ = makeString("This rule could not be asserted.");

    static private final SubLString $str_alt69$_Forget_it_ = makeString("[Forget it]");

    static private final SubLString $str_alt70$_Assert_ = makeString("[Assert]");

    static private final SubLString $str_alt71$cb_rc_assert__A = makeString("cb-rc-assert&~A");

    private static final SubLSymbol CB_LINK_RC_ASSERT = makeSymbol("CB-LINK-RC-ASSERT");



    private static final SubLSymbol $ASSERT_EXCEPTION = makeKeyword("ASSERT-EXCEPTION");

    private static final SubLSymbol CB_RC_ASSERT = makeSymbol("CB-RC-ASSERT");

    static private final SubLString $str_alt76$_Discard_ = makeString("[Discard]");

    static private final SubLString $str_alt77$cb_rc_discard__A = makeString("cb-rc-discard&~A");

    private static final SubLSymbol CB_LINK_RC_DISCARD = makeSymbol("CB-LINK-RC-DISCARD");

    private static final SubLSymbol CB_RC_DISCARD = makeSymbol("CB-RC-DISCARD");

    static private final SubLString $str_alt80$cb_rc_edit_if__A = makeString("cb-rc-edit-if&~A");

    private static final SubLSymbol CB_LINK_RC_EDIT_IF = makeSymbol("CB-LINK-RC-EDIT-IF");

    static private final SubLList $list_alt82 = list(makeSymbol("ID-STRING"));



    static private final SubLString $str_alt84$Sorry__editing_an_If_clause_is_no = makeString("Sorry, editing an If clause is not supported outside the User Interaction framework at this time.");

    private static final SubLSymbol CB_RC_EDIT_IF = makeSymbol("CB-RC-EDIT-IF");

    static private final SubLString $str_alt86$cb_rc_edit_then__A = makeString("cb-rc-edit-then&~A");

    private static final SubLSymbol CB_LINK_RC_EDIT_THEN = makeSymbol("CB-LINK-RC-EDIT-THEN");

    private static final SubLSymbol CB_RC_EDIT_THEN = makeSymbol("CB-RC-EDIT-THEN");

    static private final SubLString $$$Under_Construction = makeString("Under Construction");

    static private final SubLString $$$Edit_Then_Clause = makeString("Edit Then Clause");

    static private final SubLString $str_alt91$cb_rc_handle_novice_edit_then = makeString("cb-rc-handle-novice-edit-then");

    static private final SubLString $$$state = makeString("state");

    static private final SubLString $str_alt93$Please_enter_a_short_sentence_sta = makeString("Please enter a short sentence stating the conclusion for this rule.");

    static private final SubLString $$$conclusion = makeString("conclusion");

    public static final SubLInteger $int$60 = makeInteger(60);

    static private final SubLString $$$virtual = makeString("virtual");

    static private final SubLString $$$Edit = makeString("Edit");

    static private final SubLString $$$Restore = makeString("Restore");

    private static final SubLSymbol $THEN_CYCL_SENTENCE = makeKeyword("THEN-CYCL-SENTENCE");

    private static final SubLSymbol $PASTE_RHS = makeKeyword("PASTE-RHS");

    private static final SubLSymbol $THEN_SENTENCE = makeKeyword("THEN-SENTENCE");

    private static final SubLSymbol $PARSE_RHS = makeKeyword("PARSE-RHS");

    static private final SubLString $str_alt103$The_input__ = makeString("The input, ");

    static private final SubLString $str_alt104$__was_not_understood_ = makeString(", was not understood.");

    private static final SubLSymbol CB_RC_HANDLE_NOVICE_EDIT_THEN = makeSymbol("CB-RC-HANDLE-NOVICE-EDIT-THEN");

    static private final SubLString $str_alt106$cb_rc_add_exceptions__A = makeString("cb-rc-add-exceptions&~A");

    private static final SubLSymbol CB_LINK_RC_ADD_EXCEPTIONS = makeSymbol("CB-LINK-RC-ADD-EXCEPTIONS");

    static private final SubLString $$$Exceptions = makeString("Exceptions");





    private static final SubLSymbol CB_RC_ADD_EXCEPTIONS = makeSymbol("CB-RC-ADD-EXCEPTIONS");

    static private final SubLString $str_alt112$cb_rc_edit_exceptions__A = makeString("cb-rc-edit-exceptions&~A");

    private static final SubLSymbol CB_LINK_RC_EDIT_EXCEPTIONS = makeSymbol("CB-LINK-RC-EDIT-EXCEPTIONS");

    private static final SubLSymbol CB_RC_EDIT_EXCEPTIONS = makeSymbol("CB-RC-EDIT-EXCEPTIONS");

    static private final SubLString $str_alt115$I_didn_t_understand_the_following = makeString("I didn't understand the following If Clause input:");

    static private final SubLString $str_alt116$Please_use_the_Scenario_Construct = makeString("Please use the Scenario Constructor to introduce the terms in your If Clause and state the constraints that must hold among them for the Then Clause to be concluded.");

    private static final SubLSymbol $RC_USE_SC = makeKeyword("RC-USE-SC");

    static private final SubLString $str_alt118$_Use_Scenario_Constructor_ = makeString("[Use Scenario Constructor]");

    static private final SubLString $str_alt119$cb_rc_use_sc__A = makeString("cb-rc-use-sc&~A");

    private static final SubLSymbol CB_LINK_RC_USE_SC = makeSymbol("CB-LINK-RC-USE-SC");

    private static final SubLSymbol $BUILD_SCENARIO = makeKeyword("BUILD-SCENARIO");

    private static final SubLSymbol $IF_SENTENCE = makeKeyword("IF-SENTENCE");

    private static final SubLSymbol CB_RC_USE_SC = makeSymbol("CB-RC-USE-SC");

    // // Initializers
    public void declareFunctions() {
        declare_cb_rule_constructor_file();
    }

    public void initializeVariables() {
        init_cb_rule_constructor_file();
    }

    public void runTopLevelForms() {
        setup_cb_rule_constructor_file();
    }
}

