/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.remf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
 *  module:      UIA-TOOLS-GLOSSARY
 *  source file: /cyc/top/cycl/uia-tools-glossary.lisp
 *  created:     2019/07/03 17:37:58
 */
public final class uia_tools_glossary extends SubLTranslatedFile implements V02 {
    // // Constructor
    private uia_tools_glossary() {
    }

    public static final SubLFile me = new uia_tools_glossary();

    public static final String myName = "com.cyc.cycjava.cycl.uia_tools_glossary";

    // // Definitions
    public static final SubLObject uia_act_new_glossary(SubLObject v_agenda, SubLObject mode, SubLObject glossary, SubLObject alt_phrases_separate, SubLObject recompute) {
        if (alt_phrases_separate == UNPROVIDED) {
            alt_phrases_separate = NIL;
        }
        if (recompute == UNPROVIDED) {
            recompute = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frameless = user_interaction_agenda.$uia_frameless_environmentP$.getDynamicValue(thread);
                SubLObject frame = (NIL != frameless) ? ((SubLObject) (NIL)) : $UIA_INTERACTION;
                return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $GLOSSARY, NIL, list(new SubLObject[]{ $GLOSSARY, glossary, $FRAMELESS, frameless, $FRAME, frame, $ALT_PHRASES_SEPARATE, alt_phrases_separate, $RECOMPUTE, recompute }));
            }
        }
    }

    public static final SubLObject uia_relevant_glossaries(SubLObject v_agenda) {
        {
            SubLObject mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
            SubLObject glossaries = isa.all_fort_instances($$UIAGlossary, mt, UNPROVIDED);
            return glossaries;
        }
    }

    public static final SubLObject uia_glossary_child_completed(SubLObject parent, SubLObject child) {
        return parent;
    }

    public static final SubLObject uia_glossary_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject initializedP = makeBoolean($UNINITIALIZED != user_interaction_agenda.ui_state_lookup(interaction, $GLOSSARY_TERMS, $UNINITIALIZED));
            if (NIL == initializedP) {
                {
                    SubLObject message = $str_alt10$Constructing_glossary___;
                    uia_mumbler.uia_mumble(v_agenda, message);
                    uia_tools_basic.uia_act_new_thinking_child(interaction, UIA_GLOSSARY_CONSTRUCTOR, list(interaction), message, UNPROVIDED);
                }
                return user_interaction_agenda.uia_generate_next_request(v_agenda);
            }
            return uia_glossary_request_guts(interaction);
        }
    }

    public static final SubLObject uia_glossary_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt12);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt12);
            action_type = current.first();
            current = current.rest();
            temp_plist = current;
            {
                SubLObject signature = getf(temp_plist, $SIGNATURE, UNPROVIDED);
                SubLObject agenda_signature = getf(temp_plist, $AGENDA_SIGNATURE, UNPROVIDED);
                SubLObject plist = remf(remf(copy_list(temp_plist), $SIGNATURE), $AGENDA_SIGNATURE);
                SubLObject interaction = (NIL != signature) ? ((SubLObject) (user_interaction_agenda.find_ui_by_signature(signature))) : NIL;
                SubLObject v_agenda = (NIL != interaction) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : user_interaction_agenda.find_uia_by_signature(agenda_signature);
                SubLObject datum_1 = plist;
                SubLObject current_2 = datum_1;
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current_2;
                SubLObject bad = NIL;
                SubLObject current_3 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum_1, $list_alt15);
                    current_3 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum_1, $list_alt15);
                    if (NIL == member(current_3, $list_alt16, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_3 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum_1, $list_alt15);
                }
                {
                    SubLObject glossary_name_tail = property_list_member($GLOSSARY_NAME, current_2);
                    SubLObject glossary_name = (NIL != glossary_name_tail) ? ((SubLObject) (cadr(glossary_name_tail))) : NIL;
                    SubLObject alt_phrases_separate_tail = property_list_member($ALT_PHRASES_SEPARATE, current_2);
                    SubLObject alt_phrases_separate = (NIL != alt_phrases_separate_tail) ? ((SubLObject) (cadr(alt_phrases_separate_tail))) : NIL;
                    SubLObject glossary = (NIL != glossary_name) ? ((SubLObject) (read_from_string(glossary_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
                    SubLObject alt_phrases_separateP = (NIL != alt_phrases_separate) ? ((SubLObject) (read_from_string(alt_phrases_separate, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
                    SubLObject pcase_var = action_type;
                    if (pcase_var.eql($REFRESH)) {
                        uia_act_new_glossary(v_agenda, $REQUIRED, glossary, alt_phrases_separateP, UNPROVIDED);
                    } else
                        if (pcase_var.eql($RECOMPUTE)) {
                            uia_act_new_glossary(v_agenda, $REQUIRED, glossary, alt_phrases_separateP, T);
                        }

                }
            }
        }
        return NIL;
    }

    public static final SubLObject uia_glossary_constructor(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject glossary_terms = uia_glossary_get_contents(interaction);
                SubLObject glossary_term_info_table = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                    SubLObject possible_glossaries = uia_relevant_glossaries(v_agenda);
                    user_interaction_agenda.ui_state_update(interaction, $POSSIBLE_GLOSSARIES, possible_glossaries);
                    user_interaction_agenda.ui_state_update(interaction, $GLOSSARY_TERMS, glossary_terms);
                    user_interaction_agenda.ui_state_update(interaction, $GLOSSARY_TERM_INFO_TABLE, glossary_term_info_table);
                }
            }
            return interaction;
        }
    }

    public static final SubLObject uia_glossary_request_guts(SubLObject interaction) {
        {
            SubLObject glossary = user_interaction_agenda.ui_state_lookup(interaction, $GLOSSARY, UNPROVIDED);
            SubLObject glossary_terms = user_interaction_agenda.ui_state_lookup(interaction, $GLOSSARY_TERMS, UNPROVIDED);
            SubLObject glossary_term_info_table = user_interaction_agenda.ui_state_lookup(interaction, $GLOSSARY_TERM_INFO_TABLE, UNPROVIDED);
            SubLObject request = NIL;
            request = user_interaction_agenda.make_ui_request(interaction, $SHOW, list($GLOSSARY, glossary, $GLOSSARY_TERMS, glossary_terms, $GLOSSARY_TERM_INFO_TABLE, glossary_term_info_table));
            user_interaction_agenda.uia_act_complete(user_interaction_agenda.ui_agenda(interaction), interaction, $DONE);
            return request;
        }
    }

    // defparameter
    private static final SubLSymbol $term_mapper_table$ = makeSymbol("*TERM-MAPPER-TABLE*");

    public static final SubLObject uia_get_glossary_terms(SubLObject v_agenda, SubLObject glossary, SubLObject mt, SubLObject recompute) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                if (NIL != recompute) {
                    user_interaction_agenda.uia_clear_memoization_state_for_function(v_agenda, UIA_GET_GLOSSARY_TERMS_MEMOIZED);
                }
                {
                    SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
                    SubLObject local_state = state;
                    {
                        SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                                Errors.error($str_alt26$Invalid_attempt_to_reuse_memoizat);
                                            }
                                        }
                                    }
                                }
                                try {
                                    result = uia_get_glossary_terms_memoized(glossary, mt);
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
                return result;
            }
        }
    }

    public static final SubLObject uia_get_glossary_terms_memoized_internal(SubLObject glossary, SubLObject mt) {
        {
            SubLObject backchain_from_kb = backward.removal_ask_variable($X, listS($$uiaGlossaryContentsBackchain, glossary, $list_alt29), mt, UNPROVIDED, UNPROVIDED).first();
            SubLObject backchain_default = TWO_INTEGER;
            SubLObject backchain = (NIL != backchain_from_kb) ? ((SubLObject) (backchain_from_kb)) : backchain_default;
            return ask_utilities.ask_variable($sym30$_X, list($$termInGlossary, $sym30$_X, glossary), mt, backchain, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static final SubLObject uia_get_glossary_terms_memoized(SubLObject glossary, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return uia_get_glossary_terms_memoized_internal(glossary, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_GET_GLOSSARY_TERMS_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_GET_GLOSSARY_TERMS_MEMOIZED, TWO_INTEGER, NIL, EQL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, UIA_GET_GLOSSARY_TERMS_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(glossary, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw32$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (glossary.eql(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_get_glossary_terms_memoized_internal(glossary, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(glossary, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static final SubLObject uia_glossary_get_contents(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject domain_interaction_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
            SubLObject glossary = user_interaction_agenda.ui_state_lookup(interaction, $GLOSSARY, UNPROVIDED);
            if (NIL == glossary) {
                return values(NIL, NIL);
            }
            {
                SubLObject recompute = user_interaction_agenda.ui_state_lookup(interaction, $RECOMPUTE, UNPROVIDED);
                SubLObject terms = uia_get_glossary_terms(v_agenda, glossary, domain_interaction_mt, recompute);
                SubLObject fort_terms = list_utilities.remove_if_not(FORT_P, terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject glossary_term_info_table = make_hash_table(length(fort_terms), EQ, UNPROVIDED);
                SubLObject alt_phrases_separate = user_interaction_agenda.ui_state_lookup(interaction, $ALT_PHRASES_SEPARATE, UNPROVIDED);
                SubLObject result = NIL;
                {
                    SubLObject cdolist_list_var = fort_terms;
                    SubLObject v_term = NIL;
                    for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                        sethash(v_term, glossary_term_info_table, $PLACEHOLDER);
                    }
                }
                {
                    SubLObject cdolist_list_var = fort_terms;
                    SubLObject v_term = NIL;
                    for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                        {
                            SubLObject glossary_info = ui_glossary_term_mapper(interaction, v_term, glossary_term_info_table);
                            SubLObject non_duplicative_phrases = remove_duplicates(getf(glossary_info, $ALT_PHRASES, UNPROVIDED), EQUALP, STRIP_DETERMINER, UNPROVIDED, UNPROVIDED);
                            sethash(v_term, glossary_term_info_table, glossary_info);
                            if (NIL != alt_phrases_separate) {
                                {
                                    SubLObject cdolist_list_var_5 = non_duplicative_phrases;
                                    SubLObject generation = NIL;
                                    for (generation = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , generation = cdolist_list_var_5.first()) {
                                        result = cons(list($CYCL, v_term, $GENERATION, generation, $MAIN_ENTRY, NIL, $SORT_KEY, glossary_sort_key_from_string(generation)), result);
                                    }
                                }
                            }
                            result = cons(list($CYCL, v_term, $GENERATION, getf(glossary_info, $PREFERRED_GENERATION, UNPROVIDED), $MAIN_ENTRY, T, $SORT_KEY, glossary_sort_key_from_string(getf(glossary_info, $PREFERRED_GENERATION, UNPROVIDED))), result);
                        }
                    }
                }
                result = Sort.sort(result, STRING_LESSP, GLOSSARY_TERM_MAPPER_SORT_KEY);
                return values(result, glossary_term_info_table);
            }
        }
    }

    public static final SubLObject glossary_sort_key_from_string_internal(SubLObject string) {
        return string_utilities.pre_remove(lexicon_utilities.strip_determiner(string, UNPROVIDED), constant_reader.constant_reader_prefix(), UNPROVIDED);
    }

    public static final SubLObject glossary_sort_key_from_string(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return glossary_sort_key_from_string_internal(string);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, GLOSSARY_SORT_KEY_FROM_STRING, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), GLOSSARY_SORT_KEY_FROM_STRING, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, GLOSSARY_SORT_KEY_FROM_STRING, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, string, $kw32$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw32$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(glossary_sort_key_from_string_internal(string)));
                        memoization_state.caching_state_put(caching_state, string, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static final SubLObject glossary_info_for_term(SubLObject v_term, SubLObject table) {
        return gethash(v_term, table, UNPROVIDED);
    }

    public static final SubLObject glossary_term_mapper_sort_key(SubLObject item) {
        {
            SubLObject result = getf(item, $SORT_KEY, NIL);
            if (!result.isString()) {
                {
                    SubLObject generation = getf(item, $GENERATION, $str_alt45$);
                    result = glossary_sort_key_from_string(generation);
                }
            }
            return result;
        }
    }

    public static final SubLObject ui_glossary_term_mapper(SubLObject interaction, SubLObject v_term, SubLObject term_table) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject preferred_html = uia_trampolines.uia_html_term_phrase(v_agenda, v_term, UNPROVIDED, UNPROVIDED);
            SubLObject preferred_phrase = pph_utilities.pph_remove_html_tags(preferred_html, T);
            SubLObject alt_phrases = remove(pph_utilities.pph_remove_html_tags(preferred_phrase, UNPROVIDED), uia_trampolines.uia_all_phrases_for_term(v_agenda, v_term, $$nonPlural_Generic, $list_alt47, UNPROVIDED, UNPROVIDED), EQUALP, PPH_REMOVE_HTML_TAGS, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject sorted_alt_phrases = Sort.sort(alt_phrases, STRING_LESSP, GLOSSARY_SORT_KEY_FROM_STRING);
            SubLObject similar_terms = NIL;
            SubLObject summary_phrase = uia_glossary_summary_sentence(v_agenda, v_term);
            SubLObject instance_classification = uia_glossary_instance_classification(interaction, v_term);
            SubLObject v_instances = uia_glossary_instances_in_glossary(interaction, v_term, term_table);
            SubLObject result = list(new SubLObject[]{ $TERM, v_term, $PREFERRED_GENERATION, preferred_phrase, $PREFERRED_HTML, preferred_html, $ALT_PHRASES, sorted_alt_phrases, $SIMILAR_TERMS, similar_terms, $DEFINITION, summary_phrase, $INSTANCES, v_instances, $INSTANCE_CLASSIFICATION, instance_classification });
            return result;
        }
    }

    public static final SubLObject uia_glossary_instance_classification(SubLObject interaction, SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject glossary = user_interaction_agenda.ui_state_lookup(interaction, $GLOSSARY, UNPROVIDED);
                SubLObject interaction_mt = user_interaction_agenda.ui_domain_interaction_mt(interaction);
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject result = NIL;
                SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                            Errors.error($str_alt26$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                result = uia_glossary_instance_classification_memoized(v_term, glossary, interaction_mt);
                            } finally {
                                {
                                    SubLObject _prev_bind_0_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_6, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject uia_glossary_instance_classification_memoized_internal(SubLObject v_term, SubLObject glossary, SubLObject mt) {
        {
            SubLObject classifications = ask_utilities.ask_variable($X, listS($$uiaGlossaryInstanceClassification, v_term, glossary, $list_alt29), mt, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL != classifications.first() ? ((SubLObject) (classifications.first())) : $$$Unclassified_Instances;
        }
    }

    public static final SubLObject uia_glossary_instance_classification_memoized(SubLObject v_term, SubLObject glossary, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return uia_glossary_instance_classification_memoized_internal(v_term, glossary, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_GLOSSARY_INSTANCE_CLASSIFICATION_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_GLOSSARY_INSTANCE_CLASSIFICATION_MEMOIZED, THREE_INTEGER, NIL, EQL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, UIA_GLOSSARY_INSTANCE_CLASSIFICATION_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, glossary, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw32$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (v_term.eql(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (glossary.eql(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_glossary_instance_classification_memoized_internal(v_term, glossary, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, glossary, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static final SubLObject uia_glossary_instances_in_glossary(SubLObject interaction, SubLObject v_term, SubLObject term_table) {
        {
            SubLObject domain_interaction_mt = user_interaction_agenda.ui_domain_interaction_mt(interaction);
            SubLObject v_instances = isa.all_fort_instances(v_term, domain_interaction_mt, UNPROVIDED);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = v_instances;
            SubLObject instance = NIL;
            for (instance = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , instance = cdolist_list_var.first()) {
                if (NIL != gethash(instance, term_table, UNPROVIDED)) {
                    result = cons(instance, result);
                }
            }
            return result;
        }
    }

    public static final SubLObject uia_glossary_summary_sentence(SubLObject v_agenda, SubLObject v_term) {
        {
            SubLObject sentence = uia_glossary_clarifying_string(v_agenda, v_term);
            if (NIL == sentence) {
                sentence = uia_trampolines.uia_summary_sentence(v_agenda, v_term);
            }
            return sentence;
        }
    }

    public static final SubLObject uia_glossary_clarifying_string(SubLObject v_agenda, SubLObject v_term) {
        {
            SubLObject mt = user_interaction_agenda.uia_generation_interaction_mt(v_agenda, UNPROVIDED);
            SubLObject result = NIL;
            result = backward.removal_ask_variable($SENT, listS($$glossaryClarifyingString, v_term, $list_alt60), mt, UNPROVIDED, UNPROVIDED).first();
            return result;
        }
    }

    public static final SubLObject declare_uia_tools_glossary_file() {
        declareFunction("uia_act_new_glossary", "UIA-ACT-NEW-GLOSSARY", 3, 2, false);
        declareFunction("uia_relevant_glossaries", "UIA-RELEVANT-GLOSSARIES", 1, 0, false);
        declareFunction("uia_glossary_child_completed", "UIA-GLOSSARY-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uia_glossary_generate_request", "UIA-GLOSSARY-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uia_glossary_handle_reply", "UIA-GLOSSARY-HANDLE-REPLY", 1, 0, false);
        declareFunction("uia_glossary_constructor", "UIA-GLOSSARY-CONSTRUCTOR", 1, 0, false);
        declareFunction("uia_glossary_request_guts", "UIA-GLOSSARY-REQUEST-GUTS", 1, 0, false);
        declareFunction("uia_get_glossary_terms", "UIA-GET-GLOSSARY-TERMS", 4, 0, false);
        declareFunction("uia_get_glossary_terms_memoized_internal", "UIA-GET-GLOSSARY-TERMS-MEMOIZED-INTERNAL", 2, 0, false);
        declareFunction("uia_get_glossary_terms_memoized", "UIA-GET-GLOSSARY-TERMS-MEMOIZED", 2, 0, false);
        declareFunction("uia_glossary_get_contents", "UIA-GLOSSARY-GET-CONTENTS", 1, 0, false);
        declareFunction("glossary_sort_key_from_string_internal", "GLOSSARY-SORT-KEY-FROM-STRING-INTERNAL", 1, 0, false);
        declareFunction("glossary_sort_key_from_string", "GLOSSARY-SORT-KEY-FROM-STRING", 1, 0, false);
        declareFunction("glossary_info_for_term", "GLOSSARY-INFO-FOR-TERM", 2, 0, false);
        declareFunction("glossary_term_mapper_sort_key", "GLOSSARY-TERM-MAPPER-SORT-KEY", 1, 0, false);
        declareFunction("ui_glossary_term_mapper", "UI-GLOSSARY-TERM-MAPPER", 3, 0, false);
        declareFunction("uia_glossary_instance_classification", "UIA-GLOSSARY-INSTANCE-CLASSIFICATION", 2, 0, false);
        declareFunction("uia_glossary_instance_classification_memoized_internal", "UIA-GLOSSARY-INSTANCE-CLASSIFICATION-MEMOIZED-INTERNAL", 3, 0, false);
        declareFunction("uia_glossary_instance_classification_memoized", "UIA-GLOSSARY-INSTANCE-CLASSIFICATION-MEMOIZED", 3, 0, false);
        declareFunction("uia_glossary_instances_in_glossary", "UIA-GLOSSARY-INSTANCES-IN-GLOSSARY", 3, 0, false);
        declareFunction("uia_glossary_summary_sentence", "UIA-GLOSSARY-SUMMARY-SENTENCE", 2, 0, false);
        declareFunction("uia_glossary_clarifying_string", "UIA-GLOSSARY-CLARIFYING-STRING", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_uia_tools_glossary_file() {
        defparameter("*TERM-MAPPER-TABLE*", NIL);
        return NIL;
    }

    public static final SubLObject setup_uia_tools_glossary_file() {
                uia_tool_declaration.declare_uia_tool($GLOSSARY, $list_alt1);
        memoization_state.note_memoized_function(UIA_GET_GLOSSARY_TERMS_MEMOIZED);
        memoization_state.note_memoized_function(GLOSSARY_SORT_KEY_FROM_STRING);
        memoization_state.note_memoized_function(UIA_GLOSSARY_INSTANCE_CLASSIFICATION_MEMOIZED);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol $GLOSSARY = makeKeyword("GLOSSARY");

    static private final SubLList $list_alt1 = list(new SubLObject[]{ $NAME, makeString("Glossary"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIA-GLOSSARY-CHILD-COMPLETED"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIA-GLOSSARY-GENERATE-REQUEST"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIA-GLOSSARY-HANDLE-REPLY"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycGlossary")) });

    private static final SubLSymbol $UIA_INTERACTION = makeKeyword("UIA-INTERACTION");

    private static final SubLSymbol $FRAMELESS = makeKeyword("FRAMELESS");



    private static final SubLSymbol $ALT_PHRASES_SEPARATE = makeKeyword("ALT-PHRASES-SEPARATE");



    public static final SubLObject $$UIAGlossary = constant_handles.reader_make_constant_shell(makeString("UIAGlossary"));



    private static final SubLSymbol $GLOSSARY_TERMS = makeKeyword("GLOSSARY-TERMS");

    static private final SubLString $str_alt10$Constructing_glossary___ = makeString("Constructing glossary...");

    private static final SubLSymbol UIA_GLOSSARY_CONSTRUCTOR = makeSymbol("UIA-GLOSSARY-CONSTRUCTOR");

    static private final SubLList $list_alt12 = listS(makeUninternedSymbol("OPERATOR"), makeSymbol("ACTION-TYPE"), makeUninternedSymbol("TEMP-PLIST"));





    static private final SubLList $list_alt15 = list(makeSymbol("&KEY"), makeSymbol("GLOSSARY-NAME"), makeSymbol("ALT-PHRASES-SEPARATE"));

    static private final SubLList $list_alt16 = list(makeKeyword("GLOSSARY-NAME"), makeKeyword("ALT-PHRASES-SEPARATE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $GLOSSARY_NAME = makeKeyword("GLOSSARY-NAME");





    private static final SubLSymbol $POSSIBLE_GLOSSARIES = makeKeyword("POSSIBLE-GLOSSARIES");

    private static final SubLSymbol $GLOSSARY_TERM_INFO_TABLE = makeKeyword("GLOSSARY-TERM-INFO-TABLE");





    private static final SubLSymbol UIA_GET_GLOSSARY_TERMS_MEMOIZED = makeSymbol("UIA-GET-GLOSSARY-TERMS-MEMOIZED");

    static private final SubLString $str_alt26$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");



    public static final SubLObject $$uiaGlossaryContentsBackchain = constant_handles.reader_make_constant_shell(makeString("uiaGlossaryContentsBackchain"));

    static private final SubLList $list_alt29 = list(makeKeyword("X"));

    static private final SubLSymbol $sym30$_X = makeSymbol("?X");

    public static final SubLObject $$termInGlossary = constant_handles.reader_make_constant_shell(makeString("termInGlossary"));

    public static final SubLSymbol $kw32$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");





    private static final SubLSymbol $ALT_PHRASES = makeKeyword("ALT-PHRASES");

    private static final SubLSymbol STRIP_DETERMINER = makeSymbol("STRIP-DETERMINER");





    private static final SubLSymbol $MAIN_ENTRY = makeKeyword("MAIN-ENTRY");

    private static final SubLSymbol $SORT_KEY = makeKeyword("SORT-KEY");

    private static final SubLSymbol $PREFERRED_GENERATION = makeKeyword("PREFERRED-GENERATION");



    private static final SubLSymbol GLOSSARY_TERM_MAPPER_SORT_KEY = makeSymbol("GLOSSARY-TERM-MAPPER-SORT-KEY");

    private static final SubLSymbol GLOSSARY_SORT_KEY_FROM_STRING = makeSymbol("GLOSSARY-SORT-KEY-FROM-STRING");

    static private final SubLString $str_alt45$ = makeString("");

    public static final SubLObject $$nonPlural_Generic = constant_handles.reader_make_constant_shell(makeString("nonPlural-Generic"));

    static private final SubLList $list_alt47 = list(makeKeyword("ABBREVS"), makeKeyword("ACRONYMS"));

    private static final SubLSymbol PPH_REMOVE_HTML_TAGS = makeSymbol("PPH-REMOVE-HTML-TAGS");



    private static final SubLSymbol $PREFERRED_HTML = makeKeyword("PREFERRED-HTML");

    private static final SubLSymbol $SIMILAR_TERMS = makeKeyword("SIMILAR-TERMS");



    private static final SubLSymbol $INSTANCES = makeKeyword("INSTANCES");

    private static final SubLSymbol $INSTANCE_CLASSIFICATION = makeKeyword("INSTANCE-CLASSIFICATION");

    private static final SubLSymbol UIA_GLOSSARY_INSTANCE_CLASSIFICATION_MEMOIZED = makeSymbol("UIA-GLOSSARY-INSTANCE-CLASSIFICATION-MEMOIZED");

    public static final SubLObject $$uiaGlossaryInstanceClassification = constant_handles.reader_make_constant_shell(makeString("uiaGlossaryInstanceClassification"));

    static private final SubLString $$$Unclassified_Instances = makeString("Unclassified Instances");



    public static final SubLObject $$glossaryClarifyingString = constant_handles.reader_make_constant_shell(makeString("glossaryClarifyingString"));

    static private final SubLList $list_alt60 = list($SENT);

    // // Initializers
    public void declareFunctions() {
        declare_uia_tools_glossary_file();
    }

    public void initializeVariables() {
        init_uia_tools_glossary_file();
    }

    public void runTopLevelForms() {
        setup_uia_tools_glossary_file();
    }
}

