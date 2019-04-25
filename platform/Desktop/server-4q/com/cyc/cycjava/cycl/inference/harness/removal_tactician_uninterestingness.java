package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_tactician_uninterestingness extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness";
    public static final String myFingerPrint = "8f06931c2a9e15d8687eb85dadb860333c1ebacc7ed64e6e074b6fcf30e0d852";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 1109L)
    private static SubLSymbol $removal_strategy_uses_uninterestingness_cacheP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 19609L)
    private static SubLSymbol $removal_strategy_compute_tactic_uninterestingness_cache_conditions_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 20872L)
    private static SubLSymbol $removal_strategy_compute_problem_uninterestingness_cache_conditions_caching_state$;
    private static final SubLSymbol $kw0$RECOMPUTE;
    private static final SubLSymbol $kw1$ALL_TACTICS_THROWN_AWAY;
    private static final SubLSymbol $kw2$PROBLEM_STRATEGY_NOT_CONTINUABLE;
    private static final SubLSymbol $kw3$TACTIC_HL_MODULE_THROWN_AWAY;
    private static final SubLSymbol $kw4$TACTIC_ALREADY_THROWN_AWAY;
    private static final SubLSymbol $kw5$TACTIC_THROWN_AWAY_BECAUSE_COMPLETE_SIBLING_CONJUNCTIVE_REMOVAL;
    private static final SubLString $str6$tactic_is_disallowed;
    private static final SubLString $str7$tactic_is_impossible;
    private static final SubLSymbol $kw8$TACTIC_THROWN_AWAY_BECAUSE_SIBLING_BACKCHAIN_REQUIRED;
    private static final SubLSymbol $kw9$META_REMOVAL_TACTIC_THROWN_AWAY;
    private static final SubLSymbol $kw10$TACTIC_THROWN_AWAY_BECAUSE_PROBLEM_THROWN_AWAY;
    private static final SubLSymbol $kw11$TACTIC_THROWN_AWAY_BECAUSE_LOOKAHEAD_PROBLEM_THROWN_AWAY;
    private static final SubLSymbol $kw12$TACTIC_STRATEGY_NOT_CONTINUABLE;
    private static final SubLSymbol $kw13$LINK_SUPPORTED_PROBLEM_THROWN_AWAY;
    private static final SubLSymbol $kw14$NOT_APPLICABLE;
    private static final SubLSymbol $kw15$PROBLEM_ALREADY_SET_ASIDE;
    private static final SubLSymbol $kw16$ALL_TACTICS_SET_ASIDE;
    private static final SubLString $str17$Condition__A_not_handled_yet;
    private static final SubLSymbol $sym18$REMOVAL_STRATEGY_COMPUTE_TACTIC_UNINTERESTINGNESS_CACHE_CONDITION;
    private static final SubLSymbol $sym19$_REMOVAL_STRATEGY_COMPUTE_TACTIC_UNINTERESTINGNESS_CACHE_CONDITIO;
    private static final SubLSymbol $sym20$REMOVAL_STRATEGY_COMPUTE_PROBLEM_UNINTERESTINGNESS_CACHE_CONDITIO;
    private static final SubLSymbol $sym21$_REMOVAL_STRATEGY_COMPUTE_PROBLEM_UNINTERESTINGNESS_CACHE_CONDITI;
    private static final SubLSymbol $kw22$TACTIC_ALREADY_SET_ASIDE;
    private static final SubLSymbol $kw23$JOIN_ORDERED_TACTIC_LEADS_TO_SET_ASIDE_CONJUNCTIVE_REMOVALS;
    private static final SubLSymbol $kw24$TACTIC_SET_ASIDE_BECAUSE_PROBLEM_SET_ASIDE;
    private static final SubLSymbol $kw25$TACTIC_SET_ASIDE_BECAUSE_LOOKAHEAD_PROBLEM_SET_ASIDE;
    private static final SubLSymbol $kw26$LINK_SUPPORTED_PROBLEM_SET_ASIDE;
    private static final SubLSymbol $kw27$THROW_AWAY;
    private static final SubLSymbol $kw28$SET_ASIDE;
    private static final SubLSymbol $kw29$IRRELEVANT;
    private static final SubLSymbol $kw30$INVALID;
    private static final SubLSymbol $kw31$REMOVAL_CONJUNCTIVE;
    private static final SubLSymbol $kw32$SUBSTRATEGY_TOTALLY_THROW_AWAY_TACTIC;
    private static final SubLSymbol $sym33$REMOVAL_STRATEGY_P;
    private static final SubLSymbol $sym34$PROBLEM_P;
    private static final SubLSymbol $kw35$SPLIT;
    private static final SubLSymbol $kw36$SPLIT_TACTIC_THROWN_AWAY_BECAUSE_SIBLING_TACTIC_THROWN_AWAY;
    private static final SubLSymbol $kw37$SPLIT_TACTIC_SET_ASIDE_BECAUSE_SIBLING_TACTIC_THROWN_AWAY;
    private static final SubLSymbol $kw38$SUBSTRATEGY_ALLOW_SPLIT_TACTIC_SET_ASIDE_WRT_REMOVAL;
    private static final SubLSymbol $kw39$GENERALIZED_REMOVAL;
    private static final SubLSymbol $kw40$POSSIBLE;
    private static final SubLSymbol $sym41$_;
    private static final SubLSymbol $sym42$PROBLEM_SUID;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 1269L)
    public static SubLObject removal_strategy_set_aside_non_continuable_implies_throw_away_tacticP(final SubLObject tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_tactician_uninterestingness.NIL != inference_worker_split.split_tactic_p(tactic) && removal_tactician_uninterestingness.NIL != inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_tactic.tactic_store(tactic))) {
            return (SubLObject)removal_tactician_uninterestingness.NIL;
        }
        return inference_tactician.$set_aside_non_continuable_implies_throw_away_for_removalP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 1776L)
    public static SubLObject removal_strategy_set_aside_non_continuable_implies_throw_away_problemP(final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return inference_tactician.$set_aside_non_continuable_implies_throw_away_for_removalP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 2525L)
    public static SubLObject removal_strategy_chooses_to_throw_away_problemP(final SubLObject strategy, final SubLObject problem, SubLObject consider_all_tacticsP, SubLObject pending_implies_thrown_awayP) {
        if (consider_all_tacticsP == removal_tactician_uninterestingness.UNPROVIDED) {
            consider_all_tacticsP = (SubLObject)removal_tactician_uninterestingness.T;
        }
        if (pending_implies_thrown_awayP == removal_tactician_uninterestingness.UNPROVIDED) {
            pending_implies_thrown_awayP = (SubLObject)removal_tactician_uninterestingness.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_tactician_uninterestingness.NIL;
        final SubLObject conditions = removal_strategy_compute_problem_uninterestingness_cache_conditions(consider_all_tacticsP, pending_implies_thrown_awayP, (SubLObject)removal_tactician_uninterestingness.NIL);
        final SubLObject cache_value = inference_datastructures_strategy.problem_thrown_away_cache_status(problem, strategy, conditions);
        if (removal_tactician_uninterestingness.NIL != Types.booleanp(cache_value)) {
            result = cache_value;
        }
        if (removal_tactician_uninterestingness.T != cache_value && removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_throw_away_problem_uncacheableP(strategy, problem, consider_all_tacticsP, pending_implies_thrown_awayP)) {
            return (SubLObject)removal_tactician_uninterestingness.T;
        }
        if (removal_tactician_uninterestingness.$kw0$RECOMPUTE == cache_value) {
            final SubLObject throw_awayP = removal_strategy_chooses_to_throw_away_problem_cacheableP(strategy, problem, consider_all_tacticsP, pending_implies_thrown_awayP);
            if (removal_tactician_uninterestingness.NIL != removal_tactician_uninterestingness.$removal_strategy_uses_uninterestingness_cacheP$.getDynamicValue(thread)) {
                if (removal_tactician_uninterestingness.NIL != throw_awayP) {
                    inference_datastructures_strategy.set_problem_thrown_away(problem, strategy, conditions);
                }
                else {
                    inference_datastructures_strategy.set_problem_not_thrown_away(problem, strategy, conditions);
                }
            }
            result = throw_awayP;
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 3896L)
    public static SubLObject removal_strategy_chooses_to_throw_away_problem_uncacheableP(final SubLObject strategy, final SubLObject problem, final SubLObject consider_all_tacticsP, final SubLObject pending_implies_thrown_awayP) {
        return (SubLObject)removal_tactician_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 4377L)
    public static SubLObject removal_strategy_chooses_to_throw_away_problem_cacheableP(final SubLObject strategy, final SubLObject problem, final SubLObject consider_all_tacticsP, final SubLObject pending_implies_thrown_awayP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_tactician_uninterestingness.NIL != pending_implies_thrown_awayP && removal_tactician_uninterestingness.NIL != removal_strategy_problem_pending_and_not_set_asideP(strategy, problem)) {
            return (SubLObject)removal_tactician_uninterestingness.T;
        }
        if (removal_tactician_uninterestingness.NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_throw_away_problemP(strategy, problem)) {
            if (removal_tactician_uninterestingness.NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation(inference_tactician_strategic_uninterestingness.why_simple_strategy_chooses_to_throw_away_problem(strategy, problem), (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.NIL);
            }
            return (SubLObject)removal_tactician_uninterestingness.T;
        }
        if (removal_tactician_uninterestingness.NIL != consider_all_tacticsP && removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_throw_away_all_tacticsP(strategy, problem, (SubLObject)removal_tactician_uninterestingness.T, pending_implies_thrown_awayP)) {
            if (removal_tactician_uninterestingness.NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation((SubLObject)removal_tactician_uninterestingness.$kw1$ALL_TACTICS_THROWN_AWAY, problem, (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.NIL);
            }
            return (SubLObject)removal_tactician_uninterestingness.T;
        }
        if (removal_tactician_uninterestingness.NIL != removal_strategy_set_aside_non_continuable_implies_throw_away_problemP(problem) && removal_tactician_uninterestingness.NIL == inference_datastructures_strategy.strategy_continuableP(strategy) && removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_set_aside_problemP(strategy, problem, (SubLObject)removal_tactician_uninterestingness.T, (SubLObject)removal_tactician_uninterestingness.T)) {
            final SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
            if (removal_tactician_uninterestingness.NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation((SubLObject)removal_tactician_uninterestingness.$kw2$PROBLEM_STRATEGY_NOT_CONTINUABLE, problem, (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.NIL, subexplanation);
            }
            return (SubLObject)removal_tactician_uninterestingness.T;
        }
        return (SubLObject)removal_tactician_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 5958L)
    public static SubLObject removal_strategy_chooses_to_throw_away_strategemP(final SubLObject strategy, final SubLObject strategem, SubLObject problem_already_consideredP) {
        if (problem_already_consideredP == removal_tactician_uninterestingness.UNPROVIDED) {
            problem_already_consideredP = (SubLObject)removal_tactician_uninterestingness.NIL;
        }
        if (removal_tactician_uninterestingness.NIL != inference_datastructures_tactic.tactic_p(strategem)) {
            return removal_strategy_chooses_to_throw_away_tacticP(strategy, strategem, problem_already_consideredP, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED);
        }
        return removal_strategy_chooses_to_throw_away_linkP(strategy, strategem, problem_already_consideredP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 6589L)
    public static SubLObject removal_strategy_chooses_to_throw_away_tacticP(final SubLObject strategy, final SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP, SubLObject use_strategem_thrown_away_cacheP) {
        if (problem_already_consideredP == removal_tactician_uninterestingness.UNPROVIDED) {
            problem_already_consideredP = (SubLObject)removal_tactician_uninterestingness.NIL;
        }
        if (siblings_already_consideredP == removal_tactician_uninterestingness.UNPROVIDED) {
            siblings_already_consideredP = (SubLObject)removal_tactician_uninterestingness.NIL;
        }
        if (use_strategem_thrown_away_cacheP == removal_tactician_uninterestingness.UNPROVIDED) {
            use_strategem_thrown_away_cacheP = (SubLObject)removal_tactician_uninterestingness.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_tactician_uninterestingness.NIL;
        final SubLObject conditions = removal_strategy_compute_tactic_uninterestingness_cache_conditions(problem_already_consideredP, siblings_already_consideredP, use_strategem_thrown_away_cacheP, (SubLObject)removal_tactician_uninterestingness.NIL);
        final SubLObject cache_value = inference_datastructures_strategy.tactic_thrown_away_cache_status(tactic, strategy, conditions);
        if (removal_tactician_uninterestingness.NIL != Types.booleanp(cache_value)) {
            result = cache_value;
        }
        if (removal_tactician_uninterestingness.T != cache_value && removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_throw_away_tactic_uncacheableP(strategy, tactic, problem_already_consideredP, siblings_already_consideredP, use_strategem_thrown_away_cacheP)) {
            return (SubLObject)removal_tactician_uninterestingness.T;
        }
        if (removal_tactician_uninterestingness.$kw0$RECOMPUTE == cache_value) {
            final SubLObject throw_awayP = removal_strategy_chooses_to_throw_away_tactic_cacheableP(strategy, tactic, problem_already_consideredP, siblings_already_consideredP, use_strategem_thrown_away_cacheP);
            if (removal_tactician_uninterestingness.NIL != removal_tactician_uninterestingness.$removal_strategy_uses_uninterestingness_cacheP$.getDynamicValue(thread)) {
                if (removal_tactician_uninterestingness.NIL != throw_awayP) {
                    inference_datastructures_strategy.set_tactic_thrown_away(tactic, strategy, conditions);
                }
                else {
                    inference_datastructures_strategy.set_tactic_not_thrown_away(tactic, strategy, conditions);
                }
            }
            result = throw_awayP;
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 8027L)
    public static SubLObject removal_strategy_chooses_to_throw_away_tactic_uncacheableP(final SubLObject strategy, final SubLObject tactic, final SubLObject problem_already_consideredP, final SubLObject siblings_already_consideredP, final SubLObject use_strategem_thrown_away_cacheP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_throw_away_tactic_hl_moduleP(strategy, tactic)) {
            if (removal_tactician_uninterestingness.NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation((SubLObject)removal_tactician_uninterestingness.$kw3$TACTIC_HL_MODULE_THROWN_AWAY, (SubLObject)removal_tactician_uninterestingness.NIL, tactic, (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.NIL);
            }
            return (SubLObject)removal_tactician_uninterestingness.T;
        }
        if (removal_tactician_uninterestingness.NIL == inference_tactician_strategic_uninterestingness.strategy_admits_tactic_wrt_proof_specP(strategy, tactic)) {
            return (SubLObject)removal_tactician_uninterestingness.T;
        }
        return (SubLObject)removal_tactician_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 8839L)
    public static SubLObject removal_strategy_chooses_to_throw_away_tactic_cacheableP(final SubLObject strategy, final SubLObject tactic, final SubLObject problem_already_consideredP, final SubLObject siblings_already_consideredP, final SubLObject use_strategem_thrown_away_cacheP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_tactician_uninterestingness.NIL != use_strategem_thrown_away_cacheP && removal_tactician_uninterestingness.NIL != removal_strategy_tactic_thrown_awayP(strategy, tactic)) {
            if (removal_tactician_uninterestingness.NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation((SubLObject)removal_tactician_uninterestingness.$kw4$TACTIC_ALREADY_THROWN_AWAY, (SubLObject)removal_tactician_uninterestingness.NIL, tactic, (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.NIL);
            }
            return (SubLObject)removal_tactician_uninterestingness.T;
        }
        if (removal_tactician_uninterestingness.NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_throw_away_tacticP(strategy, tactic)) {
            if (removal_tactician_uninterestingness.NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation(inference_tactician_strategic_uninterestingness.why_simple_strategy_chooses_to_throw_away_tactic(strategy, tactic), (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.NIL);
            }
            return (SubLObject)removal_tactician_uninterestingness.T;
        }
        if (removal_tactician_uninterestingness.NIL != inference_worker.generalized_logical_conjunctive_tactic_p(tactic) && removal_tactician_uninterestingness.NIL != inference_tactician_utilities.problem_has_some_complete_non_thrown_away_removal_tacticP(inference_datastructures_tactic.tactic_problem(tactic), strategy)) {
            if (removal_tactician_uninterestingness.NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation((SubLObject)removal_tactician_uninterestingness.$kw5$TACTIC_THROWN_AWAY_BECAUSE_COMPLETE_SIBLING_CONJUNCTIVE_REMOVAL, (SubLObject)removal_tactician_uninterestingness.NIL, tactic, (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.NIL);
            }
            return (SubLObject)removal_tactician_uninterestingness.T;
        }
        if (removal_tactician_uninterestingness.NIL != inference_worker.structural_tactic_p(tactic) && removal_tactician_uninterestingness.NIL != inference_tactician_strategic_uninterestingness.tactic_disallowed_or_doomedP(tactic, strategy)) {
            if (removal_tactician_uninterestingness.NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation((SubLObject)removal_tactician_uninterestingness.$str6$tactic_is_disallowed, (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.NIL);
            }
            return (SubLObject)removal_tactician_uninterestingness.T;
        }
        if (removal_tactician_uninterestingness.NIL != inference_worker.content_tactic_p(tactic) && removal_tactician_uninterestingness.NIL != inference_tactician_strategic_uninterestingness.tactic_impossibleP(tactic, strategy)) {
            if (removal_tactician_uninterestingness.NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation((SubLObject)removal_tactician_uninterestingness.$str7$tactic_is_impossible, (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.NIL);
            }
            return (SubLObject)removal_tactician_uninterestingness.T;
        }
        if (removal_tactician_uninterestingness.NIL != inference_worker_join_ordered.join_ordered_tactic_p(tactic) && removal_tactician_uninterestingness.NIL != inference_datastructures_problem.problem_backchain_requiredP(inference_datastructures_tactic.tactic_problem(tactic)) && !tactic.eql(removal_strategy_preferred_backchain_required_join_ordered_tactic(strategy, inference_datastructures_tactic.tactic_problem(tactic)))) {
            if (removal_tactician_uninterestingness.NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation((SubLObject)removal_tactician_uninterestingness.$kw8$TACTIC_THROWN_AWAY_BECAUSE_SIBLING_BACKCHAIN_REQUIRED, (SubLObject)removal_tactician_uninterestingness.NIL, tactic, (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.NIL);
            }
            return (SubLObject)removal_tactician_uninterestingness.T;
        }
        if (removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_throw_away_meta_removal_tacticP(strategy, tactic)) {
            if (removal_tactician_uninterestingness.NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation((SubLObject)removal_tactician_uninterestingness.$kw9$META_REMOVAL_TACTIC_THROWN_AWAY, (SubLObject)removal_tactician_uninterestingness.NIL, tactic, (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.NIL);
            }
            return (SubLObject)removal_tactician_uninterestingness.T;
        }
        if (removal_tactician_uninterestingness.NIL == problem_already_consideredP) {
            final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
            if (removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_throw_away_problemP(strategy, problem, (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED)) {
                final SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
                if (removal_tactician_uninterestingness.NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                    inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation((SubLObject)removal_tactician_uninterestingness.$kw10$TACTIC_THROWN_AWAY_BECAUSE_PROBLEM_THROWN_AWAY, (SubLObject)removal_tactician_uninterestingness.NIL, tactic, (SubLObject)removal_tactician_uninterestingness.NIL, subexplanation);
                }
                return (SubLObject)removal_tactician_uninterestingness.T;
            }
        }
        if (removal_tactician_uninterestingness.NIL != inference_worker.logical_tactic_p(tactic) && removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_throw_away_tactic_lookahead_problemP(strategy, tactic)) {
            final SubLObject subexplanation2 = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
            if (removal_tactician_uninterestingness.NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation((SubLObject)removal_tactician_uninterestingness.$kw11$TACTIC_THROWN_AWAY_BECAUSE_LOOKAHEAD_PROBLEM_THROWN_AWAY, (SubLObject)removal_tactician_uninterestingness.NIL, tactic, (SubLObject)removal_tactician_uninterestingness.NIL, subexplanation2);
            }
            return (SubLObject)removal_tactician_uninterestingness.T;
        }
        if (removal_tactician_uninterestingness.NIL == siblings_already_consideredP && removal_tactician_uninterestingness.NIL != inference_worker_split.split_tactic_p(tactic) && removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_throw_away_split_tacticP(strategy, tactic)) {
            return (SubLObject)removal_tactician_uninterestingness.T;
        }
        if (removal_tactician_uninterestingness.NIL != removal_strategy_set_aside_non_continuable_implies_throw_away_tacticP(tactic) && removal_tactician_uninterestingness.NIL == inference_datastructures_strategy.strategy_continuableP(strategy) && removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_set_aside_tacticP(strategy, tactic, (SubLObject)removal_tactician_uninterestingness.T, (SubLObject)removal_tactician_uninterestingness.T, (SubLObject)removal_tactician_uninterestingness.T)) {
            final SubLObject subexplanation2 = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
            if (removal_tactician_uninterestingness.NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation((SubLObject)removal_tactician_uninterestingness.$kw12$TACTIC_STRATEGY_NOT_CONTINUABLE, (SubLObject)removal_tactician_uninterestingness.NIL, tactic, (SubLObject)removal_tactician_uninterestingness.NIL, subexplanation2);
            }
            return (SubLObject)removal_tactician_uninterestingness.T;
        }
        return (SubLObject)removal_tactician_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 13375L)
    public static SubLObject removal_strategy_chooses_to_throw_away_tactic_with_sibling_simplification_tacticP(final SubLObject tactic) {
        SubLObject result;
        SubLObject rest;
        SubLObject sibling_tactic;
        for (result = (SubLObject)removal_tactician_uninterestingness.NIL, rest = (SubLObject)removal_tactician_uninterestingness.NIL, rest = inference_datastructures_problem.problem_tactics(inference_datastructures_tactic.tactic_problem(tactic)); removal_tactician_uninterestingness.NIL == result && removal_tactician_uninterestingness.NIL != rest; rest = rest.rest()) {
            sibling_tactic = rest.first();
            if (!sibling_tactic.eql(tactic) && removal_tactician_uninterestingness.NIL != inference_worker_restriction.simplification_tactic_p(sibling_tactic)) {
                result = (SubLObject)removal_tactician_uninterestingness.T;
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 13661L)
    public static SubLObject removal_strategy_chooses_to_throw_away_linkP(final SubLObject strategy, final SubLObject link, SubLObject problem_already_consideredP) {
        if (problem_already_consideredP == removal_tactician_uninterestingness.UNPROVIDED) {
            problem_already_consideredP = (SubLObject)removal_tactician_uninterestingness.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_tactician_uninterestingness.NIL == problem_already_consideredP) {
            final SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
            if (removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_throw_away_problemP(strategy, problem, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED)) {
                final SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
                if (removal_tactician_uninterestingness.NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                    inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation((SubLObject)removal_tactician_uninterestingness.$kw13$LINK_SUPPORTED_PROBLEM_THROWN_AWAY, (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.NIL, link, subexplanation);
                }
                return (SubLObject)removal_tactician_uninterestingness.T;
            }
        }
        return (SubLObject)removal_tactician_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 14396L)
    public static SubLObject removal_strategy_chooses_to_set_aside_problemP(final SubLObject strategy, final SubLObject problem, SubLObject consider_all_tacticsP, SubLObject thrown_away_already_consideredP) {
        if (consider_all_tacticsP == removal_tactician_uninterestingness.UNPROVIDED) {
            consider_all_tacticsP = (SubLObject)removal_tactician_uninterestingness.T;
        }
        if (thrown_away_already_consideredP == removal_tactician_uninterestingness.UNPROVIDED) {
            thrown_away_already_consideredP = (SubLObject)removal_tactician_uninterestingness.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_tactician_uninterestingness.NIL;
        final SubLObject conditions = removal_strategy_compute_problem_uninterestingness_cache_conditions(consider_all_tacticsP, (SubLObject)removal_tactician_uninterestingness.$kw14$NOT_APPLICABLE, thrown_away_already_consideredP);
        final SubLObject cache_value = inference_datastructures_strategy.problem_set_aside_cache_status(problem, strategy, conditions);
        if (removal_tactician_uninterestingness.NIL != Types.booleanp(cache_value)) {
            result = cache_value;
        }
        if (removal_tactician_uninterestingness.T != cache_value && removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_set_aside_problem_uncacheableP(strategy, problem, consider_all_tacticsP, thrown_away_already_consideredP)) {
            return (SubLObject)removal_tactician_uninterestingness.T;
        }
        if (removal_tactician_uninterestingness.$kw0$RECOMPUTE == cache_value) {
            final SubLObject set_asideP = removal_strategy_chooses_to_set_aside_problem_cacheableP(strategy, problem, consider_all_tacticsP, thrown_away_already_consideredP);
            if (removal_tactician_uninterestingness.NIL != removal_tactician_uninterestingness.$removal_strategy_uses_uninterestingness_cacheP$.getDynamicValue(thread)) {
                if (removal_tactician_uninterestingness.NIL != set_asideP) {
                    inference_datastructures_strategy.set_problem_set_aside(problem, strategy, conditions);
                }
                else {
                    inference_datastructures_strategy.set_problem_not_set_aside(problem, strategy, conditions);
                }
            }
            result = set_asideP;
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 15710L)
    public static SubLObject removal_strategy_chooses_to_set_aside_problem_uncacheableP(final SubLObject strategy, final SubLObject problem, final SubLObject consider_all_tacticsP, final SubLObject thrown_away_already_consideredP) {
        return (SubLObject)removal_tactician_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 16020L)
    public static SubLObject removal_strategy_chooses_to_set_aside_problem_cacheableP(final SubLObject strategy, final SubLObject problem, final SubLObject consider_all_tacticsP, final SubLObject thrown_away_already_consideredP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_tactician_uninterestingness.NIL != removal_tactician_datastructures.removal_strategy_problem_set_asideP(strategy, problem)) {
            if (removal_tactician_uninterestingness.NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation((SubLObject)removal_tactician_uninterestingness.$kw15$PROBLEM_ALREADY_SET_ASIDE, problem, (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.NIL);
            }
            return (SubLObject)removal_tactician_uninterestingness.T;
        }
        if (removal_tactician_uninterestingness.NIL == thrown_away_already_consideredP && removal_tactician_uninterestingness.NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_set_aside_problemP(strategy, problem)) {
            if (removal_tactician_uninterestingness.NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation(inference_tactician_strategic_uninterestingness.why_simple_strategy_chooses_to_set_aside_problem(strategy, problem), (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.NIL);
            }
            return (SubLObject)removal_tactician_uninterestingness.T;
        }
        if (removal_tactician_uninterestingness.NIL != consider_all_tacticsP && removal_tactician_uninterestingness.NIL != inference_datastructures_strategy.strategically_possible_problem_p(problem, strategy) && removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_set_aside_all_tacticsP(strategy, problem, (SubLObject)removal_tactician_uninterestingness.T)) {
            if (removal_tactician_uninterestingness.NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation((SubLObject)removal_tactician_uninterestingness.$kw16$ALL_TACTICS_SET_ASIDE, problem, (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.NIL);
            }
            return (SubLObject)removal_tactician_uninterestingness.T;
        }
        return (SubLObject)removal_tactician_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 17262L)
    public static SubLObject removal_strategy_chooses_to_set_aside_strategemP(final SubLObject strategy, final SubLObject strategem, SubLObject problem_already_consideredP, SubLObject thrown_away_already_consideredP) {
        if (problem_already_consideredP == removal_tactician_uninterestingness.UNPROVIDED) {
            problem_already_consideredP = (SubLObject)removal_tactician_uninterestingness.NIL;
        }
        if (thrown_away_already_consideredP == removal_tactician_uninterestingness.UNPROVIDED) {
            thrown_away_already_consideredP = (SubLObject)removal_tactician_uninterestingness.NIL;
        }
        if (removal_tactician_uninterestingness.NIL != inference_datastructures_tactic.tactic_p(strategem)) {
            return removal_strategy_chooses_to_set_aside_tacticP(strategy, strategem, problem_already_consideredP, (SubLObject)removal_tactician_uninterestingness.NIL, thrown_away_already_consideredP);
        }
        return removal_strategy_chooses_to_set_aside_linkP(strategy, strategem, problem_already_consideredP, thrown_away_already_consideredP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 17801L)
    public static SubLObject removal_strategy_chooses_to_set_aside_tacticP(final SubLObject strategy, final SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP, SubLObject thrown_away_already_consideredP) {
        if (problem_already_consideredP == removal_tactician_uninterestingness.UNPROVIDED) {
            problem_already_consideredP = (SubLObject)removal_tactician_uninterestingness.NIL;
        }
        if (siblings_already_consideredP == removal_tactician_uninterestingness.UNPROVIDED) {
            siblings_already_consideredP = (SubLObject)removal_tactician_uninterestingness.NIL;
        }
        if (thrown_away_already_consideredP == removal_tactician_uninterestingness.UNPROVIDED) {
            thrown_away_already_consideredP = (SubLObject)removal_tactician_uninterestingness.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_tactician_uninterestingness.NIL;
        final SubLObject conditions = removal_strategy_compute_tactic_uninterestingness_cache_conditions(problem_already_consideredP, siblings_already_consideredP, (SubLObject)removal_tactician_uninterestingness.$kw14$NOT_APPLICABLE, thrown_away_already_consideredP);
        final SubLObject cache_value = inference_datastructures_strategy.tactic_set_aside_cache_status(tactic, strategy, conditions);
        if (removal_tactician_uninterestingness.NIL != Types.booleanp(cache_value)) {
            result = cache_value;
        }
        if (removal_tactician_uninterestingness.T != cache_value && removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_set_aside_tactic_uncacheableP(strategy, tactic, problem_already_consideredP, siblings_already_consideredP, thrown_away_already_consideredP)) {
            return (SubLObject)removal_tactician_uninterestingness.T;
        }
        if (removal_tactician_uninterestingness.$kw0$RECOMPUTE == cache_value) {
            final SubLObject set_asideP = removal_strategy_chooses_to_set_aside_tactic_cacheableP(strategy, tactic, problem_already_consideredP, siblings_already_consideredP, thrown_away_already_consideredP);
            if (removal_tactician_uninterestingness.NIL != removal_tactician_uninterestingness.$removal_strategy_uses_uninterestingness_cacheP$.getDynamicValue(thread)) {
                if (removal_tactician_uninterestingness.NIL != set_asideP) {
                    inference_datastructures_strategy.set_tactic_set_aside(tactic, strategy, conditions);
                }
                else {
                    inference_datastructures_strategy.set_tactic_not_set_aside(tactic, strategy, conditions);
                }
            }
            result = set_asideP;
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 19368L)
    public static SubLObject uninterestingness_cache_condition_as_boolean(final SubLObject condition) {
        if (removal_tactician_uninterestingness.NIL != Types.booleanp(condition)) {
            return condition;
        }
        if (condition == removal_tactician_uninterestingness.$kw14$NOT_APPLICABLE) {
            return (SubLObject)removal_tactician_uninterestingness.NIL;
        }
        Errors.error((SubLObject)removal_tactician_uninterestingness.$str17$Condition__A_not_handled_yet, condition);
        return (SubLObject)removal_tactician_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 19609L)
    public static SubLObject clear_removal_strategy_compute_tactic_uninterestingness_cache_conditions() {
        final SubLObject cs = removal_tactician_uninterestingness.$removal_strategy_compute_tactic_uninterestingness_cache_conditions_caching_state$.getGlobalValue();
        if (removal_tactician_uninterestingness.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)removal_tactician_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 19609L)
    public static SubLObject remove_removal_strategy_compute_tactic_uninterestingness_cache_conditions(final SubLObject problem_already_consideredP, final SubLObject siblings_already_consideredP, final SubLObject use_strategem_thrown_away_cacheP, final SubLObject thrown_away_already_consideredP) {
        return memoization_state.caching_state_remove_function_results_with_args(removal_tactician_uninterestingness.$removal_strategy_compute_tactic_uninterestingness_cache_conditions_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(problem_already_consideredP, siblings_already_consideredP, use_strategem_thrown_away_cacheP, thrown_away_already_consideredP), (SubLObject)removal_tactician_uninterestingness.UNPROVIDED, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 19609L)
    public static SubLObject removal_strategy_compute_tactic_uninterestingness_cache_conditions_internal(SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP, SubLObject use_strategem_thrown_away_cacheP, SubLObject thrown_away_already_consideredP) {
        problem_already_consideredP = uninterestingness_cache_condition_as_boolean(problem_already_consideredP);
        siblings_already_consideredP = uninterestingness_cache_condition_as_boolean(siblings_already_consideredP);
        use_strategem_thrown_away_cacheP = uninterestingness_cache_condition_as_boolean(use_strategem_thrown_away_cacheP);
        thrown_away_already_consideredP = uninterestingness_cache_condition_as_boolean(thrown_away_already_consideredP);
        final SubLObject consider_problemP = (SubLObject)SubLObjectFactory.makeBoolean(removal_tactician_uninterestingness.NIL == problem_already_consideredP);
        final SubLObject consider_siblingsP = (SubLObject)SubLObjectFactory.makeBoolean(removal_tactician_uninterestingness.NIL == siblings_already_consideredP);
        final SubLObject consider_thrown_awayP = (SubLObject)SubLObjectFactory.makeBoolean(removal_tactician_uninterestingness.NIL == thrown_away_already_consideredP);
        return (SubLObject)ConsesLow.list(consider_problemP, consider_siblingsP, use_strategem_thrown_away_cacheP, consider_thrown_awayP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 19609L)
    public static SubLObject removal_strategy_compute_tactic_uninterestingness_cache_conditions(final SubLObject problem_already_consideredP, final SubLObject siblings_already_consideredP, final SubLObject use_strategem_thrown_away_cacheP, final SubLObject thrown_away_already_consideredP) {
        SubLObject caching_state = removal_tactician_uninterestingness.$removal_strategy_compute_tactic_uninterestingness_cache_conditions_caching_state$.getGlobalValue();
        if (removal_tactician_uninterestingness.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)removal_tactician_uninterestingness.$sym18$REMOVAL_STRATEGY_COMPUTE_TACTIC_UNINTERESTINGNESS_CACHE_CONDITION, (SubLObject)removal_tactician_uninterestingness.$sym19$_REMOVAL_STRATEGY_COMPUTE_TACTIC_UNINTERESTINGNESS_CACHE_CONDITIO, (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.EQ, (SubLObject)removal_tactician_uninterestingness.FOUR_INTEGER, (SubLObject)removal_tactician_uninterestingness.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(problem_already_consideredP, siblings_already_consideredP, use_strategem_thrown_away_cacheP, thrown_away_already_consideredP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)removal_tactician_uninterestingness.NIL;
            collision = cdolist_list_var.first();
            while (removal_tactician_uninterestingness.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (problem_already_consideredP.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (siblings_already_consideredP.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (use_strategem_thrown_away_cacheP.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (removal_tactician_uninterestingness.NIL != cached_args && removal_tactician_uninterestingness.NIL == cached_args.rest() && thrown_away_already_consideredP.eql(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(removal_strategy_compute_tactic_uninterestingness_cache_conditions_internal(problem_already_consideredP, siblings_already_consideredP, use_strategem_thrown_away_cacheP, thrown_away_already_consideredP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(problem_already_consideredP, siblings_already_consideredP, use_strategem_thrown_away_cacheP, thrown_away_already_consideredP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 20872L)
    public static SubLObject clear_removal_strategy_compute_problem_uninterestingness_cache_conditions() {
        final SubLObject cs = removal_tactician_uninterestingness.$removal_strategy_compute_problem_uninterestingness_cache_conditions_caching_state$.getGlobalValue();
        if (removal_tactician_uninterestingness.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)removal_tactician_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 20872L)
    public static SubLObject remove_removal_strategy_compute_problem_uninterestingness_cache_conditions(final SubLObject consider_all_tacticsP, final SubLObject pending_implies_thrown_awayP, final SubLObject thrown_away_already_consideredP) {
        return memoization_state.caching_state_remove_function_results_with_args(removal_tactician_uninterestingness.$removal_strategy_compute_problem_uninterestingness_cache_conditions_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(consider_all_tacticsP, pending_implies_thrown_awayP, thrown_away_already_consideredP), (SubLObject)removal_tactician_uninterestingness.UNPROVIDED, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 20872L)
    public static SubLObject removal_strategy_compute_problem_uninterestingness_cache_conditions_internal(SubLObject consider_all_tacticsP, SubLObject pending_implies_thrown_awayP, SubLObject thrown_away_already_consideredP) {
        consider_all_tacticsP = uninterestingness_cache_condition_as_boolean(consider_all_tacticsP);
        pending_implies_thrown_awayP = uninterestingness_cache_condition_as_boolean(pending_implies_thrown_awayP);
        thrown_away_already_consideredP = uninterestingness_cache_condition_as_boolean(thrown_away_already_consideredP);
        final SubLObject consider_thrown_awayP = (SubLObject)SubLObjectFactory.makeBoolean(removal_tactician_uninterestingness.NIL == thrown_away_already_consideredP);
        return (SubLObject)ConsesLow.list(consider_all_tacticsP, pending_implies_thrown_awayP, consider_thrown_awayP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 20872L)
    public static SubLObject removal_strategy_compute_problem_uninterestingness_cache_conditions(final SubLObject consider_all_tacticsP, final SubLObject pending_implies_thrown_awayP, final SubLObject thrown_away_already_consideredP) {
        SubLObject caching_state = removal_tactician_uninterestingness.$removal_strategy_compute_problem_uninterestingness_cache_conditions_caching_state$.getGlobalValue();
        if (removal_tactician_uninterestingness.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)removal_tactician_uninterestingness.$sym20$REMOVAL_STRATEGY_COMPUTE_PROBLEM_UNINTERESTINGNESS_CACHE_CONDITIO, (SubLObject)removal_tactician_uninterestingness.$sym21$_REMOVAL_STRATEGY_COMPUTE_PROBLEM_UNINTERESTINGNESS_CACHE_CONDITI, (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.EQ, (SubLObject)removal_tactician_uninterestingness.THREE_INTEGER, (SubLObject)removal_tactician_uninterestingness.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(consider_all_tacticsP, pending_implies_thrown_awayP, thrown_away_already_consideredP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)removal_tactician_uninterestingness.NIL;
            collision = cdolist_list_var.first();
            while (removal_tactician_uninterestingness.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (consider_all_tacticsP.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pending_implies_thrown_awayP.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (removal_tactician_uninterestingness.NIL != cached_args && removal_tactician_uninterestingness.NIL == cached_args.rest() && thrown_away_already_consideredP.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(removal_strategy_compute_problem_uninterestingness_cache_conditions_internal(consider_all_tacticsP, pending_implies_thrown_awayP, thrown_away_already_consideredP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(consider_all_tacticsP, pending_implies_thrown_awayP, thrown_away_already_consideredP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 21825L)
    public static SubLObject removal_strategy_chooses_to_set_aside_tactic_uncacheableP(final SubLObject strategy, final SubLObject tactic, final SubLObject problem_already_consideredP, final SubLObject siblings_already_consideredP, final SubLObject thrown_away_already_consideredP) {
        return (SubLObject)removal_tactician_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 22202L)
    public static SubLObject removal_strategy_chooses_to_set_aside_tactic_cacheableP(final SubLObject strategy, final SubLObject tactic, final SubLObject problem_already_consideredP, final SubLObject siblings_already_consideredP, final SubLObject thrown_away_already_consideredP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_tactician_uninterestingness.NIL != removal_strategy_tactic_set_asideP(strategy, tactic)) {
            if (removal_tactician_uninterestingness.NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation((SubLObject)removal_tactician_uninterestingness.$kw22$TACTIC_ALREADY_SET_ASIDE, (SubLObject)removal_tactician_uninterestingness.NIL, tactic, (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.NIL);
            }
            return (SubLObject)removal_tactician_uninterestingness.T;
        }
        if (removal_tactician_uninterestingness.NIL != inference_worker_join_ordered.join_ordered_tactic_p(tactic) && removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_set_aside_join_ordered_tactic_due_to_conjunctive_removalP(strategy, tactic, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED)) {
            if (removal_tactician_uninterestingness.NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation((SubLObject)removal_tactician_uninterestingness.$kw23$JOIN_ORDERED_TACTIC_LEADS_TO_SET_ASIDE_CONJUNCTIVE_REMOVALS, (SubLObject)removal_tactician_uninterestingness.NIL, tactic, (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.NIL);
            }
            return (SubLObject)removal_tactician_uninterestingness.T;
        }
        if (removal_tactician_uninterestingness.NIL == problem_already_consideredP) {
            final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
            if (removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_set_aside_problemP(strategy, problem, (SubLObject)removal_tactician_uninterestingness.NIL, thrown_away_already_consideredP)) {
                final SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
                if (removal_tactician_uninterestingness.NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                    inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation((SubLObject)removal_tactician_uninterestingness.$kw24$TACTIC_SET_ASIDE_BECAUSE_PROBLEM_SET_ASIDE, (SubLObject)removal_tactician_uninterestingness.NIL, tactic, (SubLObject)removal_tactician_uninterestingness.NIL, subexplanation);
                }
                return (SubLObject)removal_tactician_uninterestingness.T;
            }
        }
        if (removal_tactician_uninterestingness.NIL != inference_worker.logical_tactic_p(tactic) && removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_set_aside_tactic_lookahead_problemP(strategy, tactic)) {
            final SubLObject subexplanation2 = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
            if (removal_tactician_uninterestingness.NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation((SubLObject)removal_tactician_uninterestingness.$kw25$TACTIC_SET_ASIDE_BECAUSE_LOOKAHEAD_PROBLEM_SET_ASIDE, (SubLObject)removal_tactician_uninterestingness.NIL, tactic, (SubLObject)removal_tactician_uninterestingness.NIL, subexplanation2);
            }
            return (SubLObject)removal_tactician_uninterestingness.T;
        }
        if (removal_tactician_uninterestingness.NIL == siblings_already_consideredP && removal_tactician_uninterestingness.NIL != inference_worker_split.split_tactic_p(tactic) && removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_set_aside_split_tacticP(strategy, tactic)) {
            return (SubLObject)removal_tactician_uninterestingness.T;
        }
        if (removal_tactician_uninterestingness.NIL == thrown_away_already_consideredP && removal_tactician_uninterestingness.NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_set_aside_tacticP(strategy, tactic)) {
            if (removal_tactician_uninterestingness.NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation(inference_tactician_strategic_uninterestingness.why_simple_strategy_chooses_to_set_aside_tactic(strategy, tactic), (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.NIL);
            }
            return (SubLObject)removal_tactician_uninterestingness.T;
        }
        return (SubLObject)removal_tactician_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 25154L)
    public static SubLObject removal_strategy_chooses_to_set_aside_linkP(final SubLObject strategy, final SubLObject link, SubLObject problem_already_consideredP, SubLObject thrown_away_already_consideredP) {
        if (problem_already_consideredP == removal_tactician_uninterestingness.UNPROVIDED) {
            problem_already_consideredP = (SubLObject)removal_tactician_uninterestingness.NIL;
        }
        if (thrown_away_already_consideredP == removal_tactician_uninterestingness.UNPROVIDED) {
            thrown_away_already_consideredP = (SubLObject)removal_tactician_uninterestingness.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_tactician_uninterestingness.NIL == problem_already_consideredP) {
            final SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
            if (removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_set_aside_problemP(strategy, problem, (SubLObject)removal_tactician_uninterestingness.T, thrown_away_already_consideredP)) {
                final SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
                if (removal_tactician_uninterestingness.NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                    inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation((SubLObject)removal_tactician_uninterestingness.$kw26$LINK_SUPPORTED_PROBLEM_SET_ASIDE, (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.NIL, link, subexplanation);
                }
                return (SubLObject)removal_tactician_uninterestingness.T;
            }
        }
        return (SubLObject)removal_tactician_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 25949L)
    public static SubLObject removal_strategy_chooses_to_ignore_problemP(final SubLObject strategy, final SubLObject problem) {
        return list_utilities.sublisp_boolean(why_removal_strategy_chooses_to_ignore_problem(strategy, problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 26127L)
    public static SubLObject why_removal_strategy_chooses_to_ignore_problem(final SubLObject strategy, final SubLObject problem) {
        if (removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_throw_away_problemP(strategy, problem, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED)) {
            return (SubLObject)removal_tactician_uninterestingness.$kw27$THROW_AWAY;
        }
        if (removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_set_aside_problemP(strategy, problem, (SubLObject)removal_tactician_uninterestingness.T, (SubLObject)removal_tactician_uninterestingness.T)) {
            return (SubLObject)removal_tactician_uninterestingness.$kw28$SET_ASIDE;
        }
        if (removal_tactician_uninterestingness.NIL == inference_datastructures_problem.problem_relevant_to_strategyP(problem, strategy)) {
            return (SubLObject)removal_tactician_uninterestingness.$kw29$IRRELEVANT;
        }
        return (SubLObject)removal_tactician_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 26557L)
    public static SubLObject removal_strategy_chooses_to_ignore_strategemP(final SubLObject strategy, final SubLObject strategem) {
        return list_utilities.sublisp_boolean(why_removal_strategy_chooses_to_ignore_strategem(strategy, strategem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 26732L)
    public static SubLObject why_removal_strategy_chooses_to_ignore_strategem(final SubLObject strategy, final SubLObject strategem) {
        if (removal_tactician_uninterestingness.NIL != inference_tactician.strategem_invalid_p(strategem)) {
            return (SubLObject)removal_tactician_uninterestingness.$kw30$INVALID;
        }
        if ((removal_tactician_uninterestingness.NIL != inference_worker.content_tactic_p(strategem) || removal_tactician_uninterestingness.NIL != inference_worker_join_ordered.join_ordered_tactic_p(strategem)) && removal_tactician_uninterestingness.NIL != inference_datastructures_tactic.tactic_not_possibleP(strategem)) {
            return (SubLObject)removal_tactician_uninterestingness.$kw27$THROW_AWAY;
        }
        if (removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_throw_away_strategemP(strategy, strategem, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED)) {
            return (SubLObject)removal_tactician_uninterestingness.$kw27$THROW_AWAY;
        }
        if (removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_set_aside_strategemP(strategy, strategem, (SubLObject)removal_tactician_uninterestingness.NIL, (SubLObject)removal_tactician_uninterestingness.T)) {
            return (SubLObject)removal_tactician_uninterestingness.$kw28$SET_ASIDE;
        }
        if (removal_tactician_uninterestingness.NIL == inference_datastructures_problem.problem_relevant_to_strategyP(inference_tactician.strategem_problem(strategem), strategy)) {
            return (SubLObject)removal_tactician_uninterestingness.$kw29$IRRELEVANT;
        }
        return (SubLObject)removal_tactician_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 27395L)
    public static SubLObject removal_strategy_chooses_to_ignore_tacticP(final SubLObject strategy, final SubLObject tactic) {
        return removal_strategy_chooses_to_ignore_strategemP(strategy, tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 27550L)
    public static SubLObject removal_strategy_chooses_to_ignore_linkP(final SubLObject strategy, final SubLObject link) {
        return removal_strategy_chooses_to_ignore_strategemP(strategy, link);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 27699L)
    public static SubLObject removal_strategy_chooses_to_throw_away_all_tacticsP(final SubLObject strategy, final SubLObject problem, SubLObject problem_already_consideredP, SubLObject pending_implies_thrown_awayP) {
        if (problem_already_consideredP == removal_tactician_uninterestingness.UNPROVIDED) {
            problem_already_consideredP = (SubLObject)removal_tactician_uninterestingness.NIL;
        }
        if (pending_implies_thrown_awayP == removal_tactician_uninterestingness.UNPROVIDED) {
            pending_implies_thrown_awayP = (SubLObject)removal_tactician_uninterestingness.NIL;
        }
        if (removal_tactician_uninterestingness.NIL == problem_already_consideredP && removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_throw_away_problemP(strategy, problem, (SubLObject)removal_tactician_uninterestingness.NIL, pending_implies_thrown_awayP)) {
            return (SubLObject)removal_tactician_uninterestingness.T;
        }
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = (SubLObject)removal_tactician_uninterestingness.NIL;
        tactic = cdolist_list_var.first();
        while (removal_tactician_uninterestingness.NIL != cdolist_list_var) {
            if (removal_tactician_uninterestingness.NIL == removal_strategy_chooses_to_throw_away_tacticP(strategy, tactic, (SubLObject)removal_tactician_uninterestingness.T, (SubLObject)removal_tactician_uninterestingness.NIL, pending_implies_thrown_awayP)) {
                return (SubLObject)removal_tactician_uninterestingness.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return (SubLObject)removal_tactician_uninterestingness.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 28215L)
    public static SubLObject removal_strategy_chooses_to_set_aside_all_tacticsP(final SubLObject strategy, final SubLObject problem, SubLObject problem_already_consideredP) {
        if (problem_already_consideredP == removal_tactician_uninterestingness.UNPROVIDED) {
            problem_already_consideredP = (SubLObject)removal_tactician_uninterestingness.NIL;
        }
        if (removal_tactician_uninterestingness.NIL == problem_already_consideredP && removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_set_aside_problemP(strategy, problem, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED)) {
            return (SubLObject)removal_tactician_uninterestingness.T;
        }
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = (SubLObject)removal_tactician_uninterestingness.NIL;
        tactic = cdolist_list_var.first();
        while (removal_tactician_uninterestingness.NIL != cdolist_list_var) {
            if (removal_tactician_uninterestingness.NIL == removal_strategy_chooses_to_set_aside_tacticP(strategy, tactic, (SubLObject)removal_tactician_uninterestingness.T, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED)) {
                return (SubLObject)removal_tactician_uninterestingness.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return (SubLObject)removal_tactician_uninterestingness.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 28619L)
    public static SubLObject removal_strategy_chooses_to_set_aside_all_conjunctive_removal_tacticsP(final SubLObject strategy, final SubLObject problem, SubLObject problem_already_consideredP) {
        if (problem_already_consideredP == removal_tactician_uninterestingness.UNPROVIDED) {
            problem_already_consideredP = (SubLObject)removal_tactician_uninterestingness.NIL;
        }
        if (removal_tactician_uninterestingness.NIL == problem_already_consideredP && removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_set_aside_problemP(strategy, problem, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED)) {
            return (SubLObject)removal_tactician_uninterestingness.T;
        }
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = (SubLObject)removal_tactician_uninterestingness.NIL;
        tactic = cdolist_list_var.first();
        while (removal_tactician_uninterestingness.NIL != cdolist_list_var) {
            if (removal_tactician_uninterestingness.NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, (SubLObject)removal_tactician_uninterestingness.$kw31$REMOVAL_CONJUNCTIVE) && removal_tactician_uninterestingness.NIL == removal_strategy_chooses_to_set_aside_tacticP(strategy, tactic, (SubLObject)removal_tactician_uninterestingness.T, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED)) {
                return (SubLObject)removal_tactician_uninterestingness.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return (SubLObject)removal_tactician_uninterestingness.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 29098L)
    public static SubLObject removal_strategy_chooses_to_set_aside_join_ordered_tactic_due_to_conjunctive_removalP(final SubLObject strategy, final SubLObject jo_tactic, SubLObject problem_already_consideredP) {
        if (problem_already_consideredP == removal_tactician_uninterestingness.UNPROVIDED) {
            problem_already_consideredP = (SubLObject)removal_tactician_uninterestingness.NIL;
        }
        final SubLObject lookahead_problem = inference_worker_join_ordered.join_ordered_tactic_lookahead_problem(jo_tactic);
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_tactician_uninterestingness.NIL == inference_datastructures_problem.single_literal_problem_p(lookahead_problem) && removal_tactician_uninterestingness.NIL != inference_datastructures_problem.problem_has_tactic_of_typeP(lookahead_problem, (SubLObject)removal_tactician_uninterestingness.$kw31$REMOVAL_CONJUNCTIVE) && removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_set_aside_all_conjunctive_removal_tacticsP(strategy, lookahead_problem, problem_already_consideredP));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 29626L)
    public static SubLObject removal_strategy_chooses_to_throw_away_disjunctive_linkP(final SubLObject strategy, final SubLObject link) {
        final SubLObject tactic = inference_worker.disjunctive_link_tactic(link);
        if (removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_throw_away_tacticP(strategy, tactic, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED)) {
            return (SubLObject)removal_tactician_uninterestingness.T;
        }
        return (SubLObject)removal_tactician_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 29862L)
    public static SubLObject removal_strategy_chooses_to_set_aside_disjunctive_linkP(final SubLObject strategy, final SubLObject link) {
        final SubLObject tactic = inference_worker.disjunctive_link_tactic(link);
        if (removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_set_aside_tacticP(strategy, tactic, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED)) {
            return (SubLObject)removal_tactician_uninterestingness.T;
        }
        return (SubLObject)removal_tactician_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 30095L)
    public static SubLObject removal_strategy_chooses_to_throw_away_connected_conjunction_linkP(final SubLObject strategy, final SubLObject link) {
        final SubLObject tactic = inference_worker.connected_conjunction_link_tactic(link);
        if (removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_throw_away_tacticP(strategy, tactic, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED)) {
            return (SubLObject)removal_tactician_uninterestingness.T;
        }
        return (SubLObject)removal_tactician_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 30350L)
    public static SubLObject removal_strategy_chooses_to_set_aside_connected_conjunction_linkP(final SubLObject strategy, final SubLObject link) {
        final SubLObject tactic = inference_worker.connected_conjunction_link_tactic(link);
        if (removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_set_aside_tacticP(strategy, tactic, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED)) {
            return (SubLObject)removal_tactician_uninterestingness.T;
        }
        return (SubLObject)removal_tactician_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 30603L)
    public static SubLObject removal_strategy_chooses_to_totally_throw_away_tacticP(final SubLObject strategy, final SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP) {
        if (problem_already_consideredP == removal_tactician_uninterestingness.UNPROVIDED) {
            problem_already_consideredP = (SubLObject)removal_tactician_uninterestingness.NIL;
        }
        if (siblings_already_consideredP == removal_tactician_uninterestingness.UNPROVIDED) {
            siblings_already_consideredP = (SubLObject)removal_tactician_uninterestingness.NIL;
        }
        return inference_datastructures_strategy.controlling_strategy_callback(strategy, (SubLObject)removal_tactician_uninterestingness.$kw32$SUBSTRATEGY_TOTALLY_THROW_AWAY_TACTIC, tactic, problem_already_consideredP, siblings_already_consideredP, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 30913L)
    public static SubLObject removal_strategy_chooses_to_totally_ignore_tacticP(final SubLObject strategy, final SubLObject tactic) {
        return (SubLObject)removal_tactician_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 31121L)
    public static SubLObject removal_strategy_chooses_to_throw_away_tactic_hl_moduleP(final SubLObject strategy, final SubLObject tactic) {
        if (removal_tactician_uninterestingness.NIL != inference_worker_transformation.transformation_tactic_p(tactic)) {
            return (SubLObject)removal_tactician_uninterestingness.T;
        }
        return (SubLObject)removal_tactician_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 31400L)
    public static SubLObject removal_strategy_preferred_backchain_required_join_ordered_tactic(final SubLObject strategy, final SubLObject problem) {
        if (removal_tactician_uninterestingness.NIL == inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_problem.problem_store(problem))) {
            return (SubLObject)removal_tactician_uninterestingness.NIL;
        }
        final SubLObject transformation_strategy = striping_tactician.sibling_transformation_strategy(strategy);
        return transformation_tactician_uninterestingness.transformation_strategy_preferred_backchain_required_join_ordered_tactic(transformation_strategy, problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 31835L)
    public static SubLObject removal_strategy_problem_pending_and_not_set_asideP(final SubLObject strategy, final SubLObject problem) {
        assert removal_tactician_uninterestingness.NIL != removal_tactician.removal_strategy_p(strategy) : strategy;
        assert removal_tactician_uninterestingness.NIL != inference_datastructures_problem.problem_p(problem) : problem;
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_tactician_uninterestingness.NIL != removal_tactician_datastructures.removal_strategy_problem_pendingP(strategy, problem) && removal_tactician_uninterestingness.NIL == removal_tactician_datastructures.removal_strategy_problem_set_asideP(strategy, problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 32303L)
    public static SubLObject removal_strategy_tactic_thrown_awayP(final SubLObject strategy, final SubLObject tactic) {
        return removal_tactician_datastructures.removal_strategy_strategem_thrown_awayP(strategy, tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 32442L)
    public static SubLObject removal_strategy_tactic_set_asideP(final SubLObject strategy, final SubLObject tactic) {
        return removal_tactician_datastructures.removal_strategy_strategem_set_asideP(strategy, tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 32577L)
    public static SubLObject removal_strategy_chooses_to_throw_away_tactic_lookahead_problemP(final SubLObject strategy, final SubLObject logical_tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_tactician_uninterestingness.NIL != inference_worker_join.join_tactic_p(logical_tactic)) {
            thread.resetMultipleValues();
            final SubLObject first_problem = inference_worker_join.join_tactic_lookahead_problems(logical_tactic);
            final SubLObject second_problem = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (removal_tactician_uninterestingness.NIL == first_problem || removal_tactician_uninterestingness.NIL == second_problem) {
                return (SubLObject)removal_tactician_uninterestingness.NIL;
            }
            if (removal_tactician_uninterestingness.NIL != inference_datastructures_strategy.strategically_good_problem_p(first_problem, strategy) || removal_tactician_uninterestingness.NIL != inference_datastructures_strategy.strategically_good_problem_p(second_problem, strategy)) {
                return (SubLObject)removal_tactician_uninterestingness.NIL;
            }
            if (removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_throw_away_lookahead_problemP(strategy, first_problem) || removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_throw_away_lookahead_problemP(strategy, second_problem)) {
                return (SubLObject)removal_tactician_uninterestingness.T;
            }
        }
        else {
            final SubLObject lookahead_problem = inference_worker.logical_tactic_lookahead_problem(logical_tactic);
            if (removal_tactician_uninterestingness.NIL != inference_datastructures_strategy.strategically_good_problem_p(lookahead_problem, strategy)) {
                return (SubLObject)removal_tactician_uninterestingness.NIL;
            }
            if (removal_tactician_uninterestingness.NIL != lookahead_problem) {
                if (removal_tactician_uninterestingness.NIL != inference_worker_union.union_tactic_p(logical_tactic)) {
                    inference_worker.determine_strategic_status_wrt(lookahead_problem, strategy);
                }
                if (removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_throw_away_lookahead_problemP(strategy, lookahead_problem)) {
                    return (SubLObject)removal_tactician_uninterestingness.T;
                }
            }
        }
        return (SubLObject)removal_tactician_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 34372L)
    public static SubLObject removal_strategy_chooses_to_throw_away_lookahead_problemP(final SubLObject strategy, final SubLObject lookahead_problem) {
        SubLObject v_answer = (SubLObject)removal_tactician_uninterestingness.NIL;
        final SubLObject pending_implies_thrown_awayP = (SubLObject)SubLObjectFactory.makeBoolean(removal_tactician_uninterestingness.NIL != inference_datastructures_problem.single_literal_problem_p(lookahead_problem) && removal_tactician_uninterestingness.NIL != inference_datastructures_problem.closed_problem_p(lookahead_problem));
        v_answer = removal_strategy_chooses_to_throw_away_problemP(strategy, lookahead_problem, (SubLObject)removal_tactician_uninterestingness.T, pending_implies_thrown_awayP);
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 34935L)
    public static SubLObject removal_strategy_chooses_to_throw_away_split_tacticP(final SubLObject strategy, final SubLObject split_tactic) {
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(inference_datastructures_tactic.tactic_problem(split_tactic));
        SubLObject sibling_tactic = (SubLObject)removal_tactician_uninterestingness.NIL;
        sibling_tactic = cdolist_list_var.first();
        while (removal_tactician_uninterestingness.NIL != cdolist_list_var) {
            if (removal_tactician_uninterestingness.NIL != inference_datastructures_problem.do_problem_tactics_type_match(sibling_tactic, (SubLObject)removal_tactician_uninterestingness.$kw35$SPLIT) && !sibling_tactic.eql(split_tactic)) {
                if (removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_throw_away_sibling_split_tacticP(strategy, split_tactic, sibling_tactic)) {
                    return (SubLObject)removal_tactician_uninterestingness.T;
                }
                final SubLObject lookahead_problem = inference_worker_split.split_tactic_lookahead_problem(sibling_tactic);
                return (SubLObject)SubLObjectFactory.makeBoolean(removal_tactician_uninterestingness.NIL == inference_worker.good_problem_p(lookahead_problem, strategy) && removal_tactician_uninterestingness.NIL != ((removal_tactician_uninterestingness.NIL != inference_tactician.substrategyP(strategy)) ? inference_worker.totally_finished_problem_p(lookahead_problem, strategy) : inference_worker.finished_problem_p(lookahead_problem, strategy)));
            }
            else {
                cdolist_list_var = cdolist_list_var.rest();
                sibling_tactic = cdolist_list_var.first();
            }
        }
        return (SubLObject)removal_tactician_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 35862L)
    public static SubLObject removal_strategy_chooses_to_throw_away_sibling_split_tacticP(final SubLObject strategy, final SubLObject split_tactic, final SubLObject sibling_tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_tactician_uninterestingness.NIL;
        final SubLObject _prev_bind_0 = inference_tactician.$set_aside_non_continuable_implies_throw_away_for_removalP$.currentBinding(thread);
        try {
            inference_tactician.$set_aside_non_continuable_implies_throw_away_for_removalP$.bind((SubLObject)removal_tactician_uninterestingness.NIL, thread);
            if (removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_totally_throw_away_tacticP(strategy, sibling_tactic, (SubLObject)removal_tactician_uninterestingness.T, (SubLObject)removal_tactician_uninterestingness.T)) {
                final SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
                if (removal_tactician_uninterestingness.NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                    inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation((SubLObject)removal_tactician_uninterestingness.$kw36$SPLIT_TACTIC_THROWN_AWAY_BECAUSE_SIBLING_TACTIC_THROWN_AWAY, (SubLObject)removal_tactician_uninterestingness.NIL, split_tactic, (SubLObject)removal_tactician_uninterestingness.NIL, subexplanation);
                }
                result = (SubLObject)removal_tactician_uninterestingness.T;
            }
        }
        finally {
            inference_tactician.$set_aside_non_continuable_implies_throw_away_for_removalP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 36875L)
    public static SubLObject removal_strategy_chooses_not_to_activate_any_strategems_on_problemP(final SubLObject strategy, final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject resultP = (SubLObject)removal_tactician_uninterestingness.NIL;
        final SubLObject _prev_bind_0 = inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.currentBinding(thread);
        try {
            inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.bind((SubLObject)removal_tactician_uninterestingness.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject strategems_to_activate = removal_tactician_motivation.removal_strategy_categorize_strategems(strategy, problem);
            final SubLObject strategems_to_set_aside = thread.secondMultipleValue();
            final SubLObject strategems_to_throw_away = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            resultP = Types.sublisp_null(strategems_to_activate);
        }
        finally {
            inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.rebind(_prev_bind_0, thread);
        }
        return resultP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 37369L)
    public static SubLObject removal_strategy_chooses_to_set_aside_tactic_lookahead_problemP(final SubLObject strategy, final SubLObject logical_tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_tactician_uninterestingness.NIL != inference_worker_join.join_tactic_p(logical_tactic)) {
            thread.resetMultipleValues();
            final SubLObject first_problem = inference_worker_join.join_tactic_lookahead_problems(logical_tactic);
            final SubLObject second_problem = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (removal_tactician_uninterestingness.NIL == first_problem || removal_tactician_uninterestingness.NIL == second_problem) {
                return (SubLObject)removal_tactician_uninterestingness.NIL;
            }
            if (removal_tactician_uninterestingness.NIL != inference_datastructures_strategy.strategically_good_problem_p(first_problem, strategy) || removal_tactician_uninterestingness.NIL != inference_datastructures_strategy.strategically_good_problem_p(second_problem, strategy)) {
                return (SubLObject)removal_tactician_uninterestingness.NIL;
            }
            if (removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_set_aside_problemP(strategy, first_problem, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED) || removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_set_aside_problemP(strategy, second_problem, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED)) {
                return (SubLObject)removal_tactician_uninterestingness.T;
            }
        }
        else {
            final SubLObject lookahead_problem = inference_worker.logical_tactic_lookahead_problem(logical_tactic);
            if (removal_tactician_uninterestingness.NIL != inference_datastructures_strategy.strategically_good_problem_p(lookahead_problem, strategy)) {
                return (SubLObject)removal_tactician_uninterestingness.NIL;
            }
            if (removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_set_aside_problemP(strategy, lookahead_problem, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED)) {
                return (SubLObject)removal_tactician_uninterestingness.T;
            }
        }
        return (SubLObject)removal_tactician_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 38709L)
    public static SubLObject removal_strategy_chooses_to_set_aside_split_tacticP(final SubLObject strategy, final SubLObject split_tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(inference_datastructures_tactic.tactic_problem(split_tactic));
        SubLObject sibling_tactic = (SubLObject)removal_tactician_uninterestingness.NIL;
        sibling_tactic = cdolist_list_var.first();
        while (removal_tactician_uninterestingness.NIL != cdolist_list_var) {
            if (removal_tactician_uninterestingness.NIL != inference_datastructures_problem.do_problem_tactics_type_match(sibling_tactic, (SubLObject)removal_tactician_uninterestingness.$kw35$SPLIT) && !sibling_tactic.eql(split_tactic) && removal_tactician_uninterestingness.NIL != controlling_strategy_allows_split_tactic_to_be_set_asideP(strategy, sibling_tactic)) {
                final SubLObject lookahead_problem = inference_worker_split.split_tactic_lookahead_problem(sibling_tactic);
                if ((removal_tactician_uninterestingness.NIL != inference_worker.totally_finished_problem_p(lookahead_problem, strategy) && removal_tactician_uninterestingness.NIL == inference_worker.good_problem_p(lookahead_problem, strategy)) || removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_throw_away_tacticP(strategy, sibling_tactic, (SubLObject)removal_tactician_uninterestingness.T, (SubLObject)removal_tactician_uninterestingness.T, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED)) {
                    final SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
                    if (removal_tactician_uninterestingness.NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                        inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation((SubLObject)removal_tactician_uninterestingness.$kw37$SPLIT_TACTIC_SET_ASIDE_BECAUSE_SIBLING_TACTIC_THROWN_AWAY, (SubLObject)removal_tactician_uninterestingness.NIL, split_tactic, (SubLObject)removal_tactician_uninterestingness.NIL, subexplanation);
                    }
                    return (SubLObject)removal_tactician_uninterestingness.T;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            sibling_tactic = cdolist_list_var.first();
        }
        return (SubLObject)removal_tactician_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 39945L)
    public static SubLObject controlling_strategy_allows_split_tactic_to_be_set_asideP(final SubLObject strategy, final SubLObject split_tactic) {
        if (removal_tactician_uninterestingness.NIL != inference_tactician.substrategyP(strategy)) {
            return inference_datastructures_strategy.controlling_strategy_callback(strategy, (SubLObject)removal_tactician_uninterestingness.$kw38$SUBSTRATEGY_ALLOW_SPLIT_TACTIC_SET_ASIDE_WRT_REMOVAL, split_tactic, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED, (SubLObject)removal_tactician_uninterestingness.UNPROVIDED);
        }
        return (SubLObject)removal_tactician_uninterestingness.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 40213L)
    public static SubLObject removal_strategy_chooses_to_throw_away_meta_removal_tacticP(final SubLObject strategy, final SubLObject meta_removal_tactic) {
        return inference_chooses_to_throw_away_meta_removal_tacticP(inference_datastructures_strategy.strategy_inference(strategy), meta_removal_tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 40651L)
    public static SubLObject inference_chooses_to_throw_away_meta_removal_tacticP(final SubLObject inference, final SubLObject meta_removal_tactic) {
        if (removal_tactician_uninterestingness.NIL != inference_worker_removal.meta_removal_tactic_p(meta_removal_tactic)) {
            SubLObject sibling_disallowed_tacticP;
            SubLObject rest;
            SubLObject removal_tactic;
            for (sibling_disallowed_tacticP = (SubLObject)removal_tactician_uninterestingness.NIL, rest = (SubLObject)removal_tactician_uninterestingness.NIL, rest = inference_datastructures_problem.problem_tactics(inference_datastructures_tactic.tactic_problem(meta_removal_tactic)); removal_tactician_uninterestingness.NIL == sibling_disallowed_tacticP && removal_tactician_uninterestingness.NIL != rest; rest = rest.rest()) {
                removal_tactic = rest.first();
                if (removal_tactician_uninterestingness.NIL != inference_datastructures_problem.do_problem_tactics_type_match(removal_tactic, (SubLObject)removal_tactician_uninterestingness.$kw39$GENERALIZED_REMOVAL) && removal_tactician_uninterestingness.NIL != inference_datastructures_problem.do_problem_tactics_status_match(removal_tactic, (SubLObject)removal_tactician_uninterestingness.$kw40$POSSIBLE) && !removal_tactic.eql(meta_removal_tactic) && removal_tactician_uninterestingness.NIL == inference_datastructures_inference.inference_allows_use_of_moduleP(inference, inference_datastructures_tactic.tactic_hl_module(removal_tactic))) {
                    sibling_disallowed_tacticP = (SubLObject)removal_tactician_uninterestingness.T;
                }
            }
            return sibling_disallowed_tacticP;
        }
        return (SubLObject)removal_tactician_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 41312L)
    public static SubLObject removal_strategy_throw_away_uninteresting_set_asides(final SubLObject strategy) {
        SubLObject total_thrown_away_count;
        SubLObject thrown_away_count;
        for (total_thrown_away_count = (SubLObject)removal_tactician_uninterestingness.ZERO_INTEGER, thrown_away_count = removal_strategy_throw_away_uninteresting_set_asides_int(strategy), total_thrown_away_count = Numbers.add(total_thrown_away_count, thrown_away_count); thrown_away_count.isPositive(); thrown_away_count = removal_strategy_throw_away_uninteresting_set_asides_int(strategy), total_thrown_away_count = Numbers.add(total_thrown_away_count, thrown_away_count)) {}
        return total_thrown_away_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 42000L)
    public static SubLObject removal_strategy_throw_away_uninteresting_set_asides_int(final SubLObject strategy) {
        final SubLObject set_aside_problems = removal_strategy_set_aside_problems_to_reconsider(strategy);
        inference_datastructures_strategy.strategy_clear_set_asides(strategy);
        SubLObject thrown_away_count = (SubLObject)removal_tactician_uninterestingness.ZERO_INTEGER;
        SubLObject cdolist_list_var = set_aside_problems;
        SubLObject set_aside_problem = (SubLObject)removal_tactician_uninterestingness.NIL;
        set_aside_problem = cdolist_list_var.first();
        while (removal_tactician_uninterestingness.NIL != cdolist_list_var) {
            if (removal_tactician_uninterestingness.NIL != removal_strategy_chooses_to_leave_problem_set_asideP(strategy, set_aside_problem)) {
                inference_tactician.strategy_make_problem_set_aside(strategy, set_aside_problem);
            }
            else {
                thrown_away_count = Numbers.add(thrown_away_count, (SubLObject)removal_tactician_uninterestingness.ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            set_aside_problem = cdolist_list_var.first();
        }
        return thrown_away_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 42527L)
    public static SubLObject removal_strategy_chooses_to_leave_problem_set_asideP(final SubLObject strategy, final SubLObject set_aside_problem) {
        return Equality.eq((SubLObject)removal_tactician_uninterestingness.$kw28$SET_ASIDE, why_removal_strategy_chooses_to_ignore_problem(strategy, set_aside_problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 42727L)
    public static SubLObject removal_strategy_reconsider_set_asides(final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        removal_tactician_datastructures.removal_strategy_clear_set_aside_problems(strategy);
        SubLObject reactivated_count = (SubLObject)removal_tactician_uninterestingness.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = inference_worker.$reconsidering_set_asidesP$.currentBinding(thread);
        try {
            inference_worker.$reconsidering_set_asidesP$.bind((SubLObject)removal_tactician_uninterestingness.T, thread);
            final SubLObject set_aside_problems = inference_datastructures_strategy.strategy_all_valid_set_aside_problems(strategy);
            inference_datastructures_strategy.strategy_clear_set_asides(strategy);
            SubLObject cdolist_list_var;
            final SubLObject set_aside_problems_in_order = cdolist_list_var = Sort.sort(set_aside_problems, Symbols.symbol_function((SubLObject)removal_tactician_uninterestingness.$sym41$_), Symbols.symbol_function((SubLObject)removal_tactician_uninterestingness.$sym42$PROBLEM_SUID));
            SubLObject set_aside_problem = (SubLObject)removal_tactician_uninterestingness.NIL;
            set_aside_problem = cdolist_list_var.first();
            while (removal_tactician_uninterestingness.NIL != cdolist_list_var) {
                if (removal_tactician_uninterestingness.NIL != removal_strategy_reconsider_one_set_aside(strategy, set_aside_problem)) {
                    reactivated_count = Numbers.add(reactivated_count, (SubLObject)removal_tactician_uninterestingness.ONE_INTEGER);
                }
                cdolist_list_var = cdolist_list_var.rest();
                set_aside_problem = cdolist_list_var.first();
            }
        }
        finally {
            inference_worker.$reconsidering_set_asidesP$.rebind(_prev_bind_0, thread);
        }
        return reactivated_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 43486L)
    public static SubLObject removal_strategy_set_aside_problems_to_reconsider(final SubLObject strategy) {
        return inference_datastructures_strategy.strategy_all_valid_set_aside_problems(strategy);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 43624L)
    public static SubLObject removal_strategy_reconsider_one_set_aside(final SubLObject strategy, final SubLObject problem) {
        inference_tactician.possibly_clear_strategic_status_wrt(problem, strategy);
        return inference_worker.possibly_reactivate_problem(strategy, problem);
    }
    
    public static SubLObject declare_removal_tactician_uninterestingness_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_set_aside_non_continuable_implies_throw_away_tacticP", "REMOVAL-STRATEGY-SET-ASIDE-NON-CONTINUABLE-IMPLIES-THROW-AWAY-TACTIC?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_set_aside_non_continuable_implies_throw_away_problemP", "REMOVAL-STRATEGY-SET-ASIDE-NON-CONTINUABLE-IMPLIES-THROW-AWAY-PROBLEM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_throw_away_problemP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_throw_away_problem_uncacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM-UNCACHEABLE?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_throw_away_problem_cacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM-CACHEABLE?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_throw_away_strategemP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-STRATEGEM?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_throw_away_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_throw_away_tactic_uncacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-UNCACHEABLE?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_throw_away_tactic_cacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-CACHEABLE?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_throw_away_tactic_with_sibling_simplification_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-WITH-SIBLING-SIMPLIFICATION-TACTIC?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_throw_away_linkP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-LINK?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_set_aside_problemP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_set_aside_problem_uncacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM-UNCACHEABLE?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_set_aside_problem_cacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM-CACHEABLE?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_set_aside_strategemP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-STRATEGEM?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_set_aside_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "uninterestingness_cache_condition_as_boolean", "UNINTERESTINGNESS-CACHE-CONDITION-AS-BOOLEAN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "clear_removal_strategy_compute_tactic_uninterestingness_cache_conditions", "CLEAR-REMOVAL-STRATEGY-COMPUTE-TACTIC-UNINTERESTINGNESS-CACHE-CONDITIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "remove_removal_strategy_compute_tactic_uninterestingness_cache_conditions", "REMOVE-REMOVAL-STRATEGY-COMPUTE-TACTIC-UNINTERESTINGNESS-CACHE-CONDITIONS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_compute_tactic_uninterestingness_cache_conditions_internal", "REMOVAL-STRATEGY-COMPUTE-TACTIC-UNINTERESTINGNESS-CACHE-CONDITIONS-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_compute_tactic_uninterestingness_cache_conditions", "REMOVAL-STRATEGY-COMPUTE-TACTIC-UNINTERESTINGNESS-CACHE-CONDITIONS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "clear_removal_strategy_compute_problem_uninterestingness_cache_conditions", "CLEAR-REMOVAL-STRATEGY-COMPUTE-PROBLEM-UNINTERESTINGNESS-CACHE-CONDITIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "remove_removal_strategy_compute_problem_uninterestingness_cache_conditions", "REMOVE-REMOVAL-STRATEGY-COMPUTE-PROBLEM-UNINTERESTINGNESS-CACHE-CONDITIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_compute_problem_uninterestingness_cache_conditions_internal", "REMOVAL-STRATEGY-COMPUTE-PROBLEM-UNINTERESTINGNESS-CACHE-CONDITIONS-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_compute_problem_uninterestingness_cache_conditions", "REMOVAL-STRATEGY-COMPUTE-PROBLEM-UNINTERESTINGNESS-CACHE-CONDITIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_set_aside_tactic_uncacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC-UNCACHEABLE?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_set_aside_tactic_cacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC-CACHEABLE?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_set_aside_linkP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-LINK?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_ignore_problemP", "REMOVAL-STRATEGY-CHOOSES-TO-IGNORE-PROBLEM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "why_removal_strategy_chooses_to_ignore_problem", "WHY-REMOVAL-STRATEGY-CHOOSES-TO-IGNORE-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_ignore_strategemP", "REMOVAL-STRATEGY-CHOOSES-TO-IGNORE-STRATEGEM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "why_removal_strategy_chooses_to_ignore_strategem", "WHY-REMOVAL-STRATEGY-CHOOSES-TO-IGNORE-STRATEGEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_ignore_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-IGNORE-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_ignore_linkP", "REMOVAL-STRATEGY-CHOOSES-TO-IGNORE-LINK?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_throw_away_all_tacticsP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-ALL-TACTICS?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_set_aside_all_tacticsP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-ALL-TACTICS?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_set_aside_all_conjunctive_removal_tacticsP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-ALL-CONJUNCTIVE-REMOVAL-TACTICS?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_set_aside_join_ordered_tactic_due_to_conjunctive_removalP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-JOIN-ORDERED-TACTIC-DUE-TO-CONJUNCTIVE-REMOVAL?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_throw_away_disjunctive_linkP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-DISJUNCTIVE-LINK?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_set_aside_disjunctive_linkP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-DISJUNCTIVE-LINK?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_throw_away_connected_conjunction_linkP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-CONNECTED-CONJUNCTION-LINK?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_set_aside_connected_conjunction_linkP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-CONNECTED-CONJUNCTION-LINK?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_totally_throw_away_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-TOTALLY-THROW-AWAY-TACTIC?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_totally_ignore_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-TOTALLY-IGNORE-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_throw_away_tactic_hl_moduleP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-HL-MODULE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_preferred_backchain_required_join_ordered_tactic", "REMOVAL-STRATEGY-PREFERRED-BACKCHAIN-REQUIRED-JOIN-ORDERED-TACTIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_problem_pending_and_not_set_asideP", "REMOVAL-STRATEGY-PROBLEM-PENDING-AND-NOT-SET-ASIDE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_tactic_thrown_awayP", "REMOVAL-STRATEGY-TACTIC-THROWN-AWAY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_tactic_set_asideP", "REMOVAL-STRATEGY-TACTIC-SET-ASIDE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_throw_away_tactic_lookahead_problemP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-LOOKAHEAD-PROBLEM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_throw_away_lookahead_problemP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-LOOKAHEAD-PROBLEM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_throw_away_split_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-SPLIT-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_throw_away_sibling_split_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-SIBLING-SPLIT-TACTIC?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_not_to_activate_any_strategems_on_problemP", "REMOVAL-STRATEGY-CHOOSES-NOT-TO-ACTIVATE-ANY-STRATEGEMS-ON-PROBLEM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_set_aside_tactic_lookahead_problemP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC-LOOKAHEAD-PROBLEM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_set_aside_split_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-SPLIT-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "controlling_strategy_allows_split_tactic_to_be_set_asideP", "CONTROLLING-STRATEGY-ALLOWS-SPLIT-TACTIC-TO-BE-SET-ASIDE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_throw_away_meta_removal_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-META-REMOVAL-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "inference_chooses_to_throw_away_meta_removal_tacticP", "INFERENCE-CHOOSES-TO-THROW-AWAY-META-REMOVAL-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_throw_away_uninteresting_set_asides", "REMOVAL-STRATEGY-THROW-AWAY-UNINTERESTING-SET-ASIDES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_throw_away_uninteresting_set_asides_int", "REMOVAL-STRATEGY-THROW-AWAY-UNINTERESTING-SET-ASIDES-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_chooses_to_leave_problem_set_asideP", "REMOVAL-STRATEGY-CHOOSES-TO-LEAVE-PROBLEM-SET-ASIDE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_reconsider_set_asides", "REMOVAL-STRATEGY-RECONSIDER-SET-ASIDES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_set_aside_problems_to_reconsider", "REMOVAL-STRATEGY-SET-ASIDE-PROBLEMS-TO-RECONSIDER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness", "removal_strategy_reconsider_one_set_aside", "REMOVAL-STRATEGY-RECONSIDER-ONE-SET-ASIDE", 2, 0, false);
        return (SubLObject)removal_tactician_uninterestingness.NIL;
    }
    
    public static SubLObject init_removal_tactician_uninterestingness_file() {
        removal_tactician_uninterestingness.$removal_strategy_uses_uninterestingness_cacheP$ = SubLFiles.defparameter("*REMOVAL-STRATEGY-USES-UNINTERESTINGNESS-CACHE?*", (SubLObject)removal_tactician_uninterestingness.T);
        removal_tactician_uninterestingness.$removal_strategy_compute_tactic_uninterestingness_cache_conditions_caching_state$ = SubLFiles.deflexical("*REMOVAL-STRATEGY-COMPUTE-TACTIC-UNINTERESTINGNESS-CACHE-CONDITIONS-CACHING-STATE*", (SubLObject)removal_tactician_uninterestingness.NIL);
        removal_tactician_uninterestingness.$removal_strategy_compute_problem_uninterestingness_cache_conditions_caching_state$ = SubLFiles.deflexical("*REMOVAL-STRATEGY-COMPUTE-PROBLEM-UNINTERESTINGNESS-CACHE-CONDITIONS-CACHING-STATE*", (SubLObject)removal_tactician_uninterestingness.NIL);
        return (SubLObject)removal_tactician_uninterestingness.NIL;
    }
    
    public static SubLObject setup_removal_tactician_uninterestingness_file() {
        memoization_state.note_globally_cached_function((SubLObject)removal_tactician_uninterestingness.$sym18$REMOVAL_STRATEGY_COMPUTE_TACTIC_UNINTERESTINGNESS_CACHE_CONDITION);
        memoization_state.note_globally_cached_function((SubLObject)removal_tactician_uninterestingness.$sym20$REMOVAL_STRATEGY_COMPUTE_PROBLEM_UNINTERESTINGNESS_CACHE_CONDITIO);
        return (SubLObject)removal_tactician_uninterestingness.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_tactician_uninterestingness_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_tactician_uninterestingness_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_tactician_uninterestingness_file();
    }
    
    static {
        me = (SubLFile)new removal_tactician_uninterestingness();
        removal_tactician_uninterestingness.$removal_strategy_uses_uninterestingness_cacheP$ = null;
        removal_tactician_uninterestingness.$removal_strategy_compute_tactic_uninterestingness_cache_conditions_caching_state$ = null;
        removal_tactician_uninterestingness.$removal_strategy_compute_problem_uninterestingness_cache_conditions_caching_state$ = null;
        $kw0$RECOMPUTE = SubLObjectFactory.makeKeyword("RECOMPUTE");
        $kw1$ALL_TACTICS_THROWN_AWAY = SubLObjectFactory.makeKeyword("ALL-TACTICS-THROWN-AWAY");
        $kw2$PROBLEM_STRATEGY_NOT_CONTINUABLE = SubLObjectFactory.makeKeyword("PROBLEM-STRATEGY-NOT-CONTINUABLE");
        $kw3$TACTIC_HL_MODULE_THROWN_AWAY = SubLObjectFactory.makeKeyword("TACTIC-HL-MODULE-THROWN-AWAY");
        $kw4$TACTIC_ALREADY_THROWN_AWAY = SubLObjectFactory.makeKeyword("TACTIC-ALREADY-THROWN-AWAY");
        $kw5$TACTIC_THROWN_AWAY_BECAUSE_COMPLETE_SIBLING_CONJUNCTIVE_REMOVAL = SubLObjectFactory.makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-COMPLETE-SIBLING-CONJUNCTIVE-REMOVAL");
        $str6$tactic_is_disallowed = SubLObjectFactory.makeString("tactic is disallowed");
        $str7$tactic_is_impossible = SubLObjectFactory.makeString("tactic is impossible");
        $kw8$TACTIC_THROWN_AWAY_BECAUSE_SIBLING_BACKCHAIN_REQUIRED = SubLObjectFactory.makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-SIBLING-BACKCHAIN-REQUIRED");
        $kw9$META_REMOVAL_TACTIC_THROWN_AWAY = SubLObjectFactory.makeKeyword("META-REMOVAL-TACTIC-THROWN-AWAY");
        $kw10$TACTIC_THROWN_AWAY_BECAUSE_PROBLEM_THROWN_AWAY = SubLObjectFactory.makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-PROBLEM-THROWN-AWAY");
        $kw11$TACTIC_THROWN_AWAY_BECAUSE_LOOKAHEAD_PROBLEM_THROWN_AWAY = SubLObjectFactory.makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-LOOKAHEAD-PROBLEM-THROWN-AWAY");
        $kw12$TACTIC_STRATEGY_NOT_CONTINUABLE = SubLObjectFactory.makeKeyword("TACTIC-STRATEGY-NOT-CONTINUABLE");
        $kw13$LINK_SUPPORTED_PROBLEM_THROWN_AWAY = SubLObjectFactory.makeKeyword("LINK-SUPPORTED-PROBLEM-THROWN-AWAY");
        $kw14$NOT_APPLICABLE = SubLObjectFactory.makeKeyword("NOT-APPLICABLE");
        $kw15$PROBLEM_ALREADY_SET_ASIDE = SubLObjectFactory.makeKeyword("PROBLEM-ALREADY-SET-ASIDE");
        $kw16$ALL_TACTICS_SET_ASIDE = SubLObjectFactory.makeKeyword("ALL-TACTICS-SET-ASIDE");
        $str17$Condition__A_not_handled_yet = SubLObjectFactory.makeString("Condition ~A not handled yet");
        $sym18$REMOVAL_STRATEGY_COMPUTE_TACTIC_UNINTERESTINGNESS_CACHE_CONDITION = SubLObjectFactory.makeSymbol("REMOVAL-STRATEGY-COMPUTE-TACTIC-UNINTERESTINGNESS-CACHE-CONDITIONS");
        $sym19$_REMOVAL_STRATEGY_COMPUTE_TACTIC_UNINTERESTINGNESS_CACHE_CONDITIO = SubLObjectFactory.makeSymbol("*REMOVAL-STRATEGY-COMPUTE-TACTIC-UNINTERESTINGNESS-CACHE-CONDITIONS-CACHING-STATE*");
        $sym20$REMOVAL_STRATEGY_COMPUTE_PROBLEM_UNINTERESTINGNESS_CACHE_CONDITIO = SubLObjectFactory.makeSymbol("REMOVAL-STRATEGY-COMPUTE-PROBLEM-UNINTERESTINGNESS-CACHE-CONDITIONS");
        $sym21$_REMOVAL_STRATEGY_COMPUTE_PROBLEM_UNINTERESTINGNESS_CACHE_CONDITI = SubLObjectFactory.makeSymbol("*REMOVAL-STRATEGY-COMPUTE-PROBLEM-UNINTERESTINGNESS-CACHE-CONDITIONS-CACHING-STATE*");
        $kw22$TACTIC_ALREADY_SET_ASIDE = SubLObjectFactory.makeKeyword("TACTIC-ALREADY-SET-ASIDE");
        $kw23$JOIN_ORDERED_TACTIC_LEADS_TO_SET_ASIDE_CONJUNCTIVE_REMOVALS = SubLObjectFactory.makeKeyword("JOIN-ORDERED-TACTIC-LEADS-TO-SET-ASIDE-CONJUNCTIVE-REMOVALS");
        $kw24$TACTIC_SET_ASIDE_BECAUSE_PROBLEM_SET_ASIDE = SubLObjectFactory.makeKeyword("TACTIC-SET-ASIDE-BECAUSE-PROBLEM-SET-ASIDE");
        $kw25$TACTIC_SET_ASIDE_BECAUSE_LOOKAHEAD_PROBLEM_SET_ASIDE = SubLObjectFactory.makeKeyword("TACTIC-SET-ASIDE-BECAUSE-LOOKAHEAD-PROBLEM-SET-ASIDE");
        $kw26$LINK_SUPPORTED_PROBLEM_SET_ASIDE = SubLObjectFactory.makeKeyword("LINK-SUPPORTED-PROBLEM-SET-ASIDE");
        $kw27$THROW_AWAY = SubLObjectFactory.makeKeyword("THROW-AWAY");
        $kw28$SET_ASIDE = SubLObjectFactory.makeKeyword("SET-ASIDE");
        $kw29$IRRELEVANT = SubLObjectFactory.makeKeyword("IRRELEVANT");
        $kw30$INVALID = SubLObjectFactory.makeKeyword("INVALID");
        $kw31$REMOVAL_CONJUNCTIVE = SubLObjectFactory.makeKeyword("REMOVAL-CONJUNCTIVE");
        $kw32$SUBSTRATEGY_TOTALLY_THROW_AWAY_TACTIC = SubLObjectFactory.makeKeyword("SUBSTRATEGY-TOTALLY-THROW-AWAY-TACTIC");
        $sym33$REMOVAL_STRATEGY_P = SubLObjectFactory.makeSymbol("REMOVAL-STRATEGY-P");
        $sym34$PROBLEM_P = SubLObjectFactory.makeSymbol("PROBLEM-P");
        $kw35$SPLIT = SubLObjectFactory.makeKeyword("SPLIT");
        $kw36$SPLIT_TACTIC_THROWN_AWAY_BECAUSE_SIBLING_TACTIC_THROWN_AWAY = SubLObjectFactory.makeKeyword("SPLIT-TACTIC-THROWN-AWAY-BECAUSE-SIBLING-TACTIC-THROWN-AWAY");
        $kw37$SPLIT_TACTIC_SET_ASIDE_BECAUSE_SIBLING_TACTIC_THROWN_AWAY = SubLObjectFactory.makeKeyword("SPLIT-TACTIC-SET-ASIDE-BECAUSE-SIBLING-TACTIC-THROWN-AWAY");
        $kw38$SUBSTRATEGY_ALLOW_SPLIT_TACTIC_SET_ASIDE_WRT_REMOVAL = SubLObjectFactory.makeKeyword("SUBSTRATEGY-ALLOW-SPLIT-TACTIC-SET-ASIDE-WRT-REMOVAL");
        $kw39$GENERALIZED_REMOVAL = SubLObjectFactory.makeKeyword("GENERALIZED-REMOVAL");
        $kw40$POSSIBLE = SubLObjectFactory.makeKeyword("POSSIBLE");
        $sym41$_ = SubLObjectFactory.makeSymbol("<");
        $sym42$PROBLEM_SUID = SubLObjectFactory.makeSymbol("PROBLEM-SUID");
    }
}

/*

	Total time: 288 ms
	
*/