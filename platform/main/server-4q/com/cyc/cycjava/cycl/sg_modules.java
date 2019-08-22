/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      SG-MODULES
 *  source file: /cyc/top/cycl/sg-modules.lisp
 *  created:     2019/07/03 17:39:03
 */
public final class sg_modules extends SubLTranslatedFile implements V02 {
	// // Constructor
	private sg_modules() {
	}

	public static final SubLFile me = new sg_modules();

	// // Definitions
	/**
	 * the alist storing the mapping of modules to their properties.
	 */
	// deflexical
	private static final SubLSymbol $sg_ab_abduction_modules$ = makeSymbol("*SG-AB-ABDUCTION-MODULES*");

	// deflexical
	private static final SubLSymbol $sg_module_table$ = makeSymbol("*SG-MODULE-TABLE*");

	public static final SubLObject sg_mod_set_modules_for_type(SubLObject type, SubLObject keys) {
		$sg_module_table$.setGlobalValue(list_utilities.alist_enter($sg_module_table$.getGlobalValue(), type, keys, UNPROVIDED));
		return NIL;
	}

	public static final SubLObject sg_mod_get_modules_for_type(SubLObject type) {
		return list_utilities.alist_lookup($sg_module_table$.getGlobalValue(), type, UNPROVIDED, UNPROVIDED);
	}

