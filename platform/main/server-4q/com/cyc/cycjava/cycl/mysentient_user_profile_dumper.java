/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      MYSENTIENT-USER-PROFILE-DUMPER
 *  source file: /cyc/top/cycl/mysentient-user-profile-dumper.lisp
 *  created:     2019/07/03 17:39:03
 */
public final class mysentient_user_profile_dumper extends SubLTranslatedFile implements V02 {
    // // Constructor
    private mysentient_user_profile_dumper() {
    }

    public static final SubLFile me = new mysentient_user_profile_dumper();


    // // Definitions
    /**
     * Returns a list of known MySentient users whose profiles can be obtained from mysentient-get-assertions-about-user
     *
     * @param FILTER?
     * 		(default: t) Whether to omit users whose profiles are missing.
     * @param MT
     * 		(default: *mysentient-user-profile-information-mt*) Microtheory to base search on.
     * @return 0 List of users.
     */
    public static final SubLObject mysentient_available_users(SubLObject filterP, SubLObject mt) {
        if (filterP == UNPROVIDED) {
            filterP = T;
        }
        if (mt == UNPROVIDED) {
            mt = $$MySentientUserProfileGMt;
        }
        SubLTrampolineFile.checkType(mt, HLMT_P);
        {
            SubLObject users = ask_utilities.query_variable($USER, $list_alt3, mt, UNPROVIDED);
            return NIL != filterP ? ((SubLObject) (list_utilities.remove_if_not(symbol_function(GET_MYSENTIENT_USER_PROFILE_MT), users, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : users;
        }
    }

    public static final SubLObject assertion_universal_time_or_zero(SubLObject assertion) {
        {
            SubLObject time = assertion_utilities.assertion_universal_time(assertion);
            return NIL != time ? ((SubLObject) (time)) : ZERO_INTEGER;
        }
    }

    /**
     * Returns as a list the set of assertions comprising the user's profile.
     *
     * @param USER
     * 		User whose profile is required.
     * @param INCLUDE-SESSION-MTS?
     * 		(default: nil) Whether to extract information from the user's extant sessions.
     * @param INCLUDE-LEXICAL-MTS?
     * 		(default: t) Whether to include information about lexification.
     * @param FILTER-IRRELEVANT?
     * 		(default: t) Whether to omit assertions that include irrelevant terms.
     * @return 0 List of assertions, sorted by assertion time.
     */
    public static final SubLObject mysentient_get_assertions_about_user(SubLObject user, SubLObject include_session_mtsP, SubLObject include_lexical_mtsP, SubLObject filter_irrelevantP) {
        if (include_session_mtsP == UNPROVIDED) {
            include_session_mtsP = NIL;
        }
        if (include_lexical_mtsP == UNPROVIDED) {
            include_lexical_mtsP = T;
        }
        if (filter_irrelevantP == UNPROVIDED) {
            filter_irrelevantP = T;
        }
        SubLTrampolineFile.checkType(user, FORT_P);
        SubLTrampolineFile.checkType(include_session_mtsP, BOOLEANP);
        SubLTrampolineFile.checkType(include_lexical_mtsP, BOOLEANP);
        SubLTrampolineFile.checkType(filter_irrelevantP, BOOLEANP);
        {
            SubLObject profile_mt = hlmt_czer.coerce_to_hlmt(mysentient_user_profile_manager_widgets.get_mysentient_user_profile_mt(user, UNPROVIDED));
            SubLObject session_mts = mysentient_user_profile_manager_widgets.get_all_mysentient_userprofile_session_mts_from_user_profile(profile_mt, UNPROVIDED);
            SubLObject lexical_mts = mysentient_user_profile_manager_widgets.get_mysentient_userprofile_lexical_mts(profile_mt, UNPROVIDED);
            SubLObject mts = cconcatenate(list(profile_mt), new SubLObject[]{ NIL != include_session_mtsP ? ((SubLObject) (session_mts)) : NIL, NIL != include_lexical_mtsP ? ((SubLObject) (lexical_mts)) : NIL });
            SubLObject assertions = NIL;
            SubLObject cdolist_list_var = mts;
            SubLObject mt = NIL;
            for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                if (NIL != kb_mapping_macros.do_mt_index_key_validator(hlmt_czer.coerce_to_hlmt(mt), NIL)) {
                    {
                        SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(hlmt_czer.coerce_to_hlmt(mt));
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                            {
                                SubLObject done_var = NIL;
                                SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    {
                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                        SubLObject valid = makeBoolean(token_var != assertion);
                                        if (NIL != valid) {
                                            if (NIL == rkf_relevance_utilities.rkf_irrelevant_formula(uncanonicalizer.assertion_el_formula(assertion), mysentient_utilities.$mysentient_user_profile_information_mt$.getGlobalValue())) {
                                                assertions = cons(assertion, assertions);
                                            }
                                        }
                                        done_var = makeBoolean(NIL == valid);
                                    }
                                } 
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                    }
                }
            }
            return Sort.sort(assertions, symbol_function($sym12$_), symbol_function(ASSERTION_UNIVERSAL_TIME_OR_ZERO));
        }
    }

    public static final SubLObject mysentient_dump_user_profile_from_sentences_or_assertions(SubLObject user, SubLObject sentences_or_assertions, SubLObject show_cyclP, SubLObject link_termsP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $mysentient_user_profile_dumper_requires_assertionsP$.getDynamicValue(thread)) {
                return mysentient_dump_user_profile_from_assertions(user, sentences_or_assertions, show_cyclP, link_termsP);
            } else {
                return mysentient_dump_user_profile_from_sentences(user, sentences_or_assertions, NIL, show_cyclP, link_termsP);
            }
        }
    }

