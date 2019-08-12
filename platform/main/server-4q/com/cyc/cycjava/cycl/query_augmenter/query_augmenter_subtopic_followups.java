/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.query_augmenter;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
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
 *  module:      QUERY-AUGMENTER-SUBTOPIC-FOLLOWUPS
 *  source file: /cyc/top/cycl/query-augmenter/query-augmenter-subtopic-followups.lisp
 *  created:     2019/07/03 17:38:57
 */
public final class query_augmenter_subtopic_followups extends SubLTranslatedFile implements V02 {
    // // Constructor
    private query_augmenter_subtopic_followups() {
    }

    public static final SubLFile me = new query_augmenter_subtopic_followups();

    public static final String myName = "com.cyc.cycjava.cycl.query_augmenter.query_augmenter_subtopic_followups";

    // // Definitions
    /**
     *
     *
     * @param TERM
     * 		fully-bound-p
     * @return list of instances of #$SubTopicFunction
    Retrieve the instances of #$SubTopicFunction that apply to TERM.
    We attempt to sort the result from most specific to least specific.
     */
    public static final SubLObject qa_valid_subtopics_for_term(SubLObject v_term) {
        {
            SubLObject candidate_subtopic_fns = NIL;
            if (NIL != forts.fort_p(v_term)) {
                candidate_subtopic_fns = nconc(candidate_subtopic_fns, copy_list(qa_direct_subtopics(v_term, UNPROVIDED)));
            }
            if (NIL != fort_types_interface.collection_p(v_term)) {
                candidate_subtopic_fns = nconc(candidate_subtopic_fns, qa_subtopics_as_spec(v_term, UNPROVIDED));
            }
            candidate_subtopic_fns = nconc(candidate_subtopic_fns, qa_subtopics_as_instance(v_term, UNPROVIDED));
            candidate_subtopic_fns = delete_duplicates(candidate_subtopic_fns, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            {
                SubLObject result = NIL;
                SubLObject cdolist_list_var = candidate_subtopic_fns;
                SubLObject subtopic_fn = NIL;
                for (subtopic_fn = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subtopic_fn = cdolist_list_var.first()) {
                    if (NIL != qa_subtopic_fn_passes_exceptions(v_term, subtopic_fn, UNPROVIDED)) {
                        result = cons(subtopic_fn, result);
                    }
                }
                return qa_subtopic_sort(result);
            }
        }
    }

    // defparameter
    private static final SubLSymbol $qa_subtopic_mapping_result$ = makeSymbol("*QA-SUBTOPIC-MAPPING-RESULT*");

    public static final SubLObject qa_subtopics_as_spec(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.current_mt_relevance_mt();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $qa_subtopic_mapping_result$.currentBinding(thread);
                    try {
                        $qa_subtopic_mapping_result$.bind(NIL, thread);
                        if ((NIL != variables.fully_bound_p(v_term)) && ((NIL != forts.fort_p(v_term)) || (NIL != el_utilities.possibly_naut_p(v_term)))) {
                            {
                                SubLObject mt_var = mt;
                                {
                                    SubLObject _prev_bind_0_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                        genls.map_all_genls(symbol_function(QA_UPDATE_SUBTOPIC_SPEC_MAPPING_RESULT), v_term, UNPROVIDED, UNPROVIDED);
                                        result = $qa_subtopic_mapping_result$.getDynamicValue(thread);
                                    } finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_1, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        $qa_subtopic_mapping_result$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject qa_subtopics_as_instance(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.current_mt_relevance_mt();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $qa_subtopic_mapping_result$.currentBinding(thread);
                    try {
                        $qa_subtopic_mapping_result$.bind(NIL, thread);
                        if ((NIL != variables.fully_bound_p(v_term)) && ((NIL != forts.fort_p(v_term)) || (NIL != el_utilities.possibly_naut_p(v_term)))) {
                            {
                                SubLObject mt_var = mt;
                                {
                                    SubLObject _prev_bind_0_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                        isa.map_all_isa(symbol_function(QA_UPDATE_SUBTOPIC_INSTANCE_MAPPING_RESULT), v_term, UNPROVIDED, UNPROVIDED);
                                        result = $qa_subtopic_mapping_result$.getDynamicValue(thread);
                                    } finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_2, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        $qa_subtopic_mapping_result$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject qa_update_subtopic_spec_mapping_result(SubLObject collection) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $qa_subtopic_mapping_result$.setDynamicValue(nconc($qa_subtopic_mapping_result$.getDynamicValue(thread), copy_list(qa_subtopics_for_specs(collection, UNPROVIDED))), thread);
            return NIL;
        }
    }

    public static final SubLObject qa_update_subtopic_instance_mapping_result(SubLObject collection) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $qa_subtopic_mapping_result$.setDynamicValue(nconc($qa_subtopic_mapping_result$.getDynamicValue(thread), copy_list(qa_subtopics_for_instances(collection, UNPROVIDED))), thread);
            return NIL;
        }
    }



    public static final SubLObject clear_qa_direct_subtopics() {
        {
            SubLObject cs = $qa_direct_subtopics_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_qa_direct_subtopics(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.current_mt_relevance_mt();
        }
        return memoization_state.caching_state_remove_function_results_with_args($qa_direct_subtopics_caching_state$.getGlobalValue(), list(fort, mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject qa_direct_subtopics_internal(SubLObject fort, SubLObject mt) {
        return kb_mapping_utilities.pred_values_in_relevant_mts(fort, $$subTopicFnTakes, mt, TWO_INTEGER, ONE_INTEGER, $TRUE);
    }

    public static final SubLObject qa_direct_subtopics(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.current_mt_relevance_mt();
        }
        {
            SubLObject caching_state = $qa_direct_subtopics_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(QA_DIRECT_SUBTOPICS, $qa_direct_subtopics_caching_state$, NIL, EQL, TWO_INTEGER, TEN_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(fort, mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw6$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (fort.eql(cached_args.first())) {
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
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(qa_direct_subtopics_internal(fort, mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(fort, mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }



    public static final SubLObject clear_qa_subtopics_for_specs() {
        {
            SubLObject cs = $qa_subtopics_for_specs_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_qa_subtopics_for_specs(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.current_mt_relevance_mt();
        }
        return memoization_state.caching_state_remove_function_results_with_args($qa_subtopics_for_specs_caching_state$.getGlobalValue(), list(fort, mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject qa_subtopics_for_specs_internal(SubLObject fort, SubLObject mt) {
        return kb_mapping_utilities.pred_values_in_relevant_mts(fort, $$subTopicFnTakesSpecs, mt, TWO_INTEGER, ONE_INTEGER, $TRUE);
    }

    public static final SubLObject qa_subtopics_for_specs(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.current_mt_relevance_mt();
        }
        {
            SubLObject caching_state = $qa_subtopics_for_specs_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(QA_SUBTOPICS_FOR_SPECS, $qa_subtopics_for_specs_caching_state$, NIL, EQL, TWO_INTEGER, TEN_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(fort, mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw6$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (fort.eql(cached_args.first())) {
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
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(qa_subtopics_for_specs_internal(fort, mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(fort, mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }



    public static final SubLObject clear_qa_subtopics_for_instances() {
        {
            SubLObject cs = $qa_subtopics_for_instances_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_qa_subtopics_for_instances(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.current_mt_relevance_mt();
        }
        return memoization_state.caching_state_remove_function_results_with_args($qa_subtopics_for_instances_caching_state$.getGlobalValue(), list(fort, mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject qa_subtopics_for_instances_internal(SubLObject fort, SubLObject mt) {
        return kb_mapping_utilities.pred_values_in_relevant_mts(fort, $$subTopicFnTakesInstances, mt, TWO_INTEGER, ONE_INTEGER, $TRUE);
    }

    public static final SubLObject qa_subtopics_for_instances(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.current_mt_relevance_mt();
        }
        {
            SubLObject caching_state = $qa_subtopics_for_instances_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(QA_SUBTOPICS_FOR_INSTANCES, $qa_subtopics_for_instances_caching_state$, NIL, EQL, TWO_INTEGER, TEN_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(fort, mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw6$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (fort.eql(cached_args.first())) {
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
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(qa_subtopics_for_instances_internal(fort, mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(fort, mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static final SubLObject clear_subtopic_applicability_caches() {
        clear_qa_direct_subtopics();
        clear_qa_subtopics_for_specs();
        clear_qa_subtopics_for_instances();
        return NIL;
    }



    public static final SubLObject clear_qa_subtopic_fn_exception_terms() {
        {
            SubLObject cs = $qa_subtopic_fn_exception_terms_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_qa_subtopic_fn_exception_terms(SubLObject subtopic_fn, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.current_mt_relevance_mt();
        }
        return memoization_state.caching_state_remove_function_results_with_args($qa_subtopic_fn_exception_terms_caching_state$.getGlobalValue(), list(subtopic_fn, mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject qa_subtopic_fn_exception_terms_internal(SubLObject subtopic_fn, SubLObject mt) {
        return kb_mapping_utilities.pred_values_in_relevant_mts(subtopic_fn, $$subTopicFnException, mt, ONE_INTEGER, TWO_INTEGER, $TRUE);
    }

    public static final SubLObject qa_subtopic_fn_exception_terms(SubLObject subtopic_fn, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.current_mt_relevance_mt();
        }
        {
            SubLObject caching_state = $qa_subtopic_fn_exception_terms_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(QA_SUBTOPIC_FN_EXCEPTION_TERMS, $qa_subtopic_fn_exception_terms_caching_state$, NIL, EQL, TWO_INTEGER, TEN_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(subtopic_fn, mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw6$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (subtopic_fn.eql(cached_args.first())) {
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
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(qa_subtopic_fn_exception_terms_internal(subtopic_fn, mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(subtopic_fn, mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }



    public static final SubLObject clear_qa_subtopic_fn_spec_exceptions() {
        {
            SubLObject cs = $qa_subtopic_fn_spec_exceptions_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_qa_subtopic_fn_spec_exceptions(SubLObject subtopic_fn, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.current_mt_relevance_mt();
        }
        return memoization_state.caching_state_remove_function_results_with_args($qa_subtopic_fn_spec_exceptions_caching_state$.getGlobalValue(), list(subtopic_fn, mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject qa_subtopic_fn_spec_exceptions_internal(SubLObject subtopic_fn, SubLObject mt) {
        return kb_mapping_utilities.pred_values_in_relevant_mts(subtopic_fn, $$subTopicFnExceptionSpecs, mt, ONE_INTEGER, TWO_INTEGER, $TRUE);
    }

    public static final SubLObject qa_subtopic_fn_spec_exceptions(SubLObject subtopic_fn, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.current_mt_relevance_mt();
        }
        {
            SubLObject caching_state = $qa_subtopic_fn_spec_exceptions_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(QA_SUBTOPIC_FN_SPEC_EXCEPTIONS, $qa_subtopic_fn_spec_exceptions_caching_state$, NIL, EQL, TWO_INTEGER, TEN_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(subtopic_fn, mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw6$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (subtopic_fn.eql(cached_args.first())) {
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
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(qa_subtopic_fn_spec_exceptions_internal(subtopic_fn, mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(subtopic_fn, mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }



    public static final SubLObject clear_qa_subtopic_fn_instance_exceptions() {
        {
            SubLObject cs = $qa_subtopic_fn_instance_exceptions_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_qa_subtopic_fn_instance_exceptions(SubLObject subtopic_fn, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.current_mt_relevance_mt();
        }
        return memoization_state.caching_state_remove_function_results_with_args($qa_subtopic_fn_instance_exceptions_caching_state$.getGlobalValue(), list(subtopic_fn, mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject qa_subtopic_fn_instance_exceptions_internal(SubLObject subtopic_fn, SubLObject mt) {
        return kb_mapping_utilities.pred_values_in_relevant_mts(subtopic_fn, $$subTopicFnExceptionInstances, mt, ONE_INTEGER, TWO_INTEGER, $TRUE);
    }

    public static final SubLObject qa_subtopic_fn_instance_exceptions(SubLObject subtopic_fn, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.current_mt_relevance_mt();
        }
        {
            SubLObject caching_state = $qa_subtopic_fn_instance_exceptions_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(QA_SUBTOPIC_FN_INSTANCE_EXCEPTIONS, $qa_subtopic_fn_instance_exceptions_caching_state$, NIL, EQL, TWO_INTEGER, TEN_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(subtopic_fn, mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw6$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (subtopic_fn.eql(cached_args.first())) {
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
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(qa_subtopic_fn_instance_exceptions_internal(subtopic_fn, mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(subtopic_fn, mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }



    public static final SubLObject clear_qa_subtopic_fn_passes_exceptions() {
        {
            SubLObject cs = $qa_subtopic_fn_passes_exceptions_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_qa_subtopic_fn_passes_exceptions(SubLObject v_term, SubLObject subtopic_fn, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.current_mt_relevance_mt();
        }
        return memoization_state.caching_state_remove_function_results_with_args($qa_subtopic_fn_passes_exceptions_caching_state$.getGlobalValue(), list(v_term, subtopic_fn, mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject qa_subtopic_fn_passes_exceptions_internal(SubLObject v_term, SubLObject subtopic_fn, SubLObject mt) {
        if (NIL != isa.isa_anyP(v_term, qa_subtopic_fn_instance_exceptions(subtopic_fn, mt), mt, UNPROVIDED)) {
            return NIL;
        }
        if (NIL != genls.any_genlP(v_term, qa_subtopic_fn_spec_exceptions(subtopic_fn, mt), mt, UNPROVIDED)) {
            return NIL;
        }
        if (NIL != subl_promotions.memberP(v_term, qa_subtopic_fn_exception_terms(subtopic_fn, mt), UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        return T;
    }

    public static final SubLObject qa_subtopic_fn_passes_exceptions(SubLObject v_term, SubLObject subtopic_fn, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.current_mt_relevance_mt();
        }
        {
            SubLObject caching_state = $qa_subtopic_fn_passes_exceptions_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(QA_SUBTOPIC_FN_PASSES_EXCEPTIONS, $qa_subtopic_fn_passes_exceptions_caching_state$, NIL, EQUAL, THREE_INTEGER, TEN_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, subtopic_fn, mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw6$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (v_term.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (subtopic_fn.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(qa_subtopic_fn_passes_exceptions_internal(v_term, subtopic_fn, mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, subtopic_fn, mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static final SubLObject clear_subtopic_exception_caches() {
        clear_qa_subtopic_fn_exception_terms();
        clear_qa_subtopic_fn_spec_exceptions();
        clear_qa_subtopic_fn_instance_exceptions();
        clear_qa_subtopic_fn_passes_exceptions();
        return NIL;
    }

    /**
     * Sort the subtopic functions SUBTOPICS is order of most specific to least specific
     */
    public static final SubLObject qa_subtopic_sort(SubLObject subtopics) {
        return Sort.sort(subtopics, symbol_function($sym24$_), symbol_function(RELATION_GENERALITY_ESTIMATE));
    }

    // defparameter
    private static final SubLSymbol $qa_subtopic_mt$ = makeSymbol("*QA-SUBTOPIC-MT*");

    public static final SubLObject get_qa_subtopic_retrieval_test_func3(SubLObject qa_subtopic_retrieval_test) {
        return classes.subloop_get_access_protected_instance_slot(qa_subtopic_retrieval_test, NINE_INTEGER, FUNC3);
    }

    public static final SubLObject set_qa_subtopic_retrieval_test_func3(SubLObject qa_subtopic_retrieval_test, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(qa_subtopic_retrieval_test, value, NINE_INTEGER, FUNC3);
    }

    public static final SubLObject get_qa_subtopic_retrieval_test_func2(SubLObject qa_subtopic_retrieval_test) {
        return classes.subloop_get_access_protected_instance_slot(qa_subtopic_retrieval_test, EIGHT_INTEGER, FUNC2);
    }

    public static final SubLObject set_qa_subtopic_retrieval_test_func2(SubLObject qa_subtopic_retrieval_test, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(qa_subtopic_retrieval_test, value, EIGHT_INTEGER, FUNC2);
    }

    public static final SubLObject get_qa_subtopic_retrieval_test_func1(SubLObject qa_subtopic_retrieval_test) {
        return classes.subloop_get_access_protected_instance_slot(qa_subtopic_retrieval_test, SEVEN_INTEGER, FUNC1);
    }

    public static final SubLObject set_qa_subtopic_retrieval_test_func1(SubLObject qa_subtopic_retrieval_test, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(qa_subtopic_retrieval_test, value, SEVEN_INTEGER, FUNC1);
    }

    public static final SubLObject get_qa_subtopic_retrieval_test_collection_spec(SubLObject qa_subtopic_retrieval_test) {
        return classes.subloop_get_access_protected_instance_slot(qa_subtopic_retrieval_test, SIX_INTEGER, COLLECTION_SPEC);
    }

    public static final SubLObject set_qa_subtopic_retrieval_test_collection_spec(SubLObject qa_subtopic_retrieval_test, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(qa_subtopic_retrieval_test, value, SIX_INTEGER, COLLECTION_SPEC);
    }

    public static final SubLObject get_qa_subtopic_retrieval_test_collection_genl(SubLObject qa_subtopic_retrieval_test) {
        return classes.subloop_get_access_protected_instance_slot(qa_subtopic_retrieval_test, FIVE_INTEGER, COLLECTION_GENL);
    }

    public static final SubLObject set_qa_subtopic_retrieval_test_collection_genl(SubLObject qa_subtopic_retrieval_test, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(qa_subtopic_retrieval_test, value, FIVE_INTEGER, COLLECTION_GENL);
    }

    public static final SubLObject get_qa_subtopic_retrieval_test_ind2(SubLObject qa_subtopic_retrieval_test) {
        return classes.subloop_get_access_protected_instance_slot(qa_subtopic_retrieval_test, FOUR_INTEGER, IND2);
    }

    public static final SubLObject set_qa_subtopic_retrieval_test_ind2(SubLObject qa_subtopic_retrieval_test, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(qa_subtopic_retrieval_test, value, FOUR_INTEGER, IND2);
    }

    public static final SubLObject get_qa_subtopic_retrieval_test_ind1(SubLObject qa_subtopic_retrieval_test) {
        return classes.subloop_get_access_protected_instance_slot(qa_subtopic_retrieval_test, THREE_INTEGER, IND1);
    }

    public static final SubLObject set_qa_subtopic_retrieval_test_ind1(SubLObject qa_subtopic_retrieval_test, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(qa_subtopic_retrieval_test, value, THREE_INTEGER, IND1);
    }

    public static final SubLObject subloop_reserved_initialize_qa_subtopic_retrieval_test_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_qa_subtopic_retrieval_test_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, QA_SUBTOPIC_RETRIEVAL_TEST, IND1, NIL);
        classes.subloop_initialize_slot(new_instance, QA_SUBTOPIC_RETRIEVAL_TEST, IND2, NIL);
        classes.subloop_initialize_slot(new_instance, QA_SUBTOPIC_RETRIEVAL_TEST, COLLECTION_GENL, NIL);
        classes.subloop_initialize_slot(new_instance, QA_SUBTOPIC_RETRIEVAL_TEST, COLLECTION_SPEC, NIL);
        classes.subloop_initialize_slot(new_instance, QA_SUBTOPIC_RETRIEVAL_TEST, FUNC1, NIL);
        classes.subloop_initialize_slot(new_instance, QA_SUBTOPIC_RETRIEVAL_TEST, FUNC2, NIL);
        classes.subloop_initialize_slot(new_instance, QA_SUBTOPIC_RETRIEVAL_TEST, FUNC3, NIL);
        return NIL;
    }

    public static final SubLObject qa_subtopic_retrieval_test_p(SubLObject qa_subtopic_retrieval_test) {
        return classes.subloop_instanceof_class(qa_subtopic_retrieval_test, QA_SUBTOPIC_RETRIEVAL_TEST);
    }

    public static final SubLObject declare_query_augmenter_subtopic_followups_file() {
        declareFunction("qa_valid_subtopics_for_term", "QA-VALID-SUBTOPICS-FOR-TERM", 1, 0, false);
        declareFunction("qa_subtopics_as_spec", "QA-SUBTOPICS-AS-SPEC", 1, 1, false);
        declareFunction("qa_subtopics_as_instance", "QA-SUBTOPICS-AS-INSTANCE", 1, 1, false);
        declareFunction("qa_update_subtopic_spec_mapping_result", "QA-UPDATE-SUBTOPIC-SPEC-MAPPING-RESULT", 1, 0, false);
        declareFunction("qa_update_subtopic_instance_mapping_result", "QA-UPDATE-SUBTOPIC-INSTANCE-MAPPING-RESULT", 1, 0, false);
        declareFunction("clear_qa_direct_subtopics", "CLEAR-QA-DIRECT-SUBTOPICS", 0, 0, false);
        declareFunction("remove_qa_direct_subtopics", "REMOVE-QA-DIRECT-SUBTOPICS", 1, 1, false);
        declareFunction("qa_direct_subtopics_internal", "QA-DIRECT-SUBTOPICS-INTERNAL", 2, 0, false);
        declareFunction("qa_direct_subtopics", "QA-DIRECT-SUBTOPICS", 1, 1, false);
        declareFunction("clear_qa_subtopics_for_specs", "CLEAR-QA-SUBTOPICS-FOR-SPECS", 0, 0, false);
        declareFunction("remove_qa_subtopics_for_specs", "REMOVE-QA-SUBTOPICS-FOR-SPECS", 1, 1, false);
        declareFunction("qa_subtopics_for_specs_internal", "QA-SUBTOPICS-FOR-SPECS-INTERNAL", 2, 0, false);
        declareFunction("qa_subtopics_for_specs", "QA-SUBTOPICS-FOR-SPECS", 1, 1, false);
        declareFunction("clear_qa_subtopics_for_instances", "CLEAR-QA-SUBTOPICS-FOR-INSTANCES", 0, 0, false);
        declareFunction("remove_qa_subtopics_for_instances", "REMOVE-QA-SUBTOPICS-FOR-INSTANCES", 1, 1, false);
        declareFunction("qa_subtopics_for_instances_internal", "QA-SUBTOPICS-FOR-INSTANCES-INTERNAL", 2, 0, false);
        declareFunction("qa_subtopics_for_instances", "QA-SUBTOPICS-FOR-INSTANCES", 1, 1, false);
        declareFunction("clear_subtopic_applicability_caches", "CLEAR-SUBTOPIC-APPLICABILITY-CACHES", 0, 0, false);
        declareFunction("clear_qa_subtopic_fn_exception_terms", "CLEAR-QA-SUBTOPIC-FN-EXCEPTION-TERMS", 0, 0, false);
        declareFunction("remove_qa_subtopic_fn_exception_terms", "REMOVE-QA-SUBTOPIC-FN-EXCEPTION-TERMS", 1, 1, false);
        declareFunction("qa_subtopic_fn_exception_terms_internal", "QA-SUBTOPIC-FN-EXCEPTION-TERMS-INTERNAL", 2, 0, false);
        declareFunction("qa_subtopic_fn_exception_terms", "QA-SUBTOPIC-FN-EXCEPTION-TERMS", 1, 1, false);
        declareFunction("clear_qa_subtopic_fn_spec_exceptions", "CLEAR-QA-SUBTOPIC-FN-SPEC-EXCEPTIONS", 0, 0, false);
        declareFunction("remove_qa_subtopic_fn_spec_exceptions", "REMOVE-QA-SUBTOPIC-FN-SPEC-EXCEPTIONS", 1, 1, false);
        declareFunction("qa_subtopic_fn_spec_exceptions_internal", "QA-SUBTOPIC-FN-SPEC-EXCEPTIONS-INTERNAL", 2, 0, false);
        declareFunction("qa_subtopic_fn_spec_exceptions", "QA-SUBTOPIC-FN-SPEC-EXCEPTIONS", 1, 1, false);
        declareFunction("clear_qa_subtopic_fn_instance_exceptions", "CLEAR-QA-SUBTOPIC-FN-INSTANCE-EXCEPTIONS", 0, 0, false);
        declareFunction("remove_qa_subtopic_fn_instance_exceptions", "REMOVE-QA-SUBTOPIC-FN-INSTANCE-EXCEPTIONS", 1, 1, false);
        declareFunction("qa_subtopic_fn_instance_exceptions_internal", "QA-SUBTOPIC-FN-INSTANCE-EXCEPTIONS-INTERNAL", 2, 0, false);
        declareFunction("qa_subtopic_fn_instance_exceptions", "QA-SUBTOPIC-FN-INSTANCE-EXCEPTIONS", 1, 1, false);
        declareFunction("clear_qa_subtopic_fn_passes_exceptions", "CLEAR-QA-SUBTOPIC-FN-PASSES-EXCEPTIONS", 0, 0, false);
        declareFunction("remove_qa_subtopic_fn_passes_exceptions", "REMOVE-QA-SUBTOPIC-FN-PASSES-EXCEPTIONS", 2, 1, false);
        declareFunction("qa_subtopic_fn_passes_exceptions_internal", "QA-SUBTOPIC-FN-PASSES-EXCEPTIONS-INTERNAL", 3, 0, false);
        declareFunction("qa_subtopic_fn_passes_exceptions", "QA-SUBTOPIC-FN-PASSES-EXCEPTIONS", 2, 1, false);
        declareFunction("clear_subtopic_exception_caches", "CLEAR-SUBTOPIC-EXCEPTION-CACHES", 0, 0, false);
        declareFunction("qa_subtopic_sort", "QA-SUBTOPIC-SORT", 1, 0, false);
        declareFunction("get_qa_subtopic_retrieval_test_func3", "GET-QA-SUBTOPIC-RETRIEVAL-TEST-FUNC3", 1, 0, false);
        declareFunction("set_qa_subtopic_retrieval_test_func3", "SET-QA-SUBTOPIC-RETRIEVAL-TEST-FUNC3", 2, 0, false);
        declareFunction("get_qa_subtopic_retrieval_test_func2", "GET-QA-SUBTOPIC-RETRIEVAL-TEST-FUNC2", 1, 0, false);
        declareFunction("set_qa_subtopic_retrieval_test_func2", "SET-QA-SUBTOPIC-RETRIEVAL-TEST-FUNC2", 2, 0, false);
        declareFunction("get_qa_subtopic_retrieval_test_func1", "GET-QA-SUBTOPIC-RETRIEVAL-TEST-FUNC1", 1, 0, false);
        declareFunction("set_qa_subtopic_retrieval_test_func1", "SET-QA-SUBTOPIC-RETRIEVAL-TEST-FUNC1", 2, 0, false);
        declareFunction("get_qa_subtopic_retrieval_test_collection_spec", "GET-QA-SUBTOPIC-RETRIEVAL-TEST-COLLECTION-SPEC", 1, 0, false);
        declareFunction("set_qa_subtopic_retrieval_test_collection_spec", "SET-QA-SUBTOPIC-RETRIEVAL-TEST-COLLECTION-SPEC", 2, 0, false);
        declareFunction("get_qa_subtopic_retrieval_test_collection_genl", "GET-QA-SUBTOPIC-RETRIEVAL-TEST-COLLECTION-GENL", 1, 0, false);
        declareFunction("set_qa_subtopic_retrieval_test_collection_genl", "SET-QA-SUBTOPIC-RETRIEVAL-TEST-COLLECTION-GENL", 2, 0, false);
        declareFunction("get_qa_subtopic_retrieval_test_ind2", "GET-QA-SUBTOPIC-RETRIEVAL-TEST-IND2", 1, 0, false);
        declareFunction("set_qa_subtopic_retrieval_test_ind2", "SET-QA-SUBTOPIC-RETRIEVAL-TEST-IND2", 2, 0, false);
        declareFunction("get_qa_subtopic_retrieval_test_ind1", "GET-QA-SUBTOPIC-RETRIEVAL-TEST-IND1", 1, 0, false);
        declareFunction("set_qa_subtopic_retrieval_test_ind1", "SET-QA-SUBTOPIC-RETRIEVAL-TEST-IND1", 2, 0, false);
        declareFunction("subloop_reserved_initialize_qa_subtopic_retrieval_test_class", "SUBLOOP-RESERVED-INITIALIZE-QA-SUBTOPIC-RETRIEVAL-TEST-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_qa_subtopic_retrieval_test_instance", "SUBLOOP-RESERVED-INITIALIZE-QA-SUBTOPIC-RETRIEVAL-TEST-INSTANCE", 1, 0, false);
        declareFunction("qa_subtopic_retrieval_test_p", "QA-SUBTOPIC-RETRIEVAL-TEST-P", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_query_augmenter_subtopic_followups_file() {
        defparameter("*QA-SUBTOPIC-MAPPING-RESULT*", NIL);
        deflexical("*QA-DIRECT-SUBTOPICS-CACHING-STATE*", NIL);
        deflexical("*QA-SUBTOPICS-FOR-SPECS-CACHING-STATE*", NIL);
        deflexical("*QA-SUBTOPICS-FOR-INSTANCES-CACHING-STATE*", NIL);
        deflexical("*QA-SUBTOPIC-FN-EXCEPTION-TERMS-CACHING-STATE*", NIL);
        deflexical("*QA-SUBTOPIC-FN-SPEC-EXCEPTIONS-CACHING-STATE*", NIL);
        deflexical("*QA-SUBTOPIC-FN-INSTANCE-EXCEPTIONS-CACHING-STATE*", NIL);
        deflexical("*QA-SUBTOPIC-FN-PASSES-EXCEPTIONS-CACHING-STATE*", NIL);
        defparameter("*QA-SUBTOPIC-MT*", $$WebSearchEnhancementMt);
        return NIL;
    }

    public static final SubLObject setup_query_augmenter_subtopic_followups_file() {
                memoization_state.note_globally_cached_function(QA_DIRECT_SUBTOPICS);
        memoization_state.note_globally_cached_function(QA_SUBTOPICS_FOR_SPECS);
        memoization_state.note_globally_cached_function(QA_SUBTOPICS_FOR_INSTANCES);
        memoization_state.note_globally_cached_function(QA_SUBTOPIC_FN_EXCEPTION_TERMS);
        memoization_state.note_globally_cached_function(QA_SUBTOPIC_FN_SPEC_EXCEPTIONS);
        memoization_state.note_globally_cached_function(QA_SUBTOPIC_FN_INSTANCE_EXCEPTIONS);
        memoization_state.note_globally_cached_function(QA_SUBTOPIC_FN_PASSES_EXCEPTIONS);
        modules.ensure_provisional_module($str_alt26$query_augmenter_subtopic_followup, $$$cycl, $str_alt28$__cvs_head_cycorp_cyc_cyc_lisp_cy);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(QA_SUBTOPIC_RETRIEVAL_TEST, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(QA_SUBTOPIC_RETRIEVAL_TEST);
        classes.subloop_new_class(QA_SUBTOPIC_RETRIEVAL_TEST, TEST_CASE, NIL, NIL, $list_alt32);
        classes.class_set_implements_slot_listeners(QA_SUBTOPIC_RETRIEVAL_TEST, NIL);
        classes.subloop_note_class_initialization_function(QA_SUBTOPIC_RETRIEVAL_TEST, SUBLOOP_RESERVED_INITIALIZE_QA_SUBTOPIC_RETRIEVAL_TEST_CLASS);
        classes.subloop_note_instance_initialization_function(QA_SUBTOPIC_RETRIEVAL_TEST, SUBLOOP_RESERVED_INITIALIZE_QA_SUBTOPIC_RETRIEVAL_TEST_INSTANCE);
        subloop_reserved_initialize_qa_subtopic_retrieval_test_class(QA_SUBTOPIC_RETRIEVAL_TEST);
        sunit_macros.define_test_case_postamble(QA_SUBTOPIC_RETRIEVAL_TEST, $str_alt26$query_augmenter_subtopic_followup, $$$cycl, NIL);
        sunit_macros.def_test_method_register(QA_SUBTOPIC_RETRIEVAL_TEST, TEST_RETRIEVAL);
        sunit_macros.def_test_method_register(QA_SUBTOPIC_RETRIEVAL_TEST, TEST_COMBINING);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol QA_UPDATE_SUBTOPIC_SPEC_MAPPING_RESULT = makeSymbol("QA-UPDATE-SUBTOPIC-SPEC-MAPPING-RESULT");

    private static final SubLSymbol QA_UPDATE_SUBTOPIC_INSTANCE_MAPPING_RESULT = makeSymbol("QA-UPDATE-SUBTOPIC-INSTANCE-MAPPING-RESULT");

    private static final SubLSymbol QA_DIRECT_SUBTOPICS = makeSymbol("QA-DIRECT-SUBTOPICS");

    public static final SubLObject $$subTopicFnTakes = constant_handles.reader_make_constant_shell(makeString("subTopicFnTakes"));



    public static final SubLSymbol $qa_direct_subtopics_caching_state$ = makeSymbol("*QA-DIRECT-SUBTOPICS-CACHING-STATE*");

    public static final SubLSymbol $kw6$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    private static final SubLSymbol QA_SUBTOPICS_FOR_SPECS = makeSymbol("QA-SUBTOPICS-FOR-SPECS");

    public static final SubLObject $$subTopicFnTakesSpecs = constant_handles.reader_make_constant_shell(makeString("subTopicFnTakesSpecs"));

    public static final SubLSymbol $qa_subtopics_for_specs_caching_state$ = makeSymbol("*QA-SUBTOPICS-FOR-SPECS-CACHING-STATE*");

    private static final SubLSymbol QA_SUBTOPICS_FOR_INSTANCES = makeSymbol("QA-SUBTOPICS-FOR-INSTANCES");

    public static final SubLObject $$subTopicFnTakesInstances = constant_handles.reader_make_constant_shell(makeString("subTopicFnTakesInstances"));

    public static final SubLSymbol $qa_subtopics_for_instances_caching_state$ = makeSymbol("*QA-SUBTOPICS-FOR-INSTANCES-CACHING-STATE*");

    private static final SubLSymbol QA_SUBTOPIC_FN_EXCEPTION_TERMS = makeSymbol("QA-SUBTOPIC-FN-EXCEPTION-TERMS");

    public static final SubLObject $$subTopicFnException = constant_handles.reader_make_constant_shell(makeString("subTopicFnException"));

    public static final SubLSymbol $qa_subtopic_fn_exception_terms_caching_state$ = makeSymbol("*QA-SUBTOPIC-FN-EXCEPTION-TERMS-CACHING-STATE*");

    private static final SubLSymbol QA_SUBTOPIC_FN_SPEC_EXCEPTIONS = makeSymbol("QA-SUBTOPIC-FN-SPEC-EXCEPTIONS");

    public static final SubLObject $$subTopicFnExceptionSpecs = constant_handles.reader_make_constant_shell(makeString("subTopicFnExceptionSpecs"));

    public static final SubLSymbol $qa_subtopic_fn_spec_exceptions_caching_state$ = makeSymbol("*QA-SUBTOPIC-FN-SPEC-EXCEPTIONS-CACHING-STATE*");

    private static final SubLSymbol QA_SUBTOPIC_FN_INSTANCE_EXCEPTIONS = makeSymbol("QA-SUBTOPIC-FN-INSTANCE-EXCEPTIONS");

    public static final SubLObject $$subTopicFnExceptionInstances = constant_handles.reader_make_constant_shell(makeString("subTopicFnExceptionInstances"));

    public static final SubLSymbol $qa_subtopic_fn_instance_exceptions_caching_state$ = makeSymbol("*QA-SUBTOPIC-FN-INSTANCE-EXCEPTIONS-CACHING-STATE*");

    private static final SubLSymbol QA_SUBTOPIC_FN_PASSES_EXCEPTIONS = makeSymbol("QA-SUBTOPIC-FN-PASSES-EXCEPTIONS");

    public static final SubLSymbol $qa_subtopic_fn_passes_exceptions_caching_state$ = makeSymbol("*QA-SUBTOPIC-FN-PASSES-EXCEPTIONS-CACHING-STATE*");

    static private final SubLSymbol $sym24$_ = makeSymbol("<");

    private static final SubLSymbol RELATION_GENERALITY_ESTIMATE = makeSymbol("RELATION-GENERALITY-ESTIMATE");

    static private final SubLString $str_alt26$query_augmenter_subtopic_followup = makeString("query-augmenter-subtopic-followups");

    static private final SubLString $$$cycl = makeString("cycl");

    static private final SubLString $str_alt28$__cvs_head_cycorp_cyc_cyc_lisp_cy = makeString("~/cvs/head/cycorp/cyc/cyc-lisp/cycl/query-augmenter/query-augmenter-subtopic-followups.lisp");

    public static final SubLObject $$WebSearchEnhancementMt = constant_handles.reader_make_constant_shell(makeString("WebSearchEnhancementMt"));

    private static final SubLSymbol QA_SUBTOPIC_RETRIEVAL_TEST = makeSymbol("QA-SUBTOPIC-RETRIEVAL-TEST");



    static private final SubLList $list_alt32 = list(new SubLObject[]{ list(makeSymbol("IND1"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("IND2"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("COLLECTION-GENL"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("COLLECTION-SPEC"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("FUNC1"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("FUNC2"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("FUNC3"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-RETRIEVAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-DIRECT-RETRIEVAL"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-SPEC-RETRIEVAL"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-INSTANCE-RETRIEVAL"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-DIRECT-EXCEPT-RETRIEVAL"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-SPEC-EXCEPT-RETRIEVAL"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-INSTANCE-EXCEPT-RETRIEVAL"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-COMBINING"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-SUBTOPIC-AS-SPEC"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-SUBTOPIC-AS-INSTANCE"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-EXCEPTION-PASSING"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-VALID-SUBTOPICS-W-EXCEPTIONS"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-VALID-SUBTOPICS-NO-EXCEPTIONS"), NIL, makeKeyword("PRIVATE")) });

    private static final SubLSymbol FUNC3 = makeSymbol("FUNC3");

    private static final SubLSymbol FUNC2 = makeSymbol("FUNC2");

    private static final SubLSymbol FUNC1 = makeSymbol("FUNC1");

    private static final SubLSymbol COLLECTION_SPEC = makeSymbol("COLLECTION-SPEC");

    private static final SubLSymbol COLLECTION_GENL = makeSymbol("COLLECTION-GENL");

    private static final SubLSymbol IND2 = makeSymbol("IND2");

    private static final SubLSymbol IND1 = makeSymbol("IND1");

















    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_QA_SUBTOPIC_RETRIEVAL_TEST_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-QA-SUBTOPIC-RETRIEVAL-TEST-CLASS");









    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_QA_SUBTOPIC_RETRIEVAL_TEST_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-QA-SUBTOPIC-RETRIEVAL-TEST-INSTANCE");

    private static final SubLSymbol TEST_RETRIEVAL = makeSymbol("TEST-RETRIEVAL");

    private static final SubLSymbol TEST_COMBINING = makeSymbol("TEST-COMBINING");

    // // Initializers
    public void declareFunctions() {
        declare_query_augmenter_subtopic_followups_file();
    }

    public void initializeVariables() {
        init_query_augmenter_subtopic_followups_file();
    }

    public void runTopLevelForms() {
        setup_query_augmenter_subtopic_followups_file();
    }
}

