/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$most_negative_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$most_positive_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.minus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.parse_integer;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

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
 *  module:      CB-UIA-TOOLS-WIZARDS
 *  source file: /cyc/top/cycl/cb-uia-tools-wizards.lisp
 *  created:     2019/07/03 17:38:10
 */
public final class cb_uia_tools_wizards extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_uia_tools_wizards() {
    }

    public static final SubLFile me = new cb_uia_tools_wizards();

    public static final String myName = "com.cyc.cycjava.cycl.cb_uia_tools_wizards";

    // // Definitions
    public static final SubLObject cb_uiat_scenario_constructor_render_request(SubLObject request) {
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
                            SubLObject ignore_tail = property_list_member($IGNORE, current_2);
                            SubLObject ignore = (NIL != ignore_tail) ? ((SubLObject) (cadr(ignore_tail))) : NIL;
                            return cb_uiat_sc_show(interaction);
                        }
                    }
                } else
                    if (pcase_var.eql($ADJUST_SENTENCE)) {
                        {
                            SubLObject datum_4 = plist;
                            SubLObject current_5 = datum_4;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current_5;
                            SubLObject bad = NIL;
                            SubLObject current_6 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum_4, $list_alt9);
                                current_6 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum_4, $list_alt9);
                                if (NIL == member(current_6, $list_alt10, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_6 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum_4, $list_alt9);
                            }
                            {
                                SubLObject sentence_tail = property_list_member($SENTENCE, current_5);
                                SubLObject sentence = (NIL != sentence_tail) ? ((SubLObject) (cadr(sentence_tail))) : NIL;
                                SubLObject extension_tail = property_list_member($EXTENSION, current_5);
                                SubLObject extension = (NIL != extension_tail) ? ((SubLObject) (cadr(extension_tail))) : NIL;
                                return cb_uiat_sc_adjust_sentence(interaction, sentence, extension);
                            }
                        }
                    }

            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_sc_show(SubLObject interaction) {
        {
            SubLObject sc_state = user_interaction_agenda.ui_state_lookup(interaction, $SC_STATE, UNPROVIDED);
            SubLObject pcase_var = rkf_scenario_constructor.sc_state_current_act(sc_state);
            if (pcase_var.eql($CONSTRUCT)) {
                return cb_scenario_constructor.cb_sc_elaborate_guts(sc_state);
            } else
                if (pcase_var.eql($OPEN)) {
                    return cb_scenario_constructor.cb_sc_open_scenarios_guts(sc_state);
                } else
                    if (pcase_var.eql($MERGE)) {
                        return cb_scenario_constructor.cb_sc_merge_get_one_alignment(sc_state, $TO);
                    } else {
                        cb_scenario_constructor.cb_sc_elaborate_guts(sc_state);
                    }


        }
        return NIL;
    }

    public static final SubLObject cb_uiat_sc_adjust_sentence(SubLObject interaction, SubLObject sentence, SubLObject extension) {
        {
            SubLObject sc_state = user_interaction_agenda.ui_state_lookup(interaction, $SC_STATE, UNPROVIDED);
            cb_scenario_constructor.cb_sc_adjust_cycl_sentence(sc_state, sentence, extension);
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_choose_best_interpretation(SubLObject v_agenda, SubLObject interaction, SubLObject sentence, SubLObject cycl_sentences) {
        {
            SubLObject sc_state = user_interaction_agenda.ui_state_lookup(interaction, $SC_STATE, UNPROVIDED);
            SubLObject v_scenario = user_interaction_agenda.ui_state_lookup(interaction, $RC_SCENARIO, UNPROVIDED);
            SubLObject clarify_links = user_interaction_agenda.ui_state_lookup(interaction, $CLARIFY_LINKS, $TRUE);
            if (NIL == v_scenario) {
                if (NIL != sc_state) {
                    {
                        SubLObject session = rkf_scenario_constructor.sc_state_active_session(sc_state);
                        v_scenario = rkf_scenario_constructor.sc_session_scenario(session);
                    }
                }
            }
            if (NIL != v_scenario) {
                {
                    SubLObject indexical_table = rkf_scenario_manipulator.sm_act_construct_indexical_table(v_scenario);
                    SubLObject child = uia_tools_basic.uia_act_new_disambiguate_phrase(v_agenda, $REQUIRED, sentence, cycl_sentences, clarify_links, NIL, $INDISTINGUISHED, NIL, indexical_table, UNPROVIDED);
                    user_interaction_agenda.ui_state_update(child, $CONSTRAINT, T);
                    user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                }
            } else {
                user_interaction_agenda.ui_state_update(interaction, $THEN_CYCL_SENTENCE, cycl_sentences.first());
            }
        }
        return v_agenda;
    }

    public static final SubLObject cb_uiat_process_descriptor_render_request(SubLObject request) {
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
                if (pcase_var.eql($SHOW_EVENTS)) {
                    {
                        SubLObject datum_7 = plist;
                        SubLObject current_8 = datum_7;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_8;
                        SubLObject bad = NIL;
                        SubLObject current_9 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_7, $list_alt28);
                            current_9 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_7, $list_alt28);
                            if (NIL == member(current_9, $list_alt29, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_9 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_7, $list_alt28);
                        }
                        {
                            SubLObject procname_tail = property_list_member($PROCNAME, current_8);
                            SubLObject procname = (NIL != procname_tail) ? ((SubLObject) (cadr(procname_tail))) : NIL;
                            SubLObject parents_tail = property_list_member($PARENTS, current_8);
                            SubLObject parents = (NIL != parents_tail) ? ((SubLObject) (cadr(parents_tail))) : NIL;
                            SubLObject current_tail = property_list_member($CURRENT, current_8);
                            SubLObject current_10 = (NIL != current_tail) ? ((SubLObject) (cadr(current_tail))) : NIL;
                            SubLObject children_tail = property_list_member($CHILDREN, current_8);
                            SubLObject children = (NIL != children_tail) ? ((SubLObject) (cadr(children_tail))) : NIL;
                            SubLObject chosen_tail = property_list_member($CHOSEN, current_8);
                            SubLObject chosen = (NIL != chosen_tail) ? ((SubLObject) (cadr(chosen_tail))) : NIL;
                            cb_uiat_procdesc_render_show_events(interaction, procname, parents, current_10, children, chosen);
                        }
                    }
                } else
                    if (pcase_var.eql($SHOW_ROLES)) {
                        {
                            SubLObject datum_11 = plist;
                            SubLObject current_12 = datum_11;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current_12;
                            SubLObject bad = NIL;
                            SubLObject current_13 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum_11, $list_alt36);
                                current_13 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum_11, $list_alt36);
                                if (NIL == member(current_13, $list_alt37, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_13 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum_11, $list_alt36);
                            }
                            {
                                SubLObject procname_tail = property_list_member($PROCNAME, current_12);
                                SubLObject procname = (NIL != procname_tail) ? ((SubLObject) (cadr(procname_tail))) : NIL;
                                SubLObject roles_tail = property_list_member($ROLES, current_12);
                                SubLObject roles = (NIL != roles_tail) ? ((SubLObject) (cadr(roles_tail))) : NIL;
                                SubLObject role_examples_tail = property_list_member($ROLE_EXAMPLES, current_12);
                                SubLObject role_examples = (NIL != role_examples_tail) ? ((SubLObject) (cadr(role_examples_tail))) : NIL;
                                SubLObject roles_graph_tail = property_list_member($ROLES_GRAPH, current_12);
                                SubLObject roles_graph = (NIL != roles_graph_tail) ? ((SubLObject) (cadr(roles_graph_tail))) : NIL;
                                SubLObject previous_roles_tail = property_list_member($PREVIOUS_ROLES, current_12);
                                SubLObject previous_roles = (NIL != previous_roles_tail) ? ((SubLObject) (cadr(previous_roles_tail))) : NIL;
                                cb_uiat_procdesc_render_show_roles(interaction, procname, roles, role_examples, roles_graph, previous_roles);
                            }
                        }
                    } else
                        if (pcase_var.eql($BAD_ROLES)) {
                            {
                                SubLObject datum_14 = plist;
                                SubLObject current_15 = datum_14;
                                SubLObject allow_other_keys_p = NIL;
                                SubLObject rest = current_15;
                                SubLObject bad = NIL;
                                SubLObject current_16 = NIL;
                                for (; NIL != rest;) {
                                    destructuring_bind_must_consp(rest, datum_14, $list_alt43);
                                    current_16 = rest.first();
                                    rest = rest.rest();
                                    destructuring_bind_must_consp(rest, datum_14, $list_alt43);
                                    if (NIL == member(current_16, $list_alt44, UNPROVIDED, UNPROVIDED)) {
                                        bad = T;
                                    }
                                    if (current_16 == $ALLOW_OTHER_KEYS) {
                                        allow_other_keys_p = rest.first();
                                    }
                                    rest = rest.rest();
                                }
                                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                    cdestructuring_bind_error(datum_14, $list_alt43);
                                }
                                {
                                    SubLObject procname_tail = property_list_member($PROCNAME, current_15);
                                    SubLObject procname = (NIL != procname_tail) ? ((SubLObject) (cadr(procname_tail))) : NIL;
                                    SubLObject bad_roles_tail = property_list_member($BAD_ROLES, current_15);
                                    SubLObject bad_roles = (NIL != bad_roles_tail) ? ((SubLObject) (cadr(bad_roles_tail))) : NIL;
                                    cb_uiat_procdesc_render_bad_roles(interaction, procname, bad_roles);
                                }
                            }
                        } else
                            if (pcase_var.eql($FETCH_SUBSCENES)) {
                                {
                                    SubLObject datum_17 = plist;
                                    SubLObject current_18 = datum_17;
                                    SubLObject allow_other_keys_p = NIL;
                                    SubLObject rest = current_18;
                                    SubLObject bad = NIL;
                                    SubLObject current_19 = NIL;
                                    for (; NIL != rest;) {
                                        destructuring_bind_must_consp(rest, datum_17, $list_alt46);
                                        current_19 = rest.first();
                                        rest = rest.rest();
                                        destructuring_bind_must_consp(rest, datum_17, $list_alt46);
                                        if (NIL == member(current_19, $list_alt47, UNPROVIDED, UNPROVIDED)) {
                                            bad = T;
                                        }
                                        if (current_19 == $ALLOW_OTHER_KEYS) {
                                            allow_other_keys_p = rest.first();
                                        }
                                        rest = rest.rest();
                                    }
                                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                        cdestructuring_bind_error(datum_17, $list_alt46);
                                    }
                                    {
                                        SubLObject procname_tail = property_list_member($PROCNAME, current_18);
                                        SubLObject procname = (NIL != procname_tail) ? ((SubLObject) (cadr(procname_tail))) : NIL;
                                        SubLObject previous_subscenes_tail = property_list_member($PREVIOUS_SUBSCENES, current_18);
                                        SubLObject previous_subscenes = (NIL != previous_subscenes_tail) ? ((SubLObject) (cadr(previous_subscenes_tail))) : NIL;
                                        cb_uiat_procdesc_render_fetch_subscenes(interaction, procname, previous_subscenes, TEN_INTEGER);
                                    }
                                }
                            } else
                                if (pcase_var.eql($SHOW_TERM)) {
                                    {
                                        SubLObject datum_20 = plist;
                                        SubLObject current_21 = datum_20;
                                        SubLObject allow_other_keys_p = NIL;
                                        SubLObject rest = current_21;
                                        SubLObject bad = NIL;
                                        SubLObject current_22 = NIL;
                                        for (; NIL != rest;) {
                                            destructuring_bind_must_consp(rest, datum_20, $list_alt50);
                                            current_22 = rest.first();
                                            rest = rest.rest();
                                            destructuring_bind_must_consp(rest, datum_20, $list_alt50);
                                            if (NIL == member(current_22, $list_alt51, UNPROVIDED, UNPROVIDED)) {
                                                bad = T;
                                            }
                                            if (current_22 == $ALLOW_OTHER_KEYS) {
                                                allow_other_keys_p = rest.first();
                                            }
                                            rest = rest.rest();
                                        }
                                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                            cdestructuring_bind_error(datum_20, $list_alt50);
                                        }
                                        {
                                            SubLObject procname_tail = property_list_member($PROCNAME, current_21);
                                            SubLObject procname = (NIL != procname_tail) ? ((SubLObject) (cadr(procname_tail))) : NIL;
                                            SubLObject term_tail = property_list_member($TERM, current_21);
                                            SubLObject v_term = (NIL != term_tail) ? ((SubLObject) (cadr(term_tail))) : NIL;
                                            cb_uiat_procdesc_render_show_term(interaction, procname, v_term);
                                        }
                                    }
                                } else
                                    if (pcase_var.eql($SIMPLE_RENDER)) {
                                        {
                                            SubLObject datum_23 = plist;
                                            SubLObject current_24 = datum_23;
                                            SubLObject allow_other_keys_p = NIL;
                                            SubLObject rest = current_24;
                                            SubLObject bad = NIL;
                                            SubLObject current_25 = NIL;
                                            for (; NIL != rest;) {
                                                destructuring_bind_must_consp(rest, datum_23, $list_alt54);
                                                current_25 = rest.first();
                                                rest = rest.rest();
                                                destructuring_bind_must_consp(rest, datum_23, $list_alt54);
                                                if (NIL == member(current_25, $list_alt55, UNPROVIDED, UNPROVIDED)) {
                                                    bad = T;
                                                }
                                                if (current_25 == $ALLOW_OTHER_KEYS) {
                                                    allow_other_keys_p = rest.first();
                                                }
                                                rest = rest.rest();
                                            }
                                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                                cdestructuring_bind_error(datum_23, $list_alt54);
                                            }
                                            {
                                                SubLObject string_tail = property_list_member($STRING, current_24);
                                                SubLObject string = (NIL != string_tail) ? ((SubLObject) (cadr(string_tail))) : NIL;
                                                SubLObject return_tail = property_list_member($RETURN, current_24);
                                                SubLObject v_return = (NIL != return_tail) ? ((SubLObject) (cadr(return_tail))) : NIL;
                                                cb_uiat_procdesc_render_simple_render(interaction, string, v_return);
                                            }
                                        }
                                    }





            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_procdesc_render_show_events(SubLObject interaction, SubLObject procname, SubLObject parents, SubLObject current, SubLObject children, SubLObject chosen) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
            if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                html_script_utilities.html_js_focus_window();
            }
            cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
            html_utilities.html_newline(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ($str_alt58$Process_Type_Selector_for_);
            html_utilities.html_princ(procname);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_newline(TWO_INTEGER);
            html_utilities.html_princ($str_alt59$Select_the_Type_of_Process_that_d);
            html_utilities.html_newline(TWO_INTEGER);
            html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
            if (NIL != parents) {
                html_utilities.html_princ($str_alt60$Click_on_any_of_these_to_zoom_out);
                html_utilities.html_newline(UNPROVIDED);
                {
                    SubLObject index = MINUS_ONE_INTEGER;
                    html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                    {
                        SubLObject cdolist_list_var = parents;
                        SubLObject parent = NIL;
                        for (parent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parent = cdolist_list_var.first()) {
                            cb_uiat_procdesc_action_select(interaction, index, $str_alt61$_Out_);
                            html_utilities.html_indent(ONE_INTEGER);
                            cb_uia_display_primitives.cb_uia_show_term(parent, UNPROVIDED);
                            html_utilities.html_indent(THREE_INTEGER);
                            index = subtract(index, ONE_INTEGER);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                    html_utilities.html_newline(TWO_INTEGER);
                }
            }
            html_utilities.html_princ($str_alt62$Or_add_the_current_type_to_the_se);
            html_utilities.html_newline(UNPROVIDED);
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
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    cb_uiat_procdesc_action_select(interaction, ZERO_INTEGER, $str_alt64$_Select_Current_);
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
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align($CENTER));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_uia_display_primitives.cb_uia_show_term(current, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    if (NIL != chosen) {
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt65$Already_Chosen__);
                                        html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        {
                                            SubLObject cdolist_list_var = chosen;
                                            SubLObject choice = NIL;
                                            for (choice = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , choice = cdolist_list_var.first()) {
                                                cb_uia_display_primitives.cb_uia_show_term(choice, UNPROVIDED);
                                                html_utilities.html_indent(TWO_INTEGER);
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
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
                            SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    html_utilities.html_markup(html_utilities.html_align($CENTER));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        cb_uiat_procdesc_action_select(interaction, $most_negative_fixnum$.getGlobalValue(), $str_alt66$_Drop_Chosen_);
                                        html_utilities.html_indent(TWO_INTEGER);
                                        cb_uiat_procdesc_action_select(interaction, $most_positive_fixnum$.getGlobalValue(), $str_alt67$_Done_choosing_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_35, thread);
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
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            html_utilities.html_newline(TWO_INTEGER);
            if (NIL != children) {
                html_utilities.html_princ($str_alt68$Or_zoom_in_on_these_more_specific);
                html_utilities.html_newline(UNPROVIDED);
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
                    html_utilities.html_markup($str_alt69$85_);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        {
                            SubLObject list_var = NIL;
                            SubLObject child = NIL;
                            SubLObject counter = NIL;
                            for (list_var = children, child = list_var.first(), counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , child = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                cb_uiat_procdesc_action_select(interaction, add(counter, ONE_INTEGER), $str_alt70$_Zoom_);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_38 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                cb_uia_display_primitives.cb_uia_show_term(child, UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
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

    public static final SubLObject cb_link_uiat_procdesc_action_select(SubLObject interaction, SubLObject index, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction, index);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt72$cb_uiat_procdesc_select_handler, arglist);
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

    public static final SubLObject cb_uiat_procdesc_action_select(SubLObject interaction, SubLObject index, SubLObject linktext) {
        cb_utilities.cb_link($UIAT_PROCDESC_ACTION_SELECT, interaction, index, linktext, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_uiat_procdesc_select_handler(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            SubLObject index = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt75);
            interaction = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt75);
            index = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject status = (index.isZero()) ? ((SubLObject) ($SELECT)) : $ZOOM;
                    SubLObject reply = NIL;
                    if (index.numE($most_positive_fixnum$.getGlobalValue())) {
                        status = $DONE;
                    } else
                        if (index.numE($most_negative_fixnum$.getGlobalValue())) {
                            status = $DROP;
                        }

                    reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $SELECT_EVENT, list($EVENT, index, $STATUS, status));
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt75);
            }
        }
        return NIL;
    }

    // defparameter
    private static final SubLSymbol $cb_uiat_procdesc_dom_ids$ = makeSymbol("*CB-UIAT-PROCDESC-DOM-IDS*");

    public static final SubLObject cb_uiat_procdesc_render_show_roles(SubLObject interaction, SubLObject procname, SubLObject roles, SubLObject role_examples, SubLObject roles_graph, SubLObject previous_roles) {
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
                        html_utilities.html_hidden_input($str_alt84$cb_uiat_procdesc_roles_defined, T, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_39 = $cb_uiat_procdesc_dom_ids$.currentBinding(thread);
                            try {
                                $cb_uiat_procdesc_dom_ids$.bind(cb_uiat_procdesc_allocate_role_example_ids(roles_graph), thread);
                                cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
                                if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                                    html_script_utilities.html_js_focus_window();
                                }
                                cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
                                {
                                    SubLObject select_message = $str_alt85$Select_the_key_players_for_the_ap;
                                    cb_uiat_procdesc_roles_dom_declare_ids($cb_uiat_procdesc_dom_ids$.getDynamicValue(thread));
                                    html_utilities.html_newline(UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_princ($str_alt86$Key_Process_Role_Selection_for_);
                                    html_utilities.html_princ(procname);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                                    html_utilities.html_newline(TWO_INTEGER);
                                    if (NIL != previous_roles) {
                                        html_utilities.html_princ($str_alt87$We_already_established_the_follow);
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
                                            html_utilities.html_markup(ZERO_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (NIL != html_macros.$html_color_yellowish_gray$.getDynamicValue(thread)) {
                                            html_utilities.html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_color_yellowish_gray$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup($str_alt88$95_);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                cb_uiat_procdesc_render_table_header($PRE_EXISTING);
                                                {
                                                    SubLObject cdolist_list_var = previous_roles;
                                                    SubLObject previous_role = NIL;
                                                    for (previous_role = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , previous_role = cdolist_list_var.first()) {
                                                        cb_uiat_procdesc_render_previous_role(interaction, previous_role, roles, role_examples, roles_graph);
                                                    }
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_40, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        select_message = $str_alt90$Specify_any_additional_key_player;
                                        html_utilities.html_newline(TWO_INTEGER);
                                    }
                                    html_utilities.html_princ(select_message);
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
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_41 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            cb_uiat_procdesc_render_table_header(UNPROVIDED);
                                            {
                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(roles_graph));
                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject role = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                        SubLObject genl_roles = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        cb_uiat_procdesc_render_one_role_assignment(NIL, role, roles, genl_roles, role_examples, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                    }
                                                } 
                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_41, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                    html_utilities.html_newline(TWO_INTEGER);
                                    html_utilities.html_hidden_input($str_alt91$total_roles, string_utilities.to_string(length(roles)), UNPROVIDED);
                                    html_utilities.html_hidden_input($str_alt92$ui_id, string_utilities.to_string(user_interaction_agenda.ui_id(interaction)), UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                    html_utilities.html_submit_input($$$Submit, $$$done, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                                }
                            } finally {
                                $cb_uiat_procdesc_dom_ids$.rebind(_prev_bind_0_39, thread);
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
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_procdesc_allocate_role_example_ids(SubLObject v_graph) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ids = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                SubLObject index = ZERO_INTEGER;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_graph));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject values = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        dictionary.dictionary_enter(ids, key, cconcatenate($str_alt95$procdesc_role_example_id_, string_utilities.to_string(index)));
                        index = add(index, ONE_INTEGER);
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return ids;
            }
        }
    }

    public static final SubLObject cb_uiat_procdesc_roles_dom_declare_ids(SubLObject ids) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
            html_utilities.html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup($str_alt96$text_css);
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
                    {
                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(ids));
                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                SubLObject id = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                html_utilities.html_terpri(UNPROVIDED);
                                dhtml_macros.dhtml_dom_wrapper_preamble(id);
                                dhtml_macros.dhtml_dom_attribute_preamble(dhtml_macros.$dhtml_dom_display$.getGlobalValue());
                                html_utilities.html_markup($$$none);
                                dhtml_macros.dhtml_dom_attribute_postamble();
                                dhtml_macros.dhtml_dom_wrapper_postamble();
                                html_utilities.html_terpri(UNPROVIDED);
                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                            }
                        } 
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(dhtml_macros.$dhtml_css_tail$.getGlobalValue());
            html_utilities.html_terpri(UNPROVIDED);
            return ids;
        }
    }

    public static final SubLObject cb_uiat_procdesc_render_table_header(SubLObject pre_existingP) {
        if (pre_existingP == UNPROVIDED) {
            pre_existingP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    if (NIL != pre_existingP) {
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($str_alt99$_1);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_43 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($$$Delete);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_43, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_42, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (true) {
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align($CENTER));
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_44 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_utilities.html_princ($$$Role);
                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
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
                        SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_utilities.html_princ($$$Player_Identification);
                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
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
                        SubLObject _prev_bind_0_46 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_utilities.html_princ($$$Same_in);
                            html_utilities.html_newline(UNPROVIDED);
                            html_utilities.html_princ($str_alt104$Sub_Scenes);
                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
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

    public static final SubLObject cb_uiat_procdesc_render_previous_role(SubLObject interaction, SubLObject previous_role, SubLObject roles, SubLObject role_examples, SubLObject role_graph) {
        {
            SubLObject datum = previous_role;
            SubLObject current = datum;
            SubLObject index = NIL;
            SubLObject type_term = NIL;
            SubLObject subsceneP = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt105);
            index = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt105);
            type_term = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt105);
            subsceneP = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject role = nth(index, roles);
                    SubLObject genl_roles = dictionary.dictionary_lookup(role_graph, role, UNPROVIDED);
                    SubLObject player_name = uia_trampolines.uia_term_phrase(user_interaction_agenda.ui_agenda(interaction), type_term, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    cb_uiat_procdesc_render_one_role_assignment(index, role, roles, genl_roles, role_examples, player_name, type_term, subsceneP, $$$old, $PRE_EXISTING);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt105);
            }
        }
        return NIL;
    }

    /**
     * Support two modes of invocation, either with a role or an index.
     */
    public static final SubLObject cb_uiat_procdesc_render_one_role_assignment(SubLObject index, SubLObject role, SubLObject roles, SubLObject genl_roles, SubLObject role_examples, SubLObject player_name, SubLObject type_term, SubLObject subsceneP, SubLObject prefix, SubLObject pre_existingP) {
        if (player_name == UNPROVIDED) {
            player_name = $str_alt107$;
        }
        if (type_term == UNPROVIDED) {
            type_term = NIL;
        }
        if (subsceneP == UNPROVIDED) {
            subsceneP = NIL;
        }
        if (prefix == UNPROVIDED) {
            prefix = $$$new;
        }
        if (pre_existingP == UNPROVIDED) {
            pre_existingP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == index) {
                index = position(role, roles, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL == role) {
                role = nth(index, roles);
            }
            {
                SubLObject ids = $cb_uiat_procdesc_dom_ids$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (NIL != pre_existingP) {
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align($CENTER));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_47 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_checkbox_input(cb_uiat_procdesc_compute_input_name(prefix, $$$remove, index), $$$X, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_47, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_indent(UNPROVIDED);
                                if (NIL == pre_existingP) {
                                    {
                                        SubLObject actor_slot = cb_uiat_procdesc_compute_input_name(prefix, $str_alt111$actor_slot_, index);
                                        html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(actor_slot);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(ONE_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                if (NIL != index) {
                                                    html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(index);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_50 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_uia_display_primitives.cb_uia_show_term_without_link(role, UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_50, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                {
                                                    SubLObject cdolist_list_var = genl_roles;
                                                    SubLObject genl_role = NIL;
                                                    for (genl_role = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl_role = cdolist_list_var.first()) {
                                                        {
                                                            SubLObject genl_index = position(genl_role, roles, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                            if (NIL != genl_index) {
                                                                html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(genl_index);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_51 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    cb_uia_display_primitives.cb_uia_show_term_without_link(genl_role, UNPROVIDED);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_51, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                        }
                                                    }
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                    }
                                } else {
                                    cb_uia_display_primitives.cb_uia_show_term_without_link(role, UNPROVIDED);
                                }
                                html_utilities.html_indent(TWO_INTEGER);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_48, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        if (NIL != pre_existingP) {
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align($CENTER));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_52 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_uia_display_primitives.cb_uia_show_term(type_term, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_52, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } else {
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_53 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_text_input(cb_uiat_procdesc_compute_input_name(prefix, $str_alt112$player_name_, index), player_name, $int$35);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_53, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_54 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                if (NIL != pre_existingP) {
                                    html_utilities.html_princ(NIL != subsceneP ? ((SubLObject) ($$$yes)) : $$$no);
                                } else {
                                    html_utilities.html_checkbox_input(cb_uiat_procdesc_compute_input_name(prefix, $str_alt116$player_subs_, index), $$$X, subsceneP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_54, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                if (NIL == pre_existingP) {
                    {
                        SubLObject example = nth(index, role_examples);
                        SubLObject dom_id = dictionary.dictionary_lookup(ids, role, UNPROVIDED);
                        if (NIL != example) {
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
                                        SubLObject _prev_bind_0_55 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            dhtml_macros.dhtml_switch_visibility_links_arrows(dom_id, $$$Examples);
                                            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup($str_alt99$_1);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_56 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    dhtml_macros.dhtml_set_switched_visibility(dom_id, $INVISIBLE, $TEXT);
                                                    html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                                    if (NIL != dom_id) {
                                                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(dom_id);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_57 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_table_align$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(html_utilities.html_align($RIGHT));
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_58 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_59 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_60 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    cb_uia_display_primitives.cb_uia_show_term(role, UNPROVIDED);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_60, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_61 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    cb_uia_display_primitives.cb_uia_show_sentence_precise(example);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_61, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_59, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                    {
                                                                        SubLObject cdolist_list_var = genl_roles;
                                                                        SubLObject genl_role = NIL;
                                                                        for (genl_role = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl_role = cdolist_list_var.first()) {
                                                                            {
                                                                                SubLObject genl_index = position(genl_role, roles, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                SubLObject genl_example = nth(genl_index, role_examples);
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
                                                                                                cb_uia_display_primitives.cb_uia_show_term(genl_role, UNPROVIDED);
                                                                                            } finally {
                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_63, thread);
                                                                                            }
                                                                                        }
                                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                        {
                                                                                            SubLObject _prev_bind_0_64 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                            try {
                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                cb_uia_display_primitives.cb_uia_show_sentence_precise(genl_example);
                                                                                            } finally {
                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_64, thread);
                                                                                            }
                                                                                        }
                                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_62, thread);
                                                                                    }
                                                                                }
                                                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                            }
                                                                        }
                                                                    }
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_58, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_57, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_56, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_55, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_65 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_indent(TWO_INTEGER);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_65, thread);
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
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_procdesc_compute_input_name(SubLObject prefix, SubLObject stem, SubLObject counter) {
        return cconcatenate(prefix, new SubLObject[]{ stem, string_utilities.to_string(counter) });
    }

    public static final SubLObject cb_uiat_procdesc_roles_defined(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject role_count_string = html_utilities.html_extract_input($str_alt91$total_roles, args);
            SubLObject ui_id_string = html_utilities.html_extract_input($str_alt92$ui_id, args);
            SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, ui_id_string);
            SubLObject role_count = parse_integer(role_count_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject prefix = $$$new;
            SubLObject results = NIL;
            SubLObject deletes = NIL;
            SubLObject reply = NIL;
            SubLObject index = NIL;
            for (index = ZERO_INTEGER; index.numL(role_count); index = add(index, ONE_INTEGER)) {
                {
                    SubLObject delete_role_field = cb_uiat_procdesc_compute_input_name($$$old, $$$remove, index);
                    SubLObject delete_role_slot = html_utilities.html_extract_input(delete_role_field, args);
                    SubLObject delete_roleP = (NIL != delete_role_slot) ? ((SubLObject) (T)) : NIL;
                    if (NIL != delete_roleP) {
                        deletes = cons(index, deletes);
                    }
                }
                {
                    SubLObject role_name_field = cb_uiat_procdesc_compute_input_name(prefix, $str_alt112$player_name_, index);
                    SubLObject role_name = html_utilities.html_extract_input(role_name_field, args);
                    if ((NIL != Strings.string(role_name)) && length(role_name).isPositive()) {
                        {
                            SubLObject role_subs_field = cb_uiat_procdesc_compute_input_name(prefix, $str_alt116$player_subs_, index);
                            SubLObject role_subs = html_utilities.html_extract_input(role_subs_field, args);
                            SubLObject subscenesP = (NIL != role_subs) ? ((SubLObject) (T)) : NIL;
                            SubLObject actor_slot_field = cb_uiat_procdesc_compute_input_name(prefix, $str_alt111$actor_slot_, index);
                            SubLObject actor_slot = html_utilities.html_extract_input(actor_slot_field, args);
                            SubLObject actor_slot_index = parse_integer(actor_slot, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            results = cons(list(actor_slot_index, role_name, subscenesP), results);
                        }
                    }
                }
            }
            reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $ROLES_SELECTED, list($ROLE_TUPLES, results, $DELETES, deletes));
            return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
        }
    }

    public static final SubLObject cb_uiat_procdesc_render_bad_roles(SubLObject interaction, SubLObject procname, SubLObject bad_roles) {
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
                        html_utilities.html_hidden_input($str_alt125$cb_uiat_procdesc_roles_critiqued, T, UNPROVIDED);
                        cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
                        if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                            html_script_utilities.html_js_focus_window();
                        }
                        cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
                        html_utilities.html_newline(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ($str_alt126$Bad_Process_Roles_selected_for_);
                        html_utilities.html_princ(procname);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                        html_utilities.html_newline(TWO_INTEGER);
                        html_utilities.html_princ($str_alt127$The_interpretation_for_the_phrase);
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
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_66 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_67 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                            SubLObject _prev_bind_0_68 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_princ($$$Role);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_68, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_69 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_princ($$$Phrase);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_69, thread);
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
                                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_70 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_princ($$$Interpretation);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_70, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_67, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                {
                                    SubLObject list_var = NIL;
                                    SubLObject bad_role = NIL;
                                    SubLObject index = NIL;
                                    for (list_var = bad_roles, bad_role = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , bad_role = list_var.first() , index = add(ONE_INTEGER, index)) {
                                        {
                                            SubLObject datum = bad_role;
                                            SubLObject current = datum;
                                            SubLObject role = NIL;
                                            SubLObject term_name = NIL;
                                            SubLObject solution = NIL;
                                            SubLObject clarifying_sentence = NIL;
                                            destructuring_bind_must_consp(current, datum, $list_alt130);
                                            role = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list_alt130);
                                            term_name = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list_alt130);
                                            solution = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list_alt130);
                                            clarifying_sentence = current.first();
                                            current = current.rest();
                                            if (NIL == current) {
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_71 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                            SubLObject _prev_bind_0_72 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                cb_uia_display_primitives.cb_uia_show_term(role, UNPROVIDED);
                                                                html_utilities.html_indent(TWO_INTEGER);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_72, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_73 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ(term_name);
                                                                html_utilities.html_indent(TWO_INTEGER);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_73, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_74 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                if (solution == $NONE) {
                                                                    html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                                                    html_utilities.html_princ($$$no_interpretation);
                                                                    html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                                                } else {
                                                                    cb_uia_display_primitives.cb_uia_show_term(solution, UNPROVIDED);
                                                                }
                                                                html_utilities.html_indent(TWO_INTEGER);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_74, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_75 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                if (NIL != clarifying_sentence) {
                                                                    cb_uia_display_primitives.cb_uia_show_sentence_in_interaction(clarifying_sentence, interaction);
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_75, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_71, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } else {
                                                cdestructuring_bind_error(datum, $list_alt130);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_66, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        html_utilities.html_newline(TWO_INTEGER);
                        html_utilities.html_hidden_input($str_alt91$total_roles, string_utilities.to_string(length(bad_roles)), UNPROVIDED);
                        html_utilities.html_hidden_input($str_alt92$ui_id, string_utilities.to_string(user_interaction_agenda.ui_id(interaction)), UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                        html_utilities.html_submit_input($$$Continue, $$$done, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
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

    public static final SubLObject cb_uiat_procdesc_roles_critiqued(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject ui_id_string = html_utilities.html_extract_input($str_alt92$ui_id, args);
            SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, ui_id_string);
            SubLObject reply = NIL;
            reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $BAD_ROLES_SHOWN, NIL);
            return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
        }
    }

    public static final SubLObject cb_uiat_procdesc_render_fetch_subscenes(SubLObject interaction, SubLObject procname, SubLObject previous_subscenes, SubLObject number) {
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
                        html_utilities.html_hidden_input($str_alt136$cb_uiat_procdesc_subscenes_define, T, UNPROVIDED);
                        cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
                        if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                            html_script_utilities.html_js_focus_window();
                        }
                        cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
                        {
                            SubLObject _prev_bind_0_76 = html_script_utilities.$javascript_event_remapping_assignments$.currentBinding(thread);
                            try {
                                html_script_utilities.$javascript_event_remapping_assignments$.bind(NIL, thread);
                                format(html_macros.$html_stream$.getDynamicValue(thread), cb_uia_macros.$cb_uiat_generate_counter_input_js$.getGlobalValue());
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt137$Process_Sub_Scene_Definition_for_);
                                html_utilities.html_princ(procname);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                                html_utilities.html_newline(TWO_INTEGER);
                                if (NIL != previous_subscenes) {
                                    cb_uiat_procdesc_render_previous_subscenes(interaction, procname, previous_subscenes);
                                }
                                html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt138$Identify_);
                                html_utilities.html_princ(NIL != previous_subscenes ? ((SubLObject) ($$$any_additional)) : $$$the);
                                html_utilities.html_princ($str_alt141$_sub_scenes_for_the_process_in_th);
                                html_utilities.html_princ($str_alt142$_if_there_are_no_);
                                if (NIL != previous_subscenes) {
                                    html_utilities.html_princ($str_alt143$more_);
                                }
                                html_utilities.html_princ($str_alt144$sub_scenes__leave_the_fields_blan);
                                html_utilities.html_submit_input($$$Continue, $$$done, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                                html_utilities.html_newline(TWO_INTEGER);
                                cb_uiat_procdesc_new_subscene_fields(number);
                                html_utilities.html_newline(TWO_INTEGER);
                                html_utilities.html_hidden_input($str_alt145$total_subscenes, string_utilities.to_string(number), UNPROVIDED);
                                html_utilities.html_hidden_input($str_alt92$ui_id, string_utilities.to_string(user_interaction_agenda.ui_id(interaction)), UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                html_utilities.html_submit_input($$$Continue, $$$done, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                                html_script_utilities.generate_javascript_event_remapping_assignments(html_script_utilities.$javascript_event_remapping_assignments$.getDynamicValue(thread));
                            } finally {
                                html_script_utilities.$javascript_event_remapping_assignments$.rebind(_prev_bind_0_76, thread);
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
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_procdesc_subscenes_header() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
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
                        SubLObject _prev_bind_0_77 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_princ($$$Step_Number);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_77, thread);
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
                        SubLObject _prev_bind_0_78 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_princ($str_alt147$Sub_Scene_Name);
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
                            html_utilities.html_indent(TWO_INTEGER);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_79, thread);
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
                        SubLObject _prev_bind_0_80 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_princ($str_alt148$First_);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_80, thread);
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
                        SubLObject _prev_bind_0_81 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_princ($str_alt149$Last_);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_81, thread);
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

    public static final SubLObject cb_uiat_procdesc_render_previous_subscenes(SubLObject interaction, SubLObject procname, SubLObject previous_subscenes) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
            html_utilities.html_princ($str_alt150$We_already_established_the_follow);
            html_utilities.html_princ(procname);
            html_utilities.html_princ($str_alt151$___);
            html_utilities.html_newline(TWO_INTEGER);
            html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
            {
                SubLObject head = user_interaction_agenda.ui_state_lookup(interaction, $TERM, UNPROVIDED);
                SubLObject counter = ONE_INTEGER;
                SubLObject total_steps = ZERO_INTEGER;
                SubLObject first_step = dictionary.dictionary_lookup(previous_subscenes, head, UNPROVIDED);
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
                    html_utilities.html_markup(ZERO_INTEGER);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != html_macros.$html_color_yellowish_gray$.getDynamicValue(thread)) {
                    html_utilities.html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_color_yellowish_gray$.getDynamicValue(thread));
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_uia_procdesc_previous_subscenes_header();
                        {
                            SubLObject seen = set.new_set(EQL, UNPROVIDED);
                            SubLObject todo = queues.create_queue();
                            queues.enqueue(first_step, todo);
                            set.set_add(first_step, seen);
                            while (NIL == queues.queue_empty_p(todo)) {
                                {
                                    SubLObject current = NIL;
                                    SubLObject children = NIL;
                                    current = queues.dequeue(todo);
                                    children = dictionary.dictionary_lookup(previous_subscenes, current, UNPROVIDED);
                                    {
                                        SubLObject child = children.first();
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_82 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_83 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_princ(counter);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_83, thread);
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
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_84 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_uia_display_primitives.cb_uia_show_term(current, UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_84, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                cb_uiat_procdesc_pointer_column(child);
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_85 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        if (NIL != child) {
                                                            cb_uia_display_primitives.cb_uia_show_term(child, UNPROVIDED);
                                                        } else {
                                                            html_utilities.html_indent(TWO_INTEGER);
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_85, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_86 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        if (NIL != child) {
                                                            html_utilities.html_checkbox_input(cb_uiat_procdesc_compute_input_name($$$old, $str_alt153$remove_step, total_steps), cb_uiat_procdesc_subscene_compute_deletesig(user_interaction_agenda.ui_agenda(interaction), current, child), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } else {
                                                            html_utilities.html_indent(TWO_INTEGER);
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_86, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_82, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        total_steps = add(total_steps, ONE_INTEGER);
                                    }
                                    {
                                        SubLObject list_var = NIL;
                                        SubLObject child = NIL;
                                        SubLObject child_index = NIL;
                                        for (list_var = children.rest(), child = list_var.first(), child_index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , child = list_var.first() , child_index = add(ONE_INTEGER, child_index)) {
                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_87 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                        SubLObject _prev_bind_0_88 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_indent(TWO_INTEGER);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_88, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    cb_uiat_procdesc_pointer_column(UNPROVIDED);
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
                                                            cb_uia_display_primitives.cb_uia_show_term(child, UNPROVIDED);
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
                                                            html_utilities.html_checkbox_input(cb_uiat_procdesc_compute_input_name($$$old, $str_alt153$remove_step, total_steps), cb_uiat_procdesc_subscene_compute_deletesig(user_interaction_agenda.ui_agenda(interaction), current, child), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_90, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_87, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            total_steps = add(total_steps, ONE_INTEGER);
                                        }
                                    }
                                    counter = add(counter, ONE_INTEGER);
                                    {
                                        SubLObject cdolist_list_var = children;
                                        SubLObject child = NIL;
                                        for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                                            if (NIL == set.set_memberP(child, seen)) {
                                                set.set_add(child, seen);
                                                queues.enqueue(child, todo);
                                            }
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
                html_utilities.html_hidden_input($str_alt154$total_old_steps, total_steps, UNPROVIDED);
            }
            return interaction;
        }
    }

    public static final SubLObject cb_uia_procdesc_previous_subscenes_header() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
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
                        SubLObject _prev_bind_0_91 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_utilities.html_princ($$$Step);
                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_91, thread);
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
                        SubLObject _prev_bind_0_92 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_utilities.html_princ($$$Process);
                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_92, thread);
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
                        html_utilities.html_markup(html_utilities.html_align($CENTER));
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_93 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_utilities.html_princ($str_alt157$Follower_s_);
                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_93, thread);
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
                        SubLObject _prev_bind_0_94 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                            html_utilities.html_princ($$$Delete);
                            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
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
            return NIL;
        }
    }

    // deflexical
    private static final SubLSymbol $cb_uiat_procdesc_deletesig_separator$ = makeSymbol("*CB-UIAT-PROCDESC-DELETESIG-SEPARATOR*");

    public static final SubLObject cb_uiat_procdesc_subscene_compute_deletesig(SubLObject v_agenda, SubLObject fort_1, SubLObject fort_2) {
        return cconcatenate(cb_user_interaction_agenda.cb_uia_html_encode(v_agenda, fort_1), new SubLObject[]{ string_utilities.to_string($cb_uiat_procdesc_deletesig_separator$.getGlobalValue()), cb_user_interaction_agenda.cb_uia_html_encode(v_agenda, fort_2) });
    }

    public static final SubLObject cb_uiat_procdesc_subscene_crack_deletesig(SubLObject v_agenda, SubLObject string) {
        {
            SubLObject spot = position($cb_uiat_procdesc_deletesig_separator$.getGlobalValue(), string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject part_1 = string_utilities.substring(string, ZERO_INTEGER, spot);
            SubLObject part_2 = string_utilities.substring(string, add(spot, ONE_INTEGER), UNPROVIDED);
            return values(cb_user_interaction_agenda.cb_uia_html_decode(v_agenda, part_1), cb_user_interaction_agenda.cb_uia_html_decode(v_agenda, part_2));
        }
    }

    public static final SubLObject cb_uiat_procdesc_pointer_column(SubLObject display_pointerP) {
        if (display_pointerP == UNPROVIDED) {
            display_pointerP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
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
                    if (NIL != display_pointerP) {
                        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(TWO_INTEGER);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_95 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt158$__);
                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_95, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                    } else {
                        html_utilities.html_indent(TWO_INTEGER);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_procdesc_new_subscene_fields(SubLObject number) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
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
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    cb_uiat_procdesc_subscenes_header();
                    {
                        SubLObject index = NIL;
                        for (index = ZERO_INTEGER; index.numL(number); index = add(index, ONE_INTEGER)) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_96 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        SubLObject _prev_bind_0_97 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            {
                                                SubLObject count_string = string_utilities.to_string(add(ONE_INTEGER, index));
                                                SubLObject id_string = cb_uiat_procdesc_compute_input_name($str_alt107$, $str_alt159$subscene_step, index);
                                                SubLObject value_string = cconcatenate($str_alt160$_, new SubLObject[]{ string_utilities.to_string(count_string), $str_alt160$_ });
                                                SubLObject inc_script = cb_uia_macros.cb_uiat_generate_modification_script(id_string, ONE_INTEGER);
                                                SubLObject dec_script = cb_uia_macros.cb_uiat_generate_modification_script(id_string, minus(ONE_INTEGER));
                                                html_script_utilities.javascript_note_event_remapping(id_string, $ONCLICK, cb_uia_macros.$cb_uiat_counter_input_clicked_method$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(dhtml_macros.$dhtml_blank_href_js$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(dec_script);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_98 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                        html_utilities.html_princ($str_alt162$_);
                                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_98, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                html_utilities.html_indent(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup($$$text);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                if (NIL != id_string) {
                                                    html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(id_string);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (NIL != id_string) {
                                                    html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(id_string);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (NIL != value_string) {
                                                    html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_princ(value_string);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_simple_attribute(html_macros.$html_input_readonly$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_input_size$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(THREE_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                html_utilities.html_indent(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(dhtml_macros.$dhtml_blank_href_js$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(inc_script);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_99 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                        html_utilities.html_princ($str_alt164$_);
                                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_99, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_97, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_100 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_text_input(cb_uiat_procdesc_compute_input_name($str_alt107$, $str_alt165$subscene_name_, index), $str_alt107$, $int$45);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_100, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_101 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_indent(TWO_INTEGER);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_101, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_102 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_checkbox_input(cb_uiat_procdesc_compute_input_name($str_alt107$, $str_alt167$subscene_f, index), $$$X, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_102, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_103 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_checkbox_input(cb_uiat_procdesc_compute_input_name($str_alt107$, $str_alt168$subscene_l, index), $$$X, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_103, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_96, thread);
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
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_procdesc_subscenes_defined(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject subscene_count_string = html_utilities.html_extract_input($str_alt145$total_subscenes, args);
            SubLObject ui_id_string = html_utilities.html_extract_input($str_alt92$ui_id, args);
            SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, ui_id_string);
            SubLObject subscene_count = parse_integer(subscene_count_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject total_old_steps_string = html_utilities.html_extract_input($str_alt154$total_old_steps, args);
            SubLObject total_old_steps = (total_old_steps_string.isString()) ? ((SubLObject) (parse_integer(total_old_steps_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : ZERO_INTEGER;
            SubLObject results = NIL;
            SubLObject deletes = NIL;
            SubLObject reply = NIL;
            results = cb_uiat_procdesc_extract_defined_subscenes(args, subscene_count);
            deletes = cb_uiat_procdesc_extract_deleted_subscenes(args, v_agenda, total_old_steps);
            reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $SUBSCENES_DEFINED, list($SUBSCENE_TUPLES, nreverse(results), $DELETED_SUBSCENES, deletes));
            return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
        }
    }

    public static final SubLObject cb_uiat_procdesc_extract_deleted_subscenes(SubLObject args, SubLObject v_agenda, SubLObject old_scenes_count) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject deletes = NIL;
                SubLObject index = NIL;
                for (index = ZERO_INTEGER; index.numL(old_scenes_count); index = add(index, ONE_INTEGER)) {
                    {
                        SubLObject old_delete_name = cb_uiat_procdesc_compute_input_name($$$old, $str_alt153$remove_step, index);
                        SubLObject delete_signature = html_utilities.html_extract_input(old_delete_name, args);
                        if (!((NIL == delete_signature) || (NIL != string_utilities.empty_string_p(delete_signature)))) {
                            thread.resetMultipleValues();
                            {
                                SubLObject leader = cb_uiat_procdesc_subscene_crack_deletesig(v_agenda, delete_signature);
                                SubLObject follower = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                deletes = cons(list(leader, follower), deletes);
                            }
                        }
                    }
                }
                return deletes;
            }
        }
    }

    public static final SubLObject cb_uiat_procdesc_extract_defined_subscenes(SubLObject args, SubLObject subscene_count) {
        {
            SubLObject doneP = NIL;
            SubLObject results = NIL;
            SubLObject index = NIL;
            for (index = ZERO_INTEGER; index.numL(subscene_count); index = add(index, ONE_INTEGER)) {
                if (NIL == doneP) {
                    {
                        SubLObject subscene_name_field = cb_uiat_procdesc_compute_input_name($str_alt107$, $str_alt165$subscene_name_, index);
                        SubLObject subscene_name = html_utilities.html_extract_input(subscene_name_field, args);
                        if (subscene_name.isString() && (NIL == string_utilities.empty_string_p(subscene_name))) {
                            {
                                SubLObject subscene_step_name = cb_uiat_procdesc_compute_input_name($str_alt107$, $str_alt159$subscene_step, index);
                                SubLObject subscene_step = html_utilities.html_extract_input(subscene_step_name, args);
                                SubLObject subscene_step_number = read_from_string_ignoring_errors(subscene_step, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject subscene_first_field = cb_uiat_procdesc_compute_input_name($str_alt107$, $str_alt167$subscene_f, index);
                                SubLObject subscene_firstP = html_utilities.html_extract_input(subscene_first_field, args);
                                SubLObject subscene_last_field = cb_uiat_procdesc_compute_input_name($str_alt107$, $str_alt168$subscene_l, index);
                                SubLObject subscene_lastP = html_utilities.html_extract_input(subscene_last_field, args);
                                SubLObject description = list(subscene_name, subscene_firstP, subscene_lastP, subscene_step_number.isFixnum() ? ((SubLObject) (subscene_step_number)) : NIL);
                                results = cons(description, results);
                            }
                        } else {
                            doneP = T;
                        }
                    }
                }
            }
            return results;
        }
    }

    public static final SubLObject cb_uiat_procdesc_render_simple_render(SubLObject interaction, SubLObject string, SubLObject rc_code) {
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
                        html_utilities.html_hidden_input($str_alt173$cb_uiat_procdesc_done_simple_rend, T, UNPROVIDED);
                        cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
                        if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                            html_script_utilities.html_js_focus_window();
                        }
                        cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
                        html_utilities.html_newline(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ($$$Current_State);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                        html_utilities.html_newline(TWO_INTEGER);
                        html_macros.verify_not_within_html_pre();
                        html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                        {
                            SubLObject _prev_bind_0_104 = html_macros.$within_html_pre$.currentBinding(thread);
                            try {
                                html_macros.$within_html_pre$.bind(T, thread);
                                html_utilities.html_princ(string);
                            } finally {
                                html_macros.$within_html_pre$.rebind(_prev_bind_0_104, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                        html_utilities.html_hidden_input($str_alt175$return_code, string_utilities.to_string(rc_code), UNPROVIDED);
                        html_utilities.html_hidden_input($str_alt92$ui_id, string_utilities.to_string(user_interaction_agenda.ui_id(interaction)), UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                        html_utilities.html_submit_input($str_alt176$_Done_, $$$done, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
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

    public static final SubLObject cb_uiat_procdesc_done_simple_render(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject return_code = html_utilities.html_extract_input($str_alt175$return_code, args);
            SubLObject ui_id_string = html_utilities.html_extract_input($str_alt92$ui_id, args);
            SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, ui_id_string);
            SubLObject reply = NIL;
            reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $RENDERED, list($CODE, return_code));
            return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
        }
    }

    public static final SubLObject cb_uiat_procdesc_render_show_term(SubLObject interaction, SubLObject procname, SubLObject v_term) {
        cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
        if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
            html_script_utilities.html_js_focus_window();
        }
        cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
        html_utilities.html_newline(UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ($str_alt180$Process_Description_for_);
        html_utilities.html_princ(procname);
        html_utilities.html_princ($str_alt181$_completed_);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
        html_utilities.html_newline(TWO_INTEGER);
        html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
        html_utilities.html_princ($str_alt182$The_description_of_the_process_);
        cb_uia_display_primitives.cb_uia_show_term(v_term, UNPROVIDED);
        html_utilities.html_princ($str_alt183$_has_been_completed_);
        html_utilities.html_newline(UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
        cb_utilities.cb_link($UIAT_PROCDESC_DONE, interaction, $str_alt176$_Done_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
        return interaction;
    }

    public static final SubLObject cb_link_uiat_procdesc_done(SubLObject interaction, SubLObject linktext) {
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
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt185$cb_uiat_procdesc_done, arglist);
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

    public static final SubLObject cb_uiat_procdesc_done(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject reply = NIL;
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt187);
            interaction = current.first();
            current = current.rest();
            if (NIL == current) {
                reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $DONE, NIL);
            } else {
                cdestructuring_bind_error(datum, $list_alt187);
            }
            return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
        }
    }

    public static final SubLObject declare_cb_uia_tools_wizards_file() {
        declareFunction("cb_uiat_scenario_constructor_render_request", "CB-UIAT-SCENARIO-CONSTRUCTOR-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_sc_show", "CB-UIAT-SC-SHOW", 1, 0, false);
        declareFunction("cb_uiat_sc_adjust_sentence", "CB-UIAT-SC-ADJUST-SENTENCE", 3, 0, false);
        declareFunction("cb_uiat_choose_best_interpretation", "CB-UIAT-CHOOSE-BEST-INTERPRETATION", 4, 0, false);
        declareFunction("cb_uiat_process_descriptor_render_request", "CB-UIAT-PROCESS-DESCRIPTOR-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_procdesc_render_show_events", "CB-UIAT-PROCDESC-RENDER-SHOW-EVENTS", 6, 0, false);
        declareFunction("cb_link_uiat_procdesc_action_select", "CB-LINK-UIAT-PROCDESC-ACTION-SELECT", 3, 0, false);
        declareFunction("cb_uiat_procdesc_action_select", "CB-UIAT-PROCDESC-ACTION-SELECT", 3, 0, false);
        declareFunction("cb_uiat_procdesc_select_handler", "CB-UIAT-PROCDESC-SELECT-HANDLER", 1, 0, false);
        declareFunction("cb_uiat_procdesc_render_show_roles", "CB-UIAT-PROCDESC-RENDER-SHOW-ROLES", 6, 0, false);
        declareFunction("cb_uiat_procdesc_allocate_role_example_ids", "CB-UIAT-PROCDESC-ALLOCATE-ROLE-EXAMPLE-IDS", 1, 0, false);
        declareFunction("cb_uiat_procdesc_roles_dom_declare_ids", "CB-UIAT-PROCDESC-ROLES-DOM-DECLARE-IDS", 1, 0, false);
        declareFunction("cb_uiat_procdesc_render_table_header", "CB-UIAT-PROCDESC-RENDER-TABLE-HEADER", 0, 1, false);
        declareFunction("cb_uiat_procdesc_render_previous_role", "CB-UIAT-PROCDESC-RENDER-PREVIOUS-ROLE", 5, 0, false);
        declareFunction("cb_uiat_procdesc_render_one_role_assignment", "CB-UIAT-PROCDESC-RENDER-ONE-ROLE-ASSIGNMENT", 5, 5, false);
        declareFunction("cb_uiat_procdesc_compute_input_name", "CB-UIAT-PROCDESC-COMPUTE-INPUT-NAME", 3, 0, false);
        declareFunction("cb_uiat_procdesc_roles_defined", "CB-UIAT-PROCDESC-ROLES-DEFINED", 1, 0, false);
        declareFunction("cb_uiat_procdesc_render_bad_roles", "CB-UIAT-PROCDESC-RENDER-BAD-ROLES", 3, 0, false);
        declareFunction("cb_uiat_procdesc_roles_critiqued", "CB-UIAT-PROCDESC-ROLES-CRITIQUED", 1, 0, false);
        declareFunction("cb_uiat_procdesc_render_fetch_subscenes", "CB-UIAT-PROCDESC-RENDER-FETCH-SUBSCENES", 4, 0, false);
        declareFunction("cb_uiat_procdesc_subscenes_header", "CB-UIAT-PROCDESC-SUBSCENES-HEADER", 0, 0, false);
        declareFunction("cb_uiat_procdesc_render_previous_subscenes", "CB-UIAT-PROCDESC-RENDER-PREVIOUS-SUBSCENES", 3, 0, false);
        declareFunction("cb_uia_procdesc_previous_subscenes_header", "CB-UIA-PROCDESC-PREVIOUS-SUBSCENES-HEADER", 0, 0, false);
        declareFunction("cb_uiat_procdesc_subscene_compute_deletesig", "CB-UIAT-PROCDESC-SUBSCENE-COMPUTE-DELETESIG", 3, 0, false);
        declareFunction("cb_uiat_procdesc_subscene_crack_deletesig", "CB-UIAT-PROCDESC-SUBSCENE-CRACK-DELETESIG", 2, 0, false);
        declareFunction("cb_uiat_procdesc_pointer_column", "CB-UIAT-PROCDESC-POINTER-COLUMN", 0, 1, false);
        declareFunction("cb_uiat_procdesc_new_subscene_fields", "CB-UIAT-PROCDESC-NEW-SUBSCENE-FIELDS", 1, 0, false);
        declareFunction("cb_uiat_procdesc_subscenes_defined", "CB-UIAT-PROCDESC-SUBSCENES-DEFINED", 1, 0, false);
        declareFunction("cb_uiat_procdesc_extract_deleted_subscenes", "CB-UIAT-PROCDESC-EXTRACT-DELETED-SUBSCENES", 3, 0, false);
        declareFunction("cb_uiat_procdesc_extract_defined_subscenes", "CB-UIAT-PROCDESC-EXTRACT-DEFINED-SUBSCENES", 2, 0, false);
        declareFunction("cb_uiat_procdesc_render_simple_render", "CB-UIAT-PROCDESC-RENDER-SIMPLE-RENDER", 3, 0, false);
        declareFunction("cb_uiat_procdesc_done_simple_render", "CB-UIAT-PROCDESC-DONE-SIMPLE-RENDER", 1, 0, false);
        declareFunction("cb_uiat_procdesc_render_show_term", "CB-UIAT-PROCDESC-RENDER-SHOW-TERM", 3, 0, false);
        declareFunction("cb_link_uiat_procdesc_done", "CB-LINK-UIAT-PROCDESC-DONE", 2, 0, false);
        declareFunction("cb_uiat_procdesc_done", "CB-UIAT-PROCDESC-DONE", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_uia_tools_wizards_file() {
        defparameter("*CB-UIAT-PROCDESC-DOM-IDS*", NIL);
        deflexical("*CB-UIAT-PROCDESC-DELETESIG-SEPARATOR*", CHAR_period);
        return NIL;
    }

    public static final SubLObject setup_cb_uia_tools_wizards_file() {
                cb_uia_tool_declaration.declare_cb_uia_tool($SCENARIO_CONSTRUCTOR, $list_alt1);
        cb_uia_tool_declaration.declare_cb_uia_tool($PROCESS_DESCRIPTOR, $list_alt26);
        cb_utilities.setup_cb_link_method($UIAT_PROCDESC_ACTION_SELECT, CB_LINK_UIAT_PROCDESC_ACTION_SELECT, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_PROCDESC_SELECT_HANDLER);
        html_macros.note_html_handler_function(CB_UIAT_PROCDESC_ROLES_DEFINED);
        html_macros.note_html_handler_function(CB_UIAT_PROCDESC_ROLES_CRITIQUED);
        html_macros.note_html_handler_function(CB_UIAT_PROCDESC_SUBSCENES_DEFINED);
        html_macros.note_html_handler_function(CB_UIAT_PROCDESC_DONE_SIMPLE_RENDER);
        cb_utilities.setup_cb_link_method($UIAT_PROCDESC_DONE, CB_LINK_UIAT_PROCDESC_DONE, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_PROCDESC_DONE);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol $SCENARIO_CONSTRUCTOR = makeKeyword("SCENARIO-CONSTRUCTOR");

    static private final SubLList $list_alt1 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-SCENARIO-CONSTRUCTOR-RENDER-REQUEST"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycScenarioDescriber")));

    static private final SubLList $list_alt2 = listS(makeUninternedSymbol("OPERATOR"), makeSymbol("ACTION-TYPE"), makeUninternedSymbol("SIGNATURE"), makeSymbol("PLIST"));



    static private final SubLList $list_alt4 = list(makeSymbol("&KEY"), makeSymbol("IGNORE"));

    static private final SubLList $list_alt5 = list(makeKeyword("IGNORE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    private static final SubLSymbol $ADJUST_SENTENCE = makeKeyword("ADJUST-SENTENCE");

    static private final SubLList $list_alt9 = list(makeSymbol("&KEY"), makeSymbol("SENTENCE"), makeSymbol("EXTENSION"));

    static private final SubLList $list_alt10 = list(makeKeyword("SENTENCE"), makeKeyword("EXTENSION"));



    private static final SubLSymbol $EXTENSION = makeKeyword("EXTENSION");

    private static final SubLSymbol $SC_STATE = makeKeyword("SC-STATE");









    private static final SubLSymbol $RC_SCENARIO = makeKeyword("RC-SCENARIO");

    private static final SubLSymbol $CLARIFY_LINKS = makeKeyword("CLARIFY-LINKS");





    private static final SubLSymbol $INDISTINGUISHED = makeKeyword("INDISTINGUISHED");



    private static final SubLSymbol $THEN_CYCL_SENTENCE = makeKeyword("THEN-CYCL-SENTENCE");

    private static final SubLSymbol $PROCESS_DESCRIPTOR = makeKeyword("PROCESS-DESCRIPTOR");

    static private final SubLList $list_alt26 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-PROCESS-DESCRIPTOR-RENDER-REQUEST"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycProcessDescriptor")));

    private static final SubLSymbol $SHOW_EVENTS = makeKeyword("SHOW-EVENTS");

    static private final SubLList $list_alt28 = list(makeSymbol("&KEY"), makeSymbol("PROCNAME"), makeSymbol("PARENTS"), makeSymbol("CURRENT"), makeSymbol("CHILDREN"), makeSymbol("CHOSEN"));

    static private final SubLList $list_alt29 = list(makeKeyword("PROCNAME"), makeKeyword("PARENTS"), makeKeyword("CURRENT"), makeKeyword("CHILDREN"), makeKeyword("CHOSEN"));

    private static final SubLSymbol $PROCNAME = makeKeyword("PROCNAME");







    private static final SubLSymbol $CHOSEN = makeKeyword("CHOSEN");

    private static final SubLSymbol $SHOW_ROLES = makeKeyword("SHOW-ROLES");

    static private final SubLList $list_alt36 = list(makeSymbol("&KEY"), makeSymbol("PROCNAME"), makeSymbol("ROLES"), makeSymbol("ROLE-EXAMPLES"), makeSymbol("ROLES-GRAPH"), makeSymbol("PREVIOUS-ROLES"));

    static private final SubLList $list_alt37 = list(makeKeyword("PROCNAME"), makeKeyword("ROLES"), makeKeyword("ROLE-EXAMPLES"), makeKeyword("ROLES-GRAPH"), makeKeyword("PREVIOUS-ROLES"));

    private static final SubLSymbol $ROLES = makeKeyword("ROLES");

    private static final SubLSymbol $ROLE_EXAMPLES = makeKeyword("ROLE-EXAMPLES");

    private static final SubLSymbol $ROLES_GRAPH = makeKeyword("ROLES-GRAPH");

    private static final SubLSymbol $PREVIOUS_ROLES = makeKeyword("PREVIOUS-ROLES");

    private static final SubLSymbol $BAD_ROLES = makeKeyword("BAD-ROLES");

    static private final SubLList $list_alt43 = list(makeSymbol("&KEY"), makeSymbol("PROCNAME"), makeSymbol("BAD-ROLES"));

    static private final SubLList $list_alt44 = list(makeKeyword("PROCNAME"), makeKeyword("BAD-ROLES"));

    private static final SubLSymbol $FETCH_SUBSCENES = makeKeyword("FETCH-SUBSCENES");

    static private final SubLList $list_alt46 = list(makeSymbol("&KEY"), makeSymbol("PROCNAME"), makeSymbol("PREVIOUS-SUBSCENES"));

    static private final SubLList $list_alt47 = list(makeKeyword("PROCNAME"), makeKeyword("PREVIOUS-SUBSCENES"));

    private static final SubLSymbol $PREVIOUS_SUBSCENES = makeKeyword("PREVIOUS-SUBSCENES");

    private static final SubLSymbol $SHOW_TERM = makeKeyword("SHOW-TERM");

    static private final SubLList $list_alt50 = list(makeSymbol("&KEY"), makeSymbol("PROCNAME"), makeSymbol("TERM"));

    static private final SubLList $list_alt51 = list(makeKeyword("PROCNAME"), $TERM);



    private static final SubLSymbol $SIMPLE_RENDER = makeKeyword("SIMPLE-RENDER");

    static private final SubLList $list_alt54 = list(makeSymbol("&KEY"), makeSymbol("STRING"), makeSymbol("RETURN"));

    static private final SubLList $list_alt55 = list(makeKeyword("STRING"), makeKeyword("RETURN"));





    static private final SubLString $str_alt58$Process_Type_Selector_for_ = makeString("Process Type Selector for ");

    static private final SubLString $str_alt59$Select_the_Type_of_Process_that_d = makeString("Select the Type of Process that describes the category best:");

    static private final SubLString $str_alt60$Click_on_any_of_these_to_zoom_out = makeString("Click on any of these to zoom out in the hierarchy:");

    static private final SubLString $str_alt61$_Out_ = makeString("[Out]");

    static private final SubLString $str_alt62$Or_add_the_current_type_to_the_se = makeString("Or add the current type to the selection:");



    static private final SubLString $str_alt64$_Select_Current_ = makeString("[Select Current]");

    static private final SubLString $str_alt65$Already_Chosen__ = makeString("Already Chosen: ");

    static private final SubLString $str_alt66$_Drop_Chosen_ = makeString("[Drop Chosen]");

    static private final SubLString $str_alt67$_Done_choosing_ = makeString("[Done choosing]");

    static private final SubLString $str_alt68$Or_zoom_in_on_these_more_specific = makeString("Or zoom in on these more specific types:");

    static private final SubLString $str_alt69$85_ = makeString("85%");

    static private final SubLString $str_alt70$_Zoom_ = makeString("[Zoom]");

    private static final SubLSymbol $UIA_INTERACTION = makeKeyword("UIA-INTERACTION");

    static private final SubLString $str_alt72$cb_uiat_procdesc_select_handler = makeString("cb-uiat-procdesc-select-handler");

    private static final SubLSymbol $UIAT_PROCDESC_ACTION_SELECT = makeKeyword("UIAT-PROCDESC-ACTION-SELECT");

    private static final SubLSymbol CB_LINK_UIAT_PROCDESC_ACTION_SELECT = makeSymbol("CB-LINK-UIAT-PROCDESC-ACTION-SELECT");

    static private final SubLList $list_alt75 = list(makeSymbol("INTERACTION"), makeSymbol("INDEX"));



    private static final SubLSymbol $ZOOM = makeKeyword("ZOOM");





    private static final SubLSymbol $SELECT_EVENT = makeKeyword("SELECT-EVENT");





    private static final SubLSymbol CB_UIAT_PROCDESC_SELECT_HANDLER = makeSymbol("CB-UIAT-PROCDESC-SELECT-HANDLER");

    static private final SubLString $str_alt84$cb_uiat_procdesc_roles_defined = makeString("cb-uiat-procdesc-roles-defined");

    static private final SubLString $str_alt85$Select_the_key_players_for_the_ap = makeString("Select the key players for the appropriate key roles in the process:");

    static private final SubLString $str_alt86$Key_Process_Role_Selection_for_ = makeString("Key Process Role Selection for ");

    static private final SubLString $str_alt87$We_already_established_the_follow = makeString("We already established the following key role assignments:");

    static private final SubLString $str_alt88$95_ = makeString("95%");

    private static final SubLSymbol $PRE_EXISTING = makeKeyword("PRE-EXISTING");

    static private final SubLString $str_alt90$Specify_any_additional_key_player = makeString("Specify any additional key players within the process:");

    static private final SubLString $str_alt91$total_roles = makeString("total-roles");

    static private final SubLString $str_alt92$ui_id = makeString("ui-id");

    static private final SubLString $$$Submit = makeString("Submit");

    static private final SubLString $$$done = makeString("done");

    static private final SubLString $str_alt95$procdesc_role_example_id_ = makeString("procdesc_role_example_id_");

    static private final SubLString $str_alt96$text_css = makeString("text/css");

    static private final SubLString $$$screen = makeString("screen");

    static private final SubLString $$$none = makeString("none");

    static private final SubLString $str_alt99$_1 = makeString("-1");

    static private final SubLString $$$Delete = makeString("Delete");

    static private final SubLString $$$Role = makeString("Role");

    static private final SubLString $$$Player_Identification = makeString("Player Identification");

    static private final SubLString $$$Same_in = makeString("Same in");

    static private final SubLString $str_alt104$Sub_Scenes = makeString("Sub-Scenes");

    static private final SubLList $list_alt105 = list(makeSymbol("INDEX"), makeSymbol("TYPE-TERM"), makeSymbol("SUBSCENE?"));

    static private final SubLString $$$old = makeString("old");

    static private final SubLString $str_alt107$ = makeString("");

    static private final SubLString $$$new = makeString("new");

    static private final SubLString $$$remove = makeString("remove");

    static private final SubLString $$$X = makeString("X");

    static private final SubLString $str_alt111$actor_slot_ = makeString("actor_slot_");

    static private final SubLString $str_alt112$player_name_ = makeString("player-name-");

    public static final SubLInteger $int$35 = makeInteger(35);

    static private final SubLString $$$yes = makeString("yes");

    static private final SubLString $$$no = makeString("no");

    static private final SubLString $str_alt116$player_subs_ = makeString("player-subs-");

    static private final SubLString $$$Examples = makeString("Examples");







    private static final SubLSymbol $ROLES_SELECTED = makeKeyword("ROLES-SELECTED");

    private static final SubLSymbol $ROLE_TUPLES = makeKeyword("ROLE-TUPLES");

    private static final SubLSymbol $DELETES = makeKeyword("DELETES");

    private static final SubLSymbol CB_UIAT_PROCDESC_ROLES_DEFINED = makeSymbol("CB-UIAT-PROCDESC-ROLES-DEFINED");

    static private final SubLString $str_alt125$cb_uiat_procdesc_roles_critiqued = makeString("cb-uiat-procdesc-roles-critiqued");

    static private final SubLString $str_alt126$Bad_Process_Roles_selected_for_ = makeString("Bad Process Roles selected for ");

    static private final SubLString $str_alt127$The_interpretation_for_the_phrase = makeString("The interpretation for the phrase you entered did not yield a valid role.");

    static private final SubLString $$$Phrase = makeString("Phrase");

    static private final SubLString $$$Interpretation = makeString("Interpretation");

    static private final SubLList $list_alt130 = list(makeSymbol("ROLE"), makeSymbol("TERM-NAME"), makeSymbol("SOLUTION"), makeSymbol("CLARIFYING-SENTENCE"));



    static private final SubLString $$$no_interpretation = makeString("no interpretation");

    static private final SubLString $$$Continue = makeString("Continue");

    private static final SubLSymbol $BAD_ROLES_SHOWN = makeKeyword("BAD-ROLES-SHOWN");

    private static final SubLSymbol CB_UIAT_PROCDESC_ROLES_CRITIQUED = makeSymbol("CB-UIAT-PROCDESC-ROLES-CRITIQUED");

    static private final SubLString $str_alt136$cb_uiat_procdesc_subscenes_define = makeString("cb-uiat-procdesc-subscenes-defined");

    static private final SubLString $str_alt137$Process_Sub_Scene_Definition_for_ = makeString("Process Sub-Scene Definition for ");

    static private final SubLString $str_alt138$Identify_ = makeString("Identify ");

    static private final SubLString $$$any_additional = makeString("any additional");

    static private final SubLString $$$the = makeString("the");

    static private final SubLString $str_alt141$_sub_scenes_for_the_process_in_th = makeString(" sub-scenes for the process in their order;");

    static private final SubLString $str_alt142$_if_there_are_no_ = makeString(" if there are no ");

    static private final SubLString $str_alt143$more_ = makeString("more ");

    static private final SubLString $str_alt144$sub_scenes__leave_the_fields_blan = makeString("sub-scenes, leave the fields blank and click on ");

    static private final SubLString $str_alt145$total_subscenes = makeString("total-subscenes");

    static private final SubLString $$$Step_Number = makeString("Step Number");

    static private final SubLString $str_alt147$Sub_Scene_Name = makeString("Sub-Scene Name");

    static private final SubLString $str_alt148$First_ = makeString("First?");

    static private final SubLString $str_alt149$Last_ = makeString("Last?");

    static private final SubLString $str_alt150$We_already_established_the_follow = makeString("We already established the following subscenes of ");

    static private final SubLString $str_alt151$___ = makeString(" : ");



    static private final SubLString $str_alt153$remove_step = makeString("remove_step");

    static private final SubLString $str_alt154$total_old_steps = makeString("total-old-steps");

    static private final SubLString $$$Step = makeString("Step");

    static private final SubLString $$$Process = makeString("Process");

    static private final SubLString $str_alt157$Follower_s_ = makeString("Follower(s)");

    static private final SubLString $str_alt158$__ = makeString("=>");

    static private final SubLString $str_alt159$subscene_step = makeString("subscene_step");

    static private final SubLString $str_alt160$_ = makeString(" ");



    static private final SubLString $str_alt162$_ = makeString("-");

    static private final SubLString $$$text = makeString("text");

    static private final SubLString $str_alt164$_ = makeString("+");

    static private final SubLString $str_alt165$subscene_name_ = makeString("subscene-name-");

    public static final SubLInteger $int$45 = makeInteger(45);

    static private final SubLString $str_alt167$subscene_f = makeString("subscene-f");

    static private final SubLString $str_alt168$subscene_l = makeString("subscene-l");

    private static final SubLSymbol $SUBSCENES_DEFINED = makeKeyword("SUBSCENES-DEFINED");

    private static final SubLSymbol $SUBSCENE_TUPLES = makeKeyword("SUBSCENE-TUPLES");

    private static final SubLSymbol $DELETED_SUBSCENES = makeKeyword("DELETED-SUBSCENES");

    private static final SubLSymbol CB_UIAT_PROCDESC_SUBSCENES_DEFINED = makeSymbol("CB-UIAT-PROCDESC-SUBSCENES-DEFINED");

    static private final SubLString $str_alt173$cb_uiat_procdesc_done_simple_rend = makeString("cb-uiat-procdesc-done-simple-render");

    static private final SubLString $$$Current_State = makeString("Current State");

    static private final SubLString $str_alt175$return_code = makeString("return-code");

    static private final SubLString $str_alt176$_Done_ = makeString("[Done]");

    private static final SubLSymbol $RENDERED = makeKeyword("RENDERED");



    private static final SubLSymbol CB_UIAT_PROCDESC_DONE_SIMPLE_RENDER = makeSymbol("CB-UIAT-PROCDESC-DONE-SIMPLE-RENDER");

    static private final SubLString $str_alt180$Process_Description_for_ = makeString("Process Description for ");

    static private final SubLString $str_alt181$_completed_ = makeString(" completed!");

    static private final SubLString $str_alt182$The_description_of_the_process_ = makeString("The description of the process ");

    static private final SubLString $str_alt183$_has_been_completed_ = makeString(" has been completed.");

    private static final SubLSymbol $UIAT_PROCDESC_DONE = makeKeyword("UIAT-PROCDESC-DONE");

    static private final SubLString $str_alt185$cb_uiat_procdesc_done = makeString("cb-uiat-procdesc-done");

    private static final SubLSymbol CB_LINK_UIAT_PROCDESC_DONE = makeSymbol("CB-LINK-UIAT-PROCDESC-DONE");

    static private final SubLList $list_alt187 = list(makeSymbol("INTERACTION"));

    private static final SubLSymbol CB_UIAT_PROCDESC_DONE = makeSymbol("CB-UIAT-PROCDESC-DONE");

    // // Initializers
    @Override
    public void declareFunctions() {
        declare_cb_uia_tools_wizards_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_uia_tools_wizards_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_uia_tools_wizards_file();
    }
}

