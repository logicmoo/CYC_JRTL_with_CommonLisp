/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REFORMULATOR-RULE-UNIFIER
 * source file: /cyc/top/cycl/reformulator-rule-unifier.lisp
 * created:     2019/07/03 17:37:33
 */
public final class reformulator_rule_unifier extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new reformulator_rule_unifier();

 public static final String myName = "com.cyc.cycjava.cycl.reformulator_rule_unifier";


    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $reformulator_removal_only_ask_inference_parameters$ = makeSymbol("*REFORMULATOR-REMOVAL-ONLY-ASK-INFERENCE-PARAMETERS*");



    static private final SubLList $list1 = list(new SubLObject[]{ makeKeyword("REQUIRED"), makeSymbol("TRUE"), $COST, makeSymbol("RRU-COST-ESTIMATE"), makeKeyword("REFORMULATE"), makeSymbol("RRU-REFORMULATE-EXPRESSION"), makeKeyword("DOCUMENTATION"), makeString("The fallback mechanism for the reformulator.\n    Unifies the input expression with applicable reformulator rules."), makeKeyword("EXAMPLE-SOURCE"), makeString("(#$implies (#$isa ?X #$Dog) (#$isa ?X #$Animal))"), makeKeyword("EXAMPLE-TARGET"), makeString("(#$genls #$Dog #$Animal)") });

    private static final SubLSymbol REFORMULATOR_MATCH_EXPRESSION = makeSymbol("REFORMULATOR-MATCH-EXPRESSION");











    private static final SubLSymbol FIND_USABLE_UNASSOCIATED_RULES_CACHED_INT = makeSymbol("FIND-USABLE-UNASSOCIATED-RULES-CACHED-INT");

    private static final SubLList $list19 = list(makeKeyword("KB"), makeKeyword("ARITY"), makeKeyword("ALL"));

    private static final SubLList $list21 = list(makeKeyword("ARITY"), makeKeyword("ALL"));

    private static final SubLSymbol $sym23$NEITHER_DIRECTION_ = makeSymbol("NEITHER-DIRECTION?");

    private static final SubLSymbol $REMOVAL_ONLY_ASK = makeKeyword("REMOVAL-ONLY-ASK");

    private static final SubLList $list26 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    private static final SubLSymbol REFORMULATOR_REMOVAL_ONLY_ASK = makeSymbol("REFORMULATOR-REMOVAL-ONLY-ASK");

    private static final SubLSymbol $sym30$FORT__ = makeSymbol("FORT-<");

    // Definitions
    public static final SubLObject rru_cost_estimate_alt(SubLObject expression, SubLObject mt, SubLObject settings) {
        return $most_positive_fixnum$.getGlobalValue();
    }

    // Definitions
    public static SubLObject rru_cost_estimate(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return $most_positive_fixnum$.getGlobalValue();
    }

    public static final SubLObject rru_reformulate_expression_alt(SubLObject expression, SubLObject original_clause, SubLObject mt, SubLObject settings) {
        {
            SubLObject usable_unassociated_rules = com.cyc.cycjava.cycl.reformulator_rule_unifier.find_usable_unassociated_rules_cached(settings, mt);
            return com.cyc.cycjava.cycl.reformulator_rule_unifier.reformulator_match_expression(expression, mt, settings, usable_unassociated_rules);
        }
    }

    public static SubLObject rru_reformulate_expression(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings) {
        final SubLObject usable_unassociated_rules = find_usable_unassociated_rules_cached(settings, mt);
        return reformulator_match_expression(expression, mt, settings, usable_unassociated_rules);
    }

    /**
     * How many reformulation rules will have to be checked against EXPRESSION?
     */
    @LispMethod(comment = "How many reformulation rules will have to be checked against EXPRESSION?")
    public static final SubLObject reformulation_cost_estimate_alt(SubLObject expression, SubLObject mt, SubLObject reformulator_modes, SubLObject meta_predicates) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (reformulator_modes == UNPROVIDED) {
            reformulator_modes = NIL;
        }
        if (meta_predicates == UNPROVIDED) {
            meta_predicates = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == reformulator_datastructures.reformulator_initializedP()) {
                return NIL;
            }
            {
                SubLObject result = ZERO_INTEGER;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        if (NIL == reformulator_modes) {
                            reformulator_modes = reformulator_datastructures.default_reformulator_mode_precedence(mt);
                        }
                        if (NIL != reformulator_modes) {
                            {
                                SubLObject expression_forts = reformulator_rule_unifier_datastructures.reformulator_relevant_forts(expression);
                                SubLObject reformulator_rules_to_use = com.cyc.cycjava.cycl.reformulator_rule_unifier.find_kb_reformulator_rules_to_use(expression, expression_forts, mt, NIL, reformulator_modes, $KB, meta_predicates);
                                SubLObject cdolist_list_var = reformulator_rules_to_use;
                                SubLObject rr = NIL;
                                for (rr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rr = cdolist_list_var.first()) {
                                    if (NIL != com.cyc.cycjava.cycl.reformulator_rule_unifier.reformulator_rule_accessible_from_mtP(rr, mt)) {
                                        {
                                            SubLObject direction_to_use = com.cyc.cycjava.cycl.reformulator_rule_unifier.direction_to_apply_reformulator_rule(rr, mt, reformulator_modes);
                                            if (NIL != com.cyc.cycjava.cycl.reformulator_rule_unifier.reformulation_possible_with_source_rtP(expression, expression_forts, rr, direction_to_use)) {
                                                result = add(result, ONE_INTEGER);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * How many reformulation rules will have to be checked against EXPRESSION?
     */
    @LispMethod(comment = "How many reformulation rules will have to be checked against EXPRESSION?")
    public static SubLObject reformulation_cost_estimate(final SubLObject expression, SubLObject mt, SubLObject reformulator_modes, SubLObject meta_predicates) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (reformulator_modes == UNPROVIDED) {
            reformulator_modes = NIL;
        }
        if (meta_predicates == UNPROVIDED) {
            meta_predicates = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == reformulator_datastructures.reformulator_initializedP()) {
            return NIL;
        }
        SubLObject result = ZERO_INTEGER;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            if (NIL == reformulator_modes) {
                reformulator_modes = reformulator_datastructures.default_reformulator_mode_precedence(mt);
            }
            if (NIL != reformulator_modes) {
                final SubLObject expression_forts = reformulator_rule_unifier_datastructures.reformulator_relevant_forts(expression);
                SubLObject cdolist_list_var;
                final SubLObject reformulator_rules_to_use = cdolist_list_var = find_kb_reformulator_rules_to_use(expression, expression_forts, mt, NIL, reformulator_modes, $KB, meta_predicates);
                SubLObject rr = NIL;
                rr = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != reformulator_rule_accessible_from_mtP(rr, mt)) {
                        final SubLObject direction_to_use = direction_to_apply_reformulator_rule(rr, mt, reformulator_modes);
                        if (NIL != reformulation_possible_with_source_rtP(expression, expression_forts, rr, direction_to_use)) {
                            result = add(result, ONE_INTEGER);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    rr = cdolist_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @param expression;
    el-expression?
     * 		
     * @param mt;
    fort-p
     * 		
     * @param settings;
    p-list
     * 		
     * @return 0 el-expression?; reformulated expression or the original expression itself
     * @return 1 listp; if the first result value is a reformulation of the original expression, then a list whose only
    element is a justification for the reformulation (the KB assertion corresponding to the reformulator
    rule that is responsible for the reformulation, if there is any such assertion; otherwise the reformulator
    rule itself);
    nil otherwise
    Tries to match EXPRESSION against the reformulator rules in REFORMULATOR-RULES-TO-USE in MT given SETTINGS.
    Returns the reformulated expression or the original expression itself if no reformulation is possible, together with
    justification for reformulation, if any.
     */
    @LispMethod(comment = "@param expression;\nel-expression?\r\n\t\t\r\n@param mt;\nfort-p\r\n\t\t\r\n@param settings;\np-list\r\n\t\t\r\n@return 0 el-expression?; reformulated expression or the original expression itself\r\n@return 1 listp; if the first result value is a reformulation of the original expression, then a list whose only\r\nelement is a justification for the reformulation (the KB assertion corresponding to the reformulator\r\nrule that is responsible for the reformulation, if there is any such assertion; otherwise the reformulator\r\nrule itself);\r\nnil otherwise\r\nTries to match EXPRESSION against the reformulator rules in REFORMULATOR-RULES-TO-USE in MT given SETTINGS.\r\nReturns the reformulated expression or the original expression itself if no reformulation is possible, together with\r\njustification for reformulation, if any.")
    public static final SubLObject reformulator_match_expression_internal_alt(SubLObject expression, SubLObject mt, SubLObject settings, SubLObject usable_unassociated_rules) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject expression_forts = reformulator_rule_unifier_datastructures.reformulator_relevant_forts(expression);
                SubLObject skip_assertions = reformulator_datastructures.get_reformulator_rule_skip_assertions(settings);
                SubLObject explicit_reformulator_rules = reformulator_datastructures.get_reformulator_rules(settings);
                SubLObject wff_degree = reformulator_datastructures.get_wff_enforcement(settings);
                SubLObject search_strategy = reformulator_datastructures.get_search_strategy(settings);
                SubLObject use_kb_reformulator_rulesP = reformulator_datastructures.get_use_kb_reformulator_rulesP(settings);
                SubLObject reformulator_modes = reformulator_datastructures.get_reformulator_modes(settings, mt);
                SubLObject meta_predicates = reformulator_datastructures.get_reformulator_meta_predicates(settings);
                SubLObject kb_reformulator_rules_to_use = NIL;
                SubLObject reformulator_rules_in_order = NIL;
                SubLObject all_reformulator_rules_to_use = NIL;
                SubLObject result = NIL;
                SubLObject justification = NIL;
                if (use_kb_reformulator_rulesP == $TRUE) {
                    kb_reformulator_rules_to_use = com.cyc.cycjava.cycl.reformulator_rule_unifier.find_kb_reformulator_rules_to_use(expression, expression_forts, mt, skip_assertions, reformulator_modes, wff_degree, meta_predicates);
                    reformulator_rules_in_order = com.cyc.cycjava.cycl.reformulator_rule_unifier.order_reformulator_rules(append(explicit_reformulator_rules, kb_reformulator_rules_to_use), expression, expression_forts, mt, reformulator_modes);
                    all_reformulator_rules_to_use = (NIL != forts.fort_p(expression)) ? ((SubLObject) (reformulator_rules_in_order)) : append(reformulator_rules_in_order, usable_unassociated_rules);
                } else {
                    all_reformulator_rules_to_use = com.cyc.cycjava.cycl.reformulator_rule_unifier.order_reformulator_rules(explicit_reformulator_rules, expression, expression_forts, mt, reformulator_modes);
                }
                {
                    SubLObject pcase_var = search_strategy;
                    if (pcase_var.eql($NO_SEARCH)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject result_1 = com.cyc.cycjava.cycl.reformulator_rule_unifier.reformulator_match_expression_no_search(all_reformulator_rules_to_use, expression, expression_forts, mt, settings, reformulator_modes, wff_degree);
                            SubLObject justification_2 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            result = result_1;
                            justification = justification_2;
                        }
                    }
                }
                if (NIL != result) {
                    return values(result, justification);
                } else {
                    return values(expression, NIL);
                }
            }
        }
    }

    /**
     *
     *
     * @param expression;
    el-expression?
     * 		
     * @param mt;
    fort-p
     * 		
     * @param settings;
    p-list
     * 		
     * @return 0 el-expression?; reformulated expression or the original expression itself
     * @return 1 listp; if the first result value is a reformulation of the original expression, then a list whose only
    element is a justification for the reformulation (the KB assertion corresponding to the reformulator
    rule that is responsible for the reformulation, if there is any such assertion; otherwise the reformulator
    rule itself);
    nil otherwise
    Tries to match EXPRESSION against the reformulator rules in REFORMULATOR-RULES-TO-USE in MT given SETTINGS.
    Returns the reformulated expression or the original expression itself if no reformulation is possible, together with
    justification for reformulation, if any.
     */
    @LispMethod(comment = "@param expression;\nel-expression?\r\n\t\t\r\n@param mt;\nfort-p\r\n\t\t\r\n@param settings;\np-list\r\n\t\t\r\n@return 0 el-expression?; reformulated expression or the original expression itself\r\n@return 1 listp; if the first result value is a reformulation of the original expression, then a list whose only\r\nelement is a justification for the reformulation (the KB assertion corresponding to the reformulator\r\nrule that is responsible for the reformulation, if there is any such assertion; otherwise the reformulator\r\nrule itself);\r\nnil otherwise\r\nTries to match EXPRESSION against the reformulator rules in REFORMULATOR-RULES-TO-USE in MT given SETTINGS.\r\nReturns the reformulated expression or the original expression itself if no reformulation is possible, together with\r\njustification for reformulation, if any.")
    public static SubLObject reformulator_match_expression_internal(final SubLObject expression, final SubLObject mt, final SubLObject settings, final SubLObject usable_unassociated_rules) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject expression_forts = reformulator_rule_unifier_datastructures.reformulator_relevant_forts(expression);
        final SubLObject skip_assertions = reformulator_datastructures.get_reformulator_rule_skip_assertions(settings);
        final SubLObject explicit_reformulator_rules = reformulator_datastructures.get_reformulator_rules(settings);
        final SubLObject wff_degree = reformulator_datastructures.get_wff_enforcement(settings);
        final SubLObject search_strategy = reformulator_datastructures.get_search_strategy(settings);
        final SubLObject use_kb_reformulator_rulesP = reformulator_datastructures.get_use_kb_reformulator_rulesP(settings);
        final SubLObject reformulator_modes = reformulator_datastructures.get_reformulator_modes(settings, mt);
        final SubLObject meta_predicates = reformulator_datastructures.get_reformulator_meta_predicates(settings);
        SubLObject kb_reformulator_rules_to_use = NIL;
        SubLObject reformulator_rules_in_order = NIL;
        SubLObject all_reformulator_rules_to_use = NIL;
        SubLObject result = NIL;
        SubLObject justification = NIL;
        if (use_kb_reformulator_rulesP == $TRUE) {
            kb_reformulator_rules_to_use = find_kb_reformulator_rules_to_use(expression, expression_forts, mt, skip_assertions, reformulator_modes, wff_degree, meta_predicates);
            reformulator_rules_in_order = order_reformulator_rules(append(explicit_reformulator_rules, kb_reformulator_rules_to_use), expression, expression_forts, mt, reformulator_modes);
            all_reformulator_rules_to_use = (NIL != forts.fort_p(expression)) ? reformulator_rules_in_order : append(reformulator_rules_in_order, usable_unassociated_rules);
        } else {
            all_reformulator_rules_to_use = order_reformulator_rules(explicit_reformulator_rules, expression, expression_forts, mt, reformulator_modes);
        }
        final SubLObject pcase_var = search_strategy;
        if (pcase_var.eql($NO_SEARCH)) {
            thread.resetMultipleValues();
            final SubLObject result_$1 = reformulator_match_expression_no_search(all_reformulator_rules_to_use, expression, expression_forts, mt, settings, reformulator_modes, wff_degree);
            final SubLObject justification_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = result_$1;
            justification = justification_$2;
        }
        if (NIL != result) {
            return values(result, justification);
        }
        return values(expression, NIL);
    }

    public static final SubLObject reformulator_match_expression_alt(SubLObject expression, SubLObject mt, SubLObject settings, SubLObject usable_unassociated_rules) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.reformulator_rule_unifier.reformulator_match_expression_internal(expression, mt, settings, usable_unassociated_rules);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, REFORMULATOR_MATCH_EXPRESSION, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), REFORMULATOR_MATCH_EXPRESSION, FOUR_INTEGER, $int$64, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, REFORMULATOR_MATCH_EXPRESSION, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_4(expression, mt, settings, usable_unassociated_rules);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw7$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (expression.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (mt.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (settings.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && usable_unassociated_rules.equal(cached_args.first())) {
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
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.reformulator_rule_unifier.reformulator_match_expression_internal(expression, mt, settings, usable_unassociated_rules)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(expression, mt, settings, usable_unassociated_rules));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject reformulator_match_expression(final SubLObject expression, final SubLObject mt, final SubLObject settings, final SubLObject usable_unassociated_rules) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return reformulator_match_expression_internal(expression, mt, settings, usable_unassociated_rules);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, REFORMULATOR_MATCH_EXPRESSION, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), REFORMULATOR_MATCH_EXPRESSION, FOUR_INTEGER, $int$64, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, REFORMULATOR_MATCH_EXPRESSION, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(expression, mt, settings, usable_unassociated_rules);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (expression.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (settings.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && usable_unassociated_rules.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(reformulator_match_expression_internal(expression, mt, settings, usable_unassociated_rules)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(expression, mt, settings, usable_unassociated_rules));
        return memoization_state.caching_results(results3);
    }

    /**
     * Tries to match EXPRESSION against the reformulator rules in REFORMULATOR-RULES in MT given SETTINGS.
     * Returns the result expression of the first match found, together with the justification (the KB assertion
     * corresponding to the rule that matches, if there is any such assertion; otherwise the rule itself).
     * Returns nil for both values if no such match was found.
     */
    @LispMethod(comment = "Tries to match EXPRESSION against the reformulator rules in REFORMULATOR-RULES in MT given SETTINGS.\r\nReturns the result expression of the first match found, together with the justification (the KB assertion\r\ncorresponding to the rule that matches, if there is any such assertion; otherwise the rule itself).\r\nReturns nil for both values if no such match was found.\nTries to match EXPRESSION against the reformulator rules in REFORMULATOR-RULES in MT given SETTINGS.\nReturns the result expression of the first match found, together with the justification (the KB assertion\ncorresponding to the rule that matches, if there is any such assertion; otherwise the rule itself).\nReturns nil for both values if no such match was found.")
    public static final SubLObject reformulator_match_expression_no_search_alt(SubLObject reformulator_rules, SubLObject expression, SubLObject expression_forts, SubLObject mt, SubLObject settings, SubLObject reformulator_modes, SubLObject wff_degree) {
        {
            SubLObject result = NIL;
            SubLObject justification = NIL;
            if (NIL == result) {
                {
                    SubLObject csome_list_var = reformulator_rules;
                    SubLObject rr = NIL;
                    for (rr = csome_list_var.first(); !((NIL != result) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , rr = csome_list_var.first()) {
                        result = com.cyc.cycjava.cycl.reformulator_rule_unifier.reformulator_rule_unify_if_possible(expression, expression_forts, rr, mt, settings, reformulator_modes, wff_degree);
                        if (NIL != result) {
                            justification = cons(com.cyc.cycjava.cycl.reformulator_rule_unifier.find_justification_for_reformulator_rule(rr), justification);
                        }
                    }
                }
            }
            return values(result, justification);
        }
    }

    /**
     * Tries to match EXPRESSION against the reformulator rules in REFORMULATOR-RULES in MT given SETTINGS.
     * Returns the result expression of the first match found, together with the justification (the KB assertion
     * corresponding to the rule that matches, if there is any such assertion; otherwise the rule itself).
     * Returns nil for both values if no such match was found.
     */
    @LispMethod(comment = "Tries to match EXPRESSION against the reformulator rules in REFORMULATOR-RULES in MT given SETTINGS.\r\nReturns the result expression of the first match found, together with the justification (the KB assertion\r\ncorresponding to the rule that matches, if there is any such assertion; otherwise the rule itself).\r\nReturns nil for both values if no such match was found.\nTries to match EXPRESSION against the reformulator rules in REFORMULATOR-RULES in MT given SETTINGS.\nReturns the result expression of the first match found, together with the justification (the KB assertion\ncorresponding to the rule that matches, if there is any such assertion; otherwise the rule itself).\nReturns nil for both values if no such match was found.")
    public static SubLObject reformulator_match_expression_no_search(final SubLObject reformulator_rules, final SubLObject expression, final SubLObject expression_forts, final SubLObject mt, final SubLObject settings, final SubLObject reformulator_modes, final SubLObject wff_degree) {
        SubLObject result = NIL;
        SubLObject justification = NIL;
        if (NIL == result) {
            SubLObject csome_list_var = reformulator_rules;
            SubLObject rr = NIL;
            rr = csome_list_var.first();
            while ((NIL == result) && (NIL != csome_list_var)) {
                result = reformulator_rule_unify_if_possible(expression, expression_forts, rr, mt, settings, reformulator_modes, wff_degree);
                if (NIL != result) {
                    justification = cons(find_justification_for_reformulator_rule(rr), justification);
                }
                csome_list_var = csome_list_var.rest();
                rr = csome_list_var.first();
            } 
        }
        return values(result, justification);
    }

    /**
     *
     *
     * @return T if the target template of rr contains a pred that is notAssertible
     */
    @LispMethod(comment = "@return T if the target template of rr contains a pred that is notAssertible")
    public static final SubLObject reformulator_rule_target_is_nonassertibleP_alt(SubLObject rr, SubLObject direction, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject target = reformulator_rule_unifier_datastructures.reformulator_rule_target_rt(rr, direction);
                SubLObject templ_forts = reformulator_rule_unifier_datastructures.reformulator_template_forts(target);
                SubLObject dontassertP = NIL;
                if (NIL != com.cyc.cycjava.cycl.reformulator_rule_unifier.reformulator_rule_from_expansion_axiomP(rr)) {
                    if (NIL == dontassertP) {
                        {
                            SubLObject csome_list_var = templ_forts;
                            SubLObject afort = NIL;
                            for (afort = csome_list_var.first(); !((NIL != dontassertP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , afort = csome_list_var.first()) {
                                if (NIL != somewhere_cache.some_pred_assertion_somewhereP($$notAssertible, afort, ONE_INTEGER, UNPROVIDED)) {
                                    {
                                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                                            mt_relevance_macros.$mt$.bind(mt, thread);
                                            if (NIL != list_utilities.sublisp_boolean(kb_mapping_utilities.fpred_value(afort, $$notAssertible, ONE_INTEGER, ONE_INTEGER, UNPROVIDED))) {
                                                dontassertP = T;
                                            }
                                        } finally {
                                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return dontassertP;
            }
        }
    }

    /**
     *
     *
     * @return T if the target template of rr contains a pred that is notAssertible
     */
    @LispMethod(comment = "@return T if the target template of rr contains a pred that is notAssertible")
    public static SubLObject reformulator_rule_target_is_nonassertibleP(final SubLObject rr, final SubLObject direction, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject target = reformulator_rule_unifier_datastructures.reformulator_rule_target_rt(rr, direction);
        final SubLObject templ_forts = reformulator_rule_unifier_datastructures.reformulator_template_forts(target);
        SubLObject dontassertP = NIL;
        if ((NIL != reformulator_rule_from_expansion_axiomP(rr)) && (NIL == dontassertP)) {
            SubLObject csome_list_var = templ_forts;
            SubLObject afort = NIL;
            afort = csome_list_var.first();
            while ((NIL == dontassertP) && (NIL != csome_list_var)) {
                if (NIL != somewhere_cache.some_pred_assertion_somewhereP($$notAssertible, afort, ONE_INTEGER, UNPROVIDED)) {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        if (NIL != list_utilities.sublisp_boolean(kb_mapping_utilities.fpred_value(afort, $$notAssertible, ONE_INTEGER, ONE_INTEGER, UNPROVIDED))) {
                            dontassertP = T;
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                csome_list_var = csome_list_var.rest();
                afort = csome_list_var.first();
            } 
        }
        return dontassertP;
    }

    /**
     *
     *
     * @return T if the target template of rr contains a pred that is notAssertible
     */
    @LispMethod(comment = "@return T if the target template of rr contains a pred that is notAssertible")
    public static final SubLObject reformulator_rule_contracts_el_relationP_alt(SubLObject rr, SubLObject direction, SubLObject mt) {
        {
            SubLObject target = reformulator_rule_unifier_datastructures.reformulator_rule_target_rt(rr, direction);
            SubLObject templ_forts = reformulator_rule_unifier_datastructures.reformulator_template_forts(target);
            SubLObject expansion_relation = NIL;
            SubLObject contracting_el_relationP = NIL;
            if (NIL != com.cyc.cycjava.cycl.reformulator_rule_unifier.reformulator_rule_from_expansion_axiomP(rr)) {
                {
                    SubLObject expression = reformulator_rule_unifier_datastructures.reformulator_template_expression(target);
                    if (($$ReformulationBackwardDirection == direction) && (NIL != clause_utilities.pos_atomic_clauses_p(expression))) {
                        expansion_relation = clause_utilities.atomic_clauses_predicate(expression);
                    } else {
                        expansion_relation = cycl_utilities.formula_arg1(reformulator_hub.hl_formula_for_reformulator_rule(rr), UNPROVIDED);
                    }
                }
                if ((NIL != subl_promotions.memberP(expansion_relation, templ_forts, UNPROVIDED, UNPROVIDED)) && (NIL != fort_types_interface.isa_el_relationP(expansion_relation, mt))) {
                    contracting_el_relationP = T;
                }
            }
            return contracting_el_relationP;
        }
    }

    /**
     *
     *
     * @return T if the target template of rr contains a pred that is notAssertible
     */
    @LispMethod(comment = "@return T if the target template of rr contains a pred that is notAssertible")
    public static SubLObject reformulator_rule_contracts_el_relationP(final SubLObject rr, final SubLObject direction, final SubLObject mt) {
        final SubLObject target = reformulator_rule_unifier_datastructures.reformulator_rule_target_rt(rr, direction);
        final SubLObject templ_forts = reformulator_rule_unifier_datastructures.reformulator_template_forts(target);
        SubLObject expansion_relation = NIL;
        SubLObject contracting_el_relationP = NIL;
        if (NIL != reformulator_rule_from_expansion_axiomP(rr)) {
            final SubLObject expression = reformulator_rule_unifier_datastructures.reformulator_template_expression(target);
            if ((NIL != kb_utilities.kbeq($$ReformulationBackwardDirection, direction)) && (NIL != clause_utilities.pos_atomic_clauses_p(expression))) {
                expansion_relation = clause_utilities.atomic_clauses_predicate(expression);
            } else {
                expansion_relation = cycl_utilities.formula_arg1(reformulator_hub.hl_formula_for_reformulator_rule(rr), UNPROVIDED);
            }
            if ((NIL != subl_promotions.memberP(expansion_relation, templ_forts, UNPROVIDED, UNPROVIDED)) && (NIL != fort_types_interface.isa_el_relationP(expansion_relation, mt))) {
                contracting_el_relationP = T;
            }
        }
        return contracting_el_relationP;
    }

    public static final SubLObject reformulator_rule_from_expansion_axiomP_alt(SubLObject rr) {
        {
            SubLObject reformulation_pred = reformulator_rule_unifier_datastructures.reformulator_rule_rule_pred(rr);
            return makeBoolean(reformulation_pred.eql($$expansion) || reformulation_pred.eql($$expansionAxiom));
        }
    }

    public static SubLObject reformulator_rule_from_expansion_axiomP(final SubLObject rr) {
        final SubLObject reformulation_pred = reformulator_rule_unifier_datastructures.reformulator_rule_rule_pred(rr);
        return makeBoolean((NIL != kb_utilities.kbeq(reformulation_pred, $$expansion)) || (NIL != kb_utilities.kbeq(reformulation_pred, $$expansionAxiom)));
    }

    /**
     *
     *
     * @return expression or nil; a unified template if unification was successful, otherwise nil.
     */
    @LispMethod(comment = "@return expression or nil; a unified template if unification was successful, otherwise nil.")
    public static final SubLObject reformulator_rule_unify_if_possible_alt(SubLObject expression, SubLObject expression_forts, SubLObject rr, SubLObject mt, SubLObject settings, SubLObject reformulator_modes, SubLObject wff_degree) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject direction_to_use = com.cyc.cycjava.cycl.reformulator_rule_unifier.direction_to_apply_reformulator_rule(rr, mt, reformulator_modes);
                if (NIL != direction_to_use) {
                    if (NIL == com.cyc.cycjava.cycl.reformulator_rule_unifier.reformulation_possible_with_source_rtP(expression, expression_forts, rr, direction_to_use)) {
                        return NIL;
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.reformulator_rule_unifier.reformulator_rule_target_is_nonassertibleP(rr, direction_to_use, mt)) {
                            return NIL;
                        } else {
                            if (NIL != com.cyc.cycjava.cycl.reformulator_rule_unifier.reformulator_rule_contracts_el_relationP(rr, direction_to_use, mt)) {
                                return NIL;
                            } else {
                                thread.resetMultipleValues();
                                {
                                    SubLObject unify_result = com.cyc.cycjava.cycl.reformulator_rule_unifier.reformulator_rule_unify(expression, rr, mt, direction_to_use, wff_degree);
                                    SubLObject czer_bindings = thread.secondMultipleValue();
                                    SubLObject unify_bindings = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    if ((NIL != unify_result) && (NIL != com.cyc.cycjava.cycl.reformulator_rule_unifier.reformulation_preconditions_metP(expression, rr, mt, unify_result, czer_bindings, unify_bindings, settings, direction_to_use))) {
                                        return unify_result;
                                    } else {
                                        return NIL;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return expression or nil; a unified template if unification was successful, otherwise nil.
     */
    @LispMethod(comment = "@return expression or nil; a unified template if unification was successful, otherwise nil.")
    public static SubLObject reformulator_rule_unify_if_possible(final SubLObject expression, final SubLObject expression_forts, final SubLObject rr, final SubLObject mt, final SubLObject settings, final SubLObject reformulator_modes, final SubLObject wff_degree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject direction_to_use = direction_to_apply_reformulator_rule(rr, mt, reformulator_modes);
        if (NIL == direction_to_use) {
            return NIL;
        }
        if (NIL == reformulation_possible_with_source_rtP(expression, expression_forts, rr, direction_to_use)) {
            return NIL;
        }
        if (NIL != reformulator_rule_target_is_nonassertibleP(rr, direction_to_use, mt)) {
            return NIL;
        }
        if (NIL != reformulator_rule_contracts_el_relationP(rr, direction_to_use, mt)) {
            return NIL;
        }
        thread.resetMultipleValues();
        final SubLObject unify_result = reformulator_rule_unify(expression, rr, mt, direction_to_use, wff_degree);
        final SubLObject czer_bindings = thread.secondMultipleValue();
        final SubLObject unify_bindings = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != unify_result) && (NIL != reformulation_preconditions_metP(expression, rr, mt, unify_result, czer_bindings, unify_bindings, settings, direction_to_use))) {
            return unify_result;
        }
        return NIL;
    }

    /**
     * Unifies EXPRESSION with RR in MT given DIRECTION-TO-USE and WFF-DEGREE.
     */
    @LispMethod(comment = "Unifies EXPRESSION with RR in MT given DIRECTION-TO-USE and WFF-DEGREE.")
    public static final SubLObject reformulator_rule_unify_alt(SubLObject expression, SubLObject rr, SubLObject mt, SubLObject direction_to_use, SubLObject wff_degree) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject source_expr = reformulator_rule_unifier_datastructures.reformulator_template_expression(reformulator_rule_unifier_datastructures.reformulator_rule_source_rt(rr, direction_to_use));
                SubLObject shared_var_bindings = reformulator_rule_unifier_datastructures.reformulator_rule_source_shared_var_bindings(rr, direction_to_use);
                SubLObject source_clausesP = clauses.clauses_p(source_expr);
                SubLObject unify_bindings = NIL;
                SubLObject result_expr = NIL;
                {
                    SubLObject _prev_bind_0 = reformulator_rule_unifier_datastructures.$reformulator_skolem_dwimming_space$.currentBinding(thread);
                    try {
                        reformulator_rule_unifier_datastructures.$reformulator_skolem_dwimming_space$.bind(NIL, thread);
                        expression = reformulator_rule_unifier_datastructures.reformulator_dwim_skolems(expression);
                        unify_bindings = com.cyc.cycjava.cycl.reformulator_rule_unifier.reformulator_unify(expression, source_expr, clauses.clauses_p(expression), source_clausesP);
                        if (NIL != unify_bindings) {
                            {
                                SubLObject target_rt = reformulator_rule_unifier_datastructures.reformulator_rule_target_rt(rr, direction_to_use);
                                SubLObject target_expr = reformulator_rule_unifier_datastructures.reformulator_template_el_var_expression(target_rt);
                                target_expr = nsublis(shared_var_bindings, target_expr, UNPROVIDED, UNPROVIDED);
                                target_expr = nsublis(unify_bindings, target_expr, UNPROVIDED, UNPROVIDED);
                                target_expr = reformulator_rule_unifier_datastructures.reformulator_undwim_skolems(target_expr);
                                target_expr = reformulator_rule_unifier_datastructures.rru_clean_up_skolem_function_fns(target_expr);
                                result_expr = target_expr;
                            }
                        }
                    } finally {
                        reformulator_rule_unifier_datastructures.$reformulator_skolem_dwimming_space$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(result_expr, shared_var_bindings, unify_bindings);
            }
        }
    }

    @LispMethod(comment = "Unifies EXPRESSION with RR in MT given DIRECTION-TO-USE and WFF-DEGREE.")
    public static SubLObject reformulator_rule_unify(SubLObject expression, final SubLObject rr, final SubLObject mt, final SubLObject direction_to_use, final SubLObject wff_degree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject source_expr = reformulator_rule_unifier_datastructures.reformulator_template_expression(reformulator_rule_unifier_datastructures.reformulator_rule_source_rt(rr, direction_to_use));
        final SubLObject shared_var_bindings = reformulator_rule_unifier_datastructures.reformulator_rule_source_shared_var_bindings(rr, direction_to_use);
        final SubLObject source_clausesP = clauses.clauses_p(source_expr);
        SubLObject unify_bindings = NIL;
        SubLObject result_expr = NIL;
        final SubLObject _prev_bind_0 = reformulator_rule_unifier_datastructures.$reformulator_skolem_dwimming_space$.currentBinding(thread);
        try {
            reformulator_rule_unifier_datastructures.$reformulator_skolem_dwimming_space$.bind(NIL, thread);
            expression = reformulator_rule_unifier_datastructures.reformulator_dwim_skolems(expression);
            unify_bindings = reformulator_unify(expression, source_expr, clauses.clauses_p(expression), source_clausesP);
            if (NIL != unify_bindings) {
                final SubLObject target_rt = reformulator_rule_unifier_datastructures.reformulator_rule_target_rt(rr, direction_to_use);
                SubLObject target_expr = reformulator_rule_unifier_datastructures.reformulator_template_el_var_expression(target_rt);
                target_expr = nsublis(shared_var_bindings, target_expr, UNPROVIDED, UNPROVIDED);
                target_expr = nsublis(unify_bindings, target_expr, UNPROVIDED, UNPROVIDED);
                target_expr = reformulator_rule_unifier_datastructures.reformulator_undwim_skolems(target_expr);
                target_expr = result_expr = reformulator_rule_unifier_datastructures.rru_clean_up_skolem_function_fns(target_expr);
            }
        } finally {
            reformulator_rule_unifier_datastructures.$reformulator_skolem_dwimming_space$.rebind(_prev_bind_0, thread);
        }
        return values(result_expr, shared_var_bindings, unify_bindings);
    }

    public static final SubLObject reformulator_unify_alt(SubLObject expr1, SubLObject expr2, SubLObject expr1_clausesP, SubLObject expr2_clausesP) {
        if (expr1_clausesP != expr2_clausesP) {
            return NIL;
        }
        {
            SubLObject result = NIL;
            result = (NIL != expr1_clausesP) ? ((SubLObject) (unification_utilities.unify_clauses(expr1, expr2, NIL, UNPROVIDED).first())) : unification.unify(expr1, expr2, NIL, UNPROVIDED);
            if (NIL != com.cyc.cycjava.cycl.reformulator_rule_unifier.el_var_bindings_consistentP(expr1, expr2, result)) {
                return result;
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject reformulator_unify(final SubLObject expr1, final SubLObject expr2, final SubLObject expr1_clausesP, final SubLObject expr2_clausesP) {
        if (!expr1_clausesP.eql(expr2_clausesP)) {
            return NIL;
        }
        SubLObject result = NIL;
        result = (NIL != expr1_clausesP) ? unification_utilities.unify_clauses(expr1, expr2, NIL, UNPROVIDED).first() : unification.unify(expr1, expr2, NIL, UNPROVIDED);
        if (NIL != el_var_bindings_consistentP(expr1, expr2, result)) {
            return result;
        }
        return NIL;
    }

    public static final SubLObject el_var_bindings_consistentP_alt(SubLObject expr1, SubLObject expr2, SubLObject v_bindings) {
        {
            SubLObject el_var_bindings = NIL;
            SubLObject hl_var_bindings = NIL;
            {
                SubLObject cdolist_list_var = v_bindings;
                SubLObject binding = NIL;
                for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                    if (NIL != cycl_variables.el_varP(binding.first())) {
                        el_var_bindings = cons(binding, el_var_bindings);
                    } else {
                        hl_var_bindings = cons(binding, hl_var_bindings);
                    }
                }
            }
            {
                SubLObject new_expr1 = sublis(hl_var_bindings, expr1, UNPROVIDED, UNPROVIDED);
                SubLObject new_expr2 = sublis(hl_var_bindings, expr2, UNPROVIDED, UNPROVIDED);
                SubLObject cdolist_list_var = el_var_bindings;
                SubLObject binding = NIL;
                for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                    {
                        SubLObject el_var_1 = binding.first();
                        SubLObject el_var_2 = binding.rest();
                        if (NIL != com.cyc.cycjava.cycl.reformulator_rule_unifier.el_var_binding_inconsistentP(new_expr1, new_expr2, el_var_1, el_var_2)) {
                            return NIL;
                        }
                    }
                }
            }
            if ((NIL != list_utilities.duplicatesP(el_var_bindings, symbol_function(EQUAL), symbol_function(CAR))) || (NIL != list_utilities.duplicatesP(el_var_bindings, symbol_function(EQUAL), symbol_function(CDR)))) {
                return NIL;
            }
        }
        return T;
    }

    public static SubLObject el_var_bindings_consistentP(final SubLObject expr1, final SubLObject expr2, final SubLObject v_bindings) {
        SubLObject el_var_bindings = NIL;
        SubLObject hl_var_bindings = NIL;
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != cycl_variables.el_varP(binding.first())) {
                el_var_bindings = cons(binding, el_var_bindings);
            } else {
                hl_var_bindings = cons(binding, hl_var_bindings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        final SubLObject new_expr1 = sublis(hl_var_bindings, expr1, UNPROVIDED, UNPROVIDED);
        final SubLObject new_expr2 = sublis(hl_var_bindings, expr2, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var2 = el_var_bindings;
        SubLObject binding2 = NIL;
        binding2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject el_var_1 = binding2.first();
            final SubLObject el_var_2 = binding2.rest();
            if (NIL != el_var_binding_inconsistentP(new_expr1, new_expr2, el_var_1, el_var_2)) {
                return NIL;
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            binding2 = cdolist_list_var2.first();
        } 
        if ((NIL != list_utilities.duplicatesP(el_var_bindings, symbol_function(EQUAL), symbol_function(CAR))) || (NIL != list_utilities.duplicatesP(el_var_bindings, symbol_function(EQUAL), symbol_function(CDR)))) {
            return NIL;
        }
        return T;
    }

    /**
     *
     *
     * @unknown this is too fascist, and will deem inconsistent some things
    that are really okay.  This is just an interim fix until I can fix
    the unifier.  -eca
     */
    @LispMethod(comment = "@unknown this is too fascist, and will deem inconsistent some things\r\nthat are really okay.  This is just an interim fix until I can fix\r\nthe unifier.  -eca")
    public static final SubLObject el_var_binding_inconsistentP_alt(SubLObject expr1, SubLObject expr2, SubLObject el_var_1, SubLObject el_var_2) {
        return makeBoolean((NIL != cycl_utilities.expression_find(el_var_1, expr2, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != cycl_utilities.expression_find(el_var_2, expr1, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    /**
     *
     *
     * @unknown this is too fascist, and will deem inconsistent some things
    that are really okay.  This is just an interim fix until I can fix
    the unifier.  -eca
     */
    @LispMethod(comment = "@unknown this is too fascist, and will deem inconsistent some things\r\nthat are really okay.  This is just an interim fix until I can fix\r\nthe unifier.  -eca")
    public static SubLObject el_var_binding_inconsistentP(final SubLObject expr1, final SubLObject expr2, final SubLObject el_var_1, final SubLObject el_var_2) {
        return makeBoolean((NIL != cycl_utilities.expression_find(el_var_1, expr2, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != cycl_utilities.expression_find(el_var_2, expr1, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject car_hl_variable_p_alt(SubLObject cons) {
        return cycl_grammar.hl_variable_p(cons.first());
    }

    public static SubLObject car_hl_variable_p(final SubLObject cons) {
        return cycl_grammar.hl_variable_p(cons.first());
    }

    public static final SubLObject find_justification_for_reformulator_rule_alt(SubLObject rr) {
        {
            SubLObject result = reformulator_rule_unifier_datastructures.reformulator_rule_assertion(rr);
            return NIL != result ? ((SubLObject) (result)) : rr;
        }
    }

    public static SubLObject find_justification_for_reformulator_rule(final SubLObject rr) {
        final SubLObject result = reformulator_rule_unifier_datastructures.reformulator_rule_assertion(rr);
        return NIL != result ? result : rr;
    }

    /**
     * Finds the direction to apply RR in MT given REFORMULATOR-MODES.
     * Returns the first direction found given the precedence of the modes.
     */
    @LispMethod(comment = "Finds the direction to apply RR in MT given REFORMULATOR-MODES.\r\nReturns the first direction found given the precedence of the modes.\nFinds the direction to apply RR in MT given REFORMULATOR-MODES.\nReturns the first direction found given the precedence of the modes.")
    public static final SubLObject direction_to_apply_reformulator_rule_alt(SubLObject rr, SubLObject mt, SubLObject reformulator_modes) {
        {
            SubLObject result = NIL;
            if (NIL == result) {
                {
                    SubLObject csome_list_var = reformulator_modes;
                    SubLObject mode = NIL;
                    for (mode = csome_list_var.first(); !((NIL != result) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mode = csome_list_var.first()) {
                        result = com.cyc.cycjava.cycl.reformulator_rule_unifier.direction_to_use_for_mode_in_mt(rr, mt, mode);
                    }
                }
            }
            return result;
        }
    }

    @LispMethod(comment = "Finds the direction to apply RR in MT given REFORMULATOR-MODES.\r\nReturns the first direction found given the precedence of the modes.\nFinds the direction to apply RR in MT given REFORMULATOR-MODES.\nReturns the first direction found given the precedence of the modes.")
    public static SubLObject direction_to_apply_reformulator_rule(final SubLObject rr, final SubLObject mt, final SubLObject reformulator_modes) {
        SubLObject result = NIL;
        if (NIL == result) {
            SubLObject csome_list_var;
            SubLObject mode;
            for (csome_list_var = reformulator_modes, mode = NIL, mode = csome_list_var.first(); (NIL == result) && (NIL != csome_list_var); result = direction_to_use_for_mode_in_mt(rr, mt, mode) , csome_list_var = csome_list_var.rest() , mode = csome_list_var.first()) {
            }
        }
        return result;
    }/**
     * Finds the direction to apply RR in MT given REFORMULATOR-MODES.
     * Returns the first direction found given the precedence of the modes.
     */


    /**
     * Finds/returns the direction to use RR in MODE in MT. If there is an explicit
     * direction specified for RR, returns that one. Otherwise, returns the default mode
     * direction for the reformulator rule predicate used to express RR in the KB.
     */
    @LispMethod(comment = "Finds/returns the direction to use RR in MODE in MT. If there is an explicit\r\ndirection specified for RR, returns that one. Otherwise, returns the default mode\r\ndirection for the reformulator rule predicate used to express RR in the KB.\nFinds/returns the direction to use RR in MODE in MT. If there is an explicit\ndirection specified for RR, returns that one. Otherwise, returns the default mode\ndirection for the reformulator rule predicate used to express RR in the KB.")
    public static final SubLObject direction_to_use_for_mode_in_mt_alt(SubLObject rr, SubLObject mt, SubLObject mode) {
        {
            SubLObject result = com.cyc.cycjava.cycl.reformulator_rule_unifier.explicit_direction_to_use_for_mode_in_mt(rr, mt, mode);
            if (NIL == result) {
                result = com.cyc.cycjava.cycl.reformulator_rule_unifier.default_direction_to_use_for_mode_in_mt(rr, mt, mode);
            }
            return result;
        }
    }

    @LispMethod(comment = "Finds/returns the direction to use RR in MODE in MT. If there is an explicit\r\ndirection specified for RR, returns that one. Otherwise, returns the default mode\r\ndirection for the reformulator rule predicate used to express RR in the KB.\nFinds/returns the direction to use RR in MODE in MT. If there is an explicit\ndirection specified for RR, returns that one. Otherwise, returns the default mode\ndirection for the reformulator rule predicate used to express RR in the KB.")
    public static SubLObject direction_to_use_for_mode_in_mt(final SubLObject rr, final SubLObject mt, final SubLObject mode) {
        SubLObject result = explicit_direction_to_use_for_mode_in_mt(rr, mt, mode);
        if (NIL == result) {
            result = default_direction_to_use_for_mode_in_mt(rr, mt, mode);
        }
        return result;
    }/**
     * Finds/returns the direction to use RR in MODE in MT. If there is an explicit
     * direction specified for RR, returns that one. Otherwise, returns the default mode
     * direction for the reformulator rule predicate used to express RR in the KB.
     */


    public static final SubLObject explicit_direction_to_use_for_mode_in_mt_alt(SubLObject rr, SubLObject mt, SubLObject mode) {
        {
            SubLObject rule_directions_for_mode = reformulator_rule_unifier_datastructures.directions_for_mode(mode, reformulator_rule_unifier_datastructures.reformulator_rule_directions(rr));
            return com.cyc.cycjava.cycl.reformulator_rule_unifier.find_usable_direction_for_mode(rule_directions_for_mode, mt);
        }
    }

    public static SubLObject explicit_direction_to_use_for_mode_in_mt(final SubLObject rr, final SubLObject mt, final SubLObject mode) {
        final SubLObject rule_directions_for_mode = reformulator_rule_unifier_datastructures.directions_for_mode(mode, reformulator_rule_unifier_datastructures.reformulator_rule_directions(rr));
        return find_usable_direction_for_mode(rule_directions_for_mode, mt);
    }

    public static final SubLObject default_direction_to_use_for_mode_in_mt_alt(SubLObject rr, SubLObject mt, SubLObject mode) {
        {
            SubLObject default_directions = com.cyc.cycjava.cycl.reformulator_rule_unifier.default_mode_directions_for_reformulator_rule(rr, mode);
            return com.cyc.cycjava.cycl.reformulator_rule_unifier.find_usable_direction_for_mode(default_directions, mt);
        }
    }

    public static SubLObject default_direction_to_use_for_mode_in_mt(final SubLObject rr, final SubLObject mt, final SubLObject mode) {
        final SubLObject default_directions = default_mode_directions_for_reformulator_rule(rr, mode);
        return find_usable_direction_for_mode(default_directions, mt);
    }

    public static final SubLObject find_usable_direction_for_mode_alt(SubLObject rule_directions_for_mode, SubLObject mt) {
        {
            SubLObject result = NIL;
            if (NIL == result) {
                {
                    SubLObject csome_list_var = rule_directions_for_mode;
                    SubLObject direction_struct = NIL;
                    for (direction_struct = csome_list_var.first(); !((NIL != result) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , direction_struct = csome_list_var.first()) {
                        if ((NIL == com.cyc.cycjava.cycl.reformulator_rule_unifier.neither_directionP(direction_struct)) && (NIL != com.cyc.cycjava.cycl.reformulator_rule_unifier.reformulation_direction_accessible_from_mtP(direction_struct, mt))) {
                            result = com.cyc.cycjava.cycl.reformulator_rule_unifier.direction_struct_direction(direction_struct);
                        }
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject find_usable_direction_for_mode(final SubLObject rule_directions_for_mode, final SubLObject mt) {
        SubLObject result = NIL;
        if (NIL == result) {
            SubLObject csome_list_var = rule_directions_for_mode;
            SubLObject direction_struct = NIL;
            direction_struct = csome_list_var.first();
            while ((NIL == result) && (NIL != csome_list_var)) {
                if ((NIL == neither_directionP(direction_struct)) && (NIL != reformulation_direction_accessible_from_mtP(direction_struct, mt))) {
                    result = direction_struct_direction(direction_struct);
                }
                csome_list_var = csome_list_var.rest();
                direction_struct = csome_list_var.first();
            } 
        }
        return result;
    }

    public static final SubLObject default_mode_directions_for_reformulator_rule_alt(SubLObject rr, SubLObject mode) {
        {
            SubLObject rule_pred = reformulator_rule_unifier_datastructures.reformulator_rule_rule_pred(rr);
            SubLObject default_directions = reformulator_datastructures.mode_directions_for_pred(rule_pred, mode, reformulator_datastructures.default_reformulation_directions_in_modes_for_preds());
            return default_directions;
        }
    }

    public static SubLObject default_mode_directions_for_reformulator_rule(final SubLObject rr, final SubLObject mode) {
        final SubLObject rule_pred = reformulator_rule_unifier_datastructures.reformulator_rule_rule_pred(rr);
        final SubLObject default_directions = reformulator_datastructures.mode_directions_for_pred(rule_pred, mode, reformulator_datastructures.default_reformulation_directions_in_modes_for_preds());
        return default_directions;
    }

    public static final SubLObject neither_directionP_alt(SubLObject direction_struct) {
        return eq(com.cyc.cycjava.cycl.reformulator_rule_unifier.direction_struct_direction(direction_struct), $$ReformulationNeitherDirection);
    }

    public static SubLObject neither_directionP(final SubLObject direction_struct) {
        return kb_utilities.kbeq(direction_struct_direction(direction_struct), $$ReformulationNeitherDirection);
    }

    public static final SubLObject reformulation_direction_accessible_from_mtP_alt(SubLObject direction_struct, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        result = mt_relevance_macros.relevant_mtP(com.cyc.cycjava.cycl.reformulator_rule_unifier.direction_struct_mt(direction_struct));
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject reformulation_direction_accessible_from_mtP(final SubLObject direction_struct, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
            result = mt_relevance_macros.relevant_mtP(direction_struct_mt(direction_struct));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject direction_struct_direction_alt(SubLObject direction_struct) {
        return direction_struct.first();
    }

    public static SubLObject direction_struct_direction(final SubLObject direction_struct) {
        return direction_struct.first();
    }

    public static final SubLObject direction_struct_mt_alt(SubLObject direction_struct) {
        return second(direction_struct);
    }

    public static SubLObject direction_struct_mt(final SubLObject direction_struct) {
        return second(direction_struct);
    }

    /**
     * Finds/returns the cached out KB reformulator rules that are to be used in the reformulation of EXPRESSION in MT given the other arguments.
     */
    @LispMethod(comment = "Finds/returns the cached out KB reformulator rules that are to be used in the reformulation of EXPRESSION in MT given the other arguments.")
    public static final SubLObject find_kb_reformulator_rules_to_use_alt(SubLObject expression, SubLObject expression_forts, SubLObject mt, SubLObject skip_assertions, SubLObject reformulator_modes, SubLObject wff_degree, SubLObject meta_predicates) {
        {
            SubLObject all_forts = expression_forts;
            SubLObject all_rules = NIL;
            SubLObject result = NIL;
            if (NIL != constant_p(expression)) {
                all_rules = gethash(expression, reformulator_rule_unifier_datastructures.constant_reformulator_rule_table(), UNPROVIDED);
            } else {
                if (NIL != nart_handles.nart_p(expression)) {
                    all_rules = gethash(expression, reformulator_rule_unifier_datastructures.nart_reformulator_rule_table(), UNPROVIDED);
                } else {
                    {
                        SubLObject cdolist_list_var = all_forts;
                        SubLObject fort = NIL;
                        for (fort = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fort = cdolist_list_var.first()) {
                            all_rules = union(all_rules, gethash(fort, reformulator_rule_unifier_datastructures.fort_reformulator_rule_table(), UNPROVIDED), UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = all_rules;
                SubLObject rule = NIL;
                for (rule = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rule = cdolist_list_var.first()) {
                    if (NIL == subl_promotions.memberP(rule, skip_assertions, UNPROVIDED, UNPROVIDED)) {
                        {
                            SubLObject rr = gethash(rule, reformulator_rule_unifier_datastructures.reformulator_rules(), UNPROVIDED);
                            if (NIL != com.cyc.cycjava.cycl.reformulator_rule_unifier.reformulator_rule_usableP(rr, mt, reformulator_modes, wff_degree, meta_predicates)) {
                                result = cons(rr, result);
                            }
                        }
                    }
                }
            }
            return result;
        }
    }

    @LispMethod(comment = "Finds/returns the cached out KB reformulator rules that are to be used in the reformulation of EXPRESSION in MT given the other arguments.")
    public static SubLObject find_kb_reformulator_rules_to_use(final SubLObject expression, final SubLObject expression_forts, final SubLObject mt, final SubLObject skip_assertions, final SubLObject reformulator_modes, final SubLObject wff_degree, final SubLObject meta_predicates) {
        SubLObject all_rules = NIL;
        SubLObject result = NIL;
        if (NIL != constant_p(expression)) {
            all_rules = gethash(expression, reformulator_rule_unifier_datastructures.constant_reformulator_rule_table(), UNPROVIDED);
        } else
            if (NIL != nart_handles.nart_p(expression)) {
                all_rules = gethash(expression, reformulator_rule_unifier_datastructures.nart_reformulator_rule_table(), UNPROVIDED);
            } else {
                SubLObject cdolist_list_var = expression_forts;
                SubLObject fort = NIL;
                fort = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    all_rules = union(all_rules, gethash(fort, reformulator_rule_unifier_datastructures.fort_reformulator_rule_table(), UNPROVIDED), UNPROVIDED, UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    fort = cdolist_list_var.first();
                } 
            }

        SubLObject cdolist_list_var = all_rules;
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == subl_promotions.memberP(rule, skip_assertions, UNPROVIDED, UNPROVIDED)) {
                final SubLObject rr = gethash(rule, reformulator_rule_unifier_datastructures.reformulator_rules(), UNPROVIDED);
                if (NIL != reformulator_rule_usableP(rr, mt, reformulator_modes, wff_degree, meta_predicates)) {
                    result = cons(rr, result);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        } 
        return result;
    }/**
     * Finds/returns the cached out KB reformulator rules that are to be used in the reformulation of EXPRESSION in MT given the other arguments.
     */


    public static final SubLObject find_usable_unassociated_rules_cached_alt(SubLObject settings, SubLObject mt) {
        {
            SubLObject use_kb_reformulator_rulesP = reformulator_datastructures.get_use_kb_reformulator_rulesP(settings);
            SubLObject skip_assertions = reformulator_datastructures.get_reformulator_rule_skip_assertions(settings);
            SubLObject reformulator_modes = reformulator_datastructures.get_reformulator_modes(settings, mt);
            SubLObject wff_degree = reformulator_datastructures.get_wff_enforcement(settings);
            SubLObject meta_predicates = reformulator_datastructures.get_reformulator_meta_predicates(settings);
            return com.cyc.cycjava.cycl.reformulator_rule_unifier.find_usable_unassociated_rules_cached_int(use_kb_reformulator_rulesP, skip_assertions, mt, reformulator_modes, wff_degree, meta_predicates);
        }
    }

    public static SubLObject find_usable_unassociated_rules_cached(final SubLObject settings, final SubLObject mt) {
        final SubLObject use_kb_reformulator_rulesP = reformulator_datastructures.get_use_kb_reformulator_rulesP(settings);
        final SubLObject skip_assertions = reformulator_datastructures.get_reformulator_rule_skip_assertions(settings);
        final SubLObject reformulator_modes = reformulator_datastructures.get_reformulator_modes(settings, mt);
        final SubLObject wff_degree = reformulator_datastructures.get_wff_enforcement(settings);
        final SubLObject meta_predicates = reformulator_datastructures.get_reformulator_meta_predicates(settings);
        return find_usable_unassociated_rules_cached_int(use_kb_reformulator_rulesP, skip_assertions, mt, reformulator_modes, wff_degree, meta_predicates);
    }

    public static final SubLObject find_usable_unassociated_rules_cached_int_internal_alt(SubLObject use_kb_reformulator_rulesP, SubLObject skip_assertions, SubLObject mt, SubLObject reformulator_modes, SubLObject wff_degree, SubLObject meta_predicates) {
        return com.cyc.cycjava.cycl.reformulator_rule_unifier.find_usable_unassociated_rules(use_kb_reformulator_rulesP, skip_assertions, mt, reformulator_modes, wff_degree, meta_predicates);
    }

    public static SubLObject find_usable_unassociated_rules_cached_int_internal(final SubLObject use_kb_reformulator_rulesP, final SubLObject skip_assertions, final SubLObject mt, final SubLObject reformulator_modes, final SubLObject wff_degree, final SubLObject meta_predicates) {
        return find_usable_unassociated_rules(use_kb_reformulator_rulesP, skip_assertions, mt, reformulator_modes, wff_degree, meta_predicates);
    }

    public static final SubLObject find_usable_unassociated_rules_cached_int_alt(SubLObject use_kb_reformulator_rulesP, SubLObject skip_assertions, SubLObject mt, SubLObject reformulator_modes, SubLObject wff_degree, SubLObject meta_predicates) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.reformulator_rule_unifier.find_usable_unassociated_rules_cached_int_internal(use_kb_reformulator_rulesP, skip_assertions, mt, reformulator_modes, wff_degree, meta_predicates);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, FIND_USABLE_UNASSOCIATED_RULES_CACHED_INT, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), FIND_USABLE_UNASSOCIATED_RULES_CACHED_INT, SIX_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, FIND_USABLE_UNASSOCIATED_RULES_CACHED_INT, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_6(use_kb_reformulator_rulesP, skip_assertions, mt, reformulator_modes, wff_degree, meta_predicates);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw7$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (use_kb_reformulator_rulesP.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (skip_assertions.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (mt.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (reformulator_modes.equal(cached_args.first())) {
                                                    cached_args = cached_args.rest();
                                                    if (wff_degree.equal(cached_args.first())) {
                                                        cached_args = cached_args.rest();
                                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && meta_predicates.equal(cached_args.first())) {
                                                            return memoization_state.caching_results(results2);
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
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.reformulator_rule_unifier.find_usable_unassociated_rules_cached_int_internal(use_kb_reformulator_rulesP, skip_assertions, mt, reformulator_modes, wff_degree, meta_predicates)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(use_kb_reformulator_rulesP, skip_assertions, mt, reformulator_modes, wff_degree, meta_predicates));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject find_usable_unassociated_rules_cached_int(final SubLObject use_kb_reformulator_rulesP, final SubLObject skip_assertions, final SubLObject mt, final SubLObject reformulator_modes, final SubLObject wff_degree, final SubLObject meta_predicates) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return find_usable_unassociated_rules_cached_int_internal(use_kb_reformulator_rulesP, skip_assertions, mt, reformulator_modes, wff_degree, meta_predicates);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, FIND_USABLE_UNASSOCIATED_RULES_CACHED_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), FIND_USABLE_UNASSOCIATED_RULES_CACHED_INT, SIX_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, FIND_USABLE_UNASSOCIATED_RULES_CACHED_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_6(use_kb_reformulator_rulesP, skip_assertions, mt, reformulator_modes, wff_degree, meta_predicates);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (use_kb_reformulator_rulesP.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (skip_assertions.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (reformulator_modes.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (wff_degree.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && meta_predicates.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(find_usable_unassociated_rules_cached_int_internal(use_kb_reformulator_rulesP, skip_assertions, mt, reformulator_modes, wff_degree, meta_predicates)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(use_kb_reformulator_rulesP, skip_assertions, mt, reformulator_modes, wff_degree, meta_predicates));
        return memoization_state.caching_results(results3);
    }

    /**
     * Finds/returns the reformulator rules not cached in any of the indexing tables that can be used during
     * the current session of reformulation.
     */
    @LispMethod(comment = "Finds/returns the reformulator rules not cached in any of the indexing tables that can be used during\r\nthe current session of reformulation.\nFinds/returns the reformulator rules not cached in any of the indexing tables that can be used during\nthe current session of reformulation.")
    public static final SubLObject find_usable_unassociated_rules_alt(SubLObject use_kb_reformulator_rulesP, SubLObject skip_assertions, SubLObject mt, SubLObject reformulator_modes, SubLObject wff_degree, SubLObject meta_predicates) {
        if ($FALSE == use_kb_reformulator_rulesP) {
            return NIL;
        }
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = reformulator_rule_unifier_datastructures.unassociated_reformulator_rules();
            SubLObject rr = NIL;
            for (rr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rr = cdolist_list_var.first()) {
                if ((NIL == subl_promotions.memberP(reformulator_rule_unifier_datastructures.reformulator_rule_assertion(rr), skip_assertions, UNPROVIDED, UNPROVIDED)) && (NIL != com.cyc.cycjava.cycl.reformulator_rule_unifier.reformulator_rule_usableP(rr, mt, reformulator_modes, wff_degree, meta_predicates))) {
                    result = cons(rr, result);
                }
            }
            return result;
        }
    }

    @LispMethod(comment = "Finds/returns the reformulator rules not cached in any of the indexing tables that can be used during\r\nthe current session of reformulation.\nFinds/returns the reformulator rules not cached in any of the indexing tables that can be used during\nthe current session of reformulation.")
    public static SubLObject find_usable_unassociated_rules(final SubLObject use_kb_reformulator_rulesP, final SubLObject skip_assertions, final SubLObject mt, final SubLObject reformulator_modes, final SubLObject wff_degree, final SubLObject meta_predicates) {
        if ($FALSE == use_kb_reformulator_rulesP) {
            return NIL;
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = reformulator_rule_unifier_datastructures.unassociated_reformulator_rules();
        SubLObject rr = NIL;
        rr = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == subl_promotions.memberP(reformulator_rule_unifier_datastructures.reformulator_rule_assertion(rr), skip_assertions, UNPROVIDED, UNPROVIDED)) && (NIL != reformulator_rule_usableP(rr, mt, reformulator_modes, wff_degree, meta_predicates))) {
                result = cons(rr, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rr = cdolist_list_var.first();
        } 
        return result;
    }/**
     * Finds/returns the reformulator rules not cached in any of the indexing tables that can be used during
     * the current session of reformulation.
     */


    /**
     * Returns T iff RR is accessible from MT, can be used in one of REFORMULATOR-MODES and satisfies WFF-DEGREE.
     */
    @LispMethod(comment = "Returns T iff RR is accessible from MT, can be used in one of REFORMULATOR-MODES and satisfies WFF-DEGREE.")
    public static final SubLObject reformulator_rule_usableP_alt(SubLObject rr, SubLObject mt, SubLObject reformulator_modes, SubLObject wff_degree, SubLObject meta_predicates) {
        return makeBoolean((((NIL != com.cyc.cycjava.cycl.reformulator_rule_unifier.reformulator_rule_compatible_in_wff_degree(rr, wff_degree)) && (NIL != com.cyc.cycjava.cycl.reformulator_rule_unifier.reformulator_rule_accessible_from_mtP(rr, mt))) && (NIL != com.cyc.cycjava.cycl.reformulator_rule_unifier.reformulator_rule_has_necessary_meta_predicateP(rr, meta_predicates))) && (NIL != com.cyc.cycjava.cycl.reformulator_rule_unifier.reformulator_rule_usable_in_any_modeP(rr, reformulator_modes, mt)));
    }

    @LispMethod(comment = "Returns T iff RR is accessible from MT, can be used in one of REFORMULATOR-MODES and satisfies WFF-DEGREE.")
    public static SubLObject reformulator_rule_usableP(final SubLObject rr, final SubLObject mt, final SubLObject reformulator_modes, final SubLObject wff_degree, final SubLObject meta_predicates) {
        return makeBoolean((((NIL != reformulator_rule_compatible_in_wff_degree(rr, wff_degree)) && (NIL != reformulator_rule_accessible_from_mtP(rr, mt))) && (NIL != reformulator_rule_has_necessary_meta_predicateP(rr, meta_predicates))) && (NIL != reformulator_rule_usable_in_any_modeP(rr, reformulator_modes, mt)));
    }/**
     * Returns T iff RR is accessible from MT, can be used in one of REFORMULATOR-MODES and satisfies WFF-DEGREE.
     */


    /**
     * Finds/returns the list of all superiors for EXPRESSION-FORTS in MT.
     */
    @LispMethod(comment = "Finds/returns the list of all superiors for EXPRESSION-FORTS in MT.")
    public static final SubLObject find_all_superiors_for_forts_alt(SubLObject expression_forts, SubLObject mt) {
        {
            SubLObject all_forts = expression_forts;
            SubLObject cdolist_list_var = expression_forts;
            SubLObject fort = NIL;
            for (fort = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fort = cdolist_list_var.first()) {
                if (NIL != fort_types_interface.predicate_in_any_mtP(fort)) {
                    {
                        SubLObject cdolist_list_var_3 = genl_predicates.all_genl_predicates(fort, mt, UNPROVIDED);
                        SubLObject each_genl_pred = NIL;
                        for (each_genl_pred = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , each_genl_pred = cdolist_list_var_3.first()) {
                            {
                                SubLObject item_var = each_genl_pred;
                                if (NIL == member(item_var, all_forts, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    all_forts = cons(item_var, all_forts);
                                }
                            }
                        }
                    }
                } else {
                    if (NIL != fort_types_interface.collection_in_any_mtP(fort)) {
                        {
                            SubLObject cdolist_list_var_4 = genls.all_genls_in_mt(fort, mt);
                            SubLObject each_genl = NIL;
                            for (each_genl = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , each_genl = cdolist_list_var_4.first()) {
                                {
                                    SubLObject item_var = each_genl;
                                    if (NIL == member(item_var, all_forts, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        all_forts = cons(item_var, all_forts);
                                    }
                                }
                            }
                        }
                    } else {
                        if (NIL != fort_types_interface.mt_in_any_mtP(fort)) {
                            {
                                SubLObject cdolist_list_var_5 = genl_mts.all_genl_mts(fort, mt, UNPROVIDED);
                                SubLObject each_genl_mt = NIL;
                                for (each_genl_mt = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , each_genl_mt = cdolist_list_var_5.first()) {
                                    {
                                        SubLObject item_var = each_genl_mt;
                                        if (NIL == member(item_var, all_forts, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            all_forts = cons(item_var, all_forts);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return all_forts;
        }
    }

    @LispMethod(comment = "Finds/returns the list of all superiors for EXPRESSION-FORTS in MT.")
    public static SubLObject find_all_superiors_for_forts(final SubLObject expression_forts, final SubLObject mt) {
        SubLObject all_forts = expression_forts;
        SubLObject cdolist_list_var = expression_forts;
        SubLObject fort = NIL;
        fort = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != fort_types_interface.predicate_in_any_mtP(fort)) {
                SubLObject cdolist_list_var_$3 = genl_predicates.all_genl_predicates(fort, mt, UNPROVIDED);
                SubLObject each_genl_pred = NIL;
                each_genl_pred = cdolist_list_var_$3.first();
                while (NIL != cdolist_list_var_$3) {
                    final SubLObject item_var = each_genl_pred;
                    if (NIL == member(item_var, all_forts, symbol_function(EQL), symbol_function(IDENTITY))) {
                        all_forts = cons(item_var, all_forts);
                    }
                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                    each_genl_pred = cdolist_list_var_$3.first();
                } 
            } else
                if (NIL != fort_types_interface.collection_in_any_mtP(fort)) {
                    SubLObject cdolist_list_var_$4 = genls.all_genls_in_mt(fort, mt);
                    SubLObject each_genl = NIL;
                    each_genl = cdolist_list_var_$4.first();
                    while (NIL != cdolist_list_var_$4) {
                        final SubLObject item_var = each_genl;
                        if (NIL == member(item_var, all_forts, symbol_function(EQL), symbol_function(IDENTITY))) {
                            all_forts = cons(item_var, all_forts);
                        }
                        cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                        each_genl = cdolist_list_var_$4.first();
                    } 
                } else
                    if (NIL != fort_types_interface.mt_in_any_mtP(fort)) {
                        SubLObject cdolist_list_var_$5 = genl_mts.all_genl_mts(fort, mt, UNPROVIDED);
                        SubLObject each_genl_mt = NIL;
                        each_genl_mt = cdolist_list_var_$5.first();
                        while (NIL != cdolist_list_var_$5) {
                            final SubLObject item_var = each_genl_mt;
                            if (NIL == member(item_var, all_forts, symbol_function(EQL), symbol_function(IDENTITY))) {
                                all_forts = cons(item_var, all_forts);
                            }
                            cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                            each_genl_mt = cdolist_list_var_$5.first();
                        } 
                    }


            cdolist_list_var = cdolist_list_var.rest();
            fort = cdolist_list_var.first();
        } 
        return all_forts;
    }/**
     * Finds/returns the list of all superiors for EXPRESSION-FORTS in MT.
     */


    /**
     * Attempts to optimally order RULES with respect to EXPRESSION,
     * so that the rules more likely to succeed are tried first.
     * Eliminates inaccessible rules based on MT.
     */
    @LispMethod(comment = "Attempts to optimally order RULES with respect to EXPRESSION,\r\nso that the rules more likely to succeed are tried first.\r\nEliminates inaccessible rules based on MT.\nAttempts to optimally order RULES with respect to EXPRESSION,\nso that the rules more likely to succeed are tried first.\nEliminates inaccessible rules based on MT.")
    public static final SubLObject order_reformulator_rules_alt(SubLObject reformulator_rules, SubLObject expression, SubLObject expression_forts, SubLObject mt, SubLObject reformulator_modes) {
        {
            SubLObject primary_mode = reformulator_datastructures.reformulator_primary_mode(reformulator_modes);
            SubLObject secondary_mode = reformulator_datastructures.reformulator_secondary_mode(reformulator_modes);
            SubLObject tertiary_mode = reformulator_datastructures.reformulator_tertiary_mode(reformulator_modes);
            SubLObject best = NIL;
            SubLObject better = NIL;
            SubLObject good = NIL;
            SubLObject bad = NIL;
            SubLObject worse = NIL;
            SubLObject cdolist_list_var = reformulator_rules;
            SubLObject rule = NIL;
            for (rule = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rule = cdolist_list_var.first()) {
                if ((NIL != com.cyc.cycjava.cycl.reformulator_rule_unifier.reformulator_rule_in_mtP(rule, mt)) && (NIL != com.cyc.cycjava.cycl.reformulator_rule_unifier.reformulator_rule_mentions_all_expression_fortsP(rule, expression_forts))) {
                    if (NIL != com.cyc.cycjava.cycl.reformulator_rule_unifier.reformulator_rule_usable_in_modeP(rule, primary_mode, mt)) {
                        best = cons(rule, best);
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.reformulator_rule_unifier.reformulator_rule_usable_in_modeP(rule, secondary_mode, mt)) {
                            better = cons(rule, better);
                        } else {
                            if (NIL != com.cyc.cycjava.cycl.reformulator_rule_unifier.reformulator_rule_usable_in_modeP(rule, tertiary_mode, mt)) {
                                good = cons(rule, good);
                            } else {
                                bad = cons(rule, bad);
                            }
                        }
                    }
                } else {
                    worse = cons(rule, worse);
                }
            }
            return nconc(new SubLObject[]{ best, better, good, bad, worse });
        }
    }

    @LispMethod(comment = "Attempts to optimally order RULES with respect to EXPRESSION,\r\nso that the rules more likely to succeed are tried first.\r\nEliminates inaccessible rules based on MT.\nAttempts to optimally order RULES with respect to EXPRESSION,\nso that the rules more likely to succeed are tried first.\nEliminates inaccessible rules based on MT.")
    public static SubLObject order_reformulator_rules(final SubLObject reformulator_rules, final SubLObject expression, final SubLObject expression_forts, final SubLObject mt, final SubLObject reformulator_modes) {
        final SubLObject primary_mode = reformulator_datastructures.reformulator_primary_mode(reformulator_modes);
        final SubLObject secondary_mode = reformulator_datastructures.reformulator_secondary_mode(reformulator_modes);
        final SubLObject tertiary_mode = reformulator_datastructures.reformulator_tertiary_mode(reformulator_modes);
        SubLObject best = NIL;
        SubLObject better = NIL;
        SubLObject good = NIL;
        SubLObject bad = NIL;
        SubLObject worse = NIL;
        SubLObject cdolist_list_var = reformulator_rules;
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != reformulator_rule_in_mtP(rule, mt)) && (NIL != reformulator_rule_mentions_all_expression_fortsP(rule, expression_forts))) {
                if (NIL != reformulator_rule_usable_in_modeP(rule, primary_mode, mt)) {
                    best = cons(rule, best);
                } else
                    if (NIL != reformulator_rule_usable_in_modeP(rule, secondary_mode, mt)) {
                        better = cons(rule, better);
                    } else
                        if (NIL != reformulator_rule_usable_in_modeP(rule, tertiary_mode, mt)) {
                            good = cons(rule, good);
                        } else {
                            bad = cons(rule, bad);
                        }


            } else {
                worse = cons(rule, worse);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        } 
        return nconc(new SubLObject[]{ best, better, good, bad, worse });
    }/**
     * Attempts to optimally order RULES with respect to EXPRESSION,
     * so that the rules more likely to succeed are tried first.
     * Eliminates inaccessible rules based on MT.
     */


    public static final SubLObject reformulator_rule_accessible_from_mtP_alt(SubLObject rr, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        result = mt_relevance_macros.relevant_mtP(reformulator_rule_unifier_datastructures.reformulator_rule_mt(rr));
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject reformulator_rule_accessible_from_mtP(final SubLObject rr, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
            result = mt_relevance_macros.relevant_mtP(reformulator_rule_unifier_datastructures.reformulator_rule_mt(rr));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject reformulator_rule_in_mtP_alt(SubLObject rr, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        result = mt_relevance_macros.relevant_mtP(reformulator_rule_unifier_datastructures.reformulator_rule_mt(rr));
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject reformulator_rule_in_mtP(final SubLObject rr, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            result = mt_relevance_macros.relevant_mtP(reformulator_rule_unifier_datastructures.reformulator_rule_mt(rr));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject reformulator_rule_mentions_all_expression_fortsP_alt(SubLObject rr, SubLObject v_forts) {
        {
            SubLObject result = T;
            SubLObject flag = NIL;
            if (NIL == flag) {
                {
                    SubLObject csome_list_var = v_forts;
                    SubLObject fort = NIL;
                    for (fort = csome_list_var.first(); !((NIL != flag) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , fort = csome_list_var.first()) {
                        if (NIL == reformulator_hub.reformulator_rule_mentions_fortP(rr, fort)) {
                            result = NIL;
                            flag = T;
                        }
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject reformulator_rule_mentions_all_expression_fortsP(final SubLObject rr, final SubLObject v_forts) {
        SubLObject result = T;
        SubLObject flag = NIL;
        if (NIL == flag) {
            SubLObject csome_list_var = v_forts;
            SubLObject fort = NIL;
            fort = csome_list_var.first();
            while ((NIL == flag) && (NIL != csome_list_var)) {
                if (NIL == reformulator_hub.reformulator_rule_mentions_fortP(rr, fort)) {
                    result = NIL;
                    flag = T;
                }
                csome_list_var = csome_list_var.rest();
                fort = csome_list_var.first();
            } 
        }
        return result;
    }

    public static final SubLObject reformulator_rule_compatible_in_wff_degree_alt(SubLObject rule, SubLObject wff_degree) {
        {
            SubLObject rule_wff_degree = reformulator_rule_unifier_datastructures.reformulator_rule_wff_degree(rule);
            SubLObject result = NIL;
            SubLObject pcase_var = wff_degree;
            if (pcase_var.eql($NONE)) {
                result = T;
            } else {
                if (pcase_var.eql($KB)) {
                    result = member(rule_wff_degree, $list_alt20, UNPROVIDED, UNPROVIDED);
                } else {
                    if (pcase_var.eql($ARITY)) {
                        result = member(rule_wff_degree, $list_alt22, UNPROVIDED, UNPROVIDED);
                    } else {
                        if (pcase_var.eql($ALL)) {
                            result = eq(rule_wff_degree, $ALL);
                        }
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject reformulator_rule_compatible_in_wff_degree(final SubLObject rule, final SubLObject wff_degree) {
        final SubLObject rule_wff_degree = reformulator_rule_unifier_datastructures.reformulator_rule_wff_degree(rule);
        SubLObject result = NIL;
        if (wff_degree.eql($NONE)) {
            result = T;
        } else
            if (wff_degree.eql($KB)) {
                result = member(rule_wff_degree, $list19, UNPROVIDED, UNPROVIDED);
            } else
                if (wff_degree.eql($ARITY)) {
                    result = member(rule_wff_degree, $list21, UNPROVIDED, UNPROVIDED);
                } else
                    if (wff_degree.eql($ALL)) {
                        result = eq(rule_wff_degree, $ALL);
                    }



        return result;
    }

    /**
     * Returns T iff RULE is usable (i.e. does not have #$ReformulationNeitherDirection direction) in at least
     * one of the modes in REFORMULATOR-MODES in MT.
     */
    @LispMethod(comment = "Returns T iff RULE is usable (i.e. does not have #$ReformulationNeitherDirection direction) in at least\r\none of the modes in REFORMULATOR-MODES in MT.\nReturns T iff RULE is usable (i.e. does not have #$ReformulationNeitherDirection direction) in at least\none of the modes in REFORMULATOR-MODES in MT.")
    public static final SubLObject reformulator_rule_usable_in_any_modeP_alt(SubLObject rule, SubLObject reformulator_modes, SubLObject mt) {
        {
            SubLObject result = NIL;
            if (NIL == result) {
                {
                    SubLObject csome_list_var = reformulator_modes;
                    SubLObject mode = NIL;
                    for (mode = csome_list_var.first(); !((NIL != result) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mode = csome_list_var.first()) {
                        result = com.cyc.cycjava.cycl.reformulator_rule_unifier.reformulator_rule_usable_in_modeP(rule, mode, mt);
                    }
                }
            }
            return result;
        }
    }

    @LispMethod(comment = "Returns T iff RULE is usable (i.e. does not have #$ReformulationNeitherDirection direction) in at least\r\none of the modes in REFORMULATOR-MODES in MT.\nReturns T iff RULE is usable (i.e. does not have #$ReformulationNeitherDirection direction) in at least\none of the modes in REFORMULATOR-MODES in MT.")
    public static SubLObject reformulator_rule_usable_in_any_modeP(final SubLObject rule, final SubLObject reformulator_modes, final SubLObject mt) {
        SubLObject result = NIL;
        if (NIL == result) {
            SubLObject csome_list_var;
            SubLObject mode;
            for (csome_list_var = reformulator_modes, mode = NIL, mode = csome_list_var.first(); (NIL == result) && (NIL != csome_list_var); result = reformulator_rule_usable_in_modeP(rule, mode, mt) , csome_list_var = csome_list_var.rest() , mode = csome_list_var.first()) {
            }
        }
        return result;
    }/**
     * Returns T iff RULE is usable (i.e. does not have #$ReformulationNeitherDirection direction) in at least
     * one of the modes in REFORMULATOR-MODES in MT.
     */


    /**
     * Returns T iff RULE is usable (i.e. does not have #$ReformulationNeitherDirection direction) in MODE in MT.
     */
    @LispMethod(comment = "Returns T iff RULE is usable (i.e. does not have #$ReformulationNeitherDirection direction) in MODE in MT.")
    public static final SubLObject reformulator_rule_usable_in_modeP_alt(SubLObject rule, SubLObject mode, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject rule_directions_for_mode = reformulator_rule_unifier_datastructures.directions_for_mode(mode, reformulator_rule_unifier_datastructures.reformulator_rule_directions(rule));
                SubLObject effective_default_directions_for_mode = com.cyc.cycjava.cycl.reformulator_rule_unifier.default_mode_directions_in_effect(rule, mode, mt, rule_directions_for_mode);
                SubLObject neither_directions_for_mode = list_utilities.delete_if_not($sym24$NEITHER_DIRECTION_, append(rule_directions_for_mode, effective_default_directions_for_mode), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject neither_mts = Mapping.mapcar(symbol_function(SECOND), neither_directions_for_mode);
                SubLObject result = NIL;
                if (NIL != neither_mts) {
                    {
                        SubLObject mt_var = mt;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                if (NIL == result) {
                                    {
                                        SubLObject csome_list_var = neither_mts;
                                        SubLObject neither_mt = NIL;
                                        for (neither_mt = csome_list_var.first(); !((NIL != result) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , neither_mt = csome_list_var.first()) {
                                            result = mt_relevance_macros.relevant_mtP(neither_mt);
                                        }
                                    }
                                }
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return makeBoolean(NIL == result);
            }
        }
    }

    @LispMethod(comment = "Returns T iff RULE is usable (i.e. does not have #$ReformulationNeitherDirection direction) in MODE in MT.")
    public static SubLObject reformulator_rule_usable_in_modeP(final SubLObject rule, final SubLObject mode, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule_directions_for_mode = reformulator_rule_unifier_datastructures.directions_for_mode(mode, reformulator_rule_unifier_datastructures.reformulator_rule_directions(rule));
        final SubLObject effective_default_directions_for_mode = default_mode_directions_in_effect(rule, mode, mt, rule_directions_for_mode);
        final SubLObject neither_directions_for_mode = list_utilities.delete_if_not($sym23$NEITHER_DIRECTION_, append(rule_directions_for_mode, effective_default_directions_for_mode), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject neither_mts = Mapping.mapcar(symbol_function(SECOND), neither_directions_for_mode);
        SubLObject result = NIL;
        if (NIL != neither_mts) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
                if (NIL == result) {
                    SubLObject csome_list_var;
                    SubLObject neither_mt;
                    for (csome_list_var = neither_mts, neither_mt = NIL, neither_mt = csome_list_var.first(); (NIL == result) && (NIL != csome_list_var); result = mt_relevance_macros.relevant_mtP(neither_mt) , csome_list_var = csome_list_var.rest() , neither_mt = csome_list_var.first()) {
                    }
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return makeBoolean(NIL == result);
    }/**
     * Returns T iff RULE is usable (i.e. does not have #$ReformulationNeitherDirection direction) in MODE in MT.
     */


    /**
     * Returns all default directions in effect (i.e. not overridden by an explicit direction) for RULE in MODE in MT.
     */
    @LispMethod(comment = "Returns all default directions in effect (i.e. not overridden by an explicit direction) for RULE in MODE in MT.")
    public static final SubLObject default_mode_directions_in_effect_alt(SubLObject rule, SubLObject mode, SubLObject mt, SubLObject rule_directions_for_mode) {
        {
            SubLObject default_directions = com.cyc.cycjava.cycl.reformulator_rule_unifier.default_mode_directions_for_reformulator_rule(rule, mode);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = default_directions;
            SubLObject default_direction_struct = NIL;
            for (default_direction_struct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , default_direction_struct = cdolist_list_var.first()) {
                if (NIL == com.cyc.cycjava.cycl.reformulator_rule_unifier.default_reformulation_direction_in_mode_overriddenP(default_direction_struct, mt, rule_directions_for_mode)) {
                    result = cons(default_direction_struct, result);
                }
            }
            return result;
        }
    }

    @LispMethod(comment = "Returns all default directions in effect (i.e. not overridden by an explicit direction) for RULE in MODE in MT.")
    public static SubLObject default_mode_directions_in_effect(final SubLObject rule, final SubLObject mode, final SubLObject mt, final SubLObject rule_directions_for_mode) {
        final SubLObject default_directions = default_mode_directions_for_reformulator_rule(rule, mode);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = default_directions;
        SubLObject default_direction_struct = NIL;
        default_direction_struct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == default_reformulation_direction_in_mode_overriddenP(default_direction_struct, mt, rule_directions_for_mode)) {
                result = cons(default_direction_struct, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            default_direction_struct = cdolist_list_var.first();
        } 
        return result;
    }/**
     * Returns all default directions in effect (i.e. not overridden by an explicit direction) for RULE in MODE in MT.
     */


    /**
     *
     *
     * @return boolean; T iff DEFAULT-DIRECTION-STRUCT is overridden in MT by one in EXPLICIT-DIRECTIONS-FOR-MODE.
     */
    @LispMethod(comment = "@return boolean; T iff DEFAULT-DIRECTION-STRUCT is overridden in MT by one in EXPLICIT-DIRECTIONS-FOR-MODE.")
    public static final SubLObject default_reformulation_direction_in_mode_overriddenP_alt(SubLObject default_direction_struct, SubLObject mt, SubLObject explicit_directions_for_mode) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject default_mt = com.cyc.cycjava.cycl.reformulator_rule_unifier.direction_struct_mt(default_direction_struct);
                SubLObject result = NIL;
                if (NIL == result) {
                    {
                        SubLObject csome_list_var = explicit_directions_for_mode;
                        SubLObject explicit_direction_struct = NIL;
                        for (explicit_direction_struct = csome_list_var.first(); !((NIL != result) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , explicit_direction_struct = csome_list_var.first()) {
                            if (NIL != com.cyc.cycjava.cycl.reformulator_rule_unifier.reformulation_direction_accessible_from_mtP(explicit_direction_struct, mt)) {
                                {
                                    SubLObject mt_var = mt;
                                    {
                                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                            result = makeBoolean((NIL != mt_relevance_macros.relevant_mtP(default_mt)) && (NIL != mt_relevance_macros.relevant_mtP(com.cyc.cycjava.cycl.reformulator_rule_unifier.direction_struct_mt(explicit_direction_struct))));
                                        } finally {
                                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @return boolean; T iff DEFAULT-DIRECTION-STRUCT is overridden in MT by one in EXPLICIT-DIRECTIONS-FOR-MODE.
     */
    @LispMethod(comment = "@return boolean; T iff DEFAULT-DIRECTION-STRUCT is overridden in MT by one in EXPLICIT-DIRECTIONS-FOR-MODE.")
    public static SubLObject default_reformulation_direction_in_mode_overriddenP(final SubLObject default_direction_struct, final SubLObject mt, final SubLObject explicit_directions_for_mode) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject default_mt = direction_struct_mt(default_direction_struct);
        SubLObject result = NIL;
        if (NIL == result) {
            SubLObject csome_list_var = explicit_directions_for_mode;
            SubLObject explicit_direction_struct = NIL;
            explicit_direction_struct = csome_list_var.first();
            while ((NIL == result) && (NIL != csome_list_var)) {
                if (NIL != reformulation_direction_accessible_from_mtP(explicit_direction_struct, mt)) {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
                        result = makeBoolean((NIL != mt_relevance_macros.relevant_mtP(default_mt)) && (NIL != mt_relevance_macros.relevant_mtP(direction_struct_mt(explicit_direction_struct))));
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                csome_list_var = csome_list_var.rest();
                explicit_direction_struct = csome_list_var.first();
            } 
        }
        return result;
    }

    public static final SubLObject reformulator_rule_has_necessary_meta_predicateP_alt(SubLObject rr, SubLObject meta_predicates) {
        if (NIL != meta_predicates) {
            {
                SubLObject rr_ass = reformulator_rule_unifier_datastructures.reformulator_rule_assertion(rr);
                SubLObject foundP = NIL;
                if (NIL == rr_ass) {
                    return NIL;
                }
                if (NIL == foundP) {
                    {
                        SubLObject csome_list_var = assertion_utilities.all_meta_assertions(rr_ass);
                        SubLObject ass = NIL;
                        for (ass = csome_list_var.first(); !((NIL != foundP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , ass = csome_list_var.first()) {
                            if ((NIL != assertions_high.gaf_assertionP(ass)) && (NIL != member(assertions_high.gaf_arg0(ass), meta_predicates, UNPROVIDED, UNPROVIDED))) {
                                foundP = T;
                            }
                        }
                    }
                }
                return foundP;
            }
        } else {
            return T;
        }
    }

    public static SubLObject reformulator_rule_has_necessary_meta_predicateP(final SubLObject rr, final SubLObject meta_predicates) {
        if (NIL == meta_predicates) {
            return T;
        }
        final SubLObject rr_ass = reformulator_rule_unifier_datastructures.reformulator_rule_assertion(rr);
        SubLObject foundP = NIL;
        if (NIL == rr_ass) {
            return NIL;
        }
        if (NIL == foundP) {
            SubLObject csome_list_var = assertion_utilities.all_meta_assertions(rr_ass);
            SubLObject ass = NIL;
            ass = csome_list_var.first();
            while ((NIL == foundP) && (NIL != csome_list_var)) {
                if ((NIL != assertions_high.gaf_assertionP(ass)) && (NIL != member(assertions_high.gaf_arg0(ass), meta_predicates, UNPROVIDED, UNPROVIDED))) {
                    foundP = T;
                }
                csome_list_var = csome_list_var.rest();
                ass = csome_list_var.first();
            } 
        }
        return foundP;
    }

    /**
     *
     *
     * @return boolean; T iff all preconditions on RR are met in the current reformulation context.
     */
    @LispMethod(comment = "@return boolean; T iff all preconditions on RR are met in the current reformulation context.")
    public static final SubLObject reformulation_preconditions_metP_alt(SubLObject expression, SubLObject rr, SubLObject mt, SubLObject unify_result, SubLObject czer_bindings, SubLObject unify_bindings, SubLObject settings, SubLObject reformulation_direction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject precondition_checking = reformulator_datastructures.get_precondition_checking(settings);
                SubLObject cdolist_list_var = reformulator_rule_unifier_datastructures.reformulator_rule_preconditions(rr);
                SubLObject precondition_struct = NIL;
                for (precondition_struct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , precondition_struct = cdolist_list_var.first()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject precondition_direction = com.cyc.cycjava.cycl.reformulator_rule_unifier.unfold_precondition_struct(precondition_struct);
                        SubLObject precondition = thread.secondMultipleValue();
                        SubLObject precondition_mt = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if ((NIL != com.cyc.cycjava.cycl.reformulator_rule_unifier.reformulation_precondition_right_directionP(precondition_direction, reformulation_direction)) && (NIL != com.cyc.cycjava.cycl.reformulator_rule_unifier.reformulation_precondition_accessible_from_mtP(precondition_mt, mt))) {
                            if (NIL == com.cyc.cycjava.cycl.reformulator_rule_unifier.reformulation_precondition_metP(precondition, expression, rr, mt, unify_result, czer_bindings, unify_bindings, precondition_checking, settings)) {
                                return NIL;
                            }
                        }
                    }
                }
            }
            return T;
        }
    }

    /**
     *
     *
     * @return boolean; T iff all preconditions on RR are met in the current reformulation context.
     */
    @LispMethod(comment = "@return boolean; T iff all preconditions on RR are met in the current reformulation context.")
    public static SubLObject reformulation_preconditions_metP(final SubLObject expression, final SubLObject rr, final SubLObject mt, final SubLObject unify_result, final SubLObject czer_bindings, final SubLObject unify_bindings, final SubLObject settings, final SubLObject reformulation_direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject precondition_checking = reformulator_datastructures.get_precondition_checking(settings);
        SubLObject cdolist_list_var = reformulator_rule_unifier_datastructures.reformulator_rule_preconditions(rr);
        SubLObject precondition_struct = NIL;
        precondition_struct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject precondition_direction = unfold_precondition_struct(precondition_struct);
            final SubLObject precondition = thread.secondMultipleValue();
            final SubLObject precondition_mt = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (((NIL != reformulation_precondition_right_directionP(precondition_direction, reformulation_direction)) && (NIL != reformulation_precondition_accessible_from_mtP(precondition_mt, mt))) && (NIL == reformulation_precondition_metP(precondition, expression, rr, mt, unify_result, czer_bindings, unify_bindings, precondition_checking, settings))) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            precondition_struct = cdolist_list_var.first();
        } 
        return T;
    }

    public static final SubLObject reformulation_precondition_accessible_from_mtP_alt(SubLObject precondition_mt, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        result = mt_relevance_macros.relevant_mtP(precondition_mt);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject reformulation_precondition_accessible_from_mtP(final SubLObject precondition_mt, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
            result = mt_relevance_macros.relevant_mtP(precondition_mt);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @return boolean; T iff PRECONDITION on RR is met in the current reformulation context.
     */
    @LispMethod(comment = "@return boolean; T iff PRECONDITION on RR is met in the current reformulation context.")
    public static final SubLObject reformulation_precondition_metP_alt(SubLObject precondition, SubLObject expression, SubLObject rr, SubLObject mt, SubLObject unify_result, SubLObject czer_bindings, SubLObject unify_bindings, SubLObject precondition_checking, SubLObject settings) {
        {
            SubLObject askable_precondition = nsublis(unify_bindings, sublis(czer_bindings, precondition, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            SubLObject provenP = NIL;
            SubLObject pcase_var = precondition_checking;
            if (pcase_var.eql($REMOVAL_ONLY_ASK)) {
                provenP = com.cyc.cycjava.cycl.reformulator_rule_unifier.reformulator_removal_only_ask(askable_precondition, mt, settings);
            }
            return provenP;
        }
    }

    /**
     *
     *
     * @return boolean; T iff PRECONDITION on RR is met in the current reformulation context.
     */
    @LispMethod(comment = "@return boolean; T iff PRECONDITION on RR is met in the current reformulation context.")
    public static SubLObject reformulation_precondition_metP(final SubLObject precondition, final SubLObject expression, final SubLObject rr, final SubLObject mt, final SubLObject unify_result, final SubLObject czer_bindings, final SubLObject unify_bindings, final SubLObject precondition_checking, final SubLObject settings) {
        final SubLObject askable_precondition = nsublis(unify_bindings, sublis(czer_bindings, precondition, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        SubLObject provenP = NIL;
        if (precondition_checking.eql($REMOVAL_ONLY_ASK)) {
            provenP = reformulator_removal_only_ask(askable_precondition, mt, settings);
        }
        return provenP;
    }

    /**
     *
     *
     * @return BOOLEANP; Is ASKABLE-PRECONDITION easily proven in MT?
     */
    @LispMethod(comment = "@return BOOLEANP; Is ASKABLE-PRECONDITION easily proven in MT?")
    public static final SubLObject reformulator_removal_only_ask_internal_alt(SubLObject askable_precondition, SubLObject mt, SubLObject settings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ask_result = NIL;
                SubLObject reformulator_removal_only_ask_inference_parameters = $reformulator_removal_only_ask_inference_parameters$.getGlobalValue();
                SubLObject max_time = reformulator_datastructures.get_max_time(settings);
                if (NIL != max_time) {
                    reformulator_removal_only_ask_inference_parameters = append(list($MAX_TIME, floor(max_time, UNPROVIDED)), reformulator_removal_only_ask_inference_parameters);
                }
                {
                    SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
                    SubLObject _prev_bind_1 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                    SubLObject _prev_bind_3 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                    SubLObject _prev_bind_4 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                    SubLObject _prev_bind_5 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                    SubLObject _prev_bind_6 = czer_vars.$simplify_literalP$.currentBinding(thread);
                    SubLObject _prev_bind_7 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                    SubLObject _prev_bind_8 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                    SubLObject _prev_bind_9 = wff_vars.$validate_constantsP$.currentBinding(thread);
                    SubLObject _prev_bind_10 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                    SubLObject _prev_bind_11 = wff_utilities.$check_arityP$.currentBinding(thread);
                    try {
                        $within_assert$.bind(NIL, thread);
                        wff_utilities.$check_arg_typesP$.bind(NIL, thread);
                        at_vars.$at_check_arg_typesP$.bind(NIL, thread);
                        wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
                        wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
                        wff_utilities.$check_var_typesP$.bind(NIL, thread);
                        czer_vars.$simplify_literalP$.bind(NIL, thread);
                        at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                        at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                        wff_vars.$validate_constantsP$.bind(NIL, thread);
                        system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                        wff_utilities.$check_arityP$.bind(NIL, thread);
                        if ((NIL != closedP(askable_precondition, UNPROVIDED)) && (NIL != collection_defns.cycl_sentence_askableP(askable_precondition))) {
                            if (NIL != backward.closed_conjunctive_cycl_sentence_p(askable_precondition)) {
                                ask_result = backward.closed_conjunctive_removal_ask(askable_precondition, NIL != mt ? ((SubLObject) (mt)) : mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED);
                            } else {
                                ask_result = cyc_kernel.closed_query_success_result_p(inference_kernel.new_cyc_query(askable_precondition, NIL != mt ? ((SubLObject) (mt)) : mt_relevance_macros.$mt$.getDynamicValue(thread), reformulator_removal_only_ask_inference_parameters));
                            }
                        }
                    } finally {
                        wff_utilities.$check_arityP$.rebind(_prev_bind_11, thread);
                        system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_10, thread);
                        wff_vars.$validate_constantsP$.rebind(_prev_bind_9, thread);
                        at_vars.$at_check_arg_formatP$.rebind(_prev_bind_8, thread);
                        at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_7, thread);
                        czer_vars.$simplify_literalP$.rebind(_prev_bind_6, thread);
                        wff_utilities.$check_var_typesP$.rebind(_prev_bind_5, thread);
                        wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_4, thread);
                        wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_3, thread);
                        at_vars.$at_check_arg_typesP$.rebind(_prev_bind_2, thread);
                        wff_utilities.$check_arg_typesP$.rebind(_prev_bind_1, thread);
                        $within_assert$.rebind(_prev_bind_0, thread);
                    }
                }
                return ask_result;
            }
        }
    }

    /**
     *
     *
     * @return BOOLEANP; Is ASKABLE-PRECONDITION easily proven in MT?
     */
    @LispMethod(comment = "@return BOOLEANP; Is ASKABLE-PRECONDITION easily proven in MT?")
    public static SubLObject reformulator_removal_only_ask_internal(final SubLObject askable_precondition, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ask_result = NIL;
        SubLObject reformulator_removal_only_ask_inference_parameters = $reformulator_removal_only_ask_inference_parameters$.getGlobalValue();
        final SubLObject max_time = reformulator_datastructures.get_max_time(settings);
        if (NIL != max_time) {
            reformulator_removal_only_ask_inference_parameters = append(list($MAX_TIME, floor(max_time, UNPROVIDED)), reformulator_removal_only_ask_inference_parameters);
        }
        final SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
        final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
        final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
        final SubLObject _prev_bind_12 = wff_utilities.$check_arityP$.currentBinding(thread);
        try {
            $within_assert$.bind(NIL, thread);
            wff_utilities.$check_arg_typesP$.bind(NIL, thread);
            at_vars.$at_check_arg_typesP$.bind(NIL, thread);
            wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
            wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
            wff_utilities.$check_var_typesP$.bind(NIL, thread);
            czer_vars.$simplify_literalP$.bind(NIL, thread);
            at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
            at_vars.$at_check_arg_formatP$.bind(NIL, thread);
            wff_vars.$validate_constantsP$.bind(NIL, thread);
            system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
            wff_utilities.$check_arityP$.bind(NIL, thread);
            if ((NIL != closedP(askable_precondition, UNPROVIDED)) && (NIL != collection_defns.cycl_sentence_askableP(askable_precondition))) {
                if (NIL != backward.closed_conjunctive_cycl_sentence_p(askable_precondition)) {
                    ask_result = backward.closed_conjunctive_removal_ask(askable_precondition, NIL != mt ? mt : mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED);
                } else {
                    ask_result = cyc_kernel.closed_query_success_result_p(inference_kernel.new_cyc_query(askable_precondition, NIL != mt ? mt : mt_relevance_macros.$mt$.getDynamicValue(thread), reformulator_removal_only_ask_inference_parameters));
                }
            }
        } finally {
            wff_utilities.$check_arityP$.rebind(_prev_bind_12, thread);
            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
            wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
            at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
            czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
            wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
            wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
            wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
            at_vars.$at_check_arg_typesP$.rebind(_prev_bind_3, thread);
            wff_utilities.$check_arg_typesP$.rebind(_prev_bind_2, thread);
            $within_assert$.rebind(_prev_bind_0, thread);
        }
        return ask_result;
    }

    public static final SubLObject reformulator_removal_only_ask_alt(SubLObject askable_precondition, SubLObject mt, SubLObject settings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.reformulator_rule_unifier.reformulator_removal_only_ask_internal(askable_precondition, mt, settings);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, REFORMULATOR_REMOVAL_ONLY_ASK, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), REFORMULATOR_REMOVAL_ONLY_ASK, THREE_INTEGER, $int$256, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, REFORMULATOR_REMOVAL_ONLY_ASK, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(askable_precondition, mt, settings);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw7$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (askable_precondition.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (mt.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && settings.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.reformulator_rule_unifier.reformulator_removal_only_ask_internal(askable_precondition, mt, settings)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(askable_precondition, mt, settings));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject reformulator_removal_only_ask(final SubLObject askable_precondition, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return reformulator_removal_only_ask_internal(askable_precondition, mt, settings);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, REFORMULATOR_REMOVAL_ONLY_ASK, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), REFORMULATOR_REMOVAL_ONLY_ASK, THREE_INTEGER, $int$256, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, REFORMULATOR_REMOVAL_ONLY_ASK, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(askable_precondition, mt, settings);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (askable_precondition.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && settings.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(reformulator_removal_only_ask_internal(askable_precondition, mt, settings)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(askable_precondition, mt, settings));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject reformulation_precondition_right_directionP_alt(SubLObject precondition_direction, SubLObject reformulation_direction) {
        return eq(precondition_direction, reformulation_direction);
    }

    public static SubLObject reformulation_precondition_right_directionP(final SubLObject precondition_direction, final SubLObject reformulation_direction) {
        return kb_utilities.kbeq(precondition_direction, reformulation_direction);
    }

    public static final SubLObject unfold_precondition_struct_alt(SubLObject precondition_struct) {
        {
            SubLObject precondition_direction = com.cyc.cycjava.cycl.reformulator_rule_unifier.precondition_struct_direction(precondition_struct);
            SubLObject precondition = com.cyc.cycjava.cycl.reformulator_rule_unifier.precondition_struct_precondition(precondition_struct);
            SubLObject precondition_mt = com.cyc.cycjava.cycl.reformulator_rule_unifier.precondition_struct_mt(precondition_struct);
            return values(precondition_direction, precondition, precondition_mt);
        }
    }

    public static SubLObject unfold_precondition_struct(final SubLObject precondition_struct) {
        final SubLObject precondition_direction = precondition_struct_direction(precondition_struct);
        final SubLObject precondition = precondition_struct_precondition(precondition_struct);
        final SubLObject precondition_mt = precondition_struct_mt(precondition_struct);
        return values(precondition_direction, precondition, precondition_mt);
    }

    public static final SubLObject precondition_struct_direction_alt(SubLObject precondition_struct) {
        return precondition_struct.first();
    }

    public static SubLObject precondition_struct_direction(final SubLObject precondition_struct) {
        return precondition_struct.first();
    }

    public static final SubLObject precondition_struct_precondition_alt(SubLObject precondition_struct) {
        return second(precondition_struct);
    }

    public static SubLObject precondition_struct_precondition(final SubLObject precondition_struct) {
        return second(precondition_struct);
    }

    public static final SubLObject precondition_struct_mt_alt(SubLObject precondition_struct) {
        return third(precondition_struct);
    }

    public static SubLObject precondition_struct_mt(final SubLObject precondition_struct) {
        return third(precondition_struct);
    }

    public static final SubLObject reformulation_possible_with_source_rtP_alt(SubLObject expression, SubLObject expression_forts, SubLObject rr, SubLObject direction_to_use) {
        {
            SubLObject rule_source_rt = reformulator_rule_unifier_datastructures.reformulator_rule_source_rt(rr, direction_to_use);
            return com.cyc.cycjava.cycl.reformulator_rule_unifier.reformulation_possibleP(expression, expression_forts, rule_source_rt);
        }
    }

    public static SubLObject reformulation_possible_with_source_rtP(final SubLObject expression, final SubLObject expression_forts, final SubLObject rr, final SubLObject direction_to_use) {
        final SubLObject rule_source_rt = reformulator_rule_unifier_datastructures.reformulator_rule_source_rt(rr, direction_to_use);
        return reformulation_possibleP(expression, expression_forts, rule_source_rt);
    }

    /**
     *
     *
     * @return boolean; Could EXPRESSION possibly unify with RT?
     */
    @LispMethod(comment = "@return boolean; Could EXPRESSION possibly unify with RT?")
    public static final SubLObject reformulation_possibleP_alt(SubLObject expression, SubLObject expression_forts, SubLObject rt) {
        return list_utilities.sorted_subsetp(reformulator_rule_unifier_datastructures.reformulator_template_forts(rt), expression_forts, symbol_function(EQL), $sym31$FORT__, UNPROVIDED);
    }

    /**
     *
     *
     * @return boolean; Could EXPRESSION possibly unify with RT?
     */
    @LispMethod(comment = "@return boolean; Could EXPRESSION possibly unify with RT?")
    public static SubLObject reformulation_possibleP(final SubLObject expression, final SubLObject expression_forts, final SubLObject rt) {
        return list_utilities.sorted_subsetp(reformulator_rule_unifier_datastructures.reformulator_template_forts(rt), expression_forts, symbol_function(EQL), $sym30$FORT__, UNPROVIDED);
    }

    public static SubLObject declare_reformulator_rule_unifier_file() {
        declareFunction("rru_cost_estimate", "RRU-COST-ESTIMATE", 3, 0, false);
        declareFunction("rru_reformulate_expression", "RRU-REFORMULATE-EXPRESSION", 4, 0, false);
        declareFunction("reformulation_cost_estimate", "REFORMULATION-COST-ESTIMATE", 1, 3, false);
        declareFunction("reformulator_match_expression_internal", "REFORMULATOR-MATCH-EXPRESSION-INTERNAL", 4, 0, false);
        declareFunction("reformulator_match_expression", "REFORMULATOR-MATCH-EXPRESSION", 4, 0, false);
        declareFunction("reformulator_match_expression_no_search", "REFORMULATOR-MATCH-EXPRESSION-NO-SEARCH", 7, 0, false);
        declareFunction("reformulator_rule_target_is_nonassertibleP", "REFORMULATOR-RULE-TARGET-IS-NONASSERTIBLE?", 3, 0, false);
        declareFunction("reformulator_rule_contracts_el_relationP", "REFORMULATOR-RULE-CONTRACTS-EL-RELATION?", 3, 0, false);
        declareFunction("reformulator_rule_from_expansion_axiomP", "REFORMULATOR-RULE-FROM-EXPANSION-AXIOM?", 1, 0, false);
        declareFunction("reformulator_rule_unify_if_possible", "REFORMULATOR-RULE-UNIFY-IF-POSSIBLE", 7, 0, false);
        declareFunction("reformulator_rule_unify", "REFORMULATOR-RULE-UNIFY", 5, 0, false);
        declareFunction("reformulator_unify", "REFORMULATOR-UNIFY", 4, 0, false);
        declareFunction("el_var_bindings_consistentP", "EL-VAR-BINDINGS-CONSISTENT?", 3, 0, false);
        declareFunction("el_var_binding_inconsistentP", "EL-VAR-BINDING-INCONSISTENT?", 4, 0, false);
        declareFunction("car_hl_variable_p", "CAR-HL-VARIABLE-P", 1, 0, false);
        declareFunction("find_justification_for_reformulator_rule", "FIND-JUSTIFICATION-FOR-REFORMULATOR-RULE", 1, 0, false);
        declareFunction("direction_to_apply_reformulator_rule", "DIRECTION-TO-APPLY-REFORMULATOR-RULE", 3, 0, false);
        declareFunction("direction_to_use_for_mode_in_mt", "DIRECTION-TO-USE-FOR-MODE-IN-MT", 3, 0, false);
        declareFunction("explicit_direction_to_use_for_mode_in_mt", "EXPLICIT-DIRECTION-TO-USE-FOR-MODE-IN-MT", 3, 0, false);
        declareFunction("default_direction_to_use_for_mode_in_mt", "DEFAULT-DIRECTION-TO-USE-FOR-MODE-IN-MT", 3, 0, false);
        declareFunction("find_usable_direction_for_mode", "FIND-USABLE-DIRECTION-FOR-MODE", 2, 0, false);
        declareFunction("default_mode_directions_for_reformulator_rule", "DEFAULT-MODE-DIRECTIONS-FOR-REFORMULATOR-RULE", 2, 0, false);
        declareFunction("neither_directionP", "NEITHER-DIRECTION?", 1, 0, false);
        new reformulator_rule_unifier.$neither_directionP$UnaryFunction();
        declareFunction("reformulation_direction_accessible_from_mtP", "REFORMULATION-DIRECTION-ACCESSIBLE-FROM-MT?", 2, 0, false);
        declareFunction("direction_struct_direction", "DIRECTION-STRUCT-DIRECTION", 1, 0, false);
        declareFunction("direction_struct_mt", "DIRECTION-STRUCT-MT", 1, 0, false);
        declareFunction("find_kb_reformulator_rules_to_use", "FIND-KB-REFORMULATOR-RULES-TO-USE", 7, 0, false);
        declareFunction("find_usable_unassociated_rules_cached", "FIND-USABLE-UNASSOCIATED-RULES-CACHED", 2, 0, false);
        declareFunction("find_usable_unassociated_rules_cached_int_internal", "FIND-USABLE-UNASSOCIATED-RULES-CACHED-INT-INTERNAL", 6, 0, false);
        declareFunction("find_usable_unassociated_rules_cached_int", "FIND-USABLE-UNASSOCIATED-RULES-CACHED-INT", 6, 0, false);
        declareFunction("find_usable_unassociated_rules", "FIND-USABLE-UNASSOCIATED-RULES", 6, 0, false);
        declareFunction("reformulator_rule_usableP", "REFORMULATOR-RULE-USABLE?", 5, 0, false);
        declareFunction("find_all_superiors_for_forts", "FIND-ALL-SUPERIORS-FOR-FORTS", 2, 0, false);
        declareFunction("order_reformulator_rules", "ORDER-REFORMULATOR-RULES", 5, 0, false);
        declareFunction("reformulator_rule_accessible_from_mtP", "REFORMULATOR-RULE-ACCESSIBLE-FROM-MT?", 2, 0, false);
        declareFunction("reformulator_rule_in_mtP", "REFORMULATOR-RULE-IN-MT?", 2, 0, false);
        declareFunction("reformulator_rule_mentions_all_expression_fortsP", "REFORMULATOR-RULE-MENTIONS-ALL-EXPRESSION-FORTS?", 2, 0, false);
        declareFunction("reformulator_rule_compatible_in_wff_degree", "REFORMULATOR-RULE-COMPATIBLE-IN-WFF-DEGREE", 2, 0, false);
        declareFunction("reformulator_rule_usable_in_any_modeP", "REFORMULATOR-RULE-USABLE-IN-ANY-MODE?", 3, 0, false);
        declareFunction("reformulator_rule_usable_in_modeP", "REFORMULATOR-RULE-USABLE-IN-MODE?", 3, 0, false);
        declareFunction("default_mode_directions_in_effect", "DEFAULT-MODE-DIRECTIONS-IN-EFFECT", 4, 0, false);
        declareFunction("default_reformulation_direction_in_mode_overriddenP", "DEFAULT-REFORMULATION-DIRECTION-IN-MODE-OVERRIDDEN?", 3, 0, false);
        declareFunction("reformulator_rule_has_necessary_meta_predicateP", "REFORMULATOR-RULE-HAS-NECESSARY-META-PREDICATE?", 2, 0, false);
        declareFunction("reformulation_preconditions_metP", "REFORMULATION-PRECONDITIONS-MET?", 8, 0, false);
        declareFunction("reformulation_precondition_accessible_from_mtP", "REFORMULATION-PRECONDITION-ACCESSIBLE-FROM-MT?", 2, 0, false);
        declareFunction("reformulation_precondition_metP", "REFORMULATION-PRECONDITION-MET?", 9, 0, false);
        declareFunction("reformulator_removal_only_ask_internal", "REFORMULATOR-REMOVAL-ONLY-ASK-INTERNAL", 3, 0, false);
        declareFunction("reformulator_removal_only_ask", "REFORMULATOR-REMOVAL-ONLY-ASK", 3, 0, false);
        declareFunction("reformulation_precondition_right_directionP", "REFORMULATION-PRECONDITION-RIGHT-DIRECTION?", 2, 0, false);
        declareFunction("unfold_precondition_struct", "UNFOLD-PRECONDITION-STRUCT", 1, 0, false);
        declareFunction("precondition_struct_direction", "PRECONDITION-STRUCT-DIRECTION", 1, 0, false);
        declareFunction("precondition_struct_precondition", "PRECONDITION-STRUCT-PRECONDITION", 1, 0, false);
        declareFunction("precondition_struct_mt", "PRECONDITION-STRUCT-MT", 1, 0, false);
        declareFunction("reformulation_possible_with_source_rtP", "REFORMULATION-POSSIBLE-WITH-SOURCE-RT?", 4, 0, false);
        declareFunction("reformulation_possibleP", "REFORMULATION-POSSIBLE?", 3, 0, false);
        return NIL;
    }

    public static final SubLObject init_reformulator_rule_unifier_file_alt() {
        defconstant("*REFORMULATOR-REMOVAL-ONLY-ASK-INFERENCE-PARAMETERS*", $list_alt27);
        return NIL;
    }

    public static SubLObject init_reformulator_rule_unifier_file() {
        if (SubLFiles.USE_V1) {
            defconstant("*REFORMULATOR-REMOVAL-ONLY-ASK-INFERENCE-PARAMETERS*", $list26);
        }
        if (SubLFiles.USE_V2) {
            defconstant("*REFORMULATOR-REMOVAL-ONLY-ASK-INFERENCE-PARAMETERS*", $list_alt27);
        }
        return NIL;
    }

    public static SubLObject init_reformulator_rule_unifier_file_Previous() {
        defconstant("*REFORMULATOR-REMOVAL-ONLY-ASK-INFERENCE-PARAMETERS*", $list26);
        return NIL;
    }

    public static SubLObject setup_reformulator_rule_unifier_file() {
        reformulator_module_harness.declare_rl_module($$ReformulatorRuleUnifier, $list1);
        memoization_state.note_memoized_function(REFORMULATOR_MATCH_EXPRESSION);
        memoization_state.note_memoized_function(FIND_USABLE_UNASSOCIATED_RULES_CACHED_INT);
        memoization_state.note_memoized_function(REFORMULATOR_REMOVAL_ONLY_ASK);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_reformulator_rule_unifier_file();
    }

    @Override
    public void initializeVariables() {
        init_reformulator_rule_unifier_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_reformulator_rule_unifier_file();
    }

    static {
    }

    public static final class $neither_directionP$UnaryFunction extends UnaryFunction {
        public $neither_directionP$UnaryFunction() {
            super(extractFunctionNamed("NEITHER-DIRECTION?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return neither_directionP(arg1);
        }
    }

    static private final SubLList $list_alt1 = list(new SubLObject[]{ makeKeyword("REQUIRED"), makeSymbol("TRUE"), $COST, makeSymbol("RRU-COST-ESTIMATE"), makeKeyword("REFORMULATE"), makeSymbol("RRU-REFORMULATE-EXPRESSION"), makeKeyword("DOCUMENTATION"), makeString("The fallback mechanism for the reformulator.\n    Unifies the input expression with applicable reformulator rules."), makeKeyword("EXAMPLE-SOURCE"), makeString("(#$implies (#$isa ?X #$Dog) (#$isa ?X #$Animal))"), makeKeyword("EXAMPLE-TARGET"), makeString("(#$genls #$Dog #$Animal)") });

    public static final SubLSymbol $kw7$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt20 = list(makeKeyword("KB"), makeKeyword("ARITY"), makeKeyword("ALL"));

    static private final SubLList $list_alt22 = list(makeKeyword("ARITY"), makeKeyword("ALL"));

    static private final SubLSymbol $sym24$NEITHER_DIRECTION_ = makeSymbol("NEITHER-DIRECTION?");

    static private final SubLList $list_alt27 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    static private final SubLSymbol $sym31$FORT__ = makeSymbol("FORT-<");
}

/**
 * Total time: 205 ms
 */
