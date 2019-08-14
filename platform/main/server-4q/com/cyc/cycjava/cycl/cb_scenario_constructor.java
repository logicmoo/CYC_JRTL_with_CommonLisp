/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_C;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_G;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_I;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_N;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nsubst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.parse_integer;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CB-SCENARIO-CONSTRUCTOR
 *  source file: /cyc/top/cycl/cb-scenario-constructor.lisp
 *  created:     2019/07/03 17:38:11
 */
public final class cb_scenario_constructor extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_scenario_constructor() {
    }

    public static final SubLFile me = new cb_scenario_constructor();

    public static final String myName = "com.cyc.cycjava.cycl.cb_scenario_constructor";

    // // Definitions
    public static final SubLObject cb_sc_show_cycl_p() {
        return cb_user_interaction_agenda.$cb_uia_show_cyclP$.getGlobalValue();
    }

    public static final SubLObject cb_sc_body(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            SubLObject bgcolor = $sym0$BGCOLOR;
            return list(CLET, list(bq_cons(bgcolor, $list_alt2)), listS(HTML_FANCY_BODY, list($SHOW_COPYRIGHT, NIL, $BACKGROUND_COLOR, bgcolor), append(body, NIL)));
        }
    }

    public static final SubLObject cb_sc_document(SubLObject macroform, SubLObject environment) {
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
                            return list(CLET, list(list(interaction, list(SC_STATE_INTERACTION, state))), list(PIF, list(USER_INTERACTION_P, interaction), listS(CB_UIAT_DISPLAY_DOCUMENT, list(interaction), append(body, NIL)), list(HTML_DOCUMENT, bq_cons(CB_SC_BODY, append(body, NIL)))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt6);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject html_background_table(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt14);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject bgcolor = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt14);
                    bgcolor = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt14);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt14);
                            if (NIL == member(current_1, $list_alt15, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt14);
                        }
                        {
                            SubLObject cellpadding_tail = property_list_member($CELLPADDING, current);
                            SubLObject cellpadding = (NIL != cellpadding_tail) ? ((SubLObject) (cadr(cellpadding_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(HTML_FANCY_TABLE, listS($NOFLOW, new SubLObject[]{ T, $NOWRAP, T, $BGCOLOR, bgcolor, $BORDER, ZERO_INTEGER, $CELLSPACING, ZERO_INTEGER, append(NIL != cellpadding ? ((SubLObject) (list($CELLPADDING, cellpadding))) : NIL, NIL) }), list(HTML_TABLE_ROW, list(HTML_TABLE_DATA, listS(HTML_FANCY_TABLE, $list_alt26, append(body, NIL)))));
                            }
                        }
                    }
                }
            }
        }
    }

    public static final SubLObject cb_sc_show_active_session(SubLObject state, SubLObject active_session) {
        cb_sc_show_session(state, active_session);
        html_utilities.html_newline(UNPROVIDED);
        cb_utilities.cb_link($SC_ELABORATE, state, $str_alt28$_Elaborate_Scenario_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_sc_show_inactive_session(SubLObject state, SubLObject inactive_session) {
        cb_sc_show_session(state, inactive_session);
        html_utilities.html_newline(UNPROVIDED);
        cb_utilities.cb_link($SC_ACTIVATE, state, inactive_session, $str_alt30$_Activate_Scenario_, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_sc_show_session(SubLObject state, SubLObject other_session) {
        {
            SubLObject phrase = rkf_scenario_constructor.sc_session_phrase(other_session);
            html_utilities.html_newline(UNPROVIDED);
            if (phrase.isString()) {
                html_utilities.html_princ(phrase);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_sc_show_cycl(SubLObject cycl) {
        return cb_utilities.cb_form(cycl, ZERO_INTEGER, T);
    }

    // defparameter
    private static final SubLSymbol $cb_sc_context_color_map$ = makeSymbol("*CB-SC-CONTEXT-COLOR-MAP*");

    public static final SubLObject cb_sc_context_color(SubLObject v_context) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return second(assoc(v_context, $cb_sc_context_color_map$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
        }
    }

    public static final SubLObject cb_sc_open_scenarios(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt32);
            id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_scenario_constructor.sc_find_state_by_id_string(id_string);
                    return cb_sc_open_scenarios_guts(state);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt32);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_sc_open_scenarios(SubLObject state, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt34$_Open_Scenarios_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt36$cb_sc_open_scenarios__A, rkf_scenario_constructor.sc_state_id(state));
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
                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_utilities.html_princ(linktext);
                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_sc_open_scenarios_guts(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject active_session = rkf_scenario_constructor.sc_state_active_session(state);
                SubLObject construction_sessions = rkf_scenario_constructor.sc_state_construction_sessions(state);
                SubLObject browsing_sessions = rkf_scenario_constructor.sc_state_browsing_sessions(state);
                SubLObject interaction = rkf_scenario_constructor.sc_state_interaction(state);
                if (NIL != user_interaction_agenda.user_interaction_p(interaction)) {
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
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ($$$Summary_of_Open_Scenarios);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_utilities.html_newline(UNPROVIDED);
                    if (NIL != active_session) {
                        html_utilities.html_newline(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ($str_alt40$Active_Scenario___);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_utilities.html_newline(UNPROVIDED);
                        cb_sc_show_active_session(state, active_session);
                        if (add(length(construction_sessions), length(browsing_sessions)).numG(ONE_INTEGER)) {
                            html_utilities.html_newline(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ($str_alt41$Other_Scenarios___);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            {
                                SubLObject cdolist_list_var = construction_sessions;
                                SubLObject other_session = NIL;
                                for (other_session = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , other_session = cdolist_list_var.first()) {
                                    html_utilities.html_newline(UNPROVIDED);
                                    cb_sc_show_inactive_session(state, other_session);
                                }
                            }
                            {
                                SubLObject cdolist_list_var = browsing_sessions;
                                SubLObject other_session = NIL;
                                for (other_session = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , other_session = cdolist_list_var.first()) {
                                    html_utilities.html_newline(UNPROVIDED);
                                    cb_sc_show_inactive_session(state, other_session);
                                }
                            }
                        }
                    } else
                        if ((NIL != construction_sessions) || (NIL != browsing_sessions)) {
                            html_utilities.html_newline(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ($$$Open_Scenarios);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            {
                                SubLObject cdolist_list_var = construction_sessions;
                                SubLObject other_session = NIL;
                                for (other_session = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , other_session = cdolist_list_var.first()) {
                                    html_utilities.html_newline(UNPROVIDED);
                                    cb_sc_show_inactive_session(state, other_session);
                                }
                            }
                            {
                                SubLObject cdolist_list_var = browsing_sessions;
                                SubLObject other_session = NIL;
                                for (other_session = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , other_session = cdolist_list_var.first()) {
                                    html_utilities.html_newline(UNPROVIDED);
                                    cb_sc_show_inactive_session(state, other_session);
                                }
                            }
                        } else {
                            html_utilities.html_newline(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                            html_utilities.html_princ($$$No_Open_Scenarios);
                            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                        }

                    html_utilities.html_newline(TWO_INTEGER);
                    cb_sc_enumerate_saved_scenarios(state);
                    html_utilities.html_newline(TWO_INTEGER);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ($str_alt44$Click_);
                    cb_utilities.cb_link($SC_FIND_SCENARIO, state, $$$here, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_princ($str_alt47$_to_search_for_or_introduce_a_sce);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } else {
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    {
                        SubLObject bgcolor = cb_sc_context_color($BACKGROUND);
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
                                    SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Summary_of_Open_Scenarios);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_newline(UNPROVIDED);
                                        if (NIL != active_session) {
                                            html_utilities.html_newline(UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_utilities.html_princ($str_alt40$Active_Scenario___);
                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            html_utilities.html_newline(UNPROVIDED);
                                            cb_sc_show_active_session(state, active_session);
                                            if (add(length(construction_sessions), length(browsing_sessions)).numG(ONE_INTEGER)) {
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt41$Other_Scenarios___);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                {
                                                    SubLObject cdolist_list_var = construction_sessions;
                                                    SubLObject other_session = NIL;
                                                    for (other_session = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , other_session = cdolist_list_var.first()) {
                                                        html_utilities.html_newline(UNPROVIDED);
                                                        cb_sc_show_inactive_session(state, other_session);
                                                    }
                                                }
                                                {
                                                    SubLObject cdolist_list_var = browsing_sessions;
                                                    SubLObject other_session = NIL;
                                                    for (other_session = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , other_session = cdolist_list_var.first()) {
                                                        html_utilities.html_newline(UNPROVIDED);
                                                        cb_sc_show_inactive_session(state, other_session);
                                                    }
                                                }
                                            }
                                        } else
                                            if ((NIL != construction_sessions) || (NIL != browsing_sessions)) {
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($$$Open_Scenarios);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                {
                                                    SubLObject cdolist_list_var = construction_sessions;
                                                    SubLObject other_session = NIL;
                                                    for (other_session = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , other_session = cdolist_list_var.first()) {
                                                        html_utilities.html_newline(UNPROVIDED);
                                                        cb_sc_show_inactive_session(state, other_session);
                                                    }
                                                }
                                                {
                                                    SubLObject cdolist_list_var = browsing_sessions;
                                                    SubLObject other_session = NIL;
                                                    for (other_session = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , other_session = cdolist_list_var.first()) {
                                                        html_utilities.html_newline(UNPROVIDED);
                                                        cb_sc_show_inactive_session(state, other_session);
                                                    }
                                                }
                                            } else {
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                                html_utilities.html_princ($$$No_Open_Scenarios);
                                                html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                            }

                                        html_utilities.html_newline(TWO_INTEGER);
                                        cb_sc_enumerate_saved_scenarios(state);
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt44$Click_);
                                        cb_utilities.cb_link($SC_FIND_SCENARIO, state, $$$here, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_princ($str_alt47$_to_search_for_or_introduce_a_sce);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
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

    public static final SubLObject cb_sc_enumerate_saved_scenarios(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject scenarios = rkf_scenario_constructor.sc_act_enumerate_saved_scenarios(state);
                if (NIL != scenarios) {
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ($$$Saved_Scenarios);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
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
                                SubLObject cdolist_list_var = scenarios;
                                SubLObject v_scenario = NIL;
                                for (v_scenario = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_scenario = cdolist_list_var.first()) {
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            {
                                                SubLObject datum = v_scenario;
                                                SubLObject current = datum;
                                                SubLObject scenario_term = NIL;
                                                SubLObject scenario_string = NIL;
                                                destructuring_bind_must_consp(current, datum, $list_alt50);
                                                scenario_term = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list_alt50);
                                                scenario_string = current.first();
                                                current = current.rest();
                                                if (NIL == current) {
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
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            cb_utilities.cb_link($CB_SC_RELOAD_SCENARIO, state, scenario_term, scenario_string, UNPROVIDED, UNPROVIDED);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
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
                                                        SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                                            html_utilities.html_princ(scenario_string);
                                                            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } else {
                                                    cdestructuring_bind_error(datum, $list_alt50);
                                                }
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
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
                }
            }
            return state;
        }
    }

    public static final SubLObject cb_link_cb_sc_reload_scenario(SubLObject state, SubLObject scenario_term, SubLObject phrase, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt55$_Reload_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(rkf_scenario_constructor.sc_state_id(state), scenario_term, phrase);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt56$cb_sc_reload_scenario, arglist);
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
                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_utilities.html_princ(linktext);
                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_sc_reload_scenario(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject state_id = NIL;
            SubLObject scenario_term = NIL;
            SubLObject scenario_phrase = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt58);
            state_id = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt58);
            scenario_term = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt58);
            scenario_phrase = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_scenario_constructor.sc_find_state_by_id(state_id);
                    SubLObject interaction = rkf_scenario_constructor.sc_state_interaction(state);
                    if (NIL != user_interaction_agenda.user_interaction_p(interaction)) {
                        {
                            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                            SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $RELOAD_SCENARIO, list($SCENARIO_TERM, scenario_term, $SCENARIO_PHRASE, scenario_phrase));
                            return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                        }
                    }
                    cb_sc_construction_fallback(state, $$$Failed_to_load_scenario);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt58);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_sc_find_scenario(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt32);
            id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_scenario_constructor.sc_find_state_by_id_string(id_string);
                    return cb_sc_show_find_scenario(state);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt32);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_sc_find_scenario(SubLObject state, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt65$_Find_Scenario_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt66$cb_sc_find_scenario__A, rkf_scenario_constructor.sc_state_id(state));
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
                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_utilities.html_princ(linktext);
                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_sc_show_find_scenario(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject interaction = rkf_scenario_constructor.sc_state_interaction(state);
                if (NIL != user_interaction_agenda.user_interaction_p(interaction)) {
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
                                html_utilities.html_hidden_input($str_alt68$cb_sc_handle_find_scenario, T, UNPROVIDED);
                                html_utilities.html_hidden_input($str_alt69$state_id, rkf_scenario_constructor.sc_state_id(state), UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt70$Enter_an_English_phrase_for_your_);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_indent(FOUR_INTEGER);
                                html_utilities.html_submit_input($$$Find_Scenario, UNPROVIDED, UNPROVIDED);
                                html_utilities.html_indent(UNPROVIDED);
                                html_utilities.html_reset_input($$$Clear);
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($$$text);
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
                                    html_utilities.html_markup(TEN_INTEGER);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($$$virtual);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
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
                } else {
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    {
                        SubLObject bgcolor = cb_sc_context_color($BACKGROUND);
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
                                    SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
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
                                                    html_utilities.html_hidden_input($str_alt68$cb_sc_handle_find_scenario, T, UNPROVIDED);
                                                    html_utilities.html_hidden_input($str_alt69$state_id, rkf_scenario_constructor.sc_state_id(state), UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_utilities.html_princ($str_alt70$Enter_an_English_phrase_for_your_);
                                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    html_utilities.html_indent(FOUR_INTEGER);
                                                    html_utilities.html_submit_input($$$Find_Scenario, UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_indent(UNPROVIDED);
                                                    html_utilities.html_reset_input($$$Clear);
                                                    html_utilities.html_newline(UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup($$$text);
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
                                                        html_utilities.html_markup(TEN_INTEGER);
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
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
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

    public static final SubLObject cb_sc_handle_find_scenario(SubLObject args) {
        {
            SubLObject id_string = html_utilities.html_extract_input($str_alt69$state_id, args);
            SubLObject state = rkf_scenario_constructor.sc_find_state_by_id_string(id_string);
            SubLObject interaction = rkf_scenario_constructor.sc_state_interaction(state);
            SubLObject text = html_utilities.html_extract_input($$$text, args);
            if (NIL != user_interaction_agenda.user_interaction_p(interaction)) {
                user_interaction_agenda.ui_state_update(interaction, $SCENARIO_PHRASE, text);
                {
                    SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $FIND_SCENARIO, list($SCENARIO_PHRASE, text));
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            }
            cb_sc_construction_fallback(state, text);
        }
        return NIL;
    }

    public static final SubLObject cb_sc_construction_fallback(SubLObject state, SubLObject text) {
        {
            SubLObject session = rkf_scenario_constructor.sc_act_initialize_construction_session(state, text);
            SubLObject candidate_scenarios = rkf_scenario_constructor.sc_act_suggest_scenarios(state, text);
            if (NIL == candidate_scenarios) {
                rkf_scenario_constructor.sc_act_initialize_scenario(state, session, text);
                return cb_sc_elaborate_guts(state);
            } else {
                {
                    SubLObject session_10 = rkf_scenario_constructor.sc_act_initialize_construction_session(state, UNPROVIDED);
                    rkf_scenario_constructor.sc_act_set_session_scenario(session_10, candidate_scenarios.first());
                    return cb_sc_elaborate_guts(state);
                }
            }
        }
    }

    public static final SubLObject cb_sc_elaborate(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt32);
            id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_scenario_constructor.sc_find_state_by_id_string(id_string);
                    return cb_sc_elaborate_guts(state);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt32);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_sc_elaborate(SubLObject state, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt28$_Elaborate_Scenario_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt79$cb_sc_elaborate__A, rkf_scenario_constructor.sc_state_id(state));
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

    public static final SubLObject cb_sc_elaborate_guts(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject interaction = rkf_scenario_constructor.sc_state_interaction(state);
                if (NIL != user_interaction_agenda.user_interaction_p(interaction)) {
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
                    cb_sc_show_scenario_actions(state);
                    html_utilities.html_newline(UNPROVIDED);
                    cb_sc_show_other_scenarios(state);
                    html_utilities.html_newline(UNPROVIDED);
                    cb_sc_show_scenario_connectivity(state, UNPROVIDED);
                    html_utilities.html_newline(UNPROVIDED);
                    cb_sc_show_general_terms(state, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_newline(UNPROVIDED);
                    cb_sc_show_constraints(state, UNPROVIDED, UNPROVIDED);
                    cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } else {
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    {
                        SubLObject bgcolor = cb_sc_context_color($BACKGROUND);
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
                                    SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_newline(UNPROVIDED);
                                        cb_sc_show_scenario_actions(state);
                                        html_utilities.html_newline(UNPROVIDED);
                                        cb_sc_show_other_scenarios(state);
                                        html_utilities.html_newline(UNPROVIDED);
                                        cb_sc_show_scenario_connectivity(state, UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        cb_sc_show_general_terms(state, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        cb_sc_show_constraints(state, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
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

    public static final SubLObject cb_sc_show_scenario_actions(SubLObject state) {
        {
            SubLObject v_scenario = rkf_scenario_constructor.sc_state_active_scenario(state);
            SubLObject bgcolor = cb_sc_context_color($SCENARIO_ACTIONS);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            cb_utilities.cb_link($SC_ELABORATE, state, $$$Active_Scenario, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_utilities.html_princ($str_alt83$__);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            cb_sc_show_scenario_phrase(state, v_scenario);
            html_utilities.html_newline(UNPROVIDED);
            cb_utilities.cb_link($SC_MODIFY_SCENARIO_PHRASE, state, v_scenario, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_utilities.html_princ($str_alt85$_);
            cb_utilities.cb_link($SC_DISCARD_SCENARIO, state, v_scenario, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_utilities.html_princ($str_alt85$_);
            cb_utilities.cb_link($SC_GENERALIZE_SCENARIO, state, v_scenario, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            {
                SubLObject templates = rkf_scenario_manipulator.sm_scenario_templates(v_scenario);
                SubLObject cdolist_list_var = templates;
                SubLObject template = NIL;
                for (template = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template = cdolist_list_var.first()) {
                    html_utilities.html_newline(UNPROVIDED);
                    cb_utilities.cb_link($SC_ELABORATE_TEMPLATE, state, template, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
            if (NIL != user_interaction_agenda.user_interaction_p(rkf_scenario_constructor.sc_state_interaction(state))) {
                if (NIL == rkf_scenario_constructor.sc_state_active_scenario_incomplete(state)) {
                    html_utilities.html_newline(UNPROVIDED);
                    cb_utilities.cb_link($SC_DECLARE_DONE, state, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_sc_show_scenario_phrase(SubLObject state, SubLObject v_scenario) {
        {
            SubLObject scenario_phrase = rkf_scenario_manipulator.sm_scenario_phrase(v_scenario);
            if (scenario_phrase.isString()) {
                html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                html_utilities.html_princ(scenario_phrase);
                html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static final SubLObject cb_sc_show_other_scenarios(SubLObject state) {
        {
            SubLObject active_session = rkf_scenario_constructor.sc_state_active_session(state);
            SubLObject editing_sessions = remove(active_session, rkf_scenario_constructor.sc_state_construction_sessions(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject viewing_sessions = remove(active_session, rkf_scenario_constructor.sc_state_browsing_sessions(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if ((NIL != editing_sessions) || (NIL != viewing_sessions)) {
                {
                    SubLObject bgcolor = cb_sc_context_color($OTHER_SCENARIOS);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ($$$Other_Scenarios);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    if (NIL != editing_sessions) {
                        html_utilities.html_newline(TWO_INTEGER);
                        html_utilities.html_indent(TWO_INTEGER);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ($$$Scenarios_Open_for_Editing);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        {
                            SubLObject cdolist_list_var = editing_sessions;
                            SubLObject editing_session = NIL;
                            for (editing_session = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , editing_session = cdolist_list_var.first()) {
                                if (NIL != rkf_scenario_constructor.sc_session_scenario(editing_session)) {
                                    cb_sc_show_scenario_as_phrase(state, editing_session);
                                }
                            }
                        }
                    }
                    if (NIL != viewing_sessions) {
                        html_utilities.html_newline(TWO_INTEGER);
                        html_utilities.html_indent(TWO_INTEGER);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ($$$Scenarios_Open_for_Viewing);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        {
                            SubLObject cdolist_list_var = viewing_sessions;
                            SubLObject viewing_session = NIL;
                            for (viewing_session = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , viewing_session = cdolist_list_var.first()) {
                                if (NIL != rkf_scenario_constructor.sc_session_scenario(viewing_session)) {
                                    cb_sc_show_scenario_as_phrase(state, viewing_session);
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_sc_show_scenario_as_phrase(SubLObject state, SubLObject session) {
        {
            SubLObject v_scenario = rkf_scenario_constructor.sc_session_scenario(session);
            SubLObject phrase = rkf_scenario_manipulator.sm_scenario_phrase(v_scenario);
            html_utilities.html_newline(TWO_INTEGER);
            html_utilities.html_indent(TWO_INTEGER);
            html_utilities.html_princ(phrase);
            html_utilities.html_newline(UNPROVIDED);
            html_utilities.html_indent(TWO_INTEGER);
            cb_utilities.cb_link($SC_ACTIVATE, state, session, $str_alt30$_Activate_Scenario_, UNPROVIDED, UNPROVIDED);
            html_utilities.html_newline(UNPROVIDED);
            html_utilities.html_indent(TWO_INTEGER);
            cb_utilities.cb_link($SC_MERGE_SCENARIO, state, v_scenario, $str_alt95$_Merge_From_This_Scenario_, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    // deflexical
    private static final SubLSymbol $cb_sc_show_scenario_colormap$ = makeSymbol("*CB-SC-SHOW-SCENARIO-COLORMAP*");

    /**
     * Background color used when display indexicals
     */
    // defvar
    private static final SubLSymbol $cb_sc_indexical_bgcolor$ = makeSymbol("*CB-SC-INDEXICAL-BGCOLOR*");

    public static final SubLObject cb_sc_show_scenario_connectivity(SubLObject state, SubLObject v_scenario) {
        if (v_scenario == UNPROVIDED) {
            v_scenario = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == v_scenario) {
                v_scenario = rkf_scenario_constructor.sc_state_active_scenario(state);
            }
            thread.resetMultipleValues();
            {
                SubLObject connected_groups = cb_sc_show_fetch_scenario_groups(state, v_scenario);
                SubLObject isolated_groups = thread.secondMultipleValue();
                SubLObject naked_groups = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (((NIL != connected_groups) || (NIL != isolated_groups)) || (NIL != naked_groups)) {
                    {
                        SubLObject function = html_rendering.$html_node_rendering_function$.getDynamicValue(thread);
                        SubLObject colors = (NIL != $cb_sc_show_scenario_colormap$.getGlobalValue()) ? ((SubLObject) ($cb_sc_show_scenario_colormap$.getGlobalValue())) : html_rendering.$html_node_rendering_background_colormap$.getDynamicValue(thread);
                        {
                            SubLObject _prev_bind_0 = html_rendering.$html_node_rendering_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = html_rendering.$html_node_rendering_background_colormap$.currentBinding(thread);
                            try {
                                html_rendering.$html_node_rendering_function$.bind(function, thread);
                                html_rendering.$html_node_rendering_background_colormap$.bind(colors, thread);
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($$$CENTER));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(ZERO_INTEGER);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($str_alt99$90_);
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
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_rendering.html_render_link_categorized_nodes(connected_groups, isolated_groups, naked_groups);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_rendering.html_display_node_rendering_colormap();
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            } finally {
                                html_rendering.$html_node_rendering_background_colormap$.rebind(_prev_bind_1, thread);
                                html_rendering.$html_node_rendering_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
            return state;
        }
    }

    public static final SubLObject cb_sc_show_fetch_scenario_groups(SubLObject state, SubLObject v_scenario) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject nodes = cb_sc_fetch_scenario_nodes_and_links(state, v_scenario);
                SubLObject links = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != nodes) {
                    return graph_utilities.categorize_nodes_via_links(nodes, links, EQUALP);
                }
            }
            return values(NIL, NIL, NIL);
        }
    }

    /**
     *
     *
     * @unknown eventually, stop recomputing this every !&%$@ time
     */
    public static final SubLObject cb_sc_fetch_scenario_nodes_and_links(SubLObject state, SubLObject v_scenario) {
        return cb_sc_compute_scenario_nodes_and_links(v_scenario);
    }

    public static final SubLObject cb_sc_compute_scenario_nodes_and_links(SubLObject v_scenario) {
        {
            SubLObject indexical_records = rkf_scenario_manipulator.sm_scenario_terms(v_scenario);
            SubLObject constraints = rkf_scenario_manipulator.sm_scenario_constraints(v_scenario);
            SubLObject map = dictionary.new_dictionary(EQUALP, UNPROVIDED);
            SubLObject nodes = NIL;
            SubLObject links = NIL;
            {
                SubLObject cdolist_list_var = indexical_records;
                SubLObject indexical_record = NIL;
                for (indexical_record = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , indexical_record = cdolist_list_var.first()) {
                    {
                        SubLObject indexical = rkf_scenario_manipulator.sm_indexical_record_indexical(indexical_record);
                        SubLObject name = rkf_scenario_manipulator.sm_indexical_record_preferred_phrase(indexical_record);
                        nodes = cons(name, nodes);
                        dictionary.dictionary_enter(map, indexical, name);
                    }
                }
            }
            {
                SubLObject cdolist_list_var = constraints;
                SubLObject constraint = NIL;
                for (constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint = cdolist_list_var.first()) {
                    {
                        SubLObject sentence = rkf_scenario_manipulator.sm_constraint_record_sentence(constraint);
                        SubLObject new_sentence = NIL;
                        if ($$unknownSentence == cycl_utilities.formula_arg0(sentence)) {
                            sentence = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
                        }
                        new_sentence = el_utilities.copy_formula(sentence);
                        {
                            SubLObject args = cycl_utilities.formula_args(sentence, $IGNORE);
                            SubLObject cdolist_list_var_16 = args;
                            SubLObject v_term = NIL;
                            for (v_term = cdolist_list_var_16.first(); NIL != cdolist_list_var_16; cdolist_list_var_16 = cdolist_list_var_16.rest() , v_term = cdolist_list_var_16.first()) {
                                if (NIL != term.nautP(v_term, UNPROVIDED)) {
                                    v_term = narts_high.find_nart(v_term);
                                }
                                if (NIL != rkf_scenario_manipulator.sm_indexical_p(v_term)) {
                                    {
                                        SubLObject name = dictionary.dictionary_lookup(map, v_term, UNPROVIDED);
                                        nsubst(name, v_term, new_sentence, UNPROVIDED, UNPROVIDED);
                                    }
                                }
                            }
                        }
                        links = cons(new_sentence, links);
                    }
                }
            }
            return values(nodes, links);
        }
    }

    // defparameter
    private static final SubLSymbol $cb_sc_insert_target$ = makeSymbol("*CB-SC-INSERT-TARGET*");

    // deflexical
    public static final SubLSymbol $cb_sc_default_general_term$ = makeSymbol("*CB-SC-DEFAULT-GENERAL-TERM*");

    // deflexical
    private static final SubLSymbol $cb_sc_default_general_term_heading$ = makeSymbol("*CB-SC-DEFAULT-GENERAL-TERM-HEADING*");

    public static final SubLObject cb_sc_show_general_terms_with_insert(SubLObject state, SubLObject input_form, SubLObject allow_edit, SubLObject v_scenario, SubLObject merging, SubLObject heading) {
        if (allow_edit == UNPROVIDED) {
            allow_edit = T;
        }
        if (v_scenario == UNPROVIDED) {
            v_scenario = NIL;
        }
        if (merging == UNPROVIDED) {
            merging = NIL;
        }
        if (heading == UNPROVIDED) {
            heading = $cb_sc_default_general_term_heading$.getGlobalValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $cb_sc_insert_target$.currentBinding(thread);
                    try {
                        $cb_sc_insert_target$.bind(input_form, thread);
                        result = cb_sc_show_general_terms(state, allow_edit, v_scenario, merging, heading);
                    } finally {
                        $cb_sc_insert_target$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject cb_sc_show_general_terms(SubLObject state, SubLObject allow_edit, SubLObject v_scenario, SubLObject merging, SubLObject heading) {
        if (allow_edit == UNPROVIDED) {
            allow_edit = T;
        }
        if (v_scenario == UNPROVIDED) {
            v_scenario = NIL;
        }
        if (merging == UNPROVIDED) {
            merging = NIL;
        }
        if (heading == UNPROVIDED) {
            heading = $cb_sc_default_general_term_heading$.getGlobalValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == v_scenario) {
                v_scenario = rkf_scenario_constructor.sc_state_active_scenario(state);
            }
            {
                SubLObject indexical_records = rkf_scenario_manipulator.sm_scenario_terms(v_scenario);
                SubLObject indexical_map = rkf_scenario_constructor.sc_act_construct_indexical_table(rkf_scenario_constructor.sc_state_active_session(state));
                SubLObject unused_indexicals = rkf_scenario_constructor.sc_act_compute_unused_indexicals(v_scenario);
                {
                    SubLObject _prev_bind_0 = pph_vars.$pph_term_paraphrase_map$.currentBinding(thread);
                    try {
                        pph_vars.$pph_term_paraphrase_map$.bind(indexical_map, thread);
                        {
                            SubLObject bgcolor = cb_sc_context_color($INDEXICALS);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ(heading);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            if (NIL != allow_edit) {
                                html_utilities.html_newline(UNPROVIDED);
                                cb_utilities.cb_link($SC_ADD_GENERAL_TERM, state, $str_alt106$_Add_new_Actor_Prop_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_utilities.html_newline(UNPROVIDED);
                            }
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
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($str_alt107$100_);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    {
                                        SubLObject cdolist_list_var = indexical_records;
                                        SubLObject indexical_record = NIL;
                                        for (indexical_record = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , indexical_record = cdolist_list_var.first()) {
                                            {
                                                SubLObject _prev_bind_0_18 = $cb_sc_indexical_bgcolor$.currentBinding(thread);
                                                try {
                                                    $cb_sc_indexical_bgcolor$.bind(html_macros.$html_color_cyc_logo_light_violet$.getDynamicValue(thread), thread);
                                                    if (NIL == rkf_scenario_constructor.sc_indexical_record_alignedP(state, indexical_record)) {
                                                        {
                                                            SubLObject unusedP = find(indexical_record, unused_indexicals, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            cb_sc_show_indexical_record(state, indexical_record, allow_edit, merging);
                                                            cb_sc_show_indexical_type_information(state, indexical_record, allow_edit);
                                                            if (NIL == unusedP) {
                                                                cb_sc_show_indexical_specific_constraints(state, indexical_record, allow_edit);
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    $cb_sc_indexical_bgcolor$.rebind(_prev_bind_0_18, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        }
                    } finally {
                        pph_vars.$pph_term_paraphrase_map$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_sc_show_indexical_type_information(SubLObject state, SubLObject indexical_record, SubLObject allow_editP) {
        if (allow_editP == UNPROVIDED) {
            allow_editP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_scenario = rkf_scenario_constructor.sc_state_active_scenario(state);
                SubLObject type_sentences = rkf_scenario_manipulator.sm_act_compute_explicit_type_constraints(v_scenario, indexical_record);
                if (NIL != allow_editP) {
                    cb_sc_show_indexical_editable_type_information(state, indexical_record, type_sentences);
                } else {
                    {
                        SubLObject domain_mt = rkf_scenario_constructor.sc_state_domain_interaction_mt(state);
                        SubLObject language_mt = rkf_scenario_constructor.sc_state_generation_mt(state);
                        $cb_sc_indexical_bgcolor$.setDynamicValue($cb_sc_indexical_bgcolor$.getDynamicValue(thread).equal(html_macros.$html_color_cyc_logo_light_violet$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_color_cyc_logo_lighter_violet$.getDynamicValue(thread))) : html_macros.$html_color_cyc_logo_light_violet$.getDynamicValue(thread), thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        if (NIL != $cb_sc_indexical_bgcolor$.getDynamicValue(thread)) {
                            html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup($cb_sc_indexical_bgcolor$.getDynamicValue(thread));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
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
                                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                        cb_uia_display_primitives.cb_uia_show_cycl_sentence_paragraph(rkf_scenario_manipulator.sm_indexical_record_indexical(indexical_record), type_sentences, language_mt, domain_mt, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
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
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
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
            return state;
        }
    }

    public static final SubLObject cb_sc_show_indexical_editable_type_information(SubLObject state, SubLObject indexical_record, SubLObject type_sentences) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = type_sentences;
                SubLObject type_sentence = NIL;
                for (type_sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , type_sentence = cdolist_list_var.first()) {
                    {
                        SubLObject functor = cycl_utilities.formula_arg0(type_sentence);
                        SubLObject arg2 = cycl_utilities.formula_arg2(type_sentence, UNPROVIDED);
                        $cb_sc_indexical_bgcolor$.setDynamicValue($cb_sc_indexical_bgcolor$.getDynamicValue(thread).equal(html_macros.$html_color_cyc_logo_light_violet$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_color_cyc_logo_lighter_violet$.getDynamicValue(thread))) : html_macros.$html_color_cyc_logo_light_violet$.getDynamicValue(thread), thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        if (NIL != $cb_sc_indexical_bgcolor$.getDynamicValue(thread)) {
                            html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup($cb_sc_indexical_bgcolor$.getDynamicValue(thread));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
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
                                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                        cb_uia_display_primitives.cb_uia_show_sentence_with_hoverover_only(type_sentence, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        cb_utilities.cb_link($SC_DROP_TYPE_SENTENCE, state, indexical_record, functor, arg2, UNPROVIDED);
                                        if (NIL == cb_sc_is_promoted_type_sentenceP(state, indexical_record, type_sentence)) {
                                            html_utilities.html_newline(UNPROVIDED);
                                            cb_utilities.cb_link($SC_PROMOTE_TYPE_SENTENCE, state, indexical_record, functor, arg2, UNPROVIDED);
                                        }
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
            return state;
        }
    }

    public static final SubLObject cb_sc_is_promoted_type_sentenceP(SubLObject state, SubLObject indexical_record, SubLObject type_sentence) {
        {
            SubLObject v_scenario = rkf_scenario_constructor.sc_state_active_scenario(state);
            SubLObject constraint_records = rkf_scenario_manipulator.sm_act_compute_indexical_constraints(v_scenario, indexical_record);
            return subl_promotions.memberP(type_sentence, constraint_records, EQUAL, SM_CONSTRAINT_RECORD_SENTENCE);
        }
    }

    public static final SubLObject cb_sc_show_indexical_specific_constraints(SubLObject state, SubLObject indexical_record, SubLObject allow_edit) {
        {
            SubLObject v_scenario = rkf_scenario_constructor.sc_state_active_scenario(state);
            SubLObject constraint_records = rkf_scenario_manipulator.sm_act_compute_indexical_constraints(v_scenario, indexical_record);
            if (NIL != allow_edit) {
                cb_sc_show_indexical_specific_constraints_editable(state, constraint_records, v_scenario);
            } else {
                cb_sc_show_indexical_specific_constraints_readonly(state, indexical_record, constraint_records);
            }
        }
        return state;
    }

    public static final SubLObject cb_sc_show_indexical_specific_constraints_editable(SubLObject state, SubLObject constraint_records, SubLObject v_scenario) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject list_var = NIL;
                SubLObject constraint_record = NIL;
                SubLObject counter = NIL;
                for (list_var = constraint_records, constraint_record = list_var.first(), counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , constraint_record = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                    $cb_sc_indexical_bgcolor$.setDynamicValue($cb_sc_indexical_bgcolor$.getDynamicValue(thread).equal(html_macros.$html_color_cyc_logo_light_violet$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_color_cyc_logo_lighter_violet$.getDynamicValue(thread))) : html_macros.$html_color_cyc_logo_light_violet$.getDynamicValue(thread), thread);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    if (NIL != $cb_sc_indexical_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($cb_sc_indexical_bgcolor$.getDynamicValue(thread));
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    if (counter.isZero()) {
                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt112$Where__);
                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            cb_sc_show_constraint_record(state, constraint_record, T, v_scenario);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                }
            }
            return state;
        }
    }

    public static final SubLObject cb_sc_show_indexical_specific_constraints_readonly(SubLObject state, SubLObject indexical_record, SubLObject constraint_records) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sentences = NIL;
                SubLObject cdolist_list_var = constraint_records;
                SubLObject constraint_record = NIL;
                for (constraint_record = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint_record = cdolist_list_var.first()) {
                    sentences = cons(rkf_scenario_manipulator.sm_constraint_record_sentence(constraint_record), sentences);
                }
                sentences = nreverse(sentences);
                $cb_sc_indexical_bgcolor$.setDynamicValue($cb_sc_indexical_bgcolor$.getDynamicValue(thread).equal(html_macros.$html_color_cyc_logo_light_violet$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_color_cyc_logo_lighter_violet$.getDynamicValue(thread))) : html_macros.$html_color_cyc_logo_light_violet$.getDynamicValue(thread), thread);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (NIL != $cb_sc_indexical_bgcolor$.getDynamicValue(thread)) {
                    html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($cb_sc_indexical_bgcolor$.getDynamicValue(thread));
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt112$Where__);
                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
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
                            SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                {
                                    SubLObject v_term = rkf_scenario_manipulator.sm_indexical_record_indexical(indexical_record);
                                    SubLObject domain_mt = rkf_scenario_constructor.sc_state_domain_interaction_mt(state);
                                    SubLObject language_mt = rkf_scenario_constructor.sc_state_generation_mt(state);
                                    cb_uia_display_primitives.cb_uia_show_cycl_sentence_paragraph(v_term, sentences, language_mt, domain_mt, UNPROVIDED);
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_27, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
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
            return state;
        }
    }

    public static final SubLObject cb_sc_show_indexical_record(SubLObject state, SubLObject indexical_record, SubLObject allow_edit, SubLObject merging) {
        if (allow_edit == UNPROVIDED) {
            allow_edit = T;
        }
        if (merging == UNPROVIDED) {
            merging = NIL;
        }
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
                        SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
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
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            if (NIL != $cb_sc_indexical_bgcolor$.getDynamicValue(thread)) {
                html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($cb_sc_indexical_bgcolor$.getDynamicValue(thread));
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            }
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    cb_sc_show_indexical_record_int(state, indexical_record, allow_edit, merging);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
    }

    public static final SubLObject cb_sc_show_indexical_record_int(SubLObject state, SubLObject indexical_record, SubLObject allow_edit, SubLObject merging) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject preferred_phrase = rkf_scenario_manipulator.sm_indexical_record_preferred_phrase(indexical_record);
                SubLObject all_phrases = rkf_scenario_manipulator.sm_indexical_record_phrases(indexical_record);
                SubLObject allow_delete = makeBoolean((NIL != allow_edit) && (NIL == list_utilities.singletonP(all_phrases)));
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (NIL != cb_sc_show_cycl_p()) {
                            cb_sc_show_indexical_record_indexical(indexical_record);
                        }
                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                        cb_sc_show_indexical_record_phrase(state, indexical_record, preferred_phrase, allow_delete);
                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
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
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        {
                            SubLObject cdolist_list_var = all_phrases;
                            SubLObject phrase = NIL;
                            for (phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , phrase = cdolist_list_var.first()) {
                                if (!phrase.equal(preferred_phrase)) {
                                    cb_sc_show_indexical_record_phrase(state, indexical_record, phrase, allow_delete);
                                }
                            }
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                if (NIL != allow_edit) {
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_utilities.cb_link($SC_DELETE_GENERAL_TERM, state, indexical_record, $str_alt114$_Drop_Term_, UNPROVIDED, UNPROVIDED);
                            cb_utilities.cb_link($SC_ADD_GENERAL_TERM_PHRASE, state, indexical_record, $str_alt116$_Add_a_name_, UNPROVIDED, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } else
                    if ($cb_sc_insert_target$.getDynamicValue(thread).isString()) {
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_script_utilities.html_insert_input_button($cb_sc_insert_target$.getDynamicValue(thread), preferred_phrase, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } else {
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(TWO_INTEGER);
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
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }

                if (NIL != merging) {
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            {
                                SubLObject pcase_var = merging;
                                if (pcase_var.eql($TO)) {
                                    cb_utilities.cb_link($SC_MERGE_REGISTER_ALIGN_TO, state, indexical_record, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($FROM)) {
                                        cb_utilities.cb_link($SC_MERGE_REGISTER_ALIGN_FROM, state, indexical_record, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else {
                                        cb_utilities.cb_error($str_alt121$_A_is_not_a_recognized_merging_ke, merging, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }

                            }
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

    public static final SubLObject cb_sc_show_indexical_record_phrase(SubLObject state, SubLObject indexical_record, SubLObject phrase, SubLObject allow_delete) {
        html_utilities.html_glyph($NBSP, UNPROVIDED);
        html_utilities.html_princ(CHAR_quotation);
        html_utilities.html_princ(phrase);
        html_utilities.html_princ(CHAR_quotation);
        html_utilities.html_glyph($NBSP, UNPROVIDED);
        if (NIL != allow_delete) {
            html_utilities.html_indent(UNPROVIDED);
            cb_utilities.cb_link($SC_DELETE_GENERAL_TERM_PHRASE, state, indexical_record, phrase, $str_alt124$_Drop_Name_, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject cb_sc_show_indexical_record_indexical(SubLObject indexical_record) {
        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
        cb_sc_show_cycl(rkf_scenario_manipulator.sm_indexical_record_indexical(indexical_record));
        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_sc_show_constraints(SubLObject state, SubLObject allow_edit, SubLObject v_scenario) {
        if (allow_edit == UNPROVIDED) {
            allow_edit = T;
        }
        if (v_scenario == UNPROVIDED) {
            v_scenario = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == v_scenario) {
                v_scenario = rkf_scenario_constructor.sc_state_active_scenario(state);
            }
            {
                SubLObject constraint_records = rkf_scenario_manipulator.sm_scenario_constraints(v_scenario);
                SubLObject indexical_map = rkf_scenario_constructor.sc_act_construct_indexical_table(rkf_scenario_constructor.sc_state_active_session(state));
                {
                    SubLObject _prev_bind_0 = pph_vars.$pph_term_paraphrase_map$.currentBinding(thread);
                    try {
                        pph_vars.$pph_term_paraphrase_map$.bind(indexical_map, thread);
                        {
                            SubLObject bgcolor = cb_sc_context_color($CONSTRAINTS);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ($str_alt126$Constraints_and_Relationships_bet);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            if (NIL != allow_edit) {
                                html_utilities.html_newline(UNPROVIDED);
                                cb_utilities.cb_link($SC_ADD_CONSTRAINT, state, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
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
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($str_alt107$100_);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    if (NIL == cb_parameters.$cb_show_enhanced_tables$.getDynamicValue(thread)) {
                                        bgcolor = html_macros.$html_color_cyc_logo_light_violet$.getDynamicValue(thread);
                                    }
                                    {
                                        SubLObject color_toggle = NIL;
                                        SubLObject list_var = NIL;
                                        SubLObject constraint_record = NIL;
                                        SubLObject ignore_me = NIL;
                                        for (list_var = constraint_records, constraint_record = list_var.first(), ignore_me = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , constraint_record = list_var.first() , ignore_me = add(ONE_INTEGER, ignore_me)) {
                                            if (NIL != cb_parameters.$cb_show_enhanced_tables$.getDynamicValue(thread)) {
                                                if (NIL != color_toggle) {
                                                    color_toggle = NIL;
                                                } else {
                                                    color_toggle = T;
                                                }
                                                bgcolor = (NIL != color_toggle) ? ((SubLObject) (html_macros.$html_color_cyc_logo_lighter_violet$.getDynamicValue(thread))) : html_macros.$html_color_cyc_logo_light_violet$.getDynamicValue(thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            if (NIL != bgcolor) {
                                                html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(bgcolor);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                        SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt128$);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    cb_sc_show_constraint_record(state, constraint_record, allow_edit, v_scenario);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        }
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_30, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        }
                    } finally {
                        pph_vars.$pph_term_paraphrase_map$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_sc_show_constraint_record(SubLObject state, SubLObject constraint_record, SubLObject allow_edit, SubLObject v_scenario) {
        if (allow_edit == UNPROVIDED) {
            allow_edit = T;
        }
        if (v_scenario == UNPROVIDED) {
            v_scenario = NIL;
        }
        if (NIL == v_scenario) {
            v_scenario = rkf_scenario_constructor.sc_state_active_scenario(state);
        }
        {
            SubLObject nl_sentence = rkf_scenario_constructor.sc_act_constraint_record_nl_sentence(state, v_scenario, constraint_record);
            if (NIL != cb_sc_show_cycl_p()) {
                cb_sc_show_constraint_record_sentence(constraint_record);
            }
            cb_sc_show_constraint_record_nl_sentence(state, constraint_record, nl_sentence, allow_edit);
        }
        return NIL;
    }

    public static final SubLObject cb_sc_show_constraint_record_nl_sentence(SubLObject state, SubLObject constraint_record, SubLObject nl_sentence, SubLObject allow_delete) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject asent = rkf_scenario_manipulator.sm_constraint_record_sentence(constraint_record);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_uia_display_primitives.cb_uia_show_sentence_with_hoverover_only(asent, UNPROVIDED, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            if (NIL != allow_delete) {
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align($CENTER));
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_utilities.cb_link($SC_DELETE_CONSTRAINT, state, constraint_record, $str_alt130$_Drop_Constraint_, UNPROVIDED, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_sc_show_constraint_record_sentence(SubLObject constraint_record) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                    cb_sc_show_cycl(rkf_scenario_manipulator.sm_constraint_record_sentence(constraint_record));
                    html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static final SubLObject cb_sc_merge_get_one_to_alignment(SubLObject state) {
        return cb_sc_merge_get_one_alignment(state, $TO);
    }

    public static final SubLObject cb_sc_merge_get_one_from_alignment(SubLObject state) {
        return cb_sc_merge_get_one_alignment(state, $FROM);
    }

    public static final SubLObject cb_sc_merge_get_one_alignment(SubLObject state, SubLObject align_direction) {
        if (align_direction == UNPROVIDED) {
            align_direction = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject merge_info = rkf_scenario_constructor.sc_state_merge_info(state);
                SubLObject from_scenario = rkf_scenario_manipulator.sm_merge_info_from_scenario(merge_info);
                SubLObject indexical_equivalences = rkf_scenario_manipulator.sm_merge_info_indexical_equivalences(merge_info);
                SubLObject interaction = rkf_scenario_constructor.sc_state_interaction(state);
                if (NIL != user_interaction_agenda.user_interaction_p(interaction)) {
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
                                SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_sc_show_merge_to_scenario_actions(state);
                                    cb_sc_show_merge_from_scenario_actions(state, from_scenario);
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
                                    cb_sc_show_constraints(state, NIL, UNPROVIDED);
                                    cb_sc_show_constraints(state, NIL, from_scenario);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            cb_sc_show_merge_alignments(state, indexical_equivalences, align_direction);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    {
                                        SubLObject pcase_var = align_direction;
                                        if (pcase_var.eql($TO)) {
                                            cb_sc_show_general_terms(state, NIL, NIL, $TO, UNPROVIDED);
                                            cb_sc_show_general_terms(state, NIL, from_scenario, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($FROM)) {
                                                cb_sc_show_general_terms(state, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                cb_sc_show_general_terms(state, NIL, from_scenario, $FROM, UNPROVIDED);
                                            }

                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_35, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } else {
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    {
                        SubLObject bgcolor = cb_sc_context_color($BACKGROUND);
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
                                    SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_38 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_sc_show_merge_to_scenario_actions(state);
                                                        cb_sc_show_merge_from_scenario_actions(state, from_scenario);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
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
                                                        cb_sc_show_constraints(state, NIL, UNPROVIDED);
                                                        cb_sc_show_constraints(state, NIL, from_scenario);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                cb_sc_show_merge_alignments(state, indexical_equivalences, align_direction);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        {
                                                            SubLObject pcase_var = align_direction;
                                                            if (pcase_var.eql($TO)) {
                                                                cb_sc_show_general_terms(state, NIL, NIL, $TO, UNPROVIDED);
                                                                cb_sc_show_general_terms(state, NIL, from_scenario, UNPROVIDED, UNPROVIDED);
                                                            } else
                                                                if (pcase_var.eql($FROM)) {
                                                                    cb_sc_show_general_terms(state, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    cb_sc_show_general_terms(state, NIL, from_scenario, $FROM, UNPROVIDED);
                                                                }

                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_40, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
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

    public static final SubLObject cb_sc_show_merge_to_scenario_actions(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject to_scenario = rkf_scenario_constructor.sc_state_active_scenario(state);
                SubLObject bgcolor = cb_sc_context_color($SCENARIO_ACTIONS);
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
                    html_utilities.html_markup($str_alt131$20_);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ($str_alt132$Merging_To_Scenario_);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        cb_sc_show_scenario_phrase(state, to_scenario);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_sc_show_merge_from_scenario_actions(SubLObject state, SubLObject from_scenario) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject bgcolor = cb_sc_context_color($SCENARIO_ACTIONS);
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
                    html_utilities.html_markup($str_alt131$20_);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ($str_alt133$Merging_From_Scenario_);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        cb_sc_show_scenario_phrase(state, from_scenario);
                        html_utilities.html_newline(TWO_INTEGER);
                        cb_utilities.cb_link($SC_ELABORATE, state, $str_alt134$Select_a_Different_Merge_From_Sce, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_sc_show_merge_alignments(SubLObject state, SubLObject indexical_equivalences, SubLObject align_direction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject bgcolor = cb_sc_context_color($MERGE);
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
                            html_utilities.html_markup(TWO_INTEGER);
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
                            SubLObject _prev_bind_0_41 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_utilities.html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
                                html_utilities.html_simple_attribute(html_macros.$html_table_nowrap$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(ZERO_INTEGER);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($str_alt107$100_);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_43 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_44 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_utilities.html_princ($$$Aligned_Terms);
                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        if (align_direction == $TO) {
                                                            cb_utilities.cb_link($SC_DO_MERGE, state, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                        html_utilities.html_indent(FIVE_INTEGER);
                                                        cb_utilities.cb_link($SC_ABANDON_MERGE, state, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_43, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        {
                                            SubLObject cdolist_list_var = indexical_equivalences;
                                            SubLObject indexical_equivalence = NIL;
                                            for (indexical_equivalence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , indexical_equivalence = cdolist_list_var.first()) {
                                                {
                                                    SubLObject datum = indexical_equivalence;
                                                    SubLObject current = datum;
                                                    SubLObject to_indexical_record = NIL;
                                                    SubLObject from_indexical_record = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt139);
                                                    to_indexical_record = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt139);
                                                    from_indexical_record = current.first();
                                                    current = current.rest();
                                                    if (NIL == current) {
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_46 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup($str_alt140$50_);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_47 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        cb_sc_show_indexical_record_int(state, to_indexical_record, NIL, NIL);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_47, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup($str_alt140$50_);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        cb_sc_show_indexical_record_int(state, from_indexical_record, NIL, NIL);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_48, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    } else {
                                                        cdestructuring_bind_error(datum, $list_alt139);
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_42, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_41, thread);
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

    public static final SubLObject cb_sc_elaborate_template(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject state_id_string = NIL;
            SubLObject template_id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt141);
            state_id_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt141);
            template_id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_scenario_constructor.sc_find_state_by_id_string(state_id_string);
                    SubLObject template = rkf_scenario_manipulator.sm_find_template_by_id_string(template_id_string);
                    return cb_sc_show_elaborate_template(state, template);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt141);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_sc_elaborate_template(SubLObject state, SubLObject template, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt143$_Show_Generalized_Scenario_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt144$cb_sc_elaborate_template__A__A, rkf_scenario_constructor.sc_state_id(state), rkf_scenario_manipulator.sm_template_id(template));
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
                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_utilities.html_princ(linktext);
                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_sc_show_elaborate_template(SubLObject state, SubLObject template) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject interaction = rkf_scenario_constructor.sc_state_interaction(state);
                if (NIL != user_interaction_agenda.user_interaction_p(interaction)) {
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
                                SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_sc_show_template_actions(state, template);
                                    cb_sc_show_other_scenarios(state);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
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
                                    cb_sc_show_template_parameters(state, template);
                                    cb_sc_show_nothing();
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_50, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_51 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_sc_show_template_terms(state, template);
                                    cb_sc_show_template_constraints(state, template);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_51, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } else {
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    {
                        SubLObject bgcolor = cb_sc_context_color($BACKGROUND);
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
                                    SubLObject _prev_bind_0_52 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_53 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_54 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_sc_show_template_actions(state, template);
                                                        cb_sc_show_other_scenarios(state);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_54, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_55 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_sc_show_template_parameters(state, template);
                                                        cb_sc_show_nothing();
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_55, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_56 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_sc_show_template_terms(state, template);
                                                        cb_sc_show_template_constraints(state, template);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_56, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_53, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_52, thread);
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

    public static final SubLObject cb_sc_show_template_actions(SubLObject state, SubLObject template) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject bgcolor = cb_sc_context_color($SCENARIO_ACTIONS);
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
                    html_utilities.html_markup($str_alt131$20_);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        cb_utilities.cb_link($SC_ELABORATE_TEMPLATE, state, template, $$$Generalized_Scenario, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        cb_sc_show_template_phrase(state, template);
                        html_utilities.html_newline(UNPROVIDED);
                        cb_utilities.cb_link($SC_SAVE_SCENARIO, state, template, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_newline(UNPROVIDED);
                        cb_utilities.cb_link($SC_FORGET_GENERALIZATION, state, template, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_sc_show_template_phrase(SubLObject state, SubLObject template) {
        {
            SubLObject template_phrase = rkf_scenario_manipulator.sm_template_phrase(template);
            html_utilities.html_newline(UNPROVIDED);
            html_utilities.html_princ(template_phrase);
        }
        return NIL;
    }

    public static final SubLObject cb_sc_show_template_parameters(SubLObject state, SubLObject template) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject bgcolor = cb_sc_context_color($TEMPLATE_PARAMETERS);
                SubLObject parameters = rkf_scenario_manipulator.sm_template_parameters(template);
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
                    html_utilities.html_markup($str_alt131$20_);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ($$$Parameters);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        {
                            SubLObject cdolist_list_var = parameters;
                            SubLObject parameter = NIL;
                            for (parameter = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parameter = cdolist_list_var.first()) {
                                cb_sc_show_template_parameter(parameter);
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

    public static final SubLObject cb_sc_show_template_parameter(SubLObject parameter) {
        html_utilities.html_newline(UNPROVIDED);
        if (NIL != cb_sc_show_cycl_p()) {
            cb_sc_show_indexical_record_indexical(parameter);
        }
        {
            SubLObject phrases = rkf_scenario_manipulator.sm_indexical_record_phrases(parameter);
            SubLObject cdolist_list_var = phrases;
            SubLObject phrase = NIL;
            for (phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , phrase = cdolist_list_var.first()) {
                html_utilities.html_newline(UNPROVIDED);
                html_utilities.html_princ(phrase);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_sc_show_nothing() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_princ($str_alt128$);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static final SubLObject cb_sc_show_template_terms(SubLObject state, SubLObject template) {
        cb_sc_show_general_terms(state, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_sc_show_template_constraints(SubLObject state, SubLObject template) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject constraint_records = rkf_scenario_manipulator.sm_template_constraints(template);
                SubLObject bgcolor = cb_sc_context_color($CONSTRAINTS);
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
                        html_utilities.html_princ($$$Constraints);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        {
                            SubLObject cdolist_list_var = constraint_records;
                            SubLObject constraint_record = NIL;
                            for (constraint_record = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint_record = cdolist_list_var.first()) {
                                cb_sc_show_constraint_record(state, constraint_record, NIL, UNPROVIDED);
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

    public static final SubLObject cb_link_sc_activate(SubLObject state, SubLObject session, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt30$_Activate_Scenario_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt152$cb_sc_activate__A__A, rkf_scenario_constructor.sc_state_id(state), rkf_scenario_constructor.sc_session_id(session));
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
                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_utilities.html_princ(linktext);
                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_sc_activate(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject state_id_string = NIL;
            SubLObject session_id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt154);
            state_id_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt154);
            session_id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_scenario_constructor.sc_find_state_by_id_string(state_id_string);
                    SubLObject session = rkf_scenario_constructor.sc_find_session_by_id_string(session_id_string);
                    rkf_scenario_constructor.sc_act_activate_session(state, session);
                    return cb_sc_elaborate_guts(state);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt154);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_sc_discard_scenario(SubLObject state, SubLObject v_scenario, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt156$_Discard_Scenario_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt157$cb_sc_discard_scenario__A, rkf_scenario_constructor.sc_state_id(state));
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
                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_utilities.html_princ(linktext);
                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_sc_discard_scenario(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt32);
            id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_scenario_constructor.sc_find_state_by_id_string(id_string);
                    SubLObject session = rkf_scenario_constructor.sc_state_active_session(state);
                    rkf_scenario_constructor.sc_act_discard_session(session);
                    return cb_sc_open_scenarios_guts(state);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt32);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_sc_generalize_scenario(SubLObject state, SubLObject v_scenario, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt160$_Generalize_Scenario_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt161$cb_sc_generalize_scenario__A, rkf_scenario_constructor.sc_state_id(state));
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
                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_utilities.html_princ(linktext);
                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_sc_generalize_scenario(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt32);
            id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_scenario_constructor.sc_find_state_by_id_string(id_string);
                    SubLObject v_scenario = rkf_scenario_constructor.sc_state_active_scenario(state);
                    SubLObject template = rkf_scenario_constructor.sc_act_generalize_scenario(state, v_scenario);
                    return cb_sc_show_elaborate_template(state, template);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt32);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_sc_save_scenario(SubLObject state, SubLObject template, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt164$_Save_Scenario_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt165$cb_sc_save_scenario__A__A, rkf_scenario_constructor.sc_state_id(state), rkf_scenario_manipulator.sm_template_id(template));
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
                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_utilities.html_princ(linktext);
                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_sc_save_scenario(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject state_id_string = NIL;
            SubLObject template_id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt141);
            state_id_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt141);
            template_id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_scenario_constructor.sc_find_state_by_id_string(state_id_string);
                    SubLObject template = rkf_scenario_manipulator.sm_find_template_by_id_string(template_id_string);
                    SubLObject v_scenario = rkf_scenario_constructor.sc_state_active_scenario(state);
                    rkf_scenario_constructor.sc_act_save_scenario(state, v_scenario, template);
                    return cb_sc_elaborate_guts(state);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt141);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_sc_forget_generalization(SubLObject state, SubLObject template, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt168$_Forget_Generalization_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt169$cb_sc_forget_generalization__A__A, rkf_scenario_constructor.sc_state_id(state), rkf_scenario_manipulator.sm_template_id(template));
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
                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_utilities.html_princ(linktext);
                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_sc_forget_generalization(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject state_id_string = NIL;
            SubLObject template_id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt141);
            state_id_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt141);
            template_id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_scenario_constructor.sc_find_state_by_id_string(state_id_string);
                    SubLObject template = rkf_scenario_manipulator.sm_find_template_by_id_string(template_id_string);
                    SubLObject v_scenario = rkf_scenario_constructor.sc_state_active_scenario(state);
                    rkf_scenario_constructor.sc_act_discard_template(state, v_scenario, template);
                    return cb_sc_elaborate_guts(state);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt141);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_sc_modify_scenario_phrase(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject id_string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt32);
                id_string = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject state = rkf_scenario_constructor.sc_find_state_by_id_string(id_string);
                        SubLObject v_scenario = rkf_scenario_constructor.sc_state_active_scenario(state);
                        SubLObject old_phrase = rkf_scenario_manipulator.sm_scenario_phrase(v_scenario);
                        SubLObject interaction = rkf_scenario_constructor.sc_state_interaction(state);
                        if (NIL != user_interaction_agenda.user_interaction_p(interaction)) {
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
                                        html_utilities.html_hidden_input($str_alt172$cb_handle_sc_modify_scenario_phra, T, UNPROVIDED);
                                        html_utilities.html_hidden_input($str_alt69$state_id, id_string, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt173$Enter_a_better_phrase_to_name_the);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_indent(FOUR_INTEGER);
                                        html_utilities.html_submit_input($$$Modify_Phrase, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_reset_input($$$Clear);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($str_alt175$scenario_phrase);
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
                                            html_utilities.html_markup(TEN_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($$$virtual);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_57 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_princ(old_phrase);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_57, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
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
                        } else {
                            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                            {
                                SubLObject bgcolor = cb_sc_context_color($BACKGROUND);
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
                                            SubLObject _prev_bind_0_58 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
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
                                                        SubLObject _prev_bind_0_59 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                        SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_macros.$within_html_form$.bind(T, thread);
                                                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                            html_utilities.html_hidden_input($str_alt172$cb_handle_sc_modify_scenario_phra, T, UNPROVIDED);
                                                            html_utilities.html_hidden_input($str_alt69$state_id, id_string, UNPROVIDED);
                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            html_utilities.html_princ($str_alt173$Enter_a_better_phrase_to_name_the);
                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                            html_utilities.html_indent(FOUR_INTEGER);
                                                            html_utilities.html_submit_input($$$Modify_Phrase, UNPROVIDED, UNPROVIDED);
                                                            html_utilities.html_reset_input($$$Clear);
                                                            html_utilities.html_newline(UNPROVIDED);
                                                            html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup($str_alt175$scenario_phrase);
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
                                                                html_utilities.html_markup(TEN_INTEGER);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup($$$virtual);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_60 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_princ(old_phrase);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_60, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                        } finally {
                                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                            html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_59, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                }
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
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt32);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_sc_modify_scenario_phrase(SubLObject state, SubLObject v_scenario, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt177$_Modify_Name_of_Scenario_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt178$cb_sc_modify_scenario_phrase__A, rkf_scenario_constructor.sc_state_id(state));
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
                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_utilities.html_princ(linktext);
                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_handle_sc_modify_scenario_phrase(SubLObject args) {
        {
            SubLObject id_string = html_utilities.html_extract_input($str_alt69$state_id, args);
            SubLObject state = rkf_scenario_constructor.sc_find_state_by_id_string(id_string);
            SubLObject session = rkf_scenario_constructor.sc_state_active_session(state);
            SubLObject scenario_phrase = html_utilities.html_extract_input($str_alt175$scenario_phrase, args);
            rkf_scenario_constructor.sc_act_modify_phrase(session, scenario_phrase);
            return cb_sc_elaborate_guts(state);
        }
    }

    public static final SubLObject cb_sc_add_general_term(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject id_string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt32);
                id_string = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject state = rkf_scenario_constructor.sc_find_state_by_id_string(id_string);
                        SubLObject v_scenario = rkf_scenario_constructor.sc_state_active_scenario(state);
                        SubLObject interaction = rkf_scenario_constructor.sc_state_interaction(state);
                        if (NIL != user_interaction_agenda.user_interaction_p(interaction)) {
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
                                        html_utilities.html_hidden_input($str_alt181$cb_handle_sc_add_general_term, T, UNPROVIDED);
                                        html_utilities.html_hidden_input($str_alt69$state_id, rkf_scenario_constructor.sc_state_id(state), UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_princ($str_alt182$Enter_a_name_for_this_participant);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_text_input($str_alt183$indexical_phrase, NIL, $int$30);
                                        cb_sc_provide_general_term_naming_hint(state);
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_princ($str_alt185$For_the_purposes_of_constructing_);
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt186$Please_enter_at_least_one_of_the_);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(ZERO_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_61 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_62 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($$$right));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_63 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($str_alt188$It_is_an_individual_instance_of_);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_63, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($$$right));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_64 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($str_alt85$_);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_64, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($$$left));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_65 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_text_input($str_alt190$isa_phrase, NIL, TWENTY_INTEGER);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_65, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_62, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                cb_sc_offer_previous_general_term_isas(state, v_scenario);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_66 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($$$right));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_67 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($str_alt191$It_is_a_more_specific_kind_of_);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_67, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($$$right));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_68 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($str_alt85$_);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_68, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($$$left));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_69 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_text_input($str_alt192$genl_phrase, NIL, TWENTY_INTEGER);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_69, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_66, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                cb_sc_offer_previous_general_term_genls(state, v_scenario);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_70 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($$$right));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_71 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($str_alt193$It_is_similar_to_);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_71, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($$$right));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_72 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($str_alt85$_);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_72, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($$$left));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_73 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_text_input($str_alt194$exemplar_phrase, NIL, TWENTY_INTEGER);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_73, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_70, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_61, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_submit_input($$$Add_this_Participant, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_indent(UNPROVIDED);
                                        html_utilities.html_reset_input($$$Clear);
                                        html_utilities.html_indent(UNPROVIDED);
                                        cb_utilities.cb_link($UIA_NEXT_INTERACTION, $str_alt197$_Continue_without_Adding_Particip, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
                        } else {
                            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                            {
                                SubLObject bgcolor = cb_sc_context_color($BACKGROUND);
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
                                            SubLObject _prev_bind_0_74 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
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
                                                        SubLObject _prev_bind_0_75 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                        SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_macros.$within_html_form$.bind(T, thread);
                                                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                            html_utilities.html_hidden_input($str_alt181$cb_handle_sc_add_general_term, T, UNPROVIDED);
                                                            html_utilities.html_hidden_input($str_alt69$state_id, rkf_scenario_constructor.sc_state_id(state), UNPROVIDED);
                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            html_utilities.html_newline(TWO_INTEGER);
                                                            html_utilities.html_princ($str_alt182$Enter_a_name_for_this_participant);
                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                            html_utilities.html_text_input($str_alt183$indexical_phrase, NIL, $int$30);
                                                            cb_sc_provide_general_term_naming_hint(state);
                                                            html_utilities.html_newline(TWO_INTEGER);
                                                            html_utilities.html_princ($str_alt185$For_the_purposes_of_constructing_);
                                                            html_utilities.html_newline(TWO_INTEGER);
                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            html_utilities.html_princ($str_alt186$Please_enter_at_least_one_of_the_);
                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(ZERO_INTEGER);
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
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(html_utilities.html_align($$$right));
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_78 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_utilities.html_princ($str_alt188$It_is_an_individual_instance_of_);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_78, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(html_utilities.html_align($$$right));
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_79 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_utilities.html_princ($str_alt85$_);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_79, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(html_utilities.html_align($$$left));
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_80 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_utilities.html_text_input($str_alt190$isa_phrase, NIL, TWENTY_INTEGER);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_80, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_77, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                    cb_sc_offer_previous_general_term_isas(state, v_scenario);
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
                                                                                html_utilities.html_markup(html_utilities.html_align($$$right));
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_82 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_utilities.html_princ($str_alt191$It_is_a_more_specific_kind_of_);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_82, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(html_utilities.html_align($$$right));
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_83 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_utilities.html_princ($str_alt85$_);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_83, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(html_utilities.html_align($$$left));
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_84 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_utilities.html_text_input($str_alt192$genl_phrase, NIL, TWENTY_INTEGER);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_84, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_81, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                    cb_sc_offer_previous_general_term_genls(state, v_scenario);
                                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_85 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(html_utilities.html_align($$$right));
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_86 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_utilities.html_princ($str_alt193$It_is_similar_to_);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_86, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(html_utilities.html_align($$$right));
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_87 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_utilities.html_princ($str_alt85$_);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_87, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(html_utilities.html_align($$$left));
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_88 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_utilities.html_text_input($str_alt194$exemplar_phrase, NIL, TWENTY_INTEGER);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_88, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_85, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_76, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                            html_utilities.html_newline(UNPROVIDED);
                                                            html_utilities.html_submit_input($$$Add_this_Participant, UNPROVIDED, UNPROVIDED);
                                                            html_utilities.html_indent(UNPROVIDED);
                                                            html_utilities.html_reset_input($$$Clear);
                                                            html_utilities.html_indent(UNPROVIDED);
                                                            cb_utilities.cb_link($UIA_NEXT_INTERACTION, $str_alt197$_Continue_without_Adding_Particip, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                        } finally {
                                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                            html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_75, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_74, thread);
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
                    cdestructuring_bind_error(datum, $list_alt32);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @unknown this sucks -- this is hardcoding the example independent of the domain
     */
    public static final SubLObject cb_sc_provide_general_term_naming_hint(SubLObject state) {
        {
            SubLObject type_collections_make_senseP = T;
            SubLObject collection_example = $$$the_molecule;
            SubLObject type_collection_example = (NIL != type_collections_make_senseP) ? ((SubLObject) ($$$the_type_of_molecule)) : NIL;
            html_utilities.html_newline(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
            html_utilities.html_princ($str_alt201$Hint__It_will_usually_be_better_t);
            html_utilities.html_princ(collection_example);
            if (NIL != type_collections_make_senseP) {
                html_utilities.html_princ($str_alt202$__or__);
                html_utilities.html_princ(type_collection_example);
            }
            html_utilities.html_princ($str_alt203$____that_doesn_t_refer_to_an_exis);
            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
        }
        return state;
    }

    public static final SubLObject cb_sc_offer_previous_general_term_isas(SubLObject state, SubLObject v_scenario) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject previous_isas = rkf_scenario_manipulator.sm_act_get_all_isas_for_indexicals(v_scenario);
                if (NIL != previous_isas) {
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align($CENTER));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_89 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                    html_utilities.html_princ($$$or_reuse_a_category);
                                    html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_89, thread);
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
                                SubLObject _prev_bind_0_90 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_checkbox_input($str_alt205$previous_isa_chosen, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    html_utilities.html_indent(UNPROVIDED);
                                    {
                                        SubLObject domain_mt = rkf_scenario_constructor.sc_state_domain_interaction_mt(state);
                                        SubLObject generation_mt = rkf_scenario_constructor.sc_state_generation_mt(state);
                                        html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($str_alt206$previous_isas);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(ONE_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_91 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                {
                                                    SubLObject cdolist_list_var = previous_isas;
                                                    SubLObject v_isa = NIL;
                                                    for (v_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_isa = cdolist_list_var.first()) {
                                                        if (NIL == rkf_relevance_utilities.rkf_irrelevant_term(v_isa, domain_mt)) {
                                                            {
                                                                SubLObject generation = rkf_concept_communicator.rkf_term_phrase(v_isa, generation_mt, domain_mt, UNPROVIDED, UNPROVIDED);
                                                                SubLObject value = cb_sc_generate_term_signature(v_isa, $$$isa);
                                                                html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                if (NIL != value) {
                                                                    html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(value);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_92 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ(generation);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_92, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_91, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_90, thread);
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
            return state;
        }
    }

    public static final SubLObject cb_sc_offer_previous_general_term_genls(SubLObject state, SubLObject v_scenario) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject previous_genls = rkf_scenario_manipulator.sm_act_get_all_genls_for_indexicals(v_scenario);
                if (NIL != previous_genls) {
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align($CENTER));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_93 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                    html_utilities.html_princ($$$or_reuse_a_category);
                                    html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_93, thread);
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
                                SubLObject _prev_bind_0_94 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_checkbox_input($str_alt208$previous_genls_chosen, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    html_utilities.html_indent(UNPROVIDED);
                                    {
                                        SubLObject domain_mt = rkf_scenario_constructor.sc_state_domain_interaction_mt(state);
                                        SubLObject generation_mt = rkf_scenario_constructor.sc_state_generation_mt(state);
                                        html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($str_alt209$previous_genls);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(ONE_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_95 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                {
                                                    SubLObject cdolist_list_var = previous_genls;
                                                    SubLObject genl = NIL;
                                                    for (genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl = cdolist_list_var.first()) {
                                                        if (NIL == rkf_relevance_utilities.rkf_irrelevant_term(genl, domain_mt)) {
                                                            {
                                                                SubLObject generation = rkf_concept_communicator.rkf_term_phrase(genl, generation_mt, domain_mt, UNPROVIDED, UNPROVIDED);
                                                                SubLObject value = cb_sc_generate_term_signature(genl, $$$genl);
                                                                html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                if (NIL != value) {
                                                                    html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(value);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_96 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ(generation);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_96, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_95, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_94, thread);
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
            return state;
        }
    }



    public static final SubLObject clear_cb_sc_generate_term_signature() {
        {
            SubLObject cs = $cb_sc_generate_term_signature_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_cb_sc_generate_term_signature(SubLObject v_term, SubLObject stem) {
        return memoization_state.caching_state_remove_function_results_with_args($cb_sc_generate_term_signature_caching_state$.getGlobalValue(), list(v_term, stem), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cb_sc_generate_term_signature_internal(SubLObject v_term, SubLObject stem) {
        {
            SubLObject type = (NIL != constant_handles.constant_p(v_term)) ? ((SubLObject) ($$$C)) : $$$N;
            SubLObject id = (NIL != constant_handles.constant_p(v_term)) ? ((SubLObject) (constant_handles.constant_suid(v_term))) : nart_handles.nart_id(v_term);
            return cconcatenate(stem, new SubLObject[]{ $str_alt214$_, type, $str_alt214$_, string_utilities.to_string(id) });
        }
    }

    public static final SubLObject cb_sc_generate_term_signature(SubLObject v_term, SubLObject stem) {
        {
            SubLObject caching_state = $cb_sc_generate_term_signature_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(CB_SC_GENERATE_TERM_SIGNATURE, $cb_sc_generate_term_signature_caching_state$, NIL, EQL, TWO_INTEGER, TEN_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, stem);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw216$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (v_term.eql(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && stem.eql(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(cb_sc_generate_term_signature_internal(v_term, stem)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, stem));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }



    public static final SubLObject clear_cb_sc_crack_term_signature() {
        {
            SubLObject cs = $cb_sc_crack_term_signature_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_cb_sc_crack_term_signature(SubLObject string) {
        return memoization_state.caching_state_remove_function_results_with_args($cb_sc_crack_term_signature_caching_state$.getGlobalValue(), list(string), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cb_sc_crack_term_signature_internal(SubLObject string) {
        {
            SubLObject tokens = string_utilities.string_tokenize(string, $list_alt218, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject stem = tokens.first();
            SubLObject type = second(tokens);
            SubLObject id = parse_integer(third(tokens), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject fort = NIL;
            if (NIL != Strings.stringE(type, $$$N, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                fort = nart_handles.find_nart_by_id(id);
            } else {
                fort = constant_handles.find_constant_by_suid(id);
            }
            return values(stem, fort);
        }
    }

    public static final SubLObject cb_sc_crack_term_signature(SubLObject string) {
        {
            SubLObject caching_state = $cb_sc_crack_term_signature_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(CB_SC_CRACK_TERM_SIGNATURE, $cb_sc_crack_term_signature_caching_state$, NIL, EQL, ONE_INTEGER, TEN_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, string, $kw216$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw216$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(cb_sc_crack_term_signature_internal(string)));
                    memoization_state.caching_state_put(caching_state, string, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static final SubLObject cb_link_sc_add_general_term(SubLObject state, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt220$_Add_new_General_Term_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt221$cb_sc_add_general_term__A, rkf_scenario_constructor.sc_state_id(state));
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
                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_utilities.html_princ(linktext);
                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_handle_sc_add_general_term(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id_string = html_utilities.html_extract_input($str_alt69$state_id, args);
                SubLObject state = rkf_scenario_constructor.sc_find_state_by_id_string(id_string);
                SubLObject interaction = rkf_scenario_constructor.sc_state_interaction(state);
                SubLObject indexical_phrase = html_utilities.html_extract_input($str_alt183$indexical_phrase, args);
                SubLObject isa_phrase = html_utilities.html_extract_input($str_alt190$isa_phrase, args);
                SubLObject genl_phrase = html_utilities.html_extract_input($str_alt192$genl_phrase, args);
                SubLObject chose_isa_phraseP = html_utilities.html_extract_input($str_alt205$previous_isa_chosen, args);
                SubLObject chose_genls_phraseP = html_utilities.html_extract_input($str_alt208$previous_genls_chosen, args);
                SubLObject exemplar_phrase = html_utilities.html_extract_input($str_alt194$exemplar_phrase, args);
                SubLObject isa_term = NIL;
                SubLObject genl_term = NIL;
                indexical_phrase = string_utilities.trim_whitespace(indexical_phrase);
                if (NIL != string_utilities.empty_string_p(exemplar_phrase)) {
                    exemplar_phrase = NIL;
                }
                if (NIL != string_utilities.empty_string_p(genl_phrase)) {
                    genl_phrase = NIL;
                    if (NIL != chose_genls_phraseP) {
                        {
                            SubLObject genl_signature = html_utilities.html_extract_input($str_alt209$previous_genls, args);
                            if (!((NIL == genl_signature) || (NIL != string_utilities.empty_string_p(genl_signature)))) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject stem = cb_sc_crack_term_signature(genl_signature);
                                    SubLObject fort = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    genl_term = fort;
                                }
                            }
                        }
                    }
                }
                if (NIL != string_utilities.empty_string_p(isa_phrase)) {
                    isa_phrase = NIL;
                    if (NIL != chose_isa_phraseP) {
                        {
                            SubLObject isa_signature = html_utilities.html_extract_input($str_alt206$previous_isas, args);
                            if (!((NIL == isa_signature) || (NIL != string_utilities.empty_string_p(isa_signature)))) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject stem = cb_sc_crack_term_signature(isa_signature);
                                    SubLObject fort = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    isa_term = fort;
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $ADD_GENERAL_TERM, list(new SubLObject[]{ $INDEXICAL_PHRASE, indexical_phrase, $ISA_PHRASE, isa_phrase, $GENL_PHRASE, genl_phrase, $ISA_TERM, isa_term, $GENL_TERM, genl_term, $EXEMPLAR_PHRASE, exemplar_phrase }));
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            }
        }
    }

    public static final SubLObject cb_link_sc_delete_general_term(SubLObject state, SubLObject indexical_record, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt231$_Delete_General_Term_;
            }
            {
                SubLObject ir_id = rkf_scenario_manipulator.sm_indexical_record_id(indexical_record);
                SubLObject state_id = rkf_scenario_constructor.sc_state_id(state);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt232$cb_sc_delete_general_term__A__A, state_id, ir_id);
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
                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_utilities.html_princ(linktext);
                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_sc_delete_general_term(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject state_id_string = NIL;
            SubLObject ir_id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt234);
            state_id_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt234);
            ir_id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_scenario_constructor.sc_find_state_by_id_string(state_id_string);
                    SubLObject session = rkf_scenario_constructor.sc_state_active_session(state);
                    SubLObject indexical_record = rkf_scenario_manipulator.sm_find_indexical_record_by_id_string(ir_id_string);
                    rkf_scenario_constructor.sc_act_remove_indexical(session, indexical_record);
                    return cb_sc_elaborate_guts(state);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt234);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_sc_drop_type_sentence(SubLObject state, SubLObject indexical_record, SubLObject type, SubLObject col, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt236$_Drop_Assumption_;
            }
            {
                SubLObject ir_id = rkf_scenario_manipulator.sm_indexical_record_id(indexical_record);
                SubLObject state_id = rkf_scenario_constructor.sc_state_id(state);
                SubLObject type_code = (type == $$isa) ? ((SubLObject) (CHAR_I)) : CHAR_G;
                SubLObject fort_type = (NIL != nart_handles.nart_p(col)) ? ((SubLObject) (CHAR_N)) : CHAR_C;
                SubLObject col_id = (NIL != nart_handles.nart_p(col)) ? ((SubLObject) (nart_handles.nart_id(col))) : constant_handles.constant_suid(col);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt238$cb_sc_drop_type_sentence__A__A__A, new SubLObject[]{ state_id, ir_id, type_code, fort_type, col_id });
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
                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_utilities.html_princ(linktext);
                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_sc_drop_type_sentence(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject state_id_string = NIL;
            SubLObject ir_id_string = NIL;
            SubLObject type_code_string = NIL;
            SubLObject fort_type_string = NIL;
            SubLObject col_id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt240);
            state_id_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt240);
            ir_id_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt240);
            type_code_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt240);
            fort_type_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt240);
            col_id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_scenario_constructor.sc_find_state_by_id_string(state_id_string);
                    SubLObject session = rkf_scenario_constructor.sc_state_active_session(state);
                    SubLObject domain_mt = rkf_scenario_constructor.sc_state_domain_interaction_mt(state);
                    SubLObject indexical_record = rkf_scenario_manipulator.sm_find_indexical_record_by_id_string(ir_id_string);
                    SubLObject type = (NIL != char_equal(Strings.sublisp_char(type_code_string, ZERO_INTEGER), CHAR_I)) ? ((SubLObject) ($$isa)) : $$genls;
                    SubLObject fort_type = (NIL != char_equal(Strings.sublisp_char(fort_type_string, ZERO_INTEGER), CHAR_N)) ? ((SubLObject) ($NART)) : $CONSTANT;
                    SubLObject col_id = parse_integer(col_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject collection = (fort_type == $NART) ? ((SubLObject) (nart_handles.find_nart_by_id(col_id))) : constant_handles.find_constant_by_suid(col_id);
                    rkf_scenario_constructor.sc_act_remove_isaXgenls_constraint(session, indexical_record, collection, domain_mt, type);
                    return cb_sc_elaborate_guts(state);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt240);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_sc_promote_type_sentence(SubLObject state, SubLObject indexical_record, SubLObject type, SubLObject col, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt245$_Promote_to_Constraint_;
            }
            {
                SubLObject ir_id = rkf_scenario_manipulator.sm_indexical_record_id(indexical_record);
                SubLObject state_id = rkf_scenario_constructor.sc_state_id(state);
                SubLObject type_code = (type == $$isa) ? ((SubLObject) (CHAR_I)) : CHAR_G;
                SubLObject fort_type = (NIL != nart_handles.nart_p(col)) ? ((SubLObject) (CHAR_N)) : CHAR_C;
                SubLObject col_id = (NIL != nart_handles.nart_p(col)) ? ((SubLObject) (nart_handles.nart_id(col))) : constant_handles.constant_suid(col);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt246$cb_sc_promote_type_sentence__A__A, new SubLObject[]{ state_id, ir_id, type_code, fort_type, col_id });
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
                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_utilities.html_princ(linktext);
                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_sc_promote_type_sentence(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject state_id_string = NIL;
            SubLObject ir_id_string = NIL;
            SubLObject type_code_string = NIL;
            SubLObject fort_type_string = NIL;
            SubLObject col_id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt240);
            state_id_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt240);
            ir_id_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt240);
            type_code_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt240);
            fort_type_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt240);
            col_id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_scenario_constructor.sc_find_state_by_id_string(state_id_string);
                    SubLObject session = rkf_scenario_constructor.sc_state_active_session(state);
                    SubLObject indexical_record = rkf_scenario_manipulator.sm_find_indexical_record_by_id_string(ir_id_string);
                    SubLObject type = (NIL != char_equal(Strings.sublisp_char(type_code_string, ZERO_INTEGER), CHAR_I)) ? ((SubLObject) ($$isa)) : $$genls;
                    SubLObject fort_type = (NIL != char_equal(Strings.sublisp_char(fort_type_string, ZERO_INTEGER), CHAR_N)) ? ((SubLObject) ($NART)) : $CONSTANT;
                    SubLObject col_id = parse_integer(col_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject collection = (fort_type == $NART) ? ((SubLObject) (nart_handles.find_nart_by_id(col_id))) : constant_handles.find_constant_by_suid(col_id);
                    rkf_scenario_constructor.sc_act_add_new_constraint(session, el_utilities.make_binary_formula(type, rkf_scenario_manipulator.sm_indexical_record_indexical(indexical_record), collection));
                    return cb_sc_elaborate_guts(state);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt240);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_sc_add_general_term_phrase(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject state_id_string = NIL;
                SubLObject ir_id_string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt234);
                state_id_string = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt234);
                ir_id_string = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject state = rkf_scenario_constructor.sc_find_state_by_id_string(state_id_string);
                        SubLObject indexical_record = rkf_scenario_manipulator.sm_find_indexical_record_by_id_string(ir_id_string);
                        SubLObject interaction = rkf_scenario_constructor.sc_state_interaction(state);
                        if (NIL != user_interaction_agenda.user_interaction_p(interaction)) {
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
                                        html_utilities.html_hidden_input($str_alt249$cb_handle_sc_add_general_term_phr, T, UNPROVIDED);
                                        html_utilities.html_hidden_input($str_alt69$state_id, state_id_string, UNPROVIDED);
                                        html_utilities.html_hidden_input($str_alt250$ir_id, ir_id_string, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt251$General_Term__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_newline(UNPROVIDED);
                                        {
                                            SubLObject preferred_phrase = rkf_scenario_manipulator.sm_indexical_record_preferred_phrase(indexical_record);
                                            SubLObject all_phrases = rkf_scenario_manipulator.sm_indexical_record_phrases(indexical_record);
                                            cb_sc_show_indexical_record_phrase(state, indexical_record, preferred_phrase, NIL);
                                            {
                                                SubLObject cdolist_list_var = all_phrases;
                                                SubLObject phrase = NIL;
                                                for (phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , phrase = cdolist_list_var.first()) {
                                                    if (!phrase.equal(preferred_phrase)) {
                                                        cb_sc_show_indexical_record_phrase(state, indexical_record, phrase, NIL);
                                                    }
                                                }
                                            }
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt252$Enter_another_short_phrase_for_th);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_text_input($str_alt253$general_term_phrase, NIL, TWENTY_INTEGER);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_submit_input($$$Add_Phrase, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_reset_input($$$Clear);
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
                        } else {
                            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                            {
                                SubLObject bgcolor = cb_sc_context_color($BACKGROUND);
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
                                            SubLObject _prev_bind_0_97 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
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
                                                        SubLObject _prev_bind_0_98 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                        SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_macros.$within_html_form$.bind(T, thread);
                                                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                            html_utilities.html_hidden_input($str_alt249$cb_handle_sc_add_general_term_phr, T, UNPROVIDED);
                                                            html_utilities.html_hidden_input($str_alt69$state_id, state_id_string, UNPROVIDED);
                                                            html_utilities.html_hidden_input($str_alt250$ir_id, ir_id_string, UNPROVIDED);
                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            html_utilities.html_princ($str_alt251$General_Term__);
                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                            html_utilities.html_newline(UNPROVIDED);
                                                            {
                                                                SubLObject preferred_phrase = rkf_scenario_manipulator.sm_indexical_record_preferred_phrase(indexical_record);
                                                                SubLObject all_phrases = rkf_scenario_manipulator.sm_indexical_record_phrases(indexical_record);
                                                                cb_sc_show_indexical_record_phrase(state, indexical_record, preferred_phrase, NIL);
                                                                {
                                                                    SubLObject cdolist_list_var = all_phrases;
                                                                    SubLObject phrase = NIL;
                                                                    for (phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , phrase = cdolist_list_var.first()) {
                                                                        if (!phrase.equal(preferred_phrase)) {
                                                                            cb_sc_show_indexical_record_phrase(state, indexical_record, phrase, NIL);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            html_utilities.html_newline(UNPROVIDED);
                                                            html_utilities.html_newline(UNPROVIDED);
                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            html_utilities.html_princ($str_alt252$Enter_another_short_phrase_for_th);
                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                            html_utilities.html_newline(UNPROVIDED);
                                                            html_utilities.html_text_input($str_alt253$general_term_phrase, NIL, TWENTY_INTEGER);
                                                            html_utilities.html_newline(UNPROVIDED);
                                                            html_utilities.html_submit_input($$$Add_Phrase, UNPROVIDED, UNPROVIDED);
                                                            html_utilities.html_reset_input($$$Clear);
                                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                        } finally {
                                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                            html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_98, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_97, thread);
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
                    cdestructuring_bind_error(datum, $list_alt234);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_sc_add_general_term_phrase(SubLObject state, SubLObject indexical_record, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt256$_Add_New_Phrase_;
            }
            {
                SubLObject state_id = rkf_scenario_constructor.sc_state_id(state);
                SubLObject ir_id = rkf_scenario_manipulator.sm_indexical_record_id(indexical_record);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt257$cb_sc_add_general_term_phrase__A_, state_id, ir_id);
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
                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_utilities.html_princ(linktext);
                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_handle_sc_add_general_term_phrase(SubLObject args) {
        {
            SubLObject state_id_string = html_utilities.html_extract_input($str_alt69$state_id, args);
            SubLObject ir_id_string = html_utilities.html_extract_input($str_alt250$ir_id, args);
            SubLObject state = rkf_scenario_constructor.sc_find_state_by_id_string(state_id_string);
            SubLObject session = rkf_scenario_constructor.sc_state_active_session(state);
            SubLObject general_term_phrase = html_utilities.html_extract_input($str_alt253$general_term_phrase, args);
            SubLObject indexical_record = rkf_scenario_manipulator.sm_find_indexical_record_by_id_string(ir_id_string);
            general_term_phrase = string_utilities.trim_whitespace(general_term_phrase);
            rkf_scenario_constructor.sc_act_add_indexical_phrase(session, indexical_record, general_term_phrase);
            return cb_sc_elaborate_guts(state);
        }
    }

    public static final SubLObject cb_link_sc_delete_general_term_phrase(SubLObject state, SubLObject indexical_record, SubLObject phrase, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt260$_Delete_Phrase_;
            }
            {
                SubLObject state_id = rkf_scenario_constructor.sc_state_id(state);
                SubLObject ir_id = rkf_scenario_manipulator.sm_indexical_record_id(indexical_record);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt261$cb_sc_delete_general_term_phrase_, state_id, ir_id);
                html_utilities.html_url_princ(phrase);
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
                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_utilities.html_princ(linktext);
                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_sc_delete_general_term_phrase(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject state_id_string = NIL;
            SubLObject ir_id_string = NIL;
            SubLObject general_term_phrase = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt263);
            state_id_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt263);
            ir_id_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt263);
            general_term_phrase = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_scenario_constructor.sc_find_state_by_id_string(state_id_string);
                    SubLObject session = rkf_scenario_constructor.sc_state_active_session(state);
                    SubLObject indexical_record = rkf_scenario_manipulator.sm_find_indexical_record_by_id_string(ir_id_string);
                    rkf_scenario_constructor.sc_act_remove_indexical_phrase(session, indexical_record, general_term_phrase);
                    return cb_sc_elaborate_guts(state);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt263);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_sc_add_constraint(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject id_string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt32);
                id_string = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject state = rkf_scenario_constructor.sc_find_state_by_id_string(id_string);
                        SubLObject textbox_name = $str_alt265$constraint_string;
                        SubLObject terms_id = $str_alt266$terms_id;
                        SubLObject interaction = rkf_scenario_constructor.sc_state_interaction(state);
                        if (NIL != user_interaction_agenda.user_interaction_p(interaction)) {
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
                            dhtml_macros.dhtml_with_toggle_visibility_support();
                            html_utilities.html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
                            html_utilities.html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup($str_alt267$text_css);
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
                                    dhtml_macros.dhtml_dom_wrapper_preamble(terms_id);
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
                                        html_utilities.html_hidden_input($str_alt270$cb_handle_sc_add_constraint, T, UNPROVIDED);
                                        html_utilities.html_hidden_input($str_alt69$state_id, id_string, UNPROVIDED);
                                        cb_sc_offer_previous_constraints(state);
                                        html_utilities.html_newline(UNPROVIDED);
                                        cb_sc_show_general_terms_with_insert(state, textbox_name, NIL, NIL, NIL, $str_alt271$The_following_phrases_must_be_use);
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt272$Enter_a_short_sentence_stating_th);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_newline(ONE_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(textbox_name);
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
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($$$virtual);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_99 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_99, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                        html_utilities.html_indent(TWO_INTEGER);
                                        cb_uia_display_primitives.cb_uia_paste_button(textbox_name, UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_indent(TWO_INTEGER);
                                        html_utilities.html_reset_input($$$Clear);
                                        html_utilities.html_indent(TWO_INTEGER);
                                        cb_utilities.cb_link($UIA_NEXT_INTERACTION, $str_alt275$_Continue_without_Adding_Constrai, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
                        } else {
                            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                            {
                                SubLObject bgcolor = cb_sc_context_color($BACKGROUND);
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
                                            SubLObject _prev_bind_0_100 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                dhtml_macros.dhtml_with_toggle_visibility_support();
                                                html_utilities.html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
                                                html_utilities.html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup($str_alt267$text_css);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(dhtml_macros.$dhtml_css_media$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup($$$screen);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_101 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_terpri(UNPROVIDED);
                                                        dhtml_macros.dhtml_dom_wrapper_preamble(terms_id);
                                                        dhtml_macros.dhtml_dom_attribute_preamble(dhtml_macros.$dhtml_dom_display$.getGlobalValue());
                                                        html_utilities.html_markup($$$none);
                                                        dhtml_macros.dhtml_dom_attribute_postamble();
                                                        dhtml_macros.dhtml_dom_wrapper_postamble();
                                                        html_utilities.html_terpri(UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_101, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(dhtml_macros.$dhtml_css_tail$.getGlobalValue());
                                                html_utilities.html_terpri(UNPROVIDED);
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
                                                        SubLObject _prev_bind_0_102 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                        SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_macros.$within_html_form$.bind(T, thread);
                                                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                            html_utilities.html_hidden_input($str_alt270$cb_handle_sc_add_constraint, T, UNPROVIDED);
                                                            html_utilities.html_hidden_input($str_alt69$state_id, id_string, UNPROVIDED);
                                                            cb_sc_offer_previous_constraints(state);
                                                            html_utilities.html_newline(UNPROVIDED);
                                                            cb_sc_show_general_terms_with_insert(state, textbox_name, NIL, NIL, NIL, $str_alt271$The_following_phrases_must_be_use);
                                                            html_utilities.html_newline(TWO_INTEGER);
                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            html_utilities.html_princ($str_alt272$Enter_a_short_sentence_stating_th);
                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                            html_utilities.html_newline(ONE_INTEGER);
                                                            html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(textbox_name);
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
                                                                html_utilities.html_markup(TWO_INTEGER);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup($$$virtual);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_103 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_103, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                                            html_utilities.html_indent(TWO_INTEGER);
                                                            cb_uia_display_primitives.cb_uia_paste_button(textbox_name, UNPROVIDED);
                                                            html_utilities.html_newline(UNPROVIDED);
                                                            html_utilities.html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
                                                            html_utilities.html_indent(TWO_INTEGER);
                                                            html_utilities.html_reset_input($$$Clear);
                                                            html_utilities.html_indent(TWO_INTEGER);
                                                            cb_utilities.cb_link($UIA_NEXT_INTERACTION, $str_alt275$_Continue_without_Adding_Constrai, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                        } finally {
                                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                            html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_102, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                }
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_100, thread);
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
                    cdestructuring_bind_error(datum, $list_alt32);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_sc_offer_previous_constraints(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_scenario = rkf_scenario_constructor.sc_state_active_scenario(state);
                SubLObject formulas = rkf_scenario_manipulator.sm_act_gather_constraint_formulas(v_scenario);
                SubLObject interaction = rkf_scenario_constructor.sc_state_interaction(state);
                SubLObject language_mt = rkf_scenario_constructor.sc_state_generation_mt(state);
                SubLObject domain_mt = rkf_scenario_constructor.sc_state_domain_interaction_mt(state);
                SubLObject seen_predicates = NIL;
                if (NIL != formulas) {
                    user_interaction_agenda.ui_state_update(interaction, $BASE_FORMULAS, formulas);
                    html_utilities.html_newline(UNPROVIDED);
                    html_utilities.html_princ($str_alt278$Construct_a_constraint_similar_to);
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
                                SubLObject list_var = NIL;
                                SubLObject formula = NIL;
                                SubLObject id = NIL;
                                for (list_var = formulas, formula = list_var.first(), id = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , formula = list_var.first() , id = add(ONE_INTEGER, id)) {
                                    {
                                        SubLObject predicate = cycl_utilities.formula_arg0(formula);
                                        if (NIL == subl_promotions.memberP(predicate, seen_predicates, UNPROVIDED, UNPROVIDED)) {
                                            {
                                                SubLObject output = pph_main.generate_pph_output_list(formula, $ANY, language_mt, domain_mt, UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_104 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_105 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($$$Add);
                                                                html_utilities.html_checkbox_input($$$chosen, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                html_utilities.html_indent(UNPROVIDED);
                                                                SubLTrampolineFile.checkType(output, PPH_PHRASE_OUTPUT_LIST_P);
                                                                {
                                                                    SubLObject start_char_index = ZERO_INTEGER;
                                                                    SubLObject end_char_index = ZERO_INTEGER;
                                                                    SubLObject whole_html_string = pph_phrase.pph_phrase_output_list_string(output, T);
                                                                    SubLObject whole_string = pph_utilities.pph_remove_html_tags(whole_html_string, NIL);
                                                                    SubLObject iterator = pph_data_structures.new_pph_phrase_output_list_iterator(output);
                                                                    while (NIL == pph_data_structures.pph_phrase_output_list_iterator_empty_p(iterator)) {
                                                                        {
                                                                            SubLObject item = pph_data_structures.pph_phrase_output_list_iterator_next(iterator);
                                                                            SubLObject raw_item_string = pph_phrase.pph_phrase_output_item_get_string(item, NIL);
                                                                            start_char_index = pph_macros.pph_output_list_find_start_char(raw_item_string, whole_string, end_char_index);
                                                                            if (start_char_index.numG(end_char_index)) {
                                                                                {
                                                                                    SubLObject string = pph_macros.pph_make_space_string(start_char_index, end_char_index);
                                                                                    SubLObject arg_position = pph_utilities.pph_unknown_arg_position();
                                                                                    SubLObject html_open_tag = NIL;
                                                                                    SubLObject html_close_tag = NIL;
                                                                                    SubLObject arg = pph_phrase.pph_empty_cycl();
                                                                                    SubLObject start_char_index_106 = end_char_index;
                                                                                    if ((NIL != pph_phrase.pph_unknown_cycl_p(arg)) || (NIL != pph_utilities.pph_unknown_arg_position_p(arg_position))) {
                                                                                        html_utilities.html_indent(UNPROVIDED);
                                                                                    } else
                                                                                        if (arg == $INDEXICAL) {
                                                                                            cb_sc_emit_indexical_record_picklist(v_scenario, id, arg_position);
                                                                                        } else
                                                                                            if (NIL == fort_types_interface.predicateP(arg)) {
                                                                                                cb_sc_emit_argument_picklist(state, arg, arg_position, id, string);
                                                                                            } else {
                                                                                                html_utilities.html_princ(string);
                                                                                            }


                                                                                }
                                                                            }
                                                                            end_char_index = pph_macros.pph_update_end_char_index(start_char_index, raw_item_string);
                                                                            {
                                                                                SubLObject string = pph_phrase.pph_phrase_output_item_get_string(item, NIL);
                                                                                SubLObject arg_position = pph_data_structures.pph_phrase_output_item_arg_position(item);
                                                                                SubLObject html_open_tag = pph_data_structures.pph_phrase_output_item_html_open_tag(item);
                                                                                SubLObject html_close_tag = pph_data_structures.pph_phrase_output_item_html_close_tag(item);
                                                                                SubLObject arg = pph_data_structures.pph_phrase_output_item_cycl(item);
                                                                                if ((NIL != pph_phrase.pph_unknown_cycl_p(arg)) || (NIL != pph_utilities.pph_unknown_arg_position_p(arg_position))) {
                                                                                    html_utilities.html_indent(UNPROVIDED);
                                                                                } else
                                                                                    if (arg == $INDEXICAL) {
                                                                                        cb_sc_emit_indexical_record_picklist(v_scenario, id, arg_position);
                                                                                    } else
                                                                                        if (NIL == fort_types_interface.predicateP(arg)) {
                                                                                            cb_sc_emit_argument_picklist(state, arg, arg_position, id, string);
                                                                                        } else {
                                                                                            html_utilities.html_princ(string);
                                                                                        }


                                                                            }
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_105, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_104, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            }
                                            seen_predicates = cons(predicate, seen_predicates);
                                        }
                                    }
                                }
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                }
                return state;
            }
        }
    }

    public static final SubLObject cb_sc_emit_indexical_record_picklist(SubLObject v_scenario, SubLObject id, SubLObject argpos) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject indexicals = rkf_scenario_manipulator.sm_act_gather_all_preferred_indexical_phrases(v_scenario);
                SubLObject name = cb_sc_generate_formula_label($$$indexical, id, argpos);
                html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(name);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (true) {
                    html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(ONE_INTEGER);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        {
                            SubLObject cdolist_list_var = indexicals;
                            SubLObject indexical = NIL;
                            for (indexical = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , indexical = cdolist_list_var.first()) {
                                html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                if (NIL != indexical) {
                                    html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(indexical);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_107 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ(indexical);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_107, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                            }
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
            }
            return v_scenario;
        }
    }

    /**
     *
     *
     * @unknown 
     */
    public static final SubLObject cb_sc_emit_argument_picklist(SubLObject state, SubLObject arg, SubLObject arg_position, SubLObject id, SubLObject string) {
        {
            SubLObject name = cb_sc_generate_formula_label($$$arg, id, arg_position);
            html_utilities.html_text_input(name, string, UNPROVIDED);
        }
        return state;
    }

    // deflexical
    private static final SubLSymbol $cb_sc_formula_label_separator$ = makeSymbol("*CB-SC-FORMULA-LABEL-SEPARATOR*");

    // deflexical
    private static final SubLSymbol $cb_sc_formula_label_separator_string$ = makeSymbol("*CB-SC-FORMULA-LABEL-SEPARATOR-STRING*");

    // deflexical
    private static final SubLSymbol $cb_sc_formula_label_separator_list$ = makeSymbol("*CB-SC-FORMULA-LABEL-SEPARATOR-LIST*");

    public static final SubLObject cb_sc_generate_formula_label(SubLObject stem, SubLObject id, SubLObject argpos) {
        if (argpos == UNPROVIDED) {
            argpos = ZERO_INTEGER;
        }
        return cconcatenate(stem, new SubLObject[]{ $cb_sc_formula_label_separator_string$.getGlobalValue(), string_utilities.to_string(id), $cb_sc_formula_label_separator_string$.getGlobalValue(), string_utilities.to_string(argpos) });
    }

    public static final SubLObject cb_sc_crack_formula_label(SubLObject label) {
        {
            SubLObject tokens = string_utilities.string_tokenize(label, $cb_sc_formula_label_separator_list$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return values(tokens.first(), second(tokens), third(tokens));
        }
    }

    public static final SubLObject cb_sc_extract_formula_labels_from_args(SubLObject html_args, SubLObject id) {
        {
            SubLObject pattern = cconcatenate($cb_sc_formula_label_separator_string$.getGlobalValue(), new SubLObject[]{ id, $cb_sc_formula_label_separator_string$.getGlobalValue() });
            SubLObject matches = NIL;
            SubLObject cdolist_list_var = html_args;
            SubLObject arg = NIL;
            for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                if (arg.isList()) {
                    {
                        SubLObject datum = arg;
                        SubLObject current = datum;
                        SubLObject key = NIL;
                        SubLObject value = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt286);
                        key = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt286);
                        value = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (search(pattern, key, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).isNumber()) {
                                matches = cons(arg, matches);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt286);
                        }
                    }
                }
            }
            return matches;
        }
    }

    public static final SubLObject cb_link_sc_add_constraint(SubLObject state, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt287$_Add_new_constraint_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt288$cb_sc_add_constraint__A, rkf_scenario_constructor.sc_state_id(state));
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
                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_utilities.html_princ(linktext);
                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_handle_sc_add_constraint(SubLObject args) {
        {
            SubLObject id_string = html_utilities.html_extract_input($str_alt69$state_id, args);
            SubLObject state = rkf_scenario_constructor.sc_find_state_by_id_string(id_string);
            SubLObject interaction = rkf_scenario_constructor.sc_state_interaction(state);
            SubLObject constraint_string = html_utilities.html_extract_input($str_alt265$constraint_string, args);
            constraint_string = string_utilities.trim_whitespace(constraint_string);
            if (NIL != uia_tools_basic.sentence_finder_trigger_stringP(constraint_string)) {
                user_interaction_agenda.ui_state_update(interaction, $SC_ACT, $PASTE_CONSTRAINT);
            } else
                if (NIL != string_utilities.empty_string_p(constraint_string)) {
                    user_interaction_agenda.ui_state_clear(interaction, $CONSTRAINT_SENTENCE);
                    user_interaction_agenda.ui_state_clear(interaction, $SC_ACT);
                } else {
                    user_interaction_agenda.ui_state_update(interaction, $SC_ACT, $PARSE_CONSTRAINT);
                    user_interaction_agenda.ui_state_update(interaction, $CONSTRAINT_SENTENCE, constraint_string);
                }

            cb_sc_handle_cloned_constraints(state, interaction, args);
            {
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $ADD_CONSTRAINT, list($CONSTRAINT_STRING, constraint_string));
                return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
            }
        }
    }

    public static final SubLObject cb_sc_handle_cloned_constraints(SubLObject state, SubLObject interaction, SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_scenario = rkf_scenario_constructor.sc_state_active_scenario(state);
                SubLObject formula_ids = html_utilities.html_extract_input_values($$$chosen, args);
                SubLObject base_formulas = user_interaction_agenda.ui_state_lookup(interaction, $BASE_FORMULAS, UNPROVIDED);
                SubLObject new_constraints = NIL;
                SubLObject unparsed_phrases = NIL;
                SubLObject unparsed_arg_positions = NIL;
                if (NIL != formula_ids) {
                    {
                        SubLObject cdolist_list_var = formula_ids;
                        SubLObject formula_id = NIL;
                        for (formula_id = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , formula_id = cdolist_list_var.first()) {
                            {
                                SubLObject elements = cb_sc_extract_formula_labels_from_args(args, formula_id);
                                SubLObject id = parse_integer(formula_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject new_constraint = copy_list(nth(id, base_formulas));
                                SubLObject cdolist_list_var_108 = elements;
                                SubLObject element = NIL;
                                for (element = cdolist_list_var_108.first(); NIL != cdolist_list_var_108; cdolist_list_var_108 = cdolist_list_var_108.rest() , element = cdolist_list_var_108.first()) {
                                    {
                                        SubLObject datum = element;
                                        SubLObject current = datum;
                                        SubLObject label = NIL;
                                        SubLObject value = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt297);
                                        label = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt297);
                                        value = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject stem = cb_sc_crack_formula_label(label);
                                                SubLObject id_code = thread.secondMultipleValue();
                                                SubLObject arg_pos = thread.thirdMultipleValue();
                                                thread.resetMultipleValues();
                                                arg_pos = cb_sc_interpret_arg_pos_string(arg_pos);
                                                if (NIL != Strings.string_equal(stem, $$$indexical, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                    {
                                                        SubLObject indexical = rkf_scenario_manipulator.sm_act_resolve_phrase_to_term(v_scenario, value);
                                                        new_constraint = el_utilities.replace_formula_arg_position(arg_pos, indexical, new_constraint);
                                                    }
                                                } else
                                                    if (NIL != Strings.string_equal(stem, $$$arg, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                        {
                                                            SubLObject the_value = value;
                                                            unparsed_phrases = cons(the_value, unparsed_phrases);
                                                            unparsed_arg_positions = cons(arg_pos, unparsed_arg_positions);
                                                            new_constraint = el_utilities.replace_formula_arg_position(arg_pos, the_value, new_constraint);
                                                        }
                                                    }

                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt297);
                                        }
                                    }
                                }
                                new_constraints = cons(list($SENTENCE, new_constraint, $UNPARSED_PHRASES, nreverse(unparsed_phrases), $UNPARSED_ARG_POSITIONS, nreverse(unparsed_arg_positions)), new_constraints);
                            }
                        }
                    }
                    user_interaction_agenda.ui_state_update(interaction, $CLONED_CONSTRAINTS, new_constraints);
                }
            }
            return state;
        }
    }

    public static final SubLObject cb_sc_convert_string_to_parsing_result(SubLObject string) {
        return list($$TheResultOfParsing, string, $list_alt303, $$NPTemplate, $list_alt305);
    }

    public static final SubLObject cb_sc_interpret_arg_pos_string(SubLObject arg_pos) {
        {
            SubLObject result = read_from_string_ignoring_errors(arg_pos, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return result;
        }
    }

    public static final SubLObject cb_sc_inform_no_parse(SubLObject state, SubLObject constraint_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject interaction = rkf_scenario_constructor.sc_state_interaction(state);
                if (NIL != user_interaction_agenda.user_interaction_p(interaction)) {
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
                    html_utilities.html_princ($str_alt306$Your_input__);
                    html_utilities.html_newline(TWO_INTEGER);
                    html_utilities.html_indent(FIVE_INTEGER);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ(constraint_string);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_utilities.html_newline(TWO_INTEGER);
                    html_utilities.html_princ($str_alt307$was_not_understood_);
                    html_utilities.html_newline(UNPROVIDED);
                    cb_utilities.cb_link($SC_ADD_CONSTRAINT, state, $str_alt308$_Try_Again_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_indent(FIVE_INTEGER);
                    cb_utilities.cb_link($SC_ELABORATE, state, $str_alt309$_Don_t_Bother_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } else {
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    {
                        SubLObject bgcolor = cb_sc_context_color($BACKGROUND);
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
                                    SubLObject _prev_bind_0_109 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_princ($str_alt306$Your_input__);
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_indent(FIVE_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ(constraint_string);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_princ($str_alt307$was_not_understood_);
                                        html_utilities.html_newline(UNPROVIDED);
                                        cb_utilities.cb_link($SC_ADD_CONSTRAINT, state, $str_alt308$_Try_Again_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_indent(FIVE_INTEGER);
                                        cb_utilities.cb_link($SC_ELABORATE, state, $str_alt309$_Don_t_Bother_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_109, thread);
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

    public static final SubLObject cb_sc_adjust_cycl_sentence(SubLObject state, SubLObject constraint_sentence, SubLObject extension) {
        if (extension == UNPROVIDED) {
            extension = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(rkf_scenario_constructor.sc_state_interaction(state));
                SubLObject interaction = rkf_scenario_constructor.sc_state_interaction(state);
                if (NIL != user_interaction_agenda.user_interaction_p(interaction)) {
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
                                html_utilities.html_hidden_input($str_alt310$cb_sc_handle_adjust_sentence, T, UNPROVIDED);
                                html_utilities.html_hidden_input($str_alt69$state_id, rkf_scenario_constructor.sc_state_id(state), UNPROVIDED);
                                html_utilities.html_hidden_input($str_alt311$constraint_sentence, cb_user_interaction_agenda.cb_uia_html_encode(v_agenda, constraint_sentence), UNPROVIDED);
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt312$Replace_one_or_more_of_the_argume);
                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                html_utilities.html_newline(TWO_INTEGER);
                                cb_sc_display_sentence_adjustment_options(state, constraint_sentence, extension);
                                html_utilities.html_newline(ONE_INTEGER);
                                html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                html_utilities.html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
                                html_utilities.html_indent(UNPROVIDED);
                                html_utilities.html_submit_input($$$Negate_and_Submit, $str_alt314$negate_submit, UNPROVIDED);
                                html_utilities.html_indent(UNPROVIDED);
                                cb_utilities.cb_link($SC_ADD_CONSTRAINT, state, $str_alt308$_Try_Again_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_utilities.html_indent(UNPROVIDED);
                                cb_utilities.cb_link($SC_ELABORATE, state, $str_alt309$_Don_t_Bother_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                                html_utilities.html_newline(ONE_INTEGER);
                                cb_sc_show_general_terms(state, NIL, NIL, NIL, $str_alt271$The_following_phrases_must_be_use);
                                html_utilities.html_newline(UNPROVIDED);
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
                } else {
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    {
                        SubLObject bgcolor = cb_sc_context_color($BACKGROUND);
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
                                    SubLObject _prev_bind_0_110 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
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
                                                SubLObject _prev_bind_0_111 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    html_utilities.html_hidden_input($str_alt310$cb_sc_handle_adjust_sentence, T, UNPROVIDED);
                                                    html_utilities.html_hidden_input($str_alt69$state_id, rkf_scenario_constructor.sc_state_id(state), UNPROVIDED);
                                                    html_utilities.html_hidden_input($str_alt311$constraint_sentence, cb_user_interaction_agenda.cb_uia_html_encode(v_agenda, constraint_sentence), UNPROVIDED);
                                                    html_utilities.html_newline(UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                    html_utilities.html_princ($str_alt312$Replace_one_or_more_of_the_argume);
                                                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                    html_utilities.html_newline(TWO_INTEGER);
                                                    cb_sc_display_sentence_adjustment_options(state, constraint_sentence, extension);
                                                    html_utilities.html_newline(ONE_INTEGER);
                                                    html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                                    html_utilities.html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_indent(UNPROVIDED);
                                                    html_utilities.html_submit_input($$$Negate_and_Submit, $str_alt314$negate_submit, UNPROVIDED);
                                                    html_utilities.html_indent(UNPROVIDED);
                                                    cb_utilities.cb_link($SC_ADD_CONSTRAINT, state, $str_alt308$_Try_Again_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_indent(UNPROVIDED);
                                                    cb_utilities.cb_link($SC_ELABORATE, state, $str_alt309$_Don_t_Bother_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                                                    html_utilities.html_newline(ONE_INTEGER);
                                                    cb_sc_show_general_terms(state, NIL, NIL, NIL, $str_alt271$The_following_phrases_must_be_use);
                                                    html_utilities.html_newline(UNPROVIDED);
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_111, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_110, thread);
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

    // deflexical
    public static final SubLSymbol $cb_sc_adjustment_find_and_paste_string$ = makeSymbol("*CB-SC-ADJUSTMENT-FIND-AND-PASTE-STRING*");



    public static final SubLObject cb_sc_uiat_encode_find_and_paste(SubLObject v_agenda) {
        return cb_user_interaction_agenda.cb_uia_html_encode(v_agenda, $cb_sc_adjustment_find_and_paste_key$.getGlobalValue());
    }

    public static final SubLObject is_sc_adjustment_find_and_paste_keyP(SubLObject v_object) {
        return makeBoolean(v_object.isSymbol() && ($cb_sc_adjustment_find_and_paste_key$.getGlobalValue() == v_object));
    }

    public static final SubLObject cb_sc_display_sentence_adjustment_options(SubLObject state, SubLObject constraint_sentence, SubLObject extension) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject indexical_map = rkf_scenario_constructor.sc_act_construct_indexical_table(rkf_scenario_constructor.sc_state_active_session(state));
                SubLObject language_mt = rkf_scenario_constructor.sc_state_generation_mt(state);
                SubLObject domain_mt = rkf_scenario_constructor.sc_state_domain_interaction_mt(state);
                SubLObject options = rkf_scenario_constructor.sc_act_propose_sentence_adjustment(state, constraint_sentence);
                SubLObject term_stack = copy_list(extension);
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(rkf_scenario_constructor.sc_state_interaction(state));
                html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                {
                    SubLObject _prev_bind_0 = pph_vars.$pph_term_paraphrase_map$.currentBinding(thread);
                    try {
                        pph_vars.$pph_term_paraphrase_map$.bind(indexical_map, thread);
                        {
                            SubLObject output = pph_main.generate_pph_output_list(constraint_sentence, $ANY, language_mt, domain_mt, $TEXT, $DECLARATIVE);
                            SubLObject find_encoding = cb_sc_uiat_encode_find_and_paste(v_agenda);
                            SubLTrampolineFile.checkType(output, PPH_PHRASE_OUTPUT_LIST_P);
                            {
                                SubLObject start_char_index = ZERO_INTEGER;
                                SubLObject end_char_index = ZERO_INTEGER;
                                SubLObject whole_html_string = pph_phrase.pph_phrase_output_list_string(output, T);
                                SubLObject whole_string = pph_utilities.pph_remove_html_tags(whole_html_string, NIL);
                                SubLObject iterator = pph_data_structures.new_pph_phrase_output_list_iterator(output);
                                while (NIL == pph_data_structures.pph_phrase_output_list_iterator_empty_p(iterator)) {
                                    {
                                        SubLObject item = pph_data_structures.pph_phrase_output_list_iterator_next(iterator);
                                        SubLObject raw_item_string = pph_phrase.pph_phrase_output_item_get_string(item, NIL);
                                        start_char_index = pph_macros.pph_output_list_find_start_char(raw_item_string, whole_string, end_char_index);
                                        if (start_char_index.numG(end_char_index)) {
                                            {
                                                SubLObject string = pph_macros.pph_make_space_string(start_char_index, end_char_index);
                                                SubLObject arg_position = pph_utilities.pph_unknown_arg_position();
                                                SubLObject html_open_tag = NIL;
                                                SubLObject html_close_tag = NIL;
                                                SubLObject arg = pph_phrase.pph_empty_cycl();
                                                SubLObject start_char_index_112 = end_char_index;
                                                if (!((NIL != pph_phrase.pph_unknown_cycl_p(arg)) || (NIL != pph_utilities.pph_unknown_arg_position_p(arg_position)))) {
                                                    {
                                                        SubLObject argpos = arg_position.first();
                                                        SubLObject argument = cycl_utilities.formula_arg(constraint_sentence, argpos, UNPROVIDED);
                                                        SubLObject choices = assoc(argpos, options, UNPROVIDED, UNPROVIDED).rest();
                                                        if (NIL != choices) {
                                                            {
                                                                SubLObject name = cb_sc_generate_formula_label($$$argpos, ZERO_INTEGER, argpos);
                                                                SubLObject pasted_term = NIL;
                                                                html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(name);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(ONE_INTEGER);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_113 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        if (argument == $cb_sc_adjustment_find_and_paste_key$.getGlobalValue()) {
                                                                            pasted_term = term_stack.first();
                                                                            term_stack = term_stack.rest();
                                                                            cb_sc_render_adjust_choice(v_agenda, pasted_term, language_mt, domain_mt);
                                                                        }
                                                                        {
                                                                            SubLObject cdolist_list_var = remove_duplicates(choices, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            SubLObject choice = NIL;
                                                                            for (choice = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , choice = cdolist_list_var.first()) {
                                                                                if (choice != $cb_sc_adjustment_find_and_paste_key$.getGlobalValue()) {
                                                                                    cb_sc_render_adjust_choice(v_agenda, choice, language_mt, domain_mt);
                                                                                }
                                                                            }
                                                                        }
                                                                        {
                                                                            SubLObject cdolist_list_var = extension;
                                                                            SubLObject v_term = NIL;
                                                                            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                                                                                if (v_term != pasted_term) {
                                                                                    cb_sc_render_adjust_choice(v_agenda, v_term, language_mt, domain_mt);
                                                                                }
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                        if (NIL != find_encoding) {
                                                                            html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(find_encoding);
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_114 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_princ($cb_sc_adjustment_find_and_paste_string$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_114, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_113, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                            }
                                                        } else {
                                                            html_utilities.html_princ(string);
                                                        }
                                                    }
                                                }
                                                html_utilities.html_indent(UNPROVIDED);
                                            }
                                        }
                                        end_char_index = pph_macros.pph_update_end_char_index(start_char_index, raw_item_string);
                                        {
                                            SubLObject string = pph_phrase.pph_phrase_output_item_get_string(item, NIL);
                                            SubLObject arg_position = pph_data_structures.pph_phrase_output_item_arg_position(item);
                                            SubLObject html_open_tag = pph_data_structures.pph_phrase_output_item_html_open_tag(item);
                                            SubLObject html_close_tag = pph_data_structures.pph_phrase_output_item_html_close_tag(item);
                                            SubLObject arg = pph_data_structures.pph_phrase_output_item_cycl(item);
                                            if (!((NIL != pph_phrase.pph_unknown_cycl_p(arg)) || (NIL != pph_utilities.pph_unknown_arg_position_p(arg_position)))) {
                                                {
                                                    SubLObject argpos = arg_position.first();
                                                    SubLObject argument = cycl_utilities.formula_arg(constraint_sentence, argpos, UNPROVIDED);
                                                    SubLObject choices = assoc(argpos, options, UNPROVIDED, UNPROVIDED).rest();
                                                    if (NIL != choices) {
                                                        {
                                                            SubLObject name = cb_sc_generate_formula_label($$$argpos, ZERO_INTEGER, argpos);
                                                            SubLObject pasted_term = NIL;
                                                            html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(name);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(ONE_INTEGER);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_115 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    if (argument == $cb_sc_adjustment_find_and_paste_key$.getGlobalValue()) {
                                                                        pasted_term = term_stack.first();
                                                                        term_stack = term_stack.rest();
                                                                        cb_sc_render_adjust_choice(v_agenda, pasted_term, language_mt, domain_mt);
                                                                    }
                                                                    {
                                                                        SubLObject cdolist_list_var = remove_duplicates(choices, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        SubLObject choice = NIL;
                                                                        for (choice = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , choice = cdolist_list_var.first()) {
                                                                            if (choice != $cb_sc_adjustment_find_and_paste_key$.getGlobalValue()) {
                                                                                cb_sc_render_adjust_choice(v_agenda, choice, language_mt, domain_mt);
                                                                            }
                                                                        }
                                                                    }
                                                                    {
                                                                        SubLObject cdolist_list_var = extension;
                                                                        SubLObject v_term = NIL;
                                                                        for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                                                                            if (v_term != pasted_term) {
                                                                                cb_sc_render_adjust_choice(v_agenda, v_term, language_mt, domain_mt);
                                                                            }
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                    if (NIL != find_encoding) {
                                                                        html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(find_encoding);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_116 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_princ($cb_sc_adjustment_find_and_paste_string$.getGlobalValue());
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_116, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_115, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                        }
                                                    } else {
                                                        html_utilities.html_princ(string);
                                                    }
                                                }
                                            }
                                            html_utilities.html_indent(UNPROVIDED);
                                        }
                                    }
                                } 
                            }
                        }
                    } finally {
                        pph_vars.$pph_term_paraphrase_map$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
            }
            return state;
        }
    }

    public static final SubLObject cb_sc_render_adjust_choice(SubLObject v_agenda, SubLObject v_term, SubLObject language_mt, SubLObject domain_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject indexical = rkf_concept_communicator.rkf_term_phrase(v_term, language_mt, domain_mt, UNPROVIDED, UNPROVIDED);
                SubLObject encoding = cb_user_interaction_agenda.cb_uia_html_encode(v_agenda, v_term);
                html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                if (NIL != encoding) {
                    html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(encoding);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_princ(indexical);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
            }
            return v_agenda;
        }
    }

    public static final SubLObject cb_sc_handle_adjust_sentence(SubLObject args) {
        {
            SubLObject id_string = html_utilities.html_extract_input($str_alt69$state_id, args);
            SubLObject state = rkf_scenario_constructor.sc_find_state_by_id_string(id_string);
            SubLObject interaction = rkf_scenario_constructor.sc_state_interaction(state);
            SubLObject was_negatedP = stringp(html_utilities.html_extract_input($str_alt314$negate_submit, args));
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject reply = NIL;
            SubLObject constraint_string = html_utilities.html_extract_input($str_alt311$constraint_sentence, args);
            SubLObject constraint_sentence = cb_user_interaction_agenda.cb_uia_html_decode(v_agenda, constraint_string);
            SubLObject adjusted_sentence = el_utilities.copy_expression(constraint_sentence);
            SubLObject argpos = ZERO_INTEGER;
            SubLObject args_117 = cycl_utilities.formula_args(constraint_sentence, $IGNORE);
            SubLObject cdolist_list_var = args_117;
            SubLObject argvar = NIL;
            for (argvar = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argvar = cdolist_list_var.first()) {
                argpos = add(argpos, ONE_INTEGER);
                {
                    SubLObject id = ZERO_INTEGER;
                    SubLObject name = cb_sc_generate_formula_label($$$argpos, id, argpos);
                    SubLObject encoded_value = html_utilities.html_extract_input(name, args);
                    SubLObject decoded_value = (encoded_value.isString()) ? ((SubLObject) (cb_user_interaction_agenda.cb_uia_html_decode(v_agenda, encoded_value))) : NIL;
                    if ((NIL != forts.fort_p(decoded_value)) || (NIL != is_sc_adjustment_find_and_paste_keyP(decoded_value))) {
                        adjusted_sentence = el_utilities.nreplace_formula_arg(argpos, decoded_value, adjusted_sentence);
                    }
                }
            }
            if (NIL != was_negatedP) {
                adjusted_sentence = el_utilities.make_unary_formula($$unknownSentence, adjusted_sentence);
            }
            reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $ADD_CONSTRAINT_SENTENCE, list($SENTENCE, adjusted_sentence));
            return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
        }
    }

    public static final SubLObject cb_link_sc_delete_constraint(SubLObject state, SubLObject constraint_record, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt323$_Delete_Constraint_;
            }
            {
                SubLObject state_id = rkf_scenario_constructor.sc_state_id(state);
                SubLObject cr_id = rkf_scenario_manipulator.sm_constraint_record_id(constraint_record);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt324$cb_sc_delete_constraint__A__A, state_id, cr_id);
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
                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_utilities.html_princ(linktext);
                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_sc_delete_constraint(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject state_id_string = NIL;
            SubLObject cr_id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt326);
            state_id_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt326);
            cr_id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_scenario_constructor.sc_find_state_by_id_string(state_id_string);
                    SubLObject session = rkf_scenario_constructor.sc_state_active_session(state);
                    SubLObject constraint_record = rkf_scenario_manipulator.sm_find_constraint_record_by_id_string(cr_id_string);
                    rkf_scenario_constructor.sc_act_remove_constraint(session, constraint_record);
                    return cb_sc_elaborate_guts(state);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt326);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_sc_merge_scenario(SubLObject state, SubLObject from_scenario, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt95$_Merge_From_This_Scenario_;
            }
            {
                SubLObject state_id = rkf_scenario_constructor.sc_state_id(state);
                SubLObject from_id = rkf_scenario_manipulator.sm_scenario_id(from_scenario);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt328$cb_sc_merge_scenario__A__A, state_id, from_id);
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
                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_utilities.html_princ(linktext);
                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_sc_merge_scenario(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject state_id_string = NIL;
            SubLObject from_id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt330);
            state_id_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt330);
            from_id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_scenario_constructor.sc_find_state_by_id_string(state_id_string);
                    SubLObject from_scenario = rkf_scenario_manipulator.sm_find_scenario_by_id_string(from_id_string);
                    SubLObject to_scenario = rkf_scenario_constructor.sc_state_active_scenario(state);
                    rkf_scenario_constructor.sc_act_merge_register_from_scenario(state, from_scenario);
                    rkf_scenario_constructor.sc_act_merge_register_to_scenario(state, to_scenario);
                    return cb_sc_merge_get_one_to_alignment(state);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt330);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_sc_merge_register_align_to(SubLObject state, SubLObject indexical_record, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt332$_Align_To_Term_;
            }
            {
                SubLObject state_id = rkf_scenario_constructor.sc_state_id(state);
                SubLObject to_id = rkf_scenario_manipulator.sm_indexical_record_id(indexical_record);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt333$cb_sc_merge_register_align_to__A_, state_id, to_id);
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
                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_utilities.html_princ(linktext);
                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_sc_merge_register_align_to(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject state_id_string = NIL;
            SubLObject to_id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt335);
            state_id_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt335);
            to_id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_scenario_constructor.sc_find_state_by_id_string(state_id_string);
                    SubLObject to_indexical_record = rkf_scenario_manipulator.sm_find_indexical_record_by_id_string(to_id_string);
                    rkf_scenario_constructor.sc_act_merge_register_align_to(state, to_indexical_record);
                    return cb_sc_merge_get_one_from_alignment(state);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt335);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_sc_merge_register_align_from(SubLObject state, SubLObject indexical_record, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt337$_Align_From_Term_;
            }
            {
                SubLObject state_id = rkf_scenario_constructor.sc_state_id(state);
                SubLObject from_id = rkf_scenario_manipulator.sm_indexical_record_id(indexical_record);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt338$cb_sc_merge_register_align_from__, state_id, from_id);
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
                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_utilities.html_princ(linktext);
                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_sc_merge_register_align_from(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject state_id_string = NIL;
            SubLObject from_id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt330);
            state_id_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt330);
            from_id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_scenario_constructor.sc_find_state_by_id_string(state_id_string);
                    SubLObject from_indexical_record = rkf_scenario_manipulator.sm_find_indexical_record_by_id_string(from_id_string);
                    rkf_scenario_constructor.sc_act_merge_register_align_from(state, from_indexical_record);
                    rkf_scenario_constructor.sc_act_merge_update_indexical_equivalences(state);
                    return cb_sc_merge_get_one_to_alignment(state);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt330);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_sc_do_merge(SubLObject state, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt341$_Merge_Now_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt342$cb_sc_do_merge__A, rkf_scenario_constructor.sc_state_id(state));
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
                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_utilities.html_princ(linktext);
                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_sc_do_merge(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt32);
            id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_scenario_constructor.sc_find_state_by_id_string(id_string);
                    rkf_scenario_constructor.sc_act_merge_scenarios(state);
                    return cb_sc_elaborate_guts(state);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt32);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_sc_abandon_merge(SubLObject state, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt345$_Abandon_Merge_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt346$cb_sc_abandon_merge__A, rkf_scenario_constructor.sc_state_id(state));
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
                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_utilities.html_princ(linktext);
                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_sc_abandon_merge(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt32);
            id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_scenario_constructor.sc_find_state_by_id_string(id_string);
                    rkf_scenario_constructor.sc_act_abandon_merge(state);
                    return cb_sc_elaborate_guts(state);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt32);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_sc_declare_done(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt32);
            id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = rkf_scenario_constructor.sc_find_state_by_id_string(id_string);
                    SubLObject v_scenario = rkf_scenario_constructor.sc_state_active_scenario(state);
                    SubLObject interaction = rkf_scenario_constructor.sc_state_interaction(state);
                    SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $DONE, list($SCENARIO, v_scenario));
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt32);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_sc_declare_done(SubLObject state, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt352$_Done_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt353$cb_sc_declare_done__A, rkf_scenario_constructor.sc_state_id(state));
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
                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_utilities.html_princ(linktext);
                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject declare_cb_scenario_constructor_file() {
        declareFunction("cb_sc_show_cycl_p", "CB-SC-SHOW-CYCL-P", 0, 0, false);
        declareMacro("cb_sc_body", "CB-SC-BODY");
        declareMacro("cb_sc_document", "CB-SC-DOCUMENT");
        declareMacro("html_background_table", "HTML-BACKGROUND-TABLE");
        declareFunction("cb_sc_show_active_session", "CB-SC-SHOW-ACTIVE-SESSION", 2, 0, false);
        declareFunction("cb_sc_show_inactive_session", "CB-SC-SHOW-INACTIVE-SESSION", 2, 0, false);
        declareFunction("cb_sc_show_session", "CB-SC-SHOW-SESSION", 2, 0, false);
        declareFunction("cb_sc_show_cycl", "CB-SC-SHOW-CYCL", 1, 0, false);
        declareFunction("cb_sc_context_color", "CB-SC-CONTEXT-COLOR", 1, 0, false);
        declareFunction("cb_sc_open_scenarios", "CB-SC-OPEN-SCENARIOS", 0, 1, false);
        declareFunction("cb_link_sc_open_scenarios", "CB-LINK-SC-OPEN-SCENARIOS", 1, 1, false);
        declareFunction("cb_sc_open_scenarios_guts", "CB-SC-OPEN-SCENARIOS-GUTS", 1, 0, false);
        declareFunction("cb_sc_enumerate_saved_scenarios", "CB-SC-ENUMERATE-SAVED-SCENARIOS", 1, 0, false);
        declareFunction("cb_link_cb_sc_reload_scenario", "CB-LINK-CB-SC-RELOAD-SCENARIO", 3, 1, false);
        declareFunction("cb_sc_reload_scenario", "CB-SC-RELOAD-SCENARIO", 0, 1, false);
        declareFunction("cb_sc_find_scenario", "CB-SC-FIND-SCENARIO", 0, 1, false);
        declareFunction("cb_link_sc_find_scenario", "CB-LINK-SC-FIND-SCENARIO", 1, 1, false);
        declareFunction("cb_sc_show_find_scenario", "CB-SC-SHOW-FIND-SCENARIO", 1, 0, false);
        declareFunction("cb_sc_handle_find_scenario", "CB-SC-HANDLE-FIND-SCENARIO", 1, 0, false);
        declareFunction("cb_sc_construction_fallback", "CB-SC-CONSTRUCTION-FALLBACK", 2, 0, false);
        declareFunction("cb_sc_elaborate", "CB-SC-ELABORATE", 0, 1, false);
        declareFunction("cb_link_sc_elaborate", "CB-LINK-SC-ELABORATE", 1, 1, false);
        declareFunction("cb_sc_elaborate_guts", "CB-SC-ELABORATE-GUTS", 1, 0, false);
        declareFunction("cb_sc_show_scenario_actions", "CB-SC-SHOW-SCENARIO-ACTIONS", 1, 0, false);
        declareFunction("cb_sc_show_scenario_phrase", "CB-SC-SHOW-SCENARIO-PHRASE", 2, 0, false);
        declareFunction("cb_sc_show_other_scenarios", "CB-SC-SHOW-OTHER-SCENARIOS", 1, 0, false);
        declareFunction("cb_sc_show_scenario_as_phrase", "CB-SC-SHOW-SCENARIO-AS-PHRASE", 2, 0, false);
        declareFunction("cb_sc_show_scenario_connectivity", "CB-SC-SHOW-SCENARIO-CONNECTIVITY", 1, 1, false);
        declareFunction("cb_sc_show_fetch_scenario_groups", "CB-SC-SHOW-FETCH-SCENARIO-GROUPS", 2, 0, false);
        declareFunction("cb_sc_fetch_scenario_nodes_and_links", "CB-SC-FETCH-SCENARIO-NODES-AND-LINKS", 2, 0, false);
        declareFunction("cb_sc_compute_scenario_nodes_and_links", "CB-SC-COMPUTE-SCENARIO-NODES-AND-LINKS", 1, 0, false);
        declareFunction("cb_sc_show_general_terms_with_insert", "CB-SC-SHOW-GENERAL-TERMS-WITH-INSERT", 2, 4, false);
        declareFunction("cb_sc_show_general_terms", "CB-SC-SHOW-GENERAL-TERMS", 1, 4, false);
        declareFunction("cb_sc_show_indexical_type_information", "CB-SC-SHOW-INDEXICAL-TYPE-INFORMATION", 2, 1, false);
        declareFunction("cb_sc_show_indexical_editable_type_information", "CB-SC-SHOW-INDEXICAL-EDITABLE-TYPE-INFORMATION", 3, 0, false);
        declareFunction("cb_sc_is_promoted_type_sentenceP", "CB-SC-IS-PROMOTED-TYPE-SENTENCE?", 3, 0, false);
        declareFunction("cb_sc_show_indexical_specific_constraints", "CB-SC-SHOW-INDEXICAL-SPECIFIC-CONSTRAINTS", 3, 0, false);
        declareFunction("cb_sc_show_indexical_specific_constraints_editable", "CB-SC-SHOW-INDEXICAL-SPECIFIC-CONSTRAINTS-EDITABLE", 3, 0, false);
        declareFunction("cb_sc_show_indexical_specific_constraints_readonly", "CB-SC-SHOW-INDEXICAL-SPECIFIC-CONSTRAINTS-READONLY", 3, 0, false);
        declareFunction("cb_sc_show_indexical_record", "CB-SC-SHOW-INDEXICAL-RECORD", 2, 2, false);
        declareFunction("cb_sc_show_indexical_record_int", "CB-SC-SHOW-INDEXICAL-RECORD-INT", 4, 0, false);
        declareFunction("cb_sc_show_indexical_record_phrase", "CB-SC-SHOW-INDEXICAL-RECORD-PHRASE", 4, 0, false);
        declareFunction("cb_sc_show_indexical_record_indexical", "CB-SC-SHOW-INDEXICAL-RECORD-INDEXICAL", 1, 0, false);
        declareFunction("cb_sc_show_constraints", "CB-SC-SHOW-CONSTRAINTS", 1, 2, false);
        declareFunction("cb_sc_show_constraint_record", "CB-SC-SHOW-CONSTRAINT-RECORD", 2, 2, false);
        declareFunction("cb_sc_show_constraint_record_nl_sentence", "CB-SC-SHOW-CONSTRAINT-RECORD-NL-SENTENCE", 4, 0, false);
        declareFunction("cb_sc_show_constraint_record_sentence", "CB-SC-SHOW-CONSTRAINT-RECORD-SENTENCE", 1, 0, false);
        declareFunction("cb_sc_merge_get_one_to_alignment", "CB-SC-MERGE-GET-ONE-TO-ALIGNMENT", 1, 0, false);
        declareFunction("cb_sc_merge_get_one_from_alignment", "CB-SC-MERGE-GET-ONE-FROM-ALIGNMENT", 1, 0, false);
        declareFunction("cb_sc_merge_get_one_alignment", "CB-SC-MERGE-GET-ONE-ALIGNMENT", 1, 1, false);
        declareFunction("cb_sc_show_merge_to_scenario_actions", "CB-SC-SHOW-MERGE-TO-SCENARIO-ACTIONS", 1, 0, false);
        declareFunction("cb_sc_show_merge_from_scenario_actions", "CB-SC-SHOW-MERGE-FROM-SCENARIO-ACTIONS", 2, 0, false);
        declareFunction("cb_sc_show_merge_alignments", "CB-SC-SHOW-MERGE-ALIGNMENTS", 3, 0, false);
        declareFunction("cb_sc_elaborate_template", "CB-SC-ELABORATE-TEMPLATE", 0, 1, false);
        declareFunction("cb_link_sc_elaborate_template", "CB-LINK-SC-ELABORATE-TEMPLATE", 2, 1, false);
        declareFunction("cb_sc_show_elaborate_template", "CB-SC-SHOW-ELABORATE-TEMPLATE", 2, 0, false);
        declareFunction("cb_sc_show_template_actions", "CB-SC-SHOW-TEMPLATE-ACTIONS", 2, 0, false);
        declareFunction("cb_sc_show_template_phrase", "CB-SC-SHOW-TEMPLATE-PHRASE", 2, 0, false);
        declareFunction("cb_sc_show_template_parameters", "CB-SC-SHOW-TEMPLATE-PARAMETERS", 2, 0, false);
        declareFunction("cb_sc_show_template_parameter", "CB-SC-SHOW-TEMPLATE-PARAMETER", 1, 0, false);
        declareFunction("cb_sc_show_nothing", "CB-SC-SHOW-NOTHING", 0, 0, false);
        declareFunction("cb_sc_show_template_terms", "CB-SC-SHOW-TEMPLATE-TERMS", 2, 0, false);
        declareFunction("cb_sc_show_template_constraints", "CB-SC-SHOW-TEMPLATE-CONSTRAINTS", 2, 0, false);
        declareFunction("cb_link_sc_activate", "CB-LINK-SC-ACTIVATE", 2, 1, false);
        declareFunction("cb_sc_activate", "CB-SC-ACTIVATE", 1, 0, false);
        declareFunction("cb_link_sc_discard_scenario", "CB-LINK-SC-DISCARD-SCENARIO", 2, 1, false);
        declareFunction("cb_sc_discard_scenario", "CB-SC-DISCARD-SCENARIO", 1, 0, false);
        declareFunction("cb_link_sc_generalize_scenario", "CB-LINK-SC-GENERALIZE-SCENARIO", 2, 1, false);
        declareFunction("cb_sc_generalize_scenario", "CB-SC-GENERALIZE-SCENARIO", 1, 0, false);
        declareFunction("cb_link_sc_save_scenario", "CB-LINK-SC-SAVE-SCENARIO", 2, 1, false);
        declareFunction("cb_sc_save_scenario", "CB-SC-SAVE-SCENARIO", 1, 0, false);
        declareFunction("cb_link_sc_forget_generalization", "CB-LINK-SC-FORGET-GENERALIZATION", 2, 1, false);
        declareFunction("cb_sc_forget_generalization", "CB-SC-FORGET-GENERALIZATION", 1, 0, false);
        declareFunction("cb_sc_modify_scenario_phrase", "CB-SC-MODIFY-SCENARIO-PHRASE", 1, 0, false);
        declareFunction("cb_link_sc_modify_scenario_phrase", "CB-LINK-SC-MODIFY-SCENARIO-PHRASE", 2, 1, false);
        declareFunction("cb_handle_sc_modify_scenario_phrase", "CB-HANDLE-SC-MODIFY-SCENARIO-PHRASE", 1, 0, false);
        declareFunction("cb_sc_add_general_term", "CB-SC-ADD-GENERAL-TERM", 1, 0, false);
        declareFunction("cb_sc_provide_general_term_naming_hint", "CB-SC-PROVIDE-GENERAL-TERM-NAMING-HINT", 1, 0, false);
        declareFunction("cb_sc_offer_previous_general_term_isas", "CB-SC-OFFER-PREVIOUS-GENERAL-TERM-ISAS", 2, 0, false);
        declareFunction("cb_sc_offer_previous_general_term_genls", "CB-SC-OFFER-PREVIOUS-GENERAL-TERM-GENLS", 2, 0, false);
        declareFunction("clear_cb_sc_generate_term_signature", "CLEAR-CB-SC-GENERATE-TERM-SIGNATURE", 0, 0, false);
        declareFunction("remove_cb_sc_generate_term_signature", "REMOVE-CB-SC-GENERATE-TERM-SIGNATURE", 2, 0, false);
        declareFunction("cb_sc_generate_term_signature_internal", "CB-SC-GENERATE-TERM-SIGNATURE-INTERNAL", 2, 0, false);
        declareFunction("cb_sc_generate_term_signature", "CB-SC-GENERATE-TERM-SIGNATURE", 2, 0, false);
        declareFunction("clear_cb_sc_crack_term_signature", "CLEAR-CB-SC-CRACK-TERM-SIGNATURE", 0, 0, false);
        declareFunction("remove_cb_sc_crack_term_signature", "REMOVE-CB-SC-CRACK-TERM-SIGNATURE", 1, 0, false);
        declareFunction("cb_sc_crack_term_signature_internal", "CB-SC-CRACK-TERM-SIGNATURE-INTERNAL", 1, 0, false);
        declareFunction("cb_sc_crack_term_signature", "CB-SC-CRACK-TERM-SIGNATURE", 1, 0, false);
        declareFunction("cb_link_sc_add_general_term", "CB-LINK-SC-ADD-GENERAL-TERM", 1, 1, false);
        declareFunction("cb_handle_sc_add_general_term", "CB-HANDLE-SC-ADD-GENERAL-TERM", 1, 0, false);
        declareFunction("cb_link_sc_delete_general_term", "CB-LINK-SC-DELETE-GENERAL-TERM", 2, 1, false);
        declareFunction("cb_sc_delete_general_term", "CB-SC-DELETE-GENERAL-TERM", 1, 0, false);
        declareFunction("cb_link_sc_drop_type_sentence", "CB-LINK-SC-DROP-TYPE-SENTENCE", 4, 1, false);
        declareFunction("cb_sc_drop_type_sentence", "CB-SC-DROP-TYPE-SENTENCE", 1, 0, false);
        declareFunction("cb_link_sc_promote_type_sentence", "CB-LINK-SC-PROMOTE-TYPE-SENTENCE", 4, 1, false);
        declareFunction("cb_sc_promote_type_sentence", "CB-SC-PROMOTE-TYPE-SENTENCE", 1, 0, false);
        declareFunction("cb_sc_add_general_term_phrase", "CB-SC-ADD-GENERAL-TERM-PHRASE", 1, 0, false);
        declareFunction("cb_link_sc_add_general_term_phrase", "CB-LINK-SC-ADD-GENERAL-TERM-PHRASE", 2, 1, false);
        declareFunction("cb_handle_sc_add_general_term_phrase", "CB-HANDLE-SC-ADD-GENERAL-TERM-PHRASE", 1, 0, false);
        declareFunction("cb_link_sc_delete_general_term_phrase", "CB-LINK-SC-DELETE-GENERAL-TERM-PHRASE", 3, 1, false);
        declareFunction("cb_sc_delete_general_term_phrase", "CB-SC-DELETE-GENERAL-TERM-PHRASE", 1, 0, false);
        declareFunction("cb_sc_add_constraint", "CB-SC-ADD-CONSTRAINT", 1, 0, false);
        declareFunction("cb_sc_offer_previous_constraints", "CB-SC-OFFER-PREVIOUS-CONSTRAINTS", 1, 0, false);
        declareFunction("cb_sc_emit_indexical_record_picklist", "CB-SC-EMIT-INDEXICAL-RECORD-PICKLIST", 3, 0, false);
        declareFunction("cb_sc_emit_argument_picklist", "CB-SC-EMIT-ARGUMENT-PICKLIST", 5, 0, false);
        declareFunction("cb_sc_generate_formula_label", "CB-SC-GENERATE-FORMULA-LABEL", 2, 1, false);
        declareFunction("cb_sc_crack_formula_label", "CB-SC-CRACK-FORMULA-LABEL", 1, 0, false);
        declareFunction("cb_sc_extract_formula_labels_from_args", "CB-SC-EXTRACT-FORMULA-LABELS-FROM-ARGS", 2, 0, false);
        declareFunction("cb_link_sc_add_constraint", "CB-LINK-SC-ADD-CONSTRAINT", 1, 1, false);
        declareFunction("cb_handle_sc_add_constraint", "CB-HANDLE-SC-ADD-CONSTRAINT", 1, 0, false);
        declareFunction("cb_sc_handle_cloned_constraints", "CB-SC-HANDLE-CLONED-CONSTRAINTS", 3, 0, false);
        declareFunction("cb_sc_convert_string_to_parsing_result", "CB-SC-CONVERT-STRING-TO-PARSING-RESULT", 1, 0, false);
        declareFunction("cb_sc_interpret_arg_pos_string", "CB-SC-INTERPRET-ARG-POS-STRING", 1, 0, false);
        declareFunction("cb_sc_inform_no_parse", "CB-SC-INFORM-NO-PARSE", 2, 0, false);
        declareFunction("cb_sc_adjust_cycl_sentence", "CB-SC-ADJUST-CYCL-SENTENCE", 2, 1, false);
        declareFunction("cb_sc_uiat_encode_find_and_paste", "CB-SC-UIAT-ENCODE-FIND-AND-PASTE", 1, 0, false);
        declareFunction("is_sc_adjustment_find_and_paste_keyP", "IS-SC-ADJUSTMENT-FIND-AND-PASTE-KEY?", 1, 0, false);
        declareFunction("cb_sc_display_sentence_adjustment_options", "CB-SC-DISPLAY-SENTENCE-ADJUSTMENT-OPTIONS", 3, 0, false);
        declareFunction("cb_sc_render_adjust_choice", "CB-SC-RENDER-ADJUST-CHOICE", 4, 0, false);
        declareFunction("cb_sc_handle_adjust_sentence", "CB-SC-HANDLE-ADJUST-SENTENCE", 1, 0, false);
        declareFunction("cb_link_sc_delete_constraint", "CB-LINK-SC-DELETE-CONSTRAINT", 2, 1, false);
        declareFunction("cb_sc_delete_constraint", "CB-SC-DELETE-CONSTRAINT", 1, 0, false);
        declareFunction("cb_link_sc_merge_scenario", "CB-LINK-SC-MERGE-SCENARIO", 2, 1, false);
        declareFunction("cb_sc_merge_scenario", "CB-SC-MERGE-SCENARIO", 1, 0, false);
        declareFunction("cb_link_sc_merge_register_align_to", "CB-LINK-SC-MERGE-REGISTER-ALIGN-TO", 2, 1, false);
        declareFunction("cb_sc_merge_register_align_to", "CB-SC-MERGE-REGISTER-ALIGN-TO", 1, 0, false);
        declareFunction("cb_link_sc_merge_register_align_from", "CB-LINK-SC-MERGE-REGISTER-ALIGN-FROM", 2, 1, false);
        declareFunction("cb_sc_merge_register_align_from", "CB-SC-MERGE-REGISTER-ALIGN-FROM", 1, 0, false);
        declareFunction("cb_link_sc_do_merge", "CB-LINK-SC-DO-MERGE", 1, 1, false);
        declareFunction("cb_sc_do_merge", "CB-SC-DO-MERGE", 1, 0, false);
        declareFunction("cb_link_sc_abandon_merge", "CB-LINK-SC-ABANDON-MERGE", 1, 1, false);
        declareFunction("cb_sc_abandon_merge", "CB-SC-ABANDON-MERGE", 1, 0, false);
        declareFunction("cb_sc_declare_done", "CB-SC-DECLARE-DONE", 1, 0, false);
        declareFunction("cb_link_sc_declare_done", "CB-LINK-SC-DECLARE-DONE", 1, 1, false);
        return NIL;
    }

    public static final SubLObject init_cb_scenario_constructor_file() {
        defparameter("*CB-SC-CONTEXT-COLOR-MAP*", $list_alt31);
        deflexical("*CB-SC-SHOW-SCENARIO-COLORMAP*", html_rendering.construct_html_node_rendering_colormap_helper($str_alt96$_ffcfcf, $str_alt97$_cfcfff, html_macros.$html_color_lighter_green$.getDynamicValue(), html_macros.$html_color_sat_green$.getDynamicValue(), html_macros.$html_color_light_grey$.getDynamicValue()));
        defvar("*CB-SC-INDEXICAL-BGCOLOR*", NIL);
        defparameter("*CB-SC-INSERT-TARGET*", NIL);
        deflexical("*CB-SC-DEFAULT-GENERAL-TERM*", $$$Dramatis_Personae);
        deflexical("*CB-SC-DEFAULT-GENERAL-TERM-HEADING*", cconcatenate($cb_sc_default_general_term$.getGlobalValue(), $str_alt103$__Terms_for_Actors_Participants_i));
        deflexical("*CB-SC-GENERATE-TERM-SIGNATURE-CACHING-STATE*", NIL);
        deflexical("*CB-SC-CRACK-TERM-SIGNATURE-CACHING-STATE*", NIL);
        deflexical("*CB-SC-FORMULA-LABEL-SEPARATOR*", CHAR_hyphen);
        deflexical("*CB-SC-FORMULA-LABEL-SEPARATOR-STRING*", string_utilities.to_string($cb_sc_formula_label_separator$.getGlobalValue()));
        deflexical("*CB-SC-FORMULA-LABEL-SEPARATOR-LIST*", list($cb_sc_formula_label_separator_string$.getGlobalValue()));
        deflexical("*CB-SC-ADJUSTMENT-FIND-AND-PASTE-STRING*", $str_alt315$Find___Paste);
        deflexical("*CB-SC-ADJUSTMENT-FIND-AND-PASTE-KEY*", NIL != boundp($cb_sc_adjustment_find_and_paste_key$) ? ((SubLObject) ($cb_sc_adjustment_find_and_paste_key$.getGlobalValue())) : make_symbol($$$Find_And_Paste));
        return NIL;
    }

    public static final SubLObject setup_cb_scenario_constructor_file() {
                html_macros.note_html_handler_function(CB_SC_OPEN_SCENARIOS);
        cb_utilities.setup_cb_link_method($SC_OPEN_SCENARIOS, CB_LINK_SC_OPEN_SCENARIOS, TWO_INTEGER);
        cb_utilities.setup_cb_link_method($CB_SC_RELOAD_SCENARIO, CB_LINK_CB_SC_RELOAD_SCENARIO, FOUR_INTEGER);
        html_macros.note_html_handler_function(CB_SC_RELOAD_SCENARIO);
        html_macros.note_html_handler_function(CB_SC_FIND_SCENARIO);
        cb_utilities.setup_cb_link_method($SC_FIND_SCENARIO, CB_LINK_SC_FIND_SCENARIO, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_SC_HANDLE_FIND_SCENARIO);
        html_macros.note_html_handler_function(CB_SC_ELABORATE);
        cb_utilities.setup_cb_link_method($SC_ELABORATE, CB_LINK_SC_ELABORATE, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_SC_ELABORATE_TEMPLATE);
        cb_utilities.setup_cb_link_method($SC_ELABORATE_TEMPLATE, CB_LINK_SC_ELABORATE_TEMPLATE, THREE_INTEGER);
        cb_utilities.setup_cb_link_method($SC_ACTIVATE, CB_LINK_SC_ACTIVATE, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_SC_ACTIVATE);
        cb_utilities.setup_cb_link_method($SC_DISCARD_SCENARIO, CB_LINK_SC_DISCARD_SCENARIO, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_SC_DISCARD_SCENARIO);
        cb_utilities.setup_cb_link_method($SC_GENERALIZE_SCENARIO, CB_LINK_SC_GENERALIZE_SCENARIO, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_SC_GENERALIZE_SCENARIO);
        cb_utilities.setup_cb_link_method($SC_SAVE_SCENARIO, CB_LINK_SC_SAVE_SCENARIO, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_SC_SAVE_SCENARIO);
        cb_utilities.setup_cb_link_method($SC_FORGET_GENERALIZATION, CB_LINK_SC_FORGET_GENERALIZATION, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_SC_FORGET_GENERALIZATION);
        html_macros.note_html_handler_function(CB_SC_MODIFY_SCENARIO_PHRASE);
        cb_utilities.setup_cb_link_method($SC_MODIFY_SCENARIO_PHRASE, CB_LINK_SC_MODIFY_SCENARIO_PHRASE, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_HANDLE_SC_MODIFY_SCENARIO_PHRASE);
        html_macros.note_html_handler_function(CB_SC_ADD_GENERAL_TERM);
        memoization_state.note_globally_cached_function(CB_SC_GENERATE_TERM_SIGNATURE);
        memoization_state.note_globally_cached_function(CB_SC_CRACK_TERM_SIGNATURE);
        cb_utilities.setup_cb_link_method($SC_ADD_GENERAL_TERM, CB_LINK_SC_ADD_GENERAL_TERM, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_HANDLE_SC_ADD_GENERAL_TERM);
        cb_utilities.setup_cb_link_method($SC_DELETE_GENERAL_TERM, CB_LINK_SC_DELETE_GENERAL_TERM, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_SC_DELETE_GENERAL_TERM);
        cb_utilities.setup_cb_link_method($SC_DROP_TYPE_SENTENCE, CB_LINK_SC_DROP_TYPE_SENTENCE, FIVE_INTEGER);
        html_macros.note_html_handler_function(CB_SC_DROP_TYPE_SENTENCE);
        cb_utilities.setup_cb_link_method($SC_PROMOTE_TYPE_SENTENCE, CB_LINK_SC_PROMOTE_TYPE_SENTENCE, FIVE_INTEGER);
        html_macros.note_html_handler_function(CB_SC_PROMOTE_TYPE_SENTENCE);
        html_macros.note_html_handler_function(CB_SC_ADD_GENERAL_TERM_PHRASE);
        cb_utilities.setup_cb_link_method($SC_ADD_GENERAL_TERM_PHRASE, CB_LINK_SC_ADD_GENERAL_TERM_PHRASE, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_HANDLE_SC_ADD_GENERAL_TERM_PHRASE);
        cb_utilities.setup_cb_link_method($SC_DELETE_GENERAL_TERM_PHRASE, CB_LINK_SC_DELETE_GENERAL_TERM_PHRASE, FOUR_INTEGER);
        html_macros.note_html_handler_function(CB_SC_DELETE_GENERAL_TERM_PHRASE);
        html_macros.note_html_handler_function(CB_SC_ADD_CONSTRAINT);
        cb_utilities.setup_cb_link_method($SC_ADD_CONSTRAINT, CB_LINK_SC_ADD_CONSTRAINT, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_HANDLE_SC_ADD_CONSTRAINT);
        subl_macro_promotions.declare_defglobal($cb_sc_adjustment_find_and_paste_key$);
        html_macros.note_html_handler_function(CB_SC_HANDLE_ADJUST_SENTENCE);
        cb_utilities.setup_cb_link_method($SC_DELETE_CONSTRAINT, CB_LINK_SC_DELETE_CONSTRAINT, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_SC_DELETE_CONSTRAINT);
        cb_utilities.setup_cb_link_method($SC_MERGE_SCENARIO, CB_LINK_SC_MERGE_SCENARIO, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_SC_MERGE_SCENARIO);
        cb_utilities.setup_cb_link_method($SC_MERGE_REGISTER_ALIGN_TO, CB_LINK_SC_MERGE_REGISTER_ALIGN_TO, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_SC_MERGE_REGISTER_ALIGN_TO);
        cb_utilities.setup_cb_link_method($SC_MERGE_REGISTER_ALIGN_FROM, CB_LINK_SC_MERGE_REGISTER_ALIGN_FROM, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_SC_MERGE_REGISTER_ALIGN_FROM);
        cb_utilities.setup_cb_link_method($SC_DO_MERGE, CB_LINK_SC_DO_MERGE, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_SC_DO_MERGE);
        cb_utilities.setup_cb_link_method($SC_ABANDON_MERGE, CB_LINK_SC_ABANDON_MERGE, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_SC_ABANDON_MERGE);
        html_macros.note_html_handler_function(CB_SC_DECLARE_DONE);
        cb_utilities.setup_cb_link_method($SC_DECLARE_DONE, CB_LINK_SC_DECLARE_DONE, TWO_INTEGER);
        return NIL;
    }

    // // Internal Constants
    static private final SubLSymbol $sym0$BGCOLOR = makeUninternedSymbol("BGCOLOR");



    static private final SubLList $list_alt2 = list(list(makeSymbol("CB-SC-CONTEXT-COLOR"), makeKeyword("BACKGROUND")));







    static private final SubLList $list_alt6 = list(list(makeSymbol("STATE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym7$INTERACTION = makeUninternedSymbol("INTERACTION");

    private static final SubLSymbol SC_STATE_INTERACTION = makeSymbol("SC-STATE-INTERACTION");





    private static final SubLSymbol CB_UIAT_DISPLAY_DOCUMENT = makeSymbol("CB-UIAT-DISPLAY-DOCUMENT");



    private static final SubLSymbol CB_SC_BODY = makeSymbol("CB-SC-BODY");

    static private final SubLList $list_alt14 = list(list(makeSymbol("BGCOLOR"), makeSymbol("&KEY"), makeSymbol("CELLPADDING")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt15 = list(makeKeyword("CELLPADDING"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    private static final SubLSymbol HTML_FANCY_TABLE = makeSymbol("HTML-FANCY-TABLE");















    static private final SubLList $list_alt26 = list(makeKeyword("NOFLOW"), T, makeKeyword("NOWRAP"), T);

    private static final SubLSymbol $SC_ELABORATE = makeKeyword("SC-ELABORATE");

    static private final SubLString $str_alt28$_Elaborate_Scenario_ = makeString("[Elaborate Scenario]");

    private static final SubLSymbol $SC_ACTIVATE = makeKeyword("SC-ACTIVATE");

    static private final SubLString $str_alt30$_Activate_Scenario_ = makeString("[Activate Scenario]");

    static private final SubLList $list_alt31 = list(new SubLObject[]{ list(makeKeyword("BACKGROUND"), makeString("#cfcfcf")), list(makeKeyword("SCENARIO-ACTIONS"), makeString("#ffcfcf")), list(makeKeyword("OTHER-SCENARIOS"), makeString("#cfffcf")), list(makeKeyword("INDEXICALS"), makeString("#cfcfff")), list(makeKeyword("CONSTRAINTS"), makeString("#ffffff")), list(makeKeyword("UNUSED-INDEXICALS"), makeString("#ffcfcf")), list(makeKeyword("MERGE"), makeString("#ffffcf")), list(makeKeyword("TEMPLATE-PARAMETERS"), makeString("#ffcfff")), list($NONE, makeString("#cfcfcf")) });

    static private final SubLList $list_alt32 = list(makeSymbol("ID-STRING"));

    private static final SubLSymbol CB_SC_OPEN_SCENARIOS = makeSymbol("CB-SC-OPEN-SCENARIOS");

    static private final SubLString $str_alt34$_Open_Scenarios_ = makeString("[Open Scenarios]");



    static private final SubLString $str_alt36$cb_sc_open_scenarios__A = makeString("cb-sc-open-scenarios&~A");

    private static final SubLSymbol $SC_OPEN_SCENARIOS = makeKeyword("SC-OPEN-SCENARIOS");

    private static final SubLSymbol CB_LINK_SC_OPEN_SCENARIOS = makeSymbol("CB-LINK-SC-OPEN-SCENARIOS");

    static private final SubLString $$$Summary_of_Open_Scenarios = makeString("Summary of Open Scenarios");

    static private final SubLString $str_alt40$Active_Scenario___ = makeString("Active Scenario : ");

    static private final SubLString $str_alt41$Other_Scenarios___ = makeString("Other Scenarios : ");

    static private final SubLString $$$Open_Scenarios = makeString("Open Scenarios");

    static private final SubLString $$$No_Open_Scenarios = makeString("No Open Scenarios");

    static private final SubLString $str_alt44$Click_ = makeString("Click ");

    private static final SubLSymbol $SC_FIND_SCENARIO = makeKeyword("SC-FIND-SCENARIO");

    static private final SubLString $$$here = makeString("here");

    static private final SubLString $str_alt47$_to_search_for_or_introduce_a_sce = makeString(" to search for or introduce a scenario.");



    static private final SubLString $$$Saved_Scenarios = makeString("Saved Scenarios");

    static private final SubLList $list_alt50 = list(makeSymbol("SCENARIO-TERM"), makeSymbol("SCENARIO-STRING"));





    private static final SubLSymbol $CB_SC_RELOAD_SCENARIO = makeKeyword("CB-SC-RELOAD-SCENARIO");



    static private final SubLString $str_alt55$_Reload_ = makeString("[Reload]");

    static private final SubLString $str_alt56$cb_sc_reload_scenario = makeString("cb-sc-reload-scenario");

    private static final SubLSymbol CB_LINK_CB_SC_RELOAD_SCENARIO = makeSymbol("CB-LINK-CB-SC-RELOAD-SCENARIO");

    static private final SubLList $list_alt58 = list(makeSymbol("STATE-ID"), makeSymbol("SCENARIO-TERM"), makeSymbol("SCENARIO-PHRASE"));

    private static final SubLSymbol $RELOAD_SCENARIO = makeKeyword("RELOAD-SCENARIO");

    private static final SubLSymbol $SCENARIO_TERM = makeKeyword("SCENARIO-TERM");



    static private final SubLString $$$Failed_to_load_scenario = makeString("Failed to load scenario");

    private static final SubLSymbol CB_SC_RELOAD_SCENARIO = makeSymbol("CB-SC-RELOAD-SCENARIO");

    private static final SubLSymbol CB_SC_FIND_SCENARIO = makeSymbol("CB-SC-FIND-SCENARIO");

    static private final SubLString $str_alt65$_Find_Scenario_ = makeString("[Find Scenario]");

    static private final SubLString $str_alt66$cb_sc_find_scenario__A = makeString("cb-sc-find-scenario&~A");

    private static final SubLSymbol CB_LINK_SC_FIND_SCENARIO = makeSymbol("CB-LINK-SC-FIND-SCENARIO");

    static private final SubLString $str_alt68$cb_sc_handle_find_scenario = makeString("cb-sc-handle-find-scenario");

    static private final SubLString $str_alt69$state_id = makeString("state-id");

    static private final SubLString $str_alt70$Enter_an_English_phrase_for_your_ = makeString("Enter an English phrase for your scenario of interest :");

    static private final SubLString $$$Find_Scenario = makeString("Find Scenario");

    static private final SubLString $$$Clear = makeString("Clear");

    static private final SubLString $$$text = makeString("text");

    public static final SubLInteger $int$80 = makeInteger(80);

    static private final SubLString $$$virtual = makeString("virtual");

    private static final SubLSymbol $FIND_SCENARIO = makeKeyword("FIND-SCENARIO");

    private static final SubLSymbol CB_SC_HANDLE_FIND_SCENARIO = makeSymbol("CB-SC-HANDLE-FIND-SCENARIO");

    private static final SubLSymbol CB_SC_ELABORATE = makeSymbol("CB-SC-ELABORATE");

    static private final SubLString $str_alt79$cb_sc_elaborate__A = makeString("cb-sc-elaborate&~A");

    private static final SubLSymbol CB_LINK_SC_ELABORATE = makeSymbol("CB-LINK-SC-ELABORATE");

    private static final SubLSymbol $SCENARIO_ACTIONS = makeKeyword("SCENARIO-ACTIONS");

    static private final SubLString $$$Active_Scenario = makeString("Active Scenario");

    static private final SubLString $str_alt83$__ = makeString(": ");

    private static final SubLSymbol $SC_MODIFY_SCENARIO_PHRASE = makeKeyword("SC-MODIFY-SCENARIO-PHRASE");

    static private final SubLString $str_alt85$_ = makeString(" ");

    private static final SubLSymbol $SC_DISCARD_SCENARIO = makeKeyword("SC-DISCARD-SCENARIO");

    private static final SubLSymbol $SC_GENERALIZE_SCENARIO = makeKeyword("SC-GENERALIZE-SCENARIO");

    private static final SubLSymbol $SC_ELABORATE_TEMPLATE = makeKeyword("SC-ELABORATE-TEMPLATE");

    private static final SubLSymbol $SC_DECLARE_DONE = makeKeyword("SC-DECLARE-DONE");

    private static final SubLSymbol $OTHER_SCENARIOS = makeKeyword("OTHER-SCENARIOS");

    static private final SubLString $$$Other_Scenarios = makeString("Other Scenarios");

    static private final SubLString $$$Scenarios_Open_for_Editing = makeString("Scenarios Open for Editing");

    static private final SubLString $$$Scenarios_Open_for_Viewing = makeString("Scenarios Open for Viewing");

    private static final SubLSymbol $SC_MERGE_SCENARIO = makeKeyword("SC-MERGE-SCENARIO");

    static private final SubLString $str_alt95$_Merge_From_This_Scenario_ = makeString("[Merge From This Scenario]");

    static private final SubLString $str_alt96$_ffcfcf = makeString("#ffcfcf");

    static private final SubLString $str_alt97$_cfcfff = makeString("#cfcfff");

    static private final SubLString $$$CENTER = makeString("CENTER");

    static private final SubLString $str_alt99$90_ = makeString("90%");

    public static final SubLObject $$unknownSentence = constant_handles.reader_make_constant_shell(makeString("unknownSentence"));



    static private final SubLString $$$Dramatis_Personae = makeString("Dramatis Personae");

    static private final SubLString $str_alt103$__Terms_for_Actors_Participants_i = makeString(" (Terms for Actors/Participants in Scenario):");



    private static final SubLSymbol $SC_ADD_GENERAL_TERM = makeKeyword("SC-ADD-GENERAL-TERM");

    static private final SubLString $str_alt106$_Add_new_Actor_Prop_ = makeString("[Add new Actor/Prop]");

    static private final SubLString $str_alt107$100_ = makeString("100%");

    private static final SubLSymbol $SC_DROP_TYPE_SENTENCE = makeKeyword("SC-DROP-TYPE-SENTENCE");

    private static final SubLSymbol $SC_PROMOTE_TYPE_SENTENCE = makeKeyword("SC-PROMOTE-TYPE-SENTENCE");

    private static final SubLSymbol SM_CONSTRAINT_RECORD_SENTENCE = makeSymbol("SM-CONSTRAINT-RECORD-SENTENCE");



    static private final SubLString $str_alt112$Where__ = makeString("Where: ");

    private static final SubLSymbol $SC_DELETE_GENERAL_TERM = makeKeyword("SC-DELETE-GENERAL-TERM");

    static private final SubLString $str_alt114$_Drop_Term_ = makeString("[Drop Term]");

    private static final SubLSymbol $SC_ADD_GENERAL_TERM_PHRASE = makeKeyword("SC-ADD-GENERAL-TERM-PHRASE");

    static private final SubLString $str_alt116$_Add_a_name_ = makeString("[Add a name]");



    private static final SubLSymbol $SC_MERGE_REGISTER_ALIGN_TO = makeKeyword("SC-MERGE-REGISTER-ALIGN-TO");



    private static final SubLSymbol $SC_MERGE_REGISTER_ALIGN_FROM = makeKeyword("SC-MERGE-REGISTER-ALIGN-FROM");

    static private final SubLString $str_alt121$_A_is_not_a_recognized_merging_ke = makeString("~A is not a recognized merging key.");



    private static final SubLSymbol $SC_DELETE_GENERAL_TERM_PHRASE = makeKeyword("SC-DELETE-GENERAL-TERM-PHRASE");

    static private final SubLString $str_alt124$_Drop_Name_ = makeString("[Drop Name]");



    static private final SubLString $str_alt126$Constraints_and_Relationships_bet = makeString("Constraints and Relationships between Participants:");

    private static final SubLSymbol $SC_ADD_CONSTRAINT = makeKeyword("SC-ADD-CONSTRAINT");

    static private final SubLString $str_alt128$ = makeString("");

    private static final SubLSymbol $SC_DELETE_CONSTRAINT = makeKeyword("SC-DELETE-CONSTRAINT");

    static private final SubLString $str_alt130$_Drop_Constraint_ = makeString("[Drop Constraint]");

    static private final SubLString $str_alt131$20_ = makeString("20%");

    static private final SubLString $str_alt132$Merging_To_Scenario_ = makeString("Merging To Scenario:");

    static private final SubLString $str_alt133$Merging_From_Scenario_ = makeString("Merging From Scenario:");

    static private final SubLString $str_alt134$Select_a_Different_Merge_From_Sce = makeString("Select a Different Merge-From Scenario");



    static private final SubLString $$$Aligned_Terms = makeString("Aligned Terms");

    private static final SubLSymbol $SC_DO_MERGE = makeKeyword("SC-DO-MERGE");

    private static final SubLSymbol $SC_ABANDON_MERGE = makeKeyword("SC-ABANDON-MERGE");

    static private final SubLList $list_alt139 = list(makeSymbol("TO-INDEXICAL-RECORD"), makeSymbol("FROM-INDEXICAL-RECORD"));

    static private final SubLString $str_alt140$50_ = makeString("50%");

    static private final SubLList $list_alt141 = list(makeSymbol("STATE-ID-STRING"), makeSymbol("TEMPLATE-ID-STRING"));

    private static final SubLSymbol CB_SC_ELABORATE_TEMPLATE = makeSymbol("CB-SC-ELABORATE-TEMPLATE");

    static private final SubLString $str_alt143$_Show_Generalized_Scenario_ = makeString("[Show Generalized Scenario]");

    static private final SubLString $str_alt144$cb_sc_elaborate_template__A__A = makeString("cb-sc-elaborate-template&~A&~A");

    private static final SubLSymbol CB_LINK_SC_ELABORATE_TEMPLATE = makeSymbol("CB-LINK-SC-ELABORATE-TEMPLATE");

    static private final SubLString $$$Generalized_Scenario = makeString("Generalized Scenario");

    private static final SubLSymbol $SC_SAVE_SCENARIO = makeKeyword("SC-SAVE-SCENARIO");

    private static final SubLSymbol $SC_FORGET_GENERALIZATION = makeKeyword("SC-FORGET-GENERALIZATION");

    private static final SubLSymbol $TEMPLATE_PARAMETERS = makeKeyword("TEMPLATE-PARAMETERS");

    static private final SubLString $$$Parameters = makeString("Parameters");

    static private final SubLString $$$Constraints = makeString("Constraints");

    static private final SubLString $str_alt152$cb_sc_activate__A__A = makeString("cb-sc-activate&~A&~A");

    private static final SubLSymbol CB_LINK_SC_ACTIVATE = makeSymbol("CB-LINK-SC-ACTIVATE");

    static private final SubLList $list_alt154 = list(makeSymbol("STATE-ID-STRING"), makeSymbol("SESSION-ID-STRING"));

    private static final SubLSymbol CB_SC_ACTIVATE = makeSymbol("CB-SC-ACTIVATE");

    static private final SubLString $str_alt156$_Discard_Scenario_ = makeString("[Discard Scenario]");

    static private final SubLString $str_alt157$cb_sc_discard_scenario__A = makeString("cb-sc-discard-scenario&~A");

    private static final SubLSymbol CB_LINK_SC_DISCARD_SCENARIO = makeSymbol("CB-LINK-SC-DISCARD-SCENARIO");

    private static final SubLSymbol CB_SC_DISCARD_SCENARIO = makeSymbol("CB-SC-DISCARD-SCENARIO");

    static private final SubLString $str_alt160$_Generalize_Scenario_ = makeString("[Generalize Scenario]");

    static private final SubLString $str_alt161$cb_sc_generalize_scenario__A = makeString("cb-sc-generalize-scenario&~A");

    private static final SubLSymbol CB_LINK_SC_GENERALIZE_SCENARIO = makeSymbol("CB-LINK-SC-GENERALIZE-SCENARIO");

    private static final SubLSymbol CB_SC_GENERALIZE_SCENARIO = makeSymbol("CB-SC-GENERALIZE-SCENARIO");

    static private final SubLString $str_alt164$_Save_Scenario_ = makeString("[Save Scenario]");

    static private final SubLString $str_alt165$cb_sc_save_scenario__A__A = makeString("cb-sc-save-scenario&~A&~A");

    private static final SubLSymbol CB_LINK_SC_SAVE_SCENARIO = makeSymbol("CB-LINK-SC-SAVE-SCENARIO");

    private static final SubLSymbol CB_SC_SAVE_SCENARIO = makeSymbol("CB-SC-SAVE-SCENARIO");

    static private final SubLString $str_alt168$_Forget_Generalization_ = makeString("[Forget Generalization]");

    static private final SubLString $str_alt169$cb_sc_forget_generalization__A__A = makeString("cb-sc-forget-generalization&~A&~A");

    private static final SubLSymbol CB_LINK_SC_FORGET_GENERALIZATION = makeSymbol("CB-LINK-SC-FORGET-GENERALIZATION");

    private static final SubLSymbol CB_SC_FORGET_GENERALIZATION = makeSymbol("CB-SC-FORGET-GENERALIZATION");

    static private final SubLString $str_alt172$cb_handle_sc_modify_scenario_phra = makeString("cb-handle-sc-modify-scenario-phrase");

    static private final SubLString $str_alt173$Enter_a_better_phrase_to_name_the = makeString("Enter a better phrase to name the scenario :");

    static private final SubLString $$$Modify_Phrase = makeString("Modify Phrase");

    static private final SubLString $str_alt175$scenario_phrase = makeString("scenario-phrase");

    private static final SubLSymbol CB_SC_MODIFY_SCENARIO_PHRASE = makeSymbol("CB-SC-MODIFY-SCENARIO-PHRASE");

    static private final SubLString $str_alt177$_Modify_Name_of_Scenario_ = makeString("[Modify Name of Scenario]");

    static private final SubLString $str_alt178$cb_sc_modify_scenario_phrase__A = makeString("cb-sc-modify-scenario-phrase&~A");

    private static final SubLSymbol CB_LINK_SC_MODIFY_SCENARIO_PHRASE = makeSymbol("CB-LINK-SC-MODIFY-SCENARIO-PHRASE");

    private static final SubLSymbol CB_HANDLE_SC_MODIFY_SCENARIO_PHRASE = makeSymbol("CB-HANDLE-SC-MODIFY-SCENARIO-PHRASE");

    static private final SubLString $str_alt181$cb_handle_sc_add_general_term = makeString("cb-handle-sc-add-general-term");

    static private final SubLString $str_alt182$Enter_a_name_for_this_participant = makeString("Enter a name for this participant: ");

    static private final SubLString $str_alt183$indexical_phrase = makeString("indexical-phrase");

    public static final SubLInteger $int$30 = makeInteger(30);

    static private final SubLString $str_alt185$For_the_purposes_of_constructing_ = makeString("For the purposes of constructing the scenario, it will be easiest if Cyc can make some assumptions about what this actor or prop is.  These assumptions will be used to guide the scenario constructor, but will not be used in the final knowledge representation.");

    static private final SubLString $str_alt186$Please_enter_at_least_one_of_the_ = makeString("Please enter at least one of the following types of assumptions about this participant :");

    static private final SubLString $$$right = makeString("right");

    static private final SubLString $str_alt188$It_is_an_individual_instance_of_ = makeString("It is an individual instance of ");

    static private final SubLString $$$left = makeString("left");

    static private final SubLString $str_alt190$isa_phrase = makeString("isa-phrase");

    static private final SubLString $str_alt191$It_is_a_more_specific_kind_of_ = makeString("It is a more specific kind of ");

    static private final SubLString $str_alt192$genl_phrase = makeString("genl-phrase");

    static private final SubLString $str_alt193$It_is_similar_to_ = makeString("It is similar to ");

    static private final SubLString $str_alt194$exemplar_phrase = makeString("exemplar-phrase");

    static private final SubLString $$$Add_this_Participant = makeString("Add this Participant");

    private static final SubLSymbol $UIA_NEXT_INTERACTION = makeKeyword("UIA-NEXT-INTERACTION");

    static private final SubLString $str_alt197$_Continue_without_Adding_Particip = makeString("[Continue without Adding Participant]");

    private static final SubLSymbol CB_SC_ADD_GENERAL_TERM = makeSymbol("CB-SC-ADD-GENERAL-TERM");

    static private final SubLString $$$the_molecule = makeString("the molecule");

    static private final SubLString $$$the_type_of_molecule = makeString("the type of molecule");

    static private final SubLString $str_alt201$Hint__It_will_usually_be_better_t = makeString("Hint: It will usually be better to use a phrase, such as '");

    static private final SubLString $str_alt202$__or__ = makeString("' or '");

    static private final SubLString $str_alt203$____that_doesn_t_refer_to_an_exis = makeString("',  that doesn't refer to an existing concept.");

    static private final SubLString $$$or_reuse_a_category = makeString("or reuse a category");

    static private final SubLString $str_alt205$previous_isa_chosen = makeString("previous-isa-chosen");

    static private final SubLString $str_alt206$previous_isas = makeString("previous-isas");

    static private final SubLString $$$isa = makeString("isa");

    static private final SubLString $str_alt208$previous_genls_chosen = makeString("previous-genls-chosen");

    static private final SubLString $str_alt209$previous_genls = makeString("previous-genls");

    static private final SubLString $$$genl = makeString("genl");

    private static final SubLSymbol CB_SC_GENERATE_TERM_SIGNATURE = makeSymbol("CB-SC-GENERATE-TERM-SIGNATURE");

    static private final SubLString $$$C = makeString("C");

    static private final SubLString $$$N = makeString("N");

    static private final SubLString $str_alt214$_ = makeString("-");

    public static final SubLSymbol $cb_sc_generate_term_signature_caching_state$ = makeSymbol("*CB-SC-GENERATE-TERM-SIGNATURE-CACHING-STATE*");

    public static final SubLSymbol $kw216$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    private static final SubLSymbol CB_SC_CRACK_TERM_SIGNATURE = makeSymbol("CB-SC-CRACK-TERM-SIGNATURE");

    static private final SubLList $list_alt218 = list(makeString("-"));

    public static final SubLSymbol $cb_sc_crack_term_signature_caching_state$ = makeSymbol("*CB-SC-CRACK-TERM-SIGNATURE-CACHING-STATE*");

    static private final SubLString $str_alt220$_Add_new_General_Term_ = makeString("[Add new General Term]");

    static private final SubLString $str_alt221$cb_sc_add_general_term__A = makeString("cb-sc-add-general-term&~A");

    private static final SubLSymbol CB_LINK_SC_ADD_GENERAL_TERM = makeSymbol("CB-LINK-SC-ADD-GENERAL-TERM");

    private static final SubLSymbol $ADD_GENERAL_TERM = makeKeyword("ADD-GENERAL-TERM");



    private static final SubLSymbol $ISA_PHRASE = makeKeyword("ISA-PHRASE");

    private static final SubLSymbol $GENL_PHRASE = makeKeyword("GENL-PHRASE");

    private static final SubLSymbol $ISA_TERM = makeKeyword("ISA-TERM");

    private static final SubLSymbol $GENL_TERM = makeKeyword("GENL-TERM");

    private static final SubLSymbol $EXEMPLAR_PHRASE = makeKeyword("EXEMPLAR-PHRASE");

    private static final SubLSymbol CB_HANDLE_SC_ADD_GENERAL_TERM = makeSymbol("CB-HANDLE-SC-ADD-GENERAL-TERM");

    static private final SubLString $str_alt231$_Delete_General_Term_ = makeString("[Delete General Term]");

    static private final SubLString $str_alt232$cb_sc_delete_general_term__A__A = makeString("cb-sc-delete-general-term&~A&~A");

    private static final SubLSymbol CB_LINK_SC_DELETE_GENERAL_TERM = makeSymbol("CB-LINK-SC-DELETE-GENERAL-TERM");

    static private final SubLList $list_alt234 = list(makeSymbol("STATE-ID-STRING"), makeSymbol("IR-ID-STRING"));

    private static final SubLSymbol CB_SC_DELETE_GENERAL_TERM = makeSymbol("CB-SC-DELETE-GENERAL-TERM");

    static private final SubLString $str_alt236$_Drop_Assumption_ = makeString("[Drop Assumption]");

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    static private final SubLString $str_alt238$cb_sc_drop_type_sentence__A__A__A = makeString("cb-sc-drop-type-sentence&~A&~A&~A&~A&~A");

    private static final SubLSymbol CB_LINK_SC_DROP_TYPE_SENTENCE = makeSymbol("CB-LINK-SC-DROP-TYPE-SENTENCE");

    static private final SubLList $list_alt240 = list(makeSymbol("STATE-ID-STRING"), makeSymbol("IR-ID-STRING"), makeSymbol("TYPE-CODE-STRING"), makeSymbol("FORT-TYPE-STRING"), makeSymbol("COL-ID-STRING"));

    public static final SubLObject $$genls = constant_handles.reader_make_constant_shell(makeString("genls"));





    private static final SubLSymbol CB_SC_DROP_TYPE_SENTENCE = makeSymbol("CB-SC-DROP-TYPE-SENTENCE");

    static private final SubLString $str_alt245$_Promote_to_Constraint_ = makeString("[Promote to Constraint]");

    static private final SubLString $str_alt246$cb_sc_promote_type_sentence__A__A = makeString("cb-sc-promote-type-sentence&~A&~A&~A&~A&~A");

    private static final SubLSymbol CB_LINK_SC_PROMOTE_TYPE_SENTENCE = makeSymbol("CB-LINK-SC-PROMOTE-TYPE-SENTENCE");

    private static final SubLSymbol CB_SC_PROMOTE_TYPE_SENTENCE = makeSymbol("CB-SC-PROMOTE-TYPE-SENTENCE");

    static private final SubLString $str_alt249$cb_handle_sc_add_general_term_phr = makeString("cb-handle-sc-add-general-term-phrase");

    static private final SubLString $str_alt250$ir_id = makeString("ir-id");

    static private final SubLString $str_alt251$General_Term__ = makeString("General Term :");

    static private final SubLString $str_alt252$Enter_another_short_phrase_for_th = makeString("Enter another short phrase for the term :");

    static private final SubLString $str_alt253$general_term_phrase = makeString("general-term-phrase");

    static private final SubLString $$$Add_Phrase = makeString("Add Phrase");

    private static final SubLSymbol CB_SC_ADD_GENERAL_TERM_PHRASE = makeSymbol("CB-SC-ADD-GENERAL-TERM-PHRASE");

    static private final SubLString $str_alt256$_Add_New_Phrase_ = makeString("[Add New Phrase]");

    static private final SubLString $str_alt257$cb_sc_add_general_term_phrase__A_ = makeString("cb-sc-add-general-term-phrase&~A&~A");

    private static final SubLSymbol CB_LINK_SC_ADD_GENERAL_TERM_PHRASE = makeSymbol("CB-LINK-SC-ADD-GENERAL-TERM-PHRASE");

    private static final SubLSymbol CB_HANDLE_SC_ADD_GENERAL_TERM_PHRASE = makeSymbol("CB-HANDLE-SC-ADD-GENERAL-TERM-PHRASE");

    static private final SubLString $str_alt260$_Delete_Phrase_ = makeString("[Delete Phrase]");

    static private final SubLString $str_alt261$cb_sc_delete_general_term_phrase_ = makeString("cb-sc-delete-general-term-phrase&~A&~A&");

    private static final SubLSymbol CB_LINK_SC_DELETE_GENERAL_TERM_PHRASE = makeSymbol("CB-LINK-SC-DELETE-GENERAL-TERM-PHRASE");

    static private final SubLList $list_alt263 = list(makeSymbol("STATE-ID-STRING"), makeSymbol("IR-ID-STRING"), makeSymbol("GENERAL-TERM-PHRASE"));

    private static final SubLSymbol CB_SC_DELETE_GENERAL_TERM_PHRASE = makeSymbol("CB-SC-DELETE-GENERAL-TERM-PHRASE");

    static private final SubLString $str_alt265$constraint_string = makeString("constraint-string");

    static private final SubLString $str_alt266$terms_id = makeString("terms_id");

    static private final SubLString $str_alt267$text_css = makeString("text/css");

    static private final SubLString $$$screen = makeString("screen");

    static private final SubLString $$$none = makeString("none");

    static private final SubLString $str_alt270$cb_handle_sc_add_constraint = makeString("cb-handle-sc-add-constraint");

    static private final SubLString $str_alt271$The_following_phrases_must_be_use = makeString("The following phrases must be used if you want to refer to known participants:");

    static private final SubLString $str_alt272$Enter_a_short_sentence_stating_th = makeString("Enter a short sentence stating the constraint:");

    public static final SubLInteger $int$60 = makeInteger(60);

    static private final SubLString $$$Submit = makeString("Submit");

    static private final SubLString $str_alt275$_Continue_without_Adding_Constrai = makeString("[Continue without Adding Constraint]");

    private static final SubLSymbol CB_SC_ADD_CONSTRAINT = makeSymbol("CB-SC-ADD-CONSTRAINT");

    private static final SubLSymbol $BASE_FORMULAS = makeKeyword("BASE-FORMULAS");

    static private final SubLString $str_alt278$Construct_a_constraint_similar_to = makeString("Construct a constraint similar to the previous ones : ");



    static private final SubLString $$$Add = makeString("Add");

    static private final SubLString $$$chosen = makeString("chosen");





    static private final SubLString $$$indexical = makeString("indexical");

    static private final SubLString $$$arg = makeString("arg");

    static private final SubLList $list_alt286 = list(makeSymbol("KEY"), makeSymbol("VALUE"));

    static private final SubLString $str_alt287$_Add_new_constraint_ = makeString("[Add new constraint]");

    static private final SubLString $str_alt288$cb_sc_add_constraint__A = makeString("cb-sc-add-constraint&~A");

    private static final SubLSymbol CB_LINK_SC_ADD_CONSTRAINT = makeSymbol("CB-LINK-SC-ADD-CONSTRAINT");



    private static final SubLSymbol $PASTE_CONSTRAINT = makeKeyword("PASTE-CONSTRAINT");





    private static final SubLSymbol $ADD_CONSTRAINT = makeKeyword("ADD-CONSTRAINT");



    private static final SubLSymbol CB_HANDLE_SC_ADD_CONSTRAINT = makeSymbol("CB-HANDLE-SC-ADD-CONSTRAINT");

    static private final SubLList $list_alt297 = list(makeSymbol("LABEL"), makeSymbol("VALUE"));



    private static final SubLSymbol $UNPARSED_PHRASES = makeKeyword("UNPARSED-PHRASES");

    private static final SubLSymbol $UNPARSED_ARG_POSITIONS = makeKeyword("UNPARSED-ARG-POSITIONS");

    private static final SubLSymbol $CLONED_CONSTRAINTS = makeKeyword("CLONED-CONSTRAINTS");

    public static final SubLObject $$TheResultOfParsing = constant_handles.reader_make_constant_shell(makeString("TheResultOfParsing"));

    static private final SubLList $list_alt303 = list(constant_handles.reader_make_constant_shell(makeString("TheList")), ZERO_INTEGER, ONE_INTEGER);

    public static final SubLObject $$NPTemplate = constant_handles.reader_make_constant_shell(makeString("NPTemplate"));

    static private final SubLList $list_alt305 = list(constant_handles.reader_make_constant_shell(makeString("TheSetOf")), makeSymbol("?X"), list(QUOTE, list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), constant_handles.reader_make_constant_shell(makeString("Thing")))));

    static private final SubLString $str_alt306$Your_input__ = makeString("Your input, ");

    static private final SubLString $str_alt307$was_not_understood_ = makeString("was not understood.");

    static private final SubLString $str_alt308$_Try_Again_ = makeString("[Try Again]");

    static private final SubLString $str_alt309$_Don_t_Bother_ = makeString("[Don't Bother]");

    static private final SubLString $str_alt310$cb_sc_handle_adjust_sentence = makeString("cb-sc-handle-adjust-sentence");

    static private final SubLString $str_alt311$constraint_sentence = makeString("constraint-sentence");

    static private final SubLString $str_alt312$Replace_one_or_more_of_the_argume = makeString("Replace one or more of the arguments with the indexicals of the scenario.");

    static private final SubLString $$$Negate_and_Submit = makeString("Negate and Submit");

    static private final SubLString $str_alt314$negate_submit = makeString("negate-submit");

    static private final SubLString $str_alt315$Find___Paste = makeString("Find & Paste");

    public static final SubLSymbol $cb_sc_adjustment_find_and_paste_key$ = makeSymbol("*CB-SC-ADJUSTMENT-FIND-AND-PASTE-KEY*");

    static private final SubLString $$$Find_And_Paste = makeString("Find And Paste");





    static private final SubLString $$$argpos = makeString("argpos");

    private static final SubLSymbol $ADD_CONSTRAINT_SENTENCE = makeKeyword("ADD-CONSTRAINT-SENTENCE");

    private static final SubLSymbol CB_SC_HANDLE_ADJUST_SENTENCE = makeSymbol("CB-SC-HANDLE-ADJUST-SENTENCE");

    static private final SubLString $str_alt323$_Delete_Constraint_ = makeString("[Delete Constraint]");

    static private final SubLString $str_alt324$cb_sc_delete_constraint__A__A = makeString("cb-sc-delete-constraint&~A&~A");

    private static final SubLSymbol CB_LINK_SC_DELETE_CONSTRAINT = makeSymbol("CB-LINK-SC-DELETE-CONSTRAINT");

    static private final SubLList $list_alt326 = list(makeSymbol("STATE-ID-STRING"), makeSymbol("CR-ID-STRING"));

    private static final SubLSymbol CB_SC_DELETE_CONSTRAINT = makeSymbol("CB-SC-DELETE-CONSTRAINT");

    static private final SubLString $str_alt328$cb_sc_merge_scenario__A__A = makeString("cb-sc-merge-scenario&~A&~A");

    private static final SubLSymbol CB_LINK_SC_MERGE_SCENARIO = makeSymbol("CB-LINK-SC-MERGE-SCENARIO");

    static private final SubLList $list_alt330 = list(makeSymbol("STATE-ID-STRING"), makeSymbol("FROM-ID-STRING"));

    private static final SubLSymbol CB_SC_MERGE_SCENARIO = makeSymbol("CB-SC-MERGE-SCENARIO");

    static private final SubLString $str_alt332$_Align_To_Term_ = makeString("[Align To Term]");

    static private final SubLString $str_alt333$cb_sc_merge_register_align_to__A_ = makeString("cb-sc-merge-register-align-to&~A&~A");

    private static final SubLSymbol CB_LINK_SC_MERGE_REGISTER_ALIGN_TO = makeSymbol("CB-LINK-SC-MERGE-REGISTER-ALIGN-TO");

    static private final SubLList $list_alt335 = list(makeSymbol("STATE-ID-STRING"), makeSymbol("TO-ID-STRING"));

    private static final SubLSymbol CB_SC_MERGE_REGISTER_ALIGN_TO = makeSymbol("CB-SC-MERGE-REGISTER-ALIGN-TO");

    static private final SubLString $str_alt337$_Align_From_Term_ = makeString("[Align From Term]");

    static private final SubLString $str_alt338$cb_sc_merge_register_align_from__ = makeString("cb-sc-merge-register-align-from&~A&~A");

    private static final SubLSymbol CB_LINK_SC_MERGE_REGISTER_ALIGN_FROM = makeSymbol("CB-LINK-SC-MERGE-REGISTER-ALIGN-FROM");

    private static final SubLSymbol CB_SC_MERGE_REGISTER_ALIGN_FROM = makeSymbol("CB-SC-MERGE-REGISTER-ALIGN-FROM");

    static private final SubLString $str_alt341$_Merge_Now_ = makeString("[Merge Now]");

    static private final SubLString $str_alt342$cb_sc_do_merge__A = makeString("cb-sc-do-merge&~A");

    private static final SubLSymbol CB_LINK_SC_DO_MERGE = makeSymbol("CB-LINK-SC-DO-MERGE");

    private static final SubLSymbol CB_SC_DO_MERGE = makeSymbol("CB-SC-DO-MERGE");

    static private final SubLString $str_alt345$_Abandon_Merge_ = makeString("[Abandon Merge]");

    static private final SubLString $str_alt346$cb_sc_abandon_merge__A = makeString("cb-sc-abandon-merge&~A");

    private static final SubLSymbol CB_LINK_SC_ABANDON_MERGE = makeSymbol("CB-LINK-SC-ABANDON-MERGE");

    private static final SubLSymbol CB_SC_ABANDON_MERGE = makeSymbol("CB-SC-ABANDON-MERGE");





    private static final SubLSymbol CB_SC_DECLARE_DONE = makeSymbol("CB-SC-DECLARE-DONE");

    static private final SubLString $str_alt352$_Done_ = makeString("[Done]");

    static private final SubLString $str_alt353$cb_sc_declare_done__A = makeString("cb-sc-declare-done&~A");

    private static final SubLSymbol CB_LINK_SC_DECLARE_DONE = makeSymbol("CB-LINK-SC-DECLARE-DONE");

    // // Initializers
    public void declareFunctions() {
        declare_cb_scenario_constructor_file();
    }

    public void initializeVariables() {
        init_cb_scenario_constructor_file();
    }

    public void runTopLevelForms() {
        setup_cb_scenario_constructor_file();
    }
}

