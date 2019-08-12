/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      TEXTUAL-ENTAILMENTS
 *  source file: /cyc/top/cycl/textual-entailments.lisp
 *  created:     2019/07/03 17:38:57
 */
public final class textual_entailments extends SubLTranslatedFile implements V02 {
    // // Constructor
    private textual_entailments() {
    }

    public static final SubLFile me = new textual_entailments();

    public static final String myName = "com.cyc.cycjava.cycl.textual_entailments";

    // // Definitions
    /**
     * The #$evaluationDefn for #$TEPQueryContentFromStringFn
     */
    public static final SubLObject tep_query_content_from_string(SubLObject input_string) {
        if (!input_string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        {
            SubLObject sentence = string_utilities.trim_whitespace(string_utilities.strip_chars_meeting_test(input_string, UNPROVIDED));
            SubLObject cyclifier_properties = get_cyclifier_properties($TEXTUAL_INFERENCE);
            SubLObject query_list = get_cycls_for_sentence(sentence, cyclifier_properties, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return el_utilities.make_disjunction(query_list);
        }
    }

    /**
     * The #$evaluationDefn for #$TEPQueryContentFromStringFn
     */
    public static final SubLObject tep_sentence_content_from_string(SubLObject input_string) {
        if (!input_string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        {
            SubLObject sentence = string_utilities.trim_whitespace(string_utilities.strip_chars_meeting_test(input_string, UNPROVIDED));
            SubLObject cyclifier_properties = get_cyclifier_properties($TEXTUAL_INFERENCE);
            SubLObject query_list = ti_pred_strengthen_results(get_cycls_for_sentence(sentence, cyclifier_properties, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
            return el_utilities.make_disjunction(query_list);
        }
    }

    /**
     * The #$evaluationDefn for #$TEPQueryContentFromStringForContextFn
     */
    public static final SubLObject tep_query_content_from_string_for_context(SubLObject input_string, SubLObject mt) {
        if (!input_string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        {
            SubLObject sentence = string_utilities.trim_whitespace(string_utilities.strip_chars_meeting_test(input_string, UNPROVIDED));
            SubLObject cyclifier_properties = get_cyclifier_properties($TEXTUAL_INFERENCE);
            SubLObject query_list = get_cycls_for_sentence(sentence, cyclifier_properties, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject disjunctive_query = el_utilities.make_disjunction(query_list);
            rkf_assertion_utilities.rkf_assert_now(list($$queryForTextualInferenceContext, mt, list($$TheList, disjunctive_query)), mt);
            return disjunctive_query;
        }
    }

    public static final SubLObject tep_query_content_from_string_for_context_memoized_internal(SubLObject input_string, SubLObject mt) {
        return tep_query_content_from_string_for_context(input_string, mt);
    }

    public static final SubLObject tep_query_content_from_string_for_context_memoized(SubLObject input_string, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return tep_query_content_from_string_for_context_memoized_internal(input_string, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, TEP_QUERY_CONTENT_FROM_STRING_FOR_CONTEXT_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), TEP_QUERY_CONTENT_FROM_STRING_FOR_CONTEXT_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, TEP_QUERY_CONTENT_FROM_STRING_FOR_CONTEXT_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(input_string, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw7$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (input_string.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(tep_query_content_from_string_for_context_memoized_internal(input_string, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(input_string, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    /**
     * The #$evaluationDefn for #$TEPQueryContentFromStringForContextFn
     */
    public static final SubLObject tep_conjunctive_query_content_from_string_for_context(SubLObject input_string, SubLObject mt) {
        if (!input_string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        {
            SubLObject sentence = string_utilities.trim_whitespace(string_utilities.strip_chars_meeting_test(input_string, UNPROVIDED));
            SubLObject cyclifier_properties = get_cyclifier_properties($TEXTUAL_INFERENCE);
            SubLObject query_list = get_cycls_for_sentence(sentence, cyclifier_properties, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject conjunctive_query = el_utilities.make_conjunction(query_list);
            rkf_assertion_utilities.rkf_assert_now(list($$queryForTextualInferenceContext, mt, list($$TheList, conjunctive_query)), mt);
            return conjunctive_query;
        }
    }

    public static final SubLObject tep_conjunctive_query_content_from_string_for_context_memoized_internal(SubLObject input_string, SubLObject mt) {
        return tep_conjunctive_query_content_from_string_for_context(input_string, mt);
    }

    public static final SubLObject tep_conjunctive_query_content_from_string_for_context_memoized(SubLObject input_string, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return tep_conjunctive_query_content_from_string_for_context_memoized_internal(input_string, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, TEP_CONJUNCTIVE_QUERY_CONTENT_FROM_STRING_FOR_CONTEXT_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), TEP_CONJUNCTIVE_QUERY_CONTENT_FROM_STRING_FOR_CONTEXT_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, TEP_CONJUNCTIVE_QUERY_CONTENT_FROM_STRING_FOR_CONTEXT_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(input_string, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw7$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (input_string.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(tep_conjunctive_query_content_from_string_for_context_memoized_internal(input_string, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(input_string, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    /**
     * The (new) #$evaluationDefn for #$TEPPremiseContextFromStringFn
     */
    public static final SubLObject tep_premise_context_from_string(SubLObject input_string, SubLObject background_mt, SubLObject ephemeralP) {
        if (background_mt == UNPROVIDED) {
            background_mt = $const10$TextualEntailmentGenericBackgroun;
        }
        if (ephemeralP == UNPROVIDED) {
            ephemeralP = T;
        }
        if (!input_string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return tep_premise_context_from_string_and_cycl(input_string, background_mt, ephemeralP, NIL);
    }

    public static final SubLObject tep_premise_context_from_string_and_cycl(SubLObject input_string, SubLObject background_mt, SubLObject ephemeralP, SubLObject input_cycl) {
        {
            SubLObject sentence = string_utilities.trim_whitespace(string_utilities.strip_chars_meeting_test(input_string, UNPROVIDED));
            SubLObject content_model_mt = create_cyclifier_content_model(sentence, background_mt, ephemeralP, $TEXTUAL_INFERENCE);
            SubLObject collector_mt = update_interps_on_model(content_model_mt, sentence, NIL, ephemeralP, $TEXTUAL_INFERENCE, input_cycl);
            return collector_mt;
        }
    }

    public static final SubLObject tep_premise_context_from_string_memoized_internal(SubLObject input_string, SubLObject background_mt, SubLObject ephemeralP, SubLObject input_cycl) {
        if (background_mt == UNPROVIDED) {
            background_mt = $const10$TextualEntailmentGenericBackgroun;
        }
        if (ephemeralP == UNPROVIDED) {
            ephemeralP = T;
        }
        if (input_cycl == UNPROVIDED) {
            input_cycl = NIL;
        }
        return tep_premise_context_from_string_and_cycl(input_string, background_mt, ephemeralP, input_cycl);
    }

    public static final SubLObject tep_premise_context_from_string_memoized(SubLObject input_string, SubLObject background_mt, SubLObject ephemeralP, SubLObject input_cycl) {
        if (background_mt == UNPROVIDED) {
            background_mt = $const10$TextualEntailmentGenericBackgroun;
        }
        if (ephemeralP == UNPROVIDED) {
            ephemeralP = T;
        }
        if (input_cycl == UNPROVIDED) {
            input_cycl = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return tep_premise_context_from_string_memoized_internal(input_string, background_mt, ephemeralP, input_cycl);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, TEP_PREMISE_CONTEXT_FROM_STRING_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), TEP_PREMISE_CONTEXT_FROM_STRING_MEMOIZED, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, TEP_PREMISE_CONTEXT_FROM_STRING_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_4(input_string, background_mt, ephemeralP, input_cycl);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw7$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (input_string.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (background_mt.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (ephemeralP.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && input_cycl.equal(cached_args.first())) {
                                                    return memoization_state.caching_results(results2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(tep_premise_context_from_string_memoized_internal(input_string, background_mt, ephemeralP, input_cycl)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(input_string, background_mt, ephemeralP, input_cycl));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    // defparameter
    private static final SubLSymbol $available_cyclification_parsers$ = makeSymbol("*AVAILABLE-CYCLIFICATION-PARSERS*");

    public static final SubLObject get_cyclification_parsers() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $available_cyclification_parsers$.getDynamicValue(thread)) {
                $available_cyclification_parsers$.setDynamicValue(list(parser.new_stanford_parser(UNPROVIDED, UNPROVIDED), parser.new_link_parser(UNPROVIDED, UNPROVIDED, UNPROVIDED)), thread);
            }
            return $available_cyclification_parsers$.getDynamicValue(thread);
        }
    }

    public static final SubLObject ti_reformulate_results(SubLObject result_list) {
        {
            SubLObject reformulated_results = NIL;
            SubLObject reformulated_result = NIL;
            SubLObject cdolist_list_var = result_list;
            SubLObject result = NIL;
            for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                reformulated_result = reformulator_hub.reformulate_cycl(result, $$InferencePSC, list($FOCUS, $$ReformulatorRuleUnifier));
                reformulated_results = cons(reformulated_result, reformulated_results);
            }
            return nreverse(reformulated_results);
        }
    }

    // defparameter
    public static final SubLSymbol $ti_catch_errorsP$ = makeSymbol("*TI-CATCH-ERRORS?*");

    /**
     * This calls various parsers (including cyclifier) on a string (sentence) and cleans up the result by dropping results which contain keywords, converting instnacefn term to bound variables (optional), and simplifying the resulting formulas.
     */
    public static final SubLObject get_cycls_for_sentence(SubLObject sentence, SubLObject cyclifier_properties, SubLObject cyclification_parsers, SubLObject mt, SubLObject remove_el_duplicatesP) {
        if (cyclifier_properties == UNPROVIDED) {
            cyclifier_properties = NIL;
        }
        if (cyclification_parsers == UNPROVIDED) {
            cyclification_parsers = get_cyclification_parsers();
        }
        if (mt == UNPROVIDED) {
            mt = $$RKFParsingMt;
        }
        if (remove_el_duplicatesP == UNPROVIDED) {
            remove_el_duplicatesP = T;
        }
        SubLTrampolineFile.checkType(sentence, STRING_OR_UNICODE_NAUT_P);
        {
            SubLObject parsing_timeout_time_remaining = parsing_macros.parsing_timeout_time_remaining();
            SubLObject seconds_remaining = (NIL != parsing_timeout_time_remaining) ? ((SubLObject) (floor(parsing_timeout_time_remaining, UNPROVIDED))) : NIL;
            return get_cycls_for_sentence_memoized(sentence, cyclifier_properties, cyclification_parsers, mt, remove_el_duplicatesP, seconds_remaining, ti_pred_strengthening_max_literal_count());
        }
    }

    public static final SubLObject get_cycls_for_sentence_memoized_internal(SubLObject sentence, SubLObject cyclifier_properties, SubLObject cyclification_parsers, SubLObject mt, SubLObject remove_el_duplicatesP, SubLObject parsing_seconds_remaining, SubLObject pred_strengthening_max_literal_count) {
        if (pred_strengthening_max_literal_count == UNPROVIDED) {
            pred_strengthening_max_literal_count = ti_pred_strengthening_max_literal_count();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject possible_parses = NIL;
                SubLObject how_many = NIL;
                SubLObject subl_sentence = (NIL != unicode_nauts.unicode_naut_p(sentence)) ? ((SubLObject) (unicode_strings.display_to_subl_string(cycl_utilities.nat_arg1(sentence, UNPROVIDED), UNPROVIDED, UNPROVIDED))) : sentence;
                SubLObject cyclifier_results = NIL;
                SubLObject rtp_results = NIL;
                SubLObject ebmt_results = NIL;
                SubLObject timed_outP = NIL;
                SubLObject timeout = (NIL != parsing_seconds_remaining) ? ((SubLObject) (divide(parsing_seconds_remaining, THREE_INTEGER))) : NIL;
                {
                    SubLObject _prev_bind_0 = predicate_strengthener.$pred_strengthening_max_literal_count$.currentBinding(thread);
                    try {
                        predicate_strengthener.$pred_strengthening_max_literal_count$.bind(pred_strengthening_max_literal_count, thread);
                        {
                            SubLObject msg = NIL;
                            try {
                                {
                                    SubLObject _prev_bind_0_1 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                        try {
                                            {
                                                SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                                                try {
                                                    {
                                                        SubLObject _prev_bind_0_2 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                                                        try {
                                                            subl_macro_promotions.$within_with_timeout$.bind(T, thread);
                                                            {
                                                                SubLObject timer = NIL;
                                                                try {
                                                                    {
                                                                        SubLObject _prev_bind_0_3 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                                                        try {
                                                                            subl_macro_promotions.$with_timeout_nesting_depth$.bind(add(ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                                            timer = subl_macro_promotions.with_timeout_start_timer(timeout, tag);
                                                                            rtp_results = rkf_text_processors.parse_a_question_completely_wff(subl_sentence, mt, UNPROVIDED);
                                                                        } finally {
                                                                            subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_3, thread);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            subl_macro_promotions.with_timeout_stop_timer(timer);
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_4, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_2, thread);
                                                        }
                                                    }
                                                } catch (Throwable ccatch_env_var) {
                                                    timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                                                }
                                            }
                                        } catch (Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, NIL);
                                        }
                                    } finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_1, thread);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                            }
                            if (NIL != msg) {
                                Errors.warn($str_alt20$RTP_caught_error__S_while_parsing, msg, sentence);
                            }
                        }
                        {
                            SubLObject msg = NIL;
                            if (NIL != $ti_catch_errorsP$.getDynamicValue(thread)) {
                                try {
                                    {
                                        SubLObject _prev_bind_0_5 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                {
                                                    SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                                                    try {
                                                        {
                                                            SubLObject _prev_bind_0_6 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                                                            try {
                                                                subl_macro_promotions.$within_with_timeout$.bind(T, thread);
                                                                {
                                                                    SubLObject timer = NIL;
                                                                    try {
                                                                        {
                                                                            SubLObject _prev_bind_0_7 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                                                            try {
                                                                                subl_macro_promotions.$with_timeout_nesting_depth$.bind(add(ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                                                timer = subl_macro_promotions.with_timeout_start_timer(timeout, tag);
                                                                                ebmt_results = ebmt_template_parser.ebmt_parse(subl_sentence, UNPROVIDED, UNPROVIDED);
                                                                            } finally {
                                                                                subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_7, thread);
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                subl_macro_promotions.with_timeout_stop_timer(timer);
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_8, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_6, thread);
                                                            }
                                                        }
                                                    } catch (Throwable ccatch_env_var) {
                                                        timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_5, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                            } else {
                                {
                                    SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                                    try {
                                        {
                                            SubLObject _prev_bind_0_9 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                                            try {
                                                subl_macro_promotions.$within_with_timeout$.bind(T, thread);
                                                {
                                                    SubLObject timer = NIL;
                                                    try {
                                                        {
                                                            SubLObject _prev_bind_0_10 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                                            try {
                                                                subl_macro_promotions.$with_timeout_nesting_depth$.bind(add(ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                                timer = subl_macro_promotions.with_timeout_start_timer(timeout, tag);
                                                                ebmt_results = ebmt_template_parser.ebmt_parse(subl_sentence, UNPROVIDED, UNPROVIDED);
                                                            } finally {
                                                                subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_10, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                subl_macro_promotions.with_timeout_stop_timer(timer);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_11, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_9, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                                    }
                                }
                            }
                            if (NIL != msg) {
                                Errors.warn($str_alt21$EBMT_caught_error__S_while_parsin, msg, sentence);
                            }
                        }
                        {
                            SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                            try {
                                {
                                    SubLObject _prev_bind_0_12 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                                    try {
                                        subl_macro_promotions.$within_with_timeout$.bind(T, thread);
                                        {
                                            SubLObject timer = NIL;
                                            try {
                                                {
                                                    SubLObject _prev_bind_0_13 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                                    try {
                                                        subl_macro_promotions.$with_timeout_nesting_depth$.bind(add(ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                        timer = subl_macro_promotions.with_timeout_start_timer(timeout, tag);
                                                        {
                                                            SubLObject cdolist_list_var = cyclification_parsers;
                                                            SubLObject v_parser = NIL;
                                                            for (v_parser = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_parser = cdolist_list_var.first()) {
                                                                {
                                                                    SubLObject v_properties = cconcatenate(list($PARSER, v_parser), cyclifier_properties);
                                                                    SubLObject results = NIL;
                                                                    SubLObject msg = NIL;
                                                                    if (NIL != $ti_catch_errorsP$.getDynamicValue(thread)) {
                                                                        try {
                                                                            {
                                                                                SubLObject _prev_bind_0_14 = Errors.$error_handler$.currentBinding(thread);
                                                                                try {
                                                                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                                                    try {
                                                                                        results = simplify_and_maybe_transform(handle_keyword_results(cyclifier.cyclify(subl_sentence, v_properties)), UNPROVIDED);
                                                                                    } catch (Throwable catch_var) {
                                                                                        Errors.handleThrowable(catch_var, NIL);
                                                                                    }
                                                                                } finally {
                                                                                    Errors.$error_handler$.rebind(_prev_bind_0_14, thread);
                                                                                }
                                                                            }
                                                                        } catch (Throwable ccatch_env_var) {
                                                                            msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                                                        }
                                                                    } else {
                                                                        results = simplify_and_maybe_transform(handle_keyword_results(cyclifier.cyclify(subl_sentence, v_properties)), UNPROVIDED);
                                                                    }
                                                                    if (NIL != msg) {
                                                                        Errors.warn($str_alt23$Cyclify_caught_error__S_while_par, msg, sentence);
                                                                    }
                                                                    if (NIL != results) {
                                                                        cyclifier_results = append(results, cyclifier_results);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_13, thread);
                                                    }
                                                }
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0_15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        subl_macro_promotions.with_timeout_stop_timer(timer);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_15, thread);
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_12, thread);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                            }
                        }
                        if (NIL != timed_outP) {
                            Errors.warn($str_alt24$Timed_out_after__S_seconds_cyclif, timeout, sentence, cyclifier_results);
                        }
                        possible_parses = cconcatenate(cyclifier_results, new SubLObject[]{ ebmt_results, rtp_results });
                        if (NIL != remove_el_duplicatesP) {
                            possible_parses = el_utilities.remove_el_duplicates(possible_parses, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        how_many = length(possible_parses);
                        if (how_many.numG(FOUR_INTEGER)) {
                            Errors.warn($str_alt25$_S_possible_parses__incl__duplica, how_many, sentence);
                        }
                    } finally {
                        predicate_strengthener.$pred_strengthening_max_literal_count$.rebind(_prev_bind_0, thread);
                    }
                }
                return possible_parses;
            }
        }
    }

    public static final SubLObject get_cycls_for_sentence_memoized(SubLObject sentence, SubLObject cyclifier_properties, SubLObject cyclification_parsers, SubLObject mt, SubLObject remove_el_duplicatesP, SubLObject parsing_seconds_remaining, SubLObject pred_strengthening_max_literal_count) {
        if (pred_strengthening_max_literal_count == UNPROVIDED) {
            pred_strengthening_max_literal_count = ti_pred_strengthening_max_literal_count();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return get_cycls_for_sentence_memoized_internal(sentence, cyclifier_properties, cyclification_parsers, mt, remove_el_duplicatesP, parsing_seconds_remaining, pred_strengthening_max_literal_count);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, GET_CYCLS_FOR_SENTENCE_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), GET_CYCLS_FOR_SENTENCE_MEMOIZED, SEVEN_INTEGER, NIL, EQUALP, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, GET_CYCLS_FOR_SENTENCE_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_7(sentence, cyclifier_properties, cyclification_parsers, mt, remove_el_duplicatesP, parsing_seconds_remaining, pred_strengthening_max_literal_count);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw7$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (sentence.equalp(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (cyclifier_properties.equalp(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (cyclification_parsers.equalp(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (mt.equalp(cached_args.first())) {
                                                    cached_args = cached_args.rest();
                                                    if (remove_el_duplicatesP.equalp(cached_args.first())) {
                                                        cached_args = cached_args.rest();
                                                        if (parsing_seconds_remaining.equalp(cached_args.first())) {
                                                            cached_args = cached_args.rest();
                                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && pred_strengthening_max_literal_count.equalp(cached_args.first())) {
                                                                return memoization_state.caching_results(results2);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(get_cycls_for_sentence_memoized_internal(sentence, cyclifier_properties, cyclification_parsers, mt, remove_el_duplicatesP, parsing_seconds_remaining, pred_strengthening_max_literal_count)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(sentence, cyclifier_properties, cyclification_parsers, mt, remove_el_duplicatesP, parsing_seconds_remaining, pred_strengthening_max_literal_count));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    // defparameter
    private static final SubLSymbol $replace_keywords_with_varsP$ = makeSymbol("*REPLACE-KEYWORDS-WITH-VARS?*");

    // defparameter
    private static final SubLSymbol $remove_literals_with_keywordsP$ = makeSymbol("*REMOVE-LITERALS-WITH-KEYWORDS?*");

    public static final SubLObject handle_keyword_results(SubLObject results) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject processed_results = NIL;
                if (NIL != $replace_keywords_with_varsP$.getDynamicValue(thread)) {
                    processed_results = replace_keywords_with_vars(results);
                } else
                    if (NIL != $remove_literals_with_keywordsP$.getDynamicValue(thread)) {
                        processed_results = te_remove_keyword_literals(results);
                    } else {
                        processed_results = delete_if(EXPRESSION_CONTAINS_KEYWORDP, results, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }

                return processed_results;
            }
        }
    }

    public static final SubLObject replace_keywords_with_vars(SubLObject result_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_results = NIL;
                SubLObject cdolist_list_var = result_list;
                SubLObject result = NIL;
                for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject unbound_result = convert_keywords_to_variables(result);
                        SubLObject vars = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        new_results = cons(existentially_bind_vars(unbound_result, vars), new_results);
                    }
                }
                return nreverse(new_results);
            }
        }
    }

    public static final SubLObject te_remove_keyword_literals(SubLObject result_list) {
        {
            SubLObject new_results = NIL;
            SubLObject cdolist_list_var = result_list;
            SubLObject result = NIL;
            for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                {
                    SubLObject cleaned_up = parsing_utilities.remove_keyword_literals(result);
                    SubLObject var = cleaned_up;
                    if (NIL != var) {
                        new_results = cons(var, new_results);
                    }
                }
            }
            return nreverse(new_results);
        }
    }

    // defparameter
    private static final SubLSymbol $new_keyword_vars$ = makeSymbol("*NEW-KEYWORD-VARS*");

    public static final SubLObject convert_keywords_to_variables(SubLObject obj) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_result = NIL;
                SubLObject new_key_vars = NIL;
                {
                    SubLObject _prev_bind_0 = $new_keyword_vars$.currentBinding(thread);
                    try {
                        $new_keyword_vars$.bind(NIL, thread);
                        new_result = cycl_utilities.expression_transform(obj, KEYWORDP, VAR_FROM_KEYWORD, UNPROVIDED, UNPROVIDED);
                        new_key_vars = $new_keyword_vars$.getDynamicValue(thread);
                    } finally {
                        $new_keyword_vars$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(new_result, remove_duplicates(new_key_vars, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            }
        }
    }

    public static final SubLObject var_from_keyword(SubLObject keyword) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                result = read_from_string(cconcatenate($str_alt29$_, princ_to_string(keyword)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != result) {
                    $new_keyword_vars$.setDynamicValue(cons(result, $new_keyword_vars$.getDynamicValue(thread)), thread);
                }
                return result;
            }
        }
    }

    /**
     * should InstanceFn nats be transformed into variables?
     */
    // defparameter
    private static final SubLSymbol $transform_instancefnsP$ = makeSymbol("*TRANSFORM-INSTANCEFNS?*");

    // defparameter
    private static final SubLSymbol $lexicon_for_teps$ = makeSymbol("*LEXICON-FOR-TEPS*");

    public static final SubLObject get_tep_lexicon() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $lexicon_for_teps$.getDynamicValue(thread)) {
                $lexicon_for_teps$.setDynamicValue(get_new_tep_lexicon(), thread);
            }
            return $lexicon_for_teps$.getDynamicValue(thread);
        }
    }

    public static final SubLObject get_new_tep_lexicon() {
        {
            SubLObject lexicon = methods.funcall_instance_method_with_1_args(object.new_class_instance(TEXTUAL_INFERENCE_LEXICON), ALLOW_MT, $const32$SupplementalDeterminerSemTransLex);
            methods.funcall_instance_method_with_1_args(lexicon, ADD_LEARNER, STANFORD_NER_LEARN);
            return lexicon;
        }
    }

    // defparameter
    private static final SubLSymbol $l2r_use_tep_lexiconP$ = makeSymbol("*L2R-USE-TEP-LEXICON?*");

    public static final SubLObject get_new_l2r_lexicon() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $l2r_use_tep_lexiconP$.getDynamicValue(thread)) {
                return NIL;
            }
            {
                SubLObject lexicon = get_new_tep_lexicon();
                SubLObject supplemental_lexicon_collection = constants_high.find_constant($str_alt35$TextLearnerSupplementalLexiconMic);
                if (NIL != forts.fort_p(supplemental_lexicon_collection)) {
                    {
                        SubLObject node_var = supplemental_lexicon_collection;
                        {
                            SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            SubLObject _prev_bind_1 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                            try {
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                {
                                    SubLObject node_var_16 = node_var;
                                    SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                                    SubLObject recur_deck = deck.create_deck(deck_type);
                                    {
                                        SubLObject _prev_bind_0_17 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                            {
                                                SubLObject tv_var = NIL;
                                                {
                                                    SubLObject _prev_bind_0_18 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_19 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                        if (NIL != tv_var) {
                                                            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                    {
                                                                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                        if (pcase_var.eql($ERROR)) {
                                                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt42$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        } else
                                                                            if (pcase_var.eql($CERROR)) {
                                                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt42$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            } else
                                                                                if (pcase_var.eql($WARN)) {
                                                                                    Errors.warn($str_alt42$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                } else {
                                                                                    Errors.warn($str_alt47$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                    Errors.cerror($$$continue_anyway, $str_alt42$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                }


                                                                    }
                                                                }
                                                            }
                                                        }
                                                        {
                                                            SubLObject _prev_bind_0_20 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                            SubLObject _prev_bind_1_21 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                            SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                            SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            try {
                                                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                    {
                                                                        SubLObject _prev_bind_0_22 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1_23 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                        SubLObject _prev_bind_2_24 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_16, UNPROVIDED);
                                                                            while (NIL != node_var_16) {
                                                                                {
                                                                                    SubLObject tt_node_var = node_var_16;
                                                                                    SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                                                    SubLObject cdolist_list_var = accessible_modules;
                                                                                    SubLObject module_var = NIL;
                                                                                    for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                        {
                                                                                            SubLObject _prev_bind_0_25 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                            SubLObject _prev_bind_1_26 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                {
                                                                                                    SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                        {
                                                                                                            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                            if (NIL != d_link) {
                                                                                                                {
                                                                                                                    SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                    if (NIL != mt_links) {
                                                                                                                        {
                                                                                                                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                                thread.resetMultipleValues();
                                                                                                                                {
                                                                                                                                    SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                    SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                        {
                                                                                                                                            SubLObject _prev_bind_0_27 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                            try {
                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                {
                                                                                                                                                    SubLObject iteration_state_28 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_28)) {
                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                        {
                                                                                                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_28);
                                                                                                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                {
                                                                                                                                                                    SubLObject _prev_bind_0_29 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                    try {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                            SubLObject cdolist_list_var_30 = new_list;
                                                                                                                                                                            SubLObject mt_31 = NIL;
                                                                                                                                                                            for (mt_31 = cdolist_list_var_30.first(); NIL != cdolist_list_var_30; cdolist_list_var_30 = cdolist_list_var_30.rest() , mt_31 = cdolist_list_var_30.first()) {
                                                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(mt_31, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(mt_31, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                                                    if (NIL != forts.fort_p(mt_31)) {
                                                                                                                                                                                        methods.funcall_instance_method_with_1_args(lexicon, ALLOW_MT, mt_31);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    } finally {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_29, thread);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            iteration_state_28 = dictionary_contents.do_dictionary_contents_next(iteration_state_28);
                                                                                                                                                        }
                                                                                                                                                    } 
                                                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_28);
                                                                                                                                                }
                                                                                                                                            } finally {
                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_27, thread);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                }
                                                                                                                            } 
                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            } else {
                                                                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                            }
                                                                                                        }
                                                                                                        if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                                                            {
                                                                                                                SubLObject csome_list_var = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                                                                SubLObject instance_tuple = NIL;
                                                                                                                for (instance_tuple = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , instance_tuple = csome_list_var.first()) {
                                                                                                                    {
                                                                                                                        SubLObject datum = instance_tuple;
                                                                                                                        SubLObject current = datum;
                                                                                                                        SubLObject link_node = NIL;
                                                                                                                        SubLObject mt = NIL;
                                                                                                                        SubLObject tv = NIL;
                                                                                                                        destructuring_bind_must_consp(current, datum, $list_alt49);
                                                                                                                        link_node = current.first();
                                                                                                                        current = current.rest();
                                                                                                                        destructuring_bind_must_consp(current, datum, $list_alt49);
                                                                                                                        mt = current.first();
                                                                                                                        current = current.rest();
                                                                                                                        destructuring_bind_must_consp(current, datum, $list_alt49);
                                                                                                                        tv = current.first();
                                                                                                                        current = current.rest();
                                                                                                                        if (NIL == current) {
                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_32 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                            {
                                                                                                                                                SubLObject _prev_bind_0_33 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                    {
                                                                                                                                                        SubLObject link_nodes = list(link_node);
                                                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                        SubLObject cdolist_list_var_34 = new_list;
                                                                                                                                                        SubLObject mt_35 = NIL;
                                                                                                                                                        for (mt_35 = cdolist_list_var_34.first(); NIL != cdolist_list_var_34; cdolist_list_var_34 = cdolist_list_var_34.rest() , mt_35 = cdolist_list_var_34.first()) {
                                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(mt_35, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(mt_35, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                                if (NIL != forts.fort_p(mt_35)) {
                                                                                                                                                                    methods.funcall_instance_method_with_1_args(lexicon, ALLOW_MT, mt_35);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_33, thread);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_32, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            cdestructuring_bind_error(datum, $list_alt49);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else
                                                                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                            {
                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                SubLObject cdolist_list_var_36 = new_list;
                                                                                                                SubLObject generating_fn = NIL;
                                                                                                                for (generating_fn = cdolist_list_var_36.first(); NIL != cdolist_list_var_36; cdolist_list_var_36 = cdolist_list_var_36.rest() , generating_fn = cdolist_list_var_36.first()) {
                                                                                                                    {
                                                                                                                        SubLObject _prev_bind_0_37 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                            {
                                                                                                                                SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                SubLObject new_list_38 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                SubLObject cdolist_list_var_39 = new_list_38;
                                                                                                                                SubLObject mt = NIL;
                                                                                                                                for (mt = cdolist_list_var_39.first(); NIL != cdolist_list_var_39; cdolist_list_var_39 = cdolist_list_var_39.rest() , mt = cdolist_list_var_39.first()) {
                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(mt, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(mt, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                        if (NIL != forts.fort_p(mt)) {
                                                                                                                                            methods.funcall_instance_method_with_1_args(lexicon, ALLOW_MT, mt);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } finally {
                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_37, thread);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }

                                                                                                }
                                                                                            } finally {
                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_26, thread);
                                                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_25, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                {
                                                                                    SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                                                    SubLObject cdolist_list_var = accessible_modules;
                                                                                    SubLObject module_var = NIL;
                                                                                    for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                        {
                                                                                            SubLObject _prev_bind_0_40 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                            SubLObject _prev_bind_1_41 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                {
                                                                                                    SubLObject node = function_terms.naut_to_nart(node_var_16);
                                                                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                        {
                                                                                                            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                            if (NIL != d_link) {
                                                                                                                {
                                                                                                                    SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                    if (NIL != mt_links) {
                                                                                                                        {
                                                                                                                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                                thread.resetMultipleValues();
                                                                                                                                {
                                                                                                                                    SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                    SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                        {
                                                                                                                                            SubLObject _prev_bind_0_42 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                            try {
                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                {
                                                                                                                                                    SubLObject iteration_state_43 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_43)) {
                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                        {
                                                                                                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_43);
                                                                                                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                {
                                                                                                                                                                    SubLObject _prev_bind_0_44 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                    try {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                            SubLObject cdolist_list_var_45 = new_list;
                                                                                                                                                                            SubLObject node_vars_link_node = NIL;
                                                                                                                                                                            for (node_vars_link_node = cdolist_list_var_45.first(); NIL != cdolist_list_var_45; cdolist_list_var_45 = cdolist_list_var_45.rest() , node_vars_link_node = cdolist_list_var_45.first()) {
                                                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    } finally {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_44, thread);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            iteration_state_43 = dictionary_contents.do_dictionary_contents_next(iteration_state_43);
                                                                                                                                                        }
                                                                                                                                                    } 
                                                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_43);
                                                                                                                                                }
                                                                                                                                            } finally {
                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_42, thread);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                }
                                                                                                                            } 
                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            } else {
                                                                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                            }
                                                                                                        }
                                                                                                    } else
                                                                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                            {
                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                SubLObject cdolist_list_var_46 = new_list;
                                                                                                                SubLObject generating_fn = NIL;
                                                                                                                for (generating_fn = cdolist_list_var_46.first(); NIL != cdolist_list_var_46; cdolist_list_var_46 = cdolist_list_var_46.rest() , generating_fn = cdolist_list_var_46.first()) {
                                                                                                                    {
                                                                                                                        SubLObject _prev_bind_0_47 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                            {
                                                                                                                                SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                SubLObject new_list_48 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                SubLObject cdolist_list_var_49 = new_list_48;
                                                                                                                                SubLObject node_vars_link_node = NIL;
                                                                                                                                for (node_vars_link_node = cdolist_list_var_49.first(); NIL != cdolist_list_var_49; cdolist_list_var_49 = cdolist_list_var_49.rest() , node_vars_link_node = cdolist_list_var_49.first()) {
                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } finally {
                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_47, thread);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }

                                                                                                }
                                                                                            } finally {
                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_41, thread);
                                                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_40, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                node_var_16 = deck.deck_pop(recur_deck);
                                                                            } 
                                                                        } finally {
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_24, thread);
                                                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_23, thread);
                                                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_22, thread);
                                                                        }
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt50$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } finally {
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_21, thread);
                                                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_20, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_19, thread);
                                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_18, thread);
                                                    }
                                                }
                                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                            }
                                        } finally {
                                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_17, thread);
                                        }
                                    }
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1, thread);
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return lexicon;
            }
        }
    }

    // defparameter
    private static final SubLSymbol $wff_check_parse_for_teps$ = makeSymbol("*WFF-CHECK-PARSE-FOR-TEPS*");

    // defparameter
    private static final SubLSymbol $wff_check_parse_for_l2r$ = makeSymbol("*WFF-CHECK-PARSE-FOR-L2R*");

    /**
     * Returns a list of properties for the cyclifier to use with the :textual-inference application
     */
    public static final SubLObject cyclifier_properties_for_teps() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list($LEXICON, get_tep_lexicon(), $kw52$WFF_CHECK_, $wff_check_parse_for_teps$.getDynamicValue(thread));
        }
    }

    /**
     * Returns a list of properties for the cyclifier to use with the :l2r application
     */
    public static final SubLObject cyclifier_properties_for_l2r() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list($kw52$WFF_CHECK_, $wff_check_parse_for_l2r$.getDynamicValue(thread), $LEXICON, get_new_l2r_lexicon());
        }
    }

    public static final SubLObject get_cyclifier_properties(SubLObject application) {
        {
            SubLObject cyclifier_properties = NIL;
            if (application == $TEXTUAL_INFERENCE) {
                cyclifier_properties = cyclifier_properties_for_teps();
            } else
                if (application == $L2R) {
                    cyclifier_properties = cyclifier_properties_for_l2r();
                } else {
                    cyclifier_properties = cyclifier_properties_for_teps();
                }

            return cyclifier_properties;
        }
    }

    public static final SubLObject ti_pred_strengthen_sentence(SubLObject sentence, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = predicate_strengthener.$pred_strengthen_stop_at_first_specified_pred$.currentBinding(thread);
                    SubLObject _prev_bind_1 = predicate_strengthener.$pred_strengthening_max_literal_count$.currentBinding(thread);
                    try {
                        predicate_strengthener.$pred_strengthen_stop_at_first_specified_pred$.bind(NIL, thread);
                        predicate_strengthener.$pred_strengthening_max_literal_count$.bind(ti_pred_strengthening_max_literal_count(), thread);
                        result = predicate_strengthener.typed_pred_strengthen_formula_unambiguously(sentence, mt, UNPROVIDED).first();
                    } finally {
                        predicate_strengthener.$pred_strengthening_max_literal_count$.rebind(_prev_bind_1, thread);
                        predicate_strengthener.$pred_strengthen_stop_at_first_specified_pred$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Don't try to pred-strengthen sentences with more than this many literals
     */
    // defparameter
    public static final SubLSymbol $ti_pred_strengthening_max_literal_count$ = makeSymbol("*TI-PRED-STRENGTHENING-MAX-LITERAL-COUNT*");

    public static final SubLObject ti_pred_strengthening_max_literal_count() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $ti_pred_strengthening_max_literal_count$.getDynamicValue(thread);
        }
    }

    public static final SubLObject ti_pred_strengthen_results(SubLObject result_list, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        {
            SubLObject strengthened_results = NIL;
            SubLObject cdolist_list_var = result_list;
            SubLObject result = NIL;
            for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                {
                    SubLObject new_result = ti_pred_strengthen_sentence(result, mt);
                    strengthened_results = cons(new_result, strengthened_results);
                }
            }
            return nreverse(strengthened_results);
        }
    }

    public static final SubLObject simplify_and_maybe_transform(SubLObject parse_results, SubLObject transformP) {
        if (transformP == UNPROVIDED) {
            transformP = $transform_instancefnsP$.getDynamicValue();
        }
        if (NIL != transformP) {
            return Mapping.mapcar(SIMPLIFY_CYCL_SENTENCE_SYNTAX, transform_instancefns_and_bind(parse_results));
        } else {
            return Mapping.mapcar(SIMPLIFY_CYCL_SENTENCE_SYNTAX, parse_results);
        }
    }

    public static final SubLObject bind_any_free_vars(SubLObject parse_results) {
        {
            SubLObject bound_results = NIL;
            SubLObject cdolist_list_var = parse_results;
            SubLObject formula = NIL;
            for (formula = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , formula = cdolist_list_var.first()) {
                {
                    SubLObject free_vars = el_utilities.sentence_free_variables(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject new_formula = existentially_bind_vars(formula, free_vars);
                    bound_results = cons(new_formula, bound_results);
                }
            }
            return nreverse(bound_results);
        }
    }

    /**
     * Converts InstanceFn terms in (a list of) cyclifier parse results to existentially bound variables.
     */
    public static final SubLObject transform_instancefns_and_bind(SubLObject parse_results) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject bound_results = NIL;
                SubLObject cdolist_list_var = parse_results;
                SubLObject sentence = NIL;
                for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject new_sentence = query_library_utils.convert_instancefns_to_variables(sentence);
                        SubLObject vars = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        bound_results = cons(existentially_bind_vars(new_sentence, remove_duplicates(vars, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), bound_results);
                    }
                }
                return bound_results;
            }
        }
    }

    public static final SubLObject existentially_bind_vars(SubLObject formula, SubLObject var_list) {
        if (var_list == UNPROVIDED) {
            var_list = el_utilities.sentence_free_variables(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        {
            SubLObject new_formula = formula;
            SubLObject cdolist_list_var = var_list;
            SubLObject var = NIL;
            for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                new_formula = el_utilities.make_existential(var, new_formula);
            }
            return new_formula;
        }
    }



    public static final SubLObject clear_ti_template_forward_rules() {
        {
            SubLObject cs = $ti_template_forward_rules_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_ti_template_forward_rules(SubLObject creation_template) {
        return memoization_state.caching_state_remove_function_results_with_args($ti_template_forward_rules_caching_state$.getGlobalValue(), list(creation_template), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject ti_template_forward_rules_internal(SubLObject creation_template) {
        if (NIL != creation_template) {
            return $ALL;
        }
        return $ALL;
    }

    public static final SubLObject ti_template_forward_rules(SubLObject creation_template) {
        {
            SubLObject caching_state = $ti_template_forward_rules_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(TI_TEMPLATE_FORWARD_RULES, $ti_template_forward_rules_caching_state$, TEN_INTEGER, EQ, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, creation_template, $kw7$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw7$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(ti_template_forward_rules_internal(creation_template)));
                    memoization_state.caching_state_put(caching_state, creation_template, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    /**
     * This creates a content model for a sentence (string).
     */
    public static final SubLObject create_cyclifier_content_model(SubLObject sentence, SubLObject background_mt, SubLObject ephemeralP, SubLObject application) {
        if (background_mt == UNPROVIDED) {
            background_mt = $const10$TextualEntailmentGenericBackgroun;
        }
        if (ephemeralP == UNPROVIDED) {
            ephemeralP = T;
        }
        if (application == UNPROVIDED) {
            application = $TEXTUAL_INFERENCE;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject content_model_mt_name = get_cntxt_name_from_sentence(sentence, UNPROVIDED);
                SubLObject content_model_mt = ke.ke_create_now(constants_high.suggest_constant_name(content_model_mt_name, $str_alt58$CyclifierContentModelMt_, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
                    try {
                        kb_control_vars.$forward_inference_allowed_rules$.bind(ti_template_forward_rules($const59$TextualInferenceContentModelCreat), thread);
                        ke.ke_assert_now(listS($$isa, content_model_mt, $list_alt60), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED);
                        ke.ke_assert_now(list($$contentModelForString, content_model_mt, sentence), content_model_mt, UNPROVIDED, UNPROVIDED);
                        if (NIL != background_mt) {
                            ke.ke_assert_now(list($$genlMt, content_model_mt, background_mt), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED);
                        }
                        if (NIL != ephemeralP) {
                            ke.ke_assert_now(list($$ephemeralTerm, content_model_mt), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED);
                        }
                        if (application.equal($TEXTUAL_INFERENCE)) {
                            add_asserts_for_textual_inference_mts(content_model_mt);
                        } else
                            if (application.equal($L2R)) {
                                add_asserts_for_l2r_mts(content_model_mt);
                            } else {
                                Errors.warn($$$application_unknown);
                            }

                    } finally {
                        kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
                    }
                }
                return content_model_mt;
            }
        }
    }

    public static final SubLObject assert_interp_in_mt(SubLObject cycl_interp, SubLObject interp_mt, SubLObject application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
                    try {
                        kb_control_vars.$forward_inference_allowed_rules$.bind(application == $L2R ? ((SubLObject) (NIL)) : $ALL, thread);
                        result = ke.ke_assert_now(cycl_interp, interp_mt, UNPROVIDED, UNPROVIDED);
                    } finally {
                        kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * This updates an interpretation context with the cyclified content of the sentence; different spec mts are created for cyclifier results in cases of ambiguity.
     */
    public static final SubLObject update_interps_on_model(SubLObject content_model_mt, SubLObject sentence, SubLObject peg, SubLObject ephemeralP, SubLObject application, SubLObject input_cycl) {
        if (peg == UNPROVIDED) {
            peg = NIL;
        }
        if (ephemeralP == UNPROVIDED) {
            ephemeralP = T;
        }
        if (application == UNPROVIDED) {
            application = $TEXTUAL_INFERENCE;
        }
        if (input_cycl == UNPROVIDED) {
            input_cycl = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject return_mt = NIL;
                {
                    SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
                    try {
                        kb_control_vars.$forward_inference_allowed_rules$.bind(NIL != member(application, $list_alt66, UNPROVIDED, UNPROVIDED) ? ((SubLObject) (forward.creation_template_allowable_rules($const67$InterpretationMtReificationTempla))) : kb_control_vars.$forward_inference_allowed_rules$.getDynamicValue(thread), thread);
                        return_mt = assert_interps_int(input_cycl, sentence, application, content_model_mt, peg, ephemeralP);
                    } finally {
                        kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
                    }
                }
                return return_mt;
            }
        }
    }

    public static final SubLObject assert_interps_int(SubLObject input_cycl, SubLObject sentence, SubLObject application, SubLObject content_model_mt, SubLObject peg, SubLObject ephemeralP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject best_results = NIL;
                SubLObject result_conjunction = NIL;
                SubLObject how_many = NIL;
                if (NIL != input_cycl) {
                    how_many = ONE_INTEGER;
                    best_results = list(input_cycl);
                    result_conjunction = input_cycl;
                } else {
                    thread.resetMultipleValues();
                    {
                        SubLObject best_results_50 = ti_get_best_interps_for_string(sentence, application);
                        SubLObject how_many_51 = thread.secondMultipleValue();
                        SubLObject result_conjunction_52 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        best_results = best_results_50;
                        how_many = how_many_51;
                        result_conjunction = result_conjunction_52;
                    }
                }
                {
                    SubLObject collector_mt_name = get_cntxt_name_from_sentence(sentence, UNPROVIDED);
                    SubLObject collector_mt = ke.ke_create_now(constants_high.suggest_constant_name(collector_mt_name, $str_alt68$CyclificationCollectorMt_, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                    SubLObject previous_result_mt = NIL;
                    Errors.warn($str_alt69$_S_distinct_parse_results_were_fo, how_many);
                    rkf_assertion_utilities.rkf_assert_now(listS($$isa, collector_mt, $list_alt70), $$UniversalVocabularyMt);
                    ke.ke_assert_now(list($$ephemeralTerm, collector_mt), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED);
                    rkf_assertion_utilities.rkf_assert_now(list($$genlMt, collector_mt, content_model_mt), $$UniversalVocabularyMt);
                    if (application.equal($TEXTUAL_INFERENCE)) {
                        ke.ke_assert_now(listS($$isa, collector_mt, $list_alt71), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED);
                        ke.ke_assert_now(list($$allParseResultsForContentModel, content_model_mt, list($$TheList, result_conjunction)), collector_mt, UNPROVIDED, UNPROVIDED);
                        if (how_many.numG(TEN_INTEGER)) {
                            Errors.warn($str_alt73$_S_parse_results_were_ignored_bec, subtract(how_many, TEN_INTEGER));
                        }
                    }
                    if ((NIL != peg) && (NIL == best_results)) {
                        rkf_assertion_utilities.rkf_assert_now(listS($$isa, peg, $list_alt74), content_model_mt);
                    }
                    {
                        SubLObject num = ZERO_INTEGER;
                        SubLObject message = cconcatenate($str_alt75$Asserting_, new SubLObject[]{ format_nil.format_nil_s_no_copy(length(best_results)), $str_alt76$_parses_of_, format_nil.format_nil_s_no_copy(sentence) });
                        SubLObject list_var = best_results;
                        utilities_macros.$progress_note$.setDynamicValue(message, thread);
                        utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                        utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                        utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                        {
                            SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                            SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                            SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                            SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                            try {
                                utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                {
                                    SubLObject csome_list_var = list_var;
                                    SubLObject result = NIL;
                                    for (result = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , result = csome_list_var.first()) {
                                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                        utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                        {
                                            SubLObject interp_mt = create_interp_mt_for_cyclifier_result(sentence, num);
                                            ke.ke_assert_now(list($$genlMt, interp_mt, content_model_mt), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED);
                                            ke.ke_assert_now(list($$genlMt, collector_mt, interp_mt), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED);
                                            assert_interp_in_mt(result, interp_mt, application);
                                            if (application.equal($TEXTUAL_INFERENCE)) {
                                                ke.ke_assert_now(list($const77$interpretationMtContent_ParseResu, interp_mt, result), interp_mt, UNPROVIDED, UNPROVIDED);
                                            }
                                            if (application.equal($L2R)) {
                                                ke.ke_assert_now(list($$interpretationMtContent_CycL, interp_mt, result), content_model_mt, UNPROVIDED, UNPROVIDED);
                                            }
                                            if (application.equal($TEXTUAL_INFERENCE)) {
                                                ke.ke_assert_now(list($$interpretedPhrase, interp_mt, sentence), interp_mt, UNPROVIDED, UNPROVIDED);
                                            }
                                            if (NIL != peg) {
                                                ke.ke_assert_now(list($$pegInterpretationMts, peg, interp_mt), content_model_mt, UNPROVIDED, UNPROVIDED);
                                            }
                                            if (NIL != ephemeralP) {
                                                ke.ke_assert_now(list($$ephemeralTerm, interp_mt), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED);
                                            }
                                            if (NIL != previous_result_mt) {
                                                ke.ke_assert_now(list($const81$interpretationMtRankedAsGoodOrBet, previous_result_mt, interp_mt), collector_mt, UNPROVIDED, UNPROVIDED);
                                            }
                                            previous_result_mt = interp_mt;
                                        }
                                    }
                                }
                                utilities_macros.noting_percent_progress_postamble();
                            } finally {
                                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    return collector_mt;
                }
            }
        }
    }

    public static final SubLObject ti_get_best_interps_for_string(SubLObject sentence, SubLObject application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cyclifier_properties = get_cyclifier_properties(application);
                SubLObject remove_el_duplicatesP = makeBoolean(application != $L2R);
                SubLObject cyclification_parsers = get_cyclification_parsers();
                SubLObject mt = $$RKFParsingMt;
                SubLObject max_time = ti_parser_timeout_for_application(application);
                SubLObject timed_outP = NIL;
                SubLObject initial_results = NIL;
                if (NIL != max_time) {
                    {
                        SubLObject _prev_bind_0 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
                        SubLObject _prev_bind_1 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
                        SubLObject _prev_bind_2 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
                        try {
                            parsing_macros.$parsing_timeout_time_check_count$.bind(ZERO_INTEGER, thread);
                            parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time(max_time), thread);
                            parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
                            parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
                            if (NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                                initial_results = list_utilities.remove_if_not(EL_FORMULA_P, bind_any_free_vars(get_cycls_for_sentence(sentence, cyclifier_properties, cyclification_parsers, mt, remove_el_duplicatesP)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            timed_outP = parsing_macros.parsing_timeout_time_reachedP();
                        } finally {
                            parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_2, thread);
                            parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_1, thread);
                            parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    initial_results = list_utilities.remove_if_not(EL_FORMULA_P, bind_any_free_vars(get_cycls_for_sentence(sentence, cyclifier_properties, cyclification_parsers, mt, remove_el_duplicatesP)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    timed_outP = NIL;
                }
                if (NIL != timed_outP) {
                    Errors.warn($str_alt83$Timed_out_with__S_parses_after__S, length(initial_results), max_time, sentence);
                }
                {
                    SubLObject cyclifier_results = maybe_strengthen_cyclifier_results(initial_results, application);
                    SubLObject how_many = length(cyclifier_results);
                    SubLObject best_results = maybe_narrow_cyclifier_results(cyclifier_results, application);
                    SubLObject result_conjunction = el_utilities.make_conjunction(cyclifier_results);
                    if (NIL != list_utilities.lesser_length_p(best_results, cyclifier_results)) {
                        Errors.warn($str_alt84$Weeded__S_parses_down_to__S, length(cyclifier_results), length(best_results));
                    }
                    return values(best_results, how_many, result_conjunction);
                }
            }
        }
    }

    /**
     * Number of seconds to allow for sentence parsing.
     */
    // defparameter
    public static final SubLSymbol $l2r_sentence_cyclification_max_time$ = makeSymbol("*L2R-SENTENCE-CYCLIFICATION-MAX-TIME*");

    public static final SubLObject ti_parser_timeout_for_application(SubLObject application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = application;
                if (pcase_var.eql($L2R)) {
                    return $l2r_sentence_cyclification_max_time$.getDynamicValue(thread);
                } else {
                    return NIL;
                }
            }
        }
    }

    public static final SubLObject maybe_strengthen_cyclifier_results(SubLObject initial_results, SubLObject application) {
        {
            SubLObject pcase_var = application;
            if (pcase_var.eql($L2R)) {
                return ti_pred_strengthen_results(remove_duplicates(initial_results, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
            } else
                if (pcase_var.eql($TEXTUAL_INFERENCE)) {
                    return el_utilities.remove_el_duplicates(Mapping.mapcar(CANONICALIZE_TERM, ti_pred_strengthen_results(initial_results, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    return initial_results;
                }

        }
    }

    public static final SubLObject maybe_narrow_cyclifier_results(SubLObject cyclifier_results, SubLObject application) {
        {
            SubLObject pcase_var = application;
            if (pcase_var.eql($L2R)) {
                return filter_l2r_parse_results(cyclifier_results);
            } else
                if (pcase_var.eql($TEXTUAL_INFERENCE)) {
                    return list_utilities.first_n(TEN_INTEGER, cyclifier_results);
                } else {
                    return cyclifier_results;
                }

        }
    }

    public static final SubLObject filter_l2r_parse_results(SubLObject cyclifier_results) {
        return remove_duplicates(remove_if(EXPRESSION_CONTAINS_KEYWORDP, remove(NIL, Mapping.mapcar(REMOVE_DISCONNECTED_CONJUNCTS, Mapping.mapcar(REMOVE_MADE_UP_ISA_CONJUNCTS, cyclifier_results)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject parse_from_conjuncts(SubLObject new_conjuncts) {
        {
            SubLObject sentence = (NIL != list_utilities.singletonP(new_conjuncts)) ? ((SubLObject) (new_conjuncts.first())) : el_utilities.make_conjunction(new_conjuncts);
            return existentially_bind_vars(sentence, UNPROVIDED);
        }
    }

    public static final SubLObject remove_made_up_isa_conjuncts(SubLObject parse) {
        {
            SubLObject conjuncts = te_conjuncts_from_parse(parse, NIL);
            SubLObject new_conjuncts = remove_if(MADE_UP_ISA_LITERAL_P, conjuncts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL != new_conjuncts ? ((SubLObject) (NIL != list_utilities.lesser_length_p(new_conjuncts, conjuncts) ? ((SubLObject) (parse_from_conjuncts(new_conjuncts))) : parse)) : NIL;
        }
    }

    public static final SubLObject made_up_isa_literal_p(SubLObject conjunct) {
        return formula_pattern_match.formula_matches_pattern(conjunct, $list_alt90);
    }

    public static final SubLObject made_up_type_p(SubLObject v_object) {
        return makeBoolean((((NIL != el_utilities.possibly_nat_p(v_object)) && (cycl_utilities.nat_functor(v_object) == $$ThingDescribableAsFn)) && (NIL != el_utilities.possibly_nat_p(cycl_utilities.nat_arg1(v_object, UNPROVIDED)))) && (cycl_utilities.nat_functor(cycl_utilities.nat_arg1(v_object, UNPROVIDED)) == $$WordFn));
    }

    public static final SubLObject remove_disconnected_conjuncts(SubLObject parse) {
        {
            SubLObject conjuncts = te_conjuncts_from_parse(parse, T);
            SubLObject found_disconnected_conjunctP = NIL;
            SubLObject connected = NIL;
            SubLObject cdolist_list_var = conjuncts;
            SubLObject conjunct = NIL;
            for (conjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , conjunct = cdolist_list_var.first()) {
                if (NIL != disconnected_var_conjunctP(conjunct, conjuncts)) {
                    found_disconnected_conjunctP = T;
                } else {
                    connected = cons(conjunct, connected);
                }
            }
            if (NIL == connected) {
                Errors.warn($str_alt93$No_connected_var_literals_in____S, parse);
                return NIL;
            } else {
                {
                    SubLObject cleaned_up = parse_from_conjuncts(connected);
                    if (NIL != found_disconnected_conjunctP) {
                        Errors.warn($str_alt94$Removed_disconnected_var_literals, set_difference(conjuncts, connected, UNPROVIDED, UNPROVIDED));
                    }
                    return cleaned_up;
                }
            }
        }
    }

    /**
     *
     *
     * @return BOOLEANP; Does CONJUNCT have a variable that is not mentioned in any of the rest of CONJUNCTS?
     */
    public static final SubLObject disconnected_var_conjunctP(SubLObject conjunct, SubLObject conjuncts) {
        {
            SubLObject disconnectedP = NIL;
            if (NIL == disconnectedP) {
                {
                    SubLObject csome_list_var = cycl_utilities.expression_gather(conjunct, $sym95$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject var = NIL;
                    for (var = csome_list_var.first(); !((NIL != disconnectedP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , var = csome_list_var.first()) {
                        if (NIL != disconnected_var_conjunctP_internal(var, conjunct, conjuncts)) {
                            disconnectedP = T;
                        }
                    }
                }
            }
            return disconnectedP;
        }
    }

    public static final SubLObject uninformative_parse_arg0_pred_p(SubLObject pred) {
        return makeBoolean((NIL != subl_promotions.memberP(pred, $list_alt96, UNPROVIDED, UNPROVIDED)) || (NIL != fort_types_interface.underspecified_predicate_p(pred, UNPROVIDED)));
    }

    /**
     *
     *
     * @return BOOLEANP; Is VAR not mentioned in any informative member of the rest of CONJUNCTS?
     */
    public static final SubLObject disconnected_var_conjunctP_internal(SubLObject var, SubLObject conjunct, SubLObject conjuncts) {
        {
            SubLObject disconnectedP = NIL;
            SubLObject doneP = makeBoolean((NIL == var) || (NIL == uninformative_parse_arg0_pred_p(cycl_utilities.formula_arg0(conjunct))));
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = conjuncts;
                    SubLObject other_conjunct = NIL;
                    for (other_conjunct = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , other_conjunct = csome_list_var.first()) {
                        if (conjunct == other_conjunct) {
                        } else
                            if (NIL != cycl_utilities.expression_find(var, other_conjunct, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                if (NIL == disconnected_var_conjunctP_internal(var, other_conjunct, remove(conjunct, conjuncts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                    doneP = T;
                                }
                            }

                    }
                }
            }
            if (NIL == doneP) {
                disconnectedP = T;
            }
            return disconnectedP;
        }
    }

    /**
     *
     *
     * @return 0; listp of parses of SENTENCE known true in DOMAIN-MT.
     * @return 1; listp of parses of SENTENCE consistent in DOMAIN-MT.
     * @return 2; listp of parses of SENTENCE known false in DOMAIN-MT.
     */
    public static final SubLObject parse_and_partition_sentence_parses(SubLObject sentence, SubLObject domain_mt, SubLObject max_parses, SubLObject max_time) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = $$CurrentWorldDataCollectorMt;
        }
        if (max_parses == UNPROVIDED) {
            max_parses = NIL;
        }
        if (max_time == UNPROVIDED) {
            max_time = $int$30;
        }
        SubLTrampolineFile.checkType(sentence, STRING_OR_UNICODE_NAUT_P);
        SubLTrampolineFile.checkType(domain_mt, $sym99$HLMT_);
        if (NIL != max_parses) {
            SubLTrampolineFile.checkType(max_parses, POSITIVE_INTEGER_P);
        }
        {
            SubLObject subl_sentence = (NIL != unicode_nauts.unicode_naut_p(sentence)) ? ((SubLObject) (unicode_strings.display_to_subl_string(cycl_utilities.nat_arg1(sentence, UNPROVIDED), UNPROVIDED, UNPROVIDED))) : sentence;
            SubLObject cyclifier_properties = get_cyclifier_properties($L2R);
            SubLObject initial_results = te_get_cycls_for_sentence(subl_sentence, cyclifier_properties, max_time, NIL);
            SubLObject first_n_results = (NIL != max_parses) ? ((SubLObject) (list_utilities.first_n(max_parses, initial_results))) : initial_results;
            SubLObject strengthened = ti_pred_strengthen_results(first_n_results, UNPROVIDED);
            SubLObject canonicalized = Mapping.mapcar(CANONICALIZE_TERM, strengthened);
            SubLObject unique = el_utilities.remove_el_duplicates(canonicalized, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject known = NIL;
            SubLObject known_false = NIL;
            SubLObject consistent = NIL;
            SubLObject problem_store = NIL;
            try {
                problem_store = inference_datastructures_problem_store.new_problem_store(NIL);
                {
                    SubLObject v_properties = list($PROBLEM_STORE, problem_store, $MAX_TIME, max_time, $MAX_NUMBER, ONE_INTEGER);
                    SubLObject cdolist_list_var = unique;
                    SubLObject big_parse = NIL;
                    for (big_parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , big_parse = cdolist_list_var.first()) {
                        Errors.warn($str_alt104$Looking_for_subparses_of____S, big_parse);
                        {
                            SubLObject cdolist_list_var_53 = te_subparses(big_parse);
                            SubLObject sub_parse = NIL;
                            for (sub_parse = cdolist_list_var_53.first(); NIL != cdolist_list_var_53; cdolist_list_var_53 = cdolist_list_var_53.rest() , sub_parse = cdolist_list_var_53.first()) {
                                if (!(((NIL != subl_promotions.memberP(sub_parse, known, symbol_function(EQUAL), UNPROVIDED)) || (NIL != member(sub_parse, consistent, symbol_function(EQUAL), UNPROVIDED))) || (NIL != member(sub_parse, known_false, symbol_function(EQUAL), UNPROVIDED)))) {
                                    Errors.warn($str_alt105$Checking_subparse_____S, sub_parse);
                                    if (NIL == wff.el_wff_assertibleP(sub_parse, domain_mt, UNPROVIDED)) {
                                        known_false = cons(sub_parse, known_false);
                                    } else
                                        if (NIL != sentence_parse_known_trueP(sub_parse, domain_mt, v_properties)) {
                                            known = cons(sub_parse, known);
                                        } else
                                            if ((NIL != el_utilities.closedP(sub_parse, UNPROVIDED)) && (NIL != sentence_parse_known_falseP(sub_parse, domain_mt, v_properties))) {
                                                known_false = cons(sub_parse, known_false);
                                            } else {
                                                consistent = cons(sub_parse, consistent);
                                            }


                                }
                            }
                        }
                    }
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        inference_datastructures_problem_store.destroy_problem_store(problem_store);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return values(nreverse(known), nreverse(consistent), nreverse(known_false));
        }
    }

    public static final SubLObject te_subparses(SubLObject big_parse) {
        {
            SubLObject ans = cycl_utilities.expression_gather(big_parse, $sym106$GAF_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject all_conjuncts = te_conjuncts_from_parse(big_parse, UNPROVIDED);
            SubLObject vars = cycl_utilities.expression_gather(all_conjuncts, $sym95$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = vars;
            SubLObject var = NIL;
            for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                {
                    SubLObject var_juncts = list_utilities.find_all(var, all_conjuncts, symbol_function($sym107$TE_EXPRESSION_CONTAINS_), UNPROVIDED);
                    if ((NIL == list_utilities.tree_find_if(KEYWORDP, var_juncts, UNPROVIDED)) && list_utilities.tree_count_if($sym108$TE_SUFFICIENTLY_SPECIFIC_FORT_, var_juncts, UNPROVIDED).numG(ONE_INTEGER)) {
                        ans = cons(NIL != list_utilities.singletonP(var_juncts) ? ((SubLObject) (var_juncts.first())) : simplifier.conjoin(var_juncts, UNPROVIDED), ans);
                    }
                }
            }
            return ans;
        }
    }

    public static final SubLObject te_sufficiently_specific_fortP(SubLObject v_object) {
        return makeBoolean(((NIL != forts.fort_p(v_object)) && (NIL == fort_types_interface.relation_p(v_object))) && (NIL != cardinality_estimates.generality_estimateL(v_object, $$Person)));
    }

    public static final SubLObject te_conjuncts_from_parse(SubLObject big_parse, SubLObject remove_equals_clausesP) {
        if (remove_equals_clausesP == UNPROVIDED) {
            remove_equals_clausesP = T;
        }
        {
            SubLObject conjuncts = NIL;
            SubLObject working_copy = el_utilities.copy_expression(big_parse);
            while (NIL != el_utilities.el_existential_p(working_copy)) {
                working_copy = cycl_utilities.formula_arg2(working_copy, UNPROVIDED);
            } 
            if (NIL != el_utilities.atomic_sentenceP(working_copy)) {
                conjuncts = cons(working_copy, conjuncts);
            } else
                if (NIL != el_utilities.el_conjunction_p(working_copy)) {
                    {
                        SubLObject args = cycl_utilities.formula_args(working_copy, $IGNORE);
                        SubLObject cdolist_list_var = args;
                        SubLObject conjunct = NIL;
                        for (conjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , conjunct = cdolist_list_var.first()) {
                            if (NIL != el_utilities.el_existential_p(conjunct)) {
                                conjuncts = append(te_conjuncts_from_parse(conjunct, NIL), conjuncts);
                            } else {
                                conjuncts = cons(conjunct, conjuncts);
                            }
                        }
                    }
                }

            if (NIL != remove_equals_clausesP) {
                conjuncts = te_remove_equals_clauses(conjuncts);
            }
            return conjuncts;
        }
    }

    public static final SubLObject te_remove_equals_clauses(SubLObject conjuncts) {
        {
            SubLObject equals_conjuncts = list_utilities.find_all($$equals, conjuncts, symbol_function(EQL), symbol_function(FORMULA_ARG0));
            SubLObject cdolist_list_var = equals_conjuncts;
            SubLObject equals_conjunct = NIL;
            for (equals_conjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , equals_conjunct = cdolist_list_var.first()) {
                {
                    SubLObject datum = cycl_utilities.formula_args(equals_conjunct, UNPROVIDED);
                    SubLObject current = datum;
                    SubLObject keep = NIL;
                    SubLObject lose = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt113);
                    keep = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt113);
                    lose = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if ((NIL != cycl_variables.el_varP(keep)) && (NIL != cycl_variables.el_varP(lose))) {
                            conjuncts = cycl_utilities.expression_nsubst(keep, lose, conjuncts, UNPROVIDED, UNPROVIDED);
                        } else
                            if (NIL != cycl_variables.el_varP(lose)) {
                                conjuncts = cycl_utilities.expression_nsubst(keep, lose, conjuncts, symbol_function(EQUAL), UNPROVIDED);
                            } else
                                if (NIL != cycl_variables.el_varP(keep)) {
                                    conjuncts = cycl_utilities.expression_nsubst(lose, keep, conjuncts, symbol_function(EQUAL), UNPROVIDED);
                                }


                        conjuncts = delete(equals_conjunct, conjuncts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt113);
                    }
                }
            }
            return conjuncts;
        }
    }

    public static final SubLObject te_expression_containsP(SubLObject expression, SubLObject v_term) {
        return cycl_utilities.expression_find(v_term, expression, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject te_get_cycls_for_sentence(SubLObject sentence, SubLObject cyclifier_properties, SubLObject max_time, SubLObject remove_el_duplicatesP) {
        if (remove_el_duplicatesP == UNPROVIDED) {
            remove_el_duplicatesP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cycls = NIL;
                SubLObject timed_outP = NIL;
                {
                    SubLObject _prev_bind_0 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
                    SubLObject _prev_bind_1 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
                    SubLObject _prev_bind_2 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
                    try {
                        parsing_macros.$parsing_timeout_time_check_count$.bind(ZERO_INTEGER, thread);
                        parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time(max_time), thread);
                        parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
                        parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
                        if (NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                            cycls = get_cycls_for_sentence(sentence, cyclifier_properties, get_cyclification_parsers(), $$RKFParsingMt, remove_el_duplicatesP);
                        }
                        timed_outP = parsing_macros.parsing_timeout_time_reachedP();
                    } finally {
                        parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_2, thread);
                        parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_1, thread);
                        parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != timed_outP) {
                    Errors.warn($str_alt114$Timed_out_after__S_seconds_parsin, max_time, sentence);
                }
                return cycls;
            }
        }
    }

    public static final SubLObject sentence_parse_known_trueP(SubLObject parse, SubLObject domain_mt, SubLObject v_properties) {
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(parse, domain_mt, v_properties));
    }

    public static final SubLObject sentence_parse_known_falseP(SubLObject parse, SubLObject domain_mt, SubLObject v_properties) {
        return cyc_kernel.closed_query_success_result_p(inference_kernel.new_cyc_query(cycl_utilities.negate(parse), domain_mt, v_properties));
    }

    public static final SubLObject create_interp_mt_for_cyclifier_result(SubLObject sentence, SubLObject number) {
        {
            SubLObject return_mt = NIL;
            SubLObject interp_mt_name = get_cntxt_name_from_sentence(sentence, UNPROVIDED);
            SubLObject num_name = write_to_string(number, EMPTY_SUBL_OBJECT_ARRAY);
            SubLObject interp_mt = ke.ke_create_now(constants_high.suggest_constant_name(interp_mt_name, $str_alt115$CyclifierInterpMt_, cconcatenate($str_alt116$_Parse, num_name), UNPROVIDED, UNPROVIDED), UNPROVIDED);
            return_mt = interp_mt;
            ke.ke_assert_now(listS($$isa, interp_mt, $list_alt117), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED);
            return return_mt;
        }
    }

    public static final SubLObject add_asserts_for_textual_inference_mts(SubLObject mt) {
        ke.ke_assert_now(listS($$quotedIsa, mt, $list_alt119), $$BookkeepingMt, UNPROVIDED, UNPROVIDED);
        return T;
    }

    public static final SubLObject add_asserts_for_l2r_mts(SubLObject mt) {
        Errors.warn($str_alt121$no_l2r_specific_assertions_specif);
        return mt;
    }

    // defparameter
    private static final SubLSymbol $max_length_for_content_model_name$ = makeSymbol("*MAX-LENGTH-FOR-CONTENT-MODEL-NAME*");

    public static final SubLObject get_cntxt_name_from_sentence(SubLObject cycl_sentence, SubLObject max_length) {
        if (max_length == UNPROVIDED) {
            max_length = $max_length_for_content_model_name$.getDynamicValue();
        }
        {
            SubLObject sentence = (NIL != unicode_nauts.unicode_naut_p(cycl_sentence)) ? ((SubLObject) (string_utilities.substring(cycl_utilities.nat_arg1(cycl_sentence, UNPROVIDED), ZERO_INTEGER, position(CHAR_ampersand, cycl_utilities.nat_arg1(cycl_sentence, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) : cycl_sentence;
            SubLObject last_char = position(CHAR_space, sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject next_non_space = (NIL != last_char) ? ((SubLObject) (position_if(NON_SPACE_CHAR_P, sentence, IDENTITY, last_char, UNPROVIDED))) : NIL;
            SubLObject word_count = (NIL != last_char) ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER;
            while (((NIL != last_char) && (NIL != next_non_space)) && word_count.numL(max_length)) {
                last_char = position(CHAR_space, sentence, symbol_function(EQ), symbol_function(IDENTITY), next_non_space, UNPROVIDED);
                if (NIL != last_char) {
                    word_count = add(word_count, ONE_INTEGER);
                    next_non_space = position_if(NON_SPACE_CHAR_P, sentence, IDENTITY, last_char, UNPROVIDED);
                }
            } 
            return string_utilities.substring(sentence, ZERO_INTEGER, last_char);
        }
    }



    // deflexical
    private static final SubLSymbol $default_ti_metrics$ = makeSymbol("*DEFAULT-TI-METRICS*");

    // deflexical
    private static final SubLSymbol $ti_inferences_by_cyclist$ = makeSymbol("*TI-INFERENCES-BY-CYCLIST*");





    public static final SubLObject saving_tip_output_to_file() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list_utilities.sublisp_boolean($tip_log_filename$.getDynamicValue(thread));
        }
    }

    /**
     * Evaluate BODY with *PSP-CHART* bound to whatever CHART-FORM evaluates to.
     */
    public static final SubLObject noting_tip_time(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt127);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject tip = NIL;
                    SubLObject time_type = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt127);
                    tip = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt127);
                    time_type = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject this_time = $sym128$THIS_TIME;
                            return list(CLET, list(bq_cons(this_time, $list_alt130)), listS(CTIME, this_time, append(body, NIL)), list(TIP_NOTE_TIME, tip, time_type, this_time));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt127);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject with_tip_logging(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt133);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject filename = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt133);
                    filename = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, list(list($tip_log_filename$, filename)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt133);
                    }
                }
            }
        }
        return NIL;
    }

    public static final class $textual_inference_problem_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return textual_entailments.$textual_inference_problem_native.structDecl;
        }

        public SubLObject getField2() {
            return $cycl;
        }

        public SubLObject getField3() {
            return $cycl_source;
        }

        public SubLObject getField4() {
            return $run_method;
        }

        public SubLObject getField5() {
            return $background_text;
        }

        public SubLObject getField6() {
            return $background_target;
        }

        public SubLObject getField7() {
            return $query_text;
        }

        public SubLObject getField8() {
            return $query_target;
        }

        public SubLObject getField9() {
            return $response_texts;
        }

        public SubLObject getField10() {
            return $polarities;
        }

        public SubLObject getField11() {
            return $inference_properties;
        }

        public SubLObject getField12() {
            return $metrics;
        }

        public SubLObject setField2(SubLObject value) {
            return $cycl = value;
        }

        public SubLObject setField3(SubLObject value) {
            return $cycl_source = value;
        }

        public SubLObject setField4(SubLObject value) {
            return $run_method = value;
        }

        public SubLObject setField5(SubLObject value) {
            return $background_text = value;
        }

        public SubLObject setField6(SubLObject value) {
            return $background_target = value;
        }

        public SubLObject setField7(SubLObject value) {
            return $query_text = value;
        }

        public SubLObject setField8(SubLObject value) {
            return $query_target = value;
        }

        public SubLObject setField9(SubLObject value) {
            return $response_texts = value;
        }

        public SubLObject setField10(SubLObject value) {
            return $polarities = value;
        }

        public SubLObject setField11(SubLObject value) {
            return $inference_properties = value;
        }

        public SubLObject setField12(SubLObject value) {
            return $metrics = value;
        }

        public SubLObject $cycl = Lisp.NIL;

        public SubLObject $cycl_source = Lisp.NIL;

        public SubLObject $run_method = Lisp.NIL;

        public SubLObject $background_text = Lisp.NIL;

        public SubLObject $background_target = Lisp.NIL;

        public SubLObject $query_text = Lisp.NIL;

        public SubLObject $query_target = Lisp.NIL;

        public SubLObject $response_texts = Lisp.NIL;

        public SubLObject $polarities = Lisp.NIL;

        public SubLObject $inference_properties = Lisp.NIL;

        public SubLObject $metrics = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(textual_entailments.$textual_inference_problem_native.class, TEXTUAL_INFERENCE_PROBLEM, TEXTUAL_INFERENCE_PROBLEM_P, $list_alt137, $list_alt138, new String[]{ "$cycl", "$cycl_source", "$run_method", "$background_text", "$background_target", "$query_text", "$query_target", "$response_texts", "$polarities", "$inference_properties", "$metrics" }, $list_alt139, $list_alt140, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    // defconstant
    public static final SubLSymbol $dtp_textual_inference_problem$ = makeSymbol("*DTP-TEXTUAL-INFERENCE-PROBLEM*");

    public static final SubLObject textual_inference_problem_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject textual_inference_problem_p(SubLObject v_object) {
        return v_object.getClass() == textual_entailments.$textual_inference_problem_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $textual_inference_problem_p$UnaryFunction extends UnaryFunction {
        public $textual_inference_problem_p$UnaryFunction() {
            super(extractFunctionNamed("TEXTUAL-INFERENCE-PROBLEM-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return textual_inference_problem_p(arg1);
        }
    }

    public static final SubLObject tip_cycl(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TEXTUAL_INFERENCE_PROBLEM_P);
        return v_object.getField2();
    }

    public static final SubLObject tip_cycl_source(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TEXTUAL_INFERENCE_PROBLEM_P);
        return v_object.getField3();
    }

    public static final SubLObject tip_run_method(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TEXTUAL_INFERENCE_PROBLEM_P);
        return v_object.getField4();
    }

    public static final SubLObject tip_background_text(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TEXTUAL_INFERENCE_PROBLEM_P);
        return v_object.getField5();
    }

    public static final SubLObject tip_background_target(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TEXTUAL_INFERENCE_PROBLEM_P);
        return v_object.getField6();
    }

    public static final SubLObject tip_query_text(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TEXTUAL_INFERENCE_PROBLEM_P);
        return v_object.getField7();
    }

    public static final SubLObject tip_query_target(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TEXTUAL_INFERENCE_PROBLEM_P);
        return v_object.getField8();
    }

    public static final SubLObject tip_response_texts(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TEXTUAL_INFERENCE_PROBLEM_P);
        return v_object.getField9();
    }

    public static final SubLObject tip_polarities(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TEXTUAL_INFERENCE_PROBLEM_P);
        return v_object.getField10();
    }

    public static final SubLObject tip_inference_properties(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TEXTUAL_INFERENCE_PROBLEM_P);
        return v_object.getField11();
    }

    public static final SubLObject tip_metrics(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TEXTUAL_INFERENCE_PROBLEM_P);
        return v_object.getField12();
    }

    public static final SubLObject _csetf_tip_cycl(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TEXTUAL_INFERENCE_PROBLEM_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_tip_cycl_source(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TEXTUAL_INFERENCE_PROBLEM_P);
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_tip_run_method(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TEXTUAL_INFERENCE_PROBLEM_P);
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_tip_background_text(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TEXTUAL_INFERENCE_PROBLEM_P);
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_tip_background_target(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TEXTUAL_INFERENCE_PROBLEM_P);
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_tip_query_text(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TEXTUAL_INFERENCE_PROBLEM_P);
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_tip_query_target(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TEXTUAL_INFERENCE_PROBLEM_P);
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_tip_response_texts(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TEXTUAL_INFERENCE_PROBLEM_P);
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_tip_polarities(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TEXTUAL_INFERENCE_PROBLEM_P);
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_tip_inference_properties(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TEXTUAL_INFERENCE_PROBLEM_P);
        return v_object.setField11(value);
    }

    public static final SubLObject _csetf_tip_metrics(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TEXTUAL_INFERENCE_PROBLEM_P);
        return v_object.setField12(value);
    }

    public static final SubLObject make_textual_inference_problem(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new textual_entailments.$textual_inference_problem_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($CYCL)) {
                        _csetf_tip_cycl(v_new, current_value);
                    } else
                        if (pcase_var.eql($CYCL_SOURCE)) {
                            _csetf_tip_cycl_source(v_new, current_value);
                        } else
                            if (pcase_var.eql($RUN_METHOD)) {
                                _csetf_tip_run_method(v_new, current_value);
                            } else
                                if (pcase_var.eql($BACKGROUND_TEXT)) {
                                    _csetf_tip_background_text(v_new, current_value);
                                } else
                                    if (pcase_var.eql($BACKGROUND_TARGET)) {
                                        _csetf_tip_background_target(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($QUERY_TEXT)) {
                                            _csetf_tip_query_text(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($QUERY_TARGET)) {
                                                _csetf_tip_query_target(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($RESPONSE_TEXTS)) {
                                                    _csetf_tip_response_texts(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($POLARITIES)) {
                                                        _csetf_tip_polarities(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($INFERENCE_PROPERTIES)) {
                                                            _csetf_tip_inference_properties(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($METRICS)) {
                                                                _csetf_tip_metrics(v_new, current_value);
                                                            } else {
                                                                Errors.error($str_alt176$Invalid_slot__S_for_construction_, current_arg);
                                                            }










                }
            }
            return v_new;
        }
    }

    public static final SubLObject new_textual_inference_problem() {
        return make_textual_inference_problem(UNPROVIDED);
    }

    public static final SubLObject tip_note_time(SubLObject tip, SubLObject time_type, SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (value.equal(ZERO_INTEGER)) {
                value = list(cache.cache_get($tip_times$.getDynamicValue(thread), list(tip_cycl(tip), time_type)), $REUSED);
            } else {
                cache.cache_set($tip_times$.getDynamicValue(thread), list(tip_cycl(tip), time_type), value);
                value = list(value, $FRESH);
            }
            _csetf_tip_metrics(tip, putf(tip_metrics(tip), time_type, value));
            return value;
        }
    }

    public static final SubLObject run_textual_inferences(SubLObject problems, SubLObject run_method, SubLObject cleanup_previous_runsP, SubLObject metrics, SubLObject inference_properties) {
        if (run_method == UNPROVIDED) {
            run_method = $CHECK_ALL_POSSIBLE_ANSWERS;
        }
        if (cleanup_previous_runsP == UNPROVIDED) {
            cleanup_previous_runsP = T;
        }
        if (metrics == UNPROVIDED) {
            metrics = $default_ti_metrics$.getGlobalValue();
        }
        if (inference_properties == UNPROVIDED) {
            inference_properties = $default_ti_inference_properties$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != cleanup_previous_runsP) {
                cleanup_previous_runs_for_user(api_control_vars.$the_cyclist$.getDynamicValue(thread));
            }
            {
                SubLObject overall_result = NIL;
                SubLObject cdolist_list_var = ask_utilities.query_variable($sym181$_PROB, list($$elementOf, $sym181$_PROB, problems), $$InferencePSC, UNPROVIDED);
                SubLObject ti_problem = NIL;
                for (ti_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ti_problem = cdolist_list_var.first()) {
                    {
                        SubLObject problem_result = run_textual_inference(ti_problem, run_method, metrics, inference_properties);
                        SubLObject cdolist_list_var_54 = problem_result;
                        SubLObject response_result = NIL;
                        for (response_result = cdolist_list_var_54.first(); NIL != cdolist_list_var_54; cdolist_list_var_54 = cdolist_list_var_54.rest() , response_result = cdolist_list_var_54.first()) {
                            if (NIL != getf(response_result, $INFERENCE, UNPROVIDED)) {
                                dictionary_utilities.dictionary_push($ti_inferences_by_cyclist$.getGlobalValue(), api_control_vars.$the_cyclist$.getDynamicValue(thread), getf(response_result, $INFERENCE, UNPROVIDED));
                            }
                            if (NIL != saving_tip_output_to_file()) {
                                tip_save_problem_output_to_file(response_result);
                            }
                            overall_result = cons(response_result, overall_result);
                        }
                    }
                }
                return overall_result;
            }
        }
    }



    public static final SubLObject clear_run_textual_inference() {
        {
            SubLObject cs = $run_textual_inference_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_run_textual_inference(SubLObject ti_problem_cycl, SubLObject run_method, SubLObject metrics, SubLObject inference_properties) {
        if (metrics == UNPROVIDED) {
            metrics = $default_ti_metrics$.getGlobalValue();
        }
        if (inference_properties == UNPROVIDED) {
            inference_properties = $default_ti_inference_properties$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($run_textual_inference_caching_state$.getGlobalValue(), list(ti_problem_cycl, run_method, metrics, inference_properties), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject run_textual_inference_internal(SubLObject ti_problem_cycl, SubLObject run_method, SubLObject metrics, SubLObject inference_properties) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject state = memoization_state.possibly_new_memoization_state();
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
                                            Errors.error($str_alt184$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                {
                                    SubLObject background_text = ask_utilities.query_variable($sym185$_TEXT, listS($$backgroundTextForTEP, ti_problem_cycl, $list_alt187), $$InferencePSC, UNPROVIDED).first();
                                    SubLObject query_text = ask_utilities.query_variable($sym185$_TEXT, listS($$queryTextForTEP, ti_problem_cycl, $list_alt187), $$InferencePSC, UNPROVIDED).first();
                                    SubLObject background_target = ask_utilities.query_variable($sym189$_CYCL, listS($$and, listS($$targetCycLForTIPremise, ti_problem_cycl, $list_alt192), $list_alt193), $$InferencePSC, UNPROVIDED).first();
                                    SubLObject query_target = ask_utilities.query_variable($sym189$_CYCL, listS($$and, listS($$targetCycLForTIQuery, ti_problem_cycl, $list_alt192), $list_alt193), $$InferencePSC, UNPROVIDED).first();
                                    SubLObject responses = ask_utilities.query_variable($sym185$_TEXT, listS($$responseToTEP, ti_problem_cycl, $list_alt187), $$InferencePSC, UNPROVIDED);
                                    SubLObject response_pairs = get_text_and_polarity_for_responses(responses);
                                    SubLObject response_texts = response_pairs.first();
                                    SubLObject response_polarities = second(response_pairs);
                                    if (NIL != getf(metrics, $SAVE_INFERENCE, UNPROVIDED)) {
                                        inference_properties = putf(inference_properties, $BROWSABLE_, T);
                                        inference_properties = putf(inference_properties, $CONTINUABLE_, T);
                                    }
                                    {
                                        SubLObject tip = new_textual_inference_problem();
                                        _csetf_tip_cycl(tip, ti_problem_cycl);
                                        _csetf_tip_cycl_source(tip, $$$From_Text);
                                        _csetf_tip_run_method(tip, run_method);
                                        _csetf_tip_background_text(tip, background_text);
                                        _csetf_tip_query_text(tip, query_text);
                                        _csetf_tip_response_texts(tip, response_texts);
                                        _csetf_tip_polarities(tip, response_polarities);
                                        _csetf_tip_inference_properties(tip, inference_properties);
                                        _csetf_tip_metrics(tip, metrics);
                                        result = cons(run_specified_ti_problem(tip), result);
                                    }
                                    if ((NIL != background_target) && (NIL != query_target)) {
                                        {
                                            SubLObject tip = new_textual_inference_problem();
                                            _csetf_tip_cycl(tip, ti_problem_cycl);
                                            _csetf_tip_cycl_source(tip, $$$From_Target_CycL);
                                            _csetf_tip_run_method(tip, run_method);
                                            _csetf_tip_background_text(tip, background_text);
                                            _csetf_tip_background_target(tip, background_target);
                                            _csetf_tip_query_text(tip, query_text);
                                            _csetf_tip_query_target(tip, query_target);
                                            _csetf_tip_response_texts(tip, response_texts);
                                            _csetf_tip_polarities(tip, response_polarities);
                                            _csetf_tip_inference_properties(tip, inference_properties);
                                            _csetf_tip_metrics(tip, metrics);
                                            result = cons(run_specified_ti_problem(tip), result);
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_55 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_55, thread);
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

    public static final SubLObject run_textual_inference(SubLObject ti_problem_cycl, SubLObject run_method, SubLObject metrics, SubLObject inference_properties) {
        if (metrics == UNPROVIDED) {
            metrics = $default_ti_metrics$.getGlobalValue();
        }
        if (inference_properties == UNPROVIDED) {
            inference_properties = $default_ti_inference_properties$.getDynamicValue();
        }
        {
            SubLObject caching_state = $run_textual_inference_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(RUN_TEXTUAL_INFERENCE, $run_textual_inference_caching_state$, NIL, EQUALP, FOUR_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_4(ti_problem_cycl, run_method, metrics, inference_properties);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw7$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (ti_problem_cycl.equalp(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (run_method.equalp(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (metrics.equalp(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && inference_properties.equalp(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(run_textual_inference_internal(ti_problem_cycl, run_method, metrics, inference_properties)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(ti_problem_cycl, run_method, metrics, inference_properties));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static final SubLObject get_text_and_polarity_for_responses(SubLObject responses) {
        {
            SubLObject texts = NIL;
            SubLObject polarities = NIL;
            SubLObject cdolist_list_var = responses;
            SubLObject response = NIL;
            for (response = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , response = cdolist_list_var.first()) {
                texts = cons(ask_utilities.query_variable($sym185$_TEXT, listS($$textStringForTEPResponse, response, $list_alt187), $$InferencePSC, UNPROVIDED).first(), texts);
                polarities = cons(ask_utilities.query_variable($sym203$_POLARITY, listS($$responsePolarityForTEPResponse, response, $list_alt205), $$InferencePSC, UNPROVIDED).first(), polarities);
            }
            return list(texts, polarities);
        }
    }

    public static final SubLObject cleanup_previous_runs_for_user(SubLObject cyclist) {
        {
            SubLObject cdolist_list_var = dictionary.dictionary_lookup($ti_inferences_by_cyclist$.getGlobalValue(), cyclist, UNPROVIDED);
            SubLObject inference = NIL;
            for (inference = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , inference = cdolist_list_var.first()) {
                inference_datastructures_inference.destroy_inference(inference);
            }
        }
        clear_run_textual_inference();
        return NIL;
    }

    public static final SubLObject run_specified_ti_problem(SubLObject tip) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject response_types = response_types_from_text(tip_response_texts(tip));
                SubLObject query_text = tip_query_text(tip);
                SubLObject run_method = tip_run_method(tip);
                SubLObject premise_mt = NIL;
                SubLObject query_parse = NIL;
                SubLObject cycl_query = NIL;
                SubLObject disprove_query_cycl = NIL;
                SubLObject disprove_query_answer = NIL;
                SubLObject disprove_query_halt_reason = NIL;
                SubLObject disprove_query_inference = NIL;
                SubLObject prove_query_cycl = NIL;
                SubLObject prove_query_answer = NIL;
                SubLObject prove_query_halt_reason = NIL;
                SubLObject prove_query_inference = NIL;
                SubLObject typed_queries = NIL;
                force_output(UNPROVIDED);
                {
                    SubLObject this_time = NIL;
                    SubLObject time_var = get_internal_real_time();
                    if (NIL != tip_background_target(tip)) {
                        premise_mt = tep_premise_context_from_string_memoized(tip_background_text(tip), $const10$TextualEntailmentGenericBackgroun, T, tip_background_target(tip));
                    } else {
                        premise_mt = tep_premise_context_from_string_memoized(tip_background_text(tip), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    this_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    tip_note_time(tip, $PREMISE_TIME, this_time);
                }
                {
                    SubLObject this_time = NIL;
                    SubLObject time_var = get_internal_real_time();
                    {
                        SubLObject query_types = get_query_types_from_responses(response_types, run_method);
                        SubLObject cdolist_list_var = query_types;
                        SubLObject query_type = NIL;
                        for (query_type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query_type = cdolist_list_var.first()) {
                            if ((query_type == $PROVE) && (NIL != tip_query_target(tip))) {
                                cycl_query = tip_query_target(tip);
                            } else
                                if ((query_type == $DISPROVE) && (NIL != tip_query_target(tip))) {
                                    cycl_query = cycl_utilities.negate(tip_query_target(tip));
                                } else
                                    if (query_type == $PROVE) {
                                        cycl_query = tep_query_content_from_string_for_context_memoized(query_text, premise_mt);
                                    } else
                                        if (query_type == $DISPROVE) {
                                            cycl_query = cycl_utilities.negate(tep_conjunctive_query_content_from_string_for_context_memoized(query_text, premise_mt));
                                        }



                            typed_queries = cons(list(query_type, cycl_query), typed_queries);
                        }
                    }
                    this_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    tip_note_time(tip, $QUERY_PARSE_TIME, this_time);
                }
                {
                    SubLObject this_time = NIL;
                    SubLObject time_var = get_internal_real_time();
                    {
                        SubLObject cdolist_list_var = typed_queries;
                        SubLObject typed_query = NIL;
                        for (typed_query = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , typed_query = cdolist_list_var.first()) {
                            {
                                SubLObject datum = typed_query;
                                SubLObject current = datum;
                                SubLObject query_type = NIL;
                                SubLObject cycl_query_56 = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt210);
                                query_type = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt210);
                                cycl_query_56 = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if (NIL == subl_promotions.memberP(query_parse, $list_alt211, EQUAL, UNPROVIDED)) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject query_answer = inference_kernel.new_cyc_query(cycl_query_56, premise_mt, tip_inference_properties(tip));
                                            SubLObject halt_reason = thread.secondMultipleValue();
                                            SubLObject inference = thread.thirdMultipleValue();
                                            thread.resetMultipleValues();
                                            if (query_type == $PROVE) {
                                                prove_query_cycl = cycl_query_56;
                                                prove_query_answer = query_answer;
                                                prove_query_halt_reason = halt_reason;
                                                prove_query_inference = inference;
                                            } else
                                                if (query_type == $DISPROVE) {
                                                    disprove_query_cycl = cycl_query_56;
                                                    disprove_query_answer = query_answer;
                                                    disprove_query_halt_reason = halt_reason;
                                                    disprove_query_inference = inference;
                                                } else {
                                                    Errors.warn($str_alt212$sent_a_bad_query_type___S_for__S_, query_type, tip_cycl(tip));
                                                }

                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt210);
                                }
                            }
                        }
                    }
                    this_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    tip_note_time(tip, $QUERY_TIME, this_time);
                }
                {
                    SubLObject results_for_response = list(new SubLObject[]{ $PROBLEM, tip_cycl(tip), $RESPONSE, response_types, $RESULT, tip_successP(prove_query_answer, disprove_query_answer, response_types), $PROVE_HALT_REASON, prove_query_halt_reason, $DISPROVE_HALT_REASON, disprove_query_halt_reason, $PREMISE_STRING, tip_background_text(tip), $QUERY_STRING, query_text, $TIP_CYCL_SOURCE, tip_cycl_source(tip) });
                    SubLObject remainder = NIL;
                    for (remainder = tip_metrics(tip); NIL != remainder; remainder = cddr(remainder)) {
                        {
                            SubLObject metric_type = remainder.first();
                            SubLObject value = cadr(remainder);
                            SubLObject pcase_var = metric_type;
                            if (pcase_var.eql($GET_PREMISE_PARSES)) {
                                putf(results_for_response, $PREMISE_PARSES, premise_parses(premise_mt));
                            } else
                                if (pcase_var.eql($GET_PREMISE_MT)) {
                                    putf(results_for_response, $PREMISE_MT, premise_mt);
                                } else
                                    if (pcase_var.eql($GET_ASKED_QUERY)) {
                                        putf(results_for_response, $DISPROVE_ASKED_QUERY, disprove_query_cycl);
                                        putf(results_for_response, $PROVE_ASKED_QUERY, prove_query_cycl);
                                    } else
                                        if (pcase_var.eql($SAVE_INFERENCE)) {
                                            if ((value == $ALL) || ((value == $SUCCESSFUL) && (NIL != getf(results_for_response, $RESULT, UNPROVIDED)))) {
                                                putf(results_for_response, $PROVE_INFERENCE, prove_query_inference);
                                                putf(results_for_response, $DISPROVE_INFERENCE, disprove_query_inference);
                                            }
                                        } else {
                                            putf(results_for_response, metric_type, value);
                                        }



                        }
                    }
                    force_output(UNPROVIDED);
                    return results_for_response;
                }
            }
        }
    }

    public static final SubLObject get_query_types_from_responses(SubLObject response_types, SubLObject run_method) {
        if (run_method == $CHECK_ALL_POSSIBLE_ANSWERS) {
            return $list_alt232;
        } else
            if (NIL != subl_promotions.memberP($UNKNOWN, response_types, UNPROVIDED, UNPROVIDED)) {
                return $list_alt232;
            } else
                if (intersection(response_types, $list_alt234, UNPROVIDED, UNPROVIDED).equal($list_alt234)) {
                    return $list_alt232;
                } else
                    if ($list_alt235.equal(response_types)) {
                        return $list_alt236;
                    } else
                        if ($list_alt237.equal(response_types)) {
                            return $list_alt238;
                        } else {
                            Errors.warn($str_alt239$don_t_know_what_type_of_response_, response_types);
                            return NIL;
                        }




    }

    public static final SubLObject tip_successP(SubLObject prove_query_answer, SubLObject disprove_query_answer, SubLObject response_types) {
        {
            SubLObject failP = NIL;
            if (NIL == failP) {
                {
                    SubLObject csome_list_var = response_types;
                    SubLObject response_type = NIL;
                    for (response_type = csome_list_var.first(); !((NIL != failP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , response_type = csome_list_var.first()) {
                        if ($YES == response_type) {
                            if (!((NIL != cyc_kernel.closed_query_success_result_p(prove_query_answer)) || (NIL != bindings.non_empty_binding_list_p(prove_query_answer)))) {
                                failP = T;
                            }
                        } else
                            if ($UNKNOWN == response_type) {
                                if ((((NIL != cyc_kernel.closed_query_success_result_p(prove_query_answer)) || (NIL != bindings.non_empty_binding_list_p(prove_query_answer))) || (NIL != cyc_kernel.closed_query_success_result_p(disprove_query_answer))) || (NIL != bindings.non_empty_binding_list_p(disprove_query_answer))) {
                                    failP = T;
                                }
                            } else
                                if ($NO == response_type) {
                                    if (!((NIL != cyc_kernel.closed_query_success_result_p(disprove_query_answer)) || (NIL != bindings.non_empty_binding_list_p(disprove_query_answer)))) {
                                        failP = T;
                                    }
                                }


                    }
                }
            }
            return makeBoolean(NIL == failP);
        }
    }

    public static final SubLObject premise_parses(SubLObject collector_mt) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = genl_mts.min_genl_mts(collector_mt, UNPROVIDED, UNPROVIDED);
            SubLObject mt = NIL;
            for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                result = cons(list(mt, ask_utilities.query_variable($sym242$_SENT, listS($$ist_Asserted, mt, $list_alt192), UNPROVIDED, UNPROVIDED)), result);
            }
            return list(collector_mt, result);
        }
    }

    public static final SubLObject response_types_from_text(SubLObject texts) {
        {
            SubLObject response_types = NIL;
            SubLObject cdolist_list_var = texts;
            SubLObject text = NIL;
            for (text = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , text = cdolist_list_var.first()) {
                if (NIL != search($$$yes, text, EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    response_types = cons($YES, response_types);
                } else
                    if (NIL != search($$$unknown, text, EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        response_types = cons($UNKNOWN, response_types);
                    } else
                        if (NIL != search($$$no, text, EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            response_types = cons($NO, response_types);
                        }


            }
            return response_types;
        }
    }

    // defparameter
    public static final SubLSymbol $tip_caching_onP$ = makeSymbol("*TIP-CACHING-ON?*");



    public static final SubLObject cb_textual_inference(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject log_file_name = cconcatenate(format_nil.format_nil_a_no_copy(constants_high.constant_name(api_control_vars.$the_cyclist$.getDynamicValue(thread))), new SubLObject[]{ $str_alt249$_textual_inference_log_, format_nil.format_nil_a_no_copy(numeric_date_utilities.timestamp(UNPROVIDED, UNPROVIDED)) });
                SubLObject log_full_path = file_utilities.get_absolute_path_string(file_utilities.cyc_home_filename($list_alt250, log_file_name, $$$html));
                SubLObject max_transformation_depth = getf($default_ti_inference_properties$.getDynamicValue(thread), $MAX_TRANSFORMATION_DEPTH, UNPROVIDED);
                SubLObject max_time = getf($default_ti_inference_properties$.getDynamicValue(thread), $MAX_TIME, UNPROVIDED);
                SubLObject title_var = $$$Textual_Inference;
                {
                    SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                    try {
                        html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_parameters.cb_head_shortcut_icon();
                        html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                        if (NIL != title_var) {
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_complete.html_complete_script();
                        html_complete.html_autocomplete_css();
                        html_complete.html_autocomplete_scripts();
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_57 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($str_alt256$yui_skin_sam);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_58 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != title_var) {
                                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            html_utilities.html_princ(title_var);
                                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        }
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
                                                    html_utilities.html_hidden_input($str_alt257$cb_handle_textual_inference, T, UNPROVIDED);
                                                    html_script_utilities.cb_hoverover_page_init();
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
                                                        SubLObject _prev_bind_0_60 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_61 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_62 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            if ($str_alt258$Enter_a_specific_instance_of___Te.isString()) {
                                                                                {
                                                                                    SubLObject onmouseover = html_script_utilities.html_hoverover_anchor_onmouseover($str_alt258$Enter_a_specific_instance_of___Te, NIL, NIL, NIL);
                                                                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                                                    html_utilities.html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_utilities.html_markup(onmouseover);
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_utilities.html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_utilities.html_markup($str_alt259$nd___);
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_63 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            html_utilities.html_princ($str_alt260$Textual_Inference_Problem__);
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_63, thread);
                                                                                        }
                                                                                    }
                                                                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_62, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_64 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_text_input($str_alt261$ti_problem, NIL, $int$50);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_64, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_65 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_submit_input($$$Run_Problem, $RUN_PROBLEM, UNPROVIDED);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_65, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_61, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_66 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_67 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_princ($str_alt265$_);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_67, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_66, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_68 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_69 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            if ($str_alt266$Enter_an_instance_of___SetOrColle.isString()) {
                                                                                {
                                                                                    SubLObject onmouseover = html_script_utilities.html_hoverover_anchor_onmouseover($str_alt266$Enter_an_instance_of___SetOrColle, NIL, NIL, NIL);
                                                                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                                                    html_utilities.html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_utilities.html_markup(onmouseover);
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_utilities.html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_utilities.html_markup($str_alt259$nd___);
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_70 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            html_utilities.html_princ($str_alt267$Textual_Inference_Problem_Set__);
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_70, thread);
                                                                                        }
                                                                                    }
                                                                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_69, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_71 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_text_input($str_alt268$ti_problem_set, NIL, $int$50);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_71, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_72 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_submit_input($$$Run_Problem_Set, $RUN_PROBLEM_SET, UNPROVIDED);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_72, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_68, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_60, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                    html_utilities.html_newline(UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                    html_utilities.html_markup(THREE_INTEGER);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    html_utilities.html_princ($str_alt271$Run_a_Novel_Textual_Inference_Pro);
                                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                    html_utilities.html_markup(THREE_INTEGER);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
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
                                                        SubLObject _prev_bind_0_73 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                            html_utilities.html_princ($str_alt272$Premise_Text__);
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
                                                                            html_utilities.html_text_input($$$premise, $str_alt274$, $int$100);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_76, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_74, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_77 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_78 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_princ($str_alt276$Question_Text__);
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
                                                                            html_utilities.html_text_input($$$question, $str_alt274$, $int$100);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_79, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_77, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_80 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_81 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_princ($str_alt278$Desired_Response__);
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
                                                                            html_utilities.html_text_input($$$response, $str_alt274$, TWENTY_INTEGER);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_82, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_80, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_83 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_84 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_submit_input($$$Create_and_Run_Problem, $CREATE_AND_RUN, UNPROVIDED);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_84, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_83, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_73, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                    html_utilities.html_newline(UNPROVIDED);
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt283$Log_File___S, log_full_path);
                                                    html_utilities.html_hidden_input($str_alt284$log_file, log_full_path, UNPROVIDED);
                                                    html_utilities.html_newline(UNPROVIDED);
                                                    html_utilities.html_princ($str_alt285$Transformation_limit__);
                                                    html_utilities.html_text_input($str_alt286$max_transformation_depth, max_transformation_depth, THREE_INTEGER);
                                                    html_utilities.html_indent(THREE_INTEGER);
                                                    html_utilities.html_princ($str_alt287$Time_Limit__);
                                                    html_utilities.html_text_input($str_alt288$max_time, max_time, THREE_INTEGER);
                                                    html_utilities.html_newline(UNPROVIDED);
                                                    html_utilities.html_princ($str_alt289$Run_Method__);
                                                    html_utilities.html_radio_input($str_alt290$run_method, $str_alt291$_specific_answer_desired, T);
                                                    html_utilities.html_princ($$$Look_for_Specified_Answers_Only);
                                                    html_utilities.html_indent(TWO_INTEGER);
                                                    html_utilities.html_radio_input($str_alt290$run_method, $str_alt293$_check_all_possible_answers, NIL);
                                                    html_utilities.html_princ($$$Check_all_possible_answers);
                                                    html_utilities.html_newline(UNPROVIDED);
                                                    html_utilities.html_princ($str_alt295$Clear_any_cached_results__);
                                                    html_utilities.html_checkbox_input($str_alt296$clear_old_results, $str_alt297$_clear_old_results, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_newline(UNPROVIDED);
                                                    html_utilities.html_princ($str_alt298$Save_Inferences__);
                                                    html_utilities.html_radio_input($str_alt299$save_inference, $str_alt300$_none, ti_save_no_inferencesP());
                                                    html_utilities.html_indent(ONE_INTEGER);
                                                    html_utilities.html_princ($$$None);
                                                    html_utilities.html_indent(FOUR_INTEGER);
                                                    html_utilities.html_radio_input($str_alt299$save_inference, $str_alt302$_successful, ti_save_successful_inferencesP());
                                                    html_utilities.html_indent(ONE_INTEGER);
                                                    html_utilities.html_princ($$$Successful_only);
                                                    html_utilities.html_indent(FOUR_INTEGER);
                                                    html_utilities.html_radio_input($str_alt299$save_inference, $str_alt304$_all, ti_save_all_inferencesP());
                                                    html_utilities.html_indent(ONE_INTEGER);
                                                    html_utilities.html_princ($$$All);
                                                    html_utilities.html_newline(UNPROVIDED);
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_59, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_58, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_57, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject ti_save_no_inferencesP() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return eq($tip_inference_saving_mode$.getDynamicValue(thread), $NONE);
        }
    }

    public static final SubLObject ti_save_all_inferencesP() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return eq($tip_inference_saving_mode$.getDynamicValue(thread), $ALL);
        }
    }

    public static final SubLObject ti_save_successful_inferencesP() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return eq($tip_inference_saving_mode$.getDynamicValue(thread), $SUCCESSFUL);
        }
    }

    public static final SubLObject cb_handle_textual_inference(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject problem = string_utilities.cyclify_string(html_utilities.html_extract_input($str_alt261$ti_problem, args));
                SubLObject problem_set = string_utilities.cyclify_string(html_utilities.html_extract_input($str_alt268$ti_problem_set, args));
                SubLObject clear_old = html_utilities.html_extract_input($str_alt296$clear_old_results, args);
                SubLObject run_new = html_utilities.html_extract_input($str_alt308$create_and_run, args);
                SubLObject save_inference = read_from_string_ignoring_errors(html_utilities.html_extract_input($str_alt299$save_inference, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject log_file = html_utilities.html_extract_input($str_alt284$log_file, args);
                SubLObject max_time = read_from_string_ignoring_errors(html_utilities.html_extract_input($str_alt288$max_time, args), T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject max_transformation_depth = read_from_string_ignoring_errors(html_utilities.html_extract_input($str_alt286$max_transformation_depth, args), T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject inference_props = $default_ti_inference_properties$.getDynamicValue(thread);
                SubLObject run_method_from_input = read_from_string_ignoring_errors(html_utilities.html_extract_input($str_alt290$run_method, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject run_method = (NIL != run_method_from_input) ? ((SubLObject) (run_method_from_input)) : $SPECIFIC_ANSWER_DESIRED;
                if (NIL != max_transformation_depth) {
                    inference_props = putf(inference_props, $MAX_TRANSFORMATION_DEPTH, max_transformation_depth);
                }
                if (NIL != max_time) {
                    inference_props = putf(inference_props, $MAX_TIME, max_time);
                }
                $default_ti_inference_properties$.setDynamicValue(inference_props, thread);
                {
                    SubLObject title_var = $$$Text_Inference_Results;
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                        try {
                            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                            html_macros.html_head_content_type();
                            cb_parameters.cb_head_shortcut_icon();
                            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                            if (NIL != title_var) {
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                                html_utilities.html_princ(title_var);
                                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                            }
                            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_85 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                try {
                                    html_macros.$html_inside_bodyP$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($str_alt256$yui_skin_sam);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_86 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            if (NIL != title_var) {
                                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                html_utilities.html_markup(TWO_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                html_utilities.html_princ(title_var);
                                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                html_utilities.html_markup(TWO_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            }
                                            html_script_utilities.cb_hoverover_page_init();
                                            {
                                                SubLObject result_set = NIL;
                                                $tip_inference_saving_mode$.setDynamicValue(save_inference, thread);
                                                force_output(html_macros.$html_stream$.getDynamicValue(thread));
                                                {
                                                    SubLObject state = memoization_state.possibly_new_memoization_state();
                                                    SubLObject local_state = state;
                                                    {
                                                        SubLObject _prev_bind_0_87 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                                                                Errors.error($str_alt184$Invalid_attempt_to_reuse_memoizat);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                try {
                                                                    {
                                                                        SubLObject _prev_bind_0_88 = $tip_log_filename$.currentBinding(thread);
                                                                        try {
                                                                            $tip_log_filename$.bind(log_file, thread);
                                                                            if (NIL != run_new) {
                                                                                {
                                                                                    SubLObject tip = new_textual_inference_problem();
                                                                                    _csetf_tip_cycl(tip, $NEWLY_CONSTRUCTED);
                                                                                    _csetf_tip_background_text(tip, html_utilities.html_extract_input($$$premise, args));
                                                                                    _csetf_tip_query_text(tip, html_utilities.html_extract_input($$$question, args));
                                                                                    _csetf_tip_response_texts(tip, list(html_utilities.html_extract_input($$$response, args)));
                                                                                    _csetf_tip_metrics(tip, putf($default_ti_metrics$.getGlobalValue(), $SAVE_INFERENCE, save_inference));
                                                                                    _csetf_tip_inference_properties(tip, inference_props);
                                                                                    _csetf_tip_run_method(tip, run_method);
                                                                                    if (save_inference != $NONE) {
                                                                                        _csetf_tip_inference_properties(tip, putf(putf(inference_props, $BROWSABLE_, T), $CONTINUABLE_, T));
                                                                                    }
                                                                                    result_set = list(run_specified_ti_problem(tip));
                                                                                }
                                                                            } else
                                                                                if (NIL != string_utilities.non_empty_stringP(problem)) {
                                                                                    problem_set = list($$TheSet, read_from_string_ignoring_errors(string_utilities.cyclify_string(problem), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                                                                    result_set = run_textual_inferences(problem_set, run_method, clear_old, putf($default_ti_metrics$.getGlobalValue(), $SAVE_INFERENCE, save_inference), UNPROVIDED);
                                                                                } else {
                                                                                    problem_set = read_from_string_ignoring_errors(string_utilities.cyclify_string(problem_set), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                    result_set = run_textual_inferences(problem_set, run_method, clear_old, putf($default_ti_metrics$.getGlobalValue(), $SAVE_INFERENCE, save_inference), inference_props);
                                                                                }

                                                                        } finally {
                                                                            $tip_log_filename$.rebind(_prev_bind_0_88, thread);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_89 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                                memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                            }
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_89, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            memoization_state.$memoization_state$.rebind(_prev_bind_0_87, thread);
                                                        }
                                                    }
                                                }
                                                $tip_caching_onP$.setDynamicValue(makeBoolean(NIL == clear_old), thread);
                                                html_utilities.html_princ($str_alt313$Log_File__);
                                                html_utilities.html_princ(log_file);
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_show_tip_result_set(result_set);
                                                if (NIL == result_set) {
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt314$Unable_to_find_any_queries_from__, problem_set);
                                                }
                                            }
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            html_utilities.html_copyright_notice();
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_86, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_85, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return NIL;
            }
        }
    }

    public static final SubLObject cb_link_textual_inference(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $$$TextInf;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_princ($str_alt318$cb_textual_inference);
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

    public static final SubLObject html_show_tip_result_set(SubLObject result_set) {
        html_show_tip_result_summary(result_set);
        {
            SubLObject cdolist_list_var = result_set;
            SubLObject problem_result = NIL;
            for (problem_result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , problem_result = cdolist_list_var.first()) {
                html_show_tip_result_preamble(problem_result);
                html_show_tip_result_guts(problem_result);
            }
        }
        return NIL;
    }

    public static final SubLObject html_show_tip_result_summary(SubLObject result_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total_problems = ZERO_INTEGER;
                SubLObject total_success = ZERO_INTEGER;
                SubLObject cdolist_list_var = result_list;
                SubLObject result = NIL;
                for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                    total_problems = add(total_problems, ONE_INTEGER);
                    if (getf(result, $RESULT, UNPROVIDED) == T) {
                        total_success = add(total_success, ONE_INTEGER);
                    }
                }
                if (!total_problems.numE(ZERO_INTEGER)) {
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt321$Success_Ratio___S____S__S_, new SubLObject[]{ multiply($int$100, divide(total_success, total_problems)), total_success, total_problems });
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                }
                return NIL;
            }
        }
    }

    public static final SubLObject html_show_tip_result_preamble(SubLObject problem_result) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
            {
                SubLObject problem = getf(problem_result, $PROBLEM, UNPROVIDED);
                SubLObject success_string = (NIL != getf(problem_result, $RESULT, UNPROVIDED)) ? ((SubLObject) ($$$Success)) : $$$Failure;
                SubLObject success_color = (success_string.equal($$$Success)) ? ((SubLObject) ($GREEN)) : $RED;
                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_utilities.html_markup(THREE_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt326$TEP__);
                cb_utilities.cb_form(problem, UNPROVIDED, UNPROVIDED);
                html_utilities.html_princ($str_alt327$____Result__);
                html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_style_background_color(success_color);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        format(html_macros.$html_stream$.getDynamicValue(thread), success_string);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_utilities.html_markup(THREE_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
            }
            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
            html_utilities.html_princ($str_alt328$Premise__);
            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            html_utilities.html_princ(getf(problem_result, $PREMISE_STRING, UNPROVIDED));
            html_utilities.html_newline(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
            html_utilities.html_princ($str_alt329$Question__);
            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            html_utilities.html_princ(getf(problem_result, $QUERY_STRING, UNPROVIDED));
            if (getf(problem_result, $HALT_REASON, UNPROVIDED) == $ILL_FORMED) {
                html_utilities.html_indent(TWO_INTEGER);
                html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_style_background_color($RED);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_princ($str_alt332$Query_Parse_Ill_formed);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
            }
            html_utilities.html_newline(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
            html_utilities.html_princ($str_alt333$Interpretation_Source__);
            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            html_utilities.html_princ(getf(problem_result, $TIP_CYCL_SOURCE, UNPROVIDED));
            html_utilities.html_newline(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
            html_utilities.html_princ($str_alt334$Desired_Answer__);
            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            html_utilities.html_princ(getf(problem_result, $RESPONSE, UNPROVIDED));
            html_utilities.html_newline(UNPROVIDED);
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
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_90 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    html_utilities.html_princ($str_alt335$Premise_Parse_Assert_Time);
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
                                    html_utilities.html_princ($$$Query_Parse_Time);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_92, thread);
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
                                SubLObject _prev_bind_0_93 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_princ($$$Query_Run_Time);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_93, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_90, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_94 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                SubLObject _prev_bind_0_95 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_show_tip_time(getf(problem_result, $PREMISE_TIME, UNPROVIDED));
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_95, thread);
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
                                SubLObject _prev_bind_0_96 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_show_tip_time(getf(problem_result, $QUERY_PARSE_TIME, UNPROVIDED));
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_96, thread);
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
                                SubLObject _prev_bind_0_97 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_show_tip_time(getf(problem_result, $QUERY_TIME, UNPROVIDED));
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_97, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_94, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static final SubLObject html_show_tip_time(SubLObject timeXnew_or_old) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = timeXnew_or_old;
                SubLObject current = datum;
                SubLObject time = NIL;
                SubLObject new_or_old = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt338);
                time = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt338);
                new_or_old = current.first();
                current = current.rest();
                if (NIL == current) {
                    html_utilities.html_princ(time);
                    if (new_or_old == $REUSED) {
                        if ($str_alt339$The_system_re_used_to_the_parse_f.isString()) {
                            {
                                SubLObject onmouseover = html_script_utilities.html_hoverover_anchor_onmouseover($str_alt339$The_system_re_used_to_the_parse_f, NIL, NIL, NIL);
                                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(onmouseover);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($str_alt259$nd___);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_style_background_color($YELLOW);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_98 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_princ($str_alt341$_);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_98, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                            }
                        }
                    }
                    html_utilities.html_princ($str_alt342$_s);
                } else {
                    cdestructuring_bind_error(datum, $list_alt338);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject html_show_tip_result_guts(SubLObject problem_result) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != getf(problem_result, $PREMISE_PARSES, UNPROVIDED)) {
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
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_99 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_100 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Premise_Parses);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_100, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_99, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject cdolist_list_var = second(getf(problem_result, $PREMISE_PARSES, UNPROVIDED));
                            SubLObject parse = NIL;
                            for (parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parse = cdolist_list_var.first()) {
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_101 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_102 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_103 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_104 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_105 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt344$Premise_Parse_Mt__);
                                                                        cb_utilities.cb_form(parse.first(), UNPROVIDED, UNPROVIDED);
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
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_106 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_107 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_terpri(UNPROVIDED);
                                                                        html_utilities.html_princ($str_alt345$Mt_Contents_);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_107, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_106, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        {
                                                            SubLObject cdolist_list_var_108 = second(parse);
                                                            SubLObject mt_sentence = NIL;
                                                            for (mt_sentence = cdolist_list_var_108.first(); NIL != cdolist_list_var_108; cdolist_list_var_108 = cdolist_list_var_108.rest() , mt_sentence = cdolist_list_var_108.first()) {
                                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_109 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_110 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                cb_utilities.cb_form(mt_sentence, UNPROVIDED, UNPROVIDED);
                                                                                html_utilities.html_terpri(UNPROVIDED);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_110, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_109, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                            }
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_103, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_102, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_101, thread);
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
            if ((NIL != getf(problem_result, $PROVE_ASKED_QUERY, UNPROVIDED)) || (NIL != getf(problem_result, $DISPROVE_ASKED_QUERY, UNPROVIDED))) {
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt346$Query_Mt__);
                cb_utilities.cb_form(getf(problem_result, $PREMISE_PARSES, UNPROVIDED).first(), UNPROVIDED, UNPROVIDED);
                html_utilities.html_newline(UNPROVIDED);
                if (NIL != getf(problem_result, $PROVE_ASKED_QUERY, UNPROVIDED)) {
                    html_utilities.html_princ($str_alt347$Positive_Query__);
                    if (NIL != getf(problem_result, $PROVE_INFERENCE, UNPROVIDED)) {
                        cb_utilities.cb_link($INFERENCE, getf(problem_result, $PROVE_INFERENCE, UNPROVIDED), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_newline(UNPROVIDED);
                    }
                    html_utilities.html_newline(UNPROVIDED);
                    cb_utilities.cb_form(getf(problem_result, $PROVE_ASKED_QUERY, UNPROVIDED), ZERO_INTEGER, T);
                    html_utilities.html_newline(UNPROVIDED);
                }
                if (NIL != getf(problem_result, $DISPROVE_ASKED_QUERY, UNPROVIDED)) {
                    html_utilities.html_princ($str_alt348$Negative_Query__);
                    if (NIL != getf(problem_result, $DISPROVE_INFERENCE, UNPROVIDED)) {
                        cb_utilities.cb_link($INFERENCE, getf(problem_result, $DISPROVE_INFERENCE, UNPROVIDED), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_newline(UNPROVIDED);
                    }
                    html_utilities.html_newline(UNPROVIDED);
                    cb_utilities.cb_form(getf(problem_result, $DISPROVE_ASKED_QUERY, UNPROVIDED), ZERO_INTEGER, T);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tip_save_problem_output_to_file(SubLObject problem_result) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject html_string = NIL;
                SubLObject file_name = $tip_log_filename$.getDynamicValue(thread);
                SubLObject stream = NIL;
                try {
                    stream = make_private_string_output_stream();
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                        try {
                            html_macros.$html_stream$.bind(stream, thread);
                            html_show_tip_result_preamble(problem_result);
                            html_show_tip_result_guts(problem_result);
                        } finally {
                            html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_string = get_output_stream_string(stream);
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            close(stream, UNPROVIDED);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                {
                    SubLObject stream_111 = NIL;
                    try {
                        stream_111 = compatibility.open_text(file_name, $APPEND, NIL);
                        if (!stream_111.isStream()) {
                            Errors.error($str_alt350$Unable_to_open__S, file_name);
                        }
                        {
                            SubLObject file = stream_111;
                            princ(html_string, file);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                if (stream_111.isStream()) {
                                    close(stream_111, UNPROVIDED);
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return NIL;
            }
        }
    }

    public static final SubLObject declare_textual_entailments_file() {
        declareFunction("tep_query_content_from_string", "TEP-QUERY-CONTENT-FROM-STRING", 1, 0, false);
        declareFunction("tep_sentence_content_from_string", "TEP-SENTENCE-CONTENT-FROM-STRING", 1, 0, false);
        declareFunction("tep_query_content_from_string_for_context", "TEP-QUERY-CONTENT-FROM-STRING-FOR-CONTEXT", 2, 0, false);
        declareFunction("tep_query_content_from_string_for_context_memoized_internal", "TEP-QUERY-CONTENT-FROM-STRING-FOR-CONTEXT-MEMOIZED-INTERNAL", 2, 0, false);
        declareFunction("tep_query_content_from_string_for_context_memoized", "TEP-QUERY-CONTENT-FROM-STRING-FOR-CONTEXT-MEMOIZED", 2, 0, false);
        declareFunction("tep_conjunctive_query_content_from_string_for_context", "TEP-CONJUNCTIVE-QUERY-CONTENT-FROM-STRING-FOR-CONTEXT", 2, 0, false);
        declareFunction("tep_conjunctive_query_content_from_string_for_context_memoized_internal", "TEP-CONJUNCTIVE-QUERY-CONTENT-FROM-STRING-FOR-CONTEXT-MEMOIZED-INTERNAL", 2, 0, false);
        declareFunction("tep_conjunctive_query_content_from_string_for_context_memoized", "TEP-CONJUNCTIVE-QUERY-CONTENT-FROM-STRING-FOR-CONTEXT-MEMOIZED", 2, 0, false);
        declareFunction("tep_premise_context_from_string", "TEP-PREMISE-CONTEXT-FROM-STRING", 1, 2, false);
        declareFunction("tep_premise_context_from_string_and_cycl", "TEP-PREMISE-CONTEXT-FROM-STRING-AND-CYCL", 4, 0, false);
        declareFunction("tep_premise_context_from_string_memoized_internal", "TEP-PREMISE-CONTEXT-FROM-STRING-MEMOIZED-INTERNAL", 1, 3, false);
        declareFunction("tep_premise_context_from_string_memoized", "TEP-PREMISE-CONTEXT-FROM-STRING-MEMOIZED", 1, 3, false);
        declareFunction("get_cyclification_parsers", "GET-CYCLIFICATION-PARSERS", 0, 0, false);
        declareFunction("ti_reformulate_results", "TI-REFORMULATE-RESULTS", 1, 0, false);
        declareFunction("get_cycls_for_sentence", "GET-CYCLS-FOR-SENTENCE", 1, 4, false);
        declareFunction("get_cycls_for_sentence_memoized_internal", "GET-CYCLS-FOR-SENTENCE-MEMOIZED-INTERNAL", 6, 1, false);
        declareFunction("get_cycls_for_sentence_memoized", "GET-CYCLS-FOR-SENTENCE-MEMOIZED", 6, 1, false);
        declareFunction("handle_keyword_results", "HANDLE-KEYWORD-RESULTS", 1, 0, false);
        declareFunction("replace_keywords_with_vars", "REPLACE-KEYWORDS-WITH-VARS", 1, 0, false);
        declareFunction("te_remove_keyword_literals", "TE-REMOVE-KEYWORD-LITERALS", 1, 0, false);
        declareFunction("convert_keywords_to_variables", "CONVERT-KEYWORDS-TO-VARIABLES", 1, 0, false);
        declareFunction("var_from_keyword", "VAR-FROM-KEYWORD", 1, 0, false);
        declareFunction("get_tep_lexicon", "GET-TEP-LEXICON", 0, 0, false);
        declareFunction("get_new_tep_lexicon", "GET-NEW-TEP-LEXICON", 0, 0, false);
        declareFunction("get_new_l2r_lexicon", "GET-NEW-L2R-LEXICON", 0, 0, false);
        declareFunction("cyclifier_properties_for_teps", "CYCLIFIER-PROPERTIES-FOR-TEPS", 0, 0, false);
        declareFunction("cyclifier_properties_for_l2r", "CYCLIFIER-PROPERTIES-FOR-L2R", 0, 0, false);
        declareFunction("get_cyclifier_properties", "GET-CYCLIFIER-PROPERTIES", 1, 0, false);
        declareFunction("ti_pred_strengthen_sentence", "TI-PRED-STRENGTHEN-SENTENCE", 2, 0, false);
        declareFunction("ti_pred_strengthening_max_literal_count", "TI-PRED-STRENGTHENING-MAX-LITERAL-COUNT", 0, 0, false);
        declareFunction("ti_pred_strengthen_results", "TI-PRED-STRENGTHEN-RESULTS", 1, 1, false);
        declareFunction("simplify_and_maybe_transform", "SIMPLIFY-AND-MAYBE-TRANSFORM", 1, 1, false);
        declareFunction("bind_any_free_vars", "BIND-ANY-FREE-VARS", 1, 0, false);
        declareFunction("transform_instancefns_and_bind", "TRANSFORM-INSTANCEFNS-AND-BIND", 1, 0, false);
        declareFunction("existentially_bind_vars", "EXISTENTIALLY-BIND-VARS", 1, 1, false);
        declareFunction("clear_ti_template_forward_rules", "CLEAR-TI-TEMPLATE-FORWARD-RULES", 0, 0, false);
        declareFunction("remove_ti_template_forward_rules", "REMOVE-TI-TEMPLATE-FORWARD-RULES", 1, 0, false);
        declareFunction("ti_template_forward_rules_internal", "TI-TEMPLATE-FORWARD-RULES-INTERNAL", 1, 0, false);
        declareFunction("ti_template_forward_rules", "TI-TEMPLATE-FORWARD-RULES", 1, 0, false);
        declareFunction("create_cyclifier_content_model", "CREATE-CYCLIFIER-CONTENT-MODEL", 1, 3, false);
        declareFunction("assert_interp_in_mt", "ASSERT-INTERP-IN-MT", 3, 0, false);
        declareFunction("update_interps_on_model", "UPDATE-INTERPS-ON-MODEL", 2, 4, false);
        declareFunction("assert_interps_int", "ASSERT-INTERPS-INT", 6, 0, false);
        declareFunction("ti_get_best_interps_for_string", "TI-GET-BEST-INTERPS-FOR-STRING", 2, 0, false);
        declareFunction("ti_parser_timeout_for_application", "TI-PARSER-TIMEOUT-FOR-APPLICATION", 1, 0, false);
        declareFunction("maybe_strengthen_cyclifier_results", "MAYBE-STRENGTHEN-CYCLIFIER-RESULTS", 2, 0, false);
        declareFunction("maybe_narrow_cyclifier_results", "MAYBE-NARROW-CYCLIFIER-RESULTS", 2, 0, false);
        declareFunction("filter_l2r_parse_results", "FILTER-L2R-PARSE-RESULTS", 1, 0, false);
        declareFunction("parse_from_conjuncts", "PARSE-FROM-CONJUNCTS", 1, 0, false);
        declareFunction("remove_made_up_isa_conjuncts", "REMOVE-MADE-UP-ISA-CONJUNCTS", 1, 0, false);
        declareFunction("made_up_isa_literal_p", "MADE-UP-ISA-LITERAL-P", 1, 0, false);
        declareFunction("made_up_type_p", "MADE-UP-TYPE-P", 1, 0, false);
        declareFunction("remove_disconnected_conjuncts", "REMOVE-DISCONNECTED-CONJUNCTS", 1, 0, false);
        declareFunction("disconnected_var_conjunctP", "DISCONNECTED-VAR-CONJUNCT?", 2, 0, false);
        declareFunction("uninformative_parse_arg0_pred_p", "UNINFORMATIVE-PARSE-ARG0-PRED-P", 1, 0, false);
        declareFunction("disconnected_var_conjunctP_internal", "DISCONNECTED-VAR-CONJUNCT?-INTERNAL", 3, 0, false);
        declareFunction("parse_and_partition_sentence_parses", "PARSE-AND-PARTITION-SENTENCE-PARSES", 1, 3, false);
        declareFunction("te_subparses", "TE-SUBPARSES", 1, 0, false);
        declareFunction("te_sufficiently_specific_fortP", "TE-SUFFICIENTLY-SPECIFIC-FORT?", 1, 0, false);
        declareFunction("te_conjuncts_from_parse", "TE-CONJUNCTS-FROM-PARSE", 1, 1, false);
        declareFunction("te_remove_equals_clauses", "TE-REMOVE-EQUALS-CLAUSES", 1, 0, false);
        declareFunction("te_expression_containsP", "TE-EXPRESSION-CONTAINS?", 2, 0, false);
        declareFunction("te_get_cycls_for_sentence", "TE-GET-CYCLS-FOR-SENTENCE", 3, 1, false);
        declareFunction("sentence_parse_known_trueP", "SENTENCE-PARSE-KNOWN-TRUE?", 3, 0, false);
        declareFunction("sentence_parse_known_falseP", "SENTENCE-PARSE-KNOWN-FALSE?", 3, 0, false);
        declareFunction("create_interp_mt_for_cyclifier_result", "CREATE-INTERP-MT-FOR-CYCLIFIER-RESULT", 2, 0, false);
        declareFunction("add_asserts_for_textual_inference_mts", "ADD-ASSERTS-FOR-TEXTUAL-INFERENCE-MTS", 1, 0, false);
        declareFunction("add_asserts_for_l2r_mts", "ADD-ASSERTS-FOR-L2R-MTS", 1, 0, false);
        declareFunction("get_cntxt_name_from_sentence", "GET-CNTXT-NAME-FROM-SENTENCE", 1, 1, false);
        declareFunction("saving_tip_output_to_file", "SAVING-TIP-OUTPUT-TO-FILE", 0, 0, false);
        declareMacro("noting_tip_time", "NOTING-TIP-TIME");
        declareMacro("with_tip_logging", "WITH-TIP-LOGGING");
        declareFunction("textual_inference_problem_print_function_trampoline", "TEXTUAL-INFERENCE-PROBLEM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("textual_inference_problem_p", "TEXTUAL-INFERENCE-PROBLEM-P", 1, 0, false);
        new textual_entailments.$textual_inference_problem_p$UnaryFunction();
        declareFunction("tip_cycl", "TIP-CYCL", 1, 0, false);
        declareFunction("tip_cycl_source", "TIP-CYCL-SOURCE", 1, 0, false);
        declareFunction("tip_run_method", "TIP-RUN-METHOD", 1, 0, false);
        declareFunction("tip_background_text", "TIP-BACKGROUND-TEXT", 1, 0, false);
        declareFunction("tip_background_target", "TIP-BACKGROUND-TARGET", 1, 0, false);
        declareFunction("tip_query_text", "TIP-QUERY-TEXT", 1, 0, false);
        declareFunction("tip_query_target", "TIP-QUERY-TARGET", 1, 0, false);
        declareFunction("tip_response_texts", "TIP-RESPONSE-TEXTS", 1, 0, false);
        declareFunction("tip_polarities", "TIP-POLARITIES", 1, 0, false);
        declareFunction("tip_inference_properties", "TIP-INFERENCE-PROPERTIES", 1, 0, false);
        declareFunction("tip_metrics", "TIP-METRICS", 1, 0, false);
        declareFunction("_csetf_tip_cycl", "_CSETF-TIP-CYCL", 2, 0, false);
        declareFunction("_csetf_tip_cycl_source", "_CSETF-TIP-CYCL-SOURCE", 2, 0, false);
        declareFunction("_csetf_tip_run_method", "_CSETF-TIP-RUN-METHOD", 2, 0, false);
        declareFunction("_csetf_tip_background_text", "_CSETF-TIP-BACKGROUND-TEXT", 2, 0, false);
        declareFunction("_csetf_tip_background_target", "_CSETF-TIP-BACKGROUND-TARGET", 2, 0, false);
        declareFunction("_csetf_tip_query_text", "_CSETF-TIP-QUERY-TEXT", 2, 0, false);
        declareFunction("_csetf_tip_query_target", "_CSETF-TIP-QUERY-TARGET", 2, 0, false);
        declareFunction("_csetf_tip_response_texts", "_CSETF-TIP-RESPONSE-TEXTS", 2, 0, false);
        declareFunction("_csetf_tip_polarities", "_CSETF-TIP-POLARITIES", 2, 0, false);
        declareFunction("_csetf_tip_inference_properties", "_CSETF-TIP-INFERENCE-PROPERTIES", 2, 0, false);
        declareFunction("_csetf_tip_metrics", "_CSETF-TIP-METRICS", 2, 0, false);
        declareFunction("make_textual_inference_problem", "MAKE-TEXTUAL-INFERENCE-PROBLEM", 0, 1, false);
        declareFunction("new_textual_inference_problem", "NEW-TEXTUAL-INFERENCE-PROBLEM", 0, 0, false);
        declareFunction("tip_note_time", "TIP-NOTE-TIME", 3, 0, false);
        declareFunction("run_textual_inferences", "RUN-TEXTUAL-INFERENCES", 1, 4, false);
        declareFunction("clear_run_textual_inference", "CLEAR-RUN-TEXTUAL-INFERENCE", 0, 0, false);
        declareFunction("remove_run_textual_inference", "REMOVE-RUN-TEXTUAL-INFERENCE", 2, 2, false);
        declareFunction("run_textual_inference_internal", "RUN-TEXTUAL-INFERENCE-INTERNAL", 4, 0, false);
        declareFunction("run_textual_inference", "RUN-TEXTUAL-INFERENCE", 2, 2, false);
        declareFunction("get_text_and_polarity_for_responses", "GET-TEXT-AND-POLARITY-FOR-RESPONSES", 1, 0, false);
        declareFunction("cleanup_previous_runs_for_user", "CLEANUP-PREVIOUS-RUNS-FOR-USER", 1, 0, false);
        declareFunction("run_specified_ti_problem", "RUN-SPECIFIED-TI-PROBLEM", 1, 0, false);
        declareFunction("get_query_types_from_responses", "GET-QUERY-TYPES-FROM-RESPONSES", 2, 0, false);
        declareFunction("tip_successP", "TIP-SUCCESS?", 3, 0, false);
        declareFunction("premise_parses", "PREMISE-PARSES", 1, 0, false);
        declareFunction("response_types_from_text", "RESPONSE-TYPES-FROM-TEXT", 1, 0, false);
        declareFunction("cb_textual_inference", "CB-TEXTUAL-INFERENCE", 0, 1, false);
        declareFunction("ti_save_no_inferencesP", "TI-SAVE-NO-INFERENCES?", 0, 0, false);
        declareFunction("ti_save_all_inferencesP", "TI-SAVE-ALL-INFERENCES?", 0, 0, false);
        declareFunction("ti_save_successful_inferencesP", "TI-SAVE-SUCCESSFUL-INFERENCES?", 0, 0, false);
        declareFunction("cb_handle_textual_inference", "CB-HANDLE-TEXTUAL-INFERENCE", 1, 0, false);
        declareFunction("cb_link_textual_inference", "CB-LINK-TEXTUAL-INFERENCE", 0, 1, false);
        declareFunction("html_show_tip_result_set", "HTML-SHOW-TIP-RESULT-SET", 1, 0, false);
        declareFunction("html_show_tip_result_summary", "HTML-SHOW-TIP-RESULT-SUMMARY", 1, 0, false);
        declareFunction("html_show_tip_result_preamble", "HTML-SHOW-TIP-RESULT-PREAMBLE", 1, 0, false);
        declareFunction("html_show_tip_time", "HTML-SHOW-TIP-TIME", 1, 0, false);
        declareFunction("html_show_tip_result_guts", "HTML-SHOW-TIP-RESULT-GUTS", 1, 0, false);
        declareFunction("tip_save_problem_output_to_file", "TIP-SAVE-PROBLEM-OUTPUT-TO-FILE", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_textual_entailments_file() {
        defparameter("*AVAILABLE-CYCLIFICATION-PARSERS*", NIL);
        defparameter("*TI-CATCH-ERRORS?*", T);
        defparameter("*REPLACE-KEYWORDS-WITH-VARS?*", NIL);
        defparameter("*REMOVE-LITERALS-WITH-KEYWORDS?*", T);
        defparameter("*NEW-KEYWORD-VARS*", NIL);
        defparameter("*TRANSFORM-INSTANCEFNS?*", T);
        defparameter("*LEXICON-FOR-TEPS*", NIL);
        defparameter("*L2R-USE-TEP-LEXICON?*", T);
        defparameter("*WFF-CHECK-PARSE-FOR-TEPS*", T);
        defparameter("*WFF-CHECK-PARSE-FOR-L2R*", T);
        defparameter("*TI-PRED-STRENGTHENING-MAX-LITERAL-COUNT*", FIVE_INTEGER);
        deflexical("*TI-TEMPLATE-FORWARD-RULES-CACHING-STATE*", NIL);
        defparameter("*L2R-SENTENCE-CYCLIFICATION-MAX-TIME*", $int$600);
        defparameter("*MAX-LENGTH-FOR-CONTENT-MODEL-NAME*", SEVEN_INTEGER);
        defparameter("*DEFAULT-TI-INFERENCE-PROPERTIES*", $list_alt123);
        deflexical("*DEFAULT-TI-METRICS*", $list_alt125);
        deflexical("*TI-INFERENCES-BY-CYCLIST*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        defparameter("*TIP-LOG-FILENAME*", NIL);
        defparameter("*TIP-TIMES*", cache.new_cache(TEN_INTEGER, EQUAL));
        defconstant("*DTP-TEXTUAL-INFERENCE-PROBLEM*", TEXTUAL_INFERENCE_PROBLEM);
        deflexical("*RUN-TEXTUAL-INFERENCE-CACHING-STATE*", NIL);
        defparameter("*TIP-CACHING-ON?*", NIL);
        defparameter("*TIP-INFERENCE-SAVING-MODE*", $ALL);
        return NIL;
    }

    public static final SubLObject setup_textual_entailments_file() {
                utilities_macros.register_kb_function(TEP_QUERY_CONTENT_FROM_STRING);
        utilities_macros.register_kb_function(TEP_SENTENCE_CONTENT_FROM_STRING);
        utilities_macros.register_kb_function(TEP_QUERY_CONTENT_FROM_STRING_FOR_CONTEXT);
        memoization_state.note_memoized_function(TEP_QUERY_CONTENT_FROM_STRING_FOR_CONTEXT_MEMOIZED);
        utilities_macros.register_kb_function(TEP_CONJUNCTIVE_QUERY_CONTENT_FROM_STRING_FOR_CONTEXT);
        memoization_state.note_memoized_function(TEP_CONJUNCTIVE_QUERY_CONTENT_FROM_STRING_FOR_CONTEXT_MEMOIZED);
        utilities_macros.register_kb_function(TEP_PREMISE_CONTEXT_FROM_STRING);
        memoization_state.note_memoized_function(TEP_PREMISE_CONTEXT_FROM_STRING_MEMOIZED);
        memoization_state.note_memoized_function(GET_CYCLS_FOR_SENTENCE_MEMOIZED);
        memoization_state.note_globally_cached_function(TI_TEMPLATE_FORWARD_RULES);
        utilities_macros.register_html_state_variable($default_ti_inference_properties$);
        utilities_macros.register_html_state_variable($tip_times$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_textual_inference_problem$.getGlobalValue(), symbol_function(TEXTUAL_INFERENCE_PROBLEM_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(TIP_CYCL, _CSETF_TIP_CYCL);
        def_csetf(TIP_CYCL_SOURCE, _CSETF_TIP_CYCL_SOURCE);
        def_csetf(TIP_RUN_METHOD, _CSETF_TIP_RUN_METHOD);
        def_csetf(TIP_BACKGROUND_TEXT, _CSETF_TIP_BACKGROUND_TEXT);
        def_csetf(TIP_BACKGROUND_TARGET, _CSETF_TIP_BACKGROUND_TARGET);
        def_csetf(TIP_QUERY_TEXT, _CSETF_TIP_QUERY_TEXT);
        def_csetf(TIP_QUERY_TARGET, _CSETF_TIP_QUERY_TARGET);
        def_csetf(TIP_RESPONSE_TEXTS, _CSETF_TIP_RESPONSE_TEXTS);
        def_csetf(TIP_POLARITIES, _CSETF_TIP_POLARITIES);
        def_csetf(TIP_INFERENCE_PROPERTIES, _CSETF_TIP_INFERENCE_PROPERTIES);
        def_csetf(TIP_METRICS, _CSETF_TIP_METRICS);
        identity(TEXTUAL_INFERENCE_PROBLEM);
        memoization_state.note_globally_cached_function(RUN_TEXTUAL_INFERENCE);
        utilities_macros.register_html_state_variable($sym247$_TIP_CACHING_ON__);
        utilities_macros.register_html_state_variable($tip_inference_saving_mode$);
        html_macros.note_html_handler_function(CB_TEXTUAL_INFERENCE);
        html_macros.note_html_handler_function(CB_HANDLE_TEXTUAL_INFERENCE);
        cb_utilities.setup_cb_link_method($TEXTUAL_INFERENCE, CB_LINK_TEXTUAL_INFERENCE, ONE_INTEGER);
        cb_utilities.declare_cb_tool($TEXTUAL_INFERENCE, $$$Textual_Inference, $$$TextInf, $$$Running_Textual_Inferences);
        return NIL;
    }



    private static final SubLSymbol TEP_QUERY_CONTENT_FROM_STRING = makeSymbol("TEP-QUERY-CONTENT-FROM-STRING");

    private static final SubLSymbol TEP_SENTENCE_CONTENT_FROM_STRING = makeSymbol("TEP-SENTENCE-CONTENT-FROM-STRING");

    public static final SubLObject $$queryForTextualInferenceContext = constant_handles.reader_make_constant_shell(makeString("queryForTextualInferenceContext"));

    public static final SubLObject $$TheList = constant_handles.reader_make_constant_shell(makeString("TheList"));

    private static final SubLSymbol TEP_QUERY_CONTENT_FROM_STRING_FOR_CONTEXT = makeSymbol("TEP-QUERY-CONTENT-FROM-STRING-FOR-CONTEXT");

    private static final SubLSymbol TEP_QUERY_CONTENT_FROM_STRING_FOR_CONTEXT_MEMOIZED = makeSymbol("TEP-QUERY-CONTENT-FROM-STRING-FOR-CONTEXT-MEMOIZED");

    public static final SubLSymbol $kw7$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    private static final SubLSymbol TEP_CONJUNCTIVE_QUERY_CONTENT_FROM_STRING_FOR_CONTEXT = makeSymbol("TEP-CONJUNCTIVE-QUERY-CONTENT-FROM-STRING-FOR-CONTEXT");

    private static final SubLSymbol TEP_CONJUNCTIVE_QUERY_CONTENT_FROM_STRING_FOR_CONTEXT_MEMOIZED = makeSymbol("TEP-CONJUNCTIVE-QUERY-CONTENT-FROM-STRING-FOR-CONTEXT-MEMOIZED");

    public static final SubLObject $const10$TextualEntailmentGenericBackgroun = constant_handles.reader_make_constant_shell(makeString("TextualEntailmentGenericBackgroundMt"));

    private static final SubLSymbol TEP_PREMISE_CONTEXT_FROM_STRING = makeSymbol("TEP-PREMISE-CONTEXT-FROM-STRING");

    private static final SubLSymbol TEP_PREMISE_CONTEXT_FROM_STRING_MEMOIZED = makeSymbol("TEP-PREMISE-CONTEXT-FROM-STRING-MEMOIZED");

    public static final SubLObject $$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));



    public static final SubLObject $$ReformulatorRuleUnifier = constant_handles.reader_make_constant_shell(makeString("ReformulatorRuleUnifier"));

    public static final SubLObject $$RKFParsingMt = constant_handles.reader_make_constant_shell(makeString("RKFParsingMt"));

    private static final SubLSymbol STRING_OR_UNICODE_NAUT_P = makeSymbol("STRING-OR-UNICODE-NAUT-P");

    private static final SubLSymbol GET_CYCLS_FOR_SENTENCE_MEMOIZED = makeSymbol("GET-CYCLS-FOR-SENTENCE-MEMOIZED");



    static private final SubLString $str_alt20$RTP_caught_error__S_while_parsing = makeString("RTP caught error ~S while parsing ~S~%");

    static private final SubLString $str_alt21$EBMT_caught_error__S_while_parsin = makeString("EBMT caught error ~S while parsing ~S~%");



    static private final SubLString $str_alt23$Cyclify_caught_error__S_while_par = makeString("Cyclify caught error ~S while parsing ~S~%");

    static private final SubLString $str_alt24$Timed_out_after__S_seconds_cyclif = makeString("Timed out after ~S seconds cyclifying ~S~% Results: ~S");

    static private final SubLString $str_alt25$_S_possible_parses__incl__duplica = makeString("~S possible parses (incl. duplicates) were initially found for ~S~%");

    private static final SubLSymbol EXPRESSION_CONTAINS_KEYWORDP = makeSymbol("EXPRESSION-CONTAINS-KEYWORDP");



    private static final SubLSymbol VAR_FROM_KEYWORD = makeSymbol("VAR-FROM-KEYWORD");

    static private final SubLString $str_alt29$_ = makeString("?");

    private static final SubLSymbol TEXTUAL_INFERENCE_LEXICON = makeSymbol("TEXTUAL-INFERENCE-LEXICON");



    public static final SubLObject $const32$SupplementalDeterminerSemTransLex = constant_handles.reader_make_constant_shell(makeString("SupplementalDeterminerSemTransLexicalMt"));





    static private final SubLString $str_alt35$TextLearnerSupplementalLexiconMic = makeString("TextLearnerSupplementalLexiconMicrotheory");

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));











    static private final SubLString $str_alt42$_A_is_not_a__A = makeString("~A is not a ~A");





    static private final SubLString $$$continue_anyway = makeString("continue anyway");



    static private final SubLString $str_alt47$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt48$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLList $list_alt49 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    static private final SubLString $str_alt50$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");



    public static final SubLSymbol $kw52$WFF_CHECK_ = makeKeyword("WFF-CHECK?");



    private static final SubLSymbol SIMPLIFY_CYCL_SENTENCE_SYNTAX = makeSymbol("SIMPLIFY-CYCL-SENTENCE-SYNTAX");

    private static final SubLSymbol TI_TEMPLATE_FORWARD_RULES = makeSymbol("TI-TEMPLATE-FORWARD-RULES");



    public static final SubLSymbol $ti_template_forward_rules_caching_state$ = makeSymbol("*TI-TEMPLATE-FORWARD-RULES-CACHING-STATE*");

    static private final SubLString $str_alt58$CyclifierContentModelMt_ = makeString("CyclifierContentModelMt-");

    public static final SubLObject $const59$TextualInferenceContentModelCreat = constant_handles.reader_make_constant_shell(makeString("TextualInferenceContentModelCreationTemplate"));

    static private final SubLList $list_alt60 = list(constant_handles.reader_make_constant_shell(makeString("ContentModelMicrotheory")));

    public static final SubLObject $$UniversalVocabularyMt = constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    public static final SubLObject $$contentModelForString = constant_handles.reader_make_constant_shell(makeString("contentModelForString"));

    public static final SubLObject $$genlMt = constant_handles.reader_make_constant_shell(makeString("genlMt"));

    public static final SubLObject $$ephemeralTerm = constant_handles.reader_make_constant_shell(makeString("ephemeralTerm"));

    static private final SubLString $$$application_unknown = makeString("application unknown");

    static private final SubLList $list_alt66 = list(makeKeyword("L2R"), makeKeyword("TEXTUAL-INFERENCE"));

    public static final SubLObject $const67$InterpretationMtReificationTempla = constant_handles.reader_make_constant_shell(makeString("InterpretationMtReificationTemplate"));

    static private final SubLString $str_alt68$CyclificationCollectorMt_ = makeString("CyclificationCollectorMt-");

    static private final SubLString $str_alt69$_S_distinct_parse_results_were_fo = makeString("~S distinct parse results were found.");

    static private final SubLList $list_alt70 = list(constant_handles.reader_make_constant_shell(makeString("Microtheory")));

    static private final SubLList $list_alt71 = list(constant_handles.reader_make_constant_shell(makeString("TextualEntailmentProblemSolvingContext")));

    public static final SubLObject $$allParseResultsForContentModel = constant_handles.reader_make_constant_shell(makeString("allParseResultsForContentModel"));

    static private final SubLString $str_alt73$_S_parse_results_were_ignored_bec = makeString("~S parse results were ignored because of excessive ambiguity.");

    static private final SubLList $list_alt74 = list(constant_handles.reader_make_constant_shell(makeString("LinguisticObject-NoParseAvailable")));

    static private final SubLString $str_alt75$Asserting_ = makeString("Asserting ");

    static private final SubLString $str_alt76$_parses_of_ = makeString(" parses of ");

    public static final SubLObject $const77$interpretationMtContent_ParseResu = constant_handles.reader_make_constant_shell(makeString("interpretationMtContent-ParseResult"));

    public static final SubLObject $$interpretationMtContent_CycL = constant_handles.reader_make_constant_shell(makeString("interpretationMtContent-CycL"));

    public static final SubLObject $$interpretedPhrase = constant_handles.reader_make_constant_shell(makeString("interpretedPhrase"));

    public static final SubLObject $$pegInterpretationMts = constant_handles.reader_make_constant_shell(makeString("pegInterpretationMts"));

    public static final SubLObject $const81$interpretationMtRankedAsGoodOrBet = constant_handles.reader_make_constant_shell(makeString("interpretationMtRankedAsGoodOrBetterThan"));



    static private final SubLString $str_alt83$Timed_out_with__S_parses_after__S = makeString("Timed out with ~S parses after ~S seconds parsing~%~S");

    static private final SubLString $str_alt84$Weeded__S_parses_down_to__S = makeString("Weeded ~S parses down to ~S");

    public static final SubLInteger $int$600 = makeInteger(600);



    private static final SubLSymbol REMOVE_DISCONNECTED_CONJUNCTS = makeSymbol("REMOVE-DISCONNECTED-CONJUNCTS");

    private static final SubLSymbol REMOVE_MADE_UP_ISA_CONJUNCTS = makeSymbol("REMOVE-MADE-UP-ISA-CONJUNCTS");

    private static final SubLSymbol MADE_UP_ISA_LITERAL_P = makeSymbol("MADE-UP-ISA-LITERAL-P");

    static private final SubLList $list_alt90 = list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("ANYTHING"), list($TEST, makeSymbol("MADE-UP-TYPE-P")));

    public static final SubLObject $$ThingDescribableAsFn = constant_handles.reader_make_constant_shell(makeString("ThingDescribableAsFn"));

    public static final SubLObject $$WordFn = constant_handles.reader_make_constant_shell(makeString("WordFn"));

    static private final SubLString $str_alt93$No_connected_var_literals_in____S = makeString("No connected var literals in~% ~S");

    static private final SubLString $str_alt94$Removed_disconnected_var_literals = makeString("Removed disconnected var literals:~% ~S");

    static private final SubLSymbol $sym95$EL_VAR_ = makeSymbol("EL-VAR?");

    static private final SubLList $list_alt96 = list(constant_handles.reader_make_constant_shell(makeString("isa")), constant_handles.reader_make_constant_shell(makeString("equals")));

    public static final SubLObject $$CurrentWorldDataCollectorMt = constant_handles.reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt"));

    public static final SubLInteger $int$30 = makeInteger(30);

    static private final SubLSymbol $sym99$HLMT_ = makeSymbol("HLMT?");









    static private final SubLString $str_alt104$Looking_for_subparses_of____S = makeString("Looking for subparses of~% ~S");

    static private final SubLString $str_alt105$Checking_subparse_____S = makeString("Checking subparse:~% ~S");

    static private final SubLSymbol $sym106$GAF_ = makeSymbol("GAF?");

    static private final SubLSymbol $sym107$TE_EXPRESSION_CONTAINS_ = makeSymbol("TE-EXPRESSION-CONTAINS?");

    static private final SubLSymbol $sym108$TE_SUFFICIENTLY_SPECIFIC_FORT_ = makeSymbol("TE-SUFFICIENTLY-SPECIFIC-FORT?");

    public static final SubLObject $$Person = constant_handles.reader_make_constant_shell(makeString("Person"));



    public static final SubLObject $$equals = constant_handles.reader_make_constant_shell(makeString("equals"));



    static private final SubLList $list_alt113 = list(makeSymbol("KEEP"), makeSymbol("LOSE"));

    static private final SubLString $str_alt114$Timed_out_after__S_seconds_parsin = makeString("Timed out after ~S seconds parsing~% ~S");

    static private final SubLString $str_alt115$CyclifierInterpMt_ = makeString("CyclifierInterpMt-");

    static private final SubLString $str_alt116$_Parse = makeString("-Parse");

    static private final SubLList $list_alt117 = list(constant_handles.reader_make_constant_shell(makeString("SemanticInterpretationMicrotheoryWithParsedContent")));

    public static final SubLObject $$quotedIsa = constant_handles.reader_make_constant_shell(makeString("quotedIsa"));

    static private final SubLList $list_alt119 = list(constant_handles.reader_make_constant_shell(makeString("TextualEntailmentConstant")));

    public static final SubLObject $$BookkeepingMt = constant_handles.reader_make_constant_shell(makeString("BookkeepingMt"));

    static private final SubLString $str_alt121$no_l2r_specific_assertions_specif = makeString("no l2r specific assertions specified yet");

    private static final SubLSymbol NON_SPACE_CHAR_P = makeSymbol("NON-SPACE-CHAR-P");

    static private final SubLList $list_alt123 = list(makeKeyword("MAX-TIME"), makeInteger(120), makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER);

    public static final SubLSymbol $default_ti_inference_properties$ = makeSymbol("*DEFAULT-TI-INFERENCE-PROPERTIES*");

    static private final SubLList $list_alt125 = list(makeKeyword("GET-PREMISE-PARSES"), T, makeKeyword("GET-PREMISE-MT"), T, makeKeyword("GET-ASKED-QUERY"), T, makeKeyword("SAVE-INFERENCE"), makeKeyword("ALL"));

    public static final SubLSymbol $tip_times$ = makeSymbol("*TIP-TIMES*");

    static private final SubLList $list_alt127 = list(list(makeSymbol("TIP"), makeSymbol("TIME-TYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym128$THIS_TIME = makeUninternedSymbol("THIS-TIME");



    static private final SubLList $list_alt130 = list(NIL);



    private static final SubLSymbol TIP_NOTE_TIME = makeSymbol("TIP-NOTE-TIME");

    static private final SubLList $list_alt133 = list(list(makeSymbol("FILENAME")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $tip_log_filename$ = makeSymbol("*TIP-LOG-FILENAME*");

    private static final SubLSymbol TEXTUAL_INFERENCE_PROBLEM = makeSymbol("TEXTUAL-INFERENCE-PROBLEM");

    private static final SubLSymbol TEXTUAL_INFERENCE_PROBLEM_P = makeSymbol("TEXTUAL-INFERENCE-PROBLEM-P");

    static private final SubLList $list_alt137 = list(new SubLObject[]{ makeSymbol("CYCL"), makeSymbol("CYCL-SOURCE"), makeSymbol("RUN-METHOD"), makeSymbol("BACKGROUND-TEXT"), makeSymbol("BACKGROUND-TARGET"), makeSymbol("QUERY-TEXT"), makeSymbol("QUERY-TARGET"), makeSymbol("RESPONSE-TEXTS"), makeSymbol("POLARITIES"), makeSymbol("INFERENCE-PROPERTIES"), makeSymbol("METRICS") });

    static private final SubLList $list_alt138 = list(new SubLObject[]{ $CYCL, makeKeyword("CYCL-SOURCE"), makeKeyword("RUN-METHOD"), makeKeyword("BACKGROUND-TEXT"), makeKeyword("BACKGROUND-TARGET"), makeKeyword("QUERY-TEXT"), makeKeyword("QUERY-TARGET"), makeKeyword("RESPONSE-TEXTS"), makeKeyword("POLARITIES"), makeKeyword("INFERENCE-PROPERTIES"), makeKeyword("METRICS") });

    static private final SubLList $list_alt139 = list(new SubLObject[]{ makeSymbol("TIP-CYCL"), makeSymbol("TIP-CYCL-SOURCE"), makeSymbol("TIP-RUN-METHOD"), makeSymbol("TIP-BACKGROUND-TEXT"), makeSymbol("TIP-BACKGROUND-TARGET"), makeSymbol("TIP-QUERY-TEXT"), makeSymbol("TIP-QUERY-TARGET"), makeSymbol("TIP-RESPONSE-TEXTS"), makeSymbol("TIP-POLARITIES"), makeSymbol("TIP-INFERENCE-PROPERTIES"), makeSymbol("TIP-METRICS") });

    static private final SubLList $list_alt140 = list(new SubLObject[]{ makeSymbol("_CSETF-TIP-CYCL"), makeSymbol("_CSETF-TIP-CYCL-SOURCE"), makeSymbol("_CSETF-TIP-RUN-METHOD"), makeSymbol("_CSETF-TIP-BACKGROUND-TEXT"), makeSymbol("_CSETF-TIP-BACKGROUND-TARGET"), makeSymbol("_CSETF-TIP-QUERY-TEXT"), makeSymbol("_CSETF-TIP-QUERY-TARGET"), makeSymbol("_CSETF-TIP-RESPONSE-TEXTS"), makeSymbol("_CSETF-TIP-POLARITIES"), makeSymbol("_CSETF-TIP-INFERENCE-PROPERTIES"), makeSymbol("_CSETF-TIP-METRICS") });



    private static final SubLSymbol TEXTUAL_INFERENCE_PROBLEM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TEXTUAL-INFERENCE-PROBLEM-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol TIP_CYCL = makeSymbol("TIP-CYCL");

    public static final SubLSymbol _CSETF_TIP_CYCL = makeSymbol("_CSETF-TIP-CYCL");

    private static final SubLSymbol TIP_CYCL_SOURCE = makeSymbol("TIP-CYCL-SOURCE");

    public static final SubLSymbol _CSETF_TIP_CYCL_SOURCE = makeSymbol("_CSETF-TIP-CYCL-SOURCE");

    private static final SubLSymbol TIP_RUN_METHOD = makeSymbol("TIP-RUN-METHOD");

    public static final SubLSymbol _CSETF_TIP_RUN_METHOD = makeSymbol("_CSETF-TIP-RUN-METHOD");

    private static final SubLSymbol TIP_BACKGROUND_TEXT = makeSymbol("TIP-BACKGROUND-TEXT");

    public static final SubLSymbol _CSETF_TIP_BACKGROUND_TEXT = makeSymbol("_CSETF-TIP-BACKGROUND-TEXT");

    private static final SubLSymbol TIP_BACKGROUND_TARGET = makeSymbol("TIP-BACKGROUND-TARGET");

    public static final SubLSymbol _CSETF_TIP_BACKGROUND_TARGET = makeSymbol("_CSETF-TIP-BACKGROUND-TARGET");

    private static final SubLSymbol TIP_QUERY_TEXT = makeSymbol("TIP-QUERY-TEXT");

    public static final SubLSymbol _CSETF_TIP_QUERY_TEXT = makeSymbol("_CSETF-TIP-QUERY-TEXT");

    private static final SubLSymbol TIP_QUERY_TARGET = makeSymbol("TIP-QUERY-TARGET");

    public static final SubLSymbol _CSETF_TIP_QUERY_TARGET = makeSymbol("_CSETF-TIP-QUERY-TARGET");

    private static final SubLSymbol TIP_RESPONSE_TEXTS = makeSymbol("TIP-RESPONSE-TEXTS");

    public static final SubLSymbol _CSETF_TIP_RESPONSE_TEXTS = makeSymbol("_CSETF-TIP-RESPONSE-TEXTS");

    private static final SubLSymbol TIP_POLARITIES = makeSymbol("TIP-POLARITIES");

    public static final SubLSymbol _CSETF_TIP_POLARITIES = makeSymbol("_CSETF-TIP-POLARITIES");

    private static final SubLSymbol TIP_INFERENCE_PROPERTIES = makeSymbol("TIP-INFERENCE-PROPERTIES");

    public static final SubLSymbol _CSETF_TIP_INFERENCE_PROPERTIES = makeSymbol("_CSETF-TIP-INFERENCE-PROPERTIES");

    private static final SubLSymbol TIP_METRICS = makeSymbol("TIP-METRICS");

    public static final SubLSymbol _CSETF_TIP_METRICS = makeSymbol("_CSETF-TIP-METRICS");



    private static final SubLSymbol $CYCL_SOURCE = makeKeyword("CYCL-SOURCE");

    private static final SubLSymbol $RUN_METHOD = makeKeyword("RUN-METHOD");

    private static final SubLSymbol $BACKGROUND_TEXT = makeKeyword("BACKGROUND-TEXT");

    private static final SubLSymbol $BACKGROUND_TARGET = makeKeyword("BACKGROUND-TARGET");

    private static final SubLSymbol $QUERY_TEXT = makeKeyword("QUERY-TEXT");

    private static final SubLSymbol $QUERY_TARGET = makeKeyword("QUERY-TARGET");

    private static final SubLSymbol $RESPONSE_TEXTS = makeKeyword("RESPONSE-TEXTS");

    private static final SubLSymbol $POLARITIES = makeKeyword("POLARITIES");

    private static final SubLSymbol $INFERENCE_PROPERTIES = makeKeyword("INFERENCE-PROPERTIES");



    static private final SubLString $str_alt176$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");





    private static final SubLSymbol $CHECK_ALL_POSSIBLE_ANSWERS = makeKeyword("CHECK-ALL-POSSIBLE-ANSWERS");



    static private final SubLSymbol $sym181$_PROB = makeSymbol("?PROB");

    public static final SubLObject $$elementOf = constant_handles.reader_make_constant_shell(makeString("elementOf"));

    private static final SubLSymbol RUN_TEXTUAL_INFERENCE = makeSymbol("RUN-TEXTUAL-INFERENCE");

    static private final SubLString $str_alt184$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLSymbol $sym185$_TEXT = makeSymbol("?TEXT");

    public static final SubLObject $$backgroundTextForTEP = constant_handles.reader_make_constant_shell(makeString("backgroundTextForTEP"));

    static private final SubLList $list_alt187 = list(makeSymbol("?TEXT"));

    public static final SubLObject $$queryTextForTEP = constant_handles.reader_make_constant_shell(makeString("queryTextForTEP"));

    static private final SubLSymbol $sym189$_CYCL = makeSymbol("?CYCL");

    public static final SubLObject $$and = constant_handles.reader_make_constant_shell(makeString("and"));

    public static final SubLObject $$targetCycLForTIPremise = constant_handles.reader_make_constant_shell(makeString("targetCycLForTIPremise"));

    static private final SubLList $list_alt192 = list(makeSymbol("?SENT"));

    static private final SubLList $list_alt193 = list(list(constant_handles.reader_make_constant_shell(makeString("means")), makeSymbol("?SENT"), makeSymbol("?CYCL")));

    public static final SubLObject $$targetCycLForTIQuery = constant_handles.reader_make_constant_shell(makeString("targetCycLForTIQuery"));

    public static final SubLObject $$responseToTEP = constant_handles.reader_make_constant_shell(makeString("responseToTEP"));

    private static final SubLSymbol $SAVE_INFERENCE = makeKeyword("SAVE-INFERENCE");





    static private final SubLString $$$From_Text = makeString("From Text");

    static private final SubLString $$$From_Target_CycL = makeString("From Target CycL");

    public static final SubLSymbol $run_textual_inference_caching_state$ = makeSymbol("*RUN-TEXTUAL-INFERENCE-CACHING-STATE*");

    public static final SubLObject $$textStringForTEPResponse = constant_handles.reader_make_constant_shell(makeString("textStringForTEPResponse"));

    static private final SubLSymbol $sym203$_POLARITY = makeSymbol("?POLARITY");

    public static final SubLObject $$responsePolarityForTEPResponse = constant_handles.reader_make_constant_shell(makeString("responsePolarityForTEPResponse"));

    static private final SubLList $list_alt205 = list(makeSymbol("?POLARITY"));

    private static final SubLSymbol $PREMISE_TIME = makeKeyword("PREMISE-TIME");



    private static final SubLSymbol $DISPROVE = makeKeyword("DISPROVE");

    private static final SubLSymbol $QUERY_PARSE_TIME = makeKeyword("QUERY-PARSE-TIME");

    static private final SubLList $list_alt210 = list(makeSymbol("QUERY-TYPE"), makeSymbol("CYCL-QUERY"));

    static private final SubLList $list_alt211 = list(constant_handles.reader_make_constant_shell(makeString("or")), list(constant_handles.reader_make_constant_shell(makeString("not")), list(constant_handles.reader_make_constant_shell(makeString("or")))));

    static private final SubLString $str_alt212$sent_a_bad_query_type___S_for__S_ = makeString("sent a bad query type: ~S for ~S~%");

    private static final SubLSymbol $QUERY_TIME = makeKeyword("QUERY-TIME");







    private static final SubLSymbol $PROVE_HALT_REASON = makeKeyword("PROVE-HALT-REASON");

    private static final SubLSymbol $DISPROVE_HALT_REASON = makeKeyword("DISPROVE-HALT-REASON");

    private static final SubLSymbol $PREMISE_STRING = makeKeyword("PREMISE-STRING");



    private static final SubLSymbol $TIP_CYCL_SOURCE = makeKeyword("TIP-CYCL-SOURCE");

    private static final SubLSymbol $GET_PREMISE_PARSES = makeKeyword("GET-PREMISE-PARSES");

    private static final SubLSymbol $PREMISE_PARSES = makeKeyword("PREMISE-PARSES");

    private static final SubLSymbol $GET_PREMISE_MT = makeKeyword("GET-PREMISE-MT");

    private static final SubLSymbol $PREMISE_MT = makeKeyword("PREMISE-MT");

    private static final SubLSymbol $GET_ASKED_QUERY = makeKeyword("GET-ASKED-QUERY");

    private static final SubLSymbol $DISPROVE_ASKED_QUERY = makeKeyword("DISPROVE-ASKED-QUERY");

    private static final SubLSymbol $PROVE_ASKED_QUERY = makeKeyword("PROVE-ASKED-QUERY");



    private static final SubLSymbol $PROVE_INFERENCE = makeKeyword("PROVE-INFERENCE");

    private static final SubLSymbol $DISPROVE_INFERENCE = makeKeyword("DISPROVE-INFERENCE");

    static private final SubLList $list_alt232 = list(makeKeyword("PROVE"), makeKeyword("DISPROVE"));



    static private final SubLList $list_alt234 = list(makeKeyword("YES"), makeKeyword("NO"));

    static private final SubLList $list_alt235 = list(makeKeyword("YES"));

    static private final SubLList $list_alt236 = list(makeKeyword("PROVE"));

    static private final SubLList $list_alt237 = list(makeKeyword("NO"));

    static private final SubLList $list_alt238 = list(makeKeyword("DISPROVE"));

    static private final SubLString $str_alt239$don_t_know_what_type_of_response_ = makeString("don't know what type of response is expected from ~S");





    static private final SubLSymbol $sym242$_SENT = makeSymbol("?SENT");

    public static final SubLObject $$ist_Asserted = constant_handles.reader_make_constant_shell(makeString("ist-Asserted"));

    static private final SubLString $$$yes = makeString("yes");

    static private final SubLString $$$unknown = makeString("unknown");

    static private final SubLString $$$no = makeString("no");

    static private final SubLSymbol $sym247$_TIP_CACHING_ON__ = makeSymbol("*TIP-CACHING-ON?*");

    public static final SubLSymbol $tip_inference_saving_mode$ = makeSymbol("*TIP-INFERENCE-SAVING-MODE*");

    static private final SubLString $str_alt249$_textual_inference_log_ = makeString("-textual-inference-log-");

    static private final SubLList $list_alt250 = list(makeString("data"), makeString("textual-inference"));

    static private final SubLString $$$html = makeString("html");

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

    static private final SubLString $$$Textual_Inference = makeString("Textual Inference");



    static private final SubLString $str_alt255$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt256$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $str_alt257$cb_handle_textual_inference = makeString("cb-handle-textual-inference");

    static private final SubLString $str_alt258$Enter_a_specific_instance_of___Te = makeString("Enter a specific instance of #$TextualEntailmentProblem");

    static private final SubLString $str_alt259$nd___ = makeString("nd();");

    static private final SubLString $str_alt260$Textual_Inference_Problem__ = makeString("Textual Inference Problem: ");

    static private final SubLString $str_alt261$ti_problem = makeString("ti-problem");

    public static final SubLInteger $int$50 = makeInteger(50);

    static private final SubLString $$$Run_Problem = makeString("Run Problem");

    private static final SubLSymbol $RUN_PROBLEM = makeKeyword("RUN-PROBLEM");

    static private final SubLString $str_alt265$_ = makeString(" ");

    static private final SubLString $str_alt266$Enter_an_instance_of___SetOrColle = makeString("Enter an instance of #$SetOrCollection, whose elements are Textual Inference Problems");

    static private final SubLString $str_alt267$Textual_Inference_Problem_Set__ = makeString("Textual Inference Problem Set: ");

    static private final SubLString $str_alt268$ti_problem_set = makeString("ti-problem-set");

    static private final SubLString $$$Run_Problem_Set = makeString("Run Problem Set");

    private static final SubLSymbol $RUN_PROBLEM_SET = makeKeyword("RUN-PROBLEM-SET");

    static private final SubLString $str_alt271$Run_a_Novel_Textual_Inference_Pro = makeString("Run a Novel Textual Inference Problem");

    static private final SubLString $str_alt272$Premise_Text__ = makeString("Premise Text: ");

    static private final SubLString $$$premise = makeString("premise");

    static private final SubLString $str_alt274$ = makeString("");



    static private final SubLString $str_alt276$Question_Text__ = makeString("Question Text: ");

    static private final SubLString $$$question = makeString("question");

    static private final SubLString $str_alt278$Desired_Response__ = makeString("Desired Response: ");

    static private final SubLString $$$response = makeString("response");



    static private final SubLString $$$Create_and_Run_Problem = makeString("Create and Run Problem");

    private static final SubLSymbol $CREATE_AND_RUN = makeKeyword("CREATE-AND-RUN");

    static private final SubLString $str_alt283$Log_File___S = makeString("Log File: ~S");

    static private final SubLString $str_alt284$log_file = makeString("log-file");

    static private final SubLString $str_alt285$Transformation_limit__ = makeString("Transformation limit: ");

    static private final SubLString $str_alt286$max_transformation_depth = makeString("max-transformation-depth");

    static private final SubLString $str_alt287$Time_Limit__ = makeString("Time Limit: ");

    static private final SubLString $str_alt288$max_time = makeString("max-time");

    static private final SubLString $str_alt289$Run_Method__ = makeString("Run Method: ");

    static private final SubLString $str_alt290$run_method = makeString("run-method");

    static private final SubLString $str_alt291$_specific_answer_desired = makeString(":specific-answer-desired");

    static private final SubLString $$$Look_for_Specified_Answers_Only = makeString("Look for Specified Answers Only");

    static private final SubLString $str_alt293$_check_all_possible_answers = makeString(":check-all-possible-answers");

    static private final SubLString $$$Check_all_possible_answers = makeString("Check all possible answers");

    static private final SubLString $str_alt295$Clear_any_cached_results__ = makeString("Clear any cached results: ");

    static private final SubLString $str_alt296$clear_old_results = makeString("clear-old-results");

    static private final SubLString $str_alt297$_clear_old_results = makeString(":clear-old-results");

    static private final SubLString $str_alt298$Save_Inferences__ = makeString("Save Inferences: ");

    static private final SubLString $str_alt299$save_inference = makeString("save-inference");

    static private final SubLString $str_alt300$_none = makeString(":none");

    static private final SubLString $$$None = makeString("None");

    static private final SubLString $str_alt302$_successful = makeString(":successful");

    static private final SubLString $$$Successful_only = makeString("Successful only");

    static private final SubLString $str_alt304$_all = makeString(":all");

    static private final SubLString $$$All = makeString("All");

    private static final SubLSymbol CB_TEXTUAL_INFERENCE = makeSymbol("CB-TEXTUAL-INFERENCE");



    static private final SubLString $str_alt308$create_and_run = makeString("create-and-run");

    private static final SubLSymbol $SPECIFIC_ANSWER_DESIRED = makeKeyword("SPECIFIC-ANSWER-DESIRED");

    static private final SubLString $$$Text_Inference_Results = makeString("Text Inference Results");

    private static final SubLSymbol $NEWLY_CONSTRUCTED = makeKeyword("NEWLY-CONSTRUCTED");

    public static final SubLObject $$TheSet = constant_handles.reader_make_constant_shell(makeString("TheSet"));

    static private final SubLString $str_alt313$Log_File__ = makeString("Log File: ");

    static private final SubLString $str_alt314$Unable_to_find_any_queries_from__ = makeString("Unable to find any queries from: ~S");

    private static final SubLSymbol CB_HANDLE_TEXTUAL_INFERENCE = makeSymbol("CB-HANDLE-TEXTUAL-INFERENCE");

    static private final SubLString $$$TextInf = makeString("TextInf");



    static private final SubLString $str_alt318$cb_textual_inference = makeString("cb-textual-inference");

    private static final SubLSymbol CB_LINK_TEXTUAL_INFERENCE = makeSymbol("CB-LINK-TEXTUAL-INFERENCE");

    static private final SubLString $$$Running_Textual_Inferences = makeString("Running Textual Inferences");

    static private final SubLString $str_alt321$Success_Ratio___S____S__S_ = makeString("Success Ratio: ~S% (~S/~S)");

    static private final SubLString $$$Success = makeString("Success");

    static private final SubLString $$$Failure = makeString("Failure");





    static private final SubLString $str_alt326$TEP__ = makeString("TEP: ");

    static private final SubLString $str_alt327$____Result__ = makeString("    Result: ");

    static private final SubLString $str_alt328$Premise__ = makeString("Premise: ");

    static private final SubLString $str_alt329$Question__ = makeString("Question: ");





    static private final SubLString $str_alt332$Query_Parse_Ill_formed = makeString("Query Parse Ill-formed");

    static private final SubLString $str_alt333$Interpretation_Source__ = makeString("Interpretation Source: ");

    static private final SubLString $str_alt334$Desired_Answer__ = makeString("Desired Answer: ");

    static private final SubLString $str_alt335$Premise_Parse_Assert_Time = makeString("Premise Parse/Assert Time");

    static private final SubLString $$$Query_Parse_Time = makeString("Query Parse Time");

    static private final SubLString $$$Query_Run_Time = makeString("Query Run Time");

    static private final SubLList $list_alt338 = list(makeSymbol("TIME"), makeSymbol("NEW-OR-OLD"));

    static private final SubLString $str_alt339$The_system_re_used_to_the_parse_f = makeString("The system re-used to the parse from a previous run of this problem.  No time was actually spent here.");



    static private final SubLString $str_alt341$_ = makeString("*");

    static private final SubLString $str_alt342$_s = makeString(" s");

    static private final SubLString $$$Premise_Parses = makeString("Premise Parses");

    static private final SubLString $str_alt344$Premise_Parse_Mt__ = makeString("Premise Parse Mt: ");

    static private final SubLString $str_alt345$Mt_Contents_ = makeString("Mt Contents:");

    static private final SubLString $str_alt346$Query_Mt__ = makeString("Query Mt: ");

    static private final SubLString $str_alt347$Positive_Query__ = makeString("Positive Query: ");

    static private final SubLString $str_alt348$Negative_Query__ = makeString("Negative Query: ");



    static private final SubLString $str_alt350$Unable_to_open__S = makeString("Unable to open ~S");

    // // Initializers
    public void declareFunctions() {
        declare_textual_entailments_file();
    }

    public void initializeVariables() {
        init_textual_entailments_file();
    }

    public void runTopLevelForms() {
        setup_textual_entailments_file();
    }
}

