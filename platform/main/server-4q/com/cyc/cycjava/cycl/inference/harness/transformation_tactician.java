package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.control_vars.$inference_trace_level$;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
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

import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.stacks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class transformation_tactician extends SubLTranslatedFile {
    public static final SubLFile me = new transformation_tactician();

    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.transformation_tactician";

    public static final String myFingerPrint = "67e949b735c7ea493f5599681a4a23711722c366de3b1d11faefe6779e5a31fa";

    // deflexical
    private static final SubLSymbol $transformation_tactician_tactic_heuristics$ = makeSymbol("*TRANSFORMATION-TACTICIAN-TACTIC-HEURISTICS*");

    // deflexical
    private static final SubLSymbol $transformation_tactician_problem_heuristics$ = makeSymbol("*TRANSFORMATION-TACTICIAN-PROBLEM-HEURISTICS*");



    public static final SubLList $list1 = list(new SubLObject[]{ makeKeyword("NAME"), makeString("The TRANSFORMATION Tactician"), makeKeyword("COMMENT"), makeString("The TRANSFORMATION Tactician needs no introduction."), makeKeyword("CONSTRUCTOR"), makeSymbol("TRANSFORMATION-STRATEGY-INITIALIZE"), makeKeyword("DONE?"), makeSymbol("TRANSFORMATION-STRATEGY-DONE?"), makeKeyword("DO-ONE-STEP"), makeSymbol("TRANSFORMATION-STRATEGY-DO-ONE-STEP"), makeKeyword("POSSIBLY-ACTIVATE-PROBLEM"), makeSymbol("TRANSFORMATION-STRATEGY-POSSIBLY-ACTIVATE-PROBLEM"), makeKeyword("SELECT-BEST-STRATEGEM"), makeSymbol("TRANSFORMATION-STRATEGY-DEFAULT-SELECT-BEST-STRATEGEM"), makeKeyword("EXECUTE-STRATEGEM"), makeSymbol("TRANSFORMATION-STRATEGY-EXECUTE-STRATEGEM"), makeKeyword("RECONSIDER-SET-ASIDES"), makeSymbol("TRANSFORMATION-STRATEGY-RECONSIDER-SET-ASIDES"), makeKeyword("THROW-AWAY-UNINTERESTING-SET-ASIDES"), makeSymbol("TRANSFORMATION-STRATEGY-THROW-AWAY-UNINTERESTING-SET-ASIDES"), makeKeyword("QUIESCE"), makeSymbol("TRANSFORMATION-STRATEGY-QUIESCE"), makeKeyword("NEW-ARGUMENT-LINK"), makeSymbol("TRANSFORMATION-STRATEGY-NOTE-ARGUMENT-LINK-ADDED"), makeKeyword("NEW-TACTIC"), makeSymbol("TRANSFORMATION-STRATEGY-NOTE-NEW-TACTIC"), makeKeyword("SPLIT-TACTICS-POSSIBLE"), makeSymbol("TRANSFORMATION-STRATEGY-NOTE-SPLIT-TACTICS-STRATEGICALLY-POSSIBLE"), makeKeyword("PROBLEM-COULD-BE-PENDING"), makeSymbol("TRANSFORMATION-STRATEGY-CONSIDER-THAT-PROBLEM-COULD-BE-STRATEGICALLY-TOTALLY-PENDING"), makeKeyword("PROBLEM-NOTHING-TO-DO?"), makeSymbol("TRANSFORMATION-STRATEGY-PROBLEM-NOTHING-TO-DO?"), makeKeyword("THROW-AWAY-PROBLEM"), makeSymbol("TRANSFORMATION-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM?"), makeKeyword("SET-ASIDE-PROBLEM"), makeSymbol("TRANSFORMATION-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM?"), makeKeyword("THROW-AWAY-TACTIC"), makeSymbol("TRANSFORMATION-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC?"), makeKeyword("SET-ASIDE-TACTIC"), makeSymbol("TRANSFORMATION-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC?"), makeKeyword("RELEVANT-TACTICS-WRT-REMOVAL"), makeSymbol("BULL"), makeKeyword("HAPPINESS-TABLE"), makeSymbol("TRANSFORMATION-STRATEGY-HAPPINESS-TABLE"), makeKeyword("MOTIVATE-STRATEGEM"), makeSymbol("TRANSFORMATION-STRATEGY-POSSIBLY-PROPAGATE-MOTIVATION-TO-PROBLEM"), makeKeyword("LINK-HEAD-MOTIVATED?"), makeSymbol("TRANSFORMATION-STRATEGY-LINK-HEAD-MOTIVATED?") });

    public static final SubLSymbol TRANSFORMATION_STRATEGY_INITIALIZE = makeSymbol("TRANSFORMATION-STRATEGY-INITIALIZE");

    private static final SubLString $str3$_a_happiness___a__a__a__ = makeString("~a happiness: ~a ~a ~a~%");

    public static final SubLList $list4 = list(makeSymbol("OBJECT"), makeSymbol("HAPPINESS"));

    private static final SubLSymbol TRANSFORMATION_STRATEGY_P = makeSymbol("TRANSFORMATION-STRATEGY-P");

    public static final SubLList $list6 = list(makeKeyword("COMPLETENESS"), makeKeyword("OCCAMS-RAZOR-TACTIC"), makeKeyword("MAGIC-WAND"), makeKeyword("BACKTRACKING-CONSIDERED-HARMFUL"), makeKeyword("BACKCHAIN-REQUIRED"), makeKeyword("RULE-A-PRIORI-UTILITY"), makeKeyword("RULE-HISTORICAL-UTILITY"), makeKeyword("RULE-LITERAL-COUNT"));

    private static final SubLList $list7 = list(makeKeyword("SHALLOW-AND-CHEAP"), makeKeyword("RELEVANT-TERM"), makeKeyword("LITERAL-COUNT"), makeKeyword("SKOLEM-COUNT"));

    private static final SubLList $list8 = list(list(makeSymbol("HEURISTIC"), makeSymbol("FUNCTION"), makeSymbol("SCALING-FACTOR"), makeSymbol("&KEY"), makeSymbol("TACTIC"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list9 = list(makeKeyword("TACTIC"), makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    private static final SubLSymbol DO_STRATEGIC_HEURISTICS = makeSymbol("DO-STRATEGIC-HEURISTICS");





    private static final SubLSymbol $sym16$TRANSFORMATION_TACTICIAN_TACTIC_HEURISTIC_ = makeSymbol("TRANSFORMATION-TACTICIAN-TACTIC-HEURISTIC?");

    private static final SubLList $list17 = list(list(makeSymbol("HEURISTIC"), makeSymbol("FUNCTION"), makeSymbol("SCALING-FACTOR"), makeSymbol("&KEY"), makeSymbol("PROBLEM"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list18 = list(makeKeyword("PROBLEM"), makeKeyword("DONE"));



    private static final SubLSymbol $sym20$TRANSFORMATION_TACTICIAN_PROBLEM_HEURISTIC_ = makeSymbol("TRANSFORMATION-TACTICIAN-PROBLEM-HEURISTIC?");

    private static final SubLSymbol DO_TRANSFORMATION_TACTICIAN_TACTIC_HEURISTICS = makeSymbol("DO-TRANSFORMATION-TACTICIAN-TACTIC-HEURISTICS");

    private static final SubLSymbol DO_TRANSFORMATION_TACTICIAN_PROBLEM_HEURISTICS = makeSymbol("DO-TRANSFORMATION-TACTICIAN-PROBLEM-HEURISTICS");

    private static final SubLSymbol TRANSFORMATION_TACTIC_P = makeSymbol("TRANSFORMATION-TACTIC-P");

    private static final SubLSymbol TRANSFORMATION_LINK_P = makeSymbol("TRANSFORMATION-LINK-P");

    private static final SubLSymbol LOGICAL_TACTIC_P = makeSymbol("LOGICAL-TACTIC-P");



    private static final SubLString $str27$___a_heuristic___a__s___a____a___ = makeString("  ~a heuristic: ~a ~s: ~a = ~a * ~a~%");



    private static final SubLString $str29$_S_is_not_a_transformation_strate = makeString("~S is not a transformation strategem");

    private static final SubLString $str30$Cannot_find_a_tactic_to_analyze_f = makeString("Cannot find a tactic to analyze for ~S");

    private static final SubLSymbol $sym31$ABS_ = makeSymbol("ABS>");



    public static SubLObject transformation_strategy_initialize(final SubLObject strategy) {
        final SubLObject transformation_index = inference_tactician.new_happiness_index();
        final SubLObject data = transformation_tactician_datastructures.new_transformation_strategy_data(transformation_index);
        inference_datastructures_strategy.set_strategy_data(strategy, data);
        return strategy;
    }

    public static SubLObject transformation_strategy_no_strategems_activeP(final SubLObject strategy) {
        final SubLObject transformation_index = transformation_tactician_datastructures.transformation_strategy_transformation_strategem_index(strategy);
        return inference_tactician.happiness_index_empty_p(transformation_index);
    }

    public static SubLObject transformation_strategy_peek_strategem(final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject transformation_index = transformation_tactician_datastructures.transformation_strategy_transformation_strategem_index(strategy);
        SubLObject best_strategem = NIL;
        while (NIL == best_strategem) {
            if (NIL != inference_tactician.happiness_index_empty_p(transformation_index)) {
                return NIL;
            }
            thread.resetMultipleValues();
            final SubLObject candidate_strategem = inference_tactician.happiness_index_peek(transformation_index);
            final SubLObject expected_happiness = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != inference_tactician.strategem_invalid_p(candidate_strategem)) {
                inference_tactician.happiness_index_next(transformation_index);
            } else {
                final SubLObject current_happiness = transformation_strategy_transformation_strategem_happiness(strategy, candidate_strategem);
                if ($inference_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                    format_nil.force_format(T, $str3$_a_happiness___a__a__a__, strategy, candidate_strategem, expected_happiness, current_happiness, NIL, NIL, NIL, NIL);
                }
                if (NIL != inference_tactician.happiness_L(current_happiness, expected_happiness)) {
                    inference_tactician.happiness_index_next(transformation_index);
                    inference_tactician.happiness_index_add(transformation_index, current_happiness, candidate_strategem);
                } else {
                    best_strategem = candidate_strategem;
                }
            }
        } 
        return best_strategem;
    }

    public static SubLObject transformation_strategy_shake_the_happy_box(final SubLObject strategy) {
        final SubLObject happiness_index = transformation_tactician_datastructures.transformation_strategy_transformation_strategem_index(strategy);
        SubLObject piled_all_over_the_floor = NIL;
        final SubLObject happiness_to_objects = aref(happiness_index, ZERO_INTEGER);
        final SubLObject greatest_happiness_index = aref(happiness_index, ONE_INTEGER);
        SubLObject cdolist_list_var = queues.p_queue_elements(greatest_happiness_index);
        SubLObject expected_happiness = NIL;
        expected_happiness = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject object_stack = gethash_without_values(expected_happiness, happiness_to_objects, UNPROVIDED);
            SubLObject cdolist_list_var_$1 = stacks.do_stack_elements_stack_elements(object_stack);
            SubLObject v_object = NIL;
            v_object = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                if (NIL == inference_tactician.strategem_invalid_p(v_object)) {
                    final SubLObject current_happiness = transformation_strategy_transformation_strategem_happiness(strategy, v_object);
                    piled_all_over_the_floor = cons(list(v_object, current_happiness), piled_all_over_the_floor);
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                v_object = cdolist_list_var_$1.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            expected_happiness = cdolist_list_var.first();
        } 
        inference_tactician.happiness_index_clear(happiness_index);
        SubLObject cdolist_list_var2 = piled_all_over_the_floor;
        SubLObject pair = NIL;
        pair = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject v_object2 = NIL;
            SubLObject happiness = NIL;
            destructuring_bind_must_consp(current, datum, $list4);
            v_object2 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list4);
            happiness = current.first();
            current = current.rest();
            if (NIL == current) {
                inference_tactician.happiness_index_add(happiness_index, happiness, v_object2);
            } else {
                cdestructuring_bind_error(datum, $list4);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            pair = cdolist_list_var2.first();
        } 
        return NIL;
    }

    public static SubLObject transformation_strategy_current_contents(final SubLObject strategy) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) : "transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) " + strategy;
        final SubLObject transformation_contents = inference_tactician.happiness_index_contents(transformation_tactician_datastructures.transformation_strategy_transformation_strategem_index(strategy));
        return transformation_contents;
    }

    public static SubLObject transformation_strategy_activate_strategem_low(final SubLObject strategy, final SubLObject transformation_strategem) {
        final SubLObject transformation_index = transformation_tactician_datastructures.transformation_strategy_transformation_strategem_index(strategy);
        final SubLObject happiness = transformation_strategy_transformation_strategem_happiness(strategy, transformation_strategem);
        inference_tactician.happiness_index_add(transformation_index, happiness, transformation_strategem);
        return T;
    }

    public static SubLObject transformation_strategy_pop_strategem(final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject transformation_index = transformation_tactician_datastructures.transformation_strategy_transformation_strategem_index(strategy);
        thread.resetMultipleValues();
        final SubLObject best_strategem = inference_tactician.happiness_index_next(transformation_index);
        final SubLObject expected_happiness = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return best_strategem;
    }

    public static SubLObject do_transformation_tactician_tactic_heuristics(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list8);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject heuristic = NIL;
        SubLObject function = NIL;
        SubLObject scaling_factor = NIL;
        destructuring_bind_must_consp(current, datum, $list8);
        heuristic = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list8);
        function = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list8);
        scaling_factor = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list8);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list8);
            if (NIL == member(current_$2, $list9, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list8);
        }
        final SubLObject tactic_tail = property_list_member($TACTIC, current);
        final SubLObject tactic = (NIL != tactic_tail) ? cadr(tactic_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(DO_STRATEGIC_HEURISTICS, list(heuristic, function, scaling_factor, $OBJECT, tactic, $DONE, done), listS(PWHEN, list($sym16$TRANSFORMATION_TACTICIAN_TACTIC_HEURISTIC_, heuristic), append(body, NIL)));
    }

    public static SubLObject do_transformation_tactician_problem_heuristics(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list17);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject heuristic = NIL;
        SubLObject function = NIL;
        SubLObject scaling_factor = NIL;
        destructuring_bind_must_consp(current, datum, $list17);
        heuristic = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list17);
        function = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list17);
        scaling_factor = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list17);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list17);
            if (NIL == member(current_$3, $list18, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list17);
        }
        final SubLObject problem_tail = property_list_member($PROBLEM, current);
        final SubLObject problem = (NIL != problem_tail) ? cadr(problem_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(DO_STRATEGIC_HEURISTICS, list(heuristic, function, scaling_factor, $OBJECT, problem, $DONE, done), listS(PWHEN, list($sym20$TRANSFORMATION_TACTICIAN_PROBLEM_HEURISTIC_, heuristic), append(body, NIL)));
    }

    public static SubLObject transformation_tactician_tactic_heuristicP(final SubLObject heuristic) {
        return set.set_memberP(heuristic, $transformation_tactician_tactic_heuristics$.getGlobalValue());
    }

    public static SubLObject transformation_tactician_problem_heuristicP(final SubLObject heuristic) {
        return set.set_memberP(heuristic, $transformation_tactician_problem_heuristics$.getGlobalValue());
    }

    public static SubLObject enable_transformation_tactician_tactic_heuristic(final SubLObject heuristic) {
        return NIL != transformation_tactician_tactic_heuristicP(heuristic) ? set.set_add(heuristic, $transformation_tactician_tactic_heuristics$.getGlobalValue()) : NIL;
    }

    public static SubLObject disable_transformation_tactician_tactic_heuristic(final SubLObject heuristic) {
        return NIL != transformation_tactician_tactic_heuristicP(heuristic) ? set.set_remove(heuristic, $transformation_tactician_tactic_heuristics$.getGlobalValue()) : NIL;
    }

    public static SubLObject enable_transformation_tactician_problem_heuristic(final SubLObject heuristic) {
        return NIL != transformation_tactician_problem_heuristicP(heuristic) ? set.set_add(heuristic, $transformation_tactician_problem_heuristics$.getGlobalValue()) : NIL;
    }

    public static SubLObject disable_transformation_tactician_problem_heuristic(final SubLObject heuristic) {
        return NIL != transformation_tactician_problem_heuristicP(heuristic) ? set.set_remove(heuristic, $transformation_tactician_problem_heuristics$.getGlobalValue()) : NIL;
    }

    public static SubLObject transformation_strategy_transformation_tactic_happiness(final SubLObject transformation_tactic, final SubLObject strategy) {
        assert NIL != inference_worker_transformation.transformation_tactic_p(transformation_tactic) : "inference_worker_transformation.transformation_tactic_p(transformation_tactic) " + "CommonSymbols.NIL != inference_worker_transformation.transformation_tactic_p(transformation_tactic) " + transformation_tactic;
        assert NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) : "transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) " + strategy;
        return transformation_strategy_generic_tactic_happiness(transformation_tactic, strategy);
    }

    public static SubLObject transformation_strategy_transformation_link_happiness(final SubLObject transformation_link, final SubLObject strategy) {
        assert NIL != inference_worker_transformation.transformation_link_p(transformation_link) : "inference_worker_transformation.transformation_link_p(transformation_link) " + "CommonSymbols.NIL != inference_worker_transformation.transformation_link_p(transformation_link) " + transformation_link;
        assert NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) : "transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) " + strategy;
        final SubLObject transformation_tactic = inference_worker_transformation.transformation_link_tactic(transformation_link);
        return transformation_strategy_transformation_tactic_happiness(transformation_tactic, strategy);
    }

    public static SubLObject transformation_strategy_logical_tactic_transformation_happiness(final SubLObject logical_tactic, final SubLObject strategy) {
        assert NIL != inference_worker.logical_tactic_p(logical_tactic) : "inference_worker.logical_tactic_p(logical_tactic) " + "CommonSymbols.NIL != inference_worker.logical_tactic_p(logical_tactic) " + logical_tactic;
        assert NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) : "transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) " + strategy;
        return transformation_strategy_generic_tactic_happiness(logical_tactic, strategy);
    }

    public static SubLObject transformation_strategy_generic_tactic_happiness(final SubLObject tactic, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_tactic.tactic_p(tactic) : "inference_datastructures_tactic.tactic_p(tactic) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) " + tactic;
        assert NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) : "transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) " + strategy;
        SubLObject aggregate_happiness = ZERO_INTEGER;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(inference_strategic_heuristics.strategic_heuristic_index())); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject heuristic = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject function = inference_strategic_heuristics.strategic_heuristic_function(heuristic);
            final SubLObject scaling_factor = inference_strategic_heuristics.strategic_heuristic_scaling_factor(heuristic);
            final SubLObject domain = inference_strategic_heuristics.strategic_heuristic_domain(heuristic);
            if ((NIL != inference_strategic_heuristics.do_strategic_heuristics_tactic_match_p(tactic, domain)) && (NIL != transformation_tactician_tactic_heuristicP(heuristic))) {
                final SubLObject scaled_happiness = transformation_strategy_compute_scaled_happiness_for_one_heuristic(strategy, heuristic, function, tactic, scaling_factor);
                aggregate_happiness = number_utilities.potentially_infinite_integer_plus(aggregate_happiness, scaled_happiness);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        SubLObject iteration_state2;
        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(inference_strategic_heuristics.strategic_heuristic_index())); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
            thread.resetMultipleValues();
            final SubLObject heuristic2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
            final SubLObject value2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject function2 = inference_strategic_heuristics.strategic_heuristic_function(heuristic2);
            final SubLObject scaling_factor2 = inference_strategic_heuristics.strategic_heuristic_scaling_factor(heuristic2);
            final SubLObject domain2 = inference_strategic_heuristics.strategic_heuristic_domain(heuristic2);
            if ((NIL != inference_strategic_heuristics.do_strategic_heuristics_tactic_match_p(NIL, domain2)) && (NIL != transformation_tactician_problem_heuristicP(heuristic2))) {
                final SubLObject scaled_happiness2 = transformation_strategy_compute_scaled_happiness_for_one_heuristic(strategy, heuristic2, function2, problem, scaling_factor2);
                aggregate_happiness = number_utilities.potentially_infinite_integer_plus(aggregate_happiness, scaled_happiness2);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
        return aggregate_happiness;
    }

    public static SubLObject transformation_strategy_compute_scaled_happiness_for_one_heuristic(final SubLObject strategy, final SubLObject heuristic, final SubLObject function, final SubLObject v_object, final SubLObject scaling_factor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject raw_happiness = funcall(function, strategy, v_object);
        final SubLObject scaled_happiness = number_utilities.potentially_infinite_integer_times(raw_happiness, scaling_factor);
        if ((!scaled_happiness.eql(ZERO_INTEGER)) && $inference_trace_level$.getDynamicValue(thread).numGE(THREE_INTEGER)) {
            format_nil.force_format(T, $str27$___a_heuristic___a__s___a____a___, strategy, v_object, heuristic, scaled_happiness, raw_happiness, scaling_factor, NIL, NIL);
        }
        return scaled_happiness;
    }

    public static SubLObject transformation_strategy_transformation_strategem_happiness(final SubLObject strategy, final SubLObject strategem) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) : "transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) " + strategy;
        assert NIL != inference_tactician.strategem_p(strategem) : "inference_tactician.strategem_p(strategem) " + "CommonSymbols.NIL != inference_tactician.strategem_p(strategem) " + strategem;
        if (NIL != inference_worker_transformation.transformation_tactic_p(strategem)) {
            return transformation_strategy_transformation_tactic_happiness(strategem, strategy);
        }
        if (NIL != inference_worker.logical_tactic_p(strategem)) {
            return transformation_strategy_logical_tactic_transformation_happiness(strategem, strategy);
        }
        if (NIL != inference_worker_transformation.transformation_link_p(strategem)) {
            return transformation_strategy_transformation_link_happiness(strategem, strategy);
        }
        return Errors.error($str29$_S_is_not_a_transformation_strate, strategem);
    }

    public static SubLObject transformation_strategy_happiness_table(final SubLObject strategy) {
        return transformation_tactician_datastructures.transformation_strategy_transformation_strategem_index(strategy);
    }

    public static SubLObject transformation_strategy_happiness_breakdown(final SubLObject strategy, final SubLObject strategem) {
        SubLObject tactic = NIL;
        if (NIL != inference_datastructures_tactic.tactic_p(strategem)) {
            tactic = strategem;
        } else
            if (NIL != inference_worker_transformation.transformation_link_p(strategem)) {
                tactic = inference_worker_transformation.transformation_link_tactic(strategem);
            } else {
                Errors.error($str30$Cannot_find_a_tactic_to_analyze_f, strategem);
            }

        final SubLObject tactic_table = inference_strategic_heuristics.strategic_heuristic_happiness_table(strategy, tactic, $transformation_tactician_tactic_heuristics$.getGlobalValue());
        final SubLObject problem_table = inference_strategic_heuristics.strategic_heuristic_happiness_table(strategy, inference_datastructures_tactic.tactic_problem(tactic), $transformation_tactician_problem_heuristics$.getGlobalValue());
        final SubLObject full_table = append(tactic_table, problem_table);
        return Sort.sort(full_table, $sym31$ABS_, symbol_function(FOURTH));
    }

    public static SubLObject declare_transformation_tactician_file() {
        declareFunction(me, "transformation_strategy_initialize", "TRANSFORMATION-STRATEGY-INITIALIZE", 1, 0, false);
        declareFunction(me, "transformation_strategy_no_strategems_activeP", "TRANSFORMATION-STRATEGY-NO-STRATEGEMS-ACTIVE?", 1, 0, false);
        declareFunction(me, "transformation_strategy_peek_strategem", "TRANSFORMATION-STRATEGY-PEEK-STRATEGEM", 1, 0, false);
        declareFunction(me, "transformation_strategy_shake_the_happy_box", "TRANSFORMATION-STRATEGY-SHAKE-THE-HAPPY-BOX", 1, 0, false);
        declareFunction(me, "transformation_strategy_current_contents", "TRANSFORMATION-STRATEGY-CURRENT-CONTENTS", 1, 0, false);
        declareFunction(me, "transformation_strategy_activate_strategem_low", "TRANSFORMATION-STRATEGY-ACTIVATE-STRATEGEM-LOW", 2, 0, false);
        declareFunction(me, "transformation_strategy_pop_strategem", "TRANSFORMATION-STRATEGY-POP-STRATEGEM", 1, 0, false);
        declareMacro(me, "do_transformation_tactician_tactic_heuristics", "DO-TRANSFORMATION-TACTICIAN-TACTIC-HEURISTICS");
        declareMacro(me, "do_transformation_tactician_problem_heuristics", "DO-TRANSFORMATION-TACTICIAN-PROBLEM-HEURISTICS");
        declareFunction(me, "transformation_tactician_tactic_heuristicP", "TRANSFORMATION-TACTICIAN-TACTIC-HEURISTIC?", 1, 0, false);
        declareFunction(me, "transformation_tactician_problem_heuristicP", "TRANSFORMATION-TACTICIAN-PROBLEM-HEURISTIC?", 1, 0, false);
        declareFunction(me, "enable_transformation_tactician_tactic_heuristic", "ENABLE-TRANSFORMATION-TACTICIAN-TACTIC-HEURISTIC", 1, 0, false);
        declareFunction(me, "disable_transformation_tactician_tactic_heuristic", "DISABLE-TRANSFORMATION-TACTICIAN-TACTIC-HEURISTIC", 1, 0, false);
        declareFunction(me, "enable_transformation_tactician_problem_heuristic", "ENABLE-TRANSFORMATION-TACTICIAN-PROBLEM-HEURISTIC", 1, 0, false);
        declareFunction(me, "disable_transformation_tactician_problem_heuristic", "DISABLE-TRANSFORMATION-TACTICIAN-PROBLEM-HEURISTIC", 1, 0, false);
        declareFunction(me, "transformation_strategy_transformation_tactic_happiness", "TRANSFORMATION-STRATEGY-TRANSFORMATION-TACTIC-HAPPINESS", 2, 0, false);
        declareFunction(me, "transformation_strategy_transformation_link_happiness", "TRANSFORMATION-STRATEGY-TRANSFORMATION-LINK-HAPPINESS", 2, 0, false);
        declareFunction(me, "transformation_strategy_logical_tactic_transformation_happiness", "TRANSFORMATION-STRATEGY-LOGICAL-TACTIC-TRANSFORMATION-HAPPINESS", 2, 0, false);
        declareFunction(me, "transformation_strategy_generic_tactic_happiness", "TRANSFORMATION-STRATEGY-GENERIC-TACTIC-HAPPINESS", 2, 0, false);
        declareFunction(me, "transformation_strategy_compute_scaled_happiness_for_one_heuristic", "TRANSFORMATION-STRATEGY-COMPUTE-SCALED-HAPPINESS-FOR-ONE-HEURISTIC", 5, 0, false);
        declareFunction(me, "transformation_strategy_transformation_strategem_happiness", "TRANSFORMATION-STRATEGY-TRANSFORMATION-STRATEGEM-HAPPINESS", 2, 0, false);
        declareFunction(me, "transformation_strategy_happiness_table", "TRANSFORMATION-STRATEGY-HAPPINESS-TABLE", 1, 0, false);
        declareFunction(me, "transformation_strategy_happiness_breakdown", "TRANSFORMATION-STRATEGY-HAPPINESS-BREAKDOWN", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_transformation_tactician_file() {
        deflexical("*TRANSFORMATION-TACTICIAN-TACTIC-HEURISTICS*", set_utilities.construct_set_from_list($list6, symbol_function(EQ), UNPROVIDED));
        deflexical("*TRANSFORMATION-TACTICIAN-PROBLEM-HEURISTICS*", set_utilities.construct_set_from_list($list7, symbol_function(EQ), UNPROVIDED));
        return NIL;
    }

    public static SubLObject setup_transformation_tactician_file() {
        inference_tactician.inference_strategy_type($TRANSFORMATION, $list1);
        note_funcall_helper_function(TRANSFORMATION_STRATEGY_INITIALIZE);
        register_macro_helper($sym16$TRANSFORMATION_TACTICIAN_TACTIC_HEURISTIC_, DO_TRANSFORMATION_TACTICIAN_TACTIC_HEURISTICS);
        register_macro_helper($sym20$TRANSFORMATION_TACTICIAN_PROBLEM_HEURISTIC_, DO_TRANSFORMATION_TACTICIAN_PROBLEM_HEURISTICS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_transformation_tactician_file();
    }

    @Override
    public void initializeVariables() {
        init_transformation_tactician_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_transformation_tactician_file();
    }

    
}

/**
 * Total time: 153 ms
 */
