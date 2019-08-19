/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.el_utilities.groundP;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg1;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg2;
import static com.cyc.cycjava.cycl.el_utilities.make_ternary_formula;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.cycjava.cycl.utilities_macros.note_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.arg_type;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.at_defns;
import com.cyc.cycjava.cycl.at_vars;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.disjoint_with;
import com.cyc.cycjava.cycl.equals;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.sg_term_rank;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.cycjava.cycl.wff_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      INFERENCE-ABDUCTION-UTILITIES
 * source file: /cyc/top/cycl/inference/harness/inference-abduction-utilities.lisp
 * created:     2019/07/03 17:37:48
 */
public final class inference_abduction_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLObject transformation_problem_rule_abductive_utility(SubLObject problem, SubLObject rule_assertion) {
        {
            SubLObject query = inference_datastructures_problem.problem_query(problem);
            SubLObject term_set = set.new_set(UNPROVIDED, UNPROVIDED);
            SubLObject utility = NIL;
            SubLObject cdolist_list_var = assertions_high.assertion_forts(rule_assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                set.set_add(v_term, term_set);
            }
            utility = sg_term_rank.sg_tr_term_set_utility(term_set);
            return utility;
        }
    }

    /**
     *
     *
     * @return happiness-p; negative or 0.
    Returns -1 * the productivity of the removal or rewrite tactic
     */
    @LispMethod(comment = "@return happiness-p; negative or 0.\r\nReturns -1 * the productivity of the removal or rewrite tactic")
    public static final SubLObject strategic_heuristic_strategic_productivity(SubLObject strategy, SubLObject generalized_removal_tactic) {
        {
            SubLObject productivity = inference_datastructures_strategy.tactic_strategic_productivity(generalized_removal_tactic, strategy);
            return inference_datastructures_enumerated_types.productivity_times_number(productivity, MINUS_ONE_INTEGER);
        }
    }

    /**
     *
     *
     * @return happiness-p; between -100 and 100.
    positive if CONTENT-TACTIC's problem has any supported* problem with a dependent transformation link
    which uses a historically useful rule.
    negative if CONTENT-TACTIC's problem has any supported* problem with a dependent transformation link
    which uses a historically useless rule.
    If there is a mix, it will take a percentage, with -100/+100 being 100% irrelevant/relevant.
    0 indicates agnostic.
    A special case is that zero dependent* transformation links yield a value of 100 instead
    of 0, otherwise the Tactician will prefer relevant transformations over removals.
     */
    @LispMethod(comment = "@return happiness-p; between -100 and 100.\r\npositive if CONTENT-TACTIC\'s problem has any supported* problem with a dependent transformation link\r\nwhich uses a historically useful rule.\r\nnegative if CONTENT-TACTIC\'s problem has any supported* problem with a dependent transformation link\r\nwhich uses a historically useless rule.\r\nIf there is a mix, it will take a percentage, with -100/+100 being 100% irrelevant/relevant.\r\n0 indicates agnostic.\r\nA special case is that zero dependent* transformation links yield a value of 100 instead\r\nof 0, otherwise the Tactician will prefer relevant transformations over removals.")
    public static final SubLObject strategic_heuristic_rule_abductive_utility(SubLObject strategy, SubLObject content_tactic) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject happiness = $int$100;
                SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
                if (NIL != inference_strategist.inference_permits_transformationP(inference)) {
                    {
                        SubLObject problem = inference_datastructures_tactic.tactic_problem(content_tactic);
                        if ((!ZERO_INTEGER.eql(inference_datastructures_problem.problem_min_transformation_depth(problem, inference))) || (NIL != inference_worker_transformation.transformation_tactic_p(content_tactic))) {
                            {
                                SubLObject _prev_bind_0 = $heuristic_rule_abductive_utility_problem_recursion_stack$.currentBinding(thread);
                                try {
                                    $heuristic_rule_abductive_utility_problem_recursion_stack$.bind(set.new_set(symbol_function(EQ), UNPROVIDED), thread);
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject total_utility = com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities.compute_problem_rule_abductive_utility(problem, inference);
                                        SubLObject total_count = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if ($LOOP != total_count) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject delta_utility = com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities.compute_tactic_rule_abductive_utility(content_tactic);
                                                SubLObject delta_count = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                total_utility = add(total_utility, delta_utility);
                                                total_count = add(total_count, delta_count);
                                            }
                                            if (!total_count.isZero()) {
                                                happiness = integerDivide(total_utility, total_count);
                                            }
                                        }
                                    }
                                } finally {
                                    $heuristic_rule_abductive_utility_problem_recursion_stack$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
                return happiness;
            }
        }
    }

    /**
     *
     *
     * @return happiness-p;
    -100 if CONTENT-TACTIC is an abductive removal tactic.
    0 otherwise.
     */
    @LispMethod(comment = "@return happiness-p;\r\n-100 if CONTENT-TACTIC is an abductive removal tactic.\r\n0 otherwise.")
    public static final SubLObject strategic_heuristic_delay_abduction(SubLObject strategy, SubLObject generalized_removal_tactic) {
        if (NIL != inference_datastructures_tactic.abductive_tacticP(generalized_removal_tactic)) {
            return $int$_100;
        } else {
            return ZERO_INTEGER;
        }
    }

    public static final SubLObject push_problem_onto_rule_abductive_utility_stack(SubLObject problem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return set.set_add(problem, $heuristic_rule_abductive_utility_problem_recursion_stack$.getDynamicValue(thread));
        }
    }

    public static final SubLObject problem_on_rule_abductive_utility_stackP(SubLObject problem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return set.set_memberP(problem, $heuristic_rule_abductive_utility_problem_recursion_stack$.getDynamicValue(thread));
        }
    }

    public static final SubLObject do_abductive_tactician_strategic_heuristics(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt41);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject heuristic = NIL;
                    SubLObject function = NIL;
                    SubLObject scaling_factor = NIL;
                    SubLObject motivation = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt41);
                    heuristic = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt41);
                    function = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt41);
                    scaling_factor = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt41);
                    motivation = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_30 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt41);
                            current_30 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt41);
                            if (NIL == member(current_30, $list_alt42, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_30 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt41);
                        }
                        {
                            SubLObject tactic_tail = property_list_member($TACTIC, current);
                            SubLObject tactic = (NIL != tactic_tail) ? ((SubLObject) (cadr(tactic_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(DO_STRATEGIC_HEURISTICS, list(heuristic, function, scaling_factor, $TACTIC, tactic, $DONE, done), listS(PWHEN, list($sym48$ABDUCTIVE_TACTICIAN_STRATEGIC_HEURISTIC_, heuristic, motivation), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    public static final SubLObject compute_tactic_rule_abductive_utility(SubLObject tactic) {
        {
            SubLObject delta_utility = ZERO_INTEGER;
            SubLObject delta_count = ZERO_INTEGER;
            if (NIL != inference_worker_transformation.transformation_tactic_p(tactic)) {
                {
                    SubLObject rule = inference_worker_transformation.transformation_tactic_rule(tactic);
                    SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
                    if (NIL != rule) {
                        delta_utility = add(delta_utility, com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities.transformation_problem_rule_abductive_utility(problem, rule));
                        delta_count = add(delta_count, ONE_INTEGER);
                    }
                }
            }
            return values(delta_utility, delta_count);
        }
    }

    public static final SubLObject compute_problem_rule_abductive_utility(SubLObject problem, SubLObject inference) {
        {
            SubLObject query = inference_datastructures_problem.problem_query(problem);
            SubLObject value = ZERO_INTEGER;
            SubLObject term_set = set.new_set(UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = query;
            SubLObject contextualized_clause = NIL;
            for (contextualized_clause = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contextualized_clause = cdolist_list_var.first()) {
                {
                    SubLObject sense = $NEG;
                    SubLObject index_var = ZERO_INTEGER;
                    SubLObject cdolist_list_var_31 = clauses.neg_lits(contextualized_clause);
                    SubLObject contextualized_asent = NIL;
                    for (contextualized_asent = cdolist_list_var_31.first(); NIL != cdolist_list_var_31; cdolist_list_var_31 = cdolist_list_var_31.rest() , contextualized_asent = cdolist_list_var_31.first()) {
                        {
                            SubLObject datum = contextualized_asent;
                            SubLObject current = datum;
                            SubLObject mt = NIL;
                            SubLObject asent = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt27);
                            mt = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt27);
                            asent = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject terms = cycl_utilities.formula_terms(asent, $IGNORE);
                                    SubLObject cdolist_list_var_32 = terms;
                                    SubLObject v_term = NIL;
                                    for (v_term = cdolist_list_var_32.first(); NIL != cdolist_list_var_32; cdolist_list_var_32 = cdolist_list_var_32.rest() , v_term = cdolist_list_var_32.first()) {
                                        set.set_add(v_term, term_set);
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt27);
                            }
                        }
                        index_var = add(index_var, ONE_INTEGER);
                    }
                }
                {
                    SubLObject sense = $POS;
                    SubLObject index_var = ZERO_INTEGER;
                    SubLObject cdolist_list_var_33 = clauses.pos_lits(contextualized_clause);
                    SubLObject contextualized_asent = NIL;
                    for (contextualized_asent = cdolist_list_var_33.first(); NIL != cdolist_list_var_33; cdolist_list_var_33 = cdolist_list_var_33.rest() , contextualized_asent = cdolist_list_var_33.first()) {
                        {
                            SubLObject datum = contextualized_asent;
                            SubLObject current = datum;
                            SubLObject mt = NIL;
                            SubLObject asent = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt27);
                            mt = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt27);
                            asent = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject terms = cycl_utilities.formula_terms(asent, $IGNORE);
                                    SubLObject cdolist_list_var_34 = terms;
                                    SubLObject v_term = NIL;
                                    for (v_term = cdolist_list_var_34.first(); NIL != cdolist_list_var_34; cdolist_list_var_34 = cdolist_list_var_34.rest() , v_term = cdolist_list_var_34.first()) {
                                        set.set_add(v_term, term_set);
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt27);
                            }
                        }
                        index_var = add(index_var, ONE_INTEGER);
                    }
                }
            }
	    value = com.cyc.cycjava.cycl.sg_term_rank.sg_tr_term_set_utility(term_set);
            return values(value, ONE_INTEGER);
        }
    }

    public static final SubLObject abductive_tactician_strategic_heuristicP(SubLObject heuristic, SubLObject motivation) {
        return set.set_memberP(heuristic, com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities.abductive_tactician_heuristics(motivation));
    }

    public static final SubLObject abductive_tactician_heuristics(SubLObject motivation) {
        {
            SubLObject pcase_var = motivation;
            if (pcase_var.eql($REMOVAL)) {
                return $abductive_tactician_removal_heuristics$.getGlobalValue();
            } else {
                if (pcase_var.eql($TRANSFORMATION)) {
                    return $abductive_tactician_transformation_heuristics$.getGlobalValue();
                }
            }
        }
        return NIL;
    }

    /**
     * The happiness of doing one specific transformation.
     */
    @LispMethod(comment = "The happiness of doing one specific transformation.")
    public static final SubLObject abductive_strategy_transformation_tactic_happiness(SubLObject transformation_tactic, SubLObject strategy) {
        SubLTrampolineFile.checkType(transformation_tactic, TRANSFORMATION_TACTIC_P);
        SubLTrampolineFile.checkType(strategy, ABDUCTIVE_STRATEGY_P);
        return com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities.abductive_strategy_generic_tactic_happiness(transformation_tactic, strategy, $TRANSFORMATION);
    }

    public static final SubLObject abductive_strategy_transformation_strategem_happiness(SubLObject strategy, SubLObject strategem) {
        SubLTrampolineFile.checkType(strategy, ABDUCTIVE_STRATEGY_P);
        SubLTrampolineFile.checkType(strategem, STRATEGEM_P);
        if (NIL != inference_worker_transformation.transformation_tactic_p(strategem)) {
            {
                SubLObject transformation_tactic = strategem;
                return com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities.abductive_strategy_transformation_tactic_happiness(transformation_tactic, strategy);
            }
        } else {
            if (NIL != inference_worker.logical_tactic_p(strategem)) {
                {
                    SubLObject logical_tactic = strategem;
                    return com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities.abductive_strategy_logical_tactic_transformation_happiness(logical_tactic, strategy);
                }
            } else {
                if (NIL != inference_worker_transformation.transformation_link_p(strategem)) {
                    {
                        SubLObject transformation_link = strategem;
                        return com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities.abductive_strategy_transformation_link_happiness(transformation_link, strategy);
                    }
                } else {
                    return Errors.error($str_alt56$_S_is_not_a_transformation_strate, strategem);
                }
            }
        }
    }

    /**
     * The happiness of introducing a new root problem.
     */
    @LispMethod(comment = "The happiness of introducing a new root problem.")
    public static final SubLObject abductive_strategy_transformation_link_happiness(SubLObject transformation_link, SubLObject strategy) {
        SubLTrampolineFile.checkType(transformation_link, TRANSFORMATION_LINK_P);
        SubLTrampolineFile.checkType(strategy, ABDUCTIVE_STRATEGY_P);
        {
            SubLObject transformation_tactic = inference_worker_transformation.transformation_link_tactic(transformation_link);
            return com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities.abductive_strategy_transformation_tactic_happiness(transformation_tactic, strategy);
        }
    }

    /**
     * The happiness of doing one specific strategem for removal
     */
    @LispMethod(comment = "The happiness of doing one specific strategem for removal")
    public static final SubLObject abductive_strategy_removal_strategem_happiness(SubLObject strategy, SubLObject removal_strategem) {
        SubLTrampolineFile.checkType(strategy, ABDUCTIVE_STRATEGY_P);
        SubLTrampolineFile.checkType(removal_strategem, REMOVAL_STRATEGEM_P);
        if (NIL != inference_worker_answer.answer_link_p(removal_strategem)) {
            return ONE_INTEGER;
        } else {
            return com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities.abductive_strategy_generic_tactic_happiness(removal_strategem, strategy, $REMOVAL);
        }
    }

    /**
     *
     *
     * @return nil or transformation-strategem-p
     */
    @LispMethod(comment = "@return nil or transformation-strategem-p")
    public static final SubLObject abductive_strategy_pop_strategem_wrt_transformation(SubLObject strategy) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject transformation_index = inference_balanced_tactician_datastructures.balanced_strategy_transformation_strategem_index(strategy);
                thread.resetMultipleValues();
                {
                    SubLObject best_strategem = inference_tactician.problem_happiness_index_next(transformation_index);
                    SubLObject expected_happiness = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return best_strategem;
                }
            }
        }
    }

    public static final SubLObject abductive_strategy_pop_strategem_wrt_removal(SubLObject strategy) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject removal_index = inference_balanced_tactician_datastructures.balanced_strategy_removal_strategem_index(strategy);
                thread.resetMultipleValues();
                {
                    SubLObject best_strategem = inference_tactician.problem_happiness_index_next(removal_index);
                    SubLObject expected_happiness = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return best_strategem;
                }
            }
        }
    }

    public static final SubLObject abductive_strategy_pop_new_root(SubLObject strategy) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_root_index = inference_balanced_tactician_datastructures.balanced_strategy_new_root_index(strategy);
                thread.resetMultipleValues();
                {
                    SubLObject best_problem = inference_tactician.problem_happiness_index_next(new_root_index);
                    SubLObject expected_happiness = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return best_problem;
                }
            }
        }
    }

    /**
     *
     *
     * @return nil or transformation-strategem-p
     */
    @LispMethod(comment = "@return nil or transformation-strategem-p")
    public static final SubLObject abductive_strategy_peek_strategem_wrt_transformation(SubLObject strategy) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject transformation_index = inference_balanced_tactician_datastructures.balanced_strategy_transformation_strategem_index(strategy);
                if (NIL == inference_tactician.problem_happiness_index_empty_p(transformation_index)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject best_strategem = inference_tactician.problem_happiness_index_peek(transformation_index);
                        SubLObject expected_happiness = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        return best_strategem;
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return nil or removal-strategem-p
     */
    @LispMethod(comment = "@return nil or removal-strategem-p")
    public static final SubLObject abductive_strategy_peek_strategem_wrt_removal(SubLObject strategy) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject removal_index = inference_balanced_tactician_datastructures.balanced_strategy_removal_strategem_index(strategy);
                if (NIL == inference_tactician.problem_happiness_index_empty_p(removal_index)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject best_strategem = inference_tactician.problem_happiness_index_peek(removal_index);
                        SubLObject expected_happiness = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        return best_strategem;
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return nil or problem-p
     */
    @LispMethod(comment = "@return nil or problem-p")
    public static final SubLObject abductive_strategy_peek_new_root(SubLObject strategy) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_root_index = inference_balanced_tactician_datastructures.balanced_strategy_new_root_index(strategy);
                if (NIL == inference_tactician.problem_happiness_index_empty_p(new_root_index)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject best_problem = inference_tactician.problem_happiness_index_peek(new_root_index);
                        SubLObject expected_happiness = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        return best_problem;
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject abductive_strategy_p(SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_strategy.strategy_p(v_object)) && ($ABDUCTIVE == inference_datastructures_strategy.strategy_type(v_object)));
    }

    public static final SubLObject abductive_strategy_no_strategems_active_wrt_transformationP(SubLObject strategy) {
        {
            SubLObject transformation_index = inference_balanced_tactician_datastructures.balanced_strategy_transformation_strategem_index(strategy);
            return inference_tactician.problem_happiness_index_empty_p(transformation_index);
        }
    }

    public static final SubLObject abductive_strategy_no_strategems_active_wrt_removalP(SubLObject strategy) {
        {
            SubLObject removal_index = inference_balanced_tactician_datastructures.balanced_strategy_removal_strategem_index(strategy);
            return inference_tactician.problem_happiness_index_empty_p(removal_index);
        }
    }

    public static final SubLObject abductive_strategy_no_new_rootsP(SubLObject strategy) {
        {
            SubLObject new_root_index = inference_balanced_tactician_datastructures.balanced_strategy_new_root_index(strategy);
            return inference_tactician.problem_happiness_index_empty_p(new_root_index);
        }
    }

    public static final SubLObject abductive_strategy_new_root_provably_falseP(SubLObject problem) {
        {
            SubLObject query = inference_datastructures_problem.problem_query(problem);
            SubLObject cdolist_list_var = query;
            SubLObject contextualized_clause = NIL;
            for (contextualized_clause = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contextualized_clause = cdolist_list_var.first()) {
                {
                    SubLObject sense = $NEG;
                    SubLObject index_var = ZERO_INTEGER;
                    SubLObject cdolist_list_var_28 = clauses.neg_lits(contextualized_clause);
                    SubLObject contextualized_asent = NIL;
                    for (contextualized_asent = cdolist_list_var_28.first(); NIL != cdolist_list_var_28; cdolist_list_var_28 = cdolist_list_var_28.rest() , contextualized_asent = cdolist_list_var_28.first()) {
                        {
                            SubLObject datum = contextualized_asent;
                            SubLObject current = datum;
                            SubLObject mt = NIL;
                            SubLObject asent = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt27);
                            mt = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt27);
                            asent = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, $$isa)) {
                                    if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities.provably_false_contextualized_isa_asentP(asent, mt, sense)) {
                                        return T;
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt27);
                            }
                        }
                        index_var = add(index_var, ONE_INTEGER);
                    }
                }
                {
                    SubLObject sense = $POS;
                    SubLObject index_var = ZERO_INTEGER;
                    SubLObject cdolist_list_var_29 = clauses.pos_lits(contextualized_clause);
                    SubLObject contextualized_asent = NIL;
                    for (contextualized_asent = cdolist_list_var_29.first(); NIL != cdolist_list_var_29; cdolist_list_var_29 = cdolist_list_var_29.rest() , contextualized_asent = cdolist_list_var_29.first()) {
                        {
                            SubLObject datum = contextualized_asent;
                            SubLObject current = datum;
                            SubLObject mt = NIL;
                            SubLObject asent = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt27);
                            mt = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt27);
                            asent = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, $$isa)) {
                                    if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities.provably_false_contextualized_isa_asentP(asent, mt, sense)) {
                                        return T;
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt27);
                            }
                        }
                        index_var = add(index_var, ONE_INTEGER);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * The happiness of selecting the new root PROBLEM to work on.
     */
    @LispMethod(comment = "The happiness of selecting the new root PROBLEM to work on.")
    public static final SubLObject abductive_strategy_new_root_happiness(SubLObject strategy, SubLObject problem) {
        return inference_datastructures_problem.problem_suid(problem);
    }

    /**
     * The happiness of focusing transformation on a new problem.
     */
    @LispMethod(comment = "The happiness of focusing transformation on a new problem.")
    public static final SubLObject abductive_strategy_logical_tactic_transformation_happiness(SubLObject logical_tactic, SubLObject strategy) {
        SubLTrampolineFile.checkType(logical_tactic, LOGICAL_TACTIC_P);
        SubLTrampolineFile.checkType(strategy, ABDUCTIVE_STRATEGY_P);
        return com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities.abductive_strategy_generic_tactic_happiness(logical_tactic, strategy, $TRANSFORMATION);
    }

    public static final SubLObject abductive_strategy_initialize(SubLObject strategy) {
        {
            SubLObject removal_index = inference_tactician.new_problem_happiness_index();
            SubLObject new_root_index = inference_tactician.new_problem_happiness_index();
            SubLObject transformation_index = inference_tactician.new_problem_happiness_index();
            SubLObject data = inference_balanced_tactician_datastructures.new_balanced_strategy_data(removal_index, new_root_index, transformation_index);
            inference_datastructures_strategy.set_strategy_data(strategy, data);
        }
        return strategy;
    }

    /**
     * Return a heuristic breakdown of the strategic happiness for TACTIC wrt STRATEGY.
     * Return a list of tuples of the form (heuristic scaling-factor raw-happiness scaled-happiness).
     */
    @LispMethod(comment = "Return a heuristic breakdown of the strategic happiness for TACTIC wrt STRATEGY.\r\nReturn a list of tuples of the form (heuristic scaling-factor raw-happiness scaled-happiness).\nReturn a heuristic breakdown of the strategic happiness for TACTIC wrt STRATEGY.\nReturn a list of tuples of the form (heuristic scaling-factor raw-happiness scaled-happiness).")
    public static final SubLObject abductive_strategy_happiness_table(SubLObject strategy, SubLObject tactic, SubLObject motivation) {
        return inference_strategic_heuristics.strategic_heuristic_happiness_table(strategy, tactic, com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities.abductive_tactician_heuristics(motivation));
    }

    public static final SubLObject abductive_strategy_generic_tactic_happiness(SubLObject tactic, SubLObject strategy, SubLObject motivation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(tactic, TACTIC_P);
            SubLTrampolineFile.checkType(strategy, ABDUCTIVE_STRATEGY_P);
            {
                SubLObject aggregate_happiness = ZERO_INTEGER;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(inference_strategic_heuristics.strategic_heuristic_index()));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject heuristic = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject value = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject function = inference_strategic_heuristics.strategic_heuristic_function(heuristic);
                            SubLObject scaling_factor = inference_strategic_heuristics.strategic_heuristic_scaling_factor(heuristic);
                            SubLObject tactic_type = inference_strategic_heuristics.strategic_heuristic_tactic_type(heuristic);
                            if (NIL != inference_strategic_heuristics.do_strategic_heuristics_tactic_match_p(tactic, tactic_type)) {
                                if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities.abductive_tactician_strategic_heuristicP(heuristic, motivation)) {
                                    {
                                        SubLObject raw_happiness = funcall(function, strategy, tactic);
                                        SubLObject scaled_happiness = number_utilities.potentially_infinite_integer_times(raw_happiness, scaling_factor);
                                        aggregate_happiness = number_utilities.potentially_infinite_integer_plus(aggregate_happiness, scaled_happiness);
                                    }
                                }
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return aggregate_happiness;
            }
        }
    }

    public static final SubLObject abductive_strategy_current_contents(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, ABDUCTIVE_STRATEGY_P);
        {
            SubLObject removal_contents = inference_tactician.problem_happiness_index_contents(inference_balanced_tactician_datastructures.balanced_strategy_removal_strategem_index(strategy));
            SubLObject new_root_contents = inference_tactician.problem_happiness_index_contents(inference_balanced_tactician_datastructures.balanced_strategy_new_root_index(strategy));
            SubLObject transformation_contents = inference_tactician.problem_happiness_index_contents(inference_balanced_tactician_datastructures.balanced_strategy_transformation_strategem_index(strategy));
            return values(removal_contents, new_root_contents, transformation_contents);
        }
    }

    /**
     * Throws out provably false new roots, since they always make bad abductions.
     */
    @LispMethod(comment = "Throws out provably false new roots, since they always make bad abductions.")
    public static final SubLObject abductive_strategy_chooses_to_throw_away_new_rootP(SubLObject strategy, SubLObject problem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_default_chooses_to_throw_away_new_rootP(strategy, problem)) {
                return T;
            }
            if (NIL != $prune_semantically_bad_new_rootsP$.getDynamicValue(thread)) {
                return com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities.abductive_strategy_new_root_provably_falseP(problem);
            } else {
                return NIL;
            }
        }
    }

    public static final SubLObject abductive_strategy_add_new_root(SubLObject strategy, SubLObject problem) {
        {
            SubLObject new_root_index = inference_balanced_tactician_datastructures.balanced_strategy_new_root_index(strategy);
            SubLObject happiness = com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities.abductive_strategy_new_root_happiness(strategy, problem);
            inference_tactician.problem_happiness_index_add(new_root_index, happiness, problem);
            return T;
        }
    }

    /**
     *
     *
     * @return booleanp; whether TRANSFORMATION-STRATEGEM was successfully added to STRATEGY's transformation index
     */
    @LispMethod(comment = "@return booleanp; whether TRANSFORMATION-STRATEGEM was successfully added to STRATEGY\'s transformation index")
    public static final SubLObject abductive_strategy_activate_strategem_wrt_transformation(SubLObject strategy, SubLObject transformation_strategem) {
        {
            SubLObject transformation_index = inference_balanced_tactician_datastructures.balanced_strategy_transformation_strategem_index(strategy);
            SubLObject happiness = com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities.abductive_strategy_transformation_strategem_happiness(strategy, transformation_strategem);
            inference_tactician.problem_happiness_index_add(transformation_index, happiness, transformation_strategem);
            return T;
        }
    }

    /**
     *
     *
     * @return booleanp; whether REMOVAL-STRATEGEM was successfully added to STRATEGY's removal index
     */
    @LispMethod(comment = "@return booleanp; whether REMOVAL-STRATEGEM was successfully added to STRATEGY\'s removal index")
    public static final SubLObject abductive_strategy_activate_strategem_wrt_removal(SubLObject strategy, SubLObject removal_strategem) {
        {
            SubLObject removal_index = inference_balanced_tactician_datastructures.balanced_strategy_removal_strategem_index(strategy);
            SubLObject happiness = com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities.abductive_strategy_removal_strategem_happiness(strategy, removal_strategem);
            inference_tactician.problem_happiness_index_add(removal_index, happiness, removal_strategem);
            return T;
        }
    }

    /**
     * A set of problems that are currently being evaluated for rule-abductive-utility,
     * to avoid infinite recursion.
     */
    // defparameter
    @LispMethod(comment = "A set of problems that are currently being evaluated for rule-abductive-utility,\r\nto avoid infinite recursion.\nA set of problems that are currently being evaluated for rule-abductive-utility,\nto avoid infinite recursion.\ndefparameter")
    private static final SubLSymbol $heuristic_rule_abductive_utility_problem_recursion_stack$ = makeSymbol("*HEURISTIC-RULE-ABDUCTIVE-UTILITY-PROBLEM-RECURSION-STACK*");

    /**
     * The set of heuristics used by the Abductive Balanced Tactician for transformation.
     */
    // deflexical
    @LispMethod(comment = "The set of heuristics used by the Abductive Balanced Tactician for transformation.\ndeflexical")
    private static final SubLSymbol $abductive_tactician_transformation_heuristics$ = makeSymbol("*ABDUCTIVE-TACTICIAN-TRANSFORMATION-HEURISTICS*");

    /**
     * The set of heuristics used by the Abductive Balanced Tactician for removal.
     */
    // deflexical
    @LispMethod(comment = "The set of heuristics used by the Abductive Balanced Tactician for removal.\ndeflexical")
    private static final SubLSymbol $abductive_tactician_removal_heuristics$ = makeSymbol("*ABDUCTIVE-TACTICIAN-REMOVAL-HEURISTICS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $prune_semantically_bad_new_rootsP$ = makeSymbol("*PRUNE-SEMANTICALLY-BAD-NEW-ROOTS?*");

    /**
     * The strategy type that is best suited for an abductive inference.
     */
    // defvar
    @LispMethod(comment = "The strategy type that is best suited for an abductive inference.\ndefvar")
    public static final SubLSymbol $abductive_strategy_type$ = makeSymbol("*ABDUCTIVE-STRATEGY-TYPE*");

    public static final SubLFile me = new inference_abduction_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities";


    static private final SubLList $list2 = list(makeSymbol("LIT-MT"), makeSymbol("LIT-FORMULA"));



















    static private final SubLList $list17 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("ALLOWED-MODULES"), list(makeKeyword("NOT"), list(makeKeyword("MODULE-SUBTYPE"), makeKeyword("ABDUCTION"))));

    // Definitions
    public static final SubLObject reject_proof_due_to_non_abducible_ruleP_alt(SubLObject link, SubLObject supported_problem, SubLObject subproofs) {
        return makeBoolean((((NIL != inference_datastructures_problem_store.problem_store_abduction_allowedP(inference_datastructures_problem.problem_store(supported_problem))) && (NIL != inference_worker_transformation.transformation_link_p(link))) && (NIL != kb_accessors.non_abducible_ruleP(inference_worker_transformation.transformation_link_rule_assertion(link)))) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities.some_abductive_subproofP(subproofs)));
    }

    // Definitions
    public static SubLObject reject_proof_due_to_non_abducible_ruleP(final SubLObject link, final SubLObject supported_problem, final SubLObject subproofs) {
        return makeBoolean((((NIL != inference_datastructures_problem_store.problem_store_abduction_allowedP(inference_datastructures_problem.problem_store(supported_problem))) && (NIL != inference_worker_transformation.transformation_link_p(link))) && (NIL != kb_accessors.non_abducible_ruleP(inference_worker_transformation.transformation_link_rule_assertion(link)))) && (NIL != some_abductive_subproofP(subproofs)));
    }

    public static final SubLObject some_abductive_subproofP_alt(SubLObject subproofs) {
        {
            SubLObject abductive_subproofP = NIL;
            if (NIL == abductive_subproofP) {
                {
                    SubLObject csome_list_var = subproofs;
                    SubLObject subproof = NIL;
                    for (subproof = csome_list_var.first(); !((NIL != abductive_subproofP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , subproof = csome_list_var.first()) {
                        if (((NIL != inference_worker.content_proof_p(subproof)) && (NIL != inference_modules.abductive_hl_moduleP(inference_worker.content_proof_hl_module(subproof)))) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities.some_abductive_subproofP(inference_datastructures_proof.proof_direct_subproofs(subproof)))) {
                            abductive_subproofP = T;
                        }
                    }
                }
            }
            return abductive_subproofP;
        }
    }

    public static SubLObject some_abductive_subproofP(final SubLObject subproofs) {
        SubLObject abductive_subproofP = NIL;
        if (NIL == abductive_subproofP) {
            SubLObject csome_list_var = subproofs;
            SubLObject subproof = NIL;
            subproof = csome_list_var.first();
            while ((NIL == abductive_subproofP) && (NIL != csome_list_var)) {
                if (((NIL != inference_worker.content_proof_p(subproof)) && (NIL != inference_modules.abductive_hl_moduleP(inference_worker.content_proof_hl_module(subproof)))) || (NIL != some_abductive_subproofP(inference_datastructures_proof.proof_direct_subproofs(subproof)))) {
                    abductive_subproofP = T;
                }
                csome_list_var = csome_list_var.rest();
                subproof = csome_list_var.first();
            } 
        }
        return abductive_subproofP;
    }

    /**
     *
     *
     * @return booleanp ;; Return T iff abduction is allowed
    on ASENT in MT, and NIL otherwise
     */
    @LispMethod(comment = "@return booleanp ;; Return T iff abduction is allowed\r\non ASENT in MT, and NIL otherwise")
    public static final SubLObject abduction_allowed_on_asentP_alt(SubLObject asent, SubLObject mt, SubLObject sense) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (sense == UNPROVIDED) {
            sense = $POS;
        }
        {
            SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            if (NIL == forts.fort_p(predicate)) {
                return NIL;
            }
            if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities.non_abducible_relationP(predicate, mt)) {
                return NIL;
            }
            if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities.non_abducible_predicateP(predicate, mt)) {
                return NIL;
            }
            {
                SubLObject argnum = ZERO_INTEGER;
                SubLObject args = cycl_utilities.formula_args(asent, $IGNORE);
                SubLObject cdolist_list_var = args;
                SubLObject arg = NIL;
                for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                    argnum = add(argnum, ONE_INTEGER);
                    if (!argnum.isZero()) {
                        if (NIL != variables.fully_bound_p(arg)) {
                            if (((NIL != com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities.non_abducible_wrt_value_in_argnumP(predicate, arg, argnum, mt)) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities.non_abducible_wrt_value_in_argnum_via_typeP(predicate, arg, argnum, mt))) || (NIL != kb_accessors.complete_extent_enumerable_for_argP(predicate, argnum, mt))) {
                                return NIL;
                            }
                        } else {
                            if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities.non_abducible_for_argnumP(predicate, argnum, mt)) {
                                return NIL;
                            }
                        }
                    }
                }
            }
            if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities.non_abducible_sentenceP(asent, mt)) {
                return NIL;
            }
            return T;
        }
    }

    /**
     *
     *
     * @return booleanp ;; Return T iff abduction is allowed
    on ASENT in MT, and NIL otherwise
     */
    @LispMethod(comment = "@return booleanp ;; Return T iff abduction is allowed\r\non ASENT in MT, and NIL otherwise")
    public static SubLObject abduction_allowed_on_asentP(final SubLObject asent, SubLObject mt, SubLObject sense) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (sense == UNPROVIDED) {
            sense = $POS;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (NIL == forts.fort_p(predicate)) {
            return NIL;
        }
        if (NIL != non_abducible_relationP(predicate, mt)) {
            return NIL;
        }
        if (NIL != non_abducible_predicateP(predicate, mt)) {
            return NIL;
        }
        SubLObject argnum = ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(asent, $IGNORE);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            argnum = add(argnum, ONE_INTEGER);
            if (!argnum.isZero()) {
                if (NIL != variables.fully_bound_p(arg)) {
                    if (((NIL != non_abducible_wrt_value_in_argnumP(predicate, arg, argnum, mt)) || (NIL != non_abducible_wrt_value_in_argnum_via_typeP(predicate, arg, argnum, mt))) || (NIL != kb_accessors.complete_extent_enumerable_for_argP(predicate, argnum, mt))) {
                        return NIL;
                    }
                } else
                    if (NIL != non_abducible_for_argnumP(predicate, argnum, mt)) {
                        return NIL;
                    }

            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        if (NIL != non_abducible_sentenceP(asent, mt)) {
            return NIL;
        }
        return T;
    }

    public static final SubLObject non_abducible_sentenceP_alt(SubLObject asent, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject store = inference_worker.currently_active_problem_store();
                SubLObject transformation_link = inference_datastructures_problem_store.problem_store_most_recent_transformation_link(store);
                SubLObject non_abducibleP = NIL;
                if (NIL != inference_worker_transformation.transformation_link_p(transformation_link)) {
                    {
                        SubLObject v_bindings = inference_worker_transformation.transformation_link_bindings(transformation_link);
                        SubLObject new_asent = bindings.subst_bindings(v_bindings, asent);
                        SubLObject pragmatic_requirements = inference_worker_transformation.transformation_link_pragmatic_requirements(transformation_link);
                        SubLObject pos_lits = inference_czer.contextualized_pos_lits(pragmatic_requirements);
                        SubLObject mt_var = mt;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                if (NIL == non_abducibleP) {
                                    {
                                        SubLObject csome_list_var = pos_lits;
                                        SubLObject lit = NIL;
                                        for (lit = csome_list_var.first(); !((NIL != non_abducibleP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , lit = csome_list_var.first()) {
                                            {
                                                SubLObject datum = lit;
                                                SubLObject current = datum;
                                                SubLObject lit_mt = NIL;
                                                SubLObject lit_formula = NIL;
                                                destructuring_bind_must_consp(current, datum, $list_alt2);
                                                lit_mt = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list_alt2);
                                                lit_formula = current.first();
                                                current = current.rest();
                                                if (NIL == current) {
                                                    if (((cycl_utilities.formula_operator(lit_formula) == $$nonAbducibleSentence) && (NIL != unification.unify_possible(new_asent, cycl_utilities.formula_arg1(lit_formula, UNPROVIDED)))) && (NIL != mt_relevance_macros.relevant_mtP(lit_mt))) {
                                                        non_abducibleP = T;
                                                    }
                                                } else {
                                                    cdestructuring_bind_error(datum, $list_alt2);
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
                return non_abducibleP;
            }
        }
    }

    public static SubLObject non_abducible_sentenceP(final SubLObject asent, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject store = inference_worker.currently_active_problem_store();
        final SubLObject transformation_link = inference_datastructures_problem_store.problem_store_most_recent_transformation_link(store);
        SubLObject non_abducibleP = NIL;
        if (NIL != inference_worker_transformation.transformation_link_p(transformation_link)) {
            final SubLObject v_bindings = inference_worker_transformation.transformation_link_bindings(transformation_link);
            final SubLObject new_asent = bindings.subst_bindings(v_bindings, asent);
            final SubLObject pragmatic_requirements = inference_worker_transformation.transformation_link_pragmatic_requirements(transformation_link);
            final SubLObject pos_lits = inference_czer.contextualized_pos_lits(pragmatic_requirements);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                if (NIL == non_abducibleP) {
                    SubLObject csome_list_var = pos_lits;
                    SubLObject lit = NIL;
                    lit = csome_list_var.first();
                    while ((NIL == non_abducibleP) && (NIL != csome_list_var)) {
                        SubLObject current;
                        final SubLObject datum = current = lit;
                        SubLObject lit_mt = NIL;
                        SubLObject lit_formula = NIL;
                        destructuring_bind_must_consp(current, datum, $list2);
                        lit_mt = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list2);
                        lit_formula = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if ((cycl_utilities.formula_operator(lit_formula).eql($$nonAbducibleSentence) && (NIL != unification.unify_possible(new_asent, cycl_utilities.formula_arg1(lit_formula, UNPROVIDED)))) && (NIL != mt_relevance_macros.relevant_mtP(lit_mt))) {
                                non_abducibleP = T;
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list2);
                        }
                        csome_list_var = csome_list_var.rest();
                        lit = csome_list_var.first();
                    } 
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return non_abducibleP;
    }

    public static final SubLObject non_abducible_relationP_alt(SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return isa.isaP(relation, $$NonAbducibleRelation, mt, UNPROVIDED);
    }

    public static SubLObject non_abducible_relationP(final SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return isa.isaP(relation, $$NonAbducibleRelation, mt, UNPROVIDED);
    }

    public static final SubLObject non_abducible_predicateP_alt(SubLObject predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return isa.isaP(predicate, $$NonAbduciblePredicate, mt, UNPROVIDED);
    }

    public static SubLObject non_abducible_predicateP(final SubLObject predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return isa.isaP(predicate, $$NonAbduciblePredicate, mt, UNPROVIDED);
    }

    public static final SubLObject non_abducible_collectionP_alt(SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return isa.isaP(collection, $$NonAbducibleCollection, mt, UNPROVIDED);
    }

    public static SubLObject non_abducible_collectionP(final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return isa.isaP(collection, $$NonAbducibleCollection, mt, UNPROVIDED);
    }

    public static final SubLObject non_abducible_for_argnumP_alt(SubLObject predicate, SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$notAbducibleForArg, predicate, argnum, mt, ONE_INTEGER, TWO_INTEGER, $TRUE);
    }

    public static SubLObject non_abducible_for_argnumP(final SubLObject predicate, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$notAbducibleForArg, predicate, argnum, mt, ONE_INTEGER, TWO_INTEGER, $TRUE);
    }

    public static final SubLObject non_abducible_wrt_value_in_argnumP_alt(SubLObject predicate, SubLObject value, SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject asent = make_ternary_formula($$notAbducibleWRTValueInArg, predicate, value, argnum);
                SubLObject non_abducibleP = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        {
                            SubLObject l_index = kb_indexing.best_gaf_lookup_index(asent, $TRUE, NIL);
                            SubLObject method = kb_mapping_macros.do_gli_extract_method(l_index);
                            SubLObject pcase_var = method;
                            if (pcase_var.eql($GAF_ARG)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                                    SubLObject argnum_1 = thread.secondMultipleValue();
                                    SubLObject predicate_2 = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != argnum_1) {
                                        if (NIL != predicate_2) {
                                            {
                                                SubLObject pred_var = predicate_2;
                                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum_1, pred_var)) {
                                                    {
                                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum_1, pred_var);
                                                        SubLObject done_var = non_abducibleP;
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
                                                                                SubLObject done_var_3 = non_abducibleP;
                                                                                SubLObject token_var_4 = NIL;
                                                                                while (NIL == done_var_3) {
                                                                                    {
                                                                                        SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_4);
                                                                                        SubLObject valid_5 = makeBoolean(token_var_4 != gaf);
                                                                                        if (NIL != valid_5) {
                                                                                            if (asent.equal(assertions_high.gaf_formula(gaf))) {
                                                                                                non_abducibleP = T;
                                                                                            }
                                                                                        }
                                                                                        done_var_3 = makeBoolean((NIL == valid_5) || (NIL != non_abducibleP));
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
                                                                done_var = makeBoolean((NIL == valid) || (NIL != non_abducibleP));
                                                            }
                                                        } 
                                                    }
                                                }
                                            }
                                        } else {
                                            {
                                                SubLObject pred_var = NIL;
                                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum_1, pred_var)) {
                                                    {
                                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum_1, pred_var);
                                                        SubLObject done_var = non_abducibleP;
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
                                                                                SubLObject done_var_7 = non_abducibleP;
                                                                                SubLObject token_var_8 = NIL;
                                                                                while (NIL == done_var_7) {
                                                                                    {
                                                                                        SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_8);
                                                                                        SubLObject valid_9 = makeBoolean(token_var_8 != gaf);
                                                                                        if (NIL != valid_9) {
                                                                                            if (asent.equal(assertions_high.gaf_formula(gaf))) {
                                                                                                non_abducibleP = T;
                                                                                            }
                                                                                        }
                                                                                        done_var_7 = makeBoolean((NIL == valid_9) || (NIL != non_abducibleP));
                                                                                    }
                                                                                } 
                                                                            }
                                                                        } finally {
                                                                            {
                                                                                SubLObject _prev_bind_0_10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                try {
                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                    if (NIL != final_index_iterator) {
                                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                    }
                                                                                } finally {
                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_10, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                done_var = makeBoolean((NIL == valid) || (NIL != non_abducibleP));
                                                            }
                                                        } 
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        if (NIL != predicate_2) {
                                            {
                                                SubLObject pred_var = predicate_2;
                                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                                    {
                                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                                                        SubLObject done_var = non_abducibleP;
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
                                                                                SubLObject done_var_11 = non_abducibleP;
                                                                                SubLObject token_var_12 = NIL;
                                                                                while (NIL == done_var_11) {
                                                                                    {
                                                                                        SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_12);
                                                                                        SubLObject valid_13 = makeBoolean(token_var_12 != gaf);
                                                                                        if (NIL != valid_13) {
                                                                                            if (asent.equal(assertions_high.gaf_formula(gaf))) {
                                                                                                non_abducibleP = T;
                                                                                            }
                                                                                        }
                                                                                        done_var_11 = makeBoolean((NIL == valid_13) || (NIL != non_abducibleP));
                                                                                    }
                                                                                } 
                                                                            }
                                                                        } finally {
                                                                            {
                                                                                SubLObject _prev_bind_0_14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                try {
                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                    if (NIL != final_index_iterator) {
                                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                    }
                                                                                } finally {
                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_14, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                done_var = makeBoolean((NIL == valid) || (NIL != non_abducibleP));
                                                            }
                                                        } 
                                                    }
                                                }
                                            }
                                        } else {
                                            {
                                                SubLObject pred_var = NIL;
                                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                                    {
                                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                                                        SubLObject done_var = non_abducibleP;
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
                                                                                SubLObject done_var_15 = non_abducibleP;
                                                                                SubLObject token_var_16 = NIL;
                                                                                while (NIL == done_var_15) {
                                                                                    {
                                                                                        SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_16);
                                                                                        SubLObject valid_17 = makeBoolean(token_var_16 != gaf);
                                                                                        if (NIL != valid_17) {
                                                                                            if (asent.equal(assertions_high.gaf_formula(gaf))) {
                                                                                                non_abducibleP = T;
                                                                                            }
                                                                                        }
                                                                                        done_var_15 = makeBoolean((NIL == valid_17) || (NIL != non_abducibleP));
                                                                                    }
                                                                                } 
                                                                            }
                                                                        } finally {
                                                                            {
                                                                                SubLObject _prev_bind_0_18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                try {
                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                    if (NIL != final_index_iterator) {
                                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                    }
                                                                                } finally {
                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_18, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                done_var = makeBoolean((NIL == valid) || (NIL != non_abducibleP));
                                                            }
                                                        } 
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (pcase_var.eql($PREDICATE_EXTENT)) {
                                    {
                                        SubLObject pred_var = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                                        if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                            {
                                                SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                                SubLObject done_var = non_abducibleP;
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
                                                                        SubLObject done_var_19 = non_abducibleP;
                                                                        SubLObject token_var_20 = NIL;
                                                                        while (NIL == done_var_19) {
                                                                            {
                                                                                SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_20);
                                                                                SubLObject valid_21 = makeBoolean(token_var_20 != gaf);
                                                                                if (NIL != valid_21) {
                                                                                    if (asent.equal(assertions_high.gaf_formula(gaf))) {
                                                                                        non_abducibleP = T;
                                                                                    }
                                                                                }
                                                                                done_var_19 = makeBoolean((NIL == valid_21) || (NIL != non_abducibleP));
                                                                            }
                                                                        } 
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            if (NIL != final_index_iterator) {
                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                            }
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_22, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        done_var = makeBoolean((NIL == valid) || (NIL != non_abducibleP));
                                                    }
                                                } 
                                            }
                                        }
                                    }
                                } else {
                                    if (pcase_var.eql($OVERLAP)) {
                                        {
                                            SubLObject rest = NIL;
                                            for (rest = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED); !((NIL != non_abducibleP) || (NIL == rest)); rest = rest.rest()) {
                                                {
                                                    SubLObject gaf = rest.first();
                                                    if (NIL != assertions_high.assertion_has_truth(gaf, $TRUE)) {
                                                        if (asent.equal(assertions_high.gaf_formula(gaf))) {
                                                            non_abducibleP = T;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        kb_mapping_macros.do_gli_method_error(l_index, method);
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return non_abducibleP;
            }
        }
    }

    public static SubLObject non_abducible_wrt_value_in_argnumP(final SubLObject predicate, final SubLObject value, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asent = make_ternary_formula($$notAbducibleWRTValueInArg, predicate, value, argnum);
        SubLObject non_abducibleP = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject l_index = kb_indexing.best_gaf_lookup_index(asent, $TRUE, NIL);
            final SubLObject pcase_var;
            final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
            if (pcase_var.eql($GAF_ARG)) {
                thread.resetMultipleValues();
                final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                final SubLObject argnum_$1 = thread.secondMultipleValue();
                final SubLObject predicate_$2 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != argnum_$1) {
                    if (NIL != predicate_$2) {
                        final SubLObject pred_var = predicate_$2;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum_$1, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum_$1, pred_var);
                            SubLObject done_var = non_abducibleP;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                        SubLObject done_var_$3 = non_abducibleP;
                                        final SubLObject token_var_$4 = NIL;
                                        while (NIL == done_var_$3) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                            final SubLObject valid_$5 = makeBoolean(!token_var_$4.eql(gaf));
                                            if ((NIL != valid_$5) && asent.equal(assertions_high.gaf_formula(gaf))) {
                                                non_abducibleP = T;
                                            }
                                            done_var_$3 = makeBoolean((NIL == valid_$5) || (NIL != non_abducibleP));
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean((NIL == valid) || (NIL != non_abducibleP));
                            } 
                        }
                    } else {
                        final SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum_$1, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum_$1, pred_var);
                            SubLObject done_var = non_abducibleP;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                        SubLObject done_var_$4 = non_abducibleP;
                                        final SubLObject token_var_$5 = NIL;
                                        while (NIL == done_var_$4) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                            final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(gaf));
                                            if ((NIL != valid_$6) && asent.equal(assertions_high.gaf_formula(gaf))) {
                                                non_abducibleP = T;
                                            }
                                            done_var_$4 = makeBoolean((NIL == valid_$6) || (NIL != non_abducibleP));
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean((NIL == valid) || (NIL != non_abducibleP));
                            } 
                        }
                    }
                } else
                    if (NIL != predicate_$2) {
                        final SubLObject pred_var = predicate_$2;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                            SubLObject done_var = non_abducibleP;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                        SubLObject done_var_$5 = non_abducibleP;
                                        final SubLObject token_var_$6 = NIL;
                                        while (NIL == done_var_$5) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
                                            final SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(gaf));
                                            if ((NIL != valid_$7) && asent.equal(assertions_high.gaf_formula(gaf))) {
                                                non_abducibleP = T;
                                            }
                                            done_var_$5 = makeBoolean((NIL == valid_$7) || (NIL != non_abducibleP));
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values3 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values3);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean((NIL == valid) || (NIL != non_abducibleP));
                            } 
                        }
                    } else {
                        final SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                            SubLObject done_var = non_abducibleP;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                        SubLObject done_var_$6 = non_abducibleP;
                                        final SubLObject token_var_$7 = NIL;
                                        while (NIL == done_var_$6) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$7);
                                            final SubLObject valid_$8 = makeBoolean(!token_var_$7.eql(gaf));
                                            if ((NIL != valid_$8) && asent.equal(assertions_high.gaf_formula(gaf))) {
                                                non_abducibleP = T;
                                            }
                                            done_var_$6 = makeBoolean((NIL == valid_$8) || (NIL != non_abducibleP));
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values4 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values4);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean((NIL == valid) || (NIL != non_abducibleP));
                            } 
                        }
                    }

            } else
                if (pcase_var.eql($PREDICATE_EXTENT)) {
                    final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                        final SubLObject str = NIL;
                        final SubLObject _prev_bind_0_$10 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$20 = $progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                        try {
                            $progress_start_time$.bind(get_universal_time(), thread);
                            $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                            $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                            $progress_notification_count$.bind(ZERO_INTEGER, thread);
                            $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                            $progress_count$.bind(ZERO_INTEGER, thread);
                            $is_noting_progressP$.bind(T, thread);
                            $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                            noting_progress_preamble(str);
                            final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                            SubLObject done_var2 = non_abducibleP;
                            final SubLObject token_var2 = NIL;
                            while (NIL == done_var2) {
                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                if (NIL != valid2) {
                                    note_progress();
                                    SubLObject final_index_iterator2 = NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, $TRUE, NIL);
                                        SubLObject done_var_$7 = non_abducibleP;
                                        final SubLObject token_var_$8 = NIL;
                                        while (NIL == done_var_$7) {
                                            final SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$8);
                                            final SubLObject valid_$9 = makeBoolean(!token_var_$8.eql(gaf2));
                                            if ((NIL != valid_$9) && asent.equal(assertions_high.gaf_formula(gaf2))) {
                                                non_abducibleP = T;
                                            }
                                            done_var_$7 = makeBoolean((NIL == valid_$9) || (NIL != non_abducibleP));
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values5 = getValuesAsVector();
                                            if (NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            restoreValuesFromVector(_values5);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                                        }
                                    }
                                }
                                done_var2 = makeBoolean((NIL == valid2) || (NIL != non_abducibleP));
                            } 
                            noting_progress_postamble();
                        } finally {
                            $silent_progressP$.rebind(_prev_bind_8, thread);
                            $is_noting_progressP$.rebind(_prev_bind_7, thread);
                            $progress_count$.rebind(_prev_bind_6, thread);
                            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                            $progress_notification_count$.rebind(_prev_bind_4, thread);
                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                            $progress_last_pacification_time$.rebind(_prev_bind_1_$20, thread);
                            $progress_start_time$.rebind(_prev_bind_0_$10, thread);
                        }
                    }
                } else
                    if (pcase_var.eql($OVERLAP)) {
                        SubLObject rest;
                        SubLObject gaf3;
                        for (rest = NIL, rest = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED); (NIL == non_abducibleP) && (NIL != rest); rest = rest.rest()) {
                            gaf3 = rest.first();
                            if ((NIL != assertions_high.assertion_has_truth(gaf3, $TRUE)) && asent.equal(assertions_high.gaf_formula(gaf3))) {
                                non_abducibleP = T;
                            }
                        }
                    } else {
                        kb_mapping_macros.do_gli_method_error(l_index, method);
                    }


        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return non_abducibleP;
    }

    public static final SubLObject non_abducible_wrt_value_in_argnum_via_typeP_alt(SubLObject predicate, SubLObject value, SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject non_abducibleP = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        {
                            SubLObject pred_var = $$notAbducibleWRTTypeInArg;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, ONE_INTEGER, pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, ONE_INTEGER, pred_var);
                                    SubLObject done_var = non_abducibleP;
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
                                                            SubLObject done_var_23 = non_abducibleP;
                                                            SubLObject token_var_24 = NIL;
                                                            while (NIL == done_var_23) {
                                                                {
                                                                    SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_24);
                                                                    SubLObject valid_25 = makeBoolean(token_var_24 != gaf);
                                                                    if (NIL != valid_25) {
                                                                        if (argnum.numE(assertions_high.gaf_arg3(gaf))) {
                                                                            {
                                                                                SubLObject collection = assertions_high.gaf_arg2(gaf);
                                                                                if (NIL != isa.isaP(value, collection, mt, UNPROVIDED)) {
                                                                                    non_abducibleP = T;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_23 = makeBoolean((NIL == valid_25) || (NIL != non_abducibleP));
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_26, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean((NIL == valid) || (NIL != non_abducibleP));
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
                return non_abducibleP;
            }
        }
    }

    public static SubLObject non_abducible_wrt_value_in_argnum_via_typeP(final SubLObject predicate, final SubLObject value, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject non_abducibleP = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject pred_var = $$notAbducibleWRTTypeInArg;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, ONE_INTEGER, pred_var);
                SubLObject done_var = non_abducibleP;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$25 = non_abducibleP;
                            final SubLObject token_var_$26 = NIL;
                            while (NIL == done_var_$25) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$26);
                                final SubLObject valid_$27 = makeBoolean(!token_var_$26.eql(gaf));
                                if ((NIL != valid_$27) && argnum.numE(assertions_high.gaf_arg3(gaf))) {
                                    final SubLObject collection = assertions_high.gaf_arg2(gaf);
                                    if (NIL != isa.isaP(value, collection, mt, UNPROVIDED)) {
                                        non_abducibleP = T;
                                    }
                                }
                                done_var_$25 = makeBoolean((NIL == valid_$27) || (NIL != non_abducibleP));
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                            }
                        }
                    }
                    done_var = makeBoolean((NIL == valid) || (NIL != non_abducibleP));
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return non_abducibleP;
    }

    public static final SubLObject valid_abduction_asentP_alt(SubLObject asent, SubLObject mt, SubLObject sense, SubLObject contains_abduced_termP) {
        if (NIL == variables.fully_bound_p(asent)) {
            return NIL;
        } else {
            if (NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, $$isa)) {
                return makeBoolean(NIL == com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities.provably_false_contextualized_isa_asentP(asent, mt, sense));
            } else {
                if (NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, $$termOfUnit)) {
                    return makeBoolean(NIL == com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities.provably_false_contextualized_tou_asentP(asent, mt));
                } else {
                    if ((NIL == contains_abduced_termP) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities.known_to_be_true_or_falseP(asent, mt, sense))) {
                        return NIL;
                    } else {
                        return com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities.abduction_admitted_formula(asent, mt);
                    }
                }
            }
        }
    }

    public static SubLObject valid_abduction_asentP(final SubLObject asent, final SubLObject mt, final SubLObject sense, final SubLObject contains_abduced_termP) {
        if (NIL == variables.fully_bound_p(asent)) {
            return NIL;
        }
        if (NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, $$isa)) {
            return makeBoolean(NIL == provably_false_contextualized_isa_asentP(asent, mt, sense));
        }
        if (NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, $$termOfUnit)) {
            return makeBoolean(NIL == provably_false_contextualized_tou_asentP(asent, mt));
        }
        if ((NIL == contains_abduced_termP) && (NIL != known_to_be_true_or_falseP(asent, mt, sense))) {
            return NIL;
        }
        return abduction_admitted_formula(asent, mt);
    }

    public static final SubLObject abduction_admitted_formula_alt(SubLObject asent, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_3 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
                    try {
                        at_vars.$noting_at_violationsP$.bind(NIL, thread);
                        at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
                        wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
                        wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
                        if (NIL == cycl_grammar.cycl_sentence_p(asent)) {
                            result = NIL;
                        } else {
                            if ((NIL != kb_accessors.irreflexive_predicateP(cycl_utilities.atomic_sentence_predicate(asent))) && (NIL != equals.equalsP(cycl_utilities.reify_arg_when_closed_naut(asent, ONE_INTEGER), cycl_utilities.reify_arg_when_closed_naut(asent, TWO_INTEGER), UNPROVIDED, UNPROVIDED))) {
                                result = NIL;
                            } else {
                                {
                                    SubLObject _prev_bind_0_27 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                                    try {
                                        at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                                        result = arg_type.formula_args_ok_wrt_typeP(asent, mt);
                                    } finally {
                                        at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_0_27, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_3, thread);
                        wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_2, thread);
                        at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_1, thread);
                        at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject abduction_admitted_formula(final SubLObject asent, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind(NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
            if (NIL == cycl_grammar.cycl_sentence_p(asent)) {
                result = NIL;
            } else
                if ((NIL != kb_accessors.irreflexive_predicateP(cycl_utilities.atomic_sentence_predicate(asent))) && (NIL != equals.equalsP(cycl_utilities.reify_arg_when_closed_naut(asent, ONE_INTEGER), cycl_utilities.reify_arg_when_closed_naut(asent, TWO_INTEGER), UNPROVIDED, UNPROVIDED))) {
                    result = NIL;
                } else {
                    final SubLObject _prev_bind_0_$29 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                    try {
                        at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                        result = arg_type.formula_args_ok_wrt_typeP(asent, mt);
                    } finally {
                        at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_0_$29, thread);
                    }
                }

        } finally {
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject known_to_be_true_or_falseP_alt(SubLObject asent, SubLObject mt, SubLObject sense) {
        {
            SubLObject v_properties = $list_alt17;
            SubLObject pcase_var = sense;
            if (pcase_var.eql($POS)) {
                return list_utilities.sublisp_boolean(backward.removal_ask(asent, mt, $FALSE, v_properties));
            } else {
                if (pcase_var.eql($NEG)) {
                    return list_utilities.sublisp_boolean(backward.removal_ask(asent, mt, $TRUE, v_properties));
                }
            }
        }
        return NIL;
    }

    public static SubLObject known_to_be_true_or_falseP(final SubLObject asent, final SubLObject mt, final SubLObject sense) {
        final SubLObject v_properties = $list17;
        if (sense.eql($POS)) {
            return list_utilities.sublisp_boolean(backward.removal_ask(asent, mt, $FALSE, v_properties));
        }
        if (sense.eql($NEG)) {
            return list_utilities.sublisp_boolean(backward.removal_ask(asent, mt, $TRUE, v_properties));
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static final SubLObject provably_false_contextualized_isa_asentP_alt(SubLObject asent, SubLObject mt, SubLObject sense) {
        if (NIL == groundP(asent, UNPROVIDED)) {
            return NIL;
        }
        {
            SubLObject inst = literal_arg1(asent, UNPROVIDED);
            SubLObject col = literal_arg2(asent, UNPROVIDED);
            if (NIL != isa.isaP(inst, col, mt, UNPROVIDED)) {
                return NIL;
            } else {
                return at_defns.quiet_not_has_typeP(inst, col, mt);
            }
        }
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static SubLObject provably_false_contextualized_isa_asentP(final SubLObject asent, final SubLObject mt, final SubLObject sense) {
        if (NIL == groundP(asent, UNPROVIDED)) {
            return NIL;
        }
        final SubLObject inst = literal_arg1(asent, UNPROVIDED);
        final SubLObject col = literal_arg2(asent, UNPROVIDED);
        if (NIL != isa.isaP(inst, col, mt, UNPROVIDED)) {
            return NIL;
        }
        return at_defns.quiet_not_has_typeP(inst, col, mt);
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static final SubLObject provably_false_contextualized_tou_asentP_alt(SubLObject asent, SubLObject mt) {
        if (NIL == groundP(asent, UNPROVIDED)) {
            return NIL;
        }
        {
            SubLObject arg1 = literal_arg1(asent, UNPROVIDED);
            SubLObject arg2 = literal_arg2(asent, UNPROVIDED);
            return disjoint_with.instances_of_disjoint_collectionsP(arg1, arg2, mt, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static SubLObject provably_false_contextualized_tou_asentP(final SubLObject asent, final SubLObject mt) {
        if (NIL == groundP(asent, UNPROVIDED)) {
            return NIL;
        }
        final SubLObject arg1 = literal_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = literal_arg2(asent, UNPROVIDED);
        return disjoint_with.instances_of_disjoint_collectionsP(arg1, arg2, mt, UNPROVIDED);
    }

    public static final SubLObject declare_inference_abduction_utilities_file_alt() {
        declareFunction("reject_proof_due_to_non_abducible_ruleP", "REJECT-PROOF-DUE-TO-NON-ABDUCIBLE-RULE?", 3, 0, false);
        declareFunction("some_abductive_subproofP", "SOME-ABDUCTIVE-SUBPROOF?", 1, 0, false);
        declareFunction("abduction_allowed_on_asentP", "ABDUCTION-ALLOWED-ON-ASENT?", 1, 2, false);
        declareFunction("non_abducible_sentenceP", "NON-ABDUCIBLE-SENTENCE?", 2, 0, false);
        declareFunction("non_abducible_relationP", "NON-ABDUCIBLE-RELATION?", 1, 1, false);
        declareFunction("non_abducible_predicateP", "NON-ABDUCIBLE-PREDICATE?", 1, 1, false);
        declareFunction("non_abducible_collectionP", "NON-ABDUCIBLE-COLLECTION?", 1, 1, false);
        declareFunction("non_abducible_for_argnumP", "NON-ABDUCIBLE-FOR-ARGNUM?", 2, 1, false);
        declareFunction("non_abducible_wrt_value_in_argnumP", "NON-ABDUCIBLE-WRT-VALUE-IN-ARGNUM?", 3, 1, false);
        declareFunction("non_abducible_wrt_value_in_argnum_via_typeP", "NON-ABDUCIBLE-WRT-VALUE-IN-ARGNUM-VIA-TYPE?", 3, 1, false);
        declareFunction("valid_abduction_asentP", "VALID-ABDUCTION-ASENT?", 4, 0, false);
        declareFunction("abduction_admitted_formula", "ABDUCTION-ADMITTED-FORMULA", 2, 0, false);
        declareFunction("known_to_be_true_or_falseP", "KNOWN-TO-BE-TRUE-OR-FALSE?", 3, 0, false);
        declareFunction("provably_false_contextualized_isa_asentP", "PROVABLY-FALSE-CONTEXTUALIZED-ISA-ASENT?", 3, 0, false);
        declareFunction("provably_false_contextualized_tou_asentP", "PROVABLY-FALSE-CONTEXTUALIZED-TOU-ASENT?", 2, 0, false);
        declareFunction("abductive_strategy_p", "ABDUCTIVE-STRATEGY-P", 1, 0, false);
        declareFunction("abductive_strategy_initialize", "ABDUCTIVE-STRATEGY-INITIALIZE", 1, 0, false);
        declareFunction("abductive_strategy_no_strategems_active_wrt_removalP", "ABDUCTIVE-STRATEGY-NO-STRATEGEMS-ACTIVE-WRT-REMOVAL?", 1, 0, false);
        declareFunction("abductive_strategy_peek_strategem_wrt_removal", "ABDUCTIVE-STRATEGY-PEEK-STRATEGEM-WRT-REMOVAL", 1, 0, false);
        declareFunction("abductive_strategy_no_new_rootsP", "ABDUCTIVE-STRATEGY-NO-NEW-ROOTS?", 1, 0, false);
        declareFunction("abductive_strategy_peek_new_root", "ABDUCTIVE-STRATEGY-PEEK-NEW-ROOT", 1, 0, false);
        declareFunction("abductive_strategy_chooses_to_throw_away_new_rootP", "ABDUCTIVE-STRATEGY-CHOOSES-TO-THROW-AWAY-NEW-ROOT?", 2, 0, false);
        declareFunction("abductive_strategy_new_root_provably_falseP", "ABDUCTIVE-STRATEGY-NEW-ROOT-PROVABLY-FALSE?", 1, 0, false);
        declareFunction("abductive_strategy_no_strategems_active_wrt_transformationP", "ABDUCTIVE-STRATEGY-NO-STRATEGEMS-ACTIVE-WRT-TRANSFORMATION?", 1, 0, false);
        declareFunction("abductive_strategy_peek_strategem_wrt_transformation", "ABDUCTIVE-STRATEGY-PEEK-STRATEGEM-WRT-TRANSFORMATION", 1, 0, false);
        declareFunction("abductive_strategy_current_contents", "ABDUCTIVE-STRATEGY-CURRENT-CONTENTS", 1, 0, false);
        declareFunction("abductive_strategy_activate_strategem_wrt_removal", "ABDUCTIVE-STRATEGY-ACTIVATE-STRATEGEM-WRT-REMOVAL", 2, 0, false);
        declareFunction("abductive_strategy_pop_strategem_wrt_removal", "ABDUCTIVE-STRATEGY-POP-STRATEGEM-WRT-REMOVAL", 1, 0, false);
        declareFunction("abductive_strategy_add_new_root", "ABDUCTIVE-STRATEGY-ADD-NEW-ROOT", 2, 0, false);
        declareFunction("abductive_strategy_pop_new_root", "ABDUCTIVE-STRATEGY-POP-NEW-ROOT", 1, 0, false);
        declareFunction("abductive_strategy_activate_strategem_wrt_transformation", "ABDUCTIVE-STRATEGY-ACTIVATE-STRATEGEM-WRT-TRANSFORMATION", 2, 0, false);
        declareFunction("abductive_strategy_pop_strategem_wrt_transformation", "ABDUCTIVE-STRATEGY-POP-STRATEGEM-WRT-TRANSFORMATION", 1, 0, false);
        declareFunction("abductive_tactician_heuristics", "ABDUCTIVE-TACTICIAN-HEURISTICS", 1, 0, false);
        declareMacro("do_abductive_tactician_strategic_heuristics", "DO-ABDUCTIVE-TACTICIAN-STRATEGIC-HEURISTICS");
        declareFunction("abductive_tactician_strategic_heuristicP", "ABDUCTIVE-TACTICIAN-STRATEGIC-HEURISTIC?", 2, 0, false);
        declareFunction("abductive_strategy_removal_strategem_happiness", "ABDUCTIVE-STRATEGY-REMOVAL-STRATEGEM-HAPPINESS", 2, 0, false);
        declareFunction("abductive_strategy_new_root_happiness", "ABDUCTIVE-STRATEGY-NEW-ROOT-HAPPINESS", 2, 0, false);
        declareFunction("abductive_strategy_transformation_tactic_happiness", "ABDUCTIVE-STRATEGY-TRANSFORMATION-TACTIC-HAPPINESS", 2, 0, false);
        declareFunction("abductive_strategy_transformation_link_happiness", "ABDUCTIVE-STRATEGY-TRANSFORMATION-LINK-HAPPINESS", 2, 0, false);
        declareFunction("abductive_strategy_logical_tactic_transformation_happiness", "ABDUCTIVE-STRATEGY-LOGICAL-TACTIC-TRANSFORMATION-HAPPINESS", 2, 0, false);
        declareFunction("abductive_strategy_generic_tactic_happiness", "ABDUCTIVE-STRATEGY-GENERIC-TACTIC-HAPPINESS", 3, 0, false);
        declareFunction("abductive_strategy_transformation_strategem_happiness", "ABDUCTIVE-STRATEGY-TRANSFORMATION-STRATEGEM-HAPPINESS", 2, 0, false);
        declareFunction("abductive_strategy_happiness_table", "ABDUCTIVE-STRATEGY-HAPPINESS-TABLE", 3, 0, false);
        declareFunction("strategic_heuristic_strategic_productivity", "STRATEGIC-HEURISTIC-STRATEGIC-PRODUCTIVITY", 2, 0, false);
        declareFunction("strategic_heuristic_delay_abduction", "STRATEGIC-HEURISTIC-DELAY-ABDUCTION", 2, 0, false);
        declareFunction("transformation_problem_rule_abductive_utility", "TRANSFORMATION-PROBLEM-RULE-ABDUCTIVE-UTILITY", 2, 0, false);
        declareFunction("push_problem_onto_rule_abductive_utility_stack", "PUSH-PROBLEM-ONTO-RULE-ABDUCTIVE-UTILITY-STACK", 1, 0, false);
        declareFunction("problem_on_rule_abductive_utility_stackP", "PROBLEM-ON-RULE-ABDUCTIVE-UTILITY-STACK?", 1, 0, false);
        declareFunction("strategic_heuristic_rule_abductive_utility", "STRATEGIC-HEURISTIC-RULE-ABDUCTIVE-UTILITY", 2, 0, false);
        declareFunction("compute_problem_rule_abductive_utility", "COMPUTE-PROBLEM-RULE-ABDUCTIVE-UTILITY", 2, 0, false);
        declareFunction("compute_tactic_rule_abductive_utility", "COMPUTE-TACTIC-RULE-ABDUCTIVE-UTILITY", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_inference_abduction_utilities_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("reject_proof_due_to_non_abducible_ruleP", "REJECT-PROOF-DUE-TO-NON-ABDUCIBLE-RULE?", 3, 0, false);
            declareFunction("some_abductive_subproofP", "SOME-ABDUCTIVE-SUBPROOF?", 1, 0, false);
            declareFunction("abduction_allowed_on_asentP", "ABDUCTION-ALLOWED-ON-ASENT?", 1, 2, false);
            declareFunction("non_abducible_sentenceP", "NON-ABDUCIBLE-SENTENCE?", 2, 0, false);
            declareFunction("non_abducible_relationP", "NON-ABDUCIBLE-RELATION?", 1, 1, false);
            declareFunction("non_abducible_predicateP", "NON-ABDUCIBLE-PREDICATE?", 1, 1, false);
            declareFunction("non_abducible_collectionP", "NON-ABDUCIBLE-COLLECTION?", 1, 1, false);
            declareFunction("non_abducible_for_argnumP", "NON-ABDUCIBLE-FOR-ARGNUM?", 2, 1, false);
            declareFunction("non_abducible_wrt_value_in_argnumP", "NON-ABDUCIBLE-WRT-VALUE-IN-ARGNUM?", 3, 1, false);
            declareFunction("non_abducible_wrt_value_in_argnum_via_typeP", "NON-ABDUCIBLE-WRT-VALUE-IN-ARGNUM-VIA-TYPE?", 3, 1, false);
            declareFunction("valid_abduction_asentP", "VALID-ABDUCTION-ASENT?", 4, 0, false);
            declareFunction("abduction_admitted_formula", "ABDUCTION-ADMITTED-FORMULA", 2, 0, false);
            declareFunction("known_to_be_true_or_falseP", "KNOWN-TO-BE-TRUE-OR-FALSE?", 3, 0, false);
            declareFunction("provably_false_contextualized_isa_asentP", "PROVABLY-FALSE-CONTEXTUALIZED-ISA-ASENT?", 3, 0, false);
            declareFunction("provably_false_contextualized_tou_asentP", "PROVABLY-FALSE-CONTEXTUALIZED-TOU-ASENT?", 2, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("abductive_strategy_p", "ABDUCTIVE-STRATEGY-P", 1, 0, false);
            declareFunction("abductive_strategy_initialize", "ABDUCTIVE-STRATEGY-INITIALIZE", 1, 0, false);
            declareFunction("abductive_strategy_no_strategems_active_wrt_removalP", "ABDUCTIVE-STRATEGY-NO-STRATEGEMS-ACTIVE-WRT-REMOVAL?", 1, 0, false);
            declareFunction("abductive_strategy_peek_strategem_wrt_removal", "ABDUCTIVE-STRATEGY-PEEK-STRATEGEM-WRT-REMOVAL", 1, 0, false);
            declareFunction("abductive_strategy_no_new_rootsP", "ABDUCTIVE-STRATEGY-NO-NEW-ROOTS?", 1, 0, false);
            declareFunction("abductive_strategy_peek_new_root", "ABDUCTIVE-STRATEGY-PEEK-NEW-ROOT", 1, 0, false);
            declareFunction("abductive_strategy_chooses_to_throw_away_new_rootP", "ABDUCTIVE-STRATEGY-CHOOSES-TO-THROW-AWAY-NEW-ROOT?", 2, 0, false);
            declareFunction("abductive_strategy_new_root_provably_falseP", "ABDUCTIVE-STRATEGY-NEW-ROOT-PROVABLY-FALSE?", 1, 0, false);
            declareFunction("abductive_strategy_no_strategems_active_wrt_transformationP", "ABDUCTIVE-STRATEGY-NO-STRATEGEMS-ACTIVE-WRT-TRANSFORMATION?", 1, 0, false);
            declareFunction("abductive_strategy_peek_strategem_wrt_transformation", "ABDUCTIVE-STRATEGY-PEEK-STRATEGEM-WRT-TRANSFORMATION", 1, 0, false);
            declareFunction("abductive_strategy_current_contents", "ABDUCTIVE-STRATEGY-CURRENT-CONTENTS", 1, 0, false);
            declareFunction("abductive_strategy_activate_strategem_wrt_removal", "ABDUCTIVE-STRATEGY-ACTIVATE-STRATEGEM-WRT-REMOVAL", 2, 0, false);
            declareFunction("abductive_strategy_pop_strategem_wrt_removal", "ABDUCTIVE-STRATEGY-POP-STRATEGEM-WRT-REMOVAL", 1, 0, false);
            declareFunction("abductive_strategy_add_new_root", "ABDUCTIVE-STRATEGY-ADD-NEW-ROOT", 2, 0, false);
            declareFunction("abductive_strategy_pop_new_root", "ABDUCTIVE-STRATEGY-POP-NEW-ROOT", 1, 0, false);
            declareFunction("abductive_strategy_activate_strategem_wrt_transformation", "ABDUCTIVE-STRATEGY-ACTIVATE-STRATEGEM-WRT-TRANSFORMATION", 2, 0, false);
            declareFunction("abductive_strategy_pop_strategem_wrt_transformation", "ABDUCTIVE-STRATEGY-POP-STRATEGEM-WRT-TRANSFORMATION", 1, 0, false);
            declareFunction("abductive_tactician_heuristics", "ABDUCTIVE-TACTICIAN-HEURISTICS", 1, 0, false);
            declareMacro("do_abductive_tactician_strategic_heuristics", "DO-ABDUCTIVE-TACTICIAN-STRATEGIC-HEURISTICS");
            declareFunction("abductive_tactician_strategic_heuristicP", "ABDUCTIVE-TACTICIAN-STRATEGIC-HEURISTIC?", 2, 0, false);
            declareFunction("abductive_strategy_removal_strategem_happiness", "ABDUCTIVE-STRATEGY-REMOVAL-STRATEGEM-HAPPINESS", 2, 0, false);
            declareFunction("abductive_strategy_new_root_happiness", "ABDUCTIVE-STRATEGY-NEW-ROOT-HAPPINESS", 2, 0, false);
            declareFunction("abductive_strategy_transformation_tactic_happiness", "ABDUCTIVE-STRATEGY-TRANSFORMATION-TACTIC-HAPPINESS", 2, 0, false);
            declareFunction("abductive_strategy_transformation_link_happiness", "ABDUCTIVE-STRATEGY-TRANSFORMATION-LINK-HAPPINESS", 2, 0, false);
            declareFunction("abductive_strategy_logical_tactic_transformation_happiness", "ABDUCTIVE-STRATEGY-LOGICAL-TACTIC-TRANSFORMATION-HAPPINESS", 2, 0, false);
            declareFunction("abductive_strategy_generic_tactic_happiness", "ABDUCTIVE-STRATEGY-GENERIC-TACTIC-HAPPINESS", 3, 0, false);
            declareFunction("abductive_strategy_transformation_strategem_happiness", "ABDUCTIVE-STRATEGY-TRANSFORMATION-STRATEGEM-HAPPINESS", 2, 0, false);
            declareFunction("abductive_strategy_happiness_table", "ABDUCTIVE-STRATEGY-HAPPINESS-TABLE", 3, 0, false);
            declareFunction("strategic_heuristic_strategic_productivity", "STRATEGIC-HEURISTIC-STRATEGIC-PRODUCTIVITY", 2, 0, false);
            declareFunction("strategic_heuristic_delay_abduction", "STRATEGIC-HEURISTIC-DELAY-ABDUCTION", 2, 0, false);
            declareFunction("transformation_problem_rule_abductive_utility", "TRANSFORMATION-PROBLEM-RULE-ABDUCTIVE-UTILITY", 2, 0, false);
            declareFunction("push_problem_onto_rule_abductive_utility_stack", "PUSH-PROBLEM-ONTO-RULE-ABDUCTIVE-UTILITY-STACK", 1, 0, false);
            declareFunction("problem_on_rule_abductive_utility_stackP", "PROBLEM-ON-RULE-ABDUCTIVE-UTILITY-STACK?", 1, 0, false);
            declareFunction("strategic_heuristic_rule_abductive_utility", "STRATEGIC-HEURISTIC-RULE-ABDUCTIVE-UTILITY", 2, 0, false);
            declareFunction("compute_problem_rule_abductive_utility", "COMPUTE-PROBLEM-RULE-ABDUCTIVE-UTILITY", 2, 0, false);
            declareFunction("compute_tactic_rule_abductive_utility", "COMPUTE-TACTIC-RULE-ABDUCTIVE-UTILITY", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_inference_abduction_utilities_file_Previous() {
        declareFunction("reject_proof_due_to_non_abducible_ruleP", "REJECT-PROOF-DUE-TO-NON-ABDUCIBLE-RULE?", 3, 0, false);
        declareFunction("some_abductive_subproofP", "SOME-ABDUCTIVE-SUBPROOF?", 1, 0, false);
        declareFunction("abduction_allowed_on_asentP", "ABDUCTION-ALLOWED-ON-ASENT?", 1, 2, false);
        declareFunction("non_abducible_sentenceP", "NON-ABDUCIBLE-SENTENCE?", 2, 0, false);
        declareFunction("non_abducible_relationP", "NON-ABDUCIBLE-RELATION?", 1, 1, false);
        declareFunction("non_abducible_predicateP", "NON-ABDUCIBLE-PREDICATE?", 1, 1, false);
        declareFunction("non_abducible_collectionP", "NON-ABDUCIBLE-COLLECTION?", 1, 1, false);
        declareFunction("non_abducible_for_argnumP", "NON-ABDUCIBLE-FOR-ARGNUM?", 2, 1, false);
        declareFunction("non_abducible_wrt_value_in_argnumP", "NON-ABDUCIBLE-WRT-VALUE-IN-ARGNUM?", 3, 1, false);
        declareFunction("non_abducible_wrt_value_in_argnum_via_typeP", "NON-ABDUCIBLE-WRT-VALUE-IN-ARGNUM-VIA-TYPE?", 3, 1, false);
        declareFunction("valid_abduction_asentP", "VALID-ABDUCTION-ASENT?", 4, 0, false);
        declareFunction("abduction_admitted_formula", "ABDUCTION-ADMITTED-FORMULA", 2, 0, false);
        declareFunction("known_to_be_true_or_falseP", "KNOWN-TO-BE-TRUE-OR-FALSE?", 3, 0, false);
        declareFunction("provably_false_contextualized_isa_asentP", "PROVABLY-FALSE-CONTEXTUALIZED-ISA-ASENT?", 3, 0, false);
        declareFunction("provably_false_contextualized_tou_asentP", "PROVABLY-FALSE-CONTEXTUALIZED-TOU-ASENT?", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_inference_abduction_utilities_file_alt() {
        defvar("*ABDUCTIVE-STRATEGY-TYPE*", $ABDUCTIVE);
        defparameter("*PRUNE-SEMANTICALLY-BAD-NEW-ROOTS?*", NIL);
        deflexical("*ABDUCTIVE-TACTICIAN-REMOVAL-HEURISTICS*", set_utilities.construct_set_from_list($list_alt37, symbol_function(EQ), UNPROVIDED));
        deflexical("*ABDUCTIVE-TACTICIAN-TRANSFORMATION-HEURISTICS*", set_utilities.construct_set_from_list($list_alt38, symbol_function(EQ), UNPROVIDED));
        defparameter("*HEURISTIC-RULE-ABDUCTIVE-UTILITY-PROBLEM-RECURSION-STACK*", NIL);
        return NIL;
    }

    public static SubLObject init_inference_abduction_utilities_file() {
        if (SubLFiles.USE_V1) {
        }
        if (SubLFiles.USE_V2) {
            defvar("*ABDUCTIVE-STRATEGY-TYPE*", $ABDUCTIVE);
            defparameter("*PRUNE-SEMANTICALLY-BAD-NEW-ROOTS?*", NIL);
            deflexical("*ABDUCTIVE-TACTICIAN-REMOVAL-HEURISTICS*", set_utilities.construct_set_from_list($list_alt37, symbol_function(EQ), UNPROVIDED));
            deflexical("*ABDUCTIVE-TACTICIAN-TRANSFORMATION-HEURISTICS*", set_utilities.construct_set_from_list($list_alt38, symbol_function(EQ), UNPROVIDED));
            defparameter("*HEURISTIC-RULE-ABDUCTIVE-UTILITY-PROBLEM-RECURSION-STACK*", NIL);
        }
        return NIL;
    }

    public static SubLObject init_inference_abduction_utilities_file_Previous() {
        return NIL;
    }

    public static final SubLObject setup_inference_abduction_utilities_file_alt() {
        inference_tactician.inference_strategy_type($ABDUCTIVE, $list_alt21);
        note_funcall_helper_function($sym22$ABDUCTIVE_STRATEGY_NO_STRATEGEMS_ACTIVE_WRT_REMOVAL_);
        note_funcall_helper_function(ABDUCTIVE_STRATEGY_PEEK_STRATEGEM_WRT_REMOVAL);
        note_funcall_helper_function($sym24$ABDUCTIVE_STRATEGY_NO_NEW_ROOTS_);
        note_funcall_helper_function(ABDUCTIVE_STRATEGY_PEEK_NEW_ROOT);
        note_funcall_helper_function($sym26$ABDUCTIVE_STRATEGY_CHOOSES_TO_THROW_AWAY_NEW_ROOT_);
        note_funcall_helper_function($sym28$ABDUCTIVE_STRATEGY_NO_STRATEGEMS_ACTIVE_WRT_TRANSFORMATION_);
        note_funcall_helper_function(ABDUCTIVE_STRATEGY_PEEK_STRATEGEM_WRT_TRANSFORMATION);
        note_funcall_helper_function(ABDUCTIVE_STRATEGY_ACTIVATE_STRATEGEM_WRT_REMOVAL);
        note_funcall_helper_function(ABDUCTIVE_STRATEGY_POP_STRATEGEM_WRT_REMOVAL);
        note_funcall_helper_function(ABDUCTIVE_STRATEGY_ADD_NEW_ROOT);
        note_funcall_helper_function(ABDUCTIVE_STRATEGY_POP_NEW_ROOT);
        note_funcall_helper_function(ABDUCTIVE_STRATEGY_ACTIVATE_STRATEGEM_WRT_TRANSFORMATION);
        note_funcall_helper_function(ABDUCTIVE_STRATEGY_POP_STRATEGEM_WRT_TRANSFORMATION);
        register_macro_helper($sym48$ABDUCTIVE_TACTICIAN_STRATEGIC_HEURISTIC_, DO_ABDUCTIVE_TACTICIAN_STRATEGIC_HEURISTICS);
        inference_strategic_heuristics.declare_strategic_heuristic($STRATEGIC_PRODUCTIVITY, $list_alt58);
        inference_strategic_heuristics.declare_strategic_heuristic($DELAY_ABDUCTION, $list_alt60);
        inference_strategic_heuristics.declare_strategic_heuristic($RULE_ABDUCTIVE_UTILITY, $list_alt63);
        return NIL;
    }

    public static SubLObject setup_inference_abduction_utilities_file() {
        if (SubLFiles.USE_V1) {
        }
        if (SubLFiles.USE_V2) {
            inference_tactician.inference_strategy_type($ABDUCTIVE, $list_alt21);
            note_funcall_helper_function($sym22$ABDUCTIVE_STRATEGY_NO_STRATEGEMS_ACTIVE_WRT_REMOVAL_);
            note_funcall_helper_function(ABDUCTIVE_STRATEGY_PEEK_STRATEGEM_WRT_REMOVAL);
            note_funcall_helper_function($sym24$ABDUCTIVE_STRATEGY_NO_NEW_ROOTS_);
            note_funcall_helper_function(ABDUCTIVE_STRATEGY_PEEK_NEW_ROOT);
            note_funcall_helper_function($sym26$ABDUCTIVE_STRATEGY_CHOOSES_TO_THROW_AWAY_NEW_ROOT_);
            note_funcall_helper_function($sym28$ABDUCTIVE_STRATEGY_NO_STRATEGEMS_ACTIVE_WRT_TRANSFORMATION_);
            note_funcall_helper_function(ABDUCTIVE_STRATEGY_PEEK_STRATEGEM_WRT_TRANSFORMATION);
            note_funcall_helper_function(ABDUCTIVE_STRATEGY_ACTIVATE_STRATEGEM_WRT_REMOVAL);
            note_funcall_helper_function(ABDUCTIVE_STRATEGY_POP_STRATEGEM_WRT_REMOVAL);
            note_funcall_helper_function(ABDUCTIVE_STRATEGY_ADD_NEW_ROOT);
            note_funcall_helper_function(ABDUCTIVE_STRATEGY_POP_NEW_ROOT);
            note_funcall_helper_function(ABDUCTIVE_STRATEGY_ACTIVATE_STRATEGEM_WRT_TRANSFORMATION);
            note_funcall_helper_function(ABDUCTIVE_STRATEGY_POP_STRATEGEM_WRT_TRANSFORMATION);
            register_macro_helper($sym48$ABDUCTIVE_TACTICIAN_STRATEGIC_HEURISTIC_, DO_ABDUCTIVE_TACTICIAN_STRATEGIC_HEURISTICS);
            inference_strategic_heuristics.declare_strategic_heuristic($STRATEGIC_PRODUCTIVITY, $list_alt58);
            inference_strategic_heuristics.declare_strategic_heuristic($DELAY_ABDUCTION, $list_alt60);
            inference_strategic_heuristics.declare_strategic_heuristic($RULE_ABDUCTIVE_UTILITY, $list_alt63);
        }
        return NIL;
    }

    public static SubLObject setup_inference_abduction_utilities_file_Previous() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_abduction_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_abduction_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_abduction_utilities_file();
    }

    static {
    }

    static private final SubLList $list_alt2 = list(makeSymbol("LIT-MT"), makeSymbol("LIT-FORMULA"));

    static private final SubLList $list_alt17 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("ALLOWED-MODULES"), list(makeKeyword("NOT"), list(makeKeyword("MODULE-SUBTYPE"), makeKeyword("ABDUCTION"))));

    private static final SubLSymbol $ABDUCTIVE = makeKeyword("ABDUCTIVE");

    static private final SubLList $list_alt21 = list(new SubLObject[]{ $NAME, makeString("Abductive Search"), makeKeyword("COMMENT"), makeString("Similar to the heuristic-balanced Tactician, except the transformation heuristics\nare optimized to support the needs of the abductive inference modules."), makeKeyword("CONSTRUCTOR"), makeSymbol("ABDUCTIVE-STRATEGY-INITIALIZE"), makeKeyword("DONE?"), makeSymbol("BALANCED-STRATEGY-DONE?"), makeKeyword("DO-ONE-STEP"), makeSymbol("BALANCED-STRATEGY-DO-ONE-STEP"), makeKeyword("POSSIBLY-ACTIVATE-PROBLEM"), makeSymbol("BALANCED-STRATEGY-POSSIBLY-ACTIVATE-PROBLEM"), makeKeyword("SELECT-BEST-STRATEGEM"), makeSymbol("BALANCED-STRATEGY-DEFAULT-SELECT-BEST-STRATEGEM"), makeKeyword("THROW-AWAY-UNINTERESTING-SET-ASIDES"), makeSymbol("BALANCED-STRATEGY-THROW-AWAY-UNINTERESTING-SET-ASIDES"), makeKeyword("QUIESCE"), makeSymbol("BALANCED-STRATEGY-QUIESCE"), makeKeyword("EARLY-REMOVAL-PRODUCTIVITY-LIMIT"), makeSymbol("BALANCED-STRATEGY-EARLY-REMOVAL-PRODUCTIVITY-LIMIT"), makeKeyword("NEW-ARGUMENT-LINK"), makeSymbol("BALANCED-STRATEGY-NOTE-ARGUMENT-LINK-ADDED"), makeKeyword("NEW-TACTIC"), makeSymbol("BALANCED-STRATEGY-NOTE-NEW-TACTIC"), makeKeyword("RELEVANT-TACTICS-WRT-REMOVAL"), makeSymbol("BALANCED-STRATEGY-CATEGORIZE-STRATEGEMS-WRT-REMOVAL"), makeKeyword("SPLIT-TACTICS-POSSIBLE"), makeSymbol("BALANCED-STRATEGY-NOTE-SPLIT-TACTICS-STRATEGICALLY-POSSIBLE"), makeKeyword("PROBLEM-COULD-BE-PENDING"), makeSymbol("BALANCED-STRATEGY-CONSIDER-THAT-PROBLEM-COULD-BE-STRATEGICALLY-TOTALLY-PENDING"), makeKeyword("PROBLEM-NOTHING-TO-DO?"), makeSymbol("BALANCED-STRATEGY-PROBLEM-TOTALLY-PENDING?"), makeKeyword("PEEK-REMOVAL-STRATEGEM"), makeSymbol("ABDUCTIVE-STRATEGY-PEEK-STRATEGEM-WRT-REMOVAL"), makeKeyword("ACTIVATE-REMOVAL-STRATEGEM"), makeSymbol("ABDUCTIVE-STRATEGY-ACTIVATE-STRATEGEM-WRT-REMOVAL"), makeKeyword("POP-REMOVAL-STRATEGEM"), makeSymbol("ABDUCTIVE-STRATEGY-POP-STRATEGEM-WRT-REMOVAL"), makeKeyword("NO-ACTIVE-REMOVAL-STRATEGEMS"), makeSymbol("ABDUCTIVE-STRATEGY-NO-STRATEGEMS-ACTIVE-WRT-REMOVAL?"), makeKeyword("PEEK-NEW-ROOT"), makeSymbol("ABDUCTIVE-STRATEGY-PEEK-NEW-ROOT"), makeKeyword("ACTIVATE-NEW-ROOT"), makeSymbol("ABDUCTIVE-STRATEGY-ADD-NEW-ROOT"), makeKeyword("POP-NEW-ROOT"), makeSymbol("ABDUCTIVE-STRATEGY-POP-NEW-ROOT"), makeKeyword("NO-NEW-ROOTS"), makeSymbol("ABDUCTIVE-STRATEGY-NO-NEW-ROOTS?"), makeKeyword("THROW-AWAY-NEW-ROOT"), makeSymbol("ABDUCTIVE-STRATEGY-CHOOSES-TO-THROW-AWAY-NEW-ROOT?"), makeKeyword("PEEK-TRANSFORMATION-STRATEGEM"), makeSymbol("ABDUCTIVE-STRATEGY-PEEK-STRATEGEM-WRT-TRANSFORMATION"), makeKeyword("ACTIVATE-TRANSFORMATION-STRATEGEM"), makeSymbol("ABDUCTIVE-STRATEGY-ACTIVATE-STRATEGEM-WRT-TRANSFORMATION"), makeKeyword("POP-TRANSFORMATION-STRATEGEM"), makeSymbol("ABDUCTIVE-STRATEGY-POP-STRATEGEM-WRT-TRANSFORMATION"), makeKeyword("NO-ACTIVE-TRANSFORMATION-STRATEGEMS"), makeSymbol("ABDUCTIVE-STRATEGY-NO-STRATEGEMS-ACTIVE-WRT-TRANSFORMATION?") });

    static private final SubLSymbol $sym22$ABDUCTIVE_STRATEGY_NO_STRATEGEMS_ACTIVE_WRT_REMOVAL_ = makeSymbol("ABDUCTIVE-STRATEGY-NO-STRATEGEMS-ACTIVE-WRT-REMOVAL?");

    private static final SubLSymbol ABDUCTIVE_STRATEGY_PEEK_STRATEGEM_WRT_REMOVAL = makeSymbol("ABDUCTIVE-STRATEGY-PEEK-STRATEGEM-WRT-REMOVAL");

    static private final SubLSymbol $sym24$ABDUCTIVE_STRATEGY_NO_NEW_ROOTS_ = makeSymbol("ABDUCTIVE-STRATEGY-NO-NEW-ROOTS?");

    private static final SubLSymbol ABDUCTIVE_STRATEGY_PEEK_NEW_ROOT = makeSymbol("ABDUCTIVE-STRATEGY-PEEK-NEW-ROOT");

    static private final SubLSymbol $sym26$ABDUCTIVE_STRATEGY_CHOOSES_TO_THROW_AWAY_NEW_ROOT_ = makeSymbol("ABDUCTIVE-STRATEGY-CHOOSES-TO-THROW-AWAY-NEW-ROOT?");

    static private final SubLList $list_alt27 = list(makeSymbol("MT"), makeSymbol("ASENT"));

    static private final SubLSymbol $sym28$ABDUCTIVE_STRATEGY_NO_STRATEGEMS_ACTIVE_WRT_TRANSFORMATION_ = makeSymbol("ABDUCTIVE-STRATEGY-NO-STRATEGEMS-ACTIVE-WRT-TRANSFORMATION?");

    private static final SubLSymbol ABDUCTIVE_STRATEGY_PEEK_STRATEGEM_WRT_TRANSFORMATION = makeSymbol("ABDUCTIVE-STRATEGY-PEEK-STRATEGEM-WRT-TRANSFORMATION");

    private static final SubLSymbol ABDUCTIVE_STRATEGY_P = makeSymbol("ABDUCTIVE-STRATEGY-P");

    private static final SubLSymbol ABDUCTIVE_STRATEGY_ACTIVATE_STRATEGEM_WRT_REMOVAL = makeSymbol("ABDUCTIVE-STRATEGY-ACTIVATE-STRATEGEM-WRT-REMOVAL");

    private static final SubLSymbol ABDUCTIVE_STRATEGY_POP_STRATEGEM_WRT_REMOVAL = makeSymbol("ABDUCTIVE-STRATEGY-POP-STRATEGEM-WRT-REMOVAL");

    private static final SubLSymbol ABDUCTIVE_STRATEGY_ADD_NEW_ROOT = makeSymbol("ABDUCTIVE-STRATEGY-ADD-NEW-ROOT");

    private static final SubLSymbol ABDUCTIVE_STRATEGY_POP_NEW_ROOT = makeSymbol("ABDUCTIVE-STRATEGY-POP-NEW-ROOT");

    private static final SubLSymbol ABDUCTIVE_STRATEGY_ACTIVATE_STRATEGEM_WRT_TRANSFORMATION = makeSymbol("ABDUCTIVE-STRATEGY-ACTIVATE-STRATEGEM-WRT-TRANSFORMATION");

    private static final SubLSymbol ABDUCTIVE_STRATEGY_POP_STRATEGEM_WRT_TRANSFORMATION = makeSymbol("ABDUCTIVE-STRATEGY-POP-STRATEGEM-WRT-TRANSFORMATION");

    static private final SubLList $list_alt37 = list(makeKeyword("STRATEGIC-PRODUCTIVITY"), makeKeyword("DELAY-ABDUCTION"));

    static private final SubLList $list_alt38 = list(new SubLObject[]{ makeKeyword("SHALLOW-AND-CHEAP"), makeKeyword("COMPLETENESS"), makeKeyword("OCCAMS-RAZOR"), makeKeyword("MAGIC-WAND"), makeKeyword("BACKCHAIN-REQUIRED"), makeKeyword("RULE-A-PRIORI-UTILITY"), makeKeyword("RELEVANT-TERM"), makeKeyword("RULE-HISTORICAL-UTILITY"), makeKeyword("LITERAL-COUNT") });

    static private final SubLList $list_alt41 = list(list(makeSymbol("HEURISTIC"), makeSymbol("FUNCTION"), makeSymbol("SCALING-FACTOR"), makeSymbol("MOTIVATION"), makeSymbol("&KEY"), makeSymbol("TACTIC"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt42 = list(makeKeyword("TACTIC"), $DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol DO_STRATEGIC_HEURISTICS = makeSymbol("DO-STRATEGIC-HEURISTICS");

    static private final SubLSymbol $sym48$ABDUCTIVE_TACTICIAN_STRATEGIC_HEURISTIC_ = makeSymbol("ABDUCTIVE-TACTICIAN-STRATEGIC-HEURISTIC?");

    private static final SubLSymbol DO_ABDUCTIVE_TACTICIAN_STRATEGIC_HEURISTICS = makeSymbol("DO-ABDUCTIVE-TACTICIAN-STRATEGIC-HEURISTICS");

    private static final SubLSymbol REMOVAL_STRATEGEM_P = makeSymbol("REMOVAL-STRATEGEM-P");

    private static final SubLSymbol TRANSFORMATION_TACTIC_P = makeSymbol("TRANSFORMATION-TACTIC-P");

    private static final SubLSymbol TRANSFORMATION_LINK_P = makeSymbol("TRANSFORMATION-LINK-P");

    private static final SubLSymbol LOGICAL_TACTIC_P = makeSymbol("LOGICAL-TACTIC-P");

    static private final SubLString $str_alt56$_S_is_not_a_transformation_strate = makeString("~S is not a transformation strategem");

    private static final SubLSymbol $STRATEGIC_PRODUCTIVITY = makeKeyword("STRATEGIC-PRODUCTIVITY");

    static private final SubLList $list_alt58 = list(new SubLObject[]{ makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-STRATEGIC-PRODUCTIVITY"), makeKeyword("SCALING-FACTOR"), makeInteger(100), makeKeyword("TACTIC-TYPE"), makeKeyword("GENERALIZED-REMOVAL-OR-REWRITE"), makeKeyword("PRETTY-NAME"), makeString("Strategic Productivity"), makeKeyword("COMMENT"), makeString("Prefer removal tactics with lesser productivity over more productive tactics") });

    private static final SubLSymbol $DELAY_ABDUCTION = makeKeyword("DELAY-ABDUCTION");

    static private final SubLList $list_alt60 = list(new SubLObject[]{ makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-DELAY-ABDUCTION"), makeKeyword("SCALING-FACTOR"), makeInteger(10000), makeKeyword("TACTIC-TYPE"), makeKeyword("GENERALIZED-REMOVAL-OR-REWRITE"), makeKeyword("PRETTY-NAME"), makeString("Delay Abductive Tactics"), makeKeyword("COMMENT"), makeString("Prefer deductive removal tactics over abductive removal tactics.") });

    public static final SubLInteger $int$_100 = makeInteger(-100);

    private static final SubLSymbol $RULE_ABDUCTIVE_UTILITY = makeKeyword("RULE-ABDUCTIVE-UTILITY");

    static private final SubLList $list_alt63 = list(makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-RULE-ABDUCTIVE-UTILITY"), makeKeyword("SCALING-FACTOR"), makeInteger(500), makeKeyword("PRETTY-NAME"), makeString("Abductive Utility"), makeKeyword("COMMENT"), makeString("Prefer proof paths using rules that work well for generative abductive inferences,\nwithout considering the situations in which they were used, i.e.\nprior probability.  Consider proof paths using no rules to be at 100%."));
}

/**
 * Total time: 633 ms
 */
