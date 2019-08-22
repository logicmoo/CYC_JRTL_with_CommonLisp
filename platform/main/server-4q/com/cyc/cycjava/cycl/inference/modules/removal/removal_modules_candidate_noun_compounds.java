package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_candidate_noun_compounds extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_candidate_noun_compounds();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_candidate_noun_compounds";

    public static final String myFingerPrint = "b7ca3125e41cb2428aedd0ce9d723cff01061af2d56e2a3909dc49b9d111e75b";

    private static final SubLObject $$datedCandidateNCTestHasResults = reader_make_constant_shell(makeString("datedCandidateNCTestHasResults"));

    private static final SubLSymbol $DATED_CNC_TEST_FOR_NCR_UNIFY_ARGS_2_AND_3 = makeKeyword("DATED-CNC-TEST-FOR-NCR-UNIFY-ARGS-2-AND-3");

    public static final SubLList $list2 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("datedCandidateNCTestHasResults")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("datedCandidateNCTestHasResults")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("datedCandidateNCTestHasResults")), list(makeKeyword("BIND"), makeSymbol("RULE")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("ENGINE"))), list(list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("ENGINE")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("GET-CNC-TEST-RESULTS-AND-DATES"), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("CALL"), makeSymbol("GET-SEARCH-ENGINE-KEYWORD"), list(makeKeyword("VALUE"), makeSymbol("ENGINE")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("DATE"), makeSymbol("RESULT")), list(reader_make_constant_shell(makeString("datedCandidateNCTestHasResults")), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("CALL"), makeSymbol("CYCLIFY-CNC-DATE-STRING"), list(makeKeyword("VALUE"), makeSymbol("DATE"))), list(makeKeyword("CALL"), makeSymbol("MAKE-EL-LIST-RECURSIVELY"), list(makeKeyword("CALL"), makeSymbol("REMOVE-ERRORS-FROM-CNC-TEST-RESULTS"), list(makeKeyword("VALUE"), makeSymbol("RESULT")))), list(makeKeyword("VALUE"), makeSymbol("ENGINE")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("CANDIDATE-NC-TESTS"), makeKeyword("DOCUMENTATION"), makeString("(#$datedCandidateNCTestHasResults <rule> <not-fully-bound> <not-fully-bound> <search-engine>)"), makeKeyword("EXAMPLE"), makeString("(#$datedCandidateNCTestHasResults #$TofuStew-NCR ?DATE ?RESULT #$Google-SearchEngine)") });

    private static final SubLObject $const3$aggregateCNCScoreForRuleWithThres = reader_make_constant_shell(makeString("aggregateCNCScoreForRuleWithThresholds"));

    private static final SubLSymbol $AGGREGATE_NC_SCORE_FOR_RULES_W_THRESHOLDS_UNIFY_ARGS_1_AND_4 = makeKeyword("AGGREGATE-NC-SCORE-FOR-RULES-W-THRESHOLDS-UNIFY-ARGS-1-AND-4");

    public static final SubLList $list5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("aggregateCNCScoreForRuleWithThresholds")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("aggregateCNCScoreForRuleWithThresholds")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("aggregateCNCScoreForRuleWithThresholds")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("THRESHOLD1")), list(makeKeyword("BIND"), makeSymbol("THRESHOLD2")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("ENGINE"))), list(list(makeKeyword("VALUE"), makeSymbol("THRESHOLD1")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD2")), list(makeKeyword("VALUE"), makeSymbol("ENGINE")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("GET-AGGREGATE-SCORE-FOR-ALL-W-THRESHOLDS"), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD1")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD2")), list(makeKeyword("CALL"), makeSymbol("GET-SEARCH-ENGINE-KEYWORD"), list(makeKeyword("VALUE"), makeSymbol("ENGINE")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("RULE"), makeSymbol("SCORE")), list(reader_make_constant_shell(makeString("aggregateCNCScoreForRuleWithThresholds")), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD1")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD2")), list(makeKeyword("VALUE"), makeSymbol("SCORE")), list(makeKeyword("VALUE"), makeSymbol("ENGINE")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("CANDIDATE-NC-TESTS"), makeKeyword("DOCUMENTATION"), makeString("(#$aggregateCNCScoreForRuleWithThresholds <not-fully-bound> <threshold1> <threshold2> <not-fully-bound> <search-engine>)"), makeKeyword("EXAMPLE"), makeString("(#$aggregateCNCScoreForRuleWithThresholds ?RULE 1 100 ?SCORE #$Google-SearchEngine)") });

    private static final SubLSymbol $AGGREGATE_NC_SCORE_FOR_RULE_W_THRESHOLDS_UNIFY_ARG4 = makeKeyword("AGGREGATE-NC-SCORE-FOR-RULE-W-THRESHOLDS-UNIFY-ARG4");

    public static final SubLList $list7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("aggregateCNCScoreForRuleWithThresholds")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("aggregateCNCScoreForRuleWithThresholds")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("aggregateCNCScoreForRuleWithThresholds")), list(makeKeyword("BIND"), makeSymbol("RULE")), list(makeKeyword("BIND"), makeSymbol("THRESHOLD1")), list(makeKeyword("BIND"), makeSymbol("THRESHOLD2")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("ENGINE"))), list(list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD1")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD2")), list(makeKeyword("VALUE"), makeSymbol("ENGINE")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("GET-AGGREGATE-CNC-SCORE-W-THRESHOLDS"), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD1")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD2")), list(makeKeyword("CALL"), makeSymbol("GET-SEARCH-ENGINE-KEYWORD"), list(makeKeyword("VALUE"), makeSymbol("ENGINE")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("aggregateCNCScoreForRuleWithThresholds")), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD1")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD2")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("ENGINE"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("CANDIDATE-NC-TESTS"), makeKeyword("DOCUMENTATION"), makeString("(#$aggregateCNCScoreForRuleWithThresholds <rule> <threshold1> <threshold2> <not-fully-bound> <search-engine>)"), makeKeyword("EXAMPLE"), makeString("(#$aggregateCNCScoreForRuleWithThresholds #$TofuStew-NCR 1 100 ?SCORE #$Yahoo-SearchEngine)") });

    private static final SubLObject $const8$aggregateCNCResultForRuleWithThre = reader_make_constant_shell(makeString("aggregateCNCResultForRuleWithThresholds"));

    private static final SubLSymbol $AGGREGATE_NC_RESULT_FOR_RULES_W_THRESHOLDS_UNIFY_ARGS_1_AND_4 = makeKeyword("AGGREGATE-NC-RESULT-FOR-RULES-W-THRESHOLDS-UNIFY-ARGS-1-AND-4");

    public static final SubLList $list10 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("aggregateCNCResultForRuleWithThresholds")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("aggregateCNCResultForRuleWithThresholds")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("aggregateCNCResultForRuleWithThresholds")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("THRESHOLD1")), list(makeKeyword("BIND"), makeSymbol("THRESHOLD2")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("ENGINE"))), list(list(makeKeyword("VALUE"), makeSymbol("THRESHOLD1")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD2")), list(makeKeyword("VALUE"), makeSymbol("ENGINE")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("GET-AGGREGATE-RESULTS-FOR-ALL-W-THRESHOLDS"), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD1")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD2")), list(makeKeyword("CALL"), makeSymbol("GET-SEARCH-ENGINE-KEYWORD"), list(makeKeyword("VALUE"), makeSymbol("ENGINE")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("RULE"), makeSymbol("RESULT")), list(reader_make_constant_shell(makeString("aggregateCNCResultForRuleWithThresholds")), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD1")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD2")), list(makeKeyword("CALL"), makeSymbol("MAKE-EL-LIST-RECURSIVELY"), list(makeKeyword("VALUE"), makeSymbol("RESULT"))), list(makeKeyword("VALUE"), makeSymbol("ENGINE")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("CANDIDATE-NC-TESTS"), makeKeyword("DOCUMENTATION"), makeString("(#$aggregateCNCResultForRuleWithThresholds <not-fully-bound> <threshold1> <threshold2> <not-fully-bound> <search-engine>)"), makeKeyword("EXAMPLE"), makeString("(#$aggregateCNCResultForRuleWithThresholds ?RULE 1 100 ?RESULT #$Google-SearchEngine)") });

    private static final SubLSymbol $AGGREGATE_NC_RESULT_FOR_RULE_W_THRESHOLDS_UNIFY_ARG4 = makeKeyword("AGGREGATE-NC-RESULT-FOR-RULE-W-THRESHOLDS-UNIFY-ARG4");

    public static final SubLList $list12 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("aggregateCNCResultForRuleWithThresholds")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("aggregateCNCResultForRuleWithThresholds")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("aggregateCNCResultForRuleWithThresholds")), list(makeKeyword("BIND"), makeSymbol("RULE")), list(makeKeyword("BIND"), makeSymbol("THRESHOLD1")), list(makeKeyword("BIND"), makeSymbol("THRESHOLD2")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("ENGINE"))), list(list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD1")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD2")), list(makeKeyword("VALUE"), makeSymbol("ENGINE")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("GET-AGGREGATE-CNC-RESULTS-W-THRESHOLDS"), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD1")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD2")), list(makeKeyword("CALL"), makeSymbol("GET-SEARCH-ENGINE-KEYWORD"), list(makeKeyword("VALUE"), makeSymbol("ENGINE")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("aggregateCNCResultForRuleWithThresholds")), list(makeKeyword("VALUE"), makeSymbol("RULE")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD1")), list(makeKeyword("VALUE"), makeSymbol("THRESHOLD2")), list(makeKeyword("CALL"), makeSymbol("MAKE-EL-LIST-RECURSIVELY"), makeKeyword("INPUT")), list(makeKeyword("VALUE"), makeSymbol("ENGINE"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("CANDIDATE-NC-TESTS"), makeKeyword("DOCUMENTATION"), makeString("(#$aggregateCNCResultForRuleWithThresholds <rule> <threshold1> <threshold2> <not-fully-bound> <search-engine>)"), makeKeyword("EXAMPLE"), makeString("(#$aggregateCNCResultForRuleWithThresholds #$TofuStew-NCR 1 100 ?RESULT #$Yahoo-SearchEngine)") });

    private static final SubLSymbol $DATED_CNC_TEST_FOR_NCR_REQUIRE_ARG1_FULLY_BOUND = makeKeyword("DATED-CNC-TEST-FOR-NCR-REQUIRE-ARG1-FULLY-BOUND");

    public static final SubLList $list14 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("datedCandidateNCTestHasResults")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));

    private static final SubLSymbol $AGGREGATE_NCSCORE_FOR_RULE_W_THRESHOLDS_REQUIRE_ARG_2_FULLY_BOUND = makeKeyword("AGGREGATE-NCSCORE-FOR-RULE-W-THRESHOLDS-REQUIRE-ARG-2-FULLY-BOUND");

    public static final SubLList $list16 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("aggregateCNCScoreForRuleWithThresholds")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));

    private static final SubLSymbol $AGGREGATE_NCSCORE_FOR_RULE_W_THRESHOLDS_REQUIRE_ARG_3_FULLY_BOUND = makeKeyword("AGGREGATE-NCSCORE-FOR-RULE-W-THRESHOLDS-REQUIRE-ARG-3-FULLY-BOUND");

    public static final SubLList $list18 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("aggregateCNCScoreForRuleWithThresholds")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));

    private static final SubLSymbol $IMAGE_INDEPENDENT_CFASL = makeKeyword("IMAGE-INDEPENDENT-CFASL");

    public static final SubLSymbol $sym20$CONTAINS_INVALID_FORT_ = makeSymbol("CONTAINS-INVALID-FORT?");

    public static final SubLSymbol $sym21$CONTAINS_SERVER_ERROR_ = makeSymbol("CONTAINS-SERVER-ERROR?");

    private static final SubLObject $$Google_SearchEngine = reader_make_constant_shell(makeString("Google-SearchEngine"));



    private static final SubLObject $$Yahoo_SearchEngine = reader_make_constant_shell(makeString("Yahoo-SearchEngine"));





    public static final SubLString $str27$The_head_denot_for__S_is_an_inval = makeString("The head denot for ~S is an invalid fort.~%");

    public static final SubLString $str28$The_modifier_denot_for__S_is_an_i = makeString("The modifier denot for ~S is an invalid fort.~%");

    private static final SubLInteger $int$15552000 = makeInteger(15552000);

    public static final SubLSymbol $sym30$EMPTY_CNC_TEST_ = makeSymbol("EMPTY-CNC-TEST?");

    public static final SubLString $str31$_ = makeString("-");

    public static SubLObject check_dated_cnc_test_for_rule(final SubLObject rule, final SubLObject date, final SubLObject result, final SubLObject engine) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule_el = cycl_utilities.hl_to_el(rule);
        final SubLObject value = list(date, result);
        final SubLObject key = list(rule_el, engine);
        final SubLObject tests = candidate_nc_utilities.cnc_get_from_fht(key, candidate_nc_utilities.$scored_ncr_table$.getDynamicValue(thread));
        return subl_promotions.memberP(value, tests, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_cnc_test_results_and_dates(final SubLObject rule, final SubLObject engine) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule_el = cycl_utilities.hl_to_el(rule);
        final SubLObject key = list(rule_el, engine);
        final SubLObject tests = remove_empty_cnc_tests(candidate_nc_utilities.cnc_get_from_fht(key, candidate_nc_utilities.$scored_ncr_table$.getDynamicValue(thread)));
        return tests;
    }

    public static SubLObject get_aggregate_cnc_score_w_thresholds(final SubLObject rule, final SubLObject compound_threshold, final SubLObject component_threshold, final SubLObject engine) {
        return list(second(evaluate_aggregate_cnc_results_w_thresholds(rule, compound_threshold, component_threshold, engine)));
    }

    public static SubLObject get_aggregate_score_for_all_w_thresholds(final SubLObject compound_threshold, final SubLObject component_threshold, final SubLObject engine) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject covered_rules = NIL;
        SubLObject results = NIL;
        SubLObject fht = NIL;
        try {
            fht = file_hash_table.open_file_hash_table_read_only(candidate_nc_utilities.$scored_ncr_table$.getDynamicValue(thread), EQUAL, $IMAGE_INDEPENDENT_CFASL);
            SubLObject continuation = NIL;
            SubLObject next;
            for (SubLObject completeP = NIL; NIL == completeP; completeP = sublisp_null(next)) {
                thread.resetMultipleValues();
                final SubLObject the_key = file_hash_table.get_file_hash_table_any(fht, continuation, NIL);
                final SubLObject the_value = thread.secondMultipleValue();
                next = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != next) {
                    final SubLObject key = the_key;
                    final SubLObject value = the_value;
                    covered_rules = cons(key.first(), covered_rules);
                }
                continuation = next;
            }
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != file_hash_table.file_hash_table_p(fht)) {
                    file_hash_table.finalize_file_hash_table(fht);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        SubLObject cdolist_list_var = covered_rules;
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject score = get_aggregate_cnc_score_w_thresholds(rule, compound_threshold, component_threshold, engine);
            if (NIL != score.first()) {
                results = cons(cons(rule, score), results);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        } 
        return results;
    }

    public static SubLObject get_aggregate_results_for_all_w_thresholds(final SubLObject compound_threshold, final SubLObject component_threshold, final SubLObject engine) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject covered_rules = NIL;
        SubLObject results = NIL;
        SubLObject fht = NIL;
        try {
            fht = file_hash_table.open_file_hash_table_read_only(candidate_nc_utilities.$scored_ncr_table$.getDynamicValue(thread), EQUAL, $IMAGE_INDEPENDENT_CFASL);
            SubLObject continuation = NIL;
            SubLObject next;
            for (SubLObject completeP = NIL; NIL == completeP; completeP = sublisp_null(next)) {
                thread.resetMultipleValues();
                final SubLObject the_key = file_hash_table.get_file_hash_table_any(fht, continuation, NIL);
                final SubLObject the_value = thread.secondMultipleValue();
                next = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != next) {
                    final SubLObject key = the_key;
                    final SubLObject value = the_value;
                    covered_rules = cons(key.first(), covered_rules);
                }
                continuation = next;
            }
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != file_hash_table.file_hash_table_p(fht)) {
                    file_hash_table.finalize_file_hash_table(fht);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        SubLObject cdolist_list_var = covered_rules;
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject eval_result = evaluate_aggregate_cnc_results_w_thresholds(rule, compound_threshold, component_threshold, engine);
            if (NIL != eval_result.first()) {
                results = cons(list(rule, eval_result), results);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        } 
        return results;
    }

    public static SubLObject get_aggregate_cnc_results_w_thresholds(final SubLObject rule, final SubLObject threshold1, final SubLObject threshold2, final SubLObject engine) {
        final SubLObject v_answer = evaluate_aggregate_cnc_results_w_thresholds(rule, threshold1, threshold2, engine);
        return removal_module_utilities.non_null_answer_to_singleton(v_answer);
    }

    public static SubLObject remove_errors_from_cnc_test_results(final SubLObject test_results_list) {
        return delete_if($sym20$CONTAINS_INVALID_FORT_, delete_if($sym21$CONTAINS_SERVER_ERROR_, test_results_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_search_engine_keyword(final SubLObject engine) {
        final SubLObject engine_keyword = (engine.equal($$Google_SearchEngine)) ? $GOOGLE : engine.equal($$Yahoo_SearchEngine) ? $YAHOO : engine;
        return engine_keyword;
    }

    public static SubLObject contains_server_errorP(final SubLObject test_item) {
        return cycl_utilities.expression_find($SERVER_ERROR, test_item, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject contains_invalid_fortP(final SubLObject test_item) {
        final SubLObject mod_denot = fourth(test_item);
        final SubLObject head_denot = fifth(test_item);
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

    public static SubLObject evaluate_aggregate_cnc_results_w_thresholds(final SubLObject rule, final SubLObject compound_threshold, final SubLObject component_threshold, final SubLObject engine) {
        final SubLObject aggregate_result = aggregate_cnc_results_for_rule(rule, engine, UNPROVIDED);
        final SubLObject score_tuple = candidate_nc_utilities.evaluate_cnc_results_w_thresholds(aggregate_result, compound_threshold, component_threshold);
        return score_tuple;
    }

    public static SubLObject aggregate_cnc_results_for_rule(final SubLObject rule, final SubLObject engine, SubLObject cutoff_date) {
        if (cutoff_date == UNPROVIDED) {
            cutoff_date = subtract(get_universal_time(), $int$15552000);
        }
        final SubLObject stored_results = get_cnc_test_results_and_dates(rule, engine);
        SubLObject earliest_date = NIL;
        SubLObject aggregate_data = NIL;
        SubLObject cdolist_list_var = stored_results;
        SubLObject test = NIL;
        test = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject date = test.first();
            final SubLObject data = second(test);
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
        aggregate_data = remove_duplicates(aggregate_data, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return list(earliest_date, aggregate_data);
    }

    public static SubLObject empty_cnc_testP(final SubLObject test_item) {
        return sublisp_null(list_utilities.sublisp_boolean(second(test_item)));
    }

    public static SubLObject remove_empty_cnc_tests(final SubLObject test_list) {
        return delete_if($sym30$EMPTY_CNC_TEST_, test_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cyclify_cnc_date_string(final SubLObject date_string) {
        return date_utilities.universal_time_to_cycl_date(string_utilities.remove_substring(date_string, $str31$_));
    }

    public static SubLObject candidate_nc_test_verify_general(final SubLObject asent, final SubLObject mt) {
        final SubLObject rule = cycl_utilities.formula_arg1(asent, UNPROVIDED);
        final SubLObject date = cycl_utilities.formula_arg2(asent, UNPROVIDED);
        final SubLObject result = cycl_utilities.formula_arg3(asent, UNPROVIDED);
        final SubLObject engine = cycl_utilities.formula_arg4(asent, UNPROVIDED);
        return check_dated_cnc_test_for_rule(rule, date, result, engine);
    }

    public static SubLObject candidate_nc_test_justify_general(final SubLObject asent, final SubLObject mt) {
        final SubLObject supports = NIL;
        return supports;
    }

    public static SubLObject declare_removal_modules_candidate_noun_compounds_file() {
        declareFunction(me, "check_dated_cnc_test_for_rule", "CHECK-DATED-CNC-TEST-FOR-RULE", 4, 0, false);
        declareFunction(me, "get_cnc_test_results_and_dates", "GET-CNC-TEST-RESULTS-AND-DATES", 2, 0, false);
        declareFunction(me, "get_aggregate_cnc_score_w_thresholds", "GET-AGGREGATE-CNC-SCORE-W-THRESHOLDS", 4, 0, false);
        declareFunction(me, "get_aggregate_score_for_all_w_thresholds", "GET-AGGREGATE-SCORE-FOR-ALL-W-THRESHOLDS", 3, 0, false);
        declareFunction(me, "get_aggregate_results_for_all_w_thresholds", "GET-AGGREGATE-RESULTS-FOR-ALL-W-THRESHOLDS", 3, 0, false);
        declareFunction(me, "get_aggregate_cnc_results_w_thresholds", "GET-AGGREGATE-CNC-RESULTS-W-THRESHOLDS", 4, 0, false);
        declareFunction(me, "remove_errors_from_cnc_test_results", "REMOVE-ERRORS-FROM-CNC-TEST-RESULTS", 1, 0, false);
        declareFunction(me, "get_search_engine_keyword", "GET-SEARCH-ENGINE-KEYWORD", 1, 0, false);
        declareFunction(me, "contains_server_errorP", "CONTAINS-SERVER-ERROR?", 1, 0, false);
        declareFunction(me, "contains_invalid_fortP", "CONTAINS-INVALID-FORT?", 1, 0, false);
        declareFunction(me, "evaluate_aggregate_cnc_results_w_thresholds", "EVALUATE-AGGREGATE-CNC-RESULTS-W-THRESHOLDS", 4, 0, false);
        declareFunction(me, "aggregate_cnc_results_for_rule", "AGGREGATE-CNC-RESULTS-FOR-RULE", 2, 1, false);
        declareFunction(me, "empty_cnc_testP", "EMPTY-CNC-TEST?", 1, 0, false);
        declareFunction(me, "remove_empty_cnc_tests", "REMOVE-EMPTY-CNC-TESTS", 1, 0, false);
        declareFunction(me, "cyclify_cnc_date_string", "CYCLIFY-CNC-DATE-STRING", 1, 0, false);
        declareFunction(me, "candidate_nc_test_verify_general", "CANDIDATE-NC-TEST-VERIFY-GENERAL", 2, 0, false);
        declareFunction(me, "candidate_nc_test_justify_general", "CANDIDATE-NC-TEST-JUSTIFY-GENERAL", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_candidate_noun_compounds_file() {
        return NIL;
    }

    public static SubLObject setup_removal_modules_candidate_noun_compounds_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$datedCandidateNCTestHasResults);
        inference_modules.inference_removal_module($DATED_CNC_TEST_FOR_NCR_UNIFY_ARGS_2_AND_3, $list2);
        inference_modules.register_solely_specific_removal_module_predicate($const3$aggregateCNCScoreForRuleWithThres);
        inference_modules.inference_removal_module($AGGREGATE_NC_SCORE_FOR_RULES_W_THRESHOLDS_UNIFY_ARGS_1_AND_4, $list5);
        inference_modules.inference_removal_module($AGGREGATE_NC_SCORE_FOR_RULE_W_THRESHOLDS_UNIFY_ARG4, $list7);
        inference_modules.register_solely_specific_removal_module_predicate($const8$aggregateCNCResultForRuleWithThre);
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

    
}

/**
 * Total time: 111 ms
 */
