/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.valid_process_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
 *  module:      UIA-COA-UTILITIES
 *  source file: /cyc/top/cycl/uia-coa-utilities.lisp
 *  created:     2019/07/03 17:37:58
 */
public final class uia_coa_utilities extends SubLTranslatedFile implements V02 {
	// // Constructor
	private uia_coa_utilities() {
	}

	public static final SubLFile me = new uia_coa_utilities();

	// // Definitions
	public static final SubLObject uia_relevant_coas_for_refinement(SubLObject v_agenda) {
		{
			SubLObject domain_interaction_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			SubLObject result = ask_utilities.ask_variable($sym0$_COA, $list_alt1, domain_interaction_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			SubLObject from_coas = ask_utilities.ask_variable($sym0$_COA, list($$coaAvailableForCritiquingFrom, $sym0$_COA, domain_interaction_mt), domain_interaction_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			SubLObject other_coas = ask_utilities.ask_variable($sym0$_COA, $list_alt3, domain_interaction_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			result = remove_duplicates(append(result, from_coas, other_coas), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			{
				SubLObject cdolist_list_var = rkf_term_utilities.rkf_terms_created_in_interaction_mt(domain_interaction_mt);
				SubLObject v_term = NIL;
				for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), v_term = cdolist_list_var.first()) {
					if (NIL != uia_coaP(v_agenda, v_term)) {
						{
							SubLObject item_var = v_term;
							if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
								result = cons(item_var, result);
							}
						}
					}
				}
			}
			return result;
		}
	}

	/**
	 *
	 *
	 * @return BOOLEAN; Is TERM a COA, from the point of view of AGENDA?
	 */
	public static final SubLObject uia_coaP(SubLObject v_agenda, SubLObject v_term) {
		return isa.isaP(v_term, $$CourseOfAction, user_interaction_agenda.uia_domain_interaction_mt(v_agenda), UNPROVIDED);
	}

	/**
	 *
	 *
	 * @param DIMENSION
	 * 		instance of #$MilitaryDecisionMakingActionType
	 * @param COA
	 * 		instance of #$CourseOfAction
	 * @return nart
	 */
	public static final SubLObject get_coa_assessment_nart(SubLObject dimension, SubLObject coa) {
		return czer_main.cyc_find_or_create_nart(el_utilities.make_binary_formula($$COAAssessmentForFn, dimension, coa), UNPROVIDED);
	}

	/**
	 * The principles used for COA refinement, indexed by domain mt
	 */
	// deflexical
	private static final SubLSymbol $rkf_mett_evaluation_types$ = makeSymbol("*RKF-METT-EVALUATION-TYPES*");

	public static final SubLObject uia_get_mett_tc_evaluation_types(SubLObject v_agenda) {
		{
			SubLObject mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			SubLObject types = dictionary.dictionary_lookup($rkf_mett_evaluation_types$.getGlobalValue(), mt, $UNTRIED);
			if ($UNTRIED == types) {
				return uia_set_mett_tc_evaluation_types(v_agenda);
			} else {
				return types;
			}
		}
	}

	public static final SubLObject uia_set_mett_tc_evaluation_types(SubLObject v_agenda) {
		{
			SubLObject mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			SubLObject types = uia_trampolines.uia_get_ordering_categories(v_agenda, $$METT_TC_Ordering, mt);
			dictionary.dictionary_enter($rkf_mett_evaluation_types$.getGlobalValue(), mt, types);
			return types;
		}
	}

	/**
	 * The dimensions used for COA specification, indexed by domain mt
	 */
	// deflexical
	private static final SubLSymbol $rkf_coa_specification_dimensions$ = makeSymbol("*RKF-COA-SPECIFICATION-DIMENSIONS*");

	public static final SubLObject uia_get_coa_specification_dimensions(SubLObject v_agenda) {
		{
			SubLObject mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			SubLObject dimensions = dictionary.dictionary_lookup($rkf_coa_specification_dimensions$.getGlobalValue(), mt, $UNTRIED);
			if ($UNTRIED == dimensions) {
				return uia_set_coa_specification_dimensions(v_agenda);
			} else {
				return dimensions;
			}
		}
	}

	public static final SubLObject uia_set_coa_specification_dimensions(SubLObject v_agenda) {
		{
			SubLObject mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			SubLObject ordering = constants_high.find_constant($$$COADimensionsOrdering);
			SubLObject dimensions = (NIL != constant_handles.constant_p(ordering)) ? ((SubLObject) (uia_trampolines.uia_get_ordering_categories(v_agenda, ordering, mt))) : isa.all_fort_instances($$COASpecificationDimension, mt, UNPROVIDED);
			dictionary.dictionary_enter($rkf_coa_specification_dimensions$.getGlobalValue(), mt, dimensions);
			return dimensions;
		}
	}

	/**
	 *
	 *
	 * @unknown Should be replaced with better queries based on Tony's test suite code.
	 */
	public static final SubLObject uia_get_coa_evaluation_dimensions(SubLObject v_agenda, SubLObject course_of_action, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject v_answer = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								v_answer = uia_get_coa_evaluation_dimensions_memoized(course_of_action, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_1 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_1, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return v_answer;
			}
		}
	}

