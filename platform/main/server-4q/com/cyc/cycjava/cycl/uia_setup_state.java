/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.ask_utilities;
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
 *  module:      UIA-SETUP-STATE
 *  source file: /cyc/top/cycl/uia-setup-state.lisp
 *  created:     2019/07/03 17:37:57
 */
public final class uia_setup_state extends SubLTranslatedFile implements V02 {
    // // Constructor
    private uia_setup_state() {
    }

    public static final SubLFile me = new uia_setup_state();


    // // Definitions
    /**
     *
     *
     * @return boolean; t iff all necessary setup properties are in the state of AGENDA.
     */
    public static final SubLObject uia_setup_completeP(SubLObject v_agenda) {
        return eql($TRUE, user_interaction_agenda.uia_state_lookup(v_agenda, $SETUP_COMPLETE, $FALSE));
    }

    /**
     * Return the language used in META-AGENDA.
     */
    public static final SubLObject uima_language(SubLObject meta_agenda) {
        return user_interaction_agenda.uima_state_lookup(meta_agenda, $LANGUAGE, $UNDETERMINED);
    }

    /**
     * Return the language used in AGENDA.
     */
    public static final SubLObject uia_language(SubLObject v_agenda) {
        return uima_language(user_interaction_agenda.uia_meta_agenda(v_agenda));
    }

    /**
     * Note that LANGUAGE is the language to be used in AGENDA.
     */
    public static final SubLObject uia_language_update(SubLObject v_agenda, SubLObject language) {
        return user_interaction_agenda.uima_state_update(user_interaction_agenda.uia_meta_agenda(v_agenda), $LANGUAGE, language);
    }

    /**
     * Return the user associated with META-AGENDA.
     */
    public static final SubLObject uima_user(SubLObject meta_agenda) {
        return user_interaction_agenda.uima_state_lookup(meta_agenda, $USER, $UNDETERMINED);
    }

    /**
     * Return the user associated with AGENDA.
     */
    public static final SubLObject uia_user(SubLObject v_agenda) {
        return uima_user(user_interaction_agenda.uia_meta_agenda(v_agenda));
    }

    /**
     * Note that USER is the user associated with AGENDA.
     */
    public static final SubLObject uia_user_update(SubLObject v_agenda, SubLObject user) {
        return user_interaction_agenda.uima_state_update(user_interaction_agenda.uia_meta_agenda(v_agenda), $USER, user);
    }

    /**
     * Return the topic of AGENDA.
     */
    public static final SubLObject uia_topic(SubLObject v_agenda) {
        return user_interaction_agenda.uia_state_lookup(v_agenda, $TOPIC, $UNDETERMINED);
    }

    /**
     * Note that TOPIC is the topic of AGENDA.
     */
    public static final SubLObject uia_topic_update(SubLObject v_agenda, SubLObject topic) {
        return user_interaction_agenda.uia_state_update(v_agenda, $TOPIC, topic);
    }

    /**
     * Updates the state of AGENDA with all relevant setup properties,
     * including language, topic, domain, parsing, and generation state information.
     *
     * @return :true or :false; whether all state computations succeeded.
    Also updates the :setup-complete property of AGENDA's state with :true or :false.
     */
    public static final SubLObject uia_compute_setup_state(SubLObject v_agenda) {
        {
            SubLObject num_failures = ZERO_INTEGER;
            if (NIL == uia_compute_setup_state_wrt_language(v_agenda)) {
                uia_mumbler.uia_mumble(v_agenda, $str_alt7$Problems_encountered_initializing);
                num_failures = add(num_failures, ONE_INTEGER);
            }
            if (NIL == uia_compute_setup_state_wrt_topic(v_agenda)) {
                uia_mumbler.uia_mumble(v_agenda, $str_alt8$Problems_encountered_initializing);
                num_failures = add(num_failures, ONE_INTEGER);
            }
            if (NIL == uia_compute_setup_state_interaction_mts(v_agenda)) {
                uia_mumbler.uia_mumble(v_agenda, $str_alt9$Problems_encountered_initializing);
                num_failures = add(num_failures, ONE_INTEGER);
            }
            if (num_failures.isZero()) {
                uia_mumbler.uia_mumble_important(v_agenda, $str_alt10$Kraken_initialization_is_complete);
                uia_note_setup_state_complete(v_agenda);
                uia_tools_salient_descriptor.uia_act_new_salient_descriptor(v_agenda, $REQUIRED, $str_alt12$, user_interaction_agenda.uia_domain_interaction_mt(v_agenda));
                return $TRUE;
            } else {
                uia_mumbler.uia_mumble_important(v_agenda, $str_alt13$Kraken_initialization_failed_);
                return $FALSE;
            }
        }
    }

    public static final SubLObject uia_note_setup_state_complete(SubLObject v_agenda) {
        return user_interaction_agenda.uia_state_update(v_agenda, $SETUP_COMPLETE, $TRUE);
    }

    public static final SubLObject uia_note_setup_state_incomplete(SubLObject v_agenda) {
        return user_interaction_agenda.uia_state_update(v_agenda, $SETUP_COMPLETE, $FALSE);
    }

    /**
     * Updates all the language-dependent setup properties of AGENDA.
     * Return T iff all state computations succeeded.
     */
    public static final SubLObject uia_compute_setup_state_wrt_language(SubLObject v_agenda) {
        {
            SubLObject num_failures = ZERO_INTEGER;
            uia_mumbler.uia_mumble(v_agenda, $str_alt14$Identifying_language_specific_gra);
            if (NIL == uia_compute_language_parsing_mt(v_agenda)) {
                uia_mumbler.uia_mumble(v_agenda, $str_alt15$Problems_encountered_initializing);
                num_failures = add(num_failures, ONE_INTEGER);
            }
            uia_mumbler.uia_mumble(v_agenda, $str_alt16$Identifying_language_specific_gra);
            if (NIL == uia_compute_language_generation_mt(v_agenda)) {
                uia_mumbler.uia_mumble(v_agenda, $str_alt17$Problems_encountered_initializing);
                num_failures = add(num_failures, ONE_INTEGER);
            }
            uia_mumbler.uia_mumble(v_agenda, $str_alt18$Identifying_language_specific_dic);
            if (NIL == uia_compute_language_lexical_mt(v_agenda)) {
                uia_mumbler.uia_mumble(v_agenda, $str_alt19$Problems_encountered_initializing);
                num_failures = add(num_failures, ONE_INTEGER);
            }
            return zerop(num_failures);
        }
    }