    /**
     * Outputs an HTML document giving facts from the user's profile.
     *
     * @param USER
     * 		The CycL constant for the user of interest.
     * @param ASSERTIONS
     * 		The assertions to report on.
     * @param SHOW-CYCL?
     * 		(default: nil) Whether to show the CycL for each sentences as part of the HTML, or simply put it in an HTML comment.
     * @param LINK-TERMS?
     * 		(default: nil) Whether to link CycL terms (in CycL and in paraphrases) to the term pages, or to make the HTML page independent of a Cyc image.
     */
    public static final SubLObject mysentient_dump_user_profile_from_assertions(SubLObject user, SubLObject assertions, SubLObject show_cyclP, SubLObject link_termsP) {
        if (show_cyclP == UNPROVIDED) {
            show_cyclP = NIL;
        }
        if (link_termsP == UNPROVIDED) {
            link_termsP = NIL;
        }
        SubLTrampolineFile.checkType(user, FORT_P);
        SubLTrampolineFile.checkType(assertions, LISTP);
        SubLTrampolineFile.checkType(show_cyclP, BOOLEANP);
        SubLTrampolineFile.checkType(link_termsP, BOOLEANP);
        {
            SubLObject sentences = Mapping.mapcar(ASSERTION_EL_FORMULA, assertions);
            return mysentient_dump_user_profile_from_sentences(user, sentences, assertions, show_cyclP, link_termsP);
        }
    }

