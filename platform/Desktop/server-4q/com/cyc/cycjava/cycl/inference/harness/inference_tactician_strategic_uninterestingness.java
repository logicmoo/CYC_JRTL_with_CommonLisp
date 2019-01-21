package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.pattern_match;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.inference.modules.transformation_modules;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_tactician_strategic_uninterestingness extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness";
    public static final String myFingerPrint = "33aa3f7c02c62ff8c92773c38c9ce8e12fe62c464a67221918c222c35f78faf7";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 1156L)
    private static SubLSymbol $strategy_uninterestingness_explanation$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 1410L)
    private static SubLSymbol $the_unknown_strategy_uninterestingness_explanation$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 2245L)
    public static SubLSymbol $strategy_gathering_uninterestingness_explanationsP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 3868L)
    private static SubLSymbol $strategy_uninterestingness_explanation_table$;
    private static final SubLSymbol $kw0$UNINITIALIZED;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$CLET;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLSymbol $sym5$STRATEGY_NOTE_UNINTERESTINGNESS_EXPLANATION;
    private static final SubLSymbol $sym6$STRATEGY_POSSIBLY_NOTE_UNINTERESTINGNESS_EXPLANATION;
    private static final SubLSymbol $sym7$STRATEGY_UNINTERESTINGNESS_EXPLANATION_P;
    private static final SubLList $list8;
    private static final SubLList $list9;
    private static final SubLSymbol $kw10$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw11$PROBLEM;
    private static final SubLSymbol $kw12$TACTIC;
    private static final SubLSymbol $kw13$LINK;
    private static final SubLSymbol $kw14$SUBEXPLANATION;
    private static final SubLSymbol $sym15$PWHEN;
    private static final SubLSymbol $sym16$_STRATEGY_GATHERING_UNINTERESTINGNESS_EXPLANATIONS__;
    private static final SubLList $list17;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$STRATEGY_UNINTERESTINGNESS_EXPLANATION_TYPE_P;
    private static final SubLSymbol $sym20$PROBLEM_P;
    private static final SubLSymbol $sym21$TACTIC_P;
    private static final SubLSymbol $sym22$PROBLEM_LINK_P;
    private static final SubLList $list23;
    private static final SubLSymbol $kw24$THROW_AWAY_PROBLEM;
    private static final SubLSymbol $kw25$THROW_AWAY_TACTIC;
    private static final SubLSymbol $kw26$SET_ASIDE_PROBLEM;
    private static final SubLSymbol $kw27$SET_ASIDE_TACTIC;
    private static final SubLString $str28$problem_is_tactically_uninteresti;
    private static final SubLString $str29$strategy_has_enough_proofs_for_pr;
    private static final SubLString $str30$inference_is_not_continuable__and;
    private static final SubLString $str31$tactic_is_discarded;
    private static final SubLString $str32$non_good_problem_has_already_exec;
    private static final SubLString $str33$rewrite_tactic_is_redundant;
    private static final SubLString $str34$HL_module_is_forbidden;
    private static final SubLString $str35$the_rule_for_this_tactic_has_an_i;
    private static final SubLSymbol $kw36$GENERALIZED_REMOVAL;
    private static final SubLString $str37$problem_is_strategically_no_good;
    private static final SubLString $str38$tactic_exceeds_productivity_limit;
    private static final SubLSymbol $sym39$STRATEGIC_CONTEXT_P;
    private static final SubLSymbol $kw40$TRANSFORMATION;
    private static final SubLString $str41$problem_exceeds_max_proof_depth;
    private static final SubLString $str42$proof_checker_mode_is_enabled_and;
    private static final SubLSymbol $sym43$INFERENCE_CHOOSES_TO_THROW_AWAY_ALL_TRANSFORMATIONS_ON_PROBLEM_;
    private static final SubLString $str44$problem_uses_an_HL_predicate__HL_;
    private static final SubLString $str45$problem_uses_an_evaluatable_predi;
    private static final SubLSymbol $kw46$REWRITE;
    private static final SubLString $str47$problem_exceeds_max_transformatio;
    private static final SubLSymbol $sym48$SIMPLE_STRATEGY_CHOOSES_TO_THROW_AWAY_TRANSFORMATION_TACTIC_;
    private static final SubLString $str49$proof_checker_mode_is_enabled__an;
    private static final SubLString $str50$tactic_requires_HL_predicate_tran;
    private static final SubLString $str51$tactic_requires_unbound_predicate;
    private static final SubLString $str52$tactic_requires_evaluatable_predi;
    private static final SubLList $list53;
    private static final SubLObject $const54$isa;
    private static final SubLObject $const55$genls;
    private static final SubLSymbol $kw56$COMPLETE;
    private static final SubLSymbol $kw57$INCOMPLETE;
    private static final SubLSymbol $kw58$IMPOSSIBLE;
    private static final SubLSymbol $kw59$PREFERRED;
    private static final SubLSymbol $kw60$DISPREFERRED;
    private static final SubLSymbol $kw61$DISALLOWED;
    private static final SubLSymbol $kw62$DOOMED;
    private static final SubLSymbol $kw63$CONTENT;
    private static final SubLSymbol $kw64$EXECUTED;
    private static final SubLSymbol $kw65$JOIN_ORDERED;
    private static final SubLSymbol $kw66$JOIN;
    private static final SubLSymbol $kw67$LOGICAL;
    private static final SubLSymbol $kw68$ANYTHING;
    private static final SubLSymbol $kw69$NOTHING;
    private static final SubLString $str70$Time_to_support_proof_spec_admitt;
    private static final SubLList $list71;
    private static final SubLList $list72;
    private static final SubLList $list73;
    private static final SubLList $list74;
    private static final SubLList $list75;
    private static final SubLList $list76;
    private static final SubLObject $const77$ist;
    private static final SubLObject $const78$not;
    private static final SubLSymbol $kw79$POS;
    private static final SubLSymbol $kw80$NEG;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 1520L)
    public static SubLObject the_unknown_strategy_uninterestingness_explanation_p(final SubLObject v_object) {
        return Equality.eq(v_object, inference_tactician_strategic_uninterestingness.$the_unknown_strategy_uninterestingness_explanation$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 1675L)
    public static SubLObject strategy_last_uninterestingness_explanation() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (inference_tactician_strategic_uninterestingness.NIL != inference_tactician_strategic_uninterestingness.$strategy_uninterestingness_explanation$.getDynamicValue(thread)) ? inference_tactician_strategic_uninterestingness.$strategy_uninterestingness_explanation$.getDynamicValue(thread) : inference_tactician_strategic_uninterestingness.$the_unknown_strategy_uninterestingness_explanation$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 1855L)
    public static SubLObject with_strategy_uninterestingness_explanations(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)inference_tactician_strategic_uninterestingness.$sym2$CLET, (SubLObject)inference_tactician_strategic_uninterestingness.$list3, ConsesLow.append(body, (SubLObject)inference_tactician_strategic_uninterestingness.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 2075L)
    public static SubLObject without_strategy_uninterestingness_explanations(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)inference_tactician_strategic_uninterestingness.$sym2$CLET, (SubLObject)inference_tactician_strategic_uninterestingness.$list4, ConsesLow.append(body, (SubLObject)inference_tactician_strategic_uninterestingness.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 2462L)
    public static SubLObject strategy_note_uninterestingness_explanation(final SubLObject explanation_type, final SubLObject problem, final SubLObject tactic, final SubLObject link, final SubLObject subexplanation) {
        final SubLObject explanation = make_strategy_uninterestingness_explanation(explanation_type, problem, tactic, link, subexplanation);
        assert inference_tactician_strategic_uninterestingness.NIL != strategy_uninterestingness_explanation_p(explanation) : explanation;
        inference_tactician_strategic_uninterestingness.$strategy_uninterestingness_explanation$.setDynamicValue(explanation);
        return explanation;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 2927L)
    public static SubLObject strategy_possibly_note_exact_uninterestingness_explanation(final SubLObject explanation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_tactician_strategic_uninterestingness.NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
            inference_tactician_strategic_uninterestingness.$strategy_uninterestingness_explanation$.setDynamicValue(explanation, thread);
        }
        return explanation;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 3212L)
    public static SubLObject strategy_possibly_note_uninterestingness_explanation(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject explanation_type = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_tactician_strategic_uninterestingness.$list8);
        explanation_type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_tactician_strategic_uninterestingness.$list8);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        SubLObject current_$1 = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        while (inference_tactician_strategic_uninterestingness.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_tactician_strategic_uninterestingness.$list8);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_tactician_strategic_uninterestingness.$list8);
            if (inference_tactician_strategic_uninterestingness.NIL == conses_high.member(current_$1, (SubLObject)inference_tactician_strategic_uninterestingness.$list9, (SubLObject)inference_tactician_strategic_uninterestingness.UNPROVIDED, (SubLObject)inference_tactician_strategic_uninterestingness.UNPROVIDED)) {
                bad = (SubLObject)inference_tactician_strategic_uninterestingness.T;
            }
            if (current_$1 == inference_tactician_strategic_uninterestingness.$kw10$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_tactician_strategic_uninterestingness.NIL != bad && inference_tactician_strategic_uninterestingness.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_tactician_strategic_uninterestingness.$list8);
        }
        final SubLObject problem_tail = cdestructuring_bind.property_list_member((SubLObject)inference_tactician_strategic_uninterestingness.$kw11$PROBLEM, current);
        final SubLObject problem = (SubLObject)((inference_tactician_strategic_uninterestingness.NIL != problem_tail) ? conses_high.cadr(problem_tail) : inference_tactician_strategic_uninterestingness.NIL);
        final SubLObject tactic_tail = cdestructuring_bind.property_list_member((SubLObject)inference_tactician_strategic_uninterestingness.$kw12$TACTIC, current);
        final SubLObject tactic = (SubLObject)((inference_tactician_strategic_uninterestingness.NIL != tactic_tail) ? conses_high.cadr(tactic_tail) : inference_tactician_strategic_uninterestingness.NIL);
        final SubLObject link_tail = cdestructuring_bind.property_list_member((SubLObject)inference_tactician_strategic_uninterestingness.$kw13$LINK, current);
        final SubLObject link = (SubLObject)((inference_tactician_strategic_uninterestingness.NIL != link_tail) ? conses_high.cadr(link_tail) : inference_tactician_strategic_uninterestingness.NIL);
        final SubLObject subexplanation_tail = cdestructuring_bind.property_list_member((SubLObject)inference_tactician_strategic_uninterestingness.$kw14$SUBEXPLANATION, current);
        final SubLObject subexplanation = (SubLObject)((inference_tactician_strategic_uninterestingness.NIL != subexplanation_tail) ? conses_high.cadr(subexplanation_tail) : inference_tactician_strategic_uninterestingness.NIL);
        current = temp;
        if (inference_tactician_strategic_uninterestingness.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)inference_tactician_strategic_uninterestingness.$sym15$PWHEN, (SubLObject)inference_tactician_strategic_uninterestingness.$sym16$_STRATEGY_GATHERING_UNINTERESTINGNESS_EXPLANATIONS__, (SubLObject)ConsesLow.list((SubLObject)inference_tactician_strategic_uninterestingness.$sym5$STRATEGY_NOTE_UNINTERESTINGNESS_EXPLANATION, explanation_type, problem, tactic, link, subexplanation));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_tactician_strategic_uninterestingness.$list8);
        return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 3608L)
    public static SubLObject strategy_possibly_un_note_uninterestingness_explanation() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_tactician_strategic_uninterestingness.NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
            inference_tactician_strategic_uninterestingness.$strategy_uninterestingness_explanation$.setDynamicValue(inference_tactician_strategic_uninterestingness.$the_unknown_strategy_uninterestingness_explanation$.getGlobalValue(), thread);
        }
        return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 9477L)
    public static SubLObject strategy_uninterestingness_explanation_string(final SubLObject explanation_type) {
        return conses_high.second(conses_high.assoc(explanation_type, inference_tactician_strategic_uninterestingness.$strategy_uninterestingness_explanation_table$.getGlobalValue(), (SubLObject)inference_tactician_strategic_uninterestingness.UNPROVIDED, (SubLObject)inference_tactician_strategic_uninterestingness.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 9742L)
    public static SubLObject strategy_uninterestingness_explanation_type_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isString() || (v_object.isKeyword() && inference_tactician_strategic_uninterestingness.NIL != conses_high.assoc(v_object, inference_tactician_strategic_uninterestingness.$strategy_uninterestingness_explanation_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_tactician_strategic_uninterestingness.EQ), (SubLObject)inference_tactician_strategic_uninterestingness.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 10126L)
    public static SubLObject strategy_uninterestingness_explanation_p(final SubLObject v_object) {
        if (v_object.isCons() && inference_tactician_strategic_uninterestingness.NIL != list_utilities.lengthE(v_object, (SubLObject)inference_tactician_strategic_uninterestingness.FIVE_INTEGER, (SubLObject)inference_tactician_strategic_uninterestingness.UNPROVIDED)) {
            SubLObject type = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
            SubLObject problem = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
            SubLObject tactic = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
            SubLObject link = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
            SubLObject subexplanation = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(v_object, v_object, (SubLObject)inference_tactician_strategic_uninterestingness.$list18);
            type = v_object.first();
            SubLObject current = v_object.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, v_object, (SubLObject)inference_tactician_strategic_uninterestingness.$list18);
            problem = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, v_object, (SubLObject)inference_tactician_strategic_uninterestingness.$list18);
            tactic = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, v_object, (SubLObject)inference_tactician_strategic_uninterestingness.$list18);
            link = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, v_object, (SubLObject)inference_tactician_strategic_uninterestingness.$list18);
            subexplanation = current.first();
            current = current.rest();
            if (inference_tactician_strategic_uninterestingness.NIL == current) {
                return (SubLObject)SubLObjectFactory.makeBoolean(inference_tactician_strategic_uninterestingness.NIL != strategy_uninterestingness_explanation_type_p(type) && (inference_tactician_strategic_uninterestingness.NIL == problem || inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_problem.problem_p(problem)) && (inference_tactician_strategic_uninterestingness.NIL == tactic || inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_tactic.tactic_p(tactic)) && (inference_tactician_strategic_uninterestingness.NIL == link || inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_problem_link.problem_link_p(link)) && (inference_tactician_strategic_uninterestingness.NIL == subexplanation || inference_tactician_strategic_uninterestingness.NIL != strategy_uninterestingness_explanation_p(subexplanation)));
            }
            cdestructuring_bind.cdestructuring_bind_error(v_object, (SubLObject)inference_tactician_strategic_uninterestingness.$list18);
        }
        return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 10844L)
    public static SubLObject strategy_uninterestingness_subexplanation_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_tactician_strategic_uninterestingness.NIL == v_object || inference_tactician_strategic_uninterestingness.NIL != strategy_uninterestingness_explanation_p(v_object) || inference_tactician_strategic_uninterestingness.NIL != list_utilities.list_of_type_p((SubLObject)inference_tactician_strategic_uninterestingness.$sym7$STRATEGY_UNINTERESTINGNESS_EXPLANATION_P, v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 11145L)
    public static SubLObject make_strategy_uninterestingness_explanation(final SubLObject explanation_type, SubLObject problem, SubLObject tactic, SubLObject link, SubLObject subexplanation) {
        if (problem == inference_tactician_strategic_uninterestingness.UNPROVIDED) {
            problem = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        }
        if (tactic == inference_tactician_strategic_uninterestingness.UNPROVIDED) {
            tactic = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        }
        if (link == inference_tactician_strategic_uninterestingness.UNPROVIDED) {
            link = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        }
        if (subexplanation == inference_tactician_strategic_uninterestingness.UNPROVIDED) {
            subexplanation = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        }
        assert inference_tactician_strategic_uninterestingness.NIL != strategy_uninterestingness_explanation_type_p(explanation_type) : explanation_type;
        if (inference_tactician_strategic_uninterestingness.NIL != problem && !inference_tactician_strategic_uninterestingness.assertionsDisabledInClass && inference_tactician_strategic_uninterestingness.NIL == inference_datastructures_problem.problem_p(problem)) {
            throw new AssertionError(problem);
        }
        if (inference_tactician_strategic_uninterestingness.NIL != tactic && !inference_tactician_strategic_uninterestingness.assertionsDisabledInClass && inference_tactician_strategic_uninterestingness.NIL == inference_datastructures_tactic.tactic_p(tactic)) {
            throw new AssertionError(tactic);
        }
        if (inference_tactician_strategic_uninterestingness.NIL != link && !inference_tactician_strategic_uninterestingness.assertionsDisabledInClass && inference_tactician_strategic_uninterestingness.NIL == inference_datastructures_problem_link.problem_link_p(link)) {
            throw new AssertionError(link);
        }
        if (inference_tactician_strategic_uninterestingness.NIL != subexplanation && !inference_tactician_strategic_uninterestingness.assertionsDisabledInClass && inference_tactician_strategic_uninterestingness.NIL == strategy_uninterestingness_explanation_p(subexplanation)) {
            throw new AssertionError(subexplanation);
        }
        return (SubLObject)ConsesLow.list(explanation_type, problem, tactic, link, subexplanation);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 11664L)
    public static SubLObject strategy_uninterestingness_explanation_type(final SubLObject explanation) {
        assert inference_tactician_strategic_uninterestingness.NIL != strategy_uninterestingness_explanation_p(explanation) : explanation;
        return explanation.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 11838L)
    public static SubLObject strategic_uninterestingness_reason_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, (SubLObject)inference_tactician_strategic_uninterestingness.$list23, Symbols.symbol_function((SubLObject)inference_tactician_strategic_uninterestingness.EQ), (SubLObject)inference_tactician_strategic_uninterestingness.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 12146L)
    public static SubLObject strategy_chooses_to_throw_away_problemP(final SubLObject strategy, final SubLObject problem, SubLObject motivation) {
        if (motivation == inference_tactician_strategic_uninterestingness.UNPROVIDED) {
            motivation = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        }
        return inference_datastructures_strategy.strategy_dispatch(strategy, (SubLObject)inference_tactician_strategic_uninterestingness.$kw24$THROW_AWAY_PROBLEM, problem, (SubLObject)inference_tactician_strategic_uninterestingness.UNPROVIDED, (SubLObject)inference_tactician_strategic_uninterestingness.UNPROVIDED, (SubLObject)inference_tactician_strategic_uninterestingness.UNPROVIDED, (SubLObject)inference_tactician_strategic_uninterestingness.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 12377L)
    public static SubLObject why_strategy_chooses_to_throw_away_problem(final SubLObject strategy, final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject reason = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        final SubLObject _prev_bind_0 = inference_tactician_strategic_uninterestingness.$strategy_uninterestingness_explanation$.currentBinding(thread);
        final SubLObject _prev_bind_2 = inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.currentBinding(thread);
        try {
            inference_tactician_strategic_uninterestingness.$strategy_uninterestingness_explanation$.bind((SubLObject)inference_tactician_strategic_uninterestingness.NIL, thread);
            inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.bind((SubLObject)inference_tactician_strategic_uninterestingness.T, thread);
            strategy_chooses_to_throw_away_problemP(strategy, problem, (SubLObject)inference_tactician_strategic_uninterestingness.UNPROVIDED);
            reason = strategy_last_uninterestingness_explanation();
        }
        finally {
            inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.rebind(_prev_bind_2, thread);
            inference_tactician_strategic_uninterestingness.$strategy_uninterestingness_explanation$.rebind(_prev_bind_0, thread);
        }
        return reason;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 12700L)
    public static SubLObject strategy_chooses_to_throw_away_tacticP(final SubLObject strategy, final SubLObject tactic, final SubLObject problem_already_consideredP, final SubLObject siblings_already_consideredP) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, (SubLObject)inference_tactician_strategic_uninterestingness.$kw25$THROW_AWAY_TACTIC, tactic, problem_already_consideredP, siblings_already_consideredP, (SubLObject)inference_tactician_strategic_uninterestingness.UNPROVIDED, (SubLObject)inference_tactician_strategic_uninterestingness.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 12954L)
    public static SubLObject legacy_strategy_chooses_to_throw_away_tacticP(final SubLObject strategy, final SubLObject tactic, SubLObject motivation) {
        if (motivation == inference_tactician_strategic_uninterestingness.UNPROVIDED) {
            motivation = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        }
        return simple_strategy_chooses_to_throw_away_tacticP(strategy, tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 13131L)
    public static SubLObject legacy_strategy_chooses_to_ignore_tacticP(final SubLObject strategy, final SubLObject tactic, SubLObject motivation) {
        if (motivation == inference_tactician_strategic_uninterestingness.UNPROVIDED) {
            motivation = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        }
        return simple_strategy_chooses_to_ignore_tacticP(strategy, tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 13300L)
    public static SubLObject why_strategy_chooses_to_throw_away_tactic(final SubLObject strategy, final SubLObject tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject reason = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        final SubLObject _prev_bind_0 = inference_tactician_strategic_uninterestingness.$strategy_uninterestingness_explanation$.currentBinding(thread);
        final SubLObject _prev_bind_2 = inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.currentBinding(thread);
        try {
            inference_tactician_strategic_uninterestingness.$strategy_uninterestingness_explanation$.bind((SubLObject)inference_tactician_strategic_uninterestingness.NIL, thread);
            inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.bind((SubLObject)inference_tactician_strategic_uninterestingness.T, thread);
            strategy_chooses_to_throw_away_tacticP(strategy, tactic, (SubLObject)inference_tactician_strategic_uninterestingness.NIL, (SubLObject)inference_tactician_strategic_uninterestingness.NIL);
            reason = strategy_last_uninterestingness_explanation();
        }
        finally {
            inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.rebind(_prev_bind_2, thread);
            inference_tactician_strategic_uninterestingness.$strategy_uninterestingness_explanation$.rebind(_prev_bind_0, thread);
        }
        return reason;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 13604L)
    public static SubLObject strategy_chooses_to_set_aside_problemP(final SubLObject strategy, final SubLObject problem) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, (SubLObject)inference_tactician_strategic_uninterestingness.$kw26$SET_ASIDE_PROBLEM, problem, (SubLObject)inference_tactician_strategic_uninterestingness.UNPROVIDED, (SubLObject)inference_tactician_strategic_uninterestingness.UNPROVIDED, (SubLObject)inference_tactician_strategic_uninterestingness.UNPROVIDED, (SubLObject)inference_tactician_strategic_uninterestingness.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 13809L)
    public static SubLObject why_strategy_chooses_to_set_aside_problem(final SubLObject strategy, final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject reason = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        final SubLObject _prev_bind_0 = inference_tactician_strategic_uninterestingness.$strategy_uninterestingness_explanation$.currentBinding(thread);
        final SubLObject _prev_bind_2 = inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.currentBinding(thread);
        try {
            inference_tactician_strategic_uninterestingness.$strategy_uninterestingness_explanation$.bind((SubLObject)inference_tactician_strategic_uninterestingness.NIL, thread);
            inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.bind((SubLObject)inference_tactician_strategic_uninterestingness.T, thread);
            strategy_chooses_to_set_aside_problemP(strategy, problem);
            reason = strategy_last_uninterestingness_explanation();
        }
        finally {
            inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.rebind(_prev_bind_2, thread);
            inference_tactician_strategic_uninterestingness.$strategy_uninterestingness_explanation$.rebind(_prev_bind_0, thread);
        }
        return reason;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 14130L)
    public static SubLObject strategy_chooses_to_set_aside_tacticP(final SubLObject strategy, final SubLObject tactic, final SubLObject problem_already_consideredP, final SubLObject siblings_already_consideredP) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, (SubLObject)inference_tactician_strategic_uninterestingness.$kw27$SET_ASIDE_TACTIC, tactic, problem_already_consideredP, siblings_already_consideredP, (SubLObject)inference_tactician_strategic_uninterestingness.UNPROVIDED, (SubLObject)inference_tactician_strategic_uninterestingness.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 14382L)
    public static SubLObject legacy_strategy_chooses_to_set_aside_tacticP(final SubLObject strategy, final SubLObject tactic, SubLObject motivation) {
        if (motivation == inference_tactician_strategic_uninterestingness.UNPROVIDED) {
            motivation = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        }
        return simple_strategy_chooses_to_set_aside_tacticP(strategy, tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 14580L)
    public static SubLObject why_strategy_chooses_to_set_aside_tactic(final SubLObject strategy, final SubLObject tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject reason = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        final SubLObject _prev_bind_0 = inference_tactician_strategic_uninterestingness.$strategy_uninterestingness_explanation$.currentBinding(thread);
        final SubLObject _prev_bind_2 = inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.currentBinding(thread);
        try {
            inference_tactician_strategic_uninterestingness.$strategy_uninterestingness_explanation$.bind((SubLObject)inference_tactician_strategic_uninterestingness.NIL, thread);
            inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.bind((SubLObject)inference_tactician_strategic_uninterestingness.T, thread);
            strategy_chooses_to_set_aside_tacticP(strategy, tactic, (SubLObject)inference_tactician_strategic_uninterestingness.NIL, (SubLObject)inference_tactician_strategic_uninterestingness.NIL);
            reason = strategy_last_uninterestingness_explanation();
        }
        finally {
            inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.rebind(_prev_bind_2, thread);
            inference_tactician_strategic_uninterestingness.$strategy_uninterestingness_explanation$.rebind(_prev_bind_0, thread);
        }
        return reason;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 14882L)
    public static SubLObject strategy_chooses_to_ignore_tacticP(final SubLObject strategy, final SubLObject tactic, SubLObject motivation) {
        if (motivation == inference_tactician_strategic_uninterestingness.UNPROVIDED) {
            motivation = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        }
        return simple_strategy_chooses_to_ignore_tacticP(strategy, tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 15075L)
    public static SubLObject simple_strategy_chooses_to_throw_away_problemP(final SubLObject strategy, final SubLObject problem) {
        return simple_strategy_chooses_to_throw_away_problem_int(strategy, problem, (SubLObject)inference_tactician_strategic_uninterestingness.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 15485L)
    public static SubLObject why_simple_strategy_chooses_to_throw_away_problem(final SubLObject strategy, final SubLObject problem) {
        return simple_strategy_chooses_to_throw_away_problem_int(strategy, problem, (SubLObject)inference_tactician_strategic_uninterestingness.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 15653L)
    public static SubLObject simple_strategy_chooses_to_throw_away_problem_int(final SubLObject strategy, final SubLObject problem, final SubLObject justifyP) {
        if (inference_tactician_strategic_uninterestingness.NIL != tactically_uninteresting_problem_p(problem)) {
            if (inference_tactician_strategic_uninterestingness.NIL != justifyP) {
                return (SubLObject)inference_tactician_strategic_uninterestingness.$str28$problem_is_tactically_uninteresti;
            }
            return (SubLObject)inference_tactician_strategic_uninterestingness.T;
        }
        else if (inference_tactician_strategic_uninterestingness.NIL != strategy_has_enough_proofs_for_problemP(strategy, problem)) {
            if (inference_tactician_strategic_uninterestingness.NIL != justifyP) {
                return (SubLObject)inference_tactician_strategic_uninterestingness.$str29$strategy_has_enough_proofs_for_pr;
            }
            return (SubLObject)inference_tactician_strategic_uninterestingness.T;
        }
        else {
            final SubLObject inference_chooses_to_throw_away_problem_reason = why_inference_chooses_to_throw_away_problem(inference_datastructures_strategy.strategy_inference(strategy), problem);
            if (inference_tactician_strategic_uninterestingness.NIL == inference_chooses_to_throw_away_problem_reason) {
                if (inference_tactician_strategic_uninterestingness.NIL == inference_datastructures_inference.inference_continuableP(inference_datastructures_strategy.strategy_inference(strategy)) && inference_tactician_strategic_uninterestingness.NIL != inference_tactician.strategy_set_aside_non_continuable_implies_throw_awayP(strategy)) {
                    final SubLObject set_aside_reason = why_simple_strategy_chooses_to_set_aside_problem(strategy, problem);
                    if (inference_tactician_strategic_uninterestingness.NIL != set_aside_reason) {
                        if (inference_tactician_strategic_uninterestingness.NIL != justifyP) {
                            return Sequences.cconcatenate((SubLObject)inference_tactician_strategic_uninterestingness.$str30$inference_is_not_continuable__and, set_aside_reason);
                        }
                        return (SubLObject)inference_tactician_strategic_uninterestingness.T;
                    }
                }
                return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
            }
            if (inference_tactician_strategic_uninterestingness.NIL != justifyP) {
                return inference_chooses_to_throw_away_problem_reason;
            }
            return (SubLObject)inference_tactician_strategic_uninterestingness.T;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 16892L)
    public static SubLObject simple_strategy_chooses_to_throw_away_tacticP(final SubLObject strategy, final SubLObject tactic) {
        return simple_strategy_chooses_to_throw_away_tactic_int(strategy, tactic, (SubLObject)inference_tactician_strategic_uninterestingness.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 17078L)
    public static SubLObject why_simple_strategy_chooses_to_throw_away_tactic(final SubLObject strategy, final SubLObject tactic) {
        return simple_strategy_chooses_to_throw_away_tactic_int(strategy, tactic, (SubLObject)inference_tactician_strategic_uninterestingness.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 17242L)
    public static SubLObject simple_strategy_chooses_to_throw_away_tactic_int(final SubLObject strategy, final SubLObject tactic, final SubLObject justifyP) {
        if (inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_tactic.tactic_discardedP(tactic) && inference_tactician_strategic_uninterestingness.NIL == transformation_tactician_datastructures.transformation_strategy_p(strategy)) {
            if (inference_tactician_strategic_uninterestingness.NIL != justifyP) {
                return (SubLObject)inference_tactician_strategic_uninterestingness.$str31$tactic_is_discarded;
            }
            return (SubLObject)inference_tactician_strategic_uninterestingness.T;
        }
        else if (inference_tactician_strategic_uninterestingness.NIL == inference_worker.good_problem_p(inference_datastructures_tactic.tactic_problem(tactic), strategy) && inference_tactician_strategic_uninterestingness.NIL != problem_has_executed_a_complete_removal_tacticP(inference_datastructures_tactic.tactic_problem(tactic), strategy)) {
            if (inference_tactician_strategic_uninterestingness.NIL != justifyP) {
                return (SubLObject)inference_tactician_strategic_uninterestingness.$str32$non_good_problem_has_already_exec;
            }
            return (SubLObject)inference_tactician_strategic_uninterestingness.T;
        }
        else if (inference_tactician_strategic_uninterestingness.NIL != simple_strategy_deems_rewrite_tactic_redundantP(strategy, tactic)) {
            if (inference_tactician_strategic_uninterestingness.NIL != justifyP) {
                return (SubLObject)inference_tactician_strategic_uninterestingness.$str33$rewrite_tactic_is_redundant;
            }
            return (SubLObject)inference_tactician_strategic_uninterestingness.T;
        }
        else if (inference_tactician_strategic_uninterestingness.NIL != inference_worker_transformation.transformation_tactic_p(tactic) && inference_tactician_strategic_uninterestingness.NIL != simple_strategy_chooses_to_throw_away_transformation_tacticP(strategy, tactic)) {
            if (inference_tactician_strategic_uninterestingness.NIL != justifyP) {
                return why_simple_strategy_chooses_to_throw_away_transformation_tactic(strategy, tactic);
            }
            return (SubLObject)inference_tactician_strategic_uninterestingness.T;
        }
        else {
            if (inference_tactician_strategic_uninterestingness.NIL != strategy_allows_use_of_tactic_hl_moduleP(strategy, tactic)) {
                if (inference_tactician_strategic_uninterestingness.NIL == inference_datastructures_inference.inference_continuableP(inference_datastructures_strategy.strategy_inference(strategy))) {
                    if (inference_tactician_strategic_uninterestingness.NIL != inference_tactician.strategy_set_aside_non_continuable_implies_throw_awayP(strategy)) {
                        final SubLObject strategy_chooses_to_set_aside_tactic_reason = why_simple_strategy_chooses_to_set_aside_tactic(strategy, tactic);
                        if (inference_tactician_strategic_uninterestingness.NIL != strategy_chooses_to_set_aside_tactic_reason) {
                            if (inference_tactician_strategic_uninterestingness.NIL != justifyP) {
                                return Sequences.cconcatenate((SubLObject)inference_tactician_strategic_uninterestingness.$str30$inference_is_not_continuable__and, strategy_chooses_to_set_aside_tactic_reason);
                            }
                            return (SubLObject)inference_tactician_strategic_uninterestingness.T;
                        }
                    }
                    else if (inference_tactician_strategic_uninterestingness.NIL != inference_worker_transformation.transformation_tactic_p(tactic)) {
                        final SubLObject rule = inference_worker_transformation.transformation_tactic_rule(tactic);
                        if (inference_tactician_strategic_uninterestingness.NIL != rule && inference_tactician_strategic_uninterestingness.NIL != inference_analysis.transformation_rule_has_insufficient_historical_utilityP(rule, inference_datastructures_strategy.strategy_inference(strategy))) {
                            if (inference_tactician_strategic_uninterestingness.NIL != justifyP) {
                                return (SubLObject)inference_tactician_strategic_uninterestingness.$str35$the_rule_for_this_tactic_has_an_i;
                            }
                            return (SubLObject)inference_tactician_strategic_uninterestingness.T;
                        }
                    }
                }
                return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
            }
            if (inference_tactician_strategic_uninterestingness.NIL != justifyP) {
                return (SubLObject)inference_tactician_strategic_uninterestingness.$str34$HL_module_is_forbidden;
            }
            return (SubLObject)inference_tactician_strategic_uninterestingness.T;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 19747L)
    public static SubLObject problem_has_executed_a_complete_removal_tacticP(final SubLObject problem, final SubLObject strategic_context) {
        return problem_has_executed_a_complete_tacticP(problem, strategic_context, (SubLObject)inference_tactician_strategic_uninterestingness.$kw36$GENERALIZED_REMOVAL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 19940L)
    public static SubLObject lookahead_problem_has_executed_a_complete_removal_tacticP(final SubLObject problem, final SubLObject strategic_context) {
        return lookahead_problem_has_executed_a_complete_tacticP(problem, strategic_context, (SubLObject)inference_tactician_strategic_uninterestingness.$kw36$GENERALIZED_REMOVAL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 20153L)
    public static SubLObject problem_or_lookahead_problem_has_executed_a_complete_removal_tacticP(final SubLObject problem, final SubLObject strategic_context) {
        return problem_or_lookahead_problem_has_executed_a_complete_tacticP(problem, strategic_context, (SubLObject)inference_tactician_strategic_uninterestingness.$kw36$GENERALIZED_REMOVAL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 20388L)
    public static SubLObject problem_has_executed_a_generalized_removal_tacticP(final SubLObject problem) {
        return problem_has_executed_a_tactic_of_typeP(problem, (SubLObject)inference_tactician_strategic_uninterestingness.$kw36$GENERALIZED_REMOVAL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 20547L)
    public static SubLObject strategy_allows_use_of_tactic_hl_moduleP(final SubLObject strategy, final SubLObject tactic) {
        return strategy_allows_use_of_hl_moduleP(strategy, inference_datastructures_tactic.tactic_hl_module(tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 20705L)
    public static SubLObject strategy_allows_use_of_hl_moduleP(final SubLObject strategy, final SubLObject hl_module) {
        return inference_datastructures_inference.inference_allows_use_of_moduleP(inference_datastructures_strategy.strategy_inference(strategy), hl_module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 20862L)
    public static SubLObject simple_strategy_chooses_to_set_aside_problemP(final SubLObject strategy, final SubLObject problem) {
        return simple_strategy_chooses_to_set_aside_problem_int(strategy, problem, (SubLObject)inference_tactician_strategic_uninterestingness.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 21090L)
    public static SubLObject why_simple_strategy_chooses_to_set_aside_problem(final SubLObject strategy, final SubLObject problem) {
        return simple_strategy_chooses_to_set_aside_problem_int(strategy, problem, (SubLObject)inference_tactician_strategic_uninterestingness.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 21258L)
    public static SubLObject simple_strategy_chooses_to_set_aside_problem_int(final SubLObject strategy, final SubLObject problem, final SubLObject justifyP) {
        if (inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_strategy.strategically_totally_no_good_problem_p(problem, strategy)) {
            if (inference_tactician_strategic_uninterestingness.NIL != justifyP) {
                return (SubLObject)inference_tactician_strategic_uninterestingness.$str37$problem_is_strategically_no_good;
            }
            return (SubLObject)inference_tactician_strategic_uninterestingness.T;
        }
        else {
            final SubLObject inference_chooses_to_set_aside_problem_reason = why_inference_chooses_to_set_aside_problem(inference_datastructures_strategy.strategy_inference(strategy), problem);
            if (inference_tactician_strategic_uninterestingness.NIL == inference_chooses_to_set_aside_problem_reason) {
                return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
            }
            if (inference_tactician_strategic_uninterestingness.NIL != justifyP) {
                return inference_chooses_to_set_aside_problem_reason;
            }
            return (SubLObject)inference_tactician_strategic_uninterestingness.T;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 21955L)
    public static SubLObject simple_strategy_chooses_to_set_aside_tacticP(final SubLObject strategy, final SubLObject tactic) {
        return simple_strategy_chooses_to_set_aside_tactic_int(strategy, tactic, (SubLObject)inference_tactician_strategic_uninterestingness.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 22138L)
    public static SubLObject why_simple_strategy_chooses_to_set_aside_tactic(final SubLObject strategy, final SubLObject tactic) {
        return simple_strategy_chooses_to_set_aside_tactic_int(strategy, tactic, (SubLObject)inference_tactician_strategic_uninterestingness.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 22300L)
    public static SubLObject simple_strategy_chooses_to_set_aside_tactic_int(final SubLObject strategy, final SubLObject tactic, final SubLObject justifyP) {
        if ((inference_tactician_strategic_uninterestingness.NIL == inference_worker.content_tactic_p(tactic) && inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_strategy.strategy_problem_store(strategy))) || inference_tactician_strategic_uninterestingness.NIL == tactic_exceeds_productivity_limitP(tactic, strategy)) {
            if (inference_tactician_strategic_uninterestingness.NIL != inference_worker_transformation.transformation_tactic_p(tactic)) {
                final SubLObject strategy_chooses_to_set_aside_transformation_tactic_reason = why_simple_strategy_chooses_to_set_aside_transformation_tactic(strategy, tactic);
                if (inference_tactician_strategic_uninterestingness.NIL != strategy_chooses_to_set_aside_transformation_tactic_reason) {
                    if (inference_tactician_strategic_uninterestingness.NIL != justifyP) {
                        return strategy_chooses_to_set_aside_transformation_tactic_reason;
                    }
                    return (SubLObject)inference_tactician_strategic_uninterestingness.T;
                }
            }
            return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        }
        if (inference_tactician_strategic_uninterestingness.NIL != justifyP) {
            return (SubLObject)inference_tactician_strategic_uninterestingness.$str38$tactic_exceeds_productivity_limit;
        }
        return (SubLObject)inference_tactician_strategic_uninterestingness.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 23492L)
    public static SubLObject simple_strategy_chooses_to_ignore_problemP(final SubLObject strategy, final SubLObject problem) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_tactician_strategic_uninterestingness.NIL != simple_strategy_chooses_to_throw_away_problemP(strategy, problem) || ((inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_inference.inference_continuableP(inference_datastructures_strategy.strategy_inference(strategy)) || inference_tactician_strategic_uninterestingness.NIL == inference_tactician.strategy_set_aside_non_continuable_implies_throw_awayP(strategy)) && inference_tactician_strategic_uninterestingness.NIL != simple_strategy_chooses_to_set_aside_problemP(strategy, problem)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 24010L)
    public static SubLObject simple_strategy_chooses_to_ignore_tacticP(final SubLObject strategy, final SubLObject tactic) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_tactician_strategic_uninterestingness.NIL != simple_strategy_chooses_to_throw_away_tacticP(strategy, tactic) || ((inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_inference.inference_continuableP(inference_datastructures_strategy.strategy_inference(strategy)) || inference_tactician_strategic_uninterestingness.NIL == inference_tactician.strategy_set_aside_non_continuable_implies_throw_awayP(strategy)) && inference_tactician_strategic_uninterestingness.NIL != simple_strategy_chooses_to_set_aside_tacticP(strategy, tactic)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 24490L)
    public static SubLObject problem_strategically_pendingP(final SubLObject problem, final SubLObject strategic_context) {
        assert inference_tactician_strategic_uninterestingness.NIL != inference_worker.strategic_context_p(strategic_context) : strategic_context;
        if (inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            return (SubLObject)inference_tactician_strategic_uninterestingness.T;
        }
        return inference_datastructures_problem.problem_no_tactics_possibleP(problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 25036L)
    public static SubLObject strategy_deems_problem_tactically_uninterestingP(final SubLObject strategy, final SubLObject problem) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_tactician_strategic_uninterestingness.NIL != tactically_uninteresting_problem_p(problem) || inference_tactician_strategic_uninterestingness.NIL != strategy_has_enough_proofs_for_problemP(strategy, problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 25247L)
    public static SubLObject strategy_has_enough_proofs_for_problemP(final SubLObject strategy, final SubLObject problem) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_problem.tactically_good_problem_p(problem) && (inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_strategy.strategy_wants_one_answerP(strategy) || (inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_strategy.strategy_unique_wrt_bindingsP(strategy) && (inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_problem.closed_problem_p(problem) || (problem.eql(inference_datastructures_strategy.strategy_root_problem(strategy)) && inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_inference.inference_no_free_hl_varsP(inference_datastructures_strategy.strategy_inference(strategy)))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 25919L)
    public static SubLObject tactically_uninteresting_problem_p(final SubLObject problem) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem) || inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_problem.tactically_examined_problem_p(problem) || (inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem) && inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_problem.tactically_good_problem_p(problem) && inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_problem.closed_problem_p(problem)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 26656L)
    public static SubLObject strategy_deems_problem_strategically_uninterestingP(final SubLObject strategy, final SubLObject problem) {
        return strategically_uninteresting_problem_p(problem, strategy);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 26848L)
    public static SubLObject strategically_uninteresting_problem_p(final SubLObject problem, final SubLObject strategy) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_strategy.strategically_no_good_problem_p(problem, strategy) || inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_strategy.strategically_pending_problem_p(problem, strategy) || inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_strategy.strategically_examined_problem_p(problem, strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 27133L)
    public static SubLObject problem_has_relevant_supporting_problemP(final SubLObject problem, final SubLObject strategic_context, final SubLObject consider_transformation_tacticsP) {
        assert inference_tactician_strategic_uninterestingness.NIL != inference_worker.strategic_context_p(strategic_context) : strategic_context;
        if (inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject argument_link;
            SubLObject link_var;
            SubLObject cdolist_list_var;
            SubLObject supporting_mapped_problem;
            SubLObject supporting_problem;
            SubLObject variable_map;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_tactician_strategic_uninterestingness.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_tactician_strategic_uninterestingness.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                argument_link = set_contents.do_set_contents_next(basis_object, state);
                if (inference_tactician_strategic_uninterestingness.NIL != set_contents.do_set_contents_element_validP(state, argument_link) && (inference_tactician_strategic_uninterestingness.NIL != consider_transformation_tacticsP || inference_tactician_strategic_uninterestingness.NIL == inference_worker_transformation.transformation_link_p(argument_link))) {
                    link_var = argument_link;
                    cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                    supporting_mapped_problem = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
                    supporting_mapped_problem = cdolist_list_var.first();
                    while (inference_tactician_strategic_uninterestingness.NIL != cdolist_list_var) {
                        if (inference_tactician_strategic_uninterestingness.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_tactician_strategic_uninterestingness.NIL, link_var, supporting_mapped_problem)) {
                            supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                            variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                            if (inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_problem.problem_relevant_to_strategyP(supporting_problem, strategic_context)) {
                                return (SubLObject)inference_tactician_strategic_uninterestingness.T;
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        supporting_mapped_problem = cdolist_list_var.first();
                    }
                }
            }
            return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        }
        return inference_datastructures_problem.problem_has_argument_link_p(problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 27802L)
    public static SubLObject problem_has_interesting_transformation_tacticsP(final SubLObject problem, final SubLObject strategic_context) {
        assert inference_tactician_strategic_uninterestingness.NIL != inference_worker.strategic_context_p(strategic_context) : strategic_context;
        if (inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
            SubLObject tactic = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
            tactic = cdolist_list_var.first();
            while (inference_tactician_strategic_uninterestingness.NIL != cdolist_list_var) {
                if (inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, (SubLObject)inference_tactician_strategic_uninterestingness.$kw40$TRANSFORMATION) && inference_tactician_strategic_uninterestingness.NIL == simple_strategy_chooses_to_ignore_tacticP(strategic_context, tactic)) {
                    return (SubLObject)inference_tactician_strategic_uninterestingness.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                tactic = cdolist_list_var.first();
            }
            return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        }
        return inference_datastructures_problem.problem_has_transformation_tacticsP(problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 28235L)
    public static SubLObject problem_no_tactics_strategically_possibleP(final SubLObject strategy, final SubLObject problem) {
        return Numbers.zerop(inference_datastructures_strategy.problem_strategically_possible_tactic_count(problem, strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 28524L)
    public static SubLObject inference_chooses_to_set_aside_problemP(final SubLObject inference, final SubLObject problem) {
        return inference_chooses_to_set_aside_problem_int(inference, problem, (SubLObject)inference_tactician_strategic_uninterestingness.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 28677L)
    public static SubLObject why_inference_chooses_to_set_aside_problem(final SubLObject inference, final SubLObject problem) {
        return inference_chooses_to_set_aside_problem_int(inference, problem, (SubLObject)inference_tactician_strategic_uninterestingness.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 28831L)
    public static SubLObject inference_chooses_to_set_aside_problem_int(final SubLObject inference, final SubLObject problem, final SubLObject justifyP) {
        if (inference_tactician_strategic_uninterestingness.NIL != inference_worker.problem_strictly_within_max_proof_depthP(inference, problem)) {
            return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        }
        if (inference_tactician_strategic_uninterestingness.NIL != justifyP) {
            return (SubLObject)inference_tactician_strategic_uninterestingness.$str41$problem_exceeds_max_proof_depth;
        }
        return (SubLObject)inference_tactician_strategic_uninterestingness.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 29078L)
    public static SubLObject inference_chooses_to_throw_away_problemP(final SubLObject inference, final SubLObject problem) {
        return inference_chooses_to_throw_away_problem_int(inference, problem, (SubLObject)inference_tactician_strategic_uninterestingness.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 29233L)
    public static SubLObject why_inference_chooses_to_throw_away_problem(final SubLObject inference, final SubLObject problem) {
        return inference_chooses_to_throw_away_problem_int(inference, problem, (SubLObject)inference_tactician_strategic_uninterestingness.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 29389L)
    public static SubLObject inference_chooses_to_throw_away_problem_int(final SubLObject inference, final SubLObject problem, final SubLObject justifyP) {
        if (inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_inference.inference_allows_use_of_all_rulesP(inference) || inference_tactician_strategic_uninterestingness.NIL == inference_datastructures_problem.problem_has_dependent_link_p(problem) || inference_tactician_strategic_uninterestingness.NIL == all_dependent_links_are_forbidden_transformationsP(problem, inference)) {
            return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        }
        if (inference_tactician_strategic_uninterestingness.NIL != justifyP) {
            return (SubLObject)inference_tactician_strategic_uninterestingness.$str42$proof_checker_mode_is_enabled_and;
        }
        return (SubLObject)inference_tactician_strategic_uninterestingness.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 29813L)
    public static SubLObject all_dependent_links_are_forbidden_transformationsP(final SubLObject problem, final SubLObject inference) {
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_tactician_strategic_uninterestingness.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_tactician_strategic_uninterestingness.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_tactician_strategic_uninterestingness.NIL != set_contents.do_set_contents_element_validP(state, link) && (inference_tactician_strategic_uninterestingness.NIL == inference_worker_transformation.transformation_link_p(link) || inference_tactician_strategic_uninterestingness.NIL == transformation_forbidden_by_inferenceP(link, inference))) {
                return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
            }
        }
        return (SubLObject)inference_tactician_strategic_uninterestingness.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 30140L)
    public static SubLObject transformation_forbidden_by_inferenceP(final SubLObject transformation_link, final SubLObject inference) {
        final SubLObject rule = inference_worker_transformation.transformation_link_rule_assertion(transformation_link);
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_tactician_strategic_uninterestingness.NIL == inference_datastructures_inference.inference_allows_use_of_ruleP(inference, rule));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 30368L)
    public static SubLObject inference_chooses_to_throw_away_all_transformations_on_problemP_internal(final SubLObject inference, final SubLObject problem) {
        return inference_chooses_to_throw_away_all_transformations_on_problem_int(inference, problem, (SubLObject)inference_tactician_strategic_uninterestingness.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 30368L)
    public static SubLObject inference_chooses_to_throw_away_all_transformations_on_problemP(final SubLObject inference, final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        if (inference_tactician_strategic_uninterestingness.NIL == v_memoization_state) {
            return inference_chooses_to_throw_away_all_transformations_on_problemP_internal(inference, problem);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)inference_tactician_strategic_uninterestingness.$sym43$INFERENCE_CHOOSES_TO_THROW_AWAY_ALL_TRANSFORMATIONS_ON_PROBLEM_, (SubLObject)inference_tactician_strategic_uninterestingness.UNPROVIDED);
        if (inference_tactician_strategic_uninterestingness.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)inference_tactician_strategic_uninterestingness.$sym43$INFERENCE_CHOOSES_TO_THROW_AWAY_ALL_TRANSFORMATIONS_ON_PROBLEM_, (SubLObject)inference_tactician_strategic_uninterestingness.TWO_INTEGER, (SubLObject)inference_tactician_strategic_uninterestingness.NIL, (SubLObject)inference_tactician_strategic_uninterestingness.EQ, (SubLObject)inference_tactician_strategic_uninterestingness.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)inference_tactician_strategic_uninterestingness.$sym43$INFERENCE_CHOOSES_TO_THROW_AWAY_ALL_TRANSFORMATIONS_ON_PROBLEM_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(inference, problem);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)inference_tactician_strategic_uninterestingness.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
            collision = cdolist_list_var.first();
            while (inference_tactician_strategic_uninterestingness.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (inference.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (inference_tactician_strategic_uninterestingness.NIL != cached_args && inference_tactician_strategic_uninterestingness.NIL == cached_args.rest() && problem.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(inference_chooses_to_throw_away_all_transformations_on_problemP_internal(inference, problem)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(inference, problem));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 30602L)
    public static SubLObject why_inference_chooses_to_throw_away_all_transformations_on_problem(final SubLObject inference, final SubLObject problem) {
        return inference_chooses_to_throw_away_all_transformations_on_problem_int(inference, problem, (SubLObject)inference_tactician_strategic_uninterestingness.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 30804L)
    public static SubLObject inference_chooses_to_throw_away_all_transformations_on_problem_int(final SubLObject inference, final SubLObject problem, final SubLObject justifyP) {
        final SubLObject allow_hl_predicate_transformationP = inference_datastructures_inference.inference_allow_hl_predicate_transformationP(inference);
        final SubLObject allow_unbound_predicate_transformationP = inference_datastructures_inference.inference_allow_unbound_predicate_transformationP(inference);
        final SubLObject allow_evaluatable_predicate_transformationP = inference_datastructures_inference.inference_allow_evaluatable_predicate_transformationP(inference);
        if (inference_tactician_strategic_uninterestingness.NIL == allow_unbound_predicate_transformationP) {
            if (inference_tactician_strategic_uninterestingness.NIL == allow_hl_predicate_transformationP && inference_tactician_strategic_uninterestingness.NIL != problem_uses_hl_predicateP(problem) && inference_tactician_strategic_uninterestingness.NIL == collection_backchain_encouraged_problemP(problem)) {
                if (inference_tactician_strategic_uninterestingness.NIL != justifyP) {
                    return (SubLObject)inference_tactician_strategic_uninterestingness.$str44$problem_uses_an_HL_predicate__HL_;
                }
                return (SubLObject)inference_tactician_strategic_uninterestingness.T;
            }
            else if (inference_tactician_strategic_uninterestingness.NIL == allow_evaluatable_predicate_transformationP && inference_tactician_strategic_uninterestingness.NIL != problem_uses_evaluatable_predicateP(problem)) {
                if (inference_tactician_strategic_uninterestingness.NIL != justifyP) {
                    return (SubLObject)inference_tactician_strategic_uninterestingness.$str45$problem_uses_an_evaluatable_predi;
                }
                return (SubLObject)inference_tactician_strategic_uninterestingness.T;
            }
        }
        return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 32030L)
    public static SubLObject collection_backchain_encouraged_problemP(final SubLObject problem) {
        final SubLObject asent = inference_datastructures_problem.single_literal_problem_atomic_sentence(problem);
        final SubLObject mt = inference_datastructures_problem.single_literal_problem_mt(problem);
        return collection_backchain_encouraged_asentP(asent, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 32356L)
    public static SubLObject problem_uses_hl_predicateP(final SubLObject problem) {
        if (inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
            final SubLObject predicate = inference_datastructures_problem.single_literal_problem_predicate(problem);
            return hl_supports.hl_predicate_p(predicate);
        }
        return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 32565L)
    public static SubLObject problem_uses_evaluatable_predicateP(final SubLObject problem) {
        if (inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
            final SubLObject predicate = inference_datastructures_problem.single_literal_problem_predicate(problem);
            return (SubLObject)SubLObjectFactory.makeBoolean(inference_tactician_strategic_uninterestingness.NIL != forts.fort_p(predicate) && inference_tactician_strategic_uninterestingness.NIL != inference_trampolines.inference_evaluatable_predicateP(predicate));
        }
        return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 32828L)
    public static SubLObject simple_strategy_deems_rewrite_tactic_redundantP(final SubLObject strategy, final SubLObject tactic) {
        if (inference_tactician_strategic_uninterestingness.NIL != inference_worker_rewrite.rewrite_tactic_p(tactic)) {
            final SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
            final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
            final SubLObject new_module = inference_datastructures_tactic.tactic_hl_module(tactic);
            if (inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
                SubLObject redundantP = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
                final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
                SubLObject basis_object;
                SubLObject state;
                SubLObject rewrite_link;
                SubLObject old_tactic;
                SubLObject old_module;
                SubLObject supported_problem;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_tactician_strategic_uninterestingness.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_tactician_strategic_uninterestingness.NIL == redundantP && inference_tactician_strategic_uninterestingness.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    rewrite_link = set_contents.do_set_contents_next(basis_object, state);
                    if (inference_tactician_strategic_uninterestingness.NIL != set_contents.do_set_contents_element_validP(state, rewrite_link) && inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_problem_link.problem_link_has_typeP(rewrite_link, (SubLObject)inference_tactician_strategic_uninterestingness.$kw46$REWRITE)) {
                        old_tactic = inference_worker_rewrite.rewrite_link_tactic(rewrite_link);
                        old_module = inference_datastructures_tactic.tactic_hl_module(old_tactic);
                        if (old_module.eql(new_module)) {
                            supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(rewrite_link);
                            if (inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(supported_problem, inference)) {
                                redundantP = (SubLObject)inference_tactician_strategic_uninterestingness.T;
                            }
                        }
                    }
                }
                return redundantP;
            }
        }
        return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 33795L)
    public static SubLObject tactic_exceeds_productivity_limitP(final SubLObject tactic, final SubLObject strategic_context) {
        if (inference_tactician_strategic_uninterestingness.NIL == inference_datastructures_strategy.strategy_p(strategic_context)) {
            return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        }
        final SubLObject productivity_limit = inference_datastructures_strategy.strategy_productivity_limit(strategic_context);
        if (inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_enumerated_types.infinite_productivity_p(productivity_limit)) {
            return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        }
        final SubLObject productivity = inference_datastructures_strategy.tactic_strategic_productivity(tactic, strategic_context);
        return inference_datastructures_enumerated_types.productivity_G(productivity, productivity_limit);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 34304L)
    public static SubLObject simple_strategy_chooses_to_set_aside_transformation_tacticP(final SubLObject strategy, final SubLObject transformation_tactic) {
        return simple_strategy_chooses_to_set_aside_transformation_tactic_int(strategy, transformation_tactic, (SubLObject)inference_tactician_strategic_uninterestingness.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 34523L)
    public static SubLObject why_simple_strategy_chooses_to_set_aside_transformation_tactic(final SubLObject strategy, final SubLObject transformation_tactic) {
        return simple_strategy_chooses_to_set_aside_transformation_tactic_int(strategy, transformation_tactic, (SubLObject)inference_tactician_strategic_uninterestingness.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 34743L)
    public static SubLObject simple_strategy_chooses_to_set_aside_transformation_tactic_int(final SubLObject strategy, final SubLObject transformation_tactic, final SubLObject justifyP) {
        final SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
        if (inference_tactician_strategic_uninterestingness.NIL != justifyP) {
            return why_inference_chooses_to_set_aside_transformation_tactic(inference, transformation_tactic);
        }
        return inference_chooses_to_set_aside_transformation_tacticP(inference, transformation_tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 35133L)
    public static SubLObject inference_chooses_to_set_aside_transformation_tacticP(final SubLObject inference, final SubLObject transformation_tactic) {
        return inference_chooses_to_set_aside_transformation_tactic_int(inference, transformation_tactic, (SubLObject)inference_tactician_strategic_uninterestingness.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 35342L)
    public static SubLObject why_inference_chooses_to_set_aside_transformation_tactic(final SubLObject inference, final SubLObject transformation_tactic) {
        return inference_chooses_to_set_aside_transformation_tactic_int(inference, transformation_tactic, (SubLObject)inference_tactician_strategic_uninterestingness.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 35552L)
    public static SubLObject inference_chooses_to_set_aside_transformation_tactic_int(final SubLObject inference, final SubLObject transformation_tactic, final SubLObject justifyP) {
        final SubLObject rule = inference_worker_transformation.transformation_tactic_rule(transformation_tactic);
        if (inference_tactician_strategic_uninterestingness.NIL != rule && inference_tactician_strategic_uninterestingness.NIL != inference_analysis.transformation_rule_has_insufficient_historical_utilityP(rule, inference)) {
            if (inference_tactician_strategic_uninterestingness.NIL != justifyP) {
                return (SubLObject)inference_tactician_strategic_uninterestingness.$str35$the_rule_for_this_tactic_has_an_i;
            }
            return (SubLObject)inference_tactician_strategic_uninterestingness.T;
        }
        else {
            final SubLObject problem = inference_datastructures_tactic.tactic_problem(transformation_tactic);
            if (inference_tactician_strategic_uninterestingness.NIL != inference_worker.problem_transformation_allowed_wrt_max_transformation_depthP(inference, problem)) {
                return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
            }
            if (inference_tactician_strategic_uninterestingness.NIL != justifyP) {
                return (SubLObject)inference_tactician_strategic_uninterestingness.$str47$problem_exceeds_max_transformatio;
            }
            return (SubLObject)inference_tactician_strategic_uninterestingness.T;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 36297L)
    public static SubLObject simple_strategy_chooses_to_throw_away_transformation_tacticP_internal(final SubLObject strategy, final SubLObject transformation_tactic) {
        return simple_strategy_chooses_to_throw_away_transformation_tactic_int(strategy, transformation_tactic, (SubLObject)inference_tactician_strategic_uninterestingness.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 36297L)
    public static SubLObject simple_strategy_chooses_to_throw_away_transformation_tacticP(final SubLObject strategy, final SubLObject transformation_tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        if (inference_tactician_strategic_uninterestingness.NIL == v_memoization_state) {
            return simple_strategy_chooses_to_throw_away_transformation_tacticP_internal(strategy, transformation_tactic);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)inference_tactician_strategic_uninterestingness.$sym48$SIMPLE_STRATEGY_CHOOSES_TO_THROW_AWAY_TRANSFORMATION_TACTIC_, (SubLObject)inference_tactician_strategic_uninterestingness.UNPROVIDED);
        if (inference_tactician_strategic_uninterestingness.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)inference_tactician_strategic_uninterestingness.$sym48$SIMPLE_STRATEGY_CHOOSES_TO_THROW_AWAY_TRANSFORMATION_TACTIC_, (SubLObject)inference_tactician_strategic_uninterestingness.TWO_INTEGER, (SubLObject)inference_tactician_strategic_uninterestingness.NIL, (SubLObject)inference_tactician_strategic_uninterestingness.EQ, (SubLObject)inference_tactician_strategic_uninterestingness.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)inference_tactician_strategic_uninterestingness.$sym48$SIMPLE_STRATEGY_CHOOSES_TO_THROW_AWAY_TRANSFORMATION_TACTIC_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(strategy, transformation_tactic);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)inference_tactician_strategic_uninterestingness.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
            collision = cdolist_list_var.first();
            while (inference_tactician_strategic_uninterestingness.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (strategy.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (inference_tactician_strategic_uninterestingness.NIL != cached_args && inference_tactician_strategic_uninterestingness.NIL == cached_args.rest() && transformation_tactic.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(simple_strategy_chooses_to_throw_away_transformation_tacticP_internal(strategy, transformation_tactic)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(strategy, transformation_tactic));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 36551L)
    public static SubLObject why_simple_strategy_chooses_to_throw_away_transformation_tactic(final SubLObject strategy, final SubLObject transformation_tactic) {
        return simple_strategy_chooses_to_throw_away_transformation_tactic_int(strategy, transformation_tactic, (SubLObject)inference_tactician_strategic_uninterestingness.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 36773L)
    public static SubLObject simple_strategy_chooses_to_throw_away_transformation_tactic_int(final SubLObject strategy, final SubLObject transformation_tactic, final SubLObject justifyP) {
        final SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
        if (inference_tactician_strategic_uninterestingness.NIL != justifyP) {
            return why_inference_chooses_to_throw_away_transformation_tactic(inference, transformation_tactic);
        }
        return inference_chooses_to_throw_away_transformation_tacticP(inference, transformation_tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 37166L)
    public static SubLObject inference_chooses_to_throw_away_transformation_tacticP(final SubLObject inference, final SubLObject transformation_tactic) {
        return inference_chooses_to_throw_away_transformation_tactic_int(inference, transformation_tactic, (SubLObject)inference_tactician_strategic_uninterestingness.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 37377L)
    public static SubLObject why_inference_chooses_to_throw_away_transformation_tactic(final SubLObject inference, final SubLObject transformation_tactic) {
        return inference_chooses_to_throw_away_transformation_tactic_int(inference, transformation_tactic, (SubLObject)inference_tactician_strategic_uninterestingness.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 37589L)
    public static SubLObject inference_chooses_to_throw_away_transformation_tactic_int(final SubLObject inference, final SubLObject transformation_tactic, final SubLObject justifyP) {
        final SubLObject rule = inference_worker_transformation.transformation_tactic_rule(transformation_tactic);
        if (inference_tactician_strategic_uninterestingness.NIL != rule && inference_tactician_strategic_uninterestingness.NIL == inference_datastructures_inference.inference_allows_use_of_all_rulesP(inference) && inference_tactician_strategic_uninterestingness.NIL == inference_datastructures_inference.inference_allows_use_of_ruleP(inference, rule)) {
            if (inference_tactician_strategic_uninterestingness.NIL != justifyP) {
                return (SubLObject)inference_tactician_strategic_uninterestingness.$str49$proof_checker_mode_is_enabled__an;
            }
            return (SubLObject)inference_tactician_strategic_uninterestingness.T;
        }
        else {
            if (inference_tactician_strategic_uninterestingness.NIL != inference_worker_transformation.meta_transformation_tactic_p(transformation_tactic)) {
                final SubLObject problem = inference_datastructures_tactic.tactic_problem(transformation_tactic);
                if (inference_tactician_strategic_uninterestingness.NIL != inference_chooses_to_throw_away_all_transformations_on_problemP(inference, problem)) {
                    if (inference_tactician_strategic_uninterestingness.NIL != justifyP) {
                        return why_inference_chooses_to_throw_away_all_transformations_on_problem(inference, problem);
                    }
                    return (SubLObject)inference_tactician_strategic_uninterestingness.T;
                }
            }
            final SubLObject allow_hl_predicate_transformationP = inference_datastructures_inference.inference_allow_hl_predicate_transformationP(inference);
            if (inference_tactician_strategic_uninterestingness.NIL == allow_hl_predicate_transformationP && inference_tactician_strategic_uninterestingness.NIL != tactic_requires_hl_predicate_transformationP(transformation_tactic)) {
                if (inference_tactician_strategic_uninterestingness.NIL != justifyP) {
                    return (SubLObject)inference_tactician_strategic_uninterestingness.$str50$tactic_requires_HL_predicate_tran;
                }
                return (SubLObject)inference_tactician_strategic_uninterestingness.T;
            }
            else {
                final SubLObject allow_unbound_predicate_transformationP = inference_datastructures_inference.inference_allow_unbound_predicate_transformationP(inference);
                if (inference_tactician_strategic_uninterestingness.NIL == allow_unbound_predicate_transformationP && inference_tactician_strategic_uninterestingness.NIL != tactic_requires_unbound_predicate_transformationP(transformation_tactic)) {
                    if (inference_tactician_strategic_uninterestingness.NIL != justifyP) {
                        return (SubLObject)inference_tactician_strategic_uninterestingness.$str51$tactic_requires_unbound_predicate;
                    }
                    return (SubLObject)inference_tactician_strategic_uninterestingness.T;
                }
                else {
                    final SubLObject allow_evaluatable_predicate_transformationP = inference_datastructures_inference.inference_allow_evaluatable_predicate_transformationP(inference);
                    if (inference_tactician_strategic_uninterestingness.NIL != allow_evaluatable_predicate_transformationP || inference_tactician_strategic_uninterestingness.NIL == tactic_requires_evaluatable_predicate_transformationP(transformation_tactic)) {
                        return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
                    }
                    if (inference_tactician_strategic_uninterestingness.NIL != justifyP) {
                        return (SubLObject)inference_tactician_strategic_uninterestingness.$str52$tactic_requires_evaluatable_predi;
                    }
                    return (SubLObject)inference_tactician_strategic_uninterestingness.T;
                }
            }
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 39817L)
    public static SubLObject strategy_disallows_use_of_hl_module_on_problemP(final SubLObject strategy, final SubLObject hl_module, final SubLObject problem) {
        final SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
        final SubLObject allow_hl_predicate_transformationP = inference_datastructures_inference.inference_allow_hl_predicate_transformationP(inference);
        if (inference_tactician_strategic_uninterestingness.NIL == allow_hl_predicate_transformationP && inference_tactician_strategic_uninterestingness.NIL != hl_module_requires_hl_predicate_transformationP(hl_module, problem)) {
            return (SubLObject)inference_tactician_strategic_uninterestingness.T;
        }
        final SubLObject allow_unbound_predicate_transformationP = inference_datastructures_inference.inference_allow_unbound_predicate_transformationP(inference);
        if (inference_tactician_strategic_uninterestingness.NIL == allow_unbound_predicate_transformationP && inference_tactician_strategic_uninterestingness.NIL != hl_module_requires_unbound_predicate_transformationP(hl_module)) {
            return (SubLObject)inference_tactician_strategic_uninterestingness.T;
        }
        final SubLObject allow_evaluatable_predicate_transformationP = inference_datastructures_inference.inference_allow_evaluatable_predicate_transformationP(inference);
        if (inference_tactician_strategic_uninterestingness.NIL == allow_evaluatable_predicate_transformationP && inference_tactician_strategic_uninterestingness.NIL != problem_uses_evaluatable_predicateP(problem)) {
            return (SubLObject)inference_tactician_strategic_uninterestingness.T;
        }
        return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 40797L)
    public static SubLObject tactic_requires_hl_predicate_transformationP(final SubLObject tactic) {
        final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        return hl_module_requires_hl_predicate_transformationP(hl_module, problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 41034L)
    public static SubLObject hl_module_requires_hl_predicate_transformationP(final SubLObject hl_module, final SubLObject problem) {
        if (inference_tactician_strategic_uninterestingness.NIL == inference_modules.transformation_module_p(hl_module)) {
            return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        }
        if (inference_tactician_strategic_uninterestingness.NIL != hl_module_only_applies_to_hl_predicatesP(hl_module)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(inference_tactician_strategic_uninterestingness.NIL == inference_datastructures_problem.single_literal_problem_p(problem) || inference_tactician_strategic_uninterestingness.NIL == collection_backchain_encouraged_problemP(problem));
        }
        if (inference_tactician_strategic_uninterestingness.NIL != problem_uses_hl_predicateP(problem)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(inference_tactician_strategic_uninterestingness.NIL == inference_modules.meta_transformation_module_p(hl_module));
        }
        return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 41488L)
    public static SubLObject collection_backchain_encouraged_tacticP(final SubLObject tactic) {
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        if (inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
            return collection_backchain_encouraged_problemP(problem);
        }
        return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 41748L)
    public static SubLObject collection_backchain_encouraged_asentP(final SubLObject asent, final SubLObject mt) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject resultP = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        if (inference_tactician_strategic_uninterestingness.NIL != subl_promotions.memberP(predicate, (SubLObject)inference_tactician_strategic_uninterestingness.$list53, (SubLObject)inference_tactician_strategic_uninterestingness.UNPROVIDED, (SubLObject)inference_tactician_strategic_uninterestingness.UNPROVIDED)) {
            final SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)inference_tactician_strategic_uninterestingness.UNPROVIDED);
            if (inference_tactician_strategic_uninterestingness.NIL != forts.fort_p(collection)) {
                if (predicate.eql(inference_tactician_strategic_uninterestingness.$const54$isa)) {
                    resultP = (SubLObject)SubLObjectFactory.makeBoolean(inference_tactician_strategic_uninterestingness.NIL != inference_trampolines.inference_collection_backchain_encouragedP(collection, mt) || inference_tactician_strategic_uninterestingness.NIL != inference_trampolines.inference_collection_isa_backchain_encouragedP(collection, mt));
                }
                else if (predicate.eql(inference_tactician_strategic_uninterestingness.$const55$genls)) {
                    resultP = (SubLObject)SubLObjectFactory.makeBoolean(inference_tactician_strategic_uninterestingness.NIL != inference_trampolines.inference_collection_backchain_encouragedP(collection, mt) || inference_tactician_strategic_uninterestingness.NIL != inference_trampolines.inference_collection_genls_backchain_encouragedP(collection, mt));
                }
            }
            return resultP;
        }
        return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 42508L)
    public static SubLObject tactic_problem_uses_hl_predicateP(final SubLObject tactic) {
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        return problem_uses_hl_predicateP(problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 42661L)
    public static SubLObject transformation_tactic_only_applies_to_hl_predicatesP(final SubLObject tactic) {
        return hl_module_only_applies_to_hl_predicatesP(inference_datastructures_tactic.tactic_hl_module(tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 42818L)
    public static SubLObject hl_module_only_applies_to_hl_predicatesP(final SubLObject hl_module) {
        final SubLObject predicate = inference_modules.hl_module_predicate(hl_module);
        return hl_supports.hl_predicate_p(predicate);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 42981L)
    public static SubLObject tactic_requires_unbound_predicate_transformationP(final SubLObject tactic) {
        if (inference_tactician_strategic_uninterestingness.NIL != inference_worker_transformation.transformation_tactic_p(tactic)) {
            final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
            return hl_module_requires_unbound_predicate_transformationP(hl_module);
        }
        return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 43229L)
    public static SubLObject hl_module_requires_unbound_predicate_transformationP(final SubLObject hl_module) {
        return transformation_modules.trans_unbound_predicate_module_p(hl_module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 43365L)
    public static SubLObject tactic_requires_evaluatable_predicate_transformationP(final SubLObject tactic) {
        if (inference_tactician_strategic_uninterestingness.NIL != inference_worker_transformation.transformation_tactic_p(tactic)) {
            final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
            return problem_uses_evaluatable_predicateP(problem);
        }
        return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 43594L)
    public static SubLObject tactic_completeP(final SubLObject tactic, final SubLObject strategic_context) {
        return Equality.eq((SubLObject)inference_tactician_strategic_uninterestingness.$kw56$COMPLETE, inference_datastructures_strategy.tactic_strategic_completeness(tactic, strategic_context));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 43738L)
    public static SubLObject tactic_incompleteP(final SubLObject tactic, final SubLObject strategic_context) {
        return Equality.eq((SubLObject)inference_tactician_strategic_uninterestingness.$kw57$INCOMPLETE, inference_datastructures_strategy.tactic_strategic_completeness(tactic, strategic_context));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 43886L)
    public static SubLObject tactic_impossibleP(final SubLObject tactic, final SubLObject strategic_context) {
        return Equality.eq((SubLObject)inference_tactician_strategic_uninterestingness.$kw58$IMPOSSIBLE, inference_datastructures_strategy.tactic_strategic_completeness(tactic, strategic_context));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 44034L)
    public static SubLObject tactic_preferredP(final SubLObject tactic, final SubLObject strategic_context) {
        return Equality.eq((SubLObject)inference_tactician_strategic_uninterestingness.$kw59$PREFERRED, inference_datastructures_strategy.tactic_strategic_preference_level(tactic, strategic_context));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 44184L)
    public static SubLObject tactic_dispreferredP(final SubLObject tactic, final SubLObject strategic_context) {
        return Equality.eq((SubLObject)inference_tactician_strategic_uninterestingness.$kw60$DISPREFERRED, inference_datastructures_strategy.tactic_strategic_preference_level(tactic, strategic_context));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 44340L)
    public static SubLObject tactic_disallowedP(final SubLObject tactic, final SubLObject strategic_context) {
        return Equality.eq((SubLObject)inference_tactician_strategic_uninterestingness.$kw61$DISALLOWED, inference_datastructures_strategy.tactic_strategic_preference_level(tactic, strategic_context));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 44492L)
    public static SubLObject tactic_doomedP(final SubLObject tactic, final SubLObject strategic_context) {
        return Equality.eq((SubLObject)inference_tactician_strategic_uninterestingness.$kw62$DOOMED, inference_datastructures_strategy.tactic_strategic_preference_level(tactic, strategic_context));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 44636L)
    public static SubLObject tactic_disallowed_or_doomedP(final SubLObject tactic, final SubLObject strategic_context) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_tactician_strategic_uninterestingness.NIL != tactic_disallowedP(tactic, strategic_context) || inference_tactician_strategic_uninterestingness.NIL != tactic_doomedP(tactic, strategic_context));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 44819L)
    public static SubLObject problem_has_executed_a_complete_tacticP(final SubLObject problem, final SubLObject strategic_context, SubLObject type) {
        if (type == inference_tactician_strategic_uninterestingness.UNPROVIDED) {
            type = (SubLObject)inference_tactician_strategic_uninterestingness.$kw63$CONTENT;
        }
        if (inference_tactician_strategic_uninterestingness.NIL == inference_datastructures_problem_store.problem_store_removal_allowedP(inference_datastructures_problem.problem_store(problem))) {
            return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        }
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        tactic = cdolist_list_var.first();
        while (inference_tactician_strategic_uninterestingness.NIL != cdolist_list_var) {
            if (inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, type) && inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_problem.do_problem_tactics_status_match(tactic, (SubLObject)inference_tactician_strategic_uninterestingness.$kw64$EXECUTED) && inference_tactician_strategic_uninterestingness.NIL != tactic_completeP(tactic, strategic_context)) {
                return (SubLObject)inference_tactician_strategic_uninterestingness.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 45205L)
    public static SubLObject lookahead_problem_has_executed_a_complete_tacticP(final SubLObject problem, final SubLObject strategic_context, SubLObject type) {
        if (type == inference_tactician_strategic_uninterestingness.UNPROVIDED) {
            type = (SubLObject)inference_tactician_strategic_uninterestingness.$kw63$CONTENT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject jo_tactic = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        jo_tactic = cdolist_list_var.first();
        while (inference_tactician_strategic_uninterestingness.NIL != cdolist_list_var) {
            if (inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_problem.do_problem_tactics_type_match(jo_tactic, (SubLObject)inference_tactician_strategic_uninterestingness.$kw65$JOIN_ORDERED) && inference_tactician_strategic_uninterestingness.NIL != problem_has_executed_a_complete_tacticP(inference_worker_join_ordered.join_ordered_tactic_lookahead_problem(jo_tactic), strategic_context, type)) {
                return (SubLObject)inference_tactician_strategic_uninterestingness.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            jo_tactic = cdolist_list_var.first();
        }
        cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject join_tactic = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        join_tactic = cdolist_list_var.first();
        while (inference_tactician_strategic_uninterestingness.NIL != cdolist_list_var) {
            if (inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_problem.do_problem_tactics_type_match(join_tactic, (SubLObject)inference_tactician_strategic_uninterestingness.$kw66$JOIN)) {
                thread.resetMultipleValues();
                final SubLObject lookahead_1 = inference_worker_join.join_tactic_lookahead_problems(join_tactic);
                final SubLObject lookahead_2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (inference_tactician_strategic_uninterestingness.NIL != problem_has_executed_a_complete_tacticP(lookahead_1, strategic_context, type) || inference_tactician_strategic_uninterestingness.NIL != problem_has_executed_a_complete_tacticP(lookahead_2, strategic_context, type)) {
                    return (SubLObject)inference_tactician_strategic_uninterestingness.T;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            join_tactic = cdolist_list_var.first();
        }
        return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 46017L)
    public static SubLObject problem_or_lookahead_problem_has_executed_a_complete_tacticP(final SubLObject problem, final SubLObject strategic_context, SubLObject type) {
        if (type == inference_tactician_strategic_uninterestingness.UNPROVIDED) {
            type = (SubLObject)inference_tactician_strategic_uninterestingness.$kw63$CONTENT;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_tactician_strategic_uninterestingness.NIL != problem_has_executed_a_complete_tacticP(problem, strategic_context, type) || inference_tactician_strategic_uninterestingness.NIL != lookahead_problem_has_executed_a_complete_tacticP(problem, strategic_context, type));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 46327L)
    public static SubLObject problem_has_executed_a_preferred_tacticP(final SubLObject problem, final SubLObject strategic_context, SubLObject type) {
        if (type == inference_tactician_strategic_uninterestingness.UNPROVIDED) {
            type = (SubLObject)inference_tactician_strategic_uninterestingness.$kw67$LOGICAL;
        }
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        tactic = cdolist_list_var.first();
        while (inference_tactician_strategic_uninterestingness.NIL != cdolist_list_var) {
            if (inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, type) && inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_problem.do_problem_tactics_status_match(tactic, (SubLObject)inference_tactician_strategic_uninterestingness.$kw64$EXECUTED) && inference_tactician_strategic_uninterestingness.NIL != tactic_preferredP(tactic, strategic_context)) {
                return (SubLObject)inference_tactician_strategic_uninterestingness.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 46594L)
    public static SubLObject problem_has_executed_a_tactic_of_typeP(final SubLObject problem, final SubLObject type) {
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        tactic = cdolist_list_var.first();
        while (inference_tactician_strategic_uninterestingness.NIL != cdolist_list_var) {
            if (inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, type) && inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_problem.do_problem_tactics_status_match(tactic, (SubLObject)inference_tactician_strategic_uninterestingness.$kw64$EXECUTED)) {
                return (SubLObject)inference_tactician_strategic_uninterestingness.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 46761L)
    public static SubLObject strategy_admits_tactic_wrt_proof_specP(final SubLObject strategy, final SubLObject tactic) {
        if (inference_tactician_strategic_uninterestingness.NIL != strategy_admits_all_tactics_wrt_proof_specP(strategy)) {
            return (SubLObject)inference_tactician_strategic_uninterestingness.T;
        }
        final SubLObject proof_spec = inference_datastructures_strategy.strategy_problem_proof_spec(strategy, inference_datastructures_tactic.tactic_problem(tactic));
        return proof_spec_admits_tacticP(proof_spec, tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 47085L)
    public static SubLObject strategy_admits_all_tactics_wrt_proof_specP(final SubLObject strategy) {
        return Equality.eq((SubLObject)inference_tactician_strategic_uninterestingness.$kw68$ANYTHING, inference_datastructures_strategy.strategy_proof_spec(strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 47213L)
    public static SubLObject proof_spec_admits_tacticP(final SubLObject proof_spec, final SubLObject tactic) {
        if (inference_tactician_strategic_uninterestingness.$kw68$ANYTHING == proof_spec) {
            return (SubLObject)inference_tactician_strategic_uninterestingness.T;
        }
        if (inference_tactician_strategic_uninterestingness.$kw69$NOTHING == proof_spec) {
            return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        }
        if (inference_tactician_strategic_uninterestingness.NIL != inference_proof_spec.or_pattern_p(proof_spec)) {
            return disjunctive_proof_spec_admits_tacticP(proof_spec, tactic);
        }
        if (inference_tactician_strategic_uninterestingness.NIL != meta_tactic_p(tactic)) {
            return (SubLObject)inference_tactician_strategic_uninterestingness.T;
        }
        if (inference_tactician_strategic_uninterestingness.NIL != inference_worker_removal.removal_tactic_p(tactic)) {
            return proof_spec_admits_removal_tacticP(proof_spec, tactic);
        }
        if (inference_tactician_strategic_uninterestingness.NIL != inference_worker_join_ordered.join_ordered_tactic_p(tactic)) {
            return proof_spec_admits_join_ordered_tacticP(proof_spec, tactic);
        }
        if (inference_tactician_strategic_uninterestingness.NIL != inference_worker_join.join_tactic_p(tactic)) {
            return proof_spec_admits_join_tacticP(proof_spec, tactic);
        }
        if (inference_tactician_strategic_uninterestingness.NIL != inference_worker_split.meta_split_tactic_p(tactic)) {
            return (SubLObject)inference_tactician_strategic_uninterestingness.T;
        }
        if (inference_tactician_strategic_uninterestingness.NIL != inference_worker_split.split_tactic_p(tactic)) {
            return proof_spec_admits_split_tacticP(proof_spec, tactic);
        }
        if (inference_tactician_strategic_uninterestingness.NIL != inference_worker_restriction.simplification_tactic_p(tactic)) {
            return proof_spec_admits_simplification_tacticP(proof_spec, tactic);
        }
        if (inference_tactician_strategic_uninterestingness.NIL != inference_worker_removal.conjunctive_removal_tactic_p(tactic)) {
            return proof_spec_admits_conjuctive_removal_tacticP(proof_spec, tactic);
        }
        if (inference_tactician_strategic_uninterestingness.NIL != inference_worker_transformation.transformation_tactic_p(tactic)) {
            return proof_spec_admits_transformation_tacticP(proof_spec, tactic);
        }
        if (inference_tactician_strategic_uninterestingness.NIL != inference_worker_union.union_tactic_p(tactic)) {
            return proof_spec_admits_union_tacticP(proof_spec, tactic);
        }
        return Errors.error((SubLObject)inference_tactician_strategic_uninterestingness.$str70$Time_to_support_proof_spec_admitt, inference_datastructures_tactic.tactic_type(tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 48537L)
    public static SubLObject meta_tactic_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_tactician_strategic_uninterestingness.NIL != inference_datastructures_tactic.tactic_p(v_object) && (inference_tactician_strategic_uninterestingness.NIL != inference_worker_removal.meta_removal_tactic_p(v_object) || inference_tactician_strategic_uninterestingness.NIL != inference_worker_transformation.meta_transformation_tactic_p(v_object) || inference_tactician_strategic_uninterestingness.NIL != inference_worker_split.meta_split_tactic_p(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 48775L)
    public static SubLObject disjunctive_proof_spec_admits_tacticP(final SubLObject proof_spec, final SubLObject tactic) {
        SubLObject operator = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(proof_spec, proof_spec, (SubLObject)inference_tactician_strategic_uninterestingness.$list71);
        operator = proof_spec.first();
        final SubLObject current = proof_spec.rest();
        SubLObject cdolist_list_var;
        final SubLObject sub_specs = cdolist_list_var = current;
        SubLObject sub_spec = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        sub_spec = cdolist_list_var.first();
        while (inference_tactician_strategic_uninterestingness.NIL != cdolist_list_var) {
            if (inference_tactician_strategic_uninterestingness.NIL != proof_spec_admits_tacticP(sub_spec, tactic)) {
                return (SubLObject)inference_tactician_strategic_uninterestingness.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            sub_spec = cdolist_list_var.first();
        }
        return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 49049L)
    public static SubLObject proof_spec_admits_removal_tacticP(final SubLObject proof_spec, final SubLObject removal_tactic) {
        if (inference_tactician_strategic_uninterestingness.NIL != inference_proof_spec.removal_proof_spec_p(proof_spec)) {
            return removal_proof_spec_admits_removal_tacticP(proof_spec, removal_tactic);
        }
        if (inference_tactician_strategic_uninterestingness.NIL != inference_proof_spec.restriction_proof_spec_p(proof_spec)) {
            return restriction_proof_spec_admits_removal_tacticP(proof_spec, removal_tactic);
        }
        return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 49385L)
    public static SubLObject proof_spec_admits_join_ordered_tacticP(final SubLObject proof_spec, final SubLObject join_ordered_tactic) {
        if (inference_tactician_strategic_uninterestingness.NIL != inference_proof_spec.join_ordered_proof_spec_p(proof_spec)) {
            return join_ordered_proof_spec_admits_join_ordered_tacticP(proof_spec, join_ordered_tactic);
        }
        if (inference_tactician_strategic_uninterestingness.NIL != inference_proof_spec.residual_transformation_proof_spec_p(proof_spec)) {
            return residual_transformation_proof_spec_admits_join_ordered_tacticP(proof_spec, join_ordered_tactic);
        }
        return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 49785L)
    public static SubLObject proof_spec_admits_join_tacticP(final SubLObject proof_spec, final SubLObject join_tactic) {
        if (inference_tactician_strategic_uninterestingness.NIL != inference_proof_spec.join_proof_spec_p(proof_spec)) {
            return join_proof_spec_admits_join_tacticP(proof_spec, join_tactic);
        }
        return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 49971L)
    public static SubLObject proof_spec_admits_split_tacticP(final SubLObject proof_spec, final SubLObject split_tactic) {
        if (inference_tactician_strategic_uninterestingness.NIL != inference_proof_spec.split_proof_spec_p(proof_spec)) {
            return split_proof_spec_admits_split_proof_tacticP(proof_spec, split_tactic);
        }
        return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 50169L)
    public static SubLObject proof_spec_admits_simplification_tacticP(final SubLObject proof_spec, final SubLObject tactic) {
        if (inference_tactician_strategic_uninterestingness.NIL != inference_proof_spec.restriction_proof_spec_p(proof_spec)) {
            return restriction_proof_spec_admits_simplification_tacticP(proof_spec, tactic);
        }
        return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 50379L)
    public static SubLObject proof_spec_admits_conjuctive_removal_tacticP(final SubLObject proof_spec, final SubLObject tactic) {
        if (inference_tactician_strategic_uninterestingness.NIL != inference_proof_spec.conjunctive_removal_proof_spec_p(proof_spec)) {
            return conjunctive_removal_proof_spec_admits_conjunctive_removal_tacticP(proof_spec, tactic);
        }
        return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 50615L)
    public static SubLObject proof_spec_admits_transformation_tacticP(final SubLObject proof_spec, final SubLObject tactic) {
        if (inference_tactician_strategic_uninterestingness.NIL != inference_proof_spec.transformation_proof_spec_p(proof_spec)) {
            return transformation_proof_spec_admits_transformation_tacticP(proof_spec, tactic);
        }
        return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 50832L)
    public static SubLObject proof_spec_admits_union_tacticP(final SubLObject proof_spec, final SubLObject union_tactic) {
        if (inference_tactician_strategic_uninterestingness.NIL != inference_proof_spec.union_proof_spec_p(proof_spec)) {
            return union_proof_spec_admits_union_tacticP(proof_spec, union_tactic);
        }
        return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 51024L)
    public static SubLObject removal_proof_spec_admits_removal_tacticP(final SubLObject removal_proof_spec, final SubLObject removal_tactic) {
        SubLObject removal_token = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        SubLObject literal_spec = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        SubLObject removal_module_spec = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(removal_proof_spec, removal_proof_spec, (SubLObject)inference_tactician_strategic_uninterestingness.$list72);
        removal_token = removal_proof_spec.first();
        SubLObject current = removal_proof_spec.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, removal_proof_spec, (SubLObject)inference_tactician_strategic_uninterestingness.$list72);
        literal_spec = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, removal_proof_spec, (SubLObject)inference_tactician_strategic_uninterestingness.$list72);
        removal_module_spec = current.first();
        current = current.rest();
        if (inference_tactician_strategic_uninterestingness.NIL == current) {
            final SubLObject problem = inference_datastructures_tactic.tactic_problem(removal_tactic);
            final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(removal_tactic);
            return (SubLObject)SubLObjectFactory.makeBoolean(inference_tactician_strategic_uninterestingness.NIL != literal_spec_admits_single_literal_problemP(literal_spec, problem) && inference_tactician_strategic_uninterestingness.NIL != removal_module_spec_admits_removal_module(removal_module_spec, hl_module));
        }
        cdestructuring_bind.cdestructuring_bind_error(removal_proof_spec, (SubLObject)inference_tactician_strategic_uninterestingness.$list72);
        return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 51523L)
    public static SubLObject restriction_proof_spec_admits_removal_tacticP(final SubLObject restriction_proof_spec, final SubLObject removal_tactic) {
        SubLObject restriction_token = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        SubLObject sub_spec = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(restriction_proof_spec, restriction_proof_spec, (SubLObject)inference_tactician_strategic_uninterestingness.$list73);
        restriction_token = restriction_proof_spec.first();
        SubLObject current = restriction_proof_spec.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, restriction_proof_spec, (SubLObject)inference_tactician_strategic_uninterestingness.$list73);
        sub_spec = current.first();
        current = current.rest();
        if (inference_tactician_strategic_uninterestingness.NIL == current) {
            return proof_spec_admits_tacticP(sub_spec, removal_tactic);
        }
        cdestructuring_bind.cdestructuring_bind_error(restriction_proof_spec, (SubLObject)inference_tactician_strategic_uninterestingness.$list73);
        return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 51861L)
    public static SubLObject split_proof_spec_admits_split_proof_tacticP(final SubLObject split_proof_spec, final SubLObject split_tactic) {
        final SubLObject split_link = inference_worker_split.split_tactic_link(split_tactic);
        final SubLObject split_sub_proof_specs = inference_proof_spec.split_proof_spec_sub_proof_specs(split_proof_spec);
        SubLObject matchedP = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        final SubLObject link_var = split_link;
        SubLObject rest;
        SubLObject supporting_mapped_problem;
        SubLObject supporting_problem;
        SubLObject variable_map;
        SubLObject csome_list_var;
        SubLObject sub_proof_spec;
        SubLObject csome_list_var_$2;
        SubLObject tactic;
        for (rest = (SubLObject)inference_tactician_strategic_uninterestingness.NIL, rest = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var); inference_tactician_strategic_uninterestingness.NIL == matchedP && inference_tactician_strategic_uninterestingness.NIL != rest; rest = rest.rest()) {
            supporting_mapped_problem = rest.first();
            if (inference_tactician_strategic_uninterestingness.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_tactician_strategic_uninterestingness.NIL, link_var, supporting_mapped_problem)) {
                supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                if (inference_tactician_strategic_uninterestingness.NIL == matchedP) {
                    csome_list_var = split_sub_proof_specs;
                    sub_proof_spec = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
                    sub_proof_spec = csome_list_var.first();
                    while (inference_tactician_strategic_uninterestingness.NIL == matchedP && inference_tactician_strategic_uninterestingness.NIL != csome_list_var) {
                        if (inference_tactician_strategic_uninterestingness.NIL == matchedP) {
                            for (csome_list_var_$2 = inference_datastructures_problem.problem_tactics(supporting_problem), tactic = (SubLObject)inference_tactician_strategic_uninterestingness.NIL, tactic = csome_list_var_$2.first(); inference_tactician_strategic_uninterestingness.NIL == matchedP && inference_tactician_strategic_uninterestingness.NIL != csome_list_var_$2; matchedP = proof_spec_admits_tacticP(sub_proof_spec, tactic), csome_list_var_$2 = csome_list_var_$2.rest(), tactic = csome_list_var_$2.first()) {}
                        }
                        csome_list_var = csome_list_var.rest();
                        sub_proof_spec = csome_list_var.first();
                    }
                }
            }
        }
        return matchedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 52751L)
    public static SubLObject restriction_proof_spec_admits_simplification_tacticP(final SubLObject proof_spec, final SubLObject simplification_tactic) {
        return (SubLObject)inference_tactician_strategic_uninterestingness.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 52922L)
    public static SubLObject conjunctive_removal_proof_spec_admits_conjunctive_removal_tacticP(final SubLObject proof_spec, final SubLObject conjunctive_removal_tactic) {
        return (SubLObject)inference_tactician_strategic_uninterestingness.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 53115L)
    public static SubLObject join_ordered_proof_spec_admits_join_ordered_tacticP(final SubLObject proof_spec, final SubLObject join_ordered_tactic) {
        final SubLObject focal_proof_spec = inference_proof_spec.join_ordered_proof_spec_focal_proof_spec(proof_spec);
        final SubLObject focal_problem = inference_worker_join_ordered.join_ordered_tactic_lookahead_problem(join_ordered_tactic);
        return inference_proof_spec.proof_spec_possibly_admits_problemP(focal_proof_spec, focal_problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 53462L)
    public static SubLObject union_proof_spec_admits_union_tacticP(final SubLObject proof_spec, final SubLObject union_tactic) {
        final SubLObject disjunct_proof_spec = inference_proof_spec.union_proof_spec_disjunct_proof_spec(proof_spec);
        final SubLObject disjunct_problem = inference_worker_union.union_tactic_lookahead_problem(union_tactic);
        return inference_proof_spec.proof_spec_possibly_admits_problemP(disjunct_proof_spec, disjunct_problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 53782L)
    public static SubLObject residual_transformation_proof_spec_admits_join_ordered_tacticP(final SubLObject proof_spec, final SubLObject join_ordered_tactic) {
        return (SubLObject)inference_tactician_strategic_uninterestingness.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 53958L)
    public static SubLObject join_proof_spec_admits_join_tacticP(final SubLObject proof_spec, final SubLObject join_tactic) {
        return (SubLObject)inference_tactician_strategic_uninterestingness.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 54091L)
    public static SubLObject transformation_proof_spec_admits_transformation_tacticP(final SubLObject transformation_proof_spec, final SubLObject transformation_tactic) {
        SubLObject transformation_token = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        SubLObject literal_spec = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        SubLObject transformation_module_spec = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        SubLObject rule_spec = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(transformation_proof_spec, transformation_proof_spec, (SubLObject)inference_tactician_strategic_uninterestingness.$list74);
        transformation_token = transformation_proof_spec.first();
        SubLObject current = transformation_proof_spec.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, transformation_proof_spec, (SubLObject)inference_tactician_strategic_uninterestingness.$list74);
        literal_spec = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, transformation_proof_spec, (SubLObject)inference_tactician_strategic_uninterestingness.$list74);
        transformation_module_spec = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, transformation_proof_spec, (SubLObject)inference_tactician_strategic_uninterestingness.$list74);
        rule_spec = current.first();
        current = current.rest();
        final SubLObject sub_spec = (SubLObject)(current.isCons() ? current.first() : inference_tactician_strategic_uninterestingness.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, transformation_proof_spec, (SubLObject)inference_tactician_strategic_uninterestingness.$list74);
        current = current.rest();
        if (inference_tactician_strategic_uninterestingness.NIL == current) {
            final SubLObject problem = inference_datastructures_tactic.tactic_problem(transformation_tactic);
            final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(transformation_tactic);
            final SubLObject rule = inference_worker_transformation.transformation_tactic_rule(transformation_tactic);
            return (SubLObject)SubLObjectFactory.makeBoolean(inference_tactician_strategic_uninterestingness.NIL != literal_spec_admits_single_literal_problemP(literal_spec, problem) && inference_tactician_strategic_uninterestingness.NIL != transformation_module_spec_admits_transformation_module(transformation_module_spec, hl_module) && (inference_tactician_strategic_uninterestingness.NIL == rule || inference_tactician_strategic_uninterestingness.NIL != rule_spec_admits_rule(rule_spec, rule)));
        }
        cdestructuring_bind.cdestructuring_bind_error(transformation_proof_spec, (SubLObject)inference_tactician_strategic_uninterestingness.$list74);
        return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 54838L)
    public static SubLObject ist_sentences_from_clause(final SubLObject clause) {
        SubLObject ist_sentences = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        SubLObject neg_lits = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        SubLObject pos_lits = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(clause, clause, (SubLObject)inference_tactician_strategic_uninterestingness.$list75);
        neg_lits = clause.first();
        SubLObject current = clause.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, clause, (SubLObject)inference_tactician_strategic_uninterestingness.$list75);
        pos_lits = current.first();
        current = current.rest();
        if (inference_tactician_strategic_uninterestingness.NIL == current) {
            SubLObject cdolist_list_var = neg_lits;
            SubLObject neg_lit = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
            neg_lit = cdolist_list_var.first();
            while (inference_tactician_strategic_uninterestingness.NIL != cdolist_list_var) {
                SubLObject current_$4;
                final SubLObject datum_$3 = current_$4 = neg_lit;
                SubLObject mt = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
                SubLObject sentence = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$4, datum_$3, (SubLObject)inference_tactician_strategic_uninterestingness.$list76);
                mt = current_$4.first();
                current_$4 = current_$4.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$4, datum_$3, (SubLObject)inference_tactician_strategic_uninterestingness.$list76);
                sentence = current_$4.first();
                current_$4 = current_$4.rest();
                if (inference_tactician_strategic_uninterestingness.NIL == current_$4) {
                    ist_sentences = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(inference_tactician_strategic_uninterestingness.$const77$ist, mt, (SubLObject)ConsesLow.list(inference_tactician_strategic_uninterestingness.$const78$not, sentence)), ist_sentences);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$3, (SubLObject)inference_tactician_strategic_uninterestingness.$list76);
                }
                cdolist_list_var = cdolist_list_var.rest();
                neg_lit = cdolist_list_var.first();
            }
            cdolist_list_var = pos_lits;
            SubLObject pos_lit = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
            pos_lit = cdolist_list_var.first();
            while (inference_tactician_strategic_uninterestingness.NIL != cdolist_list_var) {
                SubLObject current_$5;
                final SubLObject datum_$4 = current_$5 = pos_lit;
                SubLObject mt = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
                SubLObject sentence = (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$5, datum_$4, (SubLObject)inference_tactician_strategic_uninterestingness.$list76);
                mt = current_$5.first();
                current_$5 = current_$5.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$5, datum_$4, (SubLObject)inference_tactician_strategic_uninterestingness.$list76);
                sentence = current_$5.first();
                current_$5 = current_$5.rest();
                if (inference_tactician_strategic_uninterestingness.NIL == current_$5) {
                    ist_sentences = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(inference_tactician_strategic_uninterestingness.$const77$ist, mt, sentence), ist_sentences);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$4, (SubLObject)inference_tactician_strategic_uninterestingness.$list76);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pos_lit = cdolist_list_var.first();
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(clause, (SubLObject)inference_tactician_strategic_uninterestingness.$list75);
        }
        return Sequences.nreverse(ist_sentences);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 55333L)
    public static SubLObject single_literal_pattern_p(final SubLObject proof_spec_pattern) {
        return el_utilities.ist_sentence_p(proof_spec_pattern, (SubLObject)inference_tactician_strategic_uninterestingness.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 55445L)
    public static SubLObject literal_spec_admits_single_literal_problemP(final SubLObject literal_spec, final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject problem_mt = inference_datastructures_problem.mt_asent_sense_from_single_literal_problem(problem);
        final SubLObject problem_asent = thread.secondMultipleValue();
        final SubLObject problem_sense = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject spec_mt = mt_asent_sense_from_ist_literal(literal_spec);
        final SubLObject spec_asent = thread.secondMultipleValue();
        final SubLObject spec_sense = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return (SubLObject)SubLObjectFactory.makeBoolean(problem_sense.eql(spec_sense) && inference_tactician_strategic_uninterestingness.NIL != proof_spec_mt_spec_admits_mtP(spec_mt, problem_mt) && inference_tactician_strategic_uninterestingness.NIL != proof_spec_asent_spec_admits_asentP(spec_asent, problem_asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 55955L)
    public static SubLObject mt_asent_sense_from_ist_literal(final SubLObject ist_literal) {
        final SubLObject mt = cycl_utilities.formula_arg1(ist_literal, (SubLObject)inference_tactician_strategic_uninterestingness.UNPROVIDED);
        SubLObject asent = cycl_utilities.formula_arg2(ist_literal, (SubLObject)inference_tactician_strategic_uninterestingness.UNPROVIDED);
        SubLObject sense = (SubLObject)inference_tactician_strategic_uninterestingness.$kw79$POS;
        if (inference_tactician_strategic_uninterestingness.NIL != el_utilities.el_negation_p(asent)) {
            sense = (SubLObject)inference_tactician_strategic_uninterestingness.$kw80$NEG;
            asent = cycl_utilities.formula_arg1(asent, (SubLObject)inference_tactician_strategic_uninterestingness.UNPROVIDED);
        }
        return Values.values(mt, asent, sense);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 56253L)
    public static SubLObject removal_module_spec_admits_removal_module(final SubLObject removal_module_spec, final SubLObject hl_module) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_tactician_strategic_uninterestingness.NIL != inference_modules.removal_module_p(hl_module) && inference_tactician_strategic_uninterestingness.NIL != hl_module_spec_admits_hl_module(removal_module_spec, hl_module));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 56459L)
    public static SubLObject transformation_module_spec_admits_transformation_module(final SubLObject transformation_module_spec, final SubLObject hl_module) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_tactician_strategic_uninterestingness.NIL != inference_modules.transformation_module_p(hl_module) && inference_tactician_strategic_uninterestingness.NIL != hl_module_spec_admits_hl_module(transformation_module_spec, hl_module));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 56700L)
    public static SubLObject proof_spec_mt_spec_admits_mtP(final SubLObject spec_mt, final SubLObject mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_tactician_strategic_uninterestingness.NIL != unification.unify_possible(spec_mt, mt) || inference_tactician_strategic_uninterestingness.NIL != formula_pattern_match.pattern_matches_formula(spec_mt, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 56891L)
    public static SubLObject proof_spec_asent_spec_admits_asentP(final SubLObject spec_asent, final SubLObject problem_asent) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_tactician_strategic_uninterestingness.NIL != unification.unify_possible(spec_asent, problem_asent) || inference_tactician_strategic_uninterestingness.NIL != formula_pattern_match.pattern_matches_formula(spec_asent, problem_asent) || inference_tactician_strategic_uninterestingness.NIL != unification.unify_possible(conses_high.subst(variables.get_variable((SubLObject)inference_tactician_strategic_uninterestingness.ZERO_INTEGER), (SubLObject)inference_tactician_strategic_uninterestingness.$kw68$ANYTHING, spec_asent, (SubLObject)inference_tactician_strategic_uninterestingness.UNPROVIDED, (SubLObject)inference_tactician_strategic_uninterestingness.UNPROVIDED), problem_asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 57257L)
    public static SubLObject hl_module_spec_admits_hl_module(final SubLObject hl_module_spec, final SubLObject hl_module) {
        if (inference_tactician_strategic_uninterestingness.NIL != inference_modules.hl_module_p(hl_module)) {
            final SubLObject module_name = inference_modules.hl_module_name(hl_module);
            return pattern_match.pattern_matches_tree(hl_module_spec, module_name);
        }
        return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 57486L)
    public static SubLObject rule_spec_admits_rule(final SubLObject rule_spec, final SubLObject rule) {
        if (inference_tactician_strategic_uninterestingness.NIL != assertions_high.rule_assertionP(rule)) {
            return pattern_match.pattern_matches_tree(rule_spec, rule);
        }
        return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
    }
    
    public static SubLObject declare_inference_tactician_strategic_uninterestingness_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "the_unknown_strategy_uninterestingness_explanation_p", "THE-UNKNOWN-STRATEGY-UNINTERESTINGNESS-EXPLANATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "strategy_last_uninterestingness_explanation", "STRATEGY-LAST-UNINTERESTINGNESS-EXPLANATION", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "with_strategy_uninterestingness_explanations", "WITH-STRATEGY-UNINTERESTINGNESS-EXPLANATIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "without_strategy_uninterestingness_explanations", "WITHOUT-STRATEGY-UNINTERESTINGNESS-EXPLANATIONS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "strategy_note_uninterestingness_explanation", "STRATEGY-NOTE-UNINTERESTINGNESS-EXPLANATION", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "strategy_possibly_note_exact_uninterestingness_explanation", "STRATEGY-POSSIBLY-NOTE-EXACT-UNINTERESTINGNESS-EXPLANATION", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "strategy_possibly_note_uninterestingness_explanation", "STRATEGY-POSSIBLY-NOTE-UNINTERESTINGNESS-EXPLANATION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "strategy_possibly_un_note_uninterestingness_explanation", "STRATEGY-POSSIBLY-UN-NOTE-UNINTERESTINGNESS-EXPLANATION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "strategy_uninterestingness_explanation_string", "STRATEGY-UNINTERESTINGNESS-EXPLANATION-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "strategy_uninterestingness_explanation_type_p", "STRATEGY-UNINTERESTINGNESS-EXPLANATION-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "strategy_uninterestingness_explanation_p", "STRATEGY-UNINTERESTINGNESS-EXPLANATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "strategy_uninterestingness_subexplanation_p", "STRATEGY-UNINTERESTINGNESS-SUBEXPLANATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "make_strategy_uninterestingness_explanation", "MAKE-STRATEGY-UNINTERESTINGNESS-EXPLANATION", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "strategy_uninterestingness_explanation_type", "STRATEGY-UNINTERESTINGNESS-EXPLANATION-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "strategic_uninterestingness_reason_p", "STRATEGIC-UNINTERESTINGNESS-REASON-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "strategy_chooses_to_throw_away_problemP", "STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "why_strategy_chooses_to_throw_away_problem", "WHY-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "strategy_chooses_to_throw_away_tacticP", "STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "legacy_strategy_chooses_to_throw_away_tacticP", "LEGACY-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "legacy_strategy_chooses_to_ignore_tacticP", "LEGACY-STRATEGY-CHOOSES-TO-IGNORE-TACTIC?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "why_strategy_chooses_to_throw_away_tactic", "WHY-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "strategy_chooses_to_set_aside_problemP", "STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "why_strategy_chooses_to_set_aside_problem", "WHY-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "strategy_chooses_to_set_aside_tacticP", "STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "legacy_strategy_chooses_to_set_aside_tacticP", "LEGACY-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "why_strategy_chooses_to_set_aside_tactic", "WHY-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "strategy_chooses_to_ignore_tacticP", "STRATEGY-CHOOSES-TO-IGNORE-TACTIC?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "simple_strategy_chooses_to_throw_away_problemP", "SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "why_simple_strategy_chooses_to_throw_away_problem", "WHY-SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "simple_strategy_chooses_to_throw_away_problem_int", "SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "simple_strategy_chooses_to_throw_away_tacticP", "SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "why_simple_strategy_chooses_to_throw_away_tactic", "WHY-SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "simple_strategy_chooses_to_throw_away_tactic_int", "SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "problem_has_executed_a_complete_removal_tacticP", "PROBLEM-HAS-EXECUTED-A-COMPLETE-REMOVAL-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "lookahead_problem_has_executed_a_complete_removal_tacticP", "LOOKAHEAD-PROBLEM-HAS-EXECUTED-A-COMPLETE-REMOVAL-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "problem_or_lookahead_problem_has_executed_a_complete_removal_tacticP", "PROBLEM-OR-LOOKAHEAD-PROBLEM-HAS-EXECUTED-A-COMPLETE-REMOVAL-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "problem_has_executed_a_generalized_removal_tacticP", "PROBLEM-HAS-EXECUTED-A-GENERALIZED-REMOVAL-TACTIC?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "strategy_allows_use_of_tactic_hl_moduleP", "STRATEGY-ALLOWS-USE-OF-TACTIC-HL-MODULE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "strategy_allows_use_of_hl_moduleP", "STRATEGY-ALLOWS-USE-OF-HL-MODULE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "simple_strategy_chooses_to_set_aside_problemP", "SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "why_simple_strategy_chooses_to_set_aside_problem", "WHY-SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "simple_strategy_chooses_to_set_aside_problem_int", "SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "simple_strategy_chooses_to_set_aside_tacticP", "SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "why_simple_strategy_chooses_to_set_aside_tactic", "WHY-SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "simple_strategy_chooses_to_set_aside_tactic_int", "SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "simple_strategy_chooses_to_ignore_problemP", "SIMPLE-STRATEGY-CHOOSES-TO-IGNORE-PROBLEM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "simple_strategy_chooses_to_ignore_tacticP", "SIMPLE-STRATEGY-CHOOSES-TO-IGNORE-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "problem_strategically_pendingP", "PROBLEM-STRATEGICALLY-PENDING?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "strategy_deems_problem_tactically_uninterestingP", "STRATEGY-DEEMS-PROBLEM-TACTICALLY-UNINTERESTING?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "strategy_has_enough_proofs_for_problemP", "STRATEGY-HAS-ENOUGH-PROOFS-FOR-PROBLEM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "tactically_uninteresting_problem_p", "TACTICALLY-UNINTERESTING-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "strategy_deems_problem_strategically_uninterestingP", "STRATEGY-DEEMS-PROBLEM-STRATEGICALLY-UNINTERESTING?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "strategically_uninteresting_problem_p", "STRATEGICALLY-UNINTERESTING-PROBLEM-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "problem_has_relevant_supporting_problemP", "PROBLEM-HAS-RELEVANT-SUPPORTING-PROBLEM?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "problem_has_interesting_transformation_tacticsP", "PROBLEM-HAS-INTERESTING-TRANSFORMATION-TACTICS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "problem_no_tactics_strategically_possibleP", "PROBLEM-NO-TACTICS-STRATEGICALLY-POSSIBLE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "inference_chooses_to_set_aside_problemP", "INFERENCE-CHOOSES-TO-SET-ASIDE-PROBLEM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "why_inference_chooses_to_set_aside_problem", "WHY-INFERENCE-CHOOSES-TO-SET-ASIDE-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "inference_chooses_to_set_aside_problem_int", "INFERENCE-CHOOSES-TO-SET-ASIDE-PROBLEM-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "inference_chooses_to_throw_away_problemP", "INFERENCE-CHOOSES-TO-THROW-AWAY-PROBLEM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "why_inference_chooses_to_throw_away_problem", "WHY-INFERENCE-CHOOSES-TO-THROW-AWAY-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "inference_chooses_to_throw_away_problem_int", "INFERENCE-CHOOSES-TO-THROW-AWAY-PROBLEM-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "all_dependent_links_are_forbidden_transformationsP", "ALL-DEPENDENT-LINKS-ARE-FORBIDDEN-TRANSFORMATIONS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "transformation_forbidden_by_inferenceP", "TRANSFORMATION-FORBIDDEN-BY-INFERENCE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "inference_chooses_to_throw_away_all_transformations_on_problemP_internal", "INFERENCE-CHOOSES-TO-THROW-AWAY-ALL-TRANSFORMATIONS-ON-PROBLEM?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "inference_chooses_to_throw_away_all_transformations_on_problemP", "INFERENCE-CHOOSES-TO-THROW-AWAY-ALL-TRANSFORMATIONS-ON-PROBLEM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "why_inference_chooses_to_throw_away_all_transformations_on_problem", "WHY-INFERENCE-CHOOSES-TO-THROW-AWAY-ALL-TRANSFORMATIONS-ON-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "inference_chooses_to_throw_away_all_transformations_on_problem_int", "INFERENCE-CHOOSES-TO-THROW-AWAY-ALL-TRANSFORMATIONS-ON-PROBLEM-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "collection_backchain_encouraged_problemP", "COLLECTION-BACKCHAIN-ENCOURAGED-PROBLEM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "problem_uses_hl_predicateP", "PROBLEM-USES-HL-PREDICATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "problem_uses_evaluatable_predicateP", "PROBLEM-USES-EVALUATABLE-PREDICATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "simple_strategy_deems_rewrite_tactic_redundantP", "SIMPLE-STRATEGY-DEEMS-REWRITE-TACTIC-REDUNDANT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "tactic_exceeds_productivity_limitP", "TACTIC-EXCEEDS-PRODUCTIVITY-LIMIT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "simple_strategy_chooses_to_set_aside_transformation_tacticP", "SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-TRANSFORMATION-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "why_simple_strategy_chooses_to_set_aside_transformation_tactic", "WHY-SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-TRANSFORMATION-TACTIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "simple_strategy_chooses_to_set_aside_transformation_tactic_int", "SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-TRANSFORMATION-TACTIC-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "inference_chooses_to_set_aside_transformation_tacticP", "INFERENCE-CHOOSES-TO-SET-ASIDE-TRANSFORMATION-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "why_inference_chooses_to_set_aside_transformation_tactic", "WHY-INFERENCE-CHOOSES-TO-SET-ASIDE-TRANSFORMATION-TACTIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "inference_chooses_to_set_aside_transformation_tactic_int", "INFERENCE-CHOOSES-TO-SET-ASIDE-TRANSFORMATION-TACTIC-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "simple_strategy_chooses_to_throw_away_transformation_tacticP_internal", "SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "simple_strategy_chooses_to_throw_away_transformation_tacticP", "SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "why_simple_strategy_chooses_to_throw_away_transformation_tactic", "WHY-SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "simple_strategy_chooses_to_throw_away_transformation_tactic_int", "SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "inference_chooses_to_throw_away_transformation_tacticP", "INFERENCE-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "why_inference_chooses_to_throw_away_transformation_tactic", "WHY-INFERENCE-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "inference_chooses_to_throw_away_transformation_tactic_int", "INFERENCE-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "strategy_disallows_use_of_hl_module_on_problemP", "STRATEGY-DISALLOWS-USE-OF-HL-MODULE-ON-PROBLEM?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "tactic_requires_hl_predicate_transformationP", "TACTIC-REQUIRES-HL-PREDICATE-TRANSFORMATION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "hl_module_requires_hl_predicate_transformationP", "HL-MODULE-REQUIRES-HL-PREDICATE-TRANSFORMATION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "collection_backchain_encouraged_tacticP", "COLLECTION-BACKCHAIN-ENCOURAGED-TACTIC?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "collection_backchain_encouraged_asentP", "COLLECTION-BACKCHAIN-ENCOURAGED-ASENT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "tactic_problem_uses_hl_predicateP", "TACTIC-PROBLEM-USES-HL-PREDICATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "transformation_tactic_only_applies_to_hl_predicatesP", "TRANSFORMATION-TACTIC-ONLY-APPLIES-TO-HL-PREDICATES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "hl_module_only_applies_to_hl_predicatesP", "HL-MODULE-ONLY-APPLIES-TO-HL-PREDICATES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "tactic_requires_unbound_predicate_transformationP", "TACTIC-REQUIRES-UNBOUND-PREDICATE-TRANSFORMATION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "hl_module_requires_unbound_predicate_transformationP", "HL-MODULE-REQUIRES-UNBOUND-PREDICATE-TRANSFORMATION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "tactic_requires_evaluatable_predicate_transformationP", "TACTIC-REQUIRES-EVALUATABLE-PREDICATE-TRANSFORMATION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "tactic_completeP", "TACTIC-COMPLETE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "tactic_incompleteP", "TACTIC-INCOMPLETE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "tactic_impossibleP", "TACTIC-IMPOSSIBLE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "tactic_preferredP", "TACTIC-PREFERRED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "tactic_dispreferredP", "TACTIC-DISPREFERRED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "tactic_disallowedP", "TACTIC-DISALLOWED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "tactic_doomedP", "TACTIC-DOOMED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "tactic_disallowed_or_doomedP", "TACTIC-DISALLOWED-OR-DOOMED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "problem_has_executed_a_complete_tacticP", "PROBLEM-HAS-EXECUTED-A-COMPLETE-TACTIC?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "lookahead_problem_has_executed_a_complete_tacticP", "LOOKAHEAD-PROBLEM-HAS-EXECUTED-A-COMPLETE-TACTIC?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "problem_or_lookahead_problem_has_executed_a_complete_tacticP", "PROBLEM-OR-LOOKAHEAD-PROBLEM-HAS-EXECUTED-A-COMPLETE-TACTIC?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "problem_has_executed_a_preferred_tacticP", "PROBLEM-HAS-EXECUTED-A-PREFERRED-TACTIC?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "problem_has_executed_a_tactic_of_typeP", "PROBLEM-HAS-EXECUTED-A-TACTIC-OF-TYPE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "strategy_admits_tactic_wrt_proof_specP", "STRATEGY-ADMITS-TACTIC-WRT-PROOF-SPEC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "strategy_admits_all_tactics_wrt_proof_specP", "STRATEGY-ADMITS-ALL-TACTICS-WRT-PROOF-SPEC?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "proof_spec_admits_tacticP", "PROOF-SPEC-ADMITS-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "meta_tactic_p", "META-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "disjunctive_proof_spec_admits_tacticP", "DISJUNCTIVE-PROOF-SPEC-ADMITS-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "proof_spec_admits_removal_tacticP", "PROOF-SPEC-ADMITS-REMOVAL-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "proof_spec_admits_join_ordered_tacticP", "PROOF-SPEC-ADMITS-JOIN-ORDERED-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "proof_spec_admits_join_tacticP", "PROOF-SPEC-ADMITS-JOIN-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "proof_spec_admits_split_tacticP", "PROOF-SPEC-ADMITS-SPLIT-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "proof_spec_admits_simplification_tacticP", "PROOF-SPEC-ADMITS-SIMPLIFICATION-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "proof_spec_admits_conjuctive_removal_tacticP", "PROOF-SPEC-ADMITS-CONJUCTIVE-REMOVAL-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "proof_spec_admits_transformation_tacticP", "PROOF-SPEC-ADMITS-TRANSFORMATION-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "proof_spec_admits_union_tacticP", "PROOF-SPEC-ADMITS-UNION-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "removal_proof_spec_admits_removal_tacticP", "REMOVAL-PROOF-SPEC-ADMITS-REMOVAL-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "restriction_proof_spec_admits_removal_tacticP", "RESTRICTION-PROOF-SPEC-ADMITS-REMOVAL-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "split_proof_spec_admits_split_proof_tacticP", "SPLIT-PROOF-SPEC-ADMITS-SPLIT-PROOF-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "restriction_proof_spec_admits_simplification_tacticP", "RESTRICTION-PROOF-SPEC-ADMITS-SIMPLIFICATION-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "conjunctive_removal_proof_spec_admits_conjunctive_removal_tacticP", "CONJUNCTIVE-REMOVAL-PROOF-SPEC-ADMITS-CONJUNCTIVE-REMOVAL-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "join_ordered_proof_spec_admits_join_ordered_tacticP", "JOIN-ORDERED-PROOF-SPEC-ADMITS-JOIN-ORDERED-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "union_proof_spec_admits_union_tacticP", "UNION-PROOF-SPEC-ADMITS-UNION-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "residual_transformation_proof_spec_admits_join_ordered_tacticP", "RESIDUAL-TRANSFORMATION-PROOF-SPEC-ADMITS-JOIN-ORDERED-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "join_proof_spec_admits_join_tacticP", "JOIN-PROOF-SPEC-ADMITS-JOIN-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "transformation_proof_spec_admits_transformation_tacticP", "TRANSFORMATION-PROOF-SPEC-ADMITS-TRANSFORMATION-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "ist_sentences_from_clause", "IST-SENTENCES-FROM-CLAUSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "single_literal_pattern_p", "SINGLE-LITERAL-PATTERN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "literal_spec_admits_single_literal_problemP", "LITERAL-SPEC-ADMITS-SINGLE-LITERAL-PROBLEM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "mt_asent_sense_from_ist_literal", "MT-ASENT-SENSE-FROM-IST-LITERAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "removal_module_spec_admits_removal_module", "REMOVAL-MODULE-SPEC-ADMITS-REMOVAL-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "transformation_module_spec_admits_transformation_module", "TRANSFORMATION-MODULE-SPEC-ADMITS-TRANSFORMATION-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "proof_spec_mt_spec_admits_mtP", "PROOF-SPEC-MT-SPEC-ADMITS-MT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "proof_spec_asent_spec_admits_asentP", "PROOF-SPEC-ASENT-SPEC-ADMITS-ASENT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "hl_module_spec_admits_hl_module", "HL-MODULE-SPEC-ADMITS-HL-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness", "rule_spec_admits_rule", "RULE-SPEC-ADMITS-RULE", 2, 0, false);
        return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
    }
    
    public static SubLObject init_inference_tactician_strategic_uninterestingness_file() {
        inference_tactician_strategic_uninterestingness.$strategy_uninterestingness_explanation$ = SubLFiles.defparameter("*STRATEGY-UNINTERESTINGNESS-EXPLANATION*", (SubLObject)inference_tactician_strategic_uninterestingness.$kw0$UNINITIALIZED);
        inference_tactician_strategic_uninterestingness.$the_unknown_strategy_uninterestingness_explanation$ = SubLFiles.deflexical("*THE-UNKNOWN-STRATEGY-UNINTERESTINGNESS-EXPLANATION*", (SubLObject)inference_tactician_strategic_uninterestingness.$list1);
        inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$ = SubLFiles.defparameter("*STRATEGY-GATHERING-UNINTERESTINGNESS-EXPLANATIONS?*", (SubLObject)inference_tactician_strategic_uninterestingness.NIL);
        inference_tactician_strategic_uninterestingness.$strategy_uninterestingness_explanation_table$ = SubLFiles.deflexical("*STRATEGY-UNINTERESTINGNESS-EXPLANATION-TABLE*", (SubLObject)inference_tactician_strategic_uninterestingness.$list17);
        return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
    }
    
    public static SubLObject setup_inference_tactician_strategic_uninterestingness_file() {
        access_macros.register_macro_helper((SubLObject)inference_tactician_strategic_uninterestingness.$sym5$STRATEGY_NOTE_UNINTERESTINGNESS_EXPLANATION, (SubLObject)inference_tactician_strategic_uninterestingness.$sym6$STRATEGY_POSSIBLY_NOTE_UNINTERESTINGNESS_EXPLANATION);
        memoization_state.note_memoized_function((SubLObject)inference_tactician_strategic_uninterestingness.$sym43$INFERENCE_CHOOSES_TO_THROW_AWAY_ALL_TRANSFORMATIONS_ON_PROBLEM_);
        memoization_state.note_memoized_function((SubLObject)inference_tactician_strategic_uninterestingness.$sym48$SIMPLE_STRATEGY_CHOOSES_TO_THROW_AWAY_TRANSFORMATION_TACTIC_);
        return (SubLObject)inference_tactician_strategic_uninterestingness.NIL;
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
        me = (SubLFile)new inference_tactician_strategic_uninterestingness();
        inference_tactician_strategic_uninterestingness.$strategy_uninterestingness_explanation$ = null;
        inference_tactician_strategic_uninterestingness.$the_unknown_strategy_uninterestingness_explanation$ = null;
        inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$ = null;
        inference_tactician_strategic_uninterestingness.$strategy_uninterestingness_explanation_table$ = null;
        $kw0$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UNKNOWN-REASON"), (SubLObject)inference_tactician_strategic_uninterestingness.NIL, (SubLObject)inference_tactician_strategic_uninterestingness.NIL, (SubLObject)inference_tactician_strategic_uninterestingness.NIL, (SubLObject)inference_tactician_strategic_uninterestingness.NIL);
        $sym2$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list3 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*STRATEGY-UNINTERESTINGNESS-EXPLANATION*"), (SubLObject)inference_tactician_strategic_uninterestingness.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*STRATEGY-GATHERING-UNINTERESTINGNESS-EXPLANATIONS?*"), (SubLObject)inference_tactician_strategic_uninterestingness.T));
        $list4 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*STRATEGY-GATHERING-UNINTERESTINGNESS-EXPLANATIONS?*"), (SubLObject)inference_tactician_strategic_uninterestingness.NIL));
        $sym5$STRATEGY_NOTE_UNINTERESTINGNESS_EXPLANATION = SubLObjectFactory.makeSymbol("STRATEGY-NOTE-UNINTERESTINGNESS-EXPLANATION");
        $sym6$STRATEGY_POSSIBLY_NOTE_UNINTERESTINGNESS_EXPLANATION = SubLObjectFactory.makeSymbol("STRATEGY-POSSIBLY-NOTE-UNINTERESTINGNESS-EXPLANATION");
        $sym7$STRATEGY_UNINTERESTINGNESS_EXPLANATION_P = SubLObjectFactory.makeSymbol("STRATEGY-UNINTERESTINGNESS-EXPLANATION-P");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXPLANATION-TYPE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM"), (SubLObject)SubLObjectFactory.makeSymbol("TACTIC"), (SubLObject)SubLObjectFactory.makeSymbol("LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SUBEXPLANATION")));
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROBLEM"), (SubLObject)SubLObjectFactory.makeKeyword("TACTIC"), (SubLObject)SubLObjectFactory.makeKeyword("LINK"), (SubLObject)SubLObjectFactory.makeKeyword("SUBEXPLANATION"));
        $kw10$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw11$PROBLEM = SubLObjectFactory.makeKeyword("PROBLEM");
        $kw12$TACTIC = SubLObjectFactory.makeKeyword("TACTIC");
        $kw13$LINK = SubLObjectFactory.makeKeyword("LINK");
        $kw14$SUBEXPLANATION = SubLObjectFactory.makeKeyword("SUBEXPLANATION");
        $sym15$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym16$_STRATEGY_GATHERING_UNINTERESTINGNESS_EXPLANATIONS__ = SubLObjectFactory.makeSymbol("*STRATEGY-GATHERING-UNINTERESTINGNESS-EXPLANATIONS?*");
        $list17 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STRATEGY-THROWS-AWAY-ALL-TRANSFORMATION"), (SubLObject)SubLObjectFactory.makeString(":strategy does not permit transformation at all")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STRATEGY-SETS-ASIDE-ALL-TRANSFORMATION"), (SubLObject)SubLObjectFactory.makeString(":strategy does not permit transformation with the current resource constraints")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROBLEM-ALREADY-THROWN-AWAY"), (SubLObject)SubLObjectFactory.makeString(":problem was already noted to be pending")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROBLEM-HAS-NO-TRANSFORMATION-TACTICS"), (SubLObject)SubLObjectFactory.makeString(":problem has no transformation tactics")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROBLEM-STRATEGY-NOT-CONTINUABLE"), (SubLObject)SubLObjectFactory.makeString(":strategy is not continuable, and :problem was set aside because :subexplanation")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROBLEM-HAS-NO-MORE-ACTIVE-REMOVAL-STRATEGEMS"), (SubLObject)SubLObjectFactory.makeString(":problem has deactivated all its active removal strategems")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROBLEM-HAS-NO-MORE-ACTIVE-TRANSFORMATION-STRATEGEMS"), (SubLObject)SubLObjectFactory.makeString(":problem has deactivated all its active transformation strategems")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROBLEM-HAS-NO-ACTIVATIBLE-REMOVAL-STRATEGEMS"), (SubLObject)SubLObjectFactory.makeString("when determining removal strategems for :problem, :strategy found none it wished to activate")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROBLEM-HAS-NO-ACTIVATIBLE-TRANSFORMATION-STRATEGEMS"), (SubLObject)SubLObjectFactory.makeString("when determining transformation strategems for :problem, :strategy found none it wished to activate")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROBLEM-HAS-NON-ABDUCIBLE-RULE-TRANSFORMATION-LINK"), (SubLObject)SubLObjectFactory.makeString("rules associated with tranformation links for :problem were #$NonAbducibleRule so :strategy discarded the abduction strategm")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONT-DO-ABDUCTION-ON-GOOD-PROBLEM"), (SubLObject)SubLObjectFactory.makeString("problem :problem already deemed good so :strategy discarded the abduction strategm")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONT-TRANSFORM-ON-PROBLEM-WITH-ABDUCED-TERM"), (SubLObject)SubLObjectFactory.makeString("problem :problem has an abduced term so :strategy discarded problem wrt transformation")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL-TACTICS-THROWN-AWAY"), (SubLObject)SubLObjectFactory.makeString("all of :problem's tactics are thrown away")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NEW-ROOT-PENDING-WRT-MOTIVATION"), (SubLObject)SubLObjectFactory.makeString(":problem has already propagated both R and T")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROBLEM-ALREADY-SET-ASIDE"), (SubLObject)SubLObjectFactory.makeString(":problem was already noted to be set aside")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL-TACTICS-SET-ASIDE"), (SubLObject)SubLObjectFactory.makeString("all of :problem's tactics are set aside")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TACTIC-ALREADY-THROWN-AWAY"), (SubLObject)SubLObjectFactory.makeString(":tactic was already noted to be finished")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-PROBLEM-THROWN-AWAY"), (SubLObject)SubLObjectFactory.makeString(":tactic is thrown away because :subexplanation")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TACTIC-HL-MODULE-THROWN-AWAY"), (SubLObject)SubLObjectFactory.makeString(":tactic uses module :tactic-hl-module, which is always thrown away")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-LOOKAHEAD-PROBLEM-THROWN-AWAY"), (SubLObject)SubLObjectFactory.makeString("executing :tactic would motivate a problem that is thrown away because :subexplanation")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SPLIT-TACTIC-THROWN-AWAY-BECAUSE-SIBLING-TACTIC-THROWN-AWAY"), (SubLObject)SubLObjectFactory.makeString(":tactic has a sibling split tactic that is thrown away because :subexplanation")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TACTIC-STRATEGY-NOT-CONTINUABLE"), (SubLObject)SubLObjectFactory.makeString(":strategy is not continuable, and :tactic was set aside because :subexplanation")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("META-REMOVAL-TACTIC-THROWN-AWAY"), (SubLObject)SubLObjectFactory.makeString(":tactic is a meta-removal tactic, and some other tactically possible tactics on the problem are strategically disallowed")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-COMPLETE-SIBLING-CONJUNCTIVE-REMOVAL"), (SubLObject)SubLObjectFactory.makeString(":tactic has a sibling conjunctive removal tactic that is complete")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-SIBLING-BACKCHAIN-REQUIRED"), (SubLObject)SubLObjectFactory.makeString(":tactic has a sibling join-ordered tactic that focuses on a backchain required problem")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-SIBLING-IS-A-SIMPLIFICATION"), (SubLObject)SubLObjectFactory.makeString(":tactic has a sibling tactic that is a simplification")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-PROBLEM-HAS-EARLY-REMOVAL"), (SubLObject)SubLObjectFactory.makeString(":tactic is thrown away because the problem has an early removal tactic")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TACTIC-ALREADY-SET-ASIDE"), (SubLObject)SubLObjectFactory.makeString(":tactic was already noted to be set aside")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TACTIC-SET-ASIDE-BECAUSE-PROBLEM-SET-ASIDE"), (SubLObject)SubLObjectFactory.makeString(":tactic is set aside because :subexplanation")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TACTIC-GENERATED-ENOUGH"), (SubLObject)SubLObjectFactory.makeString(":tactic has already generated enough transformation tactics")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TACTIC-SET-ASIDE-BECAUSE-LOOKAHEAD-PROBLEM-SET-ASIDE"), (SubLObject)SubLObjectFactory.makeString("executing :tactic would motivate a problem that is set aside because :subexplanation")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SPLIT-TACTIC-SET-ASIDE-BECAUSE-SIBLING-TACTIC-THROWN-AWAY"), (SubLObject)SubLObjectFactory.makeString(":tactic has a sibling split tactic that is thrown away because :subexplanation")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SPLIT-TACTIC-SET-ASIDE-BECAUSE-SIBLING-TACTIC-SET-ASIDE"), (SubLObject)SubLObjectFactory.makeString(":tactic has a sibling split tactic that is set aside wrt both removal and transformation, because :subexplanation")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LOGICAL-TACTIC-EXCEEDS-MAX-TRANSFORMATION-DEPTH"), (SubLObject)SubLObjectFactory.makeString(":tactic leads past the :max-transformation-depth")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("JOIN-ORDERED-TACTIC-LEADS-TO-SET-ASIDE-CONJUNCTIVE-REMOVALS"), (SubLObject)SubLObjectFactory.makeString(":tactic leads to a conjunctive focal problem where all conjunctive removals are set aside")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LINK-SUPPORTED-PROBLEM-THROWN-AWAY"), (SubLObject)SubLObjectFactory.makeString(":link's supported problem is thrown away because :subexplanation")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SIBLING-EARLY-REMOVAL-LINK"), (SubLObject)SubLObjectFactory.makeString(":link has a sibling link :subexplanation")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EARLY-REMOVAL-LINK"), (SubLObject)SubLObjectFactory.makeString(":link, which is an early removal link")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LINK-RULE-DISALLOWED"), (SubLObject)SubLObjectFactory.makeString(":link uses a disallowed rule")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LINK-SUPPORTED-PROBLEM-SET-ASIDE"), (SubLObject)SubLObjectFactory.makeString(":link's supported problem is set aside because :subexplanation")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LINK-EXCEEDS-MAX-TRANSFORMATION-DEPTH"), (SubLObject)SubLObjectFactory.makeString(":link leads past the :max-transformation-depth")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UNKNOWN-REASON"), (SubLObject)SubLObjectFactory.makeString("an unknown reason")) });
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM"), (SubLObject)SubLObjectFactory.makeSymbol("TACTIC"), (SubLObject)SubLObjectFactory.makeSymbol("LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SUBEXPLANATION"));
        $sym19$STRATEGY_UNINTERESTINGNESS_EXPLANATION_TYPE_P = SubLObjectFactory.makeSymbol("STRATEGY-UNINTERESTINGNESS-EXPLANATION-TYPE-P");
        $sym20$PROBLEM_P = SubLObjectFactory.makeSymbol("PROBLEM-P");
        $sym21$TACTIC_P = SubLObjectFactory.makeSymbol("TACTIC-P");
        $sym22$PROBLEM_LINK_P = SubLObjectFactory.makeSymbol("PROBLEM-LINK-P");
        $list23 = ConsesLow.list((SubLObject)inference_tactician_strategic_uninterestingness.NIL, (SubLObject)SubLObjectFactory.makeKeyword("SET-ASIDE"), (SubLObject)SubLObjectFactory.makeKeyword("THROW-AWAY"), (SubLObject)SubLObjectFactory.makeKeyword("IRRELEVANT"));
        $kw24$THROW_AWAY_PROBLEM = SubLObjectFactory.makeKeyword("THROW-AWAY-PROBLEM");
        $kw25$THROW_AWAY_TACTIC = SubLObjectFactory.makeKeyword("THROW-AWAY-TACTIC");
        $kw26$SET_ASIDE_PROBLEM = SubLObjectFactory.makeKeyword("SET-ASIDE-PROBLEM");
        $kw27$SET_ASIDE_TACTIC = SubLObjectFactory.makeKeyword("SET-ASIDE-TACTIC");
        $str28$problem_is_tactically_uninteresti = SubLObjectFactory.makeString("problem is tactically uninteresting");
        $str29$strategy_has_enough_proofs_for_pr = SubLObjectFactory.makeString("strategy has enough proofs for problem");
        $str30$inference_is_not_continuable__and = SubLObjectFactory.makeString("inference is not continuable, and ");
        $str31$tactic_is_discarded = SubLObjectFactory.makeString("tactic is discarded");
        $str32$non_good_problem_has_already_exec = SubLObjectFactory.makeString("non-good problem has already executed a complete removal tactic");
        $str33$rewrite_tactic_is_redundant = SubLObjectFactory.makeString("rewrite tactic is redundant");
        $str34$HL_module_is_forbidden = SubLObjectFactory.makeString("HL module is forbidden");
        $str35$the_rule_for_this_tactic_has_an_i = SubLObjectFactory.makeString("the rule for this tactic has an insuffiently high historical utility");
        $kw36$GENERALIZED_REMOVAL = SubLObjectFactory.makeKeyword("GENERALIZED-REMOVAL");
        $str37$problem_is_strategically_no_good = SubLObjectFactory.makeString("problem is strategically no-good");
        $str38$tactic_exceeds_productivity_limit = SubLObjectFactory.makeString("tactic exceeds productivity limit");
        $sym39$STRATEGIC_CONTEXT_P = SubLObjectFactory.makeSymbol("STRATEGIC-CONTEXT-P");
        $kw40$TRANSFORMATION = SubLObjectFactory.makeKeyword("TRANSFORMATION");
        $str41$problem_exceeds_max_proof_depth = SubLObjectFactory.makeString("problem exceeds max proof depth");
        $str42$proof_checker_mode_is_enabled_and = SubLObjectFactory.makeString("proof checker mode is enabled and no allowed rules were used to link to this problem");
        $sym43$INFERENCE_CHOOSES_TO_THROW_AWAY_ALL_TRANSFORMATIONS_ON_PROBLEM_ = SubLObjectFactory.makeSymbol("INFERENCE-CHOOSES-TO-THROW-AWAY-ALL-TRANSFORMATIONS-ON-PROBLEM?");
        $str44$problem_uses_an_HL_predicate__HL_ = SubLObjectFactory.makeString("problem uses an HL predicate, HL and unbound predicate transformation are forbidden, and #$collectionBackchainEncouraged does not apply");
        $str45$problem_uses_an_evaluatable_predi = SubLObjectFactory.makeString("problem uses an evaluatable predicate and evaluatable predicate transformation is forbidden");
        $kw46$REWRITE = SubLObjectFactory.makeKeyword("REWRITE");
        $str47$problem_exceeds_max_transformatio = SubLObjectFactory.makeString("problem exceeds max transformation depth");
        $sym48$SIMPLE_STRATEGY_CHOOSES_TO_THROW_AWAY_TRANSFORMATION_TACTIC_ = SubLObjectFactory.makeSymbol("SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC?");
        $str49$proof_checker_mode_is_enabled__an = SubLObjectFactory.makeString("proof checker mode is enabled, and the rule for this tactic is forbidden");
        $str50$tactic_requires_HL_predicate_tran = SubLObjectFactory.makeString("tactic requires HL predicate transformation, which is forbidden");
        $str51$tactic_requires_unbound_predicate = SubLObjectFactory.makeString("tactic requires unbound predicate transformation, which is forbidden");
        $str52$tactic_requires_evaluatable_predi = SubLObjectFactory.makeString("tactic requires evaluatable predicate transformation, which is forbidden");
        $list53 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")));
        $const54$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const55$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $kw56$COMPLETE = SubLObjectFactory.makeKeyword("COMPLETE");
        $kw57$INCOMPLETE = SubLObjectFactory.makeKeyword("INCOMPLETE");
        $kw58$IMPOSSIBLE = SubLObjectFactory.makeKeyword("IMPOSSIBLE");
        $kw59$PREFERRED = SubLObjectFactory.makeKeyword("PREFERRED");
        $kw60$DISPREFERRED = SubLObjectFactory.makeKeyword("DISPREFERRED");
        $kw61$DISALLOWED = SubLObjectFactory.makeKeyword("DISALLOWED");
        $kw62$DOOMED = SubLObjectFactory.makeKeyword("DOOMED");
        $kw63$CONTENT = SubLObjectFactory.makeKeyword("CONTENT");
        $kw64$EXECUTED = SubLObjectFactory.makeKeyword("EXECUTED");
        $kw65$JOIN_ORDERED = SubLObjectFactory.makeKeyword("JOIN-ORDERED");
        $kw66$JOIN = SubLObjectFactory.makeKeyword("JOIN");
        $kw67$LOGICAL = SubLObjectFactory.makeKeyword("LOGICAL");
        $kw68$ANYTHING = SubLObjectFactory.makeKeyword("ANYTHING");
        $kw69$NOTHING = SubLObjectFactory.makeKeyword("NOTHING");
        $str70$Time_to_support_proof_spec_admitt = SubLObjectFactory.makeString("Time to support proof-spec admittance on ~S tactics");
        $list71 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("SUB-SPECS"));
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-TOKEN"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-MODULE-SPEC"));
        $list73 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESTRICTION-TOKEN"), (SubLObject)SubLObjectFactory.makeSymbol("SUB-SPEC"));
        $list74 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRANSFORMATION-TOKEN"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSFORMATION-MODULE-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("RULE-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("SUB-SPEC"));
        $list75 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEG-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("POS-LITS"));
        $list76 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"));
        $const77$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $const78$not = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not"));
        $kw79$POS = SubLObjectFactory.makeKeyword("POS");
        $kw80$NEG = SubLObjectFactory.makeKeyword("NEG");
    }
}

/*

	Total time: 401 ms
	 synthetic 
*/