    /**
     * Updates all the topic-dependent setup properties of AGENDA.
     * Return T iff all state computations succeeded.
     */
    public static final SubLObject uia_compute_setup_state_wrt_topic(SubLObject v_agenda) {
        {
            SubLObject num_failures = ZERO_INTEGER;
            SubLObject topic_string = $$$selected_topic;
            SubLObject message = NIL;
            message = cconcatenate($str_alt21$Identifying_topic_and_determining, new SubLObject[]{ topic_string, $str_alt22$_ });
            uia_mumbler.uia_mumble(v_agenda, message);
            if (NIL == uia_compute_domain_mt(v_agenda)) {
                uia_mumbler.uia_mumble(v_agenda, $str_alt23$Problems_encountered_initializing);
                num_failures = add(num_failures, ONE_INTEGER);
            }
            message = cconcatenate($str_alt24$Locating_parsing_terminology_for_, new SubLObject[]{ topic_string, $str_alt22$_ });
            uia_mumbler.uia_mumble(v_agenda, message);
            if (NIL == uia_compute_parsing_mt(v_agenda)) {
                uia_mumbler.uia_mumble(v_agenda, $str_alt25$Problems_encountered_initializing);
                num_failures = add(num_failures, ONE_INTEGER);
            }
            message = cconcatenate($str_alt26$Locating_generation_terminology_f, new SubLObject[]{ topic_string, $str_alt22$_ });
            uia_mumbler.uia_mumble(v_agenda, message);
            if (NIL == uia_compute_generation_mt(v_agenda)) {
                uia_mumbler.uia_mumble(v_agenda, $str_alt27$Problems_encountered_initializing);
                num_failures = add(num_failures, ONE_INTEGER);
            }
            return zerop(num_failures);
        }
    }

    /**
     * Updates all the interaction mt setup properties of AGENDA.
     * Return T iff all state computations succeeded.
     */
    public static final SubLObject uia_compute_setup_state_interaction_mts(SubLObject v_agenda) {
        {
            SubLObject num_failures = ZERO_INTEGER;
            uia_mumbler.uia_mumble(v_agenda, $str_alt28$Preparing_space_for_temporary_sto);
            if (NIL == uia_compute_domain_interaction_mt(v_agenda)) {
                uia_mumbler.uia_mumble(v_agenda, $str_alt29$Problems_encountered_preparing_sp);
                num_failures = add(num_failures, ONE_INTEGER);
            }
            uia_mumbler.uia_mumble(v_agenda, $str_alt30$Preparing_space_for_temporary_sto);
            if (NIL == uia_compute_lexical_interaction_mt(v_agenda)) {
                uia_mumbler.uia_mumble(v_agenda, $str_alt31$Problems_encountered_preparing_sp);
                num_failures = add(num_failures, ONE_INTEGER);
            }
            uia_mumbler.uia_mumble(v_agenda, $str_alt32$Preparing_space_for_temporary_sto);
            if (NIL == uia_compute_parsing_interaction_mt(v_agenda)) {
                uia_mumbler.uia_mumble(v_agenda, $str_alt33$Problems_encountered_preparing_sp);
                num_failures = add(num_failures, ONE_INTEGER);
            }
            uia_mumbler.uia_mumble(v_agenda, $str_alt34$Preparing_space_for_temporary_sto);
            if (NIL == uia_compute_generation_interaction_mt(v_agenda)) {
                uia_mumbler.uia_mumble(v_agenda, $str_alt35$Problems_encountered_preparing_sp);
                num_failures = add(num_failures, ONE_INTEGER);
            }
            uia_mumbler.uia_mumble(v_agenda, $str_alt36$Naming_spaces_for_temporary_stora);
            if (NIL == uia_lexify_interaction_mts(v_agenda)) {
                uia_mumbler.uia_mumble(v_agenda, $str_alt37$Problems_encountered_naming_space);
                num_failures = add(num_failures, ONE_INTEGER);
            }
            return zerop(num_failures);
        }
    }

    /**
     * Updates the state of AGENDA wrt the property :language-parsing-mt,
     * if :language has already been set.
     */
    public static final SubLObject uia_compute_language_parsing_mt(SubLObject v_agenda) {
        {
            SubLObject language = uia_language(v_agenda);
            if ($UNDETERMINED.eql(language)) {
                uia_mumbler.uia_mumble(v_agenda, $str_alt38$Language_is_undetermined__Couldn_);
                return NIL;
            } else {
                {
                    SubLObject language_parsing_mt = user_interaction_agenda.uia_language_parsing_mt(v_agenda);
                    if ($UNDETERMINED == language_parsing_mt) {
                        language_parsing_mt = uia_determine_language_parsing_mt(language);
                        if (NIL != language_parsing_mt) {
                            user_interaction_agenda.uia_language_parsing_mt_update(v_agenda, language_parsing_mt);
                        }
                    }
                    return language_parsing_mt;
                }
            }
        }
    }

    public static final SubLObject uia_determine_language_parsing_mt(SubLObject language) {
        return rkf_context_tools.rkf_determine_language_parsing_mt(language);
    }

    /**
     * Updates the state of AGENDA wrt the property :language-generation-mt,
     * if :language has already been set.
     */
    public static final SubLObject uia_compute_language_generation_mt(SubLObject v_agenda) {
        {
            SubLObject language = uia_language(v_agenda);
            if ($UNDETERMINED.eql(language)) {
                uia_mumbler.uia_mumble(v_agenda, $str_alt39$Language_is_undetermined__Couldn_);
                return NIL;
            } else {
                {
                    SubLObject language_generation_mt = user_interaction_agenda.uia_language_generation_mt(v_agenda);
                    if ($UNDETERMINED == language_generation_mt) {
                        language_generation_mt = uia_determine_language_generation_mt(language);
                        if (NIL != language_generation_mt) {
                            user_interaction_agenda.uia_language_generation_mt_update(v_agenda, language_generation_mt);
                        }
                    }
                    return language_generation_mt;
                }
            }
        }
    }

    public static final SubLObject uia_determine_language_generation_mt(SubLObject language) {
        return rkf_context_tools.rkf_determine_language_generation_mt(language);
    }

    /**
     * Updates the state of AGENDA wrt the property :language-lexical-mt,
     * if :language has already been set.
     */
    public static final SubLObject uia_compute_language_lexical_mt(SubLObject v_agenda) {
        {
            SubLObject language = uia_language(v_agenda);
            if ($UNDETERMINED.eql(language)) {
                uia_mumbler.uia_mumble(v_agenda, $str_alt40$Language_is_undetermined__Couldn_);
                return NIL;
            } else {
                {
                    SubLObject language_lexical_mt = user_interaction_agenda.uia_language_lexical_mt(v_agenda);
                    if ($UNDETERMINED == language_lexical_mt) {
                        language_lexical_mt = uia_determine_language_lexical_mt(language);
                        if (NIL != language_lexical_mt) {
                            user_interaction_agenda.uia_language_lexical_mt_update(v_agenda, language_lexical_mt);
                        }
                    }
                    return language_lexical_mt;
                }
            }
        }
    }

    public static final SubLObject uia_determine_language_lexical_mt(SubLObject language) {
        return rkf_context_tools.rkf_determine_language_lexical_mt(language);
    }

    /**
     * Updates the state of AGENDA wrt the property :domain-mt,
     * if :topic has already been set.
     */
    public static final SubLObject uia_compute_domain_mt(SubLObject v_agenda) {
        {
            SubLObject topic = uia_topic(v_agenda);
            if ($UNDETERMINED.eql(topic)) {
                uia_mumbler.uia_mumble(v_agenda, $str_alt41$Topic_is_undetermined__Couldn_t_s);
                return NIL;
            } else {
                {
                    SubLObject domain_mt = user_interaction_agenda.uia_domain_mt(v_agenda);
                    if ($UNDETERMINED == domain_mt) {
                        domain_mt = uia_determine_domain_mt(v_agenda, topic);
                        if (NIL != domain_mt) {
                            user_interaction_agenda.uia_domain_mt_update(v_agenda, domain_mt);
                        }
                    }
                    return domain_mt;
                }
            }
        }
    }

