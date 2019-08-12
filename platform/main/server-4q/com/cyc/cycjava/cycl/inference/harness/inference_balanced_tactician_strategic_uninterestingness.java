/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      INFERENCE-BALANCED-TACTICIAN-STRATEGIC-UNINTERESTINGNESS
 *  source file: /cyc/top/cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp
 *  created:     2019/07/03 17:37:40
 */
public final class inference_balanced_tactician_strategic_uninterestingness extends SubLTranslatedFile implements V02 {
    // // Constructor
    private inference_balanced_tactician_strategic_uninterestingness() {
    }

    public static final SubLFile me = new inference_balanced_tactician_strategic_uninterestingness();

    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_balanced_tactician_strategic_uninterestingness";

    // // Definitions
    /**
     * Dynamic variable for remembering the most recent explanation of strategic uninterestingness
     */
    // defparameter
    private static final SubLSymbol $balanced_strategy_uninterestingness_explanation$ = makeSymbol("*BALANCED-STRATEGY-UNINTERESTINGNESS-EXPLANATION*");

    // deflexical
    private static final SubLSymbol $the_unknown_balanced_strategy_uninterestingness_explanation$ = makeSymbol("*THE-UNKNOWN-BALANCED-STRATEGY-UNINTERESTINGNESS-EXPLANATION*");

