package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_vars;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_assertion_mt extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt";
    public static String myFingerPrint = "fd3dcbdf4cd97e08f6d9d3ed09ca256013fc5f87b41ba6479e9ccd00254fed9e";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 1600L)
    public static SubLSymbol $assertion_mt_defining_mt$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 2000L)
    private static SubLSymbol $default_assertion_mt_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 6700L)
    public static SubLSymbol $assertion_sentence_defining_mt$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 7500L)
    private static SubLSymbol $default_assertion_sentence_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 10500L)
    private static SubLSymbol $default_assertion_sentence_lookup_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 16600L)
    public static SubLSymbol $assertion_id_defining_mt$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 17000L)
    private static SubLSymbol $default_assertion_id_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 20700L)
    private static SubLSymbol $cycl_directions$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 21700L)
    public static SubLSymbol $assertion_direction_defining_mt$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 22200L)
    private static SubLSymbol $default_assertion_direction_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 26100L)
    private static SubLSymbol $cycl_strengths$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 27300L)
    public static SubLSymbol $assertion_strength_defining_mt$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 27800L)
    private static SubLSymbol $default_assertion_strength_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 31500L)
    private static SubLSymbol $cycl_truths$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 32500L)
    public static SubLSymbol $assertion_truth_defining_mt$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 32900L)
    private static SubLSymbol $default_assertion_truth_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 37200L)
    public static SubLSymbol $assertion_just_att_defining_mt$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 37700L)
    private static SubLSymbol $default_assertion_just_att_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 41000L)
    public static SubLSymbol $assertion_assert_by_defining_mt$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 42700L)
    private static SubLSymbol $default_assertion_assert_by_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 48700L)
    public static SubLSymbol $assertion_assert_time_defining_mt$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 50600L)
    private static SubLSymbol $default_assertion_assert_time_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 54000L)
    private static SubLSymbol $earliest_known_asserted_when$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 57400L)
    public static SubLSymbol $assertion_assert_purpose_defining_mt$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 59100L)
    private static SubLSymbol $default_assertion_assert_purpose_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 65100L)
    public static SubLSymbol $assertion_assert_date_defining_mt$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 65200L)
    private static SubLSymbol $default_assertion_assert_date_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 72000L)
    private static SubLSymbol $removal_assertion_asserted_by_between_dates_date_comparison_predicates$;
    private static SubLSymbol $sym0$ASSERTION_EL_IST_FORMULA;
    private static SubLObject $$assertionMt;
    private static SubLSymbol $POS;
    private static SubLSymbol $NEG;
    private static SubLSymbol $sym4$_ASSERTION_MT_DEFINING_MT_;
    private static SubLObject $$BaseKB;
    private static SubLSymbol $OPAQUE;
    private static SubLSymbol $TRUE_MON;
    private static SubLSymbol $REMOVAL_ASSERTION_MT_CHECK_POS;
    private static SubLList $list9;
    private static SubLSymbol $REMOVAL_ASSERTION_MT_PRUNE_POS;
    private static SubLList $list11;
    private static SubLSymbol $REMOVAL_ASSERTION_MT_CHECK_NEG;
    private static SubLList $list13;
    private static SubLSymbol $REMOVAL_ASSERTION_MT_UNIFY;
    private static SubLList $list15;
    private static SubLSymbol $REMOVAL_ASSERTION_MT_LOOKUP;
    private static SubLList $list17;
    private static SubLObject $$assertionSentence;
    private static SubLSymbol $sym19$_ASSERTION_SENTENCE_DEFINING_MT_;
    private static SubLSymbol $REMOVAL_ASSERTION_FORMULA_CHECK_POS;
    private static SubLList $list21;
    private static SubLSymbol $REMOVAL_ASSERTION_FORMULA_CHECK_NEG;
    private static SubLList $list23;
    private static SubLSymbol $IGNORE_ERRORS_TARGET;
    private static SubLSymbol $sym25$IGNORE_ERRORS_HANDLER;
    private static SubLSymbol $sym26$_EXIT;
    private static SubLSymbol $REMOVAL_ASSERTION_FORMULA_UNIFY;
    private static SubLList $list28;
    private static SubLSymbol $REMOVAL_ASSERTION_FORMULA_LOOKUP;
    private static SubLList $list30;
    private static SubLSymbol $sym31$RELEVANT_MT_IS_EVERYTHING;
    private static SubLObject $$EverythingPSC;
    private static SubLSymbol $GAF_ARG;
    private static SubLSymbol $GAF;
    private static SubLSymbol $PREDICATE_EXTENT;
    private static SubLSymbol $OVERLAP;
    private static SubLSymbol $REMOVAL_ASSERTION_FORMULA_UNBOUND_ASSERTION_PRED_LOOKUP;
    private static SubLList $list38;
    private static SubLSymbol $REMOVAL_ASSERTION_FORMULA_UNBOUND_ASSERTION_ARG_LOOKUP;
    private static SubLList $list40;
    private static SubLObject $$assertionID;
    private static SubLSymbol $sym42$_ASSERTION_ID_DEFINING_MT_;
    private static SubLSymbol $REMOVAL_ASSERTION_ID_CHECK_POS;
    private static SubLList $list44;
    private static SubLSymbol $REMOVAL_ASSERTION_ID_CHECK_NEG;
    private static SubLList $list46;
    private static SubLSymbol $REMOVAL_ASSERTION_ID_UNIFY;
    private static SubLList $list48;
    private static SubLSymbol $REMOVAL_ASSERTION_ID_LOOKUP;
    private static SubLList $list50;
    private static SubLObject $$assertionDirection;
    private static SubLList $list52;
    private static SubLSymbol $FORWARD;
    private static SubLObject $$Forward_AssertionDirection;
    private static SubLSymbol $BACKWARD;
    private static SubLObject $$Backward_AssertionDirection;
    private static SubLSymbol $CODE;
    private static SubLObject $$Code_AssertionDirection;
    private static SubLString $str59$_S_was_not_a_direction_p;
    private static SubLString $str60$_S_was_not_a_cycl_direction_p;
    private static SubLSymbol $sym61$_ASSERTION_DIRECTION_DEFINING_MT_;
    private static SubLSymbol $REMOVAL_ASSERTION_DIRECTION_CHECK_POS;
    private static SubLList $list63;
    private static SubLSymbol $REMOVAL_ASSERTION_DIRECTION_CHECK_NEG;
    private static SubLList $list65;
    private static SubLSymbol $REMOVAL_ASSERTION_DIRECTION_UNIFY;
    private static SubLList $list67;
    private static SubLObject $$assertionStrength;
    private static SubLList $list69;
    private static SubLSymbol $DEFAULT;
    private static SubLObject $$Default_JustificationStrength;
    private static SubLSymbol $MONOTONIC;
    private static SubLObject $$Monotonic_JustificationStrength;
    private static SubLString $str74$_S_was_not_a_el_strength_p;
    private static SubLString $str75$_S_was_not_a_cycl_strength_p;
    private static SubLSymbol $sym76$ASSERTION_P;
    private static SubLSymbol $sym77$EL_STRENGTH_P;
    private static SubLSymbol $sym78$_ASSERTION_STRENGTH_DEFINING_MT_;
    private static SubLSymbol $REMOVAL_ASSERTION_STRENGTH_CHECK_POS;
    private static SubLList $list80;
    private static SubLSymbol $REMOVAL_ASSERTION_STRENGTH_CHECK_NEG;
    private static SubLList $list82;
    private static SubLSymbol $REMOVAL_ASSERTION_STRENGTH_UNIFY;
    private static SubLList $list84;
    private static SubLObject $$assertionTruth;
    private static SubLList $list86;
    private static SubLSymbol $TRUE;
    private static SubLObject $$True_JustificationTruth;
    private static SubLSymbol $FALSE;
    private static SubLObject $$False_JustificationTruth;
    private static SubLSymbol $UNKNOWN;
    private static SubLObject $$Unknown_JustificationTruth;
    private static SubLString $str93$_S_was_not_a_truth_p;
    private static SubLString $str94$_S_was_not_a_cycl_truth_p;
    private static SubLSymbol $sym95$_ASSERTION_TRUTH_DEFINING_MT_;
    private static SubLSymbol $REMOVAL_ASSERTION_TRUTH_CHECK_POS;
    private static SubLList $list97;
    private static SubLSymbol $REMOVAL_ASSERTION_TRUTH_CHECK_NEG;
    private static SubLList $list99;
    private static SubLSymbol $REMOVAL_ASSERTION_TRUTH_UNIFY;
    private static SubLList $list101;
    private static SubLObject $$assertionJustificationAttribute;
    private static SubLSymbol $sym103$FORT_P;
    private static SubLObject $$AssertedBelief;
    private static SubLObject $$SupportedByMaterialImplication;
    private static SubLSymbol $sym106$_ASSERTION_JUST_ATT_DEFINING_MT_;
    private static SubLSymbol $REMOVAL_ASSERTION_JUST_ATT_CHECK_POS;
    private static SubLList $list108;
    private static SubLSymbol $REMOVAL_ASSERTION_JUST_ATT_CHECK_NEG;
    private static SubLList $list110;
    private static SubLSymbol $REMOVAL_ASSERTION_JUST_ATT_UNIFY;
    private static SubLList $list112;
    private static SubLObject $$assertionAssertBy;
    private static SubLSymbol $sym114$_ASSERTION_ASSERT_BY_DEFINING_MT_;
    private static SubLString $str115$Computing_assertions_asserted_by_;
    private static SubLSymbol $sym116$STRINGP;
    private static SubLSymbol $SKIP;
    private static SubLSymbol $LATENCY;
    private static SubLSymbol $sym119$ASSERTION_ASSERTED_BY_;
    private static SubLSymbol $TOTAL_TIME;
    private static SubLString $str121$_S_was_not_one_of__latency_or__to;
    private static SubLSymbol $REMOVAL_ASSERTION_ASSERT_BY_CHECK_POS;
    private static SubLList $list123;
    private static SubLSymbol $REMOVAL_ASSERTION_ASSERT_BY_CHECK_NEG;
    private static SubLList $list125;
    private static SubLSymbol $REMOVAL_ASSERTION_ASSERT_BY_UNIFY;
    private static SubLList $list127;
    private static SubLObject $$HumanCyclist;
    private static SubLSymbol $REMOVAL_ASSERTION_ASSERT_BY_LOOKUP;
    private static SubLList $list130;
    private static SubLSymbol $DISPREFER_ASSERTION_ASSERT_BY_LOOKUP;
    private static SubLList $list132;
    private static SubLObject $$assertionAssertTime;
    private static SubLSymbol $sym134$_ASSERTION_ASSERT_TIME_DEFINING_MT_;
    private static SubLSymbol $sym135$UNIVERSAL_DATE_P;
    private static SubLString $str136$Computing_assertions_asserted_on_;
    private static SubLSymbol $sym137$ASSERTION_ASSERTED_WHEN_;
    private static SubLSymbol $REMOVAL_ASSERTION_ASSERT_TIME_CHECK_POS;
    private static SubLList $list139;
    private static SubLSymbol $REMOVAL_ASSERTION_ASSERT_TIME_CHECK_NEG;
    private static SubLList $list141;
    private static SubLSymbol $REMOVAL_ASSERTION_ASSERT_TIME_UNIFY;
    private static SubLList $list143;
    private static SubLInteger $int$19950522;
    private static SubLSymbol $REMOVAL_ASSERTION_ASSERT_TIME_LOOKUP;
    private static SubLList $list146;
    private static SubLSymbol $DISPREFER_ASSERTION_ASSERT_TIME_LOOKUP;
    private static SubLList $list148;
    private static SubLObject $$assertionAssertPurpose;
    private static SubLSymbol $sym150$_ASSERTION_ASSERT_PURPOSE_DEFINING_MT_;
    private static SubLString $str151$Computing_assertions_asserted_for;
    private static SubLSymbol $sym152$ASSERTION_ASSERTED_WHY_;
    private static SubLSymbol $REMOVAL_ASSERTION_ASSERT_PURPOSE_CHECK_POS;
    private static SubLList $list154;
    private static SubLSymbol $REMOVAL_ASSERTION_ASSERT_PURPOSE_CHECK_NEG;
    private static SubLList $list156;
    private static SubLSymbol $REMOVAL_ASSERTION_ASSERT_PURPOSE_UNIFY;
    private static SubLList $list158;
    private static SubLObject $$Cyc_BasedProject;
    private static SubLSymbol $REMOVAL_ASSERTION_ASSERT_PURPOSE_LOOKUP;
    private static SubLList $list161;
    private static SubLSymbol $DISPREFER_ASSERTION_ASSERT_PURPOSE_LOOKUP;
    private static SubLList $list163;
    private static SubLObject $$assertionAssertDate;
    private static SubLSymbol $sym165$_ASSERTION_ASSERT_DATE_DEFINING_MT_;
    private static SubLSymbol $REMOVAL_ASSERTION_ASSERT_DATE_CHECK_POS;
    private static SubLList $list167;
    private static SubLSymbol $REMOVAL_ASSERTION_ASSERT_DATE_CHECK_NEG;
    private static SubLList $list169;
    private static SubLSymbol $REMOVAL_ASSERTION_ASSERT_DATE_UNIFY;
    private static SubLList $list171;
    private static SubLSymbol $REMOVAL_ASSERTION_ASSERT_DATE_LOOKUP;
    private static SubLList $list173;
    private static SubLSymbol $DISPREFER_ASSERTION_ASSERT_DATE_LOOKUP;
    private static SubLList $list175;
    private static SubLSymbol $REMOVAL_ASSERTION_ASSERT_BY_AND_TIME_CONJUNCTIVE;
    private static SubLList $list177;
    private static SubLList $list178;
    private static SubLSymbol $sym179$CONTEXTUALIZED_ASENT_ASENT;
    private static SubLSymbol $sym180$_;
    private static SubLSymbol $sym181$ASSERTION_ASSERTED_BY_ASENT_;
    private static SubLSymbol $sym182$ASSERTION_ASSERT_TIME_ASENT_;
    private static SubLSymbol $sym183$REMOVAL_ASSERTION_ASSERTED_BY_BETWEEN_DATES_DATE_COMPARISON_ASENT;
    private static SubLSymbol $CYCLIST;
    private static SubLSymbol $ASSERTION_VAR;
    private static SubLSymbol $ASSERT_TIME_ARG2;
    private static SubLSymbol $TIME_COMPARISON_ASENTS;
    private static SubLSymbol $ASENTS;
    private static SubLSymbol $sym189$REMOVAL_ASSERTION_ASSERTED_BY_BETWEEN_DATES_ITERATOR_FILTER_AND_T;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 700L)
    public static SubLObject hl_assertion_support_sentence_to_el(SubLObject support_sentence) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject _prev_bind_0 = czer_vars.$assertion_key$.currentBinding(thread);
        try {
            czer_vars.$assertion_key$.bind($sym0$ASSERTION_EL_IST_FORMULA, thread);
            support_sentence = cycl_utilities.hl_to_el(support_sentence);
        } finally {
            czer_vars.$assertion_key$.rebind(_prev_bind_0, thread);
        }
        return support_sentence;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 1600L)
    public static SubLObject make_assertion_mt_support(SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == UNPROVIDED) {
            support_mt = NIL;
        }
        support_sentence = hl_assertion_support_sentence_to_el(support_sentence);
        support_mt = $assertion_mt_defining_mt$.getGlobalValue();
        SubLObject support = arguments.make_hl_support($OPAQUE, support_sentence, support_mt, $TRUE_MON);
        SubLObject more_supports = NIL;
        return Values.values(support, more_supports);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 5200L)
    public static SubLObject removal_assertion_mt_lookup_cost(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject mt = el_utilities.literal_arg2(literal, UNPROVIDED);
        if (NIL != kb_indexing.broad_mtP(mt)) {
            return assertion_handles.assertion_count();
        }
        return kb_indexing.num_mt_index(mt);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 6500L)
    public static SubLObject assertion_sentenceP(SubLObject assertion, SubLObject sentence) {
        return Equality.equal(sentence, assertions_high.assertion_formula(assertion));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 6800L)
    public static SubLObject make_assertion_sentence_support_from_assertion(SubLObject assertion, SubLObject formula, SubLObject negateP) {
        if (negateP == UNPROVIDED) {
            negateP = NIL;
        }
        SubLObject support_sentence = el_utilities.make_binary_formula($$assertionSentence, assertion, formula);
        if (NIL != negateP) {
            support_sentence = cycl_utilities.negate(support_sentence);
        }
        return make_assertion_sentence_support(support_sentence, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 7100L)
    public static SubLObject make_assertion_sentence_support(SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == UNPROVIDED) {
            support_mt = NIL;
        }
        support_sentence = hl_assertion_support_sentence_to_el(support_sentence);
        support_mt = $assertion_sentence_defining_mt$.getGlobalValue();
        SubLObject support = arguments.make_hl_support($OPAQUE, support_sentence, support_mt, $TRUE_MON);
        SubLObject more_supports = NIL;
        return Values.values(support, more_supports);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 9400L)
    public static SubLObject assertion_fi_formula_robust(SubLObject assertion, SubLObject substitute_varsP) {
        if (substitute_varsP == UNPROVIDED) {
            substitute_varsP = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function($sym25$IGNORE_ERRORS_HANDLER), thread);
                try {
                    return fi.assertion_fi_formula(assertion, substitute_varsP);
                } catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 11500L)
    public static SubLObject removal_assertion_sentence_unbound_assertion_cost(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hl_formula = el_utilities.literal_arg2(literal, UNPROVIDED);
        SubLObject total = NIL;
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym31$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            total = inference_trampolines.inference_num_gaf_lookup_index(hl_formula, $POS);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return total;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 11900L)
    public static SubLObject removal_assertion_sentence_expand_internal_1(SubLObject assertion, SubLObject assertion_var, SubLObject hl_formula) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
            SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
            thread.resetMultipleValues();
            SubLObject assertion_bindings = unification_utilities.term_unify(assertion_var, assertion, T, T);
            SubLObject assertion_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != assertion_bindings) {
                thread.resetMultipleValues();
                SubLObject literal_bindings = unification_utilities.gaf_asent_unify(hl_formula, gaf_formula, T, T);
                SubLObject literal_gaf_asent = thread.secondMultipleValue();
                SubLObject literal_justification = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != literal_bindings && NIL == bindings.some_variable_with_conflicting_bindings(assertion_bindings, literal_bindings)) {
                    backward.removal_add_node(make_assertion_sentence_support_from_assertion(assertion, gaf_formula, NIL), nconc(assertion_bindings, literal_bindings), append(assertion_justification, literal_justification));
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 12900L)
    public static SubLObject removal_assertion_sentence_unbound_assertion_pred_lookup_cost(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_assertion_sentence_unbound_assertion_cost(literal, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 13300L)
    public static SubLObject removal_assertion_sentence_unbound_assertion_pred_lookup_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertion_var = el_utilities.literal_arg1(literal, UNPROVIDED);
        SubLObject hl_formula = el_utilities.literal_arg2(literal, UNPROVIDED);
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym31$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(hl_formula, $POS);
            SubLObject pcase_var;
            SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
            if (pcase_var.eql($GAF_ARG)) {
                thread.resetMultipleValues();
                SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                SubLObject argnum = thread.secondMultipleValue();
                SubLObject predicate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != argnum) {
                    if (NIL != predicate) {
                        SubLObject pred_var = predicate;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = NIL;
                            SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$1 = NIL;
                                        SubLObject token_var_$2 = NIL;
                                        while (NIL == done_var_$1) {
                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                            SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(assertion));
                                            if (NIL != valid_$3) {
                                                removal_assertion_sentence_expand_internal_1(assertion, assertion_var, hl_formula);
                                            }
                                            done_var_$1 = makeBoolean(NIL == valid_$3);
                                        }
                                    } finally {
                                        SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                            SubLObject _values = Values.getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        } finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        }
                    } else {
                        SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = NIL;
                            SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$2 = NIL;
                                        SubLObject token_var_$3 = NIL;
                                        while (NIL == done_var_$2) {
                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                            SubLObject valid_$4 = makeBoolean(!token_var_$3.eql(assertion));
                                            if (NIL != valid_$4) {
                                                removal_assertion_sentence_expand_internal_1(assertion, assertion_var, hl_formula);
                                            }
                                            done_var_$2 = makeBoolean(NIL == valid_$4);
                                        }
                                    } finally {
                                        SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                            SubLObject _values2 = Values.getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values2);
                                        } finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        }
                    }
                } else if (NIL != predicate) {
                    SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$3 = NIL;
                                    SubLObject token_var_$4 = NIL;
                                    while (NIL == done_var_$3) {
                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                        SubLObject valid_$5 = makeBoolean(!token_var_$4.eql(assertion));
                                        if (NIL != valid_$5) {
                                            removal_assertion_sentence_expand_internal_1(assertion, assertion_var, hl_formula);
                                        }
                                        done_var_$3 = makeBoolean(NIL == valid_$5);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values3 = Values.getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values3);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    }
                } else {
                    SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$4 = NIL;
                                    SubLObject token_var_$5 = NIL;
                                    while (NIL == done_var_$4) {
                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                        SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(assertion));
                                        if (NIL != valid_$6) {
                                            removal_assertion_sentence_expand_internal_1(assertion, assertion_var, hl_formula);
                                        }
                                        done_var_$4 = makeBoolean(NIL == valid_$6);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values4 = Values.getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values4);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    }
                }
            } else if (pcase_var.eql($PREDICATE_EXTENT)) {
                SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    SubLObject str = NIL;
                    SubLObject _prev_bind_0_$8 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    SubLObject _prev_bind_1_$18 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                    SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind(T, thread);
                        utilities_macros.$silent_progressP$.bind((NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : T, thread);
                        utilities_macros.noting_progress_preamble(str);
                        SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = NIL;
                        SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$5 = NIL;
                                    SubLObject token_var_$6 = NIL;
                                    while (NIL == done_var_$5) {
                                        SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$6);
                                        SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(assertion2));
                                        if (NIL != valid_$7) {
                                            removal_assertion_sentence_expand_internal_1(assertion2, assertion_var, hl_formula);
                                        }
                                        done_var_$5 = makeBoolean(NIL == valid_$7);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values5 = Values.getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values5);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        }
                        utilities_macros.noting_progress_postamble();
                    } finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$18, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$8, thread);
                    }
                }
            } else if (pcase_var.eql($OVERLAP)) {
                SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                SubLObject assertion3 = NIL;
                assertion3 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL == enumeration_types.sense_truth($POS) || NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth($POS))) {
                        removal_assertion_sentence_expand_internal_1(assertion3, assertion_var, hl_formula);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion3 = cdolist_list_var.first();
                }
            } else {
                kb_mapping_macros.do_gli_method_error(l_index, method);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 14400L)
    public static SubLObject removal_assertion_sentence_unbound_assertion_arg_lookup_cost(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_assertion_sentence_unbound_assertion_cost(literal, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 14800L)
    public static SubLObject removal_assertion_sentence_unbound_assertion_arg_lookup_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertion_var = el_utilities.literal_arg1(literal, UNPROVIDED);
        SubLObject hl_formula = el_utilities.literal_arg2(literal, UNPROVIDED);
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym31$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(hl_formula, $POS);
            SubLObject pcase_var;
            SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
            if (pcase_var.eql($GAF_ARG)) {
                thread.resetMultipleValues();
                SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                SubLObject argnum = thread.secondMultipleValue();
                SubLObject predicate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != argnum) {
                    if (NIL != predicate) {
                        SubLObject pred_var = predicate;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = NIL;
                            SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$23 = NIL;
                                        SubLObject token_var_$24 = NIL;
                                        while (NIL == done_var_$23) {
                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$24);
                                            SubLObject valid_$25 = makeBoolean(!token_var_$24.eql(assertion));
                                            if (NIL != valid_$25) {
                                                removal_assertion_sentence_expand_internal_1(assertion, assertion_var, hl_formula);
                                            }
                                            done_var_$23 = makeBoolean(NIL == valid_$25);
                                        }
                                    } finally {
                                        SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                            SubLObject _values = Values.getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        } finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        }
                    } else {
                        SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = NIL;
                            SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$24 = NIL;
                                        SubLObject token_var_$25 = NIL;
                                        while (NIL == done_var_$24) {
                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$25);
                                            SubLObject valid_$26 = makeBoolean(!token_var_$25.eql(assertion));
                                            if (NIL != valid_$26) {
                                                removal_assertion_sentence_expand_internal_1(assertion, assertion_var, hl_formula);
                                            }
                                            done_var_$24 = makeBoolean(NIL == valid_$26);
                                        }
                                    } finally {
                                        SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                            SubLObject _values2 = Values.getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values2);
                                        } finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        }
                    }
                } else if (NIL != predicate) {
                    SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$25 = NIL;
                                    SubLObject token_var_$26 = NIL;
                                    while (NIL == done_var_$25) {
                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$26);
                                        SubLObject valid_$27 = makeBoolean(!token_var_$26.eql(assertion));
                                        if (NIL != valid_$27) {
                                            removal_assertion_sentence_expand_internal_1(assertion, assertion_var, hl_formula);
                                        }
                                        done_var_$25 = makeBoolean(NIL == valid_$27);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values3 = Values.getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values3);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    }
                } else {
                    SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$26 = NIL;
                                    SubLObject token_var_$27 = NIL;
                                    while (NIL == done_var_$26) {
                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$27);
                                        SubLObject valid_$28 = makeBoolean(!token_var_$27.eql(assertion));
                                        if (NIL != valid_$28) {
                                            removal_assertion_sentence_expand_internal_1(assertion, assertion_var, hl_formula);
                                        }
                                        done_var_$26 = makeBoolean(NIL == valid_$28);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0_$29 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values4 = Values.getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values4);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    }
                }
            } else if (pcase_var.eql($PREDICATE_EXTENT)) {
                SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    SubLObject str = NIL;
                    SubLObject _prev_bind_0_$30 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    SubLObject _prev_bind_1_$40 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                    SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind(T, thread);
                        utilities_macros.$silent_progressP$.bind((NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : T, thread);
                        utilities_macros.noting_progress_preamble(str);
                        SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = NIL;
                        SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$27 = NIL;
                                    SubLObject token_var_$28 = NIL;
                                    while (NIL == done_var_$27) {
                                        SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$28);
                                        SubLObject valid_$29 = makeBoolean(!token_var_$28.eql(assertion2));
                                        if (NIL != valid_$29) {
                                            removal_assertion_sentence_expand_internal_1(assertion2, assertion_var, hl_formula);
                                        }
                                        done_var_$27 = makeBoolean(NIL == valid_$29);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0_$31 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values5 = Values.getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values5);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        }
                        utilities_macros.noting_progress_postamble();
                    } finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$40, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$30, thread);
                    }
                }
            } else if (pcase_var.eql($OVERLAP)) {
                SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                SubLObject assertion3 = NIL;
                assertion3 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL == enumeration_types.sense_truth($POS) || NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth($POS))) {
                        removal_assertion_sentence_expand_internal_1(assertion3, assertion_var, hl_formula);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion3 = cdolist_list_var.first();
                }
            } else {
                kb_mapping_macros.do_gli_method_error(l_index, method);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 16400L)
    public static SubLObject assertion_has_idP(SubLObject assertion, SubLObject id) {
        return Equality.equal(id, assertion_handles.assertion_id(assertion));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 16700L)
    public static SubLObject make_assertion_id_support(SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == UNPROVIDED) {
            support_mt = NIL;
        }
        support_sentence = hl_assertion_support_sentence_to_el(support_sentence);
        support_mt = $assertion_id_defining_mt$.getGlobalValue();
        SubLObject support = arguments.make_hl_support($OPAQUE, support_sentence, support_mt, $TRUE_MON);
        SubLObject more_supports = NIL;
        return Values.values(support, more_supports);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 20900L)
    public static SubLObject cycl_direction_p(SubLObject v_object) {
        return subl_promotions.memberP(v_object, $cycl_directions$.getGlobalValue(), Symbols.symbol_function(EQL), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 21000L)
    public static SubLObject direction_to_cycl_direction(SubLObject direction) {
        if (direction.eql($FORWARD)) {
            return $$Forward_AssertionDirection;
        }
        if (direction.eql($BACKWARD)) {
            return $$Backward_AssertionDirection;
        }
        if (direction.eql($CODE)) {
            return $$Code_AssertionDirection;
        }
        Errors.error($str59$_S_was_not_a_direction_p, direction);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 21400L)
    public static SubLObject cycl_direction_to_direction(SubLObject cycl_direction) {
        if (cycl_direction.eql($$Forward_AssertionDirection)) {
            return $FORWARD;
        }
        if (cycl_direction.eql($$Backward_AssertionDirection)) {
            return $BACKWARD;
        }
        if (cycl_direction.eql($$Code_AssertionDirection)) {
            return $CODE;
        }
        Errors.error($str60$_S_was_not_a_cycl_direction_p, cycl_direction);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 21800L)
    public static SubLObject make_assertion_direction_support(SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == UNPROVIDED) {
            support_mt = NIL;
        }
        support_sentence = hl_assertion_support_sentence_to_el(support_sentence);
        support_mt = $assertion_direction_defining_mt$.getGlobalValue();
        SubLObject support = arguments.make_hl_support($OPAQUE, support_sentence, support_mt, $TRUE_MON);
        SubLObject more_supports = NIL;
        return Values.values(support, more_supports);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 26300L)
    public static SubLObject cycl_strength_p(SubLObject v_object) {
        return subl_promotions.memberP(v_object, $cycl_strengths$.getGlobalValue(), Symbols.symbol_function(EQL), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 26400L)
    public static SubLObject strength_to_cycl_strength(SubLObject strength) {
        if (strength.eql($DEFAULT)) {
            return $$Default_JustificationStrength;
        }
        if (strength.eql($MONOTONIC)) {
            return $$Monotonic_JustificationStrength;
        }
        Errors.error($str74$_S_was_not_a_el_strength_p, strength);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 26700L)
    public static SubLObject cycl_strength_to_strength(SubLObject cycl_strength) {
        if (cycl_strength.eql($$Default_JustificationStrength)) {
            return $DEFAULT;
        }
        if (cycl_strength.eql($$Monotonic_JustificationStrength)) {
            return $MONOTONIC;
        }
        Errors.error($str75$_S_was_not_a_cycl_strength_p, cycl_strength);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 27100L)
    public static SubLObject assertion_has_strength(SubLObject assertion, SubLObject strength) {
        assert NIL != assertion_handles.assertion_p(assertion) : assertion;
        assert NIL != enumeration_types.el_strength_p(strength) : strength;
        return Equality.eql(strength, assertions_high.assertion_strength(assertion));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 27400L)
    public static SubLObject make_assertion_strength_support(SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == UNPROVIDED) {
            support_mt = NIL;
        }
        support_sentence = hl_assertion_support_sentence_to_el(support_sentence);
        support_mt = $assertion_strength_defining_mt$.getGlobalValue();
        SubLObject support = arguments.make_hl_support($OPAQUE, support_sentence, support_mt, $TRUE_MON);
        SubLObject more_supports = NIL;
        return Values.values(support, more_supports);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 31700L)
    public static SubLObject cycl_truth_p(SubLObject v_object) {
        return subl_promotions.memberP(v_object, $cycl_truths$.getGlobalValue(), Symbols.symbol_function(EQL), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 31800L)
    public static SubLObject truth_to_cycl_truth(SubLObject truth) {
        if (truth.eql($TRUE)) {
            return $$True_JustificationTruth;
        }
        if (truth.eql($FALSE)) {
            return $$False_JustificationTruth;
        }
        if (truth.eql($UNKNOWN)) {
            return $$Unknown_JustificationTruth;
        }
        Errors.error($str93$_S_was_not_a_truth_p, truth);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 32200L)
    public static SubLObject cycl_truth_to_truth(SubLObject cycl_truth) {
        if (cycl_truth.eql($$True_JustificationTruth)) {
            return $TRUE;
        }
        if (cycl_truth.eql($$False_JustificationTruth)) {
            return $FALSE;
        }
        if (cycl_truth.eql($$Unknown_JustificationTruth)) {
            return $UNKNOWN;
        }
        Errors.error($str94$_S_was_not_a_cycl_truth_p, cycl_truth);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 32600L)
    public static SubLObject make_assertion_truth_support(SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == UNPROVIDED) {
            support_mt = NIL;
        }
        support_sentence = hl_assertion_support_sentence_to_el(support_sentence);
        support_mt = $assertion_truth_defining_mt$.getGlobalValue();
        SubLObject support = arguments.make_hl_support($OPAQUE, support_sentence, support_mt, $TRUE_MON);
        SubLObject more_supports = NIL;
        return Values.values(support, more_supports);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 36600L)
    public static SubLObject inference_assertion_just_att(SubLObject assertion, SubLObject att) {
        assert NIL != assertion_handles.assertion_p(assertion) : assertion;
        assert NIL != forts.fort_p(att) : att;
        if (att.eql($$AssertedBelief)) {
            return assertions_high.asserted_assertionP(assertion);
        }
        if (att.eql($$SupportedByMaterialImplication)) {
            return assertions_high.deduced_assertionP(assertion);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 36900L)
    public static SubLObject inference_all_assertion_just_att(SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : assertion;
        SubLObject attributes = NIL;
        if (NIL != assertions_high.asserted_assertionP(assertion)) {
            attributes = cons($$AssertedBelief, attributes);
        }
        if (NIL != assertions_high.deduced_assertionP(assertion)) {
            attributes = cons($$SupportedByMaterialImplication, attributes);
        }
        return Sequences.nreverse(attributes);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 37300L)
    public static SubLObject make_assertion_just_att_support(SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == UNPROVIDED) {
            support_mt = NIL;
        }
        support_sentence = hl_assertion_support_sentence_to_el(support_sentence);
        support_mt = $assertion_just_att_defining_mt$.getGlobalValue();
        SubLObject support = arguments.make_hl_support($OPAQUE, support_sentence, support_mt, $TRUE_MON);
        SubLObject more_supports = NIL;
        return Values.values(support, more_supports);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 41100L)
    public static SubLObject assertion_asserted_byP(SubLObject assertion, SubLObject cyclist) {
        return Equality.equal(cyclist, assertions_high.asserted_by(assertion));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 41300L)
    public static SubLObject all_assertions_asserted_by(SubLObject cyclist) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject progress_message = PrintLow.format(NIL, $str115$Computing_assertions_asserted_by_, cyclist);
        SubLObject result = NIL;
        SubLObject idx = assertion_handles.do_assertions_table();
        SubLObject mess = progress_message;
        SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != Types.stringp(mess) : mess;
        SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind(T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                SubLObject idx_$45 = idx;
                if (NIL == id_index.id_index_objects_empty_p(idx_$45, $SKIP)) {
                    SubLObject idx_$46 = idx_$45;
                    if (NIL == id_index.id_index_dense_objects_empty_p(idx_$46, $SKIP)) {
                        SubLObject vector_var = id_index.id_index_dense_objects(idx_$46);
                        SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                            a_id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                            a_handle = Vectors.aref(vector_var, a_id);
                            if (NIL == id_index.id_index_tombstone_p(a_handle) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                                if (NIL != id_index.id_index_tombstone_p(a_handle)) {
                                    a_handle = $SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (NIL != assertion_asserted_byP(ass, cyclist)) {
                                    result = cons(ass, result);
                                }
                                sofar = Numbers.add(sofar, ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    SubLObject idx_$47 = idx_$45;
                    if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$47) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        SubLObject sparse = id_index.id_index_sparse_objects(idx_$47);
                        SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$47);
                        SubLObject end_id = id_index.id_index_next_id(idx_$47);
                        SubLObject v_default = (NIL != id_index.id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                            if (NIL == id_index.id_index_skip_tombstones_p($SKIP) || NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (NIL != assertion_asserted_byP(ass2, cyclist)) {
                                    result = cons(ass2, result);
                                }
                                sofar = Numbers.add(sofar, ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            a_id2 = Numbers.add(a_id2, ONE_INTEGER);
                        }
                    }
                }
            } finally {
                SubLObject _prev_bind_0_$48 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
                }
            }
        } finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(result);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 41900L)
    public static SubLObject new_assertion_asserted_by_iterator(SubLObject cyclist, SubLObject optimize) {
        if (optimize == UNPROVIDED) {
            optimize = $LATENCY;
        }
        SubLObject pcase_var = optimize;
        if (pcase_var.eql($LATENCY)) {
            SubLObject input_iterator = assertion_handles.new_assertions_iterator();
            SubLObject filter_args = list(cyclist);
            return iteration.new_filter_iterator(input_iterator, $sym119$ASSERTION_ASSERTED_BY_, filter_args);
        }
        if (pcase_var.eql($TOTAL_TIME)) {
            return iteration.new_list_iterator(all_assertions_asserted_by(cyclist));
        }
        return Errors.error($str121$_S_was_not_one_of__latency_or__to, optimize);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 45900L)
    public static SubLObject current_inference_exhaustiveP() {
        SubLObject inference = inference_macros.current_controlling_inference();
        return makeBoolean(NIL == inference || NIL != inference_datastructures_inference.inference_dynamic_properties_exhaustiveP(inference));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 46300L)
    public static SubLObject estimated_average_assertions_per_cyclist() {
        return Numbers.integerDivide(assertion_handles.assertion_count(), Numbers.max(ONE_INTEGER, cardinality_estimates.instance_cardinality($$HumanCyclist)));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 46500L)
    public static SubLObject removal_assertion_assert_by_lookup_cost(SubLObject cyclist) {
        return number_utilities.f_2X(estimated_average_assertions_per_cyclist());
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 46900L)
    public static SubLObject removal_assertion_asserted_by_iterator(SubLObject cyclist) {
        SubLObject optimize = (NIL != current_inference_exhaustiveP()) ? $TOTAL_TIME : $LATENCY;
        return new_assertion_asserted_by_iterator(cyclist, optimize);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 48800L)
    public static SubLObject assertion_asserted_whenP(SubLObject assertion, SubLObject universal_date) {
        return Equality.eql(universal_date, assertions_high.asserted_when(assertion));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 49000L)
    public static SubLObject all_assertions_asserted_when(SubLObject universal_date) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != numeric_date_utilities.universal_date_p(universal_date) : universal_date;
        SubLObject progress_message = PrintLow.format(NIL, $str136$Computing_assertions_asserted_on_, numeric_date_utilities.datestring(universal_date));
        SubLObject result = NIL;
        SubLObject idx = assertion_handles.do_assertions_table();
        SubLObject mess = progress_message;
        SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != Types.stringp(mess) : mess;
        SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind(T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                SubLObject idx_$49 = idx;
                if (NIL == id_index.id_index_objects_empty_p(idx_$49, $SKIP)) {
                    SubLObject idx_$50 = idx_$49;
                    if (NIL == id_index.id_index_dense_objects_empty_p(idx_$50, $SKIP)) {
                        SubLObject vector_var = id_index.id_index_dense_objects(idx_$50);
                        SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                            a_id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                            a_handle = Vectors.aref(vector_var, a_id);
                            if (NIL == id_index.id_index_tombstone_p(a_handle) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                                if (NIL != id_index.id_index_tombstone_p(a_handle)) {
                                    a_handle = $SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (NIL != assertion_asserted_whenP(ass, universal_date)) {
                                    result = cons(ass, result);
                                }
                                sofar = Numbers.add(sofar, ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    SubLObject idx_$51 = idx_$49;
                    if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$51) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        SubLObject sparse = id_index.id_index_sparse_objects(idx_$51);
                        SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$51);
                        SubLObject end_id = id_index.id_index_next_id(idx_$51);
                        SubLObject v_default = (NIL != id_index.id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                            if (NIL == id_index.id_index_skip_tombstones_p($SKIP) || NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (NIL != assertion_asserted_whenP(ass2, universal_date)) {
                                    result = cons(ass2, result);
                                }
                                sofar = Numbers.add(sofar, ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            a_id2 = Numbers.add(a_id2, ONE_INTEGER);
                        }
                    }
                }
            } finally {
                SubLObject _prev_bind_0_$52 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                }
            }
        } finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(result);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 49800L)
    public static SubLObject new_assertion_asserted_when_iterator(SubLObject universal_date, SubLObject optimize) {
        if (optimize == UNPROVIDED) {
            optimize = $LATENCY;
        }
        assert NIL != numeric_date_utilities.universal_date_p(universal_date) : universal_date;
        SubLObject pcase_var = optimize;
        if (pcase_var.eql($LATENCY)) {
            SubLObject input_iterator = assertion_handles.new_assertions_iterator();
            SubLObject filter_args = list(universal_date);
            return iteration.new_filter_iterator(input_iterator, $sym137$ASSERTION_ASSERTED_WHEN_, filter_args);
        }
        if (pcase_var.eql($TOTAL_TIME)) {
            return iteration.new_list_iterator(all_assertions_asserted_when(universal_date));
        }
        return Errors.error($str121$_S_was_not_one_of__latency_or__to, optimize);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 54700L)
    public static SubLObject estimated_average_assertions_per_date() {
        return Numbers.integerDivide(assertion_handles.assertion_count(),
                Numbers.integerDivide(Numbers.subtract(numeric_date_utilities.universal_time_from_date_and_second(numeric_date_utilities.today(), UNPROVIDED), numeric_date_utilities.universal_time_from_date_and_second($earliest_known_asserted_when$.getGlobalValue(), UNPROVIDED)),
                        numeric_date_utilities.$seconds_in_a_day$.getGlobalValue()));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 55000L)
    public static SubLObject removal_assertion_assert_time_lookup_cost(SubLObject universal_date) {
        return number_utilities.f_2X(estimated_average_assertions_per_date());
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 55400L)
    public static SubLObject removal_assertion_asserted_when_iterator(SubLObject universal_date) {
        SubLObject optimize = (NIL != current_inference_exhaustiveP()) ? $TOTAL_TIME : $LATENCY;
        return new_assertion_asserted_when_iterator(universal_date, optimize);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 57500L)
    public static SubLObject assertion_asserted_whyP(SubLObject assertion, SubLObject reason) {
        return Equality.equal(reason, assertions_high.asserted_why(assertion));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 57700L)
    public static SubLObject all_assertions_asserted_why(SubLObject reason) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject progress_message = PrintLow.format(NIL, $str151$Computing_assertions_asserted_for, reason);
        SubLObject result = NIL;
        SubLObject idx = assertion_handles.do_assertions_table();
        SubLObject mess = progress_message;
        SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != Types.stringp(mess) : mess;
        SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind(T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                SubLObject idx_$53 = idx;
                if (NIL == id_index.id_index_objects_empty_p(idx_$53, $SKIP)) {
                    SubLObject idx_$54 = idx_$53;
                    if (NIL == id_index.id_index_dense_objects_empty_p(idx_$54, $SKIP)) {
                        SubLObject vector_var = id_index.id_index_dense_objects(idx_$54);
                        SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                            a_id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                            a_handle = Vectors.aref(vector_var, a_id);
                            if (NIL == id_index.id_index_tombstone_p(a_handle) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                                if (NIL != id_index.id_index_tombstone_p(a_handle)) {
                                    a_handle = $SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (NIL != assertion_asserted_whyP(ass, reason)) {
                                    result = cons(ass, result);
                                }
                                sofar = Numbers.add(sofar, ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    SubLObject idx_$55 = idx_$53;
                    if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$55) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        SubLObject sparse = id_index.id_index_sparse_objects(idx_$55);
                        SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$55);
                        SubLObject end_id = id_index.id_index_next_id(idx_$55);
                        SubLObject v_default = (NIL != id_index.id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                            if (NIL == id_index.id_index_skip_tombstones_p($SKIP) || NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (NIL != assertion_asserted_whyP(ass2, reason)) {
                                    result = cons(ass2, result);
                                }
                                sofar = Numbers.add(sofar, ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            a_id2 = Numbers.add(a_id2, ONE_INTEGER);
                        }
                    }
                }
            } finally {
                SubLObject _prev_bind_0_$56 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$56, thread);
                }
            }
        } finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(result);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 58400L)
    public static SubLObject new_assertion_asserted_why_iterator(SubLObject reason, SubLObject optimize) {
        if (optimize == UNPROVIDED) {
            optimize = $LATENCY;
        }
        SubLObject pcase_var = optimize;
        if (pcase_var.eql($LATENCY)) {
            SubLObject input_iterator = assertion_handles.new_assertions_iterator();
            SubLObject filter_args = list(reason);
            return iteration.new_filter_iterator(input_iterator, $sym152$ASSERTION_ASSERTED_WHY_, filter_args);
        }
        if (pcase_var.eql($TOTAL_TIME)) {
            return iteration.new_list_iterator(all_assertions_asserted_why(reason));
        }
        return Errors.error($str121$_S_was_not_one_of__latency_or__to, optimize);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 62500L)
    public static SubLObject estimated_average_assertions_per_purpose() {
        return Numbers.integerDivide(assertion_handles.assertion_count(), Numbers.max(ONE_INTEGER, cardinality_estimates.instance_cardinality($$Cyc_BasedProject)));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 62800L)
    public static SubLObject removal_assertion_assert_purpose_lookup_cost(SubLObject reason) {
        return number_utilities.f_2X(estimated_average_assertions_per_purpose());
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 63200L)
    public static SubLObject removal_assertion_asserted_why_iterator(SubLObject reason) {
        SubLObject optimize = (NIL != current_inference_exhaustiveP()) ? $TOTAL_TIME : $LATENCY;
        return new_assertion_asserted_why_iterator(reason, optimize);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 68800L)
    public static SubLObject removal_assertion_assert_date_lookup_cost(SubLObject cycl_date) {
        return number_utilities.f_2X(estimated_average_assertions_per_date());
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 71900L)
    public static SubLObject removal_assertion_asserted_by_between_dates_cost(SubLObject contextualized_dnf_clause) {
        return SEVENTEEN_INTEGER;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 72200L)
    public static SubLObject removal_assertion_asserted_by_between_dates_applicability(SubLObject contextualized_dnf_clause) {
        SubLObject asents = Mapping.mapcar($sym179$CONTEXTUALIZED_ASENT_ASENT, clauses.pos_lits(contextualized_dnf_clause));
        SubLObject clause_numbers = NIL;
        SubLObject list_var = NIL;
        SubLObject asent_1 = NIL;
        SubLObject clause_number_1 = NIL;
        list_var = asents;
        asent_1 = list_var.first();
        for (clause_number_1 = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), asent_1 = list_var.first(), clause_number_1 = Numbers.add(ONE_INTEGER, clause_number_1)) {
            if (NIL != forts.fort_p(cycl_utilities.formula_arg2(asent_1, UNPROVIDED)) && NIL != assertion_asserted_by_asentP(asent_1)) {
                SubLObject asserted_by_variable = cycl_utilities.formula_arg1(asent_1, UNPROVIDED);
                if (NIL != variables.variable_p(asserted_by_variable)) {
                    SubLObject list_var_$57 = NIL;
                    SubLObject asent_2 = NIL;
                    SubLObject clause_number_2 = NIL;
                    list_var_$57 = asents;
                    asent_2 = list_var_$57.first();
                    for (clause_number_2 = ZERO_INTEGER; NIL != list_var_$57; list_var_$57 = list_var_$57.rest(), asent_2 = list_var_$57.first(), clause_number_2 = Numbers.add(ONE_INTEGER, clause_number_2)) {
                        if (NIL != assertion_assert_time_asentP(asent_2) && cycl_utilities.formula_arg1(asent_2, UNPROVIDED).eql(asserted_by_variable)) {
                            SubLObject pos_lit_numbers = list(clause_number_1, clause_number_2);
                            SubLObject time_variable = cycl_utilities.formula_arg2(asent_2, UNPROVIDED);
                            if (NIL != variables.variable_p(time_variable) && !time_variable.eql(asserted_by_variable)) {
                                SubLObject list_var_$58 = NIL;
                                SubLObject asent_3 = NIL;
                                SubLObject clause_number_3 = NIL;
                                list_var_$58 = asents;
                                asent_3 = list_var_$58.first();
                                for (clause_number_3 = ZERO_INTEGER; NIL != list_var_$58; list_var_$58 = list_var_$58.rest(), asent_3 = list_var_$58.first(), clause_number_3 = Numbers.add(ONE_INTEGER, clause_number_3)) {
                                    if (NIL != removal_assertion_asserted_by_between_dates_date_comparison_asentP(asent_3) && ((cycl_utilities.formula_arg2(asent_3, UNPROVIDED).isInteger() && cycl_utilities.formula_arg1(asent_3, UNPROVIDED).eql(time_variable))
                                            || (cycl_utilities.formula_arg1(asent_3, UNPROVIDED).isInteger() && cycl_utilities.formula_arg2(asent_3, UNPROVIDED).eql(time_variable)))) {
                                        pos_lit_numbers = cons(clause_number_3, pos_lit_numbers);
                                    }
                                }
                                clause_numbers = cons(list(NIL, Sort.sort(pos_lit_numbers, Symbols.symbol_function($sym180$_), UNPROVIDED)), clause_numbers);
                            }
                        }
                    }
                }
            }
        }
        return clause_numbers;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 73600L)
    public static SubLObject assertion_asserted_by_asentP(SubLObject asent) {
        return Equality.eql(cycl_utilities.formula_arg0(asent), $$assertionAssertBy);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 73700L)
    public static SubLObject assertion_assert_time_asentP(SubLObject asent) {
        return Equality.eql(cycl_utilities.formula_arg0(asent), $$assertionAssertTime);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 73800L)
    public static SubLObject removal_assertion_asserted_by_between_dates_date_comparison_asentP(SubLObject asent) {
        return subl_promotions.memberP(cycl_utilities.formula_arg0(asent), $removal_assertion_asserted_by_between_dates_date_comparison_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 74000L)
    public static SubLObject removal_assertion_asserted_by_between_dates_expand_iterator(SubLObject contextualized_dnf_clause) {
        SubLObject asents = Mapping.mapcar($sym179$CONTEXTUALIZED_ASENT_ASENT, clauses.pos_lits(contextualized_dnf_clause));
        SubLObject asserted_by_asent = Sequences.find_if($sym181$ASSERTION_ASSERTED_BY_ASENT_, asents, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject assert_time_asent = Sequences.find_if($sym182$ASSERTION_ASSERT_TIME_ASENT_, asents, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject time_comparison_asents = list_utilities.find_all_if($sym183$REMOVAL_ASSERTION_ASSERTED_BY_BETWEEN_DATES_DATE_COMPARISON_ASENT, asents, UNPROVIDED);
        SubLObject assertion_var = cycl_utilities.formula_arg1(asserted_by_asent, UNPROVIDED);
        SubLObject cyclist = cycl_utilities.formula_arg2(asserted_by_asent, UNPROVIDED);
        SubLObject assert_time_arg2 = cycl_utilities.formula_arg2(assert_time_asent, UNPROVIDED);
        SubLObject filter_and_transform_args = list(list_utilities.make_plist(list($CYCLIST, $ASSERTION_VAR, $ASSERT_TIME_ARG2, $TIME_COMPARISON_ASENTS, $ASENTS), list(cyclist, assertion_var, assert_time_arg2, time_comparison_asents, asents)));
        return iteration.new_filter_and_transform_iterator(assertion_handles.new_assertions_iterator(), $sym189$REMOVAL_ASSERTION_ASSERTED_BY_BETWEEN_DATES_ITERATOR_FILTER_AND_T, filter_and_transform_args);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 75300L)
    public static SubLObject removal_assertion_asserted_by_between_dates_iterator_filter_and_transform(SubLObject assertion, SubLObject filter_args) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cyclist = conses_high.getf(filter_args, $CYCLIST, UNPROVIDED);
        SubLObject assertion_var = conses_high.getf(filter_args, $ASSERTION_VAR, UNPROVIDED);
        SubLObject assert_time_arg2 = conses_high.getf(filter_args, $ASSERT_TIME_ARG2, UNPROVIDED);
        SubLObject time_comparison_asents = conses_high.getf(filter_args, $TIME_COMPARISON_ASENTS, UNPROVIDED);
        SubLObject asents = conses_high.getf(filter_args, $ASENTS, UNPROVIDED);
        SubLObject assertion_cyclist = assertions_high.asserted_by(assertion);
        SubLObject assertion_date = assertions_high.asserted_when(assertion);
        if (assert_time_arg2.isInteger()) {
            if (assertion_cyclist.eql(cyclist) && assertion_date.eql(assert_time_arg2)) {
                thread.resetMultipleValues();
                SubLObject v_bindings = unification_utilities.term_unify(assertion_var, assertion, T, T);
                SubLObject unify_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject justifications = list(
                        listS(removal_modules_bookkeeping.make_bookkeeping_hl_support(list($$assertionAssertBy, assertion, assertion_cyclist)), removal_modules_bookkeeping.make_bookkeeping_hl_support(list($$assertionAssertTime, assertion, assertion_date)), unify_justification));
                return Values.values(list(v_bindings, justifications), T);
            }
        } else if (assertion_cyclist.eql(cyclist)) {
            SubLObject failureP = NIL;
            if (NIL == failureP) {
                SubLObject csome_list_var = time_comparison_asents;
                SubLObject time_comparison_asent = NIL;
                time_comparison_asent = csome_list_var.first();
                while (NIL == failureP && NIL != csome_list_var) {
                    SubLObject bound_time_comparison_asent = cycl_utilities.expression_subst(assertion_date, assert_time_arg2, time_comparison_asent, UNPROVIDED, UNPROVIDED);
                    if (NIL == relation_evaluation.cyc_evaluate(bound_time_comparison_asent)) {
                        failureP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    time_comparison_asent = csome_list_var.first();
                }
            }
            if (NIL == failureP) {
                thread.resetMultipleValues();
                SubLObject bindings1 = unification_utilities.term_unify(assertion_var, assertion, UNPROVIDED, UNPROVIDED);
                SubLObject unify_justification2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                SubLObject bindings2 = unification_utilities.term_unify(assert_time_arg2, assertion_date, UNPROVIDED, UNPROVIDED);
                SubLObject unify_justification3 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject v_bindings2 = append(bindings1, bindings2);
                SubLObject unify_justification4 = append(unify_justification2, unify_justification3);
                SubLObject justifications2 = NIL;
                SubLObject cdolist_list_var = asents;
                SubLObject asent = NIL;
                asent = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (cycl_utilities.formula_arg0(asent).eql($$assertionAssertTime)) {
                        justifications2 = cons(listS(removal_modules_bookkeeping.make_bookkeeping_hl_support(el_utilities.make_binary_formula($$assertionAssertTime, assertion, assertion_date)), unify_justification4), justifications2);
                    } else if (cycl_utilities.formula_arg0(asent).eql($$assertionAssertBy)) {
                        justifications2 = ConsesLow.cons(listS(removal_modules_bookkeeping.make_bookkeeping_hl_support(el_utilities.make_binary_formula($$assertionAssertBy, assertion, assertion_cyclist)), unify_justification4), justifications2);
                    } else {
                        justifications2 = ConsesLow.cons(listS(removal_modules_evaluation.make_eval_support(bindings.apply_bindings(v_bindings2, asent), UNPROVIDED), unify_justification4), justifications2);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    asent = cdolist_list_var.first();
                }
                justifications2 = Sequences.nreverse(justifications2);
                return Values.values(list(v_bindings2, justifications2), T);
            }
        }
        return Values.values(NIL, NIL);
    }

    public static SubLObject declare_removal_modules_assertion_mt_file() {
        declareFunction(myName, "hl_assertion_support_sentence_to_el", "HL-ASSERTION-SUPPORT-SENTENCE-TO-EL", 1, 0, false);
        declareFunction(myName, "make_assertion_mt_support", "MAKE-ASSERTION-MT-SUPPORT", 1, 1, false);
        declareFunction(myName, "removal_assertion_mt_lookup_cost", "REMOVAL-ASSERTION-MT-LOOKUP-COST", 1, 1, false);
        declareFunction(myName, "assertion_sentenceP", "ASSERTION-SENTENCE?", 2, 0, false);
        declareFunction(myName, "make_assertion_sentence_support_from_assertion", "MAKE-ASSERTION-SENTENCE-SUPPORT-FROM-ASSERTION", 2, 1, false);
        declareFunction(myName, "make_assertion_sentence_support", "MAKE-ASSERTION-SENTENCE-SUPPORT", 1, 1, false);
        declareFunction(myName, "assertion_fi_formula_robust", "ASSERTION-FI-FORMULA-ROBUST", 1, 1, false);
        declareFunction(myName, "removal_assertion_sentence_unbound_assertion_cost", "REMOVAL-ASSERTION-SENTENCE-UNBOUND-ASSERTION-COST", 1, 1, false);
        declareFunction(myName, "removal_assertion_sentence_expand_internal_1", "REMOVAL-ASSERTION-SENTENCE-EXPAND-INTERNAL-1", 3, 0, false);
        declareFunction(myName, "removal_assertion_sentence_unbound_assertion_pred_lookup_cost", "REMOVAL-ASSERTION-SENTENCE-UNBOUND-ASSERTION-PRED-LOOKUP-COST", 1, 1, false);
        declareFunction(myName, "removal_assertion_sentence_unbound_assertion_pred_lookup_expand", "REMOVAL-ASSERTION-SENTENCE-UNBOUND-ASSERTION-PRED-LOOKUP-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_assertion_sentence_unbound_assertion_arg_lookup_cost", "REMOVAL-ASSERTION-SENTENCE-UNBOUND-ASSERTION-ARG-LOOKUP-COST", 1, 1, false);
        declareFunction(myName, "removal_assertion_sentence_unbound_assertion_arg_lookup_expand", "REMOVAL-ASSERTION-SENTENCE-UNBOUND-ASSERTION-ARG-LOOKUP-EXPAND", 1, 1, false);
        declareFunction(myName, "assertion_has_idP", "ASSERTION-HAS-ID?", 2, 0, false);
        declareFunction(myName, "make_assertion_id_support", "MAKE-ASSERTION-ID-SUPPORT", 1, 1, false);
        declareFunction(myName, "cycl_direction_p", "CYCL-DIRECTION-P", 1, 0, false);
        declareFunction(myName, "direction_to_cycl_direction", "DIRECTION-TO-CYCL-DIRECTION", 1, 0, false);
        declareFunction(myName, "cycl_direction_to_direction", "CYCL-DIRECTION-TO-DIRECTION", 1, 0, false);
        declareFunction(myName, "make_assertion_direction_support", "MAKE-ASSERTION-DIRECTION-SUPPORT", 1, 1, false);
        declareFunction(myName, "cycl_strength_p", "CYCL-STRENGTH-P", 1, 0, false);
        declareFunction(myName, "strength_to_cycl_strength", "STRENGTH-TO-CYCL-STRENGTH", 1, 0, false);
        declareFunction(myName, "cycl_strength_to_strength", "CYCL-STRENGTH-TO-STRENGTH", 1, 0, false);
        declareFunction(myName, "assertion_has_strength", "ASSERTION-HAS-STRENGTH", 2, 0, false);
        declareFunction(myName, "make_assertion_strength_support", "MAKE-ASSERTION-STRENGTH-SUPPORT", 1, 1, false);
        declareFunction(myName, "cycl_truth_p", "CYCL-TRUTH-P", 1, 0, false);
        declareFunction(myName, "truth_to_cycl_truth", "TRUTH-TO-CYCL-TRUTH", 1, 0, false);
        declareFunction(myName, "cycl_truth_to_truth", "CYCL-TRUTH-TO-TRUTH", 1, 0, false);
        declareFunction(myName, "make_assertion_truth_support", "MAKE-ASSERTION-TRUTH-SUPPORT", 1, 1, false);
        declareFunction(myName, "inference_assertion_just_att", "INFERENCE-ASSERTION-JUST-ATT", 2, 0, false);
        declareFunction(myName, "inference_all_assertion_just_att", "INFERENCE-ALL-ASSERTION-JUST-ATT", 1, 0, false);
        declareFunction(myName, "make_assertion_just_att_support", "MAKE-ASSERTION-JUST-ATT-SUPPORT", 1, 1, false);
        declareFunction(myName, "assertion_asserted_byP", "ASSERTION-ASSERTED-BY?", 2, 0, false);
        declareFunction(myName, "all_assertions_asserted_by", "ALL-ASSERTIONS-ASSERTED-BY", 1, 0, false);
        declareFunction(myName, "new_assertion_asserted_by_iterator", "NEW-ASSERTION-ASSERTED-BY-ITERATOR", 1, 1, false);
        declareFunction(myName, "current_inference_exhaustiveP", "CURRENT-INFERENCE-EXHAUSTIVE?", 0, 0, false);
        declareFunction(myName, "estimated_average_assertions_per_cyclist", "ESTIMATED-AVERAGE-ASSERTIONS-PER-CYCLIST", 0, 0, false);
        declareFunction(myName, "removal_assertion_assert_by_lookup_cost", "REMOVAL-ASSERTION-ASSERT-BY-LOOKUP-COST", 1, 0, false);
        declareFunction(myName, "removal_assertion_asserted_by_iterator", "REMOVAL-ASSERTION-ASSERTED-BY-ITERATOR", 1, 0, false);
        declareFunction(myName, "assertion_asserted_whenP", "ASSERTION-ASSERTED-WHEN?", 2, 0, false);
        declareFunction(myName, "all_assertions_asserted_when", "ALL-ASSERTIONS-ASSERTED-WHEN", 1, 0, false);
        declareFunction(myName, "new_assertion_asserted_when_iterator", "NEW-ASSERTION-ASSERTED-WHEN-ITERATOR", 1, 1, false);
        declareFunction(myName, "estimated_average_assertions_per_date", "ESTIMATED-AVERAGE-ASSERTIONS-PER-DATE", 0, 0, false);
        declareFunction(myName, "removal_assertion_assert_time_lookup_cost", "REMOVAL-ASSERTION-ASSERT-TIME-LOOKUP-COST", 1, 0, false);
        declareFunction(myName, "removal_assertion_asserted_when_iterator", "REMOVAL-ASSERTION-ASSERTED-WHEN-ITERATOR", 1, 0, false);
        declareFunction(myName, "assertion_asserted_whyP", "ASSERTION-ASSERTED-WHY?", 2, 0, false);
        declareFunction(myName, "all_assertions_asserted_why", "ALL-ASSERTIONS-ASSERTED-WHY", 1, 0, false);
        declareFunction(myName, "new_assertion_asserted_why_iterator", "NEW-ASSERTION-ASSERTED-WHY-ITERATOR", 1, 1, false);
        declareFunction(myName, "estimated_average_assertions_per_purpose", "ESTIMATED-AVERAGE-ASSERTIONS-PER-PURPOSE", 0, 0, false);
        declareFunction(myName, "removal_assertion_assert_purpose_lookup_cost", "REMOVAL-ASSERTION-ASSERT-PURPOSE-LOOKUP-COST", 1, 0, false);
        declareFunction(myName, "removal_assertion_asserted_why_iterator", "REMOVAL-ASSERTION-ASSERTED-WHY-ITERATOR", 1, 0, false);
        declareFunction(myName, "removal_assertion_assert_date_lookup_cost", "REMOVAL-ASSERTION-ASSERT-DATE-LOOKUP-COST", 1, 0, false);
        declareFunction(myName, "removal_assertion_asserted_by_between_dates_cost", "REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-COST", 1, 0, false);
        declareFunction(myName, "removal_assertion_asserted_by_between_dates_applicability", "REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-APPLICABILITY", 1, 0, false);
        declareFunction(myName, "assertion_asserted_by_asentP", "ASSERTION-ASSERTED-BY-ASENT?", 1, 0, false);
        declareFunction(myName, "assertion_assert_time_asentP", "ASSERTION-ASSERT-TIME-ASENT?", 1, 0, false);
        declareFunction(myName, "removal_assertion_asserted_by_between_dates_date_comparison_asentP", "REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-DATE-COMPARISON-ASENT?", 1, 0, false);
        declareFunction(myName, "removal_assertion_asserted_by_between_dates_expand_iterator", "REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-EXPAND-ITERATOR", 1, 0, false);
        declareFunction(myName, "removal_assertion_asserted_by_between_dates_iterator_filter_and_transform", "REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-ITERATOR-FILTER-AND-TRANSFORM", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_assertion_mt_file() {
        $assertion_mt_defining_mt$ = deflexical("*ASSERTION-MT-DEFINING-MT*", maybeDefault($sym4$_ASSERTION_MT_DEFINING_MT_, $assertion_mt_defining_mt$, $$BaseKB));
        $default_assertion_mt_check_cost$ = defparameter("*DEFAULT-ASSERTION-MT-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        $assertion_sentence_defining_mt$ = deflexical("*ASSERTION-SENTENCE-DEFINING-MT*", maybeDefault($sym19$_ASSERTION_SENTENCE_DEFINING_MT_, $assertion_sentence_defining_mt$, $$BaseKB));
        $default_assertion_sentence_check_cost$ = defparameter("*DEFAULT-ASSERTION-SENTENCE-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        $default_assertion_sentence_lookup_cost$ = defparameter("*DEFAULT-ASSERTION-SENTENCE-LOOKUP-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        $assertion_id_defining_mt$ = deflexical("*ASSERTION-ID-DEFINING-MT*", maybeDefault($sym42$_ASSERTION_ID_DEFINING_MT_, $assertion_id_defining_mt$, $$BaseKB));
        $default_assertion_id_check_cost$ = defparameter("*DEFAULT-ASSERTION-ID-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        $cycl_directions$ = deflexical("*CYCL-DIRECTIONS*", $list52);
        $assertion_direction_defining_mt$ = deflexical("*ASSERTION-DIRECTION-DEFINING-MT*", maybeDefault($sym61$_ASSERTION_DIRECTION_DEFINING_MT_, $assertion_direction_defining_mt$, $$BaseKB));
        $default_assertion_direction_check_cost$ = defparameter("*DEFAULT-ASSERTION-DIRECTION-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        $cycl_strengths$ = deflexical("*CYCL-STRENGTHS*", $list69);
        $assertion_strength_defining_mt$ = deflexical("*ASSERTION-STRENGTH-DEFINING-MT*", maybeDefault($sym78$_ASSERTION_STRENGTH_DEFINING_MT_, $assertion_strength_defining_mt$, $$BaseKB));
        $default_assertion_strength_check_cost$ = defparameter("*DEFAULT-ASSERTION-STRENGTH-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        $cycl_truths$ = deflexical("*CYCL-TRUTHS*", $list86);
        $assertion_truth_defining_mt$ = deflexical("*ASSERTION-TRUTH-DEFINING-MT*", maybeDefault($sym95$_ASSERTION_TRUTH_DEFINING_MT_, $assertion_truth_defining_mt$, $$BaseKB));
        $default_assertion_truth_check_cost$ = defparameter("*DEFAULT-ASSERTION-TRUTH-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        $assertion_just_att_defining_mt$ = deflexical("*ASSERTION-JUST-ATT-DEFINING-MT*", maybeDefault($sym106$_ASSERTION_JUST_ATT_DEFINING_MT_, $assertion_just_att_defining_mt$, $$BaseKB));
        $default_assertion_just_att_check_cost$ = defparameter("*DEFAULT-ASSERTION-JUST-ATT-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        $assertion_assert_by_defining_mt$ = deflexical("*ASSERTION-ASSERT-BY-DEFINING-MT*", maybeDefault($sym114$_ASSERTION_ASSERT_BY_DEFINING_MT_, $assertion_assert_by_defining_mt$, $$BaseKB));
        $default_assertion_assert_by_check_cost$ = defparameter("*DEFAULT-ASSERTION-ASSERT-BY-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        $assertion_assert_time_defining_mt$ = deflexical("*ASSERTION-ASSERT-TIME-DEFINING-MT*", maybeDefault($sym134$_ASSERTION_ASSERT_TIME_DEFINING_MT_, $assertion_assert_time_defining_mt$, $$BaseKB));
        $default_assertion_assert_time_check_cost$ = defparameter("*DEFAULT-ASSERTION-ASSERT-TIME-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        $earliest_known_asserted_when$ = deflexical("*EARLIEST-KNOWN-ASSERTED-WHEN*", $int$19950522);
        $assertion_assert_purpose_defining_mt$ = deflexical("*ASSERTION-ASSERT-PURPOSE-DEFINING-MT*", maybeDefault($sym150$_ASSERTION_ASSERT_PURPOSE_DEFINING_MT_, $assertion_assert_purpose_defining_mt$, $$BaseKB));
        $default_assertion_assert_purpose_check_cost$ = defparameter("*DEFAULT-ASSERTION-ASSERT-PURPOSE-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        $assertion_assert_date_defining_mt$ = deflexical("*ASSERTION-ASSERT-DATE-DEFINING-MT*", maybeDefault($sym165$_ASSERTION_ASSERT_DATE_DEFINING_MT_, $assertion_assert_date_defining_mt$, $$BaseKB));
        $default_assertion_assert_date_check_cost$ = defparameter("*DEFAULT-ASSERTION-ASSERT-DATE-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        $removal_assertion_asserted_by_between_dates_date_comparison_predicates$ = SubLFiles.deflexical("*REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-DATE-COMPARISON-PREDICATES*", $list178);
        return NIL;
    }

    public static SubLObject setup_removal_modules_assertion_mt_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$assertionMt);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$assertionMt);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$assertionMt);
        subl_macro_promotions.declare_defglobal($sym4$_ASSERTION_MT_DEFINING_MT_);
        mt_vars.note_mt_var($sym4$_ASSERTION_MT_DEFINING_MT_, $$assertionMt);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_MT_CHECK_POS, $list9);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_MT_PRUNE_POS, $list11);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_MT_CHECK_NEG, $list13);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_MT_UNIFY, $list15);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_MT_LOOKUP, $list17);
        inference_modules.register_solely_specific_removal_module_predicate($$assertionSentence);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$assertionSentence);
        subl_macro_promotions.declare_defglobal($sym19$_ASSERTION_SENTENCE_DEFINING_MT_);
        mt_vars.note_mt_var($sym19$_ASSERTION_SENTENCE_DEFINING_MT_, $$assertionSentence);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_FORMULA_CHECK_POS, $list21);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_FORMULA_CHECK_NEG, $list23);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_FORMULA_UNIFY, $list28);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_FORMULA_LOOKUP, $list30);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_FORMULA_UNBOUND_ASSERTION_PRED_LOOKUP, $list38);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_FORMULA_UNBOUND_ASSERTION_ARG_LOOKUP, $list40);
        inference_modules.register_solely_specific_removal_module_predicate($$assertionID);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$assertionID);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$assertionID);
        subl_macro_promotions.declare_defglobal($sym42$_ASSERTION_ID_DEFINING_MT_);
        mt_vars.note_mt_var($sym42$_ASSERTION_ID_DEFINING_MT_, $$assertionID);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ID_CHECK_POS, $list44);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ID_CHECK_NEG, $list46);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ID_UNIFY, $list48);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ID_LOOKUP, $list50);
        inference_modules.register_solely_specific_removal_module_predicate($$assertionDirection);
        preference_modules.doomed_unless_arg_bindable($POS, $$assertionDirection, ONE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$assertionDirection);
        subl_macro_promotions.declare_defglobal($sym61$_ASSERTION_DIRECTION_DEFINING_MT_);
        mt_vars.note_mt_var($sym61$_ASSERTION_DIRECTION_DEFINING_MT_, $$assertionDirection);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_DIRECTION_CHECK_POS, $list63);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_DIRECTION_CHECK_NEG, $list65);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_DIRECTION_UNIFY, $list67);
        inference_modules.register_solely_specific_removal_module_predicate($$assertionStrength);
        preference_modules.doomed_unless_arg_bindable($POS, $$assertionStrength, ONE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$assertionStrength);
        subl_macro_promotions.declare_defglobal($sym78$_ASSERTION_STRENGTH_DEFINING_MT_);
        mt_vars.note_mt_var($sym78$_ASSERTION_STRENGTH_DEFINING_MT_, $$assertionStrength);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_STRENGTH_CHECK_POS, $list80);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_STRENGTH_CHECK_NEG, $list82);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_STRENGTH_UNIFY, $list84);
        inference_modules.register_solely_specific_removal_module_predicate($$assertionTruth);
        preference_modules.doomed_unless_arg_bindable($POS, $$assertionTruth, ONE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$assertionTruth);
        subl_macro_promotions.declare_defglobal($sym95$_ASSERTION_TRUTH_DEFINING_MT_);
        mt_vars.note_mt_var($sym95$_ASSERTION_TRUTH_DEFINING_MT_, $$assertionTruth);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_TRUTH_CHECK_POS, $list97);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_TRUTH_CHECK_NEG, $list99);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_TRUTH_UNIFY, $list101);
        inference_modules.register_solely_specific_removal_module_predicate($$assertionJustificationAttribute);
        preference_modules.doomed_unless_arg_bindable($POS, $$assertionJustificationAttribute, ONE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$assertionJustificationAttribute);
        subl_macro_promotions.declare_defglobal($sym106$_ASSERTION_JUST_ATT_DEFINING_MT_);
        mt_vars.note_mt_var($sym106$_ASSERTION_JUST_ATT_DEFINING_MT_, $$assertionJustificationAttribute);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_JUST_ATT_CHECK_POS, $list108);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_JUST_ATT_CHECK_NEG, $list110);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_JUST_ATT_UNIFY, $list112);
        inference_modules.register_solely_specific_removal_module_predicate($$assertionAssertBy);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$assertionAssertBy);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$assertionAssertBy);
        subl_macro_promotions.declare_defglobal($sym114$_ASSERTION_ASSERT_BY_DEFINING_MT_);
        mt_vars.note_mt_var($sym114$_ASSERTION_ASSERT_BY_DEFINING_MT_, $$assertionAssertBy);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ASSERT_BY_CHECK_POS, $list123);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ASSERT_BY_CHECK_NEG, $list125);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ASSERT_BY_UNIFY, $list127);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ASSERT_BY_LOOKUP, $list130);
        preference_modules.inference_preference_module($DISPREFER_ASSERTION_ASSERT_BY_LOOKUP, $list132);
        inference_modules.register_solely_specific_removal_module_predicate($$assertionAssertTime);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$assertionAssertTime);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$assertionAssertTime);
        subl_macro_promotions.declare_defglobal($sym134$_ASSERTION_ASSERT_TIME_DEFINING_MT_);
        mt_vars.note_mt_var($sym134$_ASSERTION_ASSERT_TIME_DEFINING_MT_, $$assertionAssertTime);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ASSERT_TIME_CHECK_POS, $list139);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ASSERT_TIME_CHECK_NEG, $list141);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ASSERT_TIME_UNIFY, $list143);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ASSERT_TIME_LOOKUP, $list146);
        preference_modules.inference_preference_module($DISPREFER_ASSERTION_ASSERT_TIME_LOOKUP, $list148);
        inference_modules.register_solely_specific_removal_module_predicate($$assertionAssertPurpose);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$assertionAssertPurpose);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$assertionAssertPurpose);
        subl_macro_promotions.declare_defglobal($sym150$_ASSERTION_ASSERT_PURPOSE_DEFINING_MT_);
        mt_vars.note_mt_var($sym150$_ASSERTION_ASSERT_PURPOSE_DEFINING_MT_, $$assertionAssertPurpose);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ASSERT_PURPOSE_CHECK_POS, $list154);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ASSERT_PURPOSE_CHECK_NEG, $list156);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ASSERT_PURPOSE_UNIFY, $list158);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ASSERT_PURPOSE_LOOKUP, $list161);
        preference_modules.inference_preference_module($DISPREFER_ASSERTION_ASSERT_PURPOSE_LOOKUP, $list163);
        inference_modules.register_solely_specific_removal_module_predicate($$assertionAssertDate);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$assertionAssertDate);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$assertionAssertDate);
        subl_macro_promotions.declare_defglobal($sym165$_ASSERTION_ASSERT_DATE_DEFINING_MT_);
        mt_vars.note_mt_var($sym165$_ASSERTION_ASSERT_DATE_DEFINING_MT_, $$assertionAssertDate);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ASSERT_DATE_CHECK_POS, $list167);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ASSERT_DATE_CHECK_NEG, $list169);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ASSERT_DATE_UNIFY, $list171);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ASSERT_DATE_LOOKUP, $list173);
        preference_modules.inference_preference_module($DISPREFER_ASSERTION_ASSERT_DATE_LOOKUP, $list175);
        inference_modules.inference_conjunctive_removal_module($REMOVAL_ASSERTION_ASSERT_BY_AND_TIME_CONJUNCTIVE, $list177);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_assertion_mt_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_assertion_mt_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_assertion_mt_file();
    }

    static {
        me = new removal_modules_assertion_mt();
        $assertion_mt_defining_mt$ = null;
        $default_assertion_mt_check_cost$ = null;
        $assertion_sentence_defining_mt$ = null;
        $default_assertion_sentence_check_cost$ = null;
        $default_assertion_sentence_lookup_cost$ = null;
        $assertion_id_defining_mt$ = null;
        $default_assertion_id_check_cost$ = null;
        $cycl_directions$ = null;
        $assertion_direction_defining_mt$ = null;
        $default_assertion_direction_check_cost$ = null;
        $cycl_strengths$ = null;
        $assertion_strength_defining_mt$ = null;
        $default_assertion_strength_check_cost$ = null;
        $cycl_truths$ = null;
        $assertion_truth_defining_mt$ = null;
        $default_assertion_truth_check_cost$ = null;
        $assertion_just_att_defining_mt$ = null;
        $default_assertion_just_att_check_cost$ = null;
        $assertion_assert_by_defining_mt$ = null;
        $default_assertion_assert_by_check_cost$ = null;
        $assertion_assert_time_defining_mt$ = null;
        $default_assertion_assert_time_check_cost$ = null;
        $earliest_known_asserted_when$ = null;
        $assertion_assert_purpose_defining_mt$ = null;
        $default_assertion_assert_purpose_check_cost$ = null;
        $assertion_assert_date_defining_mt$ = null;
        $default_assertion_assert_date_check_cost$ = null;
        $removal_assertion_asserted_by_between_dates_date_comparison_predicates$ = null;
        $sym0$ASSERTION_EL_IST_FORMULA = makeSymbol("ASSERTION-EL-IST-FORMULA");
        $$assertionMt = makeConstSym(("assertionMt"));
        $POS = makeKeyword("POS");
        $NEG = makeKeyword("NEG");
        $sym4$_ASSERTION_MT_DEFINING_MT_ = makeSymbol("*ASSERTION-MT-DEFINING-MT*");
        $$BaseKB = makeConstSym(("BaseKB"));
        $OPAQUE = makeKeyword("OPAQUE");
        $TRUE_MON = makeKeyword("TRUE-MON");
        $REMOVAL_ASSERTION_MT_CHECK_POS = makeKeyword("REMOVAL-ASSERTION-MT-CHECK-POS");
        $list9 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionMt")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionMt")), makeKeyword("ASSERTION"), makeKeyword("CLOSED-HLMT")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*DEFAULT-ASSERTION-MT-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionMt")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("MT"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("MT")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("MT")), list(makeKeyword("CALL"), makeSymbol("ASSERTION-HAS-MT?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("MT")))),
                makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-MT-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionMt <assertion> <hlmt-p>)"), makeKeyword("EXAMPLE"),
                makeString("(#$assertionMt\n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection))\n      #$LogicalTruthMt)") });
        $REMOVAL_ASSERTION_MT_PRUNE_POS = makeKeyword("REMOVAL-ASSERTION-MT-PRUNE-POS");
        $list11 = list(
                new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionMt")), makeKeyword("REQUIRED-PATTERN"),
                        list(makeKeyword("OR"), list(makeConstSym(("assertionMt")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NOT"), makeKeyword("ASSERTION"))), makeKeyword("ANYTHING")),
                                list(makeConstSym(("assertionMt")), makeKeyword("ANYTHING"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NOT"), makeKeyword("CLOSED-HLMT"))))),
                        makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE") });
        $REMOVAL_ASSERTION_MT_CHECK_NEG = makeKeyword("REMOVAL-ASSERTION-MT-CHECK-NEG");
        $list13 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("assertionMt")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionMt")), makeKeyword("ASSERTION"), makeKeyword("CLOSED-HLMT")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*DEFAULT-ASSERTION-MT-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionMt")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("MT"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("MT")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("MT")),
                        list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-HAS-MT?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("MT"))))),
                makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-MT-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertionMt <assertion> <hlmt-p>))"), makeKeyword("EXAMPLE"),
                makeString("(#$not \n      (#$assertionMt \n        (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection)) \n        #$BookkeepingMt))") });
        $REMOVAL_ASSERTION_MT_UNIFY = makeKeyword("REMOVAL-ASSERTION-MT-UNIFY");
        $list15 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionMt")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionMt")), makeKeyword("ASSERTION"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"),
                ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionMt")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-MT"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("assertionMt")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-MT-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionMt <assertion> <not-fully-bound>)"),
                makeKeyword("EXAMPLE"), makeString("(#$assertionMt\n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection)) \n      ?WHAT)") });
        $REMOVAL_ASSERTION_MT_LOOKUP = makeKeyword("REMOVAL-ASSERTION-MT-LOOKUP");
        $list17 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionMt")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionMt")), makeKeyword("VARIABLE"), makeKeyword("CLOSED-HLMT")), makeKeyword("COST"),
                makeSymbol("REMOVAL-ASSERTION-MT-LOOKUP-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionMt")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("MT"))), list(makeKeyword("VALUE"), makeSymbol("MT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("GATHER-MT-INDEX"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("assertionMt")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("MT"))), makeKeyword("SUPPORT"),
                makeSymbol("MAKE-ASSERTION-MT-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionMt <variable> <hlmt-p>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionMt ?ASSERTION #$LogicalTruthMt)") });
        $$assertionSentence = makeConstSym(("assertionSentence"));
        $sym19$_ASSERTION_SENTENCE_DEFINING_MT_ = makeSymbol("*ASSERTION-SENTENCE-DEFINING-MT*");
        $REMOVAL_ASSERTION_FORMULA_CHECK_POS = makeKeyword("REMOVAL-ASSERTION-FORMULA-CHECK-POS");
        $list21 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionSentence")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionSentence")), makeKeyword("ASSERTION"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-SENTENCE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionSentence")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("SENTENCE"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("SENTENCE")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("SENTENCE")), list(makeKeyword("CALL"), makeSymbol("ASSERTION-SENTENCE?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("SENTENCE")))), makeKeyword("SUPPORT"),
                makeSymbol("MAKE-ASSERTION-SENTENCE-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionSentence <assertion> <fully-bound>)"), makeKeyword("EXAMPLE"),
                makeString("(#$assertionSentence \n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection))\n      (#$isa #$Thing #$Collection))") });
        $REMOVAL_ASSERTION_FORMULA_CHECK_NEG = makeKeyword("REMOVAL-ASSERTION-FORMULA-CHECK-NEG");
        $list23 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("assertionSentence")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionSentence")), makeKeyword("ASSERTION"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-SENTENCE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"),
                        list(makeConstSym(("assertionSentence")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("SENTENCE"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("SENTENCE")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("SENTENCE")),
                        list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-SENTENCE?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("SENTENCE"))))),
                makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-SENTENCE-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertionSentence <assertion> <fully-bound>))"), makeKeyword("EXAMPLE"),
                makeString("(#$not\n      (#$assertionSentence \n        (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection))\n        (#$genls #$Collection #$Thing)))") });
        $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
        $sym25$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $sym26$_EXIT = makeSymbol("%EXIT");
        $REMOVAL_ASSERTION_FORMULA_UNIFY = makeKeyword("REMOVAL-ASSERTION-FORMULA-UNIFY");
        $list28 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionSentence")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionSentence")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionSentence")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-FI-FORMULA-ROBUST"), makeKeyword("INPUT"), T)), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("assertionSentence")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-SENTENCE-SUPPORT"), makeKeyword("DOCUMENTATION"),
                makeString("(#$assertionSentence <assertion> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionSentence\n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection)) \n      ?WHAT)") });
        $REMOVAL_ASSERTION_FORMULA_LOOKUP = makeKeyword("REMOVAL-ASSERTION-FORMULA-LOOKUP");
        $list30 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionSentence")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionSentence")), makeKeyword("VARIABLE"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-SENTENCE-LOOKUP-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionSentence")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("SENTENCE"))), list(makeKeyword("VALUE"), makeSymbol("SENTENCE"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("FIND-VISIBLE-ASSERTIONS-CYCL"), makeKeyword("INPUT"), makeConstSym(("EverythingPSC"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("assertionSentence")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("SENTENCE"))),
                makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-SENTENCE-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionSentence <variable> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionSentence ?ASSERTION (#$isa #$Thing #$Collection))") });
        $sym31$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $$EverythingPSC = makeConstSym(("EverythingPSC"));
        $GAF_ARG = makeKeyword("GAF-ARG");
        $GAF = makeKeyword("GAF");
        $PREDICATE_EXTENT = makeKeyword("PREDICATE-EXTENT");
        $OVERLAP = makeKeyword("OVERLAP");
        $REMOVAL_ASSERTION_FORMULA_UNBOUND_ASSERTION_PRED_LOOKUP = makeKeyword("REMOVAL-ASSERTION-FORMULA-UNBOUND-ASSERTION-PRED-LOOKUP");
        $list38 = list(
                new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionSentence")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionSentence")), makeKeyword("VARIABLE"), cons(makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND"))),
                        makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTION-SENTENCE-UNBOUND-ASSERTION-PRED-LOOKUP-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTION-SENTENCE-UNBOUND-ASSERTION-PRED-LOOKUP-EXPAND"),
                        makeKeyword("DOCUMENTATION"), makeString("(#$assertionSentence <variable> (<predicate> ...)) \n    using only GAF indexing of assertions indexed by <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$assertionSentence ?ASSERTION (#$interArgIsa1-3 ?PRED ?COL1 ?COL2))") });
        $REMOVAL_ASSERTION_FORMULA_UNBOUND_ASSERTION_ARG_LOOKUP = makeKeyword("REMOVAL-ASSERTION-FORMULA-UNBOUND-ASSERTION-ARG-LOOKUP");
        $list40 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionSentence")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("assertionSentence")), makeKeyword("VARIABLE"), list(makeKeyword("AND"), cons(list(makeKeyword("NOT"), makeKeyword("FORT")), makeKeyword("ANYTHING")), list(makeKeyword("TEST"), makeSymbol("ASENT-HAS-FORT-ARG-P")))), makeKeyword("COST"),
                makeSymbol("REMOVAL-ASSERTION-SENTENCE-UNBOUND-ASSERTION-ARG-LOOKUP-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTION-SENTENCE-UNBOUND-ASSERTION-ARG-LOOKUP-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$assertionSentence <variable> (<not fully-bound> ... <fort> ...)) \n     using only KB GAF indexing of assertions indexed by <fort>."), makeKeyword("EXAMPLE"), makeString("(#$assertionSentence ?ASSERTION (?PRED ?ARG1 ?ARG2 #$ShowerHead))") });
        $$assertionID = makeConstSym(("assertionID"));
        $sym42$_ASSERTION_ID_DEFINING_MT_ = makeSymbol("*ASSERTION-ID-DEFINING-MT*");
        $REMOVAL_ASSERTION_ID_CHECK_POS = makeKeyword("REMOVAL-ASSERTION-ID-CHECK-POS");
        $list44 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionID")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionID")), makeKeyword("ASSERTION"), makeKeyword("INTEGER")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*DEFAULT-ASSERTION-ID-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionID")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("ID"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ID")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("ID")), list(makeKeyword("CALL"), makeSymbol("ASSERTION-HAS-ID?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ID")))),
                makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-ID-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionID <assertion> <integer>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionID\n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection)) \n      163059)") });
        $REMOVAL_ASSERTION_ID_CHECK_NEG = makeKeyword("REMOVAL-ASSERTION-ID-CHECK-NEG");
        $list46 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("assertionID")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionID")), makeKeyword("ASSERTION"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*DEFAULT-ASSERTION-ID-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionID")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("ID"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ID")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("ID")),
                        list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-HAS-ID?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ID"))))),
                makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-ID-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertionID <assertion> <fully-bound>))"), makeKeyword("EXAMPLE"),
                makeString("(#$not\n      (#$assertionID \n        (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection)) \n        123456))") });
        $REMOVAL_ASSERTION_ID_UNIFY = makeKeyword("REMOVAL-ASSERTION-ID-UNIFY");
        $list48 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionID")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionID")), makeKeyword("ASSERTION"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"),
                ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionID")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-ID"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("assertionID")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-ID-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionID <assertion> <not-fully-bound>)"),
                makeKeyword("EXAMPLE"), makeString("(#$assertionID\n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection)) \n      ?ID)") });
        $REMOVAL_ASSERTION_ID_LOOKUP = makeKeyword("REMOVAL-ASSERTION-ID-LOOKUP");
        $list50 = list(
                new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionID")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionID")), makeKeyword("VARIABLE"), makeKeyword("INTEGER")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER,
                        makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionID")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("ID"))), list(makeKeyword("VALUE"), makeSymbol("ID"))),
                        makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("FIND-ASSERTION-BY-ID"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                        list(makeConstSym(("assertionID")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("ID"))), makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-ID-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionID <not-fully-bound> <integer>)"),
                        makeKeyword("EXAMPLE"), makeString("(#$assertionID ?ASSERTION 123456)") });
        $$assertionDirection = makeConstSym(("assertionDirection"));
        $list52 = list(makeConstSym(("Forward-AssertionDirection")), makeConstSym(("Backward-AssertionDirection")), makeConstSym(("Code-AssertionDirection")));
        $FORWARD = makeKeyword("FORWARD");
        $$Forward_AssertionDirection = makeConstSym(("Forward-AssertionDirection"));
        $BACKWARD = makeKeyword("BACKWARD");
        $$Backward_AssertionDirection = makeConstSym(("Backward-AssertionDirection"));
        $CODE = makeKeyword("CODE");
        $$Code_AssertionDirection = makeConstSym(("Code-AssertionDirection"));
        $str59$_S_was_not_a_direction_p = makeString("~S was not a direction-p");
        $str60$_S_was_not_a_cycl_direction_p = makeString("~S was not a cycl-direction-p");
        $sym61$_ASSERTION_DIRECTION_DEFINING_MT_ = makeSymbol("*ASSERTION-DIRECTION-DEFINING-MT*");
        $REMOVAL_ASSERTION_DIRECTION_CHECK_POS = makeKeyword("REMOVAL-ASSERTION-DIRECTION-CHECK-POS");
        $list63 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionDirection")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("assertionDirection")), makeKeyword("ASSERTION"), list(makeKeyword("AND"), makeKeyword("CONSTANT"), list(makeKeyword("TEST"), makeSymbol("CYCL-DIRECTION-P")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-DIRECTION-CHECK-COST*"),
                makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionDirection")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("CYCL-DIRECTION"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("CYCL-DIRECTION")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("CYCL-DIRECTION")), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("CALL"), makeSymbol("CYCL-DIRECTION-TO-DIRECTION"), list(makeKeyword("VALUE"), makeSymbol("CYCL-DIRECTION"))))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("DIRECTION")), list(makeKeyword("CALL"), makeSymbol("ASSERTION-HAS-DIRECTION"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("DIRECTION")))), makeKeyword("SUPPORT"),
                makeSymbol("MAKE-ASSERTION-DIRECTION-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionDirection <assertion> <constant>)\n    where <constant> is a CycL direction"), makeKeyword("EXAMPLE"),
                makeString("(#$assertionDirection \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$Forward-AssertionDirection)") });
        $REMOVAL_ASSERTION_DIRECTION_CHECK_NEG = makeKeyword("REMOVAL-ASSERTION-DIRECTION-CHECK-NEG");
        $list65 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("assertionDirection")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("assertionDirection")), makeKeyword("ASSERTION"), list(makeKeyword("AND"), makeKeyword("CONSTANT"), list(makeKeyword("TEST"), makeSymbol("CYCL-DIRECTION-P")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-DIRECTION-CHECK-COST*"),
                makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionDirection")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("CYCL-DIRECTION"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("CYCL-DIRECTION")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("CYCL-DIRECTION")), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("CALL"), makeSymbol("CYCL-DIRECTION-TO-DIRECTION"), list(makeKeyword("VALUE"), makeSymbol("CYCL-DIRECTION"))))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("DIRECTION")),
                        list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-HAS-DIRECTION"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("DIRECTION"))))),
                makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-DIRECTION-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertionDirection <assertion> <fort>))"), makeKeyword("EXAMPLE"),
                makeString("(#$not\n     (#$assertionDirection \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$Backward-AssertionDirection))") });
        $REMOVAL_ASSERTION_DIRECTION_UNIFY = makeKeyword("REMOVAL-ASSERTION-DIRECTION-UNIFY");
        $list67 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionDirection")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionDirection")), makeKeyword("ASSERTION"), makeKeyword("VARIABLE")),
                makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionDirection")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-DIRECTION"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("DIRECTION-TO-CYCL-DIRECTION"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("assertionDirection")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-DIRECTION-SUPPORT"), makeKeyword("DOCUMENTATION"),
                makeString("(#$assertionDirection <assertion> <variable>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionDirection \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      ?DIRECTION)") });
        $$assertionStrength = makeConstSym(("assertionStrength"));
        $list69 = list(makeConstSym(("Default-JustificationStrength")), makeConstSym(("Monotonic-JustificationStrength")));
        $DEFAULT = makeKeyword("DEFAULT");
        $$Default_JustificationStrength = makeConstSym(("Default-JustificationStrength"));
        $MONOTONIC = makeKeyword("MONOTONIC");
        $$Monotonic_JustificationStrength = makeConstSym(("Monotonic-JustificationStrength"));
        $str74$_S_was_not_a_el_strength_p = makeString("~S was not a el-strength-p");
        $str75$_S_was_not_a_cycl_strength_p = makeString("~S was not a cycl-strength-p");
        $sym76$ASSERTION_P = makeSymbol("ASSERTION-P");
        $sym77$EL_STRENGTH_P = makeSymbol("EL-STRENGTH-P");
        $sym78$_ASSERTION_STRENGTH_DEFINING_MT_ = makeSymbol("*ASSERTION-STRENGTH-DEFINING-MT*");
        $REMOVAL_ASSERTION_STRENGTH_CHECK_POS = makeKeyword("REMOVAL-ASSERTION-STRENGTH-CHECK-POS");
        $list80 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionStrength")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("assertionStrength")), makeKeyword("ASSERTION"), list(makeKeyword("AND"), makeKeyword("CONSTANT"), list(makeKeyword("TEST"), makeSymbol("CYCL-STRENGTH-P")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-STRENGTH-CHECK-COST*"),
                makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionStrength")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("CYCL-STRENGTH"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("CYCL-STRENGTH")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("CYCL-STRENGTH")), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("CALL"), makeSymbol("CYCL-STRENGTH-TO-STRENGTH"), list(makeKeyword("VALUE"), makeSymbol("CYCL-STRENGTH"))))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("STRENGTH")), list(makeKeyword("CALL"), makeSymbol("ASSERTION-HAS-STRENGTH"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("STRENGTH")))), makeKeyword("SUPPORT"),
                makeSymbol("MAKE-ASSERTION-STRENGTH-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionStrength <assertion> <constant>)\n    where <constant> is a CycL justification strength"), makeKeyword("EXAMPLE"),
                makeString("(#$assertionStrength\n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$Monotonic-JustificationStrength)") });
        $REMOVAL_ASSERTION_STRENGTH_CHECK_NEG = makeKeyword("REMOVAL-ASSERTION-STRENGTH-CHECK-NEG");
        $list82 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("assertionStrength")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("assertionStrength")), makeKeyword("ASSERTION"), list(makeKeyword("AND"), makeKeyword("CONSTANT"), list(makeKeyword("TEST"), makeSymbol("CYCL-STRENGTH-P")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-STRENGTH-CHECK-COST*"),
                makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionStrength")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("CYCL-STRENGTH"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("CYCL-STRENGTH")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("CYCL-STRENGTH")), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("CALL"), makeSymbol("CYCL-STRENGTH-TO-STRENGTH"), list(makeKeyword("VALUE"), makeSymbol("CYCL-STRENGTH"))))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("STRENGTH")),
                        list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-HAS-STRENGTH"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("STRENGTH"))))),
                makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-STRENGTH-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertionStrength <assertion> <constant>))"), makeKeyword("EXAMPLE"),
                makeString("(#$not\n     (#$assertionStrength \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$Default-JustificationStrength))") });
        $REMOVAL_ASSERTION_STRENGTH_UNIFY = makeKeyword("REMOVAL-ASSERTION-STRENGTH-UNIFY");
        $list84 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionStrength")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionStrength")), makeKeyword("ASSERTION"), makeKeyword("VARIABLE")),
                makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionStrength")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-STRENGTH"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("STRENGTH-TO-CYCL-STRENGTH"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("assertionStrength")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-STRENGTH-SUPPORT"), makeKeyword("DOCUMENTATION"),
                makeString("(#$assertionStength <assertion> <variable>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionStrength \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      ?STRENGTH)") });
        $$assertionTruth = makeConstSym(("assertionTruth"));
        $list86 = list(makeConstSym(("True-JustificationTruth")), makeConstSym(("False-JustificationTruth")), makeConstSym(("Unknown-JustificationTruth")));
        $TRUE = makeKeyword("TRUE");
        $$True_JustificationTruth = makeConstSym(("True-JustificationTruth"));
        $FALSE = makeKeyword("FALSE");
        $$False_JustificationTruth = makeConstSym(("False-JustificationTruth"));
        $UNKNOWN = makeKeyword("UNKNOWN");
        $$Unknown_JustificationTruth = makeConstSym(("Unknown-JustificationTruth"));
        $str93$_S_was_not_a_truth_p = makeString("~S was not a truth-p");
        $str94$_S_was_not_a_cycl_truth_p = makeString("~S was not a cycl-truth-p");
        $sym95$_ASSERTION_TRUTH_DEFINING_MT_ = makeSymbol("*ASSERTION-TRUTH-DEFINING-MT*");
        $REMOVAL_ASSERTION_TRUTH_CHECK_POS = makeKeyword("REMOVAL-ASSERTION-TRUTH-CHECK-POS");
        $list97 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionTruth")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("assertionTruth")), makeKeyword("ASSERTION"), list(makeKeyword("AND"), makeKeyword("CONSTANT"), list(makeKeyword("TEST"), makeSymbol("CYCL-TRUTH-P")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-TRUTH-CHECK-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionTruth")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("CYCL-TRUTH"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("CYCL-TRUTH")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("CYCL-TRUTH")), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("CALL"), makeSymbol("CYCL-TRUTH-TO-TRUTH"), list(makeKeyword("VALUE"), makeSymbol("CYCL-TRUTH"))))),
                makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("TRUTH")), list(makeKeyword("CALL"), makeSymbol("ASSERTION-HAS-TRUTH"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("TRUTH")))),
                makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-TRUTH-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionTruth <assertion> <constant>)\n    where <constant> is a CycL justification truth"), makeKeyword("EXAMPLE"),
                makeString("(#$assertionTruth\n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$True-JustificationTruth)") });
        $REMOVAL_ASSERTION_TRUTH_CHECK_NEG = makeKeyword("REMOVAL-ASSERTION-TRUTH-CHECK-NEG");
        $list99 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("assertionTruth")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("assertionTruth")), makeKeyword("ASSERTION"), list(makeKeyword("AND"), makeKeyword("CONSTANT"), list(makeKeyword("TEST"), makeSymbol("CYCL-TRUTH-P")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-TRUTH-CHECK-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionTruth")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("CYCL-TRUTH"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("CYCL-TRUTH")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("CYCL-TRUTH")), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("CALL"), makeSymbol("CYCL-TRUTH-TO-TRUTH"), list(makeKeyword("VALUE"), makeSymbol("CYCL-TRUTH"))))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("TRUTH")),
                        list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-HAS-TRUTH"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("TRUTH"))))),
                makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-TRUTH-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertionTruth <assertion> <constant>))"), makeKeyword("EXAMPLE"),
                makeString("(#$not\n     (#$assertionTruth \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$False-JustificationTruth))") });
        $REMOVAL_ASSERTION_TRUTH_UNIFY = makeKeyword("REMOVAL-ASSERTION-TRUTH-UNIFY");
        $list101 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionTruth")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionTruth")), makeKeyword("ASSERTION"), makeKeyword("VARIABLE")), makeKeyword("COST-EXPRESSION"),
                ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionTruth")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-TRUTH"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("TRUTH-TO-CYCL-TRUTH"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("assertionTruth")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-TRUTH-SUPPORT"), makeKeyword("DOCUMENTATION"),
                makeString("(#$assertionTruth <assertion> <variable>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionTruth\n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      ?TRUTH)") });
        $$assertionJustificationAttribute = makeConstSym(("assertionJustificationAttribute"));
        $sym103$FORT_P = makeSymbol("FORT-P");
        $$AssertedBelief = makeConstSym(("AssertedBelief"));
        $$SupportedByMaterialImplication = makeConstSym(("SupportedByMaterialImplication"));
        $sym106$_ASSERTION_JUST_ATT_DEFINING_MT_ = makeSymbol("*ASSERTION-JUST-ATT-DEFINING-MT*");
        $REMOVAL_ASSERTION_JUST_ATT_CHECK_POS = makeKeyword("REMOVAL-ASSERTION-JUST-ATT-CHECK-POS");
        $list108 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionJustificationAttribute")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionJustificationAttribute")), makeKeyword("ASSERTION"), makeKeyword("FORT")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-JUST-ATT-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionJustificationAttribute")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("ATT"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ATT")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("ATT")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-ASSERTION-JUST-ATT"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ATT")))), makeKeyword("SUPPORT"),
                makeSymbol("MAKE-ASSERTION-JUST-ATT-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionJustificationAttribute <assertion> <fort>)"), makeKeyword("EXAMPLE"),
                makeString("(#$assertionJustificationAttribute\n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection))\n      #$AssertedBelief)") });
        $REMOVAL_ASSERTION_JUST_ATT_CHECK_NEG = makeKeyword("REMOVAL-ASSERTION-JUST-ATT-CHECK-NEG");
        $list110 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("assertionJustificationAttribute")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionJustificationAttribute")), makeKeyword("ASSERTION"), makeKeyword("FORT")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-JUST-ATT-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"),
                        list(makeConstSym(("assertionJustificationAttribute")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("ATT"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ATT")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("ATT")),
                        list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("INFERENCE-ASSERTION-JUST-ATT"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ATT"))))),
                makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-JUST-ATT-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertionJustificationAttribute <assertion> <fort>))"), makeKeyword("EXAMPLE"),
                makeString("(#$not\n      (#$assertionJustificationAttribute \n        (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection))\n        #$SupportedByMaterialImplication))") });
        $REMOVAL_ASSERTION_JUST_ATT_UNIFY = makeKeyword("REMOVAL-ASSERTION-JUST-ATT-UNIFY");
        $list112 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionJustificationAttribute")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("assertionJustificationAttribute")), makeKeyword("ASSERTION"), makeKeyword("VARIABLE")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionJustificationAttribute")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("INFERENCE-ALL-ASSERTION-JUST-ATT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("assertionJustificationAttribute")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("INPUT")),
                makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-JUST-ATT-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionJustificationAttribute <assertion> <variable>)"), makeKeyword("EXAMPLE"),
                makeString("(#$assertionJustificationAttribute\n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection)) \n      ?ATT)") });
        $$assertionAssertBy = makeConstSym(("assertionAssertBy"));
        $sym114$_ASSERTION_ASSERT_BY_DEFINING_MT_ = makeSymbol("*ASSERTION-ASSERT-BY-DEFINING-MT*");
        $str115$Computing_assertions_asserted_by_ = makeString("Computing assertions asserted by ~S");
        $sym116$STRINGP = makeSymbol("STRINGP");
        $SKIP = makeKeyword("SKIP");
        $LATENCY = makeKeyword("LATENCY");
        $sym119$ASSERTION_ASSERTED_BY_ = makeSymbol("ASSERTION-ASSERTED-BY?");
        $TOTAL_TIME = makeKeyword("TOTAL-TIME");
        $str121$_S_was_not_one_of__latency_or__to = makeString("~S was not one of :latency or :total-time");
        $REMOVAL_ASSERTION_ASSERT_BY_CHECK_POS = makeKeyword("REMOVAL-ASSERTION-ASSERT-BY-CHECK-POS");
        $list123 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionAssertBy")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionAssertBy")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-ASSERT-BY-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionAssertBy")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("CYCLIST"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("CYCLIST")))),
                makeKeyword("INPUT-VERIFY-PATTERN"), list(makeKeyword("ASSERTION"), makeKeyword("ANYTHING")), makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("CYCLIST")), list(makeKeyword("CALL"), makeSymbol("ASSERTION-ASSERTED-BY?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("CYCLIST")))), makeKeyword("SUPPORT-MODULE"),
                makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*ASSERTION-ASSERT-BY-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionAssertBy <assertion> <fully-bound>)"), makeKeyword("EXAMPLE"),
                makeString("(#$assertionAssertBy \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$Pace)") });
        $REMOVAL_ASSERTION_ASSERT_BY_CHECK_NEG = makeKeyword("REMOVAL-ASSERTION-ASSERT-BY-CHECK-NEG");
        $list125 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("assertionAssertBy")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionAssertBy")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-ASSERT-BY-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"),
                        list(makeConstSym(("assertionAssertBy")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("CYCLIST"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("CYCLIST")))),
                makeKeyword("INPUT-VERIFY-PATTERN"), list(makeKeyword("ASSERTION"), makeKeyword("ANYTHING")), makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("CYCLIST")),
                        list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-ASSERTED-BY?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("CYCLIST"))))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*ASSERTION-ASSERT-BY-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (#$assertionAssertBy <assertion> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not\n     (#$assertionAssertBy \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$Lenat))") });
        $REMOVAL_ASSERTION_ASSERT_BY_UNIFY = makeKeyword("REMOVAL-ASSERTION-ASSERT-BY-UNIFY");
        $list127 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionAssertBy")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionAssertBy")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionAssertBy")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("INPUT-VERIFY-PATTERN"), makeKeyword("ASSERTION"),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("ASSERTED-BY"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("assertionAssertBy")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*ASSERTION-ASSERT-BY-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"),
                makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionAssertBy <assertion> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionAssertBy \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      ?WHO)") });
        $$HumanCyclist = makeConstSym(("HumanCyclist"));
        $REMOVAL_ASSERTION_ASSERT_BY_LOOKUP = makeKeyword("REMOVAL-ASSERTION-ASSERT-BY-LOOKUP");
        $list130 = list(
                new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionAssertBy")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionAssertBy")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
                        makeKeyword("COST-PATTERN"),
                        list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionAssertBy")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("CYCLIST"))),
                                list(makeKeyword("CALL"), makeSymbol("REMOVAL-ASSERTION-ASSERT-BY-LOOKUP-COST"), list(makeKeyword("VALUE"), makeSymbol("CYCLIST")))),
                        makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                        list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionAssertBy")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("CYCLIST"))), list(makeKeyword("VALUE"), makeSymbol("CYCLIST"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                        list(makeKeyword("CALL"), makeSymbol("REMOVAL-ASSERTION-ASSERTED-BY-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("assertionAssertBy")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("CYCLIST"))),
                        makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*ASSERTION-ASSERT-BY-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"),
                        makeString("(#$assertionAssertBy <variable> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionAssertBy ?ASSERTION #$Lenat)") });
        $DISPREFER_ASSERTION_ASSERT_BY_LOOKUP = makeKeyword("DISPREFER-ASSERTION-ASSERT-BY-LOOKUP");
        $list132 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionAssertBy")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionAssertBy")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $$assertionAssertTime = makeConstSym(("assertionAssertTime"));
        $sym134$_ASSERTION_ASSERT_TIME_DEFINING_MT_ = makeSymbol("*ASSERTION-ASSERT-TIME-DEFINING-MT*");
        $sym135$UNIVERSAL_DATE_P = makeSymbol("UNIVERSAL-DATE-P");
        $str136$Computing_assertions_asserted_on_ = makeString("Computing assertions asserted on ~A");
        $sym137$ASSERTION_ASSERTED_WHEN_ = makeSymbol("ASSERTION-ASSERTED-WHEN?");
        $REMOVAL_ASSERTION_ASSERT_TIME_CHECK_POS = makeKeyword("REMOVAL-ASSERTION-ASSERT-TIME-CHECK-POS");
        $list139 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionAssertTime")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionAssertTime")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-ASSERT-TIME-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionAssertTime")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("UNIVERSAL-DATE"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("UNIVERSAL-DATE")))),
                makeKeyword("INPUT-VERIFY-PATTERN"), list(makeKeyword("ASSERTION"), list(makeKeyword("AND"), makeKeyword("INTEGER"), list(makeKeyword("TEST"), makeSymbol("UNIVERSAL-DATE-P")))), makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("UNIVERSAL-DATE")), list(makeKeyword("CALL"), makeSymbol("ASSERTION-ASSERTED-WHEN?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("UNIVERSAL-DATE")))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*ASSERTION-ASSERT-TIME-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionAssertTime <assertion> <integer>)"),
                makeKeyword("EXAMPLE"), makeString("(#$assertionAssertTime \n      (#$ist #$LogicalTruthMt (#$disjointWith #$Collection #$Individual))\n      20020411)") });
        $REMOVAL_ASSERTION_ASSERT_TIME_CHECK_NEG = makeKeyword("REMOVAL-ASSERTION-ASSERT-TIME-CHECK-NEG");
        $list141 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("assertionAssertTime")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionAssertTime")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-ASSERT-TIME-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionAssertTime")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("UNIVERSAL-DATE"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("UNIVERSAL-DATE")))),
                makeKeyword("INPUT-VERIFY-PATTERN"), list(makeKeyword("ASSERTION"), list(makeKeyword("AND"), makeKeyword("INTEGER"), list(makeKeyword("TEST"), makeSymbol("UNIVERSAL-DATE-P")))), makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("UNIVERSAL-DATE")),
                        list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-ASSERTED-WHEN?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("UNIVERSAL-DATE"))))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*ASSERTION-ASSERT-TIME-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (#$assertionAssertTime <assertion> <integer>))"), makeKeyword("EXAMPLE"), makeString("(#$not\n     (#$assertionAssertTime \n      (#$ist #$LogicalTruthMt (#$disjointWith #$Collection #$Individual))\n      19950524))") });
        $REMOVAL_ASSERTION_ASSERT_TIME_UNIFY = makeKeyword("REMOVAL-ASSERTION-ASSERT-TIME-UNIFY");
        $list143 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionAssertTime")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionAssertTime")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionAssertTime")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("INPUT-VERIFY-PATTERN"), makeKeyword("ASSERTION"),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("ASSERTED-WHEN"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("assertionAssertTime")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*ASSERTION-ASSERT-TIME-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"),
                makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionAssertTime <assertion> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionAssertTime \n      (#$ist #$LogicalTruthMt (#$disjointWith #$Collection #$Individual))\n      ?WHEN)") });
        $int$19950522 = makeInteger(19950522);
        $REMOVAL_ASSERTION_ASSERT_TIME_LOOKUP = makeKeyword("REMOVAL-ASSERTION-ASSERT-TIME-LOOKUP");
        $list146 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionAssertTime")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionAssertTime")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionAssertTime")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("UNIVERSAL-DATE"))),
                        list(makeKeyword("CALL"), makeSymbol("REMOVAL-ASSERTION-ASSERT-TIME-LOOKUP-COST"), list(makeKeyword("VALUE"), makeSymbol("UNIVERSAL-DATE")))),
                makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionAssertTime")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("UNIVERSAL-DATE"))), list(makeKeyword("VALUE"), makeSymbol("UNIVERSAL-DATE"))), makeKeyword("INPUT-VERIFY-PATTERN"),
                list(makeKeyword("AND"), makeKeyword("INTEGER"), list(makeKeyword("TEST"), makeSymbol("UNIVERSAL-DATE-P"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ASSERTION-ASSERTED-WHEN-ITERATOR"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("assertionAssertTime")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("UNIVERSAL-DATE"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"),
                makeSymbol("*ASSERTION-ASSERT-TIME-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionAssertTime <variable> <integer>)"), makeKeyword("EXAMPLE"),
                makeString("(#$assertionAssertTime ?ASSERTION 19950524)") });
        $DISPREFER_ASSERTION_ASSERT_TIME_LOOKUP = makeKeyword("DISPREFER-ASSERTION-ASSERT-TIME-LOOKUP");
        $list148 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionAssertTime")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionAssertTime")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
                makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));
        $$assertionAssertPurpose = makeConstSym(("assertionAssertPurpose"));
        $sym150$_ASSERTION_ASSERT_PURPOSE_DEFINING_MT_ = makeSymbol("*ASSERTION-ASSERT-PURPOSE-DEFINING-MT*");
        $str151$Computing_assertions_asserted_for = makeString("Computing assertions asserted for ~S");
        $sym152$ASSERTION_ASSERTED_WHY_ = makeSymbol("ASSERTION-ASSERTED-WHY?");
        $REMOVAL_ASSERTION_ASSERT_PURPOSE_CHECK_POS = makeKeyword("REMOVAL-ASSERTION-ASSERT-PURPOSE-CHECK-POS");
        $list154 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionAssertPurpose")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionAssertPurpose")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-ASSERT-PURPOSE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionAssertPurpose")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("REASON"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("REASON")))),
                makeKeyword("INPUT-VERIFY-PATTERN"), list(makeKeyword("ASSERTION"), makeKeyword("ANYTHING")), makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("REASON")), list(makeKeyword("CALL"), makeSymbol("ASSERTION-ASSERTED-WHY?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("REASON")))), makeKeyword("SUPPORT-MODULE"),
                makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*ASSERTION-ASSERT-PURPOSE-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionAssertPurpose <assertion> <fully-bound>)"), makeKeyword("EXAMPLE"),
                makeString("(#$assertionAssertPurpose \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$GeneralCycKE)") });
        $REMOVAL_ASSERTION_ASSERT_PURPOSE_CHECK_NEG = makeKeyword("REMOVAL-ASSERTION-ASSERT-PURPOSE-CHECK-NEG");
        $list156 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("assertionAssertPurpose")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionAssertPurpose")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-ASSERT-PURPOSE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"),
                        list(makeConstSym(("assertionAssertPurpose")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("REASON"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("REASON")))),
                makeKeyword("INPUT-VERIFY-PATTERN"), list(makeKeyword("ASSERTION"), makeKeyword("ANYTHING")), makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("REASON")),
                        list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-ASSERTED-WHY?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("REASON"))))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*ASSERTION-ASSERT-PURPOSE-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (#$assertionAssertPurpose <assertion> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not\n     (#$assertionAssertPurpose \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$HPKBProject))") });
        $REMOVAL_ASSERTION_ASSERT_PURPOSE_UNIFY = makeKeyword("REMOVAL-ASSERTION-ASSERT-PURPOSE-UNIFY");
        $list158 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionAssertPurpose")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionAssertPurpose")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionAssertPurpose")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("INPUT-VERIFY-PATTERN"), makeKeyword("ASSERTION"),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("ASSERTED-WHY"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("assertionAssertPurpose")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*ASSERTION-ASSERT-PURPOSE-DEFINING-MT*"),
                makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionAssertPurpose <assertion> <not fully-bound>)"), makeKeyword("EXAMPLE"),
                makeString("(#$assertionAssertPurpose \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      ?WHY)") });
        $$Cyc_BasedProject = makeConstSym(("Cyc-BasedProject"));
        $REMOVAL_ASSERTION_ASSERT_PURPOSE_LOOKUP = makeKeyword("REMOVAL-ASSERTION-ASSERT-PURPOSE-LOOKUP");
        $list161 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionAssertPurpose")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionAssertPurpose")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionAssertPurpose")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("REASON"))),
                        list(makeKeyword("CALL"), makeSymbol("REMOVAL-ASSERTION-ASSERT-PURPOSE-LOOKUP-COST"), list(makeKeyword("VALUE"), makeSymbol("REASON")))),
                makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionAssertPurpose")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("REASON"))), list(makeKeyword("VALUE"), makeSymbol("REASON"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-ASSERTION-ASSERTED-WHY-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("assertionAssertPurpose")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("REASON"))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*ASSERTION-ASSERT-PURPOSE-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"),
                makeString("(#$assertionAssertPurpose <variable> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionAssertPurpose ?ASSERTION #$HPKBProject)\n    (#$thereExists ?ASSERTION\n      (#$assertionAssertPurpose ?ASSERTION #$GeneralCycKE))") });
        $DISPREFER_ASSERTION_ASSERT_PURPOSE_LOOKUP = makeKeyword("DISPREFER-ASSERTION-ASSERT-PURPOSE-LOOKUP");
        $list163 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionAssertPurpose")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionAssertPurpose")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
                makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));
        $$assertionAssertDate = makeConstSym(("assertionAssertDate"));
        $sym165$_ASSERTION_ASSERT_DATE_DEFINING_MT_ = makeSymbol("*ASSERTION-ASSERT-DATE-DEFINING-MT*");
        $REMOVAL_ASSERTION_ASSERT_DATE_CHECK_POS = makeKeyword("REMOVAL-ASSERTION-ASSERT-DATE-CHECK-POS");
        $list167 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionAssertDate")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionAssertDate")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-ASSERT-DATE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionAssertDate")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("CYCL-DATE"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("CYCL-DATE")))),
                makeKeyword("INPUT-VERIFY-PATTERN"), list(makeKeyword("ASSERTION"), list(makeKeyword("TEST"), makeSymbol("GENERALIZED-DATE-P"))), makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("CYCL-DATE")), list(makeKeyword("CALL"), makeSymbol("ASSERTION-ASSERTED-DATE?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("CYCL-DATE")))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*ASSERTION-ASSERT-DATE-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionAssertDate <assertion> <cycl-date>)"),
                makeKeyword("EXAMPLE"), makeString("(#$assertionAssertDate \n      (#$ist #$LogicalTruthMt (#$disjointWith #$Collection #$Individual))\n      (#$DayFn 11 (#$MonthFn #$April (#$YearFn 2002))))") });
        $REMOVAL_ASSERTION_ASSERT_DATE_CHECK_NEG = makeKeyword("REMOVAL-ASSERTION-ASSERT-DATE-CHECK-NEG");
        $list169 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("assertionAssertDate")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionAssertDate")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-ASSERT-DATE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionAssertDate")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("CYCL-DATE"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("CYCL-DATE")))),
                makeKeyword("INPUT-VERIFY-PATTERN"), list(makeKeyword("ASSERTION"), list(makeKeyword("TEST"), makeSymbol("GENERALIZED-DATE-P"))), makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("CYCL-DATE")),
                        list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-ASSERTED-DATE?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("CYCL-DATE"))))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*ASSERTION-ASSERT-DATE-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (#$assertionAssertDate <assertion> <integer>))"), makeKeyword("EXAMPLE"), makeString("(#$not\n     (#$assertionAssertDate \n      (#$ist #$LogicalTruthMt (#$disjointWith #$Collection #$Individual))\n      (#$DayFn 24 (#$MonthFn #$May (#$YearFn 1995)))))") });
        $REMOVAL_ASSERTION_ASSERT_DATE_UNIFY = makeKeyword("REMOVAL-ASSERTION-ASSERT-DATE-UNIFY");
        $list171 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionAssertDate")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionAssertDate")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionAssertDate")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("INPUT-VERIFY-PATTERN"), makeKeyword("ASSERTION"),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-DATE"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("assertionAssertDate")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*ASSERTION-ASSERT-DATE-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"),
                makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionAssertDate <assertion> <not fully-bound>)"), makeKeyword("EXAMPLE"),
                makeString("(#$assertionAssertDate \n      (#$ist #$LogicalTruthMt (#$disjointWith #$Collection #$Individual))\n      ?WHEN)\n    (#$assertionAssertDate \n      (#$ist #$LogicalTruthMt (#$disjointWith #$Collection #$Individual))\n      (#$DayFn ?DATE ?MONTH))") });
        $REMOVAL_ASSERTION_ASSERT_DATE_LOOKUP = makeKeyword("REMOVAL-ASSERTION-ASSERT-DATE-LOOKUP");
        $list173 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionAssertDate")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionAssertDate")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionAssertDate")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("CYCL-DATE"))),
                        list(makeKeyword("CALL"), makeSymbol("REMOVAL-ASSERTION-ASSERT-DATE-LOOKUP-COST"), list(makeKeyword("VALUE"), makeSymbol("CYCL-DATE")))),
                makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionAssertDate")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("CYCL-DATE"))), list(makeKeyword("VALUE"), makeSymbol("CYCL-DATE"))), makeKeyword("INPUT-VERIFY-PATTERN"),
                list(makeKeyword("TEST"), makeSymbol("GENERALIZED-DATE-P")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NEW-ASSERTION-ASSERTED-DATE-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("assertionAssertDate")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("CYCL-DATE"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*ASSERTION-ASSERT-DATE-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"),
                makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionAssertDate <variable> <cycl-date>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionAssertDate ?ASSERTION (#$DayFn 24 (#$MonthFn #$May (#$YearFn 1995))))") });
        $DISPREFER_ASSERTION_ASSERT_DATE_LOOKUP = makeKeyword("DISPREFER-ASSERTION-ASSERT-DATE-LOOKUP");
        $list175 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionAssertDate")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionAssertDate")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
                makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));
        $REMOVAL_ASSERTION_ASSERT_BY_AND_TIME_CONJUNCTIVE = makeKeyword("REMOVAL-ASSERTION-ASSERT-BY-AND-TIME-CONJUNCTIVE");
        $list177 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("EVERY-PREDICATES"), list(makeConstSym(("assertionAssertBy")), makeConstSym(("assertionAssertTime"))), makeKeyword("APPLICABILITY"),
                makeSymbol("REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-APPLICABILITY"), makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND-ITERATIVE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-EXPAND-ITERATOR"), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"),
                makeString(
                        "(#$and (#$assertionAssertBy <not-fully-bound 0> <fort-p>)\n           (#$assertionAssertTime <not-fully-bound 0> <fully-bound>))\n    or\n    (#$and (#$assertionAssertBy <not-fully-bound 0> <fort-p>)\n           (#$assertionAssertTime <not-fully-bound 0> <not-fully-bound 0>)\n           [(<number comparison pred> <not-fully-bound 0> <fully-bound>)]..."),
                makeKeyword("EXAMPLE"), makeString("(#$and (#$assertionAssertBy ?ASSERTION #$Guest)\n           (#$assertionAssertTime ?ASSERTION ?TIME)\n           (#$greaterThanOrEqualTo ?TIME 19000101)\n           (#$lessThan ?TIME 20000101)") });
        $list178 = list(makeConstSym(("lessThanOrEqualTo")), makeConstSym(("lessThan")), makeConstSym(("greaterThanOrEqualTo")), makeConstSym(("greaterThan")));
        $sym179$CONTEXTUALIZED_ASENT_ASENT = makeSymbol("CONTEXTUALIZED-ASENT-ASENT");
        $sym180$_ = makeSymbol("<");
        $sym181$ASSERTION_ASSERTED_BY_ASENT_ = makeSymbol("ASSERTION-ASSERTED-BY-ASENT?");
        $sym182$ASSERTION_ASSERT_TIME_ASENT_ = makeSymbol("ASSERTION-ASSERT-TIME-ASENT?");
        $sym183$REMOVAL_ASSERTION_ASSERTED_BY_BETWEEN_DATES_DATE_COMPARISON_ASENT = makeSymbol("REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-DATE-COMPARISON-ASENT?");
        $CYCLIST = makeKeyword("CYCLIST");
        $ASSERTION_VAR = makeKeyword("ASSERTION-VAR");
        $ASSERT_TIME_ARG2 = makeKeyword("ASSERT-TIME-ARG2");
        $TIME_COMPARISON_ASENTS = makeKeyword("TIME-COMPARISON-ASENTS");
        $ASENTS = makeKeyword("ASENTS");
        $sym189$REMOVAL_ASSERTION_ASSERTED_BY_BETWEEN_DATES_ITERATOR_FILTER_AND_T = makeSymbol("REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-ITERATOR-FILTER-AND-TRANSFORM");
    }
}
/*
 *
 * Total time: 1652 ms
 *
 */