/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
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
 *  module:      CB-UIA-TOOLS-REVIEW-AND-TESTING
 *  source file: /cyc/top/cycl/cb-uia-tools-review-and-testing.lisp
 *  created:     2019/07/03 17:38:10
 */
public final class cb_uia_tools_review_and_testing extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_uia_tools_review_and_testing() {
    }

    public static final SubLFile me = new cb_uia_tools_review_and_testing();

    public static final String myName = "com.cyc.cycjava.cycl.cb_uia_tools_review_and_testing";

    // // Definitions
    public static final SubLObject uiat_query_constructor_hint(SubLObject interaction) {
        {
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject v_question = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt3);
            v_question = current.first();
            current = current.rest();
            if (NIL == current) {
                return format(NIL, $str_alt4$QC____A, v_question);
            } else {
                cdestructuring_bind_error(datum, $list_alt3);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_query_constructor_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($SCENARIO_CONSTRUCTOR)) {
                {
                    SubLObject v_scenario = user_interaction_agenda.ui_result(child);
                    if (NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario)) {
                        user_interaction_agenda.ui_state_update(parent, $QC_SCENARIO, v_scenario);
                    } else {
                        user_interaction_agenda.ui_state_update(parent, $QC_SCENARIO, $NONE);
                    }
                }
            } else
                if (pcase_var.eql($SENTENCE_READER)) {
                    {
                        SubLObject query_cycl = user_interaction_agenda.ui_result(child).first();
                        if (NIL != el_utilities.possibly_sentence_p(query_cycl)) {
                            user_interaction_agenda.ui_state_update(parent, $QC_DIRECT_PARSE, query_cycl);
                        } else {
                            user_interaction_agenda.ui_state_update(parent, $QC_DIRECT_PARSE, $NONE);
                        }
                    }
                }

        }
        return parent;
    }

    public static final SubLObject uiat_query_constructor_child_rejected(SubLObject parent, SubLObject child) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($SCENARIO_CONSTRUCTOR)) {
                {
                    SubLObject qc_scenario = user_interaction_agenda.ui_state_lookup(parent, $QC_SCENARIO, UNPROVIDED);
                    if (NIL == rkf_scenario_manipulator.sm_scenario_p(qc_scenario)) {
                        user_interaction_agenda.uia_act_reject(v_agenda, parent);
                    }
                }
            } else
                if (pcase_var.eql($SENTENCE_READER)) {
                    user_interaction_agenda.uia_act_reject(v_agenda, parent);
                }

        }
        return parent;
    }

    public static final SubLObject uiat_query_constructor_child_invalidated(SubLObject parent, SubLObject child) {
        return uiat_query_constructor_child_rejected(parent, child);
    }

    public static final SubLObject cb_uiat_query_constructor_display(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject qc_state = user_interaction_agenda.ui_state_lookup(interaction, $QC_STATE, UNPROVIDED);
            SubLObject query = rkf_query_constructor.qc_state_query(qc_state);
            SubLObject advanced = user_interaction_agenda.ui_state_lookup(interaction, $QC_ADVANCED, $UNDETERMINED);
            SubLObject v_scenario = user_interaction_agenda.ui_state_lookup(interaction, $QC_SCENARIO, $UNDETERMINED);
            SubLObject scenario_parse = user_interaction_agenda.ui_state_lookup(interaction, $QC_SCENARIO_PARSE, $UNDETERMINED);
            SubLObject direct_parse = user_interaction_agenda.ui_state_lookup(interaction, $QC_DIRECT_PARSE, $UNDETERMINED);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject question_text = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt14);
            question_text = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario)) {
                    user_interaction_agenda.ui_state_clear(interaction, $QC_SCENARIO);
                    {
                        SubLObject query_1 = rkf_query_constructor.qc_act_initialize_query_from_scenario(qc_state, v_scenario);
                        rkf_query_constructor.qc_act_register_query(qc_state, query_1);
                    }
                    return cb_query_constructor.cb_qc_show_state_guts(qc_state);
                } else
                    if ((NIL != rkf_query_constructor.qc_query_p(query)) && advanced.eql($TRUE)) {
                        return cb_query_constructor.cb_qc_show_state_guts(qc_state);
                    } else
                        if (NIL != rkf_query_constructor.qc_query_p(query)) {
                            user_interaction_agenda.uia_act_complete(v_agenda, interaction, query);
                            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                        } else
                            if ((question_text.isString() && (scenario_parse == $UNDETERMINED)) && (direct_parse == $UNDETERMINED)) {
                                {
                                    SubLObject scenario_expression = rkf_query_constructor.qc_act_candidate_scenario_expressions(qc_state, question_text).first();
                                    if (NIL != rkf_scenario_manipulator.sm_scenario_expression_p(scenario_expression)) {
                                        user_interaction_agenda.ui_state_update(interaction, $QC_SCENARIO_PARSE, scenario_expression);
                                    } else {
                                        user_interaction_agenda.ui_state_update(interaction, $QC_SCENARIO_PARSE, $NONE);
                                    }
                                    return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                                }
                            } else
                                if (((scenario_parse == $NONE) && (NIL == el_utilities.possibly_sentence_p(direct_parse))) && (v_scenario == $UNDETERMINED)) {
                                    {
                                        SubLObject scenario_constructor_action = uia_tools_wizards.uia_act_new_scenario_constructor(v_agenda, question_text, $REQUIRED, UNPROVIDED);
                                        user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, scenario_constructor_action);
                                        return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                                    }
                                } else
                                    if (NIL != rkf_scenario_manipulator.sm_scenario_expression_p(scenario_parse)) {
                                        {
                                            SubLObject v_scenario_2 = rkf_query_constructor.qc_act_initialize_scenario_from_expression(qc_state, scenario_parse);
                                            SubLObject new_query = rkf_query_constructor.qc_act_initialize_query_from_scenario(qc_state, v_scenario_2);
                                            rkf_query_constructor.qc_act_register_query(qc_state, new_query);
                                        }
                                        return cb_query_constructor.cb_qc_show_state_guts(qc_state);
                                    } else
                                        if (NIL != el_utilities.possibly_sentence_p(direct_parse)) {
                                            {
                                                SubLObject new_query = rkf_query_constructor.qc_act_initialize_query_from_cycl(qc_state, direct_parse);
                                                rkf_query_constructor.qc_act_register_query(qc_state, new_query);
                                            }
                                            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                                        }






            } else {
                cdestructuring_bind_error(datum, $list_alt14);
            }
        }
        return NIL;
    }

    public static final SubLObject uia_act_new_query_constructor(SubLObject v_agenda, SubLObject text, SubLObject cycl, SubLObject query, SubLObject advancedP, SubLObject mode) {
        if (text == UNPROVIDED) {
            text = NIL;
        }
        if (cycl == UNPROVIDED) {
            cycl = NIL;
        }
        if (query == UNPROVIDED) {
            query = NIL;
        }
        if (advancedP == UNPROVIDED) {
            advancedP = NIL;
        }
        if (mode == UNPROVIDED) {
            mode = $REQUIRED;
        }
        {
            SubLObject args = (text.isString()) ? ((SubLObject) (list(text))) : NIL;
            SubLObject plist = NIL;
            if (NIL != rkf_query_constructor.qc_query_p(query)) {
                plist = putf(plist, $SF_QUERY, query);
            }
            if (NIL != el_utilities.possibly_sentence_p(cycl)) {
                plist = putf(plist, $QC_DIRECT_PARSE, cycl);
            }
            if (NIL != advancedP) {
                plist = putf(plist, $QC_ADVANCED, $TRUE);
            }
            {
                SubLObject interaction = user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $QUERY_CONSTRUCTOR, args, plist);
                SubLObject qc_state = (NIL != text) ? ((SubLObject) (rkf_query_constructor.qc_act_new_state_with_text(text))) : rkf_query_constructor.qc_act_new_state();
                if (NIL != rkf_query_constructor.qc_query_p(query)) {
                    rkf_query_constructor.qc_act_note_state_query(qc_state, query);
                }
                rkf_query_constructor.qc_act_note_state_interaction(qc_state, interaction);
                user_interaction_agenda.ui_state_update(interaction, $QC_STATE, qc_state);
                return interaction;
            }
        }
    }

    public static final SubLObject cb_uiat_common_queries_render_request(SubLObject request) {
        {
            SubLObject datum = request;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject signature = NIL;
            SubLObject plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt20);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt20);
            action_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt20);
            signature = current.first();
            current = current.rest();
            plist = current;
            {
                SubLObject interaction = user_interaction_agenda.find_ui_by_signature(signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($SHOW_ALL)) {
                    {
                        SubLObject datum_3 = plist;
                        SubLObject current_4 = datum_3;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_4;
                        SubLObject bad = NIL;
                        SubLObject current_5 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_3, $list_alt22);
                            current_5 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_3, $list_alt22);
                            if (NIL == member(current_5, $list_alt23, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_5 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_3, $list_alt22);
                        }
                        {
                            SubLObject queries_tail = property_list_member($QUERIES, current_4);
                            SubLObject queries = (NIL != queries_tail) ? ((SubLObject) (cadr(queries_tail))) : NIL;
                            return cb_uiat_common_queries_show_all(interaction, queries);
                        }
                    }
                } else
                    if (pcase_var.eql($FOCUS_REQUESTED)) {
                        {
                            SubLObject datum_6 = plist;
                            SubLObject current_7 = datum_6;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current_7;
                            SubLObject bad = NIL;
                            SubLObject current_8 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum_6, $list_alt27);
                                current_8 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum_6, $list_alt27);
                                if (NIL == member(current_8, $list_alt28, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_8 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum_6, $list_alt27);
                            }
                            {
                                SubLObject term_tail = property_list_member($TERM, current_7);
                                SubLObject v_term = (NIL != term_tail) ? ((SubLObject) (cadr(term_tail))) : NIL;
                                SubLObject queries_tail = property_list_member($QUERIES, current_7);
                                SubLObject queries = (NIL != queries_tail) ? ((SubLObject) (cadr(queries_tail))) : NIL;
                                SubLObject args_tail = property_list_member($ARGS, current_7);
                                SubLObject args = (NIL != args_tail) ? ((SubLObject) (cadr(args_tail))) : NIL;
                                user_interaction_agenda.ui_state_update(interaction, $ARGS, args);
                            }
                        }
                        return cb_uiat_common_queries_focus_requested(interaction);
                    } else
                        if (pcase_var.eql($FOCUS_RESULTS)) {
                            {
                                SubLObject datum_9 = plist;
                                SubLObject current_10 = datum_9;
                                SubLObject allow_other_keys_p = NIL;
                                SubLObject rest = current_10;
                                SubLObject bad = NIL;
                                SubLObject current_11 = NIL;
                                for (; NIL != rest;) {
                                    destructuring_bind_must_consp(rest, datum_9, $list_alt32);
                                    current_11 = rest.first();
                                    rest = rest.rest();
                                    destructuring_bind_must_consp(rest, datum_9, $list_alt32);
                                    if (NIL == member(current_11, $list_alt33, UNPROVIDED, UNPROVIDED)) {
                                        bad = T;
                                    }
                                    if (current_11 == $ALLOW_OTHER_KEYS) {
                                        allow_other_keys_p = rest.first();
                                    }
                                    rest = rest.rest();
                                }
                                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                    cdestructuring_bind_error(datum_9, $list_alt32);
                                }
                                {
                                    SubLObject term_tail = property_list_member($TERM, current_10);
                                    SubLObject v_term = (NIL != term_tail) ? ((SubLObject) (cadr(term_tail))) : NIL;
                                    SubLObject query_formulas_tail = property_list_member($QUERY_FORMULAS, current_10);
                                    SubLObject query_formulas = (NIL != query_formulas_tail) ? ((SubLObject) (cadr(query_formulas_tail))) : NIL;
                                    SubLObject query_specs_tail = property_list_member($QUERY_SPECS, current_10);
                                    SubLObject query_specs = (NIL != query_specs_tail) ? ((SubLObject) (cadr(query_specs_tail))) : NIL;
                                    return cb_uiat_common_queries_focus_results(interaction, v_term, query_formulas, query_specs);
                                }
                            }
                        }


            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_common_queries_show_all(SubLObject interaction, SubLObject queries) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
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
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ($$$All_Example_Queries);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_indent(FOUR_INTEGER);
            cb_utilities.cb_link($UIA_COMPLETE_INTERACTION, interaction, $str_alt38$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_utilities.html_indent(TWO_INTEGER);
            cb_utilities.cb_link($UIAT_COMMON_QUERIES_FOCUS, interaction, $str_alt40$_Ask_About_Particular_Term_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_utilities.html_indent(UNPROVIDED);
            cb_uiat_show_queries(queries, interaction);
            cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_show_queries(SubLObject queries, SubLObject interaction) {
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
                    {
                        SubLObject cdolist_list_var = queries;
                        SubLObject query = NIL;
                        for (query = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query = cdolist_list_var.first()) {
                            cb_uiat_show_one_query(query, interaction);
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

    public static final SubLObject cb_uiat_show_one_query(SubLObject query, SubLObject interaction) {
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
                        SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_newline(UNPROVIDED);
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
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_uia_display_primitives.cb_uia_show_query_with_clarifying_link(query, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
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
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align($LEFT));
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_utilities.cb_link($UIAT_COMMON_QUERIES_ASK, query, interaction, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_utilities.html_indent(TWO_INTEGER);
                            cb_utilities.cb_link($UIA_SIMILAR_QUESTION, query, $str_alt44$_Ask_Similar_Question_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
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
                        html_utilities.html_markup(TWO_INTEGER);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_uia_display_primitives.cb_uia_show_arg_type_warning_for_sentence(query, user_interaction_agenda.ui_agenda(interaction));
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_show_query_specs(SubLObject query_specs, SubLObject interaction) {
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
                    {
                        SubLObject cdolist_list_var = query_specs;
                        SubLObject query_spec = NIL;
                        for (query_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query_spec = cdolist_list_var.first()) {
                            cb_uiat_show_one_query_spec(query_spec, interaction);
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

    public static final SubLObject cb_uiat_show_one_query_spec(SubLObject query_spec, SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject query_formula = new_cycl_query_specification.new_cycl_query_specification_formula(query_spec);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_newline(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
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
                            html_utilities.html_markup(TWO_INTEGER);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_uia_display_primitives.cb_uia_show_query_with_clarifying_link(query_formula, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
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
                                cb_utilities.cb_link($UIAT_COMMON_QUERIES_ASK, query_formula, interaction, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_utilities.html_indent(TWO_INTEGER);
                                cb_utilities.cb_link($UIA_SIMILAR_QUESTION, query_formula, $str_alt44$_Ask_Similar_Question_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_uia_display_primitives.cb_uia_show_arg_type_warning_for_sentence(query_formula, user_interaction_agenda.ui_agenda(interaction));
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
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

    public static final SubLObject cb_uiat_handle_common_queries_focus(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt45);
            interaction = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $FOCUS_REQUESTED, NIL);
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt45);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_uiat_common_queries_focus(SubLObject interaction, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt48$cb_uiat_handle_common_queries_foc, arglist);
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

    public static final SubLObject cb_uia_common_queries_ask(SubLObject args) {
        {
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject query = NIL;
            SubLObject interaction = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt50);
            query = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt50);
            interaction = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                    SubLObject query_type = (NIL != new_cycl_query_specification.new_cycl_query_specification_p(query)) ? ((SubLObject) ($QUERY_SPEC)) : $QUERY;
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $ASK, list($QUERY, query, $QUERY_TYPE, query_type));
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt50);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_uiat_common_queries_ask(SubLObject query, SubLObject interaction, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt56$_Ask_This_Question_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(query, interaction);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt57$cb_uia_common_queries_ask, arglist);
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

    public static final SubLObject cb_uiat_common_queries_focus_requested(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != user_interaction_agenda.ui_state_lookup(interaction, $ARGS, UNPROVIDED)) {
                {
                    SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                    SubLObject args = user_interaction_agenda.ui_state_lookup(interaction, $ARGS, UNPROVIDED);
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, user_interaction_agenda.make_ui_reply_with_interaction(interaction, $FOCUS_SPECIFIED, list($PHRASE, args.first())));
                }
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
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$within_html_form$.bind(T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_utilities.html_hidden_input($str_alt61$cb_uiat_handle_common_queries_foc, T, UNPROVIDED);
                        html_utilities.html_hidden_input($$$id, user_interaction_agenda.ui_id(interaction), UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ($$$Ask_about_a_particular_term);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_utilities.html_indent(FOUR_INTEGER);
                        cb_utilities.cb_link($UIAT_COMMON_QUERIES_SHOW_ALL, interaction, $str_alt65$_Show_All_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_indent(UNPROVIDED);
                        html_utilities.html_newline(TWO_INTEGER);
                        html_utilities.html_princ($str_alt66$Show_example_queries_that_could_b);
                        html_utilities.html_newline(UNPROVIDED);
                        html_utilities.html_text_input($$$phrase, NIL, $int$30);
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

    public static final SubLObject cb_uiat_handle_common_queries_focus_requested(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject id_string = html_utilities.html_extract_input($$$id, args);
            SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, id_string);
            SubLObject phrase = html_utilities.html_extract_input($$$phrase, args);
            SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $FOCUS_SPECIFIED, list($PHRASE, phrase));
            return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
        }
    }

    public static final SubLObject cb_uiat_handle_common_queries_show_all(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt45);
            interaction = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $FOCUS_CLEARED, NIL);
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt45);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_uiat_common_queries_show_all(SubLObject interaction, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt73$cb_uiat_handle_common_queries_sho, arglist);
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

    public static final SubLObject cb_uiat_common_queries_focus_results(SubLObject interaction, SubLObject v_term, SubLObject query_formulas, SubLObject query_specs) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
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
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ($$$Query_Focus_Results);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_indent(FOUR_INTEGER);
                cb_utilities.cb_link($UIA_COMPLETE_INTERACTION, interaction, $str_alt38$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_utilities.html_indent(TWO_INTEGER);
                cb_utilities.cb_link($UIAT_COMMON_QUERIES_SHOW_ALL, interaction, $str_alt76$_Show_Unfocused_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_utilities.html_indent(TWO_INTEGER);
                cb_utilities.cb_link($UIAT_COMMON_QUERIES_FOCUS, interaction, $str_alt77$_Ask_about_a_different_term_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_utilities.html_indent(TWO_INTEGER);
                if ((NIL != query_formulas) || (NIL != query_specs)) {
                    html_utilities.html_newline(UNPROVIDED);
                    html_utilities.html_newline(UNPROVIDED);
                    html_utilities.html_princ($str_alt78$Here_are_some_example_queries_rel);
                    html_utilities.html_newline(UNPROVIDED);
                    html_utilities.html_indent(FOUR_INTEGER);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    cb_uia_display_primitives.cb_uia_show_term(v_term, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                } else {
                    html_utilities.html_newline(TWO_INTEGER);
                    html_utilities.html_princ($str_alt79$No_queries_were_retrieved_);
                }
                if (NIL != query_specs) {
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
                                        SubLObject _prev_bind_0_20 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                        try {
                                            pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                            {
                                                SubLObject new_or_reused = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject _prev_bind_0_21 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                    try {
                                                        pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                        {
                                                            SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                            {
                                                                SubLObject _prev_bind_0_22 = memoization_state.$memoization_state$.currentBinding(thread);
                                                                try {
                                                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                                                    {
                                                                        SubLObject original_memoization_process = NIL;
                                                                        if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                                                            original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                                                            {
                                                                                SubLObject current_proc = current_process();
                                                                                if (NIL == original_memoization_process) {
                                                                                    memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                                                                } else {
                                                                                    if (original_memoization_process != current_proc) {
                                                                                        Errors.error($str_alt80$Invalid_attempt_to_reuse_memoizat);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        try {
                                                                            cb_uiat_show_query_specs(query_specs, interaction);
                                                                        } finally {
                                                                            {
                                                                                SubLObject _prev_bind_0_23 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                try {
                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                    if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                                        memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                                    }
                                                                                } finally {
                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_23, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } finally {
                                                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_22, thread);
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_21, thread);
                                                    }
                                                }
                                                if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                    memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                }
                                            }
                                        } finally {
                                            pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_20, thread);
                                        }
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            if (NIL == reuseP) {
                                                pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                            }
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_24, thread);
                                        }
                                    }
                                }
                            }
                        } finally {
                            pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                if (NIL != query_formulas) {
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
                                        SubLObject _prev_bind_0_25 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                        try {
                                            pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                            {
                                                SubLObject new_or_reused = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject _prev_bind_0_26 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                    try {
                                                        pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                        {
                                                            SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                            {
                                                                SubLObject _prev_bind_0_27 = memoization_state.$memoization_state$.currentBinding(thread);
                                                                try {
                                                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                                                    {
                                                                        SubLObject original_memoization_process = NIL;
                                                                        if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                                                            original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                                                            {
                                                                                SubLObject current_proc = current_process();
                                                                                if (NIL == original_memoization_process) {
                                                                                    memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                                                                } else {
                                                                                    if (original_memoization_process != current_proc) {
                                                                                        Errors.error($str_alt80$Invalid_attempt_to_reuse_memoizat);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        try {
                                                                            cb_uiat_show_queries(query_formulas, interaction);
                                                                        } finally {
                                                                            {
                                                                                SubLObject _prev_bind_0_28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                try {
                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                    if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                                        memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                                    }
                                                                                } finally {
                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_28, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } finally {
                                                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_27, thread);
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_26, thread);
                                                    }
                                                }
                                                if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                    memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                }
                                            }
                                        } finally {
                                            pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_25, thread);
                                        }
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_29 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            if (NIL == reuseP) {
                                                pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                            }
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_29, thread);
                                        }
                                    }
                                }
                            }
                        } finally {
                            pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_uiat_common_queries_focus_term(SubLObject v_term, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = $str_alt82$_Relevant_Queries_for_This_Term_;
        }
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
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt83$cb_uia_common_queries_focus_term, arglist);
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

    public static final SubLObject cb_uia_common_queries_focus_term(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject v_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt86);
            v_term = current.first();
            current = current.rest();
            if (NIL == current) {
                uia_tools_review_and_testing.uia_act_new_common_queries(v_agenda, $REQUIRED, v_term);
                return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
            } else {
                cdestructuring_bind_error(datum, $list_alt86);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_common_queries_launch(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            uia_tools_review_and_testing.uia_act_new_common_queries(v_agenda, $REQUIRED, UNPROVIDED);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_link_uia_common_queries_launch(SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_url_princ($str_alt89$cb_uiat_common_queries_launch);
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

    public static final SubLObject uiat_solution_finder_hint(SubLObject interaction) {
        {
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject v_question = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt3);
            v_question = current.first();
            current = current.rest();
            if (NIL == current) {
                return format(NIL, $str_alt95$Answer____A, v_question);
            } else {
                cdestructuring_bind_error(datum, $list_alt3);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_solution_finder_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($QUERY_CONSTRUCTOR)) {
                {
                    SubLObject qc_query = user_interaction_agenda.ui_result(child);
                    user_interaction_agenda.ui_state_update(parent, $QC_QUERY, qc_query);
                    user_interaction_agenda.ui_state_update(parent, $SF_ACT, $PERFORM_ASK);
                }
            } else
                if (pcase_var.eql($SENTENCE_READER)) {
                    {
                        SubLObject query_cycl = user_interaction_agenda.ui_result(child).first();
                        if (NIL != el_utilities.possibly_sentence_p(query_cycl)) {
                            user_interaction_agenda.ui_state_update(parent, $SF_CYCL, query_cycl);
                        } else {
                            user_interaction_agenda.ui_state_update(parent, $SF_CYCL, $NONE);
                        }
                    }
                }

        }
        return parent;
    }

    public static final SubLObject uiat_solution_finder_child_rejected(SubLObject parent, SubLObject child) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($QUERY_CONSTRUCTOR)) {
                {
                    SubLObject sf_cycl = user_interaction_agenda.ui_state_lookup(parent, $SF_CYCL, $UNDETERMINED);
                    if (sf_cycl.eql($UNDETERMINED) || sf_cycl.eql($NONE)) {
                        user_interaction_agenda.uia_act_reject(v_agenda, parent);
                    }
                }
            } else
                if (pcase_var.eql($SENTENCE_READER)) {
                    user_interaction_agenda.uia_act_reject(v_agenda, parent);
                }

        }
        return parent;
    }

    public static final SubLObject cb_uiat_solution_finder_display(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject question_text = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt14);
            question_text = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject qc_query = user_interaction_agenda.ui_state_lookup(interaction, $QC_QUERY, $UNDETERMINED);
                    SubLObject sf_state = user_interaction_agenda.ui_state_lookup(interaction, $SF_STATE, $UNDETERMINED);
                    SubLObject sf_act = user_interaction_agenda.ui_state_lookup(interaction, $SF_ACT, $UNDETERMINED);
                    SubLObject sf_cycl = user_interaction_agenda.ui_state_lookup(interaction, $SF_CYCL, $UNDETERMINED);
                    if (((($UNDETERMINED == qc_query) && ($UNDETERMINED == sf_cycl)) && ($UNDETERMINED == sf_act)) && (NIL != rkf_solution_finder.sf_state_p(sf_state))) {
                        {
                            SubLObject question_reader_action = cb_uiat_smart.uia_act_new_question_reader(v_agenda, $REQUIRED, question_text);
                            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, question_reader_action);
                            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                        }
                    }
                    if (((sf_cycl != $UNDETERMINED) && ($UNDETERMINED == qc_query)) && (NIL != rkf_solution_finder.sf_state_p(sf_state))) {
                        user_interaction_agenda.ui_state_clear(interaction, $SF_ACT);
                        {
                            SubLObject query_constructor_action = (NIL != el_utilities.possibly_sentence_p(sf_cycl)) ? ((SubLObject) (uia_act_new_query_constructor(v_agenda, question_text, sf_cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : uia_act_new_query_constructor(v_agenda, question_text, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, query_constructor_action);
                            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                        }
                    }
                    if (((NIL != rkf_query_constructor.qc_query_p(qc_query)) && (NIL != rkf_solution_finder.sf_state_p(sf_state))) && (sf_act == $PERFORM_ASK)) {
                        user_interaction_agenda.ui_state_clear(interaction, $SF_ACT);
                        rkf_solution_finder.sf_act_initialize_state_from_query(sf_state, qc_query);
                        user_interaction_agenda.ui_state_update(interaction, $SF_CYCL, rkf_query_constructor.qc_query_cycl(qc_query));
                        cb_solution_finder.cb_sf_show_state_guts(sf_state);
                        return NIL;
                    }
                    if ((NIL != rkf_query_constructor.qc_query_p(qc_query)) && (sf_act == $EDIT_QUERY)) {
                        user_interaction_agenda.ui_state_clear(interaction, $SF_ACT);
                        {
                            SubLObject query_constructor_action = uia_act_new_query_constructor(v_agenda, question_text, NIL, qc_query, T, UNPROVIDED);
                            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, query_constructor_action);
                            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                        }
                    }
                    cb_solution_finder.cb_sf_show_state_guts(sf_state);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt14);
            }
        }
        return NIL;
    }

    public static final SubLObject uia_act_new_solution_finder(SubLObject v_agenda, SubLObject text, SubLObject cycl, SubLObject mode, SubLObject params) {
        if (text == UNPROVIDED) {
            text = NIL;
        }
        if (cycl == UNPROVIDED) {
            cycl = NIL;
        }
        if (mode == UNPROVIDED) {
            mode = $REQUIRED;
        }
        if (params == UNPROVIDED) {
            params = NIL;
        }
        {
            SubLObject args = (text.isString()) ? ((SubLObject) (list(text))) : NIL;
            SubLObject plist = (NIL != el_utilities.possibly_sentence_p(cycl)) ? ((SubLObject) (list($SF_CYCL, cycl))) : NIL;
            SubLObject interaction = user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $SOLUTION_FINDER, args, plist);
            SubLObject sf_state = uiat_sf_build_new_solution_finder(v_agenda, text);
            rkf_solution_finder.sf_act_note_state_interaction(sf_state, interaction);
            user_interaction_agenda.ui_state_update(interaction, $SF_STATE, sf_state);
            {
                SubLObject remembered_params = user_interaction_agenda.uia_state_lookup(v_agenda, $SF_RESOURCES, UNPROVIDED);
                if (NIL == params) {
                    params = remembered_params;
                }
                if (NIL != params) {
                    {
                        SubLObject datum = params;
                        SubLObject current = datum;
                        SubLObject backchain = NIL;
                        SubLObject number = NIL;
                        SubLObject time = NIL;
                        SubLObject depth = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt103);
                        backchain = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt103);
                        number = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt103);
                        time = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt103);
                        depth = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            rkf_solution_finder.sf_declare_state_backchain(sf_state, backchain);
                            rkf_solution_finder.sf_declare_state_number(sf_state, number);
                            rkf_solution_finder.sf_declare_state_time(sf_state, time);
                            rkf_solution_finder.sf_declare_state_depth(sf_state, depth);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt103);
                        }
                    }
                }
            }
            return interaction;
        }
    }

    public static final SubLObject uia_act_new_solution_finder_from_query_spec(SubLObject v_agenda, SubLObject query_spec, SubLObject text, SubLObject mode) {
        if (text == UNPROVIDED) {
            text = NIL;
        }
        if (mode == UNPROVIDED) {
            mode = $REQUIRED;
        }
        {
            SubLObject args = (text.isString()) ? ((SubLObject) (list(text))) : NIL;
            SubLObject cycl = new_cycl_query_specification.new_cycl_query_specification_formula(query_spec);
            SubLObject params = new_cycl_query_specification.new_cycl_query_specification_properties(query_spec);
            SubLObject plist = list($SF_CYCL, cycl);
            SubLObject interaction = user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $SOLUTION_FINDER, args, plist);
            SubLObject sf_state = uiat_sf_build_new_solution_finder(v_agenda, text);
            rkf_solution_finder.sf_act_note_state_interaction(sf_state, interaction);
            user_interaction_agenda.ui_state_update(interaction, $SF_STATE, sf_state);
            if (NIL != params) {
                rkf_solution_finder.sf_update_state_inference_params(sf_state, params);
            }
            return interaction;
        }
    }







    public static final SubLObject uiat_sf_build_new_solution_finder(SubLObject v_agenda, SubLObject text) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sf_state = NIL;
                {
                    SubLObject _prev_bind_0 = rkf_solution_finder.$sf_typical_backchain_default$.currentBinding(thread);
                    SubLObject _prev_bind_1 = rkf_solution_finder.$sf_typical_number_default$.currentBinding(thread);
                    SubLObject _prev_bind_2 = rkf_solution_finder.$sf_typical_time_default$.currentBinding(thread);
                    try {
                        rkf_solution_finder.$sf_typical_backchain_default$.bind(NIL != user_interaction_agenda.uia_state_lookup(v_agenda, $DEFAULT_SF_BACKCHAIN, $uiat_sf_default_backchain$.getDynamicValue(thread)) ? ((SubLObject) (user_interaction_agenda.uia_state_lookup(v_agenda, $DEFAULT_SF_BACKCHAIN, $uiat_sf_default_backchain$.getDynamicValue(thread)))) : rkf_solution_finder.$sf_typical_backchain_default$.getDynamicValue(thread), thread);
                        rkf_solution_finder.$sf_typical_number_default$.bind(NIL != user_interaction_agenda.uia_state_lookup(v_agenda, $DEFAULT_SF_NUMBER, $uiat_sf_default_number$.getDynamicValue(thread)) ? ((SubLObject) (user_interaction_agenda.uia_state_lookup(v_agenda, $DEFAULT_SF_NUMBER, $uiat_sf_default_number$.getDynamicValue(thread)))) : rkf_solution_finder.$sf_typical_number_default$.getDynamicValue(thread), thread);
                        rkf_solution_finder.$sf_typical_time_default$.bind(NIL != user_interaction_agenda.uia_state_lookup(v_agenda, $DEFAULT_SF_TIME, $uiat_sf_default_time$.getDynamicValue(thread)) ? ((SubLObject) (user_interaction_agenda.uia_state_lookup(v_agenda, $DEFAULT_SF_TIME, $uiat_sf_default_time$.getDynamicValue(thread)))) : rkf_solution_finder.$sf_typical_time_default$.getDynamicValue(thread), thread);
                        sf_state = (NIL != text) ? ((SubLObject) (rkf_solution_finder.sf_act_new_state_with_text(text))) : rkf_solution_finder.sf_act_new_state();
                    } finally {
                        rkf_solution_finder.$sf_typical_time_default$.rebind(_prev_bind_2, thread);
                        rkf_solution_finder.$sf_typical_number_default$.rebind(_prev_bind_1, thread);
                        rkf_solution_finder.$sf_typical_backchain_default$.rebind(_prev_bind_0, thread);
                    }
                }
                return sf_state;
            }
        }
    }

    public static final SubLObject cb_link_uiat_solution_finder_cycl(SubLObject cycl_query, SubLObject text, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(cycl_query, text);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt110$cb_uiat_solution_finder_cycl, arglist);
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

    public static final SubLObject cb_uiat_solution_finder_cycl(SubLObject args) {
        {
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject cycl_query = NIL;
            SubLObject text = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt113);
            cycl_query = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt113);
            text = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                    uia_act_new_solution_finder(v_agenda, text, cycl_query, UNPROVIDED, UNPROVIDED);
                    return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt113);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_ask_quirk_render_request(SubLObject request) {
        {
            SubLObject datum = request;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject signature = NIL;
            SubLObject plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt20);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt20);
            action_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt20);
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
                            destructuring_bind_must_consp(rest, datum_30, $list_alt118);
                            current_32 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_30, $list_alt118);
                            if (NIL == member(current_32, $list_alt119, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_32 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_30, $list_alt118);
                        }
                        {
                            SubLObject answers_tail = property_list_member($ANSWERS, current_31);
                            SubLObject answers = (NIL != answers_tail) ? ((SubLObject) (cadr(answers_tail))) : NIL;
                            return cb_uiat_ask_quirk_display_answers(interaction, answers);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_ask_quirk_display_answers(SubLObject interaction, SubLObject answers) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cb_user_interaction_agenda.cb_uia_show_title_line($ASK_QUIRK);
            if (NIL != system_info.cycorp_execution_context_p()) {
                if (NIL == answers) {
                    html_utilities.html_princ($str_alt121$The_corpus_contained_no_answers_t);
                } else {
                    html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            {
                                SubLObject cdolist_list_var = answers;
                                SubLObject v_answer = NIL;
                                for (v_answer = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_answer = cdolist_list_var.first()) {
                                    {
                                        SubLObject answer_string = methods.funcall_instance_method_with_0_args(v_answer, GET_CONTENT);
                                        SubLObject score_string = format(NIL, $str_alt123$__score___2F_, methods.funcall_instance_method_with_0_args(v_answer, GET_CONFIDENCE));
                                        SubLObject text = methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(v_answer, JUSTIFY), GET_CONTENT);
                                        SubLObject source = methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(v_answer, JUSTIFY), GET_SOURCE);
                                        html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
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
                                                        SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_princ(CHAR_quotation);
                                                            html_utilities.html_princ(answer_string);
                                                            html_utilities.html_princ(CHAR_quotation);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                }
                                                html_utilities.html_princ(score_string);
                                                html_utilities.html_indent(TWO_INTEGER);
                                                cb_utilities.cb_link($UIAT_ASK_QUIRK_LEARN_FACTOID, interaction, v_answer, $str_alt129$_Learn_this_, UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(MINUS_ONE_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                                                        html_utilities.html_princ(CHAR_quotation);
                                                        html_utilities.html_princ(text);
                                                        html_utilities.html_princ(CHAR_quotation);
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
                                                                SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_princ(source);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_35, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                    }
                                }
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                }
            }
            html_utilities.html_newline(UNPROVIDED);
            cb_utilities.cb_link($UIA_COMPLETE_INTERACTION, interaction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
    }

    public static final SubLObject cb_link_uiat_ask_quirk_learn_factoid(SubLObject interaction, SubLObject answer_object, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!linktext.isString()) {
                linktext = $str_alt131$_Learn_this_Fact_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction, answer_object);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt132$cb_uiat_ask_quirk_learn_factoid, arglist);
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

    public static final SubLObject cb_uiat_ask_quirk_learn_factoid(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            SubLObject answer_object = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt134);
            interaction = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt134);
            answer_object = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject nl_sentence = methods.funcall_instance_method_with_0_args(answer_object, NATURAL_LANGUAGE_FACTOID);
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $LEARN_FACTOID, list($ANSWER_OBJECT, answer_object, $NL_SENTENCE, nl_sentence));
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt134);
            }
        }
        return NIL;
    }

    /**
     * Handler function for UIA [Journal] link
     */
    public static final SubLObject cb_uia_knowledge_journal(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return show_uia_knowledge_journal(UNPROVIDED, UNPROVIDED);
    }

    /**
     * Displays the UIA actions that have been completed.
     * Optionally, MAX-ENTRIES are displayed and by latest if REVERSE? specified
     */
    public static final SubLObject show_uia_knowledge_journal(SubLObject max_entries, SubLObject reverseP) {
        if (max_entries == UNPROVIDED) {
            max_entries = NIL;
        }
        if (reverseP == UNPROVIDED) {
            reverseP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            {
                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                            }
                            if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                html_script_utilities.cb_hoverover_page_init();
                            }
                            cb_user_interaction_agenda.cb_uia_show_title_line($KNOWLEDGE_JOURNAL);
                            {
                                SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                                SubLObject actions = user_interaction_agenda.uia_history_sequence(v_agenda);
                                SubLObject num_completed = length(actions);
                                SubLObject pruneP = makeBoolean((NIL != max_entries) && num_completed.numG(max_entries));
                                if (NIL != reverseP) {
                                    actions = nreverse(actions);
                                }
                                if (NIL != pruneP) {
                                    actions = list_utilities.first_n(max_entries, actions);
                                }
                                html_utilities.html_newline(UNPROVIDED);
                                if (NIL == actions) {
                                    html_utilities.html_princ($str_alt143$Nothing_has_been_done_yet_);
                                } else {
                                    html_utilities.html_princ($str_alt144$Actions_finished___);
                                    html_utilities.html_princ(num_completed);
                                }
                                html_utilities.html_indent(TWO_INTEGER);
                                cb_utilities.cb_link($UIA_KNOWLEDGE_JOURNAL, $str_alt146$_Refresh_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_utilities.html_indent(TWO_INTEGER);
                                cb_utilities.cb_link($UIA_SERIALIZE_KNOWLEDGE_JOURNAL, $str_alt148$_Save_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                if (NIL != actions) {
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
                                        SubLObject _prev_bind_0_38 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_39 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            html_utilities.html_princ($$$Action);
                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_40, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
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
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            html_utilities.html_princ($$$Result);
                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_42, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
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
                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            html_utilities.html_princ($$$Start_time);
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
                                                            html_utilities.html_indent(TWO_INTEGER);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_46 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            html_utilities.html_princ($$$Finish_time);
                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
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
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(SEVEN_INTEGER);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
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
                                            {
                                                SubLObject cdolist_list_var = actions;
                                                SubLObject action = NIL;
                                                for (action = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , action = cdolist_list_var.first()) {
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                SubLObject _prev_bind_0_50 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    cb_user_interaction_agenda.cb_uia_show_action(action, UNPROVIDED, UNPROVIDED);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_50, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_51 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_indent(TWO_INTEGER);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_51, thread);
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
                                                                SubLObject _prev_bind_0_52 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    {
                                                                        SubLObject pcase_var = user_interaction_agenda.ui_status(action);
                                                                        if (pcase_var.eql($REJECTED)) {
                                                                            html_utilities.html_princ($$$Rejected);
                                                                        } else
                                                                            if (pcase_var.eql($INVALIDATED)) {
                                                                                html_utilities.html_princ($$$Invalidated);
                                                                            } else
                                                                                if (pcase_var.eql($COMPLETED)) {
                                                                                    html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                                                                                    cb_utilities.cb_form(user_interaction_agenda.ui_result(action), UNPROVIDED, UNPROVIDED);
                                                                                    html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                                                                                }


                                                                    }
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_52, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_53 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_indent(TWO_INTEGER);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_53, thread);
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
                                                                SubLObject _prev_bind_0_54 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    {
                                                                        SubLObject start_time = user_interaction_agenda.ui_start_time(action);
                                                                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                                                        html_utilities.html_princ(numeric_date_utilities.timestring(start_time));
                                                                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                                                    }
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_54, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_55 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_indent(TWO_INTEGER);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_55, thread);
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
                                                                SubLObject _prev_bind_0_56 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    {
                                                                        SubLObject finish_time = user_interaction_agenda.ui_finish_time(action);
                                                                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                                                        html_utilities.html_princ(numeric_date_utilities.timestring(finish_time));
                                                                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                                                    }
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_56, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt159$__);
                                                }
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                }
                                if (NIL != pruneP) {
                                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_utilities.html_princ($str_alt160$___);
                                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                }
                            }
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
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
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
    }

    public static final SubLObject cb_link_uia_serialize_knowledge_journal(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt148$_Save_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_princ($str_alt161$cb_uia_serialize_knowledge_journa);
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

    public static final SubLObject cb_link_uia_knowledge_journal(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt163$_Journal_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_princ($str_alt164$cb_uia_knowledge_journal);
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

    public static final SubLObject cb_uia_serialize_knowledge_journal(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            uia_tools_review_and_testing.uiat_kjournal_save(v_agenda, $INFORM);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_uia_show_knowledge_reviewer(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = user_interaction_agenda.$uia_frameless_environmentP$.currentBinding(thread);
                try {
                    user_interaction_agenda.$uia_frameless_environmentP$.bind(T, thread);
                    {
                        SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                        SubLObject reviewer = uia_tools_review_and_testing.uiat_act_new_knowledge_reviewer(v_agenda, $REQUIRED, UNPROVIDED);
                        SubLObject request = uia_tools_review_and_testing.uiat_knowledge_reviewer_generate_request(reviewer);
                        cb_uiat_knowledge_reviewer_render_request(request);
                    }
                } finally {
                    user_interaction_agenda.$uia_frameless_environmentP$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_uia_separate_knowledge_reviewer(SubLObject linktext) {
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
                html_utilities.html_url_princ($str_alt171$cb_uia_show_knowledge_reviewer);
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

    public static final SubLObject cb_uiat_knowledge_reviewer_render_request(SubLObject request) {
        {
            SubLObject datum = request;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject signature = NIL;
            SubLObject plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt20);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt20);
            action_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt20);
            signature = current.first();
            current = current.rest();
            plist = current;
            {
                SubLObject interaction = user_interaction_agenda.find_ui_by_signature(signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($SHOW)) {
                    {
                        SubLObject datum_57 = plist;
                        SubLObject current_58 = datum_57;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_58;
                        SubLObject bad = NIL;
                        SubLObject current_59 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_57, $list_alt174);
                            current_59 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_57, $list_alt174);
                            if (NIL == member(current_59, $list_alt175, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_59 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_57, $list_alt174);
                        }
                        {
                            SubLObject contents_tail = property_list_member($CONTENTS, current_58);
                            SubLObject contents = (NIL != contents_tail) ? ((SubLObject) (cadr(contents_tail))) : NIL;
                            SubLObject misc_contents_tail = property_list_member($MISC_CONTENTS, current_58);
                            SubLObject misc_contents = (NIL != misc_contents_tail) ? ((SubLObject) (cadr(misc_contents_tail))) : NIL;
                            SubLObject help_text_tail = property_list_member($HELP_TEXT, current_58);
                            SubLObject help_text = (NIL != help_text_tail) ? ((SubLObject) (cadr(help_text_tail))) : NIL;
                            return cb_uiat_kreview_render_guts(interaction, contents, help_text);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_kreview_render_guts(SubLObject interaction, SubLObject term_contents, SubLObject help_text) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            if (NIL != user_interaction_agenda.ui_state_lookup(interaction, $FRAMELESS, UNPROVIDED)) {
                {
                    SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    cb_user_interaction_agenda.cb_uia_show_action_hint(interaction, NIL, v_agenda);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                }
            }
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
                        SubLObject _prev_bind_0_60 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            cb_uiat_kreview_header(interaction);
                            cb_uiat_kreview_commands(interaction);
                            if (NIL != help_text) {
                                cb_uiat_kreview_help_text(interaction, help_text);
                            }
                            cb_uiat_kreview_terms_and_sentences(interaction, term_contents);
                            cb_uiat_kreview_commands(interaction);
                            cb_uiat_kreview_footer(interaction);
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_60, thread);
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

    public static final SubLObject cb_uiat_kreview_header(SubLObject interaction) {
        html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ($$$Knowledge_created_so_far);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
        return interaction;
    }

    public static final SubLObject cb_uiat_kreview_footer(SubLObject interaction) {
        if (NIL != user_interaction_agenda.ui_state_lookup(interaction, $FRAMELESS, UNPROVIDED)) {
            {
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject agenda_global_id_string = user_interaction_agenda.uia_global_id_string(v_agenda);
                cb_refresher_applet.cb_refresher_applet($str_alt181$, $sym182$UIA_KNOWLEDGE_REVIEWER_NEED_REFRESH_FROM_GLOBAL_INFO_, $int$15000, agenda_global_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_kreview_help_text(SubLObject interaction, SubLObject help_text) {
        html_utilities.html_newline(UNPROVIDED);
        html_utilities.html_princ(help_text);
        html_utilities.html_newline(UNPROVIDED);
        return interaction;
    }

    /**
     * if we have more than this many sentences to display, don't show any justifications...they bring mozilla to its knees
     */
    // defparameter
    private static final SubLSymbol $cb_uiat_kreview_sentence_justification_display_cutoff$ = makeSymbol("*CB-UIAT-KREVIEW-SENTENCE-JUSTIFICATION-DISPLAY-CUTOFF*");

    public static final SubLObject cb_uiat_kreview_terms_and_sentences(SubLObject interaction, SubLObject term_contents) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_newline(UNPROVIDED);
            {
                SubLObject _prev_bind_0 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                try {
                    pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
                    {
                        SubLObject sentence_count = user_interaction_agenda.ui_state_lookup(interaction, $SENTENCE_COUNT, ZERO_INTEGER);
                        SubLObject display_justificationsP = numL(sentence_count, $cb_uiat_kreview_sentence_justification_display_cutoff$.getDynamicValue(thread));
                        html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
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
                            html_utilities.html_markup(ONE_INTEGER);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(FIVE_INTEGER);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup($str_alt185$95_);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_61 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                {
                                    SubLObject list_var = NIL;
                                    SubLObject content_set = NIL;
                                    SubLObject term_num = NIL;
                                    for (list_var = term_contents, content_set = list_var.first(), term_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , content_set = list_var.first() , term_num = add(ONE_INTEGER, term_num)) {
                                        {
                                            SubLObject object_id = cconcatenate($str_alt186$new_knowledge_, princ_to_string(term_num));
                                            cb_uiat_kreview_display_content_set(content_set, object_id, ZERO_INTEGER, display_justificationsP);
                                        }
                                    }
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_61, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                    }
                } finally {
                    pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_0, thread);
                }
            }
            return interaction;
        }
    }

    public static final SubLObject cb_uiat_kreview_display_content_set(SubLObject term_and_contents, SubLObject object_id, SubLObject indent, SubLObject display_justificationsP) {
        if (display_justificationsP == UNPROVIDED) {
            display_justificationsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject term_plist = term_and_contents.first();
                SubLObject v_term = uia_tools_review_and_testing.uiat_kreview_get_term(term_plist);
                SubLObject term_sal_launcher = uia_tools_review_and_testing.uiat_kreview_term_get_launcher(term_plist);
                SubLObject term_allow_salient_descriptorP = uia_tools_review_and_testing.uiat_kreview_term_sd_allowedP(term_plist);
                SubLObject term_forgettableP = uia_tools_review_and_testing.uiat_kreview_term_forgettableP(term_plist);
                SubLObject contents = second(term_and_contents);
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
                            SubLObject _prev_bind_0_62 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_indent(indent);
                                {
                                    SubLObject phrase = (NIL != cb_uiat_kreview_show_link_for_termP(v_term, term_sal_launcher, term_allow_salient_descriptorP)) ? ((SubLObject) (uia_trampolines.uia_html_term_phrase(cb_user_interaction_agenda.cb_current_uia(), v_term, UNPROVIDED, UNPROVIDED))) : uia_trampolines.uia_term_phrase(cb_user_interaction_agenda.cb_current_uia(), v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_markup(phrase);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                }
                                html_utilities.html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
                                html_utilities.html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($str_alt187$text_css);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(dhtml_macros.$dhtml_css_media$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($$$screen);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_63 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_63, thread);
                                    }
                                }
                                html_utilities.html_markup(dhtml_macros.$dhtml_css_tail$.getGlobalValue());
                                html_utilities.html_terpri(UNPROVIDED);
                                if (NIL != contents) {
                                    dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, $str_alt181$);
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_62, thread);
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
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup($str_alt191$10_);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_64 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_indent(TWO_INTEGER);
                                if (NIL != term_forgettableP) {
                                    cb_utilities.cb_link($UIA_CONCEPT_KILLER, v_term, $str_alt193$_Forget_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_64, thread);
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
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup($str_alt194$15_);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_65 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_indent(TWO_INTEGER);
                                if (NIL != term_sal_launcher) {
                                    cb_user_interaction_agenda.cb_uia_show_launcher_link(term_sal_launcher, $str_alt195$_Interview_);
                                } else
                                    if (NIL != term_allow_salient_descriptorP) {
                                        cb_utilities.cb_link($UIA_SALIENT_DESCRIPTOR_REQUIRED, v_term, $str_alt195$_Interview_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }

                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_65, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        if (NIL == contents) {
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
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($str_alt197$20_);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_66 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_indent(TWO_INTEGER);
                                    html_utilities.html_princ($$$No_Known_Facts);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_66, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } else {
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align($TOP));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_67 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_67, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
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
                        if (contents.isList() && ((NIL != getf(contents.first(), $FORMULA, UNPROVIDED)) || (NIL != getf(contents.first(), $ASSERT, UNPROVIDED)))) {
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(FOUR_INTEGER);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_68 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        SubLObject _prev_bind_0_69 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                html_utilities.html_markup($str_alt203$100_);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_70 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    cb_uia_display_primitives.cb_uia_show_sentence_plist_set(contents, object_id, indent, display_justificationsP);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_70, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_69, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_68, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } else {
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(FOUR_INTEGER);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_71 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        SubLObject _prev_bind_0_72 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                html_utilities.html_markup($str_alt203$100_);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_73 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    {
                                                        SubLObject list_var = NIL;
                                                        SubLObject content_item = NIL;
                                                        SubLObject number_var = NIL;
                                                        for (list_var = contents, content_item = list_var.first(), number_var = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , content_item = list_var.first() , number_var = add(ONE_INTEGER, number_var)) {
                                                            cb_uiat_kreview_display_content_set(content_item, cconcatenate(object_id, new SubLObject[]{ $str_alt204$_, princ_to_string(number_var) }), add(TWO_INTEGER, indent), UNPROVIDED);
                                                        }
                                                    }
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_73, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_72, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_71, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
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

    /**
     *
     *
     * @unknown 
     */
    public static final SubLObject cb_uiat_kreview_show_link_for_termP(SubLObject v_term, SubLObject launcherP, SubLObject interviewP) {
        if (NIL != launcherP) {
            return NIL;
        }
        if (NIL != interviewP) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_kreview_terms(SubLObject interaction, SubLObject terms) {
        html_utilities.html_newline(UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ($$$New_Terms_Introduced);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_newline(UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
        if (NIL == terms) {
            html_utilities.html_princ($str_alt206$No_terms_introduced_so_far_);
        }
        {
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                cb_uia_display_primitives.cb_uia_show_term(v_term, UNPROVIDED);
                html_utilities.html_newline(UNPROVIDED);
            }
        }
        html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
        html_utilities.html_newline(UNPROVIDED);
        return interaction;
    }

    public static final SubLObject cb_uiat_kreview_assertions(SubLObject interaction, SubLObject contents, SubLObject label) {
        if (label == UNPROVIDED) {
            label = $$$New_Things_Said;
        }
        html_utilities.html_newline(UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ(label);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_newline(UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
        if (NIL == contents) {
            html_utilities.html_princ($str_alt208$Nothing_said_so_far_);
        }
        {
            SubLObject cdolist_list_var = contents;
            SubLObject assertion = NIL;
            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                cb_uia_display_primitives.cb_uia_show_assertion(assertion);
                html_utilities.html_newline(UNPROVIDED);
            }
        }
        html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
        html_utilities.html_newline(UNPROVIDED);
        return interaction;
    }

    public static final SubLObject cb_uiat_kreview_commands(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame = user_interaction_agenda.ui_state_lookup(interaction, $FRAME, UNPROVIDED);
                html_utilities.html_newline(TWO_INTEGER);
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
                            SubLObject _prev_bind_0_74 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_75 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        cb_utilities.cb_link($UIAT_KREVIEW_REFRESH, interaction, $str_alt146$_Refresh_, frame, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_75, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_76 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_indent(TWO_INTEGER);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_76, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_77 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        cb_utilities.cb_link($UIAT_KREVIEW_SAVE, interaction, $str_alt148$_Save_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_77, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                if (NIL == user_interaction_agenda.ui_state_lookup(interaction, $FRAMELESS, UNPROVIDED)) {
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_78 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_indent(TWO_INTEGER);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_78, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_79 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            cb_utilities.cb_link($UIA_NEXT_INTERACTION, $str_alt38$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_79, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_80 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_indent(TWO_INTEGER);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_80, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_81 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_indent(TWO_INTEGER);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_81, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_82 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        cb_utilities.cb_link($UIAT_KREVIEW_GET_REVIEWED, interaction, $str_alt215$_Submit_for_Review_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_82, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_83 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_indent(TWO_INTEGER);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_83, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_84 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        cb_utilities.cb_link($UIA_LEX_KNOWLEDGE_REVIEWER_LAUNCH, $str_alt217$_Lexical_Knowledge_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_84, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_74, thread);
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

    public static final SubLObject cb_link_uiat_kreview_save(SubLObject interaction, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt148$_Save_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(user_interaction_agenda.ui_id(interaction));
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt218$cb_uiat_kreview_save, arglist);
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

    public static final SubLObject cb_uiat_kreview_save(SubLObject args) {
        {
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject ui_id = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt220);
            ui_id = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                    SubLObject interaction = user_interaction_agenda.uia_find_by_id(v_agenda, ui_id);
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $SAVE, NIL);
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt220);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_uiat_kreview_refresh(SubLObject interaction, SubLObject linktext, SubLObject frame) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (frame == UNPROVIDED) {
            frame = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt146$_Refresh_;
            }
            if (NIL != frame) {
                {
                    SubLObject frame_name_var = cb_utilities.cb_frame_name(frame);
                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    cb_parameters.cyc_cgi_url_int();
                    {
                        SubLObject arglist = list(user_interaction_agenda.ui_id(interaction));
                        cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt223$cb_uiat_kreview_refresh, arglist);
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
            } else {
                cb_utilities.cb_link($UIA_SEPARATE_KNOWLEDGE_REVIEWER, $str_alt146$_Refresh_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_kreview_refresh(SubLObject args) {
        {
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject ui_id = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt220);
            ui_id = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                    SubLObject interaction = user_interaction_agenda.uia_find_by_id(v_agenda, ui_id);
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $REFRESH, NIL);
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt220);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_uiat_kreview_get_reviewed(SubLObject interaction, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt227$_Get_Reviewed_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(user_interaction_agenda.ui_id(interaction));
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt228$cb_uiat_kreview_get_reviewed, arglist);
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

    public static final SubLObject cb_uiat_kreview_get_reviewed(SubLObject args) {
        {
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject ui_id = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt220);
            ui_id = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                    SubLObject interaction = user_interaction_agenda.uia_find_by_id(v_agenda, ui_id);
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $GET_REVIEWED, NIL);
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt220);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_uia_lex_knowledge_reviewer_launch(SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_url_princ($str_alt232$cb_uiat_lex_knowledge_reviewer_la);
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

    public static final SubLObject cb_uiat_lex_knowledge_reviewer_launch(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            uia_tools_review_and_testing.uiat_act_new_lex_knowledge_reviewer(v_agenda, $REQUIRED);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    /**
     * Process :show request for displaying lexical knowledge
     */
    public static final SubLObject cb_uiat_lex_knowledge_reviewer_render_request(SubLObject request) {
        {
            SubLObject datum = request;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject signature = NIL;
            SubLObject plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt20);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt20);
            action_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt20);
            signature = current.first();
            current = current.rest();
            plist = current;
            {
                SubLObject interaction = user_interaction_agenda.find_ui_by_signature(signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($SHOW)) {
                    {
                        SubLObject datum_85 = plist;
                        SubLObject current_86 = datum_85;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_86;
                        SubLObject bad = NIL;
                        SubLObject current_87 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_85, $list_alt237);
                            current_87 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_85, $list_alt237);
                            if (NIL == member(current_87, $list_alt238, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_87 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_85, $list_alt237);
                        }
                        {
                            SubLObject terms_tail = property_list_member($TERMS, current_86);
                            SubLObject terms = (NIL != terms_tail) ? ((SubLObject) (cadr(terms_tail))) : NIL;
                            SubLObject lex_lexical_contents_tail = property_list_member($LEX_LEXICAL_CONTENTS, current_86);
                            SubLObject lex_lexical_contents = (NIL != lex_lexical_contents_tail) ? ((SubLObject) (cadr(lex_lexical_contents_tail))) : NIL;
                            SubLObject lex_generation_contents_tail = property_list_member($LEX_GENERATION_CONTENTS, current_86);
                            SubLObject lex_generation_contents = (NIL != lex_generation_contents_tail) ? ((SubLObject) (cadr(lex_generation_contents_tail))) : NIL;
                            SubLObject lex_parsing_contents_tail = property_list_member($LEX_PARSING_CONTENTS, current_86);
                            SubLObject lex_parsing_contents = (NIL != lex_parsing_contents_tail) ? ((SubLObject) (cadr(lex_parsing_contents_tail))) : NIL;
                            return cb_uiat_lex_kreview_render_guts(interaction, terms, lex_lexical_contents, lex_generation_contents, lex_parsing_contents);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Display the lexical review listing with the assertions divided into three groups: lexical proper, generation, and parsing
     */
    public static final SubLObject cb_uiat_lex_kreview_render_guts(SubLObject interaction, SubLObject terms, SubLObject lex_lexical_contents, SubLObject lex_generation_contents, SubLObject lex_parsing_contents) {
        cb_uiat_lex_kreview_header(interaction);
        cb_uiat_lex_kreview_commands(interaction);
        cb_uiat_lex_kreview_phrases(interaction, lex_lexical_contents);
        cb_uiat_lex_kreview_assertions(interaction, lex_lexical_contents, $$$Lexical_Mappings_Added);
        if (NIL != lex_generation_contents) {
            cb_uiat_lex_kreview_assertions(interaction, lex_generation_contents, $$$Generation_Info_Added);
        }
        if (NIL != lex_parsing_contents) {
            cb_uiat_lex_kreview_assertions(interaction, lex_parsing_contents, $$$Parsing_Info_Added);
        }
        return interaction;
    }

    /**
     * Display header at top of the lexical review listing
     */
    public static final SubLObject cb_uiat_lex_kreview_header(SubLObject interaction) {
        html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ($$$Lexical_Knowledge_created_so_far);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
        return interaction;
    }

    /**
     * Display the terms introduced in the lexical interaction content (mainly word units)
     *
     * @unknown This is currently not shown in the listing
     */
    public static final SubLObject cb_uiat_lex_kreview_terms(SubLObject interaction, SubLObject terms) {
        return cb_uiat_kreview_terms(interaction, terms);
    }

    /**
     * Display phrases that will be derived from the lexical assertions in CONTENTS
     */
    public static final SubLObject cb_uiat_lex_kreview_phrases(SubLObject interaction, SubLObject contents) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_newline(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ($$$New_Phrasing_Added);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_newline(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
            {
                SubLObject phrasing_hash = make_hash_table($int$100, symbol_function(EQUALP), UNPROVIDED);
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject mt = user_interaction_agenda.uia_lexical_interaction_mt(v_agenda);
                SubLObject uia_phrase_assoc = NIL;
                {
                    SubLObject cdolist_list_var = contents;
                    SubLObject formula = NIL;
                    for (formula = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , formula = cdolist_list_var.first()) {
                        {
                            SubLObject assertion = czer_meta.find_assertion_cycl(formula, mt);
                            if ((NIL != assertions_high.gaf_assertionP(assertion)) && (NIL != assertion_utilities.nl_semantic_assertionP(assertion))) {
                                {
                                    SubLObject denot_term = lexicon_accessors.assertion_denotation(assertion);
                                    SubLObject phrases = lexification_utilities.phrases_from_semantic_assertion(assertion, UNPROVIDED);
                                    SubLObject item_var = cons(denot_term, uia_trampolines.uia_term_phrase(v_agenda, denot_term, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                    if (NIL == member(item_var, uia_phrase_assoc, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                        uia_phrase_assoc = cons(item_var, uia_phrase_assoc);
                                    }
                                    if (NIL != phrases) {
                                        sethash(denot_term, phrasing_hash, append(gethash(denot_term, phrasing_hash, UNPROVIDED), phrases));
                                    }
                                }
                            }
                        }
                    }
                }
                if (hash_table_count(phrasing_hash).numE(ZERO_INTEGER)) {
                    html_utilities.html_princ($str_alt249$Nothing_so_far_);
                } else {
                    {
                        SubLObject cdolist_list_var = Sort.sort(uia_phrase_assoc, symbol_function(STRING_LESSP), symbol_function(CDR));
                        SubLObject denot_term_with_phrase = NIL;
                        for (denot_term_with_phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , denot_term_with_phrase = cdolist_list_var.first()) {
                            {
                                SubLObject denot_term = denot_term_with_phrase.first();
                                SubLObject phrase = denot_term_with_phrase.rest();
                                SubLObject phrasings = gethash(denot_term, phrasing_hash, UNPROVIDED);
                                cb_uia_display_primitives.cb_uia_show_term(denot_term, phrase);
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt250$___S, remove(NIL, remove_duplicates(phrasings, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                html_utilities.html_newline(UNPROVIDED);
                            }
                        }
                    }
                }
            }
            html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
            html_utilities.html_newline(UNPROVIDED);
            return interaction;
        }
    }

    /**
     * Paraphrase each of the lexical assertions in CONTENTS in a section named LABEL
     */
    public static final SubLObject cb_uiat_lex_kreview_assertions(SubLObject interaction, SubLObject contents, SubLObject label) {
        return cb_uiat_kreview_assertions(interaction, contents, label);
    }

    /**
     * Display links for child interaction commands (e.g., [continue])
     */
    public static final SubLObject cb_uiat_lex_kreview_commands(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_newline(TWO_INTEGER);
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
                        SubLObject _prev_bind_0_88 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_89 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_utilities.cb_link($UIA_NEXT_INTERACTION, $str_alt38$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_89, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_90 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_indent(TWO_INTEGER);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_90, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_91 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_utilities.cb_link($UIA_KNOWLEDGE_REVIEWER_LAUNCH, $str_alt254$_General_Knowledge_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_91, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_88, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            return interaction;
        }
    }

    public static final SubLObject cb_link_uia_knowledge_reviewer_launch(SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_url_princ($str_alt255$cb_uiat_knowledge_reviewer_launch);
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

    public static final SubLObject cb_uiat_knowledge_reviewer_launch(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            uia_tools_review_and_testing.uiat_act_new_knowledge_reviewer(v_agenda, $REQUIRED, UNPROVIDED);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    /**
     * Process :show request for displaying lexical knowledge
     */
    public static final SubLObject cb_uia_test_suite_tool_render_request(SubLObject request) {
        {
            SubLObject datum = request;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject signature = NIL;
            SubLObject plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt20);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt20);
            action_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt20);
            signature = current.first();
            current = current.rest();
            plist = current;
            {
                SubLObject interaction = user_interaction_agenda.find_ui_by_signature(signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($CHOOSE_TEST_SUITE)) {
                    {
                        SubLObject datum_92 = plist;
                        SubLObject current_93 = datum_92;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_93;
                        SubLObject bad = NIL;
                        SubLObject current_94 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_92, $list_alt261);
                            current_94 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_92, $list_alt261);
                            if (NIL == member(current_94, $list_alt262, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_94 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_92, $list_alt261);
                        }
                        {
                            SubLObject test_suite_names_tail = property_list_member($TEST_SUITE_NAMES, current_93);
                            SubLObject test_suite_names = (NIL != test_suite_names_tail) ? ((SubLObject) (cadr(test_suite_names_tail))) : NIL;
                            return cb_uia_test_suite_tool_render_test_suite_chooser_guts(interaction, test_suite_names);
                        }
                    }
                } else
                    if (pcase_var.eql($SHOW_ALL_QUERY_RESULTS)) {
                        {
                            SubLObject datum_95 = plist;
                            SubLObject current_96 = datum_95;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current_96;
                            SubLObject bad = NIL;
                            SubLObject current_97 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum_95, $list_alt265);
                                current_97 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum_95, $list_alt265);
                                if (NIL == member(current_97, $list_alt266, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_97 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum_95, $list_alt265);
                            }
                            {
                                SubLObject test_suite_tail = property_list_member($TEST_SUITE, current_96);
                                SubLObject test_suite = (NIL != test_suite_tail) ? ((SubLObject) (cadr(test_suite_tail))) : NIL;
                                SubLObject results_tail = property_list_member($RESULTS, current_96);
                                SubLObject results = (NIL != results_tail) ? ((SubLObject) (cadr(results_tail))) : NIL;
                                return cb_uia_test_suite_tool_render_all_query_guts(interaction, test_suite, results);
                            }
                        }
                    } else
                        if (pcase_var.eql($SHOW_TEST_RESULT)) {
                            {
                                SubLObject datum_98 = plist;
                                SubLObject current_99 = datum_98;
                                SubLObject allow_other_keys_p = NIL;
                                SubLObject rest = current_99;
                                SubLObject bad = NIL;
                                SubLObject current_100 = NIL;
                                for (; NIL != rest;) {
                                    destructuring_bind_must_consp(rest, datum_98, $list_alt270);
                                    current_100 = rest.first();
                                    rest = rest.rest();
                                    destructuring_bind_must_consp(rest, datum_98, $list_alt270);
                                    if (NIL == member(current_100, $list_alt271, UNPROVIDED, UNPROVIDED)) {
                                        bad = T;
                                    }
                                    if (current_100 == $ALLOW_OTHER_KEYS) {
                                        allow_other_keys_p = rest.first();
                                    }
                                    rest = rest.rest();
                                }
                                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                    cdestructuring_bind_error(datum_98, $list_alt270);
                                }
                                {
                                    SubLObject query_result_tail = property_list_member($QUERY_RESULT, current_99);
                                    SubLObject query_result = (NIL != query_result_tail) ? ((SubLObject) (cadr(query_result_tail))) : NIL;
                                    SubLObject query_tail = property_list_member($QUERY, current_99);
                                    SubLObject query = (NIL != query_tail) ? ((SubLObject) (cadr(query_tail))) : NIL;
                                    return cb_uia_test_suite_tool_render_query_guts(interaction, query, query_result);
                                }
                            }
                        } else
                            if (pcase_var.eql($SHOW_TEST_SUITE)) {
                                {
                                    SubLObject datum_101 = plist;
                                    SubLObject current_102 = datum_101;
                                    SubLObject allow_other_keys_p = NIL;
                                    SubLObject rest = current_102;
                                    SubLObject bad = NIL;
                                    SubLObject current_103 = NIL;
                                    for (; NIL != rest;) {
                                        destructuring_bind_must_consp(rest, datum_101, $list_alt274);
                                        current_103 = rest.first();
                                        rest = rest.rest();
                                        destructuring_bind_must_consp(rest, datum_101, $list_alt274);
                                        if (NIL == member(current_103, $list_alt275, UNPROVIDED, UNPROVIDED)) {
                                            bad = T;
                                        }
                                        if (current_103 == $ALLOW_OTHER_KEYS) {
                                            allow_other_keys_p = rest.first();
                                        }
                                        rest = rest.rest();
                                    }
                                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                        cdestructuring_bind_error(datum_101, $list_alt274);
                                    }
                                    {
                                        SubLObject test_suite_tail = property_list_member($TEST_SUITE, current_102);
                                        SubLObject test_suite = (NIL != test_suite_tail) ? ((SubLObject) (cadr(test_suite_tail))) : NIL;
                                        return cb_uia_test_suite_tool_render_guts(interaction, test_suite);
                                    }
                                }
                            } else {
                                Errors.warn($str_alt276$Unknown_action_type___A, action_type);
                            }



            }
        }
        return NIL;
    }

    public static final SubLObject cb_uia_test_suite_tool_render_test_suite_chooser_guts(SubLObject interaction, SubLObject test_suite_names) {
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
                        html_utilities.html_hidden_input($str_alt277$cb_uia_test_suite_tool_choose_tes, T, UNPROVIDED);
                        html_utilities.html_hidden_input($$$id, user_interaction_agenda.ui_id(interaction), UNPROVIDED);
                        html_utilities.html_newline(UNPROVIDED);
                        html_utilities.html_princ($str_alt278$Please__select_a_test_suite__);
                        html_utilities.html_newline(UNPROVIDED);
                        if (NIL == test_suite_names) {
                            html_utilities.html_princ($str_alt279$Could_not_find_any_available_test);
                        } else {
                            html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup($str_alt280$TEST_SUITE_NAME);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_104 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    {
                                        SubLObject cdolist_list_var = test_suite_names;
                                        SubLObject test_suite_name = NIL;
                                        for (test_suite_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , test_suite_name = cdolist_list_var.first()) {
                                            html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                            if (NIL != test_suite_name) {
                                                html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(test_suite_name);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_105 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    if (NIL != uia_tools_review_and_testing.uia_test_suite_tool_is_new_test_suite_tag_p(test_suite_name)) {
                                                        html_utilities.html_princ($str_alt281$Start_New_Test_Suite____);
                                                    } else {
                                                        cb_uia_display_primitives.cb_uia_show_term_without_link(test_suite_name, UNPROVIDED);
                                                    }
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_105, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                        }
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_104, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                            html_utilities.html_princ_non_breaking($str_alt282$_);
                            html_utilities.html_submit_input($$$Select, UNPROVIDED, UNPROVIDED);
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

    public static final SubLObject cb_uia_test_suite_tool_choose_test_suite(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, html_utilities.html_extract_input($$$id, args));
            SubLObject test_suite_name_string = html_utilities.html_extract_input($str_alt280$TEST_SUITE_NAME, args);
            SubLObject test_suite_name = read_from_string_ignoring_errors(test_suite_name_string, NIL, $EOF, UNPROVIDED, UNPROVIDED);
            SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $SET_TEST_SUITE_NAME, list($TEST_SUITE_NAME, test_suite_name));
            return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
        }
    }

    public static final SubLObject cb_link_uia_test_suite_tool_run_query(SubLObject interaction, SubLObject test_suite, SubLObject query) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction, test_suite, query);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt288$cb_uia_test_suite_tool_run_query, arglist);
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
                        cb_uia_display_primitives.cb_uia_princ_tool_linktext($str_alt289$_Run_);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_uia_test_suite_tool_run_all_queries(SubLObject interaction, SubLObject test_suite) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction, test_suite);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt292$cb_uia_test_suite_tool_run_all_qu, arglist);
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
                        cb_uia_display_primitives.cb_uia_princ_tool_linktext($str_alt293$_Run_all_test_queries_);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uia_test_suite_tool_render_all_query_guts(SubLObject interaction, SubLObject test_suite, SubLObject query_results) {
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
            SubLObject query = NIL;
            SubLObject query_106 = NIL;
            SubLObject query_result = NIL;
            SubLObject query_result_107 = NIL;
            for (query = test_query_suite.test_query_suite_queries(test_suite), query_106 = query.first(), query_result = query_results, query_result_107 = query_result.first(); !((NIL == query_result) && (NIL == query)); query = query.rest() , query_106 = query.first() , query_result = query_result.rest() , query_result_107 = query_result.first()) {
                display_query_results(interaction, query_106, query_result_107);
                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
            }
        }
        html_utilities.html_newline(UNPROVIDED);
        cb_utilities.cb_link($UIA_NEXT_INTERACTION, $str_alt296$_View_Test_Queries_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        return interaction;
    }

    public static final SubLObject cb_uia_test_suite_tool_render_query_guts(SubLObject interaction, SubLObject query, SubLObject query_result) {
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
        display_query_results(interaction, query, query_result);
        html_utilities.html_newline(UNPROVIDED);
        cb_utilities.cb_link($UIA_NEXT_INTERACTION, $str_alt296$_View_Test_Queries_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        return interaction;
    }

    public static final SubLObject display_query_results(SubLObject interaction, SubLObject query, SubLObject query_result) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject inference = user_interaction_agenda.ui_state_lookup(interaction, $INFERENCE, UNPROVIDED);
                SubLObject test_suite = user_interaction_agenda.ui_state_lookup(interaction, $TEST_SUITE, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_utilities.html_markup(THREE_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                html_utilities.html_princ($str_alt298$Query_Result__);
                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_utilities.html_markup(THREE_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                html_utilities.html_newline(UNPROVIDED);
                if (query_result == $ERROR) {
                    {
                        SubLObject error_message = user_interaction_agenda.ui_state_lookup(interaction, $ERROR_MESSAGE, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt301$Error__);
                        html_utilities.html_princ(error_message);
                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        html_utilities.html_newline(UNPROVIDED);
                    }
                } else {
                    if (inference_datastructures_inference.inference_answer_count(inference).isZero()) {
                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                        html_utilities.html_princ($str_alt302$No_solutions_found_for_this_query);
                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        html_utilities.html_newline(UNPROVIDED);
                    } else {
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
                            html_utilities.html_markup(ONE_INTEGER);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                {
                                    SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
                                    if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                                        {
                                            SubLObject id = id_index.do_id_index_next_id(idx, NIL, NIL, NIL);
                                            SubLObject state_var = id_index.do_id_index_next_state(idx, NIL, id, NIL);
                                            SubLObject inference_answer = NIL;
                                            while (NIL != id) {
                                                inference_answer = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                                if (NIL != id_index.do_id_index_id_and_object_validP(id, inference_answer, $SKIP)) {
                                                    {
                                                        SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings(inference_answer);
                                                        SubLObject counter = inference_datastructures_inference.inference_answer_suid(inference_answer);
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_108 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                    SubLObject _prev_bind_0_109 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        cb_utilities.cb_link($UIA_TEST_SUITE_JUSTIFY_QUERY, interaction, query, counter, UNPROVIDED, UNPROVIDED);
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
                                                                        cb_uia_test_suite_show_bindings(v_bindings);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_110, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_108, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    }
                                                }
                                                id = id_index.do_id_index_next_id(idx, NIL, id, state_var);
                                                state_var = id_index.do_id_index_next_state(idx, NIL, id, state_var);
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
                }
                cb_uia_test_suite_render_query_details(interaction, test_suite, query);
                html_utilities.html_newline(UNPROVIDED);
                cb_utilities.cb_link($UIA_TEST_SUITE_DISPLAY_HALO_FORMAT, interaction, query, query_result, UNPROVIDED, UNPROVIDED);
                html_utilities.html_newline(UNPROVIDED);
                return interaction;
            }
        }
    }

    public static final SubLObject get_available_coas_and_mts(SubLObject interaction) {
        {
            SubLObject mt = user_interaction_agenda.ui_domain_interaction_mt(interaction);
            SubLObject default_coa = user_interaction_agenda.ui_state_lookup(interaction, $TEST_COA, $UNDETERMINED);
            SubLObject default_coa_mt = user_interaction_agenda.ui_state_lookup(interaction, $TEST_COA_MT, $UNDETERMINED);
            SubLObject coas = ask_utilities.ask_variable($sym308$_COA, $list_alt309, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject coa_mts = ask_utilities.ask_variable($sym310$_COAMT, $list_alt311, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (!default_coa.equal($UNDETERMINED)) {
                coas = remove(default_coa, coas, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                coas = cons(default_coa, coas);
            }
            if (!default_coa_mt.equal($UNDETERMINED)) {
                coa_mts = remove(default_coa_mt, coa_mts, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                coa_mts = cons(default_coa_mt, coa_mts);
            }
            return values(coas, coa_mts);
        }
    }

    public static final SubLObject cb_uia_test_suite_tool_coa_stuff(SubLObject interaction) {
        return NIL;
    }

    public static final SubLObject cb_uia_test_suite_tool_render_guts(SubLObject interaction, SubLObject test_suite) {
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
                        html_utilities.html_hidden_input($str_alt288$cb_uia_test_suite_tool_run_query, T, UNPROVIDED);
                        html_utilities.html_newline(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                        html_utilities.html_markup(FOUR_INTEGER);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        html_utilities.html_princ($str_alt316$Test_Suite__);
                        cb_uia_display_primitives.cb_uia_show_term_without_link(test_query_suite.test_query_suite_cycl_id(test_suite), UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                        html_utilities.html_markup(FOUR_INTEGER);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        cb_uia_test_suite_tool_coa_stuff(interaction);
                        html_utilities.html_newline(UNPROVIDED);
                        html_utilities.html_hidden_input($$$id, user_interaction_agenda.ui_id(interaction), UNPROVIDED);
                        {
                            SubLObject cdolist_list_var = test_query_suite.test_query_suite_queries(test_suite);
                            SubLObject query = NIL;
                            for (query = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query = cdolist_list_var.first()) {
                                if (NIL != uia_tools_review_and_testing.uia_valid_query_p(query)) {
                                    html_utilities.html_submit_input($$$Run, cb_user_interaction_agenda.cb_uia_html_encode(user_interaction_agenda.ui_agenda(interaction), cycl_query_specification.cycl_query_specification_cycl_id(query)), UNPROVIDED);
                                    html_utilities.html_princ($str_alt282$_);
                                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_utilities.html_princ(cycl_query_specification.cycl_query_specification_comment(query));
                                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    html_utilities.html_newline(UNPROVIDED);
                                    cb_uia_tst_show_query_spec_formula(query);
                                    html_utilities.html_newline(UNPROVIDED);
                                    html_utilities.html_newline(UNPROVIDED);
                                }
                            }
                        }
                        html_utilities.html_submit_input($$$Run_All_Queries, UNPROVIDED, UNPROVIDED);
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
            }
            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
            if (true) {
                html_utilities.html_markup(html_macros.$html_table_align$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align($CENTER));
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            }
            if (true) {
                html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($str_alt319$90_);
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
                        SubLObject _prev_bind_0_111 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align($LEFT));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_112 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_utilities.cb_link($UIA_COMPLETE_INTERACTION, interaction, $str_alt320$_Finished_with_testing_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_112, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_111, thread);
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
            return interaction;
        }
    }

    public static final SubLObject cb_uia_tst_show_query_spec_formula(SubLObject query_spec) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                try {
                    pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
                    {
                        SubLObject formula = cycl_query_specification.cycl_query_specification_formula(query_spec);
                        if (NIL != el_utilities.el_formula_p(formula)) {
                            cb_uia_display_primitives.cb_uia_show_question(formula, UNPROVIDED);
                        } else {
                            html_utilities.html_princ($str_alt321$No_formula__ID__);
                            cb_utilities.cb_form(cycl_query_specification.cycl_query_specification_cycl_id(query_spec), UNPROVIDED, UNPROVIDED);
                        }
                    }
                } finally {
                    pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_0, thread);
                }
            }
            return query_spec;
        }
    }

    public static final SubLObject cb_uia_tst_show_inference_formula(SubLObject inference) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                try {
                    pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
                    cb_uia_display_primitives.cb_uia_show_question(inference_datastructures_inference.inference_el_query(inference), UNPROVIDED);
                } finally {
                    pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_0, thread);
                }
            }
            return inference;
        }
    }





    public static final SubLObject do_coa_formula_replacement(SubLObject formula, SubLObject coa, SubLObject coa_mt) {
        {
            SubLObject old_coa = $replacement_coa_term$.getGlobalValue();
            SubLObject old_coa_mt = $replacement_coa_mt_term$.getGlobalValue();
            return cycl_utilities.formula_subst(coa, old_coa, cycl_utilities.formula_subst(coa_mt, old_coa_mt, formula, EQUAL, UNPROVIDED), EQUAL, UNPROVIDED);
        }
    }

    public static final SubLObject modify_query_coa_info(SubLObject old_query, SubLObject coa, SubLObject coa_mt) {
        return cycl_query_specification.cycl_query_specification_new_query_from_old(old_query, do_coa_formula_replacement(el_utilities.copy_formula(cycl_query_specification.cycl_query_specification_formula(old_query)), coa, coa_mt), narts_high.nart_substitute(coa_mt));
    }

    public static final SubLObject cb_uia_test_suite_tool_run_query(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, html_utilities.html_extract_input($$$id, args));
            SubLObject test_suite = user_interaction_agenda.ui_state_lookup(interaction, $TEST_SUITE, UNPROVIDED);
            SubLObject query_id = cb_user_interaction_agenda.cb_uia_html_decode(v_agenda, html_utilities.html_extract_button_value($$$Run, args, UNPROVIDED));
            SubLObject query = test_query_suite.test_query_suite_find_query_by_id(test_suite, query_id);
            if (query_id == NIL) {
                return cb_uia_test_suite_tool_run_all_queries(args);
            }
            {
                SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $RUN_TEST_SUITE_TOOL_QUERY, list($QUERY, query));
                return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
            }
        }
    }

    public static final SubLObject cb_uia_test_suite_tool_run_all_queries(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, html_utilities.html_extract_input($$$id, args));
            SubLObject test_suite = user_interaction_agenda.ui_state_lookup(interaction, $TEST_SUITE, UNPROVIDED);
            SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $RUN_TEST_SUITE_TOOL_ALL_QUERIES, NIL);
            return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
        }
    }

    public static final SubLObject cb_link_uia_test_suite_justify_query(SubLObject interaction, SubLObject query, SubLObject result_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(user_interaction_agenda.ui_id(interaction), cycl_query_specification.cycl_query_specification_cycl_id(query), result_id);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt329$cb_uia_test_suite_justify_query, arglist);
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
                        cb_uia_display_primitives.cb_uia_princ_tool_linktext(format(NIL, $str_alt330$_D, add(ONE_INTEGER, result_id)));
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uia_test_suite_justify_query(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
                SubLObject current = datum;
                SubLObject ui_id = NIL;
                SubLObject query_id = NIL;
                SubLObject answer_id = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt332);
                ui_id = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt332);
                query_id = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt332);
                answer_id = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject interaction = user_interaction_agenda.uia_find_by_id(cb_user_interaction_agenda.cb_current_uia(), ui_id);
                        SubLObject test_suite = user_interaction_agenda.ui_state_lookup(interaction, $TEST_SUITE, UNPROVIDED);
                        SubLObject query = test_query_suite.test_query_suite_find_query_by_id(test_suite, query_id);
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
                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_113 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                            cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                                        }
                                        if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                            html_script_utilities.cb_hoverover_page_init();
                                        }
                                        {
                                            SubLObject inference = user_interaction_agenda.ui_state_lookup(interaction, $INFERENCE, UNPROVIDED);
                                            SubLObject inference_answer = inference_datastructures_inference.find_inference_answer_by_id(inference, answer_id);
                                            if (NIL != inference_datastructures_inference.inference_answer_p(inference_answer)) {
                                                cb_uia_test_suite_display_inference_answer(inference_answer);
                                            } else {
                                                html_utilities.html_princ_strong($str_alt333$Stale_query_information_);
                                            }
                                        }
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_align$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup($str_alt319$90_);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_114 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_115 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($LEFT));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_116 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                cb_utilities.cb_link($UIA_NEXT_INTERACTION, $str_alt38$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_116, thread);
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
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_117 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                cb_utilities.cb_link($UIA_TEST_SUITE_REDISPLAY_RESULT, interaction, query, $str_alt335$_Back_to_Test_Result_, UNPROVIDED, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_117, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_115, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_114, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_113, thread);
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
                } else {
                    cdestructuring_bind_error(datum, $list_alt332);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_uia_test_suite_redisplay_result(SubLObject interaction, SubLObject query, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt335$_Back_to_Test_Result_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction, cycl_query_specification.cycl_query_specification_cycl_id(query));
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt337$cb_uia_test_suite_redisplay_resul, arglist);
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

    public static final SubLObject cb_uia_test_suite_redisplay_result(SubLObject args) {
        {
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            SubLObject query_id = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt339);
            interaction = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt339);
            query_id = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject test_suite = user_interaction_agenda.ui_state_lookup(interaction, $TEST_SUITE, UNPROVIDED);
                    SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                    SubLObject query = test_query_suite.test_query_suite_find_query_by_id(test_suite, query_id);
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $REDISPLAY_RESULT, list($QUERY, query));
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt339);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uia_test_suite_display_inference_answer(SubLObject inference_answer) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings(inference_answer);
                SubLObject inference = inference_datastructures_inference.inference_answer_inference(inference_answer);
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(ONE_INTEGER);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_uia_test_suite_print_header_row($str_alt342$Query__);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_118 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_119 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        cb_uia_tst_show_inference_formula(inference);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_119, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_118, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        cb_uia_test_suite_print_header_row($str_alt343$Bindings__);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_120 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_121 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        cb_uia_test_suite_show_bindings(v_bindings);
                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_121, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_120, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        if (NIL != inference_datastructures_inference.inference_answer_p(inference_answer)) {
                            cb_uia_test_suite_print_header_row($str_alt344$Answer_Proofs__);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_122 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_123 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            cb_uia_display_primitives.cb_uia_show_inference_answer_proofs(inference_answer);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_123, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_122, thread);
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
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uia_test_suite_show_bindings(SubLObject v_bindings) {
        {
            SubLObject cdolist_list_var = v_bindings;
            SubLObject binding = NIL;
            for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                cb_uia_test_suite_show_one_binding(binding);
                html_utilities.html_newline(UNPROVIDED);
            }
        }
        return v_bindings;
    }

    public static final SubLObject cb_uia_test_suite_show_one_binding(SubLObject binding) {
        {
            SubLObject datum = binding;
            SubLObject current = datum;
            SubLObject var = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt345);
            var = current.first();
            current = current.rest();
            value = current;
            html_utilities.html_princ(var);
            html_utilities.html_indent(UNPROVIDED);
            html_utilities.html_glyph($RIGHTWARDS_ARROW, UNPROVIDED);
            html_utilities.html_indent(UNPROVIDED);
            if (NIL != collection_defns.cycl_sentenceP(value)) {
                cb_uia_display_primitives.cb_uia_show_sentence_without_link(value, UNPROVIDED);
            } else {
                cb_uia_display_primitives.cb_uia_show_term(value, UNPROVIDED);
            }
        }
        return binding;
    }

    public static final SubLObject cb_uia_test_suite_print_header_row(SubLObject text) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            if (NIL != html_macros.$html_color_cyc_logo_light_violet$.getDynamicValue(thread)) {
                html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_color_cyc_logo_light_violet$.getDynamicValue(thread));
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
                        SubLObject _prev_bind_0_124 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup(THREE_INTEGER);
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            html_utilities.html_princ(text);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup(THREE_INTEGER);
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_124, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            return text;
        }
    }

    public static final SubLObject cb_link_uia_test_suite_display_halo_format(SubLObject interaction, SubLObject query, SubLObject query_result, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt347$_HALO_Format_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction, query, query_result);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt348$cb_uia_test_suite_display_halo_fo, arglist);
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

    public static final SubLObject cb_uia_test_suite_display_halo_format(SubLObject args) {
        {
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            SubLObject query = NIL;
            SubLObject query_result = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt350);
            interaction = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt350);
            query = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt350);
            query_result = current.first();
            current = current.rest();
            if (NIL == current) {
                cb_uia_test_suite_perform_halo_format_generation(interaction, query, query_result, UNPROVIDED);
            } else {
                cdestructuring_bind_error(datum, $list_alt350);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uia_test_suite_perform_halo_format_generation(SubLObject interaction, SubLObject query, SubLObject query_result, SubLObject thinkingP) {
        if (thinkingP == UNPROVIDED) {
            thinkingP = NIL;
        }
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
                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_125 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                            }
                            if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                html_script_utilities.cb_hoverover_page_init();
                            }
                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_align$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align($TOP));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(FOUR_INTEGER);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(SEVEN_INTEGER);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($str_alt352$98_);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_126 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_127 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_128 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_princ($str_alt353$Query_);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_128, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_129 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                                                    cb_utilities.cb_form(cycl_query_specification.cycl_query_specification_comment(query), ZERO_INTEGER, T);
                                                    html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_129, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_127, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_130 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_131 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_princ($str_alt354$Query_generation_);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_131, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_132 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    cb_uia_tst_show_query_spec_formula(query);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_132, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_130, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_133 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_134 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_princ($str_alt355$Query_formula_);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_134, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_135 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                                                    cb_utilities.cb_form(cycl_query_specification.cycl_query_specification_formula(query), ZERO_INTEGER, T);
                                                    html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_135, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_133, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_136 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_137 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_princ($str_alt356$Results_);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_137, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_138 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    cb_uia_generate_halo_query_answer(interaction, query, query_result, $NL);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_138, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_136, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_139 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_140 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_princ($str_alt358$Results_CycL_);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_140, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_141 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    cb_uia_generate_halo_query_answer(interaction, query, query_result, $CYCL);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_141, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_139, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    {
                                        SubLObject list_var = NIL;
                                        SubLObject result = NIL;
                                        SubLObject counter = NIL;
                                        for (list_var = query_result, result = list_var.first(), counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , result = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_142 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                        SubLObject _prev_bind_0_143 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt360$Justification__A_, add(ONE_INTEGER, counter));
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_143, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_144 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            cb_uia_generate_halo_query_justification(result, counter);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_144, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_142, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        }
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_126, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            html_utilities.html_newline(UNPROVIDED);
                            cb_utilities.cb_link($UIA_TEST_SUITE_REDISPLAY_RESULT, interaction, query, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_utilities.html_newline(UNPROVIDED);
                            cb_utilities.cb_link($UIA_NEXT_INTERACTION, $str_alt296$_View_Test_Queries_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_125, thread);
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
            return NIL;
        }
    }

    public static final SubLObject cb_uia_generate_halo_query_justification(SubLObject result, SubLObject result_num) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_bindings = result.first();
                SubLObject supports = second(result);
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(TWO_INTEGER);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        {
                            SubLObject list_var = NIL;
                            SubLObject binding = NIL;
                            SubLObject counter = NIL;
                            for (list_var = v_bindings, binding = list_var.first(), counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , binding = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_145 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_146 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                                                html_utilities.html_princ(binding.first());
                                                html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_146, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_147 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                cb_uia_display_primitives.cb_uia_show_term(binding.rest(), UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_147, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_145, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            }
                        }
                        {
                            SubLObject list_var = NIL;
                            SubLObject support = NIL;
                            SubLObject counter = NIL;
                            for (list_var = supports, support = list_var.first(), counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , support = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_148 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                            SubLObject _prev_bind_0_149 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                cb_uia_display_primitives.cb_uia_show_support(support, format(NIL, $str_alt361$_Dj_D, result_num, counter), UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_149, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_148, thread);
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
            return NIL;
        }
    }

    public static final SubLObject cb_uia_generate_halo_query_answer(SubLObject interaction, SubLObject query, SubLObject query_result, SubLObject style) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject top_row = query_result.first().first();
                SubLObject width = length(top_row);
                SubLObject size = width;
                if (NIL == query_result) {
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ($str_alt302$No_solutions_found_for_this_query);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    html_utilities.html_newline(UNPROVIDED);
                } else {
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
                        html_utilities.html_markup(ONE_INTEGER);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            {
                                SubLObject top_row_150 = query_result.first().first();
                                cb_uiat_smart.cb_uiat_draw_table_header(top_row_150);
                                {
                                    SubLObject list_var = NIL;
                                    SubLObject result = NIL;
                                    SubLObject counter = NIL;
                                    for (list_var = query_result, result = list_var.first(), counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , result = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                                        {
                                            SubLObject datum = result;
                                            SubLObject current = datum;
                                            SubLObject v_bindings = NIL;
                                            SubLObject supports = NIL;
                                            destructuring_bind_must_consp(current, datum, $list_alt362);
                                            v_bindings = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list_alt362);
                                            supports = current.first();
                                            current = current.rest();
                                            if (NIL == current) {
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_151 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                            SubLObject _prev_bind_0_152 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                cb_utilities.cb_link($UIA_TEST_SUITE_JUSTIFY_QUERY, interaction, query, counter, UNPROVIDED, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_152, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        {
                                                            SubLObject cdolist_list_var = v_bindings;
                                                            SubLObject tuple = NIL;
                                                            for (tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tuple = cdolist_list_var.first()) {
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_153 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        {
                                                                            SubLObject value = tuple.rest();
                                                                            if ($CYCL == style) {
                                                                                cb_utilities.cb_form(value, UNPROVIDED, UNPROVIDED);
                                                                            } else {
                                                                                if (NIL != collection_defns.cycl_sentenceP(value)) {
                                                                                    cb_uia_display_primitives.cb_uia_show_sentence_without_link(value, UNPROVIDED);
                                                                                } else {
                                                                                    cb_uia_display_primitives.cb_uia_show_term(value, UNPROVIDED);
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_153, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            }
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_151, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } else {
                                                cdestructuring_bind_error(datum, $list_alt362);
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
                }
            }
            return interaction;
        }
    }

    public static final SubLObject cb_uia_test_suite_show_truth_arguments(SubLObject label, SubLObject v_arguments) {
        if (NIL != v_arguments) {
            html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ(label);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
            html_utilities.html_newline(UNPROVIDED);
            cb_uia_display_primitives.cb_uia_show_arguments(v_arguments, label, NIL);
        }
        return label;
    }

    public static final SubLObject cb_uia_test_suite_render_query_details(SubLObject interaction, SubLObject test_suite, SubLObject query) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cb_uia_test_suite_identify_query(test_suite, query);
            {
                SubLObject bgcolor = html_macros.$html_color_cyc_logo_lighter_violet$.getDynamicValue(thread);
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
                    html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($str_alt319$90_);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        if (NIL != bgcolor) {
                            html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(bgcolor);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_154 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_155 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt363$ID__);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_155, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_156 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt364$_A, cycl_query_specification.cycl_query_specification_cycl_id(query));
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_156, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_154, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        if (NIL != bgcolor) {
                            html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(bgcolor);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_157 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_158 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt355$Query_formula_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_158, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_159 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                                        cb_utilities.cb_form(cycl_query_specification.cycl_query_specification_formula(query), ZERO_INTEGER, T);
                                        html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_159, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_157, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        if (NIL != bgcolor) {
                            html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(bgcolor);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_160 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_161 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt365$Context__);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_161, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_162 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        {
                                            SubLObject mt = cycl_query_specification.cycl_query_specification_mt(query);
                                            if (mt == $INTERACTION_MT) {
                                                html_utilities.html_princ($$$current);
                                            } else {
                                                cb_uia_display_primitives.cb_uia_show_term_without_link(mt, UNPROVIDED);
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_162, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_160, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        if (NIL != bgcolor) {
                            html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(bgcolor);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_163 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_164 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt368$Settings__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_164, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_165 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_165, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_163, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        if (NIL != bgcolor) {
                            html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(bgcolor);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_166 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_167 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_indent(TWO_INTEGER);
                                        html_utilities.html_princ($str_alt369$Solutions__);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_167, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_168 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (cycl_query_specification.cycl_query_specification_max_number_of_results(query).isNumber()) {
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt330$_D, cycl_query_specification.cycl_query_specification_max_number_of_results(query));
                                        } else {
                                            html_utilities.html_princ($$$all);
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_168, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_166, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        if (NIL != bgcolor) {
                            html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(bgcolor);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_169 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_170 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_indent(TWO_INTEGER);
                                        html_utilities.html_princ($str_alt371$Time_spent__);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_170, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_171 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (cycl_query_specification.cycl_query_specification_time_cutoff_secs(query).isNumber()) {
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt372$_D_secs, cycl_query_specification.cycl_query_specification_time_cutoff_secs(query));
                                        } else {
                                            html_utilities.html_princ($$$as_long_as_it_takes);
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_171, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_169, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        if (NIL != bgcolor) {
                            html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(bgcolor);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_172 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_173 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_indent(TWO_INTEGER);
                                        html_utilities.html_princ($str_alt374$Effort__);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_173, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_174 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        {
                                            SubLObject backchain = cycl_query_specification.cycl_query_specification_back_chaining(query);
                                            html_utilities.html_princ(cb_solution_finder.cb_sf_map_backchain_to_string(backchain));
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_174, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_172, thread);
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

    public static final SubLObject cb_uia_test_suite_display_test_suite(SubLObject test_suite) {
        html_utilities.html_newline(UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ($str_alt316$Test_Suite__);
        html_utilities.html_princ(pph_main.generate_phrase_for_java(test_query_suite.test_query_suite_cycl_id(test_suite), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first());
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
        html_utilities.html_newline(UNPROVIDED);
        return test_suite;
    }

    public static final SubLObject cb_uia_test_suite_identify_query(SubLObject tsuite, SubLObject query) {
        html_utilities.html_newline(UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_utilities.html_markup(THREE_INTEGER);
        html_utilities.html_char(CHAR_greater, UNPROVIDED);
        html_utilities.html_princ($str_alt342$Query__);
        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_utilities.html_markup(THREE_INTEGER);
        html_utilities.html_char(CHAR_greater, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
        html_utilities.html_princ(cycl_query_specification.cycl_query_specification_comment(query));
        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
        html_utilities.html_newline(UNPROVIDED);
        cb_uia_tst_show_query_spec_formula(query);
        html_utilities.html_newline(UNPROVIDED);
        html_utilities.html_newline(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_link_uiat_add_untried_query_to_tsuite(SubLObject sf_state, SubLObject cycl_query, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(sf_state, cycl_query);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt375$cb_uiat_add_untried_query_to_tsui, arglist);
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

    public static final SubLObject cb_uiat_add_untried_query_to_tsuite(SubLObject args) {
        return cb_user_interaction_agenda.cb_uia_show_next_interaction(cb_user_interaction_agenda.cb_current_uia());
    }

    public static final SubLObject declare_cb_uia_tools_review_and_testing_file() {
        declareFunction("uiat_query_constructor_hint", "UIAT-QUERY-CONSTRUCTOR-HINT", 1, 0, false);
        declareFunction("uiat_query_constructor_child_completed", "UIAT-QUERY-CONSTRUCTOR-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_query_constructor_child_rejected", "UIAT-QUERY-CONSTRUCTOR-CHILD-REJECTED", 2, 0, false);
        declareFunction("uiat_query_constructor_child_invalidated", "UIAT-QUERY-CONSTRUCTOR-CHILD-INVALIDATED", 2, 0, false);
        declareFunction("cb_uiat_query_constructor_display", "CB-UIAT-QUERY-CONSTRUCTOR-DISPLAY", 1, 0, false);
        declareFunction("uia_act_new_query_constructor", "UIA-ACT-NEW-QUERY-CONSTRUCTOR", 1, 5, false);
        declareFunction("cb_uiat_common_queries_render_request", "CB-UIAT-COMMON-QUERIES-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_common_queries_show_all", "CB-UIAT-COMMON-QUERIES-SHOW-ALL", 2, 0, false);
        declareFunction("cb_uiat_show_queries", "CB-UIAT-SHOW-QUERIES", 2, 0, false);
        declareFunction("cb_uiat_show_one_query", "CB-UIAT-SHOW-ONE-QUERY", 2, 0, false);
        declareFunction("cb_uiat_show_query_specs", "CB-UIAT-SHOW-QUERY-SPECS", 2, 0, false);
        declareFunction("cb_uiat_show_one_query_spec", "CB-UIAT-SHOW-ONE-QUERY-SPEC", 2, 0, false);
        declareFunction("cb_uiat_handle_common_queries_focus", "CB-UIAT-HANDLE-COMMON-QUERIES-FOCUS", 1, 0, false);
        declareFunction("cb_link_uiat_common_queries_focus", "CB-LINK-UIAT-COMMON-QUERIES-FOCUS", 2, 0, false);
        declareFunction("cb_uia_common_queries_ask", "CB-UIA-COMMON-QUERIES-ASK", 1, 0, false);
        declareFunction("cb_link_uiat_common_queries_ask", "CB-LINK-UIAT-COMMON-QUERIES-ASK", 2, 1, false);
        declareFunction("cb_uiat_common_queries_focus_requested", "CB-UIAT-COMMON-QUERIES-FOCUS-REQUESTED", 1, 0, false);
        declareFunction("cb_uiat_handle_common_queries_focus_requested", "CB-UIAT-HANDLE-COMMON-QUERIES-FOCUS-REQUESTED", 1, 0, false);
        declareFunction("cb_uiat_handle_common_queries_show_all", "CB-UIAT-HANDLE-COMMON-QUERIES-SHOW-ALL", 1, 0, false);
        declareFunction("cb_link_uiat_common_queries_show_all", "CB-LINK-UIAT-COMMON-QUERIES-SHOW-ALL", 2, 0, false);
        declareFunction("cb_uiat_common_queries_focus_results", "CB-UIAT-COMMON-QUERIES-FOCUS-RESULTS", 4, 0, false);
        declareFunction("cb_link_uiat_common_queries_focus_term", "CB-LINK-UIAT-COMMON-QUERIES-FOCUS-TERM", 1, 1, false);
        declareFunction("cb_uia_common_queries_focus_term", "CB-UIA-COMMON-QUERIES-FOCUS-TERM", 1, 0, false);
        declareFunction("cb_uiat_common_queries_launch", "CB-UIAT-COMMON-QUERIES-LAUNCH", 1, 0, false);
        declareFunction("cb_link_uia_common_queries_launch", "CB-LINK-UIA-COMMON-QUERIES-LAUNCH", 1, 0, false);
        declareFunction("uiat_solution_finder_hint", "UIAT-SOLUTION-FINDER-HINT", 1, 0, false);
        declareFunction("uiat_solution_finder_child_completed", "UIAT-SOLUTION-FINDER-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_solution_finder_child_rejected", "UIAT-SOLUTION-FINDER-CHILD-REJECTED", 2, 0, false);
        declareFunction("cb_uiat_solution_finder_display", "CB-UIAT-SOLUTION-FINDER-DISPLAY", 1, 0, false);
        declareFunction("uia_act_new_solution_finder", "UIA-ACT-NEW-SOLUTION-FINDER", 1, 4, false);
        declareFunction("uia_act_new_solution_finder_from_query_spec", "UIA-ACT-NEW-SOLUTION-FINDER-FROM-QUERY-SPEC", 2, 2, false);
        declareFunction("uiat_sf_build_new_solution_finder", "UIAT-SF-BUILD-NEW-SOLUTION-FINDER", 2, 0, false);
        declareFunction("cb_link_uiat_solution_finder_cycl", "CB-LINK-UIAT-SOLUTION-FINDER-CYCL", 3, 0, false);
        declareFunction("cb_uiat_solution_finder_cycl", "CB-UIAT-SOLUTION-FINDER-CYCL", 1, 0, false);
        declareFunction("cb_uiat_ask_quirk_render_request", "CB-UIAT-ASK-QUIRK-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_ask_quirk_display_answers", "CB-UIAT-ASK-QUIRK-DISPLAY-ANSWERS", 2, 0, false);
        declareFunction("cb_link_uiat_ask_quirk_learn_factoid", "CB-LINK-UIAT-ASK-QUIRK-LEARN-FACTOID", 2, 1, false);
        declareFunction("cb_uiat_ask_quirk_learn_factoid", "CB-UIAT-ASK-QUIRK-LEARN-FACTOID", 1, 0, false);
        declareFunction("cb_uia_knowledge_journal", "CB-UIA-KNOWLEDGE-JOURNAL", 0, 1, false);
        declareFunction("show_uia_knowledge_journal", "SHOW-UIA-KNOWLEDGE-JOURNAL", 0, 2, false);
        declareFunction("cb_link_uia_serialize_knowledge_journal", "CB-LINK-UIA-SERIALIZE-KNOWLEDGE-JOURNAL", 0, 1, false);
        declareFunction("cb_link_uia_knowledge_journal", "CB-LINK-UIA-KNOWLEDGE-JOURNAL", 0, 1, false);
        declareFunction("cb_uia_serialize_knowledge_journal", "CB-UIA-SERIALIZE-KNOWLEDGE-JOURNAL", 0, 1, false);
        declareFunction("cb_uia_show_knowledge_reviewer", "CB-UIA-SHOW-KNOWLEDGE-REVIEWER", 1, 0, false);
        declareFunction("cb_link_uia_separate_knowledge_reviewer", "CB-LINK-UIA-SEPARATE-KNOWLEDGE-REVIEWER", 0, 1, false);
        declareFunction("cb_uiat_knowledge_reviewer_render_request", "CB-UIAT-KNOWLEDGE-REVIEWER-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_kreview_render_guts", "CB-UIAT-KREVIEW-RENDER-GUTS", 3, 0, false);
        declareFunction("cb_uiat_kreview_header", "CB-UIAT-KREVIEW-HEADER", 1, 0, false);
        declareFunction("cb_uiat_kreview_footer", "CB-UIAT-KREVIEW-FOOTER", 1, 0, false);
        declareFunction("cb_uiat_kreview_help_text", "CB-UIAT-KREVIEW-HELP-TEXT", 2, 0, false);
        declareFunction("cb_uiat_kreview_terms_and_sentences", "CB-UIAT-KREVIEW-TERMS-AND-SENTENCES", 2, 0, false);
        declareFunction("cb_uiat_kreview_display_content_set", "CB-UIAT-KREVIEW-DISPLAY-CONTENT-SET", 3, 1, false);
        declareFunction("cb_uiat_kreview_show_link_for_termP", "CB-UIAT-KREVIEW-SHOW-LINK-FOR-TERM?", 3, 0, false);
        declareFunction("cb_uiat_kreview_terms", "CB-UIAT-KREVIEW-TERMS", 2, 0, false);
        declareFunction("cb_uiat_kreview_assertions", "CB-UIAT-KREVIEW-ASSERTIONS", 2, 1, false);
        declareFunction("cb_uiat_kreview_commands", "CB-UIAT-KREVIEW-COMMANDS", 1, 0, false);
        declareFunction("cb_link_uiat_kreview_save", "CB-LINK-UIAT-KREVIEW-SAVE", 1, 1, false);
        declareFunction("cb_uiat_kreview_save", "CB-UIAT-KREVIEW-SAVE", 1, 0, false);
        declareFunction("cb_link_uiat_kreview_refresh", "CB-LINK-UIAT-KREVIEW-REFRESH", 1, 2, false);
        declareFunction("cb_uiat_kreview_refresh", "CB-UIAT-KREVIEW-REFRESH", 1, 0, false);
        declareFunction("cb_link_uiat_kreview_get_reviewed", "CB-LINK-UIAT-KREVIEW-GET-REVIEWED", 1, 1, false);
        declareFunction("cb_uiat_kreview_get_reviewed", "CB-UIAT-KREVIEW-GET-REVIEWED", 1, 0, false);
        declareFunction("cb_link_uia_lex_knowledge_reviewer_launch", "CB-LINK-UIA-LEX-KNOWLEDGE-REVIEWER-LAUNCH", 1, 0, false);
        declareFunction("cb_uiat_lex_knowledge_reviewer_launch", "CB-UIAT-LEX-KNOWLEDGE-REVIEWER-LAUNCH", 1, 0, false);
        declareFunction("cb_uiat_lex_knowledge_reviewer_render_request", "CB-UIAT-LEX-KNOWLEDGE-REVIEWER-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_lex_kreview_render_guts", "CB-UIAT-LEX-KREVIEW-RENDER-GUTS", 5, 0, false);
        declareFunction("cb_uiat_lex_kreview_header", "CB-UIAT-LEX-KREVIEW-HEADER", 1, 0, false);
        declareFunction("cb_uiat_lex_kreview_terms", "CB-UIAT-LEX-KREVIEW-TERMS", 2, 0, false);
        declareFunction("cb_uiat_lex_kreview_phrases", "CB-UIAT-LEX-KREVIEW-PHRASES", 2, 0, false);
        declareFunction("cb_uiat_lex_kreview_assertions", "CB-UIAT-LEX-KREVIEW-ASSERTIONS", 3, 0, false);
        declareFunction("cb_uiat_lex_kreview_commands", "CB-UIAT-LEX-KREVIEW-COMMANDS", 1, 0, false);
        declareFunction("cb_link_uia_knowledge_reviewer_launch", "CB-LINK-UIA-KNOWLEDGE-REVIEWER-LAUNCH", 1, 0, false);
        declareFunction("cb_uiat_knowledge_reviewer_launch", "CB-UIAT-KNOWLEDGE-REVIEWER-LAUNCH", 1, 0, false);
        declareFunction("cb_uia_test_suite_tool_render_request", "CB-UIA-TEST-SUITE-TOOL-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uia_test_suite_tool_render_test_suite_chooser_guts", "CB-UIA-TEST-SUITE-TOOL-RENDER-TEST-SUITE-CHOOSER-GUTS", 2, 0, false);
        declareFunction("cb_uia_test_suite_tool_choose_test_suite", "CB-UIA-TEST-SUITE-TOOL-CHOOSE-TEST-SUITE", 1, 0, false);
        declareFunction("cb_link_uia_test_suite_tool_run_query", "CB-LINK-UIA-TEST-SUITE-TOOL-RUN-QUERY", 3, 0, false);
        declareFunction("cb_link_uia_test_suite_tool_run_all_queries", "CB-LINK-UIA-TEST-SUITE-TOOL-RUN-ALL-QUERIES", 2, 0, false);
        declareFunction("cb_uia_test_suite_tool_render_all_query_guts", "CB-UIA-TEST-SUITE-TOOL-RENDER-ALL-QUERY-GUTS", 3, 0, false);
        declareFunction("cb_uia_test_suite_tool_render_query_guts", "CB-UIA-TEST-SUITE-TOOL-RENDER-QUERY-GUTS", 3, 0, false);
        declareFunction("display_query_results", "DISPLAY-QUERY-RESULTS", 3, 0, false);
        declareFunction("get_available_coas_and_mts", "GET-AVAILABLE-COAS-AND-MTS", 1, 0, false);
        declareFunction("cb_uia_test_suite_tool_coa_stuff", "CB-UIA-TEST-SUITE-TOOL-COA-STUFF", 1, 0, false);
        declareFunction("cb_uia_test_suite_tool_render_guts", "CB-UIA-TEST-SUITE-TOOL-RENDER-GUTS", 2, 0, false);
        declareFunction("cb_uia_tst_show_query_spec_formula", "CB-UIA-TST-SHOW-QUERY-SPEC-FORMULA", 1, 0, false);
        declareFunction("cb_uia_tst_show_inference_formula", "CB-UIA-TST-SHOW-INFERENCE-FORMULA", 1, 0, false);
        declareFunction("do_coa_formula_replacement", "DO-COA-FORMULA-REPLACEMENT", 3, 0, false);
        declareFunction("modify_query_coa_info", "MODIFY-QUERY-COA-INFO", 3, 0, false);
        declareFunction("cb_uia_test_suite_tool_run_query", "CB-UIA-TEST-SUITE-TOOL-RUN-QUERY", 1, 0, false);
        declareFunction("cb_uia_test_suite_tool_run_all_queries", "CB-UIA-TEST-SUITE-TOOL-RUN-ALL-QUERIES", 1, 0, false);
        declareFunction("cb_link_uia_test_suite_justify_query", "CB-LINK-UIA-TEST-SUITE-JUSTIFY-QUERY", 3, 0, false);
        declareFunction("cb_uia_test_suite_justify_query", "CB-UIA-TEST-SUITE-JUSTIFY-QUERY", 1, 0, false);
        declareFunction("cb_link_uia_test_suite_redisplay_result", "CB-LINK-UIA-TEST-SUITE-REDISPLAY-RESULT", 3, 0, false);
        declareFunction("cb_uia_test_suite_redisplay_result", "CB-UIA-TEST-SUITE-REDISPLAY-RESULT", 1, 0, false);
        declareFunction("cb_uia_test_suite_display_inference_answer", "CB-UIA-TEST-SUITE-DISPLAY-INFERENCE-ANSWER", 1, 0, false);
        declareFunction("cb_uia_test_suite_show_bindings", "CB-UIA-TEST-SUITE-SHOW-BINDINGS", 1, 0, false);
        declareFunction("cb_uia_test_suite_show_one_binding", "CB-UIA-TEST-SUITE-SHOW-ONE-BINDING", 1, 0, false);
        declareFunction("cb_uia_test_suite_print_header_row", "CB-UIA-TEST-SUITE-PRINT-HEADER-ROW", 1, 0, false);
        declareFunction("cb_link_uia_test_suite_display_halo_format", "CB-LINK-UIA-TEST-SUITE-DISPLAY-HALO-FORMAT", 3, 1, false);
        declareFunction("cb_uia_test_suite_display_halo_format", "CB-UIA-TEST-SUITE-DISPLAY-HALO-FORMAT", 1, 0, false);
        declareFunction("cb_uia_test_suite_perform_halo_format_generation", "CB-UIA-TEST-SUITE-PERFORM-HALO-FORMAT-GENERATION", 3, 1, false);
        declareFunction("cb_uia_generate_halo_query_justification", "CB-UIA-GENERATE-HALO-QUERY-JUSTIFICATION", 2, 0, false);
        declareFunction("cb_uia_generate_halo_query_answer", "CB-UIA-GENERATE-HALO-QUERY-ANSWER", 4, 0, false);
        declareFunction("cb_uia_test_suite_show_truth_arguments", "CB-UIA-TEST-SUITE-SHOW-TRUTH-ARGUMENTS", 2, 0, false);
        declareFunction("cb_uia_test_suite_render_query_details", "CB-UIA-TEST-SUITE-RENDER-QUERY-DETAILS", 3, 0, false);
        declareFunction("cb_uia_test_suite_display_test_suite", "CB-UIA-TEST-SUITE-DISPLAY-TEST-SUITE", 1, 0, false);
        declareFunction("cb_uia_test_suite_identify_query", "CB-UIA-TEST-SUITE-IDENTIFY-QUERY", 2, 0, false);
        declareFunction("cb_link_uiat_add_untried_query_to_tsuite", "CB-LINK-UIAT-ADD-UNTRIED-QUERY-TO-TSUITE", 3, 0, false);
        declareFunction("cb_uiat_add_untried_query_to_tsuite", "CB-UIAT-ADD-UNTRIED-QUERY-TO-TSUITE", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_uia_tools_review_and_testing_file() {
        defparameter("*UIAT-SF-DEFAULT-BACKCHAIN*", ONE_INTEGER);
        defparameter("*UIAT-SF-DEFAULT-NUMBER*", NIL);
        defparameter("*UIAT-SF-DEFAULT-TIME*", NIL);
        defparameter("*CB-UIAT-KREVIEW-SENTENCE-JUSTIFICATION-DISPLAY-CUTOFF*", TEN_INTEGER);
        deflexical("*REPLACEMENT-COA-TERM*", NIL != boundp($replacement_coa_term$) ? ((SubLObject) ($replacement_coa_term$.getGlobalValue())) : $list_alt323);
        deflexical("*REPLACEMENT-COA-MT-TERM*", NIL != boundp($replacement_coa_mt_term$) ? ((SubLObject) ($replacement_coa_mt_term$.getGlobalValue())) : $list_alt325);
        return NIL;
    }

    public static final SubLObject setup_cb_uia_tools_review_and_testing_file() {
                uia_tool_declaration.declare_uia_tool($QUERY_CONSTRUCTOR, $list_alt1);
        cb_uia_tool_declaration.declare_cb_uia_tool($QUERY_CONSTRUCTOR, $list_alt2);
        cb_uia_tool_declaration.declare_cb_uia_tool($COMMON_QUERIES, $list_alt19);
        html_macros.note_html_handler_function(CB_UIAT_HANDLE_COMMON_QUERIES_FOCUS);
        cb_utilities.setup_cb_link_method($UIAT_COMMON_QUERIES_FOCUS, CB_LINK_UIAT_COMMON_QUERIES_FOCUS, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_UIA_COMMON_QUERIES_ASK);
        cb_utilities.setup_cb_link_method($UIAT_COMMON_QUERIES_ASK, CB_LINK_UIAT_COMMON_QUERIES_ASK, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_HANDLE_COMMON_QUERIES_FOCUS_REQUESTED);
        html_macros.note_html_handler_function(CB_UIAT_HANDLE_COMMON_QUERIES_SHOW_ALL);
        cb_utilities.setup_cb_link_method($UIAT_COMMON_QUERIES_SHOW_ALL, CB_LINK_UIAT_COMMON_QUERIES_SHOW_ALL, TWO_INTEGER);
        cb_utilities.setup_cb_link_method($UIAT_COMMON_QUERIES_FOCUS_TERM, CB_LINK_UIAT_COMMON_QUERIES_FOCUS_TERM, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_UIA_COMMON_QUERIES_FOCUS_TERM);
        html_macros.note_html_handler_function(CB_UIAT_COMMON_QUERIES_LAUNCH);
        cb_utilities.setup_cb_link_method($UIA_COMMON_QUERIES_LAUNCH, CB_LINK_UIA_COMMON_QUERIES_LAUNCH, ONE_INTEGER);
        uia_tool_declaration.declare_uia_tool($SOLUTION_FINDER, $list_alt93);
        cb_uia_tool_declaration.declare_cb_uia_tool($SOLUTION_FINDER, $list_alt94);
        utilities_macros.register_html_state_variable($uiat_sf_default_backchain$);
        utilities_macros.register_html_state_variable($uiat_sf_default_number$);
        utilities_macros.register_html_state_variable($uiat_sf_default_time$);
        cb_utilities.setup_cb_link_method($UIAT_SOLUTION_FINDER_CYCL, CB_LINK_UIAT_SOLUTION_FINDER_CYCL, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_SOLUTION_FINDER_CYCL);
        cb_uia_tool_declaration.declare_cb_uia_tool($ASK_QUIRK, $list_alt116);
        cb_utilities.setup_cb_link_method($UIAT_ASK_QUIRK_LEARN_FACTOID, CB_LINK_UIAT_ASK_QUIRK_LEARN_FACTOID, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_ASK_QUIRK_LEARN_FACTOID);
        uia_tool_declaration.declare_uia_tool($KNOWLEDGE_JOURNAL, $list_alt141);
        html_macros.note_html_handler_function(CB_UIA_KNOWLEDGE_JOURNAL);
        cb_utilities.setup_cb_link_method($UIA_SERIALIZE_KNOWLEDGE_JOURNAL, CB_LINK_UIA_SERIALIZE_KNOWLEDGE_JOURNAL, ONE_INTEGER);
        cb_utilities.setup_cb_link_method($UIA_KNOWLEDGE_JOURNAL, CB_LINK_UIA_KNOWLEDGE_JOURNAL, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_UIA_SERIALIZE_KNOWLEDGE_JOURNAL);
        cb_uia_tool_declaration.declare_cb_uia_tool($KNOWLEDGE_REVIEWER, $list_alt169);
        html_macros.note_html_handler_function(CB_UIA_SHOW_KNOWLEDGE_REVIEWER);
        cb_utilities.setup_cb_link_method($UIA_SEPARATE_KNOWLEDGE_REVIEWER, CB_LINK_UIA_SEPARATE_KNOWLEDGE_REVIEWER, ONE_INTEGER);
        cb_utilities.setup_cb_link_method($UIAT_KREVIEW_SAVE, CB_LINK_UIAT_KREVIEW_SAVE, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_KREVIEW_SAVE);
        cb_utilities.setup_cb_link_method($UIAT_KREVIEW_REFRESH, CB_LINK_UIAT_KREVIEW_REFRESH, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_KREVIEW_REFRESH);
        cb_utilities.setup_cb_link_method($UIAT_KREVIEW_GET_REVIEWED, CB_LINK_UIAT_KREVIEW_GET_REVIEWED, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_KREVIEW_GET_REVIEWED);
        cb_utilities.setup_cb_link_method($UIA_LEX_KNOWLEDGE_REVIEWER_LAUNCH, CB_LINK_UIA_LEX_KNOWLEDGE_REVIEWER_LAUNCH, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_LEX_KNOWLEDGE_REVIEWER_LAUNCH);
        cb_uia_tool_declaration.declare_cb_uia_tool($LEX_KNOWLEDGE_REVIEWER, $list_alt236);
        cb_utilities.setup_cb_link_method($UIA_KNOWLEDGE_REVIEWER_LAUNCH, CB_LINK_UIA_KNOWLEDGE_REVIEWER_LAUNCH, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_KNOWLEDGE_REVIEWER_LAUNCH);
        cb_uia_tool_declaration.declare_cb_uia_tool($TEST_SUITE_TOOL, $list_alt259);
        html_macros.note_html_handler_function(CB_UIA_TEST_SUITE_TOOL_CHOOSE_TEST_SUITE);
        cb_utilities.setup_cb_link_method($UIA_TEST_SUITE_TOOL_RUN_QUERY, CB_LINK_UIA_TEST_SUITE_TOOL_RUN_QUERY, THREE_INTEGER);
        cb_utilities.setup_cb_link_method($UIA_TEST_SUITE_TOOL_RUN_ALL_QUERIES, CB_LINK_UIA_TEST_SUITE_TOOL_RUN_ALL_QUERIES, TWO_INTEGER);
        subl_macro_promotions.declare_defglobal($replacement_coa_term$);
        subl_macro_promotions.declare_defglobal($replacement_coa_mt_term$);
        html_macros.note_html_handler_function(CB_UIA_TEST_SUITE_TOOL_RUN_QUERY);
        cb_utilities.setup_cb_link_method($UIA_TEST_SUITE_JUSTIFY_QUERY, CB_LINK_UIA_TEST_SUITE_JUSTIFY_QUERY, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_UIA_TEST_SUITE_JUSTIFY_QUERY);
        cb_utilities.setup_cb_link_method($UIA_TEST_SUITE_REDISPLAY_RESULT, CB_LINK_UIA_TEST_SUITE_REDISPLAY_RESULT, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_UIA_TEST_SUITE_REDISPLAY_RESULT);
        cb_utilities.setup_cb_link_method($UIA_TEST_SUITE_DISPLAY_HALO_FORMAT, CB_LINK_UIA_TEST_SUITE_DISPLAY_HALO_FORMAT, FOUR_INTEGER);
        html_macros.note_html_handler_function(CB_UIA_TEST_SUITE_DISPLAY_HALO_FORMAT);
        cb_utilities.setup_cb_link_method($UIAT_ADD_UNTRIED_QUERY_TO_TSUITE, CB_LINK_UIAT_ADD_UNTRIED_QUERY_TO_TSUITE, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_ADD_UNTRIED_QUERY_TO_TSUITE);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol $QUERY_CONSTRUCTOR = makeKeyword("QUERY-CONSTRUCTOR");

    static private final SubLList $list_alt1 = list(new SubLObject[]{ $NAME, makeString("Query Constructor"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-QUERY-CONSTRUCTOR-HINT"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-QUERY-CONSTRUCTOR-CHILD-COMPLETED"), makeKeyword("CHILD-REJECTED-METHOD"), makeSymbol("UIAT-QUERY-CONSTRUCTOR-CHILD-REJECTED"), makeKeyword("CHILD-INVALIDATED-METHOD"), makeSymbol("UIAT-QUERY-CONSTRUCTOR-CHILD-INVALIDATED"), $CYCL, constant_handles.reader_make_constant_shell(makeString("QueryConstructor")) });

    static private final SubLList $list_alt2 = list(makeKeyword("DISPLAY-METHOD"), makeSymbol("CB-UIAT-QUERY-CONSTRUCTOR-DISPLAY"), $CYCL, constant_handles.reader_make_constant_shell(makeString("QueryConstructor")));

    static private final SubLList $list_alt3 = list(makeSymbol("QUESTION"));

    static private final SubLString $str_alt4$QC____A = makeString("QC : ~A");

    private static final SubLSymbol $SCENARIO_CONSTRUCTOR = makeKeyword("SCENARIO-CONSTRUCTOR");

    private static final SubLSymbol $QC_SCENARIO = makeKeyword("QC-SCENARIO");



    private static final SubLSymbol $SENTENCE_READER = makeKeyword("SENTENCE-READER");

    private static final SubLSymbol $QC_DIRECT_PARSE = makeKeyword("QC-DIRECT-PARSE");

    private static final SubLSymbol $QC_STATE = makeKeyword("QC-STATE");

    private static final SubLSymbol $QC_ADVANCED = makeKeyword("QC-ADVANCED");



    private static final SubLSymbol $QC_SCENARIO_PARSE = makeKeyword("QC-SCENARIO-PARSE");

    static private final SubLList $list_alt14 = list(makeSymbol("QUESTION-TEXT"));





    private static final SubLSymbol $SF_QUERY = makeKeyword("SF-QUERY");

    private static final SubLSymbol $COMMON_QUERIES = makeKeyword("COMMON-QUERIES");

    static private final SubLList $list_alt19 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-COMMON-QUERIES-RENDER-REQUEST"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycCommonQueriesTool")));

    static private final SubLList $list_alt20 = listS(makeUninternedSymbol("OPERATOR"), makeSymbol("ACTION-TYPE"), makeUninternedSymbol("SIGNATURE"), makeSymbol("PLIST"));

    private static final SubLSymbol $SHOW_ALL = makeKeyword("SHOW-ALL");

    static private final SubLList $list_alt22 = list(makeSymbol("&KEY"), makeSymbol("QUERIES"));

    static private final SubLList $list_alt23 = list(makeKeyword("QUERIES"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    private static final SubLSymbol $FOCUS_REQUESTED = makeKeyword("FOCUS-REQUESTED");

    static private final SubLList $list_alt27 = list(makeSymbol("&KEY"), makeSymbol("TERM"), makeSymbol("QUERIES"), makeSymbol("ARGS"));

    static private final SubLList $list_alt28 = list($TERM, makeKeyword("QUERIES"), $ARGS);





    private static final SubLSymbol $FOCUS_RESULTS = makeKeyword("FOCUS-RESULTS");

    static private final SubLList $list_alt32 = list(makeSymbol("&KEY"), makeSymbol("TERM"), makeSymbol("QUERY-FORMULAS"), makeSymbol("QUERY-SPECS"));

    static private final SubLList $list_alt33 = list($TERM, makeKeyword("QUERY-FORMULAS"), makeKeyword("QUERY-SPECS"));

    private static final SubLSymbol $QUERY_FORMULAS = makeKeyword("QUERY-FORMULAS");

    private static final SubLSymbol $QUERY_SPECS = makeKeyword("QUERY-SPECS");

    static private final SubLString $$$All_Example_Queries = makeString("All Example Queries");

    private static final SubLSymbol $UIA_COMPLETE_INTERACTION = makeKeyword("UIA-COMPLETE-INTERACTION");

    static private final SubLString $str_alt38$_Continue_ = makeString("[Continue]");

    private static final SubLSymbol $UIAT_COMMON_QUERIES_FOCUS = makeKeyword("UIAT-COMMON-QUERIES-FOCUS");

    static private final SubLString $str_alt40$_Ask_About_Particular_Term_ = makeString("[Ask About Particular Term]");



    private static final SubLSymbol $UIAT_COMMON_QUERIES_ASK = makeKeyword("UIAT-COMMON-QUERIES-ASK");

    private static final SubLSymbol $UIA_SIMILAR_QUESTION = makeKeyword("UIA-SIMILAR-QUESTION");

    static private final SubLString $str_alt44$_Ask_Similar_Question_ = makeString("[Ask Similar Question]");

    static private final SubLList $list_alt45 = list(makeSymbol("INTERACTION"));

    private static final SubLSymbol CB_UIAT_HANDLE_COMMON_QUERIES_FOCUS = makeSymbol("CB-UIAT-HANDLE-COMMON-QUERIES-FOCUS");

    private static final SubLSymbol $UIA_INTERACTION = makeKeyword("UIA-INTERACTION");

    static private final SubLString $str_alt48$cb_uiat_handle_common_queries_foc = makeString("cb-uiat-handle-common-queries-focus");

    private static final SubLSymbol CB_LINK_UIAT_COMMON_QUERIES_FOCUS = makeSymbol("CB-LINK-UIAT-COMMON-QUERIES-FOCUS");

    static private final SubLList $list_alt50 = list(makeSymbol("QUERY"), makeSymbol("INTERACTION"));







    private static final SubLSymbol $QUERY_TYPE = makeKeyword("QUERY-TYPE");

    private static final SubLSymbol CB_UIA_COMMON_QUERIES_ASK = makeSymbol("CB-UIA-COMMON-QUERIES-ASK");

    static private final SubLString $str_alt56$_Ask_This_Question_ = makeString("[Ask This Question]");

    static private final SubLString $str_alt57$cb_uia_common_queries_ask = makeString("cb-uia-common-queries-ask");

    private static final SubLSymbol CB_LINK_UIAT_COMMON_QUERIES_ASK = makeSymbol("CB-LINK-UIAT-COMMON-QUERIES-ASK");

    private static final SubLSymbol $FOCUS_SPECIFIED = makeKeyword("FOCUS-SPECIFIED");



    static private final SubLString $str_alt61$cb_uiat_handle_common_queries_foc = makeString("cb-uiat-handle-common-queries-focus-requested");

    static private final SubLString $$$id = makeString("id");

    static private final SubLString $$$Ask_about_a_particular_term = makeString("Ask about a particular term");

    private static final SubLSymbol $UIAT_COMMON_QUERIES_SHOW_ALL = makeKeyword("UIAT-COMMON-QUERIES-SHOW-ALL");

    static private final SubLString $str_alt65$_Show_All_ = makeString("[Show All]");

    static private final SubLString $str_alt66$Show_example_queries_that_could_b = makeString("Show example queries that could be made about");

    static private final SubLString $$$phrase = makeString("phrase");

    public static final SubLInteger $int$30 = makeInteger(30);

    static private final SubLString $$$Submit = makeString("Submit");

    private static final SubLSymbol CB_UIAT_HANDLE_COMMON_QUERIES_FOCUS_REQUESTED = makeSymbol("CB-UIAT-HANDLE-COMMON-QUERIES-FOCUS-REQUESTED");

    private static final SubLSymbol $FOCUS_CLEARED = makeKeyword("FOCUS-CLEARED");

    private static final SubLSymbol CB_UIAT_HANDLE_COMMON_QUERIES_SHOW_ALL = makeSymbol("CB-UIAT-HANDLE-COMMON-QUERIES-SHOW-ALL");

    static private final SubLString $str_alt73$cb_uiat_handle_common_queries_sho = makeString("cb-uiat-handle-common-queries-show-all");

    private static final SubLSymbol CB_LINK_UIAT_COMMON_QUERIES_SHOW_ALL = makeSymbol("CB-LINK-UIAT-COMMON-QUERIES-SHOW-ALL");

    static private final SubLString $$$Query_Focus_Results = makeString("Query Focus Results");

    static private final SubLString $str_alt76$_Show_Unfocused_ = makeString("[Show Unfocused]");

    static private final SubLString $str_alt77$_Ask_about_a_different_term_ = makeString("[Ask about a different term]");

    static private final SubLString $str_alt78$Here_are_some_example_queries_rel = makeString("Here are some example queries relevant to :");

    static private final SubLString $str_alt79$No_queries_were_retrieved_ = makeString("No queries were retrieved.");

    static private final SubLString $str_alt80$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");



    static private final SubLString $str_alt82$_Relevant_Queries_for_This_Term_ = makeString("[Relevant Queries for This Term]");

    static private final SubLString $str_alt83$cb_uia_common_queries_focus_term = makeString("cb-uia-common-queries-focus-term");

    private static final SubLSymbol $UIAT_COMMON_QUERIES_FOCUS_TERM = makeKeyword("UIAT-COMMON-QUERIES-FOCUS-TERM");

    private static final SubLSymbol CB_LINK_UIAT_COMMON_QUERIES_FOCUS_TERM = makeSymbol("CB-LINK-UIAT-COMMON-QUERIES-FOCUS-TERM");

    static private final SubLList $list_alt86 = list(makeSymbol("TERM"));

    private static final SubLSymbol CB_UIA_COMMON_QUERIES_FOCUS_TERM = makeSymbol("CB-UIA-COMMON-QUERIES-FOCUS-TERM");

    private static final SubLSymbol CB_UIAT_COMMON_QUERIES_LAUNCH = makeSymbol("CB-UIAT-COMMON-QUERIES-LAUNCH");

    static private final SubLString $str_alt89$cb_uiat_common_queries_launch = makeString("cb-uiat-common-queries-launch");

    private static final SubLSymbol $UIA_COMMON_QUERIES_LAUNCH = makeKeyword("UIA-COMMON-QUERIES-LAUNCH");

    private static final SubLSymbol CB_LINK_UIA_COMMON_QUERIES_LAUNCH = makeSymbol("CB-LINK-UIA-COMMON-QUERIES-LAUNCH");

    private static final SubLSymbol $SOLUTION_FINDER = makeKeyword("SOLUTION-FINDER");

    static private final SubLList $list_alt93 = list(new SubLObject[]{ $NAME, makeString("Solution Finder"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-SOLUTION-FINDER-HINT"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-SOLUTION-FINDER-CHILD-COMPLETED"), makeKeyword("CHILD-REJECTED-METHOD"), makeSymbol("UIAT-SOLUTION-FINDER-CHILD-REJECTED"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycSolutionFinder")) });

    static private final SubLList $list_alt94 = list(makeKeyword("DISPLAY-METHOD"), makeSymbol("CB-UIAT-SOLUTION-FINDER-DISPLAY"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycSolutionFinder")));

    static private final SubLString $str_alt95$Answer____A = makeString("Answer : ~A");

    private static final SubLSymbol $QC_QUERY = makeKeyword("QC-QUERY");

    private static final SubLSymbol $SF_ACT = makeKeyword("SF-ACT");

    private static final SubLSymbol $PERFORM_ASK = makeKeyword("PERFORM-ASK");

    private static final SubLSymbol $SF_CYCL = makeKeyword("SF-CYCL");

    private static final SubLSymbol $SF_STATE = makeKeyword("SF-STATE");

    private static final SubLSymbol $EDIT_QUERY = makeKeyword("EDIT-QUERY");



    static private final SubLList $list_alt103 = list(makeSymbol("BACKCHAIN"), makeSymbol("NUMBER"), makeSymbol("TIME"), makeSymbol("DEPTH"));

    public static final SubLSymbol $uiat_sf_default_backchain$ = makeSymbol("*UIAT-SF-DEFAULT-BACKCHAIN*");

    public static final SubLSymbol $uiat_sf_default_number$ = makeSymbol("*UIAT-SF-DEFAULT-NUMBER*");

    public static final SubLSymbol $uiat_sf_default_time$ = makeSymbol("*UIAT-SF-DEFAULT-TIME*");

    private static final SubLSymbol $DEFAULT_SF_BACKCHAIN = makeKeyword("DEFAULT-SF-BACKCHAIN");

    private static final SubLSymbol $DEFAULT_SF_NUMBER = makeKeyword("DEFAULT-SF-NUMBER");

    private static final SubLSymbol $DEFAULT_SF_TIME = makeKeyword("DEFAULT-SF-TIME");

    static private final SubLString $str_alt110$cb_uiat_solution_finder_cycl = makeString("cb-uiat-solution-finder-cycl");

    private static final SubLSymbol $UIAT_SOLUTION_FINDER_CYCL = makeKeyword("UIAT-SOLUTION-FINDER-CYCL");

    private static final SubLSymbol CB_LINK_UIAT_SOLUTION_FINDER_CYCL = makeSymbol("CB-LINK-UIAT-SOLUTION-FINDER-CYCL");

    static private final SubLList $list_alt113 = list(makeSymbol("CYCL-QUERY"), makeSymbol("TEXT"));

    private static final SubLSymbol CB_UIAT_SOLUTION_FINDER_CYCL = makeSymbol("CB-UIAT-SOLUTION-FINDER-CYCL");



    static private final SubLList $list_alt116 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-ASK-QUIRK-RENDER-REQUEST"));



    static private final SubLList $list_alt118 = list(makeSymbol("&KEY"), makeSymbol("ANSWERS"));

    static private final SubLList $list_alt119 = list(makeKeyword("ANSWERS"));



    static private final SubLString $str_alt121$The_corpus_contained_no_answers_t = makeString("The corpus contained no answers to the question asked.");



    static private final SubLString $str_alt123$__score___2F_ = makeString(" (score ~,2F)");



    private static final SubLSymbol JUSTIFY = makeSymbol("JUSTIFY");





    private static final SubLSymbol $UIAT_ASK_QUIRK_LEARN_FACTOID = makeKeyword("UIAT-ASK-QUIRK-LEARN-FACTOID");

    static private final SubLString $str_alt129$_Learn_this_ = makeString("[Learn this]");



    static private final SubLString $str_alt131$_Learn_this_Fact_ = makeString("[Learn this Fact]");

    static private final SubLString $str_alt132$cb_uiat_ask_quirk_learn_factoid = makeString("cb-uiat-ask-quirk-learn-factoid");

    private static final SubLSymbol CB_LINK_UIAT_ASK_QUIRK_LEARN_FACTOID = makeSymbol("CB-LINK-UIAT-ASK-QUIRK-LEARN-FACTOID");

    static private final SubLList $list_alt134 = list(makeSymbol("INTERACTION"), makeSymbol("ANSWER-OBJECT"));

    private static final SubLSymbol NATURAL_LANGUAGE_FACTOID = makeSymbol("NATURAL-LANGUAGE-FACTOID");

    private static final SubLSymbol $LEARN_FACTOID = makeKeyword("LEARN-FACTOID");

    private static final SubLSymbol $ANSWER_OBJECT = makeKeyword("ANSWER-OBJECT");



    private static final SubLSymbol CB_UIAT_ASK_QUIRK_LEARN_FACTOID = makeSymbol("CB-UIAT-ASK-QUIRK-LEARN-FACTOID");

    private static final SubLSymbol $KNOWLEDGE_JOURNAL = makeKeyword("KNOWLEDGE-JOURNAL");

    static private final SubLList $list_alt141 = list($NAME, makeString("Knowledge Journal"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycKnowledgeJournal")));

    private static final SubLSymbol CB_UIA_KNOWLEDGE_JOURNAL = makeSymbol("CB-UIA-KNOWLEDGE-JOURNAL");

    static private final SubLString $str_alt143$Nothing_has_been_done_yet_ = makeString("Nothing has been done yet.");

    static private final SubLString $str_alt144$Actions_finished___ = makeString("Actions finished : ");

    private static final SubLSymbol $UIA_KNOWLEDGE_JOURNAL = makeKeyword("UIA-KNOWLEDGE-JOURNAL");

    static private final SubLString $str_alt146$_Refresh_ = makeString("[Refresh]");

    private static final SubLSymbol $UIA_SERIALIZE_KNOWLEDGE_JOURNAL = makeKeyword("UIA-SERIALIZE-KNOWLEDGE-JOURNAL");

    static private final SubLString $str_alt148$_Save_ = makeString("[Save]");

    static private final SubLString $$$Action = makeString("Action");

    static private final SubLString $$$Result = makeString("Result");

    static private final SubLString $$$Start_time = makeString("Start time");

    static private final SubLString $$$Finish_time = makeString("Finish time");





    static private final SubLString $$$Rejected = makeString("Rejected");



    static private final SubLString $$$Invalidated = makeString("Invalidated");



    static private final SubLString $str_alt159$__ = makeString("~%");

    static private final SubLString $str_alt160$___ = makeString("...");

    static private final SubLString $str_alt161$cb_uia_serialize_knowledge_journa = makeString("cb-uia-serialize-knowledge-journal");

    private static final SubLSymbol CB_LINK_UIA_SERIALIZE_KNOWLEDGE_JOURNAL = makeSymbol("CB-LINK-UIA-SERIALIZE-KNOWLEDGE-JOURNAL");

    static private final SubLString $str_alt163$_Journal_ = makeString("[Journal]");

    static private final SubLString $str_alt164$cb_uia_knowledge_journal = makeString("cb-uia-knowledge-journal");

    private static final SubLSymbol CB_LINK_UIA_KNOWLEDGE_JOURNAL = makeSymbol("CB-LINK-UIA-KNOWLEDGE-JOURNAL");

    private static final SubLSymbol $INFORM = makeKeyword("INFORM");

    private static final SubLSymbol CB_UIA_SERIALIZE_KNOWLEDGE_JOURNAL = makeSymbol("CB-UIA-SERIALIZE-KNOWLEDGE-JOURNAL");

    private static final SubLSymbol $KNOWLEDGE_REVIEWER = makeKeyword("KNOWLEDGE-REVIEWER");

    static private final SubLList $list_alt169 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-KNOWLEDGE-REVIEWER-RENDER-REQUEST"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycKnowledgeReviewer")));

    private static final SubLSymbol CB_UIA_SHOW_KNOWLEDGE_REVIEWER = makeSymbol("CB-UIA-SHOW-KNOWLEDGE-REVIEWER");

    static private final SubLString $str_alt171$cb_uia_show_knowledge_reviewer = makeString("cb-uia-show-knowledge-reviewer");

    private static final SubLSymbol $UIA_SEPARATE_KNOWLEDGE_REVIEWER = makeKeyword("UIA-SEPARATE-KNOWLEDGE-REVIEWER");

    private static final SubLSymbol CB_LINK_UIA_SEPARATE_KNOWLEDGE_REVIEWER = makeSymbol("CB-LINK-UIA-SEPARATE-KNOWLEDGE-REVIEWER");

    static private final SubLList $list_alt174 = list(makeSymbol("&KEY"), makeSymbol("CONTENTS"), makeSymbol("MISC-CONTENTS"), makeSymbol("HELP-TEXT"));

    static private final SubLList $list_alt175 = list(makeKeyword("CONTENTS"), makeKeyword("MISC-CONTENTS"), makeKeyword("HELP-TEXT"));



    private static final SubLSymbol $MISC_CONTENTS = makeKeyword("MISC-CONTENTS");

    private static final SubLSymbol $HELP_TEXT = makeKeyword("HELP-TEXT");

    private static final SubLSymbol $FRAMELESS = makeKeyword("FRAMELESS");

    static private final SubLString $$$Knowledge_created_so_far = makeString("Knowledge created so far");

    static private final SubLString $str_alt181$ = makeString("");

    static private final SubLSymbol $sym182$UIA_KNOWLEDGE_REVIEWER_NEED_REFRESH_FROM_GLOBAL_INFO_ = makeSymbol("UIA-KNOWLEDGE-REVIEWER-NEED-REFRESH-FROM-GLOBAL-INFO?");

    public static final SubLInteger $int$15000 = makeInteger(15000);

    private static final SubLSymbol $SENTENCE_COUNT = makeKeyword("SENTENCE-COUNT");

    static private final SubLString $str_alt185$95_ = makeString("95%");

    static private final SubLString $str_alt186$new_knowledge_ = makeString("new_knowledge_");

    static private final SubLString $str_alt187$text_css = makeString("text/css");

    static private final SubLString $$$screen = makeString("screen");

    static private final SubLString $$$none = makeString("none");



    static private final SubLString $str_alt191$10_ = makeString("10%");

    private static final SubLSymbol $UIA_CONCEPT_KILLER = makeKeyword("UIA-CONCEPT-KILLER");

    static private final SubLString $str_alt193$_Forget_ = makeString("[Forget]");

    static private final SubLString $str_alt194$15_ = makeString("15%");

    static private final SubLString $str_alt195$_Interview_ = makeString("[Interview]");

    private static final SubLSymbol $UIA_SALIENT_DESCRIPTOR_REQUIRED = makeKeyword("UIA-SALIENT-DESCRIPTOR-REQUIRED");

    static private final SubLString $str_alt197$20_ = makeString("20%");

    static private final SubLString $$$No_Known_Facts = makeString("No Known Facts");









    static private final SubLString $str_alt203$100_ = makeString("100%");

    static private final SubLString $str_alt204$_ = makeString("_");

    static private final SubLString $$$New_Terms_Introduced = makeString("New Terms Introduced");

    static private final SubLString $str_alt206$No_terms_introduced_so_far_ = makeString("No terms introduced so far.");

    static private final SubLString $$$New_Things_Said = makeString("New Things Said");

    static private final SubLString $str_alt208$Nothing_said_so_far_ = makeString("Nothing said so far.");





    private static final SubLSymbol $UIAT_KREVIEW_REFRESH = makeKeyword("UIAT-KREVIEW-REFRESH");

    private static final SubLSymbol $UIAT_KREVIEW_SAVE = makeKeyword("UIAT-KREVIEW-SAVE");

    private static final SubLSymbol $UIA_NEXT_INTERACTION = makeKeyword("UIA-NEXT-INTERACTION");

    private static final SubLSymbol $UIAT_KREVIEW_GET_REVIEWED = makeKeyword("UIAT-KREVIEW-GET-REVIEWED");

    static private final SubLString $str_alt215$_Submit_for_Review_ = makeString("[Submit for Review]");

    private static final SubLSymbol $UIA_LEX_KNOWLEDGE_REVIEWER_LAUNCH = makeKeyword("UIA-LEX-KNOWLEDGE-REVIEWER-LAUNCH");

    static private final SubLString $str_alt217$_Lexical_Knowledge_ = makeString("[Lexical Knowledge]");

    static private final SubLString $str_alt218$cb_uiat_kreview_save = makeString("cb-uiat-kreview-save");

    private static final SubLSymbol CB_LINK_UIAT_KREVIEW_SAVE = makeSymbol("CB-LINK-UIAT-KREVIEW-SAVE");

    static private final SubLList $list_alt220 = list(makeSymbol("UI-ID"));



    private static final SubLSymbol CB_UIAT_KREVIEW_SAVE = makeSymbol("CB-UIAT-KREVIEW-SAVE");

    static private final SubLString $str_alt223$cb_uiat_kreview_refresh = makeString("cb-uiat-kreview-refresh");

    private static final SubLSymbol CB_LINK_UIAT_KREVIEW_REFRESH = makeSymbol("CB-LINK-UIAT-KREVIEW-REFRESH");



    private static final SubLSymbol CB_UIAT_KREVIEW_REFRESH = makeSymbol("CB-UIAT-KREVIEW-REFRESH");

    static private final SubLString $str_alt227$_Get_Reviewed_ = makeString("[Get Reviewed]");

    static private final SubLString $str_alt228$cb_uiat_kreview_get_reviewed = makeString("cb-uiat-kreview-get-reviewed");

    private static final SubLSymbol CB_LINK_UIAT_KREVIEW_GET_REVIEWED = makeSymbol("CB-LINK-UIAT-KREVIEW-GET-REVIEWED");

    private static final SubLSymbol $GET_REVIEWED = makeKeyword("GET-REVIEWED");

    private static final SubLSymbol CB_UIAT_KREVIEW_GET_REVIEWED = makeSymbol("CB-UIAT-KREVIEW-GET-REVIEWED");

    static private final SubLString $str_alt232$cb_uiat_lex_knowledge_reviewer_la = makeString("cb-uiat-lex-knowledge-reviewer-launch");

    private static final SubLSymbol CB_LINK_UIA_LEX_KNOWLEDGE_REVIEWER_LAUNCH = makeSymbol("CB-LINK-UIA-LEX-KNOWLEDGE-REVIEWER-LAUNCH");

    private static final SubLSymbol CB_UIAT_LEX_KNOWLEDGE_REVIEWER_LAUNCH = makeSymbol("CB-UIAT-LEX-KNOWLEDGE-REVIEWER-LAUNCH");

    private static final SubLSymbol $LEX_KNOWLEDGE_REVIEWER = makeKeyword("LEX-KNOWLEDGE-REVIEWER");

    static private final SubLList $list_alt236 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-LEX-KNOWLEDGE-REVIEWER-RENDER-REQUEST"));

    static private final SubLList $list_alt237 = list(makeSymbol("&KEY"), makeSymbol("TERMS"), makeSymbol("LEX-LEXICAL-CONTENTS"), makeSymbol("LEX-GENERATION-CONTENTS"), makeSymbol("LEX-PARSING-CONTENTS"));

    static private final SubLList $list_alt238 = list(makeKeyword("TERMS"), makeKeyword("LEX-LEXICAL-CONTENTS"), makeKeyword("LEX-GENERATION-CONTENTS"), makeKeyword("LEX-PARSING-CONTENTS"));



    private static final SubLSymbol $LEX_LEXICAL_CONTENTS = makeKeyword("LEX-LEXICAL-CONTENTS");

    private static final SubLSymbol $LEX_GENERATION_CONTENTS = makeKeyword("LEX-GENERATION-CONTENTS");

    private static final SubLSymbol $LEX_PARSING_CONTENTS = makeKeyword("LEX-PARSING-CONTENTS");

    static private final SubLString $$$Lexical_Mappings_Added = makeString("Lexical Mappings Added");

    static private final SubLString $$$Generation_Info_Added = makeString("Generation Info Added");

    static private final SubLString $$$Parsing_Info_Added = makeString("Parsing Info Added");

    static private final SubLString $$$Lexical_Knowledge_created_so_far = makeString("Lexical Knowledge created so far");

    static private final SubLString $$$New_Phrasing_Added = makeString("New Phrasing Added");



    static private final SubLString $str_alt249$Nothing_so_far_ = makeString("Nothing so far.");

    static private final SubLString $str_alt250$___S = makeString(": ~S");





    private static final SubLSymbol $UIA_KNOWLEDGE_REVIEWER_LAUNCH = makeKeyword("UIA-KNOWLEDGE-REVIEWER-LAUNCH");

    static private final SubLString $str_alt254$_General_Knowledge_ = makeString("[General Knowledge]");

    static private final SubLString $str_alt255$cb_uiat_knowledge_reviewer_launch = makeString("cb-uiat-knowledge-reviewer-launch");

    private static final SubLSymbol CB_LINK_UIA_KNOWLEDGE_REVIEWER_LAUNCH = makeSymbol("CB-LINK-UIA-KNOWLEDGE-REVIEWER-LAUNCH");

    private static final SubLSymbol CB_UIAT_KNOWLEDGE_REVIEWER_LAUNCH = makeSymbol("CB-UIAT-KNOWLEDGE-REVIEWER-LAUNCH");

    private static final SubLSymbol $TEST_SUITE_TOOL = makeKeyword("TEST-SUITE-TOOL");

    static private final SubLList $list_alt259 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIA-TEST-SUITE-TOOL-RENDER-REQUEST"));

    private static final SubLSymbol $CHOOSE_TEST_SUITE = makeKeyword("CHOOSE-TEST-SUITE");

    static private final SubLList $list_alt261 = list(makeSymbol("&KEY"), makeSymbol("TEST-SUITE-NAMES"));

    static private final SubLList $list_alt262 = list(makeKeyword("TEST-SUITE-NAMES"));

    private static final SubLSymbol $TEST_SUITE_NAMES = makeKeyword("TEST-SUITE-NAMES");

    private static final SubLSymbol $SHOW_ALL_QUERY_RESULTS = makeKeyword("SHOW-ALL-QUERY-RESULTS");

    static private final SubLList $list_alt265 = list(makeSymbol("&KEY"), makeSymbol("TEST-SUITE"), makeSymbol("RESULTS"));

    static private final SubLList $list_alt266 = list(makeKeyword("TEST-SUITE"), makeKeyword("RESULTS"));

    private static final SubLSymbol $TEST_SUITE = makeKeyword("TEST-SUITE");



    private static final SubLSymbol $SHOW_TEST_RESULT = makeKeyword("SHOW-TEST-RESULT");

    static private final SubLList $list_alt270 = list(makeSymbol("&KEY"), makeSymbol("QUERY-RESULT"), makeSymbol("QUERY"));

    static private final SubLList $list_alt271 = list(makeKeyword("QUERY-RESULT"), makeKeyword("QUERY"));

    private static final SubLSymbol $QUERY_RESULT = makeKeyword("QUERY-RESULT");

    private static final SubLSymbol $SHOW_TEST_SUITE = makeKeyword("SHOW-TEST-SUITE");

    static private final SubLList $list_alt274 = list(makeSymbol("&KEY"), makeSymbol("TEST-SUITE"));

    static private final SubLList $list_alt275 = list(makeKeyword("TEST-SUITE"));

    static private final SubLString $str_alt276$Unknown_action_type___A = makeString("Unknown action type! ~A");

    static private final SubLString $str_alt277$cb_uia_test_suite_tool_choose_tes = makeString("cb-uia-test-suite-tool-choose-test-suite");

    static private final SubLString $str_alt278$Please__select_a_test_suite__ = makeString("Please, select a test suite: ");

    static private final SubLString $str_alt279$Could_not_find_any_available_test = makeString("Could not find any available test suites.");

    static private final SubLString $str_alt280$TEST_SUITE_NAME = makeString("TEST_SUITE_NAME");

    static private final SubLString $str_alt281$Start_New_Test_Suite____ = makeString("Start New Test Suite ...");

    static private final SubLString $str_alt282$_ = makeString(" ");

    static private final SubLString $$$Select = makeString("Select");



    private static final SubLSymbol $SET_TEST_SUITE_NAME = makeKeyword("SET-TEST-SUITE-NAME");

    private static final SubLSymbol $TEST_SUITE_NAME = makeKeyword("TEST-SUITE-NAME");

    private static final SubLSymbol CB_UIA_TEST_SUITE_TOOL_CHOOSE_TEST_SUITE = makeSymbol("CB-UIA-TEST-SUITE-TOOL-CHOOSE-TEST-SUITE");

    static private final SubLString $str_alt288$cb_uia_test_suite_tool_run_query = makeString("cb-uia-test-suite-tool-run-query");

    static private final SubLString $str_alt289$_Run_ = makeString("[Run]");

    private static final SubLSymbol $UIA_TEST_SUITE_TOOL_RUN_QUERY = makeKeyword("UIA-TEST-SUITE-TOOL-RUN-QUERY");

    private static final SubLSymbol CB_LINK_UIA_TEST_SUITE_TOOL_RUN_QUERY = makeSymbol("CB-LINK-UIA-TEST-SUITE-TOOL-RUN-QUERY");

    static private final SubLString $str_alt292$cb_uia_test_suite_tool_run_all_qu = makeString("cb-uia-test-suite-tool-run-all-queries");

    static private final SubLString $str_alt293$_Run_all_test_queries_ = makeString("[Run all test queries]");

    private static final SubLSymbol $UIA_TEST_SUITE_TOOL_RUN_ALL_QUERIES = makeKeyword("UIA-TEST-SUITE-TOOL-RUN-ALL-QUERIES");

    private static final SubLSymbol CB_LINK_UIA_TEST_SUITE_TOOL_RUN_ALL_QUERIES = makeSymbol("CB-LINK-UIA-TEST-SUITE-TOOL-RUN-ALL-QUERIES");

    static private final SubLString $str_alt296$_View_Test_Queries_ = makeString("[View Test Queries]");



    static private final SubLString $str_alt298$Query_Result__ = makeString("Query Result: ");





    static private final SubLString $str_alt301$Error__ = makeString("Error: ");

    static private final SubLString $str_alt302$No_solutions_found_for_this_query = makeString("No solutions found for this query.");



    private static final SubLSymbol $UIA_TEST_SUITE_JUSTIFY_QUERY = makeKeyword("UIA-TEST-SUITE-JUSTIFY-QUERY");

    private static final SubLSymbol $UIA_TEST_SUITE_DISPLAY_HALO_FORMAT = makeKeyword("UIA-TEST-SUITE-DISPLAY-HALO-FORMAT");

    private static final SubLSymbol $TEST_COA = makeKeyword("TEST-COA");

    private static final SubLSymbol $TEST_COA_MT = makeKeyword("TEST-COA-MT");

    static private final SubLSymbol $sym308$_COA = makeSymbol("?COA");

    static private final SubLList $list_alt309 = list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?COA"), constant_handles.reader_make_constant_shell(makeString("CourseOfAction")));

    static private final SubLSymbol $sym310$_COAMT = makeSymbol("?COAMT");

    static private final SubLList $list_alt311 = list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?COAMT"), constant_handles.reader_make_constant_shell(makeString("COASpecificationMicrotheory")));

    static private final SubLString $str_alt312$COA__ = makeString("COA: ");

    static private final SubLString $$$COA = makeString("COA");

    static private final SubLString $str_alt314$COA_Microtheory__ = makeString("COA Microtheory: ");

    static private final SubLString $$$COAMT = makeString("COAMT");

    static private final SubLString $str_alt316$Test_Suite__ = makeString("Test Suite: ");

    static private final SubLString $$$Run = makeString("Run");

    static private final SubLString $$$Run_All_Queries = makeString("Run All Queries");

    static private final SubLString $str_alt319$90_ = makeString("90%");

    static private final SubLString $str_alt320$_Finished_with_testing_ = makeString("[Finished with testing]");

    static private final SubLString $str_alt321$No_formula__ID__ = makeString("No formula. ID: ");

    public static final SubLSymbol $replacement_coa_term$ = makeSymbol("*REPLACEMENT-COA-TERM*");

    static private final SubLList $list_alt323 = list(constant_handles.reader_make_constant_shell(makeString("The")), constant_handles.reader_make_constant_shell(makeString("CourseOfAction")));

    public static final SubLSymbol $replacement_coa_mt_term$ = makeSymbol("*REPLACEMENT-COA-MT-TERM*");

    static private final SubLList $list_alt325 = list(constant_handles.reader_make_constant_shell(makeString("The")), constant_handles.reader_make_constant_shell(makeString("COASpecificationMicrotheory")));

    private static final SubLSymbol $RUN_TEST_SUITE_TOOL_QUERY = makeKeyword("RUN-TEST-SUITE-TOOL-QUERY");

    private static final SubLSymbol CB_UIA_TEST_SUITE_TOOL_RUN_QUERY = makeSymbol("CB-UIA-TEST-SUITE-TOOL-RUN-QUERY");

    private static final SubLSymbol $RUN_TEST_SUITE_TOOL_ALL_QUERIES = makeKeyword("RUN-TEST-SUITE-TOOL-ALL-QUERIES");

    static private final SubLString $str_alt329$cb_uia_test_suite_justify_query = makeString("cb-uia-test-suite-justify-query");

    static private final SubLString $str_alt330$_D = makeString("~D");

    private static final SubLSymbol CB_LINK_UIA_TEST_SUITE_JUSTIFY_QUERY = makeSymbol("CB-LINK-UIA-TEST-SUITE-JUSTIFY-QUERY");

    static private final SubLList $list_alt332 = list(makeSymbol("UI-ID"), makeSymbol("QUERY-ID"), makeSymbol("ANSWER-ID"));

    static private final SubLString $str_alt333$Stale_query_information_ = makeString("Stale query information.");

    private static final SubLSymbol $UIA_TEST_SUITE_REDISPLAY_RESULT = makeKeyword("UIA-TEST-SUITE-REDISPLAY-RESULT");

    static private final SubLString $str_alt335$_Back_to_Test_Result_ = makeString("[Back to Test Result]");

    private static final SubLSymbol CB_UIA_TEST_SUITE_JUSTIFY_QUERY = makeSymbol("CB-UIA-TEST-SUITE-JUSTIFY-QUERY");

    static private final SubLString $str_alt337$cb_uia_test_suite_redisplay_resul = makeString("cb-uia-test-suite-redisplay-result");

    private static final SubLSymbol CB_LINK_UIA_TEST_SUITE_REDISPLAY_RESULT = makeSymbol("CB-LINK-UIA-TEST-SUITE-REDISPLAY-RESULT");

    static private final SubLList $list_alt339 = list(makeSymbol("INTERACTION"), makeSymbol("QUERY-ID"));

    private static final SubLSymbol $REDISPLAY_RESULT = makeKeyword("REDISPLAY-RESULT");

    private static final SubLSymbol CB_UIA_TEST_SUITE_REDISPLAY_RESULT = makeSymbol("CB-UIA-TEST-SUITE-REDISPLAY-RESULT");

    static private final SubLString $str_alt342$Query__ = makeString("Query: ");

    static private final SubLString $str_alt343$Bindings__ = makeString("Bindings: ");

    static private final SubLString $str_alt344$Answer_Proofs__ = makeString("Answer Proofs: ");

    static private final SubLList $list_alt345 = cons(makeSymbol("VAR"), makeSymbol("VALUE"));



    static private final SubLString $str_alt347$_HALO_Format_ = makeString("[HALO Format]");

    static private final SubLString $str_alt348$cb_uia_test_suite_display_halo_fo = makeString("cb-uia-test-suite-display-halo-format");

    private static final SubLSymbol CB_LINK_UIA_TEST_SUITE_DISPLAY_HALO_FORMAT = makeSymbol("CB-LINK-UIA-TEST-SUITE-DISPLAY-HALO-FORMAT");

    static private final SubLList $list_alt350 = list(makeSymbol("INTERACTION"), makeSymbol("QUERY"), makeSymbol("QUERY-RESULT"));

    private static final SubLSymbol CB_UIA_TEST_SUITE_DISPLAY_HALO_FORMAT = makeSymbol("CB-UIA-TEST-SUITE-DISPLAY-HALO-FORMAT");

    static private final SubLString $str_alt352$98_ = makeString("98%");

    static private final SubLString $str_alt353$Query_ = makeString("Query:");

    static private final SubLString $str_alt354$Query_generation_ = makeString("Query generation:");

    static private final SubLString $str_alt355$Query_formula_ = makeString("Query formula:");

    static private final SubLString $str_alt356$Results_ = makeString("Results:");



    static private final SubLString $str_alt358$Results_CycL_ = makeString("Results CycL:");



    static private final SubLString $str_alt360$Justification__A_ = makeString("Justification ~A:");

    static private final SubLString $str_alt361$_Dj_D = makeString("~Dj~D");

    static private final SubLList $list_alt362 = list(makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));

    static private final SubLString $str_alt363$ID__ = makeString("ID: ");

    static private final SubLString $str_alt364$_A = makeString("~A");

    static private final SubLString $str_alt365$Context__ = makeString("Context: ");



    static private final SubLString $$$current = makeString("current");

    static private final SubLString $str_alt368$Settings__ = makeString("Settings: ");

    static private final SubLString $str_alt369$Solutions__ = makeString("Solutions: ");

    static private final SubLString $$$all = makeString("all");

    static private final SubLString $str_alt371$Time_spent__ = makeString("Time spent: ");

    static private final SubLString $str_alt372$_D_secs = makeString("~D secs");

    static private final SubLString $$$as_long_as_it_takes = makeString("as long as it takes");

    static private final SubLString $str_alt374$Effort__ = makeString("Effort: ");

    static private final SubLString $str_alt375$cb_uiat_add_untried_query_to_tsui = makeString("cb-uiat-add-untried-query-to-tsuite");

    private static final SubLSymbol $UIAT_ADD_UNTRIED_QUERY_TO_TSUITE = makeKeyword("UIAT-ADD-UNTRIED-QUERY-TO-TSUITE");

    private static final SubLSymbol CB_LINK_UIAT_ADD_UNTRIED_QUERY_TO_TSUITE = makeSymbol("CB-LINK-UIAT-ADD-UNTRIED-QUERY-TO-TSUITE");

    private static final SubLSymbol CB_UIAT_ADD_UNTRIED_QUERY_TO_TSUITE = makeSymbol("CB-UIAT-ADD-UNTRIED-QUERY-TO-TSUITE");

    // // Initializers
    public void declareFunctions() {
        declare_cb_uia_tools_review_and_testing_file();
    }

    public void initializeVariables() {
        init_cb_uia_tools_review_and_testing_file();
    }

    public void runTopLevelForms() {
        setup_cb_uia_tools_review_and_testing_file();
    }
}

