/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.log;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.round;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_default_float_format$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_line;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.cfasl_utilities;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.neural_net;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.os_process_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.kbq_query_run;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      REINFORCEMENT-LEARNING-TACTICIAN
 *  source file: /cyc/top/cycl/inference/harness/reinforcement-learning-tactician.lisp
 *  created:     2019/07/03 17:37:41
 */
public final class reinforcement_learning_tactician extends SubLTranslatedFile implements V02 {
    // // Constructor
    private reinforcement_learning_tactician() {
    }

    public static final SubLFile me = new reinforcement_learning_tactician();

    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.reinforcement_learning_tactician";

    // // Definitions
    // defvar
    private static final SubLSymbol $reinforcement_learning_tactician_enabledP$ = makeSymbol("*REINFORCEMENT-LEARNING-TACTICIAN-ENABLED?*");

    // defvar
    private static final SubLSymbol $reinforcement_learning_tactician_use_neural_netP$ = makeSymbol("*REINFORCEMENT-LEARNING-TACTICIAN-USE-NEURAL-NET?*");

    // deflexical
    private static final SubLSymbol $reinforcement_learning_tactician_executable_pathname$ = makeSymbol("*REINFORCEMENT-LEARNING-TACTICIAN-EXECUTABLE-PATHNAME*");

    // defvar
    private static final SubLSymbol $reinforcement_learning_tactician_executable_param$ = makeSymbol("*REINFORCEMENT-LEARNING-TACTICIAN-EXECUTABLE-PARAM*");

    // defvar
    private static final SubLSymbol $reinforcement_learning_tactician_debug_outputP$ = makeSymbol("*REINFORCEMENT-LEARNING-TACTICIAN-DEBUG-OUTPUT?*");

    // deflexical
    private static final SubLSymbol $reinforcement_learning_tactician_metrics$ = makeSymbol("*REINFORCEMENT-LEARNING-TACTICIAN-METRICS*");

    // deflexical
    private static final SubLSymbol $reinforcement_learning_tactician_query_properties$ = makeSymbol("*REINFORCEMENT-LEARNING-TACTICIAN-QUERY-PROPERTIES*");

    public static final SubLObject reinforcement_learning_tactician_query_properties() {
	return copy_list($reinforcement_learning_tactician_query_properties$.getGlobalValue());
    }

    /**
     * The max time spent in backward inference for a single query
     */
    // deflexical
    private static final SubLSymbol $reinforcement_learning_tactician_default_max_time$ = makeSymbol("*REINFORCEMENT-LEARNING-TACTICIAN-DEFAULT-MAX-TIME*");

    /**
     * The maximum time the reinforcement learning tactician can spend on ALL queries.  NIL means no time cutoff.
     */
    // deflexical
    private static final SubLSymbol $reinforcement_learning_tactician_outermost_loop_time_cutoff$ = makeSymbol("*REINFORCEMENT-LEARNING-TACTICIAN-OUTERMOST-LOOP-TIME-CUTOFF*");

    // deflexical
    private static final SubLSymbol $bt_answerable_query_count$ = makeSymbol("*BT-ANSWERABLE-QUERY-COUNT*");

    // deflexical
    private static final SubLSymbol $bt_sum_ln_answer_count$ = makeSymbol("*BT-SUM-LN-ANSWER-COUNT*");

    // deflexical
    private static final SubLSymbol $bt_sum_ln_total_steps$ = makeSymbol("*BT-SUM-LN-TOTAL-STEPS*");

    // deflexical
    private static final SubLSymbol $bt_sum_ln_steps_to_first_answer$ = makeSymbol("*BT-SUM-LN-STEPS-TO-FIRST-ANSWER*");

    /**
     * The weighting factor for steps to first answer.
     */
    // deflexical
    private static final SubLSymbol $rl_alpha$ = makeSymbol("*RL-ALPHA*");

    /**
     * The weighting factor for total steps.
     */
    // deflexical
    private static final SubLSymbol $rl_beta$ = makeSymbol("*RL-BETA*");

    /**
     * The weighting factor for answerable query count.
     */
    // deflexical
    private static final SubLSymbol $rl_gamma$ = makeSymbol("*RL-GAMMA*");

    /**
     * The weighting factor for answer count.
     */
    // deflexical
    private static final SubLSymbol $rl_delta$ = makeSymbol("*RL-DELTA*");

