package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.pattern_match;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.modules.transformation_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class inference_tactician_strategic_uninterestingness extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness";
    public static String myFingerPrint = "33aa3f7c02c62ff8c92773c38c9ce8e12fe62c464a67221918c222c35f78faf7";
    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 1100L)
    private static SubLSymbol $strategy_uninterestingness_explanation$;
    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 1400L)
    private static SubLSymbol $the_unknown_strategy_uninterestingness_explanation$;
    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 2200L)
    public static SubLSymbol $strategy_gathering_uninterestingness_explanationsP$;
    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 3800L)
    private static SubLSymbol $strategy_uninterestingness_explanation_table$;
    private static SubLSymbol $UNINITIALIZED;
    private static SubLList $list1;
    private static SubLSymbol $sym2$CLET;
    private static SubLList $list3;
    private static SubLList $list4;
    private static SubLSymbol $sym5$STRATEGY_NOTE_UNINTERESTINGNESS_EXPLANATION;
    private static SubLSymbol $sym6$STRATEGY_POSSIBLY_NOTE_UNINTERESTINGNESS_EXPLANATION;
    private static SubLSymbol $sym7$STRATEGY_UNINTERESTINGNESS_EXPLANATION_P;
    private static SubLList $list8;
    private static SubLList $list9;
    private static SubLSymbol $ALLOW_OTHER_KEYS;
    private static SubLSymbol $PROBLEM;
    private static SubLSymbol $TACTIC;
    private static SubLSymbol $LINK;
    private static SubLSymbol $SUBEXPLANATION;
    private static SubLSymbol $sym15$PWHEN;
    private static SubLSymbol $sym16$_STRATEGY_GATHERING_UNINTERESTINGNESS_EXPLANATIONS__;
    private static SubLList $list17;
    private static SubLList $list18;
    private static SubLSymbol $sym19$STRATEGY_UNINTERESTINGNESS_EXPLANATION_TYPE_P;
    private static SubLSymbol $sym20$PROBLEM_P;
    private static SubLSymbol $sym21$TACTIC_P;
    private static SubLSymbol $sym22$PROBLEM_LINK_P;
    private static SubLList $list23;
    private static SubLSymbol $THROW_AWAY_PROBLEM;
    private static SubLSymbol $THROW_AWAY_TACTIC;
    private static SubLSymbol $SET_ASIDE_PROBLEM;
    private static SubLSymbol $SET_ASIDE_TACTIC;
    private static SubLString $str28$problem_is_tactically_uninteresti;
    private static SubLString $str29$strategy_has_enough_proofs_for_pr;
    private static SubLString $str30$inference_is_not_continuable__and;
    private static SubLString $str31$tactic_is_discarded;
    private static SubLString $str32$non_good_problem_has_already_exec;
    private static SubLString $str33$rewrite_tactic_is_redundant;
    private static SubLString $str34$HL_module_is_forbidden;
    private static SubLString $str35$the_rule_for_this_tactic_has_an_i;
    private static SubLSymbol $GENERALIZED_REMOVAL;
    private static SubLString $str37$problem_is_strategically_no_good;
    private static SubLString $str38$tactic_exceeds_productivity_limit;
    private static SubLSymbol $sym39$STRATEGIC_CONTEXT_P;
    private static SubLSymbol $TRANSFORMATION;
    private static SubLString $str41$problem_exceeds_max_proof_depth;
    private static SubLString $str42$proof_checker_mode_is_enabled_and;
    private static SubLSymbol $sym43$INFERENCE_CHOOSES_TO_THROW_AWAY_ALL_TRANSFORMATIONS_ON_PROBLEM_;
    private static SubLString $str44$problem_uses_an_HL_predicate__HL_;
    private static SubLString $str45$problem_uses_an_evaluatable_predi;
    private static SubLSymbol $REWRITE;
    private static SubLString $str47$problem_exceeds_max_transformatio;
    private static SubLSymbol $sym48$SIMPLE_STRATEGY_CHOOSES_TO_THROW_AWAY_TRANSFORMATION_TACTIC_;
    private static SubLString $str49$proof_checker_mode_is_enabled__an;
    private static SubLString $str50$tactic_requires_HL_predicate_tran;
    private static SubLString $str51$tactic_requires_unbound_predicate;
    private static SubLString $str52$tactic_requires_evaluatable_predi;
    private static SubLList $list53;
    private static SubLObject $$isa;
    private static SubLObject $$genls;
    private static SubLSymbol $COMPLETE;
    private static SubLSymbol $INCOMPLETE;
    private static SubLSymbol $IMPOSSIBLE;
    private static SubLSymbol $PREFERRED;
    private static SubLSymbol $DISPREFERRED;
    private static SubLSymbol $DISALLOWED;
    private static SubLSymbol $DOOMED;
    private static SubLSymbol $CONTENT;
    private static SubLSymbol $EXECUTED;
    private static SubLSymbol $JOIN_ORDERED;
    private static SubLSymbol $JOIN;
    private static SubLSymbol $LOGICAL;
    private static SubLSymbol $ANYTHING;
    private static SubLSymbol $NOTHING;
    private static SubLString $str70$Time_to_support_proof_spec_admitt;
    private static SubLList $list71;
    private static SubLList $list72;
    private static SubLList $list73;
    private static SubLList $list74;
    private static SubLList $list75;
    private static SubLList $list76;
    private static SubLObject $$ist;
    private static SubLObject $$not;
    private static SubLSymbol $POS;
    private static SubLSymbol $NEG;

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 1500L)
    public static SubLObject the_unknown_strategy_uninterestingness_explanation_p(SubLObject v_object) {
        return Equality.eq(v_object, $the_unknown_strategy_uninterestingness_explanation$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 1600L)
    public static SubLObject strategy_last_uninterestingness_explanation() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return (NIL != $strategy_uninterestingness_explanation$.getDynamicValue(thread)) ? $strategy_uninterestingness_explanation$.getDynamicValue(thread) : $the_unknown_strategy_uninterestingness_explanation$.getGlobalValue();
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 1800L)
    public static SubLObject with_strategy_uninterestingness_explanations(SubLObject macroform, SubLObject environment) {
        SubLObject datum = macroform.rest();
        SubLObject body;
        SubLObject current = body = datum;
        return listS($sym2$CLET, $list3, append(body, NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 2000L)
    public static SubLObject without_strategy_uninterestingness_explanations(SubLObject macroform, SubLObject environment) {
        SubLObject datum = macroform.rest();
        SubLObject body;
        SubLObject current = body = datum;
        return listS($sym2$CLET, $list4, append(body, NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 2400L)
    public static SubLObject strategy_note_uninterestingness_explanation(SubLObject explanation_type, SubLObject problem, SubLObject tactic, SubLObject link, SubLObject subexplanation) {
        SubLObject explanation = make_strategy_uninterestingness_explanation(explanation_type, problem, tactic, link, subexplanation);
        assert NIL != strategy_uninterestingness_explanation_p(explanation) : explanation;
        $strategy_uninterestingness_explanation$.setDynamicValue(explanation);
        return explanation;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 2900L)
    public static SubLObject strategy_possibly_note_exact_uninterestingness_explanation(SubLObject explanation) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
            $strategy_uninterestingness_explanation$.setDynamicValue(explanation, thread);
        }
        return explanation;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 3200L)
    public static SubLObject strategy_possibly_note_uninterestingness_explanation(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        SubLObject explanation_type = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list8);
        explanation_type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list8);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list8);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list8);
            if (NIL == conses_high.member(current_$1, $list9, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list8);
        }
        SubLObject problem_tail = cdestructuring_bind.property_list_member($PROBLEM, current);
        SubLObject problem = (NIL != problem_tail) ? conses_high.cadr(problem_tail) : NIL;
        SubLObject tactic_tail = cdestructuring_bind.property_list_member($TACTIC, current);
        SubLObject tactic = (NIL != tactic_tail) ? conses_high.cadr(tactic_tail) : NIL;
        SubLObject link_tail = cdestructuring_bind.property_list_member($LINK, current);
        SubLObject link = (NIL != link_tail) ? conses_high.cadr(link_tail) : NIL;
        SubLObject subexplanation_tail = cdestructuring_bind.property_list_member($SUBEXPLANATION, current);
        SubLObject subexplanation = (NIL != subexplanation_tail) ? conses_high.cadr(subexplanation_tail) : NIL;
        current = temp;
        if (NIL == current) {
            return list($sym15$PWHEN, $sym16$_STRATEGY_GATHERING_UNINTERESTINGNESS_EXPLANATIONS__, list($sym5$STRATEGY_NOTE_UNINTERESTINGNESS_EXPLANATION, explanation_type, problem, tactic, link, subexplanation));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list8);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 3600L)
    public static SubLObject strategy_possibly_un_note_uninterestingness_explanation() {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
            $strategy_uninterestingness_explanation$.setDynamicValue($the_unknown_strategy_uninterestingness_explanation$.getGlobalValue(), thread);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 9400L)
    public static SubLObject strategy_uninterestingness_explanation_string(SubLObject explanation_type) {
        return conses_high.second(conses_high.assoc(explanation_type, $strategy_uninterestingness_explanation_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 9700L)
    public static SubLObject strategy_uninterestingness_explanation_type_p(SubLObject v_object) {
        return makeBoolean(v_object.isString() || (v_object.isKeyword() && NIL != conses_high.assoc(v_object, $strategy_uninterestingness_explanation_table$.getGlobalValue(), Symbols.symbol_function(EQ), UNPROVIDED)));
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 10100L)
    public static SubLObject strategy_uninterestingness_explanation_p(SubLObject v_object) {
        if (v_object.isCons() && NIL != list_utilities.lengthE(v_object, FIVE_INTEGER, UNPROVIDED)) {
            SubLObject type = NIL;
            SubLObject problem = NIL;
            SubLObject tactic = NIL;
            SubLObject link = NIL;
            SubLObject subexplanation = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(v_object, v_object, $list18);
            type = v_object.first();
            SubLObject current = v_object.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, v_object, $list18);
            problem = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, v_object, $list18);
            tactic = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, v_object, $list18);
            link = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, v_object, $list18);
            subexplanation = current.first();
            current = current.rest();
            if (NIL == current) {
                return makeBoolean(NIL != strategy_uninterestingness_explanation_type_p(type) && (NIL == problem || NIL != inference_datastructures_problem.problem_p(problem)) && (NIL == tactic || NIL != inference_datastructures_tactic.tactic_p(tactic))
                        && (NIL == link || NIL != inference_datastructures_problem_link.problem_link_p(link)) && (NIL == subexplanation || NIL != strategy_uninterestingness_explanation_p(subexplanation)));
            }
            cdestructuring_bind.cdestructuring_bind_error(v_object, $list18);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 10800L)
    public static SubLObject strategy_uninterestingness_subexplanation_p(SubLObject v_object) {
        return makeBoolean(NIL == v_object || NIL != strategy_uninterestingness_explanation_p(v_object) || NIL != list_utilities.list_of_type_p($sym7$STRATEGY_UNINTERESTINGNESS_EXPLANATION_P, v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 11100L)
    public static SubLObject make_strategy_uninterestingness_explanation(SubLObject explanation_type, SubLObject problem, SubLObject tactic, SubLObject link, SubLObject subexplanation) {
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
        assert NIL != strategy_uninterestingness_explanation_type_p(explanation_type) : explanation_type;
        if (NIL != problem && !assertionsDisabledInClass && NIL == inference_datastructures_problem.problem_p(problem)) {
            throw new AssertionError(problem);
        }
        if (NIL != tactic && !assertionsDisabledInClass && NIL == inference_datastructures_tactic.tactic_p(tactic)) {
            throw new AssertionError(tactic);
        }
        if (NIL != link && !assertionsDisabledInClass && NIL == inference_datastructures_problem_link.problem_link_p(link)) {
            throw new AssertionError(link);
        }
        if (NIL != subexplanation && !assertionsDisabledInClass && NIL == strategy_uninterestingness_explanation_p(subexplanation)) {
            throw new AssertionError(subexplanation);
        }
        return list(explanation_type, problem, tactic, link, subexplanation);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 11600L)
    public static SubLObject strategy_uninterestingness_explanation_type(SubLObject explanation) {
        assert NIL != strategy_uninterestingness_explanation_p(explanation) : explanation;
        return explanation.first();
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 11800L)
    public static SubLObject strategic_uninterestingness_reason_p(SubLObject v_object) {
        return subl_promotions.memberP(v_object, $list23, Symbols.symbol_function(EQ), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 12100L)
    public static SubLObject strategy_chooses_to_throw_away_problemP(SubLObject strategy, SubLObject problem, SubLObject motivation) {
        if (motivation == UNPROVIDED) {
            motivation = NIL;
        }
        return inference_datastructures_strategy.strategy_dispatch(strategy, $THROW_AWAY_PROBLEM, problem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 12300L)
    public static SubLObject why_strategy_chooses_to_throw_away_problem(SubLObject strategy, SubLObject problem) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject reason = NIL;
        SubLObject _prev_bind_0 = $strategy_uninterestingness_explanation$.currentBinding(thread);
        SubLObject _prev_bind_2 = $strategy_gathering_uninterestingness_explanationsP$.currentBinding(thread);
        try {
            $strategy_uninterestingness_explanation$.bind(NIL, thread);
            $strategy_gathering_uninterestingness_explanationsP$.bind(T, thread);
            strategy_chooses_to_throw_away_problemP(strategy, problem, UNPROVIDED);
            reason = strategy_last_uninterestingness_explanation();
        } finally {
            $strategy_gathering_uninterestingness_explanationsP$.rebind(_prev_bind_2, thread);
            $strategy_uninterestingness_explanation$.rebind(_prev_bind_0, thread);
        }
        return reason;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 12700L)
    public static SubLObject strategy_chooses_to_throw_away_tacticP(SubLObject strategy, SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $THROW_AWAY_TACTIC, tactic, problem_already_consideredP, siblings_already_consideredP, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 12900L)
    public static SubLObject legacy_strategy_chooses_to_throw_away_tacticP(SubLObject strategy, SubLObject tactic, SubLObject motivation) {
        if (motivation == UNPROVIDED) {
            motivation = NIL;
        }
        return simple_strategy_chooses_to_throw_away_tacticP(strategy, tactic);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 13100L)
    public static SubLObject legacy_strategy_chooses_to_ignore_tacticP(SubLObject strategy, SubLObject tactic, SubLObject motivation) {
        if (motivation == UNPROVIDED) {
            motivation = NIL;
        }
        return simple_strategy_chooses_to_ignore_tacticP(strategy, tactic);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 13300L)
    public static SubLObject why_strategy_chooses_to_throw_away_tactic(SubLObject strategy, SubLObject tactic) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject reason = NIL;
        SubLObject _prev_bind_0 = $strategy_uninterestingness_explanation$.currentBinding(thread);
        SubLObject _prev_bind_2 = $strategy_gathering_uninterestingness_explanationsP$.currentBinding(thread);
        try {
            $strategy_uninterestingness_explanation$.bind(NIL, thread);
            $strategy_gathering_uninterestingness_explanationsP$.bind(T, thread);
            strategy_chooses_to_throw_away_tacticP(strategy, tactic, NIL, NIL);
            reason = strategy_last_uninterestingness_explanation();
        } finally {
            $strategy_gathering_uninterestingness_explanationsP$.rebind(_prev_bind_2, thread);
            $strategy_uninterestingness_explanation$.rebind(_prev_bind_0, thread);
        }
        return reason;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 13600L)
    public static SubLObject strategy_chooses_to_set_aside_problemP(SubLObject strategy, SubLObject problem) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $SET_ASIDE_PROBLEM, problem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 13800L)
    public static SubLObject why_strategy_chooses_to_set_aside_problem(SubLObject strategy, SubLObject problem) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject reason = NIL;
        SubLObject _prev_bind_0 = $strategy_uninterestingness_explanation$.currentBinding(thread);
        SubLObject _prev_bind_2 = $strategy_gathering_uninterestingness_explanationsP$.currentBinding(thread);
        try {
            $strategy_uninterestingness_explanation$.bind(NIL, thread);
            $strategy_gathering_uninterestingness_explanationsP$.bind(T, thread);
            strategy_chooses_to_set_aside_problemP(strategy, problem);
            reason = strategy_last_uninterestingness_explanation();
        } finally {
            $strategy_gathering_uninterestingness_explanationsP$.rebind(_prev_bind_2, thread);
            $strategy_uninterestingness_explanation$.rebind(_prev_bind_0, thread);
        }
        return reason;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 14100L)
    public static SubLObject strategy_chooses_to_set_aside_tacticP(SubLObject strategy, SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $SET_ASIDE_TACTIC, tactic, problem_already_consideredP, siblings_already_consideredP, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 14300L)
    public static SubLObject legacy_strategy_chooses_to_set_aside_tacticP(SubLObject strategy, SubLObject tactic, SubLObject motivation) {
        if (motivation == UNPROVIDED) {
            motivation = NIL;
        }
        return simple_strategy_chooses_to_set_aside_tacticP(strategy, tactic);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 14500L)
    public static SubLObject why_strategy_chooses_to_set_aside_tactic(SubLObject strategy, SubLObject tactic) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject reason = NIL;
        SubLObject _prev_bind_0 = $strategy_uninterestingness_explanation$.currentBinding(thread);
        SubLObject _prev_bind_2 = $strategy_gathering_uninterestingness_explanationsP$.currentBinding(thread);
        try {
            $strategy_uninterestingness_explanation$.bind(NIL, thread);
            $strategy_gathering_uninterestingness_explanationsP$.bind(T, thread);
            strategy_chooses_to_set_aside_tacticP(strategy, tactic, NIL, NIL);
            reason = strategy_last_uninterestingness_explanation();
        } finally {
            $strategy_gathering_uninterestingness_explanationsP$.rebind(_prev_bind_2, thread);
            $strategy_uninterestingness_explanation$.rebind(_prev_bind_0, thread);
        }
        return reason;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 14800L)
    public static SubLObject strategy_chooses_to_ignore_tacticP(SubLObject strategy, SubLObject tactic, SubLObject motivation) {
        if (motivation == UNPROVIDED) {
            motivation = NIL;
        }
        return simple_strategy_chooses_to_ignore_tacticP(strategy, tactic);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 15000L)
    public static SubLObject simple_strategy_chooses_to_throw_away_problemP(SubLObject strategy, SubLObject problem) {
        return simple_strategy_chooses_to_throw_away_problem_int(strategy, problem, NIL);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 15400L)
    public static SubLObject why_simple_strategy_chooses_to_throw_away_problem(SubLObject strategy, SubLObject problem) {
        return simple_strategy_chooses_to_throw_away_problem_int(strategy, problem, T);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 15600L)
    public static SubLObject simple_strategy_chooses_to_throw_away_problem_int(SubLObject strategy, SubLObject problem, SubLObject justifyP) {
        if (NIL != tactically_uninteresting_problem_p(problem)) {
            if (NIL != justifyP) {
                return $str28$problem_is_tactically_uninteresti;
            }
            return T;
        } else if (NIL != strategy_has_enough_proofs_for_problemP(strategy, problem)) {
            if (NIL != justifyP) {
                return $str29$strategy_has_enough_proofs_for_pr;
            }
            return T;
        } else {
            SubLObject inference_chooses_to_throw_away_problem_reason = why_inference_chooses_to_throw_away_problem(inference_datastructures_strategy.strategy_inference(strategy), problem);
            if (NIL == inference_chooses_to_throw_away_problem_reason) {
                if (NIL == inference_datastructures_inference.inference_continuableP(inference_datastructures_strategy.strategy_inference(strategy)) && NIL != inference_tactician.strategy_set_aside_non_continuable_implies_throw_awayP(strategy)) {
                    SubLObject set_aside_reason = why_simple_strategy_chooses_to_set_aside_problem(strategy, problem);
                    if (NIL != set_aside_reason) {
                        if (NIL != justifyP) {
                            return Sequences.cconcatenate($str30$inference_is_not_continuable__and, set_aside_reason);
                        }
                        return T;
                    }
                }
                return NIL;
            }
            if (NIL != justifyP) {
                return inference_chooses_to_throw_away_problem_reason;
            }
            return T;
        }
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 16800L)
    public static SubLObject simple_strategy_chooses_to_throw_away_tacticP(SubLObject strategy, SubLObject tactic) {
        return simple_strategy_chooses_to_throw_away_tactic_int(strategy, tactic, NIL);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 17000L)
    public static SubLObject why_simple_strategy_chooses_to_throw_away_tactic(SubLObject strategy, SubLObject tactic) {
        return simple_strategy_chooses_to_throw_away_tactic_int(strategy, tactic, T);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 17200L)
    public static SubLObject simple_strategy_chooses_to_throw_away_tactic_int(SubLObject strategy, SubLObject tactic, SubLObject justifyP) {
        if (NIL != inference_datastructures_tactic.tactic_discardedP(tactic) && NIL == transformation_tactician_datastructures.transformation_strategy_p(strategy)) {
            if (NIL != justifyP) {
                return $str31$tactic_is_discarded;
            }
            return T;
        } else if (NIL == inference_worker.good_problem_p(inference_datastructures_tactic.tactic_problem(tactic), strategy) && NIL != problem_has_executed_a_complete_removal_tacticP(inference_datastructures_tactic.tactic_problem(tactic), strategy)) {
            if (NIL != justifyP) {
                return $str32$non_good_problem_has_already_exec;
            }
            return T;
        } else if (NIL != simple_strategy_deems_rewrite_tactic_redundantP(strategy, tactic)) {
            if (NIL != justifyP) {
                return $str33$rewrite_tactic_is_redundant;
            }
            return T;
        } else if (NIL != inference_worker_transformation.transformation_tactic_p(tactic) && NIL != simple_strategy_chooses_to_throw_away_transformation_tacticP(strategy, tactic)) {
            if (NIL != justifyP) {
                return why_simple_strategy_chooses_to_throw_away_transformation_tactic(strategy, tactic);
            }
            return T;
        } else {
            if (NIL != strategy_allows_use_of_tactic_hl_moduleP(strategy, tactic)) {
                if (NIL == inference_datastructures_inference.inference_continuableP(inference_datastructures_strategy.strategy_inference(strategy))) {
                    if (NIL != inference_tactician.strategy_set_aside_non_continuable_implies_throw_awayP(strategy)) {
                        SubLObject strategy_chooses_to_set_aside_tactic_reason = why_simple_strategy_chooses_to_set_aside_tactic(strategy, tactic);
                        if (NIL != strategy_chooses_to_set_aside_tactic_reason) {
                            if (NIL != justifyP) {
                                return Sequences.cconcatenate($str30$inference_is_not_continuable__and, strategy_chooses_to_set_aside_tactic_reason);
                            }
                            return T;
                        }
                    } else if (NIL != inference_worker_transformation.transformation_tactic_p(tactic)) {
                        SubLObject rule = inference_worker_transformation.transformation_tactic_rule(tactic);
                        if (NIL != rule && NIL != inference_analysis.transformation_rule_has_insufficient_historical_utilityP(rule, inference_datastructures_strategy.strategy_inference(strategy))) {
                            if (NIL != justifyP) {
                                return $str35$the_rule_for_this_tactic_has_an_i;
                            }
                            return T;
                        }
                    }
                }
                return NIL;
            }
            if (NIL != justifyP) {
                return $str34$HL_module_is_forbidden;
            }
            return T;
        }
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 19700L)
    public static SubLObject problem_has_executed_a_complete_removal_tacticP(SubLObject problem, SubLObject strategic_context) {
        return problem_has_executed_a_complete_tacticP(problem, strategic_context, $GENERALIZED_REMOVAL);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 19900L)
    public static SubLObject lookahead_problem_has_executed_a_complete_removal_tacticP(SubLObject problem, SubLObject strategic_context) {
        return lookahead_problem_has_executed_a_complete_tacticP(problem, strategic_context, $GENERALIZED_REMOVAL);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 20100L)
    public static SubLObject problem_or_lookahead_problem_has_executed_a_complete_removal_tacticP(SubLObject problem, SubLObject strategic_context) {
        return problem_or_lookahead_problem_has_executed_a_complete_tacticP(problem, strategic_context, $GENERALIZED_REMOVAL);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 20300L)
    public static SubLObject problem_has_executed_a_generalized_removal_tacticP(SubLObject problem) {
        return problem_has_executed_a_tactic_of_typeP(problem, $GENERALIZED_REMOVAL);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 20500L)
    public static SubLObject strategy_allows_use_of_tactic_hl_moduleP(SubLObject strategy, SubLObject tactic) {
        return strategy_allows_use_of_hl_moduleP(strategy, inference_datastructures_tactic.tactic_hl_module(tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 20700L)
    public static SubLObject strategy_allows_use_of_hl_moduleP(SubLObject strategy, SubLObject hl_module) {
        return inference_datastructures_inference.inference_allows_use_of_moduleP(inference_datastructures_strategy.strategy_inference(strategy), hl_module);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 20800L)
    public static SubLObject simple_strategy_chooses_to_set_aside_problemP(SubLObject strategy, SubLObject problem) {
        return simple_strategy_chooses_to_set_aside_problem_int(strategy, problem, NIL);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 21000L)
    public static SubLObject why_simple_strategy_chooses_to_set_aside_problem(SubLObject strategy, SubLObject problem) {
        return simple_strategy_chooses_to_set_aside_problem_int(strategy, problem, T);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 21200L)
    public static SubLObject simple_strategy_chooses_to_set_aside_problem_int(SubLObject strategy, SubLObject problem, SubLObject justifyP) {
        if (NIL != inference_datastructures_strategy.strategically_totally_no_good_problem_p(problem, strategy)) {
            if (NIL != justifyP) {
                return $str37$problem_is_strategically_no_good;
            }
            return T;
        } else {
            SubLObject inference_chooses_to_set_aside_problem_reason = why_inference_chooses_to_set_aside_problem(inference_datastructures_strategy.strategy_inference(strategy), problem);
            if (NIL == inference_chooses_to_set_aside_problem_reason) {
                return NIL;
            }
            if (NIL != justifyP) {
                return inference_chooses_to_set_aside_problem_reason;
            }
            return T;
        }
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 21900L)
    public static SubLObject simple_strategy_chooses_to_set_aside_tacticP(SubLObject strategy, SubLObject tactic) {
        return simple_strategy_chooses_to_set_aside_tactic_int(strategy, tactic, NIL);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 22100L)
    public static SubLObject why_simple_strategy_chooses_to_set_aside_tactic(SubLObject strategy, SubLObject tactic) {
        return simple_strategy_chooses_to_set_aside_tactic_int(strategy, tactic, T);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 22300L)
    public static SubLObject simple_strategy_chooses_to_set_aside_tactic_int(SubLObject strategy, SubLObject tactic, SubLObject justifyP) {
        if ((NIL == inference_worker.content_tactic_p(tactic) && NIL != inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_strategy.strategy_problem_store(strategy))) || NIL == tactic_exceeds_productivity_limitP(tactic, strategy)) {
            if (NIL != inference_worker_transformation.transformation_tactic_p(tactic)) {
                SubLObject strategy_chooses_to_set_aside_transformation_tactic_reason = why_simple_strategy_chooses_to_set_aside_transformation_tactic(strategy, tactic);
                if (NIL != strategy_chooses_to_set_aside_transformation_tactic_reason) {
                    if (NIL != justifyP) {
                        return strategy_chooses_to_set_aside_transformation_tactic_reason;
                    }
                    return T;
                }
            }
            return NIL;
        }
        if (NIL != justifyP) {
            return $str38$tactic_exceeds_productivity_limit;
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 23400L)
    public static SubLObject simple_strategy_chooses_to_ignore_problemP(SubLObject strategy, SubLObject problem) {
        return makeBoolean(NIL != simple_strategy_chooses_to_throw_away_problemP(strategy, problem)
                || ((NIL != inference_datastructures_inference.inference_continuableP(inference_datastructures_strategy.strategy_inference(strategy)) || NIL == inference_tactician.strategy_set_aside_non_continuable_implies_throw_awayP(strategy))
                        && NIL != simple_strategy_chooses_to_set_aside_problemP(strategy, problem)));
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 24000L)
    public static SubLObject simple_strategy_chooses_to_ignore_tacticP(SubLObject strategy, SubLObject tactic) {
        return makeBoolean(NIL != simple_strategy_chooses_to_throw_away_tacticP(strategy, tactic)
                || ((NIL != inference_datastructures_inference.inference_continuableP(inference_datastructures_strategy.strategy_inference(strategy)) || NIL == inference_tactician.strategy_set_aside_non_continuable_implies_throw_awayP(strategy))
                        && NIL != simple_strategy_chooses_to_set_aside_tacticP(strategy, tactic)));
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 24400L)
    public static SubLObject problem_strategically_pendingP(SubLObject problem, SubLObject strategic_context) {
        assert NIL != inference_worker.strategic_context_p(strategic_context) : strategic_context;
        if (NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            return T;
        }
        return inference_datastructures_problem.problem_no_tactics_possibleP(problem);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 25000L)
    public static SubLObject strategy_deems_problem_tactically_uninterestingP(SubLObject strategy, SubLObject problem) {
        return makeBoolean(NIL != tactically_uninteresting_problem_p(problem) || NIL != strategy_has_enough_proofs_for_problemP(strategy, problem));
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 25200L)
    public static SubLObject strategy_has_enough_proofs_for_problemP(SubLObject strategy, SubLObject problem) {
        return makeBoolean(NIL != inference_datastructures_problem.tactically_good_problem_p(problem)
                && (NIL != inference_datastructures_strategy.strategy_wants_one_answerP(strategy) || (NIL != inference_datastructures_strategy.strategy_unique_wrt_bindingsP(strategy) && (NIL != inference_datastructures_problem.closed_problem_p(problem)
                        || (problem.eql(inference_datastructures_strategy.strategy_root_problem(strategy)) && NIL != inference_datastructures_inference.inference_no_free_hl_varsP(inference_datastructures_strategy.strategy_inference(strategy)))))));
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 25900L)
    public static SubLObject tactically_uninteresting_problem_p(SubLObject problem) {
        return makeBoolean(NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem) || NIL != inference_datastructures_problem.tactically_examined_problem_p(problem)
                || (NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem) && NIL != inference_datastructures_problem.tactically_good_problem_p(problem) && NIL != inference_datastructures_problem.closed_problem_p(problem)));
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 26600L)
    public static SubLObject strategy_deems_problem_strategically_uninterestingP(SubLObject strategy, SubLObject problem) {
        return strategically_uninteresting_problem_p(problem, strategy);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 26800L)
    public static SubLObject strategically_uninteresting_problem_p(SubLObject problem, SubLObject strategy) {
        return makeBoolean(
                NIL != inference_datastructures_strategy.strategically_no_good_problem_p(problem, strategy) || NIL != inference_datastructures_strategy.strategically_pending_problem_p(problem, strategy) || NIL != inference_datastructures_strategy.strategically_examined_problem_p(problem, strategy));
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 27100L)
    public static SubLObject problem_has_relevant_supporting_problemP(SubLObject problem, SubLObject strategic_context, SubLObject consider_transformation_tacticsP) {
        assert NIL != inference_worker.strategic_context_p(strategic_context) : strategic_context;
        if (NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject argument_link;
            SubLObject link_var;
            SubLObject cdolist_list_var;
            SubLObject supporting_mapped_problem;
            SubLObject supporting_problem;
            SubLObject variable_map;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                    state); state = set_contents.do_set_contents_update_state(state)) {
                argument_link = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, argument_link) && (NIL != consider_transformation_tacticsP || NIL == inference_worker_transformation.transformation_link_p(argument_link))) {
                    link_var = argument_link;
                    cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                    supporting_mapped_problem = NIL;
                    supporting_mapped_problem = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem)) {
                            supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                            variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                            if (NIL != inference_datastructures_problem.problem_relevant_to_strategyP(supporting_problem, strategic_context)) {
                                return T;
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        supporting_mapped_problem = cdolist_list_var.first();
                    }
                }
            }
            return NIL;
        }
        return inference_datastructures_problem.problem_has_argument_link_p(problem);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 27800L)
    public static SubLObject problem_has_interesting_transformation_tacticsP(SubLObject problem, SubLObject strategic_context) {
        assert NIL != inference_worker.strategic_context_p(strategic_context) : strategic_context;
        if (NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
            SubLObject tactic = NIL;
            tactic = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, $TRANSFORMATION) && NIL == simple_strategy_chooses_to_ignore_tacticP(strategic_context, tactic)) {
                    return T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                tactic = cdolist_list_var.first();
            }
            return NIL;
        }
        return inference_datastructures_problem.problem_has_transformation_tacticsP(problem);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 28200L)
    public static SubLObject problem_no_tactics_strategically_possibleP(SubLObject strategy, SubLObject problem) {
        return Numbers.zerop(inference_datastructures_strategy.problem_strategically_possible_tactic_count(problem, strategy));
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 28500L)
    public static SubLObject inference_chooses_to_set_aside_problemP(SubLObject inference, SubLObject problem) {
        return inference_chooses_to_set_aside_problem_int(inference, problem, NIL);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 28600L)
    public static SubLObject why_inference_chooses_to_set_aside_problem(SubLObject inference, SubLObject problem) {
        return inference_chooses_to_set_aside_problem_int(inference, problem, T);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 28800L)
    public static SubLObject inference_chooses_to_set_aside_problem_int(SubLObject inference, SubLObject problem, SubLObject justifyP) {
        if (NIL != inference_worker.problem_strictly_within_max_proof_depthP(inference, problem)) {
            return NIL;
        }
        if (NIL != justifyP) {
            return $str41$problem_exceeds_max_proof_depth;
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 29000L)
    public static SubLObject inference_chooses_to_throw_away_problemP(SubLObject inference, SubLObject problem) {
        return inference_chooses_to_throw_away_problem_int(inference, problem, NIL);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 29200L)
    public static SubLObject why_inference_chooses_to_throw_away_problem(SubLObject inference, SubLObject problem) {
        return inference_chooses_to_throw_away_problem_int(inference, problem, T);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 29300L)
    public static SubLObject inference_chooses_to_throw_away_problem_int(SubLObject inference, SubLObject problem, SubLObject justifyP) {
        if (NIL != inference_datastructures_inference.inference_allows_use_of_all_rulesP(inference) || NIL == inference_datastructures_problem.problem_has_dependent_link_p(problem) || NIL == all_dependent_links_are_forbidden_transformationsP(problem, inference)) {
            return NIL;
        }
        if (NIL != justifyP) {
            return $str42$proof_checker_mode_is_enabled_and;
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 29800L)
    public static SubLObject all_dependent_links_are_forbidden_transformationsP(SubLObject problem, SubLObject inference) {
        SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, link) && (NIL == inference_worker_transformation.transformation_link_p(link) || NIL == transformation_forbidden_by_inferenceP(link, inference))) {
                return NIL;
            }
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 30100L)
    public static SubLObject transformation_forbidden_by_inferenceP(SubLObject transformation_link, SubLObject inference) {
        SubLObject rule = inference_worker_transformation.transformation_link_rule_assertion(transformation_link);
        return makeBoolean(NIL == inference_datastructures_inference.inference_allows_use_of_ruleP(inference, rule));
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 30300L)
    public static SubLObject inference_chooses_to_throw_away_all_transformations_on_problemP_internal(SubLObject inference, SubLObject problem) {
        return inference_chooses_to_throw_away_all_transformations_on_problem_int(inference, problem, NIL);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 30300L)
    public static SubLObject inference_chooses_to_throw_away_all_transformations_on_problemP(SubLObject inference, SubLObject problem) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_chooses_to_throw_away_all_transformations_on_problemP_internal(inference, problem);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym43$INFERENCE_CHOOSES_TO_THROW_AWAY_ALL_TRANSFORMATIONS_ON_PROBLEM_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym43$INFERENCE_CHOOSES_TO_THROW_AWAY_ALL_TRANSFORMATIONS_ON_PROBLEM_, TWO_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym43$INFERENCE_CHOOSES_TO_THROW_AWAY_ALL_TRANSFORMATIONS_ON_PROBLEM_, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_2(inference, problem);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (inference.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (NIL != cached_args && NIL == cached_args.rest() && problem.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_chooses_to_throw_away_all_transformations_on_problemP_internal(inference, problem)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(inference, problem));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 30600L)
    public static SubLObject why_inference_chooses_to_throw_away_all_transformations_on_problem(SubLObject inference, SubLObject problem) {
        return inference_chooses_to_throw_away_all_transformations_on_problem_int(inference, problem, T);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 30800L)
    public static SubLObject inference_chooses_to_throw_away_all_transformations_on_problem_int(SubLObject inference, SubLObject problem, SubLObject justifyP) {
        SubLObject allow_hl_predicate_transformationP = inference_datastructures_inference.inference_allow_hl_predicate_transformationP(inference);
        SubLObject allow_unbound_predicate_transformationP = inference_datastructures_inference.inference_allow_unbound_predicate_transformationP(inference);
        SubLObject allow_evaluatable_predicate_transformationP = inference_datastructures_inference.inference_allow_evaluatable_predicate_transformationP(inference);
        if (NIL == allow_unbound_predicate_transformationP) {
            if (NIL == allow_hl_predicate_transformationP && NIL != problem_uses_hl_predicateP(problem) && NIL == collection_backchain_encouraged_problemP(problem)) {
                if (NIL != justifyP) {
                    return $str44$problem_uses_an_HL_predicate__HL_;
                }
                return T;
            } else if (NIL == allow_evaluatable_predicate_transformationP && NIL != problem_uses_evaluatable_predicateP(problem)) {
                if (NIL != justifyP) {
                    return $str45$problem_uses_an_evaluatable_predi;
                }
                return T;
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 32000L)
    public static SubLObject collection_backchain_encouraged_problemP(SubLObject problem) {
        SubLObject asent = inference_datastructures_problem.single_literal_problem_atomic_sentence(problem);
        SubLObject mt = inference_datastructures_problem.single_literal_problem_mt(problem);
        return collection_backchain_encouraged_asentP(asent, mt);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 32300L)
    public static SubLObject problem_uses_hl_predicateP(SubLObject problem) {
        if (NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
            SubLObject predicate = inference_datastructures_problem.single_literal_problem_predicate(problem);
            return hl_supports.hl_predicate_p(predicate);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 32500L)
    public static SubLObject problem_uses_evaluatable_predicateP(SubLObject problem) {
        if (NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
            SubLObject predicate = inference_datastructures_problem.single_literal_problem_predicate(problem);
            return makeBoolean(NIL != forts.fort_p(predicate) && NIL != inference_trampolines.inference_evaluatable_predicateP(predicate));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 32800L)
    public static SubLObject simple_strategy_deems_rewrite_tactic_redundantP(SubLObject strategy, SubLObject tactic) {
        if (NIL != inference_worker_rewrite.rewrite_tactic_p(tactic)) {
            SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
            SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
            SubLObject new_module = inference_datastructures_tactic.tactic_hl_module(tactic);
            if (NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
                SubLObject redundantP = NIL;
                SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
                SubLObject basis_object;
                SubLObject state;
                SubLObject rewrite_link;
                SubLObject old_tactic;
                SubLObject old_module;
                SubLObject supported_problem;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == redundantP
                        && NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    rewrite_link = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, rewrite_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(rewrite_link, $REWRITE)) {
                        old_tactic = inference_worker_rewrite.rewrite_link_tactic(rewrite_link);
                        old_module = inference_datastructures_tactic.tactic_hl_module(old_tactic);
                        if (old_module.eql(new_module)) {
                            supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(rewrite_link);
                            if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(supported_problem, inference)) {
                                redundantP = T;
                            }
                        }
                    }
                }
                return redundantP;
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 33700L)
    public static SubLObject tactic_exceeds_productivity_limitP(SubLObject tactic, SubLObject strategic_context) {
        if (NIL == inference_datastructures_strategy.strategy_p(strategic_context)) {
            return NIL;
        }
        SubLObject productivity_limit = inference_datastructures_strategy.strategy_productivity_limit(strategic_context);
        if (NIL != inference_datastructures_enumerated_types.infinite_productivity_p(productivity_limit)) {
            return NIL;
        }
        SubLObject productivity = inference_datastructures_strategy.tactic_strategic_productivity(tactic, strategic_context);
        return inference_datastructures_enumerated_types.productivity_G(productivity, productivity_limit);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 34300L)
    public static SubLObject simple_strategy_chooses_to_set_aside_transformation_tacticP(SubLObject strategy, SubLObject transformation_tactic) {
        return simple_strategy_chooses_to_set_aside_transformation_tactic_int(strategy, transformation_tactic, NIL);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 34500L)
    public static SubLObject why_simple_strategy_chooses_to_set_aside_transformation_tactic(SubLObject strategy, SubLObject transformation_tactic) {
        return simple_strategy_chooses_to_set_aside_transformation_tactic_int(strategy, transformation_tactic, T);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 34700L)
    public static SubLObject simple_strategy_chooses_to_set_aside_transformation_tactic_int(SubLObject strategy, SubLObject transformation_tactic, SubLObject justifyP) {
        SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
        if (NIL != justifyP) {
            return why_inference_chooses_to_set_aside_transformation_tactic(inference, transformation_tactic);
        }
        return inference_chooses_to_set_aside_transformation_tacticP(inference, transformation_tactic);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 35100L)
    public static SubLObject inference_chooses_to_set_aside_transformation_tacticP(SubLObject inference, SubLObject transformation_tactic) {
        return inference_chooses_to_set_aside_transformation_tactic_int(inference, transformation_tactic, NIL);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 35300L)
    public static SubLObject why_inference_chooses_to_set_aside_transformation_tactic(SubLObject inference, SubLObject transformation_tactic) {
        return inference_chooses_to_set_aside_transformation_tactic_int(inference, transformation_tactic, T);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 35500L)
    public static SubLObject inference_chooses_to_set_aside_transformation_tactic_int(SubLObject inference, SubLObject transformation_tactic, SubLObject justifyP) {
        SubLObject rule = inference_worker_transformation.transformation_tactic_rule(transformation_tactic);
        if (NIL != rule && NIL != inference_analysis.transformation_rule_has_insufficient_historical_utilityP(rule, inference)) {
            if (NIL != justifyP) {
                return $str35$the_rule_for_this_tactic_has_an_i;
            }
            return T;
        } else {
            SubLObject problem = inference_datastructures_tactic.tactic_problem(transformation_tactic);
            if (NIL != inference_worker.problem_transformation_allowed_wrt_max_transformation_depthP(inference, problem)) {
                return NIL;
            }
            if (NIL != justifyP) {
                return $str47$problem_exceeds_max_transformatio;
            }
            return T;
        }
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 36200L)
    public static SubLObject simple_strategy_chooses_to_throw_away_transformation_tacticP_internal(SubLObject strategy, SubLObject transformation_tactic) {
        return simple_strategy_chooses_to_throw_away_transformation_tactic_int(strategy, transformation_tactic, NIL);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 36200L)
    public static SubLObject simple_strategy_chooses_to_throw_away_transformation_tacticP(SubLObject strategy, SubLObject transformation_tactic) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return simple_strategy_chooses_to_throw_away_transformation_tacticP_internal(strategy, transformation_tactic);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym48$SIMPLE_STRATEGY_CHOOSES_TO_THROW_AWAY_TRANSFORMATION_TACTIC_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym48$SIMPLE_STRATEGY_CHOOSES_TO_THROW_AWAY_TRANSFORMATION_TACTIC_, TWO_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym48$SIMPLE_STRATEGY_CHOOSES_TO_THROW_AWAY_TRANSFORMATION_TACTIC_, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_2(strategy, transformation_tactic);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (strategy.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (NIL != cached_args && NIL == cached_args.rest() && transformation_tactic.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(simple_strategy_chooses_to_throw_away_transformation_tacticP_internal(strategy, transformation_tactic)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(strategy, transformation_tactic));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 36500L)
    public static SubLObject why_simple_strategy_chooses_to_throw_away_transformation_tactic(SubLObject strategy, SubLObject transformation_tactic) {
        return simple_strategy_chooses_to_throw_away_transformation_tactic_int(strategy, transformation_tactic, T);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 36700L)
    public static SubLObject simple_strategy_chooses_to_throw_away_transformation_tactic_int(SubLObject strategy, SubLObject transformation_tactic, SubLObject justifyP) {
        SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
        if (NIL != justifyP) {
            return why_inference_chooses_to_throw_away_transformation_tactic(inference, transformation_tactic);
        }
        return inference_chooses_to_throw_away_transformation_tacticP(inference, transformation_tactic);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 37100L)
    public static SubLObject inference_chooses_to_throw_away_transformation_tacticP(SubLObject inference, SubLObject transformation_tactic) {
        return inference_chooses_to_throw_away_transformation_tactic_int(inference, transformation_tactic, NIL);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 37300L)
    public static SubLObject why_inference_chooses_to_throw_away_transformation_tactic(SubLObject inference, SubLObject transformation_tactic) {
        return inference_chooses_to_throw_away_transformation_tactic_int(inference, transformation_tactic, T);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 37500L)
    public static SubLObject inference_chooses_to_throw_away_transformation_tactic_int(SubLObject inference, SubLObject transformation_tactic, SubLObject justifyP) {
        SubLObject rule = inference_worker_transformation.transformation_tactic_rule(transformation_tactic);
        if (NIL != rule && NIL == inference_datastructures_inference.inference_allows_use_of_all_rulesP(inference) && NIL == inference_datastructures_inference.inference_allows_use_of_ruleP(inference, rule)) {
            if (NIL != justifyP) {
                return $str49$proof_checker_mode_is_enabled__an;
            }
            return T;
        } else {
            if (NIL != inference_worker_transformation.meta_transformation_tactic_p(transformation_tactic)) {
                SubLObject problem = inference_datastructures_tactic.tactic_problem(transformation_tactic);
                if (NIL != inference_chooses_to_throw_away_all_transformations_on_problemP(inference, problem)) {
                    if (NIL != justifyP) {
                        return why_inference_chooses_to_throw_away_all_transformations_on_problem(inference, problem);
                    }
                    return T;
                }
            }
            SubLObject allow_hl_predicate_transformationP = inference_datastructures_inference.inference_allow_hl_predicate_transformationP(inference);
            if (NIL == allow_hl_predicate_transformationP && NIL != tactic_requires_hl_predicate_transformationP(transformation_tactic)) {
                if (NIL != justifyP) {
                    return $str50$tactic_requires_HL_predicate_tran;
                }
                return T;
            } else {
                SubLObject allow_unbound_predicate_transformationP = inference_datastructures_inference.inference_allow_unbound_predicate_transformationP(inference);
                if (NIL == allow_unbound_predicate_transformationP && NIL != tactic_requires_unbound_predicate_transformationP(transformation_tactic)) {
                    if (NIL != justifyP) {
                        return $str51$tactic_requires_unbound_predicate;
                    }
                    return T;
                } else {
                    SubLObject allow_evaluatable_predicate_transformationP = inference_datastructures_inference.inference_allow_evaluatable_predicate_transformationP(inference);
                    if (NIL != allow_evaluatable_predicate_transformationP || NIL == tactic_requires_evaluatable_predicate_transformationP(transformation_tactic)) {
                        return NIL;
                    }
                    if (NIL != justifyP) {
                        return $str52$tactic_requires_evaluatable_predi;
                    }
                    return T;
                }
            }
        }
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 39800L)
    public static SubLObject strategy_disallows_use_of_hl_module_on_problemP(SubLObject strategy, SubLObject hl_module, SubLObject problem) {
        SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
        SubLObject allow_hl_predicate_transformationP = inference_datastructures_inference.inference_allow_hl_predicate_transformationP(inference);
        if (NIL == allow_hl_predicate_transformationP && NIL != hl_module_requires_hl_predicate_transformationP(hl_module, problem)) {
            return T;
        }
        SubLObject allow_unbound_predicate_transformationP = inference_datastructures_inference.inference_allow_unbound_predicate_transformationP(inference);
        if (NIL == allow_unbound_predicate_transformationP && NIL != hl_module_requires_unbound_predicate_transformationP(hl_module)) {
            return T;
        }
        SubLObject allow_evaluatable_predicate_transformationP = inference_datastructures_inference.inference_allow_evaluatable_predicate_transformationP(inference);
        if (NIL == allow_evaluatable_predicate_transformationP && NIL != problem_uses_evaluatable_predicateP(problem)) {
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 40700L)
    public static SubLObject tactic_requires_hl_predicate_transformationP(SubLObject tactic) {
        SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
        SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        return hl_module_requires_hl_predicate_transformationP(hl_module, problem);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 41000L)
    public static SubLObject hl_module_requires_hl_predicate_transformationP(SubLObject hl_module, SubLObject problem) {
        if (NIL == inference_modules.transformation_module_p(hl_module)) {
            return NIL;
        }
        if (NIL != hl_module_only_applies_to_hl_predicatesP(hl_module)) {
            return makeBoolean(NIL == inference_datastructures_problem.single_literal_problem_p(problem) || NIL == collection_backchain_encouraged_problemP(problem));
        }
        if (NIL != problem_uses_hl_predicateP(problem)) {
            return makeBoolean(NIL == inference_modules.meta_transformation_module_p(hl_module));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 41400L)
    public static SubLObject collection_backchain_encouraged_tacticP(SubLObject tactic) {
        SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        if (NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
            return collection_backchain_encouraged_problemP(problem);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 41700L)
    public static SubLObject collection_backchain_encouraged_asentP(SubLObject asent, SubLObject mt) {
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject resultP = NIL;
        if (NIL != subl_promotions.memberP(predicate, $list53, UNPROVIDED, UNPROVIDED)) {
            SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            if (NIL != forts.fort_p(collection)) {
                if (predicate.eql($$isa)) {
                    resultP = makeBoolean(NIL != inference_trampolines.inference_collection_backchain_encouragedP(collection, mt) || NIL != inference_trampolines.inference_collection_isa_backchain_encouragedP(collection, mt));
                } else if (predicate.eql($$genls)) {
                    resultP = makeBoolean(NIL != inference_trampolines.inference_collection_backchain_encouragedP(collection, mt) || NIL != inference_trampolines.inference_collection_genls_backchain_encouragedP(collection, mt));
                }
            }
            return resultP;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 42500L)
    public static SubLObject tactic_problem_uses_hl_predicateP(SubLObject tactic) {
        SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        return problem_uses_hl_predicateP(problem);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 42600L)
    public static SubLObject transformation_tactic_only_applies_to_hl_predicatesP(SubLObject tactic) {
        return hl_module_only_applies_to_hl_predicatesP(inference_datastructures_tactic.tactic_hl_module(tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 42800L)
    public static SubLObject hl_module_only_applies_to_hl_predicatesP(SubLObject hl_module) {
        SubLObject predicate = inference_modules.hl_module_predicate(hl_module);
        return hl_supports.hl_predicate_p(predicate);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 42900L)
    public static SubLObject tactic_requires_unbound_predicate_transformationP(SubLObject tactic) {
        if (NIL != inference_worker_transformation.transformation_tactic_p(tactic)) {
            SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
            return hl_module_requires_unbound_predicate_transformationP(hl_module);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 43200L)
    public static SubLObject hl_module_requires_unbound_predicate_transformationP(SubLObject hl_module) {
        return transformation_modules.trans_unbound_predicate_module_p(hl_module);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 43300L)
    public static SubLObject tactic_requires_evaluatable_predicate_transformationP(SubLObject tactic) {
        if (NIL != inference_worker_transformation.transformation_tactic_p(tactic)) {
            SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
            return problem_uses_evaluatable_predicateP(problem);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 43500L)
    public static SubLObject tactic_completeP(SubLObject tactic, SubLObject strategic_context) {
        return Equality.eq($COMPLETE, inference_datastructures_strategy.tactic_strategic_completeness(tactic, strategic_context));
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 43700L)
    public static SubLObject tactic_incompleteP(SubLObject tactic, SubLObject strategic_context) {
        return Equality.eq($INCOMPLETE, inference_datastructures_strategy.tactic_strategic_completeness(tactic, strategic_context));
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 43800L)
    public static SubLObject tactic_impossibleP(SubLObject tactic, SubLObject strategic_context) {
        return Equality.eq($IMPOSSIBLE, inference_datastructures_strategy.tactic_strategic_completeness(tactic, strategic_context));
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 44000L)
    public static SubLObject tactic_preferredP(SubLObject tactic, SubLObject strategic_context) {
        return Equality.eq($PREFERRED, inference_datastructures_strategy.tactic_strategic_preference_level(tactic, strategic_context));
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 44100L)
    public static SubLObject tactic_dispreferredP(SubLObject tactic, SubLObject strategic_context) {
        return Equality.eq($DISPREFERRED, inference_datastructures_strategy.tactic_strategic_preference_level(tactic, strategic_context));
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 44300L)
    public static SubLObject tactic_disallowedP(SubLObject tactic, SubLObject strategic_context) {
        return Equality.eq($DISALLOWED, inference_datastructures_strategy.tactic_strategic_preference_level(tactic, strategic_context));
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 44400L)
    public static SubLObject tactic_doomedP(SubLObject tactic, SubLObject strategic_context) {
        return Equality.eq($DOOMED, inference_datastructures_strategy.tactic_strategic_preference_level(tactic, strategic_context));
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 44600L)
    public static SubLObject tactic_disallowed_or_doomedP(SubLObject tactic, SubLObject strategic_context) {
        return makeBoolean(NIL != tactic_disallowedP(tactic, strategic_context) || NIL != tactic_doomedP(tactic, strategic_context));
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 44800L)
    public static SubLObject problem_has_executed_a_complete_tacticP(SubLObject problem, SubLObject strategic_context, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $CONTENT;
        }
        if (NIL == inference_datastructures_problem_store.problem_store_removal_allowedP(inference_datastructures_problem.problem_store(problem))) {
            return NIL;
        }
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, type) && NIL != inference_datastructures_problem.do_problem_tactics_status_match(tactic, $EXECUTED) && NIL != tactic_completeP(tactic, strategic_context)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 45200L)
    public static SubLObject lookahead_problem_has_executed_a_complete_tacticP(SubLObject problem, SubLObject strategic_context, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $CONTENT;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject jo_tactic = NIL;
        jo_tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(jo_tactic, $JOIN_ORDERED) && NIL != problem_has_executed_a_complete_tacticP(inference_worker_join_ordered.join_ordered_tactic_lookahead_problem(jo_tactic), strategic_context, type)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            jo_tactic = cdolist_list_var.first();
        }
        cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject join_tactic = NIL;
        join_tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(join_tactic, $JOIN)) {
                thread.resetMultipleValues();
                SubLObject lookahead_1 = inference_worker_join.join_tactic_lookahead_problems(join_tactic);
                SubLObject lookahead_2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != problem_has_executed_a_complete_tacticP(lookahead_1, strategic_context, type) || NIL != problem_has_executed_a_complete_tacticP(lookahead_2, strategic_context, type)) {
                    return T;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            join_tactic = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 46000L)
    public static SubLObject problem_or_lookahead_problem_has_executed_a_complete_tacticP(SubLObject problem, SubLObject strategic_context, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $CONTENT;
        }
        return makeBoolean(NIL != problem_has_executed_a_complete_tacticP(problem, strategic_context, type) || NIL != lookahead_problem_has_executed_a_complete_tacticP(problem, strategic_context, type));
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 46300L)
    public static SubLObject problem_has_executed_a_preferred_tacticP(SubLObject problem, SubLObject strategic_context, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $LOGICAL;
        }
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, type) && NIL != inference_datastructures_problem.do_problem_tactics_status_match(tactic, $EXECUTED) && NIL != tactic_preferredP(tactic, strategic_context)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 46500L)
    public static SubLObject problem_has_executed_a_tactic_of_typeP(SubLObject problem, SubLObject type) {
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, type) && NIL != inference_datastructures_problem.do_problem_tactics_status_match(tactic, $EXECUTED)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 46700L)
    public static SubLObject strategy_admits_tactic_wrt_proof_specP(SubLObject strategy, SubLObject tactic) {
        if (NIL != strategy_admits_all_tactics_wrt_proof_specP(strategy)) {
            return T;
        }
        SubLObject proof_spec = inference_datastructures_strategy.strategy_problem_proof_spec(strategy, inference_datastructures_tactic.tactic_problem(tactic));
        return proof_spec_admits_tacticP(proof_spec, tactic);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 47000L)
    public static SubLObject strategy_admits_all_tactics_wrt_proof_specP(SubLObject strategy) {
        return Equality.eq($ANYTHING, inference_datastructures_strategy.strategy_proof_spec(strategy));
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 47200L)
    public static SubLObject proof_spec_admits_tacticP(SubLObject proof_spec, SubLObject tactic) {
        if ($ANYTHING == proof_spec) {
            return T;
        }
        if ($NOTHING == proof_spec) {
            return NIL;
        }
        if (NIL != inference_proof_spec.or_pattern_p(proof_spec)) {
            return disjunctive_proof_spec_admits_tacticP(proof_spec, tactic);
        }
        if (NIL != meta_tactic_p(tactic)) {
            return T;
        }
        if (NIL != inference_worker_removal.removal_tactic_p(tactic)) {
            return proof_spec_admits_removal_tacticP(proof_spec, tactic);
        }
        if (NIL != inference_worker_join_ordered.join_ordered_tactic_p(tactic)) {
            return proof_spec_admits_join_ordered_tacticP(proof_spec, tactic);
        }
        if (NIL != inference_worker_join.join_tactic_p(tactic)) {
            return proof_spec_admits_join_tacticP(proof_spec, tactic);
        }
        if (NIL != inference_worker_split.meta_split_tactic_p(tactic)) {
            return T;
        }
        if (NIL != inference_worker_split.split_tactic_p(tactic)) {
            return proof_spec_admits_split_tacticP(proof_spec, tactic);
        }
        if (NIL != inference_worker_restriction.simplification_tactic_p(tactic)) {
            return proof_spec_admits_simplification_tacticP(proof_spec, tactic);
        }
        if (NIL != inference_worker_removal.conjunctive_removal_tactic_p(tactic)) {
            return proof_spec_admits_conjuctive_removal_tacticP(proof_spec, tactic);
        }
        if (NIL != inference_worker_transformation.transformation_tactic_p(tactic)) {
            return proof_spec_admits_transformation_tacticP(proof_spec, tactic);
        }
        if (NIL != inference_worker_union.union_tactic_p(tactic)) {
            return proof_spec_admits_union_tacticP(proof_spec, tactic);
        }
        return Errors.error($str70$Time_to_support_proof_spec_admitt, inference_datastructures_tactic.tactic_type(tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 48500L)
    public static SubLObject meta_tactic_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_datastructures_tactic.tactic_p(v_object) && (NIL != inference_worker_removal.meta_removal_tactic_p(v_object) || NIL != inference_worker_transformation.meta_transformation_tactic_p(v_object) || NIL != inference_worker_split.meta_split_tactic_p(v_object)));
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 48700L)
    public static SubLObject disjunctive_proof_spec_admits_tacticP(SubLObject proof_spec, SubLObject tactic) {
        SubLObject operator = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(proof_spec, proof_spec, $list71);
        operator = proof_spec.first();
        SubLObject current = proof_spec.rest();
        SubLObject cdolist_list_var;
        SubLObject sub_specs = cdolist_list_var = current;
        SubLObject sub_spec = NIL;
        sub_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != proof_spec_admits_tacticP(sub_spec, tactic)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            sub_spec = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 49000L)
    public static SubLObject proof_spec_admits_removal_tacticP(SubLObject proof_spec, SubLObject removal_tactic) {
        if (NIL != inference_proof_spec.removal_proof_spec_p(proof_spec)) {
            return removal_proof_spec_admits_removal_tacticP(proof_spec, removal_tactic);
        }
        if (NIL != inference_proof_spec.restriction_proof_spec_p(proof_spec)) {
            return restriction_proof_spec_admits_removal_tacticP(proof_spec, removal_tactic);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 49300L)
    public static SubLObject proof_spec_admits_join_ordered_tacticP(SubLObject proof_spec, SubLObject join_ordered_tactic) {
        if (NIL != inference_proof_spec.join_ordered_proof_spec_p(proof_spec)) {
            return join_ordered_proof_spec_admits_join_ordered_tacticP(proof_spec, join_ordered_tactic);
        }
        if (NIL != inference_proof_spec.residual_transformation_proof_spec_p(proof_spec)) {
            return residual_transformation_proof_spec_admits_join_ordered_tacticP(proof_spec, join_ordered_tactic);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 49700L)
    public static SubLObject proof_spec_admits_join_tacticP(SubLObject proof_spec, SubLObject join_tactic) {
        if (NIL != inference_proof_spec.join_proof_spec_p(proof_spec)) {
            return join_proof_spec_admits_join_tacticP(proof_spec, join_tactic);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 49900L)
    public static SubLObject proof_spec_admits_split_tacticP(SubLObject proof_spec, SubLObject split_tactic) {
        if (NIL != inference_proof_spec.split_proof_spec_p(proof_spec)) {
            return split_proof_spec_admits_split_proof_tacticP(proof_spec, split_tactic);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 50100L)
    public static SubLObject proof_spec_admits_simplification_tacticP(SubLObject proof_spec, SubLObject tactic) {
        if (NIL != inference_proof_spec.restriction_proof_spec_p(proof_spec)) {
            return restriction_proof_spec_admits_simplification_tacticP(proof_spec, tactic);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 50300L)
    public static SubLObject proof_spec_admits_conjuctive_removal_tacticP(SubLObject proof_spec, SubLObject tactic) {
        if (NIL != inference_proof_spec.conjunctive_removal_proof_spec_p(proof_spec)) {
            return conjunctive_removal_proof_spec_admits_conjunctive_removal_tacticP(proof_spec, tactic);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 50600L)
    public static SubLObject proof_spec_admits_transformation_tacticP(SubLObject proof_spec, SubLObject tactic) {
        if (NIL != inference_proof_spec.transformation_proof_spec_p(proof_spec)) {
            return transformation_proof_spec_admits_transformation_tacticP(proof_spec, tactic);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 50800L)
    public static SubLObject proof_spec_admits_union_tacticP(SubLObject proof_spec, SubLObject union_tactic) {
        if (NIL != inference_proof_spec.union_proof_spec_p(proof_spec)) {
            return union_proof_spec_admits_union_tacticP(proof_spec, union_tactic);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 51000L)
    public static SubLObject removal_proof_spec_admits_removal_tacticP(SubLObject removal_proof_spec, SubLObject removal_tactic) {
        SubLObject removal_token = NIL;
        SubLObject literal_spec = NIL;
        SubLObject removal_module_spec = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(removal_proof_spec, removal_proof_spec, $list72);
        removal_token = removal_proof_spec.first();
        SubLObject current = removal_proof_spec.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, removal_proof_spec, $list72);
        literal_spec = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, removal_proof_spec, $list72);
        removal_module_spec = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject problem = inference_datastructures_tactic.tactic_problem(removal_tactic);
            SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(removal_tactic);
            return makeBoolean(NIL != literal_spec_admits_single_literal_problemP(literal_spec, problem) && NIL != removal_module_spec_admits_removal_module(removal_module_spec, hl_module));
        }
        cdestructuring_bind.cdestructuring_bind_error(removal_proof_spec, $list72);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 51500L)
    public static SubLObject restriction_proof_spec_admits_removal_tacticP(SubLObject restriction_proof_spec, SubLObject removal_tactic) {
        SubLObject restriction_token = NIL;
        SubLObject sub_spec = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(restriction_proof_spec, restriction_proof_spec, $list73);
        restriction_token = restriction_proof_spec.first();
        SubLObject current = restriction_proof_spec.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, restriction_proof_spec, $list73);
        sub_spec = current.first();
        current = current.rest();
        if (NIL == current) {
            return proof_spec_admits_tacticP(sub_spec, removal_tactic);
        }
        cdestructuring_bind.cdestructuring_bind_error(restriction_proof_spec, $list73);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 51800L)
    public static SubLObject split_proof_spec_admits_split_proof_tacticP(SubLObject split_proof_spec, SubLObject split_tactic) {
        SubLObject split_link = inference_worker_split.split_tactic_link(split_tactic);
        SubLObject split_sub_proof_specs = inference_proof_spec.split_proof_spec_sub_proof_specs(split_proof_spec);
        SubLObject matchedP = NIL;
        SubLObject link_var = split_link;
        SubLObject rest;
        SubLObject supporting_mapped_problem;
        SubLObject supporting_problem;
        SubLObject variable_map;
        SubLObject csome_list_var;
        SubLObject sub_proof_spec;
        SubLObject csome_list_var_$2;
        SubLObject tactic;
        for (rest = NIL, rest = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var); NIL == matchedP && NIL != rest; rest = rest.rest()) {
            supporting_mapped_problem = rest.first();
            if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem)) {
                supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                if (NIL == matchedP) {
                    csome_list_var = split_sub_proof_specs;
                    sub_proof_spec = NIL;
                    sub_proof_spec = csome_list_var.first();
                    while (NIL == matchedP && NIL != csome_list_var) {
                        if (NIL == matchedP) {
                            for (csome_list_var_$2 = inference_datastructures_problem.problem_tactics(supporting_problem), tactic = NIL, tactic = csome_list_var_$2.first(); NIL == matchedP
                                    && NIL != csome_list_var_$2; matchedP = proof_spec_admits_tacticP(sub_proof_spec, tactic), csome_list_var_$2 = csome_list_var_$2.rest(), tactic = csome_list_var_$2.first()) {
                            }
                        }
                        csome_list_var = csome_list_var.rest();
                        sub_proof_spec = csome_list_var.first();
                    }
                }
            }
        }
        return matchedP;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 52700L)
    public static SubLObject restriction_proof_spec_admits_simplification_tacticP(SubLObject proof_spec, SubLObject simplification_tactic) {
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 52900L)
    public static SubLObject conjunctive_removal_proof_spec_admits_conjunctive_removal_tacticP(SubLObject proof_spec, SubLObject conjunctive_removal_tactic) {
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 53100L)
    public static SubLObject join_ordered_proof_spec_admits_join_ordered_tacticP(SubLObject proof_spec, SubLObject join_ordered_tactic) {
        SubLObject focal_proof_spec = inference_proof_spec.join_ordered_proof_spec_focal_proof_spec(proof_spec);
        SubLObject focal_problem = inference_worker_join_ordered.join_ordered_tactic_lookahead_problem(join_ordered_tactic);
        return inference_proof_spec.proof_spec_possibly_admits_problemP(focal_proof_spec, focal_problem);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 53400L)
    public static SubLObject union_proof_spec_admits_union_tacticP(SubLObject proof_spec, SubLObject union_tactic) {
        SubLObject disjunct_proof_spec = inference_proof_spec.union_proof_spec_disjunct_proof_spec(proof_spec);
        SubLObject disjunct_problem = inference_worker_union.union_tactic_lookahead_problem(union_tactic);
        return inference_proof_spec.proof_spec_possibly_admits_problemP(disjunct_proof_spec, disjunct_problem);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 53700L)
    public static SubLObject residual_transformation_proof_spec_admits_join_ordered_tacticP(SubLObject proof_spec, SubLObject join_ordered_tactic) {
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 53900L)
    public static SubLObject join_proof_spec_admits_join_tacticP(SubLObject proof_spec, SubLObject join_tactic) {
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 54000L)
    public static SubLObject transformation_proof_spec_admits_transformation_tacticP(SubLObject transformation_proof_spec, SubLObject transformation_tactic) {
        SubLObject transformation_token = NIL;
        SubLObject literal_spec = NIL;
        SubLObject transformation_module_spec = NIL;
        SubLObject rule_spec = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(transformation_proof_spec, transformation_proof_spec, $list74);
        transformation_token = transformation_proof_spec.first();
        SubLObject current = transformation_proof_spec.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, transformation_proof_spec, $list74);
        literal_spec = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, transformation_proof_spec, $list74);
        transformation_module_spec = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, transformation_proof_spec, $list74);
        rule_spec = current.first();
        current = current.rest();
        SubLObject sub_spec = current.isCons() ? current.first() : NIL;
        cdestructuring_bind.destructuring_bind_must_listp(current, transformation_proof_spec, $list74);
        current = current.rest();
        if (NIL == current) {
            SubLObject problem = inference_datastructures_tactic.tactic_problem(transformation_tactic);
            SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(transformation_tactic);
            SubLObject rule = inference_worker_transformation.transformation_tactic_rule(transformation_tactic);
            return makeBoolean(NIL != literal_spec_admits_single_literal_problemP(literal_spec, problem) && NIL != transformation_module_spec_admits_transformation_module(transformation_module_spec, hl_module) && (NIL == rule || NIL != rule_spec_admits_rule(rule_spec, rule)));
        }
        cdestructuring_bind.cdestructuring_bind_error(transformation_proof_spec, $list74);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 54800L)
    public static SubLObject ist_sentences_from_clause(SubLObject clause) {
        SubLObject ist_sentences = NIL;
        SubLObject neg_lits = NIL;
        SubLObject pos_lits = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(clause, clause, $list75);
        neg_lits = clause.first();
        SubLObject current = clause.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, clause, $list75);
        pos_lits = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject cdolist_list_var = neg_lits;
            SubLObject neg_lit = NIL;
            neg_lit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current_$4;
                SubLObject datum_$3 = current_$4 = neg_lit;
                SubLObject mt = NIL;
                SubLObject sentence = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$4, datum_$3, $list76);
                mt = current_$4.first();
                current_$4 = current_$4.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$4, datum_$3, $list76);
                sentence = current_$4.first();
                current_$4 = current_$4.rest();
                if (NIL == current_$4) {
                    ist_sentences = cons(list($$ist, mt, list($$not, sentence)), ist_sentences);
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$3, $list76);
                }
                cdolist_list_var = cdolist_list_var.rest();
                neg_lit = cdolist_list_var.first();
            }
            cdolist_list_var = pos_lits;
            SubLObject pos_lit = NIL;
            pos_lit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current_$5;
                SubLObject datum_$4 = current_$5 = pos_lit;
                SubLObject mt = NIL;
                SubLObject sentence = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$5, datum_$4, $list76);
                mt = current_$5.first();
                current_$5 = current_$5.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$5, datum_$4, $list76);
                sentence = current_$5.first();
                current_$5 = current_$5.rest();
                if (NIL == current_$5) {
                    ist_sentences = cons(list($$ist, mt, sentence), ist_sentences);
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$4, $list76);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pos_lit = cdolist_list_var.first();
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(clause, $list75);
        }
        return Sequences.nreverse(ist_sentences);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 55300L)
    public static SubLObject single_literal_pattern_p(SubLObject proof_spec_pattern) {
        return el_utilities.ist_sentence_p(proof_spec_pattern, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 55400L)
    public static SubLObject literal_spec_admits_single_literal_problemP(SubLObject literal_spec, SubLObject problem) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject problem_mt = inference_datastructures_problem.mt_asent_sense_from_single_literal_problem(problem);
        SubLObject problem_asent = thread.secondMultipleValue();
        SubLObject problem_sense = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        SubLObject spec_mt = mt_asent_sense_from_ist_literal(literal_spec);
        SubLObject spec_asent = thread.secondMultipleValue();
        SubLObject spec_sense = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return makeBoolean(problem_sense.eql(spec_sense) && NIL != proof_spec_mt_spec_admits_mtP(spec_mt, problem_mt) && NIL != proof_spec_asent_spec_admits_asentP(spec_asent, problem_asent));
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 55900L)
    public static SubLObject mt_asent_sense_from_ist_literal(SubLObject ist_literal) {
        SubLObject mt = cycl_utilities.formula_arg1(ist_literal, UNPROVIDED);
        SubLObject asent = cycl_utilities.formula_arg2(ist_literal, UNPROVIDED);
        SubLObject sense = $POS;
        if (NIL != el_utilities.el_negation_p(asent)) {
            sense = $NEG;
            asent = cycl_utilities.formula_arg1(asent, UNPROVIDED);
        }
        return Values.values(mt, asent, sense);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 56200L)
    public static SubLObject removal_module_spec_admits_removal_module(SubLObject removal_module_spec, SubLObject hl_module) {
        return makeBoolean(NIL != inference_modules.removal_module_p(hl_module) && NIL != hl_module_spec_admits_hl_module(removal_module_spec, hl_module));
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 56400L)
    public static SubLObject transformation_module_spec_admits_transformation_module(SubLObject transformation_module_spec, SubLObject hl_module) {
        return makeBoolean(NIL != inference_modules.transformation_module_p(hl_module) && NIL != hl_module_spec_admits_hl_module(transformation_module_spec, hl_module));
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 56700L)
    public static SubLObject proof_spec_mt_spec_admits_mtP(SubLObject spec_mt, SubLObject mt) {
        return makeBoolean(NIL != unification.unify_possible(spec_mt, mt) || NIL != formula_pattern_match.pattern_matches_formula(spec_mt, mt));
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 56800L)
    public static SubLObject proof_spec_asent_spec_admits_asentP(SubLObject spec_asent, SubLObject problem_asent) {
        return makeBoolean(NIL != unification.unify_possible(spec_asent, problem_asent) || NIL != formula_pattern_match.pattern_matches_formula(spec_asent, problem_asent)
                || NIL != unification.unify_possible(conses_high.subst(variables.get_variable(ZERO_INTEGER), $ANYTHING, spec_asent, UNPROVIDED, UNPROVIDED), problem_asent));
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 57200L)
    public static SubLObject hl_module_spec_admits_hl_module(SubLObject hl_module_spec, SubLObject hl_module) {
        if (NIL != inference_modules.hl_module_p(hl_module)) {
            SubLObject module_name = inference_modules.hl_module_name(hl_module);
            return pattern_match.pattern_matches_tree(hl_module_spec, module_name);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 57400L)
    public static SubLObject rule_spec_admits_rule(SubLObject rule_spec, SubLObject rule) {
        if (NIL != assertions_high.rule_assertionP(rule)) {
            return pattern_match.pattern_matches_tree(rule_spec, rule);
        }
        return NIL;
    }

    public static SubLObject declare_inference_tactician_strategic_uninterestingness_file() {
        declareFunction(myName, "the_unknown_strategy_uninterestingness_explanation_p", "THE-UNKNOWN-STRATEGY-UNINTERESTINGNESS-EXPLANATION-P", 1, 0, false);
        declareFunction(myName, "strategy_last_uninterestingness_explanation", "STRATEGY-LAST-UNINTERESTINGNESS-EXPLANATION", 0, 0, false);
        declareMacro(me, "with_strategy_uninterestingness_explanations", "WITH-STRATEGY-UNINTERESTINGNESS-EXPLANATIONS");
        declareMacro(me, "without_strategy_uninterestingness_explanations", "WITHOUT-STRATEGY-UNINTERESTINGNESS-EXPLANATIONS");
        declareFunction(myName, "strategy_note_uninterestingness_explanation", "STRATEGY-NOTE-UNINTERESTINGNESS-EXPLANATION", 5, 0, false);
        declareFunction(myName, "strategy_possibly_note_exact_uninterestingness_explanation", "STRATEGY-POSSIBLY-NOTE-EXACT-UNINTERESTINGNESS-EXPLANATION", 1, 0, false);
        declareMacro(me, "strategy_possibly_note_uninterestingness_explanation", "STRATEGY-POSSIBLY-NOTE-UNINTERESTINGNESS-EXPLANATION");
        declareFunction(myName, "strategy_possibly_un_note_uninterestingness_explanation", "STRATEGY-POSSIBLY-UN-NOTE-UNINTERESTINGNESS-EXPLANATION", 0, 0, false);
        declareFunction(myName, "strategy_uninterestingness_explanation_string", "STRATEGY-UNINTERESTINGNESS-EXPLANATION-STRING", 1, 0, false);
        declareFunction(myName, "strategy_uninterestingness_explanation_type_p", "STRATEGY-UNINTERESTINGNESS-EXPLANATION-TYPE-P", 1, 0, false);
        declareFunction(myName, "strategy_uninterestingness_explanation_p", "STRATEGY-UNINTERESTINGNESS-EXPLANATION-P", 1, 0, false);
        declareFunction(myName, "strategy_uninterestingness_subexplanation_p", "STRATEGY-UNINTERESTINGNESS-SUBEXPLANATION-P", 1, 0, false);
        declareFunction(myName, "make_strategy_uninterestingness_explanation", "MAKE-STRATEGY-UNINTERESTINGNESS-EXPLANATION", 1, 4, false);
        declareFunction(myName, "strategy_uninterestingness_explanation_type", "STRATEGY-UNINTERESTINGNESS-EXPLANATION-TYPE", 1, 0, false);
        declareFunction(myName, "strategic_uninterestingness_reason_p", "STRATEGIC-UNINTERESTINGNESS-REASON-P", 1, 0, false);
        declareFunction(myName, "strategy_chooses_to_throw_away_problemP", "STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM?", 2, 1, false);
        declareFunction(myName, "why_strategy_chooses_to_throw_away_problem", "WHY-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM", 2, 0, false);
        declareFunction(myName, "strategy_chooses_to_throw_away_tacticP", "STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC?", 4, 0, false);
        declareFunction(myName, "legacy_strategy_chooses_to_throw_away_tacticP", "LEGACY-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC?", 2, 1, false);
        declareFunction(myName, "legacy_strategy_chooses_to_ignore_tacticP", "LEGACY-STRATEGY-CHOOSES-TO-IGNORE-TACTIC?", 2, 1, false);
        declareFunction(myName, "why_strategy_chooses_to_throw_away_tactic", "WHY-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC", 2, 0, false);
        declareFunction(myName, "strategy_chooses_to_set_aside_problemP", "STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM?", 2, 0, false);
        declareFunction(myName, "why_strategy_chooses_to_set_aside_problem", "WHY-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM", 2, 0, false);
        declareFunction(myName, "strategy_chooses_to_set_aside_tacticP", "STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC?", 4, 0, false);
        declareFunction(myName, "legacy_strategy_chooses_to_set_aside_tacticP", "LEGACY-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC?", 2, 1, false);
        declareFunction(myName, "why_strategy_chooses_to_set_aside_tactic", "WHY-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC", 2, 0, false);
        declareFunction(myName, "strategy_chooses_to_ignore_tacticP", "STRATEGY-CHOOSES-TO-IGNORE-TACTIC?", 2, 1, false);
        declareFunction(myName, "simple_strategy_chooses_to_throw_away_problemP", "SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM?", 2, 0, false);
        declareFunction(myName, "why_simple_strategy_chooses_to_throw_away_problem", "WHY-SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM", 2, 0, false);
        declareFunction(myName, "simple_strategy_chooses_to_throw_away_problem_int", "SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM-INT", 3, 0, false);
        declareFunction(myName, "simple_strategy_chooses_to_throw_away_tacticP", "SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC?", 2, 0, false);
        declareFunction(myName, "why_simple_strategy_chooses_to_throw_away_tactic", "WHY-SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC", 2, 0, false);
        declareFunction(myName, "simple_strategy_chooses_to_throw_away_tactic_int", "SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-INT", 3, 0, false);
        declareFunction(myName, "problem_has_executed_a_complete_removal_tacticP", "PROBLEM-HAS-EXECUTED-A-COMPLETE-REMOVAL-TACTIC?", 2, 0, false);
        declareFunction(myName, "lookahead_problem_has_executed_a_complete_removal_tacticP", "LOOKAHEAD-PROBLEM-HAS-EXECUTED-A-COMPLETE-REMOVAL-TACTIC?", 2, 0, false);
        declareFunction(myName, "problem_or_lookahead_problem_has_executed_a_complete_removal_tacticP", "PROBLEM-OR-LOOKAHEAD-PROBLEM-HAS-EXECUTED-A-COMPLETE-REMOVAL-TACTIC?", 2, 0, false);
        declareFunction(myName, "problem_has_executed_a_generalized_removal_tacticP", "PROBLEM-HAS-EXECUTED-A-GENERALIZED-REMOVAL-TACTIC?", 1, 0, false);
        declareFunction(myName, "strategy_allows_use_of_tactic_hl_moduleP", "STRATEGY-ALLOWS-USE-OF-TACTIC-HL-MODULE?", 2, 0, false);
        declareFunction(myName, "strategy_allows_use_of_hl_moduleP", "STRATEGY-ALLOWS-USE-OF-HL-MODULE?", 2, 0, false);
        declareFunction(myName, "simple_strategy_chooses_to_set_aside_problemP", "SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM?", 2, 0, false);
        declareFunction(myName, "why_simple_strategy_chooses_to_set_aside_problem", "WHY-SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM", 2, 0, false);
        declareFunction(myName, "simple_strategy_chooses_to_set_aside_problem_int", "SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM-INT", 3, 0, false);
        declareFunction(myName, "simple_strategy_chooses_to_set_aside_tacticP", "SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC?", 2, 0, false);
        declareFunction(myName, "why_simple_strategy_chooses_to_set_aside_tactic", "WHY-SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC", 2, 0, false);
        declareFunction(myName, "simple_strategy_chooses_to_set_aside_tactic_int", "SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC-INT", 3, 0, false);
        declareFunction(myName, "simple_strategy_chooses_to_ignore_problemP", "SIMPLE-STRATEGY-CHOOSES-TO-IGNORE-PROBLEM?", 2, 0, false);
        declareFunction(myName, "simple_strategy_chooses_to_ignore_tacticP", "SIMPLE-STRATEGY-CHOOSES-TO-IGNORE-TACTIC?", 2, 0, false);
        declareFunction(myName, "problem_strategically_pendingP", "PROBLEM-STRATEGICALLY-PENDING?", 2, 0, false);
        declareFunction(myName, "strategy_deems_problem_tactically_uninterestingP", "STRATEGY-DEEMS-PROBLEM-TACTICALLY-UNINTERESTING?", 2, 0, false);
        declareFunction(myName, "strategy_has_enough_proofs_for_problemP", "STRATEGY-HAS-ENOUGH-PROOFS-FOR-PROBLEM?", 2, 0, false);
        declareFunction(myName, "tactically_uninteresting_problem_p", "TACTICALLY-UNINTERESTING-PROBLEM-P", 1, 0, false);
        declareFunction(myName, "strategy_deems_problem_strategically_uninterestingP", "STRATEGY-DEEMS-PROBLEM-STRATEGICALLY-UNINTERESTING?", 2, 0, false);
        declareFunction(myName, "strategically_uninteresting_problem_p", "STRATEGICALLY-UNINTERESTING-PROBLEM-P", 2, 0, false);
        declareFunction(myName, "problem_has_relevant_supporting_problemP", "PROBLEM-HAS-RELEVANT-SUPPORTING-PROBLEM?", 3, 0, false);
        declareFunction(myName, "problem_has_interesting_transformation_tacticsP", "PROBLEM-HAS-INTERESTING-TRANSFORMATION-TACTICS?", 2, 0, false);
        declareFunction(myName, "problem_no_tactics_strategically_possibleP", "PROBLEM-NO-TACTICS-STRATEGICALLY-POSSIBLE?", 2, 0, false);
        declareFunction(myName, "inference_chooses_to_set_aside_problemP", "INFERENCE-CHOOSES-TO-SET-ASIDE-PROBLEM?", 2, 0, false);
        declareFunction(myName, "why_inference_chooses_to_set_aside_problem", "WHY-INFERENCE-CHOOSES-TO-SET-ASIDE-PROBLEM", 2, 0, false);
        declareFunction(myName, "inference_chooses_to_set_aside_problem_int", "INFERENCE-CHOOSES-TO-SET-ASIDE-PROBLEM-INT", 3, 0, false);
        declareFunction(myName, "inference_chooses_to_throw_away_problemP", "INFERENCE-CHOOSES-TO-THROW-AWAY-PROBLEM?", 2, 0, false);
        declareFunction(myName, "why_inference_chooses_to_throw_away_problem", "WHY-INFERENCE-CHOOSES-TO-THROW-AWAY-PROBLEM", 2, 0, false);
        declareFunction(myName, "inference_chooses_to_throw_away_problem_int", "INFERENCE-CHOOSES-TO-THROW-AWAY-PROBLEM-INT", 3, 0, false);
        declareFunction(myName, "all_dependent_links_are_forbidden_transformationsP", "ALL-DEPENDENT-LINKS-ARE-FORBIDDEN-TRANSFORMATIONS?", 2, 0, false);
        declareFunction(myName, "transformation_forbidden_by_inferenceP", "TRANSFORMATION-FORBIDDEN-BY-INFERENCE?", 2, 0, false);
        declareFunction(myName, "inference_chooses_to_throw_away_all_transformations_on_problemP_internal", "INFERENCE-CHOOSES-TO-THROW-AWAY-ALL-TRANSFORMATIONS-ON-PROBLEM?-INTERNAL", 2, 0, false);
        declareFunction(myName, "inference_chooses_to_throw_away_all_transformations_on_problemP", "INFERENCE-CHOOSES-TO-THROW-AWAY-ALL-TRANSFORMATIONS-ON-PROBLEM?", 2, 0, false);
        declareFunction(myName, "why_inference_chooses_to_throw_away_all_transformations_on_problem", "WHY-INFERENCE-CHOOSES-TO-THROW-AWAY-ALL-TRANSFORMATIONS-ON-PROBLEM", 2, 0, false);
        declareFunction(myName, "inference_chooses_to_throw_away_all_transformations_on_problem_int", "INFERENCE-CHOOSES-TO-THROW-AWAY-ALL-TRANSFORMATIONS-ON-PROBLEM-INT", 3, 0, false);
        declareFunction(myName, "collection_backchain_encouraged_problemP", "COLLECTION-BACKCHAIN-ENCOURAGED-PROBLEM?", 1, 0, false);
        declareFunction(myName, "problem_uses_hl_predicateP", "PROBLEM-USES-HL-PREDICATE?", 1, 0, false);
        declareFunction(myName, "problem_uses_evaluatable_predicateP", "PROBLEM-USES-EVALUATABLE-PREDICATE?", 1, 0, false);
        declareFunction(myName, "simple_strategy_deems_rewrite_tactic_redundantP", "SIMPLE-STRATEGY-DEEMS-REWRITE-TACTIC-REDUNDANT?", 2, 0, false);
        declareFunction(myName, "tactic_exceeds_productivity_limitP", "TACTIC-EXCEEDS-PRODUCTIVITY-LIMIT?", 2, 0, false);
        declareFunction(myName, "simple_strategy_chooses_to_set_aside_transformation_tacticP", "SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-TRANSFORMATION-TACTIC?", 2, 0, false);
        declareFunction(myName, "why_simple_strategy_chooses_to_set_aside_transformation_tactic", "WHY-SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-TRANSFORMATION-TACTIC", 2, 0, false);
        declareFunction(myName, "simple_strategy_chooses_to_set_aside_transformation_tactic_int", "SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-TRANSFORMATION-TACTIC-INT", 3, 0, false);
        declareFunction(myName, "inference_chooses_to_set_aside_transformation_tacticP", "INFERENCE-CHOOSES-TO-SET-ASIDE-TRANSFORMATION-TACTIC?", 2, 0, false);
        declareFunction(myName, "why_inference_chooses_to_set_aside_transformation_tactic", "WHY-INFERENCE-CHOOSES-TO-SET-ASIDE-TRANSFORMATION-TACTIC", 2, 0, false);
        declareFunction(myName, "inference_chooses_to_set_aside_transformation_tactic_int", "INFERENCE-CHOOSES-TO-SET-ASIDE-TRANSFORMATION-TACTIC-INT", 3, 0, false);
        declareFunction(myName, "simple_strategy_chooses_to_throw_away_transformation_tacticP_internal", "SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC?-INTERNAL", 2, 0, false);
        declareFunction(myName, "simple_strategy_chooses_to_throw_away_transformation_tacticP", "SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC?", 2, 0, false);
        declareFunction(myName, "why_simple_strategy_chooses_to_throw_away_transformation_tactic", "WHY-SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC", 2, 0, false);
        declareFunction(myName, "simple_strategy_chooses_to_throw_away_transformation_tactic_int", "SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC-INT", 3, 0, false);
        declareFunction(myName, "inference_chooses_to_throw_away_transformation_tacticP", "INFERENCE-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC?", 2, 0, false);
        declareFunction(myName, "why_inference_chooses_to_throw_away_transformation_tactic", "WHY-INFERENCE-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC", 2, 0, false);
        declareFunction(myName, "inference_chooses_to_throw_away_transformation_tactic_int", "INFERENCE-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC-INT", 3, 0, false);
        declareFunction(myName, "strategy_disallows_use_of_hl_module_on_problemP", "STRATEGY-DISALLOWS-USE-OF-HL-MODULE-ON-PROBLEM?", 3, 0, false);
        declareFunction(myName, "tactic_requires_hl_predicate_transformationP", "TACTIC-REQUIRES-HL-PREDICATE-TRANSFORMATION?", 1, 0, false);
        declareFunction(myName, "hl_module_requires_hl_predicate_transformationP", "HL-MODULE-REQUIRES-HL-PREDICATE-TRANSFORMATION?", 2, 0, false);
        declareFunction(myName, "collection_backchain_encouraged_tacticP", "COLLECTION-BACKCHAIN-ENCOURAGED-TACTIC?", 1, 0, false);
        declareFunction(myName, "collection_backchain_encouraged_asentP", "COLLECTION-BACKCHAIN-ENCOURAGED-ASENT?", 2, 0, false);
        declareFunction(myName, "tactic_problem_uses_hl_predicateP", "TACTIC-PROBLEM-USES-HL-PREDICATE?", 1, 0, false);
        declareFunction(myName, "transformation_tactic_only_applies_to_hl_predicatesP", "TRANSFORMATION-TACTIC-ONLY-APPLIES-TO-HL-PREDICATES?", 1, 0, false);
        declareFunction(myName, "hl_module_only_applies_to_hl_predicatesP", "HL-MODULE-ONLY-APPLIES-TO-HL-PREDICATES?", 1, 0, false);
        declareFunction(myName, "tactic_requires_unbound_predicate_transformationP", "TACTIC-REQUIRES-UNBOUND-PREDICATE-TRANSFORMATION?", 1, 0, false);
        declareFunction(myName, "hl_module_requires_unbound_predicate_transformationP", "HL-MODULE-REQUIRES-UNBOUND-PREDICATE-TRANSFORMATION?", 1, 0, false);
        declareFunction(myName, "tactic_requires_evaluatable_predicate_transformationP", "TACTIC-REQUIRES-EVALUATABLE-PREDICATE-TRANSFORMATION?", 1, 0, false);
        declareFunction(myName, "tactic_completeP", "TACTIC-COMPLETE?", 2, 0, false);
        declareFunction(myName, "tactic_incompleteP", "TACTIC-INCOMPLETE?", 2, 0, false);
        declareFunction(myName, "tactic_impossibleP", "TACTIC-IMPOSSIBLE?", 2, 0, false);
        declareFunction(myName, "tactic_preferredP", "TACTIC-PREFERRED?", 2, 0, false);
        declareFunction(myName, "tactic_dispreferredP", "TACTIC-DISPREFERRED?", 2, 0, false);
        declareFunction(myName, "tactic_disallowedP", "TACTIC-DISALLOWED?", 2, 0, false);
        declareFunction(myName, "tactic_doomedP", "TACTIC-DOOMED?", 2, 0, false);
        declareFunction(myName, "tactic_disallowed_or_doomedP", "TACTIC-DISALLOWED-OR-DOOMED?", 2, 0, false);
        declareFunction(myName, "problem_has_executed_a_complete_tacticP", "PROBLEM-HAS-EXECUTED-A-COMPLETE-TACTIC?", 2, 1, false);
        declareFunction(myName, "lookahead_problem_has_executed_a_complete_tacticP", "LOOKAHEAD-PROBLEM-HAS-EXECUTED-A-COMPLETE-TACTIC?", 2, 1, false);
        declareFunction(myName, "problem_or_lookahead_problem_has_executed_a_complete_tacticP", "PROBLEM-OR-LOOKAHEAD-PROBLEM-HAS-EXECUTED-A-COMPLETE-TACTIC?", 2, 1, false);
        declareFunction(myName, "problem_has_executed_a_preferred_tacticP", "PROBLEM-HAS-EXECUTED-A-PREFERRED-TACTIC?", 2, 1, false);
        declareFunction(myName, "problem_has_executed_a_tactic_of_typeP", "PROBLEM-HAS-EXECUTED-A-TACTIC-OF-TYPE?", 2, 0, false);
        declareFunction(myName, "strategy_admits_tactic_wrt_proof_specP", "STRATEGY-ADMITS-TACTIC-WRT-PROOF-SPEC?", 2, 0, false);
        declareFunction(myName, "strategy_admits_all_tactics_wrt_proof_specP", "STRATEGY-ADMITS-ALL-TACTICS-WRT-PROOF-SPEC?", 1, 0, false);
        declareFunction(myName, "proof_spec_admits_tacticP", "PROOF-SPEC-ADMITS-TACTIC?", 2, 0, false);
        declareFunction(myName, "meta_tactic_p", "META-TACTIC-P", 1, 0, false);
        declareFunction(myName, "disjunctive_proof_spec_admits_tacticP", "DISJUNCTIVE-PROOF-SPEC-ADMITS-TACTIC?", 2, 0, false);
        declareFunction(myName, "proof_spec_admits_removal_tacticP", "PROOF-SPEC-ADMITS-REMOVAL-TACTIC?", 2, 0, false);
        declareFunction(myName, "proof_spec_admits_join_ordered_tacticP", "PROOF-SPEC-ADMITS-JOIN-ORDERED-TACTIC?", 2, 0, false);
        declareFunction(myName, "proof_spec_admits_join_tacticP", "PROOF-SPEC-ADMITS-JOIN-TACTIC?", 2, 0, false);
        declareFunction(myName, "proof_spec_admits_split_tacticP", "PROOF-SPEC-ADMITS-SPLIT-TACTIC?", 2, 0, false);
        declareFunction(myName, "proof_spec_admits_simplification_tacticP", "PROOF-SPEC-ADMITS-SIMPLIFICATION-TACTIC?", 2, 0, false);
        declareFunction(myName, "proof_spec_admits_conjuctive_removal_tacticP", "PROOF-SPEC-ADMITS-CONJUCTIVE-REMOVAL-TACTIC?", 2, 0, false);
        declareFunction(myName, "proof_spec_admits_transformation_tacticP", "PROOF-SPEC-ADMITS-TRANSFORMATION-TACTIC?", 2, 0, false);
        declareFunction(myName, "proof_spec_admits_union_tacticP", "PROOF-SPEC-ADMITS-UNION-TACTIC?", 2, 0, false);
        declareFunction(myName, "removal_proof_spec_admits_removal_tacticP", "REMOVAL-PROOF-SPEC-ADMITS-REMOVAL-TACTIC?", 2, 0, false);
        declareFunction(myName, "restriction_proof_spec_admits_removal_tacticP", "RESTRICTION-PROOF-SPEC-ADMITS-REMOVAL-TACTIC?", 2, 0, false);
        declareFunction(myName, "split_proof_spec_admits_split_proof_tacticP", "SPLIT-PROOF-SPEC-ADMITS-SPLIT-PROOF-TACTIC?", 2, 0, false);
        declareFunction(myName, "restriction_proof_spec_admits_simplification_tacticP", "RESTRICTION-PROOF-SPEC-ADMITS-SIMPLIFICATION-TACTIC?", 2, 0, false);
        declareFunction(myName, "conjunctive_removal_proof_spec_admits_conjunctive_removal_tacticP", "CONJUNCTIVE-REMOVAL-PROOF-SPEC-ADMITS-CONJUNCTIVE-REMOVAL-TACTIC?", 2, 0, false);
        declareFunction(myName, "join_ordered_proof_spec_admits_join_ordered_tacticP", "JOIN-ORDERED-PROOF-SPEC-ADMITS-JOIN-ORDERED-TACTIC?", 2, 0, false);
        declareFunction(myName, "union_proof_spec_admits_union_tacticP", "UNION-PROOF-SPEC-ADMITS-UNION-TACTIC?", 2, 0, false);
        declareFunction(myName, "residual_transformation_proof_spec_admits_join_ordered_tacticP", "RESIDUAL-TRANSFORMATION-PROOF-SPEC-ADMITS-JOIN-ORDERED-TACTIC?", 2, 0, false);
        declareFunction(myName, "join_proof_spec_admits_join_tacticP", "JOIN-PROOF-SPEC-ADMITS-JOIN-TACTIC?", 2, 0, false);
        declareFunction(myName, "transformation_proof_spec_admits_transformation_tacticP", "TRANSFORMATION-PROOF-SPEC-ADMITS-TRANSFORMATION-TACTIC?", 2, 0, false);
        declareFunction(myName, "ist_sentences_from_clause", "IST-SENTENCES-FROM-CLAUSE", 1, 0, false);
        declareFunction(myName, "single_literal_pattern_p", "SINGLE-LITERAL-PATTERN-P", 1, 0, false);
        declareFunction(myName, "literal_spec_admits_single_literal_problemP", "LITERAL-SPEC-ADMITS-SINGLE-LITERAL-PROBLEM?", 2, 0, false);
        declareFunction(myName, "mt_asent_sense_from_ist_literal", "MT-ASENT-SENSE-FROM-IST-LITERAL", 1, 0, false);
        declareFunction(myName, "removal_module_spec_admits_removal_module", "REMOVAL-MODULE-SPEC-ADMITS-REMOVAL-MODULE", 2, 0, false);
        declareFunction(myName, "transformation_module_spec_admits_transformation_module", "TRANSFORMATION-MODULE-SPEC-ADMITS-TRANSFORMATION-MODULE", 2, 0, false);
        declareFunction(myName, "proof_spec_mt_spec_admits_mtP", "PROOF-SPEC-MT-SPEC-ADMITS-MT?", 2, 0, false);
        declareFunction(myName, "proof_spec_asent_spec_admits_asentP", "PROOF-SPEC-ASENT-SPEC-ADMITS-ASENT?", 2, 0, false);
        declareFunction(myName, "hl_module_spec_admits_hl_module", "HL-MODULE-SPEC-ADMITS-HL-MODULE", 2, 0, false);
        declareFunction(myName, "rule_spec_admits_rule", "RULE-SPEC-ADMITS-RULE", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_tactician_strategic_uninterestingness_file() {
        $strategy_uninterestingness_explanation$ = defparameter("*STRATEGY-UNINTERESTINGNESS-EXPLANATION*", $UNINITIALIZED);
        $the_unknown_strategy_uninterestingness_explanation$ = SubLFiles.deflexical("*THE-UNKNOWN-STRATEGY-UNINTERESTINGNESS-EXPLANATION*", $list1);
        $strategy_gathering_uninterestingness_explanationsP$ = SubLFiles.defparameter("*STRATEGY-GATHERING-UNINTERESTINGNESS-EXPLANATIONS?*", NIL);
        $strategy_uninterestingness_explanation_table$ = SubLFiles.deflexical("*STRATEGY-UNINTERESTINGNESS-EXPLANATION-TABLE*", $list17);
        return NIL;
    }

    public static SubLObject setup_inference_tactician_strategic_uninterestingness_file() {
        access_macros.register_macro_helper($sym5$STRATEGY_NOTE_UNINTERESTINGNESS_EXPLANATION, $sym6$STRATEGY_POSSIBLY_NOTE_UNINTERESTINGNESS_EXPLANATION);
        memoization_state.note_memoized_function($sym43$INFERENCE_CHOOSES_TO_THROW_AWAY_ALL_TRANSFORMATIONS_ON_PROBLEM_);
        memoization_state.note_memoized_function($sym48$SIMPLE_STRATEGY_CHOOSES_TO_THROW_AWAY_TRANSFORMATION_TACTIC_);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_tactician_strategic_uninterestingness_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_tactician_strategic_uninterestingness_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_tactician_strategic_uninterestingness_file();
    }

    static {
        me = new inference_tactician_strategic_uninterestingness();
        $strategy_uninterestingness_explanation$ = null;
        $the_unknown_strategy_uninterestingness_explanation$ = null;
        $strategy_gathering_uninterestingness_explanationsP$ = null;
        $strategy_uninterestingness_explanation_table$ = null;
        $UNINITIALIZED = makeKeyword("UNINITIALIZED");
        $list1 = list(makeKeyword("UNKNOWN-REASON"), NIL, NIL, NIL, NIL);
        $sym2$CLET = makeSymbol("CLET");
        $list3 = list(list(makeSymbol("*STRATEGY-UNINTERESTINGNESS-EXPLANATION*"), NIL), list(makeSymbol("*STRATEGY-GATHERING-UNINTERESTINGNESS-EXPLANATIONS?*"), T));
        $list4 = ConsesLow.list(list(makeSymbol("*STRATEGY-GATHERING-UNINTERESTINGNESS-EXPLANATIONS?*"), NIL));
        $sym5$STRATEGY_NOTE_UNINTERESTINGNESS_EXPLANATION = makeSymbol("STRATEGY-NOTE-UNINTERESTINGNESS-EXPLANATION");
        $sym6$STRATEGY_POSSIBLY_NOTE_UNINTERESTINGNESS_EXPLANATION = makeSymbol("STRATEGY-POSSIBLY-NOTE-UNINTERESTINGNESS-EXPLANATION");
        $sym7$STRATEGY_UNINTERESTINGNESS_EXPLANATION_P = makeSymbol("STRATEGY-UNINTERESTINGNESS-EXPLANATION-P");
        $list8 = list(makeSymbol("EXPLANATION-TYPE"), list(makeSymbol("&KEY"), makeSymbol("PROBLEM"), makeSymbol("TACTIC"), makeSymbol("LINK"), makeSymbol("SUBEXPLANATION")));
        $list9 = list(makeKeyword("PROBLEM"), makeKeyword("TACTIC"), makeKeyword("LINK"), makeKeyword("SUBEXPLANATION"));
        $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
        $PROBLEM = makeKeyword("PROBLEM");
        $TACTIC = makeKeyword("TACTIC");
        $LINK = makeKeyword("LINK");
        $SUBEXPLANATION = makeKeyword("SUBEXPLANATION");
        $sym15$PWHEN = makeSymbol("PWHEN");
        $sym16$_STRATEGY_GATHERING_UNINTERESTINGNESS_EXPLANATIONS__ = makeSymbol("*STRATEGY-GATHERING-UNINTERESTINGNESS-EXPLANATIONS?*");
        $list17 = list(new SubLObject[] { list(makeKeyword("STRATEGY-THROWS-AWAY-ALL-TRANSFORMATION"), makeString(":strategy does not permit transformation at all")),
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
                list(makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-SIBLING-IS-A-SIMPLIFICATION"), makeString(":tactic has a sibling tactic that is a simplification")),
                list(makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-PROBLEM-HAS-EARLY-REMOVAL"), makeString(":tactic is thrown away because the problem has an early removal tactic")), list(makeKeyword("TACTIC-ALREADY-SET-ASIDE"), makeString(":tactic was already noted to be set aside")),
                list(makeKeyword("TACTIC-SET-ASIDE-BECAUSE-PROBLEM-SET-ASIDE"), makeString(":tactic is set aside because :subexplanation")), list(makeKeyword("TACTIC-GENERATED-ENOUGH"), makeString(":tactic has already generated enough transformation tactics")),
                list(makeKeyword("TACTIC-SET-ASIDE-BECAUSE-LOOKAHEAD-PROBLEM-SET-ASIDE"), makeString("executing :tactic would motivate a problem that is set aside because :subexplanation")),
                list(makeKeyword("SPLIT-TACTIC-SET-ASIDE-BECAUSE-SIBLING-TACTIC-THROWN-AWAY"), makeString(":tactic has a sibling split tactic that is thrown away because :subexplanation")),
                list(makeKeyword("SPLIT-TACTIC-SET-ASIDE-BECAUSE-SIBLING-TACTIC-SET-ASIDE"), makeString(":tactic has a sibling split tactic that is set aside wrt both removal and transformation, because :subexplanation")),
                list(makeKeyword("LOGICAL-TACTIC-EXCEEDS-MAX-TRANSFORMATION-DEPTH"), makeString(":tactic leads past the :max-transformation-depth")),
                list(makeKeyword("JOIN-ORDERED-TACTIC-LEADS-TO-SET-ASIDE-CONJUNCTIVE-REMOVALS"), makeString(":tactic leads to a conjunctive focal problem where all conjunctive removals are set aside")),
                list(makeKeyword("LINK-SUPPORTED-PROBLEM-THROWN-AWAY"), makeString(":link's supported problem is thrown away because :subexplanation")), list(makeKeyword("SIBLING-EARLY-REMOVAL-LINK"), makeString(":link has a sibling link :subexplanation")),
                list(makeKeyword("EARLY-REMOVAL-LINK"), makeString(":link, which is an early removal link")), list(makeKeyword("LINK-RULE-DISALLOWED"), makeString(":link uses a disallowed rule")),
                list(makeKeyword("LINK-SUPPORTED-PROBLEM-SET-ASIDE"), makeString(":link's supported problem is set aside because :subexplanation")), list(makeKeyword("LINK-EXCEEDS-MAX-TRANSFORMATION-DEPTH"), makeString(":link leads past the :max-transformation-depth")),
                list(makeKeyword("UNKNOWN-REASON"), makeString("an unknown reason")) });
        $list18 = list(makeSymbol("TYPE"), makeSymbol("PROBLEM"), makeSymbol("TACTIC"), makeSymbol("LINK"), makeSymbol("SUBEXPLANATION"));
        $sym19$STRATEGY_UNINTERESTINGNESS_EXPLANATION_TYPE_P = makeSymbol("STRATEGY-UNINTERESTINGNESS-EXPLANATION-TYPE-P");
        $sym20$PROBLEM_P = makeSymbol("PROBLEM-P");
        $sym21$TACTIC_P = makeSymbol("TACTIC-P");
        $sym22$PROBLEM_LINK_P = makeSymbol("PROBLEM-LINK-P");
        $list23 = list(NIL, makeKeyword("SET-ASIDE"), makeKeyword("THROW-AWAY"), makeKeyword("IRRELEVANT"));
        $THROW_AWAY_PROBLEM = makeKeyword("THROW-AWAY-PROBLEM");
        $THROW_AWAY_TACTIC = makeKeyword("THROW-AWAY-TACTIC");
        $SET_ASIDE_PROBLEM = makeKeyword("SET-ASIDE-PROBLEM");
        $SET_ASIDE_TACTIC = makeKeyword("SET-ASIDE-TACTIC");
        $str28$problem_is_tactically_uninteresti = makeString("problem is tactically uninteresting");
        $str29$strategy_has_enough_proofs_for_pr = makeString("strategy has enough proofs for problem");
        $str30$inference_is_not_continuable__and = makeString("inference is not continuable, and ");
        $str31$tactic_is_discarded = makeString("tactic is discarded");
        $str32$non_good_problem_has_already_exec = makeString("non-good problem has already executed a complete removal tactic");
        $str33$rewrite_tactic_is_redundant = makeString("rewrite tactic is redundant");
        $str34$HL_module_is_forbidden = makeString("HL module is forbidden");
        $str35$the_rule_for_this_tactic_has_an_i = makeString("the rule for this tactic has an insuffiently high historical utility");
        $GENERALIZED_REMOVAL = makeKeyword("GENERALIZED-REMOVAL");
        $str37$problem_is_strategically_no_good = makeString("problem is strategically no-good");
        $str38$tactic_exceeds_productivity_limit = makeString("tactic exceeds productivity limit");
        $sym39$STRATEGIC_CONTEXT_P = makeSymbol("STRATEGIC-CONTEXT-P");
        $TRANSFORMATION = makeKeyword("TRANSFORMATION");
        $str41$problem_exceeds_max_proof_depth = makeString("problem exceeds max proof depth");
        $str42$proof_checker_mode_is_enabled_and = makeString("proof checker mode is enabled and no allowed rules were used to link to this problem");
        $sym43$INFERENCE_CHOOSES_TO_THROW_AWAY_ALL_TRANSFORMATIONS_ON_PROBLEM_ = makeSymbol("INFERENCE-CHOOSES-TO-THROW-AWAY-ALL-TRANSFORMATIONS-ON-PROBLEM?");
        $str44$problem_uses_an_HL_predicate__HL_ = makeString("problem uses an HL predicate, HL and unbound predicate transformation are forbidden, and #$collectionBackchainEncouraged does not apply");
        $str45$problem_uses_an_evaluatable_predi = makeString("problem uses an evaluatable predicate and evaluatable predicate transformation is forbidden");
        $REWRITE = makeKeyword("REWRITE");
        $str47$problem_exceeds_max_transformatio = makeString("problem exceeds max transformation depth");
        $sym48$SIMPLE_STRATEGY_CHOOSES_TO_THROW_AWAY_TRANSFORMATION_TACTIC_ = makeSymbol("SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC?");
        $str49$proof_checker_mode_is_enabled__an = makeString("proof checker mode is enabled, and the rule for this tactic is forbidden");
        $str50$tactic_requires_HL_predicate_tran = makeString("tactic requires HL predicate transformation, which is forbidden");
        $str51$tactic_requires_unbound_predicate = makeString("tactic requires unbound predicate transformation, which is forbidden");
        $str52$tactic_requires_evaluatable_predi = makeString("tactic requires evaluatable predicate transformation, which is forbidden");
        $list53 = list(makeConstSym(("isa")), makeConstSym(("genls")));
        $$isa = makeConstSym(("isa"));
        $$genls = makeConstSym(("genls"));
        $COMPLETE = makeKeyword("COMPLETE");
        $INCOMPLETE = makeKeyword("INCOMPLETE");
        $IMPOSSIBLE = makeKeyword("IMPOSSIBLE");
        $PREFERRED = makeKeyword("PREFERRED");
        $DISPREFERRED = makeKeyword("DISPREFERRED");
        $DISALLOWED = makeKeyword("DISALLOWED");
        $DOOMED = makeKeyword("DOOMED");
        $CONTENT = makeKeyword("CONTENT");
        $EXECUTED = makeKeyword("EXECUTED");
        $JOIN_ORDERED = makeKeyword("JOIN-ORDERED");
        $JOIN = makeKeyword("JOIN");
        $LOGICAL = makeKeyword("LOGICAL");
        $ANYTHING = makeKeyword("ANYTHING");
        $NOTHING = makeKeyword("NOTHING");
        $str70$Time_to_support_proof_spec_admitt = makeString("Time to support proof-spec admittance on ~S tactics");
        $list71 = list(makeSymbol("OPERATOR"), makeSymbol("&REST"), makeSymbol("SUB-SPECS"));
        $list72 = list(makeSymbol("REMOVAL-TOKEN"), makeSymbol("LITERAL-SPEC"), makeSymbol("REMOVAL-MODULE-SPEC"));
        $list73 = list(makeSymbol("RESTRICTION-TOKEN"), makeSymbol("SUB-SPEC"));
        $list74 = list(makeSymbol("TRANSFORMATION-TOKEN"), makeSymbol("LITERAL-SPEC"), makeSymbol("TRANSFORMATION-MODULE-SPEC"), makeSymbol("RULE-SPEC"), makeSymbol("&OPTIONAL"), makeSymbol("SUB-SPEC"));
        $list75 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));
        $list76 = list(makeSymbol("MT"), makeSymbol("SENTENCE"));
        $$ist = makeConstSym(("ist"));
        $$not = makeConstSym(("not"));
        $POS = makeKeyword("POS");
        $NEG = makeKeyword("NEG");
    }
}
/*
 *
 * Total time: 401 ms synthetic
 */