    public static final SubLObject mysentient_dump_user_profile_from_sentences(SubLObject user, SubLObject sentences, SubLObject assertions, SubLObject show_cyclP, SubLObject link_termsP) {
        if (assertions == UNPROVIDED) {
            assertions = NIL;
        }
        if (show_cyclP == UNPROVIDED) {
            show_cyclP = NIL;
        }
        if (link_termsP == UNPROVIDED) {
            link_termsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject profile_mt = hlmt_czer.coerce_to_hlmt(mysentient_user_profile_manager_widgets.get_mysentient_user_profile_mt(user, UNPROVIDED));
                SubLObject generation_mt = mysentient_user_profile_manager_widgets.get_mysentient_userprofile_generation_mt(profile_mt, UNPROVIDED);
                if (NIL == generation_mt) {
                    generation_mt = $$EnglishMt;
                }
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ(NIL != show_cyclP ? ((SubLObject) (format(NIL, $str_alt27$_A___A_, pph_main.generate_phrase(list($list_alt28, user), $ANY, NIL, generation_mt, profile_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED), user))) : format(NIL, $str_alt30$_A, pph_main.generate_phrase(list($list_alt28, user), $ANY, NIL, generation_mt, profile_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
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
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup(TWO_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_utilities.html_princ(NIL != show_cyclP ? ((SubLObject) (format(NIL, $str_alt27$_A___A_, pph_main.generate_phrase(list($list_alt28, user), $ANY, NIL, generation_mt, profile_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED), user))) : format(NIL, $str_alt30$_A, pph_main.generate_phrase(list($list_alt28, user), $ANY, NIL, generation_mt, profile_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(TWO_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject counter = ZERO_INTEGER;
                                        SubLObject assertion = NIL;
                                        SubLObject assertion_2 = NIL;
                                        SubLObject sentence = NIL;
                                        SubLObject sentence_3 = NIL;
                                        for (assertion = assertions, assertion_2 = assertion.first(), sentence = sentences, sentence_3 = sentence.first(); !((NIL == sentence) && (NIL == assertion)); assertion = assertion.rest() , assertion_2 = assertion.first() , sentence = sentence.rest() , sentence_3 = sentence.first()) {
                                            html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                                            html_utilities.html_princ(format(NIL, $str_alt31$_D__, add(ONE_INTEGER, counter)));
                                            if (NIL != link_termsP) {
                                                html_utilities.html_markup(pph_main.generate_text_wXsentential_force(sentence_3, $DECLARATIVE, $ANY, generation_mt, profile_mt, $HTML, UNPROVIDED));
                                            } else {
                                                html_utilities.html_princ(pph_main.generate_text_wXsentential_force(sentence_3, $DECLARATIVE, $ANY, generation_mt, profile_mt, $TEXT, UNPROVIDED));
                                            }
                                            html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                                            if (NIL != show_cyclP) {
                                                html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                                                if (NIL != link_termsP) {
                                                    if (NIL != assertion_2) {
                                                        cb_utilities.cb_form(assertion_2, UNPROVIDED, UNPROVIDED);
                                                    } else {
                                                        cb_utilities.cb_form(sentence_3, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } else {
                                                    html_utilities.html_princ(sentence_3);
                                                }
                                                html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                                            } else {
                                                html_utilities.html_markup(html_macros.$html_comment_head$.getGlobalValue());
                                                {
                                                    SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_princ(sentence_3);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_comment_tail$.getGlobalValue());
                                            }
                                            counter = add(counter, ONE_INTEGER);
                                        }
                                    }
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
            }
            return NIL;
        }
    }

    /**
     * Outputs an HTML document giving facts from the user's profile.
     *
     * @param USER
     * 		The CycL constant for the user of interest.
     * @param SHOW-CYCL?
     * 		(default: nil) Whether to show the CycL for each sentences as part of the HTML, or simply put it in an HTML comment.
     * @param LINK-TERMS?
     * 		(default: nil) Whether to link CycL terms (in CycL and in paraphrases) to the term pages, or to make the HTML page independent of a Cyc image.
     * @param INCLUDE-SESSION-MTS?
     * 		(default: nil) Whether to emit facts asserted in any extant sessions.
     * @param INCLUDE-LEXICAL-MTS?
     * 		(default: t) Whether to emit facts asserted in the user's parsing and generation microtheries.
     * @param FILTER-IRRELEVANT
     * 		(default t) Whether to omit facts that include irrelevant terms.
     */
    public static final SubLObject mysentient_dump_user_profile(SubLObject user, SubLObject show_cyclP, SubLObject link_termsP, SubLObject include_session_mtsP, SubLObject include_lexical_mtsP, SubLObject filter_irrelevantP) {
        if (show_cyclP == UNPROVIDED) {
            show_cyclP = NIL;
        }
        if (link_termsP == UNPROVIDED) {
            link_termsP = NIL;
        }
        if (include_session_mtsP == UNPROVIDED) {
            include_session_mtsP = NIL;
        }
        if (include_lexical_mtsP == UNPROVIDED) {
            include_lexical_mtsP = T;
        }
        if (filter_irrelevantP == UNPROVIDED) {
            filter_irrelevantP = T;
        }
        SubLTrampolineFile.checkType(user, FORT_P);
        SubLTrampolineFile.checkType(show_cyclP, BOOLEANP);
        SubLTrampolineFile.checkType(link_termsP, BOOLEANP);
        SubLTrampolineFile.checkType(include_session_mtsP, BOOLEANP);
        SubLTrampolineFile.checkType(include_lexical_mtsP, BOOLEANP);
        SubLTrampolineFile.checkType(filter_irrelevantP, BOOLEANP);
        {
            SubLObject sentences_or_assertions = mysentient_get_interesting_assertions_about_user(user);
            mysentient_dump_user_profile_from_sentences_or_assertions(user, sentences_or_assertions, show_cyclP, link_termsP);
        }
        return NIL;
    }

    /**
     * If T, we will only dump out sentences corresponding to assertions in the KB.
     * If NIL, we may also include some sentences that are deducible but do not
     * correspond to any assertion in the KB.
     */
    // defparameter
    public static final SubLSymbol $mysentient_user_profile_dumper_requires_assertionsP$ = makeSymbol("*MYSENTIENT-USER-PROFILE-DUMPER-REQUIRES-ASSERTIONS?*");







    public static final SubLObject mysentient_get_interesting_assertions_about_user(SubLObject user) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(user, FORT_P);
            {
                SubLObject query = (NIL != $mysentient_user_profile_dumper_requires_assertionsP$.getDynamicValue(thread)) ? ((SubLObject) (constants_high.find_constant($mysentient_interesting_assertions_about_user_query$.getDynamicValue(thread)))) : constants_high.find_constant($mysentient_interesting_sentences_about_user_query$.getDynamicValue(thread));
                if (NIL == query) {
                    return NIL;
                }
                {
                    SubLObject ans = NIL;
                    try {
                        {
                            SubLObject sentence = kb_query.kbq_sentence(query);
                            SubLObject v_properties = kb_query.kbq_query_properties(query);
                            SubLObject mt = kb_query.kbq_mt(query);
                            SubLObject var = $sym46$_ASSERTION;
                            sentence = cycl_utilities.expression_subst(user, $INPUT, sentence, UNPROVIDED, UNPROVIDED);
                            sentence = cycl_utilities.expression_subst(var, $OUTPUT, sentence, UNPROVIDED, UNPROVIDED);
                            reassert_user_profile_dumper_rules_with_direction($FORWARD);
                            thread.resetMultipleValues();
                            {
                                SubLObject results = ask_utilities.query_variable(var, sentence, mt, v_properties);
                                SubLObject halt_reason = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != $mysentient_filter_irrelevant_assertions$.getDynamicValue(thread)) {
                                    if (NIL != $mysentient_user_profile_dumper_requires_assertionsP$.getDynamicValue(thread)) {
                                        results = remove_if(symbol_function($sym50$IRRELEVANT_ASSERTION_), results, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else {
                                        results = remove_if(symbol_function($sym51$IRRELEVANT_SENTENCE_), results, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                }
                                ans = results;
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                reassert_user_profile_dumper_rules_with_direction($BACKWARD);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    return ans;
                }
            }
        }
    }

    public static final SubLObject irrelevant_assertionP(SubLObject assertion) {
        return rkf_relevance_utilities.rkf_irrelevant_formula(uncanonicalizer.assertion_el_formula(assertion), mysentient_utilities.$mysentient_user_profile_information_mt$.getGlobalValue());
    }

    public static final SubLObject irrelevant_sentenceP(SubLObject sentence) {
        return rkf_relevance_utilities.rkf_irrelevant_formula(sentence, mysentient_utilities.$mysentient_user_profile_information_mt$.getGlobalValue());
    }

    /**
     * This is the entry point being called by MySentient as of 2/10/05.
     */
    public static final SubLObject mysentient_save_interesting_assertions_about_user(SubLObject user, SubLObject file) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $mysentient_user_profile_dumper_requires_assertionsP$.currentBinding(thread);
                try {
                    $mysentient_user_profile_dumper_requires_assertionsP$.bind(NIL != constants_high.find_constant($mysentient_interesting_sentences_about_user_query$.getDynamicValue(thread)) ? ((SubLObject) ($mysentient_user_profile_dumper_requires_assertionsP$.getDynamicValue(thread))) : T, thread);
                    {
                        SubLObject stream = NIL;
                        try {
                            {
                                SubLObject _prev_bind_0_5 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                try {
                                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                    stream = compatibility.open_text(file, $OUTPUT, NIL);
                                } finally {
                                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_5, thread);
                                }
                            }
                            if (!stream.isStream()) {
                                Errors.error($str_alt54$Unable_to_open__S, file);
                            }
                            {
                                SubLObject stream_6 = stream;
                                {
                                    SubLObject _prev_bind_0_7 = html_macros.$html_stream$.currentBinding(thread);
                                    try {
                                        html_macros.$html_stream$.bind(stream_6, thread);
                                        mysentient_dump_user_profile_from_sentences_or_assertions(user, mysentient_get_interesting_assertions_about_user(user), NIL, NIL);
                                    } finally {
                                        html_macros.$html_stream$.rebind(_prev_bind_0_7, thread);
                                    }
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0_8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    if (stream.isStream()) {
                                        close(stream, UNPROVIDED);
                                    }
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_8, thread);
                                }
                            }
                        }
                    }
                } finally {
                    $mysentient_user_profile_dumper_requires_assertionsP$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }







    public static final SubLObject mysentient_save_interesting_assertions_about_all_users(SubLObject dir) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject users = mysentient_available_users(T, UNPROVIDED);
                SubLObject example_user_collection = constants_high.find_constant($$$MySentientExampleUser);
                SubLObject cdolist_list_var = users;
                SubLObject user = NIL;
                for (user = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , user = cdolist_list_var.first()) {
                    if (!((NIL != example_user_collection) && (NIL != isa.isaP(user, example_user_collection, UNPROVIDED, UNPROVIDED)))) {
                        {
                            SubLObject name = constants_high.constant_name(user);
                            SubLObject file = cconcatenate(dir, new SubLObject[]{ $mysentient_path_separator$.getDynamicValue(thread), name, $mysentient_html_extension$.getDynamicValue(thread) });
                            mysentient_save_interesting_assertions_about_user(user, file);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject reassert_user_profile_dumper_rules_with_direction(SubLObject direction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(direction, DIRECTION_P);
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    {
                        SubLObject pred_var = $const65$mySentientUserProfileDumperForwar;
                        if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                            {
                                SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                SubLObject done_var = NIL;
                                SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    {
                                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        SubLObject valid = makeBoolean(token_var != final_index_spec);
                                        if (NIL != valid) {
                                            {
                                                SubLObject final_index_iterator = NIL;
                                                try {
                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                    {
                                                        SubLObject done_var_9 = NIL;
                                                        SubLObject token_var_10 = NIL;
                                                        while (NIL == done_var_9) {
                                                            {
                                                                SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_10);
                                                                SubLObject valid_11 = makeBoolean(token_var_10 != gaf);
                                                                if (NIL != valid_11) {
                                                                    {
                                                                        SubLObject rule = assertions_high.gaf_arg1(gaf);
                                                                        SubLObject strength = assertions_high.assertion_strength(rule);
                                                                        ke.ke_reassert_assertion_now_int(rule, strength, direction);
                                                                    }
                                                                }
                                                                done_var_9 = makeBoolean(NIL == valid_11);
                                                            }
                                                        } 
                                                    }
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            if (NIL != final_index_iterator) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                            }
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_12, thread);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        done_var = makeBoolean(NIL == valid);
                                    }
                                } 
                            }
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return direction;
        }
    }

    public static final SubLObject subloop_reserved_initialize_test_battery_for_mysentient_user_profile_dumper_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_test_battery_for_mysentient_user_profile_dumper_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        return NIL;
    }

    public static final SubLObject test_battery_for_mysentient_user_profile_dumper_p(SubLObject test_battery_for_mysentient_user_profile_dumper) {
        return classes.subloop_instanceof_class(test_battery_for_mysentient_user_profile_dumper, TEST_BATTERY_FOR_MYSENTIENT_USER_PROFILE_DUMPER);
    }

    // deflexical
    private static final SubLSymbol $mysentient_user_profile_dumper_test_user$ = makeSymbol("*MYSENTIENT-USER-PROFILE-DUMPER-TEST-USER*");

    public static final SubLObject declare_mysentient_user_profile_dumper_file() {
        declareFunction("mysentient_available_users", "MYSENTIENT-AVAILABLE-USERS", 0, 2, false);
        declareFunction("assertion_universal_time_or_zero", "ASSERTION-UNIVERSAL-TIME-OR-ZERO", 1, 0, false);
        declareFunction("mysentient_get_assertions_about_user", "MYSENTIENT-GET-ASSERTIONS-ABOUT-USER", 1, 3, false);
        declareFunction("mysentient_dump_user_profile_from_sentences_or_assertions", "MYSENTIENT-DUMP-USER-PROFILE-FROM-SENTENCES-OR-ASSERTIONS", 4, 0, false);
        declareFunction("mysentient_dump_user_profile_from_assertions", "MYSENTIENT-DUMP-USER-PROFILE-FROM-ASSERTIONS", 2, 2, false);
        declareFunction("mysentient_dump_user_profile_from_sentences", "MYSENTIENT-DUMP-USER-PROFILE-FROM-SENTENCES", 2, 3, false);
        declareFunction("mysentient_dump_user_profile", "MYSENTIENT-DUMP-USER-PROFILE", 1, 5, false);
        declareFunction("mysentient_get_interesting_assertions_about_user", "MYSENTIENT-GET-INTERESTING-ASSERTIONS-ABOUT-USER", 1, 0, false);
        declareFunction("irrelevant_assertionP", "IRRELEVANT-ASSERTION?", 1, 0, false);
        declareFunction("irrelevant_sentenceP", "IRRELEVANT-SENTENCE?", 1, 0, false);
        declareFunction("mysentient_save_interesting_assertions_about_user", "MYSENTIENT-SAVE-INTERESTING-ASSERTIONS-ABOUT-USER", 2, 0, false);
        declareFunction("mysentient_save_interesting_assertions_about_all_users", "MYSENTIENT-SAVE-INTERESTING-ASSERTIONS-ABOUT-ALL-USERS", 1, 0, false);
        declareFunction("reassert_user_profile_dumper_rules_with_direction", "REASSERT-USER-PROFILE-DUMPER-RULES-WITH-DIRECTION", 1, 0, false);
        declareFunction("subloop_reserved_initialize_test_battery_for_mysentient_user_profile_dumper_class", "SUBLOOP-RESERVED-INITIALIZE-TEST-BATTERY-FOR-MYSENTIENT-USER-PROFILE-DUMPER-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_test_battery_for_mysentient_user_profile_dumper_instance", "SUBLOOP-RESERVED-INITIALIZE-TEST-BATTERY-FOR-MYSENTIENT-USER-PROFILE-DUMPER-INSTANCE", 1, 0, false);
        declareFunction("test_battery_for_mysentient_user_profile_dumper_p", "TEST-BATTERY-FOR-MYSENTIENT-USER-PROFILE-DUMPER-P", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_mysentient_user_profile_dumper_file() {
        defparameter("*MYSENTIENT-USER-PROFILE-DUMPER-REQUIRES-ASSERTIONS?*", NIL);
        defparameter("*MYSENTIENT-INTERESTING-ASSERTIONS-ABOUT-USER-QUERY*", $str_alt41$MySentientInterestingAssertionsAb);
        defparameter("*MYSENTIENT-INTERESTING-SENTENCES-ABOUT-USER-QUERY*", $str_alt43$MySentientInterestingSentencesAbo);
        defparameter("*MYSENTIENT-FILTER-IRRELEVANT-ASSERTIONS*", T);
        defparameter("*MYSENTIENT-PATH-SEPARATOR*", $str_alt56$_);
        defparameter("*MYSENTIENT-HTML-EXTENSION*", $str_alt58$_html);
        defparameter("*MYSENTIENT-EXCLUDE-EXAMPLE-USERS*", T);
        deflexical("*MYSENTIENT-USER-PROFILE-DUMPER-TEST-USER*", $$JaneDoe);
        return NIL;
    }

    public static final SubLObject setup_mysentient_user_profile_dumper_file() {
                utilities_macros.register_cyc_api_function(MYSENTIENT_AVAILABLE_USERS, $list_alt6, $str_alt7$Returns_a_list_of_known_MySentien, $list_alt8, $list_alt9);
        utilities_macros.register_cyc_api_function(MYSENTIENT_GET_ASSERTIONS_ABOUT_USER, $list_alt15, $str_alt16$Returns_as_a_list_the_set_of_asse, $list_alt17, $list_alt18);
        utilities_macros.register_cyc_api_function(MYSENTIENT_DUMP_USER_PROFILE_FROM_ASSERTIONS, $list_alt22, $str_alt23$Outputs_an_HTML_document_giving_f, $list_alt24, $list_alt25);
        utilities_macros.register_cyc_api_function(MYSENTIENT_DUMP_USER_PROFILE, $list_alt36, $str_alt37$Outputs_an_HTML_document_giving_f, $list_alt38, $list_alt25);
        access_macros.register_external_symbol($sym39$_MYSENTIENT_USER_PROFILE_DUMPER_REQUIRES_ASSERTIONS__);
        access_macros.register_external_symbol($mysentient_interesting_assertions_about_user_query$);
        access_macros.register_external_symbol($mysentient_interesting_sentences_about_user_query$);
        access_macros.register_external_symbol($mysentient_filter_irrelevant_assertions$);
        access_macros.register_external_symbol(MYSENTIENT_GET_INTERESTING_ASSERTIONS_ABOUT_USER);
        access_macros.register_external_symbol(MYSENTIENT_SAVE_INTERESTING_ASSERTIONS_ABOUT_USER);
        access_macros.register_external_symbol($mysentient_path_separator$);
        access_macros.register_external_symbol($mysentient_html_extension$);
        access_macros.register_external_symbol($mysentient_exclude_example_users$);
        access_macros.register_external_symbol(MYSENTIENT_SAVE_INTERESTING_ASSERTIONS_ABOUT_ALL_USERS);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(TEST_BATTERY_FOR_MYSENTIENT_USER_PROFILE_DUMPER, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(TEST_BATTERY_FOR_MYSENTIENT_USER_PROFILE_DUMPER);
        classes.subloop_new_class(TEST_BATTERY_FOR_MYSENTIENT_USER_PROFILE_DUMPER, TEST_CASE, NIL, NIL, $list_alt70);
        classes.class_set_implements_slot_listeners(TEST_BATTERY_FOR_MYSENTIENT_USER_PROFILE_DUMPER, NIL);
        classes.subloop_note_class_initialization_function(TEST_BATTERY_FOR_MYSENTIENT_USER_PROFILE_DUMPER, $sym79$SUBLOOP_RESERVED_INITIALIZE_TEST_BATTERY_FOR_MYSENTIENT_USER_PROF);
        classes.subloop_note_instance_initialization_function(TEST_BATTERY_FOR_MYSENTIENT_USER_PROFILE_DUMPER, $sym84$SUBLOOP_RESERVED_INITIALIZE_TEST_BATTERY_FOR_MYSENTIENT_USER_PROF);
        subloop_reserved_initialize_test_battery_for_mysentient_user_profile_dumper_class(TEST_BATTERY_FOR_MYSENTIENT_USER_PROFILE_DUMPER);
        sunit_macros.define_test_case_postamble(TEST_BATTERY_FOR_MYSENTIENT_USER_PROFILE_DUMPER, $str_alt85$mysentient_user_profile_dumper, $$$cycl, NIL);
        sunit_macros.def_test_method_register(TEST_BATTERY_FOR_MYSENTIENT_USER_PROFILE_DUMPER, TEST_MYSENTIENT_AVAILABLE_USERS_TEST_USER);
        sunit_macros.def_test_method_register(TEST_BATTERY_FOR_MYSENTIENT_USER_PROFILE_DUMPER, TEST_MYSENTIENT_AVAILABLE_USERS_FILTER);
        sunit_macros.def_test_method_register(TEST_BATTERY_FOR_MYSENTIENT_USER_PROFILE_DUMPER, TEST_MYSENTIENT_GET_ASSERTIONS_ABOUT_USER_BASIC);
        return NIL;
    }

    // // Internal Constants
    public static final SubLObject $$MySentientUserProfileGMt = constant_handles.reader_make_constant_shell(makeString("MySentientUserProfileGMt"));





    static private final SubLList $list_alt3 = list(constant_handles.reader_make_constant_shell(makeString("isa")), $USER, constant_handles.reader_make_constant_shell(makeString("MySentientSystemUser")));

    private static final SubLSymbol GET_MYSENTIENT_USER_PROFILE_MT = makeSymbol("GET-MYSENTIENT-USER-PROFILE-MT");

    private static final SubLSymbol MYSENTIENT_AVAILABLE_USERS = makeSymbol("MYSENTIENT-AVAILABLE-USERS");

    static private final SubLList $list_alt6 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("FILTER?"), T), list(makeSymbol("MT"), constant_handles.reader_make_constant_shell(makeString("MySentientUserProfileGMt"))));

    static private final SubLString $str_alt7$Returns_a_list_of_known_MySentien = makeString("Returns a list of known MySentient users whose profiles can be obtained from mysentient-get-assertions-about-user\n@param FILTER? (default: t) Whether to omit users whose profiles are missing.\n@param MT (default: *mysentient-user-profile-information-mt*) Microtheory to base search on.\n@return 0 List of users.");

    static private final SubLList $list_alt8 = list(list(makeSymbol("MT"), makeSymbol("HLMT-P")));

    static private final SubLList $list_alt9 = list(list(makeSymbol("LIST"), makeSymbol("FORT-P")));





    static private final SubLSymbol $sym12$_ = makeSymbol("<");

    private static final SubLSymbol ASSERTION_UNIVERSAL_TIME_OR_ZERO = makeSymbol("ASSERTION-UNIVERSAL-TIME-OR-ZERO");

    private static final SubLSymbol MYSENTIENT_GET_ASSERTIONS_ABOUT_USER = makeSymbol("MYSENTIENT-GET-ASSERTIONS-ABOUT-USER");

    static private final SubLList $list_alt15 = list(makeSymbol("USER"), makeSymbol("&OPTIONAL"), makeSymbol("INCLUDE-SESSION-MTS?"), list(makeSymbol("INCLUDE-LEXICAL-MTS?"), T), list(makeSymbol("FILTER-IRRELEVANT?"), T));

    static private final SubLString $str_alt16$Returns_as_a_list_the_set_of_asse = makeString("Returns as a list the set of assertions comprising the user\'s profile.\n@param USER User whose profile is required.\n@param INCLUDE-SESSION-MTS? (default: nil) Whether to extract information from the user\'s extant sessions.\n@param INCLUDE-LEXICAL-MTS? (default: t) Whether to include information about lexification.\n@param FILTER-IRRELEVANT? (default: t) Whether to omit assertions that include irrelevant terms.\n@return 0 List of assertions, sorted by assertion time.");

    static private final SubLList $list_alt17 = list(list(makeSymbol("USER"), makeSymbol("FORT-P")), list(makeSymbol("INCLUDE-SESSION-MTS?"), makeSymbol("BOOLEANP")), list(makeSymbol("INCLUDE-LEXICAL-MTS?"), makeSymbol("BOOLEANP")), list(makeSymbol("FILTER-IRRELEVANT?"), makeSymbol("BOOLEANP")));

    static private final SubLList $list_alt18 = list(list(makeSymbol("LIST"), makeSymbol("ASSERTION-P")));



    private static final SubLSymbol ASSERTION_EL_FORMULA = makeSymbol("ASSERTION-EL-FORMULA");

    private static final SubLSymbol MYSENTIENT_DUMP_USER_PROFILE_FROM_ASSERTIONS = makeSymbol("MYSENTIENT-DUMP-USER-PROFILE-FROM-ASSERTIONS");

    static private final SubLList $list_alt22 = list(makeSymbol("USER"), makeSymbol("ASSERTIONS"), makeSymbol("&OPTIONAL"), makeSymbol("SHOW-CYCL?"), makeSymbol("LINK-TERMS?"));

    static private final SubLString $str_alt23$Outputs_an_HTML_document_giving_f = makeString("Outputs an HTML document giving facts from the user\'s profile.\n@param USER The CycL constant for the user of interest.\n@param ASSERTIONS The assertions to report on.\n@param SHOW-CYCL? (default: nil) Whether to show the CycL for each sentences as part of the HTML, or simply put it in an HTML comment.\n@param LINK-TERMS? (default: nil) Whether to link CycL terms (in CycL and in paraphrases) to the term pages, or to make the HTML page independent of a Cyc image.");

    static private final SubLList $list_alt24 = list(list(makeSymbol("USER"), makeSymbol("FORT-P")), list(makeSymbol("ASSERTIONS"), makeSymbol("LISTP")), list(makeSymbol("SHOW-CYCL?"), makeSymbol("BOOLEANP")), list(makeSymbol("LINK-TERMS?"), makeSymbol("BOOLEANP")));

    static private final SubLList $list_alt25 = list(makeSymbol("NULL"));

    public static final SubLObject $$EnglishMt = constant_handles.reader_make_constant_shell(makeString("EnglishMt"));

    static private final SubLString $str_alt27$_A___A_ = makeString("~A (~A)");

    static private final SubLList $list_alt28 = list(constant_handles.reader_make_constant_shell(makeString("FunctionToArg")), TWO_INTEGER, constant_handles.reader_make_constant_shell(makeString("mySentientUserProfile")));



    static private final SubLString $str_alt30$_A = makeString("~A");

    static private final SubLString $str_alt31$_D__ = makeString("~D: ");







    private static final SubLSymbol MYSENTIENT_DUMP_USER_PROFILE = makeSymbol("MYSENTIENT-DUMP-USER-PROFILE");

    static private final SubLList $list_alt36 = list(makeSymbol("USER"), makeSymbol("&OPTIONAL"), makeSymbol("SHOW-CYCL?"), makeSymbol("LINK-TERMS?"), makeSymbol("INCLUDE-SESSION-MTS?"), list(makeSymbol("INCLUDE-LEXICAL-MTS?"), T), list(makeSymbol("FILTER-IRRELEVANT?"), T));

    static private final SubLString $str_alt37$Outputs_an_HTML_document_giving_f = makeString("Outputs an HTML document giving facts from the user\'s profile.\n@param USER The CycL constant for the user of interest.\n@param SHOW-CYCL? (default: nil) Whether to show the CycL for each sentences as part of the HTML, or simply put it in an HTML comment.\n@param LINK-TERMS? (default: nil) Whether to link CycL terms (in CycL and in paraphrases) to the term pages, or to make the HTML page independent of a Cyc image.\n@param INCLUDE-SESSION-MTS? (default: nil) Whether to emit facts asserted in any extant sessions.\n@param INCLUDE-LEXICAL-MTS? (default: t) Whether to emit facts asserted in the user\'s parsing and generation microtheries.\n@param FILTER-IRRELEVANT (default t) Whether to omit facts that include irrelevant terms.");

    static private final SubLList $list_alt38 = list(list(makeSymbol("USER"), makeSymbol("FORT-P")), list(makeSymbol("SHOW-CYCL?"), makeSymbol("BOOLEANP")), list(makeSymbol("LINK-TERMS?"), makeSymbol("BOOLEANP")), list(makeSymbol("INCLUDE-SESSION-MTS?"), makeSymbol("BOOLEANP")), list(makeSymbol("INCLUDE-LEXICAL-MTS?"), makeSymbol("BOOLEANP")), list(makeSymbol("FILTER-IRRELEVANT?"), makeSymbol("BOOLEANP")));

    static private final SubLSymbol $sym39$_MYSENTIENT_USER_PROFILE_DUMPER_REQUIRES_ASSERTIONS__ = makeSymbol("*MYSENTIENT-USER-PROFILE-DUMPER-REQUIRES-ASSERTIONS?*");

    public static final SubLSymbol $mysentient_interesting_assertions_about_user_query$ = makeSymbol("*MYSENTIENT-INTERESTING-ASSERTIONS-ABOUT-USER-QUERY*");

    static private final SubLString $str_alt41$MySentientInterestingAssertionsAb = makeString("MySentientInterestingAssertionsAboutUserQuerySpec");

    public static final SubLSymbol $mysentient_interesting_sentences_about_user_query$ = makeSymbol("*MYSENTIENT-INTERESTING-SENTENCES-ABOUT-USER-QUERY*");

    static private final SubLString $str_alt43$MySentientInterestingSentencesAbo = makeString("MySentientInterestingSentencesAboutUserQuerySpec");

    public static final SubLSymbol $mysentient_filter_irrelevant_assertions$ = makeSymbol("*MYSENTIENT-FILTER-IRRELEVANT-ASSERTIONS*");

    private static final SubLSymbol MYSENTIENT_GET_INTERESTING_ASSERTIONS_ABOUT_USER = makeSymbol("MYSENTIENT-GET-INTERESTING-ASSERTIONS-ABOUT-USER");

    static private final SubLSymbol $sym46$_ASSERTION = makeSymbol("?ASSERTION");







    static private final SubLSymbol $sym50$IRRELEVANT_ASSERTION_ = makeSymbol("IRRELEVANT-ASSERTION?");

    static private final SubLSymbol $sym51$IRRELEVANT_SENTENCE_ = makeSymbol("IRRELEVANT-SENTENCE?");



    private static final SubLSymbol MYSENTIENT_SAVE_INTERESTING_ASSERTIONS_ABOUT_USER = makeSymbol("MYSENTIENT-SAVE-INTERESTING-ASSERTIONS-ABOUT-USER");

    static private final SubLString $str_alt54$Unable_to_open__S = makeString("Unable to open ~S");

    public static final SubLSymbol $mysentient_path_separator$ = makeSymbol("*MYSENTIENT-PATH-SEPARATOR*");

    static private final SubLString $str_alt56$_ = makeString("/");

    public static final SubLSymbol $mysentient_html_extension$ = makeSymbol("*MYSENTIENT-HTML-EXTENSION*");

    static private final SubLString $str_alt58$_html = makeString(".html");

    public static final SubLSymbol $mysentient_exclude_example_users$ = makeSymbol("*MYSENTIENT-EXCLUDE-EXAMPLE-USERS*");

    private static final SubLSymbol MYSENTIENT_SAVE_INTERESTING_ASSERTIONS_ABOUT_ALL_USERS = makeSymbol("MYSENTIENT-SAVE-INTERESTING-ASSERTIONS-ABOUT-ALL-USERS");

    static private final SubLString $$$MySentientExampleUser = makeString("MySentientExampleUser");





    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    public static final SubLObject $const65$mySentientUserProfileDumperForwar = constant_handles.reader_make_constant_shell(makeString("mySentientUserProfileDumperForwardRule"));





    private static final SubLSymbol TEST_BATTERY_FOR_MYSENTIENT_USER_PROFILE_DUMPER = makeSymbol("TEST-BATTERY-FOR-MYSENTIENT-USER-PROFILE-DUMPER");



    static private final SubLList $list_alt70 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-MYSENTIENT-AVAILABLE-USERS-TEST-USER"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-MYSENTIENT-AVAILABLE-USERS-FILTER"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-MYSENTIENT-GET-ASSERTIONS-ABOUT-USER-BASIC"), NIL, makeKeyword("PROTECTED")));

















    static private final SubLSymbol $sym79$SUBLOOP_RESERVED_INITIALIZE_TEST_BATTERY_FOR_MYSENTIENT_USER_PROF = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEST-BATTERY-FOR-MYSENTIENT-USER-PROFILE-DUMPER-CLASS");









    static private final SubLSymbol $sym84$SUBLOOP_RESERVED_INITIALIZE_TEST_BATTERY_FOR_MYSENTIENT_USER_PROF = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEST-BATTERY-FOR-MYSENTIENT-USER-PROFILE-DUMPER-INSTANCE");

    static private final SubLString $str_alt85$mysentient_user_profile_dumper = makeString("mysentient-user-profile-dumper");

    static private final SubLString $$$cycl = makeString("cycl");

    public static final SubLObject $$JaneDoe = constant_handles.reader_make_constant_shell(makeString("JaneDoe"));

    private static final SubLSymbol TEST_MYSENTIENT_AVAILABLE_USERS_TEST_USER = makeSymbol("TEST-MYSENTIENT-AVAILABLE-USERS-TEST-USER");

    private static final SubLSymbol TEST_MYSENTIENT_AVAILABLE_USERS_FILTER = makeSymbol("TEST-MYSENTIENT-AVAILABLE-USERS-FILTER");

    private static final SubLSymbol TEST_MYSENTIENT_GET_ASSERTIONS_ABOUT_USER_BASIC = makeSymbol("TEST-MYSENTIENT-GET-ASSERTIONS-ABOUT-USER-BASIC");

    // // Initializers
    public void declareFunctions() {
        declare_mysentient_user_profile_dumper_file();
    }

    public void initializeVariables() {
        init_mysentient_user_profile_dumper_file();
    }

    public void runTopLevelForms() {
        setup_mysentient_user_profile_dumper_file();
    }
}

