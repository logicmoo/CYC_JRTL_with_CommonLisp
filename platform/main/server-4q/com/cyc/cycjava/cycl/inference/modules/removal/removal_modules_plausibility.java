package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.arithmetic;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.plausibility_utilities;
import com.cyc.cycjava.cycl.plausible_narts;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_plausibility extends SubLTranslatedFile {
	public static SubLFile me;
	public static String myFingerPrint = "139109a1efbc8f0721cacb41d4d3af9e12e67ce4a95bbe4d70406982728247e4";
	private static SubLObject $const0$referentiallyEmptyNAT;
	private static SubLSymbol $kw$POS;
	private static SubLSymbol $kw$REMOVAL_REFERENTIALLY_EMPTY_NAT;
	private static SubLList $list3;
	private static SubLObject $const4$sentencePlausibilityScore;
	private static SubLSymbol $kw$REMOVAL_SENTENCE_PLAUSIBILITY_SCORE;
	private static SubLList $list6;
	private static SubLObject $const7$NumericLikelihoodFn;
	private static SubLObject $const8$plausibilityOfCollection;
	private static SubLSymbol $kw$REMOVAL_PLAUSIBILITY_OF_COLLECTION;
	private static SubLList $list10;
	private static SubLSymbol $kw$OPAQUE;
	private static SubLObject $const12$plausibilityOfSentence;
	private static SubLSymbol $kw$REMOVAL_PLAUSIBILITY_OF_SENTENCE;
	private static SubLList $list14;
	private static SubLObject $const15$subsumptionProbabilityOfDescripti;
	private static SubLSymbol $kw$REMOVAL_DISTANCE_BETWEEN_TERM_SETS;
	private static SubLList $list17;

	@SubL(source = "cycl/inference/modules/removal/removal-modules-plausibility.lisp", position = 1700L)
	public static SubLObject removal_referentially_empty_nat_expand(SubLObject asent, SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject nat = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
		if (NIL != cycl_grammar.fast_cycl_quoted_term_p(nat)) {
			nat = czer_utilities.unwrap_quotes(nat);
		}
		if (NIL != nart_handles.nart_p(nat)) {
			nat = narts_high.nart_el_formula(nat);
		}
		thread.resetMultipleValues();
		SubLObject result = plausibility_utilities.implausible_nautP(nat,
				mt_relevance_macros.$mt$.getDynamicValue(thread), T, UNPROVIDED);
		SubLObject justification = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != result) {
			backward.removal_add_node(justification.first(), NIL, justification.rest());
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-plausibility.lisp", position = 3000L)
	public static SubLObject removal_sentence_plausibility_score_expand(SubLObject asent, SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
		SubLObject var = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
		if (NIL != cycl_grammar.fast_cycl_quoted_term_p(sentence)) {
			sentence = czer_utilities.unwrap_quotes(sentence);
		}
		sentence = cycl_utilities.hl_to_el(sentence);
		thread.resetMultipleValues();
		SubLObject factor = plausibility_utilities.why_sentence_plausibility_factor(sentence,
				mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED);
		SubLObject justification = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != factor) {
			SubLObject likelihood = el_utilities.make_unary_formula($const7$NumericLikelihoodFn,
					arithmetic.possibly_sanitize_float(factor));
			SubLObject v_bindings = unification_utilities.term_unify(var, likelihood, UNPROVIDED, UNPROVIDED);
			backward.removal_add_node(justification.first(), v_bindings, justification.rest());
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-plausibility.lisp", position = 4400L)
	public static SubLObject removal_plausibility_of_collection(SubLObject asent, SubLObject variable) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject nat = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
		SubLObject var = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
		if (NIL != cycl_grammar.fast_cycl_quoted_term_p(nat)) {
			nat = czer_utilities.unwrap_quotes(nat);
		}
		if (NIL != nart_handles.nart_p(nat)) {
			nat = narts_high.nart_el_formula(nat);
		}
		thread.resetMultipleValues();
		SubLObject result = plausible_narts.find_plausibility_of_collection(nat, T, UNPROVIDED);
		SubLObject justification = thread.secondMultipleValue();
		thread.resetMultipleValues();
		SubLObject v_bindings = unification_utilities.term_unify(var, result, UNPROVIDED, UNPROVIDED);
		if ((NIL != result) && (NIL != justification)) {
			backward.removal_add_node(justification.first(), v_bindings, justification.rest());
		}
		if ((NIL != result) && (NIL == justification)) {
			backward.removal_add_node(arguments.make_hl_support($kw$OPAQUE, bindings.apply_bindings(v_bindings, asent),
					UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-plausibility.lisp", position = 5900L)
	public static SubLObject removal_plausibility_of_sentence(SubLObject asent, SubLObject variable) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
		SubLObject var = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
		if (NIL != cycl_grammar.fast_cycl_quoted_term_p(sentence)) {
			sentence = czer_utilities.unwrap_quotes(sentence);
		}
		thread.resetMultipleValues();
		SubLObject result = plausible_narts.find_plausibility_of_sentences(sentence, T, UNPROVIDED);
		SubLObject justification = thread.secondMultipleValue();
		thread.resetMultipleValues();
		SubLObject v_bindings = unification_utilities.term_unify(var, result, UNPROVIDED, UNPROVIDED);
		if ((NIL != result) && (NIL != justification)) {
			backward.removal_add_node(justification.first(), v_bindings, justification.rest());
		}
		if ((NIL != result) && (NIL == justification)) {
			backward.removal_add_node(arguments.make_hl_support($kw$OPAQUE, bindings.apply_bindings(v_bindings, asent),
					UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-plausibility.lisp", position = 7500L)
	public static SubLObject removal_distance_between_term_sets(SubLObject asent, SubLObject variable) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject set_1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
		SubLObject set_2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
		SubLObject var = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
		thread.resetMultipleValues();
		SubLObject result = plausible_narts.find_distance_between_term_sets(set_1, set_2,
				mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED);
		SubLObject justification = thread.secondMultipleValue();
		thread.resetMultipleValues();
		SubLObject v_bindings = unification_utilities.term_unify(var, result, UNPROVIDED, UNPROVIDED);
		if ((NIL != result) && (NIL != justification)) {
			backward.removal_add_node(justification.first(), v_bindings, justification.rest());
		}
		if ((NIL != result) && (NIL == justification)) {
			backward.removal_add_node(arguments.make_hl_support($kw$OPAQUE, bindings.apply_bindings(v_bindings, asent),
					UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject declare_removal_modules_plausibility_file() {
		declareFunction("removal_referentially_empty_nat_expand", "REMOVAL-REFERENTIALLY-EMPTY-NAT-EXPAND", 1,
				1, false);
		declareFunction("removal_sentence_plausibility_score_expand",
				"REMOVAL-SENTENCE-PLAUSIBILITY-SCORE-EXPAND", 1, 1, false);
		declareFunction("removal_plausibility_of_collection", "REMOVAL-PLAUSIBILITY-OF-COLLECTION", 2, 0,
				false);
		declareFunction("removal_plausibility_of_sentence", "REMOVAL-PLAUSIBILITY-OF-SENTENCE", 2, 0, false);
		declareFunction("removal_distance_between_term_sets", "REMOVAL-DISTANCE-BETWEEN-TERM-SETS", 2, 0,
				false);
		return NIL;
	}

	public static SubLObject init_removal_modules_plausibility_file() {
		return NIL;
	}

	public static SubLObject setup_removal_modules_plausibility_file() {
		inference_modules.register_solely_specific_removal_module_predicate($const0$referentiallyEmptyNAT);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const0$referentiallyEmptyNAT, ONE_INTEGER);
		inference_modules.inference_removal_module($kw$REMOVAL_REFERENTIALLY_EMPTY_NAT, $list3);
		inference_modules.register_solely_specific_removal_module_predicate($const4$sentencePlausibilityScore);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const4$sentencePlausibilityScore, ONE_INTEGER);
		inference_modules.inference_removal_module($kw$REMOVAL_SENTENCE_PLAUSIBILITY_SCORE, $list6);
		inference_modules.register_solely_specific_removal_module_predicate($const8$plausibilityOfCollection);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const8$plausibilityOfCollection, ONE_INTEGER);
		inference_modules.inference_removal_module($kw$REMOVAL_PLAUSIBILITY_OF_COLLECTION, $list10);
		inference_modules.register_solely_specific_removal_module_predicate($const12$plausibilityOfSentence);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const12$plausibilityOfSentence, ONE_INTEGER);
		inference_modules.inference_removal_module($kw$REMOVAL_PLAUSIBILITY_OF_SENTENCE, $list14);
		inference_modules.register_solely_specific_removal_module_predicate($const15$subsumptionProbabilityOfDescripti);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const15$subsumptionProbabilityOfDescripti, ONE_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const15$subsumptionProbabilityOfDescripti, TWO_INTEGER);
		inference_modules.inference_removal_module($kw$REMOVAL_DISTANCE_BETWEEN_TERM_SETS, $list17);
		return NIL;
	}

	@Override
	public void declareFunctions() {
		declare_removal_modules_plausibility_file();
	}

	@Override
	public void initializeVariables() {
		init_removal_modules_plausibility_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_removal_modules_plausibility_file();
	}

	static {
		me = new removal_modules_plausibility();
		$const0$referentiallyEmptyNAT = constant_handles
				.reader_make_constant_shell(makeString("referentiallyEmptyNAT"));
		$kw$POS = makeKeyword("POS");
		$kw$REMOVAL_REFERENTIALLY_EMPTY_NAT = makeKeyword("REMOVAL-REFERENTIALLY-EMPTY-NAT");
		$list3 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("referentiallyEmptyNAT")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("referentiallyEmptyNAT")),
						makeKeyword("FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("EXPAND"), makeSymbol("REMOVAL-REFERENTIALLY-EMPTY-NAT-EXPAND"),
				makeKeyword("DOCUMENTATION"), makeString("(#$referentiallyEmptyNAT <fully-bound-p>)"),
				makeKeyword("EXAMPLE"), makeString(
						"(#$ist #$PlausibilityQueryMt\n (#$referentiallyEmptyNAT\n  (#$SubcollectionOfWithRelationToTypeFn #$PlayingAMusicalInstrument #$doneBy #$Dog)))") });
		$const4$sentencePlausibilityScore = constant_handles
				.reader_make_constant_shell(makeString("sentencePlausibilityScore"));
		$kw$REMOVAL_SENTENCE_PLAUSIBILITY_SCORE = makeKeyword("REMOVAL-SENTENCE-PLAUSIBILITY-SCORE");
		$list6 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("sentencePlausibilityScore")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("sentencePlausibilityScore")),
						makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")),
				makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("EXPAND"), makeSymbol("REMOVAL-SENTENCE-PLAUSIBILITY-SCORE-EXPAND"),
				makeKeyword("DOCUMENTATION"),
				makeString("(#$sentencePlausibilityScore <fully-bound-p> <not-fully-bound-p>)"), makeKeyword("EXAMPLE"),
				makeString(
						"(#$ist #$PlausibilityQueryMt\n (#$sentencePlausibilityScore\n  (#$Quote (#$equalSymbols ?X (#$SubcollectionOfWithRelationToTypeFn #$PlayingAMusicalInstrument #$doneBy #$Dog))) ?NUM))") });
		$const7$NumericLikelihoodFn = constant_handles.reader_make_constant_shell(makeString("NumericLikelihoodFn"));
		$const8$plausibilityOfCollection = constant_handles
				.reader_make_constant_shell(makeString("plausibilityOfCollection"));
		$kw$REMOVAL_PLAUSIBILITY_OF_COLLECTION = makeKeyword("REMOVAL-PLAUSIBILITY-OF-COLLECTION");
		$list10 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("plausibilityOfCollection")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("plausibilityOfCollection")),
						makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("EXPAND"), makeSymbol("REMOVAL-PLAUSIBILITY-OF-COLLECTION"), makeKeyword("DOCUMENTATION"),
				makeString("(#$plausibilityOfCollection <fully-bound-p> ?x)"), makeKeyword("EXAMPLE"), makeString(
						"(plausibilityOfCollection \n  (#$SubcollectionOfWithRelationToTypeFn #$PlayingAMusicalInstrument #$doneBy #$Dog) ?x))") });
		$kw$OPAQUE = makeKeyword("OPAQUE");
		$const12$plausibilityOfSentence = constant_handles
				.reader_make_constant_shell(makeString("plausibilityOfSentence"));
		$kw$REMOVAL_PLAUSIBILITY_OF_SENTENCE = makeKeyword("REMOVAL-PLAUSIBILITY-OF-SENTENCE");
		$list14 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("plausibilityOfSentence")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("plausibilityOfSentence")),
						makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("EXPAND"), makeSymbol("REMOVAL-PLAUSIBILITY-OF-SENTENCE"), makeKeyword("DOCUMENTATION"),
				makeString("(#$plausibilityOfSentence <fully-bound-p> ?x)"), makeKeyword("EXAMPLE"), makeString(
						"(plausibilityOfSentence  \n  (#$SubcollectionOfWithRelationToTypeFn #$PlayingAMusicalInstrument #$doneBy #$Dog) ?x))") });
		$const15$subsumptionProbabilityOfDescripti = constant_handles
				.reader_make_constant_shell(makeString("subsumptionProbabilityOfDescriptionByDescription"));
		$kw$REMOVAL_DISTANCE_BETWEEN_TERM_SETS = makeKeyword("REMOVAL-DISTANCE-BETWEEN-TERM-SETS");
		$list17 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles
						.reader_make_constant_shell(makeString("subsumptionProbabilityOfDescriptionByDescription")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles
						.reader_make_constant_shell(makeString("subsumptionProbabilityOfDescriptionByDescription")),
						makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("EXPAND"), makeSymbol("REMOVAL-DISTANCE-BETWEEN-TERM-SETS"), makeKeyword("DOCUMENTATION"),
				makeString("(#$subsumptionProbabilityOfDescriptionByDescription <fully-bound-p> <fully bound>  ?x)"),
				makeKeyword("EXAMPLE"),
				makeString("(subsumptionProbabilityOfDescriptionByDescription SET-1 SET-2 ?x))") });
	}
}
/*
 *
 * Total time: 161 ms
 *
 */