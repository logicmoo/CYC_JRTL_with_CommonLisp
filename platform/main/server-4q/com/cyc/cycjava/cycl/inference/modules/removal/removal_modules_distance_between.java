package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_distance_between extends SubLTranslatedFile {
	public static SubLFile me;
	public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_distance_between";
	public static String myFingerPrint = "2f28d53345ccbaa8518c715d8c9ac42368d38b4ba478b7d8b8b8d0898ac8aac9";
	@SubL(source = "cycl/inference/modules/removal/removal-modules-distance-between.lisp", position = 800L)
	private static SubLSymbol $distance_between_great_circle_rule_formula$;
	@SubL(source = "cycl/inference/modules/removal/removal-modules-distance-between.lisp", position = 1800L)
	private static SubLSymbol $distance_between_great_circle_rule_antecedent_template$;
	private static SubLList $list0;
	private static SubLSymbol $CODE;
	private static SubLObject $$GeographyMt;
	private static SubLList $list3;
	private static SubLList $list4;
	private static SubLSymbol $PROBLEM_STORE;
	private static SubLSymbol $CONTINUABLE_;
	private static SubLSymbol $ADD_RESTRICTION_LAYER_OF_INDIRECTION_;
	private static SubLSymbol $TRANSFORMATION_ALLOWED_;
	private static SubLSymbol $RETURN;
	private static SubLSymbol $BINDINGS_AND_SUPPORTS;
	private static SubLList $list11;
	private static SubLSymbol $sym12$LOC2;
	private static SubLSymbol $sym13$LOC1;
	private static SubLObject $$distanceBetween;
	private static SubLList $list15;
	private static SubLSymbol $REMOVAL_DISTANCE_BETWEEN_GREAT_CIRCLE_POS;
	private static SubLList $list17;
	private static SubLSymbol $DISTANCE_BETWEEN_POS;
	private static SubLList $list19;

	@SubL(source = "cycl/inference/modules/removal/removal-modules-distance-between.lisp", position = 1700L)
	public static SubLObject make_distance_between_great_circle_rule_support() {
		return arguments.make_hl_support($CODE, $distance_between_great_circle_rule_formula$.getGlobalValue(), $$GeographyMt, UNPROVIDED);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-distance-between.lisp", position = 2700L)
	public static SubLObject distance_between_great_circle_rule_antecedent_dnf(SubLObject loc1, SubLObject loc2) {
		SubLObject rule_antecedent_info = $distance_between_great_circle_rule_antecedent_template$.getGlobalValue();
		SubLObject input_values = list(loc1, loc2);
		SubLObject current;
		SubLObject datum = current = rule_antecedent_info;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list4);
		SubLObject temp = current.rest();
		current = current.first();
		SubLObject input_el_vars = NIL;
		SubLObject output_el_vars = NIL;
		SubLObject scoped_el_vars = NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list4);
		input_el_vars = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list4);
		output_el_vars = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list4);
		scoped_el_vars = current.first();
		current = current.rest();
		if (NIL == current) {
			current = temp;
			SubLObject el_dnf_template = NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list4);
			el_dnf_template = current.first();
			current = current.rest();
			if (NIL == current) {
				SubLObject el_bindings = bindings.make_variable_bindings(input_el_vars, input_values);
				SubLObject el_dnf = bindings.apply_bindings(el_bindings, el_dnf_template);
				SubLObject hl_dnf = variables.subst_hl_variables(output_el_vars, el_dnf);
				SubLObject scoped_hl_vars = variables.subst_hl_variables(output_el_vars, scoped_el_vars);
				return Values.values(hl_dnf, scoped_hl_vars);
			}
			cdestructuring_bind.cdestructuring_bind_error(datum, $list4);
		} else {
			cdestructuring_bind.cdestructuring_bind_error(datum, $list4);
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-distance-between.lisp", position = 3500L)
	public static SubLObject removal_distance_between_great_circle_antecedent_answers(SubLObject loc1, SubLObject loc2, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = mt_relevance_macros.$mt$.getDynamicValue();
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject problem_store = inference_worker.currently_active_problem_store();
		thread.resetMultipleValues();
		SubLObject rule_antecedent_dnf = distance_between_great_circle_rule_antecedent_dnf(loc1, loc2);
		SubLObject scoped_vars = thread.secondMultipleValue();
		thread.resetMultipleValues();
		return inference_kernel.new_cyc_query_from_dnf(rule_antecedent_dnf, mt, scoped_vars, list(new SubLObject[] { $PROBLEM_STORE, problem_store, $CONTINUABLE_, NIL, $ADD_RESTRICTION_LAYER_OF_INDIRECTION_, T, $TRANSFORMATION_ALLOWED_, NIL, $RETURN, $BINDINGS_AND_SUPPORTS }));
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-distance-between.lisp", position = 4200L)
	public static SubLObject removal_distance_between_great_circle_pos_expand(SubLObject asent, SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject pattern = $list11;
		thread.resetMultipleValues();
		SubLObject success = formula_pattern_match.formula_matches_pattern(asent, pattern);
		SubLObject v_bindings = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != success) {
			SubLObject loc2 = list_utilities.alist_lookup_without_values(v_bindings, $sym12$LOC2, UNPROVIDED, UNPROVIDED);
			SubLObject loc3 = list_utilities.alist_lookup_without_values(v_bindings, $sym13$LOC1, UNPROVIDED, UNPROVIDED);
			SubLObject antecedent_answers = removal_distance_between_great_circle_antecedent_answers(loc3, loc2, UNPROVIDED);
			if (NIL != antecedent_answers) {
				SubLObject output_template = list($$distanceBetween, loc3, loc2, variables.find_variable_by_id(ZERO_INTEGER));
				SubLObject rule_support = make_distance_between_great_circle_rule_support();
				SubLObject cdolist_list_var = antecedent_answers;
				SubLObject antecedent_answer = NIL;
				antecedent_answer = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					SubLObject current;
					SubLObject datum = current = antecedent_answer;
					SubLObject antecedent_bindings = NIL;
					SubLObject antecedent_supports = NIL;
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list15);
					antecedent_bindings = current.first();
					current = current.rest();
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list15);
					antecedent_supports = current.first();
					current = current.rest();
					if (NIL == current) {
						SubLObject proven_asent = bindings.apply_bindings(antecedent_bindings, output_template);
						thread.resetMultipleValues();
						SubLObject v_bindings_$1 = unification_utilities.term_unify(proven_asent, asent, T, T);
						SubLObject unify_justification = thread.secondMultipleValue();
						thread.resetMultipleValues();
						if (NIL != v_bindings_$1) {
							backward.removal_add_node(rule_support, v_bindings_$1, append(antecedent_supports, unify_justification));
						}
					} else {
						cdestructuring_bind.cdestructuring_bind_error(datum, $list15);
					}
					cdolist_list_var = cdolist_list_var.rest();
					antecedent_answer = cdolist_list_var.first();
				}
			}
		}
		return NIL;
	}

	public static SubLObject declare_removal_modules_distance_between_file() {
		declareFunction(myName, "make_distance_between_great_circle_rule_support", "MAKE-DISTANCE-BETWEEN-GREAT-CIRCLE-RULE-SUPPORT", 0, 0, false);
		declareFunction(myName, "distance_between_great_circle_rule_antecedent_dnf", "DISTANCE-BETWEEN-GREAT-CIRCLE-RULE-ANTECEDENT-DNF", 2, 0, false);
		declareFunction(myName, "removal_distance_between_great_circle_antecedent_answers", "REMOVAL-DISTANCE-BETWEEN-GREAT-CIRCLE-ANTECEDENT-ANSWERS", 2, 1, false);
		declareFunction(myName, "removal_distance_between_great_circle_pos_expand", "REMOVAL-DISTANCE-BETWEEN-GREAT-CIRCLE-POS-EXPAND", 1, 1, false);
		return NIL;
	}

	public static SubLObject init_removal_modules_distance_between_file() {
		$distance_between_great_circle_rule_formula$ = SubLFiles.deflexical("*DISTANCE-BETWEEN-GREAT-CIRCLE-RULE-FORMULA*", $list0);
		$distance_between_great_circle_rule_antecedent_template$ = SubLFiles.deflexical("*DISTANCE-BETWEEN-GREAT-CIRCLE-RULE-ANTECEDENT-TEMPLATE*", $list3);
		return NIL;
	}

	public static SubLObject setup_removal_modules_distance_between_file() {
		inference_modules.inference_removal_module($REMOVAL_DISTANCE_BETWEEN_GREAT_CIRCLE_POS, $list17);
		preference_modules.inference_preference_module($DISTANCE_BETWEEN_POS, $list19);
		return NIL;
	}

	@Override
	public void declareFunctions() {
		declare_removal_modules_distance_between_file();
	}

	@Override
	public void initializeVariables() {
		init_removal_modules_distance_between_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_removal_modules_distance_between_file();
	}

	static {
		me = new removal_modules_distance_between();
		$distance_between_great_circle_rule_formula$ = null;
		$distance_between_great_circle_rule_antecedent_template$ = null;
		$list0 = list(makeConstSym(("implies")),
				list(makeConstSym(("and")), list(makeConstSym(("latitude")), makeSymbol("?LOC1"), makeSymbol("?LAT1")), list(makeConstSym(("longitude")), makeSymbol("?LOC1"), makeSymbol("?LONG1")), list(makeConstSym(("latitude")), makeSymbol("?LOC2"), makeSymbol("?LAT2")), list(makeConstSym(("longitude")), makeSymbol("?LOC2"), makeSymbol("?LONG2")),
						list(makeConstSym(("evaluate")), makeSymbol("?TIMESFN"),
								list(makeConstSym(("TimesFn")), list(list(makeConstSym(("PerFn")), makeConstSym(("Mile")), makeConstSym(("Radian"))), makeDouble(3980.91)),
										list(makeConstSym(("ArcCosineFn")),
												ConsesLow.list(makeConstSym(("PlusFn")), list(makeConstSym(("TimesFn")), list(makeConstSym(("SineFn")), makeSymbol("?LAT1")), list(makeConstSym(("SineFn")), makeSymbol("?LAT2"))),
														list(makeConstSym(("TimesFn")), list(makeConstSym(("CosineFn")), makeSymbol("?LAT1")), list(makeConstSym(("CosineFn")), makeSymbol("?LAT2")), list(makeConstSym(("CosineFn")), list(makeConstSym(("DifferenceFn")), makeSymbol("?LONG2"), makeSymbol("?LONG1"))))))))),
				list(makeConstSym(("distanceBetween")), makeSymbol("?LOC1"), makeSymbol("?LOC2"), makeSymbol("?TIMESFN")));
		$CODE = makeKeyword("CODE");
		$$GeographyMt = makeConstSym(("GeographyMt"));
		$list3 = list(list(list(makeSymbol("?LOC1"), makeSymbol("?LOC2")), list(makeSymbol("?TIMESFN"), makeSymbol("?LAT1"), makeSymbol("?LONG1"), makeSymbol("?LAT2"), makeSymbol("?LONG2")), list(makeSymbol("?LAT1"), makeSymbol("?LONG1"), makeSymbol("?LAT2"), makeSymbol("?LONG2"))),
				list(NIL,
						list(list(makeConstSym(("latitude")), makeSymbol("?LOC1"), makeSymbol("?LAT1")), list(makeConstSym(("longitude")), makeSymbol("?LOC1"), makeSymbol("?LONG1")), list(makeConstSym(("latitude")), makeSymbol("?LOC2"), makeSymbol("?LAT2")), list(makeConstSym(("longitude")), makeSymbol("?LOC2"), makeSymbol("?LONG2")),
								list(makeConstSym(("evaluate")), makeSymbol("?TIMESFN"),
										list(makeConstSym(("TimesFn")), list(list(makeConstSym(("PerFn")), makeConstSym(("Mile")), makeConstSym(("Radian"))), makeDouble(3980.91)), list(makeConstSym(("ArcCosineFn")), list(makeConstSym(("PlusFn")), list(makeConstSym(("TimesFn")), list(makeConstSym(("SineFn")), makeSymbol("?LAT1")), list(makeConstSym(("SineFn")), makeSymbol("?LAT2"))),
												list(makeConstSym(("TimesFn")), list(makeConstSym(("CosineFn")), makeSymbol("?LAT1")), list(makeConstSym(("CosineFn")), makeSymbol("?LAT2")), list(makeConstSym(("CosineFn")), list(makeConstSym(("DifferenceFn")), makeSymbol("?LONG2"), makeSymbol("?LONG1")))))))))));
		$list4 = list(list(makeSymbol("INPUT-EL-VARS"), makeSymbol("OUTPUT-EL-VARS"), makeSymbol("SCOPED-EL-VARS")), makeSymbol("EL-DNF-TEMPLATE"));
		$PROBLEM_STORE = makeKeyword("PROBLEM-STORE");
		$CONTINUABLE_ = makeKeyword("CONTINUABLE?");
		$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");
		$TRANSFORMATION_ALLOWED_ = makeKeyword("TRANSFORMATION-ALLOWED?");
		$RETURN = makeKeyword("RETURN");
		$BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");
		$list11 = list(makeConstSym(("distanceBetween")), list(makeKeyword("BIND"), makeSymbol("LOC1")), list(makeKeyword("BIND"), makeSymbol("LOC2")), makeKeyword("ANYTHING"));
		$sym12$LOC2 = makeSymbol("LOC2");
		$sym13$LOC1 = makeSymbol("LOC1");
		$$distanceBetween = makeConstSym(("distanceBetween"));
		$list15 = list(makeSymbol("ANTECEDENT-BINDINGS"), makeSymbol("ANTECEDENT-SUPPORTS"));
		$REMOVAL_DISTANCE_BETWEEN_GREAT_CIRCLE_POS = makeKeyword("REMOVAL-DISTANCE-BETWEEN-GREAT-CIRCLE-POS");
		$list17 = list(
				new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("distanceBetween")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("distanceBetween")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"),
						makeSymbol("REMOVAL-DISTANCE-BETWEEN-GREAT-CIRCLE-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$distanceBetween <fully-bound> <fully-bound> <whatever>)\n    by computing the Great Circle distance using \n    #$latitude and #$longitude information about ARG1 and ARG2"), makeKeyword("EXAMPLE"), makeString("(#$distanceBetween #$CityOfAnchorageAK #$CityOfSanFranciscoCA ?DIST)") });
		$DISTANCE_BETWEEN_POS = makeKeyword("DISTANCE-BETWEEN-POS");
		$list19 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("distanceBetween")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("distanceBetween")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("PREFERRED"));
	}

}
/*
 *
 * Total time: 102 ms
 *
 */