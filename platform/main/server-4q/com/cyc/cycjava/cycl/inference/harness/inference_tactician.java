/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.inference.harness.inference_worker_answer.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
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
 * module:      INFERENCE-TACTICIAN
 * source file: /cyc/top/cycl/inference/harness/inference-tactician.lisp
 * created:     2019/07/03 17:37:40
 */
public final class inference_tactician extends SubLTranslatedFile implements V12 {
    public static final SubLObject problem_happiness_index_peek(SubLObject happiness_index) {
        {
            SubLObject v_object = NIL;
            SubLObject expected_happiness = NIL;
            SubLObject happiness_to_objects = aref(happiness_index, ZERO_INTEGER);
            SubLObject greatest_happiness_index = aref(happiness_index, ONE_INTEGER);
            SubLObject greatest_happiness = queues.p_queue_best(greatest_happiness_index);
            SubLObject object_stack = gethash_without_values(greatest_happiness, happiness_to_objects, $ERROR);
            if ($ERROR == object_stack) {
                Errors.error($str_alt56$No_object_stack_for_happiness__S, greatest_happiness);
            } else {
                if (NIL != stacks.stack_empty_p(object_stack)) {
                    Errors.error($str_alt57$No_objects_for_happiness__S, greatest_happiness);
                } else {
                    v_object = stacks.stack_peek(object_stack);
                    expected_happiness = greatest_happiness;
                }
            }
            return values(v_object, expected_happiness);
        }
    }

    public static final SubLObject problem_happiness_index_p(SubLObject v_object) {
        return makeBoolean(((v_object.isVector() && TWO_INTEGER.numE(length(v_object))) && aref(v_object, ZERO_INTEGER).isHashtable()) && (NIL != queues.priority_queue_p(aref(v_object, ONE_INTEGER))));
    }

