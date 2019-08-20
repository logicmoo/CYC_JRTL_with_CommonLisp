package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.candidate_nc_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.file_hash_table;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_candidate_noun_compounds extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "b7ca3125e41cb2428aedd0ce9d723cff01061af2d56e2a3909dc49b9d111e75b";
    private static SubLObject $$datedCandidateNCTestHasResults;
    private static SubLSymbol $DATED_CNC_TEST_FOR_NCR_UNIFY_ARGS_2_AND_3;
    private static SubLList $list2;
    private static SubLObject $$aggregateCNCScoreForRuleWithThres;
    private static SubLSymbol $AGGREGATE_NC_SCORE_FOR_RULES_W_THRESHOLDS_UNIFY_ARGS_1_AND_4;
    private static SubLList $list5;
    private static SubLSymbol $AGGREGATE_NC_SCORE_FOR_RULE_W_THRESHOLDS_UNIFY_ARG4;
    private static SubLList $list7;
    private static SubLObject $$aggregateCNCResultForRuleWithThre;
    private static SubLSymbol $AGGREGATE_NC_RESULT_FOR_RULES_W_THRESHOLDS_UNIFY_ARGS_1_AND_4;
    private static SubLList $list10;
    private static SubLSymbol $AGGREGATE_NC_RESULT_FOR_RULE_W_THRESHOLDS_UNIFY_ARG4;
    private static SubLList $list12;
    private static SubLSymbol $DATED_CNC_TEST_FOR_NCR_REQUIRE_ARG1_FULLY_BOUND;
    private static SubLList $list14;
    private static SubLSymbol $AGGREGATE_NCSCORE_FOR_RULE_W_THRESHOLDS_REQUIRE_ARG_2_FULLY_BOUND;
    private static SubLList $list16;
    private static SubLSymbol $AGGREGATE_NCSCORE_FOR_RULE_W_THRESHOLDS_REQUIRE_ARG_3_FULLY_BOUND;
    private static SubLList $list18;
    private static SubLSymbol $IMAGE_INDEPENDENT_CFASL;
    private static SubLSymbol $sym20$CONTAINS_INVALID_FORT_;
    private static SubLSymbol $sym21$CONTAINS_SERVER_ERROR_;
    private static SubLObject $$Google_SearchEngine;
    private static SubLSymbol $GOOGLE;
    private static SubLObject $$Yahoo_SearchEngine;
    private static SubLSymbol $YAHOO;
    private static SubLSymbol $SERVER_ERROR;
    private static SubLString $str27$The_head_denot_for__S_is_an_inval;
    private static SubLString $str28$The_modifier_denot_for__S_is_an_i;
    private static SubLInteger $int$15552000;
    private static SubLSymbol $sym30$EMPTY_CNC_TEST_;
    private static SubLString $str31$_;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-candidate-noun-compounds.lisp", position = 8500L)
    public static SubLObject check_dated_cnc_test_for_rule(SubLObject rule, SubLObject date, SubLObject result, SubLObject engine) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rule_el = cycl_utilities.hl_to_el(rule);
        SubLObject value = list(date, result);
        SubLObject key = list(rule_el, engine);
        SubLObject tests = candidate_nc_utilities.cnc_get_from_fht(key, candidate_nc_utilities.$scored_ncr_table$.getDynamicValue(thread));
        return subl_promotions.memberP(value, tests, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-candidate-noun-compounds.lisp", position = 8800L)
    public static SubLObject get_cnc_test_results_and_dates(SubLObject rule, SubLObject engine) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rule_el = cycl_utilities.hl_to_el(rule);
        SubLObject key = list(rule_el, engine);
        SubLObject tests = remove_empty_cnc_tests(candidate_nc_utilities.cnc_get_from_fht(key, candidate_nc_utilities.$scored_ncr_table$.getDynamicValue(thread)));
        return tests;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-candidate-noun-compounds.lisp", position = 9000L)
    public static SubLObject get_aggregate_cnc_score_w_thresholds(SubLObject rule, SubLObject compound_threshold, SubLObject component_threshold, SubLObject engine) {
        return list(conses_high.second(evaluate_aggregate_cnc_results_w_thresholds(rule, compound_threshold, component_threshold, engine)));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-candidate-noun-compounds.lisp", position = 9200L)
    public static SubLObject get_aggregate_score_for_all_w_thresholds(SubLObject compound_threshold, SubLObject component_threshold, SubLObject engine) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject covered_rules = NIL;
        SubLObject results = NIL;
        SubLObject fht = NIL;
        try {
            fht = file_hash_table.open_file_hash_table_read_only(candidate_nc_utilities.$scored_ncr_table$.getDynamicValue(thread), EQUAL, $IMAGE_INDEPENDENT_CFASL);
            SubLObject continuation = NIL;
            SubLObject next;
            for (SubLObject completeP = NIL; NIL == completeP; completeP = Types.sublisp_null(next)) {
                thread.resetMultipleValues();
                SubLObject the_key = file_hash_table.get_file_hash_table_any(fht, continuation, NIL);
                SubLObject the_value = thread.secondMultipleValue();
                next = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != next) {
                    SubLObject key = the_key;
                    SubLObject value = the_value;
                    covered_rules = cons(key.first(), covered_rules);
                }
                continuation = next;
            }
        } finally {
            SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                SubLObject _values = Values.getValuesAsVector();
                if (NIL != file_hash_table.file_hash_table_p(fht)) {
                    file_hash_table.finalize_file_hash_table(fht);
                }
                Values.restoreValuesFromVector(_values);
            } finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        SubLObject cdolist_list_var = covered_rules;
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject score = get_aggregate_cnc_score_w_thresholds(rule, compound_threshold, component_threshold, engine);
            if (NIL != score.first()) {
                results = cons(cons(rule, score), results);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        }
        return results;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-candidate-noun-compounds.lisp", position = 9800L)
    public static SubLObject get_aggregate_results_for_all_w_thresholds(SubLObject compound_threshold, SubLObject component_threshold, SubLObject engine) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject covered_rules = NIL;
        SubLObject results = NIL;
        SubLObject fht = NIL;
        try {
            fht = file_hash_table.open_file_hash_table_read_only(candidate_nc_utilities.$scored_ncr_table$.getDynamicValue(thread), EQUAL, $IMAGE_INDEPENDENT_CFASL);
            SubLObject continuation = NIL;
            SubLObject next;
            for (SubLObject completeP = NIL; NIL == completeP; completeP = Types.sublisp_null(next)) {
                thread.resetMultipleValues();
                SubLObject the_key = file_hash_table.get_file_hash_table_any(fht, continuation, NIL);
                SubLObject the_value = thread.secondMultipleValue();
                next = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != next) {
                    SubLObject key = the_key;
                    SubLObject value = the_value;
                    covered_rules = cons(key.first(), covered_rules);
                }
                continuation = next;
            }
        } finally {
            SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                SubLObject _values = Values.getValuesAsVector();
                if (NIL != file_hash_table.file_hash_table_p(fht)) {
                    file_hash_table.finalize_file_hash_table(fht);
                }
                Values.restoreValuesFromVector(_values);
            } finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        SubLObject cdolist_list_var = covered_rules;
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject eval_result = evaluate_aggregate_cnc_results_w_thresholds(rule, compound_threshold, component_threshold, engine);
            if (NIL != eval_result.first()) {
                results = cons(list(rule, eval_result), results);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        }
        return results;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-candidate-noun-compounds.lisp", position = 10400L)
    public static SubLObject get_aggregate_cnc_results_w_thresholds(SubLObject rule, SubLObject threshold1, SubLObject threshold2, SubLObject engine) {
        SubLObject v_answer = evaluate_aggregate_cnc_results_w_thresholds(rule, threshold1, threshold2, engine);
        return removal_module_utilities.non_null_answer_to_singleton(v_answer);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-candidate-noun-compounds.lisp", position = 10700L)
    public static SubLObject remove_errors_from_cnc_test_results(SubLObject test_results_list) {
        return Sequences.delete_if($sym20$CONTAINS_INVALID_FORT_, Sequences.delete_if($sym21$CONTAINS_SERVER_ERROR_, test_results_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-candidate-noun-compounds.lisp", position = 10800L)
    public static SubLObject get_search_engine_keyword(SubLObject engine) {
        SubLObject engine_keyword = engine.equal($$Google_SearchEngine) ? $GOOGLE : (engine.equal($$Yahoo_SearchEngine) ? $YAHOO : engine);
        return engine_keyword;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-candidate-noun-compounds.lisp", position = 11100L)
    public static SubLObject contains_server_errorP(SubLObject test_item) {
        return cycl_utilities.expression_find($SERVER_ERROR, test_item, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-candidate-noun-compounds.lisp", position = 11200L)
    public static SubLObject contains_invalid_fortP(SubLObject test_item) {
        SubLObject mod_denot = conses_high.fourth(test_item);
        SubLObject head_denot = conses_high.fifth(test_item);
        SubLObject result = NIL;
        if (NIL != forts.invalid_fortP(mod_denot)) {
            Errors.warn($str27$The_head_denot_for__S_is_an_inval, test_item);
            result = T;
        }
        if (NIL != forts.invalid_fortP(head_denot)) {
            Errors.warn($str28$The_modifier_denot_for__S_is_an_i, test_item);
            result = T;
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-candidate-noun-compounds.lisp", position = 11700L)
    public static SubLObject evaluate_aggregate_cnc_results_w_thresholds(SubLObject rule, SubLObject compound_threshold, SubLObject component_threshold, SubLObject engine) {
        SubLObject aggregate_result = aggregate_cnc_results_for_rule(rule, engine, UNPROVIDED);
        SubLObject score_tuple = candidate_nc_utilities.evaluate_cnc_results_w_thresholds(aggregate_result, compound_threshold, component_threshold);
        return score_tuple;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-candidate-noun-compounds.lisp", position = 12000L)
    public static SubLObject aggregate_cnc_results_for_rule(SubLObject rule, SubLObject engine, SubLObject cutoff_date) {
        if (cutoff_date == UNPROVIDED) {
            cutoff_date = Numbers.subtract(Time.get_universal_time(), $int$15552000);
        }
        SubLObject stored_results = get_cnc_test_results_and_dates(rule, engine);
        SubLObject earliest_date = NIL;
        SubLObject aggregate_data = NIL;
        SubLObject cdolist_list_var = stored_results;
        SubLObject test = NIL;
        test = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject date = test.first();
            SubLObject data = conses_high.second(test);
            if (date.numGE(cutoff_date)) {
                aggregate_data = append(data, aggregate_data);
                if (NIL == earliest_date) {
                    earliest_date = date;
                }
                if (date.numL(earliest_date)) {
                    earliest_date = date;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            test = cdolist_list_var.first();
        }
        aggregate_data = Sequences.remove_duplicates(aggregate_data, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return list(earliest_date, aggregate_data);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-candidate-noun-compounds.lisp", position = 12700L)
    public static SubLObject empty_cnc_testP(SubLObject test_item) {
        return Types.sublisp_null(list_utilities.sublisp_boolean(conses_high.second(test_item)));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-candidate-noun-compounds.lisp", position = 12700L)
    public static SubLObject remove_empty_cnc_tests(SubLObject test_list) {
        return Sequences.delete_if($sym30$EMPTY_CNC_TEST_, test_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-candidate-noun-compounds.lisp", position = 12800L)
    public static SubLObject cyclify_cnc_date_string(SubLObject date_string) {
        return date_utilities.universal_time_to_cycl_date(string_utilities.remove_substring(date_string, $str31$_));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-candidate-noun-compounds.lisp", position = 13000L)
    public static SubLObject candidate_nc_test_verify_general(SubLObject asent, SubLObject mt) {
        SubLObject rule = cycl_utilities.formula_arg1(asent, UNPROVIDED);
        SubLObject date = cycl_utilities.formula_arg2(asent, UNPROVIDED);
        SubLObject result = cycl_utilities.formula_arg3(asent, UNPROVIDED);
        SubLObject engine = cycl_utilities.formula_arg4(asent, UNPROVIDED);
        return check_dated_cnc_test_for_rule(rule, date, result, engine);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-candidate-noun-compounds.lisp", position = 13300L)
    public static SubLObject candidate_nc_test_justify_general(SubLObject asent, SubLObject mt) {
        SubLObject supports = NIL;
        return supports;
    }

    public static SubLObject declare_removal_modules_candidate_noun_compounds_file() {
        declareFunction("check_dated_cnc_test_for_rule", "CHECK-DATED-CNC-TEST-FOR-RULE", 4, 0, false);
        declareFunction("get_cnc_test_results_and_dates", "GET-CNC-TEST-RESULTS-AND-DATES", 2, 0, false);
        declareFunction("get_aggregate_cnc_score_w_thresholds", "GET-AGGREGATE-CNC-SCORE-W-THRESHOLDS", 4, 0, false);
        declareFunction("get_aggregate_score_for_all_w_thresholds", "GET-AGGREGATE-SCORE-FOR-ALL-W-THRESHOLDS", 3, 0, false);
        declareFunction("get_aggregate_results_for_all_w_thresholds", "GET-AGGREGATE-RESULTS-FOR-ALL-W-THRESHOLDS", 3, 0, false);
        declareFunction("get_aggregate_cnc_results_w_thresholds", "GET-AGGREGATE-CNC-RESULTS-W-THRESHOLDS", 4, 0, false);
        declareFunction("remove_errors_from_cnc_test_results", "REMOVE-ERRORS-FROM-CNC-TEST-RESULTS", 1, 0, false);
        declareFunction("get_search_engine_keyword", "GET-SEARCH-ENGINE-KEYWORD", 1, 0, false);
        declareFunction("contains_server_errorP", "CONTAINS-SERVER-ERROR?", 1, 0, false);
        declareFunction("contains_invalid_fortP", "CONTAINS-INVALID-FORT?", 1, 0, false);
        declareFunction("evaluate_aggregate_cnc_results_w_thresholds", "EVALUATE-AGGREGATE-CNC-RESULTS-W-THRESHOLDS", 4, 0, false);
        declareFunction("aggregate_cnc_results_for_rule", "AGGREGATE-CNC-RESULTS-FOR-RULE", 2, 1, false);
        declareFunction("empty_cnc_testP", "EMPTY-CNC-TEST?", 1, 0, false);
        declareFunction("remove_empty_cnc_tests", "REMOVE-EMPTY-CNC-TESTS", 1, 0, false);
        declareFunction("cyclify_cnc_date_string", "CYCLIFY-CNC-DATE-STRING", 1, 0, false);
        declareFunction("candidate_nc_test_verify_general", "CANDIDATE-NC-TEST-VERIFY-GENERAL", 2, 0, false);
        declareFunction("candidate_nc_test_justify_general", "CANDIDATE-NC-TEST-JUSTIFY-GENERAL", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_candidate_noun_compounds_file() {
        return NIL;
    }

    public static SubLObject setup_removal_modules_candidate_noun_compounds_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$datedCandidateNCTestHasResults);
        inference_modules.inference_removal_module($DATED_CNC_TEST_FOR_NCR_UNIFY_ARGS_2_AND_3, $list2);
        inference_modules.register_solely_specific_removal_module_predicate($$aggregateCNCScoreForRuleWithThres);
        inference_modules.inference_removal_module($AGGREGATE_NC_SCORE_FOR_RULES_W_THRESHOLDS_UNIFY_ARGS_1_AND_4, $list5);
        inference_modules.inference_removal_module($AGGREGATE_NC_SCORE_FOR_RULE_W_THRESHOLDS_UNIFY_ARG4, $list7);
        inference_modules.register_solely_specific_removal_module_predicate($$aggregateCNCResultForRuleWithThre);
        inference_modules.inference_removal_module($AGGREGATE_NC_RESULT_FOR_RULES_W_THRESHOLDS_UNIFY_ARGS_1_AND_4, $list10);
        inference_modules.inference_removal_module($AGGREGATE_NC_RESULT_FOR_RULE_W_THRESHOLDS_UNIFY_ARG4, $list12);
        preference_modules.inference_preference_module($DATED_CNC_TEST_FOR_NCR_REQUIRE_ARG1_FULLY_BOUND, $list14);
        preference_modules.inference_preference_module($AGGREGATE_NCSCORE_FOR_RULE_W_THRESHOLDS_REQUIRE_ARG_2_FULLY_BOUND, $list16);
        preference_modules.inference_preference_module($AGGREGATE_NCSCORE_FOR_RULE_W_THRESHOLDS_REQUIRE_ARG_3_FULLY_BOUND, $list18);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_candidate_noun_compounds_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_candidate_noun_compounds_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_candidate_noun_compounds_file();
    }

    static {
        me = new removal_modules_candidate_noun_compounds();
        $$datedCandidateNCTestHasResults = makeConstSym(("datedCandidateNCTestHasResults"));
        $DATED_CNC_TEST_FOR_NCR_UNIFY_ARGS_2_AND_3 = makeKeyword("DATED-CNC-TEST-FOR-NCR-UNIFY-ARGS-2-AND-3");
        $list2 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("datedCandidateNCTestHasResults")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("datedCandidateNCTestHasResults")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
                makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("datedCandidateNCTestHasResults")), list(makeKeyword("BIND"), makeSymbol("RULE")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("ENGINE"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("ENGINE")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("GET-CNC-TEST-RESULTS-AND-DATES"), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("CALL"), makeSymbol("GET-SEARCH-ENGINE-KEYWORD"), list(makeKeyword("VALUE"), makeSymbol("ENGINE")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("DATE"), makeSymbol("RESULT")),
                        list(makeConstSym(("datedCandidateNCTestHasResults")), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("CALL"), makeSymbol("CYCLIFY-CNC-DATE-STRING"), list(makeKeyword("VALUE"), makeSymbol("DATE"))),
                                list(makeKeyword("CALL"), makeSymbol("MAKE-EL-LIST-RECURSIVELY"), list(makeKeyword("CALL"), makeSymbol("REMOVE-ERRORS-FROM-CNC-TEST-RESULTS"), list(makeKeyword("VALUE"), makeSymbol("RESULT")))), list(makeKeyword("VALUE"), makeSymbol("ENGINE")))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("CANDIDATE-NC-TESTS"), makeKeyword("DOCUMENTATION"), makeString("(#$datedCandidateNCTestHasResults <rule> <not-fully-bound> <not-fully-bound> <search-engine>)"), makeKeyword("EXAMPLE"),
                makeString("(#$datedCandidateNCTestHasResults #$TofuStew-NCR ?DATE ?RESULT #$Google-SearchEngine)") });
        $$aggregateCNCScoreForRuleWithThres = makeConstSym(("aggregateCNCScoreForRuleWithThresholds"));
        $AGGREGATE_NC_SCORE_FOR_RULES_W_THRESHOLDS_UNIFY_ARGS_1_AND_4 = makeKeyword("AGGREGATE-NC-SCORE-FOR-RULES-W-THRESHOLDS-UNIFY-ARGS-1-AND-4");
        $list5 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("aggregateCNCScoreForRuleWithThresholds")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("aggregateCNCScoreForRuleWithThresholds")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER,
                makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"),
                        list(makeConstSym(("aggregateCNCScoreForRuleWithThresholds")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("THRESHOLD1")), list(makeKeyword("BIND"), makeSymbol("THRESHOLD2")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("ENGINE"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("THRESHOLD1")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD2")), list(makeKeyword("VALUE"), makeSymbol("ENGINE")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("GET-AGGREGATE-SCORE-FOR-ALL-W-THRESHOLDS"), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD1")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD2")),
                        list(makeKeyword("CALL"), makeSymbol("GET-SEARCH-ENGINE-KEYWORD"), list(makeKeyword("VALUE"), makeSymbol("ENGINE")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("RULE"), makeSymbol("SCORE")),
                        list(makeConstSym(("aggregateCNCScoreForRuleWithThresholds")), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD1")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD2")), list(makeKeyword("VALUE"), makeSymbol("SCORE")),
                                list(makeKeyword("VALUE"), makeSymbol("ENGINE")))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("CANDIDATE-NC-TESTS"), makeKeyword("DOCUMENTATION"), makeString("(#$aggregateCNCScoreForRuleWithThresholds <not-fully-bound> <threshold1> <threshold2> <not-fully-bound> <search-engine>)"), makeKeyword("EXAMPLE"),
                makeString("(#$aggregateCNCScoreForRuleWithThresholds ?RULE 1 100 ?SCORE #$Google-SearchEngine)") });
        $AGGREGATE_NC_SCORE_FOR_RULE_W_THRESHOLDS_UNIFY_ARG4 = makeKeyword("AGGREGATE-NC-SCORE-FOR-RULE-W-THRESHOLDS-UNIFY-ARG4");
        $list7 = list(
                new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("aggregateCNCScoreForRuleWithThresholds")), makeKeyword("REQUIRED-PATTERN"),
                        list(makeConstSym(("aggregateCNCScoreForRuleWithThresholds")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER,
                        makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                        list(makeKeyword("TEMPLATE"), list(makeConstSym(("aggregateCNCScoreForRuleWithThresholds")), list(makeKeyword("BIND"), makeSymbol("RULE")), list(makeKeyword("BIND"), makeSymbol("THRESHOLD1")), list(makeKeyword("BIND"), makeSymbol("THRESHOLD2")), makeKeyword("ANYTHING"),
                                list(makeKeyword("BIND"), makeSymbol("ENGINE"))), list(list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD1")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD2")), list(makeKeyword("VALUE"), makeSymbol("ENGINE")))),
                        makeKeyword("OUTPUT-GENERATE-PATTERN"),
                        list(makeKeyword("CALL"), makeSymbol("GET-AGGREGATE-CNC-SCORE-W-THRESHOLDS"), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD1")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD2")),
                                list(makeKeyword("CALL"), makeSymbol("GET-SEARCH-ENGINE-KEYWORD"), list(makeKeyword("VALUE"), makeSymbol("ENGINE")))),
                        makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                        list(makeConstSym(("aggregateCNCScoreForRuleWithThresholds")), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD1")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD2")), makeKeyword("INPUT"),
                                list(makeKeyword("VALUE"), makeSymbol("ENGINE"))),
                        makeKeyword("SUPPORT-MODULE"), makeKeyword("CANDIDATE-NC-TESTS"), makeKeyword("DOCUMENTATION"), makeString("(#$aggregateCNCScoreForRuleWithThresholds <rule> <threshold1> <threshold2> <not-fully-bound> <search-engine>)"), makeKeyword("EXAMPLE"),
                        makeString("(#$aggregateCNCScoreForRuleWithThresholds #$TofuStew-NCR 1 100 ?SCORE #$Yahoo-SearchEngine)") });
        $$aggregateCNCResultForRuleWithThre = makeConstSym(("aggregateCNCResultForRuleWithThresholds"));
        $AGGREGATE_NC_RESULT_FOR_RULES_W_THRESHOLDS_UNIFY_ARGS_1_AND_4 = makeKeyword("AGGREGATE-NC-RESULT-FOR-RULES-W-THRESHOLDS-UNIFY-ARGS-1-AND-4");
        $list10 = list(
                new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("aggregateCNCResultForRuleWithThresholds")), makeKeyword("REQUIRED-PATTERN"),
                        list(makeConstSym(("aggregateCNCResultForRuleWithThresholds")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER,
                        makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                        list(makeKeyword("TEMPLATE"),
                                list(makeConstSym(("aggregateCNCResultForRuleWithThresholds")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("THRESHOLD1")), list(makeKeyword("BIND"), makeSymbol("THRESHOLD2")), makeKeyword("ANYTHING"),
                                        list(makeKeyword("BIND"), makeSymbol("ENGINE"))),
                                list(list(makeKeyword("VALUE"), makeSymbol("THRESHOLD1")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD2")), list(makeKeyword("VALUE"), makeSymbol("ENGINE")))),
                        makeKeyword("OUTPUT-GENERATE-PATTERN"),
                        list(makeKeyword("CALL"), makeSymbol("GET-AGGREGATE-RESULTS-FOR-ALL-W-THRESHOLDS"), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD1")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD2")),
                                list(makeKeyword("CALL"), makeSymbol("GET-SEARCH-ENGINE-KEYWORD"), list(makeKeyword("VALUE"), makeSymbol("ENGINE")))),
                        makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                        list(makeKeyword("TUPLE"), list(makeSymbol("RULE"), makeSymbol("RESULT")),
                                list(makeConstSym(("aggregateCNCResultForRuleWithThresholds")), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD1")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD2")),
                                        list(makeKeyword("CALL"), makeSymbol("MAKE-EL-LIST-RECURSIVELY"), list(makeKeyword("VALUE"), makeSymbol("RESULT"))), list(makeKeyword("VALUE"), makeSymbol("ENGINE")))),
                        makeKeyword("SUPPORT-MODULE"), makeKeyword("CANDIDATE-NC-TESTS"), makeKeyword("DOCUMENTATION"), makeString("(#$aggregateCNCResultForRuleWithThresholds <not-fully-bound> <threshold1> <threshold2> <not-fully-bound> <search-engine>)"), makeKeyword("EXAMPLE"),
                        makeString("(#$aggregateCNCResultForRuleWithThresholds ?RULE 1 100 ?RESULT #$Google-SearchEngine)") });
        $AGGREGATE_NC_RESULT_FOR_RULE_W_THRESHOLDS_UNIFY_ARG4 = makeKeyword("AGGREGATE-NC-RESULT-FOR-RULE-W-THRESHOLDS-UNIFY-ARG4");
        $list12 = list(
                new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("aggregateCNCResultForRuleWithThresholds")), makeKeyword("REQUIRED-PATTERN"),
                        list(makeConstSym(("aggregateCNCResultForRuleWithThresholds")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER,
                        makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                        list(makeKeyword("TEMPLATE"), list(makeConstSym(("aggregateCNCResultForRuleWithThresholds")), list(makeKeyword("BIND"), makeSymbol("RULE")), list(makeKeyword("BIND"), makeSymbol("THRESHOLD1")), list(makeKeyword("BIND"), makeSymbol("THRESHOLD2")), makeKeyword("ANYTHING"),
                                list(makeKeyword("BIND"), makeSymbol("ENGINE"))), list(list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD1")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD2")), list(makeKeyword("VALUE"), makeSymbol("ENGINE")))),
                        makeKeyword("OUTPUT-GENERATE-PATTERN"),
                        list(makeKeyword("CALL"), makeSymbol("GET-AGGREGATE-CNC-RESULTS-W-THRESHOLDS"), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD1")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD2")),
                                list(makeKeyword("CALL"), makeSymbol("GET-SEARCH-ENGINE-KEYWORD"), list(makeKeyword("VALUE"), makeSymbol("ENGINE")))),
                        makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                        list(makeConstSym(("aggregateCNCResultForRuleWithThresholds")), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD1")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD2")),
                                list(makeKeyword("CALL"), makeSymbol("MAKE-EL-LIST-RECURSIVELY"), makeKeyword("INPUT")), list(makeKeyword("VALUE"), makeSymbol("ENGINE"))),
                        makeKeyword("SUPPORT-MODULE"), makeKeyword("CANDIDATE-NC-TESTS"), makeKeyword("DOCUMENTATION"), makeString("(#$aggregateCNCResultForRuleWithThresholds <rule> <threshold1> <threshold2> <not-fully-bound> <search-engine>)"), makeKeyword("EXAMPLE"),
                        makeString("(#$aggregateCNCResultForRuleWithThresholds #$TofuStew-NCR 1 100 ?RESULT #$Yahoo-SearchEngine)") });
        $DATED_CNC_TEST_FOR_NCR_REQUIRE_ARG1_FULLY_BOUND = makeKeyword("DATED-CNC-TEST-FOR-NCR-REQUIRE-ARG1-FULLY-BOUND");
        $list14 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("datedCandidateNCTestHasResults")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("DISALLOWED"));
        $AGGREGATE_NCSCORE_FOR_RULE_W_THRESHOLDS_REQUIRE_ARG_2_FULLY_BOUND = makeKeyword("AGGREGATE-NCSCORE-FOR-RULE-W-THRESHOLDS-REQUIRE-ARG-2-FULLY-BOUND");
        $list16 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("aggregateCNCScoreForRuleWithThresholds")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")),
                makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));
        $AGGREGATE_NCSCORE_FOR_RULE_W_THRESHOLDS_REQUIRE_ARG_3_FULLY_BOUND = makeKeyword("AGGREGATE-NCSCORE-FOR-RULE-W-THRESHOLDS-REQUIRE-ARG-3-FULLY-BOUND");
        $list18 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("aggregateCNCScoreForRuleWithThresholds")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")),
                makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));
        $IMAGE_INDEPENDENT_CFASL = makeKeyword("IMAGE-INDEPENDENT-CFASL");
        $sym20$CONTAINS_INVALID_FORT_ = makeSymbol("CONTAINS-INVALID-FORT?");
        $sym21$CONTAINS_SERVER_ERROR_ = makeSymbol("CONTAINS-SERVER-ERROR?");
        $$Google_SearchEngine = makeConstSym(("Google-SearchEngine"));
        $GOOGLE = makeKeyword("GOOGLE");
        $$Yahoo_SearchEngine = makeConstSym(("Yahoo-SearchEngine"));
        $YAHOO = makeKeyword("YAHOO");
        $SERVER_ERROR = makeKeyword("SERVER-ERROR");
        $str27$The_head_denot_for__S_is_an_inval = makeString("The head denot for ~S is an invalid fort.~%");
        $str28$The_modifier_denot_for__S_is_an_i = makeString("The modifier denot for ~S is an invalid fort.~%");
        $int$15552000 = makeInteger(15552000);
        $sym30$EMPTY_CNC_TEST_ = makeSymbol("EMPTY-CNC-TEST?");
        $str31$_ = makeString("-");
    }
}
/*
 *
 * Total time: 111 ms
 *
 */