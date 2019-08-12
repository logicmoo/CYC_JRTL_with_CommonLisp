/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      INFERENCE-COMPLETENESS-UTILITIES
 * source file: /cyc/top/cycl/inference/inference-completeness-utilities.lisp
 * created:     2019/07/03 17:37:37
 */
public final class inference_completeness_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new inference_completeness_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.inference.inference_completeness_utilities";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLSymbol $sym0$INFERENCE_MINIMIZE_EXTENT_ = makeSymbol("INFERENCE-MINIMIZE-EXTENT?");

    private static final SubLSymbol INFERENCE_COMPLETE_EXTENT_ASSERTED_FOR_VALUE_IN_ARG_GAFS = makeSymbol("INFERENCE-COMPLETE-EXTENT-ASSERTED-FOR-VALUE-IN-ARG-GAFS");

    private static final SubLInteger $int$8192 = makeInteger(8192);

    private static final SubLSymbol INFERENCE_COMPLETE_EXTENT_ENUMERABLE_GAFS = makeSymbol("INFERENCE-COMPLETE-EXTENT-ENUMERABLE-GAFS");

    private static final SubLSymbol INFERENCE_COMPLETE_EXTENT_DECIDABLE_GAFS = makeSymbol("INFERENCE-COMPLETE-EXTENT-DECIDABLE-GAFS");

    private static final SubLSymbol INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_ARG_GAFS = makeSymbol("INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-ARG-GAFS");

    private static final SubLSymbol INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_VALUE_IN_ARG_GAFS = makeSymbol("INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-VALUE-IN-ARG-GAFS");

    private static final SubLSymbol INFERENCE_COMPLETE_EXTENT_DECIDABLE_FOR_VALUE_IN_ARG_GAFS = makeSymbol("INFERENCE-COMPLETE-EXTENT-DECIDABLE-FOR-VALUE-IN-ARG-GAFS");

    private static final SubLSymbol INFERENCE_COMPLETELY_DECIDABLE_COLLECTION_GAFS = makeSymbol("INFERENCE-COMPLETELY-DECIDABLE-COLLECTION-GAFS");



    private static final SubLSymbol INFERENCE_COMPLETE_EXTENT_ENUMERABLE_VIA_BACKCHAIN_GAFS = makeSymbol("INFERENCE-COMPLETE-EXTENT-ENUMERABLE-VIA-BACKCHAIN-GAFS");

    // Definitions
    public static final SubLObject inference_minimize_extentP_internal_alt(SubLObject predicate) {
        return kb_accessors.minimize_extent(predicate, UNPROVIDED);
    }

    // Definitions
    public static SubLObject inference_minimize_extentP_internal(final SubLObject predicate) {
        return kb_accessors.minimize_extent(predicate, UNPROVIDED);
    }

    public static final SubLObject inference_minimize_extentP_alt(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_minimize_extentP_internal(predicate);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym0$INFERENCE_MINIMIZE_EXTENT_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym0$INFERENCE_MINIMIZE_EXTENT_, ONE_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym0$INFERENCE_MINIMIZE_EXTENT_, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, $kw1$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw1$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_minimize_extentP_internal(predicate)));
                        memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject inference_minimize_extentP(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_minimize_extentP_internal(predicate);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym0$INFERENCE_MINIMIZE_EXTENT_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym0$INFERENCE_MINIMIZE_EXTENT_, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym0$INFERENCE_MINIMIZE_EXTENT_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(inference_minimize_extentP_internal(predicate)));
            memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     *
     *
     * @return booleanp; whether PREDICATE's extent is completely asserted in MT and its genlMts.
     */
    @LispMethod(comment = "@return booleanp; whether PREDICATE\'s extent is completely asserted in MT and its genlMts.")
    public static final SubLObject inference_complete_extent_assertedP_alt(SubLObject predicate, SubLObject mt) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_asserted_gaf(predicate, mt));
    }

    /**
     *
     *
     * @return booleanp; whether PREDICATE's extent is completely asserted in MT and its genlMts.
     */
    @LispMethod(comment = "@return booleanp; whether PREDICATE\'s extent is completely asserted in MT and its genlMts.")
    public static SubLObject inference_complete_extent_assertedP(final SubLObject predicate, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_complete_extent_asserted_gaf(predicate, mt));
    }

    /**
     *
     *
     * @return nil or gaf-assertion?; a gaf assertion justifying
    the fact that PREDICATE's extent is completely asserted in MT and its genlMts.
    If there is more than one such assertion, the inferentially strongest one will be returned.
     */
    @LispMethod(comment = "@return nil or gaf-assertion?; a gaf assertion justifying\r\nthe fact that PREDICATE\'s extent is completely asserted in MT and its genlMts.\r\nIf there is more than one such assertion, the inferentially strongest one will be returned.")
    public static final SubLObject inference_complete_extent_asserted_gaf_alt(SubLObject predicate, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            mt = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.completeness_constraint_mt(mt);
            {
                SubLObject gaf = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        gaf = kb_accessors.complete_extent_asserted_gaf(predicate, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return gaf;
            }
        }
    }

    /**
     *
     *
     * @return nil or gaf-assertion?; a gaf assertion justifying
    the fact that PREDICATE's extent is completely asserted in MT and its genlMts.
    If there is more than one such assertion, the inferentially strongest one will be returned.
     */
    @LispMethod(comment = "@return nil or gaf-assertion?; a gaf assertion justifying\r\nthe fact that PREDICATE\'s extent is completely asserted in MT and its genlMts.\r\nIf there is more than one such assertion, the inferentially strongest one will be returned.")
    public static SubLObject inference_complete_extent_asserted_gaf(final SubLObject predicate, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = completeness_constraint_mt(mt);
        SubLObject gaf = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            gaf = kb_accessors.complete_extent_asserted_gaf(predicate, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return gaf;
    }

    /**
     *
     *
     * @return booleanp; whether PREDICATE's extent for VALUE in ARGNUM is completely asserted in MT and its genlMts.
     */
    @LispMethod(comment = "@return booleanp; whether PREDICATE\'s extent for VALUE in ARGNUM is completely asserted in MT and its genlMts.")
    public static final SubLObject inference_complete_extent_asserted_for_value_in_argP_alt(SubLObject predicate, SubLObject value, SubLObject argnum, SubLObject mt) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_asserted_for_value_in_arg_gaf(predicate, value, argnum, mt));
    }

    /**
     *
     *
     * @return booleanp; whether PREDICATE's extent for VALUE in ARGNUM is completely asserted in MT and its genlMts.
     */
    @LispMethod(comment = "@return booleanp; whether PREDICATE\'s extent for VALUE in ARGNUM is completely asserted in MT and its genlMts.")
    public static SubLObject inference_complete_extent_asserted_for_value_in_argP(final SubLObject predicate, final SubLObject value, final SubLObject argnum, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_complete_extent_asserted_for_value_in_arg_gaf(predicate, value, argnum, mt));
    }

    /**
     *
     *
     * @return nil or gaf-assertion?; a gaf assertion justifying
    the fact that PREDICATE's extent for VALUE in ARGNUM is completely asserted in MT and its genlMts.
    If there is more than one such assertion, the inferentially strongest one will be returned.
     */
    @LispMethod(comment = "@return nil or gaf-assertion?; a gaf assertion justifying\r\nthe fact that PREDICATE\'s extent for VALUE in ARGNUM is completely asserted in MT and its genlMts.\r\nIf there is more than one such assertion, the inferentially strongest one will be returned.")
    public static final SubLObject inference_complete_extent_asserted_for_value_in_arg_gaf_alt(SubLObject predicate, SubLObject value, SubLObject argnum, SubLObject mt) {
        return com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_asserted_for_value_in_arg_gafs(predicate, value, argnum, mt).first();
    }

    /**
     *
     *
     * @return nil or gaf-assertion?; a gaf assertion justifying
    the fact that PREDICATE's extent for VALUE in ARGNUM is completely asserted in MT and its genlMts.
    If there is more than one such assertion, the inferentially strongest one will be returned.
     */
    @LispMethod(comment = "@return nil or gaf-assertion?; a gaf assertion justifying\r\nthe fact that PREDICATE\'s extent for VALUE in ARGNUM is completely asserted in MT and its genlMts.\r\nIf there is more than one such assertion, the inferentially strongest one will be returned.")
    public static SubLObject inference_complete_extent_asserted_for_value_in_arg_gaf(final SubLObject predicate, final SubLObject value, final SubLObject argnum, final SubLObject mt) {
        return inference_complete_extent_asserted_for_value_in_arg_gafs(predicate, value, argnum, mt).first();
    }

    /**
     *
     *
     * @return list of gaf-assertion?; a list of gaf assertions, each of which independently
    justify the fact that PREDICATE's extent for VALUE in ARGNUM is completely asserted in MT and its genlMts.
    The list of assertions is returned in a partial order of strength, with the inferentially
    strongest assertion first.
     */
    @LispMethod(comment = "@return list of gaf-assertion?; a list of gaf assertions, each of which independently\r\njustify the fact that PREDICATE\'s extent for VALUE in ARGNUM is completely asserted in MT and its genlMts.\r\nThe list of assertions is returned in a partial order of strength, with the inferentially\r\nstrongest assertion first.")
    public static final SubLObject inference_complete_extent_asserted_for_value_in_arg_gafs_internal_alt(SubLObject predicate, SubLObject value, SubLObject argnum, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            mt = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.completeness_constraint_mt(mt);
            {
                SubLObject gafs = NIL;
                {
                    SubLObject stronger_gaf = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_asserted_gaf(predicate, mt);
                    SubLObject var = stronger_gaf;
                    if (NIL != var) {
                        gafs = cons(var, gafs);
                    }
                }
                {
                    SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            {
                                SubLObject gaf = kb_accessors.complete_extent_asserted_for_value_in_arg_gaf(predicate, value, argnum, UNPROVIDED);
                                SubLObject var = gaf;
                                if (NIL != var) {
                                    gafs = cons(var, gafs);
                                }
                            }
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return nreverse(gafs);
            }
        }
    }

    /**
     *
     *
     * @return list of gaf-assertion?; a list of gaf assertions, each of which independently
    justify the fact that PREDICATE's extent for VALUE in ARGNUM is completely asserted in MT and its genlMts.
    The list of assertions is returned in a partial order of strength, with the inferentially
    strongest assertion first.
     */
    @LispMethod(comment = "@return list of gaf-assertion?; a list of gaf assertions, each of which independently\r\njustify the fact that PREDICATE\'s extent for VALUE in ARGNUM is completely asserted in MT and its genlMts.\r\nThe list of assertions is returned in a partial order of strength, with the inferentially\r\nstrongest assertion first.")
    public static SubLObject inference_complete_extent_asserted_for_value_in_arg_gafs_internal(final SubLObject predicate, final SubLObject value, final SubLObject argnum, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = completeness_constraint_mt(mt);
        SubLObject gafs = NIL;
        final SubLObject var;
        final SubLObject stronger_gaf = var = inference_complete_extent_asserted_gaf(predicate, mt);
        if (NIL != var) {
            gafs = cons(var, gafs);
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject var2;
            final SubLObject gaf = var2 = kb_accessors.complete_extent_asserted_for_value_in_arg_gaf(predicate, value, argnum, UNPROVIDED);
            if (NIL != var2) {
                gafs = cons(var2, gafs);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return nreverse(gafs);
    }

    public static final SubLObject inference_complete_extent_asserted_for_value_in_arg_gafs_alt(SubLObject predicate, SubLObject value, SubLObject argnum, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_asserted_for_value_in_arg_gafs_internal(predicate, value, argnum, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_COMPLETE_EXTENT_ASSERTED_FOR_VALUE_IN_ARG_GAFS, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_COMPLETE_EXTENT_ASSERTED_FOR_VALUE_IN_ARG_GAFS, FOUR_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, INFERENCE_COMPLETE_EXTENT_ASSERTED_FOR_VALUE_IN_ARG_GAFS, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_4(predicate, value, argnum, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw1$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (predicate == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (value == cached_args.first()) {
                                            cached_args = cached_args.rest();
                                            if (argnum == cached_args.first()) {
                                                cached_args = cached_args.rest();
                                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && (mt == cached_args.first())) {
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
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_asserted_for_value_in_arg_gafs_internal(predicate, value, argnum, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicate, value, argnum, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject inference_complete_extent_asserted_for_value_in_arg_gafs(final SubLObject predicate, final SubLObject value, final SubLObject argnum, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_complete_extent_asserted_for_value_in_arg_gafs_internal(predicate, value, argnum, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_COMPLETE_EXTENT_ASSERTED_FOR_VALUE_IN_ARG_GAFS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_COMPLETE_EXTENT_ASSERTED_FOR_VALUE_IN_ARG_GAFS, FOUR_INTEGER, $int$8192, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_COMPLETE_EXTENT_ASSERTED_FOR_VALUE_IN_ARG_GAFS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(predicate, value, argnum, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (predicate.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (value.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (argnum.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_complete_extent_asserted_for_value_in_arg_gafs_internal(predicate, value, argnum, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate, value, argnum, mt));
        return memoization_state.caching_results(results3);
    }

    /**
     *
     *
     * @return booleanp; whether PREDICATE's extent is completely enumerable in MT.
     */
    @LispMethod(comment = "@return booleanp; whether PREDICATE\'s extent is completely enumerable in MT.")
    public static final SubLObject inference_complete_extent_enumerableP_alt(SubLObject predicate, SubLObject mt) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_enumerable_gaf(predicate, mt));
    }

    /**
     *
     *
     * @return booleanp; whether PREDICATE's extent is completely enumerable in MT.
     */
    @LispMethod(comment = "@return booleanp; whether PREDICATE\'s extent is completely enumerable in MT.")
    public static SubLObject inference_complete_extent_enumerableP(final SubLObject predicate, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_complete_extent_enumerable_gaf(predicate, mt));
    }

    /**
     *
     *
     * @return nil or gaf-assertion?; a gaf assertion justifying
    the fact that PREDICATE's extent is completely enumerable in MT.
    If there is more than one such assertion, the inferentially strongest one will be returned.
     */
    @LispMethod(comment = "@return nil or gaf-assertion?; a gaf assertion justifying\r\nthe fact that PREDICATE\'s extent is completely enumerable in MT.\r\nIf there is more than one such assertion, the inferentially strongest one will be returned.")
    public static final SubLObject inference_complete_extent_enumerable_gaf_alt(SubLObject predicate, SubLObject mt) {
        return com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_enumerable_gafs(predicate, mt).first();
    }

    /**
     *
     *
     * @return nil or gaf-assertion?; a gaf assertion justifying
    the fact that PREDICATE's extent is completely enumerable in MT.
    If there is more than one such assertion, the inferentially strongest one will be returned.
     */
    @LispMethod(comment = "@return nil or gaf-assertion?; a gaf assertion justifying\r\nthe fact that PREDICATE\'s extent is completely enumerable in MT.\r\nIf there is more than one such assertion, the inferentially strongest one will be returned.")
    public static SubLObject inference_complete_extent_enumerable_gaf(final SubLObject predicate, final SubLObject mt) {
        return inference_complete_extent_enumerable_gafs(predicate, mt).first();
    }

    /**
     *
     *
     * @return list of gaf-assertion?; a list of gaf assertions, each of which independently
    justify the fact that PREDICATE's extent is completely enumerable in MT.
    The list of assertions is returned in a partial order of strength, with the inferentially
    strongest assertion first.
     */
    @LispMethod(comment = "@return list of gaf-assertion?; a list of gaf assertions, each of which independently\r\njustify the fact that PREDICATE\'s extent is completely enumerable in MT.\r\nThe list of assertions is returned in a partial order of strength, with the inferentially\r\nstrongest assertion first.")
    public static final SubLObject inference_complete_extent_enumerable_gafs_internal_alt(SubLObject predicate, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            mt = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.completeness_constraint_mt(mt);
            {
                SubLObject gafs = NIL;
                {
                    SubLObject stronger_gaf = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_asserted_gaf(predicate, mt);
                    SubLObject var = stronger_gaf;
                    if (NIL != var) {
                        gafs = cons(var, gafs);
                    }
                }
                {
                    SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            {
                                SubLObject gaf = kb_accessors.complete_extent_enumerable_gaf(predicate, UNPROVIDED);
                                SubLObject var = gaf;
                                if (NIL != var) {
                                    gafs = cons(var, gafs);
                                }
                            }
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return nreverse(gafs);
            }
        }
    }

    /**
     *
     *
     * @return list of gaf-assertion?; a list of gaf assertions, each of which independently
    justify the fact that PREDICATE's extent is completely enumerable in MT.
    The list of assertions is returned in a partial order of strength, with the inferentially
    strongest assertion first.
     */
    @LispMethod(comment = "@return list of gaf-assertion?; a list of gaf assertions, each of which independently\r\njustify the fact that PREDICATE\'s extent is completely enumerable in MT.\r\nThe list of assertions is returned in a partial order of strength, with the inferentially\r\nstrongest assertion first.")
    public static SubLObject inference_complete_extent_enumerable_gafs_internal(final SubLObject predicate, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = completeness_constraint_mt(mt);
        SubLObject gafs = NIL;
        final SubLObject var;
        final SubLObject stronger_gaf = var = inference_complete_extent_asserted_gaf(predicate, mt);
        if (NIL != var) {
            gafs = cons(var, gafs);
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject var2;
            final SubLObject gaf = var2 = kb_accessors.complete_extent_enumerable_gaf(predicate, UNPROVIDED);
            if (NIL != var2) {
                gafs = cons(var2, gafs);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return nreverse(gafs);
    }

    public static final SubLObject inference_complete_extent_enumerable_gafs_alt(SubLObject predicate, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_enumerable_gafs_internal(predicate, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_COMPLETE_EXTENT_ENUMERABLE_GAFS, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_COMPLETE_EXTENT_ENUMERABLE_GAFS, TWO_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, INFERENCE_COMPLETE_EXTENT_ENUMERABLE_GAFS, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw1$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (predicate == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (mt == cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_enumerable_gafs_internal(predicate, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicate, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject inference_complete_extent_enumerable_gafs(final SubLObject predicate, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_complete_extent_enumerable_gafs_internal(predicate, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_COMPLETE_EXTENT_ENUMERABLE_GAFS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_COMPLETE_EXTENT_ENUMERABLE_GAFS, TWO_INTEGER, $int$8192, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_COMPLETE_EXTENT_ENUMERABLE_GAFS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (predicate.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_complete_extent_enumerable_gafs_internal(predicate, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate, mt));
        return memoization_state.caching_results(results3);
    }

    /**
     *
     *
     * @return booleanp; whether PREDICATE's extent is completely decidable in MT.
     */
    @LispMethod(comment = "@return booleanp; whether PREDICATE\'s extent is completely decidable in MT.")
    public static final SubLObject inference_complete_extent_decidableP_alt(SubLObject predicate, SubLObject mt) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_decidable_gaf(predicate, mt));
    }

    /**
     *
     *
     * @return booleanp; whether PREDICATE's extent is completely decidable in MT.
     */
    @LispMethod(comment = "@return booleanp; whether PREDICATE\'s extent is completely decidable in MT.")
    public static SubLObject inference_complete_extent_decidableP(final SubLObject predicate, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_complete_extent_decidable_gaf(predicate, mt));
    }

    /**
     *
     *
     * @return nil or gaf-assertion?; a gaf assertion justifying
    the fact that PREDICATE's extent is completely decidable in MT.
    If there is more than one such assertion, the inferentially strongest one will be returned.
     */
    @LispMethod(comment = "@return nil or gaf-assertion?; a gaf assertion justifying\r\nthe fact that PREDICATE\'s extent is completely decidable in MT.\r\nIf there is more than one such assertion, the inferentially strongest one will be returned.")
    public static final SubLObject inference_complete_extent_decidable_gaf_alt(SubLObject predicate, SubLObject mt) {
        return com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_decidable_gafs(predicate, mt).first();
    }

    /**
     *
     *
     * @return nil or gaf-assertion?; a gaf assertion justifying
    the fact that PREDICATE's extent is completely decidable in MT.
    If there is more than one such assertion, the inferentially strongest one will be returned.
     */
    @LispMethod(comment = "@return nil or gaf-assertion?; a gaf assertion justifying\r\nthe fact that PREDICATE\'s extent is completely decidable in MT.\r\nIf there is more than one such assertion, the inferentially strongest one will be returned.")
    public static SubLObject inference_complete_extent_decidable_gaf(final SubLObject predicate, final SubLObject mt) {
        return inference_complete_extent_decidable_gafs(predicate, mt).first();
    }

    /**
     *
     *
     * @return list of gaf-assertion?; a list of gaf assertions, each of which independently
    justify the fact that PREDICATE's extent is completely decidable in MT.
    The list of assertions is returned in a partial order of strength, with the inferentially
    strongest assertion first.
     */
    @LispMethod(comment = "@return list of gaf-assertion?; a list of gaf assertions, each of which independently\r\njustify the fact that PREDICATE\'s extent is completely decidable in MT.\r\nThe list of assertions is returned in a partial order of strength, with the inferentially\r\nstrongest assertion first.")
    public static final SubLObject inference_complete_extent_decidable_gafs_internal_alt(SubLObject predicate, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            mt = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.completeness_constraint_mt(mt);
            {
                SubLObject gafs = NIL;
                SubLObject stronger_gafs = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_enumerable_gafs(predicate, mt);
                SubLObject cdolist_list_var = stronger_gafs;
                SubLObject stronger_gaf = NIL;
                for (stronger_gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , stronger_gaf = cdolist_list_var.first()) {
                    gafs = cons(stronger_gaf, gafs);
                }
                {
                    SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            {
                                SubLObject gaf = kb_accessors.complete_extent_decidable_gaf(predicate, UNPROVIDED);
                                SubLObject var = gaf;
                                if (NIL != var) {
                                    gafs = cons(var, gafs);
                                }
                            }
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return nreverse(gafs);
            }
        }
    }

    /**
     *
     *
     * @return list of gaf-assertion?; a list of gaf assertions, each of which independently
    justify the fact that PREDICATE's extent is completely decidable in MT.
    The list of assertions is returned in a partial order of strength, with the inferentially
    strongest assertion first.
     */
    @LispMethod(comment = "@return list of gaf-assertion?; a list of gaf assertions, each of which independently\r\njustify the fact that PREDICATE\'s extent is completely decidable in MT.\r\nThe list of assertions is returned in a partial order of strength, with the inferentially\r\nstrongest assertion first.")
    public static SubLObject inference_complete_extent_decidable_gafs_internal(final SubLObject predicate, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = completeness_constraint_mt(mt);
        SubLObject gafs = NIL;
        SubLObject cdolist_list_var;
        final SubLObject stronger_gafs = cdolist_list_var = inference_complete_extent_enumerable_gafs(predicate, mt);
        SubLObject stronger_gaf = NIL;
        stronger_gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            gafs = cons(stronger_gaf, gafs);
            cdolist_list_var = cdolist_list_var.rest();
            stronger_gaf = cdolist_list_var.first();
        } 
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject var;
            final SubLObject gaf = var = kb_accessors.complete_extent_decidable_gaf(predicate, UNPROVIDED);
            if (NIL != var) {
                gafs = cons(var, gafs);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return nreverse(gafs);
    }

    public static final SubLObject inference_complete_extent_decidable_gafs_alt(SubLObject predicate, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_decidable_gafs_internal(predicate, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_COMPLETE_EXTENT_DECIDABLE_GAFS, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_COMPLETE_EXTENT_DECIDABLE_GAFS, TWO_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, INFERENCE_COMPLETE_EXTENT_DECIDABLE_GAFS, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw1$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (predicate == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (mt == cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_decidable_gafs_internal(predicate, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicate, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject inference_complete_extent_decidable_gafs(final SubLObject predicate, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_complete_extent_decidable_gafs_internal(predicate, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_COMPLETE_EXTENT_DECIDABLE_GAFS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_COMPLETE_EXTENT_DECIDABLE_GAFS, TWO_INTEGER, $int$8192, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_COMPLETE_EXTENT_DECIDABLE_GAFS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (predicate.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_complete_extent_decidable_gafs_internal(predicate, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate, mt));
        return memoization_state.caching_results(results3);
    }

    /**
     *
     *
     * @return booleanp; whether PREDICATE's extent is completely enumerable for ARGNUM in MT.
     */
    @LispMethod(comment = "@return booleanp; whether PREDICATE\'s extent is completely enumerable for ARGNUM in MT.")
    public static final SubLObject inference_complete_extent_enumerable_for_argP_alt(SubLObject predicate, SubLObject argnum, SubLObject mt) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_enumerable_for_arg_gaf(predicate, argnum, mt));
    }

    /**
     *
     *
     * @return booleanp; whether PREDICATE's extent is completely enumerable for ARGNUM in MT.
     */
    @LispMethod(comment = "@return booleanp; whether PREDICATE\'s extent is completely enumerable for ARGNUM in MT.")
    public static SubLObject inference_complete_extent_enumerable_for_argP(final SubLObject predicate, final SubLObject argnum, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_complete_extent_enumerable_for_arg_gaf(predicate, argnum, mt));
    }

    /**
     *
     *
     * @return nil or gaf-assertion?; a gaf assertion justifying
    the fact that PREDICATE's extent is completely enumerable for ARGNUM in MT.
    If there is more than one such assertion, the inferentially strongest one will be returned.
     */
    @LispMethod(comment = "@return nil or gaf-assertion?; a gaf assertion justifying\r\nthe fact that PREDICATE\'s extent is completely enumerable for ARGNUM in MT.\r\nIf there is more than one such assertion, the inferentially strongest one will be returned.")
    public static final SubLObject inference_complete_extent_enumerable_for_arg_gaf_alt(SubLObject predicate, SubLObject argnum, SubLObject mt) {
        return com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_enumerable_for_arg_gafs(predicate, argnum, mt).first();
    }

    /**
     *
     *
     * @return nil or gaf-assertion?; a gaf assertion justifying
    the fact that PREDICATE's extent is completely enumerable for ARGNUM in MT.
    If there is more than one such assertion, the inferentially strongest one will be returned.
     */
    @LispMethod(comment = "@return nil or gaf-assertion?; a gaf assertion justifying\r\nthe fact that PREDICATE\'s extent is completely enumerable for ARGNUM in MT.\r\nIf there is more than one such assertion, the inferentially strongest one will be returned.")
    public static SubLObject inference_complete_extent_enumerable_for_arg_gaf(final SubLObject predicate, final SubLObject argnum, final SubLObject mt) {
        return inference_complete_extent_enumerable_for_arg_gafs(predicate, argnum, mt).first();
    }

    /**
     *
     *
     * @return list of gaf-assertion?; a list of gaf assertions, each of which independently
    justify the fact that PREDICATE's extent is completely enumerable for ARGNUM in MT.
    The list of assertions is returned in a partial order of strength, with the inferentially
    strongest assertion first.
     */
    @LispMethod(comment = "@return list of gaf-assertion?; a list of gaf assertions, each of which independently\r\njustify the fact that PREDICATE\'s extent is completely enumerable for ARGNUM in MT.\r\nThe list of assertions is returned in a partial order of strength, with the inferentially\r\nstrongest assertion first.")
    public static final SubLObject inference_complete_extent_enumerable_for_arg_gafs_internal_alt(SubLObject predicate, SubLObject argnum, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            mt = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.completeness_constraint_mt(mt);
            {
                SubLObject gafs = NIL;
                SubLObject stronger_gafs = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_enumerable_gafs(predicate, mt);
                SubLObject cdolist_list_var = stronger_gafs;
                SubLObject stronger_gaf = NIL;
                for (stronger_gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , stronger_gaf = cdolist_list_var.first()) {
                    gafs = cons(stronger_gaf, gafs);
                }
                {
                    SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            {
                                SubLObject gaf = kb_accessors.complete_extent_enumerable_for_arg_gaf(predicate, argnum, UNPROVIDED);
                                SubLObject var = gaf;
                                if (NIL != var) {
                                    gafs = cons(var, gafs);
                                }
                            }
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return nreverse(gafs);
            }
        }
    }

    /**
     *
     *
     * @return list of gaf-assertion?; a list of gaf assertions, each of which independently
    justify the fact that PREDICATE's extent is completely enumerable for ARGNUM in MT.
    The list of assertions is returned in a partial order of strength, with the inferentially
    strongest assertion first.
     */
    @LispMethod(comment = "@return list of gaf-assertion?; a list of gaf assertions, each of which independently\r\njustify the fact that PREDICATE\'s extent is completely enumerable for ARGNUM in MT.\r\nThe list of assertions is returned in a partial order of strength, with the inferentially\r\nstrongest assertion first.")
    public static SubLObject inference_complete_extent_enumerable_for_arg_gafs_internal(final SubLObject predicate, final SubLObject argnum, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = completeness_constraint_mt(mt);
        SubLObject gafs = NIL;
        SubLObject cdolist_list_var;
        final SubLObject stronger_gafs = cdolist_list_var = inference_complete_extent_enumerable_gafs(predicate, mt);
        SubLObject stronger_gaf = NIL;
        stronger_gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            gafs = cons(stronger_gaf, gafs);
            cdolist_list_var = cdolist_list_var.rest();
            stronger_gaf = cdolist_list_var.first();
        } 
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject var;
            final SubLObject gaf = var = kb_accessors.complete_extent_enumerable_for_arg_gaf(predicate, argnum, UNPROVIDED);
            if (NIL != var) {
                gafs = cons(var, gafs);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return nreverse(gafs);
    }

    public static final SubLObject inference_complete_extent_enumerable_for_arg_gafs_alt(SubLObject predicate, SubLObject argnum, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_enumerable_for_arg_gafs_internal(predicate, argnum, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_ARG_GAFS, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_ARG_GAFS, THREE_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_ARG_GAFS, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(predicate, argnum, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw1$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (predicate == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (argnum == cached_args.first()) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && (mt == cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_enumerable_for_arg_gafs_internal(predicate, argnum, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicate, argnum, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject inference_complete_extent_enumerable_for_arg_gafs(final SubLObject predicate, final SubLObject argnum, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_complete_extent_enumerable_for_arg_gafs_internal(predicate, argnum, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_ARG_GAFS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_ARG_GAFS, THREE_INTEGER, $int$8192, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_ARG_GAFS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(predicate, argnum, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (predicate.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (argnum.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_complete_extent_enumerable_for_arg_gafs_internal(predicate, argnum, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate, argnum, mt));
        return memoization_state.caching_results(results3);
    }

    /**
     *
     *
     * @return booleanp; whether PREDICATE's extent is completely enumerable for VALUE in ARGNUM in MT.
     */
    @LispMethod(comment = "@return booleanp; whether PREDICATE\'s extent is completely enumerable for VALUE in ARGNUM in MT.")
    public static final SubLObject inference_complete_extent_enumerable_for_value_in_argP_alt(SubLObject predicate, SubLObject value, SubLObject argnum, SubLObject mt) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_enumerable_for_value_in_arg_gaf(predicate, value, argnum, mt));
    }

    /**
     *
     *
     * @return booleanp; whether PREDICATE's extent is completely enumerable for VALUE in ARGNUM in MT.
     */
    @LispMethod(comment = "@return booleanp; whether PREDICATE\'s extent is completely enumerable for VALUE in ARGNUM in MT.")
    public static SubLObject inference_complete_extent_enumerable_for_value_in_argP(final SubLObject predicate, final SubLObject value, final SubLObject argnum, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_complete_extent_enumerable_for_value_in_arg_gaf(predicate, value, argnum, mt));
    }

    /**
     *
     *
     * @return nil or gaf-assertion?; a gaf assertion justifying
    the fact that PREDICATE's extent is completely enumerable for VALUE in ARGNUM in MT.
    If there is more than one such assertion, the inferentially strongest one will be returned.
     */
    @LispMethod(comment = "@return nil or gaf-assertion?; a gaf assertion justifying\r\nthe fact that PREDICATE\'s extent is completely enumerable for VALUE in ARGNUM in MT.\r\nIf there is more than one such assertion, the inferentially strongest one will be returned.")
    public static final SubLObject inference_complete_extent_enumerable_for_value_in_arg_gaf_alt(SubLObject predicate, SubLObject value, SubLObject argnum, SubLObject mt) {
        return com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_enumerable_for_value_in_arg_gafs(predicate, value, argnum, mt).first();
    }

    /**
     *
     *
     * @return nil or gaf-assertion?; a gaf assertion justifying
    the fact that PREDICATE's extent is completely enumerable for VALUE in ARGNUM in MT.
    If there is more than one such assertion, the inferentially strongest one will be returned.
     */
    @LispMethod(comment = "@return nil or gaf-assertion?; a gaf assertion justifying\r\nthe fact that PREDICATE\'s extent is completely enumerable for VALUE in ARGNUM in MT.\r\nIf there is more than one such assertion, the inferentially strongest one will be returned.")
    public static SubLObject inference_complete_extent_enumerable_for_value_in_arg_gaf(final SubLObject predicate, final SubLObject value, final SubLObject argnum, final SubLObject mt) {
        return inference_complete_extent_enumerable_for_value_in_arg_gafs(predicate, value, argnum, mt).first();
    }

    /**
     *
     *
     * @return list of gaf-assertion?; a list of gaf assertions, each of which independently
    justify the fact that PREDICATE's extent is completely enumerable for VALUE in ARGNUM in MT.
    The list of assertions is returned in a partial order of strength, with the inferentially
    strongest assertion first.
     */
    @LispMethod(comment = "@return list of gaf-assertion?; a list of gaf assertions, each of which independently\r\njustify the fact that PREDICATE\'s extent is completely enumerable for VALUE in ARGNUM in MT.\r\nThe list of assertions is returned in a partial order of strength, with the inferentially\r\nstrongest assertion first.")
    public static final SubLObject inference_complete_extent_enumerable_for_value_in_arg_gafs_internal_alt(SubLObject predicate, SubLObject value, SubLObject argnum, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            mt = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.completeness_constraint_mt(mt);
            {
                SubLObject gafs = NIL;
                {
                    SubLObject stronger_gafs = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_asserted_for_value_in_arg_gafs(predicate, value, argnum, mt);
                    SubLObject cdolist_list_var = stronger_gafs;
                    SubLObject stronger_gaf = NIL;
                    for (stronger_gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , stronger_gaf = cdolist_list_var.first()) {
                        gafs = cons(stronger_gaf, gafs);
                    }
                }
                {
                    SubLObject stronger_gafs = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_enumerable_for_arg_gafs(predicate, argnum, mt);
                    SubLObject cdolist_list_var = stronger_gafs;
                    SubLObject stronger_gaf = NIL;
                    for (stronger_gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , stronger_gaf = cdolist_list_var.first()) {
                        gafs = cons(stronger_gaf, gafs);
                    }
                }
                {
                    SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            {
                                SubLObject gaf = kb_accessors.complete_extent_enumerable_for_value_in_arg_gaf(predicate, value, argnum, UNPROVIDED);
                                SubLObject var = gaf;
                                if (NIL != var) {
                                    gafs = cons(var, gafs);
                                }
                            }
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return nreverse(gafs);
            }
        }
    }

    /**
     *
     *
     * @return list of gaf-assertion?; a list of gaf assertions, each of which independently
    justify the fact that PREDICATE's extent is completely enumerable for VALUE in ARGNUM in MT.
    The list of assertions is returned in a partial order of strength, with the inferentially
    strongest assertion first.
     */
    @LispMethod(comment = "@return list of gaf-assertion?; a list of gaf assertions, each of which independently\r\njustify the fact that PREDICATE\'s extent is completely enumerable for VALUE in ARGNUM in MT.\r\nThe list of assertions is returned in a partial order of strength, with the inferentially\r\nstrongest assertion first.")
    public static SubLObject inference_complete_extent_enumerable_for_value_in_arg_gafs_internal(final SubLObject predicate, final SubLObject value, final SubLObject argnum, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = completeness_constraint_mt(mt);
        SubLObject gafs = NIL;
        SubLObject cdolist_list_var;
        SubLObject stronger_gafs = cdolist_list_var = inference_complete_extent_asserted_for_value_in_arg_gafs(predicate, value, argnum, mt);
        SubLObject stronger_gaf = NIL;
        stronger_gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            gafs = cons(stronger_gaf, gafs);
            cdolist_list_var = cdolist_list_var.rest();
            stronger_gaf = cdolist_list_var.first();
        } 
        stronger_gafs = cdolist_list_var = inference_complete_extent_enumerable_for_arg_gafs(predicate, argnum, mt);
        stronger_gaf = NIL;
        stronger_gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            gafs = cons(stronger_gaf, gafs);
            cdolist_list_var = cdolist_list_var.rest();
            stronger_gaf = cdolist_list_var.first();
        } 
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject var;
            final SubLObject gaf = var = kb_accessors.complete_extent_enumerable_for_value_in_arg_gaf(predicate, value, argnum, UNPROVIDED);
            if (NIL != var) {
                gafs = cons(var, gafs);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return nreverse(gafs);
    }

    public static final SubLObject inference_complete_extent_enumerable_for_value_in_arg_gafs_alt(SubLObject predicate, SubLObject value, SubLObject argnum, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_enumerable_for_value_in_arg_gafs_internal(predicate, value, argnum, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_VALUE_IN_ARG_GAFS, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_VALUE_IN_ARG_GAFS, FOUR_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_VALUE_IN_ARG_GAFS, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_4(predicate, value, argnum, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw1$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (predicate == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (value == cached_args.first()) {
                                            cached_args = cached_args.rest();
                                            if (argnum == cached_args.first()) {
                                                cached_args = cached_args.rest();
                                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && (mt == cached_args.first())) {
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
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_enumerable_for_value_in_arg_gafs_internal(predicate, value, argnum, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicate, value, argnum, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject inference_complete_extent_enumerable_for_value_in_arg_gafs(final SubLObject predicate, final SubLObject value, final SubLObject argnum, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_complete_extent_enumerable_for_value_in_arg_gafs_internal(predicate, value, argnum, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_VALUE_IN_ARG_GAFS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_VALUE_IN_ARG_GAFS, FOUR_INTEGER, $int$8192, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_VALUE_IN_ARG_GAFS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(predicate, value, argnum, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (predicate.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (value.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (argnum.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_complete_extent_enumerable_for_value_in_arg_gafs_internal(predicate, value, argnum, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate, value, argnum, mt));
        return memoization_state.caching_results(results3);
    }

    /**
     *
     *
     * @return booleanp; whether PREDICATE's extent is completely decidable for ARGNUM in MT.
     */
    @LispMethod(comment = "@return booleanp; whether PREDICATE\'s extent is completely decidable for ARGNUM in MT.")
    public static final SubLObject inference_complete_extent_decidable_for_value_in_argP_alt(SubLObject predicate, SubLObject value, SubLObject argnum, SubLObject mt) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_decidable_for_value_in_arg_gaf(predicate, value, argnum, mt));
    }

    /**
     *
     *
     * @return booleanp; whether PREDICATE's extent is completely decidable for ARGNUM in MT.
     */
    @LispMethod(comment = "@return booleanp; whether PREDICATE\'s extent is completely decidable for ARGNUM in MT.")
    public static SubLObject inference_complete_extent_decidable_for_value_in_argP(final SubLObject predicate, final SubLObject value, final SubLObject argnum, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_complete_extent_decidable_for_value_in_arg_gaf(predicate, value, argnum, mt));
    }

    /**
     *
     *
     * @return nil or gaf-assertion?; a gaf assertion justifying
    the fact that PREDICATE's extent is completely decidable for ARGNUM in MT.
    If there is more than one such assertion, the inferentially strongest one will be returned.
     */
    @LispMethod(comment = "@return nil or gaf-assertion?; a gaf assertion justifying\r\nthe fact that PREDICATE\'s extent is completely decidable for ARGNUM in MT.\r\nIf there is more than one such assertion, the inferentially strongest one will be returned.")
    public static final SubLObject inference_complete_extent_decidable_for_value_in_arg_gaf_alt(SubLObject predicate, SubLObject value, SubLObject argnum, SubLObject mt) {
        return com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_decidable_for_value_in_arg_gafs(predicate, value, argnum, mt).first();
    }

    /**
     *
     *
     * @return nil or gaf-assertion?; a gaf assertion justifying
    the fact that PREDICATE's extent is completely decidable for ARGNUM in MT.
    If there is more than one such assertion, the inferentially strongest one will be returned.
     */
    @LispMethod(comment = "@return nil or gaf-assertion?; a gaf assertion justifying\r\nthe fact that PREDICATE\'s extent is completely decidable for ARGNUM in MT.\r\nIf there is more than one such assertion, the inferentially strongest one will be returned.")
    public static SubLObject inference_complete_extent_decidable_for_value_in_arg_gaf(final SubLObject predicate, final SubLObject value, final SubLObject argnum, final SubLObject mt) {
        return inference_complete_extent_decidable_for_value_in_arg_gafs(predicate, value, argnum, mt).first();
    }

    /**
     *
     *
     * @return list of gaf-assertion?; a list of gaf assertions, each of which independently
    justify the fact that PREDICATE's extent is completely decidable for ARGNUM in MT.
    The list of assertions is returned in a partial order of strength, with the inferentially
    strongest assertion first.
     */
    @LispMethod(comment = "@return list of gaf-assertion?; a list of gaf assertions, each of which independently\r\njustify the fact that PREDICATE\'s extent is completely decidable for ARGNUM in MT.\r\nThe list of assertions is returned in a partial order of strength, with the inferentially\r\nstrongest assertion first.")
    public static final SubLObject inference_complete_extent_decidable_for_value_in_arg_gafs_internal_alt(SubLObject predicate, SubLObject value, SubLObject argnum, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            mt = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.completeness_constraint_mt(mt);
            {
                SubLObject gafs = NIL;
                SubLObject stronger_gafs = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_enumerable_for_value_in_arg_gafs(predicate, value, argnum, mt);
                SubLObject cdolist_list_var = stronger_gafs;
                SubLObject stronger_gaf = NIL;
                for (stronger_gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , stronger_gaf = cdolist_list_var.first()) {
                    gafs = cons(stronger_gaf, gafs);
                }
                {
                    SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            {
                                SubLObject gaf = kb_accessors.complete_extent_decidable_for_value_in_arg_gaf(predicate, value, argnum, UNPROVIDED);
                                SubLObject var = gaf;
                                if (NIL != var) {
                                    gafs = cons(var, gafs);
                                }
                            }
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return nreverse(gafs);
            }
        }
    }

    /**
     *
     *
     * @return list of gaf-assertion?; a list of gaf assertions, each of which independently
    justify the fact that PREDICATE's extent is completely decidable for ARGNUM in MT.
    The list of assertions is returned in a partial order of strength, with the inferentially
    strongest assertion first.
     */
    @LispMethod(comment = "@return list of gaf-assertion?; a list of gaf assertions, each of which independently\r\njustify the fact that PREDICATE\'s extent is completely decidable for ARGNUM in MT.\r\nThe list of assertions is returned in a partial order of strength, with the inferentially\r\nstrongest assertion first.")
    public static SubLObject inference_complete_extent_decidable_for_value_in_arg_gafs_internal(final SubLObject predicate, final SubLObject value, final SubLObject argnum, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = completeness_constraint_mt(mt);
        SubLObject gafs = NIL;
        SubLObject cdolist_list_var;
        final SubLObject stronger_gafs = cdolist_list_var = inference_complete_extent_enumerable_for_value_in_arg_gafs(predicate, value, argnum, mt);
        SubLObject stronger_gaf = NIL;
        stronger_gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            gafs = cons(stronger_gaf, gafs);
            cdolist_list_var = cdolist_list_var.rest();
            stronger_gaf = cdolist_list_var.first();
        } 
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject var;
            final SubLObject gaf = var = kb_accessors.complete_extent_decidable_for_value_in_arg_gaf(predicate, value, argnum, UNPROVIDED);
            if (NIL != var) {
                gafs = cons(var, gafs);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return nreverse(gafs);
    }

    public static final SubLObject inference_complete_extent_decidable_for_value_in_arg_gafs_alt(SubLObject predicate, SubLObject value, SubLObject argnum, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_decidable_for_value_in_arg_gafs_internal(predicate, value, argnum, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_COMPLETE_EXTENT_DECIDABLE_FOR_VALUE_IN_ARG_GAFS, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_COMPLETE_EXTENT_DECIDABLE_FOR_VALUE_IN_ARG_GAFS, FOUR_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, INFERENCE_COMPLETE_EXTENT_DECIDABLE_FOR_VALUE_IN_ARG_GAFS, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_4(predicate, value, argnum, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw1$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (predicate == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (value == cached_args.first()) {
                                            cached_args = cached_args.rest();
                                            if (argnum == cached_args.first()) {
                                                cached_args = cached_args.rest();
                                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && (mt == cached_args.first())) {
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
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_decidable_for_value_in_arg_gafs_internal(predicate, value, argnum, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicate, value, argnum, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject inference_complete_extent_decidable_for_value_in_arg_gafs(final SubLObject predicate, final SubLObject value, final SubLObject argnum, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_complete_extent_decidable_for_value_in_arg_gafs_internal(predicate, value, argnum, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_COMPLETE_EXTENT_DECIDABLE_FOR_VALUE_IN_ARG_GAFS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_COMPLETE_EXTENT_DECIDABLE_FOR_VALUE_IN_ARG_GAFS, FOUR_INTEGER, $int$8192, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_COMPLETE_EXTENT_DECIDABLE_FOR_VALUE_IN_ARG_GAFS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(predicate, value, argnum, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (predicate.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (value.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (argnum.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_complete_extent_decidable_for_value_in_arg_gafs_internal(predicate, value, argnum, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate, value, argnum, mt));
        return memoization_state.caching_results(results3);
    }

    /**
     *
     *
     * @return booleanp; whether COLLECTION is completely enumerable in MT.
     */
    @LispMethod(comment = "@return booleanp; whether COLLECTION is completely enumerable in MT.")
    public static final SubLObject inference_completely_enumerable_collectionP_alt(SubLObject collection, SubLObject mt) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_completely_enumerable_collection_gaf(collection, mt));
    }

    /**
     *
     *
     * @return booleanp; whether COLLECTION is completely enumerable in MT.
     */
    @LispMethod(comment = "@return booleanp; whether COLLECTION is completely enumerable in MT.")
    public static SubLObject inference_completely_enumerable_collectionP(final SubLObject collection, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_completely_enumerable_collection_gaf(collection, mt));
    }

    /**
     *
     *
     * @return nil or gaf-assertion?; a gaf assertion justifying
    the fact that COLLECTION is completely enumerable in MT.
    If there is more than one such assertion, the inferentially strongest one will be returned.
     */
    @LispMethod(comment = "@return nil or gaf-assertion?; a gaf assertion justifying\r\nthe fact that COLLECTION is completely enumerable in MT.\r\nIf there is more than one such assertion, the inferentially strongest one will be returned.")
    public static final SubLObject inference_completely_enumerable_collection_gaf_alt(SubLObject collection, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            mt = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.completeness_constraint_mt(mt);
            {
                SubLObject gaf = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        gaf = kb_accessors.completely_enumerable_collection_gaf(collection, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return gaf;
            }
        }
    }

    /**
     *
     *
     * @return nil or gaf-assertion?; a gaf assertion justifying
    the fact that COLLECTION is completely enumerable in MT.
    If there is more than one such assertion, the inferentially strongest one will be returned.
     */
    @LispMethod(comment = "@return nil or gaf-assertion?; a gaf assertion justifying\r\nthe fact that COLLECTION is completely enumerable in MT.\r\nIf there is more than one such assertion, the inferentially strongest one will be returned.")
    public static SubLObject inference_completely_enumerable_collection_gaf(final SubLObject collection, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = completeness_constraint_mt(mt);
        SubLObject gaf = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            gaf = kb_accessors.completely_enumerable_collection_gaf(collection, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return gaf;
    }

    /**
     *
     *
     * @return booleanp; whether COLLECTION is completely decidable in MT.
     */
    @LispMethod(comment = "@return booleanp; whether COLLECTION is completely decidable in MT.")
    public static final SubLObject inference_completely_decidable_collectionP_alt(SubLObject collection, SubLObject mt) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_completely_decidable_collection_gaf(collection, mt));
    }

    /**
     *
     *
     * @return booleanp; whether COLLECTION is completely decidable in MT.
     */
    @LispMethod(comment = "@return booleanp; whether COLLECTION is completely decidable in MT.")
    public static SubLObject inference_completely_decidable_collectionP(final SubLObject collection, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_completely_decidable_collection_gaf(collection, mt));
    }

    /**
     *
     *
     * @return nil or gaf-assertion?; a gaf assertion justifying
    the fact that COLLECTION is completely decidable in MT.
    If there is more than one such assertion, the inferentially strongest one will be returned.
     */
    @LispMethod(comment = "@return nil or gaf-assertion?; a gaf assertion justifying\r\nthe fact that COLLECTION is completely decidable in MT.\r\nIf there is more than one such assertion, the inferentially strongest one will be returned.")
    public static final SubLObject inference_completely_decidable_collection_gaf_alt(SubLObject collection, SubLObject mt) {
        return com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_completely_decidable_collection_gafs(collection, mt).first();
    }

    /**
     *
     *
     * @return nil or gaf-assertion?; a gaf assertion justifying
    the fact that COLLECTION is completely decidable in MT.
    If there is more than one such assertion, the inferentially strongest one will be returned.
     */
    @LispMethod(comment = "@return nil or gaf-assertion?; a gaf assertion justifying\r\nthe fact that COLLECTION is completely decidable in MT.\r\nIf there is more than one such assertion, the inferentially strongest one will be returned.")
    public static SubLObject inference_completely_decidable_collection_gaf(final SubLObject collection, final SubLObject mt) {
        return inference_completely_decidable_collection_gafs(collection, mt).first();
    }

    /**
     *
     *
     * @return list of gaf-assertion?; a list of gaf assertions, each of which independently
    justify the fact that COLLECTION is completely decidable in MT.
    The list of assertions is returned in a partial order of strength, with the inferentially
    strongest assertion first.
     */
    @LispMethod(comment = "@return list of gaf-assertion?; a list of gaf assertions, each of which independently\r\njustify the fact that COLLECTION is completely decidable in MT.\r\nThe list of assertions is returned in a partial order of strength, with the inferentially\r\nstrongest assertion first.")
    public static final SubLObject inference_completely_decidable_collection_gafs_internal_alt(SubLObject collection, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            mt = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.completeness_constraint_mt(mt);
            {
                SubLObject gafs = NIL;
                {
                    SubLObject stronger_gaf = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_completely_enumerable_collection_gaf(collection, mt);
                    SubLObject var = stronger_gaf;
                    if (NIL != var) {
                        gafs = cons(var, gafs);
                    }
                }
                {
                    SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            {
                                SubLObject gaf = kb_accessors.completely_decidable_collection_gaf(collection, UNPROVIDED);
                                SubLObject var = gaf;
                                if (NIL != var) {
                                    gafs = cons(var, gafs);
                                }
                            }
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return nreverse(gafs);
            }
        }
    }

    /**
     *
     *
     * @return list of gaf-assertion?; a list of gaf assertions, each of which independently
    justify the fact that COLLECTION is completely decidable in MT.
    The list of assertions is returned in a partial order of strength, with the inferentially
    strongest assertion first.
     */
    @LispMethod(comment = "@return list of gaf-assertion?; a list of gaf assertions, each of which independently\r\njustify the fact that COLLECTION is completely decidable in MT.\r\nThe list of assertions is returned in a partial order of strength, with the inferentially\r\nstrongest assertion first.")
    public static SubLObject inference_completely_decidable_collection_gafs_internal(final SubLObject collection, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = completeness_constraint_mt(mt);
        SubLObject gafs = NIL;
        final SubLObject var;
        final SubLObject stronger_gaf = var = inference_completely_enumerable_collection_gaf(collection, mt);
        if (NIL != var) {
            gafs = cons(var, gafs);
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject var2;
            final SubLObject gaf = var2 = kb_accessors.completely_decidable_collection_gaf(collection, UNPROVIDED);
            if (NIL != var2) {
                gafs = cons(var2, gafs);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return nreverse(gafs);
    }

    public static final SubLObject inference_completely_decidable_collection_gafs_alt(SubLObject collection, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_completely_decidable_collection_gafs_internal(collection, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_COMPLETELY_DECIDABLE_COLLECTION_GAFS, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_COMPLETELY_DECIDABLE_COLLECTION_GAFS, TWO_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, INFERENCE_COMPLETELY_DECIDABLE_COLLECTION_GAFS, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(collection, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw1$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (collection == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (mt == cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_completely_decidable_collection_gafs_internal(collection, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(collection, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject inference_completely_decidable_collection_gafs(final SubLObject collection, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_completely_decidable_collection_gafs_internal(collection, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_COMPLETELY_DECIDABLE_COLLECTION_GAFS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_COMPLETELY_DECIDABLE_COLLECTION_GAFS, TWO_INTEGER, $int$8192, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_COMPLETELY_DECIDABLE_COLLECTION_GAFS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(collection, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (collection.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_completely_decidable_collection_gafs_internal(collection, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(collection, mt));
        return memoization_state.caching_results(results3);
    }

    /**
     *
     *
     * @return boolean; whether all bindings for free variables in ASENT
    can be completely enumerated in MT.  If ASENT is closed, return
    whether the truth of ASENT can be completely decided with no transformation.
     */
    @LispMethod(comment = "@return boolean; whether all bindings for free variables in ASENT\r\ncan be completely enumerated in MT.  If ASENT is closed, return\r\nwhether the truth of ASENT can be completely decided with no transformation.")
    public static final SubLObject inference_complete_asentP_alt(SubLObject asent, SubLObject mt) {
        if (NIL != variables.fully_bound_p(asent)) {
            return com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_completely_decidable_asentP(asent, mt);
        } else {
            return com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_completely_enumerable_asentP(asent, mt);
        }
    }

    /**
     *
     *
     * @return boolean; whether all bindings for free variables in ASENT
    can be completely enumerated in MT.  If ASENT is closed, return
    whether the truth of ASENT can be completely decided with no transformation.
     */
    @LispMethod(comment = "@return boolean; whether all bindings for free variables in ASENT\r\ncan be completely enumerated in MT.  If ASENT is closed, return\r\nwhether the truth of ASENT can be completely decided with no transformation.")
    public static SubLObject inference_complete_asentP(final SubLObject asent, final SubLObject mt) {
        if (NIL != variables.fully_bound_p(asent)) {
            return inference_completely_decidable_asentP(asent, mt);
        }
        return inference_completely_enumerable_asentP(asent, mt);
    }

    /**
     *
     *
     * @return boolean; whether all bindings for free variables in ASENT
    are completely asserted in MT.  If ASENT is closed, return
    whether the truth of ASENT can be completely decided via assertion lookup.
     */
    @LispMethod(comment = "@return boolean; whether all bindings for free variables in ASENT\r\nare completely asserted in MT.  If ASENT is closed, return\r\nwhether the truth of ASENT can be completely decided via assertion lookup.")
    public static final SubLObject inference_completely_asserted_asentP_alt(SubLObject asent, SubLObject mt) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_completely_asserted_asent_gaf(asent, mt));
    }

    /**
     *
     *
     * @return boolean; whether all bindings for free variables in ASENT
    are completely asserted in MT.  If ASENT is closed, return
    whether the truth of ASENT can be completely decided via assertion lookup.
     */
    @LispMethod(comment = "@return boolean; whether all bindings for free variables in ASENT\r\nare completely asserted in MT.  If ASENT is closed, return\r\nwhether the truth of ASENT can be completely decided via assertion lookup.")
    public static SubLObject inference_completely_asserted_asentP(final SubLObject asent, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_completely_asserted_asent_gaf(asent, mt));
    }

    /**
     *
     *
     * @return nil or gaf-assertion?; if all bindings for free variables in ASENT
    are completely asserted in MT, or if ASENT is closed and its
    truth can be completely decided via assertion lookup, return a gaf
    assertion justifying this claim.
     */
    @LispMethod(comment = "@return nil or gaf-assertion?; if all bindings for free variables in ASENT\r\nare completely asserted in MT, or if ASENT is closed and its\r\ntruth can be completely decided via assertion lookup, return a gaf\r\nassertion justifying this claim.")
    public static final SubLObject inference_completely_asserted_asent_gaf_alt(SubLObject asent, SubLObject mt) {
        return com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_completely_asserted_asent_gafs(asent, mt).first();
    }

    /**
     *
     *
     * @return nil or gaf-assertion?; if all bindings for free variables in ASENT
    are completely asserted in MT, or if ASENT is closed and its
    truth can be completely decided via assertion lookup, return a gaf
    assertion justifying this claim.
     */
    @LispMethod(comment = "@return nil or gaf-assertion?; if all bindings for free variables in ASENT\r\nare completely asserted in MT, or if ASENT is closed and its\r\ntruth can be completely decided via assertion lookup, return a gaf\r\nassertion justifying this claim.")
    public static SubLObject inference_completely_asserted_asent_gaf(final SubLObject asent, final SubLObject mt) {
        return inference_completely_asserted_asent_gafs(asent, mt).first();
    }

    /**
     *
     *
     * @return list of gaf-assertion?; if all bindings for free variables in ASENT
    are completely asserted in MT, or if ASENT is closed and its
    truth can be completely decided via assertion lookup, return a list of
    gaf assertion justifying this claim.  The list of assertions is returned
    in a partial order of strength, with the inferentially strongest assertion first.
     */
    @LispMethod(comment = "@return list of gaf-assertion?; if all bindings for free variables in ASENT\r\nare completely asserted in MT, or if ASENT is closed and its\r\ntruth can be completely decided via assertion lookup, return a list of\r\ngaf assertion justifying this claim.  The list of assertions is returned\r\nin a partial order of strength, with the inferentially strongest assertion first.")
    public static final SubLObject inference_completely_asserted_asent_gafs_alt(SubLObject asent, SubLObject mt) {
        mt = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.completeness_constraint_mt(mt);
        {
            SubLObject result_gafs = NIL;
            SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            if (NIL != forts.fort_p(predicate)) {
                {
                    SubLObject gaf = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_asserted_gaf(predicate, mt);
                    if (NIL != equals.unique_names_assumption_applicable_to_all_argsP(asent)) {
                        {
                            SubLObject var = gaf;
                            if (NIL != var) {
                                result_gafs = cons(var, result_gafs);
                            }
                        }
                    }
                }
                {
                    SubLObject terms = cycl_utilities.formula_terms(asent, $IGNORE);
                    SubLObject list_var = NIL;
                    SubLObject value = NIL;
                    SubLObject argnum = NIL;
                    for (list_var = terms, value = list_var.first(), argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , value = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
                        if (NIL != variables.fully_bound_p(value)) {
                            {
                                SubLObject gafs = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_asserted_for_value_in_arg_gafs(predicate, value, argnum, mt);
                                if (NIL != gafs) {
                                    if (NIL != equals.unique_names_assumption_applicable_to_all_args_exceptP(asent, argnum)) {
                                        {
                                            SubLObject cdolist_list_var = gafs;
                                            SubLObject gaf = NIL;
                                            for (gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gaf = cdolist_list_var.first()) {
                                                {
                                                    SubLObject item_var = gaf;
                                                    if (NIL == member(item_var, result_gafs, symbol_function(EQ), symbol_function(IDENTITY))) {
                                                        result_gafs = cons(item_var, result_gafs);
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
            return nreverse(result_gafs);
        }
    }

    /**
     *
     *
     * @return list of gaf-assertion?; if all bindings for free variables in ASENT
    are completely asserted in MT, or if ASENT is closed and its
    truth can be completely decided via assertion lookup, return a list of
    gaf assertion justifying this claim.  The list of assertions is returned
    in a partial order of strength, with the inferentially strongest assertion first.
     */
    @LispMethod(comment = "@return list of gaf-assertion?; if all bindings for free variables in ASENT\r\nare completely asserted in MT, or if ASENT is closed and its\r\ntruth can be completely decided via assertion lookup, return a list of\r\ngaf assertion justifying this claim.  The list of assertions is returned\r\nin a partial order of strength, with the inferentially strongest assertion first.")
    public static SubLObject inference_completely_asserted_asent_gafs(final SubLObject asent, SubLObject mt) {
        mt = completeness_constraint_mt(mt);
        SubLObject result_gafs = NIL;
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (NIL != forts.fort_p(predicate)) {
            final SubLObject gaf = inference_complete_extent_asserted_gaf(predicate, mt);
            if (NIL != equals.unique_names_assumption_applicable_to_all_argsP(asent)) {
                final SubLObject var = gaf;
                if (NIL != var) {
                    result_gafs = cons(var, result_gafs);
                }
            }
            final SubLObject terms = cycl_utilities.formula_terms(asent, $IGNORE);
            SubLObject list_var = NIL;
            SubLObject value = NIL;
            SubLObject argnum = NIL;
            list_var = terms;
            value = list_var.first();
            for (argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , value = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
                if (NIL != variables.fully_bound_p(value)) {
                    final SubLObject gafs = inference_complete_extent_asserted_for_value_in_arg_gafs(predicate, value, argnum, mt);
                    if ((NIL != gafs) && (NIL != equals.unique_names_assumption_applicable_to_all_args_exceptP(asent, argnum))) {
                        SubLObject cdolist_list_var = gafs;
                        SubLObject gaf2 = NIL;
                        gaf2 = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject item_var = gaf2;
                            if (NIL == member(item_var, result_gafs, symbol_function(EQL), symbol_function(IDENTITY))) {
                                result_gafs = cons(item_var, result_gafs);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            gaf2 = cdolist_list_var.first();
                        } 
                    }
                }
            }
        }
        return nreverse(result_gafs);
    }

    /**
     *
     *
     * @return boolean; whether all bindings for free variables in ASENT
    can be completely enumerated in MT.  If ASENT is closed, return
    whether the truth of ASENT can be completely decided with no transformation.
     */
    @LispMethod(comment = "@return boolean; whether all bindings for free variables in ASENT\r\ncan be completely enumerated in MT.  If ASENT is closed, return\r\nwhether the truth of ASENT can be completely decided with no transformation.")
    public static final SubLObject inference_completely_enumerable_asentP_alt(SubLObject asent, SubLObject mt) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_completely_enumerable_asent_gaf(asent, mt));
    }

    /**
     *
     *
     * @return boolean; whether all bindings for free variables in ASENT
    can be completely enumerated in MT.  If ASENT is closed, return
    whether the truth of ASENT can be completely decided with no transformation.
     */
    @LispMethod(comment = "@return boolean; whether all bindings for free variables in ASENT\r\ncan be completely enumerated in MT.  If ASENT is closed, return\r\nwhether the truth of ASENT can be completely decided with no transformation.")
    public static SubLObject inference_completely_enumerable_asentP(final SubLObject asent, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_completely_enumerable_asent_gaf(asent, mt));
    }

    /**
     *
     *
     * @return nil or gaf-assertion?; if all bindings for free variables in ASENT
    can be completely enumerated in MT, or if ASENT is closed and its
    truth can be completely decided with no transformation, return a gaf
    assertion justifying this claim.
     */
    @LispMethod(comment = "@return nil or gaf-assertion?; if all bindings for free variables in ASENT\r\ncan be completely enumerated in MT, or if ASENT is closed and its\r\ntruth can be completely decided with no transformation, return a gaf\r\nassertion justifying this claim.")
    public static final SubLObject inference_completely_enumerable_asent_gaf_alt(SubLObject asent, SubLObject mt) {
        return com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_completely_enumerable_asent_gafs(asent, mt);
    }

    /**
     *
     *
     * @return nil or gaf-assertion?; if all bindings for free variables in ASENT
    can be completely enumerated in MT, or if ASENT is closed and its
    truth can be completely decided with no transformation, return a gaf
    assertion justifying this claim.
     */
    @LispMethod(comment = "@return nil or gaf-assertion?; if all bindings for free variables in ASENT\r\ncan be completely enumerated in MT, or if ASENT is closed and its\r\ntruth can be completely decided with no transformation, return a gaf\r\nassertion justifying this claim.")
    public static SubLObject inference_completely_enumerable_asent_gaf(final SubLObject asent, final SubLObject mt) {
        return inference_completely_enumerable_asent_gafs(asent, mt);
    }

    /**
     *
     *
     * @return list of gaf-assertion?; if all bindings for free variables in ASENT
    can be completely enumerated in MT, or if ASENT is closed and its
    truth can be completely decided with no transformation, return a list of gaf
    assertions justifying this claim.  The list of assertions is returned
    in a partial order of strength, with the inferentially strongest assertion first.
     */
    @LispMethod(comment = "@return list of gaf-assertion?; if all bindings for free variables in ASENT\r\ncan be completely enumerated in MT, or if ASENT is closed and its\r\ntruth can be completely decided with no transformation, return a list of gaf\r\nassertions justifying this claim.  The list of assertions is returned\r\nin a partial order of strength, with the inferentially strongest assertion first.")
    public static final SubLObject inference_completely_enumerable_asent_gafs_alt(SubLObject asent, SubLObject mt) {
        mt = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.completeness_constraint_mt(mt);
        {
            SubLObject result_gafs = NIL;
            SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            if (NIL != forts.fort_p(predicate)) {
                {
                    SubLObject gafs = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_enumerable_gafs(predicate, mt);
                    if (NIL != gafs) {
                        if (NIL != equals.unique_names_assumption_applicable_to_all_argsP(asent)) {
                            {
                                SubLObject cdolist_list_var = gafs;
                                SubLObject gaf = NIL;
                                for (gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gaf = cdolist_list_var.first()) {
                                    result_gafs = cons(gaf, result_gafs);
                                }
                            }
                        }
                    }
                }
                if ($$isa == predicate) {
                    {
                        SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                        if (NIL != forts.fort_p(collection)) {
                            {
                                SubLObject gaf = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_completely_enumerable_collection_gaf(collection, mt);
                                if (NIL != gaf) {
                                    if (NIL != equals.unique_names_assumption_applicable_to_termP(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED))) {
                                        result_gafs = cons(gaf, result_gafs);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject terms = cycl_utilities.formula_terms(asent, $IGNORE);
                    SubLObject list_var = NIL;
                    SubLObject value = NIL;
                    SubLObject argnum = NIL;
                    for (list_var = terms, value = list_var.first(), argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , value = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
                        if (NIL != variables.fully_bound_p(value)) {
                            {
                                SubLObject gafs = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_enumerable_for_arg_gafs(predicate, argnum, mt);
                                if (NIL != gafs) {
                                    if (NIL != equals.unique_names_assumption_applicable_to_all_args_exceptP(asent, argnum)) {
                                        {
                                            SubLObject cdolist_list_var = gafs;
                                            SubLObject gaf = NIL;
                                            for (gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gaf = cdolist_list_var.first()) {
                                                {
                                                    SubLObject item_var = gaf;
                                                    if (NIL == member(item_var, result_gafs, symbol_function(EQ), symbol_function(IDENTITY))) {
                                                        result_gafs = cons(item_var, result_gafs);
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
                    SubLObject terms = cycl_utilities.formula_terms(asent, $IGNORE);
                    SubLObject list_var = NIL;
                    SubLObject value = NIL;
                    SubLObject argnum = NIL;
                    for (list_var = terms, value = list_var.first(), argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , value = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
                        if (NIL != variables.fully_bound_p(value)) {
                            {
                                SubLObject gafs = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_enumerable_for_value_in_arg_gafs(predicate, value, argnum, mt);
                                if (NIL != gafs) {
                                    if (NIL != equals.unique_names_assumption_applicable_to_all_args_exceptP(asent, argnum)) {
                                        {
                                            SubLObject cdolist_list_var = gafs;
                                            SubLObject gaf = NIL;
                                            for (gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gaf = cdolist_list_var.first()) {
                                                {
                                                    SubLObject item_var = gaf;
                                                    if (NIL == member(item_var, result_gafs, symbol_function(EQ), symbol_function(IDENTITY))) {
                                                        result_gafs = cons(item_var, result_gafs);
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
            return nreverse(result_gafs);
        }
    }

    /**
     *
     *
     * @return list of gaf-assertion?; if all bindings for free variables in ASENT
    can be completely enumerated in MT, or if ASENT is closed and its
    truth can be completely decided with no transformation, return a list of gaf
    assertions justifying this claim.  The list of assertions is returned
    in a partial order of strength, with the inferentially strongest assertion first.
     */
    @LispMethod(comment = "@return list of gaf-assertion?; if all bindings for free variables in ASENT\r\ncan be completely enumerated in MT, or if ASENT is closed and its\r\ntruth can be completely decided with no transformation, return a list of gaf\r\nassertions justifying this claim.  The list of assertions is returned\r\nin a partial order of strength, with the inferentially strongest assertion first.")
    public static SubLObject inference_completely_enumerable_asent_gafs(final SubLObject asent, SubLObject mt) {
        mt = completeness_constraint_mt(mt);
        SubLObject result_gafs = NIL;
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (NIL != forts.fort_p(predicate)) {
            final SubLObject gafs = inference_complete_extent_enumerable_gafs(predicate, mt);
            if ((NIL != gafs) && (NIL != equals.unique_names_assumption_applicable_to_all_argsP(asent))) {
                SubLObject cdolist_list_var = gafs;
                SubLObject gaf = NIL;
                gaf = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    result_gafs = cons(gaf, result_gafs);
                    cdolist_list_var = cdolist_list_var.rest();
                    gaf = cdolist_list_var.first();
                } 
            }
            if ($$isa.eql(predicate)) {
                final SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                if (NIL != forts.fort_p(collection)) {
                    final SubLObject gaf2 = inference_completely_enumerable_collection_gaf(collection, mt);
                    if ((NIL != gaf2) && (NIL != equals.unique_names_assumption_applicable_to_termP(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED)))) {
                        result_gafs = cons(gaf2, result_gafs);
                    }
                }
            }
            SubLObject terms = cycl_utilities.formula_terms(asent, $IGNORE);
            SubLObject list_var = NIL;
            SubLObject value = NIL;
            SubLObject argnum = NIL;
            list_var = terms;
            value = list_var.first();
            for (argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , value = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
                if (NIL != variables.fully_bound_p(value)) {
                    final SubLObject gafs2 = inference_complete_extent_enumerable_for_arg_gafs(predicate, argnum, mt);
                    if ((NIL != gafs2) && (NIL != equals.unique_names_assumption_applicable_to_all_args_exceptP(asent, argnum))) {
                        SubLObject cdolist_list_var2 = gafs2;
                        SubLObject gaf3 = NIL;
                        gaf3 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            final SubLObject item_var = gaf3;
                            if (NIL == member(item_var, result_gafs, symbol_function(EQL), symbol_function(IDENTITY))) {
                                result_gafs = cons(item_var, result_gafs);
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            gaf3 = cdolist_list_var2.first();
                        } 
                    }
                }
            }
            terms = cycl_utilities.formula_terms(asent, $IGNORE);
            list_var = NIL;
            value = NIL;
            argnum = NIL;
            list_var = terms;
            value = list_var.first();
            for (argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , value = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
                if (NIL != variables.fully_bound_p(value)) {
                    final SubLObject gafs2 = inference_complete_extent_enumerable_for_value_in_arg_gafs(predicate, value, argnum, mt);
                    if ((NIL != gafs2) && (NIL != equals.unique_names_assumption_applicable_to_all_args_exceptP(asent, argnum))) {
                        SubLObject cdolist_list_var2 = gafs2;
                        SubLObject gaf3 = NIL;
                        gaf3 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            final SubLObject item_var = gaf3;
                            if (NIL == member(item_var, result_gafs, symbol_function(EQL), symbol_function(IDENTITY))) {
                                result_gafs = cons(item_var, result_gafs);
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            gaf3 = cdolist_list_var2.first();
                        } 
                    }
                }
            }
        }
        return nreverse(result_gafs);
    }

    /**
     *
     *
     * @return boolean; whether the truth of ASENT can be completely decided with no transformation.
     */
    @LispMethod(comment = "@return boolean; whether the truth of ASENT can be completely decided with no transformation.")
    public static final SubLObject inference_completely_decidable_asentP_alt(SubLObject asent, SubLObject mt) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_completely_decidable_asent_gaf(asent, mt));
    }

    /**
     *
     *
     * @return boolean; whether the truth of ASENT can be completely decided with no transformation.
     */
    @LispMethod(comment = "@return boolean; whether the truth of ASENT can be completely decided with no transformation.")
    public static SubLObject inference_completely_decidable_asentP(final SubLObject asent, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_completely_decidable_asent_gaf(asent, mt));
    }

    /**
     *
     *
     * @return nil or gaf-assertion?; if the truth of ASENT can be completely decided with no transformation,
    return a gaf assertion justifying this claim.
     */
    @LispMethod(comment = "@return nil or gaf-assertion?; if the truth of ASENT can be completely decided with no transformation,\r\nreturn a gaf assertion justifying this claim.")
    public static final SubLObject inference_completely_decidable_asent_gaf_alt(SubLObject asent, SubLObject mt) {
        return com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_completely_decidable_asent_gafs(asent, mt).first();
    }

    /**
     *
     *
     * @return nil or gaf-assertion?; if the truth of ASENT can be completely decided with no transformation,
    return a gaf assertion justifying this claim.
     */
    @LispMethod(comment = "@return nil or gaf-assertion?; if the truth of ASENT can be completely decided with no transformation,\r\nreturn a gaf assertion justifying this claim.")
    public static SubLObject inference_completely_decidable_asent_gaf(final SubLObject asent, final SubLObject mt) {
        return inference_completely_decidable_asent_gafs(asent, mt).first();
    }

    /**
     *
     *
     * @return nil or gaf-assertion?; if the truth of ASENT can be completely decided with no transformation,
    return a list of gaf assertions justifying this claim.  The list of assertions is returned
    in a partial order of strength, with the inferentially strongest assertion first.
     */
    @LispMethod(comment = "@return nil or gaf-assertion?; if the truth of ASENT can be completely decided with no transformation,\r\nreturn a list of gaf assertions justifying this claim.  The list of assertions is returned\r\nin a partial order of strength, with the inferentially strongest assertion first.")
    public static final SubLObject inference_completely_decidable_asent_gafs_alt(SubLObject asent, SubLObject mt) {
        mt = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.completeness_constraint_mt(mt);
        {
            SubLObject result_gafs = NIL;
            SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            if (NIL != forts.fort_p(predicate)) {
                {
                    SubLObject gafs = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_enumerable_gafs(predicate, mt);
                    if (NIL != gafs) {
                        if (NIL != equals.unique_names_assumption_applicable_to_all_argsP(asent)) {
                            {
                                SubLObject cdolist_list_var = gafs;
                                SubLObject gaf = NIL;
                                for (gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gaf = cdolist_list_var.first()) {
                                    result_gafs = cons(gaf, result_gafs);
                                }
                            }
                        }
                    }
                }
                if ($$isa == predicate) {
                    {
                        SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                        if (NIL != forts.fort_p(collection)) {
                            {
                                SubLObject gaf = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_completely_enumerable_collection_gaf(collection, mt);
                                if (NIL != gaf) {
                                    if (NIL != equals.unique_names_assumption_applicable_to_termP(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED))) {
                                        result_gafs = cons(gaf, result_gafs);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject gafs = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_decidable_gafs(predicate, mt);
                    if (NIL != gafs) {
                        if (NIL != equals.unique_names_assumption_applicable_to_all_argsP(asent)) {
                            {
                                SubLObject cdolist_list_var = gafs;
                                SubLObject gaf = NIL;
                                for (gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gaf = cdolist_list_var.first()) {
                                    {
                                        SubLObject item_var = gaf;
                                        if (NIL == member(item_var, result_gafs, symbol_function(EQ), symbol_function(IDENTITY))) {
                                            result_gafs = cons(item_var, result_gafs);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if ($$isa == predicate) {
                    {
                        SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                        if (NIL != forts.fort_p(collection)) {
                            {
                                SubLObject gafs = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_completely_decidable_collection_gafs(collection, mt);
                                if (NIL != gafs) {
                                    if (NIL != equals.unique_names_assumption_applicable_to_termP(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED))) {
                                        {
                                            SubLObject cdolist_list_var = gafs;
                                            SubLObject gaf = NIL;
                                            for (gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gaf = cdolist_list_var.first()) {
                                                {
                                                    SubLObject item_var = gaf;
                                                    if (NIL == member(item_var, result_gafs, symbol_function(EQ), symbol_function(IDENTITY))) {
                                                        result_gafs = cons(item_var, result_gafs);
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
                    SubLObject terms = cycl_utilities.formula_terms(asent, $IGNORE);
                    SubLObject list_var = NIL;
                    SubLObject value = NIL;
                    SubLObject argnum = NIL;
                    for (list_var = terms, value = list_var.first(), argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , value = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
                        if (NIL != variables.fully_bound_p(value)) {
                            {
                                SubLObject gafs = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_enumerable_for_arg_gafs(predicate, argnum, mt);
                                if (NIL != gafs) {
                                    if (NIL != equals.unique_names_assumption_applicable_to_all_args_exceptP(asent, argnum)) {
                                        {
                                            SubLObject cdolist_list_var = gafs;
                                            SubLObject gaf = NIL;
                                            for (gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gaf = cdolist_list_var.first()) {
                                                {
                                                    SubLObject item_var = gaf;
                                                    if (NIL == member(item_var, result_gafs, symbol_function(EQ), symbol_function(IDENTITY))) {
                                                        result_gafs = cons(item_var, result_gafs);
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
                    SubLObject terms = cycl_utilities.formula_terms(asent, $IGNORE);
                    SubLObject list_var = NIL;
                    SubLObject value = NIL;
                    SubLObject argnum = NIL;
                    for (list_var = terms, value = list_var.first(), argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , value = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
                        if (NIL != variables.fully_bound_p(value)) {
                            {
                                SubLObject gafs = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_decidable_for_value_in_arg_gafs(predicate, value, argnum, mt);
                                if (NIL != gafs) {
                                    if (NIL != equals.unique_names_assumption_applicable_to_all_args_exceptP(asent, argnum)) {
                                        {
                                            SubLObject cdolist_list_var = gafs;
                                            SubLObject gaf = NIL;
                                            for (gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gaf = cdolist_list_var.first()) {
                                                {
                                                    SubLObject item_var = gaf;
                                                    if (NIL == member(item_var, result_gafs, symbol_function(EQ), symbol_function(IDENTITY))) {
                                                        result_gafs = cons(item_var, result_gafs);
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
            return nreverse(result_gafs);
        }
    }

    /**
     *
     *
     * @return nil or gaf-assertion?; if the truth of ASENT can be completely decided with no transformation,
    return a list of gaf assertions justifying this claim.  The list of assertions is returned
    in a partial order of strength, with the inferentially strongest assertion first.
     */
    @LispMethod(comment = "@return nil or gaf-assertion?; if the truth of ASENT can be completely decided with no transformation,\r\nreturn a list of gaf assertions justifying this claim.  The list of assertions is returned\r\nin a partial order of strength, with the inferentially strongest assertion first.")
    public static SubLObject inference_completely_decidable_asent_gafs(final SubLObject asent, SubLObject mt) {
        mt = completeness_constraint_mt(mt);
        SubLObject result_gafs = NIL;
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (NIL != forts.fort_p(predicate)) {
            SubLObject gafs = inference_complete_extent_enumerable_gafs(predicate, mt);
            if ((NIL != gafs) && (NIL != equals.unique_names_assumption_applicable_to_all_argsP(asent))) {
                SubLObject cdolist_list_var = gafs;
                SubLObject gaf = NIL;
                gaf = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    result_gafs = cons(gaf, result_gafs);
                    cdolist_list_var = cdolist_list_var.rest();
                    gaf = cdolist_list_var.first();
                } 
            }
            if ($$isa.eql(predicate)) {
                final SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                if (NIL != forts.fort_p(collection)) {
                    final SubLObject gaf2 = inference_completely_enumerable_collection_gaf(collection, mt);
                    if ((NIL != gaf2) && (NIL != equals.unique_names_assumption_applicable_to_termP(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED)))) {
                        result_gafs = cons(gaf2, result_gafs);
                    }
                }
            }
            gafs = inference_complete_extent_decidable_gafs(predicate, mt);
            if ((NIL != gafs) && (NIL != equals.unique_names_assumption_applicable_to_all_argsP(asent))) {
                SubLObject cdolist_list_var = gafs;
                SubLObject gaf = NIL;
                gaf = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject item_var = gaf;
                    if (NIL == member(item_var, result_gafs, symbol_function(EQL), symbol_function(IDENTITY))) {
                        result_gafs = cons(item_var, result_gafs);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    gaf = cdolist_list_var.first();
                } 
            }
            if ($$isa.eql(predicate)) {
                final SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                if (NIL != forts.fort_p(collection)) {
                    final SubLObject gafs2 = inference_completely_decidable_collection_gafs(collection, mt);
                    if ((NIL != gafs2) && (NIL != equals.unique_names_assumption_applicable_to_termP(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED)))) {
                        SubLObject cdolist_list_var2 = gafs2;
                        SubLObject gaf3 = NIL;
                        gaf3 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            final SubLObject item_var2 = gaf3;
                            if (NIL == member(item_var2, result_gafs, symbol_function(EQL), symbol_function(IDENTITY))) {
                                result_gafs = cons(item_var2, result_gafs);
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            gaf3 = cdolist_list_var2.first();
                        } 
                    }
                }
            }
            SubLObject terms = cycl_utilities.formula_terms(asent, $IGNORE);
            SubLObject list_var = NIL;
            SubLObject value = NIL;
            SubLObject argnum = NIL;
            list_var = terms;
            value = list_var.first();
            for (argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , value = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
                if (NIL != variables.fully_bound_p(value)) {
                    final SubLObject gafs3 = inference_complete_extent_enumerable_for_arg_gafs(predicate, argnum, mt);
                    if ((NIL != gafs3) && (NIL != equals.unique_names_assumption_applicable_to_all_args_exceptP(asent, argnum))) {
                        SubLObject cdolist_list_var3 = gafs3;
                        SubLObject gaf4 = NIL;
                        gaf4 = cdolist_list_var3.first();
                        while (NIL != cdolist_list_var3) {
                            final SubLObject item_var3 = gaf4;
                            if (NIL == member(item_var3, result_gafs, symbol_function(EQL), symbol_function(IDENTITY))) {
                                result_gafs = cons(item_var3, result_gafs);
                            }
                            cdolist_list_var3 = cdolist_list_var3.rest();
                            gaf4 = cdolist_list_var3.first();
                        } 
                    }
                }
            }
            terms = cycl_utilities.formula_terms(asent, $IGNORE);
            list_var = NIL;
            value = NIL;
            argnum = NIL;
            list_var = terms;
            value = list_var.first();
            for (argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , value = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
                if (NIL != variables.fully_bound_p(value)) {
                    final SubLObject gafs3 = inference_complete_extent_decidable_for_value_in_arg_gafs(predicate, value, argnum, mt);
                    if ((NIL != gafs3) && (NIL != equals.unique_names_assumption_applicable_to_all_args_exceptP(asent, argnum))) {
                        SubLObject cdolist_list_var3 = gafs3;
                        SubLObject gaf4 = NIL;
                        gaf4 = cdolist_list_var3.first();
                        while (NIL != cdolist_list_var3) {
                            final SubLObject item_var3 = gaf4;
                            if (NIL == member(item_var3, result_gafs, symbol_function(EQL), symbol_function(IDENTITY))) {
                                result_gafs = cons(item_var3, result_gafs);
                            }
                            cdolist_list_var3 = cdolist_list_var3.rest();
                            gaf4 = cdolist_list_var3.first();
                        } 
                    }
                }
            }
        }
        return nreverse(result_gafs);
    }

    /**
     * Assuming that we are doing inference in MT, return the mt in which we look
     * for completeness assertions.  If all mts are relevant, we need to be conservative
     * and only look for universally true completeness assertions.
     */
    @LispMethod(comment = "Assuming that we are doing inference in MT, return the mt in which we look\r\nfor completeness assertions.  If all mts are relevant, we need to be conservative\r\nand only look for universally true completeness assertions.\nAssuming that we are doing inference in MT, return the mt in which we look\nfor completeness assertions.  If all mts are relevant, we need to be conservative\nand only look for universally true completeness assertions.")
    public static final SubLObject completeness_constraint_mt_alt(SubLObject mt) {
        return mt_relevance_macros.conservative_constraint_mt(mt);
    }

    @LispMethod(comment = "Assuming that we are doing inference in MT, return the mt in which we look\r\nfor completeness assertions.  If all mts are relevant, we need to be conservative\r\nand only look for universally true completeness assertions.\nAssuming that we are doing inference in MT, return the mt in which we look\nfor completeness assertions.  If all mts are relevant, we need to be conservative\nand only look for universally true completeness assertions.")
    public static SubLObject completeness_constraint_mt(final SubLObject mt) {
        return mt_relevance_macros.conservative_constraint_mt(mt);
    }/**
     * Assuming that we are doing inference in MT, return the mt in which we look
     * for completeness assertions.  If all mts are relevant, we need to be conservative
     * and only look for universally true completeness assertions.
     */


    /**
     *
     *
     * @return booleanp; whether PREDICATE's extent is completely enumerable in MT via backchaining.
     */
    @LispMethod(comment = "@return booleanp; whether PREDICATE\'s extent is completely enumerable in MT via backchaining.")
    public static final SubLObject inference_complete_extent_enumerable_via_backchainP_alt(SubLObject predicate, SubLObject mt) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_enumerable_via_backchain_gaf(predicate, mt));
    }

    /**
     *
     *
     * @return booleanp; whether PREDICATE's extent is completely enumerable in MT via backchaining.
     */
    @LispMethod(comment = "@return booleanp; whether PREDICATE\'s extent is completely enumerable in MT via backchaining.")
    public static SubLObject inference_complete_extent_enumerable_via_backchainP(final SubLObject predicate, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_complete_extent_enumerable_via_backchain_gaf(predicate, mt));
    }

    /**
     *
     *
     * @return nil or gaf-assertion?; a gaf assertion justifying
    the fact that PREDICATE's extent is completely enumerable in MT via backchaining.
     */
    @LispMethod(comment = "@return nil or gaf-assertion?; a gaf assertion justifying\r\nthe fact that PREDICATE\'s extent is completely enumerable in MT via backchaining.")
    public static final SubLObject inference_complete_extent_enumerable_via_backchain_gaf_alt(SubLObject predicate, SubLObject mt) {
        mt = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.completeness_constraint_mt(mt);
        return com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_enumerable_via_backchain_gafs(predicate, mt).first();
    }

    /**
     *
     *
     * @return nil or gaf-assertion?; a gaf assertion justifying
    the fact that PREDICATE's extent is completely enumerable in MT via backchaining.
     */
    @LispMethod(comment = "@return nil or gaf-assertion?; a gaf assertion justifying\r\nthe fact that PREDICATE\'s extent is completely enumerable in MT via backchaining.")
    public static SubLObject inference_complete_extent_enumerable_via_backchain_gaf(final SubLObject predicate, SubLObject mt) {
        mt = completeness_constraint_mt(mt);
        return inference_complete_extent_enumerable_via_backchain_gafs(predicate, mt).first();
    }

    /**
     *
     *
     * @return list of gaf-assertion?; a list of gaf assertions, each of which independently
    justify the fact that PREDICATE's extent is completely enumerable in MT via backchaining.
     */
    @LispMethod(comment = "@return list of gaf-assertion?; a list of gaf assertions, each of which independently\r\njustify the fact that PREDICATE\'s extent is completely enumerable in MT via backchaining.")
    public static final SubLObject inference_complete_extent_enumerable_via_backchain_gafs_internal_alt(SubLObject predicate, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            mt = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.completeness_constraint_mt(mt);
            {
                SubLObject gafs = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject gaf = kb_accessors.complete_extent_enumerable_via_backchain_gaf(predicate, UNPROVIDED);
                            SubLObject var = gaf;
                            if (NIL != var) {
                                gafs = cons(var, gafs);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(gafs);
            }
        }
    }

    /**
     *
     *
     * @return list of gaf-assertion?; a list of gaf assertions, each of which independently
    justify the fact that PREDICATE's extent is completely enumerable in MT via backchaining.
     */
    @LispMethod(comment = "@return list of gaf-assertion?; a list of gaf assertions, each of which independently\r\njustify the fact that PREDICATE\'s extent is completely enumerable in MT via backchaining.")
    public static SubLObject inference_complete_extent_enumerable_via_backchain_gafs_internal(final SubLObject predicate, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = completeness_constraint_mt(mt);
        SubLObject gafs = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject var;
            final SubLObject gaf = var = kb_accessors.complete_extent_enumerable_via_backchain_gaf(predicate, UNPROVIDED);
            if (NIL != var) {
                gafs = cons(var, gafs);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return nreverse(gafs);
    }

    public static final SubLObject inference_complete_extent_enumerable_via_backchain_gafs_alt(SubLObject predicate, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_enumerable_via_backchain_gafs_internal(predicate, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_COMPLETE_EXTENT_ENUMERABLE_VIA_BACKCHAIN_GAFS, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_COMPLETE_EXTENT_ENUMERABLE_VIA_BACKCHAIN_GAFS, TWO_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, INFERENCE_COMPLETE_EXTENT_ENUMERABLE_VIA_BACKCHAIN_GAFS, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw1$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (predicate == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (mt == cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_enumerable_via_backchain_gafs_internal(predicate, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicate, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject inference_complete_extent_enumerable_via_backchain_gafs(final SubLObject predicate, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_complete_extent_enumerable_via_backchain_gafs_internal(predicate, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_COMPLETE_EXTENT_ENUMERABLE_VIA_BACKCHAIN_GAFS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_COMPLETE_EXTENT_ENUMERABLE_VIA_BACKCHAIN_GAFS, TWO_INTEGER, $int$8192, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_COMPLETE_EXTENT_ENUMERABLE_VIA_BACKCHAIN_GAFS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (predicate.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_complete_extent_enumerable_via_backchain_gafs_internal(predicate, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate, mt));
        return memoization_state.caching_results(results3);
    }

    /**
     *
     *
     * @return booleanp; whether COLLECTION is completely enumerable in MT via backchaining.
     */
    @LispMethod(comment = "@return booleanp; whether COLLECTION is completely enumerable in MT via backchaining.")
    public static final SubLObject inference_collection_completely_enumerable_via_backchainP_alt(SubLObject collection, SubLObject mt) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_collection_completely_enumerable_via_backchain_gaf(collection, mt));
    }

    /**
     *
     *
     * @return booleanp; whether COLLECTION is completely enumerable in MT via backchaining.
     */
    @LispMethod(comment = "@return booleanp; whether COLLECTION is completely enumerable in MT via backchaining.")
    public static SubLObject inference_collection_completely_enumerable_via_backchainP(final SubLObject collection, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_collection_completely_enumerable_via_backchain_gaf(collection, mt));
    }

    /**
     *
     *
     * @return nil or gaf-assertion?; a gaf assertion justifying
    the fact that COLLECTION is completely enumerable in MT via backchaining.
     */
    @LispMethod(comment = "@return nil or gaf-assertion?; a gaf assertion justifying\r\nthe fact that COLLECTION is completely enumerable in MT via backchaining.")
    public static final SubLObject inference_collection_completely_enumerable_via_backchain_gaf_alt(SubLObject collection, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            mt = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.completeness_constraint_mt(mt);
            {
                SubLObject gaf = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        gaf = kb_accessors.collection_completely_enumerable_via_backchain_gaf(collection, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return gaf;
            }
        }
    }

    /**
     *
     *
     * @return nil or gaf-assertion?; a gaf assertion justifying
    the fact that COLLECTION is completely enumerable in MT via backchaining.
     */
    @LispMethod(comment = "@return nil or gaf-assertion?; a gaf assertion justifying\r\nthe fact that COLLECTION is completely enumerable in MT via backchaining.")
    public static SubLObject inference_collection_completely_enumerable_via_backchain_gaf(final SubLObject collection, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = completeness_constraint_mt(mt);
        SubLObject gaf = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            gaf = kb_accessors.collection_completely_enumerable_via_backchain_gaf(collection, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return gaf;
    }

    /**
     *
     *
     * @return boolean; whether all bindings for free variables in ASENT
    can be completely enumerated in MT via backchaining.
     */
    @LispMethod(comment = "@return boolean; whether all bindings for free variables in ASENT\r\ncan be completely enumerated in MT via backchaining.")
    public static final SubLObject inference_completely_enumerable_via_backchain_asentP_alt(SubLObject asent, SubLObject mt) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_completely_enumerable_via_backchain_asent_gaf(asent, mt));
    }

    /**
     *
     *
     * @return boolean; whether all bindings for free variables in ASENT
    can be completely enumerated in MT via backchaining.
     */
    @LispMethod(comment = "@return boolean; whether all bindings for free variables in ASENT\r\ncan be completely enumerated in MT via backchaining.")
    public static SubLObject inference_completely_enumerable_via_backchain_asentP(final SubLObject asent, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_completely_enumerable_via_backchain_asent_gaf(asent, mt));
    }

    /**
     *
     *
     * @return nil or gaf-assertion?; if all bindings for free variables in ASENT
    can be completely enumerated in MT via backchaining, return a gaf
    assertion justifying this claim.
     */
    @LispMethod(comment = "@return nil or gaf-assertion?; if all bindings for free variables in ASENT\r\ncan be completely enumerated in MT via backchaining, return a gaf\r\nassertion justifying this claim.")
    public static final SubLObject inference_completely_enumerable_via_backchain_asent_gaf_alt(SubLObject asent, SubLObject mt) {
        return com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_completely_enumerable_via_backchain_asent_gafs(asent, mt).first();
    }

    /**
     *
     *
     * @return nil or gaf-assertion?; if all bindings for free variables in ASENT
    can be completely enumerated in MT via backchaining, return a gaf
    assertion justifying this claim.
     */
    @LispMethod(comment = "@return nil or gaf-assertion?; if all bindings for free variables in ASENT\r\ncan be completely enumerated in MT via backchaining, return a gaf\r\nassertion justifying this claim.")
    public static SubLObject inference_completely_enumerable_via_backchain_asent_gaf(final SubLObject asent, final SubLObject mt) {
        return inference_completely_enumerable_via_backchain_asent_gafs(asent, mt).first();
    }

    /**
     *
     *
     * @return list of gaf-assertion?; if all bindings for free variables in ASENT
    can be completely enumerated in MT via backchaining,  return a list of gaf
    assertions justifying this claim.
     */
    @LispMethod(comment = "@return list of gaf-assertion?; if all bindings for free variables in ASENT\r\ncan be completely enumerated in MT via backchaining,  return a list of gaf\r\nassertions justifying this claim.")
    public static final SubLObject inference_completely_enumerable_via_backchain_asent_gafs_alt(SubLObject asent, SubLObject mt) {
        mt = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.completeness_constraint_mt(mt);
        {
            SubLObject result_gafs = NIL;
            SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            if (NIL != forts.fort_p(predicate)) {
                {
                    SubLObject gafs = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_complete_extent_enumerable_via_backchain_gafs(predicate, mt);
                    if (NIL != gafs) {
                        {
                            SubLObject cdolist_list_var = gafs;
                            SubLObject gaf = NIL;
                            for (gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gaf = cdolist_list_var.first()) {
                                result_gafs = cons(gaf, result_gafs);
                            }
                        }
                    }
                }
                if ($$isa == predicate) {
                    {
                        SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                        if (NIL != forts.fort_p(collection)) {
                            {
                                SubLObject gaf = com.cyc.cycjava.cycl.inference.inference_completeness_utilities.inference_collection_completely_enumerable_via_backchain_gaf(collection, mt);
                                if (NIL != gaf) {
                                    result_gafs = cons(gaf, result_gafs);
                                }
                            }
                        }
                    }
                }
            }
            return nreverse(result_gafs);
        }
    }

    /**
     *
     *
     * @return list of gaf-assertion?; if all bindings for free variables in ASENT
    can be completely enumerated in MT via backchaining,  return a list of gaf
    assertions justifying this claim.
     */
    @LispMethod(comment = "@return list of gaf-assertion?; if all bindings for free variables in ASENT\r\ncan be completely enumerated in MT via backchaining,  return a list of gaf\r\nassertions justifying this claim.")
    public static SubLObject inference_completely_enumerable_via_backchain_asent_gafs(final SubLObject asent, SubLObject mt) {
        mt = completeness_constraint_mt(mt);
        SubLObject result_gafs = NIL;
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (NIL != forts.fort_p(predicate)) {
            final SubLObject gafs = inference_complete_extent_enumerable_via_backchain_gafs(predicate, mt);
            if (NIL != gafs) {
                SubLObject cdolist_list_var = gafs;
                SubLObject gaf = NIL;
                gaf = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    result_gafs = cons(gaf, result_gafs);
                    cdolist_list_var = cdolist_list_var.rest();
                    gaf = cdolist_list_var.first();
                } 
            }
            if ($$isa.eql(predicate)) {
                final SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                if (NIL != forts.fort_p(collection)) {
                    final SubLObject gaf2 = inference_collection_completely_enumerable_via_backchain_gaf(collection, mt);
                    if (NIL != gaf2) {
                        result_gafs = cons(gaf2, result_gafs);
                    }
                }
            }
        }
        return nreverse(result_gafs);
    }

    public static SubLObject declare_inference_completeness_utilities_file() {
        declareFunction("inference_minimize_extentP_internal", "INFERENCE-MINIMIZE-EXTENT?-INTERNAL", 1, 0, false);
        declareFunction("inference_minimize_extentP", "INFERENCE-MINIMIZE-EXTENT?", 1, 0, false);
        declareFunction("inference_complete_extent_assertedP", "INFERENCE-COMPLETE-EXTENT-ASSERTED?", 2, 0, false);
        declareFunction("inference_complete_extent_asserted_gaf", "INFERENCE-COMPLETE-EXTENT-ASSERTED-GAF", 2, 0, false);
        declareFunction("inference_complete_extent_asserted_for_value_in_argP", "INFERENCE-COMPLETE-EXTENT-ASSERTED-FOR-VALUE-IN-ARG?", 4, 0, false);
        declareFunction("inference_complete_extent_asserted_for_value_in_arg_gaf", "INFERENCE-COMPLETE-EXTENT-ASSERTED-FOR-VALUE-IN-ARG-GAF", 4, 0, false);
        declareFunction("inference_complete_extent_asserted_for_value_in_arg_gafs_internal", "INFERENCE-COMPLETE-EXTENT-ASSERTED-FOR-VALUE-IN-ARG-GAFS-INTERNAL", 4, 0, false);
        declareFunction("inference_complete_extent_asserted_for_value_in_arg_gafs", "INFERENCE-COMPLETE-EXTENT-ASSERTED-FOR-VALUE-IN-ARG-GAFS", 4, 0, false);
        declareFunction("inference_complete_extent_enumerableP", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE?", 2, 0, false);
        declareFunction("inference_complete_extent_enumerable_gaf", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-GAF", 2, 0, false);
        declareFunction("inference_complete_extent_enumerable_gafs_internal", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-GAFS-INTERNAL", 2, 0, false);
        declareFunction("inference_complete_extent_enumerable_gafs", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-GAFS", 2, 0, false);
        declareFunction("inference_complete_extent_decidableP", "INFERENCE-COMPLETE-EXTENT-DECIDABLE?", 2, 0, false);
        declareFunction("inference_complete_extent_decidable_gaf", "INFERENCE-COMPLETE-EXTENT-DECIDABLE-GAF", 2, 0, false);
        declareFunction("inference_complete_extent_decidable_gafs_internal", "INFERENCE-COMPLETE-EXTENT-DECIDABLE-GAFS-INTERNAL", 2, 0, false);
        declareFunction("inference_complete_extent_decidable_gafs", "INFERENCE-COMPLETE-EXTENT-DECIDABLE-GAFS", 2, 0, false);
        declareFunction("inference_complete_extent_enumerable_for_argP", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-ARG?", 3, 0, false);
        declareFunction("inference_complete_extent_enumerable_for_arg_gaf", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-ARG-GAF", 3, 0, false);
        declareFunction("inference_complete_extent_enumerable_for_arg_gafs_internal", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-ARG-GAFS-INTERNAL", 3, 0, false);
        declareFunction("inference_complete_extent_enumerable_for_arg_gafs", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-ARG-GAFS", 3, 0, false);
        declareFunction("inference_complete_extent_enumerable_for_value_in_argP", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-VALUE-IN-ARG?", 4, 0, false);
        declareFunction("inference_complete_extent_enumerable_for_value_in_arg_gaf", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-VALUE-IN-ARG-GAF", 4, 0, false);
        declareFunction("inference_complete_extent_enumerable_for_value_in_arg_gafs_internal", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-VALUE-IN-ARG-GAFS-INTERNAL", 4, 0, false);
        declareFunction("inference_complete_extent_enumerable_for_value_in_arg_gafs", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-VALUE-IN-ARG-GAFS", 4, 0, false);
        declareFunction("inference_complete_extent_decidable_for_value_in_argP", "INFERENCE-COMPLETE-EXTENT-DECIDABLE-FOR-VALUE-IN-ARG?", 4, 0, false);
        declareFunction("inference_complete_extent_decidable_for_value_in_arg_gaf", "INFERENCE-COMPLETE-EXTENT-DECIDABLE-FOR-VALUE-IN-ARG-GAF", 4, 0, false);
        declareFunction("inference_complete_extent_decidable_for_value_in_arg_gafs_internal", "INFERENCE-COMPLETE-EXTENT-DECIDABLE-FOR-VALUE-IN-ARG-GAFS-INTERNAL", 4, 0, false);
        declareFunction("inference_complete_extent_decidable_for_value_in_arg_gafs", "INFERENCE-COMPLETE-EXTENT-DECIDABLE-FOR-VALUE-IN-ARG-GAFS", 4, 0, false);
        declareFunction("inference_completely_enumerable_collectionP", "INFERENCE-COMPLETELY-ENUMERABLE-COLLECTION?", 2, 0, false);
        declareFunction("inference_completely_enumerable_collection_gaf", "INFERENCE-COMPLETELY-ENUMERABLE-COLLECTION-GAF", 2, 0, false);
        declareFunction("inference_completely_decidable_collectionP", "INFERENCE-COMPLETELY-DECIDABLE-COLLECTION?", 2, 0, false);
        declareFunction("inference_completely_decidable_collection_gaf", "INFERENCE-COMPLETELY-DECIDABLE-COLLECTION-GAF", 2, 0, false);
        declareFunction("inference_completely_decidable_collection_gafs_internal", "INFERENCE-COMPLETELY-DECIDABLE-COLLECTION-GAFS-INTERNAL", 2, 0, false);
        declareFunction("inference_completely_decidable_collection_gafs", "INFERENCE-COMPLETELY-DECIDABLE-COLLECTION-GAFS", 2, 0, false);
        declareFunction("inference_complete_asentP", "INFERENCE-COMPLETE-ASENT?", 2, 0, false);
        declareFunction("inference_completely_asserted_asentP", "INFERENCE-COMPLETELY-ASSERTED-ASENT?", 2, 0, false);
        declareFunction("inference_completely_asserted_asent_gaf", "INFERENCE-COMPLETELY-ASSERTED-ASENT-GAF", 2, 0, false);
        declareFunction("inference_completely_asserted_asent_gafs", "INFERENCE-COMPLETELY-ASSERTED-ASENT-GAFS", 2, 0, false);
        declareFunction("inference_completely_enumerable_asentP", "INFERENCE-COMPLETELY-ENUMERABLE-ASENT?", 2, 0, false);
        declareFunction("inference_completely_enumerable_asent_gaf", "INFERENCE-COMPLETELY-ENUMERABLE-ASENT-GAF", 2, 0, false);
        declareFunction("inference_completely_enumerable_asent_gafs", "INFERENCE-COMPLETELY-ENUMERABLE-ASENT-GAFS", 2, 0, false);
        declareFunction("inference_completely_decidable_asentP", "INFERENCE-COMPLETELY-DECIDABLE-ASENT?", 2, 0, false);
        declareFunction("inference_completely_decidable_asent_gaf", "INFERENCE-COMPLETELY-DECIDABLE-ASENT-GAF", 2, 0, false);
        declareFunction("inference_completely_decidable_asent_gafs", "INFERENCE-COMPLETELY-DECIDABLE-ASENT-GAFS", 2, 0, false);
        declareFunction("completeness_constraint_mt", "COMPLETENESS-CONSTRAINT-MT", 1, 0, false);
        declareFunction("inference_complete_extent_enumerable_via_backchainP", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-VIA-BACKCHAIN?", 2, 0, false);
        declareFunction("inference_complete_extent_enumerable_via_backchain_gaf", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-VIA-BACKCHAIN-GAF", 2, 0, false);
        declareFunction("inference_complete_extent_enumerable_via_backchain_gafs_internal", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-VIA-BACKCHAIN-GAFS-INTERNAL", 2, 0, false);
        declareFunction("inference_complete_extent_enumerable_via_backchain_gafs", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-VIA-BACKCHAIN-GAFS", 2, 0, false);
        declareFunction("inference_collection_completely_enumerable_via_backchainP", "INFERENCE-COLLECTION-COMPLETELY-ENUMERABLE-VIA-BACKCHAIN?", 2, 0, false);
        declareFunction("inference_collection_completely_enumerable_via_backchain_gaf", "INFERENCE-COLLECTION-COMPLETELY-ENUMERABLE-VIA-BACKCHAIN-GAF", 2, 0, false);
        declareFunction("inference_completely_enumerable_via_backchain_asentP", "INFERENCE-COMPLETELY-ENUMERABLE-VIA-BACKCHAIN-ASENT?", 2, 0, false);
        declareFunction("inference_completely_enumerable_via_backchain_asent_gaf", "INFERENCE-COMPLETELY-ENUMERABLE-VIA-BACKCHAIN-ASENT-GAF", 2, 0, false);
        declareFunction("inference_completely_enumerable_via_backchain_asent_gafs", "INFERENCE-COMPLETELY-ENUMERABLE-VIA-BACKCHAIN-ASENT-GAFS", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_completeness_utilities_file() {
        return NIL;
    }

    public static SubLObject setup_inference_completeness_utilities_file() {
        memoization_state.note_memoized_function($sym0$INFERENCE_MINIMIZE_EXTENT_);
        memoization_state.note_memoized_function(INFERENCE_COMPLETE_EXTENT_ASSERTED_FOR_VALUE_IN_ARG_GAFS);
        memoization_state.note_memoized_function(INFERENCE_COMPLETE_EXTENT_ENUMERABLE_GAFS);
        memoization_state.note_memoized_function(INFERENCE_COMPLETE_EXTENT_DECIDABLE_GAFS);
        memoization_state.note_memoized_function(INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_ARG_GAFS);
        memoization_state.note_memoized_function(INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_VALUE_IN_ARG_GAFS);
        memoization_state.note_memoized_function(INFERENCE_COMPLETE_EXTENT_DECIDABLE_FOR_VALUE_IN_ARG_GAFS);
        memoization_state.note_memoized_function(INFERENCE_COMPLETELY_DECIDABLE_COLLECTION_GAFS);
        memoization_state.note_memoized_function(INFERENCE_COMPLETE_EXTENT_ENUMERABLE_VIA_BACKCHAIN_GAFS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_completeness_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_completeness_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_completeness_utilities_file();
    }

    static {
    }

    public static final SubLSymbol $kw1$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
}

/**
 * Total time: 207 ms
 */