    public static final SubLObject problem_happiness_index_next(SubLObject happiness_index) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_object = NIL;
                SubLObject expected_happiness = NIL;
                SubLObject happiness_to_objects = aref(happiness_index, ZERO_INTEGER);
                SubLObject greatest_happiness_index = aref(happiness_index, ONE_INTEGER);
                SubLObject greatest_happiness = queues.p_queue_best(greatest_happiness_index);
                SubLObject object_stack = gethash_without_values(greatest_happiness, happiness_to_objects, $ERROR);
                if ($ERROR == object_stack) {
                    Errors.error($str_alt56$No_object_stack_for_happiness__S, greatest_happiness);
                } else {
                    if (NIL != stacks.stack_empty_p(object_stack)) {
                        Errors.error($str_alt57$No_objects_for_happiness__S, greatest_happiness);
                    } else {
                        v_object = stacks.stack_pop(object_stack);
                        expected_happiness = greatest_happiness;
                        if (NIL != stacks.stack_empty_p(object_stack)) {
                            {
                                SubLObject removed_happiness = queues.p_dequeue(greatest_happiness_index, UNPROVIDED);
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == com.cyc.cycjava.cycl.inference.harness.inference_tactician.happiness_E(removed_happiness, greatest_happiness)) {
                                        Errors.error($str_alt58$Removed__S_but__S_was_lowest_happ, removed_happiness, greatest_happiness);
                                    }
                                }
                            }
                        }
                    }
                }
                return values(v_object, expected_happiness);
            }
        }
    }

    public static final SubLObject problem_happiness_index_empty_p(SubLObject happiness_index) {
        {
            SubLObject greatest_happiness_index = aref(happiness_index, ONE_INTEGER);
            return queues.p_queue_empty_p(greatest_happiness_index);
        }
    }

    public static final SubLObject problem_happiness_index_contents(SubLObject happiness_index) {
        SubLTrampolineFile.checkType(happiness_index, PROBLEM_HAPPINESS_INDEX_P);
        {
            SubLObject happiness_to_objects = aref(happiness_index, ZERO_INTEGER);
            SubLObject greatest_happiness_index = aref(happiness_index, ONE_INTEGER);
            SubLObject happiness_contents = NIL;
            SubLObject cdolist_list_var = queues.p_queue_elements(greatest_happiness_index);
            SubLObject happiness = NIL;
            for (happiness = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , happiness = cdolist_list_var.first()) {
                {
                    SubLObject object_stack = gethash_without_values(happiness, happiness_to_objects, $ERROR);
                    SubLObject objects = NIL;
                    SubLObject cdolist_list_var_17 = stacks.do_stack_elements_stack_elements(object_stack);
                    SubLObject v_object = NIL;
                    for (v_object = cdolist_list_var_17.first(); NIL != cdolist_list_var_17; cdolist_list_var_17 = cdolist_list_var_17.rest() , v_object = cdolist_list_var_17.first()) {
                        objects = cons(v_object, objects);
                    }
                    objects = nreverse(objects);
                    happiness_contents = cons(list(happiness, objects), happiness_contents);
                }
            }
            happiness_contents = nreverse(happiness_contents);
            return happiness_contents;
        }
    }

    public static final SubLObject problem_happiness_index_add(SubLObject happiness_index, SubLObject happiness, SubLObject v_object) {
        SubLTrampolineFile.checkType(happiness, HAPPINESS_P);
        {
            SubLObject happiness_to_objects = aref(happiness_index, ZERO_INTEGER);
            SubLObject object_stack = gethash_without_values(happiness, happiness_to_objects, NIL);
            if (NIL == object_stack) {
                object_stack = stacks.create_stack();
                sethash(happiness, happiness_to_objects, object_stack);
            }
            if (NIL != stacks.stack_empty_p(object_stack)) {
                {
                    SubLObject greatest_happiness_index = aref(happiness_index, ONE_INTEGER);
                    queues.p_enqueue(happiness, greatest_happiness_index);
                }
            }
            stacks.stack_push(v_object, object_stack);
        }
        return happiness_index;
    }

    public static final SubLObject new_problem_happiness_index() {
        {
            SubLObject happiness_to_objects = make_hash_table(ZERO_INTEGER, symbol_function(EQL), UNPROVIDED);
            SubLObject greatest_happiness_index = queues.create_p_queue(NIL, symbol_function(IDENTITY), $sym53$HAPPINESS__);
            return vector(new SubLObject[]{ happiness_to_objects, greatest_happiness_index });
        }
    }

    /**
     * Whether :set-aside plus non-continuable should be strengthened to :throw-away
     */
    // defparameter
    @LispMethod(comment = "Whether :set-aside plus non-continuable should be strengthened to :throw-away\ndefparameter")
    public static final SubLSymbol $set_aside_non_continuable_implies_throw_awayP$ = makeSymbol("*SET-ASIDE-NON-CONTINUABLE-IMPLIES-THROW-AWAY?*");

    public static final SubLFile me = new inference_tactician();

 public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_tactician";


    // defparameter
    // Useful for testing problem-store-pruning.
    /**
     * Useful for testing problem-store-pruning.
     */
    @LispMethod(comment = "Useful for testing problem-store-pruning.\ndefparameter")
    private static final SubLSymbol $strategy_auto_prune_threshold$ = makeSymbol("*STRATEGY-AUTO-PRUNE-THRESHOLD*");

    // defvar
    @LispMethod(comment = "defvar")
    private static final SubLSymbol $strategy_auto_prune_step_count$ = makeSymbol("*STRATEGY-AUTO-PRUNE-STEP-COUNT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $strategy_sort_strategy$ = makeSymbol("*STRATEGY-SORT-STRATEGY*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $strategy_sort_predicate$ = makeSymbol("*STRATEGY-SORT-PREDICATE*");

    // deflexical
    /**
     * The total productivity threshold below or equal to which we don't bother
     * looking for anything better, and quit early.
     */
    @LispMethod(comment = "The total productivity threshold below or equal to which we don\'t bother\r\nlooking for anything better, and quit early.\ndeflexical\nThe total productivity threshold below or equal to which we don\'t bother\nlooking for anything better, and quit early.")
    private static final SubLSymbol $sufficiently_good_tactic_productivity_threshold$ = makeSymbol("*SUFFICIENTLY-GOOD-TACTIC-PRODUCTIVITY-THRESHOLD*");

    // defvar
    @LispMethod(comment = "defvar")
    private static final SubLSymbol $default_early_removal_productivity_limit$ = makeSymbol("*DEFAULT-EARLY-REMOVAL-PRODUCTIVITY-LIMIT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $set_aside_non_continuable_implies_throw_away_for_removalP$ = makeSymbol("*SET-ASIDE-NON-CONTINUABLE-IMPLIES-THROW-AWAY-FOR-REMOVAL?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $set_aside_non_continuable_implies_throw_away_for_transformationP$ = makeSymbol("*SET-ASIDE-NON-CONTINUABLE-IMPLIES-THROW-AWAY-FOR-TRANSFORMATION?*");

    // defvar
    @LispMethod(comment = "defvar")
    private static final SubLSymbol $better_term_chosen_handlingP$ = makeSymbol("*BETTER-TERM-CHOSEN-HANDLING?*");

    // defvar
    // Temporary control parameter, not ready yet, should stay NIL for now
    /**
     * Temporary control parameter, not ready yet, should stay NIL for now
     */
    @LispMethod(comment = "Temporary control parameter, not ready yet, should stay NIL for now\ndefvar")
    private static final SubLSymbol $better_backchain_forbidden_when_unbound_in_arg_handlingP$ = makeSymbol("*BETTER-BACKCHAIN-FORBIDDEN-WHEN-UNBOUND-IN-ARG-HANDLING?*");

    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLSymbol $DO_ONE_STEP = makeKeyword("DO-ONE-STEP");

    private static final SubLSymbol $POSSIBLY_ACTIVATE_PROBLEM = makeKeyword("POSSIBLY-ACTIVATE-PROBLEM");

    private static final SubLSymbol $NEW_ARGUMENT_LINK = makeKeyword("NEW-ARGUMENT-LINK");

    private static final SubLSymbol STRATEGY_P = makeSymbol("STRATEGY-P");

    static private final SubLSymbol $sym5$STRATEGY_SORT_PREDICATE_ = makeSymbol("STRATEGY-SORT-PREDICATE?");

    static private final SubLSymbol $sym6$TACTIC_STRATEGIC_PRODUCTIVITY__ = makeSymbol("TACTIC-STRATEGIC-PRODUCTIVITY-<");

    static private final SubLSymbol $sym7$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_ = makeSymbol("LOGICAL-TACTIC-BETTER-WRT-REMOVAL?");

    static private final SubLList $list9 = list(list(makeSymbol("TACTIC-VAR"), makeSymbol("PROBLEM"), makeSymbol("STRATEGIC-CONTEXT"), makeSymbol("&KEY"), makeSymbol("STATUS"), makeSymbol("HL-MODULE"), makeSymbol("TYPE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list10 = list(makeKeyword("STATUS"), makeKeyword("HL-MODULE"), $TYPE, $DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol DO_PROBLEM_TACTICS = makeSymbol("DO-PROBLEM-TACTICS");

    static private final SubLSymbol $sym21$PROBLEM_VAR = makeUninternedSymbol("PROBLEM-VAR");

    static private final SubLSymbol $sym22$TYPE_VAR = makeUninternedSymbol("TYPE-VAR");

    static private final SubLSymbol $sym23$SUBSUMING_JOIN_ORDERED_TACTICS = makeUninternedSymbol("SUBSUMING-JOIN-ORDERED-TACTICS");

    static private final SubLSymbol $sym25$PROBLEM_MAXIMAL_SUBSUMING_MULTI_FOCAL_LITERAL_JOIN_ORDERED_TACTIC = makeSymbol("PROBLEM-MAXIMAL-SUBSUMING-MULTI-FOCAL-LITERAL-JOIN-ORDERED-TACTICS");

    static private final SubLSymbol $sym27$SOME_SUBSUMING_JOIN_ORDERED_TACTIC_ = makeSymbol("SOME-SUBSUMING-JOIN-ORDERED-TACTIC?");

    private static final SubLSymbol DO_PROBLEM_UNSUBSUMED_CONNECTED_CONJUNCTION_TACTICS = makeSymbol("DO-PROBLEM-UNSUBSUMED-CONNECTED-CONJUNCTION-TACTICS");

    static private final SubLSymbol $sym31$JOIN_ORDERED_TACTIC_SUBSUMES_ = makeSymbol("JOIN-ORDERED-TACTIC-SUBSUMES?");

    static private final SubLSymbol $sym33$TACTIC_PRODUCTIVITY_AND_COMPLETENESS_WORSE_ = makeSymbol("TACTIC-PRODUCTIVITY-AND-COMPLETENESS-WORSE?");

    static private final SubLSymbol $sym34$TACTIC_PRODUCTIVITY_AND_COMPLETENESS_SUFFICIENTLY_GOOD_ = makeSymbol("TACTIC-PRODUCTIVITY-AND-COMPLETENESS-SUFFICIENTLY-GOOD?");

    static private final SubLSymbol $sym36$TACTIC_PRODUCTIVITY_LOWER_ = makeSymbol("TACTIC-PRODUCTIVITY-LOWER?");

    static private final SubLSymbol $sym37$TACTIC_PRODUCTIVITY_HIGHER_ = makeSymbol("TACTIC-PRODUCTIVITY-HIGHER?");

    static private final SubLSymbol $sym38$TACTIC_PRODUCTIVITY_SUFFICIENTLY_GOOD_ = makeSymbol("TACTIC-PRODUCTIVITY-SUFFICIENTLY-GOOD?");

    private static final SubLSymbol $EARLY_REMOVAL_PRODUCTIVITY_LIMIT = makeKeyword("EARLY-REMOVAL-PRODUCTIVITY-LIMIT");

    private static final SubLString $str42$_a_execute_strategem___a__ = makeString("~a execute-strategem: ~a~%");

    private static final SubLSymbol $THROW_AWAY_UNINTERESTING_SET_ASIDES = makeKeyword("THROW-AWAY-UNINTERESTING-SET-ASIDES");

    private static final SubLSymbol $kw46$CONTINUATION_POSSIBLE_ = makeKeyword("CONTINUATION-POSSIBLE?");

    private static final SubLList $list48 = list(makeSymbol("MT"), makeSymbol("ASENT"));



    private static final SubLString $str54$Unexpected_strategem_type__s = makeString("Unexpected strategem type ~s");

    private static final SubLString $str55$Unexpected_strategem_ype__s = makeString("Unexpected strategem ype ~s");

    private static final SubLString $str56$unexpected_strategem___S = makeString("unexpected strategem: ~S");

    private static final SubLList $list57 = list(makeSymbol("TACTIC"), makeSymbol("PROBLEM-LINK"), makeSymbol("PROBLEM"));

    private static final SubLSymbol TYPE_OF = makeSymbol("TYPE-OF");

    private static final SubLSymbol $sym60$HAPPINESS__ = makeSymbol("HAPPINESS->");

    private static final SubLSymbol HAPPINESS_P = makeSymbol("HAPPINESS-P");

    private static final SubLString $str63$No_object_stack_for_happiness__S = makeString("No object-stack for happiness ~S");

    private static final SubLString $str64$No_objects_for_happiness__S = makeString("No objects for happiness ~S");

    private static final SubLString $str65$Removed__S_but__S_was_lowest_happ = makeString("Removed ~S but ~S was lowest happiness");

    private static final SubLSymbol HAPPINESS_INDEX_P = makeSymbol("HAPPINESS-INDEX-P");

    private static final SubLSymbol DEFAULT_STRATEGY_INITIALIZE_PROPERTIES = makeSymbol("DEFAULT-STRATEGY-INITIALIZE-PROPERTIES");

    private static final SubLSymbol DEFAULT_STRATEGY_UPDATE_PROPERTIES = makeSymbol("DEFAULT-STRATEGY-UPDATE-PROPERTIES");

    private static final SubLSymbol $INFERENCE_DYNAMIC_PROPERTIES_UPDATED = makeKeyword("INFERENCE-DYNAMIC-PROPERTIES-UPDATED");

    private static final SubLSymbol DEFAULT_STRATEGY_NOTE_INFERENCE_DYNAMIC_PROPERTIES_UPDATED = makeSymbol("DEFAULT-STRATEGY-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED");

    private static final SubLSymbol $INITIAL_RELEVANT_STRATEGIES = makeKeyword("INITIAL-RELEVANT-STRATEGIES");

    private static final SubLSymbol $SPLIT_TACTICS_POSSIBLE = makeKeyword("SPLIT-TACTICS-POSSIBLE");

    private static final SubLSymbol $kw77$PROBLEM_NOTHING_TO_DO_ = makeKeyword("PROBLEM-NOTHING-TO-DO?");

    private static final SubLSymbol $PROBLEM_COULD_BE_PENDING = makeKeyword("PROBLEM-COULD-BE-PENDING");

    private static final SubLSymbol $RECONSIDER_SET_ASIDES = makeKeyword("RECONSIDER-SET-ASIDES");

    private static final SubLSymbol $PEEK_NEXT_STRATEGEM = makeKeyword("PEEK-NEXT-STRATEGEM");

    private static final SubLSymbol $kw84$LINK_HEAD_MOTIVATED_ = makeKeyword("LINK-HEAD-MOTIVATED?");

    private static final SubLSymbol SPLIT_TACTIC_P = makeSymbol("SPLIT-TACTIC-P");

    private static final SubLSymbol $RECONSIDER_SPLIT_SET_ASIDES = makeKeyword("RECONSIDER-SPLIT-SET-ASIDES");

    // Definitions
    public static final SubLObject strategy_do_one_step_alt(SubLObject strategy) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.inference.harness.inference_tactician.strategy_possibly_auto_prune(strategy);
            {
                SubLObject _prev_bind_0 = inference_macros.$controlling_strategy$.currentBinding(thread);
                try {
                    inference_macros.$controlling_strategy$.bind(strategy, thread);
                    inference_datastructures_inference.increment_inference_step_count(inference_datastructures_strategy.strategy_inference(strategy));
                    inference_datastructures_inference.increment_inference_cumulative_step_count(inference_datastructures_strategy.strategy_inference(strategy));
                    inference_datastructures_strategy.strategy_dispatch(strategy, $DO_ONE_STEP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } finally {
                    inference_macros.$controlling_strategy$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    // Definitions
    public static SubLObject strategy_do_one_step(final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        strategy_possibly_auto_prune(strategy);
        final SubLObject _prev_bind_0 = inference_macros.$controlling_strategy$.currentBinding(thread);
        try {
            inference_macros.$controlling_strategy$.bind(strategy, thread);
            inference_datastructures_strategy.increment_strategy_step_count(strategy);
            inference_datastructures_inference.increment_inference_step_count(inference_datastructures_strategy.strategy_inference(strategy));
            inference_datastructures_inference.increment_inference_cumulative_step_count(inference_datastructures_strategy.strategy_inference(strategy));
            inference_datastructures_strategy.strategy_dispatch(strategy, $DO_ONE_STEP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            inference_macros.$controlling_strategy$.rebind(_prev_bind_0, thread);
        }
        inference_metrics.inference_possibly_update_tick_indexed_progress_data(inference_macros.current_controlling_inference());
        return NIL;
    }

    public static final SubLObject strategy_doneP_alt(SubLObject strategy) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $DONE_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject strategy_doneP(final SubLObject strategy) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $DONE_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Called after all A-Brain consequences of a tactic have been followed through.
     */
    @LispMethod(comment = "Called after all A-Brain consequences of a tactic have been followed through.")
    public static final SubLObject strategy_note_tactic_finished_alt(SubLObject strategy, SubLObject tactic) {
        inference_datastructures_strategy.problem_note_tactic_not_strategically_possible(inference_datastructures_tactic.tactic_problem(tactic), tactic, strategy);
        inference_worker.consider_strategic_ramifications_of_executed_tactic(strategy, tactic);
        return NIL;
    }

    /**
     * Called after all A-Brain consequences of a tactic have been followed through.
     */
    @LispMethod(comment = "Called after all A-Brain consequences of a tactic have been followed through.")
    public static SubLObject strategy_note_tactic_finished(final SubLObject strategy, final SubLObject tactic) {
        inference_datastructures_strategy.problem_note_tactic_not_strategically_possible(inference_datastructures_tactic.tactic_problem(tactic), tactic, strategy);
        inference_worker.consider_strategic_ramifications_of_executed_tactic(strategy, tactic);
        return NIL;
    }

    public static final SubLObject strategy_possibly_activate_problem_alt(SubLObject strategy, SubLObject problem) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $POSSIBLY_ACTIVATE_PROBLEM, problem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject strategy_possibly_activate_problem(final SubLObject strategy, final SubLObject problem) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $POSSIBLY_ACTIVATE_PROBLEM, problem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Gets called actually before stuff starts propagating from LINK
     */
    @LispMethod(comment = "Gets called actually before stuff starts propagating from LINK")
    public static final SubLObject strategy_note_argument_link_added_alt(SubLObject strategy, SubLObject link) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $NEW_ARGUMENT_LINK, link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Gets called actually before stuff starts propagating from LINK
     */
    @LispMethod(comment = "Gets called actually before stuff starts propagating from LINK")
    public static SubLObject strategy_note_argument_link_added(final SubLObject strategy, final SubLObject link) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $NEW_ARGUMENT_LINK, link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Gets called when STORE's problem count meets or exceeds its
     * max problem count
     */
    @LispMethod(comment = "Gets called when STORE\'s problem count meets or exceeds its\r\nmax problem count\nGets called when STORE\'s problem count meets or exceeds its\nmax problem count")
    public static final SubLObject strategy_do_problem_store_prune_alt(SubLObject strategy) {
        {
            SubLObject store = inference_datastructures_strategy.strategy_problem_store(strategy);
            return inference_worker.prune_problem_store(store, UNPROVIDED);
        }
    }

    /**
     * Gets called when STORE's problem count meets or exceeds its
     * max problem count
     */
    @LispMethod(comment = "Gets called when STORE\'s problem count meets or exceeds its\r\nmax problem count\nGets called when STORE\'s problem count meets or exceeds its\nmax problem count")
    public static SubLObject strategy_do_problem_store_prune(final SubLObject strategy) {
        final SubLObject store = inference_datastructures_strategy.strategy_problem_store(strategy);
        return inference_worker.prune_problem_store(store, UNPROVIDED);
    }

    public static final SubLObject clear_strategy_step_count_alt() {
        $strategy_auto_prune_step_count$.setDynamicValue(ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject clear_strategy_step_count() {
        $strategy_auto_prune_step_count$.setDynamicValue(ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject strategy_possibly_auto_prune_alt(SubLObject strategy) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            inference_strategist.inference_possibly_prune_processed_proofs(inference_datastructures_strategy.strategy_inference(strategy));
            if (NIL != $strategy_auto_prune_threshold$.getDynamicValue(thread)) {
                if ($strategy_auto_prune_step_count$.getDynamicValue(thread).numGE($strategy_auto_prune_threshold$.getDynamicValue(thread))) {
                    inference_worker.prune_problem_store(inference_datastructures_strategy.strategy_problem_store(strategy), UNPROVIDED);
                    com.cyc.cycjava.cycl.inference.harness.inference_tactician.clear_strategy_step_count();
                }
                $strategy_auto_prune_step_count$.setDynamicValue(add($strategy_auto_prune_step_count$.getDynamicValue(thread), ONE_INTEGER), thread);
                return $strategy_auto_prune_step_count$.getDynamicValue(thread);
            }
            return NIL;
        }
    }

    public static SubLObject strategy_possibly_auto_prune(final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        inference_strategist.inference_possibly_prune_processed_proofs(inference_datastructures_strategy.strategy_inference(strategy));
        if (NIL != $strategy_auto_prune_threshold$.getDynamicValue(thread)) {
            if ($strategy_auto_prune_step_count$.getDynamicValue(thread).numGE($strategy_auto_prune_threshold$.getDynamicValue(thread))) {
                inference_worker.prune_problem_store(inference_datastructures_strategy.strategy_problem_store(strategy), UNPROVIDED);
                clear_strategy_step_count();
            }
            $strategy_auto_prune_step_count$.setDynamicValue(add($strategy_auto_prune_step_count$.getDynamicValue(thread), ONE_INTEGER), thread);
            return $strategy_auto_prune_step_count$.getDynamicValue(thread);
        }
        return NIL;
    }

    /**
     * Stable-sort SEQUENCE wrt STRATEGY using PREDICATE as the comparison function.
     * PREDICATE must have an arg-signature of (OBJ1 OBJ2 STRATEGY).
     */
    @LispMethod(comment = "Stable-sort SEQUENCE wrt STRATEGY using PREDICATE as the comparison function.\r\nPREDICATE must have an arg-signature of (OBJ1 OBJ2 STRATEGY).\nStable-sort SEQUENCE wrt STRATEGY using PREDICATE as the comparison function.\nPREDICATE must have an arg-signature of (OBJ1 OBJ2 STRATEGY).")
    public static final SubLObject strategy_sort_alt(SubLObject strategy, SubLObject sequence, SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(strategy, STRATEGY_P);
            {
                SubLObject _prev_bind_0 = $strategy_sort_strategy$.currentBinding(thread);
                SubLObject _prev_bind_1 = $strategy_sort_predicate$.currentBinding(thread);
                try {
                    $strategy_sort_strategy$.bind(strategy, thread);
                    $strategy_sort_predicate$.bind(predicate, thread);
                    sequence = Sort.stable_sort(sequence, $sym5$STRATEGY_SORT_PREDICATE_, UNPROVIDED);
                } finally {
                    $strategy_sort_predicate$.rebind(_prev_bind_1, thread);
                    $strategy_sort_strategy$.rebind(_prev_bind_0, thread);
                }
            }
            return sequence;
        }
    }

    /**
     * Stable-sort SEQUENCE wrt STRATEGY using PREDICATE as the comparison function.
     * PREDICATE must have an arg-signature of (OBJ1 OBJ2 STRATEGY).
     */
    @LispMethod(comment = "Stable-sort SEQUENCE wrt STRATEGY using PREDICATE as the comparison function.\r\nPREDICATE must have an arg-signature of (OBJ1 OBJ2 STRATEGY).\nStable-sort SEQUENCE wrt STRATEGY using PREDICATE as the comparison function.\nPREDICATE must have an arg-signature of (OBJ1 OBJ2 STRATEGY).")
    public static SubLObject strategy_sort(final SubLObject strategy, SubLObject sequence, final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_strategy.strategy_p(strategy) : "! inference_datastructures_strategy.strategy_p(strategy) " + ("inference_datastructures_strategy.strategy_p(strategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) ") + strategy;
        final SubLObject _prev_bind_0 = $strategy_sort_strategy$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $strategy_sort_predicate$.currentBinding(thread);
        try {
            $strategy_sort_strategy$.bind(strategy, thread);
            $strategy_sort_predicate$.bind(predicate, thread);
            sequence = Sort.stable_sort(sequence, $sym5$STRATEGY_SORT_PREDICATE_, UNPROVIDED);
        } finally {
            $strategy_sort_predicate$.rebind(_prev_bind_2, thread);
            $strategy_sort_strategy$.rebind(_prev_bind_0, thread);
        }
        return sequence;
    }

    public static final SubLObject strategy_sort_predicateP_alt(SubLObject object1, SubLObject object2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return funcall($strategy_sort_predicate$.getDynamicValue(thread), object1, object2, $strategy_sort_strategy$.getDynamicValue(thread));
        }
    }

    public static SubLObject strategy_sort_predicateP(final SubLObject object1, final SubLObject object2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return funcall($strategy_sort_predicate$.getDynamicValue(thread), object1, object2, $strategy_sort_strategy$.getDynamicValue(thread));
    }

    public static final SubLObject tactic_strategic_productivity_L_alt(SubLObject tactic1, SubLObject tactic2, SubLObject strategy) {
        return inference_datastructures_enumerated_types.productivity_L(inference_datastructures_strategy.tactic_strategic_productivity(tactic1, strategy), inference_datastructures_strategy.tactic_strategic_productivity(tactic2, strategy));
    }

    public static SubLObject tactic_strategic_productivity_L(final SubLObject tactic1, final SubLObject tactic2, final SubLObject strategy) {
        return inference_datastructures_enumerated_types.productivity_L(inference_datastructures_strategy.tactic_strategic_productivity(tactic1, strategy), inference_datastructures_strategy.tactic_strategic_productivity(tactic2, strategy));
    }

    public static final SubLObject logical_tactic_better_wrt_removalP_alt(SubLObject logical_tactic1, SubLObject logical_tactic2, SubLObject strategy) {
        {
            SubLObject lookahead_problem1 = com.cyc.cycjava.cycl.inference.harness.inference_tactician.logical_tactic_lookahead_problem_wrt_removal(logical_tactic1, strategy);
            SubLObject lookahead_problem2 = com.cyc.cycjava.cycl.inference.harness.inference_tactician.logical_tactic_lookahead_problem_wrt_removal(logical_tactic2, strategy);
            return inference_datastructures_enumerated_types.productivity_L(inference_lookahead_productivity.memoized_problem_max_removal_productivity(lookahead_problem1, strategy), inference_lookahead_productivity.memoized_problem_max_removal_productivity(lookahead_problem2, strategy));
        }
    }

    public static SubLObject logical_tactic_better_wrt_removalP(final SubLObject logical_tactic1, final SubLObject logical_tactic2, final SubLObject strategy) {
        final SubLObject lookahead_problem1 = logical_tactic_lookahead_problem_wrt_removal(logical_tactic1, strategy);
        final SubLObject lookahead_problem2 = logical_tactic_lookahead_problem_wrt_removal(logical_tactic2, strategy);
        return inference_datastructures_enumerated_types.productivity_L(inference_lookahead_productivity.memoized_problem_max_removal_productivity(lookahead_problem1, strategy), inference_lookahead_productivity.memoized_problem_max_removal_productivity(lookahead_problem2, strategy));
    }

    public static final SubLObject logical_tactic_lookahead_problem_wrt_removal_alt(SubLObject logical_tactic, SubLObject strategy) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != inference_worker_join.join_tactic_p(logical_tactic)) {
                thread.resetMultipleValues();
                {
                    SubLObject first_problem = inference_worker_join.join_tactic_lookahead_problems(logical_tactic);
                    SubLObject second_problem = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return NIL != inference_datastructures_enumerated_types.productivity_L(inference_lookahead_productivity.memoized_problem_max_removal_productivity(first_problem, strategy), inference_lookahead_productivity.memoized_problem_max_removal_productivity(second_problem, strategy)) ? ((SubLObject) (second_problem)) : first_problem;
                }
            } else {
                return inference_worker.logical_tactic_lookahead_problem(logical_tactic);
            }
        }
    }

    public static SubLObject logical_tactic_lookahead_problem_wrt_removal(final SubLObject logical_tactic, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != inference_worker_join.join_tactic_p(logical_tactic)) {
            thread.resetMultipleValues();
            final SubLObject first_problem = inference_worker_join.join_tactic_lookahead_problems(logical_tactic);
            final SubLObject second_problem = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return NIL != inference_datastructures_enumerated_types.productivity_L(inference_lookahead_productivity.memoized_problem_max_removal_productivity(first_problem, strategy), inference_lookahead_productivity.memoized_problem_max_removal_productivity(second_problem, strategy)) ? second_problem : first_problem;
        }
        return inference_worker.logical_tactic_lookahead_problem(logical_tactic);
    }

    /**
     *
     *
     * @return strategy-p or :tactical
     * @see controlling-strategy
     */
    @LispMethod(comment = "@return strategy-p or :tactical\r\n@see controlling-strategy")
    public static final SubLObject controlling_strategic_context_alt(SubLObject strategic_context) {
        if ($TACTICAL == strategic_context) {
            return $TACTICAL;
        } else {
            return com.cyc.cycjava.cycl.inference.harness.inference_tactician.controlling_strategy(strategic_context);
        }
    }

    /**
     *
     *
     * @return strategy-p or :tactical
     * @see controlling-strategy
     */
    @LispMethod(comment = "@return strategy-p or :tactical\r\n@see controlling-strategy")
    public static SubLObject controlling_strategic_context(final SubLObject strategic_context) {
        if ($TACTICAL == strategic_context) {
            return $TACTICAL;
        }
        return controlling_strategy(strategic_context);
    }

    /**
     *
     *
     * @return strategy-p; the controlling strategy of STRATEGY.  May be STRATEGY itself
    if STRATEGY is not a substrategy of some other strategy.
     */
    @LispMethod(comment = "@return strategy-p; the controlling strategy of STRATEGY.  May be STRATEGY itself\r\nif STRATEGY is not a substrategy of some other strategy.")
    public static final SubLObject controlling_strategy_alt(SubLObject strategy) {
        return inference_datastructures_inference.simplest_inference_strategy(inference_datastructures_strategy.strategy_inference(strategy));
    }

    /**
     *
     *
     * @return strategy-p; the controlling strategy of STRATEGY.  May be STRATEGY itself
    if STRATEGY is not a substrategy of some other strategy.
     */
    @LispMethod(comment = "@return strategy-p; the controlling strategy of STRATEGY.  May be STRATEGY itself\r\nif STRATEGY is not a substrategy of some other strategy.")
    public static SubLObject controlling_strategy(final SubLObject strategy) {
        return inference_datastructures_inference.simplest_inference_strategy(inference_datastructures_strategy.strategy_inference(strategy));
    }

    /**
     *
     *
     * @return booleanp; whether STRATEGY is a substrategy of some other strategy.
     */
    @LispMethod(comment = "@return booleanp; whether STRATEGY is a substrategy of some other strategy.")
    public static final SubLObject controlling_strategyP_alt(SubLObject strategy) {
        return makeBoolean((NIL != inference_datastructures_strategy.strategy_p(strategy)) && (strategy == com.cyc.cycjava.cycl.inference.harness.inference_tactician.controlling_strategy(strategy)));
    }

    /**
     *
     *
     * @return booleanp; whether STRATEGY is a substrategy of some other strategy.
     */
    @LispMethod(comment = "@return booleanp; whether STRATEGY is a substrategy of some other strategy.")
    public static SubLObject controlling_strategyP(final SubLObject strategy) {
        return makeBoolean((NIL != inference_datastructures_strategy.strategy_p(strategy)) && strategy.eql(controlling_strategy(strategy)));
    }

    /**
     *
     *
     * @return booleanp; whether STRATEGY is a substrategy of some other strategy.
     */
    @LispMethod(comment = "@return booleanp; whether STRATEGY is a substrategy of some other strategy.")
    public static final SubLObject substrategyP_alt(SubLObject strategy) {
        return makeBoolean((NIL != inference_datastructures_strategy.strategy_p(strategy)) && (strategy != com.cyc.cycjava.cycl.inference.harness.inference_tactician.controlling_strategy(strategy)));
    }

    /**
     *
     *
     * @return booleanp; whether STRATEGY is a substrategy of some other strategy.
     */
    @LispMethod(comment = "@return booleanp; whether STRATEGY is a substrategy of some other strategy.")
    public static SubLObject substrategyP(final SubLObject strategy) {
        return makeBoolean((NIL != inference_datastructures_strategy.strategy_p(strategy)) && (!strategy.eql(controlling_strategy(strategy))));
    }

    public static final SubLObject strategy_controls_problem_storeP_alt(SubLObject strategy) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician.controlling_strategyP(strategy)) && (NIL != inference_datastructures_inference.inference_problem_store_privateP(inference_datastructures_strategy.strategy_inference(strategy))));
    }

    public static SubLObject strategy_controls_problem_storeP(final SubLObject strategy) {
        return makeBoolean((NIL != controlling_strategyP(strategy)) && (NIL != inference_datastructures_inference.inference_problem_store_privateP(inference_datastructures_strategy.strategy_inference(strategy))));
    }

    public static final SubLObject do_problem_unsubsumed_tactics_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt9);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject tactic_var = NIL;
                    SubLObject problem = NIL;
                    SubLObject strategic_context = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt9);
                    tactic_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt9);
                    problem = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt9);
                    strategic_context = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt9);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt9);
                            if (NIL == member(current_1, $list_alt10, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt9);
                        }
                        {
                            SubLObject status_tail = property_list_member($STATUS, current);
                            SubLObject status = (NIL != status_tail) ? ((SubLObject) (cadr(status_tail))) : NIL;
                            SubLObject hl_module_tail = property_list_member($HL_MODULE, current);
                            SubLObject hl_module = (NIL != hl_module_tail) ? ((SubLObject) (cadr(hl_module_tail))) : NIL;
                            SubLObject type_tail = property_list_member($TYPE, current);
                            SubLObject type = (NIL != type_tail) ? ((SubLObject) (cadr(type_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject pcase_var = type;
                                if ((pcase_var.eql($REMOVAL) || pcase_var.eql($GENERALIZED_REMOVAL)) || pcase_var.eql($TRANSFORMATION)) {
                                    return listS(DO_PROBLEM_TACTICS, list(new SubLObject[]{ tactic_var, problem, $STATUS, status, $HL_MODULE, hl_module, $TYPE, type, $DONE, done }), list(IGNORE, strategic_context), append(body, NIL));
                                } else {
                                    {
                                        SubLObject problem_var = $sym21$PROBLEM_VAR;
                                        SubLObject type_var = $sym22$TYPE_VAR;
                                        SubLObject subsuming_join_ordered_tactics = $sym23$SUBSUMING_JOIN_ORDERED_TACTICS;
                                        return list(CLET, list(list(problem_var, problem), list(type_var, type), list(subsuming_join_ordered_tactics, list($sym25$PROBLEM_MAXIMAL_SUBSUMING_MULTI_FOCAL_LITERAL_JOIN_ORDERED_TACTIC, problem_var, type_var))), list(DO_PROBLEM_TACTICS, list(new SubLObject[]{ tactic_var, problem_var, $STATUS, status, $HL_MODULE, hl_module, $TYPE, type_var, $DONE, done }), listS(PUNLESS, list($sym27$SOME_SUBSUMING_JOIN_ORDERED_TACTIC_, tactic_var, subsuming_join_ordered_tactics, strategic_context), append(body, NIL))));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_problem_unsubsumed_tactics(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject tactic_var = NIL;
        SubLObject problem = NIL;
        SubLObject strategic_context = NIL;
        destructuring_bind_must_consp(current, datum, $list9);
        tactic_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        problem = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        strategic_context = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list9);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list9);
            if (NIL == member(current_$1, $list10, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list9);
        }
        final SubLObject status_tail = property_list_member($STATUS, current);
        final SubLObject status = (NIL != status_tail) ? cadr(status_tail) : NIL;
        final SubLObject hl_module_tail = property_list_member($HL_MODULE, current);
        final SubLObject hl_module = (NIL != hl_module_tail) ? cadr(hl_module_tail) : NIL;
        final SubLObject type_tail = property_list_member($TYPE, current);
        final SubLObject type = (NIL != type_tail) ? cadr(type_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject pcase_var = type;
        if ((pcase_var.eql($REMOVAL) || pcase_var.eql($GENERALIZED_REMOVAL)) || pcase_var.eql($TRANSFORMATION)) {
            return listS(DO_PROBLEM_TACTICS, list(new SubLObject[]{ tactic_var, problem, $STATUS, status, $HL_MODULE, hl_module, $TYPE, type, $DONE, done }), list(IGNORE, strategic_context), append(body, NIL));
        }
        final SubLObject problem_var = $sym21$PROBLEM_VAR;
        final SubLObject type_var = $sym22$TYPE_VAR;
        final SubLObject subsuming_join_ordered_tactics = $sym23$SUBSUMING_JOIN_ORDERED_TACTICS;
        return list(CLET, list(list(problem_var, problem), list(type_var, type), list(subsuming_join_ordered_tactics, list($sym25$PROBLEM_MAXIMAL_SUBSUMING_MULTI_FOCAL_LITERAL_JOIN_ORDERED_TACTIC, problem_var, type_var))), list(DO_PROBLEM_TACTICS, list(new SubLObject[]{ tactic_var, problem_var, $STATUS, status, $HL_MODULE, hl_module, $TYPE, type_var, $DONE, done }), listS(PUNLESS, list($sym27$SOME_SUBSUMING_JOIN_ORDERED_TACTIC_, tactic_var, subsuming_join_ordered_tactics, strategic_context), append(body, NIL))));
    }

    public static final SubLObject problem_maximal_subsuming_multi_focal_literal_join_ordered_tactics_alt(SubLObject problem, SubLObject relevant_tactic_type) {
        {
            SubLObject result = NIL;
            if (((NIL == relevant_tactic_type) || (relevant_tactic_type == $JOIN_ORDERED)) || (relevant_tactic_type == $CONNECTED_CONJUNCTION)) {
                {
                    SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
                    SubLObject join_ordered_tactic = NIL;
                    for (join_ordered_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , join_ordered_tactic = cdolist_list_var.first()) {
                        if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(join_ordered_tactic, $JOIN_ORDERED)) {
                            if (NIL == inference_worker_join_ordered.single_focal_literal_join_ordered_tactic_p(join_ordered_tactic)) {
                                result = cons(join_ordered_tactic, result);
                            }
                        }
                    }
                }
                result = list_utilities.delete_subsumed_items(result, $sym31$JOIN_ORDERED_TACTIC_SUBSUMES_, UNPROVIDED);
                result = nreverse(result);
            }
            return result;
        }
    }

    public static SubLObject problem_maximal_subsuming_multi_focal_literal_join_ordered_tactics(final SubLObject problem, final SubLObject relevant_tactic_type) {
        SubLObject result = NIL;
        if (((NIL == relevant_tactic_type) || (relevant_tactic_type == $JOIN_ORDERED)) || (relevant_tactic_type == $CONNECTED_CONJUNCTION)) {
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
            SubLObject join_ordered_tactic = NIL;
            join_ordered_tactic = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(join_ordered_tactic, $JOIN_ORDERED)) && (NIL == inference_worker_join_ordered.single_focal_literal_join_ordered_tactic_p(join_ordered_tactic))) {
                    result = cons(join_ordered_tactic, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                join_ordered_tactic = cdolist_list_var.first();
            } 
            result = list_utilities.delete_subsumed_items(result, $sym31$JOIN_ORDERED_TACTIC_SUBSUMES_, UNPROVIDED);
            result = nreverse(result);
        }
        return result;
    }

    public static final SubLObject some_subsuming_join_ordered_tacticP_alt(SubLObject join_ordered_tactic, SubLObject subsuming_join_ordered_tactics, SubLObject strategic_context) {
        {
            SubLObject subsumedP = NIL;
            if (NIL != subsuming_join_ordered_tactics) {
                if (NIL != inference_worker_join_ordered.join_ordered_tactic_p(join_ordered_tactic)) {
                    if (NIL == subsumedP) {
                        {
                            SubLObject csome_list_var = subsuming_join_ordered_tactics;
                            SubLObject candidate_subsuming_tactic = NIL;
                            for (candidate_subsuming_tactic = csome_list_var.first(); !((NIL != subsumedP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , candidate_subsuming_tactic = csome_list_var.first()) {
                                if (join_ordered_tactic != candidate_subsuming_tactic) {
                                    if (NIL != inference_worker_join_ordered.join_ordered_tactic_subsumesP(candidate_subsuming_tactic, join_ordered_tactic)) {
                                        if (NIL == com.cyc.cycjava.cycl.inference.harness.inference_tactician.consider_subsumed_join_ordered_tacticP(candidate_subsuming_tactic, join_ordered_tactic, strategic_context)) {
                                            subsumedP = T;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return subsumedP;
        }
    }

    public static SubLObject some_subsuming_join_ordered_tacticP(final SubLObject join_ordered_tactic, final SubLObject subsuming_join_ordered_tactics, final SubLObject strategic_context) {
        SubLObject subsumedP = NIL;
        if (((NIL != subsuming_join_ordered_tactics) && (NIL != inference_worker_join_ordered.join_ordered_tactic_p(join_ordered_tactic))) && (NIL == subsumedP)) {
            SubLObject csome_list_var = subsuming_join_ordered_tactics;
            SubLObject candidate_subsuming_tactic = NIL;
            candidate_subsuming_tactic = csome_list_var.first();
            while ((NIL == subsumedP) && (NIL != csome_list_var)) {
                if (((!join_ordered_tactic.eql(candidate_subsuming_tactic)) && (NIL != inference_worker_join_ordered.join_ordered_tactic_subsumesP(candidate_subsuming_tactic, join_ordered_tactic))) && (NIL == consider_subsumed_join_ordered_tacticP(candidate_subsuming_tactic, join_ordered_tactic, strategic_context))) {
                    subsumedP = T;
                }
                csome_list_var = csome_list_var.rest();
                candidate_subsuming_tactic = csome_list_var.first();
            } 
        }
        return subsumedP;
    }

    /**
     * This determines whether we want to still consider SUBSUMED-TACTIC, a join-ordered
     * tactic which is subsumed by SUBSUMING-TACTIC.
     *
     * @unknown For this to return T, there must be something in the non-focal aspect of the
    SUBSUMING-TACTIC that is worth doing before some focal aspect.  E.g., suppose we
    have a conjunction (A & B & C) where we have join-ordered tactics for A, B, C, and
    (A & B).  Now assume that we have reason to believe that it is better to work on
    C before B.  In this case, we have some reason to believe that focusing on A,
    rather than only (A & B), may be worthwhile.
     */
    @LispMethod(comment = "This determines whether we want to still consider SUBSUMED-TACTIC, a join-ordered\r\ntactic which is subsumed by SUBSUMING-TACTIC.\r\n\r\n@unknown For this to return T, there must be something in the non-focal aspect of the\r\nSUBSUMING-TACTIC that is worth doing before some focal aspect.  E.g., suppose we\r\nhave a conjunction (A & B & C) where we have join-ordered tactics for A, B, C, and\r\n(A & B).  Now assume that we have reason to believe that it is better to work on\r\nC before B.  In this case, we have some reason to believe that focusing on A,\r\nrather than only (A & B), may be worthwhile.\nThis determines whether we want to still consider SUBSUMED-TACTIC, a join-ordered\ntactic which is subsumed by SUBSUMING-TACTIC.")
    public static final SubLObject consider_subsumed_join_ordered_tacticP_alt(SubLObject subsuming_tactic, SubLObject subsumed_tactic, SubLObject strategic_context) {
        return NIL;
    }

    /**
     * This determines whether we want to still consider SUBSUMED-TACTIC, a join-ordered
     * tactic which is subsumed by SUBSUMING-TACTIC.
     *
     * @unknown For this to return T, there must be something in the non-focal aspect of the
    SUBSUMING-TACTIC that is worth doing before some focal aspect.  E.g., suppose we
    have a conjunction (A & B & C) where we have join-ordered tactics for A, B, C, and
    (A & B).  Now assume that we have reason to believe that it is better to work on
    C before B.  In this case, we have some reason to believe that focusing on A,
    rather than only (A & B), may be worthwhile.
     */
    @LispMethod(comment = "This determines whether we want to still consider SUBSUMED-TACTIC, a join-ordered\r\ntactic which is subsumed by SUBSUMING-TACTIC.\r\n\r\n@unknown For this to return T, there must be something in the non-focal aspect of the\r\nSUBSUMING-TACTIC that is worth doing before some focal aspect.  E.g., suppose we\r\nhave a conjunction (A & B & C) where we have join-ordered tactics for A, B, C, and\r\n(A & B).  Now assume that we have reason to believe that it is better to work on\r\nC before B.  In this case, we have some reason to believe that focusing on A,\r\nrather than only (A & B), may be worthwhile.\nThis determines whether we want to still consider SUBSUMED-TACTIC, a join-ordered\ntactic which is subsumed by SUBSUMING-TACTIC.")
    public static SubLObject consider_subsumed_join_ordered_tacticP(final SubLObject subsuming_tactic, final SubLObject subsumed_tactic, final SubLObject strategic_context) {
        return NIL;
    }

    /**
     *
     *
     * @return 0 nil or tactic-p
     * @return 1 KEY-FUNC applied to the returned tactic, if it's a tactic and KEY-FUNC is provided
     * @return 2 booleanp; if STRATEGIC-CONTEXT is a strategy, whether some tactic on PROBLEM is set aside by STRATEGY.
    Uses COMPARE-FUNC to determine which tactic to choose, which must have an arglist of (key1 key2 strategic-context),
    and must return a boolean indicating whether key2 is better.  (like a <)
    Uses SUFFICIENT-FUNC, if provided, must have an arglist of (key strategic-context), and return a boolean indicating
    whether the tactic with that key is sufficient to halt further analysis.
     */
    @LispMethod(comment = "@return 0 nil or tactic-p\r\n@return 1 KEY-FUNC applied to the returned tactic, if it\'s a tactic and KEY-FUNC is provided\r\n@return 2 booleanp; if STRATEGIC-CONTEXT is a strategy, whether some tactic on PROBLEM is set aside by STRATEGY.\r\nUses COMPARE-FUNC to determine which tactic to choose, which must have an arglist of (key1 key2 strategic-context),\r\nand must return a boolean indicating whether key2 is better.  (like a <)\r\nUses SUFFICIENT-FUNC, if provided, must have an arglist of (key strategic-context), and return a boolean indicating\r\nwhether the tactic with that key is sufficient to halt further analysis.")
    public static final SubLObject select_problem_tactic_alt(SubLObject problem, SubLObject strategic_context, SubLObject compare_func, SubLObject sufficient_func, SubLObject key_func, SubLObject status, SubLObject completeness, SubLObject hl_module, SubLObject type) {
        if (status == UNPROVIDED) {
            status = NIL;
        }
        if (completeness == UNPROVIDED) {
            completeness = NIL;
        }
        if (hl_module == UNPROVIDED) {
            hl_module = NIL;
        }
        if (type == UNPROVIDED) {
            type = NIL;
        }
        {
            SubLObject currently_selected_tactic = NIL;
            SubLObject current_key = NIL;
            SubLObject some_tactic_set_asideP = NIL;
            SubLObject sufficient_tactic_foundP = NIL;
            SubLObject problem_var = problem;
            SubLObject type_var = type;
            SubLObject subsuming_join_ordered_tactics = com.cyc.cycjava.cycl.inference.harness.inference_tactician.problem_maximal_subsuming_multi_focal_literal_join_ordered_tactics(problem_var, type_var);
            SubLObject rest = NIL;
            for (rest = inference_datastructures_problem.problem_tactics(problem_var); !((NIL != sufficient_tactic_foundP) || (NIL == rest)); rest = rest.rest()) {
                {
                    SubLObject candidate_tactic = rest.first();
                    if (((NIL != inference_datastructures_problem.do_problem_tactics_type_match(candidate_tactic, type_var)) && (NIL != inference_datastructures_problem.do_problem_tactics_status_match(candidate_tactic, status))) && (NIL != inference_datastructures_problem.do_problem_tactics_hl_module_match(candidate_tactic, hl_module))) {
                        if (NIL == com.cyc.cycjava.cycl.inference.harness.inference_tactician.some_subsuming_join_ordered_tacticP(candidate_tactic, subsuming_join_ordered_tactics, strategic_context)) {
                            if ((NIL == completeness) || (completeness == inference_datastructures_strategy.tactic_strategic_dwimmed_completeness(candidate_tactic, strategic_context))) {
                                if ((NIL != inference_datastructures_strategy.strategy_p(strategic_context)) && (NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_throw_away_tacticP(strategic_context, candidate_tactic))) {
                                } else {
                                    if ((NIL != inference_datastructures_strategy.strategy_p(strategic_context)) && (NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_set_aside_tacticP(strategic_context, candidate_tactic))) {
                                        some_tactic_set_asideP = T;
                                    } else {
                                        if (NIL == currently_selected_tactic) {
                                            currently_selected_tactic = candidate_tactic;
                                            current_key = (NIL != key_func) ? ((SubLObject) (funcall(key_func, currently_selected_tactic, strategic_context))) : currently_selected_tactic;
                                            sufficient_tactic_foundP = (NIL != sufficient_func) ? ((SubLObject) (funcall(sufficient_func, current_key, strategic_context))) : NIL;
                                        } else {
                                            {
                                                SubLObject candidate_key = (NIL != key_func) ? ((SubLObject) (funcall(key_func, candidate_tactic, strategic_context))) : candidate_tactic;
                                                if (NIL != funcall(compare_func, current_key, candidate_key, strategic_context)) {
                                                    currently_selected_tactic = candidate_tactic;
                                                    current_key = candidate_key;
                                                    sufficient_tactic_foundP = (NIL != sufficient_func) ? ((SubLObject) (funcall(sufficient_func, current_key, strategic_context))) : NIL;
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
            return values(currently_selected_tactic, current_key, some_tactic_set_asideP);
        }
    }

    /**
     *
     *
     * @return 0 nil or tactic-p
     * @return 1 KEY-FUNC applied to the returned tactic, if it's a tactic and KEY-FUNC is provided
     * @return 2 booleanp; if STRATEGIC-CONTEXT is a strategy, whether some tactic on PROBLEM is set aside by STRATEGY.
    Uses COMPARE-FUNC to determine which tactic to choose, which must have an arglist of (key1 key2 strategic-context),
    and must return a boolean indicating whether key2 is better.  (like a <)
    Uses SUFFICIENT-FUNC, if provided, must have an arglist of (key strategic-context), and return a boolean indicating
    whether the tactic with that key is sufficient to halt further analysis.
     */
    @LispMethod(comment = "@return 0 nil or tactic-p\r\n@return 1 KEY-FUNC applied to the returned tactic, if it\'s a tactic and KEY-FUNC is provided\r\n@return 2 booleanp; if STRATEGIC-CONTEXT is a strategy, whether some tactic on PROBLEM is set aside by STRATEGY.\r\nUses COMPARE-FUNC to determine which tactic to choose, which must have an arglist of (key1 key2 strategic-context),\r\nand must return a boolean indicating whether key2 is better.  (like a <)\r\nUses SUFFICIENT-FUNC, if provided, must have an arglist of (key strategic-context), and return a boolean indicating\r\nwhether the tactic with that key is sufficient to halt further analysis.")
    public static SubLObject select_problem_tactic(final SubLObject problem, final SubLObject strategic_context, final SubLObject compare_func, final SubLObject sufficient_func, final SubLObject key_func, SubLObject status, SubLObject completeness, SubLObject hl_module, SubLObject type) {
        if (status == UNPROVIDED) {
            status = NIL;
        }
        if (completeness == UNPROVIDED) {
            completeness = NIL;
        }
        if (hl_module == UNPROVIDED) {
            hl_module = NIL;
        }
        if (type == UNPROVIDED) {
            type = NIL;
        }
        SubLObject currently_selected_tactic = NIL;
        SubLObject current_key = NIL;
        SubLObject some_tactic_set_asideP = NIL;
        SubLObject sufficient_tactic_foundP = NIL;
        final SubLObject type_var = type;
        final SubLObject subsuming_join_ordered_tactics = problem_maximal_subsuming_multi_focal_literal_join_ordered_tactics(problem, type_var);
        SubLObject rest;
        SubLObject candidate_tactic;
        SubLObject candidate_key;
        for (rest = NIL, rest = inference_datastructures_problem.problem_tactics(problem); (NIL == sufficient_tactic_foundP) && (NIL != rest); rest = rest.rest()) {
            candidate_tactic = rest.first();
            if (((((NIL != inference_datastructures_problem.do_problem_tactics_type_match(candidate_tactic, type_var)) && (NIL != inference_datastructures_problem.do_problem_tactics_status_match(candidate_tactic, status))) && (NIL != inference_datastructures_problem.do_problem_tactics_hl_module_match(candidate_tactic, hl_module))) && (NIL == some_subsuming_join_ordered_tacticP(candidate_tactic, subsuming_join_ordered_tactics, strategic_context))) && ((NIL == completeness) || completeness.eql(inference_datastructures_strategy.tactic_strategic_dwimmed_completeness(candidate_tactic, strategic_context)))) {
                if ((NIL == inference_datastructures_strategy.strategy_p(strategic_context)) || (NIL == inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_throw_away_tacticP(strategic_context, candidate_tactic))) {
                    if ((NIL != inference_datastructures_strategy.strategy_p(strategic_context)) && (NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_set_aside_tacticP(strategic_context, candidate_tactic))) {
                        some_tactic_set_asideP = T;
                    } else
                        if (NIL == currently_selected_tactic) {
                            currently_selected_tactic = candidate_tactic;
                            current_key = (NIL != key_func) ? funcall(key_func, currently_selected_tactic, strategic_context) : currently_selected_tactic;
                            sufficient_tactic_foundP = (NIL != sufficient_func) ? funcall(sufficient_func, current_key, strategic_context) : NIL;
                        } else {
                            candidate_key = (NIL != key_func) ? funcall(key_func, candidate_tactic, strategic_context) : candidate_tactic;
                            if (NIL != funcall(compare_func, current_key, candidate_key, strategic_context)) {
                                currently_selected_tactic = candidate_tactic;
                                current_key = candidate_key;
                                sufficient_tactic_foundP = (NIL != sufficient_func) ? funcall(sufficient_func, current_key, strategic_context) : NIL;
                            }
                        }

                }
            }
        }
        return values(currently_selected_tactic, current_key, some_tactic_set_asideP);
    }

    public static final SubLObject choose_between_tactics_alt(SubLObject tactic1, SubLObject tactic2, SubLObject strategic_context, SubLObject compare_func) {
        {
            SubLObject chosen_tactic = NIL;
            if (NIL == tactic1) {
                SubLTrampolineFile.checkType(tactic2, TACTIC_P);
                chosen_tactic = tactic2;
            } else {
                if (NIL == tactic2) {
                    SubLTrampolineFile.checkType(tactic1, TACTIC_P);
                    chosen_tactic = tactic1;
                } else {
                    SubLTrampolineFile.checkType(tactic1, TACTIC_P);
                    SubLTrampolineFile.checkType(tactic2, TACTIC_P);
                    if (NIL != funcall(compare_func, tactic2, tactic1, strategic_context)) {
                        chosen_tactic = tactic2;
                    } else {
                        chosen_tactic = tactic1;
                    }
                }
            }
            return chosen_tactic;
        }
    }

    public static SubLObject choose_between_tactics(final SubLObject tactic1, final SubLObject tactic2, final SubLObject strategic_context, final SubLObject compare_func) {
        SubLObject chosen_tactic = NIL;
        if (NIL == tactic1) {
            assert NIL != inference_datastructures_tactic.tactic_p(tactic2) : "! inference_datastructures_tactic.tactic_p(tactic2) " + ("inference_datastructures_tactic.tactic_p(tactic2) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic2) ") + tactic2;
            chosen_tactic = tactic2;
        } else
            if (NIL == tactic2) {
                assert NIL != inference_datastructures_tactic.tactic_p(tactic1) : "! inference_datastructures_tactic.tactic_p(tactic1) " + ("inference_datastructures_tactic.tactic_p(tactic1) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic1) ") + tactic1;
                chosen_tactic = tactic1;
            } else {
                assert NIL != inference_datastructures_tactic.tactic_p(tactic1) : "! inference_datastructures_tactic.tactic_p(tactic1) " + ("inference_datastructures_tactic.tactic_p(tactic1) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic1) ") + tactic1;
                assert NIL != inference_datastructures_tactic.tactic_p(tactic2) : "! inference_datastructures_tactic.tactic_p(tactic2) " + ("inference_datastructures_tactic.tactic_p(tactic2) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic2) ") + tactic2;
                if (NIL != funcall(compare_func, tactic2, tactic1, strategic_context)) {
                    chosen_tactic = tactic2;
                } else {
                    chosen_tactic = tactic1;
                }
            }

        return chosen_tactic;
    }

    /**
     * Select the best tactic on PROBLEM that matches STATUS COMPLETENESS and MODULE according to STRATEGY (if non-nil).
     *
     * @return 0 nil or tactic-p
     * @return 1 booleanp; if STRATEGIC-CONTEXT is a strategy, whether some tactic on PROBLEM is set aside by STRATEGY.
    This is implementing least commitment.
    STRATEGY will ignore tactics that don't meet its current resource constraints or other tactical reasons.
    If COMPLETENESS is NIL, it will always pick a complete tactic over an incomplete tactic.
    All else equal, it will always prefer a less productive tactic over a more productive tactic.
     */
    @LispMethod(comment = "Select the best tactic on PROBLEM that matches STATUS COMPLETENESS and MODULE according to STRATEGY (if non-nil).\r\n\r\n@return 0 nil or tactic-p\r\n@return 1 booleanp; if STRATEGIC-CONTEXT is a strategy, whether some tactic on PROBLEM is set aside by STRATEGY.\r\nThis is implementing least commitment.\r\nSTRATEGY will ignore tactics that don\'t meet its current resource constraints or other tactical reasons.\r\nIf COMPLETENESS is NIL, it will always pick a complete tactic over an incomplete tactic.\r\nAll else equal, it will always prefer a less productive tactic over a more productive tactic.")
    public static final SubLObject select_best_tactic_for_problem_alt(SubLObject problem, SubLObject strategic_context, SubLObject status, SubLObject completeness, SubLObject module, SubLObject type) {
        if (status == UNPROVIDED) {
            status = NIL;
        }
        if (completeness == UNPROVIDED) {
            completeness = NIL;
        }
        if (module == UNPROVIDED) {
            module = NIL;
        }
        if (type == UNPROVIDED) {
            type = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject tactic = com.cyc.cycjava.cycl.inference.harness.inference_tactician.select_problem_tactic(problem, strategic_context, $sym33$TACTIC_PRODUCTIVITY_AND_COMPLETENESS_WORSE_, $sym34$TACTIC_PRODUCTIVITY_AND_COMPLETENESS_SUFFICIENTLY_GOOD_, NIL, status, completeness, module, type);
                SubLObject key = thread.secondMultipleValue();
                SubLObject some_tactic_set_asideP = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                return values(tactic, some_tactic_set_asideP);
            }
        }
    }

    /**
     * Select the best tactic on PROBLEM that matches STATUS COMPLETENESS and MODULE according to STRATEGY (if non-nil).
     *
     * @return 0 nil or tactic-p
     * @return 1 booleanp; if STRATEGIC-CONTEXT is a strategy, whether some tactic on PROBLEM is set aside by STRATEGY.
    This is implementing least commitment.
    STRATEGY will ignore tactics that don't meet its current resource constraints or other tactical reasons.
    If COMPLETENESS is NIL, it will always pick a complete tactic over an incomplete tactic.
    All else equal, it will always prefer a less productive tactic over a more productive tactic.
     */
    @LispMethod(comment = "Select the best tactic on PROBLEM that matches STATUS COMPLETENESS and MODULE according to STRATEGY (if non-nil).\r\n\r\n@return 0 nil or tactic-p\r\n@return 1 booleanp; if STRATEGIC-CONTEXT is a strategy, whether some tactic on PROBLEM is set aside by STRATEGY.\r\nThis is implementing least commitment.\r\nSTRATEGY will ignore tactics that don\'t meet its current resource constraints or other tactical reasons.\r\nIf COMPLETENESS is NIL, it will always pick a complete tactic over an incomplete tactic.\r\nAll else equal, it will always prefer a less productive tactic over a more productive tactic.")
    public static SubLObject select_best_tactic_for_problem(final SubLObject problem, final SubLObject strategic_context, SubLObject status, SubLObject completeness, SubLObject module, SubLObject type) {
        if (status == UNPROVIDED) {
            status = NIL;
        }
        if (completeness == UNPROVIDED) {
            completeness = NIL;
        }
        if (module == UNPROVIDED) {
            module = NIL;
        }
        if (type == UNPROVIDED) {
            type = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject tactic = select_problem_tactic(problem, strategic_context, $sym33$TACTIC_PRODUCTIVITY_AND_COMPLETENESS_WORSE_, $sym34$TACTIC_PRODUCTIVITY_AND_COMPLETENESS_SUFFICIENTLY_GOOD_, NIL, status, completeness, module, type);
        final SubLObject key = thread.secondMultipleValue();
        final SubLObject some_tactic_set_asideP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return values(tactic, some_tactic_set_asideP);
    }

    /**
     *
     *
     * @return boolean; t iff NEW-PRODUCTIVITY and NEW-COMPLETENESS are worse than OLD-PRODUCTIVITY and OLD-COMPLETENESS.
    Complete is always deemed better than incomplete, and within that, lower productivity is better.
     */
    @LispMethod(comment = "@return boolean; t iff NEW-PRODUCTIVITY and NEW-COMPLETENESS are worse than OLD-PRODUCTIVITY and OLD-COMPLETENESS.\r\nComplete is always deemed better than incomplete, and within that, lower productivity is better.")
    public static final SubLObject productivity_and_completeness_worseP_alt(SubLObject new_productivity, SubLObject new_completeness, SubLObject old_productivity, SubLObject old_completeness) {
        return makeBoolean((NIL != inference_datastructures_enumerated_types.completeness_L(new_completeness, old_completeness)) || ((NIL == inference_datastructures_enumerated_types.completeness_G(new_completeness, old_completeness)) && (NIL != inference_datastructures_enumerated_types.productivity_G(new_productivity, old_productivity))));
    }

    /**
     *
     *
     * @return boolean; t iff NEW-PRODUCTIVITY and NEW-COMPLETENESS are worse than OLD-PRODUCTIVITY and OLD-COMPLETENESS.
    Complete is always deemed better than incomplete, and within that, lower productivity is better.
     */
    @LispMethod(comment = "@return boolean; t iff NEW-PRODUCTIVITY and NEW-COMPLETENESS are worse than OLD-PRODUCTIVITY and OLD-COMPLETENESS.\r\nComplete is always deemed better than incomplete, and within that, lower productivity is better.")
    public static SubLObject productivity_and_completeness_worseP(final SubLObject new_productivity, final SubLObject new_completeness, final SubLObject old_productivity, final SubLObject old_completeness) {
        return makeBoolean((NIL != inference_datastructures_enumerated_types.completeness_L(new_completeness, old_completeness)) || ((NIL == inference_datastructures_enumerated_types.completeness_G(new_completeness, old_completeness)) && (NIL != inference_datastructures_enumerated_types.productivity_G(new_productivity, old_productivity))));
    }

    /**
     *
     *
     * @return boolean; t iff NEW-PRODUCTIVITY and NEW-COMPLETENESS are better than OLD-PRODUCTIVITY and OLD-COMPLETENESS.
    Complete is always deemed better than incomplete, and within that, lower productivity is better.
     */
    @LispMethod(comment = "@return boolean; t iff NEW-PRODUCTIVITY and NEW-COMPLETENESS are better than OLD-PRODUCTIVITY and OLD-COMPLETENESS.\r\nComplete is always deemed better than incomplete, and within that, lower productivity is better.")
    public static final SubLObject productivity_and_completeness_betterP_alt(SubLObject new_productivity, SubLObject new_completeness, SubLObject old_productivity, SubLObject old_completeness) {
        return makeBoolean((NIL != inference_datastructures_enumerated_types.completeness_G(new_completeness, old_completeness)) || ((NIL == inference_datastructures_enumerated_types.completeness_L(new_completeness, old_completeness)) && (NIL != inference_datastructures_enumerated_types.productivity_L(new_productivity, old_productivity))));
    }

    /**
     *
     *
     * @return boolean; t iff NEW-PRODUCTIVITY and NEW-COMPLETENESS are better than OLD-PRODUCTIVITY and OLD-COMPLETENESS.
    Complete is always deemed better than incomplete, and within that, lower productivity is better.
     */
    @LispMethod(comment = "@return boolean; t iff NEW-PRODUCTIVITY and NEW-COMPLETENESS are better than OLD-PRODUCTIVITY and OLD-COMPLETENESS.\r\nComplete is always deemed better than incomplete, and within that, lower productivity is better.")
    public static SubLObject productivity_and_completeness_betterP(final SubLObject new_productivity, final SubLObject new_completeness, final SubLObject old_productivity, final SubLObject old_completeness) {
        return makeBoolean((NIL != inference_datastructures_enumerated_types.completeness_G(new_completeness, old_completeness)) || ((NIL == inference_datastructures_enumerated_types.completeness_L(new_completeness, old_completeness)) && (NIL != inference_datastructures_enumerated_types.productivity_L(new_productivity, old_productivity))));
    }

    public static final SubLObject tactic_productivity_and_completeness_worseP_alt(SubLObject tactic1, SubLObject tactic2, SubLObject strategic_context) {
        {
            SubLObject tactic1_productivity = inference_datastructures_strategy.tactic_strategic_productivity(tactic1, strategic_context);
            SubLObject tactic1_completeness = inference_datastructures_strategy.tactic_strategic_dwimmed_completeness(tactic1, strategic_context);
            SubLObject tactic2_productivity = inference_datastructures_strategy.tactic_strategic_productivity(tactic2, strategic_context);
            SubLObject tactic2_completeness = inference_datastructures_strategy.tactic_strategic_dwimmed_completeness(tactic2, strategic_context);
            return com.cyc.cycjava.cycl.inference.harness.inference_tactician.productivity_and_completeness_worseP(tactic1_productivity, tactic1_completeness, tactic2_productivity, tactic2_completeness);
        }
    }

    public static SubLObject tactic_productivity_and_completeness_worseP(final SubLObject tactic1, final SubLObject tactic2, final SubLObject strategic_context) {
        final SubLObject tactic1_productivity = inference_datastructures_strategy.tactic_strategic_productivity(tactic1, strategic_context);
        final SubLObject tactic1_completeness = inference_datastructures_strategy.tactic_strategic_dwimmed_completeness(tactic1, strategic_context);
        final SubLObject tactic2_productivity = inference_datastructures_strategy.tactic_strategic_productivity(tactic2, strategic_context);
        final SubLObject tactic2_completeness = inference_datastructures_strategy.tactic_strategic_dwimmed_completeness(tactic2, strategic_context);
        return productivity_and_completeness_worseP(tactic1_productivity, tactic1_completeness, tactic2_productivity, tactic2_completeness);
    }

    public static final SubLObject tactic_productivity_and_completeness_betterP_alt(SubLObject tactic1, SubLObject tactic2, SubLObject strategic_context) {
        {
            SubLObject tactic1_productivity = inference_datastructures_strategy.tactic_strategic_productivity(tactic1, strategic_context);
            SubLObject tactic1_completeness = inference_datastructures_strategy.tactic_strategic_dwimmed_completeness(tactic1, strategic_context);
            SubLObject tactic2_productivity = inference_datastructures_strategy.tactic_strategic_productivity(tactic2, strategic_context);
            SubLObject tactic2_completeness = inference_datastructures_strategy.tactic_strategic_dwimmed_completeness(tactic2, strategic_context);
            return com.cyc.cycjava.cycl.inference.harness.inference_tactician.productivity_and_completeness_betterP(tactic1_productivity, tactic1_completeness, tactic2_productivity, tactic2_completeness);
        }
    }

    public static SubLObject tactic_productivity_and_completeness_betterP(final SubLObject tactic1, final SubLObject tactic2, final SubLObject strategic_context) {
        final SubLObject tactic1_productivity = inference_datastructures_strategy.tactic_strategic_productivity(tactic1, strategic_context);
        final SubLObject tactic1_completeness = inference_datastructures_strategy.tactic_strategic_dwimmed_completeness(tactic1, strategic_context);
        final SubLObject tactic2_productivity = inference_datastructures_strategy.tactic_strategic_productivity(tactic2, strategic_context);
        final SubLObject tactic2_completeness = inference_datastructures_strategy.tactic_strategic_dwimmed_completeness(tactic2, strategic_context);
        return productivity_and_completeness_betterP(tactic1_productivity, tactic1_completeness, tactic2_productivity, tactic2_completeness);
    }

    public static final SubLObject tactic_productivity_and_completeness_sufficiently_goodP_alt(SubLObject tactic, SubLObject strategic_context) {
        {
            SubLObject tactic_productivity = inference_datastructures_strategy.tactic_strategic_productivity(tactic, strategic_context);
            SubLObject tactic_completeness = inference_datastructures_strategy.tactic_strategic_dwimmed_completeness(tactic, strategic_context);
            SubLObject sufficient_productivity = $sufficiently_good_tactic_productivity_threshold$.getGlobalValue();
            SubLObject sufficient_completeness = $COMPLETE;
            return com.cyc.cycjava.cycl.inference.harness.inference_tactician.productivity_and_completeness_betterP(tactic_productivity, tactic_completeness, sufficient_productivity, sufficient_completeness);
        }
    }

    public static SubLObject tactic_productivity_and_completeness_sufficiently_goodP(final SubLObject tactic, final SubLObject strategic_context) {
        final SubLObject tactic_productivity = inference_datastructures_strategy.tactic_strategic_productivity(tactic, strategic_context);
        final SubLObject tactic_completeness = inference_datastructures_strategy.tactic_strategic_dwimmed_completeness(tactic, strategic_context);
        final SubLObject sufficient_productivity = $sufficiently_good_tactic_productivity_threshold$.getGlobalValue();
        final SubLObject sufficient_completeness = $COMPLETE;
        return productivity_and_completeness_betterP(tactic_productivity, tactic_completeness, sufficient_productivity, sufficient_completeness);
    }

    public static final SubLObject choose_less_productive_tactic_alt(SubLObject tactic1, SubLObject tactic2, SubLObject strategic_context) {
        {
            SubLObject better_func = $sym36$TACTIC_PRODUCTIVITY_LOWER_;
            SubLObject better_tactic = com.cyc.cycjava.cycl.inference.harness.inference_tactician.choose_between_tactics(tactic1, tactic2, strategic_context, better_func);
            SubLObject sufficient_tacticP = com.cyc.cycjava.cycl.inference.harness.inference_tactician.tactic_productivity_sufficiently_goodP(better_tactic, strategic_context);
            return values(better_tactic, sufficient_tacticP);
        }
    }

    public static SubLObject choose_less_productive_tactic(final SubLObject tactic1, final SubLObject tactic2, final SubLObject strategic_context) {
        final SubLObject better_func = $sym36$TACTIC_PRODUCTIVITY_LOWER_;
        final SubLObject better_tactic = choose_between_tactics(tactic1, tactic2, strategic_context, better_func);
        final SubLObject sufficient_tacticP = tactic_productivity_sufficiently_goodP(better_tactic, strategic_context);
        return values(better_tactic, sufficient_tacticP);
    }

    public static final SubLObject tactic_productivity_higherP_alt(SubLObject tactic1, SubLObject tactic2, SubLObject strategic_context) {
        {
            SubLObject tactic1_productivity = inference_datastructures_strategy.tactic_strategic_productivity(tactic1, strategic_context);
            SubLObject tactic2_productivity = inference_datastructures_strategy.tactic_strategic_productivity(tactic2, strategic_context);
            return inference_datastructures_enumerated_types.productivity_G(tactic1_productivity, tactic2_productivity);
        }
    }

    public static SubLObject tactic_productivity_higherP(final SubLObject tactic1, final SubLObject tactic2, final SubLObject strategic_context) {
        final SubLObject tactic1_productivity = inference_datastructures_strategy.tactic_strategic_productivity(tactic1, strategic_context);
        final SubLObject tactic2_productivity = inference_datastructures_strategy.tactic_strategic_productivity(tactic2, strategic_context);
        return inference_datastructures_enumerated_types.productivity_G(tactic1_productivity, tactic2_productivity);
    }

    public static final SubLObject tactic_productivity_lowerP_alt(SubLObject tactic1, SubLObject tactic2, SubLObject strategic_context) {
        {
            SubLObject tactic1_productivity = inference_datastructures_strategy.tactic_strategic_productivity(tactic1, strategic_context);
            SubLObject tactic2_productivity = inference_datastructures_strategy.tactic_strategic_productivity(tactic2, strategic_context);
            return inference_datastructures_enumerated_types.productivity_L(tactic1_productivity, tactic2_productivity);
        }
    }

    public static SubLObject tactic_productivity_lowerP(final SubLObject tactic1, final SubLObject tactic2, final SubLObject strategic_context) {
        final SubLObject tactic1_productivity = inference_datastructures_strategy.tactic_strategic_productivity(tactic1, strategic_context);
        final SubLObject tactic2_productivity = inference_datastructures_strategy.tactic_strategic_productivity(tactic2, strategic_context);
        return inference_datastructures_enumerated_types.productivity_L(tactic1_productivity, tactic2_productivity);
    }

    public static final SubLObject tactic_productivity_sufficiently_goodP_alt(SubLObject tactic, SubLObject strategic_context) {
        {
            SubLObject tactic_productivity = inference_datastructures_strategy.tactic_strategic_productivity(tactic, strategic_context);
            SubLObject sufficient_productivity = $sufficiently_good_tactic_productivity_threshold$.getGlobalValue();
            return inference_datastructures_enumerated_types.productivity_L(tactic_productivity, sufficient_productivity);
        }
    }

    public static SubLObject tactic_productivity_sufficiently_goodP(final SubLObject tactic, final SubLObject strategic_context) {
        final SubLObject tactic_productivity = inference_datastructures_strategy.tactic_strategic_productivity(tactic, strategic_context);
        final SubLObject sufficient_productivity = $sufficiently_good_tactic_productivity_threshold$.getGlobalValue();
        return inference_datastructures_enumerated_types.productivity_L(tactic_productivity, sufficient_productivity);
    }

    /**
     *
     *
     * @return nil or productivity-p
     */
    @LispMethod(comment = "@return nil or productivity-p")
    public static final SubLObject early_removal_productivity_limit_alt(SubLObject strategic_context) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (strategic_context == $TACTICAL) {
                return $default_early_removal_productivity_limit$.getDynamicValue(thread);
            } else {
                return com.cyc.cycjava.cycl.inference.harness.inference_tactician.strategy_early_removal_productivity_limit(strategic_context);
            }
        }
    }

    /**
     *
     *
     * @return nil or productivity-p
     */
    @LispMethod(comment = "@return nil or productivity-p")
    public static SubLObject early_removal_productivity_limit(final SubLObject strategic_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (strategic_context == $TACTICAL) {
            return $default_early_removal_productivity_limit$.getDynamicValue(thread);
        }
        return strategy_early_removal_productivity_limit(strategic_context);
    }

    public static final SubLObject strategy_early_removal_productivity_limit_alt(SubLObject strategy) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $EARLY_REMOVAL_PRODUCTIVITY_LIMIT, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject strategy_early_removal_productivity_limit(final SubLObject strategy) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $EARLY_REMOVAL_PRODUCTIVITY_LIMIT, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * you're join-ordered, your lookahead problem is complete, and you're cheap.
     */
    @LispMethod(comment = "you\'re join-ordered, your lookahead problem is complete, and you\'re cheap.")
    public static final SubLObject candidate_early_removal_tacticP_alt(SubLObject tactic) {
        SubLTrampolineFile.checkType(tactic, TACTIC_P);
        return makeBoolean(((NIL != inference_worker_join_ordered.join_ordered_tactic_p(tactic)) && ($COMPLETE == inference_worker.problem_generalized_removal_completeness(inference_worker_join_ordered.join_ordered_tactic_lookahead_problem(tactic), $TACTICAL))) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician.join_ordered_tactic_early_removal_cheapP(tactic)));
    }

    /**
     * you're join-ordered, your lookahead problem is complete, and you're cheap.
     */
    @LispMethod(comment = "you\'re join-ordered, your lookahead problem is complete, and you\'re cheap.")
    public static SubLObject candidate_early_removal_tacticP(final SubLObject tactic) {
        assert NIL != inference_datastructures_tactic.tactic_p(tactic) : "! inference_datastructures_tactic.tactic_p(tactic) " + ("inference_datastructures_tactic.tactic_p(tactic) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) ") + tactic;
        return makeBoolean(((NIL != inference_worker_join_ordered.join_ordered_tactic_p(tactic)) && ($COMPLETE == inference_worker.problem_generalized_removal_completeness(inference_worker_join_ordered.join_ordered_tactic_lookahead_problem(tactic), $TACTICAL))) && (NIL != join_ordered_tactic_early_removal_cheapP(tactic)));
    }

    public static final SubLObject join_ordered_tactic_early_removal_cheapP_alt(SubLObject jo_tactic) {
        {
            SubLObject jo_link = inference_worker_join_ordered.join_ordered_tactic_link(jo_tactic);
            return com.cyc.cycjava.cycl.inference.harness.inference_tactician.join_ordered_link_early_removal_cheapP(jo_link, $TACTICAL);
        }
    }

    public static SubLObject join_ordered_tactic_early_removal_cheapP(final SubLObject jo_tactic) {
        final SubLObject jo_link = inference_worker_join_ordered.join_ordered_tactic_link(jo_tactic);
        return join_ordered_link_early_removal_cheapP(jo_link, $TACTICAL);
    }

    public static final SubLObject join_ordered_link_early_removal_cheapP_alt(SubLObject jo_link, SubLObject strategic_context) {
        {
            SubLObject early_removal_productivity_threshold = com.cyc.cycjava.cycl.inference.harness.inference_tactician.early_removal_productivity_limit(strategic_context);
            if (NIL != early_removal_productivity_threshold) {
                {
                    SubLObject focal_problem = inference_worker_join_ordered.join_ordered_link_focal_problem(jo_link);
                    if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician.problem_has_a_non_sksi_tacticP(focal_problem)) {
                        {
                            SubLObject productivity = inference_lookahead_productivity.problem_max_removal_productivity(focal_problem, strategic_context);
                            return inference_datastructures_enumerated_types.productivity_LE(productivity, early_removal_productivity_threshold);
                        }
                    } else {
                        return NIL;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject join_ordered_link_early_removal_cheapP(final SubLObject jo_link, final SubLObject strategic_context) {
        final SubLObject early_removal_productivity_threshold = early_removal_productivity_limit(strategic_context);
        if (NIL == early_removal_productivity_threshold) {
            return NIL;
        }
        final SubLObject focal_problem = inference_worker_join_ordered.join_ordered_link_focal_problem(jo_link);
        if (NIL != problem_has_a_non_sksi_tacticP(focal_problem)) {
            final SubLObject productivity = inference_lookahead_productivity.memoized_problem_max_removal_productivity(focal_problem, strategic_context);
            return inference_datastructures_enumerated_types.productivity_LE(productivity, early_removal_productivity_threshold);
        }
        return NIL;
    }

    public static final SubLObject problem_has_a_non_sksi_tacticP_alt(SubLObject problem) {
        {
            SubLObject non_sksi_tactic_foundP = NIL;
            SubLObject rest = NIL;
            for (rest = inference_datastructures_problem.problem_tactics(problem); !((NIL != non_sksi_tactic_foundP) || (NIL == rest)); rest = rest.rest()) {
                {
                    SubLObject tactic = rest.first();
                    if (NIL == list_utilities.member_eqP($SKSI, inference_modules.hl_module_subtypes(inference_datastructures_tactic.tactic_hl_module(tactic)))) {
                        non_sksi_tactic_foundP = T;
                    }
                }
            }
            return non_sksi_tactic_foundP;
        }
    }

    public static SubLObject problem_has_a_non_sksi_tacticP(final SubLObject problem) {
        SubLObject non_sksi_tactic_foundP;
        SubLObject rest;
        SubLObject tactic;
        for (non_sksi_tactic_foundP = NIL, rest = NIL, rest = inference_datastructures_problem.problem_tactics(problem); (NIL == non_sksi_tactic_foundP) && (NIL != rest); rest = rest.rest()) {
            tactic = rest.first();
            if (NIL == list_utilities.member_eqP($SKSI, inference_modules.hl_module_subtypes(inference_datastructures_tactic.tactic_hl_module(tactic)))) {
                non_sksi_tactic_foundP = T;
            }
        }
        return non_sksi_tactic_foundP;
    }

    /**
     * Ensure that the next item that STRATEGY would select would be the next one it would handle.
     */
    @LispMethod(comment = "Ensure that the next item that STRATEGY would select would be the next one it would handle.")
    public static final SubLObject strategy_quiesce_alt(SubLObject strategy) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $QUIESCE, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Ensure that the next item that STRATEGY would select would be the next one it would handle.
     */
    @LispMethod(comment = "Ensure that the next item that STRATEGY would select would be the next one it would handle.")
    public static SubLObject strategy_quiesce(final SubLObject strategy) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $QUIESCE, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject strategy_execute_strategem(final SubLObject strategy, final SubLObject strategem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($inference_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
            format_nil.force_format(T, $str42$_a_execute_strategem___a__, strategy, strategem, NIL, NIL, NIL, NIL, NIL, NIL);
        }
        possibly_clean_strategem(strategy, strategem);
        return inference_datastructures_strategy.strategy_dispatch(strategy, $EXECUTE_STRATEGEM, strategem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject possibly_clean_strategem(final SubLObject strategy, final SubLObject strategem) {
        if (NIL != inference_worker_union.union_tactic_p(strategem)) {
            return inference_worker_union.possibly_clean_union_tactic(strategem);
        }
        return NIL;
    }

    /**
     * Execute TACTIC under the control of STRATEGY.
     * Return TACTIC.
     */
    @LispMethod(comment = "Execute TACTIC under the control of STRATEGY.\r\nReturn TACTIC.\nExecute TACTIC under the control of STRATEGY.\nReturn TACTIC.")
    public static final SubLObject strategy_execute_tactic_alt(SubLObject strategy, SubLObject tactic) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(strategy, STRATEGY_P);
            SubLTrampolineFile.checkType(tactic, TACTIC_P);
            if (NIL != inference_datastructures_tactic.tactic_possibleP(tactic)) {
                inference_datastructures_inference.inference_note_tactic_executed(inference_datastructures_strategy.strategy_inference(strategy), tactic);
                {
                    SubLObject _prev_bind_0 = inference_macros.$controlling_strategy$.currentBinding(thread);
                    try {
                        inference_macros.$controlling_strategy$.bind(strategy, thread);
                        inference_worker.execute_tactic(tactic);
                    } finally {
                        inference_macros.$controlling_strategy$.rebind(_prev_bind_0, thread);
                    }
                }
                return tactic;
            }
            return NIL;
        }
    }

    /**
     * Execute TACTIC under the control of STRATEGY.
     * Return TACTIC.
     */
    @LispMethod(comment = "Execute TACTIC under the control of STRATEGY.\r\nReturn TACTIC.\nExecute TACTIC under the control of STRATEGY.\nReturn TACTIC.")
    public static SubLObject strategy_execute_tactic(final SubLObject strategy, final SubLObject tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_strategy.strategy_p(strategy) : "! inference_datastructures_strategy.strategy_p(strategy) " + ("inference_datastructures_strategy.strategy_p(strategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) ") + strategy;
        assert NIL != inference_datastructures_tactic.tactic_p(tactic) : "! inference_datastructures_tactic.tactic_p(tactic) " + ("inference_datastructures_tactic.tactic_p(tactic) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) ") + tactic;
        if (NIL != inference_datastructures_tactic.tactic_possibleP(tactic)) {
            inference_datastructures_inference.inference_note_tactic_executed(inference_datastructures_strategy.strategy_inference(strategy), tactic);
            final SubLObject _prev_bind_0 = inference_macros.$controlling_strategy$.currentBinding(thread);
            try {
                inference_macros.$controlling_strategy$.bind(strategy, thread);
                inference_worker.execute_tactic(tactic);
            } finally {
                inference_macros.$controlling_strategy$.rebind(_prev_bind_0, thread);
            }
            return tactic;
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether STRATEGY actually just executed TACTIC.
     */
    @LispMethod(comment = "@return booleanp; whether STRATEGY actually just executed TACTIC.")
    public static final SubLObject strategy_possibly_execute_tactic_alt(SubLObject strategy, SubLObject tactic) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.inference.harness.inference_tactician.strategy_execute_tactic(strategy, tactic));
    }

    /**
     *
     *
     * @return booleanp; whether STRATEGY actually just executed TACTIC.
     */
    @LispMethod(comment = "@return booleanp; whether STRATEGY actually just executed TACTIC.")
    public static SubLObject strategy_possibly_execute_tactic(final SubLObject strategy, final SubLObject tactic) {
        return list_utilities.sublisp_boolean(strategy_execute_tactic(strategy, tactic));
    }

    /**
     * Sets PROBLEM aside wrt STRATEGY.
     */
    @LispMethod(comment = "Sets PROBLEM aside wrt STRATEGY.")
    public static final SubLObject strategy_make_problem_set_aside_alt(SubLObject strategy, SubLObject problem) {
        if (NIL != inference_datastructures_problem.problem_relevant_to_strategyP(problem, strategy)) {
            inference_worker.possibly_note_problem_pending(problem, strategy);
        }
        return inference_datastructures_strategy.strategy_note_problem_set_aside(strategy, problem);
    }

    /**
     * Sets PROBLEM aside wrt STRATEGY.
     */
    @LispMethod(comment = "Sets PROBLEM aside wrt STRATEGY.")
    public static SubLObject strategy_make_problem_set_aside(final SubLObject strategy, final SubLObject problem) {
        if (NIL != inference_datastructures_problem.problem_relevant_to_strategyP(problem, strategy)) {
            inference_worker.possibly_note_problem_pending(problem, strategy);
        }
        return inference_datastructures_strategy.strategy_note_problem_set_aside(strategy, problem);
    }

    public static final SubLObject possibly_clear_strategic_status_wrt_alt(SubLObject problem, SubLObject strategy) {
        if (NIL == inference_datastructures_strategy.strategically_unexamined_problem_p(problem, strategy)) {
            com.cyc.cycjava.cycl.inference.harness.inference_tactician.clear_strategic_status_wrt(problem, strategy);
            return T;
        }
        return NIL;
    }

    public static SubLObject possibly_clear_strategic_status_wrt(final SubLObject problem, final SubLObject strategy) {
        if ($UNEXAMINED != inference_datastructures_strategy.problem_weak_strategic_status(problem, strategy)) {
            clear_strategic_status_wrt(problem, strategy);
            return T;
        }
        return NIL;
    }

    public static final SubLObject clear_strategic_status_wrt_alt(SubLObject problem, SubLObject strategy) {
        inference_datastructures_strategy.problem_note_all_tactics_not_strategically_possible(problem, strategy);
        inference_worker.note_problem_strategically_unexamined(problem, strategy);
        return strategy;
    }

    public static SubLObject clear_strategic_status_wrt(final SubLObject problem, final SubLObject strategy) {
        inference_datastructures_strategy.problem_note_all_tactics_not_strategically_possible(problem, strategy);
        inference_worker.note_problem_strategically_unexamined(problem, strategy);
        return strategy;
    }

    public static SubLObject strategy_set_aside_non_continuable_implies_throw_awayP(final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != removal_tactician.removal_strategy_p(strategy) ? $set_aside_non_continuable_implies_throw_away_for_removalP$.getDynamicValue(thread) : NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) ? $set_aside_non_continuable_implies_throw_away_for_transformationP$.getDynamicValue(thread) : T;
    }

    public static final SubLObject strategy_throw_away_uninteresting_set_asides_alt(SubLObject strategy) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $THROW_AWAY_UNINTERESTING_SET_ASIDES, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject strategy_throw_away_uninteresting_set_asides(final SubLObject strategy) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $THROW_AWAY_UNINTERESTING_SET_ASIDES, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return T iff STRATEGY would throw away all transformation.
     */
    @LispMethod(comment = "Return T iff STRATEGY would throw away all transformation.")
    public static final SubLObject strategy_throws_away_all_transformationP_alt(SubLObject strategy) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL == inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_strategy.strategy_problem_store(strategy))) || (((NIL != $set_aside_non_continuable_implies_throw_awayP$.getDynamicValue(thread)) && (NIL == inference_datastructures_inference.inference_continuableP(inference_datastructures_strategy.strategy_inference(strategy)))) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician.strategy_sets_aside_all_transformationP(strategy))));
        }
    }

    /**
     * Return T iff STRATEGY would throw away all transformation.
     */
    @LispMethod(comment = "Return T iff STRATEGY would throw away all transformation.")
    public static SubLObject strategy_throws_away_all_transformationP(final SubLObject strategy) {
        return makeBoolean((NIL == inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_strategy.strategy_problem_store(strategy))) || (((NIL != strategy_set_aside_non_continuable_implies_throw_awayP(strategy)) && (NIL == inference_datastructures_inference.inference_continuableP(inference_datastructures_strategy.strategy_inference(strategy)))) && (NIL != strategy_sets_aside_all_transformationP(strategy))));
    }

    /**
     * Return T iff STRATEGY would set aside all transformation.
     */
    @LispMethod(comment = "Return T iff STRATEGY would set aside all transformation.")
    public static final SubLObject strategy_sets_aside_all_transformationP_alt(SubLObject strategy) {
        return makeBoolean(NIL == inference_worker.problem_transformation_allowed_wrt_max_transformation_depthP(inference_datastructures_strategy.strategy_inference(strategy), inference_datastructures_strategy.strategy_root_problem(strategy)));
    }

    @LispMethod(comment = "Return T iff STRATEGY would set aside all transformation.")
    public static SubLObject strategy_sets_aside_all_transformationP(final SubLObject strategy) {
        return makeBoolean(NIL == inference_worker.problem_transformation_allowed_wrt_max_transformation_depthP(inference_datastructures_strategy.strategy_inference(strategy), inference_datastructures_strategy.strategy_root_problem(strategy)));
    }

    /**
     *
     *
     * @return booleanp; Whether STRATEGY deems continuation possible.
    This is usually true whenn STRATEGY has some set-aside problems to continue work on.
     */
    @LispMethod(comment = "@return booleanp; Whether STRATEGY deems continuation possible.\r\nThis is usually true whenn STRATEGY has some set-aside problems to continue work on.")
    public static final SubLObject strategy_continuation_possibleP_alt(SubLObject strategy) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $kw43$CONTINUATION_POSSIBLE_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return booleanp; Whether STRATEGY deems continuation possible.
    This is usually true whenn STRATEGY has some set-aside problems to continue work on.
     */
    @LispMethod(comment = "@return booleanp; Whether STRATEGY deems continuation possible.\r\nThis is usually true whenn STRATEGY has some set-aside problems to continue work on.")
    public static SubLObject strategy_continuation_possibleP(final SubLObject strategy) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $kw46$CONTINUATION_POSSIBLE_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject better_term_chosen_handlingP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $better_term_chosen_handlingP$.getDynamicValue(thread);
        }
    }

    public static SubLObject better_term_chosen_handlingP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $better_term_chosen_handlingP$.getDynamicValue(thread);
    }

    /**
     * Whether T-LINK is doomed due to an unbound #$termChosen literal in its supporting transformed problem.
     */
    @LispMethod(comment = "Whether T-LINK is doomed due to an unbound #$termChosen literal in its supporting transformed problem.")
    public static final SubLObject transformation_link_leads_to_term_chosen_dead_endP_alt(SubLObject t_link) {
        if (NIL == com.cyc.cycjava.cycl.inference.harness.inference_tactician.better_term_chosen_handlingP()) {
            return NIL;
        }
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.inference.harness.inference_tactician.transformation_link_term_chosen_dead_end_vars(t_link));
    }

    @LispMethod(comment = "Whether T-LINK is doomed due to an unbound #$termChosen literal in its supporting transformed problem.")
    public static SubLObject transformation_link_leads_to_term_chosen_dead_endP(final SubLObject t_link) {
        if (NIL == better_term_chosen_handlingP()) {
            return NIL;
        }
        return list_utilities.sublisp_boolean(transformation_link_term_chosen_dead_end_vars(t_link));
    }

    /**
     * #$termChosen and #$backchainForbiddenWhenUnboundInArg variables that need to get bound
     * if T-LINK's supporting transformed problem is to be solved.
     */
    @LispMethod(comment = "#$termChosen and #$backchainForbiddenWhenUnboundInArg variables that need to get bound\r\nif T-LINK\'s supporting transformed problem is to be solved.\n#$termChosen and #$backchainForbiddenWhenUnboundInArg variables that need to get bound\nif T-LINK\'s supporting transformed problem is to be solved.")
    public static final SubLObject transformation_link_term_chosen_dead_end_vars_alt(SubLObject t_link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(t_link);
                SubLObject supported_predicate = inference_datastructures_problem.single_literal_problem_predicate(supported_problem);
                SubLObject supported_mt = inference_datastructures_problem.single_literal_problem_mt(supported_problem);
                SubLObject supporting_problem = inference_worker_transformation.transformation_link_supporting_problem(t_link);
                return list_utilities.fast_delete_duplicates(nconc(com.cyc.cycjava.cycl.inference.harness.inference_tactician.problem_term_chosen_dead_end_vars(supporting_problem), NIL != $better_backchain_forbidden_when_unbound_in_arg_handlingP$.getDynamicValue(thread) ? ((SubLObject) (inference_worker_transformation.inference_backchain_forbidden_unless_arg_chosen_argnums(supported_predicate, supported_mt))) : NIL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    @LispMethod(comment = "#$termChosen and #$backchainForbiddenWhenUnboundInArg variables that need to get bound\r\nif T-LINK\'s supporting transformed problem is to be solved.\n#$termChosen and #$backchainForbiddenWhenUnboundInArg variables that need to get bound\nif T-LINK\'s supporting transformed problem is to be solved.")
    public static SubLObject transformation_link_term_chosen_dead_end_vars(final SubLObject t_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(t_link);
        final SubLObject supported_predicate = inference_datastructures_problem.single_literal_problem_predicate(supported_problem);
        final SubLObject supported_mt = inference_datastructures_problem.single_literal_problem_mt(supported_problem);
        final SubLObject supporting_problem = inference_worker_transformation.transformation_link_supporting_problem(t_link);
        return list_utilities.fast_delete_duplicates(nconc(problem_term_chosen_dead_end_vars(supporting_problem), NIL != $better_backchain_forbidden_when_unbound_in_arg_handlingP$.getDynamicValue(thread) ? inference_worker_transformation.inference_backchain_forbidden_unless_arg_chosen_argnums(supported_predicate, supported_mt) : NIL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * result is destructible
     */
    @LispMethod(comment = "result is destructible")
    public static final SubLObject problem_term_chosen_dead_end_vars_alt(SubLObject problem) {
        {
            SubLObject vars = NIL;
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_query(problem);
            SubLObject contextualized_clause = NIL;
            for (contextualized_clause = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contextualized_clause = cdolist_list_var.first()) {
                {
                    SubLObject sense = $NEG;
                    SubLObject index_var = ZERO_INTEGER;
                    SubLObject cdolist_list_var_2 = clauses.neg_lits(contextualized_clause);
                    SubLObject contextualized_asent = NIL;
                    for (contextualized_asent = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , contextualized_asent = cdolist_list_var_2.first()) {
                        {
                            SubLObject datum = contextualized_asent;
                            SubLObject current = datum;
                            SubLObject mt = NIL;
                            SubLObject asent = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt45);
                            mt = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt45);
                            asent = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if ((($POS == sense) && (NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, $$termChosen))) && (NIL != variables.not_fully_bound_p(asent))) {
                                    {
                                        SubLObject cdolist_list_var_3 = cycl_utilities.expression_gather(asent, VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        SubLObject var = NIL;
                                        for (var = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , var = cdolist_list_var_3.first()) {
                                            vars = cons(var, vars);
                                        }
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt45);
                            }
                        }
                        index_var = add(index_var, ONE_INTEGER);
                    }
                }
                {
                    SubLObject sense = $POS;
                    SubLObject index_var = ZERO_INTEGER;
                    SubLObject cdolist_list_var_4 = clauses.pos_lits(contextualized_clause);
                    SubLObject contextualized_asent = NIL;
                    for (contextualized_asent = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , contextualized_asent = cdolist_list_var_4.first()) {
                        {
                            SubLObject datum = contextualized_asent;
                            SubLObject current = datum;
                            SubLObject mt = NIL;
                            SubLObject asent = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt45);
                            mt = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt45);
                            asent = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if ((($POS == sense) && (NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, $$termChosen))) && (NIL != variables.not_fully_bound_p(asent))) {
                                    {
                                        SubLObject cdolist_list_var_5 = cycl_utilities.expression_gather(asent, VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        SubLObject var = NIL;
                                        for (var = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , var = cdolist_list_var_5.first()) {
                                            vars = cons(var, vars);
                                        }
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt45);
                            }
                        }
                        index_var = add(index_var, ONE_INTEGER);
                    }
                }
            }
            return list_utilities.fast_delete_duplicates(vars, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    @LispMethod(comment = "result is destructible")
    public static SubLObject problem_term_chosen_dead_end_vars(final SubLObject problem) {
        SubLObject vars = NIL;
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_query(problem);
        SubLObject contextualized_clause = NIL;
        contextualized_clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject sense = $NEG;
            SubLObject index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var_$2 = clauses.neg_lits(contextualized_clause);
            SubLObject contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var_$2.first();
            while (NIL != cdolist_list_var_$2) {
                SubLObject current;
                final SubLObject datum = current = contextualized_asent;
                SubLObject mt = NIL;
                SubLObject asent = NIL;
                destructuring_bind_must_consp(current, datum, $list48);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list48);
                asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    if ((($POS == sense) && (NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, $$termChosen))) && (NIL != variables.not_fully_bound_p(asent))) {
                        SubLObject cdolist_list_var_$3 = cycl_utilities.expression_gather(asent, VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject var = NIL;
                        var = cdolist_list_var_$3.first();
                        while (NIL != cdolist_list_var_$3) {
                            vars = cons(var, vars);
                            cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                            var = cdolist_list_var_$3.first();
                        } 
                    }
                } else {
                    cdestructuring_bind_error(datum, $list48);
                }
                index_var = add(index_var, ONE_INTEGER);
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                contextualized_asent = cdolist_list_var_$2.first();
            } 
            sense = $POS;
            index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var_$4 = clauses.pos_lits(contextualized_clause);
            contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var_$4.first();
            while (NIL != cdolist_list_var_$4) {
                SubLObject current;
                final SubLObject datum = current = contextualized_asent;
                SubLObject mt = NIL;
                SubLObject asent = NIL;
                destructuring_bind_must_consp(current, datum, $list48);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list48);
                asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    if ((($POS == sense) && (NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, $$termChosen))) && (NIL != variables.not_fully_bound_p(asent))) {
                        SubLObject cdolist_list_var_$5 = cycl_utilities.expression_gather(asent, VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject var = NIL;
                        var = cdolist_list_var_$5.first();
                        while (NIL != cdolist_list_var_$5) {
                            vars = cons(var, vars);
                            cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                            var = cdolist_list_var_$5.first();
                        } 
                    }
                } else {
                    cdestructuring_bind_error(datum, $list48);
                }
                index_var = add(index_var, ONE_INTEGER);
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                contextualized_asent = cdolist_list_var_$4.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_clause = cdolist_list_var.first();
        } 
        return list_utilities.fast_delete_duplicates(vars, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Walks up to find join-ordered dependent links of T-LINK's supported problem.
     * For each such join-ordered link, if its focal problem binds all dead-end #$termChosen literals of T-LINK,
     * then we push it onto the result, to be made a new root.
     * This is the only way to ensure completeness, to get around #$termChosen.
     */
    @LispMethod(comment = "Walks up to find join-ordered dependent links of T-LINK\'s supported problem.\r\nFor each such join-ordered link, if its focal problem binds all dead-end #$termChosen literals of T-LINK,\r\nthen we push it onto the result, to be made a new root.\r\nThis is the only way to ensure completeness, to get around #$termChosen.\nWalks up to find join-ordered dependent links of T-LINK\'s supported problem.\nFor each such join-ordered link, if its focal problem binds all dead-end #$termChosen literals of T-LINK,\nthen we push it onto the result, to be made a new root.\nThis is the only way to ensure completeness, to get around #$termChosen.")
    public static final SubLObject all_restricted_non_focals_around_transformation_link_alt(SubLObject t_link) {
        {
            SubLObject problems = NIL;
            SubLObject t_link_var = t_link;
            SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(t_link_var);
            SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supported_problem);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject jo_link_var = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, jo_link_var)) {
                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link_var, $JOIN_ORDERED)) {
                            {
                                SubLObject jo_link_var_6 = jo_link_var;
                                SubLObject motivating_conjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link_var_6);
                                SubLObject set_contents_var_7 = inference_datastructures_problem.problem_argument_links(motivating_conjunction_problem);
                                SubLObject basis_object_8 = set_contents.do_set_contents_basis_object(set_contents_var_7);
                                SubLObject state_9 = NIL;
                                for (state_9 = set_contents.do_set_contents_initial_state(basis_object_8, set_contents_var_7); NIL == set_contents.do_set_contents_doneP(basis_object_8, state_9); state_9 = set_contents.do_set_contents_update_state(state_9)) {
                                    {
                                        SubLObject rt_link = set_contents.do_set_contents_next(basis_object_8, state_9);
                                        if (NIL != set_contents.do_set_contents_element_validP(state_9, rt_link)) {
                                            if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(rt_link, $RESIDUAL_TRANSFORMATION)) {
                                                if (NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_join_ordered_linkP(rt_link, jo_link_var_6)) {
                                                    if (NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_transformation_linkP(rt_link, t_link_var)) {
                                                        {
                                                            SubLObject motivating_jo_link = inference_worker_residual_transformation.residual_transformation_link_motivating_join_ordered_link(rt_link);
                                                            SubLObject supported_problem_10 = inference_datastructures_problem_link.problem_link_supported_problem(rt_link);
                                                            SubLObject supported_problem_needed_vars = com.cyc.cycjava.cycl.inference.harness.inference_tactician.supported_problem_needed_term_chosen_vars(rt_link);
                                                            SubLObject set_contents_var_11 = inference_datastructures_problem.problem_argument_links(supported_problem_10);
                                                            SubLObject basis_object_12 = set_contents.do_set_contents_basis_object(set_contents_var_11);
                                                            SubLObject state_13 = NIL;
                                                            for (state_13 = set_contents.do_set_contents_initial_state(basis_object_12, set_contents_var_11); NIL == set_contents.do_set_contents_doneP(basis_object_12, state_13); state_13 = set_contents.do_set_contents_update_state(state_13)) {
                                                                {
                                                                    SubLObject candidate_jo_link = set_contents.do_set_contents_next(basis_object_12, state_13);
                                                                    if (NIL != set_contents.do_set_contents_element_validP(state_13, candidate_jo_link)) {
                                                                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(candidate_jo_link, $JOIN_ORDERED)) {
                                                                            if (candidate_jo_link != motivating_jo_link) {
                                                                                if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician.focal_problem_binds_all_varsP(candidate_jo_link, supported_problem_needed_vars)) {
                                                                                    {
                                                                                        SubLObject link_var = candidate_jo_link;
                                                                                        SubLObject set_contents_var_14 = inference_datastructures_problem.problem_argument_links(inference_worker_join_ordered.join_ordered_link_non_focal_problem(link_var));
                                                                                        SubLObject basis_object_15 = set_contents.do_set_contents_basis_object(set_contents_var_14);
                                                                                        SubLObject state_16 = NIL;
                                                                                        for (state_16 = set_contents.do_set_contents_initial_state(basis_object_15, set_contents_var_14); NIL == set_contents.do_set_contents_doneP(basis_object_15, state_16); state_16 = set_contents.do_set_contents_update_state(state_16)) {
                                                                                            {
                                                                                                SubLObject restriction_link = set_contents.do_set_contents_next(basis_object_15, state_16);
                                                                                                if (NIL != set_contents.do_set_contents_element_validP(state_16, restriction_link)) {
                                                                                                    if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $RESTRICTION)) {
                                                                                                        if (NIL != inference_worker_join_ordered.non_focal_restriction_link_with_corresponding_focal_proofP(restriction_link, link_var)) {
                                                                                                            {
                                                                                                                SubLObject restricted_non_focal_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(restriction_link);
                                                                                                                problems = cons(restricted_non_focal_problem, problems);
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
            }
            return nreverse(problems);
        }
    }

    @LispMethod(comment = "Walks up to find join-ordered dependent links of T-LINK\'s supported problem.\r\nFor each such join-ordered link, if its focal problem binds all dead-end #$termChosen literals of T-LINK,\r\nthen we push it onto the result, to be made a new root.\r\nThis is the only way to ensure completeness, to get around #$termChosen.\nWalks up to find join-ordered dependent links of T-LINK\'s supported problem.\nFor each such join-ordered link, if its focal problem binds all dead-end #$termChosen literals of T-LINK,\nthen we push it onto the result, to be made a new root.\nThis is the only way to ensure completeness, to get around #$termChosen.")
    public static SubLObject all_restricted_non_focals_around_transformation_link(final SubLObject t_link) {
        SubLObject problems = NIL;
        final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(t_link);
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supported_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject jo_link_var;
        SubLObject jo_link_var_$6;
        SubLObject motivating_conjunction_problem;
        SubLObject set_contents_var_$7;
        SubLObject basis_object_$8;
        SubLObject state_$9;
        SubLObject rt_link;
        SubLObject motivating_jo_link;
        SubLObject supported_problem_$10;
        SubLObject supported_problem_needed_vars;
        SubLObject set_contents_var_$8;
        SubLObject basis_object_$9;
        SubLObject state_$10;
        SubLObject candidate_jo_link;
        SubLObject link_var;
        SubLObject set_contents_var_$9;
        SubLObject basis_object_$10;
        SubLObject state_$11;
        SubLObject restriction_link;
        SubLObject restricted_non_focal_problem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            jo_link_var = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, jo_link_var)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link_var, $JOIN_ORDERED))) {
                jo_link_var_$6 = jo_link_var;
                motivating_conjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link_var_$6);
                set_contents_var_$7 = inference_datastructures_problem.problem_argument_links(motivating_conjunction_problem);
                for (basis_object_$8 = set_contents.do_set_contents_basis_object(set_contents_var_$7), state_$9 = NIL, state_$9 = set_contents.do_set_contents_initial_state(basis_object_$8, set_contents_var_$7); NIL == set_contents.do_set_contents_doneP(basis_object_$8, state_$9); state_$9 = set_contents.do_set_contents_update_state(state_$9)) {
                    rt_link = set_contents.do_set_contents_next(basis_object_$8, state_$9);
                    if ((((NIL != set_contents.do_set_contents_element_validP(state_$9, rt_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(rt_link, $RESIDUAL_TRANSFORMATION))) && (NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_join_ordered_linkP(rt_link, jo_link_var_$6))) && (NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_transformation_linkP(rt_link, t_link))) {
                        motivating_jo_link = inference_worker_residual_transformation.residual_transformation_link_motivating_join_ordered_link(rt_link);
                        supported_problem_$10 = inference_datastructures_problem_link.problem_link_supported_problem(rt_link);
                        supported_problem_needed_vars = supported_problem_needed_term_chosen_vars(rt_link);
                        set_contents_var_$8 = inference_datastructures_problem.problem_argument_links(supported_problem_$10);
                        for (basis_object_$9 = set_contents.do_set_contents_basis_object(set_contents_var_$8), state_$10 = NIL, state_$10 = set_contents.do_set_contents_initial_state(basis_object_$9, set_contents_var_$8); NIL == set_contents.do_set_contents_doneP(basis_object_$9, state_$10); state_$10 = set_contents.do_set_contents_update_state(state_$10)) {
                            candidate_jo_link = set_contents.do_set_contents_next(basis_object_$9, state_$10);
                            if ((((NIL != set_contents.do_set_contents_element_validP(state_$10, candidate_jo_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(candidate_jo_link, $JOIN_ORDERED))) && (!candidate_jo_link.eql(motivating_jo_link))) && (NIL != focal_problem_binds_all_varsP(candidate_jo_link, supported_problem_needed_vars))) {
                                link_var = candidate_jo_link;
                                set_contents_var_$9 = inference_datastructures_problem.problem_argument_links(inference_worker_join_ordered.join_ordered_link_non_focal_problem(link_var));
                                for (basis_object_$10 = set_contents.do_set_contents_basis_object(set_contents_var_$9), state_$11 = NIL, state_$11 = set_contents.do_set_contents_initial_state(basis_object_$10, set_contents_var_$9); NIL == set_contents.do_set_contents_doneP(basis_object_$10, state_$11); state_$11 = set_contents.do_set_contents_update_state(state_$11)) {
                                    restriction_link = set_contents.do_set_contents_next(basis_object_$10, state_$11);
                                    if (((NIL != set_contents.do_set_contents_element_validP(state_$11, restriction_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $RESTRICTION))) && (NIL != inference_worker_join_ordered.non_focal_restriction_link_with_corresponding_focal_proofP(restriction_link, link_var))) {
                                        restricted_non_focal_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(restriction_link);
                                        problems = cons(restricted_non_focal_problem, problems);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return nreverse(problems);
    }

    /**
     *
     *
     * @param RT-LINK;
     * 		a residual transformation link with a residual conjunction problem
     * 		that has at least one unbound #$termChosen literal.
     * @return the list of variables in RT-LINK's supported problem that would need to get
    bound for its residual conjunction problem to be solvable.
     */
    @LispMethod(comment = "@param RT-LINK;\r\n\t\ta residual transformation link with a residual conjunction problem\r\n\t\tthat has at least one unbound #$termChosen literal.\r\n@return the list of variables in RT-LINK\'s supported problem that would need to get\r\nbound for its residual conjunction problem to be solvable.")
    public static final SubLObject supported_problem_needed_term_chosen_vars_alt(SubLObject rt_link) {
        {
            SubLObject residual_conjunction_mapped_problem = inference_worker_residual_transformation.residual_transformation_link_supporting_mapped_problem(rt_link);
            SubLObject residual_conjunction_to_supported_variable_map = inference_worker_residual_transformation.residual_transformation_link_residual_conjunction_to_motivating_conjunction_variable_map(rt_link);
            SubLObject residual_conjunction_problem_needed_vars = com.cyc.cycjava.cycl.inference.harness.inference_tactician.problem_term_chosen_dead_end_vars(inference_datastructures_problem_link.mapped_problem_problem(residual_conjunction_mapped_problem));
            SubLObject supported_problem_needed_vars = bindings.apply_bindings(residual_conjunction_to_supported_variable_map, residual_conjunction_problem_needed_vars);
            return supported_problem_needed_vars;
        }
    }

    /**
     *
     *
     * @param RT-LINK;
     * 		a residual transformation link with a residual conjunction problem
     * 		that has at least one unbound #$termChosen literal.
     * @return the list of variables in RT-LINK's supported problem that would need to get
    bound for its residual conjunction problem to be solvable.
     */
    @LispMethod(comment = "@param RT-LINK;\r\n\t\ta residual transformation link with a residual conjunction problem\r\n\t\tthat has at least one unbound #$termChosen literal.\r\n@return the list of variables in RT-LINK\'s supported problem that would need to get\r\nbound for its residual conjunction problem to be solvable.")
    public static SubLObject supported_problem_needed_term_chosen_vars(final SubLObject rt_link) {
        final SubLObject residual_conjunction_mapped_problem = inference_worker_residual_transformation.residual_transformation_link_supporting_mapped_problem(rt_link);
        final SubLObject residual_conjunction_to_supported_variable_map = inference_worker_residual_transformation.residual_transformation_link_residual_conjunction_to_motivating_conjunction_variable_map(rt_link);
        final SubLObject residual_conjunction_problem_needed_vars = problem_term_chosen_dead_end_vars(inference_datastructures_problem_link.mapped_problem_problem(residual_conjunction_mapped_problem));
        final SubLObject supported_problem_needed_vars = bindings.apply_bindings(residual_conjunction_to_supported_variable_map, residual_conjunction_problem_needed_vars);
        return supported_problem_needed_vars;
    }

    /**
     *
     *
     * @param VARS;
     * 		variables in the space of JO-LINK's supported problem.
     * @return booleanp; whether JO-LINK's focal problem contains
    all the variables needed to bind all the variables in VARS.
    i.e. whether JO-LINK's focal variables are a superset of VARS.
     */
    @LispMethod(comment = "@param VARS;\r\n\t\tvariables in the space of JO-LINK\'s supported problem.\r\n@return booleanp; whether JO-LINK\'s focal problem contains\r\nall the variables needed to bind all the variables in VARS.\r\ni.e. whether JO-LINK\'s focal variables are a superset of VARS.")
    public static final SubLObject focal_problem_binds_all_varsP_alt(SubLObject jo_link, SubLObject vars) {
        {
            SubLObject focal_to_supported_variable_map = inference_worker_join_ordered.join_ordered_link_focal_to_supported_variable_map(jo_link);
            SubLObject focal_problem_bound_vars = inference_datastructures_problem.problem_variables(inference_worker_join_ordered.join_ordered_link_focal_problem(jo_link));
            SubLObject supported_problem_bound_vars = bindings.apply_bindings(focal_to_supported_variable_map, focal_problem_bound_vars);
            return subsetp(vars, supported_problem_bound_vars, UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @param VARS;
     * 		variables in the space of JO-LINK's supported problem.
     * @return booleanp; whether JO-LINK's focal problem contains
    all the variables needed to bind all the variables in VARS.
    i.e. whether JO-LINK's focal variables are a superset of VARS.
     */
    @LispMethod(comment = "@param VARS;\r\n\t\tvariables in the space of JO-LINK\'s supported problem.\r\n@return booleanp; whether JO-LINK\'s focal problem contains\r\nall the variables needed to bind all the variables in VARS.\r\ni.e. whether JO-LINK\'s focal variables are a superset of VARS.")
    public static SubLObject focal_problem_binds_all_varsP(final SubLObject jo_link, final SubLObject vars) {
        final SubLObject focal_to_supported_variable_map = inference_worker_join_ordered.join_ordered_link_focal_to_supported_variable_map(jo_link);
        final SubLObject focal_problem_bound_vars = inference_datastructures_problem.problem_variables(inference_worker_join_ordered.join_ordered_link_focal_problem(jo_link));
        final SubLObject supported_problem_bound_vars = bindings.apply_bindings(focal_to_supported_variable_map, focal_problem_bound_vars);
        return subsetp(vars, supported_problem_bound_vars, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject strategem_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician.executable_strategem_p(v_object)) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician.motivation_strategem_p(v_object))) || (NIL != inference_datastructures_problem.problem_p(v_object)));
    }

    public static SubLObject strategem_p(final SubLObject v_object) {
        return makeBoolean(((NIL != executable_strategem_p(v_object)) || (NIL != motivation_strategem_p(v_object))) || (NIL != inference_datastructures_problem.problem_p(v_object)));
    }

    public static final SubLObject executable_strategem_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != inference_worker.content_tactic_p(v_object)) || (NIL != inference_worker.meta_structural_tactic_p(v_object)));
    }

    public static SubLObject executable_strategem_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_worker.content_tactic_p(v_object)) || (NIL != inference_worker.meta_structural_tactic_p(v_object)));
    }

    public static final SubLObject strategem_invalid_p_alt(SubLObject strategem) {
        if (NIL != inference_datastructures_tactic.tactic_p(strategem)) {
            return inference_datastructures_tactic.tactic_invalid_p(strategem);
        } else {
            if (NIL != inference_datastructures_problem_link.problem_link_p(strategem)) {
                return inference_datastructures_problem_link.problem_link_invalid_p(strategem);
            } else {
                if (NIL != inference_datastructures_problem.problem_p(strategem)) {
                    return inference_datastructures_problem.problem_invalid_p(strategem);
                } else {
                    return Errors.error($str_alt51$Unexpected_strategem_type__s, strategem);
                }
            }
        }
    }

    public static SubLObject strategem_invalid_p(final SubLObject strategem) {
        if (NIL != inference_datastructures_tactic.tactic_p(strategem)) {
            return inference_datastructures_tactic.tactic_invalid_p(strategem);
        }
        if (NIL != inference_datastructures_problem_link.problem_link_p(strategem)) {
            return inference_datastructures_problem_link.problem_link_invalid_p(strategem);
        }
        if (NIL != inference_datastructures_problem.problem_p(strategem)) {
            return inference_datastructures_problem.problem_invalid_p(strategem);
        }
        return Errors.error($str54$Unexpected_strategem_type__s, strategem);
    }

    /**
     *
     *
     * @return nil or problem-p.  It will be NIL for an answer link
     */
    @LispMethod(comment = "@return nil or problem-p.  It will be NIL for an answer link")
    public static final SubLObject strategem_problem_alt(SubLObject strategem) {
        if (NIL != inference_datastructures_tactic.tactic_p(strategem)) {
            return inference_datastructures_tactic.tactic_problem(strategem);
        } else {
            if (NIL != inference_datastructures_problem_link.problem_link_p(strategem)) {
                return inference_datastructures_problem_link.problem_link_supported_problem(strategem);
            } else {
                if (NIL != inference_datastructures_problem.problem_p(strategem)) {
                    return strategem;
                } else {
                    return Errors.error($str_alt51$Unexpected_strategem_type__s, strategem);
                }
            }
        }
    }

    /**
     *
     *
     * @return nil or problem-p.  It will be NIL for an answer link
     */
    @LispMethod(comment = "@return nil or problem-p.  It will be NIL for an answer link")
    public static SubLObject strategem_problem(final SubLObject strategem) {
        if (NIL != inference_datastructures_tactic.tactic_p(strategem)) {
            return inference_datastructures_tactic.tactic_problem(strategem);
        }
        if (NIL != inference_datastructures_problem_link.problem_link_p(strategem)) {
            return inference_datastructures_problem_link.problem_link_supported_problem(strategem);
        }
        if (NIL != inference_datastructures_problem.problem_p(strategem)) {
            return strategem;
        }
        return Errors.error($str55$Unexpected_strategem_ype__s, strategem);
    }

    public static SubLObject strategem_supported_object(final SubLObject strategem) {
        if (NIL != inference_worker_answer.answer_link_p(strategem)) {
            return inference_datastructures_problem_link.problem_link_supported_object(strategem);
        }
        return strategem_problem(strategem);
    }

    /**
     * A strategem which propagates removal and/or transformation motivation.
     * Sometimes called a 'link head' because it specifies a specific supporting
     * mapped problem of a link, to which motivation should be propagated.
     */
    @LispMethod(comment = "A strategem which propagates removal and/or transformation motivation.\r\nSometimes called a \'link head\' because it specifies a specific supporting\r\nmapped problem of a link, to which motivation should be propagated.\nA strategem which propagates removal and/or transformation motivation.\nSometimes called a \'link head\' because it specifies a specific supporting\nmapped problem of a link, to which motivation should be propagated.")
    public static final SubLObject motivation_strategem_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != inference_worker.logical_tactic_p(v_object)) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician.motivation_strategem_link_p(v_object)));
    }

    @LispMethod(comment = "A strategem which propagates removal and/or transformation motivation.\r\nSometimes called a \'link head\' because it specifies a specific supporting\r\nmapped problem of a link, to which motivation should be propagated.\nA strategem which propagates removal and/or transformation motivation.\nSometimes called a \'link head\' because it specifies a specific supporting\nmapped problem of a link, to which motivation should be propagated.")
    public static SubLObject motivation_strategem_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_worker.logical_tactic_p(v_object)) || (NIL != motivation_strategem_link_p(v_object)));
    }/**
     * A strategem which propagates removal and/or transformation motivation.
     * Sometimes called a 'link head' because it specifies a specific supporting
     * mapped problem of a link, to which motivation should be propagated.
     */


    /**
     * Strategems that make a new root.
     * The answer link is a special case of a new root, because the root problem
     * doesn't necessarily have T.
     */
    @LispMethod(comment = "Strategems that make a new root.\r\nThe answer link is a special case of a new root, because the root problem\r\ndoesn\'t necessarily have T.\nStrategems that make a new root.\nThe answer link is a special case of a new root, because the root problem\ndoesn\'t necessarily have T.")
    public static final SubLObject motivation_strategem_link_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != inference_worker_transformation.transformation_link_p(v_object)) || (NIL != answer_link_p(v_object)));
    }

    @LispMethod(comment = "Strategems that make a new root.\r\nThe answer link is a special case of a new root, because the root problem\r\ndoesn\'t necessarily have T.\nStrategems that make a new root.\nThe answer link is a special case of a new root, because the root problem\ndoesn\'t necessarily have T.")
    public static SubLObject motivation_strategem_link_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_worker_transformation.transformation_link_p(v_object)) || (NIL != inference_worker_answer.answer_link_p(v_object)));
    }/**
     * Strategems that make a new root.
     * The answer link is a special case of a new root, because the root problem
     * doesn't necessarily have T.
     */


    /**
     * Return T iff OBJECT is a strategem wrt removal.
     */
    @LispMethod(comment = "Return T iff OBJECT is a strategem wrt removal.")
    public static final SubLObject removal_strategem_p_alt(SubLObject v_object) {
        return makeBoolean(((((NIL != inference_worker_removal.generalized_removal_tactic_p(v_object)) || (NIL != inference_worker_rewrite.rewrite_tactic_p(v_object))) || (NIL != inference_worker.logical_tactic_p(v_object))) || (NIL != inference_worker.meta_structural_tactic_p(v_object))) || (NIL != answer_link_p(v_object)));
    }

    @LispMethod(comment = "Return T iff OBJECT is a strategem wrt removal.")
    public static SubLObject removal_strategem_p(final SubLObject v_object) {
        return makeBoolean(((((NIL != inference_worker_removal.generalized_removal_tactic_p(v_object)) || (NIL != inference_worker_rewrite.rewrite_tactic_p(v_object))) || (NIL != inference_worker.logical_tactic_p(v_object))) || (NIL != inference_worker.meta_structural_tactic_p(v_object))) || (NIL != inference_worker_answer.answer_link_p(v_object)));
    }/**
     * Return T iff OBJECT is a strategem wrt removal.
     */


    /**
     * Return T iff OBJECT is a strategem wrt transformation.
     */
    @LispMethod(comment = "Return T iff OBJECT is a strategem wrt transformation.")
    public static final SubLObject transformation_strategem_p_alt(SubLObject v_object) {
        return makeBoolean((((NIL != inference_worker_transformation.transformation_tactic_p(v_object)) || (NIL != inference_worker.logical_tactic_p(v_object))) || (NIL != inference_worker.meta_structural_tactic_p(v_object))) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician.motivation_strategem_link_p(v_object)));
    }

    @LispMethod(comment = "Return T iff OBJECT is a strategem wrt transformation.")
    public static SubLObject transformation_strategem_p(final SubLObject v_object) {
        return makeBoolean((((NIL != inference_worker_transformation.transformation_tactic_p(v_object)) || (NIL != inference_worker.logical_tactic_p(v_object))) || (NIL != inference_worker.meta_structural_tactic_p(v_object))) || (NIL != motivation_strategem_link_p(v_object)));
    }/**
     * Return T iff OBJECT is a strategem wrt transformation.
     */


    public static SubLObject strategem_suid(final SubLObject strategem) {
        if (NIL != inference_datastructures_tactic.tactic_p(strategem)) {
            return inference_datastructures_tactic.tactic_suid(strategem);
        }
        if (NIL != inference_datastructures_problem_link.problem_link_p(strategem)) {
            return inference_datastructures_problem_link.problem_link_suid(strategem);
        }
        if (NIL != inference_datastructures_problem.problem_p(strategem)) {
            return inference_datastructures_problem.problem_suid(strategem);
        }
        return Errors.error($str56$unexpected_strategem___S, strategem);
    }

    public static SubLObject strategem_L(final SubLObject strategem1, final SubLObject strategem2) {
        final SubLObject object1 = strategem_supported_object(strategem1);
        final SubLObject object2 = strategem_supported_object(strategem2);
        if (NIL != inference_datastructures_inference.inference_p(object1)) {
            if (NIL != inference_datastructures_inference.inference_p(object2)) {
                return numL(strategem_suid(strategem1), strategem_suid(strategem2));
            }
            return T;
        } else {
            if (NIL != inference_datastructures_inference.inference_p(object2)) {
                return NIL;
            }
            if (!object1.eql(object2)) {
                return numL(inference_datastructures_problem.problem_suid(object1), inference_datastructures_problem.problem_suid(object1));
            }
            if (type_of(strategem1).eql(type_of(strategem2))) {
                return numL(strategem_suid(strategem1), strategem_suid(strategem2));
            }
            return list_utilities.position_L(strategem1, strategem2, $list57, symbol_function(EQ), symbol_function(TYPE_OF));
        }
    }

    /**
     * Declares a strategy type to the inference engine.
     */
    @LispMethod(comment = "Declares a strategy type to the inference engine.")
    public static final SubLObject inference_strategy_type_alt(SubLObject strategy_type, SubLObject plist) {
        return inference_datastructures_strategy.new_strategy_type(strategy_type, plist);
    }

    @LispMethod(comment = "Declares a strategy type to the inference engine.")
    public static SubLObject inference_strategy_type(final SubLObject strategy_type, final SubLObject plist) {
        return inference_datastructures_strategy.new_strategy_type(strategy_type, plist);
    }/**
     * Declares a strategy type to the inference engine.
     */


    /**
     *
     *
     * @return function-spec-p
     */
    @LispMethod(comment = "@return function-spec-p")
    public static final SubLObject strategy_type_dispatch_handler_alt(SubLObject strategy_type, SubLObject method_type) {
        return inference_datastructures_strategy.strategy_type_property(strategy_type, method_type);
    }

    /**
     *
     *
     * @return function-spec-p
     */
    @LispMethod(comment = "@return function-spec-p")
    public static SubLObject strategy_type_dispatch_handler(final SubLObject strategy_type, final SubLObject method_type) {
        return inference_datastructures_strategy.strategy_type_property(strategy_type, method_type);
    }

    /**
     * :negative-infinity = infinitely unhappy
     * negative           = unhappy
     * 0                  = agnostic
     * positive           = happy
     * :positive-infinity = infinitely happy
     */
    @LispMethod(comment = ":negative-infinity = infinitely unhappy\r\nnegative           = unhappy\r\n0                  = agnostic\r\npositive           = happy\r\n:positive-infinity = infinitely happy\n:negative-infinity = infinitely unhappy\nnegative           = unhappy\n0                  = agnostic\npositive           = happy\n:positive-infinity = infinitely happy")
    public static final SubLObject happiness_p_alt(SubLObject v_object) {
        return number_utilities.potentially_infinite_integer_p(v_object);
    }

    @LispMethod(comment = ":negative-infinity = infinitely unhappy\r\nnegative           = unhappy\r\n0                  = agnostic\r\npositive           = happy\r\n:positive-infinity = infinitely happy\n:negative-infinity = infinitely unhappy\nnegative           = unhappy\n0                  = agnostic\npositive           = happy\n:positive-infinity = infinitely happy")
    public static SubLObject happiness_p(final SubLObject v_object) {
        return number_utilities.potentially_infinite_integer_p(v_object);
    }/**
     * :negative-infinity = infinitely unhappy
     * negative           = unhappy
     * 0                  = agnostic
     * positive           = happy
     * :positive-infinity = infinitely happy
     */


    public static final SubLObject happiness_E_alt(SubLObject happiness1, SubLObject happiness2) {
        return number_utilities.potentially_infinite_integer_E(happiness1, happiness2);
    }

    public static SubLObject happiness_E(final SubLObject happiness1, final SubLObject happiness2) {
        return number_utilities.potentially_infinite_integer_E(happiness1, happiness2);
    }

    public static final SubLObject happiness_L_alt(SubLObject happiness1, SubLObject happiness2) {
        return number_utilities.potentially_infinite_integer_L(happiness1, happiness2);
    }

    public static SubLObject happiness_L(final SubLObject happiness1, final SubLObject happiness2) {
        return number_utilities.potentially_infinite_integer_L(happiness1, happiness2);
    }

    public static final SubLObject happiness_G_alt(SubLObject happiness1, SubLObject happiness2) {
        return number_utilities.potentially_infinite_integer_G(happiness1, happiness2);
    }

    public static SubLObject happiness_G(final SubLObject happiness1, final SubLObject happiness2) {
        return number_utilities.potentially_infinite_integer_G(happiness1, happiness2);
    }

    public static final SubLObject happiness_min_alt(SubLObject happiness1, SubLObject happiness2) {
        return NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician.happiness_L(happiness1, happiness2) ? ((SubLObject) (happiness1)) : happiness2;
    }

    public static SubLObject happiness_min(final SubLObject happiness1, final SubLObject happiness2) {
        return NIL != happiness_L(happiness1, happiness2) ? happiness1 : happiness2;
    }

    public static final SubLObject happiness_max_alt(SubLObject happiness1, SubLObject happiness2) {
        return NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician.happiness_G(happiness1, happiness2) ? ((SubLObject) (happiness1)) : happiness2;
    }

    public static SubLObject happiness_max(final SubLObject happiness1, final SubLObject happiness2) {
        return NIL != happiness_G(happiness1, happiness2) ? happiness1 : happiness2;
    }

    public static final SubLObject minimal_happiness_alt() {
        return $NEGATIVE_INFINITY;
    }

    public static SubLObject minimal_happiness() {
        return $NEGATIVE_INFINITY;
    }

    public static SubLObject happiness_index_p(final SubLObject v_object) {
        return makeBoolean(((v_object.isVector() && TWO_INTEGER.numE(length(v_object))) && aref(v_object, ZERO_INTEGER).isHashtable()) && (NIL != queues.priority_queue_p(aref(v_object, ONE_INTEGER))));
    }

    public static SubLObject new_happiness_index() {
        final SubLObject happiness_to_objects = make_hash_table(ZERO_INTEGER, symbol_function(EQL), UNPROVIDED);
        final SubLObject greatest_happiness_index = queues.create_p_queue(NIL, symbol_function(IDENTITY), $sym60$HAPPINESS__);
        return vector(new SubLObject[]{ happiness_to_objects, greatest_happiness_index });
    }

    public static SubLObject happiness_index_clear(final SubLObject happiness_index) {
        clrhash(aref(happiness_index, ZERO_INTEGER));
        queues.p_queue_clear(aref(happiness_index, ONE_INTEGER));
        return happiness_index;
    }

    public static SubLObject happiness_index_empty_p(final SubLObject happiness_index) {
        final SubLObject greatest_happiness_index = aref(happiness_index, ONE_INTEGER);
        return queues.p_queue_empty_p(greatest_happiness_index);
    }

    public static SubLObject happiness_index_add(final SubLObject happiness_index, final SubLObject happiness, final SubLObject v_object) {
        assert NIL != happiness_p(happiness) : "! inference_tactician.happiness_p(happiness) " + ("inference_tactician.happiness_p(happiness) " + "CommonSymbols.NIL != inference_tactician.happiness_p(happiness) ") + happiness;
        final SubLObject happiness_to_objects = aref(happiness_index, ZERO_INTEGER);
        SubLObject object_stack = gethash_without_values(happiness, happiness_to_objects, NIL);
        if (NIL == object_stack) {
            object_stack = stacks.create_stack();
            sethash(happiness, happiness_to_objects, object_stack);
        }
        if (NIL != stacks.stack_empty_p(object_stack)) {
            final SubLObject greatest_happiness_index = aref(happiness_index, ONE_INTEGER);
            queues.p_enqueue(happiness, greatest_happiness_index);
        }
        stacks.stack_push(v_object, object_stack);
        return happiness_index;
    }

    public static SubLObject happiness_index_peek(final SubLObject happiness_index) {
        SubLObject v_object = NIL;
        SubLObject expected_happiness = NIL;
        final SubLObject happiness_to_objects = aref(happiness_index, ZERO_INTEGER);
        final SubLObject greatest_happiness_index = aref(happiness_index, ONE_INTEGER);
        final SubLObject greatest_happiness = queues.p_queue_best(greatest_happiness_index);
        final SubLObject object_stack = gethash_without_values(greatest_happiness, happiness_to_objects, $ERROR);
        if ($ERROR == object_stack) {
            Errors.error($str63$No_object_stack_for_happiness__S, greatest_happiness);
        } else
            if (NIL != stacks.stack_empty_p(object_stack)) {
                Errors.error($str64$No_objects_for_happiness__S, greatest_happiness);
            } else {
                v_object = stacks.stack_peek(object_stack);
                expected_happiness = greatest_happiness;
            }

        return values(v_object, expected_happiness);
    }

    public static SubLObject happiness_index_next(final SubLObject happiness_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_object = NIL;
        SubLObject expected_happiness = NIL;
        final SubLObject happiness_to_objects = aref(happiness_index, ZERO_INTEGER);
        final SubLObject greatest_happiness_index = aref(happiness_index, ONE_INTEGER);
        final SubLObject greatest_happiness = queues.p_queue_best(greatest_happiness_index);
        final SubLObject object_stack = gethash_without_values(greatest_happiness, happiness_to_objects, $ERROR);
        if ($ERROR == object_stack) {
            Errors.error($str63$No_object_stack_for_happiness__S, greatest_happiness);
        } else
            if (NIL != stacks.stack_empty_p(object_stack)) {
                Errors.error($str64$No_objects_for_happiness__S, greatest_happiness);
            } else {
                v_object = stacks.stack_pop(object_stack);
                expected_happiness = greatest_happiness;
                if (NIL != stacks.stack_empty_p(object_stack)) {
                    final SubLObject removed_happiness = queues.p_dequeue(greatest_happiness_index, UNPROVIDED);
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == happiness_E(removed_happiness, greatest_happiness))) {
                        Errors.error($str65$Removed__S_but__S_was_lowest_happ, removed_happiness, greatest_happiness);
                    }
                }
            }

        return values(v_object, expected_happiness);
    }

    public static SubLObject happiness_index_contents(final SubLObject happiness_index) {
        assert NIL != happiness_index_p(happiness_index) : "! inference_tactician.happiness_index_p(happiness_index) " + ("inference_tactician.happiness_index_p(happiness_index) " + "CommonSymbols.NIL != inference_tactician.happiness_index_p(happiness_index) ") + happiness_index;
        final SubLObject happiness_to_objects = aref(happiness_index, ZERO_INTEGER);
        final SubLObject greatest_happiness_index = aref(happiness_index, ONE_INTEGER);
        SubLObject happiness_contents = NIL;
        SubLObject cdolist_list_var = queues.p_queue_elements(greatest_happiness_index);
        SubLObject happiness = NIL;
        happiness = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject object_stack = gethash_without_values(happiness, happiness_to_objects, $ERROR);
            SubLObject objects = NIL;
            SubLObject cdolist_list_var_$17 = stacks.do_stack_elements_stack_elements(object_stack);
            SubLObject v_object = NIL;
            v_object = cdolist_list_var_$17.first();
            while (NIL != cdolist_list_var_$17) {
                objects = cons(v_object, objects);
                cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                v_object = cdolist_list_var_$17.first();
            } 
            objects = nreverse(objects);
            happiness_contents = cons(list(happiness, objects), happiness_contents);
            cdolist_list_var = cdolist_list_var.rest();
            happiness = cdolist_list_var.first();
        } 
        happiness_contents = nreverse(happiness_contents);
        return happiness_contents;
    }

    public static SubLObject happiness_index_size(final SubLObject happiness_index) {
        SubLObject size = ZERO_INTEGER;
        final SubLObject happiness_to_objects = aref(happiness_index, ZERO_INTEGER);
        final SubLObject greatest_happiness_index = aref(happiness_index, ONE_INTEGER);
        SubLObject cdolist_list_var = queues.p_queue_elements(greatest_happiness_index);
        SubLObject happiness = NIL;
        happiness = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject object_stack = gethash_without_values(happiness, happiness_to_objects, UNPROVIDED);
            size = add(size, stacks.stack_size(object_stack));
            cdolist_list_var = cdolist_list_var.rest();
            happiness = cdolist_list_var.first();
        } 
        return size;
    }

    public static SubLObject strategy_happiness_table(final SubLObject strategy) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $HAPPINESS_TABLE, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject strategy_initialize_properties_alt(SubLObject strategy, SubLObject strategy_static_properties) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $INITIALIZE_PROPERTIES, strategy_static_properties, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject strategy_initialize_properties(final SubLObject strategy, final SubLObject strategy_static_properties) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $INITIALIZE_PROPERTIES, strategy_static_properties, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject default_strategy_initialize_properties_alt(SubLObject strategy, SubLObject strategy_static_properties) {
        inference_datastructures_strategy.set_strategy_properties(strategy, strategy_static_properties);
        return NIL;
    }

    public static SubLObject default_strategy_initialize_properties(final SubLObject strategy, final SubLObject strategy_static_properties) {
        inference_datastructures_strategy.set_strategy_properties(strategy, strategy_static_properties);
        return NIL;
    }

    public static final SubLObject strategy_update_properties_alt(SubLObject strategy, SubLObject strategy_dynamic_properties) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $UPDATE_PROPERTIES, strategy_dynamic_properties, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject strategy_update_properties(final SubLObject strategy, final SubLObject strategy_dynamic_properties) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $UPDATE_PROPERTIES, strategy_dynamic_properties, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject default_strategy_update_properties_alt(SubLObject strategy, SubLObject strategy_dynamic_properties) {
        inference_datastructures_strategy.set_strategy_properties(strategy, strategy_dynamic_properties);
        return NIL;
    }

    public static SubLObject default_strategy_update_properties(final SubLObject strategy, final SubLObject strategy_dynamic_properties) {
        inference_datastructures_strategy.set_strategy_properties(strategy, strategy_dynamic_properties);
        return NIL;
    }

    /**
     * Callback for STRATEGY to note that its inference's dynamic properties have been updated.
     */
    @LispMethod(comment = "Callback for STRATEGY to note that its inference\'s dynamic properties have been updated.")
    public static final SubLObject strategy_note_inference_dynamic_properties_updated_alt(SubLObject strategy) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $INFERENCE_DYNAMIC_PROPERTIES_UPDATED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Callback for STRATEGY to note that its inference\'s dynamic properties have been updated.")
    public static SubLObject strategy_note_inference_dynamic_properties_updated(final SubLObject strategy) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $INFERENCE_DYNAMIC_PROPERTIES_UPDATED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }/**
     * Callback for STRATEGY to note that its inference's dynamic properties have been updated.
     */


    public static final SubLObject default_strategy_note_inference_dynamic_properties_updated_alt(SubLObject strategy) {
        inference_datastructures_strategy.note_strategy_should_reconsider_set_asides(strategy);
        return NIL;
    }

    public static SubLObject default_strategy_note_inference_dynamic_properties_updated(final SubLObject strategy) {
        inference_datastructures_strategy.note_strategy_should_reconsider_set_asides(strategy);
        return NIL;
    }

    /**
     * By default, this is simply the list (STRATEGY), but can be overridden
     */
    @LispMethod(comment = "By default, this is simply the list (STRATEGY), but can be overridden")
    public static final SubLObject strategy_initial_relevant_strategies_alt(SubLObject strategy) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $INITIAL_RELEVANT_STRATEGIES, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "By default, this is simply the list (STRATEGY), but can be overridden")
    public static SubLObject strategy_initial_relevant_strategies(final SubLObject strategy) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $INITIAL_RELEVANT_STRATEGIES, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }/**
     * By default, this is simply the list (STRATEGY), but can be overridden
     */


    public static final SubLObject default_strategy_initial_relevant_strategies_alt(SubLObject strategy) {
        return list(strategy);
    }

    public static SubLObject default_strategy_initial_relevant_strategies(final SubLObject strategy) {
        return list(strategy);
    }

    public static final SubLObject strategy_note_split_tactics_strategically_possible_alt(SubLObject strategy, SubLObject split_tactics) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $SPLIT_TACTICS_POSSIBLE, split_tactics, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject strategy_note_split_tactics_strategically_possible(final SubLObject strategy, final SubLObject split_tactics) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $SPLIT_TACTICS_POSSIBLE, split_tactics, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject strategy_note_tactic_discarded_alt(SubLObject strategy, SubLObject tactic) {
        if (NIL == inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_ignore_tacticP(strategy, tactic)) {
            inference_datastructures_strategy.problem_note_tactic_not_strategically_possible(inference_datastructures_tactic.tactic_problem(tactic), tactic, strategy);
        }
        return NIL;
    }

    public static SubLObject strategy_note_tactic_discarded(final SubLObject strategy, final SubLObject tactic) {
        if (NIL == inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_ignore_tacticP(strategy, tactic)) {
            inference_datastructures_strategy.problem_note_tactic_not_strategically_possible(inference_datastructures_tactic.tactic_problem(tactic), tactic, strategy);
        }
        return NIL;
    }

    /**
     * Depending on what type of tactic TACTIC is,
     * compute its strategic properties wrt STRATEGY.
     */
    @LispMethod(comment = "Depending on what type of tactic TACTIC is,\r\ncompute its strategic properties wrt STRATEGY.\nDepending on what type of tactic TACTIC is,\ncompute its strategic properties wrt STRATEGY.")
    public static final SubLObject strategy_note_new_tactic_alt(SubLObject strategy, SubLObject tactic) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $NEW_TACTIC, tactic, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Depending on what type of tactic TACTIC is,\r\ncompute its strategic properties wrt STRATEGY.\nDepending on what type of tactic TACTIC is,\ncompute its strategic properties wrt STRATEGY.")
    public static SubLObject strategy_note_new_tactic(final SubLObject strategy, final SubLObject tactic) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $NEW_TACTIC, tactic, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }/**
     * Depending on what type of tactic TACTIC is,
     * compute its strategic properties wrt STRATEGY.
     */


    public static final SubLObject strategy_no_possible_strategems_for_problemP_alt(SubLObject strategy, SubLObject problem) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $kw69$PROBLEM_NOTHING_TO_DO_, problem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject strategy_no_possible_strategems_for_problemP(final SubLObject strategy, final SubLObject problem) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $kw77$PROBLEM_NOTHING_TO_DO_, problem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject strategy_consider_that_problem_could_be_strategically_pending_alt(SubLObject strategy, SubLObject problem) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $PROBLEM_COULD_BE_PENDING, problem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject strategy_consider_that_problem_could_be_strategically_pending(final SubLObject strategy, final SubLObject problem) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $PROBLEM_COULD_BE_PENDING, problem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject strategy_consider_that_problem_could_be_no_good_alt(SubLObject strategy, SubLObject problem, SubLObject consider_deepP, SubLObject consider_transformation_tacticsP) {
        return inference_worker.default_consider_that_problem_could_be_no_good(strategy, problem, consider_deepP, consider_transformation_tacticsP);
    }

    public static SubLObject strategy_consider_that_problem_could_be_no_good(final SubLObject strategy, final SubLObject problem, final SubLObject consider_deepP, final SubLObject consider_transformation_tacticsP) {
        return inference_worker.default_consider_that_problem_could_be_no_good(strategy, problem, consider_deepP, consider_transformation_tacticsP);
    }

    public static final SubLObject strategy_reconsider_set_asides_alt(SubLObject strategy) {
        {
            SubLObject result = inference_datastructures_strategy.strategy_dispatch(strategy, $RECONSIDER_SET_ASIDES, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            inference_datastructures_strategy.clear_strategy_should_reconsider_set_asides(strategy);
            return result;
        }
    }

    public static SubLObject strategy_reconsider_set_asides(final SubLObject strategy) {
        final SubLObject result = inference_datastructures_strategy.strategy_dispatch(strategy, $RECONSIDER_SET_ASIDES, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        inference_datastructures_strategy.clear_strategy_should_reconsider_set_asides(strategy);
        return result;
    }

    /**
     * Does not do all the overhead-related tasks that @xref strategy-do-one-step does.
     */
    @LispMethod(comment = "Does not do all the overhead-related tasks that @xref strategy-do-one-step does.")
    public static final SubLObject substrategy_do_one_step_alt(SubLObject substrategy) {
        return inference_datastructures_strategy.strategy_dispatch(substrategy, $DO_ONE_STEP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Does not do all the overhead-related tasks that @xref strategy-do-one-step does.")
    public static SubLObject substrategy_do_one_step(final SubLObject strategy) {
        inference_datastructures_strategy.increment_strategy_step_count(strategy);
        inference_datastructures_strategy.strategy_dispatch(strategy, $DO_ONE_STEP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }/**
     * Does not do all the overhead-related tasks that @xref strategy-do-one-step does.
     */


    public static final SubLObject substrategy_peek_next_strategem_alt(SubLObject substrategy) {
        SubLTrampolineFile.checkType(substrategy, STRATEGY_P);
        return inference_datastructures_strategy.strategy_dispatch(substrategy, $PEEK_NEXT_STRATEGEM, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject substrategy_peek_next_strategem(final SubLObject substrategy) {
        assert NIL != inference_datastructures_strategy.strategy_p(substrategy) : "! inference_datastructures_strategy.strategy_p(substrategy) " + ("inference_datastructures_strategy.strategy_p(substrategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(substrategy) ") + substrategy;
        return inference_datastructures_strategy.strategy_dispatch(substrategy, $PEEK_NEXT_STRATEGEM, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject substrategy_motivate_strategem_alt(SubLObject substrategy, SubLObject strategem) {
        SubLTrampolineFile.checkType(substrategy, STRATEGY_P);
        SubLTrampolineFile.checkType(strategem, STRATEGEM_P);
        return inference_datastructures_strategy.strategy_dispatch(substrategy, $MOTIVATE_STRATEGEM, strategem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject substrategy_motivate_strategem(final SubLObject substrategy, final SubLObject strategem) {
        assert NIL != inference_datastructures_strategy.strategy_p(substrategy) : "! inference_datastructures_strategy.strategy_p(substrategy) " + ("inference_datastructures_strategy.strategy_p(substrategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(substrategy) ") + substrategy;
        assert NIL != strategem_p(strategem) : "! inference_tactician.strategem_p(strategem) " + ("inference_tactician.strategem_p(strategem) " + "CommonSymbols.NIL != inference_tactician.strategem_p(strategem) ") + strategem;
        return inference_datastructures_strategy.strategy_dispatch(substrategy, $MOTIVATE_STRATEGEM, strategem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject substrategy_activate_strategem_alt(SubLObject substrategy, SubLObject strategem) {
        SubLTrampolineFile.checkType(substrategy, STRATEGY_P);
        SubLTrampolineFile.checkType(strategem, STRATEGEM_P);
        return inference_datastructures_strategy.strategy_dispatch(substrategy, $ACTIVATE_STRATEGEM, strategem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject substrategy_activate_strategem(final SubLObject substrategy, final SubLObject strategem) {
        assert NIL != inference_datastructures_strategy.strategy_p(substrategy) : "! inference_datastructures_strategy.strategy_p(substrategy) " + ("inference_datastructures_strategy.strategy_p(substrategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(substrategy) ") + substrategy;
        assert NIL != strategem_p(strategem) : "! inference_tactician.strategem_p(strategem) " + ("inference_tactician.strategem_p(strategem) " + "CommonSymbols.NIL != inference_tactician.strategem_p(strategem) ") + strategem;
        return inference_datastructures_strategy.strategy_dispatch(substrategy, $ACTIVATE_STRATEGEM, strategem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject substrategy_link_head_motivatedP_alt(SubLObject substrategy, SubLObject link_head) {
        SubLTrampolineFile.checkType(substrategy, STRATEGY_P);
        return inference_datastructures_strategy.strategy_dispatch(substrategy, $kw76$LINK_HEAD_MOTIVATED_, link_head, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject substrategy_link_head_motivatedP(final SubLObject substrategy, final SubLObject link_head) {
        assert NIL != inference_datastructures_strategy.strategy_p(substrategy) : "! inference_datastructures_strategy.strategy_p(substrategy) " + ("inference_datastructures_strategy.strategy_p(substrategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(substrategy) ") + substrategy;
        return inference_datastructures_strategy.strategy_dispatch(substrategy, $kw84$LINK_HEAD_MOTIVATED_, link_head, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject substrategy_reconsider_split_set_asides_alt(SubLObject substrategy, SubLObject split_tactic) {
        SubLTrampolineFile.checkType(substrategy, STRATEGY_P);
        SubLTrampolineFile.checkType(split_tactic, SPLIT_TACTIC_P);
        return inference_datastructures_strategy.strategy_dispatch(substrategy, $RECONSIDER_SPLIT_SET_ASIDES, split_tactic, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject substrategy_reconsider_split_set_asides(final SubLObject substrategy, final SubLObject split_tactic) {
        assert NIL != inference_datastructures_strategy.strategy_p(substrategy) : "! inference_datastructures_strategy.strategy_p(substrategy) " + ("inference_datastructures_strategy.strategy_p(substrategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(substrategy) ") + substrategy;
        assert NIL != inference_worker_split.split_tactic_p(split_tactic) : "! inference_worker_split.split_tactic_p(split_tactic) " + ("inference_worker_split.split_tactic_p(split_tactic) " + "CommonSymbols.NIL != inference_worker_split.split_tactic_p(split_tactic) ") + split_tactic;
        return inference_datastructures_strategy.strategy_dispatch(substrategy, $RECONSIDER_SPLIT_SET_ASIDES, split_tactic, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject declare_inference_tactician_file_alt() {
        declareFunction("strategy_do_one_step", "STRATEGY-DO-ONE-STEP", 1, 0, false);
        declareFunction("strategy_doneP", "STRATEGY-DONE?", 1, 0, false);
        declareFunction("strategy_note_tactic_finished", "STRATEGY-NOTE-TACTIC-FINISHED", 2, 0, false);
        declareFunction("strategy_possibly_activate_problem", "STRATEGY-POSSIBLY-ACTIVATE-PROBLEM", 2, 0, false);
        declareFunction("strategy_note_argument_link_added", "STRATEGY-NOTE-ARGUMENT-LINK-ADDED", 2, 0, false);
        declareFunction("strategy_do_problem_store_prune", "STRATEGY-DO-PROBLEM-STORE-PRUNE", 1, 0, false);
        declareFunction("clear_strategy_step_count", "CLEAR-STRATEGY-STEP-COUNT", 0, 0, false);
        declareFunction("strategy_possibly_auto_prune", "STRATEGY-POSSIBLY-AUTO-PRUNE", 1, 0, false);
        declareFunction("strategy_sort", "STRATEGY-SORT", 3, 0, false);
        declareFunction("strategy_sort_predicateP", "STRATEGY-SORT-PREDICATE?", 2, 0, false);
        new com.cyc.cycjava.cycl.inference.harness.inference_tactician.$strategy_sort_predicateP$BinaryFunction();
        declareFunction("tactic_strategic_productivity_L", "TACTIC-STRATEGIC-PRODUCTIVITY-<", 3, 0, false);
        declareFunction("logical_tactic_better_wrt_removalP", "LOGICAL-TACTIC-BETTER-WRT-REMOVAL?", 3, 0, false);
        declareFunction("logical_tactic_lookahead_problem_wrt_removal", "LOGICAL-TACTIC-LOOKAHEAD-PROBLEM-WRT-REMOVAL", 2, 0, false);
        declareFunction("controlling_strategic_context", "CONTROLLING-STRATEGIC-CONTEXT", 1, 0, false);
        declareFunction("controlling_strategy", "CONTROLLING-STRATEGY", 1, 0, false);
        declareFunction("controlling_strategyP", "CONTROLLING-STRATEGY?", 1, 0, false);
        declareFunction("substrategyP", "SUBSTRATEGY?", 1, 0, false);
        declareFunction("strategy_controls_problem_storeP", "STRATEGY-CONTROLS-PROBLEM-STORE?", 1, 0, false);
        declareMacro("do_problem_unsubsumed_tactics", "DO-PROBLEM-UNSUBSUMED-TACTICS");
        declareFunction("problem_maximal_subsuming_multi_focal_literal_join_ordered_tactics", "PROBLEM-MAXIMAL-SUBSUMING-MULTI-FOCAL-LITERAL-JOIN-ORDERED-TACTICS", 2, 0, false);
        declareFunction("some_subsuming_join_ordered_tacticP", "SOME-SUBSUMING-JOIN-ORDERED-TACTIC?", 3, 0, false);
        declareFunction("consider_subsumed_join_ordered_tacticP", "CONSIDER-SUBSUMED-JOIN-ORDERED-TACTIC?", 3, 0, false);
        declareFunction("select_problem_tactic", "SELECT-PROBLEM-TACTIC", 5, 4, false);
        declareFunction("choose_between_tactics", "CHOOSE-BETWEEN-TACTICS", 4, 0, false);
        declareFunction("select_best_tactic_for_problem", "SELECT-BEST-TACTIC-FOR-PROBLEM", 2, 4, false);
        declareFunction("productivity_and_completeness_worseP", "PRODUCTIVITY-AND-COMPLETENESS-WORSE?", 4, 0, false);
        declareFunction("productivity_and_completeness_betterP", "PRODUCTIVITY-AND-COMPLETENESS-BETTER?", 4, 0, false);
        declareFunction("tactic_productivity_and_completeness_worseP", "TACTIC-PRODUCTIVITY-AND-COMPLETENESS-WORSE?", 3, 0, false);
        declareFunction("tactic_productivity_and_completeness_betterP", "TACTIC-PRODUCTIVITY-AND-COMPLETENESS-BETTER?", 3, 0, false);
        declareFunction("tactic_productivity_and_completeness_sufficiently_goodP", "TACTIC-PRODUCTIVITY-AND-COMPLETENESS-SUFFICIENTLY-GOOD?", 2, 0, false);
        declareFunction("choose_less_productive_tactic", "CHOOSE-LESS-PRODUCTIVE-TACTIC", 3, 0, false);
        declareFunction("tactic_productivity_higherP", "TACTIC-PRODUCTIVITY-HIGHER?", 3, 0, false);
        declareFunction("tactic_productivity_lowerP", "TACTIC-PRODUCTIVITY-LOWER?", 3, 0, false);
        declareFunction("tactic_productivity_sufficiently_goodP", "TACTIC-PRODUCTIVITY-SUFFICIENTLY-GOOD?", 2, 0, false);
        declareFunction("early_removal_productivity_limit", "EARLY-REMOVAL-PRODUCTIVITY-LIMIT", 1, 0, false);
        declareFunction("strategy_early_removal_productivity_limit", "STRATEGY-EARLY-REMOVAL-PRODUCTIVITY-LIMIT", 1, 0, false);
        declareFunction("candidate_early_removal_tacticP", "CANDIDATE-EARLY-REMOVAL-TACTIC?", 1, 0, false);
        declareFunction("join_ordered_tactic_early_removal_cheapP", "JOIN-ORDERED-TACTIC-EARLY-REMOVAL-CHEAP?", 1, 0, false);
        declareFunction("join_ordered_link_early_removal_cheapP", "JOIN-ORDERED-LINK-EARLY-REMOVAL-CHEAP?", 2, 0, false);
        declareFunction("problem_has_a_non_sksi_tacticP", "PROBLEM-HAS-A-NON-SKSI-TACTIC?", 1, 0, false);
        declareFunction("strategy_quiesce", "STRATEGY-QUIESCE", 1, 0, false);
        declareFunction("strategy_execute_tactic", "STRATEGY-EXECUTE-TACTIC", 2, 0, false);
        declareFunction("strategy_possibly_execute_tactic", "STRATEGY-POSSIBLY-EXECUTE-TACTIC", 2, 0, false);
        declareFunction("strategy_make_problem_set_aside", "STRATEGY-MAKE-PROBLEM-SET-ASIDE", 2, 0, false);
        declareFunction("possibly_clear_strategic_status_wrt", "POSSIBLY-CLEAR-STRATEGIC-STATUS-WRT", 2, 0, false);
        declareFunction("clear_strategic_status_wrt", "CLEAR-STRATEGIC-STATUS-WRT", 2, 0, false);
        declareFunction("strategy_throw_away_uninteresting_set_asides", "STRATEGY-THROW-AWAY-UNINTERESTING-SET-ASIDES", 1, 0, false);
        declareFunction("strategy_throws_away_all_transformationP", "STRATEGY-THROWS-AWAY-ALL-TRANSFORMATION?", 1, 0, false);
        declareFunction("strategy_sets_aside_all_transformationP", "STRATEGY-SETS-ASIDE-ALL-TRANSFORMATION?", 1, 0, false);
        declareFunction("strategy_continuation_possibleP", "STRATEGY-CONTINUATION-POSSIBLE?", 1, 0, false);
        declareFunction("better_term_chosen_handlingP", "BETTER-TERM-CHOSEN-HANDLING?", 0, 0, false);
        declareFunction("transformation_link_leads_to_term_chosen_dead_endP", "TRANSFORMATION-LINK-LEADS-TO-TERM-CHOSEN-DEAD-END?", 1, 0, false);
        declareFunction("transformation_link_term_chosen_dead_end_vars", "TRANSFORMATION-LINK-TERM-CHOSEN-DEAD-END-VARS", 1, 0, false);
        declareFunction("problem_term_chosen_dead_end_vars", "PROBLEM-TERM-CHOSEN-DEAD-END-VARS", 1, 0, false);
        declareFunction("all_restricted_non_focals_around_transformation_link", "ALL-RESTRICTED-NON-FOCALS-AROUND-TRANSFORMATION-LINK", 1, 0, false);
        declareFunction("supported_problem_needed_term_chosen_vars", "SUPPORTED-PROBLEM-NEEDED-TERM-CHOSEN-VARS", 1, 0, false);
        declareFunction("focal_problem_binds_all_varsP", "FOCAL-PROBLEM-BINDS-ALL-VARS?", 2, 0, false);
        declareFunction("strategem_p", "STRATEGEM-P", 1, 0, false);
        declareFunction("executable_strategem_p", "EXECUTABLE-STRATEGEM-P", 1, 0, false);
        declareFunction("strategem_invalid_p", "STRATEGEM-INVALID-P", 1, 0, false);
        declareFunction("strategem_problem", "STRATEGEM-PROBLEM", 1, 0, false);
        declareFunction("motivation_strategem_p", "MOTIVATION-STRATEGEM-P", 1, 0, false);
        declareFunction("motivation_strategem_link_p", "MOTIVATION-STRATEGEM-LINK-P", 1, 0, false);
        declareFunction("removal_strategem_p", "REMOVAL-STRATEGEM-P", 1, 0, false);
        declareFunction("transformation_strategem_p", "TRANSFORMATION-STRATEGEM-P", 1, 0, false);
        declareFunction("inference_strategy_type", "INFERENCE-STRATEGY-TYPE", 2, 0, false);
        declareFunction("strategy_type_dispatch_handler", "STRATEGY-TYPE-DISPATCH-HANDLER", 2, 0, false);
        declareFunction("happiness_p", "HAPPINESS-P", 1, 0, false);
        declareFunction("happiness_E", "HAPPINESS-=", 2, 0, false);
        declareFunction("happiness_L", "HAPPINESS-<", 2, 0, false);
        declareFunction("happiness_G", "HAPPINESS->", 2, 0, false);
        new com.cyc.cycjava.cycl.inference.harness.inference_tactician.$happiness_G$BinaryFunction();
        declareFunction("happiness_min", "HAPPINESS-MIN", 2, 0, false);
        declareFunction("happiness_max", "HAPPINESS-MAX", 2, 0, false);
        declareFunction("minimal_happiness", "MINIMAL-HAPPINESS", 0, 0, false);
        declareFunction("problem_happiness_index_p", "PROBLEM-HAPPINESS-INDEX-P", 1, 0, false);
        declareFunction("new_problem_happiness_index", "NEW-PROBLEM-HAPPINESS-INDEX", 0, 0, false);
        declareFunction("problem_happiness_index_empty_p", "PROBLEM-HAPPINESS-INDEX-EMPTY-P", 1, 0, false);
        declareFunction("problem_happiness_index_add", "PROBLEM-HAPPINESS-INDEX-ADD", 3, 0, false);
        declareFunction("problem_happiness_index_peek", "PROBLEM-HAPPINESS-INDEX-PEEK", 1, 0, false);
        declareFunction("problem_happiness_index_next", "PROBLEM-HAPPINESS-INDEX-NEXT", 1, 0, false);
        declareFunction("problem_happiness_index_contents", "PROBLEM-HAPPINESS-INDEX-CONTENTS", 1, 0, false);
        declareFunction("strategy_initialize_properties", "STRATEGY-INITIALIZE-PROPERTIES", 2, 0, false);
        declareFunction("default_strategy_initialize_properties", "DEFAULT-STRATEGY-INITIALIZE-PROPERTIES", 2, 0, false);
        declareFunction("strategy_update_properties", "STRATEGY-UPDATE-PROPERTIES", 2, 0, false);
        declareFunction("default_strategy_update_properties", "DEFAULT-STRATEGY-UPDATE-PROPERTIES", 2, 0, false);
        declareFunction("strategy_note_inference_dynamic_properties_updated", "STRATEGY-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED", 1, 0, false);
        declareFunction("default_strategy_note_inference_dynamic_properties_updated", "DEFAULT-STRATEGY-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED", 1, 0, false);
        declareFunction("strategy_initial_relevant_strategies", "STRATEGY-INITIAL-RELEVANT-STRATEGIES", 1, 0, false);
        declareFunction("default_strategy_initial_relevant_strategies", "DEFAULT-STRATEGY-INITIAL-RELEVANT-STRATEGIES", 1, 0, false);
        declareFunction("strategy_note_split_tactics_strategically_possible", "STRATEGY-NOTE-SPLIT-TACTICS-STRATEGICALLY-POSSIBLE", 2, 0, false);
        declareFunction("strategy_note_tactic_discarded", "STRATEGY-NOTE-TACTIC-DISCARDED", 2, 0, false);
        declareFunction("strategy_note_new_tactic", "STRATEGY-NOTE-NEW-TACTIC", 2, 0, false);
        declareFunction("strategy_no_possible_strategems_for_problemP", "STRATEGY-NO-POSSIBLE-STRATEGEMS-FOR-PROBLEM?", 2, 0, false);
        declareFunction("strategy_consider_that_problem_could_be_strategically_pending", "STRATEGY-CONSIDER-THAT-PROBLEM-COULD-BE-STRATEGICALLY-PENDING", 2, 0, false);
        declareFunction("strategy_consider_that_problem_could_be_no_good", "STRATEGY-CONSIDER-THAT-PROBLEM-COULD-BE-NO-GOOD", 4, 0, false);
        declareFunction("strategy_reconsider_set_asides", "STRATEGY-RECONSIDER-SET-ASIDES", 1, 0, false);
        declareFunction("substrategy_do_one_step", "SUBSTRATEGY-DO-ONE-STEP", 1, 0, false);
        declareFunction("substrategy_peek_next_strategem", "SUBSTRATEGY-PEEK-NEXT-STRATEGEM", 1, 0, false);
        declareFunction("substrategy_motivate_strategem", "SUBSTRATEGY-MOTIVATE-STRATEGEM", 2, 0, false);
        declareFunction("substrategy_activate_strategem", "SUBSTRATEGY-ACTIVATE-STRATEGEM", 2, 0, false);
        declareFunction("substrategy_link_head_motivatedP", "SUBSTRATEGY-LINK-HEAD-MOTIVATED?", 2, 0, false);
        declareFunction("substrategy_reconsider_split_set_asides", "SUBSTRATEGY-RECONSIDER-SPLIT-SET-ASIDES", 2, 0, false);
        return NIL;
    }

    public static SubLObject declare_inference_tactician_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("strategy_do_one_step", "STRATEGY-DO-ONE-STEP", 1, 0, false);
            declareFunction("strategy_doneP", "STRATEGY-DONE?", 1, 0, false);
            declareFunction("strategy_note_tactic_finished", "STRATEGY-NOTE-TACTIC-FINISHED", 2, 0, false);
            declareFunction("strategy_possibly_activate_problem", "STRATEGY-POSSIBLY-ACTIVATE-PROBLEM", 2, 0, false);
            declareFunction("strategy_note_argument_link_added", "STRATEGY-NOTE-ARGUMENT-LINK-ADDED", 2, 0, false);
            declareFunction("strategy_do_problem_store_prune", "STRATEGY-DO-PROBLEM-STORE-PRUNE", 1, 0, false);
            declareFunction("clear_strategy_step_count", "CLEAR-STRATEGY-STEP-COUNT", 0, 0, false);
            declareFunction("strategy_possibly_auto_prune", "STRATEGY-POSSIBLY-AUTO-PRUNE", 1, 0, false);
            declareFunction("strategy_sort", "STRATEGY-SORT", 3, 0, false);
            declareFunction("strategy_sort_predicateP", "STRATEGY-SORT-PREDICATE?", 2, 0, false);
            new inference_tactician.$strategy_sort_predicateP$BinaryFunction();
            declareFunction("tactic_strategic_productivity_L", "TACTIC-STRATEGIC-PRODUCTIVITY-<", 3, 0, false);
            declareFunction("logical_tactic_better_wrt_removalP", "LOGICAL-TACTIC-BETTER-WRT-REMOVAL?", 3, 0, false);
            declareFunction("logical_tactic_lookahead_problem_wrt_removal", "LOGICAL-TACTIC-LOOKAHEAD-PROBLEM-WRT-REMOVAL", 2, 0, false);
            declareFunction("controlling_strategic_context", "CONTROLLING-STRATEGIC-CONTEXT", 1, 0, false);
            declareFunction("controlling_strategy", "CONTROLLING-STRATEGY", 1, 0, false);
            declareFunction("controlling_strategyP", "CONTROLLING-STRATEGY?", 1, 0, false);
            declareFunction("substrategyP", "SUBSTRATEGY?", 1, 0, false);
            declareFunction("strategy_controls_problem_storeP", "STRATEGY-CONTROLS-PROBLEM-STORE?", 1, 0, false);
            declareMacro("do_problem_unsubsumed_tactics", "DO-PROBLEM-UNSUBSUMED-TACTICS");
            declareFunction("problem_maximal_subsuming_multi_focal_literal_join_ordered_tactics", "PROBLEM-MAXIMAL-SUBSUMING-MULTI-FOCAL-LITERAL-JOIN-ORDERED-TACTICS", 2, 0, false);
            declareFunction("some_subsuming_join_ordered_tacticP", "SOME-SUBSUMING-JOIN-ORDERED-TACTIC?", 3, 0, false);
            declareFunction("consider_subsumed_join_ordered_tacticP", "CONSIDER-SUBSUMED-JOIN-ORDERED-TACTIC?", 3, 0, false);
            declareFunction("select_problem_tactic", "SELECT-PROBLEM-TACTIC", 5, 4, false);
            declareFunction("choose_between_tactics", "CHOOSE-BETWEEN-TACTICS", 4, 0, false);
            declareFunction("select_best_tactic_for_problem", "SELECT-BEST-TACTIC-FOR-PROBLEM", 2, 4, false);
            declareFunction("productivity_and_completeness_worseP", "PRODUCTIVITY-AND-COMPLETENESS-WORSE?", 4, 0, false);
            declareFunction("productivity_and_completeness_betterP", "PRODUCTIVITY-AND-COMPLETENESS-BETTER?", 4, 0, false);
            declareFunction("tactic_productivity_and_completeness_worseP", "TACTIC-PRODUCTIVITY-AND-COMPLETENESS-WORSE?", 3, 0, false);
            declareFunction("tactic_productivity_and_completeness_betterP", "TACTIC-PRODUCTIVITY-AND-COMPLETENESS-BETTER?", 3, 0, false);
            declareFunction("tactic_productivity_and_completeness_sufficiently_goodP", "TACTIC-PRODUCTIVITY-AND-COMPLETENESS-SUFFICIENTLY-GOOD?", 2, 0, false);
            declareFunction("choose_less_productive_tactic", "CHOOSE-LESS-PRODUCTIVE-TACTIC", 3, 0, false);
            declareFunction("tactic_productivity_higherP", "TACTIC-PRODUCTIVITY-HIGHER?", 3, 0, false);
            declareFunction("tactic_productivity_lowerP", "TACTIC-PRODUCTIVITY-LOWER?", 3, 0, false);
            declareFunction("tactic_productivity_sufficiently_goodP", "TACTIC-PRODUCTIVITY-SUFFICIENTLY-GOOD?", 2, 0, false);
            declareFunction("early_removal_productivity_limit", "EARLY-REMOVAL-PRODUCTIVITY-LIMIT", 1, 0, false);
            declareFunction("strategy_early_removal_productivity_limit", "STRATEGY-EARLY-REMOVAL-PRODUCTIVITY-LIMIT", 1, 0, false);
            declareFunction("candidate_early_removal_tacticP", "CANDIDATE-EARLY-REMOVAL-TACTIC?", 1, 0, false);
            declareFunction("join_ordered_tactic_early_removal_cheapP", "JOIN-ORDERED-TACTIC-EARLY-REMOVAL-CHEAP?", 1, 0, false);
            declareFunction("join_ordered_link_early_removal_cheapP", "JOIN-ORDERED-LINK-EARLY-REMOVAL-CHEAP?", 2, 0, false);
            declareFunction("problem_has_a_non_sksi_tacticP", "PROBLEM-HAS-A-NON-SKSI-TACTIC?", 1, 0, false);
            declareFunction("strategy_quiesce", "STRATEGY-QUIESCE", 1, 0, false);
            declareFunction("strategy_execute_strategem", "STRATEGY-EXECUTE-STRATEGEM", 2, 0, false);
            declareFunction("possibly_clean_strategem", "POSSIBLY-CLEAN-STRATEGEM", 2, 0, false);
            declareFunction("strategy_execute_tactic", "STRATEGY-EXECUTE-TACTIC", 2, 0, false);
            declareFunction("strategy_possibly_execute_tactic", "STRATEGY-POSSIBLY-EXECUTE-TACTIC", 2, 0, false);
            declareFunction("strategy_make_problem_set_aside", "STRATEGY-MAKE-PROBLEM-SET-ASIDE", 2, 0, false);
            declareFunction("possibly_clear_strategic_status_wrt", "POSSIBLY-CLEAR-STRATEGIC-STATUS-WRT", 2, 0, false);
            declareFunction("clear_strategic_status_wrt", "CLEAR-STRATEGIC-STATUS-WRT", 2, 0, false);
            declareFunction("strategy_set_aside_non_continuable_implies_throw_awayP", "STRATEGY-SET-ASIDE-NON-CONTINUABLE-IMPLIES-THROW-AWAY?", 1, 0, false);
            declareFunction("strategy_throw_away_uninteresting_set_asides", "STRATEGY-THROW-AWAY-UNINTERESTING-SET-ASIDES", 1, 0, false);
            declareFunction("strategy_throws_away_all_transformationP", "STRATEGY-THROWS-AWAY-ALL-TRANSFORMATION?", 1, 0, false);
            declareFunction("strategy_sets_aside_all_transformationP", "STRATEGY-SETS-ASIDE-ALL-TRANSFORMATION?", 1, 0, false);
            declareFunction("strategy_continuation_possibleP", "STRATEGY-CONTINUATION-POSSIBLE?", 1, 0, false);
            declareFunction("better_term_chosen_handlingP", "BETTER-TERM-CHOSEN-HANDLING?", 0, 0, false);
            declareFunction("transformation_link_leads_to_term_chosen_dead_endP", "TRANSFORMATION-LINK-LEADS-TO-TERM-CHOSEN-DEAD-END?", 1, 0, false);
            declareFunction("transformation_link_term_chosen_dead_end_vars", "TRANSFORMATION-LINK-TERM-CHOSEN-DEAD-END-VARS", 1, 0, false);
            declareFunction("problem_term_chosen_dead_end_vars", "PROBLEM-TERM-CHOSEN-DEAD-END-VARS", 1, 0, false);
            declareFunction("all_restricted_non_focals_around_transformation_link", "ALL-RESTRICTED-NON-FOCALS-AROUND-TRANSFORMATION-LINK", 1, 0, false);
            declareFunction("supported_problem_needed_term_chosen_vars", "SUPPORTED-PROBLEM-NEEDED-TERM-CHOSEN-VARS", 1, 0, false);
            declareFunction("focal_problem_binds_all_varsP", "FOCAL-PROBLEM-BINDS-ALL-VARS?", 2, 0, false);
            declareFunction("strategem_p", "STRATEGEM-P", 1, 0, false);
            declareFunction("executable_strategem_p", "EXECUTABLE-STRATEGEM-P", 1, 0, false);
            declareFunction("strategem_invalid_p", "STRATEGEM-INVALID-P", 1, 0, false);
            declareFunction("strategem_problem", "STRATEGEM-PROBLEM", 1, 0, false);
            declareFunction("strategem_supported_object", "STRATEGEM-SUPPORTED-OBJECT", 1, 0, false);
            declareFunction("motivation_strategem_p", "MOTIVATION-STRATEGEM-P", 1, 0, false);
            declareFunction("motivation_strategem_link_p", "MOTIVATION-STRATEGEM-LINK-P", 1, 0, false);
            declareFunction("removal_strategem_p", "REMOVAL-STRATEGEM-P", 1, 0, false);
            declareFunction("transformation_strategem_p", "TRANSFORMATION-STRATEGEM-P", 1, 0, false);
            declareFunction("strategem_suid", "STRATEGEM-SUID", 1, 0, false);
            declareFunction("strategem_L", "STRATEGEM-<", 2, 0, false);
            declareFunction("inference_strategy_type", "INFERENCE-STRATEGY-TYPE", 2, 0, false);
            declareFunction("strategy_type_dispatch_handler", "STRATEGY-TYPE-DISPATCH-HANDLER", 2, 0, false);
            declareFunction("happiness_p", "HAPPINESS-P", 1, 0, false);
            declareFunction("happiness_E", "HAPPINESS-=", 2, 0, false);
            declareFunction("happiness_L", "HAPPINESS-<", 2, 0, false);
            declareFunction("happiness_G", "HAPPINESS->", 2, 0, false);
            new inference_tactician.$happiness_G$BinaryFunction();
            declareFunction("happiness_min", "HAPPINESS-MIN", 2, 0, false);
            declareFunction("happiness_max", "HAPPINESS-MAX", 2, 0, false);
            declareFunction("minimal_happiness", "MINIMAL-HAPPINESS", 0, 0, false);
            declareFunction("happiness_index_p", "HAPPINESS-INDEX-P", 1, 0, false);
            declareFunction("new_happiness_index", "NEW-HAPPINESS-INDEX", 0, 0, false);
            declareFunction("happiness_index_clear", "HAPPINESS-INDEX-CLEAR", 1, 0, false);
            declareFunction("happiness_index_empty_p", "HAPPINESS-INDEX-EMPTY-P", 1, 0, false);
            declareFunction("happiness_index_add", "HAPPINESS-INDEX-ADD", 3, 0, false);
            declareFunction("happiness_index_peek", "HAPPINESS-INDEX-PEEK", 1, 0, false);
            declareFunction("happiness_index_next", "HAPPINESS-INDEX-NEXT", 1, 0, false);
            declareFunction("happiness_index_contents", "HAPPINESS-INDEX-CONTENTS", 1, 0, false);
            declareFunction("happiness_index_size", "HAPPINESS-INDEX-SIZE", 1, 0, false);
            declareFunction("strategy_happiness_table", "STRATEGY-HAPPINESS-TABLE", 1, 0, false);
            declareFunction("strategy_initialize_properties", "STRATEGY-INITIALIZE-PROPERTIES", 2, 0, false);
            declareFunction("default_strategy_initialize_properties", "DEFAULT-STRATEGY-INITIALIZE-PROPERTIES", 2, 0, false);
            declareFunction("strategy_update_properties", "STRATEGY-UPDATE-PROPERTIES", 2, 0, false);
            declareFunction("default_strategy_update_properties", "DEFAULT-STRATEGY-UPDATE-PROPERTIES", 2, 0, false);
            declareFunction("strategy_note_inference_dynamic_properties_updated", "STRATEGY-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED", 1, 0, false);
            declareFunction("default_strategy_note_inference_dynamic_properties_updated", "DEFAULT-STRATEGY-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED", 1, 0, false);
            declareFunction("strategy_initial_relevant_strategies", "STRATEGY-INITIAL-RELEVANT-STRATEGIES", 1, 0, false);
            declareFunction("default_strategy_initial_relevant_strategies", "DEFAULT-STRATEGY-INITIAL-RELEVANT-STRATEGIES", 1, 0, false);
            declareFunction("strategy_note_split_tactics_strategically_possible", "STRATEGY-NOTE-SPLIT-TACTICS-STRATEGICALLY-POSSIBLE", 2, 0, false);
            declareFunction("strategy_note_tactic_discarded", "STRATEGY-NOTE-TACTIC-DISCARDED", 2, 0, false);
            declareFunction("strategy_note_new_tactic", "STRATEGY-NOTE-NEW-TACTIC", 2, 0, false);
            declareFunction("strategy_no_possible_strategems_for_problemP", "STRATEGY-NO-POSSIBLE-STRATEGEMS-FOR-PROBLEM?", 2, 0, false);
            declareFunction("strategy_consider_that_problem_could_be_strategically_pending", "STRATEGY-CONSIDER-THAT-PROBLEM-COULD-BE-STRATEGICALLY-PENDING", 2, 0, false);
            declareFunction("strategy_consider_that_problem_could_be_no_good", "STRATEGY-CONSIDER-THAT-PROBLEM-COULD-BE-NO-GOOD", 4, 0, false);
            declareFunction("strategy_reconsider_set_asides", "STRATEGY-RECONSIDER-SET-ASIDES", 1, 0, false);
            declareFunction("substrategy_do_one_step", "SUBSTRATEGY-DO-ONE-STEP", 1, 0, false);
            declareFunction("substrategy_peek_next_strategem", "SUBSTRATEGY-PEEK-NEXT-STRATEGEM", 1, 0, false);
            declareFunction("substrategy_motivate_strategem", "SUBSTRATEGY-MOTIVATE-STRATEGEM", 2, 0, false);
            declareFunction("substrategy_activate_strategem", "SUBSTRATEGY-ACTIVATE-STRATEGEM", 2, 0, false);
            declareFunction("substrategy_link_head_motivatedP", "SUBSTRATEGY-LINK-HEAD-MOTIVATED?", 2, 0, false);
            declareFunction("substrategy_reconsider_split_set_asides", "SUBSTRATEGY-RECONSIDER-SPLIT-SET-ASIDES", 2, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("problem_happiness_index_p", "PROBLEM-HAPPINESS-INDEX-P", 1, 0, false);
            declareFunction("new_problem_happiness_index", "NEW-PROBLEM-HAPPINESS-INDEX", 0, 0, false);
            declareFunction("problem_happiness_index_empty_p", "PROBLEM-HAPPINESS-INDEX-EMPTY-P", 1, 0, false);
            declareFunction("problem_happiness_index_add", "PROBLEM-HAPPINESS-INDEX-ADD", 3, 0, false);
            declareFunction("problem_happiness_index_peek", "PROBLEM-HAPPINESS-INDEX-PEEK", 1, 0, false);
            declareFunction("problem_happiness_index_next", "PROBLEM-HAPPINESS-INDEX-NEXT", 1, 0, false);
            declareFunction("problem_happiness_index_contents", "PROBLEM-HAPPINESS-INDEX-CONTENTS", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_inference_tactician_file_Previous() {
        declareFunction("strategy_do_one_step", "STRATEGY-DO-ONE-STEP", 1, 0, false);
        declareFunction("strategy_doneP", "STRATEGY-DONE?", 1, 0, false);
        declareFunction("strategy_note_tactic_finished", "STRATEGY-NOTE-TACTIC-FINISHED", 2, 0, false);
        declareFunction("strategy_possibly_activate_problem", "STRATEGY-POSSIBLY-ACTIVATE-PROBLEM", 2, 0, false);
        declareFunction("strategy_note_argument_link_added", "STRATEGY-NOTE-ARGUMENT-LINK-ADDED", 2, 0, false);
        declareFunction("strategy_do_problem_store_prune", "STRATEGY-DO-PROBLEM-STORE-PRUNE", 1, 0, false);
        declareFunction("clear_strategy_step_count", "CLEAR-STRATEGY-STEP-COUNT", 0, 0, false);
        declareFunction("strategy_possibly_auto_prune", "STRATEGY-POSSIBLY-AUTO-PRUNE", 1, 0, false);
        declareFunction("strategy_sort", "STRATEGY-SORT", 3, 0, false);
        declareFunction("strategy_sort_predicateP", "STRATEGY-SORT-PREDICATE?", 2, 0, false);
        new inference_tactician.$strategy_sort_predicateP$BinaryFunction();
        declareFunction("tactic_strategic_productivity_L", "TACTIC-STRATEGIC-PRODUCTIVITY-<", 3, 0, false);
        declareFunction("logical_tactic_better_wrt_removalP", "LOGICAL-TACTIC-BETTER-WRT-REMOVAL?", 3, 0, false);
        declareFunction("logical_tactic_lookahead_problem_wrt_removal", "LOGICAL-TACTIC-LOOKAHEAD-PROBLEM-WRT-REMOVAL", 2, 0, false);
        declareFunction("controlling_strategic_context", "CONTROLLING-STRATEGIC-CONTEXT", 1, 0, false);
        declareFunction("controlling_strategy", "CONTROLLING-STRATEGY", 1, 0, false);
        declareFunction("controlling_strategyP", "CONTROLLING-STRATEGY?", 1, 0, false);
        declareFunction("substrategyP", "SUBSTRATEGY?", 1, 0, false);
        declareFunction("strategy_controls_problem_storeP", "STRATEGY-CONTROLS-PROBLEM-STORE?", 1, 0, false);
        declareMacro("do_problem_unsubsumed_tactics", "DO-PROBLEM-UNSUBSUMED-TACTICS");
        declareFunction("problem_maximal_subsuming_multi_focal_literal_join_ordered_tactics", "PROBLEM-MAXIMAL-SUBSUMING-MULTI-FOCAL-LITERAL-JOIN-ORDERED-TACTICS", 2, 0, false);
        declareFunction("some_subsuming_join_ordered_tacticP", "SOME-SUBSUMING-JOIN-ORDERED-TACTIC?", 3, 0, false);
        declareFunction("consider_subsumed_join_ordered_tacticP", "CONSIDER-SUBSUMED-JOIN-ORDERED-TACTIC?", 3, 0, false);
        declareFunction("select_problem_tactic", "SELECT-PROBLEM-TACTIC", 5, 4, false);
        declareFunction("choose_between_tactics", "CHOOSE-BETWEEN-TACTICS", 4, 0, false);
        declareFunction("select_best_tactic_for_problem", "SELECT-BEST-TACTIC-FOR-PROBLEM", 2, 4, false);
        declareFunction("productivity_and_completeness_worseP", "PRODUCTIVITY-AND-COMPLETENESS-WORSE?", 4, 0, false);
        declareFunction("productivity_and_completeness_betterP", "PRODUCTIVITY-AND-COMPLETENESS-BETTER?", 4, 0, false);
        declareFunction("tactic_productivity_and_completeness_worseP", "TACTIC-PRODUCTIVITY-AND-COMPLETENESS-WORSE?", 3, 0, false);
        declareFunction("tactic_productivity_and_completeness_betterP", "TACTIC-PRODUCTIVITY-AND-COMPLETENESS-BETTER?", 3, 0, false);
        declareFunction("tactic_productivity_and_completeness_sufficiently_goodP", "TACTIC-PRODUCTIVITY-AND-COMPLETENESS-SUFFICIENTLY-GOOD?", 2, 0, false);
        declareFunction("choose_less_productive_tactic", "CHOOSE-LESS-PRODUCTIVE-TACTIC", 3, 0, false);
        declareFunction("tactic_productivity_higherP", "TACTIC-PRODUCTIVITY-HIGHER?", 3, 0, false);
        declareFunction("tactic_productivity_lowerP", "TACTIC-PRODUCTIVITY-LOWER?", 3, 0, false);
        declareFunction("tactic_productivity_sufficiently_goodP", "TACTIC-PRODUCTIVITY-SUFFICIENTLY-GOOD?", 2, 0, false);
        declareFunction("early_removal_productivity_limit", "EARLY-REMOVAL-PRODUCTIVITY-LIMIT", 1, 0, false);
        declareFunction("strategy_early_removal_productivity_limit", "STRATEGY-EARLY-REMOVAL-PRODUCTIVITY-LIMIT", 1, 0, false);
        declareFunction("candidate_early_removal_tacticP", "CANDIDATE-EARLY-REMOVAL-TACTIC?", 1, 0, false);
        declareFunction("join_ordered_tactic_early_removal_cheapP", "JOIN-ORDERED-TACTIC-EARLY-REMOVAL-CHEAP?", 1, 0, false);
        declareFunction("join_ordered_link_early_removal_cheapP", "JOIN-ORDERED-LINK-EARLY-REMOVAL-CHEAP?", 2, 0, false);
        declareFunction("problem_has_a_non_sksi_tacticP", "PROBLEM-HAS-A-NON-SKSI-TACTIC?", 1, 0, false);
        declareFunction("strategy_quiesce", "STRATEGY-QUIESCE", 1, 0, false);
        declareFunction("strategy_execute_strategem", "STRATEGY-EXECUTE-STRATEGEM", 2, 0, false);
        declareFunction("possibly_clean_strategem", "POSSIBLY-CLEAN-STRATEGEM", 2, 0, false);
        declareFunction("strategy_execute_tactic", "STRATEGY-EXECUTE-TACTIC", 2, 0, false);
        declareFunction("strategy_possibly_execute_tactic", "STRATEGY-POSSIBLY-EXECUTE-TACTIC", 2, 0, false);
        declareFunction("strategy_make_problem_set_aside", "STRATEGY-MAKE-PROBLEM-SET-ASIDE", 2, 0, false);
        declareFunction("possibly_clear_strategic_status_wrt", "POSSIBLY-CLEAR-STRATEGIC-STATUS-WRT", 2, 0, false);
        declareFunction("clear_strategic_status_wrt", "CLEAR-STRATEGIC-STATUS-WRT", 2, 0, false);
        declareFunction("strategy_set_aside_non_continuable_implies_throw_awayP", "STRATEGY-SET-ASIDE-NON-CONTINUABLE-IMPLIES-THROW-AWAY?", 1, 0, false);
        declareFunction("strategy_throw_away_uninteresting_set_asides", "STRATEGY-THROW-AWAY-UNINTERESTING-SET-ASIDES", 1, 0, false);
        declareFunction("strategy_throws_away_all_transformationP", "STRATEGY-THROWS-AWAY-ALL-TRANSFORMATION?", 1, 0, false);
        declareFunction("strategy_sets_aside_all_transformationP", "STRATEGY-SETS-ASIDE-ALL-TRANSFORMATION?", 1, 0, false);
        declareFunction("strategy_continuation_possibleP", "STRATEGY-CONTINUATION-POSSIBLE?", 1, 0, false);
        declareFunction("better_term_chosen_handlingP", "BETTER-TERM-CHOSEN-HANDLING?", 0, 0, false);
        declareFunction("transformation_link_leads_to_term_chosen_dead_endP", "TRANSFORMATION-LINK-LEADS-TO-TERM-CHOSEN-DEAD-END?", 1, 0, false);
        declareFunction("transformation_link_term_chosen_dead_end_vars", "TRANSFORMATION-LINK-TERM-CHOSEN-DEAD-END-VARS", 1, 0, false);
        declareFunction("problem_term_chosen_dead_end_vars", "PROBLEM-TERM-CHOSEN-DEAD-END-VARS", 1, 0, false);
        declareFunction("all_restricted_non_focals_around_transformation_link", "ALL-RESTRICTED-NON-FOCALS-AROUND-TRANSFORMATION-LINK", 1, 0, false);
        declareFunction("supported_problem_needed_term_chosen_vars", "SUPPORTED-PROBLEM-NEEDED-TERM-CHOSEN-VARS", 1, 0, false);
        declareFunction("focal_problem_binds_all_varsP", "FOCAL-PROBLEM-BINDS-ALL-VARS?", 2, 0, false);
        declareFunction("strategem_p", "STRATEGEM-P", 1, 0, false);
        declareFunction("executable_strategem_p", "EXECUTABLE-STRATEGEM-P", 1, 0, false);
        declareFunction("strategem_invalid_p", "STRATEGEM-INVALID-P", 1, 0, false);
        declareFunction("strategem_problem", "STRATEGEM-PROBLEM", 1, 0, false);
        declareFunction("strategem_supported_object", "STRATEGEM-SUPPORTED-OBJECT", 1, 0, false);
        declareFunction("motivation_strategem_p", "MOTIVATION-STRATEGEM-P", 1, 0, false);
        declareFunction("motivation_strategem_link_p", "MOTIVATION-STRATEGEM-LINK-P", 1, 0, false);
        declareFunction("removal_strategem_p", "REMOVAL-STRATEGEM-P", 1, 0, false);
        declareFunction("transformation_strategem_p", "TRANSFORMATION-STRATEGEM-P", 1, 0, false);
        declareFunction("strategem_suid", "STRATEGEM-SUID", 1, 0, false);
        declareFunction("strategem_L", "STRATEGEM-<", 2, 0, false);
        declareFunction("inference_strategy_type", "INFERENCE-STRATEGY-TYPE", 2, 0, false);
        declareFunction("strategy_type_dispatch_handler", "STRATEGY-TYPE-DISPATCH-HANDLER", 2, 0, false);
        declareFunction("happiness_p", "HAPPINESS-P", 1, 0, false);
        declareFunction("happiness_E", "HAPPINESS-=", 2, 0, false);
        declareFunction("happiness_L", "HAPPINESS-<", 2, 0, false);
        declareFunction("happiness_G", "HAPPINESS->", 2, 0, false);
        new inference_tactician.$happiness_G$BinaryFunction();
        declareFunction("happiness_min", "HAPPINESS-MIN", 2, 0, false);
        declareFunction("happiness_max", "HAPPINESS-MAX", 2, 0, false);
        declareFunction("minimal_happiness", "MINIMAL-HAPPINESS", 0, 0, false);
        declareFunction("happiness_index_p", "HAPPINESS-INDEX-P", 1, 0, false);
        declareFunction("new_happiness_index", "NEW-HAPPINESS-INDEX", 0, 0, false);
        declareFunction("happiness_index_clear", "HAPPINESS-INDEX-CLEAR", 1, 0, false);
        declareFunction("happiness_index_empty_p", "HAPPINESS-INDEX-EMPTY-P", 1, 0, false);
        declareFunction("happiness_index_add", "HAPPINESS-INDEX-ADD", 3, 0, false);
        declareFunction("happiness_index_peek", "HAPPINESS-INDEX-PEEK", 1, 0, false);
        declareFunction("happiness_index_next", "HAPPINESS-INDEX-NEXT", 1, 0, false);
        declareFunction("happiness_index_contents", "HAPPINESS-INDEX-CONTENTS", 1, 0, false);
        declareFunction("happiness_index_size", "HAPPINESS-INDEX-SIZE", 1, 0, false);
        declareFunction("strategy_happiness_table", "STRATEGY-HAPPINESS-TABLE", 1, 0, false);
        declareFunction("strategy_initialize_properties", "STRATEGY-INITIALIZE-PROPERTIES", 2, 0, false);
        declareFunction("default_strategy_initialize_properties", "DEFAULT-STRATEGY-INITIALIZE-PROPERTIES", 2, 0, false);
        declareFunction("strategy_update_properties", "STRATEGY-UPDATE-PROPERTIES", 2, 0, false);
        declareFunction("default_strategy_update_properties", "DEFAULT-STRATEGY-UPDATE-PROPERTIES", 2, 0, false);
        declareFunction("strategy_note_inference_dynamic_properties_updated", "STRATEGY-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED", 1, 0, false);
        declareFunction("default_strategy_note_inference_dynamic_properties_updated", "DEFAULT-STRATEGY-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED", 1, 0, false);
        declareFunction("strategy_initial_relevant_strategies", "STRATEGY-INITIAL-RELEVANT-STRATEGIES", 1, 0, false);
        declareFunction("default_strategy_initial_relevant_strategies", "DEFAULT-STRATEGY-INITIAL-RELEVANT-STRATEGIES", 1, 0, false);
        declareFunction("strategy_note_split_tactics_strategically_possible", "STRATEGY-NOTE-SPLIT-TACTICS-STRATEGICALLY-POSSIBLE", 2, 0, false);
        declareFunction("strategy_note_tactic_discarded", "STRATEGY-NOTE-TACTIC-DISCARDED", 2, 0, false);
        declareFunction("strategy_note_new_tactic", "STRATEGY-NOTE-NEW-TACTIC", 2, 0, false);
        declareFunction("strategy_no_possible_strategems_for_problemP", "STRATEGY-NO-POSSIBLE-STRATEGEMS-FOR-PROBLEM?", 2, 0, false);
        declareFunction("strategy_consider_that_problem_could_be_strategically_pending", "STRATEGY-CONSIDER-THAT-PROBLEM-COULD-BE-STRATEGICALLY-PENDING", 2, 0, false);
        declareFunction("strategy_consider_that_problem_could_be_no_good", "STRATEGY-CONSIDER-THAT-PROBLEM-COULD-BE-NO-GOOD", 4, 0, false);
        declareFunction("strategy_reconsider_set_asides", "STRATEGY-RECONSIDER-SET-ASIDES", 1, 0, false);
        declareFunction("substrategy_do_one_step", "SUBSTRATEGY-DO-ONE-STEP", 1, 0, false);
        declareFunction("substrategy_peek_next_strategem", "SUBSTRATEGY-PEEK-NEXT-STRATEGEM", 1, 0, false);
        declareFunction("substrategy_motivate_strategem", "SUBSTRATEGY-MOTIVATE-STRATEGEM", 2, 0, false);
        declareFunction("substrategy_activate_strategem", "SUBSTRATEGY-ACTIVATE-STRATEGEM", 2, 0, false);
        declareFunction("substrategy_link_head_motivatedP", "SUBSTRATEGY-LINK-HEAD-MOTIVATED?", 2, 0, false);
        declareFunction("substrategy_reconsider_split_set_asides", "SUBSTRATEGY-RECONSIDER-SPLIT-SET-ASIDES", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_inference_tactician_file_alt() {
        defparameter("*STRATEGY-AUTO-PRUNE-THRESHOLD*", NIL);
        defvar("*STRATEGY-AUTO-PRUNE-STEP-COUNT*", ZERO_INTEGER);
        defparameter("*STRATEGY-SORT-STRATEGY*", NIL);
        defparameter("*STRATEGY-SORT-PREDICATE*", NIL);
        deflexical("*SUFFICIENTLY-GOOD-TACTIC-PRODUCTIVITY-THRESHOLD*", TEN_INTEGER);
        defvar("*DEFAULT-EARLY-REMOVAL-PRODUCTIVITY-LIMIT*", inference_datastructures_enumerated_types.productivity_for_number_of_children(backward.$transformation_early_removal_threshold$.getDynamicValue()));
        defparameter("*SET-ASIDE-NON-CONTINUABLE-IMPLIES-THROW-AWAY?*", T);
        defvar("*BETTER-TERM-CHOSEN-HANDLING?*", T);
        defvar("*BETTER-BACKCHAIN-FORBIDDEN-WHEN-UNBOUND-IN-ARG-HANDLING?*", NIL);
        return NIL;
    }

    public static SubLObject init_inference_tactician_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*STRATEGY-AUTO-PRUNE-THRESHOLD*", NIL);
            defvar("*STRATEGY-AUTO-PRUNE-STEP-COUNT*", ZERO_INTEGER);
            defparameter("*STRATEGY-SORT-STRATEGY*", NIL);
            defparameter("*STRATEGY-SORT-PREDICATE*", NIL);
            deflexical("*SUFFICIENTLY-GOOD-TACTIC-PRODUCTIVITY-THRESHOLD*", TEN_INTEGER);
            defvar("*DEFAULT-EARLY-REMOVAL-PRODUCTIVITY-LIMIT*", inference_datastructures_enumerated_types.productivity_for_number_of_children(backward.$transformation_early_removal_threshold$.getDynamicValue()));
            defparameter("*SET-ASIDE-NON-CONTINUABLE-IMPLIES-THROW-AWAY-FOR-REMOVAL?*", T);
            defparameter("*SET-ASIDE-NON-CONTINUABLE-IMPLIES-THROW-AWAY-FOR-TRANSFORMATION?*", NIL);
            defvar("*BETTER-TERM-CHOSEN-HANDLING?*", T);
            defvar("*BETTER-BACKCHAIN-FORBIDDEN-WHEN-UNBOUND-IN-ARG-HANDLING?*", NIL);
        }
        if (SubLFiles.USE_V2) {
            defparameter("*SET-ASIDE-NON-CONTINUABLE-IMPLIES-THROW-AWAY?*", T);
        }
        return NIL;
    }

    public static SubLObject init_inference_tactician_file_Previous() {
        defparameter("*STRATEGY-AUTO-PRUNE-THRESHOLD*", NIL);
        defvar("*STRATEGY-AUTO-PRUNE-STEP-COUNT*", ZERO_INTEGER);
        defparameter("*STRATEGY-SORT-STRATEGY*", NIL);
        defparameter("*STRATEGY-SORT-PREDICATE*", NIL);
        deflexical("*SUFFICIENTLY-GOOD-TACTIC-PRODUCTIVITY-THRESHOLD*", TEN_INTEGER);
        defvar("*DEFAULT-EARLY-REMOVAL-PRODUCTIVITY-LIMIT*", inference_datastructures_enumerated_types.productivity_for_number_of_children(backward.$transformation_early_removal_threshold$.getDynamicValue()));
        defparameter("*SET-ASIDE-NON-CONTINUABLE-IMPLIES-THROW-AWAY-FOR-REMOVAL?*", T);
        defparameter("*SET-ASIDE-NON-CONTINUABLE-IMPLIES-THROW-AWAY-FOR-TRANSFORMATION?*", NIL);
        defvar("*BETTER-TERM-CHOSEN-HANDLING?*", T);
        defvar("*BETTER-BACKCHAIN-FORBIDDEN-WHEN-UNBOUND-IN-ARG-HANDLING?*", NIL);
        return NIL;
    }

    public static SubLObject setup_inference_tactician_file() {
        note_funcall_helper_function($sym5$STRATEGY_SORT_PREDICATE_);
        note_funcall_helper_function($sym6$TACTIC_STRATEGIC_PRODUCTIVITY__);
        note_funcall_helper_function($sym7$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_);
        register_macro_helper($sym25$PROBLEM_MAXIMAL_SUBSUMING_MULTI_FOCAL_LITERAL_JOIN_ORDERED_TACTIC, DO_PROBLEM_UNSUBSUMED_CONNECTED_CONJUNCTION_TACTICS);
        register_macro_helper($sym27$SOME_SUBSUMING_JOIN_ORDERED_TACTIC_, DO_PROBLEM_UNSUBSUMED_CONNECTED_CONJUNCTION_TACTICS);
        note_funcall_helper_function($sym33$TACTIC_PRODUCTIVITY_AND_COMPLETENESS_WORSE_);
        note_funcall_helper_function($sym37$TACTIC_PRODUCTIVITY_HIGHER_);
        note_funcall_helper_function($sym36$TACTIC_PRODUCTIVITY_LOWER_);
        note_funcall_helper_function($sym38$TACTIC_PRODUCTIVITY_SUFFICIENTLY_GOOD_);
        note_funcall_helper_function(DEFAULT_STRATEGY_INITIALIZE_PROPERTIES);
        note_funcall_helper_function(DEFAULT_STRATEGY_UPDATE_PROPERTIES);
        note_funcall_helper_function(DEFAULT_STRATEGY_NOTE_INFERENCE_DYNAMIC_PROPERTIES_UPDATED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_tactician_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_tactician_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_tactician_file();
    }

    static {
    }

    public static final class $strategy_sort_predicateP$BinaryFunction extends BinaryFunction {
        public $strategy_sort_predicateP$BinaryFunction() {
            super(extractFunctionNamed("STRATEGY-SORT-PREDICATE?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return strategy_sort_predicateP(arg1, arg2);
        }
    }

    static private final SubLList $list_alt9 = list(list(makeSymbol("TACTIC-VAR"), makeSymbol("PROBLEM"), makeSymbol("STRATEGIC-CONTEXT"), makeSymbol("&KEY"), makeSymbol("STATUS"), makeSymbol("HL-MODULE"), makeSymbol("TYPE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final class $happiness_G$BinaryFunction extends BinaryFunction {
        public $happiness_G$BinaryFunction() {
            super(extractFunctionNamed("HAPPINESS->"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return happiness_G(arg1, arg2);
        }
    }

    static private final SubLList $list_alt10 = list(makeKeyword("STATUS"), makeKeyword("HL-MODULE"), $TYPE, $DONE);

    public static final SubLSymbol $kw43$CONTINUATION_POSSIBLE_ = makeKeyword("CONTINUATION-POSSIBLE?");

    static private final SubLList $list_alt45 = list(makeSymbol("MT"), makeSymbol("ASENT"));

    static private final SubLString $str_alt51$Unexpected_strategem_type__s = makeString("Unexpected strategem type ~s");

    static private final SubLSymbol $sym53$HAPPINESS__ = makeSymbol("HAPPINESS->");

    static private final SubLString $str_alt56$No_object_stack_for_happiness__S = makeString("No object-stack for happiness ~S");

    static private final SubLString $str_alt57$No_objects_for_happiness__S = makeString("No objects for happiness ~S");

    static private final SubLString $str_alt58$Removed__S_but__S_was_lowest_happ = makeString("Removed ~S but ~S was lowest happiness");

    private static final SubLSymbol PROBLEM_HAPPINESS_INDEX_P = makeSymbol("PROBLEM-HAPPINESS-INDEX-P");

    public static final SubLSymbol $kw69$PROBLEM_NOTHING_TO_DO_ = makeKeyword("PROBLEM-NOTHING-TO-DO?");

    public static final SubLSymbol $kw76$LINK_HEAD_MOTIVATED_ = makeKeyword("LINK-HEAD-MOTIVATED?");
}

/**
 * Total time: 377 ms
 */
