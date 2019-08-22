package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$most_positive_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.log;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.truncate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class relationship_generality_estimates extends SubLTranslatedFile {
    public static final SubLFile me = new relationship_generality_estimates();

    public static final String myName = "com.cyc.cycjava.cycl.relationship_generality_estimates";

    public static final String myFingerPrint = "7fce423eaab815f10c5d8eb98d97c268c0dbebe3e0714ec2761e0d5e064995e8";





    private static final SubLObject $$argIsa = reader_make_constant_shell(makeString("argIsa"));

    private static final SubLObject $$argGenl = reader_make_constant_shell(makeString("argGenl"));

    private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));

    public static final SubLSymbol RELATION_GENERALITY_ESTIMATE_CACHED = makeSymbol("RELATION-GENERALITY-ESTIMATE-CACHED");

    private static final SubLFloat $float$1_0 = makeDouble(1.0);



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));



    public static final SubLSymbol $relation_generality_estimate_cached_caching_state$ = makeSymbol("*RELATION-GENERALITY-ESTIMATE-CACHED-CACHING-STATE*");



    private static final SubLSymbol RELATION_MOST_RESTRICTED_ARG = makeSymbol("RELATION-MOST-RESTRICTED-ARG");

    private static final SubLSymbol $relation_most_restricted_arg_caching_state$ = makeSymbol("*RELATION-MOST-RESTRICTED-ARG-CACHING-STATE*");

    public static SubLObject relation_arg_cardinality(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject collection = relation_most_restricted_arg_constraint(relation, argnum, mt);
        final SubLObject constraint = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject pcase_var = constraint;
        if (pcase_var.eql($$argIsa)) {
            return cardinality_estimates.instance_cardinality(collection);
        }
        if (pcase_var.eql($$argGenl)) {
            return cardinality_estimates.spec_cardinality(collection);
        }
        return cardinality_estimates.instance_cardinality($$Thing);
    }

    public static SubLObject relation_generality_estimate(final SubLObject relation) {
        if (NIL == forts.fort_p(relation)) {
            return ZERO_INTEGER;
        }
        return relation_generality_estimate_cached(relation);
    }

    public static SubLObject clear_relation_generality_estimate_cached() {
        final SubLObject cs = $relation_generality_estimate_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_relation_generality_estimate_cached(final SubLObject relation) {
        return memoization_state.caching_state_remove_function_results_with_args($relation_generality_estimate_cached_caching_state$.getGlobalValue(), list(relation), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject relation_generality_estimate_cached_internal(final SubLObject relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = $float$1_0;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject v_arity = arity.min_arity(relation);
            if (NIL != v_arity) {
                SubLObject i;
                SubLObject argnum;
                SubLObject arg_cardinality;
                for (i = NIL, i = ZERO_INTEGER; i.numL(v_arity); i = add(i, ONE_INTEGER)) {
                    argnum = add(i, ONE_INTEGER);
                    arg_cardinality = relation_arg_cardinality(relation, argnum, NIL);
                    total = multiply(total, arg_cardinality);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (!total.isPositive()) {
            return ZERO_INTEGER;
        }
        return values(truncate(multiply($int$1000, log(total, TWO_INTEGER)), UNPROVIDED));
    }

    public static SubLObject relation_generality_estimate_cached(final SubLObject relation) {
        SubLObject caching_state = $relation_generality_estimate_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(RELATION_GENERALITY_ESTIMATE_CACHED, $relation_generality_estimate_cached_caching_state$, NIL, EQL, ONE_INTEGER, $int$100);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, relation, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(relation_generality_estimate_cached_internal(relation)));
            memoization_state.caching_state_put(caching_state, relation, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_relation_most_restricted_arg() {
        final SubLObject cs = $relation_most_restricted_arg_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_relation_most_restricted_arg(final SubLObject relation) {
        return memoization_state.caching_state_remove_function_results_with_args($relation_most_restricted_arg_caching_state$.getGlobalValue(), list(relation), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject relation_most_restricted_arg_internal(final SubLObject relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject best_cardinality = $most_positive_fixnum$.getGlobalValue();
        SubLObject best_argnum = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject v_arity = arity.min_arity(relation);
            if (NIL != v_arity) {
                SubLObject i;
                SubLObject argnum;
                SubLObject arg_cardinality;
                for (i = NIL, i = ZERO_INTEGER; i.numL(v_arity); i = add(i, ONE_INTEGER)) {
                    argnum = add(i, ONE_INTEGER);
                    arg_cardinality = relation_arg_cardinality(relation, argnum, NIL);
                    if (arg_cardinality.numL(best_cardinality)) {
                        best_cardinality = arg_cardinality;
                        best_argnum = argnum;
                    }
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return best_argnum;
    }

    public static SubLObject relation_most_restricted_arg(final SubLObject relation) {
        SubLObject caching_state = $relation_most_restricted_arg_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(RELATION_MOST_RESTRICTED_ARG, $relation_most_restricted_arg_caching_state$, NIL, EQL, ONE_INTEGER, TEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, relation, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(relation_most_restricted_arg_internal(relation)));
            memoization_state.caching_state_put(caching_state, relation, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject relation_most_restricted_arg_constraint(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject best_collection = $$Thing;
        SubLObject best_constraint = $$argIsa;
        SubLObject best_count = cardinality_estimates.instance_cardinality(best_collection);
        SubLObject cdolist_list_var;
        SubLObject candidates = cdolist_list_var = kb_accessors.min_argn_isa(relation, argnum, mt);
        SubLObject candidate = NIL;
        candidate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject count = cardinality_estimates.instance_cardinality(candidate);
            if (count.numL(best_count)) {
                best_collection = candidate;
                best_constraint = $$argIsa;
                best_count = count;
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate = cdolist_list_var.first();
        } 
        candidates = cdolist_list_var = kb_accessors.min_argn_genl(relation, argnum, mt);
        candidate = NIL;
        candidate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject count = cardinality_estimates.spec_cardinality(candidate);
            if (count.numL(best_count)) {
                best_collection = candidate;
                best_constraint = $$argGenl;
                best_count = count;
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate = cdolist_list_var.first();
        } 
        return values(best_collection, best_constraint);
    }

    public static SubLObject relation_generality_estimateL(final SubLObject relation1, final SubLObject relation2) {
        return numL(relation_generality_estimate(relation1), relation_generality_estimate(relation2));
    }

    public static SubLObject declare_relationship_generality_estimates_file() {
        declareFunction(me, "relation_arg_cardinality", "RELATION-ARG-CARDINALITY", 2, 1, false);
        declareFunction(me, "relation_generality_estimate", "RELATION-GENERALITY-ESTIMATE", 1, 0, false);
        declareFunction(me, "clear_relation_generality_estimate_cached", "CLEAR-RELATION-GENERALITY-ESTIMATE-CACHED", 0, 0, false);
        declareFunction(me, "remove_relation_generality_estimate_cached", "REMOVE-RELATION-GENERALITY-ESTIMATE-CACHED", 1, 0, false);
        declareFunction(me, "relation_generality_estimate_cached_internal", "RELATION-GENERALITY-ESTIMATE-CACHED-INTERNAL", 1, 0, false);
        declareFunction(me, "relation_generality_estimate_cached", "RELATION-GENERALITY-ESTIMATE-CACHED", 1, 0, false);
        declareFunction(me, "clear_relation_most_restricted_arg", "CLEAR-RELATION-MOST-RESTRICTED-ARG", 0, 0, false);
        declareFunction(me, "remove_relation_most_restricted_arg", "REMOVE-RELATION-MOST-RESTRICTED-ARG", 1, 0, false);
        declareFunction(me, "relation_most_restricted_arg_internal", "RELATION-MOST-RESTRICTED-ARG-INTERNAL", 1, 0, false);
        declareFunction(me, "relation_most_restricted_arg", "RELATION-MOST-RESTRICTED-ARG", 1, 0, false);
        declareFunction(me, "relation_most_restricted_arg_constraint", "RELATION-MOST-RESTRICTED-ARG-CONSTRAINT", 2, 1, false);
        declareFunction(me, "relation_generality_estimateL", "RELATION-GENERALITY-ESTIMATE<", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_relationship_generality_estimates_file() {
        deflexical("*RELATION-GENERALITY-ESTIMATE-CACHED-CACHING-STATE*", NIL);
        deflexical("*RELATION-MOST-RESTRICTED-ARG-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_relationship_generality_estimates_file() {
        memoization_state.note_globally_cached_function(RELATION_GENERALITY_ESTIMATE_CACHED);
        memoization_state.note_globally_cached_function(RELATION_MOST_RESTRICTED_ARG);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_relationship_generality_estimates_file();
    }

    @Override
    public void initializeVariables() {
        init_relationship_generality_estimates_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_relationship_generality_estimates_file();
    }

    
}

/**
 * Total time: 166 ms
 */
