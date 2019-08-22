/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      PPH-DIAGNOSTICS
 *  source file: /cyc/top/cycl/pph-diagnostics.lisp
 *  created:     2019/07/03 17:38:21
 */
public final class pph_diagnostics extends SubLTranslatedFile implements V02 {
	// // Constructor
	private pph_diagnostics() {
	}

	public static final SubLFile me = new pph_diagnostics();

	// defparameter
	public static final SubLSymbol $paraphrase_test_constants$ = makeSymbol("*PARAPHRASE-TEST-CONSTANTS*");

	// defparameter
	public static final SubLSymbol $test_constants_in_use$ = makeSymbol("*TEST-CONSTANTS-IN-USE*");

	/**
	 *
	 *
	 * @return NIL or NON-NEGATIVE-INTEGER-P; the number of seconds of CPU time this image has used.
	 * @unknown - Make sure this is safe and effective, and move to a more general file.
	 */
	public static final SubLObject image_elapsed_cpu_time() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			thread.resetMultipleValues();
			{
				SubLObject ps_result_string = ps_result_string_for_process_id();
				SubLObject header_string = thread.secondMultipleValue();
				thread.resetMultipleValues();
				if (ps_result_string.isString()) {
					{
						SubLObject time_string = time_string_from_ps_result_string(ps_result_string, header_string);
						if (NIL != time_string) {
							{
								SubLObject tokens = nreverse(string_utilities.string_tokenize(time_string, $list_alt1, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
								SubLObject days = (NIL != list_utilities.lengthG(tokens, THREE_INTEGER, UNPROVIDED)) ? ((SubLObject) (read_from_string(fourth(tokens), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : ZERO_INTEGER;
								SubLObject hours = (NIL != list_utilities.lengthG(tokens, TWO_INTEGER, UNPROVIDED)) ? ((SubLObject) (read_from_string(third(tokens), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : ZERO_INTEGER;
								SubLObject minutes = read_from_string(second(tokens), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
								SubLObject seconds = read_from_string(tokens.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
								SubLObject elapsed_seconds = add(
										new SubLObject[] { seconds, multiply(minutes, numeric_date_utilities.$seconds_in_a_minute$.getGlobalValue()), NIL != days ? ((SubLObject) (multiply(days, numeric_date_utilities.$seconds_in_a_day$.getGlobalValue()))) : ZERO_INTEGER, NIL != hours ? ((SubLObject) (multiply(hours, numeric_date_utilities.$seconds_in_an_hour$.getGlobalValue()))) : ZERO_INTEGER });
								return elapsed_seconds;
							}
						}
					}
				}
			}
			return NIL;
		}
	}

	public static final SubLObject ps_result_string_for_process_id() {
		{
			SubLObject ps_result_strings = os_process_utilities.os_process_evaluation_output_strings($$$ps, list($str_alt3$_el), UNPROVIDED, UNPROVIDED);
			SubLObject header_string = NIL;
			SubLObject ps_result_string = NIL;
			if (NIL != list_utilities.non_empty_list_p(ps_result_strings)) {
				header_string = ps_result_strings.first();
				{
					SubLObject pid_prelocs = string_utilities.search_all($str_alt4$_PID_, header_string, UNPROVIDED, UNPROVIDED);
					SubLObject pid_string = cconcatenate($str_alt5$_, new SubLObject[] { format_nil.format_nil_d_no_copy(Environment.get_process_id(UNPROVIDED)), $str_alt5$_ });
					SubLObject pid_string_length = length(pid_string);
					if (NIL == ps_result_string) {
						{
							SubLObject csome_list_var = ps_result_strings;
							SubLObject string = NIL;
							for (string = csome_list_var.first(); !((NIL != ps_result_string) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), string = csome_list_var.first()) {
								if (NIL == ps_result_string) {
									{
										SubLObject csome_list_var_1 = pid_prelocs;
										SubLObject pid_preloc = NIL;
										for (pid_preloc = csome_list_var_1.first(); !((NIL != ps_result_string) || (NIL == csome_list_var_1)); csome_list_var_1 = csome_list_var_1.rest(), pid_preloc = csome_list_var_1.first()) {
											{
												SubLObject start = subtract(pid_preloc, subtract(pid_string_length, length($str_alt4$_PID_)));
												SubLObject end = add(start, pid_string_length);
												if (string_utilities.substring(string, start, end).equal(pid_string)) {
													ps_result_string = string;
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
			return values(ps_result_string, header_string);
		}
	}

	public static final SubLObject time_string_from_ps_result_string(SubLObject ps_result_string, SubLObject header_string) {
		{
			SubLObject time_prelocs = string_utilities.search_all($str_alt6$_TIME_, header_string, UNPROVIDED, UNPROVIDED);
			SubLObject time_length = length($str_alt7$00_00_00);
			SubLObject time_string = NIL;
			if (NIL == time_string) {
				{
					SubLObject csome_list_var = time_prelocs;
					SubLObject time_preloc = NIL;
					for (time_preloc = csome_list_var.first(); !((NIL != time_string) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), time_preloc = csome_list_var.first()) {
						{
							SubLObject start = number_utilities.f_1_(subtract(time_preloc, subtract(time_length, length($str_alt6$_TIME_))));
							SubLObject end = add(start, time_length);
							time_string = string_utilities.substring(ps_result_string, start, end);
							{
								SubLObject hyphen_pos = position(CHAR_hyphen, time_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
								if (NIL != hyphen_pos) {
									{
										SubLObject new_end = add(end, hyphen_pos, ONE_INTEGER);
										time_string = string_utilities.substring(ps_result_string, start, new_end);
									}
								}
							}
						}
					}
				}
			}
			return time_string;
		}
	}

	public static final SubLObject computing_cpu_time(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject var = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt8);
			var = current.first();
			current = current.rest();
			{
				SubLObject body = current;
				SubLObject start = $sym9$START;
				return listS(CLET, list(bq_cons(start, $list_alt11)), append(body, list(list(CSETQ, var, list(FWHEN, start, list($sym14$_, $list_alt15, start))))));
			}
		}
	}

	public static final SubLObject block_process(SubLObject process) {
		return interrupt_process(process, PROCESS_BLOCK);
	}

	public static final SubLObject block_all_other_processes() {
		{
			SubLObject current_process = current_process();
			SubLObject blocked_processes = NIL;
			SubLObject cdolist_list_var = all_processes();
			SubLObject process = NIL;
			for (process = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), process = cdolist_list_var.first()) {
				if (!((process == current_process) || process_whostate(process).equal($$$Sleeping))) {
					block_process(process);
					blocked_processes = cons(process, blocked_processes);
				}
			}
			return blocked_processes;
		}
	}

	public static final SubLObject blocking_all_other_processes(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject body = current;
			SubLObject blocked_processes = $sym18$BLOCKED_PROCESSES;
			return list(CLET, list(bq_cons(blocked_processes, $list_alt19)), list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), list(MAPCAR, $list_alt23, blocked_processes)));
		}
	}

	public static final SubLObject clear_paraphrase_utility_table() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if ($paraphrase_utility_table$.getDynamicValue(thread).isHashtable()) {
				clrhash($paraphrase_utility_table$.getDynamicValue(thread));
			} else {
				$paraphrase_utility_table$.setDynamicValue(make_hash_table($int$100, symbol_function(EQUAL), UNPROVIDED), thread);
			}
			return $paraphrase_utility_table$.getDynamicValue(thread);
		}
	}

	public static final SubLObject clear_pg_test_constants(SubLObject verboseP, SubLObject stream) {
		if (verboseP == UNPROVIDED) {
			verboseP = NIL;
		}
		if (stream == UNPROVIDED) {
			stream = T;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			$paraphrase_test_constants$.setDynamicValue(union($test_constants_in_use$.getDynamicValue(thread), $paraphrase_test_constants$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED), thread);
			$test_constants_in_use$.setDynamicValue(NIL, thread);
			{
				SubLObject cdolist_list_var = $paraphrase_test_constants$.getDynamicValue(thread);
				SubLObject c = NIL;
				for (c = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), c = cdolist_list_var.first()) {
					{
						SubLObject quoted_form = list(QUOTE, c);
						if (NIL != misc_kb_utilities.constant_or_natP(c)) {
							if (NIL != verboseP) {
								format(stream, $str_alt26$__Killing__s_____, c);
							}
							fi.safe_fi($KILL, quoted_form, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
							if (NIL != verboseP) {
								format(stream, $str_alt28$done_);
							}
						}
					}
				}
			}
			$paraphrase_test_constants$.setDynamicValue(NIL, thread);
			return NIL;
		}
	}

	public static final SubLObject get_one_pg_test_term(SubLObject collection, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_term = NIL;
				SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(domain_mt);
				{
					SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
					SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
						mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
						mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
						if (NIL == v_term) {
							{
								SubLObject csome_list_var = $paraphrase_test_constants$.getDynamicValue(thread);
								SubLObject x = NIL;
								for (x = csome_list_var.first(); !((NIL != v_term) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), x = csome_list_var.first()) {
									if ((NIL != isa.isaP(x, collection, UNPROVIDED, UNPROVIDED)) && (NIL == subl_promotions.memberP(x, $test_constants_in_use$.getDynamicValue(thread), symbol_function(EQL), UNPROVIDED))) {
										v_term = x;
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
				return v_term;
			}
		}
	}

	public static final SubLObject maybe_gentemp_test_term(SubLObject collection, SubLObject term_name, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_new = NIL;
				SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(domain_mt);
				{
					SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
					SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
						mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
						mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
						v_new = get_one_pg_test_term(collection, domain_mt);
						if (NIL == misc_kb_utilities.constant_or_natP(v_new)) {
							{
								SubLObject v_term = function_terms.nart_to_naut(collection);
								SubLObject new_name = string_utilities.str(gentemp(cconcatenate(misc_kb_utilities.coerce_name(term_name), $str_alt29$_)));
								SubLObject new_constant = fi.safe_fi($CREATE, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
								SubLObject isa_formula = list($$isa, new_constant, v_term);
								if (NIL != new_constant) {
									fi.safe_fi($ASSERT, isa_formula, mt_vars.$default_assert_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
									if (NIL != isa.isaP(new_constant, collection, UNPROVIDED, UNPROVIDED)) {
										v_new = new_constant;
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
				return v_new;
			}
		}
	}

	/**
	 * Test the paraphrase of OBJECT with NL-PREDS.
	 */
	public static final SubLObject test_gen(SubLObject v_object, SubLObject nl_preds, SubLObject mode) {
		if (nl_preds == UNPROVIDED) {
			nl_preds = $ANY;
		}
		if (mode == UNPROVIDED) {
			mode = $TEXT;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			pph_main.clear_paraphrase_caches(UNPROVIDED, UNPROVIDED);
			return pph_main.generate_phrase(v_object, nl_preds, NIL, pph_vars.$pph_language_mt$.getDynamicValue(thread), pph_vars.$pph_domain_mt$.getDynamicValue(thread), mode, T, UNPROVIDED);
		}
	}

	/**
	 * Do a TEST-GEN in precise mode.
	 */
	public static final SubLObject test_gen_precise(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject v_object = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt35);
			v_object = current.first();
			current = current.rest();
			{
				SubLObject nl_preds = (current.isCons()) ? ((SubLObject) (current.first())) : $ANY;
				destructuring_bind_must_listp(current, datum, $list_alt35);
				current = current.rest();
				if (NIL == current) {
					return list(WITH_PRECISE_PARAPHRASE_ON, list(TEST_GEN, v_object, nl_preds));
				} else {
					cdestructuring_bind_error(datum, $list_alt35);
				}
			}
		}
		return NIL;
	}

	public static final SubLObject test_gen_question(SubLObject cycl_sentence, SubLObject nl_preds, SubLObject language_mt, SubLObject domain_mt, SubLObject mode) {
		if (nl_preds == UNPROVIDED) {
			nl_preds = $ANY;
		}
		if (language_mt == UNPROVIDED) {
			language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		if (mode == UNPROVIDED) {
			mode = $TEXT;
		}
		pph_main.clear_paraphrase_caches(UNPROVIDED, UNPROVIDED);
		return pph_question.generate_question(cycl_sentence, language_mt, domain_mt, mode, nl_preds);
	}

	public static final SubLObject test_gen_rkf(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject v_object = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt38);
			v_object = current.first();
			current = current.rest();
			{
				SubLObject nl_preds = (current.isCons()) ? ((SubLObject) (current.first())) : $ANY;
				destructuring_bind_must_listp(current, datum, $list_alt38);
				current = current.rest();
				{
					SubLObject mode = (current.isCons()) ? ((SubLObject) (current.first())) : $TEXT;
					destructuring_bind_must_listp(current, datum, $list_alt38);
					current = current.rest();
					if (NIL == current) {
						return list(CLET, $list_alt39, list(TEST_GEN, v_object, nl_preds, mode));
					} else {
						cdestructuring_bind_error(datum, $list_alt38);
					}
				}
			}
		}
		return NIL;
	}

	/**
	 * Do a TEST-GEN in html mode.
	 */
	public static final SubLObject test_gen_html(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject v_object = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt35);
			v_object = current.first();
			current = current.rest();
			{
				SubLObject nl_preds = (current.isCons()) ? ((SubLObject) (current.first())) : $ANY;
				destructuring_bind_must_listp(current, datum, $list_alt35);
				current = current.rest();
				if (NIL == current) {
					return listS(TEST_GEN, v_object, nl_preds, $list_alt40);
				} else {
					cdestructuring_bind_error(datum, $list_alt35);
				}
			}
		}
		return NIL;
	}

	public static final SubLObject test_genformat(SubLObject relation, SubLObject stream, SubLObject domain_mt) {
		if (stream == UNPROVIDED) {
			stream = T;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (!((NIL == constant_handles.valid_constantP(relation, UNPROVIDED)) || (NIL != isa.isa_anyP(relation, $list_alt41, UNPROVIDED, UNPROVIDED)))) {
				$paraphrase_test_constants$.setDynamicValue(union($paraphrase_test_constants$.getDynamicValue(thread), $test_constants_in_use$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED), thread);
				$test_constants_in_use$.setDynamicValue(NIL, thread);
				{
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
								SubLObject v_arity = pph_utilities.pph_arity(relation);
								SubLObject template = pph_methods_formulas.get_genformat_formula(pph_utilities.pph_dummy_formula(relation, UNPROVIDED));
								SubLObject quoted_template = list(QUOTE, template);
								SubLObject arg_types = NIL;
								SubLObject args = NIL;
								if (v_arity.isInteger()) {
									{
										SubLObject i = NIL;
										for (i = ZERO_INTEGER; i.numL(v_arity); i = add(i, ONE_INTEGER)) {
											{
												SubLObject collection = kb_accessors.argn_isa(relation, add(i, ONE_INTEGER), UNPROVIDED).first();
												if (NIL != misc_kb_utilities.constant_or_natP(collection)) {
													arg_types = cons(collection, arg_types);
												}
											}
										}
									}
									if (length(arg_types).numE(v_arity)) {
										{
											SubLObject cdolist_list_var = arg_types;
											SubLObject type = NIL;
											for (type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), type = cdolist_list_var.first()) {
												{
													SubLObject v_term = function_terms.nart_to_naut(type);
													SubLObject term_name = (NIL != constant_handles.valid_constantP(v_term, UNPROVIDED)) ? ((SubLObject) (misc_kb_utilities.coerce_name(v_term))) : NIL != term.hl_ground_nautP(v_term) ? ((SubLObject) (misc_kb_utilities.coerce_name(v_term.first()))) : $$$Term;
													SubLObject new_constant = maybe_gentemp_test_term(v_term, term_name, UNPROVIDED);
													if (NIL != constant_handles.valid_constantP(new_constant, UNPROVIDED)) {
														args = cons(new_constant, args);
														{
															SubLObject item_var = new_constant;
															if (NIL == member(item_var, $paraphrase_test_constants$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(IDENTITY))) {
																$paraphrase_test_constants$.setDynamicValue(cons(item_var, $paraphrase_test_constants$.getDynamicValue(thread)), thread);
															}
														}
														{
															SubLObject item_var = new_constant;
															if (NIL == member(item_var, $test_constants_in_use$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(IDENTITY))) {
																$test_constants_in_use$.setDynamicValue(cons(item_var, $test_constants_in_use$.getDynamicValue(thread)), thread);
															}
														}
													}
												}
											}
										}
										if (length(args).numE(v_arity)) {
											{
												SubLObject formula = cons(relation, args);
												SubLObject quoted_formula = list(QUOTE, formula);
												SubLObject result = pph_main.generate_text(quoted_formula, $ANY, pph_vars.$pph_language_mt$.getDynamicValue(thread), domain_mt, UNPROVIDED, UNPROVIDED);
												format(stream, $str_alt43$_________________________________);
												format(stream, $str_alt44$_______Relation___s, relation);
												format(stream, $str_alt45$_______Template___s, template);
												format(stream, $str_alt46$_______CycL___s, formula);
												format(stream, $str_alt47$_______Text___s, result);
												format(stream, $str_alt48$_______ke_unassert__s__s_, quoted_template, $$EnglishParaphraseMt);
												format(stream, $str_alt50$_____ke_assert__s__s_, quoted_template, $$EnglishParaphraseMt);
											}
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
				}
			}
			return NIL;
		}
	}

	public static final SubLObject test_genformat_templates(SubLObject relation_list, SubLObject stream, SubLObject domain_mt) {
		if (stream == UNPROVIDED) {
			stream = T;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		clear_pg_test_constants(T, UNPROVIDED);
		{
			SubLObject cdolist_list_var = relation_list;
			SubLObject relation = NIL;
			for (relation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), relation = cdolist_list_var.first()) {
				test_genformat(relation, stream, domain_mt);
			}
		}
		clear_pg_test_constants(T, UNPROVIDED);
		return NIL;
	}

	public static final SubLObject save_genformat_tests(SubLObject filename, SubLObject relation_list, SubLObject domain_mt) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		{
			SubLObject stream = NIL;
			try {
				stream = compatibility.open_text(filename, $OUTPUT, NIL);
				if (!stream.isStream()) {
					Errors.error($str_alt52$Unable_to_open__S, filename);
				}
				{
					SubLObject stream_2 = stream;
					format(stream_2, $str_alt53$_____s, $list_alt54);
					test_genformat_templates(relation_list, stream_2, domain_mt);
				}
			} finally {
				{
					SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
					try {
						bind($is_thread_performing_cleanupP$, T);
						if (stream.isStream()) {
							close(stream, UNPROVIDED);
						}
					} finally {
						rebind($is_thread_performing_cleanupP$, _prev_bind_0);
					}
				}
			}
		}
		return filename;
	}

	/**
	 * Test the whole template-based generation system.
	 */
	public static final SubLObject test_gentemplate(SubLObject sample_relns) {
		if (sample_relns == UNPROVIDED) {
			sample_relns = TEN_INTEGER;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
				{
					SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
					SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
						mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
						mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
						{
							SubLObject node_var = $$NLTemplateGenerationPredicate;
							{
								SubLObject _prev_bind_0_3 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
								SubLObject _prev_bind_1_4 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
								try {
									sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
									sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
									{
										SubLObject node_var_5 = node_var;
										SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
										SubLObject recur_deck = deck.create_deck(deck_type);
										{
											SubLObject _prev_bind_0_6 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
											try {
												sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
												{
													SubLObject tv_var = NIL;
													{
														SubLObject _prev_bind_0_7 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
														SubLObject _prev_bind_1_8 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
														try {
															sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
															sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
															if (NIL != tv_var) {
																if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
																	if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
																		{
																			SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
																			if (pcase_var.eql($ERROR)) {
																				sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt61$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
																			} else if (pcase_var.eql($CERROR)) {
																				sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt61$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
																			} else if (pcase_var.eql($WARN)) {
																				Errors.warn($str_alt61$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
																			} else {
																				Errors.warn($str_alt66$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
																				Errors.cerror($$$continue_anyway, $str_alt61$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
																			}

																		}
																	}
																}
															}
															{
																SubLObject _prev_bind_0_9 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
																SubLObject _prev_bind_1_10 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
																SubLObject _prev_bind_2_11 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
																SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
																SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
																try {
																	sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
																	sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
																	sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
																	sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
																	sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
																	if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
																		{
																			SubLObject _prev_bind_0_12 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
																			SubLObject _prev_bind_1_13 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
																			SubLObject _prev_bind_2_14 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
																			try {
																				sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
																				sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
																				sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
																				sbhl_marking_utilities.sbhl_mark_node_marked(node_var_5, UNPROVIDED);
																				while (NIL != node_var_5) {
																					{
																						SubLObject tt_node_var = node_var_5;
																						SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
																						SubLObject cdolist_list_var = accessible_modules;
																						SubLObject module_var = NIL;
																						for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), module_var = cdolist_list_var.first()) {
																							{
																								SubLObject _prev_bind_0_15 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
																								SubLObject _prev_bind_1_16 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
																								try {
																									sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
																									sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
																									{
																										SubLObject node = function_terms.naut_to_nart(tt_node_var);
																										if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
																											{
																												SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
																												if (NIL != d_link) {
																													{
																														SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
																														if (NIL != mt_links) {
																															{
																																SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
																																while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
																																	thread.resetMultipleValues();
																																	{
																																		SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
																																		SubLObject tv_links = thread.secondMultipleValue();
																																		thread.resetMultipleValues();
																																		if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
																																			{
																																				SubLObject _prev_bind_0_17 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
																																				try {
																																					sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
																																					{
																																						SubLObject iteration_state_18 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
																																						while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_18)) {
																																							thread.resetMultipleValues();
																																							{
																																								SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_18);
																																								SubLObject link_nodes = thread.secondMultipleValue();
																																								thread.resetMultipleValues();
																																								if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
																																									{
																																										SubLObject _prev_bind_0_19 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
																																										try {
																																											sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
																																											{
																																												SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
																																												SubLObject cdolist_list_var_20 = new_list;
																																												SubLObject genpred = NIL;
																																												for (genpred = cdolist_list_var_20.first(); NIL != cdolist_list_var_20; cdolist_list_var_20 = cdolist_list_var_20.rest(), genpred = cdolist_list_var_20.first()) {
																																													if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(genpred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
																																														sbhl_marking_utilities.sbhl_mark_node_marked(genpred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
																																														if (NIL != forts.fort_p(genpred)) {
																																															test_gentemplate_pred(genpred, sample_relns);
																																														}
																																													}
																																												}
																																											}
																																										} finally {
																																											sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_19, thread);
																																										}
																																									}
																																								}
																																								iteration_state_18 = dictionary_contents.do_dictionary_contents_next(iteration_state_18);
																																							}
																																						}
																																						dictionary_contents.do_dictionary_contents_finalize(iteration_state_18);
																																					}
																																				} finally {
																																					sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_17, thread);
																																				}
																																			}
																																		}
																																		iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
																																	}
																																}
																																dictionary_contents.do_dictionary_contents_finalize(iteration_state);
																															}
																														}
																													}
																												} else {
																													sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt67$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
																												}
																											}
																											if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
																												{
																													SubLObject csome_list_var = sbhl_link_methods.non_fort_instance_table_lookup(node);
																													SubLObject instance_tuple = NIL;
																													for (instance_tuple = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest(), instance_tuple = csome_list_var.first()) {
																														{
																															SubLObject datum = instance_tuple;
																															SubLObject current = datum;
																															SubLObject link_node = NIL;
																															SubLObject mt = NIL;
																															SubLObject tv = NIL;
																															destructuring_bind_must_consp(current, datum, $list_alt68);
																															link_node = current.first();
																															current = current.rest();
																															destructuring_bind_must_consp(current, datum, $list_alt68);
																															mt = current.first();
																															current = current.rest();
																															destructuring_bind_must_consp(current, datum, $list_alt68);
																															tv = current.first();
																															current = current.rest();
																															if (NIL == current) {
																																if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
																																	{
																																		SubLObject _prev_bind_0_21 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
																																		try {
																																			sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
																																			if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
																																				{
																																					SubLObject _prev_bind_0_22 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
																																					try {
																																						sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
																																						{
																																							SubLObject link_nodes = list(link_node);
																																							SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
																																							SubLObject cdolist_list_var_23 = new_list;
																																							SubLObject genpred = NIL;
																																							for (genpred = cdolist_list_var_23.first(); NIL != cdolist_list_var_23; cdolist_list_var_23 = cdolist_list_var_23.rest(), genpred = cdolist_list_var_23.first()) {
																																								if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(genpred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
																																									sbhl_marking_utilities.sbhl_mark_node_marked(genpred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
																																									if (NIL != forts.fort_p(genpred)) {
																																										test_gentemplate_pred(genpred, sample_relns);
																																									}
																																								}
																																							}
																																						}
																																					} finally {
																																						sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_22, thread);
																																					}
																																				}
																																			}
																																		} finally {
																																			sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_21, thread);
																																		}
																																	}
																																}
																															} else {
																																cdestructuring_bind_error(datum, $list_alt68);
																															}
																														}
																													}
																												}
																											}
																										} else if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
																											{
																												SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p())
																														? ((SubLObject) (list_utilities
																																.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)))))
																														: sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
																												SubLObject cdolist_list_var_24 = new_list;
																												SubLObject generating_fn = NIL;
																												for (generating_fn = cdolist_list_var_24.first(); NIL != cdolist_list_var_24; cdolist_list_var_24 = cdolist_list_var_24.rest(), generating_fn = cdolist_list_var_24.first()) {
																													{
																														SubLObject _prev_bind_0_25 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
																														try {
																															sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
																															{
																																SubLObject link_nodes = funcall(generating_fn, node);
																																SubLObject new_list_26 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
																																SubLObject cdolist_list_var_27 = new_list_26;
																																SubLObject genpred = NIL;
																																for (genpred = cdolist_list_var_27.first(); NIL != cdolist_list_var_27; cdolist_list_var_27 = cdolist_list_var_27.rest(), genpred = cdolist_list_var_27.first()) {
																																	if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(genpred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
																																		sbhl_marking_utilities.sbhl_mark_node_marked(genpred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
																																		if (NIL != forts.fort_p(genpred)) {
																																			test_gentemplate_pred(genpred, sample_relns);
																																		}
																																	}
																																}
																															}
																														} finally {
																															sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_25, thread);
																														}
																													}
																												}
																											}
																										}

																									}
																								} finally {
																									sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_16, thread);
																									sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_15, thread);
																								}
																							}
																						}
																					}
																					{
																						SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
																						SubLObject cdolist_list_var = accessible_modules;
																						SubLObject module_var = NIL;
																						for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), module_var = cdolist_list_var.first()) {
																							{
																								SubLObject _prev_bind_0_28 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
																								SubLObject _prev_bind_1_29 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
																								try {
																									sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
																									sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
																									{
																										SubLObject node = function_terms.naut_to_nart(node_var_5);
																										if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
																											{
																												SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
																												if (NIL != d_link) {
																													{
																														SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
																														if (NIL != mt_links) {
																															{
																																SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
																																while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
																																	thread.resetMultipleValues();
																																	{
																																		SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
																																		SubLObject tv_links = thread.secondMultipleValue();
																																		thread.resetMultipleValues();
																																		if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
																																			{
																																				SubLObject _prev_bind_0_30 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
																																				try {
																																					sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
																																					{
																																						SubLObject iteration_state_31 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
																																						while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_31)) {
																																							thread.resetMultipleValues();
																																							{
																																								SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_31);
																																								SubLObject link_nodes = thread.secondMultipleValue();
																																								thread.resetMultipleValues();
																																								if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
																																									{
																																										SubLObject _prev_bind_0_32 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
																																										try {
																																											sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
																																											{
																																												SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
																																												SubLObject cdolist_list_var_33 = new_list;
																																												SubLObject node_vars_link_node = NIL;
																																												for (node_vars_link_node = cdolist_list_var_33.first(); NIL != cdolist_list_var_33; cdolist_list_var_33 = cdolist_list_var_33.rest(), node_vars_link_node = cdolist_list_var_33.first()) {
																																													if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
																																														sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
																																														deck.deck_push(node_vars_link_node, recur_deck);
																																													}
																																												}
																																											}
																																										} finally {
																																											sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_32, thread);
																																										}
																																									}
																																								}
																																								iteration_state_31 = dictionary_contents.do_dictionary_contents_next(iteration_state_31);
																																							}
																																						}
																																						dictionary_contents.do_dictionary_contents_finalize(iteration_state_31);
																																					}
																																				} finally {
																																					sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_30, thread);
																																				}
																																			}
																																		}
																																		iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
																																	}
																																}
																																dictionary_contents.do_dictionary_contents_finalize(iteration_state);
																															}
																														}
																													}
																												} else {
																													sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt67$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
																												}
																											}
																										} else if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
																											{
																												SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p())
																														? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)))))
																														: sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
																												SubLObject cdolist_list_var_34 = new_list;
																												SubLObject generating_fn = NIL;
																												for (generating_fn = cdolist_list_var_34.first(); NIL != cdolist_list_var_34; cdolist_list_var_34 = cdolist_list_var_34.rest(), generating_fn = cdolist_list_var_34.first()) {
																													{
																														SubLObject _prev_bind_0_35 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
																														try {
																															sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
																															{
																																SubLObject link_nodes = funcall(generating_fn, node);
																																SubLObject new_list_36 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
																																SubLObject cdolist_list_var_37 = new_list_36;
																																SubLObject node_vars_link_node = NIL;
																																for (node_vars_link_node = cdolist_list_var_37.first(); NIL != cdolist_list_var_37; cdolist_list_var_37 = cdolist_list_var_37.rest(), node_vars_link_node = cdolist_list_var_37.first()) {
																																	if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
																																		sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
																																		deck.deck_push(node_vars_link_node, recur_deck);
																																	}
																																}
																															}
																														} finally {
																															sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_35, thread);
																														}
																													}
																												}
																											}
																										}

																									}
																								} finally {
																									sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_29, thread);
																									sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_28, thread);
																								}
																							}
																						}
																					}
																					node_var_5 = deck.deck_pop(recur_deck);
																				}
																			} finally {
																				sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_14, thread);
																				sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_13, thread);
																				sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_12, thread);
																			}
																		}
																	} else {
																		sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt69$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
																	}
																} finally {
																	sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
																	sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
																	sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_11, thread);
																	sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_10, thread);
																	sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_9, thread);
																}
															}
														} finally {
															sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_8, thread);
															sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_7, thread);
														}
													}
													sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
												}
											} finally {
												sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_6, thread);
											}
										}
										sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
									}
								} finally {
									sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_4, thread);
									sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_3, thread);
								}
							}
						}
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
						mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
					}
				}
			}
			return NIL;
		}
	}

	/**
	 * Test a single template-based generation pred.
	 */
	public static final SubLObject test_gentemplate_pred(SubLObject genpred, SubLObject sample_relns) {
		if (genpred == UNPROVIDED) {
			genpred = $$genTemplate;
		}
		if (sample_relns == UNPROVIDED) {
			sample_relns = TEN_INTEGER;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
				{
					SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
					SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
						mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
						mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
						{
							SubLObject i = NIL;
							SubLObject relns = NIL;
							SubLObject reln = NIL;
							for (i = ZERO_INTEGER, relns = kb_mapping_utilities.pred_refs(genpred, UNPROVIDED, UNPROVIDED), reln = nth(random.random(length(relns)), relns); !i.numE(sample_relns); i = number_utilities.f_1X(i), reln = nth(random.random(length(relns)), relns)) {
								if (NIL != reln) {
									test_gentemplate_for_reln(reln, UNPROVIDED);
									relns = delete(reln, relns, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
								}
							}
						}
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
						mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
					}
				}
			}
			return NIL;
		}
	}

	/**
	 * Test template-based generation for a single relation.
	 */
	public static final SubLObject test_gentemplate_for_reln(SubLObject reln, SubLObject sample_assertions) {
		if (sample_assertions == UNPROVIDED) {
			sample_assertions = TEN_INTEGER;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
				{
					SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
					SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
					try {
						mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
						mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
						mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
						{
							SubLObject i = NIL;
							SubLObject assertions = NIL;
							SubLObject assertion = NIL;
							for (i = ZERO_INTEGER, assertions = append(kb_mapping.gather_predicate_extent_index(reln, UNPROVIDED, UNPROVIDED), kb_mapping.gather_function_extent_index(reln)), assertion = nth(random.random(length(assertions)), assertions); !(i.numE(sample_assertions) || (NIL == assertion)); i = number_utilities.f_1X(i), assertions = assertions, assertion = nth(random.random(length(assertions)),
									assertions)) {
								{
									SubLObject formula = (assertions_high.gaf_arg0(assertion) == $$termOfUnit) ? ((SubLObject) (assertions_high.gaf_arg2(assertion))) : cycl_utilities.hl_to_el(assertions_high.gaf_el_formula(assertion));
									SubLObject string = test_gen(formula, UNPROVIDED, UNPROVIDED);
									format(T, $str_alt72$___S_____S__, formula, string);
								}
								assertions = delete(assertion, assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
							}
						}
					} finally {
						mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
						mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
					}
				}
			}
			return NIL;
		}
	}

	/**
	 * Test the English paraphrase of the formulas chosen by the RKF Concept Summarizer
	 * to summarize TERM
	 */
	public static final SubLObject test_rkf_summary_generation(SubLObject v_term, SubLObject summary_mt) {
		if (summary_mt == UNPROVIDED) {
			summary_mt = $$DataForNLMt;
		}
		pph_main.clear_paraphrase_caches(UNPROVIDED, UNPROVIDED);
		{
			SubLObject cdolist_list_var = rkf_concept_summarizer.rkf_summarize(v_term, summary_mt, UNPROVIDED);
			SubLObject formula;
			for (formula = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), formula = cdolist_list_var.first()) {
				print(formula, UNPROVIDED);
				print(pph_main.generate_text(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
				terpri(UNPROVIDED);
			}
		}
		return v_term;
	}

	/**
	 * Return a list of all assertions for TERM.
	 * IF MT is provided, then the assertions are limited to those in MT.
	 */
	public static final SubLObject pg_term_assertions(SubLObject v_term, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject ans = NIL;
				if (NIL != mt) {
					{
						SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
						SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
						try {
							mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
							mt_relevance_macros.$mt$.bind(mt, thread);
							ans = kb_mapping.gather_term_assertions(v_term, NIL);
						} finally {
							mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
							mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
						}
					}
				} else {
					{
						SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
						SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
						try {
							mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
							mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
							ans = kb_mapping.gather_term_assertions(v_term, NIL);
						} finally {
							mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
							mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
						}
					}
				}
				return ans;
			}
		}
	}

	public static final SubLObject generate_for_term(SubLObject v_term, SubLObject assertion_mt, SubLObject language_mt, SubLObject domain_mt, SubLObject print_nicelyP, SubLObject stream) {
		if (assertion_mt == UNPROVIDED) {
			assertion_mt = NIL;
		}
		if (language_mt == UNPROVIDED) {
			language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		if (print_nicelyP == UNPROVIDED) {
			print_nicelyP = NIL;
		}
		if (stream == UNPROVIDED) {
			stream = T;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			clear_paraphrase_utility_table();
			{
				SubLObject constant = function_terms.naut_to_nart(v_term);
				SubLObject assertions = pg_term_assertions(constant, assertion_mt);
				{
					SubLObject _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding(thread);
					SubLObject _prev_bind_1 = pph_vars.$pph_domain_mt$.currentBinding(thread);
					try {
						pph_vars.$pph_language_mt$.bind(language_mt, thread);
						pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
						{
							SubLObject count = ONE_INTEGER;
							SubLObject cdolist_list_var = assertions;
							SubLObject ass = NIL;
							for (ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), ass = cdolist_list_var.first()) {
								{
									SubLObject formula = fi.assertion_fi_formula(ass, UNPROVIDED);
									if (!(formula.first().eql($$myCreator) || (NIL != gethash(formula, $paraphrase_utility_table$.getDynamicValue(thread), UNPROVIDED)))) {
										if (NIL != print_nicelyP) {
											format(stream, $str_alt78$______s___a, count, pph_main.generate_text(ass, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
										} else {
											print(pph_main.generate_text(ass, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), stream);
										}
										sethash(formula, $paraphrase_utility_table$.getDynamicValue(thread), T);
										count = add(count, ONE_INTEGER);
									}
								}
							}
						}
					} finally {
						pph_vars.$pph_domain_mt$.rebind(_prev_bind_1, thread);
						pph_vars.$pph_language_mt$.rebind(_prev_bind_0, thread);
					}
				}
			}
			return NIL;
		}
	}

	public static final SubLObject print_term_english(SubLObject v_term, SubLObject assertion_mt) {
		if (assertion_mt == UNPROVIDED) {
			assertion_mt = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			generate_for_term(v_term, assertion_mt, pph_vars.$pph_language_mt$.getDynamicValue(thread), pph_vars.$pph_domain_mt$.getDynamicValue(thread), T, UNPROVIDED);
			return NIL;
		}
	}

	public static final SubLObject generate_to_file(SubLObject v_term, SubLObject file, SubLObject show_formulas, SubLObject assertion_mt, SubLObject language_mt) {
		if (show_formulas == UNPROVIDED) {
			show_formulas = NIL;
		}
		if (assertion_mt == UNPROVIDED) {
			assertion_mt = NIL;
		}
		if (language_mt == UNPROVIDED) {
			language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			clear_paraphrase_utility_table();
			{
				SubLObject constant = function_terms.naut_to_nart(v_term);
				SubLObject assertions = pg_term_assertions(constant, assertion_mt);
				if (NIL != assertions) {
					{
						SubLObject stream = NIL;
						try {
							stream = compatibility.open_text(file, $OUTPUT, NIL);
							if (!stream.isStream()) {
								Errors.error($str_alt52$Unable_to_open__S, file);
							}
							{
								SubLObject stream_38 = stream;
								SubLObject count = ONE_INTEGER;
								{
									SubLObject _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding(thread);
									try {
										pph_vars.$pph_language_mt$.bind(language_mt, thread);
										{
											SubLObject cdolist_list_var = assertions;
											SubLObject ass = NIL;
											for (ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), ass = cdolist_list_var.first()) {
												{
													SubLObject mt = assertions_high.assertion_mt(ass);
													SubLObject formula = fi.assertion_fi_formula(ass, UNPROVIDED);
													if (!(formula.first().eql($$myCreator) || (NIL != gethash(formula, $paraphrase_utility_table$.getDynamicValue(thread), UNPROVIDED)))) {
														{
															SubLObject string = pph_main.generate_text(ass, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
															format(stream_38, $str_alt79$____);
															format(stream_38, $str_alt80$__a___a__, count, mt);
															format(stream_38, $str_alt81$_____Text___a, string.isString() ? ((SubLObject) (string)) : $str_alt82$No_text_generated_);
															if (NIL != show_formulas) {
																format(stream_38, $str_alt83$_____Formula___a, formula);
															}
															count = add(count, ONE_INTEGER);
															sethash(formula, $paraphrase_utility_table$.getDynamicValue(thread), T);
														}
													}
												}
											}
										}
									} finally {
										pph_vars.$pph_language_mt$.rebind(_prev_bind_0, thread);
									}
								}
							}
						} finally {
							{
								SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
								try {
									$is_thread_performing_cleanupP$.bind(T, thread);
									if (stream.isStream()) {
										close(stream, UNPROVIDED);
									}
								} finally {
									$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
								}
							}
						}
						return file;
					}
				} else {
					return NIL;
				}
			}
		}
	}

	public static final SubLObject no_genformat_templates(SubLObject filename) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject ans = NIL;
				SubLObject count = NIL;
				{
					SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
						mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
						{
							SubLObject relations = isa.all_fort_instances($$Relation, UNPROVIDED, UNPROVIDED);
							count = length(relations);
							{
								SubLObject cdolist_list_var = relations;
								SubLObject r = NIL;
								for (r = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), r = cdolist_list_var.first()) {
									if (!(((NIL != nart_handles.nart_p(r)) || (NIL != isa.isa_anyP(r, $list_alt85, UNPROVIDED, UNPROVIDED))) || (NIL != isa.quoted_isa_anyP(r, $list_alt86, UNPROVIDED, UNPROVIDED)))) {
										{
											SubLObject template = kb_mapping_utilities.fpred_value(r, $$genFormat, UNPROVIDED, UNPROVIDED, UNPROVIDED);
											if (NIL == template) {
												ans = cons(r, ans);
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
				if (NIL != ans) {
					{
						SubLObject len = length(ans);
						SubLObject stream = NIL;
						try {
							stream = compatibility.open_text(filename, $OUTPUT, NIL);
							if (!stream.isStream()) {
								Errors.error($str_alt52$Unable_to_open__S, filename);
							}
							{
								SubLObject s = stream;
								format(s, $str_alt88$______4F__of_tested_relations_lac, new SubLObject[] { multiply($int$100, divide(len, count)), len, count });
								{
									SubLObject cdolist_list_var = ans;
									SubLObject p = NIL;
									for (p = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), p = cdolist_list_var.first()) {
										format(s, $str_alt53$_____s, p);
									}
								}
							}
						} finally {
							{
								SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
								try {
									$is_thread_performing_cleanupP$.bind(T, thread);
									if (stream.isStream()) {
										close(stream, UNPROVIDED);
									}
								} finally {
									$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
								}
							}
						}
						ans = filename;
					}
				}
				return ans;
			}
		}
	}

	public static final SubLObject redundant_genformat_templates(SubLObject filename) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject ans = NIL;
				SubLObject count = NIL;
				{
					SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
						mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
						{
							SubLObject relations = isa.all_fort_instances($$Relation, UNPROVIDED, UNPROVIDED);
							count = length(relations);
							{
								SubLObject cdolist_list_var = relations;
								SubLObject r = NIL;
								for (r = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), r = cdolist_list_var.first()) {
									if (NIL == isa.isa_anyP(r, $list_alt89, UNPROVIDED, UNPROVIDED)) {
										{
											SubLObject templates = kb_mapping_utilities.pred_values(r, $$genFormat, UNPROVIDED, UNPROVIDED, UNPROVIDED);
											if (length(templates).numG(ONE_INTEGER)) {
												ans = cons(r, ans);
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
				if (NIL != ans) {
					{
						SubLObject len = length(ans);
						SubLObject stream = NIL;
						try {
							stream = compatibility.open_text(filename, $OUTPUT, NIL);
							if (!stream.isStream()) {
								Errors.error($str_alt52$Unable_to_open__S, filename);
							}
							{
								SubLObject s = stream;
								format(s, $str_alt90$________a__a_relations_with_more_, len, count);
								{
									SubLObject cdolist_list_var = ans;
									SubLObject p = NIL;
									for (p = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), p = cdolist_list_var.first()) {
										format(s, $str_alt53$_____s, p);
									}
								}
							}
						} finally {
							{
								SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
								try {
									$is_thread_performing_cleanupP$.bind(T, thread);
									if (stream.isStream()) {
										close(stream, UNPROVIDED);
									}
								} finally {
									$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
								}
							}
						}
						ans = filename;
					}
				}
				return ans;
			}
		}
	}

	public static final SubLObject terms_missing_preferred_words(SubLObject file, SubLObject verbose) {
		if (file == UNPROVIDED) {
			file = NIL;
		}
		if (verbose == UNPROVIDED) {
			verbose = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject table = make_hash_table($int$500, symbol_function(EQUAL), UNPROVIDED);
				SubLObject count = ZERO_INTEGER;
				SubLObject ans = NIL;
				{
					SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
						mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
						{
							SubLObject cdolist_list_var = kb_mapping.gather_predicate_extent_index($$denotation, UNPROVIDED, UNPROVIDED);
							SubLObject ass = NIL;
							for (ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), ass = cdolist_list_var.first()) {
								{
									SubLObject obj = fifth(assertions_high.assertion_formula(ass));
									SubLObject denots = ((NIL != constant_handles.valid_constantP(obj, UNPROVIDED)) && (obj != pph_utilities.constant_from_key($STAND_IN_DENOTATION))) ? ((SubLObject) (kb_mapping_utilities.pred_values(obj, $$denotation, FOUR_INTEGER, ONE_INTEGER, UNPROVIDED))) : NIL;
									if (!((((obj == pph_utilities.constant_from_key($STAND_IN_DENOTATION)) || (NIL != gethash(obj, table, UNPROVIDED))) || length(denots).numL(TWO_INTEGER)) || (NIL == constant_handles.valid_constantP(obj, UNPROVIDED)))) {
										{
											SubLObject preferred = kb_mapping_utilities.fpred_value(obj, $$preferredGenUnit, UNPROVIDED, UNPROVIDED, UNPROVIDED);
											if (NIL == preferred) {
												preferred = kb_mapping_utilities.fpred_value(obj, $$genPhrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
											}
											if (NIL == preferred) {
												ans = cons(function_terms.nart_to_naut(obj), ans);
											}
											count = add(count, ONE_INTEGER);
											sethash(obj, table, T);
											if ((NIL != verbose) && mod(count, $int$100).numE(ZERO_INTEGER)) {
												format(T, $str_alt96$___a_constants_checked___a_of_whi, count, length(ans));
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
				if ((NIL != ans) && file.isString()) {
					ans = Sort.sort(ans, symbol_function(STRING_LESSP), symbol_function(COERCE_NAME));
					{
						SubLObject stream = NIL;
						try {
							stream = compatibility.open_text(file, $OUTPUT, NIL);
							if (!stream.isStream()) {
								Errors.error($str_alt52$Unable_to_open__S, file);
							}
							{
								SubLObject out = stream;
								SubLObject cdolist_list_var = ans;
								SubLObject x = NIL;
								for (x = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), x = cdolist_list_var.first()) {
									format(out, $str_alt99$___s, x);
								}
							}
						} finally {
							{
								SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
								try {
									$is_thread_performing_cleanupP$.bind(T, thread);
									if (stream.isStream()) {
										close(stream, UNPROVIDED);
									}
								} finally {
									$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
								}
							}
						}
					}
					ans = file;
				}
				return ans;
			}
		}
	}

	/**
	 * Find forts with #$preferredGenUnit or #$genPhrase assertions, but
	 * no #$denotation assertions
	 */
	public static final SubLObject preferred_terms_missing_denotations(SubLObject verbose) {
		if (verbose == UNPROVIDED) {
			verbose = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject table = make_hash_table($int$100, symbol_function(EQUAL), UNPROVIDED);
				SubLObject count = ZERO_INTEGER;
				SubLObject ans = NIL;
				{
					SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
						mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
						{
							SubLObject assertions = NIL;
							{
								SubLObject cdolist_list_var = $list_alt100;
								SubLObject p = NIL;
								for (p = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), p = cdolist_list_var.first()) {
									assertions = append(assertions, kb_mapping.gather_predicate_extent_index(p, UNPROVIDED, UNPROVIDED));
								}
							}
							{
								SubLObject cdolist_list_var = assertions;
								SubLObject ass = NIL;
								for (ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), ass = cdolist_list_var.first()) {
									{
										SubLObject formula = assertions_high.assertion_formula(ass);
										SubLObject constant = second(formula);
										if ((((NIL != constant_handles.valid_constantP(constant, UNPROVIDED)) && (NIL == isa.isaP(constant, $$Relation, UNPROVIDED, UNPROVIDED))) && (NIL == gethash(constant, table, UNPROVIDED))) && (NIL == kb_mapping_utilities.some_pred_value(constant, $$denotation, FOUR_INTEGER, UNPROVIDED))) {
											ans = cons(function_terms.nart_to_naut(constant), ans);
											sethash(constant, table, T);
										}
									}
									count = add(count, ONE_INTEGER);
									if ((NIL != verbose) && mod(count, $int$50).numE(ZERO_INTEGER)) {
										format(T, $str_alt102$___a_constants_checked_, count);
									}
								}
							}
						}
					} finally {
						mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
					}
				}
				return ans;
			}
		}
	}

	/**
	 * Replace constants in a genFormat-style arglist with the appropriate keywords from *paraphrase-constant-key-ids*. Return the constantless list.
	 */
	public static final SubLObject constantless_arglist(SubLObject args) {
		if (args.isCons()) {
			{
				SubLObject new_car = constantless_arglist(args.first());
				SubLObject new_cdr = constantless_arglist(args.rest());
				if (new_car.eql(args.first()) && new_cdr.eql(args.rest())) {
					return args;
				} else {
					return cons(new_car, new_cdr);
				}
			}
		} else {
			{
				SubLObject new_atom = pph_utilities.key_from_constant(args);
				if (NIL != new_atom) {
					return new_atom;
				} else {
					return args;
				}
			}
		}
	}

	/**
	 * Record the fact that METHOD has worked one more time.
	 */
	public static final SubLObject pph_cinc_method_count(SubLObject method, SubLObject table) {
		if (table == UNPROVIDED) {
			table = $pph_method_count$.getGlobalValue();
		}
		return hash_table_utilities.cinc_hash(method, table, UNPROVIDED, UNPROVIDED);
	}

	/**
	 * Convert the method count hashtable to a sorted list
	 */
	public static final SubLObject pph_method_hash_to_list(SubLObject table) {
		if (table == UNPROVIDED) {
			table = $pph_method_count$.getGlobalValue();
		}
		{
			SubLObject ans = NIL;
			SubLObject key = NIL;
			SubLObject val = NIL;
			{
				final Iterator cdohash_iterator = getEntrySetIterator(table);
				try {
					while (iteratorHasNext(cdohash_iterator)) {
						final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
						key = getEntryKey(cdohash_entry);
						val = getEntryValue(cdohash_entry);
						ans = cons(list(key, val), ans);
					}
				} finally {
					releaseEntrySetIterator(cdohash_iterator);
				}
			}
			return Sort.sort(ans, symbol_function($sym105$_), symbol_function(SECOND));
		}
	}

	public static final SubLObject find_rules(SubLObject antecedent_max) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject ans = NIL;
				SubLObject idx = assertion_handles.do_assertions_table();
				SubLObject total = id_index.id_index_count(idx);
				SubLObject sofar = ZERO_INTEGER;
				SubLTrampolineFile.checkType($$$mapping_Cyc_assertions, STRINGP);
				{
					SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
					SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
					SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
					SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
					try {
						utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
						utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
						utilities_macros.$within_noting_percent_progress$.bind(T, thread);
						utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
						utilities_macros.noting_percent_progress_preamble($$$mapping_Cyc_assertions);
						if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
							{
								SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
								SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
								SubLObject as = NIL;
								while (NIL != id) {
									as = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
									if (NIL != id_index.do_id_index_id_and_object_validP(id, as, $SKIP)) {
										utilities_macros.note_percent_progress(sofar, total);
										sofar = add(sofar, ONE_INTEGER);
										{
											SubLObject cnf = assertions_high.assertion_cnf(as);
											if (cnf.first().isCons() && (NIL != list_utilities.lengthLE(cnf.first(), antecedent_max, UNPROVIDED))) {
												ans = cons(as, ans);
											}
										}
									}
									id = id_index.do_id_index_next_id(idx, T, id, state_var);
									state_var = id_index.do_id_index_next_state(idx, T, id, state_var);
								}
							}
						}
						utilities_macros.noting_percent_progress_postamble();
					} finally {
						utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
						utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
						utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
						utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
					}
				}
				return ans;
			}
		}
	}

	/**
	 * Classify all assertions by number of negative literals
	 */
	public static final SubLObject type_assertions() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject max = TWENTY_INTEGER;
				SubLObject ans = make_vector(max, ZERO_INTEGER);
				SubLObject total = assertion_handles.assertion_count();
				SubLObject idx = assertion_handles.do_assertions_table();
				SubLObject total_39 = id_index.id_index_count(idx);
				SubLObject sofar = ZERO_INTEGER;
				SubLTrampolineFile.checkType($str_alt110$Categorizing_assertions_by___of_a, STRINGP);
				{
					SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
					SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
					SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
					SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
					try {
						utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
						utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
						utilities_macros.$within_noting_percent_progress$.bind(T, thread);
						utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
						utilities_macros.noting_percent_progress_preamble($str_alt110$Categorizing_assertions_by___of_a);
						if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
							{
								SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
								SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
								SubLObject as = NIL;
								while (NIL != id) {
									as = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
									if (NIL != id_index.do_id_index_id_and_object_validP(id, as, $SKIP)) {
										utilities_macros.note_percent_progress(sofar, total_39);
										sofar = add(sofar, ONE_INTEGER);
										{
											SubLObject cnf = assertions_high.assertion_cnf(as);
											SubLObject count = length(cnf.first());
											if (!count.numG(TWENTY_INTEGER)) {
												set_aref(ans, count, add(aref(ans, count), ONE_INTEGER));
											}
										}
									}
									id = id_index.do_id_index_next_id(idx, T, id, state_var);
									state_var = id_index.do_id_index_next_state(idx, T, id, state_var);
								}
							}
						}
						utilities_macros.noting_percent_progress_postamble();
					} finally {
						utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
						utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
						utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
						utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
					}
				}
				format(T, $str_alt111$__neglits__assertions____________);
				format(T, $str_alt112$total___12D__, total);
				{
					SubLObject i = NIL;
					for (i = ZERO_INTEGER; i.numL(max); i = add(i, ONE_INTEGER)) {
						format(T, $str_alt113$___4D___13D___4F____, new SubLObject[] { i, aref(ans, i), multiply($int$100, divide(aref(ans, i), total)) });
					}
				}
			}
			return T;
		}
	}

	public static final SubLObject old_thcl_gafs(SubLObject cutoff_date) {
		if (cutoff_date == UNPROVIDED) {
			cutoff_date = subtract(numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED), $int$50000);
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject progress_message = cconcatenate($str_alt115$Finding_THCL_GAFs_asserted_prior_, format_nil.format_nil_s_no_copy(cutoff_date));
				SubLObject ans = NIL;
				SubLObject idx = assertion_handles.do_assertions_table();
				SubLObject total = id_index.id_index_count(idx);
				SubLObject sofar = ZERO_INTEGER;
				SubLTrampolineFile.checkType(progress_message, STRINGP);
				{
					SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
					SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
					SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
					SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
					try {
						utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
						utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
						utilities_macros.$within_noting_percent_progress$.bind(T, thread);
						utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
						utilities_macros.noting_percent_progress_preamble(progress_message);
						if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
							{
								SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
								SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
								SubLObject as = NIL;
								while (NIL != id) {
									as = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
									if (NIL != id_index.do_id_index_id_and_object_validP(id, as, $SKIP)) {
										utilities_macros.note_percent_progress(sofar, total);
										sofar = add(sofar, ONE_INTEGER);
										if ((((NIL != assertions_high.gaf_assertionP(as)) && (NIL != assertions_high.asserted_when(as))) && assertions_high.asserted_when(as).numLE(cutoff_date)) && (NIL != thcl.thcl_formulaP(as, UNPROVIDED))) {
											ans = cons(as, ans);
										}
									}
									id = id_index.do_id_index_next_id(idx, T, id, state_var);
									state_var = id_index.do_id_index_next_state(idx, T, id, state_var);
								}
							}
						}
						utilities_macros.noting_percent_progress_postamble();
					} finally {
						utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
						utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
						utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
						utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
					}
				}
				return Sort.sort(ans, symbol_function($sym116$_), symbol_function(ASSERTED_WHEN));
			}
		}
	}

	public static final SubLObject thcl_gafs_without_duplicate_terms(SubLObject gafs) {
		if (gafs == UNPROVIDED) {
			gafs = old_thcl_gafs(UNPROVIDED);
		}
		{
			SubLObject thcl_gafs = NIL;
			SubLObject terms = NIL;
			SubLObject cdolist_list_var = gafs;
			SubLObject as = NIL;
			for (as = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), as = cdolist_list_var.first()) {
				{
					SubLObject dupeP = NIL;
					{
						SubLObject terms_40 = cycl_utilities.formula_terms(as, $IGNORE);
						SubLObject rest = NIL;
						for (rest = terms_40; !((NIL != dupeP) || (NIL == rest)); rest = rest.rest()) {
							{
								SubLObject v_term = rest.first();
								if (NIL != subl_promotions.memberP(v_term, terms, UNPROVIDED, UNPROVIDED)) {
									dupeP = T;
								}
							}
						}
					}
					if (NIL == dupeP) {
						{
							SubLObject terms_41 = cycl_utilities.formula_terms(as, $IGNORE);
							SubLObject cdolist_list_var_42 = terms_41;
							SubLObject v_term = NIL;
							for (v_term = cdolist_list_var_42.first(); NIL != cdolist_list_var_42; cdolist_list_var_42 = cdolist_list_var_42.rest(), v_term = cdolist_list_var_42.first()) {
								terms = cons(v_term, terms);
							}
						}
						thcl_gafs = cons(as, thcl_gafs);
					}
				}
			}
			return nreverse(thcl_gafs);
		}
	}

	// deflexical
	private static final SubLSymbol $pph_benchmark_gaf_list_term$ = makeSymbol("*PPH-BENCHMARK-GAF-LIST-TERM*");

	public static final SubLObject update_pph_benchmark_gafs_in_kb(SubLObject cutoff_date, SubLObject cyclist) {
		if (cutoff_date == UNPROVIDED) {
			cutoff_date = subtract(numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED), $int$50000);
		}
		if (cyclist == UNPROVIDED) {
			cyclist = $$Baxter;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject thcl_gafs = thcl_gafs_without_duplicate_terms(old_thcl_gafs(cutoff_date));
				{
					SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
					try {
						api_control_vars.$the_cyclist$.bind(cyclist, thread);
						{
							SubLObject _prev_bind_0_43 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
							SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
							try {
								mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
								mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
								{
									SubLObject pred_var = $$nthInOrdering;
									if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator($pph_benchmark_gaf_list_term$.getGlobalValue(), ONE_INTEGER, pred_var)) {
										{
											SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator($pph_benchmark_gaf_list_term$.getGlobalValue(), ONE_INTEGER, pred_var);
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
																final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
																{
																	SubLObject done_var_44 = NIL;
																	SubLObject token_var_45 = NIL;
																	while (NIL == done_var_44) {
																		{
																			SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_45);
																			SubLObject valid_46 = makeBoolean(token_var_45 != as);
																			if (NIL != valid_46) {
																				ke.ke_unassert_assertion(as);
																			}
																			done_var_44 = makeBoolean(NIL == valid_46);
																		}
																	}
																}
															} finally {
																{
																	SubLObject _prev_bind_0_47 = $is_thread_performing_cleanupP$.currentBinding(thread);
																	try {
																		$is_thread_performing_cleanupP$.bind(T, thread);
																		if (NIL != final_index_iterator) {
																			kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
																		}
																	} finally {
																		$is_thread_performing_cleanupP$.rebind(_prev_bind_0_47, thread);
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
								}
							} finally {
								mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
								mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_43, thread);
							}
						}
						{
							SubLObject n = ONE_INTEGER;
							SubLObject cdolist_list_var = thcl_gafs;
							SubLObject as = NIL;
							for (as = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), as = cdolist_list_var.first()) {
								ke.ke_assert(list($$nthInOrdering, $pph_benchmark_gaf_list_term$.getGlobalValue(), as, n), $$ParaphraseMt, UNPROVIDED, UNPROVIDED);
								n = add(n, ONE_INTEGER);
							}
						}
					} finally {
						api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
					}
				}
				return thcl_gafs;
			}
		}
	}

	public static final SubLObject pph_benchmark_thcl_gafs() {
		if (!$pph_benchmark_thcl_gafs$.getGlobalValue().isList()) {
			initialize_pph_benchmark_thcl_gafs_from_kb();
		}
		return $pph_benchmark_thcl_gafs$.getGlobalValue();
	}

	public static final SubLObject initialize_pph_benchmark_thcl_gafs_from_kb() {
		{
			SubLObject tuples = kb_mapping_utilities.pred_value_tuples_in_any_mt($pph_benchmark_gaf_list_term$.getGlobalValue(), $$nthInOrdering, ONE_INTEGER, $list_alt126, UNPROVIDED);
			SubLObject validatedP = NIL;
			if (NIL == tuples) {
				Errors.warn($str_alt127$No_benchmark_GAFs_found_);
			} else if (NIL != list_utilities.duplicatesP(tuples, symbol_function(EQL), symbol_function(SECOND))) {
				Errors.warn($str_alt128$Duplicate_GAF_numbers_found___S, list_utilities.duplicates(tuples, symbol_function(EQL), symbol_function(SECOND)));
			} else if (NIL != list_utilities.find_if_not(ASSERTION_P, tuples, symbol_function(FIRST), UNPROVIDED, UNPROVIDED)) {
				Errors.warn($str_alt131$non_GAF___S, list_utilities.find_if_not(ASSERTION_P, tuples, symbol_function(FIRST), UNPROVIDED, UNPROVIDED));
			} else {
				{
					SubLObject missing_number = NIL;
					if (NIL == missing_number) {
						{
							SubLObject end_var = number_utilities.f_1X(length(tuples));
							SubLObject i = NIL;
							for (i = ONE_INTEGER; !((NIL != missing_number) || i.numGE(end_var)); i = number_utilities.f_1X(i)) {
								if (NIL == subl_promotions.memberP(i, tuples, symbol_function(EQL), symbol_function(SECOND))) {
									missing_number = i;
								}
							}
						}
					}
					if (NIL != missing_number) {
						Errors.warn($str_alt132$GAF__S_is_missing, missing_number);
					} else {
						validatedP = T;
					}
				}
			}

			if (NIL != validatedP) {
				$pph_benchmark_thcl_gafs$.setGlobalValue(Mapping.mapcar(FIRST, Sort.sort(tuples, symbol_function($sym116$_), symbol_function(SECOND))));
			} else {
				$pph_benchmark_thcl_gafs$.setGlobalValue(NIL);
			}
		}
		return $pph_benchmark_thcl_gafs$.getGlobalValue();
	}

	public static final SubLObject run_pph_benchmark_test() {
		{
			SubLObject blocked_processes = block_all_other_processes();
			try {
				pph_assertion_paraphrase_test(pph_benchmark_thcl_gafs(), UNPROVIDED);
			} finally {
				{
					SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
					try {
						bind($is_thread_performing_cleanupP$, T);
						Mapping.mapcar(PROCESS_UNBLOCK, blocked_processes);
					} finally {
						rebind($is_thread_performing_cleanupP$, _prev_bind_0);
					}
				}
			}
		}
		return NIL;
	}

	public static final SubLObject pph_initialize_random_assertions(SubLObject number_to_use, SubLObject gaf_onlyP, SubLObject verboseP) {
		if (number_to_use == UNPROVIDED) {
			number_to_use = $int$100;
		}
		if (gaf_onlyP == UNPROVIDED) {
			gaf_onlyP = T;
		}
		if (verboseP == UNPROVIDED) {
			verboseP = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			$pph_random_assertions$.setGlobalValue(NIL);
			{
				SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
				SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
				SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
				SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
				try {
					utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
					utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
					utilities_macros.$within_noting_percent_progress$.bind(T, thread);
					utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
					utilities_macros.noting_percent_progress_preamble($str_alt135$Gathering_random_assertions___);
					while (NIL != list_utilities.lengthL($pph_random_assertions$.getGlobalValue(), number_to_use, UNPROVIDED)) {
						{
							SubLObject as = assertions_high.random_assertion(UNPROVIDED);
							if (NIL != (NIL != gaf_onlyP ? ((SubLObject) (makeBoolean((NIL != assertions_high.gaf_assertionP(as)) && (NIL != thcl.thcl_formulaP(as, UNPROVIDED))))) : assertions_high.rule_assertionP(as))) {
								if (NIL == subl_promotions.memberP(as, $pph_random_assertions$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
									$pph_random_assertions$.setGlobalValue(cons(as, $pph_random_assertions$.getGlobalValue()));
									if (NIL != verboseP) {
										print(as, UNPROVIDED);
									}
									utilities_macros.note_percent_progress(length($pph_random_assertions$.getGlobalValue()), number_to_use);
								}
							}
						}
					}
					utilities_macros.noting_percent_progress_postamble();
				} finally {
					utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
					utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
					utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
					utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
				}
			}
			return $INITIALIZED;
		}
	}

	public static final SubLObject pph_ensure_random_assertions(SubLObject number_to_use, SubLObject gaf_onlyP, SubLObject verboseP) {
		if (number_to_use == UNPROVIDED) {
			number_to_use = $int$100;
		}
		if (gaf_onlyP == UNPROVIDED) {
			gaf_onlyP = T;
		}
		if (verboseP == UNPROVIDED) {
			verboseP = NIL;
		}
		if (NIL != gaf_onlyP) {
			$pph_random_assertions$.setGlobalValue(list_utilities.remove_if_not($sym137$GAF_ASSERTION_, $pph_random_assertions$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
		} else {
			$pph_random_assertions$.setGlobalValue(list_utilities.remove_if_not($sym138$RULE_ASSERTION_, $pph_random_assertions$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
		}
		$pph_random_assertions$.setGlobalValue(list_utilities.first_n(number_to_use, $pph_random_assertions$.getGlobalValue()));
		if (NIL != list_utilities.lengthE($pph_random_assertions$.getGlobalValue(), number_to_use, UNPROVIDED)) {
			return $OK;
		} else {
			return pph_initialize_random_assertions(number_to_use, gaf_onlyP, verboseP);
		}
	}

	/**
	 * See how long it takes to paraphrase a set of randomly-chosen assertions.
	 */
	public static final SubLObject pph_random_assertion_test(SubLObject reinitialize_assertionsP, SubLObject verboseP, SubLObject number_to_use, SubLObject gaf_onlyP) {
		if (reinitialize_assertionsP == UNPROVIDED) {
			reinitialize_assertionsP = T;
		}
		if (verboseP == UNPROVIDED) {
			verboseP = NIL;
		}
		if (number_to_use == UNPROVIDED) {
			number_to_use = $int$100;
		}
		if (gaf_onlyP == UNPROVIDED) {
			gaf_onlyP = T;
		}
		if (NIL != reinitialize_assertionsP) {
			pph_initialize_random_assertions(number_to_use, gaf_onlyP, verboseP);
		} else {
			pph_ensure_random_assertions(number_to_use, gaf_onlyP, verboseP);
		}
		pph_main.clear_paraphrase_caches(UNPROVIDED, UNPROVIDED);
		return pph_assertion_paraphrase_test($pph_random_assertions$.getGlobalValue(), verboseP);
	}

	public static final SubLObject pph_assertion_paraphrase_test(SubLObject assertions, SubLObject verboseP) {
		if (verboseP == UNPROVIDED) {
			verboseP = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			SubLTrampolineFile.checkType(assertions, PROPER_LIST_P);
			{
				SubLObject total_time = ZERO_INTEGER;
				SubLObject cpu_time = ZERO_INTEGER;
				SubLObject this_time = NIL;
				SubLObject this_paraphrase = NIL;
				SubLObject results = NIL;
				SubLObject total = length(assertions);
				SubLObject sofar = ZERO_INTEGER;
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
									SubLObject _prev_bind_0_48 = pph_macros.$pph_memoization_state$.currentBinding(thread);
									try {
										pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
										{
											SubLObject new_or_reused = thread.secondMultipleValue();
											thread.resetMultipleValues();
											{
												SubLObject _prev_bind_0_49 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
												try {
													pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
													{
														SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
														{
															SubLObject _prev_bind_0_50 = memoization_state.$memoization_state$.currentBinding(thread);
															try {
																memoization_state.$memoization_state$.bind(local_state, thread);
																{
																	final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
																	try {
																		{
																			SubLObject _prev_bind_0_51 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
																			SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
																			SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
																			SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
																			try {
																				utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
																				utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
																				utilities_macros.$within_noting_percent_progress$.bind(T, thread);
																				utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
																				utilities_macros.noting_percent_progress_preamble($str_alt142$Paraphrasing_assertions___);
																				{
																					SubLObject start = image_elapsed_cpu_time();
																					SubLObject cdolist_list_var = assertions;
																					SubLObject as = NIL;
																					for (as = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), as = cdolist_list_var.first()) {
																						if (NIL != verboseP) {
																							print(as, UNPROVIDED);
																						}
																						{
																							SubLObject time_var = get_internal_real_time();
																							this_paraphrase = pph_main.generate_text(as, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
																							this_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
																						}
																						total_time = add(total_time, this_time);
																						sofar = add(sofar, ONE_INTEGER);
																						results = cons(list(as, this_paraphrase, this_time), results);
																						utilities_macros.note_percent_progress(sofar, total);
																					}
																					cpu_time = (NIL != start) ? ((SubLObject) (subtract(image_elapsed_cpu_time(), start))) : NIL;
																				}
																				utilities_macros.noting_percent_progress_postamble();
																			} finally {
																				utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
																				utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
																				utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
																				utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_51, thread);
																			}
																		}
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
																memoization_state.$memoization_state$.rebind(_prev_bind_0_50, thread);
															}
														}
													}
												} finally {
													pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_49, thread);
												}
											}
											if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
												memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
											}
										}
									} finally {
										pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_48, thread);
									}
								}
							} finally {
								{
									SubLObject _prev_bind_0_53 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if (NIL == reuseP) {
											pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_53, thread);
									}
								}
							}
						}
					} finally {
						pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0, thread);
					}
				}
				if (NIL != verboseP) {
					{
						SubLObject cdolist_list_var = results;
						SubLObject item = NIL;
						for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), item = cdolist_list_var.first()) {
							{
								SubLObject datum = item;
								SubLObject current = datum;
								SubLObject as = NIL;
								SubLObject paraphrase = NIL;
								SubLObject time = NIL;
								destructuring_bind_must_consp(current, datum, $list_alt144);
								as = current.first();
								current = current.rest();
								destructuring_bind_must_consp(current, datum, $list_alt144);
								paraphrase = current.first();
								current = current.rest();
								destructuring_bind_must_consp(current, datum, $list_alt144);
								time = current.first();
								current = current.rest();
								if (NIL == current) {
									print(as, UNPROVIDED);
									print(paraphrase, UNPROVIDED);
									print(time, UNPROVIDED);
									terpri(UNPROVIDED);
								} else {
									cdestructuring_bind_error(datum, $list_alt144);
								}
							}
						}
					}
				}
				format(T, $str_alt145$____Paraphrased__D_assertions_in_, new SubLObject[] { length(assertions), total_time, cpu_time });
				{
					SubLObject times = Mapping.mapcar(symbol_function(THIRD), results);
					SubLObject mean = number_utilities.mean(times);
					SubLObject median = number_utilities.median(times, UNPROVIDED, UNPROVIDED_SYM);
					SubLObject std_dev = number_utilities.standard_deviation(times);
					SubLObject assertion_count = length(assertions);
					SubLObject paraphrases_per_second = divide(assertion_count, total_time);
					SubLObject paraphrases_per_cpu_second = divide(assertion_count, cpu_time);
					format(T, $str_alt147$__Mean____4F_Median____4F_Standar, new SubLObject[] { mean, median, std_dev, paraphrases_per_second, paraphrases_per_cpu_second });
				}
				return Sort.sort(results, symbol_function($sym116$_), symbol_function(THIRD));
			}
		}
	}

	public static final SubLObject pph_initialize_random_query_sentences(SubLObject number_to_use, SubLObject atomic_onlyP, SubLObject verboseP, SubLObject omit_sksiP) {
		if (number_to_use == UNPROVIDED) {
			number_to_use = $int$100;
		}
		if (atomic_onlyP == UNPROVIDED) {
			atomic_onlyP = T;
		}
		if (verboseP == UNPROVIDED) {
			verboseP = NIL;
		}
		if (omit_sksiP == UNPROVIDED) {
			omit_sksiP = T;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			$pph_random_query_sentences$.setGlobalValue(NIL);
			{
				SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
				SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
				SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
				SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
				try {
					utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
					utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
					utilities_macros.$within_noting_percent_progress$.bind(T, thread);
					utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
					utilities_macros.noting_percent_progress_preamble($str_alt149$Gathering_random_query_sentences_);
					while (NIL != list_utilities.lengthL($pph_random_query_sentences$.getGlobalValue(), number_to_use, UNPROVIDED)) {
						if (NIL != verboseP) {
							utilities_macros.note_percent_progress(length($pph_random_query_sentences$.getGlobalValue()), number_to_use);
						}
						{
							SubLObject query_sentence = random_query_sentence();
							if (((NIL == atomic_onlyP) || (NIL != el_utilities.atomic_sentenceP(query_sentence))) && ((NIL == omit_sksiP) || (NIL == cycl_utilities.expression_find($$SchemaObjectFn, query_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
								{
									SubLObject item_var = query_sentence;
									if (NIL == member(item_var, $pph_random_query_sentences$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
										$pph_random_query_sentences$.setGlobalValue(cons(item_var, $pph_random_query_sentences$.getGlobalValue()));
									}
								}
							}
						}
					}
					utilities_macros.noting_percent_progress_postamble();
				} finally {
					utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
					utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
					utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
					utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
				}
			}
			return $INITIALIZED;
		}
	}

	public static final SubLObject random_query_sentence() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL != control_vars.$curried_kbq_lookupP$.getDynamicValue(thread)) {
				return czer_main.unquote_quoted_term(list_utilities.random_element(kb_mapping_utilities.pred_refs_in_any_mt($const151$sentenceParameterValueInSpecifica, UNPROVIDED, UNPROVIDED)), UNPROVIDED);
			} else {
				return czer_main.unquote_quoted_term(list_utilities.random_element(kb_mapping_utilities.pred_values_in_any_mt($$InferenceSentenceParameter, $const153$softwareParameterValueInSpecifica, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED);
			}
		}
	}

	public static final SubLObject pph_ensure_random_query_sentences(SubLObject number_to_use, SubLObject atomic_onlyP, SubLObject verboseP) {
		if (number_to_use == UNPROVIDED) {
			number_to_use = $int$100;
		}
		if (atomic_onlyP == UNPROVIDED) {
			atomic_onlyP = T;
		}
		if (verboseP == UNPROVIDED) {
			verboseP = NIL;
		}
		if (NIL != atomic_onlyP) {
			$pph_random_query_sentences$.setGlobalValue(list_utilities.remove_if_not($sym154$ATOMIC_SENTENCE_, $pph_random_query_sentences$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
		}
		$pph_random_query_sentences$.setGlobalValue(list_utilities.first_n(number_to_use, $pph_random_query_sentences$.getGlobalValue()));
		if (NIL != list_utilities.lengthE($pph_random_query_sentences$.getGlobalValue(), number_to_use, UNPROVIDED)) {
			return $OK;
		} else {
			return pph_initialize_random_query_sentences(number_to_use, atomic_onlyP, verboseP, UNPROVIDED);
		}
	}

	/**
	 * See how long it takes to paraphrase a set of randomly-chosen query-sentences.
	 */
	public static final SubLObject pph_random_query_sentence_test(SubLObject reinitialize_query_sentencesP, SubLObject verboseP, SubLObject number_to_use, SubLObject atomic_onlyP) {
		if (reinitialize_query_sentencesP == UNPROVIDED) {
			reinitialize_query_sentencesP = T;
		}
		if (verboseP == UNPROVIDED) {
			verboseP = NIL;
		}
		if (number_to_use == UNPROVIDED) {
			number_to_use = $int$100;
		}
		if (atomic_onlyP == UNPROVIDED) {
			atomic_onlyP = T;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL != reinitialize_query_sentencesP) {
				pph_initialize_random_query_sentences(number_to_use, atomic_onlyP, verboseP, UNPROVIDED);
			} else {
				pph_ensure_random_query_sentences(number_to_use, atomic_onlyP, verboseP);
			}
			pph_main.clear_paraphrase_caches(UNPROVIDED, UNPROVIDED);
			{
				SubLObject total_time = ZERO_INTEGER;
				SubLObject this_time = NIL;
				SubLObject this_paraphrase = NIL;
				SubLObject results = NIL;
				SubLObject total = length($pph_random_query_sentences$.getGlobalValue());
				SubLObject sofar = ZERO_INTEGER;
				{
					SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
					SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
					SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
					SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
					try {
						utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
						utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
						utilities_macros.$within_noting_percent_progress$.bind(T, thread);
						utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
						utilities_macros.noting_percent_progress_preamble($str_alt155$Paraphrasing_query_sentences___);
						{
							SubLObject cdolist_list_var = $pph_random_query_sentences$.getGlobalValue();
							SubLObject query_sentence = NIL;
							for (query_sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), query_sentence = cdolist_list_var.first()) {
								if (NIL != verboseP) {
									print(query_sentence, UNPROVIDED);
								}
								{
									SubLObject time_var = get_internal_real_time();
									this_paraphrase = pph_question.generate_question(query_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
									this_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
								}
								total_time = add(total_time, this_time);
								sofar = add(sofar, ONE_INTEGER);
								results = cons(list(query_sentence, this_paraphrase, this_time), results);
								if (NIL != verboseP) {
									utilities_macros.note_percent_progress(sofar, total);
								}
							}
						}
						utilities_macros.noting_percent_progress_postamble();
					} finally {
						utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
						utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
						utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
						utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
					}
				}
				if (NIL != verboseP) {
					{
						SubLObject cdolist_list_var = results;
						SubLObject item = NIL;
						for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), item = cdolist_list_var.first()) {
							{
								SubLObject datum = item;
								SubLObject current = datum;
								SubLObject query_sentence = NIL;
								SubLObject paraphrase = NIL;
								SubLObject time = NIL;
								destructuring_bind_must_consp(current, datum, $list_alt156);
								query_sentence = current.first();
								current = current.rest();
								destructuring_bind_must_consp(current, datum, $list_alt156);
								paraphrase = current.first();
								current = current.rest();
								destructuring_bind_must_consp(current, datum, $list_alt156);
								time = current.first();
								current = current.rest();
								if (NIL == current) {
									print(query_sentence, UNPROVIDED);
									print(paraphrase, UNPROVIDED);
									print(time, UNPROVIDED);
									terpri(UNPROVIDED);
								} else {
									cdestructuring_bind_error(datum, $list_alt156);
								}
							}
						}
					}
				}
				format(T, $str_alt157$____Paraphrased__D_random_query_s, length($pph_random_query_sentences$.getGlobalValue()), total_time);
				return Sort.sort(results, symbol_function($sym116$_), symbol_function(THIRD));
			}
		}
	}

	public static final SubLObject pph_gather_collection_type_gafs(SubLObject num, SubLObject clear_firstP) {
		if (num == UNPROVIDED) {
			num = $int$100;
		}
		if (clear_firstP == UNPROVIDED) {
			clear_firstP = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL != clear_firstP) {
				$pph_collection_type_gafs$.setGlobalValue(NIL);
			}
			{
				SubLObject number_to_add = subtract(num, length($pph_collection_type_gafs$.getGlobalValue()));
				if (number_to_add.isPositive()) {
					{
						SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_domain_mt$.getDynamicValue(thread));
						{
							SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
							SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
							SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
							try {
								mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
								mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
								mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
								{
									SubLObject cdolist_list_var = list_utilities.random_n(number_to_add, isa.all_fort_instances($$CollectionType, UNPROVIDED, UNPROVIDED));
									SubLObject coll_type = NIL;
									for (coll_type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), coll_type = cdolist_list_var.first()) {
										{
											SubLObject gaf = pph_find_collection_type_gaf_for_type(coll_type);
											if (NIL != gaf) {
												$pph_collection_type_gafs$.setGlobalValue(cons(gaf, $pph_collection_type_gafs$.getGlobalValue()));
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
					}
				}
			}
			return $pph_collection_type_gafs$.getGlobalValue();
		}
	}

	/**
	 *
	 *
	 * @unknown MT is set from outside.
	 */
	public static final SubLObject pph_find_collection_type_gaf_for_type(SubLObject coll_type) {
		{
			SubLObject ans = NIL;
			SubLObject pred_var = $$isa;
			if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(coll_type, TWO_INTEGER, pred_var)) {
				{
					SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(coll_type, TWO_INTEGER, pred_var);
					SubLObject done_var = ans;
					SubLObject token_var = NIL;
					while (NIL == done_var) {
						{
							SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
							SubLObject valid = makeBoolean(token_var != final_index_spec);
							if (NIL != valid) {
								{
									SubLObject final_index_iterator = NIL;
									try {
										final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
										{
											SubLObject done_var_54 = ans;
											SubLObject token_var_55 = NIL;
											while (NIL == done_var_54) {
												{
													SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_55);
													SubLObject valid_56 = makeBoolean(token_var_55 != as);
													if (NIL != valid_56) {
														if (NIL == subl_promotions.memberP(as, $pph_collection_type_gafs$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
															ans = as;
														}
													}
													done_var_54 = makeBoolean((NIL == valid_56) || (NIL != ans));
												}
											}
										}
									} finally {
										{
											SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
											try {
												bind($is_thread_performing_cleanupP$, T);
												if (NIL != final_index_iterator) {
													kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
												}
											} finally {
												rebind($is_thread_performing_cleanupP$, _prev_bind_0);
											}
										}
									}
								}
							}
							done_var = makeBoolean((NIL == valid) || (NIL != ans));
						}
					}
				}
			}
			return ans;
		}
	}

	public static final SubLObject pph_test_collection_type_gafs(SubLObject num, SubLObject clear_firstP) {
		if (num == UNPROVIDED) {
			num = NIL;
		}
		if (clear_firstP == UNPROVIDED) {
			clear_firstP = NIL;
		}
		if (num.isInteger()) {
			pph_gather_collection_type_gafs(num, clear_firstP);
		}
		pph_main.clear_paraphrase_caches(UNPROVIDED, UNPROVIDED);
		{
			SubLObject cdolist_list_var = list_utilities.random_n(num, $pph_collection_type_gafs$.getGlobalValue());
			SubLObject gaf = NIL;
			for (gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), gaf = cdolist_list_var.first()) {
				format(T, $str_alt161$___S_____A____, gaf, pph_main.generate_text(gaf, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
			}
		}
		return NIL;
	}

	/**
	 * LISTP; (<MT> . (<COLLECTION> <INSTANCE-COUNT> <DISAMBIGUATION-PARAPHRASE-TIME> <STRAIGHT-PARAPHRASE-TIME>)*)
	 */
	// defparameter
	private static final SubLSymbol $pph_disambiguation_mode_stats$ = makeSymbol("*PPH-DISAMBIGUATION-MODE-STATS*");

	public static final SubLObject pph_test_disambiguation_mode(SubLObject max_items, SubLObject min_items, SubLObject number_of_samples, SubLObject domain_mt) {
		if (max_items == UNPROVIDED) {
			max_items = $int$250;
		}
		if (min_items == UNPROVIDED) {
			min_items = $int$100;
		}
		if (number_of_samples == UNPROVIDED) {
			number_of_samples = $int$100;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject collections_done = ZERO_INTEGER;
				SubLObject doneP = numGE(collections_done, number_of_samples);
				$pph_disambiguation_mode_stats$.setDynamicValue(list(domain_mt), thread);
				{
					SubLObject message = $str_alt163$Testing_Disambiguation_mode___;
					SubLObject total = forts.fort_count();
					SubLObject sofar = ZERO_INTEGER;
					{
						SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
						SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
						SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
						SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
						try {
							utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
							utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
							utilities_macros.$within_noting_percent_progress$.bind(T, thread);
							utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
							utilities_macros.noting_percent_progress_preamble(message);
							{
								SubLObject rest = NIL;
								for (rest = forts.do_forts_tables(); !((NIL != doneP) || (NIL == rest)); rest = rest.rest()) {
									{
										SubLObject table_var = rest.first();
										if (NIL == id_index.do_id_index_empty_p(table_var, $SKIP)) {
											{
												SubLObject id = id_index.do_id_index_next_id(table_var, T, NIL, NIL);
												SubLObject state_var = id_index.do_id_index_next_state(table_var, T, id, NIL);
												SubLObject fort = NIL;
												while ((NIL != id) && (NIL == doneP)) {
													fort = id_index.do_id_index_state_object(table_var, $SKIP, id, state_var);
													if (NIL != id_index.do_id_index_id_and_object_validP(id, fort, $SKIP)) {
														sofar = add(sofar, ONE_INTEGER);
														utilities_macros.note_percent_progress(sofar, total);
														if (((NIL != fort_types_interface.collectionP(fort)) && cardinality_estimates.instance_cardinality(fort).numL(multiply(TWO_INTEGER, max_items))) && cardinality_estimates.instance_cardinality(fort).numG(min_items)) {
															{
																SubLObject v_instances = isa.all_fort_instances(fort, domain_mt, UNPROVIDED);
																if ((NIL != list_utilities.lengthLE(v_instances, max_items, UNPROVIDED)) && (NIL != list_utilities.lengthGE(v_instances, min_items, UNPROVIDED))) {
																	format(T, $str_alt164$____S__S___S__, new SubLObject[] { number_utilities.f_1X(collections_done), number_of_samples, fort });
																	{
																		SubLObject disambiguation_mode_time = NIL;
																		SubLObject straight_time = NIL;
																		{
																			SubLObject time_var = get_internal_real_time();
																			pph_main.generate_disambiguation_phrases_for_java(v_instances, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
																			disambiguation_mode_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
																		}
																		{
																			SubLObject time_var = get_internal_real_time();
																			thread.resetMultipleValues();
																			{
																				SubLObject _prev_bind_0_57 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
																				try {
																					pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
																					{
																						SubLObject reuseP = thread.secondMultipleValue();
																						thread.resetMultipleValues();
																						try {
																							thread.resetMultipleValues();
																							{
																								SubLObject _prev_bind_0_58 = pph_macros.$pph_memoization_state$.currentBinding(thread);
																								try {
																									pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
																									{
																										SubLObject new_or_reused = thread.secondMultipleValue();
																										thread.resetMultipleValues();
																										{
																											SubLObject _prev_bind_0_59 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
																											try {
																												pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
																												{
																													SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
																													{
																														SubLObject _prev_bind_0_60 = memoization_state.$memoization_state$.currentBinding(thread);
																														try {
																															memoization_state.$memoization_state$.bind(local_state, thread);
																															{
																																final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
																																try {
																																	Mapping.mapcar(GENERATE_PHRASE_FOR_JAVA, v_instances);
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
																															memoization_state.$memoization_state$.rebind(_prev_bind_0_60, thread);
																														}
																													}
																												}
																											} finally {
																												pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_59, thread);
																											}
																										}
																										if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
																											memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
																										}
																									}
																								} finally {
																									pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_58, thread);
																								}
																							}
																						} finally {
																							{
																								SubLObject _prev_bind_0_62 = $is_thread_performing_cleanupP$.currentBinding(thread);
																								try {
																									$is_thread_performing_cleanupP$.bind(T, thread);
																									if (NIL == reuseP) {
																										pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
																									}
																								} finally {
																									$is_thread_performing_cleanupP$.rebind(_prev_bind_0_62, thread);
																								}
																							}
																						}
																					}
																				} finally {
																					pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_57, thread);
																				}
																			}
																			straight_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
																		}
																		$pph_disambiguation_mode_stats$.setDynamicValue(cons(list(fort, length(v_instances), disambiguation_mode_time, straight_time), $pph_disambiguation_mode_stats$.getDynamicValue(thread)), thread);
																		format(T, $str_alt166$___instances___S_disamb___S_strai, new SubLObject[] { length(v_instances), disambiguation_mode_time, straight_time });
																	}
																	collections_done = add(collections_done, ONE_INTEGER);
																	doneP = numGE(collections_done, number_of_samples);
																}
															}
														}
													}
													id = id_index.do_id_index_next_id(table_var, T, id, state_var);
													state_var = id_index.do_id_index_next_state(table_var, T, id, state_var);
												}
											}
										}
									}
								}
							}
							utilities_macros.noting_percent_progress_postamble();
						} finally {
							utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
							utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
							utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
							utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
						}
					}
				}
			}
			$pph_disambiguation_mode_stats$.setDynamicValue(reverse($pph_disambiguation_mode_stats$.getDynamicValue(thread)), thread);
			return $pph_disambiguation_mode_stats$.getDynamicValue(thread);
		}
	}

	/**
	 * Output STATS to FILE-NAME as comma-separated values.
	 */
	public static final SubLObject print_pph_disambiguation_stats_to_csv(SubLObject file_name, SubLObject stats) {
		if (file_name == UNPROVIDED) {
			file_name = $str_alt167$pph_disambiguation_stats;
		}
		if (stats == UNPROVIDED) {
			stats = $pph_disambiguation_mode_stats$.getDynamicValue();
		}
		SubLTrampolineFile.checkType(file_name, STRINGP);
		if (NIL == string_utilities.ends_with(file_name, $str_alt168$_csv, UNPROVIDED)) {
			file_name = cconcatenate(file_name, $str_alt168$_csv);
		}
		if (NIL != Filesys.probe_file(file_name)) {
			Filesys.delete_file(file_name);
		}
		{
			SubLObject stream_var = NIL;
			try {
				stream_var = StreamsLow.open(file_name, new SubLObject[] { $DIRECTION, $OUTPUT, $IF_DOES_NOT_EXIST, $CREATE });
				{
					SubLObject out_stream = stream_var;
					format(out_stream, $str_alt171$Fort____Instances__Disamb_Time__N);
					{
						SubLObject list_var = NIL;
						SubLObject item = NIL;
						SubLObject i = NIL;
						for (list_var = stats, item = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), item = list_var.first(), i = add(ONE_INTEGER, i)) {
							if (i.isZero()) {
							} else {
								{
									SubLObject datum = item;
									SubLObject current = datum;
									SubLObject fort = NIL;
									SubLObject instance_count = NIL;
									SubLObject disambiguation_mode_time = NIL;
									SubLObject straight_time = NIL;
									destructuring_bind_must_consp(current, datum, $list_alt172);
									fort = current.first();
									current = current.rest();
									destructuring_bind_must_consp(current, datum, $list_alt172);
									instance_count = current.first();
									current = current.rest();
									destructuring_bind_must_consp(current, datum, $list_alt172);
									disambiguation_mode_time = current.first();
									current = current.rest();
									destructuring_bind_must_consp(current, datum, $list_alt172);
									straight_time = current.first();
									current = current.rest();
									if (NIL == current) {
										format(out_stream, $str_alt173$_S___S___S___S__, new SubLObject[] { fort, instance_count, disambiguation_mode_time, straight_time });
									} else {
										cdestructuring_bind_error(datum, $list_alt172);
									}
								}
							}
						}
					}
				}
			} finally {
				{
					SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
					try {
						bind($is_thread_performing_cleanupP$, T);
						if (NIL != stream_var) {
							close(stream_var, UNPROVIDED);
						}
					} finally {
						rebind($is_thread_performing_cleanupP$, _prev_bind_0);
					}
				}
			}
		}
		return file_name;
	}

	public static final SubLObject declare_pph_diagnostics_file() {
		declareFunction("image_elapsed_cpu_time", "IMAGE-ELAPSED-CPU-TIME", 0, 0, false);
		declareFunction("ps_result_string_for_process_id", "PS-RESULT-STRING-FOR-PROCESS-ID", 0, 0, false);
		declareFunction("time_string_from_ps_result_string", "TIME-STRING-FROM-PS-RESULT-STRING", 2, 0, false);
		declareMacro("computing_cpu_time", "COMPUTING-CPU-TIME");
		declareFunction("block_process", "BLOCK-PROCESS", 1, 0, false);
		declareFunction("block_all_other_processes", "BLOCK-ALL-OTHER-PROCESSES", 0, 0, false);
		declareMacro("blocking_all_other_processes", "BLOCKING-ALL-OTHER-PROCESSES");
		declareFunction("clear_paraphrase_utility_table", "CLEAR-PARAPHRASE-UTILITY-TABLE", 0, 0, false);
		declareFunction("clear_pg_test_constants", "CLEAR-PG-TEST-CONSTANTS", 0, 2, false);
		declareFunction("get_one_pg_test_term", "GET-ONE-PG-TEST-TERM", 1, 1, false);
		declareFunction("maybe_gentemp_test_term", "MAYBE-GENTEMP-TEST-TERM", 2, 1, false);
		declareFunction("test_gen", "TEST-GEN", 1, 2, false);
		declareMacro("test_gen_precise", "TEST-GEN-PRECISE");
		declareFunction("test_gen_question", "TEST-GEN-QUESTION", 1, 4, false);
		declareMacro("test_gen_rkf", "TEST-GEN-RKF");
		declareMacro("test_gen_html", "TEST-GEN-HTML");
		declareFunction("test_genformat", "TEST-GENFORMAT", 1, 2, false);
		declareFunction("test_genformat_templates", "TEST-GENFORMAT-TEMPLATES", 1, 2, false);
		declareFunction("save_genformat_tests", "SAVE-GENFORMAT-TESTS", 2, 1, false);
		declareFunction("test_gentemplate", "TEST-GENTEMPLATE", 0, 1, false);
		declareFunction("test_gentemplate_pred", "TEST-GENTEMPLATE-PRED", 0, 2, false);
		declareFunction("test_gentemplate_for_reln", "TEST-GENTEMPLATE-FOR-RELN", 1, 1, false);
		declareFunction("test_rkf_summary_generation", "TEST-RKF-SUMMARY-GENERATION", 1, 1, false);
		declareFunction("pg_term_assertions", "PG-TERM-ASSERTIONS", 1, 1, false);
		declareFunction("generate_for_term", "GENERATE-FOR-TERM", 1, 5, false);
		declareFunction("print_term_english", "PRINT-TERM-ENGLISH", 1, 1, false);
		declareFunction("generate_to_file", "GENERATE-TO-FILE", 2, 3, false);
		declareFunction("no_genformat_templates", "NO-GENFORMAT-TEMPLATES", 1, 0, false);
		declareFunction("redundant_genformat_templates", "REDUNDANT-GENFORMAT-TEMPLATES", 1, 0, false);
		declareFunction("terms_missing_preferred_words", "TERMS-MISSING-PREFERRED-WORDS", 0, 2, false);
		declareFunction("preferred_terms_missing_denotations", "PREFERRED-TERMS-MISSING-DENOTATIONS", 0, 1, false);
		declareFunction("constantless_arglist", "CONSTANTLESS-ARGLIST", 1, 0, false);
		declareFunction("pph_cinc_method_count", "PPH-CINC-METHOD-COUNT", 1, 1, false);
		declareFunction("pph_method_hash_to_list", "PPH-METHOD-HASH-TO-LIST", 0, 1, false);
		declareFunction("find_rules", "FIND-RULES", 1, 0, false);
		declareFunction("type_assertions", "TYPE-ASSERTIONS", 0, 0, false);
		declareFunction("old_thcl_gafs", "OLD-THCL-GAFS", 0, 1, false);
		declareFunction("thcl_gafs_without_duplicate_terms", "THCL-GAFS-WITHOUT-DUPLICATE-TERMS", 0, 1, false);
		declareFunction("update_pph_benchmark_gafs_in_kb", "UPDATE-PPH-BENCHMARK-GAFS-IN-KB", 0, 2, false);
		declareFunction("pph_benchmark_thcl_gafs", "PPH-BENCHMARK-THCL-GAFS", 0, 0, false);
		declareFunction("initialize_pph_benchmark_thcl_gafs_from_kb", "INITIALIZE-PPH-BENCHMARK-THCL-GAFS-FROM-KB", 0, 0, false);
		declareFunction("run_pph_benchmark_test", "RUN-PPH-BENCHMARK-TEST", 0, 0, false);
		declareFunction("pph_initialize_random_assertions", "PPH-INITIALIZE-RANDOM-ASSERTIONS", 0, 3, false);
		declareFunction("pph_ensure_random_assertions", "PPH-ENSURE-RANDOM-ASSERTIONS", 0, 3, false);
		declareFunction("pph_random_assertion_test", "PPH-RANDOM-ASSERTION-TEST", 0, 4, false);
		declareFunction("pph_assertion_paraphrase_test", "PPH-ASSERTION-PARAPHRASE-TEST", 1, 1, false);
		declareFunction("pph_initialize_random_query_sentences", "PPH-INITIALIZE-RANDOM-QUERY-SENTENCES", 0, 4, false);
		declareFunction("random_query_sentence", "RANDOM-QUERY-SENTENCE", 0, 0, false);
		declareFunction("pph_ensure_random_query_sentences", "PPH-ENSURE-RANDOM-QUERY-SENTENCES", 0, 3, false);
		declareFunction("pph_random_query_sentence_test", "PPH-RANDOM-QUERY-SENTENCE-TEST", 0, 4, false);
		declareFunction("pph_gather_collection_type_gafs", "PPH-GATHER-COLLECTION-TYPE-GAFS", 0, 2, false);
		declareFunction("pph_find_collection_type_gaf_for_type", "PPH-FIND-COLLECTION-TYPE-GAF-FOR-TYPE", 1, 0, false);
		declareFunction("pph_test_collection_type_gafs", "PPH-TEST-COLLECTION-TYPE-GAFS", 0, 2, false);
		declareFunction("pph_test_disambiguation_mode", "PPH-TEST-DISAMBIGUATION-MODE", 0, 4, false);
		declareFunction("print_pph_disambiguation_stats_to_csv", "PRINT-PPH-DISAMBIGUATION-STATS-TO-CSV", 0, 2, false);
		return NIL;
	}

	public static final SubLObject init_pph_diagnostics_file() {
		defparameter("*PARAPHRASE-UTILITY-TABLE*", NIL);
		defparameter("*PARAPHRASE-TEST-CONSTANTS*", NIL);
		defparameter("*TEST-CONSTANTS-IN-USE*", NIL);
		deflexical("*PPH-METHOD-COUNT*", NIL != boundp($pph_method_count$) ? ((SubLObject) ($pph_method_count$.getGlobalValue())) : make_hash_table($int$256, UNPROVIDED, UNPROVIDED));
		deflexical("*PPH-BENCHMARK-GAF-LIST-TERM*", $$ParaphraseBenchmarkGAFList);
		deflexical("*PPH-BENCHMARK-THCL-GAFS*", NIL != boundp($pph_benchmark_thcl_gafs$) ? ((SubLObject) ($pph_benchmark_thcl_gafs$.getGlobalValue())) : $UNINITIALIZED);
		deflexical("*PPH-RANDOM-ASSERTIONS*", NIL != boundp($pph_random_assertions$) ? ((SubLObject) ($pph_random_assertions$.getGlobalValue())) : NIL);
		deflexical("*PPH-RANDOM-QUERY-SENTENCES*", NIL != boundp($pph_random_query_sentences$) ? ((SubLObject) ($pph_random_query_sentences$.getGlobalValue())) : NIL);
		deflexical("*PPH-COLLECTION-TYPE-GAFS*", NIL != boundp($pph_collection_type_gafs$) ? ((SubLObject) ($pph_collection_type_gafs$.getGlobalValue())) : NIL);
		defparameter("*PPH-DISAMBIGUATION-MODE-STATS*", NIL);
		return NIL;
	}

	public static final SubLObject setup_pph_diagnostics_file() {
		utilities_macros.register_html_state_variable($paraphrase_utility_table$);
		subl_macro_promotions.declare_defglobal($pph_method_count$);
		subl_macro_promotions.declare_defglobal($pph_benchmark_thcl_gafs$);
		subl_macro_promotions.declare_defglobal($pph_random_assertions$);
		subl_macro_promotions.declare_defglobal($pph_random_query_sentences$);
		subl_macro_promotions.declare_defglobal($pph_collection_type_gafs$);
		return NIL;
	}

	// // Internal Constants
	public static final SubLSymbol $paraphrase_utility_table$ = makeSymbol("*PARAPHRASE-UTILITY-TABLE*");

	static private final SubLList $list_alt1 = list(makeString(":"), makeString("-"));

	static private final SubLString $$$ps = makeString("ps");

	static private final SubLString $str_alt3$_el = makeString("-el");

	static private final SubLString $str_alt4$_PID_ = makeString(" PID ");

	static private final SubLString $str_alt5$_ = makeString(" ");

	static private final SubLString $str_alt6$_TIME_ = makeString(" TIME ");

	static private final SubLString $str_alt7$00_00_00 = makeString("00:00:00");

	static private final SubLList $list_alt8 = list(makeSymbol("VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

	static private final SubLSymbol $sym9$START = makeUninternedSymbol("START");

	static private final SubLList $list_alt11 = list(list(makeSymbol("IMAGE-ELAPSED-CPU-TIME")));

	static private final SubLSymbol $sym14$_ = makeSymbol("-");

	static private final SubLList $list_alt15 = list(makeSymbol("IMAGE-ELAPSED-CPU-TIME"));

	private static final SubLSymbol PROCESS_BLOCK = makeSymbol("PROCESS-BLOCK");

	static private final SubLString $$$Sleeping = makeString("Sleeping");

	static private final SubLSymbol $sym18$BLOCKED_PROCESSES = makeUninternedSymbol("BLOCKED-PROCESSES");

	static private final SubLList $list_alt19 = list(list(makeSymbol("BLOCK-ALL-OTHER-PROCESSES")));

	static private final SubLList $list_alt23 = list(QUOTE, makeSymbol("PROCESS-UNBLOCK"));

	static private final SubLString $str_alt26$__Killing__s_____ = makeString("~%Killing ~s ... ");

	static private final SubLString $str_alt28$done_ = makeString("done.");

	static private final SubLString $str_alt29$_ = makeString("-");

	public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

	static private final SubLList $list_alt35 = list(makeSymbol("OBJECT"), makeSymbol("&OPTIONAL"), list(makeSymbol("NL-PREDS"), makeKeyword("ANY")));

	private static final SubLSymbol WITH_PRECISE_PARAPHRASE_ON = makeSymbol("WITH-PRECISE-PARAPHRASE-ON");

	private static final SubLSymbol TEST_GEN = makeSymbol("TEST-GEN");

	static private final SubLList $list_alt38 = list(makeSymbol("OBJECT"), makeSymbol("&OPTIONAL"), list(makeSymbol("NL-PREDS"), makeKeyword("ANY")), list(makeSymbol("MODE"), $TEXT));

	static private final SubLList $list_alt39 = list(list(makeSymbol("*PPH-LANGUAGE-MT*"), constant_handles.reader_make_constant_shell(makeString("RKFParaphraseMt"))));

	static private final SubLList $list_alt40 = list($HTML);

	static private final SubLList $list_alt41 = list(constant_handles.reader_make_constant_shell(makeString("LogicalConnective")), constant_handles.reader_make_constant_shell(makeString("Quantifier")), constant_handles.reader_make_constant_shell(makeString("VariableArityRelation")));

	static private final SubLString $$$Term = makeString("Term");

	static private final SubLString $str_alt43$_________________________________ = makeString("~%~%;; ---------------------------------------------");

	static private final SubLString $str_alt44$_______Relation___s = makeString("~%~%;; Relation: ~s");

	static private final SubLString $str_alt45$_______Template___s = makeString("~%~%;; Template: ~s");

	static private final SubLString $str_alt46$_______CycL___s = makeString("~%~%;; CycL: ~s");

	static private final SubLString $str_alt47$_______Text___s = makeString("~%~%;; Text: ~s");

	static private final SubLString $str_alt48$_______ke_unassert__s__s_ = makeString("~%~%; (ke-unassert ~s ~s)");

	public static final SubLObject $$EnglishParaphraseMt = constant_handles.reader_make_constant_shell(makeString("EnglishParaphraseMt"));

	static private final SubLString $str_alt50$_____ke_assert__s__s_ = makeString("~%; (ke-assert ~s ~s)");

	static private final SubLString $str_alt52$Unable_to_open__S = makeString("Unable to open ~S");

	static private final SubLString $str_alt53$_____s = makeString("~%~%~s");

	static private final SubLList $list_alt54 = list(makeSymbol("IN-PACKAGE"), makeString("CYC"));

	public static final SubLObject $$NLTemplateGenerationPredicate = constant_handles.reader_make_constant_shell(makeString("NLTemplateGenerationPredicate"));

	static private final SubLString $str_alt61$_A_is_not_a__A = makeString("~A is not a ~A");

	static private final SubLString $$$continue_anyway = makeString("continue anyway");

	static private final SubLString $str_alt66$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

	static private final SubLString $str_alt67$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

	static private final SubLList $list_alt68 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

	static private final SubLString $str_alt69$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

	public static final SubLObject $$genTemplate = constant_handles.reader_make_constant_shell(makeString("genTemplate"));

	public static final SubLObject $$termOfUnit = constant_handles.reader_make_constant_shell(makeString("termOfUnit"));

	static private final SubLString $str_alt72$___S_____S__ = makeString("~%~S:~% ~S~%");

	public static final SubLObject $$DataForNLMt = constant_handles.reader_make_constant_shell(makeString("DataForNLMt"));

	public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

	public static final SubLObject $$myCreator = constant_handles.reader_make_constant_shell(makeString("myCreator"));

	static private final SubLString $str_alt78$______s___a = makeString("~%~%[~s] ~a");

	static private final SubLString $str_alt79$____ = makeString("~%~%");

	static private final SubLString $str_alt80$__a___a__ = makeString("[~a, ~a]:");

	static private final SubLString $str_alt81$_____Text___a = makeString("~%~% Text: ~a");

	static private final SubLString $str_alt82$No_text_generated_ = makeString("No text generated.");

	static private final SubLString $str_alt83$_____Formula___a = makeString("~%~% Formula: ~a");

	public static final SubLObject $$Relation = constant_handles.reader_make_constant_shell(makeString("Relation"));

	static private final SubLList $list_alt85 = list(constant_handles.reader_make_constant_shell(makeString("UnitOfMeasure")), constant_handles.reader_make_constant_shell(makeString("SkolemFunction")), constant_handles.reader_make_constant_shell(makeString("LFAttribute-Function")), constant_handles.reader_make_constant_shell(makeString("KSTerm")),
			constant_handles.reader_make_constant_shell(makeString("NLPredicate")));

	static private final SubLList $list_alt86 = list(constant_handles.reader_make_constant_shell(makeString("ThesaurusConstant")), constant_handles.reader_make_constant_shell(makeString("CycLReformulatorConstant")), constant_handles.reader_make_constant_shell(makeString("ProprietaryConstant")), constant_handles.reader_make_constant_shell(makeString("TestingConstant")),
			constant_handles.reader_make_constant_shell(makeString("CycLReformulatorConstant")), constant_handles.reader_make_constant_shell(makeString("TestingConstant")));

	public static final SubLObject $$genFormat = constant_handles.reader_make_constant_shell(makeString("genFormat"));

	static private final SubLString $str_alt88$______4F__of_tested_relations_lac = makeString("~%;; ~4F% of tested relations lack genFormats.~%;; ~a/~a relations without templates:");

	static private final SubLList $list_alt89 = list(constant_handles.reader_make_constant_shell(makeString("UnitOfMeasure")), constant_handles.reader_make_constant_shell(makeString("FixedAritySkolemFunction")), constant_handles.reader_make_constant_shell(makeString("LFAttribute-Function")));

	static private final SubLString $str_alt90$________a__a_relations_with_more_ = makeString("~%~%;; ~a/~a relations with more than one template:");

	public static final SubLInteger $int$500 = makeInteger(500);

	private static final SubLSymbol $STAND_IN_DENOTATION = makeKeyword("STAND-IN-DENOTATION");

	public static final SubLObject $$denotation = constant_handles.reader_make_constant_shell(makeString("denotation"));

	public static final SubLObject $$preferredGenUnit = constant_handles.reader_make_constant_shell(makeString("preferredGenUnit"));

	public static final SubLObject $$genPhrase = constant_handles.reader_make_constant_shell(makeString("genPhrase"));

	static private final SubLString $str_alt96$___a_constants_checked___a_of_whi = makeString("~%~a constants checked, ~a of which require a preferred word unit.");

	private static final SubLSymbol COERCE_NAME = makeSymbol("COERCE-NAME");

	static private final SubLString $str_alt99$___s = makeString("~%~s");

	static private final SubLList $list_alt100 = list(constant_handles.reader_make_constant_shell(makeString("preferredGenUnit")), constant_handles.reader_make_constant_shell(makeString("genPhrase")));

	public static final SubLInteger $int$50 = makeInteger(50);

	static private final SubLString $str_alt102$___a_constants_checked_ = makeString("~%~a constants checked.");

	public static final SubLSymbol $pph_method_count$ = makeSymbol("*PPH-METHOD-COUNT*");

	static private final SubLSymbol $sym105$_ = makeSymbol(">");

	static private final SubLString $$$mapping_Cyc_assertions = makeString("mapping Cyc assertions");

	static private final SubLString $str_alt110$Categorizing_assertions_by___of_a = makeString("Categorizing assertions by # of antecedent clauses...");

	static private final SubLString $str_alt111$__neglits__assertions____________ = makeString("~%neglits  assertions~%===========================~%");

	static private final SubLString $str_alt112$total___12D__ = makeString("total: ~12D~%");

	static private final SubLString $str_alt113$___4D___13D___4F____ = makeString("~&~4D: ~13D (~4F%)~%");

	public static final SubLInteger $int$50000 = makeInteger(50000);

	static private final SubLString $str_alt115$Finding_THCL_GAFs_asserted_prior_ = makeString("Finding THCL GAFs asserted prior to ");

	static private final SubLSymbol $sym116$_ = makeSymbol("<");

	public static final SubLObject $$ParaphraseBenchmarkGAFList = constant_handles.reader_make_constant_shell(makeString("ParaphraseBenchmarkGAFList"));

	public static final SubLObject $$Baxter = constant_handles.reader_make_constant_shell(makeString("Baxter"));

	public static final SubLObject $$nthInOrdering = constant_handles.reader_make_constant_shell(makeString("nthInOrdering"));

	public static final SubLObject $$ParaphraseMt = constant_handles.reader_make_constant_shell(makeString("ParaphraseMt"));

	public static final SubLSymbol $pph_benchmark_thcl_gafs$ = makeSymbol("*PPH-BENCHMARK-THCL-GAFS*");

	static private final SubLList $list_alt126 = list(TWO_INTEGER, THREE_INTEGER);

	static private final SubLString $str_alt127$No_benchmark_GAFs_found_ = makeString("No benchmark GAFs found.");

	static private final SubLString $str_alt128$Duplicate_GAF_numbers_found___S = makeString("Duplicate GAF numbers found: ~S");

	static private final SubLString $str_alt131$non_GAF___S = makeString("non-GAF: ~S");

	static private final SubLString $str_alt132$GAF__S_is_missing = makeString("GAF ~S is missing");

	private static final SubLSymbol PROCESS_UNBLOCK = makeSymbol("PROCESS-UNBLOCK");

	public static final SubLSymbol $pph_random_assertions$ = makeSymbol("*PPH-RANDOM-ASSERTIONS*");

	static private final SubLString $str_alt135$Gathering_random_assertions___ = makeString("Gathering random assertions...");

	static private final SubLSymbol $sym137$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");

	static private final SubLSymbol $sym138$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");

	static private final SubLString $str_alt141$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

	static private final SubLString $str_alt142$Paraphrasing_assertions___ = makeString("Paraphrasing assertions...");

	static private final SubLList $list_alt144 = list(makeSymbol("AS"), makeSymbol("PARAPHRASE"), makeSymbol("TIME"));

	static private final SubLString $str_alt145$____Paraphrased__D_assertions_in_ = makeString("~%~%Paraphrased ~D assertions in ~3,3F real-time seconds (~D seconds of CPU time).~%");

	static private final SubLString $str_alt147$__Mean____4F_Median____4F_Standar = makeString("~&Mean: ~,4F Median: ~,4F Standard deviation: ~,4F~% Paraphrases per second: ~4,2F~% Paraphrases per CPU second: ~4,2F");

	public static final SubLSymbol $pph_random_query_sentences$ = makeSymbol("*PPH-RANDOM-QUERY-SENTENCES*");

	static private final SubLString $str_alt149$Gathering_random_query_sentences_ = makeString("Gathering random query sentences...");

	public static final SubLObject $$SchemaObjectFn = constant_handles.reader_make_constant_shell(makeString("SchemaObjectFn"));

	public static final SubLObject $const151$sentenceParameterValueInSpecifica = constant_handles.reader_make_constant_shell(makeString("sentenceParameterValueInSpecification"));

	public static final SubLObject $$InferenceSentenceParameter = constant_handles.reader_make_constant_shell(makeString("InferenceSentenceParameter"));

	public static final SubLObject $const153$softwareParameterValueInSpecifica = constant_handles.reader_make_constant_shell(makeString("softwareParameterValueInSpecification"));

	static private final SubLSymbol $sym154$ATOMIC_SENTENCE_ = makeSymbol("ATOMIC-SENTENCE?");

	static private final SubLString $str_alt155$Paraphrasing_query_sentences___ = makeString("Paraphrasing query-sentences...");

	static private final SubLList $list_alt156 = list(makeSymbol("QUERY-SENTENCE"), makeSymbol("PARAPHRASE"), makeSymbol("TIME"));

	static private final SubLString $str_alt157$____Paraphrased__D_random_query_s = makeString("~%~%Paraphrased ~D random query sentences in ~3,3F real-time seconds.~%");

	public static final SubLSymbol $pph_collection_type_gafs$ = makeSymbol("*PPH-COLLECTION-TYPE-GAFS*");

	public static final SubLObject $$CollectionType = constant_handles.reader_make_constant_shell(makeString("CollectionType"));

	static private final SubLString $str_alt161$___S_____A____ = makeString("~&~S:~% ~A~%~%");

	public static final SubLInteger $int$250 = makeInteger(250);

	static private final SubLString $str_alt163$Testing_Disambiguation_mode___ = makeString("Testing Disambiguation mode...");

	static private final SubLString $str_alt164$____S__S___S__ = makeString("~&[~S/~S] ~S: ");

	private static final SubLSymbol GENERATE_PHRASE_FOR_JAVA = makeSymbol("GENERATE-PHRASE-FOR-JAVA");

	static private final SubLString $str_alt166$___instances___S_disamb___S_strai = makeString("~& instances: ~S disamb: ~S straight: ~S");

	static private final SubLString $str_alt167$pph_disambiguation_stats = makeString("pph-disambiguation-stats");

	static private final SubLString $str_alt168$_csv = makeString(".csv");

	private static final SubLSymbol $IF_DOES_NOT_EXIST = makeKeyword("IF-DOES-NOT-EXIST");

	static private final SubLString $str_alt171$Fort____Instances__Disamb_Time__N = makeString("Fort, # Instances, Disamb Time, Normal Paraphrase Time~%");

	static private final SubLList $list_alt172 = list(makeSymbol("FORT"), makeSymbol("INSTANCE-COUNT"), makeSymbol("DISAMBIGUATION-MODE-TIME"), makeSymbol("STRAIGHT-TIME"));

	static private final SubLString $str_alt173$_S___S___S___S__ = makeString("~S, ~S, ~S, ~S~%");

	// // Initializers
	public void declareFunctions() {
		declare_pph_diagnostics_file();
	}

	public void initializeVariables() {
		init_pph_diagnostics_file();
	}

	public void runTopLevelForms() {
		setup_pph_diagnostics_file();
	}
}
