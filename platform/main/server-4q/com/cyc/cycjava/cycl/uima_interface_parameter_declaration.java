/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
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
 *  module:      UIMA-INTERFACE-PARAMETER-DECLARATION
 *  source file: /cyc/top/cycl/uima-interface-parameter-declaration.lisp
 *  created:     2019/07/03 17:37:56
 */
public final class uima_interface_parameter_declaration extends SubLTranslatedFile implements V02 {
    // // Constructor
    private uima_interface_parameter_declaration() {
    }

    public static final SubLFile me = new uima_interface_parameter_declaration();

    public static final String myName = "com.cyc.cycjava.cycl.uima_interface_parameter_declaration";



    public static final SubLObject uima_interface_parameters() {
        {
            SubLObject keys = dictionary.dictionary_keys($uima_interface_parameter_info_dictionary$.getGlobalValue());
            SubLObject copy = copy_list(keys);
            return Sort.sort(copy, $sym1$STRING_, symbol_function(SYMBOL_NAME));
        }
    }

    public static final SubLObject do_uima_interface_parameters(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt3);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject parameter = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt3);
                    parameter = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt3);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt3);
                            if (NIL == member(current_1, $list_alt4, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt3);
                        }
                        {
                            SubLObject locked_method_tail = property_list_member($LOCKED_METHOD, current);
                            SubLObject locked_method = (NIL != locked_method_tail) ? ((SubLObject) (cadr(locked_method_tail))) : IGNORE_ME;
                            SubLObject type_tail = property_list_member($TYPE, current);
                            SubLObject type = (NIL != type_tail) ? ((SubLObject) (cadr(type_tail))) : IGNORE_ME1;
                            SubLObject prompt_method_tail = property_list_member($PROMPT_METHOD, current);
                            SubLObject prompt_method = (NIL != prompt_method_tail) ? ((SubLObject) (cadr(prompt_method_tail))) : IGNORE_ME2;
                            SubLObject html_answer_interpreter_method_tail = property_list_member($HTML_ANSWER_INTERPRETER_METHOD, current);
                            SubLObject html_answer_interpreter_method = (NIL != html_answer_interpreter_method_tail) ? ((SubLObject) (cadr(html_answer_interpreter_method_tail))) : IGNORE_ME3;
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(CDOLIST, bq_cons(parameter, $list_alt15), listS(CLET, list(list(type, list(UIMA_INTERFACE_PARAMETER_TYPE, parameter)), list(locked_method, list(UIMA_INTERFACE_PARAMETER_LOCKED_METHOD, parameter)), list(prompt_method, list(UIMA_INTERFACE_PARAMETER_PROMPT_METHOD, parameter)), list(html_answer_interpreter_method, list(UIMA_INTERFACE_PARAMETER_HTML_ANSWER_INTERPRETER_METHOD, parameter))), list(IGNORE, locked_method, prompt_method, html_answer_interpreter_method, type), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * <slot-key type required?>
     */
    // defconstant
    private static final SubLSymbol $uima_interface_parameter_slots$ = makeSymbol("*UIMA-INTERFACE-PARAMETER-SLOTS*");

    public static final SubLObject declare_uima_interface_parameter(SubLObject parameter, SubLObject plist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(parameter, POSSIBLE_UIMA_INTERFACE_PARAMETER_P);
            {
                SubLObject info = NIL;
                SubLObject cdolist_list_var = $uima_interface_parameter_slots$.getGlobalValue();
                SubLObject slot_def = NIL;
                for (slot_def = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slot_def = cdolist_list_var.first()) {
                    {
                        SubLObject datum = slot_def;
                        SubLObject current = datum;
                        SubLObject slot_key = NIL;
                        SubLObject type = NIL;
                        SubLObject requiredP = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt24);
                        slot_key = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt24);
                        type = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt24);
                        requiredP = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject slot_value = getf(plist, slot_key, $UNSPECIFIED);
                                if ((slot_value != $UNSPECIFIED) || (NIL != requiredP)) {
                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                        if (NIL == funcall(type, slot_value)) {
                                            Errors.error($str_alt26$The__S_slot_to_DECLARE_UIMA_INTER, slot_key, type);
                                        }
                                    }
                                }
                                info = cons(slot_value, info);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt24);
                        }
                    }
                }
                dictionary.dictionary_enter($uima_interface_parameter_info_dictionary$.getGlobalValue(), parameter, nreverse(info));
            }
            return parameter;
        }
    }

    public static final SubLObject possible_uima_interface_parameter_p(SubLObject v_object) {
        return keywordp(v_object);
    }

    public static final SubLObject uima_interface_parameter_p(SubLObject v_object) {
        return makeBoolean((NIL != possible_uima_interface_parameter_p(v_object)) && (NIL != dictionary.dictionary_lookup($uima_interface_parameter_info_dictionary$.getGlobalValue(), v_object, UNPROVIDED)));
    }

    public static final SubLObject set_uima_interface_parameter_slot(SubLObject parameter, SubLObject slot, SubLObject value) {
        {
            SubLObject entry = dictionary.dictionary_lookup($uima_interface_parameter_info_dictionary$.getGlobalValue(), parameter, UNPROVIDED);
            SubLObject slot_index = position(slot, $uima_interface_parameter_slots$.getGlobalValue(), symbol_function(EQ), symbol_function(CAR), UNPROVIDED, UNPROVIDED);
            if ((entry.isList() && slot_index.isInteger()) && (NIL != list_utilities.lengthG(entry, slot_index, UNPROVIDED))) {
                set_nth(slot_index, entry, value);
            }
        }
        return value;
    }

    public static final SubLObject get_uima_interface_parameter_slot(SubLObject parameter, SubLObject slot) {
        {
            SubLObject entry = dictionary.dictionary_lookup($uima_interface_parameter_info_dictionary$.getGlobalValue(), parameter, UNPROVIDED);
            SubLObject slot_index = position(slot, $uima_interface_parameter_slots$.getGlobalValue(), symbol_function(EQ), symbol_function(CAR), UNPROVIDED, UNPROVIDED);
            if ((entry.isList() && slot_index.isInteger()) && (NIL != list_utilities.lengthG(entry, slot_index, UNPROVIDED))) {
                return nth(slot_index, entry);
            }
        }
        return NIL;
    }

    public static final SubLObject undeclare_uima_interface_parameter(SubLObject parameter) {
        SubLTrampolineFile.checkType(parameter, POSSIBLE_UIMA_INTERFACE_PARAMETER_P);
        dictionary.dictionary_remove($uima_interface_parameter_info_dictionary$.getGlobalValue(), parameter);
        return parameter;
    }

    public static final SubLObject uima_interface_parameter_type(SubLObject parameter) {
        {
            SubLObject value = get_uima_interface_parameter_slot(parameter, $TYPE);
            return value;
        }
    }

    public static final SubLObject uima_interface_parameter_initial_value(SubLObject parameter) {
        {
            SubLObject value = get_uima_interface_parameter_slot(parameter, $INITIAL_VALUE);
            return value;
        }
    }

    public static final SubLObject uima_interface_parameter_locked_method(SubLObject parameter) {
        {
            SubLObject method = get_uima_interface_parameter_slot(parameter, $LOCKED_METHOD);
            if (method.isFunctionSpec()) {
                return method;
            }
        }
        return NIL;
    }

    public static final SubLObject ui_interface_parameter_locked_p(SubLObject interaction, SubLObject parameter) {
        {
            SubLObject method = uima_interface_parameter_locked_method(parameter);
            SubLObject uima = user_interaction_agenda.uia_meta_agenda(user_interaction_agenda.ui_agenda(interaction));
            return method.isFunctionSpec() && (NIL != user_interaction_agenda.user_interaction_meta_agenda_p(uima)) ? ((SubLObject) (funcall(method, uima))) : NIL;
        }
    }

    public static final SubLObject ui_interface_parameter_show_field(SubLObject interaction, SubLObject parameter) {
        {
            SubLObject value = ui_interface_parameter_lookup(interaction, parameter);
            SubLObject field_name = princ_to_string(parameter);
            SubLObject type = uima_interface_parameter_type(parameter);
            SubLObject pcase_var = type;
            if (pcase_var.eql($BOOLEAN)) {
                html_utilities.html_checkbox_input(field_name, NIL, eq($TRUE, value), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($INTEGER)) {
                    html_utilities.html_text_input(field_name, value, TWO_INTEGER);
                } else {
                    html_utilities.html_text_input(field_name, value, EIGHT_INTEGER);
                }

        }
        return parameter;
    }

    public static final SubLObject ui_interface_parameter_show_prompt(SubLObject interaction, SubLObject parameter) {
        {
            SubLObject method = uima_interface_parameter_prompt_method(parameter);
            SubLObject uima = user_interaction_agenda.uia_meta_agenda(user_interaction_agenda.ui_agenda(interaction));
            return method.isFunctionSpec() && (NIL != user_interaction_agenda.user_interaction_meta_agenda_p(uima)) ? ((SubLObject) (funcall(method, uima))) : NIL;
        }
    }

    public static final SubLObject uima_interface_parameter_prompt_method(SubLObject parameter) {
        {
            SubLObject method = get_uima_interface_parameter_slot(parameter, $PROMPT_METHOD);
            if (method.isFunctionSpec()) {
                return method;
            }
        }
        return NIL;
    }

    public static final SubLObject uima_interface_parameter_html_answer_interpreter_method(SubLObject parameter) {
        {
            SubLObject method = get_uima_interface_parameter_slot(parameter, $HTML_ANSWER_INTERPRETER_METHOD);
            if (method.isFunctionSpec()) {
                return method;
            } else
                if (uima_interface_parameter_type(parameter) == $BOOLEAN) {
                    return INTERPRET_BOOLEAN_ANSWER;
                }

        }
        return NIL;
    }

    public static final SubLObject interpret_boolean_answer(SubLObject v_answer) {
        return v_answer.equalp($$$T) || v_answer.equalp($$$on) ? ((SubLObject) ($TRUE)) : $FALSE;
    }

    public static final SubLObject interpret_interface_parameter(SubLObject parameter, SubLObject html_field_result) {
        {
            SubLObject interpretation_method = uima_interface_parameter_html_answer_interpreter_method(parameter);
            return interpretation_method.isFunctionSpec() ? ((SubLObject) (funcall(interpretation_method, html_field_result))) : NIL;
        }
    }

    public static final SubLObject uima_interface_parameter_lookup(SubLObject uima, SubLObject parameter) {
        {
            SubLObject value = user_interaction_agenda.uima_state_lookup(uima, parameter, $UNDETERMINED);
            return value == $UNDETERMINED ? ((SubLObject) (uima_interface_parameter_initial_value(parameter))) : value;
        }
    }

    public static final SubLObject uia_interface_parameter_lookup(SubLObject v_agenda, SubLObject parameter) {
        return uima_interface_parameter_lookup(user_interaction_agenda.uia_meta_agenda(v_agenda), parameter);
    }

    public static final SubLObject ui_interface_parameter_lookup(SubLObject interaction, SubLObject parameter) {
        return uia_interface_parameter_lookup(user_interaction_agenda.ui_agenda(interaction), parameter);
    }

    public static final SubLObject uima_interface_parameter_update(SubLObject uima, SubLObject parameter, SubLObject value) {
        user_interaction_agenda.uima_state_update(uima, parameter, value);
        {
            SubLObject after_updating = get_uima_interface_parameter_slot(parameter, $AFTER_UPDATING);
            if (after_updating.isFunctionSpec()) {
                funcall(after_updating, uima, value);
            }
        }
        return value;
    }

    public static final SubLObject uia_interface_parameter_update(SubLObject v_agenda, SubLObject parameter, SubLObject value) {
        return user_interaction_agenda.uima_state_update(user_interaction_agenda.uia_meta_agenda(v_agenda), parameter, value);
    }

    public static final SubLObject uia_use_salient_descriptor_inductionP(SubLObject v_agenda) {
        return uia_interface_parameter_lookup(v_agenda, $kw38$USE_SALIENT_DESCRIPTOR_INDUCTION_);
    }

    public static final SubLObject uia_salient_descriptor_induction_prompt(SubLObject uima) {
        return html_utilities.html_princ($str_alt40$Use_induced_salient_descriptors_);
    }

    public static final SubLObject uia_use_salient_descriptor_induction_from_rulesP(SubLObject v_agenda) {
        return uia_interface_parameter_lookup(v_agenda, $kw41$USE_SALIENT_DESCRIPTOR_INDUCTION_FROM_RULES_);
    }

    public static final SubLObject uia_salient_descriptor_induction_from_rules_prompt(SubLObject uima) {
        return html_utilities.html_princ($str_alt43$Induce_salient_descriptors_from_r);
    }

    public static final SubLObject uia_generate_examples_for_all_sd_promptsP(SubLObject v_agenda) {
        return uia_interface_parameter_lookup(v_agenda, $kw44$GENERATE_EXAMPLES_FOR_ALL_SD_PROMPTS_);
    }

    public static final SubLObject uia_generate_examples_for_all_sd_prompts_prompt(SubLObject uima) {
        return html_utilities.html_princ($str_alt46$Generate_examples_for_all_Salient);
    }

    public static final SubLObject uia_show_debug_linksP(SubLObject v_agenda) {
        return eql($TRUE, uia_interface_parameter_lookup(v_agenda, $kw47$SHOW_DEBUG_LINKS_));
    }

    public static final SubLObject show_debug_links_prompt(SubLObject uima) {
        return html_utilities.html_princ($str_alt49$Debugging_links_enabled_);
    }

    public static final SubLObject uia_precheck_analogy_developer_selectionsP(SubLObject v_agenda) {
        return eql($TRUE, uia_interface_parameter_lookup(v_agenda, $kw50$PRECHECK_ANALOGY_DEVELOPER_SELECTIONS_));
    }

    public static final SubLObject show_precheck_analogy_developer_selections(SubLObject uima) {
        return html_utilities.html_princ($str_alt52$Precheck_selection_boxes_in_analo);
    }

    public static final SubLObject uia_show_comments_as_musingsP(SubLObject v_agenda) {
        return uia_interface_parameter_lookup(v_agenda, $kw53$SHOW_COMMENTS_AS_MUSINGS_);
    }

    public static final SubLObject show_comments_as_musings_prompt(SubLObject uima) {
        return html_utilities.html_princ($str_alt55$Show_comments_in_musings__a_k_a__);
    }

    public static final SubLObject show_comments_as_musings_lockedP(SubLObject uima) {
        return makeBoolean(NIL == user_interaction_agenda.uia_can_treat_comments_as_mumblingP());
    }

    public static final SubLObject uima_treat_comments_as_mumbling(SubLObject uima, SubLObject value) {
        if (value == $TRUE) {
            {
                SubLObject v_agenda = user_interaction_agenda.uima_current_agenda(uima);
                user_interaction_agenda.uia_treat_comments_as_mumbling(v_agenda);
            }
        }
        return uima;
    }

    public static final SubLObject uia_treat_comments_as_mumblingP(SubLObject v_agenda) {
        if (NIL != user_interaction_agenda.uia_can_treat_comments_as_mumblingP()) {
            return eq($TRUE, uia_interface_parameter_lookup(v_agenda, $kw53$SHOW_COMMENTS_AS_MUSINGS_));
        } else {
            return NIL;
        }
    }

    public static final SubLObject use_internal_assumptions_prompt(SubLObject uima) {
        return html_utilities.html_princ($str_alt58$Employ_Cycorp_internal_default_as);
    }

    public static final SubLObject update_internal_assumptions(SubLObject uima, SubLObject value) {
        if (NIL != value) {
            uia_enable_internal_use_assumptions(user_interaction_agenda.uima_current_agenda(uima));
        } else {
            uia_enable_external_use_assumptions(user_interaction_agenda.uima_current_agenda(uima));
        }
        return value;
    }

    public static final SubLObject uia_enable_internal_use_assumptions(SubLObject v_agenda) {
        user_interaction_agenda.uia_state_clear(v_agenda, $DEFAULT_SF_BACKCHAIN);
        return v_agenda;
    }

    public static final SubLObject uia_enable_external_use_assumptions(SubLObject v_agenda) {
        user_interaction_agenda.uia_state_update(v_agenda, $DEFAULT_SF_BACKCHAIN, ONE_INTEGER);
        user_interaction_agenda.uia_state_update(v_agenda, $DEFAULT_SF_DEPTH, TWENTY_INTEGER);
        uia_interface_parameter_update(v_agenda, $kw61$FORGE_AHEAD_, $TRUE);
        if (NIL != user_interaction_agenda.uia_can_treat_comments_as_mumblingP()) {
            user_interaction_agenda.uia_treat_comments_as_mumbling(v_agenda);
        }
        return v_agenda;
    }

    /**
     * Are we assuming Cycorp-internal use?
     */
    public static final SubLObject uia_internal_use_assumptionsP(SubLObject v_agenda) {
        return eq($TRUE, uia_interface_parameter_lookup(v_agenda, $kw56$USE_INTERNAL_ASSUMPTIONS_));
    }

    /**
     * Are we assuming Cycorp-external use?
     */
    public static final SubLObject uia_external_use_assumptionsP(SubLObject v_agenda) {
        return makeBoolean(NIL == uia_internal_use_assumptionsP(v_agenda));
    }

    public static final SubLObject uia_forge_ahead_prompt(SubLObject uima) {
        return html_utilities.html_princ($str_alt63$Forge_ahead_whenever_possible_);
    }

    /**
     * should the UIA try to forge ahead, or should it be cautious and confirm
     * everything with the user?
     */
    public static final SubLObject uia_forge_aheadP(SubLObject v_agenda) {
        return eq($TRUE, uia_interface_parameter_lookup(v_agenda, $kw61$FORGE_AHEAD_));
    }

    public static final SubLObject uia_refresh_rate_prompt(SubLObject uima) {
        html_utilities.html_princ($str_alt66$Refresh_the_agenda_this_often__in);
        html_utilities.html_newline(UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
        html_utilities.html_princ($str_alt67$Note__leave_empty_to_disable_agen);
        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject interpret_refresh_rate_answer(SubLObject ans) {
        {
            SubLObject value = NIL;
            SubLObject ignore_errors_tag = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                        try {
                            value = parse_integer(ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            }
            if (!(value.isNumber() && value.numGE(ONE_INTEGER))) {
                value = NIL;
            }
            return value;
        }
    }

    public static final SubLObject uia_refresh_rate(SubLObject v_agenda) {
        if (v_agenda == UNPROVIDED) {
            v_agenda = cb_user_interaction_agenda.cb_current_uia();
        }
        return uia_interface_parameter_lookup(v_agenda, $REFRESH_RATE);
    }

    public static final SubLObject declare_uima_interface_parameter_declaration_file() {
        declareFunction("uima_interface_parameters", "UIMA-INTERFACE-PARAMETERS", 0, 0, false);
        declareMacro("do_uima_interface_parameters", "DO-UIMA-INTERFACE-PARAMETERS");
        declareFunction("declare_uima_interface_parameter", "DECLARE-UIMA-INTERFACE-PARAMETER", 2, 0, false);
        declareFunction("possible_uima_interface_parameter_p", "POSSIBLE-UIMA-INTERFACE-PARAMETER-P", 1, 0, false);
        declareFunction("uima_interface_parameter_p", "UIMA-INTERFACE-PARAMETER-P", 1, 0, false);
        declareFunction("set_uima_interface_parameter_slot", "SET-UIMA-INTERFACE-PARAMETER-SLOT", 3, 0, false);
        declareFunction("get_uima_interface_parameter_slot", "GET-UIMA-INTERFACE-PARAMETER-SLOT", 2, 0, false);
        declareFunction("undeclare_uima_interface_parameter", "UNDECLARE-UIMA-INTERFACE-PARAMETER", 1, 0, false);
        declareFunction("uima_interface_parameter_type", "UIMA-INTERFACE-PARAMETER-TYPE", 1, 0, false);
        declareFunction("uima_interface_parameter_initial_value", "UIMA-INTERFACE-PARAMETER-INITIAL-VALUE", 1, 0, false);
        declareFunction("uima_interface_parameter_locked_method", "UIMA-INTERFACE-PARAMETER-LOCKED-METHOD", 1, 0, false);
        declareFunction("ui_interface_parameter_locked_p", "UI-INTERFACE-PARAMETER-LOCKED-P", 2, 0, false);
        declareFunction("ui_interface_parameter_show_field", "UI-INTERFACE-PARAMETER-SHOW-FIELD", 2, 0, false);
        declareFunction("ui_interface_parameter_show_prompt", "UI-INTERFACE-PARAMETER-SHOW-PROMPT", 2, 0, false);
        declareFunction("uima_interface_parameter_prompt_method", "UIMA-INTERFACE-PARAMETER-PROMPT-METHOD", 1, 0, false);
        declareFunction("uima_interface_parameter_html_answer_interpreter_method", "UIMA-INTERFACE-PARAMETER-HTML-ANSWER-INTERPRETER-METHOD", 1, 0, false);
        declareFunction("interpret_boolean_answer", "INTERPRET-BOOLEAN-ANSWER", 1, 0, false);
        declareFunction("interpret_interface_parameter", "INTERPRET-INTERFACE-PARAMETER", 2, 0, false);
        declareFunction("uima_interface_parameter_lookup", "UIMA-INTERFACE-PARAMETER-LOOKUP", 2, 0, false);
        declareFunction("uia_interface_parameter_lookup", "UIA-INTERFACE-PARAMETER-LOOKUP", 2, 0, false);
        declareFunction("ui_interface_parameter_lookup", "UI-INTERFACE-PARAMETER-LOOKUP", 2, 0, false);
        declareFunction("uima_interface_parameter_update", "UIMA-INTERFACE-PARAMETER-UPDATE", 3, 0, false);
        declareFunction("uia_interface_parameter_update", "UIA-INTERFACE-PARAMETER-UPDATE", 3, 0, false);
        declareFunction("uia_use_salient_descriptor_inductionP", "UIA-USE-SALIENT-DESCRIPTOR-INDUCTION?", 1, 0, false);
        declareFunction("uia_salient_descriptor_induction_prompt", "UIA-SALIENT-DESCRIPTOR-INDUCTION-PROMPT", 1, 0, false);
        declareFunction("uia_use_salient_descriptor_induction_from_rulesP", "UIA-USE-SALIENT-DESCRIPTOR-INDUCTION-FROM-RULES?", 1, 0, false);
        declareFunction("uia_salient_descriptor_induction_from_rules_prompt", "UIA-SALIENT-DESCRIPTOR-INDUCTION-FROM-RULES-PROMPT", 1, 0, false);
        declareFunction("uia_generate_examples_for_all_sd_promptsP", "UIA-GENERATE-EXAMPLES-FOR-ALL-SD-PROMPTS?", 1, 0, false);
        declareFunction("uia_generate_examples_for_all_sd_prompts_prompt", "UIA-GENERATE-EXAMPLES-FOR-ALL-SD-PROMPTS-PROMPT", 1, 0, false);
        declareFunction("uia_show_debug_linksP", "UIA-SHOW-DEBUG-LINKS?", 1, 0, false);
        declareFunction("show_debug_links_prompt", "SHOW-DEBUG-LINKS-PROMPT", 1, 0, false);
        declareFunction("uia_precheck_analogy_developer_selectionsP", "UIA-PRECHECK-ANALOGY-DEVELOPER-SELECTIONS?", 1, 0, false);
        declareFunction("show_precheck_analogy_developer_selections", "SHOW-PRECHECK-ANALOGY-DEVELOPER-SELECTIONS", 1, 0, false);
        declareFunction("uia_show_comments_as_musingsP", "UIA-SHOW-COMMENTS-AS-MUSINGS?", 1, 0, false);
        declareFunction("show_comments_as_musings_prompt", "SHOW-COMMENTS-AS-MUSINGS-PROMPT", 1, 0, false);
        declareFunction("show_comments_as_musings_lockedP", "SHOW-COMMENTS-AS-MUSINGS-LOCKED?", 1, 0, false);
        declareFunction("uima_treat_comments_as_mumbling", "UIMA-TREAT-COMMENTS-AS-MUMBLING", 2, 0, false);
        declareFunction("uia_treat_comments_as_mumblingP", "UIA-TREAT-COMMENTS-AS-MUMBLING?", 1, 0, false);
        declareFunction("use_internal_assumptions_prompt", "USE-INTERNAL-ASSUMPTIONS-PROMPT", 1, 0, false);
        declareFunction("update_internal_assumptions", "UPDATE-INTERNAL-ASSUMPTIONS", 2, 0, false);
        declareFunction("uia_enable_internal_use_assumptions", "UIA-ENABLE-INTERNAL-USE-ASSUMPTIONS", 1, 0, false);
        declareFunction("uia_enable_external_use_assumptions", "UIA-ENABLE-EXTERNAL-USE-ASSUMPTIONS", 1, 0, false);
        declareFunction("uia_internal_use_assumptionsP", "UIA-INTERNAL-USE-ASSUMPTIONS?", 1, 0, false);
        declareFunction("uia_external_use_assumptionsP", "UIA-EXTERNAL-USE-ASSUMPTIONS?", 1, 0, false);
        declareFunction("uia_forge_ahead_prompt", "UIA-FORGE-AHEAD-PROMPT", 1, 0, false);
        declareFunction("uia_forge_aheadP", "UIA-FORGE-AHEAD?", 1, 0, false);
        declareFunction("uia_refresh_rate_prompt", "UIA-REFRESH-RATE-PROMPT", 1, 0, false);
        declareFunction("interpret_refresh_rate_answer", "INTERPRET-REFRESH-RATE-ANSWER", 1, 0, false);
        declareFunction("uia_refresh_rate", "UIA-REFRESH-RATE", 0, 1, false);
        return NIL;
    }

    public static final SubLObject init_uima_interface_parameter_declaration_file() {
        deflexical("*UIMA-INTERFACE-PARAMETER-INFO-DICTIONARY*", NIL != boundp($uima_interface_parameter_info_dictionary$) ? ((SubLObject) ($uima_interface_parameter_info_dictionary$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), TEN_INTEGER));
        defconstant("*UIMA-INTERFACE-PARAMETER-SLOTS*", $list_alt22);
        return NIL;
    }

    public static final SubLObject setup_uima_interface_parameter_declaration_file() {
                subl_macro_promotions.declare_defglobal($uima_interface_parameter_info_dictionary$);
        declare_uima_interface_parameter($kw38$USE_SALIENT_DESCRIPTOR_INDUCTION_, $list_alt39);
        declare_uima_interface_parameter($kw41$USE_SALIENT_DESCRIPTOR_INDUCTION_FROM_RULES_, $list_alt42);
        declare_uima_interface_parameter($kw44$GENERATE_EXAMPLES_FOR_ALL_SD_PROMPTS_, $list_alt45);
        declare_uima_interface_parameter($kw47$SHOW_DEBUG_LINKS_, $list_alt48);
        declare_uima_interface_parameter($kw50$PRECHECK_ANALOGY_DEVELOPER_SELECTIONS_, $list_alt51);
        declare_uima_interface_parameter($kw53$SHOW_COMMENTS_AS_MUSINGS_, $list_alt54);
        declare_uima_interface_parameter($kw56$USE_INTERNAL_ASSUMPTIONS_, $list_alt57);
        declare_uima_interface_parameter($kw61$FORGE_AHEAD_, $list_alt62);
        declare_uima_interface_parameter($REFRESH_RATE, $list_alt65);
        return NIL;
    }

    // // Internal Constants
    public static final SubLSymbol $uima_interface_parameter_info_dictionary$ = makeSymbol("*UIMA-INTERFACE-PARAMETER-INFO-DICTIONARY*");

    static private final SubLSymbol $sym1$STRING_ = makeSymbol("STRING<");



    static private final SubLList $list_alt3 = list(list(makeSymbol("PARAMETER"), makeSymbol("&KEY"), list(makeSymbol("LOCKED-METHOD"), list(QUOTE, makeSymbol("IGNORE-ME"))), list(makeSymbol("TYPE"), list(QUOTE, makeSymbol("IGNORE-ME1"))), list(makeSymbol("PROMPT-METHOD"), list(QUOTE, makeSymbol("IGNORE-ME2"))), list(makeSymbol("HTML-ANSWER-INTERPRETER-METHOD"), list(QUOTE, makeSymbol("IGNORE-ME3")))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt4 = list(makeKeyword("LOCKED-METHOD"), $TYPE, makeKeyword("PROMPT-METHOD"), makeKeyword("HTML-ANSWER-INTERPRETER-METHOD"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $LOCKED_METHOD = makeKeyword("LOCKED-METHOD");





    private static final SubLSymbol IGNORE_ME1 = makeSymbol("IGNORE-ME1");

    private static final SubLSymbol $PROMPT_METHOD = makeKeyword("PROMPT-METHOD");

    private static final SubLSymbol IGNORE_ME2 = makeSymbol("IGNORE-ME2");

    private static final SubLSymbol $HTML_ANSWER_INTERPRETER_METHOD = makeKeyword("HTML-ANSWER-INTERPRETER-METHOD");

    private static final SubLSymbol IGNORE_ME3 = makeSymbol("IGNORE-ME3");



    static private final SubLList $list_alt15 = list(list(makeSymbol("UIMA-INTERFACE-PARAMETERS")));



    private static final SubLSymbol UIMA_INTERFACE_PARAMETER_TYPE = makeSymbol("UIMA-INTERFACE-PARAMETER-TYPE");

    private static final SubLSymbol UIMA_INTERFACE_PARAMETER_LOCKED_METHOD = makeSymbol("UIMA-INTERFACE-PARAMETER-LOCKED-METHOD");

    private static final SubLSymbol UIMA_INTERFACE_PARAMETER_PROMPT_METHOD = makeSymbol("UIMA-INTERFACE-PARAMETER-PROMPT-METHOD");

    private static final SubLSymbol UIMA_INTERFACE_PARAMETER_HTML_ANSWER_INTERPRETER_METHOD = makeSymbol("UIMA-INTERFACE-PARAMETER-HTML-ANSWER-INTERPRETER-METHOD");



    static private final SubLList $list_alt22 = list(list($TYPE, makeSymbol("KEYWORDP"), T), list(makeKeyword("INITIAL-VALUE"), makeSymbol("TRUE"), T), list(makeKeyword("LOCKED-METHOD"), makeSymbol("SYMBOLP"), NIL), list(makeKeyword("PROMPT-METHOD"), makeSymbol("SYMBOLP"), T), list(makeKeyword("AFTER-UPDATING"), makeSymbol("SYMBOLP"), NIL), list(makeKeyword("HTML-ANSWER-INTERPRETER-METHOD"), makeSymbol("SYMBOLP"), NIL));

    private static final SubLSymbol POSSIBLE_UIMA_INTERFACE_PARAMETER_P = makeSymbol("POSSIBLE-UIMA-INTERFACE-PARAMETER-P");

    static private final SubLList $list_alt24 = list(makeSymbol("SLOT-KEY"), makeSymbol("TYPE"), makeSymbol("REQUIRED?"));



    static private final SubLString $str_alt26$The__S_slot_to_DECLARE_UIMA_INTER = makeString("The ~S slot to DECLARE-UIMA-INTERFACE-PARAMETER must be a ~S.");











    private static final SubLSymbol INTERPRET_BOOLEAN_ANSWER = makeSymbol("INTERPRET-BOOLEAN-ANSWER");

    static private final SubLString $$$T = makeString("T");

    static private final SubLString $$$on = makeString("on");





    private static final SubLSymbol $AFTER_UPDATING = makeKeyword("AFTER-UPDATING");

    public static final SubLSymbol $kw38$USE_SALIENT_DESCRIPTOR_INDUCTION_ = makeKeyword("USE-SALIENT-DESCRIPTOR-INDUCTION?");

    static private final SubLList $list_alt39 = list($TYPE, makeKeyword("BOOLEAN"), makeKeyword("INITIAL-VALUE"), $TRUE, makeKeyword("PROMPT-METHOD"), makeSymbol("UIA-SALIENT-DESCRIPTOR-INDUCTION-PROMPT"));

    static private final SubLString $str_alt40$Use_induced_salient_descriptors_ = makeString("Use induced salient descriptors.");

    public static final SubLSymbol $kw41$USE_SALIENT_DESCRIPTOR_INDUCTION_FROM_RULES_ = makeKeyword("USE-SALIENT-DESCRIPTOR-INDUCTION-FROM-RULES?");

    static private final SubLList $list_alt42 = list($TYPE, makeKeyword("BOOLEAN"), makeKeyword("INITIAL-VALUE"), makeKeyword("FALSE"), makeKeyword("PROMPT-METHOD"), makeSymbol("UIA-SALIENT-DESCRIPTOR-INDUCTION-FROM-RULES-PROMPT"));

    static private final SubLString $str_alt43$Induce_salient_descriptors_from_r = makeString("Induce salient descriptors from rules.");

    public static final SubLSymbol $kw44$GENERATE_EXAMPLES_FOR_ALL_SD_PROMPTS_ = makeKeyword("GENERATE-EXAMPLES-FOR-ALL-SD-PROMPTS?");

    static private final SubLList $list_alt45 = list($TYPE, makeKeyword("BOOLEAN"), makeKeyword("INITIAL-VALUE"), makeKeyword("FALSE"), makeKeyword("PROMPT-METHOD"), makeSymbol("UIA-GENERATE-EXAMPLES-FOR-ALL-SD-PROMPTS-PROMPT"));

    static private final SubLString $str_alt46$Generate_examples_for_all_Salient = makeString("Generate examples for all Salient Descriptor prompts.");

    public static final SubLSymbol $kw47$SHOW_DEBUG_LINKS_ = makeKeyword("SHOW-DEBUG-LINKS?");

    static private final SubLList $list_alt48 = list($TYPE, makeKeyword("BOOLEAN"), makeKeyword("INITIAL-VALUE"), $TRUE, makeKeyword("PROMPT-METHOD"), makeSymbol("SHOW-DEBUG-LINKS-PROMPT"));

    static private final SubLString $str_alt49$Debugging_links_enabled_ = makeString("Debugging links enabled.");

    public static final SubLSymbol $kw50$PRECHECK_ANALOGY_DEVELOPER_SELECTIONS_ = makeKeyword("PRECHECK-ANALOGY-DEVELOPER-SELECTIONS?");

    static private final SubLList $list_alt51 = list($TYPE, makeKeyword("BOOLEAN"), makeKeyword("INITIAL-VALUE"), makeKeyword("FALSE"), makeKeyword("PROMPT-METHOD"), makeSymbol("SHOW-PRECHECK-ANALOGY-DEVELOPER-SELECTIONS"));

    static private final SubLString $str_alt52$Precheck_selection_boxes_in_analo = makeString("Precheck selection boxes in analogy developer.");

    public static final SubLSymbol $kw53$SHOW_COMMENTS_AS_MUSINGS_ = makeKeyword("SHOW-COMMENTS-AS-MUSINGS?");

    static private final SubLList $list_alt54 = list(new SubLObject[]{ $TYPE, makeKeyword("BOOLEAN"), makeKeyword("INITIAL-VALUE"), $TRUE, makeKeyword("PROMPT-METHOD"), makeSymbol("SHOW-COMMENTS-AS-MUSINGS-PROMPT"), makeKeyword("LOCKED-METHOD"), makeSymbol("SHOW-COMMENTS-AS-MUSINGS-LOCKED?"), makeKeyword("AFTER-UPDATING"), makeSymbol("UIMA-TREAT-COMMENTS-AS-MUMBLING") });

    static private final SubLString $str_alt55$Show_comments_in_musings__a_k_a__ = makeString("Show comments in musings (a.k.a. My Thoughts) window.");

    public static final SubLSymbol $kw56$USE_INTERNAL_ASSUMPTIONS_ = makeKeyword("USE-INTERNAL-ASSUMPTIONS?");

    static private final SubLList $list_alt57 = list($TYPE, makeKeyword("BOOLEAN"), makeKeyword("INITIAL-VALUE"), makeKeyword("FALSE"), makeKeyword("PROMPT-METHOD"), makeSymbol("USE-INTERNAL-ASSUMPTIONS-PROMPT"), makeKeyword("AFTER-UPDATING"), makeSymbol("UPDATE-INTERNAL-ASSUMPTIONS"));

    static private final SubLString $str_alt58$Employ_Cycorp_internal_default_as = makeString("Employ Cycorp-internal default assumptions.");

    private static final SubLSymbol $DEFAULT_SF_BACKCHAIN = makeKeyword("DEFAULT-SF-BACKCHAIN");

    private static final SubLSymbol $DEFAULT_SF_DEPTH = makeKeyword("DEFAULT-SF-DEPTH");

    public static final SubLSymbol $kw61$FORGE_AHEAD_ = makeKeyword("FORGE-AHEAD?");

    static private final SubLList $list_alt62 = list($TYPE, makeKeyword("BOOLEAN"), makeKeyword("INITIAL-VALUE"), $TRUE, makeKeyword("PROMPT-METHOD"), makeSymbol("UIA-FORGE-AHEAD-PROMPT"));

    static private final SubLString $str_alt63$Forge_ahead_whenever_possible_ = makeString("Forge ahead whenever possible.");

    private static final SubLSymbol $REFRESH_RATE = makeKeyword("REFRESH-RATE");

    static private final SubLList $list_alt65 = list($TYPE, makeKeyword("INTEGER"), makeKeyword("INITIAL-VALUE"), TEN_INTEGER, makeKeyword("PROMPT-METHOD"), makeSymbol("UIA-REFRESH-RATE-PROMPT"), makeKeyword("HTML-ANSWER-INTERPRETER-METHOD"), makeSymbol("INTERPRET-REFRESH-RATE-ANSWER"));

    static private final SubLString $str_alt66$Refresh_the_agenda_this_often__in = makeString("Refresh the agenda this often (in seconds).");

    static private final SubLString $str_alt67$Note__leave_empty_to_disable_agen = makeString("Note: leave empty to disable agenda refreshing.");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    // // Initializers
    public void declareFunctions() {
        declare_uima_interface_parameter_declaration_file();
    }

    public void initializeVariables() {
        init_uima_interface_parameter_declaration_file();
    }

    public void runTopLevelForms() {
        setup_uima_interface_parameter_declaration_file();
    }
}

