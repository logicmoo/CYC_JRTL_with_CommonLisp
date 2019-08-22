/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
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
 *  module:      UIA-TOOLS-SETUP
 *  source file: /cyc/top/cycl/uia-tools-setup.lisp
 *  created:     2019/07/03 17:37:57
 */
public final class uia_tools_setup extends SubLTranslatedFile implements V02 {
    // // Constructor
    private uia_tools_setup() {
    }

    public static final SubLFile me = new uia_tools_setup();


    // // Definitions
    public static final SubLObject uia_act_new_configure_interface(SubLObject v_agenda) {
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, $REQUIRED, $CONFIGURE_INTERFACE, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject uiat_configure_interface_generate_request(SubLObject interaction) {
        return user_interaction_agenda.make_ui_request(interaction, $SHOW, NIL);
    }

    public static final SubLObject uiat_configure_interface_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt4);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt4);
            action_type = current.first();
            current = current.rest();
            temp_plist = current;
            {
                SubLObject signature = getf(temp_plist, $SIGNATURE, UNPROVIDED);
                SubLObject agenda_signature = getf(temp_plist, $AGENDA_SIGNATURE, UNPROVIDED);
                SubLObject plist = remf(remf(copy_list(temp_plist), $SIGNATURE), $AGENDA_SIGNATURE);
                SubLObject interaction = (NIL != signature) ? ((SubLObject) (user_interaction_agenda.find_ui_by_signature(signature))) : NIL;
                SubLObject v_agenda = (NIL != interaction) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : user_interaction_agenda.find_uia_by_signature(agenda_signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($ANSWER)) {
                    {
                        SubLObject uima = user_interaction_agenda.uia_meta_agenda(v_agenda);
                        SubLObject remainder = NIL;
                        for (remainder = plist; NIL != remainder; remainder = cddr(remainder)) {
                            {
                                SubLObject property = remainder.first();
                                SubLObject value = cadr(remainder);
                                if (NIL != uima_interface_parameter_declaration.uima_interface_parameter_p(property)) {
                                    uima_interface_parameter_declaration.uima_interface_parameter_update(uima, property, value);
                                }
                            }
                        }
                    }
                    missing_knowledge_discovery_events.dont_log_unlexified_term_discovery();
                    cb_user_interaction_agenda.cb_uia_launchers_refresh_script();
                    user_interaction_agenda.uia_act_complete(v_agenda, interaction, $DONE);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uia_act_new_user_modeler(SubLObject v_agenda, SubLObject mode) {
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $USER_MODELER, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject uiat_user_modeler_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($DISAMBIGUATE_PHRASE)) {
                {
                    SubLObject user = user_interaction_agenda.ui_result(child);
                    if ($NONE != user) {
                        uiat_user_modeler_update_user(v_agenda, user);
                    }
                }
            }
        }
        return parent;
    }

    public static final SubLObject uiat_user_modeler_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            {
                SubLObject user = uia_setup_state.uia_user(v_agenda);
                if ($UNDETERMINED == user) {
                    return user_interaction_agenda.make_ui_request(interaction, $SPECIFY_USER, list($CB_USER, operation_communication.the_cyclist()));
                }
            }
            {
                SubLObject language = uia_setup_state.uia_language(v_agenda);
                if ($UNDETERMINED == language) {
                    {
                        SubLObject language_prompts = uiat_user_modeler_user_applicable_language_prompts(v_agenda);
                        if (NIL != list_utilities.singletonP(language_prompts)) {
                            uiat_user_modeler_set_language_of_choice(v_agenda, uiat_user_modeler_language_prompt_language(language_prompts.first()));
                        } else {
                            return user_interaction_agenda.make_ui_request(interaction, $SPECIFY_LANGUAGE, list($LANGUAGE_PROMPTS, language_prompts));
                        }
                    }
                }
            }
            {
                SubLObject language = uia_setup_state.uia_language(v_agenda);
                SubLObject user = uia_setup_state.uia_user(v_agenda);
                SubLObject can_change_user = T;
                SubLObject languages = user_interaction_agenda.uia_state_lookup(v_agenda, $USER_LANGUAGES, list($$EnglishLanguage));
                SubLObject can_change_language = makeBoolean(NIL == list_utilities.singletonP(languages));
                return user_interaction_agenda.make_ui_request(interaction, $MODIFY, list($LANGUAGE, language, $USER, user, $CAN_CHANGE_LANGUAGE, can_change_language, $CAN_CHANGE_USER, can_change_user));
            }
        }
    }

    public static final SubLObject uiat_user_modeler_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt4);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt4);
            action_type = current.first();
            current = current.rest();
            temp_plist = current;
            {
                SubLObject signature = getf(temp_plist, $SIGNATURE, UNPROVIDED);
                SubLObject agenda_signature = getf(temp_plist, $AGENDA_SIGNATURE, UNPROVIDED);
                SubLObject plist = remf(remf(copy_list(temp_plist), $SIGNATURE), $AGENDA_SIGNATURE);
                SubLObject interaction = (NIL != signature) ? ((SubLObject) (user_interaction_agenda.find_ui_by_signature(signature))) : NIL;
                SubLObject v_agenda = (NIL != interaction) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : user_interaction_agenda.find_uia_by_signature(agenda_signature);
                SubLObject clarify_links = user_interaction_agenda.ui_state_lookup(interaction, $CLARIFY_LINKS, $TRUE);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($SPECIFY_LANGUAGE)) {
                    {
                        SubLObject datum_1 = plist;
                        SubLObject current_2 = datum_1;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_2;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_1, $list_alt27);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_1, $list_alt27);
                            if (NIL == member(current_3, $list_alt28, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_1, $list_alt27);
                        }
                        {
                            SubLObject language_tail = property_list_member($LANGUAGE, current_2);
                            SubLObject language = (NIL != language_tail) ? ((SubLObject) (cadr(language_tail))) : NIL;
                            uiat_user_modeler_set_language_of_choice(v_agenda, language);
                        }
                    }
                } else
                    if (pcase_var.eql($SPECIFY_USER)) {
                        {
                            SubLObject datum_4 = plist;
                            SubLObject current_5 = datum_4;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current_5;
                            SubLObject bad = NIL;
                            SubLObject current_6 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum_4, $list_alt30);
                                current_6 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum_4, $list_alt30);
                                if (NIL == member(current_6, $list_alt31, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_6 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum_4, $list_alt30);
                            }
                            {
                                SubLObject user_tail = property_list_member($USER, current_5);
                                SubLObject user = (NIL != user_tail) ? ((SubLObject) (cadr(user_tail))) : NIL;
                                SubLObject candidate_terms = uiat_user_modeler_read_user(interaction, user);
                                if (NIL == candidate_terms) {
                                    {
                                        SubLObject error_message = format(NIL, $str_alt32$Error____A_is_not_a_known_cyclist, user);
                                        user_interaction_agenda.uia_act_new_acknowledge_message(v_agenda, error_message);
                                    }
                                } else
                                    if (NIL != list_utilities.singletonP(candidate_terms)) {
                                        {
                                            SubLObject datum_7 = candidate_terms;
                                            SubLObject current_8 = datum_7;
                                            SubLObject cyclist = NIL;
                                            destructuring_bind_must_consp(current_8, datum_7, $list_alt33);
                                            cyclist = current_8.first();
                                            current_8 = current_8.rest();
                                            if (NIL == current_8) {
                                                uiat_user_modeler_update_user(v_agenda, cyclist);
                                            } else {
                                                cdestructuring_bind_error(datum_7, $list_alt33);
                                            }
                                        }
                                    } else {
                                        {
                                            SubLObject child = uia_tools_basic.uia_act_new_disambiguate_phrase(v_agenda, $REQUIRED, user, candidate_terms, clarify_links, $USER, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                                        }
                                    }

                            }
                        }
                    } else
                        if (pcase_var.eql($MODIFY)) {
                            {
                                SubLObject datum_9 = plist;
                                SubLObject current_10 = datum_9;
                                SubLObject allow_other_keys_p = NIL;
                                SubLObject rest = current_10;
                                SubLObject bad = NIL;
                                SubLObject current_11 = NIL;
                                for (; NIL != rest;) {
                                    destructuring_bind_must_consp(rest, datum_9, $list_alt34);
                                    current_11 = rest.first();
                                    rest = rest.rest();
                                    destructuring_bind_must_consp(rest, datum_9, $list_alt34);
                                    if (NIL == member(current_11, $list_alt35, UNPROVIDED, UNPROVIDED)) {
                                        bad = T;
                                    }
                                    if (current_11 == $ALLOW_OTHER_KEYS) {
                                        allow_other_keys_p = rest.first();
                                    }
                                    rest = rest.rest();
                                }
                                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                    cdestructuring_bind_error(datum_9, $list_alt34);
                                }
                                {
                                    SubLObject change_tail = property_list_member($CHANGE, current_10);
                                    SubLObject change = (NIL != change_tail) ? ((SubLObject) (cadr(change_tail))) : NIL;
                                    SubLObject pcase_var_12 = change;
                                    if (pcase_var_12.eql($USER)) {
                                        user_interaction_agenda.uia_state_clear(v_agenda, $USER);
                                    } else
                                        if (pcase_var_12.eql($LANGUAGE)) {
                                            user_interaction_agenda.uia_state_clear(v_agenda, $LANGUAGE);
                                        }

                                }
                            }
                        }


            }
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown - Assumes UIA-USER for AGENDA is set.
     */
    public static final SubLObject uiat_user_modeler_user_applicable_language_prompts(SubLObject v_agenda) {
        return nth_value_step_2(nth_value_step_1(ONE_INTEGER), uiat_user_modeler_determine_languages_and_prompts(v_agenda));
    }

    public static final SubLObject uiat_user_modeler_determine_languages_and_prompts(SubLObject v_agenda) {
        {
            SubLObject user = uia_setup_state.uia_user(v_agenda);
            SubLObject prompts = rkf_user_modeler.rkf_user_modeler_supported_language_prompts_for_user(user);
            SubLObject languages = Mapping.mapcar(UIAT_USER_MODELER_LANGUAGE_PROMPT_LANGUAGE, prompts);
            return values(languages, prompts);
        }
    }

    public static final SubLObject uiat_user_modeler_language_prompt_language(SubLObject language_prompt) {
        return rkf_user_modeler.rkf_user_modeler_language_prompt_language(language_prompt);
    }

    /**
     * Given LANGUAGE-NAME, what language should the UIA use for interactions?
     */
    public static final SubLObject uiat_user_modeler_determine_language(SubLObject language_name) {
        return $$EnglishLanguage;
    }

    public static final SubLObject uiat_user_modeler_read_user(SubLObject interaction, SubLObject user) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject parsing_mt = user_interaction_agenda.ui_parsing_interaction_mt(interaction);
            SubLObject generation_mt = user_interaction_agenda.ui_generation_language_mt(interaction);
            SubLObject domain_mt = $$CyclistsMt;
            SubLObject candidates = uia_trampolines.uia_phrase_candidate_terms(v_agenda, user, parsing_mt, domain_mt, UNPROVIDED);
            return uia_trampolines.uia_sort_terms(v_agenda, candidates, generation_mt, domain_mt);
        }
    }

    /**
     * User Modeler tool updates that the user in AGENDA is USER.
     *
     * @unknown The Cyc Agenda error handling mode is set to ignore except in internal releases
     */
    public static final SubLObject uiat_user_modeler_update_user(SubLObject v_agenda, SubLObject user) {
        uia_setup_state.uia_user_update(v_agenda, user);
        uiat_user_modeler_determine_languages(v_agenda);
        if ((NIL != uima_interface_parameter_declaration.uia_external_use_assumptionsP(v_agenda)) && ($IGNORE != agenda.agenda_error_mode())) {
            agenda.set_agenda_error_mode($IGNORE);
        }
        return v_agenda;
    }

    /**
     *
     *
     * @unknown - Assumes UIA-USER for AGENDA is set appropriately.
     */
    public static final SubLObject uiat_user_modeler_determine_languages(SubLObject v_agenda) {
        {
            SubLObject languages = uiat_user_modeler_determine_languages_and_prompts(v_agenda);
            if (NIL != list_utilities.singletonP(languages)) {
                uia_setup_state.uia_language_update(v_agenda, languages.first());
                uia_setup_state.uia_compute_setup_state_wrt_language(v_agenda);
            }
            user_interaction_agenda.uia_state_update(v_agenda, $USER_LANGUAGES, languages);
            return languages;
        }
    }

    public static final SubLObject uiat_user_modeler_set_language_of_choice(SubLObject v_agenda, SubLObject language) {
        uia_setup_state.uia_language_update(v_agenda, language);
        uia_setup_state.uia_compute_setup_state_wrt_language(v_agenda);
        return v_agenda;
    }

    // deflexical
    public static final SubLSymbol $uiat_agenda_state_filemask$ = makeSymbol("*UIAT-AGENDA-STATE-FILEMASK*");

    public static final SubLObject uia_act_new_topic_specifier(SubLObject v_agenda, SubLObject mode) {
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $TOPIC_SPECIFIER, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject uiat_topic_specifier_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
            SubLObject operator = user_interaction_agenda.ui_operator(child);
            SubLObject pcase_var = operator;
            if (pcase_var.eql($FILE_BROWSER)) {
                {
                    SubLObject filename = user_interaction_agenda.ui_result(child);
                    uia_serialize.uia_act_instantiate_agenda(v_agenda, filename);
                    {
                        SubLObject topic = uia_setup_state.uia_topic(v_agenda);
                        user_interaction_agenda.uia_act_complete(v_agenda, parent, list($LOADED, topic));
                    }
                }
            } else {
                {
                    SubLObject topic = user_interaction_agenda.ui_result(child);
                    if ($NONE.eql(topic)) {
                        user_interaction_agenda.ui_state_clear(parent, $PHRASE);
                    } else {
                        user_interaction_agenda.ui_state_update(parent, $TOPIC, topic);
                    }
                }
            }
        }
        return parent;
    }

    public static final SubLObject uiat_topic_specifier_generate_request(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject phrase = user_interaction_agenda.ui_state_lookup(interaction, $PHRASE, $UNDETERMINED);
                SubLObject clarify_links = user_interaction_agenda.ui_state_lookup(interaction, $CLARIFY_LINKS, $TRUE);
                SubLObject topic_ideas = uiat_topic_specifier_get_some_topics(v_agenda);
                SubLObject old_sessions = uiat_topic_specifier_get_aborted_agendas(interaction);
                if ($UNDETERMINED.eql(phrase)) {
                    {
                        SubLObject default_topic = uia_user_modeler.uia_user_modeler_default_topic(v_agenda);
                        SubLObject other_topics = uiat_topic_specifier_available_topics(v_agenda);
                        SubLObject old_topic_list = uiat_topic_specifier_build_old_topic_list(v_agenda, old_sessions);
                        SubLObject tried_offering_restartP = user_interaction_agenda.ui_state_lookup(interaction, $kw47$TRIED_OFFERING_RESTART_, UNPROVIDED);
                        SubLObject request = NIL;
                        thread.resetMultipleValues();
                        {
                            SubLObject topic = user_interaction_agenda.uia_give_current_topic_and_name(v_agenda);
                            SubLObject topicname = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if ((NIL == old_sessions) || (NIL != tried_offering_restartP)) {
                                request = user_interaction_agenda.make_ui_request(interaction, $SHOW, list(new SubLObject[]{ $DEFAULT_TOPIC, default_topic, $CURRENT_TOPIC, NIL != forts.fort_p(topic) ? ((SubLObject) (topic)) : NIL, $CURRENT_TOPIC_NAME, topicname, $COOL_TOPICS, topic_ideas, $OTHER_TOPICS, other_topics, $OLD_TOPIC_LIST, old_topic_list }));
                            } else {
                                request = user_interaction_agenda.make_ui_request(interaction, $OFFER_RESTART, list($OLD_TOPIC_LIST, old_topic_list));
                            }
                            return request;
                        }
                    }
                }
                {
                    SubLObject topic = user_interaction_agenda.ui_state_lookup(interaction, $TOPIC, $UNDETERMINED);
                    if ($UNDETERMINED.eql(topic)) {
                        {
                            SubLObject candidate_terms = uiat_topic_specifier_read_topic(interaction, phrase);
                            if (NIL == candidate_terms) {
                                user_interaction_agenda.ui_state_clear(interaction, $PHRASE);
                                {
                                    SubLObject message = format(NIL, $str_alt55$Sorry__I_don_t_understand_what_yo, phrase);
                                    user_interaction_agenda.uia_act_new_acknowledge_message(v_agenda, message);
                                }
                            } else
                                if (NIL != list_utilities.singletonP(candidate_terms)) {
                                    user_interaction_agenda.ui_state_update(interaction, $TOPIC, candidate_terms.first());
                                } else {
                                    {
                                        SubLObject phrase_disambiguator_action = uia_tools_basic.uia_act_new_disambiguate_phrase(v_agenda, $REQUIRED, phrase, candidate_terms, clarify_links, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, phrase_disambiguator_action);
                                    }
                                }

                        }
                    } else {
                        user_interaction_agenda.uia_act_complete(v_agenda, interaction, topic);
                        if (NIL != forts.fort_p(uia_setup_state.uia_topic(v_agenda))) {
                            {
                                SubLObject new_agenda = cb_user_interaction_agenda.cb_uia_new_focal_agenda();
                                v_agenda = new_agenda;
                            }
                        }
                        uia_setup_state.uia_topic_update(v_agenda, topic);
                        uia_setup_state.uia_compute_setup_state_wrt_topic(v_agenda);
                    }
                }
                return user_interaction_agenda.uia_generate_next_request(v_agenda);
            }
        }
    }

    /**
     *
     *
     * @return LISTP; Alphabetized list of (<topic-term> . <topic-string>) pairs.
     */
    public static final SubLObject uiat_topic_specifier_get_some_topics(SubLObject v_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject topics = NIL;
                SubLObject topic_forts = uia_user_modeler.uia_user_modeler_get_topic_forts(v_agenda);
                {
                    SubLObject _prev_bind_0 = rkf_macros.$rkf_addressee$.currentBinding(thread);
                    SubLObject _prev_bind_1 = rkf_macros.$rkf_speaker$.currentBinding(thread);
                    try {
                        rkf_macros.$rkf_addressee$.bind(uia_macros.uia_addressee_for_utterance_type(v_agenda, $CYC_TO_USER), thread);
                        rkf_macros.$rkf_speaker$.bind(uia_macros.uia_speaker_for_utterance_type(v_agenda, $CYC_TO_USER), thread);
                        {
                            SubLObject cdolist_list_var = topic_forts;
                            SubLObject topic_fort = NIL;
                            for (topic_fort = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , topic_fort = cdolist_list_var.first()) {
                                {
                                    SubLObject topic_string = uia_trampolines.uia_term_phrase_np(v_agenda, topic_fort, user_interaction_agenda.uimma_default_generation_mt(), user_interaction_agenda.uimma_default_domain_mt(), $TEXT);
                                    topics = cons(cons(topic_fort, topic_string), topics);
                                }
                            }
                        }
                    } finally {
                        rkf_macros.$rkf_speaker$.rebind(_prev_bind_1, thread);
                        rkf_macros.$rkf_addressee$.rebind(_prev_bind_0, thread);
                    }
                }
                return Sort.sort(topics, STRING_LESSP, CDR);
            }
        }
    }

    public static final SubLObject uiat_topic_specifier_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt4);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt4);
            action_type = current.first();
            current = current.rest();
            temp_plist = current;
            {
                SubLObject signature = getf(temp_plist, $SIGNATURE, UNPROVIDED);
                SubLObject agenda_signature = getf(temp_plist, $AGENDA_SIGNATURE, UNPROVIDED);
                SubLObject plist = remf(remf(copy_list(temp_plist), $SIGNATURE), $AGENDA_SIGNATURE);
                SubLObject interaction = (NIL != signature) ? ((SubLObject) (user_interaction_agenda.find_ui_by_signature(signature))) : NIL;
                SubLObject v_agenda = (NIL != interaction) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : user_interaction_agenda.find_uia_by_signature(agenda_signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($ANSWER)) {
                    {
                        SubLObject datum_13 = plist;
                        SubLObject current_14 = datum_13;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_14;
                        SubLObject bad = NIL;
                        SubLObject current_15 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_13, $list_alt60);
                            current_15 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_13, $list_alt60);
                            if (NIL == member(current_15, $list_alt61, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_15 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_13, $list_alt60);
                        }
                        {
                            SubLObject topic_tail = property_list_member($TOPIC, current_14);
                            SubLObject topic = (NIL != topic_tail) ? ((SubLObject) (cadr(topic_tail))) : NIL;
                            if (NIL != forts.fort_p(topic)) {
                                user_interaction_agenda.ui_state_update(interaction, $TOPIC, topic);
                                user_interaction_agenda.ui_state_update(interaction, $PHRASE, kb_paths.fort_name(topic));
                            } else
                                if (topic.isString()) {
                                    user_interaction_agenda.ui_state_update(interaction, $PHRASE, topic);
                                }

                        }
                    }
                } else
                    if (pcase_var.eql($IGNORE_OLD_TOPIC)) {
                        user_interaction_agenda.ui_state_update(interaction, $kw47$TRIED_OFFERING_RESTART_, T);
                    } else
                        if (pcase_var.eql($RESUME_TOPIC)) {
                            {
                                SubLObject datum_16 = plist;
                                SubLObject current_17 = datum_16;
                                SubLObject allow_other_keys_p = NIL;
                                SubLObject rest = current_17;
                                SubLObject bad = NIL;
                                SubLObject current_18 = NIL;
                                for (; NIL != rest;) {
                                    destructuring_bind_must_consp(rest, datum_16, $list_alt64);
                                    current_18 = rest.first();
                                    rest = rest.rest();
                                    destructuring_bind_must_consp(rest, datum_16, $list_alt64);
                                    if (NIL == member(current_18, $list_alt65, UNPROVIDED, UNPROVIDED)) {
                                        bad = T;
                                    }
                                    if (current_18 == $ALLOW_OTHER_KEYS) {
                                        allow_other_keys_p = rest.first();
                                    }
                                    rest = rest.rest();
                                }
                                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                    cdestructuring_bind_error(datum_16, $list_alt64);
                                }
                                {
                                    SubLObject agenda_id_tail = property_list_member($AGENDA_ID, current_17);
                                    SubLObject agenda_id = (NIL != agenda_id_tail) ? ((SubLObject) (cadr(agenda_id_tail))) : NIL;
                                    if (agenda_id.isNumber()) {
                                        {
                                            SubLObject uima = cb_user_interaction_agenda.cb_current_uima();
                                            SubLObject topic_agenda = user_interaction_agenda.uima_find_by_id(uima, agenda_id);
                                            if (NIL != user_interaction_agenda.user_interaction_agenda_p(topic_agenda)) {
                                                user_interaction_agenda.uia_act_complete(v_agenda, interaction, uia_setup_state.uia_topic(topic_agenda));
                                                user_interaction_agenda.uima_act_focus(uima, topic_agenda);
                                                cb_user_interaction_agenda.cb_uia_show_next_interaction(topic_agenda);
                                            }
                                        }
                                    }
                                }
                            }
                        } else
                            if (pcase_var.eql($RESUME_OLD_TOPIC)) {
                                {
                                    SubLObject datum_19 = plist;
                                    SubLObject current_20 = datum_19;
                                    SubLObject allow_other_keys_p = NIL;
                                    SubLObject rest = current_20;
                                    SubLObject bad = NIL;
                                    SubLObject current_21 = NIL;
                                    for (; NIL != rest;) {
                                        destructuring_bind_must_consp(rest, datum_19, $list_alt68);
                                        current_21 = rest.first();
                                        rest = rest.rest();
                                        destructuring_bind_must_consp(rest, datum_19, $list_alt68);
                                        if (NIL == member(current_21, $list_alt69, UNPROVIDED, UNPROVIDED)) {
                                            bad = T;
                                        }
                                        if (current_21 == $ALLOW_OTHER_KEYS) {
                                            allow_other_keys_p = rest.first();
                                        }
                                        rest = rest.rest();
                                    }
                                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                        cdestructuring_bind_error(datum_19, $list_alt68);
                                    }
                                    {
                                        SubLObject interaction_mt_tail = property_list_member($INTERACTION_MT, current_20);
                                        SubLObject interaction_mt = (NIL != interaction_mt_tail) ? ((SubLObject) (cadr(interaction_mt_tail))) : NIL;
                                        uiat_topic_specifier_resume_old_conversation(interaction, interaction_mt);
                                        user_interaction_agenda.uia_act_complete(v_agenda, interaction, list($RESUME_OLD_TOPIC, uia_setup_state.uia_topic(v_agenda)));
                                        cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                                    }
                                }
                            } else
                                if (pcase_var.eql($STAY_ON_TOPIC)) {
                                    user_interaction_agenda.uia_act_complete(v_agenda, interaction, uia_setup_state.uia_topic(v_agenda));
                                } else
                                    if (pcase_var.eql($LOAD_REQUEST)) {
                                        {
                                            SubLObject child = uia_tools_basic.uia_act_load_file_masked(v_agenda, $str_alt73$_, $uiat_agenda_state_filemask$.getGlobalValue());
                                            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                                        }
                                    }





            }
        }
        return NIL;
    }

    public static final SubLObject uiat_topic_specifier_read_topic(SubLObject interaction, SubLObject phrase) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject parsing_mt = user_interaction_agenda.ui_parsing_interaction_mt(interaction);
            SubLObject generation_mt = user_interaction_agenda.ui_generation_language_mt(interaction);
            SubLObject domain_mt = user_interaction_agenda.ui_generation_domain_mt(interaction);
            SubLObject candidates = uia_trampolines.uia_phrase_candidate_terms(v_agenda, phrase, parsing_mt, domain_mt, UNPROVIDED);
            return uia_trampolines.uia_sort_terms(v_agenda, candidates, generation_mt, domain_mt);
        }
    }

    public static final SubLObject uiat_topic_specifier_available_topics(SubLObject curr_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject meta_agenda = user_interaction_agenda.uia_meta_agenda(curr_agenda);
                SubLObject open_agendas = user_interaction_agenda.uima_open_agendas_sequence(meta_agenda);
                SubLObject topics = NIL;
                SubLObject cdolist_list_var = open_agendas;
                SubLObject v_agenda = NIL;
                for (v_agenda = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_agenda = cdolist_list_var.first()) {
                    {
                        SubLObject _prev_bind_0 = rkf_macros.$rkf_addressee$.currentBinding(thread);
                        SubLObject _prev_bind_1 = rkf_macros.$rkf_speaker$.currentBinding(thread);
                        try {
                            rkf_macros.$rkf_addressee$.bind(uia_macros.uia_addressee_for_utterance_type(v_agenda, $CYC_TO_USER), thread);
                            rkf_macros.$rkf_speaker$.bind(uia_macros.uia_speaker_for_utterance_type(v_agenda, $CYC_TO_USER), thread);
                            if (!(user_interaction_agenda.uia_id(v_agenda).numE(user_interaction_agenda.uia_id(curr_agenda)) || (NIL == forts.fort_p(uia_setup_state.uia_topic(v_agenda))))) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject topic = user_interaction_agenda.uia_give_current_topic_and_name(v_agenda);
                                    SubLObject topic_name = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    topics = cons(list($AGENDA_ID, user_interaction_agenda.uia_id(v_agenda), $TOPIC, topic, $TOPIC_NAME, topic_name), topics);
                                }
                            }
                        } finally {
                            rkf_macros.$rkf_speaker$.rebind(_prev_bind_1, thread);
                            rkf_macros.$rkf_addressee$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return topics;
            }
        }
    }

    /**
     * For each of the old sessions Mts, construct a mapping of the topic
     * and the sessions.
     */
    public static final SubLObject uiat_topic_specifier_build_old_topic_list(SubLObject v_agenda, SubLObject old_sessions) {
        {
            SubLObject old_topic_list = NIL;
            SubLObject cdolist_list_var = old_sessions;
            SubLObject old_session = NIL;
            for (old_session = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , old_session = cdolist_list_var.first()) {
                {
                    SubLObject topic = dictionary.dictionary_lookup(old_session, $TOPIC, UNPROVIDED);
                    SubLObject domain_interaction_mt = dictionary.dictionary_lookup(old_session, $DOMAIN_INTERACTION_MT, UNPROVIDED);
                    SubLObject topic_string = uia_trampolines.uia_term_phrase_np(v_agenda, topic, user_interaction_agenda.uimma_default_generation_mt(), user_interaction_agenda.uimma_default_domain_mt(), $TEXT);
                    old_topic_list = cons(cons(topic_string, domain_interaction_mt), old_topic_list);
                }
            }
            return old_topic_list;
        }
    }

    public static final SubLObject uiat_topic_specifier_get_aborted_agendas(SubLObject interaction) {
        if (NIL == user_interaction_agenda.ui_state_lookup(interaction, $OLD_SESSIONS, NIL)) {
            uiat_topic_specifier_aborted_agenda_detector(interaction);
        }
        return user_interaction_agenda.ui_state_lookup(interaction, $OLD_SESSIONS, UNPROVIDED);
    }

    public static final SubLObject uiat_topic_specifier_aborted_agenda_detector(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject user = uia_setup_state.uima_user(user_interaction_agenda.uia_meta_agenda(user_interaction_agenda.ui_agenda(interaction)));
                SubLObject mts = uia_setup_state.uia_identify_previous_agenda_mts(user, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject active = user_interaction_agenda.uimma_match_mts_to_agendas(mts, user);
                    SubLObject ruins = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    user_interaction_agenda.ui_state_update(interaction, $ACTIVE_SESSIONS, active);
                    {
                        SubLObject investigated_ruins = uia_setup_state.uia_identify_previous_agendas_around_mts(ruins);
                        user_interaction_agenda.ui_state_update(interaction, $OLD_SESSIONS, investigated_ruins);
                    }
                }
            }
            return interaction;
        }
    }

    public static final SubLObject uiat_topic_specifier_resume_old_conversation(SubLObject interaction, SubLObject interaction_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject old_sessions = user_interaction_agenda.ui_state_lookup(interaction, $OLD_SESSIONS, UNPROVIDED);
                SubLObject v_dictionary = NIL;
                if (NIL == v_dictionary) {
                    {
                        SubLObject csome_list_var = old_sessions;
                        SubLObject old_session = NIL;
                        for (old_session = csome_list_var.first(); !((NIL != v_dictionary) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , old_session = csome_list_var.first()) {
                            if (interaction_mt == dictionary.dictionary_lookup(old_session, $DOMAIN_INTERACTION_MT, UNPROVIDED)) {
                                v_dictionary = old_session;
                            }
                        }
                    }
                }
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject value = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            user_interaction_agenda.uia_state_update(v_agenda, key, value);
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                uia_setup_state.uia_topic_update(v_agenda, dictionary.dictionary_lookup(v_dictionary, $TOPIC, UNPROVIDED));
                uia_setup_state.uia_note_setup_state_complete(v_agenda);
            }
            return interaction;
        }
    }

    public static final SubLObject uia_act_new_initializer(SubLObject v_agenda, SubLObject mode) {
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $INITIALIZER, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject uiat_initializer_child_invalidated(SubLObject parent, SubLObject child) {
        user_interaction_agenda.ui_recompute_status(parent);
        return parent;
    }

    public static final SubLObject uiat_initializer_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($TOPIC_SPECIFIER)) {
                {
                    SubLObject result = user_interaction_agenda.ui_result(child);
                    if (result.isList() && result.first().isKeyword()) {
                        {
                            SubLObject datum = result;
                            SubLObject current = datum;
                            SubLObject modus = NIL;
                            SubLObject v_answer = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt80);
                            modus = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt80);
                            v_answer = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (modus == $RESUME_OLD_TOPIC) {
                                    user_interaction_agenda.ui_state_update(parent, $kw81$CONTINUED_PREVIOUS_WORK_, $TRUE);
                                    user_interaction_agenda.ui_state_update(parent, $kw82$SETUP_ATTEMPTED_, $TRUE);
                                } else
                                    if (modus == $LOADED) {
                                        user_interaction_agenda.ui_state_update(parent, $kw81$CONTINUED_PREVIOUS_WORK_, $TRUE);
                                    }

                            } else {
                                cdestructuring_bind_error(datum, $list_alt80);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_initializer_child_rejected(SubLObject parent, SubLObject child) {
        user_interaction_agenda.ui_recompute_status(parent);
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
            SubLObject language = uia_setup_state.uia_language(v_agenda);
            SubLObject user = uia_setup_state.uia_user(v_agenda);
            SubLObject topic = uia_setup_state.uia_topic(v_agenda);
            SubLObject operator = user_interaction_agenda.ui_operator(child);
            SubLObject message = NIL;
            if ($USER_MODELER.eql(operator) && $UNDETERMINED.eql(language)) {
                message = $str_alt83$Sorry__I_must_insist_that_you_cho;
            } else
                if ($USER_MODELER.eql(operator) && $UNDETERMINED.eql(user)) {
                    message = $str_alt84$Sorry__I_must_insist_that_you_ide;
                } else
                    if ($TOPIC_SPECIFIER.eql(operator) && $UNDETERMINED.eql(topic)) {
                        message = $str_alt85$Sorry__I_must_insist_that_you_spe;
                    }


            if (NIL != message) {
                user_interaction_agenda.uia_act_new_acknowledge_message(v_agenda, message);
            }
        }
        return parent;
    }

    public static final SubLObject uiat_initializer_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject language = uia_setup_state.uia_language(v_agenda);
            SubLObject user = uia_setup_state.uia_user(v_agenda);
            if (($UNDETERMINED == language) || ($UNDETERMINED == user)) {
                {
                    SubLObject user_modeler_action = uia_act_new_user_modeler(v_agenda, $REQUIRED);
                    user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, user_modeler_action);
                    return user_interaction_agenda.uia_generate_next_request(v_agenda);
                }
            }
            {
                SubLObject topic = uia_setup_state.uia_topic(v_agenda);
                if ($UNDETERMINED == topic) {
                    {
                        SubLObject topic_specifier_action = uia_act_new_topic_specifier(v_agenda, $REQUIRED);
                        user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, topic_specifier_action);
                        return user_interaction_agenda.uia_generate_next_request(v_agenda);
                    }
                }
            }
            if ($FALSE == user_interaction_agenda.ui_state_lookup(interaction, $kw82$SETUP_ATTEMPTED_, $FALSE)) {
                uiat_initializer_spawn_setup_thread(interaction, v_agenda);
                return user_interaction_agenda.uia_generate_next_request(v_agenda);
            }
            if (NIL == uia_setup_state.uia_setup_completeP(v_agenda)) {
                user_interaction_agenda.ui_state_clear(interaction, $kw82$SETUP_ATTEMPTED_);
                {
                    SubLObject domain_mt = user_interaction_agenda.uia_domain_mt(v_agenda);
                    SubLObject parsing_mt = user_interaction_agenda.uia_parsing_interaction_mt(v_agenda);
                    SubLObject generation_mt = user_interaction_agenda.uia_generation_interaction_mt(v_agenda, UNPROVIDED);
                    SubLObject message = NIL;
                    if ($UNDETERMINED.eql(domain_mt)) {
                        message = $str_alt87$Sorry__I_don_t_know_how_to_discus;
                        user_interaction_agenda.uia_state_clear(v_agenda, $TOPIC);
                    } else
                        if ($UNDETERMINED.eql(parsing_mt) || $UNDETERMINED.eql(generation_mt)) {
                            message = $str_alt88$Sorry__I_don_t_know_how_to_discus;
                            user_interaction_agenda.uia_state_clear(v_agenda, $TOPIC);
                        } else {
                            message = $str_alt89$Error__Inconsistent_state_;
                        }

                    {
                        SubLObject message_action = user_interaction_agenda.uia_act_new_acknowledge_message(v_agenda, message);
                        user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, message_action);
                        return user_interaction_agenda.uia_generate_next_request(v_agenda);
                    }
                }
            }
            user_interaction_agenda.uia_act_complete(v_agenda, interaction, $DONE);
            cb_user_interaction_agenda.cb_uia_launchers_refresh_script();
            cb_user_interaction_agenda.cb_uia_command_interpreter_refresh_script();
            if (user_interaction_agenda.ui_state_lookup(interaction, $kw81$CONTINUED_PREVIOUS_WORK_, $FALSE) == $TRUE) {
                uia_tools_review_and_testing.uiat_act_new_knowledge_reviewer(v_agenda, $REQUIRED, UNPROVIDED);
            }
            return user_interaction_agenda.uia_generate_next_request(v_agenda);
        }
    }

    /**
     * Spawn the child process that will actually perform the initialization.
     */
    public static final SubLObject uiat_initializer_spawn_setup_thread(SubLObject interaction, SubLObject v_agenda) {
        uia_tools_basic.uia_act_new_thinking_child(interaction, UIAT_INITIALIZER_PERFORM_INITIALIZATION, list(v_agenda, operation_communication.the_cyclist()), UNPROVIDED, UNPROVIDED);
        user_interaction_agenda.ui_state_update(interaction, $kw82$SETUP_ATTEMPTED_, $TRUE);
        sleep(ONE_INTEGER);
        return interaction;
    }

    public static final SubLObject uiat_initializer_perform_initialization(SubLObject v_agenda, SubLObject cyclist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                try {
                    api_control_vars.$the_cyclist$.bind(cyclist, thread);
                    {
                        SubLObject tool_cycl = uia_tool_declaration.ui_operator_cycl($INITIALIZER);
                        {
                            SubLObject _prev_bind_0_22 = rkf_macros.$rkf_asserting_tool$.currentBinding(thread);
                            try {
                                rkf_macros.$rkf_asserting_tool$.bind(tool_cycl, thread);
                                uia_tools_basic.uiat_thinking_note_progress_message($str_alt91$Constructing_knowledge_engineerin, UNPROVIDED);
                                uia_setup_state.uia_compute_setup_state(v_agenda);
                            } finally {
                                rkf_macros.$rkf_asserting_tool$.rebind(_prev_bind_0_22, thread);
                            }
                        }
                    }
                } finally {
                    api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                }
            }
            return v_agenda;
        }
    }

    public static final SubLObject uiat_initializer_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt4);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt4);
            action_type = current.first();
            current = current.rest();
            temp_plist = current;
            {
                SubLObject signature = getf(temp_plist, $SIGNATURE, UNPROVIDED);
                SubLObject agenda_signature = getf(temp_plist, $AGENDA_SIGNATURE, UNPROVIDED);
                SubLObject plist = remf(remf(copy_list(temp_plist), $SIGNATURE), $AGENDA_SIGNATURE);
                SubLObject interaction = (NIL != signature) ? ((SubLObject) (user_interaction_agenda.find_ui_by_signature(signature))) : NIL;
                SubLObject v_agenda = (NIL != interaction) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : user_interaction_agenda.find_uia_by_signature(agenda_signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($LAUNCH)) {
                    {
                        SubLObject datum_23 = plist;
                        SubLObject current_24 = datum_23;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_24;
                        SubLObject bad = NIL;
                        SubLObject current_25 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_23, $list_alt93);
                            current_25 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_23, $list_alt93);
                            if (NIL == member(current_25, $list_alt94, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_25 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_23, $list_alt93);
                        }
                        {
                            SubLObject mode_tail = property_list_member($MODE, current_24);
                            SubLObject mode = (NIL != mode_tail) ? ((SubLObject) (cadr(mode_tail))) : $REQUIRED;
                            uia_act_new_initializer(v_agenda, mode);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject declare_uia_tools_setup_file() {
        declareFunction("uia_act_new_configure_interface", "UIA-ACT-NEW-CONFIGURE-INTERFACE", 1, 0, false);
        declareFunction("uiat_configure_interface_generate_request", "UIAT-CONFIGURE-INTERFACE-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_configure_interface_handle_reply", "UIAT-CONFIGURE-INTERFACE-HANDLE-REPLY", 1, 0, false);
        declareFunction("uia_act_new_user_modeler", "UIA-ACT-NEW-USER-MODELER", 2, 0, false);
        declareFunction("uiat_user_modeler_child_completed", "UIAT-USER-MODELER-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_user_modeler_generate_request", "UIAT-USER-MODELER-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_user_modeler_handle_reply", "UIAT-USER-MODELER-HANDLE-REPLY", 1, 0, false);
        declareFunction("uiat_user_modeler_user_applicable_language_prompts", "UIAT-USER-MODELER-USER-APPLICABLE-LANGUAGE-PROMPTS", 1, 0, false);
        declareFunction("uiat_user_modeler_determine_languages_and_prompts", "UIAT-USER-MODELER-DETERMINE-LANGUAGES-AND-PROMPTS", 1, 0, false);
        declareFunction("uiat_user_modeler_language_prompt_language", "UIAT-USER-MODELER-LANGUAGE-PROMPT-LANGUAGE", 1, 0, false);
        declareFunction("uiat_user_modeler_determine_language", "UIAT-USER-MODELER-DETERMINE-LANGUAGE", 1, 0, false);
        declareFunction("uiat_user_modeler_read_user", "UIAT-USER-MODELER-READ-USER", 2, 0, false);
        declareFunction("uiat_user_modeler_update_user", "UIAT-USER-MODELER-UPDATE-USER", 2, 0, false);
        declareFunction("uiat_user_modeler_determine_languages", "UIAT-USER-MODELER-DETERMINE-LANGUAGES", 1, 0, false);
        declareFunction("uiat_user_modeler_set_language_of_choice", "UIAT-USER-MODELER-SET-LANGUAGE-OF-CHOICE", 2, 0, false);
        declareFunction("uia_act_new_topic_specifier", "UIA-ACT-NEW-TOPIC-SPECIFIER", 2, 0, false);
        declareFunction("uiat_topic_specifier_child_completed", "UIAT-TOPIC-SPECIFIER-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_topic_specifier_generate_request", "UIAT-TOPIC-SPECIFIER-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_topic_specifier_get_some_topics", "UIAT-TOPIC-SPECIFIER-GET-SOME-TOPICS", 1, 0, false);
        declareFunction("uiat_topic_specifier_handle_reply", "UIAT-TOPIC-SPECIFIER-HANDLE-REPLY", 1, 0, false);
        declareFunction("uiat_topic_specifier_read_topic", "UIAT-TOPIC-SPECIFIER-READ-TOPIC", 2, 0, false);
        declareFunction("uiat_topic_specifier_available_topics", "UIAT-TOPIC-SPECIFIER-AVAILABLE-TOPICS", 1, 0, false);
        declareFunction("uiat_topic_specifier_build_old_topic_list", "UIAT-TOPIC-SPECIFIER-BUILD-OLD-TOPIC-LIST", 2, 0, false);
        declareFunction("uiat_topic_specifier_get_aborted_agendas", "UIAT-TOPIC-SPECIFIER-GET-ABORTED-AGENDAS", 1, 0, false);
        declareFunction("uiat_topic_specifier_aborted_agenda_detector", "UIAT-TOPIC-SPECIFIER-ABORTED-AGENDA-DETECTOR", 1, 0, false);
        declareFunction("uiat_topic_specifier_resume_old_conversation", "UIAT-TOPIC-SPECIFIER-RESUME-OLD-CONVERSATION", 2, 0, false);
        declareFunction("uia_act_new_initializer", "UIA-ACT-NEW-INITIALIZER", 2, 0, false);
        declareFunction("uiat_initializer_child_invalidated", "UIAT-INITIALIZER-CHILD-INVALIDATED", 2, 0, false);
        declareFunction("uiat_initializer_child_completed", "UIAT-INITIALIZER-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_initializer_child_rejected", "UIAT-INITIALIZER-CHILD-REJECTED", 2, 0, false);
        declareFunction("uiat_initializer_generate_request", "UIAT-INITIALIZER-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_initializer_spawn_setup_thread", "UIAT-INITIALIZER-SPAWN-SETUP-THREAD", 2, 0, false);
        declareFunction("uiat_initializer_perform_initialization", "UIAT-INITIALIZER-PERFORM-INITIALIZATION", 2, 0, false);
        declareFunction("uiat_initializer_handle_reply", "UIAT-INITIALIZER-HANDLE-REPLY", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_uia_tools_setup_file() {
        deflexical("*UIAT-AGENDA-STATE-FILEMASK*", $str_alt40$_cfasl);
        return NIL;
    }

    public static final SubLObject setup_uia_tools_setup_file() {
                uia_tool_declaration.declare_uia_tool($CONFIGURE_INTERFACE, $list_alt1);
        uia_tool_declaration.declare_uia_tool($USER_MODELER, $list_alt10);
        uia_tool_declaration.declare_uia_tool($TOPIC_SPECIFIER, $list_alt42);
        uia_tool_declaration.declare_uia_tool($INITIALIZER, $list_alt79);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol $CONFIGURE_INTERFACE = makeKeyword("CONFIGURE-INTERFACE");

    static private final SubLList $list_alt1 = list($NAME, makeString("Configure Interface"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-CONFIGURE-INTERFACE-GENERATE-REQUEST"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-CONFIGURE-INTERFACE-HANDLE-REPLY"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycConfigureInterfaceTool")));





    static private final SubLList $list_alt4 = listS(makeUninternedSymbol("OPERATOR"), makeSymbol("ACTION-TYPE"), makeUninternedSymbol("TEMP-PLIST"));









    private static final SubLSymbol $USER_MODELER = makeKeyword("USER-MODELER");

    static private final SubLList $list_alt10 = list(new SubLObject[]{ $NAME, makeString("User Modeler"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-USER-MODELER-CHILD-COMPLETED"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-USER-MODELER-GENERATE-REQUEST"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-USER-MODELER-HANDLE-REPLY"), makeKeyword("HINT-NAME"), makeString("Gather User Info"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycUserModeler")) });

    private static final SubLSymbol $DISAMBIGUATE_PHRASE = makeKeyword("DISAMBIGUATE-PHRASE");





    private static final SubLSymbol $SPECIFY_USER = makeKeyword("SPECIFY-USER");

    private static final SubLSymbol $CB_USER = makeKeyword("CB-USER");

    private static final SubLSymbol $SPECIFY_LANGUAGE = makeKeyword("SPECIFY-LANGUAGE");

    private static final SubLSymbol $LANGUAGE_PROMPTS = makeKeyword("LANGUAGE-PROMPTS");

    private static final SubLSymbol $USER_LANGUAGES = makeKeyword("USER-LANGUAGES");

    public static final SubLObject $$EnglishLanguage = constant_handles.reader_make_constant_shell(makeString("EnglishLanguage"));

    private static final SubLSymbol $MODIFY = makeKeyword("MODIFY");





    private static final SubLSymbol $CAN_CHANGE_LANGUAGE = makeKeyword("CAN-CHANGE-LANGUAGE");

    private static final SubLSymbol $CAN_CHANGE_USER = makeKeyword("CAN-CHANGE-USER");

    private static final SubLSymbol $CLARIFY_LINKS = makeKeyword("CLARIFY-LINKS");



    static private final SubLList $list_alt27 = list(makeSymbol("&KEY"), makeSymbol("LANGUAGE"));

    static private final SubLList $list_alt28 = list(makeKeyword("LANGUAGE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLList $list_alt30 = list(makeSymbol("&KEY"), makeSymbol("USER"));

    static private final SubLList $list_alt31 = list($USER);

    static private final SubLString $str_alt32$Error____A_is_not_a_known_cyclist = makeString("Error : ~A is not a known cyclist.");

    static private final SubLList $list_alt33 = list(makeSymbol("CYCLIST"));

    static private final SubLList $list_alt34 = list(makeSymbol("&KEY"), makeSymbol("CHANGE"));

    static private final SubLList $list_alt35 = list(makeKeyword("CHANGE"));



    private static final SubLSymbol UIAT_USER_MODELER_LANGUAGE_PROMPT_LANGUAGE = makeSymbol("UIAT-USER-MODELER-LANGUAGE-PROMPT-LANGUAGE");

    public static final SubLObject $$CyclistsMt = constant_handles.reader_make_constant_shell(makeString("CyclistsMt"));



    static private final SubLString $str_alt40$_cfasl = makeString(".cfasl");

    private static final SubLSymbol $TOPIC_SPECIFIER = makeKeyword("TOPIC-SPECIFIER");

    static private final SubLList $list_alt42 = list(new SubLObject[]{ $NAME, makeString("Specify the Topic"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-TOPIC-SPECIFIER-CHILD-COMPLETED"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-TOPIC-SPECIFIER-GENERATE-REQUEST"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-TOPIC-SPECIFIER-HANDLE-REPLY"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycTopicSpecifier")) });

    private static final SubLSymbol $FILE_BROWSER = makeKeyword("FILE-BROWSER");







    public static final SubLSymbol $kw47$TRIED_OFFERING_RESTART_ = makeKeyword("TRIED-OFFERING-RESTART?");

    private static final SubLSymbol $DEFAULT_TOPIC = makeKeyword("DEFAULT-TOPIC");

    private static final SubLSymbol $CURRENT_TOPIC = makeKeyword("CURRENT-TOPIC");

    private static final SubLSymbol $CURRENT_TOPIC_NAME = makeKeyword("CURRENT-TOPIC-NAME");

    private static final SubLSymbol $COOL_TOPICS = makeKeyword("COOL-TOPICS");

    private static final SubLSymbol $OTHER_TOPICS = makeKeyword("OTHER-TOPICS");

    private static final SubLSymbol $OLD_TOPIC_LIST = makeKeyword("OLD-TOPIC-LIST");

    private static final SubLSymbol $OFFER_RESTART = makeKeyword("OFFER-RESTART");

    static private final SubLString $str_alt55$Sorry__I_don_t_understand_what_yo = makeString("Sorry, I don't understand what you mean by '~a'.");

    private static final SubLSymbol $CYC_TO_USER = makeKeyword("CYC-TO-USER");







    static private final SubLList $list_alt60 = list(makeSymbol("&KEY"), makeSymbol("TOPIC"));

    static private final SubLList $list_alt61 = list(makeKeyword("TOPIC"));

    private static final SubLSymbol $IGNORE_OLD_TOPIC = makeKeyword("IGNORE-OLD-TOPIC");

    private static final SubLSymbol $RESUME_TOPIC = makeKeyword("RESUME-TOPIC");

    static private final SubLList $list_alt64 = list(makeSymbol("&KEY"), makeSymbol("AGENDA-ID"));

    static private final SubLList $list_alt65 = list(makeKeyword("AGENDA-ID"));

    private static final SubLSymbol $AGENDA_ID = makeKeyword("AGENDA-ID");

    private static final SubLSymbol $RESUME_OLD_TOPIC = makeKeyword("RESUME-OLD-TOPIC");

    static private final SubLList $list_alt68 = list(makeSymbol("&KEY"), makeSymbol("INTERACTION-MT"));

    static private final SubLList $list_alt69 = list(makeKeyword("INTERACTION-MT"));



    private static final SubLSymbol $STAY_ON_TOPIC = makeKeyword("STAY-ON-TOPIC");

    private static final SubLSymbol $LOAD_REQUEST = makeKeyword("LOAD-REQUEST");

    static private final SubLString $str_alt73$_ = makeString(".");

    private static final SubLSymbol $TOPIC_NAME = makeKeyword("TOPIC-NAME");

    private static final SubLSymbol $DOMAIN_INTERACTION_MT = makeKeyword("DOMAIN-INTERACTION-MT");

    private static final SubLSymbol $OLD_SESSIONS = makeKeyword("OLD-SESSIONS");

    private static final SubLSymbol $ACTIVE_SESSIONS = makeKeyword("ACTIVE-SESSIONS");



    static private final SubLList $list_alt79 = list(new SubLObject[]{ $NAME, makeString("Initializer"), makeKeyword("CHILD-INVALIDATED-METHOD"), makeSymbol("UIAT-INITIALIZER-CHILD-INVALIDATED"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-INITIALIZER-CHILD-COMPLETED"), makeKeyword("CHILD-REJECTED-METHOD"), makeSymbol("UIAT-INITIALIZER-CHILD-REJECTED"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-INITIALIZER-GENERATE-REQUEST"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-INITIALIZER-HANDLE-REPLY"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycUIAInitializerTool")) });

    static private final SubLList $list_alt80 = list(makeSymbol("MODUS"), makeSymbol("ANSWER"));

    public static final SubLSymbol $kw81$CONTINUED_PREVIOUS_WORK_ = makeKeyword("CONTINUED-PREVIOUS-WORK?");

    public static final SubLSymbol $kw82$SETUP_ATTEMPTED_ = makeKeyword("SETUP-ATTEMPTED?");

    static private final SubLString $str_alt83$Sorry__I_must_insist_that_you_cho = makeString("Sorry, I must insist that you choose a language.");

    static private final SubLString $str_alt84$Sorry__I_must_insist_that_you_ide = makeString("Sorry, I must insist that you identify yourself.");

    static private final SubLString $str_alt85$Sorry__I_must_insist_that_you_spe = makeString("Sorry, I must insist that you specify a topic.");



    static private final SubLString $str_alt87$Sorry__I_don_t_know_how_to_discus = makeString("Sorry, I don't know how to discuss that topic.");

    static private final SubLString $str_alt88$Sorry__I_don_t_know_how_to_discus = makeString("Sorry, I don't know how to discuss that topic in the language you selected.");

    static private final SubLString $str_alt89$Error__Inconsistent_state_ = makeString("Error: Inconsistent state.");

    private static final SubLSymbol UIAT_INITIALIZER_PERFORM_INITIALIZATION = makeSymbol("UIAT-INITIALIZER-PERFORM-INITIALIZATION");

    static private final SubLString $str_alt91$Constructing_knowledge_engineerin = makeString("Constructing knowledge engineering space; see 'My Thoughts' for details.");

    private static final SubLSymbol $LAUNCH = makeKeyword("LAUNCH");

    static private final SubLList $list_alt93 = list(makeSymbol("&KEY"), list(makeSymbol("MODE"), makeKeyword("REQUIRED")));

    static private final SubLList $list_alt94 = list($MODE);



    // // Initializers
    public void declareFunctions() {
        declare_uia_tools_setup_file();
    }

    public void initializeVariables() {
        init_uia_tools_setup_file();
    }

    public void runTopLevelForms() {
        setup_uia_tools_setup_file();
    }
}

