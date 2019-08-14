/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.control_vars.$inference_trace_level$;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      NEW-ROOT-TACTICIAN
 * source file: /cyc/top/cycl/inference/harness/new-root-tactician.lisp
 * created:     2019/07/03 17:37:41
 */
public final class new_root_tactician extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new new_root_tactician();

 public static final String myName = "com.cyc.cycjava.cycl.inference.harness.new_root_tactician";


    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $new_root_heuristics_enabledP$ = makeSymbol("*NEW-ROOT-HEURISTICS-ENABLED?*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $new_root_tactician_heuristics$ = makeSymbol("*NEW-ROOT-TACTICIAN-HEURISTICS*");

    static private final SubLList $list1 = list(new SubLObject[]{ $NAME, makeString("The NEW-ROOT Tactician"), makeKeyword("COMMENT"), makeString("The NEW-ROOT Tactician needs no introduction."), makeKeyword("CONSTRUCTOR"), makeSymbol("NEW-ROOT-STRATEGY-INITIALIZE"), makeKeyword("DONE?"), makeSymbol("NEW-ROOT-STRATEGY-DONE?"), makeKeyword("DO-ONE-STEP"), makeSymbol("NEW-ROOT-STRATEGY-DO-ONE-STEP"), makeKeyword("POSSIBLY-ACTIVATE-PROBLEM"), makeSymbol("NEW-ROOT-STRATEGY-POSSIBLY-ACTIVATE-PROBLEM"), makeKeyword("SELECT-BEST-STRATEGEM"), makeSymbol("NEW-ROOT-STRATEGY-SELECT-BEST-STRATEGEM"), makeKeyword("EXECUTE-STRATEGEM"), makeSymbol("NEW-ROOT-STRATEGY-EXECUTE-STRATEGEM"), makeKeyword("QUIESCE"), makeSymbol("NEW-ROOT-STRATEGY-QUIESCE"), makeKeyword("PROBLEM-NOTHING-TO-DO?"), makeSymbol("NEW-ROOT-STRATEGY-NOTHING-TO-DO?"), makeKeyword("HAPPINESS-TABLE"), makeSymbol("NEW-ROOT-STRATEGY-HAPPINESS-TABLE"), makeKeyword("PEEK-NEXT-STRATEGEM"), makeSymbol("NEW-ROOT-STRATEGY-PEEK-NEXT-STRATEGEM"), makeKeyword("ACTIVATE-STRATEGEM"), makeSymbol("NEW-ROOT-STRATEGY-ADD-NEW-ROOT"), makeKeyword("MOTIVATE-STRATEGEM"), makeSymbol("NEW-ROOT-STRATEGY-POSSIBLY-PROPAGATE-MOTIVATION-TO-PROBLEM"), makeKeyword("RECONSIDER-SET-ASIDES"), makeSymbol("ZERO"), makeKeyword("THROW-AWAY-UNINTERESTING-SET-ASIDES"), makeSymbol("ZERO"), makeKeyword("NEW-ARGUMENT-LINK"), makeSymbol("IGNORE"), makeKeyword("NEW-TACTIC"), makeSymbol("IGNORE"), makeKeyword("RELEVANT-TACTICS-WRT-REMOVAL"), makeSymbol("ERROR"), makeKeyword("SPLIT-TACTICS-POSSIBLE"), makeSymbol("IGNORE"), makeKeyword("PROBLEM-COULD-BE-PENDING"), makeSymbol("IGNORE"), makeKeyword("THROW-AWAY-PROBLEM"), makeSymbol("FALSE"), makeKeyword("SET-ASIDE-PROBLEM"), makeSymbol("FALSE"), makeKeyword("THROW-AWAY-TACTIC"), makeSymbol("FALSE"), makeKeyword("SET-ASIDE-TACTIC"), makeSymbol("FALSE"), makeKeyword("LINK-HEAD-MOTIVATED?"), makeSymbol("FALSE") });

    static private final SubLList $list_alt1 = list(new SubLObject[]{ $NAME, makeString("The NEW-ROOT Tactician"), makeKeyword("COMMENT"), makeString("The NEW-ROOT Tactician needs no introduction."), makeKeyword("CONSTRUCTOR"), makeSymbol("NEW-ROOT-STRATEGY-INITIALIZE"), makeKeyword("DONE?"), makeSymbol("NEW-ROOT-STRATEGY-DONE?"), makeKeyword("DO-ONE-STEP"), makeSymbol("NEW-ROOT-STRATEGY-DO-ONE-STEP"), makeKeyword("POSSIBLY-ACTIVATE-PROBLEM"), makeSymbol("NEW-ROOT-STRATEGY-POSSIBLY-ACTIVATE-PROBLEM"), makeKeyword("SELECT-BEST-STRATEGEM"), makeSymbol("NEW-ROOT-STRATEGY-SELECT-BEST-STRATEGEM"), makeKeyword("QUIESCE"), makeSymbol("NEW-ROOT-STRATEGY-QUIESCE"), makeKeyword("PEEK-NEXT-STRATEGEM"), makeSymbol("NEW-ROOT-STRATEGY-PEEK-NEXT-STRATEGEM"), makeKeyword("ACTIVATE-STRATEGEM"), makeSymbol("NEW-ROOT-STRATEGY-ADD-NEW-ROOT"), makeKeyword("MOTIVATE-STRATEGEM"), makeSymbol("NEW-ROOT-STRATEGY-POSSIBLY-PROPAGATE-MOTIVATION-TO-PROBLEM"), makeKeyword("RECONSIDER-SET-ASIDES"), makeSymbol("ZERO"), makeKeyword("THROW-AWAY-UNINTERESTING-SET-ASIDES"), makeSymbol("ZERO"), makeKeyword("NEW-ARGUMENT-LINK"), makeSymbol("IGNORE"), makeKeyword("NEW-TACTIC"), makeSymbol("IGNORE"), makeKeyword("RELEVANT-TACTICS-WRT-REMOVAL"), makeSymbol("ERROR"), makeKeyword("SPLIT-TACTICS-POSSIBLE"), makeSymbol("IGNORE"), makeKeyword("PROBLEM-COULD-BE-PENDING"), makeSymbol("IGNORE"), makeKeyword("PROBLEM-NOTHING-TO-DO?"), makeSymbol("FALSE"), makeKeyword("THROW-AWAY-TACTIC"), makeSymbol("FALSE"), makeKeyword("SET-ASIDE-TACTIC"), makeSymbol("FALSE"), makeKeyword("LINK-HEAD-MOTIVATED?"), makeSymbol("FALSE") });

    private static final SubLSymbol NEW_ROOT_STRATEGY_INITIALIZE = makeSymbol("NEW-ROOT-STRATEGY-INITIALIZE");

    private static final SubLSymbol NEW_ROOT_STRATEGY_P = makeSymbol("NEW-ROOT-STRATEGY-P");

    private static final SubLString $str4$_a_happiness___a__a__a__ = makeString("~a happiness: ~a ~a ~a~%");

    private static final SubLList $list6 = list(makeKeyword("RELEVANT-TERM"), makeKeyword("LITERAL-COUNT"), makeKeyword("SKOLEM-COUNT"), makeKeyword("SHALLOW-AND-CHEAP"), makeKeyword("OCCAMS-RAZOR"), makeKeyword("PROBLEM-RULE-HISTORICAL-UTILITY"), makeKeyword("PROBLEM-RULE-A-PRIORI-UTILITY"));

    private static final SubLList $list7 = list(list(makeSymbol("HEURISTIC"), makeSymbol("FUNCTION"), makeSymbol("SCALING-FACTOR"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list8 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol DO_STRATEGIC_HEURISTICS = makeSymbol("DO-STRATEGIC-HEURISTICS");

    private static final SubLSymbol $sym13$NEW_ROOT_TACTICIAN_STRATEGIC_HEURISTIC_ = makeSymbol("NEW-ROOT-TACTICIAN-STRATEGIC-HEURISTIC?");

    private static final SubLSymbol DO_NEW_ROOT_TACTICIAN_STRATEGIC_HEURISTICS = makeSymbol("DO-NEW-ROOT-TACTICIAN-STRATEGIC-HEURISTICS");

    private static final SubLString $str15$___a_heuristic___a__s___a____a___ = makeString("  ~a heuristic: ~a ~s: ~a = ~a * ~a~%");

    private static final SubLSymbol $sym16$ABS_ = makeSymbol("ABS>");

    // Definitions
    public static final SubLObject new_root_strategy_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_strategy.strategy_p(v_object)) && ($NEW_ROOT == inference_datastructures_strategy.strategy_type(v_object)));
    }

    // Definitions
    public static SubLObject new_root_strategy_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_strategy.strategy_p(v_object)) && ($NEW_ROOT == inference_datastructures_strategy.strategy_type(v_object)));
    }

    public static final SubLObject new_root_strategy_initialize_alt(SubLObject strategy) {
        {
            SubLObject new_root_index = queues.create_queue();
            SubLObject data = new_root_tactician_datastructures.new_new_root_strategy_data(new_root_index);
            inference_datastructures_strategy.set_strategy_data(strategy, data);
        }
        return strategy;
    }

    public static SubLObject new_root_strategy_initialize(final SubLObject strategy) {
        final SubLObject new_root_index = inference_tactician.new_happiness_index();
        final SubLObject data = new_root_tactician_datastructures.new_new_root_strategy_data(new_root_index);
        inference_datastructures_strategy.set_strategy_data(strategy, data);
        return strategy;
    }

    public static final SubLObject new_root_strategy_current_contents_alt(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, NEW_ROOT_STRATEGY_P);
        return queues.queue_elements(new_root_tactician_datastructures.new_root_strategy_new_root_index(strategy));
    }

    public static SubLObject new_root_strategy_current_contents(final SubLObject strategy) {
        assert NIL != new_root_strategy_p(strategy) : "! new_root_tactician.new_root_strategy_p(strategy) " + ("new_root_tactician.new_root_strategy_p(strategy) " + "CommonSymbols.NIL != new_root_tactician.new_root_strategy_p(strategy) ") + strategy;
        return inference_tactician.happiness_index_contents(new_root_tactician_datastructures.new_root_strategy_new_root_index(strategy));
    }

    public static SubLObject new_root_strategy_peek_new_root(final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_root_index = new_root_tactician_datastructures.new_root_strategy_new_root_index(strategy);
        SubLObject best_problem = NIL;
        while (NIL == best_problem) {
            if (NIL != inference_tactician.happiness_index_empty_p(new_root_index)) {
                return NIL;
            }
            thread.resetMultipleValues();
            final SubLObject candidate_problem = inference_tactician.happiness_index_peek(new_root_index);
            final SubLObject expected_happiness = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != inference_datastructures_problem.problem_invalid_p(candidate_problem)) {
                inference_tactician.happiness_index_next(new_root_index);
            } else {
                final SubLObject current_happiness = new_root_strategy_new_root_happiness(candidate_problem, strategy);
                if ($inference_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                    format_nil.force_format(T, $str4$_a_happiness___a__a__a__, strategy, candidate_problem, expected_happiness, current_happiness, NIL, NIL, NIL, NIL);
                }
                if (NIL != inference_tactician.happiness_L(current_happiness, expected_happiness)) {
                    inference_tactician.happiness_index_next(new_root_index);
                    inference_tactician.happiness_index_add(new_root_index, current_happiness, candidate_problem);
                } else {
                    best_problem = candidate_problem;
                }
            }
        } 
        return best_problem;
    }

    public static SubLObject new_root_strategy_add_new_root(final SubLObject strategy, final SubLObject problem) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : "! inference_datastructures_problem.problem_p(problem) " + ("inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) ") + problem;
        final SubLObject new_root_index = new_root_tactician_datastructures.new_root_strategy_new_root_index(strategy);
        final SubLObject happiness = new_root_strategy_new_root_happiness(problem, strategy);
        inference_tactician.happiness_index_add(new_root_index, happiness, problem);
        inference_datastructures_strategy.strategy_note_problem_active(strategy, problem);
        return T;
    }

    public static SubLObject new_root_tactician_heuristics() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != $new_root_heuristics_enabledP$.getDynamicValue(thread) ? $new_root_tactician_heuristics$.getGlobalValue() : set_utilities.$empty_set$.getGlobalValue();
    }

    public static SubLObject do_new_root_tactician_strategic_heuristics(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject heuristic = NIL;
        SubLObject function = NIL;
        SubLObject scaling_factor = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        heuristic = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        function = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        scaling_factor = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list7);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list7);
            if (NIL == member(current_$1, $list8, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list7);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(DO_STRATEGIC_HEURISTICS, list(heuristic, function, scaling_factor, $DONE, done), listS(PWHEN, list($sym13$NEW_ROOT_TACTICIAN_STRATEGIC_HEURISTIC_, heuristic), append(body, NIL)));
    }

    public static SubLObject new_root_tactician_strategic_heuristicP(final SubLObject heuristic) {
        return set.set_memberP(heuristic, new_root_tactician_heuristics());
    }

    public static SubLObject enable_new_root_tactician_strategic_heuristic(final SubLObject heuristic) {
        return NIL != new_root_tactician_strategic_heuristicP(heuristic) ? set.set_add(heuristic, $new_root_tactician_heuristics$.getGlobalValue()) : NIL;
    }

    public static SubLObject disable_new_root_tactician_strategic_heuristic(final SubLObject heuristic) {
        return NIL != new_root_tactician_strategic_heuristicP(heuristic) ? set.set_remove(heuristic, $new_root_tactician_heuristics$.getGlobalValue()) : NIL;
    }

    public static SubLObject new_root_strategy_new_root_happiness(final SubLObject new_root, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_problem.problem_p(new_root) : "! inference_datastructures_problem.problem_p(new_root) " + ("inference_datastructures_problem.problem_p(new_root) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(new_root) ") + new_root;
        assert NIL != new_root_strategy_p(strategy) : "! new_root_tactician.new_root_strategy_p(strategy) " + ("new_root_tactician.new_root_strategy_p(strategy) " + "CommonSymbols.NIL != new_root_tactician.new_root_strategy_p(strategy) ") + strategy;
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
            if ((NIL != inference_strategic_heuristics.do_strategic_heuristics_tactic_match_p(NIL, domain)) && (NIL != new_root_tactician_strategic_heuristicP(heuristic))) {
                final SubLObject raw_happiness = funcall(function, strategy, new_root);
                final SubLObject scaled_happiness = number_utilities.potentially_infinite_integer_times(raw_happiness, scaling_factor);
                if ((!scaled_happiness.eql(ZERO_INTEGER)) && $inference_trace_level$.getDynamicValue(thread).numGE(THREE_INTEGER)) {
                    format_nil.force_format(T, $str15$___a_heuristic___a__s___a____a___, strategy, new_root, heuristic, scaled_happiness, raw_happiness, scaling_factor, NIL, NIL);
                }
                aggregate_happiness = number_utilities.potentially_infinite_integer_plus(aggregate_happiness, scaled_happiness);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return aggregate_happiness;
    }

    public static SubLObject new_root_strategy_happiness_table(final SubLObject strategy) {
        return new_root_tactician_datastructures.new_root_strategy_new_root_index(strategy);
    }

    public static SubLObject new_root_strategy_happiness_breakdown(final SubLObject strategy, final SubLObject new_root) {
        return Sort.sort(copy_list(inference_strategic_heuristics.strategic_heuristic_happiness_table(strategy, new_root, new_root_tactician_heuristics())), $sym16$ABS_, symbol_function(FOURTH));
    }

    public static SubLObject declare_new_root_tactician_file() {
        declareFunction("new_root_strategy_p", "NEW-ROOT-STRATEGY-P", 1, 0, false);
        declareFunction("new_root_strategy_initialize", "NEW-ROOT-STRATEGY-INITIALIZE", 1, 0, false);
        declareFunction("new_root_strategy_current_contents", "NEW-ROOT-STRATEGY-CURRENT-CONTENTS", 1, 0, false);
        declareFunction("new_root_strategy_peek_new_root", "NEW-ROOT-STRATEGY-PEEK-NEW-ROOT", 1, 0, false);
        declareFunction("new_root_strategy_add_new_root", "NEW-ROOT-STRATEGY-ADD-NEW-ROOT", 2, 0, false);
        declareFunction("new_root_tactician_heuristics", "NEW-ROOT-TACTICIAN-HEURISTICS", 0, 0, false);
        declareMacro("do_new_root_tactician_strategic_heuristics", "DO-NEW-ROOT-TACTICIAN-STRATEGIC-HEURISTICS");
        declareFunction("new_root_tactician_strategic_heuristicP", "NEW-ROOT-TACTICIAN-STRATEGIC-HEURISTIC?", 1, 0, false);
        declareFunction("enable_new_root_tactician_strategic_heuristic", "ENABLE-NEW-ROOT-TACTICIAN-STRATEGIC-HEURISTIC", 1, 0, false);
        declareFunction("disable_new_root_tactician_strategic_heuristic", "DISABLE-NEW-ROOT-TACTICIAN-STRATEGIC-HEURISTIC", 1, 0, false);
        declareFunction("new_root_strategy_new_root_happiness", "NEW-ROOT-STRATEGY-NEW-ROOT-HAPPINESS", 2, 0, false);
        declareFunction("new_root_strategy_happiness_table", "NEW-ROOT-STRATEGY-HAPPINESS-TABLE", 1, 0, false);
        declareFunction("new_root_strategy_happiness_breakdown", "NEW-ROOT-STRATEGY-HAPPINESS-BREAKDOWN", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_new_root_tactician_file() {
        defparameter("*NEW-ROOT-HEURISTICS-ENABLED?*", NIL);
        deflexical("*NEW-ROOT-TACTICIAN-HEURISTICS*", set_utilities.construct_set_from_list($list6, symbol_function(EQ), UNPROVIDED));
        return NIL;
    }

    public static SubLObject setup_new_root_tactician_file() {
        inference_tactician.inference_strategy_type($NEW_ROOT, $list1);
        note_funcall_helper_function(NEW_ROOT_STRATEGY_INITIALIZE);
        register_macro_helper($sym13$NEW_ROOT_TACTICIAN_STRATEGIC_HEURISTIC_, DO_NEW_ROOT_TACTICIAN_STRATEGIC_HEURISTICS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_new_root_tactician_file();
    }

    @Override
    public void initializeVariables() {
        init_new_root_tactician_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_new_root_tactician_file();
    }

    static {
    }
}

/**
 * Total time: 65 ms
 */
