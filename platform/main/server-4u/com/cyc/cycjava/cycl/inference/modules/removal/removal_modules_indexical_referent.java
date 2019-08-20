/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.system_info;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_indexical_referent extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_indexical_referent();



    // deflexical
    // Definitions
    // A table of expansion methods for #$indexicalReferent.
    /**
     * A table of expansion methods for #$indexicalReferent.
     */
    @LispMethod(comment = "A table of expansion methods for #$indexicalReferent.\ndeflexical")
    private static final SubLSymbol $indexical_referent_expansions$ = makeSymbol("*INDEXICAL-REFERENT-EXPANSIONS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_indexical_referent_cost$ = makeSymbol("*DEFAULT-INDEXICAL-REFERENT-COST*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol CYC_INDEXICAL_REFERENT = makeSymbol("CYC-INDEXICAL-REFERENT");



    private static final SubLSymbol $REMOVAL_INDEXICAL_REFERENT_POS = makeKeyword("REMOVAL-INDEXICAL-REFERENT-POS");

    private static final SubLList $list4 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("indexicalReferent"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("indexicalReferent"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list($TEST, makeSymbol("INDEXICAL-REFERENT-TERM-P"))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-INDEXICAL-REFERENT-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("indexicalReferent"), list($BIND, makeSymbol("INDEXICAL")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("INDEXICAL"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("INDEXICAL-REFERENT-EXPAND"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("indexicalReferent"), list(makeKeyword("VALUE"), makeSymbol("INDEXICAL")), makeKeyword("INPUT")) });







    private static final SubLSymbol INDEXICAL_QUERY_MT = makeSymbol("INDEXICAL-QUERY-MT");



    private static final SubLSymbol INDEXICAL_HYPOTHESIS_MT = makeSymbol("INDEXICAL-HYPOTHESIS-MT");



    private static final SubLSymbol INDEXICAL_HYPOTHESIS_MONAD_MT = makeSymbol("INDEXICAL-HYPOTHESIS-MONAD-MT");



    private static final SubLSymbol INDEXICAL_THE_USER = makeSymbol("INDEXICAL-THE-USER");





    private static final SubLSymbol INDEXICAL_THE_PURPOSE = makeSymbol("INDEXICAL-THE-PURPOSE");

    private static final SubLSymbol INDEXICAL_THE_CYC_PROCESS_OWNER = makeSymbol("INDEXICAL-THE-CYC-PROCESS-OWNER");

    private static final SubLSymbol $indexical_the_cyc_process_owner_caching_state$ = makeSymbol("*INDEXICAL-THE-CYC-PROCESS-OWNER-CACHING-STATE*");





    private static final SubLSymbol INDEXICAL_THE_CURRENT_KB_NUMBER = makeSymbol("INDEXICAL-THE-CURRENT-KB-NUMBER");



    private static final SubLSymbol INDEXICAL_THE_CURRENT_SYSTEM_NUMBER = makeSymbol("INDEXICAL-THE-CURRENT-SYSTEM-NUMBER");



    private static final SubLSymbol INDEXICAL_THE_CURRENT_HOST_NAME = makeSymbol("INDEXICAL-THE-CURRENT-HOST-NAME");



    private static final SubLSymbol INDEXICAL_THIS_INFERENCE = makeSymbol("INDEXICAL-THIS-INFERENCE");



    private static final SubLSymbol INDEXICAL_THIS_PROBLEM_STORE = makeSymbol("INDEXICAL-THIS-PROBLEM-STORE");



    private static final SubLSymbol INDEXICAL_NOW = makeSymbol("INDEXICAL-NOW");

    private static final SubLObject $$Now_Indexical = reader_make_constant_shell("Now-Indexical");

    private static final SubLObject $$Today_Indexical = reader_make_constant_shell("Today-Indexical");

    private static final SubLSymbol INDEXICAL_TODAY = makeSymbol("INDEXICAL-TODAY");

    private static final SubLObject $$Tomorrow_Indexical = reader_make_constant_shell("Tomorrow-Indexical");

    private static final SubLSymbol INDEXICAL_TOMORROW = makeSymbol("INDEXICAL-TOMORROW");

    private static final SubLObject $$Yesterday_Indexical = reader_make_constant_shell("Yesterday-Indexical");

    private static final SubLSymbol INDEXICAL_YESTERDAY = makeSymbol("INDEXICAL-YESTERDAY");

    private static final SubLObject $$SecondsSince1970_Indexical = reader_make_constant_shell("SecondsSince1970-Indexical");

    private static final SubLSymbol INDEXICAL_SECONDS_SINCE_1970 = makeSymbol("INDEXICAL-SECONDS-SINCE-1970");

    public static final SubLObject register_indexical_referent_expansion_alt(SubLObject indexical, SubLObject method) {
        $indexical_referent_expansions$.setGlobalValue(list_utilities.alist_enter($indexical_referent_expansions$.getGlobalValue(), indexical, method, symbol_function(EQUAL)));
        return NIL;
    }

    public static SubLObject register_indexical_referent_expansion(final SubLObject indexical, final SubLObject method) {
        $indexical_referent_expansions$.setGlobalValue(list_utilities.alist_enter($indexical_referent_expansions$.getGlobalValue(), indexical, method, symbol_function(EQUAL)));
        return NIL;
    }

    /**
     * #$evaluationDefn for #$IndexicalReferentFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$IndexicalReferentFn")
    public static final SubLObject cyc_indexical_referent_alt(SubLObject indexical) {
        if (NIL == com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent.indexical_referent_term_p(indexical)) {
            relation_evaluation.throw_unevaluatable();
        }
        {
            SubLObject referent = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent.indexical_referent_expand(indexical);
            if (NIL == referent) {
                relation_evaluation.throw_unevaluatable();
            }
            return referent;
        }
    }

    /**
     * #$evaluationDefn for #$IndexicalReferentFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$IndexicalReferentFn")
    public static SubLObject cyc_indexical_referent(final SubLObject indexical) {
        if (NIL == indexical_referent_term_p(indexical)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject referent = indexical_referent_expand(indexical);
        if (NIL == referent) {
            relation_evaluation.throw_unevaluatable();
        }
        return referent;
    }

    /**
     * Return T iff OBJECT has a declared indexical referent expansion.
     */
    @LispMethod(comment = "Return T iff OBJECT has a declared indexical referent expansion.")
    public static final SubLObject indexical_referent_term_p_alt(SubLObject v_object) {
        return list_utilities.sublisp_boolean(list_utilities.alist_lookup($indexical_referent_expansions$.getGlobalValue(), v_object, symbol_function(EQUAL), UNPROVIDED));
    }

    /**
     * Return T iff OBJECT has a declared indexical referent expansion.
     */
    @LispMethod(comment = "Return T iff OBJECT has a declared indexical referent expansion.")
    public static SubLObject indexical_referent_term_p(final SubLObject v_object) {
        return list_utilities.sublisp_boolean(list_utilities.alist_lookup($indexical_referent_expansions$.getGlobalValue(), v_object, symbol_function(EQUAL), UNPROVIDED));
    }

    public static final SubLObject indexical_referent_expand_alt(SubLObject v_term) {
        {
            SubLObject method = list_utilities.alist_lookup($indexical_referent_expansions$.getGlobalValue(), v_term, symbol_function(EQUAL), UNPROVIDED);
            if (NIL != subl_promotions.function_symbol_p(method)) {
                return funcall(method);
            }
        }
        return NIL;
    }

    public static SubLObject indexical_referent_expand(final SubLObject v_term) {
        final SubLObject method = list_utilities.alist_lookup($indexical_referent_expansions$.getGlobalValue(), v_term, symbol_function(EQUAL), UNPROVIDED);
        if (NIL != subl_promotions.function_symbol_p(method)) {
            return funcall(method);
        }
        return NIL;
    }

    public static final SubLObject temporal_indexical_expand_alt(SubLObject indexical) {
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent.indexical_referent_expand(indexical);
    }

    public static SubLObject temporal_indexical_expand(final SubLObject indexical) {
        return indexical_referent_expand(indexical);
    }

    public static final SubLObject indexical_query_mt_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
                while ((NIL != hlmt.hlmt_p(mt)) && (NIL != isa.isa_in_any_mtP(mt, $$HypotheticalContext))) {
                    {
                        SubLObject genl_mt = kb_mapping_utilities.fpred_value_in_any_mt(mt, $$termDependsOn, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        mt = genl_mt;
                    }
                } 
                if (NIL != hlmt.hlmt_p(mt)) {
                    return mt;
                }
            }
            return NIL;
        }
    }

    public static SubLObject indexical_query_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt;
        SubLObject genl_mt;
        for (mt = mt_relevance_macros.$mt$.getDynamicValue(thread); (NIL != hlmt.hlmt_p(mt)) && (NIL != isa.isa_in_any_mtP(mt, $$HypotheticalContext)); genl_mt = mt = kb_mapping_utilities.fpred_value_in_any_mt(mt, $$termDependsOn, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
        }
        if (NIL != hlmt.hlmt_p(mt)) {
            return mt;
        }
        return NIL;
    }

    public static SubLObject indexical_hypothesis_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        mt = highest_hypothetical_dependent_genl_mt(mt);
        if (NIL != hlmt.hlmt_p(mt)) {
            return mt;
        }
        return NIL;
    }

    public static SubLObject highest_hypothetical_dependent_genl_mt(SubLObject mt) {
        while ((NIL != hlmt.hlmt_p(mt)) && (NIL != isa.isa_in_any_mtP(mt, $$HypotheticalContext))) {
            final SubLObject genl_mt = kb_mapping_utilities.fpred_value_in_any_mt(mt, $$termDependsOn, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL == isa.isa_in_any_mtP(genl_mt, $$HypotheticalContext)) {
                return mt;
            }
            mt = genl_mt;
        } 
        return mt;
    }

    public static SubLObject indexical_hypothesis_monad_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        mt = highest_hypothetical_dependent_genl_mt(mt);
        if (NIL != hlmt.hlmt_p(mt)) {
            return hlmt.hlmt_monad_mt(mt);
        }
        return NIL;
    }

    public static final SubLObject indexical_the_user_alt() {
        return operation_communication.the_cyclist();
    }

    public static SubLObject indexical_the_user() {
        return operation_communication.the_cyclist();
    }

    public static final SubLObject indexical_the_purpose_alt() {
        {
            SubLObject purpose = fi.ke_purpose();
            if (NIL == purpose) {
                purpose = $$GeneralCycKE;
            }
            return purpose;
        }
    }

    public static SubLObject indexical_the_purpose() {
        SubLObject purpose = fi.ke_purpose();
        if (NIL == purpose) {
            purpose = $$GeneralCycKE;
        }
        return purpose;
    }

    public static final SubLObject clear_indexical_the_cyc_process_owner_alt() {
        {
            SubLObject cs = $indexical_the_cyc_process_owner_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_indexical_the_cyc_process_owner() {
        final SubLObject cs = $indexical_the_cyc_process_owner_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_indexical_the_cyc_process_owner_alt() {
        return memoization_state.caching_state_remove_function_results_with_args($indexical_the_cyc_process_owner_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_indexical_the_cyc_process_owner() {
        return memoization_state.caching_state_remove_function_results_with_args($indexical_the_cyc_process_owner_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject indexical_the_cyc_process_owner_internal_alt() {
        return kb_accessors.guess_the_cyclist_from_user_name(UNPROVIDED);
    }

    public static SubLObject indexical_the_cyc_process_owner_internal() {
        return kb_accessors.guess_the_cyclist_from_user_name(UNPROVIDED);
    }

    public static final SubLObject indexical_the_cyc_process_owner_alt() {
        {
            SubLObject caching_state = $indexical_the_cyc_process_owner_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(INDEXICAL_THE_CYC_PROCESS_OWNER, $indexical_the_cyc_process_owner_caching_state$, NIL, EQ, ZERO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
                if (results == $kw15$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent.indexical_the_cyc_process_owner_internal()));
                    memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject indexical_the_cyc_process_owner() {
        SubLObject caching_state = $indexical_the_cyc_process_owner_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(INDEXICAL_THE_CYC_PROCESS_OWNER, $indexical_the_cyc_process_owner_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(indexical_the_cyc_process_owner_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    static private final SubLList $list_alt3 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("indexicalReferent"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("indexicalReferent"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list($TEST, makeSymbol("INDEXICAL-REFERENT-TERM-P"))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-INDEXICAL-REFERENT-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("indexicalReferent"), list($BIND, makeSymbol("INDEXICAL")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("INDEXICAL"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("INDEXICAL-REFERENT-EXPAND"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("indexicalReferent"), list(makeKeyword("VALUE"), makeSymbol("INDEXICAL")), makeKeyword("INPUT")) });

    public static final SubLObject indexical_the_current_kb_number_alt() {
        return operation_communication.kb_version_string();
    }

    public static SubLObject indexical_the_current_kb_number() {
        return operation_communication.kb_version_string();
    }

    public static final SubLObject indexical_the_current_system_number_alt() {
        return system_info.cyc_revision_string();
    }

    public static SubLObject indexical_the_current_system_number() {
        return system_info.cyc_revision_string();
    }

    public static final SubLObject indexical_the_current_host_name_alt() {
        return Environment.get_machine_name(UNPROVIDED);
    }

    public static SubLObject indexical_the_current_host_name() {
        return Environment.get_machine_name(UNPROVIDED);
    }

    public static SubLObject indexical_this_inference() {
        final SubLObject inference = inference_macros.current_controlling_inference();
        if (NIL != inference) {
            return removal_modules_inference_reflection.cycl_inference_decode(inference);
        }
        return NIL;
    }

    public static SubLObject indexical_this_problem_store() {
        final SubLObject inference = inference_macros.current_controlling_inference();
        if (NIL != inference) {
            final SubLObject problem_store = inference_datastructures_inference.inference_problem_store(inference);
            return removal_modules_inference_reflection.cycl_problem_store_decode(problem_store);
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_indexical_referent_file() {
        declareFunction("register_indexical_referent_expansion", "REGISTER-INDEXICAL-REFERENT-EXPANSION", 2, 0, false);
        declareFunction("cyc_indexical_referent", "CYC-INDEXICAL-REFERENT", 1, 0, false);
        declareFunction("indexical_referent_term_p", "INDEXICAL-REFERENT-TERM-P", 1, 0, false);
        new removal_modules_indexical_referent.$indexical_referent_term_p$UnaryFunction();
        declareFunction("indexical_referent_expand", "INDEXICAL-REFERENT-EXPAND", 1, 0, false);
        declareFunction("temporal_indexical_expand", "TEMPORAL-INDEXICAL-EXPAND", 1, 0, false);
        new removal_modules_indexical_referent.$temporal_indexical_expand$UnaryFunction();
        declareFunction("indexical_query_mt", "INDEXICAL-QUERY-MT", 0, 0, false);
        declareFunction("indexical_hypothesis_mt", "INDEXICAL-HYPOTHESIS-MT", 0, 0, false);
        declareFunction("highest_hypothetical_dependent_genl_mt", "HIGHEST-HYPOTHETICAL-DEPENDENT-GENL-MT", 1, 0, false);
        declareFunction("indexical_hypothesis_monad_mt", "INDEXICAL-HYPOTHESIS-MONAD-MT", 0, 0, false);
        declareFunction("indexical_the_user", "INDEXICAL-THE-USER", 0, 0, false);
        declareFunction("indexical_the_purpose", "INDEXICAL-THE-PURPOSE", 0, 0, false);
        declareFunction("clear_indexical_the_cyc_process_owner", "CLEAR-INDEXICAL-THE-CYC-PROCESS-OWNER", 0, 0, false);
        declareFunction("remove_indexical_the_cyc_process_owner", "REMOVE-INDEXICAL-THE-CYC-PROCESS-OWNER", 0, 0, false);
        declareFunction("indexical_the_cyc_process_owner_internal", "INDEXICAL-THE-CYC-PROCESS-OWNER-INTERNAL", 0, 0, false);
        declareFunction("indexical_the_cyc_process_owner", "INDEXICAL-THE-CYC-PROCESS-OWNER", 0, 0, false);
        declareFunction("indexical_the_current_kb_number", "INDEXICAL-THE-CURRENT-KB-NUMBER", 0, 0, false);
        declareFunction("indexical_the_current_system_number", "INDEXICAL-THE-CURRENT-SYSTEM-NUMBER", 0, 0, false);
        declareFunction("indexical_the_current_host_name", "INDEXICAL-THE-CURRENT-HOST-NAME", 0, 0, false);
        declareFunction("indexical_this_inference", "INDEXICAL-THIS-INFERENCE", 0, 0, false);
        declareFunction("indexical_this_problem_store", "INDEXICAL-THIS-PROBLEM-STORE", 0, 0, false);
        return NIL;
    }

    public static final SubLSymbol $kw15$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    public static SubLObject init_removal_modules_indexical_referent_file() {
        deflexical("*INDEXICAL-REFERENT-EXPANSIONS*", NIL);
        defparameter("*DEFAULT-INDEXICAL-REFERENT-COST*", ONE_INTEGER);
        deflexical("*INDEXICAL-THE-CYC-PROCESS-OWNER-CACHING-STATE*", NIL);
        return NIL;
    }

    public static final SubLObject setup_removal_modules_indexical_referent_file_alt() {
        register_kb_function(CYC_INDEXICAL_REFERENT);
        inference_modules.register_solely_specific_removal_module_predicate($$indexicalReferent);
        inference_modules.inference_removal_module($REMOVAL_INDEXICAL_REFERENT_POS, $list_alt3);
        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent.register_indexical_referent_expansion($$QueryMt, INDEXICAL_QUERY_MT);
        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent.register_indexical_referent_expansion($$TheUser, INDEXICAL_THE_USER);
        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent.register_indexical_referent_expansion($$ThePurpose, INDEXICAL_THE_PURPOSE);
        memoization_state.note_globally_cached_function(INDEXICAL_THE_CYC_PROCESS_OWNER);
        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent.register_indexical_referent_expansion($$TheCycProcessOwner, INDEXICAL_THE_CYC_PROCESS_OWNER);
        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent.register_indexical_referent_expansion($$TheCurrentKBNumber, INDEXICAL_THE_CURRENT_KB_NUMBER);
        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent.register_indexical_referent_expansion($$TheCurrentSystemNumber, INDEXICAL_THE_CURRENT_SYSTEM_NUMBER);
        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent.register_indexical_referent_expansion($$TheCurrentHostName, INDEXICAL_THE_CURRENT_HOST_NAME);
        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent.register_indexical_referent_expansion($$Now, INDEXICAL_NOW);
        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent.register_indexical_referent_expansion($$Now_Indexical, INDEXICAL_NOW);
        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent.register_indexical_referent_expansion($$Today_Indexical, INDEXICAL_TODAY);
        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent.register_indexical_referent_expansion($$Tomorrow_Indexical, INDEXICAL_TOMORROW);
        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent.register_indexical_referent_expansion($$Yesterday_Indexical, INDEXICAL_YESTERDAY);
        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent.register_indexical_referent_expansion($$SecondsSince1970_Indexical, INDEXICAL_SECONDS_SINCE_1970);
        return NIL;
    }

    public static SubLObject setup_removal_modules_indexical_referent_file() {
        if (SubLFiles.USE_V1) {
            register_kb_function(CYC_INDEXICAL_REFERENT);
            inference_modules.register_solely_specific_removal_module_predicate($$indexicalReferent);
            preference_modules.doomed_unless_arg_bindable($POS, $$indexicalReferent, ONE_INTEGER);
            inference_modules.inference_removal_module($REMOVAL_INDEXICAL_REFERENT_POS, $list4);
            register_indexical_referent_expansion($$QueryMt, INDEXICAL_QUERY_MT);
            register_indexical_referent_expansion($$HypothesisMt, INDEXICAL_HYPOTHESIS_MT);
            register_indexical_referent_expansion($$HypothesisMonadMt, INDEXICAL_HYPOTHESIS_MONAD_MT);
            register_indexical_referent_expansion($$TheUser, INDEXICAL_THE_USER);
            register_indexical_referent_expansion($$ThePurpose, INDEXICAL_THE_PURPOSE);
            memoization_state.note_globally_cached_function(INDEXICAL_THE_CYC_PROCESS_OWNER);
            register_indexical_referent_expansion($$TheCycProcessOwner, INDEXICAL_THE_CYC_PROCESS_OWNER);
            register_indexical_referent_expansion($$TheCurrentKBNumber, INDEXICAL_THE_CURRENT_KB_NUMBER);
            register_indexical_referent_expansion($$TheCurrentSystemNumber, INDEXICAL_THE_CURRENT_SYSTEM_NUMBER);
            register_indexical_referent_expansion($$TheCurrentHostName, INDEXICAL_THE_CURRENT_HOST_NAME);
            register_indexical_referent_expansion($$ThisInference, INDEXICAL_THIS_INFERENCE);
            register_indexical_referent_expansion($$ThisProblemStore, INDEXICAL_THIS_PROBLEM_STORE);
            register_indexical_referent_expansion($$Now, INDEXICAL_NOW);
            register_indexical_referent_expansion($$Now_Indexical, INDEXICAL_NOW);
            register_indexical_referent_expansion($$Today_Indexical, INDEXICAL_TODAY);
            register_indexical_referent_expansion($$Tomorrow_Indexical, INDEXICAL_TOMORROW);
            register_indexical_referent_expansion($$Yesterday_Indexical, INDEXICAL_YESTERDAY);
            register_indexical_referent_expansion($$SecondsSince1970_Indexical, INDEXICAL_SECONDS_SINCE_1970);
        }
        if (SubLFiles.USE_V2) {
            inference_modules.inference_removal_module($REMOVAL_INDEXICAL_REFERENT_POS, $list_alt3);
        }
        return NIL;
    }

    public static SubLObject setup_removal_modules_indexical_referent_file_Previous() {
        register_kb_function(CYC_INDEXICAL_REFERENT);
        inference_modules.register_solely_specific_removal_module_predicate($$indexicalReferent);
        preference_modules.doomed_unless_arg_bindable($POS, $$indexicalReferent, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_INDEXICAL_REFERENT_POS, $list4);
        register_indexical_referent_expansion($$QueryMt, INDEXICAL_QUERY_MT);
        register_indexical_referent_expansion($$HypothesisMt, INDEXICAL_HYPOTHESIS_MT);
        register_indexical_referent_expansion($$HypothesisMonadMt, INDEXICAL_HYPOTHESIS_MONAD_MT);
        register_indexical_referent_expansion($$TheUser, INDEXICAL_THE_USER);
        register_indexical_referent_expansion($$ThePurpose, INDEXICAL_THE_PURPOSE);
        memoization_state.note_globally_cached_function(INDEXICAL_THE_CYC_PROCESS_OWNER);
        register_indexical_referent_expansion($$TheCycProcessOwner, INDEXICAL_THE_CYC_PROCESS_OWNER);
        register_indexical_referent_expansion($$TheCurrentKBNumber, INDEXICAL_THE_CURRENT_KB_NUMBER);
        register_indexical_referent_expansion($$TheCurrentSystemNumber, INDEXICAL_THE_CURRENT_SYSTEM_NUMBER);
        register_indexical_referent_expansion($$TheCurrentHostName, INDEXICAL_THE_CURRENT_HOST_NAME);
        register_indexical_referent_expansion($$ThisInference, INDEXICAL_THIS_INFERENCE);
        register_indexical_referent_expansion($$ThisProblemStore, INDEXICAL_THIS_PROBLEM_STORE);
        register_indexical_referent_expansion($$Now, INDEXICAL_NOW);
        register_indexical_referent_expansion($$Now_Indexical, INDEXICAL_NOW);
        register_indexical_referent_expansion($$Today_Indexical, INDEXICAL_TODAY);
        register_indexical_referent_expansion($$Tomorrow_Indexical, INDEXICAL_TOMORROW);
        register_indexical_referent_expansion($$Yesterday_Indexical, INDEXICAL_YESTERDAY);
        register_indexical_referent_expansion($$SecondsSince1970_Indexical, INDEXICAL_SECONDS_SINCE_1970);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_indexical_referent_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_indexical_referent_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_indexical_referent_file();
    }

    static {
    }

    public static final class $indexical_referent_term_p$UnaryFunction extends UnaryFunction {
        public $indexical_referent_term_p$UnaryFunction() {
            super(extractFunctionNamed("INDEXICAL-REFERENT-TERM-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return indexical_referent_term_p(arg1);
        }
    }

    public static final class $temporal_indexical_expand$UnaryFunction extends UnaryFunction {
        public $temporal_indexical_expand$UnaryFunction() {
            super(extractFunctionNamed("TEMPORAL-INDEXICAL-EXPAND"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return temporal_indexical_expand(arg1);
        }
    }
}

/**
 * Total time: 102 ms
 */
