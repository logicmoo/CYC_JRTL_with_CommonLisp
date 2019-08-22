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
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.elt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.parse_integer;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

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
 *  module:      CB-SOLUTION-FINDER
 *  source file: /cyc/top/cycl/cb-solution-finder.lisp
 *  created:     2019/07/03 17:38:12
 */
public final class cb_solution_finder extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_solution_finder() {
    }

    public static final SubLFile me = new cb_solution_finder();

    public static final String myName = "com.cyc.cycjava.cycl.cb_solution_finder";

    // // Definitions
    public static final SubLObject cb_sf_show_cycl_p() {
        return cb_user_interaction_agenda.$cb_uia_show_cyclP$.getGlobalValue();
    }

    public static final SubLObject cb_sf_body(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            SubLObject bgcolor = $sym0$BGCOLOR;
            return list(CLET, list(bq_cons(bgcolor, $list_alt2)), list(HTML_FANCY_BODY, list($SHOW_COPYRIGHT, NIL, $BACKGROUND_COLOR, bgcolor), bq_cons(CB_UIAT_WITH_HOVEROVER_SUPPORT, append(body, NIL))));
        }
    }

    public static final SubLObject cb_sf_document(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject state = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt7);
                    state = current.first();
                    current = current.rest();
                    {
                        SubLObject visibility = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt7);
                        current = current.rest();
                        {
                            SubLObject hoverover = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                            destructuring_bind_must_listp(current, datum, $list_alt7);
                            current = current.rest();
                            if (NIL == current) {
                                current = temp;
                                {
                                    SubLObject body = current;
                                    SubLObject interaction = $sym8$INTERACTION;
                                    return list(CLET, list(list(interaction, list(SF_STATE_INTERACTION, state))), list(PIF, list(USER_INTERACTION_P, interaction), list(HTML_DOCUMENT, list(HTML_HEAD, $list_alt14, listS(PWHEN, visibility, $list_alt16), listS(PWHEN, hoverover, $list_alt17)), list(HTML_BODY, listS(CB_UIAT_DISPLAY_BODY, list(interaction), append(body, NIL)))), list(HTML_DOCUMENT, list(HTML_HEAD, $list_alt14, listS(PWHEN, visibility, $list_alt16), listS(PWHEN, hoverover, $list_alt17)), bq_cons(CB_SF_BODY, append(body, NIL)))));
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt7);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_sf_results_page(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt21);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject state = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt21);
                    state = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CB_SF_DOCUMENT, bq_cons(state, $list_alt23), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt21);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Display one value returned for a variable.
     */
    public static final SubLObject cb_sf_show_variable_binding(SubLObject binding) {
        {
            SubLObject datum = binding;
            SubLObject current = datum;
            SubLObject var = NIL;
            SubLObject ans = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt24);
            var = current.first();
            current = current.rest();
            ans = current;
            if (NIL != cb_sf_show_cycl_p()) {
                cb_sf_show_cycl(ans);
                html_utilities.html_newline(UNPROVIDED);
            }
            if (NIL != cycl_grammar.cycl_sentence_p(ans)) {
                cb_uia_display_primitives.cb_uia_show_sentence(ans, UNPROVIDED);
            } else {
                cb_uia_display_primitives.cb_uia_show_term(ans, UNPROVIDED);
            }
        }
        return binding;
    }

    public static final SubLObject cb_sf_show_cycl(SubLObject cycl) {
        return cb_utilities.cb_form(cycl, ZERO_INTEGER, T);
    }

    // deflexical
    private static final SubLSymbol $cb_sf_context_color_map$ = makeSymbol("*CB-SF-CONTEXT-COLOR-MAP*");

    public static final SubLObject cb_sf_context_color(SubLObject v_context) {
        return second(assoc(v_context, $cb_sf_context_color_map$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject cb_sf_show_state(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject state_id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt26);
            state_id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_solution_finder.sf_find_state_by_id_string(state_id_string);
                    return cb_sf_show_state_guts(state);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt26);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_sf_state(SubLObject state, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt28$_Show_SF_State_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt30$cb_sf_show_state__A, rkf_solution_finder.sf_state_id(state));
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

    public static final SubLObject cb_sf_show_state_guts(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject interaction = rkf_solution_finder.sf_state_interaction(state);
                if (NIL != user_interaction_agenda.user_interaction_p(interaction)) {
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    dhtml_macros.dhtml_with_dom_script();
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != color_value) {
                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(color_value));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_1 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
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
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup($str_alt33$90_);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_sf_show_actions(state);
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
                                                        cb_sf_show_resource_settings(state);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_sf_show_results(state);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_1, thread);
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
                } else {
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    dhtml_macros.dhtml_with_dom_script();
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject bgcolor = cb_sf_context_color($BACKGROUND);
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
                                    SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                            html_script_utilities.cb_hoverover_page_init();
                                        }
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
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup($str_alt33$90_);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_sf_show_actions(state);
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
                                                        cb_sf_show_resource_settings(state);
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
                                                        cb_sf_show_results(state);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
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

    public static final SubLObject cb_sf_show_actions(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject bgcolor = cb_sf_context_color($SF_ACTIONS);
                SubLObject text = rkf_solution_finder.sf_state_text(state);
                SubLObject query = rkf_solution_finder.sf_state_query(state);
                SubLObject query_cycl = rkf_query_constructor.qc_query_cycl(query);
                SubLObject interaction = rkf_solution_finder.sf_state_interaction(state);
                SubLObject inference = rkf_solution_finder.sf_state_inference(state);
                SubLObject pros_cons = rkf_solution_finder.sf_state_pros_cons(state);
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
                    html_utilities.html_markup($str_alt38$20_);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (NIL == user_interaction_agenda.user_interaction_p(interaction)) {
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            cb_utilities.cb_link($SF_STATE, state, $$$Solution_Finder, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_newline(UNPROVIDED);
                        }
                        if (NIL != text) {
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ($str_alt40$Find_answers_for_);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_newline(UNPROVIDED);
                            html_utilities.html_indent(TWO_INTEGER);
                            html_utilities.html_princ(text);
                            html_utilities.html_newline(TWO_INTEGER);
                            html_utilities.html_princ($str_alt41$This_query_was_understood_by_Cyc_);
                            html_utilities.html_newline(UNPROVIDED);
                            html_utilities.html_indent(TWO_INTEGER);
                            cb_uia_display_primitives.cb_uia_show_query_with_clarifying_link(query_cycl, UNPROVIDED);
                        }
                        html_utilities.html_newline(UNPROVIDED);
                        cb_utilities.cb_link($SF_DONE, state, (NIL != inference) || (NIL != pros_cons) ? ((SubLObject) ($str_alt43$_Done_)) : $str_alt44$_Forget_it_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if ((NIL != inference) || (NIL != pros_cons)) {
                            html_utilities.html_indent(TWO_INTEGER);
                            html_utilities.html_princ($str_alt45$_Add_to_Test_Suite_);
                            if (NIL != cb_sf_show_query_critiquer_p(state)) {
                                html_utilities.html_indent(TWO_INTEGER);
                                cb_utilities.cb_link($UIAEXT_CRITICIZE_QUERY, rkf_solution_finder.sf_state_interaction(state), state, $str_alt47$_Ask_ISI_WhyNot_Critiquer_, UNPROVIDED, UNPROVIDED);
                            }
                        } else {
                            {
                                SubLObject interaction_11 = rkf_solution_finder.sf_state_interaction(state);
                                SubLObject cycl_query = user_interaction_agenda.ui_state_lookup(interaction_11, $SF_CYCL, UNPROVIDED);
                                if (NIL != cycl_query) {
                                    html_utilities.html_indent(TWO_INTEGER);
                                    cb_utilities.cb_link($UIAT_ADD_UNTRIED_QUERY_TO_TSUITE, state, cycl_query, $str_alt50$_Add_Untried_Query_to_Test_Suite_, UNPROVIDED, UNPROVIDED);
                                }
                            }
                        }
                        {
                            SubLObject query_12 = rkf_solution_finder.sf_state_query(state);
                            SubLObject v_scenario = (NIL != query_12) ? ((SubLObject) (rkf_query_constructor.qc_query_scenario(query_12))) : NIL;
                            if (NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario)) {
                                html_utilities.html_indent(TWO_INTEGER);
                                cb_utilities.cb_link($SF_EDIT_QUERY, state, $str_alt52$_Edit_Query_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
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

    public static final SubLObject cb_sf_show_query_critiquer_p(SubLObject state) {
        {
            SubLObject inference = rkf_solution_finder.sf_state_inference(state);
            SubLObject solution_queue = rkf_solution_finder.sf_state_solution_queue(state);
            SubLObject pros_cons = rkf_solution_finder.sf_state_pros_cons(state);
            if ((NIL != inference) && (NIL != queues.queue_empty_p(solution_queue))) {
                return cb_uia_collaborators.is_isi_why_not_query_critiquer_availableP();
            } else
                if (pros_cons.equal($list_alt53)) {
                    return cb_uia_collaborators.is_isi_why_not_query_critiquer_availableP();
                } else {
                    return NIL;
                }

        }
    }

    public static final SubLObject cb_sf_show_results(SubLObject state) {
        {
            SubLObject solution_queue = rkf_solution_finder.sf_state_solution_queue(state);
            SubLObject pros_cons = rkf_solution_finder.sf_state_pros_cons(state);
            SubLObject inference = rkf_solution_finder.sf_state_inference(state);
            if (NIL != pros_cons) {
                return cb_sf_show_yes_no_results(state);
            }
            if (NIL != queues.queue_empty_p(solution_queue)) {
                if (NIL != inference) {
                    return cb_sf_show_no_results(state);
                } else {
                    return cb_sf_show_not_yet_attempted(state);
                }
            } else {
                return cb_sf_show_results_so_far(state);
            }
        }
    }

    public static final SubLObject cb_sf_show_yes_no_results(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = rkf_solution_finder.sf_state_pros_cons(state);
                SubLObject current = datum;
                SubLObject pros = NIL;
                SubLObject cons = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt54);
                pros = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt54);
                cons = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject bgcolor = cb_sf_context_color($SF_RESULTS);
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
                            html_utilities.html_markup($str_alt38$20_);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt56$Results_);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                if (pros.eql($TAUTOLOGY)) {
                                    html_utilities.html_newline(TWO_INTEGER);
                                    cb_sf_show_halt_reason($TAUTOLOGY);
                                } else {
                                    if (NIL != rkf_solution_finder.sf_state_try_again_p(state)) {
                                        html_utilities.html_newline(TWO_INTEGER);
                                        cb_utilities.cb_link($SF_TRY_AGAIN, state, $str_alt59$_Try_Again_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                    html_utilities.html_newline(TWO_INTEGER);
                                    {
                                        SubLObject text = rkf_solution_finder.sf_state_text(state);
                                        if (NIL != string_utilities.ends_with(text, $str_alt60$_, UNPROVIDED)) {
                                            html_utilities.html_princ($str_alt61$Is_it_true_that_);
                                            html_utilities.html_newline(UNPROVIDED);
                                            html_utilities.html_indent(FIVE_INTEGER);
                                        }
                                        html_utilities.html_princ(text);
                                        html_utilities.html_newline(UNPROVIDED);
                                    }
                                    if (NIL != pros) {
                                        if (NIL != cons) {
                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_utilities.html_princ($str_alt62$Unknown_);
                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            html_utilities.html_princ($str_alt63$__there_are_arguments_pro_and_con);
                                            html_utilities.html_newline(UNPROVIDED);
                                            cb_utilities.cb_link($SF_YES_NO_EXPLAIN, state, $str_alt65$_Explain_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else {
                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_utilities.html_princ($str_alt66$Yes_);
                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            html_utilities.html_newline(UNPROVIDED);
                                            cb_utilities.cb_link($SF_YES_NO_EXPLAIN, state, $str_alt65$_Explain_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    } else {
                                        if (NIL != cons) {
                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_utilities.html_princ($str_alt67$No_);
                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            html_utilities.html_newline(UNPROVIDED);
                                            cb_utilities.cb_link($SF_YES_NO_EXPLAIN, state, $str_alt65$_Explain_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else {
                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_utilities.html_princ($str_alt62$Unknown_);
                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            html_utilities.html_princ($str_alt68$__there_is_no_evidence_either_way);
                                        }
                                    }
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt54);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_sf_show_halt_reason(SubLObject halt_reason) {
        html_utilities.html_newline(UNPROVIDED);
        html_utilities.html_princ($str_alt69$The_search_stopped_because_);
        {
            SubLObject pcase_var = halt_reason;
            if (pcase_var.eql($TOO_EXPENSIVE)) {
                html_utilities.html_princ($str_alt71$it_is_too_costly_to_perform_);
            } else
                if (pcase_var.eql($EXHAUST_TOTAL)) {
                    html_utilities.html_princ($str_alt73$all_possible_sources_have_been_se);
                } else
                    if (pcase_var.eql($MAX_NUMBER)) {
                        html_utilities.html_princ($str_alt75$the_specified_number_of_solutions);
                    } else
                        if (pcase_var.eql($MAX_TIME)) {
                            html_utilities.html_princ($str_alt77$it_ran_out_of_time_);
                        } else
                            if (pcase_var.eql($EXHAUST)) {
                                html_utilities.html_princ($str_alt79$the_limit_on_effort_was_reached_);
                            } else
                                if (pcase_var.eql($TAUTOLOGY)) {
                                    html_utilities.html_princ($str_alt80$the_assumptions_were_not_consiste);
                                }





        }
        return NIL;
    }

    public static final SubLObject cb_sf_show_no_results(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject bgcolor = cb_sf_context_color($SF_RESULTS);
                SubLObject halt_reason = rkf_solution_finder.sf_state_halt_reason(state);
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
                    html_utilities.html_markup($str_alt38$20_);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ($str_alt81$No_solutions_have_been_found_);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_utilities.html_newline(TWO_INTEGER);
                        cb_sf_show_halt_reason(halt_reason);
                        if (NIL != rkf_solution_finder.sf_state_keep_looking_p(state)) {
                            html_utilities.html_newline(TWO_INTEGER);
                            cb_utilities.cb_link($SF_RESUME, state, $str_alt83$_Keep_Looking_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        if (NIL != rkf_solution_finder.sf_state_try_again_p(state)) {
                            html_utilities.html_newline(TWO_INTEGER);
                            cb_utilities.cb_link($SF_TRY_AGAIN, state, $str_alt59$_Try_Again_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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

    public static final SubLObject cb_sf_show_not_yet_attempted(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject bgcolor = cb_sf_context_color($SF_RESULTS);
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
                    html_utilities.html_markup($str_alt38$20_);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_princ($str_alt84$The_query_has_not_yet_been_attemp);
                        html_utilities.html_newline(TWO_INTEGER);
                        cb_utilities.cb_link($SF_FIND_SOLUTIONS, state, $str_alt86$_Try_This_Query_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_sf_show_results_so_far(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject bgcolor = cb_sf_context_color($SF_RESULTS);
                SubLObject solution_queue = rkf_solution_finder.sf_state_solution_queue(state);
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
                    html_utilities.html_markup($str_alt38$20_);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ($str_alt87$Results_So_Far_);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        {
                            SubLObject solution_iterator = queues.new_queue_iterator(solution_queue);
                            SubLObject first_solution_set = queues.queue_peek(solution_queue);
                            SubLObject bgcolor2 = cb_sf_context_color($SF_RESULTS_TABLE);
                            SubLObject halt_reason = rkf_solution_finder.sf_state_halt_reason(state);
                            html_utilities.html_newline(UNPROVIDED);
                            cb_sf_show_halt_reason(halt_reason);
                            if (NIL != rkf_solution_finder.sf_state_keep_looking_p(state)) {
                                html_utilities.html_newline(ONE_INTEGER);
                                cb_utilities.cb_link($SF_RESUME, state, $str_alt83$_Keep_Looking_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            html_utilities.html_newline(TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_align$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align($LEFT));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(ONE_INTEGER);
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
                                            if (NIL != bgcolor2) {
                                                html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(bgcolor2);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_utilities.html_princ($str_alt89$Why_);
                                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            cb_sf_show_results_table_var_headings(state, rkf_solution_finder.sf_solution_set_bindings(first_solution_set), bgcolor2);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    {
                                        SubLObject done_var = NIL;
                                        while (NIL == done_var) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject solution_set = iteration.iteration_next(solution_iterator);
                                                SubLObject valid = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != valid) {
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
                                                                html_utilities.html_markup(html_utilities.html_align($LEFT));
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            if (NIL != bgcolor2) {
                                                                html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(bgcolor2);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    cb_utilities.cb_link($SF_JUST, state, solution_set, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            cb_sf_show_results_table_one_binding_set(solution_set, bgcolor2);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                }
                                                done_var = makeBoolean(NIL == valid);
                                            }
                                        } 
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
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

    public static final SubLObject cb_sf_show_results_table_var_headings(SubLObject state, SubLObject example_bindings, SubLObject bgcolor) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = example_bindings;
                SubLObject binding = NIL;
                for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                    {
                        SubLObject el_var = binding.first();
                        SubLObject query = rkf_solution_finder.sf_state_query(state);
                        SubLObject var_map = rkf_query_constructor.qc_query_var_map(query);
                        SubLObject indexical_record = second(assoc(el_var, var_map, UNPROVIDED, UNPROVIDED));
                        SubLObject phrase = rkf_scenario_manipulator.sm_indexical_record_preferred_phrase(indexical_record);
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
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ(phrase);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_sf_show_results_table_one_binding_set(SubLObject solution_set, SubLObject bgcolor) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_bindings = rkf_solution_finder.sf_solution_set_bindings(solution_set);
                SubLObject cdolist_list_var = v_bindings;
                SubLObject binding = NIL;
                for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
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
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_sf_show_variable_binding(binding);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_sf_just(SubLObject state, SubLObject solution_set, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                {
                    SubLObject number = length(rkf_solution_finder.sf_solution_set_supports(solution_set));
                    if (number.numE(ONE_INTEGER)) {
                        linktext = $str_alt91$_Show_Reason_;
                    } else {
                        linktext = format(NIL, $str_alt92$_Show_Reasons___A__, number);
                    }
                }
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt93$cb_sf_show_justification__A__A, rkf_solution_finder.sf_state_id(state), rkf_solution_finder.sf_solution_set_id(solution_set));
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

    public static final SubLObject cb_sf_show_justification(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject state_id_string = NIL;
                SubLObject ss_id_string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt95);
                state_id_string = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt95);
                ss_id_string = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject state = rkf_solution_finder.sf_find_state_by_id_string(state_id_string);
                        SubLObject solution_set = rkf_solution_finder.sf_find_solution_set_by_id_string(ss_id_string);
                        SubLObject v_bindings = rkf_solution_finder.sf_solution_set_bindings(solution_set);
                        SubLObject supports = rkf_solution_finder.sf_solution_set_supports(solution_set);
                        SubLObject bgcolor = cb_sf_context_color($SF_RESULTS);
                        SubLObject interaction = rkf_solution_finder.sf_state_interaction(state);
                        if (NIL != user_interaction_agenda.user_interaction_p(interaction)) {
                            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                            html_macros.html_head_content_type();
                            dhtml_macros.dhtml_with_dom_script();
                            if (true) {
                                dhtml_macros.dhtml_with_toggle_visibility_support();
                            }
                            if (true) {
                                if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                    html_script_utilities.cb_hoverover_page_init();
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            {
                                SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
                                {
                                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                    try {
                                        html_macros.$html_inside_bodyP$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                        if (NIL != color_value) {
                                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_color(color_value));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
                                                if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                                                    html_script_utilities.html_js_focus_window();
                                                }
                                                cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_align$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align($LEFT));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
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
                                                                    html_utilities.html_markup($str_alt38$20_);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                        html_utilities.html_princ($str_alt98$Solution_);
                                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                        html_utilities.html_newline(TWO_INTEGER);
                                                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_table_align$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(html_utilities.html_align($LEFT));
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(ONE_INTEGER);
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                {
                                                                                    SubLObject bgcolor2 = cb_sf_context_color($SF_RESULTS_TABLE);
                                                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            cb_sf_show_results_table_var_headings(state, v_bindings, bgcolor2);
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
                                                                                        }
                                                                                    }
                                                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            cb_sf_show_results_table_one_binding_set(solution_set, bgcolor2);
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                                                                                        }
                                                                                    }
                                                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                                }
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
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
                                                                    html_utilities.html_markup($str_alt38$20_);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                        html_utilities.html_princ($str_alt99$Reasons_for_this_solution_);
                                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                        cb_sf_show_arguments(supports, $PRO);
                                                                        cb_utilities.cb_link($SF_STATE, state, $str_alt101$_Back_to_Results_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                html_utilities.html_copyright_notice();
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
                        } else {
                            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                            html_macros.html_head_content_type();
                            dhtml_macros.dhtml_with_dom_script();
                            if (true) {
                                dhtml_macros.dhtml_with_toggle_visibility_support();
                            }
                            if (true) {
                                if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                    html_script_utilities.cb_hoverover_page_init();
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            {
                                SubLObject bgcolor_27 = cb_sf_context_color($BACKGROUND);
                                {
                                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                    try {
                                        html_macros.$html_inside_bodyP$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                        if (NIL != bgcolor_27) {
                                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_color(bgcolor_27));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                                    html_script_utilities.cb_hoverover_page_init();
                                                }
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_align$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align($LEFT));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
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
                                                    SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
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
                                                                    html_utilities.html_markup($str_alt38$20_);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                        html_utilities.html_princ($str_alt98$Solution_);
                                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                        html_utilities.html_newline(TWO_INTEGER);
                                                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_table_align$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(html_utilities.html_align($LEFT));
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(ONE_INTEGER);
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                {
                                                                                    SubLObject bgcolor2 = cb_sf_context_color($SF_RESULTS_TABLE);
                                                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            cb_sf_show_results_table_var_headings(state, v_bindings, bgcolor2);
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
                                                                                        }
                                                                                    }
                                                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            cb_sf_show_results_table_one_binding_set(solution_set, bgcolor2);
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
                                                                                        }
                                                                                    }
                                                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                                }
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_30, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
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
                                                                    html_utilities.html_markup($str_alt38$20_);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                        html_utilities.html_princ($str_alt99$Reasons_for_this_solution_);
                                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                        cb_sf_show_arguments(supports, $PRO);
                                                                        cb_utilities.cb_link($SF_STATE, state, $str_alt101$_Back_to_Results_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
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
                } else {
                    cdestructuring_bind_error(datum, $list_alt95);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_sf_show_support(SubLObject state, SubLObject solution_set, SubLObject support, SubLObject set_number, SubLObject support_number) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject interaction = rkf_solution_finder.sf_state_interaction(state);
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                if (NIL == uia_trampolines.uia_irrelevant_formulaP(v_agenda, arguments.support_formula(support), UNPROVIDED)) {
                    html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_uia_display_primitives.cb_uia_show_support(support, UNPROVIDED, UNPROVIDED);
                            html_utilities.html_newline(UNPROVIDED);
                            cb_utilities.cb_link($SF_SOURCE, state, solution_set, set_number, support_number, $str_alt104$_Source_);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                }
                return NIL;
            }
        }
    }

    public static final SubLObject cb_link_sf_source(SubLObject state, SubLObject solution_set, SubLObject set_number, SubLObject support_number, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt104$_Source_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt105$cb_sf_show_source__A__A__A__A, new SubLObject[]{ rkf_solution_finder.sf_state_id(state), rkf_solution_finder.sf_solution_set_id(solution_set), set_number, support_number });
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

    public static final SubLObject cb_sf_show_source(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject state_id_string = NIL;
                SubLObject ss_id_string = NIL;
                SubLObject set_num_string = NIL;
                SubLObject support_num_string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt107);
                state_id_string = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt107);
                ss_id_string = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt107);
                set_num_string = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt107);
                support_num_string = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject state = rkf_solution_finder.sf_find_state_by_id_string(state_id_string);
                        SubLObject solution_set = rkf_solution_finder.sf_find_solution_set_by_id_string(ss_id_string);
                        SubLObject set_number = parse_integer(set_num_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject support_number = parse_integer(support_num_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject supports = rkf_solution_finder.sf_solution_set_supports(solution_set);
                        SubLObject support_set = elt(supports, set_number);
                        SubLObject support = elt(support_set, support_number);
                        SubLObject interaction = rkf_solution_finder.sf_state_interaction(state);
                        if (NIL != user_interaction_agenda.user_interaction_p(interaction)) {
                            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                            html_macros.html_head_content_type();
                            dhtml_macros.dhtml_with_dom_script();
                            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            {
                                SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
                                {
                                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                    try {
                                        html_macros.$html_inside_bodyP$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                        if (NIL != color_value) {
                                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_color(color_value));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
                                                if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                                                    html_script_utilities.html_js_focus_window();
                                                }
                                                cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
                                                html_utilities.html_newline(UNPROVIDED);
                                                cb_uia_display_primitives.cb_uia_show_entire_support(support);
                                                html_utilities.html_newline(TWO_INTEGER);
                                                cb_utilities.cb_link($SF_STATE, state, $str_alt101$_Back_to_Results_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                html_utilities.html_copyright_notice();
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
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
                        } else {
                            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                            html_macros.html_head_content_type();
                            dhtml_macros.dhtml_with_dom_script();
                            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            {
                                SubLObject bgcolor = cb_sf_context_color($BACKGROUND);
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
                                            SubLObject _prev_bind_0_38 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                                    html_script_utilities.cb_hoverover_page_init();
                                                }
                                                html_utilities.html_newline(UNPROVIDED);
                                                cb_uia_display_primitives.cb_uia_show_entire_support(support);
                                                html_utilities.html_newline(TWO_INTEGER);
                                                cb_utilities.cb_link($SF_STATE, state, $str_alt101$_Back_to_Results_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
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
                } else {
                    cdestructuring_bind_error(datum, $list_alt107);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_sf_yes_no_explain(SubLObject state, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt65$_Explain_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt109$cb_sf_show_yes_no_supports__A, rkf_solution_finder.sf_state_id(state));
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

    public static final SubLObject cb_sf_show_yes_no_supports(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject state_id_string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt26);
                state_id_string = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject state = rkf_solution_finder.sf_find_state_by_id_string(state_id_string);
                        SubLObject pros = rkf_solution_finder.sf_state_pros(state);
                        SubLObject cons = rkf_solution_finder.sf_state_cons(state);
                        SubLObject bgcolor = cb_sf_context_color($SF_RESULTS);
                        SubLObject interaction = rkf_solution_finder.sf_state_interaction(state);
                        if (NIL != user_interaction_agenda.user_interaction_p(interaction)) {
                            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                            html_macros.html_head_content_type();
                            dhtml_macros.dhtml_with_dom_script();
                            if (true) {
                                dhtml_macros.dhtml_with_toggle_visibility_support();
                            }
                            if (true) {
                                if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                    html_script_utilities.cb_hoverover_page_init();
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            {
                                SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
                                {
                                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                    try {
                                        html_macros.$html_inside_bodyP$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                        if (NIL != color_value) {
                                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_color(color_value));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_39 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
                                                if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                                                    html_script_utilities.html_js_focus_window();
                                                }
                                                cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_align$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align($LEFT));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
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
                                                    SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_41 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
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
                                                                    html_utilities.html_markup($str_alt38$20_);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        if (NIL != pros) {
                                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                            html_utilities.html_princ($str_alt111$Arguments_in_favor_);
                                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                            html_utilities.html_newline(TWO_INTEGER);
                                                                            cb_sf_show_arguments(pros, $PRO);
                                                                        } else {
                                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                            html_utilities.html_princ($str_alt112$No_arguments_in_favor_);
                                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                            html_utilities.html_newline(TWO_INTEGER);
                                                                        }
                                                                        if (NIL != cons) {
                                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                            html_utilities.html_princ($str_alt113$Arguments_against_);
                                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                            html_utilities.html_newline(TWO_INTEGER);
                                                                            cb_sf_show_arguments(cons, $CON);
                                                                        } else {
                                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                            html_utilities.html_princ($str_alt115$No_arguments_against_);
                                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                        }
                                                                        html_utilities.html_newline(TWO_INTEGER);
                                                                        cb_utilities.cb_link($SF_STATE, state, $str_alt101$_Back_to_Results_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_42, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_41, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_40, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                html_utilities.html_copyright_notice();
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
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
                        } else {
                            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                            html_macros.html_head_content_type();
                            dhtml_macros.dhtml_with_dom_script();
                            if (true) {
                                dhtml_macros.dhtml_with_toggle_visibility_support();
                            }
                            if (true) {
                                if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                    html_script_utilities.cb_hoverover_page_init();
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            {
                                SubLObject bgcolor_43 = cb_sf_context_color($BACKGROUND);
                                {
                                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                    try {
                                        html_macros.$html_inside_bodyP$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                        if (NIL != bgcolor_43) {
                                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_color(bgcolor_43));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_44 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                                    html_script_utilities.cb_hoverover_page_init();
                                                }
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_align$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align($LEFT));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
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
                                                    SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
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
                                                                    html_utilities.html_markup($str_alt38$20_);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_47 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        if (NIL != pros) {
                                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                            html_utilities.html_princ($str_alt111$Arguments_in_favor_);
                                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                            html_utilities.html_newline(TWO_INTEGER);
                                                                            cb_sf_show_arguments(pros, $PRO);
                                                                        } else {
                                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                            html_utilities.html_princ($str_alt112$No_arguments_in_favor_);
                                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                            html_utilities.html_newline(TWO_INTEGER);
                                                                        }
                                                                        if (NIL != cons) {
                                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                            html_utilities.html_princ($str_alt113$Arguments_against_);
                                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                            html_utilities.html_newline(TWO_INTEGER);
                                                                            cb_sf_show_arguments(cons, $CON);
                                                                        } else {
                                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                            html_utilities.html_princ($str_alt115$No_arguments_against_);
                                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                        }
                                                                        html_utilities.html_newline(TWO_INTEGER);
                                                                        cb_utilities.cb_link($SF_STATE, state, $str_alt101$_Back_to_Results_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_47, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
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
                } else {
                    cdestructuring_bind_error(datum, $list_alt26);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_sf_show_arguments(SubLObject v_arguments, SubLObject pro_or_con) {
        v_arguments = remove_duplicates(v_arguments, $sym117$CB_SF_ARGUMENT__, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cb_uia_display_primitives.cb_uia_show_arguments(v_arguments, pro_or_con, UNPROVIDED);
        return NIL;
    }

    /**
     *
     *
     * @return BOOLEAN; Are ARGUMENT1 and ARGUMENT2 equivalent arguments for our purposes?
     */
    public static final SubLObject cb_sf_argument_E(SubLObject argument1, SubLObject argument2) {
        return list_utilities.sets_equalP(argument1, argument2, $sym118$CB_SF_SUPPORT__);
    }

    /**
     *
     *
     * @return BOOLEAN; Are ARGUMENT1 and ARGUMENT2 equivalent supports for our purposes?
     */
    public static final SubLObject cb_sf_support_E_internal(SubLObject support1, SubLObject support2) {
        return equal(arguments.support_sentence(support1), arguments.support_sentence(support2));
    }

    public static final SubLObject cb_sf_support_E(SubLObject support1, SubLObject support2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return cb_sf_support_E_internal(support1, support2);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym118$CB_SF_SUPPORT__, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym118$CB_SF_SUPPORT__, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym118$CB_SF_SUPPORT__, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(support1, support2);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw119$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (support1.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && support2.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(cb_sf_support_E_internal(support1, support2)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(support1, support2));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static final SubLObject cb_sf_show_resource_settings(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject bgcolor = cb_sf_context_color($SF_RESOURCES);
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
                    html_utilities.html_markup($str_alt38$20_);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ($$$Inference_Effort_Settings);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        if (NIL != rkf_solution_finder.sf_state_show_resources_p(state)) {
                            html_utilities.html_indent(TWO_INTEGER);
                            cb_utilities.cb_link($SF_HIDE_RESOURCES, state, $str_alt123$_Hide_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            {
                                SubLObject backchain = rkf_solution_finder.sf_state_backchain(state);
                                SubLObject number = rkf_solution_finder.sf_state_number(state);
                                SubLObject time = rkf_solution_finder.sf_state_time(state);
                                SubLObject remember = rkf_solution_finder.sf_state_using_remembered_resources_p(state);
                                SubLObject selected = NIL;
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
                                    SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_utilities.html_hidden_input($str_alt124$cb_handle_change_resource_setting, T, UNPROVIDED);
                                        html_utilities.html_hidden_input($$$state, rkf_solution_finder.sf_state_id(state), UNPROVIDED);
                                        {
                                            SubLObject effort_options = $list_alt126;
                                            SubLObject encoded_name = html_utilities.get_encoded_form_field_name($$$effort);
                                            html_utilities.html_newline(UNPROVIDED);
                                            html_utilities.html_princ($str_alt128$Expend_);
                                            html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(encoded_name);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(ONE_INTEGER);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_select_onchange$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup($str_alt129$javascript_this_form_submit___);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    {
                                                        SubLObject cdolist_list_var = effort_options;
                                                        SubLObject effort_option = NIL;
                                                        for (effort_option = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , effort_option = cdolist_list_var.first()) {
                                                            selected = cb_sf_selectedP(backchain, effort_option);
                                                            html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                            if (NIL != selected) {
                                                                html_utilities.html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                                            }
                                                            if (NIL != effort_option) {
                                                                html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(effort_option);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_50 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_princ(cb_sf_map_backchain_to_string(effort_option));
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_50, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                        }
                                                        selected = eq(backchain, T);
                                                        html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                        if (NIL != selected) {
                                                            html_utilities.html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                                        }
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup($int$999);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_51 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ(cb_sf_map_backchain_to_string($int$999));
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_51, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                    }
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                        }
                                        {
                                            SubLObject num_options = $list_alt131;
                                            SubLObject encoded_name = html_utilities.get_encoded_form_field_name($$$number);
                                            html_utilities.html_princ($str_alt133$__finding_no_more_than_);
                                            html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(encoded_name);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(ONE_INTEGER);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_select_onchange$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup($str_alt129$javascript_this_form_submit___);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_52 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    {
                                                        SubLObject cdolist_list_var = num_options;
                                                        SubLObject num_option = NIL;
                                                        for (num_option = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , num_option = cdolist_list_var.first()) {
                                                            selected = makeBoolean((NIL != number) && num_option.numE(number));
                                                            html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                            if (NIL != selected) {
                                                                html_utilities.html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_53 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_princ(num_option);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_53, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                        }
                                                        selected = sublisp_null(number);
                                                        html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                        if (NIL != selected) {
                                                            html_utilities.html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                                        }
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup($int$999);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_54 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($$$all);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_54, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                    }
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_52, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                            html_utilities.html_princ($str_alt135$_solutions);
                                        }
                                        {
                                            SubLObject time_options = $list_alt136;
                                            SubLObject encoded_name = html_utilities.get_encoded_form_field_name($$$time);
                                            html_utilities.html_princ($str_alt138$_within_a_time_limit_of_);
                                            html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(encoded_name);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(ONE_INTEGER);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_select_onchange$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup($str_alt129$javascript_this_form_submit___);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_55 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    {
                                                        SubLObject cdolist_list_var = time_options;
                                                        SubLObject time_option = NIL;
                                                        for (time_option = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , time_option = cdolist_list_var.first()) {
                                                            selected = makeBoolean((NIL != time) && time_option.numE(time));
                                                            html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                            if (NIL != selected) {
                                                                html_utilities.html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_56 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_princ(time_option);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_56, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                        }
                                                        selected = sublisp_null(time);
                                                        html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                        if (NIL != selected) {
                                                            html_utilities.html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                                        }
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup($int$999);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_57 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($$$infinity);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_57, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                    }
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_55, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                            html_utilities.html_princ($str_alt140$_cpu_seconds_);
                                        }
                                        {
                                            SubLObject encoded_name = html_utilities.get_encoded_form_field_name($$$remember);
                                            html_utilities.html_indent(FOUR_INTEGER);
                                            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                            html_utilities.html_checkbox_input(encoded_name, $$$remember, remember, NIL, $str_alt129$javascript_this_form_submit___, UNPROVIDED);
                                            html_utilities.html_indent(ONE_INTEGER);
                                            html_utilities.html_princ($str_alt142$Remember_these_settings_);
                                            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                        }
                                        {
                                            SubLObject encoded_name = html_utilities.get_encoded_form_field_name($str_alt143$ask_quirk);
                                            SubLObject checkedP = rkf_solution_finder.sf_state_ask_quirk_p(state);
                                            html_utilities.html_indent(FOUR_INTEGER);
                                            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                            html_utilities.html_checkbox_input(encoded_name, $str_alt143$ask_quirk, checkedP, NIL, $str_alt129$javascript_this_form_submit___, UNPROVIDED);
                                            html_utilities.html_indent(ONE_INTEGER);
                                            html_utilities.html_princ($str_alt144$Ask_QUIRK_);
                                            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                        }
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_48, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            }
                        } else {
                            html_utilities.html_indent(TWO_INTEGER);
                            cb_utilities.cb_link($SF_SHOW_RESOURCES, state, $str_alt146$_Show_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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

    public static final SubLObject cb_sf_selectedP(SubLObject backchain, SubLObject effort_option) {
        return NIL == backchain ? ((SubLObject) (numE(effort_option, ZERO_INTEGER))) : makeBoolean(backchain.isNumber() && effort_option.numE(backchain));
    }

    public static final SubLObject cb_sf_map_backchain_to_string(SubLObject number) {
        {
            SubLObject pcase_var = number;
            if (pcase_var.eql(ZERO_INTEGER) || pcase_var.eql(NIL)) {
                return $$$almost_no_effort;
            } else
                if (pcase_var.eql(ONE_INTEGER)) {
                    return $$$some_effort;
                } else
                    if (pcase_var.eql(TWO_INTEGER)) {
                        return $$$significant_effort;
                    } else
                        if (pcase_var.eql(THREE_INTEGER)) {
                            return $$$serious_effort;
                        } else
                            if (pcase_var.eql(FOUR_INTEGER)) {
                                return $$$extreme_effort;
                            } else {
                                return $$$unbounded_effort;
                            }




        }
    }

    public static final SubLObject cb_link_sf_show_resources(SubLObject state, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt153$_Show_Resource_Levels_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt154$cb_sf_show_resources__A, rkf_solution_finder.sf_state_id(state));
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

    public static final SubLObject cb_sf_show_resources(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt156);
            id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_solution_finder.sf_find_state_by_id_string(id_string);
                    rkf_solution_finder.sf_set_state_show_resources(state, T);
                    return cb_sf_show_state_guts(state);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt156);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_sf_hide_resources(SubLObject state, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt158$_Hide_Resource_Levels_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt159$cb_sf_hide_resources__A, rkf_solution_finder.sf_state_id(state));
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

    public static final SubLObject cb_sf_hide_resources(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt156);
            id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_solution_finder.sf_find_state_by_id_string(id_string);
                    rkf_solution_finder.sf_set_state_show_resources(state, NIL);
                    return cb_sf_show_state_guts(state);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt156);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_handle_change_resource_settings(SubLObject args) {
        {
            SubLObject number_string = html_utilities.extract_encoded_form_field_value($$$number, args);
            SubLObject time_string = html_utilities.extract_encoded_form_field_value($$$time, args);
            SubLObject effort_string = html_utilities.extract_encoded_form_field_value($$$effort, args);
            SubLObject state_id_string = html_utilities.html_extract_input($$$state, args);
            SubLObject remember_resources = html_utilities.extract_encoded_form_field_value($$$remember, args);
            SubLObject number = parse_integer(number_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject time = parse_integer(time_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject effort = parse_integer(effort_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject state = rkf_solution_finder.sf_find_state_by_id_string(state_id_string);
            if (number.numE($int$999)) {
                rkf_solution_finder.sf_act_set_state_number(state, NIL);
            } else {
                rkf_solution_finder.sf_act_set_state_number(state, number);
            }
            if (time.numE($int$999)) {
                rkf_solution_finder.sf_act_set_state_time(state, NIL);
            } else {
                rkf_solution_finder.sf_act_set_state_time(state, time);
            }
            if (effort.numE($int$999)) {
                rkf_solution_finder.sf_act_set_state_backchain(state, T);
                rkf_solution_finder.sf_act_set_state_depth(state, NIL);
            } else {
                if (effort.numE(ZERO_INTEGER)) {
                    rkf_solution_finder.sf_act_set_state_backchain(state, NIL);
                } else {
                    rkf_solution_finder.sf_act_set_state_backchain(state, effort);
                    rkf_solution_finder.sf_act_set_state_depth(state, NIL);
                }
            }
            {
                SubLObject interaction = rkf_solution_finder.sf_state_interaction(state);
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject ask_quirkP = html_utilities.extract_encoded_form_field_value($str_alt143$ask_quirk, args);
                rkf_solution_finder.sf_set_state_ask_quirk(state, list_utilities.sublisp_boolean(ask_quirkP));
                if (remember_resources.equalp($$$remember)) {
                    user_interaction_agenda.uia_state_update(v_agenda, $SF_RESOURCES, list(rkf_solution_finder.sf_state_backchain(state), rkf_solution_finder.sf_state_number(state), rkf_solution_finder.sf_state_time(state), rkf_solution_finder.sf_state_depth(state)));
                } else {
                    user_interaction_agenda.uia_state_update(v_agenda, $SF_RESOURCES, NIL);
                }
            }
            return cb_sf_show_state_guts(state);
        }
    }

    public static final SubLObject cb_link_sf_find_solutions(SubLObject state, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt163$_Find_Solutions_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt164$cb_sf_find_solutions__A, rkf_solution_finder.sf_state_id(state));
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

    public static final SubLObject cb_sf_find_solutions(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt156);
            id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_solution_finder.sf_find_state_by_id_string(id_string);
                    SubLObject interaction = rkf_solution_finder.sf_state_interaction(state);
                    if (NIL != interaction) {
                        uia_tools_basic.uia_act_new_thinking_child(interaction, CB_SF_FIND_SOLUTIONS_GUTS, list(state), cb_sf_generate_find_progress_message(state), UNPROVIDED);
                        cb_user_interaction_agenda.cb_uia_show_next_interaction(user_interaction_agenda.ui_agenda(interaction));
                    } else {
                        return cb_sf_sorry(state);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt156);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown use the query as well
     */
    public static final SubLObject cb_sf_generate_find_progress_message(SubLObject state) {
        return $str_alt168$Searching_for_solutions_to_the_qu;
    }

    public static final SubLObject cb_sf_sorry(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject interaction = rkf_solution_finder.sf_state_interaction(state);
                if (NIL != user_interaction_agenda.user_interaction_p(interaction)) {
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    dhtml_macros.dhtml_with_dom_script();
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != color_value) {
                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(color_value));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_58 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
                                        if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                                            html_script_utilities.html_js_focus_window();
                                        }
                                        cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
                                        html_utilities.html_princ($str_alt169$Sorry__the_Solution_Finder_isn_t_);
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_58, thread);
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
                } else {
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    dhtml_macros.dhtml_with_dom_script();
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject bgcolor = cb_sf_context_color($BACKGROUND);
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
                                    SubLObject _prev_bind_0_59 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                            html_script_utilities.cb_hoverover_page_init();
                                        }
                                        html_utilities.html_princ($str_alt169$Sorry__the_Solution_Finder_isn_t_);
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_59, thread);
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

    public static final SubLObject cb_sf_find_solutions_guts(SubLObject state) {
        rkf_solution_finder.sf_act_perform_ask(state);
        return state;
    }

    public static final SubLObject cb_link_sf_resume(SubLObject state, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt83$_Keep_Looking_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt170$cb_sf_resume__A, rkf_solution_finder.sf_state_id(state));
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

    public static final SubLObject cb_sf_resume(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt156);
            id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_solution_finder.sf_find_state_by_id_string(id_string);
                    SubLObject interaction = rkf_solution_finder.sf_state_interaction(state);
                    uia_tools_basic.uia_act_new_thinking_child(interaction, CB_SF_RESUME_FIND_GUTS, list(state), cb_sf_generate_resume_progress_message(state), UNPROVIDED);
                    cb_user_interaction_agenda.cb_uia_show_next_interaction(user_interaction_agenda.ui_agenda(interaction));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt156);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown use the query as well
     */
    public static final SubLObject cb_sf_generate_resume_progress_message(SubLObject state) {
        return $str_alt174$Continuing_to_search_for_answers_;
    }

    public static final SubLObject cb_sf_resume_find_guts(SubLObject state) {
        rkf_solution_finder.sf_act_resume_ask(state);
        return state;
    }

    public static final SubLObject cb_link_sf_try_again(SubLObject state, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt59$_Try_Again_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt175$cb_sf_try_again__A, rkf_solution_finder.sf_state_id(state));
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

    public static final SubLObject cb_sf_try_again(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt156);
            id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_solution_finder.sf_find_state_by_id_string(id_string);
                    rkf_solution_finder.sf_act_perform_ask(state);
                    cb_sf_show_state_guts(state);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt156);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_sf_done(SubLObject state, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt43$_Done_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt178$cb_sf_done__A, rkf_solution_finder.sf_state_id(state));
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

    public static final SubLObject cb_sf_done(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject state_id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt26);
            state_id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_solution_finder.sf_find_state_by_id_string(state_id_string);
                    SubLObject interaction = rkf_solution_finder.sf_state_interaction(state);
                    SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                    user_interaction_agenda.uia_act_complete(v_agenda, interaction, state);
                    return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt26);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_sf_edit_query(SubLObject state, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt52$_Edit_Query_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt181$cb_sf_edit_query__A, rkf_solution_finder.sf_state_id(state));
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

    public static final SubLObject cb_sf_edit_query(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject state_id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt26);
            state_id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_solution_finder.sf_find_state_by_id_string(state_id_string);
                    SubLObject query = rkf_solution_finder.sf_state_query(state);
                    SubLObject interaction = rkf_solution_finder.sf_state_interaction(state);
                    SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                    if (NIL != query) {
                        user_interaction_agenda.ui_state_update(interaction, $SF_ACT, $EDIT_QUERY);
                    }
                    return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt26);
            }
        }
        return NIL;
    }

    public static final SubLObject declare_cb_solution_finder_file() {
        declareFunction("cb_sf_show_cycl_p", "CB-SF-SHOW-CYCL-P", 0, 0, false);
        declareMacro("cb_sf_body", "CB-SF-BODY");
        declareMacro("cb_sf_document", "CB-SF-DOCUMENT");
        declareMacro("cb_sf_results_page", "CB-SF-RESULTS-PAGE");
        declareFunction("cb_sf_show_variable_binding", "CB-SF-SHOW-VARIABLE-BINDING", 1, 0, false);
        declareFunction("cb_sf_show_cycl", "CB-SF-SHOW-CYCL", 1, 0, false);
        declareFunction("cb_sf_context_color", "CB-SF-CONTEXT-COLOR", 1, 0, false);
        declareFunction("cb_sf_show_state", "CB-SF-SHOW-STATE", 0, 1, false);
        declareFunction("cb_link_sf_state", "CB-LINK-SF-STATE", 1, 1, false);
        declareFunction("cb_sf_show_state_guts", "CB-SF-SHOW-STATE-GUTS", 1, 0, false);
        declareFunction("cb_sf_show_actions", "CB-SF-SHOW-ACTIONS", 1, 0, false);
        declareFunction("cb_sf_show_query_critiquer_p", "CB-SF-SHOW-QUERY-CRITIQUER-P", 1, 0, false);
        declareFunction("cb_sf_show_results", "CB-SF-SHOW-RESULTS", 1, 0, false);
        declareFunction("cb_sf_show_yes_no_results", "CB-SF-SHOW-YES-NO-RESULTS", 1, 0, false);
        declareFunction("cb_sf_show_halt_reason", "CB-SF-SHOW-HALT-REASON", 1, 0, false);
        declareFunction("cb_sf_show_no_results", "CB-SF-SHOW-NO-RESULTS", 1, 0, false);
        declareFunction("cb_sf_show_not_yet_attempted", "CB-SF-SHOW-NOT-YET-ATTEMPTED", 1, 0, false);
        declareFunction("cb_sf_show_results_so_far", "CB-SF-SHOW-RESULTS-SO-FAR", 1, 0, false);
        declareFunction("cb_sf_show_results_table_var_headings", "CB-SF-SHOW-RESULTS-TABLE-VAR-HEADINGS", 3, 0, false);
        declareFunction("cb_sf_show_results_table_one_binding_set", "CB-SF-SHOW-RESULTS-TABLE-ONE-BINDING-SET", 2, 0, false);
        declareFunction("cb_link_sf_just", "CB-LINK-SF-JUST", 2, 1, false);
        declareFunction("cb_sf_show_justification", "CB-SF-SHOW-JUSTIFICATION", 1, 0, false);
        declareFunction("cb_sf_show_support", "CB-SF-SHOW-SUPPORT", 5, 0, false);
        declareFunction("cb_link_sf_source", "CB-LINK-SF-SOURCE", 4, 1, false);
        declareFunction("cb_sf_show_source", "CB-SF-SHOW-SOURCE", 1, 0, false);
        declareFunction("cb_link_sf_yes_no_explain", "CB-LINK-SF-YES-NO-EXPLAIN", 1, 1, false);
        declareFunction("cb_sf_show_yes_no_supports", "CB-SF-SHOW-YES-NO-SUPPORTS", 1, 0, false);
        declareFunction("cb_sf_show_arguments", "CB-SF-SHOW-ARGUMENTS", 2, 0, false);
        declareFunction("cb_sf_argument_E", "CB-SF-ARGUMENT-=", 2, 0, false);
        declareFunction("cb_sf_support_E_internal", "CB-SF-SUPPORT-=-INTERNAL", 2, 0, false);
        declareFunction("cb_sf_support_E", "CB-SF-SUPPORT-=", 2, 0, false);
        declareFunction("cb_sf_show_resource_settings", "CB-SF-SHOW-RESOURCE-SETTINGS", 1, 0, false);
        declareFunction("cb_sf_selectedP", "CB-SF-SELECTED?", 2, 0, false);
        declareFunction("cb_sf_map_backchain_to_string", "CB-SF-MAP-BACKCHAIN-TO-STRING", 1, 0, false);
        declareFunction("cb_link_sf_show_resources", "CB-LINK-SF-SHOW-RESOURCES", 1, 1, false);
        declareFunction("cb_sf_show_resources", "CB-SF-SHOW-RESOURCES", 1, 0, false);
        declareFunction("cb_link_sf_hide_resources", "CB-LINK-SF-HIDE-RESOURCES", 1, 1, false);
        declareFunction("cb_sf_hide_resources", "CB-SF-HIDE-RESOURCES", 1, 0, false);
        declareFunction("cb_handle_change_resource_settings", "CB-HANDLE-CHANGE-RESOURCE-SETTINGS", 1, 0, false);
        declareFunction("cb_link_sf_find_solutions", "CB-LINK-SF-FIND-SOLUTIONS", 1, 1, false);
        declareFunction("cb_sf_find_solutions", "CB-SF-FIND-SOLUTIONS", 1, 0, false);
        declareFunction("cb_sf_generate_find_progress_message", "CB-SF-GENERATE-FIND-PROGRESS-MESSAGE", 1, 0, false);
        declareFunction("cb_sf_sorry", "CB-SF-SORRY", 1, 0, false);
        declareFunction("cb_sf_find_solutions_guts", "CB-SF-FIND-SOLUTIONS-GUTS", 1, 0, false);
        declareFunction("cb_link_sf_resume", "CB-LINK-SF-RESUME", 1, 1, false);
        declareFunction("cb_sf_resume", "CB-SF-RESUME", 1, 0, false);
        declareFunction("cb_sf_generate_resume_progress_message", "CB-SF-GENERATE-RESUME-PROGRESS-MESSAGE", 1, 0, false);
        declareFunction("cb_sf_resume_find_guts", "CB-SF-RESUME-FIND-GUTS", 1, 0, false);
        declareFunction("cb_link_sf_try_again", "CB-LINK-SF-TRY-AGAIN", 1, 1, false);
        declareFunction("cb_sf_try_again", "CB-SF-TRY-AGAIN", 1, 0, false);
        declareFunction("cb_link_sf_done", "CB-LINK-SF-DONE", 1, 1, false);
        declareFunction("cb_sf_done", "CB-SF-DONE", 1, 0, false);
        declareFunction("cb_link_sf_edit_query", "CB-LINK-SF-EDIT-QUERY", 1, 1, false);
        declareFunction("cb_sf_edit_query", "CB-SF-EDIT-QUERY", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_solution_finder_file() {
        deflexical("*CB-SF-CONTEXT-COLOR-MAP*", $list_alt25);
        return NIL;
    }

    public static final SubLObject setup_cb_solution_finder_file() {
                html_macros.note_html_handler_function(CB_SF_SHOW_STATE);
        cb_utilities.setup_cb_link_method($SF_STATE, CB_LINK_SF_STATE, TWO_INTEGER);
        cb_utilities.setup_cb_link_method($SF_JUST, CB_LINK_SF_JUST, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_SF_SHOW_JUSTIFICATION);
        cb_utilities.setup_cb_link_method($SF_SOURCE, CB_LINK_SF_SOURCE, FIVE_INTEGER);
        html_macros.note_html_handler_function(CB_SF_SHOW_SOURCE);
        cb_utilities.setup_cb_link_method($SF_YES_NO_EXPLAIN, CB_LINK_SF_YES_NO_EXPLAIN, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_SF_SHOW_YES_NO_SUPPORTS);
        memoization_state.note_memoized_function($sym118$CB_SF_SUPPORT__);
        cb_utilities.setup_cb_link_method($SF_SHOW_RESOURCES, CB_LINK_SF_SHOW_RESOURCES, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_SF_SHOW_RESOURCES);
        cb_utilities.setup_cb_link_method($SF_HIDE_RESOURCES, CB_LINK_SF_HIDE_RESOURCES, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_SF_HIDE_RESOURCES);
        html_macros.note_html_handler_function(CB_HANDLE_CHANGE_RESOURCE_SETTINGS);
        cb_utilities.setup_cb_link_method($SF_FIND_SOLUTIONS, CB_LINK_SF_FIND_SOLUTIONS, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_SF_FIND_SOLUTIONS);
        cb_utilities.setup_cb_link_method($SF_RESUME, CB_LINK_SF_RESUME, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_SF_RESUME);
        cb_utilities.setup_cb_link_method($SF_TRY_AGAIN, CB_LINK_SF_TRY_AGAIN, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_SF_TRY_AGAIN);
        cb_utilities.setup_cb_link_method($SF_DONE, CB_LINK_SF_DONE, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_SF_DONE);
        cb_utilities.setup_cb_link_method($SF_EDIT_QUERY, CB_LINK_SF_EDIT_QUERY, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_SF_EDIT_QUERY);
        return NIL;
    }

    // // Internal Constants
    static private final SubLSymbol $sym0$BGCOLOR = makeUninternedSymbol("BGCOLOR");



    static private final SubLList $list_alt2 = list(list(makeSymbol("CB-SF-CONTEXT-COLOR"), makeKeyword("BACKGROUND")));







    private static final SubLSymbol CB_UIAT_WITH_HOVEROVER_SUPPORT = makeSymbol("CB-UIAT-WITH-HOVEROVER-SUPPORT");

    static private final SubLList $list_alt7 = list(list(makeSymbol("STATE"), makeSymbol("&OPTIONAL"), makeSymbol("VISIBILITY"), makeSymbol("HOVEROVER")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym8$INTERACTION = makeUninternedSymbol("INTERACTION");

    private static final SubLSymbol SF_STATE_INTERACTION = makeSymbol("SF-STATE-INTERACTION");







    private static final SubLSymbol HTML_HEAD = makeSymbol("HTML-HEAD");

    static private final SubLList $list_alt14 = list(makeSymbol("DHTML-WITH-DOM-SCRIPT"));



    static private final SubLList $list_alt16 = list(list(makeSymbol("DHTML-WITH-TOGGLE-VISIBILITY-SUPPORT")));

    static private final SubLList $list_alt17 = list(list(makeSymbol("CB-UIAT-WITH-HOVEROVER-SUPPORT")));

    private static final SubLSymbol HTML_BODY = makeSymbol("HTML-BODY");

    private static final SubLSymbol CB_UIAT_DISPLAY_BODY = makeSymbol("CB-UIAT-DISPLAY-BODY");

    private static final SubLSymbol CB_SF_BODY = makeSymbol("CB-SF-BODY");

    static private final SubLList $list_alt21 = list(list(makeSymbol("STATE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol CB_SF_DOCUMENT = makeSymbol("CB-SF-DOCUMENT");

    static private final SubLList $list_alt23 = list(makeKeyword("HIDING"), makeKeyword("HOVEROVER"));

    static private final SubLList $list_alt24 = cons(makeSymbol("VAR"), makeSymbol("ANS"));

    static private final SubLList $list_alt25 = list(list(makeKeyword("BACKGROUND"), makeString("#cfcfcf")), list(makeKeyword("SF-RESULTS"), makeString("#cfcfff")), list(makeKeyword("SF-RESULTS-TABLE"), makeString("#ffffff")), list(makeKeyword("SF-ACTIONS"), makeString("#ffcfcf")), list(makeKeyword("SF-RESOURCES"), makeString("#ffffcf")));

    static private final SubLList $list_alt26 = list(makeSymbol("STATE-ID-STRING"));

    private static final SubLSymbol CB_SF_SHOW_STATE = makeSymbol("CB-SF-SHOW-STATE");

    static private final SubLString $str_alt28$_Show_SF_State_ = makeString("[Show SF State]");



    static private final SubLString $str_alt30$cb_sf_show_state__A = makeString("cb-sf-show-state&~A");

    private static final SubLSymbol $SF_STATE = makeKeyword("SF-STATE");

    private static final SubLSymbol CB_LINK_SF_STATE = makeSymbol("CB-LINK-SF-STATE");

    static private final SubLString $str_alt33$90_ = makeString("90%");



    private static final SubLSymbol $SF_ACTIONS = makeKeyword("SF-ACTIONS");





    static private final SubLString $str_alt38$20_ = makeString("20%");

    static private final SubLString $$$Solution_Finder = makeString("Solution Finder");

    static private final SubLString $str_alt40$Find_answers_for_ = makeString("Find answers for:");

    static private final SubLString $str_alt41$This_query_was_understood_by_Cyc_ = makeString("This query was understood by Cyc as: ");

    private static final SubLSymbol $SF_DONE = makeKeyword("SF-DONE");

    static private final SubLString $str_alt43$_Done_ = makeString("[Done]");

    static private final SubLString $str_alt44$_Forget_it_ = makeString("[Forget it]");

    static private final SubLString $str_alt45$_Add_to_Test_Suite_ = makeString("[Add to Test Suite]");

    private static final SubLSymbol $UIAEXT_CRITICIZE_QUERY = makeKeyword("UIAEXT-CRITICIZE-QUERY");

    static private final SubLString $str_alt47$_Ask_ISI_WhyNot_Critiquer_ = makeString("[Ask ISI WhyNot Critiquer]");

    private static final SubLSymbol $SF_CYCL = makeKeyword("SF-CYCL");

    private static final SubLSymbol $UIAT_ADD_UNTRIED_QUERY_TO_TSUITE = makeKeyword("UIAT-ADD-UNTRIED-QUERY-TO-TSUITE");

    static private final SubLString $str_alt50$_Add_Untried_Query_to_Test_Suite_ = makeString("[Add Untried Query to Test Suite]");

    private static final SubLSymbol $SF_EDIT_QUERY = makeKeyword("SF-EDIT-QUERY");

    static private final SubLString $str_alt52$_Edit_Query_ = makeString("[Edit Query]");

    static private final SubLList $list_alt53 = list(NIL, NIL);

    static private final SubLList $list_alt54 = list(makeSymbol("PROS"), makeSymbol("CONS"));

    private static final SubLSymbol $SF_RESULTS = makeKeyword("SF-RESULTS");

    static private final SubLString $str_alt56$Results_ = makeString("Results:");



    private static final SubLSymbol $SF_TRY_AGAIN = makeKeyword("SF-TRY-AGAIN");

    static private final SubLString $str_alt59$_Try_Again_ = makeString("[Try Again]");

    static private final SubLString $str_alt60$_ = makeString(".");

    static private final SubLString $str_alt61$Is_it_true_that_ = makeString("Is it true that:");

    static private final SubLString $str_alt62$Unknown_ = makeString("Unknown ");

    static private final SubLString $str_alt63$__there_are_arguments_pro_and_con = makeString(" (there are arguments pro and con).");

    private static final SubLSymbol $SF_YES_NO_EXPLAIN = makeKeyword("SF-YES-NO-EXPLAIN");

    static private final SubLString $str_alt65$_Explain_ = makeString("[Explain]");

    static private final SubLString $str_alt66$Yes_ = makeString("Yes.");

    static private final SubLString $str_alt67$No_ = makeString("No.");

    static private final SubLString $str_alt68$__there_is_no_evidence_either_way = makeString(" (there is no evidence either way).");

    static private final SubLString $str_alt69$The_search_stopped_because_ = makeString("The search stopped because ");

    private static final SubLSymbol $TOO_EXPENSIVE = makeKeyword("TOO-EXPENSIVE");

    static private final SubLString $str_alt71$it_is_too_costly_to_perform_ = makeString("it is too costly to perform.");



    static private final SubLString $str_alt73$all_possible_sources_have_been_se = makeString("all possible sources have been searched.");



    static private final SubLString $str_alt75$the_specified_number_of_solutions = makeString("the specified number of solutions were found.");



    static private final SubLString $str_alt77$it_ran_out_of_time_ = makeString("it ran out of time.");



    static private final SubLString $str_alt79$the_limit_on_effort_was_reached_ = makeString("the limit on effort was reached.");

    static private final SubLString $str_alt80$the_assumptions_were_not_consiste = makeString("the assumptions were not consistent.");

    static private final SubLString $str_alt81$No_solutions_have_been_found_ = makeString("No solutions have been found.");

    private static final SubLSymbol $SF_RESUME = makeKeyword("SF-RESUME");

    static private final SubLString $str_alt83$_Keep_Looking_ = makeString("[Keep Looking]");

    static private final SubLString $str_alt84$The_query_has_not_yet_been_attemp = makeString("The query has not yet been attempted.");

    private static final SubLSymbol $SF_FIND_SOLUTIONS = makeKeyword("SF-FIND-SOLUTIONS");

    static private final SubLString $str_alt86$_Try_This_Query_ = makeString("[Try This Query]");

    static private final SubLString $str_alt87$Results_So_Far_ = makeString("Results So Far:");

    private static final SubLSymbol $SF_RESULTS_TABLE = makeKeyword("SF-RESULTS-TABLE");

    static private final SubLString $str_alt89$Why_ = makeString("Why?");

    private static final SubLSymbol $SF_JUST = makeKeyword("SF-JUST");

    static private final SubLString $str_alt91$_Show_Reason_ = makeString("[Show Reason]");

    static private final SubLString $str_alt92$_Show_Reasons___A__ = makeString("[Show Reasons (~A)]");

    static private final SubLString $str_alt93$cb_sf_show_justification__A__A = makeString("cb-sf-show-justification&~A&~A");

    private static final SubLSymbol CB_LINK_SF_JUST = makeSymbol("CB-LINK-SF-JUST");

    static private final SubLList $list_alt95 = list(makeSymbol("STATE-ID-STRING"), makeSymbol("SS-ID-STRING"));

    private static final SubLSymbol $HIDING = makeKeyword("HIDING");



    static private final SubLString $str_alt98$Solution_ = makeString("Solution:");

    static private final SubLString $str_alt99$Reasons_for_this_solution_ = makeString("Reasons for this solution:");



    static private final SubLString $str_alt101$_Back_to_Results_ = makeString("[Back to Results]");

    private static final SubLSymbol CB_SF_SHOW_JUSTIFICATION = makeSymbol("CB-SF-SHOW-JUSTIFICATION");

    private static final SubLSymbol $SF_SOURCE = makeKeyword("SF-SOURCE");

    static private final SubLString $str_alt104$_Source_ = makeString("[Source]");

    static private final SubLString $str_alt105$cb_sf_show_source__A__A__A__A = makeString("cb-sf-show-source&~A&~A&~A&~A");

    private static final SubLSymbol CB_LINK_SF_SOURCE = makeSymbol("CB-LINK-SF-SOURCE");

    static private final SubLList $list_alt107 = list(makeSymbol("STATE-ID-STRING"), makeSymbol("SS-ID-STRING"), makeSymbol("SET-NUM-STRING"), makeSymbol("SUPPORT-NUM-STRING"));

    private static final SubLSymbol CB_SF_SHOW_SOURCE = makeSymbol("CB-SF-SHOW-SOURCE");

    static private final SubLString $str_alt109$cb_sf_show_yes_no_supports__A = makeString("cb-sf-show-yes-no-supports&~A");

    private static final SubLSymbol CB_LINK_SF_YES_NO_EXPLAIN = makeSymbol("CB-LINK-SF-YES-NO-EXPLAIN");

    static private final SubLString $str_alt111$Arguments_in_favor_ = makeString("Arguments in favor:");

    static private final SubLString $str_alt112$No_arguments_in_favor_ = makeString("No arguments in favor.");

    static private final SubLString $str_alt113$Arguments_against_ = makeString("Arguments against:");



    static private final SubLString $str_alt115$No_arguments_against_ = makeString("No arguments against.");

    private static final SubLSymbol CB_SF_SHOW_YES_NO_SUPPORTS = makeSymbol("CB-SF-SHOW-YES-NO-SUPPORTS");

    static private final SubLSymbol $sym117$CB_SF_ARGUMENT__ = makeSymbol("CB-SF-ARGUMENT-=");

    static private final SubLSymbol $sym118$CB_SF_SUPPORT__ = makeSymbol("CB-SF-SUPPORT-=");

    public static final SubLSymbol $kw119$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");



    static private final SubLString $$$Inference_Effort_Settings = makeString("Inference Effort Settings");

    private static final SubLSymbol $SF_HIDE_RESOURCES = makeKeyword("SF-HIDE-RESOURCES");

    static private final SubLString $str_alt123$_Hide_ = makeString("[Hide]");

    static private final SubLString $str_alt124$cb_handle_change_resource_setting = makeString("cb-handle-change-resource-settings");

    static private final SubLString $$$state = makeString("state");

    static private final SubLList $list_alt126 = list(ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER);

    static private final SubLString $$$effort = makeString("effort");

    static private final SubLString $str_alt128$Expend_ = makeString("Expend ");

    static private final SubLString $str_alt129$javascript_this_form_submit___ = makeString("javascript:this.form.submit();");

    public static final SubLInteger $int$999 = makeInteger(999);

    static private final SubLList $list_alt131 = list(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, TEN_INTEGER, TWENTY_INTEGER);

    static private final SubLString $$$number = makeString("number");

    static private final SubLString $str_alt133$__finding_no_more_than_ = makeString(", finding no more than ");

    static private final SubLString $$$all = makeString("all");

    static private final SubLString $str_alt135$_solutions = makeString(" solutions");

    static private final SubLList $list_alt136 = list(TEN_INTEGER, makeInteger(30), makeInteger(60), makeInteger(120), makeInteger(180), makeInteger(240));

    static private final SubLString $$$time = makeString("time");

    static private final SubLString $str_alt138$_within_a_time_limit_of_ = makeString(" within a time limit of ");

    static private final SubLString $$$infinity = makeString("infinity");

    static private final SubLString $str_alt140$_cpu_seconds_ = makeString(" cpu seconds.");

    static private final SubLString $$$remember = makeString("remember");

    static private final SubLString $str_alt142$Remember_these_settings_ = makeString("Remember these settings.");

    static private final SubLString $str_alt143$ask_quirk = makeString("ask_quirk");

    static private final SubLString $str_alt144$Ask_QUIRK_ = makeString("Ask QUIRK?");

    private static final SubLSymbol $SF_SHOW_RESOURCES = makeKeyword("SF-SHOW-RESOURCES");

    static private final SubLString $str_alt146$_Show_ = makeString("[Show]");

    static private final SubLString $$$almost_no_effort = makeString("almost no effort");

    static private final SubLString $$$some_effort = makeString("some effort");

    static private final SubLString $$$significant_effort = makeString("significant effort");

    static private final SubLString $$$serious_effort = makeString("serious effort");

    static private final SubLString $$$extreme_effort = makeString("extreme effort");

    static private final SubLString $$$unbounded_effort = makeString("unbounded effort");

    static private final SubLString $str_alt153$_Show_Resource_Levels_ = makeString("[Show Resource Levels]");

    static private final SubLString $str_alt154$cb_sf_show_resources__A = makeString("cb-sf-show-resources&~A");

    private static final SubLSymbol CB_LINK_SF_SHOW_RESOURCES = makeSymbol("CB-LINK-SF-SHOW-RESOURCES");

    static private final SubLList $list_alt156 = list(makeSymbol("ID-STRING"));

    private static final SubLSymbol CB_SF_SHOW_RESOURCES = makeSymbol("CB-SF-SHOW-RESOURCES");

    static private final SubLString $str_alt158$_Hide_Resource_Levels_ = makeString("[Hide Resource Levels]");

    static private final SubLString $str_alt159$cb_sf_hide_resources__A = makeString("cb-sf-hide-resources&~A");

    private static final SubLSymbol CB_LINK_SF_HIDE_RESOURCES = makeSymbol("CB-LINK-SF-HIDE-RESOURCES");

    private static final SubLSymbol CB_SF_HIDE_RESOURCES = makeSymbol("CB-SF-HIDE-RESOURCES");

    private static final SubLSymbol CB_HANDLE_CHANGE_RESOURCE_SETTINGS = makeSymbol("CB-HANDLE-CHANGE-RESOURCE-SETTINGS");

    static private final SubLString $str_alt163$_Find_Solutions_ = makeString("[Find Solutions]");

    static private final SubLString $str_alt164$cb_sf_find_solutions__A = makeString("cb-sf-find-solutions&~A");

    private static final SubLSymbol CB_LINK_SF_FIND_SOLUTIONS = makeSymbol("CB-LINK-SF-FIND-SOLUTIONS");

    private static final SubLSymbol CB_SF_FIND_SOLUTIONS_GUTS = makeSymbol("CB-SF-FIND-SOLUTIONS-GUTS");

    private static final SubLSymbol CB_SF_FIND_SOLUTIONS = makeSymbol("CB-SF-FIND-SOLUTIONS");

    static private final SubLString $str_alt168$Searching_for_solutions_to_the_qu = makeString("Searching for solutions to the query ....");

    static private final SubLString $str_alt169$Sorry__the_Solution_Finder_isn_t_ = makeString("Sorry, the Solution Finder isn't supported outside the User Interaction framework.");

    static private final SubLString $str_alt170$cb_sf_resume__A = makeString("cb-sf-resume&~A");

    private static final SubLSymbol CB_LINK_SF_RESUME = makeSymbol("CB-LINK-SF-RESUME");

    private static final SubLSymbol CB_SF_RESUME_FIND_GUTS = makeSymbol("CB-SF-RESUME-FIND-GUTS");

    private static final SubLSymbol CB_SF_RESUME = makeSymbol("CB-SF-RESUME");

    static private final SubLString $str_alt174$Continuing_to_search_for_answers_ = makeString("Continuing to search for answers ....");

    static private final SubLString $str_alt175$cb_sf_try_again__A = makeString("cb-sf-try-again&~A");

    private static final SubLSymbol CB_LINK_SF_TRY_AGAIN = makeSymbol("CB-LINK-SF-TRY-AGAIN");

    private static final SubLSymbol CB_SF_TRY_AGAIN = makeSymbol("CB-SF-TRY-AGAIN");

    static private final SubLString $str_alt178$cb_sf_done__A = makeString("cb-sf-done&~A");

    private static final SubLSymbol CB_LINK_SF_DONE = makeSymbol("CB-LINK-SF-DONE");

    private static final SubLSymbol CB_SF_DONE = makeSymbol("CB-SF-DONE");

    static private final SubLString $str_alt181$cb_sf_edit_query__A = makeString("cb-sf-edit-query&~A");

    private static final SubLSymbol CB_LINK_SF_EDIT_QUERY = makeSymbol("CB-LINK-SF-EDIT-QUERY");

    private static final SubLSymbol $SF_ACT = makeKeyword("SF-ACT");

    private static final SubLSymbol $EDIT_QUERY = makeKeyword("EDIT-QUERY");

    private static final SubLSymbol CB_SF_EDIT_QUERY = makeSymbol("CB-SF-EDIT-QUERY");

    // // Initializers
    public void declareFunctions() {
        declare_cb_solution_finder_file();
    }

    public void initializeVariables() {
        init_cb_solution_finder_file();
    }

    public void runTopLevelForms() {
        setup_cb_solution_finder_file();
    }
}

