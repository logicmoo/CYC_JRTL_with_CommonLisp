/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_negation_p;
import static com.cyc.cycjava.cycl.el_utilities.ist_sentence_p;
import static com.cyc.cycjava.cycl.inference.harness.inference_analysis.transformation_rule_has_insufficient_historical_utilityP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.zerop;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.cycl_utilities;
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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      INFERENCE-TACTICIAN-STRATEGIC-UNINTERESTINGNESS
 * source file: /cyc/top/cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp
 * created:     2019/07/03 17:37:40
 */
public final class inference_tactician_strategic_uninterestingness extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt7$ = makeString("");

    public static final SubLFile me = new inference_tactician_strategic_uninterestingness();



    // defparameter
    /**
     * Dynamic variable for remembering the most recent explanation of strategic
     * uninterestingness
     */
    @LispMethod(comment = "Dynamic variable for remembering the most recent explanation of strategic\r\nuninterestingness\ndefparameter\nDynamic variable for remembering the most recent explanation of strategic\nuninterestingness")
    private static final SubLSymbol $strategy_uninterestingness_explanation$ = makeSymbol("*STRATEGY-UNINTERESTINGNESS-EXPLANATION*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $the_unknown_strategy_uninterestingness_explanation$ = makeSymbol("*THE-UNKNOWN-STRATEGY-UNINTERESTINGNESS-EXPLANATION*");



    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $strategy_uninterestingness_explanation_table$ = makeSymbol("*STRATEGY-UNINTERESTINGNESS-EXPLANATION-TABLE*");

    private static final SubLList $list1 = list(makeKeyword("UNKNOWN-REASON"), NIL, NIL, NIL, NIL);

    private static final SubLList $list3 = list(list(makeSymbol("*STRATEGY-UNINTERESTINGNESS-EXPLANATION*"), NIL), list(makeSymbol("*STRATEGY-GATHERING-UNINTERESTINGNESS-EXPLANATIONS?*"), T));

    private static final SubLList $list4 = list(list(makeSymbol("*STRATEGY-GATHERING-UNINTERESTINGNESS-EXPLANATIONS?*"), NIL));

    private static final SubLSymbol STRATEGY_NOTE_UNINTERESTINGNESS_EXPLANATION = makeSymbol("STRATEGY-NOTE-UNINTERESTINGNESS-EXPLANATION");

    private static final SubLSymbol STRATEGY_POSSIBLY_NOTE_UNINTERESTINGNESS_EXPLANATION = makeSymbol("STRATEGY-POSSIBLY-NOTE-UNINTERESTINGNESS-EXPLANATION");

    private static final SubLSymbol STRATEGY_UNINTERESTINGNESS_EXPLANATION_P = makeSymbol("STRATEGY-UNINTERESTINGNESS-EXPLANATION-P");

    private static final SubLList $list8 = list(makeSymbol("EXPLANATION-TYPE"), list(makeSymbol("&KEY"), makeSymbol("PROBLEM"), makeSymbol("TACTIC"), makeSymbol("LINK"), makeSymbol("SUBEXPLANATION")));

    private static final SubLList $list9 = list(makeKeyword("PROBLEM"), makeKeyword("TACTIC"), $LINK, makeKeyword("SUBEXPLANATION"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    public static final SubLSymbol $strategy_gathering_uninterestingness_explanationsP$ = makeSymbol("*STRATEGY-GATHERING-UNINTERESTINGNESS-EXPLANATIONS?*");

    private static final SubLList $list17 = list(new SubLObject[]{ list(makeKeyword("STRATEGY-THROWS-AWAY-ALL-TRANSFORMATION"), makeString(":strategy does not permit transformation at all")), list(makeKeyword("STRATEGY-SETS-ASIDE-ALL-TRANSFORMATION"), makeString(":strategy does not permit transformation with the current resource constraints")), list(makeKeyword("PROBLEM-ALREADY-THROWN-AWAY"), makeString(":problem was already noted to be pending")), list(makeKeyword("PROBLEM-HAS-NO-TRANSFORMATION-TACTICS"), makeString(":problem has no transformation tactics")), list(makeKeyword("PROBLEM-STRATEGY-NOT-CONTINUABLE"), makeString(":strategy is not continuable, and :problem was set aside because :subexplanation")), list(makeKeyword("PROBLEM-HAS-NO-MORE-ACTIVE-REMOVAL-STRATEGEMS"), makeString(":problem has deactivated all its active removal strategems")), list(makeKeyword("PROBLEM-HAS-NO-MORE-ACTIVE-TRANSFORMATION-STRATEGEMS"), makeString(":problem has deactivated all its active transformation strategems")), list(makeKeyword("PROBLEM-HAS-NO-ACTIVATIBLE-REMOVAL-STRATEGEMS"), makeString("when determining removal strategems for :problem, :strategy found none it wished to activate")), list(makeKeyword("PROBLEM-HAS-NO-ACTIVATIBLE-TRANSFORMATION-STRATEGEMS"), makeString("when determining transformation strategems for :problem, :strategy found none it wished to activate")), list(makeKeyword("PROBLEM-HAS-NON-ABDUCIBLE-RULE-TRANSFORMATION-LINK"), makeString("rules associated with tranformation links for :problem were #$NonAbducibleRule so :strategy discarded the abduction strategm")), list(makeKeyword("DONT-DO-ABDUCTION-ON-GOOD-PROBLEM"), makeString("problem :problem already deemed good so :strategy discarded the abduction strategm")), list(makeKeyword("DONT-TRANSFORM-ON-PROBLEM-WITH-ABDUCED-TERM"), makeString("problem :problem has an abduced term so :strategy discarded problem wrt transformation")), list(makeKeyword("ALL-TACTICS-THROWN-AWAY"), makeString("all of :problem's tactics are thrown away")), list(makeKeyword("NEW-ROOT-PENDING-WRT-MOTIVATION"), makeString(":problem has already propagated both R and T")), list(makeKeyword("PROBLEM-ALREADY-SET-ASIDE"), makeString(":problem was already noted to be set aside")), list(makeKeyword("ALL-TACTICS-SET-ASIDE"), makeString("all of :problem's tactics are set aside")), list(makeKeyword("TACTIC-ALREADY-THROWN-AWAY"), makeString(":tactic was already noted to be finished")), list(makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-PROBLEM-THROWN-AWAY"), makeString(":tactic is thrown away because :subexplanation")), list(makeKeyword("TACTIC-HL-MODULE-THROWN-AWAY"), makeString(":tactic uses module :tactic-hl-module, which is always thrown away")), list(makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-LOOKAHEAD-PROBLEM-THROWN-AWAY"), makeString("executing :tactic would motivate a problem that is thrown away because :subexplanation")), list(makeKeyword("SPLIT-TACTIC-THROWN-AWAY-BECAUSE-SIBLING-TACTIC-THROWN-AWAY"), makeString(":tactic has a sibling split tactic that is thrown away because :subexplanation")), list(makeKeyword("TACTIC-STRATEGY-NOT-CONTINUABLE"), makeString(":strategy is not continuable, and :tactic was set aside because :subexplanation")), list(makeKeyword("META-REMOVAL-TACTIC-THROWN-AWAY"), makeString(":tactic is a meta-removal tactic, and some other tactically possible tactics on the problem are strategically disallowed")), list(makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-COMPLETE-SIBLING-CONJUNCTIVE-REMOVAL"), makeString(":tactic has a sibling conjunctive removal tactic that is complete")), list(makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-SIBLING-BACKCHAIN-REQUIRED"), makeString(":tactic has a sibling join-ordered tactic that focuses on a backchain required problem")), list(makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-SIBLING-IS-A-SIMPLIFICATION"), makeString(":tactic has a sibling tactic that is a simplification")), list(makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-PROBLEM-HAS-EARLY-REMOVAL"), makeString(":tactic is thrown away because the problem has an early removal tactic")), list(makeKeyword("TACTIC-ALREADY-SET-ASIDE"), makeString(":tactic was already noted to be set aside")), list(makeKeyword("TACTIC-SET-ASIDE-BECAUSE-PROBLEM-SET-ASIDE"), makeString(":tactic is set aside because :subexplanation")), list(makeKeyword("TACTIC-GENERATED-ENOUGH"), makeString(":tactic has already generated enough transformation tactics")), list(makeKeyword("TACTIC-SET-ASIDE-BECAUSE-LOOKAHEAD-PROBLEM-SET-ASIDE"), makeString("executing :tactic would motivate a problem that is set aside because :subexplanation")), list(makeKeyword("SPLIT-TACTIC-SET-ASIDE-BECAUSE-SIBLING-TACTIC-THROWN-AWAY"), makeString(":tactic has a sibling split tactic that is thrown away because :subexplanation")), list(makeKeyword("SPLIT-TACTIC-SET-ASIDE-BECAUSE-SIBLING-TACTIC-SET-ASIDE"), makeString(":tactic has a sibling split tactic that is set aside wrt both removal and transformation, because :subexplanation")), list(makeKeyword("LOGICAL-TACTIC-EXCEEDS-MAX-TRANSFORMATION-DEPTH"), makeString(":tactic leads past the :max-transformation-depth")), list(makeKeyword("JOIN-ORDERED-TACTIC-LEADS-TO-SET-ASIDE-CONJUNCTIVE-REMOVALS"), makeString(":tactic leads to a conjunctive focal problem where all conjunctive removals are set aside")), list(makeKeyword("LINK-SUPPORTED-PROBLEM-THROWN-AWAY"), makeString(":link's supported problem is thrown away because :subexplanation")), list(makeKeyword("SIBLING-EARLY-REMOVAL-LINK"), makeString(":link has a sibling link :subexplanation")), list(makeKeyword("EARLY-REMOVAL-LINK"), makeString(":link, which is an early removal link")), list(makeKeyword("LINK-RULE-DISALLOWED"), makeString(":link uses a disallowed rule")), list(makeKeyword("LINK-SUPPORTED-PROBLEM-SET-ASIDE"), makeString(":link's supported problem is set aside because :subexplanation")), list(makeKeyword("LINK-EXCEEDS-MAX-TRANSFORMATION-DEPTH"), makeString(":link leads past the :max-transformation-depth")), list(makeKeyword("UNKNOWN-REASON"), makeString("an unknown reason")) });

    private static final SubLList $list18 = list(makeSymbol("TYPE"), makeSymbol("PROBLEM"), makeSymbol("TACTIC"), makeSymbol("LINK"), makeSymbol("SUBEXPLANATION"));

    private static final SubLSymbol STRATEGY_UNINTERESTINGNESS_EXPLANATION_TYPE_P = makeSymbol("STRATEGY-UNINTERESTINGNESS-EXPLANATION-TYPE-P");

    private static final SubLList $list23 = list(NIL, makeKeyword("SET-ASIDE"), makeKeyword("THROW-AWAY"), makeKeyword("IRRELEVANT"));

    private static final SubLSymbol $THROW_AWAY_PROBLEM = makeKeyword("THROW-AWAY-PROBLEM");

    private static final SubLSymbol $THROW_AWAY_TACTIC = makeKeyword("THROW-AWAY-TACTIC");

    private static final SubLSymbol $SET_ASIDE_PROBLEM = makeKeyword("SET-ASIDE-PROBLEM");

    private static final SubLSymbol $SET_ASIDE_TACTIC = makeKeyword("SET-ASIDE-TACTIC");

    private static final SubLString $str28$problem_is_tactically_uninteresti = makeString("problem is tactically uninteresting");

    private static final SubLString $str29$strategy_has_enough_proofs_for_pr = makeString("strategy has enough proofs for problem");

    private static final SubLString $str30$inference_is_not_continuable__and = makeString("inference is not continuable, and ");

    private static final SubLString $$$tactic_is_discarded = makeString("tactic is discarded");

    private static final SubLString $str32$non_good_problem_has_already_exec = makeString("non-good problem has already executed a complete removal tactic");

    private static final SubLString $$$rewrite_tactic_is_redundant = makeString("rewrite tactic is redundant");

    private static final SubLString $$$HL_module_is_forbidden = makeString("HL module is forbidden");

    private static final SubLString $str35$the_rule_for_this_tactic_has_an_i = makeString("the rule for this tactic has an insuffiently high historical utility");

    private static final SubLString $str37$problem_is_strategically_no_good = makeString("problem is strategically no-good");

    private static final SubLString $$$tactic_exceeds_productivity_limit = makeString("tactic exceeds productivity limit");

    private static final SubLSymbol STRATEGIC_CONTEXT_P = makeSymbol("STRATEGIC-CONTEXT-P");

    private static final SubLString $$$problem_exceeds_max_proof_depth = makeString("problem exceeds max proof depth");

    private static final SubLString $str42$proof_checker_mode_is_enabled_and = makeString("proof checker mode is enabled and no allowed rules were used to link to this problem");

    private static final SubLSymbol $sym43$INFERENCE_CHOOSES_TO_THROW_AWAY_ALL_TRANSFORMATIONS_ON_PROBLEM_ = makeSymbol("INFERENCE-CHOOSES-TO-THROW-AWAY-ALL-TRANSFORMATIONS-ON-PROBLEM?");

    private static final SubLString $str44$problem_uses_an_HL_predicate__HL_ = makeString("problem uses an HL predicate, HL and unbound predicate transformation are forbidden, and #$collectionBackchainEncouraged does not apply");

    private static final SubLString $str45$problem_uses_an_evaluatable_predi = makeString("problem uses an evaluatable predicate and evaluatable predicate transformation is forbidden");

    private static final SubLString $str47$problem_exceeds_max_transformatio = makeString("problem exceeds max transformation depth");

    private static final SubLSymbol $sym48$SIMPLE_STRATEGY_CHOOSES_TO_THROW_AWAY_TRANSFORMATION_TACTIC_ = makeSymbol("SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC?");

    private static final SubLString $str49$proof_checker_mode_is_enabled__an = makeString("proof checker mode is enabled, and the rule for this tactic is forbidden");

    private static final SubLString $str50$tactic_requires_HL_predicate_tran = makeString("tactic requires HL predicate transformation, which is forbidden");

    private static final SubLString $str51$tactic_requires_unbound_predicate = makeString("tactic requires unbound predicate transformation, which is forbidden");

    private static final SubLString $str52$tactic_requires_evaluatable_predi = makeString("tactic requires evaluatable predicate transformation, which is forbidden");

    static private final SubLList $list53 = list(reader_make_constant_shell("isa"), reader_make_constant_shell("genls"));





    private static final SubLString $str70$Time_to_support_proof_spec_admitt = makeString("Time to support proof-spec admittance on ~S tactics");

    private static final SubLList $list71 = list(makeSymbol("OPERATOR"), makeSymbol("&REST"), makeSymbol("SUB-SPECS"));

    private static final SubLList $list72 = list(makeSymbol("REMOVAL-TOKEN"), makeSymbol("LITERAL-SPEC"), makeSymbol("REMOVAL-MODULE-SPEC"));

    private static final SubLList $list73 = list(makeSymbol("RESTRICTION-TOKEN"), makeSymbol("SUB-SPEC"));

    private static final SubLList $list74 = list(makeSymbol("TRANSFORMATION-TOKEN"), makeSymbol("LITERAL-SPEC"), makeSymbol("TRANSFORMATION-MODULE-SPEC"), makeSymbol("RULE-SPEC"), makeSymbol("&OPTIONAL"), makeSymbol("SUB-SPEC"));

    private static final SubLList $list75 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));

    private static final SubLList $list76 = list(makeSymbol("MT"), makeSymbol("SENTENCE"));





    public static SubLObject the_unknown_strategy_uninterestingness_explanation_p(final SubLObject v_object) {
        return eq(v_object, $the_unknown_strategy_uninterestingness_explanation$.getGlobalValue());
    }

    public static final SubLObject strategy_last_uninterestingness_explanation_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != $strategy_uninterestingness_explanation$.getDynamicValue(thread) ? ((SubLObject) ($strategy_uninterestingness_explanation$.getDynamicValue(thread))) : $the_unknown_strategy_uninterestingness_explanation$.getGlobalValue();
        }
    }

    public static SubLObject strategy_last_uninterestingness_explanation() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != $strategy_uninterestingness_explanation$.getDynamicValue(thread) ? $strategy_uninterestingness_explanation$.getDynamicValue(thread) : $the_unknown_strategy_uninterestingness_explanation$.getGlobalValue();
    }

    public static final SubLObject with_strategy_uninterestingness_explanations_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt64, append(body, NIL));
        }
    }

    public static SubLObject with_strategy_uninterestingness_explanations(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list3, append(body, NIL));
    }

    public static SubLObject without_strategy_uninterestingness_explanations(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list4, append(body, NIL));
    }

    public static final SubLObject strategy_note_uninterestingness_explanation_alt(SubLObject explanation_type, SubLObject problem, SubLObject tactic, SubLObject link, SubLObject subexplanation) {
        {
            SubLObject explanation = com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.make_strategy_uninterestingness_explanation(explanation_type, problem, tactic, link, subexplanation);
            SubLTrampolineFile.checkType(explanation, STRATEGY_UNINTERESTINGNESS_EXPLANATION_P);
            $strategy_uninterestingness_explanation$.setDynamicValue(explanation);
            return explanation;
        }
    }

    public static SubLObject strategy_note_uninterestingness_explanation(final SubLObject explanation_type, final SubLObject problem, final SubLObject tactic, final SubLObject link, final SubLObject subexplanation) {
        final SubLObject explanation = make_strategy_uninterestingness_explanation(explanation_type, problem, tactic, link, subexplanation);
        assert NIL != strategy_uninterestingness_explanation_p(explanation) : "! inference_tactician_strategic_uninterestingness.strategy_uninterestingness_explanation_p(explanation) " + ("inference_tactician_strategic_uninterestingness.strategy_uninterestingness_explanation_p(explanation) " + "CommonSymbols.NIL != inference_tactician_strategic_uninterestingness.strategy_uninterestingness_explanation_p(explanation) ") + explanation;
        $strategy_uninterestingness_explanation$.setDynamicValue(explanation);
        return explanation;
    }

    public static SubLObject strategy_possibly_note_exact_uninterestingness_explanation(final SubLObject explanation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
            $strategy_uninterestingness_explanation$.setDynamicValue(explanation, thread);
        }
        return explanation;
    }

    public static final SubLObject strategy_possibly_note_uninterestingness_explanation_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject explanation_type = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt68);
            explanation_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt68);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject allow_other_keys_p = NIL;
                    SubLObject rest = current;
                    SubLObject bad = NIL;
                    SubLObject current_6 = NIL;
                    for (; NIL != rest;) {
                        destructuring_bind_must_consp(rest, datum, $list_alt68);
                        current_6 = rest.first();
                        rest = rest.rest();
                        destructuring_bind_must_consp(rest, datum, $list_alt68);
                        if (NIL == member(current_6, $list_alt69, UNPROVIDED, UNPROVIDED)) {
                            bad = T;
                        }
                        if (current_6 == $ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    }
                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                        cdestructuring_bind_error(datum, $list_alt68);
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
                            return list(PWHEN, $strategy_gathering_uninterestingness_explanationsP$, list(STRATEGY_NOTE_UNINTERESTINGNESS_EXPLANATION, explanation_type, problem, tactic, link, subexplanation));
                        } else {
                            cdestructuring_bind_error(datum, $list_alt68);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject strategy_possibly_note_uninterestingness_explanation(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject explanation_type = NIL;
        destructuring_bind_must_consp(current, datum, $list8);
        explanation_type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list8);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list8);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list8);
            if (NIL == member(current_$1, $list9, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list8);
        }
        final SubLObject problem_tail = property_list_member($PROBLEM, current);
        final SubLObject problem = (NIL != problem_tail) ? cadr(problem_tail) : NIL;
        final SubLObject tactic_tail = property_list_member($TACTIC, current);
        final SubLObject tactic = (NIL != tactic_tail) ? cadr(tactic_tail) : NIL;
        final SubLObject link_tail = property_list_member($LINK, current);
        final SubLObject link = (NIL != link_tail) ? cadr(link_tail) : NIL;
        final SubLObject subexplanation_tail = property_list_member($SUBEXPLANATION, current);
        final SubLObject subexplanation = (NIL != subexplanation_tail) ? cadr(subexplanation_tail) : NIL;
        current = temp;
        if (NIL == current) {
            return list(PWHEN, $strategy_gathering_uninterestingness_explanationsP$, list(STRATEGY_NOTE_UNINTERESTINGNESS_EXPLANATION, explanation_type, problem, tactic, link, subexplanation));
        }
        cdestructuring_bind_error(datum, $list8);
        return NIL;
    }

    public static SubLObject strategy_possibly_un_note_uninterestingness_explanation() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
            $strategy_uninterestingness_explanation$.setDynamicValue($the_unknown_strategy_uninterestingness_explanation$.getGlobalValue(), thread);
        }
        return NIL;
    }

    public static final SubLObject strategy_uninterestingness_explanation_string_alt(SubLObject explanation_type) {
        return second(assoc(explanation_type, $strategy_uninterestingness_explanation_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject strategy_uninterestingness_explanation_string(final SubLObject explanation_type) {
        return second(assoc(explanation_type, $strategy_uninterestingness_explanation_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    /**
     *
     *
     * @return booleanp; t iff OBJECT is a token which indicates a particular type of strategic uninterestingness,
    but not as it applies to a particular inference object.
     */
    @LispMethod(comment = "@return booleanp; t iff OBJECT is a token which indicates a particular type of strategic uninterestingness,\r\nbut not as it applies to a particular inference object.")
    public static final SubLObject strategy_uninterestingness_explanation_type_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isString() || (v_object.isKeyword() && (NIL != assoc(v_object, $strategy_uninterestingness_explanation_table$.getGlobalValue(), symbol_function(EQ), UNPROVIDED))));
    }

    /**
     *
     *
     * @return booleanp; t iff OBJECT is a token which indicates a particular type of strategic uninterestingness,
    but not as it applies to a particular inference object.
     */
    @LispMethod(comment = "@return booleanp; t iff OBJECT is a token which indicates a particular type of strategic uninterestingness,\r\nbut not as it applies to a particular inference object.")
    public static SubLObject strategy_uninterestingness_explanation_type_p(final SubLObject v_object) {
        return makeBoolean(v_object.isString() || (v_object.isKeyword() && (NIL != assoc(v_object, $strategy_uninterestingness_explanation_table$.getGlobalValue(), symbol_function(EQ), UNPROVIDED))));
    }

    /**
     *
     *
     * @return booleanp; t iff OBJECT is an explanation of why a particular inference object is strategically uninteresting.
     */
    @LispMethod(comment = "@return booleanp; t iff OBJECT is an explanation of why a particular inference object is strategically uninteresting.")
    public static final SubLObject strategy_uninterestingness_explanation_p_alt(SubLObject v_object) {
        if (v_object.isCons() && (NIL != list_utilities.lengthE(v_object, FIVE_INTEGER, UNPROVIDED))) {
            {
                SubLObject datum = v_object;
                SubLObject current = datum;
                SubLObject type = NIL;
                SubLObject problem = NIL;
                SubLObject tactic = NIL;
                SubLObject link = NIL;
                SubLObject subexplanation = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt78);
                type = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt78);
                problem = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt78);
                tactic = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt78);
                link = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt78);
                subexplanation = current.first();
                current = current.rest();
                if (NIL == current) {
                    return makeBoolean(((((NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.strategy_uninterestingness_explanation_type_p(type)) && ((NIL == problem) || (NIL != inference_datastructures_problem.problem_p(problem)))) && ((NIL == tactic) || (NIL != inference_datastructures_tactic.tactic_p(tactic)))) && ((NIL == link) || (NIL != inference_datastructures_problem_link.problem_link_p(link)))) && ((NIL == subexplanation) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.strategy_uninterestingness_explanation_p(subexplanation))));
                } else {
                    cdestructuring_bind_error(datum, $list_alt78);
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; t iff OBJECT is an explanation of why a particular inference object is strategically uninteresting.
     */
    @LispMethod(comment = "@return booleanp; t iff OBJECT is an explanation of why a particular inference object is strategically uninteresting.")
    public static SubLObject strategy_uninterestingness_explanation_p(final SubLObject v_object) {
        if (v_object.isCons() && (NIL != list_utilities.lengthE(v_object, FIVE_INTEGER, UNPROVIDED))) {
            SubLObject type = NIL;
            SubLObject problem = NIL;
            SubLObject tactic = NIL;
            SubLObject link = NIL;
            SubLObject subexplanation = NIL;
            destructuring_bind_must_consp(v_object, v_object, $list18);
            type = v_object.first();
            SubLObject current = v_object.rest();
            destructuring_bind_must_consp(current, v_object, $list18);
            problem = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, v_object, $list18);
            tactic = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, v_object, $list18);
            link = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, v_object, $list18);
            subexplanation = current.first();
            current = current.rest();
            if (NIL == current) {
                return makeBoolean(((((NIL != strategy_uninterestingness_explanation_type_p(type)) && ((NIL == problem) || (NIL != inference_datastructures_problem.problem_p(problem)))) && ((NIL == tactic) || (NIL != inference_datastructures_tactic.tactic_p(tactic)))) && ((NIL == link) || (NIL != inference_datastructures_problem_link.problem_link_p(link)))) && ((NIL == subexplanation) || (NIL != strategy_uninterestingness_explanation_p(subexplanation))));
            }
            cdestructuring_bind_error(v_object, $list18);
        }
        return NIL;
    }

    public static final SubLObject strategy_uninterestingness_subexplanation_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL == v_object) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.strategy_uninterestingness_explanation_p(v_object))) || (NIL != list_utilities.list_of_type_p(STRATEGY_UNINTERESTINGNESS_EXPLANATION_P, v_object)));
    }

    public static SubLObject strategy_uninterestingness_subexplanation_p(final SubLObject v_object) {
        return makeBoolean(((NIL == v_object) || (NIL != strategy_uninterestingness_explanation_p(v_object))) || (NIL != list_utilities.list_of_type_p(STRATEGY_UNINTERESTINGNESS_EXPLANATION_P, v_object)));
    }

    public static final SubLObject make_strategy_uninterestingness_explanation_alt(SubLObject explanation_type, SubLObject problem, SubLObject tactic, SubLObject link, SubLObject subexplanation) {
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
        SubLTrampolineFile.checkType(explanation_type, STRATEGY_UNINTERESTINGNESS_EXPLANATION_TYPE_P);
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
            SubLTrampolineFile.checkType(subexplanation, STRATEGY_UNINTERESTINGNESS_EXPLANATION_P);
        }
        return list(explanation_type, problem, tactic, link, subexplanation);
    }

    public static SubLObject make_strategy_uninterestingness_explanation(final SubLObject explanation_type, SubLObject problem, SubLObject tactic, SubLObject link, SubLObject subexplanation) {
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
        assert NIL != strategy_uninterestingness_explanation_type_p(explanation_type) : "! inference_tactician_strategic_uninterestingness.strategy_uninterestingness_explanation_type_p(explanation_type) " + ("inference_tactician_strategic_uninterestingness.strategy_uninterestingness_explanation_type_p(explanation_type) " + "CommonSymbols.NIL != inference_tactician_strategic_uninterestingness.strategy_uninterestingness_explanation_type_p(explanation_type) ") + explanation_type;
        if (((NIL != problem) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == inference_datastructures_problem.problem_p(problem))) {
            throw new AssertionError(problem);
        }
        if (((NIL != tactic) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == inference_datastructures_tactic.tactic_p(tactic))) {
            throw new AssertionError(tactic);
        }
        if (((NIL != link) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == inference_datastructures_problem_link.problem_link_p(link))) {
            throw new AssertionError(link);
        }
        if (((NIL != subexplanation) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == strategy_uninterestingness_explanation_p(subexplanation))) {
            throw new AssertionError(subexplanation);
        }
        return list(explanation_type, problem, tactic, link, subexplanation);
    }

    public static final SubLObject strategy_uninterestingness_explanation_type_alt(SubLObject explanation) {
        SubLTrampolineFile.checkType(explanation, STRATEGY_UNINTERESTINGNESS_EXPLANATION_P);
        return explanation.first();
    }

    public static SubLObject strategy_uninterestingness_explanation_type(final SubLObject explanation) {
        assert NIL != strategy_uninterestingness_explanation_p(explanation) : "! inference_tactician_strategic_uninterestingness.strategy_uninterestingness_explanation_p(explanation) " + ("inference_tactician_strategic_uninterestingness.strategy_uninterestingness_explanation_p(explanation) " + "CommonSymbols.NIL != inference_tactician_strategic_uninterestingness.strategy_uninterestingness_explanation_p(explanation) ") + explanation;
        return explanation.first();
    }

    // Definitions
    public static final SubLObject strategic_uninterestingness_reason_p_alt(SubLObject v_object) {
        return subl_promotions.memberP(v_object, $list_alt0, symbol_function(EQ), UNPROVIDED);
    }

    // Definitions
    public static SubLObject strategic_uninterestingness_reason_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $list23, symbol_function(EQ), UNPROVIDED);
    }

    public static final SubLObject strategy_chooses_to_throw_away_problemP_alt(SubLObject strategy, SubLObject problem, SubLObject motivation) {
        if (motivation == UNPROVIDED) {
            motivation = NIL;
        }
        if (NIL != inference_balanced_tactician_datastructures.balanced_strategy_p(strategy)) {
            return inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_throw_away_problemP(strategy, problem, motivation, UNPROVIDED);
        } else {
            return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_throw_away_problemP(strategy, problem);
        }
    }

    public static SubLObject strategy_chooses_to_throw_away_problemP(final SubLObject strategy, final SubLObject problem, SubLObject motivation) {
        if (motivation == UNPROVIDED) {
            motivation = NIL;
        }
        return inference_datastructures_strategy.strategy_dispatch(strategy, $THROW_AWAY_PROBLEM, problem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject why_strategy_chooses_to_throw_away_problem_alt(SubLObject strategy, SubLObject problem) {
        if (NIL != inference_balanced_tactician_datastructures.balanced_strategy_p(strategy)) {
            {
                SubLObject thrown_away_wrt_removalP = inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_throw_away_problemP(strategy, problem, $REMOVAL, UNPROVIDED);
                SubLObject thrown_away_wrt_transformationP = inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_throw_away_problemP(strategy, problem, $TRANSFORMATION, UNPROVIDED);
                if ((NIL != thrown_away_wrt_removalP) && (NIL != thrown_away_wrt_transformationP)) {
                    return $str_alt3$thrown_away_wrt_both_removal_and_;
                } else {
                    if (NIL != thrown_away_wrt_removalP) {
                        return $$$thrown_away_wrt_removal;
                    } else {
                        if (NIL != thrown_away_wrt_transformationP) {
                            return $$$thrown_away_wrt_transformation;
                        } else {
                            return NIL;
                        }
                    }
                }
            }
        } else {
            {
                SubLObject simple_reason = com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.why_simple_strategy_chooses_to_throw_away_problem(strategy, problem);
                if (NIL != simple_reason) {
                    return simple_reason;
                }
            }
        }
        return NIL;
    }

    public static SubLObject why_strategy_chooses_to_throw_away_problem(final SubLObject strategy, final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject reason = NIL;
        final SubLObject _prev_bind_0 = $strategy_uninterestingness_explanation$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $strategy_gathering_uninterestingness_explanationsP$.currentBinding(thread);
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

    public static final SubLObject strategy_chooses_to_throw_away_tacticP_alt(SubLObject strategy, SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $THROW_AWAY_TACTIC, tactic, problem_already_consideredP, siblings_already_consideredP, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject strategy_chooses_to_throw_away_tacticP(final SubLObject strategy, final SubLObject tactic, final SubLObject problem_already_consideredP, final SubLObject siblings_already_consideredP) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $THROW_AWAY_TACTIC, tactic, problem_already_consideredP, siblings_already_consideredP, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject legacy_strategy_chooses_to_throw_away_tacticP_alt(SubLObject strategy, SubLObject tactic, SubLObject motivation) {
        if (motivation == UNPROVIDED) {
            motivation = NIL;
        }
        if (NIL != inference_balanced_tactician_datastructures.balanced_strategy_p(strategy)) {
            if (NIL != motivation) {
                return inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_throw_away_tacticP(strategy, tactic, motivation, UNPROVIDED, UNPROVIDED);
            } else {
                return inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_totally_throw_away_tacticP(strategy, tactic, UNPROVIDED, UNPROVIDED);
            }
        } else {
            return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_throw_away_tacticP(strategy, tactic);
        }
    }

    public static SubLObject legacy_strategy_chooses_to_throw_away_tacticP(final SubLObject strategy, final SubLObject tactic, SubLObject motivation) {
        if (motivation == UNPROVIDED) {
            motivation = NIL;
        }
        return simple_strategy_chooses_to_throw_away_tacticP(strategy, tactic);
    }

    public static SubLObject legacy_strategy_chooses_to_ignore_tacticP(final SubLObject strategy, final SubLObject tactic, SubLObject motivation) {
        if (motivation == UNPROVIDED) {
            motivation = NIL;
        }
        return simple_strategy_chooses_to_ignore_tacticP(strategy, tactic);
    }

    public static final SubLObject why_strategy_chooses_to_throw_away_tactic_alt(SubLObject strategy, SubLObject tactic) {
        if (NIL != inference_balanced_tactician_datastructures.balanced_strategy_p(strategy)) {
            {
                SubLObject thrown_away_wrt_removalP = inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_throw_away_tacticP(strategy, tactic, $REMOVAL, UNPROVIDED, UNPROVIDED);
                SubLObject thrown_away_wrt_transformationP = inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_throw_away_tacticP(strategy, tactic, $TRANSFORMATION, UNPROVIDED, UNPROVIDED);
                if ((NIL != thrown_away_wrt_removalP) && (NIL != thrown_away_wrt_transformationP)) {
                    return $str_alt3$thrown_away_wrt_both_removal_and_;
                } else {
                    if (NIL != thrown_away_wrt_removalP) {
                        return $$$thrown_away_wrt_removal;
                    } else {
                        if (NIL != thrown_away_wrt_transformationP) {
                            return $$$thrown_away_wrt_transformation;
                        } else {
                            return NIL;
                        }
                    }
                }
            }
        } else {
            if (NIL != balancing_tactician.balancing_tactician_substrategy_p(strategy)) {
                return $str_alt7$;
            } else {
                return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.why_simple_strategy_chooses_to_throw_away_tactic(strategy, tactic);
            }
        }
    }

    public static SubLObject why_strategy_chooses_to_throw_away_tactic(final SubLObject strategy, final SubLObject tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject reason = NIL;
        final SubLObject _prev_bind_0 = $strategy_uninterestingness_explanation$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $strategy_gathering_uninterestingness_explanationsP$.currentBinding(thread);
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

    public static final SubLObject strategy_chooses_to_set_aside_problemP_alt(SubLObject strategy, SubLObject problem) {
        if (NIL != inference_balanced_tactician_datastructures.balanced_strategy_p(strategy)) {
            return makeBoolean((NIL != inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_set_aside_problemP(strategy, problem, $REMOVAL, UNPROVIDED, UNPROVIDED)) && (NIL != inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_set_aside_problemP(strategy, problem, $TRANSFORMATION, UNPROVIDED, UNPROVIDED)));
        } else {
            return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_set_aside_problemP(strategy, problem);
        }
    }

    public static SubLObject strategy_chooses_to_set_aside_problemP(final SubLObject strategy, final SubLObject problem) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $SET_ASIDE_PROBLEM, problem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject why_strategy_chooses_to_set_aside_problem_alt(SubLObject strategy, SubLObject problem) {
        if (NIL != inference_balanced_tactician_datastructures.balanced_strategy_p(strategy)) {
            {
                SubLObject set_aside_wrt_removalP = inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_set_aside_problemP(strategy, problem, $REMOVAL, UNPROVIDED, UNPROVIDED);
                SubLObject set_aside_wrt_transformationP = inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_set_aside_problemP(strategy, problem, $TRANSFORMATION, UNPROVIDED, UNPROVIDED);
                if ((NIL != set_aside_wrt_removalP) && (NIL != set_aside_wrt_transformationP)) {
                    return $str_alt8$set_aside_wrt_both_removal_and_tr;
                } else {
                    if (NIL != set_aside_wrt_removalP) {
                        return $$$set_aside_wrt_removal;
                    } else {
                        if (NIL != set_aside_wrt_transformationP) {
                            return $$$set_aside_wrt_transformation;
                        } else {
                            return NIL;
                        }
                    }
                }
            }
        } else {
            return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.why_simple_strategy_chooses_to_set_aside_problem(strategy, problem);
        }
    }

    public static SubLObject why_strategy_chooses_to_set_aside_problem(final SubLObject strategy, final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject reason = NIL;
        final SubLObject _prev_bind_0 = $strategy_uninterestingness_explanation$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $strategy_gathering_uninterestingness_explanationsP$.currentBinding(thread);
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

    public static final SubLObject strategy_chooses_to_set_aside_tacticP_alt(SubLObject strategy, SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $SET_ASIDE_TACTIC, tactic, problem_already_consideredP, siblings_already_consideredP, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject strategy_chooses_to_set_aside_tacticP(final SubLObject strategy, final SubLObject tactic, final SubLObject problem_already_consideredP, final SubLObject siblings_already_consideredP) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $SET_ASIDE_TACTIC, tactic, problem_already_consideredP, siblings_already_consideredP, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject legacy_strategy_chooses_to_set_aside_tacticP_alt(SubLObject strategy, SubLObject tactic, SubLObject motivation) {
        if (motivation == UNPROVIDED) {
            motivation = NIL;
        }
        if (NIL != inference_balanced_tactician_datastructures.balanced_strategy_p(strategy)) {
            return inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_set_aside_tacticP(strategy, tactic, motivation, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_set_aside_tacticP(strategy, tactic);
        }
    }

    public static SubLObject legacy_strategy_chooses_to_set_aside_tacticP(final SubLObject strategy, final SubLObject tactic, SubLObject motivation) {
        if (motivation == UNPROVIDED) {
            motivation = NIL;
        }
        return simple_strategy_chooses_to_set_aside_tacticP(strategy, tactic);
    }

    public static final SubLObject why_strategy_chooses_to_set_aside_tactic_alt(SubLObject strategy, SubLObject tactic) {
        if (NIL != inference_balanced_tactician_datastructures.balanced_strategy_p(strategy)) {
            {
                SubLObject thrown_away_wrt_removalP = inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_set_aside_tacticP(strategy, tactic, $REMOVAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject thrown_away_wrt_transformationP = inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_set_aside_tacticP(strategy, tactic, $TRANSFORMATION, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if ((NIL != thrown_away_wrt_removalP) && (NIL != thrown_away_wrt_transformationP)) {
                    return $str_alt3$thrown_away_wrt_both_removal_and_;
                } else {
                    if (NIL != thrown_away_wrt_removalP) {
                        return $$$thrown_away_wrt_removal;
                    } else {
                        if (NIL != thrown_away_wrt_transformationP) {
                            return $$$thrown_away_wrt_transformation;
                        } else {
                            return NIL;
                        }
                    }
                }
            }
        } else {
            if (NIL != balancing_tactician.balancing_tactician_substrategy_p(strategy)) {
                return $str_alt7$;
            } else {
                return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.why_simple_strategy_chooses_to_set_aside_tactic(strategy, tactic);
            }
        }
    }

    public static SubLObject why_strategy_chooses_to_set_aside_tactic(final SubLObject strategy, final SubLObject tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject reason = NIL;
        final SubLObject _prev_bind_0 = $strategy_uninterestingness_explanation$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $strategy_gathering_uninterestingness_explanationsP$.currentBinding(thread);
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

    public static final SubLObject strategy_chooses_to_ignore_tacticP_alt(SubLObject strategy, SubLObject tactic, SubLObject motivation) {
        if (motivation == UNPROVIDED) {
            motivation = NIL;
        }
        if (NIL != inference_balanced_tactician_datastructures.balanced_strategy_p(strategy)) {
            if (NIL != motivation) {
                return inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_ignore_tacticP(strategy, tactic, motivation);
            } else {
                return inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_totally_ignore_tacticP(strategy, tactic);
            }
        } else {
            return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_ignore_tacticP(strategy, tactic);
        }
    }

    public static SubLObject strategy_chooses_to_ignore_tacticP(final SubLObject strategy, final SubLObject tactic, SubLObject motivation) {
        if (motivation == UNPROVIDED) {
            motivation = NIL;
        }
        return simple_strategy_chooses_to_ignore_tacticP(strategy, tactic);
    }

    public static final SubLObject simple_strategy_chooses_to_throw_away_problemP_alt(SubLObject strategy, SubLObject problem) {
        return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_throw_away_problem_int(strategy, problem, NIL);
    }

    public static SubLObject simple_strategy_chooses_to_throw_away_problemP(final SubLObject strategy, final SubLObject problem) {
        return simple_strategy_chooses_to_throw_away_problem_int(strategy, problem, NIL);
    }

    public static final SubLObject why_simple_strategy_chooses_to_throw_away_problem_alt(SubLObject strategy, SubLObject problem) {
        return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_throw_away_problem_int(strategy, problem, T);
    }

    public static SubLObject why_simple_strategy_chooses_to_throw_away_problem(final SubLObject strategy, final SubLObject problem) {
        return simple_strategy_chooses_to_throw_away_problem_int(strategy, problem, T);
    }

    public static final SubLObject simple_strategy_chooses_to_throw_away_problem_int_alt(SubLObject strategy, SubLObject problem, SubLObject justifyP) {
        if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.strategy_deems_problem_tactically_uninterestingP(strategy, problem)) {
            if (NIL != justifyP) {
                return $str_alt12$problem_is_tactically_uninteresti;
            } else {
                return T;
            }
        }
        {
            SubLObject inference_chooses_to_throw_away_problem_reason = com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.why_inference_chooses_to_throw_away_problem(inference_datastructures_strategy.strategy_inference(strategy), problem);
            if (NIL != inference_chooses_to_throw_away_problem_reason) {
                if (NIL != justifyP) {
                    return inference_chooses_to_throw_away_problem_reason;
                } else {
                    return T;
                }
            }
        }
        if (NIL == inference_datastructures_inference.inference_continuableP(inference_datastructures_strategy.strategy_inference(strategy))) {
            {
                SubLObject set_aside_reason = com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.why_simple_strategy_chooses_to_set_aside_problem(strategy, problem);
                if (NIL != set_aside_reason) {
                    if (NIL != justifyP) {
                        return cconcatenate($str_alt13$inference_is_not_continuable__and, set_aside_reason);
                    } else {
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject simple_strategy_chooses_to_throw_away_problem_int(final SubLObject strategy, final SubLObject problem, final SubLObject justifyP) {
        if (NIL != tactically_uninteresting_problem_p(problem)) {
            if (NIL != justifyP) {
                return $str28$problem_is_tactically_uninteresti;
            }
            return T;
        } else
            if (NIL != strategy_has_enough_proofs_for_problemP(strategy, problem)) {
                if (NIL != justifyP) {
                    return $str29$strategy_has_enough_proofs_for_pr;
                }
                return T;
            } else {
                final SubLObject inference_chooses_to_throw_away_problem_reason = why_inference_chooses_to_throw_away_problem(inference_datastructures_strategy.strategy_inference(strategy), problem);
                if (NIL == inference_chooses_to_throw_away_problem_reason) {
                    if ((NIL == inference_datastructures_inference.inference_continuableP(inference_datastructures_strategy.strategy_inference(strategy))) && (NIL != inference_tactician.strategy_set_aside_non_continuable_implies_throw_awayP(strategy))) {
                        final SubLObject set_aside_reason = why_simple_strategy_chooses_to_set_aside_problem(strategy, problem);
                        if (NIL != set_aside_reason) {
                            if (NIL != justifyP) {
                                return cconcatenate($str30$inference_is_not_continuable__and, set_aside_reason);
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

    public static final SubLObject simple_strategy_chooses_to_throw_away_tacticP_alt(SubLObject strategy, SubLObject tactic) {
        return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_throw_away_tactic_int(strategy, tactic, NIL);
    }

    public static SubLObject simple_strategy_chooses_to_throw_away_tacticP(final SubLObject strategy, final SubLObject tactic) {
        return simple_strategy_chooses_to_throw_away_tactic_int(strategy, tactic, NIL);
    }

    public static final SubLObject why_simple_strategy_chooses_to_throw_away_tactic_alt(SubLObject strategy, SubLObject tactic) {
        return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_throw_away_tactic_int(strategy, tactic, T);
    }

    public static SubLObject why_simple_strategy_chooses_to_throw_away_tactic(final SubLObject strategy, final SubLObject tactic) {
        return simple_strategy_chooses_to_throw_away_tactic_int(strategy, tactic, T);
    }

    public static final SubLObject simple_strategy_chooses_to_throw_away_tactic_int_alt(SubLObject strategy, SubLObject tactic, SubLObject justifyP) {
        if ((NIL == inference_worker.good_problem_p(inference_datastructures_tactic.tactic_problem(tactic), strategy)) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.problem_has_executed_a_complete_removal_tacticP(inference_datastructures_tactic.tactic_problem(tactic), strategy))) {
            if (NIL != justifyP) {
                return $str_alt14$non_good_problem_has_already_exec;
            } else {
                return T;
            }
        }
        if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.simple_strategy_deems_rewrite_tactic_redundantP(strategy, tactic)) {
            if (NIL != justifyP) {
                return $$$rewrite_tactic_is_redundant;
            } else {
                return T;
            }
        }
        if ((NIL != inference_worker_transformation.transformation_tactic_p(tactic)) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_throw_away_transformation_tacticP(strategy, tactic))) {
            if (NIL != justifyP) {
                return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.why_simple_strategy_chooses_to_throw_away_transformation_tactic(strategy, tactic);
            } else {
                return T;
            }
        }
        if (NIL == com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.strategy_allows_use_of_tactic_hl_moduleP(strategy, tactic)) {
            if (NIL != justifyP) {
                return $$$HL_module_is_forbidden;
            } else {
                return T;
            }
        }
        if (NIL == inference_datastructures_inference.inference_continuableP(inference_datastructures_strategy.strategy_inference(strategy))) {
            {
                SubLObject strategy_chooses_to_set_aside_tactic_reason = com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.why_simple_strategy_chooses_to_set_aside_tactic(strategy, tactic);
                if (NIL != strategy_chooses_to_set_aside_tactic_reason) {
                    if (NIL != justifyP) {
                        return cconcatenate($str_alt13$inference_is_not_continuable__and, strategy_chooses_to_set_aside_tactic_reason);
                    } else {
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject simple_strategy_chooses_to_throw_away_tactic_int(final SubLObject strategy, final SubLObject tactic, final SubLObject justifyP) {
        if ((NIL != inference_datastructures_tactic.tactic_discardedP(tactic)) && (NIL == transformation_tactician_datastructures.transformation_strategy_p(strategy))) {
            if (NIL != justifyP) {
                return $$$tactic_is_discarded;
            }
            return T;
        } else
            if ((NIL == inference_worker.good_problem_p(inference_datastructures_tactic.tactic_problem(tactic), strategy)) && (NIL != problem_has_executed_a_complete_removal_tacticP(inference_datastructures_tactic.tactic_problem(tactic), strategy))) {
                if (NIL != justifyP) {
                    return $str32$non_good_problem_has_already_exec;
                }
                return T;
            } else
                if (NIL != simple_strategy_deems_rewrite_tactic_redundantP(strategy, tactic)) {
                    if (NIL != justifyP) {
                        return $$$rewrite_tactic_is_redundant;
                    }
                    return T;
                } else
                    if ((NIL != inference_worker_transformation.transformation_tactic_p(tactic)) && (NIL != simple_strategy_chooses_to_throw_away_transformation_tacticP(strategy, tactic))) {
                        if (NIL != justifyP) {
                            return why_simple_strategy_chooses_to_throw_away_transformation_tactic(strategy, tactic);
                        }
                        return T;
                    } else {
                        if (NIL != strategy_allows_use_of_tactic_hl_moduleP(strategy, tactic)) {
                            if (NIL == inference_datastructures_inference.inference_continuableP(inference_datastructures_strategy.strategy_inference(strategy))) {
                                if (NIL != inference_tactician.strategy_set_aside_non_continuable_implies_throw_awayP(strategy)) {
                                    final SubLObject strategy_chooses_to_set_aside_tactic_reason = why_simple_strategy_chooses_to_set_aside_tactic(strategy, tactic);
                                    if (NIL != strategy_chooses_to_set_aside_tactic_reason) {
                                        if (NIL != justifyP) {
                                            return cconcatenate($str30$inference_is_not_continuable__and, strategy_chooses_to_set_aside_tactic_reason);
                                        }
                                        return T;
                                    }
                                } else
                                    if (NIL != inference_worker_transformation.transformation_tactic_p(tactic)) {
                                        final SubLObject rule = inference_worker_transformation.transformation_tactic_rule(tactic);
                                        if ((NIL != rule) && (NIL != inference_analysis.transformation_rule_has_insufficient_historical_utilityP(rule, inference_datastructures_strategy.strategy_inference(strategy)))) {
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
                            return $$$HL_module_is_forbidden;
                        }
                        return T;
                    }



    }

    public static final SubLObject problem_has_executed_a_complete_removal_tacticP_alt(SubLObject problem, SubLObject strategic_context) {
        return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.problem_has_executed_a_complete_tacticP(problem, strategic_context, $GENERALIZED_REMOVAL);
    }

    public static SubLObject problem_has_executed_a_complete_removal_tacticP(final SubLObject problem, final SubLObject strategic_context) {
        return problem_has_executed_a_complete_tacticP(problem, strategic_context, $GENERALIZED_REMOVAL);
    }

    public static final SubLObject lookahead_problem_has_executed_a_complete_removal_tacticP_alt(SubLObject problem, SubLObject strategic_context) {
        return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.lookahead_problem_has_executed_a_complete_tacticP(problem, strategic_context, $GENERALIZED_REMOVAL);
    }

    public static SubLObject lookahead_problem_has_executed_a_complete_removal_tacticP(final SubLObject problem, final SubLObject strategic_context) {
        return lookahead_problem_has_executed_a_complete_tacticP(problem, strategic_context, $GENERALIZED_REMOVAL);
    }

    public static final SubLObject problem_or_lookahead_problem_has_executed_a_complete_removal_tacticP_alt(SubLObject problem, SubLObject strategic_context) {
        return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.problem_or_lookahead_problem_has_executed_a_complete_tacticP(problem, strategic_context, $GENERALIZED_REMOVAL);
    }

    public static SubLObject problem_or_lookahead_problem_has_executed_a_complete_removal_tacticP(final SubLObject problem, final SubLObject strategic_context) {
        return problem_or_lookahead_problem_has_executed_a_complete_tacticP(problem, strategic_context, $GENERALIZED_REMOVAL);
    }

    public static final SubLObject problem_has_executed_a_generalized_removal_tacticP_alt(SubLObject problem) {
        return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.problem_has_executed_a_tactic_of_typeP(problem, $GENERALIZED_REMOVAL);
    }

    public static SubLObject problem_has_executed_a_generalized_removal_tacticP(final SubLObject problem) {
        return problem_has_executed_a_tactic_of_typeP(problem, $GENERALIZED_REMOVAL);
    }

    public static final SubLObject strategy_allows_use_of_tactic_hl_moduleP_alt(SubLObject strategy, SubLObject tactic) {
        return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.strategy_allows_use_of_hl_moduleP(strategy, inference_datastructures_tactic.tactic_hl_module(tactic));
    }

    public static SubLObject strategy_allows_use_of_tactic_hl_moduleP(final SubLObject strategy, final SubLObject tactic) {
        return strategy_allows_use_of_hl_moduleP(strategy, inference_datastructures_tactic.tactic_hl_module(tactic));
    }

    public static final SubLObject strategy_allows_use_of_hl_moduleP_alt(SubLObject strategy, SubLObject hl_module) {
        return inference_datastructures_inference.inference_allows_use_of_moduleP(inference_datastructures_strategy.strategy_inference(strategy), hl_module);
    }

    public static SubLObject strategy_allows_use_of_hl_moduleP(final SubLObject strategy, final SubLObject hl_module) {
        return inference_datastructures_inference.inference_allows_use_of_moduleP(inference_datastructures_strategy.strategy_inference(strategy), hl_module);
    }

    public static final SubLObject simple_strategy_chooses_to_set_aside_problemP_alt(SubLObject strategy, SubLObject problem) {
        return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_set_aside_problem_int(strategy, problem, NIL);
    }

    public static SubLObject simple_strategy_chooses_to_set_aside_problemP(final SubLObject strategy, final SubLObject problem) {
        return simple_strategy_chooses_to_set_aside_problem_int(strategy, problem, NIL);
    }

    public static final SubLObject why_simple_strategy_chooses_to_set_aside_problem_alt(SubLObject strategy, SubLObject problem) {
        return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_set_aside_problem_int(strategy, problem, T);
    }

    public static SubLObject why_simple_strategy_chooses_to_set_aside_problem(final SubLObject strategy, final SubLObject problem) {
        return simple_strategy_chooses_to_set_aside_problem_int(strategy, problem, T);
    }

    public static final SubLObject simple_strategy_chooses_to_set_aside_problem_int_alt(SubLObject strategy, SubLObject problem, SubLObject justifyP) {
        if (NIL != inference_datastructures_strategy.strategically_totally_no_good_problem_p(problem, strategy)) {
            if (NIL != justifyP) {
                return $str_alt18$problem_is_strategically_no_good;
            } else {
                return T;
            }
        }
        {
            SubLObject inference_chooses_to_set_aside_problem_reason = com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.why_inference_chooses_to_set_aside_problem(inference_datastructures_strategy.strategy_inference(strategy), problem);
            if (NIL != inference_chooses_to_set_aside_problem_reason) {
                if (NIL != justifyP) {
                    return inference_chooses_to_set_aside_problem_reason;
                } else {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static SubLObject simple_strategy_chooses_to_set_aside_problem_int(final SubLObject strategy, final SubLObject problem, final SubLObject justifyP) {
        if (NIL != inference_datastructures_strategy.strategically_totally_no_good_problem_p(problem, strategy)) {
            if (NIL != justifyP) {
                return $str37$problem_is_strategically_no_good;
            }
            return T;
        } else {
            final SubLObject inference_chooses_to_set_aside_problem_reason = why_inference_chooses_to_set_aside_problem(inference_datastructures_strategy.strategy_inference(strategy), problem);
            if (NIL == inference_chooses_to_set_aside_problem_reason) {
                return NIL;
            }
            if (NIL != justifyP) {
                return inference_chooses_to_set_aside_problem_reason;
            }
            return T;
        }
    }

    public static final SubLObject simple_strategy_chooses_to_set_aside_tacticP_alt(SubLObject strategy, SubLObject tactic) {
        return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_set_aside_tactic_int(strategy, tactic, NIL);
    }

    public static SubLObject simple_strategy_chooses_to_set_aside_tacticP(final SubLObject strategy, final SubLObject tactic) {
        return simple_strategy_chooses_to_set_aside_tactic_int(strategy, tactic, NIL);
    }

    public static final SubLObject why_simple_strategy_chooses_to_set_aside_tactic_alt(SubLObject strategy, SubLObject tactic) {
        return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_set_aside_tactic_int(strategy, tactic, T);
    }

    public static SubLObject why_simple_strategy_chooses_to_set_aside_tactic(final SubLObject strategy, final SubLObject tactic) {
        return simple_strategy_chooses_to_set_aside_tactic_int(strategy, tactic, T);
    }

    public static final SubLObject simple_strategy_chooses_to_set_aside_tactic_int_alt(SubLObject strategy, SubLObject tactic, SubLObject justifyP) {
        if (((NIL != inference_worker.content_tactic_p(tactic)) || (NIL == inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_strategy.strategy_problem_store(strategy)))) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.tactic_exceeds_productivity_limitP(tactic, strategy))) {
            if (NIL != justifyP) {
                return $$$tactic_exceeds_productivity_limit;
            } else {
                return T;
            }
        }
        if (NIL != inference_worker_transformation.transformation_tactic_p(tactic)) {
            {
                SubLObject strategy_chooses_to_set_aside_transformation_tactic_reason = com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.why_simple_strategy_chooses_to_set_aside_transformation_tactic(strategy, tactic);
                if (NIL != strategy_chooses_to_set_aside_transformation_tactic_reason) {
                    if (NIL != justifyP) {
                        return strategy_chooses_to_set_aside_transformation_tactic_reason;
                    } else {
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject simple_strategy_chooses_to_set_aside_tactic_int(final SubLObject strategy, final SubLObject tactic, final SubLObject justifyP) {
        if (((NIL == inference_worker.content_tactic_p(tactic)) && (NIL != inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_strategy.strategy_problem_store(strategy)))) || (NIL == tactic_exceeds_productivity_limitP(tactic, strategy))) {
            if (NIL != inference_worker_transformation.transformation_tactic_p(tactic)) {
                final SubLObject strategy_chooses_to_set_aside_transformation_tactic_reason = why_simple_strategy_chooses_to_set_aside_transformation_tactic(strategy, tactic);
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
            return $$$tactic_exceeds_productivity_limit;
        }
        return T;
    }

    public static final SubLObject simple_strategy_chooses_to_ignore_problemP_alt(SubLObject strategy, SubLObject problem) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_throw_away_problemP(strategy, problem)) || ((NIL != inference_datastructures_inference.inference_continuableP(inference_datastructures_strategy.strategy_inference(strategy))) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_set_aside_problemP(strategy, problem))));
    }

    public static SubLObject simple_strategy_chooses_to_ignore_problemP(final SubLObject strategy, final SubLObject problem) {
        return makeBoolean((NIL != simple_strategy_chooses_to_throw_away_problemP(strategy, problem)) || (((NIL != inference_datastructures_inference.inference_continuableP(inference_datastructures_strategy.strategy_inference(strategy))) || (NIL == inference_tactician.strategy_set_aside_non_continuable_implies_throw_awayP(strategy))) && (NIL != simple_strategy_chooses_to_set_aside_problemP(strategy, problem))));
    }

    public static final SubLObject simple_strategy_chooses_to_ignore_tacticP_alt(SubLObject strategy, SubLObject tactic) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_throw_away_tacticP(strategy, tactic)) || ((NIL != inference_datastructures_inference.inference_continuableP(inference_datastructures_strategy.strategy_inference(strategy))) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_set_aside_tacticP(strategy, tactic))));
    }

    public static SubLObject simple_strategy_chooses_to_ignore_tacticP(final SubLObject strategy, final SubLObject tactic) {
        return makeBoolean((NIL != simple_strategy_chooses_to_throw_away_tacticP(strategy, tactic)) || (((NIL != inference_datastructures_inference.inference_continuableP(inference_datastructures_strategy.strategy_inference(strategy))) || (NIL == inference_tactician.strategy_set_aside_non_continuable_implies_throw_awayP(strategy))) && (NIL != simple_strategy_chooses_to_set_aside_tacticP(strategy, tactic))));
    }

    /**
     *
     *
     * @return boolean; t iff STRATEGIC-CONTEXT will do no more work on PROBLEM.
     */
    @LispMethod(comment = "@return boolean; t iff STRATEGIC-CONTEXT will do no more work on PROBLEM.")
    public static final SubLObject problem_strategically_pendingP_alt(SubLObject problem, SubLObject strategic_context) {
        SubLTrampolineFile.checkType(strategic_context, STRATEGIC_CONTEXT_P);
        if (NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            return T;
        } else {
            return inference_datastructures_problem.problem_no_tactics_possibleP(problem);
        }
    }

    /**
     *
     *
     * @return boolean; t iff STRATEGIC-CONTEXT will do no more work on PROBLEM.
     */
    @LispMethod(comment = "@return boolean; t iff STRATEGIC-CONTEXT will do no more work on PROBLEM.")
    public static SubLObject problem_strategically_pendingP(final SubLObject problem, final SubLObject strategic_context) {
        assert NIL != inference_worker.strategic_context_p(strategic_context) : "! inference_worker.strategic_context_p(strategic_context) " + ("inference_worker.strategic_context_p(strategic_context) " + "CommonSymbols.NIL != inference_worker.strategic_context_p(strategic_context) ") + strategic_context;
        if (NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            return T;
        }
        return inference_datastructures_problem.problem_no_tactics_possibleP(problem);
    }

    public static final SubLObject strategy_deems_problem_tactically_uninterestingP_alt(SubLObject strategy, SubLObject problem) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.tactically_uninteresting_problem_p(problem)) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.strategy_has_enough_proofs_for_problemP(strategy, problem)));
    }

    public static SubLObject strategy_deems_problem_tactically_uninterestingP(final SubLObject strategy, final SubLObject problem) {
        return makeBoolean((NIL != tactically_uninteresting_problem_p(problem)) || (NIL != strategy_has_enough_proofs_for_problemP(strategy, problem)));
    }

    public static final SubLObject strategy_has_enough_proofs_for_problemP_alt(SubLObject strategy, SubLObject problem) {
        return makeBoolean((NIL != inference_datastructures_problem.tactically_good_problem_p(problem)) && ((NIL != inference_datastructures_strategy.strategy_wants_one_answerP(strategy)) || ((NIL != inference_datastructures_strategy.strategy_unique_wrt_bindingsP(strategy)) && ((NIL != inference_datastructures_problem.closed_problem_p(problem)) || ((problem == inference_datastructures_strategy.strategy_root_problem(strategy)) && (NIL != inference_datastructures_inference.inference_no_free_hl_varsP(inference_datastructures_strategy.strategy_inference(strategy))))))));
    }

    public static SubLObject strategy_has_enough_proofs_for_problemP(final SubLObject strategy, final SubLObject problem) {
        return makeBoolean((NIL != inference_datastructures_problem.tactically_good_problem_p(problem)) && ((NIL != inference_datastructures_strategy.strategy_wants_one_answerP(strategy)) || ((NIL != inference_datastructures_strategy.strategy_unique_wrt_bindingsP(strategy)) && ((NIL != inference_datastructures_problem.closed_problem_p(problem)) || (problem.eql(inference_datastructures_strategy.strategy_root_problem(strategy)) && (NIL != inference_datastructures_inference.inference_no_free_hl_varsP(inference_datastructures_strategy.strategy_inference(strategy))))))));
    }

    public static final SubLObject tactically_uninteresting_problem_p_alt(SubLObject problem) {
        return makeBoolean(((NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem)) || (NIL != inference_datastructures_problem.tactically_examined_problem_p(problem))) || (((NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem)) && (NIL != inference_datastructures_problem.tactically_good_problem_p(problem))) && (NIL != inference_datastructures_problem.closed_problem_p(problem))));
    }

    public static SubLObject tactically_uninteresting_problem_p(final SubLObject problem) {
        return makeBoolean(((NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem)) || (NIL != inference_datastructures_problem.tactically_examined_problem_p(problem))) || (((NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem)) && (NIL != inference_datastructures_problem.tactically_good_problem_p(problem))) && (NIL != inference_datastructures_problem.closed_problem_p(problem))));
    }

    public static final SubLObject strategy_deems_problem_strategically_uninterestingP_alt(SubLObject strategy, SubLObject problem) {
        return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.strategically_uninteresting_problem_p(problem, strategy);
    }

    public static SubLObject strategy_deems_problem_strategically_uninterestingP(final SubLObject strategy, final SubLObject problem) {
        return strategically_uninteresting_problem_p(problem, strategy);
    }

    public static final SubLObject strategically_uninteresting_problem_p_alt(SubLObject problem, SubLObject strategy) {
        return makeBoolean(((NIL != inference_datastructures_strategy.strategically_no_good_problem_p(problem, strategy)) || (NIL != inference_datastructures_strategy.strategically_pending_problem_p(problem, strategy))) || (NIL != inference_datastructures_strategy.strategically_examined_problem_p(problem, strategy)));
    }

    public static SubLObject strategically_uninteresting_problem_p(final SubLObject problem, final SubLObject strategy) {
        return makeBoolean(((NIL != inference_datastructures_strategy.strategically_no_good_problem_p(problem, strategy)) || (NIL != inference_datastructures_strategy.strategically_pending_problem_p(problem, strategy))) || (NIL != inference_datastructures_strategy.strategically_examined_problem_p(problem, strategy)));
    }

    public static final SubLObject problem_has_relevant_supporting_problemP_alt(SubLObject problem, SubLObject strategic_context, SubLObject consider_transformation_tacticsP) {
        SubLTrampolineFile.checkType(strategic_context, STRATEGIC_CONTEXT_P);
        if (NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            {
                SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject argument_link = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, argument_link)) {
                            if ((NIL != consider_transformation_tacticsP) || (NIL == inference_worker_transformation.transformation_link_p(argument_link))) {
                                {
                                    SubLObject link_var = argument_link;
                                    SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                                    SubLObject supporting_mapped_problem = NIL;
                                    for (supporting_mapped_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , supporting_mapped_problem = cdolist_list_var.first()) {
                                        if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem)) {
                                            {
                                                SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                                                SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                                                if (NIL != inference_datastructures_problem.problem_relevant_to_strategyP(supporting_problem, strategic_context)) {
                                                    return T;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return NIL;
            }
        } else {
            return inference_datastructures_problem.problem_has_argument_link_p(problem);
        }
    }

    public static SubLObject problem_has_relevant_supporting_problemP(final SubLObject problem, final SubLObject strategic_context, final SubLObject consider_transformation_tacticsP) {
        assert NIL != inference_worker.strategic_context_p(strategic_context) : "! inference_worker.strategic_context_p(strategic_context) " + ("inference_worker.strategic_context_p(strategic_context) " + "CommonSymbols.NIL != inference_worker.strategic_context_p(strategic_context) ") + strategic_context;
        if (NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject argument_link;
            SubLObject link_var;
            SubLObject cdolist_list_var;
            SubLObject supporting_mapped_problem;
            SubLObject supporting_problem;
            SubLObject variable_map;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                argument_link = set_contents.do_set_contents_next(basis_object, state);
                if ((NIL != set_contents.do_set_contents_element_validP(state, argument_link)) && ((NIL != consider_transformation_tacticsP) || (NIL == inference_worker_transformation.transformation_link_p(argument_link)))) {
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

    public static final SubLObject problem_has_interesting_transformation_tacticsP_alt(SubLObject problem, SubLObject strategic_context) {
        SubLTrampolineFile.checkType(strategic_context, STRATEGIC_CONTEXT_P);
        if (NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            {
                SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
                SubLObject tactic = NIL;
                for (tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tactic = cdolist_list_var.first()) {
                    if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, $TRANSFORMATION)) {
                        if (NIL == com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_ignore_tacticP(strategic_context, tactic)) {
                            return T;
                        }
                    }
                }
                return NIL;
            }
        } else {
            return inference_datastructures_problem.problem_has_transformation_tacticsP(problem);
        }
    }

    public static SubLObject problem_has_interesting_transformation_tacticsP(final SubLObject problem, final SubLObject strategic_context) {
        assert NIL != inference_worker.strategic_context_p(strategic_context) : "! inference_worker.strategic_context_p(strategic_context) " + ("inference_worker.strategic_context_p(strategic_context) " + "CommonSymbols.NIL != inference_worker.strategic_context_p(strategic_context) ") + strategic_context;
        if (NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
            SubLObject tactic = NIL;
            tactic = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, $TRANSFORMATION)) && (NIL == simple_strategy_chooses_to_ignore_tacticP(strategic_context, tactic))) {
                    return T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                tactic = cdolist_list_var.first();
            } 
            return NIL;
        }
        return inference_datastructures_problem.problem_has_transformation_tacticsP(problem);
    }

    /**
     *
     *
     * @return boolean; t iff PROBLEM has no possible tactics, or if STRATEGY
    chooses to ignore all of PROBLEM's possible tactics.
     */
    @LispMethod(comment = "@return boolean; t iff PROBLEM has no possible tactics, or if STRATEGY\r\nchooses to ignore all of PROBLEM\'s possible tactics.")
    public static final SubLObject problem_no_tactics_strategically_possibleP_alt(SubLObject strategy, SubLObject problem) {
        return zerop(inference_datastructures_strategy.problem_strategically_possible_tactic_count(problem, strategy));
    }

    /**
     *
     *
     * @return boolean; t iff PROBLEM has no possible tactics, or if STRATEGY
    chooses to ignore all of PROBLEM's possible tactics.
     */
    @LispMethod(comment = "@return boolean; t iff PROBLEM has no possible tactics, or if STRATEGY\r\nchooses to ignore all of PROBLEM\'s possible tactics.")
    public static SubLObject problem_no_tactics_strategically_possibleP(final SubLObject strategy, final SubLObject problem) {
        return zerop(inference_datastructures_strategy.problem_strategically_possible_tactic_count(problem, strategy));
    }

    public static final SubLObject inference_chooses_to_set_aside_problemP_alt(SubLObject inference, SubLObject problem) {
        return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.inference_chooses_to_set_aside_problem_int(inference, problem, NIL);
    }

    public static SubLObject inference_chooses_to_set_aside_problemP(final SubLObject inference, final SubLObject problem) {
        return inference_chooses_to_set_aside_problem_int(inference, problem, NIL);
    }

    public static final SubLObject why_inference_chooses_to_set_aside_problem_alt(SubLObject inference, SubLObject problem) {
        return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.inference_chooses_to_set_aside_problem_int(inference, problem, T);
    }

    public static SubLObject why_inference_chooses_to_set_aside_problem(final SubLObject inference, final SubLObject problem) {
        return inference_chooses_to_set_aside_problem_int(inference, problem, T);
    }

    public static final SubLObject inference_chooses_to_set_aside_problem_int_alt(SubLObject inference, SubLObject problem, SubLObject justifyP) {
        if (NIL == inference_worker.problem_strictly_within_max_proof_depthP(inference, problem)) {
            if (NIL != justifyP) {
                return $$$problem_exceeds_max_proof_depth;
            } else {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject inference_chooses_to_set_aside_problem_int(final SubLObject inference, final SubLObject problem, final SubLObject justifyP) {
        if (NIL != inference_worker.problem_strictly_within_max_proof_depthP(inference, problem)) {
            return NIL;
        }
        if (NIL != justifyP) {
            return $$$problem_exceeds_max_proof_depth;
        }
        return T;
    }

    public static final SubLObject inference_chooses_to_throw_away_problemP_alt(SubLObject inference, SubLObject problem) {
        return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.inference_chooses_to_throw_away_problem_int(inference, problem, NIL);
    }

    public static SubLObject inference_chooses_to_throw_away_problemP(final SubLObject inference, final SubLObject problem) {
        return inference_chooses_to_throw_away_problem_int(inference, problem, NIL);
    }

    public static final SubLObject why_inference_chooses_to_throw_away_problem_alt(SubLObject inference, SubLObject problem) {
        return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.inference_chooses_to_throw_away_problem_int(inference, problem, T);
    }

    public static SubLObject why_inference_chooses_to_throw_away_problem(final SubLObject inference, final SubLObject problem) {
        return inference_chooses_to_throw_away_problem_int(inference, problem, T);
    }

    public static final SubLObject inference_chooses_to_throw_away_problem_int_alt(SubLObject inference, SubLObject problem, SubLObject justifyP) {
        if (((NIL == inference_datastructures_inference.inference_allows_use_of_all_rulesP(inference)) && (NIL != inference_datastructures_problem.problem_has_dependent_link_p(problem))) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.all_dependent_links_are_forbidden_transformationsP(problem, inference))) {
            if (NIL != justifyP) {
                return $str_alt22$proof_checker_mode_is_enabled_and;
            } else {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject inference_chooses_to_throw_away_problem_int(final SubLObject inference, final SubLObject problem, final SubLObject justifyP) {
        if (((NIL != inference_datastructures_inference.inference_allows_use_of_all_rulesP(inference)) || (NIL == inference_datastructures_problem.problem_has_dependent_link_p(problem))) || (NIL == all_dependent_links_are_forbidden_transformationsP(problem, inference))) {
            return NIL;
        }
        if (NIL != justifyP) {
            return $str42$proof_checker_mode_is_enabled_and;
        }
        return T;
    }

    public static final SubLObject all_dependent_links_are_forbidden_transformationsP_alt(SubLObject problem, SubLObject inference) {
        {
            SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject link = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                        if (!((NIL != inference_worker_transformation.transformation_link_p(link)) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.transformation_forbidden_by_inferenceP(link, inference)))) {
                            return NIL;
                        }
                    }
                }
            }
        }
        return T;
    }

    public static SubLObject all_dependent_links_are_forbidden_transformationsP(final SubLObject problem, final SubLObject inference) {
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, link)) && ((NIL == inference_worker_transformation.transformation_link_p(link)) || (NIL == transformation_forbidden_by_inferenceP(link, inference)))) {
                return NIL;
            }
        }
        return T;
    }

    public static final SubLObject transformation_forbidden_by_inferenceP_alt(SubLObject transformation_link, SubLObject inference) {
        {
            SubLObject rule = inference_worker_transformation.transformation_link_rule_assertion(transformation_link);
            return makeBoolean(NIL == inference_datastructures_inference.inference_allows_use_of_ruleP(inference, rule));
        }
    }

    public static SubLObject transformation_forbidden_by_inferenceP(final SubLObject transformation_link, final SubLObject inference) {
        final SubLObject rule = inference_worker_transformation.transformation_link_rule_assertion(transformation_link);
        return makeBoolean(NIL == inference_datastructures_inference.inference_allows_use_of_ruleP(inference, rule));
    }

    public static final SubLObject inference_chooses_to_throw_away_all_transformations_on_problemP_internal_alt(SubLObject inference, SubLObject problem) {
        return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.inference_chooses_to_throw_away_all_transformations_on_problem_int(inference, problem, NIL);
    }

    public static SubLObject inference_chooses_to_throw_away_all_transformations_on_problemP_internal(final SubLObject inference, final SubLObject problem) {
        return inference_chooses_to_throw_away_all_transformations_on_problem_int(inference, problem, NIL);
    }

    public static final SubLObject inference_chooses_to_throw_away_all_transformations_on_problemP_alt(SubLObject inference, SubLObject problem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.inference_chooses_to_throw_away_all_transformations_on_problemP_internal(inference, problem);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym23$INFERENCE_CHOOSES_TO_THROW_AWAY_ALL_TRANSFORMATIONS_ON_PROBLEM_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym23$INFERENCE_CHOOSES_TO_THROW_AWAY_ALL_TRANSFORMATIONS_ON_PROBLEM_, TWO_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym23$INFERENCE_CHOOSES_TO_THROW_AWAY_ALL_TRANSFORMATIONS_ON_PROBLEM_, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(inference, problem);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw24$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (inference == cached_args.first()) {
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
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.inference_chooses_to_throw_away_all_transformations_on_problemP_internal(inference, problem)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(inference, problem));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject inference_chooses_to_throw_away_all_transformations_on_problemP(final SubLObject inference, final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_chooses_to_throw_away_all_transformations_on_problemP_internal(inference, problem);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym43$INFERENCE_CHOOSES_TO_THROW_AWAY_ALL_TRANSFORMATIONS_ON_PROBLEM_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym43$INFERENCE_CHOOSES_TO_THROW_AWAY_ALL_TRANSFORMATIONS_ON_PROBLEM_, TWO_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym43$INFERENCE_CHOOSES_TO_THROW_AWAY_ALL_TRANSFORMATIONS_ON_PROBLEM_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(inference, problem);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (inference.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && problem.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_chooses_to_throw_away_all_transformations_on_problemP_internal(inference, problem)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(inference, problem));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject why_inference_chooses_to_throw_away_all_transformations_on_problem_alt(SubLObject inference, SubLObject problem) {
        return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.inference_chooses_to_throw_away_all_transformations_on_problem_int(inference, problem, T);
    }

    public static SubLObject why_inference_chooses_to_throw_away_all_transformations_on_problem(final SubLObject inference, final SubLObject problem) {
        return inference_chooses_to_throw_away_all_transformations_on_problem_int(inference, problem, T);
    }

    public static final SubLObject inference_chooses_to_throw_away_all_transformations_on_problem_int_alt(SubLObject inference, SubLObject problem, SubLObject justifyP) {
        {
            SubLObject allow_hl_predicate_transformationP = inference_datastructures_inference.inference_allow_hl_predicate_transformationP(inference);
            SubLObject allow_unbound_predicate_transformationP = inference_datastructures_inference.inference_allow_unbound_predicate_transformationP(inference);
            SubLObject allow_evaluatable_predicate_transformationP = inference_datastructures_inference.inference_allow_evaluatable_predicate_transformationP(inference);
            if (NIL == allow_unbound_predicate_transformationP) {
                if (NIL == allow_hl_predicate_transformationP) {
                    if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.problem_uses_hl_predicateP(problem)) {
                        if (NIL == com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.collection_backchain_encouraged_problemP(problem)) {
                            if (NIL != justifyP) {
                                return $str_alt25$problem_uses_an_HL_predicate__HL_;
                            } else {
                                return T;
                            }
                        }
                    }
                }
                if (NIL == allow_evaluatable_predicate_transformationP) {
                    if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.problem_uses_evaluatable_predicateP(problem)) {
                        if (NIL != justifyP) {
                            return $str_alt26$problem_uses_an_evaluatable_predi;
                        } else {
                            return T;
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject inference_chooses_to_throw_away_all_transformations_on_problem_int(final SubLObject inference, final SubLObject problem, final SubLObject justifyP) {
        final SubLObject allow_hl_predicate_transformationP = inference_datastructures_inference.inference_allow_hl_predicate_transformationP(inference);
        final SubLObject allow_unbound_predicate_transformationP = inference_datastructures_inference.inference_allow_unbound_predicate_transformationP(inference);
        final SubLObject allow_evaluatable_predicate_transformationP = inference_datastructures_inference.inference_allow_evaluatable_predicate_transformationP(inference);
        if (NIL == allow_unbound_predicate_transformationP) {
            if (((NIL == allow_hl_predicate_transformationP) && (NIL != problem_uses_hl_predicateP(problem))) && (NIL == collection_backchain_encouraged_problemP(problem))) {
                if (NIL != justifyP) {
                    return $str44$problem_uses_an_HL_predicate__HL_;
                }
                return T;
            } else
                if ((NIL == allow_evaluatable_predicate_transformationP) && (NIL != problem_uses_evaluatable_predicateP(problem))) {
                    if (NIL != justifyP) {
                        return $str45$problem_uses_an_evaluatable_predi;
                    }
                    return T;
                }

        }
        return NIL;
    }

    /**
     * Return T iff PROBLEM is one for which collection backchaining is encouraged.
     */
    @LispMethod(comment = "Return T iff PROBLEM is one for which collection backchaining is encouraged.")
    public static final SubLObject collection_backchain_encouraged_problemP_alt(SubLObject problem) {
        {
            SubLObject asent = inference_datastructures_problem.single_literal_problem_atomic_sentence(problem);
            SubLObject mt = inference_datastructures_problem.single_literal_problem_mt(problem);
            return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.collection_backchain_encouraged_asentP(asent, mt);
        }
    }

    /**
     * Return T iff PROBLEM is one for which collection backchaining is encouraged.
     */
    @LispMethod(comment = "Return T iff PROBLEM is one for which collection backchaining is encouraged.")
    public static SubLObject collection_backchain_encouraged_problemP(final SubLObject problem) {
        final SubLObject asent = inference_datastructures_problem.single_literal_problem_atomic_sentence(problem);
        final SubLObject mt = inference_datastructures_problem.single_literal_problem_mt(problem);
        return collection_backchain_encouraged_asentP(asent, mt);
    }

    public static final SubLObject problem_uses_hl_predicateP_alt(SubLObject problem) {
        if (NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
            {
                SubLObject predicate = inference_datastructures_problem.single_literal_problem_predicate(problem);
                return hl_supports.hl_predicate_p(predicate);
            }
        }
        return NIL;
    }

    public static SubLObject problem_uses_hl_predicateP(final SubLObject problem) {
        if (NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
            final SubLObject predicate = inference_datastructures_problem.single_literal_problem_predicate(problem);
            return hl_supports.hl_predicate_p(predicate);
        }
        return NIL;
    }

    public static final SubLObject problem_uses_evaluatable_predicateP_alt(SubLObject problem) {
        if (NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
            {
                SubLObject predicate = inference_datastructures_problem.single_literal_problem_predicate(problem);
                return makeBoolean((NIL != forts.fort_p(predicate)) && (NIL != inference_trampolines.inference_evaluatable_predicateP(predicate)));
            }
        }
        return NIL;
    }

    public static SubLObject problem_uses_evaluatable_predicateP(final SubLObject problem) {
        if (NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
            final SubLObject predicate = inference_datastructures_problem.single_literal_problem_predicate(problem);
            return makeBoolean((NIL != forts.fort_p(predicate)) && (NIL != inference_trampolines.inference_evaluatable_predicateP(predicate)));
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; Whether TACTIC is redundant for STRATEGY to execute, because
    the problem store topology indicates that such a rewrite has already been done.
     */
    @LispMethod(comment = "@return booleanp; Whether TACTIC is redundant for STRATEGY to execute, because\r\nthe problem store topology indicates that such a rewrite has already been done.")
    public static final SubLObject simple_strategy_deems_rewrite_tactic_redundantP_alt(SubLObject strategy, SubLObject tactic) {
        if (NIL != inference_worker_rewrite.rewrite_tactic_p(tactic)) {
            {
                SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
                SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
                SubLObject new_module = inference_datastructures_tactic.tactic_hl_module(tactic);
                if (NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
                    {
                        SubLObject redundantP = NIL;
                        SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                        SubLObject state = NIL;
                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); !((NIL != redundantP) || (NIL != set_contents.do_set_contents_doneP(basis_object, state))); state = set_contents.do_set_contents_update_state(state)) {
                            {
                                SubLObject rewrite_link = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, rewrite_link)) {
                                    if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(rewrite_link, $REWRITE)) {
                                        {
                                            SubLObject old_tactic = inference_worker_rewrite.rewrite_link_tactic(rewrite_link);
                                            SubLObject old_module = inference_datastructures_tactic.tactic_hl_module(old_tactic);
                                            if (old_module == new_module) {
                                                {
                                                    SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(rewrite_link);
                                                    if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(supported_problem, inference)) {
                                                        redundantP = T;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return redundantP;
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; Whether TACTIC is redundant for STRATEGY to execute, because
    the problem store topology indicates that such a rewrite has already been done.
     */
    @LispMethod(comment = "@return booleanp; Whether TACTIC is redundant for STRATEGY to execute, because\r\nthe problem store topology indicates that such a rewrite has already been done.")
    public static SubLObject simple_strategy_deems_rewrite_tactic_redundantP(final SubLObject strategy, final SubLObject tactic) {
        if (NIL != inference_worker_rewrite.rewrite_tactic_p(tactic)) {
            final SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
            final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
            final SubLObject new_module = inference_datastructures_tactic.tactic_hl_module(tactic);
            if (NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
                SubLObject redundantP = NIL;
                final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
                SubLObject basis_object;
                SubLObject state;
                SubLObject rewrite_link;
                SubLObject old_tactic;
                SubLObject old_module;
                SubLObject supported_problem;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == redundantP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                    rewrite_link = set_contents.do_set_contents_next(basis_object, state);
                    if ((NIL != set_contents.do_set_contents_element_validP(state, rewrite_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(rewrite_link, $REWRITE))) {
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

    public static final SubLObject tactic_exceeds_productivity_limitP_alt(SubLObject tactic, SubLObject strategic_context) {
        if (NIL == inference_datastructures_strategy.strategy_p(strategic_context)) {
            return NIL;
        }
        {
            SubLObject productivity_limit = inference_datastructures_strategy.strategy_productivity_limit(strategic_context);
            if (NIL != inference_datastructures_enumerated_types.infinite_productivity_p(productivity_limit)) {
                return NIL;
            } else {
                {
                    SubLObject productivity = inference_datastructures_strategy.tactic_strategic_productivity(tactic, strategic_context);
                    return inference_datastructures_enumerated_types.productivity_G(productivity, productivity_limit);
                }
            }
        }
    }

    public static SubLObject tactic_exceeds_productivity_limitP(final SubLObject tactic, final SubLObject strategic_context) {
        if (NIL == inference_datastructures_strategy.strategy_p(strategic_context)) {
            return NIL;
        }
        final SubLObject productivity_limit = inference_datastructures_strategy.strategy_productivity_limit(strategic_context);
        if (NIL != inference_datastructures_enumerated_types.infinite_productivity_p(productivity_limit)) {
            return NIL;
        }
        final SubLObject productivity = inference_datastructures_strategy.tactic_strategic_productivity(tactic, strategic_context);
        return inference_datastructures_enumerated_types.productivity_G(productivity, productivity_limit);
    }

    public static final SubLObject simple_strategy_chooses_to_set_aside_transformation_tacticP_alt(SubLObject strategy, SubLObject transformation_tactic) {
        return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_set_aside_transformation_tactic_int(strategy, transformation_tactic, NIL);
    }

    public static SubLObject simple_strategy_chooses_to_set_aside_transformation_tacticP(final SubLObject strategy, final SubLObject transformation_tactic) {
        return simple_strategy_chooses_to_set_aside_transformation_tactic_int(strategy, transformation_tactic, NIL);
    }

    public static final SubLObject why_simple_strategy_chooses_to_set_aside_transformation_tactic_alt(SubLObject strategy, SubLObject transformation_tactic) {
        return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_set_aside_transformation_tactic_int(strategy, transformation_tactic, T);
    }

    public static SubLObject why_simple_strategy_chooses_to_set_aside_transformation_tactic(final SubLObject strategy, final SubLObject transformation_tactic) {
        return simple_strategy_chooses_to_set_aside_transformation_tactic_int(strategy, transformation_tactic, T);
    }

    public static final SubLObject simple_strategy_chooses_to_set_aside_transformation_tactic_int_alt(SubLObject strategy, SubLObject transformation_tactic, SubLObject justifyP) {
        {
            SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
            if (NIL != justifyP) {
                return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.why_inference_chooses_to_set_aside_transformation_tactic(inference, transformation_tactic);
            } else {
                return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.inference_chooses_to_set_aside_transformation_tacticP(inference, transformation_tactic);
            }
        }
    }

    public static SubLObject simple_strategy_chooses_to_set_aside_transformation_tactic_int(final SubLObject strategy, final SubLObject transformation_tactic, final SubLObject justifyP) {
        final SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
        if (NIL != justifyP) {
            return why_inference_chooses_to_set_aside_transformation_tactic(inference, transformation_tactic);
        }
        return inference_chooses_to_set_aside_transformation_tacticP(inference, transformation_tactic);
    }

    public static final SubLObject inference_chooses_to_set_aside_transformation_tacticP_alt(SubLObject inference, SubLObject transformation_tactic) {
        return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.inference_chooses_to_set_aside_transformation_tactic_int(inference, transformation_tactic, NIL);
    }

    public static SubLObject inference_chooses_to_set_aside_transformation_tacticP(final SubLObject inference, final SubLObject transformation_tactic) {
        return inference_chooses_to_set_aside_transformation_tactic_int(inference, transformation_tactic, NIL);
    }

    public static final SubLObject why_inference_chooses_to_set_aside_transformation_tactic_alt(SubLObject inference, SubLObject transformation_tactic) {
        return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.inference_chooses_to_set_aside_transformation_tactic_int(inference, transformation_tactic, T);
    }

    public static SubLObject why_inference_chooses_to_set_aside_transformation_tactic(final SubLObject inference, final SubLObject transformation_tactic) {
        return inference_chooses_to_set_aside_transformation_tactic_int(inference, transformation_tactic, T);
    }

    public static final SubLObject inference_chooses_to_set_aside_transformation_tactic_int_alt(SubLObject inference, SubLObject transformation_tactic, SubLObject justifyP) {
        {
            SubLObject problem = inference_datastructures_tactic.tactic_problem(transformation_tactic);
            if (NIL == inference_worker.problem_transformation_allowed_wrt_max_transformation_depthP(inference, problem)) {
                if (NIL != justifyP) {
                    return $str_alt28$problem_exceeds_max_transformatio;
                } else {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static SubLObject inference_chooses_to_set_aside_transformation_tactic_int(final SubLObject inference, final SubLObject transformation_tactic, final SubLObject justifyP) {
        final SubLObject rule = inference_worker_transformation.transformation_tactic_rule(transformation_tactic);
        if ((NIL != rule) && (NIL != inference_analysis.transformation_rule_has_insufficient_historical_utilityP(rule, inference))) {
            if (NIL != justifyP) {
                return $str35$the_rule_for_this_tactic_has_an_i;
            }
            return T;
        } else {
            final SubLObject problem = inference_datastructures_tactic.tactic_problem(transformation_tactic);
            if (NIL != inference_worker.problem_transformation_allowed_wrt_max_transformation_depthP(inference, problem)) {
                return NIL;
            }
            if (NIL != justifyP) {
                return $str47$problem_exceeds_max_transformatio;
            }
            return T;
        }
    }

    public static final SubLObject simple_strategy_chooses_to_throw_away_transformation_tacticP_internal_alt(SubLObject strategy, SubLObject transformation_tactic) {
        return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_throw_away_transformation_tactic_int(strategy, transformation_tactic, NIL);
    }

    public static SubLObject simple_strategy_chooses_to_throw_away_transformation_tacticP_internal(final SubLObject strategy, final SubLObject transformation_tactic) {
        return simple_strategy_chooses_to_throw_away_transformation_tactic_int(strategy, transformation_tactic, NIL);
    }

    public static final SubLObject simple_strategy_chooses_to_throw_away_transformation_tacticP_alt(SubLObject strategy, SubLObject transformation_tactic) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_throw_away_transformation_tacticP_internal(strategy, transformation_tactic);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym29$SIMPLE_STRATEGY_CHOOSES_TO_THROW_AWAY_TRANSFORMATION_TACTIC_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym29$SIMPLE_STRATEGY_CHOOSES_TO_THROW_AWAY_TRANSFORMATION_TACTIC_, TWO_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym29$SIMPLE_STRATEGY_CHOOSES_TO_THROW_AWAY_TRANSFORMATION_TACTIC_, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(strategy, transformation_tactic);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw24$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (strategy == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (transformation_tactic == cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_throw_away_transformation_tacticP_internal(strategy, transformation_tactic)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(strategy, transformation_tactic));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject simple_strategy_chooses_to_throw_away_transformation_tacticP(final SubLObject strategy, final SubLObject transformation_tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return simple_strategy_chooses_to_throw_away_transformation_tacticP_internal(strategy, transformation_tactic);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym48$SIMPLE_STRATEGY_CHOOSES_TO_THROW_AWAY_TRANSFORMATION_TACTIC_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym48$SIMPLE_STRATEGY_CHOOSES_TO_THROW_AWAY_TRANSFORMATION_TACTIC_, TWO_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym48$SIMPLE_STRATEGY_CHOOSES_TO_THROW_AWAY_TRANSFORMATION_TACTIC_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(strategy, transformation_tactic);
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
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && transformation_tactic.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(simple_strategy_chooses_to_throw_away_transformation_tacticP_internal(strategy, transformation_tactic)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(strategy, transformation_tactic));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject why_simple_strategy_chooses_to_throw_away_transformation_tactic_alt(SubLObject strategy, SubLObject transformation_tactic) {
        return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_throw_away_transformation_tactic_int(strategy, transformation_tactic, T);
    }

    public static SubLObject why_simple_strategy_chooses_to_throw_away_transformation_tactic(final SubLObject strategy, final SubLObject transformation_tactic) {
        return simple_strategy_chooses_to_throw_away_transformation_tactic_int(strategy, transformation_tactic, T);
    }

    public static final SubLObject simple_strategy_chooses_to_throw_away_transformation_tactic_int_alt(SubLObject strategy, SubLObject transformation_tactic, SubLObject justifyP) {
        {
            SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
            if (NIL != justifyP) {
                return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.why_inference_chooses_to_throw_away_transformation_tactic(inference, transformation_tactic);
            } else {
                return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.inference_chooses_to_throw_away_transformation_tacticP(inference, transformation_tactic);
            }
        }
    }

    public static SubLObject simple_strategy_chooses_to_throw_away_transformation_tactic_int(final SubLObject strategy, final SubLObject transformation_tactic, final SubLObject justifyP) {
        final SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
        if (NIL != justifyP) {
            return why_inference_chooses_to_throw_away_transformation_tactic(inference, transformation_tactic);
        }
        return inference_chooses_to_throw_away_transformation_tacticP(inference, transformation_tactic);
    }

    public static final SubLObject inference_chooses_to_throw_away_transformation_tacticP_alt(SubLObject inference, SubLObject transformation_tactic) {
        return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.inference_chooses_to_throw_away_transformation_tactic_int(inference, transformation_tactic, NIL);
    }

    public static SubLObject inference_chooses_to_throw_away_transformation_tacticP(final SubLObject inference, final SubLObject transformation_tactic) {
        return inference_chooses_to_throw_away_transformation_tactic_int(inference, transformation_tactic, NIL);
    }

    public static final SubLObject why_inference_chooses_to_throw_away_transformation_tactic_alt(SubLObject inference, SubLObject transformation_tactic) {
        return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.inference_chooses_to_throw_away_transformation_tactic_int(inference, transformation_tactic, T);
    }

    public static SubLObject why_inference_chooses_to_throw_away_transformation_tactic(final SubLObject inference, final SubLObject transformation_tactic) {
        return inference_chooses_to_throw_away_transformation_tactic_int(inference, transformation_tactic, T);
    }

    public static final SubLObject inference_chooses_to_throw_away_transformation_tactic_int_alt(SubLObject inference, SubLObject transformation_tactic, SubLObject justifyP) {
        {
            SubLObject rule = inference_worker_transformation.transformation_tactic_rule(transformation_tactic);
            if (NIL != rule) {
                if (NIL == inference_datastructures_inference.inference_allows_use_of_all_rulesP(inference)) {
                    if (NIL == inference_datastructures_inference.inference_allows_use_of_ruleP(inference, rule)) {
                        if (NIL != justifyP) {
                            return $str_alt30$proof_checker_mode_is_enabled__an;
                        } else {
                            return T;
                        }
                    }
                }
                if (NIL != transformation_rule_has_insufficient_historical_utilityP(rule)) {
                    if (NIL != justifyP) {
                        return $str_alt31$the_rule_for_this_tactic_has_an_i;
                    } else {
                        return T;
                    }
                }
            }
        }
        if (NIL != inference_worker_transformation.meta_transformation_tactic_p(transformation_tactic)) {
            {
                SubLObject problem = inference_datastructures_tactic.tactic_problem(transformation_tactic);
                if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.inference_chooses_to_throw_away_all_transformations_on_problemP(inference, problem)) {
                    if (NIL != justifyP) {
                        return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.why_inference_chooses_to_throw_away_all_transformations_on_problem(inference, problem);
                    } else {
                        return T;
                    }
                }
            }
        }
        {
            SubLObject allow_hl_predicate_transformationP = inference_datastructures_inference.inference_allow_hl_predicate_transformationP(inference);
            if ((NIL == allow_hl_predicate_transformationP) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.tactic_requires_hl_predicate_transformationP(transformation_tactic))) {
                if (NIL != justifyP) {
                    return $str_alt32$tactic_requires_HL_predicate_tran;
                } else {
                    return T;
                }
            }
        }
        {
            SubLObject allow_unbound_predicate_transformationP = inference_datastructures_inference.inference_allow_unbound_predicate_transformationP(inference);
            if ((NIL == allow_unbound_predicate_transformationP) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.tactic_requires_unbound_predicate_transformationP(transformation_tactic))) {
                if (NIL != justifyP) {
                    return $str_alt33$tactic_requires_unbound_predicate;
                } else {
                    return T;
                }
            }
        }
        {
            SubLObject allow_evaluatable_predicate_transformationP = inference_datastructures_inference.inference_allow_evaluatable_predicate_transformationP(inference);
            if ((NIL == allow_evaluatable_predicate_transformationP) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.tactic_requires_evaluatable_predicate_transformationP(transformation_tactic))) {
                if (NIL != justifyP) {
                    return $str_alt34$tactic_requires_evaluatable_predi;
                } else {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static SubLObject inference_chooses_to_throw_away_transformation_tactic_int(final SubLObject inference, final SubLObject transformation_tactic, final SubLObject justifyP) {
        final SubLObject rule = inference_worker_transformation.transformation_tactic_rule(transformation_tactic);
        if (((NIL != rule) && (NIL == inference_datastructures_inference.inference_allows_use_of_all_rulesP(inference))) && (NIL == inference_datastructures_inference.inference_allows_use_of_ruleP(inference, rule))) {
            if (NIL != justifyP) {
                return $str49$proof_checker_mode_is_enabled__an;
            }
            return T;
        } else {
            if (NIL != inference_worker_transformation.meta_transformation_tactic_p(transformation_tactic)) {
                final SubLObject problem = inference_datastructures_tactic.tactic_problem(transformation_tactic);
                if (NIL != inference_chooses_to_throw_away_all_transformations_on_problemP(inference, problem)) {
                    if (NIL != justifyP) {
                        return why_inference_chooses_to_throw_away_all_transformations_on_problem(inference, problem);
                    }
                    return T;
                }
            }
            final SubLObject allow_hl_predicate_transformationP = inference_datastructures_inference.inference_allow_hl_predicate_transformationP(inference);
            if ((NIL == allow_hl_predicate_transformationP) && (NIL != tactic_requires_hl_predicate_transformationP(transformation_tactic))) {
                if (NIL != justifyP) {
                    return $str50$tactic_requires_HL_predicate_tran;
                }
                return T;
            } else {
                final SubLObject allow_unbound_predicate_transformationP = inference_datastructures_inference.inference_allow_unbound_predicate_transformationP(inference);
                if ((NIL == allow_unbound_predicate_transformationP) && (NIL != tactic_requires_unbound_predicate_transformationP(transformation_tactic))) {
                    if (NIL != justifyP) {
                        return $str51$tactic_requires_unbound_predicate;
                    }
                    return T;
                } else {
                    final SubLObject allow_evaluatable_predicate_transformationP = inference_datastructures_inference.inference_allow_evaluatable_predicate_transformationP(inference);
                    if ((NIL != allow_evaluatable_predicate_transformationP) || (NIL == tactic_requires_evaluatable_predicate_transformationP(transformation_tactic))) {
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

    public static final SubLObject strategy_disallows_use_of_hl_module_on_problemP_alt(SubLObject strategy, SubLObject hl_module, SubLObject problem) {
        {
            SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
            SubLObject allow_hl_predicate_transformationP = inference_datastructures_inference.inference_allow_hl_predicate_transformationP(inference);
            if ((NIL == allow_hl_predicate_transformationP) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.hl_module_requires_hl_predicate_transformationP(hl_module, problem))) {
                return T;
            }
            {
                SubLObject allow_unbound_predicate_transformationP = inference_datastructures_inference.inference_allow_unbound_predicate_transformationP(inference);
                if ((NIL == allow_unbound_predicate_transformationP) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.hl_module_requires_unbound_predicate_transformationP(hl_module))) {
                    return T;
                }
            }
            {
                SubLObject allow_evaluatable_predicate_transformationP = inference_datastructures_inference.inference_allow_evaluatable_predicate_transformationP(inference);
                if ((NIL == allow_evaluatable_predicate_transformationP) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.problem_uses_evaluatable_predicateP(problem))) {
                    return T;
                }
            }
            return NIL;
        }
    }

    public static SubLObject strategy_disallows_use_of_hl_module_on_problemP(final SubLObject strategy, final SubLObject hl_module, final SubLObject problem) {
        final SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
        final SubLObject allow_hl_predicate_transformationP = inference_datastructures_inference.inference_allow_hl_predicate_transformationP(inference);
        if ((NIL == allow_hl_predicate_transformationP) && (NIL != hl_module_requires_hl_predicate_transformationP(hl_module, problem))) {
            return T;
        }
        final SubLObject allow_unbound_predicate_transformationP = inference_datastructures_inference.inference_allow_unbound_predicate_transformationP(inference);
        if ((NIL == allow_unbound_predicate_transformationP) && (NIL != hl_module_requires_unbound_predicate_transformationP(hl_module))) {
            return T;
        }
        final SubLObject allow_evaluatable_predicate_transformationP = inference_datastructures_inference.inference_allow_evaluatable_predicate_transformationP(inference);
        if ((NIL == allow_evaluatable_predicate_transformationP) && (NIL != problem_uses_evaluatable_predicateP(problem))) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject tactic_requires_hl_predicate_transformationP_alt(SubLObject tactic) {
        {
            SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
            SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
            return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.hl_module_requires_hl_predicate_transformationP(hl_module, problem);
        }
    }

    public static SubLObject tactic_requires_hl_predicate_transformationP(final SubLObject tactic) {
        final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        return hl_module_requires_hl_predicate_transformationP(hl_module, problem);
    }

    public static final SubLObject hl_module_requires_hl_predicate_transformationP_alt(SubLObject hl_module, SubLObject problem) {
        if (NIL != inference_modules.transformation_module_p(hl_module)) {
            if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.hl_module_only_applies_to_hl_predicatesP(hl_module)) {
                return makeBoolean(!((NIL != inference_datastructures_problem.single_literal_problem_p(problem)) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.collection_backchain_encouraged_problemP(problem))));
            } else {
                if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.problem_uses_hl_predicateP(problem)) {
                    return makeBoolean(NIL == inference_modules.meta_transformation_module_p(hl_module));
                } else {
                    return NIL;
                }
            }
        }
        return NIL;
    }

    public static SubLObject hl_module_requires_hl_predicate_transformationP(final SubLObject hl_module, final SubLObject problem) {
        if (NIL == inference_modules.transformation_module_p(hl_module)) {
            return NIL;
        }
        if (NIL != hl_module_only_applies_to_hl_predicatesP(hl_module)) {
            return makeBoolean((NIL == inference_datastructures_problem.single_literal_problem_p(problem)) || (NIL == collection_backchain_encouraged_problemP(problem)));
        }
        if (NIL != problem_uses_hl_predicateP(problem)) {
            return makeBoolean(NIL == inference_modules.meta_transformation_module_p(hl_module));
        }
        return NIL;
    }

    public static final SubLObject collection_backchain_encouraged_tacticP_alt(SubLObject tactic) {
        {
            SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
            if (NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
                return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.collection_backchain_encouraged_problemP(problem);
            }
        }
        return NIL;
    }

    public static SubLObject collection_backchain_encouraged_tacticP(final SubLObject tactic) {
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        if (NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
            return collection_backchain_encouraged_problemP(problem);
        }
        return NIL;
    }

    public static final SubLObject collection_backchain_encouraged_asentP_alt(SubLObject asent, SubLObject mt) {
        {
            SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            SubLObject resultP = NIL;
            if (NIL != subl_promotions.memberP(predicate, $list_alt35, UNPROVIDED, UNPROVIDED)) {
                {
                    SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                    if (NIL != forts.fort_p(collection)) {
                        if (predicate.eql($$isa)) {
                            resultP = makeBoolean((NIL != inference_trampolines.inference_collection_backchain_encouragedP(collection, mt)) || (NIL != inference_trampolines.inference_collection_isa_backchain_encouragedP(collection, mt)));
                        } else {
                            if (predicate.eql($$genls)) {
                                resultP = makeBoolean((NIL != inference_trampolines.inference_collection_backchain_encouragedP(collection, mt)) || (NIL != inference_trampolines.inference_collection_genls_backchain_encouragedP(collection, mt)));
                            }
                        }
                    }
                }
                return resultP;
            }
        }
        return NIL;
    }

    public static SubLObject collection_backchain_encouraged_asentP(final SubLObject asent, final SubLObject mt) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject resultP = NIL;
        if (NIL != subl_promotions.memberP(predicate, $list53, UNPROVIDED, UNPROVIDED)) {
            final SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            if (NIL != forts.fort_p(collection)) {
                if (predicate.eql($$isa)) {
                    resultP = makeBoolean((NIL != inference_trampolines.inference_collection_backchain_encouragedP(collection, mt)) || (NIL != inference_trampolines.inference_collection_isa_backchain_encouragedP(collection, mt)));
                } else
                    if (predicate.eql($$genls)) {
                        resultP = makeBoolean((NIL != inference_trampolines.inference_collection_backchain_encouragedP(collection, mt)) || (NIL != inference_trampolines.inference_collection_genls_backchain_encouragedP(collection, mt)));
                    }

            }
            return resultP;
        }
        return NIL;
    }

    public static final SubLObject tactic_problem_uses_hl_predicateP_alt(SubLObject tactic) {
        {
            SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
            return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.problem_uses_hl_predicateP(problem);
        }
    }

    public static SubLObject tactic_problem_uses_hl_predicateP(final SubLObject tactic) {
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        return problem_uses_hl_predicateP(problem);
    }

    public static final SubLObject transformation_tactic_only_applies_to_hl_predicatesP_alt(SubLObject tactic) {
        return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.hl_module_only_applies_to_hl_predicatesP(inference_datastructures_tactic.tactic_hl_module(tactic));
    }

    public static SubLObject transformation_tactic_only_applies_to_hl_predicatesP(final SubLObject tactic) {
        return hl_module_only_applies_to_hl_predicatesP(inference_datastructures_tactic.tactic_hl_module(tactic));
    }

    public static final SubLObject hl_module_only_applies_to_hl_predicatesP_alt(SubLObject hl_module) {
        {
            SubLObject predicate = inference_modules.hl_module_predicate(hl_module);
            return hl_supports.hl_predicate_p(predicate);
        }
    }

    public static SubLObject hl_module_only_applies_to_hl_predicatesP(final SubLObject hl_module) {
        final SubLObject predicate = inference_modules.hl_module_predicate(hl_module);
        return hl_supports.hl_predicate_p(predicate);
    }

    public static final SubLObject tactic_requires_unbound_predicate_transformationP_alt(SubLObject tactic) {
        if (NIL != inference_worker_transformation.transformation_tactic_p(tactic)) {
            {
                SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
                return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.hl_module_requires_unbound_predicate_transformationP(hl_module);
            }
        }
        return NIL;
    }

    public static SubLObject tactic_requires_unbound_predicate_transformationP(final SubLObject tactic) {
        if (NIL != inference_worker_transformation.transformation_tactic_p(tactic)) {
            final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
            return hl_module_requires_unbound_predicate_transformationP(hl_module);
        }
        return NIL;
    }

    public static final SubLObject hl_module_requires_unbound_predicate_transformationP_alt(SubLObject hl_module) {
        return transformation_modules.trans_unbound_predicate_module_p(hl_module);
    }

    public static SubLObject hl_module_requires_unbound_predicate_transformationP(final SubLObject hl_module) {
        return transformation_modules.trans_unbound_predicate_module_p(hl_module);
    }

    public static final SubLObject tactic_requires_evaluatable_predicate_transformationP_alt(SubLObject tactic) {
        if (NIL != inference_worker_transformation.transformation_tactic_p(tactic)) {
            {
                SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
                return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.problem_uses_evaluatable_predicateP(problem);
            }
        }
        return NIL;
    }

    public static SubLObject tactic_requires_evaluatable_predicate_transformationP(final SubLObject tactic) {
        if (NIL != inference_worker_transformation.transformation_tactic_p(tactic)) {
            final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
            return problem_uses_evaluatable_predicateP(problem);
        }
        return NIL;
    }

    public static final SubLObject tactic_completeP_alt(SubLObject tactic, SubLObject strategic_context) {
        return eq($COMPLETE, inference_datastructures_strategy.tactic_strategic_completeness(tactic, strategic_context));
    }

    public static SubLObject tactic_completeP(final SubLObject tactic, final SubLObject strategic_context) {
        return eq($COMPLETE, inference_datastructures_strategy.tactic_strategic_completeness(tactic, strategic_context));
    }

    public static final SubLObject tactic_incompleteP_alt(SubLObject tactic, SubLObject strategic_context) {
        return eq($INCOMPLETE, inference_datastructures_strategy.tactic_strategic_completeness(tactic, strategic_context));
    }

    public static SubLObject tactic_incompleteP(final SubLObject tactic, final SubLObject strategic_context) {
        return eq($INCOMPLETE, inference_datastructures_strategy.tactic_strategic_completeness(tactic, strategic_context));
    }

    public static final SubLObject tactic_impossibleP_alt(SubLObject tactic, SubLObject strategic_context) {
        return eq($IMPOSSIBLE, inference_datastructures_strategy.tactic_strategic_completeness(tactic, strategic_context));
    }

    public static SubLObject tactic_impossibleP(final SubLObject tactic, final SubLObject strategic_context) {
        return eq($IMPOSSIBLE, inference_datastructures_strategy.tactic_strategic_completeness(tactic, strategic_context));
    }

    public static final SubLObject tactic_preferredP_alt(SubLObject tactic, SubLObject strategic_context) {
        return eq($PREFERRED, inference_datastructures_strategy.tactic_strategic_preference_level(tactic, strategic_context));
    }

    public static SubLObject tactic_preferredP(final SubLObject tactic, final SubLObject strategic_context) {
        return eq($PREFERRED, inference_datastructures_strategy.tactic_strategic_preference_level(tactic, strategic_context));
    }

    public static final SubLObject tactic_dispreferredP_alt(SubLObject tactic, SubLObject strategic_context) {
        return eq($DISPREFERRED, inference_datastructures_strategy.tactic_strategic_preference_level(tactic, strategic_context));
    }

    public static SubLObject tactic_dispreferredP(final SubLObject tactic, final SubLObject strategic_context) {
        return eq($DISPREFERRED, inference_datastructures_strategy.tactic_strategic_preference_level(tactic, strategic_context));
    }

    public static final SubLObject tactic_disallowedP_alt(SubLObject tactic, SubLObject strategic_context) {
        return eq($DISALLOWED, inference_datastructures_strategy.tactic_strategic_preference_level(tactic, strategic_context));
    }

    public static SubLObject tactic_disallowedP(final SubLObject tactic, final SubLObject strategic_context) {
        return eq($DISALLOWED, inference_datastructures_strategy.tactic_strategic_preference_level(tactic, strategic_context));
    }

    public static SubLObject tactic_doomedP(final SubLObject tactic, final SubLObject strategic_context) {
        return eq($DOOMED, inference_datastructures_strategy.tactic_strategic_preference_level(tactic, strategic_context));
    }

    public static SubLObject tactic_disallowed_or_doomedP(final SubLObject tactic, final SubLObject strategic_context) {
        return makeBoolean((NIL != tactic_disallowedP(tactic, strategic_context)) || (NIL != tactic_doomedP(tactic, strategic_context)));
    }

    public static final SubLObject problem_has_executed_a_complete_tacticP_alt(SubLObject problem, SubLObject strategic_context, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $CONTENT;
        }
        if (NIL == inference_datastructures_problem_store.problem_store_removal_allowedP(inference_datastructures_problem.problem_store(problem))) {
            return NIL;
        }
        {
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
            SubLObject tactic = NIL;
            for (tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tactic = cdolist_list_var.first()) {
                if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, type)) && (NIL != inference_datastructures_problem.do_problem_tactics_status_match(tactic, $EXECUTED))) {
                    if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.tactic_completeP(tactic, strategic_context)) {
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject problem_has_executed_a_complete_tacticP(final SubLObject problem, final SubLObject strategic_context, SubLObject type) {
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
            if (((NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, type)) && (NIL != inference_datastructures_problem.do_problem_tactics_status_match(tactic, $EXECUTED))) && (NIL != tactic_completeP(tactic, strategic_context))) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether any lookahead problem of any connected conjunction tactic on PROBLEM has executed a complete tactic
     */
    @LispMethod(comment = "@return booleanp; whether any lookahead problem of any connected conjunction tactic on PROBLEM has executed a complete tactic")
    public static final SubLObject lookahead_problem_has_executed_a_complete_tacticP_alt(SubLObject problem, SubLObject strategic_context, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $CONTENT;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
                SubLObject jo_tactic = NIL;
                for (jo_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , jo_tactic = cdolist_list_var.first()) {
                    if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(jo_tactic, $JOIN_ORDERED)) {
                        if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.problem_has_executed_a_complete_tacticP(inference_worker_join_ordered.join_ordered_tactic_lookahead_problem(jo_tactic), strategic_context, type)) {
                            return T;
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
                SubLObject join_tactic = NIL;
                for (join_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , join_tactic = cdolist_list_var.first()) {
                    if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(join_tactic, $JOIN)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject lookahead_1 = inference_worker_join.join_tactic_lookahead_problems(join_tactic);
                            SubLObject lookahead_2 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if ((NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.problem_has_executed_a_complete_tacticP(lookahead_1, strategic_context, type)) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.problem_has_executed_a_complete_tacticP(lookahead_2, strategic_context, type))) {
                                return T;
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
     * @return booleanp; whether any lookahead problem of any connected conjunction tactic on PROBLEM has executed a complete tactic
     */
    @LispMethod(comment = "@return booleanp; whether any lookahead problem of any connected conjunction tactic on PROBLEM has executed a complete tactic")
    public static SubLObject lookahead_problem_has_executed_a_complete_tacticP(final SubLObject problem, final SubLObject strategic_context, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $CONTENT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject jo_tactic = NIL;
        jo_tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(jo_tactic, $JOIN_ORDERED)) && (NIL != problem_has_executed_a_complete_tacticP(inference_worker_join_ordered.join_ordered_tactic_lookahead_problem(jo_tactic), strategic_context, type))) {
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
                final SubLObject lookahead_1 = inference_worker_join.join_tactic_lookahead_problems(join_tactic);
                final SubLObject lookahead_2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != problem_has_executed_a_complete_tacticP(lookahead_1, strategic_context, type)) || (NIL != problem_has_executed_a_complete_tacticP(lookahead_2, strategic_context, type))) {
                    return T;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            join_tactic = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject problem_or_lookahead_problem_has_executed_a_complete_tacticP_alt(SubLObject problem, SubLObject strategic_context, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $CONTENT;
        }
        return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.problem_has_executed_a_complete_tacticP(problem, strategic_context, type)) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.lookahead_problem_has_executed_a_complete_tacticP(problem, strategic_context, type)));
    }

    public static SubLObject problem_or_lookahead_problem_has_executed_a_complete_tacticP(final SubLObject problem, final SubLObject strategic_context, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $CONTENT;
        }
        return makeBoolean((NIL != problem_has_executed_a_complete_tacticP(problem, strategic_context, type)) || (NIL != lookahead_problem_has_executed_a_complete_tacticP(problem, strategic_context, type)));
    }

    public static final SubLObject problem_has_executed_a_preferred_tacticP_alt(SubLObject problem, SubLObject strategic_context, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $LOGICAL;
        }
        {
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
            SubLObject tactic = NIL;
            for (tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tactic = cdolist_list_var.first()) {
                if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, type)) && (NIL != inference_datastructures_problem.do_problem_tactics_status_match(tactic, $EXECUTED))) {
                    if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.tactic_preferredP(tactic, strategic_context)) {
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject problem_has_executed_a_preferred_tacticP(final SubLObject problem, final SubLObject strategic_context, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $LOGICAL;
        }
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (((NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, type)) && (NIL != inference_datastructures_problem.do_problem_tactics_status_match(tactic, $EXECUTED))) && (NIL != tactic_preferredP(tactic, strategic_context))) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject problem_has_executed_a_tactic_of_typeP_alt(SubLObject problem, SubLObject type) {
        {
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
            SubLObject tactic = NIL;
            for (tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tactic = cdolist_list_var.first()) {
                if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, type)) && (NIL != inference_datastructures_problem.do_problem_tactics_status_match(tactic, $EXECUTED))) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static SubLObject problem_has_executed_a_tactic_of_typeP(final SubLObject problem, final SubLObject type) {
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, type)) && (NIL != inference_datastructures_problem.do_problem_tactics_status_match(tactic, $EXECUTED))) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject strategy_admits_tactic_wrt_proof_specP_alt(SubLObject strategy, SubLObject tactic) {
        if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.strategy_admits_all_tactics_wrt_proof_specP(strategy)) {
            return T;
        }
        {
            SubLObject proof_spec = inference_datastructures_strategy.strategy_problem_proof_spec(strategy, inference_datastructures_tactic.tactic_problem(tactic));
            return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.proof_spec_admits_tacticP(proof_spec, tactic);
        }
    }

    public static SubLObject strategy_admits_tactic_wrt_proof_specP(final SubLObject strategy, final SubLObject tactic) {
        if (NIL != strategy_admits_all_tactics_wrt_proof_specP(strategy)) {
            return T;
        }
        final SubLObject proof_spec = inference_datastructures_strategy.strategy_problem_proof_spec(strategy, inference_datastructures_tactic.tactic_problem(tactic));
        return proof_spec_admits_tacticP(proof_spec, tactic);
    }

    public static final SubLObject strategy_admits_all_tactics_wrt_proof_specP_alt(SubLObject strategy) {
        return eq($ANYTHING, inference_datastructures_strategy.strategy_proof_spec(strategy));
    }

    public static SubLObject strategy_admits_all_tactics_wrt_proof_specP(final SubLObject strategy) {
        return eq($ANYTHING, inference_datastructures_strategy.strategy_proof_spec(strategy));
    }

    public static final SubLObject proof_spec_admits_tacticP_alt(SubLObject proof_spec, SubLObject tactic) {
        if ($ANYTHING == proof_spec) {
            return T;
        } else {
            if ($NOTHING == proof_spec) {
                return NIL;
            } else {
                if (NIL != inference_proof_spec.or_pattern_p(proof_spec)) {
                    return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.disjunctive_proof_spec_admits_tacticP(proof_spec, tactic);
                } else {
                    if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.meta_tactic_p(tactic)) {
                        return T;
                    } else {
                        if (NIL != inference_worker_removal.removal_tactic_p(tactic)) {
                            return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.proof_spec_admits_removal_tacticP(proof_spec, tactic);
                        } else {
                            if (NIL != inference_worker_join_ordered.join_ordered_tactic_p(tactic)) {
                                return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.proof_spec_admits_join_ordered_tacticP(proof_spec, tactic);
                            } else {
                                if (NIL != inference_worker_join.join_tactic_p(tactic)) {
                                    return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.proof_spec_admits_join_tacticP(proof_spec, tactic);
                                } else {
                                    if (NIL != inference_worker_split.meta_split_tactic_p(tactic)) {
                                        return T;
                                    } else {
                                        if (NIL != inference_worker_split.split_tactic_p(tactic)) {
                                            return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.proof_spec_admits_split_tacticP(proof_spec, tactic);
                                        } else {
                                            if (NIL != inference_worker_restriction.simplification_tactic_p(tactic)) {
                                                return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.proof_spec_admits_simplification_tacticP(proof_spec, tactic);
                                            } else {
                                                if (NIL != inference_worker_removal.conjunctive_removal_tactic_p(tactic)) {
                                                    return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.proof_spec_admits_conjuctive_removal_tacticP(proof_spec, tactic);
                                                } else {
                                                    if (NIL != inference_worker_transformation.transformation_tactic_p(tactic)) {
                                                        return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.proof_spec_admits_transformation_tacticP(proof_spec, tactic);
                                                    } else {
                                                        if (NIL != inference_worker_union.union_tactic_p(tactic)) {
                                                            return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.proof_spec_admits_union_tacticP(proof_spec, tactic);
                                                        } else {
                                                            return Errors.error($str_alt51$Time_to_support_proof_spec_admitt, inference_datastructures_tactic.tactic_type(tactic));
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
                }
            }
        }
    }

    public static SubLObject proof_spec_admits_tacticP(final SubLObject proof_spec, final SubLObject tactic) {
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

    public static final SubLObject meta_tactic_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_tactic.tactic_p(v_object)) && (((NIL != inference_worker_removal.meta_removal_tactic_p(v_object)) || (NIL != inference_worker_transformation.meta_transformation_tactic_p(v_object))) || (NIL != inference_worker_split.meta_split_tactic_p(v_object))));
    }

    public static SubLObject meta_tactic_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_tactic.tactic_p(v_object)) && (((NIL != inference_worker_removal.meta_removal_tactic_p(v_object)) || (NIL != inference_worker_transformation.meta_transformation_tactic_p(v_object))) || (NIL != inference_worker_split.meta_split_tactic_p(v_object))));
    }

    public static final SubLObject disjunctive_proof_spec_admits_tacticP_alt(SubLObject proof_spec, SubLObject tactic) {
        {
            SubLObject datum = proof_spec;
            SubLObject current = datum;
            SubLObject operator = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt52);
            operator = current.first();
            current = current.rest();
            {
                SubLObject sub_specs = current;
                SubLObject cdolist_list_var = sub_specs;
                SubLObject sub_spec = NIL;
                for (sub_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sub_spec = cdolist_list_var.first()) {
                    if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.proof_spec_admits_tacticP(sub_spec, tactic)) {
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject disjunctive_proof_spec_admits_tacticP(final SubLObject proof_spec, final SubLObject tactic) {
        SubLObject operator = NIL;
        destructuring_bind_must_consp(proof_spec, proof_spec, $list71);
        operator = proof_spec.first();
        final SubLObject current = proof_spec.rest();
        SubLObject cdolist_list_var;
        final SubLObject sub_specs = cdolist_list_var = current;
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

    public static final SubLObject proof_spec_admits_removal_tacticP_alt(SubLObject proof_spec, SubLObject removal_tactic) {
        if (NIL != inference_proof_spec.removal_proof_spec_p(proof_spec)) {
            return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.removal_proof_spec_admits_removal_tacticP(proof_spec, removal_tactic);
        }
        if (NIL != inference_proof_spec.restriction_proof_spec_p(proof_spec)) {
            return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.restriction_proof_spec_admits_removal_tacticP(proof_spec, removal_tactic);
        }
        return NIL;
    }

    public static SubLObject proof_spec_admits_removal_tacticP(final SubLObject proof_spec, final SubLObject removal_tactic) {
        if (NIL != inference_proof_spec.removal_proof_spec_p(proof_spec)) {
            return removal_proof_spec_admits_removal_tacticP(proof_spec, removal_tactic);
        }
        if (NIL != inference_proof_spec.restriction_proof_spec_p(proof_spec)) {
            return restriction_proof_spec_admits_removal_tacticP(proof_spec, removal_tactic);
        }
        return NIL;
    }

    public static final SubLObject proof_spec_admits_join_ordered_tacticP_alt(SubLObject proof_spec, SubLObject join_ordered_tactic) {
        if (NIL != inference_proof_spec.join_ordered_proof_spec_p(proof_spec)) {
            return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.join_ordered_proof_spec_admits_join_ordered_tacticP(proof_spec, join_ordered_tactic);
        }
        if (NIL != inference_proof_spec.residual_transformation_proof_spec_p(proof_spec)) {
            return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.residual_transformation_proof_spec_admits_join_ordered_tacticP(proof_spec, join_ordered_tactic);
        }
        return NIL;
    }

    public static SubLObject proof_spec_admits_join_ordered_tacticP(final SubLObject proof_spec, final SubLObject join_ordered_tactic) {
        if (NIL != inference_proof_spec.join_ordered_proof_spec_p(proof_spec)) {
            return join_ordered_proof_spec_admits_join_ordered_tacticP(proof_spec, join_ordered_tactic);
        }
        if (NIL != inference_proof_spec.residual_transformation_proof_spec_p(proof_spec)) {
            return residual_transformation_proof_spec_admits_join_ordered_tacticP(proof_spec, join_ordered_tactic);
        }
        return NIL;
    }

    public static final SubLObject proof_spec_admits_join_tacticP_alt(SubLObject proof_spec, SubLObject join_tactic) {
        if (NIL != inference_proof_spec.join_proof_spec_p(proof_spec)) {
            return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.join_proof_spec_admits_join_tacticP(proof_spec, join_tactic);
        }
        return NIL;
    }

    public static SubLObject proof_spec_admits_join_tacticP(final SubLObject proof_spec, final SubLObject join_tactic) {
        if (NIL != inference_proof_spec.join_proof_spec_p(proof_spec)) {
            return join_proof_spec_admits_join_tacticP(proof_spec, join_tactic);
        }
        return NIL;
    }

    public static final SubLObject proof_spec_admits_split_tacticP_alt(SubLObject proof_spec, SubLObject split_tactic) {
        if (NIL != inference_proof_spec.split_proof_spec_p(proof_spec)) {
            return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.split_proof_spec_admits_split_proof_tacticP(proof_spec, split_tactic);
        }
        return NIL;
    }

    public static SubLObject proof_spec_admits_split_tacticP(final SubLObject proof_spec, final SubLObject split_tactic) {
        if (NIL != inference_proof_spec.split_proof_spec_p(proof_spec)) {
            return split_proof_spec_admits_split_proof_tacticP(proof_spec, split_tactic);
        }
        return NIL;
    }

    public static final SubLObject proof_spec_admits_simplification_tacticP_alt(SubLObject proof_spec, SubLObject tactic) {
        if (NIL != inference_proof_spec.restriction_proof_spec_p(proof_spec)) {
            return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.restriction_proof_spec_admits_simplification_tacticP(proof_spec, tactic);
        }
        return NIL;
    }

    public static SubLObject proof_spec_admits_simplification_tacticP(final SubLObject proof_spec, final SubLObject tactic) {
        if (NIL != inference_proof_spec.restriction_proof_spec_p(proof_spec)) {
            return restriction_proof_spec_admits_simplification_tacticP(proof_spec, tactic);
        }
        return NIL;
    }

    public static final SubLObject proof_spec_admits_conjuctive_removal_tacticP_alt(SubLObject proof_spec, SubLObject tactic) {
        if (NIL != inference_proof_spec.conjunctive_removal_proof_spec_p(proof_spec)) {
            return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.conjunctive_removal_proof_spec_admits_conjunctive_removal_tacticP(proof_spec, tactic);
        }
        return NIL;
    }

    public static SubLObject proof_spec_admits_conjuctive_removal_tacticP(final SubLObject proof_spec, final SubLObject tactic) {
        if (NIL != inference_proof_spec.conjunctive_removal_proof_spec_p(proof_spec)) {
            return conjunctive_removal_proof_spec_admits_conjunctive_removal_tacticP(proof_spec, tactic);
        }
        return NIL;
    }

    public static final SubLObject proof_spec_admits_transformation_tacticP_alt(SubLObject proof_spec, SubLObject tactic) {
        if (NIL != inference_proof_spec.transformation_proof_spec_p(proof_spec)) {
            return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.transformation_proof_spec_admits_transformation_tacticP(proof_spec, tactic);
        }
        return NIL;
    }

    public static SubLObject proof_spec_admits_transformation_tacticP(final SubLObject proof_spec, final SubLObject tactic) {
        if (NIL != inference_proof_spec.transformation_proof_spec_p(proof_spec)) {
            return transformation_proof_spec_admits_transformation_tacticP(proof_spec, tactic);
        }
        return NIL;
    }

    public static final SubLObject proof_spec_admits_union_tacticP_alt(SubLObject proof_spec, SubLObject union_tactic) {
        if (NIL != inference_proof_spec.union_proof_spec_p(proof_spec)) {
            return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.union_proof_spec_admits_union_tacticP(proof_spec, union_tactic);
        }
        return NIL;
    }

    public static SubLObject proof_spec_admits_union_tacticP(final SubLObject proof_spec, final SubLObject union_tactic) {
        if (NIL != inference_proof_spec.union_proof_spec_p(proof_spec)) {
            return union_proof_spec_admits_union_tacticP(proof_spec, union_tactic);
        }
        return NIL;
    }

    public static final SubLObject removal_proof_spec_admits_removal_tacticP_alt(SubLObject removal_proof_spec, SubLObject removal_tactic) {
        {
            SubLObject datum = removal_proof_spec;
            SubLObject current = datum;
            SubLObject removal_token = NIL;
            SubLObject literal_spec = NIL;
            SubLObject removal_module_spec = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt53);
            removal_token = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt53);
            literal_spec = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt53);
            removal_module_spec = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject problem = inference_datastructures_tactic.tactic_problem(removal_tactic);
                    SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(removal_tactic);
                    return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.literal_spec_admits_single_literal_problemP(literal_spec, problem)) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.removal_module_spec_admits_removal_module(removal_module_spec, hl_module)));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt53);
            }
        }
        return NIL;
    }

    public static SubLObject removal_proof_spec_admits_removal_tacticP(final SubLObject removal_proof_spec, final SubLObject removal_tactic) {
        SubLObject removal_token = NIL;
        SubLObject literal_spec = NIL;
        SubLObject removal_module_spec = NIL;
        destructuring_bind_must_consp(removal_proof_spec, removal_proof_spec, $list72);
        removal_token = removal_proof_spec.first();
        SubLObject current = removal_proof_spec.rest();
        destructuring_bind_must_consp(current, removal_proof_spec, $list72);
        literal_spec = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, removal_proof_spec, $list72);
        removal_module_spec = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject problem = inference_datastructures_tactic.tactic_problem(removal_tactic);
            final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(removal_tactic);
            return makeBoolean((NIL != literal_spec_admits_single_literal_problemP(literal_spec, problem)) && (NIL != removal_module_spec_admits_removal_module(removal_module_spec, hl_module)));
        }
        cdestructuring_bind_error(removal_proof_spec, $list72);
        return NIL;
    }

    public static final SubLObject restriction_proof_spec_admits_removal_tacticP_alt(SubLObject restriction_proof_spec, SubLObject removal_tactic) {
        {
            SubLObject datum = restriction_proof_spec;
            SubLObject current = datum;
            SubLObject restriction_token = NIL;
            SubLObject sub_spec = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt54);
            restriction_token = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt54);
            sub_spec = current.first();
            current = current.rest();
            if (NIL == current) {
                return com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.proof_spec_admits_tacticP(sub_spec, removal_tactic);
            } else {
                cdestructuring_bind_error(datum, $list_alt54);
            }
        }
        return NIL;
    }

    public static SubLObject restriction_proof_spec_admits_removal_tacticP(final SubLObject restriction_proof_spec, final SubLObject removal_tactic) {
        SubLObject restriction_token = NIL;
        SubLObject sub_spec = NIL;
        destructuring_bind_must_consp(restriction_proof_spec, restriction_proof_spec, $list73);
        restriction_token = restriction_proof_spec.first();
        SubLObject current = restriction_proof_spec.rest();
        destructuring_bind_must_consp(current, restriction_proof_spec, $list73);
        sub_spec = current.first();
        current = current.rest();
        if (NIL == current) {
            return proof_spec_admits_tacticP(sub_spec, removal_tactic);
        }
        cdestructuring_bind_error(restriction_proof_spec, $list73);
        return NIL;
    }

    /**
     * This assumes that the look-ahead tactics have been created; this will not be true for
     * meta-splits. If this ever changes i.e. that the look-aheads will not be available yet
     * we will have to tread more softly.
     */
    @LispMethod(comment = "This assumes that the look-ahead tactics have been created; this will not be true for\r\nmeta-splits. If this ever changes i.e. that the look-aheads will not be available yet\r\nwe will have to tread more softly.\nThis assumes that the look-ahead tactics have been created; this will not be true for\nmeta-splits. If this ever changes i.e. that the look-aheads will not be available yet\nwe will have to tread more softly.")
    public static final SubLObject split_proof_spec_admits_split_proof_tacticP_alt(SubLObject split_proof_spec, SubLObject split_tactic) {
        {
            SubLObject split_link = inference_worker_split.split_tactic_link(split_tactic);
            SubLObject split_sub_proof_specs = inference_proof_spec.split_proof_spec_sub_proof_specs(split_proof_spec);
            SubLObject matchedP = NIL;
            SubLObject link_var = split_link;
            SubLObject rest = NIL;
            for (rest = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var); !((NIL != matchedP) || (NIL == rest)); rest = rest.rest()) {
                {
                    SubLObject supporting_mapped_problem = rest.first();
                    if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem)) {
                        {
                            SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                            SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                            if (NIL == matchedP) {
                                {
                                    SubLObject csome_list_var = split_sub_proof_specs;
                                    SubLObject sub_proof_spec = NIL;
                                    for (sub_proof_spec = csome_list_var.first(); !((NIL != matchedP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , sub_proof_spec = csome_list_var.first()) {
                                        if (NIL == matchedP) {
                                            {
                                                SubLObject csome_list_var_1 = inference_datastructures_problem.problem_tactics(supporting_problem);
                                                SubLObject tactic = NIL;
                                                for (tactic = csome_list_var_1.first(); !((NIL != matchedP) || (NIL == csome_list_var_1)); csome_list_var_1 = csome_list_var_1.rest() , tactic = csome_list_var_1.first()) {
                                                    matchedP = com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.proof_spec_admits_tacticP(sub_proof_spec, tactic);
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
            return matchedP;
        }
    }

    /**
     * This assumes that the look-ahead tactics have been created; this will not be true for
     * meta-splits. If this ever changes i.e. that the look-aheads will not be available yet
     * we will have to tread more softly.
     */
    @LispMethod(comment = "This assumes that the look-ahead tactics have been created; this will not be true for\r\nmeta-splits. If this ever changes i.e. that the look-aheads will not be available yet\r\nwe will have to tread more softly.\nThis assumes that the look-ahead tactics have been created; this will not be true for\nmeta-splits. If this ever changes i.e. that the look-aheads will not be available yet\nwe will have to tread more softly.")
    public static SubLObject split_proof_spec_admits_split_proof_tacticP(final SubLObject split_proof_spec, final SubLObject split_tactic) {
        final SubLObject split_link = inference_worker_split.split_tactic_link(split_tactic);
        final SubLObject split_sub_proof_specs = inference_proof_spec.split_proof_spec_sub_proof_specs(split_proof_spec);
        SubLObject matchedP = NIL;
        final SubLObject link_var = split_link;
        SubLObject rest;
        SubLObject supporting_mapped_problem;
        SubLObject supporting_problem;
        SubLObject variable_map;
        SubLObject csome_list_var;
        SubLObject sub_proof_spec;
        SubLObject csome_list_var_$2;
        SubLObject tactic;
        for (rest = NIL, rest = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var); (NIL == matchedP) && (NIL != rest); rest = rest.rest()) {
            supporting_mapped_problem = rest.first();
            if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem)) {
                supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                if (NIL == matchedP) {
                    csome_list_var = split_sub_proof_specs;
                    sub_proof_spec = NIL;
                    sub_proof_spec = csome_list_var.first();
                    while ((NIL == matchedP) && (NIL != csome_list_var)) {
                        if (NIL == matchedP) {
                            for (csome_list_var_$2 = inference_datastructures_problem.problem_tactics(supporting_problem), tactic = NIL, tactic = csome_list_var_$2.first(); (NIL == matchedP) && (NIL != csome_list_var_$2); matchedP = proof_spec_admits_tacticP(sub_proof_spec, tactic) , csome_list_var_$2 = csome_list_var_$2.rest() , tactic = csome_list_var_$2.first()) {
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

    public static final SubLObject restriction_proof_spec_admits_simplification_tacticP_alt(SubLObject proof_spec, SubLObject simplification_tactic) {
        return T;
    }

    public static SubLObject restriction_proof_spec_admits_simplification_tacticP(final SubLObject proof_spec, final SubLObject simplification_tactic) {
        return T;
    }

    public static final SubLObject conjunctive_removal_proof_spec_admits_conjunctive_removal_tacticP_alt(SubLObject proof_spec, SubLObject conjunctive_removal_tactic) {
        return T;
    }

    public static SubLObject conjunctive_removal_proof_spec_admits_conjunctive_removal_tacticP(final SubLObject proof_spec, final SubLObject conjunctive_removal_tactic) {
        return T;
    }

    public static final SubLObject join_ordered_proof_spec_admits_join_ordered_tacticP_alt(SubLObject proof_spec, SubLObject join_ordered_tactic) {
        {
            SubLObject focal_proof_spec = inference_proof_spec.join_ordered_proof_spec_focal_proof_spec(proof_spec);
            SubLObject focal_problem = inference_worker_join_ordered.join_ordered_tactic_lookahead_problem(join_ordered_tactic);
            return inference_proof_spec.proof_spec_possibly_admits_problemP(focal_proof_spec, focal_problem);
        }
    }

    public static SubLObject join_ordered_proof_spec_admits_join_ordered_tacticP(final SubLObject proof_spec, final SubLObject join_ordered_tactic) {
        final SubLObject focal_proof_spec = inference_proof_spec.join_ordered_proof_spec_focal_proof_spec(proof_spec);
        final SubLObject focal_problem = inference_worker_join_ordered.join_ordered_tactic_lookahead_problem(join_ordered_tactic);
        return inference_proof_spec.proof_spec_possibly_admits_problemP(focal_proof_spec, focal_problem);
    }

    public static final SubLObject union_proof_spec_admits_union_tacticP_alt(SubLObject proof_spec, SubLObject union_tactic) {
        {
            SubLObject disjunct_proof_spec = inference_proof_spec.union_proof_spec_disjunct_proof_spec(proof_spec);
            SubLObject disjunct_problem = inference_worker_union.union_tactic_lookahead_problem(union_tactic);
            return inference_proof_spec.proof_spec_possibly_admits_problemP(disjunct_proof_spec, disjunct_problem);
        }
    }

    public static SubLObject union_proof_spec_admits_union_tacticP(final SubLObject proof_spec, final SubLObject union_tactic) {
        final SubLObject disjunct_proof_spec = inference_proof_spec.union_proof_spec_disjunct_proof_spec(proof_spec);
        final SubLObject disjunct_problem = inference_worker_union.union_tactic_lookahead_problem(union_tactic);
        return inference_proof_spec.proof_spec_possibly_admits_problemP(disjunct_proof_spec, disjunct_problem);
    }

    public static final SubLObject residual_transformation_proof_spec_admits_join_ordered_tacticP_alt(SubLObject proof_spec, SubLObject join_ordered_tactic) {
        return T;
    }

    public static SubLObject residual_transformation_proof_spec_admits_join_ordered_tacticP(final SubLObject proof_spec, final SubLObject join_ordered_tactic) {
        return T;
    }

    public static final SubLObject join_proof_spec_admits_join_tacticP_alt(SubLObject proof_spec, SubLObject join_tactic) {
        return T;
    }

    public static SubLObject join_proof_spec_admits_join_tacticP(final SubLObject proof_spec, final SubLObject join_tactic) {
        return T;
    }

    public static final SubLObject transformation_proof_spec_admits_transformation_tacticP_alt(SubLObject transformation_proof_spec, SubLObject transformation_tactic) {
        {
            SubLObject datum = transformation_proof_spec;
            SubLObject current = datum;
            SubLObject transformation_token = NIL;
            SubLObject literal_spec = NIL;
            SubLObject transformation_module_spec = NIL;
            SubLObject rule_spec = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt55);
            transformation_token = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt55);
            literal_spec = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt55);
            transformation_module_spec = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt55);
            rule_spec = current.first();
            current = current.rest();
            {
                SubLObject sub_spec = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt55);
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject problem = inference_datastructures_tactic.tactic_problem(transformation_tactic);
                        SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(transformation_tactic);
                        SubLObject rule = inference_worker_transformation.transformation_tactic_rule(transformation_tactic);
                        return makeBoolean(((NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.literal_spec_admits_single_literal_problemP(literal_spec, problem)) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.transformation_module_spec_admits_transformation_module(transformation_module_spec, hl_module))) && ((NIL == rule) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.rule_spec_admits_rule(rule_spec, rule))));
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt55);
                }
            }
        }
        return NIL;
    }

    public static SubLObject transformation_proof_spec_admits_transformation_tacticP(final SubLObject transformation_proof_spec, final SubLObject transformation_tactic) {
        SubLObject transformation_token = NIL;
        SubLObject literal_spec = NIL;
        SubLObject transformation_module_spec = NIL;
        SubLObject rule_spec = NIL;
        destructuring_bind_must_consp(transformation_proof_spec, transformation_proof_spec, $list74);
        transformation_token = transformation_proof_spec.first();
        SubLObject current = transformation_proof_spec.rest();
        destructuring_bind_must_consp(current, transformation_proof_spec, $list74);
        literal_spec = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, transformation_proof_spec, $list74);
        transformation_module_spec = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, transformation_proof_spec, $list74);
        rule_spec = current.first();
        current = current.rest();
        final SubLObject sub_spec = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, transformation_proof_spec, $list74);
        current = current.rest();
        if (NIL == current) {
            final SubLObject problem = inference_datastructures_tactic.tactic_problem(transformation_tactic);
            final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(transformation_tactic);
            final SubLObject rule = inference_worker_transformation.transformation_tactic_rule(transformation_tactic);
            return makeBoolean(((NIL != literal_spec_admits_single_literal_problemP(literal_spec, problem)) && (NIL != transformation_module_spec_admits_transformation_module(transformation_module_spec, hl_module))) && ((NIL == rule) || (NIL != rule_spec_admits_rule(rule_spec, rule))));
        }
        cdestructuring_bind_error(transformation_proof_spec, $list74);
        return NIL;
    }

    /**
     *
     *
     * @param CLAUSE
    clause-p
     * 		
     * @return listp of ist-sentence-p's
     */
    @LispMethod(comment = "@param CLAUSE\nclause-p\r\n\t\t\r\n@return listp of ist-sentence-p\'s")
    public static final SubLObject ist_sentences_from_clause_alt(SubLObject clause) {
        {
            SubLObject ist_sentences = NIL;
            SubLObject datum = clause;
            SubLObject current = datum;
            SubLObject neg_lits = NIL;
            SubLObject pos_lits = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt56);
            neg_lits = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt56);
            pos_lits = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject cdolist_list_var = neg_lits;
                    SubLObject neg_lit = NIL;
                    for (neg_lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , neg_lit = cdolist_list_var.first()) {
                        {
                            SubLObject datum_2 = neg_lit;
                            SubLObject current_3 = datum_2;
                            SubLObject mt = NIL;
                            SubLObject sentence = NIL;
                            destructuring_bind_must_consp(current_3, datum_2, $list_alt57);
                            mt = current_3.first();
                            current_3 = current_3.rest();
                            destructuring_bind_must_consp(current_3, datum_2, $list_alt57);
                            sentence = current_3.first();
                            current_3 = current_3.rest();
                            if (NIL == current_3) {
                                ist_sentences = cons(list($$ist, mt, list($$not, sentence)), ist_sentences);
                            } else {
                                cdestructuring_bind_error(datum_2, $list_alt57);
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = pos_lits;
                    SubLObject pos_lit = NIL;
                    for (pos_lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pos_lit = cdolist_list_var.first()) {
                        {
                            SubLObject datum_4 = pos_lit;
                            SubLObject current_5 = datum_4;
                            SubLObject mt = NIL;
                            SubLObject sentence = NIL;
                            destructuring_bind_must_consp(current_5, datum_4, $list_alt57);
                            mt = current_5.first();
                            current_5 = current_5.rest();
                            destructuring_bind_must_consp(current_5, datum_4, $list_alt57);
                            sentence = current_5.first();
                            current_5 = current_5.rest();
                            if (NIL == current_5) {
                                ist_sentences = cons(list($$ist, mt, sentence), ist_sentences);
                            } else {
                                cdestructuring_bind_error(datum_4, $list_alt57);
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt56);
            }
            return nreverse(ist_sentences);
        }
    }

    /**
     *
     *
     * @param CLAUSE
    clause-p
     * 		
     * @return listp of ist-sentence-p's
     */
    @LispMethod(comment = "@param CLAUSE\nclause-p\r\n\t\t\r\n@return listp of ist-sentence-p\'s")
    public static SubLObject ist_sentences_from_clause(final SubLObject clause) {
        SubLObject ist_sentences = NIL;
        SubLObject neg_lits = NIL;
        SubLObject pos_lits = NIL;
        destructuring_bind_must_consp(clause, clause, $list75);
        neg_lits = clause.first();
        SubLObject current = clause.rest();
        destructuring_bind_must_consp(current, clause, $list75);
        pos_lits = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject cdolist_list_var = neg_lits;
            SubLObject neg_lit = NIL;
            neg_lit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current_$4;
                final SubLObject datum_$3 = current_$4 = neg_lit;
                SubLObject mt = NIL;
                SubLObject sentence = NIL;
                destructuring_bind_must_consp(current_$4, datum_$3, $list76);
                mt = current_$4.first();
                current_$4 = current_$4.rest();
                destructuring_bind_must_consp(current_$4, datum_$3, $list76);
                sentence = current_$4.first();
                current_$4 = current_$4.rest();
                if (NIL == current_$4) {
                    ist_sentences = cons(list($$ist, mt, list($$not, sentence)), ist_sentences);
                } else {
                    cdestructuring_bind_error(datum_$3, $list76);
                }
                cdolist_list_var = cdolist_list_var.rest();
                neg_lit = cdolist_list_var.first();
            } 
            cdolist_list_var = pos_lits;
            SubLObject pos_lit = NIL;
            pos_lit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current_$5;
                final SubLObject datum_$4 = current_$5 = pos_lit;
                SubLObject mt = NIL;
                SubLObject sentence = NIL;
                destructuring_bind_must_consp(current_$5, datum_$4, $list76);
                mt = current_$5.first();
                current_$5 = current_$5.rest();
                destructuring_bind_must_consp(current_$5, datum_$4, $list76);
                sentence = current_$5.first();
                current_$5 = current_$5.rest();
                if (NIL == current_$5) {
                    ist_sentences = cons(list($$ist, mt, sentence), ist_sentences);
                } else {
                    cdestructuring_bind_error(datum_$4, $list76);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pos_lit = cdolist_list_var.first();
            } 
        } else {
            cdestructuring_bind_error(clause, $list75);
        }
        return nreverse(ist_sentences);
    }

    public static final SubLObject single_literal_pattern_p_alt(SubLObject proof_spec_pattern) {
        return ist_sentence_p(proof_spec_pattern);
    }

    public static SubLObject single_literal_pattern_p(final SubLObject proof_spec_pattern) {
        return ist_sentence_p(proof_spec_pattern, UNPROVIDED);
    }

    public static final SubLObject literal_spec_admits_single_literal_problemP_alt(SubLObject literal_spec, SubLObject problem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject problem_mt = inference_datastructures_problem.mt_asent_sense_from_single_literal_problem(problem);
                SubLObject problem_asent = thread.secondMultipleValue();
                SubLObject problem_sense = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                {
                    SubLObject spec_mt = com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.mt_asent_sense_from_ist_literal(literal_spec);
                    SubLObject spec_asent = thread.secondMultipleValue();
                    SubLObject spec_sense = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    return makeBoolean(((problem_sense == spec_sense) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.proof_spec_mt_spec_admits_mtP(spec_mt, problem_mt))) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.proof_spec_asent_spec_admits_asentP(spec_asent, problem_asent)));
                }
            }
        }
    }

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
        return makeBoolean((problem_sense.eql(spec_sense) && (NIL != proof_spec_mt_spec_admits_mtP(spec_mt, problem_mt))) && (NIL != proof_spec_asent_spec_admits_asentP(spec_asent, problem_asent)));
    }

    public static final SubLObject mt_asent_sense_from_ist_literal_alt(SubLObject ist_literal) {
        {
            SubLObject mt = cycl_utilities.formula_arg1(ist_literal, UNPROVIDED);
            SubLObject asent = cycl_utilities.formula_arg2(ist_literal, UNPROVIDED);
            SubLObject sense = $POS;
            if (NIL != el_negation_p(asent)) {
                sense = $NEG;
                asent = cycl_utilities.formula_arg1(asent, UNPROVIDED);
            }
            return values(mt, asent, sense);
        }
    }

    public static SubLObject mt_asent_sense_from_ist_literal(final SubLObject ist_literal) {
        final SubLObject mt = cycl_utilities.formula_arg1(ist_literal, UNPROVIDED);
        SubLObject asent = cycl_utilities.formula_arg2(ist_literal, UNPROVIDED);
        SubLObject sense = $POS;
        if (NIL != el_negation_p(asent)) {
            sense = $NEG;
            asent = cycl_utilities.formula_arg1(asent, UNPROVIDED);
        }
        return values(mt, asent, sense);
    }

    public static final SubLObject removal_module_spec_admits_removal_module_alt(SubLObject removal_module_spec, SubLObject hl_module) {
        return makeBoolean((NIL != inference_modules.removal_module_p(hl_module)) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.hl_module_spec_admits_hl_module(removal_module_spec, hl_module)));
    }

    public static SubLObject removal_module_spec_admits_removal_module(final SubLObject removal_module_spec, final SubLObject hl_module) {
        return makeBoolean((NIL != inference_modules.removal_module_p(hl_module)) && (NIL != hl_module_spec_admits_hl_module(removal_module_spec, hl_module)));
    }

    public static final SubLObject transformation_module_spec_admits_transformation_module_alt(SubLObject transformation_module_spec, SubLObject hl_module) {
        return makeBoolean((NIL != inference_modules.transformation_module_p(hl_module)) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness.hl_module_spec_admits_hl_module(transformation_module_spec, hl_module)));
    }

    public static SubLObject transformation_module_spec_admits_transformation_module(final SubLObject transformation_module_spec, final SubLObject hl_module) {
        return makeBoolean((NIL != inference_modules.transformation_module_p(hl_module)) && (NIL != hl_module_spec_admits_hl_module(transformation_module_spec, hl_module)));
    }

    public static final SubLObject proof_spec_mt_spec_admits_mtP_alt(SubLObject spec_mt, SubLObject mt) {
        return makeBoolean((NIL != unification.unify_possible(spec_mt, mt)) || (NIL != formula_pattern_match.pattern_matches_formula(spec_mt, mt)));
    }

    public static SubLObject proof_spec_mt_spec_admits_mtP(final SubLObject spec_mt, final SubLObject mt) {
        return makeBoolean((NIL != unification.unify_possible(spec_mt, mt)) || (NIL != formula_pattern_match.pattern_matches_formula(spec_mt, mt)));
    }

    public static final SubLObject proof_spec_asent_spec_admits_asentP_alt(SubLObject spec_asent, SubLObject problem_asent) {
        return makeBoolean(((NIL != unification.unify_possible(spec_asent, problem_asent)) || (NIL != formula_pattern_match.pattern_matches_formula(spec_asent, problem_asent))) || (NIL != unification.unify_possible(subst(variables.get_variable(ZERO_INTEGER), $ANYTHING, spec_asent, UNPROVIDED, UNPROVIDED), problem_asent)));
    }

    public static SubLObject proof_spec_asent_spec_admits_asentP(final SubLObject spec_asent, final SubLObject problem_asent) {
        return makeBoolean(((NIL != unification.unify_possible(spec_asent, problem_asent)) || (NIL != formula_pattern_match.pattern_matches_formula(spec_asent, problem_asent))) || (NIL != unification.unify_possible(subst(variables.get_variable(ZERO_INTEGER), $ANYTHING, spec_asent, UNPROVIDED, UNPROVIDED), problem_asent)));
    }

    public static final SubLObject hl_module_spec_admits_hl_module_alt(SubLObject hl_module_spec, SubLObject hl_module) {
        if (NIL != inference_modules.hl_module_p(hl_module)) {
            {
                SubLObject module_name = inference_modules.hl_module_name(hl_module);
                return pattern_match.pattern_matches_tree(hl_module_spec, module_name);
            }
        }
        return NIL;
    }

    public static SubLObject hl_module_spec_admits_hl_module(final SubLObject hl_module_spec, final SubLObject hl_module) {
        if (NIL != inference_modules.hl_module_p(hl_module)) {
            final SubLObject module_name = inference_modules.hl_module_name(hl_module);
            return pattern_match.pattern_matches_tree(hl_module_spec, module_name);
        }
        return NIL;
    }

    public static final SubLObject rule_spec_admits_rule_alt(SubLObject rule_spec, SubLObject rule) {
        if (NIL != assertions_high.rule_assertionP(rule)) {
            return pattern_match.pattern_matches_tree(rule_spec, rule);
        }
        return NIL;
    }

    public static SubLObject rule_spec_admits_rule(final SubLObject rule_spec, final SubLObject rule) {
        if (NIL != assertions_high.rule_assertionP(rule)) {
            return pattern_match.pattern_matches_tree(rule_spec, rule);
        }
        return NIL;
    }

    public static SubLObject declare_inference_tactician_strategic_uninterestingness_file() {
        declareFunction("the_unknown_strategy_uninterestingness_explanation_p", "THE-UNKNOWN-STRATEGY-UNINTERESTINGNESS-EXPLANATION-P", 1, 0, false);
        declareFunction("strategy_last_uninterestingness_explanation", "STRATEGY-LAST-UNINTERESTINGNESS-EXPLANATION", 0, 0, false);
        declareMacro("with_strategy_uninterestingness_explanations", "WITH-STRATEGY-UNINTERESTINGNESS-EXPLANATIONS");
        declareMacro("without_strategy_uninterestingness_explanations", "WITHOUT-STRATEGY-UNINTERESTINGNESS-EXPLANATIONS");
        declareFunction("strategy_note_uninterestingness_explanation", "STRATEGY-NOTE-UNINTERESTINGNESS-EXPLANATION", 5, 0, false);
        declareFunction("strategy_possibly_note_exact_uninterestingness_explanation", "STRATEGY-POSSIBLY-NOTE-EXACT-UNINTERESTINGNESS-EXPLANATION", 1, 0, false);
        declareMacro("strategy_possibly_note_uninterestingness_explanation", "STRATEGY-POSSIBLY-NOTE-UNINTERESTINGNESS-EXPLANATION");
        declareFunction("strategy_possibly_un_note_uninterestingness_explanation", "STRATEGY-POSSIBLY-UN-NOTE-UNINTERESTINGNESS-EXPLANATION", 0, 0, false);
        declareFunction("strategy_uninterestingness_explanation_string", "STRATEGY-UNINTERESTINGNESS-EXPLANATION-STRING", 1, 0, false);
        declareFunction("strategy_uninterestingness_explanation_type_p", "STRATEGY-UNINTERESTINGNESS-EXPLANATION-TYPE-P", 1, 0, false);
        declareFunction("strategy_uninterestingness_explanation_p", "STRATEGY-UNINTERESTINGNESS-EXPLANATION-P", 1, 0, false);
        declareFunction("strategy_uninterestingness_subexplanation_p", "STRATEGY-UNINTERESTINGNESS-SUBEXPLANATION-P", 1, 0, false);
        declareFunction("make_strategy_uninterestingness_explanation", "MAKE-STRATEGY-UNINTERESTINGNESS-EXPLANATION", 1, 4, false);
        declareFunction("strategy_uninterestingness_explanation_type", "STRATEGY-UNINTERESTINGNESS-EXPLANATION-TYPE", 1, 0, false);
        declareFunction("strategic_uninterestingness_reason_p", "STRATEGIC-UNINTERESTINGNESS-REASON-P", 1, 0, false);
        declareFunction("strategy_chooses_to_throw_away_problemP", "STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM?", 2, 1, false);
        declareFunction("why_strategy_chooses_to_throw_away_problem", "WHY-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM", 2, 0, false);
        declareFunction("strategy_chooses_to_throw_away_tacticP", "STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC?", 4, 0, false);
        declareFunction("legacy_strategy_chooses_to_throw_away_tacticP", "LEGACY-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC?", 2, 1, false);
        declareFunction("legacy_strategy_chooses_to_ignore_tacticP", "LEGACY-STRATEGY-CHOOSES-TO-IGNORE-TACTIC?", 2, 1, false);
        declareFunction("why_strategy_chooses_to_throw_away_tactic", "WHY-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC", 2, 0, false);
        declareFunction("strategy_chooses_to_set_aside_problemP", "STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM?", 2, 0, false);
        declareFunction("why_strategy_chooses_to_set_aside_problem", "WHY-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM", 2, 0, false);
        declareFunction("strategy_chooses_to_set_aside_tacticP", "STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC?", 4, 0, false);
        declareFunction("legacy_strategy_chooses_to_set_aside_tacticP", "LEGACY-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC?", 2, 1, false);
        declareFunction("why_strategy_chooses_to_set_aside_tactic", "WHY-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC", 2, 0, false);
        declareFunction("strategy_chooses_to_ignore_tacticP", "STRATEGY-CHOOSES-TO-IGNORE-TACTIC?", 2, 1, false);
        declareFunction("simple_strategy_chooses_to_throw_away_problemP", "SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM?", 2, 0, false);
        declareFunction("why_simple_strategy_chooses_to_throw_away_problem", "WHY-SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM", 2, 0, false);
        declareFunction("simple_strategy_chooses_to_throw_away_problem_int", "SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM-INT", 3, 0, false);
        declareFunction("simple_strategy_chooses_to_throw_away_tacticP", "SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC?", 2, 0, false);
        declareFunction("why_simple_strategy_chooses_to_throw_away_tactic", "WHY-SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC", 2, 0, false);
        declareFunction("simple_strategy_chooses_to_throw_away_tactic_int", "SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-INT", 3, 0, false);
        declareFunction("problem_has_executed_a_complete_removal_tacticP", "PROBLEM-HAS-EXECUTED-A-COMPLETE-REMOVAL-TACTIC?", 2, 0, false);
        declareFunction("lookahead_problem_has_executed_a_complete_removal_tacticP", "LOOKAHEAD-PROBLEM-HAS-EXECUTED-A-COMPLETE-REMOVAL-TACTIC?", 2, 0, false);
        declareFunction("problem_or_lookahead_problem_has_executed_a_complete_removal_tacticP", "PROBLEM-OR-LOOKAHEAD-PROBLEM-HAS-EXECUTED-A-COMPLETE-REMOVAL-TACTIC?", 2, 0, false);
        declareFunction("problem_has_executed_a_generalized_removal_tacticP", "PROBLEM-HAS-EXECUTED-A-GENERALIZED-REMOVAL-TACTIC?", 1, 0, false);
        declareFunction("strategy_allows_use_of_tactic_hl_moduleP", "STRATEGY-ALLOWS-USE-OF-TACTIC-HL-MODULE?", 2, 0, false);
        declareFunction("strategy_allows_use_of_hl_moduleP", "STRATEGY-ALLOWS-USE-OF-HL-MODULE?", 2, 0, false);
        declareFunction("simple_strategy_chooses_to_set_aside_problemP", "SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM?", 2, 0, false);
        declareFunction("why_simple_strategy_chooses_to_set_aside_problem", "WHY-SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM", 2, 0, false);
        declareFunction("simple_strategy_chooses_to_set_aside_problem_int", "SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM-INT", 3, 0, false);
        declareFunction("simple_strategy_chooses_to_set_aside_tacticP", "SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC?", 2, 0, false);
        declareFunction("why_simple_strategy_chooses_to_set_aside_tactic", "WHY-SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC", 2, 0, false);
        declareFunction("simple_strategy_chooses_to_set_aside_tactic_int", "SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC-INT", 3, 0, false);
        declareFunction("simple_strategy_chooses_to_ignore_problemP", "SIMPLE-STRATEGY-CHOOSES-TO-IGNORE-PROBLEM?", 2, 0, false);
        declareFunction("simple_strategy_chooses_to_ignore_tacticP", "SIMPLE-STRATEGY-CHOOSES-TO-IGNORE-TACTIC?", 2, 0, false);
        declareFunction("problem_strategically_pendingP", "PROBLEM-STRATEGICALLY-PENDING?", 2, 0, false);
        declareFunction("strategy_deems_problem_tactically_uninterestingP", "STRATEGY-DEEMS-PROBLEM-TACTICALLY-UNINTERESTING?", 2, 0, false);
        declareFunction("strategy_has_enough_proofs_for_problemP", "STRATEGY-HAS-ENOUGH-PROOFS-FOR-PROBLEM?", 2, 0, false);
        declareFunction("tactically_uninteresting_problem_p", "TACTICALLY-UNINTERESTING-PROBLEM-P", 1, 0, false);
        declareFunction("strategy_deems_problem_strategically_uninterestingP", "STRATEGY-DEEMS-PROBLEM-STRATEGICALLY-UNINTERESTING?", 2, 0, false);
        declareFunction("strategically_uninteresting_problem_p", "STRATEGICALLY-UNINTERESTING-PROBLEM-P", 2, 0, false);
        declareFunction("problem_has_relevant_supporting_problemP", "PROBLEM-HAS-RELEVANT-SUPPORTING-PROBLEM?", 3, 0, false);
        declareFunction("problem_has_interesting_transformation_tacticsP", "PROBLEM-HAS-INTERESTING-TRANSFORMATION-TACTICS?", 2, 0, false);
        declareFunction("problem_no_tactics_strategically_possibleP", "PROBLEM-NO-TACTICS-STRATEGICALLY-POSSIBLE?", 2, 0, false);
        declareFunction("inference_chooses_to_set_aside_problemP", "INFERENCE-CHOOSES-TO-SET-ASIDE-PROBLEM?", 2, 0, false);
        declareFunction("why_inference_chooses_to_set_aside_problem", "WHY-INFERENCE-CHOOSES-TO-SET-ASIDE-PROBLEM", 2, 0, false);
        declareFunction("inference_chooses_to_set_aside_problem_int", "INFERENCE-CHOOSES-TO-SET-ASIDE-PROBLEM-INT", 3, 0, false);
        declareFunction("inference_chooses_to_throw_away_problemP", "INFERENCE-CHOOSES-TO-THROW-AWAY-PROBLEM?", 2, 0, false);
        declareFunction("why_inference_chooses_to_throw_away_problem", "WHY-INFERENCE-CHOOSES-TO-THROW-AWAY-PROBLEM", 2, 0, false);
        declareFunction("inference_chooses_to_throw_away_problem_int", "INFERENCE-CHOOSES-TO-THROW-AWAY-PROBLEM-INT", 3, 0, false);
        declareFunction("all_dependent_links_are_forbidden_transformationsP", "ALL-DEPENDENT-LINKS-ARE-FORBIDDEN-TRANSFORMATIONS?", 2, 0, false);
        declareFunction("transformation_forbidden_by_inferenceP", "TRANSFORMATION-FORBIDDEN-BY-INFERENCE?", 2, 0, false);
        declareFunction("inference_chooses_to_throw_away_all_transformations_on_problemP_internal", "INFERENCE-CHOOSES-TO-THROW-AWAY-ALL-TRANSFORMATIONS-ON-PROBLEM?-INTERNAL", 2, 0, false);
        declareFunction("inference_chooses_to_throw_away_all_transformations_on_problemP", "INFERENCE-CHOOSES-TO-THROW-AWAY-ALL-TRANSFORMATIONS-ON-PROBLEM?", 2, 0, false);
        declareFunction("why_inference_chooses_to_throw_away_all_transformations_on_problem", "WHY-INFERENCE-CHOOSES-TO-THROW-AWAY-ALL-TRANSFORMATIONS-ON-PROBLEM", 2, 0, false);
        declareFunction("inference_chooses_to_throw_away_all_transformations_on_problem_int", "INFERENCE-CHOOSES-TO-THROW-AWAY-ALL-TRANSFORMATIONS-ON-PROBLEM-INT", 3, 0, false);
        declareFunction("collection_backchain_encouraged_problemP", "COLLECTION-BACKCHAIN-ENCOURAGED-PROBLEM?", 1, 0, false);
        declareFunction("problem_uses_hl_predicateP", "PROBLEM-USES-HL-PREDICATE?", 1, 0, false);
        declareFunction("problem_uses_evaluatable_predicateP", "PROBLEM-USES-EVALUATABLE-PREDICATE?", 1, 0, false);
        declareFunction("simple_strategy_deems_rewrite_tactic_redundantP", "SIMPLE-STRATEGY-DEEMS-REWRITE-TACTIC-REDUNDANT?", 2, 0, false);
        declareFunction("tactic_exceeds_productivity_limitP", "TACTIC-EXCEEDS-PRODUCTIVITY-LIMIT?", 2, 0, false);
        declareFunction("simple_strategy_chooses_to_set_aside_transformation_tacticP", "SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-TRANSFORMATION-TACTIC?", 2, 0, false);
        declareFunction("why_simple_strategy_chooses_to_set_aside_transformation_tactic", "WHY-SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-TRANSFORMATION-TACTIC", 2, 0, false);
        declareFunction("simple_strategy_chooses_to_set_aside_transformation_tactic_int", "SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-TRANSFORMATION-TACTIC-INT", 3, 0, false);
        declareFunction("inference_chooses_to_set_aside_transformation_tacticP", "INFERENCE-CHOOSES-TO-SET-ASIDE-TRANSFORMATION-TACTIC?", 2, 0, false);
        declareFunction("why_inference_chooses_to_set_aside_transformation_tactic", "WHY-INFERENCE-CHOOSES-TO-SET-ASIDE-TRANSFORMATION-TACTIC", 2, 0, false);
        declareFunction("inference_chooses_to_set_aside_transformation_tactic_int", "INFERENCE-CHOOSES-TO-SET-ASIDE-TRANSFORMATION-TACTIC-INT", 3, 0, false);
        declareFunction("simple_strategy_chooses_to_throw_away_transformation_tacticP_internal", "SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC?-INTERNAL", 2, 0, false);
        declareFunction("simple_strategy_chooses_to_throw_away_transformation_tacticP", "SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC?", 2, 0, false);
        declareFunction("why_simple_strategy_chooses_to_throw_away_transformation_tactic", "WHY-SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC", 2, 0, false);
        declareFunction("simple_strategy_chooses_to_throw_away_transformation_tactic_int", "SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC-INT", 3, 0, false);
        declareFunction("inference_chooses_to_throw_away_transformation_tacticP", "INFERENCE-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC?", 2, 0, false);
        declareFunction("why_inference_chooses_to_throw_away_transformation_tactic", "WHY-INFERENCE-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC", 2, 0, false);
        declareFunction("inference_chooses_to_throw_away_transformation_tactic_int", "INFERENCE-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC-INT", 3, 0, false);
        declareFunction("strategy_disallows_use_of_hl_module_on_problemP", "STRATEGY-DISALLOWS-USE-OF-HL-MODULE-ON-PROBLEM?", 3, 0, false);
        declareFunction("tactic_requires_hl_predicate_transformationP", "TACTIC-REQUIRES-HL-PREDICATE-TRANSFORMATION?", 1, 0, false);
        declareFunction("hl_module_requires_hl_predicate_transformationP", "HL-MODULE-REQUIRES-HL-PREDICATE-TRANSFORMATION?", 2, 0, false);
        declareFunction("collection_backchain_encouraged_tacticP", "COLLECTION-BACKCHAIN-ENCOURAGED-TACTIC?", 1, 0, false);
        declareFunction("collection_backchain_encouraged_asentP", "COLLECTION-BACKCHAIN-ENCOURAGED-ASENT?", 2, 0, false);
        declareFunction("tactic_problem_uses_hl_predicateP", "TACTIC-PROBLEM-USES-HL-PREDICATE?", 1, 0, false);
        declareFunction("transformation_tactic_only_applies_to_hl_predicatesP", "TRANSFORMATION-TACTIC-ONLY-APPLIES-TO-HL-PREDICATES?", 1, 0, false);
        declareFunction("hl_module_only_applies_to_hl_predicatesP", "HL-MODULE-ONLY-APPLIES-TO-HL-PREDICATES?", 1, 0, false);
        declareFunction("tactic_requires_unbound_predicate_transformationP", "TACTIC-REQUIRES-UNBOUND-PREDICATE-TRANSFORMATION?", 1, 0, false);
        declareFunction("hl_module_requires_unbound_predicate_transformationP", "HL-MODULE-REQUIRES-UNBOUND-PREDICATE-TRANSFORMATION?", 1, 0, false);
        declareFunction("tactic_requires_evaluatable_predicate_transformationP", "TACTIC-REQUIRES-EVALUATABLE-PREDICATE-TRANSFORMATION?", 1, 0, false);
        declareFunction("tactic_completeP", "TACTIC-COMPLETE?", 2, 0, false);
        declareFunction("tactic_incompleteP", "TACTIC-INCOMPLETE?", 2, 0, false);
        declareFunction("tactic_impossibleP", "TACTIC-IMPOSSIBLE?", 2, 0, false);
        declareFunction("tactic_preferredP", "TACTIC-PREFERRED?", 2, 0, false);
        declareFunction("tactic_dispreferredP", "TACTIC-DISPREFERRED?", 2, 0, false);
        declareFunction("tactic_disallowedP", "TACTIC-DISALLOWED?", 2, 0, false);
        declareFunction("tactic_doomedP", "TACTIC-DOOMED?", 2, 0, false);
        declareFunction("tactic_disallowed_or_doomedP", "TACTIC-DISALLOWED-OR-DOOMED?", 2, 0, false);
        declareFunction("problem_has_executed_a_complete_tacticP", "PROBLEM-HAS-EXECUTED-A-COMPLETE-TACTIC?", 2, 1, false);
        declareFunction("lookahead_problem_has_executed_a_complete_tacticP", "LOOKAHEAD-PROBLEM-HAS-EXECUTED-A-COMPLETE-TACTIC?", 2, 1, false);
        declareFunction("problem_or_lookahead_problem_has_executed_a_complete_tacticP", "PROBLEM-OR-LOOKAHEAD-PROBLEM-HAS-EXECUTED-A-COMPLETE-TACTIC?", 2, 1, false);
        declareFunction("problem_has_executed_a_preferred_tacticP", "PROBLEM-HAS-EXECUTED-A-PREFERRED-TACTIC?", 2, 1, false);
        declareFunction("problem_has_executed_a_tactic_of_typeP", "PROBLEM-HAS-EXECUTED-A-TACTIC-OF-TYPE?", 2, 0, false);
        declareFunction("strategy_admits_tactic_wrt_proof_specP", "STRATEGY-ADMITS-TACTIC-WRT-PROOF-SPEC?", 2, 0, false);
        declareFunction("strategy_admits_all_tactics_wrt_proof_specP", "STRATEGY-ADMITS-ALL-TACTICS-WRT-PROOF-SPEC?", 1, 0, false);
        declareFunction("proof_spec_admits_tacticP", "PROOF-SPEC-ADMITS-TACTIC?", 2, 0, false);
        declareFunction("meta_tactic_p", "META-TACTIC-P", 1, 0, false);
        declareFunction("disjunctive_proof_spec_admits_tacticP", "DISJUNCTIVE-PROOF-SPEC-ADMITS-TACTIC?", 2, 0, false);
        declareFunction("proof_spec_admits_removal_tacticP", "PROOF-SPEC-ADMITS-REMOVAL-TACTIC?", 2, 0, false);
        declareFunction("proof_spec_admits_join_ordered_tacticP", "PROOF-SPEC-ADMITS-JOIN-ORDERED-TACTIC?", 2, 0, false);
        declareFunction("proof_spec_admits_join_tacticP", "PROOF-SPEC-ADMITS-JOIN-TACTIC?", 2, 0, false);
        declareFunction("proof_spec_admits_split_tacticP", "PROOF-SPEC-ADMITS-SPLIT-TACTIC?", 2, 0, false);
        declareFunction("proof_spec_admits_simplification_tacticP", "PROOF-SPEC-ADMITS-SIMPLIFICATION-TACTIC?", 2, 0, false);
        declareFunction("proof_spec_admits_conjuctive_removal_tacticP", "PROOF-SPEC-ADMITS-CONJUCTIVE-REMOVAL-TACTIC?", 2, 0, false);
        declareFunction("proof_spec_admits_transformation_tacticP", "PROOF-SPEC-ADMITS-TRANSFORMATION-TACTIC?", 2, 0, false);
        declareFunction("proof_spec_admits_union_tacticP", "PROOF-SPEC-ADMITS-UNION-TACTIC?", 2, 0, false);
        declareFunction("removal_proof_spec_admits_removal_tacticP", "REMOVAL-PROOF-SPEC-ADMITS-REMOVAL-TACTIC?", 2, 0, false);
        declareFunction("restriction_proof_spec_admits_removal_tacticP", "RESTRICTION-PROOF-SPEC-ADMITS-REMOVAL-TACTIC?", 2, 0, false);
        declareFunction("split_proof_spec_admits_split_proof_tacticP", "SPLIT-PROOF-SPEC-ADMITS-SPLIT-PROOF-TACTIC?", 2, 0, false);
        declareFunction("restriction_proof_spec_admits_simplification_tacticP", "RESTRICTION-PROOF-SPEC-ADMITS-SIMPLIFICATION-TACTIC?", 2, 0, false);
        declareFunction("conjunctive_removal_proof_spec_admits_conjunctive_removal_tacticP", "CONJUNCTIVE-REMOVAL-PROOF-SPEC-ADMITS-CONJUNCTIVE-REMOVAL-TACTIC?", 2, 0, false);
        declareFunction("join_ordered_proof_spec_admits_join_ordered_tacticP", "JOIN-ORDERED-PROOF-SPEC-ADMITS-JOIN-ORDERED-TACTIC?", 2, 0, false);
        declareFunction("union_proof_spec_admits_union_tacticP", "UNION-PROOF-SPEC-ADMITS-UNION-TACTIC?", 2, 0, false);
        declareFunction("residual_transformation_proof_spec_admits_join_ordered_tacticP", "RESIDUAL-TRANSFORMATION-PROOF-SPEC-ADMITS-JOIN-ORDERED-TACTIC?", 2, 0, false);
        declareFunction("join_proof_spec_admits_join_tacticP", "JOIN-PROOF-SPEC-ADMITS-JOIN-TACTIC?", 2, 0, false);
        declareFunction("transformation_proof_spec_admits_transformation_tacticP", "TRANSFORMATION-PROOF-SPEC-ADMITS-TRANSFORMATION-TACTIC?", 2, 0, false);
        declareFunction("ist_sentences_from_clause", "IST-SENTENCES-FROM-CLAUSE", 1, 0, false);
        declareFunction("single_literal_pattern_p", "SINGLE-LITERAL-PATTERN-P", 1, 0, false);
        declareFunction("literal_spec_admits_single_literal_problemP", "LITERAL-SPEC-ADMITS-SINGLE-LITERAL-PROBLEM?", 2, 0, false);
        declareFunction("mt_asent_sense_from_ist_literal", "MT-ASENT-SENSE-FROM-IST-LITERAL", 1, 0, false);
        declareFunction("removal_module_spec_admits_removal_module", "REMOVAL-MODULE-SPEC-ADMITS-REMOVAL-MODULE", 2, 0, false);
        declareFunction("transformation_module_spec_admits_transformation_module", "TRANSFORMATION-MODULE-SPEC-ADMITS-TRANSFORMATION-MODULE", 2, 0, false);
        declareFunction("proof_spec_mt_spec_admits_mtP", "PROOF-SPEC-MT-SPEC-ADMITS-MT?", 2, 0, false);
        declareFunction("proof_spec_asent_spec_admits_asentP", "PROOF-SPEC-ASENT-SPEC-ADMITS-ASENT?", 2, 0, false);
        declareFunction("hl_module_spec_admits_hl_module", "HL-MODULE-SPEC-ADMITS-HL-MODULE", 2, 0, false);
        declareFunction("rule_spec_admits_rule", "RULE-SPEC-ADMITS-RULE", 2, 0, false);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(NIL, makeKeyword("SET-ASIDE"), makeKeyword("THROW-AWAY"), makeKeyword("IRRELEVANT"));

    static private final SubLString $str_alt3$thrown_away_wrt_both_removal_and_ = makeString("thrown away wrt both removal and transformation");

    static private final SubLString $$$thrown_away_wrt_removal = makeString("thrown away wrt removal");

    static private final SubLString $$$thrown_away_wrt_transformation = makeString("thrown away wrt transformation");

    static private final SubLString $str_alt8$set_aside_wrt_both_removal_and_tr = makeString("set aside wrt both removal and transformation");

    static private final SubLString $$$set_aside_wrt_removal = makeString("set aside wrt removal");

    static private final SubLString $$$set_aside_wrt_transformation = makeString("set aside wrt transformation");

    static private final SubLString $str_alt12$problem_is_tactically_uninteresti = makeString("problem is tactically uninteresting");

    static private final SubLString $str_alt13$inference_is_not_continuable__and = makeString("inference is not continuable, and ");

    static private final SubLString $str_alt14$non_good_problem_has_already_exec = makeString("non-good problem has already executed a complete removal tactic");

    static private final SubLString $str_alt18$problem_is_strategically_no_good = makeString("problem is strategically no-good");

    static private final SubLString $str_alt22$proof_checker_mode_is_enabled_and = makeString("proof checker mode is enabled and no allowed rules were used to link to this problem");

    static private final SubLSymbol $sym23$INFERENCE_CHOOSES_TO_THROW_AWAY_ALL_TRANSFORMATIONS_ON_PROBLEM_ = makeSymbol("INFERENCE-CHOOSES-TO-THROW-AWAY-ALL-TRANSFORMATIONS-ON-PROBLEM?");

    public static final SubLSymbol $kw24$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt25$problem_uses_an_HL_predicate__HL_ = makeString("problem uses an HL predicate, HL and unbound predicate transformation are forbidden, and #$collectionBackchainEncouraged does not apply");

    static private final SubLString $str_alt26$problem_uses_an_evaluatable_predi = makeString("problem uses an evaluatable predicate and evaluatable predicate transformation is forbidden");

    static private final SubLString $str_alt28$problem_exceeds_max_transformatio = makeString("problem exceeds max transformation depth");

    static private final SubLSymbol $sym29$SIMPLE_STRATEGY_CHOOSES_TO_THROW_AWAY_TRANSFORMATION_TACTIC_ = makeSymbol("SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC?");

    static private final SubLString $str_alt30$proof_checker_mode_is_enabled__an = makeString("proof checker mode is enabled, and the rule for this tactic is forbidden");

    static private final SubLString $str_alt31$the_rule_for_this_tactic_has_an_i = makeString("the rule for this tactic has an insuffiently high historical utility");

    static private final SubLString $str_alt32$tactic_requires_HL_predicate_tran = makeString("tactic requires HL predicate transformation, which is forbidden");

    static private final SubLString $str_alt33$tactic_requires_unbound_predicate = makeString("tactic requires unbound predicate transformation, which is forbidden");

    static private final SubLString $str_alt34$tactic_requires_evaluatable_predi = makeString("tactic requires evaluatable predicate transformation, which is forbidden");

    static private final SubLList $list_alt35 = list(reader_make_constant_shell("isa"), reader_make_constant_shell("genls"));

    static private final SubLString $str_alt51$Time_to_support_proof_spec_admitt = makeString("Time to support proof-spec admittance on ~S tactics");

    static private final SubLList $list_alt52 = list(makeSymbol("OPERATOR"), makeSymbol("&REST"), makeSymbol("SUB-SPECS"));

    static private final SubLList $list_alt53 = list(makeSymbol("REMOVAL-TOKEN"), makeSymbol("LITERAL-SPEC"), makeSymbol("REMOVAL-MODULE-SPEC"));

    static private final SubLList $list_alt54 = list(makeSymbol("RESTRICTION-TOKEN"), makeSymbol("SUB-SPEC"));

    static private final SubLList $list_alt55 = list(makeSymbol("TRANSFORMATION-TOKEN"), makeSymbol("LITERAL-SPEC"), makeSymbol("TRANSFORMATION-MODULE-SPEC"), makeSymbol("RULE-SPEC"), makeSymbol("&OPTIONAL"), makeSymbol("SUB-SPEC"));

    static private final SubLList $list_alt56 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));

    static private final SubLList $list_alt57 = list(makeSymbol("MT"), makeSymbol("SENTENCE"));

    static private final SubLList $list_alt62 = list(makeKeyword("UNKNOWN-REASON"), NIL, NIL, NIL, NIL);

    static private final SubLList $list_alt64 = list(list(makeSymbol("*STRATEGY-GATHERING-UNINTERESTINGNESS-EXPLANATIONS?*"), T));

    static private final SubLList $list_alt68 = list(makeSymbol("EXPLANATION-TYPE"), list(makeSymbol("&KEY"), makeSymbol("PROBLEM"), makeSymbol("TACTIC"), makeSymbol("LINK"), makeSymbol("SUBEXPLANATION")));

    public static final SubLObject init_inference_tactician_strategic_uninterestingness_file_alt() {
        defparameter("*STRATEGY-UNINTERESTINGNESS-EXPLANATION*", NIL);
        deflexical("*THE-UNKNOWN-STRATEGY-UNINTERESTINGNESS-EXPLANATION*", $list_alt62);
        defparameter("*STRATEGY-GATHERING-UNINTERESTINGNESS-EXPLANATIONS?*", NIL);
        deflexical("*STRATEGY-UNINTERESTINGNESS-EXPLANATION-TABLE*", $list_alt77);
        return NIL;
    }

    public static SubLObject init_inference_tactician_strategic_uninterestingness_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*STRATEGY-UNINTERESTINGNESS-EXPLANATION*", $UNINITIALIZED);
            deflexical("*THE-UNKNOWN-STRATEGY-UNINTERESTINGNESS-EXPLANATION*", $list1);
            defparameter("*STRATEGY-GATHERING-UNINTERESTINGNESS-EXPLANATIONS?*", NIL);
            deflexical("*STRATEGY-UNINTERESTINGNESS-EXPLANATION-TABLE*", $list17);
        }
        if (SubLFiles.USE_V2) {
            defparameter("*STRATEGY-UNINTERESTINGNESS-EXPLANATION*", NIL);
            deflexical("*THE-UNKNOWN-STRATEGY-UNINTERESTINGNESS-EXPLANATION*", $list_alt62);
            deflexical("*STRATEGY-UNINTERESTINGNESS-EXPLANATION-TABLE*", $list_alt77);
        }
        return NIL;
    }

    public static SubLObject init_inference_tactician_strategic_uninterestingness_file_Previous() {
        defparameter("*STRATEGY-UNINTERESTINGNESS-EXPLANATION*", $UNINITIALIZED);
        deflexical("*THE-UNKNOWN-STRATEGY-UNINTERESTINGNESS-EXPLANATION*", $list1);
        defparameter("*STRATEGY-GATHERING-UNINTERESTINGNESS-EXPLANATIONS?*", NIL);
        deflexical("*STRATEGY-UNINTERESTINGNESS-EXPLANATION-TABLE*", $list17);
        return NIL;
    }

    static private final SubLList $list_alt69 = list(makeKeyword("PROBLEM"), makeKeyword("TACTIC"), $LINK, makeKeyword("SUBEXPLANATION"));

    public static final SubLObject setup_inference_tactician_strategic_uninterestingness_file_alt() {
        memoization_state.note_memoized_function($sym23$INFERENCE_CHOOSES_TO_THROW_AWAY_ALL_TRANSFORMATIONS_ON_PROBLEM_);
        memoization_state.note_memoized_function($sym29$SIMPLE_STRATEGY_CHOOSES_TO_THROW_AWAY_TRANSFORMATION_TACTIC_);
        register_macro_helper(STRATEGY_NOTE_UNINTERESTINGNESS_EXPLANATION, STRATEGY_POSSIBLY_NOTE_UNINTERESTINGNESS_EXPLANATION);
        return NIL;
    }

    public static SubLObject setup_inference_tactician_strategic_uninterestingness_file() {
        if (SubLFiles.USE_V1) {
            register_macro_helper(STRATEGY_NOTE_UNINTERESTINGNESS_EXPLANATION, STRATEGY_POSSIBLY_NOTE_UNINTERESTINGNESS_EXPLANATION);
            memoization_state.note_memoized_function($sym43$INFERENCE_CHOOSES_TO_THROW_AWAY_ALL_TRANSFORMATIONS_ON_PROBLEM_);
            memoization_state.note_memoized_function($sym48$SIMPLE_STRATEGY_CHOOSES_TO_THROW_AWAY_TRANSFORMATION_TACTIC_);
        }
        if (SubLFiles.USE_V2) {
            memoization_state.note_memoized_function($sym23$INFERENCE_CHOOSES_TO_THROW_AWAY_ALL_TRANSFORMATIONS_ON_PROBLEM_);
            memoization_state.note_memoized_function($sym29$SIMPLE_STRATEGY_CHOOSES_TO_THROW_AWAY_TRANSFORMATION_TACTIC_);
        }
        return NIL;
    }

    public static SubLObject setup_inference_tactician_strategic_uninterestingness_file_Previous() {
        register_macro_helper(STRATEGY_NOTE_UNINTERESTINGNESS_EXPLANATION, STRATEGY_POSSIBLY_NOTE_UNINTERESTINGNESS_EXPLANATION);
        memoization_state.note_memoized_function($sym43$INFERENCE_CHOOSES_TO_THROW_AWAY_ALL_TRANSFORMATIONS_ON_PROBLEM_);
        memoization_state.note_memoized_function($sym48$SIMPLE_STRATEGY_CHOOSES_TO_THROW_AWAY_TRANSFORMATION_TACTIC_);
        return NIL;
    }

    static private final SubLList $list_alt77 = list(new SubLObject[]{ list(makeKeyword("STRATEGY-THROWS-AWAY-ALL-TRANSFORMATION"), makeString(":strategy does not permit transformation at all")), list(makeKeyword("STRATEGY-SETS-ASIDE-ALL-TRANSFORMATION"), makeString(":strategy does not permit transformation with the current resource constraints")), list(makeKeyword("PROBLEM-ALREADY-THROWN-AWAY"), makeString(":problem was already noted to be pending")), list(makeKeyword("PROBLEM-HAS-NO-TRANSFORMATION-TACTICS"), makeString(":problem has no transformation tactics")), list(makeKeyword("PROBLEM-STRATEGY-NOT-CONTINUABLE"), makeString(":strategy is not continuable, and :problem was set aside because :subexplanation")), list(makeKeyword("PROBLEM-HAS-NO-MORE-ACTIVE-REMOVAL-STRATEGEMS"), makeString(":problem has deactivated all its active removal strategems")), list(makeKeyword("PROBLEM-HAS-NO-MORE-ACTIVE-TRANSFORMATION-STRATEGEMS"), makeString(":problem has deactivated all its active transformation strategems")), list(makeKeyword("PROBLEM-HAS-NO-ACTIVATIBLE-REMOVAL-STRATEGEMS"), makeString("when determining removal strategems for :problem, :strategy found none it wished to activate")), list(makeKeyword("PROBLEM-HAS-NO-ACTIVATIBLE-TRANSFORMATION-STRATEGEMS"), makeString("when determining transformation strategems for :problem, :strategy found none it wished to activate")), list(makeKeyword("PROBLEM-HAS-NON-ABDUCIBLE-RULE-TRANSFORMATION-LINK"), makeString("rules associated with tranformation links for :problem were #$NonAbducibleRule so :strategy discarded the abduction strategm")), list(makeKeyword("DONT-DO-ABDUCTION-ON-GOOD-PROBLEM"), makeString("problem :problem already deemed good so :strategy discarded the abduction strategm")), list(makeKeyword("DONT-TRANSFORM-ON-PROBLEM-WITH-ABDUCED-TERM"), makeString("problem :problem has an abduced term so :strategy discarded problem wrt transformation")), list(makeKeyword("ALL-TACTICS-THROWN-AWAY"), makeString("all of :problem's tactics are thrown away")), list(makeKeyword("NEW-ROOT-PENDING-WRT-MOTIVATION"), makeString(":problem has already propagated both R and T")), list(makeKeyword("PROBLEM-ALREADY-SET-ASIDE"), makeString(":problem was already noted to be set aside")), list(makeKeyword("ALL-TACTICS-SET-ASIDE"), makeString("all of :problem's tactics are set aside")), list(makeKeyword("TACTIC-ALREADY-THROWN-AWAY"), makeString(":tactic was already noted to be finished")), list(makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-PROBLEM-THROWN-AWAY"), makeString(":tactic is thrown away because :subexplanation")), list(makeKeyword("TACTIC-HL-MODULE-THROWN-AWAY"), makeString(":tactic uses module :tactic-hl-module, which is always thrown away")), list(makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-LOOKAHEAD-PROBLEM-THROWN-AWAY"), makeString("executing :tactic would motivate a problem that is thrown away because :subexplanation")), list(makeKeyword("SPLIT-TACTIC-THROWN-AWAY-BECAUSE-SIBLING-TACTIC-THROWN-AWAY"), makeString(":tactic has a sibling split tactic that is thrown away because :subexplanation")), list(makeKeyword("TACTIC-STRATEGY-NOT-CONTINUABLE"), makeString(":strategy is not continuable, and :tactic was set aside because :subexplanation")), list(makeKeyword("META-REMOVAL-TACTIC-THROWN-AWAY"), makeString(":tactic is a meta-removal tactic, and some other tactically possible tactics on the problem are strategically disallowed")), list(makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-COMPLETE-SIBLING-CONJUNCTIVE-REMOVAL"), makeString(":tactic has a sibling conjunctive removal tactic that is complete")), list(makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-SIBLING-BACKCHAIN-REQUIRED"), makeString(":tactic has a sibling join-ordered tactic that focuses on a backchain required problem")), list(makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-SIBLING-IS-A-SIMPLIFICATION"), makeString(":tactic has a sibling tactic that is a simplification")), list(makeKeyword("TACTIC-ALREADY-SET-ASIDE"), makeString(":tactic was already noted to be set aside")), list(makeKeyword("TACTIC-SET-ASIDE-BECAUSE-PROBLEM-SET-ASIDE"), makeString(":tactic is set aside because :subexplanation")), list(makeKeyword("TACTIC-GENERATED-ENOUGH"), makeString(":tactic has already generated enough transformation tactics")), list(makeKeyword("TACTIC-SET-ASIDE-BECAUSE-LOOKAHEAD-PROBLEM-SET-ASIDE"), makeString("executing :tactic would motivate a problem that is set aside because :subexplanation")), list(makeKeyword("SPLIT-TACTIC-SET-ASIDE-BECAUSE-SIBLING-TACTIC-THROWN-AWAY"), makeString(":tactic has a sibling split tactic that is thrown away because :subexplanation")), list(makeKeyword("SPLIT-TACTIC-SET-ASIDE-BECAUSE-SIBLING-TACTIC-SET-ASIDE"), makeString(":tactic has a sibling split tactic that is set aside wrt both removal and transformation, because :subexplanation")), list(makeKeyword("LOGICAL-TACTIC-EXCEEDS-MAX-TRANSFORMATION-DEPTH"), makeString(":tactic leads past the :max-transformation-depth")), list(makeKeyword("JOIN-ORDERED-TACTIC-LEADS-TO-SET-ASIDE-CONJUNCTIVE-REMOVALS"), makeString(":tactic leads to a conjunctive focal problem where all conjunctive removals are set aside")), list(makeKeyword("LINK-SUPPORTED-PROBLEM-THROWN-AWAY"), makeString(":link's supported problem is thrown away because :subexplanation")), list(makeKeyword("SIBLING-EARLY-REMOVAL-LINK"), makeString(":link has a sibling link :subexplanation")), list(makeKeyword("EARLY-REMOVAL-LINK"), makeString(":link, which is an early removal link")), list(makeKeyword("LINK-RULE-DISALLOWED"), makeString(":link uses a disallowed rule")), list(makeKeyword("LINK-SUPPORTED-PROBLEM-SET-ASIDE"), makeString(":link's supported problem is set aside because :subexplanation")), list(makeKeyword("LINK-EXCEEDS-MAX-TRANSFORMATION-DEPTH"), makeString(":link leads past the :max-transformation-depth")), list(makeKeyword("UNKNOWN-REASON"), makeString("for an unknown reason")) });

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
    }

    static private final SubLList $list_alt78 = list(makeSymbol("TYPE"), makeSymbol("PROBLEM"), makeSymbol("TACTIC"), makeSymbol("LINK"), makeSymbol("SUBEXPLANATION"));
}

/**
 * Total time: 401 ms synthetic
 */
