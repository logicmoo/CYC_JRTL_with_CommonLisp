/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related;
import com.cyc.cycjava.cycl.rtp.rtp_iterators;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      UIA-TRAMPOLINES
 *  source file: /cyc/top/cycl/uia-trampolines.lisp
 *  created:     2019/07/03 17:37:57
 */
public final class uia_trampolines extends SubLTranslatedFile implements V02 {
	// // Constructor
	private uia_trampolines() {
	}

	public static final SubLFile me = new uia_trampolines();

	// // Definitions
	public static final SubLObject uia_phrase_candidate_terms(SubLObject v_agenda, SubLObject phrase, SubLObject parsing_mt, SubLObject domain_mt, SubLObject parse_template) {
		if (parsing_mt == UNPROVIDED) {
			parsing_mt = NIL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		if (parse_template == UNPROVIDED) {
			parse_template = NIL;
		}
		SubLTrampolineFile.checkType(phrase, STRINGP);
		if (NIL == parsing_mt) {
			parsing_mt = user_interaction_agenda.uia_parsing_interaction_mt(v_agenda);
		}
		if (NIL == domain_mt) {
			domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
		}
		{
			SubLObject v_answer = NIL;
			v_answer = uia_phrase_candidate_terms_memoized(phrase, parsing_mt, domain_mt, parse_template);
			return v_answer;
		}
	}

	public static final SubLObject uia_phrase_candidate_terms_memoized_internal(SubLObject phrase, SubLObject parsing_mt, SubLObject domain_mt, SubLObject parse_template) {
		return rkf_tools.rkf_phrase_candidate_terms(phrase, parsing_mt, domain_mt, parse_template);
	}

	public static final SubLObject uia_phrase_candidate_terms_memoized(SubLObject phrase, SubLObject parsing_mt, SubLObject domain_mt, SubLObject parse_template) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_phrase_candidate_terms_memoized_internal(phrase, parsing_mt, domain_mt, parse_template);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_PHRASE_CANDIDATE_TERMS_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_PHRASE_CANDIDATE_TERMS_MEMOIZED, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_PHRASE_CANDIDATE_TERMS_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_4(phrase, parsing_mt, domain_mt, parse_template);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (phrase.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (parsing_mt.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (domain_mt.equal(cached_args.first())) {
												cached_args = cached_args.rest();
												if (((NIL != cached_args) && (NIL == cached_args.rest())) && parse_template.equal(cached_args.first())) {
													return memoization_state.caching_results(results2);
												}
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_phrase_candidate_terms_memoized_internal(phrase, parsing_mt, domain_mt, parse_template)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(phrase, parsing_mt, domain_mt, parse_template));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_phrase_candidate_terms_in_sentence(SubLObject v_agenda, SubLObject phrase, SubLObject parsing_mt, SubLObject domain_mt) {
		if (parsing_mt == UNPROVIDED) {
			parsing_mt = NIL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		SubLTrampolineFile.checkType(phrase, STRINGP);
		if (NIL == parsing_mt) {
			parsing_mt = user_interaction_agenda.uia_parsing_interaction_mt(v_agenda);
		}
		if (NIL == domain_mt) {
			domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
		}
		{
			SubLObject v_answer = NIL;
			v_answer = uia_phrase_candidate_terms_in_sentence_memoized(phrase, parsing_mt, domain_mt);
			return v_answer;
		}
	}

	public static final SubLObject uia_phrase_candidate_terms_in_sentence_memoized_internal(SubLObject phrase, SubLObject parsing_mt, SubLObject domain_mt) {
		return rkf_tools.rkf_phrase_candidate_terms_in_sentence(phrase, parsing_mt, domain_mt);
	}

	public static final SubLObject uia_phrase_candidate_terms_in_sentence_memoized(SubLObject phrase, SubLObject parsing_mt, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_phrase_candidate_terms_in_sentence_memoized_internal(phrase, parsing_mt, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_PHRASE_CANDIDATE_TERMS_IN_SENTENCE_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_PHRASE_CANDIDATE_TERMS_IN_SENTENCE_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_PHRASE_CANDIDATE_TERMS_IN_SENTENCE_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_3(phrase, parsing_mt, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (phrase.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (parsing_mt.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
												return memoization_state.caching_results(results2);
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_phrase_candidate_terms_in_sentence_memoized_internal(phrase, parsing_mt, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(phrase, parsing_mt, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	/**
	 *
	 *
	 * @return a list of candidate sentences, cloned from SENTENCE with terms for each phrase in PHRASES
	substituted into each corresponding arg position in ARG-POSITIONS within SENTENCE, and then reformulated.
	 * @param PHRASES
	 * 		listp; a list of strings
	 * @param ARG-POSITIONS
	 * 		listp; a list of arg positions
	 * @param SENTENCE
	 * 		cycl-sentence-p
	 */
	public static final SubLObject uia_phrases_candidate_sentences_replacing_terms(SubLObject v_agenda, SubLObject phrases, SubLObject arg_positions, SubLObject sentence, SubLObject parsing_mt, SubLObject domain_mt) {
		if (parsing_mt == UNPROVIDED) {
			parsing_mt = NIL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		if (NIL == parsing_mt) {
			parsing_mt = user_interaction_agenda.uia_parsing_interaction_mt(v_agenda);
		}
		if (NIL == domain_mt) {
			domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
		}
		{
			SubLObject v_answer = NIL;
			v_answer = uia_phrases_candidate_sentences_replacing_terms_memoized(phrases, arg_positions, sentence, parsing_mt, domain_mt);
			return v_answer;
		}
	}

	public static final SubLObject uia_phrases_candidate_sentences_replacing_terms_memoized_internal(SubLObject phrases, SubLObject arg_positions, SubLObject sentence, SubLObject parsing_mt, SubLObject domain_mt) {
		{
			SubLObject candidate_terms_list = NIL;
			SubLObject options = NIL;
			SubLObject candidate_sentences = NIL;
			{
				SubLObject cdolist_list_var = phrases;
				SubLObject phrase = NIL;
				for (phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), phrase = cdolist_list_var.first()) {
					{
						SubLObject candidate_terms = rkf_tools.rkf_phrase_candidate_terms_in_sentence(phrase, parsing_mt, domain_mt);
						candidate_terms_list = cons(candidate_terms, candidate_terms_list);
					}
				}
			}
			candidate_terms_list = nreverse(candidate_terms_list);
			{
				SubLObject cdolist_list_var = candidate_terms_list;
				SubLObject candidate_terms = NIL;
				for (candidate_terms = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), candidate_terms = cdolist_list_var.first()) {
					options = cons(list_utilities.num_list(length(candidate_terms), UNPROVIDED), options);
				}
			}
			options = nreverse(options);
			{
				SubLObject permutations = list_utilities.cartesian_product(options, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				SubLObject cdolist_list_var = permutations;
				SubLObject permutation = NIL;
				for (permutation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), permutation = cdolist_list_var.first()) {
					{
						SubLObject new_sentence = el_utilities.copy_formula(sentence);
						SubLObject index = NIL;
						SubLObject index_1 = NIL;
						SubLObject candidate_terms = NIL;
						SubLObject candidate_terms_2 = NIL;
						SubLObject arg_position = NIL;
						SubLObject arg_position_3 = NIL;
						for (index = permutation, index_1 = index.first(), candidate_terms = candidate_terms_list, candidate_terms_2 = candidate_terms.first(), arg_position = arg_positions, arg_position_3 = arg_position.first(); !(((NIL == arg_position) && (NIL == candidate_terms)) && (NIL == index)); index = index.rest(), index_1 = index.first(), candidate_terms = candidate_terms
								.rest(), candidate_terms_2 = candidate_terms.first(), arg_position = arg_position.rest(), arg_position_3 = arg_position.first()) {
							{
								SubLObject candidate_term = nth(index_1, candidate_terms_2);
								new_sentence = el_utilities.nreplace_formula_arg_position(arg_position_3, candidate_term, new_sentence);
							}
						}
						{
							SubLObject new_sentences = rkf_formula_optimizer.rkf_reformulate_into_many(new_sentence, parsing_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
							candidate_sentences = nconc(candidate_sentences, new_sentences);
						}
					}
				}
			}
			return remove_duplicates(candidate_sentences, EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
	}

	public static final SubLObject uia_phrases_candidate_sentences_replacing_terms_memoized(SubLObject phrases, SubLObject arg_positions, SubLObject sentence, SubLObject parsing_mt, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_phrases_candidate_sentences_replacing_terms_memoized_internal(phrases, arg_positions, sentence, parsing_mt, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_PHRASES_CANDIDATE_SENTENCES_REPLACING_TERMS_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_PHRASES_CANDIDATE_SENTENCES_REPLACING_TERMS_MEMOIZED, FIVE_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_PHRASES_CANDIDATE_SENTENCES_REPLACING_TERMS_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_5(phrases, arg_positions, sentence, parsing_mt, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (phrases.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (arg_positions.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (sentence.equal(cached_args.first())) {
												cached_args = cached_args.rest();
												if (parsing_mt.equal(cached_args.first())) {
													cached_args = cached_args.rest();
													if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
														return memoization_state.caching_results(results2);
													}
												}
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_phrases_candidate_sentences_replacing_terms_memoized_internal(phrases, arg_positions, sentence, parsing_mt, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(phrases, arg_positions, sentence, parsing_mt, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	/**
	 * Evaluate BODY with parameters for HTML function and target set appropriately
	 * for UIA use.
	 */
	public static final SubLObject with_uia_pph_html_parameters(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			destructuring_bind_must_consp(current, datum, $list_alt5);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject frame_name = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
					destructuring_bind_must_listp(current, datum, $list_alt5);
					current = current.rest();
					if (NIL == current) {
						current = temp;
						{
							SubLObject body = current;
							SubLObject target = $sym6$TARGET;
							SubLObject function = $sym7$FUNCTION;
							return list(CLET, list(list(target, list(CB_FRAME_NAME, listS(FIF, frame_name, frame_name, $list_alt11))), bq_cons(function, $list_alt12)), listS(WITH_PPH_HTML_FUNCTION_AND_TARGET, list(function, target), append(body, NIL)));
						}
					} else {
						cdestructuring_bind_error(datum, $list_alt5);
					}
				}
			}
		}
		return NIL;
	}

	// defparameter
	private static final SubLSymbol $uia_default_pph_frame$ = makeSymbol("*UIA-DEFAULT-PPH-FRAME*");

	public static final SubLObject uia_get_default_pph_frame_name() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return $uia_default_pph_frame$.getDynamicValue(thread);
		}
	}

	// defparameter
	private static final SubLSymbol $uia_default_pph_link_function$ = makeSymbol("*UIA-DEFAULT-PPH-LINK-FUNCTION*");

	public static final SubLObject uia_get_default_pph_link_function() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return $uia_default_pph_link_function$.getDynamicValue(thread);
		}
	}

	public static final SubLObject revert_ontology_browser_old_behavior() {
		$uia_default_pph_frame$.setDynamicValue($SELF);
		$uia_default_pph_link_function$.setDynamicValue(CB_UIA_CONCEPT_CLARIFIER_FORT_ID);
		return NIL;
	}

	public static final SubLObject uia_term_phrase(SubLObject v_agenda, SubLObject v_term, SubLObject generation_mt, SubLObject domain_mt, SubLObject mode) {
		if (generation_mt == UNPROVIDED) {
			generation_mt = NIL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		if (mode == UNPROVIDED) {
			mode = $TEXT;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == generation_mt) {
				generation_mt = user_interaction_agenda.uia_generation_language_mt(v_agenda);
			}
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_generation_domain_mt(v_agenda);
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
								{
									SubLObject _prev_bind_0_4 = pph_vars.$rkf_prefer_nouns_for_termsP$.currentBinding(thread);
									try {
										pph_vars.$rkf_prefer_nouns_for_termsP$.bind(NIL, thread);
										{
											SubLObject tagged_term = uia_maybe_constrain_term_for_paraphrase(v_agenda, v_term);
											v_answer = uia_term_phrase_memoized(tagged_term, generation_mt, domain_mt, mode, UNPROVIDED);
										}
									} finally {
										pph_vars.$rkf_prefer_nouns_for_termsP$.rebind(_prev_bind_0_4, thread);
									}
								}
							} finally {
								{
									SubLObject _prev_bind_0_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_5, thread);
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

	public static final SubLObject uia_html_term_phrase(SubLObject v_agenda, SubLObject v_term, SubLObject generation_mt, SubLObject domain_mt) {
		if (generation_mt == UNPROVIDED) {
			generation_mt = NIL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject ans = NIL;
				SubLObject target = cb_utilities.cb_frame_name(uia_get_default_pph_frame_name());
				SubLObject function = uia_get_default_pph_link_function();
				{
					SubLObject _prev_bind_0 = pph_vars.$constant_link_function$.currentBinding(thread);
					SubLObject _prev_bind_1 = pph_vars.$html_generation_target$.currentBinding(thread);
					try {
						pph_vars.$constant_link_function$.bind(NIL != function ? ((SubLObject) (function)) : pph_vars.$constant_link_function$.getDynamicValue(thread), thread);
						pph_vars.$html_generation_target$.bind(NIL != target ? ((SubLObject) (target)) : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
						ans = uia_term_phrase(v_agenda, v_term, generation_mt, domain_mt, $HTML);
					} finally {
						pph_vars.$html_generation_target$.rebind(_prev_bind_1, thread);
						pph_vars.$constant_link_function$.rebind(_prev_bind_0, thread);
					}
				}
				return ans;
			}
		}
	}

	/**
	 *
	 *
	 * @return STRINGP; Paraphrase of TERM as an NP.
	 */
	public static final SubLObject uia_term_phrase_np(SubLObject v_agenda, SubLObject v_term, SubLObject generation_mt, SubLObject domain_mt, SubLObject mode) {
		if (generation_mt == UNPROVIDED) {
			generation_mt = NIL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		if (mode == UNPROVIDED) {
			mode = $TEXT;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject phrase = NIL;
				{
					SubLObject _prev_bind_0 = pph_vars.$rkf_prefer_nouns_for_termsP$.currentBinding(thread);
					try {
						pph_vars.$rkf_prefer_nouns_for_termsP$.bind(NIL, thread);
						{
							SubLObject tagged_term = uia_add_paraphrase_constraint(v_term, $$NounPhrase);
							phrase = uia_term_phrase(v_agenda, tagged_term, generation_mt, domain_mt, mode);
						}
					} finally {
						pph_vars.$rkf_prefer_nouns_for_termsP$.rebind(_prev_bind_0, thread);
					}
				}
				return phrase;
			}
		}
	}

	/**
	 *
	 *
	 * @return STRINGP; Paraphrase of TERM as an NP, with HTML tags
	 */
	public static final SubLObject uia_html_term_phrase_np(SubLObject v_agenda, SubLObject v_term, SubLObject generation_mt, SubLObject domain_mt) {
		if (generation_mt == UNPROVIDED) {
			generation_mt = NIL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject phrase = NIL;
				{
					SubLObject _prev_bind_0 = pph_vars.$rkf_prefer_nouns_for_termsP$.currentBinding(thread);
					try {
						pph_vars.$rkf_prefer_nouns_for_termsP$.bind(NIL, thread);
						{
							SubLObject tagged_term = uia_add_paraphrase_constraint(v_term, $$NounPhrase);
							phrase = uia_html_term_phrase(v_agenda, tagged_term, generation_mt, domain_mt);
						}
					} finally {
						pph_vars.$rkf_prefer_nouns_for_termsP$.rebind(_prev_bind_0, thread);
					}
				}
				return phrase;
			}
		}
	}

	public static final SubLObject uia_paraphrase_constraint_for_term(SubLObject v_agenda, SubLObject v_term) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject ans = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								{
									SubLObject mt = user_interaction_agenda.uia_generation_domain_mt(v_agenda);
									ans = uia_paraphrase_constraint_for_term_memoized(v_term, mt);
								}
							} finally {
								{
									SubLObject _prev_bind_0_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_6, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return ans;
			}
		}
	}

	public static final SubLObject uia_paraphrase_constraint_for_term_memoized_internal(SubLObject v_term, SubLObject mt) {
		{
			SubLObject constraint = $$nonPlural_Generic;
			SubLObject check_pred = constants_high.find_constant($$$defaultGenerationConstraint);
			if (NIL != uia_term_with_paraphrase_constraint_p(v_term)) {
				constraint = uia_paraphrase_constraint_from_term(v_term);
			} else if (NIL != constant_handles.constant_p(check_pred)) {
				{
					SubLObject check_formula = el_utilities.make_binary_formula(check_pred, v_term, $CONSTRAINT);
					SubLObject ans = ask_utilities.ask_variable($CONSTRAINT, check_formula, mt, ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED);
					if (NIL != ans) {
						constraint = ans.first();
					}
				}
			}

			return constraint;
		}
	}

	public static final SubLObject uia_paraphrase_constraint_for_term_memoized(SubLObject v_term, SubLObject mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_paraphrase_constraint_for_term_memoized_internal(v_term, mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_PARAPHRASE_CONSTRAINT_FOR_TERM_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_PARAPHRASE_CONSTRAINT_FOR_TERM_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_PARAPHRASE_CONSTRAINT_FOR_TERM_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (v_term.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_paraphrase_constraint_for_term_memoized_internal(v_term, mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_maybe_constrain_term_for_paraphrase(SubLObject v_agenda, SubLObject v_term) {
		return NIL != uia_constrain_term_for_paraphraseP(v_agenda, v_term) ? ((SubLObject) (uia_constrain_term_for_paraphrase(v_agenda, v_term))) : v_term;
	}

	public static final SubLObject uia_constrain_term_for_paraphraseP(SubLObject v_agenda, SubLObject v_term) {
		if (NIL != rkf_concept_communicator.rkf_term_conjunction_p(v_term)) {
			return NIL;
		} else {
			return T;
		}
	}

	public static final SubLObject uia_constrain_term_for_paraphrase(SubLObject v_agenda, SubLObject v_term) {
		{
			SubLObject paraphrase_constraint = uia_paraphrase_constraint_for_term(v_agenda, v_term);
			return uia_add_paraphrase_constraint(v_term, paraphrase_constraint);
		}
	}

	public static final SubLObject uia_add_paraphrase_constraint(SubLObject v_term, SubLObject constraint) {
		return list($$TermParaphraseFn_Constrained, constraint, v_term);
	}

	public static final SubLObject uia_term_with_paraphrase_constraint_p(SubLObject v_term) {
		return formula_pattern_match.formula_matches_pattern(v_term, $list_alt27);
	}

	public static final SubLObject uia_paraphrase_constraint_from_term(SubLObject v_term) {
		return cycl_utilities.formula_arg1(v_term, UNPROVIDED);
	}

	public static final SubLObject uia_term_phrase_memoized_internal(SubLObject v_term, SubLObject generation_mt, SubLObject domain_mt, SubLObject mode, SubLObject pph_params) {
		if (mode == UNPROVIDED) {
			mode = $TEXT;
		}
		if (pph_params == UNPROVIDED) {
			pph_params = pph_vars.pph_current_parameters(UNPROVIDED);
		}
		return rkf_concept_communicator.rkf_term_phrase(v_term, generation_mt, domain_mt, $NONE, mode);
	}

	public static final SubLObject uia_term_phrase_memoized(SubLObject v_term, SubLObject generation_mt, SubLObject domain_mt, SubLObject mode, SubLObject pph_params) {
		if (mode == UNPROVIDED) {
			mode = $TEXT;
		}
		if (pph_params == UNPROVIDED) {
			pph_params = pph_vars.pph_current_parameters(UNPROVIDED);
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_term_phrase_memoized_internal(v_term, generation_mt, domain_mt, mode, pph_params);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_TERM_PHRASE_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_TERM_PHRASE_MEMOIZED, FIVE_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_TERM_PHRASE_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_5(v_term, generation_mt, domain_mt, mode, pph_params);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (v_term.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (generation_mt.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (domain_mt.equal(cached_args.first())) {
												cached_args = cached_args.rest();
												if (mode.equal(cached_args.first())) {
													cached_args = cached_args.rest();
													if (((NIL != cached_args) && (NIL == cached_args.rest())) && pph_params.equal(cached_args.first())) {
														return memoization_state.caching_results(results2);
													}
												}
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_term_phrase_memoized_internal(v_term, generation_mt, domain_mt, mode, pph_params)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, generation_mt, domain_mt, mode, pph_params));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_term_phrase_precise(SubLObject v_agenda, SubLObject v_term, SubLObject generation_mt, SubLObject domain_mt, SubLObject mode) {
		if (generation_mt == UNPROVIDED) {
			generation_mt = NIL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		if (mode == UNPROVIDED) {
			mode = $TEXT;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == generation_mt) {
				generation_mt = user_interaction_agenda.uia_generation_language_mt(v_agenda);
			}
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_generation_domain_mt(v_agenda);
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
								{
									SubLObject _prev_bind_0_7 = pph_vars.$rkf_prefer_nouns_for_termsP$.currentBinding(thread);
									try {
										pph_vars.$rkf_prefer_nouns_for_termsP$.bind(NIL, thread);
										{
											SubLObject tagged_term = uia_constrain_term_for_paraphrase(v_agenda, v_term);
											v_answer = uia_term_phrase_precise_memoized(tagged_term, generation_mt, domain_mt, mode, UNPROVIDED);
										}
									} finally {
										pph_vars.$rkf_prefer_nouns_for_termsP$.rebind(_prev_bind_0_7, thread);
									}
								}
							} finally {
								{
									SubLObject _prev_bind_0_8 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_8, thread);
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

	public static final SubLObject uia_html_term_phrase_precise(SubLObject v_agenda, SubLObject v_term, SubLObject generation_mt, SubLObject domain_mt) {
		if (generation_mt == UNPROVIDED) {
			generation_mt = NIL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject ans = NIL;
				SubLObject target = cb_utilities.cb_frame_name(uia_get_default_pph_frame_name());
				SubLObject function = uia_get_default_pph_link_function();
				{
					SubLObject _prev_bind_0 = pph_vars.$constant_link_function$.currentBinding(thread);
					SubLObject _prev_bind_1 = pph_vars.$html_generation_target$.currentBinding(thread);
					try {
						pph_vars.$constant_link_function$.bind(NIL != function ? ((SubLObject) (function)) : pph_vars.$constant_link_function$.getDynamicValue(thread), thread);
						pph_vars.$html_generation_target$.bind(NIL != target ? ((SubLObject) (target)) : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
						ans = uia_term_phrase_precise(v_agenda, v_term, generation_mt, domain_mt, $HTML);
					} finally {
						pph_vars.$html_generation_target$.rebind(_prev_bind_1, thread);
						pph_vars.$constant_link_function$.rebind(_prev_bind_0, thread);
					}
				}
				return ans;
			}
		}
	}

	public static final SubLObject uia_term_phrase_precise_memoized_internal(SubLObject v_term, SubLObject generation_mt, SubLObject domain_mt, SubLObject mode, SubLObject pph_params) {
		if (mode == UNPROVIDED) {
			mode = $TEXT;
		}
		if (pph_params == UNPROVIDED) {
			pph_params = pph_vars.pph_current_parameters(UNPROVIDED);
		}
		return rkf_concept_communicator.rkf_term_phrase_precise(v_term, generation_mt, domain_mt, $NONE, mode);
	}

	public static final SubLObject uia_term_phrase_precise_memoized(SubLObject v_term, SubLObject generation_mt, SubLObject domain_mt, SubLObject mode, SubLObject pph_params) {
		if (mode == UNPROVIDED) {
			mode = $TEXT;
		}
		if (pph_params == UNPROVIDED) {
			pph_params = pph_vars.pph_current_parameters(UNPROVIDED);
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_term_phrase_precise_memoized_internal(v_term, generation_mt, domain_mt, mode, pph_params);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_TERM_PHRASE_PRECISE_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_TERM_PHRASE_PRECISE_MEMOIZED, FIVE_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_TERM_PHRASE_PRECISE_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_5(v_term, generation_mt, domain_mt, mode, pph_params);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (v_term.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (generation_mt.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (domain_mt.equal(cached_args.first())) {
												cached_args = cached_args.rest();
												if (mode.equal(cached_args.first())) {
													cached_args = cached_args.rest();
													if (((NIL != cached_args) && (NIL == cached_args.rest())) && pph_params.equal(cached_args.first())) {
														return memoization_state.caching_results(results2);
													}
												}
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_term_phrase_precise_memoized_internal(v_term, generation_mt, domain_mt, mode, pph_params)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, generation_mt, domain_mt, mode, pph_params));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_sentence_phrase(SubLObject v_agenda, SubLObject sentence, SubLObject generation_mt, SubLObject domain_mt) {
		if (generation_mt == UNPROVIDED) {
			generation_mt = NIL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == generation_mt) {
				generation_mt = user_interaction_agenda.uia_generation_language_mt(v_agenda);
			}
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_generation_domain_mt(v_agenda);
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
							final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								v_answer = uia_sentence_phrase_memoized(sentence, generation_mt, domain_mt, UNPROVIDED);
							} finally {
								{
									SubLObject _prev_bind_0_9 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_9, thread);
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

	public static final SubLObject uia_sentence_phrase_memoized_internal(SubLObject sentence, SubLObject generation_mt, SubLObject domain_mt, SubLObject pph_params) {
		if (pph_params == UNPROVIDED) {
			pph_params = pph_vars.pph_current_parameters(UNPROVIDED);
		}
		return rkf_sentence_communicator.rkf_sentence_phrase(sentence, generation_mt, domain_mt, UNPROVIDED);
	}

	public static final SubLObject uia_sentence_phrase_memoized(SubLObject sentence, SubLObject generation_mt, SubLObject domain_mt, SubLObject pph_params) {
		if (pph_params == UNPROVIDED) {
			pph_params = pph_vars.pph_current_parameters(UNPROVIDED);
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_sentence_phrase_memoized_internal(sentence, generation_mt, domain_mt, pph_params);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_SENTENCE_PHRASE_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_SENTENCE_PHRASE_MEMOIZED, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_SENTENCE_PHRASE_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_4(sentence, generation_mt, domain_mt, pph_params);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (sentence.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (generation_mt.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (domain_mt.equal(cached_args.first())) {
												cached_args = cached_args.rest();
												if (((NIL != cached_args) && (NIL == cached_args.rest())) && pph_params.equal(cached_args.first())) {
													return memoization_state.caching_results(results2);
												}
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_sentence_phrase_memoized_internal(sentence, generation_mt, domain_mt, pph_params)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(sentence, generation_mt, domain_mt, pph_params));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_sentence_phrase_precise(SubLObject v_agenda, SubLObject sentence, SubLObject generation_mt, SubLObject domain_mt) {
		if (generation_mt == UNPROVIDED) {
			generation_mt = NIL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == generation_mt) {
				generation_mt = user_interaction_agenda.uia_generation_language_mt(v_agenda);
			}
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_generation_domain_mt(v_agenda);
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
							final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								v_answer = uia_sentence_phrase_precise_memoized(sentence, generation_mt, domain_mt, UNPROVIDED);
							} finally {
								{
									SubLObject _prev_bind_0_10 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_10, thread);
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

	public static final SubLObject uia_sentence_phrase_precise_memoized_internal(SubLObject sentence, SubLObject generation_mt, SubLObject domain_mt, SubLObject pph_params) {
		if (pph_params == UNPROVIDED) {
			pph_params = pph_vars.pph_current_parameters(UNPROVIDED);
		}
		return rkf_sentence_communicator.rkf_sentence_phrase_precise(sentence, generation_mt, domain_mt);
	}

	public static final SubLObject uia_sentence_phrase_precise_memoized(SubLObject sentence, SubLObject generation_mt, SubLObject domain_mt, SubLObject pph_params) {
		if (pph_params == UNPROVIDED) {
			pph_params = pph_vars.pph_current_parameters(UNPROVIDED);
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_sentence_phrase_precise_memoized_internal(sentence, generation_mt, domain_mt, pph_params);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_SENTENCE_PHRASE_PRECISE_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_SENTENCE_PHRASE_PRECISE_MEMOIZED, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_SENTENCE_PHRASE_PRECISE_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_4(sentence, generation_mt, domain_mt, pph_params);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (sentence.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (generation_mt.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (domain_mt.equal(cached_args.first())) {
												cached_args = cached_args.rest();
												if (((NIL != cached_args) && (NIL == cached_args.rest())) && pph_params.equal(cached_args.first())) {
													return memoization_state.caching_results(results2);
												}
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_sentence_phrase_precise_memoized_internal(sentence, generation_mt, domain_mt, pph_params)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(sentence, generation_mt, domain_mt, pph_params));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_all_phrases_for_term(SubLObject v_agenda, SubLObject v_term, SubLObject pred, SubLObject abbrev_type, SubLObject generation_mt, SubLObject domain_mt) {
		if (pred == UNPROVIDED) {
			pred = $ALL;
		}
		if (abbrev_type == UNPROVIDED) {
			abbrev_type = NIL;
		}
		if (generation_mt == UNPROVIDED) {
			generation_mt = NIL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == hlmt.hlmt_p(generation_mt)) {
				generation_mt = user_interaction_agenda.uia_generation_language_mt(v_agenda);
			}
			if (NIL == hlmt.hlmt_p(domain_mt)) {
				domain_mt = user_interaction_agenda.uia_generation_domain_mt(v_agenda);
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
							final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								v_answer = uia_all_phrases_for_term_memoized(v_term, pred, abbrev_type, generation_mt, domain_mt, UNPROVIDED);
							} finally {
								{
									SubLObject _prev_bind_0_11 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_11, thread);
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

	public static final SubLObject uia_all_phrases_for_term_memoized_internal(SubLObject v_term, SubLObject pred, SubLObject abbrev_type, SubLObject generation_mt, SubLObject domain_mt, SubLObject pph_params) {
		if (pph_params == UNPROVIDED) {
			pph_params = pph_vars.pph_current_parameters(UNPROVIDED);
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject result = NIL;
				{
					SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
					SubLObject _prev_bind_1 = pph_vars.$constant_link_function$.currentBinding(thread);
					try {
						lexicon_vars.$lexicon_lookup_mt$.bind(generation_mt, thread);
						pph_vars.$constant_link_function$.bind($NONE, thread);
						result = pph_methods_lexicon.all_phrases_for_term(v_term, list(pred), abbrev_type, $HTML, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED_SYM);
					} finally {
						pph_vars.$constant_link_function$.rebind(_prev_bind_1, thread);
						lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject uia_all_phrases_for_term_memoized(SubLObject v_term, SubLObject pred, SubLObject abbrev_type, SubLObject generation_mt, SubLObject domain_mt, SubLObject pph_params) {
		if (pph_params == UNPROVIDED) {
			pph_params = pph_vars.pph_current_parameters(UNPROVIDED);
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_all_phrases_for_term_memoized_internal(v_term, pred, abbrev_type, generation_mt, domain_mt, pph_params);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_ALL_PHRASES_FOR_TERM_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_ALL_PHRASES_FOR_TERM_MEMOIZED, SIX_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_ALL_PHRASES_FOR_TERM_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_6(v_term, pred, abbrev_type, generation_mt, domain_mt, pph_params);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (v_term.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (pred.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (abbrev_type.equal(cached_args.first())) {
												cached_args = cached_args.rest();
												if (generation_mt.equal(cached_args.first())) {
													cached_args = cached_args.rest();
													if (domain_mt.equal(cached_args.first())) {
														cached_args = cached_args.rest();
														if (((NIL != cached_args) && (NIL == cached_args.rest())) && pph_params.equal(cached_args.first())) {
															return memoization_state.caching_results(results2);
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
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_all_phrases_for_term_memoized_internal(v_term, pred, abbrev_type, generation_mt, domain_mt, pph_params)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, pred, abbrev_type, generation_mt, domain_mt, pph_params));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	/**
	 * List of memoization functions to be cleared during UIA paraphrase cache reset
	 */
	// defconstant
	private static final SubLSymbol $uia_memoized_paraphrase_functions$ = makeSymbol("*UIA-MEMOIZED-PARAPHRASE-FUNCTIONS*");

	/**
	 * Clear the UIA paraphrase caches for AGENDA
	 *
	 * @unknown Ths resets the memoization state associated with @xref uia-term-phrase-memoized, uia-sentence-phrase-memoized, etc.
	 */
	public static final SubLObject clear_uia_paraphrase_caches(SubLObject v_agenda) {
		return clear_uia_memoization_functions(v_agenda, $uia_memoized_paraphrase_functions$.getGlobalValue());
	}

	/**
	 * Clears the memoization state associated with AGENDA for each function in FUNCTION-LIST
	 */
	public static final SubLObject clear_uia_memoization_functions(SubLObject v_agenda, SubLObject function_list) {
		{
			SubLObject v_memoization_state = user_interaction_agenda.uia_memoization_state(v_agenda);
			SubLObject cdolist_list_var = function_list;
			SubLObject function = NIL;
			for (function = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), function = cdolist_list_var.first()) {
				memoization_state.clear_memoization(v_memoization_state, function);
			}
		}
		return T;
	}

	public static final SubLObject uia_phrase_output_list(SubLObject v_agenda, SubLObject cycl_expression, SubLObject force, SubLObject generation_mt, SubLObject domain_mt) {
		if (force == UNPROVIDED) {
			force = $NONE;
		}
		if (generation_mt == UNPROVIDED) {
			generation_mt = NIL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == generation_mt) {
				generation_mt = user_interaction_agenda.uia_generation_language_mt(v_agenda);
			}
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_generation_domain_mt(v_agenda);
			}
			{
				SubLObject list = NIL;
				SubLObject target = cb_utilities.cb_frame_name(uia_get_default_pph_frame_name());
				SubLObject function = uia_get_default_pph_link_function();
				{
					SubLObject _prev_bind_0 = pph_vars.$constant_link_function$.currentBinding(thread);
					SubLObject _prev_bind_1 = pph_vars.$html_generation_target$.currentBinding(thread);
					try {
						pph_vars.$constant_link_function$.bind(NIL != function ? ((SubLObject) (function)) : pph_vars.$constant_link_function$.getDynamicValue(thread), thread);
						pph_vars.$html_generation_target$.bind(NIL != target ? ((SubLObject) (target)) : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
						list = uia_phrase_output_list_memoized(cycl_expression, force, generation_mt, domain_mt, UNPROVIDED);
					} finally {
						pph_vars.$html_generation_target$.rebind(_prev_bind_1, thread);
						pph_vars.$constant_link_function$.rebind(_prev_bind_0, thread);
					}
				}
				return list;
			}
		}
	}

	public static final SubLObject uia_phrase_output_list_memoized_internal(SubLObject cycl_expression, SubLObject force, SubLObject generation_mt, SubLObject domain_mt, SubLObject pph_params) {
		if (pph_params == UNPROVIDED) {
			pph_params = pph_vars.pph_current_parameters(UNPROVIDED);
		}
		return pph_main.generate_pph_output_list(cycl_expression, $ANY, generation_mt, domain_mt, $HTML, force);
	}

	public static final SubLObject uia_phrase_output_list_memoized(SubLObject cycl_expression, SubLObject force, SubLObject generation_mt, SubLObject domain_mt, SubLObject pph_params) {
		if (pph_params == UNPROVIDED) {
			pph_params = pph_vars.pph_current_parameters(UNPROVIDED);
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_phrase_output_list_memoized_internal(cycl_expression, force, generation_mt, domain_mt, pph_params);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_PHRASE_OUTPUT_LIST_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_PHRASE_OUTPUT_LIST_MEMOIZED, FIVE_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_PHRASE_OUTPUT_LIST_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_5(cycl_expression, force, generation_mt, domain_mt, pph_params);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (cycl_expression.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (force.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (generation_mt.equal(cached_args.first())) {
												cached_args = cached_args.rest();
												if (domain_mt.equal(cached_args.first())) {
													cached_args = cached_args.rest();
													if (((NIL != cached_args) && (NIL == cached_args.rest())) && pph_params.equal(cached_args.first())) {
														return memoization_state.caching_results(results2);
													}
												}
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_phrase_output_list_memoized_internal(cycl_expression, force, generation_mt, domain_mt, pph_params)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(cycl_expression, force, generation_mt, domain_mt, pph_params));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_html_sentence_phrase(SubLObject v_agenda, SubLObject sentence, SubLObject generation_mt, SubLObject domain_mt) {
		if (generation_mt == UNPROVIDED) {
			generation_mt = NIL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == generation_mt) {
				generation_mt = user_interaction_agenda.uia_generation_language_mt(v_agenda);
			}
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_generation_domain_mt(v_agenda);
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
							final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								{
									SubLObject target = cb_utilities.cb_frame_name(uia_get_default_pph_frame_name());
									SubLObject function = uia_get_default_pph_link_function();
									{
										SubLObject _prev_bind_0_12 = pph_vars.$constant_link_function$.currentBinding(thread);
										SubLObject _prev_bind_1 = pph_vars.$html_generation_target$.currentBinding(thread);
										try {
											pph_vars.$constant_link_function$.bind(NIL != function ? ((SubLObject) (function)) : pph_vars.$constant_link_function$.getDynamicValue(thread), thread);
											pph_vars.$html_generation_target$.bind(NIL != target ? ((SubLObject) (target)) : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
											v_answer = uia_html_sentence_phrase_memoized(sentence, generation_mt, domain_mt, UNPROVIDED);
										} finally {
											pph_vars.$html_generation_target$.rebind(_prev_bind_1, thread);
											pph_vars.$constant_link_function$.rebind(_prev_bind_0_12, thread);
										}
									}
								}
							} finally {
								{
									SubLObject _prev_bind_0_13 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_13, thread);
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

	public static final SubLObject uia_html_sentence_phrase_memoized_internal(SubLObject sentence, SubLObject generation_mt, SubLObject domain_mt, SubLObject pph_params) {
		if (pph_params == UNPROVIDED) {
			pph_params = pph_vars.pph_current_parameters(UNPROVIDED);
		}
		return rkf_sentence_communicator.rkf_html_sentence_phrase(sentence, generation_mt, domain_mt, UNPROVIDED, UNPROVIDED);
	}

	public static final SubLObject uia_html_sentence_phrase_memoized(SubLObject sentence, SubLObject generation_mt, SubLObject domain_mt, SubLObject pph_params) {
		if (pph_params == UNPROVIDED) {
			pph_params = pph_vars.pph_current_parameters(UNPROVIDED);
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_html_sentence_phrase_memoized_internal(sentence, generation_mt, domain_mt, pph_params);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_HTML_SENTENCE_PHRASE_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_HTML_SENTENCE_PHRASE_MEMOIZED, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_HTML_SENTENCE_PHRASE_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_4(sentence, generation_mt, domain_mt, pph_params);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (sentence.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (generation_mt.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (domain_mt.equal(cached_args.first())) {
												cached_args = cached_args.rest();
												if (((NIL != cached_args) && (NIL == cached_args.rest())) && pph_params.equal(cached_args.first())) {
													return memoization_state.caching_results(results2);
												}
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_html_sentence_phrase_memoized_internal(sentence, generation_mt, domain_mt, pph_params)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(sentence, generation_mt, domain_mt, pph_params));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_html_sentence_phrase_precise(SubLObject v_agenda, SubLObject sentence, SubLObject generation_mt, SubLObject domain_mt) {
		if (generation_mt == UNPROVIDED) {
			generation_mt = NIL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == generation_mt) {
				generation_mt = user_interaction_agenda.uia_generation_language_mt(v_agenda);
			}
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_generation_domain_mt(v_agenda);
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
							final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								{
									SubLObject target = cb_utilities.cb_frame_name(uia_get_default_pph_frame_name());
									SubLObject function = uia_get_default_pph_link_function();
									{
										SubLObject _prev_bind_0_14 = pph_vars.$constant_link_function$.currentBinding(thread);
										SubLObject _prev_bind_1 = pph_vars.$html_generation_target$.currentBinding(thread);
										try {
											pph_vars.$constant_link_function$.bind(NIL != function ? ((SubLObject) (function)) : pph_vars.$constant_link_function$.getDynamicValue(thread), thread);
											pph_vars.$html_generation_target$.bind(NIL != target ? ((SubLObject) (target)) : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
											v_answer = uia_html_sentence_phrase_precise_memoized(sentence, generation_mt, domain_mt, UNPROVIDED);
										} finally {
											pph_vars.$html_generation_target$.rebind(_prev_bind_1, thread);
											pph_vars.$constant_link_function$.rebind(_prev_bind_0_14, thread);
										}
									}
								}
							} finally {
								{
									SubLObject _prev_bind_0_15 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_15, thread);
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

	public static final SubLObject uia_html_sentence_phrase_precise_memoized_internal(SubLObject sentence, SubLObject generation_mt, SubLObject domain_mt, SubLObject pph_params) {
		if (pph_params == UNPROVIDED) {
			pph_params = pph_vars.pph_current_parameters(UNPROVIDED);
		}
		return rkf_sentence_communicator.rkf_html_sentence_phrase_precise(sentence, generation_mt, domain_mt, UNPROVIDED, UNPROVIDED);
	}

	public static final SubLObject uia_html_sentence_phrase_precise_memoized(SubLObject sentence, SubLObject generation_mt, SubLObject domain_mt, SubLObject pph_params) {
		if (pph_params == UNPROVIDED) {
			pph_params = pph_vars.pph_current_parameters(UNPROVIDED);
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_html_sentence_phrase_precise_memoized_internal(sentence, generation_mt, domain_mt, pph_params);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_HTML_SENTENCE_PHRASE_PRECISE_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_HTML_SENTENCE_PHRASE_PRECISE_MEMOIZED, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_HTML_SENTENCE_PHRASE_PRECISE_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_4(sentence, generation_mt, domain_mt, pph_params);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (sentence.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (generation_mt.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (domain_mt.equal(cached_args.first())) {
												cached_args = cached_args.rest();
												if (((NIL != cached_args) && (NIL == cached_args.rest())) && pph_params.equal(cached_args.first())) {
													return memoization_state.caching_results(results2);
												}
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_html_sentence_phrase_precise_memoized_internal(sentence, generation_mt, domain_mt, pph_params)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(sentence, generation_mt, domain_mt, pph_params));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_assertion_phrase(SubLObject v_agenda, SubLObject assertion, SubLObject generation_mt, SubLObject domain_mt) {
		if (generation_mt == UNPROVIDED) {
			generation_mt = NIL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		return uia_sentence_phrase(v_agenda, assertion, generation_mt, domain_mt);
	}

	public static final SubLObject uia_assertion_phrase_precise(SubLObject v_agenda, SubLObject assertion, SubLObject generation_mt, SubLObject domain_mt) {
		if (generation_mt == UNPROVIDED) {
			generation_mt = NIL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		return uia_sentence_phrase_precise(v_agenda, assertion, generation_mt, domain_mt);
	}

	public static final SubLObject uia_html_assertion_phrase(SubLObject v_agenda, SubLObject assertion, SubLObject generation_mt, SubLObject domain_mt) {
		if (generation_mt == UNPROVIDED) {
			generation_mt = NIL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		return uia_html_sentence_phrase(v_agenda, assertion, generation_mt, domain_mt);
	}

	public static final SubLObject uia_html_assertion_phrase_precise(SubLObject v_agenda, SubLObject assertion, SubLObject generation_mt, SubLObject domain_mt) {
		if (generation_mt == UNPROVIDED) {
			generation_mt = NIL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		return uia_html_sentence_phrase_precise(v_agenda, assertion, generation_mt, domain_mt);
	}

	public static final SubLObject uia_precache_html_sentence_phrases(SubLObject v_agenda, SubLObject sentences, SubLObject message, SubLObject generation_mt, SubLObject domain_mt) {
		if (message == UNPROVIDED) {
			message = $str_alt40$Translating_sentences_;
		}
		if (generation_mt == UNPROVIDED) {
			generation_mt = NIL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == generation_mt) {
				generation_mt = user_interaction_agenda.uia_generation_language_mt(v_agenda);
			}
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_generation_domain_mt(v_agenda);
			}
			{
				SubLObject total = length(sentences);
				uia_tools_basic.uiat_thinking_note_progress_message(message, UNPROVIDED);
				thread.resetMultipleValues();
				{
					SubLObject _prev_bind_0 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
					try {
						pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
						{
							SubLObject reuseP = thread.secondMultipleValue();
							thread.resetMultipleValues();
							try {
								thread.resetMultipleValues();
								{
									SubLObject _prev_bind_0_16 = pph_macros.$pph_memoization_state$.currentBinding(thread);
									try {
										pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
										{
											SubLObject new_or_reused = thread.secondMultipleValue();
											thread.resetMultipleValues();
											{
												SubLObject _prev_bind_0_17 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
												try {
													pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
													{
														SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
														{
															SubLObject _prev_bind_0_18 = memoization_state.$memoization_state$.currentBinding(thread);
															try {
																memoization_state.$memoization_state$.bind(local_state, thread);
																{
																	final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
																	try {
																		{
																			SubLObject list_var = NIL;
																			SubLObject sentence = NIL;
																			SubLObject sofar = NIL;
																			for (list_var = sentences, sentence = list_var.first(), sofar = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), sentence = list_var.first(), sofar = add(ONE_INTEGER, sofar)) {
																				uia_tools_basic.uiat_thinking_note_percent_progress(sofar, total, UNPROVIDED);
																				{
																					SubLObject ignore_errors_tag = NIL;
																					try {
																						{
																							SubLObject _prev_bind_0_19 = Errors.$error_handler$.currentBinding(thread);
																							try {
																								Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
																								try {
																									uia_sentence_phrase(v_agenda, sentence, generation_mt, domain_mt);
																									uia_html_sentence_phrase(v_agenda, sentence, generation_mt, domain_mt);
																									uia_html_sentence_phrase_precise(v_agenda, sentence, generation_mt, domain_mt);
																								} catch (Throwable catch_var) {
																									Errors.handleThrowable(catch_var, NIL);
																								}
																							} finally {
																								Errors.$error_handler$.rebind(_prev_bind_0_19, thread);
																							}
																						}
																					} catch (Throwable ccatch_env_var) {
																						ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
																					}
																				}
																			}
																		}
																	} finally {
																		{
																			SubLObject _prev_bind_0_20 = $is_thread_performing_cleanupP$.currentBinding(thread);
																			try {
																				$is_thread_performing_cleanupP$.bind(T, thread);
																				if ((NIL != local_state) && (NIL == original_memoization_process)) {
																					memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
																				}
																			} finally {
																				$is_thread_performing_cleanupP$.rebind(_prev_bind_0_20, thread);
																			}
																		}
																	}
																}
															} finally {
																memoization_state.$memoization_state$.rebind(_prev_bind_0_18, thread);
															}
														}
													}
												} finally {
													pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_17, thread);
												}
											}
											if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
												memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
											}
										}
									} finally {
										pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_16, thread);
									}
								}
							} finally {
								{
									SubLObject _prev_bind_0_21 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if (NIL == reuseP) {
											pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_21, thread);
									}
								}
							}
						}
					} finally {
						pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0, thread);
					}
				}
			}
			return NIL;
		}
	}

	public static final SubLObject uia_query_phrase(SubLObject v_agenda, SubLObject query, SubLObject generation_mt, SubLObject domain_mt, SubLObject use_blanksP) {
		if (generation_mt == UNPROVIDED) {
			generation_mt = NIL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		if (use_blanksP == UNPROVIDED) {
			use_blanksP = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == generation_mt) {
				generation_mt = user_interaction_agenda.uia_generation_language_mt(v_agenda);
			}
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_generation_domain_mt(v_agenda);
			}
			{
				SubLObject v_answer = NIL;
				{
					SubLObject _prev_bind_0 = pph_vars.$pph_blanks_for_varsP$.currentBinding(thread);
					try {
						pph_vars.$pph_blanks_for_varsP$.bind(use_blanksP, thread);
						{
							SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
							SubLObject local_state = state;
							{
								SubLObject _prev_bind_0_22 = memoization_state.$memoization_state$.currentBinding(thread);
								try {
									memoization_state.$memoization_state$.bind(local_state, thread);
									{
										final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
										try {
											v_answer = uia_query_phrase_memoized(query, generation_mt, domain_mt, UNPROVIDED);
										} finally {
											{
												SubLObject _prev_bind_0_23 = $is_thread_performing_cleanupP$.currentBinding(thread);
												try {
													$is_thread_performing_cleanupP$.bind(T, thread);
													if ((NIL != local_state) && (NIL == original_memoization_process)) {
														memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
													}
												} finally {
													$is_thread_performing_cleanupP$.rebind(_prev_bind_0_23, thread);
												}
											}
										}
									}
								} finally {
									memoization_state.$memoization_state$.rebind(_prev_bind_0_22, thread);
								}
							}
						}
					} finally {
						pph_vars.$pph_blanks_for_varsP$.rebind(_prev_bind_0, thread);
					}
				}
				return v_answer;
			}
		}
	}

	public static final SubLObject uia_query_phrase_memoized_internal(SubLObject query, SubLObject generation_mt, SubLObject domain_mt, SubLObject pph_params) {
		if (pph_params == UNPROVIDED) {
			pph_params = pph_vars.pph_current_parameters(UNPROVIDED);
		}
		return rkf_sentence_communicator.rkf_query_phrase(query, generation_mt, domain_mt, $TEXT, UNPROVIDED);
	}

	public static final SubLObject uia_query_phrase_memoized(SubLObject query, SubLObject generation_mt, SubLObject domain_mt, SubLObject pph_params) {
		if (pph_params == UNPROVIDED) {
			pph_params = pph_vars.pph_current_parameters(UNPROVIDED);
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_query_phrase_memoized_internal(query, generation_mt, domain_mt, pph_params);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_QUERY_PHRASE_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_QUERY_PHRASE_MEMOIZED, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_QUERY_PHRASE_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_4(query, generation_mt, domain_mt, pph_params);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (query.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (generation_mt.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (domain_mt.equal(cached_args.first())) {
												cached_args = cached_args.rest();
												if (((NIL != cached_args) && (NIL == cached_args.rest())) && pph_params.equal(cached_args.first())) {
													return memoization_state.caching_results(results2);
												}
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_query_phrase_memoized_internal(query, generation_mt, domain_mt, pph_params)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(query, generation_mt, domain_mt, pph_params));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_html_query_phrase(SubLObject v_agenda, SubLObject query, SubLObject generation_mt, SubLObject domain_mt, SubLObject use_blanksP) {
		if (generation_mt == UNPROVIDED) {
			generation_mt = NIL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		if (use_blanksP == UNPROVIDED) {
			use_blanksP = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == generation_mt) {
				generation_mt = user_interaction_agenda.uia_generation_language_mt(v_agenda);
			}
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_generation_domain_mt(v_agenda);
			}
			{
				SubLObject v_answer = NIL;
				{
					SubLObject _prev_bind_0 = pph_vars.$pph_blanks_for_varsP$.currentBinding(thread);
					try {
						pph_vars.$pph_blanks_for_varsP$.bind(use_blanksP, thread);
						{
							SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
							SubLObject local_state = state;
							{
								SubLObject _prev_bind_0_24 = memoization_state.$memoization_state$.currentBinding(thread);
								try {
									memoization_state.$memoization_state$.bind(local_state, thread);
									{
										final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
										try {
											{
												SubLObject target = cb_utilities.cb_frame_name(uia_get_default_pph_frame_name());
												SubLObject function = uia_get_default_pph_link_function();
												{
													SubLObject _prev_bind_0_25 = pph_vars.$constant_link_function$.currentBinding(thread);
													SubLObject _prev_bind_1 = pph_vars.$html_generation_target$.currentBinding(thread);
													try {
														pph_vars.$constant_link_function$.bind(NIL != function ? ((SubLObject) (function)) : pph_vars.$constant_link_function$.getDynamicValue(thread), thread);
														pph_vars.$html_generation_target$.bind(NIL != target ? ((SubLObject) (target)) : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
														v_answer = uia_html_query_phrase_memoized(query, generation_mt, domain_mt, UNPROVIDED);
													} finally {
														pph_vars.$html_generation_target$.rebind(_prev_bind_1, thread);
														pph_vars.$constant_link_function$.rebind(_prev_bind_0_25, thread);
													}
												}
											}
										} finally {
											{
												SubLObject _prev_bind_0_26 = $is_thread_performing_cleanupP$.currentBinding(thread);
												try {
													$is_thread_performing_cleanupP$.bind(T, thread);
													if ((NIL != local_state) && (NIL == original_memoization_process)) {
														memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
													}
												} finally {
													$is_thread_performing_cleanupP$.rebind(_prev_bind_0_26, thread);
												}
											}
										}
									}
								} finally {
									memoization_state.$memoization_state$.rebind(_prev_bind_0_24, thread);
								}
							}
						}
					} finally {
						pph_vars.$pph_blanks_for_varsP$.rebind(_prev_bind_0, thread);
					}
				}
				return v_answer;
			}
		}
	}

	public static final SubLObject uia_html_query_phrase_memoized_internal(SubLObject query, SubLObject generation_mt, SubLObject domain_mt, SubLObject pph_params) {
		if (pph_params == UNPROVIDED) {
			pph_params = pph_vars.pph_current_parameters(UNPROVIDED);
		}
		return rkf_sentence_communicator.rkf_html_query_phrase(query, generation_mt, domain_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	public static final SubLObject uia_html_query_phrase_memoized(SubLObject query, SubLObject generation_mt, SubLObject domain_mt, SubLObject pph_params) {
		if (pph_params == UNPROVIDED) {
			pph_params = pph_vars.pph_current_parameters(UNPROVIDED);
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_html_query_phrase_memoized_internal(query, generation_mt, domain_mt, pph_params);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_HTML_QUERY_PHRASE_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_HTML_QUERY_PHRASE_MEMOIZED, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_HTML_QUERY_PHRASE_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_4(query, generation_mt, domain_mt, pph_params);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (query.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (generation_mt.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (domain_mt.equal(cached_args.first())) {
												cached_args = cached_args.rest();
												if (((NIL != cached_args) && (NIL == cached_args.rest())) && pph_params.equal(cached_args.first())) {
													return memoization_state.caching_results(results2);
												}
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_html_query_phrase_memoized_internal(query, generation_mt, domain_mt, pph_params)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(query, generation_mt, domain_mt, pph_params));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_imperative_phrase(SubLObject v_agenda, SubLObject imperative, SubLObject generation_mt, SubLObject domain_mt, SubLObject use_blanksP) {
		if (generation_mt == UNPROVIDED) {
			generation_mt = NIL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		if (use_blanksP == UNPROVIDED) {
			use_blanksP = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == generation_mt) {
				generation_mt = user_interaction_agenda.uia_generation_language_mt(v_agenda);
			}
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_generation_domain_mt(v_agenda);
			}
			{
				SubLObject v_answer = NIL;
				{
					SubLObject _prev_bind_0 = pph_vars.$pph_blanks_for_varsP$.currentBinding(thread);
					try {
						pph_vars.$pph_blanks_for_varsP$.bind(use_blanksP, thread);
						{
							SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
							SubLObject local_state = state;
							{
								SubLObject _prev_bind_0_27 = memoization_state.$memoization_state$.currentBinding(thread);
								try {
									memoization_state.$memoization_state$.bind(local_state, thread);
									{
										final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
										try {
											v_answer = uia_imperative_phrase_memoized(imperative, generation_mt, domain_mt, UNPROVIDED);
										} finally {
											{
												SubLObject _prev_bind_0_28 = $is_thread_performing_cleanupP$.currentBinding(thread);
												try {
													$is_thread_performing_cleanupP$.bind(T, thread);
													if ((NIL != local_state) && (NIL == original_memoization_process)) {
														memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
													}
												} finally {
													$is_thread_performing_cleanupP$.rebind(_prev_bind_0_28, thread);
												}
											}
										}
									}
								} finally {
									memoization_state.$memoization_state$.rebind(_prev_bind_0_27, thread);
								}
							}
						}
					} finally {
						pph_vars.$pph_blanks_for_varsP$.rebind(_prev_bind_0, thread);
					}
				}
				return v_answer;
			}
		}
	}

	public static final SubLObject uia_imperative_phrase_memoized_internal(SubLObject imperative, SubLObject generation_mt, SubLObject domain_mt, SubLObject pph_params) {
		if (pph_params == UNPROVIDED) {
			pph_params = pph_vars.pph_current_parameters(UNPROVIDED);
		}
		return rkf_sentence_communicator.rkf_imperative_phrase(imperative, generation_mt, domain_mt, $TEXT, UNPROVIDED);
	}

	public static final SubLObject uia_imperative_phrase_memoized(SubLObject imperative, SubLObject generation_mt, SubLObject domain_mt, SubLObject pph_params) {
		if (pph_params == UNPROVIDED) {
			pph_params = pph_vars.pph_current_parameters(UNPROVIDED);
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_imperative_phrase_memoized_internal(imperative, generation_mt, domain_mt, pph_params);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_IMPERATIVE_PHRASE_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_IMPERATIVE_PHRASE_MEMOIZED, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_IMPERATIVE_PHRASE_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_4(imperative, generation_mt, domain_mt, pph_params);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (imperative.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (generation_mt.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (domain_mt.equal(cached_args.first())) {
												cached_args = cached_args.rest();
												if (((NIL != cached_args) && (NIL == cached_args.rest())) && pph_params.equal(cached_args.first())) {
													return memoization_state.caching_results(results2);
												}
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_imperative_phrase_memoized_internal(imperative, generation_mt, domain_mt, pph_params)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(imperative, generation_mt, domain_mt, pph_params));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_html_imperative_phrase(SubLObject v_agenda, SubLObject imperative, SubLObject generation_mt, SubLObject domain_mt) {
		if (generation_mt == UNPROVIDED) {
			generation_mt = NIL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == generation_mt) {
				generation_mt = user_interaction_agenda.uia_generation_language_mt(v_agenda);
			}
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_generation_domain_mt(v_agenda);
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
							final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								{
									SubLObject target = cb_utilities.cb_frame_name(uia_get_default_pph_frame_name());
									SubLObject function = uia_get_default_pph_link_function();
									{
										SubLObject _prev_bind_0_29 = pph_vars.$constant_link_function$.currentBinding(thread);
										SubLObject _prev_bind_1 = pph_vars.$html_generation_target$.currentBinding(thread);
										try {
											pph_vars.$constant_link_function$.bind(NIL != function ? ((SubLObject) (function)) : pph_vars.$constant_link_function$.getDynamicValue(thread), thread);
											pph_vars.$html_generation_target$.bind(NIL != target ? ((SubLObject) (target)) : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
											v_answer = uia_html_imperative_phrase_memoized(imperative, generation_mt, domain_mt, UNPROVIDED);
										} finally {
											pph_vars.$html_generation_target$.rebind(_prev_bind_1, thread);
											pph_vars.$constant_link_function$.rebind(_prev_bind_0_29, thread);
										}
									}
								}
							} finally {
								{
									SubLObject _prev_bind_0_30 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_30, thread);
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

	public static final SubLObject uia_html_imperative_phrase_memoized_internal(SubLObject imperative, SubLObject generation_mt, SubLObject domain_mt, SubLObject pph_params) {
		if (pph_params == UNPROVIDED) {
			pph_params = pph_vars.pph_current_parameters(UNPROVIDED);
		}
		return rkf_sentence_communicator.rkf_html_imperative_phrase(imperative, generation_mt, domain_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	public static final SubLObject uia_html_imperative_phrase_memoized(SubLObject imperative, SubLObject generation_mt, SubLObject domain_mt, SubLObject pph_params) {
		if (pph_params == UNPROVIDED) {
			pph_params = pph_vars.pph_current_parameters(UNPROVIDED);
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_html_imperative_phrase_memoized_internal(imperative, generation_mt, domain_mt, pph_params);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_HTML_IMPERATIVE_PHRASE_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_HTML_IMPERATIVE_PHRASE_MEMOIZED, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_HTML_IMPERATIVE_PHRASE_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_4(imperative, generation_mt, domain_mt, pph_params);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (imperative.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (generation_mt.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (domain_mt.equal(cached_args.first())) {
												cached_args = cached_args.rest();
												if (((NIL != cached_args) && (NIL == cached_args.rest())) && pph_params.equal(cached_args.first())) {
													return memoization_state.caching_results(results2);
												}
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_html_imperative_phrase_memoized_internal(imperative, generation_mt, domain_mt, pph_params)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(imperative, generation_mt, domain_mt, pph_params));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	/**
	 *
	 *
	 * @unknown terms can be either naked cycl terms or itp-semantics objects
	 */
	public static final SubLObject uia_terms_distinguishing_phrases(SubLObject v_agenda, SubLObject terms, SubLObject generation_mt, SubLObject domain_mt, SubLObject one_time_shotP, SubLObject force, SubLObject clarify_linksP, SubLObject include_typesP, SubLObject agr_pred) {
		if (generation_mt == UNPROVIDED) {
			generation_mt = NIL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		if (one_time_shotP == UNPROVIDED) {
			one_time_shotP = NIL;
		}
		if (force == UNPROVIDED) {
			force = $DECLARATIVE;
		}
		if (clarify_linksP == UNPROVIDED) {
			clarify_linksP = NIL;
		}
		if (include_typesP == UNPROVIDED) {
			include_typesP = NIL;
		}
		if (agr_pred == UNPROVIDED) {
			agr_pred = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == generation_mt) {
				generation_mt = user_interaction_agenda.uia_generation_language_mt(v_agenda);
			}
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_generation_domain_mt(v_agenda);
			}
			{
				SubLObject v_answer = NIL;
				SubLObject target = cb_utilities.cb_frame_name(uia_get_default_pph_frame_name());
				SubLObject function = uia_get_default_pph_link_function();
				{
					SubLObject _prev_bind_0 = pph_vars.$constant_link_function$.currentBinding(thread);
					SubLObject _prev_bind_1 = pph_vars.$html_generation_target$.currentBinding(thread);
					try {
						pph_vars.$constant_link_function$.bind(NIL != function ? ((SubLObject) (function)) : pph_vars.$constant_link_function$.getDynamicValue(thread), thread);
						pph_vars.$html_generation_target$.bind(NIL != target ? ((SubLObject) (target)) : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
						if (NIL != one_time_shotP) {
							v_answer = uia_terms_distinguishing_phrases_memoized(terms, generation_mt, domain_mt, force, clarify_linksP, include_typesP, agr_pred, UNPROVIDED);
						} else {
							{
								SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
								SubLObject local_state = state;
								{
									SubLObject _prev_bind_0_31 = memoization_state.$memoization_state$.currentBinding(thread);
									try {
										memoization_state.$memoization_state$.bind(local_state, thread);
										{
											final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
											try {
												v_answer = uia_terms_distinguishing_phrases_memoized(terms, generation_mt, domain_mt, force, clarify_linksP, include_typesP, agr_pred, UNPROVIDED);
											} finally {
												{
													SubLObject _prev_bind_0_32 = $is_thread_performing_cleanupP$.currentBinding(thread);
													try {
														$is_thread_performing_cleanupP$.bind(T, thread);
														if ((NIL != local_state) && (NIL == original_memoization_process)) {
															memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
														}
													} finally {
														$is_thread_performing_cleanupP$.rebind(_prev_bind_0_32, thread);
													}
												}
											}
										}
									} finally {
										memoization_state.$memoization_state$.rebind(_prev_bind_0_31, thread);
									}
								}
							}
						}
					} finally {
						pph_vars.$html_generation_target$.rebind(_prev_bind_1, thread);
						pph_vars.$constant_link_function$.rebind(_prev_bind_0, thread);
					}
				}
				return v_answer;
			}
		}
	}

	public static final SubLObject uia_terms_distinguishing_phrases_memoized_internal(SubLObject terms, SubLObject generation_mt, SubLObject domain_mt, SubLObject force, SubLObject clarify_linksP, SubLObject include_typesP, SubLObject agr_pred, SubLObject pph_params) {
		if (pph_params == UNPROVIDED) {
			pph_params = pph_vars.pph_current_parameters(UNPROVIDED);
		}
		{
			SubLObject mode = (NIL != clarify_linksP) ? ((SubLObject) ($HTML)) : $TEXT;
			return rkf_concept_communicator.rkf_terms_distinguishing_phrases(terms, generation_mt, domain_mt, force, mode, include_typesP, agr_pred);
		}
	}

	public static final SubLObject uia_terms_distinguishing_phrases_memoized(SubLObject terms, SubLObject generation_mt, SubLObject domain_mt, SubLObject force, SubLObject clarify_linksP, SubLObject include_typesP, SubLObject agr_pred, SubLObject pph_params) {
		if (pph_params == UNPROVIDED) {
			pph_params = pph_vars.pph_current_parameters(UNPROVIDED);
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_terms_distinguishing_phrases_memoized_internal(terms, generation_mt, domain_mt, force, clarify_linksP, include_typesP, agr_pred, pph_params);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_TERMS_DISTINGUISHING_PHRASES_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_TERMS_DISTINGUISHING_PHRASES_MEMOIZED, EIGHT_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_TERMS_DISTINGUISHING_PHRASES_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_8(terms, generation_mt, domain_mt, force, clarify_linksP, include_typesP, agr_pred, pph_params);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (terms.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (generation_mt.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (domain_mt.equal(cached_args.first())) {
												cached_args = cached_args.rest();
												if (force.equal(cached_args.first())) {
													cached_args = cached_args.rest();
													if (clarify_linksP.equal(cached_args.first())) {
														cached_args = cached_args.rest();
														if (include_typesP.equal(cached_args.first())) {
															cached_args = cached_args.rest();
															if (agr_pred.equal(cached_args.first())) {
																cached_args = cached_args.rest();
																if (((NIL != cached_args) && (NIL == cached_args.rest())) && pph_params.equal(cached_args.first())) {
																	return memoization_state.caching_results(results2);
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
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_terms_distinguishing_phrases_memoized_internal(terms, generation_mt, domain_mt, force, clarify_linksP, include_typesP, agr_pred, pph_params)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(terms, generation_mt, domain_mt, force, clarify_linksP, include_typesP, agr_pred, pph_params));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_terms_distinguishing_sentences(SubLObject v_agenda, SubLObject terms, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_generation_domain_mt(v_agenda);
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
								v_answer = uia_terms_distinguishing_sentences_memoized(terms, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_33 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_33, thread);
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

	public static final SubLObject uia_terms_distinguishing_sentences_memoized_internal(SubLObject terms, SubLObject domain_mt) {
		return rkf_concept_clarifier.rkf_terms_distinguishing_sentences(terms, domain_mt);
	}

	public static final SubLObject uia_terms_distinguishing_sentences_memoized(SubLObject terms, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_terms_distinguishing_sentences_memoized_internal(terms, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_TERMS_DISTINGUISHING_SENTENCES_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_TERMS_DISTINGUISHING_SENTENCES_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_TERMS_DISTINGUISHING_SENTENCES_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(terms, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (terms.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_terms_distinguishing_sentences_memoized_internal(terms, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(terms, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_term_clarifying_sentences(SubLObject v_agenda, SubLObject v_term, SubLObject domain_mt, SubLObject count, SubLObject strict_clarification_checkingP) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		if (count == UNPROVIDED) {
			count = ONE_INTEGER;
		}
		if (strict_clarification_checkingP == UNPROVIDED) {
			strict_clarification_checkingP = NIL;
		}
		if (NIL == domain_mt) {
			domain_mt = user_interaction_agenda.uia_generation_domain_mt(v_agenda);
		}
		{
			SubLObject v_answer = NIL;
			v_answer = uia_term_clarifying_sentences_memoized(v_term, domain_mt, count, strict_clarification_checkingP);
			return v_answer;
		}
	}

	public static final SubLObject uia_term_clarifying_sentences_memoized_internal(SubLObject v_term, SubLObject domain_mt, SubLObject count, SubLObject strict_clarification_checkingP) {
		{
			SubLObject raw_sentences = rkf_concept_clarifier.rkf_clarifying_sentences(v_term, domain_mt, count, NIL, strict_clarification_checkingP);
			SubLObject sentences = NIL;
			SubLObject cdolist_list_var = raw_sentences;
			SubLObject sentence = NIL;
			for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), sentence = cdolist_list_var.first()) {
				if (NIL == uia_irrelevant_formula_memoizedP(sentence, domain_mt)) {
					sentences = cons(sentence, sentences);
				}
			}
			return nreverse(sentences);
		}
	}

	public static final SubLObject uia_term_clarifying_sentences_memoized(SubLObject v_term, SubLObject domain_mt, SubLObject count, SubLObject strict_clarification_checkingP) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_term_clarifying_sentences_memoized_internal(v_term, domain_mt, count, strict_clarification_checkingP);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_TERM_CLARIFYING_SENTENCES_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_TERM_CLARIFYING_SENTENCES_MEMOIZED, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_TERM_CLARIFYING_SENTENCES_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_4(v_term, domain_mt, count, strict_clarification_checkingP);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (v_term.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (domain_mt.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (count.equal(cached_args.first())) {
												cached_args = cached_args.rest();
												if (((NIL != cached_args) && (NIL == cached_args.rest())) && strict_clarification_checkingP.equal(cached_args.first())) {
													return memoization_state.caching_results(results2);
												}
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_term_clarifying_sentences_memoized_internal(v_term, domain_mt, count, strict_clarification_checkingP)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, domain_mt, count, strict_clarification_checkingP));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_terms_distinguishing_pictures(SubLObject v_agenda, SubLObject terms, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		if (NIL == domain_mt) {
			domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
		}
		{
			SubLObject v_answer = NIL;
			v_answer = uia_terms_distinguishing_pictures_memoized(terms, domain_mt);
			return v_answer;
		}
	}

	public static final SubLObject uia_terms_distinguishing_pictures_memoized_internal(SubLObject terms, SubLObject domain_mt) {
		return rkf_concept_clarifier.rkf_terms_distinguishing_pictures(terms, domain_mt);
	}

	public static final SubLObject uia_terms_distinguishing_pictures_memoized(SubLObject terms, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_terms_distinguishing_pictures_memoized_internal(terms, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_TERMS_DISTINGUISHING_PICTURES_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_TERMS_DISTINGUISHING_PICTURES_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_TERMS_DISTINGUISHING_PICTURES_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(terms, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (terms.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_terms_distinguishing_pictures_memoized_internal(terms, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(terms, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	/**
	 * Use when bootstrapping makes all other ones impossible.
	 */
	public static final SubLObject uia_bootstrapping_generate_phrase(SubLObject v_term) {
		return pph_main.generate_phrase(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	/**
	 *
	 *
	 * @return STRINGP or :UNSUPPORTED or :TRIVIAL; A string describing the arg-type constraints
	on PRED.
	 * @unknown baxter
	 */
	public static final SubLObject uia_html_arg_type_summary_for_pred(SubLObject v_agenda, SubLObject pred, SubLObject argnum, SubLObject generation_mt, SubLObject domain_mt) {
		if (argnum == UNPROVIDED) {
			argnum = $ALL;
		}
		if (generation_mt == UNPROVIDED) {
			generation_mt = NIL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		if (NIL == generation_mt) {
			generation_mt = user_interaction_agenda.uia_generation_language_mt(v_agenda);
		}
		if (NIL == domain_mt) {
			domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
		}
		return uia_arg_type_summary_for_pred(v_agenda, pred, argnum, generation_mt, domain_mt, $HTML);
	}

	/**
	 *
	 *
	 * @return STRINGP or :UNSUPPORTED or :TRIVIAL; A string describing the arg-type constraints
	on PRED.
	 * @unknown baxter
	 */
	public static final SubLObject uia_arg_type_summary_for_pred(SubLObject v_agenda, SubLObject pred, SubLObject argnum, SubLObject generation_mt, SubLObject domain_mt, SubLObject mode) {
		if (argnum == UNPROVIDED) {
			argnum = $ALL;
		}
		if (generation_mt == UNPROVIDED) {
			generation_mt = NIL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		if (mode == UNPROVIDED) {
			mode = $TEXT;
		}
		if (NIL == generation_mt) {
			generation_mt = user_interaction_agenda.uia_generation_language_mt(v_agenda);
		}
		if (NIL == domain_mt) {
			domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
		}
		{
			SubLObject summary_cycl = uia_arg_type_summary_cycl_for_pred(v_agenda, pred, argnum, domain_mt);
			if (summary_cycl.isKeyword()) {
				return summary_cycl;
			}
			{
				SubLObject pcase_var = mode;
				if (pcase_var.eql($TEXT)) {
					return uia_sentence_phrase(v_agenda, summary_cycl, generation_mt, domain_mt);
				} else if (pcase_var.eql($HTML)) {
					return uia_html_sentence_phrase(v_agenda, summary_cycl, generation_mt, domain_mt);
				}

			}
		}
		return NIL;
	}

	/**
	 *
	 *
	 * @return EL-FORMULA-P or :TRIVIAL or :UNSUPPORTED; A CycL sentence summarizing the arg-type
	constraints on ARGNUM of PRED in DOMAIN-MT.
	 * @unknown baxter
	 */
	public static final SubLObject uia_arg_type_summary_cycl_for_pred(SubLObject v_agenda, SubLObject pred, SubLObject argnum, SubLObject domain_mt) {
		if (argnum == UNPROVIDED) {
			argnum = $ALL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject v_answer = $UNSUPPORTED;
				if (NIL != hlmt.hlmt_p(domain_mt)) {
					{
						SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
						SubLObject local_state = state;
						{
							SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
							try {
								memoization_state.$memoization_state$.bind(local_state, thread);
								{
									final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
									try {
										v_answer = uia_arg_type_summary_cycl_for_pred_memoized(pred, domain_mt, argnum);
									} finally {
										{
											SubLObject _prev_bind_0_34 = $is_thread_performing_cleanupP$.currentBinding(thread);
											try {
												$is_thread_performing_cleanupP$.bind(T, thread);
												if ((NIL != local_state) && (NIL == original_memoization_process)) {
													memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
												}
											} finally {
												$is_thread_performing_cleanupP$.rebind(_prev_bind_0_34, thread);
											}
										}
									}
								}
							} finally {
								memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
							}
						}
					}
				}
				return v_answer;
			}
		}
	}

	public static final SubLObject uia_arg_type_summary_cycl_for_pred_memoized_internal(SubLObject pred, SubLObject domain_mt, SubLObject argnum) {
		return rkf_concept_communicator.rkf_arg_type_summary_cycl_for_pred(pred, domain_mt, argnum);
	}

	public static final SubLObject uia_arg_type_summary_cycl_for_pred_memoized(SubLObject pred, SubLObject domain_mt, SubLObject argnum) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_arg_type_summary_cycl_for_pred_memoized_internal(pred, domain_mt, argnum);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_ARG_TYPE_SUMMARY_CYCL_FOR_PRED_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_ARG_TYPE_SUMMARY_CYCL_FOR_PRED_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_ARG_TYPE_SUMMARY_CYCL_FOR_PRED_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_3(pred, domain_mt, argnum);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (pred.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (domain_mt.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (((NIL != cached_args) && (NIL == cached_args.rest())) && argnum.equal(cached_args.first())) {
												return memoization_state.caching_results(results2);
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_arg_type_summary_cycl_for_pred_memoized_internal(pred, domain_mt, argnum)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(pred, domain_mt, argnum));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	/**
	 *
	 *
	 * @return CycL expression denoting a salient collection of which arg ARGNUM of RELATION
	is constrained to be an instance.
	 * @unknown Also uses #$argGenl information, returning it as (#$SpecsFn <col).
	 * @unknown baxter
	 */
	public static final SubLObject uia_salient_argn_isa(SubLObject v_agenda, SubLObject relation, SubLObject argnum, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		if (NIL == domain_mt) {
			domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
		}
		{
			SubLObject v_answer = NIL;
			v_answer = uia_salient_argn_isa_memoized(relation, argnum, domain_mt);
			return v_answer;
		}
	}

	public static final SubLObject uia_salient_argn_isa_memoized_internal(SubLObject relation, SubLObject argnum, SubLObject domain_mt) {
		return rkf_concept_clarifier.rkf_salient_argn_isa(relation, argnum, domain_mt);
	}

	public static final SubLObject uia_salient_argn_isa_memoized(SubLObject relation, SubLObject argnum, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_salient_argn_isa_memoized_internal(relation, argnum, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_SALIENT_ARGN_ISA_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_SALIENT_ARGN_ISA_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_SALIENT_ARGN_ISA_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_3(relation, argnum, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (relation.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (argnum.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
												return memoization_state.caching_results(results2);
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_salient_argn_isa_memoized_internal(relation, argnum, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(relation, argnum, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_summary_sentence(SubLObject v_agenda, SubLObject v_term) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject language_mt = user_interaction_agenda.uia_generation_interaction_mt(v_agenda, UNPROVIDED);
				SubLObject domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
				SubLObject result_string = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								result_string = uia_summary_sentence_memoized(v_agenda, v_term, language_mt, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_35 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_35, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return result_string;
			}
		}
	}

	public static final SubLObject uia_summary_sentence_memoized_internal(SubLObject v_agenda, SubLObject v_term, SubLObject language_mt, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject summary_sentences = uia_term_clarifying_sentences(v_agenda, v_term, NIL, $ALL, NIL);
				SubLObject truncate_initial_sentenceP = T;
				SubLObject result = NIL;
				if (NIL != summary_sentences) {
					{
						SubLObject _prev_bind_0 = pph_vars.$constant_link_function$.currentBinding(thread);
						try {
							pph_vars.$constant_link_function$.bind($NONE, thread);
							result = pph_document.pph_summarize_term(v_term, summary_sentences, language_mt, domain_mt, $HTML, truncate_initial_sentenceP);
						} finally {
							pph_vars.$constant_link_function$.rebind(_prev_bind_0, thread);
						}
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject uia_summary_sentence_memoized(SubLObject v_agenda, SubLObject v_term, SubLObject language_mt, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_summary_sentence_memoized_internal(v_agenda, v_term, language_mt, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_SUMMARY_SENTENCE_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_SUMMARY_SENTENCE_MEMOIZED, FOUR_INTEGER, NIL, EQ, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_SUMMARY_SENTENCE_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_4(v_agenda, v_term, language_mt, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (v_agenda == cached_args.first()) {
										cached_args = cached_args.rest();
										if (v_term == cached_args.first()) {
											cached_args = cached_args.rest();
											if (language_mt == cached_args.first()) {
												cached_args = cached_args.rest();
												if (((NIL != cached_args) && (NIL == cached_args.rest())) && (domain_mt == cached_args.first())) {
													return memoization_state.caching_results(results2);
												}
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_summary_sentence_memoized_internal(v_agenda, v_term, language_mt, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_agenda, v_term, language_mt, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_html_summary_sentence(SubLObject v_agenda, SubLObject v_term) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject language_mt = user_interaction_agenda.uia_generation_interaction_mt(v_agenda, UNPROVIDED);
				SubLObject domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
				SubLObject result_string = NIL;
				SubLObject target = cb_utilities.cb_frame_name(uia_get_default_pph_frame_name());
				SubLObject function = uia_get_default_pph_link_function();
				{
					SubLObject _prev_bind_0 = pph_vars.$constant_link_function$.currentBinding(thread);
					SubLObject _prev_bind_1 = pph_vars.$html_generation_target$.currentBinding(thread);
					try {
						pph_vars.$constant_link_function$.bind(NIL != function ? ((SubLObject) (function)) : pph_vars.$constant_link_function$.getDynamicValue(thread), thread);
						pph_vars.$html_generation_target$.bind(NIL != target ? ((SubLObject) (target)) : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
						{
							SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
							SubLObject local_state = state;
							{
								SubLObject _prev_bind_0_36 = memoization_state.$memoization_state$.currentBinding(thread);
								try {
									memoization_state.$memoization_state$.bind(local_state, thread);
									{
										final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
										try {
											{
												SubLObject _prev_bind_0_37 = rkf_macros.$rkf_addressee$.currentBinding(thread);
												SubLObject _prev_bind_1_38 = rkf_macros.$rkf_speaker$.currentBinding(thread);
												try {
													rkf_macros.$rkf_addressee$.bind(uia_macros.uia_addressee_for_utterance_type(v_agenda, $CYC_TO_USER), thread);
													rkf_macros.$rkf_speaker$.bind(uia_macros.uia_speaker_for_utterance_type(v_agenda, $CYC_TO_USER), thread);
													result_string = uia_html_summary_sentence_memoized(v_agenda, v_term, language_mt, domain_mt);
												} finally {
													rkf_macros.$rkf_speaker$.rebind(_prev_bind_1_38, thread);
													rkf_macros.$rkf_addressee$.rebind(_prev_bind_0_37, thread);
												}
											}
										} finally {
											{
												SubLObject _prev_bind_0_39 = $is_thread_performing_cleanupP$.currentBinding(thread);
												try {
													$is_thread_performing_cleanupP$.bind(T, thread);
													if ((NIL != local_state) && (NIL == original_memoization_process)) {
														memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
													}
												} finally {
													$is_thread_performing_cleanupP$.rebind(_prev_bind_0_39, thread);
												}
											}
										}
									}
								} finally {
									memoization_state.$memoization_state$.rebind(_prev_bind_0_36, thread);
								}
							}
						}
					} finally {
						pph_vars.$html_generation_target$.rebind(_prev_bind_1, thread);
						pph_vars.$constant_link_function$.rebind(_prev_bind_0, thread);
					}
				}
				return result_string;
			}
		}
	}

	public static final SubLObject uia_html_summary_sentence_memoized_internal(SubLObject v_agenda, SubLObject v_term, SubLObject language_mt, SubLObject domain_mt) {
		{
			SubLObject summary_sentences = uia_term_clarifying_sentences(v_agenda, v_term, NIL, $ALL, NIL);
			return rkf_concept_communicator.rkf_html_summary_sentence(v_term, summary_sentences, language_mt, domain_mt);
		}
	}

	public static final SubLObject uia_html_summary_sentence_memoized(SubLObject v_agenda, SubLObject v_term, SubLObject language_mt, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_html_summary_sentence_memoized_internal(v_agenda, v_term, language_mt, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_HTML_SUMMARY_SENTENCE_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_HTML_SUMMARY_SENTENCE_MEMOIZED, FOUR_INTEGER, NIL, EQ, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_HTML_SUMMARY_SENTENCE_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_4(v_agenda, v_term, language_mt, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (v_agenda == cached_args.first()) {
										cached_args = cached_args.rest();
										if (v_term == cached_args.first()) {
											cached_args = cached_args.rest();
											if (language_mt == cached_args.first()) {
												cached_args = cached_args.rest();
												if (((NIL != cached_args) && (NIL == cached_args.rest())) && (domain_mt == cached_args.first())) {
													return memoization_state.caching_results(results2);
												}
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_html_summary_sentence_memoized_internal(v_agenda, v_term, language_mt, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_agenda, v_term, language_mt, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_summarize(SubLObject v_agenda, SubLObject v_term, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		if (NIL == domain_mt) {
			domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
		}
		{
			SubLObject v_answer = NIL;
			v_answer = uia_summarize_memoized(v_term, domain_mt);
			return v_answer;
		}
	}

	public static final SubLObject uia_summarize_memoized_internal(SubLObject v_term, SubLObject domain_mt) {
		return uia_filter_irrelevant_sentences_memoized(rkf_concept_summarizer.rkf_summarize(v_term, domain_mt, UNPROVIDED), domain_mt);
	}

	public static final SubLObject uia_summarize_memoized(SubLObject v_term, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_summarize_memoized_internal(v_term, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_SUMMARIZE_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_SUMMARIZE_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_SUMMARIZE_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (v_term.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_summarize_memoized_internal(v_term, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_sentences_for_term(SubLObject v_agenda, SubLObject v_term, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		if (NIL == domain_mt) {
			domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
		}
		{
			SubLObject v_answer = NIL;
			v_answer = uia_sentences_for_term_memoized(v_term, domain_mt);
			return v_answer;
		}
	}

	public static final SubLObject uia_sentences_for_term_memoized_internal(SubLObject v_term, SubLObject domain_mt) {
		if (NIL != el_utilities.possibly_naut_p(v_term)) {
			v_term = function_terms.naut_to_nart(v_term);
		}
		return rkf_concept_summarizer.rkf_ist_sentences(v_term, domain_mt);
	}

	public static final SubLObject uia_sentences_for_term_memoized(SubLObject v_term, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_sentences_for_term_memoized_internal(v_term, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_SENTENCES_FOR_TERM_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_SENTENCES_FOR_TERM_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_SENTENCES_FOR_TERM_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (v_term.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_sentences_for_term_memoized_internal(v_term, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	/**
	 *
	 *
	 * @return 0 CycL sentences in common to TERM1 and TERM2
	 * @return 1 CycL sentences unique to TERM1
	 * @return 2 CycL sentences unique to TERM2
	 */
	public static final SubLObject uia_compare_terms(SubLObject v_agenda, SubLObject term1, SubLObject term2, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject common = NIL;
				SubLObject unique1 = NIL;
				SubLObject unique2 = NIL;
				thread.resetMultipleValues();
				{
					SubLObject common_40 = uia_compare_terms_memoized(term1, term2, domain_mt);
					SubLObject unique1_41 = thread.secondMultipleValue();
					SubLObject unique2_42 = thread.thirdMultipleValue();
					thread.resetMultipleValues();
					common = common_40;
					unique1 = unique1_41;
					unique2 = unique2_42;
				}
				return values(common, unique1, unique2);
			}
		}
	}

	public static final SubLObject uia_compare_terms_memoized_internal(SubLObject term1, SubLObject term2, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			thread.resetMultipleValues();
			{
				SubLObject common_sentences = rkf_tools.rkf_compare_terms(term1, term2, domain_mt);
				SubLObject term1_sentences = thread.secondMultipleValue();
				SubLObject term2_sentences = thread.thirdMultipleValue();
				thread.resetMultipleValues();
				common_sentences = uia_filter_irrelevant_sentences_memoized(common_sentences, domain_mt);
				term1_sentences = uia_filter_irrelevant_sentences_memoized(term1_sentences, domain_mt);
				term2_sentences = uia_filter_irrelevant_sentences_memoized(term2_sentences, domain_mt);
				return values(common_sentences, term1_sentences, term2_sentences);
			}
		}
	}

	public static final SubLObject uia_compare_terms_memoized(SubLObject term1, SubLObject term2, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_compare_terms_memoized_internal(term1, term2, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_COMPARE_TERMS_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_COMPARE_TERMS_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_COMPARE_TERMS_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_3(term1, term2, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (term1.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (term2.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
												return memoization_state.caching_results(results2);
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_compare_terms_memoized_internal(term1, term2, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(term1, term2, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	/**
	 *
	 *
	 * @return 0 CycL sentences in common to TERM1 and TERM2
	 * @return 1 CycL sentences unique to TERM1
	 * @return 2 CycL sentences unique to TERM2
	 */
	public static final SubLObject uia_related_terms(SubLObject v_agenda, SubLObject v_term, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		if (NIL == domain_mt) {
			domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
		}
		{
			SubLObject result = NIL;
			result = uia_related_terms_memoized(v_term, domain_mt);
			return result;
		}
	}

	public static final SubLObject uia_related_terms_memoized_internal(SubLObject v_term, SubLObject domain_mt) {
		return uia_filter_irrelevant_terms_memoized(removal_modules_conceptually_related.all_conceptually_related(v_term, domain_mt), domain_mt);
	}

	public static final SubLObject uia_related_terms_memoized(SubLObject v_term, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_related_terms_memoized_internal(v_term, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_RELATED_TERMS_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_RELATED_TERMS_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_RELATED_TERMS_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (v_term.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_related_terms_memoized_internal(v_term, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_candidate_sentences_relating_terms(SubLObject v_agenda, SubLObject terms, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		if (NIL == domain_mt) {
			domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
		}
		{
			SubLObject result = NIL;
			result = uia_candidate_sentences_relating_terms_memoized(terms, domain_mt);
			return result;
		}
	}

	public static final SubLObject uia_candidate_sentences_relating_terms_memoized_internal(SubLObject terms, SubLObject domain_mt) {
		return uia_filter_irrelevant_or_ill_formed_sentences_memoized(rkf_relationship_suggestor.rkf_candidate_formulas_relating_terms(terms, domain_mt), domain_mt);
	}

	public static final SubLObject uia_candidate_sentences_relating_terms_memoized(SubLObject terms, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_candidate_sentences_relating_terms_memoized_internal(terms, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_CANDIDATE_SENTENCES_RELATING_TERMS_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_CANDIDATE_SENTENCES_RELATING_TERMS_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_CANDIDATE_SENTENCES_RELATING_TERMS_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(terms, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (terms.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_candidate_sentences_relating_terms_memoized_internal(terms, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(terms, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_rejected_sentence(SubLObject v_agenda, SubLObject sentence, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		if (NIL == domain_mt) {
			domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
		}
		{
			SubLObject result = NIL;
			result = uia_rejected_sentence_memoized(sentence, domain_mt);
			return result;
		}
	}

	public static final SubLObject uia_rejected_sentence_memoized_internal(SubLObject sentence, SubLObject domain_mt) {
		return rkf_contradiction_finder.rkf_rejected(sentence, domain_mt, UNPROVIDED, UNPROVIDED);
	}

	public static final SubLObject uia_rejected_sentence_memoized(SubLObject sentence, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_rejected_sentence_memoized_internal(sentence, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_REJECTED_SENTENCE_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_REJECTED_SENTENCE_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_REJECTED_SENTENCE_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (sentence.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_rejected_sentence_memoized_internal(sentence, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(sentence, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_redundant_sentence(SubLObject v_agenda, SubLObject sentence, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		if (NIL == domain_mt) {
			domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
		}
		{
			SubLObject result = NIL;
			result = uia_redundant_sentence_memoized(sentence, domain_mt);
			return result;
		}
	}

	public static final SubLObject uia_redundant_sentence_memoized_internal(SubLObject sentence, SubLObject domain_mt) {
		return rkf_redundancy_detector.rkf_redundant(sentence, domain_mt, UNPROVIDED, UNPROVIDED);
	}

	public static final SubLObject uia_redundant_sentence_memoized(SubLObject sentence, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_redundant_sentence_memoized_internal(sentence, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_REDUNDANT_SENTENCE_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_REDUNDANT_SENTENCE_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_REDUNDANT_SENTENCE_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (sentence.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_redundant_sentence_memoized_internal(sentence, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(sentence, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	/**
	 * Given a sentence and an argument position (with 0 indicating that the predicate
	 * is to be made more precise, move in the direction of either :GENERALIZE or
	 * :SPECIALIZE, hopping over precision irrelevant terms.
	 */
	public static final SubLObject uia_precisify_argument_candidates(SubLObject v_agenda, SubLObject asent, SubLObject argnum, SubLObject direction, SubLObject type_col, SubLObject domain_mt) {
		if (type_col == UNPROVIDED) {
			type_col = NIL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			if (!((NIL != el_utilities.possibly_atomic_sentence_p(asent)) && (NIL != fort_types_interface.predicateP(cycl_utilities.sentence_arg(asent, ZERO_INTEGER, UNPROVIDED))))) {
				return NIL;
			}
			{
				SubLObject workq = queues.create_queue();
				SubLObject rejects = set.new_set(UNPROVIDED, UNPROVIDED);
				SubLObject solutions = set.new_set(UNPROVIDED, UNPROVIDED);
				SubLObject generalizeP = eq(direction, $GENERALIZE);
				SubLObject preds = rkf_precision_suggestor.rkf_sentence_arg_precisification_options(asent, domain_mt, argnum, generalizeP);
				SubLObject original_arg = cycl_utilities.sentence_arg(asent, argnum, UNPROVIDED);
				if (NIL == preds) {
					return NIL;
				}
				{
					SubLObject seed_term = original_arg;
					queues.enqueue(seed_term, workq);
					set.set_add(seed_term, rejects);
				}
				while (NIL == queues.queue_empty_p(workq)) {
					{
						SubLObject v_term = queues.dequeue(workq);
						SubLObject suggestions = rkf_precision_suggestor.rkf_raw_precisify_arg(asent, argnum, domain_mt, generalizeP, v_term, preds, type_col);
						if (NIL != suggestions) {
							thread.resetMultipleValues();
							{
								SubLObject relevant_terms = uia_partition_terms_by_precision_relevancy(v_agenda, suggestions, domain_mt);
								SubLObject irrelevant_terms = thread.secondMultipleValue();
								thread.resetMultipleValues();
								{
									SubLObject cdolist_list_var = relevant_terms;
									SubLObject relevant_term = NIL;
									for (relevant_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), relevant_term = cdolist_list_var.first()) {
										if (NIL != uia_irrelevant_precision_suggestion_term_fromP(v_agenda, relevant_term, original_arg, domain_mt)) {
											set.set_add(relevant_term, rejects);
										} else {
											set.set_add(relevant_term, solutions);
										}
									}
								}
								{
									SubLObject cdolist_list_var = irrelevant_terms;
									SubLObject skip = NIL;
									for (skip = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), skip = cdolist_list_var.first()) {
										{
											SubLObject new_rejectP = set.set_add(skip, rejects);
											if (NIL != new_rejectP) {
												queues.enqueue(skip, workq);
											}
										}
									}
								}
							}
						} else {
							set.set_add(v_term, rejects);
						}
					}
				}
				{
					SubLObject mode = (NIL != generalizeP) ? ((SubLObject) ($ASCENDING)) : $DESCENDING;
					SubLObject set_elements = set.set_element_list(solutions);
					SubLObject subsumption_preds = uia_precisify_argument_candidates_subsumption_preds(generalizeP, preds);
					SubLObject non_subsumed = set_elements;
					SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(domain_mt);
					{
						SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
						SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
						SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
						try {
							mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
							mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
							mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
							{
								SubLObject cdolist_list_var = subsumption_preds;
								SubLObject subsumption_pred = NIL;
								for (subsumption_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), subsumption_pred = cdolist_list_var.first()) {
									non_subsumed = list_utilities.delete_subsumed_items(non_subsumed, subsumption_pred, UNPROVIDED);
								}
							}
						} finally {
							mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
							mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
							mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
						}
					}
					return cardinality_estimates.sort_by_generality_estimate(non_subsumed, mode);
				}
			}
		}
	}

	public static final SubLObject uia_precisify_argument_candidates_subsumption_preds(SubLObject generalizeP, SubLObject preds) {
		{
			SubLObject ans = NIL;
			SubLObject cdolist_list_var = preds;
			SubLObject pred = NIL;
			for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), pred = cdolist_list_var.first()) {
				{
					SubLObject var = uia_precisify_argument_candidates_subsumption_pred_for_pred(generalizeP, pred);
					if (NIL != var) {
						ans = cons(var, ans);
					}
				}
			}
			return ans;
		}
	}

	/**
	 * If we're precisifying via PRED with generalization valence GENERALIZE?, what test should we use to remove subsumed candidates?
	 */
	public static final SubLObject uia_precisify_argument_candidates_subsumption_pred_for_pred(SubLObject generalizeP, SubLObject pred) {
		{
			SubLObject pcase_var = pred;
			if (pcase_var.eql($$genls)) {
				return NIL != generalizeP ? ((SubLObject) ($sym70$GENL_)) : $sym71$SPEC_;
			} else if (pcase_var.eql($$genlPreds)) {
				return NIL != generalizeP ? ((SubLObject) ($sym73$GENL_PREDICATE_)) : $sym74$SPEC_PREDICATE_;
			} else {
				return NIL;
			}

		}
	}

	/**
	 *
	 *
	 * @param AGENDA
	 * 		uia-agenda-p
	 * @param SENTENCE
	 * 		cycl sentence
	 * @param DOMAIN-MT
	 * 		#$Microtheory
	 * @return list; a list of CycL sentences
	Produce all possible versions of SENTENCE that have predicates that have been maximally
	strengthened along typedGenlPreds/typeGenlInverse links
	 */
	public static final SubLObject uia_typed_replacement_sentences(SubLObject v_agenda, SubLObject sentence, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			SubLObject result = NIL;
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			result = predicate_strengthener.typed_pred_strengthen_formula(sentence, domain_mt, UNPROVIDED);
			return result;
		}
	}

	/**
	 *
	 *
	 * @param AGENDA
	 * 		uia-agenda-p
	 * @param TERM
	 * 		fort-p
	 * @param DOMAIN-MT
	 * 		#$Microtheory
	 * @return list; a list of FORT-P
	return all type-level specializations of the current term
	 */
	public static final SubLObject uia_typed_specializations_for_term(SubLObject v_agenda, SubLObject v_term, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			SubLObject result = NIL;
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			result = rkf_precision_suggestor.rkf_get_typed_specializations_for_collection(v_term, domain_mt);
			return result;
		}
	}

	public static final SubLObject uia_analogous_sentences(SubLObject v_agenda, SubLObject target, SubLObject source, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		if (NIL == domain_mt) {
			domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
		}
		{
			SubLObject result = NIL;
			result = uia_analogous_sentences_memoized(target, source, domain_mt);
			return result;
		}
	}

	public static final SubLObject uia_analogous_sentences_memoized_internal(SubLObject target, SubLObject source, SubLObject domain_mt) {
		return (NIL != cycl_utilities.fort_or_naut_p(target)) && (NIL != cycl_utilities.fort_or_naut_p(source)) ? ((SubLObject) (uia_filter_irrelevant_or_ill_formed_sentences_memoized(rkf_analogy_developer.rkf_analogous_formulas(target, source, domain_mt), domain_mt))) : NIL;
	}

	public static final SubLObject uia_analogous_sentences_memoized(SubLObject target, SubLObject source, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_analogous_sentences_memoized_internal(target, source, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_ANALOGOUS_SENTENCES_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_ANALOGOUS_SENTENCES_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_ANALOGOUS_SENTENCES_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_3(target, source, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (target.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (source.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
												return memoization_state.caching_results(results2);
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_analogous_sentences_memoized_internal(target, source, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(target, source, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_salient_descriptor_mod_string(SubLObject mode) {
		{
			SubLObject pcase_var = mode;
			if (pcase_var.eql($REQUIREMENT)) {
				return $str_alt77$_required;
			} else if (pcase_var.eql($STRONG)) {
				return $str_alt79$_strongly_suggested;
			} else if (pcase_var.eql($WEAK)) {
				return $str_alt81$_other_possible;
			} else if (pcase_var.eql($NEIGHBOR)) {
				return $str_alt83$_induced;
			} else {
				return $str_alt84$;
			}

		}
	}

	/**
	 *
	 *
	 * @return BOOLEANP; Is VAR single-entry in ASSERT-SENTENCE?
	 */
	public static final SubLObject uia_salient_descriptor_single_entry_varP(SubLObject v_agenda, SubLObject var, SubLObject assert_sentence, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
		}
		return rkf_salient_descriptor.rkf_salient_descriptor_single_entry_varP(var, assert_sentence, mt);
	}

	/**
	 * Mark RULE-SPEC as deprecated for the domain mt of AGENDA.
	 */
	public static final SubLObject uia_deprecate_salient_descriptor_rule_spec(SubLObject v_agenda, SubLObject rule_spec) {
		{
			SubLObject mt = user_interaction_agenda.uia_domain_mt(v_agenda);
			SubLObject rule = rkf_salient_descriptor.rkf_salient_descriptor_rule_from_spec(rule_spec, mt);
			return rkf_salient_descriptor.rkf_salient_descriptor_deprecate_rule(rule, mt);
		}
	}

	/**
	 * Mark RULE-ASSERTION as deprecated for the domain mt of AGENDA.
	 */
	public static final SubLObject uia_deprecate_salient_descriptor_rule_assertion(SubLObject v_agenda, SubLObject rule_assertion) {
		{
			SubLObject mt = user_interaction_agenda.uia_domain_mt(v_agenda);
			return rkf_salient_descriptor.rkf_salient_descriptor_deprecate_rule(rule_assertion, mt);
		}
	}

	public static final SubLObject uia_existentially_bind(SubLObject v_agenda, SubLObject sentence) {
		{
			SubLObject bound_sentence = sentence;
			SubLObject cdolist_list_var = el_utilities.sentence_free_variables(sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			SubLObject var = NIL;
			for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), var = cdolist_list_var.first()) {
				bound_sentence = el_utilities.make_existential(var, bound_sentence);
			}
			return bound_sentence;
		}
	}

	public static final SubLObject uia_existentially_unbind(SubLObject v_agenda, SubLObject sentence) {
		{
			SubLObject unbound_sentence = sentence;
			while (NIL != el_utilities.el_existential_p(unbound_sentence)) {
				unbound_sentence = cycl_utilities.formula_arg2(unbound_sentence, UNPROVIDED);
			}
			return unbound_sentence;
		}
	}

	public static final SubLObject uia_salient_generalization(SubLObject uia, SubLObject v_term) {
		return rkf_concept_clarifier.rkf_salient_generalization(v_term, user_interaction_agenda.uia_domain_interaction_mt(uia));
	}

	public static final SubLObject uia_salient_generalizations(SubLObject uia, SubLObject v_term) {
		return rkf_concept_clarifier.rkf_salient_generalizations(v_term, user_interaction_agenda.uia_domain_interaction_mt(uia), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	public static final SubLObject uia_reformulate_assert_sentence(SubLObject v_agenda, SubLObject sentence, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject result = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								result = uia_reformulate_assert_sentence_memoized(sentence, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_43 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_43, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject uia_reformulate_assert_sentence_memoized_internal(SubLObject sentence, SubLObject domain_mt) {
		return rkf_formula_optimizer.rkf_optimize_assert_formula(sentence, domain_mt);
	}

	public static final SubLObject uia_reformulate_assert_sentence_memoized(SubLObject sentence, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_reformulate_assert_sentence_memoized_internal(sentence, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_REFORMULATE_ASSERT_SENTENCE_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_REFORMULATE_ASSERT_SENTENCE_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_REFORMULATE_ASSERT_SENTENCE_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (sentence.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_reformulate_assert_sentence_memoized_internal(sentence, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(sentence, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_reformulate_query_sentence(SubLObject v_agenda, SubLObject sentence, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject result = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								result = uia_reformulate_query_sentence_memoized(sentence, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_44 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_44, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject uia_reformulate_query_sentence_memoized_internal(SubLObject sentence, SubLObject domain_mt) {
		return rkf_formula_optimizer.rkf_optimize_query_formula(sentence, domain_mt);
	}

	public static final SubLObject uia_reformulate_query_sentence_memoized(SubLObject sentence, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_reformulate_query_sentence_memoized_internal(sentence, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_REFORMULATE_QUERY_SENTENCE_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_REFORMULATE_QUERY_SENTENCE_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_REFORMULATE_QUERY_SENTENCE_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (sentence.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_reformulate_query_sentence_memoized_internal(sentence, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(sentence, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_reformulate_sentence(SubLObject v_agenda, SubLObject sentence, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject result = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								result = uia_reformulate_sentence_memoized(sentence, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_45 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_45, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject uia_reformulate_sentence_memoized_internal(SubLObject sentence, SubLObject domain_mt) {
		return rkf_formula_optimizer.rkf_optimize_formula(sentence, domain_mt);
	}

	public static final SubLObject uia_reformulate_sentence_memoized(SubLObject sentence, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_reformulate_sentence_memoized_internal(sentence, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_REFORMULATE_SENTENCE_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_REFORMULATE_SENTENCE_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_REFORMULATE_SENTENCE_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (sentence.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_reformulate_sentence_memoized_internal(sentence, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(sentence, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	/**
	 * Reformulates and asserts SENTENCE.
	 *
	 * @return BOOLEAN; Was the assert successful?
	 */
	public static final SubLObject uia_assert(SubLObject v_agenda, SubLObject sentence, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		if (NIL == domain_mt) {
			domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
		}
		{
			SubLObject reformulated_sentence = uia_reformulate_assert_sentence(v_agenda, sentence, domain_mt);
			return uia_assert_exact(v_agenda, reformulated_sentence, domain_mt);
		}
	}

	/**
	 * Asserts SENTENCE, assuming it's already been reformulated.
	 *
	 * @return BOOLEAN; Was the assert successful?
	 */
	public static final SubLObject uia_assert_exact(SubLObject v_agenda, SubLObject sentence, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject successP = NIL;
				SubLObject error = NIL;
				{
					SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
					try {
						api_control_vars.$the_cyclist$.bind(uia_setup_state.uia_user(v_agenda), thread);
						thread.resetMultipleValues();
						{
							SubLObject successP_46 = rkf_assertion_utilities.rkf_assert_now(sentence, domain_mt);
							SubLObject error_47 = thread.secondMultipleValue();
							thread.resetMultipleValues();
							successP = successP_46;
							error = error_47;
						}
					} finally {
						api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
					}
				}
				if (NIL != error) {
					{
						SubLObject error_string = second(error);
						uia_mumbler.uia_mumble_important(v_agenda, error_string);
					}
				} else if (NIL != successP) {
					rkf_event_dispatcher.ensure_rkf_event_dispatcher_running();
					rkf_event_dispatcher.rkf_post_assert_event(sentence, domain_mt, v_agenda, UNPROVIDED);
					{
						SubLObject new_as = czer_meta.find_assertion_cycl(sentence, domain_mt);
						if (NIL != rkf_salient_descriptor_prompter.rkf_salient_descriptor_candidate_p(new_as)) {
							{
								SubLObject as_phrase = uia_assertion_phrase(v_agenda, new_as, UNPROVIDED, UNPROVIDED);
								uia_tools_salient_descriptor.uia_act_new_salient_descriptor(v_agenda, $RELEVANT, as_phrase, new_as);
							}
						}
					}
				}

				return successP;
			}
		}
	}

	/**
	 * If SENTENCE cannot be found in this form, assert SENTENCE.
	 *
	 * @return BOOLEAN: Was the assert successful?
	 */
	public static final SubLObject uia_import_potentially_redundant_assertion(SubLObject v_agenda, SubLObject sentence, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		if (NIL == domain_mt) {
			domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
		}
		if (NIL == assertion_handles.assertion_p(czer_meta.find_assertion_cycl(sentence, domain_mt))) {
			return uia_assert_exact(v_agenda, sentence, domain_mt);
		}
		return NIL;
	}

	public static final SubLObject uia_commented_assert_exact(SubLObject v_agenda, SubLObject sentence, SubLObject message) {
		if (message == UNPROVIDED) {
			message = NIL;
		}
		uia_assert_exact(v_agenda, sentence, UNPROVIDED);
		if (!message.isString()) {
			message = $str_alt89$I_now_know_the_following_fact__;
		}
		{
			SubLObject paraphrase = uia_sentence_phrase_precise(v_agenda, sentence, UNPROVIDED, UNPROVIDED);
			user_interaction_agenda.uia_act_new_comment(v_agenda, cconcatenate(message, paraphrase));
		}
		return v_agenda;
	}

	// deflexical
	private static final SubLSymbol $uia_hypothesized_term_prefix$ = makeSymbol("*UIA-HYPOTHESIZED-TERM-PREFIX*");

	/**
	 * Hypothesizes SENTENCE, assuming it's already been reformulated.
	 *
	 * @return new-terms; Was the assert successful?
	 */
	public static final SubLObject uia_hypothesize_exact(SubLObject v_agenda, SubLObject sentence, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject new_terms = NIL;
				SubLObject terms = NIL;
				SubLObject error_string = NIL;
				{
					SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
					try {
						api_control_vars.$the_cyclist$.bind(uia_setup_state.uia_user(v_agenda), thread);
						thread.resetMultipleValues();
						{
							SubLObject the_terms = rkf_assertion_utilities.rkf_hypothesize(sentence, domain_mt, $uia_hypothesized_term_prefix$.getGlobalValue());
							SubLObject errstr = thread.secondMultipleValue();
							thread.resetMultipleValues();
							terms = the_terms;
							error_string = errstr;
						}
					} finally {
						api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
					}
				}
				if (NIL == terms) {
					uia_mumbler.uia_mumble_important(v_agenda, error_string);
				} else if (NIL != bindings.unification_success_token_p(terms)) {
					uia_mumbler.uia_mumble(v_agenda, $str_alt91$No_new_assumptions_are_required_f);
					terms = NIL;
				} else {
					{
						SubLObject cdolist_list_var = terms;
						SubLObject term_tuple = NIL;
						for (term_tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), term_tuple = cdolist_list_var.first()) {
							{
								SubLObject datum = term_tuple;
								SubLObject current = datum;
								SubLObject variable = NIL;
								SubLObject v_term = NIL;
								destructuring_bind_must_consp(current, datum, $list_alt92);
								variable = current.first();
								current = current.rest();
								v_term = current;
								new_terms = cons(v_term, new_terms);
							}
						}
					}
				}

				return new_terms;
			}
		}
	}

	/**
	 * Mark this term as belonging to this context and being dependent in its
	 * meaning on the interaction mt.
	 */
	public static final SubLObject uia_mark_term_as_contextual(SubLObject v_agenda, SubLObject v_term, SubLObject phrase) {
		if (phrase == UNPROVIDED) {
			phrase = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject result = NIL;
				{
					SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
					try {
						api_control_vars.$the_cyclist$.bind(uia_setup_state.uia_user(v_agenda), thread);
						result = rkf_term_utilities.rkf_mark_term_as_contextual(v_term, user_interaction_agenda.uia_domain_interaction_mt(v_agenda));
					} finally {
						api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject uia_commented_hypothesize_exact(SubLObject v_agenda, SubLObject sentence, SubLObject message) {
		if (message == UNPROVIDED) {
			message = NIL;
		}
		{
			SubLObject new_terms = uia_hypothesize_exact(v_agenda, sentence, UNPROVIDED);
			if (!message.isString()) {
				message = format(NIL, $str_alt89$I_now_know_the_following_fact__, new_terms);
			}
			{
				SubLObject paraphrase = uia_sentence_phrase_precise(v_agenda, sentence, UNPROVIDED, UNPROVIDED);
				user_interaction_agenda.uia_act_new_comment(v_agenda, cconcatenate(message, paraphrase));
			}
			return new_terms;
		}
	}

	public static final SubLObject uia_check_additional_rules(SubLObject v_agenda, SubLObject sentence) {
		{
			SubLObject add_rules = uiat_addrule_check_fetch_additional_rules(v_agenda);
			uiat_addrule_check_apply_additional_rules(v_agenda, sentence, add_rules);
		}
		return v_agenda;
	}

	public static final SubLObject uia_check_additional_rules_generic(SubLObject v_agenda) {
		return uia_check_additional_rules(v_agenda, $NONE);
	}

	public static final SubLObject uiat_addrule_check_fetch_additional_rules(SubLObject v_agenda) {
		{
			SubLObject add_rules = user_interaction_agenda.uia_state_lookup(v_agenda, $DOMAIN_SPECIFIC_RULES, NIL);
			if (!add_rules.isList()) {
				return NIL;
			}
			if (NIL != add_rules) {
				return add_rules;
			}
			{
				SubLObject domain_mt = user_interaction_agenda.uia_domain_mt(v_agenda);
				SubLObject interaction_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
				SubLObject var = $sym94$_ASSERTION;
				SubLObject formula = el_utilities.make_binary_formula($$domainSpecificDefaultForwardRule, domain_mt, var);
				SubLObject assertions = ask_utilities.ask_variable(var, formula, interaction_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				SubLObject cdolist_list_var = assertions;
				SubLObject assertion = NIL;
				for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), assertion = cdolist_list_var.first()) {
					assertion = uiat_addrule_localize_assertion(v_agenda, assertion);
					{
						SubLObject item_var = assertion;
						if (NIL == member(item_var, add_rules, EQUALP, symbol_function(IDENTITY))) {
							add_rules = cons(item_var, add_rules);
						}
					}
				}
			}
			user_interaction_agenda.uia_state_update(v_agenda, $DOMAIN_SPECIFIC_RULES, add_rules);
			return add_rules;
		}
	}

	public static final SubLObject uiat_addrule_localize_assertion(SubLObject v_agenda, SubLObject assertion) {
		{
			SubLObject interaction_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			SubLObject ask_formula = cycl_utilities.formula_arg1(assertion, UNPROVIDED);
			SubLObject mt_mentioned_clause = cycl_utilities.expression_find_if(UIAT_ADDRULE_MENTIONS_INTERACTION_MT_P, ask_formula, UNPROVIDED, UNPROVIDED);
			SubLObject mt_variable = NIL;
			if (NIL != mt_mentioned_clause) {
				mt_variable = cycl_utilities.formula_arg1(mt_mentioned_clause, UNPROVIDED);
			}
			mt_mentioned_clause = cycl_utilities.expression_find_if(UIAT_ADDRULE_MENTIONS_UIA_INTERACTION_MT_P, ask_formula, UNPROVIDED, UNPROVIDED);
			if (NIL != mt_mentioned_clause) {
				mt_variable = cycl_utilities.formula_arg2(mt_mentioned_clause, UNPROVIDED);
			}
			if (NIL != mt_variable) {
				ask_formula = el_utilities.make_binary_formula($$and, el_utilities.make_binary_formula($$equals, mt_variable, interaction_mt), ask_formula);
				assertion = el_utilities.make_binary_formula(cycl_utilities.formula_arg0(assertion), ask_formula, cycl_utilities.formula_arg2(assertion, UNPROVIDED));
			}
			return assertion;
		}
	}

	public static final SubLObject uiat_addrule_mentions_uia_interaction_mt_p(SubLObject v_object) {
		return makeBoolean(((NIL != list_utilities.proper_list_p(v_object)) && (NIL != el_utilities.formula_arityE(v_object, TWO_INTEGER, UNPROVIDED))) && (cycl_utilities.formula_arg0(v_object) == $$uiaInteractionTerm));
	}

	public static final SubLObject uiat_addrule_mentions_interaction_mt_p(SubLObject v_object) {
		return makeBoolean((((NIL != list_utilities.proper_list_p(v_object)) && (NIL != el_utilities.formula_arityE(v_object, TWO_INTEGER, UNPROVIDED))) && (cycl_utilities.formula_arg0(v_object) == $$isa)) && (cycl_utilities.formula_arg2(v_object, UNPROVIDED) == $$RKFInteractionContextMicrotheory));
	}

	public static final SubLObject uiat_addrule_check_apply_additional_rules(SubLObject v_agenda, SubLObject sentence, SubLObject add_rules) {
		{
			SubLObject mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			SubLObject formulas = NIL;
			{
				SubLObject cdolist_list_var = add_rules;
				SubLObject add_rule = NIL;
				for (add_rule = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), add_rule = cdolist_list_var.first()) {
					{
						SubLObject ask_formula = cycl_utilities.formula_arg1(add_rule, UNPROVIDED);
						SubLObject assert_formula = cycl_utilities.formula_arg2(add_rule, UNPROVIDED);
						uia_mumbler.uia_mumble(v_agenda, format(NIL, $str_alt103$Checking_whether_answers_to__S_wi, ask_formula, assert_formula));
						{
							SubLObject v_bindings = inference_kernel.new_cyc_query(ask_formula, mt, UNPROVIDED);
							SubLObject cdolist_list_var_48 = v_bindings;
							SubLObject binding = NIL;
							for (binding = cdolist_list_var_48.first(); NIL != cdolist_list_var_48; cdolist_list_var_48 = cdolist_list_var_48.rest(), binding = cdolist_list_var_48.first()) {
								{
									SubLObject new_sentence = copy_list(assert_formula);
									SubLObject args = cycl_utilities.formula_args(assert_formula, $IGNORE);
									SubLObject cdolist_list_var_49 = args;
									SubLObject v_term = NIL;
									for (v_term = cdolist_list_var_49.first(); NIL != cdolist_list_var_49; cdolist_list_var_49 = cdolist_list_var_49.rest(), v_term = cdolist_list_var_49.first()) {
										if (NIL != collection_defns.el_variableP(v_term)) {
											{
												SubLObject value = assoc(v_term, binding, UNPROVIDED, UNPROVIDED).rest();
												nsubst(value, v_term, new_sentence, UNPROVIDED, UNPROVIDED);
											}
										}
									}
									if (NIL != el_utilities.gafP(new_sentence)) {
										{
											SubLObject item_var = new_sentence;
											if (NIL == member(item_var, formulas, EQUALP, symbol_function(IDENTITY))) {
												formulas = cons(item_var, formulas);
											}
										}
									}
								}
							}
						}
					}
				}
			}
			{
				SubLObject cdolist_list_var = formulas;
				SubLObject new_sentence = NIL;
				for (new_sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), new_sentence = cdolist_list_var.first()) {
					uia_commented_assert_exact(v_agenda, new_sentence, $str_alt105$From_the_domain_context__I_also_k);
				}
			}
		}
		return v_agenda;
	}

	/**
	 *
	 *
	 * @return boolean; whether we found something to unassert.
	Doesn't use the Cyc agenda.
	 */
	public static final SubLObject uia_unassert(SubLObject v_agenda, SubLObject sentence) {
		{
			SubLObject assertions = (NIL != assertion_handles.assertion_p(sentence)) ? ((SubLObject) (list(sentence))) : uia_find_assertions(v_agenda, sentence, UNPROVIDED);
			rkf_event_dispatcher.ensure_rkf_event_dispatcher_running();
			{
				SubLObject cdolist_list_var = assertions;
				SubLObject ass = NIL;
				for (ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), ass = cdolist_list_var.first()) {
					rkf_event_dispatcher.rkf_post_unassert_event(uncanonicalizer.assertion_el_formula(ass), assertions_high.assertion_mt(ass), UNPROVIDED, UNPROVIDED);
					ke.ke_unassert_assertion_now(ass);
				}
			}
			return list_utilities.sublisp_boolean(assertions);
		}
	}

	/**
	 *
	 *
	 * @return boolean; whether we found something to unassert
	Doesn't use the Cyc agenda.
	 */
	public static final SubLObject uia_unassertibleP(SubLObject v_agenda, SubLObject sentence) {
		{
			SubLObject assertions = (NIL != assertion_handles.assertion_p(sentence)) ? ((SubLObject) (list(sentence))) : uia_find_assertions(v_agenda, sentence, UNPROVIDED);
			return makeBoolean((NIL != assertions) && (NIL != list_utilities.every_in_list($sym106$ASSERTED_ASSERTION_, assertions, UNPROVIDED)));
		}
	}

	/**
	 *
	 *
	 * @return boolean; remove all assertions associated with a fort.
	Doesn't use the Cyc Agenda.
	 */
	public static final SubLObject uia_unassert_all(SubLObject fort) {
		{
			SubLObject assertions = kb_accessors.all_term_assertions(fort, UNPROVIDED);
			rkf_event_dispatcher.ensure_rkf_event_dispatcher_running();
			{
				SubLObject cdolist_list_var = assertions;
				SubLObject ass = NIL;
				for (ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), ass = cdolist_list_var.first()) {
					rkf_event_dispatcher.rkf_post_unassert_event(uncanonicalizer.assertion_el_formula(ass), assertions_high.assertion_mt(ass), UNPROVIDED, UNPROVIDED);
					ke.ke_unassert_assertion_now(ass);
				}
			}
			return list_utilities.sublisp_boolean(assertions);
		}
	}

	/**
	 *
	 *
	 * @unknown rck
	 * @unknown This is terrible -- dont tell anyone we did this.
	Doesn't use the Cyc agenda.
	 */
	public static final SubLObject uia_edit_assertion(SubLObject v_agenda, SubLObject sentence, SubLObject new_sentence) {
		uia_unassert(v_agenda, sentence);
		return uia_assert(v_agenda, new_sentence, UNPROVIDED);
	}

	/**
	 * Kill FORT and clean up any lingering references to it on AGENDA.
	 */
	public static final SubLObject uia_kill(SubLObject v_agenda, SubLObject fort) {
		SubLTrampolineFile.checkType(fort, FORT_P);
		rkf_event_dispatcher.ensure_rkf_event_dispatcher_running();
		rkf_event_dispatcher.rkf_post_kill_term_event(fort, UNPROVIDED);
		uia_expunge_term_references(v_agenda, fort);
		return rkf_term_utilities.rkf_kill(fort);
	}

	public static final SubLObject uia_expunge_term_references(SubLObject v_agenda, SubLObject fort) {
		user_interaction_agenda.uia_remove_term_from_crumb_trail(v_agenda, fort);
		uia_tools_salient_descriptor.uia_invalidate_salient_descriptors_for_term(v_agenda, fort);
		return fort;
	}

	public static final SubLObject uia_salient_template_topics_for_term(SubLObject v_agenda, SubLObject v_term, SubLObject template_mt) {
		if (template_mt == UNPROVIDED) {
			template_mt = NIL;
		}
		{
			SubLObject topics = uia_salient_template_topics_for_instance(v_agenda, v_term, template_mt);
			if (NIL != fort_types_interface.collectionP(v_term)) {
				topics = remove_duplicates(union(topics, uia_salient_template_topics_for_collection(v_agenda, v_term, template_mt), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			return topics;
		}
	}

	/**
	 *
	 *
	 * @return LISTP of relevant FormulaTemplateTopicType FORTs that could be used to
	harvest salient information about term.
	 */
	public static final SubLObject uia_salient_template_topics_for_instance(SubLObject v_agenda, SubLObject v_term, SubLObject template_mt) {
		if (template_mt == UNPROVIDED) {
			template_mt = NIL;
		}
		{
			SubLObject domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			SubLObject topics = formula_template_utilities.suggest_template_topic_for_term(v_term, domain_mt, template_mt);
			SubLObject result = NIL;
			SubLObject cdolist_list_var = topics;
			SubLObject topic = NIL;
			for (topic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), topic = cdolist_list_var.first()) {
				if (NIL == uia_irrelevant_termP(v_agenda, topic, UNPROVIDED)) {
					result = cons(topic, result);
				}
			}
			return nreverse(result);
		}
	}

	/**
	 *
	 *
	 * @return LISTP of relevant FormulaTemplateTopicType FORTs that could be used to
	harvest salient information about term.
	 */
	public static final SubLObject uia_salient_template_topics_for_collection(SubLObject v_agenda, SubLObject collection, SubLObject template_mt) {
		if (template_mt == UNPROVIDED) {
			template_mt = NIL;
		}
		{
			SubLObject domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			SubLObject topics = formula_template_utilities.suggest_template_topic_for_collection(collection, domain_mt, template_mt);
			SubLObject result = NIL;
			SubLObject cdolist_list_var = topics;
			SubLObject topic = NIL;
			for (topic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), topic = cdolist_list_var.first()) {
				if (NIL == uia_irrelevant_termP(v_agenda, topic, UNPROVIDED)) {
					result = cons(topic, result);
				}
			}
			return nreverse(result);
		}
	}

	// defparameter
	private static final SubLSymbol $uia_template_topic_name_context$ = makeSymbol("*UIA-TEMPLATE-TOPIC-NAME-CONTEXT*");

	public static final SubLObject uia_available_template_topic_name(SubLObject tuple) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_agenda = $uia_template_topic_name_context$.getDynamicValue(thread);
				SubLObject collection = tuple.first();
				return uia_term_phrase(v_agenda, collection, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
		}
	}

	/**
	 *
	 *
	 * @return LISTP of relevant FormulaTemplateTopicType FORTs plus their required
	#$isas in order to create them via the FET.
	 */
	public static final SubLObject uia_available_template_topic_isas(SubLObject v_agenda, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject template_topic_isas = formula_template_utilities.get_applicable_formula_template_definition_tuples(domain_mt);
				SubLObject result = NIL;
				SubLObject cdolist_list_var = template_topic_isas;
				SubLObject template_topic_isa = NIL;
				for (template_topic_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), template_topic_isa = cdolist_list_var.first()) {
					{
						SubLObject datum = template_topic_isa;
						SubLObject current = datum;
						SubLObject v_isa = NIL;
						SubLObject topic = NIL;
						destructuring_bind_must_consp(current, datum, $list_alt108);
						v_isa = current.first();
						current = current.rest();
						destructuring_bind_must_consp(current, datum, $list_alt108);
						topic = current.first();
						current = current.rest();
						{
							SubLObject template_mt = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
							destructuring_bind_must_listp(current, datum, $list_alt108);
							current = current.rest();
							if (NIL == current) {
								if (!((NIL != uia_irrelevant_termP(v_agenda, v_isa, UNPROVIDED)) || (NIL != uia_irrelevant_termP(v_agenda, topic, UNPROVIDED)))) {
									result = cons(list(v_isa, topic), result);
								}
							} else {
								cdestructuring_bind_error(datum, $list_alt108);
							}
						}
					}
				}
				{
					SubLObject _prev_bind_0 = $uia_template_topic_name_context$.currentBinding(thread);
					try {
						$uia_template_topic_name_context$.bind(v_agenda, thread);
						result = Sort.sort(result, symbol_function($sym109$STRING_), symbol_function(UIA_AVAILABLE_TEMPLATE_TOPIC_NAME));
					} finally {
						$uia_template_topic_name_context$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject uia_available_template_topic_genls(SubLObject v_agenda, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject template_topic_genls = formula_template_utilities.get_applicable_formula_template_collection_tuples(domain_mt);
				SubLObject result = NIL;
				SubLObject cdolist_list_var = template_topic_genls;
				SubLObject template_topic_genl = NIL;
				for (template_topic_genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), template_topic_genl = cdolist_list_var.first()) {
					{
						SubLObject datum = template_topic_genl;
						SubLObject current = datum;
						SubLObject v_genls = NIL;
						SubLObject topic = NIL;
						destructuring_bind_must_consp(current, datum, $list_alt111);
						v_genls = current.first();
						current = current.rest();
						destructuring_bind_must_consp(current, datum, $list_alt111);
						topic = current.first();
						current = current.rest();
						{
							SubLObject template_mt = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
							destructuring_bind_must_listp(current, datum, $list_alt111);
							current = current.rest();
							if (NIL == current) {
								if (!((NIL != uia_irrelevant_termP(v_agenda, v_genls, UNPROVIDED)) || (NIL != uia_irrelevant_termP(v_agenda, topic, UNPROVIDED)))) {
									result = cons(list(v_genls, topic), result);
								}
							} else {
								cdestructuring_bind_error(datum, $list_alt111);
							}
						}
					}
				}
				{
					SubLObject _prev_bind_0 = $uia_template_topic_name_context$.currentBinding(thread);
					try {
						$uia_template_topic_name_context$.bind(v_agenda, thread);
						result = Sort.sort(result, symbol_function($sym109$STRING_), symbol_function(UIA_AVAILABLE_TEMPLATE_TOPIC_NAME));
					} finally {
						$uia_template_topic_name_context$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	/**
	 *
	 *
	 * @return LISTP of assertions whose formula is SENTENCE asserted in ASSERTION-MT, or
	if ASSERTION-MT is not specified, then in any of the interaction mts for AGENDA.
	 */
	public static final SubLObject uia_find_assertions(SubLObject v_agenda, SubLObject sentence, SubLObject assertion_mt) {
		if (assertion_mt == UNPROVIDED) {
			assertion_mt = NIL;
		}
		{
			SubLObject result = NIL;
			SubLObject mts_to_check = (NIL != assertion_mt) ? ((SubLObject) (list(assertion_mt))) : user_interaction_agenda.uia_all_interaction_mts(v_agenda, UNPROVIDED);
			SubLObject cdolist_list_var = mts_to_check;
			SubLObject mt = NIL;
			for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), mt = cdolist_list_var.first()) {
				{
					SubLObject cdolist_list_var_50 = uia_find_assertions_memoized(sentence, mt);
					SubLObject as = NIL;
					for (as = cdolist_list_var_50.first(); NIL != cdolist_list_var_50; cdolist_list_var_50 = cdolist_list_var_50.rest(), as = cdolist_list_var_50.first()) {
						{
							SubLObject item_var = as;
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

	public static final SubLObject uia_find_assertions_memoized_internal(SubLObject sentence, SubLObject domain_mt) {
		return czer_meta.find_assertions_cycl(sentence, domain_mt);
	}

	public static final SubLObject uia_find_assertions_memoized(SubLObject sentence, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_find_assertions_memoized_internal(sentence, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_FIND_ASSERTIONS_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_FIND_ASSERTIONS_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_FIND_ASSERTIONS_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (sentence.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_find_assertions_memoized_internal(sentence, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(sentence, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	/**
	 *
	 *
	 * @return BOOLEAN; Is EXPRESSION a well-formed-term?
	 */
	public static final SubLObject uia_wftP(SubLObject v_agenda, SubLObject expression, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject result = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								result = uia_wft_memoized(expression, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_51 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_51, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject uia_wft_memoized_internal(SubLObject expression, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject result = NIL;
				{
					SubLObject _prev_bind_0 = wff_vars.$validate_expansionsP$.currentBinding(thread);
					try {
						wff_vars.$validate_expansionsP$.bind(T, thread);
						result = wff.el_wftP(expression, domain_mt, UNPROVIDED);
					} finally {
						wff_vars.$validate_expansionsP$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject uia_wft_memoized(SubLObject expression, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_wft_memoized_internal(expression, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_WFT_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_WFT_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_WFT_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(expression, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (expression.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_wft_memoized_internal(expression, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(expression, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_forget_previous_results_for_wftP(SubLObject v_agenda) {
		user_interaction_agenda.uia_clear_memoization_state_for_function(v_agenda, UIA_WFT_MEMOIZED);
		return v_agenda;
	}

	/**
	 *
	 *
	 * @return BOOLEAN; Is EXPRESSION a well-formed-term?
	 */
	public static final SubLObject uia_wffP(SubLObject v_agenda, SubLObject expression, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject result = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								result = uia_wff_memoized(expression, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_52 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_52, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject uia_wff_memoized_internal(SubLObject expression, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject result = NIL;
				{
					SubLObject _prev_bind_0 = wff_vars.$validate_expansionsP$.currentBinding(thread);
					try {
						wff_vars.$validate_expansionsP$.bind(T, thread);
						result = wff.el_wffP(expression, domain_mt, UNPROVIDED);
					} finally {
						wff_vars.$validate_expansionsP$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject uia_wff_memoized(SubLObject expression, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_wff_memoized_internal(expression, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_WFF_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_WFF_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_WFF_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(expression, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (expression.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_wff_memoized_internal(expression, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(expression, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_forget_previous_results_for_wffP(SubLObject v_agenda) {
		user_interaction_agenda.uia_clear_memoization_state_for_function(v_agenda, UIA_WFF_MEMOIZED);
		return v_agenda;
	}

	/**
	 *
	 *
	 * @return NIL if wff, otherwise an explanation of why not.
	 */
	public static final SubLObject uia_why_not_wft(SubLObject v_agenda, SubLObject expression, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject result = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								result = uia_why_not_wft_memoized(expression, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_53 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_53, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject uia_why_not_wft_memoized_internal(SubLObject expression, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject result = NIL;
				{
					SubLObject _prev_bind_0 = wff_vars.$validate_expansionsP$.currentBinding(thread);
					try {
						wff_vars.$validate_expansionsP$.bind(T, thread);
						result = rkf_assertion_utilities.rkf_supports_for_why_not_wft(expression, domain_mt);
					} finally {
						wff_vars.$validate_expansionsP$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject uia_why_not_wft_memoized(SubLObject expression, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_why_not_wft_memoized_internal(expression, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_WHY_NOT_WFT_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_WHY_NOT_WFT_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_WHY_NOT_WFT_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(expression, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (expression.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_why_not_wft_memoized_internal(expression, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(expression, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_forget_previous_results_for_why_not_wft(SubLObject v_agenda) {
		user_interaction_agenda.uia_clear_memoization_state_for_function(v_agenda, UIA_WHY_NOT_WFT_MEMOIZED);
		return v_agenda;
	}

	/**
	 *
	 *
	 * @return NIL if wff, otherwise an explanation of why not.
	 */
	public static final SubLObject uia_why_not_wff(SubLObject v_agenda, SubLObject sentence, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject result = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								result = uia_why_not_wff_memoized(sentence, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_54 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_54, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject uia_why_not_wff_memoized_internal(SubLObject sentence, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject result = NIL;
				{
					SubLObject _prev_bind_0 = wff_vars.$validate_expansionsP$.currentBinding(thread);
					try {
						wff_vars.$validate_expansionsP$.bind(T, thread);
						result = uia_wff_violations(sentence, domain_mt);
					} finally {
						wff_vars.$validate_expansionsP$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject uia_why_not_wff_memoized(SubLObject sentence, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_why_not_wff_memoized_internal(sentence, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_WHY_NOT_WFF_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_WHY_NOT_WFF_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_WHY_NOT_WFF_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (sentence.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_why_not_wff_memoized_internal(sentence, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(sentence, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	/**
	 *
	 *
	 * @return NIL if wff, otherwise an English explanation of why not.
	 */
	public static final SubLObject uia_why_not_wff_english(SubLObject v_agenda, SubLObject sentence, SubLObject violations, SubLObject domain_mt) {
		if (violations == UNPROVIDED) {
			violations = NIL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject result = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								result = uia_why_not_wff_english_memoized(sentence, domain_mt, violations);
							} finally {
								{
									SubLObject _prev_bind_0_55 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_55, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject uia_why_not_wff_english_memoized_internal(SubLObject sentence, SubLObject domain_mt, SubLObject violations) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject result = NIL;
				{
					SubLObject _prev_bind_0 = wff_vars.$validate_expansionsP$.currentBinding(thread);
					try {
						wff_vars.$validate_expansionsP$.bind(T, thread);
						result = wff.explanation_of_why_not_wff(sentence, domain_mt, list($IO_MODE, $NL, $VIOLATIONS, violations));
					} finally {
						wff_vars.$validate_expansionsP$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject uia_why_not_wff_english_memoized(SubLObject sentence, SubLObject domain_mt, SubLObject violations) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_why_not_wff_english_memoized_internal(sentence, domain_mt, violations);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_WHY_NOT_WFF_ENGLISH_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_WHY_NOT_WFF_ENGLISH_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_WHY_NOT_WFF_ENGLISH_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_3(sentence, domain_mt, violations);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (sentence.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (domain_mt.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (((NIL != cached_args) && (NIL == cached_args.rest())) && violations.equal(cached_args.first())) {
												return memoization_state.caching_results(results2);
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_why_not_wff_english_memoized_internal(sentence, domain_mt, violations)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(sentence, domain_mt, violations));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_forget_previous_results_for_why_not_wff(SubLObject v_agenda) {
		user_interaction_agenda.uia_clear_memoization_state_for_function(v_agenda, UIA_WHY_NOT_WFF_MEMOIZED);
		return v_agenda;
	}

	/**
	 *
	 *
	 * @return BOOLEAN
	 */
	public static final SubLObject uia_wff_compliantP(SubLObject v_agenda, SubLObject sentence, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject result = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								result = uia_wff_compliant_memoized(sentence, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_56 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_56, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject uia_wff_compliant_memoized_internal(SubLObject sentence, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject result = NIL;
				{
					SubLObject _prev_bind_0 = wff_vars.$validate_expansionsP$.currentBinding(thread);
					SubLObject _prev_bind_1 = at_vars.$at_admit_consistent_nautsP$.currentBinding(thread);
					SubLObject _prev_bind_2 = at_vars.$at_admit_consistent_nartsP$.currentBinding(thread);
					try {
						wff_vars.$validate_expansionsP$.bind(T, thread);
						at_vars.$at_admit_consistent_nautsP$.bind(NIL, thread);
						at_vars.$at_admit_consistent_nartsP$.bind(NIL, thread);
						result = wff.el_wffP(sentence, domain_mt, UNPROVIDED);
					} finally {
						at_vars.$at_admit_consistent_nartsP$.rebind(_prev_bind_2, thread);
						at_vars.$at_admit_consistent_nautsP$.rebind(_prev_bind_1, thread);
						wff_vars.$validate_expansionsP$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject uia_wff_compliant_memoized(SubLObject sentence, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_wff_compliant_memoized_internal(sentence, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_WFF_COMPLIANT_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_WFF_COMPLIANT_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_WFF_COMPLIANT_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (sentence.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_wff_compliant_memoized_internal(sentence, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(sentence, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_forget_previous_results_for_wff_compliantP(SubLObject v_agenda) {
		user_interaction_agenda.uia_clear_memoization_state_for_function(v_agenda, UIA_WFF_COMPLIANT_MEMOIZED);
		return v_agenda;
	}

	/**
	 *
	 *
	 * @return NIL if wff, otherwise an explanation of why not
	 */
	public static final SubLObject uia_why_not_wff_compliant(SubLObject v_agenda, SubLObject sentence, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject result = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								result = uia_why_not_wff_compliant_memoized(sentence, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_57 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_57, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject uia_why_not_wff_compliant_memoized_internal(SubLObject sentence, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject result = NIL;
				{
					SubLObject _prev_bind_0 = wff_vars.$validate_expansionsP$.currentBinding(thread);
					SubLObject _prev_bind_1 = at_vars.$at_admit_consistent_nautsP$.currentBinding(thread);
					SubLObject _prev_bind_2 = at_vars.$at_admit_consistent_nartsP$.currentBinding(thread);
					try {
						wff_vars.$validate_expansionsP$.bind(T, thread);
						at_vars.$at_admit_consistent_nautsP$.bind(NIL, thread);
						at_vars.$at_admit_consistent_nartsP$.bind(NIL, thread);
						result = uia_supports_for_why_not_wff(sentence, domain_mt);
					} finally {
						at_vars.$at_admit_consistent_nartsP$.rebind(_prev_bind_2, thread);
						at_vars.$at_admit_consistent_nautsP$.rebind(_prev_bind_1, thread);
						wff_vars.$validate_expansionsP$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject uia_why_not_wff_compliant_memoized(SubLObject sentence, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_why_not_wff_compliant_memoized_internal(sentence, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_WHY_NOT_WFF_COMPLIANT_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_WHY_NOT_WFF_COMPLIANT_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_WHY_NOT_WFF_COMPLIANT_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (sentence.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_why_not_wff_compliant_memoized_internal(sentence, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(sentence, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_forget_previous_results_for_why_not_wff_compliant(SubLObject v_agenda) {
		user_interaction_agenda.uia_clear_memoization_state_for_function(v_agenda, UIA_WHY_NOT_WFF_COMPLIANT_MEMOIZED);
		return v_agenda;
	}

	/**
	 *
	 *
	 * @return BOOLEAN; Can SENTENCE be asserted?
	 */
	public static final SubLObject uia_assertible_compliantP(SubLObject v_agenda, SubLObject sentence, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject result = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								result = uia_assertible_compliant_memoized(sentence, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_58 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_58, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject uia_assertible_compliant_memoized_internal(SubLObject sentence, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject result = NIL;
				{
					SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding(thread);
					SubLObject _prev_bind_1 = wff_vars.$validate_expansionsP$.currentBinding(thread);
					SubLObject _prev_bind_2 = at_vars.$at_admit_consistent_nautsP$.currentBinding(thread);
					SubLObject _prev_bind_3 = at_vars.$at_admit_consistent_nartsP$.currentBinding(thread);
					try {
						control_vars.$within_assert$.bind(T, thread);
						wff_vars.$validate_expansionsP$.bind(T, thread);
						at_vars.$at_admit_consistent_nautsP$.bind(NIL, thread);
						at_vars.$at_admit_consistent_nartsP$.bind(NIL, thread);
						result = wff.el_wffP(sentence, domain_mt, UNPROVIDED);
					} finally {
						at_vars.$at_admit_consistent_nartsP$.rebind(_prev_bind_3, thread);
						at_vars.$at_admit_consistent_nautsP$.rebind(_prev_bind_2, thread);
						wff_vars.$validate_expansionsP$.rebind(_prev_bind_1, thread);
						control_vars.$within_assert$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject uia_assertible_compliant_memoized(SubLObject sentence, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_assertible_compliant_memoized_internal(sentence, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_ASSERTIBLE_COMPLIANT_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_ASSERTIBLE_COMPLIANT_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_ASSERTIBLE_COMPLIANT_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (sentence.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_assertible_compliant_memoized_internal(sentence, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(sentence, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_forget_previous_results_for_assertible_compliantP(SubLObject v_agenda) {
		user_interaction_agenda.uia_clear_memoization_state_for_function(v_agenda, UIA_ASSERTIBLE_COMPLIANT_MEMOIZED);
		return v_agenda;
	}

	/**
	 *
	 *
	 * @return NIL if assertible, otherwise an explanation of why not.
	 */
	public static final SubLObject uia_why_not_assertible_compliant(SubLObject v_agenda, SubLObject sentence, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject result = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								result = uia_why_not_assertible_compliant_memoized(sentence, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_59 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_59, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject uia_why_not_assertible_compliant_memoized_internal(SubLObject sentence, SubLObject domain_mt) {
		return uia_why_not_assertible_compliant_unmemoized(sentence, domain_mt);
	}

	public static final SubLObject uia_why_not_assertible_compliant_memoized(SubLObject sentence, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_why_not_assertible_compliant_memoized_internal(sentence, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_WHY_NOT_ASSERTIBLE_COMPLIANT_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_WHY_NOT_ASSERTIBLE_COMPLIANT_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_WHY_NOT_ASSERTIBLE_COMPLIANT_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (sentence.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_why_not_assertible_compliant_memoized_internal(sentence, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(sentence, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_why_not_assertible_compliant_unmemoized(SubLObject sentence, SubLObject domain_mt) {
		return rkf_assertion_utilities.rkf_why_not_assertible_compliant(sentence, domain_mt);
	}

	/**
	 *
	 *
	 * @return LISTP of SUPPORT-P
	 */
	public static final SubLObject uia_supports_for_why_not_wff(SubLObject sentence, SubLObject domain_mt) {
		return rkf_assertion_utilities.rkf_supports_for_why_not_wff(sentence, domain_mt);
	}

	/**
	 *
	 *
	 * @return LISTP of WFF-VIOLATION-P.
	 */
	public static final SubLObject uia_wff_violations(SubLObject sentence, SubLObject domain_mt) {
		return wff.why_not_wff(sentence, domain_mt, UNPROVIDED);
	}

	public static final SubLObject uia_forget_previous_results_for_why_not_assertible_compliant(SubLObject v_agenda) {
		user_interaction_agenda.uia_clear_memoization_state_for_function(v_agenda, UIA_WHY_NOT_ASSERTIBLE_COMPLIANT_MEMOIZED);
		return v_agenda;
	}

	/**
	 *
	 *
	 * @return NIL if assertible, otherwise an explanation of why not.
	 */
	public static final SubLObject uia_why_not_assertible(SubLObject v_agenda, SubLObject sentence, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject result = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								result = uia_why_not_assertible_memoized(sentence, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_60 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_60, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject uia_why_not_assertible_memoized_internal(SubLObject sentence, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject result = NIL;
				{
					SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding(thread);
					SubLObject _prev_bind_1 = wff_vars.$validate_expansionsP$.currentBinding(thread);
					try {
						control_vars.$within_assert$.bind(T, thread);
						wff_vars.$validate_expansionsP$.bind(T, thread);
						result = uia_supports_for_why_not_wff(sentence, domain_mt);
					} finally {
						wff_vars.$validate_expansionsP$.rebind(_prev_bind_1, thread);
						control_vars.$within_assert$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject uia_why_not_assertible_memoized(SubLObject sentence, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_why_not_assertible_memoized_internal(sentence, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_WHY_NOT_ASSERTIBLE_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_WHY_NOT_ASSERTIBLE_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_WHY_NOT_ASSERTIBLE_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (sentence.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_why_not_assertible_memoized_internal(sentence, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(sentence, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_forget_previous_results_for_why_not_assertible(SubLObject v_agenda) {
		user_interaction_agenda.uia_clear_memoization_state_for_function(v_agenda, UIA_WHY_NOT_ASSERTIBLE_MEMOIZED);
		return v_agenda;
	}

	public static final SubLObject uia_meta_supports(SubLObject support) {
		if (NIL != assertion_handles.assertion_p(support)) {
			return uia_assertion_supports(support);
		} else if (NIL != not_isa_supportP(support)) {
			return not_isa_supports(support);
		} else if (arguments.support_module(support).eql($DISJOINTWITH)) {
			return uia_supports_for_disjoint_support(support);
		} else if (NIL != isa_supportP(support)) {
			return isa_supports(support);
		} else {
			return remove_if(RKF_IRRELEVANT_SUPPORT_P, hl_supports.hl_justify(support), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}

	}

	public static final SubLObject uia_assertion_supports(SubLObject as) {
		{
			SubLObject supports = NIL;
			if (NIL == supports) {
				{
					SubLObject csome_list_var = assertions_high.assertion_arguments(as);
					SubLObject argument = NIL;
					for (argument = csome_list_var.first(); !((NIL != supports) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), argument = csome_list_var.first()) {
						if (NIL != deduction_handles.deduction_p(argument)) {
							supports = deductions_high.deduction_supports(argument);
						}
					}
				}
			}
			if (NIL == supports) {
				supports = list(as);
			}
			return uia_sub_isomorphic_assertions_into_supports(supports);
		}
	}

	/**
	 * Replace any HL supports in SUPPORTS with isomorphic assertions, if such can be found.
	 */
	public static final SubLObject uia_sub_isomorphic_assertions_into_supports(SubLObject supports) {
		return transform_list_utilities.transform(supports, $sym128$UIA_HL_SUPPORT_WITH_ISOMORPHIC_ASSERTION_, CB_UIAT_FIND_ASSERTION_FOR_SUPPORT, UNPROVIDED);
	}

	/**
	 * Test whether it is either an HL support and there is an assertion with
	 * the same formula.
	 */
	public static final SubLObject uia_hl_support_with_isomorphic_assertionP(SubLObject v_object) {
		return makeBoolean((NIL != arguments.hl_support_p(v_object)) && (NIL != cb_uia_tools_misc.cb_uiat_find_assertion_for_support(v_object)));
	}

	/**
	 *
	 *
	 * @unknown - Don't memoize or cache this. We want to know if a previously valid support
	has gone stale.
	 */
	public static final SubLObject uia_invalid_supportsP(SubLObject v_object) {
		return makeBoolean((NIL != arguments.supports_p(v_object)) && (NIL != find_if($sym130$UIA_INVALID_SUPPORT_, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	}

	/**
	 *
	 *
	 * @unknown - Don't memoize or cache this. We want to know if a previously valid support
	has gone stale.
	 */
	public static final SubLObject uia_invalid_supportP(SubLObject v_object) {
		return makeBoolean((NIL != assertions_high.invalid_assertion(v_object, UNPROVIDED)) || ((NIL != arguments.hl_support_p(v_object)) && (NIL == hl_supports.hl_verify(v_object))));
	}

	public static final SubLObject isa_supportP(SubLObject support) {
		return makeBoolean((arguments.support_truth(support) == $TRUE) && (NIL != el_utilities.el_formula_with_operator_p(arguments.support_sentence(support), $$isa)));
	}

	public static final SubLObject genls_supportP(SubLObject support) {
		return makeBoolean((arguments.support_truth(support) == $TRUE) && (NIL != el_utilities.el_formula_with_operator_p(arguments.support_sentence(support), $$genls)));
	}

	/**
	 *
	 *
	 * @return LISTP of meta-supports for an #$isa support
	 */
	public static final SubLObject isa_supports(SubLObject isa_support) {
		{
			SubLObject raw_supports = hl_supports.hl_justify(isa_support);
			SubLObject abortP = list_utilities.lengthL(raw_supports, THREE_INTEGER, UNPROVIDED);
			SubLObject focus_term = cycl_utilities.formula_arg1(arguments.support_sentence(isa_support), UNPROVIDED);
			SubLObject asserted_isa = NIL;
			SubLObject curr_genl = NIL;
			SubLObject new_supports = NIL;
			if (NIL == abortP) {
				{
					SubLObject csome_list_var = raw_supports;
					SubLObject raw_support = NIL;
					for (raw_support = csome_list_var.first(); !((NIL != abortP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), raw_support = csome_list_var.first()) {
						if ((NIL == new_supports) && (!(((NIL != assertion_handles.assertion_p(raw_support)) && (NIL != isa_supportP(raw_support))) && assertions_high.gaf_arg1(raw_support).equal(focus_term)))) {
							abortP = T;
						} else if (NIL == new_supports) {
							new_supports = cons(raw_support, new_supports);
							asserted_isa = assertions_high.gaf_arg2(raw_support);
							curr_genl = assertions_high.gaf_arg2(raw_support);
						} else if (((NIL != genls_supportP(raw_support)) && (NIL != assertion_handles.assertion_p(raw_support))) && assertions_high.gaf_arg1(raw_support).equal(curr_genl)) {
							curr_genl = assertions_high.gaf_arg2(raw_support);
						} else {
							abortP = T;
						}

					}
				}
			}
			if ((((NIL != abortP) || (NIL == curr_genl)) || (NIL == asserted_isa)) || curr_genl.equal(asserted_isa)) {
				return raw_supports;
			}
			{
				SubLObject genls_support_sentence = el_utilities.make_binary_formula($$genls, asserted_isa, curr_genl);
				SubLObject new_genls_support = arguments.make_hl_support($GENLS, genls_support_sentence, arguments.support_mt(isa_support), UNPROVIDED);
				new_supports = cons(new_genls_support, new_supports);
			}
			return nreverse(new_supports);
		}
	}

	public static final SubLObject not_isa_supportP(SubLObject support) {
		{
			SubLObject sentence = arguments.support_sentence(support);
			SubLObject pred = cycl_utilities.formula_operator(sentence);
			return makeBoolean((NIL != subl_promotions.memberP(pred, $list_alt133, UNPROVIDED, UNPROVIDED)) && (NIL != el_utilities.el_formula_with_operator_p(cycl_utilities.formula_arg1(sentence, UNPROVIDED), $$isa)));
		}
	}

	public static final SubLObject not_isa_supports(SubLObject support) {
		{
			SubLObject isa_sentence = cycl_utilities.formula_arg1(arguments.support_sentence(support), UNPROVIDED);
			SubLObject mt = arguments.support_mt(support);
			if (NIL != isa_genls_type_violation_supportP(support)) {
				{
					SubLObject genls_sentence = el_utilities.make_el_formula($$genls, cycl_utilities.formula_args(isa_sentence, UNPROVIDED), UNPROVIDED);
					return list(arguments.make_hl_support($GENLS, genls_sentence, mt, UNPROVIDED));
				}
			} else {
				{
					SubLObject raw_supports = hl_supports.hl_justify(support);
					SubLObject first_support = raw_supports.first();
					if (NIL != el_utilities.el_formula_with_operator_p(arguments.support_sentence(first_support), $$isa)) {
						{
							SubLObject not_isa_col = cycl_utilities.formula_arg2(isa_sentence, UNPROVIDED);
							SubLObject first_isa_col = cycl_utilities.formula_arg2(arguments.support_sentence(first_support), UNPROVIDED);
							if (NIL != disjoint_with.collections_disjointP(not_isa_col, first_isa_col, mt)) {
								return list(first_support, arguments.make_hl_support($DISJOINTWITH, el_utilities.make_binary_formula($$disjointWith, first_isa_col, not_isa_col), mt, UNPROVIDED));
							}
						}
					}
					return raw_supports;
				}
			}
		}
	}

	public static final SubLObject uia_supports_for_disjoint_support(SubLObject support) {
		{
			SubLObject sentence = arguments.support_sentence(support);
			SubLObject supports = NIL;
			if (NIL != el_utilities.formula_arityE(sentence, TWO_INTEGER, UNPROVIDED)) {
				{
					SubLObject datum = cycl_utilities.formula_args(sentence, UNPROVIDED);
					SubLObject current = datum;
					SubLObject col1 = NIL;
					SubLObject col2 = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt135);
					col1 = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt135);
					col2 = current.first();
					current = current.rest();
					if (NIL == current) {
						{
							SubLObject failP = NIL;
							SubLObject genl1 = col1;
							SubLObject genl1_sentence = NIL;
							SubLObject genl2 = NIL;
							SubLObject mid_genl2 = NIL;
							SubLObject genl2_sentence = NIL;
							SubLObject disjoint_with_sentence = NIL;
							SubLObject meta_supports = hl_supports.hl_justify(support);
							if (NIL == failP) {
								{
									SubLObject csome_list_var = meta_supports;
									SubLObject meta_support = NIL;
									for (meta_support = csome_list_var.first(); !((NIL != failP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), meta_support = csome_list_var.first()) {
										{
											SubLObject meta_support_sentence = arguments.support_sentence(meta_support);
											if (((NIL == genl1_sentence) && (NIL != el_utilities.el_formula_with_operator_p(meta_support_sentence, $$genls))) && cycl_utilities.formula_arg1(meta_support_sentence, UNPROVIDED).equal(genl1)) {
												genl1 = cycl_utilities.formula_arg2(meta_support_sentence, UNPROVIDED);
											} else if (((NIL == disjoint_with_sentence) && (!col1.equal(genl1))) && (NIL != el_utilities.el_formula_with_operator_p(meta_support_sentence, $$disjointWith))) {
												genl1_sentence = el_utilities.make_binary_formula($$genls, col1, genl1);
												disjoint_with_sentence = meta_support_sentence;
											} else if (((((NIL == genl2_sentence) && (NIL != genl2)) && (NIL != el_utilities.el_formula_with_operator_p(meta_support_sentence, $$genls))) && cycl_utilities.formula_arg1(meta_support_sentence, UNPROVIDED).equal(col2)) && cycl_utilities.formula_arg2(meta_support_sentence, UNPROVIDED).equal(mid_genl2)) {
												genl2_sentence = el_utilities.make_binary_formula($$genls, col2, genl2);
											} else if ((NIL == genl2) && (NIL != el_utilities.el_formula_with_operator_p(meta_support_sentence, $$genls))) {
												genl2 = cycl_utilities.formula_arg2(meta_support_sentence, UNPROVIDED);
												mid_genl2 = cycl_utilities.formula_arg1(meta_support_sentence, UNPROVIDED);
											} else if ((NIL != el_utilities.el_formula_with_operator_p(meta_support_sentence, $$genls)) && cycl_utilities.formula_arg2(meta_support_sentence, UNPROVIDED).equal(mid_genl2)) {
												mid_genl2 = cycl_utilities.formula_arg1(meta_support_sentence, UNPROVIDED);
											} else {
												failP = T;
											}

										}
									}
								}
							}
							if ((((NIL != genl1_sentence) && (NIL != disjoint_with_sentence)) && (NIL != genl2_sentence)) && (NIL == failP)) {
								{
									SubLObject mt = arguments.support_mt(support);
									supports = list(arguments.make_hl_support($GENLS, genl1_sentence, mt, UNPROVIDED), arguments.make_hl_support($GENLS, genl2_sentence, mt, UNPROVIDED), arguments.make_hl_support($DISJOINTWITH, disjoint_with_sentence, mt, UNPROVIDED));
								}
							}
						}
					} else {
						cdestructuring_bind_error(datum, $list_alt135);
					}
				}
			}
			if (NIL == supports) {
				supports = hl_supports.hl_justify(support);
			}
			return supports;
		}
	}

	/**
	 *
	 *
	 * @return BOOLEAN; Is SUPPORT a negation of an #$isa sentence for which the
	corresponding #$genls sentence is true?
	 */
	public static final SubLObject isa_genls_type_violation_supportP(SubLObject support) {
		{
			SubLObject sentence = arguments.support_sentence(support);
			SubLObject pred = cycl_utilities.formula_operator(sentence);
			if (NIL != subl_promotions.memberP(pred, $list_alt133, UNPROVIDED, UNPROVIDED)) {
				{
					SubLObject core_sentence = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
					if ((NIL != el_utilities.el_formula_with_operator_p(core_sentence, $$isa)) && (!cycl_utilities.formula_arg1(core_sentence, UNPROVIDED).equal(cycl_utilities.formula_arg2(core_sentence, UNPROVIDED)))) {
						{
							SubLObject mt = arguments.support_mt(support);
							SubLObject args = cycl_utilities.formula_args(core_sentence, UNPROVIDED);
							return list_utilities.sublisp_boolean(backward.removal_ask(el_utilities.make_el_formula($$genls, args, UNPROVIDED), mt, UNPROVIDED, UNPROVIDED));
						}
					}
				}
			}
		}
		return NIL;
	}

	public static final SubLObject uia_admitted_argumentP(SubLObject v_agenda, SubLObject v_term, SubLObject argnum, SubLObject relation, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject result = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								result = uia_admitted_argument_memoizedP(v_term, argnum, relation, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_61 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_61, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject uia_admitted_argument_memoizedP_internal(SubLObject v_term, SubLObject argnum, SubLObject relation, SubLObject domain_mt) {
		return at_admitted.admitted_argumentP(v_term, argnum, relation, domain_mt);
	}

	public static final SubLObject uia_admitted_argument_memoizedP(SubLObject v_term, SubLObject argnum, SubLObject relation, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_admitted_argument_memoizedP_internal(v_term, argnum, relation, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym136$UIA_ADMITTED_ARGUMENT_MEMOIZED_, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym136$UIA_ADMITTED_ARGUMENT_MEMOIZED_, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, $sym136$UIA_ADMITTED_ARGUMENT_MEMOIZED_, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_4(v_term, argnum, relation, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (v_term.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (argnum.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (relation.equal(cached_args.first())) {
												cached_args = cached_args.rest();
												if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
													return memoization_state.caching_results(results2);
												}
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_admitted_argument_memoizedP_internal(v_term, argnum, relation, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, argnum, relation, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_inappropriate_sentenceP(SubLObject v_agenda, SubLObject sentence, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		if (NIL == domain_mt) {
			domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
		}
		{
			SubLObject result = NIL;
			result = makeBoolean((NIL != uia_sentence_has_irrelevant_precision_suggestion_termsP(v_agenda, sentence, domain_mt)) || (NIL != uia_invalid_sentenceP(v_agenda, sentence, domain_mt)));
			return result;
		}
	}

	/**
	 *
	 *
	 * @return boolean; whether SENTENCE is invalid to be asserted
	 */
	public static final SubLObject uia_invalid_sentenceP(SubLObject v_agenda, SubLObject sentence, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		if (NIL == domain_mt) {
			domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
		}
		{
			SubLObject result = NIL;
			result = uia_invalid_sentence_memoizedP(sentence, domain_mt);
			return result;
		}
	}

	public static final SubLObject uia_invalid_sentence_memoizedP_internal(SubLObject sentence, SubLObject domain_mt) {
		return makeBoolean(((NIL != uia_why_not_assertible_compliant_memoized(sentence, domain_mt)) || (NIL != uia_redundant_sentence_memoized(sentence, domain_mt))) || (NIL != uia_rejected_sentence_memoized(sentence, domain_mt)));
	}

	public static final SubLObject uia_invalid_sentence_memoizedP(SubLObject sentence, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_invalid_sentence_memoizedP_internal(sentence, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym137$UIA_INVALID_SENTENCE_MEMOIZED_, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym137$UIA_INVALID_SENTENCE_MEMOIZED_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, $sym137$UIA_INVALID_SENTENCE_MEMOIZED_, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (sentence.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_invalid_sentence_memoizedP_internal(sentence, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(sentence, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_knownP(SubLObject v_agenda, SubLObject sentence, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		if (NIL == domain_mt) {
			domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
		}
		{
			SubLObject result = NIL;
			result = uia_known_memoizedP(sentence, domain_mt);
			return result;
		}
	}

	public static final SubLObject uia_known_memoizedP_internal(SubLObject sentence, SubLObject domain_mt) {
		return rkf_query_utilities.rkf_known(sentence, domain_mt, UNPROVIDED);
	}

	public static final SubLObject uia_known_memoizedP(SubLObject sentence, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_known_memoizedP_internal(sentence, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym138$UIA_KNOWN_MEMOIZED_, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym138$UIA_KNOWN_MEMOIZED_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, $sym138$UIA_KNOWN_MEMOIZED_, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (sentence.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_known_memoizedP_internal(sentence, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(sentence, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_justify(SubLObject v_agenda, SubLObject sentence, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		if (NIL == domain_mt) {
			domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
		}
		{
			SubLObject result = NIL;
			result = uia_justify_memoized(sentence, domain_mt);
			return result;
		}
	}

	public static final SubLObject uia_justify_memoized_internal(SubLObject sentence, SubLObject domain_mt) {
		return rkf_query_utilities.rkf_justify(sentence, domain_mt);
	}

	public static final SubLObject uia_justify_memoized(SubLObject sentence, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_justify_memoized_internal(sentence, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_JUSTIFY_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_JUSTIFY_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_JUSTIFY_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (sentence.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_justify_memoized_internal(sentence, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(sentence, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_equalsP(SubLObject v_agenda, SubLObject obj1, SubLObject obj2, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		if (NIL == domain_mt) {
			domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
		}
		return equals_in_mtP(obj1, obj2, domain_mt);
	}

	public static final SubLObject equals_in_mtP(SubLObject obj1, SubLObject obj2, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject equalsP = NIL;
				{
					SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
						mt_relevance_macros.$mt$.bind(domain_mt, thread);
						equalsP = equals.equalsP(obj1, obj2, UNPROVIDED, UNPROVIDED);
					} finally {
						mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
					}
				}
				return equalsP;
			}
		}
	}

	// deflexical
	private static final SubLSymbol $question_words$ = makeSymbol("*QUESTION-WORDS*");

	public static final SubLObject uia_wh_wordP(SubLObject v_agenda, SubLObject string) {
		return makeBoolean((NIL != subl_promotions.memberP(string, $question_words$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED)) || (NIL != lexicon_utilities.wh_wordP(string)));
	}

	public static final SubLObject uia_irrelevant_precision_suggestion_term(SubLObject v_agenda, SubLObject to_term, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject result = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								result = uia_irrelevant_precision_suggestion_term_memoizedP(to_term, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_62 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_62, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject uia_irrelevant_precision_suggestion_term_memoizedP_internal(SubLObject to_term, SubLObject domain_mt) {
		return rkf_relevance_utilities.rkf_irrelevant_precision_suggestion(to_term, domain_mt);
	}

	public static final SubLObject uia_irrelevant_precision_suggestion_term_memoizedP(SubLObject to_term, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_irrelevant_precision_suggestion_term_memoizedP_internal(to_term, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym142$UIA_IRRELEVANT_PRECISION_SUGGESTION_TERM_MEMOIZED_, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym142$UIA_IRRELEVANT_PRECISION_SUGGESTION_TERM_MEMOIZED_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, $sym142$UIA_IRRELEVANT_PRECISION_SUGGESTION_TERM_MEMOIZED_, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(to_term, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (to_term.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_irrelevant_precision_suggestion_term_memoizedP_internal(to_term, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(to_term, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_irrelevant_precision_suggestion_term_fromP(SubLObject v_agenda, SubLObject to_term, SubLObject from_term, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject result = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								result = uia_irrelevant_precision_suggestion_term_from_memoizedP(to_term, from_term, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_63 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_63, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject uia_irrelevant_precision_suggestion_term_from_memoizedP_internal(SubLObject to_term, SubLObject from_term, SubLObject domain_mt) {
		return rkf_relevance_utilities.rkf_irrelevant_precision_suggestion_from(to_term, from_term, domain_mt);
	}

	public static final SubLObject uia_irrelevant_precision_suggestion_term_from_memoizedP(SubLObject to_term, SubLObject from_term, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_irrelevant_precision_suggestion_term_from_memoizedP_internal(to_term, from_term, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym143$UIA_IRRELEVANT_PRECISION_SUGGESTION_TERM_FROM_MEMOIZED_, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym143$UIA_IRRELEVANT_PRECISION_SUGGESTION_TERM_FROM_MEMOIZED_, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, $sym143$UIA_IRRELEVANT_PRECISION_SUGGESTION_TERM_FROM_MEMOIZED_, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_3(to_term, from_term, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (to_term.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (from_term.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
												return memoization_state.caching_results(results2);
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_irrelevant_precision_suggestion_term_from_memoizedP_internal(to_term, from_term, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(to_term, from_term, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	// defparameter
	private static final SubLSymbol $uia_irrelevant_precision_suggestion_lambda_mt$ = makeSymbol("*UIA-IRRELEVANT-PRECISION-SUGGESTION-LAMBDA-MT*");

	// defparameter
	private static final SubLSymbol $uia_irrelevant_precision_suggestion_lambda_agenda$ = makeSymbol("*UIA-IRRELEVANT-PRECISION-SUGGESTION-LAMBDA-AGENDA*");

	public static final SubLObject uia_irrelevant_precision_suggestion_term_lambdaP(SubLObject v_term) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return uia_irrelevant_precision_suggestion_term($uia_irrelevant_precision_suggestion_lambda_agenda$.getDynamicValue(thread), v_term, $uia_irrelevant_precision_suggestion_lambda_mt$.getDynamicValue(thread));
		}
	}

	public static final SubLObject uia_sentence_has_irrelevant_precision_suggestion_termsP(SubLObject v_agenda, SubLObject sentence, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject result = NIL;
				{
					SubLObject _prev_bind_0 = $uia_irrelevant_precision_suggestion_lambda_mt$.currentBinding(thread);
					SubLObject _prev_bind_1 = $uia_irrelevant_precision_suggestion_lambda_agenda$.currentBinding(thread);
					try {
						$uia_irrelevant_precision_suggestion_lambda_mt$.bind(domain_mt, thread);
						$uia_irrelevant_precision_suggestion_lambda_agenda$.bind(v_agenda, thread);
						result = cycl_utilities.expression_find_if($sym144$UIA_IRRELEVANT_PRECISION_SUGGESTION_TERM_LAMBDA_, sentence, UNPROVIDED, UNPROVIDED);
					} finally {
						$uia_irrelevant_precision_suggestion_lambda_agenda$.rebind(_prev_bind_1, thread);
						$uia_irrelevant_precision_suggestion_lambda_mt$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject uia_irrelevant_arg_constraintP(SubLObject v_agenda, SubLObject v_term, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject result = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								result = uia_irrelevant_arg_constraint_memoizedP(v_term, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_64 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_64, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject uia_irrelevant_arg_constraint_memoizedP_internal(SubLObject v_term, SubLObject domain_mt) {
		return rkf_relevance_utilities.rkf_irrelevant_arg_constraint(v_term, domain_mt);
	}

	public static final SubLObject uia_irrelevant_arg_constraint_memoizedP(SubLObject v_term, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_irrelevant_arg_constraint_memoizedP_internal(v_term, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym145$UIA_IRRELEVANT_ARG_CONSTRAINT_MEMOIZED_, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym145$UIA_IRRELEVANT_ARG_CONSTRAINT_MEMOIZED_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, $sym145$UIA_IRRELEVANT_ARG_CONSTRAINT_MEMOIZED_, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (v_term.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_irrelevant_arg_constraint_memoizedP_internal(v_term, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_irrelevant_termP(SubLObject v_agenda, SubLObject v_term, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject result = NIL;
				if (NIL != hlmt.hlmt_p(domain_mt)) {
					{
						SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
						SubLObject local_state = state;
						{
							SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
							try {
								memoization_state.$memoization_state$.bind(local_state, thread);
								{
									final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
									try {
										result = uia_irrelevant_term_memoizedP(v_term, domain_mt);
									} finally {
										{
											SubLObject _prev_bind_0_65 = $is_thread_performing_cleanupP$.currentBinding(thread);
											try {
												$is_thread_performing_cleanupP$.bind(T, thread);
												if ((NIL != local_state) && (NIL == original_memoization_process)) {
													memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
												}
											} finally {
												$is_thread_performing_cleanupP$.rebind(_prev_bind_0_65, thread);
											}
										}
									}
								}
							} finally {
								memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
							}
						}
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject uia_irrelevant_term_memoizedP_internal(SubLObject v_term, SubLObject domain_mt) {
		return rkf_relevance_utilities.rkf_irrelevant_term(v_term, domain_mt);
	}

	public static final SubLObject uia_irrelevant_term_memoizedP(SubLObject v_term, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_irrelevant_term_memoizedP_internal(v_term, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym146$UIA_IRRELEVANT_TERM_MEMOIZED_, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym146$UIA_IRRELEVANT_TERM_MEMOIZED_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, $sym146$UIA_IRRELEVANT_TERM_MEMOIZED_, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (v_term.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_irrelevant_term_memoizedP_internal(v_term, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_filter_irrelevant_terms(SubLObject v_agenda, SubLObject terms, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject result = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								result = uia_filter_irrelevant_terms_memoized(terms, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_66 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_66, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject uia_filter_irrelevant_terms_memoized(SubLObject terms, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			thread.resetMultipleValues();
			{
				SubLObject relevant = uia_partition_terms_by_relevancy_memoized(terms, domain_mt, T, NIL);
				SubLObject irrelevant = thread.secondMultipleValue();
				thread.resetMultipleValues();
				return relevant;
			}
		}
	}

	/**
	 * Given a set of terms, partition them within the context of AGENDA and
	 * DOMAIN-MT into the relevant and the irrelevant set of terms.
	 */
	public static final SubLObject uia_partition_terms_by_relevancy(SubLObject v_agenda, SubLObject terms, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject relevant = NIL;
				SubLObject irrelevant = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								thread.resetMultipleValues();
								{
									SubLObject relevant_terms = uia_partition_terms_by_relevancy_memoized(terms, domain_mt, UNPROVIDED, UNPROVIDED);
									SubLObject irrelevant_terms = thread.secondMultipleValue();
									thread.resetMultipleValues();
									relevant = relevant_terms;
									irrelevant = irrelevant_terms;
								}
							} finally {
								{
									SubLObject _prev_bind_0_67 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_67, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return values(relevant, irrelevant);
			}
		}
	}

	/**
	 * Given a set of terms, partition them within the context of AGENDA and
	 * DOMAIN-MT into the relevant and the irrelevant set of terms.
	 */
	public static final SubLObject uia_partition_terms_by_precision_relevancy(SubLObject v_agenda, SubLObject to_terms, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject relevant = NIL;
				SubLObject irrelevant = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								thread.resetMultipleValues();
								{
									SubLObject relevant_terms = uia_partition_terms_by_precision_relevancy_memoized(to_terms, domain_mt, UNPROVIDED, UNPROVIDED);
									SubLObject irrelevant_terms = thread.secondMultipleValue();
									thread.resetMultipleValues();
									relevant = relevant_terms;
									irrelevant = irrelevant_terms;
								}
							} finally {
								{
									SubLObject _prev_bind_0_68 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_68, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return values(relevant, irrelevant);
			}
		}
	}

	/**
	 * Given a set of term, partition it into the set of those that are neither
	 * keIrrelevant no keIrrelevantPrecisionSuggestion and those that are either
	 * of these two.
	 */
	public static final SubLObject uia_partition_terms_by_precision_relevancy_memoized(SubLObject to_terms, SubLObject domain_mt, SubLObject keep_relevantP, SubLObject keep_irrelevantP) {
		if (keep_relevantP == UNPROVIDED) {
			keep_relevantP = T;
		}
		if (keep_irrelevantP == UNPROVIDED) {
			keep_irrelevantP = T;
		}
		{
			SubLObject relevant = NIL;
			SubLObject irrelevant = NIL;
			SubLObject cdolist_list_var = to_terms;
			SubLObject to_term = NIL;
			for (to_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), to_term = cdolist_list_var.first()) {
				if (NIL != uia_irrelevant_term_memoizedP(to_term, domain_mt)) {
					if (NIL != keep_irrelevantP) {
						irrelevant = cons(to_term, irrelevant);
					}
				} else if (NIL != uia_irrelevant_precision_suggestion_term_memoizedP(to_term, domain_mt)) {
					if (NIL != keep_irrelevantP) {
						irrelevant = cons(to_term, irrelevant);
					}
				} else {
					if (NIL != keep_relevantP) {
						relevant = cons(to_term, relevant);
					}
				}

			}
			return values(nreverse(relevant), nreverse(irrelevant));
		}
	}

	/**
	 * Given a set of terms, partition them into relevant and irrelevant terms,
	 * and return the two lists in order relevant irrelevant.
	 */
	public static final SubLObject uia_partition_terms_by_relevancy_memoized(SubLObject terms, SubLObject domain_mt, SubLObject keep_relevantP, SubLObject keep_irrelevantP) {
		if (keep_relevantP == UNPROVIDED) {
			keep_relevantP = T;
		}
		if (keep_irrelevantP == UNPROVIDED) {
			keep_irrelevantP = T;
		}
		{
			SubLObject relevant = NIL;
			SubLObject irrelevant = NIL;
			SubLObject cdolist_list_var = terms;
			SubLObject v_term = NIL;
			for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), v_term = cdolist_list_var.first()) {
				if (NIL != uia_irrelevant_term_memoizedP(v_term, domain_mt)) {
					if (NIL != keep_irrelevantP) {
						irrelevant = cons(v_term, irrelevant);
					}
				} else {
					if (NIL != keep_relevantP) {
						relevant = cons(v_term, relevant);
					}
				}
			}
			return values(nreverse(relevant), nreverse(irrelevant));
		}
	}

	public static final SubLObject uia_irrelevant_formulaP(SubLObject v_agenda, SubLObject formula, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject result = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								result = uia_irrelevant_formula_memoizedP(formula, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_69 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_69, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject uia_irrelevant_formula_memoizedP_internal(SubLObject formula, SubLObject domain_mt) {
		return rkf_relevance_utilities.rkf_irrelevant_formula(formula, domain_mt);
	}

	public static final SubLObject uia_irrelevant_formula_memoizedP(SubLObject formula, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_irrelevant_formula_memoizedP_internal(formula, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym147$UIA_IRRELEVANT_FORMULA_MEMOIZED_, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym147$UIA_IRRELEVANT_FORMULA_MEMOIZED_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, $sym147$UIA_IRRELEVANT_FORMULA_MEMOIZED_, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(formula, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (formula.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_irrelevant_formula_memoizedP_internal(formula, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(formula, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_filter_irrelevant_formulas(SubLObject v_agenda, SubLObject formulas, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject result = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								result = uia_filter_irrelevant_formulas_memoized(formulas, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_70 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_70, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	public static final SubLObject uia_filter_irrelevant_formulas_memoized(SubLObject formulas, SubLObject domain_mt) {
		{
			SubLObject v_answer = NIL;
			SubLObject cdolist_list_var = formulas;
			SubLObject formula = NIL;
			for (formula = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), formula = cdolist_list_var.first()) {
				if (NIL == uia_irrelevant_formula_memoizedP(formula, domain_mt)) {
					v_answer = cons(formula, v_answer);
				}
			}
			return nreverse(v_answer);
		}
	}

	public static final SubLObject uia_filter_ill_formed_formulas(SubLObject v_agenda, SubLObject formulas, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		if (NIL == domain_mt) {
			domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
		}
		{
			SubLObject result = NIL;
			result = uia_filter_ill_formed_formulas_memoized(formulas, domain_mt);
			return result;
		}
	}

	public static final SubLObject uia_filter_ill_formed_formulas_memoized(SubLObject formulas, SubLObject domain_mt) {
		{
			SubLObject v_answer = NIL;
			SubLObject cdolist_list_var = formulas;
			SubLObject formula = NIL;
			for (formula = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), formula = cdolist_list_var.first()) {
				if (NIL != uia_why_not_wft_memoized(formula, domain_mt)) {
					v_answer = cons(formula, v_answer);
				}
			}
			return nreverse(v_answer);
		}
	}

	public static final SubLObject uia_filter_irrelevant_or_ill_formed_formulas(SubLObject v_agenda, SubLObject formulas, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		if (NIL == domain_mt) {
			domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
		}
		{
			SubLObject result = NIL;
			result = uia_filter_irrelevant_or_ill_formed_formulas_memoized(formulas, domain_mt);
			return result;
		}
	}

	public static final SubLObject uia_filter_irrelevant_or_ill_formed_formulas_memoized(SubLObject formulas, SubLObject domain_mt) {
		{
			SubLObject v_answer = NIL;
			SubLObject cdolist_list_var = formulas;
			SubLObject formula = NIL;
			for (formula = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), formula = cdolist_list_var.first()) {
				if (!((NIL != uia_irrelevant_formula_memoizedP(formula, domain_mt)) || (NIL != uia_why_not_wft_memoized(formula, domain_mt)))) {
					v_answer = cons(formula, v_answer);
				}
			}
			return nreverse(v_answer);
		}
	}

	public static final SubLObject uia_irrelevant_sentenceP(SubLObject v_agenda, SubLObject sentence, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		return uia_irrelevant_formulaP(v_agenda, sentence, domain_mt);
	}

	public static final SubLObject uia_irrelevant_sentence_memoizedP(SubLObject sentence, SubLObject domain_mt) {
		return uia_irrelevant_formula_memoizedP(sentence, domain_mt);
	}

	public static final SubLObject uia_filter_irrelevant_sentences(SubLObject v_agenda, SubLObject sentences, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		return uia_filter_irrelevant_formulas(v_agenda, sentences, domain_mt);
	}

	public static final SubLObject uia_filter_irrelevant_sentences_memoized(SubLObject sentences, SubLObject domain_mt) {
		return uia_filter_irrelevant_formulas_memoized(sentences, domain_mt);
	}

	public static final SubLObject uia_filter_invalid_sentences(SubLObject v_agenda, SubLObject sentences, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		if (NIL == domain_mt) {
			domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
		}
		{
			SubLObject result = NIL;
			result = uia_filter_invalid_sentences_memoized(sentences, domain_mt);
			return result;
		}
	}

	public static final SubLObject uia_filter_invalid_sentences_memoized(SubLObject sentences, SubLObject domain_mt) {
		{
			SubLObject v_answer = NIL;
			SubLObject cdolist_list_var = sentences;
			SubLObject sentence = NIL;
			for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), sentence = cdolist_list_var.first()) {
				if (NIL == uia_invalid_sentence_memoizedP(sentence, domain_mt)) {
					v_answer = cons(sentence, v_answer);
				}
			}
			return nreverse(v_answer);
		}
	}

	public static final SubLObject uia_filter_invalid_args_for_pred(SubLObject v_agenda, SubLObject args, SubLObject argnum, SubLObject pred, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		if (NIL == domain_mt) {
			domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
		}
		{
			SubLObject result = NIL;
			SubLObject cdolist_list_var = args;
			SubLObject arg = NIL;
			for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), arg = cdolist_list_var.first()) {
				if (NIL != uia_admitted_argumentP(v_agenda, arg, argnum, pred, domain_mt)) {
					result = cons(arg, result);
				}
			}
			return nreverse(result);
		}
	}

	public static final SubLObject uia_filter_irrelevant_or_ill_formed_sentences(SubLObject v_agenda, SubLObject sentences, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		if (NIL == domain_mt) {
			domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
		}
		{
			SubLObject result = NIL;
			result = uia_filter_irrelevant_or_ill_formed_sentences_memoized(sentences, domain_mt);
			return result;
		}
	}

	public static final SubLObject uia_filter_irrelevant_or_ill_formed_sentences_memoized(SubLObject sentences, SubLObject domain_mt) {
		{
			SubLObject v_answer = NIL;
			SubLObject cdolist_list_var = sentences;
			SubLObject sentence = NIL;
			for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), sentence = cdolist_list_var.first()) {
				if (!((NIL != uia_irrelevant_sentence_memoizedP(sentence, domain_mt)) || (NIL != uia_why_not_wff_memoized(sentence, domain_mt)))) {
					v_answer = cons(sentence, v_answer);
				}
			}
			return nreverse(v_answer);
		}
	}

	public static final SubLObject uia_filter_irrelevant_or_invalid_sentences(SubLObject v_agenda, SubLObject sentences, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		if (NIL == domain_mt) {
			domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
		}
		{
			SubLObject result = NIL;
			result = uia_filter_irrelevant_or_invalid_sentences_memoized(sentences, domain_mt);
			return result;
		}
	}

	public static final SubLObject uia_filter_irrelevant_or_invalid_sentences_memoized(SubLObject sentences, SubLObject domain_mt) {
		{
			SubLObject v_answer = NIL;
			SubLObject cdolist_list_var = sentences;
			SubLObject sentence = NIL;
			for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), sentence = cdolist_list_var.first()) {
				if (!((NIL != uia_irrelevant_sentence_memoizedP(sentence, domain_mt)) || (NIL != uia_invalid_sentence_memoizedP(sentence, domain_mt)))) {
					v_answer = cons(sentence, v_answer);
				}
			}
			return nreverse(v_answer);
		}
	}

	public static final SubLObject uia_sort_terms(SubLObject v_agenda, SubLObject terms, SubLObject generation_mt, SubLObject domain_mt) {
		if (generation_mt == UNPROVIDED) {
			generation_mt = NIL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == generation_mt) {
				generation_mt = user_interaction_agenda.uia_generation_language_mt(v_agenda);
			}
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_generation_domain_mt(v_agenda);
			}
			{
				SubLObject result = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								result = uia_sort_terms_memoized(terms, generation_mt, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_71 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_71, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	// defparameter
	private static final SubLSymbol $uia_sort_terms_generation_mt$ = makeSymbol("*UIA-SORT-TERMS-GENERATION-MT*");

	// defparameter
	private static final SubLSymbol $uia_sort_terms_domain_mt$ = makeSymbol("*UIA-SORT-TERMS-DOMAIN-MT*");

	public static final SubLObject uia_sort_terms_memoized_internal(SubLObject terms, SubLObject generation_mt, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_answer = NIL;
				{
					SubLObject _prev_bind_0 = $uia_sort_terms_generation_mt$.currentBinding(thread);
					SubLObject _prev_bind_1 = $uia_sort_terms_domain_mt$.currentBinding(thread);
					try {
						$uia_sort_terms_generation_mt$.bind(generation_mt, thread);
						$uia_sort_terms_domain_mt$.bind(domain_mt, thread);
						thread.resetMultipleValues();
						{
							SubLObject _prev_bind_0_72 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
							try {
								pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
								{
									SubLObject reuseP = thread.secondMultipleValue();
									thread.resetMultipleValues();
									try {
										thread.resetMultipleValues();
										{
											SubLObject _prev_bind_0_73 = pph_macros.$pph_memoization_state$.currentBinding(thread);
											try {
												pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
												{
													SubLObject new_or_reused = thread.secondMultipleValue();
													thread.resetMultipleValues();
													{
														SubLObject _prev_bind_0_74 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
														try {
															pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
															{
																SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
																{
																	SubLObject _prev_bind_0_75 = memoization_state.$memoization_state$.currentBinding(thread);
																	try {
																		memoization_state.$memoization_state$.bind(local_state, thread);
																		{
																			final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
																			try {
																				v_answer = Sort.sort(copy_list(terms), STRING_LESSP, UIA_SORT_TERMS_KEY);
																			} finally {
																				{
																					SubLObject _prev_bind_0_76 = $is_thread_performing_cleanupP$.currentBinding(thread);
																					try {
																						$is_thread_performing_cleanupP$.bind(T, thread);
																						if ((NIL != local_state) && (NIL == original_memoization_process)) {
																							memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
																						}
																					} finally {
																						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_76, thread);
																					}
																				}
																			}
																		}
																	} finally {
																		memoization_state.$memoization_state$.rebind(_prev_bind_0_75, thread);
																	}
																}
															}
														} finally {
															pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_74, thread);
														}
													}
													if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
														memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
													}
												}
											} finally {
												pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_73, thread);
											}
										}
									} finally {
										{
											SubLObject _prev_bind_0_77 = $is_thread_performing_cleanupP$.currentBinding(thread);
											try {
												$is_thread_performing_cleanupP$.bind(T, thread);
												if (NIL == reuseP) {
													pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
												}
											} finally {
												$is_thread_performing_cleanupP$.rebind(_prev_bind_0_77, thread);
											}
										}
									}
								}
							} finally {
								pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_72, thread);
							}
						}
					} finally {
						$uia_sort_terms_domain_mt$.rebind(_prev_bind_1, thread);
						$uia_sort_terms_generation_mt$.rebind(_prev_bind_0, thread);
					}
				}
				return v_answer;
			}
		}
	}

	public static final SubLObject uia_sort_terms_memoized(SubLObject terms, SubLObject generation_mt, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_sort_terms_memoized_internal(terms, generation_mt, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_SORT_TERMS_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_SORT_TERMS_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_SORT_TERMS_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_3(terms, generation_mt, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (terms.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (generation_mt.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
												return memoization_state.caching_results(results2);
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_sort_terms_memoized_internal(terms, generation_mt, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(terms, generation_mt, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_sort_terms_key(SubLObject v_term) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return uia_term_phrase_memoized(v_term, $uia_sort_terms_generation_mt$.getDynamicValue(thread), $uia_sort_terms_domain_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
		}
	}

	public static final SubLObject uia_forts_and_non_forts(SubLObject terms) {
		{
			SubLObject v_forts = NIL;
			SubLObject non_forts = NIL;
			SubLObject cdolist_list_var = terms;
			SubLObject v_term = NIL;
			for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), v_term = cdolist_list_var.first()) {
				if (NIL != forts.fort_p(v_term)) {
					v_forts = cons(v_term, v_forts);
				} else {
					non_forts = cons(v_term, non_forts);
				}
			}
			return list(nreverse(v_forts), nreverse(non_forts));
		}
	}

	public static final SubLObject uia_sort_sentences(SubLObject v_agenda, SubLObject sentences, SubLObject generation_mt, SubLObject domain_mt) {
		if (generation_mt == UNPROVIDED) {
			generation_mt = NIL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == generation_mt) {
				generation_mt = user_interaction_agenda.uia_generation_language_mt(v_agenda);
			}
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_generation_domain_mt(v_agenda);
			}
			{
				SubLObject result = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								result = uia_sort_sentences_memoized(sentences, generation_mt, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_78 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_78, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	// defparameter
	private static final SubLSymbol $uia_sort_sentences_generation_mt$ = makeSymbol("*UIA-SORT-SENTENCES-GENERATION-MT*");

	// defparameter
	private static final SubLSymbol $uia_sort_sentences_domain_mt$ = makeSymbol("*UIA-SORT-SENTENCES-DOMAIN-MT*");

	public static final SubLObject uia_sort_sentences_memoized_internal(SubLObject sentences, SubLObject generation_mt, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_answer = NIL;
				{
					SubLObject _prev_bind_0 = $uia_sort_sentences_generation_mt$.currentBinding(thread);
					SubLObject _prev_bind_1 = $uia_sort_sentences_domain_mt$.currentBinding(thread);
					try {
						$uia_sort_sentences_generation_mt$.bind(generation_mt, thread);
						$uia_sort_sentences_domain_mt$.bind(domain_mt, thread);
						v_answer = Sort.sort(copy_list(sentences), STRING_LESSP, UIA_SORT_SENTENCES_KEY);
					} finally {
						$uia_sort_sentences_domain_mt$.rebind(_prev_bind_1, thread);
						$uia_sort_sentences_generation_mt$.rebind(_prev_bind_0, thread);
					}
				}
				return v_answer;
			}
		}
	}

	public static final SubLObject uia_sort_sentences_memoized(SubLObject sentences, SubLObject generation_mt, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_sort_sentences_memoized_internal(sentences, generation_mt, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_SORT_SENTENCES_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_SORT_SENTENCES_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_SORT_SENTENCES_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_3(sentences, generation_mt, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (sentences.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (generation_mt.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
												return memoization_state.caching_results(results2);
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_sort_sentences_memoized_internal(sentences, generation_mt, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(sentences, generation_mt, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_sort_sentences_key(SubLObject sentence) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return uia_sentence_phrase_memoized(sentence, $uia_sort_sentences_generation_mt$.getDynamicValue(thread), $uia_sort_sentences_domain_mt$.getDynamicValue(thread), UNPROVIDED);
		}
	}

	public static final SubLObject uia_domain_example_predicates(SubLObject v_agenda, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject topic = uia_setup_state.uia_topic(v_agenda);
				SubLObject predicates = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								predicates = uia_domain_example_predicates_memoized(topic, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_79 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_79, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return predicates;
			}
		}
	}

	public static final SubLObject uia_domain_example_predicates_already_memoized(SubLObject v_agenda, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject topic = uia_setup_state.uia_topic(v_agenda);
				SubLObject v_answer = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								Errors.error($str_alt153$Unimplemented_macro_memoized_alre);
							} finally {
								{
									SubLObject _prev_bind_0_80 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_80, thread);
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

	public static final SubLObject uia_domain_example_predicates_memoized_internal(SubLObject topic, SubLObject domain_mt) {
		return rkf_domain_examples.rkf_domain_example_predicates(topic, domain_mt);
	}

	public static final SubLObject uia_domain_example_predicates_memoized(SubLObject topic, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_domain_example_predicates_memoized_internal(topic, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_DOMAIN_EXAMPLE_PREDICATES_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_DOMAIN_EXAMPLE_PREDICATES_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_DOMAIN_EXAMPLE_PREDICATES_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(topic, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (topic.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_domain_example_predicates_memoized_internal(topic, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(topic, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_predicate_selector(SubLObject v_agenda, SubLObject v_term, SubLObject predicates, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject matches = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								matches = uia_predicate_selector_memoized(v_term, domain_mt, predicates);
							} finally {
								{
									SubLObject _prev_bind_0_81 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_81, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return matches;
			}
		}
	}

	public static final SubLObject uia_predicate_selector_memoized_internal(SubLObject v_term, SubLObject domain_mt, SubLObject predicates) {
		return rkf_domain_examples.rkf_predicate_selector_matches(v_term, domain_mt, predicates, UNPROVIDED);
	}

	public static final SubLObject uia_predicate_selector_memoized(SubLObject v_term, SubLObject domain_mt, SubLObject predicates) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_predicate_selector_memoized_internal(v_term, domain_mt, predicates);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_PREDICATE_SELECTOR_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_PREDICATE_SELECTOR_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_PREDICATE_SELECTOR_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, domain_mt, predicates);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (v_term.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (domain_mt.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (((NIL != cached_args) && (NIL == cached_args.rest())) && predicates.equal(cached_args.first())) {
												return memoization_state.caching_results(results2);
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_predicate_selector_memoized_internal(v_term, domain_mt, predicates)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, domain_mt, predicates));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_predicate_filter(SubLObject v_agenda, SubLObject predicates, SubLObject v_term, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject filtered_predicates = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								filtered_predicates = uia_predicate_filter_memoized(predicates, v_term, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_82 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_82, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return filtered_predicates;
			}
		}
	}

	public static final SubLObject uia_predicate_filter_memoized_internal(SubLObject predicates, SubLObject v_term, SubLObject domain_mt) {
		{
			SubLObject matches = uia_predicate_selector_memoized(v_term, domain_mt, predicates);
			SubLObject filtered_predicates = NIL;
			SubLObject cdolist_list_var = matches;
			SubLObject match = NIL;
			for (match = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), match = cdolist_list_var.first()) {
				{
					SubLObject datum = match;
					SubLObject current = datum;
					SubLObject predicate = NIL;
					SubLObject rest = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt157);
					predicate = current.first();
					current = current.rest();
					rest = current;
					filtered_predicates = cons(predicate, filtered_predicates);
				}
			}
			filtered_predicates = list_utilities.fast_delete_duplicates(filtered_predicates, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			return filtered_predicates;
		}
	}

	public static final SubLObject uia_predicate_filter_memoized(SubLObject predicates, SubLObject v_term, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_predicate_filter_memoized_internal(predicates, v_term, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_PREDICATE_FILTER_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_PREDICATE_FILTER_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_PREDICATE_FILTER_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_3(predicates, v_term, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (predicates.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (v_term.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
												return memoization_state.caching_results(results2);
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_predicate_filter_memoized_internal(predicates, v_term, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicates, v_term, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_predicate_example_sentence(SubLObject v_agenda, SubLObject predicate, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		return uia_all_predicate_example_sentences(v_agenda, predicate, domain_mt).first();
	}

	public static final SubLObject uia_all_predicate_example_sentences(SubLObject v_agenda, SubLObject predicate, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject sentence = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								sentence = uia_all_predicate_example_sentences_memoized(predicate, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_83 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_83, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return sentence;
			}
		}
	}

	public static final SubLObject uia_all_predicate_example_sentences_memoized_internal(SubLObject predicate, SubLObject domain_mt) {
		return rkf_domain_examples.rkf_all_predicate_example_sentences(predicate, domain_mt);
	}

	public static final SubLObject uia_all_predicate_example_sentences_memoized(SubLObject predicate, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_all_predicate_example_sentences_memoized_internal(predicate, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_ALL_PREDICATE_EXAMPLE_SENTENCES_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_ALL_PREDICATE_EXAMPLE_SENTENCES_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_ALL_PREDICATE_EXAMPLE_SENTENCES_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (predicate.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_all_predicate_example_sentences_memoized_internal(predicate, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicate, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_predicates_to_example_sentences(SubLObject v_agenda, SubLObject predicates, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject sentences = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								{
									SubLObject cdolist_list_var = predicates;
									SubLObject predicate = NIL;
									for (predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), predicate = cdolist_list_var.first()) {
										{
											SubLObject example_sentences = uia_all_predicate_example_sentences_memoized(predicate, domain_mt);
											SubLObject cdolist_list_var_84 = example_sentences;
											SubLObject example_sentence = NIL;
											for (example_sentence = cdolist_list_var_84.first(); NIL != cdolist_list_var_84; cdolist_list_var_84 = cdolist_list_var_84.rest(), example_sentence = cdolist_list_var_84.first()) {
												sentences = cons(example_sentence, sentences);
											}
										}
									}
								}
							} finally {
								{
									SubLObject _prev_bind_0_85 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_85, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				sentences = nreverse(sentences);
				return sentences;
			}
		}
	}

	public static final SubLObject uia_predicate_general_utility(SubLObject v_agenda, SubLObject predicate, SubLObject domain_mt) {
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
								v_answer = uia_predicate_general_utility_memoized(predicate, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_86 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_86, thread);
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

	public static final SubLObject uia_predicate_general_utility_memoized_internal(SubLObject predicate, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_answer = NIL;
				{
					SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
						mt_relevance_macros.$mt$.bind(domain_mt, thread);
						v_answer = kb_indexing.relevant_num_index(predicate);
					} finally {
						mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
					}
				}
				return v_answer;
			}
		}
	}

	public static final SubLObject uia_predicate_general_utility_memoized(SubLObject predicate, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_predicate_general_utility_memoized_internal(predicate, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_PREDICATE_GENERAL_UTILITY_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_PREDICATE_GENERAL_UTILITY_MEMOIZED, TWO_INTEGER, NIL, EQL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_PREDICATE_GENERAL_UTILITY_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (predicate.eql(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.eql(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_predicate_general_utility_memoized_internal(predicate, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicate, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_predicate_indicators(SubLObject v_agenda, SubLObject predicate, SubLObject generation_mt, SubLObject domain_mt) {
		if (generation_mt == UNPROVIDED) {
			generation_mt = NIL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == generation_mt) {
				generation_mt = user_interaction_agenda.uia_generation_language_mt(v_agenda);
			}
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_generation_domain_mt(v_agenda);
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
							final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								v_answer = uia_predicate_indicators_memoized(predicate, generation_mt, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_87 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_87, thread);
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

	public static final SubLObject uia_predicate_indicators_memoized_internal(SubLObject predicate, SubLObject generation_mt, SubLObject domain_mt) {
		{
			SubLObject v_answer = NIL;
			SubLObject ignore_errors_tag = NIL;
			try {
				{
					SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
					try {
						bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
						try {
							v_answer = rkf_domain_examples.rkf_predicate_indicators(predicate, generation_mt, domain_mt);
						} catch (Throwable catch_var) {
							Errors.handleThrowable(catch_var, NIL);
						}
					} finally {
						rebind(Errors.$error_handler$, _prev_bind_0);
					}
				}
			} catch (Throwable ccatch_env_var) {
				ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
			}
			return v_answer;
		}
	}

	public static final SubLObject uia_predicate_indicators_memoized(SubLObject predicate, SubLObject generation_mt, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_predicate_indicators_memoized_internal(predicate, generation_mt, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_PREDICATE_INDICATORS_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_PREDICATE_INDICATORS_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_PREDICATE_INDICATORS_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_3(predicate, generation_mt, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (predicate.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (generation_mt.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
												return memoization_state.caching_results(results2);
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_predicate_indicators_memoized_internal(predicate, generation_mt, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicate, generation_mt, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_predicate_closeness_score(SubLObject v_agenda, SubLObject predicate, SubLObject sample_sentence, SubLObject generation_mt, SubLObject domain_mt) {
		if (generation_mt == UNPROVIDED) {
			generation_mt = NIL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject indicators = uia_predicate_indicators(v_agenda, predicate, generation_mt, domain_mt);
				SubLObject score = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								score = rkf_domain_examples.rkf_predicate_indicators_match_score(sample_sentence, indicators);
							} finally {
								{
									SubLObject _prev_bind_0_88 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_88, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return score;
			}
		}
	}

	public static final SubLObject uia_organize_predicates_by_specificity_to_term(SubLObject v_agenda, SubLObject predicates, SubLObject v_term, SubLObject domain_mt) {
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
								v_answer = uia_organize_predicates_by_specificity_to_term_memoized(predicates, v_term, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_89 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_89, thread);
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

	public static final SubLObject uia_organize_predicates_by_specificity_to_term_memoized_internal(SubLObject predicates, SubLObject v_term, SubLObject domain_mt) {
		return rkf_domain_examples.rkf_organize_predicates_by_specificity_to_term(predicates, v_term, domain_mt);
	}

	public static final SubLObject uia_organize_predicates_by_specificity_to_term_memoized(SubLObject predicates, SubLObject v_term, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_organize_predicates_by_specificity_to_term_memoized_internal(predicates, v_term, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_ORGANIZE_PREDICATES_BY_SPECIFICITY_TO_TERM_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_ORGANIZE_PREDICATES_BY_SPECIFICITY_TO_TERM_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_ORGANIZE_PREDICATES_BY_SPECIFICITY_TO_TERM_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_3(predicates, v_term, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (predicates.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (v_term.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
												return memoization_state.caching_results(results2);
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_organize_predicates_by_specificity_to_term_memoized_internal(predicates, v_term, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicates, v_term, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_organize_predicates_by_specificity_of_args(SubLObject v_agenda, SubLObject predicates, SubLObject domain_mt) {
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
								v_answer = uia_organize_predicates_by_specificity_of_args_memoized(predicates, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_90 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_90, thread);
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

	public static final SubLObject uia_organize_predicates_by_specificity_of_args_memoized_internal(SubLObject predicates, SubLObject domain_mt) {
		return rkf_domain_examples.rkf_organize_predicates_by_specificity_of_args(predicates, domain_mt);
	}

	public static final SubLObject uia_organize_predicates_by_specificity_of_args_memoized(SubLObject predicates, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_organize_predicates_by_specificity_of_args_memoized_internal(predicates, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_ORGANIZE_PREDICATES_BY_SPECIFICITY_OF_ARGS_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_ORGANIZE_PREDICATES_BY_SPECIFICITY_OF_ARGS_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_ORGANIZE_PREDICATES_BY_SPECIFICITY_OF_ARGS_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(predicates, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (predicates.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_organize_predicates_by_specificity_of_args_memoized_internal(predicates, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicates, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_organize_predicates_by_mt(SubLObject v_agenda, SubLObject predicates) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_answer = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								v_answer = uia_organize_predicates_by_mt_memoized(predicates);
							} finally {
								{
									SubLObject _prev_bind_0_91 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_91, thread);
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

	public static final SubLObject uia_organize_predicates_by_mt_memoized_internal(SubLObject predicates) {
		return rkf_domain_examples.rkf_organize_predicates_by_mt(predicates);
	}

	public static final SubLObject uia_organize_predicates_by_mt_memoized(SubLObject predicates) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_organize_predicates_by_mt_memoized_internal(predicates);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_ORGANIZE_PREDICATES_BY_MT_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_ORGANIZE_PREDICATES_BY_MT_MEMOIZED, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_ORGANIZE_PREDICATES_BY_MT_MEMOIZED, caching_state);
				}
				{
					SubLObject results = memoization_state.caching_state_lookup(caching_state, predicates, $kw2$_MEMOIZED_ITEM_NOT_FOUND_);
					if (results == $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_organize_predicates_by_mt_memoized_internal(predicates)));
						memoization_state.caching_state_put(caching_state, predicates, results, UNPROVIDED);
					}
					return memoization_state.caching_results(results);
				}
			}
		}
	}

	public static final SubLObject uia_organize_predicates_by_similarity(SubLObject v_agenda, SubLObject predicates, SubLObject domain_mt) {
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
								v_answer = uia_organize_predicates_by_similarity_memoized(predicates, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_92 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_92, thread);
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

	public static final SubLObject uia_organize_predicates_by_similarity_memoized_internal(SubLObject predicates, SubLObject domain_mt) {
		return rkf_domain_examples.rkf_organize_predicates_by_similarity(predicates, domain_mt);
	}

	public static final SubLObject uia_organize_predicates_by_similarity_memoized(SubLObject predicates, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_organize_predicates_by_similarity_memoized_internal(predicates, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_ORGANIZE_PREDICATES_BY_SIMILARITY_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_ORGANIZE_PREDICATES_BY_SIMILARITY_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_ORGANIZE_PREDICATES_BY_SIMILARITY_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(predicates, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (predicates.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_organize_predicates_by_similarity_memoized_internal(predicates, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicates, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_organize_predicate_matches_by_collection(SubLObject v_agenda, SubLObject matches) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject sections = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								sections = uia_organize_predicate_matches_by_collection_memoized(matches);
							} finally {
								{
									SubLObject _prev_bind_0_93 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_93, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return sections;
			}
		}
	}

	public static final SubLObject uia_organize_predicate_matches_by_collection_memoized_internal(SubLObject matches) {
		return rkf_domain_examples.rkf_organize_predicate_matches_by_collection(matches);
	}

	public static final SubLObject uia_organize_predicate_matches_by_collection_memoized(SubLObject matches) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_organize_predicate_matches_by_collection_memoized_internal(matches);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_ORGANIZE_PREDICATE_MATCHES_BY_COLLECTION_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_ORGANIZE_PREDICATE_MATCHES_BY_COLLECTION_MEMOIZED, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_ORGANIZE_PREDICATE_MATCHES_BY_COLLECTION_MEMOIZED, caching_state);
				}
				{
					SubLObject results = memoization_state.caching_state_lookup(caching_state, matches, $kw2$_MEMOIZED_ITEM_NOT_FOUND_);
					if (results == $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_organize_predicate_matches_by_collection_memoized_internal(matches)));
						memoization_state.caching_state_put(caching_state, matches, results, UNPROVIDED);
					}
					return memoization_state.caching_results(results);
				}
			}
		}
	}

	public static final SubLObject uia_sentence_has_variations(SubLObject v_agenda, SubLObject sentence, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject variations = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								variations = uia_sentence_has_variations_memoized(sentence, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_94 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_94, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return variations;
			}
		}
	}

	public static final SubLObject uia_sentence_has_variations_memoized_internal(SubLObject sentence, SubLObject domain_mt) {
		return rkf_domain_examples.rkf_sentence_has_variations(sentence, domain_mt);
	}

	public static final SubLObject uia_sentence_has_variations_memoized(SubLObject sentence, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_sentence_has_variations_memoized_internal(sentence, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_SENTENCE_HAS_VARIATIONS_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_SENTENCE_HAS_VARIATIONS_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_SENTENCE_HAS_VARIATIONS_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (sentence.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_sentence_has_variations_memoized_internal(sentence, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(sentence, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_sentence_variations(SubLObject v_agenda, SubLObject sentence, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject variations = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								variations = uia_sentence_variations_memoized(sentence, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_95 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_95, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return variations;
			}
		}
	}

	public static final SubLObject uia_sentence_variations_memoized_internal(SubLObject sentence, SubLObject domain_mt) {
		return rkf_domain_examples.rkf_sentence_variations(sentence, domain_mt);
	}

	public static final SubLObject uia_sentence_variations_memoized(SubLObject sentence, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_sentence_variations_memoized_internal(sentence, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_SENTENCE_VARIATIONS_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_SENTENCE_VARIATIONS_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_SENTENCE_VARIATIONS_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (sentence.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_sentence_variations_memoized_internal(sentence, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(sentence, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_build_spec_predicate_graph(SubLObject v_agenda, SubLObject predicates, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject v_graph = NIL;
				SubLObject orphans = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								thread.resetMultipleValues();
								{
									SubLObject pred_graph = uia_build_spec_predicate_graph_memoized(predicates, domain_mt);
									SubLObject pred_orphans = thread.secondMultipleValue();
									thread.resetMultipleValues();
									v_graph = pred_graph;
									orphans = pred_orphans;
								}
							} finally {
								{
									SubLObject _prev_bind_0_96 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_96, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return values(v_graph, orphans);
			}
		}
	}

	public static final SubLObject uia_build_spec_predicate_graph_memoized_internal(SubLObject predicates, SubLObject domain_mt) {
		return rkf_domain_examples.rkf_build_spec_predicate_graph(predicates, domain_mt);
	}

	public static final SubLObject uia_build_spec_predicate_graph_memoized(SubLObject predicates, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_build_spec_predicate_graph_memoized_internal(predicates, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_BUILD_SPEC_PREDICATE_GRAPH_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_BUILD_SPEC_PREDICATE_GRAPH_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_BUILD_SPEC_PREDICATE_GRAPH_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(predicates, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (predicates.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_build_spec_predicate_graph_memoized_internal(predicates, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicates, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_interpret_spec_predicate_graph(SubLObject v_agenda, SubLObject predicates, SubLObject v_graph, SubLObject orphans, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == domain_mt) {
				domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			}
			{
				SubLObject interpretation = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								interpretation = uia_interpret_spec_predicate_graph_memoized(predicates, v_graph, orphans, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_97 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_97, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return interpretation;
			}
		}
	}

	public static final SubLObject uia_interpret_spec_predicate_graph_memoized_internal(SubLObject predicates, SubLObject v_graph, SubLObject orphans, SubLObject domain_mt) {
		return rkf_domain_examples.rkf_interpret_spec_predicate_graph(predicates, v_graph, orphans, domain_mt);
	}

	public static final SubLObject uia_interpret_spec_predicate_graph_memoized(SubLObject predicates, SubLObject v_graph, SubLObject orphans, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_interpret_spec_predicate_graph_memoized_internal(predicates, v_graph, orphans, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_INTERPRET_SPEC_PREDICATE_GRAPH_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_INTERPRET_SPEC_PREDICATE_GRAPH_MEMOIZED, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_INTERPRET_SPEC_PREDICATE_GRAPH_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_4(predicates, v_graph, orphans, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (predicates.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (v_graph.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (orphans.equal(cached_args.first())) {
												cached_args = cached_args.rest();
												if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
													return memoization_state.caching_results(results2);
												}
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_interpret_spec_predicate_graph_memoized_internal(predicates, v_graph, orphans, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicates, v_graph, orphans, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_count_spec_predicate_sub_graphs(SubLObject v_agenda, SubLObject v_graph) {
		return rkf_domain_examples.rkf_count_spec_predicate_sub_graphs(v_graph);
	}

	public static final SubLObject uia_create_concept(SubLObject preferred_phrase, SubLObject interaction_mt, SubLObject lexification_mt, SubLObject name_pred) {
		if (name_pred == UNPROVIDED) {
			name_pred = $DEFAULT;
		}
		{
			SubLObject determiner_string = rkf_string_weeders.rkf_string_starting_with_determiner(preferred_phrase);
			SubLObject term_name = (NIL != determiner_string) ? ((SubLObject) (subseq(preferred_phrase, number_utilities.f_1X(length(determiner_string)), UNPROVIDED))) : preferred_phrase;
			SubLObject new_term = NIL;
			new_term = rkf_term_utilities.rkf_create(term_name, interaction_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			rkf_event_dispatcher.ensure_rkf_event_dispatcher_running();
			rkf_event_dispatcher.rkf_post_create_term_event(new_term, UNPROVIDED);
			rkf_tools.rkf_preferred_reference(new_term, preferred_phrase, lexification_mt, name_pred);
			return new_term;
		}
	}

	public static final SubLObject uia_create_named_concept(SubLObject preferred_phrase, SubLObject interaction_mt, SubLObject lexification_mt) {
		return uia_create_concept(preferred_phrase, interaction_mt, lexification_mt, $$nameString);
	}

	/**
	 *
	 *
	 * @param PHRASE
	 * 		string
	 * @param TERM
	 * 		cycl term
	 * @param PARSING-MT
	 * 		microtheory
	 * @param DOMAIN-MT
	 * 		microtheory
	 * @return cycl term; the first parse for PHRASE that includes TERM
	 */
	public static final SubLObject uia_reparse_unknown_term(SubLObject phrase, SubLObject v_term, SubLObject parsing_mt, SubLObject domain_mt) {
		{
			SubLObject parses = rkf_text_processors.rkf_term_in_sentence_reader(phrase, parsing_mt, domain_mt, UNPROVIDED);
			SubLObject span_iterator = rtp_iterators.new_itp_result_iterator(parses, UNPROVIDED, UNPROVIDED);
			SubLObject interp_iterator = rtp_iterators.itp_result_iterator_curr(span_iterator);
			while (NIL == rtp_iterators.itp_section_iterator_doneP(interp_iterator)) {
				if (NIL != cycl_utilities.expression_find(v_term, rtp_iterators.itp_section_iterator_curr_cycl(interp_iterator), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
					return rtp_iterators.itp_section_iterator_curr_cycl(interp_iterator);
				}
				rtp_iterators.itp_section_iterator_next(interp_iterator);
			}
			return NIL;
		}
	}

	public static final SubLObject uia_example_queries(SubLObject v_agenda) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
				SubLObject queries = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								queries = uia_example_queries_memoized(domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_98 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_98, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return queries;
			}
		}
	}

	public static final SubLObject uia_example_queries_already_memoized(SubLObject v_agenda) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
				SubLObject v_answer = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								Errors.error($str_alt153$Unimplemented_macro_memoized_alre);
							} finally {
								{
									SubLObject _prev_bind_0_99 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_99, thread);
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

	public static final SubLObject uia_example_queries_memoized_internal(SubLObject domain_mt) {
		return rkf_example_queries.rkf_example_queries(domain_mt);
	}

	public static final SubLObject uia_example_queries_memoized(SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_example_queries_memoized_internal(domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_EXAMPLE_QUERIES_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_EXAMPLE_QUERIES_MEMOIZED, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_EXAMPLE_QUERIES_MEMOIZED, caching_state);
				}
				{
					SubLObject results = memoization_state.caching_state_lookup(caching_state, domain_mt, $kw2$_MEMOIZED_ITEM_NOT_FOUND_);
					if (results == $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_example_queries_memoized_internal(domain_mt)));
						memoization_state.caching_state_put(caching_state, domain_mt, results, UNPROVIDED);
					}
					return memoization_state.caching_results(results);
				}
			}
		}
	}

	/**
	 *
	 *
	 * @unknown LISTP of EL-FORMULA-P objects that the user might want to ask about TERM.
	 */
	public static final SubLObject uia_example_term_queries(SubLObject v_agenda, SubLObject v_term) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
				SubLObject queries = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								queries = uia_example_term_queries_memoized(v_term, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_100 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_100, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return queries;
			}
		}
	}

	public static final SubLObject uia_example_term_queries_memoized_internal(SubLObject v_term, SubLObject domain_mt) {
		return rkf_example_queries.rkf_example_queries_for_term(v_term, domain_mt);
	}

	public static final SubLObject uia_example_term_queries_memoized(SubLObject v_term, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_example_term_queries_memoized_internal(v_term, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_EXAMPLE_TERM_QUERIES_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_EXAMPLE_TERM_QUERIES_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_EXAMPLE_TERM_QUERIES_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (v_term.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_example_term_queries_memoized_internal(v_term, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	/**
	 *
	 *
	 * @unknown LISTP of NEW-CYCL-QUERY-SPECIFICATION-P objects appropriate for TERM.
	 */
	public static final SubLObject uia_test_questions_for_term(SubLObject v_agenda, SubLObject v_term) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
				SubLObject tqs = NIL;
				SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
				SubLObject local_state = state;
				{
					SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
					try {
						memoization_state.$memoization_state$.bind(local_state, thread);
						{
							final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
							try {
								tqs = uia_test_questions_for_term_memoized(v_term, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_101 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_101, thread);
									}
								}
							}
						}
					} finally {
						memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
					}
				}
				return tqs;
			}
		}
	}

	public static final SubLObject uia_test_questions_for_term_memoized_internal(SubLObject v_term, SubLObject domain_mt) {
		return rkf_example_queries.rkf_test_questions_for_term(v_term, domain_mt);
	}

	public static final SubLObject uia_test_questions_for_term_memoized(SubLObject v_term, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_test_questions_for_term_memoized_internal(v_term, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_TEST_QUESTIONS_FOR_TERM_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_TEST_QUESTIONS_FOR_TERM_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_TEST_QUESTIONS_FOR_TERM_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (v_term.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
											return memoization_state.caching_results(results2);
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_test_questions_for_term_memoized_internal(v_term, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_collectionP(SubLObject interaction, SubLObject v_term) {
		if (NIL != forts.fort_p(v_term)) {
			return fort_types_interface.collectionP(v_term);
		} else if ((NIL != el_utilities.possibly_fo_naut_p(v_term)) && (NIL != isa.isaP(v_term.first(), $$ReifiableFunction, UNPROVIDED, UNPROVIDED))) {
			return isa.nat_isaP(v_term, $$Collection, UNPROVIDED, UNPROVIDED);
		}

		return NIL;
	}

	public static final SubLObject uia_enumerate_sme_owned_processes(SubLObject v_agenda) {
		if (v_agenda == UNPROVIDED) {
			v_agenda = NIL;
		}
		if (NIL == v_agenda) {
			v_agenda = cb_user_interaction_agenda.cb_current_uia();
		}
		{
			SubLObject mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
			return ask_utilities.ask_variable($PROCESS, listS($$and, list($$termDependsOn, $PROCESS, mt), $list_alt179), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
	}

	/**
	 *
	 *
	 * @return BOOLEAN; Should we consider TERM to belong to the current SME, whose
	working mt is DOMAIN-MT?
	 */
	public static final SubLObject is_sme_term_in_mtP(SubLObject v_term, SubLObject domain_mt) {
		return makeBoolean(((NIL != forts.fort_p(v_term)) && (NIL != rkf_term_utilities.rkf_term_defined_in_mtP(v_term, domain_mt))) && (NIL == fort_types_interface.microtheory_p(v_term)));
	}

	// defvar
	private static final SubLSymbol $uia_definitional_preds$ = makeSymbol("*UIA-DEFINITIONAL-PREDS*");

	public static final SubLObject uia_maybe_initialize_definitional_preds() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == $uia_definitional_preds$.getDynamicValue(thread)) {
				uia_initialize_definitional_preds();
			}
			return NIL;
		}
	}

	public static final SubLObject uia_initialize_definitional_preds() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
				SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
				try {
					mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
					mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
					$uia_definitional_preds$.setDynamicValue(cconcatenate(genl_predicates.all_spec_preds($$isa, UNPROVIDED, UNPROVIDED), genl_predicates.all_spec_preds($$genls, UNPROVIDED, UNPROVIDED)), thread);
				} finally {
					mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
					mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
				}
			}
			return NIL;
		}
	}

	public static final SubLObject uia_defining_assertion_p(SubLObject assertion) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			uia_maybe_initialize_definitional_preds();
			{
				SubLObject formula = uncanonicalizer.assertion_el_formula(assertion);
				if ((NIL != el_utilities.formula_arityE(formula, TWO_INTEGER, UNPROVIDED)) && (NIL != member(cycl_utilities.formula_arg0(formula), $uia_definitional_preds$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) {
					return T;
				}
			}
			return NIL;
		}
	}

	public static final SubLObject uia_classify_fort(SubLObject v_agenda, SubLObject fort, SubLObject classifier, SubLObject domain_mt) {
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
								v_answer = uia_classify_fort_memoized(fort, classifier, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_102 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_102, thread);
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

	public static final SubLObject uia_classify_fort_memoized_internal(SubLObject fort, SubLObject classifier, SubLObject domain_mt) {
		return rkf_knowledge_sorter.rkf_classify_fort(fort, classifier, domain_mt);
	}

	public static final SubLObject uia_classify_fort_memoized(SubLObject fort, SubLObject classifier, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_classify_fort_memoized_internal(fort, classifier, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_CLASSIFY_FORT_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_CLASSIFY_FORT_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_CLASSIFY_FORT_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_3(fort, classifier, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (fort.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (classifier.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
												return memoization_state.caching_results(results2);
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_classify_fort_memoized_internal(fort, classifier, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(fort, classifier, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_classify_fort_set(SubLObject v_agenda, SubLObject v_forts, SubLObject classifier, SubLObject domain_mt) {
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
								v_answer = uia_classify_fort_set_memoized(v_forts, classifier, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_103 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_103, thread);
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

	public static final SubLObject uia_classify_fort_set_memoized_internal(SubLObject v_forts, SubLObject classifier, SubLObject domain_mt) {
		return rkf_knowledge_sorter.rkf_classify_fort_set(v_forts, classifier, domain_mt);
	}

	public static final SubLObject uia_classify_fort_set_memoized(SubLObject v_forts, SubLObject classifier, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_classify_fort_set_memoized_internal(v_forts, classifier, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_CLASSIFY_FORT_SET_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_CLASSIFY_FORT_SET_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_CLASSIFY_FORT_SET_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_3(v_forts, classifier, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (v_forts.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (classifier.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
												return memoization_state.caching_results(results2);
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_classify_fort_set_memoized_internal(v_forts, classifier, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_forts, classifier, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_classify_sentence(SubLObject v_agenda, SubLObject sentence, SubLObject classifier, SubLObject domain_mt) {
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
								v_answer = uia_classify_sentence_memoized(sentence, classifier, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_104 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_104, thread);
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

	public static final SubLObject uia_classify_sentence_memoized_internal(SubLObject sentence, SubLObject classifier, SubLObject domain_mt) {
		return rkf_knowledge_sorter.rkf_classify_sentence(sentence, classifier, domain_mt);
	}

	public static final SubLObject uia_classify_sentence_memoized(SubLObject sentence, SubLObject classifier, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_classify_sentence_memoized_internal(sentence, classifier, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_CLASSIFY_SENTENCE_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_CLASSIFY_SENTENCE_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_CLASSIFY_SENTENCE_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_3(sentence, classifier, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (sentence.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (classifier.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
												return memoization_state.caching_results(results2);
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_classify_sentence_memoized_internal(sentence, classifier, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(sentence, classifier, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_classify_assertion(SubLObject v_agenda, SubLObject assertion, SubLObject classifier, SubLObject domain_mt) {
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
								v_answer = uia_classify_assertion_memoized(assertion, classifier, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_105 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_105, thread);
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

	public static final SubLObject uia_classify_assertion_memoized_internal(SubLObject assertion, SubLObject classifier, SubLObject domain_mt) {
		return rkf_knowledge_sorter.rkf_classify_assertion(assertion, classifier, domain_mt);
	}

	public static final SubLObject uia_classify_assertion_memoized(SubLObject assertion, SubLObject classifier, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_classify_assertion_memoized_internal(assertion, classifier, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_CLASSIFY_ASSERTION_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_CLASSIFY_ASSERTION_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_CLASSIFY_ASSERTION_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_3(assertion, classifier, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (assertion.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (classifier.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
												return memoization_state.caching_results(results2);
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_classify_assertion_memoized_internal(assertion, classifier, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(assertion, classifier, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_classify_sentence_set(SubLObject v_agenda, SubLObject sentence_set, SubLObject classifier, SubLObject domain_mt) {
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
								v_answer = uia_classify_sentence_set_memoized(sentence_set, classifier, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_106 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_106, thread);
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

	public static final SubLObject uia_classify_sentence_set_memoized_internal(SubLObject sentence_set, SubLObject classifier, SubLObject domain_mt) {
		return rkf_knowledge_sorter.rkf_classify_sentence_set(sentence_set, classifier, domain_mt);
	}

	public static final SubLObject uia_classify_sentence_set_memoized(SubLObject sentence_set, SubLObject classifier, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_classify_sentence_set_memoized_internal(sentence_set, classifier, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_CLASSIFY_SENTENCE_SET_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_CLASSIFY_SENTENCE_SET_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_CLASSIFY_SENTENCE_SET_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_3(sentence_set, classifier, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (sentence_set.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (classifier.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
												return memoization_state.caching_results(results2);
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_classify_sentence_set_memoized_internal(sentence_set, classifier, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(sentence_set, classifier, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_classify_assertion_set(SubLObject v_agenda, SubLObject assertion_set, SubLObject classifier, SubLObject domain_mt) {
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
								v_answer = uia_classify_assertion_set_memoized(assertion_set, classifier, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_107 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_107, thread);
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

	public static final SubLObject uia_classify_assertion_set_memoized_internal(SubLObject assertion_set, SubLObject classifier, SubLObject domain_mt) {
		return rkf_knowledge_sorter.rkf_classify_assertion_set(assertion_set, classifier, domain_mt);
	}

	public static final SubLObject uia_classify_assertion_set_memoized(SubLObject assertion_set, SubLObject classifier, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_classify_assertion_set_memoized_internal(assertion_set, classifier, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_CLASSIFY_ASSERTION_SET_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_CLASSIFY_ASSERTION_SET_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_CLASSIFY_ASSERTION_SET_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_3(assertion_set, classifier, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (assertion_set.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (classifier.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
												return memoization_state.caching_results(results2);
											}
										}
									}
								}
							}
						}
					}
					{
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_classify_assertion_set_memoized_internal(assertion_set, classifier, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(assertion_set, classifier, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_classify_assertion_set_precise(SubLObject v_agenda, SubLObject assertion_set, SubLObject classifier, SubLObject domain_mt) {
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
								v_answer = rkf_knowledge_sorter.rkf_classify_assertion_set_precise(assertion_set, classifier, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_108 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_108, thread);
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

	public static final SubLObject uia_get_ordering_categories(SubLObject v_agenda, SubLObject ordering, SubLObject domain_mt) {
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
								v_answer = uia_get_ordering_categories_memoized(ordering, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_109 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_109, thread);
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

	public static final SubLObject uia_get_ordering_categories_memoized_internal(SubLObject ordering, SubLObject domain_mt) {
		return rkf_knowledge_sorter.rkf_get_ordering_categories(ordering, domain_mt);
	}

	public static final SubLObject uia_get_ordering_categories_memoized(SubLObject ordering, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_get_ordering_categories_memoized_internal(ordering, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_GET_ORDERING_CATEGORIES_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_GET_ORDERING_CATEGORIES_MEMOIZED, TWO_INTEGER, NIL, EQ, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_GET_ORDERING_CATEGORIES_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(ordering, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (ordering == cached_args.first()) {
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
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_get_ordering_categories_memoized_internal(ordering, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(ordering, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_get_ordering_categories_from_classifier(SubLObject v_agenda, SubLObject classifier, SubLObject domain_mt) {
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
								v_answer = uia_get_ordering_categories_from_classifier_memoized(classifier, domain_mt);
							} finally {
								{
									SubLObject _prev_bind_0_110 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if ((NIL != local_state) && (NIL == original_memoization_process)) {
											memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_110, thread);
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

	public static final SubLObject uia_get_ordering_categories_from_classifier_memoized_internal(SubLObject classifier, SubLObject domain_mt) {
		return rkf_knowledge_sorter.rkf_get_ordering_categories_from_classifier(classifier, domain_mt);
	}

	public static final SubLObject uia_get_ordering_categories_from_classifier_memoized(SubLObject classifier, SubLObject domain_mt) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return uia_get_ordering_categories_from_classifier_memoized_internal(classifier, domain_mt);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_GET_ORDERING_CATEGORIES_FROM_CLASSIFIER_MEMOIZED, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_GET_ORDERING_CATEGORIES_FROM_CLASSIFIER_MEMOIZED, TWO_INTEGER, NIL, EQ, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, UIA_GET_ORDERING_CATEGORIES_FROM_CLASSIFIER_MEMOIZED, caching_state);
				}
				{
					SubLObject sxhash = memoization_state.sxhash_calc_2(classifier, domain_mt);
					SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
					if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
						{
							SubLObject cdolist_list_var = collisions;
							SubLObject collision = NIL;
							for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
								{
									SubLObject cached_args = collision.first();
									SubLObject results2 = second(collision);
									if (classifier == cached_args.first()) {
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
						SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_get_ordering_categories_from_classifier_memoized_internal(classifier, domain_mt)));
						memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(classifier, domain_mt));
						return memoization_state.caching_results(results);
					}
				}
			}
		}
	}

	public static final SubLObject uia_best_defining_mt_for_fort_and_sentence(SubLObject fort, SubLObject sentence, SubLObject base_mt) {
		{
			SubLObject result = rkf_assertion_utilities.rkf_best_defining_mt_for_fort_and_sentence(fort, sentence, NIL);
			if (NIL == result) {
				result = rkf_assertion_utilities.rkf_best_defining_mt_for_sentence(sentence, NIL);
			}
			if (NIL == result) {
				result = base_mt;
			}
			return result;
		}
	}

	public static final SubLObject uia_best_defining_mt_for_fort(SubLObject fort, SubLObject base_mt) {
		{
			SubLObject result = rkf_assertion_utilities.rkf_best_defining_mt_for_fort(fort, base_mt);
			return result;
		}
	}

	public static final SubLObject declare_uia_trampolines_file() {
		declareFunction("uia_phrase_candidate_terms", "UIA-PHRASE-CANDIDATE-TERMS", 2, 3, false);
		declareFunction("uia_phrase_candidate_terms_memoized_internal", "UIA-PHRASE-CANDIDATE-TERMS-MEMOIZED-INTERNAL", 4, 0, false);
		declareFunction("uia_phrase_candidate_terms_memoized", "UIA-PHRASE-CANDIDATE-TERMS-MEMOIZED", 4, 0, false);
		declareFunction("uia_phrase_candidate_terms_in_sentence", "UIA-PHRASE-CANDIDATE-TERMS-IN-SENTENCE", 2, 2, false);
		declareFunction("uia_phrase_candidate_terms_in_sentence_memoized_internal", "UIA-PHRASE-CANDIDATE-TERMS-IN-SENTENCE-MEMOIZED-INTERNAL", 3, 0, false);
		declareFunction("uia_phrase_candidate_terms_in_sentence_memoized", "UIA-PHRASE-CANDIDATE-TERMS-IN-SENTENCE-MEMOIZED", 3, 0, false);
		declareFunction("uia_phrases_candidate_sentences_replacing_terms", "UIA-PHRASES-CANDIDATE-SENTENCES-REPLACING-TERMS", 4, 2, false);
		declareFunction("uia_phrases_candidate_sentences_replacing_terms_memoized_internal", "UIA-PHRASES-CANDIDATE-SENTENCES-REPLACING-TERMS-MEMOIZED-INTERNAL", 5, 0, false);
		declareFunction("uia_phrases_candidate_sentences_replacing_terms_memoized", "UIA-PHRASES-CANDIDATE-SENTENCES-REPLACING-TERMS-MEMOIZED", 5, 0, false);
		declareMacro("with_uia_pph_html_parameters", "WITH-UIA-PPH-HTML-PARAMETERS");
		declareFunction("uia_get_default_pph_frame_name", "UIA-GET-DEFAULT-PPH-FRAME-NAME", 0, 0, false);
		declareFunction("uia_get_default_pph_link_function", "UIA-GET-DEFAULT-PPH-LINK-FUNCTION", 0, 0, false);
		declareFunction("revert_ontology_browser_old_behavior", "REVERT-ONTOLOGY-BROWSER-OLD-BEHAVIOR", 0, 0, false);
		declareFunction("uia_term_phrase", "UIA-TERM-PHRASE", 2, 3, false);
		declareFunction("uia_html_term_phrase", "UIA-HTML-TERM-PHRASE", 2, 2, false);
		declareFunction("uia_term_phrase_np", "UIA-TERM-PHRASE-NP", 2, 3, false);
		declareFunction("uia_html_term_phrase_np", "UIA-HTML-TERM-PHRASE-NP", 2, 2, false);
		declareFunction("uia_paraphrase_constraint_for_term", "UIA-PARAPHRASE-CONSTRAINT-FOR-TERM", 2, 0, false);
		declareFunction("uia_paraphrase_constraint_for_term_memoized_internal", "UIA-PARAPHRASE-CONSTRAINT-FOR-TERM-MEMOIZED-INTERNAL", 2, 0, false);
		declareFunction("uia_paraphrase_constraint_for_term_memoized", "UIA-PARAPHRASE-CONSTRAINT-FOR-TERM-MEMOIZED", 2, 0, false);
		declareFunction("uia_maybe_constrain_term_for_paraphrase", "UIA-MAYBE-CONSTRAIN-TERM-FOR-PARAPHRASE", 2, 0, false);
		declareFunction("uia_constrain_term_for_paraphraseP", "UIA-CONSTRAIN-TERM-FOR-PARAPHRASE?", 2, 0, false);
		declareFunction("uia_constrain_term_for_paraphrase", "UIA-CONSTRAIN-TERM-FOR-PARAPHRASE", 2, 0, false);
		declareFunction("uia_add_paraphrase_constraint", "UIA-ADD-PARAPHRASE-CONSTRAINT", 2, 0, false);
		declareFunction("uia_term_with_paraphrase_constraint_p", "UIA-TERM-WITH-PARAPHRASE-CONSTRAINT-P", 1, 0, false);
		declareFunction("uia_paraphrase_constraint_from_term", "UIA-PARAPHRASE-CONSTRAINT-FROM-TERM", 1, 0, false);
		declareFunction("uia_term_phrase_memoized_internal", "UIA-TERM-PHRASE-MEMOIZED-INTERNAL", 3, 2, false);
		declareFunction("uia_term_phrase_memoized", "UIA-TERM-PHRASE-MEMOIZED", 3, 2, false);
		declareFunction("uia_term_phrase_precise", "UIA-TERM-PHRASE-PRECISE", 2, 3, false);
		declareFunction("uia_html_term_phrase_precise", "UIA-HTML-TERM-PHRASE-PRECISE", 2, 2, false);
		declareFunction("uia_term_phrase_precise_memoized_internal", "UIA-TERM-PHRASE-PRECISE-MEMOIZED-INTERNAL", 3, 2, false);
		declareFunction("uia_term_phrase_precise_memoized", "UIA-TERM-PHRASE-PRECISE-MEMOIZED", 3, 2, false);
		declareFunction("uia_sentence_phrase", "UIA-SENTENCE-PHRASE", 2, 2, false);
		declareFunction("uia_sentence_phrase_memoized_internal", "UIA-SENTENCE-PHRASE-MEMOIZED-INTERNAL", 3, 1, false);
		declareFunction("uia_sentence_phrase_memoized", "UIA-SENTENCE-PHRASE-MEMOIZED", 3, 1, false);
		declareFunction("uia_sentence_phrase_precise", "UIA-SENTENCE-PHRASE-PRECISE", 2, 2, false);
		declareFunction("uia_sentence_phrase_precise_memoized_internal", "UIA-SENTENCE-PHRASE-PRECISE-MEMOIZED-INTERNAL", 3, 1, false);
		declareFunction("uia_sentence_phrase_precise_memoized", "UIA-SENTENCE-PHRASE-PRECISE-MEMOIZED", 3, 1, false);
		declareFunction("uia_all_phrases_for_term", "UIA-ALL-PHRASES-FOR-TERM", 2, 4, false);
		declareFunction("uia_all_phrases_for_term_memoized_internal", "UIA-ALL-PHRASES-FOR-TERM-MEMOIZED-INTERNAL", 5, 1, false);
		declareFunction("uia_all_phrases_for_term_memoized", "UIA-ALL-PHRASES-FOR-TERM-MEMOIZED", 5, 1, false);
		declareFunction("clear_uia_paraphrase_caches", "CLEAR-UIA-PARAPHRASE-CACHES", 1, 0, false);
		declareFunction("clear_uia_memoization_functions", "CLEAR-UIA-MEMOIZATION-FUNCTIONS", 2, 0, false);
		declareFunction("uia_phrase_output_list", "UIA-PHRASE-OUTPUT-LIST", 2, 3, false);
		declareFunction("uia_phrase_output_list_memoized_internal", "UIA-PHRASE-OUTPUT-LIST-MEMOIZED-INTERNAL", 4, 1, false);
		declareFunction("uia_phrase_output_list_memoized", "UIA-PHRASE-OUTPUT-LIST-MEMOIZED", 4, 1, false);
		declareFunction("uia_html_sentence_phrase", "UIA-HTML-SENTENCE-PHRASE", 2, 2, false);
		declareFunction("uia_html_sentence_phrase_memoized_internal", "UIA-HTML-SENTENCE-PHRASE-MEMOIZED-INTERNAL", 3, 1, false);
		declareFunction("uia_html_sentence_phrase_memoized", "UIA-HTML-SENTENCE-PHRASE-MEMOIZED", 3, 1, false);
		declareFunction("uia_html_sentence_phrase_precise", "UIA-HTML-SENTENCE-PHRASE-PRECISE", 2, 2, false);
		declareFunction("uia_html_sentence_phrase_precise_memoized_internal", "UIA-HTML-SENTENCE-PHRASE-PRECISE-MEMOIZED-INTERNAL", 3, 1, false);
		declareFunction("uia_html_sentence_phrase_precise_memoized", "UIA-HTML-SENTENCE-PHRASE-PRECISE-MEMOIZED", 3, 1, false);
		declareFunction("uia_assertion_phrase", "UIA-ASSERTION-PHRASE", 2, 2, false);
		declareFunction("uia_assertion_phrase_precise", "UIA-ASSERTION-PHRASE-PRECISE", 2, 2, false);
		declareFunction("uia_html_assertion_phrase", "UIA-HTML-ASSERTION-PHRASE", 2, 2, false);
		declareFunction("uia_html_assertion_phrase_precise", "UIA-HTML-ASSERTION-PHRASE-PRECISE", 2, 2, false);
		declareFunction("uia_precache_html_sentence_phrases", "UIA-PRECACHE-HTML-SENTENCE-PHRASES", 2, 3, false);
		declareFunction("uia_query_phrase", "UIA-QUERY-PHRASE", 2, 3, false);
		declareFunction("uia_query_phrase_memoized_internal", "UIA-QUERY-PHRASE-MEMOIZED-INTERNAL", 3, 1, false);
		declareFunction("uia_query_phrase_memoized", "UIA-QUERY-PHRASE-MEMOIZED", 3, 1, false);
		declareFunction("uia_html_query_phrase", "UIA-HTML-QUERY-PHRASE", 2, 3, false);
		declareFunction("uia_html_query_phrase_memoized_internal", "UIA-HTML-QUERY-PHRASE-MEMOIZED-INTERNAL", 3, 1, false);
		declareFunction("uia_html_query_phrase_memoized", "UIA-HTML-QUERY-PHRASE-MEMOIZED", 3, 1, false);
		declareFunction("uia_imperative_phrase", "UIA-IMPERATIVE-PHRASE", 2, 3, false);
		declareFunction("uia_imperative_phrase_memoized_internal", "UIA-IMPERATIVE-PHRASE-MEMOIZED-INTERNAL", 3, 1, false);
		declareFunction("uia_imperative_phrase_memoized", "UIA-IMPERATIVE-PHRASE-MEMOIZED", 3, 1, false);
		declareFunction("uia_html_imperative_phrase", "UIA-HTML-IMPERATIVE-PHRASE", 2, 2, false);
		declareFunction("uia_html_imperative_phrase_memoized_internal", "UIA-HTML-IMPERATIVE-PHRASE-MEMOIZED-INTERNAL", 3, 1, false);
		declareFunction("uia_html_imperative_phrase_memoized", "UIA-HTML-IMPERATIVE-PHRASE-MEMOIZED", 3, 1, false);
		declareFunction("uia_terms_distinguishing_phrases", "UIA-TERMS-DISTINGUISHING-PHRASES", 2, 7, false);
		declareFunction("uia_terms_distinguishing_phrases_memoized_internal", "UIA-TERMS-DISTINGUISHING-PHRASES-MEMOIZED-INTERNAL", 7, 1, false);
		declareFunction("uia_terms_distinguishing_phrases_memoized", "UIA-TERMS-DISTINGUISHING-PHRASES-MEMOIZED", 7, 1, false);
		declareFunction("uia_terms_distinguishing_sentences", "UIA-TERMS-DISTINGUISHING-SENTENCES", 2, 1, false);
		declareFunction("uia_terms_distinguishing_sentences_memoized_internal", "UIA-TERMS-DISTINGUISHING-SENTENCES-MEMOIZED-INTERNAL", 2, 0, false);
		declareFunction("uia_terms_distinguishing_sentences_memoized", "UIA-TERMS-DISTINGUISHING-SENTENCES-MEMOIZED", 2, 0, false);
		declareFunction("uia_term_clarifying_sentences", "UIA-TERM-CLARIFYING-SENTENCES", 2, 3, false);
		declareFunction("uia_term_clarifying_sentences_memoized_internal", "UIA-TERM-CLARIFYING-SENTENCES-MEMOIZED-INTERNAL", 4, 0, false);
		declareFunction("uia_term_clarifying_sentences_memoized", "UIA-TERM-CLARIFYING-SENTENCES-MEMOIZED", 4, 0, false);
		declareFunction("uia_terms_distinguishing_pictures", "UIA-TERMS-DISTINGUISHING-PICTURES", 2, 1, false);
		declareFunction("uia_terms_distinguishing_pictures_memoized_internal", "UIA-TERMS-DISTINGUISHING-PICTURES-MEMOIZED-INTERNAL", 2, 0, false);
		declareFunction("uia_terms_distinguishing_pictures_memoized", "UIA-TERMS-DISTINGUISHING-PICTURES-MEMOIZED", 2, 0, false);
		declareFunction("uia_bootstrapping_generate_phrase", "UIA-BOOTSTRAPPING-GENERATE-PHRASE", 1, 0, false);
		declareFunction("uia_html_arg_type_summary_for_pred", "UIA-HTML-ARG-TYPE-SUMMARY-FOR-PRED", 2, 3, false);
		declareFunction("uia_arg_type_summary_for_pred", "UIA-ARG-TYPE-SUMMARY-FOR-PRED", 2, 4, false);
		declareFunction("uia_arg_type_summary_cycl_for_pred", "UIA-ARG-TYPE-SUMMARY-CYCL-FOR-PRED", 2, 2, false);
		declareFunction("uia_arg_type_summary_cycl_for_pred_memoized_internal", "UIA-ARG-TYPE-SUMMARY-CYCL-FOR-PRED-MEMOIZED-INTERNAL", 3, 0, false);
		declareFunction("uia_arg_type_summary_cycl_for_pred_memoized", "UIA-ARG-TYPE-SUMMARY-CYCL-FOR-PRED-MEMOIZED", 3, 0, false);
		declareFunction("uia_salient_argn_isa", "UIA-SALIENT-ARGN-ISA", 3, 1, false);
		declareFunction("uia_salient_argn_isa_memoized_internal", "UIA-SALIENT-ARGN-ISA-MEMOIZED-INTERNAL", 3, 0, false);
		declareFunction("uia_salient_argn_isa_memoized", "UIA-SALIENT-ARGN-ISA-MEMOIZED", 3, 0, false);
		declareFunction("uia_summary_sentence", "UIA-SUMMARY-SENTENCE", 2, 0, false);
		declareFunction("uia_summary_sentence_memoized_internal", "UIA-SUMMARY-SENTENCE-MEMOIZED-INTERNAL", 4, 0, false);
		declareFunction("uia_summary_sentence_memoized", "UIA-SUMMARY-SENTENCE-MEMOIZED", 4, 0, false);
		declareFunction("uia_html_summary_sentence", "UIA-HTML-SUMMARY-SENTENCE", 2, 0, false);
		declareFunction("uia_html_summary_sentence_memoized_internal", "UIA-HTML-SUMMARY-SENTENCE-MEMOIZED-INTERNAL", 4, 0, false);
		declareFunction("uia_html_summary_sentence_memoized", "UIA-HTML-SUMMARY-SENTENCE-MEMOIZED", 4, 0, false);
		declareFunction("uia_summarize", "UIA-SUMMARIZE", 2, 1, false);
		declareFunction("uia_summarize_memoized_internal", "UIA-SUMMARIZE-MEMOIZED-INTERNAL", 2, 0, false);
		declareFunction("uia_summarize_memoized", "UIA-SUMMARIZE-MEMOIZED", 2, 0, false);
		declareFunction("uia_sentences_for_term", "UIA-SENTENCES-FOR-TERM", 2, 1, false);
		declareFunction("uia_sentences_for_term_memoized_internal", "UIA-SENTENCES-FOR-TERM-MEMOIZED-INTERNAL", 2, 0, false);
		declareFunction("uia_sentences_for_term_memoized", "UIA-SENTENCES-FOR-TERM-MEMOIZED", 2, 0, false);
		declareFunction("uia_compare_terms", "UIA-COMPARE-TERMS", 3, 1, false);
		declareFunction("uia_compare_terms_memoized_internal", "UIA-COMPARE-TERMS-MEMOIZED-INTERNAL", 3, 0, false);
		declareFunction("uia_compare_terms_memoized", "UIA-COMPARE-TERMS-MEMOIZED", 3, 0, false);
		declareFunction("uia_related_terms", "UIA-RELATED-TERMS", 2, 1, false);
		declareFunction("uia_related_terms_memoized_internal", "UIA-RELATED-TERMS-MEMOIZED-INTERNAL", 2, 0, false);
		declareFunction("uia_related_terms_memoized", "UIA-RELATED-TERMS-MEMOIZED", 2, 0, false);
		declareFunction("uia_candidate_sentences_relating_terms", "UIA-CANDIDATE-SENTENCES-RELATING-TERMS", 2, 1, false);
		declareFunction("uia_candidate_sentences_relating_terms_memoized_internal", "UIA-CANDIDATE-SENTENCES-RELATING-TERMS-MEMOIZED-INTERNAL", 2, 0, false);
		declareFunction("uia_candidate_sentences_relating_terms_memoized", "UIA-CANDIDATE-SENTENCES-RELATING-TERMS-MEMOIZED", 2, 0, false);
		declareFunction("uia_rejected_sentence", "UIA-REJECTED-SENTENCE", 2, 1, false);
		declareFunction("uia_rejected_sentence_memoized_internal", "UIA-REJECTED-SENTENCE-MEMOIZED-INTERNAL", 2, 0, false);
		declareFunction("uia_rejected_sentence_memoized", "UIA-REJECTED-SENTENCE-MEMOIZED", 2, 0, false);
		declareFunction("uia_redundant_sentence", "UIA-REDUNDANT-SENTENCE", 2, 1, false);
		declareFunction("uia_redundant_sentence_memoized_internal", "UIA-REDUNDANT-SENTENCE-MEMOIZED-INTERNAL", 2, 0, false);
		declareFunction("uia_redundant_sentence_memoized", "UIA-REDUNDANT-SENTENCE-MEMOIZED", 2, 0, false);
		declareFunction("uia_precisify_argument_candidates", "UIA-PRECISIFY-ARGUMENT-CANDIDATES", 4, 2, false);
		declareFunction("uia_precisify_argument_candidates_subsumption_preds", "UIA-PRECISIFY-ARGUMENT-CANDIDATES-SUBSUMPTION-PREDS", 2, 0, false);
		declareFunction("uia_precisify_argument_candidates_subsumption_pred_for_pred", "UIA-PRECISIFY-ARGUMENT-CANDIDATES-SUBSUMPTION-PRED-FOR-PRED", 2, 0, false);
		declareFunction("uia_typed_replacement_sentences", "UIA-TYPED-REPLACEMENT-SENTENCES", 2, 1, false);
		declareFunction("uia_typed_specializations_for_term", "UIA-TYPED-SPECIALIZATIONS-FOR-TERM", 2, 1, false);
		declareFunction("uia_analogous_sentences", "UIA-ANALOGOUS-SENTENCES", 3, 1, false);
		declareFunction("uia_analogous_sentences_memoized_internal", "UIA-ANALOGOUS-SENTENCES-MEMOIZED-INTERNAL", 3, 0, false);
		declareFunction("uia_analogous_sentences_memoized", "UIA-ANALOGOUS-SENTENCES-MEMOIZED", 3, 0, false);
		declareFunction("uia_salient_descriptor_mod_string", "UIA-SALIENT-DESCRIPTOR-MOD-STRING", 1, 0, false);
		declareFunction("uia_salient_descriptor_single_entry_varP", "UIA-SALIENT-DESCRIPTOR-SINGLE-ENTRY-VAR?", 3, 1, false);
		declareFunction("uia_deprecate_salient_descriptor_rule_spec", "UIA-DEPRECATE-SALIENT-DESCRIPTOR-RULE-SPEC", 2, 0, false);
		declareFunction("uia_deprecate_salient_descriptor_rule_assertion", "UIA-DEPRECATE-SALIENT-DESCRIPTOR-RULE-ASSERTION", 2, 0, false);
		declareFunction("uia_existentially_bind", "UIA-EXISTENTIALLY-BIND", 2, 0, false);
		declareFunction("uia_existentially_unbind", "UIA-EXISTENTIALLY-UNBIND", 2, 0, false);
		declareFunction("uia_salient_generalization", "UIA-SALIENT-GENERALIZATION", 2, 0, false);
		declareFunction("uia_salient_generalizations", "UIA-SALIENT-GENERALIZATIONS", 2, 0, false);
		declareFunction("uia_reformulate_assert_sentence", "UIA-REFORMULATE-ASSERT-SENTENCE", 2, 1, false);
		declareFunction("uia_reformulate_assert_sentence_memoized_internal", "UIA-REFORMULATE-ASSERT-SENTENCE-MEMOIZED-INTERNAL", 2, 0, false);
		declareFunction("uia_reformulate_assert_sentence_memoized", "UIA-REFORMULATE-ASSERT-SENTENCE-MEMOIZED", 2, 0, false);
		declareFunction("uia_reformulate_query_sentence", "UIA-REFORMULATE-QUERY-SENTENCE", 2, 1, false);
		declareFunction("uia_reformulate_query_sentence_memoized_internal", "UIA-REFORMULATE-QUERY-SENTENCE-MEMOIZED-INTERNAL", 2, 0, false);
		declareFunction("uia_reformulate_query_sentence_memoized", "UIA-REFORMULATE-QUERY-SENTENCE-MEMOIZED", 2, 0, false);
		declareFunction("uia_reformulate_sentence", "UIA-REFORMULATE-SENTENCE", 2, 1, false);
		declareFunction("uia_reformulate_sentence_memoized_internal", "UIA-REFORMULATE-SENTENCE-MEMOIZED-INTERNAL", 2, 0, false);
		declareFunction("uia_reformulate_sentence_memoized", "UIA-REFORMULATE-SENTENCE-MEMOIZED", 2, 0, false);
		declareFunction("uia_assert", "UIA-ASSERT", 2, 1, false);
		declareFunction("uia_assert_exact", "UIA-ASSERT-EXACT", 2, 1, false);
		declareFunction("uia_import_potentially_redundant_assertion", "UIA-IMPORT-POTENTIALLY-REDUNDANT-ASSERTION", 2, 1, false);
		declareFunction("uia_commented_assert_exact", "UIA-COMMENTED-ASSERT-EXACT", 2, 1, false);
		declareFunction("uia_hypothesize_exact", "UIA-HYPOTHESIZE-EXACT", 2, 1, false);
		declareFunction("uia_mark_term_as_contextual", "UIA-MARK-TERM-AS-CONTEXTUAL", 2, 1, false);
		declareFunction("uia_commented_hypothesize_exact", "UIA-COMMENTED-HYPOTHESIZE-EXACT", 2, 1, false);
		declareFunction("uia_check_additional_rules", "UIA-CHECK-ADDITIONAL-RULES", 2, 0, false);
		declareFunction("uia_check_additional_rules_generic", "UIA-CHECK-ADDITIONAL-RULES-GENERIC", 1, 0, false);
		declareFunction("uiat_addrule_check_fetch_additional_rules", "UIAT-ADDRULE-CHECK-FETCH-ADDITIONAL-RULES", 1, 0, false);
		declareFunction("uiat_addrule_localize_assertion", "UIAT-ADDRULE-LOCALIZE-ASSERTION", 2, 0, false);
		declareFunction("uiat_addrule_mentions_uia_interaction_mt_p", "UIAT-ADDRULE-MENTIONS-UIA-INTERACTION-MT-P", 1, 0, false);
		declareFunction("uiat_addrule_mentions_interaction_mt_p", "UIAT-ADDRULE-MENTIONS-INTERACTION-MT-P", 1, 0, false);
		declareFunction("uiat_addrule_check_apply_additional_rules", "UIAT-ADDRULE-CHECK-APPLY-ADDITIONAL-RULES", 3, 0, false);
		declareFunction("uia_unassert", "UIA-UNASSERT", 2, 0, false);
		declareFunction("uia_unassertibleP", "UIA-UNASSERTIBLE?", 2, 0, false);
		declareFunction("uia_unassert_all", "UIA-UNASSERT-ALL", 1, 0, false);
		declareFunction("uia_edit_assertion", "UIA-EDIT-ASSERTION", 3, 0, false);
		declareFunction("uia_kill", "UIA-KILL", 2, 0, false);
		declareFunction("uia_expunge_term_references", "UIA-EXPUNGE-TERM-REFERENCES", 2, 0, false);
		declareFunction("uia_salient_template_topics_for_term", "UIA-SALIENT-TEMPLATE-TOPICS-FOR-TERM", 2, 1, false);
		declareFunction("uia_salient_template_topics_for_instance", "UIA-SALIENT-TEMPLATE-TOPICS-FOR-INSTANCE", 2, 1, false);
		declareFunction("uia_salient_template_topics_for_collection", "UIA-SALIENT-TEMPLATE-TOPICS-FOR-COLLECTION", 2, 1, false);
		declareFunction("uia_available_template_topic_name", "UIA-AVAILABLE-TEMPLATE-TOPIC-NAME", 1, 0, false);
		declareFunction("uia_available_template_topic_isas", "UIA-AVAILABLE-TEMPLATE-TOPIC-ISAS", 1, 1, false);
		declareFunction("uia_available_template_topic_genls", "UIA-AVAILABLE-TEMPLATE-TOPIC-GENLS", 1, 1, false);
		declareFunction("uia_find_assertions", "UIA-FIND-ASSERTIONS", 2, 1, false);
		declareFunction("uia_find_assertions_memoized_internal", "UIA-FIND-ASSERTIONS-MEMOIZED-INTERNAL", 2, 0, false);
		declareFunction("uia_find_assertions_memoized", "UIA-FIND-ASSERTIONS-MEMOIZED", 2, 0, false);
		declareFunction("uia_wftP", "UIA-WFT?", 2, 1, false);
		declareFunction("uia_wft_memoized_internal", "UIA-WFT-MEMOIZED-INTERNAL", 2, 0, false);
		declareFunction("uia_wft_memoized", "UIA-WFT-MEMOIZED", 2, 0, false);
		declareFunction("uia_forget_previous_results_for_wftP", "UIA-FORGET-PREVIOUS-RESULTS-FOR-WFT?", 1, 0, false);
		declareFunction("uia_wffP", "UIA-WFF?", 2, 1, false);
		declareFunction("uia_wff_memoized_internal", "UIA-WFF-MEMOIZED-INTERNAL", 2, 0, false);
		declareFunction("uia_wff_memoized", "UIA-WFF-MEMOIZED", 2, 0, false);
		declareFunction("uia_forget_previous_results_for_wffP", "UIA-FORGET-PREVIOUS-RESULTS-FOR-WFF?", 1, 0, false);
		declareFunction("uia_why_not_wft", "UIA-WHY-NOT-WFT", 2, 1, false);
		declareFunction("uia_why_not_wft_memoized_internal", "UIA-WHY-NOT-WFT-MEMOIZED-INTERNAL", 2, 0, false);
		declareFunction("uia_why_not_wft_memoized", "UIA-WHY-NOT-WFT-MEMOIZED", 2, 0, false);
		declareFunction("uia_forget_previous_results_for_why_not_wft", "UIA-FORGET-PREVIOUS-RESULTS-FOR-WHY-NOT-WFT", 1, 0, false);
		declareFunction("uia_why_not_wff", "UIA-WHY-NOT-WFF", 2, 1, false);
		declareFunction("uia_why_not_wff_memoized_internal", "UIA-WHY-NOT-WFF-MEMOIZED-INTERNAL", 2, 0, false);
		declareFunction("uia_why_not_wff_memoized", "UIA-WHY-NOT-WFF-MEMOIZED", 2, 0, false);
		declareFunction("uia_why_not_wff_english", "UIA-WHY-NOT-WFF-ENGLISH", 2, 2, false);
		declareFunction("uia_why_not_wff_english_memoized_internal", "UIA-WHY-NOT-WFF-ENGLISH-MEMOIZED-INTERNAL", 3, 0, false);
		declareFunction("uia_why_not_wff_english_memoized", "UIA-WHY-NOT-WFF-ENGLISH-MEMOIZED", 3, 0, false);
		declareFunction("uia_forget_previous_results_for_why_not_wff", "UIA-FORGET-PREVIOUS-RESULTS-FOR-WHY-NOT-WFF", 1, 0, false);
		declareFunction("uia_wff_compliantP", "UIA-WFF-COMPLIANT?", 2, 1, false);
		declareFunction("uia_wff_compliant_memoized_internal", "UIA-WFF-COMPLIANT-MEMOIZED-INTERNAL", 2, 0, false);
		declareFunction("uia_wff_compliant_memoized", "UIA-WFF-COMPLIANT-MEMOIZED", 2, 0, false);
		declareFunction("uia_forget_previous_results_for_wff_compliantP", "UIA-FORGET-PREVIOUS-RESULTS-FOR-WFF-COMPLIANT?", 1, 0, false);
		declareFunction("uia_why_not_wff_compliant", "UIA-WHY-NOT-WFF-COMPLIANT", 2, 1, false);
		declareFunction("uia_why_not_wff_compliant_memoized_internal", "UIA-WHY-NOT-WFF-COMPLIANT-MEMOIZED-INTERNAL", 2, 0, false);
		declareFunction("uia_why_not_wff_compliant_memoized", "UIA-WHY-NOT-WFF-COMPLIANT-MEMOIZED", 2, 0, false);
		declareFunction("uia_forget_previous_results_for_why_not_wff_compliant", "UIA-FORGET-PREVIOUS-RESULTS-FOR-WHY-NOT-WFF-COMPLIANT", 1, 0, false);
		declareFunction("uia_assertible_compliantP", "UIA-ASSERTIBLE-COMPLIANT?", 2, 1, false);
		declareFunction("uia_assertible_compliant_memoized_internal", "UIA-ASSERTIBLE-COMPLIANT-MEMOIZED-INTERNAL", 2, 0, false);
		declareFunction("uia_assertible_compliant_memoized", "UIA-ASSERTIBLE-COMPLIANT-MEMOIZED", 2, 0, false);
		declareFunction("uia_forget_previous_results_for_assertible_compliantP", "UIA-FORGET-PREVIOUS-RESULTS-FOR-ASSERTIBLE-COMPLIANT?", 1, 0, false);
		declareFunction("uia_why_not_assertible_compliant", "UIA-WHY-NOT-ASSERTIBLE-COMPLIANT", 2, 1, false);
		declareFunction("uia_why_not_assertible_compliant_memoized_internal", "UIA-WHY-NOT-ASSERTIBLE-COMPLIANT-MEMOIZED-INTERNAL", 2, 0, false);
		declareFunction("uia_why_not_assertible_compliant_memoized", "UIA-WHY-NOT-ASSERTIBLE-COMPLIANT-MEMOIZED", 2, 0, false);
		declareFunction("uia_why_not_assertible_compliant_unmemoized", "UIA-WHY-NOT-ASSERTIBLE-COMPLIANT-UNMEMOIZED", 2, 0, false);
		declareFunction("uia_supports_for_why_not_wff", "UIA-SUPPORTS-FOR-WHY-NOT-WFF", 2, 0, false);
		declareFunction("uia_wff_violations", "UIA-WFF-VIOLATIONS", 2, 0, false);
		declareFunction("uia_forget_previous_results_for_why_not_assertible_compliant", "UIA-FORGET-PREVIOUS-RESULTS-FOR-WHY-NOT-ASSERTIBLE-COMPLIANT", 1, 0, false);
		declareFunction("uia_why_not_assertible", "UIA-WHY-NOT-ASSERTIBLE", 2, 1, false);
		declareFunction("uia_why_not_assertible_memoized_internal", "UIA-WHY-NOT-ASSERTIBLE-MEMOIZED-INTERNAL", 2, 0, false);
		declareFunction("uia_why_not_assertible_memoized", "UIA-WHY-NOT-ASSERTIBLE-MEMOIZED", 2, 0, false);
		declareFunction("uia_forget_previous_results_for_why_not_assertible", "UIA-FORGET-PREVIOUS-RESULTS-FOR-WHY-NOT-ASSERTIBLE", 1, 0, false);
		declareFunction("uia_meta_supports", "UIA-META-SUPPORTS", 1, 0, false);
		declareFunction("uia_assertion_supports", "UIA-ASSERTION-SUPPORTS", 1, 0, false);
		declareFunction("uia_sub_isomorphic_assertions_into_supports", "UIA-SUB-ISOMORPHIC-ASSERTIONS-INTO-SUPPORTS", 1, 0, false);
		declareFunction("uia_hl_support_with_isomorphic_assertionP", "UIA-HL-SUPPORT-WITH-ISOMORPHIC-ASSERTION?", 1, 0, false);
		declareFunction("uia_invalid_supportsP", "UIA-INVALID-SUPPORTS?", 1, 0, false);
		declareFunction("uia_invalid_supportP", "UIA-INVALID-SUPPORT?", 1, 0, false);
		declareFunction("isa_supportP", "ISA-SUPPORT?", 1, 0, false);
		declareFunction("genls_supportP", "GENLS-SUPPORT?", 1, 0, false);
		declareFunction("isa_supports", "ISA-SUPPORTS", 1, 0, false);
		declareFunction("not_isa_supportP", "NOT-ISA-SUPPORT?", 1, 0, false);
		declareFunction("not_isa_supports", "NOT-ISA-SUPPORTS", 1, 0, false);
		declareFunction("uia_supports_for_disjoint_support", "UIA-SUPPORTS-FOR-DISJOINT-SUPPORT", 1, 0, false);
		declareFunction("isa_genls_type_violation_supportP", "ISA-GENLS-TYPE-VIOLATION-SUPPORT?", 1, 0, false);
		declareFunction("uia_admitted_argumentP", "UIA-ADMITTED-ARGUMENT?", 4, 1, false);
		declareFunction("uia_admitted_argument_memoizedP_internal", "UIA-ADMITTED-ARGUMENT-MEMOIZED?-INTERNAL", 4, 0, false);
		declareFunction("uia_admitted_argument_memoizedP", "UIA-ADMITTED-ARGUMENT-MEMOIZED?", 4, 0, false);
		declareFunction("uia_inappropriate_sentenceP", "UIA-INAPPROPRIATE-SENTENCE?", 2, 1, false);
		declareFunction("uia_invalid_sentenceP", "UIA-INVALID-SENTENCE?", 2, 1, false);
		declareFunction("uia_invalid_sentence_memoizedP_internal", "UIA-INVALID-SENTENCE-MEMOIZED?-INTERNAL", 2, 0, false);
		declareFunction("uia_invalid_sentence_memoizedP", "UIA-INVALID-SENTENCE-MEMOIZED?", 2, 0, false);
		declareFunction("uia_knownP", "UIA-KNOWN?", 2, 1, false);
		declareFunction("uia_known_memoizedP_internal", "UIA-KNOWN-MEMOIZED?-INTERNAL", 2, 0, false);
		declareFunction("uia_known_memoizedP", "UIA-KNOWN-MEMOIZED?", 2, 0, false);
		declareFunction("uia_justify", "UIA-JUSTIFY", 2, 1, false);
		declareFunction("uia_justify_memoized_internal", "UIA-JUSTIFY-MEMOIZED-INTERNAL", 2, 0, false);
		declareFunction("uia_justify_memoized", "UIA-JUSTIFY-MEMOIZED", 2, 0, false);
		declareFunction("uia_equalsP", "UIA-EQUALS?", 3, 1, false);
		declareFunction("equals_in_mtP", "EQUALS-IN-MT?", 3, 0, false);
		declareFunction("uia_wh_wordP", "UIA-WH-WORD?", 2, 0, false);
		declareFunction("uia_irrelevant_precision_suggestion_term", "UIA-IRRELEVANT-PRECISION-SUGGESTION-TERM", 2, 1, false);
		declareFunction("uia_irrelevant_precision_suggestion_term_memoizedP_internal", "UIA-IRRELEVANT-PRECISION-SUGGESTION-TERM-MEMOIZED?-INTERNAL", 2, 0, false);
		declareFunction("uia_irrelevant_precision_suggestion_term_memoizedP", "UIA-IRRELEVANT-PRECISION-SUGGESTION-TERM-MEMOIZED?", 2, 0, false);
		declareFunction("uia_irrelevant_precision_suggestion_term_fromP", "UIA-IRRELEVANT-PRECISION-SUGGESTION-TERM-FROM?", 3, 1, false);
		declareFunction("uia_irrelevant_precision_suggestion_term_from_memoizedP_internal", "UIA-IRRELEVANT-PRECISION-SUGGESTION-TERM-FROM-MEMOIZED?-INTERNAL", 3, 0, false);
		declareFunction("uia_irrelevant_precision_suggestion_term_from_memoizedP", "UIA-IRRELEVANT-PRECISION-SUGGESTION-TERM-FROM-MEMOIZED?", 3, 0, false);
		declareFunction("uia_irrelevant_precision_suggestion_term_lambdaP", "UIA-IRRELEVANT-PRECISION-SUGGESTION-TERM-LAMBDA?", 1, 0, false);
		declareFunction("uia_sentence_has_irrelevant_precision_suggestion_termsP", "UIA-SENTENCE-HAS-IRRELEVANT-PRECISION-SUGGESTION-TERMS?", 2, 1, false);
		declareFunction("uia_irrelevant_arg_constraintP", "UIA-IRRELEVANT-ARG-CONSTRAINT?", 2, 1, false);
		declareFunction("uia_irrelevant_arg_constraint_memoizedP_internal", "UIA-IRRELEVANT-ARG-CONSTRAINT-MEMOIZED?-INTERNAL", 2, 0, false);
		declareFunction("uia_irrelevant_arg_constraint_memoizedP", "UIA-IRRELEVANT-ARG-CONSTRAINT-MEMOIZED?", 2, 0, false);
		declareFunction("uia_irrelevant_termP", "UIA-IRRELEVANT-TERM?", 2, 1, false);
		declareFunction("uia_irrelevant_term_memoizedP_internal", "UIA-IRRELEVANT-TERM-MEMOIZED?-INTERNAL", 2, 0, false);
		declareFunction("uia_irrelevant_term_memoizedP", "UIA-IRRELEVANT-TERM-MEMOIZED?", 2, 0, false);
		declareFunction("uia_filter_irrelevant_terms", "UIA-FILTER-IRRELEVANT-TERMS", 2, 1, false);
		declareFunction("uia_filter_irrelevant_terms_memoized", "UIA-FILTER-IRRELEVANT-TERMS-MEMOIZED", 2, 0, false);
		declareFunction("uia_partition_terms_by_relevancy", "UIA-PARTITION-TERMS-BY-RELEVANCY", 2, 1, false);
		declareFunction("uia_partition_terms_by_precision_relevancy", "UIA-PARTITION-TERMS-BY-PRECISION-RELEVANCY", 2, 1, false);
		declareFunction("uia_partition_terms_by_precision_relevancy_memoized", "UIA-PARTITION-TERMS-BY-PRECISION-RELEVANCY-MEMOIZED", 2, 2, false);
		declareFunction("uia_partition_terms_by_relevancy_memoized", "UIA-PARTITION-TERMS-BY-RELEVANCY-MEMOIZED", 2, 2, false);
		declareFunction("uia_irrelevant_formulaP", "UIA-IRRELEVANT-FORMULA?", 2, 1, false);
		declareFunction("uia_irrelevant_formula_memoizedP_internal", "UIA-IRRELEVANT-FORMULA-MEMOIZED?-INTERNAL", 2, 0, false);
		declareFunction("uia_irrelevant_formula_memoizedP", "UIA-IRRELEVANT-FORMULA-MEMOIZED?", 2, 0, false);
		declareFunction("uia_filter_irrelevant_formulas", "UIA-FILTER-IRRELEVANT-FORMULAS", 2, 1, false);
		declareFunction("uia_filter_irrelevant_formulas_memoized", "UIA-FILTER-IRRELEVANT-FORMULAS-MEMOIZED", 2, 0, false);
		declareFunction("uia_filter_ill_formed_formulas", "UIA-FILTER-ILL-FORMED-FORMULAS", 2, 1, false);
		declareFunction("uia_filter_ill_formed_formulas_memoized", "UIA-FILTER-ILL-FORMED-FORMULAS-MEMOIZED", 2, 0, false);
		declareFunction("uia_filter_irrelevant_or_ill_formed_formulas", "UIA-FILTER-IRRELEVANT-OR-ILL-FORMED-FORMULAS", 2, 1, false);
		declareFunction("uia_filter_irrelevant_or_ill_formed_formulas_memoized", "UIA-FILTER-IRRELEVANT-OR-ILL-FORMED-FORMULAS-MEMOIZED", 2, 0, false);
		declareFunction("uia_irrelevant_sentenceP", "UIA-IRRELEVANT-SENTENCE?", 2, 1, false);
		declareFunction("uia_irrelevant_sentence_memoizedP", "UIA-IRRELEVANT-SENTENCE-MEMOIZED?", 2, 0, false);
		declareFunction("uia_filter_irrelevant_sentences", "UIA-FILTER-IRRELEVANT-SENTENCES", 2, 1, false);
		declareFunction("uia_filter_irrelevant_sentences_memoized", "UIA-FILTER-IRRELEVANT-SENTENCES-MEMOIZED", 2, 0, false);
		declareFunction("uia_filter_invalid_sentences", "UIA-FILTER-INVALID-SENTENCES", 2, 1, false);
		declareFunction("uia_filter_invalid_sentences_memoized", "UIA-FILTER-INVALID-SENTENCES-MEMOIZED", 2, 0, false);
		declareFunction("uia_filter_invalid_args_for_pred", "UIA-FILTER-INVALID-ARGS-FOR-PRED", 4, 1, false);
		declareFunction("uia_filter_irrelevant_or_ill_formed_sentences", "UIA-FILTER-IRRELEVANT-OR-ILL-FORMED-SENTENCES", 2, 1, false);
		declareFunction("uia_filter_irrelevant_or_ill_formed_sentences_memoized", "UIA-FILTER-IRRELEVANT-OR-ILL-FORMED-SENTENCES-MEMOIZED", 2, 0, false);
		declareFunction("uia_filter_irrelevant_or_invalid_sentences", "UIA-FILTER-IRRELEVANT-OR-INVALID-SENTENCES", 2, 1, false);
		declareFunction("uia_filter_irrelevant_or_invalid_sentences_memoized", "UIA-FILTER-IRRELEVANT-OR-INVALID-SENTENCES-MEMOIZED", 2, 0, false);
		declareFunction("uia_sort_terms", "UIA-SORT-TERMS", 2, 2, false);
		declareFunction("uia_sort_terms_memoized_internal", "UIA-SORT-TERMS-MEMOIZED-INTERNAL", 3, 0, false);
		declareFunction("uia_sort_terms_memoized", "UIA-SORT-TERMS-MEMOIZED", 3, 0, false);
		declareFunction("uia_sort_terms_key", "UIA-SORT-TERMS-KEY", 1, 0, false);
		declareFunction("uia_forts_and_non_forts", "UIA-FORTS-AND-NON-FORTS", 1, 0, false);
		declareFunction("uia_sort_sentences", "UIA-SORT-SENTENCES", 2, 2, false);
		declareFunction("uia_sort_sentences_memoized_internal", "UIA-SORT-SENTENCES-MEMOIZED-INTERNAL", 3, 0, false);
		declareFunction("uia_sort_sentences_memoized", "UIA-SORT-SENTENCES-MEMOIZED", 3, 0, false);
		declareFunction("uia_sort_sentences_key", "UIA-SORT-SENTENCES-KEY", 1, 0, false);
		declareFunction("uia_domain_example_predicates", "UIA-DOMAIN-EXAMPLE-PREDICATES", 1, 1, false);
		declareFunction("uia_domain_example_predicates_already_memoized", "UIA-DOMAIN-EXAMPLE-PREDICATES-ALREADY-MEMOIZED", 1, 1, false);
		declareFunction("uia_domain_example_predicates_memoized_internal", "UIA-DOMAIN-EXAMPLE-PREDICATES-MEMOIZED-INTERNAL", 2, 0, false);
		declareFunction("uia_domain_example_predicates_memoized", "UIA-DOMAIN-EXAMPLE-PREDICATES-MEMOIZED", 2, 0, false);
		declareFunction("uia_predicate_selector", "UIA-PREDICATE-SELECTOR", 3, 1, false);
		declareFunction("uia_predicate_selector_memoized_internal", "UIA-PREDICATE-SELECTOR-MEMOIZED-INTERNAL", 3, 0, false);
		declareFunction("uia_predicate_selector_memoized", "UIA-PREDICATE-SELECTOR-MEMOIZED", 3, 0, false);
		declareFunction("uia_predicate_filter", "UIA-PREDICATE-FILTER", 3, 1, false);
		declareFunction("uia_predicate_filter_memoized_internal", "UIA-PREDICATE-FILTER-MEMOIZED-INTERNAL", 3, 0, false);
		declareFunction("uia_predicate_filter_memoized", "UIA-PREDICATE-FILTER-MEMOIZED", 3, 0, false);
		declareFunction("uia_predicate_example_sentence", "UIA-PREDICATE-EXAMPLE-SENTENCE", 2, 1, false);
		declareFunction("uia_all_predicate_example_sentences", "UIA-ALL-PREDICATE-EXAMPLE-SENTENCES", 2, 1, false);
		declareFunction("uia_all_predicate_example_sentences_memoized_internal", "UIA-ALL-PREDICATE-EXAMPLE-SENTENCES-MEMOIZED-INTERNAL", 2, 0, false);
		declareFunction("uia_all_predicate_example_sentences_memoized", "UIA-ALL-PREDICATE-EXAMPLE-SENTENCES-MEMOIZED", 2, 0, false);
		declareFunction("uia_predicates_to_example_sentences", "UIA-PREDICATES-TO-EXAMPLE-SENTENCES", 2, 1, false);
		declareFunction("uia_predicate_general_utility", "UIA-PREDICATE-GENERAL-UTILITY", 2, 1, false);
		declareFunction("uia_predicate_general_utility_memoized_internal", "UIA-PREDICATE-GENERAL-UTILITY-MEMOIZED-INTERNAL", 2, 0, false);
		declareFunction("uia_predicate_general_utility_memoized", "UIA-PREDICATE-GENERAL-UTILITY-MEMOIZED", 2, 0, false);
		declareFunction("uia_predicate_indicators", "UIA-PREDICATE-INDICATORS", 2, 2, false);
		declareFunction("uia_predicate_indicators_memoized_internal", "UIA-PREDICATE-INDICATORS-MEMOIZED-INTERNAL", 3, 0, false);
		declareFunction("uia_predicate_indicators_memoized", "UIA-PREDICATE-INDICATORS-MEMOIZED", 3, 0, false);
		declareFunction("uia_predicate_closeness_score", "UIA-PREDICATE-CLOSENESS-SCORE", 3, 2, false);
		declareFunction("uia_organize_predicates_by_specificity_to_term", "UIA-ORGANIZE-PREDICATES-BY-SPECIFICITY-TO-TERM", 3, 1, false);
		declareFunction("uia_organize_predicates_by_specificity_to_term_memoized_internal", "UIA-ORGANIZE-PREDICATES-BY-SPECIFICITY-TO-TERM-MEMOIZED-INTERNAL", 3, 0, false);
		declareFunction("uia_organize_predicates_by_specificity_to_term_memoized", "UIA-ORGANIZE-PREDICATES-BY-SPECIFICITY-TO-TERM-MEMOIZED", 3, 0, false);
		declareFunction("uia_organize_predicates_by_specificity_of_args", "UIA-ORGANIZE-PREDICATES-BY-SPECIFICITY-OF-ARGS", 2, 1, false);
		declareFunction("uia_organize_predicates_by_specificity_of_args_memoized_internal", "UIA-ORGANIZE-PREDICATES-BY-SPECIFICITY-OF-ARGS-MEMOIZED-INTERNAL", 2, 0, false);
		declareFunction("uia_organize_predicates_by_specificity_of_args_memoized", "UIA-ORGANIZE-PREDICATES-BY-SPECIFICITY-OF-ARGS-MEMOIZED", 2, 0, false);
		declareFunction("uia_organize_predicates_by_mt", "UIA-ORGANIZE-PREDICATES-BY-MT", 2, 0, false);
		declareFunction("uia_organize_predicates_by_mt_memoized_internal", "UIA-ORGANIZE-PREDICATES-BY-MT-MEMOIZED-INTERNAL", 1, 0, false);
		declareFunction("uia_organize_predicates_by_mt_memoized", "UIA-ORGANIZE-PREDICATES-BY-MT-MEMOIZED", 1, 0, false);
		declareFunction("uia_organize_predicates_by_similarity", "UIA-ORGANIZE-PREDICATES-BY-SIMILARITY", 2, 1, false);
		declareFunction("uia_organize_predicates_by_similarity_memoized_internal", "UIA-ORGANIZE-PREDICATES-BY-SIMILARITY-MEMOIZED-INTERNAL", 2, 0, false);
		declareFunction("uia_organize_predicates_by_similarity_memoized", "UIA-ORGANIZE-PREDICATES-BY-SIMILARITY-MEMOIZED", 2, 0, false);
		declareFunction("uia_organize_predicate_matches_by_collection", "UIA-ORGANIZE-PREDICATE-MATCHES-BY-COLLECTION", 2, 0, false);
		declareFunction("uia_organize_predicate_matches_by_collection_memoized_internal", "UIA-ORGANIZE-PREDICATE-MATCHES-BY-COLLECTION-MEMOIZED-INTERNAL", 1, 0, false);
		declareFunction("uia_organize_predicate_matches_by_collection_memoized", "UIA-ORGANIZE-PREDICATE-MATCHES-BY-COLLECTION-MEMOIZED", 1, 0, false);
		declareFunction("uia_sentence_has_variations", "UIA-SENTENCE-HAS-VARIATIONS", 2, 1, false);
		declareFunction("uia_sentence_has_variations_memoized_internal", "UIA-SENTENCE-HAS-VARIATIONS-MEMOIZED-INTERNAL", 2, 0, false);
		declareFunction("uia_sentence_has_variations_memoized", "UIA-SENTENCE-HAS-VARIATIONS-MEMOIZED", 2, 0, false);
		declareFunction("uia_sentence_variations", "UIA-SENTENCE-VARIATIONS", 2, 1, false);
		declareFunction("uia_sentence_variations_memoized_internal", "UIA-SENTENCE-VARIATIONS-MEMOIZED-INTERNAL", 2, 0, false);
		declareFunction("uia_sentence_variations_memoized", "UIA-SENTENCE-VARIATIONS-MEMOIZED", 2, 0, false);
		declareFunction("uia_build_spec_predicate_graph", "UIA-BUILD-SPEC-PREDICATE-GRAPH", 2, 1, false);
		declareFunction("uia_build_spec_predicate_graph_memoized_internal", "UIA-BUILD-SPEC-PREDICATE-GRAPH-MEMOIZED-INTERNAL", 2, 0, false);
		declareFunction("uia_build_spec_predicate_graph_memoized", "UIA-BUILD-SPEC-PREDICATE-GRAPH-MEMOIZED", 2, 0, false);
		declareFunction("uia_interpret_spec_predicate_graph", "UIA-INTERPRET-SPEC-PREDICATE-GRAPH", 4, 1, false);
		declareFunction("uia_interpret_spec_predicate_graph_memoized_internal", "UIA-INTERPRET-SPEC-PREDICATE-GRAPH-MEMOIZED-INTERNAL", 4, 0, false);
		declareFunction("uia_interpret_spec_predicate_graph_memoized", "UIA-INTERPRET-SPEC-PREDICATE-GRAPH-MEMOIZED", 4, 0, false);
		declareFunction("uia_count_spec_predicate_sub_graphs", "UIA-COUNT-SPEC-PREDICATE-SUB-GRAPHS", 2, 0, false);
		declareFunction("uia_create_concept", "UIA-CREATE-CONCEPT", 3, 1, false);
		declareFunction("uia_create_named_concept", "UIA-CREATE-NAMED-CONCEPT", 3, 0, false);
		declareFunction("uia_reparse_unknown_term", "UIA-REPARSE-UNKNOWN-TERM", 4, 0, false);
		declareFunction("uia_example_queries", "UIA-EXAMPLE-QUERIES", 1, 0, false);
		declareFunction("uia_example_queries_already_memoized", "UIA-EXAMPLE-QUERIES-ALREADY-MEMOIZED", 1, 0, false);
		declareFunction("uia_example_queries_memoized_internal", "UIA-EXAMPLE-QUERIES-MEMOIZED-INTERNAL", 1, 0, false);
		declareFunction("uia_example_queries_memoized", "UIA-EXAMPLE-QUERIES-MEMOIZED", 1, 0, false);
		declareFunction("uia_example_term_queries", "UIA-EXAMPLE-TERM-QUERIES", 2, 0, false);
		declareFunction("uia_example_term_queries_memoized_internal", "UIA-EXAMPLE-TERM-QUERIES-MEMOIZED-INTERNAL", 2, 0, false);
		declareFunction("uia_example_term_queries_memoized", "UIA-EXAMPLE-TERM-QUERIES-MEMOIZED", 2, 0, false);
		declareFunction("uia_test_questions_for_term", "UIA-TEST-QUESTIONS-FOR-TERM", 2, 0, false);
		declareFunction("uia_test_questions_for_term_memoized_internal", "UIA-TEST-QUESTIONS-FOR-TERM-MEMOIZED-INTERNAL", 2, 0, false);
		declareFunction("uia_test_questions_for_term_memoized", "UIA-TEST-QUESTIONS-FOR-TERM-MEMOIZED", 2, 0, false);
		declareFunction("uia_collectionP", "UIA-COLLECTION?", 2, 0, false);
		declareFunction("uia_enumerate_sme_owned_processes", "UIA-ENUMERATE-SME-OWNED-PROCESSES", 0, 1, false);
		declareFunction("is_sme_term_in_mtP", "IS-SME-TERM-IN-MT?", 2, 0, false);
		declareFunction("uia_maybe_initialize_definitional_preds", "UIA-MAYBE-INITIALIZE-DEFINITIONAL-PREDS", 0, 0, false);
		declareFunction("uia_initialize_definitional_preds", "UIA-INITIALIZE-DEFINITIONAL-PREDS", 0, 0, false);
		declareFunction("uia_defining_assertion_p", "UIA-DEFINING-ASSERTION-P", 1, 0, false);
		declareFunction("uia_classify_fort", "UIA-CLASSIFY-FORT", 3, 1, false);
		declareFunction("uia_classify_fort_memoized_internal", "UIA-CLASSIFY-FORT-MEMOIZED-INTERNAL", 3, 0, false);
		declareFunction("uia_classify_fort_memoized", "UIA-CLASSIFY-FORT-MEMOIZED", 3, 0, false);
		declareFunction("uia_classify_fort_set", "UIA-CLASSIFY-FORT-SET", 3, 1, false);
		declareFunction("uia_classify_fort_set_memoized_internal", "UIA-CLASSIFY-FORT-SET-MEMOIZED-INTERNAL", 3, 0, false);
		declareFunction("uia_classify_fort_set_memoized", "UIA-CLASSIFY-FORT-SET-MEMOIZED", 3, 0, false);
		declareFunction("uia_classify_sentence", "UIA-CLASSIFY-SENTENCE", 3, 1, false);
		declareFunction("uia_classify_sentence_memoized_internal", "UIA-CLASSIFY-SENTENCE-MEMOIZED-INTERNAL", 3, 0, false);
		declareFunction("uia_classify_sentence_memoized", "UIA-CLASSIFY-SENTENCE-MEMOIZED", 3, 0, false);
		declareFunction("uia_classify_assertion", "UIA-CLASSIFY-ASSERTION", 3, 1, false);
		declareFunction("uia_classify_assertion_memoized_internal", "UIA-CLASSIFY-ASSERTION-MEMOIZED-INTERNAL", 3, 0, false);
		declareFunction("uia_classify_assertion_memoized", "UIA-CLASSIFY-ASSERTION-MEMOIZED", 3, 0, false);
		declareFunction("uia_classify_sentence_set", "UIA-CLASSIFY-SENTENCE-SET", 3, 1, false);
		declareFunction("uia_classify_sentence_set_memoized_internal", "UIA-CLASSIFY-SENTENCE-SET-MEMOIZED-INTERNAL", 3, 0, false);
		declareFunction("uia_classify_sentence_set_memoized", "UIA-CLASSIFY-SENTENCE-SET-MEMOIZED", 3, 0, false);
		declareFunction("uia_classify_assertion_set", "UIA-CLASSIFY-ASSERTION-SET", 3, 1, false);
		declareFunction("uia_classify_assertion_set_memoized_internal", "UIA-CLASSIFY-ASSERTION-SET-MEMOIZED-INTERNAL", 3, 0, false);
		declareFunction("uia_classify_assertion_set_memoized", "UIA-CLASSIFY-ASSERTION-SET-MEMOIZED", 3, 0, false);
		declareFunction("uia_classify_assertion_set_precise", "UIA-CLASSIFY-ASSERTION-SET-PRECISE", 3, 1, false);
		declareFunction("uia_get_ordering_categories", "UIA-GET-ORDERING-CATEGORIES", 2, 1, false);
		declareFunction("uia_get_ordering_categories_memoized_internal", "UIA-GET-ORDERING-CATEGORIES-MEMOIZED-INTERNAL", 2, 0, false);
		declareFunction("uia_get_ordering_categories_memoized", "UIA-GET-ORDERING-CATEGORIES-MEMOIZED", 2, 0, false);
		declareFunction("uia_get_ordering_categories_from_classifier", "UIA-GET-ORDERING-CATEGORIES-FROM-CLASSIFIER", 2, 1, false);
		declareFunction("uia_get_ordering_categories_from_classifier_memoized_internal", "UIA-GET-ORDERING-CATEGORIES-FROM-CLASSIFIER-MEMOIZED-INTERNAL", 2, 0, false);
		declareFunction("uia_get_ordering_categories_from_classifier_memoized", "UIA-GET-ORDERING-CATEGORIES-FROM-CLASSIFIER-MEMOIZED", 2, 0, false);
		declareFunction("uia_best_defining_mt_for_fort_and_sentence", "UIA-BEST-DEFINING-MT-FOR-FORT-AND-SENTENCE", 3, 0, false);
		declareFunction("uia_best_defining_mt_for_fort", "UIA-BEST-DEFINING-MT-FOR-FORT", 2, 0, false);
		return NIL;
	}

	public static final SubLObject init_uia_trampolines_file() {
		defparameter("*UIA-DEFAULT-PPH-FRAME*", $ONTOLOGY_BROWSER);
		defparameter("*UIA-DEFAULT-PPH-LINK-FUNCTION*", CB_UIAT_ONTOLOGY_BROWSER_FOCUSED_START_UNENCODED);
		defconstant("*UIA-MEMOIZED-PARAPHRASE-FUNCTIONS*", $list_alt35);
		deflexical("*UIA-HYPOTHESIZED-TERM-PREFIX*", $str_alt90$HYP_UIA);
		defparameter("*UIA-TEMPLATE-TOPIC-NAME-CONTEXT*", NIL);
		deflexical("*QUESTION-WORDS*", $list_alt141);
		defparameter("*UIA-IRRELEVANT-PRECISION-SUGGESTION-LAMBDA-MT*", NIL);
		defparameter("*UIA-IRRELEVANT-PRECISION-SUGGESTION-LAMBDA-AGENDA*", NIL);
		defparameter("*UIA-SORT-TERMS-GENERATION-MT*", NIL);
		defparameter("*UIA-SORT-TERMS-DOMAIN-MT*", NIL);
		defparameter("*UIA-SORT-SENTENCES-GENERATION-MT*", NIL);
		defparameter("*UIA-SORT-SENTENCES-DOMAIN-MT*", NIL);
		defvar("*UIA-DEFINITIONAL-PREDS*", NIL);
		return NIL;
	}

	public static final SubLObject setup_uia_trampolines_file() {
		memoization_state.note_memoized_function(UIA_PHRASE_CANDIDATE_TERMS_MEMOIZED);
		memoization_state.note_memoized_function(UIA_PHRASE_CANDIDATE_TERMS_IN_SENTENCE_MEMOIZED);
		memoization_state.note_memoized_function(UIA_PHRASES_CANDIDATE_SENTENCES_REPLACING_TERMS_MEMOIZED);
		memoization_state.note_memoized_function(UIA_PARAPHRASE_CONSTRAINT_FOR_TERM_MEMOIZED);
		memoization_state.note_memoized_function(UIA_TERM_PHRASE_MEMOIZED);
		memoization_state.note_memoized_function(UIA_TERM_PHRASE_PRECISE_MEMOIZED);
		memoization_state.note_memoized_function(UIA_SENTENCE_PHRASE_MEMOIZED);
		memoization_state.note_memoized_function(UIA_SENTENCE_PHRASE_PRECISE_MEMOIZED);
		memoization_state.note_memoized_function(UIA_ALL_PHRASES_FOR_TERM_MEMOIZED);
		memoization_state.note_memoized_function(UIA_PHRASE_OUTPUT_LIST_MEMOIZED);
		memoization_state.note_memoized_function(UIA_HTML_SENTENCE_PHRASE_MEMOIZED);
		memoization_state.note_memoized_function(UIA_HTML_SENTENCE_PHRASE_PRECISE_MEMOIZED);
		memoization_state.note_memoized_function(UIA_QUERY_PHRASE_MEMOIZED);
		memoization_state.note_memoized_function(UIA_HTML_QUERY_PHRASE_MEMOIZED);
		memoization_state.note_memoized_function(UIA_IMPERATIVE_PHRASE_MEMOIZED);
		memoization_state.note_memoized_function(UIA_HTML_IMPERATIVE_PHRASE_MEMOIZED);
		memoization_state.note_memoized_function(UIA_TERMS_DISTINGUISHING_PHRASES_MEMOIZED);
		memoization_state.note_memoized_function(UIA_TERMS_DISTINGUISHING_SENTENCES_MEMOIZED);
		memoization_state.note_memoized_function(UIA_TERM_CLARIFYING_SENTENCES_MEMOIZED);
		memoization_state.note_memoized_function(UIA_TERMS_DISTINGUISHING_PICTURES_MEMOIZED);
		memoization_state.note_memoized_function(UIA_ARG_TYPE_SUMMARY_CYCL_FOR_PRED_MEMOIZED);
		memoization_state.note_memoized_function(UIA_SALIENT_ARGN_ISA_MEMOIZED);
		memoization_state.note_memoized_function(UIA_SUMMARY_SENTENCE_MEMOIZED);
		memoization_state.note_memoized_function(UIA_HTML_SUMMARY_SENTENCE_MEMOIZED);
		memoization_state.note_memoized_function(UIA_SUMMARIZE_MEMOIZED);
		memoization_state.note_memoized_function(UIA_SENTENCES_FOR_TERM_MEMOIZED);
		memoization_state.note_memoized_function(UIA_COMPARE_TERMS_MEMOIZED);
		memoization_state.note_memoized_function(UIA_RELATED_TERMS_MEMOIZED);
		memoization_state.note_memoized_function(UIA_CANDIDATE_SENTENCES_RELATING_TERMS_MEMOIZED);
		memoization_state.note_memoized_function(UIA_REJECTED_SENTENCE_MEMOIZED);
		memoization_state.note_memoized_function(UIA_REDUNDANT_SENTENCE_MEMOIZED);
		memoization_state.note_memoized_function(UIA_ANALOGOUS_SENTENCES_MEMOIZED);
		memoization_state.note_memoized_function(UIA_REFORMULATE_ASSERT_SENTENCE_MEMOIZED);
		memoization_state.note_memoized_function(UIA_REFORMULATE_QUERY_SENTENCE_MEMOIZED);
		memoization_state.note_memoized_function(UIA_REFORMULATE_SENTENCE_MEMOIZED);
		memoization_state.note_memoized_function(UIA_FIND_ASSERTIONS_MEMOIZED);
		memoization_state.note_memoized_function(UIA_WFT_MEMOIZED);
		memoization_state.note_memoized_function(UIA_WFF_MEMOIZED);
		memoization_state.note_memoized_function(UIA_WHY_NOT_WFT_MEMOIZED);
		memoization_state.note_memoized_function(UIA_WHY_NOT_WFF_MEMOIZED);
		memoization_state.note_memoized_function(UIA_WHY_NOT_WFF_ENGLISH_MEMOIZED);
		memoization_state.note_memoized_function(UIA_WFF_COMPLIANT_MEMOIZED);
		memoization_state.note_memoized_function(UIA_WHY_NOT_WFF_COMPLIANT_MEMOIZED);
		memoization_state.note_memoized_function(UIA_ASSERTIBLE_COMPLIANT_MEMOIZED);
		memoization_state.note_memoized_function(UIA_WHY_NOT_ASSERTIBLE_COMPLIANT_MEMOIZED);
		memoization_state.note_memoized_function(UIA_WHY_NOT_ASSERTIBLE_MEMOIZED);
		memoization_state.note_memoized_function($sym136$UIA_ADMITTED_ARGUMENT_MEMOIZED_);
		memoization_state.note_memoized_function($sym137$UIA_INVALID_SENTENCE_MEMOIZED_);
		memoization_state.note_memoized_function($sym138$UIA_KNOWN_MEMOIZED_);
		memoization_state.note_memoized_function(UIA_JUSTIFY_MEMOIZED);
		memoization_state.note_memoized_function($sym142$UIA_IRRELEVANT_PRECISION_SUGGESTION_TERM_MEMOIZED_);
		memoization_state.note_memoized_function($sym143$UIA_IRRELEVANT_PRECISION_SUGGESTION_TERM_FROM_MEMOIZED_);
		memoization_state.note_memoized_function($sym145$UIA_IRRELEVANT_ARG_CONSTRAINT_MEMOIZED_);
		memoization_state.note_memoized_function($sym146$UIA_IRRELEVANT_TERM_MEMOIZED_);
		memoization_state.note_memoized_function($sym147$UIA_IRRELEVANT_FORMULA_MEMOIZED_);
		memoization_state.note_memoized_function(UIA_SORT_TERMS_MEMOIZED);
		memoization_state.note_memoized_function(UIA_SORT_SENTENCES_MEMOIZED);
		memoization_state.note_memoized_function(UIA_DOMAIN_EXAMPLE_PREDICATES_MEMOIZED);
		memoization_state.note_memoized_function(UIA_PREDICATE_SELECTOR_MEMOIZED);
		memoization_state.note_memoized_function(UIA_PREDICATE_FILTER_MEMOIZED);
		memoization_state.note_memoized_function(UIA_ALL_PREDICATE_EXAMPLE_SENTENCES_MEMOIZED);
		memoization_state.note_memoized_function(UIA_PREDICATE_GENERAL_UTILITY_MEMOIZED);
		memoization_state.note_memoized_function(UIA_PREDICATE_INDICATORS_MEMOIZED);
		memoization_state.note_memoized_function(UIA_ORGANIZE_PREDICATES_BY_SPECIFICITY_TO_TERM_MEMOIZED);
		memoization_state.note_memoized_function(UIA_ORGANIZE_PREDICATES_BY_SPECIFICITY_OF_ARGS_MEMOIZED);
		memoization_state.note_memoized_function(UIA_ORGANIZE_PREDICATES_BY_MT_MEMOIZED);
		memoization_state.note_memoized_function(UIA_ORGANIZE_PREDICATES_BY_SIMILARITY_MEMOIZED);
		memoization_state.note_memoized_function(UIA_ORGANIZE_PREDICATE_MATCHES_BY_COLLECTION_MEMOIZED);
		memoization_state.note_memoized_function(UIA_SENTENCE_HAS_VARIATIONS_MEMOIZED);
		memoization_state.note_memoized_function(UIA_SENTENCE_VARIATIONS_MEMOIZED);
		memoization_state.note_memoized_function(UIA_BUILD_SPEC_PREDICATE_GRAPH_MEMOIZED);
		memoization_state.note_memoized_function(UIA_INTERPRET_SPEC_PREDICATE_GRAPH_MEMOIZED);
		memoization_state.note_memoized_function(UIA_EXAMPLE_QUERIES_MEMOIZED);
		memoization_state.note_memoized_function(UIA_EXAMPLE_TERM_QUERIES_MEMOIZED);
		memoization_state.note_memoized_function(UIA_TEST_QUESTIONS_FOR_TERM_MEMOIZED);
		memoization_state.note_memoized_function(UIA_CLASSIFY_FORT_MEMOIZED);
		memoization_state.note_memoized_function(UIA_CLASSIFY_FORT_SET_MEMOIZED);
		memoization_state.note_memoized_function(UIA_CLASSIFY_SENTENCE_MEMOIZED);
		memoization_state.note_memoized_function(UIA_CLASSIFY_ASSERTION_MEMOIZED);
		memoization_state.note_memoized_function(UIA_CLASSIFY_SENTENCE_SET_MEMOIZED);
		memoization_state.note_memoized_function(UIA_CLASSIFY_ASSERTION_SET_MEMOIZED);
		memoization_state.note_memoized_function(UIA_GET_ORDERING_CATEGORIES_MEMOIZED);
		memoization_state.note_memoized_function(UIA_GET_ORDERING_CATEGORIES_FROM_CLASSIFIER_MEMOIZED);
		return NIL;
	}

	private static final SubLSymbol UIA_PHRASE_CANDIDATE_TERMS_MEMOIZED = makeSymbol("UIA-PHRASE-CANDIDATE-TERMS-MEMOIZED");

	public static final SubLSymbol $kw2$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

	private static final SubLSymbol UIA_PHRASE_CANDIDATE_TERMS_IN_SENTENCE_MEMOIZED = makeSymbol("UIA-PHRASE-CANDIDATE-TERMS-IN-SENTENCE-MEMOIZED");

	private static final SubLSymbol UIA_PHRASES_CANDIDATE_SENTENCES_REPLACING_TERMS_MEMOIZED = makeSymbol("UIA-PHRASES-CANDIDATE-SENTENCES-REPLACING-TERMS-MEMOIZED");

	static private final SubLList $list_alt5 = list(list(makeSymbol("&OPTIONAL"), makeSymbol("FRAME-NAME")), makeSymbol("&BODY"), makeSymbol("BODY"));

	static private final SubLSymbol $sym6$TARGET = makeUninternedSymbol("TARGET");

	static private final SubLSymbol $sym7$FUNCTION = makeUninternedSymbol("FUNCTION");

	private static final SubLSymbol CB_FRAME_NAME = makeSymbol("CB-FRAME-NAME");

	static private final SubLList $list_alt11 = list(list(makeSymbol("UIA-GET-DEFAULT-PPH-FRAME-NAME")));

	static private final SubLList $list_alt12 = list(list(makeSymbol("UIA-GET-DEFAULT-PPH-LINK-FUNCTION")));

	private static final SubLSymbol WITH_PPH_HTML_FUNCTION_AND_TARGET = makeSymbol("WITH-PPH-HTML-FUNCTION-AND-TARGET");

	private static final SubLSymbol $ONTOLOGY_BROWSER = makeKeyword("ONTOLOGY-BROWSER");

	private static final SubLSymbol CB_UIAT_ONTOLOGY_BROWSER_FOCUSED_START_UNENCODED = makeSymbol("CB-UIAT-ONTOLOGY-BROWSER-FOCUSED-START-UNENCODED");

	private static final SubLSymbol CB_UIA_CONCEPT_CLARIFIER_FORT_ID = makeSymbol("CB-UIA-CONCEPT-CLARIFIER-FORT-ID");

	public static final SubLObject $$NounPhrase = constant_handles.reader_make_constant_shell(makeString("NounPhrase"));

	private static final SubLSymbol UIA_PARAPHRASE_CONSTRAINT_FOR_TERM_MEMOIZED = makeSymbol("UIA-PARAPHRASE-CONSTRAINT-FOR-TERM-MEMOIZED");

	public static final SubLObject $$nonPlural_Generic = constant_handles.reader_make_constant_shell(makeString("nonPlural-Generic"));

	static private final SubLString $$$defaultGenerationConstraint = makeString("defaultGenerationConstraint");

	public static final SubLObject $$TermParaphraseFn_Constrained = constant_handles.reader_make_constant_shell(makeString("TermParaphraseFn-Constrained"));

	static private final SubLList $list_alt27 = list(constant_handles.reader_make_constant_shell(makeString("TermParaphraseFn-Constrained")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"));

	private static final SubLSymbol UIA_TERM_PHRASE_MEMOIZED = makeSymbol("UIA-TERM-PHRASE-MEMOIZED");

	private static final SubLSymbol UIA_TERM_PHRASE_PRECISE_MEMOIZED = makeSymbol("UIA-TERM-PHRASE-PRECISE-MEMOIZED");

	private static final SubLSymbol UIA_SENTENCE_PHRASE_MEMOIZED = makeSymbol("UIA-SENTENCE-PHRASE-MEMOIZED");

	private static final SubLSymbol UIA_SENTENCE_PHRASE_PRECISE_MEMOIZED = makeSymbol("UIA-SENTENCE-PHRASE-PRECISE-MEMOIZED");

	private static final SubLSymbol UIA_ALL_PHRASES_FOR_TERM_MEMOIZED = makeSymbol("UIA-ALL-PHRASES-FOR-TERM-MEMOIZED");

	static private final SubLList $list_alt35 = list(new SubLObject[] { makeSymbol("UIA-TERM-PHRASE-MEMOIZED"), makeSymbol("UIA-TERM-PHRASE-PRECISE-MEMOIZED"), makeSymbol("UIA-SENTENCE-PHRASE-MEMOIZED"), makeSymbol("UIA-SENTENCE-PHRASE-PRECISE-MEMOIZED"), makeSymbol("UIA-PHRASE-OUTPUT-LIST-MEMOIZED"), makeSymbol("UIA-HTML-SENTENCE-PHRASE-MEMOIZED"), makeSymbol("UIA-HTML-SENTENCE-PHRASE-PRECISE-MEMOIZED"),
			makeSymbol("UIA-QUERY-PHRASE-MEMOIZED"), makeSymbol("UIA-HTML-QUERY-PHRASE-MEMOIZED"), makeSymbol("UIA-TERMS-DISTINGUISHING-PHRASES-MEMOIZED"), makeSymbol("UIA-ALL-PHRASES-FOR-TERM-MEMOIZED") });

	private static final SubLSymbol UIA_PHRASE_OUTPUT_LIST_MEMOIZED = makeSymbol("UIA-PHRASE-OUTPUT-LIST-MEMOIZED");

	private static final SubLSymbol UIA_HTML_SENTENCE_PHRASE_MEMOIZED = makeSymbol("UIA-HTML-SENTENCE-PHRASE-MEMOIZED");

	private static final SubLSymbol UIA_HTML_SENTENCE_PHRASE_PRECISE_MEMOIZED = makeSymbol("UIA-HTML-SENTENCE-PHRASE-PRECISE-MEMOIZED");

	static private final SubLString $str_alt40$Translating_sentences_ = makeString("Translating sentences.");

	private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

	private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

	private static final SubLSymbol UIA_QUERY_PHRASE_MEMOIZED = makeSymbol("UIA-QUERY-PHRASE-MEMOIZED");

	private static final SubLSymbol UIA_HTML_QUERY_PHRASE_MEMOIZED = makeSymbol("UIA-HTML-QUERY-PHRASE-MEMOIZED");

	private static final SubLSymbol UIA_IMPERATIVE_PHRASE_MEMOIZED = makeSymbol("UIA-IMPERATIVE-PHRASE-MEMOIZED");

	private static final SubLSymbol UIA_HTML_IMPERATIVE_PHRASE_MEMOIZED = makeSymbol("UIA-HTML-IMPERATIVE-PHRASE-MEMOIZED");

	private static final SubLSymbol UIA_TERMS_DISTINGUISHING_PHRASES_MEMOIZED = makeSymbol("UIA-TERMS-DISTINGUISHING-PHRASES-MEMOIZED");

	private static final SubLSymbol UIA_TERMS_DISTINGUISHING_SENTENCES_MEMOIZED = makeSymbol("UIA-TERMS-DISTINGUISHING-SENTENCES-MEMOIZED");

	private static final SubLSymbol UIA_TERM_CLARIFYING_SENTENCES_MEMOIZED = makeSymbol("UIA-TERM-CLARIFYING-SENTENCES-MEMOIZED");

	private static final SubLSymbol UIA_TERMS_DISTINGUISHING_PICTURES_MEMOIZED = makeSymbol("UIA-TERMS-DISTINGUISHING-PICTURES-MEMOIZED");

	private static final SubLSymbol UIA_ARG_TYPE_SUMMARY_CYCL_FOR_PRED_MEMOIZED = makeSymbol("UIA-ARG-TYPE-SUMMARY-CYCL-FOR-PRED-MEMOIZED");

	private static final SubLSymbol UIA_SALIENT_ARGN_ISA_MEMOIZED = makeSymbol("UIA-SALIENT-ARGN-ISA-MEMOIZED");

	private static final SubLSymbol UIA_SUMMARY_SENTENCE_MEMOIZED = makeSymbol("UIA-SUMMARY-SENTENCE-MEMOIZED");

	private static final SubLSymbol $CYC_TO_USER = makeKeyword("CYC-TO-USER");

	private static final SubLSymbol UIA_HTML_SUMMARY_SENTENCE_MEMOIZED = makeSymbol("UIA-HTML-SUMMARY-SENTENCE-MEMOIZED");

	private static final SubLSymbol UIA_SUMMARIZE_MEMOIZED = makeSymbol("UIA-SUMMARIZE-MEMOIZED");

	private static final SubLSymbol UIA_SENTENCES_FOR_TERM_MEMOIZED = makeSymbol("UIA-SENTENCES-FOR-TERM-MEMOIZED");

	private static final SubLSymbol UIA_COMPARE_TERMS_MEMOIZED = makeSymbol("UIA-COMPARE-TERMS-MEMOIZED");

	private static final SubLSymbol UIA_RELATED_TERMS_MEMOIZED = makeSymbol("UIA-RELATED-TERMS-MEMOIZED");

	private static final SubLSymbol UIA_CANDIDATE_SENTENCES_RELATING_TERMS_MEMOIZED = makeSymbol("UIA-CANDIDATE-SENTENCES-RELATING-TERMS-MEMOIZED");

	private static final SubLSymbol UIA_REJECTED_SENTENCE_MEMOIZED = makeSymbol("UIA-REJECTED-SENTENCE-MEMOIZED");

	private static final SubLSymbol UIA_REDUNDANT_SENTENCE_MEMOIZED = makeSymbol("UIA-REDUNDANT-SENTENCE-MEMOIZED");

	public static final SubLObject $$genls = constant_handles.reader_make_constant_shell(makeString("genls"));

	static private final SubLSymbol $sym70$GENL_ = makeSymbol("GENL?");

	static private final SubLSymbol $sym71$SPEC_ = makeSymbol("SPEC?");

	public static final SubLObject $$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));

	static private final SubLSymbol $sym73$GENL_PREDICATE_ = makeSymbol("GENL-PREDICATE?");

	static private final SubLSymbol $sym74$SPEC_PREDICATE_ = makeSymbol("SPEC-PREDICATE?");

	private static final SubLSymbol UIA_ANALOGOUS_SENTENCES_MEMOIZED = makeSymbol("UIA-ANALOGOUS-SENTENCES-MEMOIZED");

	static private final SubLString $str_alt77$_required = makeString(" required");

	static private final SubLString $str_alt79$_strongly_suggested = makeString(" strongly suggested");

	static private final SubLString $str_alt81$_other_possible = makeString(" other possible");

	static private final SubLString $str_alt83$_induced = makeString(" induced");

	static private final SubLString $str_alt84$ = makeString("");

	private static final SubLSymbol UIA_REFORMULATE_ASSERT_SENTENCE_MEMOIZED = makeSymbol("UIA-REFORMULATE-ASSERT-SENTENCE-MEMOIZED");

	private static final SubLSymbol UIA_REFORMULATE_QUERY_SENTENCE_MEMOIZED = makeSymbol("UIA-REFORMULATE-QUERY-SENTENCE-MEMOIZED");

	private static final SubLSymbol UIA_REFORMULATE_SENTENCE_MEMOIZED = makeSymbol("UIA-REFORMULATE-SENTENCE-MEMOIZED");

	static private final SubLString $str_alt89$I_now_know_the_following_fact__ = makeString("I now know the following fact: ");

	static private final SubLString $str_alt90$HYP_UIA = makeString("HYP-UIA");

	static private final SubLString $str_alt91$No_new_assumptions_are_required_f = makeString("No new assumptions are required for this fact.");

	static private final SubLList $list_alt92 = cons(makeSymbol("VARIABLE"), makeSymbol("TERM"));

	private static final SubLSymbol $DOMAIN_SPECIFIC_RULES = makeKeyword("DOMAIN-SPECIFIC-RULES");

	static private final SubLSymbol $sym94$_ASSERTION = makeSymbol("?ASSERTION");

	public static final SubLObject $$domainSpecificDefaultForwardRule = constant_handles.reader_make_constant_shell(makeString("domainSpecificDefaultForwardRule"));

	private static final SubLSymbol UIAT_ADDRULE_MENTIONS_INTERACTION_MT_P = makeSymbol("UIAT-ADDRULE-MENTIONS-INTERACTION-MT-P");

	private static final SubLSymbol UIAT_ADDRULE_MENTIONS_UIA_INTERACTION_MT_P = makeSymbol("UIAT-ADDRULE-MENTIONS-UIA-INTERACTION-MT-P");

	public static final SubLObject $$and = constant_handles.reader_make_constant_shell(makeString("and"));

	public static final SubLObject $$equals = constant_handles.reader_make_constant_shell(makeString("equals"));

	public static final SubLObject $$uiaInteractionTerm = constant_handles.reader_make_constant_shell(makeString("uiaInteractionTerm"));

	public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

	public static final SubLObject $$RKFInteractionContextMicrotheory = constant_handles.reader_make_constant_shell(makeString("RKFInteractionContextMicrotheory"));

	static private final SubLString $str_alt103$Checking_whether_answers_to__S_wi = makeString("Checking whether answers to ~S will allow me to conclude ~A.");

	static private final SubLString $str_alt105$From_the_domain_context__I_also_k = makeString("From the domain context, I also know that: ");

	static private final SubLSymbol $sym106$ASSERTED_ASSERTION_ = makeSymbol("ASSERTED-ASSERTION?");

	static private final SubLList $list_alt108 = list(makeSymbol("ISA"), makeSymbol("TOPIC"), makeSymbol("&OPTIONAL"), makeSymbol("TEMPLATE-MT"));

	static private final SubLSymbol $sym109$STRING_ = makeSymbol("STRING<");

	private static final SubLSymbol UIA_AVAILABLE_TEMPLATE_TOPIC_NAME = makeSymbol("UIA-AVAILABLE-TEMPLATE-TOPIC-NAME");

	static private final SubLList $list_alt111 = list(makeSymbol("GENLS"), makeSymbol("TOPIC"), makeSymbol("&OPTIONAL"), makeSymbol("TEMPLATE-MT"));

	private static final SubLSymbol UIA_FIND_ASSERTIONS_MEMOIZED = makeSymbol("UIA-FIND-ASSERTIONS-MEMOIZED");

	private static final SubLSymbol UIA_WFT_MEMOIZED = makeSymbol("UIA-WFT-MEMOIZED");

	private static final SubLSymbol UIA_WFF_MEMOIZED = makeSymbol("UIA-WFF-MEMOIZED");

	private static final SubLSymbol UIA_WHY_NOT_WFT_MEMOIZED = makeSymbol("UIA-WHY-NOT-WFT-MEMOIZED");

	private static final SubLSymbol UIA_WHY_NOT_WFF_MEMOIZED = makeSymbol("UIA-WHY-NOT-WFF-MEMOIZED");

	private static final SubLSymbol UIA_WHY_NOT_WFF_ENGLISH_MEMOIZED = makeSymbol("UIA-WHY-NOT-WFF-ENGLISH-MEMOIZED");

	private static final SubLSymbol UIA_WFF_COMPLIANT_MEMOIZED = makeSymbol("UIA-WFF-COMPLIANT-MEMOIZED");

	private static final SubLSymbol UIA_WHY_NOT_WFF_COMPLIANT_MEMOIZED = makeSymbol("UIA-WHY-NOT-WFF-COMPLIANT-MEMOIZED");

	private static final SubLSymbol UIA_ASSERTIBLE_COMPLIANT_MEMOIZED = makeSymbol("UIA-ASSERTIBLE-COMPLIANT-MEMOIZED");

	private static final SubLSymbol UIA_WHY_NOT_ASSERTIBLE_COMPLIANT_MEMOIZED = makeSymbol("UIA-WHY-NOT-ASSERTIBLE-COMPLIANT-MEMOIZED");

	private static final SubLSymbol UIA_WHY_NOT_ASSERTIBLE_MEMOIZED = makeSymbol("UIA-WHY-NOT-ASSERTIBLE-MEMOIZED");

	private static final SubLSymbol RKF_IRRELEVANT_SUPPORT_P = makeSymbol("RKF-IRRELEVANT-SUPPORT-P");

	static private final SubLSymbol $sym128$UIA_HL_SUPPORT_WITH_ISOMORPHIC_ASSERTION_ = makeSymbol("UIA-HL-SUPPORT-WITH-ISOMORPHIC-ASSERTION?");

	private static final SubLSymbol CB_UIAT_FIND_ASSERTION_FOR_SUPPORT = makeSymbol("CB-UIAT-FIND-ASSERTION-FOR-SUPPORT");

	static private final SubLSymbol $sym130$UIA_INVALID_SUPPORT_ = makeSymbol("UIA-INVALID-SUPPORT?");

	static private final SubLList $list_alt133 = list(constant_handles.reader_make_constant_shell(makeString("not")), constant_handles.reader_make_constant_shell(makeString("unknownSentence")));

	public static final SubLObject $$disjointWith = constant_handles.reader_make_constant_shell(makeString("disjointWith"));

	static private final SubLList $list_alt135 = list(makeSymbol("COL1"), makeSymbol("COL2"));

	static private final SubLSymbol $sym136$UIA_ADMITTED_ARGUMENT_MEMOIZED_ = makeSymbol("UIA-ADMITTED-ARGUMENT-MEMOIZED?");

	static private final SubLSymbol $sym137$UIA_INVALID_SENTENCE_MEMOIZED_ = makeSymbol("UIA-INVALID-SENTENCE-MEMOIZED?");

	static private final SubLSymbol $sym138$UIA_KNOWN_MEMOIZED_ = makeSymbol("UIA-KNOWN-MEMOIZED?");

	private static final SubLSymbol UIA_JUSTIFY_MEMOIZED = makeSymbol("UIA-JUSTIFY-MEMOIZED");

	static private final SubLList $list_alt141 = list(makeString("who"), makeString("whom"), makeString("what"), makeString("when"), makeString("where"), makeString("why"), makeString("wherefore"), makeString("how"));

	static private final SubLSymbol $sym142$UIA_IRRELEVANT_PRECISION_SUGGESTION_TERM_MEMOIZED_ = makeSymbol("UIA-IRRELEVANT-PRECISION-SUGGESTION-TERM-MEMOIZED?");

	static private final SubLSymbol $sym143$UIA_IRRELEVANT_PRECISION_SUGGESTION_TERM_FROM_MEMOIZED_ = makeSymbol("UIA-IRRELEVANT-PRECISION-SUGGESTION-TERM-FROM-MEMOIZED?");

	static private final SubLSymbol $sym144$UIA_IRRELEVANT_PRECISION_SUGGESTION_TERM_LAMBDA_ = makeSymbol("UIA-IRRELEVANT-PRECISION-SUGGESTION-TERM-LAMBDA?");

	static private final SubLSymbol $sym145$UIA_IRRELEVANT_ARG_CONSTRAINT_MEMOIZED_ = makeSymbol("UIA-IRRELEVANT-ARG-CONSTRAINT-MEMOIZED?");

	static private final SubLSymbol $sym146$UIA_IRRELEVANT_TERM_MEMOIZED_ = makeSymbol("UIA-IRRELEVANT-TERM-MEMOIZED?");

	static private final SubLSymbol $sym147$UIA_IRRELEVANT_FORMULA_MEMOIZED_ = makeSymbol("UIA-IRRELEVANT-FORMULA-MEMOIZED?");

	private static final SubLSymbol UIA_SORT_TERMS_MEMOIZED = makeSymbol("UIA-SORT-TERMS-MEMOIZED");

	private static final SubLSymbol UIA_SORT_TERMS_KEY = makeSymbol("UIA-SORT-TERMS-KEY");

	private static final SubLSymbol UIA_SORT_SENTENCES_MEMOIZED = makeSymbol("UIA-SORT-SENTENCES-MEMOIZED");

	private static final SubLSymbol UIA_SORT_SENTENCES_KEY = makeSymbol("UIA-SORT-SENTENCES-KEY");

	static private final SubLString $str_alt153$Unimplemented_macro_memoized_alre = makeString("Unimplemented macro memoized-already.");

	private static final SubLSymbol UIA_DOMAIN_EXAMPLE_PREDICATES_MEMOIZED = makeSymbol("UIA-DOMAIN-EXAMPLE-PREDICATES-MEMOIZED");

	private static final SubLSymbol UIA_PREDICATE_SELECTOR_MEMOIZED = makeSymbol("UIA-PREDICATE-SELECTOR-MEMOIZED");

	private static final SubLSymbol UIA_PREDICATE_FILTER_MEMOIZED = makeSymbol("UIA-PREDICATE-FILTER-MEMOIZED");

	static private final SubLList $list_alt157 = cons(makeSymbol("PREDICATE"), makeSymbol("REST"));

	private static final SubLSymbol UIA_ALL_PREDICATE_EXAMPLE_SENTENCES_MEMOIZED = makeSymbol("UIA-ALL-PREDICATE-EXAMPLE-SENTENCES-MEMOIZED");

	private static final SubLSymbol UIA_PREDICATE_GENERAL_UTILITY_MEMOIZED = makeSymbol("UIA-PREDICATE-GENERAL-UTILITY-MEMOIZED");

	private static final SubLSymbol UIA_PREDICATE_INDICATORS_MEMOIZED = makeSymbol("UIA-PREDICATE-INDICATORS-MEMOIZED");

	private static final SubLSymbol UIA_ORGANIZE_PREDICATES_BY_SPECIFICITY_TO_TERM_MEMOIZED = makeSymbol("UIA-ORGANIZE-PREDICATES-BY-SPECIFICITY-TO-TERM-MEMOIZED");

	private static final SubLSymbol UIA_ORGANIZE_PREDICATES_BY_SPECIFICITY_OF_ARGS_MEMOIZED = makeSymbol("UIA-ORGANIZE-PREDICATES-BY-SPECIFICITY-OF-ARGS-MEMOIZED");

	private static final SubLSymbol UIA_ORGANIZE_PREDICATES_BY_MT_MEMOIZED = makeSymbol("UIA-ORGANIZE-PREDICATES-BY-MT-MEMOIZED");

	private static final SubLSymbol UIA_ORGANIZE_PREDICATES_BY_SIMILARITY_MEMOIZED = makeSymbol("UIA-ORGANIZE-PREDICATES-BY-SIMILARITY-MEMOIZED");

	private static final SubLSymbol UIA_ORGANIZE_PREDICATE_MATCHES_BY_COLLECTION_MEMOIZED = makeSymbol("UIA-ORGANIZE-PREDICATE-MATCHES-BY-COLLECTION-MEMOIZED");

	private static final SubLSymbol UIA_SENTENCE_HAS_VARIATIONS_MEMOIZED = makeSymbol("UIA-SENTENCE-HAS-VARIATIONS-MEMOIZED");

	private static final SubLSymbol UIA_SENTENCE_VARIATIONS_MEMOIZED = makeSymbol("UIA-SENTENCE-VARIATIONS-MEMOIZED");

	private static final SubLSymbol UIA_BUILD_SPEC_PREDICATE_GRAPH_MEMOIZED = makeSymbol("UIA-BUILD-SPEC-PREDICATE-GRAPH-MEMOIZED");

	private static final SubLSymbol UIA_INTERPRET_SPEC_PREDICATE_GRAPH_MEMOIZED = makeSymbol("UIA-INTERPRET-SPEC-PREDICATE-GRAPH-MEMOIZED");

	public static final SubLObject $$nameString = constant_handles.reader_make_constant_shell(makeString("nameString"));

	private static final SubLSymbol UIA_EXAMPLE_QUERIES_MEMOIZED = makeSymbol("UIA-EXAMPLE-QUERIES-MEMOIZED");

	private static final SubLSymbol UIA_EXAMPLE_TERM_QUERIES_MEMOIZED = makeSymbol("UIA-EXAMPLE-TERM-QUERIES-MEMOIZED");

	private static final SubLSymbol UIA_TEST_QUESTIONS_FOR_TERM_MEMOIZED = makeSymbol("UIA-TEST-QUESTIONS-FOR-TERM-MEMOIZED");

	public static final SubLObject $$ReifiableFunction = constant_handles.reader_make_constant_shell(makeString("ReifiableFunction"));

	public static final SubLObject $$Collection = constant_handles.reader_make_constant_shell(makeString("Collection"));

	public static final SubLObject $$termDependsOn = constant_handles.reader_make_constant_shell(makeString("termDependsOn"));

	static private final SubLList $list_alt179 = list(list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("PROCESS"), constant_handles.reader_make_constant_shell(makeString("ScriptedEventType"))));

	public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

	private static final SubLSymbol UIA_CLASSIFY_FORT_MEMOIZED = makeSymbol("UIA-CLASSIFY-FORT-MEMOIZED");

	private static final SubLSymbol UIA_CLASSIFY_FORT_SET_MEMOIZED = makeSymbol("UIA-CLASSIFY-FORT-SET-MEMOIZED");

	private static final SubLSymbol UIA_CLASSIFY_SENTENCE_MEMOIZED = makeSymbol("UIA-CLASSIFY-SENTENCE-MEMOIZED");

	private static final SubLSymbol UIA_CLASSIFY_ASSERTION_MEMOIZED = makeSymbol("UIA-CLASSIFY-ASSERTION-MEMOIZED");

	private static final SubLSymbol UIA_CLASSIFY_SENTENCE_SET_MEMOIZED = makeSymbol("UIA-CLASSIFY-SENTENCE-SET-MEMOIZED");

	private static final SubLSymbol UIA_CLASSIFY_ASSERTION_SET_MEMOIZED = makeSymbol("UIA-CLASSIFY-ASSERTION-SET-MEMOIZED");

	private static final SubLSymbol UIA_GET_ORDERING_CATEGORIES_MEMOIZED = makeSymbol("UIA-GET-ORDERING-CATEGORIES-MEMOIZED");

	private static final SubLSymbol UIA_GET_ORDERING_CATEGORIES_FROM_CLASSIFIER_MEMOIZED = makeSymbol("UIA-GET-ORDERING-CATEGORIES-FROM-CLASSIFIER-MEMOIZED");

	// // Initializers
	public void declareFunctions() {
		declare_uia_trampolines_file();
	}

	public void initializeVariables() {
		init_uia_trampolines_file();
	}

	public void runTopLevelForms() {
		setup_uia_trampolines_file();
	}
}
