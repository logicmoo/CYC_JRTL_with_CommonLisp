/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.cfasl.$cfasl_common_symbols$;
import static com.cyc.cycjava.cycl.cfasl.cfasl_encoding_string_stream_encoding;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.cfasl.cfasl_set_common_symbols;
import static com.cyc.cycjava.cycl.cfasl.close_cfasl_decoding_stream;
import static com.cyc.cycjava.cycl.cfasl.close_cfasl_encoding_stream;
import static com.cyc.cycjava.cycl.cfasl.new_cfasl_decoding_stream;
import static com.cyc.cycjava.cycl.cfasl.new_cfasl_encoding_stream;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.log;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.harness.abnormal;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_parameters;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      MYSENTIENT-USER-PROFILE-MANAGER-WIDGETS
 *  source file: /cyc/top/cycl/mysentient-user-profile-manager-widgets.lisp
 *  created:     2019/07/03 17:39:02
 */
public final class mysentient_user_profile_manager_widgets extends SubLTranslatedFile implements V02 {
	// // Constructor
	private mysentient_user_profile_manager_widgets() {
	}

	public static final SubLFile me = new mysentient_user_profile_manager_widgets();

	public static final SubLObject clear_get_intended_referent_for_term() {
		{
			SubLObject cs = $get_intended_referent_for_term_caching_state$.getGlobalValue();
			if (NIL != cs) {
				memoization_state.caching_state_clear(cs);
			}
		}
		return NIL;
	}

	public static final SubLObject remove_get_intended_referent_for_term(SubLObject peg, SubLObject mt) {
		return memoization_state.caching_state_remove_function_results_with_args($get_intended_referent_for_term_caching_state$.getGlobalValue(), list(peg, mt), UNPROVIDED, UNPROVIDED);
	}

	public static final SubLObject get_intended_referent_for_term_internal(SubLObject peg, SubLObject mt) {
		if (NIL == isa.isaP(peg, $$LinguisticExpressionPeg, mt, UNPROVIDED)) {
			return peg;
		}
		{
			SubLObject referent = ask_utilities.query_variable($DREF, listS($$intendedReferent, peg, $list_alt4), mt, $list_alt5).first();
			if (NIL == referent) {
				referent = ask_utilities.query_variable($DREF, listS($$naiveReferent, peg, $list_alt4), mt, $list_alt5).first();
			}
			if (NIL == referent) {
				referent = ask_utilities.query_variable($DREF, listS($$referent, peg, $list_alt4), mt, $list_alt5).first();
			}
			if (NIL == referent) {
				referent = ask_utilities.query_variable($DREF, listS($$pegInterpretations, peg, $list_alt4), mt, $list_alt5).first();
			}
			return referent;
		}
	}

