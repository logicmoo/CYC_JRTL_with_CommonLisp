/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
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
 *  module:      CB-UIAT-SMART
 *  source file: /cyc/top/cycl/cb-uiat-smart.lisp
 *  created:     2019/07/03 17:38:11
 */
public final class cb_uiat_smart extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_uiat_smart() {
    }

    public static final SubLFile me = new cb_uiat_smart();


    // // Definitions
    public static final SubLObject uia_act_new_term_reader(SubLObject v_agenda, SubLObject mode, SubLObject utterance, SubLObject isas, SubLObject v_genls, SubLObject existance_checkP) {
        if (isas == UNPROVIDED) {
            isas = NIL;
        }
        if (v_genls == UNPROVIDED) {
            v_genls = NIL;
        }
        if (existance_checkP == UNPROVIDED) {
            existance_checkP = NIL;
        }
        {
            SubLObject interaction = user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $TERM_READER, list(utterance), UNPROVIDED);
            user_interaction_agenda.ui_state_update(interaction, $ISAS, isas);
            user_interaction_agenda.ui_state_update(interaction, $GENLS, v_genls);
            user_interaction_agenda.ui_state_update(interaction, $EXISTANCE_CHECK, existance_checkP);
            return interaction;
        }
    }

    public static final SubLObject uiat_term_reader_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject solutions = user_interaction_agenda.ui_result(child);
            uiat_term_reader_record_solution(parent, solutions);
            if ($DISPLAY_STYLE == user_interaction_agenda.ui_state_lookup(parent, $CALL_STYLE, UNPROVIDED)) {
                return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
            } else {
                return NIL;
            }
        }
    }

    public static final SubLObject uiat_term_reader_record_solution(SubLObject interaction, SubLObject solutions) {
        if (solutions.isCons()) {
            {
                SubLObject potential_nart = narts_high.find_nart(solutions);
                if (NIL != nart_handles.nart_p(potential_nart)) {
                    solutions = potential_nart;
                }
            }
        }
        user_interaction_agenda.uia_act_complete(user_interaction_agenda.ui_agenda(interaction), interaction, solutions);
        return interaction;
    }

    public static final SubLObject uiat_term_reader_hint(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject v_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            v_term = current.first();
            current = current.rest();
            if (NIL == current) {
                return format(NIL, $str_alt8$Read___A_, v_term);
            } else {
                cdestructuring_bind_error(datum, $list_alt7);
            }
        }
        return NIL;
    }

    /**
     * Request/Reply style of interaction implementation.
     */
    public static final SubLObject uiat_term_reader_generate_request(SubLObject interaction) {
        user_interaction_agenda.ui_state_update(interaction, $CALL_STYLE, $GENERATE_REQUEST);
        uiat_term_reader_implementation(interaction);
        return user_interaction_agenda.uia_generate_next_request(user_interaction_agenda.ui_agenda(interaction));
    }

    /**
     *
     *
     * @unknown currently not used nor needed
     */
    public static final SubLObject uiat_term_reader_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt10);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt10);
            action_type = current.first();
            current = current.rest();
            temp_plist = current;
            {
                SubLObject signature = getf(temp_plist, $SIGNATURE, UNPROVIDED);
                SubLObject agenda_signature = getf(temp_plist, $AGENDA_SIGNATURE, UNPROVIDED);
                SubLObject plist = remf(remf(copy_list(temp_plist), $SIGNATURE), $AGENDA_SIGNATURE);
                SubLObject interaction = (NIL != signature) ? ((SubLObject) (user_interaction_agenda.find_ui_by_signature(signature))) : NIL;
                SubLObject v_agenda = (NIL != interaction) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : user_interaction_agenda.find_uia_by_signature(agenda_signature);
            }
        }
        return NIL;
    }

    /**
     * Old agenda style interaction handling.
     */
    public static final SubLObject cb_uiat_term_reader_display(SubLObject interaction) {
        user_interaction_agenda.ui_state_update(interaction, $CALL_STYLE, $DISPLAY_STYLE);
        uiat_term_reader_implementation(interaction);
        return cb_user_interaction_agenda.cb_uia_show_next_interaction(user_interaction_agenda.ui_agenda(interaction));
    }

    /**
     * Content of what needs to happen under both rendering systems.
     */
    public static final SubLObject uiat_term_reader_implementation(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject v_term = args.first();
            SubLObject interpretations = user_interaction_agenda.ui_state_lookup(interaction, $INTERPRETATIONS, UNPROVIDED);
            SubLObject rejects = user_interaction_agenda.ui_state_lookup(interaction, $REJECTS, UNPROVIDED);
            SubLObject existance_checkP = user_interaction_agenda.ui_state_lookup(interaction, $EXISTANCE_CHECK, UNPROVIDED);
            SubLObject show_clarify_links = user_interaction_agenda.ui_state_lookup(interaction, $CLARIFY_LINKS, $TRUE);
            SubLObject force = user_interaction_agenda.ui_state_lookup(interaction, $FORCE, UNPROVIDED);
            if (NIL == interpretations) {
                uiat_term_reader_constructor(interaction, v_term);
                interpretations = user_interaction_agenda.ui_state_lookup(interaction, $INTERPRETATIONS, UNPROVIDED);
            }
            if (NIL != existance_checkP) {
                if ((NIL == interpretations) || (NIL != list_utilities.singletonP(interpretations))) {
                    if (NIL == interpretations) {
                        uia_mumbler.uia_mumble(v_agenda, format(NIL, $str_alt18$Sorry__but_I_know_of_no_interpret, v_term));
                        user_interaction_agenda.ui_state_update(interaction, $RETURN_STRING, format(NIL, $str_alt18$Sorry__but_I_know_of_no_interpret, v_term));
                    }
                    uiat_term_reader_record_solution(interaction, interpretations);
                    return interaction;
                }
            }
            {
                SubLObject plist = NIL;
                if (NIL != force) {
                    plist = putf(plist, $FORCE, force);
                }
                if (NIL != show_clarify_links) {
                    plist = putf(plist, $CLARIFY_LINKS, show_clarify_links);
                }
                plist = putf(plist, $CANDIDATE_TERMS, interpretations);
                plist = putf(plist, $REJECTS, rejects);
                {
                    SubLObject child = uia_tools_basic.uia_act_new_disambiguate_phrase_wXplist(v_agenda, $REQUIRED, v_term, plist);
                    user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                }
            }
        }
        return interaction;
    }

    public static final SubLObject uiat_term_reader_constructor(SubLObject interaction, SubLObject v_term) {
        user_interaction_agenda.ui_state_update(interaction, $TERM, v_term);
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject syntax_mt = user_interaction_agenda.uia_parsing_interaction_mt(v_agenda);
            SubLObject semantics_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
            SubLObject isas = user_interaction_agenda.ui_state_lookup(interaction, $ISAS, UNPROVIDED);
            SubLObject v_genls = user_interaction_agenda.ui_state_lookup(interaction, $GENLS, UNPROVIDED);
            SubLObject interpretations = NIL;
            SubLObject rejects = NIL;
            SubLObject parses = NIL;
            parses = rkf_text_processors.rkf_term_reader(v_term, syntax_mt, semantics_mt, UNPROVIDED);
            {
                SubLObject cdolist_list_var = parses;
                SubLObject parse = NIL;
                for (parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parse = cdolist_list_var.first()) {
                    {
                        SubLObject datum = parse;
                        SubLObject current = datum;
                        SubLObject span = NIL;
                        SubLObject terms = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt23);
                        span = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt23);
                        terms = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject cdolist_list_var_1 = terms;
                                SubLObject v_term_2 = NIL;
                                for (v_term_2 = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , v_term_2 = cdolist_list_var_1.first()) {
                                    {
                                        SubLObject suppressP = NIL;
                                        if (NIL == suppressP) {
                                            {
                                                SubLObject csome_list_var = isas;
                                                SubLObject v_isa = NIL;
                                                for (v_isa = csome_list_var.first(); !((NIL != suppressP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , v_isa = csome_list_var.first()) {
                                                    if (NIL == isa.isaP(v_term_2, v_isa, semantics_mt, UNPROVIDED)) {
                                                        suppressP = T;
                                                    }
                                                }
                                            }
                                        }
                                        if (NIL == suppressP) {
                                            {
                                                SubLObject csome_list_var = v_genls;
                                                SubLObject col = NIL;
                                                for (col = csome_list_var.first(); !((NIL != suppressP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , col = csome_list_var.first()) {
                                                    if (NIL == genls.genlsP(v_term_2, col, semantics_mt, UNPROVIDED)) {
                                                        suppressP = T;
                                                    }
                                                }
                                            }
                                        }
                                        if (NIL != suppressP) {
                                            {
                                                SubLObject item_var = v_term_2;
                                                if (NIL == member(item_var, rejects, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                    rejects = cons(item_var, rejects);
                                                }
                                            }
                                        } else {
                                            {
                                                SubLObject item_var = v_term_2;
                                                if (NIL == member(item_var, interpretations, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                    interpretations = cons(item_var, interpretations);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt23);
                        }
                    }
                }
            }
            interpretations = nreverse(interpretations);
            rejects = nreverse(rejects);
            user_interaction_agenda.ui_state_update(interaction, $INTERPRETATIONS, interpretations);
            user_interaction_agenda.ui_state_update(interaction, $REJECTS, rejects);
        }
        return interaction;
    }

    public static final SubLObject uia_act_new_read_sentence(SubLObject v_agenda, SubLObject mode, SubLObject nl_sentence) {
        Errors.warn($str_alt24$Calling_legacy_interface_read_sen);
        return uia_act_new_sentence_reader(v_agenda, mode, nl_sentence, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject uia_act_new_sentence_reader(SubLObject v_agenda, SubLObject mode, SubLObject nl_sentence, SubLObject my_result_will_be, SubLObject v_parse_tree) {
        if (my_result_will_be == UNPROVIDED) {
            my_result_will_be = NIL;
        }
        if (v_parse_tree == UNPROVIDED) {
            v_parse_tree = NIL;
        }
        {
            SubLObject plist = NIL;
            if (NIL != my_result_will_be) {
                plist = putf(plist, $MY_RESULT_WILL_BE, my_result_will_be);
            }
            if (NIL != v_parse_tree) {
                plist = putf(plist, $PARSE_TREE, v_parse_tree);
            }
            return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $SENTENCE_READER, list(nl_sentence), plist);
        }
    }

    public static final SubLObject uia_act_new_question_reader(SubLObject v_agenda, SubLObject mode, SubLObject nl_sentence) {
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $SENTENCE_READER, list(nl_sentence, $QUESTION), UNPROVIDED);
    }

    public static final SubLObject uia_act_new_constraint_reader(SubLObject v_agenda, SubLObject mode, SubLObject nl_sentence, SubLObject indexical_map, SubLObject constraint_table) {
        {
            SubLObject args = list(nl_sentence, $SENTENCE, indexical_map, constraint_table);
            SubLObject interaction = user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $SENTENCE_READER, args, UNPROVIDED);
            user_interaction_agenda.ui_state_update(interaction, $RESOLVE_NARTS, $TRUE);
            uiat_sr_mark_as_constraint_reader(interaction);
            uia_discourse_tracking.uiat_sr_extend_current_discourse(interaction, indexical_map, constraint_table);
            return interaction;
        }
    }

    public static final SubLObject uiat_sr_mark_as_constraint_reader(SubLObject interaction) {
        return user_interaction_agenda.ui_state_update(interaction, $MODUS_VIVENDI, $CONSTRAINT_READER);
    }

    public static final SubLObject uiat_sr_is_constraint_readerP(SubLObject interaction) {
        return eq($CONSTRAINT_READER, user_interaction_agenda.ui_state_lookup(interaction, $MODUS_VIVENDI, $SENTENCE_READER));
    }

    public static final SubLObject uiat_sr_is_sentence_readerP(SubLObject interaction) {
        return makeBoolean(NIL == uiat_sr_is_constraint_readerP(interaction));
    }

    public static final SubLObject uiat_sentence_reader_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject type = user_interaction_agenda.ui_operator(child);
            SubLObject result = user_interaction_agenda.ui_result(child);
            SubLObject pcase_var = type;
            if (pcase_var.eql($YES_NO_QUESTION)) {
                {
                    SubLObject concept = user_interaction_agenda.ui_state_lookup(child, $CONCEPT, UNPROVIDED);
                    if (result != $NO) {
                        uiat_sr_accepted_assertion(parent, concept);
                    } else {
                        {
                            SubLObject assertion = user_interaction_agenda.ui_state_lookup(child, $ASSERTION, UNPROVIDED);
                            SubLObject force = user_interaction_agenda.ui_state_lookup(child, $FORCE, UNPROVIDED);
                            uia_problem_reporting.uia_problem_reporting_email_autoreport(format(NIL, $str_alt38$User_disagreed_with_an_interpreta, assertion), format(NIL, $str_alt39$This_is_an_auto_mailed_message___, new SubLObject[]{ $str_alt40$cb_uiat_smart, $str_alt41$uiat_sr_rejected_assertion, assertion, force }), child);
                            uiat_sr_rejected_assertion(parent, concept);
                        }
                    }
                }
            } else
                if (pcase_var.eql($DISAMBIGUATE_PHRASE)) {
                    {
                        SubLObject type_3 = user_interaction_agenda.ui_state_lookup(child, $TYPE, UNPROVIDED);
                        if ($TRUE == user_interaction_agenda.ui_state_lookup(child, $kw44$DISCOURSE_INDEXICAL_, UNPROVIDED)) {
                            {
                                SubLObject v_term = user_interaction_agenda.ui_result(child);
                                SubLObject bundle = user_interaction_agenda.ui_state_lookup(child, $DISCOURSE_BUNDLE, UNPROVIDED);
                                SubLObject original_term = rkf_discourse_tracking.rkf_discourse_bundle_original(bundle);
                                SubLObject concept = rkf_discourse_tracking.rkf_discourse_bundle_ar_concept(bundle);
                                rkf_assisted_reader.subst_ar_concept_cycl(concept, v_term, original_term);
                                {
                                    SubLObject state = user_interaction_agenda.ui_state_lookup(parent, $AR_STATE, UNPROVIDED);
                                    if (rkf_assisted_reader.ar_state_next_implied_indexical(state) == concept) {
                                    }
                                }
                            }
                        } else {
                            {
                                SubLObject pcase_var_4 = type_3;
                                if (pcase_var_4.eql($ASSERTION)) {
                                    {
                                        SubLObject formula = user_interaction_agenda.ui_result(child);
                                        SubLObject concepts = user_interaction_agenda.ui_state_lookup(child, $CONCEPTS, UNPROVIDED);
                                        SubLObject cdolist_list_var = concepts;
                                        SubLObject current = NIL;
                                        for (current = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , current = cdolist_list_var.first()) {
                                            if (rkf_assisted_reader.ar_concept_cycl(current).equal(formula)) {
                                                uiat_sr_accepted_assertion(parent, current);
                                            } else {
                                                uiat_sr_rejected_assertion(parent, current);
                                            }
                                        }
                                    }
                                } else {
                                    {
                                        SubLObject concept = user_interaction_agenda.ui_result(child);
                                        SubLObject phrase = user_interaction_agenda.ui_state_lookup(child, $PHRASE, UNPROVIDED);
                                        if (concept == $NONE) {
                                            uiat_sr_rejected_disambiguated_concept(parent, concept, phrase, type_3);
                                        } else
                                            if (type_3 == $NEW) {
                                                uiat_sr_new_term_for_phrase(parent, concept, phrase);
                                            } else {
                                                uiat_sr_accepted_disambiguated_concept(parent, concept, phrase, type_3);
                                            }

                                    }
                                }
                            }
                        }
                    }
                } else
                    if (pcase_var.eql($CONCEPT_CREATOR) || pcase_var.eql($UNKNOWN_TERM)) {
                        {
                            SubLObject new_term = user_interaction_agenda.ui_result(child);
                            SubLObject phrase = user_interaction_agenda.ui_state_lookup(child, $PHRASE, UNPROVIDED);
                            uiat_sr_new_term_for_phrase(parent, new_term, phrase);
                        }
                    } else {
                        Errors.warn($str_alt53$Unexpected_child_of_type__S_recei, type);
                    }


        }
        return parent;
    }

    public static final SubLObject uiat_sentence_reader_rejected_method(SubLObject parent, SubLObject child) {
        {
            SubLObject type = user_interaction_agenda.ui_operator(child);
            SubLObject pcase_var = type;
            if (pcase_var.eql($CONCEPT_CREATOR) || pcase_var.eql($UNKNOWN_TERM)) {
                {
                    SubLObject phrase = user_interaction_agenda.ui_state_lookup(child, $PHRASE, UNPROVIDED);
                    return uiat_sr_new_term_for_phrase(parent, $CANCEL, phrase);
                }
            }
        }
        {
            SubLObject state_id = user_interaction_agenda.ui_state_lookup(parent, $AR_STATE_ID, UNPROVIDED);
            if (state_id.isNumber()) {
                user_interaction_agenda.uia_glob_remove(cb_user_interaction_agenda.cb_current_uia(), state_id);
            }
        }
        return user_interaction_agenda.uia_act_invalidate(cb_user_interaction_agenda.cb_current_uia(), parent);
    }



    public static final SubLObject with_rkf_tool_context(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt58);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject v_agenda = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt58);
                    v_agenda = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, list(list($rkf_mt$, list(UIA_DOMAIN_INTERACTION_MT, v_agenda)), list($rkf_ar_parsing_mt$, list(UIA_PARSING_INTERACTION_MT, v_agenda)), list($rkf_ar_semantics_mt$, list(UIA_DOMAIN_INTERACTION_MT, v_agenda)), list($rkf_user$, listS(UIMA_STATE_LOOKUP, list(UIA_META_AGENDA, v_agenda), $list_alt68))), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt58);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject with_rkf_sentence_context(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt58);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject v_agenda = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt58);
                    v_agenda = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(CLET, $list_alt69, listS(WITH_RKF_TOOL_CONTEXT, list(v_agenda), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt58);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject with_rkf_question_context(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt58);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject v_agenda = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt58);
                    v_agenda = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(CLET, $list_alt71, listS(WITH_RKF_TOOL_CONTEXT, list(v_agenda), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt58);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject with_constraint_rkf_context(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt72);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject v_agenda = NIL;
                    SubLObject constraints = NIL;
                    SubLObject context_type = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt72);
                    v_agenda = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt72);
                    constraints = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt72);
                    context_type = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject type = (context_type == $SENTENCE) ? ((SubLObject) (WITH_RKF_SENTENCE_CONTEXT)) : WITH_RKF_QUESTION_CONTEXT;
                            return list(RKF_AR_WITH_ADDITIONAL_CONSTRAINTS, list(constraints), listS(type, list(v_agenda), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt72);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_sentence_reader_hint(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject sentence = args.first();
            return format(NIL, $str_alt8$Read___A_, sentence);
        }
    }

    /**
     * Remove any concepts that are not bona fide.
     *
     * @param CONCEPTS;
     * 		listp of AR CONCEPTs.
     * @unknown baxter
     */
    public static final SubLObject cb_uiat_sr_filter_candidates(SubLObject concepts) {
        return remove($CANCEL, concepts, EXPRESSION_FIND, AR_CONCEPT_CYCL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cb_uiat_sentence_reader_display(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                SubLObject args = user_interaction_agenda.ui_args(interaction);
                SubLObject sentence = args.first();
                SubLObject type = second(args);
                SubLObject state = user_interaction_agenda.ui_state_lookup(interaction, $AR_STATE, NIL);
                if (NIL == state) {
                    state = cb_uiat_sentence_reader_constructor(interaction, sentence, UNPROVIDED);
                    if (NIL == rkf_assisted_reader.ar_state_top_level_parsesP(state)) {
                        cb_uiat_sentence_reader_no_parse(v_agenda, interaction, sentence);
                        return NIL;
                    }
                }
                rkf_assisted_reader._csetf_ar_state_candidate_cycls(state, cb_uiat_sr_filter_candidates(rkf_assisted_reader.ar_state_candidate_cycls(state)));
                {
                    SubLObject _prev_bind_0 = rkf_discourse_tracking.$rkf_discourse_context$.currentBinding(thread);
                    try {
                        rkf_discourse_tracking.$rkf_discourse_context$.bind(uia_discourse_tracking.uia_discourse_object_from_interaction(interaction), thread);
                        if (NIL != rkf_assisted_reader.ar_state_focus_sentence(state)) {
                            if (NIL != rkf_assisted_reader.ar_state_candidate_cycls(state)) {
                                cb_uiat_sentence_reader_candidate_cycls(v_agenda, interaction, state);
                            } else
                                if (NIL != rkf_assisted_reader.ar_state_pending_implied_indexicals(state)) {
                                    {
                                        SubLObject indexical = rkf_assisted_reader.ar_state_next_implied_indexical(state);
                                        cb_uiat_sentence_reader_implied_indexical(interaction, state, indexical);
                                    }
                                } else
                                    if (NIL != rkf_assisted_reader.ar_state_next_assumed_phrase(state)) {
                                        {
                                            SubLObject phrase = rkf_assisted_reader.ar_state_next_assumed_phrase(state);
                                            cb_uiat_sentence_reader_assumed_phrase(interaction, state, phrase);
                                        }
                                    } else
                                        if (NIL != rkf_assisted_reader.ar_state_next_ambiguous_phrase(state)) {
                                            {
                                                SubLObject phrase = rkf_assisted_reader.ar_state_next_ambiguous_phrase(state);
                                                cb_uiat_sentence_reader_ambiguous_phrase(interaction, state, phrase);
                                            }
                                        } else
                                            if (NIL != rkf_assisted_reader.ar_state_next_unknown_phrase(state)) {
                                                {
                                                    SubLObject phrase = rkf_assisted_reader.ar_state_select_most_promising_unknown_phrase(state);
                                                    cb_uiat_sentence_reader_unknown_phrase(interaction, state, phrase);
                                                }
                                            } else {
                                                cb_uiat_sentence_reader_stuck(v_agenda, interaction, sentence, T);
                                            }




                        } else
                            if (((NIL == rkf_assisted_reader.ar_state_candidate_cycls(state)) && (NIL == rkf_assisted_reader.ar_state_asserted_assertions(state))) && (NIL == rkf_assisted_reader.ar_state_completed_sentences(state))) {
                                cb_uiat_sentence_reader_no_parse(v_agenda, interaction, sentence);
                            } else {
                                cb_uiat_sentence_reader_complete(v_agenda, interaction);
                                cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                            }

                    } finally {
                        rkf_discourse_tracking.$rkf_discourse_context$.rebind(_prev_bind_0, thread);
                    }
                }
                return NIL;
            }
        }
    }

    // deflexical
    private static final SubLSymbol $cb_uiat_interaction_to_ar_state_map$ = makeSymbol("*CB-UIAT-INTERACTION-TO-AR-STATE-MAP*");

    /**
     * Provide a back-link from the state to the interactions.
     */
    public static final SubLObject cb_uiat_sr_associate_interaction_and_state(SubLObject interaction, SubLObject state) {
        return dictionary.dictionary_enter($cb_uiat_interaction_to_ar_state_map$.getGlobalValue(), state, interaction);
    }

    public static final SubLObject cb_uiat_sr_find_interaction_by_state(SubLObject state) {
        return dictionary.dictionary_lookup($cb_uiat_interaction_to_ar_state_map$.getGlobalValue(), state, UNPROVIDED);
    }

    // deflexical
    private static final SubLSymbol $cb_uiat_last_ar_state$ = makeSymbol("*CB-UIAT-LAST-AR-STATE*");

    public static final SubLObject cb_uiat_sentence_reader_constructor(SubLObject interaction, SubLObject sentence, SubLObject prev_state) {
        if (prev_state == UNPROVIDED) {
            prev_state = NIL;
        }
        {
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject type = second(args);
            SubLObject indexical_map = third(args);
            SubLObject constraint_table = fourth(args);
            SubLObject ar_state = uiat_sentence_reader_construct_ar_state(interaction, sentence, prev_state, type, indexical_map);
            if (NIL != indexical_map) {
                user_interaction_agenda.ui_state_update(interaction, $CONSTRAINT_TABLE, constraint_table);
                user_interaction_agenda.ui_state_update(interaction, $INDEXICAL_MAP, indexical_map);
            }
            if (type == $QUESTION) {
                user_interaction_agenda.ui_state_update(interaction, $TEXT_TYPE, $QUESTION);
            } else {
                user_interaction_agenda.ui_state_update(interaction, $TEXT_TYPE, $SENTENCE);
            }
            user_interaction_agenda.ui_state_update(interaction, $SOLUTIONS, NIL);
            return ar_state;
        }
    }

    public static final SubLObject uiat_sentence_reader_construct_ar_state(SubLObject interaction, SubLObject sentence, SubLObject prev_state, SubLObject type, SubLObject indexical_map) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject ar_state = (NIL != prev_state) ? ((SubLObject) (prev_state)) : rkf_assisted_reader.new_ar_state();
                SubLObject ar_state_id = user_interaction_agenda.uia_glob_add(v_agenda, ar_state);
                SubLObject v_parse_tree = user_interaction_agenda.ui_state_lookup(interaction, $PARSE_TREE, UNPROVIDED);
                user_interaction_agenda.uia_act_new_comment(v_agenda, cconcatenate($str_alt82$Goodnews__Let_me_try_to_read_this, new SubLObject[]{ sentence, $str_alt83$__ }));
                cb_uiat_sr_associate_interaction_and_state(interaction, ar_state);
                $cb_uiat_last_ar_state$.setGlobalValue(ar_state);
                {
                    SubLObject _prev_bind_0 = parsing_vars.$psp_indexical_map$.currentBinding(thread);
                    SubLObject _prev_bind_1 = rkf_discourse_tracking.$rkf_discourse_context$.currentBinding(thread);
                    try {
                        parsing_vars.$psp_indexical_map$.bind(parsing_indexical_map_from_paraphrase_map(indexical_map), thread);
                        rkf_discourse_tracking.$rkf_discourse_context$.bind(uia_discourse_tracking.uia_discourse_object_from_interaction(interaction), thread);
                        if (type == $QUESTION) {
                            {
                                SubLObject _prev_bind_0_5 = rkf_assisted_reader.$rkf_ar_processing_mode$.currentBinding(thread);
                                SubLObject _prev_bind_1_6 = control_vars.$rkf_mt$.currentBinding(thread);
                                SubLObject _prev_bind_2 = rkf_assisted_reader.$rkf_ar_parsing_mt$.currentBinding(thread);
                                SubLObject _prev_bind_3 = rkf_assisted_reader.$rkf_ar_semantics_mt$.currentBinding(thread);
                                SubLObject _prev_bind_4 = rkf_assisted_reader.$rkf_user$.currentBinding(thread);
                                try {
                                    rkf_assisted_reader.$rkf_ar_processing_mode$.bind($QUESTION_PROCESSING, thread);
                                    control_vars.$rkf_mt$.bind(user_interaction_agenda.uia_domain_interaction_mt(v_agenda), thread);
                                    rkf_assisted_reader.$rkf_ar_parsing_mt$.bind(user_interaction_agenda.uia_parsing_interaction_mt(v_agenda), thread);
                                    rkf_assisted_reader.$rkf_ar_semantics_mt$.bind(user_interaction_agenda.uia_domain_interaction_mt(v_agenda), thread);
                                    rkf_assisted_reader.$rkf_user$.bind(user_interaction_agenda.uima_state_lookup(user_interaction_agenda.uia_meta_agenda(v_agenda), $USER, UNPROVIDED), thread);
                                    rkf_assisted_reader.rkf_ar_act_add_source_text(ar_state, sentence, v_parse_tree);
                                } finally {
                                    rkf_assisted_reader.$rkf_user$.rebind(_prev_bind_4, thread);
                                    rkf_assisted_reader.$rkf_ar_semantics_mt$.rebind(_prev_bind_3, thread);
                                    rkf_assisted_reader.$rkf_ar_parsing_mt$.rebind(_prev_bind_2, thread);
                                    control_vars.$rkf_mt$.rebind(_prev_bind_1_6, thread);
                                    rkf_assisted_reader.$rkf_ar_processing_mode$.rebind(_prev_bind_0_5, thread);
                                }
                            }
                        } else {
                            {
                                SubLObject _prev_bind_0_7 = rkf_assisted_reader.$rkf_ar_processing_mode$.currentBinding(thread);
                                SubLObject _prev_bind_1_8 = control_vars.$rkf_mt$.currentBinding(thread);
                                SubLObject _prev_bind_2 = rkf_assisted_reader.$rkf_ar_parsing_mt$.currentBinding(thread);
                                SubLObject _prev_bind_3 = rkf_assisted_reader.$rkf_ar_semantics_mt$.currentBinding(thread);
                                SubLObject _prev_bind_4 = rkf_assisted_reader.$rkf_user$.currentBinding(thread);
                                try {
                                    rkf_assisted_reader.$rkf_ar_processing_mode$.bind($TEXT_PROCESSING, thread);
                                    control_vars.$rkf_mt$.bind(user_interaction_agenda.uia_domain_interaction_mt(v_agenda), thread);
                                    rkf_assisted_reader.$rkf_ar_parsing_mt$.bind(user_interaction_agenda.uia_parsing_interaction_mt(v_agenda), thread);
                                    rkf_assisted_reader.$rkf_ar_semantics_mt$.bind(user_interaction_agenda.uia_domain_interaction_mt(v_agenda), thread);
                                    rkf_assisted_reader.$rkf_user$.bind(user_interaction_agenda.uima_state_lookup(user_interaction_agenda.uia_meta_agenda(v_agenda), $USER, UNPROVIDED), thread);
                                    rkf_assisted_reader.rkf_ar_act_add_source_text(ar_state, sentence, v_parse_tree);
                                } finally {
                                    rkf_assisted_reader.$rkf_user$.rebind(_prev_bind_4, thread);
                                    rkf_assisted_reader.$rkf_ar_semantics_mt$.rebind(_prev_bind_3, thread);
                                    rkf_assisted_reader.$rkf_ar_parsing_mt$.rebind(_prev_bind_2, thread);
                                    control_vars.$rkf_mt$.rebind(_prev_bind_1_8, thread);
                                    rkf_assisted_reader.$rkf_ar_processing_mode$.rebind(_prev_bind_0_7, thread);
                                }
                            }
                        }
                    } finally {
                        rkf_discourse_tracking.$rkf_discourse_context$.rebind(_prev_bind_1, thread);
                        parsing_vars.$psp_indexical_map$.rebind(_prev_bind_0, thread);
                    }
                }
                user_interaction_agenda.ui_state_update(interaction, $AR_STATE, ar_state);
                user_interaction_agenda.ui_state_update(interaction, $AR_STATE_ID, ar_state_id);
                return ar_state;
            }
        }
    }

    /**
     * Convert a paraphrase-style indexical map to a parsing-style map.
     *
     * @unknown baxter
     */
    public static final SubLObject parsing_indexical_map_from_paraphrase_map(SubLObject indexical_map) {
        {
            SubLObject new_map = NIL;
            SubLObject cdolist_list_var = indexical_map;
            SubLObject cons = NIL;
            for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                {
                    SubLObject datum = cons;
                    SubLObject current = datum;
                    SubLObject indexical = NIL;
                    SubLObject string = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt87);
                    indexical = current.first();
                    current = current.rest();
                    string = current;
                    new_map = list_utilities.alist_enter(new_map, string, indexical, symbol_function(EQUALP));
                }
            }
            return new_map;
        }
    }

    public static final SubLObject cb_uiat_sentence_reader_no_parse(SubLObject v_agenda, SubLObject interaction, SubLObject sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject state = user_interaction_agenda.ui_state_lookup(interaction, $AR_STATE, UNPROVIDED);
                SubLObject sentence_struct = rkf_assisted_reader.ar_state_focus_sentence(state);
                SubLObject sentence_length = (NIL == sentence_struct) ? ((SubLObject) (MINUS_ONE_INTEGER)) : length(rkf_assisted_reader.ar_sentence_token_vector(sentence_struct));
                SubLObject change_word = (EIGHT_INTEGER.numL(sentence_length)) ? ((SubLObject) ($$$simpler)) : $$$different;
                SubLObject indexical_map = user_interaction_agenda.ui_state_lookup(interaction, $INDEXICAL_MAP, UNPROVIDED);
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
                html_utilities.html_princ($str_alt90$I_am_unable_to_read_your_sentence);
                html_utilities.html_newline(TWO_INTEGER);
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ(sentence);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_newline(TWO_INTEGER);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt91$You_might_consider_rephrasing_the, change_word);
                {
                    SubLObject parsing_mt = user_interaction_agenda.ui_parsing_interaction_mt(interaction);
                    SubLObject all_unknown_words = nl_trie_accessors.nl_trie_unknown_strings(sentence, parsing_mt, UNPROVIDED);
                    SubLObject unknown_words = NIL;
                    if (NIL == indexical_map) {
                        unknown_words = all_unknown_words;
                    } else {
                        {
                            SubLObject cdolist_list_var = all_unknown_words;
                            SubLObject unknown_word = NIL;
                            for (unknown_word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , unknown_word = cdolist_list_var.first()) {
                                if (NIL == find(unknown_word, indexical_map, symbol_function(STRING_EQUAL), symbol_function(CDR), UNPROVIDED, UNPROVIDED)) {
                                    unknown_words = cons(unknown_word, unknown_words);
                                }
                            }
                        }
                    }
                    if (NIL != unknown_words) {
                        html_utilities.html_newline(TWO_INTEGER);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ($str_alt94$Hint__);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_utilities.html_princ($str_alt95$I_don_t_know_what_the_following_w);
                        html_utilities.html_newline(UNPROVIDED);
                        {
                            SubLObject cdolist_list_var = unknown_words;
                            SubLObject word = NIL;
                            for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word = cdolist_list_var.first()) {
                                html_utilities.html_princ($str_alt96$_);
                                html_utilities.html_princ(word);
                                html_utilities.html_princ($str_alt96$_);
                                html_utilities.html_newline(UNPROVIDED);
                            }
                        }
                    }
                }
                html_utilities.html_newline(TWO_INTEGER);
                cb_utilities.cb_link($UIA_NEXT_INTERACTION, $str_alt98$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                cb_uiat_sentence_reader_complete(v_agenda, interaction);
                cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_sentence_reader_stuck(SubLObject v_agenda, SubLObject interaction, SubLObject sentence, SubLObject stuckP) {
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
            html_utilities.html_newline(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ($$$Read_a_Sentence);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_newline(UNPROVIDED);
            html_utilities.html_princ($str_alt100$I_believe_I_am_);
            html_utilities.html_princ(NIL != stuckP ? ((SubLObject) ($$$stuck)) : $$$done);
            html_utilities.html_princ($str_alt103$_reading__);
            html_utilities.html_princ(sentence);
            html_utilities.html_princ($str_alt104$_);
            {
                SubLObject solutions = user_interaction_agenda.ui_state_lookup(interaction, $SOLUTIONS, UNPROVIDED);
                SubLObject text_type = user_interaction_agenda.ui_state_lookup(interaction, $TEXT_TYPE, UNPROVIDED);
                SubLObject indexical_map = user_interaction_agenda.ui_state_lookup(interaction, $INDEXICAL_MAP, UNPROVIDED);
                if (NIL != solutions) {
                    html_utilities.html_newline(TWO_INTEGER);
                    html_utilities.html_princ($str_alt105$We_have_agreed_on_the_following_i);
                    html_utilities.html_newline(ONE_INTEGER);
                    html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            {
                                SubLObject cdolist_list_var = solutions;
                                SubLObject solution = NIL;
                                for (solution = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , solution = cdolist_list_var.first()) {
                                    {
                                        SubLObject _prev_bind_0_9 = pph_vars.$pph_term_paraphrase_map$.currentBinding(thread);
                                        try {
                                            pph_vars.$pph_term_paraphrase_map$.bind(indexical_map, thread);
                                            html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    if (text_type == $QUESTION) {
                                                        cb_uia_display_primitives.cb_uia_show_question(solution, UNPROVIDED);
                                                    } else {
                                                        cb_uia_display_primitives.cb_uia_show_sentence(solution, UNPROVIDED);
                                                    }
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                        } finally {
                                            pph_vars.$pph_term_paraphrase_map$.rebind(_prev_bind_0_9, thread);
                                        }
                                    }
                                }
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                    html_utilities.html_newline(ONE_INTEGER);
                }
            }
            html_utilities.html_newline(TWO_INTEGER);
            cb_utilities.cb_link($UIA_NEXT_INTERACTION, $str_alt106$_Done_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            cb_uiat_sentence_reader_complete(v_agenda, interaction);
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_sentence_reader_complete(SubLObject v_agenda, SubLObject interaction) {
        {
            SubLObject solutions = user_interaction_agenda.ui_state_lookup(interaction, $SOLUTIONS, UNPROVIDED);
            SubLObject answers = NIL;
            SubLObject cdolist_list_var = solutions;
            SubLObject solution = NIL;
            for (solution = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , solution = cdolist_list_var.first()) {
                if (NIL != user_interaction_agenda.ui_state_lookup(interaction, $RESOLVE_NARTS, UNPROVIDED)) {
                    solution = cb_uiat_resolve_potential_narts(interaction, solution);
                }
                answers = cons(solution, answers);
            }
            user_interaction_agenda.uia_act_complete(v_agenda, interaction, answers);
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_resolve_potential_narts(SubLObject interaction, SubLObject solution) {
        return narts_high.nart_substitute(solution);
    }

    public static final SubLObject cb_uiat_sentence_reader_candidate_cycls(SubLObject v_agenda, SubLObject interaction, SubLObject state) {
        {
            SubLObject concepts = rkf_assisted_reader.ar_state_candidate_cycls(state);
            SubLObject indexical_map = user_interaction_agenda.ui_state_lookup(interaction, $INDEXICAL_MAP, UNPROVIDED);
            SubLObject child = NIL;
            if (NIL != list_utilities.singletonP(concepts)) {
                {
                    SubLObject concept = concepts.first();
                    if (NIL != uiat_sr_is_constraint_readerP(interaction)) {
                        uiat_sr_potentially_preprocess_negation(concept);
                    }
                    if (NIL != cb_uiat_orthographically_equivalent_sentences(v_agenda, interaction, concept)) {
                        uiat_sr_accepted_assertion(interaction, concept);
                        cb_uiat_sentence_reader_complete(v_agenda, interaction);
                        return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                    }
                    child = user_interaction_agenda.uia_act_new_interaction(v_agenda, $REQUIRED, $YES_NO_QUESTION, list($str_alt107$Do_you_agree_to_this_interpretati, CB_UIAT_SR_RENDER_CANDIDATE_CYCL, NIL, indexical_map), UNPROVIDED);
                    user_interaction_agenda.ui_state_update(child, $ASSERTION, rkf_assisted_reader.ar_concept_cycl(concept));
                    user_interaction_agenda.ui_state_update(child, $CONCEPT, concept);
                    user_interaction_agenda.ui_state_update(child, $FORCE, rkf_assisted_reader.ar_concept_force(concept));
                    user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                }
            } else {
                {
                    SubLObject sentence = user_interaction_agenda.ui_args(interaction).first();
                    SubLObject clarify_links = user_interaction_agenda.ui_state_lookup(interaction, $CLARIFY_LINKS, $TRUE);
                    SubLObject assertions = NIL;
                    SubLObject force = rkf_assisted_reader.ar_concept_force(concepts.first());
                    SubLObject cdolist_list_var = concepts;
                    SubLObject concept = NIL;
                    for (concept = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , concept = cdolist_list_var.first()) {
                        {
                            SubLObject item_var = rkf_assisted_reader.ar_concept_cycl(concept);
                            if (NIL == member(item_var, assertions, symbol_function(EQL), symbol_function(IDENTITY))) {
                                assertions = cons(item_var, assertions);
                            }
                        }
                    }
                    child = uia_tools_basic.uia_act_new_disambiguate_phrase(v_agenda, $REQUIRED, sentence, assertions, clarify_links, NIL, $INDISTINGUISHED, NIL, indexical_map, force);
                    user_interaction_agenda.ui_state_update(child, $TYPE, $ASSERTION);
                    user_interaction_agenda.ui_state_update(child, $CONCEPTS, concepts);
                    user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                }
            }
        }
        return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
    }

    public static final SubLObject uiat_sr_potentially_preprocess_negation(SubLObject concept) {
        {
            SubLObject cycl = rkf_assisted_reader.ar_concept_cycl(concept);
            if (cycl_utilities.formula_arg0(cycl) == $$not) {
                el_utilities.nreplace_formula_arg(ZERO_INTEGER, $$unknownSentence, cycl);
            }
        }
        return concept;
    }

    public static final SubLObject cb_uiat_orthographically_equivalent_sentences(SubLObject v_agenda, SubLObject interaction, SubLObject concept) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject original_sentence = user_interaction_agenda.ui_args(interaction).first();
                SubLObject force = rkf_assisted_reader.ar_concept_force(concept);
                SubLObject cycl_sentence = rkf_assisted_reader.ar_concept_cycl(concept);
                SubLObject indexical_map = user_interaction_agenda.ui_state_lookup(interaction, $INDEXICAL_MAP, UNPROVIDED);
                SubLObject new_sentence = NIL;
                {
                    SubLObject _prev_bind_0 = pph_vars.$pph_term_paraphrase_map$.currentBinding(thread);
                    try {
                        pph_vars.$pph_term_paraphrase_map$.bind(indexical_map, thread);
                        new_sentence = (force == $QUESTION) ? ((SubLObject) (uia_trampolines.uia_query_phrase(v_agenda, cycl_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : uia_trampolines.uia_assertion_phrase(v_agenda, cycl_sentence, UNPROVIDED, UNPROVIDED);
                    } finally {
                        pph_vars.$pph_term_paraphrase_map$.rebind(_prev_bind_0, thread);
                    }
                }
                return string_utilities.weak_string_equal(original_sentence, new_sentence);
            }
        }
    }

    public static final SubLObject cb_uiat_sr_render_candidate_cycl(SubLObject interaction) {
        {
            SubLObject assertion = user_interaction_agenda.ui_state_lookup(interaction, $ASSERTION, UNPROVIDED);
            SubLObject force = user_interaction_agenda.ui_state_lookup(interaction, $FORCE, UNPROVIDED);
            html_utilities.html_newline(TWO_INTEGER);
            html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
            if (force == $QUESTION) {
                cb_uia_display_primitives.cb_uia_show_query_with_clarifying_link(assertion, UNPROVIDED);
            } else {
                cb_uia_display_primitives.cb_uia_show_sentence_with_clarifying_link(assertion, UNPROVIDED);
            }
            html_utilities.html_newline(ONE_INTEGER);
            html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
            html_utilities.html_newline(UNPROVIDED);
        }
        return interaction;
    }

    /**
     * Called upon child returning and USER saying no.
     */
    public static final SubLObject uiat_sr_rejected_assertion(SubLObject interaction, SubLObject concept) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject state = user_interaction_agenda.ui_state_lookup(interaction, $AR_STATE, UNPROVIDED);
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject force = user_interaction_agenda.ui_state_lookup(interaction, $TEXT_TYPE, UNPROVIDED);
                if (force == $QUESTION) {
                    {
                        SubLObject _prev_bind_0 = rkf_assisted_reader.$rkf_ar_processing_mode$.currentBinding(thread);
                        SubLObject _prev_bind_1 = control_vars.$rkf_mt$.currentBinding(thread);
                        SubLObject _prev_bind_2 = rkf_assisted_reader.$rkf_ar_parsing_mt$.currentBinding(thread);
                        SubLObject _prev_bind_3 = rkf_assisted_reader.$rkf_ar_semantics_mt$.currentBinding(thread);
                        SubLObject _prev_bind_4 = rkf_assisted_reader.$rkf_user$.currentBinding(thread);
                        try {
                            rkf_assisted_reader.$rkf_ar_processing_mode$.bind($QUESTION_PROCESSING, thread);
                            control_vars.$rkf_mt$.bind(user_interaction_agenda.uia_domain_interaction_mt(v_agenda), thread);
                            rkf_assisted_reader.$rkf_ar_parsing_mt$.bind(user_interaction_agenda.uia_parsing_interaction_mt(v_agenda), thread);
                            rkf_assisted_reader.$rkf_ar_semantics_mt$.bind(user_interaction_agenda.uia_domain_interaction_mt(v_agenda), thread);
                            rkf_assisted_reader.$rkf_user$.bind(user_interaction_agenda.uima_state_lookup(user_interaction_agenda.uia_meta_agenda(v_agenda), $USER, UNPROVIDED), thread);
                            {
                                SubLObject address = uia_mumbler.uia_mumble_create_address_for_uia(v_agenda);
                                {
                                    SubLObject _prev_bind_0_11 = rkf_mumbler.$rkf_default_mumble_address$.currentBinding(thread);
                                    try {
                                        rkf_mumbler.$rkf_default_mumble_address$.bind(address, thread);
                                        rkf_assisted_reader.rkf_ar_act_reject_assert_concept(state, concept);
                                    } finally {
                                        rkf_mumbler.$rkf_default_mumble_address$.rebind(_prev_bind_0_11, thread);
                                    }
                                }
                            }
                        } finally {
                            rkf_assisted_reader.$rkf_user$.rebind(_prev_bind_4, thread);
                            rkf_assisted_reader.$rkf_ar_semantics_mt$.rebind(_prev_bind_3, thread);
                            rkf_assisted_reader.$rkf_ar_parsing_mt$.rebind(_prev_bind_2, thread);
                            control_vars.$rkf_mt$.rebind(_prev_bind_1, thread);
                            rkf_assisted_reader.$rkf_ar_processing_mode$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    {
                        SubLObject _prev_bind_0 = rkf_assisted_reader.$rkf_ar_processing_mode$.currentBinding(thread);
                        SubLObject _prev_bind_1 = control_vars.$rkf_mt$.currentBinding(thread);
                        SubLObject _prev_bind_2 = rkf_assisted_reader.$rkf_ar_parsing_mt$.currentBinding(thread);
                        SubLObject _prev_bind_3 = rkf_assisted_reader.$rkf_ar_semantics_mt$.currentBinding(thread);
                        SubLObject _prev_bind_4 = rkf_assisted_reader.$rkf_user$.currentBinding(thread);
                        try {
                            rkf_assisted_reader.$rkf_ar_processing_mode$.bind($TEXT_PROCESSING, thread);
                            control_vars.$rkf_mt$.bind(user_interaction_agenda.uia_domain_interaction_mt(v_agenda), thread);
                            rkf_assisted_reader.$rkf_ar_parsing_mt$.bind(user_interaction_agenda.uia_parsing_interaction_mt(v_agenda), thread);
                            rkf_assisted_reader.$rkf_ar_semantics_mt$.bind(user_interaction_agenda.uia_domain_interaction_mt(v_agenda), thread);
                            rkf_assisted_reader.$rkf_user$.bind(user_interaction_agenda.uima_state_lookup(user_interaction_agenda.uia_meta_agenda(v_agenda), $USER, UNPROVIDED), thread);
                            {
                                SubLObject address = uia_mumbler.uia_mumble_create_address_for_uia(v_agenda);
                                {
                                    SubLObject _prev_bind_0_12 = rkf_mumbler.$rkf_default_mumble_address$.currentBinding(thread);
                                    try {
                                        rkf_mumbler.$rkf_default_mumble_address$.bind(address, thread);
                                        rkf_assisted_reader.rkf_ar_act_reject_assert_concept(state, concept);
                                    } finally {
                                        rkf_mumbler.$rkf_default_mumble_address$.rebind(_prev_bind_0_12, thread);
                                    }
                                }
                            }
                        } finally {
                            rkf_assisted_reader.$rkf_user$.rebind(_prev_bind_4, thread);
                            rkf_assisted_reader.$rkf_ar_semantics_mt$.rebind(_prev_bind_3, thread);
                            rkf_assisted_reader.$rkf_ar_parsing_mt$.rebind(_prev_bind_2, thread);
                            control_vars.$rkf_mt$.rebind(_prev_bind_1, thread);
                            rkf_assisted_reader.$rkf_ar_processing_mode$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return interaction;
        }
    }

    /**
     * Called upon child returning and USER saying yes.
     */
    public static final SubLObject uiat_sr_accepted_assertion(SubLObject interaction, SubLObject concept) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject state = user_interaction_agenda.ui_state_lookup(interaction, $AR_STATE, UNPROVIDED);
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject force = user_interaction_agenda.ui_state_lookup(interaction, $TEXT_TYPE, UNPROVIDED);
                SubLObject semantic_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
                if (force == $QUESTION) {
                    {
                        SubLObject _prev_bind_0 = rkf_assisted_reader.$rkf_ar_processing_mode$.currentBinding(thread);
                        SubLObject _prev_bind_1 = control_vars.$rkf_mt$.currentBinding(thread);
                        SubLObject _prev_bind_2 = rkf_assisted_reader.$rkf_ar_parsing_mt$.currentBinding(thread);
                        SubLObject _prev_bind_3 = rkf_assisted_reader.$rkf_ar_semantics_mt$.currentBinding(thread);
                        SubLObject _prev_bind_4 = rkf_assisted_reader.$rkf_user$.currentBinding(thread);
                        try {
                            rkf_assisted_reader.$rkf_ar_processing_mode$.bind($QUESTION_PROCESSING, thread);
                            control_vars.$rkf_mt$.bind(user_interaction_agenda.uia_domain_interaction_mt(v_agenda), thread);
                            rkf_assisted_reader.$rkf_ar_parsing_mt$.bind(user_interaction_agenda.uia_parsing_interaction_mt(v_agenda), thread);
                            rkf_assisted_reader.$rkf_ar_semantics_mt$.bind(user_interaction_agenda.uia_domain_interaction_mt(v_agenda), thread);
                            rkf_assisted_reader.$rkf_user$.bind(user_interaction_agenda.uima_state_lookup(user_interaction_agenda.uia_meta_agenda(v_agenda), $USER, UNPROVIDED), thread);
                            rkf_assisted_reader.rkf_ar_act_assert_concept(state, concept);
                        } finally {
                            rkf_assisted_reader.$rkf_user$.rebind(_prev_bind_4, thread);
                            rkf_assisted_reader.$rkf_ar_semantics_mt$.rebind(_prev_bind_3, thread);
                            rkf_assisted_reader.$rkf_ar_parsing_mt$.rebind(_prev_bind_2, thread);
                            control_vars.$rkf_mt$.rebind(_prev_bind_1, thread);
                            rkf_assisted_reader.$rkf_ar_processing_mode$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    {
                        SubLObject _prev_bind_0 = rkf_assisted_reader.$rkf_ar_processing_mode$.currentBinding(thread);
                        SubLObject _prev_bind_1 = control_vars.$rkf_mt$.currentBinding(thread);
                        SubLObject _prev_bind_2 = rkf_assisted_reader.$rkf_ar_parsing_mt$.currentBinding(thread);
                        SubLObject _prev_bind_3 = rkf_assisted_reader.$rkf_ar_semantics_mt$.currentBinding(thread);
                        SubLObject _prev_bind_4 = rkf_assisted_reader.$rkf_user$.currentBinding(thread);
                        try {
                            rkf_assisted_reader.$rkf_ar_processing_mode$.bind($TEXT_PROCESSING, thread);
                            control_vars.$rkf_mt$.bind(user_interaction_agenda.uia_domain_interaction_mt(v_agenda), thread);
                            rkf_assisted_reader.$rkf_ar_parsing_mt$.bind(user_interaction_agenda.uia_parsing_interaction_mt(v_agenda), thread);
                            rkf_assisted_reader.$rkf_ar_semantics_mt$.bind(user_interaction_agenda.uia_domain_interaction_mt(v_agenda), thread);
                            rkf_assisted_reader.$rkf_user$.bind(user_interaction_agenda.uima_state_lookup(user_interaction_agenda.uia_meta_agenda(v_agenda), $USER, UNPROVIDED), thread);
                            rkf_assisted_reader.rkf_ar_act_assert_concept(state, concept);
                        } finally {
                            rkf_assisted_reader.$rkf_user$.rebind(_prev_bind_4, thread);
                            rkf_assisted_reader.$rkf_ar_semantics_mt$.rebind(_prev_bind_3, thread);
                            rkf_assisted_reader.$rkf_ar_parsing_mt$.rebind(_prev_bind_2, thread);
                            control_vars.$rkf_mt$.rebind(_prev_bind_1, thread);
                            rkf_assisted_reader.$rkf_ar_processing_mode$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                {
                    SubLObject formula = rkf_assisted_reader.ar_concept_cycl(concept);
                    SubLObject uia = user_interaction_agenda.ui_agenda(interaction);
                    SubLObject domain_mt = user_interaction_agenda.uia_domain_mt(uia);
                    SubLObject language_mt = user_interaction_agenda.uia_parsing_mt(uia);
                    SubLObject nl_sentence = rkf_assisted_reader.ar_state_source_sentences(state).first();
                    SubLObject nl_string = rkf_assisted_reader.ar_sentence_plaintext(nl_sentence);
                    record_accepted_cycl_in_pipeline(uia, formula, nl_string, domain_mt, language_mt);
                }
                {
                    SubLObject solutions = user_interaction_agenda.ui_state_lookup(interaction, $SOLUTIONS, UNPROVIDED);
                    SubLObject formula = rkf_assisted_reader.ar_concept_cycl(concept);
                    SubLObject finessed = rkf_text_processors.rkf_textproc_interpret_nlterms(formula, semantic_mt);
                    solutions = cons(finessed, solutions);
                    user_interaction_agenda.ui_state_update(interaction, $SOLUTIONS, solutions);
                }
            }
            return interaction;
        }
    }

    public static final SubLObject record_accepted_cycl_in_pipeline(SubLObject v_agenda, SubLObject cycl, SubLObject string, SubLObject domain_mt, SubLObject language_mt) {
        {
            SubLObject user_email = uia_tools_review_and_testing.uiat_kreview_get_my_email_address(v_agenda);
            SubLObject body = format(NIL, $str_alt112$String___A__CycL___A__Domain_mt__, new SubLObject[]{ string, cycl, domain_mt, language_mt, user_email });
            SubLObject subject = format(NIL, $str_alt113$Automated_UIA_Parse_for__S, string);
            return mail_utilities.mail_message(user_email, $str_alt114$daves_cyc_com, body, subject, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static final SubLObject uiat_sr_accepted_disambiguated_concept(SubLObject interaction, SubLObject v_term, SubLObject phrase, SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject state = user_interaction_agenda.ui_state_lookup(interaction, $AR_STATE, UNPROVIDED);
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject semantic_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
                SubLObject text_type = user_interaction_agenda.ui_state_lookup(interaction, $TEXT_TYPE, UNPROVIDED);
                SubLObject constraints = user_interaction_agenda.ui_state_lookup(interaction, $CONSTRAINT_TABLE, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = rkf_assisted_reader.$rkf_ar_additional_constraints$.currentBinding(thread);
                    SubLObject _prev_bind_1 = rkf_assisted_reader.$rkf_ar_processing_mode$.currentBinding(thread);
                    SubLObject _prev_bind_2 = control_vars.$rkf_mt$.currentBinding(thread);
                    SubLObject _prev_bind_3 = rkf_assisted_reader.$rkf_ar_parsing_mt$.currentBinding(thread);
                    SubLObject _prev_bind_4 = rkf_assisted_reader.$rkf_ar_semantics_mt$.currentBinding(thread);
                    SubLObject _prev_bind_5 = rkf_assisted_reader.$rkf_user$.currentBinding(thread);
                    try {
                        rkf_assisted_reader.$rkf_ar_additional_constraints$.bind(constraints, thread);
                        rkf_assisted_reader.$rkf_ar_processing_mode$.bind($QUESTION_PROCESSING, thread);
                        control_vars.$rkf_mt$.bind(user_interaction_agenda.uia_domain_interaction_mt(v_agenda), thread);
                        rkf_assisted_reader.$rkf_ar_parsing_mt$.bind(user_interaction_agenda.uia_parsing_interaction_mt(v_agenda), thread);
                        rkf_assisted_reader.$rkf_ar_semantics_mt$.bind(user_interaction_agenda.uia_domain_interaction_mt(v_agenda), thread);
                        rkf_assisted_reader.$rkf_user$.bind(user_interaction_agenda.uima_state_lookup(user_interaction_agenda.uia_meta_agenda(v_agenda), $USER, UNPROVIDED), thread);
                        {
                            SubLObject pcase_var = type;
                            if (pcase_var.eql($ASSUMED)) {
                                {
                                    SubLObject address = uia_mumbler.uia_mumble_create_address_for_uia(v_agenda);
                                    {
                                        SubLObject _prev_bind_0_13 = rkf_mumbler.$rkf_default_mumble_address$.currentBinding(thread);
                                        try {
                                            rkf_mumbler.$rkf_default_mumble_address$.bind(address, thread);
                                            rkf_assisted_reader.rkf_ar_act_handle_accept_assumed(state, phrase, v_term);
                                        } finally {
                                            rkf_mumbler.$rkf_default_mumble_address$.rebind(_prev_bind_0_13, thread);
                                        }
                                    }
                                }
                            } else
                                if (pcase_var.eql($AMBIGUOUS)) {
                                    {
                                        SubLObject concept = cb_uiat_convert_term_to_concept(v_term, cconcatenate(rkf_assisted_reader.ar_phrase_concepts(phrase), rkf_assisted_reader.ar_phrase_rejected_concepts(phrase)), semantic_mt);
                                        SubLObject address = uia_mumbler.uia_mumble_create_address_for_uia(v_agenda);
                                        {
                                            SubLObject _prev_bind_0_14 = rkf_mumbler.$rkf_default_mumble_address$.currentBinding(thread);
                                            try {
                                                rkf_mumbler.$rkf_default_mumble_address$.bind(address, thread);
                                                rkf_assisted_reader.rkf_ar_act_note_disambiguation(state, phrase, concept);
                                            } finally {
                                                rkf_mumbler.$rkf_default_mumble_address$.rebind(_prev_bind_0_14, thread);
                                            }
                                        }
                                    }
                                }

                        }
                    } finally {
                        rkf_assisted_reader.$rkf_user$.rebind(_prev_bind_5, thread);
                        rkf_assisted_reader.$rkf_ar_semantics_mt$.rebind(_prev_bind_4, thread);
                        rkf_assisted_reader.$rkf_ar_parsing_mt$.rebind(_prev_bind_3, thread);
                        control_vars.$rkf_mt$.rebind(_prev_bind_2, thread);
                        rkf_assisted_reader.$rkf_ar_processing_mode$.rebind(_prev_bind_1, thread);
                        rkf_assisted_reader.$rkf_ar_additional_constraints$.rebind(_prev_bind_0, thread);
                    }
                }
                return cb_uiat_sentence_reader_display(interaction);
            }
        }
    }

    public static final SubLObject uiat_sr_rejected_disambiguated_concept(SubLObject interaction, SubLObject concept, SubLObject phrase, SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject state = user_interaction_agenda.ui_state_lookup(interaction, $AR_STATE, UNPROVIDED);
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject text_type = user_interaction_agenda.ui_state_lookup(interaction, $TEXT_TYPE, UNPROVIDED);
                if (text_type == $QUESTION) {
                    {
                        SubLObject _prev_bind_0 = rkf_assisted_reader.$rkf_ar_processing_mode$.currentBinding(thread);
                        SubLObject _prev_bind_1 = control_vars.$rkf_mt$.currentBinding(thread);
                        SubLObject _prev_bind_2 = rkf_assisted_reader.$rkf_ar_parsing_mt$.currentBinding(thread);
                        SubLObject _prev_bind_3 = rkf_assisted_reader.$rkf_ar_semantics_mt$.currentBinding(thread);
                        SubLObject _prev_bind_4 = rkf_assisted_reader.$rkf_user$.currentBinding(thread);
                        try {
                            rkf_assisted_reader.$rkf_ar_processing_mode$.bind($QUESTION_PROCESSING, thread);
                            control_vars.$rkf_mt$.bind(user_interaction_agenda.uia_domain_interaction_mt(v_agenda), thread);
                            rkf_assisted_reader.$rkf_ar_parsing_mt$.bind(user_interaction_agenda.uia_parsing_interaction_mt(v_agenda), thread);
                            rkf_assisted_reader.$rkf_ar_semantics_mt$.bind(user_interaction_agenda.uia_domain_interaction_mt(v_agenda), thread);
                            rkf_assisted_reader.$rkf_user$.bind(user_interaction_agenda.uima_state_lookup(user_interaction_agenda.uia_meta_agenda(v_agenda), $USER, UNPROVIDED), thread);
                            {
                                SubLObject pcase_var = type;
                                if (pcase_var.eql($ASSUMED)) {
                                    {
                                        SubLObject address = uia_mumbler.uia_mumble_create_address_for_uia(v_agenda);
                                        {
                                            SubLObject _prev_bind_0_15 = rkf_mumbler.$rkf_default_mumble_address$.currentBinding(thread);
                                            try {
                                                rkf_mumbler.$rkf_default_mumble_address$.bind(address, thread);
                                                rkf_assisted_reader.rkf_ar_act_note_rejected_phrase(state, phrase);
                                            } finally {
                                                rkf_mumbler.$rkf_default_mumble_address$.rebind(_prev_bind_0_15, thread);
                                            }
                                        }
                                    }
                                } else
                                    if (pcase_var.eql($AMBIGUOUS)) {
                                        {
                                            SubLObject address = uia_mumbler.uia_mumble_create_address_for_uia(v_agenda);
                                            {
                                                SubLObject _prev_bind_0_16 = rkf_mumbler.$rkf_default_mumble_address$.currentBinding(thread);
                                                try {
                                                    rkf_mumbler.$rkf_default_mumble_address$.bind(address, thread);
                                                    rkf_assisted_reader.rkf_ar_act_note_rejected_phrase(state, phrase);
                                                } finally {
                                                    rkf_mumbler.$rkf_default_mumble_address$.rebind(_prev_bind_0_16, thread);
                                                }
                                            }
                                        }
                                    }

                            }
                        } finally {
                            rkf_assisted_reader.$rkf_user$.rebind(_prev_bind_4, thread);
                            rkf_assisted_reader.$rkf_ar_semantics_mt$.rebind(_prev_bind_3, thread);
                            rkf_assisted_reader.$rkf_ar_parsing_mt$.rebind(_prev_bind_2, thread);
                            control_vars.$rkf_mt$.rebind(_prev_bind_1, thread);
                            rkf_assisted_reader.$rkf_ar_processing_mode$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    {
                        SubLObject _prev_bind_0 = rkf_assisted_reader.$rkf_ar_processing_mode$.currentBinding(thread);
                        SubLObject _prev_bind_1 = control_vars.$rkf_mt$.currentBinding(thread);
                        SubLObject _prev_bind_2 = rkf_assisted_reader.$rkf_ar_parsing_mt$.currentBinding(thread);
                        SubLObject _prev_bind_3 = rkf_assisted_reader.$rkf_ar_semantics_mt$.currentBinding(thread);
                        SubLObject _prev_bind_4 = rkf_assisted_reader.$rkf_user$.currentBinding(thread);
                        try {
                            rkf_assisted_reader.$rkf_ar_processing_mode$.bind($TEXT_PROCESSING, thread);
                            control_vars.$rkf_mt$.bind(user_interaction_agenda.uia_domain_interaction_mt(v_agenda), thread);
                            rkf_assisted_reader.$rkf_ar_parsing_mt$.bind(user_interaction_agenda.uia_parsing_interaction_mt(v_agenda), thread);
                            rkf_assisted_reader.$rkf_ar_semantics_mt$.bind(user_interaction_agenda.uia_domain_interaction_mt(v_agenda), thread);
                            rkf_assisted_reader.$rkf_user$.bind(user_interaction_agenda.uima_state_lookup(user_interaction_agenda.uia_meta_agenda(v_agenda), $USER, UNPROVIDED), thread);
                            {
                                SubLObject pcase_var = type;
                                if (pcase_var.eql($ASSUMED)) {
                                    {
                                        SubLObject address = uia_mumbler.uia_mumble_create_address_for_uia(v_agenda);
                                        {
                                            SubLObject _prev_bind_0_17 = rkf_mumbler.$rkf_default_mumble_address$.currentBinding(thread);
                                            try {
                                                rkf_mumbler.$rkf_default_mumble_address$.bind(address, thread);
                                                rkf_assisted_reader.rkf_ar_act_note_rejected_phrase(state, phrase);
                                            } finally {
                                                rkf_mumbler.$rkf_default_mumble_address$.rebind(_prev_bind_0_17, thread);
                                            }
                                        }
                                    }
                                } else
                                    if (pcase_var.eql($AMBIGUOUS)) {
                                        {
                                            SubLObject address = uia_mumbler.uia_mumble_create_address_for_uia(v_agenda);
                                            {
                                                SubLObject _prev_bind_0_18 = rkf_mumbler.$rkf_default_mumble_address$.currentBinding(thread);
                                                try {
                                                    rkf_mumbler.$rkf_default_mumble_address$.bind(address, thread);
                                                    rkf_assisted_reader.rkf_ar_act_note_rejected_phrase(state, phrase);
                                                } finally {
                                                    rkf_mumbler.$rkf_default_mumble_address$.rebind(_prev_bind_0_18, thread);
                                                }
                                            }
                                        }
                                    }

                            }
                        } finally {
                            rkf_assisted_reader.$rkf_user$.rebind(_prev_bind_4, thread);
                            rkf_assisted_reader.$rkf_ar_semantics_mt$.rebind(_prev_bind_3, thread);
                            rkf_assisted_reader.$rkf_ar_parsing_mt$.rebind(_prev_bind_2, thread);
                            control_vars.$rkf_mt$.rebind(_prev_bind_1, thread);
                            rkf_assisted_reader.$rkf_ar_processing_mode$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return cb_uiat_sentence_reader_display(interaction);
            }
        }
    }

    public static final SubLObject uiat_sr_new_term_for_phrase(SubLObject interaction, SubLObject v_term, SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject state = user_interaction_agenda.ui_state_lookup(interaction, $AR_STATE, UNPROVIDED);
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                if ((v_term == $CANCEL) || (NIL == cycl_grammar.cycl_term_p(v_term))) {
                    uiat_sr_note_unknown_phrase_rejected(interaction, phrase);
                } else {
                    {
                        SubLObject _prev_bind_0 = control_vars.$rkf_mt$.currentBinding(thread);
                        SubLObject _prev_bind_1 = rkf_assisted_reader.$rkf_ar_parsing_mt$.currentBinding(thread);
                        SubLObject _prev_bind_2 = rkf_assisted_reader.$rkf_ar_semantics_mt$.currentBinding(thread);
                        SubLObject _prev_bind_3 = rkf_assisted_reader.$rkf_user$.currentBinding(thread);
                        try {
                            control_vars.$rkf_mt$.bind(user_interaction_agenda.uia_domain_interaction_mt(v_agenda), thread);
                            rkf_assisted_reader.$rkf_ar_parsing_mt$.bind(user_interaction_agenda.uia_parsing_interaction_mt(v_agenda), thread);
                            rkf_assisted_reader.$rkf_ar_semantics_mt$.bind(user_interaction_agenda.uia_domain_interaction_mt(v_agenda), thread);
                            rkf_assisted_reader.$rkf_user$.bind(user_interaction_agenda.uima_state_lookup(user_interaction_agenda.uia_meta_agenda(v_agenda), $USER, UNPROVIDED), thread);
                            {
                                SubLObject address = uia_mumbler.uia_mumble_create_address_for_uia(v_agenda);
                                {
                                    SubLObject _prev_bind_0_19 = rkf_mumbler.$rkf_default_mumble_address$.currentBinding(thread);
                                    try {
                                        rkf_mumbler.$rkf_default_mumble_address$.bind(address, thread);
                                        rkf_assisted_reader.rkf_ar_act_understand_unknown_phrase(state, phrase, v_term);
                                    } finally {
                                        rkf_mumbler.$rkf_default_mumble_address$.rebind(_prev_bind_0_19, thread);
                                    }
                                }
                            }
                        } finally {
                            rkf_assisted_reader.$rkf_user$.rebind(_prev_bind_3, thread);
                            rkf_assisted_reader.$rkf_ar_semantics_mt$.rebind(_prev_bind_2, thread);
                            rkf_assisted_reader.$rkf_ar_parsing_mt$.rebind(_prev_bind_1, thread);
                            control_vars.$rkf_mt$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return interaction;
        }
    }

    /**
     * Note on INTERACTION that PHRASE has been rejected (i.e. the user has declined
     * to help the system figure out what PHRASE means.
     */
    public static final SubLObject uiat_sr_note_unknown_phrase_rejected(SubLObject interaction, SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject rup = $REJECTED_UNKNOWN_PHRASES;
                SubLObject existing = user_interaction_agenda.ui_state_lookup(interaction, rup, UNPROVIDED);
                SubLObject v_new = cons(phrase, existing);
                user_interaction_agenda.ui_state_update(interaction, rup, v_new);
            }
            {
                SubLObject state = user_interaction_agenda.ui_state_lookup(interaction, $AR_STATE, UNPROVIDED);
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                {
                    SubLObject _prev_bind_0 = control_vars.$rkf_mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = rkf_assisted_reader.$rkf_ar_parsing_mt$.currentBinding(thread);
                    SubLObject _prev_bind_2 = rkf_assisted_reader.$rkf_ar_semantics_mt$.currentBinding(thread);
                    SubLObject _prev_bind_3 = rkf_assisted_reader.$rkf_user$.currentBinding(thread);
                    try {
                        control_vars.$rkf_mt$.bind(user_interaction_agenda.uia_domain_interaction_mt(v_agenda), thread);
                        rkf_assisted_reader.$rkf_ar_parsing_mt$.bind(user_interaction_agenda.uia_parsing_interaction_mt(v_agenda), thread);
                        rkf_assisted_reader.$rkf_ar_semantics_mt$.bind(user_interaction_agenda.uia_domain_interaction_mt(v_agenda), thread);
                        rkf_assisted_reader.$rkf_user$.bind(user_interaction_agenda.uima_state_lookup(user_interaction_agenda.uia_meta_agenda(v_agenda), $USER, UNPROVIDED), thread);
                        {
                            SubLObject address = uia_mumbler.uia_mumble_create_address_for_uia(v_agenda);
                            {
                                SubLObject _prev_bind_0_20 = rkf_mumbler.$rkf_default_mumble_address$.currentBinding(thread);
                                try {
                                    rkf_mumbler.$rkf_default_mumble_address$.bind(address, thread);
                                    rkf_assisted_reader.rkf_ar_act_reject_unknown_phrase(state, phrase);
                                } finally {
                                    rkf_mumbler.$rkf_default_mumble_address$.rebind(_prev_bind_0_20, thread);
                                }
                            }
                        }
                    } finally {
                        rkf_assisted_reader.$rkf_user$.rebind(_prev_bind_3, thread);
                        rkf_assisted_reader.$rkf_ar_semantics_mt$.rebind(_prev_bind_2, thread);
                        rkf_assisted_reader.$rkf_ar_parsing_mt$.rebind(_prev_bind_1, thread);
                        control_vars.$rkf_mt$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return interaction;
        }
    }

    /**
     *
     *
     * @return BOOLEANP; Has a phrase indistinguishable from PHRASE already been rejected?
     */
    public static final SubLObject uiat_sr_equivalent_unknown_phrase_already_rejectedP(SubLObject interaction, SubLObject phrase) {
        {
            SubLObject phrase_text = cb_uiat_text_from_phrase(phrase);
            SubLObject rejected_unknown_phrases = user_interaction_agenda.ui_state_lookup(interaction, $REJECTED_UNKNOWN_PHRASES, UNPROVIDED);
            return subl_promotions.memberP(phrase_text, rejected_unknown_phrases, symbol_function(EQUALP), CB_UIAT_TEXT_FROM_PHRASE);
        }
    }

    public static final SubLObject cb_uiat_sentence_reader_implied_indexical(SubLObject interaction, SubLObject state, SubLObject indexical_bundle) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject datum = indexical_bundle;
            SubLObject current = datum;
            SubLObject concept = NIL;
            SubLObject original = NIL;
            SubLObject new_terms = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt119);
            concept = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt119);
            original = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt119);
            new_terms = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject concept_21 = rkf_discourse_tracking.rkf_discourse_bundle_ar_concept(indexical_bundle);
                    SubLObject indexical_map = user_interaction_agenda.ui_state_lookup(interaction, $INDEXICAL_MAP, NIL);
                    SubLObject cycl = rkf_assisted_reader.ar_concept_cycl(concept_21);
                    SubLObject concept_phrase = (NIL != el_grammar.el_sentence_p(cycl)) ? ((SubLObject) (uia_trampolines.uia_sentence_phrase(v_agenda, cycl, UNPROVIDED, UNPROVIDED))) : uia_trampolines.uia_term_phrase(v_agenda, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject original_phrase = uia_trampolines.uia_term_phrase(v_agenda, original, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject child = uia_tools_basic.uia_act_new_disambiguate_phrase(v_agenda, $REQUIRED, original_phrase, new_terms, NIL, NIL, NIL, NIL, indexical_map, UNPROVIDED);
                    user_interaction_agenda.ui_state_update(child, $PREAMBLE_METHOD, CB_UIAT_RS_SHOW_DISCOURSE_OBJECT_SUMMARY);
                    user_interaction_agenda.ui_state_update(child, $kw44$DISCOURSE_INDEXICAL_, $TRUE);
                    user_interaction_agenda.ui_state_update(child, $DISCOURSE_BUNDLE, indexical_bundle);
                    user_interaction_agenda.ui_state_update(child, $CONCEPT_PHRASE, concept_phrase);
                    user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                }
                return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
            } else {
                cdestructuring_bind_error(datum, $list_alt119);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_rs_show_discourse_object_summary(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject generation = user_interaction_agenda.ui_state_lookup(interaction, $CONCEPT_PHRASE, UNPROVIDED);
                html_utilities.html_indent(TWO_INTEGER);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt123$_A, generation);
                html_utilities.html_newline(TWO_INTEGER);
            }
            return interaction;
        }
    }

    public static final SubLObject cb_uiat_sentence_reader_assumed_phrase(SubLObject interaction, SubLObject state, SubLObject phrase) {
        return cb_uiat_sr_handle_phrase(interaction, state, phrase, $ASSUMED, T);
    }

    public static final SubLObject cb_uiat_sentence_reader_ambiguous_phrase(SubLObject interaction, SubLObject state, SubLObject phrase) {
        return cb_uiat_sr_handle_phrase(interaction, state, phrase, $AMBIGUOUS, rkf_assisted_reader.ar_phrase_rejected_concepts(phrase));
    }

    /**
     * We've found an unknown phrase PHRASE in the assisted-reader state STATE of INTERACTION.
     * Do something appropriate.
     */
    public static final SubLObject cb_uiat_sentence_reader_unknown_phrase(SubLObject interaction, SubLObject state, SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                if (NIL != uiat_sr_equivalent_unknown_phrase_already_rejectedP(interaction, phrase)) {
                    uia_mumbler.uia_mumble(v_agenda, format(NIL, $str_alt124$Assuming_user_will_reject__S, phrase));
                    uiat_sr_note_unknown_phrase_rejected(interaction, phrase);
                } else {
                    thread.resetMultipleValues();
                    {
                        SubLObject isas = rkf_assisted_reader.ar_phrase_constraints_for_unknown(state, phrase, user_interaction_agenda.uia_domain_mt(v_agenda));
                        SubLObject v_genls = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject child = uia_tools_basic.uia_act_new_unknown_term(v_agenda, $REQUIRED, cb_uiat_text_from_phrase(phrase), NIL, $str_alt125$The_lack_of_interpretation_for_th, $list_alt126, isas, v_genls);
                            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                            user_interaction_agenda.ui_state_update(child, $AR_STATE, state);
                            user_interaction_agenda.ui_state_update(child, $PHRASE, phrase);
                        }
                    }
                }
                return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
            }
        }
    }

    public static final SubLObject cb_uiat_needs_distingiuishing_sentences(SubLObject terms) {
        {
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                if (v_term.isCons() && (NIL != fort_types_interface.predicateP(cycl_utilities.formula_arg0(v_term)))) {
                    return $INDISTINGUISHED;
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_convert_concepts_to_terms(SubLObject concepts, SubLObject semantic_mt) {
        {
            SubLObject terms = NIL;
            SubLObject cdolist_list_var = concepts;
            SubLObject concept = NIL;
            for (concept = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , concept = cdolist_list_var.first()) {
                {
                    SubLObject v_term = rkf_assisted_reader.ar_concept_cycl(concept);
                    terms = cons(v_term, terms);
                }
            }
            return terms;
        }
    }

    public static final SubLObject cb_uiat_convert_term_to_concept(SubLObject v_term, SubLObject concepts, SubLObject semantic_mt) {
        {
            SubLObject cdolist_list_var = concepts;
            SubLObject concept = NIL;
            for (concept = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , concept = cdolist_list_var.first()) {
                {
                    SubLObject ar_term = rkf_assisted_reader.ar_concept_cycl(concept);
                    if (ar_term.equalp(v_term)) {
                        return concept;
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_text_from_phrase(SubLObject phrase) {
        {
            SubLObject phrase_token_list = rkf_assisted_reader.ar_phrase_token_list(phrase);
            SubLObject text_pieces = NIL;
            SubLObject cdolist_list_var = phrase_token_list;
            SubLObject token = NIL;
            for (token = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , token = cdolist_list_var.first()) {
                text_pieces = cons(rkf_assisted_reader.ar_token_text(token), text_pieces);
                text_pieces = cons($str_alt127$_, text_pieces);
            }
            text_pieces = text_pieces.rest();
            return apply(CCONCATENATE, nreverse(text_pieces));
        }
    }

    public static final SubLObject cb_uiat_sr_handle_phrase(SubLObject interaction, SubLObject state, SubLObject phrase, SubLObject type, SubLObject rejectsP) {
        if (rejectsP == UNPROVIDED) {
            rejectsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject force = rkf_assisted_reader.ar_phrase_force(phrase);
                SubLObject text = cb_uiat_text_from_phrase(phrase);
                SubLObject semantic_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
                SubLObject indexicals = user_interaction_agenda.ui_state_lookup(interaction, $INDEXICAL_MAP, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject likely_concepts = rkf_assisted_reader.ar_phrase_divide_concepts(phrase, indexicals);
                    SubLObject unlikely_concepts = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject likely_terms = cb_uiat_convert_concepts_to_terms(likely_concepts, semantic_mt);
                        SubLObject unlikely_terms = cb_uiat_convert_concepts_to_terms(unlikely_concepts, semantic_mt);
                        SubLObject rejects = cconcatenate(unlikely_terms, NIL != rejectsP ? ((SubLObject) (cb_uiat_convert_concepts_to_terms(rkf_assisted_reader.ar_phrase_rejected_concepts(phrase), semantic_mt))) : NIL);
                        SubLObject indexical_map = user_interaction_agenda.ui_state_lookup(interaction, $INDEXICAL_MAP, UNPROVIDED);
                        SubLObject clarify_links = user_interaction_agenda.ui_state_lookup(interaction, $CLARIFY_LINKS, $TRUE);
                        SubLObject distinguishing_sentencesP = cb_uiat_needs_distingiuishing_sentences(cconcatenate(likely_terms, unlikely_terms));
                        SubLObject child = uia_tools_basic.uia_act_new_disambiguate_phrase(v_agenda, $REQUIRED, text, likely_terms, clarify_links, NIL, distinguishing_sentencesP, rejects, indexical_map, force);
                        cb_uiat_rs_package_up_sentence_context(interaction, child, state, phrase);
                        user_interaction_agenda.ui_state_update(child, $TYPE, type);
                        user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                        return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                    }
                }
            }
        }
    }

    public static final SubLObject cb_uiat_rs_package_up_sentence_context(SubLObject interaction, SubLObject child, SubLObject state, SubLObject phrase) {
        {
            SubLObject sentence = rkf_assisted_reader.ar_phrase_sentence(phrase);
            user_interaction_agenda.ui_state_update(child, $CONTEXT, cb_uia_debugging.new_ar_context(interaction, state));
            user_interaction_agenda.ui_state_update(child, $PHRASE, phrase);
            user_interaction_agenda.ui_state_update(child, $SENTENCE, sentence);
            user_interaction_agenda.ui_state_update(child, $PREAMBLE_METHOD, CB_UIAT_RS_SHOW_SENTENCE_SUMMARY);
        }
        return interaction;
    }

    public static final SubLObject cb_uiat_rs_show_sentence_summary(SubLObject interaction) {
        {
            SubLObject sentence = user_interaction_agenda.ui_state_lookup(interaction, $SENTENCE, UNPROVIDED);
            SubLObject ar_context = user_interaction_agenda.ui_state_lookup(interaction, $CONTEXT, UNPROVIDED);
            SubLObject state = cb_uia_debugging.ar_context_ar_state(ar_context);
            SubLObject phrase = user_interaction_agenda.ui_state_lookup(interaction, $PHRASE, UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
            cb_uiat_smart_show_sentence(state, sentence, phrase);
            html_utilities.html_newline(TWO_INTEGER);
            html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
        }
        return interaction;
    }

    // deflexical
    private static final SubLSymbol $cb_uiat_smart_context_color_map$ = makeSymbol("*CB-UIAT-SMART-CONTEXT-COLOR-MAP*");

    public static final SubLObject cb_uiat_smart_context_color(SubLObject v_context) {
        return second(assoc(v_context, $cb_uiat_smart_context_color_map$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject cb_uiat_smart_token_classify(SubLObject state, SubLObject token, SubLObject focal_phrase) {
        if (focal_phrase == UNPROVIDED) {
            focal_phrase = NIL;
        }
        {
            SubLObject phrases = rkf_assisted_reader.ar_token_phrases(token);
            SubLObject classification = $NONE;
            if ((NIL != rkf_assisted_reader.ar_phrase_p(focal_phrase)) && (NIL != subl_promotions.memberP(focal_phrase, phrases, UNPROVIDED, UNPROVIDED))) {
                classification = $PHRASE_IN_QUESTION;
            } else
                if (NIL != find($ACCEPTED, phrases, symbol_function(EQL), symbol_function(AR_PHRASE_STATUS), UNPROVIDED, UNPROVIDED)) {
                    classification = $ACCEPTED_PHRASES;
                } else
                    if (NIL != find($ASSUMED, phrases, symbol_function(EQL), symbol_function(AR_PHRASE_STATUS), UNPROVIDED, UNPROVIDED)) {
                        classification = $ASSUMED_PHRASES;
                    } else
                        if (NIL != find($AMBIGUOUS, phrases, symbol_function(EQL), symbol_function(AR_PHRASE_STATUS), UNPROVIDED, UNPROVIDED)) {
                            classification = $AMBIGUOUS_PHRASES;
                        } else
                            if (NIL != find($PENDING, phrases, symbol_function(EQL), symbol_function(AR_PHRASE_STATUS), UNPROVIDED, UNPROVIDED)) {
                                classification = $PENDING_PHRASES;
                            } else
                                if (NIL != find($IRRELEVANT, phrases, symbol_function(EQL), symbol_function(AR_PHRASE_STATUS), UNPROVIDED, UNPROVIDED)) {
                                    classification = $IRRELEVANT_PHRASES;
                                } else
                                    if (NIL != find($REJECTED, phrases, symbol_function(EQL), symbol_function(AR_PHRASE_STATUS), UNPROVIDED, UNPROVIDED)) {
                                        classification = $REJECTED_PHRASES;
                                    } else
                                        if (NIL != find($UNKNOWN, phrases, symbol_function(EQL), symbol_function(AR_PHRASE_STATUS), UNPROVIDED, UNPROVIDED)) {
                                            classification = $UNKNOWN_PHRASES;
                                        }







            return classification;
        }
    }

    public static final SubLObject cb_uiat_smart_token_color(SubLObject state, SubLObject token, SubLObject focal_phrase) {
        if (focal_phrase == UNPROVIDED) {
            focal_phrase = NIL;
        }
        {
            SubLObject classification = cb_uiat_smart_token_classify(state, token, focal_phrase);
            return cb_uiat_smart_context_color(classification);
        }
    }

    public static final SubLObject cb_uiat_smart_show_token(SubLObject state, SubLObject token) {
        {
            SubLObject text = rkf_assisted_reader.ar_token_text(token);
            html_utilities.html_princ(text);
        }
        return token;
    }

    public static final SubLObject cb_uiat_smart_show_sentence(SubLObject state, SubLObject sentence, SubLObject focal_phrase) {
        if (focal_phrase == UNPROVIDED) {
            focal_phrase = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject token_vector = rkf_assisted_reader.ar_sentence_token_vector(sentence);
                SubLObject last_color = NIL;
                SubLObject vector_var = token_vector;
                SubLObject backwardP_var = NIL;
                SubLObject length = length(vector_var);
                SubLObject v_iteration = NIL;
                for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    {
                        SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                        SubLObject token = aref(vector_var, element_num);
                        SubLObject color = cb_uiat_smart_token_color(state, token, focal_phrase);
                        if (!last_color.equal(color)) {
                            html_utilities.html_indent(UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_style_background_color(color);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                if (last_color.equal(color)) {
                                    html_utilities.html_indent(UNPROVIDED);
                                }
                                cb_uiat_smart_show_token(state, token);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                        last_color = color;
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_sr_confirm_assumption(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
                SubLObject current = datum;
                SubLObject interaction = NIL;
                SubLObject phrase_id = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt146);
                interaction = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt146);
                phrase_id = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                        SubLObject state = user_interaction_agenda.ui_state_lookup(interaction, $AR_STATE, NIL);
                        SubLObject phrase = rkf_assisted_reader.find_ar_phrase(state, phrase_id);
                        SubLObject text_type = user_interaction_agenda.ui_state_lookup(interaction, $TEXT_TYPE, UNPROVIDED);
                        SubLObject constraints = user_interaction_agenda.ui_state_lookup(interaction, $CONSTRAINT_TABLE, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = rkf_assisted_reader.$rkf_ar_additional_constraints$.currentBinding(thread);
                            SubLObject _prev_bind_1 = rkf_assisted_reader.$rkf_ar_processing_mode$.currentBinding(thread);
                            SubLObject _prev_bind_2 = control_vars.$rkf_mt$.currentBinding(thread);
                            SubLObject _prev_bind_3 = rkf_assisted_reader.$rkf_ar_parsing_mt$.currentBinding(thread);
                            SubLObject _prev_bind_4 = rkf_assisted_reader.$rkf_ar_semantics_mt$.currentBinding(thread);
                            SubLObject _prev_bind_5 = rkf_assisted_reader.$rkf_user$.currentBinding(thread);
                            try {
                                rkf_assisted_reader.$rkf_ar_additional_constraints$.bind(constraints, thread);
                                rkf_assisted_reader.$rkf_ar_processing_mode$.bind($QUESTION_PROCESSING, thread);
                                control_vars.$rkf_mt$.bind(user_interaction_agenda.uia_domain_interaction_mt(v_agenda), thread);
                                rkf_assisted_reader.$rkf_ar_parsing_mt$.bind(user_interaction_agenda.uia_parsing_interaction_mt(v_agenda), thread);
                                rkf_assisted_reader.$rkf_ar_semantics_mt$.bind(user_interaction_agenda.uia_domain_interaction_mt(v_agenda), thread);
                                rkf_assisted_reader.$rkf_user$.bind(user_interaction_agenda.uima_state_lookup(user_interaction_agenda.uia_meta_agenda(v_agenda), $USER, UNPROVIDED), thread);
                                {
                                    SubLObject address = uia_mumbler.uia_mumble_create_address_for_uia(v_agenda);
                                    {
                                        SubLObject _prev_bind_0_22 = rkf_mumbler.$rkf_default_mumble_address$.currentBinding(thread);
                                        try {
                                            rkf_mumbler.$rkf_default_mumble_address$.bind(address, thread);
                                            rkf_assisted_reader.rkf_ar_act_note_accept_assumed(state, phrase);
                                        } finally {
                                            rkf_mumbler.$rkf_default_mumble_address$.rebind(_prev_bind_0_22, thread);
                                        }
                                    }
                                }
                            } finally {
                                rkf_assisted_reader.$rkf_user$.rebind(_prev_bind_5, thread);
                                rkf_assisted_reader.$rkf_ar_semantics_mt$.rebind(_prev_bind_4, thread);
                                rkf_assisted_reader.$rkf_ar_parsing_mt$.rebind(_prev_bind_3, thread);
                                control_vars.$rkf_mt$.rebind(_prev_bind_2, thread);
                                rkf_assisted_reader.$rkf_ar_processing_mode$.rebind(_prev_bind_1, thread);
                                rkf_assisted_reader.$rkf_ar_additional_constraints$.rebind(_prev_bind_0, thread);
                            }
                        }
                        return cb_uiat_sentence_reader_display(interaction);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt146);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_cb_uiat_sr_confirm_assumption(SubLObject state, SubLObject phrase, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(state, AR_STATE_P);
            {
                SubLObject interaction = cb_uiat_sr_find_interaction_by_state(state);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction, rkf_assisted_reader.ar_phrase_id(phrase));
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt150$cb_uiat_sr_confirm_assumption, arglist);
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
                        cb_uia_display_primitives.cb_uia_princ_tool_linktext(NIL == linktext ? ((SubLObject) ($str_alt151$_Confirmed_)) : linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_sr_reject_assumption(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
                SubLObject current = datum;
                SubLObject interaction = NIL;
                SubLObject phrase_id = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt146);
                interaction = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt146);
                phrase_id = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                        SubLObject state = user_interaction_agenda.ui_state_lookup(interaction, $AR_STATE, NIL);
                        SubLObject phrase = rkf_assisted_reader.find_ar_phrase(state, phrase_id);
                        SubLObject text_type = user_interaction_agenda.ui_state_lookup(interaction, $TEXT_TYPE, UNPROVIDED);
                        SubLObject constraints = user_interaction_agenda.ui_state_lookup(interaction, $CONSTRAINT_TABLE, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = rkf_assisted_reader.$rkf_ar_additional_constraints$.currentBinding(thread);
                            SubLObject _prev_bind_1 = rkf_assisted_reader.$rkf_ar_processing_mode$.currentBinding(thread);
                            SubLObject _prev_bind_2 = control_vars.$rkf_mt$.currentBinding(thread);
                            SubLObject _prev_bind_3 = rkf_assisted_reader.$rkf_ar_parsing_mt$.currentBinding(thread);
                            SubLObject _prev_bind_4 = rkf_assisted_reader.$rkf_ar_semantics_mt$.currentBinding(thread);
                            SubLObject _prev_bind_5 = rkf_assisted_reader.$rkf_user$.currentBinding(thread);
                            try {
                                rkf_assisted_reader.$rkf_ar_additional_constraints$.bind(constraints, thread);
                                rkf_assisted_reader.$rkf_ar_processing_mode$.bind($QUESTION_PROCESSING, thread);
                                control_vars.$rkf_mt$.bind(user_interaction_agenda.uia_domain_interaction_mt(v_agenda), thread);
                                rkf_assisted_reader.$rkf_ar_parsing_mt$.bind(user_interaction_agenda.uia_parsing_interaction_mt(v_agenda), thread);
                                rkf_assisted_reader.$rkf_ar_semantics_mt$.bind(user_interaction_agenda.uia_domain_interaction_mt(v_agenda), thread);
                                rkf_assisted_reader.$rkf_user$.bind(user_interaction_agenda.uima_state_lookup(user_interaction_agenda.uia_meta_agenda(v_agenda), $USER, UNPROVIDED), thread);
                                {
                                    SubLObject address = uia_mumbler.uia_mumble_create_address_for_uia(v_agenda);
                                    {
                                        SubLObject _prev_bind_0_23 = rkf_mumbler.$rkf_default_mumble_address$.currentBinding(thread);
                                        try {
                                            rkf_mumbler.$rkf_default_mumble_address$.bind(address, thread);
                                            rkf_assisted_reader.rkf_ar_act_note_rejected_phrase(state, phrase);
                                        } finally {
                                            rkf_mumbler.$rkf_default_mumble_address$.rebind(_prev_bind_0_23, thread);
                                        }
                                    }
                                }
                            } finally {
                                rkf_assisted_reader.$rkf_user$.rebind(_prev_bind_5, thread);
                                rkf_assisted_reader.$rkf_ar_semantics_mt$.rebind(_prev_bind_4, thread);
                                rkf_assisted_reader.$rkf_ar_parsing_mt$.rebind(_prev_bind_3, thread);
                                control_vars.$rkf_mt$.rebind(_prev_bind_2, thread);
                                rkf_assisted_reader.$rkf_ar_processing_mode$.rebind(_prev_bind_1, thread);
                                rkf_assisted_reader.$rkf_ar_additional_constraints$.rebind(_prev_bind_0, thread);
                            }
                        }
                        return cb_uiat_sentence_reader_display(interaction);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt146);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_cb_uiat_sr_reject_assumption(SubLObject state, SubLObject phrase, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(state, AR_STATE_P);
            {
                SubLObject interaction = cb_uiat_sr_find_interaction_by_state(state);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction, rkf_assisted_reader.ar_phrase_id(phrase));
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt155$cb_uiat_sr_reject_assumption, arglist);
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
                        cb_uia_display_primitives.cb_uia_princ_tool_linktext(NIL == linktext ? ((SubLObject) ($str_alt156$_Rejected_)) : linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_sentence_reader_acceptor(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
                SubLObject current = datum;
                SubLObject interaction = NIL;
                SubLObject phrase_id = NIL;
                SubLObject concept_id = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt159);
                interaction = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt159);
                phrase_id = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt159);
                concept_id = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                        SubLObject state = user_interaction_agenda.ui_state_lookup(interaction, $AR_STATE, NIL);
                        SubLObject phrase = rkf_assisted_reader.find_ar_phrase(state, phrase_id);
                        SubLObject concept = rkf_assisted_reader.find_ar_concept(state, concept_id);
                        SubLObject text_type = user_interaction_agenda.ui_state_lookup(interaction, $TEXT_TYPE, UNPROVIDED);
                        SubLObject constraints = user_interaction_agenda.ui_state_lookup(interaction, $CONSTRAINT_TABLE, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = rkf_assisted_reader.$rkf_ar_additional_constraints$.currentBinding(thread);
                            SubLObject _prev_bind_1 = rkf_assisted_reader.$rkf_ar_processing_mode$.currentBinding(thread);
                            SubLObject _prev_bind_2 = control_vars.$rkf_mt$.currentBinding(thread);
                            SubLObject _prev_bind_3 = rkf_assisted_reader.$rkf_ar_parsing_mt$.currentBinding(thread);
                            SubLObject _prev_bind_4 = rkf_assisted_reader.$rkf_ar_semantics_mt$.currentBinding(thread);
                            SubLObject _prev_bind_5 = rkf_assisted_reader.$rkf_user$.currentBinding(thread);
                            try {
                                rkf_assisted_reader.$rkf_ar_additional_constraints$.bind(constraints, thread);
                                rkf_assisted_reader.$rkf_ar_processing_mode$.bind($QUESTION_PROCESSING, thread);
                                control_vars.$rkf_mt$.bind(user_interaction_agenda.uia_domain_interaction_mt(v_agenda), thread);
                                rkf_assisted_reader.$rkf_ar_parsing_mt$.bind(user_interaction_agenda.uia_parsing_interaction_mt(v_agenda), thread);
                                rkf_assisted_reader.$rkf_ar_semantics_mt$.bind(user_interaction_agenda.uia_domain_interaction_mt(v_agenda), thread);
                                rkf_assisted_reader.$rkf_user$.bind(user_interaction_agenda.uima_state_lookup(user_interaction_agenda.uia_meta_agenda(v_agenda), $USER, UNPROVIDED), thread);
                                {
                                    SubLObject address = uia_mumbler.uia_mumble_create_address_for_uia(v_agenda);
                                    {
                                        SubLObject _prev_bind_0_24 = rkf_mumbler.$rkf_default_mumble_address$.currentBinding(thread);
                                        try {
                                            rkf_mumbler.$rkf_default_mumble_address$.bind(address, thread);
                                            rkf_assisted_reader.rkf_ar_act_note_disambiguation(state, phrase, concept);
                                        } finally {
                                            rkf_mumbler.$rkf_default_mumble_address$.rebind(_prev_bind_0_24, thread);
                                        }
                                    }
                                }
                            } finally {
                                rkf_assisted_reader.$rkf_user$.rebind(_prev_bind_5, thread);
                                rkf_assisted_reader.$rkf_ar_semantics_mt$.rebind(_prev_bind_4, thread);
                                rkf_assisted_reader.$rkf_ar_parsing_mt$.rebind(_prev_bind_3, thread);
                                control_vars.$rkf_mt$.rebind(_prev_bind_2, thread);
                                rkf_assisted_reader.$rkf_ar_processing_mode$.rebind(_prev_bind_1, thread);
                                rkf_assisted_reader.$rkf_ar_additional_constraints$.rebind(_prev_bind_0, thread);
                            }
                        }
                        return cb_uiat_sentence_reader_display(interaction);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt159);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_cb_uiat_sentence_reader_acceptor(SubLObject state, SubLObject phrase, SubLObject concept, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(state, AR_STATE_P);
            {
                SubLObject interaction = cb_uiat_sr_find_interaction_by_state(state);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction, rkf_assisted_reader.ar_phrase_id(phrase), rkf_assisted_reader.ar_concept_id(concept));
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt161$cb_uiat_sentence_reader_acceptor, arglist);
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
                        cb_uia_display_primitives.cb_uia_princ_tool_linktext(NIL == linktext ? ((SubLObject) ($str_alt162$_Yes_)) : linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_sentence_reader_rejector(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
                SubLObject current = datum;
                SubLObject interaction = NIL;
                SubLObject phrase_id = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt146);
                interaction = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt146);
                phrase_id = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                        SubLObject state = user_interaction_agenda.ui_state_lookup(interaction, $AR_STATE, NIL);
                        SubLObject phrase = rkf_assisted_reader.find_ar_phrase(state, phrase_id);
                        {
                            SubLObject _prev_bind_0 = control_vars.$rkf_mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = rkf_assisted_reader.$rkf_ar_parsing_mt$.currentBinding(thread);
                            SubLObject _prev_bind_2 = rkf_assisted_reader.$rkf_ar_semantics_mt$.currentBinding(thread);
                            SubLObject _prev_bind_3 = rkf_assisted_reader.$rkf_user$.currentBinding(thread);
                            try {
                                control_vars.$rkf_mt$.bind(user_interaction_agenda.uia_domain_interaction_mt(v_agenda), thread);
                                rkf_assisted_reader.$rkf_ar_parsing_mt$.bind(user_interaction_agenda.uia_parsing_interaction_mt(v_agenda), thread);
                                rkf_assisted_reader.$rkf_ar_semantics_mt$.bind(user_interaction_agenda.uia_domain_interaction_mt(v_agenda), thread);
                                rkf_assisted_reader.$rkf_user$.bind(user_interaction_agenda.uima_state_lookup(user_interaction_agenda.uia_meta_agenda(v_agenda), $USER, UNPROVIDED), thread);
                                {
                                    SubLObject address = uia_mumbler.uia_mumble_create_address_for_uia(v_agenda);
                                    {
                                        SubLObject _prev_bind_0_25 = rkf_mumbler.$rkf_default_mumble_address$.currentBinding(thread);
                                        try {
                                            rkf_mumbler.$rkf_default_mumble_address$.bind(address, thread);
                                            rkf_assisted_reader.rkf_ar_act_note_rejected_phrase(state, phrase);
                                        } finally {
                                            rkf_mumbler.$rkf_default_mumble_address$.rebind(_prev_bind_0_25, thread);
                                        }
                                    }
                                }
                            } finally {
                                rkf_assisted_reader.$rkf_user$.rebind(_prev_bind_3, thread);
                                rkf_assisted_reader.$rkf_ar_semantics_mt$.rebind(_prev_bind_2, thread);
                                rkf_assisted_reader.$rkf_ar_parsing_mt$.rebind(_prev_bind_1, thread);
                                control_vars.$rkf_mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                        return cb_uiat_sentence_reader_display(interaction);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt146);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_cb_uiat_sentence_reader_rejector(SubLObject state, SubLObject phrase, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(state, AR_STATE_P);
            {
                SubLObject interaction = cb_uiat_sr_find_interaction_by_state(state);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction, rkf_assisted_reader.ar_phrase_id(phrase));
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt166$cb_uiat_sentence_reader_rejector, arglist);
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
                        cb_uia_display_primitives.cb_uia_princ_tool_linktext(NIL == linktext ? ((SubLObject) ($str_alt167$_Reject_All_)) : linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject uiat_question_asker_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject solutions = user_interaction_agenda.ui_result(child);
            user_interaction_agenda.ui_state_update(parent, $SOLUTIONS, solutions);
            user_interaction_agenda.ui_state_update(parent, $SOLUTION_COUNTER, ZERO_INTEGER);
        }
        return parent;
    }

    public static final SubLObject uiat_question_asker_hint(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject text = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt174);
            text = current.first();
            current = current.rest();
            if (NIL == current) {
                return format(NIL, $str_alt175$Ask___A_, text);
            } else {
                cdestructuring_bind_error(datum, $list_alt174);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_question_asker_display(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject solutions = user_interaction_agenda.ui_state_lookup(interaction, $SOLUTIONS, UNPROVIDED);
            if (NIL == solutions) {
                {
                    SubLObject text = user_interaction_agenda.ui_args(interaction).first();
                    SubLObject child = uia_act_new_question_reader(v_agenda, $REQUIRED, text);
                    user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                }
                return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
            }
            {
                SubLObject counter = user_interaction_agenda.ui_state_lookup(interaction, $SOLUTION_COUNTER, UNPROVIDED);
                SubLObject current = nth(counter, solutions);
                if (NIL == current) {
                    user_interaction_agenda.uia_act_complete(v_agenda, interaction, $DONE);
                    return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                }
                user_interaction_agenda.ui_state_update(interaction, $CURRENT, current);
                return cb_uiat_question_asker_display_guts(interaction);
            }
        }
    }

    public static final SubLObject cb_uiat_question_asker_display_guts(SubLObject interaction) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject current = user_interaction_agenda.ui_state_lookup(interaction, $CURRENT, UNPROVIDED);
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
            cb_uiat_question_asker_identify_query(current);
            html_utilities.html_flush();
            {
                SubLObject results = user_interaction_agenda.ui_state_lookup(interaction, $QUERY_RESULT, UNPROVIDED);
                if (NIL == results) {
                    results = rkf_query_utilities.rkf_query(current, user_interaction_agenda.uia_domain_interaction_mt(v_agenda), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    user_interaction_agenda.ui_state_update(interaction, $QUERY_RESULT, results);
                }
                cb_uiat_question_asker_generate_answer_page(interaction, results);
            }
            html_utilities.html_newline(TWO_INTEGER);
            cb_utilities.cb_link($UIAT_QASKER_CONTINUE, interaction, $str_alt98$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            return interaction;
        }
    }

    public static final SubLObject cb_uiat_question_asker_identify_query(SubLObject current) {
        html_utilities.html_newline(UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
        cb_uia_display_primitives.cb_uia_show_question(current, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
        html_utilities.html_newline(UNPROVIDED);
        return current;
    }

    public static final SubLObject cb_uiat_question_asker_generate_answer_page(SubLObject interaction, SubLObject results) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == results) {
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ($str_alt180$No_results_);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                return interaction;
            }
            {
                SubLObject top_row = results.first().first();
                if (top_row.first().first() == T) {
                    html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ($str_alt181$The_answer_to_your_question_is_);
                    cb_utilities.cb_link($UIAT_QASKER_JUSTIFY_QUERY, interaction, ZERO_INTEGER, $$$yes, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                    return interaction;
                }
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
                        cb_uiat_draw_table_header(top_row);
                        {
                            SubLObject list_var = NIL;
                            SubLObject result = NIL;
                            SubLObject counter = NIL;
                            for (list_var = results, result = list_var.first(), counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , result = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                                {
                                    SubLObject datum = result;
                                    SubLObject current = datum;
                                    SubLObject v_bindings = NIL;
                                    SubLObject supports = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt185);
                                    v_bindings = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt185);
                                    supports = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
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
                                                        html_utilities.html_indent(ONE_INTEGER);
                                                        cb_utilities.cb_link($UIAT_QASKER_JUSTIFY_QUERY, interaction, counter, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_indent(ONE_INTEGER);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_27, thread);
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
                                                            SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                cb_uia_display_primitives.cb_uia_show_term(tuple.rest(), UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    }
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt185);
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
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_draw_table_header(SubLObject v_bindings) {
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
                            html_utilities.html_indent(TWO_INTEGER);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    {
                        SubLObject cdolist_list_var = v_bindings;
                        SubLObject binding = NIL;
                        for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align($CENTER));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                                    html_utilities.html_princ(bindings.variable_binding_variable(binding));
                                    html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_30, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
    }

    public static final SubLObject cb_link_uiat_qasker_justify_query(SubLObject interaction, SubLObject result_id, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = format(NIL, $str_alt186$_D, result_id);
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(user_interaction_agenda.ui_id(interaction), result_id);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt188$cb_uiat_qasker_justify_query, arglist);
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

    public static final SubLObject cb_uiat_qasker_justify_query(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
                SubLObject current = datum;
                SubLObject ui_id = NIL;
                SubLObject result_id = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt190);
                ui_id = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt190);
                result_id = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject interaction = user_interaction_agenda.uia_find_by_id(cb_user_interaction_agenda.cb_current_uia(), ui_id);
                        SubLObject current_31 = user_interaction_agenda.ui_state_lookup(interaction, $CURRENT, UNPROVIDED);
                        SubLObject results = user_interaction_agenda.ui_state_lookup(interaction, $QUERY_RESULT, UNPROVIDED);
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
                            SubLObject result = nth(result_id, results);
                            if (NIL == result) {
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt191$Stale_query_information_);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            } else {
                                cb_uiat_qasker_display_justification(current_31, result);
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
                            html_utilities.html_markup($str_alt192$90_);
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
                                    SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                            SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                cb_utilities.cb_link($UIAT_QASKER_CONTINUE, interaction, $str_alt98$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
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
                                            SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                cb_utilities.cb_link($UIAT_QASKER_DISPLAY_QUERY, interaction, $str_alt196$_Back_to_Query_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
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
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        return interaction;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt190);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_uiat_qasker_display_query(SubLObject interaction, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $$$Show_Results;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(user_interaction_agenda.ui_id(interaction));
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt199$cb_uiat_qasker_display_query, arglist);
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

    public static final SubLObject cb_link_uiat_qasker_continue(SubLObject interaction, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $$$Continue;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(user_interaction_agenda.ui_id(interaction));
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt202$cb_uiat_qasker_continue, arglist);
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

    public static final SubLObject cb_uiat_qasker_continue(SubLObject args) {
        {
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject ui_id = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt204);
            ui_id = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject interaction = user_interaction_agenda.uia_find_by_id(cb_user_interaction_agenda.cb_current_uia(), ui_id);
                    SubLObject counter = user_interaction_agenda.ui_state_lookup(interaction, $SOLUTION_COUNTER, UNPROVIDED);
                    user_interaction_agenda.ui_state_update(interaction, $QUERY_RESULT, NIL);
                    counter = add(counter, ONE_INTEGER);
                    user_interaction_agenda.ui_state_update(interaction, $SOLUTION_COUNTER, counter);
                    return cb_uiat_question_asker_display(interaction);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt204);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_qasker_display_query(SubLObject args) {
        {
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject ui_id = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt204);
            ui_id = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject interaction = user_interaction_agenda.uia_find_by_id(cb_user_interaction_agenda.cb_current_uia(), ui_id);
                    return cb_uiat_question_asker_display(interaction);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt204);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_qasker_display_justification(SubLObject current, SubLObject result) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_bindings = result.first();
                SubLObject supports = second(result);
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
                            SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt207$Query__);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
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
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        cb_uia_display_primitives.cb_uia_show_question(current, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_35, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject list_var = NIL;
                            SubLObject binding = NIL;
                            SubLObject counter = NIL;
                            for (list_var = v_bindings, binding = list_var.first(), counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , binding = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_38 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_39 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                if (counter.isZero()) {
                                                    html_utilities.html_princ($str_alt208$Bindings__);
                                                } else {
                                                    html_utilities.html_indent(TWO_INTEGER);
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                                                html_utilities.html_princ(binding.first());
                                                html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
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
                                                cb_uia_display_primitives.cb_uia_show_term(binding.rest(), UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_41, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
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
                                    SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                            SubLObject _prev_bind_0_43 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                if (counter.isZero()) {
                                                    html_utilities.html_princ($str_alt210$Justifications__);
                                                } else {
                                                    html_utilities.html_indent(TWO_INTEGER);
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_43, thread);
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
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_44 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                cb_uia_display_primitives.cb_uia_show_support(support, UNPROVIDED, UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
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
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject declare_cb_uiat_smart_file() {
        declareFunction("uia_act_new_term_reader", "UIA-ACT-NEW-TERM-READER", 3, 3, false);
        declareFunction("uiat_term_reader_child_completed", "UIAT-TERM-READER-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_term_reader_record_solution", "UIAT-TERM-READER-RECORD-SOLUTION", 2, 0, false);
        declareFunction("uiat_term_reader_hint", "UIAT-TERM-READER-HINT", 1, 0, false);
        declareFunction("uiat_term_reader_generate_request", "UIAT-TERM-READER-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_term_reader_handle_reply", "UIAT-TERM-READER-HANDLE-REPLY", 1, 0, false);
        declareFunction("cb_uiat_term_reader_display", "CB-UIAT-TERM-READER-DISPLAY", 1, 0, false);
        declareFunction("uiat_term_reader_implementation", "UIAT-TERM-READER-IMPLEMENTATION", 1, 0, false);
        declareFunction("uiat_term_reader_constructor", "UIAT-TERM-READER-CONSTRUCTOR", 2, 0, false);
        declareFunction("uia_act_new_read_sentence", "UIA-ACT-NEW-READ-SENTENCE", 3, 0, false);
        declareFunction("uia_act_new_sentence_reader", "UIA-ACT-NEW-SENTENCE-READER", 3, 2, false);
        declareFunction("uia_act_new_question_reader", "UIA-ACT-NEW-QUESTION-READER", 3, 0, false);
        declareFunction("uia_act_new_constraint_reader", "UIA-ACT-NEW-CONSTRAINT-READER", 5, 0, false);
        declareFunction("uiat_sr_mark_as_constraint_reader", "UIAT-SR-MARK-AS-CONSTRAINT-READER", 1, 0, false);
        declareFunction("uiat_sr_is_constraint_readerP", "UIAT-SR-IS-CONSTRAINT-READER?", 1, 0, false);
        declareFunction("uiat_sr_is_sentence_readerP", "UIAT-SR-IS-SENTENCE-READER?", 1, 0, false);
        declareFunction("uiat_sentence_reader_child_completed", "UIAT-SENTENCE-READER-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_sentence_reader_rejected_method", "UIAT-SENTENCE-READER-REJECTED-METHOD", 2, 0, false);
        declareMacro("with_rkf_tool_context", "WITH-RKF-TOOL-CONTEXT");
        declareMacro("with_rkf_sentence_context", "WITH-RKF-SENTENCE-CONTEXT");
        declareMacro("with_rkf_question_context", "WITH-RKF-QUESTION-CONTEXT");
        declareMacro("with_constraint_rkf_context", "WITH-CONSTRAINT-RKF-CONTEXT");
        declareFunction("uiat_sentence_reader_hint", "UIAT-SENTENCE-READER-HINT", 1, 0, false);
        declareFunction("cb_uiat_sr_filter_candidates", "CB-UIAT-SR-FILTER-CANDIDATES", 1, 0, false);
        declareFunction("cb_uiat_sentence_reader_display", "CB-UIAT-SENTENCE-READER-DISPLAY", 1, 0, false);
        declareFunction("cb_uiat_sr_associate_interaction_and_state", "CB-UIAT-SR-ASSOCIATE-INTERACTION-AND-STATE", 2, 0, false);
        declareFunction("cb_uiat_sr_find_interaction_by_state", "CB-UIAT-SR-FIND-INTERACTION-BY-STATE", 1, 0, false);
        declareFunction("cb_uiat_sentence_reader_constructor", "CB-UIAT-SENTENCE-READER-CONSTRUCTOR", 2, 1, false);
        declareFunction("uiat_sentence_reader_construct_ar_state", "UIAT-SENTENCE-READER-CONSTRUCT-AR-STATE", 5, 0, false);
        declareFunction("parsing_indexical_map_from_paraphrase_map", "PARSING-INDEXICAL-MAP-FROM-PARAPHRASE-MAP", 1, 0, false);
        declareFunction("cb_uiat_sentence_reader_no_parse", "CB-UIAT-SENTENCE-READER-NO-PARSE", 3, 0, false);
        declareFunction("cb_uiat_sentence_reader_stuck", "CB-UIAT-SENTENCE-READER-STUCK", 4, 0, false);
        declareFunction("cb_uiat_sentence_reader_complete", "CB-UIAT-SENTENCE-READER-COMPLETE", 2, 0, false);
        declareFunction("cb_uiat_resolve_potential_narts", "CB-UIAT-RESOLVE-POTENTIAL-NARTS", 2, 0, false);
        declareFunction("cb_uiat_sentence_reader_candidate_cycls", "CB-UIAT-SENTENCE-READER-CANDIDATE-CYCLS", 3, 0, false);
        declareFunction("uiat_sr_potentially_preprocess_negation", "UIAT-SR-POTENTIALLY-PREPROCESS-NEGATION", 1, 0, false);
        declareFunction("cb_uiat_orthographically_equivalent_sentences", "CB-UIAT-ORTHOGRAPHICALLY-EQUIVALENT-SENTENCES", 3, 0, false);
        declareFunction("cb_uiat_sr_render_candidate_cycl", "CB-UIAT-SR-RENDER-CANDIDATE-CYCL", 1, 0, false);
        declareFunction("uiat_sr_rejected_assertion", "UIAT-SR-REJECTED-ASSERTION", 2, 0, false);
        declareFunction("uiat_sr_accepted_assertion", "UIAT-SR-ACCEPTED-ASSERTION", 2, 0, false);
        declareFunction("record_accepted_cycl_in_pipeline", "RECORD-ACCEPTED-CYCL-IN-PIPELINE", 5, 0, false);
        declareFunction("uiat_sr_accepted_disambiguated_concept", "UIAT-SR-ACCEPTED-DISAMBIGUATED-CONCEPT", 4, 0, false);
        declareFunction("uiat_sr_rejected_disambiguated_concept", "UIAT-SR-REJECTED-DISAMBIGUATED-CONCEPT", 4, 0, false);
        declareFunction("uiat_sr_new_term_for_phrase", "UIAT-SR-NEW-TERM-FOR-PHRASE", 3, 0, false);
        declareFunction("uiat_sr_note_unknown_phrase_rejected", "UIAT-SR-NOTE-UNKNOWN-PHRASE-REJECTED", 2, 0, false);
        declareFunction("uiat_sr_equivalent_unknown_phrase_already_rejectedP", "UIAT-SR-EQUIVALENT-UNKNOWN-PHRASE-ALREADY-REJECTED?", 2, 0, false);
        declareFunction("cb_uiat_sentence_reader_implied_indexical", "CB-UIAT-SENTENCE-READER-IMPLIED-INDEXICAL", 3, 0, false);
        declareFunction("cb_uiat_rs_show_discourse_object_summary", "CB-UIAT-RS-SHOW-DISCOURSE-OBJECT-SUMMARY", 1, 0, false);
        declareFunction("cb_uiat_sentence_reader_assumed_phrase", "CB-UIAT-SENTENCE-READER-ASSUMED-PHRASE", 3, 0, false);
        declareFunction("cb_uiat_sentence_reader_ambiguous_phrase", "CB-UIAT-SENTENCE-READER-AMBIGUOUS-PHRASE", 3, 0, false);
        declareFunction("cb_uiat_sentence_reader_unknown_phrase", "CB-UIAT-SENTENCE-READER-UNKNOWN-PHRASE", 3, 0, false);
        declareFunction("cb_uiat_needs_distingiuishing_sentences", "CB-UIAT-NEEDS-DISTINGIUISHING-SENTENCES", 1, 0, false);
        declareFunction("cb_uiat_convert_concepts_to_terms", "CB-UIAT-CONVERT-CONCEPTS-TO-TERMS", 2, 0, false);
        declareFunction("cb_uiat_convert_term_to_concept", "CB-UIAT-CONVERT-TERM-TO-CONCEPT", 3, 0, false);
        declareFunction("cb_uiat_text_from_phrase", "CB-UIAT-TEXT-FROM-PHRASE", 1, 0, false);
        declareFunction("cb_uiat_sr_handle_phrase", "CB-UIAT-SR-HANDLE-PHRASE", 4, 1, false);
        declareFunction("cb_uiat_rs_package_up_sentence_context", "CB-UIAT-RS-PACKAGE-UP-SENTENCE-CONTEXT", 4, 0, false);
        declareFunction("cb_uiat_rs_show_sentence_summary", "CB-UIAT-RS-SHOW-SENTENCE-SUMMARY", 1, 0, false);
        declareFunction("cb_uiat_smart_context_color", "CB-UIAT-SMART-CONTEXT-COLOR", 1, 0, false);
        declareFunction("cb_uiat_smart_token_classify", "CB-UIAT-SMART-TOKEN-CLASSIFY", 2, 1, false);
        declareFunction("cb_uiat_smart_token_color", "CB-UIAT-SMART-TOKEN-COLOR", 2, 1, false);
        declareFunction("cb_uiat_smart_show_token", "CB-UIAT-SMART-SHOW-TOKEN", 2, 0, false);
        declareFunction("cb_uiat_smart_show_sentence", "CB-UIAT-SMART-SHOW-SENTENCE", 2, 1, false);
        declareFunction("cb_uiat_sr_confirm_assumption", "CB-UIAT-SR-CONFIRM-ASSUMPTION", 1, 0, false);
        declareFunction("cb_link_cb_uiat_sr_confirm_assumption", "CB-LINK-CB-UIAT-SR-CONFIRM-ASSUMPTION", 2, 1, false);
        declareFunction("cb_uiat_sr_reject_assumption", "CB-UIAT-SR-REJECT-ASSUMPTION", 1, 0, false);
        declareFunction("cb_link_cb_uiat_sr_reject_assumption", "CB-LINK-CB-UIAT-SR-REJECT-ASSUMPTION", 2, 1, false);
        declareFunction("cb_uiat_sentence_reader_acceptor", "CB-UIAT-SENTENCE-READER-ACCEPTOR", 1, 0, false);
        declareFunction("cb_link_cb_uiat_sentence_reader_acceptor", "CB-LINK-CB-UIAT-SENTENCE-READER-ACCEPTOR", 3, 1, false);
        declareFunction("cb_uiat_sentence_reader_rejector", "CB-UIAT-SENTENCE-READER-REJECTOR", 1, 0, false);
        declareFunction("cb_link_cb_uiat_sentence_reader_rejector", "CB-LINK-CB-UIAT-SENTENCE-READER-REJECTOR", 2, 1, false);
        declareFunction("uiat_question_asker_child_completed", "UIAT-QUESTION-ASKER-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_question_asker_hint", "UIAT-QUESTION-ASKER-HINT", 1, 0, false);
        declareFunction("cb_uiat_question_asker_display", "CB-UIAT-QUESTION-ASKER-DISPLAY", 1, 0, false);
        declareFunction("cb_uiat_question_asker_display_guts", "CB-UIAT-QUESTION-ASKER-DISPLAY-GUTS", 1, 0, false);
        declareFunction("cb_uiat_question_asker_identify_query", "CB-UIAT-QUESTION-ASKER-IDENTIFY-QUERY", 1, 0, false);
        declareFunction("cb_uiat_question_asker_generate_answer_page", "CB-UIAT-QUESTION-ASKER-GENERATE-ANSWER-PAGE", 2, 0, false);
        declareFunction("cb_uiat_draw_table_header", "CB-UIAT-DRAW-TABLE-HEADER", 1, 0, false);
        declareFunction("cb_link_uiat_qasker_justify_query", "CB-LINK-UIAT-QASKER-JUSTIFY-QUERY", 2, 1, false);
        declareFunction("cb_uiat_qasker_justify_query", "CB-UIAT-QASKER-JUSTIFY-QUERY", 1, 0, false);
        declareFunction("cb_link_uiat_qasker_display_query", "CB-LINK-UIAT-QASKER-DISPLAY-QUERY", 2, 0, false);
        declareFunction("cb_link_uiat_qasker_continue", "CB-LINK-UIAT-QASKER-CONTINUE", 2, 0, false);
        declareFunction("cb_uiat_qasker_continue", "CB-UIAT-QASKER-CONTINUE", 1, 0, false);
        declareFunction("cb_uiat_qasker_display_query", "CB-UIAT-QASKER-DISPLAY-QUERY", 1, 0, false);
        declareFunction("cb_uiat_qasker_display_justification", "CB-UIAT-QASKER-DISPLAY-JUSTIFICATION", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_uiat_smart_file() {
        deflexical("*CB-UIAT-SHOW-CYCL*", NIL != boundp($cb_uiat_show_cycl$) ? ((SubLObject) ($cb_uiat_show_cycl$.getGlobalValue())) : NIL);
        deflexical("*CB-UIAT-INTERACTION-TO-AR-STATE-MAP*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        deflexical("*CB-UIAT-LAST-AR-STATE*", NIL);
        deflexical("*CB-UIAT-SMART-CONTEXT-COLOR-MAP*", $list_alt131);
        return NIL;
    }

    public static final SubLObject setup_cb_uiat_smart_file() {
                uia_tool_declaration.declare_uia_tool($TERM_READER, $list_alt4);
        uia_tool_declaration.declare_uia_tool($SENTENCE_READER, $list_alt33);
        cb_uia_tool_declaration.declare_cb_uia_tool($SENTENCE_READER, $list_alt56);
        subl_macro_promotions.declare_defglobal($cb_uiat_show_cycl$);
        html_macros.note_html_handler_function(CB_UIAT_SR_CONFIRM_ASSUMPTION);
        cb_utilities.setup_cb_link_method($CB_UIAT_SR_CONFIRM_ASSUMPTION, CB_LINK_CB_UIAT_SR_CONFIRM_ASSUMPTION, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_SR_REJECT_ASSUMPTION);
        cb_utilities.setup_cb_link_method($CB_UIAT_SR_REJECT_ASSUMPTION, CB_LINK_CB_UIAT_SR_REJECT_ASSUMPTION, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_SENTENCE_READER_ACCEPTOR);
        cb_utilities.setup_cb_link_method($CB_UIAT_SENTENCE_READER_ACCEPTOR, CB_LINK_CB_UIAT_SENTENCE_READER_ACCEPTOR, FOUR_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_SENTENCE_READER_REJECTOR);
        cb_utilities.setup_cb_link_method($CB_UIAT_SENTENCE_READER_REJECTOR, CB_LINK_CB_UIAT_SENTENCE_READER_REJECTOR, THREE_INTEGER);
        uia_tool_declaration.declare_uia_tool($QUESTION_ASKER, $list_alt171);
        cb_uia_tool_declaration.declare_cb_uia_tool($QUESTION_ASKER, $list_alt173);
        cb_utilities.setup_cb_link_method($UIAT_QASKER_JUSTIFY_QUERY, CB_LINK_UIAT_QASKER_JUSTIFY_QUERY, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_QASKER_JUSTIFY_QUERY);
        cb_utilities.setup_cb_link_method($UIAT_QASKER_DISPLAY_QUERY, CB_LINK_UIAT_QASKER_DISPLAY_QUERY, TWO_INTEGER);
        cb_utilities.setup_cb_link_method($UIAT_QASKER_CONTINUE, CB_LINK_UIAT_QASKER_CONTINUE, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_QASKER_CONTINUE);
        html_macros.note_html_handler_function(CB_UIAT_QASKER_DISPLAY_QUERY);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol $TERM_READER = makeKeyword("TERM-READER");





    private static final SubLSymbol $EXISTANCE_CHECK = makeKeyword("EXISTANCE-CHECK");

    static private final SubLList $list_alt4 = list(new SubLObject[]{ $NAME, makeString("Term Reader"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-TERM-READER-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-TERM-READER-GENERATE-REQUEST"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-TERM-READER-HANDLE-REPLY"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-TERM-READER-CHILD-COMPLETED"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycTermReaderTool")) });

    private static final SubLSymbol $DISPLAY_STYLE = makeKeyword("DISPLAY-STYLE");

    private static final SubLSymbol $CALL_STYLE = makeKeyword("CALL-STYLE");

    static private final SubLList $list_alt7 = list(makeSymbol("TERM"));

    static private final SubLString $str_alt8$Read___A_ = makeString("Read \"~A\"");

    private static final SubLSymbol $GENERATE_REQUEST = makeKeyword("GENERATE-REQUEST");

    static private final SubLList $list_alt10 = listS(makeUninternedSymbol("OPERATOR"), makeSymbol("ACTION-TYPE"), makeUninternedSymbol("TEMP-PLIST"));





    private static final SubLSymbol $INTERPRETATIONS = makeKeyword("INTERPRETATIONS");

    private static final SubLSymbol $REJECTS = makeKeyword("REJECTS");

    private static final SubLSymbol $CLARIFY_LINKS = makeKeyword("CLARIFY-LINKS");





    static private final SubLString $str_alt18$Sorry__but_I_know_of_no_interpret = makeString("Sorry, but I know of no interpretations for ~S.~%");

    private static final SubLSymbol $RETURN_STRING = makeKeyword("RETURN-STRING");







    static private final SubLList $list_alt23 = list(makeSymbol("SPAN"), makeSymbol("TERMS"));

    static private final SubLString $str_alt24$Calling_legacy_interface_read_sen = makeString("Calling legacy interface read-sentence; modify to use sentence-reader.");

    private static final SubLSymbol $MY_RESULT_WILL_BE = makeKeyword("MY-RESULT-WILL-BE");



    private static final SubLSymbol $SENTENCE_READER = makeKeyword("SENTENCE-READER");





    private static final SubLSymbol $RESOLVE_NARTS = makeKeyword("RESOLVE-NARTS");

    private static final SubLSymbol $MODUS_VIVENDI = makeKeyword("MODUS-VIVENDI");

    private static final SubLSymbol $CONSTRAINT_READER = makeKeyword("CONSTRAINT-READER");

    static private final SubLList $list_alt33 = list(new SubLObject[]{ $NAME, makeString("Sentence Reader"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-SENTENCE-READER-HINT"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-SENTENCE-READER-CHILD-COMPLETED"), makeKeyword("CHILD-REJECTED-METHOD"), makeSymbol("UIAT-SENTENCE-READER-REJECTED-METHOD"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycSentenceReader")) });

    private static final SubLSymbol $YES_NO_QUESTION = makeKeyword("YES-NO-QUESTION");







    static private final SubLString $str_alt38$User_disagreed_with_an_interpreta = makeString("User disagreed with an interpretation: ~A");

    static private final SubLString $str_alt39$This_is_an_auto_mailed_message___ = makeString("This is an auto-mailed message.~%(file=~A)~%(fn=~A)~%~%assertion=~A~%force=~A~%~%");

    static private final SubLString $str_alt40$cb_uiat_smart = makeString("cb-uiat-smart");

    static private final SubLString $str_alt41$uiat_sr_rejected_assertion = makeString("uiat-sr-rejected-assertion");

    private static final SubLSymbol $DISAMBIGUATE_PHRASE = makeKeyword("DISAMBIGUATE-PHRASE");



    public static final SubLSymbol $kw44$DISCOURSE_INDEXICAL_ = makeKeyword("DISCOURSE-INDEXICAL?");

    private static final SubLSymbol $DISCOURSE_BUNDLE = makeKeyword("DISCOURSE-BUNDLE");

    private static final SubLSymbol $AR_STATE = makeKeyword("AR-STATE");









    private static final SubLSymbol $CONCEPT_CREATOR = makeKeyword("CONCEPT-CREATOR");

    private static final SubLSymbol $UNKNOWN_TERM = makeKeyword("UNKNOWN-TERM");

    static private final SubLString $str_alt53$Unexpected_child_of_type__S_recei = makeString("Unexpected child of type ~S received.");



    private static final SubLSymbol $AR_STATE_ID = makeKeyword("AR-STATE-ID");

    static private final SubLList $list_alt56 = list(makeKeyword("DISPLAY-METHOD"), makeSymbol("CB-UIAT-SENTENCE-READER-DISPLAY"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycSentenceReader")));

    public static final SubLSymbol $cb_uiat_show_cycl$ = makeSymbol("*CB-UIAT-SHOW-CYCL*");

    static private final SubLList $list_alt58 = list(list(makeSymbol("AGENDA")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $rkf_mt$ = makeSymbol("*RKF-MT*");

    private static final SubLSymbol UIA_DOMAIN_INTERACTION_MT = makeSymbol("UIA-DOMAIN-INTERACTION-MT");

    public static final SubLSymbol $rkf_ar_parsing_mt$ = makeSymbol("*RKF-AR-PARSING-MT*");

    private static final SubLSymbol UIA_PARSING_INTERACTION_MT = makeSymbol("UIA-PARSING-INTERACTION-MT");

    public static final SubLSymbol $rkf_ar_semantics_mt$ = makeSymbol("*RKF-AR-SEMANTICS-MT*");

    public static final SubLSymbol $rkf_user$ = makeSymbol("*RKF-USER*");

    private static final SubLSymbol UIMA_STATE_LOOKUP = makeSymbol("UIMA-STATE-LOOKUP");

    private static final SubLSymbol UIA_META_AGENDA = makeSymbol("UIA-META-AGENDA");

    static private final SubLList $list_alt68 = list($USER);

    static private final SubLList $list_alt69 = list(list(makeSymbol("*RKF-AR-PROCESSING-MODE*"), makeKeyword("TEXT-PROCESSING")));

    private static final SubLSymbol WITH_RKF_TOOL_CONTEXT = makeSymbol("WITH-RKF-TOOL-CONTEXT");

    static private final SubLList $list_alt71 = list(list(makeSymbol("*RKF-AR-PROCESSING-MODE*"), makeKeyword("QUESTION-PROCESSING")));

    static private final SubLList $list_alt72 = list(list(makeSymbol("AGENDA"), makeSymbol("CONSTRAINTS"), makeSymbol("CONTEXT-TYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol WITH_RKF_SENTENCE_CONTEXT = makeSymbol("WITH-RKF-SENTENCE-CONTEXT");

    private static final SubLSymbol WITH_RKF_QUESTION_CONTEXT = makeSymbol("WITH-RKF-QUESTION-CONTEXT");

    private static final SubLSymbol RKF_AR_WITH_ADDITIONAL_CONSTRAINTS = makeSymbol("RKF-AR-WITH-ADDITIONAL-CONSTRAINTS");

    private static final SubLSymbol EXPRESSION_FIND = makeSymbol("EXPRESSION-FIND");

    private static final SubLSymbol AR_CONCEPT_CYCL = makeSymbol("AR-CONCEPT-CYCL");

    private static final SubLSymbol $CONSTRAINT_TABLE = makeKeyword("CONSTRAINT-TABLE");

    private static final SubLSymbol $INDEXICAL_MAP = makeKeyword("INDEXICAL-MAP");

    private static final SubLSymbol $TEXT_TYPE = makeKeyword("TEXT-TYPE");



    static private final SubLString $str_alt82$Goodnews__Let_me_try_to_read_this = makeString("Goodnews: Let me try to read this sentence: '");

    static private final SubLString $str_alt83$__ = makeString("'.");







    static private final SubLList $list_alt87 = cons(makeSymbol("INDEXICAL"), makeSymbol("STRING"));

    static private final SubLString $$$simpler = makeString("simpler");

    static private final SubLString $$$different = makeString("different");

    static private final SubLString $str_alt90$I_am_unable_to_read_your_sentence = makeString("I am unable to read your sentence:");

    static private final SubLString $str_alt91$You_might_consider_rephrasing_the = makeString("You might consider rephrasing the sentence in ~A terms.");





    static private final SubLString $str_alt94$Hint__ = makeString("Hint: ");

    static private final SubLString $str_alt95$I_don_t_know_what_the_following_w = makeString("I don't know what the following words mean:");

    static private final SubLString $str_alt96$_ = makeString("\"");

    private static final SubLSymbol $UIA_NEXT_INTERACTION = makeKeyword("UIA-NEXT-INTERACTION");

    static private final SubLString $str_alt98$_Continue_ = makeString("[Continue]");

    static private final SubLString $$$Read_a_Sentence = makeString("Read a Sentence");

    static private final SubLString $str_alt100$I_believe_I_am_ = makeString("I believe I am ");

    static private final SubLString $$$stuck = makeString("stuck");

    static private final SubLString $$$done = makeString("done");

    static private final SubLString $str_alt103$_reading__ = makeString(" reading '");

    static private final SubLString $str_alt104$_ = makeString("'");

    static private final SubLString $str_alt105$We_have_agreed_on_the_following_i = makeString("We have agreed on the following interpretations already:");

    static private final SubLString $str_alt106$_Done_ = makeString("[Done]");

    static private final SubLString $str_alt107$Do_you_agree_to_this_interpretati = makeString("Do you agree to this interpretation?");

    private static final SubLSymbol CB_UIAT_SR_RENDER_CANDIDATE_CYCL = makeSymbol("CB-UIAT-SR-RENDER-CANDIDATE-CYCL");

    private static final SubLSymbol $INDISTINGUISHED = makeKeyword("INDISTINGUISHED");

    public static final SubLObject $$not = constant_handles.reader_make_constant_shell(makeString("not"));

    public static final SubLObject $$unknownSentence = constant_handles.reader_make_constant_shell(makeString("unknownSentence"));

    static private final SubLString $str_alt112$String___A__CycL___A__Domain_mt__ = makeString("String: ~A~%CycL: ~A~%Domain-mt: ~A~%Language-mt: ~A~%Cyclist: ~A~%");

    static private final SubLString $str_alt113$Automated_UIA_Parse_for__S = makeString("Automated UIA Parse for ~S");

    static private final SubLString $str_alt114$daves_cyc_com = makeString("daves@cyc.com");





    private static final SubLSymbol $REJECTED_UNKNOWN_PHRASES = makeKeyword("REJECTED-UNKNOWN-PHRASES");

    private static final SubLSymbol CB_UIAT_TEXT_FROM_PHRASE = makeSymbol("CB-UIAT-TEXT-FROM-PHRASE");

    static private final SubLList $list_alt119 = list(makeSymbol("CONCEPT"), makeSymbol("ORIGINAL"), makeSymbol("NEW-TERMS"));

    private static final SubLSymbol $PREAMBLE_METHOD = makeKeyword("PREAMBLE-METHOD");

    private static final SubLSymbol CB_UIAT_RS_SHOW_DISCOURSE_OBJECT_SUMMARY = makeSymbol("CB-UIAT-RS-SHOW-DISCOURSE-OBJECT-SUMMARY");

    private static final SubLSymbol $CONCEPT_PHRASE = makeKeyword("CONCEPT-PHRASE");

    static private final SubLString $str_alt123$_A = makeString("~A");

    static private final SubLString $str_alt124$Assuming_user_will_reject__S = makeString("Assuming user will reject ~S");

    static private final SubLString $str_alt125$The_lack_of_interpretation_for_th = makeString("The lack of interpretation for the following term is preventing my reading the sentence.");

    static private final SubLList $list_alt126 = list(makeKeyword("LATER"), makeKeyword("CONTINUE"));

    static private final SubLString $str_alt127$_ = makeString(" ");





    private static final SubLSymbol CB_UIAT_RS_SHOW_SENTENCE_SUMMARY = makeSymbol("CB-UIAT-RS-SHOW-SENTENCE-SUMMARY");

    static private final SubLList $list_alt131 = list(new SubLObject[]{ list(makeKeyword("BACKGROUND"), makeString("#cfcfcf")), list(makeKeyword("SENTENCES"), makeString("#cfcfcf")), list(makeKeyword("ASSUMED-PHRASES"), makeString("#ffffdf")), list(makeKeyword("AMBIGUOUS-PHRASES"), makeString("#dfdfff")), list(makeKeyword("ACCEPTED-PHRASES"), makeString("#dfffdf")), list(makeKeyword("PENDING-PHRASES"), makeString("#dfffdf")), list(makeKeyword("REJECTED-PHRASES"), makeString("#ffdfdf")), list(makeKeyword("IRRELEVANT-PHRASES"), makeString("#dfdfff")), list(makeKeyword("UNKNOWN-PHRASES"), makeString("#cfcfcf")), list(makeKeyword("ACCEPTED-CONCEPTS"), makeString("#dfffdf")), list(makeKeyword("TERM-TEMPLATES"), makeString("#ffffdf")), list(makeKeyword("ASSERT-TEMPLATES"), makeString("#afffaf")), list(makeKeyword("CANDIDATE-ASSERTIONS"), makeString("#afffaf")), list(makeKeyword("ASSERTED-ASSERTIONS"), makeString("#afffaf")), list($NONE, makeString("#cfcfcf")), list(makeKeyword("PHRASE-IN-QUESTION"), makeString("#ff8888")) });

    private static final SubLSymbol $PHRASE_IN_QUESTION = makeKeyword("PHRASE-IN-QUESTION");



    private static final SubLSymbol AR_PHRASE_STATUS = makeSymbol("AR-PHRASE-STATUS");























    static private final SubLList $list_alt146 = list(makeSymbol("INTERACTION"), makeSymbol("PHRASE-ID"));

    private static final SubLSymbol CB_UIAT_SR_CONFIRM_ASSUMPTION = makeSymbol("CB-UIAT-SR-CONFIRM-ASSUMPTION");

    private static final SubLSymbol AR_STATE_P = makeSymbol("AR-STATE-P");



    static private final SubLString $str_alt150$cb_uiat_sr_confirm_assumption = makeString("cb-uiat-sr-confirm-assumption");

    static private final SubLString $str_alt151$_Confirmed_ = makeString("[Confirmed]");

    private static final SubLSymbol $CB_UIAT_SR_CONFIRM_ASSUMPTION = makeKeyword("CB-UIAT-SR-CONFIRM-ASSUMPTION");

    private static final SubLSymbol CB_LINK_CB_UIAT_SR_CONFIRM_ASSUMPTION = makeSymbol("CB-LINK-CB-UIAT-SR-CONFIRM-ASSUMPTION");

    private static final SubLSymbol CB_UIAT_SR_REJECT_ASSUMPTION = makeSymbol("CB-UIAT-SR-REJECT-ASSUMPTION");

    static private final SubLString $str_alt155$cb_uiat_sr_reject_assumption = makeString("cb-uiat-sr-reject-assumption");

    static private final SubLString $str_alt156$_Rejected_ = makeString("[Rejected]");

    private static final SubLSymbol $CB_UIAT_SR_REJECT_ASSUMPTION = makeKeyword("CB-UIAT-SR-REJECT-ASSUMPTION");

    private static final SubLSymbol CB_LINK_CB_UIAT_SR_REJECT_ASSUMPTION = makeSymbol("CB-LINK-CB-UIAT-SR-REJECT-ASSUMPTION");

    static private final SubLList $list_alt159 = list(makeSymbol("INTERACTION"), makeSymbol("PHRASE-ID"), makeSymbol("CONCEPT-ID"));

    private static final SubLSymbol CB_UIAT_SENTENCE_READER_ACCEPTOR = makeSymbol("CB-UIAT-SENTENCE-READER-ACCEPTOR");

    static private final SubLString $str_alt161$cb_uiat_sentence_reader_acceptor = makeString("cb-uiat-sentence-reader-acceptor");

    static private final SubLString $str_alt162$_Yes_ = makeString("[Yes]");

    private static final SubLSymbol $CB_UIAT_SENTENCE_READER_ACCEPTOR = makeKeyword("CB-UIAT-SENTENCE-READER-ACCEPTOR");

    private static final SubLSymbol CB_LINK_CB_UIAT_SENTENCE_READER_ACCEPTOR = makeSymbol("CB-LINK-CB-UIAT-SENTENCE-READER-ACCEPTOR");

    private static final SubLSymbol CB_UIAT_SENTENCE_READER_REJECTOR = makeSymbol("CB-UIAT-SENTENCE-READER-REJECTOR");

    static private final SubLString $str_alt166$cb_uiat_sentence_reader_rejector = makeString("cb-uiat-sentence-reader-rejector");

    static private final SubLString $str_alt167$_Reject_All_ = makeString("[Reject All]");

    private static final SubLSymbol $CB_UIAT_SENTENCE_READER_REJECTOR = makeKeyword("CB-UIAT-SENTENCE-READER-REJECTOR");

    private static final SubLSymbol CB_LINK_CB_UIAT_SENTENCE_READER_REJECTOR = makeSymbol("CB-LINK-CB-UIAT-SENTENCE-READER-REJECTOR");

    private static final SubLSymbol $QUESTION_ASKER = makeKeyword("QUESTION-ASKER");

    static private final SubLList $list_alt171 = list($NAME, makeString("Question Asker"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-QUESTION-ASKER-HINT"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-QUESTION-ASKER-CHILD-COMPLETED"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycQuestionAsker")));

    private static final SubLSymbol $SOLUTION_COUNTER = makeKeyword("SOLUTION-COUNTER");

    static private final SubLList $list_alt173 = list(makeKeyword("DISPLAY-METHOD"), makeSymbol("CB-UIAT-QUESTION-ASKER-DISPLAY"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycQuestionAsker")));

    static private final SubLList $list_alt174 = list(makeSymbol("TEXT"));

    static private final SubLString $str_alt175$Ask___A_ = makeString("Ask '~A'");





    private static final SubLSymbol $QUERY_RESULT = makeKeyword("QUERY-RESULT");

    private static final SubLSymbol $UIAT_QASKER_CONTINUE = makeKeyword("UIAT-QASKER-CONTINUE");

    static private final SubLString $str_alt180$No_results_ = makeString("No results.");

    static private final SubLString $str_alt181$The_answer_to_your_question_is_ = makeString("The answer to your question is ");

    private static final SubLSymbol $UIAT_QASKER_JUSTIFY_QUERY = makeKeyword("UIAT-QASKER-JUSTIFY-QUERY");

    static private final SubLString $$$yes = makeString("yes");



    static private final SubLList $list_alt185 = list(makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));

    static private final SubLString $str_alt186$_D = makeString("~D");

    private static final SubLSymbol $UIA_INTERACTION = makeKeyword("UIA-INTERACTION");

    static private final SubLString $str_alt188$cb_uiat_qasker_justify_query = makeString("cb-uiat-qasker-justify-query");

    private static final SubLSymbol CB_LINK_UIAT_QASKER_JUSTIFY_QUERY = makeSymbol("CB-LINK-UIAT-QASKER-JUSTIFY-QUERY");

    static private final SubLList $list_alt190 = list(makeSymbol("UI-ID"), makeSymbol("RESULT-ID"));

    static private final SubLString $str_alt191$Stale_query_information_ = makeString("Stale query information.");

    static private final SubLString $str_alt192$90_ = makeString("90%");





    private static final SubLSymbol $UIAT_QASKER_DISPLAY_QUERY = makeKeyword("UIAT-QASKER-DISPLAY-QUERY");

    static private final SubLString $str_alt196$_Back_to_Query_ = makeString("[Back to Query]");

    private static final SubLSymbol CB_UIAT_QASKER_JUSTIFY_QUERY = makeSymbol("CB-UIAT-QASKER-JUSTIFY-QUERY");

    static private final SubLString $$$Show_Results = makeString("Show Results");

    static private final SubLString $str_alt199$cb_uiat_qasker_display_query = makeString("cb-uiat-qasker-display-query");

    private static final SubLSymbol CB_LINK_UIAT_QASKER_DISPLAY_QUERY = makeSymbol("CB-LINK-UIAT-QASKER-DISPLAY-QUERY");

    static private final SubLString $$$Continue = makeString("Continue");

    static private final SubLString $str_alt202$cb_uiat_qasker_continue = makeString("cb-uiat-qasker-continue");

    private static final SubLSymbol CB_LINK_UIAT_QASKER_CONTINUE = makeSymbol("CB-LINK-UIAT-QASKER-CONTINUE");

    static private final SubLList $list_alt204 = list(makeSymbol("UI-ID"));

    private static final SubLSymbol CB_UIAT_QASKER_CONTINUE = makeSymbol("CB-UIAT-QASKER-CONTINUE");

    private static final SubLSymbol CB_UIAT_QASKER_DISPLAY_QUERY = makeSymbol("CB-UIAT-QASKER-DISPLAY-QUERY");

    static private final SubLString $str_alt207$Query__ = makeString("Query: ");

    static private final SubLString $str_alt208$Bindings__ = makeString("Bindings: ");



    static private final SubLString $str_alt210$Justifications__ = makeString("Justifications: ");

    // // Initializers
    public void declareFunctions() {
        declare_cb_uiat_smart_file();
    }

    public void initializeVariables() {
        init_cb_uiat_smart_file();
    }

    public void runTopLevelForms() {
        setup_cb_uiat_smart_file();
    }
}

