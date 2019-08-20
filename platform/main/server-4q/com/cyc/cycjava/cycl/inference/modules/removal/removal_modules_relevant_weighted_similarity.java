package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_relevant_weighted_similarity extends SubLTranslatedFile {
	public static SubLFile me;
	public static String myFingerPrint = "34264a9ac5fd0c6265e8f6dddf0c0ec945134cdffb2075330404f002053ea723";
	private static SubLObject $const0$weightedSimilarityQuaInstanceOf_S;
	private static SubLSymbol $kw$POS;
	private static SubLSymbol $kw$REMOVAL_WEIGHTEDSIMILARITYQUAINSTANCEOF_SETEXPLICIT;
	private static SubLList $list3;
	private static SubLObject $const4$salientSimilaritySlots_Weighted;
	private static SubLList $list5;
	private static SubLSymbol $sym6$_PRED;
	private static SubLSymbol $sym7$_WEIGHT;
	private static SubLObject $const8$and;
	private static SubLList $list9;
	private static SubLList $list10;
	private static SubLSymbol $sym11$_COMMON_VALUE;
	private static SubLSymbol $kw$OPAQUE;

	@SubL(source = "cycl/inference/modules/removal/removal-modules-relevant-weighted-similarity.lisp", position = 2100L)
	public static SubLObject removal_weightedsimilarityquainstanceof_setexplicit_expand(SubLObject asent,
			SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLObject instance1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
		SubLObject instance2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
		SubLObject focal_type = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
		SubLObject score_term = cycl_utilities.atomic_sentence_arg4(asent, UNPROVIDED);
		SubLObject numerator_set_term = cycl_utilities.atomic_sentence_arg5(asent, UNPROVIDED);
		SubLObject common_types = genls.all_specs_among(focal_type,
				conses_high.intersection(isa.all_isa(instance1, UNPROVIDED, UNPROVIDED),
						isa.all_isa(instance2, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED),
				UNPROVIDED, UNPROVIDED);
		SubLObject all_pred_weight_bindings = NIL;
		SubLObject answer_scores_and_sets = NIL;
		SubLObject cdolist_list_var = common_types;
		SubLObject common_type = NIL;
		common_type = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject cdolist_list_var_$1;
			SubLObject pred_weight_bindings = cdolist_list_var_$1 = ask_utilities.recursive_query(
					listS($const4$salientSimilaritySlots_Weighted, common_type, $list5), UNPROVIDED, UNPROVIDED);
			SubLObject pred_weight_binding = NIL;
			pred_weight_binding = cdolist_list_var_$1.first();
			while (NIL != cdolist_list_var_$1) {
				SubLObject item_var = pred_weight_binding;
				if (NIL == conses_high.member(item_var, all_pred_weight_bindings, Symbols.symbol_function(EQUAL),
						Symbols.symbol_function(IDENTITY))) {
					all_pred_weight_bindings = cons(item_var, all_pred_weight_bindings);
				}
				cdolist_list_var_$1 = cdolist_list_var_$1.rest();
				pred_weight_binding = cdolist_list_var_$1.first();
			}
			cdolist_list_var = cdolist_list_var.rest();
			common_type = cdolist_list_var.first();
		}
		SubLObject score = ZERO_INTEGER;
		SubLObject numerators = NIL;
		SubLObject cdolist_list_var2 = all_pred_weight_bindings;
		SubLObject pred_weight_binding2 = NIL;
		pred_weight_binding2 = cdolist_list_var2.first();
		while (NIL != cdolist_list_var2) {
			SubLObject pred = bindings.variable_lookup($sym6$_PRED, pred_weight_binding2);
			SubLObject weight = bindings.variable_lookup($sym7$_WEIGHT, pred_weight_binding2);
			SubLObject cdolist_list_var_$2;
			SubLObject common_value_bindings = cdolist_list_var_$2 = ask_utilities.recursive_query(
					list($const8$and, listS(pred, instance1, $list9), listS(pred, instance2, $list9)), NIL, $list10);
			SubLObject common_value_binding = NIL;
			common_value_binding = cdolist_list_var_$2.first();
			while (NIL != cdolist_list_var_$2) {
				SubLObject common_value = bindings.variable_lookup($sym11$_COMMON_VALUE, common_value_binding);
				score = Numbers.add(score, weight);
				numerators = cons(
						list($const8$and, list(pred, instance1, common_value), list(pred, instance2, common_value)),
						numerators);
				cdolist_list_var_$2 = cdolist_list_var_$2.rest();
				common_value_binding = cdolist_list_var_$2.first();
			}
			cdolist_list_var2 = cdolist_list_var2.rest();
			pred_weight_binding2 = cdolist_list_var2.first();
		}
		if (NIL != number_utilities.positive_number_p(score)) {
			answer_scores_and_sets = cons(list(score, el_utilities.make_el_set(numerators, UNPROVIDED)),
					answer_scores_and_sets);
		}
		cdolist_list_var = answer_scores_and_sets;
		SubLObject answer_score_and_set = NIL;
		answer_score_and_set = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject score2 = answer_score_and_set.first();
			SubLObject numerator_set = conses_high.second(answer_score_and_set);
			SubLObject v_bindings = nconc(unification_utilities.term_unify(score_term, score2, UNPROVIDED, UNPROVIDED),
					unification_utilities.term_unify(numerator_set_term, numerator_set, UNPROVIDED, UNPROVIDED));
			if (NIL != v_bindings) {
				backward.removal_add_node(arguments.make_hl_support($kw$OPAQUE,
						bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
			}
			cdolist_list_var = cdolist_list_var.rest();
			answer_score_and_set = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject declare_removal_modules_relevant_weighted_similarity_file() {
		declareFunction("removal_weightedsimilarityquainstanceof_setexplicit_expand",
				"REMOVAL-WEIGHTEDSIMILARITYQUAINSTANCEOF-SETEXPLICIT-EXPAND", 1, 1, false);
		return NIL;
	}

	public static SubLObject init_removal_modules_relevant_weighted_similarity_file() {
		return NIL;
	}

	public static SubLObject setup_removal_modules_relevant_weighted_similarity_file() {
		inference_modules.register_solely_specific_removal_module_predicate($const0$weightedSimilarityQuaInstanceOf_S);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const0$weightedSimilarityQuaInstanceOf_S, ONE_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const0$weightedSimilarityQuaInstanceOf_S, TWO_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const0$weightedSimilarityQuaInstanceOf_S,
				THREE_INTEGER);
		inference_modules.inference_removal_module($kw$REMOVAL_WEIGHTEDSIMILARITYQUAINSTANCEOF_SETEXPLICIT, $list3);
		return NIL;
	}

	@Override
	public void declareFunctions() {
		declare_removal_modules_relevant_weighted_similarity_file();
	}

	@Override
	public void initializeVariables() {
		init_removal_modules_relevant_weighted_similarity_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_removal_modules_relevant_weighted_similarity_file();
	}

	static {
		me = new removal_modules_relevant_weighted_similarity();
		$const0$weightedSimilarityQuaInstanceOf_S = constant_handles
				.reader_make_constant_shell(makeString("weightedSimilarityQuaInstanceOf-SetExplicit"));
		$kw$POS = makeKeyword("POS");
		$kw$REMOVAL_WEIGHTEDSIMILARITYQUAINSTANCEOF_SETEXPLICIT = makeKeyword(
				"REMOVAL-WEIGHTEDSIMILARITYQUAINSTANCEOF-SETEXPLICIT");
		$list3 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("weightedSimilarityQuaInstanceOf-SetExplicit")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles
						.reader_make_constant_shell(makeString("weightedSimilarityQuaInstanceOf-SetExplicit")),
						makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"),
						makeKeyword("ANYTHING"), makeKeyword("ANYTHING")),
				makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"),
				makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"),
				makeSymbol("REMOVAL-WEIGHTEDSIMILARITYQUAINSTANCEOF-SETEXPLICIT-EXPAND"), makeKeyword("DOCUMENTATION"),
				makeString(
						"(#$weightedSimilarityQuaInstanceOf-SetExplicit <fully-bound-p> <fully-bound-p> <fully-bound-p> <anything> <anything>)"),
				makeKeyword("EXAMPLE"), makeString(
						"(#$weightedSimilarityQuaInstanceOf-SetExplicit #$Zappos #$Ecco #$Organization ?SCORE ?NUMERATOR-SET)") });
		$const4$salientSimilaritySlots_Weighted = constant_handles
				.reader_make_constant_shell(makeString("salientSimilaritySlots-Weighted"));
		$list5 = list(makeSymbol("?PRED"), makeSymbol("?WEIGHT"));
		$sym6$_PRED = makeSymbol("?PRED");
		$sym7$_WEIGHT = makeSymbol("?WEIGHT");
		$const8$and = constant_handles.reader_make_constant_shell(makeString("and"));
		$list9 = list(makeSymbol("?COMMON-VALUE"));
		$list10 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER);
		$sym11$_COMMON_VALUE = makeSymbol("?COMMON-VALUE");
		$kw$OPAQUE = makeKeyword("OPAQUE");
	}
}
/*
 *
 * Total time: 200 ms
 *
 */