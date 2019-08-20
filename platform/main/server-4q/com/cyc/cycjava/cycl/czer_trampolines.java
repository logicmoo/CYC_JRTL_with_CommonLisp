/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class czer_trampolines extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new czer_trampolines();



    private static final SubLSymbol CZER_ARGN_QUOTED_ISA_INT = makeSymbol("CZER-ARGN-QUOTED-ISA-INT");





    // Definitions
    public static final SubLObject czer_memoization_state_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return czer_vars.$czer_memoization_state$.getDynamicValue(thread);
        }
    }

    // Definitions
    public static SubLObject czer_memoization_state() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return czer_vars.$czer_memoization_state$.getDynamicValue(thread);
    }

    public static final SubLObject within_czer_memoization_stateP_alt() {
        return memoization_state.memoization_state_p(com.cyc.cycjava.cycl.czer_trampolines.czer_memoization_state());
    }

    public static SubLObject within_czer_memoization_stateP() {
        return memoization_state.memoization_state_p(czer_memoization_state());
    }

    public static final SubLObject czer_scoping_formulaP_alt(SubLObject formula) {
        if (NIL != el_formula_p(formula)) {
            {
                SubLObject relation = cycl_utilities.formula_operator(formula);
                return fort_types_interface.isa_scoping_relationP(relation, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject czer_scoping_formulaP(final SubLObject formula) {
        if (NIL != el_formula_p(formula)) {
            final SubLObject relation = cycl_utilities.formula_operator(formula);
            return fort_types_interface.isa_scoping_relationP(relation, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject czer_scoping_args_alt(SubLObject relation) {
        return kb_accessors.scoping_args(relation, UNPROVIDED);
    }

    public static SubLObject czer_scoping_args(final SubLObject relation) {
        return kb_accessors.scoping_args(relation, UNPROVIDED);
    }

    /**
     * Returns list of cyc-var? or escape quoted (quasi quoted) cyc-var?
     */
    @LispMethod(comment = "Returns list of cyc-var? or escape quoted (quasi quoted) cyc-var?")
    public static final SubLObject czer_scoped_vars_alt(SubLObject formula) {
        {
            SubLObject relation = cycl_utilities.formula_operator(formula);
            SubLObject scoped_vars = NIL;
            if (NIL != forts.fort_p(relation)) {
                {
                    SubLObject scoping_argnums = com.cyc.cycjava.cycl.czer_trampolines.czer_scoping_args(relation);
                    SubLObject el_var_listP = cycl_grammar.el_var_list_operator_p(relation);
                    SubLObject argnum = ZERO_INTEGER;
                    SubLObject args = cycl_utilities.formula_args(formula, $IGNORE);
                    SubLObject cdolist_list_var = args;
                    SubLObject arg = NIL;
                    for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                        argnum = add(argnum, ONE_INTEGER);
                        if (NIL != subl_promotions.memberP(argnum, scoping_argnums, UNPROVIDED, UNPROVIDED)) {
                            if (NIL != el_var_listP) {
                                {
                                    SubLObject terms = cycl_utilities.formula_terms(arg, $REGULARIZE);
                                    SubLObject cdolist_list_var_1 = terms;
                                    SubLObject var = NIL;
                                    for (var = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , var = cdolist_list_var_1.first()) {
                                        scoped_vars = cons(var, scoped_vars);
                                    }
                                }
                            } else {
                                if (NIL != cycl_variables.cyc_varP(arg)) {
                                    scoped_vars = cons(arg, scoped_vars);
                                } else {
                                    if (((NIL != cycl_grammar.fast_escape_quote_term_p(arg)) || (NIL != cycl_grammar.fast_quasi_quote_term_p(arg))) || (NIL != cycl_variables.cyc_varP(cycl_utilities.formula_arg1(arg, UNPROVIDED)))) {
                                        scoped_vars = cons(arg, scoped_vars);
                                    } else {
                                        if (NIL != el_formula_p(arg)) {
                                            {
                                                SubLObject terms = cycl_utilities.formula_terms(arg, $IGNORE);
                                                SubLObject cdolist_list_var_2 = terms;
                                                SubLObject sub_arg = NIL;
                                                for (sub_arg = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , sub_arg = cdolist_list_var_2.first()) {
                                                    if (NIL != cycl_variables.cyc_varP(sub_arg)) {
                                                        scoped_vars = cons(sub_arg, scoped_vars);
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
            return nreverse(scoped_vars);
        }
    }

    /**
     * Returns list of cyc-var? or escape quoted (quasi quoted) cyc-var?
     */
    @LispMethod(comment = "Returns list of cyc-var? or escape quoted (quasi quoted) cyc-var?")
    public static SubLObject czer_scoped_vars(final SubLObject formula) {
        final SubLObject relation = cycl_utilities.formula_operator(formula);
        SubLObject scoped_vars = NIL;
        if (NIL != forts.fort_p(relation)) {
            final SubLObject scoping_argnums = czer_scoping_args(relation);
            final SubLObject el_var_listP = cycl_grammar.el_var_list_operator_p(relation);
            SubLObject argnum = ZERO_INTEGER;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(formula, $IGNORE);
            SubLObject arg = NIL;
            arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                argnum = add(argnum, ONE_INTEGER);
                if (NIL != subl_promotions.memberP(argnum, scoping_argnums, UNPROVIDED, UNPROVIDED)) {
                    if (NIL != el_var_listP) {
                        SubLObject cdolist_list_var_$1;
                        final SubLObject terms = cdolist_list_var_$1 = cycl_utilities.formula_terms(arg, $REGULARIZE);
                        SubLObject var = NIL;
                        var = cdolist_list_var_$1.first();
                        while (NIL != cdolist_list_var_$1) {
                            scoped_vars = cons(var, scoped_vars);
                            cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                            var = cdolist_list_var_$1.first();
                        } 
                    } else
                        if (NIL != cycl_variables.cyc_varP(arg)) {
                            scoped_vars = cons(arg, scoped_vars);
                        } else
                            if (((NIL != cycl_grammar.fast_escape_quote_term_p(arg)) || (NIL != cycl_grammar.fast_quasi_quote_term_p(arg))) || (NIL != cycl_variables.cyc_varP(cycl_utilities.formula_arg1(arg, UNPROVIDED)))) {
                                scoped_vars = cons(arg, scoped_vars);
                            } else
                                if (NIL != el_formula_p(arg)) {
                                    SubLObject cdolist_list_var_$2;
                                    final SubLObject terms = cdolist_list_var_$2 = cycl_utilities.formula_terms(arg, $IGNORE);
                                    SubLObject sub_arg = NIL;
                                    sub_arg = cdolist_list_var_$2.first();
                                    while (NIL != cdolist_list_var_$2) {
                                        if (NIL != cycl_variables.cyc_varP(sub_arg)) {
                                            scoped_vars = cons(sub_arg, scoped_vars);
                                        }
                                        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                                        sub_arg = cdolist_list_var_$2.first();
                                    } 
                                }



                }
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            } 
        }
        return nreverse(scoped_vars);
    }

    public static final SubLObject czer_argn_quoted_isa_int_internal_alt(SubLObject relation, SubLObject argnum, SubLObject mt_info) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_EVERYTHING)) {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            result = kb_accessors.argn_quoted_isa_int(relation, argnum, NIL);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_ANY_MT)) {
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                                mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                                result = kb_accessors.argn_quoted_isa_int(relation, argnum, NIL);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } else {
                        if (NIL != hlmt.mt_union_naut_p(mt_info)) {
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                                    mt_relevance_macros.$relevant_mts$.bind(hlmt.mt_union_mts(mt_info), thread);
                                    result = kb_accessors.argn_quoted_isa_int(relation, argnum, NIL);
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } else {
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                                    mt_relevance_macros.$mt$.bind(mt_info, thread);
                                    result = kb_accessors.argn_quoted_isa_int(relation, argnum, NIL);
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject czer_argn_quoted_isa_int_internal(final SubLObject relation, final SubLObject argnum, final SubLObject mt_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_EVERYTHING)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                result = kb_accessors.argn_quoted_isa_int(relation, argnum, NIL);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } else
            if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_ANY_MT)) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                    mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                    result = kb_accessors.argn_quoted_isa_int(relation, argnum, NIL);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            } else
                if (NIL != hlmt.mt_union_naut_p(mt_info)) {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                        mt_relevance_macros.$relevant_mts$.bind(hlmt.mt_union_mts(mt_info), thread);
                        result = kb_accessors.argn_quoted_isa_int(relation, argnum, NIL);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                } else {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(mt_info, thread);
                        result = kb_accessors.argn_quoted_isa_int(relation, argnum, NIL);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }


        return result;
    }

    public static final SubLObject czer_argn_quoted_isa_int_alt(SubLObject relation, SubLObject argnum, SubLObject mt_info) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.czer_trampolines.czer_argn_quoted_isa_int_internal(relation, argnum, mt_info);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, CZER_ARGN_QUOTED_ISA_INT, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), CZER_ARGN_QUOTED_ISA_INT, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, CZER_ARGN_QUOTED_ISA_INT, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(relation, argnum, mt_info);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw9$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (relation.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (argnum.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.czer_trampolines.czer_argn_quoted_isa_int_internal(relation, argnum, mt_info)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(relation, argnum, mt_info));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject czer_argn_quoted_isa_int(final SubLObject relation, final SubLObject argnum, final SubLObject mt_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return czer_argn_quoted_isa_int_internal(relation, argnum, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, CZER_ARGN_QUOTED_ISA_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), CZER_ARGN_QUOTED_ISA_INT, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, CZER_ARGN_QUOTED_ISA_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(relation, argnum, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (relation.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (argnum.equal(cached_args.first())) {
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
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(czer_argn_quoted_isa_int_internal(relation, argnum, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(relation, argnum, mt_info));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject declare_czer_trampolines_file() {
        declareFunction("czer_memoization_state", "CZER-MEMOIZATION-STATE", 0, 0, false);
        declareFunction("within_czer_memoization_stateP", "WITHIN-CZER-MEMOIZATION-STATE?", 0, 0, false);
        declareFunction("czer_scoping_formulaP", "CZER-SCOPING-FORMULA?", 1, 0, false);
        declareFunction("czer_scoping_args", "CZER-SCOPING-ARGS", 1, 0, false);
        declareFunction("czer_scoped_vars", "CZER-SCOPED-VARS", 1, 0, false);
        declareFunction("czer_argn_quoted_isa_int_internal", "CZER-ARGN-QUOTED-ISA-INT-INTERNAL", 3, 0, false);
        declareFunction("czer_argn_quoted_isa_int", "CZER-ARGN-QUOTED-ISA-INT", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_czer_trampolines_file() {
        return NIL;
    }

    public static SubLObject setup_czer_trampolines_file() {
        memoization_state.note_memoized_function(CZER_ARGN_QUOTED_ISA_INT);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_czer_trampolines_file();
    }

    @Override
    public void initializeVariables() {
        init_czer_trampolines_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_czer_trampolines_file();
    }

    static {
    }

    public static final SubLSymbol $kw9$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
}

/**
 * Total time: 199 ms
 */