	public static final SubLObject sg_mod_find_module_plist(SubLObject module_keyword) {
		{
			SubLObject entry = assoc(module_keyword, $sg_ab_abduction_modules$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
			if (NIL != entry) {
				return entry.rest();
			}
			return NIL;
		}
	}

	public static final SubLObject sg_abduction_module(SubLObject module, SubLObject plist) {
		$sg_ab_abduction_modules$.setGlobalValue(cons(cons(module, plist), $sg_ab_abduction_modules$.getGlobalValue()));
		return NIL;
	}

	public static final SubLObject sg_mod_any_modules_definedP() {
		return list_utilities.sublisp_boolean($sg_ab_abduction_modules$.getGlobalValue());
	}

	public static final SubLObject sg_mod_expansion_options(SubLObject node) {
		{
			SubLObject result = NIL;
			SubLObject cdolist_list_var = sg_mod_get_modules_for_type($EXPANSION);
			SubLObject module = NIL;
			for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), module = cdolist_list_var.first()) {
				if (NIL != sg_mod_node_allows_moduleP(module, node)) {
					result = cons(module, result);
				}
			}
			return nreverse(result);
		}
	}

	public static final SubLObject sg_mod_refinement_options(SubLObject node) {
		{
			SubLObject result = NIL;
			SubLObject cdolist_list_var = sg_mod_get_modules_for_type($REFINEMENT);
			SubLObject module = NIL;
			for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), module = cdolist_list_var.first()) {
				if (NIL != sg_mod_node_allows_moduleP(module, node)) {
					result = cons(module, result);
				}
			}
			return nreverse(result);
		}
	}

	public static final SubLObject sg_mod_meta_expansion_options(SubLObject node) {
		{
			SubLObject result = NIL;
			SubLObject cdolist_list_var = sg_mod_get_modules_for_type($META_EXPANSION);
			SubLObject module = NIL;
			for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), module = cdolist_list_var.first()) {
				if (NIL != sg_mod_node_allows_moduleP(module, node)) {
					result = cons(module, result);
				}
			}
			return nreverse(result);
		}
	}

	public static final SubLObject sg_refinement_module_p(SubLObject module) {
		if ((NIL != constant_handles.constant_p(module)) || module.isKeyword()) {
			return member(module, sg_mod_get_modules_for_type($REFINEMENT), UNPROVIDED, UNPROVIDED);
		}
		return NIL;
	}

	public static final SubLObject sg_expansion_module_p(SubLObject module) {
		if ((NIL != constant_handles.constant_p(module)) || module.isKeyword()) {
			return member(module, sg_mod_get_modules_for_type($EXPANSION), UNPROVIDED, UNPROVIDED);
		}
		return NIL;
	}

	public static final SubLObject sg_meta_expansion_module_p(SubLObject module) {
		if ((NIL != constant_handles.constant_p(module)) || module.isKeyword()) {
			return member(module, sg_mod_get_modules_for_type($META_EXPANSION), UNPROVIDED, UNPROVIDED);
		}
		return NIL;
	}

	public static final SubLObject do_all_sg_modules(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			destructuring_bind_must_consp(current, datum, $list_alt3);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject module = NIL;
					SubLObject plist = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt3);
					module = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt3);
					plist = current.first();
					current = current.rest();
					if (NIL == current) {
						current = temp;
						{
							SubLObject body = current;
							return listS(DO_ALIST, listS(module, plist, $list_alt5), append(body, NIL));
						}
					} else {
						cdestructuring_bind_error(datum, $list_alt3);
					}
				}
			}
		}
		return NIL;
	}

	public static final SubLObject sg_browsing_refinements(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			destructuring_bind_must_consp(current, datum, $list_alt6);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject assertion = NIL;
					SubLObject node = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt6);
					assertion = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt6);
					node = current.first();
					current = current.rest();
					if (NIL == current) {
						current = temp;
						{
							SubLObject body = current;
							return listS(CLET, $list_alt8, list(SG_PREPARE_TO_BROWSE_NEW_FORWARD_INFERENCE, assertion, node), append(body, $list_alt10));
						}
					} else {
						cdestructuring_bind_error(datum, $list_alt6);
					}
				}
			}
		}
		return NIL;
	}

	public static final SubLObject sg_note_new_forward_inference_for_browsing(SubLObject inference, SubLObject rule, SubLObject more_info) {
		if (more_info == UNPROVIDED) {
			more_info = NIL;
		}
		if (NIL == cb_forward_inference_browser.cb_current_forward_inference_clump()) {
			return NIL;
		}
		if (NIL != inference_datastructures_inference.inference_p(inference)) {
			{
				SubLObject inference_info = cb_forward_inference_browser.new_forward_inference_info(inference, rule, more_info);
				cb_forward_inference_browser.add_forward_inference_info_to_clump(cb_forward_inference_browser.cb_current_forward_inference_clump(), inference_info);
			}
		}
		return inference;
	}

	public static final SubLObject sg_prepare_to_browse_new_forward_inference(SubLObject triggering_assertion, SubLObject node) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			cb_forward_inference_browser.$cb_current_forward_inference_clump$.setDynamicValue(cb_forward_inference_browser.new_forward_inference_clump(triggering_assertion), thread);
			sg_abduction.sg_ab_log_inference_for_browsing(cconcatenate($str_alt12$Timestamp__, format_nil.format_nil_a_no_copy(numeric_date_utilities.timestring(UNPROVIDED))), node);
			sg_abduction.sg_ab_log_inference_for_browsing(cb_forward_inference_browser.$cb_current_forward_inference_clump$.getDynamicValue(thread), node);
			return NIL;
		}
	}

	public static final SubLObject sg_cleanup_from_browsing_new_forward_inference() {
		return NIL;
	}

	public static final SubLObject sg_mod_module_prop(SubLObject module, SubLObject prop) {
		{
			SubLObject plist = sg_mod_find_module_plist(module);
			return getf(plist, prop, NIL);
		}
	}

	public static final SubLObject sg_mod_query_pattern(SubLObject module) {
		return sg_mod_module_prop(module, $QUERY_PATTERN);
	}

	public static final SubLObject sg_mod_hypothesis_if_not_pattern(SubLObject module) {
		return sg_mod_module_prop(module, $HYPOTHESIZE_IF_NOT_PATTERN);
	}

	public static final SubLObject sg_mod_assertion_pattern(SubLObject module) {
		return sg_mod_module_prop(module, $ASSERTION_PATTERN);
	}

	public static final SubLObject sg_mod_hypothesis_pattern(SubLObject module) {
		return sg_mod_module_prop(module, $HYPOTHESIS_PATTERN);
	}

	public static final SubLObject sg_mod_inference_properties(SubLObject module, SubLObject node) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject new_inference_properties = (NIL != node) ? ((SubLObject) (sg_abduction.sg_ab_node_inference_properties(node))) : NIL;
				SubLObject module_inference_properties = sg_mod_raw_inference_properties(module);
				SubLObject remainder = NIL;
				for (remainder = module_inference_properties; NIL != remainder; remainder = cddr(remainder)) {
					{
						SubLObject prop = remainder.first();
						SubLObject value = cadr(remainder);
						new_inference_properties = putf(new_inference_properties, prop, value);
					}
				}
				if ((NIL != $use_sg_problem_storeP$.getDynamicValue(thread)) && (NIL != $sg_problem_store$.getDynamicValue(thread))) {
					new_inference_properties = putf(new_inference_properties, $PROBLEM_STORE, $sg_problem_store$.getDynamicValue(thread));
				}
				return new_inference_properties;
			}
		}
	}

	public static final SubLObject sg_mod_raw_inference_properties(SubLObject module) {
		return sg_mod_module_prop(module, $INFERENCE_PROPERTIES);
	}

	public static final SubLObject sg_mod_module_assertions(SubLObject module) {
		return sg_mod_module_prop(module, $ASSERTIONS);
	}

	public static final SubLObject sg_mod_module_disabledP(SubLObject module) {
		return eq($$True, sg_mod_module_prop(module, $DISABLED_));
	}

	public static final SubLObject sg_mod_disable_module(SubLObject module) {
		{
			SubLObject plist = sg_mod_find_module_plist(module);
			plist = putf(plist, $DISABLED_, $$True);
			return plist;
		}
	}

	public static final SubLObject sg_mod_enable_module(SubLObject module) {
		{
			SubLObject plist = sg_mod_find_module_plist(module);
			plist = putf(plist, $DISABLED_, $$False);
			return plist;
		}
	}

	public static final SubLObject sg_mod_disable_all_modules() {
		{
			SubLObject cdolist_list_var = $sg_ab_abduction_modules$.getGlobalValue();
			SubLObject cons = NIL;
			for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), cons = cdolist_list_var.first()) {
				{
					SubLObject datum = cons;
					SubLObject current = datum;
					SubLObject module = NIL;
					SubLObject plist = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt24);
					module = current.first();
					current = current.rest();
					plist = current;
					sg_mod_disable_module(module);
				}
			}
		}
		return NIL;
	}

	public static final SubLObject sg_mod_all_modules() {
		{
			SubLObject v_modules = NIL;
			SubLObject cdolist_list_var = $sg_ab_abduction_modules$.getGlobalValue();
			SubLObject cons = NIL;
			for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), cons = cdolist_list_var.first()) {
				{
					SubLObject datum = cons;
					SubLObject current = datum;
					SubLObject module = NIL;
					SubLObject plist = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt24);
					module = current.first();
					current = current.rest();
					plist = current;
					v_modules = cons(module, v_modules);
				}
			}
			return nreverse(v_modules);
		}
	}

	public static final SubLObject sg_mod_all_disabled_modules() {
		{
			SubLObject disabled_modules = NIL;
			SubLObject cdolist_list_var = $sg_ab_abduction_modules$.getGlobalValue();
			SubLObject cons = NIL;
			for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), cons = cdolist_list_var.first()) {
				{
					SubLObject datum = cons;
					SubLObject current = datum;
					SubLObject module = NIL;
					SubLObject plist = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt24);
					module = current.first();
					current = current.rest();
					plist = current;
					if (NIL != sg_mod_module_disabledP(module)) {
						disabled_modules = cons(module, disabled_modules);
					}
				}
			}
			return nreverse(disabled_modules);
		}
	}

	public static final SubLObject sg_mod_all_active_modules() {
		{
			SubLObject active_modules = NIL;
			SubLObject cdolist_list_var = $sg_ab_abduction_modules$.getGlobalValue();
			SubLObject cons = NIL;
			for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), cons = cdolist_list_var.first()) {
				{
					SubLObject datum = cons;
					SubLObject current = datum;
					SubLObject module = NIL;
					SubLObject plist = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt24);
					module = current.first();
					current = current.rest();
					plist = current;
					if (NIL == sg_mod_module_disabledP(module)) {
						active_modules = cons(module, active_modules);
					}
				}
			}
			return nreverse(active_modules);
		}
	}

	/**
	 * Unasserts all dependents of every rule associated with every module in MT.
	 */
	public static final SubLObject sg_mod_clean_up_module_dependents(SubLObject mt) {
		{
			SubLObject cdolist_list_var = $sg_ab_abduction_modules$.getGlobalValue();
			SubLObject cons = NIL;
			for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), cons = cdolist_list_var.first()) {
				{
					SubLObject datum = cons;
					SubLObject current = datum;
					SubLObject module = NIL;
					SubLObject plist = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt24);
					module = current.first();
					current = current.rest();
					plist = current;
					{
						SubLObject cdolist_list_var_1 = sg_mod_module_assertions(module);
						SubLObject rule = NIL;
						for (rule = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest(), rule = cdolist_list_var_1.first()) {
							{
								SubLObject cdolist_list_var_2 = assertions_high.assertion_dependents(rule);
								SubLObject deduction = NIL;
								for (deduction = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest(), deduction = cdolist_list_var_2.first()) {
									{
										SubLObject assertion = deductions_high.deduction_assertion(deduction);
										SubLObject ass_mt = assertions_high.assertion_mt(assertion);
										if (ass_mt == mt) {
											ke.ke_blast_assertion(assertion);
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

	// deflexical
	public static final SubLSymbol $sg_module_types$ = makeSymbol("*SG-MODULE-TYPES*");

	public static final SubLObject do_sg_module_types(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			destructuring_bind_must_consp(current, datum, $list_alt26);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject type = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt26);
					type = current.first();
					current = current.rest();
					if (NIL == current) {
						current = temp;
						{
							SubLObject body = current;
							SubLObject value = $sym27$VALUE;
							return listS(DO_ALIST, listS(type, value, $list_alt28), list(IGNORE, value), append(body, NIL));
						}
					} else {
						cdestructuring_bind_error(datum, $list_alt26);
					}
				}
			}
		}
		return NIL;
	}

	public static final SubLObject sg_module_type_p(SubLObject type) {
		return member(type, $sg_module_types$.getGlobalValue(), symbol_function(EQ), symbol_function(CAR));
	}

	public static final SubLObject sg_module_type_specification(SubLObject type) {
		return list_utilities.alist_lookup($sg_module_types$.getGlobalValue(), type, UNPROVIDED, UNPROVIDED).first();
	}

	public static final SubLObject sg_module_type_string(SubLObject type) {
		return second(list_utilities.alist_lookup($sg_module_types$.getGlobalValue(), type, UNPROVIDED, UNPROVIDED));
	}

	public static final SubLObject sg_module_type_modules(SubLObject type, SubLObject sortedP) {
		if (sortedP == UNPROVIDED) {
			sortedP = NIL;
		}
		return sg_utilities.sg_util_all_modules_of_type(sg_module_type_specification(type), sortedP);
	}

	public static final SubLObject sg_mod_import_modules_of_type(SubLObject mt, SubLObject type) {
		{
			SubLObject module_alist = NIL;
			SubLObject v_modules = sg_module_type_modules(type, UNPROVIDED);
			SubLObject cdolist_list_var = v_modules;
			SubLObject mod = NIL;
			for (mod = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), mod = cdolist_list_var.first()) {
				{
					SubLObject entry = sg_mod_translate_abduction_module(mod, mt, type);
					if (NIL != entry) {
						module_alist = cons(entry, module_alist);
					}
				}
			}
			return module_alist;
		}
	}

	public static final SubLObject sg_mod_import_modules(SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = sg_utilities.$sg_module_mt$.getGlobalValue();
		}
		{
			SubLObject cdolist_list_var = $sg_module_types$.getGlobalValue();
			SubLObject cons = NIL;
			for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), cons = cdolist_list_var.first()) {
				{
					SubLObject datum = cons;
					SubLObject current = datum;
					SubLObject type = NIL;
					SubLObject value = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt31);
					type = current.first();
					current = current.rest();
					value = current;
					{
						SubLObject v_modules = sg_mod_import_modules_of_type(mt, type);
						SubLObject keys = Mapping.mapcar(symbol_function(CAR), v_modules);
						sg_mod_set_modules_for_type(type, keys);
						$sg_ab_abduction_modules$.setGlobalValue(append(v_modules, $sg_ab_abduction_modules$.getGlobalValue()));
					}
				}
			}
		}
		return NIL;
	}

	public static final SubLObject sg_mod_clear_modules() {
		$sg_ab_abduction_modules$.setGlobalValue(NIL);
		$sg_module_table$.setGlobalValue(NIL);
		return NIL;
	}

	public static final SubLObject sg_mod_strip_existentials(SubLObject formula) {
		if (NIL != el_utilities.el_existential_p(formula)) {
			return sg_mod_strip_existentials(cycl_utilities.formula_arg2(formula, UNPROVIDED));
		} else {
			if (NIL != el_utilities.true_sentence_litP(formula)) {
				return sg_mod_strip_existentials(cycl_utilities.formula_arg1(formula, UNPROVIDED));
			} else {
				return formula;
			}
		}
	}

	public static final SubLObject sg_mod_strip_true_sentence(SubLObject formula) {
		if (NIL != el_utilities.true_sentence_litP(formula)) {
			return cycl_utilities.formula_arg1(formula, UNPROVIDED);
		} else {
			return formula;
		}
	}

	/**
	 * Given a list of literals, find the likely vars to map :scenario-mt and :situation to.
	 */
	public static final SubLObject sg_mod_determine_scenario_vars(SubLObject lits) {
		if (NIL == lits) {
			return NIL;
		}
		{
			SubLObject literal = lits.first();
			SubLObject v_answer = NIL;
			if (cycl_utilities.formula_operator(literal) == $$scenarioSits) {
				v_answer = cycl_utilities.formula_args(literal, UNPROVIDED);
			} else if (NIL != el_utilities.el_conjunction_p(literal)) {
				v_answer = sg_mod_determine_scenario_vars(cycl_utilities.formula_args(literal, UNPROVIDED));
			}

			if (NIL != v_answer) {
				return v_answer;
			} else {
				return sg_mod_determine_scenario_vars(lits.rest());
			}
		}
	}

	/**
	 * Calculates the correct binding used for replace the vars representing the
	 * new situation and new scenario with (:value :situation) and
	 * (:value :scenario-mt), respectively.
	 */
	public static final SubLObject sg_mod_determine_scenario_subst_from_query_formula(SubLObject formula) {
		formula = sg_mod_strip_existentials(formula);
		if (NIL != el_utilities.el_conjunction_p(formula)) {
			{
				SubLObject vars = sg_mod_determine_scenario_vars(cycl_utilities.formula_args(formula, UNPROVIDED));
				if (NIL != vars) {
					{
						SubLObject datum = vars;
						SubLObject current = datum;
						SubLObject mt = NIL;
						SubLObject sit = NIL;
						destructuring_bind_must_consp(current, datum, $list_alt33);
						mt = current.first();
						current = current.rest();
						destructuring_bind_must_consp(current, datum, $list_alt33);
						sit = current.first();
						current = current.rest();
						if (NIL == current) {
							return list(bq_cons(sit, $list_alt34), bq_cons(mt, $list_alt35));
						} else {
							cdestructuring_bind_error(datum, $list_alt33);
						}
					}
				}
			}
		}
		return NIL;
	}

	/**
	 * Calculates the correct binding used for replace the vars representing the
	 * new situation and new scenario with (:value :new-situation) and
	 * (:value :new-scenario-mt), respectively.
	 */
	public static final SubLObject sg_mod_determine_new_scenario_subst_from_hyp_formula(SubLObject formula) {
		formula = sg_mod_strip_existentials(formula);
		if (NIL != el_utilities.el_conjunction_p(formula)) {
			{
				SubLObject vars = sg_mod_determine_scenario_vars(cycl_utilities.formula_args(formula, UNPROVIDED));
				if (NIL != vars) {
					{
						SubLObject datum = vars;
						SubLObject current = datum;
						SubLObject mt = NIL;
						SubLObject sit = NIL;
						destructuring_bind_must_consp(current, datum, $list_alt33);
						mt = current.first();
						current = current.rest();
						destructuring_bind_must_consp(current, datum, $list_alt33);
						sit = current.first();
						current = current.rest();
						if (NIL == current) {
							return list(bq_cons(sit, $list_alt36), bq_cons(mt, $list_alt37));
						} else {
							cdestructuring_bind_error(datum, $list_alt33);
						}
					}
				}
			}
		}
		return NIL;
	}

	public static final SubLObject sg_mod_merge_pragma_lits_with_query_rebuild(SubLObject formula, SubLObject existentials) {
		if (NIL == existentials) {
			return formula;
		} else {
			return sg_mod_merge_pragma_lits_with_query_rebuild(el_utilities.make_existential(existentials.first(), formula), existentials.rest());
		}
	}

	public static final SubLObject sg_mod_merge_pragma_lits_with_query_strip(SubLObject formula, SubLObject existentials, SubLObject pragma_lits) {
		if (NIL != el_utilities.el_existential_p(formula)) {
			return sg_mod_merge_pragma_lits_with_query_strip(cycl_utilities.formula_arg2(formula, UNPROVIDED), cons(cycl_utilities.formula_arg1(formula, UNPROVIDED), existentials), pragma_lits);
		} else {
			return sg_mod_merge_pragma_lits_with_query_rebuild(el_utilities.make_conjunction(cons(formula, pragma_lits)), existentials);
		}
	}

	public static final SubLObject sg_mod_merge_pragma_lits_with_query(SubLObject query, SubLObject pragma_lits) {
		return sg_mod_merge_pragma_lits_with_query_strip(query, NIL, pragma_lits);
	}

	/**
	 *
	 *
	 * @param ASSERTION
	 * 		assertion-p
	 */
	public static final SubLObject sg_mod_extract_query_formula(SubLObject formula, SubLObject assertion) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject mt = sg_utilities.$sg_module_mt$.getGlobalValue();
				SubLObject basic_query = formula;
				if (NIL != inference_worker_transformation.rule_assertion_has_some_pragmatic_requirementP(assertion, mt)) {
					{
						SubLObject pragma_lits = NIL;
						SubLObject new_formula = NIL;
						{
							SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
							SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
							try {
								mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
								mt_relevance_macros.$mt$.bind(mt, thread);
								if (NIL != kb_mapping_macros.do_pragma_rule_index_key_validator(assertion, NIL)) {
									{
										SubLObject iterator_var = kb_mapping_macros.new_pragma_rule_final_index_spec_iterator(assertion, NIL);
										SubLObject done_var = NIL;
										SubLObject token_var = NIL;
										while (NIL == done_var) {
											{
												SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
												SubLObject valid = makeBoolean(token_var != final_index_spec);
												if (NIL != valid) {
													{
														SubLObject final_index_iterator = NIL;
														try {
															final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
															{
																SubLObject done_var_3 = NIL;
																SubLObject token_var_4 = NIL;
																while (NIL == done_var_3) {
																	{
																		SubLObject pragma_rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_4);
																		SubLObject valid_5 = makeBoolean(token_var_4 != pragma_rule);
																		if (NIL != valid_5) {
																			{
																				SubLObject pragma_formula = uncanonicalizer.assertion_el_formula(pragma_rule);
																				SubLObject pragma_lit = cycl_utilities.formula_arg1(pragma_formula, UNPROVIDED);
																				if (NIL != pragma_lit) {
																					pragma_lits = cons(sg_mod_strip_true_sentence(pragma_lit), pragma_lits);
																				}
																			}
																		}
																		done_var_3 = makeBoolean(NIL == valid_5);
																	}
																}
															}
														} finally {
															{
																SubLObject _prev_bind_0_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
																try {
																	$is_thread_performing_cleanupP$.bind(T, thread);
																	if (NIL != final_index_iterator) {
																		kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
																	}
																} finally {
																	$is_thread_performing_cleanupP$.rebind(_prev_bind_0_6, thread);
																}
															}
														}
													}
												}
												done_var = makeBoolean(NIL == valid);
											}
										}
									}
								}
							} finally {
								mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
								mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
							}
						}
						new_formula = sg_mod_merge_pragma_lits_with_query(basic_query, pragma_lits);
						return new_formula;
					}
				} else {
					return basic_query;
				}
			}
		}
	}

	public static final SubLObject sg_mod_extract_assertion_formula(SubLObject formula) {
		return sg_mod_strip_existentials(formula);
	}

	public static final SubLObject sg_mod_query_variables_substitution_int(SubLObject vars, SubLObject subst) {
		if (NIL == vars) {
			return subst;
		} else {
			return sg_mod_query_variables_substitution_int(vars.rest(), cons(cons(vars.first(), list($VALUE, vars.first())), subst));
		}
	}

	public static final SubLObject sg_mod_query_variables_substitution(SubLObject vars) {
		return sg_mod_query_variables_substitution_int(vars, NIL);
	}

	public static final SubLObject sg_mod_any_hyp_variables(SubLObject hyp_pattern, SubLObject query_vars) {
		{
			SubLObject hyp_subst_form = pattern_match.pattern_transform_tree(hyp_pattern, NIL, $list_alt41);
			SubLObject ass_vars = el_utilities.sentence_free_variables(hyp_subst_form, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			SubLObject hyp_vars = set_difference(ass_vars, query_vars, UNPROVIDED, UNPROVIDED);
			return list_utilities.sublisp_boolean(hyp_vars);
		}
	}

	/**
	 *
	 *
	 * @param ASSERTION
	 * 		assertion-p
	 * @param PLIST
	 * 		property-list-p
	 */
	public static final SubLObject sg_mod_translate_expansion_formula_parameter(SubLObject assertion, SubLObject plist) {
		{
			SubLObject formula = uncanonicalizer.assertion_el_formula(assertion);
			SubLObject expansionP = eq(cycl_utilities.formula_operator(formula), $$abductiveExpansion);
			if (NIL != expansionP) {
				{
					SubLObject query_formula = sg_mod_extract_query_formula(cycl_utilities.formula_arg1(formula, UNPROVIDED), assertion);
					SubLObject mt_var_subst = $list_alt43;
					SubLObject assertion_formula = sg_mod_extract_assertion_formula(cycl_utilities.formula_arg2(formula, UNPROVIDED));
					SubLObject query_variables = el_utilities.sentence_free_variables(query_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					SubLObject query_pattern = sublis(mt_var_subst, query_formula, UNPROVIDED, UNPROVIDED);
					SubLObject hyp_pattern = assertion_formula;
					SubLObject hyp_variables = el_utilities.sentence_free_variables(hyp_pattern, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					SubLObject hyp_variablesP = sg_mod_any_hyp_variables(hyp_pattern, query_variables);
					SubLObject cdolist_list_var = list_utilities.fast_set_difference(query_variables, hyp_variables, UNPROVIDED);
					SubLObject ignore_var = NIL;
					for (ignore_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), ignore_var = cdolist_list_var.first()) {
						query_pattern = list($$thereExists, ignore_var, query_pattern);
					}
					plist = putf(plist, $ASSERTIONS, cons(assertion, getf(plist, $ASSERTIONS, NIL)));
					plist = putf(plist, $QUERY_PATTERN, query_pattern);
					if (NIL != hyp_variablesP) {
						plist = putf(plist, $HYPOTHESIS_PATTERN, hyp_pattern);
					}
					plist = putf(plist, $ASSERTION_PATTERN, hyp_pattern);
				}
			}
			return plist;
		}
	}

	/**
	 *
	 *
	 * @param RULE
	 * 		assertion-p
	 * @param PLIST
	 * 		property-list-p
	 */
	public static final SubLObject sg_mod_process_implies_formula_parameter(SubLObject rule, SubLObject plist) {
		if (NIL == getf(plist, $QUERY_PATTERN, NIL)) {
			{
				SubLObject formula = uncanonicalizer.assertion_el_formula(rule);
				SubLObject query_formula = sg_mod_extract_query_formula(cycl_utilities.formula_arg1(formula, UNPROVIDED), rule);
				SubLObject scenario_var_substitution = sg_mod_determine_scenario_subst_from_query_formula(query_formula);
				SubLObject assertion_formula = sg_mod_extract_assertion_formula(cycl_utilities.formula_arg2(formula, UNPROVIDED));
				SubLObject new_scenario_var_substitution = sg_mod_determine_new_scenario_subst_from_hyp_formula(assertion_formula);
				SubLObject query_variables = el_utilities.sentence_free_variables(query_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				SubLObject query_var_substitution = sg_mod_query_variables_substitution(query_variables);
				SubLObject query_pattern = sublis(scenario_var_substitution, query_formula, UNPROVIDED, UNPROVIDED);
				SubLObject hyp_pattern = sublis(query_var_substitution, sublis(new_scenario_var_substitution, sublis(scenario_var_substitution, assertion_formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
				SubLObject hyp_variablesP = sg_mod_any_hyp_variables(hyp_pattern, query_variables);
				plist = putf(plist, $QUERY_PATTERN, query_pattern);
				if (NIL != hyp_variablesP) {
					plist = putf(plist, $HYPOTHESIZE_IF_NOT_PATTERN, hyp_pattern);
				} else {
					plist = putf(plist, $ASSERTION_PATTERN, hyp_pattern);
				}
			}
		}
		return plist;
	}

	public static final SubLObject sg_mod_process_inference_parameter(SubLObject key, SubLObject value, SubLObject plist) {
		{
			SubLObject inference_plist = getf(plist, $INFERENCE_PROPERTIES, NIL);
			SubLObject identifier = subl_identifier.sublid_from_cyc_entity(key);
			inference_plist = putf(inference_plist, identifier, value);
			plist = putf(plist, $INFERENCE_PROPERTIES, inference_plist);
			return plist;
		}
	}

	/**
	 *
	 *
	 * @param MODULE
	 * 		fort-p
	 * @param MT
	 * 		hlmt-p
	 */
	public static final SubLObject sg_mod_translate_abduction_module(SubLObject module, SubLObject mt, SubLObject type) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject module_assertions = NIL;
				SubLObject plist = NIL;
				{
					SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
						mt_relevance_macros.$mt$.bind(mt, thread);
						module_assertions = append(kb_mapping.gather_gaf_arg_index(module, THREE_INTEGER, $const45$softwareAssertionParameterValueIn, mt, $TRUE), kb_mapping.gather_gaf_arg_index(module, THREE_INTEGER, $const47$softwareParameterValueInSpecifica, mt, $TRUE));
					} finally {
						mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
					}
				}
				{
					SubLObject cdolist_list_var = module_assertions;
					SubLObject as = NIL;
					for (as = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), as = cdolist_list_var.first()) {
						{
							SubLObject key = assertions_high.gaf_arg1(as);
							SubLObject value = assertions_high.gaf_arg2(as);
							if (key == $const48$ScenGenTransformationFormulaParam) {
								if (type != $REFINEMENT) {
									plist = sg_mod_translate_expansion_formula_parameter(value, plist);
								}
							} else if (key == $const49$ScenGenImpliesTransformationFormu) {
								plist = putf(plist, $ASSERTIONS, cons(value, getf(plist, $ASSERTIONS, NIL)));
							} else if (key == $const50$ScenGenModuleDefaultDisabledParam) {
								plist = putf(plist, $DISABLED_, value);
							} else if (NIL != isa.isaP(key, $$InferenceParameter, UNPROVIDED, UNPROVIDED)) {
								plist = sg_mod_process_inference_parameter(key, value, plist);
							}

						}
					}
				}
				if (NIL != plist) {
					return cons(module, plist);
				}
				return NIL;
			}
		}
	}

	public static final SubLObject sg_mod_node_allows_moduleP(SubLObject module, SubLObject node) {
		{
			SubLObject search_state = search.search_state(search.snode_search(node));
			SubLObject active_modules = getf(search_state, $ACTIVE_MODULES, UNPROVIDED);
			return list_utilities.member_eqP(module, active_modules);
		}
	}

	public static final SubLObject sg_mod_apply_module(SubLObject module, SubLObject node) {
		if (NIL == sg_mod_node_allows_moduleP(module, node)) {
			return NIL;
		} else if (NIL != sg_refinement_module_p(module)) {
			return sg_mod_apply_refinement_module(module, node);
		} else if (NIL != sg_meta_expansion_module_p(module)) {
			return sg_mod_apply_meta_expansion_module(module, node);
		} else if (NIL != sg_expansion_module_p(module)) {
			return sg_mod_apply_expansion_module(module, node);
		} else {
			return NIL;
		}

	}

	public static final SubLObject sg_mod_node_situation_bindings(SubLObject node, SubLObject situation) {
		{
			SubLObject scenario_mt = sg_abduction.sg_ab_node_context(node);
			return listS(bq_cons($SITUATION, situation), bq_cons($SCENARIO_MT, scenario_mt), $list_alt55);
		}
	}

	public static final SubLObject sg_mod_apply_all_refinement_modules(SubLObject node) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject search_state = search.search_state(search.snode_search(node));
				SubLObject refinement_cutoff = getf(search_state, $SG_REFINEMENT_CUTOFF, $QUIESCENCE);
				SubLObject refinement_cutoff_iterations_number = getf(search_state, $SG_REFINEMENT_CUTOFF_ITERATIONS_NUMBER, ONE_INTEGER);
				SubLObject result = NIL;
				SubLObject count = ONE_INTEGER;
				while ((NIL == result) && (!((refinement_cutoff == $ITERATIONS) && count.numG(refinement_cutoff_iterations_number)))) {
					{
						SubLObject _prev_bind_0 = utilities_macros.$current_forward_problem_store$.currentBinding(thread);
						try {
							utilities_macros.$current_forward_problem_store$.bind(NIL, thread);
							sg_abduction.sg_ab_log_inference_for_browsing(forward.get_forward_problem_store(UNPROVIDED_SYM), node);
							sg_abduction.sg_ab_log_inference_for_browsing(cconcatenate($str_alt60$Refinement_iteration_, format_nil.format_nil_a_no_copy(count)), node);
							sg_utilities.sg_trace_int(TWO_INTEGER, format(NIL, $str_alt61$sg_mod_apply_all_refinement_modul, node, utilities_macros.$current_forward_problem_store$.getDynamicValue(thread)));
							result = sg_mod_apply_all_refinement_modules_int(node);
							sg_utilities.sg_trace_int(TWO_INTEGER, format(NIL, $str_alt62$Got_result__A_from_sg_mod_apply_a, result));
							count = add(count, ONE_INTEGER);
						} finally {
							utilities_macros.$current_forward_problem_store$.rebind(_prev_bind_0, thread);
						}
					}
					sg_utilities.sg_trace_int(THREE_INTEGER, format(NIL, $str_alt63$sg_mod_apply_all_refinement_modul, result));
				}
				return result;
			}
		}
	}

	public static final SubLObject sg_mod_apply_all_refinement_modules_int(SubLObject node) {
		sg_utilities.sg_trace_int(ONE_INTEGER, format(NIL, $str_alt64$Applying_all_refinement_modules__));
		{
			SubLObject v_modules = sg_mod_refinement_options(node);
			SubLObject not_doneP = NIL;
			SubLObject cdolist_list_var = v_modules;
			SubLObject cur_module = NIL;
			for (cur_module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), cur_module = cdolist_list_var.first()) {
				{
					SubLObject work_doneP = sg_mod_apply_module(cur_module, node);
					sg_utilities.sg_trace_int(THREE_INTEGER, format(NIL, $str_alt65$sg_mod_apply_module_result__work_, work_doneP));
					if (NIL != work_doneP) {
						not_doneP = T;
					}
				}
			}
			if (NIL != not_doneP) {
				return NIL;
			} else {
				{
					SubLObject meta_expansion_node = sg_abduction.sg_ab_create_meta_expansion_node(node);
					sg_abduction.sg_ab_set_node_type(node, $REFINED);
					return list(node, meta_expansion_node);
				}
			}
		}
	}

	/**
	 *
	 *
	 * @param MODULE
	 * 		sg-refinement-module-p
	 * @param NODE
	 * 		search-node-p
	 * @return listp ;; singleton? of search-node-p
	 */
	public static final SubLObject sg_mod_apply_refinement_module(SubLObject module, SubLObject node) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			sg_utilities.sg_trace_int(ONE_INTEGER, format(NIL, $str_alt67$Applying_SG_MODULE___s__, module));
			{
				SubLObject assertion_specs = sg_mod_module_assertions(module);
				SubLObject work_doneP = NIL;
				SubLObject mt = sg_abduction.sg_ab_node_context(node);
				SubLObject query_properties = sg_mod_inference_properties(module, node);
				SubLObject found_assertion_specs = NIL;
				SubLObject cdolist_list_var = assertion_specs;
				SubLObject assertion_spec = NIL;
				for (assertion_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), assertion_spec = cdolist_list_var.first()) {
					if (NIL == assertion_handles.assertion_p(assertion_spec)) {
						{
							SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
							SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
							try {
								mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
								mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
								{
									SubLObject found_assertion_spec = czer_meta.find_assertion_cycl(assertion_spec, UNPROVIDED);
									if (NIL != assertion_handles.assertion_p(found_assertion_spec)) {
										{
											SubLObject item_var = found_assertion_spec;
											if (NIL == member(item_var, found_assertion_specs, symbol_function(EQL), symbol_function(IDENTITY))) {
												found_assertion_specs = cons(item_var, found_assertion_specs);
											}
										}
									} else {
										Errors.warn($str_alt70$Could_not_find_assertions_for_ref, module, assertion_spec);
									}
								}
							} finally {
								mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
								mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
							}
						}
					}
				}
				{
					SubLObject _prev_bind_0 = control_vars.$browse_forward_inferencesP$.currentBinding(thread);
					SubLObject _prev_bind_1 = forward.$forward_inference_browsing_callback_more_infoP$.currentBinding(thread);
					SubLObject _prev_bind_2 = forward.$forward_inference_browsing_callback$.currentBinding(thread);
					try {
						control_vars.$browse_forward_inferencesP$.bind(sg_utilities.$sg_browse_forward_inferencesP$.getDynamicValue(thread), thread);
						forward.$forward_inference_browsing_callback_more_infoP$.bind(T, thread);
						forward.$forward_inference_browsing_callback$.bind(SG_NOTE_NEW_FORWARD_INFERENCE_FOR_BROWSING, thread);
						sg_prepare_to_browse_new_forward_inference(assertion_specs, node);
						if (NIL != sg_utilities.sg_util_forward_propagate_assertions(assertion_specs, mt, query_properties)) {
							work_doneP = T;
						}
						sg_cleanup_from_browsing_new_forward_inference();
					} finally {
						forward.$forward_inference_browsing_callback$.rebind(_prev_bind_2, thread);
						forward.$forward_inference_browsing_callback_more_infoP$.rebind(_prev_bind_1, thread);
						control_vars.$browse_forward_inferencesP$.rebind(_prev_bind_0, thread);
					}
				}
				return work_doneP;
			}
		}
	}

	public static final SubLObject sg_mod_hypothesis_formula(SubLObject module, SubLObject v_bindings) {
		{
			SubLObject hyp_pattern = sg_mod_hypothesis_pattern(module);
			SubLObject ass_pattern = sg_mod_assertion_pattern(module);
			if (NIL != hyp_pattern) {
				return sublis(v_bindings, hyp_pattern, UNPROVIDED, UNPROVIDED);
			} else {
				return sublis(v_bindings, ass_pattern, UNPROVIDED, UNPROVIDED);
			}
		}
	}

	/**
	 *
	 *
	 * @param MODULE
	 * 		sg-refinement-module-p
	 * @param NODE
	 * 		search-node-p
	 * @return listp ;; singleton? of search-node-p
	 */
	public static final SubLObject sg_mod_apply_expansion_module(SubLObject module, SubLObject node) {
		{
			SubLObject node_bindings = sg_mod_node_situation_bindings(node, NIL);
			SubLObject mt = sg_abduction.sg_ab_node_context(node);
			SubLObject query_pattern = sg_mod_query_pattern(module);
			SubLObject query_properties = sg_mod_inference_properties(module, node);
			SubLObject query_static_properties = inference_datastructures_enumerated_types.extract_query_static_or_meta_properties(query_properties);
			SubLObject query_formula = pattern_match.pattern_transform_tree(query_pattern, NIL, node_bindings);
			if (NIL == query_formula) {
				Errors.warn($str_alt72$Module__A_applies_to_node__A_resu, module, node);
				return NIL;
			}
			{
				SubLObject inference = inference_kernel.new_continuable_inference(query_formula, mt, query_static_properties);
				sg_abduction.sg_ab_log_inference_for_browsing(inference, node);
				sg_mod_register_problem_store(inference);
				sg_utilities.sg_trace_int(TWO_INTEGER, format(NIL, $str_alt73$Creating_query_node_from__s_in_mt, module, mt));
				return list(sg_abduction.sg_ab_create_query_node(node, mt, module, inference));
			}
		}
	}

	/**
	 *
	 *
	 * @param MODULE
	 * 		sg-refinement-module-p
	 * @param NODE
	 * 		search-node-p
	 * @return listp ;; singleton? of search-node-p
	 */
	public static final SubLObject sg_mod_apply_meta_expansion_module(SubLObject module, SubLObject node) {
		if (sg_abduction.sg_ab_node_ttl(node).numG(ZERO_INTEGER)) {
			sg_abduction.sg_ab_dec_node_ttl(node);
			return list(node);
		}
		{
			SubLObject node_bindings = sg_mod_node_situation_bindings(node, NIL);
			SubLObject mt = sg_utilities.sg_util_collector_mt(sg_abduction.sg_ab_node_context(node));
			SubLObject query_pattern = sg_mod_query_pattern(module);
			SubLObject query_properties = sg_mod_inference_properties(module, node);
			SubLObject query_static_properties = inference_datastructures_enumerated_types.extract_query_static_or_meta_properties(query_properties);
			SubLObject query_formula = pattern_match.pattern_transform_tree(query_pattern, NIL, node_bindings);
			SubLObject inference = inference_kernel.new_continuable_inference(query_formula, mt, query_static_properties);
			sg_utilities.sg_trace_int(ONE_INTEGER, format(NIL, $$$Applying_meta_exansion_module));
			sg_abduction.sg_ab_log_inference_for_browsing(inference, node);
			sg_mod_register_problem_store(inference);
			sg_utilities.sg_trace_int(TWO_INTEGER, format(NIL, $str_alt75$__Creating_query_node_from__s_in_, module, mt));
			return list(sg_abduction.sg_ab_create_query_node(node, mt, module, inference));
		}
	}

	/**
	 * This is the set of inference suspend statuses that signal that the work is really done
	 * on this inference, and that it is safe to kill this node.
	 */
	// deflexical
	private static final SubLSymbol $sg_uncontinuable_suspend_statuses$ = makeSymbol("*SG-UNCONTINUABLE-SUSPEND-STATUSES*");

	public static final SubLObject sg_uncontinuable_suspend_status_p(SubLObject status) {
		return member(status, $sg_uncontinuable_suspend_statuses$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
	}

	/**
	 * Get some more answers from this inference query
	 */
	public static final SubLObject sg_mod_query(SubLObject node) {
		{
			SubLObject mt = sg_abduction.sg_ab_node_context(node);
			SubLObject module = sg_abduction.sg_ab_node_module(node);
			SubLObject inference = sg_abduction.sg_ab_node_inference(node);
			SubLObject module_assertions = sg_mod_module_assertions(module);
			SubLObject query_properties = sg_mod_inference_properties(module, node);
			SubLObject query_dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(query_properties);
			SubLObject new_nodes = NIL;
			sg_utilities.sg_trace_int(FIVE_INTEGER, format(NIL, $str_alt77$SG_MOD_QUERY__INFERENCE___a__, inference));
			if (NIL != inference_datastructures_inference.continuable_inference_p(inference)) {
				if (NIL != sg_abduction.sg_ab_node_resource_limit_reachedP(node)) {
					sublisp_throw($SG_SEARCH_RESOURCE_EXHAUSTED, $TIME_EXHAUST);
				} else {
					sg_utilities.sg_util_continue_inference(inference, query_dynamic_properties);
				}
				{
					SubLObject inf = inference;
					SubLObject start_id = inference_datastructures_inference.inference_new_answer_id_start(inference);
					SubLObject end_id = inference_datastructures_inference.inference_next_new_answer_id(inference);
					SubLObject id = NIL;
					for (id = start_id; !id.numGE(end_id); id = number_utilities.f_1X(id)) {
						{
							SubLObject v_answer = inference_datastructures_inference.find_inference_answer_by_id(inf, id);
							SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings(v_answer);
							SubLObject hl_support_list = NIL;
							SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
							SubLObject justification = NIL;
							for (justification = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), justification = cdolist_list_var.first()) {
								{
									SubLObject v_hl_supports = append(module_assertions, inference_datastructures_inference.inference_answer_justification_supports(justification));
									hl_support_list = cons(v_hl_supports, hl_support_list);
								}
							}
							{
								SubLObject formula = sg_mod_hypothesis_formula(module, v_bindings);
								if (!sg_term_rank.sg_tr_formula_utility(formula).isZero()) {
									sg_utilities.sg_trace_int(ONE_INTEGER, format(NIL, $str_alt80$__Adding_abduction_node_for_formu, formula));
									new_nodes = cons(sg_abduction.sg_ab_create_abduction_node(node, mt, formula, hl_support_list), new_nodes);
								}
							}
						}
					}
				}
				if (NIL == sg_uncontinuable_suspend_status_p(inference_datastructures_inference.inference_suspend_status(inference))) {
					sg_utilities.sg_trace_int(ONE_INTEGER, format(NIL, $str_alt81$__Suspending_query_node_for_later));
					new_nodes = cons(node, new_nodes);
				}
			}
			return new_nodes;
		}
	}

	// defparameter
	public static final SubLSymbol $use_sg_problem_storeP$ = makeSymbol("*USE-SG-PROBLEM-STORE?*");

	/**
	 * The problem store that can be reused by abduction harness during a run.
	 */
	// defparameter
	public static final SubLSymbol $sg_problem_store$ = makeSymbol("*SG-PROBLEM-STORE*");

	public static final SubLObject sg_mod_register_problem_store(SubLObject inference) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == $sg_problem_store$.getDynamicValue(thread)) {
				$sg_problem_store$.setDynamicValue(inference_datastructures_inference.inference_problem_store(inference), thread);
			}
			return NIL;
		}
	}

	public static final SubLObject subloop_reserved_initialize_sg_module_rule_translation_test_case_class(SubLObject new_instance) {
		classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
		classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
		classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
		classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
		classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
		classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
		classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
		return NIL;
	}

	public static final SubLObject subloop_reserved_initialize_sg_module_rule_translation_test_case_instance(SubLObject new_instance) {
		classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
		classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
		classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
		classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
		classes.subloop_initialize_slot(new_instance, CYCL_TEST_CASE, CONSTANTS, NIL);
		return NIL;
	}

	public static final SubLObject sg_module_rule_translation_test_case_p(SubLObject sg_module_rule_translation_test_case) {
		return classes.subloop_instanceof_class(sg_module_rule_translation_test_case, SG_MODULE_RULE_TRANSLATION_TEST_CASE);
	}

	public static final SubLObject declare_sg_modules_file() {
		declareFunction("sg_mod_set_modules_for_type", "SG-MOD-SET-MODULES-FOR-TYPE", 2, 0, false);
		declareFunction("sg_mod_get_modules_for_type", "SG-MOD-GET-MODULES-FOR-TYPE", 1, 0, false);
		declareFunction("sg_mod_find_module_plist", "SG-MOD-FIND-MODULE-PLIST", 1, 0, false);
		declareFunction("sg_abduction_module", "SG-ABDUCTION-MODULE", 2, 0, false);
		declareFunction("sg_mod_any_modules_definedP", "SG-MOD-ANY-MODULES-DEFINED?", 0, 0, false);
		declareFunction("sg_mod_expansion_options", "SG-MOD-EXPANSION-OPTIONS", 1, 0, false);
		declareFunction("sg_mod_refinement_options", "SG-MOD-REFINEMENT-OPTIONS", 1, 0, false);
		declareFunction("sg_mod_meta_expansion_options", "SG-MOD-META-EXPANSION-OPTIONS", 1, 0, false);
		declareFunction("sg_refinement_module_p", "SG-REFINEMENT-MODULE-P", 1, 0, false);
		declareFunction("sg_expansion_module_p", "SG-EXPANSION-MODULE-P", 1, 0, false);
		declareFunction("sg_meta_expansion_module_p", "SG-META-EXPANSION-MODULE-P", 1, 0, false);
		declareMacro("do_all_sg_modules", "DO-ALL-SG-MODULES");
		declareMacro("sg_browsing_refinements", "SG-BROWSING-REFINEMENTS");
		declareFunction("sg_note_new_forward_inference_for_browsing", "SG-NOTE-NEW-FORWARD-INFERENCE-FOR-BROWSING", 2, 1, false);
		declareFunction("sg_prepare_to_browse_new_forward_inference", "SG-PREPARE-TO-BROWSE-NEW-FORWARD-INFERENCE", 2, 0, false);
		declareFunction("sg_cleanup_from_browsing_new_forward_inference", "SG-CLEANUP-FROM-BROWSING-NEW-FORWARD-INFERENCE", 0, 0, false);
		declareFunction("sg_mod_module_prop", "SG-MOD-MODULE-PROP", 2, 0, false);
		declareFunction("sg_mod_query_pattern", "SG-MOD-QUERY-PATTERN", 1, 0, false);
		declareFunction("sg_mod_hypothesis_if_not_pattern", "SG-MOD-HYPOTHESIS-IF-NOT-PATTERN", 1, 0, false);
		declareFunction("sg_mod_assertion_pattern", "SG-MOD-ASSERTION-PATTERN", 1, 0, false);
		declareFunction("sg_mod_hypothesis_pattern", "SG-MOD-HYPOTHESIS-PATTERN", 1, 0, false);
		declareFunction("sg_mod_inference_properties", "SG-MOD-INFERENCE-PROPERTIES", 2, 0, false);
		declareFunction("sg_mod_raw_inference_properties", "SG-MOD-RAW-INFERENCE-PROPERTIES", 1, 0, false);
		declareFunction("sg_mod_module_assertions", "SG-MOD-MODULE-ASSERTIONS", 1, 0, false);
		declareFunction("sg_mod_module_disabledP", "SG-MOD-MODULE-DISABLED?", 1, 0, false);
		declareFunction("sg_mod_disable_module", "SG-MOD-DISABLE-MODULE", 1, 0, false);
		declareFunction("sg_mod_enable_module", "SG-MOD-ENABLE-MODULE", 1, 0, false);
		declareFunction("sg_mod_disable_all_modules", "SG-MOD-DISABLE-ALL-MODULES", 0, 0, false);
		declareFunction("sg_mod_all_modules", "SG-MOD-ALL-MODULES", 0, 0, false);
		declareFunction("sg_mod_all_disabled_modules", "SG-MOD-ALL-DISABLED-MODULES", 0, 0, false);
		declareFunction("sg_mod_all_active_modules", "SG-MOD-ALL-ACTIVE-MODULES", 0, 0, false);
		declareFunction("sg_mod_clean_up_module_dependents", "SG-MOD-CLEAN-UP-MODULE-DEPENDENTS", 1, 0, false);
		declareMacro("do_sg_module_types", "DO-SG-MODULE-TYPES");
		declareFunction("sg_module_type_p", "SG-MODULE-TYPE-P", 1, 0, false);
		declareFunction("sg_module_type_specification", "SG-MODULE-TYPE-SPECIFICATION", 1, 0, false);
		declareFunction("sg_module_type_string", "SG-MODULE-TYPE-STRING", 1, 0, false);
		declareFunction("sg_module_type_modules", "SG-MODULE-TYPE-MODULES", 1, 1, false);
		declareFunction("sg_mod_import_modules_of_type", "SG-MOD-IMPORT-MODULES-OF-TYPE", 2, 0, false);
		declareFunction("sg_mod_import_modules", "SG-MOD-IMPORT-MODULES", 0, 1, false);
		declareFunction("sg_mod_clear_modules", "SG-MOD-CLEAR-MODULES", 0, 0, false);
		declareFunction("sg_mod_strip_existentials", "SG-MOD-STRIP-EXISTENTIALS", 1, 0, false);
		declareFunction("sg_mod_strip_true_sentence", "SG-MOD-STRIP-TRUE-SENTENCE", 1, 0, false);
		declareFunction("sg_mod_determine_scenario_vars", "SG-MOD-DETERMINE-SCENARIO-VARS", 1, 0, false);
		declareFunction("sg_mod_determine_scenario_subst_from_query_formula", "SG-MOD-DETERMINE-SCENARIO-SUBST-FROM-QUERY-FORMULA", 1, 0, false);
		declareFunction("sg_mod_determine_new_scenario_subst_from_hyp_formula", "SG-MOD-DETERMINE-NEW-SCENARIO-SUBST-FROM-HYP-FORMULA", 1, 0, false);
		declareFunction("sg_mod_merge_pragma_lits_with_query_rebuild", "SG-MOD-MERGE-PRAGMA-LITS-WITH-QUERY-REBUILD", 2, 0, false);
		declareFunction("sg_mod_merge_pragma_lits_with_query_strip", "SG-MOD-MERGE-PRAGMA-LITS-WITH-QUERY-STRIP", 3, 0, false);
		declareFunction("sg_mod_merge_pragma_lits_with_query", "SG-MOD-MERGE-PRAGMA-LITS-WITH-QUERY", 2, 0, false);
		declareFunction("sg_mod_extract_query_formula", "SG-MOD-EXTRACT-QUERY-FORMULA", 2, 0, false);
		declareFunction("sg_mod_extract_assertion_formula", "SG-MOD-EXTRACT-ASSERTION-FORMULA", 1, 0, false);
		declareFunction("sg_mod_query_variables_substitution_int", "SG-MOD-QUERY-VARIABLES-SUBSTITUTION-INT", 2, 0, false);
		declareFunction("sg_mod_query_variables_substitution", "SG-MOD-QUERY-VARIABLES-SUBSTITUTION", 1, 0, false);
		declareFunction("sg_mod_any_hyp_variables", "SG-MOD-ANY-HYP-VARIABLES", 2, 0, false);
		declareFunction("sg_mod_translate_expansion_formula_parameter", "SG-MOD-TRANSLATE-EXPANSION-FORMULA-PARAMETER", 2, 0, false);
		declareFunction("sg_mod_process_implies_formula_parameter", "SG-MOD-PROCESS-IMPLIES-FORMULA-PARAMETER", 2, 0, false);
		declareFunction("sg_mod_process_inference_parameter", "SG-MOD-PROCESS-INFERENCE-PARAMETER", 3, 0, false);
		declareFunction("sg_mod_translate_abduction_module", "SG-MOD-TRANSLATE-ABDUCTION-MODULE", 3, 0, false);
		declareFunction("sg_mod_node_allows_moduleP", "SG-MOD-NODE-ALLOWS-MODULE?", 2, 0, false);
		declareFunction("sg_mod_apply_module", "SG-MOD-APPLY-MODULE", 2, 0, false);
		declareFunction("sg_mod_node_situation_bindings", "SG-MOD-NODE-SITUATION-BINDINGS", 2, 0, false);
		declareFunction("sg_mod_apply_all_refinement_modules", "SG-MOD-APPLY-ALL-REFINEMENT-MODULES", 1, 0, false);
		declareFunction("sg_mod_apply_all_refinement_modules_int", "SG-MOD-APPLY-ALL-REFINEMENT-MODULES-INT", 1, 0, false);
		declareFunction("sg_mod_apply_refinement_module", "SG-MOD-APPLY-REFINEMENT-MODULE", 2, 0, false);
		declareFunction("sg_mod_hypothesis_formula", "SG-MOD-HYPOTHESIS-FORMULA", 2, 0, false);
		declareFunction("sg_mod_apply_expansion_module", "SG-MOD-APPLY-EXPANSION-MODULE", 2, 0, false);
		declareFunction("sg_mod_apply_meta_expansion_module", "SG-MOD-APPLY-META-EXPANSION-MODULE", 2, 0, false);
		declareFunction("sg_uncontinuable_suspend_status_p", "SG-UNCONTINUABLE-SUSPEND-STATUS-P", 1, 0, false);
		declareFunction("sg_mod_query", "SG-MOD-QUERY", 1, 0, false);
		declareFunction("sg_mod_register_problem_store", "SG-MOD-REGISTER-PROBLEM-STORE", 1, 0, false);
		declareFunction("subloop_reserved_initialize_sg_module_rule_translation_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-SG-MODULE-RULE-TRANSLATION-TEST-CASE-CLASS", 1, 0, false);
		declareFunction("subloop_reserved_initialize_sg_module_rule_translation_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-SG-MODULE-RULE-TRANSLATION-TEST-CASE-INSTANCE", 1, 0, false);
		declareFunction("sg_module_rule_translation_test_case_p", "SG-MODULE-RULE-TRANSLATION-TEST-CASE-P", 1, 0, false);
		return NIL;
	}

	public static final SubLObject init_sg_modules_file() {
		deflexical("*SG-AB-ABDUCTION-MODULES*", NIL);
		deflexical("*SG-MODULE-TABLE*", NIL);
		deflexical("*SG-MODULE-TYPES*", $list_alt25);
		deflexical("*SG-UNCONTINUABLE-SUSPEND-STATUSES*", $list_alt76);
		defparameter("*USE-SG-PROBLEM-STORE?*", NIL);
		defparameter("*SG-PROBLEM-STORE*", NIL);
		return NIL;
	}

	public static final SubLObject setup_sg_modules_file() {
		access_macros.register_macro_helper(SG_PREPARE_TO_BROWSE_NEW_FORWARD_INFERENCE, SG_BROWSING_REFINEMENTS);
		access_macros.register_macro_helper(SG_CLEANUP_FROM_BROWSING_NEW_FORWARD_INFERENCE, SG_BROWSING_REFINEMENTS);
		sunit_external.define_test_category($str_alt82$sg_modules_test_category, UNPROVIDED);
		sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(SG_MODULE_RULE_TRANSLATION_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
		sunit_macros.define_test_case_preamble(SG_MODULE_RULE_TRANSLATION_TEST_CASE);
		classes.subloop_new_class(SG_MODULE_RULE_TRANSLATION_TEST_CASE, CYCL_TEST_CASE, NIL, NIL, $list_alt85);
		classes.class_set_implements_slot_listeners(SG_MODULE_RULE_TRANSLATION_TEST_CASE, NIL);
		classes.subloop_note_class_initialization_function(SG_MODULE_RULE_TRANSLATION_TEST_CASE, $sym95$SUBLOOP_RESERVED_INITIALIZE_SG_MODULE_RULE_TRANSLATION_TEST_CASE_);
		classes.subloop_note_instance_initialization_function(SG_MODULE_RULE_TRANSLATION_TEST_CASE, $sym101$SUBLOOP_RESERVED_INITIALIZE_SG_MODULE_RULE_TRANSLATION_TEST_CASE_);
		subloop_reserved_initialize_sg_module_rule_translation_test_case_class(SG_MODULE_RULE_TRANSLATION_TEST_CASE);
		sunit_macros.define_test_case_postamble(SG_MODULE_RULE_TRANSLATION_TEST_CASE, $str_alt102$sg_modules, $$$cycl, $list_alt104);
		sunit_macros.def_test_method_register(SG_MODULE_RULE_TRANSLATION_TEST_CASE, STRIP_EXISTENTIALS_TEST);
		sunit_macros.def_test_method_register(SG_MODULE_RULE_TRANSLATION_TEST_CASE, TRANSLATE_TEST);
		sunit_external.define_test_suite($str_alt102$sg_modules, $list_alt104, UNPROVIDED, UNPROVIDED);
		return NIL;
	}

	private static final SubLSymbol $REFINEMENT = makeKeyword("REFINEMENT");

	private static final SubLSymbol $META_EXPANSION = makeKeyword("META-EXPANSION");

	static private final SubLList $list_alt3 = list(list(makeSymbol("MODULE"), makeSymbol("PLIST")), makeSymbol("&BODY"), makeSymbol("BODY"));

	static private final SubLList $list_alt5 = list(makeSymbol("*SG-AB-ABDUCTION-MODULES*"));

	static private final SubLList $list_alt6 = list(list(makeSymbol("ASSERTION"), makeSymbol("NODE")), makeSymbol("&BODY"), makeSymbol("BODY"));

	static private final SubLList $list_alt8 = list(list(makeSymbol("*BROWSE-FORWARD-INFERENCES?*"), makeSymbol("*SG-BROWSE-FORWARD-INFERENCES?*")), list(makeSymbol("*FORWARD-INFERENCE-BROWSING-CALLBACK-MORE-INFO?*"), T), list(makeSymbol("*FORWARD-INFERENCE-BROWSING-CALLBACK*"), list(QUOTE, makeSymbol("SG-NOTE-NEW-FORWARD-INFERENCE-FOR-BROWSING"))));

	private static final SubLSymbol SG_PREPARE_TO_BROWSE_NEW_FORWARD_INFERENCE = makeSymbol("SG-PREPARE-TO-BROWSE-NEW-FORWARD-INFERENCE");

	static private final SubLList $list_alt10 = list(list(makeSymbol("SG-CLEANUP-FROM-BROWSING-NEW-FORWARD-INFERENCE")));

	private static final SubLSymbol SG_BROWSING_REFINEMENTS = makeSymbol("SG-BROWSING-REFINEMENTS");

	static private final SubLString $str_alt12$Timestamp__ = makeString("Timestamp: ");

	private static final SubLSymbol SG_CLEANUP_FROM_BROWSING_NEW_FORWARD_INFERENCE = makeSymbol("SG-CLEANUP-FROM-BROWSING-NEW-FORWARD-INFERENCE");

	private static final SubLSymbol $QUERY_PATTERN = makeKeyword("QUERY-PATTERN");

	private static final SubLSymbol $HYPOTHESIZE_IF_NOT_PATTERN = makeKeyword("HYPOTHESIZE-IF-NOT-PATTERN");

	private static final SubLSymbol $ASSERTION_PATTERN = makeKeyword("ASSERTION-PATTERN");

	private static final SubLSymbol $HYPOTHESIS_PATTERN = makeKeyword("HYPOTHESIS-PATTERN");

	private static final SubLSymbol $INFERENCE_PROPERTIES = makeKeyword("INFERENCE-PROPERTIES");

	public static final SubLObject $$True = constant_handles.reader_make_constant_shell(makeString("True"));

	public static final SubLObject $$False = constant_handles.reader_make_constant_shell(makeString("False"));

	static private final SubLList $list_alt24 = cons(makeSymbol("MODULE"), makeSymbol("PLIST"));

	static private final SubLList $list_alt25 = list(list(makeKeyword("EXPANSION"), constant_handles.reader_make_constant_shell(makeString("ScenGenExpansionSpecification")), makeString("Expansion Modules")), list(makeKeyword("REFINEMENT"), constant_handles.reader_make_constant_shell(makeString("ScenGenRefinementSpecification")), makeString("Refinement Modules")),
			list(makeKeyword("META-EXPANSION"), constant_handles.reader_make_constant_shell(makeString("ScenGenMeta-ExpansionSpecification")), makeString("Meta-Expansion Modules")));

	static private final SubLList $list_alt26 = list(list(makeSymbol("TYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));

	static private final SubLSymbol $sym27$VALUE = makeUninternedSymbol("VALUE");

	static private final SubLList $list_alt28 = list(makeSymbol("*SG-MODULE-TYPES*"));

	static private final SubLList $list_alt31 = cons(makeSymbol("TYPE"), makeUninternedSymbol("VALUE"));

	public static final SubLObject $$scenarioSits = constant_handles.reader_make_constant_shell(makeString("scenarioSits"));

	static private final SubLList $list_alt33 = list(makeSymbol("MT"), makeSymbol("SIT"));

	static private final SubLList $list_alt34 = list(makeKeyword("VALUE"), makeKeyword("SITUATION"));

	static private final SubLList $list_alt35 = list(makeKeyword("VALUE"), makeKeyword("SCENARIO-MT"));

	static private final SubLList $list_alt36 = list(makeKeyword("VALUE"), makeKeyword("NEW-SITUATION"));

	static private final SubLList $list_alt37 = list(makeKeyword("VALUE"), makeKeyword("NEW-SCENARIO-MT"));

	static private final SubLList $list_alt41 = list(cons(makeKeyword("NEW-SITUATION"), makeSymbol("?X")));

	public static final SubLObject $$abductiveExpansion = constant_handles.reader_make_constant_shell(makeString("abductiveExpansion"));

	static private final SubLList $list_alt43 = list(list(constant_handles.reader_make_constant_shell(makeString("CurrentScenarioContextMt")), makeKeyword("VALUE"), makeKeyword("SCENARIO-MT")));

	public static final SubLObject $$thereExists = constant_handles.reader_make_constant_shell(makeString("thereExists"));

	public static final SubLObject $const45$softwareAssertionParameterValueIn = constant_handles.reader_make_constant_shell(makeString("softwareAssertionParameterValueInSpecification"));

	public static final SubLObject $const47$softwareParameterValueInSpecifica = constant_handles.reader_make_constant_shell(makeString("softwareParameterValueInSpecification"));

	public static final SubLObject $const48$ScenGenTransformationFormulaParam = constant_handles.reader_make_constant_shell(makeString("ScenGenTransformationFormulaParameter"));

	public static final SubLObject $const49$ScenGenImpliesTransformationFormu = constant_handles.reader_make_constant_shell(makeString("ScenGenImpliesTransformationFormulaParameter"));

	public static final SubLObject $const50$ScenGenModuleDefaultDisabledParam = constant_handles.reader_make_constant_shell(makeString("ScenGenModuleDefaultDisabledParameter"));

	public static final SubLObject $$InferenceParameter = constant_handles.reader_make_constant_shell(makeString("InferenceParameter"));

	private static final SubLSymbol $SITUATION = makeKeyword("SITUATION");

	private static final SubLSymbol $SCENARIO_MT = makeKeyword("SCENARIO-MT");

	static private final SubLList $list_alt55 = list(cons(makeKeyword("NEW-SITUATION"), makeSymbol("?NEW-SITUATION")));

	private static final SubLSymbol $SG_REFINEMENT_CUTOFF = makeKeyword("SG-REFINEMENT-CUTOFF");

	private static final SubLSymbol $SG_REFINEMENT_CUTOFF_ITERATIONS_NUMBER = makeKeyword("SG-REFINEMENT-CUTOFF-ITERATIONS-NUMBER");

	static private final SubLString $str_alt60$Refinement_iteration_ = makeString("Refinement iteration ");

	static private final SubLString $str_alt61$sg_mod_apply_all_refinement_modul = makeString("sg-mod-apply-all-refinement-modules ~A with forward problem store ~A~%");

	static private final SubLString $str_alt62$Got_result__A_from_sg_mod_apply_a = makeString("Got result ~A from sg-mod-apply-all-refinement-modules-int~%");

	static private final SubLString $str_alt63$sg_mod_apply_all_refinement_modul = makeString("sg-mod-apply-all-refinement-modules-int result: ~A~%");

	static private final SubLString $str_alt64$Applying_all_refinement_modules__ = makeString("Applying all refinement modules~%");

	static private final SubLString $str_alt65$sg_mod_apply_module_result__work_ = makeString("sg-mod-apply-module result (work-done?): ~A~%");

	private static final SubLSymbol $REFINED = makeKeyword("REFINED");

	static private final SubLString $str_alt67$Applying_SG_MODULE___s__ = makeString("Applying SG-MODULE: ~s~%");

	public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

	static private final SubLString $str_alt70$Could_not_find_assertions_for_ref = makeString("Could not find assertions for refinement module ~A: ~A");

	private static final SubLSymbol SG_NOTE_NEW_FORWARD_INFERENCE_FOR_BROWSING = makeSymbol("SG-NOTE-NEW-FORWARD-INFERENCE-FOR-BROWSING");

	static private final SubLString $str_alt72$Module__A_applies_to_node__A_resu = makeString("Module ~A applies to node ~A resulted in null query");

	static private final SubLString $str_alt73$Creating_query_node_from__s_in_mt = makeString("Creating query node from ~s in mt ~s~%");

	static private final SubLString $$$Applying_meta_exansion_module = makeString("Applying meta exansion module");

	static private final SubLString $str_alt75$__Creating_query_node_from__s_in_ = makeString("  Creating query node from ~s in mt ~s~%");

	static private final SubLList $list_alt76 = list(makeKeyword("EXHAUST"), makeKeyword("EXHAUST-TOTAL"));

	static private final SubLString $str_alt77$SG_MOD_QUERY__INFERENCE___a__ = makeString("SG-MOD-QUERY: INFERENCE: ~a~%");

	private static final SubLSymbol $SG_SEARCH_RESOURCE_EXHAUSTED = makeKeyword("SG-SEARCH-RESOURCE-EXHAUSTED");

	private static final SubLSymbol $TIME_EXHAUST = makeKeyword("TIME-EXHAUST");

	static private final SubLString $str_alt80$__Adding_abduction_node_for_formu = makeString("  Adding abduction node for formula:~%  ~A~%");

	static private final SubLString $str_alt81$__Suspending_query_node_for_later = makeString("  Suspending query node for later completion.");

	static private final SubLString $str_alt82$sg_modules_test_category = makeString("sg-modules-test-category");

	private static final SubLSymbol SG_MODULE_RULE_TRANSLATION_TEST_CASE = makeSymbol("SG-MODULE-RULE-TRANSLATION-TEST-CASE");

	private static final SubLSymbol CYCL_TEST_CASE = makeSymbol("CYCL-TEST-CASE");

	static private final SubLList $list_alt85 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STRIP-EXISTENTIALS-TEST"), NIL, makeKeyword("PROTECTED")),
			list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TRANSLATE-TEST"), NIL, makeKeyword("PROTECTED")));

	static private final SubLSymbol $sym95$SUBLOOP_RESERVED_INITIALIZE_SG_MODULE_RULE_TRANSLATION_TEST_CASE_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SG-MODULE-RULE-TRANSLATION-TEST-CASE-CLASS");

	static private final SubLSymbol $sym101$SUBLOOP_RESERVED_INITIALIZE_SG_MODULE_RULE_TRANSLATION_TEST_CASE_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SG-MODULE-RULE-TRANSLATION-TEST-CASE-INSTANCE");

	static private final SubLString $str_alt102$sg_modules = makeString("sg-modules");

	static private final SubLString $$$cycl = makeString("cycl");

	static private final SubLList $list_alt104 = list(makeString("sg-modules-test-category"));

	private static final SubLSymbol STRIP_EXISTENTIALS_TEST = makeSymbol("STRIP-EXISTENTIALS-TEST");

	private static final SubLSymbol TRANSLATE_TEST = makeSymbol("TRANSLATE-TEST");

	// // Initializers
	public void declareFunctions() {
		declare_sg_modules_file();
	}

	public void initializeVariables() {
		init_sg_modules_file();
	}

	public void runTopLevelForms() {
		setup_sg_modules_file();
	}
}
