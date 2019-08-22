/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CB-QUERY-CONSTRUCTOR
 *  source file: /cyc/top/cycl/cb-query-constructor.lisp
 *  created:     2019/07/03 17:38:12
 */
public final class cb_query_constructor extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_query_constructor() {
    }

    public static final SubLFile me = new cb_query_constructor();


    // // Definitions
    public static final SubLObject cb_qc_show_cycl_p() {
        return cb_user_interaction_agenda.$cb_uia_show_cyclP$.getGlobalValue();
    }

    public static final SubLObject cb_qc_body(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            SubLObject bgcolor = $sym0$BGCOLOR;
            return list(CLET, list(bq_cons(bgcolor, $list_alt2)), listS(HTML_FANCY_BODY, list($SHOW_COPYRIGHT, NIL, $BACKGROUND_COLOR, bgcolor), append(body, NIL)));
        }
    }

    public static final SubLObject cb_qc_document(SubLObject macroform, SubLObject environment) {
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
                            return list(CLET, list(list(interaction, list(QC_STATE_INTERACTION, state))), list(PIF, list(USER_INTERACTION_P, interaction), list(HTML_DOCUMENT, listS(CB_UIAT_DISPLAY_BODY, list(interaction), append(body, NIL))), list(HTML_DOCUMENT, bq_cons(CB_QC_BODY, append(body, NIL)))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt6);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_qc_show_cycl(SubLObject cycl) {
        return cb_utilities.cb_form(cycl, ZERO_INTEGER, T);
    }

    // deflexical
    private static final SubLSymbol $cb_qc_context_color_map$ = makeSymbol("*CB-QC-CONTEXT-COLOR-MAP*");

    public static final SubLObject cb_qc_context_color(SubLObject v_context) {
        return second(assoc(v_context, $cb_qc_context_color_map$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject cb_qc_show_state(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject state_id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt15);
            state_id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_query_constructor.qc_find_state_by_id_string(state_id_string);
                    return cb_qc_show_state_guts(state);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt15);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_qc_state(SubLObject state, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt17$_Show_QC_State_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt19$cb_qc_show_state__A, rkf_query_constructor.qc_state_id(state));
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

    public static final SubLObject cb_qc_show_state_guts(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject query = rkf_query_constructor.qc_state_query(state);
                SubLObject interaction = rkf_query_constructor.qc_state_interaction(state);
                if (NIL != user_interaction_agenda.user_interaction_p(interaction)) {
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
                    if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                        html_script_utilities.html_js_focus_window();
                    }
                    cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
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
                    if (true) {
                        html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($str_alt22$90_);
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
                                    cb_qc_show_query_actions(state);
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
                                    cb_qc_show_query(state, query, T);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
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
                        SubLObject bgcolor = cb_qc_context_color($BACKGROUND);
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
                                    SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
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
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup($str_alt22$90_);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_qc_show_query_actions(state);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_qc_show_query(state, query, T);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
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
                return NIL;
            }
        }
    }

    public static final SubLObject cb_qc_show_query_actions(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject bgcolor = cb_qc_context_color($QUERY_ACTIONS);
                SubLObject query = rkf_query_constructor.qc_state_query(state);
                SubLObject text = rkf_query_constructor.qc_state_text(state);
                SubLObject interaction = rkf_query_constructor.qc_state_interaction(state);
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
                if (NIL != bgcolor) {
                    html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(bgcolor);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($str_alt27$20_);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        cb_utilities.cb_link($QC_STATE, state, $$$Query_State, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        if (NIL != text) {
                            html_utilities.html_newline(UNPROVIDED);
                            html_utilities.html_princ(text);
                        }
                        if ((NIL != query) && (NIL != interaction)) {
                            html_utilities.html_newline(UNPROVIDED);
                            cb_utilities.cb_link($QC_DONE, state, $str_alt30$_Use_This_Query_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        html_utilities.html_newline(UNPROVIDED);
                        cb_utilities.cb_link($QC_EDIT_SCENARIO, state, $str_alt32$_Edit_Query_Scenario_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_qc_show_query(SubLObject state, SubLObject query, SubLObject allow_edit) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject bgcolor = cb_qc_context_color($ACTIVE_QUERY);
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
                if (NIL != bgcolor) {
                    html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(bgcolor);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($str_alt27$20_);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (NIL != rkf_query_constructor.qc_query_p(query)) {
                            {
                                SubLObject all_terms = rkf_query_constructor.qc_query_terms(query);
                                SubLObject return_terms = rkf_query_constructor.qc_query_return_terms(query);
                                SubLObject assumed_terms = rkf_query_constructor.qc_query_assumed_terms(query);
                                SubLObject variable_terms = set_difference(all_terms, assumed_terms, UNPROVIDED, UNPROVIDED);
                                SubLObject assumed_constraints = rkf_query_constructor.qc_query_assumed_constraints(query);
                                SubLObject all_constraints = rkf_query_constructor.qc_query_constraints(query);
                                SubLObject asking_constraints = set_difference(all_constraints, assumed_constraints, UNPROVIDED, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($$$Current_Query);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                if ((NIL != assumed_terms) || (NIL != assumed_constraints)) {
                                    html_utilities.html_newline(TWO_INTEGER);
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_princ($str_alt35$Assuming_the_existence_of_);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    {
                                        SubLObject cdolist_list_var = assumed_terms;
                                        SubLObject assumed_term = NIL;
                                        for (assumed_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assumed_term = cdolist_list_var.first()) {
                                            if (NIL != allow_edit) {
                                                cb_qc_show_indexical_record(state, assumed_term, NIL, NIL, NIL, T);
                                            } else {
                                                cb_qc_show_indexical_record(state, assumed_term, NIL, NIL, NIL, NIL);
                                            }
                                        }
                                    }
                                    if (NIL != assumed_constraints) {
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_indent(FOUR_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Where);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject cdolist_list_var = assumed_constraints;
                                            SubLObject constraint_record = NIL;
                                            for (constraint_record = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint_record = cdolist_list_var.first()) {
                                                cb_qc_show_constraint_record(state, constraint_record, NIL, T);
                                            }
                                        }
                                    }
                                }
                                if (NIL == return_terms) {
                                    cb_qc_show_yes_no_query(state, query, UNPROVIDED);
                                } else {
                                    if (NIL != list_utilities.sets_equalP(variable_terms, return_terms, UNPROVIDED)) {
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt37$Find_and_Tell_me_about_);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject cdolist_list_var = variable_terms;
                                            SubLObject indexical_record = NIL;
                                            for (indexical_record = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , indexical_record = cdolist_list_var.first()) {
                                                if (NIL != allow_edit) {
                                                    cb_qc_show_indexical_record(state, indexical_record, T, NIL, T, NIL);
                                                } else {
                                                    cb_qc_show_indexical_record(state, indexical_record, NIL, NIL, NIL, NIL);
                                                }
                                            }
                                        }
                                    } else {
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt38$Find_);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject cdolist_list_var = variable_terms;
                                            SubLObject indexical_record = NIL;
                                            for (indexical_record = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , indexical_record = cdolist_list_var.first()) {
                                                if ((NIL != allow_edit) && (NIL == subl_promotions.memberP(indexical_record, return_terms, UNPROVIDED, UNPROVIDED))) {
                                                    cb_qc_show_indexical_record(state, indexical_record, NIL, T, T, NIL);
                                                } else {
                                                    cb_qc_show_indexical_record(state, indexical_record, NIL, NIL, NIL, NIL);
                                                }
                                            }
                                        }
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt39$Tell_me_about_);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject cdolist_list_var = return_terms;
                                            SubLObject indexical_record = NIL;
                                            for (indexical_record = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , indexical_record = cdolist_list_var.first()) {
                                                if (NIL != allow_edit) {
                                                    cb_qc_show_indexical_record(state, indexical_record, T, NIL, T, NIL);
                                                } else {
                                                    cb_qc_show_indexical_record(state, indexical_record, NIL, NIL, NIL, NIL);
                                                }
                                            }
                                        }
                                    }
                                    html_utilities.html_newline(TWO_INTEGER);
                                    html_utilities.html_indent(FOUR_INTEGER);
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_princ($str_alt40$Where_);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_utilities.html_newline(UNPROVIDED);
                                    {
                                        SubLObject cdolist_list_var = asking_constraints;
                                        SubLObject constraint_record = NIL;
                                        for (constraint_record = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint_record = cdolist_list_var.first()) {
                                            if (NIL != rkf_query_constructor.qc_assumable_constraint_p(state, constraint_record)) {
                                                cb_qc_show_constraint_record(state, constraint_record, T, UNPROVIDED);
                                            } else {
                                                cb_qc_show_constraint_record(state, constraint_record, NIL, UNPROVIDED);
                                            }
                                        }
                                    }
                                    if (NIL != cb_qc_show_cycl_p()) {
                                        html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt41$Query_Cycl_);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_newline(UNPROVIDED);
                                        cb_qc_show_cycl(rkf_query_constructor.qc_query_cycl(query));
                                    }
                                }
                            }
                        } else {
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ($$$No_current_query);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
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

    public static final SubLObject cb_qc_show_yes_no_query(SubLObject state, SubLObject query, SubLObject allow_edit) {
        if (allow_edit == UNPROVIDED) {
            allow_edit = T;
        }
        {
            SubLObject all_constraints = rkf_query_constructor.qc_query_constraints(query);
            SubLObject assumed_constraints = rkf_query_constructor.qc_query_assumed_constraints(query);
            SubLObject query_constraints = set_difference(all_constraints, assumed_constraints, UNPROVIDED, UNPROVIDED);
            SubLObject all_terms = rkf_query_constructor.qc_query_terms(query);
            SubLObject assumed_terms = rkf_query_constructor.qc_query_assumed_terms(query);
            SubLObject dont_tell_terms = set_difference(all_terms, assumed_terms, UNPROVIDED, UNPROVIDED);
            if (NIL != dont_tell_terms) {
                html_utilities.html_newline(TWO_INTEGER);
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ($str_alt38$Find_);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                {
                    SubLObject cdolist_list_var = dont_tell_terms;
                    SubLObject indexical_record = NIL;
                    for (indexical_record = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , indexical_record = cdolist_list_var.first()) {
                        if (NIL != allow_edit) {
                            cb_qc_show_indexical_record(state, indexical_record, NIL, T, T, NIL);
                        } else {
                            cb_qc_show_indexical_record(state, indexical_record, NIL, NIL, NIL, NIL);
                        }
                    }
                }
            }
            html_utilities.html_newline(TWO_INTEGER);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ($str_alt43$Tell_me_whether_or_not_);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            {
                SubLObject cdolist_list_var = query_constraints;
                SubLObject constraint_record = NIL;
                for (constraint_record = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint_record = cdolist_list_var.first()) {
                    if (length(query_constraints).numG(ONE_INTEGER)) {
                        cb_qc_show_constraint_record(state, constraint_record, T, UNPROVIDED);
                    } else {
                        cb_qc_show_constraint_record(state, constraint_record, NIL, UNPROVIDED);
                    }
                }
            }
            if (NIL != cb_qc_show_cycl_p()) {
                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ($str_alt41$Query_Cycl_);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_newline(UNPROVIDED);
                cb_qc_show_cycl(rkf_query_constructor.qc_query_cycl(query));
            }
        }
        return NIL;
    }

    public static final SubLObject cb_qc_show_indexical_record(SubLObject state, SubLObject indexical_record, SubLObject offer_dont_tell, SubLObject offer_tell, SubLObject offer_assume, SubLObject offer_dont_assume) {
        if (offer_dont_tell == UNPROVIDED) {
            offer_dont_tell = NIL;
        }
        if (offer_tell == UNPROVIDED) {
            offer_tell = NIL;
        }
        if (offer_assume == UNPROVIDED) {
            offer_assume = NIL;
        }
        if (offer_dont_assume == UNPROVIDED) {
            offer_dont_assume = NIL;
        }
        {
            SubLObject phrase = rkf_scenario_manipulator.sm_indexical_record_preferred_phrase(indexical_record);
            html_utilities.html_newline(UNPROVIDED);
            if (NIL != cb_qc_show_cycl_p()) {
                {
                    SubLObject cycl = rkf_scenario_manipulator.sm_indexical_record_indexical(indexical_record);
                    html_utilities.html_newline(UNPROVIDED);
                    html_utilities.html_indent(SIX_INTEGER);
                    cb_qc_show_cycl(cycl);
                }
            }
            html_utilities.html_newline(UNPROVIDED);
            html_utilities.html_indent(SIX_INTEGER);
            html_utilities.html_princ(phrase);
            if (NIL != offer_dont_tell) {
                html_utilities.html_newline(UNPROVIDED);
                html_utilities.html_indent(SIX_INTEGER);
                cb_utilities.cb_link($QC_DONT_TELL, state, indexical_record, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != offer_tell) {
                html_utilities.html_newline(UNPROVIDED);
                html_utilities.html_indent(SIX_INTEGER);
                cb_utilities.cb_link($QC_TELL, state, indexical_record, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject cb_qc_show_constraint_record(SubLObject state, SubLObject constraint_record, SubLObject offer_assume, SubLObject offer_dont_assume) {
        if (offer_assume == UNPROVIDED) {
            offer_assume = NIL;
        }
        if (offer_dont_assume == UNPROVIDED) {
            offer_dont_assume = NIL;
        }
        {
            SubLObject text = rkf_scenario_manipulator.sm_constraint_record_nl_sentence(constraint_record);
            html_utilities.html_newline(UNPROVIDED);
            if (NIL != cb_qc_show_cycl_p()) {
                {
                    SubLObject cycl = rkf_scenario_manipulator.sm_constraint_record_sentence(constraint_record);
                    html_utilities.html_newline(UNPROVIDED);
                    html_utilities.html_indent(SIX_INTEGER);
                    cb_qc_show_cycl(cycl);
                }
            }
            html_utilities.html_newline(UNPROVIDED);
            html_utilities.html_indent(SIX_INTEGER);
            html_utilities.html_markup(text);
            if (NIL != offer_assume) {
                html_utilities.html_newline(UNPROVIDED);
                html_utilities.html_indent(SIX_INTEGER);
                cb_utilities.cb_link($QC_ASSUME_CONSTRAINT, state, constraint_record, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != offer_dont_assume) {
                html_utilities.html_newline(UNPROVIDED);
                html_utilities.html_indent(SIX_INTEGER);
                cb_utilities.cb_link($QC_DONT_ASSUME_CONSTRAINT, state, constraint_record, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_qc_show_candidate_queries(SubLObject state, SubLObject allow_edit) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject candidates = rkf_query_constructor.qc_state_candidates(state);
                SubLObject active = rkf_query_constructor.qc_state_query(state);
                SubLObject bgcolor = cb_qc_context_color($CANDIDATES);
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
                    html_utilities.html_markup($str_alt27$20_);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (NIL != candidates) {
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ($$$Other_Candidate_Queries);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        } else {
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ($$$No_Candidate_Queries);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
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

    public static final SubLObject cb_link_qc_done(SubLObject state, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt30$_Use_This_Query_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt51$cb_qc_done__A, rkf_query_constructor.qc_state_id(state));
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

    public static final SubLObject cb_qc_done(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject state_id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt15);
            state_id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_query_constructor.qc_find_state_by_id_string(state_id_string);
                    SubLObject interaction = rkf_query_constructor.qc_state_interaction(state);
                    SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                    SubLObject query = rkf_query_constructor.qc_state_query(state);
                    user_interaction_agenda.uia_act_complete(v_agenda, interaction, query);
                    return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt15);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_qc_edit_scenario(SubLObject state, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt32$_Edit_Query_Scenario_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt54$cb_qc_edit_scenario__A, rkf_query_constructor.qc_state_id(state));
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

    public static final SubLObject cb_qc_edit_scenario(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject state_id_string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt15);
                state_id_string = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject state = rkf_query_constructor.qc_find_state_by_id_string(state_id_string);
                        SubLObject interaction = rkf_query_constructor.qc_state_interaction(state);
                        SubLObject query = rkf_query_constructor.qc_state_query(state);
                        SubLObject v_scenario = rkf_query_constructor.qc_query_scenario(query);
                        if (NIL != user_interaction_agenda.user_interaction_p(interaction)) {
                            {
                                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                                SubLObject scenario_constructor_action = uia_tools_wizards.uia_act_new_scenario_constructor(v_agenda, NIL, $REQUIRED, v_scenario);
                                user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, scenario_constructor_action);
                                return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                            }
                        }
                        {
                            SubLObject interaction_7 = rkf_query_constructor.qc_state_interaction(state);
                            if (NIL != user_interaction_agenda.user_interaction_p(interaction_7)) {
                                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                                cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction_7);
                                if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction_7)) {
                                    html_script_utilities.html_js_focus_window();
                                }
                                cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction_7));
                                html_utilities.html_princ($str_alt57$Sorry__editing_the_query_scenario);
                                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } else {
                                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                                {
                                    SubLObject bgcolor = cb_qc_context_color($BACKGROUND);
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
                                                SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_princ($str_alt57$Sorry__editing_the_query_scenario);
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
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
                    cdestructuring_bind_error(datum, $list_alt15);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_qc_dont_tell(SubLObject state, SubLObject indexical_record, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt59$_Don_t_Tell_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt60$cb_qc_dont_tell__A__A, rkf_query_constructor.qc_state_id(state), rkf_scenario_manipulator.sm_indexical_record_id(indexical_record));
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

    public static final SubLObject cb_qc_dont_tell(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject state_id_string = NIL;
            SubLObject ir_id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt62);
            state_id_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt62);
            ir_id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_query_constructor.qc_find_state_by_id_string(state_id_string);
                    SubLObject v_term = rkf_scenario_manipulator.sm_find_indexical_record_by_id_string(ir_id_string);
                    rkf_query_constructor.qc_act_register_dont_care(state, v_term);
                    return cb_qc_show_state_guts(state);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt62);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_qc_tell(SubLObject state, SubLObject indexical_record, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt64$_Tell_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt65$cb_qc_tell__A__A, rkf_query_constructor.qc_state_id(state), rkf_scenario_manipulator.sm_indexical_record_id(indexical_record));
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

    public static final SubLObject cb_qc_tell(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject state_id_string = NIL;
            SubLObject ir_id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt62);
            state_id_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt62);
            ir_id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_query_constructor.qc_find_state_by_id_string(state_id_string);
                    SubLObject v_term = rkf_scenario_manipulator.sm_find_indexical_record_by_id_string(ir_id_string);
                    rkf_query_constructor.qc_act_deregister_dont_care(state, v_term);
                    return cb_qc_show_state_guts(state);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt62);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_qc_assume(SubLObject state, SubLObject indexical_record, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt68$_Assume_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt69$cb_qc_assume__A__A, rkf_query_constructor.qc_state_id(state), rkf_scenario_manipulator.sm_indexical_record_id(indexical_record));
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

    public static final SubLObject cb_qc_assume(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject state_id_string = NIL;
            SubLObject ir_id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt62);
            state_id_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt62);
            ir_id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_query_constructor.qc_find_state_by_id_string(state_id_string);
                    SubLObject v_term = rkf_scenario_manipulator.sm_find_indexical_record_by_id_string(ir_id_string);
                    rkf_query_constructor.qc_act_register_assumed_term(state, v_term);
                    return cb_qc_show_state_guts(state);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt62);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_qc_dont_assume(SubLObject state, SubLObject indexical_record, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt73$_Don_t_Assume_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt74$cb_qc_dont_assume__A__A, rkf_query_constructor.qc_state_id(state), rkf_scenario_manipulator.sm_indexical_record_id(indexical_record));
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

    public static final SubLObject cb_qc_dont_assume(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject state_id_string = NIL;
            SubLObject ir_id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt62);
            state_id_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt62);
            ir_id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_query_constructor.qc_find_state_by_id_string(state_id_string);
                    SubLObject v_term = rkf_scenario_manipulator.sm_find_indexical_record_by_id_string(ir_id_string);
                    rkf_query_constructor.qc_act_deregister_assumed_term(state, v_term);
                    return cb_qc_show_state_guts(state);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt62);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_qc_assume_constraint(SubLObject state, SubLObject constraint_record, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt68$_Assume_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt78$cb_qc_assume_constraint__A__A, rkf_query_constructor.qc_state_id(state), rkf_scenario_manipulator.sm_constraint_record_id(constraint_record));
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

    public static final SubLObject cb_qc_assume_constraint(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject state_id_string = NIL;
            SubLObject cr_id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt80);
            state_id_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt80);
            cr_id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_query_constructor.qc_find_state_by_id_string(state_id_string);
                    SubLObject constraint_record = rkf_scenario_manipulator.sm_find_constraint_record_by_id_string(cr_id_string);
                    rkf_query_constructor.qc_act_register_assumed_constraint(state, constraint_record);
                    return cb_qc_show_state_guts(state);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt80);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_qc_dont_assume_constraint(SubLObject state, SubLObject constraint_record, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt73$_Don_t_Assume_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt82$cb_qc_dont_assume_constraint__A__, rkf_query_constructor.qc_state_id(state), rkf_scenario_manipulator.sm_constraint_record_id(constraint_record));
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

    public static final SubLObject cb_qc_dont_assume_constraint(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject state_id_string = NIL;
            SubLObject cr_id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt80);
            state_id_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt80);
            cr_id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_query_constructor.qc_find_state_by_id_string(state_id_string);
                    SubLObject constraint_record = rkf_scenario_manipulator.sm_find_constraint_record_by_id_string(cr_id_string);
                    rkf_query_constructor.qc_act_deregister_assumed_constraint(state, constraint_record);
                    return cb_qc_show_state_guts(state);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt80);
            }
        }
        return NIL;
    }

    public static final SubLObject declare_cb_query_constructor_file() {
        declareFunction("cb_qc_show_cycl_p", "CB-QC-SHOW-CYCL-P", 0, 0, false);
        declareMacro("cb_qc_body", "CB-QC-BODY");
        declareMacro("cb_qc_document", "CB-QC-DOCUMENT");
        declareFunction("cb_qc_show_cycl", "CB-QC-SHOW-CYCL", 1, 0, false);
        declareFunction("cb_qc_context_color", "CB-QC-CONTEXT-COLOR", 1, 0, false);
        declareFunction("cb_qc_show_state", "CB-QC-SHOW-STATE", 0, 1, false);
        declareFunction("cb_link_qc_state", "CB-LINK-QC-STATE", 1, 1, false);
        declareFunction("cb_qc_show_state_guts", "CB-QC-SHOW-STATE-GUTS", 1, 0, false);
        declareFunction("cb_qc_show_query_actions", "CB-QC-SHOW-QUERY-ACTIONS", 1, 0, false);
        declareFunction("cb_qc_show_query", "CB-QC-SHOW-QUERY", 3, 0, false);
        declareFunction("cb_qc_show_yes_no_query", "CB-QC-SHOW-YES-NO-QUERY", 2, 1, false);
        declareFunction("cb_qc_show_indexical_record", "CB-QC-SHOW-INDEXICAL-RECORD", 2, 4, false);
        declareFunction("cb_qc_show_constraint_record", "CB-QC-SHOW-CONSTRAINT-RECORD", 2, 2, false);
        declareFunction("cb_qc_show_candidate_queries", "CB-QC-SHOW-CANDIDATE-QUERIES", 2, 0, false);
        declareFunction("cb_link_qc_done", "CB-LINK-QC-DONE", 1, 1, false);
        declareFunction("cb_qc_done", "CB-QC-DONE", 1, 0, false);
        declareFunction("cb_link_qc_edit_scenario", "CB-LINK-QC-EDIT-SCENARIO", 1, 1, false);
        declareFunction("cb_qc_edit_scenario", "CB-QC-EDIT-SCENARIO", 1, 0, false);
        declareFunction("cb_link_qc_dont_tell", "CB-LINK-QC-DONT-TELL", 2, 1, false);
        declareFunction("cb_qc_dont_tell", "CB-QC-DONT-TELL", 1, 0, false);
        declareFunction("cb_link_qc_tell", "CB-LINK-QC-TELL", 2, 1, false);
        declareFunction("cb_qc_tell", "CB-QC-TELL", 1, 0, false);
        declareFunction("cb_link_qc_assume", "CB-LINK-QC-ASSUME", 2, 1, false);
        declareFunction("cb_qc_assume", "CB-QC-ASSUME", 1, 0, false);
        declareFunction("cb_link_qc_dont_assume", "CB-LINK-QC-DONT-ASSUME", 2, 1, false);
        declareFunction("cb_qc_dont_assume", "CB-QC-DONT-ASSUME", 1, 0, false);
        declareFunction("cb_link_qc_assume_constraint", "CB-LINK-QC-ASSUME-CONSTRAINT", 2, 1, false);
        declareFunction("cb_qc_assume_constraint", "CB-QC-ASSUME-CONSTRAINT", 1, 0, false);
        declareFunction("cb_link_qc_dont_assume_constraint", "CB-LINK-QC-DONT-ASSUME-CONSTRAINT", 2, 1, false);
        declareFunction("cb_qc_dont_assume_constraint", "CB-QC-DONT-ASSUME-CONSTRAINT", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_query_constructor_file() {
        deflexical("*CB-QC-CONTEXT-COLOR-MAP*", $list_alt14);
        return NIL;
    }

    public static final SubLObject setup_cb_query_constructor_file() {
                html_macros.note_html_handler_function(CB_QC_SHOW_STATE);
        cb_utilities.setup_cb_link_method($QC_STATE, CB_LINK_QC_STATE, TWO_INTEGER);
        cb_utilities.setup_cb_link_method($QC_DONE, CB_LINK_QC_DONE, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_QC_DONE);
        cb_utilities.setup_cb_link_method($QC_EDIT_SCENARIO, CB_LINK_QC_EDIT_SCENARIO, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_QC_EDIT_SCENARIO);
        cb_utilities.setup_cb_link_method($QC_DONT_TELL, CB_LINK_QC_DONT_TELL, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_QC_DONT_TELL);
        cb_utilities.setup_cb_link_method($QC_TELL, CB_LINK_QC_TELL, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_QC_TELL);
        cb_utilities.setup_cb_link_method($QC_ASSUME, CB_LINK_QC_ASSUME, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_QC_ASSUME);
        cb_utilities.setup_cb_link_method($QC_DONT_ASSUME, CB_LINK_QC_DONT_ASSUME, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_QC_DONT_ASSUME);
        cb_utilities.setup_cb_link_method($QC_ASSUME_CONSTRAINT, CB_LINK_QC_ASSUME_CONSTRAINT, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_QC_ASSUME_CONSTRAINT);
        cb_utilities.setup_cb_link_method($QC_DONT_ASSUME_CONSTRAINT, CB_LINK_QC_DONT_ASSUME_CONSTRAINT, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_QC_DONT_ASSUME_CONSTRAINT);
        return NIL;
    }

    // // Internal Constants
    static private final SubLSymbol $sym0$BGCOLOR = makeUninternedSymbol("BGCOLOR");



    static private final SubLList $list_alt2 = list(list(makeSymbol("CB-QC-CONTEXT-COLOR"), makeKeyword("BACKGROUND")));







    static private final SubLList $list_alt6 = list(list(makeSymbol("STATE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym7$INTERACTION = makeUninternedSymbol("INTERACTION");

    private static final SubLSymbol QC_STATE_INTERACTION = makeSymbol("QC-STATE-INTERACTION");







    private static final SubLSymbol CB_UIAT_DISPLAY_BODY = makeSymbol("CB-UIAT-DISPLAY-BODY");

    private static final SubLSymbol CB_QC_BODY = makeSymbol("CB-QC-BODY");

    static private final SubLList $list_alt14 = list(list(makeKeyword("BACKGROUND"), makeString("#cfcfcf")), list(makeKeyword("QUERY-ACTIONS"), makeString("#ffcfcf")), list(makeKeyword("ACTIVE-QUERY"), makeString("#cfffcf")), list(makeKeyword("CANDIDATES"), makeString("#cfcfff")));

    static private final SubLList $list_alt15 = list(makeSymbol("STATE-ID-STRING"));

    private static final SubLSymbol CB_QC_SHOW_STATE = makeSymbol("CB-QC-SHOW-STATE");

    static private final SubLString $str_alt17$_Show_QC_State_ = makeString("[Show QC State]");



    static private final SubLString $str_alt19$cb_qc_show_state__A = makeString("cb-qc-show-state&~A");

    private static final SubLSymbol $QC_STATE = makeKeyword("QC-STATE");

    private static final SubLSymbol CB_LINK_QC_STATE = makeSymbol("CB-LINK-QC-STATE");

    static private final SubLString $str_alt22$90_ = makeString("90%");



    private static final SubLSymbol $QUERY_ACTIONS = makeKeyword("QUERY-ACTIONS");





    static private final SubLString $str_alt27$20_ = makeString("20%");

    static private final SubLString $$$Query_State = makeString("Query State");

    private static final SubLSymbol $QC_DONE = makeKeyword("QC-DONE");

    static private final SubLString $str_alt30$_Use_This_Query_ = makeString("[Use This Query]");

    private static final SubLSymbol $QC_EDIT_SCENARIO = makeKeyword("QC-EDIT-SCENARIO");

    static private final SubLString $str_alt32$_Edit_Query_Scenario_ = makeString("[Edit Query Scenario]");

    private static final SubLSymbol $ACTIVE_QUERY = makeKeyword("ACTIVE-QUERY");

    static private final SubLString $$$Current_Query = makeString("Current Query");

    static private final SubLString $str_alt35$Assuming_the_existence_of_ = makeString("Assuming the existence of:");

    static private final SubLString $$$Where = makeString("Where");

    static private final SubLString $str_alt37$Find_and_Tell_me_about_ = makeString("Find and Tell me about:");

    static private final SubLString $str_alt38$Find_ = makeString("Find:");

    static private final SubLString $str_alt39$Tell_me_about_ = makeString("Tell me about:");

    static private final SubLString $str_alt40$Where_ = makeString("Where:");

    static private final SubLString $str_alt41$Query_Cycl_ = makeString("Query Cycl:");

    static private final SubLString $$$No_current_query = makeString("No current query");

    static private final SubLString $str_alt43$Tell_me_whether_or_not_ = makeString("Tell me whether or not:");

    private static final SubLSymbol $QC_DONT_TELL = makeKeyword("QC-DONT-TELL");

    private static final SubLSymbol $QC_TELL = makeKeyword("QC-TELL");

    private static final SubLSymbol $QC_ASSUME_CONSTRAINT = makeKeyword("QC-ASSUME-CONSTRAINT");

    private static final SubLSymbol $QC_DONT_ASSUME_CONSTRAINT = makeKeyword("QC-DONT-ASSUME-CONSTRAINT");



    static private final SubLString $$$Other_Candidate_Queries = makeString("Other Candidate Queries");

    static private final SubLString $$$No_Candidate_Queries = makeString("No Candidate Queries");

    static private final SubLString $str_alt51$cb_qc_done__A = makeString("cb-qc-done&~A");

    private static final SubLSymbol CB_LINK_QC_DONE = makeSymbol("CB-LINK-QC-DONE");

    private static final SubLSymbol CB_QC_DONE = makeSymbol("CB-QC-DONE");

    static private final SubLString $str_alt54$cb_qc_edit_scenario__A = makeString("cb-qc-edit-scenario&~A");

    private static final SubLSymbol CB_LINK_QC_EDIT_SCENARIO = makeSymbol("CB-LINK-QC-EDIT-SCENARIO");



    static private final SubLString $str_alt57$Sorry__editing_the_query_scenario = makeString("Sorry, editing the query scenario is not supported outside the User Interaction framework at this time.");

    private static final SubLSymbol CB_QC_EDIT_SCENARIO = makeSymbol("CB-QC-EDIT-SCENARIO");

    static private final SubLString $str_alt59$_Don_t_Tell_ = makeString("[Don't Tell]");

    static private final SubLString $str_alt60$cb_qc_dont_tell__A__A = makeString("cb-qc-dont-tell&~A&~A");

    private static final SubLSymbol CB_LINK_QC_DONT_TELL = makeSymbol("CB-LINK-QC-DONT-TELL");

    static private final SubLList $list_alt62 = list(makeSymbol("STATE-ID-STRING"), makeSymbol("IR-ID-STRING"));

    private static final SubLSymbol CB_QC_DONT_TELL = makeSymbol("CB-QC-DONT-TELL");

    static private final SubLString $str_alt64$_Tell_ = makeString("[Tell]");

    static private final SubLString $str_alt65$cb_qc_tell__A__A = makeString("cb-qc-tell&~A&~A");

    private static final SubLSymbol CB_LINK_QC_TELL = makeSymbol("CB-LINK-QC-TELL");

    private static final SubLSymbol CB_QC_TELL = makeSymbol("CB-QC-TELL");

    static private final SubLString $str_alt68$_Assume_ = makeString("[Assume]");

    static private final SubLString $str_alt69$cb_qc_assume__A__A = makeString("cb-qc-assume&~A&~A");

    private static final SubLSymbol $QC_ASSUME = makeKeyword("QC-ASSUME");

    private static final SubLSymbol CB_LINK_QC_ASSUME = makeSymbol("CB-LINK-QC-ASSUME");

    private static final SubLSymbol CB_QC_ASSUME = makeSymbol("CB-QC-ASSUME");

    static private final SubLString $str_alt73$_Don_t_Assume_ = makeString("[Don't Assume]");

    static private final SubLString $str_alt74$cb_qc_dont_assume__A__A = makeString("cb-qc-dont-assume&~A&~A");

    private static final SubLSymbol $QC_DONT_ASSUME = makeKeyword("QC-DONT-ASSUME");

    private static final SubLSymbol CB_LINK_QC_DONT_ASSUME = makeSymbol("CB-LINK-QC-DONT-ASSUME");

    private static final SubLSymbol CB_QC_DONT_ASSUME = makeSymbol("CB-QC-DONT-ASSUME");

    static private final SubLString $str_alt78$cb_qc_assume_constraint__A__A = makeString("cb-qc-assume-constraint&~A&~A");

    private static final SubLSymbol CB_LINK_QC_ASSUME_CONSTRAINT = makeSymbol("CB-LINK-QC-ASSUME-CONSTRAINT");

    static private final SubLList $list_alt80 = list(makeSymbol("STATE-ID-STRING"), makeSymbol("CR-ID-STRING"));

    private static final SubLSymbol CB_QC_ASSUME_CONSTRAINT = makeSymbol("CB-QC-ASSUME-CONSTRAINT");

    static private final SubLString $str_alt82$cb_qc_dont_assume_constraint__A__ = makeString("cb-qc-dont-assume-constraint&~A&~A");

    private static final SubLSymbol CB_LINK_QC_DONT_ASSUME_CONSTRAINT = makeSymbol("CB-LINK-QC-DONT-ASSUME-CONSTRAINT");

    private static final SubLSymbol CB_QC_DONT_ASSUME_CONSTRAINT = makeSymbol("CB-QC-DONT-ASSUME-CONSTRAINT");

    // // Initializers
    public void declareFunctions() {
        declare_cb_query_constructor_file();
    }

    public void initializeVariables() {
        init_cb_query_constructor_file();
    }

    public void runTopLevelForms() {
        setup_cb_query_constructor_file();
    }
}