    /**
     * BOOLEAN; Should we create new domain mts for topics that lack them?
     */
    // defparameter
    public static final SubLSymbol $uia_create_domain_mtsP$ = makeSymbol("*UIA-CREATE-DOMAIN-MTS?*");

    public static final SubLObject uia_determine_domain_mt(SubLObject v_agenda, SubLObject topic) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject existing = rkf_context_tools.rkf_determine_domain_mt(topic);
                if (NIL != existing) {
                    return existing;
                } else
                    if (NIL != $uia_create_domain_mtsP$.getDynamicValue(thread)) {
                        return uia_create_domain_mt(v_agenda, topic);
                    } else {
                        return NIL;
                    }

            }
        }
    }

    /**
     * Create a new domain mt for TOPIC.
     */
    public static final SubLObject uia_create_domain_mt(SubLObject v_agenda, SubLObject topic) {
        {
            SubLObject topic_name = (NIL != forts.fort_p(topic)) ? ((SubLObject) (kb_paths.fort_name(topic))) : $$$UnreifiedTerm;
            SubLObject mt_name = cconcatenate(topic_name, $str_alt43$_DemoEnvironmentMt);
            SubLObject mt = uia_trampolines.uia_create_concept(mt_name, mt_vars.$mt_mt$.getGlobalValue(), mt_vars.$assertible_mt_root$.getGlobalValue(), UNPROVIDED);
            uia_trampolines.uia_assert_exact(v_agenda, listS($$isa, mt, $list_alt45), mt_vars.$mt_mt$.getGlobalValue());
            uia_trampolines.uia_assert_exact(v_agenda, listS($$isa, mt, $list_alt46), mt_vars.$mt_mt$.getGlobalValue());
            uia_trampolines.uia_assert_exact(v_agenda, listS($$isa, mt, $list_alt47), mt_vars.$mt_mt$.getGlobalValue());
            uia_trampolines.uia_assert_exact(v_agenda, listS($$quotedIsa, mt, $list_alt49), mt_vars.$assertible_mt_root$.getGlobalValue());
            uia_trampolines.uia_assert_exact(v_agenda, listS($$genlMt, mt, $list_alt51), mt_vars.$mt_mt$.getGlobalValue());
            uia_trampolines.uia_assert_exact(v_agenda, list($$uiaDemoEnvironmentTopic, mt, topic), mt_vars.$assertible_mt_root$.getGlobalValue());
            uia_trampolines.uia_assert_exact(v_agenda, list($$mtRefinementDomainBasis, $$RKFParsingMt, mt), mt_vars.$assertible_mt_root$.getGlobalValue());
            uia_trampolines.uia_assert_exact(v_agenda, list($$mtRefinementDomainBasis, $$RKFParaphraseMt, mt), mt_vars.$assertible_mt_root$.getGlobalValue());
            return mt;
        }
    }

    /**
     * Updates the state of AGENDA wrt the property :parsing-mt,
     * if :language-parsing-mt and :domain-mt have already been set.
     * Might it, mayhap, create a parsing mt if no suitable one exists?
     * I imagine it might.
     */
    public static final SubLObject uia_compute_parsing_mt(SubLObject v_agenda) {
        {
            SubLObject language_parsing_mt = user_interaction_agenda.uia_language_parsing_mt(v_agenda);
            SubLObject domain_mt = user_interaction_agenda.uia_domain_mt(v_agenda);
            if ($UNDETERMINED.eql(language_parsing_mt)) {
                uia_mumbler.uia_mumble(v_agenda, $str_alt56$Language_specific_parsing_context);
                return NIL;
            } else
                if ($UNDETERMINED.eql(domain_mt)) {
                    uia_mumbler.uia_mumble(v_agenda, $str_alt57$Interaction_context_is_undetermin);
                    return NIL;
                } else {
                    {
                        SubLObject parsing_mt = user_interaction_agenda.uia_parsing_mt(v_agenda);
                        if ($UNDETERMINED == parsing_mt) {
                            parsing_mt = uia_determine_parsing_mt(language_parsing_mt, domain_mt);
                            if (NIL != parsing_mt) {
                                user_interaction_agenda.uia_parsing_mt_update(v_agenda, parsing_mt);
                            }
                        }
                        return parsing_mt;
                    }
                }

        }
    }

    public static final SubLObject uia_determine_parsing_mt(SubLObject language_parsing_mt, SubLObject domain_mt) {
        return rkf_context_tools.rkf_determine_language_domain_refinement_mt(language_parsing_mt, domain_mt);
    }

    /**
     * Updates the state of AGENDA wrt the property :generation-mt,
     * if :language-generation-mt and :domain-mt have already been set.
     * Might it, mayhap, create a parsing mt if no suitable one exists?
     * I imagine it might.
     */
    public static final SubLObject uia_compute_generation_mt(SubLObject v_agenda) {
        {
            SubLObject language_generation_mt = user_interaction_agenda.uia_language_generation_mt(v_agenda);
            SubLObject domain_mt = user_interaction_agenda.uia_domain_mt(v_agenda);
            if ($UNDETERMINED.eql(language_generation_mt)) {
                uia_mumbler.uia_mumble(v_agenda, $str_alt58$Language_specific_generation_cont);
                return NIL;
            } else
                if ($UNDETERMINED.eql(domain_mt)) {
                    uia_mumbler.uia_mumble(v_agenda, $str_alt59$Interaction_context_is_undetermin);
                    return NIL;
                } else {
                    {
                        SubLObject generation_mt = user_interaction_agenda.uia_generation_mt(v_agenda, UNPROVIDED);
                        if ($UNDETERMINED == generation_mt) {
                            generation_mt = uia_determine_generation_mt(language_generation_mt, domain_mt);
                            if (NIL != generation_mt) {
                                user_interaction_agenda.uia_generation_mt_update(v_agenda, generation_mt);
                            }
                        }
                        return generation_mt;
                    }
                }

        }
    }

    public static final SubLObject uia_determine_generation_mt(SubLObject language_generation_mt, SubLObject domain_mt) {
        return rkf_context_tools.rkf_determine_language_domain_refinement_mt(language_generation_mt, domain_mt);
    }

    /**
     * Updates the state of AGENDA wrt the property :domain-interaction-mt,
     * if :domain-mt has already been set.
     * Will create the interaction mt if necessary.
     */
    public static final SubLObject uia_compute_domain_interaction_mt(SubLObject v_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject domain_mt = user_interaction_agenda.uia_domain_mt(v_agenda);
                if ($UNDETERMINED.eql(domain_mt)) {
                    uia_mumbler.uia_mumble(v_agenda, $str_alt60$Agenda_topic_context_is_undetermi);
                    return NIL;
                } else {
                    {
                        SubLObject domain_interaction_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
                        if ($UNDETERMINED == domain_interaction_mt) {
                            {
                                SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
                                SubLObject local_state = state;
                                {
                                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                                    try {
                                        memoization_state.$memoization_state$.bind(local_state, thread);
                                        {
                                            final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
                                            try {
                                                domain_interaction_mt = uia_determine_domain_interaction_mt(domain_mt);
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0_1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                        }
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_1, thread);
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            user_interaction_agenda.uia_domain_interaction_mt_update(v_agenda, domain_interaction_mt);
                            user_interaction_agenda.uia_note_interaction_mt(v_agenda, domain_interaction_mt);
                        }
                        return domain_interaction_mt;
                    }
                }
            }
        }
    }

    public static final SubLObject uia_determine_domain_interaction_mt_internal(SubLObject domain_mt) {
        return rkf_context_tools.rkf_create_interaction_context(domain_mt);
    }

    public static final SubLObject uia_determine_domain_interaction_mt(SubLObject domain_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return uia_determine_domain_interaction_mt_internal(domain_mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_DETERMINE_DOMAIN_INTERACTION_MT, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_DETERMINE_DOMAIN_INTERACTION_MT, ONE_INTEGER, NIL, EQL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, UIA_DETERMINE_DOMAIN_INTERACTION_MT, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, domain_mt, $kw63$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw63$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_determine_domain_interaction_mt_internal(domain_mt)));
                        memoization_state.caching_state_put(caching_state, domain_mt, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    /**
     * Updates the state of the AGENDA wrt with property :parsing-interaction-mt
     * if :domain-interaction-mt and :parsing-mt have been set, by creating
     * a new interaction mt.
     */
    public static final SubLObject uia_compute_parsing_interaction_mt(SubLObject v_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject domain_interaction_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
                SubLObject lexical_interaction_mt = user_interaction_agenda.uia_lexical_interaction_mt(v_agenda);
                SubLObject parsing_mt = user_interaction_agenda.uia_parsing_mt(v_agenda);
                if (!(($UNDETERMINED.eql(domain_interaction_mt) || $UNDETERMINED.eql(lexical_interaction_mt)) || $UNDETERMINED.eql(parsing_mt))) {
                    {
                        SubLObject parsing_interaction_mt = user_interaction_agenda.uia_parsing_interaction_mt(v_agenda);
                        if ($UNDETERMINED == parsing_interaction_mt) {
                            {
                                SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
                                SubLObject local_state = state;
                                {
                                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                                    try {
                                        memoization_state.$memoization_state$.bind(local_state, thread);
                                        {
                                            final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
                                            try {
                                                parsing_interaction_mt = uia_determine_parsing_interaction_mt(domain_interaction_mt, parsing_mt, lexical_interaction_mt);
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                        }
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_2, thread);
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            user_interaction_agenda.uia_parsing_interaction_mt_update(v_agenda, parsing_interaction_mt);
                            user_interaction_agenda.uia_note_interaction_mt(v_agenda, parsing_interaction_mt);
                        }
                        return parsing_interaction_mt;
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject uia_determine_parsing_interaction_mt_internal(SubLObject domain_interaction_mt, SubLObject parsing_mt, SubLObject lexical_interaction_mt) {
        return rkf_context_tools.rkf_create_parsing_interaction_context(domain_interaction_mt, parsing_mt, lexical_interaction_mt);
    }

    public static final SubLObject uia_determine_parsing_interaction_mt(SubLObject domain_interaction_mt, SubLObject parsing_mt, SubLObject lexical_interaction_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return uia_determine_parsing_interaction_mt_internal(domain_interaction_mt, parsing_mt, lexical_interaction_mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_DETERMINE_PARSING_INTERACTION_MT, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_DETERMINE_PARSING_INTERACTION_MT, THREE_INTEGER, NIL, EQL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, UIA_DETERMINE_PARSING_INTERACTION_MT, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(domain_interaction_mt, parsing_mt, lexical_interaction_mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw63$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (domain_interaction_mt.eql(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (parsing_mt.eql(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && lexical_interaction_mt.eql(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_determine_parsing_interaction_mt_internal(domain_interaction_mt, parsing_mt, lexical_interaction_mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(domain_interaction_mt, parsing_mt, lexical_interaction_mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    /**
     * Updates the state of the AGENDA wrt with property :generation-interaction-mt
     * if :domain-interaction-mt and :generation-mt have been set, by creating
     * a new interaction mt.
     */
    public static final SubLObject uia_compute_generation_interaction_mt(SubLObject v_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject domain_interaction_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
                SubLObject lexical_interaction_mt = user_interaction_agenda.uia_lexical_interaction_mt(v_agenda);
                SubLObject generation_mt = user_interaction_agenda.uia_generation_mt(v_agenda, UNPROVIDED);
                if (!(($UNDETERMINED.eql(domain_interaction_mt) || $UNDETERMINED.eql(lexical_interaction_mt)) || $UNDETERMINED.eql(generation_mt))) {
                    {
                        SubLObject generation_interaction_mt = user_interaction_agenda.uia_generation_interaction_mt(v_agenda, UNPROVIDED);
                        if ($UNDETERMINED == generation_interaction_mt) {
                            {
                                SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
                                SubLObject local_state = state;
                                {
                                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                                    try {
                                        memoization_state.$memoization_state$.bind(local_state, thread);
                                        {
                                            final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
                                            try {
                                                generation_interaction_mt = uia_determine_generation_interaction_mt(domain_interaction_mt, generation_mt, lexical_interaction_mt);
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                        }
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_3, thread);
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            user_interaction_agenda.uia_generation_interaction_mt_update(v_agenda, generation_interaction_mt);
                            user_interaction_agenda.uia_note_interaction_mt(v_agenda, generation_interaction_mt);
                        }
                        return generation_interaction_mt;
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject uia_determine_generation_interaction_mt_internal(SubLObject domain_interaction_mt, SubLObject generation_mt, SubLObject lexical_interaction_mt) {
        return rkf_context_tools.rkf_create_generation_interaction_context(domain_interaction_mt, generation_mt, lexical_interaction_mt);
    }

    public static final SubLObject uia_determine_generation_interaction_mt(SubLObject domain_interaction_mt, SubLObject generation_mt, SubLObject lexical_interaction_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return uia_determine_generation_interaction_mt_internal(domain_interaction_mt, generation_mt, lexical_interaction_mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_DETERMINE_GENERATION_INTERACTION_MT, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_DETERMINE_GENERATION_INTERACTION_MT, THREE_INTEGER, NIL, EQL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, UIA_DETERMINE_GENERATION_INTERACTION_MT, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(domain_interaction_mt, generation_mt, lexical_interaction_mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw63$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (domain_interaction_mt.eql(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (generation_mt.eql(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && lexical_interaction_mt.eql(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_determine_generation_interaction_mt_internal(domain_interaction_mt, generation_mt, lexical_interaction_mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(domain_interaction_mt, generation_mt, lexical_interaction_mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    /**
     * Updates the state of the AGENDA wrt with property :lexical-interaction-mt
     * if :domain-interaction-mt and :language-lexical-mt have been set, by creating
     * a new interaction mt.
     */
    public static final SubLObject uia_compute_lexical_interaction_mt(SubLObject v_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject domain_interaction_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
                SubLObject language_lexical_mt = user_interaction_agenda.uia_language_lexical_mt(v_agenda);
                if (!($UNDETERMINED.eql(domain_interaction_mt) || $UNDETERMINED.eql(language_lexical_mt))) {
                    {
                        SubLObject lexical_interaction_mt = user_interaction_agenda.uia_lexical_interaction_mt(v_agenda);
                        if ($UNDETERMINED == lexical_interaction_mt) {
                            {
                                SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
                                SubLObject local_state = state;
                                {
                                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                                    try {
                                        memoization_state.$memoization_state$.bind(local_state, thread);
                                        {
                                            final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
                                            try {
                                                lexical_interaction_mt = uia_determine_lexical_interaction_mt(domain_interaction_mt, language_lexical_mt);
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                        }
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_4, thread);
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            user_interaction_agenda.uia_lexical_interaction_mt_update(v_agenda, lexical_interaction_mt);
                            user_interaction_agenda.uia_note_interaction_mt(v_agenda, lexical_interaction_mt);
                        }
                        return lexical_interaction_mt;
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject uia_determine_lexical_interaction_mt_internal(SubLObject domain_interaction_mt, SubLObject language_lexical_mt) {
        return rkf_context_tools.rkf_create_lexical_interaction_context(domain_interaction_mt, language_lexical_mt);
    }

    public static final SubLObject uia_determine_lexical_interaction_mt(SubLObject domain_interaction_mt, SubLObject language_lexical_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return uia_determine_lexical_interaction_mt_internal(domain_interaction_mt, language_lexical_mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_DETERMINE_LEXICAL_INTERACTION_MT, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_DETERMINE_LEXICAL_INTERACTION_MT, TWO_INTEGER, NIL, EQL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, UIA_DETERMINE_LEXICAL_INTERACTION_MT, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(domain_interaction_mt, language_lexical_mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw63$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (domain_interaction_mt.eql(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && language_lexical_mt.eql(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_determine_lexical_interaction_mt_internal(domain_interaction_mt, language_lexical_mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(domain_interaction_mt, language_lexical_mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    // deflexical
    private static final SubLSymbol $uia_domain_interaction_mt_name$ = makeSymbol("*UIA-DOMAIN-INTERACTION-MT-NAME*");

    /**
     * Asserts (loose) lexification information for all relevant interaction mts into the
     * lexification interaction mt.
     */
    public static final SubLObject uia_lexify_interaction_mts(SubLObject v_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject domain_interaction_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
                SubLObject lexical_interaction_mt = user_interaction_agenda.uia_lexical_interaction_mt(v_agenda);
                SubLObject name_sentence = el_utilities.list_to_elf(list($$nameString, domain_interaction_mt, $uia_domain_interaction_mt_name$.getGlobalValue()));
                if ((NIL != hlmt.hlmt_p(domain_interaction_mt)) && (NIL != hlmt.hlmt_p(lexical_interaction_mt))) {
                    {
                        SubLObject result = NIL;
                        SubLObject tool_cycl = uia_tool_declaration.ui_operator_cycl($INITIALIZER);
                        {
                            SubLObject _prev_bind_0 = rkf_macros.$rkf_asserting_tool$.currentBinding(thread);
                            try {
                                rkf_macros.$rkf_asserting_tool$.bind(tool_cycl, thread);
                                result = uia_trampolines.uia_assert(v_agenda, name_sentence, lexical_interaction_mt);
                            } finally {
                                rkf_macros.$rkf_asserting_tool$.rebind(_prev_bind_0, thread);
                            }
                        }
                        return result;
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject uia_identify_previous_agenda_mts(SubLObject cyclist, SubLObject mt) {
        if (cyclist == UNPROVIDED) {
            cyclist = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        {
            SubLObject candidate_mts = isa.all_fort_instances($$RKFInteractionContextMicrotheory, mt, UNPROVIDED);
            SubLObject chosen = NIL;
            SubLObject cdolist_list_var = candidate_mts;
            SubLObject candidate = NIL;
            for (candidate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate = cdolist_list_var.first()) {
                if (NIL != rkf_context_tools.rkf_potentially_is_domain_interaction_contextP(candidate)) {
                    if (!((NIL != forts.fort_p(cyclist)) && (bookkeeping_store.creator(candidate, UNPROVIDED) != cyclist))) {
                        chosen = cons(candidate, chosen);
                    }
                }
            }
            return chosen;
        }
    }

    public static final SubLObject uia_identify_previous_agendas_around_mts(SubLObject mts) {
        {
            SubLObject identifications = NIL;
            SubLObject cdolist_list_var = mts;
            SubLObject mt = NIL;
            for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                {
                    SubLObject v_dictionary = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                    uia_identify_agenda_around_mts(v_dictionary, mt);
                    identifications = cons(v_dictionary, identifications);
                }
            }
            return identifications;
        }
    }

    /**
     * Given an interaction Mt, reconstruct an UIA object around that Mt, filling in
     * all the fields accordingly.
     */
    public static final SubLObject uia_identify_agenda_around_mts(SubLObject v_dictionary, SubLObject mt) {
        dictionary.dictionary_enter(v_dictionary, $DOMAIN_INTERACTION_MT, mt);
        uia_identify_agenda_lexical_mts(v_dictionary, mt);
        uia_identify_agenda_populate_interaction_mts(v_dictionary);
        uia_identify_agenda_parent_mts(v_dictionary);
        uia_identify_agenda_topic(v_dictionary);
        return v_dictionary;
    }

    public static final SubLObject uia_identify_agenda_topic(SubLObject v_dictionary) {
        {
            SubLObject topic_mt = dictionary.dictionary_lookup(v_dictionary, $DOMAIN_MT, UNPROVIDED);
            SubLObject topics = ask_utilities.ask_variable($TOPIC, listS($$uiaDemoEnvironmentTopic, topic_mt, $list_alt74), topic_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            dictionary.dictionary_enter(v_dictionary, $TOPIC, topics.first());
        }
        return v_dictionary;
    }

    public static final SubLObject uia_identify_agenda_parent_mts(SubLObject v_dictionary) {
        {
            SubLObject mt = dictionary.dictionary_lookup(v_dictionary, $DOMAIN_INTERACTION_MT, UNPROVIDED);
            SubLObject direct_genl_mts = genl_mts.min_genl_mts(mt, UNPROVIDED, UNPROVIDED);
            SubLObject choice_parent_mt = direct_genl_mts.first();
            dictionary.dictionary_enter(v_dictionary, $DOMAIN_MT, choice_parent_mt);
        }
        {
            SubLObject mt = dictionary.dictionary_lookup(v_dictionary, $PARSING_INTERACTION_MT, UNPROVIDED);
            SubLObject direct_genl_mts = genl_mts.min_genl_mts(mt, UNPROVIDED, UNPROVIDED);
            SubLObject choice_parent_mt = direct_genl_mts.first();
            dictionary.dictionary_enter(v_dictionary, $PARSING_MT, choice_parent_mt);
        }
        {
            SubLObject mt = dictionary.dictionary_lookup(v_dictionary, $GENERATION_INTERACTION_MT, UNPROVIDED);
            SubLObject direct_genl_mts = genl_mts.min_genl_mts(mt, UNPROVIDED, UNPROVIDED);
            SubLObject choice_parent_mt = direct_genl_mts.first();
            dictionary.dictionary_enter(v_dictionary, $GENERATION_MT, choice_parent_mt);
        }
        return v_dictionary;
    }

    public static final SubLObject uia_identify_agenda_lexical_mts(SubLObject v_dictionary, SubLObject mt) {
        {
            SubLObject direct_spec_mts = genl_mts.max_spec_mts(mt, UNPROVIDED, UNPROVIDED);
            SubLObject lexical_mt = uia_identify_agenda_pick_lexical_mt(mt, direct_spec_mts);
            dictionary.dictionary_enter(v_dictionary, $LEXICAL_INTERACTION_MT, lexical_mt);
            {
                SubLObject lexical_spec_mts = genl_mts.max_spec_mts(lexical_mt, UNPROVIDED, UNPROVIDED);
                SubLObject cdolist_list_var = lexical_spec_mts;
                SubLObject lexical_spec_mt = NIL;
                for (lexical_spec_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lexical_spec_mt = cdolist_list_var.first()) {
                    if (NIL != rkf_context_tools.rkf_potentially_is_parsing_interaction_contextP(lexical_spec_mt)) {
                        dictionary.dictionary_enter(v_dictionary, $PARSING_INTERACTION_MT, lexical_spec_mt);
                    } else
                        if (NIL != rkf_context_tools.rkf_potentially_is_generation_interaction_contextP(lexical_spec_mt)) {
                            dictionary.dictionary_enter(v_dictionary, $GENERATION_INTERACTION_MT, lexical_spec_mt);
                        }

                }
            }
        }
        return v_dictionary;
    }

    /**
     *
     *
     * @unknown Find a better way to do this later.
     */
    public static final SubLObject uia_identify_agenda_pick_lexical_mt(SubLObject parent, SubLObject children) {
        {
            SubLObject lexical_mt = NIL;
            if (NIL == lexical_mt) {
                {
                    SubLObject csome_list_var = children;
                    SubLObject child = NIL;
                    for (child = csome_list_var.first(); !((NIL != lexical_mt) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , child = csome_list_var.first()) {
                        if (NIL != rkf_context_tools.rkf_potentially_is_lexical_interaction_contextP(child)) {
                            lexical_mt = child;
                        }
                    }
                }
            }
            return lexical_mt;
        }
    }

    public static final SubLObject uia_identify_agenda_populate_interaction_mts(SubLObject v_dictionary) {
        {
            SubLObject mts = NIL;
            mts = cons(dictionary.dictionary_lookup(v_dictionary, $DOMAIN_INTERACTION_MT, UNPROVIDED), mts);
            mts = cons(dictionary.dictionary_lookup(v_dictionary, $PARSING_INTERACTION_MT, UNPROVIDED), mts);
            mts = cons(dictionary.dictionary_lookup(v_dictionary, $GENERATION_INTERACTION_MT, UNPROVIDED), mts);
            mts = cons(dictionary.dictionary_lookup(v_dictionary, $LEXICAL_INTERACTION_MT, UNPROVIDED), mts);
            dictionary.dictionary_enter(v_dictionary, $ALL_INTERACTION_MTS, mts);
        }
        return v_dictionary;
    }

    public static final SubLObject uia_reconstruct_agenda_populate_interaction_mts(SubLObject v_agenda) {
        {
            SubLObject mts = NIL;
            mts = cons(user_interaction_agenda.uia_state_lookup(v_agenda, $DOMAIN_INTERACTION_MT, UNPROVIDED), mts);
            mts = cons(user_interaction_agenda.uia_state_lookup(v_agenda, $PARSING_INTERACTION_MT, UNPROVIDED), mts);
            mts = cons(user_interaction_agenda.uia_state_lookup(v_agenda, $GENERATION_INTERACTION_MT, UNPROVIDED), mts);
            mts = cons(user_interaction_agenda.uia_state_lookup(v_agenda, $LEXICAL_INTERACTION_MT, UNPROVIDED), mts);
            user_interaction_agenda.uia_state_update(v_agenda, $ALL_INTERACTION_MTS, mts);
        }
        return v_agenda;
    }

    public static final SubLObject uia_tear_down_state(SubLObject v_agenda) {
        {
            SubLObject cdolist_list_var = user_interaction_agenda.uia_all_interaction_mts(v_agenda, UNPROVIDED);
            SubLObject mt = NIL;
            for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                if (NIL != forts.valid_fort_robustP(mt)) {
                    rkf_term_utilities.rkf_kill(mt);
                }
            }
        }
        return v_agenda;
    }

    public static final SubLObject declare_uia_setup_state_file() {
        declareFunction("uia_setup_completeP", "UIA-SETUP-COMPLETE?", 1, 0, false);
        declareFunction("uima_language", "UIMA-LANGUAGE", 1, 0, false);
        declareFunction("uia_language", "UIA-LANGUAGE", 1, 0, false);
        declareFunction("uia_language_update", "UIA-LANGUAGE-UPDATE", 2, 0, false);
        declareFunction("uima_user", "UIMA-USER", 1, 0, false);
        declareFunction("uia_user", "UIA-USER", 1, 0, false);
        declareFunction("uia_user_update", "UIA-USER-UPDATE", 2, 0, false);
        declareFunction("uia_topic", "UIA-TOPIC", 1, 0, false);
        declareFunction("uia_topic_update", "UIA-TOPIC-UPDATE", 2, 0, false);
        declareFunction("uia_compute_setup_state", "UIA-COMPUTE-SETUP-STATE", 1, 0, false);
        declareFunction("uia_note_setup_state_complete", "UIA-NOTE-SETUP-STATE-COMPLETE", 1, 0, false);
        declareFunction("uia_note_setup_state_incomplete", "UIA-NOTE-SETUP-STATE-INCOMPLETE", 1, 0, false);
        declareFunction("uia_compute_setup_state_wrt_language", "UIA-COMPUTE-SETUP-STATE-WRT-LANGUAGE", 1, 0, false);
        declareFunction("uia_compute_setup_state_wrt_topic", "UIA-COMPUTE-SETUP-STATE-WRT-TOPIC", 1, 0, false);
        declareFunction("uia_compute_setup_state_interaction_mts", "UIA-COMPUTE-SETUP-STATE-INTERACTION-MTS", 1, 0, false);
        declareFunction("uia_compute_language_parsing_mt", "UIA-COMPUTE-LANGUAGE-PARSING-MT", 1, 0, false);
        declareFunction("uia_determine_language_parsing_mt", "UIA-DETERMINE-LANGUAGE-PARSING-MT", 1, 0, false);
        declareFunction("uia_compute_language_generation_mt", "UIA-COMPUTE-LANGUAGE-GENERATION-MT", 1, 0, false);
        declareFunction("uia_determine_language_generation_mt", "UIA-DETERMINE-LANGUAGE-GENERATION-MT", 1, 0, false);
        declareFunction("uia_compute_language_lexical_mt", "UIA-COMPUTE-LANGUAGE-LEXICAL-MT", 1, 0, false);
        declareFunction("uia_determine_language_lexical_mt", "UIA-DETERMINE-LANGUAGE-LEXICAL-MT", 1, 0, false);
        declareFunction("uia_compute_domain_mt", "UIA-COMPUTE-DOMAIN-MT", 1, 0, false);
        declareFunction("uia_determine_domain_mt", "UIA-DETERMINE-DOMAIN-MT", 2, 0, false);
        declareFunction("uia_create_domain_mt", "UIA-CREATE-DOMAIN-MT", 2, 0, false);
        declareFunction("uia_compute_parsing_mt", "UIA-COMPUTE-PARSING-MT", 1, 0, false);
        declareFunction("uia_determine_parsing_mt", "UIA-DETERMINE-PARSING-MT", 2, 0, false);
        declareFunction("uia_compute_generation_mt", "UIA-COMPUTE-GENERATION-MT", 1, 0, false);
        declareFunction("uia_determine_generation_mt", "UIA-DETERMINE-GENERATION-MT", 2, 0, false);
        declareFunction("uia_compute_domain_interaction_mt", "UIA-COMPUTE-DOMAIN-INTERACTION-MT", 1, 0, false);
        declareFunction("uia_determine_domain_interaction_mt_internal", "UIA-DETERMINE-DOMAIN-INTERACTION-MT-INTERNAL", 1, 0, false);
        declareFunction("uia_determine_domain_interaction_mt", "UIA-DETERMINE-DOMAIN-INTERACTION-MT", 1, 0, false);
        declareFunction("uia_compute_parsing_interaction_mt", "UIA-COMPUTE-PARSING-INTERACTION-MT", 1, 0, false);
        declareFunction("uia_determine_parsing_interaction_mt_internal", "UIA-DETERMINE-PARSING-INTERACTION-MT-INTERNAL", 3, 0, false);
        declareFunction("uia_determine_parsing_interaction_mt", "UIA-DETERMINE-PARSING-INTERACTION-MT", 3, 0, false);
        declareFunction("uia_compute_generation_interaction_mt", "UIA-COMPUTE-GENERATION-INTERACTION-MT", 1, 0, false);
        declareFunction("uia_determine_generation_interaction_mt_internal", "UIA-DETERMINE-GENERATION-INTERACTION-MT-INTERNAL", 3, 0, false);
        declareFunction("uia_determine_generation_interaction_mt", "UIA-DETERMINE-GENERATION-INTERACTION-MT", 3, 0, false);
        declareFunction("uia_compute_lexical_interaction_mt", "UIA-COMPUTE-LEXICAL-INTERACTION-MT", 1, 0, false);
        declareFunction("uia_determine_lexical_interaction_mt_internal", "UIA-DETERMINE-LEXICAL-INTERACTION-MT-INTERNAL", 2, 0, false);
        declareFunction("uia_determine_lexical_interaction_mt", "UIA-DETERMINE-LEXICAL-INTERACTION-MT", 2, 0, false);
        declareFunction("uia_lexify_interaction_mts", "UIA-LEXIFY-INTERACTION-MTS", 1, 0, false);
        declareFunction("uia_identify_previous_agenda_mts", "UIA-IDENTIFY-PREVIOUS-AGENDA-MTS", 0, 2, false);
        declareFunction("uia_identify_previous_agendas_around_mts", "UIA-IDENTIFY-PREVIOUS-AGENDAS-AROUND-MTS", 1, 0, false);
        declareFunction("uia_identify_agenda_around_mts", "UIA-IDENTIFY-AGENDA-AROUND-MTS", 2, 0, false);
        declareFunction("uia_identify_agenda_topic", "UIA-IDENTIFY-AGENDA-TOPIC", 1, 0, false);
        declareFunction("uia_identify_agenda_parent_mts", "UIA-IDENTIFY-AGENDA-PARENT-MTS", 1, 0, false);
        declareFunction("uia_identify_agenda_lexical_mts", "UIA-IDENTIFY-AGENDA-LEXICAL-MTS", 2, 0, false);
        declareFunction("uia_identify_agenda_pick_lexical_mt", "UIA-IDENTIFY-AGENDA-PICK-LEXICAL-MT", 2, 0, false);
        declareFunction("uia_identify_agenda_populate_interaction_mts", "UIA-IDENTIFY-AGENDA-POPULATE-INTERACTION-MTS", 1, 0, false);
        declareFunction("uia_reconstruct_agenda_populate_interaction_mts", "UIA-RECONSTRUCT-AGENDA-POPULATE-INTERACTION-MTS", 1, 0, false);
        declareFunction("uia_tear_down_state", "UIA-TEAR-DOWN-STATE", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_uia_setup_state_file() {
        defparameter("*UIA-CREATE-DOMAIN-MTS?*", NIL);
        deflexical("*UIA-DOMAIN-INTERACTION-MT-NAME*", $$$the_current_context);
        return NIL;
    }

    public static final SubLObject setup_uia_setup_state_file() {
                memoization_state.note_memoized_function(UIA_DETERMINE_DOMAIN_INTERACTION_MT);
        memoization_state.note_memoized_function(UIA_DETERMINE_PARSING_INTERACTION_MT);
        memoization_state.note_memoized_function(UIA_DETERMINE_GENERATION_INTERACTION_MT);
        memoization_state.note_memoized_function(UIA_DETERMINE_LEXICAL_INTERACTION_MT);
        return NIL;
    }















    static private final SubLString $str_alt7$Problems_encountered_initializing = makeString("Problems encountered initializing language.");

    static private final SubLString $str_alt8$Problems_encountered_initializing = makeString("Problems encountered initializing topic.");

    static private final SubLString $str_alt9$Problems_encountered_initializing = makeString("Problems encountered initializing interaction contexts.");

    static private final SubLString $str_alt10$Kraken_initialization_is_complete = makeString("Kraken initialization is complete.");



    static private final SubLString $str_alt12$ = makeString("");

    static private final SubLString $str_alt13$Kraken_initialization_failed_ = makeString("Kraken initialization failed.");

    static private final SubLString $str_alt14$Identifying_language_specific_gra = makeString("Identifying language-specific grammatical information for parsing.");

    static private final SubLString $str_alt15$Problems_encountered_initializing = makeString("Problems encountered initializing language-specific parsing context.");

    static private final SubLString $str_alt16$Identifying_language_specific_gra = makeString("Identifying language-specific grammatical information for generation.");

    static private final SubLString $str_alt17$Problems_encountered_initializing = makeString("Problems encountered initializing language-specific generation context.");

    static private final SubLString $str_alt18$Identifying_language_specific_dic = makeString("Identifying language-specific dictionary information.");

    static private final SubLString $str_alt19$Problems_encountered_initializing = makeString("Problems encountered initializing language-specific lexical context.");

    static private final SubLString $$$selected_topic = makeString("selected topic");

    static private final SubLString $str_alt21$Identifying_topic_and_determining = makeString("Identifying topic and determining relevant knowledge sources for ");

    static private final SubLString $str_alt22$_ = makeString(".");

    static private final SubLString $str_alt23$Problems_encountered_initializing = makeString("Problems encountered initializing interaction context.");

    static private final SubLString $str_alt24$Locating_parsing_terminology_for_ = makeString("Locating parsing terminology for ");

    static private final SubLString $str_alt25$Problems_encountered_initializing = makeString("Problems encountered initializing parsing context.");

    static private final SubLString $str_alt26$Locating_generation_terminology_f = makeString("Locating generation terminology for ");

    static private final SubLString $str_alt27$Problems_encountered_initializing = makeString("Problems encountered initializing generation context.");

    static private final SubLString $str_alt28$Preparing_space_for_temporary_sto = makeString("Preparing space for temporary storage of user-entered domain knowledge.");

    static private final SubLString $str_alt29$Problems_encountered_preparing_sp = makeString("Problems encountered preparing space for temporary storage of user-entered domain knowledge.");

    static private final SubLString $str_alt30$Preparing_space_for_temporary_sto = makeString("Preparing space for temporary storage of user-entered dictionary information.");

    static private final SubLString $str_alt31$Problems_encountered_preparing_sp = makeString("Problems encountered preparing space for temporary storage of user-entered dictionary information.");

    static private final SubLString $str_alt32$Preparing_space_for_temporary_sto = makeString("Preparing space for temporary storage of user-entered parsing information.");

    static private final SubLString $str_alt33$Problems_encountered_preparing_sp = makeString("Problems encountered preparing space for temporary storage of user-entered parsing information.");

    static private final SubLString $str_alt34$Preparing_space_for_temporary_sto = makeString("Preparing space for temporary storage of user-entered generation information.");

    static private final SubLString $str_alt35$Problems_encountered_preparing_sp = makeString("Problems encountered preparing space for temporary storage of user-entered generation information.");

    static private final SubLString $str_alt36$Naming_spaces_for_temporary_stora = makeString("Naming spaces for temporary storage of user-entered NL information.");

    static private final SubLString $str_alt37$Problems_encountered_naming_space = makeString("Problems encountered naming spaces for temporary storage of user-entered NL information.");

    static private final SubLString $str_alt38$Language_is_undetermined__Couldn_ = makeString("Language is undetermined. Couldn't set language-specific parsing context.");

    static private final SubLString $str_alt39$Language_is_undetermined__Couldn_ = makeString("Language is undetermined. Couldn't set language-specific generation context.");

    static private final SubLString $str_alt40$Language_is_undetermined__Couldn_ = makeString("Language is undetermined. Couldn't set language-specific lexical context.");

    static private final SubLString $str_alt41$Topic_is_undetermined__Couldn_t_s = makeString("Topic is undetermined. Couldn't set topic-specific interaction context.");

    static private final SubLString $$$UnreifiedTerm = makeString("UnreifiedTerm");

    static private final SubLString $str_alt43$_DemoEnvironmentMt = makeString("-DemoEnvironmentMt");

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    static private final SubLList $list_alt45 = list(constant_handles.reader_make_constant_shell(makeString("ApplicationContext")));

    static private final SubLList $list_alt46 = list(constant_handles.reader_make_constant_shell(makeString("ProblemSolvingCntxt")));

    static private final SubLList $list_alt47 = list(constant_handles.reader_make_constant_shell(makeString("UIA-DemoEnvironmentMicrotheory")));

    public static final SubLObject $$quotedIsa = constant_handles.reader_make_constant_shell(makeString("quotedIsa"));

    static private final SubLList $list_alt49 = list(constant_handles.reader_make_constant_shell(makeString("ProprietaryConstant")));

    public static final SubLObject $$genlMt = constant_handles.reader_make_constant_shell(makeString("genlMt"));

    static private final SubLList $list_alt51 = list(constant_handles.reader_make_constant_shell(makeString("UIA-OpenEndedConversation-DemoEnvironmentMt")));

    public static final SubLObject $$uiaDemoEnvironmentTopic = constant_handles.reader_make_constant_shell(makeString("uiaDemoEnvironmentTopic"));

    public static final SubLObject $$mtRefinementDomainBasis = constant_handles.reader_make_constant_shell(makeString("mtRefinementDomainBasis"));

    public static final SubLObject $$RKFParsingMt = constant_handles.reader_make_constant_shell(makeString("RKFParsingMt"));

    public static final SubLObject $$RKFParaphraseMt = constant_handles.reader_make_constant_shell(makeString("RKFParaphraseMt"));

    static private final SubLString $str_alt56$Language_specific_parsing_context = makeString("Language-specific parsing context is undetermined. Couldn't set parsing context for interaction.");

    static private final SubLString $str_alt57$Interaction_context_is_undetermin = makeString("Interaction context is undetermined. Couldn't set parsing context for interaction.");

    static private final SubLString $str_alt58$Language_specific_generation_cont = makeString("Language-specific generation context is undetermined. Couldn't set generation context for interaction.");

    static private final SubLString $str_alt59$Interaction_context_is_undetermin = makeString("Interaction context is undetermined. Couldn't set generation context for interaction.");

    static private final SubLString $str_alt60$Agenda_topic_context_is_undetermi = makeString("Agenda topic context is undetermined. Couldn't set interaction context for interaction.");

    static private final SubLString $str_alt61$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    private static final SubLSymbol UIA_DETERMINE_DOMAIN_INTERACTION_MT = makeSymbol("UIA-DETERMINE-DOMAIN-INTERACTION-MT");

    public static final SubLSymbol $kw63$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    private static final SubLSymbol UIA_DETERMINE_PARSING_INTERACTION_MT = makeSymbol("UIA-DETERMINE-PARSING-INTERACTION-MT");

    private static final SubLSymbol UIA_DETERMINE_GENERATION_INTERACTION_MT = makeSymbol("UIA-DETERMINE-GENERATION-INTERACTION-MT");

    private static final SubLSymbol UIA_DETERMINE_LEXICAL_INTERACTION_MT = makeSymbol("UIA-DETERMINE-LEXICAL-INTERACTION-MT");

    static private final SubLString $$$the_current_context = makeString("the current context");

    public static final SubLObject $$nameString = constant_handles.reader_make_constant_shell(makeString("nameString"));



    public static final SubLObject $$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));

    public static final SubLObject $$RKFInteractionContextMicrotheory = constant_handles.reader_make_constant_shell(makeString("RKFInteractionContextMicrotheory"));

    private static final SubLSymbol $DOMAIN_INTERACTION_MT = makeKeyword("DOMAIN-INTERACTION-MT");



    static private final SubLList $list_alt74 = list(makeKeyword("TOPIC"));

    private static final SubLSymbol $PARSING_INTERACTION_MT = makeKeyword("PARSING-INTERACTION-MT");



    private static final SubLSymbol $GENERATION_INTERACTION_MT = makeKeyword("GENERATION-INTERACTION-MT");



    private static final SubLSymbol $LEXICAL_INTERACTION_MT = makeKeyword("LEXICAL-INTERACTION-MT");

    private static final SubLSymbol $ALL_INTERACTION_MTS = makeKeyword("ALL-INTERACTION-MTS");

    // // Initializers
    public void declareFunctions() {
        declare_uia_setup_state_file();
    }

    public void initializeVariables() {
        init_uia_setup_state_file();
    }

    public void runTopLevelForms() {
        setup_uia_setup_state_file();
    }
}

