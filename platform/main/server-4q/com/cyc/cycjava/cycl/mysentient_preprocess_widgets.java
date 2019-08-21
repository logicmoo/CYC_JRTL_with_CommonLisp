/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.rtp.iterative_template_parser;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      MYSENTIENT-PREPROCESS-WIDGETS
 *  source file: /cyc/top/cycl/mysentient-preprocess-widgets.lisp
 *  created:     2019/07/03 17:39:02
 */
public final class mysentient_preprocess_widgets extends SubLTranslatedFile implements V02 {
    // // Constructor
    private mysentient_preprocess_widgets() {
    }

    public static final SubLFile me = new mysentient_preprocess_widgets();


    // // Definitions
    // defparameter
    private static final SubLSymbol $mys_default_sentence_parse_weight$ = makeSymbol("*MYS-DEFAULT-SENTENCE-PARSE-WEIGHT*");

    public static final SubLObject with_mys_preprocessing_partial_results_accumulation(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt1);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject ans = NIL;
		    SubLObject threshold = NIL;
		    SubLObject notification_function_spec = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt1);
		    ans = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt1);
		    threshold = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt1);
		    notification_function_spec = current.first();
		    current = current.rest();
		    if (NIL == current) {
			current = temp;
			{
			    SubLObject body = current;
			    return list(CLET, listS($list_alt3, $list_alt4, $list_alt5, list($partial_results_notification_fn$, notification_function_spec), $list_alt7), listS(WITH_PARTIAL_RESULTS_ACCUMULATION, list(ans, threshold), append(body, NIL)));
			}
		    } else {
			cdestructuring_bind_error(datum, $list_alt1);
		    }
		}
	    }
	}
	return NIL;
    }

    /**
     * Don't try to parse sentences longer than this many characters.
     */
    // deflexical
    public static final SubLSymbol $sentence_of_type_semantics_length_cutoff$ = makeSymbol("*SENTENCE-OF-TYPE-SEMANTICS-LENGTH-CUTOFF*");

    // defparameter
    public static final SubLSymbol $mysentient_extra_chart_cache$ = makeSymbol("*MYSENTIENT-EXTRA-CHART-CACHE*");

    public static final SubLObject myse_possibly_add_chart(SubLObject chart, SubLObject key) {
	if (key == UNPROVIDED) {
	    key = $myse_extra_psp_chart_key$.getDynamicValue();
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    dictionary_utilities.dictionary_pushnew($mysentient_extra_chart_cache$.getDynamicValue(thread), key, chart, EQUAL, UNPROVIDED);
	    return dictionary.dictionary_lookup($mysentient_extra_chart_cache$.getDynamicValue(thread), key, UNPROVIDED);
	}
    }

    public static final SubLObject with_mysentient_psp_charts(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt11);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject string = NIL;
		    SubLObject mt = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt11);
		    string = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt11);
		    mt = current.first();
		    current = current.rest();
		    if (NIL == current) {
			current = temp;
			{
			    SubLObject body = current;
			    if (string.isString()) {
				{
				    SubLObject charts = $sym12$CHARTS;
				    return list(CLET, list(list($myse_extra_psp_chart_key$, list(CONS, mt, string)), bq_cons(charts, $list_alt15)), listS(WITH_EXTRA_PSP_CHARTS, list(charts), append(body, NIL)));
				}
			    } else {
				return bq_cons(PROGN, append(body, NIL));
			    }
			}
		    } else {
			cdestructuring_bind_error(datum, $list_alt11);
		    }
		}
	    }
	}
	return NIL;
    }

    public static final SubLObject with_mysentient_psp_charts_final(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt11);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject string = NIL;
		    SubLObject mt = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt11);
		    string = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt11);
		    mt = current.first();
		    current = current.rest();
		    if (NIL == current) {
			current = temp;
			{
			    SubLObject body = current;
			    if (string.isString()) {
				{
				    SubLObject charts = $sym19$CHARTS;
				    return listS(CLET, list(list($myse_extra_psp_chart_key$, list(CONS, mt, string)), bq_cons(charts, $list_alt15)), listS(WITH_EXTRA_PSP_CHARTS, list(charts), append(body, NIL)), $list_alt20);
				}
			    } else {
				return bq_cons(PROGN, append(body, NIL));
			    }
			}
		    } else {
			cdestructuring_bind_error(datum, $list_alt11);
		    }
		}
	    }
	}
	return NIL;
    }

    public static final SubLObject myse_get_psp_charts(SubLObject key) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject charts = dictionary.dictionary_lookup($mysentient_extra_chart_cache$.getDynamicValue(thread), key, UNPROVIDED);
		return charts;
	    }
	}
    }

    public static final SubLObject myse_uncache_charts(SubLObject key) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject charts = dictionary.dictionary_lookup($mysentient_extra_chart_cache$.getDynamicValue(thread), key, UNPROVIDED);
		SubLObject cdolist_list_var = charts;
		SubLObject chart = NIL;
		for (chart = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), chart = cdolist_list_var.first()) {
		    psp_chart.destroy_psp_chart(chart);
		}
		dictionary.dictionary_remove($mysentient_extra_chart_cache$.getDynamicValue(thread), key);
		return NIL;
	    }
	}
    }

    // defvar
    private static final SubLSymbol $mys_preprocessor_profiling_on$ = makeSymbol("*MYS-PREPROCESSOR-PROFILING-ON*");

    /**
     * how much should spell-check corrections be discounted relative to non-spell-checked results
     */
    // defparameter
    private static final SubLSymbol $mys_spell_check_multiplier$ = makeSymbol("*MYS-SPELL-CHECK-MULTIPLIER*");

    /**
     * What are the possible semantic meanings for NP-STRING
     *
     * @param spelling-corrections
     * 		LISTP; a list of strings that correspond to alternate spellings (for the entire NP)
     */
    public static final SubLObject np_semantics(SubLObject np_string, SubLObject mt, SubLObject spelling_corrections, SubLObject context_string) {
	if (mt == UNPROVIDED) {
	    mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
	}
	if (spelling_corrections == UNPROVIDED) {
	    spelling_corrections = NIL;
	}
	if (context_string == UNPROVIDED) {
	    context_string = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(np_string, STRINGP);
	    SubLTrampolineFile.checkType(mt, $sym23$HLMT_);
	    SubLTrampolineFile.checkType(spelling_corrections, LISTP);
	    {
		SubLObject ans = NIL;
		SubLObject strings_and_multipliers = list(list(np_string, ONE_INTEGER));
		{
		    SubLObject cdolist_list_var = spelling_corrections;
		    SubLObject fix = NIL;
		    for (fix = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), fix = cdolist_list_var.first()) {
			strings_and_multipliers = cons(list(fix, $mys_spell_check_multiplier$.getDynamicValue(thread)), strings_and_multipliers);
		    }
		}
		strings_and_multipliers = reverse(strings_and_multipliers);
		{
		    SubLObject _prev_bind_0 = utilities_macros.$partial_results_initialization_fn$.currentBinding(thread);
		    SubLObject _prev_bind_1 = utilities_macros.$partial_results_accumulation_fn$.currentBinding(thread);
		    SubLObject _prev_bind_2 = utilities_macros.$partial_results_consolidation_fn$.currentBinding(thread);
		    SubLObject _prev_bind_3 = utilities_macros.$partial_results_notification_fn$.currentBinding(thread);
		    SubLObject _prev_bind_4 = utilities_macros.$partial_results_final_result_fn$.currentBinding(thread);
		    SubLObject _prev_bind_5 = utilities_macros.$partial_results_accumulator$.currentBinding(thread);
		    SubLObject _prev_bind_6 = utilities_macros.$partial_results_total_accumulator$.currentBinding(thread);
		    SubLObject _prev_bind_7 = utilities_macros.$partial_results_threshold$.currentBinding(thread);
		    SubLObject _prev_bind_8 = utilities_macros.$partial_results_size$.currentBinding(thread);
		    SubLObject _prev_bind_9 = utilities_macros.$partial_results_total_size$.currentBinding(thread);
		    SubLObject _prev_bind_10 = utilities_macros.$accumulating_partial_resultsP$.currentBinding(thread);
		    try {
			utilities_macros.$partial_results_initialization_fn$.bind(INITIALIZE_MYS_PREPROCESS_RESULTS, thread);
			utilities_macros.$partial_results_accumulation_fn$.bind(ACCUMULATE_MYS_PREPROCESS_RESULTS, thread);
			utilities_macros.$partial_results_consolidation_fn$.bind(CONSOLIDATE_MYS_PREPROCESS_RESULTS, thread);
			utilities_macros.$partial_results_notification_fn$.bind(utilities_macros.$partial_results_notification_fn$.getDynamicValue(thread), thread);
			utilities_macros.$partial_results_final_result_fn$.bind(FINAL_RESULTS_FOR_MYS_PREPROCESS, thread);
			utilities_macros.$partial_results_accumulator$.bind(funcall(utilities_macros.$partial_results_initialization_fn$.getDynamicValue(thread)), thread);
			utilities_macros.$partial_results_total_accumulator$.bind(funcall(utilities_macros.$partial_results_initialization_fn$.getDynamicValue(thread)), thread);
			utilities_macros.$partial_results_threshold$.bind(ONE_INTEGER, thread);
			utilities_macros.$partial_results_size$.bind(ZERO_INTEGER, thread);
			utilities_macros.$partial_results_total_size$.bind(ZERO_INTEGER, thread);
			utilities_macros.$accumulating_partial_resultsP$.bind(T, thread);
			try {
			    {
				SubLObject _prev_bind_0_1 = parsing_vars.$psp_return_mode$.currentBinding(thread);
				SubLObject _prev_bind_1_2 = rkf_formula_optimizer.$rkf_reformulator_replace_pronounsP$.currentBinding(thread);
				SubLObject _prev_bind_2_3 = parsing_vars.$psp_dont_destroy_chartP$.currentBinding(thread);
				SubLObject _prev_bind_3_4 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
				try {
				    parsing_vars.$psp_return_mode$.bind($BEST_ONLY, thread);
				    rkf_formula_optimizer.$rkf_reformulator_replace_pronounsP$.bind(NIL, thread);
				    parsing_vars.$psp_dont_destroy_chartP$.bind(T, thread);
				    lexicon_vars.$lexicon_lookup_mt$.bind(mt, thread);
				    {
					SubLObject error = NIL;
					{
					    SubLObject _prev_bind_0_5 = parsing_vars.$psp_pos_pred_filterP$.currentBinding(thread);
					    try {
						parsing_vars.$psp_pos_pred_filterP$.bind(T, thread);
						{
						    SubLObject start_index = NIL;
						    SubLObject end_index = NIL;
						    SubLObject chart = NIL;
						    if ((NIL == parsing_vars.$psp_chart$.getDynamicValue(thread)) || (NIL != parsing_macros.psp_chart_matches_gap_type_p(parsing_vars.$psp_chart$.getDynamicValue(thread), $NONE))) {
							thread.resetMultipleValues();
							{
							    SubLObject start_index_6 = psp_main.psp_find_string_in_charts(np_string, parsing_vars.$psp_chart$.getDynamicValue(thread), parsing_vars.$psp_extra_charts$.getDynamicValue(thread));
							    SubLObject end_index_7 = thread.secondMultipleValue();
							    SubLObject chart_8 = thread.thirdMultipleValue();
							    thread.resetMultipleValues();
							    start_index = start_index_6;
							    end_index = end_index_7;
							    chart = chart_8;
							}
						    }
						    if (NIL != start_index) {
							{
							    SubLObject _prev_bind_0_9 = parsing_vars.$psp_chart_start_index$.currentBinding(thread);
							    SubLObject _prev_bind_1_10 = parsing_vars.$psp_chart_end_index$.currentBinding(thread);
							    SubLObject _prev_bind_2_11 = parsing_vars.$psp_chart$.currentBinding(thread);
							    try {
								parsing_vars.$psp_chart_start_index$.bind(start_index, thread);
								parsing_vars.$psp_chart_end_index$.bind(end_index, thread);
								parsing_vars.$psp_chart$.bind(chart, thread);
								psp_syntax.psp_chart_do_syntactic_parsing(chart, UNPROVIDED, UNPROVIDED);
								myse_possibly_add_chart(parsing_vars.$psp_chart$.getDynamicValue(thread), UNPROVIDED);
								{
								    SubLObject cdolist_list_var = $list_alt35;
								    SubLObject category_pred = NIL;
								    for (category_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), category_pred = cdolist_list_var.first()) {
									{
									    SubLObject cdolist_list_var_12 = strings_and_multipliers;
									    SubLObject string_and_multiplier = NIL;
									    for (string_and_multiplier = cdolist_list_var_12.first(); NIL != cdolist_list_var_12; cdolist_list_var_12 = cdolist_list_var_12.rest(), string_and_multiplier = cdolist_list_var_12.first()) {
										{
										    SubLObject datum = string_and_multiplier;
										    SubLObject current = datum;
										    SubLObject np_string_13 = NIL;
										    SubLObject multiplier = NIL;
										    destructuring_bind_must_consp(current, datum, $list_alt31);
										    np_string_13 = current.first();
										    current = current.rest();
										    destructuring_bind_must_consp(current, datum, $list_alt31);
										    multiplier = current.first();
										    current = current.rest();
										    if (NIL == current) {
											{
											    SubLObject datum_14 = category_pred;
											    SubLObject current_15 = datum_14;
											    SubLObject cat = NIL;
											    SubLObject pred = NIL;
											    destructuring_bind_must_consp(current_15, datum_14, $list_alt32);
											    cat = current_15.first();
											    current_15 = current_15.rest();
											    destructuring_bind_must_consp(current_15, datum_14, $list_alt32);
											    pred = current_15.first();
											    current_15 = current_15.rest();
											    if (NIL == current_15) {
												try {
												    {
													SubLObject _prev_bind_0_16 = Errors.$error_handler$.currentBinding(thread);
													try {
													    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
													    try {
														thread.resetMultipleValues();
														{
														    SubLObject best = psp_main.ps_get_cycls_for_phrase(np_string_13, cat, pred, NIL, psp_lexicon.get_default_psp_lexicon(mt, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
														    SubLObject rest = thread.secondMultipleValue();
														    thread.resetMultipleValues();
														    {
															SubLObject cdolist_list_var_17 = best;
															SubLObject item = NIL;
															for (item = cdolist_list_var_17.first(); NIL != cdolist_list_var_17; cdolist_list_var_17 = cdolist_list_var_17.rest(), item = cdolist_list_var_17.first()) {
															    utilities_macros.add_result_to_partial_results_accumulator(list(item, multiply(multiplier, ONE_INTEGER)));
															}
														    }
														    {
															SubLObject cdolist_list_var_18 = rest;
															SubLObject item = NIL;
															for (item = cdolist_list_var_18.first(); NIL != cdolist_list_var_18; cdolist_list_var_18 = cdolist_list_var_18.rest(), item = cdolist_list_var_18.first()) {
															    utilities_macros.add_result_to_partial_results_accumulator(list(item, multiply(multiplier, $float$0_5)));
															}
														    }
														}
													    } catch (Throwable catch_var) {
														Errors.handleThrowable(catch_var, NIL);
													    }
													} finally {
													    Errors.$error_handler$.rebind(_prev_bind_0_16, thread);
													}
												    }
												} catch (Throwable ccatch_env_var) {
												    error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
												}
											    } else {
												cdestructuring_bind_error(datum_14, $list_alt32);
											    }
											}
										    } else {
											cdestructuring_bind_error(datum, $list_alt31);
										    }
										}
									    }
									}
								    }
								}
							    } finally {
								parsing_vars.$psp_chart$.rebind(_prev_bind_2_11, thread);
								parsing_vars.$psp_chart_end_index$.rebind(_prev_bind_1_10, thread);
								parsing_vars.$psp_chart_start_index$.rebind(_prev_bind_0_9, thread);
							    }
							}
						    } else {
							{
							    SubLObject _prev_bind_0_19 = parsing_vars.$psp_chart_start_index$.currentBinding(thread);
							    SubLObject _prev_bind_1_20 = parsing_vars.$psp_chart_end_index$.currentBinding(thread);
							    try {
								parsing_vars.$psp_chart_start_index$.bind(ZERO_INTEGER, thread);
								parsing_vars.$psp_chart_end_index$.bind(NIL, thread);
								{
								    SubLObject chart_21 = psp_syntax.psp_chart_for_string(np_string, parsing_macros.get_psp_lexicon(), $NONE, UNPROVIDED);
								    SubLObject local_state = psp_chart.psp_chart_memoization_state(chart_21);
								    {
									SubLObject _prev_bind_0_22 = memoization_state.$memoization_state$.currentBinding(thread);
									try {
									    memoization_state.$memoization_state$.bind(local_state, thread);
									    {
										final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
										try {
										    {
											SubLObject _prev_bind_0_23 = parsing_vars.$psp_chart$.currentBinding(thread);
											try {
											    parsing_vars.$psp_chart$.bind(chart_21, thread);
											    myse_possibly_add_chart(parsing_vars.$psp_chart$.getDynamicValue(thread), UNPROVIDED);
											    {
												SubLObject cdolist_list_var = $list_alt35;
												SubLObject category_pred = NIL;
												for (category_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), category_pred = cdolist_list_var.first()) {
												    {
													SubLObject cdolist_list_var_24 = strings_and_multipliers;
													SubLObject string_and_multiplier = NIL;
													for (string_and_multiplier = cdolist_list_var_24.first(); NIL != cdolist_list_var_24; cdolist_list_var_24 = cdolist_list_var_24.rest(), string_and_multiplier = cdolist_list_var_24.first()) {
													    {
														SubLObject datum = string_and_multiplier;
														SubLObject current = datum;
														SubLObject np_string_25 = NIL;
														SubLObject multiplier = NIL;
														destructuring_bind_must_consp(current, datum, $list_alt31);
														np_string_25 = current.first();
														current = current.rest();
														destructuring_bind_must_consp(current, datum, $list_alt31);
														multiplier = current.first();
														current = current.rest();
														if (NIL == current) {
														    {
															SubLObject datum_26 = category_pred;
															SubLObject current_27 = datum_26;
															SubLObject cat = NIL;
															SubLObject pred = NIL;
															destructuring_bind_must_consp(current_27, datum_26, $list_alt32);
															cat = current_27.first();
															current_27 = current_27.rest();
															destructuring_bind_must_consp(current_27, datum_26, $list_alt32);
															pred = current_27.first();
															current_27 = current_27.rest();
															if (NIL == current_27) {
															    try {
																{
																    SubLObject _prev_bind_0_28 = Errors.$error_handler$.currentBinding(thread);
																    try {
																	Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
																	try {
																	    thread.resetMultipleValues();
																	    {
																		SubLObject best = psp_main.ps_get_cycls_for_phrase(np_string_25, cat, pred, NIL, psp_lexicon.get_default_psp_lexicon(mt, UNPROVIDED, UNPROVIDED),
																			UNPROVIDED, UNPROVIDED);
																		SubLObject rest = thread.secondMultipleValue();
																		thread.resetMultipleValues();
																		{
																		    SubLObject cdolist_list_var_29 = best;
																		    SubLObject item = NIL;
																		    for (item = cdolist_list_var_29.first(); NIL != cdolist_list_var_29; cdolist_list_var_29 = cdolist_list_var_29.rest(), item = cdolist_list_var_29.first()) {
																			utilities_macros.add_result_to_partial_results_accumulator(list(item, multiply(multiplier, ONE_INTEGER)));
																		    }
																		}
																		{
																		    SubLObject cdolist_list_var_30 = rest;
																		    SubLObject item = NIL;
																		    for (item = cdolist_list_var_30.first(); NIL != cdolist_list_var_30; cdolist_list_var_30 = cdolist_list_var_30.rest(), item = cdolist_list_var_30.first()) {
																			utilities_macros.add_result_to_partial_results_accumulator(list(item, multiply(multiplier, $float$0_5)));
																		    }
																		}
																	    }
																	} catch (Throwable catch_var) {
																	    Errors.handleThrowable(catch_var, NIL);
																	}
																    } finally {
																	Errors.$error_handler$.rebind(_prev_bind_0_28, thread);
																    }
																}
															    } catch (Throwable ccatch_env_var) {
																error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
															    }
															} else {
															    cdestructuring_bind_error(datum_26, $list_alt32);
															}
														    }
														} else {
														    cdestructuring_bind_error(datum, $list_alt31);
														}
													    }
													}
												    }
												}
											    }
											    if (NIL == parsing_vars.$psp_dont_destroy_chartP$.getDynamicValue(thread)) {
												psp_chart.destroy_psp_chart(UNPROVIDED);
											    }
											} finally {
											    parsing_vars.$psp_chart$.rebind(_prev_bind_0_23, thread);
											}
										    }
										} finally {
										    {
											SubLObject _prev_bind_0_31 = $is_thread_performing_cleanupP$.currentBinding(thread);
											try {
											    $is_thread_performing_cleanupP$.bind(T, thread);
											    if ((NIL != local_state) && (NIL == original_memoization_process)) {
												memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
											    }
											} finally {
											    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_31, thread);
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
								parsing_vars.$psp_chart_end_index$.rebind(_prev_bind_1_20, thread);
								parsing_vars.$psp_chart_start_index$.rebind(_prev_bind_0_19, thread);
							    }
							}
						    }
						}
					    } finally {
						parsing_vars.$psp_pos_pred_filterP$.rebind(_prev_bind_0_5, thread);
					    }
					}
				    }
				} finally {
				    lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_3_4, thread);
				    parsing_vars.$psp_dont_destroy_chartP$.rebind(_prev_bind_2_3, thread);
				    rkf_formula_optimizer.$rkf_reformulator_replace_pronounsP$.rebind(_prev_bind_1_2, thread);
				    parsing_vars.$psp_return_mode$.rebind(_prev_bind_0_1, thread);
				}
			    }
			} finally {
			    {
				SubLObject _prev_bind_0_32 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
				    $is_thread_performing_cleanupP$.bind(T, thread);
				    funcall(utilities_macros.$partial_results_consolidation_fn$.getDynamicValue(thread), utilities_macros.$partial_results_accumulator$.getDynamicValue(thread));
				    ans = funcall(utilities_macros.$partial_results_final_result_fn$.getDynamicValue(thread), utilities_macros.$partial_results_total_accumulator$.getDynamicValue(thread));
				} finally {
				    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_32, thread);
				}
			    }
			}
		    } finally {
			utilities_macros.$accumulating_partial_resultsP$.rebind(_prev_bind_10, thread);
			utilities_macros.$partial_results_total_size$.rebind(_prev_bind_9, thread);
			utilities_macros.$partial_results_size$.rebind(_prev_bind_8, thread);
			utilities_macros.$partial_results_threshold$.rebind(_prev_bind_7, thread);
			utilities_macros.$partial_results_total_accumulator$.rebind(_prev_bind_6, thread);
			utilities_macros.$partial_results_accumulator$.rebind(_prev_bind_5, thread);
			utilities_macros.$partial_results_final_result_fn$.rebind(_prev_bind_4, thread);
			utilities_macros.$partial_results_notification_fn$.rebind(_prev_bind_3, thread);
			utilities_macros.$partial_results_consolidation_fn$.rebind(_prev_bind_2, thread);
			utilities_macros.$partial_results_accumulation_fn$.rebind(_prev_bind_1, thread);
			utilities_macros.$partial_results_initialization_fn$.rebind(_prev_bind_0, thread);
		    }
		}
		ans = delete_duplicates(ans, EQUAL, FIRST, UNPROVIDED, UNPROVIDED);
		ans = myse_delete_simpler_duplicates(ans);
		{
		    SubLObject terms_and_weights = list_utilities.make_paired_lists(ans);
		    return values(terms_and_weights.first(), second(terms_and_weights));
		}
	    }
	}
    }

    // defparameter
    private static final SubLSymbol $duplicate_comparison_list$ = makeSymbol("*DUPLICATE-COMPARISON-LIST*");

    /**
     *
     *
     * @unknown needed because you can't easily specify which should be deleted when using
    DELETE-DUPLICATES.  One possible solution would be to sort the terms according
    to complexity, and then delete-duplicates using stripped-equals
     */
    public static final SubLObject myse_delete_simpler_duplicates(SubLObject cycl_weight_pairs) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject result = NIL;
		{
		    SubLObject _prev_bind_0 = $duplicate_comparison_list$.currentBinding(thread);
		    try {
			$duplicate_comparison_list$.bind(copy_list(cycl_weight_pairs), thread);
			result = delete_if(LIST_CONTAINS_MORE_COMPLICATED_VERSION, cycl_weight_pairs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    } finally {
			$duplicate_comparison_list$.rebind(_prev_bind_0, thread);
		    }
		}
		return result;
	    }
	}
    }

    public static final SubLObject list_contains_more_complicated_version(SubLObject pair) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != subl_promotions.memberP(pair, $duplicate_comparison_list$.getDynamicValue(thread), EQUAL, FIRST)) {
		return T;
	    }
	    {
		SubLObject cycl = pair.first();
		SubLObject equal_items = list_utilities.find_all(cycl, $duplicate_comparison_list$.getDynamicValue(thread), STRIPPED_EQUAL, FIRST);
		SubLObject cdolist_list_var = equal_items;
		SubLObject item = NIL;
		for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), item = cdolist_list_var.first()) {
		    if ((!cycl.equal(item.first())) && (NIL != cycl_utilities.expression_find(cycl, item.first(), NIL, EQUAL, UNPROVIDED))) {
			return T;
		    }
		}
		return NIL;
	    }
	}
    }

    public static final SubLObject stripped_equal(SubLObject cycl1, SubLObject cycl2) {
	return equal(myse_strip_tags(cycl1), myse_strip_tags(cycl2));
    }

    public static final SubLObject clear_myse_strip_tags() {
	{
	    SubLObject cs = $myse_strip_tags_caching_state$.getGlobalValue();
	    if (NIL != cs) {
		memoization_state.caching_state_clear(cs);
	    }
	}
	return NIL;
    }

    public static final SubLObject remove_myse_strip_tags(SubLObject cycl) {
	return memoization_state.caching_state_remove_function_results_with_args($myse_strip_tags_caching_state$.getGlobalValue(), list(cycl), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject myse_strip_tags_internal(SubLObject cycl) {
	return parsing_utilities.strip_nl_tags(cycl, UNPROVIDED);
    }

    public static final SubLObject myse_strip_tags(SubLObject cycl) {
	{
	    SubLObject caching_state = $myse_strip_tags_caching_state$.getGlobalValue();
	    if (NIL == caching_state) {
		caching_state = memoization_state.create_global_caching_state_for_name(MYSE_STRIP_TAGS, $myse_strip_tags_caching_state$, $int$100, EQUAL, ONE_INTEGER, ZERO_INTEGER);
	    }
	    {
		SubLObject results = memoization_state.caching_state_lookup(caching_state, cycl, $kw47$_MEMOIZED_ITEM_NOT_FOUND_);
		if (results == $kw47$_MEMOIZED_ITEM_NOT_FOUND_) {
		    results = arg2(resetMultipleValues(), multiple_value_list(myse_strip_tags_internal(cycl)));
		    memoization_state.caching_state_put(caching_state, cycl, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	    }
	}
    }

    /**
     * What are the possible semantic meanings for VERB-STRING
     *
     * @param spelling-corrections
     * 		LISTP; a list of strings that correspond to alternate spellings (for the entire verb)
     */
    public static final SubLObject verb_semantics(SubLObject verb_string, SubLObject mt, SubLObject spelling_corrections) {
	if (mt == UNPROVIDED) {
	    mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
	}
	if (spelling_corrections == UNPROVIDED) {
	    spelling_corrections = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(verb_string, STRINGP);
	    SubLTrampolineFile.checkType(mt, $sym23$HLMT_);
	    SubLTrampolineFile.checkType(spelling_corrections, LISTP);
	    {
		SubLObject ans = NIL;
		SubLObject strings_and_multipliers = list(list(verb_string, ONE_INTEGER));
		{
		    SubLObject cdolist_list_var = spelling_corrections;
		    SubLObject fix = NIL;
		    for (fix = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), fix = cdolist_list_var.first()) {
			strings_and_multipliers = cons(list(fix, $mys_spell_check_multiplier$.getDynamicValue(thread)), strings_and_multipliers);
		    }
		}
		strings_and_multipliers = reverse(strings_and_multipliers);
		{
		    SubLObject _prev_bind_0 = utilities_macros.$partial_results_initialization_fn$.currentBinding(thread);
		    SubLObject _prev_bind_1 = utilities_macros.$partial_results_accumulation_fn$.currentBinding(thread);
		    SubLObject _prev_bind_2 = utilities_macros.$partial_results_consolidation_fn$.currentBinding(thread);
		    SubLObject _prev_bind_3 = utilities_macros.$partial_results_notification_fn$.currentBinding(thread);
		    SubLObject _prev_bind_4 = utilities_macros.$partial_results_final_result_fn$.currentBinding(thread);
		    SubLObject _prev_bind_5 = utilities_macros.$partial_results_accumulator$.currentBinding(thread);
		    SubLObject _prev_bind_6 = utilities_macros.$partial_results_total_accumulator$.currentBinding(thread);
		    SubLObject _prev_bind_7 = utilities_macros.$partial_results_threshold$.currentBinding(thread);
		    SubLObject _prev_bind_8 = utilities_macros.$partial_results_size$.currentBinding(thread);
		    SubLObject _prev_bind_9 = utilities_macros.$partial_results_total_size$.currentBinding(thread);
		    SubLObject _prev_bind_10 = utilities_macros.$accumulating_partial_resultsP$.currentBinding(thread);
		    try {
			utilities_macros.$partial_results_initialization_fn$.bind(INITIALIZE_MYS_PREPROCESS_RESULTS, thread);
			utilities_macros.$partial_results_accumulation_fn$.bind(ACCUMULATE_MYS_PREPROCESS_RESULTS, thread);
			utilities_macros.$partial_results_consolidation_fn$.bind(CONSOLIDATE_MYS_PREPROCESS_RESULTS, thread);
			utilities_macros.$partial_results_notification_fn$.bind(utilities_macros.$partial_results_notification_fn$.getDynamicValue(thread), thread);
			utilities_macros.$partial_results_final_result_fn$.bind(FINAL_RESULTS_FOR_MYS_PREPROCESS, thread);
			utilities_macros.$partial_results_accumulator$.bind(funcall(utilities_macros.$partial_results_initialization_fn$.getDynamicValue(thread)), thread);
			utilities_macros.$partial_results_total_accumulator$.bind(funcall(utilities_macros.$partial_results_initialization_fn$.getDynamicValue(thread)), thread);
			utilities_macros.$partial_results_threshold$.bind(ONE_INTEGER, thread);
			utilities_macros.$partial_results_size$.bind(ZERO_INTEGER, thread);
			utilities_macros.$partial_results_total_size$.bind(ZERO_INTEGER, thread);
			utilities_macros.$accumulating_partial_resultsP$.bind(T, thread);
			try {
			    {
				SubLObject _prev_bind_0_33 = parsing_vars.$psp_return_mode$.currentBinding(thread);
				SubLObject _prev_bind_1_34 = rkf_formula_optimizer.$rkf_reformulator_replace_pronounsP$.currentBinding(thread);
				try {
				    parsing_vars.$psp_return_mode$.bind($BEST_ONLY, thread);
				    rkf_formula_optimizer.$rkf_reformulator_replace_pronounsP$.bind(NIL, thread);
				    {
					SubLObject error = NIL;
					{
					    SubLObject _prev_bind_0_35 = parsing_vars.$psp_pos_pred_filterP$.currentBinding(thread);
					    try {
						parsing_vars.$psp_pos_pred_filterP$.bind(T, thread);
						{
						    SubLObject cdolist_list_var = strings_and_multipliers;
						    SubLObject string_and_multiplier = NIL;
						    for (string_and_multiplier = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), string_and_multiplier = cdolist_list_var.first()) {
							{
							    SubLObject datum = string_and_multiplier;
							    SubLObject current = datum;
							    SubLObject verb_string_36 = NIL;
							    SubLObject multiplier = NIL;
							    destructuring_bind_must_consp(current, datum, $list_alt48);
							    verb_string_36 = current.first();
							    current = current.rest();
							    destructuring_bind_must_consp(current, datum, $list_alt48);
							    multiplier = current.first();
							    current = current.rest();
							    if (NIL == current) {
								try {
								    {
									SubLObject _prev_bind_0_37 = Errors.$error_handler$.currentBinding(thread);
									try {
									    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
									    try {
										thread.resetMultipleValues();
										{
										    SubLObject best = psp_main.ps_get_cycls_for_phrase(verb_string_36, $$Verb, $ANY, NIL, psp_lexicon.get_default_psp_lexicon(mt, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
										    SubLObject rest = thread.secondMultipleValue();
										    thread.resetMultipleValues();
										    {
											SubLObject cdolist_list_var_38 = best;
											SubLObject item = NIL;
											for (item = cdolist_list_var_38.first(); NIL != cdolist_list_var_38; cdolist_list_var_38 = cdolist_list_var_38.rest(), item = cdolist_list_var_38.first()) {
											    utilities_macros.add_result_to_partial_results_accumulator(list(item, multiply(multiplier, ONE_INTEGER)));
											}
										    }
										    {
											SubLObject cdolist_list_var_39 = rest;
											SubLObject item = NIL;
											for (item = cdolist_list_var_39.first(); NIL != cdolist_list_var_39; cdolist_list_var_39 = cdolist_list_var_39.rest(), item = cdolist_list_var_39.first()) {
											    utilities_macros.add_result_to_partial_results_accumulator(list(item, multiply(multiplier, $float$0_5)));
											}
										    }
										}
									    } catch (Throwable catch_var) {
										Errors.handleThrowable(catch_var, NIL);
									    }
									} finally {
									    Errors.$error_handler$.rebind(_prev_bind_0_37, thread);
									}
								    }
								} catch (Throwable ccatch_env_var) {
								    error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
								}
							    } else {
								cdestructuring_bind_error(datum, $list_alt48);
							    }
							}
						    }
						}
					    } finally {
						parsing_vars.$psp_pos_pred_filterP$.rebind(_prev_bind_0_35, thread);
					    }
					}
				    }
				} finally {
				    rkf_formula_optimizer.$rkf_reformulator_replace_pronounsP$.rebind(_prev_bind_1_34, thread);
				    parsing_vars.$psp_return_mode$.rebind(_prev_bind_0_33, thread);
				}
			    }
			} finally {
			    {
				SubLObject _prev_bind_0_40 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
				    $is_thread_performing_cleanupP$.bind(T, thread);
				    funcall(utilities_macros.$partial_results_consolidation_fn$.getDynamicValue(thread), utilities_macros.$partial_results_accumulator$.getDynamicValue(thread));
				    ans = funcall(utilities_macros.$partial_results_final_result_fn$.getDynamicValue(thread), utilities_macros.$partial_results_total_accumulator$.getDynamicValue(thread));
				} finally {
				    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_40, thread);
				}
			    }
			}
		    } finally {
			utilities_macros.$accumulating_partial_resultsP$.rebind(_prev_bind_10, thread);
			utilities_macros.$partial_results_total_size$.rebind(_prev_bind_9, thread);
			utilities_macros.$partial_results_size$.rebind(_prev_bind_8, thread);
			utilities_macros.$partial_results_threshold$.rebind(_prev_bind_7, thread);
			utilities_macros.$partial_results_total_accumulator$.rebind(_prev_bind_6, thread);
			utilities_macros.$partial_results_accumulator$.rebind(_prev_bind_5, thread);
			utilities_macros.$partial_results_final_result_fn$.rebind(_prev_bind_4, thread);
			utilities_macros.$partial_results_notification_fn$.rebind(_prev_bind_3, thread);
			utilities_macros.$partial_results_consolidation_fn$.rebind(_prev_bind_2, thread);
			utilities_macros.$partial_results_accumulation_fn$.rebind(_prev_bind_1, thread);
			utilities_macros.$partial_results_initialization_fn$.rebind(_prev_bind_0, thread);
		    }
		}
		{
		    SubLObject terms_and_weights = list_utilities.make_paired_lists(ans);
		    return values(terms_and_weights.first(), second(terms_and_weights));
		}
	    }
	}
    }

    public static final SubLObject initialize_mys_preprocess_results() {
	return NIL;
    }

    public static final SubLObject accumulate_mys_preprocess_results(SubLObject sem_weight_pair) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    utilities_macros.$partial_results_accumulator$.setDynamicValue(cons(sem_weight_pair, utilities_macros.$partial_results_accumulator$.getDynamicValue(thread)), thread);
	    return NIL;
	}
    }

    public static final SubLObject consolidate_mys_preprocess_results(SubLObject results) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    utilities_macros.$partial_results_total_accumulator$.setDynamicValue(cconcatenate(results, utilities_macros.$partial_results_total_accumulator$.getDynamicValue(thread)), thread);
	    return utilities_macros.$partial_results_total_accumulator$.getDynamicValue(thread);
	}
    }

    public static final SubLObject final_results_for_mys_preprocess(SubLObject total_results) {
	return nreverse(total_results);
    }

    /**
     * What could STRING mean?
     */
    public static final SubLObject sentence_semantics(SubLObject string, SubLObject mt) {
	if (mt == UNPROVIDED) {
	    mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(string, STRINGP);
	    SubLTrampolineFile.checkType(mt, $sym23$HLMT_);
	    {
		SubLObject cycls = question_semantics(string, mt, UNPROVIDED);
		SubLObject sentence_type = NIL;
		SubLObject weights = NIL;
		if (NIL != cycls) {
		    sentence_type = $QUESTION;
		}
		if (NIL == cycls) {
		    cycls = statement_semantics(string, mt, UNPROVIDED);
		    sentence_type = $STATEMENT;
		}
		weights = make_list(length(cycls), $mys_default_sentence_parse_weight$.getDynamicValue(thread));
		return values(cycls, weights, sentence_type);
	    }
	}
    }

    /**
     * What could STRING mean?
     */
    public static final SubLObject sentence_of_type_semantics(SubLObject string, SubLObject sentence_type, SubLObject mt, SubLObject spelling_corrections, SubLObject np_strings) {
	if (mt == UNPROVIDED) {
	    mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
	}
	if (spelling_corrections == UNPROVIDED) {
	    spelling_corrections = NIL;
	}
	if (np_strings == UNPROVIDED) {
	    np_strings = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(string, STRINGP);
	    SubLTrampolineFile.checkType(sentence_type, KEYWORDP);
	    SubLTrampolineFile.checkType(mt, $sym23$HLMT_);
	    SubLTrampolineFile.checkType(spelling_corrections, LISTP);
	    if (NIL != list_utilities.lengthG(string, $sentence_of_type_semantics_length_cutoff$.getGlobalValue(), UNPROVIDED)) {
		mysentient_utilities.myselog_warn(cconcatenate($str_alt62$String_is_too_long_for_SENTENCE_O,
			new SubLObject[] { format_nil.format_nil_s_no_copy($sentence_of_type_semantics_length_cutoff$.getGlobalValue()), $str_alt63$__, format_nil.$format_nil_percent$.getGlobalValue(), $str_alt64$_, format_nil.format_nil_s_no_copy(string) }));
		return values(NIL, NIL);
	    }
	    {
		SubLObject cycls = NIL;
		SubLObject weights = NIL;
		{
		    SubLObject _prev_bind_0 = rkf_formula_optimizer.$rkf_reformulator_replace_pronounsP$.currentBinding(thread);
		    SubLObject _prev_bind_1 = iterative_template_parser.$possible_nps$.currentBinding(thread);
		    try {
			rkf_formula_optimizer.$rkf_reformulator_replace_pronounsP$.bind(NIL, thread);
			iterative_template_parser.$possible_nps$.bind(np_strings, thread);
			if (sentence_type == $QUESTION) {
			    thread.resetMultipleValues();
			    {
				SubLObject cycls_41 = question_semantics(string, mt, spelling_corrections);
				SubLObject weights_42 = thread.secondMultipleValue();
				thread.resetMultipleValues();
				cycls = cycls_41;
				weights = weights_42;
			    }
			} else if (sentence_type == $STATEMENT) {
			    thread.resetMultipleValues();
			    {
				SubLObject cycls_43 = statement_semantics(string, mt, spelling_corrections);
				SubLObject weights_44 = thread.secondMultipleValue();
				thread.resetMultipleValues();
				cycls = cycls_43;
				weights = weights_44;
			    }
			} else {
			    cycls = $SENTENCE_TYPE_ILL_FORMED;
			    weights = $SENTENCE_TYPE_ILL_FORMED;
			}

		    } finally {
			iterative_template_parser.$possible_nps$.rebind(_prev_bind_1, thread);
			rkf_formula_optimizer.$rkf_reformulator_replace_pronounsP$.rebind(_prev_bind_0, thread);
		    }
		}
		return values(cycls, weights);
	    }
	}
    }

    /**
     * What could STRING mean?
     */
    public static final SubLObject statement_semantics(SubLObject string, SubLObject mt, SubLObject spelling_corrections) {
	if (mt == UNPROVIDED) {
	    mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
	}
	if (spelling_corrections == UNPROVIDED) {
	    spelling_corrections = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(string, STRINGP);
	    SubLTrampolineFile.checkType(mt, $sym23$HLMT_);
	    SubLTrampolineFile.checkType(spelling_corrections, LISTP);
	    {
		SubLObject cycls = NIL;
		SubLObject weights = NIL;
		if (NIL == cycls) {
		    {
			SubLObject csome_list_var = cons(string, spelling_corrections);
			SubLObject s_string = NIL;
			for (s_string = csome_list_var.first(); !((NIL != cycls) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), s_string = csome_list_var.first()) {
			    cycls = remove_if($sym69$CONTAINS_KEYWORD_, rkf_text_processors.parse_a_sentence_completely_wff(s_string, mt, copy_list($list_alt70)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			    weights = myse_parse_weights(cycls, UNPROVIDED, UNPROVIDED);
			}
		    }
		}
		thread.resetMultipleValues();
		{
		    SubLObject cycls_45 = sort_cycls_and_weights(cycls, weights, $BEST_FIRST);
		    SubLObject weights_46 = thread.secondMultipleValue();
		    thread.resetMultipleValues();
		    cycls = cycls_45;
		    weights = weights_46;
		}
		return values(cycls, weights);
	    }
	}
    }

    /**
     * What could STRING mean?
     */
    public static final SubLObject question_semantics(SubLObject string, SubLObject mt, SubLObject spelling_corrections) {
	if (mt == UNPROVIDED) {
	    mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
	}
	if (spelling_corrections == UNPROVIDED) {
	    spelling_corrections = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(string, STRINGP);
	    SubLTrampolineFile.checkType(mt, $sym23$HLMT_);
	    {
		SubLObject cycls = NIL;
		SubLObject weights = NIL;
		if (NIL == cycls) {
		    {
			SubLObject csome_list_var = cons(string, spelling_corrections);
			SubLObject q_string = NIL;
			for (q_string = csome_list_var.first(); !((NIL != cycls) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), q_string = csome_list_var.first()) {
			    cycls = remove_if($sym69$CONTAINS_KEYWORD_, rkf_text_processors.parse_a_question_completely_wff(q_string, mt, copy_list($list_alt70)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			    weights = myse_parse_weights(cycls, UNPROVIDED, UNPROVIDED);
			}
		    }
		}
		thread.resetMultipleValues();
		{
		    SubLObject cycls_47 = sort_cycls_and_weights(cycls, weights, $BEST_FIRST);
		    SubLObject weights_48 = thread.secondMultipleValue();
		    thread.resetMultipleValues();
		    cycls = cycls_47;
		    weights = weights_48;
		}
		return values(cycls, weights);
	    }
	}
    }

    public static final SubLObject contains_keywordP(SubLObject expr) {
	return cycl_utilities.expression_find_if(KEYWORDP, expr, UNPROVIDED, UNPROVIDED);
    }

    // defparameter
    private static final SubLSymbol $myse_default_max_weight$ = makeSymbol("*MYSE-DEFAULT-MAX-WEIGHT*");

    // defparameter
    private static final SubLSymbol $myse_default_min_weight$ = makeSymbol("*MYSE-DEFAULT-MIN-WEIGHT*");

    /**
     *
     *
     * @return listp; weights are determined relative to other parses.  As long as there are at least 2 CycL sentences
    the weights will be distributed between MAX-WEIGHT and MIN-WEIGHT, with the best parse getting
    MAX-WEIGHT, and the worst parse getting MIN-WEIGHT.
     */
    public static final SubLObject myse_parse_weights(SubLObject cycls, SubLObject max_weight, SubLObject min_weight) {
	if (max_weight == UNPROVIDED) {
	    max_weight = $myse_default_max_weight$.getDynamicValue();
	}
	if (min_weight == UNPROVIDED) {
	    min_weight = $myse_default_min_weight$.getDynamicValue();
	}
	if (NIL != cycls) {
	    {
		SubLObject weight_difference = subtract(max_weight, min_weight);
		SubLObject formula_complexities = Mapping.mapcar(MYSE_FORMULA_COMPLEXITY, cycls);
		SubLObject min_complexity = number_utilities.minimum(formula_complexities, UNPROVIDED);
		SubLObject complexity_difference = subtract(number_utilities.maximum(formula_complexities, UNPROVIDED), min_complexity);
		SubLObject weight_multiplier = (complexity_difference.isZero()) ? ((SubLObject) (ONE_INTEGER)) : divide(weight_difference, complexity_difference);
		SubLObject result = NIL;
		SubLObject cdolist_list_var = formula_complexities;
		SubLObject complexity = NIL;
		for (complexity = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), complexity = cdolist_list_var.first()) {
		    result = cons(subtract(max_weight, multiply(subtract(complexity, min_complexity), weight_multiplier)), result);
		}
		return nreverse(result);
	    }
	}
	return NIL;
    }

    public static final SubLObject myse_formula_complexity(SubLObject formula) {
	{
	    SubLObject result = ZERO_INTEGER;
	    if (formula.isList()) {
		{
		    SubLObject cdolist_list_var = formula;
		    SubLObject arg = NIL;
		    for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), arg = cdolist_list_var.first()) {
			result = add(result, function_terms.term_functional_complexity(arg));
			result = add(result, myse_formula_complexity(arg));
		    }
		}
	    } else {
		result = add(result, ONE_INTEGER);
	    }
	    return result;
	}
    }

    public static final SubLObject sort_cycls_and_weights(SubLObject cycls, SubLObject weights, SubLObject comparison_type) {
	if (comparison_type == UNPROVIDED) {
	    comparison_type = $BEST_FIRST;
	}
	{
	    SubLObject comparison_pred = (comparison_type == $BEST_FIRST) ? ((SubLObject) ($sym79$_)) : $sym79$_;
	    SubLObject sorted_pairs = NIL;
	    SubLObject unsorted_pairs = NIL;
	    SubLObject sorted_weights = NIL;
	    SubLObject sorted_cycls = NIL;
	    SubLObject cycl = NIL;
	    SubLObject cycl_49 = NIL;
	    SubLObject weight = NIL;
	    SubLObject weight_50 = NIL;
	    for (cycl = cycls, cycl_49 = cycl.first(), weight = weights, weight_50 = weight.first(); !((NIL == weight) && (NIL == cycl)); cycl = cycl.rest(), cycl_49 = cycl.first(), weight = weight.rest(), weight_50 = weight.first()) {
		unsorted_pairs = cons(cons(cycl_49, weight_50), unsorted_pairs);
	    }
	    sorted_pairs = Sort.sort(unsorted_pairs, comparison_pred, REST);
	    {
		SubLObject cdolist_list_var = sorted_pairs;
		SubLObject pair = NIL;
		for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), pair = cdolist_list_var.first()) {
		    sorted_cycls = cons(pair.first(), sorted_cycls);
		    sorted_weights = cons(pair.rest(), sorted_weights);
		}
	    }
	    return values(sorted_cycls, sorted_weights);
	}
    }

    public static final SubLObject mysentient_pp_note_session_iteration(SubLObject session, SubLObject iteration_id, SubLObject session_mt) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(session, FORT_P);
	    SubLTrampolineFile.checkType(session_mt, POSSIBLY_HLMT_P);
	    {
		SubLObject n = next_iteration_number_wrt_session(session, session_mt);
		SubLObject constant = mysentient_utilities.myse_create(cconcatenate($str_alt84$Iteration_, new SubLObject[] { kb_paths.fort_name(session), $str_alt85$_, string_utilities.to_string(n) }), UNPROVIDED, UNPROVIDED, UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
		    try {
			kb_control_vars.$forward_inference_allowed_rules$.bind(mysentient_user_profile_manager_widgets.mysentient_creation_template_forward_rules($const86$MySentientSessionIteration_Creati), thread);
			mysentient_utilities.myse_assert_wff_now(listS($$isa, constant, $list_alt88), session_mt);
			mysentient_utilities.myse_assert_wff_now(listS($$nthSubSituationOfType, constant, session, n, $list_alt88), session_mt);
			mysentient_utilities.myse_assert_wff_now(list($$properSubEvents, session, constant), session_mt);
		    } finally {
			kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
		    }
		}
		return constant;
	    }
	}
    }

    public static final SubLObject next_iteration_number_wrt_session(SubLObject session, SubLObject session_mt) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    thread.resetMultipleValues();
	    {
		SubLObject latest_iteration = mysentient_pp_most_recent_session_iteration(session, session_mt);
		SubLObject latest_iteration_number = thread.secondMultipleValue();
		thread.resetMultipleValues();
		return number_utilities.f_1X(latest_iteration_number);
	    }
	}
    }

    public static final SubLObject mysentient_pp_most_recent_session_iteration(SubLObject session, SubLObject session_mt) {
	{
	    SubLObject raw_result = ask_utilities.query_template($list_alt92, list($$ist, session_mt, list($$and, $list_alt95, $list_alt96, list($$assertedSentence, listS($$nthSubSituationOfType, $sym98$_ITERATION, session, $list_alt99)))), session_mt, UNPROVIDED);
	    return NIL != list_utilities.empty_list_p(raw_result) ? ((SubLObject) (values(NIL, ZERO_INTEGER))) : apply(symbol_function(VALUES), number_utilities.maximum(raw_result, SECOND));
	}
    }

    public static final SubLObject contains_parse_result(SubLObject parses, SubLObject expected_answer) {
	{
	    SubLObject cdolist_list_var = parses;
	    SubLObject parse = NIL;
	    for (parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), parse = cdolist_list_var.first()) {
		if (NIL != cycl_utilities.expression_find(expected_answer, parse, T, EQUAL, UNPROVIDED)) {
		    return T;
		}
	    }
	}
	return NIL;
    }

    public static final SubLObject declare_mysentient_preprocess_widgets_file() {
	declareMacro("with_mys_preprocessing_partial_results_accumulation", "WITH-MYS-PREPROCESSING-PARTIAL-RESULTS-ACCUMULATION");
	declareFunction("myse_possibly_add_chart", "MYSE-POSSIBLY-ADD-CHART", 1, 1, false);
	declareMacro("with_mysentient_psp_charts", "WITH-MYSENTIENT-PSP-CHARTS");
	declareMacro("with_mysentient_psp_charts_final", "WITH-MYSENTIENT-PSP-CHARTS-FINAL");
	declareFunction("myse_get_psp_charts", "MYSE-GET-PSP-CHARTS", 1, 0, false);
	declareFunction("myse_uncache_charts", "MYSE-UNCACHE-CHARTS", 1, 0, false);
	declareFunction("np_semantics", "NP-SEMANTICS", 1, 3, false);
	declareFunction("myse_delete_simpler_duplicates", "MYSE-DELETE-SIMPLER-DUPLICATES", 1, 0, false);
	declareFunction("list_contains_more_complicated_version", "LIST-CONTAINS-MORE-COMPLICATED-VERSION", 1, 0, false);
	declareFunction("stripped_equal", "STRIPPED-EQUAL", 2, 0, false);
	declareFunction("clear_myse_strip_tags", "CLEAR-MYSE-STRIP-TAGS", 0, 0, false);
	declareFunction("remove_myse_strip_tags", "REMOVE-MYSE-STRIP-TAGS", 1, 0, false);
	declareFunction("myse_strip_tags_internal", "MYSE-STRIP-TAGS-INTERNAL", 1, 0, false);
	declareFunction("myse_strip_tags", "MYSE-STRIP-TAGS", 1, 0, false);
	declareFunction("verb_semantics", "VERB-SEMANTICS", 1, 2, false);
	declareFunction("initialize_mys_preprocess_results", "INITIALIZE-MYS-PREPROCESS-RESULTS", 0, 0, false);
	declareFunction("accumulate_mys_preprocess_results", "ACCUMULATE-MYS-PREPROCESS-RESULTS", 1, 0, false);
	declareFunction("consolidate_mys_preprocess_results", "CONSOLIDATE-MYS-PREPROCESS-RESULTS", 1, 0, false);
	declareFunction("final_results_for_mys_preprocess", "FINAL-RESULTS-FOR-MYS-PREPROCESS", 1, 0, false);
	declareFunction("sentence_semantics", "SENTENCE-SEMANTICS", 1, 1, false);
	declareFunction("sentence_of_type_semantics", "SENTENCE-OF-TYPE-SEMANTICS", 2, 3, false);
	declareFunction("statement_semantics", "STATEMENT-SEMANTICS", 1, 2, false);
	declareFunction("question_semantics", "QUESTION-SEMANTICS", 1, 2, false);
	declareFunction("contains_keywordP", "CONTAINS-KEYWORD?", 1, 0, false);
	declareFunction("myse_parse_weights", "MYSE-PARSE-WEIGHTS", 1, 2, false);
	declareFunction("myse_formula_complexity", "MYSE-FORMULA-COMPLEXITY", 1, 0, false);
	declareFunction("sort_cycls_and_weights", "SORT-CYCLS-AND-WEIGHTS", 2, 1, false);
	declareFunction("mysentient_pp_note_session_iteration", "MYSENTIENT-PP-NOTE-SESSION-ITERATION", 3, 0, false);
	declareFunction("next_iteration_number_wrt_session", "NEXT-ITERATION-NUMBER-WRT-SESSION", 2, 0, false);
	declareFunction("mysentient_pp_most_recent_session_iteration", "MYSENTIENT-PP-MOST-RECENT-SESSION-ITERATION", 2, 0, false);
	declareFunction("contains_parse_result", "CONTAINS-PARSE-RESULT", 2, 0, false);
	return NIL;
    }

    public static final SubLObject init_mysentient_preprocess_widgets_file() {
	defparameter("*MYS-DEFAULT-SENTENCE-PARSE-WEIGHT*", $float$0_8);
	deflexical("*SENTENCE-OF-TYPE-SEMANTICS-LENGTH-CUTOFF*", $int$100);
	defparameter("*MYSENTIENT-EXTRA-CHART-CACHE*", dictionary.new_dictionary(EQUALP, UNPROVIDED));
	defparameter("*MYSE-EXTRA-PSP-CHART-KEY*", NIL);
	defvar("*MYS-PREPROCESSOR-PROFILING-ON*", NIL);
	defparameter("*MYS-SPELL-CHECK-MULTIPLIER*", $float$0_8);
	defparameter("*DUPLICATE-COMPARISON-LIST*", NIL);
	deflexical("*MYSE-STRIP-TAGS-CACHING-STATE*", NIL);
	defparameter("*MYSE-DEFAULT-MAX-WEIGHT*", $float$0_9);
	defparameter("*MYSE-DEFAULT-MIN-WEIGHT*", $float$0_7);
	return NIL;
    }

    public static final SubLObject setup_mysentient_preprocess_widgets_file() {
	access_macros.register_external_symbol(WITH_MYSENTIENT_PSP_CHARTS);
	access_macros.register_external_symbol(WITH_MYSENTIENT_PSP_CHARTS_FINAL);
	access_macros.register_macro_helper(MYSE_UNCACHE_CHARTS, WITH_MYSENTIENT_PSP_CHARTS_FINAL);
	utilities_macros.register_cyc_api_function(NP_SEMANTICS, $list_alt39, $str_alt40$What_are_the_possible_semantic_me, $list_alt41, $list_alt42);
	memoization_state.note_globally_cached_function(MYSE_STRIP_TAGS);
	utilities_macros.register_cyc_api_function(VERB_SEMANTICS, $list_alt52, $str_alt53$What_are_the_possible_semantic_me, $list_alt54, $list_alt42);
	utilities_macros.register_cyc_api_function(SENTENCE_SEMANTICS, $list_alt58, $str_alt59$What_could_STRING_mean_, $list_alt60, NIL);
	utilities_macros.register_cyc_api_function(SENTENCE_OF_TYPE_SEMANTICS, $list_alt67, $str_alt59$What_could_STRING_mean_, $list_alt68, NIL);
	utilities_macros.register_cyc_api_function(STATEMENT_SEMANTICS, $list_alt73, $str_alt59$What_could_STRING_mean_, $list_alt74, NIL);
	utilities_macros.register_cyc_api_function(QUESTION_SEMANTICS, $list_alt73, $str_alt59$What_could_STRING_mean_, $list_alt60, NIL);
	access_macros.register_external_symbol(MYSENTIENT_PP_NOTE_SESSION_ITERATION);
	access_macros.register_external_symbol(MYSENTIENT_PP_MOST_RECENT_SESSION_ITERATION);
	return NIL;
    }

    // // Internal Constants
    public static final SubLFloat $float$0_8 = makeDouble(0.8);

    static private final SubLList $list_alt1 = list(list(makeSymbol("ANS"), makeSymbol("THRESHOLD"), makeSymbol("NOTIFICATION-FUNCTION-SPEC")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt3 = list(makeSymbol("*PARTIAL-RESULTS-INITIALIZATION-FN*"), list(QUOTE, makeSymbol("INITIALIZE-MYS-PREPROCESS-RESULTS")));

    static private final SubLList $list_alt4 = list(makeSymbol("*PARTIAL-RESULTS-ACCUMULATION-FN*"), list(QUOTE, makeSymbol("ACCUMULATE-MYS-PREPROCESS-RESULTS")));

    static private final SubLList $list_alt5 = list(makeSymbol("*PARTIAL-RESULTS-CONSOLIDATION-FN*"), list(QUOTE, makeSymbol("CONSOLIDATE-MYS-PREPROCESS-RESULTS")));

    public static final SubLSymbol $partial_results_notification_fn$ = makeSymbol("*PARTIAL-RESULTS-NOTIFICATION-FN*");

    static private final SubLList $list_alt7 = list(list(makeSymbol("*PARTIAL-RESULTS-FINAL-RESULT-FN*"), list(QUOTE, makeSymbol("FINAL-RESULTS-FOR-MYS-PREPROCESS"))));

    private static final SubLSymbol WITH_PARTIAL_RESULTS_ACCUMULATION = makeSymbol("WITH-PARTIAL-RESULTS-ACCUMULATION");

    private static final SubLSymbol WITH_MYSENTIENT_PSP_CHARTS = makeSymbol("WITH-MYSENTIENT-PSP-CHARTS");

    static private final SubLList $list_alt11 = list(list(makeSymbol("STRING"), makeSymbol("MT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym12$CHARTS = makeUninternedSymbol("CHARTS");

    public static final SubLSymbol $myse_extra_psp_chart_key$ = makeSymbol("*MYSE-EXTRA-PSP-CHART-KEY*");

    static private final SubLList $list_alt15 = list(list(makeSymbol("MYSE-GET-PSP-CHARTS"), makeSymbol("*MYSE-EXTRA-PSP-CHART-KEY*")));

    private static final SubLSymbol WITH_EXTRA_PSP_CHARTS = makeSymbol("WITH-EXTRA-PSP-CHARTS");

    private static final SubLSymbol WITH_MYSENTIENT_PSP_CHARTS_FINAL = makeSymbol("WITH-MYSENTIENT-PSP-CHARTS-FINAL");

    static private final SubLSymbol $sym19$CHARTS = makeUninternedSymbol("CHARTS");

    static private final SubLList $list_alt20 = list(list(makeSymbol("MYSE-UNCACHE-CHARTS"), makeSymbol("*MYSE-EXTRA-PSP-CHART-KEY*")));

    private static final SubLSymbol MYSE_UNCACHE_CHARTS = makeSymbol("MYSE-UNCACHE-CHARTS");

    static private final SubLSymbol $sym23$HLMT_ = makeSymbol("HLMT?");

    private static final SubLSymbol INITIALIZE_MYS_PREPROCESS_RESULTS = makeSymbol("INITIALIZE-MYS-PREPROCESS-RESULTS");

    private static final SubLSymbol ACCUMULATE_MYS_PREPROCESS_RESULTS = makeSymbol("ACCUMULATE-MYS-PREPROCESS-RESULTS");

    private static final SubLSymbol CONSOLIDATE_MYS_PREPROCESS_RESULTS = makeSymbol("CONSOLIDATE-MYS-PREPROCESS-RESULTS");

    private static final SubLSymbol FINAL_RESULTS_FOR_MYS_PREPROCESS = makeSymbol("FINAL-RESULTS-FOR-MYS-PREPROCESS");

    static private final SubLList $list_alt31 = list(makeSymbol("NP-STRING"), makeSymbol("MULTIPLIER"));

    static private final SubLList $list_alt32 = list(makeSymbol("CAT"), makeSymbol("PRED"));

    public static final SubLFloat $float$0_5 = makeDouble(0.5);

    static private final SubLList $list_alt35 = list(list(constant_handles.reader_make_constant_shell(makeString("NounPhrase")), makeKeyword("ANY")), list(makeKeyword("ANY"), constant_handles.reader_make_constant_shell(makeString("nounStrings"))));

    static private final SubLString $str_alt36$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    private static final SubLSymbol NP_SEMANTICS = makeSymbol("NP-SEMANTICS");

    static private final SubLList $list_alt39 = list(makeSymbol("NP-STRING"), makeSymbol("&OPTIONAL"), list(makeSymbol("MT"), makeSymbol("*LEXICON-LOOKUP-MT*")), makeSymbol("SPELLING-CORRECTIONS"), makeSymbol("CONTEXT-STRING"));

    static private final SubLString $str_alt40$What_are_the_possible_semantic_me = makeString("What are the possible semantic meanings for NP-STRING\n   @param spelling-corrections LISTP; a list of strings that correspond to alternate spellings (for the entire NP)");

    static private final SubLList $list_alt41 = list(list(makeSymbol("NP-STRING"), makeSymbol("STRINGP")), list(makeSymbol("MT"), makeSymbol("HLMT?")), list(makeSymbol("SPELLING-CORRECTIONS"), makeSymbol("LISTP")));

    static private final SubLList $list_alt42 = list(list(makeSymbol("LIST"), makeSymbol("CYCL-EXPRESSION-P")), list(makeSymbol("LIST"), makeSymbol("NUMBERP")));

    private static final SubLSymbol LIST_CONTAINS_MORE_COMPLICATED_VERSION = makeSymbol("LIST-CONTAINS-MORE-COMPLICATED-VERSION");

    private static final SubLSymbol STRIPPED_EQUAL = makeSymbol("STRIPPED-EQUAL");

    private static final SubLSymbol MYSE_STRIP_TAGS = makeSymbol("MYSE-STRIP-TAGS");

    public static final SubLSymbol $myse_strip_tags_caching_state$ = makeSymbol("*MYSE-STRIP-TAGS-CACHING-STATE*");

    public static final SubLSymbol $kw47$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt48 = list(makeSymbol("VERB-STRING"), makeSymbol("MULTIPLIER"));

    public static final SubLObject $$Verb = constant_handles.reader_make_constant_shell(makeString("Verb"));

    private static final SubLSymbol VERB_SEMANTICS = makeSymbol("VERB-SEMANTICS");

    static private final SubLList $list_alt52 = list(makeSymbol("VERB-STRING"), makeSymbol("&OPTIONAL"), list(makeSymbol("MT"), makeSymbol("*LEXICON-LOOKUP-MT*")), makeSymbol("SPELLING-CORRECTIONS"));

    static private final SubLString $str_alt53$What_are_the_possible_semantic_me = makeString("What are the possible semantic meanings for VERB-STRING\n   @param spelling-corrections LISTP; a list of strings that correspond to alternate spellings (for the entire verb)");

    static private final SubLList $list_alt54 = list(list(makeSymbol("VERB-STRING"), makeSymbol("STRINGP")), list(makeSymbol("MT"), makeSymbol("HLMT?")), list(makeSymbol("SPELLING-CORRECTIONS"), makeSymbol("LISTP")));

    private static final SubLSymbol $STATEMENT = makeKeyword("STATEMENT");

    private static final SubLSymbol SENTENCE_SEMANTICS = makeSymbol("SENTENCE-SEMANTICS");

    static private final SubLList $list_alt58 = list(makeSymbol("STRING"), makeSymbol("&OPTIONAL"), list(makeSymbol("MT"), makeSymbol("*LEXICON-LOOKUP-MT*")));

    static private final SubLString $str_alt59$What_could_STRING_mean_ = makeString("What could STRING mean?");

    static private final SubLList $list_alt60 = list(list(makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("MT"), makeSymbol("HLMT?")));

    static private final SubLString $str_alt62$String_is_too_long_for_SENTENCE_O = makeString("String is too long for SENTENCE-OF-TYPE-SEMANTICS (max length = ");

    static private final SubLString $str_alt63$__ = makeString("):");

    static private final SubLString $str_alt64$_ = makeString(" ");

    private static final SubLSymbol $SENTENCE_TYPE_ILL_FORMED = makeKeyword("SENTENCE-TYPE-ILL-FORMED");

    private static final SubLSymbol SENTENCE_OF_TYPE_SEMANTICS = makeSymbol("SENTENCE-OF-TYPE-SEMANTICS");

    static private final SubLList $list_alt67 = list(makeSymbol("STRING"), makeSymbol("SENTENCE-TYPE"), makeSymbol("&OPTIONAL"), list(makeSymbol("MT"), makeSymbol("*LEXICON-LOOKUP-MT*")), makeSymbol("SPELLING-CORRECTIONS"), makeSymbol("NP-STRINGS"));

    static private final SubLList $list_alt68 = list(list(makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("SENTENCE-TYPE"), makeSymbol("KEYWORDP")), list(makeSymbol("MT"), makeSymbol("HLMT?")), list(makeSymbol("SPELLING-CORRECTIONS"), makeSymbol("LISTP")));

    static private final SubLSymbol $sym69$CONTAINS_KEYWORD_ = makeSymbol("CONTAINS-KEYWORD?");

    static private final SubLList $list_alt70 = list(makeKeyword("PARSERS"), list(constant_handles.reader_make_constant_shell(makeString("CycRecursiveTemplateParser"))));

    private static final SubLSymbol $BEST_FIRST = makeKeyword("BEST-FIRST");

    private static final SubLSymbol STATEMENT_SEMANTICS = makeSymbol("STATEMENT-SEMANTICS");

    static private final SubLList $list_alt73 = list(makeSymbol("STRING"), makeSymbol("&OPTIONAL"), list(makeSymbol("MT"), makeSymbol("*LEXICON-LOOKUP-MT*")), makeSymbol("SPELLING-CORRECTIONS"));

    static private final SubLList $list_alt74 = list(list(makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("MT"), makeSymbol("HLMT?")), list(makeSymbol("SPELLING-CORRECTIONS"), makeSymbol("LISTP")));

    private static final SubLSymbol QUESTION_SEMANTICS = makeSymbol("QUESTION-SEMANTICS");

    public static final SubLFloat $float$0_9 = makeDouble(0.9);

    public static final SubLFloat $float$0_7 = makeDouble(0.7);

    private static final SubLSymbol MYSE_FORMULA_COMPLEXITY = makeSymbol("MYSE-FORMULA-COMPLEXITY");

    static private final SubLSymbol $sym79$_ = makeSymbol("<");

    private static final SubLSymbol MYSENTIENT_PP_NOTE_SESSION_ITERATION = makeSymbol("MYSENTIENT-PP-NOTE-SESSION-ITERATION");

    static private final SubLString $str_alt84$Iteration_ = makeString("Iteration-");

    static private final SubLString $str_alt85$_ = makeString("-");

    public static final SubLObject $const86$MySentientSessionIteration_Creati = constant_handles.reader_make_constant_shell(makeString("MySentientSessionIteration-CreationTemplate"));

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    static private final SubLList $list_alt88 = list(constant_handles.reader_make_constant_shell(makeString("AddressingAUserQuery")));

    public static final SubLObject $$nthSubSituationOfType = constant_handles.reader_make_constant_shell(makeString("nthSubSituationOfType"));

    public static final SubLObject $$properSubEvents = constant_handles.reader_make_constant_shell(makeString("properSubEvents"));

    private static final SubLSymbol MYSENTIENT_PP_MOST_RECENT_SESSION_ITERATION = makeSymbol("MYSENTIENT-PP-MOST-RECENT-SESSION-ITERATION");

    static private final SubLList $list_alt92 = list(makeSymbol("?ITERATION"), makeSymbol("?ITERATION-ID"));

    public static final SubLObject $$ist = constant_handles.reader_make_constant_shell(makeString("ist"));

    public static final SubLObject $$and = constant_handles.reader_make_constant_shell(makeString("and"));

    static private final SubLList $list_alt95 = list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?ITERATION"), constant_handles.reader_make_constant_shell(makeString("AddressingAUserQuery")));

    static private final SubLList $list_alt96 = list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("??SESSION"), constant_handles.reader_make_constant_shell(makeString("MySentientAnswersSession")));

    public static final SubLObject $$assertedSentence = constant_handles.reader_make_constant_shell(makeString("assertedSentence"));

    static private final SubLSymbol $sym98$_ITERATION = makeSymbol("?ITERATION");

    static private final SubLList $list_alt99 = list(makeSymbol("?ITERATION-ID"), constant_handles.reader_make_constant_shell(makeString("AddressingAUserQuery")));

    // // Initializers
    @Override
    public void declareFunctions() {
	declare_mysentient_preprocess_widgets_file();
    }

    @Override
    public void initializeVariables() {
	init_mysentient_preprocess_widgets_file();
    }

    @Override
    public void runTopLevelForms() {
	setup_mysentient_preprocess_widgets_file();
    }
}