	public static final SubLObject get_intended_referent_for_term(SubLObject peg, SubLObject mt) {
		{
			SubLObject caching_state = $get_intended_referent_for_term_caching_state$.getGlobalValue();
			if (NIL == caching_state) {
				caching_state = memoization_state.create_global_caching_state_for_name(GET_INTENDED_REFERENT_FOR_TERM, $get_intended_referent_for_term_caching_state$, NIL, EQ, TWO_INTEGER, ZERO_INTEGER);
			}
			{
				SubLObject sxhash = memoization_state.sxhash_calc_2(peg, mt);
				SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
				if (collisions != $kw10$_MEMOIZED_ITEM_NOT_FOUND_) {
					{
						SubLObject cdolist_list_var = collisions;
						SubLObject collision = NIL;
						for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
							{
								SubLObject cached_args = collision.first();
								SubLObject results2 = second(collision);
								if (peg == cached_args.first()) {
									cached_args = cached_args.rest();
									if (((NIL != cached_args) && (NIL == cached_args.rest())) && (mt == cached_args.first())) {
										return memoization_state.caching_results(results2);
									}
								}
							}
						}
					}
				}
				{
					SubLObject results = arg2(resetMultipleValues(), multiple_value_list(get_intended_referent_for_term_internal(peg, mt)));
					memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(peg, mt));
					return memoization_state.caching_results(results);
				}
			}
		}
	}

	/**
	 *
	 *
	 * @param TERM:
	 * 		a constant or nat
	 * @param MT:
	 * 		a hl microtheory
	 * @return LISTP: a list of terms for which may be used for claifying or redescribing the thing denoted by TERM.
	 */
	public static final SubLObject get_clarifying_isas_for_term(SubLObject v_term, SubLObject mt, SubLObject max_number) {
		if (max_number == UNPROVIDED) {
			max_number = NIL;
		}
		SubLTrampolineFile.checkType(v_term, CYCL_DENOTATIONAL_TERM_P);
		SubLTrampolineFile.checkType(mt, HLMT_P);
		{
			SubLObject results = NIL;
			SubLObject deref_term = get_intended_referent_for_term(v_term, mt);
			results = rkf_relevance_utilities.rkf_filter_irrelevant_terms(ask_utilities.query_variable($ANSWER, listS($$mostNotableIsa, deref_term, $list_alt15), mt, listS($MAX_TRANSFORMATION_DEPTH, ONE_INTEGER, $MAX_NUMBER, max_number, $list_alt5)), mt);
			if (NIL == results) {
				results = rkf_relevance_utilities.rkf_filter_irrelevant_terms(ask_utilities.query_variable($ANSWER, listS($$nearestIsaOfType, deref_term, $list_alt19), mt, listS($MAX_TRANSFORMATION_DEPTH, ONE_INTEGER, $MAX_NUMBER, max_number, $list_alt5)), mt);
			}
			if (NIL == results) {
				results = rkf_relevance_utilities.rkf_filter_irrelevant_terms(ask_utilities.query_variable($ANSWER, listS($$nearestIsa, deref_term, $list_alt15), mt, listS($MAX_TRANSFORMATION_DEPTH, ONE_INTEGER, $MAX_NUMBER, max_number, $list_alt5)), mt);
			}
			return results;
		}
	}

	/**
	 * The number of seconds that the UPM should spend trying any one strategy on any one peg
	 */
	// defparameter
	public static final SubLSymbol $mys_expansion_query_max_time$ = makeSymbol("*MYS-EXPANSION-QUERY-MAX-TIME*");

	/**
	 *
	 *
	 * @param TERM:
	 * 		a constant or nat
	 * @param MT:
	 * 		a hlmt-p
	 * @return LISTP: the list of all definitional terms (collections or predicates)
	for TERM
	 */
	public static final SubLObject expansion_cycls_for_strategy(SubLObject v_term, SubLObject strategy, SubLObject mt, SubLObject max_number, SubLObject instantiate_collectionsP, SubLObject max_time) {
		if (max_number == UNPROVIDED) {
			max_number = NIL;
		}
		if (instantiate_collectionsP == UNPROVIDED) {
			instantiate_collectionsP = NIL;
		}
		if (max_time == UNPROVIDED) {
			max_time = $mys_expansion_query_max_time$.getDynamicValue();
		}
		SubLTrampolineFile.checkType(v_term, CYCL_DENOTATIONAL_TERM_P);
		SubLTrampolineFile.checkType(mt, HLMT_P);
		{
			SubLObject results = NIL;
			SubLObject relevant_results = NIL;
			results = ((NIL != instantiate_collectionsP) && (NIL != fort_types_interface.isa_collectionP(v_term, UNPROVIDED)))
					? ((SubLObject) (ask_utilities.query_variable($SET, list($$implies, list($$isa, $sym29$_X, v_term), listS($$irExpansionCandidate, $sym29$_X, strategy, $list_alt31)), listS($$MtSpace, mt, $list_alt33),
							list(new SubLObject[] { $MAX_TRANSFORMATION_DEPTH, ONE_INTEGER, $MAX_NUMBER, max_number, $ANSWER_LANGUAGE, $HL, $kw36$CONDITIONAL_SENTENCE_, T, $CONTINUABLE_, NIL, $BROWSABLE_, NIL, $MAX_TIME, max_time }))))
					: ask_utilities.query_variable($SET, listS($$irExpansionCandidate, v_term, strategy, $list_alt31), listS($$MtSpace, mt, $list_alt33), list(new SubLObject[] { $MAX_TRANSFORMATION_DEPTH, ONE_INTEGER, $MAX_NUMBER, max_number, $ANSWER_LANGUAGE, $HL, $CONTINUABLE_, NIL, $BROWSABLE_, NIL, $MAX_TIME, max_time }));
			relevant_results = rkf_relevance_utilities.rkf_filter_irrelevant_terms(results, mt);
			return relevant_results;
		}
	}

	/**
	 *
	 *
	 * @return list; a list of alternate English phrases for TERM, not including KNOWN-PHRASE
	 */
	public static final SubLObject alternate_phrases(SubLObject v_term, SubLObject known_phrase, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			SubLTrampolineFile.checkType(v_term, CYCL_EXPRESSION_P);
			SubLTrampolineFile.checkType(known_phrase, STRINGP);
			SubLTrampolineFile.checkType(mt, MICROTHEORY_P);
			{
				SubLObject result = NIL;
				SubLObject weights = NIL;
				{
					SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
					try {
						lexicon_vars.$lexicon_lookup_mt$.bind(mt, thread);
						result = remove(known_phrase, pph_methods_lexicon.all_phrases_for_term(narts_high.nart_substitute(v_term), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED_SYM), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
						weights = make_list(length(result), $float$0_8);
					} finally {
						lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
					}
				}
				return values(result, weights);
			}
		}
	}

	/**
	 * given a TermMentionedInDialog, see what other phrases we have that could refer to said TermMentionedInDialog
	 */
	public static final SubLObject alt_phrase_expansions_for_peg(SubLObject peg, SubLObject profile_mt, SubLObject session_mt, SubLObject mt, SubLObject max_num) {
		if (mt == UNPROVIDED) {
			mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
		}
		if (max_num == UNPROVIDED) {
			max_num = NIL;
		}
		{
			SubLObject v_term = get_intended_referent_for_term(peg, session_mt);
			SubLObject known_phrase = mention_string(peg, session_mt);
			if (NIL == known_phrase) {
				known_phrase = $str_alt52$;
			}
			return alternate_phrases(v_term, known_phrase, mt);
		}
	}

	public static final SubLObject mention_string(SubLObject v_term, SubLObject mt) {
		return ask_utilities.query_variable($STRING, listS($$originalPhrase, v_term, $list_alt58), mt, UNPROVIDED).first();
	}

	public static final SubLObject get_terms_learned_this_session(SubLObject session_mt) {
		return ask_utilities.query_variable($TERM, list($$and, listS($$ist, session_mt, $list_alt62), list($$definingMt, $TERM, session_mt)), session_mt, $list_alt64);
	}

	public static final SubLObject get_interaction_emotions_learned_this_session(SubLObject session_mt) {
		return ask_utilities.ask_variable($INTERACTIONS, listS($$ist_Asserted, session_mt, $list_alt67), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	/**
	 *
	 *
	 * @param SESSION-MT
	 * 		the session to wipe
	 */
	public static final SubLObject wipe_session_mt_contents(SubLObject session_mt) {
		SubLTrampolineFile.checkType(session_mt, POSSIBLY_HLMT_P);
		{
			SubLObject cdolist_list_var = get_terms_learned_this_session(session_mt);
			SubLObject v_term = NIL;
			for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), v_term = cdolist_list_var.first()) {
				ke.ke_kill_now(v_term);
			}
		}
		{
			SubLObject cdolist_list_var = get_interaction_emotions_learned_this_session(session_mt);
			SubLObject interaction_emotions = NIL;
			for (interaction_emotions = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), interaction_emotions = cdolist_list_var.first()) {
				ke.ke_kill_now(narts_high.find_nart(interaction_emotions));
			}
		}
		return session_mt;
	}

	// defparameter
	private static final SubLSymbol $mys_default_expansion_weight$ = makeSymbol("*MYS-DEFAULT-EXPANSION-WEIGHT*");

	public static final SubLObject expansions_of_type_for_peg(SubLObject expansion_type, SubLObject peg_cycl, SubLObject profile_mt, SubLObject session_mt, SubLObject generation_mt, SubLObject max_number, SubLObject instantiate_collectionsP) {
		if (max_number == UNPROVIDED) {
			max_number = get_max_expansions_per_module();
		}
		if (instantiate_collectionsP == UNPROVIDED) {
			instantiate_collectionsP = NIL;
		}
		{
			SubLObject weights = NIL;
			SubLObject expansion_phrases = NIL;
			SubLObject expansion_cycls = NIL;
			SubLObject strategy = mys_get_expansion_function_for_type(expansion_type);
			SubLObject referent = get_intended_referent_for_term(peg_cycl, session_mt);
			if (NIL == referent) {
				mysentient_utilities.myselog_error(cconcatenate($str_alt74$Can_t_provide_expansions_for_, new SubLObject[] { format_nil.format_nil_s_no_copy(peg_cycl), $str_alt75$_because_I_got_a_null_referent }));
			} else {
				if (strategy.isFunctionSpec()) {
					return funcall(strategy, referent, profile_mt, session_mt, generation_mt, max_number);
				}
				{
					SubLObject expansions = (NIL != forts.fort_p(strategy)) ? ((SubLObject) (expansion_cycls_for_strategy(referent, strategy, session_mt, max_number, instantiate_collectionsP, UNPROVIDED))) : NIL;
					SubLObject useful_expansions = (max_number.isInteger()) ? ((SubLObject) (list_utilities.first_n(max_number, cardinality_estimates.sort_by_generality_estimate(expansions, UNPROVIDED)))) : cardinality_estimates.sort_by_generality_estimate(expansions, UNPROVIDED);
					SubLObject cdolist_list_var = useful_expansions;
					SubLObject expansion = NIL;
					for (expansion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), expansion = cdolist_list_var.first()) {
						{
							SubLObject expansion_phrase = mys_expansion_phrase(expansion, generation_mt);
							if (NIL != expansion_phrase) {
								weights = cons(myse_generality_estimate(expansion), weights);
								expansion_phrases = cons(expansion_phrase, expansion_phrases);
								expansion_cycls = cons(expansion, expansion_cycls);
							}
						}
					}
				}
			}
			return values(nreverse(expansion_phrases), nreverse(weights), nreverse(expansion_cycls));
		}
	}

	/**
	 *
	 *
	 * @return STRINGP or NIL - An NL phrase for EXPANSION.
	 */
	public static final SubLObject mys_expansion_phrase(SubLObject expansion, SubLObject generation_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject phrase = NIL;
				SubLObject demerit_cutoff = TWO_INTEGER;
				SubLObject nl_preds = $DEFAULT;
				SubLObject force = pph_utilities.pph_default_force_for_term(expansion);
				if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_macros.valid_pph_demerit_cutoff_p(demerit_cutoff)))) {
					{
						SubLObject new_format_string = cconcatenate($str_alt77$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt78$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(demerit_cutoff), new SubLObject[] { $str_alt79$_is_not_a_, format_nil.format_nil_s_no_copy(VALID_PPH_DEMERIT_CUTOFF_P) })) });
						pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
					}
				}
				{
					SubLObject _prev_bind_0 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
					try {
						pph_vars.$pph_demerit_cutoff$.bind(demerit_cutoff, thread);
						phrase = pph_main.generate_text_wXsentential_force(expansion, force, nl_preds, generation_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					} finally {
						pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0, thread);
					}
				}
				return phrase;
			}
		}
	}

	public static final SubLObject get_expansion_strategy_strings(SubLObject session_mt) {
		if (session_mt == UNPROVIDED) {
			session_mt = $$MySentientUPMMt;
		}
		return Mapping.mapcar(FIRST, mys_expansion_strategies(session_mt));
	}

	public static final SubLObject mys_expansion_strategies(SubLObject session_mt) {
		return mys_expansion_strategies_cached(session_mt);
	}

	public static final SubLObject clear_mys_expansion_strategies_cached() {
		{
			SubLObject cs = $mys_expansion_strategies_cached_caching_state$.getGlobalValue();
			if (NIL != cs) {
				memoization_state.caching_state_clear(cs);
			}
		}
		return NIL;
	}

	public static final SubLObject remove_mys_expansion_strategies_cached(SubLObject session_mt) {
		return memoization_state.caching_state_remove_function_results_with_args($mys_expansion_strategies_cached_caching_state$.getGlobalValue(), list(session_mt), UNPROVIDED, UNPROVIDED);
	}

	public static final SubLObject mys_expansion_strategies_cached_internal(SubLObject session_mt) {
		{
			SubLObject sentence = kb_query.kbq_sentence($const86$MySe_FindValidExpansionStrategies);
			SubLObject v_properties = inference_parameters.explicify_inference_engine_query_property_defaults(kb_query.kbq_query_properties($const86$MySe_FindValidExpansionStrategies));
			return ask_utilities.query_template($list_alt87, sentence, session_mt, v_properties);
		}
	}

	public static final SubLObject mys_expansion_strategies_cached(SubLObject session_mt) {
		{
			SubLObject caching_state = $mys_expansion_strategies_cached_caching_state$.getGlobalValue();
			if (NIL == caching_state) {
				caching_state = memoization_state.create_global_caching_state_for_name(MYS_EXPANSION_STRATEGIES_CACHED, $mys_expansion_strategies_cached_caching_state$, NIL, EQ, ONE_INTEGER, ZERO_INTEGER);
			}
			{
				SubLObject results = memoization_state.caching_state_lookup(caching_state, session_mt, $kw10$_MEMOIZED_ITEM_NOT_FOUND_);
				if (results == $kw10$_MEMOIZED_ITEM_NOT_FOUND_) {
					results = arg2(resetMultipleValues(), multiple_value_list(mys_expansion_strategies_cached_internal(session_mt)));
					memoization_state.caching_state_put(caching_state, session_mt, results, UNPROVIDED);
				}
				return memoization_state.caching_results(results);
			}
		}
	}

	public static final SubLObject get_all_expansion_strategy_strings(SubLObject session_mt) {
		if (session_mt == UNPROVIDED) {
			session_mt = $$MySentientUPMMt;
		}
		return Mapping.mapcar(FIRST, mys_all_expansion_strategies(session_mt));
	}

	public static final SubLObject mys_all_expansion_strategies(SubLObject session_mt) {
		{
			SubLObject query = (NIL != constants_high.find_constant($str_alt91$MySe_FindAllPossibleExpansionStra)) ? ((SubLObject) ($const92$MySe_FindAllPossibleExpansionStra)) : $const86$MySe_FindValidExpansionStrategies;
			SubLObject sentence = kb_query.kbq_sentence(query);
			SubLObject v_properties = inference_parameters.explicify_inference_engine_query_property_defaults(kb_query.kbq_query_properties(query));
			return ask_utilities.query_template($list_alt87, sentence, session_mt, v_properties);
		}
	}

	// defparameter
	private static final SubLSymbol $expansion_strategy_map$ = makeSymbol("*EXPANSION-STRATEGY-MAP*");

	public static final SubLObject mys_get_expansion_function_for_type(SubLObject expansion_type) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return list_utilities.alist_lookup($expansion_strategy_map$.getDynamicValue(thread), expansion_type, EQUALP, UNPROVIDED);
		}
	}

	// defparameter
	private static final SubLSymbol $mys_max_expansion_count_total$ = makeSymbol("*MYS-MAX-EXPANSION-COUNT-TOTAL*");

	// defparameter
	private static final SubLSymbol $mys_expansion_module_count$ = makeSymbol("*MYS-EXPANSION-MODULE-COUNT*");

	public static final SubLObject set_mys_max_expansion_count_total(SubLObject num) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			$mys_max_expansion_count_total$.setDynamicValue(num, thread);
			return $mys_max_expansion_count_total$.getDynamicValue(thread);
		}
	}

	public static final SubLObject get_max_expansions_per_module() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return integerDivide($mys_max_expansion_count_total$.getDynamicValue(thread), $mys_expansion_module_count$.getDynamicValue(thread));
		}
	}

	// defparameter
	private static final SubLSymbol $max_generality_estimate$ = makeSymbol("*MAX-GENERALITY-ESTIMATE*");

	public static final SubLObject max_generality_estimate() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == $max_generality_estimate$.getDynamicValue(thread)) {
				$max_generality_estimate$.setDynamicValue(cardinality_estimates.generality_estimate($$Thing), thread);
			}
			return $max_generality_estimate$.getDynamicValue(thread);
		}
	}

	public static final SubLObject myse_generality_estimate(SubLObject v_term) {
		return subtract(ONE_INTEGER, divide(log(number_utilities.f_1X(cardinality_estimates.generality_estimate(v_term)), UNPROVIDED), log(number_utilities.f_1X(max_generality_estimate()), UNPROVIDED)));
	}

	/**
	 *
	 *
	 * @param USEFUL-SEMANTICS:
	 * 		a constant or nat which represents the (resolved) parser output which determines the referent of expr-peg.
	 */
	public static final SubLObject assign_np_referent(SubLObject expr_peg, SubLObject useful_semantics, SubLObject np_string, SubLObject profile_mt, SubLObject session_mt, SubLObject parsing_mt) {
		{
			SubLObject referent = NIL;
			SubLObject known_facts = NIL;
			SubLObject intended_referent_facts = NIL;
			if (NIL != cyc_kernel.closed_query_success_result_p(inference_kernel.new_cyc_query(list($$and, list($$unknownSentence, listS($$isa, parsing_utilities.strip_nl_tags(useful_semantics, UNPROVIDED), $list_alt97)), list($$unknownSentence, listS($$isa, parsing_utilities.strip_nl_tags(useful_semantics, UNPROVIDED), $list_alt98))), session_mt, UNPROVIDED))) {
				known_facts = rkf_formula_optimizer.rkf_reformulate_into_many(list($$naiveReferent, expr_peg, useful_semantics), session_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				referent = useful_semantics;
				intended_referent_facts = cycl_utilities.expression_subst($$intendedReferent, $$naiveReferent, known_facts, UNPROVIDED, UNPROVIDED);
			} else if (NIL != plural_semanticsP(useful_semantics)) {
			} else {
				referent = mysentient_utilities.myse_create(cconcatenate(np_string, $str_alt99$_referentPeg), UNPROVIDED, UNPROVIDED, UNPROVIDED);
				mysentient_utilities.myse_assert_wff_now(listS($$isa, referent, $list_alt100), session_mt);
				if ((NIL != useful_semantics) && (NIL == cyc_kernel.closed_query_success_result_p(inference_kernel.new_cyc_query(list($$operatorFormulas, $$PronounFn, parsing_utilities.strip_nl_tags(useful_semantics, UNPROVIDED)), session_mt, UNPROVIDED)))) {
					known_facts = rkf_formula_optimizer.rkf_reformulate_into_many(list($$isa, referent, useful_semantics), session_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				}
				mysentient_utilities.myse_assert_wff_now(list($$definingMt, referent, session_mt), $$BaseKB);
				mysentient_utilities.myse_assert_wff_now(list($$userProfileForPeg, referent, profile_mt), session_mt);
				mysentient_utilities.myse_assert_with_implicature_now(list($$naiveReferent, expr_peg, referent), session_mt, T);
			}

			if (NIL != known_facts) {
				my_sent_assert_complex_sentence_with_implicature(parsing_utilities.strip_nl_tags(known_facts.first(), UNPROVIDED), session_mt, T);
			}
			if (NIL != intended_referent_facts) {
				my_sent_assert_complex_sentence_with_implicature(intended_referent_facts.first(), session_mt, T);
			}
			mysentient_utilities.myse_assert_with_implicature_now(list($$referentRepresentationComplete, referent), session_mt, T);
			return referent;
		}
	}

	/**
	 *
	 *
	 * @param NEW-SEMANTICS
	 * 		cycl-denotational-term-p; a clarified semantic meaning for expr-peg
	 */
	public static final SubLObject clarify_np_reference(SubLObject expr_peg, SubLObject new_semantics, SubLObject profile_mt, SubLObject session_mt, SubLObject parsing_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject old_semantics = ask_utilities.query_variable($PARSE, listS($$parseTermForPeg, expr_peg, $list_alt111), session_mt, $list_alt112).first();
				SubLObject old_referent = ask_utilities.query_variable($REF, listS($$naiveReferent, expr_peg, $list_alt114), session_mt, $list_alt112).first();
				SubLObject user = user_from_profile_mt(profile_mt);
				SubLObject np_string = ask_utilities.query_variable($STRING, listS($$originalPhrase, expr_peg, $list_alt58), session_mt, $list_alt112).first();
				SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
				{
					SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
					SubLObject _prev_bind_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
					SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
					try {
						sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
						sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
						sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
						{
							SubLObject useful_semantics = rkf_formula_optimizer.replace_first_person_pronouns_in_cycl(cycl_utilities.hl_to_el(new_semantics), user);
							SubLObject coreferents = ask_utilities.query_variable($COREF, list($$and, listS($$coreferentExpressions, expr_peg, $list_alt117), list($$moreRecentInDiscourseThan, $COREF, expr_peg)), session_mt, $list_alt5);
							if (old_semantics != new_semantics) {
								mysentient_utilities.myse_unassert(list($$naiveReferent, expr_peg, old_referent), session_mt);
								mysentient_utilities.myse_unassert(list($$anaphoraReasoningComplete, expr_peg), session_mt);
								mysentient_utilities.myse_unassert(list($$expressionRepresentationComplete, expr_peg), session_mt);
								assign_np_referent(expr_peg, useful_semantics, np_string, profile_mt, session_mt, parsing_mt);
								mysentient_utilities.myse_assert_wff_now(list($$clarifiedParseTermForPeg, expr_peg, new_semantics), session_mt);
								mysentient_utilities.myse_assert_wff_now(list($$expressionRepresentationComplete, expr_peg), session_mt);
								mysentient_utilities.myse_assert_wff_now(list($$anaphoraReasoningComplete, expr_peg), session_mt);
								{
									SubLObject cdolist_list_var = coreferents;
									SubLObject prior_coref = NIL;
									for (prior_coref = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), prior_coref = cdolist_list_var.first()) {
										{
											SubLObject arc_assert = ask_utilities.query_variable($ASSERTION, list($$assertionSentence, $ASSERTION, list($$anaphoraReasoningComplete, prior_coref)), session_mt, $list_alt112).first();
											SubLObject erc_assert = ask_utilities.query_variable($ASSERTION, list($$assertionSentence, $ASSERTION, list($$expressionRepresentationComplete, prior_coref)), session_mt, $list_alt112).first();
											forward.repropagate_forward_assertion(arc_assert);
											forward.repropagate_forward_assertion(erc_assert);
										}
									}
								}
							}
						}
					} finally {
						sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
						sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1, thread);
						sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
					}
				}
				return expr_peg;
			}
		}
	}

	// defparameter
	private static final SubLSymbol $mys_treat_indefinite_nps_as_nbars$ = makeSymbol("*MYS-TREAT-INDEFINITE-NPS-AS-NBARS*");

	// defparameter
	private static final SubLSymbol $mys_treat_all_nps_as_nbars$ = makeSymbol("*MYS-TREAT-ALL-NPS-AS-NBARS*");

	// defparameter
	private static final SubLSymbol $mys_treat_definite_nps_as_nbars$ = makeSymbol("*MYS-TREAT-DEFINITE-NPS-AS-NBARS*");

	/**
	 * Conditionalize when we treat  NPs as anaphoric
	 */
	public static final SubLObject note_np_reference(SubLObject np_string, SubLObject raw_semantics, SubLObject profile_mt, SubLObject session_mt, SubLObject parsing_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject user = user_from_profile_mt(profile_mt);
				SubLObject resolved_semantics = rkf_formula_optimizer.replace_first_person_pronouns_in_cycl(cycl_utilities.hl_to_el(raw_semantics), user);
				if (NIL != $mys_treat_all_nps_as_nbars$.getDynamicValue(thread)) {
					return note_nbar_reference(np_string, resolved_semantics, profile_mt, session_mt, parsing_mt);
				} else if ((NIL != $mys_treat_indefinite_nps_as_nbars$.getDynamicValue(thread)) && (NIL != indefinite_referenceP(resolved_semantics.first()))) {
					return note_nbar_reference(np_string, resolved_semantics, profile_mt, session_mt, parsing_mt);
				} else if ((NIL != $mys_treat_definite_nps_as_nbars$.getDynamicValue(thread)) && (NIL != definite_referenceP(resolved_semantics.first()))) {
					return note_nbar_reference(np_string, resolved_semantics, profile_mt, session_mt, parsing_mt);
				} else {
					return note_np_reference_int(np_string, raw_semantics, resolved_semantics, user, profile_mt, session_mt, parsing_mt);
				}

			}
		}
	}

	/**
	 *
	 *
	 * @param RAW-SEMANTICS
	 * 		listp; a list of semantic meanings for NP-STRING
	 */
	public static final SubLObject note_np_reference_int(SubLObject np_string, SubLObject raw_semantics, SubLObject resolved_semantics, SubLObject user, SubLObject profile_mt, SubLObject session_mt, SubLObject parsing_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject expression_peg = NIL;
				SubLObject peg_number = next_peg_id_for_session(session_mt);
				SubLObject session = mys_session_from_session_mt(session_mt);
				SubLObject allowed_forward_rules = mysentient_creation_template_allowable_rules($const130$MySentientNonAnaphoricPegCreation);
				if (NIL == allowed_forward_rules) {
					allowed_forward_rules = $ALL;
				}
				{
					SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
					try {
						kb_control_vars.$forward_inference_allowed_rules$.bind(allowed_forward_rules, thread);
						{
							SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
							{
								SubLObject _prev_bind_0_1 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
								SubLObject _prev_bind_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
								SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
								try {
									sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
									sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
									sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
									{
										SubLObject preferred_semantics = resolved_semantics.first();
										expression_peg = mysentient_utilities.myse_create(cconcatenate(np_string, $str_alt132$_expressionPeg), UNPROVIDED, UNPROVIDED, UNPROVIDED);
										mysentient_utilities.myse_assert_wff_now(listS($$isa, expression_peg, $list_alt133), session_mt);
										assign_np_referent(expression_peg, preferred_semantics, np_string, profile_mt, session_mt, parsing_mt);
										mysentient_utilities.myse_assert_wff_now(list($$definingMt, expression_peg, session_mt), $$BaseKB);
										mysentient_utilities.myse_assert_wff_now(list($$userProfileForPeg, expression_peg, profile_mt), session_mt);
										mysentient_utilities.myse_assert_wff_now(list($$mentionedBy, expression_peg, user), session_mt);
										mysentient_utilities.myse_assert_wff_now(list($$originalPhrase, expression_peg, np_string), session_mt);
										{
											SubLObject list_var = NIL;
											SubLObject parse_term = NIL;
											SubLObject parse_rank = NIL;
											for (list_var = raw_semantics, parse_term = list_var.first(), parse_rank = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), parse_term = list_var.first(), parse_rank = add(ONE_INTEGER, parse_rank)) {
												mysentient_utilities.myse_assert_wff_now(list($$possibleParseTermForPeg, expression_peg, parse_term), session_mt);
												mysentient_utilities.myse_assert_wff_now(list($$rankedParseTermForPeg, expression_peg, parse_term, parse_rank), session_mt);
											}
										}
										mysentient_utilities.myse_assert_wff_now(list($$nthExpressionOfSession, session, expression_peg, peg_number), session_mt);
										mysentient_utilities.myse_assert_wff_now(list($$expressionRepresentationComplete, expression_peg), session_mt);
										mysentient_utilities.myse_assert_wff_now(list($$anaphoraReasoningComplete, expression_peg), session_mt);
									}
								} finally {
									sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
									sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1, thread);
									sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_1, thread);
								}
							}
						}
					} finally {
						kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
					}
				}
				return expression_peg;
			}
		}
	}

	/**
	 *
	 *
	 * @param RAW-SEMANTICS
	 * 		listp; a list of semantic meanings for NBAR-STRING
	 */
	public static final SubLObject note_nbar_reference(SubLObject nbar_string, SubLObject raw_semantics, SubLObject profile_mt, SubLObject session_mt, SubLObject parsing_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject expression_peg = NIL;
				SubLObject peg_number = next_peg_id_for_session(session_mt);
				SubLObject session = mys_session_from_session_mt(session_mt);
				SubLObject allowed_forward_rules = mysentient_creation_template_allowable_rules($const130$MySentientNonAnaphoricPegCreation);
				if (NIL == allowed_forward_rules) {
					allowed_forward_rules = $ALL;
				}
				{
					SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
					try {
						kb_control_vars.$forward_inference_allowed_rules$.bind(allowed_forward_rules, thread);
						{
							SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
							{
								SubLObject _prev_bind_0_2 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
								SubLObject _prev_bind_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
								SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
								try {
									sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
									sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
									sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
									{
										SubLObject user = user_from_profile_mt(profile_mt);
										expression_peg = mysentient_utilities.myse_create(cconcatenate(nbar_string, $str_alt141$_ExpPeg), UNPROVIDED, UNPROVIDED, UNPROVIDED);
										mysentient_utilities.myse_assert_wff_now(listS($$isa, expression_peg, $list_alt142), session_mt);
										mysentient_utilities.myse_assert_wff_now(list($$definingMt, expression_peg, session_mt), $$BaseKB);
										mysentient_utilities.myse_assert_wff_now(list($$userProfileForPeg, expression_peg, profile_mt), session_mt);
										mysentient_utilities.myse_assert_wff_now(list($$mentionedBy, expression_peg, user), session_mt);
										mysentient_utilities.myse_assert_wff_now(list($$originalPhrase, expression_peg, nbar_string), session_mt);
										{
											SubLObject list_var = NIL;
											SubLObject parse_term = NIL;
											SubLObject parse_rank = NIL;
											for (list_var = raw_semantics, parse_term = list_var.first(), parse_rank = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), parse_term = list_var.first(), parse_rank = add(ONE_INTEGER, parse_rank)) {
												mysentient_utilities.myse_assert_wff_now(list($$possibleParseTermForPeg, expression_peg, parse_term), session_mt);
												mysentient_utilities.myse_assert_wff_now(list($$rankedParseTermForPeg, expression_peg, parse_term, parse_rank), session_mt);
											}
										}
										mysentient_utilities.myse_assert_wff_now(list($$nthExpressionOfSession, session, expression_peg, peg_number), session_mt);
										mysentient_utilities.myse_assert_wff_now(list($$expressionRepresentationComplete, expression_peg), session_mt);
									}
								} finally {
									sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
									sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1, thread);
									sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_2, thread);
								}
							}
						}
					} finally {
						kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
					}
				}
				return expression_peg;
			}
		}
	}

	/**
	 *
	 *
	 * @param RAW-SEMANTICS
	 * 		listp; a list of semantic meanings for VERB-STRING
	 */
	public static final SubLObject note_verb_reference(SubLObject verb_string, SubLObject raw_semantics, SubLObject profile_mt, SubLObject session_mt, SubLObject parsing_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject expression_peg = NIL;
				SubLObject peg_number = next_peg_id_for_session(session_mt);
				SubLObject session = mys_session_from_session_mt(session_mt);
				SubLObject allowed_forward_rules = mysentient_creation_template_allowable_rules($const130$MySentientNonAnaphoricPegCreation);
				if (NIL == allowed_forward_rules) {
					allowed_forward_rules = $ALL;
				}
				{
					SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
					try {
						kb_control_vars.$forward_inference_allowed_rules$.bind(allowed_forward_rules, thread);
						{
							SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
							{
								SubLObject _prev_bind_0_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
								SubLObject _prev_bind_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
								SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
								try {
									sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
									sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
									sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
									{
										SubLObject user = user_from_profile_mt(profile_mt);
										expression_peg = mysentient_utilities.myse_create(cconcatenate(verb_string, $str_alt141$_ExpPeg), UNPROVIDED, UNPROVIDED, UNPROVIDED);
										mysentient_utilities.myse_assert_wff_now(listS($$isa, expression_peg, $list_alt146), session_mt);
										mysentient_utilities.myse_assert_wff_now(list($$definingMt, expression_peg, session_mt), $$BaseKB);
										mysentient_utilities.myse_assert_wff_now(list($$userProfileForPeg, expression_peg, profile_mt), session_mt);
										mysentient_utilities.myse_assert_wff_now(list($$mentionedBy, expression_peg, user), session_mt);
										mysentient_utilities.myse_assert_wff_now(list($$originalPhrase, expression_peg, verb_string), session_mt);
										{
											SubLObject list_var = NIL;
											SubLObject parse_term = NIL;
											SubLObject parse_rank = NIL;
											for (list_var = raw_semantics, parse_term = list_var.first(), parse_rank = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), parse_term = list_var.first(), parse_rank = add(ONE_INTEGER, parse_rank)) {
												mysentient_utilities.myse_assert_wff_now(list($$possibleParseTermForPeg, expression_peg, parse_term), session_mt);
												mysentient_utilities.myse_assert_wff_now(list($$rankedParseTermForPeg, expression_peg, parse_term, parse_rank), session_mt);
											}
										}
										mysentient_utilities.myse_assert_wff_now(list($$nthExpressionOfSession, session, expression_peg, peg_number), session_mt);
										mysentient_utilities.myse_assert_wff_now(list($$expressionRepresentationComplete, expression_peg), session_mt);
									}
								} finally {
									sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
									sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1, thread);
									sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_3, thread);
								}
							}
						}
					} finally {
						kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
					}
				}
				return expression_peg;
			}
		}
	}

	/**
	 *
	 *
	 * @param RAW-SEMANTICS
	 * 		listp; a list of semantic meanings for UTTERANCE-STRING
	 */
	public static final SubLObject note_utterance_reference(SubLObject utterance_string, SubLObject force, SubLObject raw_semantics, SubLObject profile_mt, SubLObject session_mt, SubLObject parsing_mt, SubLObject sub_pegs) {
		if (sub_pegs == UNPROVIDED) {
			sub_pegs = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject expression_peg = NIL;
				SubLObject info_transfer = NIL;
				SubLObject peg_number = next_peg_id_for_session(session_mt);
				SubLObject session = mys_session_from_session_mt(session_mt);
				SubLObject force_cycl = mys_cycl_for_force(force);
				SubLObject user = user_from_profile_mt(profile_mt);
				SubLObject semantics = rkf_formula_optimizer.replace_first_person_pronouns_in_cycl(cycl_utilities.hl_to_el(raw_semantics), user);
				SubLObject allowed_forward_rules = mysentient_creation_template_allowable_rules($const130$MySentientNonAnaphoricPegCreation);
				if (NIL == allowed_forward_rules) {
					allowed_forward_rules = $ALL;
				}
				{
					SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
					try {
						kb_control_vars.$forward_inference_allowed_rules$.bind(allowed_forward_rules, thread);
						{
							SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
							{
								SubLObject _prev_bind_0_4 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
								SubLObject _prev_bind_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
								SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
								try {
									sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
									sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
									sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
									{
										SubLObject user_5 = user_from_profile_mt(profile_mt);
										expression_peg = mysentient_utilities.myse_create(cconcatenate(utterance_string, $str_alt141$_ExpPeg), UNPROVIDED, UNPROVIDED, UNPROVIDED);
										info_transfer = list($$InfoTransferEventForPegFn, expression_peg);
										mysentient_utilities.myse_assert_wff_now(listS($$isa, expression_peg, $list_alt151), session_mt);
										mysentient_utilities.myse_assert_wff_now(list($$definingMt, expression_peg, session_mt), $$BaseKB);
										mysentient_utilities.myse_assert_wff_now(list($$userProfileForPeg, expression_peg, profile_mt), session_mt);
										mysentient_utilities.myse_assert_wff_now(list($$properSubEvents, session, info_transfer), session_mt);
										mysentient_utilities.myse_assert_wff_now(listS($$nthSubSituationOfType, info_transfer, session, next_question_number_for_session(session_mt), $list_alt154), session_mt);
										mysentient_utilities.myse_assert_wff_now(listS($$isa, info_transfer, $list_alt154), session_mt);
										mysentient_utilities.myse_assert_wff_now(list($$mentionedBy, expression_peg, user_5), session_mt);
										mysentient_utilities.myse_assert_wff_now(list($$originalPhrase, expression_peg, utterance_string), session_mt);
										{
											SubLObject list_var = NIL;
											SubLObject parse_term = NIL;
											SubLObject parse_rank = NIL;
											for (list_var = semantics, parse_term = list_var.first(), parse_rank = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), parse_term = list_var.first(), parse_rank = add(ONE_INTEGER, parse_rank)) {
												mysentient_utilities.myse_assert_wff_now(list($$possibleParseTermForPeg, expression_peg, parse_term), session_mt);
												mysentient_utilities.myse_assert_wff_now(list($$rankedParseTermForPeg, expression_peg, parse_term, parse_rank), session_mt);
											}
										}
										mysentient_utilities.myse_assert_wff_now(list($$nthExpressionOfSession, session, expression_peg, peg_number), session_mt);
										mysentient_utilities.myse_assert_wff_now(list($$pegCorrespondsToInfoTransfer, expression_peg, info_transfer), session_mt);
										if (NIL != forts.fort_p(force_cycl)) {
											mysentient_utilities.myse_assert_wff_now(list($$iteIllocutionaryForce, info_transfer, force_cycl), session_mt);
										}
										mysentient_utilities.myse_assert_wff_now(listS($$sourceOfTerm, list($$ist, session_mt, list($$iteIllocutionaryForce, info_transfer, force_cycl)), $list_alt158), $$BookkeepingMt);
									}
								} finally {
									sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
									sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1, thread);
									sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_4, thread);
								}
							}
						}
					} finally {
						kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
					}
				}
				return expression_peg;
			}
		}
	}

	/**
	 *
	 *
	 * @param RAW-SEMANTICS
	 * 		listp; a list of semantic meanings for UTTERANCE-STRING
	 */
	public static final SubLObject note_pos_reference(SubLObject utterance_string, SubLObject pos_string, SubLObject raw_semantics, SubLObject profile_mt, SubLObject session_mt, SubLObject parsing_mt, SubLObject sub_pegs) {
		if (sub_pegs == UNPROVIDED) {
			sub_pegs = NIL;
		}
		{
			SubLObject result = NIL;
			if (NIL != string_utilities.starts_with(pos_string, $$$VB)) {
				result = note_verb_reference(utterance_string, raw_semantics, profile_mt, session_mt, parsing_mt);
			} else if (pos_string.equalp($$$S)) {
				result = note_utterance_reference(utterance_string, $QUERY, raw_semantics, profile_mt, session_mt, parsing_mt, sub_pegs);
			} else if (pos_string.equalp($$$CN) || pos_string.equalp($$$NN)) {
				result = note_nbar_reference(utterance_string, raw_semantics, profile_mt, session_mt, parsing_mt);
			} else {
				result = NIL;
			}

			return result;
		}
	}

	/**
	 *
	 */
	public static final SubLObject assert_peg_dependencies(SubLObject parent_peg, SubLObject child_pegs, SubLObject mt) {
		SubLTrampolineFile.checkType(parent_peg, FORT_P);
		SubLTrampolineFile.checkType(child_pegs, LISTP);
		{
			SubLObject successP = T;
			SubLObject cdolist_list_var = child_pegs;
			SubLObject child_peg = NIL;
			for (child_peg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), child_peg = cdolist_list_var.first()) {
				if (NIL == mysentient_utilities.myse_assert_wff_now(list($$properSubExpressions, parent_peg, child_peg), mt)) {
					successP = NIL;
				}
			}
			if (NIL == mysentient_utilities.myse_assert_wff_now(list($$expressionRepresentationComplete, parent_peg), mt)) {
				successP = NIL;
			}
			return successP;
		}
	}

	public static final SubLObject mys_cycl_for_force(SubLObject force) {
		{
			SubLObject pcase_var = force;
			if (pcase_var.eql($QUERY)) {
				return $$Query;
			} else if (pcase_var.eql($STATEMENT)) {
				return $$Inform;
			} else {
				return $UNKNOWN;
			}

		}
	}

	/**
	 * Get the most recent utterance peg.
	 */
	public static final SubLObject get_most_recent_utterance_peg(SubLObject session, SubLObject session_mt) {
		SubLTrampolineFile.checkType(session_mt, POSSIBLY_HLMT_P);
		{
			SubLObject peg_sets = ask_utilities.query_template($list_alt181, list($$and, $list_alt182, listS($$nthExpressionOfSession, session, $list_alt181)), session_mt, UNPROVIDED);
			SubLObject latest_peg_set = Sort.sort(peg_sets, symbol_function($sym183$_), symbol_function(SECOND)).first();
			return latest_peg_set.first();
		}
	}

	/**
	 * perform any necessary cleanup to the user-profile, based on its session.
	 * Currently, this is used to promote possible antecedents into the user profile.
	 */
	public static final SubLObject mys_upm_cleanup(SubLObject session_mt) {
		return NIL;
	}

	/**
	 *
	 *
	 * @param ASSERT-SENTENCE
	 * 		cycl-sentence-p; a sentence that contains a fact that the user has agreed is true
	 * @param PROFILE-MT
	 * 		hlmt-p
	 * @unknown should all these facts really go in the profile Mt, or are they (or some of them) more properly session based?
	 */
	public static final SubLObject add_user_approved_fact(SubLObject assert_sentence, SubLObject profile_mt) {
		SubLTrampolineFile.checkType(assert_sentence, $sym191$CYCL_SENTENCE_ASSERTIBLE_);
		SubLTrampolineFile.checkType(profile_mt, HLMT_P);
		return my_sent_assert_complex_sentence_with_implicature(assert_sentence, profile_mt, T);
	}

	/**
	 * If a user agrees to assert something, they're not completely disgusted with the system, so assume they're slightly happy
	 */
	public static final SubLObject learn_happiness_from_user_assertion(SubLObject user, SubLObject session_mt) {
		SubLTrampolineFile.checkType(user, FORT_P);
		SubLTrampolineFile.checkType(session_mt, HLMT_P);
		return mysentient_utilities.myse_assert_wff_now(listS($$feelsTowardsObject_Ternary, user, list($$NthInteractionOfSessionFn, $$MySeAnswersSession_JaneDoe_001, next_mys_interaction_number(user, session_mt)), $list_alt200), session_mt);
	}

	/**
	 *
	 *
	 * @param MSG-TYPE
	 * 		keywordp; either :approve or :disapprove
	 * @param USER
	 * 		fort-p
	 * @param SESSION-MT
	 * 		hlmt-p
	 */
	public static final SubLObject learn_happiness_from_user_approval(SubLObject msg_type, SubLObject user, SubLObject session_mt) {
		SubLTrampolineFile.checkType(msg_type, KEYWORDP);
		SubLTrampolineFile.checkType(user, FORT_P);
		SubLTrampolineFile.checkType(session_mt, HLMT_P);
		{
			SubLObject pcase_var = msg_type;
			if (pcase_var.eql($APPROVE)) {
				return mysentient_utilities.myse_assert_wff_now(listS($$feelsTowardsObject_Ternary, user, list($$NthInteractionOfSessionFn, $$MySeAnswersSession_JaneDoe_001, next_mys_interaction_number(user, session_mt)), $list_alt207), session_mt);
			} else if (pcase_var.eql($DISAPPROVE)) {
				return mysentient_utilities.myse_assert_wff_now(listS($$feelsTowardsObject_Ternary, user, list($$NthInteractionOfSessionFn, $$MySeAnswersSession_JaneDoe_001, next_mys_interaction_number(user, session_mt)), $list_alt209), session_mt);
			} else {
				return $ERROR;
			}

		}
	}

	// defparameter
	private static final SubLSymbol $most_recent_mys_interaction_number_count_dict$ = makeSymbol("*MOST-RECENT-MYS-INTERACTION-NUMBER-COUNT-DICT*");

	public static final SubLObject next_mys_interaction_number(SubLObject user, SubLObject session_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject most_recent = dictionary.dictionary_lookup($most_recent_mys_interaction_number_count_dict$.getDynamicValue(thread), user, UNPROVIDED);
				if (most_recent.isNumber()) {
					dictionary.dictionary_enter($most_recent_mys_interaction_number_count_dict$.getDynamicValue(thread), user, number_utilities.f_1X(most_recent));
					return number_utilities.f_1X(most_recent);
				} else {
					dictionary.dictionary_enter($most_recent_mys_interaction_number_count_dict$.getDynamicValue(thread), user, ONE_INTEGER);
					return ONE_INTEGER;
				}
			}
		}
	}

	/**
	 * The assumption here is that ORIGINAL and NEW will both be #$ist sentences, so there's no need to
	 * have an Mt at all.  However, since we aren't currently emitting #$ist sentences (20May2004), we allow
	 * the Mt parameter as well
	 */
	public static final SubLObject perform_kb_edit(SubLObject original, SubLObject v_new, SubLObject mt, SubLObject nowP) {
		if (nowP == UNPROVIDED) {
			nowP = T;
		}
		if (NIL != original) {
			mysentient_utilities.myse_unassert(original, mt);
		}
		return mysentient_utilities.myse_assert_with_implicature_now(v_new, mt, nowP);
	}

	/**
	 * Perform the KB edit specified, and return any pegs that should be re-expanded as a result.
	 * This will currently be the case only if one of the terms in either the new or old sentence
	 * was in fact a peg mentioned in the most recent user utterance.
	 *
	 * @unknown This function should probably throw an error of some sort if the kb-edit can't be made
	 */
	public static final SubLObject perform_kb_edit_possibly_on_pegs(SubLObject original, SubLObject v_new, SubLObject mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL != original) {
				SubLTrampolineFile.checkType(original, CYCL_SENTENCE_P);
			}
			SubLTrampolineFile.checkType(v_new, CYCL_SENTENCE_P);
			SubLTrampolineFile.checkType(mt, HLMT_P);
			{
				SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
				SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
				try {
					mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
					mt_relevance_macros.$mt$.bind(mt, thread);
					if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
						if (NIL == collection_defns.cycl_sentence_assertibleP(v_new)) {
							Errors.error($str_alt220$Sentence__S_not_assertible_in__S_, v_new, mt);
						}
					}
				} finally {
					mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
					mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
				}
			}
			{
				SubLObject these_terms = cconcatenate(cycl_utilities.all_literal_terms(original, UNPROVIDED), cycl_utilities.all_literal_terms(v_new, UNPROVIDED));
				SubLObject current_pegs = referent_pegs_from_most_recent_utterance(mt);
				SubLObject affected_terms = intersection(these_terms, current_pegs, UNPROVIDED, UNPROVIDED);
				if (NIL == perform_kb_edit(original, v_new, mt, UNPROVIDED)) {
					return NIL;
				}
				return most_recent_expression_pegs_for_referent_pegs(affected_terms, mt);
			}
		}
	}

	public static final SubLObject most_recent_expression_pegs_for_referent_pegs(SubLObject referent_pegs, SubLObject mt) {
		{
			SubLObject expression_pegs = NIL;
			SubLObject cdolist_list_var = referent_pegs;
			SubLObject referent_peg = NIL;
			for (referent_peg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), referent_peg = cdolist_list_var.first()) {
				expression_pegs = cconcatenate(expression_pegs, ask_utilities.query_variable($sym226$_EXPR_RECENT,
						list($$thereExists, $sym228$_NUM, list($$and, list($$assertedSentence, list($$intendedReferent, $sym226$_EXPR_RECENT, referent_peg)), $list_alt230, listS($$nthLargestElement, $sym228$_NUM, ONE_INTEGER, list($$TheSetOf, $sym233$_M, list($$thereExists, $sym234$_EXPR, listS($$and, list($$assertedSentence, list($$intendedReferent, $sym234$_EXPR, referent_peg)), $list_alt235))), $list_alt236))),
						mt, UNPROVIDED));
			}
			return expression_pegs;
		}
	}

	public static final SubLObject referent_pegs_from_most_recent_utterance(SubLObject session_mt) {
		{
			SubLObject utterance_peg = most_recent_utterance_peg(session_mt);
			SubLObject result = referents_of_subexpressions(utterance_peg, session_mt);
			return result;
		}
	}

	public static final SubLObject most_recent_utterance_peg(SubLObject session_mt) {
		{
			SubLObject raw_result = ask_utilities.query_template($list_alt237, listS($$ist, session_mt, $list_alt238), session_mt, UNPROVIDED);
			return Sort.sort(raw_result, $sym183$_, SECOND).first().first();
		}
	}

	public static final SubLObject referents_of_subexpressions(SubLObject complete_utterance_peg, SubLObject session_mt) {
		{
			SubLObject sub_pegs = ask_utilities.query_variable($sym239$_SUB_EXPR, list($$ist, session_mt, listS($$properSubExpressions, complete_utterance_peg, $list_alt240)), session_mt, UNPROVIDED);
			SubLObject referents = NIL;
			SubLObject cdolist_list_var = sub_pegs;
			SubLObject peg = NIL;
			for (peg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), peg = cdolist_list_var.first()) {
				{
					SubLObject referent = get_intended_referent_for_term(peg, session_mt);
					if (NIL != referent) {
						referents = cons(referent, referents);
					}
				}
			}
			return referents;
		}
	}

	public static final SubLObject clear_mys_session_from_session_mt() {
		{
			SubLObject cs = $mys_session_from_session_mt_caching_state$.getGlobalValue();
			if (NIL != cs) {
				memoization_state.caching_state_clear(cs);
			}
		}
		return NIL;
	}

	public static final SubLObject remove_mys_session_from_session_mt(SubLObject session_mt) {
		return memoization_state.caching_state_remove_function_results_with_args($mys_session_from_session_mt_caching_state$.getGlobalValue(), list(session_mt), UNPROVIDED, UNPROVIDED);
	}

	public static final SubLObject mys_session_from_session_mt_internal(SubLObject session_mt) {
		return ask_utilities.query_variable($SESSION, listS($$recordOfSession, session_mt, $list_alt244), session_mt, $list_alt245).first();
	}

	public static final SubLObject mys_session_from_session_mt(SubLObject session_mt) {
		{
			SubLObject caching_state = $mys_session_from_session_mt_caching_state$.getGlobalValue();
			if (NIL == caching_state) {
				caching_state = memoization_state.create_global_caching_state_for_name(MYS_SESSION_FROM_SESSION_MT, $mys_session_from_session_mt_caching_state$, NIL, EQL, ONE_INTEGER, SIXTEEN_INTEGER);
			}
			{
				SubLObject results = memoization_state.caching_state_lookup(caching_state, session_mt, $kw10$_MEMOIZED_ITEM_NOT_FOUND_);
				if (results == $kw10$_MEMOIZED_ITEM_NOT_FOUND_) {
					results = arg2(resetMultipleValues(), multiple_value_list(mys_session_from_session_mt_internal(session_mt)));
					memoization_state.caching_state_put(caching_state, session_mt, results, UNPROVIDED);
				}
				return memoization_state.caching_results(results);
			}
		}
	}

	public static final SubLObject plural_semanticsP(SubLObject arg) {
		return NIL;
	}

	public static final SubLObject clear_user_from_profile_mt() {
		{
			SubLObject cs = $user_from_profile_mt_caching_state$.getGlobalValue();
			if (NIL != cs) {
				memoization_state.caching_state_clear(cs);
			}
		}
		return NIL;
	}

	public static final SubLObject remove_user_from_profile_mt(SubLObject mt) {
		return memoization_state.caching_state_remove_function_results_with_args($user_from_profile_mt_caching_state$.getGlobalValue(), list(mt), UNPROVIDED, UNPROVIDED);
	}

	public static final SubLObject user_from_profile_mt_internal(SubLObject mt) {
		return ask_utilities.query_variable($sym29$_X, list($$mySentientUserProfile, $sym29$_X, mt), mt, UNPROVIDED).first();
	}

	public static final SubLObject user_from_profile_mt(SubLObject mt) {
		{
			SubLObject caching_state = $user_from_profile_mt_caching_state$.getGlobalValue();
			if (NIL == caching_state) {
				caching_state = memoization_state.create_global_caching_state_for_name(USER_FROM_PROFILE_MT, $user_from_profile_mt_caching_state$, NIL, EQ, ONE_INTEGER, ZERO_INTEGER);
			}
			{
				SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, $kw10$_MEMOIZED_ITEM_NOT_FOUND_);
				if (results == $kw10$_MEMOIZED_ITEM_NOT_FOUND_) {
					results = arg2(resetMultipleValues(), multiple_value_list(user_from_profile_mt_internal(mt)));
					memoization_state.caching_state_put(caching_state, mt, results, UNPROVIDED);
				}
				return memoization_state.caching_results(results);
			}
		}
	}

	public static final SubLObject definite_referenceP(SubLObject sem) {
		return makeBoolean((sem.isCons() && ($$NLDefinitenessFn_3 == cycl_utilities.formula_arg0(sem))) && ($$Definite_NLAttr == cycl_utilities.formula_arg1(sem, UNPROVIDED)));
	}

	public static final SubLObject indefinite_referenceP(SubLObject sem) {
		return makeBoolean((sem.isCons() && ($$NLDefinitenessFn_3 == cycl_utilities.formula_arg0(sem))) && ($$Indefinite_NLAttr == cycl_utilities.formula_arg1(sem, UNPROVIDED)));
	}

	public static final SubLObject my_sent_assert_complex_sentence_with_implicature(SubLObject sentence, SubLObject mt, SubLObject nowP) {
		if (nowP == UNPROVIDED) {
			nowP = NIL;
		}
		{
			SubLObject arg0 = cycl_utilities.formula_arg0(sentence);
			if (arg0 == $$and) {
				{
					SubLObject failP = NIL;
					if (NIL == failP) {
						{
							SubLObject csome_list_var = sentence.rest();
							SubLObject conjunct = NIL;
							for (conjunct = csome_list_var.first(); !((NIL != failP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), conjunct = csome_list_var.first()) {
								failP = makeBoolean(NIL == my_sent_assert_complex_sentence_with_implicature(conjunct, mt, nowP));
							}
						}
					}
					return makeBoolean(NIL == failP);
				}
			} else {
				return mysentient_utilities.myse_assert_with_implicature_now(sentence, mt, nowP);
			}
		}
	}

	public static final SubLObject parse_and_note(SubLObject string, SubLObject mt, SubLObject session_mt, SubLObject parsing_mt) {
		return note_np_reference(string, mysentient_preprocess_widgets.np_semantics(string, UNPROVIDED, UNPROVIDED, UNPROVIDED), narts_high.nart_substitute(mt), narts_high.nart_substitute(session_mt), narts_high.nart_substitute(parsing_mt));
	}

	/**
	 * This function supports simulation of the MySentient User Profile Manager, by going from a string to its expansions.
	 *
	 * @return 1 cycl-term
	 * @return 2 list; ((expansion-type-string1 (exp1 exp2 exp3...) (weight1 weight2 weight3 ...) (cycl-exp1 cycl-exp2 ...))
	(expansion-type-string-n (exp1 exp2 exp3...) (weight1 weight2 weight3 ...) (cycl-exp1 cycl-exp2)))
	 */
	public static final SubLObject parse_and_expand(SubLObject string, SubLObject expansion_types, SubLObject instantiate_collectionsP, SubLObject profile_mt, SubLObject session_mt, SubLObject parsing_mt, SubLObject generation_mt) {
		if (expansion_types == UNPROVIDED) {
			expansion_types = NIL;
		}
		if (instantiate_collectionsP == UNPROVIDED) {
			instantiate_collectionsP = T;
		}
		if (profile_mt == UNPROVIDED) {
			profile_mt = $$MySePrototypeUserProfileMt;
		}
		if (session_mt == UNPROVIDED) {
			session_mt = $$MySePrototypeSessionMt;
		}
		if (parsing_mt == UNPROVIDED) {
			parsing_mt = $$MySePrototypeParsingMt;
		}
		if (generation_mt == UNPROVIDED) {
			generation_mt = $$MySePrototypeGenerationMt;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject np_meaning = parsing_utilities.strip_nl_tags(mysentient_preprocess_widgets.np_semantics(string, parsing_mt, UNPROVIDED, UNPROVIDED), UNPROVIDED).first();
				SubLObject cycl_meaning = read_from_string_ignoring_errors(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				SubLObject constant_prefixP = string_utilities.string_contains_constant_reader_prefix_p(string);
				SubLObject v_term = ((NIL != constant_prefixP) && (NIL != cycl_meaning)) ? ((SubLObject) (cycl_meaning)) : np_meaning;
				SubLObject result = NIL;
				if (NIL == expansion_types) {
					expansion_types = get_expansion_strategy_strings(session_mt);
				}
				if (NIL != v_term) {
					{
						SubLObject cdolist_list_var = expansion_types;
						SubLObject expansion_type = NIL;
						for (expansion_type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), expansion_type = cdolist_list_var.first()) {
							if (NIL != Strings.stringE(expansion_type, $str_alt257$alt_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
								{
									SubLObject phrases = alternate_phrases(v_term, string, generation_mt);
									result = cons(list(expansion_type, phrases, NIL, NIL), result);
								}
							} else {
								thread.resetMultipleValues();
								{
									SubLObject expansions = expansions_of_type_for_peg(expansion_type, v_term, session_mt, parsing_mt, generation_mt, get_max_expansions_per_module(), instantiate_collectionsP);
									SubLObject weights = thread.secondMultipleValue();
									SubLObject expansion_cycls = thread.thirdMultipleValue();
									thread.resetMultipleValues();
									result = cons(list(expansion_type, expansions, weights, expansion_cycls), result);
								}
							}
						}
					}
				}
				return values(v_term, result);
			}
		}
	}

	/**
	 * a dictionary mapping session-mts to the current number of instantiated pegs
	 */
	// defparameter
	private static final SubLSymbol $mys_peg_count$ = makeSymbol("*MYS-PEG-COUNT*");

	public static final SubLObject next_peg_id_for_session(SubLObject session_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject current_peg_count = dictionary.dictionary_lookup($mys_peg_count$.getDynamicValue(thread), session_mt, ZERO_INTEGER);
				dictionary_utilities.dictionary_increment($mys_peg_count$.getDynamicValue(thread), session_mt, UNPROVIDED);
				return number_utilities.f_1X(current_peg_count);
			}
		}
	}

	public static final SubLObject latest_question_number_for_session(SubLObject session_mt) {
		return dictionary.dictionary_lookup($mys_question_count$.getGlobalValue(), session_mt, ZERO_INTEGER);
	}

	public static final SubLObject next_question_number_for_session(SubLObject session_mt) {
		{
			SubLObject current_question_count = latest_question_number_for_session(session_mt);
			dictionary_utilities.dictionary_increment($mys_question_count$.getGlobalValue(), session_mt, UNPROVIDED);
			return number_utilities.f_1X(current_question_count);
		}
	}

	/**
	 * User Database against which we do the translation of IDs -> FORTs.
	 */
	// deflexical
	private static final SubLSymbol $mysentient_user_database_term$ = makeSymbol("*MYSENTIENT-USER-DATABASE-TERM*");

	/**
	 * MySentient Persistence Store where we do the translation of KEYs -> User Profile Mts.
	 */
	// deflexical
	private static final SubLSymbol $mysentient_persistence_store_term$ = makeSymbol("*MYSENTIENT-PERSISTENCE-STORE-TERM*");

	// deflexical
	private static final SubLSymbol $mysentient_generic_term_prefix$ = makeSymbol("*MYSENTIENT-GENERIC-TERM-PREFIX*");

	// deflexical
	public static final SubLSymbol $mysentient_session_term_prefix$ = makeSymbol("*MYSENTIENT-SESSION-TERM-PREFIX*");

	// deflexical
	private static final SubLSymbol $mysentient_session_context_prefix$ = makeSymbol("*MYSENTIENT-SESSION-CONTEXT-PREFIX*");

	/**
	 * Creates the new infrastructure for a user session;
	 *
	 * @unknown find a faster way to do this using FI-MERGE like approach.
	 */
	public static final SubLObject create_new_mysentient_user_session(SubLObject user, SubLObject user_profile_mt, SubLObject language_code, SubLObject assert_mt) {
		if (assert_mt == UNPROVIDED) {
			assert_mt = mysentient_utilities.$mysentient_user_profile_information_mt$.getGlobalValue();
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			SubLTrampolineFile.checkType(user, FORT_P);
			{
				SubLObject session_term = NIL;
				SubLObject session_context = NIL;
				{
					SubLObject _prev_bind_0 = rkf_term_utilities.$rkf_name_prefix$.currentBinding(thread);
					try {
						rkf_term_utilities.$rkf_name_prefix$.bind($mysentient_generic_term_prefix$.getGlobalValue(), thread);
						session_term = create_mysentient_user_session_term(user);
						session_context = create_mysentient_user_session_context(user);
					} finally {
						rkf_term_utilities.$rkf_name_prefix$.rebind(_prev_bind_0, thread);
					}
				}
				{
					SubLObject successP = NIL;
					SubLObject message = NIL;
					{
						SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
						SubLObject _prev_bind_1 = forward.$verify_some_support_combinations_possible$.currentBinding(thread);
						SubLObject _prev_bind_2 = forward.$assume_forward_deduction_is_wfP$.currentBinding(thread);
						SubLObject _prev_bind_3 = abnormal.$abnormality_checking_enabled$.currentBinding(thread);
						SubLObject _prev_bind_4 = genl_mts.$min_mts_2_enabledP$.currentBinding(thread);
						try {
							kb_control_vars.$forward_inference_allowed_rules$.bind(mysentient_creation_template_forward_rules($const264$MySentientSession_CreationTemplat), thread);
							forward.$verify_some_support_combinations_possible$.bind(NIL, thread);
							forward.$assume_forward_deduction_is_wfP$.bind(T, thread);
							abnormal.$abnormality_checking_enabled$.bind(NIL, thread);
							genl_mts.$min_mts_2_enabledP$.bind(T, thread);
							thread.resetMultipleValues();
							{
								SubLObject successP_6 = mysentient_assert_wff_assertion_specifications(list(bq_cons(listS($$isa, session_context, $list_alt265), $list_alt266), list(listS($$isa, session_context, $list_alt267), assert_mt), list(list($$mySentientProfileSessionRecords, user_profile_mt, session_context), assert_mt), bq_cons(listS($$isa, session_term, $list_alt269), $list_alt266),
										list(listS($$isa, session_term, $list_alt270), session_context), list(list($$sessionStartDate, session_term, date_utilities.indexical_now()), session_context), list(list($$recordOfSession, session_context, session_term), session_context)), $str_alt272$All_KB_Operations_completed_succe);
								SubLObject message_7 = thread.secondMultipleValue();
								thread.resetMultipleValues();
								successP = successP_6;
								message = message_7;
							}
						} finally {
							genl_mts.$min_mts_2_enabledP$.rebind(_prev_bind_4, thread);
							abnormal.$abnormality_checking_enabled$.rebind(_prev_bind_3, thread);
							forward.$assume_forward_deduction_is_wfP$.rebind(_prev_bind_2, thread);
							forward.$verify_some_support_combinations_possible$.rebind(_prev_bind_1, thread);
							kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
						}
					}
					if (NIL == successP) {
						rkf_term_utilities.rkf_kill(session_context);
						if (NIL != constant_handles.valid_constant(session_term, T)) {
							rkf_term_utilities.rkf_kill(session_term);
						}
						return NIL;
					} else {
						set_mysentient_session_language(session_term, session_context, language_code);
						{
							SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
							try {
								kb_control_vars.$forward_inference_allowed_rules$.bind(mysentient_creation_template_forward_rules($const264$MySentientSession_CreationTemplat), thread);
								mark_mysentient_user_session_context_as_active(session_term, user_profile_mt, assert_mt);
							} finally {
								kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
							}
						}
						return list(session_term, session_context);
					}
				}
			}
		}
	}

	public static final SubLObject create_mysentient_user_session_term(SubLObject user) {
		return rkf_term_utilities.rkf_create(cconcatenate($mysentient_session_term_prefix$.getGlobalValue(), new SubLObject[] { $str_alt278$_, kb_paths.fort_name(user) }), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	public static final SubLObject create_mysentient_user_session_context(SubLObject user) {
		return rkf_term_utilities.rkf_create(cconcatenate($mysentient_session_context_prefix$.getGlobalValue(), new SubLObject[] { $str_alt278$_, kb_paths.fort_name(user) }), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	public static final SubLObject mysentient_creation_template_allowable_rules(SubLObject creation_template) {
		return forward.creation_template_allowable_rules(creation_template);
	}

	public static final SubLObject clear_mysentient_creation_template_forward_rules() {
		{
			SubLObject cs = $mysentient_creation_template_forward_rules_caching_state$.getGlobalValue();
			if (NIL != cs) {
				memoization_state.caching_state_clear(cs);
			}
		}
		return NIL;
	}

	public static final SubLObject remove_mysentient_creation_template_forward_rules(SubLObject creation_template) {
		return memoization_state.caching_state_remove_function_results_with_args($mysentient_creation_template_forward_rules_caching_state$.getGlobalValue(), list(creation_template), UNPROVIDED, UNPROVIDED);
	}

	public static final SubLObject mysentient_creation_template_forward_rules_internal(SubLObject creation_template) {
		return forward.creation_template_forward_rules_via_exemplars(creation_template);
	}

	public static final SubLObject mysentient_creation_template_forward_rules(SubLObject creation_template) {
		{
			SubLObject caching_state = $mysentient_creation_template_forward_rules_caching_state$.getGlobalValue();
			if (NIL == caching_state) {
				caching_state = memoization_state.create_global_caching_state_for_name(MYSENTIENT_CREATION_TEMPLATE_FORWARD_RULES, $mysentient_creation_template_forward_rules_caching_state$, NIL, EQ, ONE_INTEGER, ZERO_INTEGER);
			}
			{
				SubLObject results = memoization_state.caching_state_lookup(caching_state, creation_template, $kw10$_MEMOIZED_ITEM_NOT_FOUND_);
				if (results == $kw10$_MEMOIZED_ITEM_NOT_FOUND_) {
					results = arg2(resetMultipleValues(), multiple_value_list(mysentient_creation_template_forward_rules_internal(creation_template)));
					memoization_state.caching_state_put(caching_state, creation_template, results, UNPROVIDED);
				}
				return memoization_state.caching_results(results);
			}
		}
	}

	public static final SubLObject mark_mysentient_user_session_context_as_active(SubLObject session_term, SubLObject user_profile_mt, SubLObject assert_mt) {
		unmark_all_mysentient_user_session_contexts_marked_active(user_profile_mt);
		return mysentient_utilities.myse_assert_wff_now(listS($$isa, session_term, $list_alt281), assert_mt);
	}

	/**
	 *
	 *
	 * @unknown does not unmark the prototypical active session
	 */
	public static final SubLObject unmark_all_mysentient_user_session_contexts_marked_active(SubLObject user_profile_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject sessions = get_all_mysentient_userprofile_sessions_from_user_profile(user_profile_mt, UNPROVIDED);
				if (NIL != sessions) {
					{
						SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
						SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
						try {
							mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
							mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
							{
								SubLObject cdolist_list_var = sessions;
								SubLObject session = NIL;
								for (session = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), session = cdolist_list_var.first()) {
									{
										SubLObject sentence = listS($$isa, session, $list_alt281);
										SubLObject assertions = kb_indexing.find_all_gafs(sentence);
										SubLObject cdolist_list_var_8 = assertions;
										SubLObject assertion = NIL;
										for (assertion = cdolist_list_var_8.first(); NIL != cdolist_list_var_8; cdolist_list_var_8 = cdolist_list_var_8.rest(), assertion = cdolist_list_var_8.first()) {
											thread.resetMultipleValues();
											{
												SubLObject el_formula = uncanonicalizer.assertion_el_formula(assertion);
												SubLObject elmt = thread.secondMultipleValue();
												thread.resetMultipleValues();
												if (NIL == cycl_utilities.expression_find($const284$MySeAnswersSessionMySentientExemp, el_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
													mysentient_utilities.myse_unassert(el_formula, elmt);
												}
											}
										}
									}
								}
							}
						} finally {
							mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
							mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
						}
					}
					return user_profile_mt;
				}
			}
			return NIL;
		}
	}

	public static final SubLObject mysentient_assert_wff_assertion_specifications(SubLObject assertion_specs, SubLObject success) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject cdolist_list_var = assertion_specs;
				SubLObject assertion_spec = NIL;
				for (assertion_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), assertion_spec = cdolist_list_var.first()) {
					{
						SubLObject datum = assertion_spec;
						SubLObject current = datum;
						SubLObject sentence = NIL;
						SubLObject elmt = NIL;
						destructuring_bind_must_consp(current, datum, $list_alt285);
						sentence = current.first();
						current = current.rest();
						destructuring_bind_must_consp(current, datum, $list_alt285);
						elmt = current.first();
						current = current.rest();
						if (NIL == current) {
							thread.resetMultipleValues();
							{
								SubLObject successP = mysentient_utilities.myse_assert_wff_now(sentence, elmt);
								SubLObject reason = thread.secondMultipleValue();
								thread.resetMultipleValues();
								if (NIL == successP) {
									return values(NIL, reason);
								}
							}
						} else {
							cdestructuring_bind_error(datum, $list_alt285);
						}
					}
				}
			}
			return values(T, success);
		}
	}

	public static final SubLObject mysentient_assert_assertion_specifications(SubLObject assertion_specs, SubLObject success) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject cdolist_list_var = assertion_specs;
				SubLObject assertion_spec = NIL;
				for (assertion_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), assertion_spec = cdolist_list_var.first()) {
					{
						SubLObject datum = assertion_spec;
						SubLObject current = datum;
						SubLObject sentence = NIL;
						SubLObject elmt = NIL;
						destructuring_bind_must_consp(current, datum, $list_alt285);
						sentence = current.first();
						current = current.rest();
						destructuring_bind_must_consp(current, datum, $list_alt285);
						elmt = current.first();
						current = current.rest();
						if (NIL == current) {
							thread.resetMultipleValues();
							{
								SubLObject successP = mysentient_utilities.myse_assert_now(sentence, elmt);
								SubLObject reason = thread.secondMultipleValue();
								thread.resetMultipleValues();
								if (NIL == successP) {
									return values(NIL, reason);
								}
							}
						} else {
							cdestructuring_bind_error(datum, $list_alt285);
						}
					}
				}
			}
			return values(T, success);
		}
	}

	/**
	 * Gets the user profile Mt information.
	 */
	public static final SubLObject get_mysentient_user_profile_mt(SubLObject user, SubLObject ask_mt) {
		if (ask_mt == UNPROVIDED) {
			ask_mt = mysentient_utilities.$mysentient_user_profile_information_mt$.getGlobalValue();
		}
		SubLTrampolineFile.checkType(user, FORT_P);
		SubLTrampolineFile.checkType(ask_mt, POSSIBLY_HLMT_P);
		return ask_utilities.query_variable($UP_MT, listS($$mySentientUserProfile, user, $list_alt287), ask_mt, ask_utilities.query_properties_from_legacy_ask_parameters(ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED)).first();
	}

	/**
	 * Gets the parsing Mt associated with the user profile Mt
	 */
	public static final SubLObject get_mysentient_userprofile_parsing_mt(SubLObject user_profile_mt, SubLObject ask_mt) {
		if (ask_mt == UNPROVIDED) {
			ask_mt = mysentient_utilities.$mysentient_user_profile_information_mt$.getGlobalValue();
		}
		SubLTrampolineFile.checkType(user_profile_mt, FORT_P);
		SubLTrampolineFile.checkType(ask_mt, POSSIBLY_HLMT_P);
		return ask_utilities.query_variable($PARSE_MT, list($$mySentientParsingMtForProfile, $PARSE_MT, user_profile_mt), ask_mt, ask_utilities.query_properties_from_legacy_ask_parameters(ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED)).first();
	}

	/**
	 * Gets the generation Mt associated with the user profile Mt
	 */
	public static final SubLObject get_mysentient_userprofile_generation_mt(SubLObject user_profile_mt, SubLObject ask_mt) {
		if (ask_mt == UNPROVIDED) {
			ask_mt = mysentient_utilities.$mysentient_user_profile_information_mt$.getGlobalValue();
		}
		SubLTrampolineFile.checkType(user_profile_mt, FORT_P);
		SubLTrampolineFile.checkType(ask_mt, POSSIBLY_HLMT_P);
		return ask_utilities.query_variable($GEN_MT, list($$mySentientGenerationMtForProfile, $GEN_MT, user_profile_mt), ask_mt, ask_utilities.query_properties_from_legacy_ask_parameters(ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED)).first();
	}

	/**
	 * Gets a lexical Mt associated with the user profile Mt
	 */
	public static final SubLObject get_mysentient_userprofile_lexical_mt(SubLObject user_profile_mt, SubLObject ask_mt) {
		if (ask_mt == UNPROVIDED) {
			ask_mt = mysentient_utilities.$mysentient_user_profile_information_mt$.getGlobalValue();
		}
		SubLTrampolineFile.checkType(user_profile_mt, FORT_P);
		SubLTrampolineFile.checkType(ask_mt, POSSIBLY_HLMT_P);
		return ask_utilities.query_variable($GEN_MT, list($$mySentientLexicalMtForProfile, $GEN_MT, user_profile_mt), ask_mt, ask_utilities.query_properties_from_legacy_ask_parameters(ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED)).first();
	}

	/**
	 * Gets the lexical Mts associated with the user profile Mt
	 */
	public static final SubLObject get_mysentient_userprofile_lexical_mts(SubLObject user_profile_mt, SubLObject ask_mt) {
		if (ask_mt == UNPROVIDED) {
			ask_mt = mysentient_utilities.$mysentient_user_profile_information_mt$.getGlobalValue();
		}
		SubLTrampolineFile.checkType(user_profile_mt, FORT_P);
		SubLTrampolineFile.checkType(ask_mt, POSSIBLY_HLMT_P);
		{
			SubLObject lexicon_mt = get_mysentient_userprofile_lexical_mt(user_profile_mt, ask_mt);
			SubLObject parsing_mt = get_mysentient_userprofile_parsing_mt(user_profile_mt, ask_mt);
			SubLObject generation_mt = get_mysentient_userprofile_generation_mt(user_profile_mt, ask_mt);
			SubLObject result = NIL;
			if (NIL != lexicon_mt) {
				result = cons(lexicon_mt, result);
			}
			if (NIL != parsing_mt) {
				result = cons(parsing_mt, result);
			}
			if (NIL != generation_mt) {
				result = cons(generation_mt, result);
			}
			return result;
		}
	}

	/**
	 * Maps the user to their Mts. Returns an ordered list of the Mts.
	 */
	public static final SubLObject get_mysentient_user_mts(SubLObject user, SubLObject ask_mt) {
		if (ask_mt == UNPROVIDED) {
			ask_mt = mysentient_utilities.$mysentient_user_profile_information_mt$.getGlobalValue();
		}
		SubLTrampolineFile.checkType(user, FORT_P);
		return ask_utilities.query_template($list_alt308, listS($$and, listS($$mySentientUserProfile, user, $list_alt309), $list_alt310), ask_mt, ask_utilities.query_properties_from_legacy_ask_parameters(ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED)).first();
	}

	/**
	 * Put them together into the right order for user-mts.
	 */
	public static final SubLObject combine_mysentient_user_mts(SubLObject user_profile_mt, SubLObject generation_mt, SubLObject parsing_mt, SubLObject lexical_mt) {
		SubLTrampolineFile.checkType(user_profile_mt, POSSIBLY_HLMT_P);
		SubLTrampolineFile.checkType(generation_mt, POSSIBLY_HLMT_P);
		SubLTrampolineFile.checkType(parsing_mt, POSSIBLY_HLMT_P);
		SubLTrampolineFile.checkType(lexical_mt, POSSIBLY_HLMT_P);
		return list(user_profile_mt, generation_mt, parsing_mt, lexical_mt);
	}

	/**
	 * Extract just the user profile mt
	 */
	public static final SubLObject get_mysentient_user_profile_mt_from_user_mts(SubLObject user_mts) {
		SubLTrampolineFile.checkType(user_mts, LISTP);
		return user_mts.first();
	}

	/**
	 * Extract just the user profile generation mt
	 */
	public static final SubLObject get_mysentient_userprofile_generation_mt_from_user_mts(SubLObject user_mts) {
		SubLTrampolineFile.checkType(user_mts, LISTP);
		return second(user_mts);
	}

	/**
	 * Extract just the user profile parsing mt
	 */
	public static final SubLObject get_mysentient_userprofile_parsing_mt_from_user_mts(SubLObject user_mts) {
		SubLTrampolineFile.checkType(user_mts, LISTP);
		return third(user_mts);
	}

	/**
	 * Given the user profile mt, compute what all the user profile sessions are.
	 */
	public static final SubLObject get_all_mysentient_userprofile_sessions_from_user_profile(SubLObject user_profile_mt, SubLObject ask_mt) {
		if (ask_mt == UNPROVIDED) {
			ask_mt = mysentient_utilities.$mysentient_user_profile_information_mt$.getGlobalValue();
		}
		SubLTrampolineFile.checkType(user_profile_mt, POSSIBLY_HLMT_P);
		{
			SubLObject sessions = NIL;
			SubLObject session_mts = get_all_mysentient_userprofile_session_mts_from_user_profile(user_profile_mt, ask_mt);
			SubLObject cdolist_list_var = session_mts;
			SubLObject session_mt = NIL;
			for (session_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), session_mt = cdolist_list_var.first()) {
				{
					SubLObject cdolist_list_var_9 = kb_mapping_utilities.pred_values_in_mt(session_mt, $$recordOfSession, session_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					SubLObject session = NIL;
					for (session = cdolist_list_var_9.first(); NIL != cdolist_list_var_9; cdolist_list_var_9 = cdolist_list_var_9.rest(), session = cdolist_list_var_9.first()) {
						sessions = cons(session, sessions);
					}
				}
			}
			return nreverse(sessions);
		}
	}

	/**
	 * Given the user profile mt, compute what all the user profile sessions mts are.
	 */
	public static final SubLObject get_all_mysentient_userprofile_session_mts_from_user_profile(SubLObject user_profile_mt, SubLObject ask_mt) {
		if (ask_mt == UNPROVIDED) {
			ask_mt = mysentient_utilities.$mysentient_user_profile_information_mt$.getGlobalValue();
		}
		SubLTrampolineFile.checkType(user_profile_mt, POSSIBLY_HLMT_P);
		return backward.removal_ask_variable($SESSION_MT, listS($$mySentientProfileSessionRecords, user_profile_mt, $list_alt329), ask_mt, UNPROVIDED, UNPROVIDED);
	}

	/**
	 * Given the user profile mt, compute the active session information (term and mt) are.
	 */
	public static final SubLObject get_active_mysentient_session_information_from_user_profile(SubLObject user_profile_mt, SubLObject ask_mt) {
		if (ask_mt == UNPROVIDED) {
			ask_mt = mysentient_utilities.$mysentient_user_profile_information_mt$.getGlobalValue();
		}
		SubLTrampolineFile.checkType(user_profile_mt, POSSIBLY_HLMT_P);
		return ask_utilities.query_template($list_alt332, listS($$and, listS($$mySentientProfileSessionRecords, user_profile_mt, $list_alt333), $list_alt334), ask_mt, $list_alt335).first();
	}

	/**
	 * Given the session information, piece out the session term.
	 */
	public static final SubLObject get_active_mysentient_session_term_from_session_information(SubLObject session_information) {
		SubLTrampolineFile.checkType(session_information, LISTP);
		return session_information.first();
	}

	/**
	 * Given the session information, piece out the session mt
	 */
	public static final SubLObject get_active_mysentient_session_mt_from_session_information(SubLObject session_information) {
		SubLTrampolineFile.checkType(session_information, LISTP);
		return second(session_information);
	}

	// deflexical
	private static final SubLSymbol $mysentient_anonymous_user_prefix$ = makeSymbol("*MYSENTIENT-ANONYMOUS-USER-PREFIX*");

	// deflexical
	private static final SubLSymbol $mysentient_anonymous_user_profile_mt_prefix$ = makeSymbol("*MYSENTIENT-ANONYMOUS-USER-PROFILE-MT-PREFIX*");

	// deflexical
	private static final SubLSymbol $mysentient_anonymous_user_generation_mt_prefix$ = makeSymbol("*MYSENTIENT-ANONYMOUS-USER-GENERATION-MT-PREFIX*");

	// deflexical
	private static final SubLSymbol $mysentient_anonymous_user_parsing_mt_prefix$ = makeSymbol("*MYSENTIENT-ANONYMOUS-USER-PARSING-MT-PREFIX*");

	// deflexical
	private static final SubLSymbol $mysentient_anonymous_user_lexical_mt_prefix$ = makeSymbol("*MYSENTIENT-ANONYMOUS-USER-LEXICAL-MT-PREFIX*");

	/**
	 * Establish the anonymous user and assert what we know about him now.
	 */
	public static final SubLObject create_mysentient_user_with_external_id(SubLObject id_string, SubLObject user_database, SubLObject assert_mt) {
		if (user_database == UNPROVIDED) {
			user_database = $mysentient_user_database_term$.getGlobalValue();
		}
		if (assert_mt == UNPROVIDED) {
			assert_mt = mysentient_utilities.$mysentient_user_profile_information_mt$.getGlobalValue();
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			SubLTrampolineFile.checkType(id_string, STRINGP);
			SubLTrampolineFile.checkType(user_database, FORT_P);
			SubLTrampolineFile.checkType(assert_mt, POSSIBLY_HLMT_P);
			{
				SubLObject user_term = NIL;
				SubLObject user_profile_mt = NIL;
				SubLObject user_parsing_mt = NIL;
				SubLObject user_generation_mt = NIL;
				SubLObject user_lexical_mt = NIL;
				{
					SubLObject _prev_bind_0 = rkf_term_utilities.$rkf_name_prefix$.currentBinding(thread);
					try {
						rkf_term_utilities.$rkf_name_prefix$.bind($mysentient_generic_term_prefix$.getGlobalValue(), thread);
						user_term = create_mysentient_user_term(id_string);
						user_profile_mt = create_mysentient_user_profile_mt(id_string);
						user_lexical_mt = create_mysentient_user_profile_lexical_mt(id_string);
						user_parsing_mt = create_mysentient_user_profile_parsing_mt(id_string);
						user_generation_mt = create_mysentient_user_profile_generation_mt(id_string);
					} finally {
						rkf_term_utilities.$rkf_name_prefix$.rebind(_prev_bind_0, thread);
					}
				}
				{
					SubLObject successP = NIL;
					SubLObject message = NIL;
					{
						SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
						SubLObject _prev_bind_1 = forward.$verify_some_support_combinations_possible$.currentBinding(thread);
						SubLObject _prev_bind_2 = forward.$assume_forward_deduction_is_wfP$.currentBinding(thread);
						SubLObject _prev_bind_3 = abnormal.$abnormality_checking_enabled$.currentBinding(thread);
						SubLObject _prev_bind_4 = lexicon_vars.$initialize_nl_trie_control_varsP$.currentBinding(thread);
						SubLObject _prev_bind_5 = genl_mts.$min_mts_2_enabledP$.currentBinding(thread);
						try {
							kb_control_vars.$forward_inference_allowed_rules$.bind(mysentient_creation_template_forward_rules($const349$MySentientUserWithProfile_Creatio), thread);
							forward.$verify_some_support_combinations_possible$.bind(NIL, thread);
							forward.$assume_forward_deduction_is_wfP$.bind(T, thread);
							abnormal.$abnormality_checking_enabled$.bind(NIL, thread);
							lexicon_vars.$initialize_nl_trie_control_varsP$.bind(NIL, thread);
							genl_mts.$min_mts_2_enabledP$.bind(T, thread);
							thread.resetMultipleValues();
							{
								SubLObject successP_10 = mysentient_assert_wff_assertion_specifications(list(new SubLObject[] { bq_cons(listS($$isa, user_term, $list_alt269), $list_alt266), list(listS($$isa, user_term, $list_alt350), assert_mt), list(listS($$isa, user_term, $list_alt351), assert_mt), bq_cons(listS($$isa, user_profile_mt, $list_alt265), $list_alt266),
										list(listS($$isa, user_profile_mt, $list_alt352), assert_mt), list(list($$mySentientUserProfile, user_term, user_profile_mt), assert_mt), bq_cons(listS($$isa, user_generation_mt, $list_alt265), $list_alt266), list(listS($$isa, user_generation_mt, $list_alt353), assert_mt), list(list($$mySentientGenerationMtForProfile, user_generation_mt, user_profile_mt), assert_mt),
										bq_cons(listS($$isa, user_lexical_mt, $list_alt265), $list_alt266), list(listS($$isa, user_lexical_mt, $list_alt354), assert_mt), list(list($$nameString, user_term, cconcatenate($str_alt356$User_, id_string)), user_lexical_mt), list(list($$mySentientLexicalMtForProfile, user_lexical_mt, user_profile_mt), assert_mt),
										bq_cons(listS($$isa, user_parsing_mt, $list_alt265), $list_alt266), list(listS($$isa, user_parsing_mt, $list_alt357), assert_mt), list(list($$mySentientParsingMtForProfile, user_parsing_mt, user_profile_mt), assert_mt), list(list($$synonymousExternalConcept, user_term, user_database, id_string), assert_mt) }), $str_alt272$All_KB_Operations_completed_succe);
								SubLObject message_11 = thread.secondMultipleValue();
								thread.resetMultipleValues();
								successP = successP_10;
								message = message_11;
							}
						} finally {
							genl_mts.$min_mts_2_enabledP$.rebind(_prev_bind_5, thread);
							lexicon_vars.$initialize_nl_trie_control_varsP$.rebind(_prev_bind_4, thread);
							abnormal.$abnormality_checking_enabled$.rebind(_prev_bind_3, thread);
							forward.$assume_forward_deduction_is_wfP$.rebind(_prev_bind_2, thread);
							forward.$verify_some_support_combinations_possible$.rebind(_prev_bind_1, thread);
							kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
						}
					}
					if (NIL == successP) {
						{
							SubLObject cdolist_list_var = list(user_generation_mt, user_parsing_mt, user_profile_mt, user_term);
							SubLObject term_introduced = NIL;
							for (term_introduced = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), term_introduced = cdolist_list_var.first()) {
								if (NIL != constant_handles.valid_constant(term_introduced, T)) {
									rkf_term_utilities.rkf_kill(term_introduced);
								}
							}
						}
						return NIL;
					}
				}
				return list(user_term, combine_mysentient_user_mts(user_profile_mt, user_generation_mt, user_parsing_mt, user_lexical_mt));
			}
		}
	}

	public static final SubLObject create_mysentient_user_curried_term(SubLObject prefix, SubLObject id_string) {
		return rkf_term_utilities.rkf_create(cconcatenate(prefix, id_string), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	public static final SubLObject create_mysentient_user_profile_mt(SubLObject id_string) {
		return create_mysentient_user_curried_term($mysentient_anonymous_user_profile_mt_prefix$.getGlobalValue(), id_string);
	}

	public static final SubLObject create_mysentient_user_term(SubLObject id_string) {
		return create_mysentient_user_curried_term($mysentient_anonymous_user_prefix$.getGlobalValue(), id_string);
	}

	public static final SubLObject create_mysentient_user_profile_generation_mt(SubLObject id_string) {
		return create_mysentient_user_curried_term($mysentient_anonymous_user_generation_mt_prefix$.getGlobalValue(), id_string);
	}

	public static final SubLObject create_mysentient_user_profile_lexical_mt(SubLObject id_string) {
		return create_mysentient_user_curried_term($mysentient_anonymous_user_lexical_mt_prefix$.getGlobalValue(), id_string);
	}

	public static final SubLObject create_mysentient_user_profile_parsing_mt(SubLObject id_string) {
		return create_mysentient_user_curried_term($mysentient_anonymous_user_parsing_mt_prefix$.getGlobalValue(), id_string);
	}

	// deflexical
	private static final SubLSymbol $mysentient_default_language$ = makeSymbol("*MYSENTIENT-DEFAULT-LANGUAGE*");

	public static final SubLObject set_mysentient_session_language(SubLObject session, SubLObject session_mt, SubLObject language_code) {
		if (NIL != language_code) {
			SubLTrampolineFile.checkType(language_code, STRINGP);
		}
		{
			SubLObject language = mysentient_language_code_to_language(language_code);
			return mysentient_utilities.myse_assert_now(el_utilities.make_binary_formula($$languageForSession, language, session), session_mt);
		}
	}

	/**
	 * This can be counted on to always return an instance of #$Language.
	 */
	public static final SubLObject mysentient_language_code_to_language(SubLObject language_code) {
		{
			SubLObject language = NIL;
			if (NIL != string_utilities.non_empty_string_p(language_code)) {
				language = mysentient_get_language_of_language_code_from_kb(language_code);
			}
			return NIL != language ? ((SubLObject) (language)) : $mysentient_default_language$.getGlobalValue();
		}
	}

	public static final SubLObject mysentient_get_language_of_language_code_from_kb(SubLObject language_code) {
		{
			SubLObject results = mysentient_utilities.myse_query_variable($sym365$_LANGUAGE, el_utilities.make_conjunction(list(el_utilities.make_ternary_formula($$xmlExpansionTypeAttributeValue, $$MySentientAnswers, $sym365$_LANGUAGE, $sym368$__LANGUAGE_CODE), el_utilities.make_binary_formula($$equalStrings_CaseInsensitive, $sym368$__LANGUAGE_CODE, language_code))), $$MySentientArchitectureMt, $list_alt371);
			return NIL != list_utilities.non_empty_list_p(results) ? ((SubLObject) (results.first())) : NIL;
		}
	}

	/**
	 * Map the external user's ID string to the CYC User term for the user-database specified.
	 */
	public static final SubLObject get_mysentient_user_from_external_id(SubLObject id_string, SubLObject user_database, SubLObject ask_mt) {
		if (user_database == UNPROVIDED) {
			user_database = $mysentient_user_database_term$.getGlobalValue();
		}
		if (ask_mt == UNPROVIDED) {
			ask_mt = mysentient_utilities.$mysentient_user_profile_information_mt$.getGlobalValue();
		}
		SubLTrampolineFile.checkType(id_string, STRINGP);
		SubLTrampolineFile.checkType(user_database, FORT_P);
		SubLTrampolineFile.checkType(ask_mt, POSSIBLY_HLMT_P);
		return ask_utilities.query_variable($USER, list($$synonymousExternalConcept, $USER, user_database, id_string), ask_mt, ask_utilities.query_properties_from_legacy_ask_parameters(ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED)).first();
	}

	/**
	 * Get the key under which we can load the user profile's partition from the persistence store.
	 */
	public static final SubLObject get_mysentient_userprofile_persistence_store_key(SubLObject user_profile_mt, SubLObject persistence_store, SubLObject ask_mt) {
		if (persistence_store == UNPROVIDED) {
			persistence_store = $mysentient_persistence_store_term$.getGlobalValue();
		}
		if (ask_mt == UNPROVIDED) {
			ask_mt = mysentient_utilities.$mysentient_user_profile_information_mt$.getGlobalValue();
		}
		SubLTrampolineFile.checkType(user_profile_mt, POSSIBLY_HLMT_P);
		SubLTrampolineFile.checkType(persistence_store, FORT_P);
		SubLTrampolineFile.checkType(ask_mt, POSSIBLY_HLMT_P);
		return ask_utilities.query_variable($STORAGE_KEY, listS($$synonymousExternalConcept, user_profile_mt, persistence_store, $list_alt378), ask_mt, ask_utilities.query_properties_from_legacy_ask_parameters(ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED)).first();
	}

	/**
	 * Define the key under which we can load the user profile's partition from the persistence store.
	 */
	public static final SubLObject set_mysentient_userprofile_persistence_store_key(SubLObject user_profile_mt, SubLObject storage_key, SubLObject persistence_store, SubLObject assert_mt) {
		if (persistence_store == UNPROVIDED) {
			persistence_store = $mysentient_persistence_store_term$.getGlobalValue();
		}
		if (assert_mt == UNPROVIDED) {
			assert_mt = mysentient_utilities.$mysentient_user_profile_information_mt$.getGlobalValue();
		}
		SubLTrampolineFile.checkType(user_profile_mt, POSSIBLY_HLMT_P);
		SubLTrampolineFile.checkType(storage_key, STRINGP);
		SubLTrampolineFile.checkType(persistence_store, FORT_P);
		SubLTrampolineFile.checkType(assert_mt, POSSIBLY_HLMT_P);
		return list_utilities.sublisp_boolean(mysentient_utilities.myse_assert_wff_now(list($$synonymousExternalConcept, user_profile_mt, persistence_store, storage_key), assert_mt));
	}

	/**
	 * Check whether the user profile mt is loaded on this image already (ie has KB content).
	 */
	public static final SubLObject mysentient_user_profile_mt_loadedP(SubLObject user_profile_mt) {
		SubLTrampolineFile.checkType(user_profile_mt, FORT_P);
		return kb_indexing.num_mt_index(user_profile_mt);
	}

	// deflexical
	private static final SubLSymbol $mysentient_auto_excise_saved_user_informationP$ = makeSymbol("*MYSENTIENT-AUTO-EXCISE-SAVED-USER-INFORMATION?*");

	/**
	 * Load the mysentient user information from the partition in the CFASL encoding blob.
	 */
	public static final SubLObject load_mysentient_user_information(SubLObject partition) {
		SubLTrampolineFile.checkType(partition, CFASL_ENCODING_P);
		return arg2(resetMultipleValues(), multiple_value_list(load_mysentient_user_partition(partition, UNPROVIDED)));
	}

	/**
	 * Save the mysentient user information and return a cfasl hex-string encoding.
	 */
	public static final SubLObject save_mysentient_user_information(SubLObject user_mts, SubLObject user_session_records, SubLObject remove_informationP) {
		if (user_session_records == UNPROVIDED) {
			user_session_records = NIL;
		}
		if (remove_informationP == UNPROVIDED) {
			remove_informationP = $mysentient_auto_excise_saved_user_informationP$.getGlobalValue();
		}
		SubLTrampolineFile.checkType(user_mts, LISTP);
		SubLTrampolineFile.checkType(remove_informationP, BOOLEANP);
		{
			SubLObject hex_string = save_mysentient_user_information_as_hex_string(user_mts, user_session_records, remove_informationP);
			return vector_utilities.hex_char_string_to_byte_vector(hex_string);
		}
	}

	public static final SubLObject save_mysentient_user_information_as_hex_string(SubLObject user_mts, SubLObject user_session_records, SubLObject remove_informationP) {
		if (NIL == user_session_records) {
			{
				SubLObject user_profile_mt = get_mysentient_user_profile_mt_from_user_mts(user_mts);
				user_session_records = append(get_all_mysentient_userprofile_session_mts_from_user_profile(user_profile_mt, UNPROVIDED), get_all_mysentient_userprofile_sessions_from_user_profile(user_profile_mt, UNPROVIDED));
			}
		}
		{
			SubLObject partition_spec = determine_mysentient_user_partition_specification(user_mts, user_session_records);
			SubLObject hex_string = serialize_mysentient_user_partition(partition_spec, remove_informationP);
			return hex_string;
		}
	}

	/**
	 * Save the mysentient user information and turn the cfasl encoding into a HEX stream.
	 */
	public static final SubLObject get_mysentient_user_information_in_hex(SubLObject user_mts, SubLObject user_session_records, SubLObject remove_informationP) {
		if (user_session_records == UNPROVIDED) {
			user_session_records = NIL;
		}
		if (remove_informationP == UNPROVIDED) {
			remove_informationP = $mysentient_auto_excise_saved_user_informationP$.getGlobalValue();
		}
		SubLTrampolineFile.checkType(user_mts, LISTP);
		SubLTrampolineFile.checkType(remove_informationP, BOOLEANP);
		{
			SubLObject hex_string = save_mysentient_user_information_as_hex_string(user_mts, user_session_records, remove_informationP);
			return hex_string;
		}
	}

	/**
	 * Save the mysentient user information and turn the cfasl encoding into an XML stream.
	 */
	public static final SubLObject get_mysentient_user_information_in_xml(SubLObject user_mts, SubLObject user_session_records, SubLObject remove_informationP) {
		if (user_session_records == UNPROVIDED) {
			user_session_records = NIL;
		}
		if (remove_informationP == UNPROVIDED) {
			remove_informationP = $mysentient_auto_excise_saved_user_informationP$.getGlobalValue();
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			SubLTrampolineFile.checkType(user_mts, LISTP);
			SubLTrampolineFile.checkType(remove_informationP, BOOLEANP);
			{
				SubLObject encoding = save_mysentient_user_information(user_mts, user_session_records, remove_informationP);
				SubLObject xml_string = NIL;
				SubLObject stream = NIL;
				try {
					stream = make_private_string_output_stream();
					{
						SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
						try {
							xml_vars.$xml_stream$.bind(stream, thread);
							xml_utilities.xml_header(UNPROVIDED, UNPROVIDED, UNPROVIDED);
							xml_utilities.generate_xml_header_entry_for_dtd($$$byteVector, $str_alt408$http___www_opencyc_org_xml_cycML_, xml_vars.$xml_stream$.getDynamicValue(thread));
							xml_utilities.xml_terpri();
							cycml.cycml_serialize_term(encoding);
						} finally {
							xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
						}
					}
					xml_string = get_output_stream_string(stream);
				} finally {
					{
						SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
						try {
							$is_thread_performing_cleanupP$.bind(T, thread);
							close(stream, UNPROVIDED);
						} finally {
							$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
						}
					}
				}
				return xml_string;
			}
		}
	}

	// deflexical
	private static final SubLSymbol $mysentient_user_partition_major_version_marker$ = makeSymbol("*MYSENTIENT-USER-PARTITION-MAJOR-VERSION-MARKER*");

	// deflexical
	private static final SubLSymbol $mysentient_user_partition_minor_version_marker$ = makeSymbol("*MYSENTIENT-USER-PARTITION-MINOR-VERSION-MARKER*");

	public static final SubLObject serialize_mysentient_user_partition(SubLObject partition_specification, SubLObject remove_informationP) {
		if (remove_informationP == UNPROVIDED) {
			remove_informationP = T;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject hex_string = NIL;
				SubLObject stream = new_cfasl_encoding_stream();
				try {
					cfasl_output($mysentient_user_partition_major_version_marker$.getGlobalValue(), stream);
					cfasl_output($mysentient_user_partition_minor_version_marker$.getGlobalValue(), stream);
					{
						SubLObject _prev_bind_0 = Errors.$ignore_warnsP$.currentBinding(thread);
						SubLObject _prev_bind_1 = Errors.$ignore_breaksP$.currentBinding(thread);
						SubLObject _prev_bind_2 = utilities_macros.$silent_progressP$.currentBinding(thread);
						SubLObject _prev_bind_3 = Errors.$continue_cerrorP$.currentBinding(thread);
						SubLObject _prev_bind_4 = StreamsLow.$standard_output$.currentBinding(thread);
						SubLObject _prev_bind_5 = StreamsLow.$error_output$.currentBinding(thread);
						try {
							Errors.$ignore_warnsP$.bind(T, thread);
							Errors.$ignore_breaksP$.bind(T, thread);
							utilities_macros.$silent_progressP$.bind(T, thread);
							Errors.$continue_cerrorP$.bind(T, thread);
							StreamsLow.$standard_output$.bind(StreamsLow.$null_output$.getDynamicValue(thread), thread);
							StreamsLow.$error_output$.bind(StreamsLow.$null_output$.getDynamicValue(thread), thread);
							if (NIL != remove_informationP) {
								partitions.excise_partition_to_stream(stream, partition_specification);
							} else {
								partitions.save_partition_to_stream(stream, partition_specification);
							}
						} finally {
							StreamsLow.$error_output$.rebind(_prev_bind_5, thread);
							StreamsLow.$standard_output$.rebind(_prev_bind_4, thread);
							Errors.$continue_cerrorP$.rebind(_prev_bind_3, thread);
							utilities_macros.$silent_progressP$.rebind(_prev_bind_2, thread);
							Errors.$ignore_breaksP$.rebind(_prev_bind_1, thread);
							Errors.$ignore_warnsP$.rebind(_prev_bind_0, thread);
						}
					}
					hex_string = cfasl_encoding_string_stream_encoding(stream);
				} finally {
					{
						SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
						try {
							$is_thread_performing_cleanupP$.bind(T, thread);
							close_cfasl_encoding_stream(stream);
						} finally {
							$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
						}
					}
				}
				return hex_string;
			}
		}
	}

	/**
	 *
	 *
	 * @unknown eventually, we may not REALLY want to load and save out ALL user-session-records each time
	 */
	public static final SubLObject determine_mysentient_user_partition_specification(SubLObject user_mts, SubLObject user_session_records) {
		{
			SubLObject term_partition_spec = NIL;
			SubLObject extent_partition_spec = NIL;
			SubLObject pragma_partition_spec = NIL;
			SubLObject estimated_assertion_count = ZERO_INTEGER;
			{
				SubLObject cdolist_list_var = user_mts;
				SubLObject mt = NIL;
				for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), mt = cdolist_list_var.first()) {
					extent_partition_spec = cons(list($FUNCTION, SCOPE_PARTITION_MT_INDEX, mt), extent_partition_spec);
					extent_partition_spec = cons(list($TERM, mt), extent_partition_spec);
					estimated_assertion_count = add(estimated_assertion_count, kb_indexing.num_mt_index(mt));
				}
			}
			{
				SubLObject cdolist_list_var = user_session_records;
				SubLObject session = NIL;
				for (session = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), session = cdolist_list_var.first()) {
					term_partition_spec = cons(list($TERM, session), term_partition_spec);
					estimated_assertion_count = add(estimated_assertion_count, kb_indexing.num_index(session));
					if (NIL != fort_types_interface.microtheory_p(session)) {
						extent_partition_spec = cons(list($FUNCTION, SCOPE_PARTITION_MT_INDEX, session), extent_partition_spec);
					}
				}
			}
			pragma_partition_spec = cons(list($ESTIMATED_ASSERTION_COUNT, estimated_assertion_count), pragma_partition_spec);
			pragma_partition_spec = cons($list_alt414, pragma_partition_spec);
			return append(nreverse(term_partition_spec), nreverse(extent_partition_spec), nreverse(pragma_partition_spec));
		}
	}

	public static final SubLObject load_mysentient_user_partition(SubLObject byte_vector, SubLObject reset_sbhl_linksP) {
		if (reset_sbhl_linksP == UNPROVIDED) {
			reset_sbhl_linksP = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject successP = NIL;
				SubLObject error_message = $str_alt52$;
				try {
					{
						SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
						try {
							Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
							try {
								{
									SubLObject stream = new_cfasl_decoding_stream(byte_vector);
									try {
										{
											SubLObject major_version_number = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
											SubLObject minor_version_number = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
											if ($mysentient_user_partition_major_version_marker$.getGlobalValue().numL(major_version_number) || $mysentient_user_partition_minor_version_marker$.getGlobalValue().numL(minor_version_number)) {
												Errors.error($str_alt416$Cannot_load_this_partition____inv, new SubLObject[] { major_version_number, minor_version_number, $mysentient_user_partition_major_version_marker$.getGlobalValue(), $mysentient_user_partition_minor_version_marker$.getGlobalValue() });
											}
											{
												SubLObject _prev_bind_0_12 = Errors.$ignore_warnsP$.currentBinding(thread);
												SubLObject _prev_bind_1 = Errors.$ignore_breaksP$.currentBinding(thread);
												SubLObject _prev_bind_2 = utilities_macros.$silent_progressP$.currentBinding(thread);
												SubLObject _prev_bind_3 = Errors.$continue_cerrorP$.currentBinding(thread);
												SubLObject _prev_bind_4 = StreamsLow.$standard_output$.currentBinding(thread);
												SubLObject _prev_bind_5 = StreamsLow.$error_output$.currentBinding(thread);
												try {
													Errors.$ignore_warnsP$.bind(T, thread);
													Errors.$ignore_breaksP$.bind(T, thread);
													utilities_macros.$silent_progressP$.bind(T, thread);
													Errors.$continue_cerrorP$.bind(T, thread);
													StreamsLow.$standard_output$.bind(StreamsLow.$null_output$.getDynamicValue(thread), thread);
													StreamsLow.$error_output$.bind(StreamsLow.$null_output$.getDynamicValue(thread), thread);
													partitions.load_partition_from_stream(stream, reset_sbhl_linksP);
												} finally {
													StreamsLow.$error_output$.rebind(_prev_bind_5, thread);
													StreamsLow.$standard_output$.rebind(_prev_bind_4, thread);
													Errors.$continue_cerrorP$.rebind(_prev_bind_3, thread);
													utilities_macros.$silent_progressP$.rebind(_prev_bind_2, thread);
													Errors.$ignore_breaksP$.rebind(_prev_bind_1, thread);
													Errors.$ignore_warnsP$.rebind(_prev_bind_0_12, thread);
												}
											}
										}
									} finally {
										{
											SubLObject _prev_bind_0_13 = $is_thread_performing_cleanupP$.currentBinding(thread);
											try {
												$is_thread_performing_cleanupP$.bind(T, thread);
												close_cfasl_decoding_stream(stream);
											} finally {
												$is_thread_performing_cleanupP$.rebind(_prev_bind_0_13, thread);
											}
										}
									}
								}
								successP = T;
							} catch (Throwable catch_var) {
								Errors.handleThrowable(catch_var, NIL);
							}
						} finally {
							Errors.$error_handler$.rebind(_prev_bind_0, thread);
						}
					}
				} catch (Throwable ccatch_env_var) {
					error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
				}
				return values(successP, error_message);
			}
		}
	}

	public static final SubLObject display_mysentient_user_partition(SubLObject byte_vector, SubLObject display_stream) {
		if (display_stream == UNPROVIDED) {
			display_stream = T;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject stream = new_cfasl_decoding_stream(byte_vector);
				try {
					format(display_stream, $str_alt417$Version__A__A__, cfasl_input(stream, UNPROVIDED, UNPROVIDED), cfasl_input(stream, UNPROVIDED, UNPROVIDED));
					print(cfasl_input(stream, UNPROVIDED, UNPROVIDED), display_stream);
					print(cfasl_input(stream, UNPROVIDED, UNPROVIDED), display_stream);
					print(cfasl_input(stream, UNPROVIDED, UNPROVIDED), display_stream);
					print(cfasl_input(stream, UNPROVIDED, UNPROVIDED), display_stream);
					print(cfasl_input(stream, UNPROVIDED, UNPROVIDED), display_stream);
					{
						SubLObject common_symbols = NIL;
						{
							SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
							try {
								$cfasl_common_symbols$.bind(NIL, thread);
								cfasl_set_common_symbols(NIL);
								common_symbols = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
							} finally {
								$cfasl_common_symbols$.rebind(_prev_bind_0, thread);
							}
						}
						print(common_symbols, display_stream);
						{
							SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
							try {
								$cfasl_common_symbols$.bind(NIL, thread);
								cfasl_set_common_symbols(common_symbols);
								{
									SubLObject obj = NIL;
									for (obj = cfasl_input(stream, NIL, $EOF); obj != $EOF; obj = cfasl_input(stream, NIL, $EOF)) {
										print(obj, display_stream);
									}
								}
							} finally {
								$cfasl_common_symbols$.rebind(_prev_bind_0, thread);
							}
						}
					}
				} finally {
					{
						SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
						try {
							$is_thread_performing_cleanupP$.bind(T, thread);
							close_cfasl_decoding_stream(stream);
						} finally {
							$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
						}
					}
				}
			}
			return NIL;
		}
	}

	public static final SubLObject mysentient_upm_test_generate_xml_for_user_block(SubLObject user, SubLObject stream) {
		if (stream == UNPROVIDED) {
			stream = T;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject user_mts = get_mysentient_user_mts(user, UNPROVIDED);
				SubLObject user_profile_mt = get_mysentient_user_profile_mt_from_user_mts(user_mts);
				SubLObject user_parsing_mt = get_mysentient_userprofile_parsing_mt_from_user_mts(user_mts);
				SubLObject user_generation_mt = get_mysentient_userprofile_generation_mt_from_user_mts(user_mts);
				SubLObject session_info = get_active_mysentient_session_information_from_user_profile(user_profile_mt, UNPROVIDED);
				SubLObject session_term = get_active_mysentient_session_term_from_session_information(session_info);
				SubLObject session_mt = get_active_mysentient_session_mt_from_session_information(session_info);
				{
					SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
					try {
						xml_vars.$xml_stream$.bind(stream, thread);
						{
							SubLObject _prev_bind_0_14 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
							SubLObject _prev_bind_1 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
							try {
								xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
								xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
								xml_utilities.xml_start_tag_internal($$$userMapping, NIL, NIL);
								{
									SubLObject _prev_bind_0_15 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
									SubLObject _prev_bind_1_16 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
									try {
										xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
										xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
										xml_utilities.xml_start_tag_internal($$$userTerm, NIL, NIL);
										cycml.cycml_serialize_term(user);
									} finally {
										xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_16, thread);
										xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_15, thread);
									}
								}
								xml_utilities.xml_terpri();
								xml_utilities.xml_end_tag_internal($$$userTerm);
								{
									SubLObject _prev_bind_0_17 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
									SubLObject _prev_bind_1_18 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
									try {
										xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
										xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
										xml_utilities.xml_start_tag_internal($$$sessionTerm, NIL, NIL);
										cycml.cycml_serialize_term(session_term);
									} finally {
										xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_18, thread);
										xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_17, thread);
									}
								}
								xml_utilities.xml_terpri();
								xml_utilities.xml_end_tag_internal($$$sessionTerm);
								{
									SubLObject _prev_bind_0_19 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
									SubLObject _prev_bind_1_20 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
									try {
										xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
										xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
										xml_utilities.xml_start_tag_internal($$$userContext, NIL, NIL);
										cycml.cycml_serialize_term(user_profile_mt);
									} finally {
										xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_20, thread);
										xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_19, thread);
									}
								}
								xml_utilities.xml_terpri();
								xml_utilities.xml_end_tag_internal($$$userContext);
								{
									SubLObject _prev_bind_0_21 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
									SubLObject _prev_bind_1_22 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
									try {
										xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
										xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
										xml_utilities.xml_start_tag_internal($$$userSessionContext, NIL, NIL);
										cycml.cycml_serialize_term(session_mt);
									} finally {
										xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_22, thread);
										xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_21, thread);
									}
								}
								xml_utilities.xml_terpri();
								xml_utilities.xml_end_tag_internal($$$userSessionContext);
								{
									SubLObject _prev_bind_0_23 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
									SubLObject _prev_bind_1_24 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
									try {
										xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
										xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
										xml_utilities.xml_start_tag_internal($$$userParsingContext, NIL, NIL);
										cycml.cycml_serialize_term(user_parsing_mt);
									} finally {
										xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_24, thread);
										xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_23, thread);
									}
								}
								xml_utilities.xml_terpri();
								xml_utilities.xml_end_tag_internal($$$userParsingContext);
								{
									SubLObject _prev_bind_0_25 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
									SubLObject _prev_bind_1_26 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
									try {
										xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
										xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
										xml_utilities.xml_start_tag_internal($$$userGenerationContext, NIL, NIL);
										cycml.cycml_serialize_term(user_generation_mt);
									} finally {
										xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_26, thread);
										xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_25, thread);
									}
								}
								xml_utilities.xml_terpri();
								xml_utilities.xml_end_tag_internal($$$userGenerationContext);
							} finally {
								xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1, thread);
								xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_14, thread);
							}
						}
						xml_utilities.xml_terpri();
						xml_utilities.xml_end_tag_internal($$$userMapping);
					} finally {
						xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
					}
				}
			}
			return user;
		}
	}

	public static final SubLObject benchmark_user_and_session_initialization() {
		{
			SubLObject id = random.random($int$1000000000);
			SubLObject user_results = create_mysentient_user_with_external_id(princ_to_string(id), UNPROVIDED, UNPROVIDED);
			SubLObject user = user_results.first();
			SubLObject mts = second(user_results);
			SubLObject profile_mt = mts.first();
			SubLObject generation_mt = second(mts);
			SubLObject parsing_mt = third(mts);
			SubLObject lexical_mt = fourth(mts);
			SubLObject session_results = create_new_mysentient_user_session(user, profile_mt, $str_alt427$en_UK, UNPROVIDED);
			SubLObject session = session_results.first();
			SubLObject session_mt = second(session_results);
			return format(T, $str_alt428$user__A__profile_mt__A__generatio, new SubLObject[] { user, profile_mt, generation_mt, parsing_mt, lexical_mt, session, session_mt });
		}
	}

	public static final SubLObject declare_mysentient_user_profile_manager_widgets_file() {
		declareFunction("clear_get_intended_referent_for_term", "CLEAR-GET-INTENDED-REFERENT-FOR-TERM", 0, 0, false);
		declareFunction("remove_get_intended_referent_for_term", "REMOVE-GET-INTENDED-REFERENT-FOR-TERM", 2, 0, false);
		declareFunction("get_intended_referent_for_term_internal", "GET-INTENDED-REFERENT-FOR-TERM-INTERNAL", 2, 0, false);
		declareFunction("get_intended_referent_for_term", "GET-INTENDED-REFERENT-FOR-TERM", 2, 0, false);
		declareFunction("get_clarifying_isas_for_term", "GET-CLARIFYING-ISAS-FOR-TERM", 2, 1, false);
		declareFunction("expansion_cycls_for_strategy", "EXPANSION-CYCLS-FOR-STRATEGY", 3, 3, false);
		declareFunction("alternate_phrases", "ALTERNATE-PHRASES", 2, 1, false);
		declareFunction("alt_phrase_expansions_for_peg", "ALT-PHRASE-EXPANSIONS-FOR-PEG", 3, 2, false);
		declareFunction("mention_string", "MENTION-STRING", 2, 0, false);
		declareFunction("get_terms_learned_this_session", "GET-TERMS-LEARNED-THIS-SESSION", 1, 0, false);
		declareFunction("get_interaction_emotions_learned_this_session", "GET-INTERACTION-EMOTIONS-LEARNED-THIS-SESSION", 1, 0, false);
		declareFunction("wipe_session_mt_contents", "WIPE-SESSION-MT-CONTENTS", 1, 0, false);
		declareFunction("expansions_of_type_for_peg", "EXPANSIONS-OF-TYPE-FOR-PEG", 5, 2, false);
		declareFunction("mys_expansion_phrase", "MYS-EXPANSION-PHRASE", 2, 0, false);
		declareFunction("get_expansion_strategy_strings", "GET-EXPANSION-STRATEGY-STRINGS", 0, 1, false);
		declareFunction("mys_expansion_strategies", "MYS-EXPANSION-STRATEGIES", 1, 0, false);
		declareFunction("clear_mys_expansion_strategies_cached", "CLEAR-MYS-EXPANSION-STRATEGIES-CACHED", 0, 0, false);
		declareFunction("remove_mys_expansion_strategies_cached", "REMOVE-MYS-EXPANSION-STRATEGIES-CACHED", 1, 0, false);
		declareFunction("mys_expansion_strategies_cached_internal", "MYS-EXPANSION-STRATEGIES-CACHED-INTERNAL", 1, 0, false);
		declareFunction("mys_expansion_strategies_cached", "MYS-EXPANSION-STRATEGIES-CACHED", 1, 0, false);
		declareFunction("get_all_expansion_strategy_strings", "GET-ALL-EXPANSION-STRATEGY-STRINGS", 0, 1, false);
		declareFunction("mys_all_expansion_strategies", "MYS-ALL-EXPANSION-STRATEGIES", 1, 0, false);
		declareFunction("mys_get_expansion_function_for_type", "MYS-GET-EXPANSION-FUNCTION-FOR-TYPE", 1, 0, false);
		declareFunction("set_mys_max_expansion_count_total", "SET-MYS-MAX-EXPANSION-COUNT-TOTAL", 1, 0, false);
		declareFunction("get_max_expansions_per_module", "GET-MAX-EXPANSIONS-PER-MODULE", 0, 0, false);
		declareFunction("max_generality_estimate", "MAX-GENERALITY-ESTIMATE", 0, 0, false);
		declareFunction("myse_generality_estimate", "MYSE-GENERALITY-ESTIMATE", 1, 0, false);
		declareFunction("assign_np_referent", "ASSIGN-NP-REFERENT", 6, 0, false);
		declareFunction("clarify_np_reference", "CLARIFY-NP-REFERENCE", 5, 0, false);
		declareFunction("note_np_reference", "NOTE-NP-REFERENCE", 5, 0, false);
		declareFunction("note_np_reference_int", "NOTE-NP-REFERENCE-INT", 7, 0, false);
		declareFunction("note_nbar_reference", "NOTE-NBAR-REFERENCE", 5, 0, false);
		declareFunction("note_verb_reference", "NOTE-VERB-REFERENCE", 5, 0, false);
		declareFunction("note_utterance_reference", "NOTE-UTTERANCE-REFERENCE", 6, 1, false);
		declareFunction("note_pos_reference", "NOTE-POS-REFERENCE", 6, 1, false);
		declareFunction("assert_peg_dependencies", "ASSERT-PEG-DEPENDENCIES", 3, 0, false);
		declareFunction("mys_cycl_for_force", "MYS-CYCL-FOR-FORCE", 1, 0, false);
		declareFunction("get_most_recent_utterance_peg", "GET-MOST-RECENT-UTTERANCE-PEG", 2, 0, false);
		declareFunction("mys_upm_cleanup", "MYS-UPM-CLEANUP", 1, 0, false);
		declareFunction("add_user_approved_fact", "ADD-USER-APPROVED-FACT", 2, 0, false);
		declareFunction("learn_happiness_from_user_assertion", "LEARN-HAPPINESS-FROM-USER-ASSERTION", 2, 0, false);
		declareFunction("learn_happiness_from_user_approval", "LEARN-HAPPINESS-FROM-USER-APPROVAL", 3, 0, false);
		declareFunction("next_mys_interaction_number", "NEXT-MYS-INTERACTION-NUMBER", 2, 0, false);
		declareFunction("perform_kb_edit", "PERFORM-KB-EDIT", 3, 1, false);
		declareFunction("perform_kb_edit_possibly_on_pegs", "PERFORM-KB-EDIT-POSSIBLY-ON-PEGS", 3, 0, false);
		declareFunction("most_recent_expression_pegs_for_referent_pegs", "MOST-RECENT-EXPRESSION-PEGS-FOR-REFERENT-PEGS", 2, 0, false);
		declareFunction("referent_pegs_from_most_recent_utterance", "REFERENT-PEGS-FROM-MOST-RECENT-UTTERANCE", 1, 0, false);
		declareFunction("most_recent_utterance_peg", "MOST-RECENT-UTTERANCE-PEG", 1, 0, false);
		declareFunction("referents_of_subexpressions", "REFERENTS-OF-SUBEXPRESSIONS", 2, 0, false);
		declareFunction("clear_mys_session_from_session_mt", "CLEAR-MYS-SESSION-FROM-SESSION-MT", 0, 0, false);
		declareFunction("remove_mys_session_from_session_mt", "REMOVE-MYS-SESSION-FROM-SESSION-MT", 1, 0, false);
		declareFunction("mys_session_from_session_mt_internal", "MYS-SESSION-FROM-SESSION-MT-INTERNAL", 1, 0, false);
		declareFunction("mys_session_from_session_mt", "MYS-SESSION-FROM-SESSION-MT", 1, 0, false);
		declareFunction("plural_semanticsP", "PLURAL-SEMANTICS?", 1, 0, false);
		declareFunction("clear_user_from_profile_mt", "CLEAR-USER-FROM-PROFILE-MT", 0, 0, false);
		declareFunction("remove_user_from_profile_mt", "REMOVE-USER-FROM-PROFILE-MT", 1, 0, false);
		declareFunction("user_from_profile_mt_internal", "USER-FROM-PROFILE-MT-INTERNAL", 1, 0, false);
		declareFunction("user_from_profile_mt", "USER-FROM-PROFILE-MT", 1, 0, false);
		declareFunction("definite_referenceP", "DEFINITE-REFERENCE?", 1, 0, false);
		declareFunction("indefinite_referenceP", "INDEFINITE-REFERENCE?", 1, 0, false);
		declareFunction("my_sent_assert_complex_sentence_with_implicature", "MY-SENT-ASSERT-COMPLEX-SENTENCE-WITH-IMPLICATURE", 2, 1, false);
		declareFunction("parse_and_note", "PARSE-AND-NOTE", 4, 0, false);
		declareFunction("parse_and_expand", "PARSE-AND-EXPAND", 1, 6, false);
		declareFunction("next_peg_id_for_session", "NEXT-PEG-ID-FOR-SESSION", 1, 0, false);
		declareFunction("latest_question_number_for_session", "LATEST-QUESTION-NUMBER-FOR-SESSION", 1, 0, false);
		declareFunction("next_question_number_for_session", "NEXT-QUESTION-NUMBER-FOR-SESSION", 1, 0, false);
		declareFunction("create_new_mysentient_user_session", "CREATE-NEW-MYSENTIENT-USER-SESSION", 3, 1, false);
		declareFunction("create_mysentient_user_session_term", "CREATE-MYSENTIENT-USER-SESSION-TERM", 1, 0, false);
		declareFunction("create_mysentient_user_session_context", "CREATE-MYSENTIENT-USER-SESSION-CONTEXT", 1, 0, false);
		declareFunction("mysentient_creation_template_allowable_rules", "MYSENTIENT-CREATION-TEMPLATE-ALLOWABLE-RULES", 1, 0, false);
		declareFunction("clear_mysentient_creation_template_forward_rules", "CLEAR-MYSENTIENT-CREATION-TEMPLATE-FORWARD-RULES", 0, 0, false);
		declareFunction("remove_mysentient_creation_template_forward_rules", "REMOVE-MYSENTIENT-CREATION-TEMPLATE-FORWARD-RULES", 1, 0, false);
		declareFunction("mysentient_creation_template_forward_rules_internal", "MYSENTIENT-CREATION-TEMPLATE-FORWARD-RULES-INTERNAL", 1, 0, false);
		declareFunction("mysentient_creation_template_forward_rules", "MYSENTIENT-CREATION-TEMPLATE-FORWARD-RULES", 1, 0, false);
		declareFunction("mark_mysentient_user_session_context_as_active", "MARK-MYSENTIENT-USER-SESSION-CONTEXT-AS-ACTIVE", 3, 0, false);
		declareFunction("unmark_all_mysentient_user_session_contexts_marked_active", "UNMARK-ALL-MYSENTIENT-USER-SESSION-CONTEXTS-MARKED-ACTIVE", 1, 0, false);
		declareFunction("mysentient_assert_wff_assertion_specifications", "MYSENTIENT-ASSERT-WFF-ASSERTION-SPECIFICATIONS", 2, 0, false);
		declareFunction("mysentient_assert_assertion_specifications", "MYSENTIENT-ASSERT-ASSERTION-SPECIFICATIONS", 2, 0, false);
		declareFunction("get_mysentient_user_profile_mt", "GET-MYSENTIENT-USER-PROFILE-MT", 1, 1, false);
		declareFunction("get_mysentient_userprofile_parsing_mt", "GET-MYSENTIENT-USERPROFILE-PARSING-MT", 1, 1, false);
		declareFunction("get_mysentient_userprofile_generation_mt", "GET-MYSENTIENT-USERPROFILE-GENERATION-MT", 1, 1, false);
		declareFunction("get_mysentient_userprofile_lexical_mt", "GET-MYSENTIENT-USERPROFILE-LEXICAL-MT", 1, 1, false);
		declareFunction("get_mysentient_userprofile_lexical_mts", "GET-MYSENTIENT-USERPROFILE-LEXICAL-MTS", 1, 1, false);
		declareFunction("get_mysentient_user_mts", "GET-MYSENTIENT-USER-MTS", 1, 1, false);
		declareFunction("combine_mysentient_user_mts", "COMBINE-MYSENTIENT-USER-MTS", 4, 0, false);
		declareFunction("get_mysentient_user_profile_mt_from_user_mts", "GET-MYSENTIENT-USER-PROFILE-MT-FROM-USER-MTS", 1, 0, false);
		declareFunction("get_mysentient_userprofile_generation_mt_from_user_mts", "GET-MYSENTIENT-USERPROFILE-GENERATION-MT-FROM-USER-MTS", 1, 0, false);
		declareFunction("get_mysentient_userprofile_parsing_mt_from_user_mts", "GET-MYSENTIENT-USERPROFILE-PARSING-MT-FROM-USER-MTS", 1, 0, false);
		declareFunction("get_all_mysentient_userprofile_sessions_from_user_profile", "GET-ALL-MYSENTIENT-USERPROFILE-SESSIONS-FROM-USER-PROFILE", 1, 1, false);
		declareFunction("get_all_mysentient_userprofile_session_mts_from_user_profile", "GET-ALL-MYSENTIENT-USERPROFILE-SESSION-MTS-FROM-USER-PROFILE", 1, 1, false);
		declareFunction("get_active_mysentient_session_information_from_user_profile", "GET-ACTIVE-MYSENTIENT-SESSION-INFORMATION-FROM-USER-PROFILE", 1, 1, false);
		declareFunction("get_active_mysentient_session_term_from_session_information", "GET-ACTIVE-MYSENTIENT-SESSION-TERM-FROM-SESSION-INFORMATION", 1, 0, false);
		declareFunction("get_active_mysentient_session_mt_from_session_information", "GET-ACTIVE-MYSENTIENT-SESSION-MT-FROM-SESSION-INFORMATION", 1, 0, false);
		declareFunction("create_mysentient_user_with_external_id", "CREATE-MYSENTIENT-USER-WITH-EXTERNAL-ID", 1, 2, false);
		declareFunction("create_mysentient_user_curried_term", "CREATE-MYSENTIENT-USER-CURRIED-TERM", 2, 0, false);
		declareFunction("create_mysentient_user_profile_mt", "CREATE-MYSENTIENT-USER-PROFILE-MT", 1, 0, false);
		declareFunction("create_mysentient_user_term", "CREATE-MYSENTIENT-USER-TERM", 1, 0, false);
		declareFunction("create_mysentient_user_profile_generation_mt", "CREATE-MYSENTIENT-USER-PROFILE-GENERATION-MT", 1, 0, false);
		declareFunction("create_mysentient_user_profile_lexical_mt", "CREATE-MYSENTIENT-USER-PROFILE-LEXICAL-MT", 1, 0, false);
		declareFunction("create_mysentient_user_profile_parsing_mt", "CREATE-MYSENTIENT-USER-PROFILE-PARSING-MT", 1, 0, false);
		declareFunction("set_mysentient_session_language", "SET-MYSENTIENT-SESSION-LANGUAGE", 3, 0, false);
		declareFunction("mysentient_language_code_to_language", "MYSENTIENT-LANGUAGE-CODE-TO-LANGUAGE", 1, 0, false);
		declareFunction("mysentient_get_language_of_language_code_from_kb", "MYSENTIENT-GET-LANGUAGE-OF-LANGUAGE-CODE-FROM-KB", 1, 0, false);
		declareFunction("get_mysentient_user_from_external_id", "GET-MYSENTIENT-USER-FROM-EXTERNAL-ID", 1, 2, false);
		declareFunction("get_mysentient_userprofile_persistence_store_key", "GET-MYSENTIENT-USERPROFILE-PERSISTENCE-STORE-KEY", 1, 2, false);
		declareFunction("set_mysentient_userprofile_persistence_store_key", "SET-MYSENTIENT-USERPROFILE-PERSISTENCE-STORE-KEY", 2, 2, false);
		declareFunction("mysentient_user_profile_mt_loadedP", "MYSENTIENT-USER-PROFILE-MT-LOADED?", 1, 0, false);
		declareFunction("load_mysentient_user_information", "LOAD-MYSENTIENT-USER-INFORMATION", 1, 0, false);
		declareFunction("save_mysentient_user_information", "SAVE-MYSENTIENT-USER-INFORMATION", 1, 2, false);
		declareFunction("save_mysentient_user_information_as_hex_string", "SAVE-MYSENTIENT-USER-INFORMATION-AS-HEX-STRING", 3, 0, false);
		declareFunction("get_mysentient_user_information_in_hex", "GET-MYSENTIENT-USER-INFORMATION-IN-HEX", 1, 2, false);
		declareFunction("get_mysentient_user_information_in_xml", "GET-MYSENTIENT-USER-INFORMATION-IN-XML", 1, 2, false);
		declareFunction("serialize_mysentient_user_partition", "SERIALIZE-MYSENTIENT-USER-PARTITION", 1, 1, false);
		declareFunction("determine_mysentient_user_partition_specification", "DETERMINE-MYSENTIENT-USER-PARTITION-SPECIFICATION", 2, 0, false);
		declareFunction("load_mysentient_user_partition", "LOAD-MYSENTIENT-USER-PARTITION", 1, 1, false);
		declareFunction("display_mysentient_user_partition", "DISPLAY-MYSENTIENT-USER-PARTITION", 1, 1, false);
		declareFunction("mysentient_upm_test_generate_xml_for_user_block", "MYSENTIENT-UPM-TEST-GENERATE-XML-FOR-USER-BLOCK", 1, 1, false);
		declareFunction("benchmark_user_and_session_initialization", "BENCHMARK-USER-AND-SESSION-INITIALIZATION", 0, 0, false);
		return NIL;
	}

	public static final SubLObject init_mysentient_user_profile_manager_widgets_file() {
		deflexical("*GET-INTENDED-REFERENT-FOR-TERM-CACHING-STATE*", NIL);
		defparameter("*MYS-EXPANSION-QUERY-MAX-TIME*", TEN_INTEGER);
		defparameter("*MYS-DEFAULT-EXPANSION-WEIGHT*", $float$0_8);
		deflexical("*MYS-EXPANSION-STRATEGIES-CACHED-CACHING-STATE*", NIL);
		defparameter("*EXPANSION-STRATEGY-MAP*", $list_alt93);
		defparameter("*MYS-MAX-EXPANSION-COUNT-TOTAL*", $int$25);
		defparameter("*MYS-EXPANSION-MODULE-COUNT*", FIVE_INTEGER);
		defparameter("*MAX-GENERALITY-ESTIMATE*", NIL);
		defparameter("*MYS-TREAT-INDEFINITE-NPS-AS-NBARS*", T);
		defparameter("*MYS-TREAT-ALL-NPS-AS-NBARS*", T);
		defparameter("*MYS-TREAT-DEFINITE-NPS-AS-NBARS*", NIL);
		defparameter("*MOST-RECENT-MYS-INTERACTION-NUMBER-COUNT-DICT*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
		deflexical("*MYS-SESSION-FROM-SESSION-MT-CACHING-STATE*", NIL);
		deflexical("*USER-FROM-PROFILE-MT-CACHING-STATE*", NIL);
		defparameter("*MYS-PEG-COUNT*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
		deflexical("*MYS-QUESTION-COUNT*", NIL != boundp($mys_question_count$) ? ((SubLObject) ($mys_question_count$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
		deflexical("*MYSENTIENT-USER-DATABASE-TERM*", $$TheDefaultMySentientUserDatabase);
		deflexical("*MYSENTIENT-PERSISTENCE-STORE-TERM*", $const260$TheDefaultMySentientPersistenceSt);
		deflexical("*MYSENTIENT-GENERIC-TERM-PREFIX*", $$$MySe);
		deflexical("*MYSENTIENT-SESSION-TERM-PREFIX*", $$$AnswersSession);
		deflexical("*MYSENTIENT-SESSION-CONTEXT-PREFIX*", cconcatenate($mysentient_session_term_prefix$.getGlobalValue(), $$$Mt));
		deflexical("*MYSENTIENT-CREATION-TEMPLATE-FORWARD-RULES-CACHING-STATE*", NIL);
		deflexical("*MYSENTIENT-ANONYMOUS-USER-PREFIX*", $$$AnonUser);
		deflexical("*MYSENTIENT-ANONYMOUS-USER-PROFILE-MT-PREFIX*", $$$AnonUserProfileMt);
		deflexical("*MYSENTIENT-ANONYMOUS-USER-GENERATION-MT-PREFIX*", $$$AnonUserGenerationMt);
		deflexical("*MYSENTIENT-ANONYMOUS-USER-PARSING-MT-PREFIX*", $$$AnonUserParsingMt);
		deflexical("*MYSENTIENT-ANONYMOUS-USER-LEXICAL-MT-PREFIX*", $$$AnonUserLexicalMt);
		deflexical("*MYSENTIENT-DEFAULT-LANGUAGE*", $$BritishEnglishDialect);
		deflexical("*MYSENTIENT-AUTO-EXCISE-SAVED-USER-INFORMATION?*", NIL);
		deflexical("*MYSENTIENT-USER-PARTITION-MAJOR-VERSION-MARKER*", ONE_INTEGER);
		deflexical("*MYSENTIENT-USER-PARTITION-MINOR-VERSION-MARKER*", ONE_INTEGER);
		return NIL;
	}

	public static final SubLObject setup_mysentient_user_profile_manager_widgets_file() {
		memoization_state.note_globally_cached_function(GET_INTENDED_REFERENT_FOR_TERM);
		utilities_macros.register_cyc_api_function(GET_CLARIFYING_ISAS_FOR_TERM, $list_alt22, $str_alt23$_param_TERM__a_constant_or_nat___, $list_alt24, $list_alt25);
		utilities_macros.register_cyc_api_function(EXPANSION_CYCLS_FOR_STRATEGY, $list_alt41, $str_alt42$_param_TERM__a_constant_or_nat___, $list_alt24, $list_alt25);
		utilities_macros.register_cyc_api_function(ALTERNATE_PHRASES, $list_alt48, $str_alt49$_return_list__a_list_of_alternate, $list_alt50, $list_alt51);
		utilities_macros.register_cyc_api_function(ALT_PHRASE_EXPANSIONS_FOR_PEG, $list_alt54, $str_alt55$given_a_TermMentionedInDialog__se, NIL, NIL);
		utilities_macros.register_cyc_api_function(WIPE_SESSION_MT_CONTENTS, $list_alt70, $str_alt71$_param_SESSION_MT_the_session_to_, $list_alt72, $list_alt73);
		access_macros.register_external_symbol(GET_EXPANSION_STRATEGY_STRINGS);
		access_macros.register_external_symbol(MYS_EXPANSION_STRATEGIES);
		memoization_state.note_globally_cached_function(MYS_EXPANSION_STRATEGIES_CACHED);
		access_macros.register_external_symbol(GET_ALL_EXPANSION_STRATEGY_STRINGS);
		access_macros.register_external_symbol(MYS_ALL_EXPANSION_STRATEGIES);
		utilities_macros.register_cyc_api_function(ASSIGN_NP_REFERENT, $list_alt107, $str_alt108$_param_USEFUL_SEMANTICS__a_consta, NIL, NIL);
		utilities_macros.register_cyc_api_function(CLARIFY_NP_REFERENCE, $list_alt125, $str_alt126$_param_NEW_SEMANTICS_cycl_denotat, NIL, NIL);
		utilities_macros.register_cyc_api_function(NOTE_NP_REFERENCE, $list_alt128, $str_alt129$Conditionalize_when_we_treat__NPs, NIL, NIL);
		utilities_macros.register_cyc_api_function(NOTE_NP_REFERENCE_INT, $list_alt139, $str_alt140$_param_RAW_SEMANTICS_listp__a_lis, NIL, NIL);
		utilities_macros.register_cyc_api_function(NOTE_NBAR_REFERENCE, $list_alt144, $str_alt145$_param_RAW_SEMANTICS_listp__a_lis, NIL, NIL);
		utilities_macros.register_cyc_api_function(NOTE_VERB_REFERENCE, $list_alt148, $str_alt149$_param_RAW_SEMANTICS_listp__a_lis, NIL, NIL);
		utilities_macros.register_cyc_api_function(NOTE_UTTERANCE_REFERENCE, $list_alt161, $str_alt162$_param_RAW_SEMANTICS_listp__a_lis, NIL, NIL);
		utilities_macros.register_cyc_api_function(NOTE_POS_REFERENCE, $list_alt169, $str_alt162$_param_RAW_SEMANTICS_listp__a_lis, NIL, NIL);
		utilities_macros.register_cyc_api_function(ASSERT_PEG_DEPENDENCIES, $list_alt174, $str_alt52$, $list_alt175, $list_alt176);
		utilities_macros.register_cyc_api_function(GET_MOST_RECENT_UTTERANCE_PEG, $list_alt186, $str_alt187$Get_the_most_recent_utterance_peg, $list_alt72, $list_alt188);
		utilities_macros.register_cyc_api_function(MYS_UPM_CLEANUP, $list_alt70, $str_alt190$perform_any_necessary_cleanup_to_, NIL, NIL);
		utilities_macros.register_cyc_api_function(ADD_USER_APPROVED_FACT, $list_alt193, $str_alt194$_param_ASSERT_SENTENCE_cycl_sente, $list_alt195, $list_alt196);
		utilities_macros.register_cyc_api_function(LEARN_HAPPINESS_FROM_USER_ASSERTION, $list_alt202, $str_alt203$If_a_user_agrees_to_assert_someth, $list_alt204, $list_alt176);
		utilities_macros.register_cyc_api_function(LEARN_HAPPINESS_FROM_USER_APPROVAL, $list_alt212, $str_alt213$_param_MSG_TYPE_keywordp__either_, $list_alt214, $list_alt176);
		utilities_macros.register_cyc_api_function(PERFORM_KB_EDIT, $list_alt216, $str_alt217$The_assumption_here_is_that_ORIGI, NIL, NIL);
		utilities_macros.register_cyc_api_function(PERFORM_KB_EDIT_POSSIBLY_ON_PEGS, $list_alt222, $str_alt223$Perform_the_KB_edit_specified__an, $list_alt224, $list_alt225);
		memoization_state.note_globally_cached_function(MYS_SESSION_FROM_SESSION_MT);
		memoization_state.note_globally_cached_function(USER_FROM_PROFILE_MT);
		subl_macro_promotions.declare_defglobal($mys_question_count$);
		utilities_macros.register_cyc_api_function(CREATE_NEW_MYSENTIENT_USER_SESSION, $list_alt274, $str_alt275$Creates_the_new_infrastructure_fo, $list_alt276, $list_alt277);
		memoization_state.note_globally_cached_function(MYSENTIENT_CREATION_TEMPLATE_FORWARD_RULES);
		utilities_macros.register_cyc_api_function(GET_MYSENTIENT_USER_PROFILE_MT, $list_alt289, $str_alt290$Gets_the_user_profile_Mt_informat, $list_alt291, $list_alt73);
		utilities_macros.register_cyc_api_function(GET_MYSENTIENT_USERPROFILE_PARSING_MT, $list_alt295, $str_alt296$Gets_the_parsing_Mt_associated_wi, $list_alt297, $list_alt73);
		utilities_macros.register_cyc_api_function(GET_MYSENTIENT_USERPROFILE_GENERATION_MT, $list_alt295, $str_alt301$Gets_the_generation_Mt_associated, $list_alt297, $list_alt73);
		utilities_macros.register_cyc_api_function(GET_MYSENTIENT_USERPROFILE_LEXICAL_MT, $list_alt295, $str_alt304$Gets_a_lexical_Mt_associated_with, $list_alt297, $list_alt73);
		utilities_macros.register_cyc_api_function(GET_MYSENTIENT_USERPROFILE_LEXICAL_MTS, $list_alt295, $str_alt306$Gets_the_lexical_Mts_associated_w, $list_alt297, $list_alt307);
		utilities_macros.register_cyc_api_function(GET_MYSENTIENT_USER_MTS, $list_alt289, $str_alt312$Maps_the_user_to_their_Mts__Retur, $list_alt276, NIL);
		utilities_macros.register_cyc_api_function(COMBINE_MYSENTIENT_USER_MTS, $list_alt314, $str_alt315$Put_them_together_into_the_right_, $list_alt316, $list_alt307);
		utilities_macros.register_cyc_api_function(GET_MYSENTIENT_USER_PROFILE_MT_FROM_USER_MTS, $list_alt318, $$$Extract_just_the_user_profile_mt, $list_alt320, $list_alt73);
		utilities_macros.register_cyc_api_function(GET_MYSENTIENT_USERPROFILE_GENERATION_MT_FROM_USER_MTS, $list_alt318, $str_alt322$Extract_just_the_user_profile_gen, $list_alt320, $list_alt73);
		utilities_macros.register_cyc_api_function(GET_MYSENTIENT_USERPROFILE_PARSING_MT_FROM_USER_MTS, $list_alt318, $str_alt324$Extract_just_the_user_profile_par, $list_alt320, $list_alt73);
		utilities_macros.register_cyc_api_function(GET_ALL_MYSENTIENT_USERPROFILE_SESSIONS_FROM_USER_PROFILE, $list_alt295, $str_alt326$Given_the_user_profile_mt__comput, $list_alt327, $list_alt225);
		utilities_macros.register_cyc_api_function(GET_ALL_MYSENTIENT_USERPROFILE_SESSION_MTS_FROM_USER_PROFILE, $list_alt295, $str_alt331$Given_the_user_profile_mt__comput, $list_alt327, $list_alt225);
		utilities_macros.register_cyc_api_function(GET_ACTIVE_MYSENTIENT_SESSION_INFORMATION_FROM_USER_PROFILE, $list_alt295, $str_alt337$Given_the_user_profile_mt__comput, $list_alt327, $list_alt277);
		utilities_macros.register_cyc_api_function(GET_ACTIVE_MYSENTIENT_SESSION_TERM_FROM_SESSION_INFORMATION, $list_alt339, $str_alt340$Given_the_session_information__pi, $list_alt341, $list_alt188);
		utilities_macros.register_cyc_api_function(GET_ACTIVE_MYSENTIENT_SESSION_MT_FROM_SESSION_INFORMATION, $list_alt339, $str_alt343$Given_the_session_information__pi, $list_alt341, $list_alt188);
		utilities_macros.register_cyc_api_function(CREATE_MYSENTIENT_USER_WITH_EXTERNAL_ID, $list_alt360, $str_alt361$Establish_the_anonymous_user_and_, $list_alt362, $list_alt225);
		utilities_macros.register_cyc_api_function(GET_MYSENTIENT_USER_FROM_EXTERNAL_ID, $list_alt374, $str_alt375$Map_the_external_user_s_ID_string, $list_alt376, $list_alt188);
		utilities_macros.register_cyc_api_function(GET_MYSENTIENT_USERPROFILE_PERSISTENCE_STORE_KEY, $list_alt380, $str_alt381$Get_the_key_under_which_we_can_lo, $list_alt382, $list_alt383);
		utilities_macros.register_cyc_api_function(SET_MYSENTIENT_USERPROFILE_PERSISTENCE_STORE_KEY, $list_alt385, $str_alt386$Define_the_key_under_which_we_can, $list_alt387, $list_alt388);
		utilities_macros.register_cyc_api_function($sym389$MYSENTIENT_USER_PROFILE_MT_LOADED_, $list_alt390, $str_alt391$Check_whether_the_user_profile_mt, $list_alt392, $list_alt393);
		utilities_macros.register_cyc_api_function(LOAD_MYSENTIENT_USER_INFORMATION, $list_alt396, $str_alt397$Load_the_mysentient_user_informat, $list_alt398, $list_alt225);
		utilities_macros.register_cyc_api_function(SAVE_MYSENTIENT_USER_INFORMATION, $list_alt401, $str_alt402$Save_the_mysentient_user_informat, $list_alt403, $list_alt404);
		utilities_macros.register_cyc_api_function(GET_MYSENTIENT_USER_INFORMATION_IN_HEX, $list_alt401, $str_alt406$Save_the_mysentient_user_informat, $list_alt403, $list_alt383);
		utilities_macros.register_cyc_api_function(GET_MYSENTIENT_USER_INFORMATION_IN_XML, $list_alt401, $str_alt410$Save_the_mysentient_user_informat, $list_alt403, $list_alt383);
		return NIL;
	}

	// // Internal Constants
	private static final SubLSymbol GET_INTENDED_REFERENT_FOR_TERM = makeSymbol("GET-INTENDED-REFERENT-FOR-TERM");

	public static final SubLObject $$LinguisticExpressionPeg = constant_handles.reader_make_constant_shell(makeString("LinguisticExpressionPeg"));

	public static final SubLObject $$intendedReferent = constant_handles.reader_make_constant_shell(makeString("intendedReferent"));

	static private final SubLList $list_alt4 = list($DREF);

	static private final SubLList $list_alt5 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));

	public static final SubLObject $$naiveReferent = constant_handles.reader_make_constant_shell(makeString("naiveReferent"));

	public static final SubLObject $$referent = constant_handles.reader_make_constant_shell(makeString("referent"));

	public static final SubLObject $$pegInterpretations = constant_handles.reader_make_constant_shell(makeString("pegInterpretations"));

	public static final SubLSymbol $get_intended_referent_for_term_caching_state$ = makeSymbol("*GET-INTENDED-REFERENT-FOR-TERM-CACHING-STATE*");

	public static final SubLSymbol $kw10$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

	public static final SubLObject $$mostNotableIsa = constant_handles.reader_make_constant_shell(makeString("mostNotableIsa"));

	static private final SubLList $list_alt15 = list(makeKeyword("ANSWER"));

	private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

	public static final SubLObject $$nearestIsaOfType = constant_handles.reader_make_constant_shell(makeString("nearestIsaOfType"));

	static private final SubLList $list_alt19 = list(constant_handles.reader_make_constant_shell(makeString("ClarifyingCollectionType")), makeKeyword("ANSWER"));

	public static final SubLObject $$nearestIsa = constant_handles.reader_make_constant_shell(makeString("nearestIsa"));

	private static final SubLSymbol GET_CLARIFYING_ISAS_FOR_TERM = makeSymbol("GET-CLARIFYING-ISAS-FOR-TERM");

	static private final SubLList $list_alt22 = list(makeSymbol("TERM"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("MAX-NUMBER"));

	static private final SubLString $str_alt23$_param_TERM__a_constant_or_nat___ = makeString("@param TERM: a constant or nat\n   @param MT: a hl microtheory\n   @return LISTP: a list of terms for which may be used for claifying or redescribing the thing denoted by TERM.");

	static private final SubLList $list_alt24 = list(list(makeSymbol("TERM"), makeSymbol("CYCL-DENOTATIONAL-TERM-P")), list(makeSymbol("MT"), makeSymbol("HLMT-P")));

	static private final SubLList $list_alt25 = list(list(makeSymbol("LIST"), makeSymbol("CYCL-DENOTATIONAL-TERM-P")));

	public static final SubLObject $$implies = constant_handles.reader_make_constant_shell(makeString("implies"));

	public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

	static private final SubLSymbol $sym29$_X = makeSymbol("?X");

	public static final SubLObject $$irExpansionCandidate = constant_handles.reader_make_constant_shell(makeString("irExpansionCandidate"));

	static private final SubLList $list_alt31 = list(makeKeyword("SET"));

	public static final SubLObject $$MtSpace = constant_handles.reader_make_constant_shell(makeString("MtSpace"));

	static private final SubLList $list_alt33 = list(constant_handles.reader_make_constant_shell(makeString("AnytimePSC")));

	public static final SubLSymbol $kw36$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");

	private static final SubLSymbol EXPANSION_CYCLS_FOR_STRATEGY = makeSymbol("EXPANSION-CYCLS-FOR-STRATEGY");

	static private final SubLList $list_alt41 = list(makeSymbol("TERM"), makeSymbol("STRATEGY"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("MAX-NUMBER"), makeSymbol("INSTANTIATE-COLLECTIONS?"), list(makeSymbol("MAX-TIME"), makeSymbol("*MYS-EXPANSION-QUERY-MAX-TIME*")));

	static private final SubLString $str_alt42$_param_TERM__a_constant_or_nat___ = makeString("@param TERM: a constant or nat\n   @param MT: a hlmt-p\n   @return LISTP: the list of all definitional terms (collections or predicates)\n   for TERM");

	public static final SubLFloat $float$0_8 = makeDouble(0.8);

	private static final SubLSymbol ALTERNATE_PHRASES = makeSymbol("ALTERNATE-PHRASES");

	static private final SubLList $list_alt48 = list(makeSymbol("TERM"), makeSymbol("KNOWN-PHRASE"), makeSymbol("&OPTIONAL"), list(makeSymbol("MT"), makeSymbol("*LEXICON-LOOKUP-MT*")));

	static private final SubLString $str_alt49$_return_list__a_list_of_alternate = makeString("@return list; a list of alternate English phrases for TERM, not including KNOWN-PHRASE");

	static private final SubLList $list_alt50 = list(list(makeSymbol("TERM"), makeSymbol("CYCL-EXPRESSION-P")), list(makeSymbol("KNOWN-PHRASE"), makeSymbol("STRINGP")), list(makeSymbol("MT"), makeSymbol("MICROTHEORY-P")));

	static private final SubLList $list_alt51 = list(list(makeSymbol("LIST"), makeSymbol("STRINGP")));

	static private final SubLString $str_alt52$ = makeString("");

	private static final SubLSymbol ALT_PHRASE_EXPANSIONS_FOR_PEG = makeSymbol("ALT-PHRASE-EXPANSIONS-FOR-PEG");

	static private final SubLList $list_alt54 = list(makeSymbol("PEG"), makeSymbol("PROFILE-MT"), makeSymbol("SESSION-MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("MT"), makeSymbol("*LEXICON-LOOKUP-MT*")), makeSymbol("MAX-NUM"));

	static private final SubLString $str_alt55$given_a_TermMentionedInDialog__se = makeString("given a TermMentionedInDialog, see what other phrases we have that could refer to said TermMentionedInDialog");

	public static final SubLObject $$originalPhrase = constant_handles.reader_make_constant_shell(makeString("originalPhrase"));

	static private final SubLList $list_alt58 = list(makeKeyword("STRING"));

	public static final SubLObject $$and = constant_handles.reader_make_constant_shell(makeString("and"));

	public static final SubLObject $$ist = constant_handles.reader_make_constant_shell(makeString("ist"));

	static private final SubLList $list_alt62 = list(list(constant_handles.reader_make_constant_shell(makeString("isa")), $TERM, constant_handles.reader_make_constant_shell(makeString("DiscourseTrackingPeg"))));

	public static final SubLObject $$definingMt = constant_handles.reader_make_constant_shell(makeString("definingMt"));

	static private final SubLList $list_alt64 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));

	private static final SubLSymbol $INTERACTIONS = makeKeyword("INTERACTIONS");

	public static final SubLObject $$ist_Asserted = constant_handles.reader_make_constant_shell(makeString("ist-Asserted"));

	static private final SubLList $list_alt67 = list(list(constant_handles.reader_make_constant_shell(makeString("feelsTowardsObject-Ternary")), makeSymbol("??USER"), makeKeyword("INTERACTIONS"), makeSymbol("??FEELINGS")));

	private static final SubLSymbol WIPE_SESSION_MT_CONTENTS = makeSymbol("WIPE-SESSION-MT-CONTENTS");

	static private final SubLList $list_alt70 = list(makeSymbol("SESSION-MT"));

	static private final SubLString $str_alt71$_param_SESSION_MT_the_session_to_ = makeString("@param SESSION-MT the session to wipe");

	static private final SubLList $list_alt72 = list(list(makeSymbol("SESSION-MT"), makeSymbol("POSSIBLY-HLMT-P")));

	static private final SubLList $list_alt73 = list(makeSymbol("POSSIBLY-HLMT-P"));

	static private final SubLString $str_alt74$Can_t_provide_expansions_for_ = makeString("Can't provide expansions for ");

	static private final SubLString $str_alt75$_because_I_got_a_null_referent = makeString(" because I got a null referent");

	static private final SubLString $str_alt77$_PPH_error_level_ = makeString("(PPH error level ");

	static private final SubLString $str_alt78$__ = makeString(") ");

	static private final SubLString $str_alt79$_is_not_a_ = makeString(" is not a ");

	private static final SubLSymbol GET_EXPANSION_STRATEGY_STRINGS = makeSymbol("GET-EXPANSION-STRATEGY-STRINGS");

	public static final SubLObject $$MySentientUPMMt = constant_handles.reader_make_constant_shell(makeString("MySentientUPMMt"));

	private static final SubLSymbol MYS_EXPANSION_STRATEGIES = makeSymbol("MYS-EXPANSION-STRATEGIES");

	private static final SubLSymbol MYS_EXPANSION_STRATEGIES_CACHED = makeSymbol("MYS-EXPANSION-STRATEGIES-CACHED");

	public static final SubLObject $const86$MySe_FindValidExpansionStrategies = constant_handles.reader_make_constant_shell(makeString("MySe-FindValidExpansionStrategiesAndAttributeValues"));

	static private final SubLList $list_alt87 = list(makeSymbol("?STRING"), makeSymbol("?STRATEGY"));

	public static final SubLSymbol $mys_expansion_strategies_cached_caching_state$ = makeSymbol("*MYS-EXPANSION-STRATEGIES-CACHED-CACHING-STATE*");

	private static final SubLSymbol GET_ALL_EXPANSION_STRATEGY_STRINGS = makeSymbol("GET-ALL-EXPANSION-STRATEGY-STRINGS");

	private static final SubLSymbol MYS_ALL_EXPANSION_STRATEGIES = makeSymbol("MYS-ALL-EXPANSION-STRATEGIES");

	static private final SubLString $str_alt91$MySe_FindAllPossibleExpansionStra = makeString("MySe-FindAllPossibleExpansionStrategiesAndTheirAttributeValues");

	public static final SubLObject $const92$MySe_FindAllPossibleExpansionStra = constant_handles.reader_make_constant_shell(makeString("MySe-FindAllPossibleExpansionStrategiesAndTheirAttributeValues"));

	static private final SubLList $list_alt93 = list(new SubLObject[] { cons(makeString("terse"), constant_handles.reader_make_constant_shell(makeString("ProvideTerseExpansions-IRExpansionStrategy"))), cons(makeString("asserted"), constant_handles.reader_make_constant_shell(makeString("ProvideDefinitionalAssertions-IRExpansionStrategy"))),
			cons(makeString("coarse-grained"), constant_handles.reader_make_constant_shell(makeString("ProvideCoarseYetReasonableDefinitionalInformation-IRExpansionStrategy"))), cons(makeString("parts_sub"), constant_handles.reader_make_constant_shell(makeString("ProvideSubPartsExpansions-IRExpansionStrategy"))),
			cons(makeString("parts_super"), constant_handles.reader_make_constant_shell(makeString("ProvideSuperPartsExpansions-IRExpansionStrategy"))), cons(makeString("specializations"), constant_handles.reader_make_constant_shell(makeString("ProvideExpansionsBasedOnInstancesOfFacetingCollections-IRExpansionStrategy"))),
			cons(makeString("genls"), constant_handles.reader_make_constant_shell(makeString("ProvideBestGeneralizations-IRExpansionStrategy"))), cons(makeString("isa"), constant_handles.reader_make_constant_shell(makeString("ProvideBestIsas-IRExpansionStrategy"))), cons(makeString("related"), constant_handles.reader_make_constant_shell(makeString("ProvideConceptuallyRelatedConcepts-IRExpansionStrategy"))),
			cons(makeString("alt_phrase"), makeSymbol("ALT-PHRASE-EXPANSIONS-FOR-PEG")) });

	public static final SubLInteger $int$25 = makeInteger(25);

	public static final SubLObject $$Thing = constant_handles.reader_make_constant_shell(makeString("Thing"));

	public static final SubLObject $$unknownSentence = constant_handles.reader_make_constant_shell(makeString("unknownSentence"));

	static private final SubLList $list_alt97 = list(constant_handles.reader_make_constant_shell(makeString("SetOrCollection")));

	static private final SubLList $list_alt98 = list(constant_handles.reader_make_constant_shell(makeString("IndexicalConcept")));

	static private final SubLString $str_alt99$_referentPeg = makeString(" referentPeg");

	static private final SubLList $list_alt100 = list(constant_handles.reader_make_constant_shell(makeString("DiscourseReferentPeg")));

	public static final SubLObject $$operatorFormulas = constant_handles.reader_make_constant_shell(makeString("operatorFormulas"));

	public static final SubLObject $$PronounFn = constant_handles.reader_make_constant_shell(makeString("PronounFn"));

	public static final SubLObject $$BaseKB = constant_handles.reader_make_constant_shell(makeString("BaseKB"));

	public static final SubLObject $$userProfileForPeg = constant_handles.reader_make_constant_shell(makeString("userProfileForPeg"));

	public static final SubLObject $$referentRepresentationComplete = constant_handles.reader_make_constant_shell(makeString("referentRepresentationComplete"));

	private static final SubLSymbol ASSIGN_NP_REFERENT = makeSymbol("ASSIGN-NP-REFERENT");

	static private final SubLList $list_alt107 = list(makeSymbol("EXPR-PEG"), makeSymbol("USEFUL-SEMANTICS"), makeSymbol("NP-STRING"), makeSymbol("PROFILE-MT"), makeSymbol("SESSION-MT"), makeSymbol("PARSING-MT"));

	static private final SubLString $str_alt108$_param_USEFUL_SEMANTICS__a_consta = makeString("@param USEFUL-SEMANTICS: a constant or nat which represents the (resolved) parser output which determines the referent of expr-peg.");

	private static final SubLSymbol $PARSE = makeKeyword("PARSE");

	public static final SubLObject $$parseTermForPeg = constant_handles.reader_make_constant_shell(makeString("parseTermForPeg"));

	static private final SubLList $list_alt111 = list(makeKeyword("PARSE"));

	static private final SubLList $list_alt112 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("MAX-NUMBER"), ONE_INTEGER);

	static private final SubLList $list_alt114 = list(makeKeyword("REF"));

	private static final SubLSymbol $COREF = makeKeyword("COREF");

	public static final SubLObject $$coreferentExpressions = constant_handles.reader_make_constant_shell(makeString("coreferentExpressions"));

	static private final SubLList $list_alt117 = list(makeKeyword("COREF"));

	public static final SubLObject $$moreRecentInDiscourseThan = constant_handles.reader_make_constant_shell(makeString("moreRecentInDiscourseThan"));

	public static final SubLObject $$anaphoraReasoningComplete = constant_handles.reader_make_constant_shell(makeString("anaphoraReasoningComplete"));

	public static final SubLObject $$expressionRepresentationComplete = constant_handles.reader_make_constant_shell(makeString("expressionRepresentationComplete"));

	public static final SubLObject $$clarifiedParseTermForPeg = constant_handles.reader_make_constant_shell(makeString("clarifiedParseTermForPeg"));

	public static final SubLObject $$assertionSentence = constant_handles.reader_make_constant_shell(makeString("assertionSentence"));

	private static final SubLSymbol CLARIFY_NP_REFERENCE = makeSymbol("CLARIFY-NP-REFERENCE");

	static private final SubLList $list_alt125 = list(makeSymbol("EXPR-PEG"), makeSymbol("NEW-SEMANTICS"), makeSymbol("PROFILE-MT"), makeSymbol("SESSION-MT"), makeSymbol("PARSING-MT"));

	static private final SubLString $str_alt126$_param_NEW_SEMANTICS_cycl_denotat = makeString("@param NEW-SEMANTICS cycl-denotational-term-p; a clarified semantic meaning for expr-peg");

	private static final SubLSymbol NOTE_NP_REFERENCE = makeSymbol("NOTE-NP-REFERENCE");

	static private final SubLList $list_alt128 = list(makeSymbol("NP-STRING"), makeSymbol("RAW-SEMANTICS"), makeSymbol("PROFILE-MT"), makeSymbol("SESSION-MT"), makeSymbol("PARSING-MT"));

	static private final SubLString $str_alt129$Conditionalize_when_we_treat__NPs = makeString("Conditionalize when we treat  NPs as anaphoric");

	public static final SubLObject $const130$MySentientNonAnaphoricPegCreation = constant_handles.reader_make_constant_shell(makeString("MySentientNonAnaphoricPegCreationTemplate"));

	static private final SubLString $str_alt132$_expressionPeg = makeString(" expressionPeg");

	static private final SubLList $list_alt133 = list(constant_handles.reader_make_constant_shell(makeString("NounPhraseExpressionPeg")));

	public static final SubLObject $$mentionedBy = constant_handles.reader_make_constant_shell(makeString("mentionedBy"));

	public static final SubLObject $$possibleParseTermForPeg = constant_handles.reader_make_constant_shell(makeString("possibleParseTermForPeg"));

	public static final SubLObject $$rankedParseTermForPeg = constant_handles.reader_make_constant_shell(makeString("rankedParseTermForPeg"));

	public static final SubLObject $$nthExpressionOfSession = constant_handles.reader_make_constant_shell(makeString("nthExpressionOfSession"));

	private static final SubLSymbol NOTE_NP_REFERENCE_INT = makeSymbol("NOTE-NP-REFERENCE-INT");

	static private final SubLList $list_alt139 = list(makeSymbol("NP-STRING"), makeSymbol("RAW-SEMANTICS"), makeSymbol("RESOLVED-SEMANTICS"), makeSymbol("USER"), makeSymbol("PROFILE-MT"), makeSymbol("SESSION-MT"), makeSymbol("PARSING-MT"));

	static private final SubLString $str_alt140$_param_RAW_SEMANTICS_listp__a_lis = makeString("@param RAW-SEMANTICS listp; a list of semantic meanings for NP-STRING");

	static private final SubLString $str_alt141$_ExpPeg = makeString(" ExpPeg");

	static private final SubLList $list_alt142 = list(constant_handles.reader_make_constant_shell(makeString("NominalExpressionPeg")));

	private static final SubLSymbol NOTE_NBAR_REFERENCE = makeSymbol("NOTE-NBAR-REFERENCE");

	static private final SubLList $list_alt144 = list(makeSymbol("NBAR-STRING"), makeSymbol("RAW-SEMANTICS"), makeSymbol("PROFILE-MT"), makeSymbol("SESSION-MT"), makeSymbol("PARSING-MT"));

	static private final SubLString $str_alt145$_param_RAW_SEMANTICS_listp__a_lis = makeString("@param RAW-SEMANTICS listp; a list of semantic meanings for NBAR-STRING");

	static private final SubLList $list_alt146 = list(constant_handles.reader_make_constant_shell(makeString("VerbalExpressionPeg")));

	private static final SubLSymbol NOTE_VERB_REFERENCE = makeSymbol("NOTE-VERB-REFERENCE");

	static private final SubLList $list_alt148 = list(makeSymbol("VERB-STRING"), makeSymbol("RAW-SEMANTICS"), makeSymbol("PROFILE-MT"), makeSymbol("SESSION-MT"), makeSymbol("PARSING-MT"));

	static private final SubLString $str_alt149$_param_RAW_SEMANTICS_listp__a_lis = makeString("@param RAW-SEMANTICS listp; a list of semantic meanings for VERB-STRING");

	public static final SubLObject $$InfoTransferEventForPegFn = constant_handles.reader_make_constant_shell(makeString("InfoTransferEventForPegFn"));

	static private final SubLList $list_alt151 = list(constant_handles.reader_make_constant_shell(makeString("LinguisticExpressionPeg-CompleteUtterance")));

	public static final SubLObject $$properSubEvents = constant_handles.reader_make_constant_shell(makeString("properSubEvents"));

	public static final SubLObject $$nthSubSituationOfType = constant_handles.reader_make_constant_shell(makeString("nthSubSituationOfType"));

	static private final SubLList $list_alt154 = list(constant_handles.reader_make_constant_shell(makeString("PosingAQuestionToTheMySentientAnswersSystem")));

	public static final SubLObject $$pegCorrespondsToInfoTransfer = constant_handles.reader_make_constant_shell(makeString("pegCorrespondsToInfoTransfer"));

	public static final SubLObject $$iteIllocutionaryForce = constant_handles.reader_make_constant_shell(makeString("iteIllocutionaryForce"));

	public static final SubLObject $$sourceOfTerm = constant_handles.reader_make_constant_shell(makeString("sourceOfTerm"));

	static private final SubLList $list_alt158 = list(constant_handles.reader_make_constant_shell(makeString("MySentientInputProcessorModule")));

	public static final SubLObject $$BookkeepingMt = constant_handles.reader_make_constant_shell(makeString("BookkeepingMt"));

	private static final SubLSymbol NOTE_UTTERANCE_REFERENCE = makeSymbol("NOTE-UTTERANCE-REFERENCE");

	static private final SubLList $list_alt161 = list(makeSymbol("UTTERANCE-STRING"), makeSymbol("FORCE"), makeSymbol("RAW-SEMANTICS"), makeSymbol("PROFILE-MT"), makeSymbol("SESSION-MT"), makeSymbol("PARSING-MT"), makeSymbol("&OPTIONAL"), makeSymbol("SUB-PEGS"));

	static private final SubLString $str_alt162$_param_RAW_SEMANTICS_listp__a_lis = makeString("@param RAW-SEMANTICS listp; a list of semantic meanings for UTTERANCE-STRING");

	static private final SubLString $$$VB = makeString("VB");

	static private final SubLString $$$S = makeString("S");

	static private final SubLString $$$CN = makeString("CN");

	static private final SubLString $$$NN = makeString("NN");

	private static final SubLSymbol NOTE_POS_REFERENCE = makeSymbol("NOTE-POS-REFERENCE");

	static private final SubLList $list_alt169 = list(makeSymbol("UTTERANCE-STRING"), makeSymbol("POS-STRING"), makeSymbol("RAW-SEMANTICS"), makeSymbol("PROFILE-MT"), makeSymbol("SESSION-MT"), makeSymbol("PARSING-MT"), makeSymbol("&OPTIONAL"), makeSymbol("SUB-PEGS"));

	public static final SubLObject $$properSubExpressions = constant_handles.reader_make_constant_shell(makeString("properSubExpressions"));

	private static final SubLSymbol ASSERT_PEG_DEPENDENCIES = makeSymbol("ASSERT-PEG-DEPENDENCIES");

	static private final SubLList $list_alt174 = list(makeSymbol("PARENT-PEG"), makeSymbol("CHILD-PEGS"), makeSymbol("MT"));

	static private final SubLList $list_alt175 = list(list(makeSymbol("PARENT-PEG"), makeSymbol("FORT-P")), list(makeSymbol("CHILD-PEGS"), makeSymbol("LISTP")));

	static private final SubLList $list_alt176 = list(makeSymbol("BOOLEAN"));

	public static final SubLObject $$Query = constant_handles.reader_make_constant_shell(makeString("Query"));

	private static final SubLSymbol $STATEMENT = makeKeyword("STATEMENT");

	public static final SubLObject $$Inform = constant_handles.reader_make_constant_shell(makeString("Inform"));

	static private final SubLList $list_alt181 = list(makeSymbol("?PEG"), makeSymbol("?NUMBER"));

	static private final SubLList $list_alt182 = list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?PEG"), constant_handles.reader_make_constant_shell(makeString("LinguisticExpressionPeg-CompleteUtterance")));

	static private final SubLSymbol $sym183$_ = makeSymbol(">");

	private static final SubLSymbol GET_MOST_RECENT_UTTERANCE_PEG = makeSymbol("GET-MOST-RECENT-UTTERANCE-PEG");

	static private final SubLList $list_alt186 = list(makeSymbol("SESSION"), makeSymbol("SESSION-MT"));

	static private final SubLString $str_alt187$Get_the_most_recent_utterance_peg = makeString("Get the most recent utterance peg.");

	static private final SubLList $list_alt188 = list(makeSymbol("FORT-P"));

	private static final SubLSymbol MYS_UPM_CLEANUP = makeSymbol("MYS-UPM-CLEANUP");

	static private final SubLString $str_alt190$perform_any_necessary_cleanup_to_ = makeString("perform any necessary cleanup to the user-profile, based on its session. \n   Currently, this is used to promote possible antecedents into the user profile.");

	static private final SubLSymbol $sym191$CYCL_SENTENCE_ASSERTIBLE_ = makeSymbol("CYCL-SENTENCE-ASSERTIBLE?");

	private static final SubLSymbol ADD_USER_APPROVED_FACT = makeSymbol("ADD-USER-APPROVED-FACT");

	static private final SubLList $list_alt193 = list(makeSymbol("ASSERT-SENTENCE"), makeSymbol("PROFILE-MT"));

	static private final SubLString $str_alt194$_param_ASSERT_SENTENCE_cycl_sente = makeString("@param ASSERT-SENTENCE cycl-sentence-p; a sentence that contains a fact that the user has agreed is true\n   @param PROFILE-MT hlmt-p\n   @hack should all these facts really go in the profile Mt, or are they (or some of them) more properly session based?");

	static private final SubLList $list_alt195 = list(list(makeSymbol("ASSERT-SENTENCE"), makeSymbol("CYCL-SENTENCE-ASSERTIBLE?")), list(makeSymbol("PROFILE-MT"), makeSymbol("HLMT-P")));

	static private final SubLList $list_alt196 = list(makeSymbol("BOOLEAN"), list(makeSymbol("LIST"), makeSymbol("CYCL-SENTENCE-P")));

	public static final SubLObject $$feelsTowardsObject_Ternary = constant_handles.reader_make_constant_shell(makeString("feelsTowardsObject-Ternary"));

	public static final SubLObject $$NthInteractionOfSessionFn = constant_handles.reader_make_constant_shell(makeString("NthInteractionOfSessionFn"));

	public static final SubLObject $$MySeAnswersSession_JaneDoe_001 = constant_handles.reader_make_constant_shell(makeString("MySeAnswersSession-JaneDoe-001"));

	static private final SubLList $list_alt200 = list(list(constant_handles.reader_make_constant_shell(makeString("LowAmountFn")), constant_handles.reader_make_constant_shell(makeString("Happiness"))));

	private static final SubLSymbol LEARN_HAPPINESS_FROM_USER_ASSERTION = makeSymbol("LEARN-HAPPINESS-FROM-USER-ASSERTION");

	static private final SubLList $list_alt202 = list(makeSymbol("USER"), makeSymbol("SESSION-MT"));

	static private final SubLString $str_alt203$If_a_user_agrees_to_assert_someth = makeString("If a user agrees to assert something, they're not completely disgusted with the system, so assume they're slightly happy");

	static private final SubLList $list_alt204 = list(list(makeSymbol("USER"), makeSymbol("FORT-P")), list(makeSymbol("SESSION-MT"), makeSymbol("HLMT-P")));

	private static final SubLSymbol $APPROVE = makeKeyword("APPROVE");

	static private final SubLList $list_alt207 = list(list(constant_handles.reader_make_constant_shell(makeString("MediumAmountFn")), constant_handles.reader_make_constant_shell(makeString("Happiness"))));

	private static final SubLSymbol $DISAPPROVE = makeKeyword("DISAPPROVE");

	static private final SubLList $list_alt209 = list(list(constant_handles.reader_make_constant_shell(makeString("MediumAmountFn")), constant_handles.reader_make_constant_shell(makeString("Unhappiness"))));

	private static final SubLSymbol LEARN_HAPPINESS_FROM_USER_APPROVAL = makeSymbol("LEARN-HAPPINESS-FROM-USER-APPROVAL");

	static private final SubLList $list_alt212 = list(makeSymbol("MSG-TYPE"), makeSymbol("USER"), makeSymbol("SESSION-MT"));

	static private final SubLString $str_alt213$_param_MSG_TYPE_keywordp__either_ = makeString("@param MSG-TYPE keywordp; either :approve or :disapprove\n   @param USER fort-p\n   @param SESSION-MT hlmt-p");

	static private final SubLList $list_alt214 = list(list(makeSymbol("MSG-TYPE"), makeSymbol("KEYWORDP")), list(makeSymbol("USER"), makeSymbol("FORT-P")), list(makeSymbol("SESSION-MT"), makeSymbol("HLMT-P")));

	private static final SubLSymbol PERFORM_KB_EDIT = makeSymbol("PERFORM-KB-EDIT");

	static private final SubLList $list_alt216 = list(makeSymbol("ORIGINAL"), makeSymbol("NEW"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("NOW?"), T));

	static private final SubLString $str_alt217$The_assumption_here_is_that_ORIGI = makeString("The assumption here is that ORIGINAL and NEW will both be #$ist sentences, so there\'s no need to\n   have an Mt at all.  However, since we aren\'t currently emitting #$ist sentences (20May2004), we allow\n   the Mt parameter as well");

	static private final SubLString $str_alt220$Sentence__S_not_assertible_in__S_ = makeString("Sentence ~S not assertible in ~S~%");

	private static final SubLSymbol PERFORM_KB_EDIT_POSSIBLY_ON_PEGS = makeSymbol("PERFORM-KB-EDIT-POSSIBLY-ON-PEGS");

	static private final SubLList $list_alt222 = list(makeSymbol("ORIGINAL"), makeSymbol("NEW"), makeSymbol("MT"));

	static private final SubLString $str_alt223$Perform_the_KB_edit_specified__an = makeString(
			"Perform the KB edit specified, and return any pegs that should be re-expanded as a result. \n   This will currently be the case only if one of the terms in either the new or old sentence\n   was in fact a peg mentioned in the most recent user utterance.\n   @todo This function should probably throw an error of some sort if the kb-edit can\'t be made");

	static private final SubLList $list_alt224 = list(list(makeSymbol("ORIGINAL"), list(makeSymbol("NIL-OR"), makeSymbol("CYCL-SENTENCE-P"))), list(makeSymbol("NEW"), makeSymbol("CYCL-SENTENCE-P")), list(makeSymbol("MT"), makeSymbol("HLMT-P")));

	static private final SubLList $list_alt225 = list(makeSymbol("LISTP"));

	static private final SubLSymbol $sym226$_EXPR_RECENT = makeSymbol("?EXPR-RECENT");

	public static final SubLObject $$thereExists = constant_handles.reader_make_constant_shell(makeString("thereExists"));

	static private final SubLSymbol $sym228$_NUM = makeSymbol("?NUM");

	public static final SubLObject $$assertedSentence = constant_handles.reader_make_constant_shell(makeString("assertedSentence"));

	static private final SubLList $list_alt230 = list(constant_handles.reader_make_constant_shell(makeString("assertedSentence")), list(constant_handles.reader_make_constant_shell(makeString("nthExpressionOfSession")), makeSymbol("?SESSION"), makeSymbol("?EXPR-RECENT"), makeSymbol("?NUM")));

	public static final SubLObject $$nthLargestElement = constant_handles.reader_make_constant_shell(makeString("nthLargestElement"));

	public static final SubLObject $$TheSetOf = constant_handles.reader_make_constant_shell(makeString("TheSetOf"));

	static private final SubLSymbol $sym233$_M = makeSymbol("?M");

	static private final SubLSymbol $sym234$_EXPR = makeSymbol("?EXPR");

	static private final SubLList $list_alt235 = list(list(constant_handles.reader_make_constant_shell(makeString("assertedSentence")), list(constant_handles.reader_make_constant_shell(makeString("nthExpressionOfSession")), makeSymbol("?SESSION"), makeSymbol("?EXPR"), makeSymbol("?M"))));

	static private final SubLList $list_alt236 = list(constant_handles.reader_make_constant_shell(makeString("IdentityFn")));

	static private final SubLList $list_alt237 = list(makeSymbol("?PEG"), makeSymbol("?UTTR-NUM"));

	static private final SubLList $list_alt238 = list(list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?PEG"), constant_handles.reader_make_constant_shell(makeString("LinguisticExpressionPeg-CompleteUtterance"))),
			list(constant_handles.reader_make_constant_shell(makeString("nthExpressionOfSession")), makeSymbol("??SESS"), makeSymbol("?PEG"), makeSymbol("?UTTR-NUM"))));

	static private final SubLSymbol $sym239$_SUB_EXPR = makeSymbol("?SUB-EXPR");

	static private final SubLList $list_alt240 = list(makeSymbol("?SUB-EXPR"));

	private static final SubLSymbol MYS_SESSION_FROM_SESSION_MT = makeSymbol("MYS-SESSION-FROM-SESSION-MT");

	public static final SubLObject $$recordOfSession = constant_handles.reader_make_constant_shell(makeString("recordOfSession"));

	static private final SubLList $list_alt244 = list(makeKeyword("SESSION"));

	static private final SubLList $list_alt245 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("EL"));

	public static final SubLSymbol $mys_session_from_session_mt_caching_state$ = makeSymbol("*MYS-SESSION-FROM-SESSION-MT-CACHING-STATE*");

	private static final SubLSymbol USER_FROM_PROFILE_MT = makeSymbol("USER-FROM-PROFILE-MT");

	public static final SubLObject $$mySentientUserProfile = constant_handles.reader_make_constant_shell(makeString("mySentientUserProfile"));

	public static final SubLSymbol $user_from_profile_mt_caching_state$ = makeSymbol("*USER-FROM-PROFILE-MT-CACHING-STATE*");

	public static final SubLObject $$NLDefinitenessFn_3 = constant_handles.reader_make_constant_shell(makeString("NLDefinitenessFn-3"));

	public static final SubLObject $$Definite_NLAttr = constant_handles.reader_make_constant_shell(makeString("Definite-NLAttr"));

	public static final SubLObject $$Indefinite_NLAttr = constant_handles.reader_make_constant_shell(makeString("Indefinite-NLAttr"));

	public static final SubLObject $$MySePrototypeUserProfileMt = constant_handles.reader_make_constant_shell(makeString("MySePrototypeUserProfileMt"));

	public static final SubLObject $$MySePrototypeSessionMt = constant_handles.reader_make_constant_shell(makeString("MySePrototypeSessionMt"));

	public static final SubLObject $$MySePrototypeParsingMt = constant_handles.reader_make_constant_shell(makeString("MySePrototypeParsingMt"));

	public static final SubLObject $$MySePrototypeGenerationMt = constant_handles.reader_make_constant_shell(makeString("MySePrototypeGenerationMt"));

	static private final SubLString $str_alt257$alt_phrase = makeString("alt_phrase");

	public static final SubLSymbol $mys_question_count$ = makeSymbol("*MYS-QUESTION-COUNT*");

	public static final SubLObject $$TheDefaultMySentientUserDatabase = constant_handles.reader_make_constant_shell(makeString("TheDefaultMySentientUserDatabase"));

	public static final SubLObject $const260$TheDefaultMySentientPersistenceSt = constant_handles.reader_make_constant_shell(makeString("TheDefaultMySentientPersistenceStore"));

	static private final SubLString $$$MySe = makeString("MySe");

	static private final SubLString $$$AnswersSession = makeString("AnswersSession");

	static private final SubLString $$$Mt = makeString("Mt");

	public static final SubLObject $const264$MySentientSession_CreationTemplat = constant_handles.reader_make_constant_shell(makeString("MySentientSession-CreationTemplate"));

	static private final SubLList $list_alt265 = list(constant_handles.reader_make_constant_shell(makeString("Microtheory")));

	static private final SubLList $list_alt266 = list(constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt")));

	static private final SubLList $list_alt267 = list(constant_handles.reader_make_constant_shell(makeString("MySentientAnswersSessionRecordMicrotheory")));

	public static final SubLObject $$mySentientProfileSessionRecords = constant_handles.reader_make_constant_shell(makeString("mySentientProfileSessionRecords"));

	static private final SubLList $list_alt269 = list(constant_handles.reader_make_constant_shell(makeString("Individual")));

	static private final SubLList $list_alt270 = list(constant_handles.reader_make_constant_shell(makeString("MySentientAnswersSession")));

	public static final SubLObject $$sessionStartDate = constant_handles.reader_make_constant_shell(makeString("sessionStartDate"));

	static private final SubLString $str_alt272$All_KB_Operations_completed_succe = makeString("All KB Operations completed successfully.");

	private static final SubLSymbol CREATE_NEW_MYSENTIENT_USER_SESSION = makeSymbol("CREATE-NEW-MYSENTIENT-USER-SESSION");

	static private final SubLList $list_alt274 = list(makeSymbol("USER"), makeSymbol("USER-PROFILE-MT"), makeSymbol("LANGUAGE-CODE"), makeSymbol("&OPTIONAL"), list(makeSymbol("ASSERT-MT"), makeSymbol("*MYSENTIENT-USER-PROFILE-INFORMATION-MT*")));

	static private final SubLString $str_alt275$Creates_the_new_infrastructure_fo = makeString("Creates the new infrastructure for a user session; \n   @note find a faster way to do this using FI-MERGE like approach.");

	static private final SubLList $list_alt276 = list(list(makeSymbol("USER"), makeSymbol("FORT-P")));

	static private final SubLList $list_alt277 = list(list(makeSymbol("LIST"), makeSymbol("FORT-P")));

	static private final SubLString $str_alt278$_ = makeString("-");

	private static final SubLSymbol MYSENTIENT_CREATION_TEMPLATE_FORWARD_RULES = makeSymbol("MYSENTIENT-CREATION-TEMPLATE-FORWARD-RULES");

	public static final SubLSymbol $mysentient_creation_template_forward_rules_caching_state$ = makeSymbol("*MYSENTIENT-CREATION-TEMPLATE-FORWARD-RULES-CACHING-STATE*");

	static private final SubLList $list_alt281 = list(constant_handles.reader_make_constant_shell(makeString("ActiveSession")));

	public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

	public static final SubLObject $const284$MySeAnswersSessionMySentientExemp = constant_handles.reader_make_constant_shell(makeString("MySeAnswersSessionMySentientExemplarUser"));

	static private final SubLList $list_alt285 = list(makeSymbol("SENTENCE"), makeSymbol("ELMT"));

	private static final SubLSymbol $UP_MT = makeKeyword("UP-MT");

	static private final SubLList $list_alt287 = list(makeKeyword("UP-MT"));

	private static final SubLSymbol GET_MYSENTIENT_USER_PROFILE_MT = makeSymbol("GET-MYSENTIENT-USER-PROFILE-MT");

	static private final SubLList $list_alt289 = list(makeSymbol("USER"), makeSymbol("&OPTIONAL"), list(makeSymbol("ASK-MT"), makeSymbol("*MYSENTIENT-USER-PROFILE-INFORMATION-MT*")));

	static private final SubLString $str_alt290$Gets_the_user_profile_Mt_informat = makeString("Gets the user profile Mt information.");

	static private final SubLList $list_alt291 = list(list(makeSymbol("USER"), makeSymbol("FORT-P")), list(makeSymbol("ASK-MT"), makeSymbol("POSSIBLY-HLMT-P")));

	private static final SubLSymbol $PARSE_MT = makeKeyword("PARSE-MT");

	public static final SubLObject $$mySentientParsingMtForProfile = constant_handles.reader_make_constant_shell(makeString("mySentientParsingMtForProfile"));

	private static final SubLSymbol GET_MYSENTIENT_USERPROFILE_PARSING_MT = makeSymbol("GET-MYSENTIENT-USERPROFILE-PARSING-MT");

	static private final SubLList $list_alt295 = list(makeSymbol("USER-PROFILE-MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("ASK-MT"), makeSymbol("*MYSENTIENT-USER-PROFILE-INFORMATION-MT*")));

	static private final SubLString $str_alt296$Gets_the_parsing_Mt_associated_wi = makeString("Gets the parsing Mt associated with the user profile Mt");

	static private final SubLList $list_alt297 = list(list(makeSymbol("USER-PROFILE-MT"), makeSymbol("FORT-P")), list(makeSymbol("ASK-MT"), makeSymbol("POSSIBLY-HLMT-P")));

	private static final SubLSymbol $GEN_MT = makeKeyword("GEN-MT");

	public static final SubLObject $$mySentientGenerationMtForProfile = constant_handles.reader_make_constant_shell(makeString("mySentientGenerationMtForProfile"));

	private static final SubLSymbol GET_MYSENTIENT_USERPROFILE_GENERATION_MT = makeSymbol("GET-MYSENTIENT-USERPROFILE-GENERATION-MT");

	static private final SubLString $str_alt301$Gets_the_generation_Mt_associated = makeString("Gets the generation Mt associated with the user profile Mt");

	public static final SubLObject $$mySentientLexicalMtForProfile = constant_handles.reader_make_constant_shell(makeString("mySentientLexicalMtForProfile"));

	private static final SubLSymbol GET_MYSENTIENT_USERPROFILE_LEXICAL_MT = makeSymbol("GET-MYSENTIENT-USERPROFILE-LEXICAL-MT");

	static private final SubLString $str_alt304$Gets_a_lexical_Mt_associated_with = makeString("Gets a lexical Mt associated with the user profile Mt");

	private static final SubLSymbol GET_MYSENTIENT_USERPROFILE_LEXICAL_MTS = makeSymbol("GET-MYSENTIENT-USERPROFILE-LEXICAL-MTS");

	static private final SubLString $str_alt306$Gets_the_lexical_Mts_associated_w = makeString("Gets the lexical Mts associated with the user profile Mt");

	static private final SubLList $list_alt307 = list(list(makeSymbol("LIST"), makeSymbol("POSSIBLY-HLMT-P")));

	static private final SubLList $list_alt308 = list(makeSymbol("?USER-PROFILE-MT"), makeSymbol("?GEN-MT"), makeSymbol("?PARSE-MT"), makeSymbol("?LEX-MT"));

	static private final SubLList $list_alt309 = list(makeSymbol("?USER-PROFILE-MT"));

	static private final SubLList $list_alt310 = list(list(constant_handles.reader_make_constant_shell(makeString("mySentientParsingMtForProfile")), makeSymbol("?PARSE-MT"), makeSymbol("?USER-PROFILE-MT")), list(constant_handles.reader_make_constant_shell(makeString("mySentientGenerationMtForProfile")), makeSymbol("?GEN-MT"), makeSymbol("?USER-PROFILE-MT")),
			list(constant_handles.reader_make_constant_shell(makeString("mySentientLexicalMtForProfile")), makeSymbol("?LEX-MT"), makeSymbol("?USER-PROFILE-MT")));

	private static final SubLSymbol GET_MYSENTIENT_USER_MTS = makeSymbol("GET-MYSENTIENT-USER-MTS");

	static private final SubLString $str_alt312$Maps_the_user_to_their_Mts__Retur = makeString("Maps the user to their Mts. Returns an ordered list of the Mts.");

	private static final SubLSymbol COMBINE_MYSENTIENT_USER_MTS = makeSymbol("COMBINE-MYSENTIENT-USER-MTS");

	static private final SubLList $list_alt314 = list(makeSymbol("USER-PROFILE-MT"), makeSymbol("GENERATION-MT"), makeSymbol("PARSING-MT"), makeSymbol("LEXICAL-MT"));

	static private final SubLString $str_alt315$Put_them_together_into_the_right_ = makeString("Put them together into the right order for user-mts.");

	static private final SubLList $list_alt316 = list(list(makeSymbol("USER-PROFILE-MT"), makeSymbol("POSSIBLY-HLMT-P")), list(makeSymbol("GENERATION-MT"), makeSymbol("POSSIBLY-HLMT-P")), list(makeSymbol("PARSING-MT"), makeSymbol("POSSIBLY-HLMT-P")), list(makeSymbol("LEXICAL-MT"), makeSymbol("POSSIBLY-HLMT-P")));

	private static final SubLSymbol GET_MYSENTIENT_USER_PROFILE_MT_FROM_USER_MTS = makeSymbol("GET-MYSENTIENT-USER-PROFILE-MT-FROM-USER-MTS");

	static private final SubLList $list_alt318 = list(makeSymbol("USER-MTS"));

	static private final SubLString $$$Extract_just_the_user_profile_mt = makeString("Extract just the user profile mt");

	static private final SubLList $list_alt320 = list(list(makeSymbol("USER-MTS"), makeSymbol("LISTP")));

	private static final SubLSymbol GET_MYSENTIENT_USERPROFILE_GENERATION_MT_FROM_USER_MTS = makeSymbol("GET-MYSENTIENT-USERPROFILE-GENERATION-MT-FROM-USER-MTS");

	static private final SubLString $str_alt322$Extract_just_the_user_profile_gen = makeString("Extract just the user profile generation mt");

	private static final SubLSymbol GET_MYSENTIENT_USERPROFILE_PARSING_MT_FROM_USER_MTS = makeSymbol("GET-MYSENTIENT-USERPROFILE-PARSING-MT-FROM-USER-MTS");

	static private final SubLString $str_alt324$Extract_just_the_user_profile_par = makeString("Extract just the user profile parsing mt");

	private static final SubLSymbol GET_ALL_MYSENTIENT_USERPROFILE_SESSIONS_FROM_USER_PROFILE = makeSymbol("GET-ALL-MYSENTIENT-USERPROFILE-SESSIONS-FROM-USER-PROFILE");

	static private final SubLString $str_alt326$Given_the_user_profile_mt__comput = makeString("Given the user profile mt, compute what all the user profile sessions are.");

	static private final SubLList $list_alt327 = list(list(makeSymbol("USER-PROFILE-MT"), makeSymbol("POSSIBLY-HLMT-P")));

	private static final SubLSymbol $SESSION_MT = makeKeyword("SESSION-MT");

	static private final SubLList $list_alt329 = list(makeKeyword("SESSION-MT"));

	private static final SubLSymbol GET_ALL_MYSENTIENT_USERPROFILE_SESSION_MTS_FROM_USER_PROFILE = makeSymbol("GET-ALL-MYSENTIENT-USERPROFILE-SESSION-MTS-FROM-USER-PROFILE");

	static private final SubLString $str_alt331$Given_the_user_profile_mt__comput = makeString("Given the user profile mt, compute what all the user profile sessions mts are.");

	static private final SubLList $list_alt332 = list(makeSymbol("?SESSION-TERM"), makeSymbol("?SESSION-MT"));

	static private final SubLList $list_alt333 = list(makeSymbol("?SESSION-MT"));

	static private final SubLList $list_alt334 = list(list(constant_handles.reader_make_constant_shell(makeString("ist-Asserted")), makeSymbol("?SESSION-MT"), list(constant_handles.reader_make_constant_shell(makeString("recordOfSession")), makeSymbol("?SESSION-MT"), makeSymbol("?SESSION-TERM"))),
			list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?SESSION-TERM"), constant_handles.reader_make_constant_shell(makeString("ActiveSession"))));

	static private final SubLList $list_alt335 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER);

	private static final SubLSymbol GET_ACTIVE_MYSENTIENT_SESSION_INFORMATION_FROM_USER_PROFILE = makeSymbol("GET-ACTIVE-MYSENTIENT-SESSION-INFORMATION-FROM-USER-PROFILE");

	static private final SubLString $str_alt337$Given_the_user_profile_mt__comput = makeString("Given the user profile mt, compute the active session information (term and mt) are.");

	private static final SubLSymbol GET_ACTIVE_MYSENTIENT_SESSION_TERM_FROM_SESSION_INFORMATION = makeSymbol("GET-ACTIVE-MYSENTIENT-SESSION-TERM-FROM-SESSION-INFORMATION");

	static private final SubLList $list_alt339 = list(makeSymbol("SESSION-INFORMATION"));

	static private final SubLString $str_alt340$Given_the_session_information__pi = makeString("Given the session information, piece out the session term.");

	static private final SubLList $list_alt341 = list(list(makeSymbol("SESSION-INFORMATION"), makeSymbol("LISTP")));

	private static final SubLSymbol GET_ACTIVE_MYSENTIENT_SESSION_MT_FROM_SESSION_INFORMATION = makeSymbol("GET-ACTIVE-MYSENTIENT-SESSION-MT-FROM-SESSION-INFORMATION");

	static private final SubLString $str_alt343$Given_the_session_information__pi = makeString("Given the session information, piece out the session mt");

	static private final SubLString $$$AnonUser = makeString("AnonUser");

	static private final SubLString $$$AnonUserProfileMt = makeString("AnonUserProfileMt");

	static private final SubLString $$$AnonUserGenerationMt = makeString("AnonUserGenerationMt");

	static private final SubLString $$$AnonUserParsingMt = makeString("AnonUserParsingMt");

	static private final SubLString $$$AnonUserLexicalMt = makeString("AnonUserLexicalMt");

	public static final SubLObject $const349$MySentientUserWithProfile_Creatio = constant_handles.reader_make_constant_shell(makeString("MySentientUserWithProfile-CreationTemplate"));

	static private final SubLList $list_alt350 = list(constant_handles.reader_make_constant_shell(makeString("MySentientSystemUser")));

	static private final SubLList $list_alt351 = list(constant_handles.reader_make_constant_shell(makeString("Person")));

	static private final SubLList $list_alt352 = list(constant_handles.reader_make_constant_shell(makeString("MySentientUserProfileMicrotheory")));

	static private final SubLList $list_alt353 = list(constant_handles.reader_make_constant_shell(makeString("MySentientUserProfileNLGenerationMicrotheory")));

	static private final SubLList $list_alt354 = list(constant_handles.reader_make_constant_shell(makeString("MySentientUserProfileLexicalMicrotheory")));

	public static final SubLObject $$nameString = constant_handles.reader_make_constant_shell(makeString("nameString"));

	static private final SubLString $str_alt356$User_ = makeString("User ");

	static private final SubLList $list_alt357 = list(constant_handles.reader_make_constant_shell(makeString("MySentientUserProfileParsingMicrotheory")));

	public static final SubLObject $$synonymousExternalConcept = constant_handles.reader_make_constant_shell(makeString("synonymousExternalConcept"));

	private static final SubLSymbol CREATE_MYSENTIENT_USER_WITH_EXTERNAL_ID = makeSymbol("CREATE-MYSENTIENT-USER-WITH-EXTERNAL-ID");

	static private final SubLList $list_alt360 = list(makeSymbol("ID-STRING"), makeSymbol("&OPTIONAL"), list(makeSymbol("USER-DATABASE"), makeSymbol("*MYSENTIENT-USER-DATABASE-TERM*")), list(makeSymbol("ASSERT-MT"), makeSymbol("*MYSENTIENT-USER-PROFILE-INFORMATION-MT*")));

	static private final SubLString $str_alt361$Establish_the_anonymous_user_and_ = makeString("Establish the anonymous user and assert what we know about him now.");

	static private final SubLList $list_alt362 = list(list(makeSymbol("ID-STRING"), makeSymbol("STRINGP")), list(makeSymbol("USER-DATABASE"), makeSymbol("FORT-P")), list(makeSymbol("ASSERT-MT"), makeSymbol("POSSIBLY-HLMT-P")));

	public static final SubLObject $$BritishEnglishDialect = constant_handles.reader_make_constant_shell(makeString("BritishEnglishDialect"));

	public static final SubLObject $$languageForSession = constant_handles.reader_make_constant_shell(makeString("languageForSession"));

	static private final SubLSymbol $sym365$_LANGUAGE = makeSymbol("?LANGUAGE");

	public static final SubLObject $$xmlExpansionTypeAttributeValue = constant_handles.reader_make_constant_shell(makeString("xmlExpansionTypeAttributeValue"));

	public static final SubLObject $$MySentientAnswers = constant_handles.reader_make_constant_shell(makeString("MySentientAnswers"));

	static private final SubLSymbol $sym368$__LANGUAGE_CODE = makeSymbol("??LANGUAGE-CODE");

	public static final SubLObject $$equalStrings_CaseInsensitive = constant_handles.reader_make_constant_shell(makeString("equalStrings-CaseInsensitive"));

	public static final SubLObject $$MySentientArchitectureMt = constant_handles.reader_make_constant_shell(makeString("MySentientArchitectureMt"));

	static private final SubLList $list_alt371 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("MAX-TIME"), TEN_INTEGER, makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(1.0));

	private static final SubLSymbol GET_MYSENTIENT_USER_FROM_EXTERNAL_ID = makeSymbol("GET-MYSENTIENT-USER-FROM-EXTERNAL-ID");

	static private final SubLList $list_alt374 = list(makeSymbol("ID-STRING"), makeSymbol("&OPTIONAL"), list(makeSymbol("USER-DATABASE"), makeSymbol("*MYSENTIENT-USER-DATABASE-TERM*")), list(makeSymbol("ASK-MT"), makeSymbol("*MYSENTIENT-USER-PROFILE-INFORMATION-MT*")));

	static private final SubLString $str_alt375$Map_the_external_user_s_ID_string = makeString("Map the external user's ID string to the CYC User term for the user-database specified.");

	static private final SubLList $list_alt376 = list(list(makeSymbol("ID-STRING"), makeSymbol("STRINGP")), list(makeSymbol("USER-DATABASE"), makeSymbol("FORT-P")), list(makeSymbol("ASK-MT"), makeSymbol("POSSIBLY-HLMT-P")));

	private static final SubLSymbol $STORAGE_KEY = makeKeyword("STORAGE-KEY");

	static private final SubLList $list_alt378 = list(makeKeyword("STORAGE-KEY"));

	private static final SubLSymbol GET_MYSENTIENT_USERPROFILE_PERSISTENCE_STORE_KEY = makeSymbol("GET-MYSENTIENT-USERPROFILE-PERSISTENCE-STORE-KEY");

	static private final SubLList $list_alt380 = list(makeSymbol("USER-PROFILE-MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("PERSISTENCE-STORE"), makeSymbol("*MYSENTIENT-PERSISTENCE-STORE-TERM*")), list(makeSymbol("ASK-MT"), makeSymbol("*MYSENTIENT-USER-PROFILE-INFORMATION-MT*")));

	static private final SubLString $str_alt381$Get_the_key_under_which_we_can_lo = makeString("Get the key under which we can load the user profile's partition from the persistence store.");

	static private final SubLList $list_alt382 = list(list(makeSymbol("USER-PROFILE-MT"), makeSymbol("POSSIBLY-HLMT-P")), list(makeSymbol("PERSISTENCE-STORE"), makeSymbol("FORT-P")), list(makeSymbol("ASK-MT"), makeSymbol("POSSIBLY-HLMT-P")));

	static private final SubLList $list_alt383 = list(makeSymbol("STRINGP"));

	private static final SubLSymbol SET_MYSENTIENT_USERPROFILE_PERSISTENCE_STORE_KEY = makeSymbol("SET-MYSENTIENT-USERPROFILE-PERSISTENCE-STORE-KEY");

	static private final SubLList $list_alt385 = list(makeSymbol("USER-PROFILE-MT"), makeSymbol("STORAGE-KEY"), makeSymbol("&OPTIONAL"), list(makeSymbol("PERSISTENCE-STORE"), makeSymbol("*MYSENTIENT-PERSISTENCE-STORE-TERM*")), list(makeSymbol("ASSERT-MT"), makeSymbol("*MYSENTIENT-USER-PROFILE-INFORMATION-MT*")));

	static private final SubLString $str_alt386$Define_the_key_under_which_we_can = makeString("Define the key under which we can load the user profile's partition from the persistence store.");

	static private final SubLList $list_alt387 = list(list(makeSymbol("USER-PROFILE-MT"), makeSymbol("POSSIBLY-HLMT-P")), list(makeSymbol("STORAGE-KEY"), makeSymbol("STRINGP")), list(makeSymbol("PERSISTENCE-STORE"), makeSymbol("FORT-P")), list(makeSymbol("ASSERT-MT"), makeSymbol("POSSIBLY-HLMT-P")));

	static private final SubLList $list_alt388 = list(makeSymbol("SYMBOLP"));

	static private final SubLSymbol $sym389$MYSENTIENT_USER_PROFILE_MT_LOADED_ = makeSymbol("MYSENTIENT-USER-PROFILE-MT-LOADED?");

	static private final SubLList $list_alt390 = list(makeSymbol("USER-PROFILE-MT"));

	static private final SubLString $str_alt391$Check_whether_the_user_profile_mt = makeString("Check whether the user profile mt is loaded on this image already (ie has KB content).");

	static private final SubLList $list_alt392 = list(list(makeSymbol("USER-PROFILE-MT"), makeSymbol("FORT-P")));

	static private final SubLList $list_alt393 = list(makeSymbol("INTEGERP"));

	private static final SubLSymbol CFASL_ENCODING_P = makeSymbol("CFASL-ENCODING-P");

	private static final SubLSymbol LOAD_MYSENTIENT_USER_INFORMATION = makeSymbol("LOAD-MYSENTIENT-USER-INFORMATION");

	static private final SubLList $list_alt396 = list(makeSymbol("PARTITION"));

	static private final SubLString $str_alt397$Load_the_mysentient_user_informat = makeString("Load the mysentient user information from the partition in the CFASL encoding blob.");

	static private final SubLList $list_alt398 = list(list(makeSymbol("PARTITION"), makeSymbol("CFASL-ENCODING-P")));

	private static final SubLSymbol SAVE_MYSENTIENT_USER_INFORMATION = makeSymbol("SAVE-MYSENTIENT-USER-INFORMATION");

	static private final SubLList $list_alt401 = list(makeSymbol("USER-MTS"), makeSymbol("&OPTIONAL"), list(makeSymbol("USER-SESSION-RECORDS")), list(makeSymbol("REMOVE-INFORMATION?"), makeSymbol("*MYSENTIENT-AUTO-EXCISE-SAVED-USER-INFORMATION?*")));

	static private final SubLString $str_alt402$Save_the_mysentient_user_informat = makeString("Save the mysentient user information and return a cfasl hex-string encoding.");

	static private final SubLList $list_alt403 = list(list(makeSymbol("USER-MTS"), makeSymbol("LISTP")), list(makeSymbol("REMOVE-INFORMATION?"), makeSymbol("BOOLEANP")));

	static private final SubLList $list_alt404 = list(makeSymbol("CFASL-ENCODING-P"));

	private static final SubLSymbol GET_MYSENTIENT_USER_INFORMATION_IN_HEX = makeSymbol("GET-MYSENTIENT-USER-INFORMATION-IN-HEX");

	static private final SubLString $str_alt406$Save_the_mysentient_user_informat = makeString("Save the mysentient user information and turn the cfasl encoding into a HEX stream.");

	static private final SubLString $$$byteVector = makeString("byteVector");

	static private final SubLString $str_alt408$http___www_opencyc_org_xml_cycML_ = makeString("http://www.opencyc.org/xml/cycML.dtd");

	private static final SubLSymbol GET_MYSENTIENT_USER_INFORMATION_IN_XML = makeSymbol("GET-MYSENTIENT-USER-INFORMATION-IN-XML");

	static private final SubLString $str_alt410$Save_the_mysentient_user_informat = makeString("Save the mysentient user information and turn the cfasl encoding into an XML stream.");

	private static final SubLSymbol SCOPE_PARTITION_MT_INDEX = makeSymbol("SCOPE-PARTITION-MT-INDEX");

	private static final SubLSymbol $ESTIMATED_ASSERTION_COUNT = makeKeyword("ESTIMATED-ASSERTION-COUNT");

	static private final SubLList $list_alt414 = list(makeKeyword("REUSE-EXISTING-TABLES?"), NIL);

	static private final SubLString $str_alt416$Cannot_load_this_partition____inv = makeString("Cannot load this partition -- invalid version number ~A.~A -- expected ~A.~A.");

	static private final SubLString $str_alt417$Version__A__A__ = makeString("Version ~A.~A~%");

	static private final SubLString $$$userMapping = makeString("userMapping");

	static private final SubLString $$$userTerm = makeString("userTerm");

	static private final SubLString $$$sessionTerm = makeString("sessionTerm");

	static private final SubLString $$$userContext = makeString("userContext");

	static private final SubLString $$$userSessionContext = makeString("userSessionContext");

	static private final SubLString $$$userParsingContext = makeString("userParsingContext");

	static private final SubLString $$$userGenerationContext = makeString("userGenerationContext");

	public static final SubLInteger $int$1000000000 = makeInteger("1000000000");

	static private final SubLString $str_alt427$en_UK = makeString("en-UK");

	static private final SubLString $str_alt428$user__A__profile_mt__A__generatio = makeString("user=~A~&profile-mt=~A~&generation-mt=~A~&parsing-mt=~A~&lexical-mt=~A~&session=~A~&session-mt=~A~&~%");

	// // Initializers
	@Override
	public void declareFunctions() {
		declare_mysentient_user_profile_manager_widgets_file();
	}

	@Override
	public void initializeVariables() {
		init_mysentient_user_profile_manager_widgets_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_mysentient_user_profile_manager_widgets_file();
	}
}
