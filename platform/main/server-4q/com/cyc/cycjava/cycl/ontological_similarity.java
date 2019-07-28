package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.ontological_similarity;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.ontological_similarity.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class ontological_similarity extends SubLTranslatedFile {
    public static final SubLFile me = new ontological_similarity();

    public static final String myName = "com.cyc.cycjava.cycl.ontological_similarity";

    public static final String myFingerPrint = "0d1b585c90dc599b369ac63a3f47012e46ce52e0cca4f212602b48e8f5d9cf08";



    private static final SubLSymbol ONTOLOGICAL_SIGNATURE_MEMOIZED_INTERNAL = makeSymbol("ONTOLOGICAL-SIGNATURE-MEMOIZED-INTERNAL");



    private static final SubLSymbol ONTOLOGICAL_DISTANCE_MEMOIZED_INTERNAL = makeSymbol("ONTOLOGICAL-DISTANCE-MEMOIZED-INTERNAL");

    public static SubLObject ontological_signature(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != cycl_grammar.cycl_unrepresented_term_p(v_object)) {
            return defns.all_defn_admits(v_object, mt);
        }
        if (NIL != fort_types_interface.isa_collectionP(v_object, mt)) {
            return genls.all_genls(v_object, mt, UNPROVIDED);
        }
        return isa.all_isa(v_object, mt, UNPROVIDED);
    }

    public static SubLObject ontological_signature_ordered(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return cardinality_estimates.sort_by_generality_estimate(ontological_signature(v_object, mt), $ASCENDING);
    }

    public static SubLObject ontological_signature_memoized(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = ontological_signature_memoized_internal(v_term, mt_relevance_macros.mt_info(mt));
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject ontological_signature_memoized_internal_internal(final SubLObject v_term, final SubLObject mt_info) {
        return ontological_signature_ordered(v_term, UNPROVIDED);
    }

    public static SubLObject ontological_signature_memoized_internal(final SubLObject v_term, final SubLObject mt_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return ontological_signature_memoized_internal_internal(v_term, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, ONTOLOGICAL_SIGNATURE_MEMOIZED_INTERNAL, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), ONTOLOGICAL_SIGNATURE_MEMOIZED_INTERNAL, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, ONTOLOGICAL_SIGNATURE_MEMOIZED_INTERNAL, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(ontological_signature_memoized_internal_internal(v_term, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, mt_info));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject ontological_comparison(final SubLObject terms, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == terms) {
            return values(NIL, NIL);
        }
        if (NIL != list_utilities.singletonP(terms)) {
            final SubLObject common = copy_list(ontological_signature_memoized(terms.first(), mt));
            return values(common, NIL);
        }
        thread.resetMultipleValues();
        SubLObject common = ontological_comparison_int(terms, mt);
        final SubLObject union_hash = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject union = keyhash_utilities.keyhash_element_list(union_hash);
        SubLObject unique = list_utilities.fast_set_difference(union, common, symbol_function(EQUAL));
        common = cardinality_estimates.sort_by_generality_estimate(common, $ASCENDING);
        unique = cardinality_estimates.sort_by_generality_estimate(unique, $ASCENDING);
        return values(common, unique);
    }

    public static SubLObject ontological_similarity(final SubLObject terms, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == terms) {
            return ZERO_INTEGER;
        }
        if (NIL != list_utilities.singletonP(terms)) {
            return ONE_INTEGER;
        }
        if ((NIL != list_utilities.doubletonP(terms)) && terms.first().equal(second(terms))) {
            return ONE_INTEGER;
        }
        thread.resetMultipleValues();
        final SubLObject common = ontological_comparison_int(terms, mt);
        final SubLObject union = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject common_count = length(common);
        final SubLObject union_count = keyhash.keyhash_count(union);
        if (union_count.isZero()) {
            return ZERO_INTEGER;
        }
        return divide(common_count, union_count);
    }

    public static SubLObject ontological_distance(final SubLObject term1, final SubLObject term2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (term1.equal(term2)) {
            return ZERO_INTEGER;
        }
        final SubLObject terms = kb_utilities.sort_terms(list(term1, term2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return subtract(ONE_INTEGER, ontological_similarity(terms, mt));
    }

    public static SubLObject ontological_distance_memoized(final SubLObject candidate, final SubLObject compare, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != kb_utilities.term_L(compare, candidate, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return ontological_distance_memoized(compare, candidate, mt);
        }
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = ontological_distance_memoized_internal(candidate, compare, mt_relevance_macros.mt_info(mt));
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject ontological_comparison_int(final SubLObject terms, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject union = keyhash.new_keyhash(multiply(length(terms), $average_all_genls_count$.getDynamicValue(thread)), symbol_function(EQUAL));
        SubLObject common = $UNINITIALIZED;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1;
            final SubLObject signature = cdolist_list_var_$1 = ontological_signature_memoized(v_term, mt);
            SubLObject col = NIL;
            col = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                keyhash.setkeyhash(col, union);
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                col = cdolist_list_var_$1.first();
            } 
            if (common == $UNINITIALIZED) {
                common = copy_list(signature);
            } else {
                common = nintersection(common, signature, symbol_function(EQUAL), UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return values(common, union);
    }

    public static SubLObject ontological_distance_memoized_internal_internal(final SubLObject candidate, final SubLObject compare, final SubLObject mt_info) {
        return ontological_distance(candidate, compare, UNPROVIDED);
    }

    public static SubLObject ontological_distance_memoized_internal(final SubLObject candidate, final SubLObject compare, final SubLObject mt_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return ontological_distance_memoized_internal_internal(candidate, compare, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, ONTOLOGICAL_DISTANCE_MEMOIZED_INTERNAL, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), ONTOLOGICAL_DISTANCE_MEMOIZED_INTERNAL, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, ONTOLOGICAL_DISTANCE_MEMOIZED_INTERNAL, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(candidate, compare, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (candidate.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (compare.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(ontological_distance_memoized_internal_internal(candidate, compare, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(candidate, compare, mt_info));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject maximally_ontologically_distant_element_wrt(final SubLObject candidates, final SubLObject comparison_terms, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject farthest_term = $UNINITIALIZED;
        SubLObject farthest_error = $UNINITIALIZED;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject cdolist_list_var = candidates;
                SubLObject candidate = NIL;
                candidate = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject error = ZERO_INTEGER;
                    SubLObject cdolist_list_var_$2 = comparison_terms;
                    SubLObject compare = NIL;
                    compare = cdolist_list_var_$2.first();
                    while (NIL != cdolist_list_var_$2) {
                        final SubLObject distance = ontological_distance_memoized(candidate, compare, mt);
                        final SubLObject distX2 = multiply(distance, distance);
                        error = add(error, distX2);
                        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                        compare = cdolist_list_var_$2.first();
                    } 
                    if (($UNINITIALIZED == farthest_error) || error.numG(farthest_error)) {
                        farthest_term = candidate;
                        farthest_error = error;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    candidate = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return farthest_term;
    }

    public static SubLObject minimally_ontologically_distant_element_wrt(final SubLObject candidates, final SubLObject comparison_terms, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject nearest_term = $UNINITIALIZED;
        SubLObject nearest_error = $UNINITIALIZED;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject cdolist_list_var = candidates;
                SubLObject candidate = NIL;
                candidate = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject error = ZERO_INTEGER;
                    SubLObject cdolist_list_var_$4 = comparison_terms;
                    SubLObject compare = NIL;
                    compare = cdolist_list_var_$4.first();
                    while (NIL != cdolist_list_var_$4) {
                        final SubLObject distance = ontological_distance_memoized(candidate, compare, mt);
                        final SubLObject distX2 = multiply(distance, distance);
                        error = add(error, distX2);
                        cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                        compare = cdolist_list_var_$4.first();
                    } 
                    if (($UNINITIALIZED == nearest_error) || error.numL(nearest_error)) {
                        nearest_term = candidate;
                        nearest_error = error;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    candidate = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return nearest_term;
    }

    public static SubLObject declare_ontological_similarity_file() {
        declareFunction(me, "ontological_signature", "ONTOLOGICAL-SIGNATURE", 1, 1, false);
        declareFunction(me, "ontological_signature_ordered", "ONTOLOGICAL-SIGNATURE-ORDERED", 1, 1, false);
        declareFunction(me, "ontological_signature_memoized", "ONTOLOGICAL-SIGNATURE-MEMOIZED", 1, 1, false);
        declareFunction(me, "ontological_signature_memoized_internal_internal", "ONTOLOGICAL-SIGNATURE-MEMOIZED-INTERNAL-INTERNAL", 2, 0, false);
        declareFunction(me, "ontological_signature_memoized_internal", "ONTOLOGICAL-SIGNATURE-MEMOIZED-INTERNAL", 2, 0, false);
        declareFunction(me, "ontological_comparison", "ONTOLOGICAL-COMPARISON", 1, 1, false);
        declareFunction(me, "ontological_similarity", "ONTOLOGICAL-SIMILARITY", 1, 1, false);
        declareFunction(me, "ontological_distance", "ONTOLOGICAL-DISTANCE", 2, 1, false);
        declareFunction(me, "ontological_distance_memoized", "ONTOLOGICAL-DISTANCE-MEMOIZED", 2, 1, false);
        declareFunction(me, "ontological_comparison_int", "ONTOLOGICAL-COMPARISON-INT", 1, 1, false);
        declareFunction(me, "ontological_distance_memoized_internal_internal", "ONTOLOGICAL-DISTANCE-MEMOIZED-INTERNAL-INTERNAL", 3, 0, false);
        declareFunction(me, "ontological_distance_memoized_internal", "ONTOLOGICAL-DISTANCE-MEMOIZED-INTERNAL", 3, 0, false);
        declareFunction(me, "maximally_ontologically_distant_element_wrt", "MAXIMALLY-ONTOLOGICALLY-DISTANT-ELEMENT-WRT", 2, 1, false);
        declareFunction(me, "minimally_ontologically_distant_element_wrt", "MINIMALLY-ONTOLOGICALLY-DISTANT-ELEMENT-WRT", 2, 1, false);
        return NIL;
    }

    public static SubLObject init_ontological_similarity_file() {
        return NIL;
    }

    public static SubLObject setup_ontological_similarity_file() {
        memoization_state.note_memoized_function(ONTOLOGICAL_SIGNATURE_MEMOIZED_INTERNAL);
        memoization_state.note_memoized_function(ONTOLOGICAL_DISTANCE_MEMOIZED_INTERNAL);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_ontological_similarity_file();
    }

    @Override
    public void initializeVariables() {
        init_ontological_similarity_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_ontological_similarity_file();
    }

    static {





    }
}

/**
 * Total time: 119 ms
 */