	public static final SubLObject uia_get_coa_evaluation_dimensions_memoized_internal(SubLObject course_of_action, SubLObject domain_mt) {
		{
			SubLObject counter = ONE_INTEGER;
			SubLObject dimensions = NIL;
			SubLObject doneP = NIL;
			while (NIL == doneP) {
				{
					SubLObject dimension = ask_utilities.ask_variable($DIMENSION, el_utilities.make_ternary_formula($$nthInOrdering, $$COAEvaluationDimensionsOrdering, $DIMENSION, counter), domain_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					if (NIL == dimension) {
						doneP = T;
					} else {
						dimensions = cons(dimension.first(), dimensions);
					}
					counter = add(counter, ONE_INTEGER);
				}
			}
			if (NIL == dimensions) {
				return isa.all_fort_instances($$COAEvaluationDimension, domain_mt, UNPROVIDED);
			} else {
				return nreverse(dimensions);
			}
		}
	}

	public static final SubLObject uia_get_coa_evaluation_dimensions_memoized(SubLObject course_of_action, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_get_coa_evaluation_dimensions_memoized_internal(course_of_action, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_GET_COA_EVALUATION_DIMENSIONS_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_GET_COA_EVALUATION_DIMENSIONS_MEMOIZED, TWO_INTEGER, NIL, EQ, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_GET_COA_EVALUATION_DIMENSIONS_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(course_of_action, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw16$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (course_of_action == cached_args.first()) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && (domain_mt == cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_get_coa_evaluation_dimensions_memoized_internal(course_of_action, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(course_of_action, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	/**
	 *
	 *
	 * @unknown this should come from the KB
	 */
	public static final SubLObject uia_get_coa_evaluation_atribute_values(SubLObject v_agenda, SubLObject course_of_action, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		return list($$EffectiveForPurpose, $$IneffectiveForPurpose);
	}

	/**
	 *
	 *
	 * @unknown we should do filtering based on dimensions on attributes, in case we do not
	care about all of them
	 */
	public static final SubLObject uia_get_coa_evaluation_rules(SubLObject v_agenda, SubLObject dimensions, SubLObject attributes, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject rules = NIL;
				SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(domain_mt);
				{
					SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
					SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
						mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
						mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
						if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator($$evaluatesDimensionOfCOA, $POS, $BACKWARD)) {
							{
								SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator($$evaluatesDimensionOfCOA, $POS, $BACKWARD);
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
													final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, $BACKWARD);
													{
														SubLObject done_var_2 = NIL;
														SubLObject token_var_3 = NIL;
														while (NIL == done_var_2) {
															{
																SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_3);
																SubLObject valid_4 = makeBoolean(token_var_3 != as);
																if (NIL != valid_4) {
																	if (NIL != find_if(UIA_COA_EVALUATION_LIT_P, clauses.pos_lits(assertions_high.assertion_cnf(as)), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
																		rules = cons(as, rules);
																	}
																}
																done_var_2 = makeBoolean(NIL == valid_4);
															}
														}
													}
												} finally {
													{
														SubLObject _prev_bind_0_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
														try {
															$is_thread_performing_cleanupP$.bind(T, thread);
															if (NIL != final_index_iterator) {
																kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
															}
														} finally {
															$is_thread_performing_cleanupP$.rebind(_prev_bind_0_5, thread);
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
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
						mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
					}
				}
				return rules;
			}
		}
	}

	/**
	 *
	 *
	 * @unknown with Tony's KB test suite support, all of this should be done differently.
	 */
	public static final SubLObject uia_compile_coa_evaluation_matrix(SubLObject v_agenda, SubLObject course_of_action, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			SubLObject eval_dims = uia_get_coa_evaluation_dimensions(v_agenda, course_of_action, domain_mt);
			SubLObject eval_attrs = uia_get_coa_evaluation_atribute_values(v_agenda, course_of_action, domain_mt);
			SubLObject rules = uia_get_coa_evaluation_rules(v_agenda, eval_dims, eval_attrs, domain_mt);
			SubLObject matrix = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
			SubLObject v_default = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
			{
				SubLObject cdolist_list_var = eval_attrs;
				SubLObject eval_attr = NIL;
				for (eval_attr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), eval_attr = cdolist_list_var.first()) {
					dictionary.dictionary_enter(v_default, eval_attr, NIL);
				}
			}
			{
				SubLObject cdolist_list_var = eval_dims;
				SubLObject eval_dim = NIL;
				for (eval_dim = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), eval_dim = cdolist_list_var.first()) {
					dictionary.dictionary_enter(matrix, eval_dim, dictionary_utilities.copy_dictionary(v_default));
				}
			}
			{
				SubLObject cdolist_list_var = rules;
				SubLObject rule = NIL;
				for (rule = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), rule = cdolist_list_var.first()) {
					{
						SubLObject rule_consequent = find_if(UIA_COA_EVALUATION_LIT_P, clauses.pos_lits(assertions_high.assertion_cnf(rule)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
						SubLObject dimension = cycl_utilities.formula_arg2(rule_consequent, UNPROVIDED);
						SubLObject attribute = cycl_utilities.formula_arg3(rule_consequent, UNPROVIDED);
						SubLObject cell = dictionary.dictionary_lookup(matrix, dimension, UNPROVIDED);
						if (NIL == dictionary.dictionary_p(cell)) {
							Errors.error($str_alt24$Dimension__S_is_an_unknown_COA_di, dimension, eval_dims);
						}
						dictionary_utilities.dictionary_push(cell, attribute, rule);
					}
				}
			}
			return matrix;
		}
	}

	public static final SubLObject uia_coa_evaluation_lit_p(SubLObject element) {
		return makeBoolean((NIL != el_utilities.el_formula_p(element)) && (NIL != formula_pattern_match.formula_matches_pattern(element, $list_alt25)));
	}

	/**
	 *
	 *
	 * @unknown - We should do this in a more clever way.
	 */
	// deflexical
	private static final SubLSymbol $uia_coa_evaluation_variable$ = makeSymbol("*UIA-COA-EVALUATION-VARIABLE*");

	public static final SubLObject uia_generate_new_coa_evaluation_consequent(SubLObject v_agenda, SubLObject dimension, SubLObject attribute, SubLObject use_this_coa) {
		if (use_this_coa == UNPROVIDED) {
			use_this_coa = NIL;
		}
		if (NIL != forts.fort_p(use_this_coa)) {
			return el_utilities.make_formula($$evaluatesDimensionOfCOA, list(use_this_coa, dimension, attribute), UNPROVIDED);
		} else {
			return el_utilities.make_formula($$evaluatesDimensionOfCOA, list($uia_coa_evaluation_variable$.getGlobalValue(), dimension, attribute), UNPROVIDED);
		}
	}

	public static final SubLObject uia_coa_valid_nusketch_connectionP(SubLObject v_agenda) {
		{
			SubLObject uima = user_interaction_agenda.uia_meta_agenda(v_agenda);
			return makeBoolean(((NIL != rkf_collaborator_nusketch.nusketch_session_p(user_interaction_agenda.uima_state_lookup(uima, $NSESSION, UNPROVIDED))) && user_interaction_agenda.uima_state_lookup(uima, $POLLING_LOCK, UNPROVIDED).isLock()) && (NIL != valid_process_p(user_interaction_agenda.uima_state_lookup(uima, $POLLING_THREAD, UNPROVIDED))));
		}
	}

	public static final SubLObject uia_coa_request_glyphs_from_nusketch(SubLObject v_agenda, SubLObject title, SubLObject prompt, SubLObject acceptable_glyph_lists, SubLObject n_aryP) {
		if (acceptable_glyph_lists == UNPROVIDED) {
			acceptable_glyph_lists = NIL;
		}
		if (n_aryP == UNPROVIDED) {
			n_aryP = NIL;
		}
		if (NIL == uia_coa_valid_nusketch_connectionP(v_agenda)) {
			user_interaction_agenda.uia_act_new_acknowledge_message(v_agenda, $str_alt30$You_must_first_initialize_the_con);
			return NIL;
		}
		{
			SubLObject request_id = rkf_collaborator_nusketch.rkfcoll_nusketch_send_ask_user_glyph_request(v_agenda, title, prompt, acceptable_glyph_lists, n_aryP);
			SubLObject pending_requests = uia_coa_ensure_pending_requests_mapper(v_agenda);
			dictionary.dictionary_enter(pending_requests, request_id, $PENDING);
			return request_id;
		}
	}

	public static final SubLObject uia_coa_check_on_pending_request(SubLObject v_agenda, SubLObject request_id) {
		{
			SubLObject pending_requests = uia_coa_ensure_pending_requests_mapper(v_agenda);
			return dictionary.dictionary_lookup(pending_requests, request_id, $UNKNOWN);
		}
	}

	public static final SubLObject uia_coa_fetch_and_remove_pending_request(SubLObject v_agenda, SubLObject request_id) {
		{
			SubLObject pending_requests = uia_coa_ensure_pending_requests_mapper(v_agenda);
			SubLObject result = dictionary.dictionary_lookup(pending_requests, request_id, $UNKNOWN);
			dictionary.dictionary_remove(pending_requests, request_id);
			return result;
		}
	}

	public static final SubLObject uia_coa_post_answer_for_pending_request(SubLObject v_agenda, SubLObject request_id, SubLObject result) {
		{
			SubLObject pending_requests = uia_coa_ensure_pending_requests_mapper(v_agenda);
			dictionary.dictionary_enter(pending_requests, request_id, result);
			return result;
		}
	}

	public static final SubLObject uia_coa_ensure_pending_requests_mapper(SubLObject v_agenda) {
		{
			SubLObject pending_requests = user_interaction_agenda.uia_state_lookup(v_agenda, $PENDING_REQUESTS, $UNINITIALIZED);
			if (pending_requests == $UNINITIALIZED) {
				pending_requests = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
				user_interaction_agenda.uia_state_update(v_agenda, $PENDING_REQUESTS, pending_requests);
			}
			return pending_requests;
		}
	}

	// deflexical
	private static final SubLSymbol $uia_nusketch_waiter_poll_time$ = makeSymbol("*UIA-NUSKETCH-WAITER-POLL-TIME*");

	public static final SubLObject uia_coa_nusketch_waiter_thinking_thread(SubLObject v_agenda, SubLObject request_id) {
		{
			SubLObject result = NIL;
			uia_tools_basic.uiat_thinking_note_progress_message($str_alt35$Please_make_your_selection_on_nuS, UNPROVIDED);
			result = uiat_coa_nusketch_perform_wait(v_agenda, request_id, $uia_nusketch_waiter_poll_time$.getGlobalValue());
			return result;
		}
	}

	public static final SubLObject uiat_coa_nusketch_perform_wait(SubLObject v_agenda, SubLObject request_id, SubLObject wait_time) {
		{
			SubLObject doneP = NIL;
			SubLObject result = NIL;
			while (NIL == doneP) {
				result = uia_coa_check_on_pending_request(v_agenda, request_id);
				if (result.isCons()) {
					result = uia_coa_fetch_and_remove_pending_request(v_agenda, request_id);
					doneP = T;
				} else if (result == $PENDING) {
					sleep(wait_time);
				} else {
					result = $ERROR;
					doneP = T;
				}

			}
			return result;
		}
	}

	public static final SubLObject uia_gke_construct_context(SubLObject interaction) {
		return string_utilities.to_string(cons(LIST, user_interaction_agenda.ui_signature(interaction)));
	}

	public static final SubLObject uia_gke_parse_context(SubLObject list) {
		{
			SubLObject signature = list;
			if (NIL != user_interaction_agenda.ui_signature_p(signature)) {
				return user_interaction_agenda.find_ui_by_signature(signature);
			}
			return NIL;
		}
	}

	/**
	 *
	 *
	 * @unknown do better here
	 */
	public static final SubLObject uia_gke_get_other_find_label(SubLObject interaction) {
		return $$$Get_from_Sketch;
	}

	/**
	 * Given a context-string that encodes an interaction, request
	 * a term from nuSketch and return its generated phrase.
	 */
	public static final SubLObject uia_gke_perform_other_find(SubLObject context_string) {
		{
			SubLObject interaction = uia_gke_parse_context(context_string);
			SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
			if (NIL == user_interaction_agenda.user_interaction_p(interaction)) {
				Errors.error($str_alt39$Invalid_context_string__S_, context_string);
			}
			if (NIL == uia_coa_valid_nusketch_connectionP(v_agenda)) {
				Errors.error($str_alt40$KRAKEN_and_nuSketch_are_no_longer);
			}
			{
				SubLObject title = $$$Guided_Knowledge_Entry_Tool;
				SubLObject prompt = $str_alt42$Please_drag___drop_the_entity_tha;
				SubLObject acceptable_glyph_lists = list($ALL_GLYPHS);
				SubLObject request_id = uia_coa_request_glyphs_from_nusketch(v_agenda, title, prompt, acceptable_glyph_lists, NIL);
				SubLObject result = NIL;
				if (!request_id.isFixnum()) {
					Errors.error($str_alt44$Could_not_contact_nuSketch_____ab);
				}
				result = uiat_coa_nusketch_perform_wait(v_agenda, request_id, $uia_nusketch_waiter_poll_time$.getGlobalValue());
				if (!result.isCons()) {
					return $str_alt45$;
				}
				{
					SubLObject v_term = result.first();
					SubLObject phrase = uia_trampolines.uia_term_phrase(v_agenda, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					return phrase;
				}
			}
		}
	}

	public static final SubLObject declare_uia_coa_utilities_file() {
		declareFunction("uia_relevant_coas_for_refinement", "UIA-RELEVANT-COAS-FOR-REFINEMENT", 1, 0, false);
		declareFunction("uia_coaP", "UIA-COA?", 2, 0, false);
		declareFunction("get_coa_assessment_nart", "GET-COA-ASSESSMENT-NART", 2, 0, false);
		declareFunction("uia_get_mett_tc_evaluation_types", "UIA-GET-METT-TC-EVALUATION-TYPES", 1, 0, false);
		declareFunction("uia_set_mett_tc_evaluation_types", "UIA-SET-METT-TC-EVALUATION-TYPES", 1, 0, false);
		declareFunction("uia_get_coa_specification_dimensions", "UIA-GET-COA-SPECIFICATION-DIMENSIONS", 1, 0, false);
		declareFunction("uia_set_coa_specification_dimensions", "UIA-SET-COA-SPECIFICATION-DIMENSIONS", 1, 0, false);
		declareFunction("uia_get_coa_evaluation_dimensions", "UIA-GET-COA-EVALUATION-DIMENSIONS", 2, 1, false);
		declareFunction("uia_get_coa_evaluation_dimensions_memoized_internal", "UIA-GET-COA-EVALUATION-DIMENSIONS-MEMOIZED-INTERNAL", 2, 0, false);
		declareFunction("uia_get_coa_evaluation_dimensions_memoized", "UIA-GET-COA-EVALUATION-DIMENSIONS-MEMOIZED", 2, 0, false);
		declareFunction("uia_get_coa_evaluation_atribute_values", "UIA-GET-COA-EVALUATION-ATRIBUTE-VALUES", 2, 1, false);
		declareFunction("uia_get_coa_evaluation_rules", "UIA-GET-COA-EVALUATION-RULES", 3, 1, false);
		declareFunction("uia_compile_coa_evaluation_matrix", "UIA-COMPILE-COA-EVALUATION-MATRIX", 2, 1, false);
		declareFunction("uia_coa_evaluation_lit_p", "UIA-COA-EVALUATION-LIT-P", 1, 0, false);
		declareFunction("uia_generate_new_coa_evaluation_consequent", "UIA-GENERATE-NEW-COA-EVALUATION-CONSEQUENT", 3, 1, false);
		declareFunction("uia_coa_valid_nusketch_connectionP", "UIA-COA-VALID-NUSKETCH-CONNECTION?", 1, 0, false);
		declareFunction("uia_coa_request_glyphs_from_nusketch", "UIA-COA-REQUEST-GLYPHS-FROM-NUSKETCH", 3, 2, false);
		declareFunction("uia_coa_check_on_pending_request", "UIA-COA-CHECK-ON-PENDING-REQUEST", 2, 0, false);
		declareFunction("uia_coa_fetch_and_remove_pending_request", "UIA-COA-FETCH-AND-REMOVE-PENDING-REQUEST", 2, 0, false);
		declareFunction("uia_coa_post_answer_for_pending_request", "UIA-COA-POST-ANSWER-FOR-PENDING-REQUEST", 3, 0, false);
		declareFunction("uia_coa_ensure_pending_requests_mapper", "UIA-COA-ENSURE-PENDING-REQUESTS-MAPPER", 1, 0, false);
		declareFunction("uia_coa_nusketch_waiter_thinking_thread", "UIA-COA-NUSKETCH-WAITER-THINKING-THREAD", 2, 0, false);
		declareFunction("uiat_coa_nusketch_perform_wait", "UIAT-COA-NUSKETCH-PERFORM-WAIT", 3, 0, false);
		declareFunction("uia_gke_construct_context", "UIA-GKE-CONSTRUCT-CONTEXT", 1, 0, false);
		declareFunction("uia_gke_parse_context", "UIA-GKE-PARSE-CONTEXT", 1, 0, false);
		declareFunction("uia_gke_get_other_find_label", "UIA-GKE-GET-OTHER-FIND-LABEL", 1, 0, false);
		declareFunction("uia_gke_perform_other_find", "UIA-GKE-PERFORM-OTHER-FIND", 1, 0, false);
		return NIL;
	}

	public static final SubLObject init_uia_coa_utilities_file() {
		deflexical("*RKF-METT-EVALUATION-TYPES*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
		deflexical("*RKF-COA-SPECIFICATION-DIMENSIONS*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
		deflexical("*UIA-COA-EVALUATION-VARIABLE*", cycl_variables.make_el_var($str_alt26$the_coa));
		deflexical("*UIA-NUSKETCH-WAITER-POLL-TIME*", FOUR_INTEGER);
		return NIL;
	}

	public static final SubLObject setup_uia_coa_utilities_file() {
		memoization_state.note_memoized_function(UIA_GET_COA_EVALUATION_DIMENSIONS_MEMOIZED);
		return NIL;
	}

	// // Internal Constants
	static private final SubLSymbol $sym0$_COA = makeSymbol("?COA");

	static private final SubLList $list_alt1 = list(constant_handles.reader_make_constant_shell(makeString("thereExists")), makeSymbol("?MT"), list(constant_handles.reader_make_constant_shell(makeString("coaDescribingSpecification")), makeSymbol("?COA"), makeSymbol("?MT")));

	public static final SubLObject $$coaAvailableForCritiquingFrom = constant_handles.reader_make_constant_shell(makeString("coaAvailableForCritiquingFrom"));

	static private final SubLList $list_alt3 = list(constant_handles.reader_make_constant_shell(makeString("coaAvailableForCritiquing")), makeSymbol("?COA"));

	public static final SubLObject $$CourseOfAction = constant_handles.reader_make_constant_shell(makeString("CourseOfAction"));

	public static final SubLObject $$COAAssessmentForFn = constant_handles.reader_make_constant_shell(makeString("COAAssessmentForFn"));

	private static final SubLSymbol $UNTRIED = makeKeyword("UNTRIED");

	public static final SubLObject $$METT_TC_Ordering = constant_handles.reader_make_constant_shell(makeString("METT-TC-Ordering"));

	static private final SubLString $$$COADimensionsOrdering = makeString("COADimensionsOrdering");

	public static final SubLObject $$COASpecificationDimension = constant_handles.reader_make_constant_shell(makeString("COASpecificationDimension"));

	static private final SubLString $str_alt10$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

	private static final SubLSymbol UIA_GET_COA_EVALUATION_DIMENSIONS_MEMOIZED = makeSymbol("UIA-GET-COA-EVALUATION-DIMENSIONS-MEMOIZED");

	private static final SubLSymbol $DIMENSION = makeKeyword("DIMENSION");

	public static final SubLObject $$nthInOrdering = constant_handles.reader_make_constant_shell(makeString("nthInOrdering"));

	public static final SubLObject $$COAEvaluationDimensionsOrdering = constant_handles.reader_make_constant_shell(makeString("COAEvaluationDimensionsOrdering"));

	public static final SubLObject $$COAEvaluationDimension = constant_handles.reader_make_constant_shell(makeString("COAEvaluationDimension"));

	public static final SubLSymbol $kw16$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

	public static final SubLObject $$EffectiveForPurpose = constant_handles.reader_make_constant_shell(makeString("EffectiveForPurpose"));

	public static final SubLObject $$IneffectiveForPurpose = constant_handles.reader_make_constant_shell(makeString("IneffectiveForPurpose"));

	public static final SubLObject $$evaluatesDimensionOfCOA = constant_handles.reader_make_constant_shell(makeString("evaluatesDimensionOfCOA"));

	private static final SubLSymbol UIA_COA_EVALUATION_LIT_P = makeSymbol("UIA-COA-EVALUATION-LIT-P");

	static private final SubLString $str_alt24$Dimension__S_is_an_unknown_COA_di = makeString("Dimension ~S is an unknown COA dimension (known are ~S).");

	static private final SubLList $list_alt25 = list(constant_handles.reader_make_constant_shell(makeString("evaluatesDimensionOfCOA")), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"));

	static private final SubLString $str_alt26$the_coa = makeString("the-coa");

	private static final SubLSymbol $NSESSION = makeKeyword("NSESSION");

	private static final SubLSymbol $POLLING_LOCK = makeKeyword("POLLING-LOCK");

	private static final SubLSymbol $POLLING_THREAD = makeKeyword("POLLING-THREAD");

	static private final SubLString $str_alt30$You_must_first_initialize_the_con = makeString("You must first initialize the connection between nuSketch and KRAKEN.");

	private static final SubLSymbol $PENDING_REQUESTS = makeKeyword("PENDING-REQUESTS");

	static private final SubLString $str_alt35$Please_make_your_selection_on_nuS = makeString("Please make your selection on nuSketch -- click [Reject] to back out if you came here by accident.");

	static private final SubLString $$$Get_from_Sketch = makeString("Get from Sketch");

	static private final SubLString $str_alt39$Invalid_context_string__S_ = makeString("Invalid context string ~S.");

	static private final SubLString $str_alt40$KRAKEN_and_nuSketch_are_no_longer = makeString("KRAKEN and nuSketch are no longer synchronized -- cannot find anything.");

	static private final SubLString $$$Guided_Knowledge_Entry_Tool = makeString("Guided Knowledge Entry Tool");

	static private final SubLString $str_alt42$Please_drag___drop_the_entity_tha = makeString("Please drag & drop the entity that you wish to select.");

	private static final SubLSymbol $ALL_GLYPHS = makeKeyword("ALL-GLYPHS");

	static private final SubLString $str_alt44$Could_not_contact_nuSketch_____ab = makeString("Could not contact nuSketch ... aborting.");

	static private final SubLString $str_alt45$ = makeString("");

	// // Initializers
	public void declareFunctions() {
		declare_uia_coa_utilities_file();
	}

	public void initializeVariables() {
		init_uia_coa_utilities_file();
	}

	public void runTopLevelForms() {
		setup_uia_coa_utilities_file();
	}
}