    public static final SubLObject balanced_strategy_last_uninterestingness_explanation() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return NIL != $balanced_strategy_uninterestingness_explanation$.getDynamicValue(thread) ? ((SubLObject) ($balanced_strategy_uninterestingness_explanation$.getDynamicValue(thread))) : $the_unknown_balanced_strategy_uninterestingness_explanation$.getGlobalValue();
	}
    }

    public static final SubLObject with_balanced_strategy_uninterestingness_explanations(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    SubLObject body = current;
	    return listS(CLET, $list_alt2, append(body, NIL));
	}
    }

    /**
     * Whether we are gathering explanations of strategic uninterestingness
     */
    // defparameter
    public static final SubLSymbol $balanced_strategy_gathering_uninterestingness_explanationsP$ = makeSymbol("*BALANCED-STRATEGY-GATHERING-UNINTERESTINGNESS-EXPLANATIONS?*");

    public static final SubLObject balanced_strategy_note_uninterestingness_explanation(SubLObject explanation_type, SubLObject problem, SubLObject tactic, SubLObject link, SubLObject subexplanation) {
	{
	    SubLObject explanation = make_balanced_strategy_uninterestingness_explanation(explanation_type, problem, tactic, link, subexplanation);
	    SubLTrampolineFile.checkType(explanation, BALANCED_STRATEGY_UNINTERESTINGNESS_EXPLANATION_P);
	    $balanced_strategy_uninterestingness_explanation$.setDynamicValue(explanation);
	    return explanation;
	}
    }

    public static final SubLObject balanced_strategy_possibly_note_uninterestingness_explanation(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    SubLObject explanation_type = NIL;
	    destructuring_bind_must_consp(current, datum, $list_alt6);
	    explanation_type = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, datum, $list_alt6);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject allow_other_keys_p = NIL;
		    SubLObject rest = current;
		    SubLObject bad = NIL;
		    SubLObject current_1 = NIL;
		    for (; NIL != rest;) {
			destructuring_bind_must_consp(rest, datum, $list_alt6);
			current_1 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list_alt6);
			if (NIL == member(current_1, $list_alt7, UNPROVIDED, UNPROVIDED)) {
			    bad = T;
			}
			if (current_1 == $ALLOW_OTHER_KEYS) {
			    allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		    }
		    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list_alt6);
		    }
		    {
			SubLObject problem_tail = property_list_member($PROBLEM, current);
			SubLObject problem = (NIL != problem_tail) ? ((SubLObject) (cadr(problem_tail))) : NIL;
			SubLObject tactic_tail = property_list_member($TACTIC, current);
			SubLObject tactic = (NIL != tactic_tail) ? ((SubLObject) (cadr(tactic_tail))) : NIL;
			SubLObject link_tail = property_list_member($LINK, current);
			SubLObject link = (NIL != link_tail) ? ((SubLObject) (cadr(link_tail))) : NIL;
			SubLObject subexplanation_tail = property_list_member($SUBEXPLANATION, current);
			SubLObject subexplanation = (NIL != subexplanation_tail) ? ((SubLObject) (cadr(subexplanation_tail))) : NIL;
			current = temp;
			if (NIL == current) {
			    return list(PWHEN, $sym14$_BALANCED_STRATEGY_GATHERING_UNINTERESTINGNESS_EXPLANATIONS__, list(BALANCED_STRATEGY_NOTE_UNINTERESTINGNESS_EXPLANATION, explanation_type, problem, tactic, link, subexplanation));
			} else {
			    cdestructuring_bind_error(datum, $list_alt6);
			}
		    }
		}
	    }
	}
	return NIL;
    }

    // deflexical
    private static final SubLSymbol $balanced_strategy_uninterestingness_explanation_table$ = makeSymbol("*BALANCED-STRATEGY-UNINTERESTINGNESS-EXPLANATION-TABLE*");

    public static final SubLObject balanced_strategy_uninterestingness_explanation_string(SubLObject explanation_type) {
	return second(assoc(explanation_type, $balanced_strategy_uninterestingness_explanation_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    /**
     *
     *
     * @return booleanp; t iff OBJECT is a token which indicates a particular type of strategic uninterestingness,
    but not as it applies to a particular inference object.
     */
    public static final SubLObject balanced_strategy_uninterestingness_explanation_type_p(SubLObject v_object) {
	return makeBoolean(v_object.isString() || (v_object.isKeyword() && (NIL != assoc(v_object, $balanced_strategy_uninterestingness_explanation_table$.getGlobalValue(), symbol_function(EQ), UNPROVIDED))));
    }

    /**
     *
     *
     * @return booleanp; t iff OBJECT is an explanation of why a particular inference object is strategically uninteresting.
     */
    public static final SubLObject balanced_strategy_uninterestingness_explanation_p(SubLObject v_object) {
	if (v_object.isCons() && (NIL != list_utilities.lengthE(v_object, FIVE_INTEGER, UNPROVIDED))) {
	    {
		SubLObject datum = v_object;
		SubLObject current = datum;
		SubLObject type = NIL;
		SubLObject problem = NIL;
		SubLObject tactic = NIL;
		SubLObject link = NIL;
		SubLObject subexplanation = NIL;
		destructuring_bind_must_consp(current, datum, $list_alt16);
		type = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list_alt16);
		problem = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list_alt16);
		tactic = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list_alt16);
		link = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list_alt16);
		subexplanation = current.first();
		current = current.rest();
		if (NIL == current) {
		    return makeBoolean(((((NIL != balanced_strategy_uninterestingness_explanation_type_p(type)) && ((NIL == problem) || (NIL != inference_datastructures_problem.problem_p(problem)))) && ((NIL == tactic) || (NIL != inference_datastructures_tactic.tactic_p(tactic))))
			    && ((NIL == link) || (NIL != inference_datastructures_problem_link.problem_link_p(link)))) && ((NIL == subexplanation) || (NIL != balanced_strategy_uninterestingness_explanation_p(subexplanation))));
		} else {
		    cdestructuring_bind_error(datum, $list_alt16);
		}
	    }
	}
	return NIL;
    }

    public static final SubLObject balanced_strategy_uninterestingness_subexplanation_p(SubLObject v_object) {
	return makeBoolean(((NIL == v_object) || (NIL != balanced_strategy_uninterestingness_explanation_p(v_object))) || (NIL != list_utilities.list_of_type_p(BALANCED_STRATEGY_UNINTERESTINGNESS_EXPLANATION_P, v_object)));
    }

    public static final SubLObject make_balanced_strategy_uninterestingness_explanation(SubLObject explanation_type, SubLObject problem, SubLObject tactic, SubLObject link, SubLObject subexplanation) {
	if (problem == UNPROVIDED) {
	    problem = NIL;
	}
	if (tactic == UNPROVIDED) {
	    tactic = NIL;
	}
	if (link == UNPROVIDED) {
	    link = NIL;
	}
	if (subexplanation == UNPROVIDED) {
	    subexplanation = NIL;
	}
	SubLTrampolineFile.checkType(explanation_type, BALANCED_STRATEGY_UNINTERESTINGNESS_EXPLANATION_TYPE_P);
	if (NIL != problem) {
	    SubLTrampolineFile.checkType(problem, PROBLEM_P);
	}
	if (NIL != tactic) {
	    SubLTrampolineFile.checkType(tactic, TACTIC_P);
	}
	if (NIL != link) {
	    SubLTrampolineFile.checkType(link, PROBLEM_LINK_P);
	}
	if (NIL != subexplanation) {
	    SubLTrampolineFile.checkType(subexplanation, BALANCED_STRATEGY_UNINTERESTINGNESS_EXPLANATION_P);
	}
	return list(explanation_type, problem, tactic, link, subexplanation);
    }

    public static final SubLObject balanced_strategy_uninterestingness_explanation_type(SubLObject explanation) {
	SubLTrampolineFile.checkType(explanation, BALANCED_STRATEGY_UNINTERESTINGNESS_EXPLANATION_P);
	return explanation.first();
    }

    /**
     * Bound to NIL when trying to rederive the reason that something was put in the cache.
     */
    // defparameter
    private static final SubLSymbol $balanced_strategy_uses_already_thrown_away_cacheP$ = makeSymbol("*BALANCED-STRATEGY-USES-ALREADY-THROWN-AWAY-CACHE?*");

    /**
     * Whether :set-aside plus non-continuable should be strengthened to :throw-away for TACTIC.
     * This is usually T except for special circumstances, e.g. split tactic removal lookahead when transformation is allowed.
     */
    public static final SubLObject balanced_strategy_set_aside_non_continuable_implies_throw_away_tacticP(SubLObject tactic, SubLObject motivation) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if ((($REMOVAL == motivation) && (NIL != inference_worker_split.split_tactic_p(tactic))) && (NIL != inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_tactic.tactic_store(tactic)))) {
		return NIL;
	    }
	    return inference_tactician.$set_aside_non_continuable_implies_throw_awayP$.getDynamicValue(thread);
	}
    }

    /**
     * Whether :set-aside plus non-continuable should be strengthened to :throw-away for PROBLEM.
     * This is usually T except for special circumstances, e.g. if PROBLEM is a split problem and transformation is allowed.
     */
    public static final SubLObject balanced_strategy_set_aside_non_continuable_implies_throw_away_problemP(SubLObject problem, SubLObject motivation) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return inference_tactician.$set_aside_non_continuable_implies_throw_awayP$.getDynamicValue(thread);
	}
    }

    /**
     *
     *
     * @return balanced-strategy-uninterestingness-explanation-type-p
     */
    public static final SubLObject balanced_strategy_why_problem_already_thrown_awayP(SubLObject strategy, SubLObject problem, SubLObject motivation) {
	SubLTrampolineFile.checkType(motivation, BALANCED_STRATEGY_MOTIVATION_P);
	if (NIL != rederive_why_balanced_strategy_chooses_to_throw_away_problemP(strategy, problem, motivation)) {
	    {
		SubLObject explanation = balanced_strategy_last_uninterestingness_explanation();
		return balanced_strategy_uninterestingness_explanation_type(explanation);
	    }
	} else if (NIL != balanced_strategy_chooses_not_to_activate_any_strategems_on_problemP(strategy, problem, motivation)) {
	    {
		SubLObject pcase_var = motivation;
		if (pcase_var.eql($REMOVAL)) {
		    return $PROBLEM_HAS_NO_ACTIVATIBLE_REMOVAL_STRATEGEMS;
		} else if (pcase_var.eql($TRANSFORMATION)) {
		    return $PROBLEM_HAS_NO_ACTIVATIBLE_TRANSFORMATION_STRATEGEMS;
		}

	    }
	} else {
	    return $PROBLEM_ALREADY_THROWN_AWAY;
	}

	return NIL;
    }

    public static final SubLObject rederive_why_balanced_strategy_chooses_to_throw_away_problemP(SubLObject strategy, SubLObject problem, SubLObject motivation) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(motivation, BALANCED_STRATEGY_MOTIVATION_P);
	    {
		SubLObject throw_awayP = NIL;
		{
		    SubLObject _prev_bind_0 = $balanced_strategy_uses_already_thrown_away_cacheP$.currentBinding(thread);
		    try {
			$balanced_strategy_uses_already_thrown_away_cacheP$.bind(NIL, thread);
			throw_awayP = balanced_strategy_chooses_to_throw_away_problemP(strategy, problem, motivation, UNPROVIDED);
		    } finally {
			$balanced_strategy_uses_already_thrown_away_cacheP$.rebind(_prev_bind_0, thread);
		    }
		}
		return throw_awayP;
	    }
	}
    }

    // defvar
    private static final SubLSymbol $balanced_strategy_throw_away_problem_with_abduced_term_wrt_transformationP$ = makeSymbol("*BALANCED-STRATEGY-THROW-AWAY-PROBLEM-WITH-ABDUCED-TERM-WRT-TRANSFORMATION?*");

    /**
     *
     *
     * @return booleanp; whether STRATEGY, after careful deliberation, chooses to throw away PROBLEM wrt MOTIVATION.
     */
    public static final SubLObject balanced_strategy_chooses_to_throw_away_problemP(SubLObject strategy, SubLObject problem, SubLObject motivation, SubLObject consider_all_tacticsP) {
	if (consider_all_tacticsP == UNPROVIDED) {
	    consider_all_tacticsP = T;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(motivation, BALANCED_STRATEGY_MOTIVATION_P);
	    if (NIL != balanced_strategy_chooses_to_throw_away_problem_uncacheableP(strategy, problem, motivation, consider_all_tacticsP)) {
		return T;
	    } else {
		{
		    SubLObject throw_away = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy.problem_thrown_away_cache_status_wrt_motivation(problem, strategy, motivation);
		    if (NIL != booleanp(throw_away)) {
			return throw_away;
		    } else {
			{
			    SubLObject throw_awayP = balanced_strategy_chooses_to_throw_away_problem_cacheableP(strategy, problem, motivation, consider_all_tacticsP);
			    if (NIL != throw_awayP) {
				if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
				    balanced_strategy_note_uninterestingness_explanation($PROBLEM_ALREADY_THROWN_AWAY, problem, NIL, NIL, NIL);
				}
				com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy.set_problem_thrown_away_wrt(problem, strategy, motivation);
			    } else {
				com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy.set_problem_not_thrown_away_wrt(problem, strategy, motivation);
			    }
			    return throw_awayP;
			}
		    }
		}
	    }
	}
    }

    /**
     * The parts of throw-away reasoning that must always be recomputed and cannot be cached
     * because it's too hard to figure out when the cache needs to be cleared.
     * Or perhaps because they're really cheap to recompute.
     */
    public static final SubLObject balanced_strategy_chooses_to_throw_away_problem_uncacheableP(SubLObject strategy, SubLObject problem, SubLObject motivation, SubLObject consider_all_tacticsP) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if ((motivation == $TRANSFORMATION) && (NIL != inference_tactician.strategy_throws_away_all_transformationP(strategy))) {
		if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
		    balanced_strategy_note_uninterestingness_explanation($STRATEGY_THROWS_AWAY_ALL_TRANSFORMATION, NIL, NIL, NIL, NIL);
		}
		return T;
	    } else if ((NIL != $balanced_strategy_uses_already_thrown_away_cacheP$.getDynamicValue(thread)) && (NIL != balanced_strategy_problem_thrown_awayP(strategy, problem, motivation))) {
		if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
		    balanced_strategy_note_uninterestingness_explanation(balanced_strategy_why_problem_already_thrown_awayP(strategy, problem, motivation), problem, NIL, NIL, NIL);
		}
		return T;
	    } else if ((NIL != consider_all_tacticsP) && (NIL != balanced_strategy_chooses_to_throw_away_all_tacticsP(strategy, problem, motivation, T))) {
		if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
		    balanced_strategy_note_uninterestingness_explanation($ALL_TACTICS_THROWN_AWAY, problem, NIL, NIL, NIL);
		}
		return T;
	    } else if (((NIL != balanced_strategy_set_aside_non_continuable_implies_throw_away_problemP(problem, motivation)) && (NIL == inference_datastructures_strategy.strategy_continuableP(strategy)))
		    && (NIL != balanced_strategy_chooses_to_set_aside_problemP(strategy, problem, motivation, T, T))) {
		{
		    SubLObject subexplanation = balanced_strategy_last_uninterestingness_explanation();
		    if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
			balanced_strategy_note_uninterestingness_explanation($PROBLEM_STRATEGY_NOT_CONTINUABLE, problem, NIL, NIL, subexplanation);
		    }
		}
		return T;
	    } else {
		return NIL;
	    }

	}
    }

    /**
     * The parts of throw-away reasoning that can be cached.
     * The comments before each clause in the pcond indicate the conditions when the cache for TACTIC should be cleared.
     */
    public static final SubLObject balanced_strategy_chooses_to_throw_away_problem_cacheableP(SubLObject strategy, SubLObject problem, SubLObject motivation, SubLObject consider_all_tacticsP) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_throw_away_problemP(strategy, problem)) {
		if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
		    balanced_strategy_note_uninterestingness_explanation(inference_tactician_strategic_uninterestingness.why_simple_strategy_chooses_to_throw_away_problem(strategy, problem), NIL, NIL, NIL, NIL);
		}
		return T;
	    } else if (((motivation == $TRANSFORMATION) && (NIL != inference_datastructures_problem.single_literal_problem_p(problem))) && (NIL == inference_datastructures_problem.problem_has_transformation_tacticsP(problem))) {
		if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
		    balanced_strategy_note_uninterestingness_explanation($PROBLEM_HAS_NO_TRANSFORMATION_TACTICS, problem, NIL, NIL, NIL);
		}
		return T;
	    } else if ((((NIL != $balanced_strategy_throw_away_problem_with_abduced_term_wrt_transformationP$.getDynamicValue(thread)) && (motivation == $TRANSFORMATION)) && (NIL != inference_abduction_utilities.abductive_strategy_p(strategy)))
		    && (NIL != cycl_utilities.expression_find_if(symbol_function(ABDUCED_TERM_P), inference_datastructures_problem.problem_query(problem), UNPROVIDED, UNPROVIDED))) {
		if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
		    balanced_strategy_note_uninterestingness_explanation($DONT_TRANSFORM_ON_PROBLEM_WITH_ABDUCED_TERM, problem, NIL, NIL, NIL);
		}
		return T;
	    } else {
		return NIL;
	    }

	}
    }

    /**
     *
     *
     * @param PROBLEM-ALREADY-CONSIDERED?;
     * 		whether the caller has already considered that the problem of STRATEGEM
     * 		might be thrown away wrt MOTIVATION.  If T, the analysis will not be redone.
     */
    public static final SubLObject balanced_strategy_chooses_to_throw_away_strategemP(SubLObject strategy, SubLObject strategem, SubLObject motivation, SubLObject problem_already_consideredP) {
	if (problem_already_consideredP == UNPROVIDED) {
	    problem_already_consideredP = NIL;
	}
	if (NIL != inference_datastructures_tactic.tactic_p(strategem)) {
	    {
		SubLObject tactic = strategem;
		return balanced_strategy_chooses_to_throw_away_tacticP(strategy, tactic, motivation, problem_already_consideredP, UNPROVIDED);
	    }
	} else {
	    {
		SubLObject link = strategem;
		return balanced_strategy_chooses_to_throw_away_linkP(strategy, link, motivation, problem_already_consideredP);
	    }
	}
    }

    /**
     *
     *
     * @param PROBLEM-ALREADY-CONSIDERED?;
     * 		whether the caller has already considered that the problem of TACTIC
     * 		might be thrown away wrt MOTIVATION.  If T, the analysis will not be redone.
     */
    public static final SubLObject balanced_strategy_chooses_to_throw_away_tacticP(SubLObject strategy, SubLObject tactic, SubLObject motivation, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP) {
	if (problem_already_consideredP == UNPROVIDED) {
	    problem_already_consideredP = NIL;
	}
	if (siblings_already_consideredP == UNPROVIDED) {
	    siblings_already_consideredP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(motivation, BALANCED_STRATEGY_MOTIVATION_P);
	    if ((motivation == $REMOVAL) && (NIL != balanced_strategy_deems_tactic_harmless_wrt_removal_motivationP(strategy, tactic))) {
		return NIL;
	    } else if (NIL != balanced_strategy_chooses_to_throw_away_tactic_uncacheableP(strategy, tactic, motivation, problem_already_consideredP, siblings_already_consideredP)) {
		return T;
	    } else {
		{
		    SubLObject throw_away = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy.tactic_thrown_away_cache_status_wrt_motivation(tactic, strategy, motivation);
		    if (NIL != booleanp(throw_away)) {
			return throw_away;
		    } else {
			{
			    SubLObject throw_awayP = balanced_strategy_chooses_to_throw_away_tactic_cacheableP(strategy, tactic, motivation, problem_already_consideredP, siblings_already_consideredP);
			    if (NIL != throw_awayP) {
				if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
				    balanced_strategy_note_uninterestingness_explanation($TACTIC_ALREADY_THROWN_AWAY, NIL, tactic, NIL, NIL);
				}
				com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy.set_tactic_thrown_away_wrt(tactic, strategy, motivation);
			    } else {
				com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy.set_tactic_not_thrown_away_wrt(tactic, strategy, motivation);
			    }
			    return throw_awayP;
			}
		    }
		}
	    }

	}
    }

    /**
     * The parts of throw-away reasoning that must always be recomputed and cannot be cached
     * because it's too hard to figure out when the cache needs to be cleared.
     * Or perhaps because they're really cheap to recompute.
     */
    public static final SubLObject balanced_strategy_chooses_to_throw_away_tactic_uncacheableP(SubLObject strategy, SubLObject tactic, SubLObject motivation, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if ((NIL != $balanced_strategy_uses_already_thrown_away_cacheP$.getDynamicValue(thread)) && (NIL != balanced_strategy_tactic_thrown_awayP(strategy, tactic, motivation))) {
		if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
		    balanced_strategy_note_uninterestingness_explanation($TACTIC_ALREADY_THROWN_AWAY, NIL, tactic, NIL, NIL);
		}
		return T;
	    } else if ((motivation == $TRANSFORMATION) && (NIL != inference_tactician.strategy_throws_away_all_transformationP(strategy))) {
		if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
		    balanced_strategy_note_uninterestingness_explanation($STRATEGY_THROWS_AWAY_ALL_TRANSFORMATION, NIL, NIL, NIL, NIL);
		}
		return T;
	    } else if (NIL != balanced_strategy_chooses_to_throw_away_tactic_hl_module_wrt_motivationP(strategy, tactic, motivation)) {
		if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
		    balanced_strategy_note_uninterestingness_explanation($TACTIC_HL_MODULE_THROWN_AWAY, NIL, tactic, NIL, NIL);
		}
		return T;
	    } else if (NIL == inference_tactician_strategic_uninterestingness.strategy_admits_tactic_wrt_proof_specP(strategy, tactic)) {
		return T;
	    } else if ((motivation == $REMOVAL) && (NIL != balanced_strategy_chooses_to_throw_away_meta_removal_tactic_wrt_removalP(strategy, tactic))) {
		if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
		    balanced_strategy_note_uninterestingness_explanation($META_REMOVAL_TACTIC_THROWN_AWAY, NIL, tactic, NIL, NIL);
		}
		return T;
	    }

	    if (NIL == problem_already_consideredP) {
		{
		    SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
		    if (NIL != balanced_strategy_chooses_to_throw_away_problemP(strategy, problem, motivation, NIL)) {
			{
			    SubLObject subexplanation = balanced_strategy_last_uninterestingness_explanation();
			    if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
				balanced_strategy_note_uninterestingness_explanation($TACTIC_THROWN_AWAY_BECAUSE_PROBLEM_THROWN_AWAY, NIL, tactic, NIL, subexplanation);
			    }
			}
			return T;
		    }
		}
	    }
	    if ((($REMOVAL == motivation) && (NIL != inference_worker.content_tactic_p(tactic))) && (NIL != inference_tactician_strategic_uninterestingness.tactic_impossibleP(tactic, strategy))) {
		if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
		    balanced_strategy_note_uninterestingness_explanation($$$tactic_is_impossible, NIL, NIL, NIL, NIL);
		}
		return T;
	    } else if ((NIL != inference_worker.logical_tactic_p(tactic)) && (NIL != balanced_strategy_chooses_to_throw_away_tactic_lookahead_problemP(strategy, tactic, motivation))) {
		{
		    SubLObject subexplanation = balanced_strategy_last_uninterestingness_explanation();
		    if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
			balanced_strategy_note_uninterestingness_explanation($TACTIC_THROWN_AWAY_BECAUSE_LOOKAHEAD_PROBLEM_THROWN_AWAY, NIL, tactic, NIL, subexplanation);
		    }
		}
		return T;
	    } else if ((((motivation == $REMOVAL) && (NIL == siblings_already_consideredP)) && (NIL != inference_worker_split.split_tactic_p(tactic))) && (NIL != balanced_strategy_chooses_to_throw_away_split_tactic_wrt_removalP(strategy, tactic))) {
		return T;
	    } else if ((motivation == $TRANSFORMATION) && (NIL != balanced_strategy_transformation_tactic_generated_enoughP(strategy, tactic))) {
		if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
		    balanced_strategy_note_uninterestingness_explanation($TACTIC_GENERATED_ENOUGH, NIL, tactic, NIL, NIL);
		}
		return T;
	    } else if (((NIL != balanced_strategy_set_aside_non_continuable_implies_throw_away_tacticP(tactic, motivation)) && (NIL == inference_datastructures_strategy.strategy_continuableP(strategy)))
		    && (NIL != balanced_strategy_chooses_to_set_aside_tacticP(strategy, tactic, motivation, T, eq(motivation, $REMOVAL), T))) {
		{
		    SubLObject subexplanation = balanced_strategy_last_uninterestingness_explanation();
		    if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
			balanced_strategy_note_uninterestingness_explanation($TACTIC_STRATEGY_NOT_CONTINUABLE, NIL, tactic, NIL, subexplanation);
		    }
		}
		return T;
	    }

	    return NIL;
	}
    }

    /**
     * The parts of throw-away reasoning that can be cached.
     * The comments before each clause in the pcond indicate the conditions when the cache for TACTIC should be cleared.
     */
    public static final SubLObject balanced_strategy_chooses_to_throw_away_tactic_cacheableP(SubLObject strategy, SubLObject tactic, SubLObject motivation, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (((motivation == $REMOVAL) && (NIL != inference_abduction_utilities.abductive_strategy_p(strategy))) && (NIL != inference_datastructures_tactic.abductive_tacticP(tactic))) {
		if (NIL != inference_worker.good_problem_p(inference_datastructures_tactic.tactic_problem(tactic), strategy)) {
		    if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
			balanced_strategy_note_uninterestingness_explanation($DONT_DO_ABDUCTION_ON_GOOD_PROBLEM, inference_datastructures_tactic.tactic_problem(tactic), NIL, NIL, NIL);
		    }
		    return T;
		}
		if (NIL != inference_datastructures_problem.problem_has_only_non_abducible_rule_transformation_dependent_linksP(inference_datastructures_tactic.tactic_problem(tactic))) {
		    if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
			balanced_strategy_note_uninterestingness_explanation($PROBLEM_HAS_NON_ABDUCIBLE_RULE_TRANSFORMATION_LINK, inference_datastructures_tactic.tactic_problem(tactic), NIL, NIL, NIL);
		    }
		    return T;
		}
	    } else if (NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_throw_away_tacticP(strategy, tactic)) {
		if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
		    balanced_strategy_note_uninterestingness_explanation(inference_tactician_strategic_uninterestingness.why_simple_strategy_chooses_to_throw_away_tactic(strategy, tactic), NIL, NIL, NIL, NIL);
		}
		return T;
	    } else if (((motivation == $REMOVAL) && (NIL != inference_worker.connected_conjunction_tactic_p(tactic))) && (NIL != inference_tactician_utilities.problem_has_some_complete_non_thrown_away_removal_tacticP(inference_datastructures_tactic.tactic_problem(tactic), strategy))) {
		if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
		    balanced_strategy_note_uninterestingness_explanation($TACTIC_THROWN_AWAY_BECAUSE_COMPLETE_SIBLING_CONJUNCTIVE_REMOVAL, NIL, tactic, NIL, NIL);
		}
		return T;
	    } else if ((($REMOVAL == motivation) && (NIL != inference_worker.structural_tactic_p(tactic))) && (NIL != inference_tactician_strategic_uninterestingness.tactic_disallowedP(tactic, strategy))) {
		if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
		    balanced_strategy_note_uninterestingness_explanation($$$tactic_is_disallowed, NIL, NIL, NIL, NIL);
		}
		return T;
	    } else if (((NIL != inference_worker_join_ordered.join_ordered_tactic_p(tactic)) && (NIL != inference_trampolines.problem_backchain_requiredP(inference_datastructures_tactic.tactic_problem(tactic))))
		    && (tactic != balanced_strategy_preferred_backchain_required_join_ordered_tactic(strategy, inference_datastructures_tactic.tactic_problem(tactic)))) {
		if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
		    balanced_strategy_note_uninterestingness_explanation($TACTIC_THROWN_AWAY_BECAUSE_SIBLING_BACKCHAIN_REQUIRED, NIL, tactic, NIL, NIL);
		}
		return T;
	    } else if (((NIL != inference_worker_restriction.$simplification_tactics_execute_early_and_pass_down_transformation_motivationP$.getDynamicValue(thread)) && (NIL != inference_worker.connected_conjunction_tactic_p(tactic)))
		    && (NIL != balanced_strategy_chooses_to_throw_away_tactic_with_sibling_simplification_tacticP(tactic))) {
		if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
		    balanced_strategy_note_uninterestingness_explanation($TACTIC_THROWN_AWAY_BECAUSE_SIBLING_IS_A_SIMPLIFICATION, NIL, tactic, NIL, NIL);
		}
		return T;
	    } else {
		return NIL;
	    }

	    return NIL;
	}
    }

    public static final SubLObject balanced_strategy_chooses_to_throw_away_tactic_with_sibling_simplification_tacticP(SubLObject tactic) {
	{
	    SubLObject result = NIL;
	    SubLObject tactic_var = tactic;
	    SubLObject rest = NIL;
	    for (rest = inference_datastructures_problem.problem_tactics(inference_datastructures_tactic.tactic_problem(tactic_var)); !((NIL != result) || (NIL == rest)); rest = rest.rest()) {
		{
		    SubLObject sibling_tactic = rest.first();
		    if (sibling_tactic != tactic_var) {
			if (NIL != inference_worker_restriction.simplification_tactic_p(sibling_tactic)) {
			    result = T;
			}
		    }
		}
	    }
	    return result;
	}
    }

    /**
     *
     *
     * @param PROBLEM-ALREADY-CONSIDERED?;
     * 		whether the caller has already considered that the supported problem of LINK
     * 		might be thrown away wrt MOTIVATION.  If T, the analysis will not be redone.
     */
    public static final SubLObject balanced_strategy_chooses_to_throw_away_linkP(SubLObject strategy, SubLObject link, SubLObject motivation, SubLObject problem_already_consideredP) {
	if (problem_already_consideredP == UNPROVIDED) {
	    problem_already_consideredP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(motivation, BALANCED_STRATEGY_MOTIVATION_P);
	    if (NIL == problem_already_consideredP) {
		{
		    SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
		    if (NIL != balanced_strategy_chooses_to_throw_away_problemP(strategy, problem, motivation, UNPROVIDED)) {
			{
			    SubLObject subexplanation = balanced_strategy_last_uninterestingness_explanation();
			    if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
				balanced_strategy_note_uninterestingness_explanation($LINK_SUPPORTED_PROBLEM_THROWN_AWAY, NIL, NIL, link, subexplanation);
			    }
			}
			return T;
		    }
		}
	    }
	    if (((motivation == $TRANSFORMATION) && (NIL != inference_worker.connected_conjunction_link_p(link))) && (NIL != balanced_strategy_link_has_sibling_early_removal_linkP(strategy, link))) {
		{
		    SubLObject subexplanation = balanced_strategy_last_uninterestingness_explanation();
		    if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
			balanced_strategy_note_uninterestingness_explanation($SIBLING_EARLY_REMOVAL_LINK, NIL, NIL, link, subexplanation);
		    }
		}
		return T;
	    } else if (((motivation == $TRANSFORMATION) && (NIL != inference_worker_transformation.transformation_link_p(link)))
		    && (NIL == inference_datastructures_inference.inference_allows_use_of_ruleP(inference_datastructures_strategy.strategy_inference(strategy), inference_worker_transformation.transformation_link_rule_assertion(link)))) {
		if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
		    balanced_strategy_note_uninterestingness_explanation($LINK_RULE_DISALLOWED, NIL, NIL, link, NIL);
		}
	    } else {
		return NIL;
	    }

	    return NIL;
	}
    }

    public static final SubLObject why_balanced_strategy_chooses_to_ignore_new_root(SubLObject strategy, SubLObject problem) {
	if (NIL != inference_datastructures_problem.problem_invalid_p(problem)) {
	    return $INVALID;
	} else if (NIL != balanced_strategy_chooses_to_throw_away_new_rootP(strategy, problem)) {
	    return $THROW_AWAY;
	} else {
	    return NIL;
	}

    }

    public static final SubLObject balanced_strategy_chooses_to_throw_away_new_rootP(SubLObject strategy, SubLObject problem) {
	return inference_datastructures_strategy.strategy_dispatch(strategy, $THROW_AWAY_NEW_ROOT, problem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject balanced_strategy_default_chooses_to_throw_away_new_rootP(SubLObject strategy, SubLObject problem) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL == inference_balanced_tactician_execution.balanced_strategy_new_root_next_motivation(strategy, problem)) {
		if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
		    balanced_strategy_note_uninterestingness_explanation($NEW_ROOT_PENDING_WRT_MOTIVATION, problem, NIL, NIL, NIL);
		}
		return T;
	    } else {
		return NIL;
	    }
	}
    }

    /**
     *
     *
     * @return booleanp; whether STRATEGY, after careful deliberation, chooses to set aside PROBLEM wrt MOTIVATION.
     */
    public static final SubLObject balanced_strategy_chooses_to_set_aside_problemP(SubLObject strategy, SubLObject problem, SubLObject motivation, SubLObject consider_all_tacticsP, SubLObject thrown_away_already_consideredP) {
	if (consider_all_tacticsP == UNPROVIDED) {
	    consider_all_tacticsP = T;
	}
	if (thrown_away_already_consideredP == UNPROVIDED) {
	    thrown_away_already_consideredP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(motivation, BALANCED_STRATEGY_MOTIVATION_P);
	    if (NIL != balanced_strategy_chooses_to_set_aside_problem_uncacheableP(strategy, problem, motivation, consider_all_tacticsP, thrown_away_already_consideredP)) {
		return T;
	    } else {
		{
		    SubLObject set_aside = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy.problem_set_aside_cache_status_wrt_motivation(problem, strategy, motivation);
		    if (NIL != booleanp(set_aside)) {
			return set_aside;
		    } else {
			{
			    SubLObject set_asideP = balanced_strategy_chooses_to_set_aside_problem_cacheableP(strategy, problem, motivation, consider_all_tacticsP, thrown_away_already_consideredP);
			    if (NIL != set_asideP) {
				if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
				    balanced_strategy_note_uninterestingness_explanation($PROBLEM_ALREADY_SET_ASIDE, problem, NIL, NIL, NIL);
				}
				com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy.set_problem_set_aside_wrt(problem, strategy, motivation);
			    } else {
				com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy.set_problem_not_set_aside_wrt(problem, strategy, motivation);
			    }
			    return set_asideP;
			}
		    }
		}
	    }
	}
    }

    /**
     * The parts of set-aside reasoning that must always be recomputed and cannot be cached
     * because it's too hard to figure out when the cache needs to be cleared.
     * Or perhaps because they're really cheap to recompute.
     */
    public static final SubLObject balanced_strategy_chooses_to_set_aside_problem_uncacheableP(SubLObject strategy, SubLObject problem, SubLObject motivation, SubLObject consider_all_tacticsP, SubLObject thrown_away_already_consideredP) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if ((motivation == $TRANSFORMATION) && (NIL != inference_tactician.strategy_sets_aside_all_transformationP(strategy))) {
		if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
		    balanced_strategy_note_uninterestingness_explanation($STRATEGY_SETS_ASIDE_ALL_TRANSFORMATION, NIL, NIL, NIL, NIL);
		}
		return T;
	    } else if (NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_set_asideP(strategy, problem, motivation)) {
		if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
		    balanced_strategy_note_uninterestingness_explanation($PROBLEM_ALREADY_SET_ASIDE, problem, NIL, NIL, NIL);
		}
		return T;
	    } else if (((NIL != consider_all_tacticsP) && (NIL != inference_datastructures_strategy.strategically_possible_problem_p(problem, strategy))) && (NIL != balanced_strategy_chooses_to_set_aside_all_tacticsP(strategy, problem, motivation, T))) {
		if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
		    balanced_strategy_note_uninterestingness_explanation($ALL_TACTICS_SET_ASIDE, problem, NIL, NIL, NIL);
		}
		return T;
	    } else {
		return NIL;
	    }

	}
    }

    /**
     * The parts of set-aside reasoning that can be cached.
     * The comments before each clause in the pcond indicate the conditions when the cache for TACTIC should be cleared.
     */
    public static final SubLObject balanced_strategy_chooses_to_set_aside_problem_cacheableP(SubLObject strategy, SubLObject problem, SubLObject motivation, SubLObject consider_all_tacticsP, SubLObject thrown_away_already_consideredP) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if ((NIL == thrown_away_already_consideredP) && (NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_set_aside_problemP(strategy, problem))) {
		if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
		    balanced_strategy_note_uninterestingness_explanation(inference_tactician_strategic_uninterestingness.why_simple_strategy_chooses_to_set_aside_problem(strategy, problem), NIL, NIL, NIL, NIL);
		}
		return T;
	    } else {
		return NIL;
	    }
	}
    }

    public static final SubLObject balanced_strategy_chooses_to_set_aside_strategemP(SubLObject strategy, SubLObject strategem, SubLObject motivation, SubLObject problem_already_consideredP, SubLObject thrown_away_already_consideredP) {
	if (problem_already_consideredP == UNPROVIDED) {
	    problem_already_consideredP = NIL;
	}
	if (thrown_away_already_consideredP == UNPROVIDED) {
	    thrown_away_already_consideredP = NIL;
	}
	if (NIL != inference_datastructures_tactic.tactic_p(strategem)) {
	    {
		SubLObject tactic = strategem;
		return balanced_strategy_chooses_to_set_aside_tacticP(strategy, tactic, motivation, problem_already_consideredP, NIL, thrown_away_already_consideredP);
	    }
	} else {
	    {
		SubLObject link = strategem;
		return balanced_strategy_chooses_to_set_aside_linkP(strategy, link, motivation, problem_already_consideredP, thrown_away_already_consideredP);
	    }
	}
    }

    /**
     *
     *
     * @param PROBLEM-ALREADY-CONSIDERED?;
     * 		whether the caller has already considered that the problem of TACTIC
     * 		might be set aside wrt MOTIVATION.  If T, the analysis will not be redone.
     * @param THROWN-AWAY-ALREADY-CONSIDERED?;
     * 		don't redo work if this is being called from balanced-strategy-chooses-to-throw-away-tactic?
     */
    public static final SubLObject balanced_strategy_chooses_to_set_aside_tacticP(SubLObject strategy, SubLObject tactic, SubLObject motivation, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP, SubLObject thrown_away_already_consideredP) {
	if (problem_already_consideredP == UNPROVIDED) {
	    problem_already_consideredP = NIL;
	}
	if (siblings_already_consideredP == UNPROVIDED) {
	    siblings_already_consideredP = NIL;
	}
	if (thrown_away_already_consideredP == UNPROVIDED) {
	    thrown_away_already_consideredP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(motivation, BALANCED_STRATEGY_MOTIVATION_P);
	    if ((motivation == $REMOVAL) && (NIL != balanced_strategy_deems_tactic_harmless_wrt_removal_motivationP(strategy, tactic))) {
		return NIL;
	    } else if (NIL != balanced_strategy_chooses_to_set_aside_tactic_uncacheableP(strategy, tactic, motivation, problem_already_consideredP, siblings_already_consideredP, thrown_away_already_consideredP)) {
		return T;
	    } else {
		{
		    SubLObject set_aside = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy.tactic_set_aside_cache_status_wrt_motivation(tactic, strategy, motivation);
		    if (NIL != booleanp(set_aside)) {
			return set_aside;
		    } else {
			{
			    SubLObject set_asideP = balanced_strategy_chooses_to_set_aside_tactic_cacheableP(strategy, tactic, motivation, problem_already_consideredP, siblings_already_consideredP, thrown_away_already_consideredP);
			    if (NIL != set_asideP) {
				if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
				    balanced_strategy_note_uninterestingness_explanation($TACTIC_ALREADY_SET_ASIDE, NIL, tactic, NIL, NIL);
				}
				com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy.set_tactic_set_aside_wrt(tactic, strategy, motivation);
			    } else {
				com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy.set_tactic_not_set_aside_wrt(tactic, strategy, motivation);
			    }
			    return set_asideP;
			}
		    }
		}
	    }

	}
    }

    /**
     * The parts of set-aside reasoning that must always be recomputed and cannot be cached
     * because it's too hard to figure out when the cache needs to be cleared.
     * Or perhaps because they're really cheap to recompute.
     */
    public static final SubLObject balanced_strategy_chooses_to_set_aside_tactic_uncacheableP(SubLObject strategy, SubLObject tactic, SubLObject motivation, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP, SubLObject thrown_away_already_consideredP) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != balanced_strategy_tactic_set_asideP(strategy, tactic, motivation)) {
		if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
		    balanced_strategy_note_uninterestingness_explanation($TACTIC_ALREADY_SET_ASIDE, NIL, tactic, NIL, NIL);
		}
		return T;
	    } else if (((NIL == thrown_away_already_consideredP) && (motivation == $TRANSFORMATION)) && (NIL != inference_tactician.strategy_throws_away_all_transformationP(strategy))) {
		if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
		    balanced_strategy_note_uninterestingness_explanation($STRATEGY_THROWS_AWAY_ALL_TRANSFORMATION, NIL, NIL, NIL, NIL);
		}
		return T;
	    } else if ((motivation == $TRANSFORMATION) && (NIL != inference_tactician.strategy_sets_aside_all_transformationP(strategy))) {
		if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
		    balanced_strategy_note_uninterestingness_explanation($STRATEGY_SETS_ASIDE_ALL_TRANSFORMATION, NIL, NIL, NIL, NIL);
		}
		return T;
	    }

	    if (NIL == problem_already_consideredP) {
		{
		    SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
		    if (NIL != balanced_strategy_chooses_to_set_aside_problemP(strategy, problem, motivation, NIL, thrown_away_already_consideredP)) {
			{
			    SubLObject subexplanation = balanced_strategy_last_uninterestingness_explanation();
			    if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
				balanced_strategy_note_uninterestingness_explanation($TACTIC_SET_ASIDE_BECAUSE_PROBLEM_SET_ASIDE, NIL, tactic, NIL, subexplanation);
			    }
			}
			return T;
		    }
		}
	    }
	    if (((motivation == $REMOVAL) && (NIL != inference_worker.logical_tactic_p(tactic))) && (NIL != balanced_strategy_chooses_to_set_aside_tactic_lookahead_problemP(strategy, tactic, motivation))) {
		{
		    SubLObject subexplanation = balanced_strategy_last_uninterestingness_explanation();
		    if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
			balanced_strategy_note_uninterestingness_explanation($TACTIC_SET_ASIDE_BECAUSE_LOOKAHEAD_PROBLEM_SET_ASIDE, NIL, tactic, NIL, subexplanation);
		    }
		}
		return T;
	    } else if ((((motivation == $REMOVAL) && (NIL == siblings_already_consideredP)) && (NIL != inference_worker_split.split_tactic_p(tactic))) && (NIL != balanced_strategy_chooses_to_set_aside_split_tactic_wrt_removalP(strategy, tactic))) {
		return T;
	    } else {
		return NIL;
	    }

	}
    }

    /**
     * The parts of set-aside reasoning that can be cached.
     * The comments before each clause in the pcond indicate the conditions when the cache for TACTIC should be cleared.
     */
    public static final SubLObject balanced_strategy_chooses_to_set_aside_tactic_cacheableP(SubLObject strategy, SubLObject tactic, SubLObject motivation, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP, SubLObject thrown_away_already_consideredP) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if ((NIL == thrown_away_already_consideredP) && (NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_set_aside_tacticP(strategy, tactic))) {
		if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
		    balanced_strategy_note_uninterestingness_explanation(inference_tactician_strategic_uninterestingness.why_simple_strategy_chooses_to_set_aside_tactic(strategy, tactic), NIL, NIL, NIL, NIL);
		}
		return T;
	    } else if (((motivation == $TRANSFORMATION) && (NIL != inference_worker.logical_tactic_p(tactic))) && (NIL == inference_worker.logical_tactic_transformation_allowed_wrt_max_transformation_depthP(inference_datastructures_strategy.strategy_inference(strategy), tactic))) {
		if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
		    balanced_strategy_note_uninterestingness_explanation($LOGICAL_TACTIC_EXCEEDS_MAX_TRANSFORMATION_DEPTH, NIL, tactic, NIL, NIL);
		}
		return T;
	    } else if (((motivation == $REMOVAL) && (NIL != inference_worker_join_ordered.join_ordered_tactic_p(tactic))) && (NIL != balanced_strategy_chooses_to_set_aside_join_ordered_tactic_due_to_conjunctive_removalP(strategy, tactic, UNPROVIDED))) {
		if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
		    balanced_strategy_note_uninterestingness_explanation($JOIN_ORDERED_TACTIC_LEADS_TO_SET_ASIDE_CONJUNCTIVE_REMOVALS, NIL, tactic, NIL, NIL);
		}
		return T;
	    }

	    return NIL;
	}
    }

    /**
     *
     *
     * @return booleanp; whether STRATEGY deems that TACTIC has already generated enough transformation
    tactics.  TACTIC must be a transformation tactic generator tactic, like TRANS-PREDICATE-POS.
     */
    public static final SubLObject balanced_strategy_transformation_tactic_generated_enoughP(SubLObject strategy, SubLObject tactic) {
	if (NIL != inference_worker_transformation.transformation_generator_tactic_p(tactic)) {
	    {
		SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
		if (NIL == inference_datastructures_inference.inference_allows_use_of_all_rulesP(inference)) {
		    {
			SubLObject allowed_rule_count = inference_datastructures_inference.inference_allowed_rule_count(inference);
			if (ZERO_INTEGER.eql(allowed_rule_count)) {
			    return T;
			}
			if (NIL != subl_promotions.positive_integer_p(allowed_rule_count)) {
			    {
				SubLObject count = ZERO_INTEGER;
				SubLObject all_allowed_rule_tactics_already_generatedP = NIL;
				SubLObject rest = NIL;
				for (rest = inference_datastructures_problem.problem_tactics(inference_datastructures_tactic.tactic_problem(tactic)); !((NIL != all_allowed_rule_tactics_already_generatedP) || (NIL == rest)); rest = rest.rest()) {
				    {
					SubLObject transformation_tactic = rest.first();
					if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(transformation_tactic, $TRANSFORMATION))
						&& (NIL != inference_datastructures_problem.do_problem_tactics_hl_module_match(transformation_tactic, inference_datastructures_tactic.tactic_hl_module(tactic)))) {
					    {
						SubLObject rule = inference_worker_transformation.transformation_tactic_rule(transformation_tactic);
						if (NIL != rule) {
						    if (NIL != inference_datastructures_inference.inference_allows_use_of_ruleP(inference, rule)) {
							count = add(count, ONE_INTEGER);
							if (count.numE(allowed_rule_count)) {
							    all_allowed_rule_tactics_already_generatedP = T;
							}
						    }
						}
					    }
					}
				    }
				}
				return all_allowed_rule_tactics_already_generatedP;
			    }
			}
		    }
		}
	    }
	}
	return NIL;
    }

    /**
     *
     *
     * @param PROBLEM-ALREADY-CONSIDERED?;
     * 		whether the caller has already considered that the supported problem of LINK
     * 		might be set aside wrt MOTIVATION.  If T, the analysis will not be redone.
     */
    public static final SubLObject balanced_strategy_chooses_to_set_aside_linkP(SubLObject strategy, SubLObject link, SubLObject motivation, SubLObject problem_already_consideredP, SubLObject thrown_away_already_consideredP) {
	if (problem_already_consideredP == UNPROVIDED) {
	    problem_already_consideredP = NIL;
	}
	if (thrown_away_already_consideredP == UNPROVIDED) {
	    thrown_away_already_consideredP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(motivation, BALANCED_STRATEGY_MOTIVATION_P);
	    if (NIL == problem_already_consideredP) {
		{
		    SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
		    if (NIL != balanced_strategy_chooses_to_set_aside_problemP(strategy, problem, motivation, T, thrown_away_already_consideredP)) {
			{
			    SubLObject subexplanation = balanced_strategy_last_uninterestingness_explanation();
			    if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
				balanced_strategy_note_uninterestingness_explanation($LINK_SUPPORTED_PROBLEM_SET_ASIDE, NIL, NIL, link, subexplanation);
			    }
			}
			return T;
		    }
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject balanced_strategy_chooses_to_ignore_problemP(SubLObject strategy, SubLObject problem, SubLObject motivation) {
	return list_utilities.sublisp_boolean(why_balanced_strategy_chooses_to_ignore_problem(strategy, problem, motivation));
    }

    /**
     *
     *
     * @return strategic-uninterestingness-reason-p
     */
    public static final SubLObject why_balanced_strategy_chooses_to_ignore_problem(SubLObject strategy, SubLObject problem, SubLObject motivation) {
	if (NIL != balanced_strategy_chooses_to_throw_away_problemP(strategy, problem, motivation, UNPROVIDED)) {
	    return $THROW_AWAY;
	} else if (NIL != balanced_strategy_chooses_to_set_aside_problemP(strategy, problem, motivation, T, T)) {
	    return $SET_ASIDE;
	} else if (NIL == inference_datastructures_problem.problem_relevant_to_strategyP(problem, strategy)) {
	    return $IRRELEVANT;
	} else {
	    return NIL;
	}

    }

    public static final SubLObject balanced_strategy_chooses_to_ignore_strategemP(SubLObject strategy, SubLObject strategem, SubLObject motivation) {
	return list_utilities.sublisp_boolean(why_balanced_strategy_chooses_to_ignore_strategem(strategy, strategem, motivation));
    }

    /**
     *
     *
     * @return strategic-uninterestingness-reason-p
     */
    public static final SubLObject why_balanced_strategy_chooses_to_ignore_strategem(SubLObject strategy, SubLObject strategem, SubLObject motivation) {
	if (NIL != inference_tactician.strategem_invalid_p(strategem)) {
	    return $INVALID;
	} else if ((NIL != inference_worker.content_tactic_p(strategem)) && (NIL != inference_datastructures_tactic.tactic_not_possibleP(strategem))) {
	    return $THROW_AWAY;
	} else if (NIL != balanced_strategy_chooses_to_throw_away_strategemP(strategy, strategem, motivation, UNPROVIDED)) {
	    return $THROW_AWAY;
	} else if (NIL != balanced_strategy_chooses_to_set_aside_strategemP(strategy, strategem, motivation, NIL, T)) {
	    return $SET_ASIDE;
	} else if (NIL == inference_datastructures_problem.problem_relevant_to_strategyP(inference_tactician.strategem_problem(strategem), strategy)) {
	    return $IRRELEVANT;
	} else {
	    return NIL;
	}

    }

    public static final SubLObject balanced_strategy_chooses_to_ignore_tacticP(SubLObject strategy, SubLObject tactic, SubLObject motivation) {
	return balanced_strategy_chooses_to_ignore_strategemP(strategy, tactic, motivation);
    }

    public static final SubLObject balanced_strategy_chooses_to_ignore_linkP(SubLObject strategy, SubLObject link, SubLObject motivation) {
	return balanced_strategy_chooses_to_ignore_strategemP(strategy, link, motivation);
    }

    public static final SubLObject balanced_strategy_chooses_to_throw_away_all_tactics_wrt_removalP(SubLObject strategy, SubLObject problem, SubLObject problem_already_consideredP) {
	if (problem_already_consideredP == UNPROVIDED) {
	    problem_already_consideredP = NIL;
	}
	return balanced_strategy_chooses_to_throw_away_all_tacticsP(strategy, problem, $REMOVAL, problem_already_consideredP);
    }

    public static final SubLObject balanced_strategy_chooses_to_throw_away_all_tacticsP(SubLObject strategy, SubLObject problem, SubLObject motivation, SubLObject problem_already_consideredP) {
	if (problem_already_consideredP == UNPROVIDED) {
	    problem_already_consideredP = NIL;
	}
	if (NIL == problem_already_consideredP) {
	    if (NIL != balanced_strategy_chooses_to_throw_away_problemP(strategy, problem, motivation, UNPROVIDED)) {
		return T;
	    }
	}
	{
	    SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
	    SubLObject tactic = NIL;
	    for (tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), tactic = cdolist_list_var.first()) {
		if (NIL == balanced_strategy_chooses_to_throw_away_tacticP(strategy, tactic, motivation, T, UNPROVIDED)) {
		    return NIL;
		}
	    }
	}
	return T;
    }

    public static final SubLObject balanced_strategy_chooses_to_set_aside_all_tacticsP(SubLObject strategy, SubLObject problem, SubLObject motivation, SubLObject problem_already_consideredP) {
	if (problem_already_consideredP == UNPROVIDED) {
	    problem_already_consideredP = NIL;
	}
	if (NIL == problem_already_consideredP) {
	    if (NIL != balanced_strategy_chooses_to_set_aside_problemP(strategy, problem, motivation, UNPROVIDED, UNPROVIDED)) {
		return T;
	    }
	}
	{
	    SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
	    SubLObject tactic = NIL;
	    for (tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), tactic = cdolist_list_var.first()) {
		if (NIL == balanced_strategy_chooses_to_set_aside_tacticP(strategy, tactic, motivation, T, UNPROVIDED, UNPROVIDED)) {
		    return NIL;
		}
	    }
	}
	return T;
    }

    public static final SubLObject balanced_strategy_chooses_to_set_aside_all_conjunctive_removal_tacticsP(SubLObject strategy, SubLObject problem, SubLObject problem_already_consideredP) {
	if (problem_already_consideredP == UNPROVIDED) {
	    problem_already_consideredP = NIL;
	}
	if (NIL == problem_already_consideredP) {
	    if (NIL != balanced_strategy_chooses_to_set_aside_problemP(strategy, problem, $REMOVAL, UNPROVIDED, UNPROVIDED)) {
		return T;
	    }
	}
	{
	    SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
	    SubLObject tactic = NIL;
	    for (tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), tactic = cdolist_list_var.first()) {
		if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, $REMOVAL_CONJUNCTIVE)) {
		    if (NIL == balanced_strategy_chooses_to_set_aside_tacticP(strategy, tactic, $REMOVAL, T, UNPROVIDED, UNPROVIDED)) {
			return NIL;
		    }
		}
	    }
	}
	return T;
    }

    public static final SubLObject balanced_strategy_chooses_to_set_aside_join_ordered_tactic_due_to_conjunctive_removalP(SubLObject strategy, SubLObject jo_tactic, SubLObject problem_already_consideredP) {
	if (problem_already_consideredP == UNPROVIDED) {
	    problem_already_consideredP = NIL;
	}
	{
	    SubLObject lookahead_problem = inference_worker_join_ordered.join_ordered_tactic_lookahead_problem(jo_tactic);
	    return makeBoolean(((NIL == inference_datastructures_problem.single_literal_problem_p(lookahead_problem)) && (NIL != inference_datastructures_problem.problem_has_tactic_of_typeP(lookahead_problem, $REMOVAL_CONJUNCTIVE)))
		    && (NIL != balanced_strategy_chooses_to_set_aside_all_conjunctive_removal_tacticsP(strategy, lookahead_problem, problem_already_consideredP)));
	}
    }

    public static final SubLObject balanced_strategy_chooses_to_throw_away_disjunctive_link_wrt_removalP(SubLObject strategy, SubLObject link) {
	{
	    SubLObject tactic = inference_worker.disjunctive_link_tactic(link);
	    if (NIL != balanced_strategy_chooses_to_throw_away_tacticP(strategy, tactic, $REMOVAL, UNPROVIDED, UNPROVIDED)) {
		return T;
	    }
	}
	return NIL;
    }

    public static final SubLObject balanced_strategy_chooses_to_set_aside_disjunctive_link_wrt_removalP(SubLObject strategy, SubLObject link) {
	{
	    SubLObject tactic = inference_worker.disjunctive_link_tactic(link);
	    if (NIL != balanced_strategy_chooses_to_set_aside_tacticP(strategy, tactic, $REMOVAL, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
		return T;
	    }
	}
	return NIL;
    }

    public static final SubLObject balanced_strategy_chooses_to_throw_away_connected_conjunction_link_wrt_removalP(SubLObject strategy, SubLObject link) {
	{
	    SubLObject tactic = inference_worker.connected_conjunction_link_tactic(link);
	    if (NIL != balanced_strategy_chooses_to_throw_away_tacticP(strategy, tactic, $REMOVAL, UNPROVIDED, UNPROVIDED)) {
		return T;
	    }
	}
	return NIL;
    }

    public static final SubLObject balanced_strategy_chooses_to_set_aside_connected_conjunction_link_wrt_removalP(SubLObject strategy, SubLObject link) {
	{
	    SubLObject tactic = inference_worker.connected_conjunction_link_tactic(link);
	    if (NIL != balanced_strategy_chooses_to_set_aside_tacticP(strategy, tactic, $REMOVAL, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
		return T;
	    }
	}
	return NIL;
    }

    public static final SubLObject balanced_strategy_chooses_to_totally_set_aside_tacticP(SubLObject strategy, SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP) {
	if (problem_already_consideredP == UNPROVIDED) {
	    problem_already_consideredP = NIL;
	}
	if (siblings_already_consideredP == UNPROVIDED) {
	    siblings_already_consideredP = NIL;
	}
	return makeBoolean((NIL != balanced_strategy_chooses_to_set_aside_tacticP(strategy, tactic, $REMOVAL, problem_already_consideredP, siblings_already_consideredP, UNPROVIDED))
		&& (NIL != balanced_strategy_chooses_to_set_aside_tacticP(strategy, tactic, $TRANSFORMATION, problem_already_consideredP, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject balanced_strategy_chooses_to_totally_throw_away_tacticP(SubLObject strategy, SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP) {
	if (problem_already_consideredP == UNPROVIDED) {
	    problem_already_consideredP = NIL;
	}
	if (siblings_already_consideredP == UNPROVIDED) {
	    siblings_already_consideredP = NIL;
	}
	return makeBoolean((NIL != balanced_strategy_chooses_to_throw_away_tacticP(strategy, tactic, $REMOVAL, problem_already_consideredP, siblings_already_consideredP))
		&& (NIL != balanced_strategy_chooses_to_throw_away_tacticP(strategy, tactic, $TRANSFORMATION, problem_already_consideredP, siblings_already_consideredP)));
    }

    public static final SubLObject balanced_strategy_chooses_to_totally_ignore_tacticP(SubLObject strategy, SubLObject tactic) {
	return makeBoolean((NIL != balanced_strategy_chooses_to_ignore_tacticP(strategy, tactic, $REMOVAL)) && (NIL != balanced_strategy_chooses_to_ignore_tacticP(strategy, tactic, $TRANSFORMATION)));
    }

    /**
     * Return T iff STRATEGY throws away all tactics involving the HL module of TACTIC wrt MOTIVATION.
     */
    public static final SubLObject balanced_strategy_chooses_to_throw_away_tactic_hl_module_wrt_motivationP(SubLObject strategy, SubLObject tactic, SubLObject motivation) {
	if ((motivation == $TRANSFORMATION) && (NIL != inference_worker_join.join_tactic_p(tactic))) {
	    return T;
	} else if ((motivation == $REMOVAL) && (NIL != inference_worker_transformation.transformation_tactic_p(tactic))) {
	    return T;
	} else {
	    return NIL;
	}

    }

    public static final SubLObject balanced_strategy_preferred_backchain_required_join_ordered_tactic_internal(SubLObject strategy, SubLObject problem) {
	{
	    SubLObject best_tactic = $UNDETERMINED;
	    SubLObject best_productivity = $POSITIVE_INFINITY;
	    SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
	    SubLObject tactic = NIL;
	    for (tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), tactic = cdolist_list_var.first()) {
		if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, $JOIN_ORDERED)) {
		    {
			SubLObject lookahead_problem = inference_worker.logical_tactic_lookahead_problem(tactic);
			if ((NIL != inference_trampolines.problem_backchain_requiredP(lookahead_problem)) && (NIL != inference_datastructures_problem.single_literal_problem_p(lookahead_problem))) {
			    {
				SubLObject productivity = balanced_strategy_total_transformation_productivity(strategy, lookahead_problem);
				if (NIL != inference_datastructures_enumerated_types.productivity_L(productivity, best_productivity)) {
				    best_tactic = tactic;
				    best_productivity = productivity;
				}
			    }
			}
		    }
		}
	    }
	    return values(best_tactic, best_productivity);
	}
    }

    public static final SubLObject balanced_strategy_preferred_backchain_required_join_ordered_tactic(SubLObject strategy, SubLObject problem) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
		    return balanced_strategy_preferred_backchain_required_join_ordered_tactic_internal(strategy, problem);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym66$BALANCED_STRATEGY_PREFERRED_BACKCHAIN_REQUIRED_JOIN_ORDERED_TACTI, UNPROVIDED);
		if (NIL == caching_state) {
		    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym66$BALANCED_STRATEGY_PREFERRED_BACKCHAIN_REQUIRED_JOIN_ORDERED_TACTI, TWO_INTEGER, NIL, EQ, UNPROVIDED);
		    memoization_state.memoization_state_put(v_memoization_state, $sym66$BALANCED_STRATEGY_PREFERRED_BACKCHAIN_REQUIRED_JOIN_ORDERED_TACTI, caching_state);
		}
		{
		    SubLObject sxhash = memoization_state.sxhash_calc_2(strategy, problem);
		    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		    if (collisions != $kw70$_MEMOIZED_ITEM_NOT_FOUND_) {
			{
			    SubLObject cdolist_list_var = collisions;
			    SubLObject collision = NIL;
			    for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
				{
				    SubLObject cached_args = collision.first();
				    SubLObject results2 = second(collision);
				    if (strategy == cached_args.first()) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && (problem == cached_args.first())) {
					    return memoization_state.caching_results(results2);
					}
				    }
				}
			    }
			}
		    }
		    {
			SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(balanced_strategy_preferred_backchain_required_join_ordered_tactic_internal(strategy, problem)));
			memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(strategy, problem));
			return memoization_state.caching_results(results);
		    }
		}
	    }
	}
    }

    /**
     * Returns the total estimated productivity of transforming PROBLEM in all possible ways.
     */
    public static final SubLObject balanced_strategy_total_transformation_productivity(SubLObject strategy, SubLObject problem) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject total_productivity = ZERO_INTEGER;
		SubLObject candidate_tactic_specs = NIL;
		SubLObject mt_var = inference_datastructures_problem.mt_asent_sense_from_single_literal_problem(problem);
		{
		    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
		    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
		    try {
			mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
			mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
			mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
			candidate_tactic_specs = inference_worker_transformation.single_literal_problem_candidate_transformation_tactic_specs(problem);
		    } finally {
			mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
			mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
		    }
		}
		{
		    SubLObject cdolist_list_var = candidate_tactic_specs;
		    SubLObject tactic_spec = NIL;
		    for (tactic_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), tactic_spec = cdolist_list_var.first()) {
			{
			    SubLObject datum = tactic_spec;
			    SubLObject current = datum;
			    SubLObject hl_module = NIL;
			    SubLObject productivity = NIL;
			    destructuring_bind_must_consp(current, datum, $list_alt71);
			    hl_module = current.first();
			    current = current.rest();
			    destructuring_bind_must_consp(current, datum, $list_alt71);
			    productivity = current.first();
			    current = current.rest();
			    if (NIL == current) {
				if (NIL == inference_tactician_strategic_uninterestingness.strategy_disallows_use_of_hl_module_on_problemP(strategy, hl_module, problem)) {
				    total_productivity = inference_datastructures_enumerated_types.productivity_X(total_productivity, productivity);
				}
			    } else {
				cdestructuring_bind_error(datum, $list_alt71);
			    }
			}
		    }
		}
		return total_productivity;
	    }
	}
    }

    /**
     *
     *
     * @return booleanp; whether PROBLEM has MOTIVATION according to STRATEGY,
    but is no longer active or set-aside.
     */
    public static final SubLObject balanced_strategy_problem_thrown_awayP(SubLObject strategy, SubLObject problem, SubLObject motivation) {
	SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
	SubLTrampolineFile.checkType(problem, PROBLEM_P);
	SubLTrampolineFile.checkType(motivation, BALANCED_STRATEGY_MOTIVATION_P);
	return makeBoolean((NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_pendingP(strategy, problem, motivation)) && (NIL == inference_balanced_tactician_datastructures.balanced_strategy_problem_set_asideP(strategy, problem, motivation)));
    }

    public static final SubLObject balanced_strategy_tactic_thrown_awayP(SubLObject strategy, SubLObject tactic, SubLObject motivation) {
	return inference_balanced_tactician_datastructures.balanced_strategy_strategem_thrown_awayP(strategy, tactic, motivation);
    }

    public static final SubLObject balanced_strategy_tactic_set_asideP(SubLObject strategy, SubLObject tactic, SubLObject motivation) {
	return inference_balanced_tactician_datastructures.balanced_strategy_strategem_set_asideP(strategy, tactic, motivation);
    }

    /**
     * Temporary control variable; should eventually stay T
     * Disable the code that gives tactics removal motivation when they possibly otherwise would not.
     */
    // defparameter
    private static final SubLSymbol $suppress_balanced_strategy_can_deem_tactics_harmless_wrt_removal_motivationP$ = makeSymbol("*SUPPRESS-BALANCED-STRATEGY-CAN-DEEM-TACTICS-HARMLESS-WRT-REMOVAL-MOTIVATION?*");

    /**
     *
     *
     * @return booleanp; whether STRATEGY deems it harmless to propagate removal motivation to TACTIC,
    even if it appears pointless to do so.  One such case is the 'law of R',
    which states that if TACTIC is a logical tactic whose lookahead problem(s) have R,
    then it can't hurt to give R to TACTIC.  This is occasionally necessary, in cases of massive
    problem reuse, to trigger the propagation of R to some argument* link via transformation
    and/or residual transformation.
     */
    public static final SubLObject balanced_strategy_deems_tactic_harmless_wrt_removal_motivationP(SubLObject strategy, SubLObject tactic) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != $suppress_balanced_strategy_can_deem_tactics_harmless_wrt_removal_motivationP$.getDynamicValue(thread)) {
		return NIL;
	    }
	    if ((NIL != inference_worker_join_ordered.join_ordered_tactic_p(tactic)) && (NIL != balanced_strategy_deems_link_harmless_wrt_removal_motivationP(strategy, inference_worker_join_ordered.join_ordered_tactic_link(tactic)))) {
		return T;
	    }
	    return NIL;
	}
    }

    /**
     *
     *
     * @return booleanp; whether STRATEGY deems it harmless to propagate removal motivation to LINK,
    even if it appears pointless to do so.  One such case is the 'law of R',
    which states that if LINK is a join-ordered link between two problems, both of which have R,
    then it can't hurt to give R to LINK.  This is occasionally necessary, in cases of massive
    problem reuse, to trigger the propagation of R to some argument* link via transformation
    and/or residual transformation.
     */
    public static final SubLObject balanced_strategy_deems_link_harmless_wrt_removal_motivationP(SubLObject strategy, SubLObject link) {
	return makeBoolean((NIL != inference_worker_join_ordered.join_ordered_link_p(link)) && (NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_motivated_wrt_removalP(strategy, inference_worker_join_ordered.join_ordered_link_focal_problem(link))));
    }

    public static final SubLObject balanced_strategy_chooses_to_throw_away_tactic_lookahead_problemP(SubLObject strategy, SubLObject logical_tactic, SubLObject motivation) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(motivation, BALANCED_STRATEGY_MOTIVATION_P);
	    if (NIL != inference_worker_join.join_tactic_p(logical_tactic)) {
		thread.resetMultipleValues();
		{
		    SubLObject first_problem = inference_worker_join.join_tactic_lookahead_problems(logical_tactic);
		    SubLObject second_problem = thread.secondMultipleValue();
		    thread.resetMultipleValues();
		    if ((NIL == first_problem) || (NIL == second_problem)) {
			return NIL;
		    } else if ((NIL != inference_datastructures_strategy.strategically_good_problem_p(first_problem, strategy)) || (NIL != inference_datastructures_strategy.strategically_good_problem_p(second_problem, strategy))) {
			return NIL;
		    } else if ((NIL != balanced_strategy_chooses_to_throw_away_lookahead_problemP(strategy, first_problem, motivation)) || (NIL != balanced_strategy_chooses_to_throw_away_lookahead_problemP(strategy, second_problem, motivation))) {
			return T;
		    }

		}
	    } else {
		{
		    SubLObject lookahead_problem = inference_worker.logical_tactic_lookahead_problem(logical_tactic);
		    if (NIL != inference_datastructures_strategy.strategically_good_problem_p(lookahead_problem, strategy)) {
			return NIL;
		    } else {
			if ((NIL != lookahead_problem) && (NIL != balanced_strategy_chooses_to_throw_away_lookahead_problemP(strategy, lookahead_problem, motivation))) {
			    return T;
			}
		    }
		}
	    }
	    if (motivation == $TRANSFORMATION) {
		{
		    SubLObject link = inference_worker.logical_tactic_link(logical_tactic);
		    if (NIL != balanced_strategy_chooses_to_throw_away_linkP(strategy, link, motivation, T)) {
			return T;
		    }
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject balanced_strategy_chooses_to_throw_away_lookahead_problemP(SubLObject strategy, SubLObject lookahead_problem, SubLObject motivation) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_answer = NIL;
		{
		    SubLObject _prev_bind_0 = $balanced_strategy_uses_already_thrown_away_cacheP$.currentBinding(thread);
		    try {
			$balanced_strategy_uses_already_thrown_away_cacheP$.bind(makeBoolean(((motivation == $REMOVAL) && (NIL != inference_datastructures_problem.single_literal_problem_p(lookahead_problem))) && (NIL != inference_datastructures_problem.closed_problem_p(lookahead_problem))), thread);
			v_answer = balanced_strategy_chooses_to_throw_away_problemP(strategy, lookahead_problem, motivation, UNPROVIDED);
		    } finally {
			$balanced_strategy_uses_already_thrown_away_cacheP$.rebind(_prev_bind_0, thread);
		    }
		}
		return v_answer;
	    }
	}
    }

    public static final SubLObject balanced_strategy_chooses_to_throw_away_split_tactic_wrt_removalP(SubLObject strategy, SubLObject split_tactic) {
	{
	    SubLObject tactic_var = split_tactic;
	    SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(inference_datastructures_tactic.tactic_problem(tactic_var));
	    SubLObject sibling_tactic = NIL;
	    for (sibling_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), sibling_tactic = cdolist_list_var.first()) {
		if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(sibling_tactic, $SPLIT)) {
		    if (sibling_tactic != tactic_var) {
			if (NIL != balanced_strategy_chooses_to_throw_away_sibling_split_tactic_wrt_removalP(strategy, split_tactic, sibling_tactic)) {
			    return T;
			}
			{
			    SubLObject lookahead_problem = inference_worker_split.split_tactic_lookahead_problem(sibling_tactic);
			    if ((((NIL != inference_worker.pending_problem_p(lookahead_problem, strategy)) && (NIL != inference_datastructures_problem.closed_problem_p(lookahead_problem))) && (NIL == inference_worker.good_problem_p(lookahead_problem, strategy)))
				    && (NIL == inference_worker.problem_has_some_open_obviously_neutral_argument_linkP(lookahead_problem, NIL, strategy, NIL))) {
				return T;
			    }
			}
		    }
		}
	    }
	}
	return NIL;
    }

    public static final SubLObject balanced_strategy_chooses_to_throw_away_sibling_split_tactic_wrt_removalP(SubLObject strategy, SubLObject split_tactic, SubLObject sibling_tactic) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject result = NIL;
		{
		    SubLObject _prev_bind_0 = inference_tactician.$set_aside_non_continuable_implies_throw_awayP$.currentBinding(thread);
		    try {
			inference_tactician.$set_aside_non_continuable_implies_throw_awayP$.bind(NIL, thread);
			if ((NIL == inference_balanced_tactician_datastructures.balanced_strategy_link_head_motivated_wrt_transformationP(strategy, sibling_tactic)) && (NIL != balanced_strategy_chooses_to_totally_throw_away_tacticP(strategy, sibling_tactic, T, T))) {
			    {
				SubLObject subexplanation = balanced_strategy_last_uninterestingness_explanation();
				if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
				    balanced_strategy_note_uninterestingness_explanation($SPLIT_TACTIC_THROWN_AWAY_BECAUSE_SIBLING_TACTIC_THROWN_AWAY, NIL, split_tactic, NIL, subexplanation);
				}
			    }
			    result = T;
			}
		    } finally {
			inference_tactician.$set_aside_non_continuable_implies_throw_awayP$.rebind(_prev_bind_0, thread);
		    }
		}
		return result;
	    }
	}
    }

    public static final SubLObject balanced_strategy_link_has_sibling_early_removal_linkP(SubLObject strategy, SubLObject link) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL == inference_balanced_tactician_motivation.balanced_strategy_early_removal_linkP(strategy, link)) {
		{
		    SubLObject link_var = link;
		    SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link_var);
		    SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(supported_problem);
		    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
		    SubLObject state = NIL;
		    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
			{
			    SubLObject sibling_link = set_contents.do_set_contents_next(basis_object, state);
			    if (NIL != set_contents.do_set_contents_element_validP(state, sibling_link)) {
				if (link_var != sibling_link) {
				    if (NIL != inference_balanced_tactician_motivation.balanced_strategy_early_removal_linkP(strategy, sibling_link)) {
					if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
					    balanced_strategy_note_uninterestingness_explanation($EARLY_REMOVAL_LINK, NIL, NIL, sibling_link, NIL);
					}
					return T;
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

    public static final SubLObject balanced_strategy_chooses_not_to_activate_any_strategems_on_problemP(SubLObject strategy, SubLObject problem, SubLObject motivation) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(motivation, BALANCED_STRATEGY_MOTIVATION_P);
	    {
		SubLObject resultP = NIL;
		{
		    SubLObject _prev_bind_0 = $balanced_strategy_gathering_uninterestingness_explanationsP$.currentBinding(thread);
		    try {
			$balanced_strategy_gathering_uninterestingness_explanationsP$.bind(NIL, thread);
			thread.resetMultipleValues();
			{
			    SubLObject strategems_to_activate = inference_balanced_tactician_motivation.balanced_strategy_categorize_strategems(strategy, problem, motivation);
			    SubLObject strategems_to_set_aside = thread.secondMultipleValue();
			    SubLObject strategems_to_throw_away = thread.thirdMultipleValue();
			    thread.resetMultipleValues();
			    resultP = sublisp_null(strategems_to_activate);
			}
		    } finally {
			$balanced_strategy_gathering_uninterestingness_explanationsP$.rebind(_prev_bind_0, thread);
		    }
		}
		return resultP;
	    }
	}
    }

    public static final SubLObject balanced_strategy_chooses_to_set_aside_tactic_lookahead_problemP(SubLObject strategy, SubLObject logical_tactic, SubLObject motivation) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != inference_worker_join.join_tactic_p(logical_tactic)) {
		thread.resetMultipleValues();
		{
		    SubLObject first_problem = inference_worker_join.join_tactic_lookahead_problems(logical_tactic);
		    SubLObject second_problem = thread.secondMultipleValue();
		    thread.resetMultipleValues();
		    if ((NIL == first_problem) || (NIL == second_problem)) {
			return NIL;
		    } else if ((NIL != inference_datastructures_strategy.strategically_good_problem_p(first_problem, strategy)) || (NIL != inference_datastructures_strategy.strategically_good_problem_p(second_problem, strategy))) {
			return NIL;
		    } else if ((NIL != balanced_strategy_chooses_to_set_aside_problemP(strategy, first_problem, motivation, UNPROVIDED, UNPROVIDED)) || (NIL != balanced_strategy_chooses_to_set_aside_problemP(strategy, second_problem, motivation, UNPROVIDED, UNPROVIDED))) {
			return T;
		    }

		}
	    } else {
		{
		    SubLObject lookahead_problem = inference_worker.logical_tactic_lookahead_problem(logical_tactic);
		    if (NIL != inference_datastructures_strategy.strategically_good_problem_p(lookahead_problem, strategy)) {
			return NIL;
		    } else {
			if (NIL != balanced_strategy_chooses_to_set_aside_problemP(strategy, lookahead_problem, motivation, UNPROVIDED, UNPROVIDED)) {
			    return T;
			}
		    }
		}
	    }
	    return NIL;
	}
    }

    /**
     * Temporary control parameter;
     * When non-nil, the set-aside policy for split tactics is weakened to be more conservative.
     */
    // defparameter
    public static final SubLSymbol $balanced_strategy_weaken_split_tactic_set_aside_policyP$ = makeSymbol("*BALANCED-STRATEGY-WEAKEN-SPLIT-TACTIC-SET-ASIDE-POLICY?*");

    public static final SubLObject balanced_strategy_chooses_to_set_aside_split_tactic_wrt_removalP(SubLObject strategy, SubLObject split_tactic) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != $balanced_strategy_weaken_split_tactic_set_aside_policyP$.getDynamicValue(thread)) {
		{
		    SubLObject tactic_var = split_tactic;
		    SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(inference_datastructures_tactic.tactic_problem(tactic_var));
		    SubLObject sibling_tactic = NIL;
		    for (sibling_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), sibling_tactic = cdolist_list_var.first()) {
			if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(sibling_tactic, $SPLIT)) {
			    if (sibling_tactic != tactic_var) {
				if ((NIL == inference_balanced_tactician_datastructures.balanced_strategy_link_head_motivated_wrt_transformationP(strategy, sibling_tactic)) && (NIL != balanced_strategy_chooses_to_totally_set_aside_tacticP(strategy, sibling_tactic, T, T))) {
				    {
					SubLObject subexplanation = balanced_strategy_last_uninterestingness_explanation();
					if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
					    balanced_strategy_note_uninterestingness_explanation($SPLIT_TACTIC_SET_ASIDE_BECAUSE_SIBLING_TACTIC_SET_ASIDE, NIL, split_tactic, NIL, subexplanation);
					}
				    }
				    return T;
				}
			    }
			}
		    }
		}
		return NIL;
	    }
	    {
		SubLObject tactic_var = split_tactic;
		SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(inference_datastructures_tactic.tactic_problem(tactic_var));
		SubLObject sibling_tactic = NIL;
		for (sibling_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), sibling_tactic = cdolist_list_var.first()) {
		    if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(sibling_tactic, $SPLIT)) {
			if (sibling_tactic != tactic_var) {
			    {
				SubLObject lookahead_problem = inference_worker_split.split_tactic_lookahead_problem(sibling_tactic);
				if (NIL == inference_balanced_tactician_datastructures.balanced_strategy_link_head_motivated_wrt_transformationP(strategy, sibling_tactic)) {
				    if ((NIL != balanced_strategy_chooses_to_throw_away_tacticP(strategy, sibling_tactic, $REMOVAL, T, T)) || ((NIL != inference_worker.finished_problem_p(lookahead_problem, strategy)) && (NIL == inference_worker.good_problem_p(lookahead_problem, strategy)))) {
					{
					    SubLObject subexplanation = balanced_strategy_last_uninterestingness_explanation();
					    if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
						balanced_strategy_note_uninterestingness_explanation($SPLIT_TACTIC_SET_ASIDE_BECAUSE_SIBLING_TACTIC_THROWN_AWAY, NIL, split_tactic, NIL, subexplanation);
					    }
					}
					return T;
				    } else if (NIL != balanced_strategy_chooses_to_totally_set_aside_tacticP(strategy, sibling_tactic, T, T)) {
					{
					    SubLObject subexplanation = balanced_strategy_last_uninterestingness_explanation();
					    if (NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
						balanced_strategy_note_uninterestingness_explanation($SPLIT_TACTIC_SET_ASIDE_BECAUSE_SIBLING_TACTIC_SET_ASIDE, NIL, split_tactic, NIL, subexplanation);
					    }
					}
					return T;
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
     * STRATEGY should throw away META-REMOVAL-TACTIC if it has a sibling tactic that is tactically possible but disallowed by STRATEGY,
     * because then the intended completeness of META-REMOVAL-TACTIC is inapplicable.
     */
    public static final SubLObject balanced_strategy_chooses_to_throw_away_meta_removal_tactic_wrt_removalP(SubLObject strategy, SubLObject meta_removal_tactic) {
	if (NIL != inference_worker_removal.meta_removal_tactic_p(meta_removal_tactic)) {
	    {
		SubLObject sibling_disallowed_tacticP = NIL;
		SubLObject rest = NIL;
		for (rest = inference_datastructures_problem.problem_tactics(inference_datastructures_tactic.tactic_problem(meta_removal_tactic)); !((NIL != sibling_disallowed_tacticP) || (NIL == rest)); rest = rest.rest()) {
		    {
			SubLObject removal_tactic = rest.first();
			if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(removal_tactic, $GENERALIZED_REMOVAL)) && (NIL != inference_datastructures_problem.do_problem_tactics_status_match(removal_tactic, $POSSIBLE))) {
			    if (removal_tactic != meta_removal_tactic) {
				if (NIL == inference_datastructures_inference.inference_allows_use_of_moduleP(inference_datastructures_strategy.strategy_inference(strategy), inference_datastructures_tactic.tactic_hl_module(removal_tactic))) {
				    sibling_disallowed_tacticP = T;
				}
			    }
			}
		    }
		}
		return sibling_disallowed_tacticP;
	    }
	}
	return NIL;
    }

    public static final SubLObject balanced_strategy_throw_away_uninteresting_set_asides(SubLObject strategy) {
	{
	    SubLObject total_thrown_away_count = ZERO_INTEGER;
	    SubLObject thrown_away_count = balanced_strategy_throw_away_uninteresting_set_asides_int(strategy);
	    total_thrown_away_count = add(total_thrown_away_count, thrown_away_count);
	    while (thrown_away_count.isPositive()) {
		thrown_away_count = balanced_strategy_throw_away_uninteresting_set_asides_int(strategy);
		total_thrown_away_count = add(total_thrown_away_count, thrown_away_count);
	    }
	    return total_thrown_away_count;
	}
    }

    public static final SubLObject balanced_strategy_throw_away_uninteresting_set_asides_int(SubLObject strategy) {
	{
	    SubLObject set_aside_problems = balanced_strategy_set_aside_problems_to_reconsider(strategy);
	    inference_datastructures_strategy.strategy_clear_set_asides(strategy);
	    {
		SubLObject thrown_away_count = ZERO_INTEGER;
		SubLObject cdolist_list_var = set_aside_problems;
		SubLObject set_aside_problem = NIL;
		for (set_aside_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), set_aside_problem = cdolist_list_var.first()) {
		    if (NIL != balanced_strategy_chooses_to_leave_problem_set_asideP(strategy, set_aside_problem)) {
			inference_tactician.strategy_make_problem_set_aside(strategy, set_aside_problem);
		    } else {
			thrown_away_count = add(thrown_away_count, ONE_INTEGER);
		    }
		}
		return thrown_away_count;
	    }
	}
    }

    public static final SubLObject balanced_strategy_chooses_to_leave_problem_set_asideP(SubLObject strategy, SubLObject set_aside_problem) {
	return makeBoolean(($SET_ASIDE == why_balanced_strategy_chooses_to_ignore_problem(strategy, set_aside_problem, $REMOVAL)) || ($SET_ASIDE == why_balanced_strategy_chooses_to_ignore_problem(strategy, set_aside_problem, $TRANSFORMATION)));
    }

    public static final SubLObject balanced_strategy_reconsider_set_asides(SubLObject strategy) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    inference_balanced_tactician_datastructures.balanced_strategy_clear_set_aside_problems(strategy);
	    {
		SubLObject reactivated_count = ZERO_INTEGER;
		{
		    SubLObject _prev_bind_0 = inference_worker.$reconsidering_set_asidesP$.currentBinding(thread);
		    try {
			inference_worker.$reconsidering_set_asidesP$.bind(T, thread);
			inference_datastructures_strategy.clear_strategy_should_reconsider_set_asides(strategy);
			{
			    SubLObject set_aside_problems = inference_datastructures_strategy.strategy_all_valid_set_aside_problems(strategy);
			    inference_datastructures_strategy.strategy_clear_set_asides(strategy);
			    {
				SubLObject set_aside_problems_in_order = Sort.sort(set_aside_problems, symbol_function($sym80$_), symbol_function(PROBLEM_SUID));
				SubLObject cdolist_list_var = set_aside_problems_in_order;
				SubLObject set_aside_problem = NIL;
				for (set_aside_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), set_aside_problem = cdolist_list_var.first()) {
				    if (NIL != balanced_strategy_reconsider_one_set_aside(strategy, set_aside_problem)) {
					reactivated_count = add(reactivated_count, ONE_INTEGER);
				    }
				}
			    }
			}
		    } finally {
			inference_worker.$reconsidering_set_asidesP$.rebind(_prev_bind_0, thread);
		    }
		}
		return reactivated_count;
	    }
	}
    }

    public static final SubLObject balanced_strategy_set_aside_problems_to_reconsider(SubLObject strategy) {
	return inference_datastructures_strategy.strategy_all_valid_set_aside_problems(strategy);
    }

    public static final SubLObject balanced_strategy_reconsider_one_set_aside(SubLObject strategy, SubLObject problem) {
	inference_tactician.possibly_clear_strategic_status_wrt(problem, strategy);
	return inference_worker.possibly_reactivate_problem(strategy, problem);
    }

    public static final SubLObject declare_inference_balanced_tactician_strategic_uninterestingness_file() {
	declareFunction("balanced_strategy_last_uninterestingness_explanation", "BALANCED-STRATEGY-LAST-UNINTERESTINGNESS-EXPLANATION", 0, 0, false);
	declareMacro("with_balanced_strategy_uninterestingness_explanations", "WITH-BALANCED-STRATEGY-UNINTERESTINGNESS-EXPLANATIONS");
	declareFunction("balanced_strategy_note_uninterestingness_explanation", "BALANCED-STRATEGY-NOTE-UNINTERESTINGNESS-EXPLANATION", 5, 0, false);
	declareMacro("balanced_strategy_possibly_note_uninterestingness_explanation", "BALANCED-STRATEGY-POSSIBLY-NOTE-UNINTERESTINGNESS-EXPLANATION");
	declareFunction("balanced_strategy_uninterestingness_explanation_string", "BALANCED-STRATEGY-UNINTERESTINGNESS-EXPLANATION-STRING", 1, 0, false);
	declareFunction("balanced_strategy_uninterestingness_explanation_type_p", "BALANCED-STRATEGY-UNINTERESTINGNESS-EXPLANATION-TYPE-P", 1, 0, false);
	declareFunction("balanced_strategy_uninterestingness_explanation_p", "BALANCED-STRATEGY-UNINTERESTINGNESS-EXPLANATION-P", 1, 0, false);
	declareFunction("balanced_strategy_uninterestingness_subexplanation_p", "BALANCED-STRATEGY-UNINTERESTINGNESS-SUBEXPLANATION-P", 1, 0, false);
	declareFunction("make_balanced_strategy_uninterestingness_explanation", "MAKE-BALANCED-STRATEGY-UNINTERESTINGNESS-EXPLANATION", 1, 4, false);
	declareFunction("balanced_strategy_uninterestingness_explanation_type", "BALANCED-STRATEGY-UNINTERESTINGNESS-EXPLANATION-TYPE", 1, 0, false);
	declareFunction("balanced_strategy_set_aside_non_continuable_implies_throw_away_tacticP", "BALANCED-STRATEGY-SET-ASIDE-NON-CONTINUABLE-IMPLIES-THROW-AWAY-TACTIC?", 2, 0, false);
	declareFunction("balanced_strategy_set_aside_non_continuable_implies_throw_away_problemP", "BALANCED-STRATEGY-SET-ASIDE-NON-CONTINUABLE-IMPLIES-THROW-AWAY-PROBLEM?", 2, 0, false);
	declareFunction("balanced_strategy_why_problem_already_thrown_awayP", "BALANCED-STRATEGY-WHY-PROBLEM-ALREADY-THROWN-AWAY?", 3, 0, false);
	declareFunction("rederive_why_balanced_strategy_chooses_to_throw_away_problemP", "REDERIVE-WHY-BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM?", 3, 0, false);
	declareFunction("balanced_strategy_chooses_to_throw_away_problemP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM?", 3, 1, false);
	declareFunction("balanced_strategy_chooses_to_throw_away_problem_uncacheableP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM-UNCACHEABLE?", 4, 0, false);
	declareFunction("balanced_strategy_chooses_to_throw_away_problem_cacheableP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM-CACHEABLE?", 4, 0, false);
	declareFunction("balanced_strategy_chooses_to_throw_away_strategemP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-STRATEGEM?", 3, 1, false);
	declareFunction("balanced_strategy_chooses_to_throw_away_tacticP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC?", 3, 2, false);
	declareFunction("balanced_strategy_chooses_to_throw_away_tactic_uncacheableP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-UNCACHEABLE?", 5, 0, false);
	declareFunction("balanced_strategy_chooses_to_throw_away_tactic_cacheableP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-CACHEABLE?", 5, 0, false);
	declareFunction("balanced_strategy_chooses_to_throw_away_tactic_with_sibling_simplification_tacticP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-WITH-SIBLING-SIMPLIFICATION-TACTIC?", 1, 0, false);
	declareFunction("balanced_strategy_chooses_to_throw_away_linkP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-LINK?", 3, 1, false);
	declareFunction("why_balanced_strategy_chooses_to_ignore_new_root", "WHY-BALANCED-STRATEGY-CHOOSES-TO-IGNORE-NEW-ROOT", 2, 0, false);
	declareFunction("balanced_strategy_chooses_to_throw_away_new_rootP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-NEW-ROOT?", 2, 0, false);
	declareFunction("balanced_strategy_default_chooses_to_throw_away_new_rootP", "BALANCED-STRATEGY-DEFAULT-CHOOSES-TO-THROW-AWAY-NEW-ROOT?", 2, 0, false);
	declareFunction("balanced_strategy_chooses_to_set_aside_problemP", "BALANCED-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM?", 3, 2, false);
	declareFunction("balanced_strategy_chooses_to_set_aside_problem_uncacheableP", "BALANCED-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM-UNCACHEABLE?", 5, 0, false);
	declareFunction("balanced_strategy_chooses_to_set_aside_problem_cacheableP", "BALANCED-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM-CACHEABLE?", 5, 0, false);
	declareFunction("balanced_strategy_chooses_to_set_aside_strategemP", "BALANCED-STRATEGY-CHOOSES-TO-SET-ASIDE-STRATEGEM?", 3, 2, false);
	declareFunction("balanced_strategy_chooses_to_set_aside_tacticP", "BALANCED-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC?", 3, 3, false);
	declareFunction("balanced_strategy_chooses_to_set_aside_tactic_uncacheableP", "BALANCED-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC-UNCACHEABLE?", 6, 0, false);
	declareFunction("balanced_strategy_chooses_to_set_aside_tactic_cacheableP", "BALANCED-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC-CACHEABLE?", 6, 0, false);
	declareFunction("balanced_strategy_transformation_tactic_generated_enoughP", "BALANCED-STRATEGY-TRANSFORMATION-TACTIC-GENERATED-ENOUGH?", 2, 0, false);
	declareFunction("balanced_strategy_chooses_to_set_aside_linkP", "BALANCED-STRATEGY-CHOOSES-TO-SET-ASIDE-LINK?", 3, 2, false);
	declareFunction("balanced_strategy_chooses_to_ignore_problemP", "BALANCED-STRATEGY-CHOOSES-TO-IGNORE-PROBLEM?", 3, 0, false);
	declareFunction("why_balanced_strategy_chooses_to_ignore_problem", "WHY-BALANCED-STRATEGY-CHOOSES-TO-IGNORE-PROBLEM", 3, 0, false);
	declareFunction("balanced_strategy_chooses_to_ignore_strategemP", "BALANCED-STRATEGY-CHOOSES-TO-IGNORE-STRATEGEM?", 3, 0, false);
	declareFunction("why_balanced_strategy_chooses_to_ignore_strategem", "WHY-BALANCED-STRATEGY-CHOOSES-TO-IGNORE-STRATEGEM", 3, 0, false);
	declareFunction("balanced_strategy_chooses_to_ignore_tacticP", "BALANCED-STRATEGY-CHOOSES-TO-IGNORE-TACTIC?", 3, 0, false);
	declareFunction("balanced_strategy_chooses_to_ignore_linkP", "BALANCED-STRATEGY-CHOOSES-TO-IGNORE-LINK?", 3, 0, false);
	declareFunction("balanced_strategy_chooses_to_throw_away_all_tactics_wrt_removalP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-ALL-TACTICS-WRT-REMOVAL?", 2, 1, false);
	declareFunction("balanced_strategy_chooses_to_throw_away_all_tacticsP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-ALL-TACTICS?", 3, 1, false);
	declareFunction("balanced_strategy_chooses_to_set_aside_all_tacticsP", "BALANCED-STRATEGY-CHOOSES-TO-SET-ASIDE-ALL-TACTICS?", 3, 1, false);
	declareFunction("balanced_strategy_chooses_to_set_aside_all_conjunctive_removal_tacticsP", "BALANCED-STRATEGY-CHOOSES-TO-SET-ASIDE-ALL-CONJUNCTIVE-REMOVAL-TACTICS?", 2, 1, false);
	declareFunction("balanced_strategy_chooses_to_set_aside_join_ordered_tactic_due_to_conjunctive_removalP", "BALANCED-STRATEGY-CHOOSES-TO-SET-ASIDE-JOIN-ORDERED-TACTIC-DUE-TO-CONJUNCTIVE-REMOVAL?", 2, 1, false);
	declareFunction("balanced_strategy_chooses_to_throw_away_disjunctive_link_wrt_removalP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-DISJUNCTIVE-LINK-WRT-REMOVAL?", 2, 0, false);
	declareFunction("balanced_strategy_chooses_to_set_aside_disjunctive_link_wrt_removalP", "BALANCED-STRATEGY-CHOOSES-TO-SET-ASIDE-DISJUNCTIVE-LINK-WRT-REMOVAL?", 2, 0, false);
	declareFunction("balanced_strategy_chooses_to_throw_away_connected_conjunction_link_wrt_removalP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-CONNECTED-CONJUNCTION-LINK-WRT-REMOVAL?", 2, 0, false);
	declareFunction("balanced_strategy_chooses_to_set_aside_connected_conjunction_link_wrt_removalP", "BALANCED-STRATEGY-CHOOSES-TO-SET-ASIDE-CONNECTED-CONJUNCTION-LINK-WRT-REMOVAL?", 2, 0, false);
	declareFunction("balanced_strategy_chooses_to_totally_set_aside_tacticP", "BALANCED-STRATEGY-CHOOSES-TO-TOTALLY-SET-ASIDE-TACTIC?", 2, 2, false);
	declareFunction("balanced_strategy_chooses_to_totally_throw_away_tacticP", "BALANCED-STRATEGY-CHOOSES-TO-TOTALLY-THROW-AWAY-TACTIC?", 2, 2, false);
	declareFunction("balanced_strategy_chooses_to_totally_ignore_tacticP", "BALANCED-STRATEGY-CHOOSES-TO-TOTALLY-IGNORE-TACTIC?", 2, 0, false);
	declareFunction("balanced_strategy_chooses_to_throw_away_tactic_hl_module_wrt_motivationP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-HL-MODULE-WRT-MOTIVATION?", 3, 0, false);
	declareFunction("balanced_strategy_preferred_backchain_required_join_ordered_tactic_internal", "BALANCED-STRATEGY-PREFERRED-BACKCHAIN-REQUIRED-JOIN-ORDERED-TACTIC-INTERNAL", 2, 0, false);
	declareFunction("balanced_strategy_preferred_backchain_required_join_ordered_tactic", "BALANCED-STRATEGY-PREFERRED-BACKCHAIN-REQUIRED-JOIN-ORDERED-TACTIC", 2, 0, false);
	declareFunction("balanced_strategy_total_transformation_productivity", "BALANCED-STRATEGY-TOTAL-TRANSFORMATION-PRODUCTIVITY", 2, 0, false);
	declareFunction("balanced_strategy_problem_thrown_awayP", "BALANCED-STRATEGY-PROBLEM-THROWN-AWAY?", 3, 0, false);
	declareFunction("balanced_strategy_tactic_thrown_awayP", "BALANCED-STRATEGY-TACTIC-THROWN-AWAY?", 3, 0, false);
	declareFunction("balanced_strategy_tactic_set_asideP", "BALANCED-STRATEGY-TACTIC-SET-ASIDE?", 3, 0, false);
	declareFunction("balanced_strategy_deems_tactic_harmless_wrt_removal_motivationP", "BALANCED-STRATEGY-DEEMS-TACTIC-HARMLESS-WRT-REMOVAL-MOTIVATION?", 2, 0, false);
	declareFunction("balanced_strategy_deems_link_harmless_wrt_removal_motivationP", "BALANCED-STRATEGY-DEEMS-LINK-HARMLESS-WRT-REMOVAL-MOTIVATION?", 2, 0, false);
	declareFunction("balanced_strategy_chooses_to_throw_away_tactic_lookahead_problemP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-LOOKAHEAD-PROBLEM?", 3, 0, false);
	declareFunction("balanced_strategy_chooses_to_throw_away_lookahead_problemP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-LOOKAHEAD-PROBLEM?", 3, 0, false);
	declareFunction("balanced_strategy_chooses_to_throw_away_split_tactic_wrt_removalP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-SPLIT-TACTIC-WRT-REMOVAL?", 2, 0, false);
	declareFunction("balanced_strategy_chooses_to_throw_away_sibling_split_tactic_wrt_removalP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-SIBLING-SPLIT-TACTIC-WRT-REMOVAL?", 3, 0, false);
	declareFunction("balanced_strategy_link_has_sibling_early_removal_linkP", "BALANCED-STRATEGY-LINK-HAS-SIBLING-EARLY-REMOVAL-LINK?", 2, 0, false);
	declareFunction("balanced_strategy_chooses_not_to_activate_any_strategems_on_problemP", "BALANCED-STRATEGY-CHOOSES-NOT-TO-ACTIVATE-ANY-STRATEGEMS-ON-PROBLEM?", 3, 0, false);
	declareFunction("balanced_strategy_chooses_to_set_aside_tactic_lookahead_problemP", "BALANCED-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC-LOOKAHEAD-PROBLEM?", 3, 0, false);
	declareFunction("balanced_strategy_chooses_to_set_aside_split_tactic_wrt_removalP", "BALANCED-STRATEGY-CHOOSES-TO-SET-ASIDE-SPLIT-TACTIC-WRT-REMOVAL?", 2, 0, false);
	declareFunction("balanced_strategy_chooses_to_throw_away_meta_removal_tactic_wrt_removalP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-META-REMOVAL-TACTIC-WRT-REMOVAL?", 2, 0, false);
	declareFunction("balanced_strategy_throw_away_uninteresting_set_asides", "BALANCED-STRATEGY-THROW-AWAY-UNINTERESTING-SET-ASIDES", 1, 0, false);
	declareFunction("balanced_strategy_throw_away_uninteresting_set_asides_int", "BALANCED-STRATEGY-THROW-AWAY-UNINTERESTING-SET-ASIDES-INT", 1, 0, false);
	declareFunction("balanced_strategy_chooses_to_leave_problem_set_asideP", "BALANCED-STRATEGY-CHOOSES-TO-LEAVE-PROBLEM-SET-ASIDE?", 2, 0, false);
	declareFunction("balanced_strategy_reconsider_set_asides", "BALANCED-STRATEGY-RECONSIDER-SET-ASIDES", 1, 0, false);
	declareFunction("balanced_strategy_set_aside_problems_to_reconsider", "BALANCED-STRATEGY-SET-ASIDE-PROBLEMS-TO-RECONSIDER", 1, 0, false);
	declareFunction("balanced_strategy_reconsider_one_set_aside", "BALANCED-STRATEGY-RECONSIDER-ONE-SET-ASIDE", 2, 0, false);
	return NIL;
    }

    public static final SubLObject init_inference_balanced_tactician_strategic_uninterestingness_file() {
	defparameter("*BALANCED-STRATEGY-UNINTERESTINGNESS-EXPLANATION*", NIL);
	deflexical("*THE-UNKNOWN-BALANCED-STRATEGY-UNINTERESTINGNESS-EXPLANATION*", $list_alt0);
	defparameter("*BALANCED-STRATEGY-GATHERING-UNINTERESTINGNESS-EXPLANATIONS?*", NIL);
	deflexical("*BALANCED-STRATEGY-UNINTERESTINGNESS-EXPLANATION-TABLE*", $list_alt15);
	defparameter("*BALANCED-STRATEGY-USES-ALREADY-THROWN-AWAY-CACHE?*", T);
	defvar("*BALANCED-STRATEGY-THROW-AWAY-PROBLEM-WITH-ABDUCED-TERM-WRT-TRANSFORMATION?*", T);
	defparameter("*SUPPRESS-BALANCED-STRATEGY-CAN-DEEM-TACTICS-HARMLESS-WRT-REMOVAL-MOTIVATION?*", T);
	defparameter("*BALANCED-STRATEGY-WEAKEN-SPLIT-TACTIC-SET-ASIDE-POLICY?*", NIL);
	return NIL;
    }

    public static final SubLObject setup_inference_balanced_tactician_strategic_uninterestingness_file() {
	access_macros.register_macro_helper(BALANCED_STRATEGY_NOTE_UNINTERESTINGNESS_EXPLANATION, BALANCED_STRATEGY_POSSIBLY_NOTE_UNINTERESTINGNESS_EXPLANATION);
	memoization_state.note_memoized_function($sym66$BALANCED_STRATEGY_PREFERRED_BACKCHAIN_REQUIRED_JOIN_ORDERED_TACTI);
	return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(makeKeyword("UNKNOWN-REASON"), NIL, NIL, NIL, NIL);

    static private final SubLList $list_alt2 = list(list(makeSymbol("*BALANCED-STRATEGY-GATHERING-UNINTERESTINGNESS-EXPLANATIONS?*"), T));

    private static final SubLSymbol BALANCED_STRATEGY_NOTE_UNINTERESTINGNESS_EXPLANATION = makeSymbol("BALANCED-STRATEGY-NOTE-UNINTERESTINGNESS-EXPLANATION");

    private static final SubLSymbol BALANCED_STRATEGY_POSSIBLY_NOTE_UNINTERESTINGNESS_EXPLANATION = makeSymbol("BALANCED-STRATEGY-POSSIBLY-NOTE-UNINTERESTINGNESS-EXPLANATION");

    private static final SubLSymbol BALANCED_STRATEGY_UNINTERESTINGNESS_EXPLANATION_P = makeSymbol("BALANCED-STRATEGY-UNINTERESTINGNESS-EXPLANATION-P");

    static private final SubLList $list_alt6 = list(makeSymbol("EXPLANATION-TYPE"), list(makeSymbol("&KEY"), makeSymbol("PROBLEM"), makeSymbol("TACTIC"), makeSymbol("LINK"), makeSymbol("SUBEXPLANATION")));

    static private final SubLList $list_alt7 = list(makeKeyword("PROBLEM"), makeKeyword("TACTIC"), $LINK, makeKeyword("SUBEXPLANATION"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLSymbol $sym14$_BALANCED_STRATEGY_GATHERING_UNINTERESTINGNESS_EXPLANATIONS__ = makeSymbol("*BALANCED-STRATEGY-GATHERING-UNINTERESTINGNESS-EXPLANATIONS?*");

    static private final SubLList $list_alt15 = list(new SubLObject[] { list(makeKeyword("STRATEGY-THROWS-AWAY-ALL-TRANSFORMATION"), makeString(":strategy does not permit transformation at all")),
	    list(makeKeyword("STRATEGY-SETS-ASIDE-ALL-TRANSFORMATION"), makeString(":strategy does not permit transformation with the current resource constraints")), list(makeKeyword("PROBLEM-ALREADY-THROWN-AWAY"), makeString(":problem was already noted to be pending")),
	    list(makeKeyword("PROBLEM-HAS-NO-TRANSFORMATION-TACTICS"), makeString(":problem has no transformation tactics")), list(makeKeyword("PROBLEM-STRATEGY-NOT-CONTINUABLE"), makeString(":strategy is not continuable, and :problem was set aside because :subexplanation")),
	    list(makeKeyword("PROBLEM-HAS-NO-MORE-ACTIVE-REMOVAL-STRATEGEMS"), makeString(":problem has deactivated all its active removal strategems")),
	    list(makeKeyword("PROBLEM-HAS-NO-MORE-ACTIVE-TRANSFORMATION-STRATEGEMS"), makeString(":problem has deactivated all its active transformation strategems")),
	    list(makeKeyword("PROBLEM-HAS-NO-ACTIVATIBLE-REMOVAL-STRATEGEMS"), makeString("when determining removal strategems for :problem, :strategy found none it wished to activate")),
	    list(makeKeyword("PROBLEM-HAS-NO-ACTIVATIBLE-TRANSFORMATION-STRATEGEMS"), makeString("when determining transformation strategems for :problem, :strategy found none it wished to activate")),
	    list(makeKeyword("PROBLEM-HAS-NON-ABDUCIBLE-RULE-TRANSFORMATION-LINK"), makeString("rules associated with tranformation links for :problem were #$NonAbducibleRule so :strategy discarded the abduction strategm")),
	    list(makeKeyword("DONT-DO-ABDUCTION-ON-GOOD-PROBLEM"), makeString("problem :problem already deemed good so :strategy discarded the abduction strategm")),
	    list(makeKeyword("DONT-TRANSFORM-ON-PROBLEM-WITH-ABDUCED-TERM"), makeString("problem :problem has an abduced term so :strategy discarded problem wrt transformation")), list(makeKeyword("ALL-TACTICS-THROWN-AWAY"), makeString("all of :problem's tactics are thrown away")),
	    list(makeKeyword("NEW-ROOT-PENDING-WRT-MOTIVATION"), makeString(":problem has already propagated both R and T")), list(makeKeyword("PROBLEM-ALREADY-SET-ASIDE"), makeString(":problem was already noted to be set aside")),
	    list(makeKeyword("ALL-TACTICS-SET-ASIDE"), makeString("all of :problem's tactics are set aside")), list(makeKeyword("TACTIC-ALREADY-THROWN-AWAY"), makeString(":tactic was already noted to be finished")),
	    list(makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-PROBLEM-THROWN-AWAY"), makeString(":tactic is thrown away because :subexplanation")), list(makeKeyword("TACTIC-HL-MODULE-THROWN-AWAY"), makeString(":tactic uses module :tactic-hl-module, which is always thrown away")),
	    list(makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-LOOKAHEAD-PROBLEM-THROWN-AWAY"), makeString("executing :tactic would motivate a problem that is thrown away because :subexplanation")),
	    list(makeKeyword("SPLIT-TACTIC-THROWN-AWAY-BECAUSE-SIBLING-TACTIC-THROWN-AWAY"), makeString(":tactic has a sibling split tactic that is thrown away because :subexplanation")),
	    list(makeKeyword("TACTIC-STRATEGY-NOT-CONTINUABLE"), makeString(":strategy is not continuable, and :tactic was set aside because :subexplanation")),
	    list(makeKeyword("META-REMOVAL-TACTIC-THROWN-AWAY"), makeString(":tactic is a meta-removal tactic, and some other tactically possible tactics on the problem are strategically disallowed")),
	    list(makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-COMPLETE-SIBLING-CONJUNCTIVE-REMOVAL"), makeString(":tactic has a sibling conjunctive removal tactic that is complete")),
	    list(makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-SIBLING-BACKCHAIN-REQUIRED"), makeString(":tactic has a sibling join-ordered tactic that focuses on a backchain required problem")),
	    list(makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-SIBLING-IS-A-SIMPLIFICATION"), makeString(":tactic has a sibling tactic that is a simplification")), list(makeKeyword("TACTIC-ALREADY-SET-ASIDE"), makeString(":tactic was already noted to be set aside")),
	    list(makeKeyword("TACTIC-SET-ASIDE-BECAUSE-PROBLEM-SET-ASIDE"), makeString(":tactic is set aside because :subexplanation")), list(makeKeyword("TACTIC-GENERATED-ENOUGH"), makeString(":tactic has already generated enough transformation tactics")),
	    list(makeKeyword("TACTIC-SET-ASIDE-BECAUSE-LOOKAHEAD-PROBLEM-SET-ASIDE"), makeString("executing :tactic would motivate a problem that is set aside because :subexplanation")),
	    list(makeKeyword("SPLIT-TACTIC-SET-ASIDE-BECAUSE-SIBLING-TACTIC-THROWN-AWAY"), makeString(":tactic has a sibling split tactic that is thrown away because :subexplanation")),
	    list(makeKeyword("SPLIT-TACTIC-SET-ASIDE-BECAUSE-SIBLING-TACTIC-SET-ASIDE"), makeString(":tactic has a sibling split tactic that is set aside wrt both removal and transformation, because :subexplanation")),
	    list(makeKeyword("LOGICAL-TACTIC-EXCEEDS-MAX-TRANSFORMATION-DEPTH"), makeString(":tactic leads past the :max-transformation-depth")),
	    list(makeKeyword("JOIN-ORDERED-TACTIC-LEADS-TO-SET-ASIDE-CONJUNCTIVE-REMOVALS"), makeString(":tactic leads to a conjunctive focal problem where all conjunctive removals are set aside")),
	    list(makeKeyword("LINK-SUPPORTED-PROBLEM-THROWN-AWAY"), makeString(":link's supported problem is thrown away because :subexplanation")), list(makeKeyword("SIBLING-EARLY-REMOVAL-LINK"), makeString(":link has a sibling link :subexplanation")),
	    list(makeKeyword("EARLY-REMOVAL-LINK"), makeString(":link, which is an early removal link")), list(makeKeyword("LINK-RULE-DISALLOWED"), makeString(":link uses a disallowed rule")),
	    list(makeKeyword("LINK-SUPPORTED-PROBLEM-SET-ASIDE"), makeString(":link's supported problem is set aside because :subexplanation")), list(makeKeyword("LINK-EXCEEDS-MAX-TRANSFORMATION-DEPTH"), makeString(":link leads past the :max-transformation-depth")),
	    list(makeKeyword("UNKNOWN-REASON"), makeString("for an unknown reason")) });

    static private final SubLList $list_alt16 = list(makeSymbol("TYPE"), makeSymbol("PROBLEM"), makeSymbol("TACTIC"), makeSymbol("LINK"), makeSymbol("SUBEXPLANATION"));

    private static final SubLSymbol BALANCED_STRATEGY_UNINTERESTINGNESS_EXPLANATION_TYPE_P = makeSymbol("BALANCED-STRATEGY-UNINTERESTINGNESS-EXPLANATION-TYPE-P");

    private static final SubLSymbol BALANCED_STRATEGY_MOTIVATION_P = makeSymbol("BALANCED-STRATEGY-MOTIVATION-P");

    private static final SubLSymbol $PROBLEM_HAS_NO_ACTIVATIBLE_REMOVAL_STRATEGEMS = makeKeyword("PROBLEM-HAS-NO-ACTIVATIBLE-REMOVAL-STRATEGEMS");

    private static final SubLSymbol $PROBLEM_HAS_NO_ACTIVATIBLE_TRANSFORMATION_STRATEGEMS = makeKeyword("PROBLEM-HAS-NO-ACTIVATIBLE-TRANSFORMATION-STRATEGEMS");

    private static final SubLSymbol $PROBLEM_ALREADY_THROWN_AWAY = makeKeyword("PROBLEM-ALREADY-THROWN-AWAY");

    private static final SubLSymbol $STRATEGY_THROWS_AWAY_ALL_TRANSFORMATION = makeKeyword("STRATEGY-THROWS-AWAY-ALL-TRANSFORMATION");

    private static final SubLSymbol $ALL_TACTICS_THROWN_AWAY = makeKeyword("ALL-TACTICS-THROWN-AWAY");

    private static final SubLSymbol $PROBLEM_STRATEGY_NOT_CONTINUABLE = makeKeyword("PROBLEM-STRATEGY-NOT-CONTINUABLE");

    private static final SubLSymbol $PROBLEM_HAS_NO_TRANSFORMATION_TACTICS = makeKeyword("PROBLEM-HAS-NO-TRANSFORMATION-TACTICS");

    private static final SubLSymbol ABDUCED_TERM_P = makeSymbol("ABDUCED-TERM-P");

    private static final SubLSymbol $DONT_TRANSFORM_ON_PROBLEM_WITH_ABDUCED_TERM = makeKeyword("DONT-TRANSFORM-ON-PROBLEM-WITH-ABDUCED-TERM");

    private static final SubLSymbol $TACTIC_ALREADY_THROWN_AWAY = makeKeyword("TACTIC-ALREADY-THROWN-AWAY");

    private static final SubLSymbol $TACTIC_HL_MODULE_THROWN_AWAY = makeKeyword("TACTIC-HL-MODULE-THROWN-AWAY");

    private static final SubLSymbol $META_REMOVAL_TACTIC_THROWN_AWAY = makeKeyword("META-REMOVAL-TACTIC-THROWN-AWAY");

    private static final SubLSymbol $TACTIC_THROWN_AWAY_BECAUSE_PROBLEM_THROWN_AWAY = makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-PROBLEM-THROWN-AWAY");

    static private final SubLString $$$tactic_is_impossible = makeString("tactic is impossible");

    private static final SubLSymbol $TACTIC_THROWN_AWAY_BECAUSE_LOOKAHEAD_PROBLEM_THROWN_AWAY = makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-LOOKAHEAD-PROBLEM-THROWN-AWAY");

    private static final SubLSymbol $TACTIC_GENERATED_ENOUGH = makeKeyword("TACTIC-GENERATED-ENOUGH");

    private static final SubLSymbol $TACTIC_STRATEGY_NOT_CONTINUABLE = makeKeyword("TACTIC-STRATEGY-NOT-CONTINUABLE");

    private static final SubLSymbol $DONT_DO_ABDUCTION_ON_GOOD_PROBLEM = makeKeyword("DONT-DO-ABDUCTION-ON-GOOD-PROBLEM");

    private static final SubLSymbol $PROBLEM_HAS_NON_ABDUCIBLE_RULE_TRANSFORMATION_LINK = makeKeyword("PROBLEM-HAS-NON-ABDUCIBLE-RULE-TRANSFORMATION-LINK");

    private static final SubLSymbol $TACTIC_THROWN_AWAY_BECAUSE_COMPLETE_SIBLING_CONJUNCTIVE_REMOVAL = makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-COMPLETE-SIBLING-CONJUNCTIVE-REMOVAL");

    static private final SubLString $$$tactic_is_disallowed = makeString("tactic is disallowed");

    private static final SubLSymbol $TACTIC_THROWN_AWAY_BECAUSE_SIBLING_BACKCHAIN_REQUIRED = makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-SIBLING-BACKCHAIN-REQUIRED");

    private static final SubLSymbol $TACTIC_THROWN_AWAY_BECAUSE_SIBLING_IS_A_SIMPLIFICATION = makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-SIBLING-IS-A-SIMPLIFICATION");

    private static final SubLSymbol $LINK_SUPPORTED_PROBLEM_THROWN_AWAY = makeKeyword("LINK-SUPPORTED-PROBLEM-THROWN-AWAY");

    private static final SubLSymbol $SIBLING_EARLY_REMOVAL_LINK = makeKeyword("SIBLING-EARLY-REMOVAL-LINK");

    private static final SubLSymbol $LINK_RULE_DISALLOWED = makeKeyword("LINK-RULE-DISALLOWED");

    private static final SubLSymbol $THROW_AWAY_NEW_ROOT = makeKeyword("THROW-AWAY-NEW-ROOT");

    private static final SubLSymbol $NEW_ROOT_PENDING_WRT_MOTIVATION = makeKeyword("NEW-ROOT-PENDING-WRT-MOTIVATION");

    private static final SubLSymbol $PROBLEM_ALREADY_SET_ASIDE = makeKeyword("PROBLEM-ALREADY-SET-ASIDE");

    private static final SubLSymbol $STRATEGY_SETS_ASIDE_ALL_TRANSFORMATION = makeKeyword("STRATEGY-SETS-ASIDE-ALL-TRANSFORMATION");

    private static final SubLSymbol $ALL_TACTICS_SET_ASIDE = makeKeyword("ALL-TACTICS-SET-ASIDE");

    private static final SubLSymbol $TACTIC_ALREADY_SET_ASIDE = makeKeyword("TACTIC-ALREADY-SET-ASIDE");

    private static final SubLSymbol $TACTIC_SET_ASIDE_BECAUSE_PROBLEM_SET_ASIDE = makeKeyword("TACTIC-SET-ASIDE-BECAUSE-PROBLEM-SET-ASIDE");

    private static final SubLSymbol $TACTIC_SET_ASIDE_BECAUSE_LOOKAHEAD_PROBLEM_SET_ASIDE = makeKeyword("TACTIC-SET-ASIDE-BECAUSE-LOOKAHEAD-PROBLEM-SET-ASIDE");

    private static final SubLSymbol $LOGICAL_TACTIC_EXCEEDS_MAX_TRANSFORMATION_DEPTH = makeKeyword("LOGICAL-TACTIC-EXCEEDS-MAX-TRANSFORMATION-DEPTH");

    private static final SubLSymbol $JOIN_ORDERED_TACTIC_LEADS_TO_SET_ASIDE_CONJUNCTIVE_REMOVALS = makeKeyword("JOIN-ORDERED-TACTIC-LEADS-TO-SET-ASIDE-CONJUNCTIVE-REMOVALS");

    private static final SubLSymbol $LINK_SUPPORTED_PROBLEM_SET_ASIDE = makeKeyword("LINK-SUPPORTED-PROBLEM-SET-ASIDE");

    static private final SubLSymbol $sym66$BALANCED_STRATEGY_PREFERRED_BACKCHAIN_REQUIRED_JOIN_ORDERED_TACTI = makeSymbol("BALANCED-STRATEGY-PREFERRED-BACKCHAIN-REQUIRED-JOIN-ORDERED-TACTIC");

    public static final SubLSymbol $kw70$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt71 = list(makeSymbol("HL-MODULE"), makeSymbol("PRODUCTIVITY"));

    private static final SubLSymbol BALANCED_STRATEGY_P = makeSymbol("BALANCED-STRATEGY-P");

    private static final SubLSymbol $SPLIT_TACTIC_THROWN_AWAY_BECAUSE_SIBLING_TACTIC_THROWN_AWAY = makeKeyword("SPLIT-TACTIC-THROWN-AWAY-BECAUSE-SIBLING-TACTIC-THROWN-AWAY");

    private static final SubLSymbol $EARLY_REMOVAL_LINK = makeKeyword("EARLY-REMOVAL-LINK");

    private static final SubLSymbol $SPLIT_TACTIC_SET_ASIDE_BECAUSE_SIBLING_TACTIC_SET_ASIDE = makeKeyword("SPLIT-TACTIC-SET-ASIDE-BECAUSE-SIBLING-TACTIC-SET-ASIDE");

    private static final SubLSymbol $SPLIT_TACTIC_SET_ASIDE_BECAUSE_SIBLING_TACTIC_THROWN_AWAY = makeKeyword("SPLIT-TACTIC-SET-ASIDE-BECAUSE-SIBLING-TACTIC-THROWN-AWAY");

    static private final SubLSymbol $sym80$_ = makeSymbol("<");

    // // Initializers
    @Override
    public void declareFunctions() {
	declare_inference_balanced_tactician_strategic_uninterestingness_file();
    }

    @Override
    public void initializeVariables() {
	init_inference_balanced_tactician_strategic_uninterestingness_file();
    }

    @Override
    public void runTopLevelForms() {
	setup_inference_balanced_tactician_strategic_uninterestingness_file();
    }
}
