/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference;


import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.forts.fort_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      LILLIPUT-CACHES
 * source file: /cyc/top/cycl/inference/lilliput-caches.lisp
 * created:     2019/07/03 17:37:43
 */
public final class lilliput_caches extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new lilliput_caches();

 public static final String myName = "com.cyc.cycjava.cycl.inference.lilliput_caches";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol LILLIPUT_ALL_INSTANCES = makeSymbol("LILLIPUT-ALL-INSTANCES");



    public static final SubLSymbol $lilliput_all_instances_caching_state$ = makeSymbol("*LILLIPUT-ALL-INSTANCES-CACHING-STATE*");

    private static final SubLSymbol LILLIPUT_ALL_INSTANCES_IF_TKB_FORT = makeSymbol("LILLIPUT-ALL-INSTANCES-IF-TKB-FORT");

    private static final SubLSymbol $sym5$TKB_FORT_ = makeSymbol("TKB-FORT?");

    private static final SubLSymbol $lilliput_all_instances_if_tkb_fort_caching_state$ = makeSymbol("*LILLIPUT-ALL-INSTANCES-IF-TKB-FORT-CACHING-STATE*");

    private static final SubLSymbol ALL_VALID_LILLIPUT_QUERIES = makeSymbol("ALL-VALID-LILLIPUT-QUERIES");



    private static final SubLString $str14$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLString $$$continue_anyway = makeString("continue anyway");

    private static final SubLString $str19$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLString $str20$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    static private final SubLString $str21$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLList $list22 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    static private final SubLString $str23$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    public static final SubLSymbol $all_valid_lilliput_queries_caching_state$ = makeSymbol("*ALL-VALID-LILLIPUT-QUERIES-CACHING-STATE*");

    public static final SubLObject clear_lilliput_all_instances_alt() {
        {
            SubLObject cs = $lilliput_all_instances_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_lilliput_all_instances() {
        final SubLObject cs = $lilliput_all_instances_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_lilliput_all_instances_alt(SubLObject collection) {
        return memoization_state.caching_state_remove_function_results_with_args($lilliput_all_instances_caching_state$.getGlobalValue(), list(collection), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_lilliput_all_instances(final SubLObject collection) {
        return memoization_state.caching_state_remove_function_results_with_args($lilliput_all_instances_caching_state$.getGlobalValue(), list(collection), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject lilliput_all_instances_internal_alt(SubLObject collection) {
        if (NIL != el_formula_with_operator_p(collection, $$SpecsFn)) {
            return genls.all_specs(cycl_utilities.formula_arg1(collection, UNPROVIDED), lilliput.$lilliput_mt$.getGlobalValue(), UNPROVIDED);
        } else {
            SubLTrampolineFile.checkType(collection, FORT_P);
            return isa.all_instances(collection, lilliput.$lilliput_mt$.getGlobalValue(), UNPROVIDED);
        }
    }

    public static SubLObject lilliput_all_instances_internal(final SubLObject collection) {
        if (NIL != el_formula_with_operator_p(collection, $$SpecsFn)) {
            return genls.all_specs(cycl_utilities.formula_arg1(collection, UNPROVIDED), lilliput.$lilliput_mt$.getGlobalValue(), UNPROVIDED);
        }
        assert NIL != forts.fort_p(collection) : "! forts.fort_p(collection) " + ("forts.fort_p(collection) " + "CommonSymbols.NIL != forts.fort_p(collection) ") + collection;
        return isa.all_instances(collection, lilliput.$lilliput_mt$.getGlobalValue(), UNPROVIDED);
    }

    public static final SubLObject lilliput_all_instances_alt(SubLObject collection) {
        {
            SubLObject caching_state = $lilliput_all_instances_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(LILLIPUT_ALL_INSTANCES, $lilliput_all_instances_caching_state$, NIL, EQ, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, collection, $kw4$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw4$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.lilliput_caches.lilliput_all_instances_internal(collection)));
                    memoization_state.caching_state_put(caching_state, collection, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject lilliput_all_instances(final SubLObject collection) {
        SubLObject caching_state = $lilliput_all_instances_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(LILLIPUT_ALL_INSTANCES, $lilliput_all_instances_caching_state$, NIL, EQ, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, collection, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(lilliput_all_instances_internal(collection)));
            memoization_state.caching_state_put(caching_state, collection, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject clear_lilliput_all_instances_if_tkb_fort_alt() {
        {
            SubLObject cs = $lilliput_all_instances_if_tkb_fort_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_lilliput_all_instances_if_tkb_fort() {
        final SubLObject cs = $lilliput_all_instances_if_tkb_fort_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_lilliput_all_instances_if_tkb_fort_alt(SubLObject collection) {
        return memoization_state.caching_state_remove_function_results_with_args($lilliput_all_instances_if_tkb_fort_caching_state$.getGlobalValue(), list(collection), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_lilliput_all_instances_if_tkb_fort(final SubLObject collection) {
        return memoization_state.caching_state_remove_function_results_with_args($lilliput_all_instances_if_tkb_fort_caching_state$.getGlobalValue(), list(collection), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject lilliput_all_instances_if_tkb_fort_internal_alt(SubLObject collection) {
        if (NIL != el_formula_with_operator_p(collection, $$SpecsFn)) {
            return genls.all_specs_if($sym6$TKB_FORT_, cycl_utilities.formula_arg1(collection, UNPROVIDED), lilliput.$lilliput_mt$.getGlobalValue(), UNPROVIDED);
        } else {
            SubLTrampolineFile.checkType(collection, FORT_P);
            return isa.all_instances_if($sym6$TKB_FORT_, collection, lilliput.$lilliput_mt$.getGlobalValue(), UNPROVIDED);
        }
    }

    public static SubLObject lilliput_all_instances_if_tkb_fort_internal(final SubLObject collection) {
        if (NIL != el_formula_with_operator_p(collection, $$SpecsFn)) {
            return genls.all_specs_if($sym5$TKB_FORT_, cycl_utilities.formula_arg1(collection, UNPROVIDED), lilliput.$lilliput_mt$.getGlobalValue(), UNPROVIDED);
        }
        assert NIL != forts.fort_p(collection) : "! forts.fort_p(collection) " + ("forts.fort_p(collection) " + "CommonSymbols.NIL != forts.fort_p(collection) ") + collection;
        return isa.all_instances_if($sym5$TKB_FORT_, collection, lilliput.$lilliput_mt$.getGlobalValue(), UNPROVIDED);
    }

    public static final SubLObject lilliput_all_instances_if_tkb_fort_alt(SubLObject collection) {
        {
            SubLObject caching_state = $lilliput_all_instances_if_tkb_fort_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(LILLIPUT_ALL_INSTANCES_IF_TKB_FORT, $lilliput_all_instances_if_tkb_fort_caching_state$, NIL, EQ, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, collection, $kw4$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw4$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.lilliput_caches.lilliput_all_instances_if_tkb_fort_internal(collection)));
                    memoization_state.caching_state_put(caching_state, collection, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject lilliput_all_instances_if_tkb_fort(final SubLObject collection) {
        SubLObject caching_state = $lilliput_all_instances_if_tkb_fort_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(LILLIPUT_ALL_INSTANCES_IF_TKB_FORT, $lilliput_all_instances_if_tkb_fort_caching_state$, NIL, EQ, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, collection, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(lilliput_all_instances_if_tkb_fort_internal(collection)));
            memoization_state.caching_state_put(caching_state, collection, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject clear_all_valid_lilliput_queries_alt() {
        {
            SubLObject cs = $all_valid_lilliput_queries_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_all_valid_lilliput_queries() {
        final SubLObject cs = $all_valid_lilliput_queries_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_all_valid_lilliput_queries_alt() {
        return memoization_state.caching_state_remove_function_results_with_args($all_valid_lilliput_queries_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_all_valid_lilliput_queries() {
        return memoization_state.caching_state_remove_function_results_with_args($all_valid_lilliput_queries_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject all_valid_lilliput_queries_internal_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject queries = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lilliput.$lilliput_mt$.getGlobalValue());
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject node_var = lilliput.$lilliput_master_query_collection$.getGlobalValue();
                            {
                                SubLObject _prev_bind_0_1 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                SubLObject _prev_bind_1_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                try {
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                                    sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    {
                                        SubLObject node_var_3 = node_var;
                                        SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                                        SubLObject recur_deck = deck.create_deck(deck_type);
                                        {
                                            SubLObject _prev_bind_0_4 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                {
                                                    SubLObject tv_var = NIL;
                                                    {
                                                        SubLObject _prev_bind_0_5 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_6 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                        try {
                                                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                            if (NIL != tv_var) {
                                                                if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                    if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                        {
                                                                            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                            if (pcase_var.eql($ERROR)) {
                                                                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt15$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            } else {
                                                                                if (pcase_var.eql($CERROR)) {
                                                                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt15$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                } else {
                                                                                    if (pcase_var.eql($WARN)) {
                                                                                        Errors.warn($str_alt15$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                    } else {
                                                                                        Errors.warn($str_alt20$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                        Errors.cerror($$$continue_anyway, $str_alt15$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            {
                                                                SubLObject _prev_bind_0_7 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_8 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_9 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
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
                                                                            SubLObject _prev_bind_0_10 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                            SubLObject _prev_bind_1_11 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                            SubLObject _prev_bind_2_12 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var_3, UNPROVIDED);
                                                                                while (NIL != node_var_3) {
                                                                                    {
                                                                                        SubLObject tt_node_var = node_var_3;
                                                                                        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                                                        SubLObject cdolist_list_var = accessible_modules;
                                                                                        SubLObject module_var = NIL;
                                                                                        for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                            {
                                                                                                SubLObject _prev_bind_0_13 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                SubLObject _prev_bind_1_14 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                                                                                                                                SubLObject _prev_bind_0_15 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                    {
                                                                                                                                                        SubLObject iteration_state_16 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_16)) {
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            {
                                                                                                                                                                SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_16);
                                                                                                                                                                SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject _prev_bind_0_17 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                        try {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                SubLObject cdolist_list_var_18 = new_list;
                                                                                                                                                                                SubLObject query = NIL;
                                                                                                                                                                                for (query = cdolist_list_var_18.first(); NIL != cdolist_list_var_18; cdolist_list_var_18 = cdolist_list_var_18.rest() , query = cdolist_list_var_18.first()) {
                                                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                                                        if (NIL != fort_p(query)) {
                                                                                                                                                                                            if (lilliput.lilliput_query_type(query) != lilliput.$lilliput_master_query_collection$.getGlobalValue()) {
                                                                                                                                                                                                queries = cons(query, queries);
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        } finally {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_17, thread);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                iteration_state_16 = dictionary_contents.do_dictionary_contents_next(iteration_state_16);
                                                                                                                                                            }
                                                                                                                                                        } 
                                                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_16);
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_15, thread);
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
                                                                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt21$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
                                                                                                                            destructuring_bind_must_consp(current, datum, $list_alt22);
                                                                                                                            link_node = current.first();
                                                                                                                            current = current.rest();
                                                                                                                            destructuring_bind_must_consp(current, datum, $list_alt22);
                                                                                                                            mt = current.first();
                                                                                                                            current = current.rest();
                                                                                                                            destructuring_bind_must_consp(current, datum, $list_alt22);
                                                                                                                            tv = current.first();
                                                                                                                            current = current.rest();
                                                                                                                            if (NIL == current) {
                                                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                    {
                                                                                                                                        SubLObject _prev_bind_0_19 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                        try {
                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                {
                                                                                                                                                    SubLObject _prev_bind_0_20 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                    try {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                        {
                                                                                                                                                            SubLObject link_nodes = list(link_node);
                                                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                            SubLObject cdolist_list_var_21 = new_list;
                                                                                                                                                            SubLObject query = NIL;
                                                                                                                                                            for (query = cdolist_list_var_21.first(); NIL != cdolist_list_var_21; cdolist_list_var_21 = cdolist_list_var_21.rest() , query = cdolist_list_var_21.first()) {
                                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                                    if (NIL != fort_p(query)) {
                                                                                                                                                                        if (lilliput.lilliput_query_type(query) != lilliput.$lilliput_master_query_collection$.getGlobalValue()) {
                                                                                                                                                                            queries = cons(query, queries);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    } finally {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_20, thread);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        } finally {
                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_19, thread);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                cdestructuring_bind_error(datum, $list_alt22);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                {
                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                    SubLObject cdolist_list_var_22 = new_list;
                                                                                                                    SubLObject generating_fn = NIL;
                                                                                                                    for (generating_fn = cdolist_list_var_22.first(); NIL != cdolist_list_var_22; cdolist_list_var_22 = cdolist_list_var_22.rest() , generating_fn = cdolist_list_var_22.first()) {
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_23 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                {
                                                                                                                                    SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                    SubLObject new_list_24 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                    SubLObject cdolist_list_var_25 = new_list_24;
                                                                                                                                    SubLObject query = NIL;
                                                                                                                                    for (query = cdolist_list_var_25.first(); NIL != cdolist_list_var_25; cdolist_list_var_25 = cdolist_list_var_25.rest() , query = cdolist_list_var_25.first()) {
                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                            if (NIL != fort_p(query)) {
                                                                                                                                                if (lilliput.lilliput_query_type(query) != lilliput.$lilliput_master_query_collection$.getGlobalValue()) {
                                                                                                                                                    queries = cons(query, queries);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } finally {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_23, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } finally {
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_14, thread);
                                                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_13, thread);
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
                                                                                                SubLObject _prev_bind_0_26 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                SubLObject _prev_bind_1_27 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                    {
                                                                                                        SubLObject node = function_terms.naut_to_nart(node_var_3);
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
                                                                                                                                                SubLObject _prev_bind_0_28 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                    {
                                                                                                                                                        SubLObject iteration_state_29 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_29)) {
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            {
                                                                                                                                                                SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_29);
                                                                                                                                                                SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject _prev_bind_0_30 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                        try {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                SubLObject cdolist_list_var_31 = new_list;
                                                                                                                                                                                SubLObject node_vars_link_node = NIL;
                                                                                                                                                                                for (node_vars_link_node = cdolist_list_var_31.first(); NIL != cdolist_list_var_31; cdolist_list_var_31 = cdolist_list_var_31.rest() , node_vars_link_node = cdolist_list_var_31.first()) {
                                                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        } finally {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_30, thread);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                iteration_state_29 = dictionary_contents.do_dictionary_contents_next(iteration_state_29);
                                                                                                                                                            }
                                                                                                                                                        } 
                                                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_29);
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_28, thread);
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
                                                                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt21$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                {
                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                    SubLObject cdolist_list_var_32 = new_list;
                                                                                                                    SubLObject generating_fn = NIL;
                                                                                                                    for (generating_fn = cdolist_list_var_32.first(); NIL != cdolist_list_var_32; cdolist_list_var_32 = cdolist_list_var_32.rest() , generating_fn = cdolist_list_var_32.first()) {
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_33 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                {
                                                                                                                                    SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                    SubLObject new_list_34 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                    SubLObject cdolist_list_var_35 = new_list_34;
                                                                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                                                                    for (node_vars_link_node = cdolist_list_var_35.first(); NIL != cdolist_list_var_35; cdolist_list_var_35 = cdolist_list_var_35.rest() , node_vars_link_node = cdolist_list_var_35.first()) {
                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } finally {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_33, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } finally {
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_27, thread);
                                                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_26, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    node_var_3 = deck.deck_pop(recur_deck);
                                                                                } 
                                                                            } finally {
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_12, thread);
                                                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_11, thread);
                                                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_10, thread);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt23$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    }
                                                                } finally {
                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_9, thread);
                                                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_8, thread);
                                                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_7, thread);
                                                                }
                                                            }
                                                        } finally {
                                                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_6, thread);
                                                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_5, thread);
                                                        }
                                                    }
                                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                }
                                            } finally {
                                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_4, thread);
                                            }
                                        }
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_2, thread);
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(queries);
            }
        }
    }

    public static SubLObject all_valid_lilliput_queries_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject queries = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lilliput.$lilliput_mt$.getGlobalValue());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject node_var = lilliput.$lilliput_master_query_collection$.getGlobalValue();
            final SubLObject _prev_bind_0_$1 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_1_$2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    SubLObject node_var_$3 = node_var;
                    final SubLObject deck_type = $STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$2 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = NIL;
                            final SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$3 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str14$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($CERROR)) {
                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str14$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($WARN)) {
                                                Errors.warn($str14$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            } else {
                                                Errors.warn($str19$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror($$$continue_anyway, $str14$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            }


                                }
                                final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$4 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$9 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                        final SubLObject _prev_bind_0_$5 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$5 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$10 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$3, UNPROVIDED);
                                            while (NIL != node_var_$3) {
                                                final SubLObject tt_node_var = node_var_$3;
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                SubLObject module_var = NIL;
                                                module_var = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$6 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            final SubLObject _prev_bind_0_$7 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$16;
                                                                                for (iteration_state_$16 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$16); iteration_state_$16 = dictionary_contents.do_dictionary_contents_next(iteration_state_$16)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$16);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject query;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    query = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, query)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if ((NIL != forts.fort_p(query)) && (!lilliput.lilliput_query_type(query).eql(lilliput.$lilliput_master_query_collection$.getGlobalValue()))) {
                                                                                                            queries = cons(query, queries);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    SubLObject csome_list_var = sol;
                                                                                                    SubLObject query2 = NIL;
                                                                                                    query2 = csome_list_var.first();
                                                                                                    while (NIL != csome_list_var) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if ((NIL != forts.fort_p(query2)) && (!lilliput.lilliput_query_type(query2).eql(lilliput.$lilliput_master_query_collection$.getGlobalValue()))) {
                                                                                                                queries = cons(query2, queries);
                                                                                                            }
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        query2 = csome_list_var.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str20$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$8, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$16);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$7, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str21$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                            if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                SubLObject instance_tuple = NIL;
                                                                instance_tuple = csome_list_var2.first();
                                                                while (NIL != csome_list_var2) {
                                                                    SubLObject current;
                                                                    final SubLObject datum = current = instance_tuple;
                                                                    SubLObject link_node = NIL;
                                                                    SubLObject mt2 = NIL;
                                                                    SubLObject tv2 = NIL;
                                                                    destructuring_bind_must_consp(current, datum, $list22);
                                                                    link_node = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list22);
                                                                    mt2 = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list22);
                                                                    tv2 = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                            final SubLObject _prev_bind_0_$9 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$10 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol;
                                                                                        final SubLObject link_nodes2 = sol = list(link_node);
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject query;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                query = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, query)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if ((NIL != forts.fort_p(query)) && (!lilliput.lilliput_query_type(query).eql(lilliput.$lilliput_master_query_collection$.getGlobalValue()))) {
                                                                                                        queries = cons(query, queries);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var_$20 = sol;
                                                                                                SubLObject query2 = NIL;
                                                                                                query2 = csome_list_var_$20.first();
                                                                                                while (NIL != csome_list_var_$20) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if ((NIL != forts.fort_p(query2)) && (!lilliput.lilliput_query_type(query2).eql(lilliput.$lilliput_master_query_collection$.getGlobalValue()))) {
                                                                                                            queries = cons(query2, queries);
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var_$20 = csome_list_var_$20.rest();
                                                                                                    query2 = csome_list_var_$20.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str20$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$10, thread);
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$9, thread);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum, $list22);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    instance_tuple = csome_list_var2.first();
                                                                } 
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$21;
                                                                final SubLObject new_list = cdolist_list_var_$21 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn = NIL;
                                                                generating_fn = cdolist_list_var_$21.first();
                                                                while (NIL != cdolist_list_var_$21) {
                                                                    final SubLObject _prev_bind_0_$11 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        final SubLObject sol2;
                                                                        final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                            SubLObject basis_object2;
                                                                            SubLObject state2;
                                                                            SubLObject query3;
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                query3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, query3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    if ((NIL != forts.fort_p(query3)) && (!lilliput.lilliput_query_type(query3).eql(lilliput.$lilliput_master_query_collection$.getGlobalValue()))) {
                                                                                        queries = cons(query3, queries);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                SubLObject csome_list_var3 = sol2;
                                                                                SubLObject query4 = NIL;
                                                                                query4 = csome_list_var3.first();
                                                                                while (NIL != csome_list_var3) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(query4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        if ((NIL != forts.fort_p(query4)) && (!lilliput.lilliput_query_type(query4).eql(lilliput.$lilliput_master_query_collection$.getGlobalValue()))) {
                                                                                            queries = cons(query4, queries);
                                                                                        }
                                                                                    }
                                                                                    csome_list_var3 = csome_list_var3.rest();
                                                                                    query4 = csome_list_var3.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str20$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$11, thread);
                                                                    }
                                                                    cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                                                                    generating_fn = cdolist_list_var_$21.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$6, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$6, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                } 
                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                SubLObject module_var2 = NIL;
                                                module_var2 = cdolist_list_var2.first();
                                                while (NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$12 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$7 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node2 = function_terms.naut_to_nart(node_var_$3);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link2) {
                                                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links2) {
                                                                    SubLObject iteration_state2;
                                                                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                        final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                            final SubLObject _prev_bind_0_$13 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                SubLObject iteration_state_$17;
                                                                                for (iteration_state_$17 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$17); iteration_state_$17 = dictionary_contents.do_dictionary_contents_next(iteration_state_$17)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$17);
                                                                                    final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol3 = link_nodes4;
                                                                                            if (NIL != set.set_p(sol3)) {
                                                                                                final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                SubLObject basis_object3;
                                                                                                SubLObject state3;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol3.isList()) {
                                                                                                    SubLObject csome_list_var4 = sol3;
                                                                                                    SubLObject node_vars_link_node2 = NIL;
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                    while (NIL != csome_list_var4) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var4 = csome_list_var4.rest();
                                                                                                        node_vars_link_node2 = csome_list_var4.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str20$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$14, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$17);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$13, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str21$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$22;
                                                                final SubLObject new_list2 = cdolist_list_var_$22 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn2 = NIL;
                                                                generating_fn2 = cdolist_list_var_$22.first();
                                                                while (NIL != cdolist_list_var_$22) {
                                                                    final SubLObject _prev_bind_0_$15 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                        final SubLObject sol4;
                                                                        final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                        if (NIL != set.set_p(sol4)) {
                                                                            final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                            SubLObject basis_object4;
                                                                            SubLObject state4;
                                                                            SubLObject node_vars_link_node3;
                                                                            for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol4.isList()) {
                                                                                SubLObject csome_list_var5 = sol4;
                                                                                SubLObject node_vars_link_node4 = NIL;
                                                                                node_vars_link_node4 = csome_list_var5.first();
                                                                                while (NIL != csome_list_var5) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                    }
                                                                                    csome_list_var5 = csome_list_var5.rest();
                                                                                    node_vars_link_node4 = csome_list_var5.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str20$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$15, thread);
                                                                    }
                                                                    cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                                                                    generating_fn2 = cdolist_list_var_$22.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$7, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$12, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                } 
                                                node_var_$3 = deck.deck_pop(recur_deck);
                                            } 
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$10, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$5, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$5, thread);
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str23$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$9, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$4, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$4, thread);
                                }
                            } finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$3, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$3, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$2, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$2, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$1, thread);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return nreverse(queries);
    }

    public static final SubLObject all_valid_lilliput_queries_alt() {
        {
            SubLObject caching_state = $all_valid_lilliput_queries_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(ALL_VALID_LILLIPUT_QUERIES, $all_valid_lilliput_queries_caching_state$, NIL, EQ, ZERO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
                if (results == $kw4$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.lilliput_caches.all_valid_lilliput_queries_internal()));
                    memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject all_valid_lilliput_queries() {
        SubLObject caching_state = $all_valid_lilliput_queries_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(ALL_VALID_LILLIPUT_QUERIES, $all_valid_lilliput_queries_caching_state$, NIL, EQ, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(all_valid_lilliput_queries_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject clear_lilliput_caches_alt() {
        com.cyc.cycjava.cycl.inference.lilliput_caches.clear_lilliput_all_instances();
        com.cyc.cycjava.cycl.inference.lilliput_caches.clear_lilliput_all_instances_if_tkb_fort();
        com.cyc.cycjava.cycl.inference.lilliput_caches.clear_all_valid_lilliput_queries();
        return NIL;
    }

    public static SubLObject clear_lilliput_caches() {
        clear_lilliput_all_instances();
        clear_lilliput_all_instances_if_tkb_fort();
        clear_all_valid_lilliput_queries();
        return NIL;
    }

    public static SubLObject declare_lilliput_caches_file() {
        declareFunction("clear_lilliput_all_instances", "CLEAR-LILLIPUT-ALL-INSTANCES", 0, 0, false);
        declareFunction("remove_lilliput_all_instances", "REMOVE-LILLIPUT-ALL-INSTANCES", 1, 0, false);
        declareFunction("lilliput_all_instances_internal", "LILLIPUT-ALL-INSTANCES-INTERNAL", 1, 0, false);
        declareFunction("lilliput_all_instances", "LILLIPUT-ALL-INSTANCES", 1, 0, false);
        declareFunction("clear_lilliput_all_instances_if_tkb_fort", "CLEAR-LILLIPUT-ALL-INSTANCES-IF-TKB-FORT", 0, 0, false);
        declareFunction("remove_lilliput_all_instances_if_tkb_fort", "REMOVE-LILLIPUT-ALL-INSTANCES-IF-TKB-FORT", 1, 0, false);
        declareFunction("lilliput_all_instances_if_tkb_fort_internal", "LILLIPUT-ALL-INSTANCES-IF-TKB-FORT-INTERNAL", 1, 0, false);
        declareFunction("lilliput_all_instances_if_tkb_fort", "LILLIPUT-ALL-INSTANCES-IF-TKB-FORT", 1, 0, false);
        declareFunction("clear_all_valid_lilliput_queries", "CLEAR-ALL-VALID-LILLIPUT-QUERIES", 0, 0, false);
        declareFunction("remove_all_valid_lilliput_queries", "REMOVE-ALL-VALID-LILLIPUT-QUERIES", 0, 0, false);
        declareFunction("all_valid_lilliput_queries_internal", "ALL-VALID-LILLIPUT-QUERIES-INTERNAL", 0, 0, false);
        declareFunction("all_valid_lilliput_queries", "ALL-VALID-LILLIPUT-QUERIES", 0, 0, false);
        declareFunction("clear_lilliput_caches", "CLEAR-LILLIPUT-CACHES", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_lilliput_caches_file() {
        deflexical("*LILLIPUT-ALL-INSTANCES-CACHING-STATE*", NIL);
        deflexical("*LILLIPUT-ALL-INSTANCES-IF-TKB-FORT-CACHING-STATE*", NIL);
        deflexical("*ALL-VALID-LILLIPUT-QUERIES-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_lilliput_caches_file() {
        memoization_state.note_globally_cached_function(LILLIPUT_ALL_INSTANCES);
        memoization_state.note_globally_cached_function(LILLIPUT_ALL_INSTANCES_IF_TKB_FORT);
        memoization_state.note_globally_cached_function(ALL_VALID_LILLIPUT_QUERIES);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_lilliput_caches_file();
    }

    @Override
    public void initializeVariables() {
        init_lilliput_caches_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_lilliput_caches_file();
    }

    static {
    }

    public static final SubLSymbol $kw4$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLSymbol $sym6$TKB_FORT_ = makeSymbol("TKB-FORT?");

    static private final SubLString $str_alt15$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt20$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt21$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLList $list_alt22 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    static private final SubLString $str_alt23$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
}

/**
 * Total time: 961 ms
 */
