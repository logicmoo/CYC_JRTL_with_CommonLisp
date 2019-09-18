/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nthcdr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.parse_integer;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CB-PREDICATE-CREATOR
 *  source file: /cyc/top/cycl/cb-predicate-creator.lisp
 *  created:     2019/07/03 17:38:11
 */
public final class cb_predicate_creator extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_predicate_creator() {
    }

    public static final SubLFile me = new cb_predicate_creator();


    // // Definitions
    public static final SubLObject cb_uia_debug_pc_session(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject id_string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt0);
                id_string = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                        SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, id_string);
                        SubLObject pc_session = user_interaction_agenda.ui_state_lookup(interaction, $PC_SESSION, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_1 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        cb_predicate_creator_debug(pc_session);
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
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
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt0);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_uia_debug_pc_session(SubLObject v_object, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(v_object, PC_SESSION_P);
            {
                SubLObject interaction = rkf_predicate_creator.pc_session_interaction(v_object);
                SubLObject id = user_interaction_agenda.ui_id(interaction);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt5$cb_uia_debug_pc_session__A, id);
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
                        if (NIL != linktext) {
                            html_utilities.html_princ(linktext);
                        } else {
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt6$_PC__A_, id);
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return v_object;
        }
    }

    public static final SubLObject cb_uia_debug_pc_session_method(SubLObject v_object) {
        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        cb_utilities.cb_link($UIA_DEBUG_PC_SESSION, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_predicate_creator_debug(SubLObject pc_session) {
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ($str_alt10$PC_SESSION);
        html_utilities.html_newline(UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_newline(UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ($$$Interaction);
        html_utilities.html_princ($str_alt12$__);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        cb_uia_debugging.cb_uia_debug(rkf_predicate_creator.pc_session_interaction(pc_session));
        html_utilities.html_newline(UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ($$$Mode);
        html_utilities.html_princ($str_alt12$__);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_prin1(rkf_predicate_creator.pc_session_mode(pc_session));
        html_utilities.html_newline(UNPROVIDED);
        html_utilities.html_newline(UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ($$$Arity);
        html_utilities.html_princ($str_alt12$__);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_prin1(rkf_predicate_creator.pc_session_arity(pc_session));
        html_utilities.html_newline(UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ($$$Full_Examples);
        html_utilities.html_princ($str_alt12$__);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        cb_uia_debugging.cb_uia_debug(rkf_predicate_creator.pc_session_full_examples(pc_session));
        html_utilities.html_newline(UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ($$$Arg_Examples);
        html_utilities.html_princ($str_alt12$__);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        cb_uia_debugging.cb_uia_debug(rkf_predicate_creator.pc_session_arg_examples(pc_session));
        html_utilities.html_newline(UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ($$$Constraints_Via_Examples);
        html_utilities.html_princ($str_alt12$__);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        cb_uia_debugging.cb_uia_debug(rkf_predicate_creator.pc_session_constraints_via_examples(pc_session));
        html_utilities.html_newline(UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ($$$Generalized_Constraints);
        html_utilities.html_princ($str_alt12$__);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        cb_uia_debugging.cb_uia_debug(rkf_predicate_creator.pc_session_generalized_constraints(pc_session));
        html_utilities.html_newline(UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ($$$Template);
        html_utilities.html_princ($str_alt12$__);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_prin1(rkf_predicate_creator.pc_session_template(pc_session));
        html_utilities.html_newline(UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ($$$Predicate);
        html_utilities.html_princ($str_alt12$__);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        cb_uia_debugging.cb_uia_debug(rkf_predicate_creator.pc_session_predicate(pc_session));
        html_utilities.html_newline(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject uia_act_new_predicate_creator(SubLObject v_agenda, SubLObject mode, SubLObject v_arity, SubLObject full_example) {
        if (v_arity == UNPROVIDED) {
            v_arity = NIL;
        }
        if (full_example == UNPROVIDED) {
            full_example = NIL;
        }
        {
            SubLObject args = NIL;
            if (NIL != full_example) {
                args = list(v_arity, full_example);
            } else
                if (NIL != v_arity) {
                    args = list(v_arity);
                } else {
                    args = NIL;
                }

            {
                SubLObject interaction = user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $PREDICATE_CREATOR, args, UNPROVIDED);
                SubLObject pc_session = rkf_predicate_creator.pc_session_act_create(interaction);
                user_interaction_agenda.ui_state_update(interaction, $PC_SESSION, pc_session);
                if (NIL != v_arity) {
                    rkf_predicate_creator.pc_session_act_set_arity(pc_session, v_arity);
                    if (NIL != full_example) {
                        rkf_predicate_creator.pc_session_act_add_full_example(pc_session, full_example);
                    }
                }
                return interaction;
            }
        }
    }

    public static final SubLObject uia_act_complete_predicate_creator(SubLObject v_agenda, SubLObject interaction, SubLObject pc_session, SubLObject predicate) {
        {
            SubLObject full_example_formulas = rkf_predicate_creator.pc_session_full_example_formulas(pc_session);
            SubLObject cdolist_list_var = full_example_formulas;
            SubLObject full_example_formula = NIL;
            for (full_example_formula = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , full_example_formula = cdolist_list_var.first()) {
                uia_tools_introduction.uia_act_new_assertion_creator(v_agenda, $REQUIRED, NIL, full_example_formula, UNPROVIDED);
            }
        }
        cb_uiat_lexification_wizard.uia_act_new_lexification_wizard(v_agenda, predicate, $REQUIRED, UNPROVIDED);
        return user_interaction_agenda.uia_act_complete(v_agenda, interaction, predicate);
    }

    public static final SubLObject uiat_predicate_creator_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject pc_session = user_interaction_agenda.ui_state_lookup(parent, $PC_SESSION, UNPROVIDED);
            SubLObject result = user_interaction_agenda.ui_result(child);
            SubLObject operator = user_interaction_agenda.ui_operator(child);
            SubLObject pcase_var = operator;
            if (pcase_var.eql($PC_ADD_FULL_EXAMPLE)) {
                rkf_predicate_creator.pc_session_act_add_full_example(pc_session, result);
            } else
                if (pcase_var.eql($PC_ADD_ARG_EXAMPLE)) {
                    {
                        SubLObject datum = user_interaction_agenda.ui_args(child);
                        SubLObject current = datum;
                        SubLObject arg = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt27);
                        arg = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            rkf_predicate_creator.pc_session_act_add_arg_example(pc_session, arg, result);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt27);
                        }
                    }
                }

        }
        return parent;
    }

    /**
     * How many sub-rejections reject the whole of the interaction.
     */
    // deflexical
    private static final SubLSymbol $uiat_predicate_creator_reject_counter$ = makeSymbol("*UIAT-PREDICATE-CREATOR-REJECT-COUNTER*");

    public static final SubLObject uiat_predicate_creator_child_rejected(SubLObject parent, SubLObject child) {
        {
            SubLObject rejections = user_interaction_agenda.ui_state_lookup(parent, $REJECT_COUNT, ZERO_INTEGER);
            rejections = add(rejections, ONE_INTEGER);
            user_interaction_agenda.ui_state_update(parent, $REJECT_COUNT, rejections);
            if (!rejections.numL($uiat_predicate_creator_reject_counter$.getGlobalValue())) {
                user_interaction_agenda.uia_act_reject(user_interaction_agenda.ui_agenda(parent), parent);
            }
        }
        return parent;
    }

    public static final SubLObject uiat_predicate_creator_hint(SubLObject interaction) {
        return $$$Create_Predicate;
    }

    public static final SubLObject cb_uiat_predicate_creator_display(SubLObject interaction) {
        {
            SubLObject pc_session = user_interaction_agenda.ui_state_lookup(interaction, $PC_SESSION, UNPROVIDED);
            SubLObject mode = rkf_predicate_creator.pc_session_mode(pc_session);
            SubLObject pcase_var = mode;
            if (pcase_var.eql($ARITY)) {
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
                cb_predicate_creator_specify_arity(pc_session);
                cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            } else
                if (pcase_var.eql($EXAMPLES)) {
                    {
                        SubLObject full_examples = rkf_predicate_creator.pc_session_full_examples(pc_session);
                        if (NIL == full_examples) {
                            {
                                SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                                SubLObject v_arity = rkf_predicate_creator.pc_session_arity(pc_session);
                                SubLObject child = uia_act_new_pc_add_full_example(v_agenda, $REQUIRED, v_arity);
                                user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                                cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                            }
                        } else {
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
                            cb_predicate_creator_show_constraints_via_examples(interaction, pc_session);
                            cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
                            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                    }
                } else
                    if (pcase_var.eql($CONSTRAINTS)) {
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
                        cb_predicate_creator_generalize_constraints(pc_session);
                        cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } else
                        if (pcase_var.eql($TEMPLATE)) {
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
                            cb_predicate_creator_specify_template(pc_session);
                            cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
                            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } else
                            if (pcase_var.eql($READY) || pcase_var.eql($DONE)) {
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
                                cb_predicate_creator_debug(pc_session);
                                cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
                                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } else {
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
                                cb_predicate_creator_debug(pc_session);
                                cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
                                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            }




        }
        return NIL;
    }

    public static final SubLObject uia_act_new_pc_add_full_example(SubLObject v_agenda, SubLObject mode, SubLObject v_arity) {
        {
            SubLObject interaction = user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $PC_ADD_FULL_EXAMPLE, list(v_arity), UNPROVIDED);
            user_interaction_agenda.ui_state_update(interaction, $TOTAL_COMPLETED, ZERO_INTEGER);
            user_interaction_agenda.ui_state_update(interaction, $TEMPLATE, make_list(v_arity, $UNSPECIFIED));
            return interaction;
        }
    }

    public static final SubLObject uiat_pc_add_full_example_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
            SubLObject result = user_interaction_agenda.ui_result(child);
            if ($NONE == result) {
                user_interaction_agenda.uia_act_invalidate(v_agenda, parent);
            } else {
                {
                    SubLObject datum = user_interaction_agenda.ui_args(parent);
                    SubLObject current = datum;
                    SubLObject v_arity = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt41);
                    v_arity = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject total_completed = user_interaction_agenda.ui_state_lookup(parent, $TOTAL_COMPLETED, UNPROVIDED);
                            SubLObject template = user_interaction_agenda.ui_state_lookup(parent, $TEMPLATE, UNPROVIDED);
                            SubLObject arg = user_interaction_agenda.ui_state_lookup(child, $MY_RESULT_WILL_BE, UNPROVIDED);
                            set_nth(subtract(arg, ONE_INTEGER), template, result);
                            user_interaction_agenda.ui_state_update(parent, $TEMPLATE, template);
                            total_completed = add(total_completed, ONE_INTEGER);
                            user_interaction_agenda.ui_state_update(parent, $TOTAL_COMPLETED, total_completed);
                            if (v_arity.numE(total_completed)) {
                                user_interaction_agenda.uia_act_complete(v_agenda, parent, template);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt41);
                    }
                }
            }
        }
        return parent;
    }

    public static final SubLObject uiat_pc_add_full_example_hint(SubLObject interaction) {
        return $$$Add_Full_Example;
    }

    public static final SubLObject cb_uiat_pc_add_full_example_display(SubLObject interaction) {
        {
            SubLObject parent = user_interaction_agenda.ui_parent_interaction(interaction);
            SubLObject pc_session = user_interaction_agenda.ui_state_lookup(parent, $PC_SESSION, UNPROVIDED);
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
            cb_predicate_creator_add_full_example(interaction, parent, pc_session);
            cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject cb_predicate_creator_add_full_example(SubLObject interaction, SubLObject parent, SubLObject pc_session) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_arity = rkf_predicate_creator.pc_session_arity(pc_session);
                SubLObject column_count = subtract(multiply(v_arity, TWO_INTEGER), ONE_INTEGER);
                SubLObject full_examples = rkf_predicate_creator.pc_session_full_examples(pc_session);
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
                        html_utilities.html_hidden_input($str_alt44$cb_predicate_creator_handle_add_f, T, UNPROVIDED);
                        html_utilities.html_hidden_input($$$id, user_interaction_agenda.ui_id(interaction), UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(ZERO_INTEGER);
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
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (NIL != column_count) {
                                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(column_count);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_princ($$$Add_a_Full_Example);
                                                html_utilities.html_newline(TWO_INTEGER);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                if (NIL != full_examples) {
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            if (NIL != column_count) {
                                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(column_count);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_princ($str_alt47$Current_Examples__);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        {
                                            SubLObject i = NIL;
                                            for (i = ZERO_INTEGER; i.numL(v_arity); i = add(i, ONE_INTEGER)) {
                                                if (!i.numE(ZERO_INTEGER)) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                                                            html_utilities.html_princ($str_alt48$__);
                                                            html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                }
                                                {
                                                    SubLObject arg = add(i, ONE_INTEGER);
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt50$Argument__A, arg);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                }
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                {
                                    SubLObject cdolist_list_var = full_examples;
                                    SubLObject full_example = NIL;
                                    for (full_example = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , full_example = cdolist_list_var.first()) {
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                {
                                                    SubLObject cdolist_list_var_11 = full_example;
                                                    SubLObject value = NIL;
                                                    for (value = cdolist_list_var_11.first(); NIL != cdolist_list_var_11; cdolist_list_var_11 = cdolist_list_var_11.rest() , value = cdolist_list_var_11.first()) {
                                                        if (value != full_example.first()) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                                                                    html_utilities.html_princ($str_alt48$__);
                                                                    html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
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
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($TOP));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                cb_uia_display_primitives.cb_uia_show_term(value, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    }
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        {
                                            SubLObject i = NIL;
                                            for (i = ZERO_INTEGER; i.numL(v_arity); i = add(i, ONE_INTEGER)) {
                                                if (!i.numE(ZERO_INTEGER)) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                                                            html_utilities.html_princ($str_alt48$__);
                                                            html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                }
                                                {
                                                    SubLObject arg = add(i, ONE_INTEGER);
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_text_input(arg, NIL, TWENTY_INTEGER);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                }
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
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
                                        if (NIL != column_count) {
                                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(column_count);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
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

    public static final SubLObject cb_predicate_creator_handle_add_full_example(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject id_string = html_utilities.html_extract_input($$$id, args);
            SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, id_string);
            SubLObject arg_examples = NIL;
            {
                SubLObject datum = nthcdr(TWO_INTEGER, args);
                SubLObject current = datum;
                SubLObject example_specs = current;
                SubLObject cdolist_list_var = example_specs;
                SubLObject example_spec = NIL;
                for (example_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , example_spec = cdolist_list_var.first()) {
                    {
                        SubLObject datum_19 = example_spec;
                        SubLObject current_20 = datum_19;
                        SubLObject arg_string = NIL;
                        SubLObject example_string = NIL;
                        destructuring_bind_must_consp(current_20, datum_19, $list_alt53);
                        arg_string = current_20.first();
                        current_20 = current_20.rest();
                        destructuring_bind_must_consp(current_20, datum_19, $list_alt53);
                        example_string = current_20.first();
                        current_20 = current_20.rest();
                        if (NIL == current_20) {
                            if (NIL != string_utilities.empty_string_p(example_string)) {
                                return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                            }
                            {
                                SubLObject arg = read_from_string_ignoring_errors(arg_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                arg_examples = cons(list(arg, example_string), arg_examples);
                            }
                        } else {
                            cdestructuring_bind_error(datum_19, $list_alt53);
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = arg_examples;
                SubLObject arg_example = NIL;
                for (arg_example = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_example = cdolist_list_var.first()) {
                    {
                        SubLObject datum = arg_example;
                        SubLObject current = datum;
                        SubLObject arg = NIL;
                        SubLObject example_string = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt54);
                        arg = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt54);
                        example_string = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject child = uia_tools_basic.uia_act_new_concept_disambiguator(v_agenda, $REQUIRED, example_string, arg, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt54);
                        }
                    }
                }
            }
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject uia_act_new_pc_add_arg_example(SubLObject v_agenda, SubLObject mode, SubLObject arg) {
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $PC_ADD_ARG_EXAMPLE, list(arg), UNPROVIDED);
    }

    public static final SubLObject uiat_pc_add_arg_example_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
            SubLObject result = user_interaction_agenda.ui_result(child);
            if ($NONE == result) {
                user_interaction_agenda.uia_act_invalidate(v_agenda, parent);
            } else {
                user_interaction_agenda.uia_act_complete(v_agenda, parent, result);
            }
        }
        return parent;
    }

    public static final SubLObject uiat_pc_add_arg_example_hint(SubLObject interaction) {
        {
            SubLObject datum = user_interaction_agenda.ui_args(interaction);
            SubLObject current = datum;
            SubLObject arg = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt27);
            arg = current.first();
            current = current.rest();
            if (NIL == current) {
                return format(NIL, $str_alt58$Add_Arg__A_Example, arg);
            } else {
                cdestructuring_bind_error(datum, $list_alt27);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_pc_add_arg_example_display(SubLObject interaction) {
        {
            SubLObject parent = user_interaction_agenda.ui_parent_interaction(interaction);
            SubLObject pc_session = user_interaction_agenda.ui_state_lookup(parent, $PC_SESSION, UNPROVIDED);
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
            cb_predicate_creator_add_arg_example(interaction, parent, pc_session);
            cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject cb_predicate_creator_add_arg_example(SubLObject interaction, SubLObject parent, SubLObject pc_session) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = user_interaction_agenda.ui_args(interaction);
                SubLObject current = datum;
                SubLObject arg = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt27);
                arg = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject arg_examples = remove(arg, rkf_predicate_creator.pc_session_arg_examples(pc_session), symbol_function(NOT_EQ), symbol_function(FIRST), UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
                                html_utilities.html_hidden_input($str_alt61$cb_predicate_creator_handle_add_a, T, UNPROVIDED);
                                html_utilities.html_hidden_input($$$id, user_interaction_agenda.ui_id(interaction), UNPROVIDED);
                                html_utilities.html_hidden_input($$$arg, arg, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(ZERO_INTEGER);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt58$Add_Arg__A_Example, arg);
                                                        html_utilities.html_newline(TWO_INTEGER);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        if (NIL != arg_examples) {
                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_princ($str_alt47$Current_Examples__);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                    SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt50$Argument__A, arg);
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
                                        {
                                            SubLObject cdolist_list_var = arg_examples;
                                            SubLObject arg_example = NIL;
                                            for (arg_example = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_example = cdolist_list_var.first()) {
                                                {
                                                    SubLObject value = second(arg_example);
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
                                                                SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    cb_uia_display_primitives.cb_uia_show_term(value, UNPROVIDED);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
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
                                                    html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_text_input($$$example, NIL, TWENTY_INTEGER);
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
                                            SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
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
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                            } finally {
                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt27);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_predicate_creator_handle_add_arg_example(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject id_string = html_utilities.html_extract_input($$$id, args);
            SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, id_string);
            SubLObject arg_string = html_utilities.html_extract_input($$$arg, args);
            SubLObject arg = read_from_string_ignoring_errors(arg_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject example = html_utilities.html_extract_input($$$example, args);
            if (NIL != string_utilities.empty_string_p(example)) {
                return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
            }
            {
                SubLObject child = uia_tools_basic.uia_act_new_concept_disambiguator(v_agenda, $REQUIRED, example, arg, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
            }
        }
    }

    public static final SubLObject cb_predicate_creator_specify_arity(SubLObject pc_session) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject interaction = rkf_predicate_creator.pc_session_interaction(pc_session);
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
                        html_utilities.html_hidden_input($str_alt65$cb_predicate_creator_handle_speci, T, UNPROVIDED);
                        html_utilities.html_hidden_input($$$id, user_interaction_agenda.ui_id(interaction), UNPROVIDED);
                        html_utilities.html_princ($$$The_new_relation_will_relate);
                        html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($$$arity);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(ONE_INTEGER);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                {
                                    SubLObject i = NIL;
                                    for (i = ZERO_INTEGER; i.numL(FIVE_INTEGER); i = add(i, ONE_INTEGER)) {
                                        {
                                            SubLObject v_arity = add(i, ONE_INTEGER);
                                            SubLObject selected = numE(TWO_INTEGER, v_arity);
                                            html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                            if (NIL != selected) {
                                                html_utilities.html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                            }
                                            if (NIL != v_arity) {
                                                html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(v_arity);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_princ(v_arity);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_35, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                        }
                                    }
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                        html_utilities.html_princ($str_alt68$concepts_);
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
            return NIL;
        }
    }

    public static final SubLObject cb_predicate_creator_handle_specify_arity(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject id_string = html_utilities.html_extract_input($$$id, args);
            SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, id_string);
            SubLObject pc_session = user_interaction_agenda.ui_state_lookup(interaction, $PC_SESSION, UNPROVIDED);
            SubLObject arity_string = html_utilities.html_extract_input($$$arity, args);
            SubLObject v_arity = read_from_string_ignoring_errors(arity_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            rkf_predicate_creator.pc_session_act_set_arity(pc_session, v_arity);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_predicate_creator_show_constraints_via_examples(SubLObject interaction, SubLObject pc_session) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_arity = rkf_predicate_creator.pc_session_arity(pc_session);
                SubLObject column_count = add(ONE_INTEGER, multiply(TWO_INTEGER, v_arity));
                SubLObject full_examples = rkf_predicate_creator.pc_session_full_examples(pc_session);
                SubLObject arg_examples = rkf_predicate_creator.pc_session_arg_examples(pc_session);
                SubLObject constraints_via_examples = rkf_predicate_creator.pc_session_constraints_via_examples(pc_session);
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
                            SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (NIL != column_count) {
                                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(column_count);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($$$Specifying_Examples);
                                        if (NIL != full_examples) {
                                            html_utilities.html_indent(TWO_INTEGER);
                                            cb_utilities.cb_link($UIA_PC_CONTINUE, interaction, $str_alt72$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        if (NIL != arg_examples) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_38 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (NIL != column_count) {
                                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(column_count);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_39 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_newline(UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_41 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            if (NIL != constraints_via_examples) {
                                                html_utilities.html_princ($str_alt73$Must_be____);
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_41, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    {
                                        SubLObject i = NIL;
                                        for (i = ZERO_INTEGER; i.numL(v_arity); i = add(i, ONE_INTEGER)) {
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_indent(TWO_INTEGER);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_42, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            {
                                                SubLObject arg = add(ONE_INTEGER, i);
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_43 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt50$Argument__A, arg);
                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_43, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            }
                                        }
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_40, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                        if (NIL != find($$argIsa, constraints_via_examples, symbol_function(EQL), symbol_function(SECOND), UNPROVIDED, UNPROVIDED)) {
                            {
                                SubLObject constraints = remove($$argIsa, constraints_via_examples, symbol_function(NOT_EQL), symbol_function(SECOND), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_44 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_princ($str_alt77$____an_instance_of__);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        {
                                            SubLObject i = NIL;
                                            for (i = ZERO_INTEGER; i.numL(v_arity); i = add(i, ONE_INTEGER)) {
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_46 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_indent(TWO_INTEGER);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                {
                                                    SubLObject arg = add(ONE_INTEGER, i);
                                                    SubLObject constraints_for_arg = remove(arg, constraints, symbol_function(NOT_EQ), symbol_function(FIRST), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_47 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            {
                                                                SubLObject cdolist_list_var = constraints_for_arg;
                                                                SubLObject constraint = NIL;
                                                                for (constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint = cdolist_list_var.first()) {
                                                                    {
                                                                        SubLObject value = third(constraint);
                                                                        if (constraint != constraints_for_arg.first()) {
                                                                            html_utilities.html_newline(UNPROVIDED);
                                                                        }
                                                                        cb_uia_display_primitives.cb_uia_show_term(value, UNPROVIDED);
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_47, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                }
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            }
                        }
                        if (NIL != find($$argGenl, constraints_via_examples, symbol_function(EQL), symbol_function(SECOND), UNPROVIDED, UNPROVIDED)) {
                            {
                                SubLObject constraints = remove($$argGenl, constraints_via_examples, symbol_function(NOT_EQL), symbol_function(SECOND), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_princ($str_alt79$____a_kind_of__);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        {
                                            SubLObject i = NIL;
                                            for (i = ZERO_INTEGER; i.numL(v_arity); i = add(i, ONE_INTEGER)) {
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_50 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_indent(TWO_INTEGER);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_50, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                {
                                                    SubLObject arg = add(ONE_INTEGER, i);
                                                    SubLObject constraints_for_arg = remove(arg, constraints, symbol_function(NOT_EQ), symbol_function(FIRST), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_51 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            {
                                                                SubLObject cdolist_list_var = constraints_for_arg;
                                                                SubLObject constraint = NIL;
                                                                for (constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint = cdolist_list_var.first()) {
                                                                    {
                                                                        SubLObject value = third(constraint);
                                                                        if (constraint != constraints_for_arg.first()) {
                                                                            html_utilities.html_newline(UNPROVIDED);
                                                                        }
                                                                        cb_uia_display_primitives.cb_uia_show_term(value, UNPROVIDED);
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_51, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                }
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_48, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            }
                        }
                        if (NIL != arg_examples) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_52 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (NIL != column_count) {
                                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(column_count);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_53 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_53, thread);
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
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_54 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_55 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Full_Examples);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_55, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                {
                                    SubLObject remaining_columns = subtract(column_count, TWO_INTEGER);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (NIL != remaining_columns) {
                                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(remaining_columns);
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
                                        SubLObject _prev_bind_0_56 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            cb_utilities.cb_link($UIA_PC_ADD_FULL_EXAMPLE, interaction, $str_alt82$_Add_Example_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_56, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_54, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        if (NIL == full_examples) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_57 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (NIL != column_count) {
                                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(column_count);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_58 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($$$None);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_58, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_57, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } else {
                            {
                                SubLObject list_var = NIL;
                                SubLObject full_example = NIL;
                                SubLObject index = NIL;
                                for (list_var = full_examples, full_example = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , full_example = list_var.first() , index = add(ONE_INTEGER, index)) {
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_59 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_60 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    cb_utilities.cb_link($UIA_PC_REM_FULL_EXAMPLE, interaction, index, $str_alt85$_Delete_, UNPROVIDED, UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_60, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            {
                                                SubLObject cdolist_list_var = full_example;
                                                SubLObject value = NIL;
                                                for (value = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , value = cdolist_list_var.first()) {
                                                    if (value != full_example.first()) {
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
                                                            SubLObject _prev_bind_0_61 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                                                                html_utilities.html_princ($str_alt48$__);
                                                                html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_61, thread);
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
                                                            cb_uia_display_primitives.cb_uia_show_term(value, UNPROVIDED);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_62, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                }
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_59, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                }
                            }
                        }
                        if (NIL != arg_examples) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_63 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (NIL != column_count) {
                                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(column_count);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_64 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_64, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_63, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_65 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        SubLObject _prev_bind_0_66 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_utilities.html_princ($$$Arg_Examples);
                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_66, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    {
                                        SubLObject i = NIL;
                                        for (i = ZERO_INTEGER; i.numL(v_arity); i = add(i, ONE_INTEGER)) {
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_67 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_indent(TWO_INTEGER);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_67, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            {
                                                SubLObject arg = add(ONE_INTEGER, i);
                                                SubLObject examples_for_arg = remove(arg, arg_examples, symbol_function(NOT_EQ), symbol_function(FIRST), UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
                                                    SubLObject _prev_bind_0_68 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
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
                                                            SubLObject _prev_bind_0_69 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
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
                                                                            html_utilities.html_markup(html_utilities.html_align($LEFT));
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_71 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                cb_utilities.cb_link($UIA_PC_ADD_ARG_EXAMPLE, interaction, arg, $str_alt88$_Add_, UNPROVIDED, UNPROVIDED);
                                                                                {
                                                                                    SubLObject list_var = NIL;
                                                                                    SubLObject example = NIL;
                                                                                    SubLObject index = NIL;
                                                                                    for (list_var = examples_for_arg, example = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , example = list_var.first() , index = add(ONE_INTEGER, index)) {
                                                                                        {
                                                                                            SubLObject value = second(example);
                                                                                            html_utilities.html_newline(UNPROVIDED);
                                                                                            cb_utilities.cb_link($UIA_PC_REM_ARG_EXAMPLE, interaction, arg, index, $str_alt90$___, UNPROVIDED);
                                                                                            html_utilities.html_indent(UNPROVIDED);
                                                                                            cb_uia_display_primitives.cb_uia_show_term(value, UNPROVIDED);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_71, thread);
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
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_69, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_68, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            }
                                        }
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_65, thread);
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

    public static final SubLObject cb_pc_continue_link(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, id_string);
                    SubLObject pc_session = user_interaction_agenda.ui_state_lookup(interaction, $PC_SESSION, UNPROVIDED);
                    SubLObject mode = rkf_predicate_creator.pc_session_mode(pc_session);
                    SubLObject pcase_var = mode;
                    if (pcase_var.eql($EXAMPLES)) {
                        rkf_predicate_creator.pc_session_act_accept_examples(pc_session);
                        rkf_predicate_creator.pc_session_act_complete_from_examples(pc_session);
                        {
                            SubLObject predicate = rkf_predicate_creator.pc_session_predicate(pc_session);
                            uia_act_complete_predicate_creator(v_agenda, interaction, pc_session, predicate);
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_link_uia_pc_continue(SubLObject interaction, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt72$_Continue_;
            }
            {
                SubLObject id = user_interaction_agenda.ui_id(interaction);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt92$cb_pc_continue_link__A, id);
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

    public static final SubLObject cb_pc_handle_add_full_example_link(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, id_string);
                    SubLObject pc_session = user_interaction_agenda.ui_state_lookup(interaction, $PC_SESSION, UNPROVIDED);
                    SubLObject v_arity = rkf_predicate_creator.pc_session_arity(pc_session);
                    SubLObject child = uia_act_new_pc_add_full_example(v_agenda, $REQUIRED, v_arity);
                    user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                    return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_uia_pc_add_full_example(SubLObject interaction, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt88$_Add_;
            }
            {
                SubLObject id = user_interaction_agenda.ui_id(interaction);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt95$cb_pc_handle_add_full_example_lin, id);
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

    public static final SubLObject cb_pc_handle_rem_full_example_link(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject id_string = NIL;
            SubLObject example_id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt97);
            id_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt97);
            example_id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, id_string);
                    SubLObject example_id = parse_integer(example_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject pc_session = user_interaction_agenda.ui_state_lookup(interaction, $PC_SESSION, UNPROVIDED);
                    SubLObject full_example = nth(example_id, rkf_predicate_creator.pc_session_full_examples(pc_session));
                    rkf_predicate_creator.pc_session_act_rem_full_example(pc_session, full_example);
                    return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt97);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_uia_pc_rem_full_example(SubLObject interaction, SubLObject example_id, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt90$___;
            }
            {
                SubLObject id = user_interaction_agenda.ui_id(interaction);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt99$cb_pc_handle_rem_full_example_lin, id, example_id);
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

    public static final SubLObject cb_pc_handle_add_arg_example_link(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject id_string = NIL;
            SubLObject arg_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt101);
            id_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt101);
            arg_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, id_string);
                    SubLObject arg = parse_integer(arg_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject child = uia_act_new_pc_add_arg_example(v_agenda, $REQUIRED, arg);
                    user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                    return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt101);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_uia_pc_add_arg_example(SubLObject interaction, SubLObject arg, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt88$_Add_;
            }
            {
                SubLObject id = user_interaction_agenda.ui_id(interaction);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt103$cb_pc_handle_add_arg_example_link, id, arg);
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

    public static final SubLObject cb_pc_handle_rem_arg_example_link(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject id_string = NIL;
            SubLObject arg_string = NIL;
            SubLObject example_id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt105);
            id_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt105);
            arg_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt105);
            example_id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, id_string);
                    SubLObject arg = parse_integer(arg_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject example_id = parse_integer(example_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject pc_session = user_interaction_agenda.ui_state_lookup(interaction, $PC_SESSION, UNPROVIDED);
                    SubLObject arg_examples = remove(arg, rkf_predicate_creator.pc_session_arg_examples(pc_session), symbol_function(NOT_EQ), symbol_function(FIRST), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject example = second(nth(example_id, arg_examples));
                    rkf_predicate_creator.pc_session_act_rem_arg_example(pc_session, arg, example);
                    return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt105);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_uia_pc_rem_arg_example(SubLObject interaction, SubLObject arg, SubLObject example_id, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt90$___;
            }
            {
                SubLObject id = user_interaction_agenda.ui_id(interaction);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt107$cb_pc_handle_rem_arg_example_link, new SubLObject[]{ id, arg, example_id });
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

    public static final SubLObject cb_predicate_creator_generalize_constraints(SubLObject pc_session) {
        html_utilities.html_princ($$$Generalize_Constraints);
        return NIL;
    }

    public static final SubLObject cb_predicate_creator_specify_template(SubLObject pc_session) {
        html_utilities.html_princ($$$Specifying_Template);
        return NIL;
    }

    public static final SubLObject declare_cb_predicate_creator_file() {
        declareFunction("cb_uia_debug_pc_session", "CB-UIA-DEBUG-PC-SESSION", 1, 0, false);
        declareFunction("cb_link_uia_debug_pc_session", "CB-LINK-UIA-DEBUG-PC-SESSION", 1, 1, false);
        declareFunction("cb_uia_debug_pc_session_method", "CB-UIA-DEBUG-PC-SESSION-METHOD", 1, 0, false);
        declareFunction("cb_predicate_creator_debug", "CB-PREDICATE-CREATOR-DEBUG", 1, 0, false);
        declareFunction("uia_act_new_predicate_creator", "UIA-ACT-NEW-PREDICATE-CREATOR", 2, 2, false);
        declareFunction("uia_act_complete_predicate_creator", "UIA-ACT-COMPLETE-PREDICATE-CREATOR", 4, 0, false);
        declareFunction("uiat_predicate_creator_child_completed", "UIAT-PREDICATE-CREATOR-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_predicate_creator_child_rejected", "UIAT-PREDICATE-CREATOR-CHILD-REJECTED", 2, 0, false);
        declareFunction("uiat_predicate_creator_hint", "UIAT-PREDICATE-CREATOR-HINT", 1, 0, false);
        declareFunction("cb_uiat_predicate_creator_display", "CB-UIAT-PREDICATE-CREATOR-DISPLAY", 1, 0, false);
        declareFunction("uia_act_new_pc_add_full_example", "UIA-ACT-NEW-PC-ADD-FULL-EXAMPLE", 3, 0, false);
        declareFunction("uiat_pc_add_full_example_child_completed", "UIAT-PC-ADD-FULL-EXAMPLE-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_pc_add_full_example_hint", "UIAT-PC-ADD-FULL-EXAMPLE-HINT", 1, 0, false);
        declareFunction("cb_uiat_pc_add_full_example_display", "CB-UIAT-PC-ADD-FULL-EXAMPLE-DISPLAY", 1, 0, false);
        declareFunction("cb_predicate_creator_add_full_example", "CB-PREDICATE-CREATOR-ADD-FULL-EXAMPLE", 3, 0, false);
        declareFunction("cb_predicate_creator_handle_add_full_example", "CB-PREDICATE-CREATOR-HANDLE-ADD-FULL-EXAMPLE", 1, 0, false);
        declareFunction("uia_act_new_pc_add_arg_example", "UIA-ACT-NEW-PC-ADD-ARG-EXAMPLE", 3, 0, false);
        declareFunction("uiat_pc_add_arg_example_child_completed", "UIAT-PC-ADD-ARG-EXAMPLE-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_pc_add_arg_example_hint", "UIAT-PC-ADD-ARG-EXAMPLE-HINT", 1, 0, false);
        declareFunction("cb_uiat_pc_add_arg_example_display", "CB-UIAT-PC-ADD-ARG-EXAMPLE-DISPLAY", 1, 0, false);
        declareFunction("cb_predicate_creator_add_arg_example", "CB-PREDICATE-CREATOR-ADD-ARG-EXAMPLE", 3, 0, false);
        declareFunction("cb_predicate_creator_handle_add_arg_example", "CB-PREDICATE-CREATOR-HANDLE-ADD-ARG-EXAMPLE", 1, 0, false);
        declareFunction("cb_predicate_creator_specify_arity", "CB-PREDICATE-CREATOR-SPECIFY-ARITY", 1, 0, false);
        declareFunction("cb_predicate_creator_handle_specify_arity", "CB-PREDICATE-CREATOR-HANDLE-SPECIFY-ARITY", 1, 0, false);
        declareFunction("cb_predicate_creator_show_constraints_via_examples", "CB-PREDICATE-CREATOR-SHOW-CONSTRAINTS-VIA-EXAMPLES", 2, 0, false);
        declareFunction("cb_pc_continue_link", "CB-PC-CONTINUE-LINK", 1, 0, false);
        declareFunction("cb_link_uia_pc_continue", "CB-LINK-UIA-PC-CONTINUE", 1, 1, false);
        declareFunction("cb_pc_handle_add_full_example_link", "CB-PC-HANDLE-ADD-FULL-EXAMPLE-LINK", 1, 0, false);
        declareFunction("cb_link_uia_pc_add_full_example", "CB-LINK-UIA-PC-ADD-FULL-EXAMPLE", 1, 1, false);
        declareFunction("cb_pc_handle_rem_full_example_link", "CB-PC-HANDLE-REM-FULL-EXAMPLE-LINK", 1, 0, false);
        declareFunction("cb_link_uia_pc_rem_full_example", "CB-LINK-UIA-PC-REM-FULL-EXAMPLE", 2, 1, false);
        declareFunction("cb_pc_handle_add_arg_example_link", "CB-PC-HANDLE-ADD-ARG-EXAMPLE-LINK", 1, 0, false);
        declareFunction("cb_link_uia_pc_add_arg_example", "CB-LINK-UIA-PC-ADD-ARG-EXAMPLE", 2, 1, false);
        declareFunction("cb_pc_handle_rem_arg_example_link", "CB-PC-HANDLE-REM-ARG-EXAMPLE-LINK", 1, 0, false);
        declareFunction("cb_link_uia_pc_rem_arg_example", "CB-LINK-UIA-PC-REM-ARG-EXAMPLE", 3, 1, false);
        declareFunction("cb_predicate_creator_generalize_constraints", "CB-PREDICATE-CREATOR-GENERALIZE-CONSTRAINTS", 1, 0, false);
        declareFunction("cb_predicate_creator_specify_template", "CB-PREDICATE-CREATOR-SPECIFY-TEMPLATE", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_predicate_creator_file() {
        deflexical("*UIAT-PREDICATE-CREATOR-REJECT-COUNTER*", THREE_INTEGER);
        return NIL;
    }

    public static final SubLObject setup_cb_predicate_creator_file() {
                html_macros.note_html_handler_function(CB_UIA_DEBUG_PC_SESSION);
        cb_utilities.setup_cb_link_method($UIA_DEBUG_PC_SESSION, CB_LINK_UIA_DEBUG_PC_SESSION, TWO_INTEGER);
        register_method(cb_uia_debugging.$cb_uia_debug_method_table$.getGlobalValue(), rkf_predicate_creator.$dtp_pc_session$.getGlobalValue(), symbol_function(CB_UIA_DEBUG_PC_SESSION_METHOD));
        uia_tool_declaration.declare_uia_tool($PREDICATE_CREATOR, $list_alt22);
        cb_uia_tool_declaration.declare_cb_uia_tool($PREDICATE_CREATOR, $list_alt23);
        uia_tool_declaration.declare_uia_tool($PC_ADD_FULL_EXAMPLE, $list_alt36);
        cb_uia_tool_declaration.declare_cb_uia_tool($PC_ADD_FULL_EXAMPLE, $list_alt37);
        html_macros.note_html_handler_function(CB_PREDICATE_CREATOR_HANDLE_ADD_FULL_EXAMPLE);
        uia_tool_declaration.declare_uia_tool($PC_ADD_ARG_EXAMPLE, $list_alt56);
        cb_uia_tool_declaration.declare_cb_uia_tool($PC_ADD_ARG_EXAMPLE, $list_alt57);
        html_macros.note_html_handler_function(CB_PREDICATE_CREATOR_HANDLE_ADD_ARG_EXAMPLE);
        html_macros.note_html_handler_function(CB_PREDICATE_CREATOR_HANDLE_SPECIFY_ARITY);
        html_macros.note_html_handler_function(CB_PC_CONTINUE_LINK);
        cb_utilities.setup_cb_link_method($UIA_PC_CONTINUE, CB_LINK_UIA_PC_CONTINUE, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_PC_HANDLE_ADD_FULL_EXAMPLE_LINK);
        cb_utilities.setup_cb_link_method($UIA_PC_ADD_FULL_EXAMPLE, CB_LINK_UIA_PC_ADD_FULL_EXAMPLE, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_PC_HANDLE_REM_FULL_EXAMPLE_LINK);
        cb_utilities.setup_cb_link_method($UIA_PC_REM_FULL_EXAMPLE, CB_LINK_UIA_PC_REM_FULL_EXAMPLE, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_PC_HANDLE_ADD_ARG_EXAMPLE_LINK);
        cb_utilities.setup_cb_link_method($UIA_PC_ADD_ARG_EXAMPLE, CB_LINK_UIA_PC_ADD_ARG_EXAMPLE, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_PC_HANDLE_REM_ARG_EXAMPLE_LINK);
        cb_utilities.setup_cb_link_method($UIA_PC_REM_ARG_EXAMPLE, CB_LINK_UIA_PC_REM_ARG_EXAMPLE, FOUR_INTEGER);
        return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(makeSymbol("ID-STRING"));

    private static final SubLSymbol $PC_SESSION = makeKeyword("PC-SESSION");

    private static final SubLSymbol CB_UIA_DEBUG_PC_SESSION = makeSymbol("CB-UIA-DEBUG-PC-SESSION");

    private static final SubLSymbol PC_SESSION_P = makeSymbol("PC-SESSION-P");

    private static final SubLSymbol $UIA_INTERACTION = makeKeyword("UIA-INTERACTION");

    static private final SubLString $str_alt5$cb_uia_debug_pc_session__A = makeString("cb-uia-debug-pc-session&~A");

    static private final SubLString $str_alt6$_PC__A_ = makeString("[PC ~A]");

    private static final SubLSymbol $UIA_DEBUG_PC_SESSION = makeKeyword("UIA-DEBUG-PC-SESSION");

    private static final SubLSymbol CB_LINK_UIA_DEBUG_PC_SESSION = makeSymbol("CB-LINK-UIA-DEBUG-PC-SESSION");

    private static final SubLSymbol CB_UIA_DEBUG_PC_SESSION_METHOD = makeSymbol("CB-UIA-DEBUG-PC-SESSION-METHOD");

    static private final SubLString $str_alt10$PC_SESSION = makeString("PC-SESSION");

    static private final SubLString $$$Interaction = makeString("Interaction");

    static private final SubLString $str_alt12$__ = makeString(": ");

    static private final SubLString $$$Mode = makeString("Mode");

    static private final SubLString $$$Arity = makeString("Arity");

    static private final SubLString $$$Full_Examples = makeString("Full Examples");

    static private final SubLString $$$Arg_Examples = makeString("Arg Examples");

    static private final SubLString $$$Constraints_Via_Examples = makeString("Constraints Via Examples");

    static private final SubLString $$$Generalized_Constraints = makeString("Generalized Constraints");

    static private final SubLString $$$Template = makeString("Template");

    static private final SubLString $$$Predicate = makeString("Predicate");

    private static final SubLSymbol $PREDICATE_CREATOR = makeKeyword("PREDICATE-CREATOR");

    static private final SubLList $list_alt22 = list($NAME, makeString("Predicate Creator"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-PREDICATE-CREATOR-HINT"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-PREDICATE-CREATOR-CHILD-COMPLETED"), makeKeyword("CHILD-REJECTED-METHOD"), makeSymbol("UIAT-PREDICATE-CREATOR-CHILD-REJECTED"));

    static private final SubLList $list_alt23 = list(makeKeyword("DISPLAY-METHOD"), makeSymbol("CB-UIAT-PREDICATE-CREATOR-DISPLAY"));



    private static final SubLSymbol $PC_ADD_FULL_EXAMPLE = makeKeyword("PC-ADD-FULL-EXAMPLE");

    private static final SubLSymbol $PC_ADD_ARG_EXAMPLE = makeKeyword("PC-ADD-ARG-EXAMPLE");

    static private final SubLList $list_alt27 = list(makeSymbol("ARG"));

    private static final SubLSymbol $REJECT_COUNT = makeKeyword("REJECT-COUNT");

    static private final SubLString $$$Create_Predicate = makeString("Create Predicate");













    static private final SubLList $list_alt36 = list($NAME, makeString("Add Full Example"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-PC-ADD-FULL-EXAMPLE-HINT"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-PC-ADD-FULL-EXAMPLE-CHILD-COMPLETED"));

    static private final SubLList $list_alt37 = list(makeKeyword("DISPLAY-METHOD"), makeSymbol("CB-UIAT-PC-ADD-FULL-EXAMPLE-DISPLAY"));

    private static final SubLSymbol $TOTAL_COMPLETED = makeKeyword("TOTAL-COMPLETED");





    static private final SubLList $list_alt41 = list(makeSymbol("ARITY"));

    private static final SubLSymbol $MY_RESULT_WILL_BE = makeKeyword("MY-RESULT-WILL-BE");

    static private final SubLString $$$Add_Full_Example = makeString("Add Full Example");

    static private final SubLString $str_alt44$cb_predicate_creator_handle_add_f = makeString("cb-predicate-creator-handle-add-full-example");

    static private final SubLString $$$id = makeString("id");

    static private final SubLString $$$Add_a_Full_Example = makeString("Add a Full Example");

    static private final SubLString $str_alt47$Current_Examples__ = makeString("Current Examples :");

    static private final SubLString $str_alt48$__ = makeString("::");



    static private final SubLString $str_alt50$Argument__A = makeString("Argument ~A");



    static private final SubLString $$$Submit = makeString("Submit");

    static private final SubLList $list_alt53 = list(makeSymbol("ARG-STRING"), makeSymbol("EXAMPLE-STRING"));

    static private final SubLList $list_alt54 = list(makeSymbol("ARG"), makeSymbol("EXAMPLE-STRING"));

    private static final SubLSymbol CB_PREDICATE_CREATOR_HANDLE_ADD_FULL_EXAMPLE = makeSymbol("CB-PREDICATE-CREATOR-HANDLE-ADD-FULL-EXAMPLE");

    static private final SubLList $list_alt56 = list($NAME, makeString("Add Arg Example"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-PC-ADD-ARG-EXAMPLE-HINT"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-PC-ADD-ARG-EXAMPLE-CHILD-COMPLETED"));

    static private final SubLList $list_alt57 = list(makeKeyword("DISPLAY-METHOD"), makeSymbol("CB-UIAT-PC-ADD-ARG-EXAMPLE-DISPLAY"));

    static private final SubLString $str_alt58$Add_Arg__A_Example = makeString("Add Arg ~A Example");





    static private final SubLString $str_alt61$cb_predicate_creator_handle_add_a = makeString("cb-predicate-creator-handle-add-arg-example");

    static private final SubLString $$$arg = makeString("arg");

    static private final SubLString $$$example = makeString("example");

    private static final SubLSymbol CB_PREDICATE_CREATOR_HANDLE_ADD_ARG_EXAMPLE = makeSymbol("CB-PREDICATE-CREATOR-HANDLE-ADD-ARG-EXAMPLE");

    static private final SubLString $str_alt65$cb_predicate_creator_handle_speci = makeString("cb-predicate-creator-handle-specify-arity");

    static private final SubLString $$$The_new_relation_will_relate = makeString("The new relation will relate");

    static private final SubLString $$$arity = makeString("arity");

    static private final SubLString $str_alt68$concepts_ = makeString("concepts.");

    private static final SubLSymbol CB_PREDICATE_CREATOR_HANDLE_SPECIFY_ARITY = makeSymbol("CB-PREDICATE-CREATOR-HANDLE-SPECIFY-ARITY");

    static private final SubLString $$$Specifying_Examples = makeString("Specifying Examples");

    private static final SubLSymbol $UIA_PC_CONTINUE = makeKeyword("UIA-PC-CONTINUE");

    static private final SubLString $str_alt72$_Continue_ = makeString("[Continue]");

    static private final SubLString $str_alt73$Must_be____ = makeString("Must be ...");

    public static final SubLObject $$argIsa = constant_handles.reader_make_constant_shell(makeString("argIsa"));



    private static final SubLSymbol NOT_EQL = makeSymbol("NOT-EQL");

    static private final SubLString $str_alt77$____an_instance_of__ = makeString("... an instance of :");

    public static final SubLObject $$argGenl = constant_handles.reader_make_constant_shell(makeString("argGenl"));

    static private final SubLString $str_alt79$____a_kind_of__ = makeString("... a kind of :");



    private static final SubLSymbol $UIA_PC_ADD_FULL_EXAMPLE = makeKeyword("UIA-PC-ADD-FULL-EXAMPLE");

    static private final SubLString $str_alt82$_Add_Example_ = makeString("[Add Example]");

    static private final SubLString $$$None = makeString("None");

    private static final SubLSymbol $UIA_PC_REM_FULL_EXAMPLE = makeKeyword("UIA-PC-REM-FULL-EXAMPLE");

    static private final SubLString $str_alt85$_Delete_ = makeString("[Delete]");



    private static final SubLSymbol $UIA_PC_ADD_ARG_EXAMPLE = makeKeyword("UIA-PC-ADD-ARG-EXAMPLE");

    static private final SubLString $str_alt88$_Add_ = makeString("[Add]");

    private static final SubLSymbol $UIA_PC_REM_ARG_EXAMPLE = makeKeyword("UIA-PC-REM-ARG-EXAMPLE");

    static private final SubLString $str_alt90$___ = makeString("[-]");

    private static final SubLSymbol CB_PC_CONTINUE_LINK = makeSymbol("CB-PC-CONTINUE-LINK");

    static private final SubLString $str_alt92$cb_pc_continue_link__A = makeString("cb-pc-continue-link&~A");

    private static final SubLSymbol CB_LINK_UIA_PC_CONTINUE = makeSymbol("CB-LINK-UIA-PC-CONTINUE");

    private static final SubLSymbol CB_PC_HANDLE_ADD_FULL_EXAMPLE_LINK = makeSymbol("CB-PC-HANDLE-ADD-FULL-EXAMPLE-LINK");

    static private final SubLString $str_alt95$cb_pc_handle_add_full_example_lin = makeString("cb-pc-handle-add-full-example-link&~A");

    private static final SubLSymbol CB_LINK_UIA_PC_ADD_FULL_EXAMPLE = makeSymbol("CB-LINK-UIA-PC-ADD-FULL-EXAMPLE");

    static private final SubLList $list_alt97 = list(makeSymbol("ID-STRING"), makeSymbol("EXAMPLE-ID-STRING"));

    private static final SubLSymbol CB_PC_HANDLE_REM_FULL_EXAMPLE_LINK = makeSymbol("CB-PC-HANDLE-REM-FULL-EXAMPLE-LINK");

    static private final SubLString $str_alt99$cb_pc_handle_rem_full_example_lin = makeString("cb-pc-handle-rem-full-example-link&~A&~A");

    private static final SubLSymbol CB_LINK_UIA_PC_REM_FULL_EXAMPLE = makeSymbol("CB-LINK-UIA-PC-REM-FULL-EXAMPLE");

    static private final SubLList $list_alt101 = list(makeSymbol("ID-STRING"), makeSymbol("ARG-STRING"));

    private static final SubLSymbol CB_PC_HANDLE_ADD_ARG_EXAMPLE_LINK = makeSymbol("CB-PC-HANDLE-ADD-ARG-EXAMPLE-LINK");

    static private final SubLString $str_alt103$cb_pc_handle_add_arg_example_link = makeString("cb-pc-handle-add-arg-example-link&~A&~A");

    private static final SubLSymbol CB_LINK_UIA_PC_ADD_ARG_EXAMPLE = makeSymbol("CB-LINK-UIA-PC-ADD-ARG-EXAMPLE");

    static private final SubLList $list_alt105 = list(makeSymbol("ID-STRING"), makeSymbol("ARG-STRING"), makeSymbol("EXAMPLE-ID-STRING"));

    private static final SubLSymbol CB_PC_HANDLE_REM_ARG_EXAMPLE_LINK = makeSymbol("CB-PC-HANDLE-REM-ARG-EXAMPLE-LINK");

    static private final SubLString $str_alt107$cb_pc_handle_rem_arg_example_link = makeString("cb-pc-handle-rem-arg-example-link&~A&~A&~A");

    private static final SubLSymbol CB_LINK_UIA_PC_REM_ARG_EXAMPLE = makeSymbol("CB-LINK-UIA-PC-REM-ARG-EXAMPLE");

    static private final SubLString $$$Generalize_Constraints = makeString("Generalize Constraints");

    static private final SubLString $$$Specifying_Template = makeString("Specifying Template");

    // // Initializers
    public void declareFunctions() {
        declare_cb_predicate_creator_file();
    }

    public void initializeVariables() {
        init_cb_predicate_creator_file();
    }

    public void runTopLevelForms() {
        setup_cb_predicate_creator_file();
    }
}

