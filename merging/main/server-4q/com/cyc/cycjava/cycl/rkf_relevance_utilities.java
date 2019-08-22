/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RKF-RELEVANCE-UTILITIES
 * source file: /cyc/top/cycl/rkf-relevance-utilities.lisp
 * created:     2019/07/03 17:37:59
 */
public final class rkf_relevance_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new rkf_relevance_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.rkf_relevance_utilities";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $rkf_irrelevant_term_lambda_domain_mt$ = makeSymbol("*RKF-IRRELEVANT-TERM-LAMBDA-DOMAIN-MT*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol CACHED_RKF_IRRELEVANT_PRECISION_SUGGESTION_FORT = makeSymbol("CACHED-RKF-IRRELEVANT-PRECISION-SUGGESTION-FORT");

    public static final SubLSymbol $cached_rkf_irrelevant_precision_suggestion_fort_caching_state$ = makeSymbol("*CACHED-RKF-IRRELEVANT-PRECISION-SUGGESTION-FORT-CACHING-STATE*");



    private static final SubLSymbol CACHED_RKF_IRRELEVANT_ARG_CONSTRAINT_FORT = makeSymbol("CACHED-RKF-IRRELEVANT-ARG-CONSTRAINT-FORT");

    private static final SubLSymbol $cached_rkf_irrelevant_arg_constraint_fort_caching_state$ = makeSymbol("*CACHED-RKF-IRRELEVANT-ARG-CONSTRAINT-FORT-CACHING-STATE*");





    private static final SubLSymbol $sym10$RKF_IRRELEVANT_TERM_LAMBDA_ = makeSymbol("RKF-IRRELEVANT-TERM-LAMBDA?");

    private static final SubLList $list11 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));



    private static final SubLSymbol CACHED_RKF_IRRELEVANT_FORT = makeSymbol("CACHED-RKF-IRRELEVANT-FORT");

    private static final SubLSymbol $cached_rkf_irrelevant_fort_caching_state$ = makeSymbol("*CACHED-RKF-IRRELEVANT-FORT-CACHING-STATE*");

    private static final SubLSymbol CLEAR_CACHED_RKF_IRRELEVANT_FORT = makeSymbol("CLEAR-CACHED-RKF-IRRELEVANT-FORT");



    private static final SubLSymbol $REMOVAL_RKF_IRRELEVANT_FORT_CACHE_CHECK_POS = makeKeyword("REMOVAL-RKF-IRRELEVANT-FORT-CACHE-CHECK-POS");







    // Definitions
    public static final SubLObject rkf_irrelevant_precision_suggestion_alt(SubLObject to_term, SubLObject domain_mt) {
        return makeBoolean((NIL != forts.fort_p(to_term)) && ((NIL != forts.invalid_fortP(to_term)) || (NIL != com.cyc.cycjava.cycl.rkf_relevance_utilities.cached_rkf_irrelevant_precision_suggestion_fort(to_term, domain_mt))));
    }

    // Definitions
    public static SubLObject rkf_irrelevant_precision_suggestion(final SubLObject to_term, final SubLObject domain_mt) {
        return makeBoolean((NIL != forts.fort_p(to_term)) && ((NIL != forts.invalid_fortP(to_term)) || (NIL != cached_rkf_irrelevant_precision_suggestion_fort(to_term, domain_mt))));
    }

    public static final SubLObject rkf_irrelevant_precision_suggestion_from_alt(SubLObject to_term, SubLObject from_term, SubLObject domain_mt) {
        return makeBoolean(((NIL != forts.fort_p(to_term)) && (NIL != forts.fort_p(from_term))) && ((((NIL != forts.invalid_fortP(to_term)) || (NIL != forts.invalid_fortP(from_term))) || (NIL != com.cyc.cycjava.cycl.rkf_relevance_utilities.cached_rkf_irrelevant_precision_suggestion_fort(to_term, domain_mt))) || (NIL != com.cyc.cycjava.cycl.rkf_relevance_utilities.rkf_irrelevant_precision_suggestion_fort_pairP(to_term, from_term, domain_mt))));
    }

    public static SubLObject rkf_irrelevant_precision_suggestion_from(final SubLObject to_term, final SubLObject from_term, final SubLObject domain_mt) {
        return makeBoolean(((NIL != forts.fort_p(to_term)) && (NIL != forts.fort_p(from_term))) && ((((NIL != forts.invalid_fortP(to_term)) || (NIL != forts.invalid_fortP(from_term))) || (NIL != cached_rkf_irrelevant_precision_suggestion_fort(to_term, domain_mt))) || (NIL != rkf_irrelevant_precision_suggestion_fort_pairP(to_term, from_term, domain_mt))));
    }

    public static final SubLObject clear_cached_rkf_irrelevant_precision_suggestion_fort_alt() {
        {
            SubLObject cs = $cached_rkf_irrelevant_precision_suggestion_fort_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_cached_rkf_irrelevant_precision_suggestion_fort() {
        final SubLObject cs = $cached_rkf_irrelevant_precision_suggestion_fort_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_cached_rkf_irrelevant_precision_suggestion_fort_alt(SubLObject fort, SubLObject domain_mt) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_rkf_irrelevant_precision_suggestion_fort_caching_state$.getGlobalValue(), list(fort, domain_mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_cached_rkf_irrelevant_precision_suggestion_fort(final SubLObject fort, final SubLObject domain_mt) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_rkf_irrelevant_precision_suggestion_fort_caching_state$.getGlobalValue(), list(fort, domain_mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cached_rkf_irrelevant_precision_suggestion_fort_internal_alt(SubLObject fort, SubLObject domain_mt) {
        return com.cyc.cycjava.cycl.rkf_relevance_utilities.rkf_irrelevant_precision_suggestion_fort_internal(fort, domain_mt);
    }

    public static SubLObject cached_rkf_irrelevant_precision_suggestion_fort_internal(final SubLObject fort, final SubLObject domain_mt) {
        return rkf_irrelevant_precision_suggestion_fort_internal(fort, domain_mt);
    }

    public static final SubLObject cached_rkf_irrelevant_precision_suggestion_fort_alt(SubLObject fort, SubLObject domain_mt) {
        {
            SubLObject caching_state = $cached_rkf_irrelevant_precision_suggestion_fort_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(CACHED_RKF_IRRELEVANT_PRECISION_SUGGESTION_FORT, $cached_rkf_irrelevant_precision_suggestion_fort_caching_state$, NIL, EQL, TWO_INTEGER, TEN_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(fort, domain_mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (fort.eql(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.eql(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rkf_relevance_utilities.cached_rkf_irrelevant_precision_suggestion_fort_internal(fort, domain_mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(fort, domain_mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject cached_rkf_irrelevant_precision_suggestion_fort(final SubLObject fort, final SubLObject domain_mt) {
        SubLObject caching_state = $cached_rkf_irrelevant_precision_suggestion_fort_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_RKF_IRRELEVANT_PRECISION_SUGGESTION_FORT, $cached_rkf_irrelevant_precision_suggestion_fort_caching_state$, NIL, EQL, TWO_INTEGER, TEN_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(fort, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (fort.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(cached_rkf_irrelevant_precision_suggestion_fort_internal(fort, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(fort, domain_mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject rkf_irrelevant_precision_suggestion_fort_internal_alt(SubLObject fort, SubLObject domain_mt) {
        return list_utilities.sublisp_boolean(backward.removal_ask(list($$keIrrelevantPrecisionSuggestion, fort), domain_mt, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject rkf_irrelevant_precision_suggestion_fort_internal(final SubLObject fort, final SubLObject domain_mt) {
        return list_utilities.sublisp_boolean(backward.removal_ask(list($$keIrrelevantPrecisionSuggestion, fort), domain_mt, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject rkf_irrelevant_precision_suggestion_fort_pairP_alt(SubLObject to_fort, SubLObject from_fort, SubLObject domain_mt) {
        return subl_promotions.memberP(to_fort, rkf_precision_suggestor.rkf_irrelevant_precision_suggestion_forts_from_fort(from_fort, domain_mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rkf_irrelevant_precision_suggestion_fort_pairP(final SubLObject to_fort, final SubLObject from_fort, final SubLObject domain_mt) {
        return subl_promotions.memberP(to_fort, rkf_precision_suggestor.rkf_irrelevant_precision_suggestion_forts_from_fort(from_fort, domain_mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject rkf_irrelevant_arg_constraint_alt(SubLObject v_term, SubLObject domain_mt) {
        return makeBoolean((NIL != forts.fort_p(v_term)) && ((NIL != forts.invalid_fortP(v_term)) || (NIL != com.cyc.cycjava.cycl.rkf_relevance_utilities.cached_rkf_irrelevant_arg_constraint_fort(v_term, domain_mt))));
    }

    public static SubLObject rkf_irrelevant_arg_constraint(final SubLObject v_term, final SubLObject domain_mt) {
        return makeBoolean((NIL != forts.fort_p(v_term)) && ((NIL != forts.invalid_fortP(v_term)) || (NIL != cached_rkf_irrelevant_arg_constraint_fort(v_term, domain_mt))));
    }

    public static final SubLObject clear_cached_rkf_irrelevant_arg_constraint_fort_alt() {
        {
            SubLObject cs = $cached_rkf_irrelevant_arg_constraint_fort_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_cached_rkf_irrelevant_arg_constraint_fort() {
        final SubLObject cs = $cached_rkf_irrelevant_arg_constraint_fort_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_cached_rkf_irrelevant_arg_constraint_fort_alt(SubLObject fort, SubLObject domain_mt) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_rkf_irrelevant_arg_constraint_fort_caching_state$.getGlobalValue(), list(fort, domain_mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_cached_rkf_irrelevant_arg_constraint_fort(final SubLObject fort, final SubLObject domain_mt) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_rkf_irrelevant_arg_constraint_fort_caching_state$.getGlobalValue(), list(fort, domain_mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cached_rkf_irrelevant_arg_constraint_fort_internal_alt(SubLObject fort, SubLObject domain_mt) {
        return com.cyc.cycjava.cycl.rkf_relevance_utilities.rkf_irrelevant_arg_constraint_fort_internal(fort, domain_mt);
    }

    public static SubLObject cached_rkf_irrelevant_arg_constraint_fort_internal(final SubLObject fort, final SubLObject domain_mt) {
        return rkf_irrelevant_arg_constraint_fort_internal(fort, domain_mt);
    }

    public static final SubLObject cached_rkf_irrelevant_arg_constraint_fort_alt(SubLObject fort, SubLObject domain_mt) {
        {
            SubLObject caching_state = $cached_rkf_irrelevant_arg_constraint_fort_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(CACHED_RKF_IRRELEVANT_ARG_CONSTRAINT_FORT, $cached_rkf_irrelevant_arg_constraint_fort_caching_state$, NIL, EQL, TWO_INTEGER, TEN_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(fort, domain_mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (fort.eql(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.eql(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rkf_relevance_utilities.cached_rkf_irrelevant_arg_constraint_fort_internal(fort, domain_mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(fort, domain_mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject cached_rkf_irrelevant_arg_constraint_fort(final SubLObject fort, final SubLObject domain_mt) {
        SubLObject caching_state = $cached_rkf_irrelevant_arg_constraint_fort_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_RKF_IRRELEVANT_ARG_CONSTRAINT_FORT, $cached_rkf_irrelevant_arg_constraint_fort_caching_state$, NIL, EQL, TWO_INTEGER, TEN_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(fort, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (fort.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(cached_rkf_irrelevant_arg_constraint_fort_internal(fort, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(fort, domain_mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject rkf_irrelevant_arg_constraint_fort_internal_alt(SubLObject fort, SubLObject domain_mt) {
        return list_utilities.sublisp_boolean(backward.removal_ask(list($$keIrrelevantArgConstraint, fort), domain_mt, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject rkf_irrelevant_arg_constraint_fort_internal(final SubLObject fort, final SubLObject domain_mt) {
        return list_utilities.sublisp_boolean(backward.removal_ask(list($$keIrrelevantArgConstraint, fort), domain_mt, UNPROVIDED, UNPROVIDED));
    }

    /**
     * TERM is deemed irrelevant in DOMAIN-MT
     */
    @LispMethod(comment = "TERM is deemed irrelevant in DOMAIN-MT")
    public static final SubLObject rkf_irrelevant_term_alt(SubLObject v_term, SubLObject domain_mt) {
        if (NIL != forts.fort_p(v_term)) {
            if (NIL != forts.invalid_fortP(v_term)) {
                return T;
            }
            {
                SubLObject cached_result = rkf_irrelevant_fort_cache.rkf_irrelevant_cache_lookup(v_term);
                SubLObject pcase_var = cached_result;
                if (pcase_var.eql($IRRELEVANT_EVERYWHERE)) {
                    return T;
                } else {
                    if (pcase_var.eql($IRRELEVANT_NOWHERE)) {
                        return NIL;
                    } else {
                        if ((cached_result == $IRRELEVANT_SOMEWHERE) && domain_mt.eql($$InferencePSC)) {
                            return T;
                        } else {
                            return com.cyc.cycjava.cycl.rkf_relevance_utilities.cached_rkf_irrelevant_fort(v_term, domain_mt);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * TERM is deemed irrelevant in DOMAIN-MT
     */
    @LispMethod(comment = "TERM is deemed irrelevant in DOMAIN-MT")
    public static SubLObject rkf_irrelevant_term(final SubLObject v_term, final SubLObject domain_mt) {
        if (NIL == forts.fort_p(v_term)) {
            return NIL;
        }
        if (NIL != forts.invalid_fortP(v_term)) {
            return T;
        }
        final SubLObject pcase_var;
        final SubLObject cached_result = pcase_var = rkf_irrelevant_fort_cache.rkf_irrelevant_cache_lookup(v_term);
        if (pcase_var.eql($IRRELEVANT_EVERYWHERE)) {
            return T;
        }
        if (pcase_var.eql($IRRELEVANT_NOWHERE)) {
            return NIL;
        }
        if ((cached_result == $IRRELEVANT_SOMEWHERE) && domain_mt.eql($$InferencePSC)) {
            return T;
        }
        return cached_rkf_irrelevant_fort(v_term, domain_mt);
    }

    /**
     * Remove from TERMS all those deemed irrelevant in DOMAIN-MT
     */
    @LispMethod(comment = "Remove from TERMS all those deemed irrelevant in DOMAIN-MT")
    public static final SubLObject rkf_filter_irrelevant_terms_alt(SubLObject terms, SubLObject domain_mt) {
        {
            SubLObject v_answer = NIL;
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                if (NIL == com.cyc.cycjava.cycl.rkf_relevance_utilities.rkf_irrelevant_term(v_term, domain_mt)) {
                    v_answer = cons(v_term, v_answer);
                }
            }
            return nreverse(v_answer);
        }
    }

    /**
     * Remove from TERMS all those deemed irrelevant in DOMAIN-MT
     */
    @LispMethod(comment = "Remove from TERMS all those deemed irrelevant in DOMAIN-MT")
    public static SubLObject rkf_filter_irrelevant_terms(final SubLObject terms, final SubLObject domain_mt) {
        SubLObject v_answer = NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == rkf_irrelevant_term(v_term, domain_mt)) {
                v_answer = cons(v_term, v_answer);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return nreverse(v_answer);
    }

    public static final SubLObject rkf_irrelevant_term_lambdaP_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return com.cyc.cycjava.cycl.rkf_relevance_utilities.rkf_irrelevant_term(v_term, $rkf_irrelevant_term_lambda_domain_mt$.getDynamicValue(thread));
        }
    }

    public static SubLObject rkf_irrelevant_term_lambdaP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return rkf_irrelevant_term(v_term, $rkf_irrelevant_term_lambda_domain_mt$.getDynamicValue(thread));
    }

    /**
     * FORMULA is deemed irrelevant in DOMAIN-MT
     */
    @LispMethod(comment = "FORMULA is deemed irrelevant in DOMAIN-MT")
    public static final SubLObject rkf_irrelevant_formula_alt(SubLObject formula, SubLObject domain_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $rkf_irrelevant_term_lambda_domain_mt$.currentBinding(thread);
                    try {
                        $rkf_irrelevant_term_lambda_domain_mt$.bind(domain_mt, thread);
                        result = cycl_utilities.expression_find_if($sym11$RKF_IRRELEVANT_TERM_LAMBDA_, formula, UNPROVIDED, UNPROVIDED);
                    } finally {
                        $rkf_irrelevant_term_lambda_domain_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * FORMULA is deemed irrelevant in DOMAIN-MT
     */
    @LispMethod(comment = "FORMULA is deemed irrelevant in DOMAIN-MT")
    public static SubLObject rkf_irrelevant_formula(final SubLObject formula, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $rkf_irrelevant_term_lambda_domain_mt$.currentBinding(thread);
        try {
            $rkf_irrelevant_term_lambda_domain_mt$.bind(domain_mt, thread);
            result = cycl_utilities.expression_find_if($sym10$RKF_IRRELEVANT_TERM_LAMBDA_, formula, UNPROVIDED, UNPROVIDED);
        } finally {
            $rkf_irrelevant_term_lambda_domain_mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Remove from FORMULAS all those deemed irrelevant in DOMAIN-MT
     */
    @LispMethod(comment = "Remove from FORMULAS all those deemed irrelevant in DOMAIN-MT")
    public static final SubLObject rkf_filter_irrelevant_formulas_alt(SubLObject formulas, SubLObject domain_mt) {
        {
            SubLObject v_answer = NIL;
            SubLObject cdolist_list_var = formulas;
            SubLObject formula = NIL;
            for (formula = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , formula = cdolist_list_var.first()) {
                if (NIL == com.cyc.cycjava.cycl.rkf_relevance_utilities.rkf_irrelevant_formula(formula, domain_mt)) {
                    v_answer = cons(formula, v_answer);
                }
            }
            return nreverse(v_answer);
        }
    }

    /**
     * Remove from FORMULAS all those deemed irrelevant in DOMAIN-MT
     */
    @LispMethod(comment = "Remove from FORMULAS all those deemed irrelevant in DOMAIN-MT")
    public static SubLObject rkf_filter_irrelevant_formulas(final SubLObject formulas, final SubLObject domain_mt) {
        SubLObject v_answer = NIL;
        SubLObject cdolist_list_var = formulas;
        SubLObject formula = NIL;
        formula = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == rkf_irrelevant_formula(formula, domain_mt)) {
                v_answer = cons(formula, v_answer);
            }
            cdolist_list_var = cdolist_list_var.rest();
            formula = cdolist_list_var.first();
        } 
        return nreverse(v_answer);
    }

    /**
     * Remove any clauses from FORMULA that are irrelevant, unless they all are.
     *
     * @unknown baxter
     */
    @LispMethod(comment = "Remove any clauses from FORMULA that are irrelevant, unless they all are.\r\n\r\n@unknown baxter")
    public static final SubLObject rkf_remove_irrelevant_clauses_alt(SubLObject formula, SubLObject mt) {
        {
            SubLObject dnfs = clausifier.dnf_clausal_form(formula, mt);
            SubLObject filtered_dnfs = NIL;
            SubLObject cdolist_list_var = dnfs;
            SubLObject dnf = NIL;
            for (dnf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dnf = cdolist_list_var.first()) {
                {
                    SubLObject datum = dnf;
                    SubLObject current = datum;
                    SubLObject neg_lits = NIL;
                    SubLObject pos_lits = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt12);
                    neg_lits = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt12);
                    pos_lits = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject filtered_neg_lits = com.cyc.cycjava.cycl.rkf_relevance_utilities.rkf_filter_irrelevant_formulas(neg_lits, mt);
                            SubLObject filtered_pos_lits = com.cyc.cycjava.cycl.rkf_relevance_utilities.rkf_filter_irrelevant_formulas(pos_lits, mt);
                            if ((NIL != filtered_neg_lits) || (NIL != filtered_pos_lits)) {
                                filtered_dnfs = cons(clauses.make_clause(filtered_neg_lits, filtered_pos_lits), filtered_dnfs);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt12);
                    }
                }
            }
            return NIL != filtered_dnfs ? ((SubLObject) (clauses.dnf_formula_from_clauses(filtered_dnfs))) : formula;
        }
    }

    /**
     * Remove any clauses from FORMULA that are irrelevant, unless they all are.
     *
     * @unknown baxter
     */
    @LispMethod(comment = "Remove any clauses from FORMULA that are irrelevant, unless they all are.\r\n\r\n@unknown baxter")
    public static SubLObject rkf_remove_irrelevant_clauses(final SubLObject formula, final SubLObject mt) {
        final SubLObject dnfs = clausifier.dnf_clausal_form(formula, mt);
        SubLObject filtered_dnfs = NIL;
        SubLObject cdolist_list_var = dnfs;
        SubLObject dnf = NIL;
        dnf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = dnf;
            SubLObject neg_lits = NIL;
            SubLObject pos_lits = NIL;
            destructuring_bind_must_consp(current, datum, $list11);
            neg_lits = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list11);
            pos_lits = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject filtered_neg_lits = rkf_filter_irrelevant_formulas(neg_lits, mt);
                final SubLObject filtered_pos_lits = rkf_filter_irrelevant_formulas(pos_lits, mt);
                if ((NIL != filtered_neg_lits) || (NIL != filtered_pos_lits)) {
                    filtered_dnfs = cons(clauses.make_clause(filtered_neg_lits, filtered_pos_lits), filtered_dnfs);
                }
            } else {
                cdestructuring_bind_error(datum, $list11);
            }
            cdolist_list_var = cdolist_list_var.rest();
            dnf = cdolist_list_var.first();
        } 
        return NIL != filtered_dnfs ? clauses.dnf_formula_from_clauses(filtered_dnfs) : formula;
    }

    /**
     * FORMULA is deemed irrelevant with respect to FORT in DOMAIN-MT
     */
    @LispMethod(comment = "FORMULA is deemed irrelevant with respect to FORT in DOMAIN-MT")
    public static final SubLObject rkf_irrelevant_term_formula_alt(SubLObject fort, SubLObject formula, SubLObject domain_mt) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.rkf_relevance_utilities.rkf_irrelevant_formula(formula, domain_mt)) || (NIL != com.cyc.cycjava.cycl.rkf_relevance_utilities.rkf_quoted_term_formula(fort, formula)));
    }

    @LispMethod(comment = "FORMULA is deemed irrelevant with respect to FORT in DOMAIN-MT")
    public static SubLObject rkf_irrelevant_term_formula(final SubLObject fort, final SubLObject formula, final SubLObject domain_mt) {
        return makeBoolean((NIL != rkf_irrelevant_formula(formula, domain_mt)) || (NIL != rkf_quoted_term_formula(fort, formula)));
    }

    /**
     * Use inference to determine whether FORT is irrelevant everywhere in context space, using PROBLEM-STORE iff valid.
     *
     * @return BOOLEANP.
     */
    @LispMethod(comment = "Use inference to determine whether FORT is irrelevant everywhere in context space, using PROBLEM-STORE iff valid.\r\n\r\n@return BOOLEANP.")
    public static final SubLObject compute_fort_irrelevant_everywhere_status_alt(SubLObject fort, SubLObject problem_store) {
        if (problem_store == UNPROVIDED) {
            problem_store = NIL;
        }
        if (NIL != inference_datastructures_problem_store.valid_problem_store_p(problem_store)) {
            return makeBoolean((NIL != com.cyc.cycjava.cycl.rkf_relevance_utilities.fort_has_pro_irrelevant_argumentP(fort, $$BaseKB, problem_store)) && (NIL == com.cyc.cycjava.cycl.rkf_relevance_utilities.fort_has_con_irrelevant_argumentP(fort, $$InferencePSC, problem_store)));
        } else {
            {
                SubLObject ans = NIL;
                SubLObject store = NIL;
                try {
                    store = inference_datastructures_problem_store.new_problem_store(NIL);
                    ans = com.cyc.cycjava.cycl.rkf_relevance_utilities.compute_fort_irrelevant_everywhere_status(fort, store);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            inference_datastructures_problem_store.destroy_problem_store(store);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                return ans;
            }
        }
    }

    @LispMethod(comment = "Use inference to determine whether FORT is irrelevant everywhere in context space, using PROBLEM-STORE iff valid.\r\n\r\n@return BOOLEANP.")
    public static SubLObject compute_fort_irrelevant_everywhere_status(final SubLObject fort, SubLObject problem_store) {
        if (problem_store == UNPROVIDED) {
            problem_store = NIL;
        }
        if (NIL != inference_datastructures_problem_store.valid_problem_store_p(problem_store)) {
            return makeBoolean((NIL != fort_has_pro_irrelevant_argumentP(fort, $$BaseKB, problem_store)) && (NIL == fort_has_con_irrelevant_argumentP(fort, $$InferencePSC, problem_store)));
        }
        SubLObject ans = NIL;
        SubLObject store = NIL;
        try {
            store = inference_datastructures_problem_store.new_problem_store(NIL);
            ans = compute_fort_irrelevant_everywhere_status(fort, store);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                inference_datastructures_problem_store.destroy_problem_store(store);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return ans;
    }

    /**
     * Use inference to determine whether FORT is irrelevant nowhere in context space, using PROBLEM-STORE iff valid.
     *
     * @return BOOLEANP.
     */
    @LispMethod(comment = "Use inference to determine whether FORT is irrelevant nowhere in context space, using PROBLEM-STORE iff valid.\r\n\r\n@return BOOLEANP.")
    public static final SubLObject compute_fort_irrelevant_nowhere_status_alt(SubLObject fort, SubLObject problem_store) {
        if (problem_store == UNPROVIDED) {
            problem_store = NIL;
        }
        if (NIL != inference_datastructures_problem_store.valid_problem_store_p(problem_store)) {
            return makeBoolean(NIL == com.cyc.cycjava.cycl.rkf_relevance_utilities.fort_has_pro_irrelevant_argumentP(fort, $$InferencePSC, problem_store));
        } else {
            {
                SubLObject ans = NIL;
                SubLObject store = NIL;
                try {
                    store = inference_datastructures_problem_store.new_problem_store(NIL);
                    ans = com.cyc.cycjava.cycl.rkf_relevance_utilities.compute_fort_irrelevant_nowhere_status(fort, store);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            inference_datastructures_problem_store.destroy_problem_store(store);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                return ans;
            }
        }
    }

    /**
     * Use inference to determine whether FORT is irrelevant nowhere in context space, using PROBLEM-STORE iff valid.
     *
     * @return BOOLEANP.
     */
    @LispMethod(comment = "Use inference to determine whether FORT is irrelevant nowhere in context space, using PROBLEM-STORE iff valid.\r\n\r\n@return BOOLEANP.")
    public static SubLObject compute_fort_irrelevant_nowhere_status(final SubLObject fort, SubLObject problem_store) {
        if (problem_store == UNPROVIDED) {
            problem_store = NIL;
        }
        if (NIL != inference_datastructures_problem_store.valid_problem_store_p(problem_store)) {
            return makeBoolean(NIL == fort_has_pro_irrelevant_argumentP(fort, $$InferencePSC, problem_store));
        }
        SubLObject ans = NIL;
        SubLObject store = NIL;
        try {
            store = inference_datastructures_problem_store.new_problem_store(NIL);
            ans = compute_fort_irrelevant_nowhere_status(fort, store);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                inference_datastructures_problem_store.destroy_problem_store(store);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return ans;
    }

    public static final SubLObject clear_cached_rkf_irrelevant_fort_alt() {
        {
            SubLObject cs = $cached_rkf_irrelevant_fort_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_cached_rkf_irrelevant_fort() {
        final SubLObject cs = $cached_rkf_irrelevant_fort_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_cached_rkf_irrelevant_fort_alt(SubLObject fort, SubLObject domain_mt) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_rkf_irrelevant_fort_caching_state$.getGlobalValue(), list(fort, domain_mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_cached_rkf_irrelevant_fort(final SubLObject fort, final SubLObject domain_mt) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_rkf_irrelevant_fort_caching_state$.getGlobalValue(), list(fort, domain_mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cached_rkf_irrelevant_fort_internal_alt(SubLObject fort, SubLObject domain_mt) {
        return makeBoolean((NIL != term.fast_reified_skolemP(fort)) || (NIL != com.cyc.cycjava.cycl.rkf_relevance_utilities.rkf_irrelevant_fort_internal(fort, domain_mt)));
    }

    public static SubLObject cached_rkf_irrelevant_fort_internal(final SubLObject fort, final SubLObject domain_mt) {
        return makeBoolean((NIL != term.fast_reified_skolemP(fort)) || (NIL != rkf_irrelevant_fort_internal(fort, domain_mt)));
    }

    public static final SubLObject cached_rkf_irrelevant_fort_alt(SubLObject fort, SubLObject domain_mt) {
        {
            SubLObject caching_state = $cached_rkf_irrelevant_fort_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(CACHED_RKF_IRRELEVANT_FORT, $cached_rkf_irrelevant_fort_caching_state$, NIL, EQL, TWO_INTEGER, TEN_INTEGER);
                memoization_state.register_isa_dependent_cache_clear_callback(CLEAR_CACHED_RKF_IRRELEVANT_FORT);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(fort, domain_mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (fort.eql(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.eql(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rkf_relevance_utilities.cached_rkf_irrelevant_fort_internal(fort, domain_mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(fort, domain_mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject cached_rkf_irrelevant_fort(final SubLObject fort, final SubLObject domain_mt) {
        SubLObject caching_state = $cached_rkf_irrelevant_fort_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_RKF_IRRELEVANT_FORT, $cached_rkf_irrelevant_fort_caching_state$, NIL, EQL, TWO_INTEGER, TEN_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_CACHED_RKF_IRRELEVANT_FORT);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(fort, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (fort.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(cached_rkf_irrelevant_fort_internal(fort, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(fort, domain_mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject rkf_irrelevant_fort_internal_alt(SubLObject fort, SubLObject domain_mt) {
        {
            SubLObject ans = NIL;
            SubLObject store = NIL;
            try {
                store = inference_datastructures_problem_store.new_problem_store(NIL);
                ans = makeBoolean(((NIL != com.cyc.cycjava.cycl.rkf_relevance_utilities.fort_has_pro_irrelevant_argumentP(fort, domain_mt, store)) && (NIL == com.cyc.cycjava.cycl.rkf_relevance_utilities.fort_has_con_irrelevant_argumentP(fort, domain_mt, store))) || ((NIL != nart_handles.nart_p(fort)) && (NIL != com.cyc.cycjava.cycl.rkf_relevance_utilities.rkf_irrelevant_formula(function_terms.nart_to_naut(fort), domain_mt))));
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        inference_datastructures_problem_store.destroy_problem_store(store);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return ans;
        }
    }

    public static SubLObject rkf_irrelevant_fort_internal(final SubLObject fort, final SubLObject domain_mt) {
        SubLObject ans = NIL;
        SubLObject store = NIL;
        try {
            store = inference_datastructures_problem_store.new_problem_store(NIL);
            ans = makeBoolean(((NIL != fort_has_pro_irrelevant_argumentP(fort, domain_mt, store)) && (NIL == fort_has_con_irrelevant_argumentP(fort, domain_mt, store))) || ((NIL != nart_handles.nart_p(fort)) && (NIL != rkf_irrelevant_formula(function_terms.nart_to_naut(fort), domain_mt))));
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                inference_datastructures_problem_store.destroy_problem_store(store);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return ans;
    }

    public static final SubLObject irrelevance_sentence_for_fort_alt(SubLObject fort) {
        return list($$keIrrelevantTerm, fort);
    }

    public static SubLObject irrelevance_sentence_for_fort(final SubLObject fort) {
        return list($$keIrrelevantTerm, fort);
    }

    public static final SubLObject irrelevance_query_properties_alt(SubLObject problem_store) {
        return list($INFERENCE_MODE, $MINIMAL, $PROBLEM_STORE, problem_store);
    }

    public static SubLObject irrelevance_query_properties(final SubLObject problem_store) {
        return list($INFERENCE_MODE, $MINIMAL, $ALLOWED_MODULES, list($NOT, $REMOVAL_RKF_IRRELEVANT_FORT_CACHE_CHECK_POS), $PROBLEM_STORE, problem_store);
    }

    public static final SubLObject fort_has_pro_irrelevant_argumentP_alt(SubLObject fort, SubLObject domain_mt, SubLObject problem_store) {
        return cyc_kernel.closed_query_success_token_p(inference_kernel.new_cyc_query(com.cyc.cycjava.cycl.rkf_relevance_utilities.irrelevance_sentence_for_fort(fort), domain_mt, com.cyc.cycjava.cycl.rkf_relevance_utilities.irrelevance_query_properties(problem_store)));
    }

    public static SubLObject fort_has_pro_irrelevant_argumentP(final SubLObject fort, final SubLObject domain_mt, final SubLObject problem_store) {
        return cyc_kernel.closed_query_success_token_p(inference_kernel.new_cyc_query(irrelevance_sentence_for_fort(fort), domain_mt, irrelevance_query_properties(problem_store)));
    }

    public static final SubLObject fort_has_con_irrelevant_argumentP_alt(SubLObject fort, SubLObject domain_mt, SubLObject problem_store) {
        return cyc_kernel.closed_query_success_token_p(inference_kernel.new_cyc_query(cycl_utilities.negate(com.cyc.cycjava.cycl.rkf_relevance_utilities.irrelevance_sentence_for_fort(fort)), domain_mt, com.cyc.cycjava.cycl.rkf_relevance_utilities.irrelevance_query_properties(problem_store)));
    }

    public static SubLObject fort_has_con_irrelevant_argumentP(final SubLObject fort, final SubLObject domain_mt, final SubLObject problem_store) {
        return cyc_kernel.closed_query_success_token_p(inference_kernel.new_cyc_query(cycl_utilities.negate(irrelevance_sentence_for_fort(fort)), domain_mt, irrelevance_query_properties(problem_store)));
    }

    public static final SubLObject rkf_quoted_term_formula_alt(SubLObject fort, SubLObject formula) {
        {
            SubLObject predicate = cycl_utilities.formula_operator(formula);
            SubLObject pcase_var = predicate;
            if (pcase_var.eql($$termOfUnit)) {
                return T;
            } else {
                if (pcase_var.eql($$sourceOfTerm)) {
                    return NIL;
                } else {
                    if (pcase_var.eql($$quotedIsa)) {
                        return T;
                    } else {
                        if (NIL != kb_accessors.some_quoted_argumentP(predicate)) {
                            {
                                SubLObject index = ZERO_INTEGER;
                                SubLObject args = cycl_utilities.formula_args(formula, $IGNORE);
                                SubLObject cdolist_list_var = args;
                                SubLObject arg = NIL;
                                for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                                    index = add(index, ONE_INTEGER);
                                    if ((fort == arg) && (NIL != kb_accessors.quoted_argumentP(predicate, index))) {
                                        return T;
                                    }
                                }
                            }
                        }
                        return NIL;
                    }
                }
            }
        }
    }

    public static SubLObject rkf_quoted_term_formula(final SubLObject fort, final SubLObject formula) {
        final SubLObject pcase_var;
        final SubLObject predicate = pcase_var = cycl_utilities.formula_operator(formula);
        if (pcase_var.eql($$termOfUnit)) {
            return T;
        }
        if (pcase_var.eql($$sourceOfTerm)) {
            return NIL;
        }
        if (pcase_var.eql($$quotedIsa)) {
            return T;
        }
        if (NIL != kb_accessors.some_quoted_argumentP(predicate)) {
            SubLObject index = ZERO_INTEGER;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(formula, $IGNORE);
            SubLObject arg = NIL;
            arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                index = add(index, ONE_INTEGER);
                if (fort.eql(arg) && (NIL != kb_accessors.quoted_argumentP(predicate, index))) {
                    return T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject declare_rkf_relevance_utilities_file() {
        declareFunction("rkf_irrelevant_precision_suggestion", "RKF-IRRELEVANT-PRECISION-SUGGESTION", 2, 0, false);
        declareFunction("rkf_irrelevant_precision_suggestion_from", "RKF-IRRELEVANT-PRECISION-SUGGESTION-FROM", 3, 0, false);
        declareFunction("clear_cached_rkf_irrelevant_precision_suggestion_fort", "CLEAR-CACHED-RKF-IRRELEVANT-PRECISION-SUGGESTION-FORT", 0, 0, false);
        declareFunction("remove_cached_rkf_irrelevant_precision_suggestion_fort", "REMOVE-CACHED-RKF-IRRELEVANT-PRECISION-SUGGESTION-FORT", 2, 0, false);
        declareFunction("cached_rkf_irrelevant_precision_suggestion_fort_internal", "CACHED-RKF-IRRELEVANT-PRECISION-SUGGESTION-FORT-INTERNAL", 2, 0, false);
        declareFunction("cached_rkf_irrelevant_precision_suggestion_fort", "CACHED-RKF-IRRELEVANT-PRECISION-SUGGESTION-FORT", 2, 0, false);
        declareFunction("rkf_irrelevant_precision_suggestion_fort_internal", "RKF-IRRELEVANT-PRECISION-SUGGESTION-FORT-INTERNAL", 2, 0, false);
        declareFunction("rkf_irrelevant_precision_suggestion_fort_pairP", "RKF-IRRELEVANT-PRECISION-SUGGESTION-FORT-PAIR?", 3, 0, false);
        declareFunction("rkf_irrelevant_arg_constraint", "RKF-IRRELEVANT-ARG-CONSTRAINT", 2, 0, false);
        declareFunction("clear_cached_rkf_irrelevant_arg_constraint_fort", "CLEAR-CACHED-RKF-IRRELEVANT-ARG-CONSTRAINT-FORT", 0, 0, false);
        declareFunction("remove_cached_rkf_irrelevant_arg_constraint_fort", "REMOVE-CACHED-RKF-IRRELEVANT-ARG-CONSTRAINT-FORT", 2, 0, false);
        declareFunction("cached_rkf_irrelevant_arg_constraint_fort_internal", "CACHED-RKF-IRRELEVANT-ARG-CONSTRAINT-FORT-INTERNAL", 2, 0, false);
        declareFunction("cached_rkf_irrelevant_arg_constraint_fort", "CACHED-RKF-IRRELEVANT-ARG-CONSTRAINT-FORT", 2, 0, false);
        declareFunction("rkf_irrelevant_arg_constraint_fort_internal", "RKF-IRRELEVANT-ARG-CONSTRAINT-FORT-INTERNAL", 2, 0, false);
        declareFunction("rkf_irrelevant_term", "RKF-IRRELEVANT-TERM", 2, 0, false);
        declareFunction("rkf_filter_irrelevant_terms", "RKF-FILTER-IRRELEVANT-TERMS", 2, 0, false);
        declareFunction("rkf_irrelevant_term_lambdaP", "RKF-IRRELEVANT-TERM-LAMBDA?", 1, 0, false);
        declareFunction("rkf_irrelevant_formula", "RKF-IRRELEVANT-FORMULA", 2, 0, false);
        declareFunction("rkf_filter_irrelevant_formulas", "RKF-FILTER-IRRELEVANT-FORMULAS", 2, 0, false);
        declareFunction("rkf_remove_irrelevant_clauses", "RKF-REMOVE-IRRELEVANT-CLAUSES", 2, 0, false);
        declareFunction("rkf_irrelevant_term_formula", "RKF-IRRELEVANT-TERM-FORMULA", 3, 0, false);
        declareFunction("compute_fort_irrelevant_everywhere_status", "COMPUTE-FORT-IRRELEVANT-EVERYWHERE-STATUS", 1, 1, false);
        declareFunction("compute_fort_irrelevant_nowhere_status", "COMPUTE-FORT-IRRELEVANT-NOWHERE-STATUS", 1, 1, false);
        declareFunction("clear_cached_rkf_irrelevant_fort", "CLEAR-CACHED-RKF-IRRELEVANT-FORT", 0, 0, false);
        declareFunction("remove_cached_rkf_irrelevant_fort", "REMOVE-CACHED-RKF-IRRELEVANT-FORT", 2, 0, false);
        declareFunction("cached_rkf_irrelevant_fort_internal", "CACHED-RKF-IRRELEVANT-FORT-INTERNAL", 2, 0, false);
        declareFunction("cached_rkf_irrelevant_fort", "CACHED-RKF-IRRELEVANT-FORT", 2, 0, false);
        declareFunction("rkf_irrelevant_fort_internal", "RKF-IRRELEVANT-FORT-INTERNAL", 2, 0, false);
        declareFunction("irrelevance_sentence_for_fort", "IRRELEVANCE-SENTENCE-FOR-FORT", 1, 0, false);
        declareFunction("irrelevance_query_properties", "IRRELEVANCE-QUERY-PROPERTIES", 1, 0, false);
        declareFunction("fort_has_pro_irrelevant_argumentP", "FORT-HAS-PRO-IRRELEVANT-ARGUMENT?", 3, 0, false);
        declareFunction("fort_has_con_irrelevant_argumentP", "FORT-HAS-CON-IRRELEVANT-ARGUMENT?", 3, 0, false);
        declareFunction("rkf_quoted_term_formula", "RKF-QUOTED-TERM-FORMULA", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_rkf_relevance_utilities_file() {
        deflexical("*CACHED-RKF-IRRELEVANT-PRECISION-SUGGESTION-FORT-CACHING-STATE*", NIL);
        deflexical("*CACHED-RKF-IRRELEVANT-ARG-CONSTRAINT-FORT-CACHING-STATE*", NIL);
        defparameter("*RKF-IRRELEVANT-TERM-LAMBDA-DOMAIN-MT*", NIL);
        deflexical("*CACHED-RKF-IRRELEVANT-FORT-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_rkf_relevance_utilities_file() {
        memoization_state.note_globally_cached_function(CACHED_RKF_IRRELEVANT_PRECISION_SUGGESTION_FORT);
        memoization_state.note_globally_cached_function(CACHED_RKF_IRRELEVANT_ARG_CONSTRAINT_FORT);
        memoization_state.note_globally_cached_function(CACHED_RKF_IRRELEVANT_FORT);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rkf_relevance_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_relevance_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_relevance_utilities_file();
    }

    

    public static final SubLSymbol $kw2$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLSymbol $sym11$RKF_IRRELEVANT_TERM_LAMBDA_ = makeSymbol("RKF-IRRELEVANT-TERM-LAMBDA?");

    static private final SubLList $list_alt12 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));
}

/**
 * Total time: 140 ms
 */