    public static final SubLObject reinforcement_learning_tactician_enabledP() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return $reinforcement_learning_tactician_enabledP$.getDynamicValue(thread);
	}
    }

    public static final SubLObject reinforcement_learning_tactician_use_neural_netP() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return $reinforcement_learning_tactician_use_neural_netP$.getDynamicValue(thread);
	}
    }

    public static final SubLObject enable_reinforcement_learning_tactician_neural_net() {
	return enable_reinforcement_learning_tactician(T, T);
    }

    /**
     *
     *
     * @param DEBUG-MODE?
     * 		booleanp; if t, then the external process will not be spawned,
     * 		and instead it will just print out what it would have sent to the external process.
     * @param USE-NEURAL-NET?
     * 		booleanp; if t, then the reinforcement learning tactician will not use
     * 		an external process at all, but will instead use a neural net that was originally learned from
     * 		the external process.  This forces DEBUG-MODE? to T.
     */
    public static final SubLObject enable_reinforcement_learning_tactician(SubLObject debug_modeP, SubLObject use_neural_netP) {
	if (debug_modeP == UNPROVIDED) {
	    debug_modeP = NIL;
	}
	if (use_neural_netP == UNPROVIDED) {
	    use_neural_netP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != use_neural_netP) {
		debug_modeP = T;
		$reinforcement_learning_tactician_use_neural_netP$.setDynamicValue(T, thread);
	    }
	    if (NIL != debug_modeP) {
		$reinforcement_learning_tactician_enabledP$.setDynamicValue(T, thread);
		$reinforcement_learning_tactician_output_stream$.setGlobalValue(StreamsLow.$standard_output$.getDynamicValue(thread));
		$reinforcement_learning_tactician_input_stream$.setGlobalValue(StreamsLow.$standard_input$.getDynamicValue(thread));
		if (NIL != use_neural_netP) {
		    return $str_alt9$Reinforcement_Learning_tactician_;
		} else {
		    return $str_alt10$Reinforcement_Learning_tactician_;
		}
	    } else {
		ensure_reinforcement_learning_tactician_initialized();
		if (NIL != reinforcement_learning_tactician_initializedP()) {
		    $reinforcement_learning_tactician_enabledP$.setDynamicValue(T, thread);
		    return $str_alt11$Reinforcement_Learning_tactician_;
		} else {
		    Errors.warn($str_alt12$Error__Reinforcement_Learning_tac);
		    return NIL;
		}
	    }
	}
    }

    public static final SubLObject disable_reinforcement_learning_tactician() {
	cleanup_reinforcement_learning_tactician();
	$reinforcement_learning_tactician_enabledP$.setDynamicValue(NIL);
	$reinforcement_learning_tactician_use_neural_netP$.setDynamicValue(NIL);
	return $str_alt13$Reinforcement_Learning_tactician_;
    }

    public static final SubLObject reinitialize_reinforcement_learning_tactician() {
	return initialize_reinforcement_learning_tactician();
    }

    /**
     * Call this to set up the first N queries so that the first experiment won't have to cache anything that later experiments will take advantage of.
     */
    public static final SubLObject balanced_tactician_kbq_run_training_queries_setup(SubLObject n) {
	return balanced_tactician_kbq_run_training_queries(n, ZERO_INTEGER);
    }

    /**
     *
     *
     * @param N
     * 		integerp; It will run the first N queries from the training set unless it takes longer than TIME.
     */
    public static final SubLObject rl_kbq_run_training_queries(SubLObject n, SubLObject time) {
	if (time == UNPROVIDED) {
	    time = $reinforcement_learning_tactician_outermost_loop_time_cutoff$.getGlobalValue();
	}
	{
	    SubLObject ill_formed_input_string = NIL;
	    try {
		return rl_kbq_run_training_queries_int(n, time, T);
	    } catch (Throwable ccatch_env_var) {
		ill_formed_input_string = Errors.handleThrowable(ccatch_env_var, $ILL_FORMED_INPUT);
	    }
	    return rl_kbq_run_training_queries_handle_ill_formed_input(ill_formed_input_string);
	}
    }

    /**
     * Assumes that the reinforcement learning tactician is disabled.
     * This is used for gathering baseline metrics.
     */
    public static final SubLObject balanced_tactician_kbq_run_training_queries(SubLObject n, SubLObject max_time) {
	if (max_time == UNPROVIDED) {
	    max_time = $reinforcement_learning_tactician_default_max_time$.getGlobalValue();
	}
	return rl_kbq_run_training_queries_int(n, max_time, NIL);
    }

    public static final SubLObject rl_kbq_run_training_queries_int(SubLObject n, SubLObject time, SubLObject use_rl_tacticianP) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject total_adjusted_user_time = ZERO_INTEGER;
		SubLObject rlt_answerable_query_count = ONE_INTEGER;
		SubLObject rlt_sum_ln_answer_count = ONE_INTEGER;
		SubLObject rlt_sum_ln_total_steps = ONE_INTEGER;
		SubLObject rlt_sum_ln_steps_to_first_answer = ONE_INTEGER;
		SubLObject list_var = NIL;
		SubLObject query = NIL;
		SubLObject i = NIL;
		for (list_var = list_utilities.first_n(n, simple_training_queries()), query = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), query = list_var.first(), i = add(ONE_INTEGER, i)) {
		    format_nil.force_format(T, $str_alt16$__Query___a___s__, i, query, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    {
			SubLObject query_run = rl_kbq_run_query(query, UNPROVIDED);
			SubLObject answer_count = kbq_query_run.kbq_query_run_answer_count(query_run);
			SubLObject ln_answer_count = (NIL != answer_count) ? ((SubLObject) (log(number_utilities.f_1X(answer_count), UNPROVIDED))) : NIL;
			SubLObject answerableP = subl_promotions.positive_integer_p(answer_count);
			SubLObject total_steps = kbq_query_run.kbq_query_run_total_steps(query_run);
			SubLObject ln_total_steps = (NIL != total_steps) ? ((SubLObject) (log(number_utilities.f_1X(total_steps), UNPROVIDED))) : NIL;
			SubLObject first_answer_steps = kbq_query_run.kbq_query_run_steps_to_first_answer(query_run);
			SubLObject ln_first_answer_steps = (NIL != first_answer_steps) ? ((SubLObject) (log(number_utilities.f_1X(first_answer_steps), UNPROVIDED))) : NIL;
			SubLObject complete_user_time = getf(query_run, $COMPLETE_USER_TIME, ZERO_INTEGER);
			SubLObject rl_tactician_time = getf(query_run, $RL_TACTICIAN_TIME, ZERO_INTEGER);
			SubLObject adjusted_user_time = subtract(complete_user_time, rl_tactician_time);
			{
			    SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
			    try {
				$read_default_float_format$.bind(DOUBLE_FLOAT, thread);
				Errors.warn($str_alt20$Complete_user_time___a__RL_tactic, number_utilities.significant_digits(complete_user_time, SIX_INTEGER), number_utilities.significant_digits(rl_tactician_time, SIX_INTEGER), number_utilities.significant_digits(adjusted_user_time, SIX_INTEGER));
				Errors.warn($str_alt21$Total_steps___a__ln____a___Steps_, new SubLObject[] { total_steps, NIL != ln_total_steps ? ((SubLObject) (number_utilities.significant_digits(ln_total_steps, FOUR_INTEGER))) : NIL, first_answer_steps,
					NIL != ln_first_answer_steps ? ((SubLObject) (number_utilities.significant_digits(ln_first_answer_steps, FOUR_INTEGER))) : NIL, answer_count, NIL != ln_answer_count ? ((SubLObject) (number_utilities.significant_digits(ln_answer_count, FOUR_INTEGER))) : NIL });
			    } finally {
				$read_default_float_format$.rebind(_prev_bind_0, thread);
			    }
			}
			if (NIL != total_steps) {
			    rlt_sum_ln_total_steps = add(rlt_sum_ln_total_steps, ln_total_steps);
			}
			if (NIL != first_answer_steps) {
			    rlt_sum_ln_steps_to_first_answer = add(rlt_sum_ln_steps_to_first_answer, ln_first_answer_steps);
			}
			if (NIL != answerableP) {
			    rlt_answerable_query_count = add(rlt_answerable_query_count, ONE_INTEGER);
			}
			if (NIL != answer_count) {
			    rlt_sum_ln_answer_count = add(rlt_sum_ln_answer_count, ln_answer_count);
			}
			total_adjusted_user_time = add(total_adjusted_user_time, adjusted_user_time);
		    }
		    if (i.numE(number_utilities.f_1_(n)) || ((NIL != time) && total_adjusted_user_time.numG(time))) {
			if (NIL != use_rl_tacticianP) {
			    {
				SubLObject evaluation_metric_result = rl_compute_evaluation_metric(rlt_sum_ln_steps_to_first_answer, rlt_sum_ln_total_steps, rlt_answerable_query_count, rlt_sum_ln_answer_count);
				reinforcement_learning_tactician_write_overall_metrics(evaluation_metric_result);
				return evaluation_metric_result;
			    }
			} else {
			    return values(rlt_sum_ln_steps_to_first_answer, rlt_sum_ln_total_steps, rlt_answerable_query_count, rlt_sum_ln_answer_count);
			}
		    }
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject rl_compute_evaluation_metric(SubLObject rlt_sum_ln_steps_to_first_answer, SubLObject rlt_sum_ln_total_steps, SubLObject rlt_answerable_query_count, SubLObject rlt_sum_ln_answer_count) {
	{
	    SubLObject first_answer_steps_ratio = divide(rlt_sum_ln_steps_to_first_answer, $bt_sum_ln_steps_to_first_answer$.getGlobalValue());
	    SubLObject alpha_term = multiply($rl_alpha$.getGlobalValue(), first_answer_steps_ratio);
	    SubLObject total_steps_ratio = divide(rlt_sum_ln_total_steps, $bt_sum_ln_total_steps$.getGlobalValue());
	    SubLObject beta_term = multiply($rl_beta$.getGlobalValue(), total_steps_ratio);
	    SubLObject answerable_count_ratio = divide(rlt_answerable_query_count, $bt_answerable_query_count$.getGlobalValue());
	    SubLObject gamma_term = multiply($rl_gamma$.getGlobalValue(), answerable_count_ratio);
	    SubLObject answer_count_ratio = divide(rlt_sum_ln_answer_count, $bt_sum_ln_answer_count$.getGlobalValue());
	    SubLObject delta_term = multiply($rl_delta$.getGlobalValue(), answer_count_ratio);
	    return add(new SubLObject[] { alpha_term, beta_term, gamma_term, delta_term });
	}
    }

    /**
     * A dynamic variable used to keep track of the time spent externally calling the RL tactician.
     */
    // defparameter
    private static final SubLSymbol $rl_tactician_time$ = makeSymbol("*RL-TACTICIAN-TIME*");

    public static final SubLObject rl_kbq_run_query(SubLObject query, SubLObject max_time) {
	if (max_time == UNPROVIDED) {
	    max_time = $reinforcement_learning_tactician_default_max_time$.getGlobalValue();
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject result = NIL;
		if (NIL != kb_query.kbq_runnableP(query)) {
		    {
			SubLObject _prev_bind_0 = $rl_tactician_time$.currentBinding(thread);
			SubLObject _prev_bind_1 = inference_worker_split.$meta_split_tactics_enabledP$.currentBinding(thread);
			try {
			    $rl_tactician_time$.bind(ZERO_INTEGER, thread);
			    inference_worker_split.$meta_split_tactics_enabledP$.bind(NIL, thread);
			    {
				SubLObject query_properties = putf(copy_list($reinforcement_learning_tactician_query_properties$.getGlobalValue()), $MAX_TIME, max_time);
				SubLObject query_run = kbq_query_run.kbq_run_query(query, $reinforcement_learning_tactician_metrics$.getGlobalValue(), NIL, query_properties, UNPROVIDED, UNPROVIDED_SYM);
				query_run = putf(query_run, $RL_TACTICIAN_TIME, $rl_tactician_time$.getDynamicValue(thread));
				result = query_run;
			    }
			} finally {
			    inference_worker_split.$meta_split_tactics_enabledP$.rebind(_prev_bind_1, thread);
			    $rl_tactician_time$.rebind(_prev_bind_0, thread);
			}
		    }
		}
		return result;
	    }
	}
    }

    public static final SubLObject reinforcement_learning_tactician_categorize_strategems_wrt_removal(SubLObject strategy, SubLObject strategems_to_activate, SubLObject strategems_to_set_aside, SubLObject strategems_to_throw_away) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject time = ZERO_INTEGER;
		SubLObject time_var = get_internal_real_time();
		if (NIL == kb_control_vars.within_forward_inferenceP()) {
		    {
			SubLObject new_strategems_to_activate = strategems_to_activate;
			SubLObject new_strategems_to_throw_away = strategems_to_throw_away;
			SubLObject cdolist_list_var = list_utilities.remove_if_not(TACTIC_P, new_strategems_to_throw_away, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			SubLObject tactic = NIL;
			for (tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), tactic = cdolist_list_var.first()) {
			    if (NIL == inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_throw_away_tacticP(strategy, tactic, $REMOVAL, UNPROVIDED, UNPROVIDED)) {
				new_strategems_to_activate = cons(tactic, new_strategems_to_activate);
				new_strategems_to_throw_away = remove(tactic, new_strategems_to_throw_away, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			    }
			}
			thread.resetMultipleValues();
			{
			    SubLObject rl_tactics = possibly_withhold_some_strategems_from_reinforcement_learning_tactician(strategy, new_strategems_to_activate);
			    SubLObject non_rl_strategems = thread.secondMultipleValue();
			    thread.resetMultipleValues();
			    if (NIL != rl_tactics) {
				{
				    SubLObject ordered_tactics_to_activate = reinforcement_learning_tactician_order_tactics_wrt_removal(rl_tactics, strategy);
				    SubLObject tactics_to_not_activate = set_difference(rl_tactics, ordered_tactics_to_activate, UNPROVIDED, UNPROVIDED);
				    new_strategems_to_throw_away = append(new_strategems_to_throw_away, non_rl_strategems, tactics_to_not_activate);
				    strategems_to_activate = nreverse(ordered_tactics_to_activate);
				    strategems_to_throw_away = new_strategems_to_throw_away;
				}
			    }
			}
		    }
		}
		time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
		if (NIL != $rl_tactician_time$.getDynamicValue(thread)) {
		    $rl_tactician_time$.setDynamicValue(add($rl_tactician_time$.getDynamicValue(thread), time), thread);
		}
	    }
	    return values(strategems_to_activate, strategems_to_set_aside, strategems_to_throw_away);
	}
    }

    public static final SubLObject reinforcement_learning_tactician_initializedP() {
	return makeBoolean($reinforcement_learning_tactician_output_stream$.getGlobalValue().isStream() && $reinforcement_learning_tactician_input_stream$.getGlobalValue().isStream());
    }

    public static final SubLObject ensure_reinforcement_learning_tactician_initialized() {
	if (NIL == reinforcement_learning_tactician_initializedP()) {
	    initialize_reinforcement_learning_tactician();
	    return T;
	}
	return NIL;
    }

    public static final SubLObject initialize_reinforcement_learning_tactician() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    cleanup_reinforcement_learning_tactician();
	    {
		SubLObject os_process = os_process_utilities.make_os_process($$$Forked_RLTactician, $reinforcement_learning_tactician_executable_pathname$.getGlobalValue(), list($reinforcement_learning_tactician_executable_param$.getDynamicValue(thread)), $STREAM, $STREAM, $OUTPUT);
		sleep($float$0_5);
		SubLSystemTrampolineFile.checkType(os_process, $sym29$OS_PROCESS_RUNNING_);
		$reinforcement_learning_tactician_os_process$.setGlobalValue(os_process);
		os_process_utilities.show_os_processes();
		$reinforcement_learning_tactician_input_stream$.setGlobalValue(os_process_utilities.os_process_stdout_stream(os_process));
		$reinforcement_learning_tactician_output_stream$.setGlobalValue(os_process_utilities.os_process_stdin_stream(os_process));
	    }
	    return T;
	}
    }

    public static final SubLObject cleanup_reinforcement_learning_tactician() {
	if (NIL != os_process_utilities.os_process_p($reinforcement_learning_tactician_os_process$.getGlobalValue())) {
	    os_process_utilities.destroy_os_process($reinforcement_learning_tactician_os_process$.getGlobalValue());
	    $reinforcement_learning_tactician_os_process$.setGlobalValue(NIL);
	    $reinforcement_learning_tactician_input_stream$.setGlobalValue(NIL);
	    $reinforcement_learning_tactician_output_stream$.setGlobalValue(NIL);
	    return T;
	}
	return NIL;
    }

    public static final SubLObject possibly_withhold_some_strategems_from_reinforcement_learning_tactician(SubLObject strategy, SubLObject strategems) {
	{
	    SubLObject rl_tactics = NIL;
	    SubLObject non_rl_strategems = NIL;
	    SubLObject cdolist_list_var = strategems;
	    SubLObject strategem = NIL;
	    for (strategem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), strategem = cdolist_list_var.first()) {
		if ((NIL != inference_datastructures_tactic.tactic_p(strategem)) && (NIL == balanced_strategy_chooses_to_withhold_tactic_from_reinforcement_learning_tacticianP(strategy, strategem))) {
		    rl_tactics = cons(strategem, rl_tactics);
		} else {
		    non_rl_strategems = cons(strategem, non_rl_strategems);
		}
	    }
	    return values(nreverse(rl_tactics), nreverse(non_rl_strategems));
	}
    }

    public static final SubLObject balanced_strategy_chooses_to_withhold_tactic_from_reinforcement_learning_tacticianP(SubLObject strategy, SubLObject tactic) {
	return makeBoolean((((NIL != inference_worker.structural_tactic_p(tactic)) && ($DISALLOWED == inference_datastructures_strategy.tactic_strategic_preference_level(tactic, strategy)))
		|| ((NIL != inference_worker.content_tactic_p(tactic)) && ($IMPOSSIBLE == inference_datastructures_strategy.tactic_strategic_completeness(tactic, strategy))))
		|| (NIL != inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_throw_away_tacticP(strategy, tactic, $REMOVAL, UNPROVIDED, UNPROVIDED)));
    }

    /**
     *
     *
     * @return a subset of TACTICS ordered from best to worst.
     */
    public static final SubLObject reinforcement_learning_tactician_order_tactics_wrt_removal(SubLObject tactics, SubLObject strategy) {
	{
	    SubLObject ordered_tactics_to_activate = NIL;
	    if (NIL != reinforcement_learning_tactician_use_neural_netP()) {
		ordered_tactics_to_activate = reinforcement_learning_tactician_order_tactics_via_neural_net(tactics, strategy);
	    } else {
		reinforcement_learning_tactician_write_tactics(tactics, strategy);
		ordered_tactics_to_activate = reinforcement_learning_tactician_read_tactics();
	    }
	    return throw_away_extra_connected_conjunction_tactics(ordered_tactics_to_activate);
	}
    }

    /**
     * Throw away all connected conjunction tactics except the first
     */
    public static final SubLObject throw_away_extra_connected_conjunction_tactics(SubLObject tactics) {
	{
	    SubLObject first_connected_conjunction_tactic = find_if(CONNECTED_CONJUNCTION_TACTIC_P, tactics, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    SubLObject extra_connected_conjunction_tactics = remove(first_connected_conjunction_tactic, list_utilities.remove_if_not(CONNECTED_CONJUNCTION_TACTIC_P, tactics, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    return list_utilities.ordered_set_difference(tactics, extra_connected_conjunction_tactics, UNPROVIDED, UNPROVIDED);
	}
    }

    public static final SubLObject reinforcement_learning_tactician_write_tactics(SubLObject tactics, SubLObject strategy) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject tactic_count = length(tactics);
		SubLSystemTrampolineFile.checkType(tactic_count, POSITIVE_INTEGER_P);
		format_nil.force_format($reinforcement_learning_tactician_output_stream$.getGlobalValue(), $str_alt34$_a__, tactic_count, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		if (NIL != $reinforcement_learning_tactician_debug_outputP$.getDynamicValue(thread)) {
		    Errors.warn($str_alt35$tc__a__, tactic_count);
		}
		{
		    SubLObject cdolist_list_var = tactics;
		    SubLObject tactic = NIL;
		    for (tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), tactic = cdolist_list_var.first()) {
			reinforcement_learning_tactician_write_tactic(tactic, strategy);
		    }
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject reinforcement_learning_tactician_write_tactic(SubLObject tactic, SubLObject strategy) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    thread.resetMultipleValues();
	    {
		SubLObject store_suid = inference_datastructures_tactic.tactic_ids(tactic);
		SubLObject problem_suid = thread.secondMultipleValue();
		SubLObject tactic_suid = thread.thirdMultipleValue();
		thread.resetMultipleValues();
		thread.resetMultipleValues();
		{
		    SubLObject type_code = encode_tactic_for_reinforcement_learning_tactician(tactic, strategy);
		    SubLObject productivity = thread.secondMultipleValue();
		    SubLObject completeness_code = thread.thirdMultipleValue();
		    SubLObject preference_level_code = thread.fourthMultipleValue();
		    thread.resetMultipleValues();
		    format_nil.force_format($reinforcement_learning_tactician_output_stream$.getGlobalValue(), $str_alt36$_a__a__a__a__a__a__a__, store_suid, problem_suid, tactic_suid, type_code, productivity, completeness_code, preference_level_code, UNPROVIDED);
		    if (NIL != $reinforcement_learning_tactician_debug_outputP$.getDynamicValue(thread)) {
			Errors.warn($str_alt37$t__a__a__a__a__a__a__a__, new SubLObject[] { store_suid, problem_suid, tactic_suid, type_code, productivity, completeness_code, preference_level_code });
		    }
		}
	    }
	    return tactic;
	}
    }

    public static final SubLObject encode_tactic_for_reinforcement_learning_tactician(SubLObject tactic, SubLObject strategy) {
	{
	    SubLObject type_code = reinforcement_learning_tactician_tactic_type_code(tactic);
	    SubLObject productivity = inference_datastructures_strategy.tactic_strategic_productivity(tactic, strategy);
	    SubLObject completeness_code = reinforcement_learning_tactician_completeness_code(NIL != inference_worker.content_tactic_p(tactic) ? ((SubLObject) (inference_datastructures_strategy.tactic_strategic_completeness(tactic, strategy))) : NIL);
	    SubLObject preference_level_code = reinforcement_learning_tactician_preference_level_code(NIL != inference_worker.structural_tactic_p(tactic) ? ((SubLObject) (inference_datastructures_strategy.tactic_strategic_preference_level(tactic, strategy))) : NIL);
	    SubLSystemTrampolineFile.checkType(type_code, NON_NEGATIVE_INTEGER_P);
	    SubLSystemTrampolineFile.checkType(productivity, NON_NEGATIVE_INTEGER_P);
	    SubLSystemTrampolineFile.checkType(completeness_code, NON_NEGATIVE_INTEGER_P);
	    SubLSystemTrampolineFile.checkType(preference_level_code, NON_NEGATIVE_INTEGER_P);
	    return values(type_code, productivity, completeness_code, preference_level_code);
	}
    }

    public static final SubLObject reinforcement_learning_tactician_tactic_type_code(SubLObject tactic) {
	if (NIL != inference_worker_removal.generalized_removal_tactic_p(tactic)) {
	    return ZERO_INTEGER;
	} else if (NIL != inference_worker_union.union_tactic_p(tactic)) {
	    return ONE_INTEGER;
	} else if (NIL != inference_worker_join.join_tactic_p(tactic)) {
	    return TWO_INTEGER;
	} else if (NIL != inference_worker_join_ordered.join_ordered_tactic_p(tactic)) {
	    return THREE_INTEGER;
	} else if (NIL != inference_worker_split.split_tactic_p(tactic)) {
	    return FOUR_INTEGER;
	} else {
	    return Errors.error($str_alt39$reinforcement_learning_tactician_, inference_datastructures_tactic.tactic_type(tactic));
	}

    }

    public static final SubLObject reinforcement_learning_tactician_completeness_code(SubLObject completeness) {
	{
	    SubLObject pcase_var = completeness;
	    if (pcase_var.eql(NIL)) {
		return ZERO_INTEGER;
	    } else if (pcase_var.eql($GROSSLY_INCOMPLETE)) {
		return ONE_INTEGER;
	    } else if (pcase_var.eql($INCOMPLETE)) {
		return TWO_INTEGER;
	    } else if (pcase_var.eql($COMPLETE)) {
		return THREE_INTEGER;
	    } else {
		return Errors.error($str_alt43$unexpected_completeness__s, completeness);
	    }

	}
    }

    public static final SubLObject reinforcement_learning_tactician_preference_level_code(SubLObject preference_level) {
	{
	    SubLObject pcase_var = preference_level;
	    if (pcase_var.eql(NIL)) {
		return ZERO_INTEGER;
	    } else if (pcase_var.eql($GROSSLY_DISPREFERRED)) {
		return ONE_INTEGER;
	    } else if (pcase_var.eql($DISPREFERRED)) {
		return TWO_INTEGER;
	    } else if (pcase_var.eql($PREFERRED)) {
		return THREE_INTEGER;
	    } else {
		return Errors.error($str_alt47$unexpected_preference_level__s, preference_level);
	    }

	}
    }

    public static final SubLObject reinforcement_learning_tactician_write_overall_metrics(SubLObject evaluation_metric_result) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    format_nil.force_format($reinforcement_learning_tactician_output_stream$.getGlobalValue(), $str_alt48$_1__a__, evaluation_metric_result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    if (NIL != $reinforcement_learning_tactician_debug_outputP$.getDynamicValue(thread)) {
		Errors.warn($str_alt48$_1__a__, evaluation_metric_result);
	    }
	    return NIL;
	}
    }

    public static final SubLObject reinforcement_learning_tactician_read_tactics() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject tactics = NIL;
		SubLObject tactic_count_string = read_line($reinforcement_learning_tactician_input_stream$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
		SubLObject tactic_count = string_utilities.string_to_integer(tactic_count_string);
		if (NIL != $reinforcement_learning_tactician_debug_outputP$.getDynamicValue(thread)) {
		    Errors.warn($str_alt49$readTC__a__, tactic_count);
		}
		if (NIL == subl_promotions.non_negative_integer_p(tactic_count)) {
		    rlt_error($str_alt50$_s_did_not_parse_to_a_non_negativ, tactic_count_string, tactic_count_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		{
		    SubLObject i = NIL;
		    for (i = ZERO_INTEGER; i.numL(tactic_count); i = add(i, ONE_INTEGER)) {
			tactics = cons(reinforcement_learning_tactician_read_tactic(), tactics);
		    }
		}
		return nreverse(tactics);
	    }
	}
    }

    public static final SubLObject reinforcement_learning_tactician_read_tactic() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject string = read_line($reinforcement_learning_tactician_input_stream$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
		SubLObject id_strings = string_utilities.split_string(string, UNPROVIDED);
		if (NIL == list_utilities.tripleP(id_strings)) {
		    rlt_error($str_alt51$_s_did_not_parse_to_a_list_of_len, string, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		{
		    SubLObject datum = id_strings;
		    SubLObject current = datum;
		    SubLObject store_id_string = NIL;
		    SubLObject problem_id_string = NIL;
		    SubLObject tactic_id_string = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt52);
		    store_id_string = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt52);
		    problem_id_string = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt52);
		    tactic_id_string = current.first();
		    current = current.rest();
		    if (NIL == current) {
			{
			    SubLObject store_id = string_utilities.string_to_integer(store_id_string);
			    SubLObject problem_id = string_utilities.string_to_integer(problem_id_string);
			    SubLObject tactic_id = string_utilities.string_to_integer(tactic_id_string);
			    if (NIL == subl_promotions.non_negative_integer_p(store_id)) {
				rlt_error($str_alt53$_s__parsed_from__s__was_not_a_non, string, store_id, string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			    }
			    if (NIL == subl_promotions.non_negative_integer_p(problem_id)) {
				rlt_error($str_alt53$_s__parsed_from__s__was_not_a_non, string, problem_id, string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			    }
			    if (NIL == subl_promotions.non_negative_integer_p(tactic_id)) {
				rlt_error($str_alt53$_s__parsed_from__s__was_not_a_non, string, tactic_id, string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			    }
			    {
				SubLObject tactic = inference_datastructures_tactic.find_tactic_by_ids(store_id, problem_id, tactic_id);
				if (NIL == inference_datastructures_tactic.tactic_p(tactic)) {
				    rlt_error($str_alt54$Could_not_find_a_tactic_correspon, string, string, store_id, problem_id, tactic_id, UNPROVIDED);
				}
				if (NIL != $reinforcement_learning_tactician_debug_outputP$.getDynamicValue(thread)) {
				    Errors.warn($str_alt55$readT__a__a__a__, store_id, problem_id, tactic_id);
				}
				return tactic;
			    }
			}
		    } else {
			cdestructuring_bind_error(datum, $list_alt52);
		    }
		}
	    }
	    return NIL;
	}
    }

    /**
     * Warn and throw to the :ill-formed-input tag.
     */
    public static final SubLObject rlt_error(SubLObject format_string, SubLObject offending_string, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
	if (arg1 == UNPROVIDED) {
	    arg1 = NIL;
	}
	if (arg2 == UNPROVIDED) {
	    arg2 = NIL;
	}
	if (arg3 == UNPROVIDED) {
	    arg3 = NIL;
	}
	if (arg4 == UNPROVIDED) {
	    arg4 = NIL;
	}
	if (arg5 == UNPROVIDED) {
	    arg5 = NIL;
	}
	Errors.warn(format_string, new SubLObject[] { arg1, arg2, arg3, arg4, arg5 });
	return sublisp_throw($ILL_FORMED_INPUT, offending_string);
    }

    // deflexical
    private static final SubLSymbol $reinforcement_learning_tactician_abort_string$ = makeSymbol("*REINFORCEMENT-LEARNING-TACTICIAN-ABORT-STRING*");

    // deflexical
    private static final SubLSymbol $reinforcement_learning_tactician_ack_string$ = makeSymbol("*REINFORCEMENT-LEARNING-TACTICIAN-ACK-STRING*");

    /**
     * If the ill-formed input was an ABORT request, send an ack and exit.
     * If the ill-formed input was just some random crap, send an ABORT request, wait for an ACK, then exit.
     * If you get an ABORT request while waiting for an ack, send an ack and exit.
     */
    public static final SubLObject rl_kbq_run_training_queries_handle_ill_formed_input(SubLObject ill_formed_input_string) {
	if (NIL == string_utilities.substringP($reinforcement_learning_tactician_abort_string$.getGlobalValue(), ill_formed_input_string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
	    Errors.warn($str_alt58$Got_ill_formed_input_string__s__s, ill_formed_input_string);
	    format_nil.force_format($reinforcement_learning_tactician_output_stream$.getGlobalValue(), $str_alt34$_a__, $reinforcement_learning_tactician_abort_string$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    {
		SubLObject ackP = NIL;
		while (NIL == ackP) {
		    {
			SubLObject string = read_line($reinforcement_learning_tactician_input_stream$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
			if (NIL != string_utilities.substringP($reinforcement_learning_tactician_ack_string$.getGlobalValue(), string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
			    ackP = T;
			} else if (NIL != string_utilities.substringP($reinforcement_learning_tactician_abort_string$.getGlobalValue(), string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
			    rl_kbq_run_training_queries_send_ack();
			    return NIL;
			} else {
			    Errors.warn($str_alt59$Hoping_for_ack__got__s_instead, string);
			}

		    }
		}
		Errors.warn($str_alt60$Got_ack__exiting_rl_kbq_run_train);
	    }
	} else {
	    rl_kbq_run_training_queries_send_ack();
	}
	return NIL;
    }

    public static final SubLObject rl_kbq_run_training_queries_send_ack() {
	Errors.warn($str_alt61$Got_abort_request__sending_ack);
	format_nil.force_format($reinforcement_learning_tactician_output_stream$.getGlobalValue(), $str_alt34$_a__, $reinforcement_learning_tactician_ack_string$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	Errors.warn($str_alt62$Sent_ack__exiting_rl_kbq_run_trai);
	return NIL;
    }

    public static final SubLObject reinforcement_learning_tactician_order_tactics_via_neural_net(SubLObject tactics, SubLObject strategy) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject dict = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
		SubLObject cdolist_list_var = tactics;
		SubLObject tactic = NIL;
		for (tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), tactic = cdolist_list_var.first()) {
		    thread.resetMultipleValues();
		    {
			SubLObject type_code = encode_tactic_for_reinforcement_learning_tactician(tactic, strategy);
			SubLObject productivity = thread.secondMultipleValue();
			SubLObject completeness_code = thread.thirdMultipleValue();
			SubLObject preference_level_code = thread.fourthMultipleValue();
			thread.resetMultipleValues();
			{
			    SubLObject happiness = neural_net.rl_tactician_evaluate_neural_net(productivity, completeness_code, preference_level_code, type_code);
			    dictionary.dictionary_enter(dict, tactic, happiness);
			}
		    }
		}
		return list_utilities.alist_keys(dictionary_utilities.sort_dictionary_by_values(dict, symbol_function($sym63$_)));
	    }
	}
    }

    public static final SubLObject simple_training_queries() {
	return simple_training_or_test_queries(T);
    }

    public static final SubLObject simple_test_queries() {
	return simple_training_or_test_queries(NIL);
    }

    // deflexical
    private static final SubLSymbol $all_simple_queries_filename$ = makeSymbol("*ALL-SIMPLE-QUERIES-FILENAME*");

    // deflexical
    private static final SubLSymbol $disallowed_queries_filename$ = makeSymbol("*DISALLOWED-QUERIES-FILENAME*");

    /**
     * This probably need only be run once.
     */
    public static final SubLObject write_out_all_simple_queries(SubLObject include_nl_and_sksi_queriesP) {
	if (include_nl_and_sksi_queriesP == UNPROVIDED) {
	    include_nl_and_sksi_queriesP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject queries = NIL;
		{
		    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
		    try {
			mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
			mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
			{
			    SubLObject list_var = isa.all_fort_instances($$CycLQuerySpecification, UNPROVIDED, UNPROVIDED);
			    utilities_macros.$progress_note$.setDynamicValue($$$cdolist, thread);
			    utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
			    utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
			    utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
			    {
				SubLObject _prev_bind_0_1 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
				SubLObject _prev_bind_1_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
				SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
				SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
				try {
				    utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
				    utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
				    utilities_macros.$within_noting_percent_progress$.bind(T, thread);
				    utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
				    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
				    {
					SubLObject csome_list_var = list_var;
					SubLObject query = NIL;
					for (query = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest(), query = csome_list_var.first()) {
					    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
					    utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
					    if (NIL != kb_query.kbq_runnableP(query)) {
						if (NIL != kb_query.kbq_simple_queryP(query)) {
						    if (NIL == kbq_query_run.kbq_single_literal_query_p(query)) {
							if (NIL == kb_query.kbq_conditional_queryP(query)) {
							    if ((NIL != include_nl_and_sksi_queriesP) || (NIL == isa.isa_anyP(query, $list_alt70, UNPROVIDED, UNPROVIDED))) {
								queries = cons(query, queries);
							    }
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
				    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_2, thread);
				    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_1, thread);
				}
			    }
			}
		    } finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		    }
		}
		format(T, $str_alt71$Initial_query_count___a__, length(queries));
		if (NIL != file_utilities.file_existsP($disallowed_queries_filename$.getGlobalValue())) {
		    {
			SubLObject disallowed_queries = cfasl_utilities.cfasl_load($disallowed_queries_filename$.getGlobalValue());
			format(T, $str_alt72$Filtering_out_up_to__a_disallowed, length(disallowed_queries));
			queries = list_utilities.fast_set_difference(queries, disallowed_queries, UNPROVIDED);
		    }
		}
		queries = list_utilities.randomize_list(queries);
		format(T, $str_alt73$Final_query_count___a__, length(queries));
		cfasl_utilities.cfasl_save_externalized(queries, $all_simple_queries_filename$.getGlobalValue());
		return length(queries);
	    }
	}
    }

    public static final SubLObject all_simple_queries() {
	if (NIL == $all_simple_queries$.getGlobalValue()) {
	    $all_simple_queries$.setGlobalValue(cfasl_utilities.cfasl_load($all_simple_queries_filename$.getGlobalValue()));
	}
	return copy_list($all_simple_queries$.getGlobalValue());
    }

    public static final SubLObject simple_training_or_test_queries(SubLObject trainingP) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject n = length(all_simple_queries());
		SubLObject training_query_count = round(divide(n, TWO_INTEGER), UNPROVIDED);
		thread.resetMultipleValues();
		{
		    SubLObject training_queries = list_utilities.split_list(all_simple_queries(), training_query_count);
		    SubLObject test_queries = thread.secondMultipleValue();
		    thread.resetMultipleValues();
		    if (NIL != trainingP) {
			return training_queries;
		    } else {
			return test_queries;
		    }
		}
	    }
	}
    }

    public static final SubLObject balanced_tactician_kbq_run_training_query(SubLObject query, SubLObject i, SubLObject max_time) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject answerableP = NIL;
		SubLObject query_run = rl_kbq_run_query(query, max_time);
		if (NIL == query_run) {
		    format(T, $str_alt75$Query___a__UNRUNNABLE__, i);
		} else {
		    {
			SubLObject answer_count = kbq_query_run.kbq_query_run_answer_count(query_run);
			SubLObject tactic_execution_count = kbq_query_run.kbq_query_run_property_value(query_run, $TACTIC_EXECUTION_COUNT, UNPROVIDED);
			SubLObject time_to_first_answer = kbq_query_run.kbq_query_run_time_to_first_answer(query_run);
			SubLObject total_time = kbq_query_run.kbq_query_run_total_time(query_run);
			SubLObject complete_time_to_first_answer = kbq_query_run.kbq_query_run_complete_time_to_first_answer(query_run);
			SubLObject complete_total_time = kbq_query_run.kbq_query_run_complete_total_time(query_run);
			SubLObject complete_user_time = kbq_query_run.kbq_query_run_property_value(query_run, $COMPLETE_USER_TIME, UNPROVIDED);
			if (NIL != subl_promotions.positive_integer_p(answer_count)) {
			    answerableP = T;
			}
			{
			    SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
			    try {
				$read_default_float_format$.bind(DOUBLE_FLOAT, thread);
				format(T, $str_alt77$Query___a___a__a__a__a__a__a__a__,
					new SubLObject[] { i, answer_count, tactic_execution_count, NIL != complete_time_to_first_answer ? ((SubLObject) (number_utilities.significant_digits(complete_time_to_first_answer, FOUR_INTEGER))) : NIL,
						NIL != time_to_first_answer ? ((SubLObject) (number_utilities.significant_digits(time_to_first_answer, FOUR_INTEGER))) : NIL, NIL != complete_total_time ? ((SubLObject) (number_utilities.significant_digits(complete_total_time, FOUR_INTEGER))) : NIL,
						NIL != total_time ? ((SubLObject) (number_utilities.significant_digits(total_time, FOUR_INTEGER))) : NIL, NIL != complete_user_time ? ((SubLObject) (number_utilities.significant_digits(complete_user_time, FOUR_INTEGER))) : NIL });
			    } finally {
				$read_default_float_format$.rebind(_prev_bind_0, thread);
			    }
			}
		    }
		}
		force_output(UNPROVIDED);
		return answerableP;
	    }
	}
    }

    public static final SubLObject declare_reinforcement_learning_tactician_file() {
	declareFunction("reinforcement_learning_tactician_query_properties", "REINFORCEMENT-LEARNING-TACTICIAN-QUERY-PROPERTIES", 0, 0, false);
	declareFunction("reinforcement_learning_tactician_enabledP", "REINFORCEMENT-LEARNING-TACTICIAN-ENABLED?", 0, 0, false);
	declareFunction("reinforcement_learning_tactician_use_neural_netP", "REINFORCEMENT-LEARNING-TACTICIAN-USE-NEURAL-NET?", 0, 0, false);
	declareFunction("enable_reinforcement_learning_tactician_neural_net", "ENABLE-REINFORCEMENT-LEARNING-TACTICIAN-NEURAL-NET", 0, 0, false);
	declareFunction("enable_reinforcement_learning_tactician", "ENABLE-REINFORCEMENT-LEARNING-TACTICIAN", 0, 2, false);
	declareFunction("disable_reinforcement_learning_tactician", "DISABLE-REINFORCEMENT-LEARNING-TACTICIAN", 0, 0, false);
	declareFunction("reinitialize_reinforcement_learning_tactician", "REINITIALIZE-REINFORCEMENT-LEARNING-TACTICIAN", 0, 0, false);
	declareFunction("balanced_tactician_kbq_run_training_queries_setup", "BALANCED-TACTICIAN-KBQ-RUN-TRAINING-QUERIES-SETUP", 1, 0, false);
	declareFunction("rl_kbq_run_training_queries", "RL-KBQ-RUN-TRAINING-QUERIES", 1, 1, false);
	declareFunction("balanced_tactician_kbq_run_training_queries", "BALANCED-TACTICIAN-KBQ-RUN-TRAINING-QUERIES", 1, 1, false);
	declareFunction("rl_kbq_run_training_queries_int", "RL-KBQ-RUN-TRAINING-QUERIES-INT", 3, 0, false);
	declareFunction("rl_compute_evaluation_metric", "RL-COMPUTE-EVALUATION-METRIC", 4, 0, false);
	declareFunction("rl_kbq_run_query", "RL-KBQ-RUN-QUERY", 1, 1, false);
	declareFunction("reinforcement_learning_tactician_categorize_strategems_wrt_removal", "REINFORCEMENT-LEARNING-TACTICIAN-CATEGORIZE-STRATEGEMS-WRT-REMOVAL", 4, 0, false);
	declareFunction("reinforcement_learning_tactician_initializedP", "REINFORCEMENT-LEARNING-TACTICIAN-INITIALIZED?", 0, 0, false);
	declareFunction("ensure_reinforcement_learning_tactician_initialized", "ENSURE-REINFORCEMENT-LEARNING-TACTICIAN-INITIALIZED", 0, 0, false);
	declareFunction("initialize_reinforcement_learning_tactician", "INITIALIZE-REINFORCEMENT-LEARNING-TACTICIAN", 0, 0, false);
	declareFunction("cleanup_reinforcement_learning_tactician", "CLEANUP-REINFORCEMENT-LEARNING-TACTICIAN", 0, 0, false);
	declareFunction("possibly_withhold_some_strategems_from_reinforcement_learning_tactician", "POSSIBLY-WITHHOLD-SOME-STRATEGEMS-FROM-REINFORCEMENT-LEARNING-TACTICIAN", 2, 0, false);
	declareFunction("balanced_strategy_chooses_to_withhold_tactic_from_reinforcement_learning_tacticianP", "BALANCED-STRATEGY-CHOOSES-TO-WITHHOLD-TACTIC-FROM-REINFORCEMENT-LEARNING-TACTICIAN?", 2, 0, false);
	declareFunction("reinforcement_learning_tactician_order_tactics_wrt_removal", "REINFORCEMENT-LEARNING-TACTICIAN-ORDER-TACTICS-WRT-REMOVAL", 2, 0, false);
	declareFunction("throw_away_extra_connected_conjunction_tactics", "THROW-AWAY-EXTRA-CONNECTED-CONJUNCTION-TACTICS", 1, 0, false);
	declareFunction("reinforcement_learning_tactician_write_tactics", "REINFORCEMENT-LEARNING-TACTICIAN-WRITE-TACTICS", 2, 0, false);
	declareFunction("reinforcement_learning_tactician_write_tactic", "REINFORCEMENT-LEARNING-TACTICIAN-WRITE-TACTIC", 2, 0, false);
	declareFunction("encode_tactic_for_reinforcement_learning_tactician", "ENCODE-TACTIC-FOR-REINFORCEMENT-LEARNING-TACTICIAN", 2, 0, false);
	declareFunction("reinforcement_learning_tactician_tactic_type_code", "REINFORCEMENT-LEARNING-TACTICIAN-TACTIC-TYPE-CODE", 1, 0, false);
	declareFunction("reinforcement_learning_tactician_completeness_code", "REINFORCEMENT-LEARNING-TACTICIAN-COMPLETENESS-CODE", 1, 0, false);
	declareFunction("reinforcement_learning_tactician_preference_level_code", "REINFORCEMENT-LEARNING-TACTICIAN-PREFERENCE-LEVEL-CODE", 1, 0, false);
	declareFunction("reinforcement_learning_tactician_write_overall_metrics", "REINFORCEMENT-LEARNING-TACTICIAN-WRITE-OVERALL-METRICS", 1, 0, false);
	declareFunction("reinforcement_learning_tactician_read_tactics", "REINFORCEMENT-LEARNING-TACTICIAN-READ-TACTICS", 0, 0, false);
	declareFunction("reinforcement_learning_tactician_read_tactic", "REINFORCEMENT-LEARNING-TACTICIAN-READ-TACTIC", 0, 0, false);
	declareFunction("rlt_error", "RLT-ERROR", 2, 5, false);
	declareFunction("rl_kbq_run_training_queries_handle_ill_formed_input", "RL-KBQ-RUN-TRAINING-QUERIES-HANDLE-ILL-FORMED-INPUT", 1, 0, false);
	declareFunction("rl_kbq_run_training_queries_send_ack", "RL-KBQ-RUN-TRAINING-QUERIES-SEND-ACK", 0, 0, false);
	declareFunction("reinforcement_learning_tactician_order_tactics_via_neural_net", "REINFORCEMENT-LEARNING-TACTICIAN-ORDER-TACTICS-VIA-NEURAL-NET", 2, 0, false);
	declareFunction("simple_training_queries", "SIMPLE-TRAINING-QUERIES", 0, 0, false);
	declareFunction("simple_test_queries", "SIMPLE-TEST-QUERIES", 0, 0, false);
	declareFunction("write_out_all_simple_queries", "WRITE-OUT-ALL-SIMPLE-QUERIES", 0, 1, false);
	declareFunction("all_simple_queries", "ALL-SIMPLE-QUERIES", 0, 0, false);
	declareFunction("simple_training_or_test_queries", "SIMPLE-TRAINING-OR-TEST-QUERIES", 1, 0, false);
	declareFunction("balanced_tactician_kbq_run_training_query", "BALANCED-TACTICIAN-KBQ-RUN-TRAINING-QUERY", 3, 0, false);
	return NIL;
    }

    public static final SubLObject init_reinforcement_learning_tactician_file() {
	defvar("*REINFORCEMENT-LEARNING-TACTICIAN-ENABLED?*", NIL);
	defvar("*REINFORCEMENT-LEARNING-TACTICIAN-USE-NEURAL-NET?*", NIL);
	deflexical("*REINFORCEMENT-LEARNING-TACTICIAN-OS-PROCESS*", NIL != boundp($reinforcement_learning_tactician_os_process$) ? ((SubLObject) ($reinforcement_learning_tactician_os_process$.getGlobalValue())) : NIL);
	deflexical("*REINFORCEMENT-LEARNING-TACTICIAN-INPUT-STREAM*", NIL != boundp($reinforcement_learning_tactician_input_stream$) ? ((SubLObject) ($reinforcement_learning_tactician_input_stream$.getGlobalValue())) : NIL);
	deflexical("*REINFORCEMENT-LEARNING-TACTICIAN-OUTPUT-STREAM*", NIL != boundp($reinforcement_learning_tactician_output_stream$) ? ((SubLObject) ($reinforcement_learning_tactician_output_stream$.getGlobalValue())) : NIL);
	deflexical("*REINFORCEMENT-LEARNING-TACTICIAN-EXECUTABLE-PATHNAME*", $str_alt3$_cyc_projects_transfer_learning_R);
	defvar("*REINFORCEMENT-LEARNING-TACTICIAN-EXECUTABLE-PARAM*", NIL);
	defvar("*REINFORCEMENT-LEARNING-TACTICIAN-DEBUG-OUTPUT?*", NIL);
	deflexical("*REINFORCEMENT-LEARNING-TACTICIAN-METRICS*", $list_alt4);
	deflexical("*REINFORCEMENT-LEARNING-TACTICIAN-QUERY-PROPERTIES*", $list_alt5);
	deflexical("*REINFORCEMENT-LEARNING-TACTICIAN-DEFAULT-MAX-TIME*", $int$30);
	deflexical("*REINFORCEMENT-LEARNING-TACTICIAN-OUTERMOST-LOOP-TIME-CUTOFF*", NIL);
	deflexical("*BT-ANSWERABLE-QUERY-COUNT*", NIL);
	deflexical("*BT-SUM-LN-ANSWER-COUNT*", NIL);
	deflexical("*BT-SUM-LN-TOTAL-STEPS*", NIL);
	deflexical("*BT-SUM-LN-STEPS-TO-FIRST-ANSWER*", NIL);
	deflexical("*RL-ALPHA*", $int$_4);
	deflexical("*RL-BETA*", MINUS_ONE_INTEGER);
	deflexical("*RL-GAMMA*", $int$32);
	deflexical("*RL-DELTA*", EIGHT_INTEGER);
	defparameter("*RL-TACTICIAN-TIME*", NIL);
	deflexical("*REINFORCEMENT-LEARNING-TACTICIAN-ABORT-STRING*", $$$ABORT);
	deflexical("*REINFORCEMENT-LEARNING-TACTICIAN-ACK-STRING*", $$$ACK);
	deflexical("*ALL-SIMPLE-QUERIES-FILENAME*", $str_alt64$_cyc_projects_transfer_learning_R);
	deflexical("*DISALLOWED-QUERIES-FILENAME*", $str_alt65$_cyc_projects_transfer_learning_R);
	deflexical("*ALL-SIMPLE-QUERIES*", NIL != boundp($all_simple_queries$) ? ((SubLObject) ($all_simple_queries$.getGlobalValue())) : NIL);
	return NIL;
    }

    public static final SubLObject setup_reinforcement_learning_tactician_file() {
	subl_macro_promotions.declare_defglobal($reinforcement_learning_tactician_os_process$);
	subl_macro_promotions.declare_defglobal($reinforcement_learning_tactician_input_stream$);
	subl_macro_promotions.declare_defglobal($reinforcement_learning_tactician_output_stream$);
	subl_macro_promotions.declare_defglobal($all_simple_queries$);
	return NIL;
    }

    // // Internal Constants
    public static final SubLSymbol $reinforcement_learning_tactician_os_process$ = makeSymbol("*REINFORCEMENT-LEARNING-TACTICIAN-OS-PROCESS*");

    public static final SubLSymbol $reinforcement_learning_tactician_input_stream$ = makeSymbol("*REINFORCEMENT-LEARNING-TACTICIAN-INPUT-STREAM*");

    public static final SubLSymbol $reinforcement_learning_tactician_output_stream$ = makeSymbol("*REINFORCEMENT-LEARNING-TACTICIAN-OUTPUT-STREAM*");

    static private final SubLString $str_alt3$_cyc_projects_transfer_learning_R = makeString("/cyc/projects/transfer-learning/ReinforcementLearning/CCode/client");

    static private final SubLList $list_alt4 = list(makeKeyword("ANSWER-COUNT"), makeKeyword("TIME-TO-FIRST-ANSWER"), makeKeyword("TOTAL-TIME"), makeKeyword("COMPLETE-USER-TIME"), makeKeyword("COMPLETE-SYSTEM-TIME"), makeKeyword("COMPLETE-TOTAL-TIME"), makeKeyword("TOTAL-STEPS"),
	    makeKeyword("STEPS-TO-FIRST-ANSWER"));

    static private final SubLList $list_alt5 = list(new SubLObject[] { makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), makeKeyword("REQUIRE-EQUAL"), makeKeyword("RESULT-UNIQUENESS"), makeKeyword("BINDINGS"), makeKeyword("PROBLEM-STORE"), NIL, makeKeyword("CONDITIONAL-SENTENCE?"), NIL,
	    makeKeyword("NON-EXPLANATORY-SENTENCE"), NIL, makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL,
	    makeKeyword("ALLOWED-RULES"), makeKeyword("ALL"), makeKeyword("FORBIDDEN-RULES"), NIL, makeKeyword("ALLOWED-MODULES"), makeKeyword("ALL"), makeKeyword("ALLOW-ABNORMALITY-CHECKING?"), T, makeKeyword("TRANSITIVE-CLOSURE-MODE"), $NONE,
	    makeKeyword("MAINTAIN-TERM-WORKING-SET?"), NIL, makeKeyword("EVENTS"), NIL, makeKeyword("PROBLEM-STORE-NAME"), NIL, makeKeyword("EQUALITY-REASONING-METHOD"), makeKeyword("CZER-EQUAL"), makeKeyword("EQUALITY-REASONING-DOMAIN"), makeKeyword("ALL"),
	    makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), $NONE, makeKeyword("MAX-PROBLEM-COUNT"), makeInteger(100000), makeKeyword("REMOVAL-ALLOWED?"), T, makeKeyword("TRANSFORMATION-ALLOWED?"), NIL, makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T,
	    makeKeyword("NEGATION-BY-FAILURE?"), NIL, makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?"), T, makeKeyword("DIRECTION"), makeKeyword("BACKWARD"), makeKeyword("EVALUATE-SUBL-ALLOWED?"), T, makeKeyword("REWRITE-ALLOWED?"), NIL, makeKeyword("ABDUCTION-ALLOWED?"), NIL,
	    makeKeyword("NEW-TERMS-ALLOWED?"), T, makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), ZERO_INTEGER, makeKeyword("FORWARD-MAX-TIME"), ZERO_INTEGER, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER,
	    makeKeyword("PROBABLY-APPROXIMATELY-DONE"), ONE_INTEGER, makeKeyword("RETURN"), makeKeyword("BINDINGS"), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("CACHE-INFERENCE-RESULTS?"), NIL, makeKeyword("FORGET-EXTRA-RESULTS?"), T, makeKeyword("BROWSABLE?"), NIL,
	    makeKeyword("CONTINUABLE?"), NIL, makeKeyword("BLOCK?"), NIL, makeKeyword("METRICS"), NIL, makeKeyword("MAX-STEP"), makeInteger(6034), makeKeyword("INFERENCE-MODE"), makeKeyword("CUSTOM"), makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(100000000) });

    public static final SubLInteger $int$30 = makeInteger(30);

    public static final SubLInteger $int$_4 = makeInteger(-4);

    static private final SubLString $str_alt9$Reinforcement_Learning_tactician_ = makeString("Reinforcement Learning tactician enabled in NEURAL-NET mode.");

    static private final SubLString $str_alt10$Reinforcement_Learning_tactician_ = makeString("Reinforcement Learning tactician enabled in DEBUG mode.");

    static private final SubLString $str_alt11$Reinforcement_Learning_tactician_ = makeString("Reinforcement Learning tactician enabled.");

    static private final SubLString $str_alt12$Error__Reinforcement_Learning_tac = makeString("Error: Reinforcement Learning tactician not enabled");

    static private final SubLString $str_alt13$Reinforcement_Learning_tactician_ = makeString("Reinforcement Learning tactician disabled.");

    private static final SubLSymbol $ILL_FORMED_INPUT = makeKeyword("ILL-FORMED-INPUT");

    static private final SubLSymbol $sym15$_EXIT = makeSymbol("%EXIT");

    static private final SubLString $str_alt16$__Query___a___s__ = makeString("~&Query #~a: ~s~%");

    private static final SubLSymbol $COMPLETE_USER_TIME = makeKeyword("COMPLETE-USER-TIME");

    private static final SubLSymbol $RL_TACTICIAN_TIME = makeKeyword("RL-TACTICIAN-TIME");

    static private final SubLString $str_alt20$Complete_user_time___a__RL_tactic = makeString("Complete user time: ~a  RL tactician time: ~a  Adjusted user time: ~a");

    static private final SubLString $str_alt21$Total_steps___a__ln____a___Steps_ = makeString("Total steps: ~a (ln = ~a)  Steps to first answer: ~a (ln = ~a) Answer count: ~a (ln = ~a)");

    static private final SubLString $$$Forked_RLTactician = makeString("Forked RLTactician");

    public static final SubLFloat $float$0_5 = makeDouble(0.5);

    static private final SubLSymbol $sym29$OS_PROCESS_RUNNING_ = makeSymbol("OS-PROCESS-RUNNING?");

    private static final SubLSymbol CONNECTED_CONJUNCTION_TACTIC_P = makeSymbol("CONNECTED-CONJUNCTION-TACTIC-P");

    static private final SubLString $str_alt34$_a__ = makeString("~a~%");

    static private final SubLString $str_alt35$tc__a__ = makeString("tc ~a~%");

    static private final SubLString $str_alt36$_a__a__a__a__a__a__a__ = makeString("~a ~a ~a ~a ~a ~a ~a~%");

    static private final SubLString $str_alt37$t__a__a__a__a__a__a__a__ = makeString("t ~a ~a ~a ~a ~a ~a ~a~%");

    static private final SubLString $str_alt39$reinforcement_learning_tactician_ = makeString("reinforcement learning tactician cannot handle tactics of type ~s");

    static private final SubLString $str_alt43$unexpected_completeness__s = makeString("unexpected completeness ~s");

    static private final SubLString $str_alt47$unexpected_preference_level__s = makeString("unexpected preference level ~s");

    static private final SubLString $str_alt48$_1__a__ = makeString("-1 ~a~%");

    static private final SubLString $str_alt49$readTC__a__ = makeString("readTC ~a~%");

    static private final SubLString $str_alt50$_s_did_not_parse_to_a_non_negativ = makeString("~s did not parse to a non-negative integer");

    static private final SubLString $str_alt51$_s_did_not_parse_to_a_list_of_len = makeString("~s did not parse to a list of length 3");

    static private final SubLList $list_alt52 = list(makeSymbol("STORE-ID-STRING"), makeSymbol("PROBLEM-ID-STRING"), makeSymbol("TACTIC-ID-STRING"));

    static private final SubLString $str_alt53$_s__parsed_from__s__was_not_a_non = makeString("~s (parsed from ~s) was not a non-negative integer");

    static private final SubLString $str_alt54$Could_not_find_a_tactic_correspon = makeString("Could not find a tactic corresponding to ~s (~s ~s ~s)");

    static private final SubLString $str_alt55$readT__a__a__a__ = makeString("readT ~a ~a ~a~%");

    static private final SubLString $$$ABORT = makeString("ABORT");

    static private final SubLString $$$ACK = makeString("ACK");

    static private final SubLString $str_alt58$Got_ill_formed_input_string__s__s = makeString("Got ill-formed input string ~s, sending abort request");

    static private final SubLString $str_alt59$Hoping_for_ack__got__s_instead = makeString("Hoping for ack, got ~s instead");

    static private final SubLString $str_alt60$Got_ack__exiting_rl_kbq_run_train = makeString("Got ack, exiting rl-kbq-run-training-queries");

    static private final SubLString $str_alt61$Got_abort_request__sending_ack = makeString("Got abort request, sending ack");

    static private final SubLString $str_alt62$Sent_ack__exiting_rl_kbq_run_trai = makeString("Sent ack, exiting rl-kbq-run-training-queries");

    static private final SubLSymbol $sym63$_ = makeSymbol(">");

    static private final SubLString $str_alt64$_cyc_projects_transfer_learning_R = makeString("/cyc/projects/transfer-learning/ReinforcementLearning/all-simple-queries.cfasl");

    static private final SubLString $str_alt65$_cyc_projects_transfer_learning_R = makeString("/cyc/projects/transfer-learning/ReinforcementLearning/disallowed-queries.cfasl");

    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    public static final SubLObject $$CycLQuerySpecification = constant_handles.reader_make_constant_shell(makeString("CycLQuerySpecification"));

    static private final SubLString $$$cdolist = makeString("cdolist");

    static private final SubLList $list_alt70 = list(constant_handles.reader_make_constant_shell(makeString("NLQuery")), constant_handles.reader_make_constant_shell(makeString("SKSIQuery")));

    static private final SubLString $str_alt71$Initial_query_count___a__ = makeString("Initial query count: ~a~%");

    static private final SubLString $str_alt72$Filtering_out_up_to__a_disallowed = makeString("Filtering out up to ~a disallowed queries...~%");

    static private final SubLString $str_alt73$Final_query_count___a__ = makeString("Final query count: ~a~%");

    public static final SubLSymbol $all_simple_queries$ = makeSymbol("*ALL-SIMPLE-QUERIES*");

    static private final SubLString $str_alt75$Query___a__UNRUNNABLE__ = makeString("Query #~a: UNRUNNABLE~%");

    private static final SubLSymbol $TACTIC_EXECUTION_COUNT = makeKeyword("TACTIC-EXECUTION-COUNT");

    static private final SubLString $str_alt77$Query___a___a__a__a__a__a__a__a__ = makeString("Query #~a: ~a ~a ~a ~a ~a ~a ~a~%");

    // // Initializers
    public void declareFunctions() {
	declare_reinforcement_learning_tactician_file();
    }

    public void initializeVariables() {
	init_reinforcement_learning_tactician_file();
    }

    public void runTopLevelForms() {
	setup_reinforcement_learning_tactician_file();
    }
}
