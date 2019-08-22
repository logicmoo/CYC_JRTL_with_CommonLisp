package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.booleanp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class transformation_tactician_uninterestingness extends SubLTranslatedFile {
    public static final SubLFile me = new transformation_tactician_uninterestingness();

    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.transformation_tactician_uninterestingness";

    public static final String myFingerPrint = "33d602d0e9b7dad1617054a855cb0971dbcb3a1693d6a647eef51c54124e2543";

    // defparameter
    // Definitions
    /**
     * Bound to NIL when trying to rederive the reason that something was put in the
     * cache.
     */
    private static final SubLSymbol $transformation_strategy_uses_already_thrown_away_cacheP$ = makeSymbol("*TRANSFORMATION-STRATEGY-USES-ALREADY-THROWN-AWAY-CACHE?*");

    // defvar
    private static final SubLSymbol $transformation_strategy_throw_away_problem_with_abduced_termP$ = makeSymbol("*TRANSFORMATION-STRATEGY-THROW-AWAY-PROBLEM-WITH-ABDUCED-TERM?*");

    private static final SubLSymbol $PROBLEM_HAS_NO_ACTIVATIBLE_TRANSFORMATION_STRATEGEMS = makeKeyword("PROBLEM-HAS-NO-ACTIVATIBLE-TRANSFORMATION-STRATEGEMS");

    private static final SubLSymbol $PROBLEM_ALREADY_THROWN_AWAY = makeKeyword("PROBLEM-ALREADY-THROWN-AWAY");

    private static final SubLSymbol $STRATEGY_THROWS_AWAY_ALL_TRANSFORMATION = makeKeyword("STRATEGY-THROWS-AWAY-ALL-TRANSFORMATION");

    private static final SubLSymbol $ALL_TACTICS_THROWN_AWAY = makeKeyword("ALL-TACTICS-THROWN-AWAY");

    private static final SubLSymbol $PROBLEM_STRATEGY_NOT_CONTINUABLE = makeKeyword("PROBLEM-STRATEGY-NOT-CONTINUABLE");

    private static final SubLSymbol $PROBLEM_HAS_NO_TRANSFORMATION_TACTICS = makeKeyword("PROBLEM-HAS-NO-TRANSFORMATION-TACTICS");

    public static final SubLSymbol ABDUCED_TERM_P = makeSymbol("ABDUCED-TERM-P");

    private static final SubLSymbol $DONT_TRANSFORM_ON_PROBLEM_WITH_ABDUCED_TERM = makeKeyword("DONT-TRANSFORM-ON-PROBLEM-WITH-ABDUCED-TERM");

    private static final SubLSymbol $TACTIC_ALREADY_THROWN_AWAY = makeKeyword("TACTIC-ALREADY-THROWN-AWAY");

    private static final SubLSymbol $TACTIC_HL_MODULE_THROWN_AWAY = makeKeyword("TACTIC-HL-MODULE-THROWN-AWAY");

    private static final SubLSymbol $STRATEGY_DOES_NOT_ADMIT_TACTIC_WRT_PROOF_SPEC = makeKeyword("STRATEGY-DOES-NOT-ADMIT-TACTIC-WRT-PROOF-SPEC");

    private static final SubLSymbol $TACTIC_THROWN_AWAY_BECAUSE_PROBLEM_THROWN_AWAY = makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-PROBLEM-THROWN-AWAY");

    private static final SubLSymbol $TACTIC_THROWN_AWAY_BECAUSE_LOOKAHEAD_PROBLEM_THROWN_AWAY = makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-LOOKAHEAD-PROBLEM-THROWN-AWAY");

    private static final SubLSymbol $TACTIC_GENERATED_ENOUGH = makeKeyword("TACTIC-GENERATED-ENOUGH");

    private static final SubLSymbol $TACTIC_STRATEGY_NOT_CONTINUABLE = makeKeyword("TACTIC-STRATEGY-NOT-CONTINUABLE");

    private static final SubLSymbol $GENERALIZED_REMOVAL_TACTIC = makeKeyword("GENERALIZED-REMOVAL-TACTIC");

    private static final SubLSymbol $SIMPLE_STRATEGY_CHOOSES_TO_THROW_AWAY_TACTIC = makeKeyword("SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC");

    private static final SubLSymbol $TACTIC_THROWN_AWAY_BECAUSE_SIBLING_BACKCHAIN_REQUIRED = makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-SIBLING-BACKCHAIN-REQUIRED");

    private static final SubLSymbol $TACTIC_THROWN_AWAY_BECAUSE_SIBLING_IS_A_SIMPLIFICATION = makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-SIBLING-IS-A-SIMPLIFICATION");

    private static final SubLSymbol $LINK_SUPPORTED_PROBLEM_THROWN_AWAY = makeKeyword("LINK-SUPPORTED-PROBLEM-THROWN-AWAY");

    private static final SubLSymbol $LINK_RULE_DISALLOWED = makeKeyword("LINK-RULE-DISALLOWED");

    private static final SubLSymbol $PROBLEM_ALREADY_SET_ASIDE = makeKeyword("PROBLEM-ALREADY-SET-ASIDE");

    private static final SubLSymbol $STRATEGY_SETS_ASIDE_ALL_TRANSFORMATION = makeKeyword("STRATEGY-SETS-ASIDE-ALL-TRANSFORMATION");

    private static final SubLSymbol $ALL_TACTICS_SET_ASIDE = makeKeyword("ALL-TACTICS-SET-ASIDE");

    private static final SubLSymbol $TACTIC_ALREADY_SET_ASIDE = makeKeyword("TACTIC-ALREADY-SET-ASIDE");

    private static final SubLSymbol $TACTIC_SET_ASIDE_BECAUSE_PROBLEM_SET_ASIDE = makeKeyword("TACTIC-SET-ASIDE-BECAUSE-PROBLEM-SET-ASIDE");

    private static final SubLSymbol $LOGICAL_TACTIC_EXCEEDS_MAX_TRANSFORMATION_DEPTH = makeKeyword("LOGICAL-TACTIC-EXCEEDS-MAX-TRANSFORMATION-DEPTH");



    private static final SubLSymbol $LINK_SUPPORTED_PROBLEM_SET_ASIDE = makeKeyword("LINK-SUPPORTED-PROBLEM-SET-ASIDE");









    private static final SubLSymbol $sym33$TRANSFORMATION_STRATEGY_PREFERRED_BACKCHAIN_REQUIRED_JOIN_ORDERED = makeSymbol("TRANSFORMATION-STRATEGY-PREFERRED-BACKCHAIN-REQUIRED-JOIN-ORDERED-TACTIC");









    private static final SubLList $list38 = list(makeSymbol("HL-MODULE"), makeSymbol("PRODUCTIVITY"));

    private static final SubLSymbol TRANSFORMATION_STRATEGY_P = makeSymbol("TRANSFORMATION-STRATEGY-P");



    private static final SubLSymbol $sym41$_ = makeSymbol("<");



    public static SubLObject transformation_strategy_set_aside_non_continuable_implies_throw_away_tacticP(final SubLObject tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return inference_tactician.$set_aside_non_continuable_implies_throw_away_for_transformationP$.getDynamicValue(thread);
    }

    public static SubLObject transformation_strategy_set_aside_non_continuable_implies_throw_away_problemP(final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return inference_tactician.$set_aside_non_continuable_implies_throw_away_for_transformationP$.getDynamicValue(thread);
    }

    public static SubLObject transformation_strategy_why_problem_already_thrown_awayP(final SubLObject strategy, final SubLObject problem) {
        if (NIL != rederive_why_transformation_strategy_chooses_to_throw_away_problemP(strategy, problem)) {
            final SubLObject explanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
            return inference_tactician_strategic_uninterestingness.strategy_uninterestingness_explanation_type(explanation);
        }
        if (NIL != transformation_strategy_chooses_not_to_activate_any_strategems_on_problemP(strategy, problem)) {
            return $PROBLEM_HAS_NO_ACTIVATIBLE_TRANSFORMATION_STRATEGEMS;
        }
        return $PROBLEM_ALREADY_THROWN_AWAY;
    }

    public static SubLObject rederive_why_transformation_strategy_chooses_to_throw_away_problemP(final SubLObject strategy, final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject throw_awayP = NIL;
        final SubLObject _prev_bind_0 = $transformation_strategy_uses_already_thrown_away_cacheP$.currentBinding(thread);
        try {
            $transformation_strategy_uses_already_thrown_away_cacheP$.bind(NIL, thread);
            throw_awayP = transformation_strategy_chooses_to_throw_away_problemP(strategy, problem, UNPROVIDED);
        } finally {
            $transformation_strategy_uses_already_thrown_away_cacheP$.rebind(_prev_bind_0, thread);
        }
        return throw_awayP;
    }

    public static SubLObject transformation_strategy_chooses_to_throw_away_problemP(final SubLObject strategy, final SubLObject problem, SubLObject consider_all_tacticsP) {
        if (consider_all_tacticsP == UNPROVIDED) {
            consider_all_tacticsP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != transformation_strategy_chooses_to_throw_away_problem_uncacheableP(strategy, problem, consider_all_tacticsP)) {
            return T;
        }
        final SubLObject throw_away = inference_datastructures_strategy.problem_thrown_away_cache_status(problem, strategy, UNPROVIDED);
        if (NIL != booleanp(throw_away)) {
            return throw_away;
        }
        final SubLObject throw_awayP = transformation_strategy_chooses_to_throw_away_problem_cacheableP(strategy, problem, consider_all_tacticsP);
        if (NIL != throw_awayP) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($PROBLEM_ALREADY_THROWN_AWAY, problem, NIL, NIL, NIL);
            }
            inference_datastructures_strategy.set_problem_thrown_away(problem, strategy, UNPROVIDED);
        } else {
            inference_datastructures_strategy.set_problem_not_thrown_away(problem, strategy, UNPROVIDED);
        }
        return throw_awayP;
    }

    public static SubLObject transformation_strategy_chooses_to_throw_away_problem_uncacheableP(final SubLObject strategy, final SubLObject problem, final SubLObject consider_all_tacticsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != inference_tactician.strategy_throws_away_all_transformationP(strategy)) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($STRATEGY_THROWS_AWAY_ALL_TRANSFORMATION, NIL, NIL, NIL, NIL);
            }
            return T;
        }
        if ((NIL != $transformation_strategy_uses_already_thrown_away_cacheP$.getDynamicValue(thread)) && (NIL != transformation_strategy_problem_thrown_awayP(strategy, problem))) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation(transformation_strategy_why_problem_already_thrown_awayP(strategy, problem), problem, NIL, NIL, NIL);
            }
            return T;
        }
        if ((NIL != consider_all_tacticsP) && (NIL != transformation_strategy_chooses_to_throw_away_all_tacticsP(strategy, problem, T))) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($ALL_TACTICS_THROWN_AWAY, problem, NIL, NIL, NIL);
            }
            return T;
        }
        if (((NIL != transformation_strategy_set_aside_non_continuable_implies_throw_away_problemP(problem)) && (NIL == inference_datastructures_strategy.strategy_continuableP(strategy))) && (NIL != transformation_strategy_chooses_to_set_aside_problemP(strategy, problem, T, T))) {
            final SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($PROBLEM_STRATEGY_NOT_CONTINUABLE, problem, NIL, NIL, subexplanation);
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject transformation_strategy_chooses_to_throw_away_problem_cacheableP(final SubLObject strategy, final SubLObject problem, final SubLObject consider_all_tacticsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_throw_away_problemP(strategy, problem)) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation(inference_tactician_strategic_uninterestingness.why_simple_strategy_chooses_to_throw_away_problem(strategy, problem), NIL, NIL, NIL, NIL);
            }
            return T;
        }
        if ((NIL != inference_datastructures_problem.single_literal_problem_p(problem)) && (NIL == inference_datastructures_problem.problem_has_transformation_tacticsP(problem))) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($PROBLEM_HAS_NO_TRANSFORMATION_TACTICS, problem, NIL, NIL, NIL);
            }
            return T;
        }
        if (((NIL != $transformation_strategy_throw_away_problem_with_abduced_termP$.getDynamicValue(thread)) && (NIL != abductive_tactician.abductive_strategy_p(strategy))) && (NIL != cycl_utilities.expression_find_if(symbol_function(ABDUCED_TERM_P), inference_datastructures_problem.problem_query(problem), UNPROVIDED, UNPROVIDED))) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($DONT_TRANSFORM_ON_PROBLEM_WITH_ABDUCED_TERM, problem, NIL, NIL, NIL);
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject transformation_strategy_chooses_to_throw_away_strategemP(final SubLObject strategy, final SubLObject strategem, SubLObject problem_already_consideredP) {
        if (problem_already_consideredP == UNPROVIDED) {
            problem_already_consideredP = NIL;
        }
        if (NIL != inference_datastructures_tactic.tactic_p(strategem)) {
            return transformation_strategy_chooses_to_throw_away_tacticP(strategy, strategem, problem_already_consideredP, UNPROVIDED);
        }
        return transformation_strategy_chooses_to_throw_away_linkP(strategy, strategem, problem_already_consideredP);
    }

    public static SubLObject transformation_strategy_chooses_to_throw_away_tacticP(final SubLObject strategy, final SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP) {
        if (problem_already_consideredP == UNPROVIDED) {
            problem_already_consideredP = NIL;
        }
        if (siblings_already_consideredP == UNPROVIDED) {
            siblings_already_consideredP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject throw_awayP = NIL;
        throw_awayP = transformation_strategy_chooses_to_throw_away_tactic_uncacheableP(strategy, tactic, problem_already_consideredP, siblings_already_consideredP);
        if (NIL == throw_awayP) {
            final SubLObject throw_away = inference_datastructures_strategy.tactic_thrown_away_cache_status(tactic, strategy, UNPROVIDED);
            if (NIL != booleanp(throw_away)) {
                return throw_away;
            }
            if (NIL == throw_awayP) {
                throw_awayP = transformation_strategy_chooses_to_throw_away_tactic_cacheableP(strategy, tactic, problem_already_consideredP, siblings_already_consideredP);
                if (NIL != throw_awayP) {
                    if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                        inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($TACTIC_ALREADY_THROWN_AWAY, NIL, tactic, NIL, NIL);
                    }
                    inference_datastructures_strategy.set_tactic_thrown_away(tactic, strategy, UNPROVIDED);
                } else {
                    inference_datastructures_strategy.set_tactic_not_thrown_away(tactic, strategy, UNPROVIDED);
                }
            }
        }
        return throw_awayP;
    }

    public static SubLObject transformation_strategy_chooses_to_throw_away_tactic_uncacheableP(final SubLObject strategy, final SubLObject tactic, final SubLObject problem_already_consideredP, final SubLObject siblings_already_consideredP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $transformation_strategy_uses_already_thrown_away_cacheP$.getDynamicValue(thread)) && (NIL != transformation_strategy_tactic_thrown_awayP(strategy, tactic))) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($TACTIC_ALREADY_THROWN_AWAY, NIL, tactic, NIL, NIL);
            }
            return $TACTIC_ALREADY_THROWN_AWAY;
        }
        if (NIL != inference_tactician.strategy_throws_away_all_transformationP(strategy)) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($STRATEGY_THROWS_AWAY_ALL_TRANSFORMATION, NIL, NIL, NIL, NIL);
            }
            return $STRATEGY_THROWS_AWAY_ALL_TRANSFORMATION;
        }
        if (NIL != transformation_strategy_chooses_to_throw_away_tactic_hl_moduleP(strategy, tactic)) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($TACTIC_HL_MODULE_THROWN_AWAY, NIL, tactic, NIL, NIL);
            }
            return $TACTIC_HL_MODULE_THROWN_AWAY;
        }
        if (NIL == inference_tactician_strategic_uninterestingness.strategy_admits_tactic_wrt_proof_specP(strategy, tactic)) {
            return $STRATEGY_DOES_NOT_ADMIT_TACTIC_WRT_PROOF_SPEC;
        }
        if (NIL == problem_already_consideredP) {
            final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
            if (NIL != transformation_strategy_chooses_to_throw_away_problemP(strategy, problem, NIL)) {
                final SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
                if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                    inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($TACTIC_THROWN_AWAY_BECAUSE_PROBLEM_THROWN_AWAY, NIL, tactic, NIL, subexplanation);
                }
                return $TACTIC_THROWN_AWAY_BECAUSE_PROBLEM_THROWN_AWAY;
            }
        }
        if ((NIL != inference_worker.logical_tactic_p(tactic)) && (NIL != transformation_strategy_chooses_to_throw_away_tactic_lookahead_problemP(strategy, tactic))) {
            final SubLObject subexplanation2 = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($TACTIC_THROWN_AWAY_BECAUSE_LOOKAHEAD_PROBLEM_THROWN_AWAY, NIL, tactic, NIL, subexplanation2);
            }
            return $TACTIC_THROWN_AWAY_BECAUSE_LOOKAHEAD_PROBLEM_THROWN_AWAY;
        }
        if (NIL != transformation_strategy_transformation_tactic_generated_enoughP(strategy, tactic)) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($TACTIC_GENERATED_ENOUGH, NIL, tactic, NIL, NIL);
            }
            return $TACTIC_GENERATED_ENOUGH;
        }
        if (((NIL != transformation_strategy_set_aside_non_continuable_implies_throw_away_tacticP(tactic)) && (NIL == inference_datastructures_strategy.strategy_continuableP(strategy))) && (NIL != transformation_strategy_chooses_to_set_aside_tacticP(strategy, tactic, T, NIL, T))) {
            final SubLObject subexplanation2 = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($TACTIC_STRATEGY_NOT_CONTINUABLE, NIL, tactic, NIL, subexplanation2);
            }
            return $TACTIC_STRATEGY_NOT_CONTINUABLE;
        }
        return NIL;
    }

    public static SubLObject transformation_strategy_chooses_to_throw_away_tactic_cacheableP(final SubLObject strategy, final SubLObject tactic, final SubLObject problem_already_consideredP, final SubLObject siblings_already_consideredP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != inference_worker_removal.generalized_removal_tactic_p(tactic)) {
            return $GENERALIZED_REMOVAL_TACTIC;
        }
        if (NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_throw_away_tacticP(strategy, tactic)) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation(inference_tactician_strategic_uninterestingness.why_simple_strategy_chooses_to_throw_away_tactic(strategy, tactic), NIL, NIL, NIL, NIL);
            }
            return $SIMPLE_STRATEGY_CHOOSES_TO_THROW_AWAY_TACTIC;
        }
        if (((NIL != inference_worker_join_ordered.join_ordered_tactic_p(tactic)) && (NIL != inference_datastructures_problem.problem_backchain_requiredP(inference_datastructures_tactic.tactic_problem(tactic)))) && (!tactic.eql(transformation_strategy_preferred_backchain_required_join_ordered_tactic(strategy, inference_datastructures_tactic.tactic_problem(tactic))))) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($TACTIC_THROWN_AWAY_BECAUSE_SIBLING_BACKCHAIN_REQUIRED, NIL, tactic, NIL, NIL);
            }
            return $TACTIC_THROWN_AWAY_BECAUSE_SIBLING_BACKCHAIN_REQUIRED;
        }
        if (((NIL != inference_worker_restriction.$simplification_tactics_execute_early_and_pass_down_transformation_motivationP$.getDynamicValue(thread)) && (NIL != inference_worker.connected_conjunction_tactic_p(tactic))) && (NIL != transformation_strategy_chooses_to_throw_away_tactic_with_sibling_simplification_tacticP(tactic))) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($TACTIC_THROWN_AWAY_BECAUSE_SIBLING_IS_A_SIMPLIFICATION, NIL, tactic, NIL, NIL);
            }
            return $TACTIC_THROWN_AWAY_BECAUSE_SIBLING_IS_A_SIMPLIFICATION;
        }
        return NIL;
    }

    public static SubLObject transformation_strategy_chooses_to_throw_away_tactic_with_sibling_simplification_tacticP(final SubLObject tactic) {
        SubLObject result;
        SubLObject rest;
        SubLObject sibling_tactic;
        for (result = NIL, rest = NIL, rest = inference_datastructures_problem.problem_tactics(inference_datastructures_tactic.tactic_problem(tactic)); (NIL == result) && (NIL != rest); rest = rest.rest()) {
            sibling_tactic = rest.first();
            if ((!sibling_tactic.eql(tactic)) && (NIL != inference_worker_restriction.simplification_tactic_p(sibling_tactic))) {
                result = T;
            }
        }
        return result;
    }

    public static SubLObject transformation_strategy_chooses_to_throw_away_linkP(final SubLObject strategy, final SubLObject link, SubLObject problem_already_consideredP) {
        if (problem_already_consideredP == UNPROVIDED) {
            problem_already_consideredP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == problem_already_consideredP) {
            final SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
            if (NIL != transformation_strategy_chooses_to_throw_away_problemP(strategy, problem, UNPROVIDED)) {
                final SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
                if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                    inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($LINK_SUPPORTED_PROBLEM_THROWN_AWAY, NIL, NIL, link, subexplanation);
                }
                return T;
            }
        }
        if ((NIL != inference_worker_transformation.transformation_link_p(link)) && (NIL == inference_datastructures_inference.inference_allows_use_of_ruleP(inference_datastructures_strategy.strategy_inference(strategy), inference_worker_transformation.transformation_link_rule_assertion(link)))) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($LINK_RULE_DISALLOWED, NIL, NIL, link, NIL);
            }
            return NIL;
        }
        return NIL;
    }

    public static SubLObject transformation_strategy_chooses_to_set_aside_problemP(final SubLObject strategy, final SubLObject problem, SubLObject consider_all_tacticsP, SubLObject thrown_away_already_consideredP) {
        if (consider_all_tacticsP == UNPROVIDED) {
            consider_all_tacticsP = T;
        }
        if (thrown_away_already_consideredP == UNPROVIDED) {
            thrown_away_already_consideredP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != transformation_strategy_chooses_to_set_aside_problem_uncacheableP(strategy, problem, consider_all_tacticsP, thrown_away_already_consideredP)) {
            return T;
        }
        final SubLObject set_aside = inference_datastructures_strategy.problem_set_aside_cache_status(problem, strategy, UNPROVIDED);
        if (NIL != booleanp(set_aside)) {
            return set_aside;
        }
        final SubLObject set_asideP = transformation_strategy_chooses_to_set_aside_problem_cacheableP(strategy, problem, consider_all_tacticsP, thrown_away_already_consideredP);
        if (NIL != set_asideP) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($PROBLEM_ALREADY_SET_ASIDE, problem, NIL, NIL, NIL);
            }
            inference_datastructures_strategy.set_problem_set_aside(problem, strategy, UNPROVIDED);
        } else {
            inference_datastructures_strategy.set_problem_not_set_aside(problem, strategy, UNPROVIDED);
        }
        return set_asideP;
    }

    public static SubLObject transformation_strategy_chooses_to_set_aside_problem_uncacheableP(final SubLObject strategy, final SubLObject problem, final SubLObject consider_all_tacticsP, final SubLObject thrown_away_already_consideredP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != inference_tactician.strategy_sets_aside_all_transformationP(strategy)) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($STRATEGY_SETS_ASIDE_ALL_TRANSFORMATION, NIL, NIL, NIL, NIL);
            }
            return T;
        }
        if (NIL != transformation_tactician_datastructures.transformation_strategy_problem_set_asideP(strategy, problem)) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($PROBLEM_ALREADY_SET_ASIDE, problem, NIL, NIL, NIL);
            }
            return T;
        }
        if (((NIL != consider_all_tacticsP) && (NIL != inference_datastructures_strategy.strategically_possible_problem_p(problem, strategy))) && (NIL != transformation_strategy_chooses_to_set_aside_all_tacticsP(strategy, problem, T))) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($ALL_TACTICS_SET_ASIDE, problem, NIL, NIL, NIL);
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject transformation_strategy_chooses_to_set_aside_problem_cacheableP(final SubLObject strategy, final SubLObject problem, final SubLObject consider_all_tacticsP, final SubLObject thrown_away_already_consideredP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == thrown_away_already_consideredP) && (NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_set_aside_problemP(strategy, problem))) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation(inference_tactician_strategic_uninterestingness.why_simple_strategy_chooses_to_set_aside_problem(strategy, problem), NIL, NIL, NIL, NIL);
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject transformation_strategy_chooses_to_set_aside_strategemP(final SubLObject strategy, final SubLObject strategem, SubLObject problem_already_consideredP, SubLObject thrown_away_already_consideredP) {
        if (problem_already_consideredP == UNPROVIDED) {
            problem_already_consideredP = NIL;
        }
        if (thrown_away_already_consideredP == UNPROVIDED) {
            thrown_away_already_consideredP = NIL;
        }
        if (NIL != inference_datastructures_tactic.tactic_p(strategem)) {
            return transformation_strategy_chooses_to_set_aside_tacticP(strategy, strategem, problem_already_consideredP, NIL, thrown_away_already_consideredP);
        }
        return transformation_strategy_chooses_to_set_aside_linkP(strategy, strategem, problem_already_consideredP, thrown_away_already_consideredP);
    }

    public static SubLObject transformation_strategy_chooses_to_set_aside_tacticP(final SubLObject strategy, final SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP, SubLObject thrown_away_already_consideredP) {
        if (problem_already_consideredP == UNPROVIDED) {
            problem_already_consideredP = NIL;
        }
        if (siblings_already_consideredP == UNPROVIDED) {
            siblings_already_consideredP = NIL;
        }
        if (thrown_away_already_consideredP == UNPROVIDED) {
            thrown_away_already_consideredP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != transformation_strategy_chooses_to_set_aside_tactic_uncacheableP(strategy, tactic, problem_already_consideredP, siblings_already_consideredP, thrown_away_already_consideredP)) {
            return T;
        }
        final SubLObject set_aside = inference_datastructures_strategy.tactic_set_aside_cache_status(tactic, strategy, UNPROVIDED);
        if (NIL != booleanp(set_aside)) {
            return set_aside;
        }
        final SubLObject set_asideP = transformation_strategy_chooses_to_set_aside_tactic_cacheableP(strategy, tactic, problem_already_consideredP, siblings_already_consideredP, thrown_away_already_consideredP);
        if (NIL != set_asideP) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($TACTIC_ALREADY_SET_ASIDE, NIL, tactic, NIL, NIL);
            }
            inference_datastructures_strategy.set_tactic_set_aside(tactic, strategy, UNPROVIDED);
        } else {
            inference_datastructures_strategy.set_tactic_not_set_aside(tactic, strategy, UNPROVIDED);
        }
        return set_asideP;
    }

    public static SubLObject transformation_strategy_chooses_to_set_aside_tactic_uncacheableP(final SubLObject strategy, final SubLObject tactic, final SubLObject problem_already_consideredP, final SubLObject siblings_already_consideredP, final SubLObject thrown_away_already_consideredP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != transformation_strategy_tactic_set_asideP(strategy, tactic)) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($TACTIC_ALREADY_SET_ASIDE, NIL, tactic, NIL, NIL);
            }
            return T;
        }
        if ((NIL == thrown_away_already_consideredP) && (NIL != inference_tactician.strategy_throws_away_all_transformationP(strategy))) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($STRATEGY_THROWS_AWAY_ALL_TRANSFORMATION, NIL, NIL, NIL, NIL);
            }
            return T;
        }
        if (NIL != inference_tactician.strategy_sets_aside_all_transformationP(strategy)) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($STRATEGY_SETS_ASIDE_ALL_TRANSFORMATION, NIL, NIL, NIL, NIL);
            }
            return T;
        }
        if (NIL == problem_already_consideredP) {
            final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
            if (NIL != transformation_strategy_chooses_to_set_aside_problemP(strategy, problem, NIL, thrown_away_already_consideredP)) {
                final SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
                if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                    inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($TACTIC_SET_ASIDE_BECAUSE_PROBLEM_SET_ASIDE, NIL, tactic, NIL, subexplanation);
                }
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject transformation_strategy_chooses_to_set_aside_tactic_cacheableP(final SubLObject strategy, final SubLObject tactic, final SubLObject problem_already_consideredP, final SubLObject siblings_already_consideredP, final SubLObject thrown_away_already_consideredP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == thrown_away_already_consideredP) && (NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_set_aside_tacticP(strategy, tactic))) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation(inference_tactician_strategic_uninterestingness.why_simple_strategy_chooses_to_set_aside_tactic(strategy, tactic), NIL, NIL, NIL, NIL);
            }
            return T;
        }
        if ((NIL != inference_worker.logical_tactic_p(tactic)) && (NIL == inference_worker.logical_tactic_transformation_allowed_wrt_max_transformation_depthP(inference_datastructures_strategy.strategy_inference(strategy), tactic))) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($LOGICAL_TACTIC_EXCEEDS_MAX_TRANSFORMATION_DEPTH, NIL, tactic, NIL, NIL);
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject transformation_strategy_transformation_tactic_generated_enoughP(final SubLObject strategy, final SubLObject tactic) {
        if (NIL != inference_worker_transformation.transformation_generator_tactic_p(tactic)) {
            final SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
            if (NIL == inference_datastructures_inference.inference_allows_use_of_all_rulesP(inference)) {
                final SubLObject allowed_rule_count = inference_datastructures_inference.inference_allowed_rule_count(inference);
                if (ZERO_INTEGER.eql(allowed_rule_count)) {
                    return T;
                }
                if (NIL != subl_promotions.positive_integer_p(allowed_rule_count)) {
                    SubLObject count = ZERO_INTEGER;
                    SubLObject all_allowed_rule_tactics_already_generatedP;
                    SubLObject rest;
                    SubLObject transformation_tactic;
                    SubLObject rule;
                    for (all_allowed_rule_tactics_already_generatedP = NIL, rest = NIL, rest = inference_datastructures_problem.problem_tactics(inference_datastructures_tactic.tactic_problem(tactic)); (NIL == all_allowed_rule_tactics_already_generatedP) && (NIL != rest); rest = rest.rest()) {
                        transformation_tactic = rest.first();
                        if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(transformation_tactic, $TRANSFORMATION)) && (NIL != inference_datastructures_problem.do_problem_tactics_hl_module_match(transformation_tactic, inference_datastructures_tactic.tactic_hl_module(tactic)))) {
                            rule = inference_worker_transformation.transformation_tactic_rule(transformation_tactic);
                            if ((NIL != rule) && (NIL != inference_datastructures_inference.inference_allows_use_of_ruleP(inference, rule))) {
                                count = add(count, ONE_INTEGER);
                                if (count.numE(allowed_rule_count)) {
                                    all_allowed_rule_tactics_already_generatedP = T;
                                }
                            }
                        }
                    }
                    return all_allowed_rule_tactics_already_generatedP;
                }
            }
        }
        return NIL;
    }

    public static SubLObject transformation_strategy_chooses_to_set_aside_linkP(final SubLObject strategy, final SubLObject link, SubLObject problem_already_consideredP, SubLObject thrown_away_already_consideredP) {
        if (problem_already_consideredP == UNPROVIDED) {
            problem_already_consideredP = NIL;
        }
        if (thrown_away_already_consideredP == UNPROVIDED) {
            thrown_away_already_consideredP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == problem_already_consideredP) {
            final SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
            if (NIL != transformation_strategy_chooses_to_set_aside_problemP(strategy, problem, T, thrown_away_already_consideredP)) {
                final SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
                if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                    inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($LINK_SUPPORTED_PROBLEM_SET_ASIDE, NIL, NIL, link, subexplanation);
                }
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject transformation_strategy_chooses_to_ignore_problemP(final SubLObject strategy, final SubLObject problem) {
        return list_utilities.sublisp_boolean(why_transformation_strategy_chooses_to_ignore_problem(strategy, problem));
    }

    public static SubLObject why_transformation_strategy_chooses_to_ignore_problem(final SubLObject strategy, final SubLObject problem) {
        if (NIL != transformation_strategy_chooses_to_throw_away_problemP(strategy, problem, UNPROVIDED)) {
            return $THROW_AWAY;
        }
        if (NIL != transformation_strategy_chooses_to_set_aside_problemP(strategy, problem, T, T)) {
            return $SET_ASIDE;
        }
        if (NIL == inference_datastructures_problem.problem_relevant_to_strategyP(problem, strategy)) {
            return $IRRELEVANT;
        }
        return NIL;
    }

    public static SubLObject transformation_strategy_chooses_to_ignore_strategemP(final SubLObject strategy, final SubLObject strategem) {
        return list_utilities.sublisp_boolean(why_transformation_strategy_chooses_to_ignore_strategem(strategy, strategem));
    }

    public static SubLObject why_transformation_strategy_chooses_to_ignore_strategem(final SubLObject strategy, final SubLObject strategem) {
        if (NIL != inference_tactician.strategem_invalid_p(strategem)) {
            return $INVALID;
        }
        if ((NIL != inference_worker.content_tactic_p(strategem)) && (NIL != inference_datastructures_tactic.tactic_not_possibleP(strategem))) {
            return $THROW_AWAY;
        }
        if (NIL != transformation_strategy_chooses_to_throw_away_strategemP(strategy, strategem, UNPROVIDED)) {
            return $THROW_AWAY;
        }
        if (NIL != transformation_strategy_chooses_to_set_aside_strategemP(strategy, strategem, NIL, T)) {
            return $SET_ASIDE;
        }
        if (NIL == inference_datastructures_problem.problem_relevant_to_strategyP(inference_tactician.strategem_problem(strategem), strategy)) {
            return $IRRELEVANT;
        }
        return NIL;
    }

    public static SubLObject transformation_strategy_chooses_to_ignore_tacticP(final SubLObject strategy, final SubLObject tactic) {
        return transformation_strategy_chooses_to_ignore_strategemP(strategy, tactic);
    }

    public static SubLObject transformation_strategy_chooses_to_ignore_linkP(final SubLObject strategy, final SubLObject link) {
        return transformation_strategy_chooses_to_ignore_strategemP(strategy, link);
    }

    public static SubLObject transformation_strategy_chooses_to_throw_away_all_tacticsP(final SubLObject strategy, final SubLObject problem, SubLObject problem_already_consideredP) {
        if (problem_already_consideredP == UNPROVIDED) {
            problem_already_consideredP = NIL;
        }
        if ((NIL == problem_already_consideredP) && (NIL != transformation_strategy_chooses_to_throw_away_problemP(strategy, problem, UNPROVIDED))) {
            return T;
        }
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == transformation_strategy_chooses_to_throw_away_tacticP(strategy, tactic, T, UNPROVIDED)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject transformation_strategy_chooses_to_set_aside_all_tacticsP(final SubLObject strategy, final SubLObject problem, SubLObject problem_already_consideredP) {
        if (problem_already_consideredP == UNPROVIDED) {
            problem_already_consideredP = NIL;
        }
        if ((NIL == problem_already_consideredP) && (NIL != transformation_strategy_chooses_to_set_aside_problemP(strategy, problem, UNPROVIDED, UNPROVIDED))) {
            return T;
        }
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == transformation_strategy_chooses_to_set_aside_tacticP(strategy, tactic, T, UNPROVIDED, UNPROVIDED)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject transformation_strategy_chooses_to_totally_set_aside_tacticP(final SubLObject strategy, final SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP) {
        if (problem_already_consideredP == UNPROVIDED) {
            problem_already_consideredP = NIL;
        }
        if (siblings_already_consideredP == UNPROVIDED) {
            siblings_already_consideredP = NIL;
        }
        return transformation_strategy_chooses_to_set_aside_tacticP(strategy, tactic, problem_already_consideredP, siblings_already_consideredP, UNPROVIDED);
    }

    public static SubLObject transformation_strategy_chooses_to_totally_throw_away_tacticP(final SubLObject strategy, final SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP) {
        if (problem_already_consideredP == UNPROVIDED) {
            problem_already_consideredP = NIL;
        }
        if (siblings_already_consideredP == UNPROVIDED) {
            siblings_already_consideredP = NIL;
        }
        return transformation_strategy_chooses_to_throw_away_tacticP(strategy, tactic, problem_already_consideredP, siblings_already_consideredP);
    }

    public static SubLObject transformation_strategy_chooses_to_totally_ignore_tacticP(final SubLObject strategy, final SubLObject tactic) {
        return transformation_strategy_chooses_to_ignore_tacticP(strategy, tactic);
    }

    public static SubLObject transformation_strategy_chooses_to_throw_away_tactic_hl_moduleP(final SubLObject strategy, final SubLObject tactic) {
        if (NIL != inference_worker_join.join_tactic_p(tactic)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject transformation_strategy_preferred_backchain_required_join_ordered_tactic_internal(final SubLObject strategy, final SubLObject problem) {
        SubLObject best_tactic = $UNDETERMINED;
        SubLObject best_productivity = $POSITIVE_INFINITY;
        SubLObject best_lookahead_asent = $UNDETERMINED;
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, $JOIN_ORDERED)) {
                final SubLObject lookahead_problem = inference_worker.logical_tactic_lookahead_problem(tactic);
                if ((NIL != inference_datastructures_problem.problem_backchain_requiredP(lookahead_problem)) && (NIL != inference_datastructures_problem.single_literal_problem_p(lookahead_problem))) {
                    final SubLObject productivity = transformation_strategy_total_transformation_productivity(strategy, lookahead_problem);
                    final SubLObject candidate_asent = inference_datastructures_problem.single_literal_problem_atomic_sentence(lookahead_problem);
                    if ((NIL != inference_datastructures_enumerated_types.productivity_L(productivity, best_productivity)) || ((NIL != inference_datastructures_enumerated_types.productivity_E(productivity, best_productivity)) && list_utilities.tree_count_if(symbol_function(VARIABLE_P), candidate_asent, UNPROVIDED).numL(list_utilities.tree_count_if(symbol_function(VARIABLE_P), best_lookahead_asent, UNPROVIDED)))) {
                        best_tactic = tactic;
                        best_productivity = productivity;
                        best_lookahead_asent = candidate_asent;
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        } 
        return values(best_tactic, best_productivity);
    }

    public static SubLObject transformation_strategy_preferred_backchain_required_join_ordered_tactic(final SubLObject strategy, final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return transformation_strategy_preferred_backchain_required_join_ordered_tactic_internal(strategy, problem);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym33$TRANSFORMATION_STRATEGY_PREFERRED_BACKCHAIN_REQUIRED_JOIN_ORDERED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym33$TRANSFORMATION_STRATEGY_PREFERRED_BACKCHAIN_REQUIRED_JOIN_ORDERED, TWO_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym33$TRANSFORMATION_STRATEGY_PREFERRED_BACKCHAIN_REQUIRED_JOIN_ORDERED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(strategy, problem);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (strategy.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && problem.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(transformation_strategy_preferred_backchain_required_join_ordered_tactic_internal(strategy, problem)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(strategy, problem));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject transformation_strategy_total_transformation_productivity(final SubLObject strategy, final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total_productivity = ZERO_INTEGER;
        SubLObject candidate_tactic_specs = NIL;
        final SubLObject mt_var = inference_datastructures_problem.mt_asent_sense_from_single_literal_problem(problem);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            candidate_tactic_specs = inference_worker_transformation.single_literal_problem_candidate_transformation_tactic_specs(problem);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = candidate_tactic_specs;
        SubLObject tactic_spec = NIL;
        tactic_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tactic_spec;
            SubLObject hl_module = NIL;
            SubLObject productivity = NIL;
            destructuring_bind_must_consp(current, datum, $list38);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list38);
            productivity = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL == inference_tactician_strategic_uninterestingness.strategy_disallows_use_of_hl_module_on_problemP(strategy, hl_module, problem)) {
                    total_productivity = inference_datastructures_enumerated_types.productivity_X(total_productivity, productivity);
                }
            } else {
                cdestructuring_bind_error(datum, $list38);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic_spec = cdolist_list_var.first();
        } 
        return total_productivity;
    }

    public static SubLObject transformation_strategy_problem_thrown_awayP(final SubLObject strategy, final SubLObject problem) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) : "transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) " + strategy;
        assert NIL != inference_datastructures_problem.problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        return makeBoolean((NIL != transformation_tactician_datastructures.transformation_strategy_problem_pendingP(strategy, problem)) && (NIL == transformation_tactician_datastructures.transformation_strategy_problem_set_asideP(strategy, problem)));
    }

    public static SubLObject transformation_strategy_tactic_thrown_awayP(final SubLObject strategy, final SubLObject tactic) {
        return transformation_tactician_datastructures.transformation_strategy_strategem_thrown_awayP(strategy, tactic);
    }

    public static SubLObject transformation_strategy_tactic_set_asideP(final SubLObject strategy, final SubLObject tactic) {
        return transformation_tactician_datastructures.transformation_strategy_strategem_set_asideP(strategy, tactic);
    }

    public static SubLObject transformation_strategy_chooses_to_throw_away_tactic_lookahead_problemP(final SubLObject strategy, final SubLObject logical_tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != inference_worker_join.join_tactic_p(logical_tactic)) {
            thread.resetMultipleValues();
            final SubLObject first_problem = inference_worker_join.join_tactic_lookahead_problems(logical_tactic);
            final SubLObject second_problem = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL == first_problem) || (NIL == second_problem)) {
                return NIL;
            }
            if ((NIL != inference_datastructures_strategy.strategically_good_problem_p(first_problem, strategy)) || (NIL != inference_datastructures_strategy.strategically_good_problem_p(second_problem, strategy))) {
                return NIL;
            }
            if ((NIL != transformation_strategy_chooses_to_throw_away_lookahead_problemP(strategy, first_problem)) || (NIL != transformation_strategy_chooses_to_throw_away_lookahead_problemP(strategy, second_problem))) {
                return T;
            }
        } else {
            final SubLObject lookahead_problem = inference_worker.logical_tactic_lookahead_problem(logical_tactic);
            if (NIL != inference_datastructures_strategy.strategically_good_problem_p(lookahead_problem, strategy)) {
                return NIL;
            }
            if ((NIL != lookahead_problem) && (NIL != transformation_strategy_chooses_to_throw_away_lookahead_problemP(strategy, lookahead_problem))) {
                return T;
            }
        }
        final SubLObject link = inference_worker.logical_tactic_link(logical_tactic);
        if (NIL != transformation_strategy_chooses_to_throw_away_linkP(strategy, link, T)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject transformation_strategy_chooses_to_throw_away_lookahead_problemP(final SubLObject strategy, final SubLObject lookahead_problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = $transformation_strategy_uses_already_thrown_away_cacheP$.currentBinding(thread);
        try {
            $transformation_strategy_uses_already_thrown_away_cacheP$.bind(NIL, thread);
            v_answer = transformation_strategy_chooses_to_throw_away_problemP(strategy, lookahead_problem, UNPROVIDED);
        } finally {
            $transformation_strategy_uses_already_thrown_away_cacheP$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject transformation_strategy_chooses_not_to_activate_any_strategems_on_problemP(final SubLObject strategy, final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject resultP = NIL;
        final SubLObject _prev_bind_0 = inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.currentBinding(thread);
        try {
            inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject strategems_to_activate = transformation_tactician_motivation.transformation_strategy_categorize_strategems(strategy, problem);
            final SubLObject strategems_to_set_aside = thread.secondMultipleValue();
            final SubLObject strategems_to_throw_away = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            resultP = sublisp_null(strategems_to_activate);
        } finally {
            inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.rebind(_prev_bind_0, thread);
        }
        return resultP;
    }

    public static SubLObject transformation_strategy_chooses_to_set_aside_tactic_lookahead_problemP(final SubLObject strategy, final SubLObject logical_tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != inference_worker_join.join_tactic_p(logical_tactic)) {
            thread.resetMultipleValues();
            final SubLObject first_problem = inference_worker_join.join_tactic_lookahead_problems(logical_tactic);
            final SubLObject second_problem = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL == first_problem) || (NIL == second_problem)) {
                return NIL;
            }
            if ((NIL != inference_datastructures_strategy.strategically_good_problem_p(first_problem, strategy)) || (NIL != inference_datastructures_strategy.strategically_good_problem_p(second_problem, strategy))) {
                return NIL;
            }
            if ((NIL != transformation_strategy_chooses_to_set_aside_problemP(strategy, first_problem, UNPROVIDED, UNPROVIDED)) || (NIL != transformation_strategy_chooses_to_set_aside_problemP(strategy, second_problem, UNPROVIDED, UNPROVIDED))) {
                return T;
            }
        } else {
            final SubLObject lookahead_problem = inference_worker.logical_tactic_lookahead_problem(logical_tactic);
            if (NIL != inference_datastructures_strategy.strategically_good_problem_p(lookahead_problem, strategy)) {
                return NIL;
            }
            if (NIL != transformation_strategy_chooses_to_set_aside_problemP(strategy, lookahead_problem, UNPROVIDED, UNPROVIDED)) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject transformation_strategy_throw_away_uninteresting_set_asides(final SubLObject strategy) {
        SubLObject total_thrown_away_count;
        SubLObject thrown_away_count;
        for (total_thrown_away_count = ZERO_INTEGER, thrown_away_count = transformation_strategy_throw_away_uninteresting_set_asides_int(strategy), total_thrown_away_count = add(total_thrown_away_count, thrown_away_count); thrown_away_count.isPositive(); thrown_away_count = transformation_strategy_throw_away_uninteresting_set_asides_int(strategy) , total_thrown_away_count = add(total_thrown_away_count, thrown_away_count)) {
        }
        return total_thrown_away_count;
    }

    public static SubLObject transformation_strategy_throw_away_uninteresting_set_asides_int(final SubLObject strategy) {
        final SubLObject set_aside_problems = transformation_strategy_set_aside_problems_to_reconsider(strategy);
        inference_datastructures_strategy.strategy_clear_set_asides(strategy);
        SubLObject thrown_away_count = ZERO_INTEGER;
        SubLObject cdolist_list_var = set_aside_problems;
        SubLObject set_aside_problem = NIL;
        set_aside_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != transformation_strategy_chooses_to_leave_problem_set_asideP(strategy, set_aside_problem)) && (NIL != inference_datastructures_inference.inference_continuableP(inference_datastructures_strategy.strategy_inference(strategy)))) {
                inference_tactician.strategy_make_problem_set_aside(strategy, set_aside_problem);
            } else {
                thrown_away_count = add(thrown_away_count, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            set_aside_problem = cdolist_list_var.first();
        } 
        return thrown_away_count;
    }

    public static SubLObject transformation_strategy_chooses_to_leave_problem_set_asideP(final SubLObject strategy, final SubLObject set_aside_problem) {
        return eq($SET_ASIDE, why_transformation_strategy_chooses_to_ignore_problem(strategy, set_aside_problem));
    }

    public static SubLObject transformation_strategy_reconsider_set_asides(final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        transformation_tactician_datastructures.transformation_strategy_clear_set_aside_problems(strategy);
        SubLObject reactivated_count = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = inference_worker.$reconsidering_set_asidesP$.currentBinding(thread);
        try {
            inference_worker.$reconsidering_set_asidesP$.bind(T, thread);
            final SubLObject set_aside_problems = inference_datastructures_strategy.strategy_all_valid_set_aside_problems(strategy);
            inference_datastructures_strategy.strategy_clear_set_asides(strategy);
            SubLObject cdolist_list_var;
            final SubLObject set_aside_problems_in_order = cdolist_list_var = Sort.sort(set_aside_problems, symbol_function($sym41$_), symbol_function(PROBLEM_SUID));
            SubLObject set_aside_problem = NIL;
            set_aside_problem = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != transformation_strategy_reconsider_one_set_aside(strategy, set_aside_problem)) {
                    reactivated_count = add(reactivated_count, ONE_INTEGER);
                }
                cdolist_list_var = cdolist_list_var.rest();
                set_aside_problem = cdolist_list_var.first();
            } 
        } finally {
            inference_worker.$reconsidering_set_asidesP$.rebind(_prev_bind_0, thread);
        }
        return reactivated_count;
    }

    public static SubLObject transformation_strategy_set_aside_problems_to_reconsider(final SubLObject strategy) {
        return inference_datastructures_strategy.strategy_all_valid_set_aside_problems(strategy);
    }

    public static SubLObject transformation_strategy_reconsider_one_set_aside(final SubLObject strategy, final SubLObject problem) {
        inference_tactician.possibly_clear_strategic_status_wrt(problem, strategy);
        return inference_worker.possibly_reactivate_problem(strategy, problem);
    }

    public static SubLObject declare_transformation_tactician_uninterestingness_file() {
        declareFunction(me, "transformation_strategy_set_aside_non_continuable_implies_throw_away_tacticP", "TRANSFORMATION-STRATEGY-SET-ASIDE-NON-CONTINUABLE-IMPLIES-THROW-AWAY-TACTIC?", 1, 0, false);
        declareFunction(me, "transformation_strategy_set_aside_non_continuable_implies_throw_away_problemP", "TRANSFORMATION-STRATEGY-SET-ASIDE-NON-CONTINUABLE-IMPLIES-THROW-AWAY-PROBLEM?", 1, 0, false);
        declareFunction(me, "transformation_strategy_why_problem_already_thrown_awayP", "TRANSFORMATION-STRATEGY-WHY-PROBLEM-ALREADY-THROWN-AWAY?", 2, 0, false);
        declareFunction(me, "rederive_why_transformation_strategy_chooses_to_throw_away_problemP", "REDERIVE-WHY-TRANSFORMATION-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM?", 2, 0, false);
        declareFunction(me, "transformation_strategy_chooses_to_throw_away_problemP", "TRANSFORMATION-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM?", 2, 1, false);
        declareFunction(me, "transformation_strategy_chooses_to_throw_away_problem_uncacheableP", "TRANSFORMATION-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM-UNCACHEABLE?", 3, 0, false);
        declareFunction(me, "transformation_strategy_chooses_to_throw_away_problem_cacheableP", "TRANSFORMATION-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM-CACHEABLE?", 3, 0, false);
        declareFunction(me, "transformation_strategy_chooses_to_throw_away_strategemP", "TRANSFORMATION-STRATEGY-CHOOSES-TO-THROW-AWAY-STRATEGEM?", 2, 1, false);
        declareFunction(me, "transformation_strategy_chooses_to_throw_away_tacticP", "TRANSFORMATION-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC?", 2, 2, false);
        declareFunction(me, "transformation_strategy_chooses_to_throw_away_tactic_uncacheableP", "TRANSFORMATION-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-UNCACHEABLE?", 4, 0, false);
        declareFunction(me, "transformation_strategy_chooses_to_throw_away_tactic_cacheableP", "TRANSFORMATION-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-CACHEABLE?", 4, 0, false);
        declareFunction(me, "transformation_strategy_chooses_to_throw_away_tactic_with_sibling_simplification_tacticP", "TRANSFORMATION-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-WITH-SIBLING-SIMPLIFICATION-TACTIC?", 1, 0, false);
        declareFunction(me, "transformation_strategy_chooses_to_throw_away_linkP", "TRANSFORMATION-STRATEGY-CHOOSES-TO-THROW-AWAY-LINK?", 2, 1, false);
        declareFunction(me, "transformation_strategy_chooses_to_set_aside_problemP", "TRANSFORMATION-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM?", 2, 2, false);
        declareFunction(me, "transformation_strategy_chooses_to_set_aside_problem_uncacheableP", "TRANSFORMATION-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM-UNCACHEABLE?", 4, 0, false);
        declareFunction(me, "transformation_strategy_chooses_to_set_aside_problem_cacheableP", "TRANSFORMATION-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM-CACHEABLE?", 4, 0, false);
        declareFunction(me, "transformation_strategy_chooses_to_set_aside_strategemP", "TRANSFORMATION-STRATEGY-CHOOSES-TO-SET-ASIDE-STRATEGEM?", 2, 2, false);
        declareFunction(me, "transformation_strategy_chooses_to_set_aside_tacticP", "TRANSFORMATION-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC?", 2, 3, false);
        declareFunction(me, "transformation_strategy_chooses_to_set_aside_tactic_uncacheableP", "TRANSFORMATION-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC-UNCACHEABLE?", 5, 0, false);
        declareFunction(me, "transformation_strategy_chooses_to_set_aside_tactic_cacheableP", "TRANSFORMATION-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC-CACHEABLE?", 5, 0, false);
        declareFunction(me, "transformation_strategy_transformation_tactic_generated_enoughP", "TRANSFORMATION-STRATEGY-TRANSFORMATION-TACTIC-GENERATED-ENOUGH?", 2, 0, false);
        declareFunction(me, "transformation_strategy_chooses_to_set_aside_linkP", "TRANSFORMATION-STRATEGY-CHOOSES-TO-SET-ASIDE-LINK?", 2, 2, false);
        declareFunction(me, "transformation_strategy_chooses_to_ignore_problemP", "TRANSFORMATION-STRATEGY-CHOOSES-TO-IGNORE-PROBLEM?", 2, 0, false);
        declareFunction(me, "why_transformation_strategy_chooses_to_ignore_problem", "WHY-TRANSFORMATION-STRATEGY-CHOOSES-TO-IGNORE-PROBLEM", 2, 0, false);
        declareFunction(me, "transformation_strategy_chooses_to_ignore_strategemP", "TRANSFORMATION-STRATEGY-CHOOSES-TO-IGNORE-STRATEGEM?", 2, 0, false);
        declareFunction(me, "why_transformation_strategy_chooses_to_ignore_strategem", "WHY-TRANSFORMATION-STRATEGY-CHOOSES-TO-IGNORE-STRATEGEM", 2, 0, false);
        declareFunction(me, "transformation_strategy_chooses_to_ignore_tacticP", "TRANSFORMATION-STRATEGY-CHOOSES-TO-IGNORE-TACTIC?", 2, 0, false);
        declareFunction(me, "transformation_strategy_chooses_to_ignore_linkP", "TRANSFORMATION-STRATEGY-CHOOSES-TO-IGNORE-LINK?", 2, 0, false);
        declareFunction(me, "transformation_strategy_chooses_to_throw_away_all_tacticsP", "TRANSFORMATION-STRATEGY-CHOOSES-TO-THROW-AWAY-ALL-TACTICS?", 2, 1, false);
        declareFunction(me, "transformation_strategy_chooses_to_set_aside_all_tacticsP", "TRANSFORMATION-STRATEGY-CHOOSES-TO-SET-ASIDE-ALL-TACTICS?", 2, 1, false);
        declareFunction(me, "transformation_strategy_chooses_to_totally_set_aside_tacticP", "TRANSFORMATION-STRATEGY-CHOOSES-TO-TOTALLY-SET-ASIDE-TACTIC?", 2, 2, false);
        declareFunction(me, "transformation_strategy_chooses_to_totally_throw_away_tacticP", "TRANSFORMATION-STRATEGY-CHOOSES-TO-TOTALLY-THROW-AWAY-TACTIC?", 2, 2, false);
        declareFunction(me, "transformation_strategy_chooses_to_totally_ignore_tacticP", "TRANSFORMATION-STRATEGY-CHOOSES-TO-TOTALLY-IGNORE-TACTIC?", 2, 0, false);
        declareFunction(me, "transformation_strategy_chooses_to_throw_away_tactic_hl_moduleP", "TRANSFORMATION-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-HL-MODULE?", 2, 0, false);
        declareFunction(me, "transformation_strategy_preferred_backchain_required_join_ordered_tactic_internal", "TRANSFORMATION-STRATEGY-PREFERRED-BACKCHAIN-REQUIRED-JOIN-ORDERED-TACTIC-INTERNAL", 2, 0, false);
        declareFunction(me, "transformation_strategy_preferred_backchain_required_join_ordered_tactic", "TRANSFORMATION-STRATEGY-PREFERRED-BACKCHAIN-REQUIRED-JOIN-ORDERED-TACTIC", 2, 0, false);
        declareFunction(me, "transformation_strategy_total_transformation_productivity", "TRANSFORMATION-STRATEGY-TOTAL-TRANSFORMATION-PRODUCTIVITY", 2, 0, false);
        declareFunction(me, "transformation_strategy_problem_thrown_awayP", "TRANSFORMATION-STRATEGY-PROBLEM-THROWN-AWAY?", 2, 0, false);
        declareFunction(me, "transformation_strategy_tactic_thrown_awayP", "TRANSFORMATION-STRATEGY-TACTIC-THROWN-AWAY?", 2, 0, false);
        declareFunction(me, "transformation_strategy_tactic_set_asideP", "TRANSFORMATION-STRATEGY-TACTIC-SET-ASIDE?", 2, 0, false);
        declareFunction(me, "transformation_strategy_chooses_to_throw_away_tactic_lookahead_problemP", "TRANSFORMATION-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-LOOKAHEAD-PROBLEM?", 2, 0, false);
        declareFunction(me, "transformation_strategy_chooses_to_throw_away_lookahead_problemP", "TRANSFORMATION-STRATEGY-CHOOSES-TO-THROW-AWAY-LOOKAHEAD-PROBLEM?", 2, 0, false);
        declareFunction(me, "transformation_strategy_chooses_not_to_activate_any_strategems_on_problemP", "TRANSFORMATION-STRATEGY-CHOOSES-NOT-TO-ACTIVATE-ANY-STRATEGEMS-ON-PROBLEM?", 2, 0, false);
        declareFunction(me, "transformation_strategy_chooses_to_set_aside_tactic_lookahead_problemP", "TRANSFORMATION-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC-LOOKAHEAD-PROBLEM?", 2, 0, false);
        declareFunction(me, "transformation_strategy_throw_away_uninteresting_set_asides", "TRANSFORMATION-STRATEGY-THROW-AWAY-UNINTERESTING-SET-ASIDES", 1, 0, false);
        declareFunction(me, "transformation_strategy_throw_away_uninteresting_set_asides_int", "TRANSFORMATION-STRATEGY-THROW-AWAY-UNINTERESTING-SET-ASIDES-INT", 1, 0, false);
        declareFunction(me, "transformation_strategy_chooses_to_leave_problem_set_asideP", "TRANSFORMATION-STRATEGY-CHOOSES-TO-LEAVE-PROBLEM-SET-ASIDE?", 2, 0, false);
        declareFunction(me, "transformation_strategy_reconsider_set_asides", "TRANSFORMATION-STRATEGY-RECONSIDER-SET-ASIDES", 1, 0, false);
        declareFunction(me, "transformation_strategy_set_aside_problems_to_reconsider", "TRANSFORMATION-STRATEGY-SET-ASIDE-PROBLEMS-TO-RECONSIDER", 1, 0, false);
        declareFunction(me, "transformation_strategy_reconsider_one_set_aside", "TRANSFORMATION-STRATEGY-RECONSIDER-ONE-SET-ASIDE", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_transformation_tactician_uninterestingness_file() {
        defparameter("*TRANSFORMATION-STRATEGY-USES-ALREADY-THROWN-AWAY-CACHE?*", T);
        defvar("*TRANSFORMATION-STRATEGY-THROW-AWAY-PROBLEM-WITH-ABDUCED-TERM?*", T);
        return NIL;
    }

    public static SubLObject setup_transformation_tactician_uninterestingness_file() {
        memoization_state.note_memoized_function($sym33$TRANSFORMATION_STRATEGY_PREFERRED_BACKCHAIN_REQUIRED_JOIN_ORDERED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_transformation_tactician_uninterestingness_file();
    }

    @Override
    public void initializeVariables() {
        init_transformation_tactician_uninterestingness_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_transformation_tactician_uninterestingness_file();
    }

    
}

/**
 * Total time: 227 ms
 */
