/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.sks_indexing;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.ghl_link_iterators;
import com.cyc.cycjava.cycl.ghl_marking_utilities;
import com.cyc.cycjava.cycl.ghl_search_vars;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.pred_relevance_macros;
import com.cyc.cycjava.cycl.transitivity;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SKSI-TVA-UTILITIES
 * source file: /cyc/top/cycl/sksi/sks-indexing/sksi-tva-utilities.lisp
 * created:     2019/07/03 17:38:33
 */
public final class sksi_tva_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sksi_tva_utilities();



    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol SKSI_PRED_AND_RELEVANCE_P = makeSymbol("SKSI-PRED-AND-RELEVANCE-P");

    private static final SubLSymbol SKSI_INVERSE_CARDINALITY = makeSymbol("SKSI-INVERSE-CARDINALITY");

    private static final SubLSymbol SKSI_PREDICATE_CARDINALITY = makeSymbol("SKSI-PREDICATE-CARDINALITY");

    // Definitions
    public static final SubLObject sksi_pred_and_relevance_p_internal_alt(SubLObject predicate) {
        return sksi_sks_predicate_indexing.predicate_sksi_indexed_relevant_in_mtP(predicate);
    }

    public static SubLObject sksi_pred_and_relevance_p_internal(final SubLObject predicate) {
        return sksi_sks_predicate_indexing.predicate_sksi_indexed_relevant_in_mtP(predicate);
    }

    public static final SubLObject sksi_pred_and_relevance_p_alt(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_tva_utilities.sksi_pred_and_relevance_p_internal(predicate);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_PRED_AND_RELEVANCE_P, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_PRED_AND_RELEVANCE_P, ONE_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, SKSI_PRED_AND_RELEVANCE_P, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, $kw1$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw1$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_tva_utilities.sksi_pred_and_relevance_p_internal(predicate)));
                        memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject sksi_pred_and_relevance_p(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sksi_pred_and_relevance_p_internal(predicate);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_PRED_AND_RELEVANCE_P, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_PRED_AND_RELEVANCE_P, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SKSI_PRED_AND_RELEVANCE_P, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(sksi_pred_and_relevance_p_internal(predicate)));
            memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject sksi_gaf_arg_impossible_p_alt(SubLObject pred, SubLObject v_term, SubLObject argnum) {
        return makeBoolean(NIL == com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_tva_utilities.sksi_gaf_arg_possible_p(pred, v_term, argnum));
    }

    public static SubLObject sksi_gaf_arg_impossible_p(final SubLObject pred, final SubLObject v_term, final SubLObject argnum) {
        return makeBoolean(NIL == sksi_gaf_arg_possible_p(pred, v_term, argnum));
    }

    /**
     * MT relevance is set from outside.
     */
    @LispMethod(comment = "MT relevance is set from outside.")
    public static final SubLObject sksi_gaf_arg_possible_p_alt(SubLObject pred, SubLObject v_term, SubLObject argnum) {
        return com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_tva_utilities.sksi_transitivity_possibleP();
    }

    /**
     * MT relevance is set from outside.
     */
    @LispMethod(comment = "MT relevance is set from outside.")
    public static SubLObject sksi_gaf_arg_possible_p(final SubLObject pred, final SubLObject v_term, final SubLObject argnum) {
        return sksi_transitivity_possibleP();
    }

    public static final SubLObject sksi_transitivity_possibleP_alt() {
        return sksi_sks_mapping_utilities.sksi_sks_mapping_allowedP(UNPROVIDED);
    }

    public static SubLObject sksi_transitivity_possibleP() {
        return sksi_sks_mapping_utilities.sksi_sks_mapping_allowedP(UNPROVIDED);
    }

    public static final SubLObject sksi_gt_relevant_predP_alt(SubLObject pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != ghl_search_vars.$sksi_gt_search_pred$.getDynamicValue(thread) ? ((SubLObject) (ghl_link_iterators.gt_relevant_predP(pred, ghl_search_vars.$sksi_gt_search_pred$.getDynamicValue(thread)))) : pred_relevance_macros.relevant_predP(pred);
        }
    }

    public static SubLObject sksi_gt_relevant_predP(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != ghl_search_vars.$sksi_gt_search_pred$.getDynamicValue(thread) ? ghl_link_iterators.gt_relevant_predP(pred, ghl_search_vars.$sksi_gt_search_pred$.getDynamicValue(thread)) : pred_relevance_macros.relevant_predP(pred);
    }

    public static final SubLObject sksi_record_all_backward_true_nodes_alt(SubLObject module, SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            SubLObject backward_nodes = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_values(node, TWO_INTEGER, ONE_INTEGER, module, $TRUE);
            SubLObject cdolist_list_var = backward_nodes;
            SubLObject backward_node = NIL;
            for (backward_node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , backward_node = cdolist_list_var.first()) {
                ghl_marking_utilities.ghl_mark_node_in_ghl_table(backward_node, T);
            }
        }
        return NIL;
    }

    public static SubLObject sksi_record_all_backward_true_nodes(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLObject cdolist_list_var;
        final SubLObject backward_nodes = cdolist_list_var = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_values(node, TWO_INTEGER, ONE_INTEGER, module, $TRUE);
        SubLObject backward_node = NIL;
        backward_node = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ghl_marking_utilities.ghl_mark_node_in_ghl_table(backward_node, T);
            cdolist_list_var = cdolist_list_var.rest();
            backward_node = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject sksi_record_all_forward_true_nodes_alt(SubLObject module, SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            SubLObject forward_nodes = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_values(node, ONE_INTEGER, TWO_INTEGER, module, $TRUE);
            SubLObject cdolist_list_var = forward_nodes;
            SubLObject forward_node = NIL;
            for (forward_node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , forward_node = cdolist_list_var.first()) {
                ghl_marking_utilities.ghl_mark_node_in_ghl_table(forward_node, T);
            }
        }
        return NIL;
    }

    public static SubLObject sksi_record_all_forward_true_nodes(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLObject cdolist_list_var;
        final SubLObject forward_nodes = cdolist_list_var = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_values(node, ONE_INTEGER, TWO_INTEGER, module, $TRUE);
        SubLObject forward_node = NIL;
        forward_node = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ghl_marking_utilities.ghl_mark_node_in_ghl_table(forward_node, T);
            cdolist_list_var = cdolist_list_var.rest();
            forward_node = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject sksi_inverse_cardinality_internal_alt(SubLObject pred, SubLObject node, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        return sksi_sks_gaf_arg_indexing.gather_sum_of_relevant_counts_for_term_argnum_pred(node, transitivity.ggt_gather_arg(pred), pred);
    }

    public static SubLObject sksi_inverse_cardinality_internal(final SubLObject pred, final SubLObject node, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        return sksi_sks_gaf_arg_indexing.gather_sum_of_relevant_counts_for_term_argnum_pred(node, transitivity.ggt_gather_arg(pred), pred);
    }

    public static final SubLObject sksi_inverse_cardinality_alt(SubLObject pred, SubLObject node, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_tva_utilities.sksi_inverse_cardinality_internal(pred, node, mt_info);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_INVERSE_CARDINALITY, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_INVERSE_CARDINALITY, THREE_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, SKSI_INVERSE_CARDINALITY, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(pred, node, mt_info);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw1$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (pred == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (node == cached_args.first()) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && (mt_info == cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_tva_utilities.sksi_inverse_cardinality_internal(pred, node, mt_info)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(pred, node, mt_info));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject sksi_inverse_cardinality(final SubLObject pred, final SubLObject node, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sksi_inverse_cardinality_internal(pred, node, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_INVERSE_CARDINALITY, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_INVERSE_CARDINALITY, THREE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SKSI_INVERSE_CARDINALITY, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(pred, node, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (node.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(sksi_inverse_cardinality_internal(pred, node, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, node, mt_info));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject sksi_predicate_cardinality_internal_alt(SubLObject pred, SubLObject node, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        return sksi_sks_gaf_arg_indexing.gather_sum_of_relevant_counts_for_term_argnum_pred(node, transitivity.ggt_index_arg(pred), pred);
    }

    public static SubLObject sksi_predicate_cardinality_internal(final SubLObject pred, final SubLObject node, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        return sksi_sks_gaf_arg_indexing.gather_sum_of_relevant_counts_for_term_argnum_pred(node, transitivity.ggt_index_arg(pred), pred);
    }

    public static final SubLObject sksi_predicate_cardinality_alt(SubLObject pred, SubLObject node, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_tva_utilities.sksi_predicate_cardinality_internal(pred, node, mt_info);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_PREDICATE_CARDINALITY, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_PREDICATE_CARDINALITY, THREE_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, SKSI_PREDICATE_CARDINALITY, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(pred, node, mt_info);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw1$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (pred == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (node == cached_args.first()) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && (mt_info == cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_tva_utilities.sksi_predicate_cardinality_internal(pred, node, mt_info)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(pred, node, mt_info));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject sksi_predicate_cardinality(final SubLObject pred, final SubLObject node, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sksi_predicate_cardinality_internal(pred, node, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_PREDICATE_CARDINALITY, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_PREDICATE_CARDINALITY, THREE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SKSI_PREDICATE_CARDINALITY, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(pred, node, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (node.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(sksi_predicate_cardinality_internal(pred, node, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, node, mt_info));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject declare_sksi_tva_utilities_file() {
        declareFunction("sksi_pred_and_relevance_p_internal", "SKSI-PRED-AND-RELEVANCE-P-INTERNAL", 1, 0, false);
        declareFunction("sksi_pred_and_relevance_p", "SKSI-PRED-AND-RELEVANCE-P", 1, 0, false);
        declareFunction("sksi_gaf_arg_impossible_p", "SKSI-GAF-ARG-IMPOSSIBLE-P", 3, 0, false);
        declareFunction("sksi_gaf_arg_possible_p", "SKSI-GAF-ARG-POSSIBLE-P", 3, 0, false);
        declareFunction("sksi_transitivity_possibleP", "SKSI-TRANSITIVITY-POSSIBLE?", 0, 0, false);
        declareFunction("sksi_gt_relevant_predP", "SKSI-GT-RELEVANT-PRED?", 1, 0, false);
        declareFunction("sksi_record_all_backward_true_nodes", "SKSI-RECORD-ALL-BACKWARD-TRUE-NODES", 2, 2, false);
        declareFunction("sksi_record_all_forward_true_nodes", "SKSI-RECORD-ALL-FORWARD-TRUE-NODES", 2, 2, false);
        declareFunction("sksi_inverse_cardinality_internal", "SKSI-INVERSE-CARDINALITY-INTERNAL", 2, 1, false);
        declareFunction("sksi_inverse_cardinality", "SKSI-INVERSE-CARDINALITY", 2, 1, false);
        declareFunction("sksi_predicate_cardinality_internal", "SKSI-PREDICATE-CARDINALITY-INTERNAL", 2, 1, false);
        declareFunction("sksi_predicate_cardinality", "SKSI-PREDICATE-CARDINALITY", 2, 1, false);
        return NIL;
    }

    public static SubLObject init_sksi_tva_utilities_file() {
        return NIL;
    }

    public static SubLObject setup_sksi_tva_utilities_file() {
        memoization_state.note_memoized_function(SKSI_PRED_AND_RELEVANCE_P);
        memoization_state.note_memoized_function(SKSI_INVERSE_CARDINALITY);
        memoization_state.note_memoized_function(SKSI_PREDICATE_CARDINALITY);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_tva_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_tva_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_tva_utilities_file();
    }

    static {
    }

    public static final SubLSymbol $kw1$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
}

/**
 * Total time: 90 ms
 */
