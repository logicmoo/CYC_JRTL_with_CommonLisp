/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sbhl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_transitivity;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
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
 * module:      SBHL-SEARCH-UTILITIES
 * source file: /cyc/top/cycl/sbhl/sbhl-search-utilities.lisp
 * created:     2019/07/03 17:37:26
 */
public final class sbhl_search_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sbhl_search_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities";


    private static final SubLSymbol SBHL_SIMPLE_TRUE_SEARCH = makeSymbol("SBHL-SIMPLE-TRUE-SEARCH");

    private static final SubLSymbol SBHL_SIMPLE_FALSE_SEARCH = makeSymbol("SBHL-SIMPLE-FALSE-SEARCH");

    private static final SubLSymbol SBHL_STEP_AND_SWEEP_WITH_TT_MODULE = makeSymbol("SBHL-STEP-AND-SWEEP-WITH-TT-MODULE");

    private static final SubLSymbol SBHL_SWEEP_WITH_TT_MODULE_CARRY_STEP = makeSymbol("SBHL-SWEEP-WITH-TT-MODULE-CARRY-STEP");

    private static final SubLSymbol SBHL_SWEEP_STEP_DISJOINS_AND_SWEEP_AGAIN = makeSymbol("SBHL-SWEEP-STEP-DISJOINS-AND-SWEEP-AGAIN");

    static private final SubLString $str6$Search_behavior_not_recognized__S = makeString("Search behavior not recognized. Sorry.");

    static private final SubLString $str7$Search_Behavior_not_recognized___ = makeString("Search Behavior not recognized: ~a");

    static private final SubLList $list12 = list(makeSymbol("PRED"), makeSymbol("ARG1"), makeSymbol("ARG2"));

    static private final SubLString $str16$incorrect_justification_assembly_ = makeString("incorrect justification assembly ~a");





    private static final SubLSymbol SBHL_TEMPORAL_JUSTIFICATION_UNWIND = makeSymbol("SBHL-TEMPORAL-JUSTIFICATION-UNWIND");

    private static final SubLSymbol SBHL_PUSH_UNWIND_ONTO_RESULT = makeSymbol("SBHL-PUSH-UNWIND-ONTO-RESULT");

    static private final SubLString $str22$_S_is_not_a_transitive_module = makeString("~S is not a transitive module");





    private static final SubLSymbol NOT_GENL_INVERSE_MODE_P = makeSymbol("NOT-GENL-INVERSE-MODE-P");

    private static final SubLSymbol GENL_INVERSE_MODE_P = makeSymbol("GENL-INVERSE-MODE-P");

    private static final SubLSymbol NON_EMPTY_EXTENT = makeSymbol("NON-EMPTY-EXTENT");

    private static final SubLSymbol SBHL_NODE_VALID_FOR_TEMPORAL_SEARCH_RESULT_P = makeSymbol("SBHL-NODE-VALID-FOR-TEMPORAL-SEARCH-RESULT-P");

    static private final SubLString $str29$Using_potentially_unsupported_gat = makeString("Using potentially unsupported gather gating behavior: ~a");

    static private final SubLString $str30$Using_potentially_unsupported_unm = makeString("Using potentially unsupported unmark gather gating behavior: ~a");

    static private final SubLList $list31 = list(makeSymbol("RESULT"), makeSymbol("DONE?"));

    private static final SubLSymbol SBHL_PUSH_ONTO_RESULT = makeSymbol("SBHL-PUSH-ONTO-RESULT");

    private static final SubLSymbol SBHL_PUSH_ONTO_RESULT_WITH_PRUNE = makeSymbol("SBHL-PUSH-ONTO-RESULT-WITH-PRUNE");

    private static final SubLSymbol SBHL_NODE_IS_GOAL_NODE = makeSymbol("SBHL-NODE-IS-GOAL-NODE");

    private static final SubLSymbol SBHL_NODE_MARKED_AS_GOAL_NODE = makeSymbol("SBHL-NODE-MARKED-AS-GOAL-NODE");

    private static final SubLSymbol SBHL_GATHER_FIRST_NON_NIL_RESULT = makeSymbol("SBHL-GATHER-FIRST-NON-NIL-RESULT");

    private static final SubLSymbol SBHL_GATHER_FIRST_NON_NIL_RESULT_WITH_PRUNE = makeSymbol("SBHL-GATHER-FIRST-NON-NIL-RESULT-WITH-PRUNE");

    private static final SubLSymbol SBHL_APPLY_COMPOSE_FN = makeSymbol("SBHL-APPLY-COMPOSE-FN");

    private static final SubLSymbol SBHL_APPLY_COMPOSE_FN_AND_COMBINE_WITH_RESULT = makeSymbol("SBHL-APPLY-COMPOSE-FN-AND-COMBINE-WITH-RESULT");

    private static final SubLSymbol SBHL_GATHER_DEAD_END_NODES = makeSymbol("SBHL-GATHER-DEAD-END-NODES");

    private static final SubLSymbol SBHL_GATHER_FIRST_DEAD_END_NODE_AND_ENQUEUE_OTHERS = makeSymbol("SBHL-GATHER-FIRST-DEAD-END-NODE-AND-ENQUEUE-OTHERS");

    private static final SubLString $str42$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str43$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLList $list44 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    private static final SubLSymbol SBHL_SIMPLE_TRUE_SEARCH_AND_UNWIND = makeSymbol("SBHL-SIMPLE-TRUE-SEARCH-AND-UNWIND");

    private static final SubLSymbol SBHL_LEAF_INSTANCES_SWEEP = makeSymbol("SBHL-LEAF-INSTANCES-SWEEP");

    private static final SubLString $str47$attempt_to_call_unsupported_sbhl_ = makeString("attempt to call unsupported sbhl search behavior: ~a~%");

    private static final SubLSymbol SBHL_CONSIDER_NODE = makeSymbol("SBHL-CONSIDER-NODE");

    private static final SubLSymbol SBHL_CONSIDER_UNMARKED_NODE = makeSymbol("SBHL-CONSIDER-UNMARKED-NODE");

    private static final SubLSymbol SBHL_SWEEP_WITH_CARRYING_MODULE = makeSymbol("SBHL-SWEEP-WITH-CARRYING-MODULE");

    private static final SubLSymbol SBHL_STEP_WITH_CARRIED_MODULE = makeSymbol("SBHL-STEP-WITH-CARRIED-MODULE");

    private static final SubLSymbol SBHL_STEP_DISJOINS_AND_SWEEP_INHERITED = makeSymbol("SBHL-STEP-DISJOINS-AND-SWEEP-INHERITED");

    private static final SubLSymbol SBHL_SWEEP_INHERITED_DISJOINS = makeSymbol("SBHL-SWEEP-INHERITED-DISJOINS");

    private static final SubLSymbol SBHL_STEP_AND_CHECK_MARKINGS = makeSymbol("SBHL-STEP-AND-CHECK-MARKINGS");

    private static final SubLSymbol SBHL_STEP_FALSE_AND_SWEEP_OPPOSITE = makeSymbol("SBHL-STEP-FALSE-AND-SWEEP-OPPOSITE");

    private static final SubLSymbol SBHL_SWEEP_OPPOSITE_FOR_FALSE = makeSymbol("SBHL-SWEEP-OPPOSITE-FOR-FALSE");

    private static final SubLSymbol SBHL_CHECK_CUTOFF = makeSymbol("SBHL-CHECK-CUTOFF");

    private static final SubLSymbol SBHL_SWEEP_FORWARD_STEP_FALSE_DISJOINS_AND_SWEEP_FORWARD_NOTS = makeSymbol("SBHL-SWEEP-FORWARD-STEP-FALSE-DISJOINS-AND-SWEEP-FORWARD-NOTS");

    private static final SubLSymbol SBHL_CONSIDER_ANY_NODE = makeSymbol("SBHL-CONSIDER-ANY-NODE");

    private static final SubLSymbol SBHL_NODE_LOCALLY_DISJOINT_WITH_SELF_P = makeSymbol("SBHL-NODE-LOCALLY-DISJOINT-WITH-SELF-P");

    private static final SubLSymbol SBHL_SWEEP_FORWARD_NOTS = makeSymbol("SBHL-SWEEP-FORWARD-NOTS");

    private static final SubLSymbol SBHL_STEP_GATHER_DISJOINS = makeSymbol("SBHL-STEP-GATHER-DISJOINS");

    private static final SubLSymbol SBHL_STEP_GATHER_FIRST_DISJOIN = makeSymbol("SBHL-STEP-GATHER-FIRST-DISJOIN");

    private static final SubLSymbol SBHL_GATHER_FIRST_TARGET_UNMARKED_NODE = makeSymbol("SBHL-GATHER-FIRST-TARGET-UNMARKED-NODE");

    private static final SubLSymbol SBHL_GATHER_FIRST_NODE = makeSymbol("SBHL-GATHER-FIRST-NODE");

    private static final SubLString $str66$invalid_module_type__a = makeString("invalid module type ~a");

    private static final SubLSymbol SBHL_LEAF_INSTANCES_STEP = makeSymbol("SBHL-LEAF-INSTANCES-STEP");

    private static final SubLSymbol SBHL_ENQUEUE_NODE_IN_LEAF_QUEUE = makeSymbol("SBHL-ENQUEUE-NODE-IN-LEAF-QUEUE");

    private static final SubLString $str71$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLString $$$continue_anyway = makeString("continue anyway");

    private static final SubLString $str76$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLObject $$True_JustificationTruth = reader_make_constant_shell("True-JustificationTruth");

    private static final SubLSymbol SBHL_TEST_FOR_PREVIOUS_EXTREMAL_PATHS = makeSymbol("SBHL-TEST-FOR-PREVIOUS-EXTREMAL-PATHS");





    private static final SubLSymbol SBHL_TARGET_SWEEP_STEP_DISJOINS_AND_CHECK = makeSymbol("SBHL-TARGET-SWEEP-STEP-DISJOINS-AND-CHECK");

    private static final SubLList $list83 = list(makeKeyword("PREDICATE"), makeKeyword("INVERSE"));

    private static final SubLString $str84$Unexpected_direction____S = makeString("Unexpected direction : ~S");

    static private final SubLString $str86$KB_access_missed_for_SBHL__S_to__ = makeString("KB access missed for SBHL ~S to ~S for ~S");

    private static final SubLString $str87$KB_access_missed_for_SBHL__S_to__ = makeString("KB access missed for SBHL ~S to ~S");

    // Definitions
    /**
     * Accessor: @return function-spec-p. Returns the name of the search function to call, as determined by MODULE's type, DIRECTION, and TV.
     */
    @LispMethod(comment = "Accessor: @return function-spec-p. Returns the name of the search function to call, as determined by MODULE\'s type, DIRECTION, and TV.")
    public static final SubLObject determine_sbhl_search_behavior_alt(SubLObject module, SubLObject direction, SubLObject tv) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        if (NIL != sbhl_module_utilities.sbhl_transitive_module_p(module)) {
            if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                return SBHL_SIMPLE_TRUE_SEARCH;
            } else {
                return SBHL_SIMPLE_FALSE_SEARCH;
            }
        } else {
            if (NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(module)) {
                if (NIL != sbhl_search_vars.sbhl_forward_search_direction_p(direction)) {
                    return SBHL_STEP_AND_SWEEP_WITH_TT_MODULE;
                } else {
                    return SBHL_SWEEP_WITH_TT_MODULE_CARRY_STEP;
                }
            } else {
                if (NIL != sbhl_module_utilities.sbhl_disjoins_module_p(module)) {
                    return SBHL_SWEEP_STEP_DISJOINS_AND_SWEEP_AGAIN;
                } else {
                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt6$Search_behavior_not_recognized__S, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    // Definitions
    /**
     * Accessor: @return function-spec-p. Returns the name of the search function to call, as determined by MODULE's type, DIRECTION, and TV.
     */
    @LispMethod(comment = "Accessor: @return function-spec-p. Returns the name of the search function to call, as determined by MODULE\'s type, DIRECTION, and TV.")
    public static SubLObject determine_sbhl_search_behavior(final SubLObject module, final SubLObject direction, final SubLObject tv) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        if (NIL != sbhl_module_utilities.sbhl_transitive_module_p(module)) {
            if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                return SBHL_SIMPLE_TRUE_SEARCH;
            }
            return SBHL_SIMPLE_FALSE_SEARCH;
        } else
            if (NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(module)) {
                if (NIL != sbhl_search_vars.sbhl_forward_search_direction_p(direction)) {
                    return SBHL_STEP_AND_SWEEP_WITH_TT_MODULE;
                }
                return SBHL_SWEEP_WITH_TT_MODULE_CARRY_STEP;
            } else {
                if (NIL != sbhl_module_utilities.sbhl_disjoins_module_p(module)) {
                    return SBHL_SWEEP_STEP_DISJOINS_AND_SWEEP_AGAIN;
                }
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str6$Search_behavior_not_recognized__S, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return NIL;
            }

    }

    /**
     * Accessor: @return sbhl-space-object-p; uses SEARCH-BEHAVIOR to determine which marking space will contain goal markings.
     */
    @LispMethod(comment = "Accessor: @return sbhl-space-object-p; uses SEARCH-BEHAVIOR to determine which marking space will contain goal markings.")
    public static final SubLObject determine_sbhl_terminating_marking_space_alt(SubLObject search_behavior) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = search_behavior;
                if (pcase_var.eql(SBHL_SIMPLE_TRUE_SEARCH)) {
                    return sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread);
                } else {
                    if (pcase_var.eql(SBHL_SIMPLE_FALSE_SEARCH)) {
                        return sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread);
                    } else {
                        if (pcase_var.eql(SBHL_STEP_AND_SWEEP_WITH_TT_MODULE)) {
                            return sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread);
                        } else {
                            if (pcase_var.eql(SBHL_SWEEP_WITH_TT_MODULE_CARRY_STEP)) {
                                return sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread);
                            } else {
                                if (pcase_var.eql(SBHL_SWEEP_STEP_DISJOINS_AND_SWEEP_AGAIN)) {
                                    return sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread);
                                } else {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt7$Search_Behavior_not_recognized___, search_behavior, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Accessor: @return sbhl-space-object-p; uses SEARCH-BEHAVIOR to determine which marking space will contain goal markings.
     */
    @LispMethod(comment = "Accessor: @return sbhl-space-object-p; uses SEARCH-BEHAVIOR to determine which marking space will contain goal markings.")
    public static SubLObject determine_sbhl_terminating_marking_space(final SubLObject search_behavior) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (search_behavior.eql(SBHL_SIMPLE_TRUE_SEARCH)) {
            return sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread);
        }
        if (search_behavior.eql(SBHL_SIMPLE_FALSE_SEARCH)) {
            return sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread);
        }
        if (search_behavior.eql(SBHL_STEP_AND_SWEEP_WITH_TT_MODULE)) {
            return sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread);
        }
        if (search_behavior.eql(SBHL_SWEEP_WITH_TT_MODULE_CARRY_STEP)) {
            return sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread);
        }
        if (search_behavior.eql(SBHL_SWEEP_STEP_DISJOINS_AND_SWEEP_AGAIN)) {
            return sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread);
        }
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str7$Search_Behavior_not_recognized___, search_behavior, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    /**
     * Accessor. @return booleanp; whether MODULE marks in gather space before performing other search. Used for boolean disjoins searches.
     */
    @LispMethod(comment = "Accessor. @return booleanp; whether MODULE marks in gather space before performing other search. Used for boolean disjoins searches.")
    public static final SubLObject sbhl_module_premarks_gather_nodes_p_alt() {
        return makeBoolean(((NIL != sbhl_search_vars.sbhl_boolean_search_p()) && (NIL != sbhl_module_utilities.sbhl_disjoins_search_p())) && (NIL != sbhl_search_vars.sbhl_true_search_p()));
    }

    /**
     * Accessor. @return booleanp; whether MODULE marks in gather space before performing other search. Used for boolean disjoins searches.
     */
    @LispMethod(comment = "Accessor. @return booleanp; whether MODULE marks in gather space before performing other search. Used for boolean disjoins searches.")
    public static SubLObject sbhl_module_premarks_gather_nodes_p() {
        return makeBoolean(((NIL != sbhl_search_vars.sbhl_boolean_search_p()) && (NIL != sbhl_module_utilities.sbhl_disjoins_search_p())) && (NIL != sbhl_search_vars.sbhl_true_search_p()));
    }

    /**
     * Accessor. @return listp; the gaf part of JUST-STEP.
     */
    @LispMethod(comment = "Accessor. @return listp; the gaf part of JUST-STEP.")
    public static final SubLObject sbhl_just_gaf_alt(SubLObject just_step) {
        return just_step.first();
    }

    /**
     * Accessor. @return listp; the gaf part of JUST-STEP.
     */
    @LispMethod(comment = "Accessor. @return listp; the gaf part of JUST-STEP.")
    public static SubLObject sbhl_just_gaf(final SubLObject just_step) {
        return just_step.first();
    }

    /**
     * Accessor. @return sbhl-mt-object-p; the mt of JUST-STEP.
     */
    @LispMethod(comment = "Accessor. @return sbhl-mt-object-p; the mt of JUST-STEP.")
    public static final SubLObject sbhl_just_mt_alt(SubLObject just_step) {
        return second(just_step);
    }

    /**
     * Accessor. @return sbhl-mt-object-p; the mt of JUST-STEP.
     */
    @LispMethod(comment = "Accessor. @return sbhl-mt-object-p; the mt of JUST-STEP.")
    public static SubLObject sbhl_just_mt(final SubLObject just_step) {
        return second(just_step);
    }

    public static final SubLObject sbhl_possibly_just_mt_alt(SubLObject just_step, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_just_mt(just_step);
                if (NIL != result) {
                    return result;
                } else {
                    if (NIL != mt) {
                        return mt;
                    } else {
                        return mt_relevance_macros.$mt$.getDynamicValue(thread);
                    }
                }
            }
        }
    }

    public static SubLObject sbhl_possibly_just_mt(final SubLObject just_step, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject result = sbhl_just_mt(just_step);
        if (NIL != result) {
            return result;
        }
        if (NIL != mt) {
            return mt;
        }
        return mt_relevance_macros.$mt$.getDynamicValue(thread);
    }

    /**
     * Accessor. @return sbhl-tv-object-p; the truth value of JUST-STEP.
     */
    @LispMethod(comment = "Accessor. @return sbhl-tv-object-p; the truth value of JUST-STEP.")
    public static final SubLObject sbhl_just_tv_alt(SubLObject just_step) {
        return third(just_step);
    }

    /**
     * Accessor. @return sbhl-tv-object-p; the truth value of JUST-STEP.
     */
    @LispMethod(comment = "Accessor. @return sbhl-tv-object-p; the truth value of JUST-STEP.")
    public static SubLObject sbhl_just_tv(final SubLObject just_step) {
        return third(just_step);
    }

    /**
     * Accessor. @return fort-p; the predicate of GAF-FORMULA
     */
    @LispMethod(comment = "Accessor. @return fort-p; the predicate of GAF-FORMULA")
    public static final SubLObject sbhl_gaf_pred_alt(SubLObject gaf_formula) {
        return gaf_formula.first();
    }

    /**
     * Accessor. @return fort-p; the predicate of GAF-FORMULA
     */
    @LispMethod(comment = "Accessor. @return fort-p; the predicate of GAF-FORMULA")
    public static SubLObject sbhl_gaf_pred(final SubLObject gaf_formula) {
        return gaf_formula.first();
    }

    public static final SubLObject hl_default_tv_alt(SubLObject tv) {
        {
            SubLObject pcase_var = tv;
            if (pcase_var.eql($TRUE)) {
                return $TRUE_DEF;
            } else {
                if (pcase_var.eql($FALSE)) {
                    return $FALSE_DEF;
                } else {
                    return $TRUE_DEF;
                }
            }
        }
    }

    public static SubLObject hl_default_tv(final SubLObject tv) {
        if (tv.eql($TRUE)) {
            return $TRUE_DEF;
        }
        if (tv.eql($FALSE)) {
            return $FALSE_DEF;
        }
        return $TRUE_DEF;
    }

    public static final SubLObject sbhl_find_first_matching_gaf_alt(SubLObject gaf_formula) {
        {
            SubLObject gaf = NIL;
            if (NIL == gaf) {
                {
                    SubLObject csome_list_var = kb_indexing.find_all_assertions(clause_utilities.make_gaf_cnf(gaf_formula));
                    SubLObject assertion = NIL;
                    for (assertion = csome_list_var.first(); !((NIL != gaf) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , assertion = csome_list_var.first()) {
                        if (NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(assertion))) {
                            gaf = assertion;
                        }
                    }
                }
            }
            return gaf;
        }
    }

    public static SubLObject sbhl_find_first_matching_gaf(final SubLObject gaf_formula) {
        SubLObject gaf = NIL;
        if (NIL == gaf) {
            SubLObject csome_list_var = kb_indexing.find_all_assertions(clause_utilities.make_gaf_cnf(gaf_formula));
            SubLObject assertion = NIL;
            assertion = csome_list_var.first();
            while ((NIL == gaf) && (NIL != csome_list_var)) {
                if (NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(assertion))) {
                    gaf = assertion;
                }
                csome_list_var = csome_list_var.rest();
                assertion = csome_list_var.first();
            } 
        }
        return gaf;
    }

    /**
     * Accessor. @return gaf-assertion?; the assertion associated with GAF-FORMULA and MT. if the predicate of GAF-FORMULA is symmetric, the associated assertion may have it's arguments flipped.
     */
    @LispMethod(comment = "Accessor. @return gaf-assertion?; the assertion associated with GAF-FORMULA and MT. if the predicate of GAF-FORMULA is symmetric, the associated assertion may have it\'s arguments flipped.")
    public static final SubLObject sbhl_find_gaf_alt(SubLObject gaf_formula, SubLObject mt, SubLObject tv) {
        {
            SubLObject result = NIL;
            SubLObject lucky_gaf = kb_indexing.find_gaf(gaf_formula, mt);
            SubLObject pred = com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_gaf_pred(gaf_formula);
            SubLObject hl_module = sbhl_module_utilities.sbhl_pred_get_hl_module(sbhl_module_utilities.get_sbhl_link_pred(get_sbhl_module(UNPROVIDED)));
            if (NIL != lucky_gaf) {
                result = lucky_gaf;
            } else {
                if (NIL == sbhl_module_utilities.sbhl_predicate_p(pred)) {
                    {
                        SubLObject gaf = com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_find_first_matching_gaf(gaf_formula);
                        if (NIL != gaf) {
                            result = gaf;
                        } else {
                            result = arguments.make_hl_support(hl_module, gaf_formula, mt, com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.hl_default_tv(tv));
                        }
                    }
                } else {
                    if (NIL == sbhl_module_utilities.sbhl_module_directed_linksP(get_sbhl_module(pred))) {
                        {
                            SubLObject datum = gaf_formula;
                            SubLObject current = datum;
                            SubLObject pred_1 = NIL;
                            SubLObject arg1 = NIL;
                            SubLObject arg2 = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt12);
                            pred_1 = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt12);
                            arg1 = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt12);
                            arg2 = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject sym_formula = list(pred_1, arg2, arg1);
                                    SubLObject gaf = kb_indexing.find_gaf(sym_formula, mt);
                                    if (NIL == gaf) {
                                        gaf = com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_find_first_matching_gaf(gaf_formula);
                                    }
                                    if (NIL == gaf) {
                                        gaf = com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_find_first_matching_gaf(sym_formula);
                                    }
                                    if (NIL != gaf) {
                                        result = gaf;
                                    } else {
                                        result = arguments.make_hl_support(hl_module, gaf_formula, mt, com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.hl_default_tv(tv));
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt12);
                            }
                        }
                    } else {
                        {
                            SubLObject gaf = com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_find_first_matching_gaf(gaf_formula);
                            if (NIL != gaf) {
                                result = gaf;
                            } else {
                                result = arguments.make_hl_support(hl_module, gaf_formula, mt, com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.hl_default_tv(tv));
                            }
                        }
                    }
                }
            }
            return result;
        }
    }

    /**
     * Accessor. @return gaf-assertion?; the assertion associated with GAF-FORMULA and MT. if the predicate of GAF-FORMULA is symmetric, the associated assertion may have it's arguments flipped.
     */
    @LispMethod(comment = "Accessor. @return gaf-assertion?; the assertion associated with GAF-FORMULA and MT. if the predicate of GAF-FORMULA is symmetric, the associated assertion may have it\'s arguments flipped.")
    public static SubLObject sbhl_find_gaf(final SubLObject gaf_formula, final SubLObject mt, final SubLObject tv) {
        SubLObject result = NIL;
        final SubLObject lucky_gaf = kb_indexing.find_gaf(gaf_formula, mt);
        final SubLObject pred = sbhl_gaf_pred(gaf_formula);
        final SubLObject hl_module = sbhl_module_utilities.sbhl_pred_get_hl_module(sbhl_module_utilities.get_sbhl_link_pred(sbhl_module_vars.get_sbhl_module(UNPROVIDED)));
        if (NIL != lucky_gaf) {
            result = lucky_gaf;
        } else
            if (NIL == sbhl_module_utilities.sbhl_predicate_p(pred)) {
                final SubLObject gaf = sbhl_find_first_matching_gaf(gaf_formula);
                if (NIL != gaf) {
                    result = gaf;
                } else {
                    result = arguments.make_hl_support(hl_module, gaf_formula, mt, hl_default_tv(tv));
                }
            } else
                if (NIL == sbhl_module_utilities.sbhl_module_directed_linksP(sbhl_module_vars.get_sbhl_module(pred))) {
                    SubLObject pred_$1 = NIL;
                    SubLObject arg1 = NIL;
                    SubLObject arg2 = NIL;
                    destructuring_bind_must_consp(gaf_formula, gaf_formula, $list12);
                    pred_$1 = gaf_formula.first();
                    SubLObject current = gaf_formula.rest();
                    destructuring_bind_must_consp(current, gaf_formula, $list12);
                    arg1 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, gaf_formula, $list12);
                    arg2 = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        final SubLObject sym_formula = list(pred_$1, arg2, arg1);
                        SubLObject gaf2 = kb_indexing.find_gaf(sym_formula, mt);
                        if (NIL == gaf2) {
                            gaf2 = sbhl_find_first_matching_gaf(gaf_formula);
                        }
                        if (NIL == gaf2) {
                            gaf2 = sbhl_find_first_matching_gaf(sym_formula);
                        }
                        if (NIL != gaf2) {
                            result = gaf2;
                        } else {
                            result = arguments.make_hl_support(hl_module, gaf_formula, mt, hl_default_tv(tv));
                        }
                    } else {
                        cdestructuring_bind_error(gaf_formula, $list12);
                    }
                } else {
                    final SubLObject gaf = sbhl_find_first_matching_gaf(gaf_formula);
                    if (NIL != gaf) {
                        result = gaf;
                    } else {
                        result = arguments.make_hl_support(hl_module, gaf_formula, mt, hl_default_tv(tv));
                    }
                }


        return result;
    }

    /**
     * Accessor. Takes JUST-STEP and assembles a justification step it according to @see get-sbhl-just-behavior. The return is either a list or an assertion.
     */
    @LispMethod(comment = "Accessor. Takes JUST-STEP and assembles a justification step it according to @see get-sbhl-just-behavior. The return is either a list or an assertion.")
    public static final SubLObject sbhl_assemble_justification_step_alt(SubLObject just_step, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != arguments.hl_support_p(just_step)) {
            return just_step;
        }
        {
            SubLObject assembly_behavior = sbhl_search_vars.get_sbhl_just_behavior();
            SubLObject just_tv = com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_just_tv(just_step);
            SubLObject tv = (NIL != sbhl_link_vars.sbhl_link_truth_value_p(just_tv)) ? ((SubLObject) (sbhl_search_vars.sbhl_possibly_translate_tv(just_tv))) : just_tv;
            if (NIL == assembly_behavior) {
                if (NIL != sbhl_search_vars.sbhl_justification_defaulted_old_p()) {
                    assembly_behavior = $OLD;
                }
            }
            {
                SubLObject pcase_var = assembly_behavior;
                if (pcase_var.eql($ASSERTION)) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_find_gaf(com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_just_gaf(just_step), com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_possibly_just_mt(just_step, mt), just_tv);
                } else {
                    if (pcase_var.eql($VERBOSE)) {
                        return just_step;
                    } else {
                        if (pcase_var.eql($OLD)) {
                            return NIL != sbhl_search_vars.sbhl_justification_defaulted_old_p() ? ((SubLObject) (list(com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_just_gaf(just_step), tv))) : list(com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_just_gaf(just_step), sbhl_search_vars.sbhl_possibly_translate_tv(com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_just_tv(just_step)));
                        } else {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt16$incorrect_justification_assembly_, assembly_behavior, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Accessor. Takes JUST-STEP and assembles a justification step it according to @see get-sbhl-just-behavior. The return is either a list or an assertion.
     */
    @LispMethod(comment = "Accessor. Takes JUST-STEP and assembles a justification step it according to @see get-sbhl-just-behavior. The return is either a list or an assertion.")
    public static SubLObject sbhl_assemble_justification_step(final SubLObject just_step, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != arguments.hl_support_p(just_step)) {
            return just_step;
        }
        SubLObject assembly_behavior = sbhl_search_vars.get_sbhl_just_behavior();
        final SubLObject just_tv = sbhl_just_tv(just_step);
        final SubLObject tv = (NIL != sbhl_link_vars.sbhl_link_truth_value_p(just_tv)) ? sbhl_search_vars.sbhl_possibly_translate_tv(just_tv) : just_tv;
        if ((NIL == assembly_behavior) && (NIL != sbhl_search_vars.sbhl_justification_defaulted_old_p())) {
            assembly_behavior = $OLD;
        }
        final SubLObject pcase_var = assembly_behavior;
        if (pcase_var.eql($ASSERTION)) {
            return sbhl_find_gaf(sbhl_just_gaf(just_step), sbhl_possibly_just_mt(just_step, mt), just_tv);
        }
        if (pcase_var.eql($VERBOSE)) {
            return just_step;
        }
        if (pcase_var.eql($OLD)) {
            return NIL != sbhl_search_vars.sbhl_justification_defaulted_old_p() ? list(sbhl_just_gaf(just_step), tv) : list(sbhl_just_gaf(just_step), sbhl_search_vars.sbhl_possibly_translate_tv(sbhl_just_tv(just_step)));
        }
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str16$incorrect_justification_assembly_, assembly_behavior, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    /**
     *
     *
     * @return listp; the justification distilled from repeated application of @see sbhl-assemble-justification-step, to JUST-PATH.
     */
    @LispMethod(comment = "@return listp; the justification distilled from repeated application of @see sbhl-assemble-justification-step, to JUST-PATH.")
    public static final SubLObject sbhl_assemble_justification_alt(SubLObject just_path, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != sbhl_search_vars.sbhl_justification_assembled_p()) {
            return just_path;
        } else {
            {
                SubLObject result = NIL;
                SubLObject cdolist_list_var = just_path;
                SubLObject just_step = NIL;
                for (just_step = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , just_step = cdolist_list_var.first()) {
                    result = cons(com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_assemble_justification_step(just_step, mt), result);
                }
                return nreverse(result);
            }
        }
    }

    /**
     *
     *
     * @return listp; the justification distilled from repeated application of @see sbhl-assemble-justification-step, to JUST-PATH.
     */
    @LispMethod(comment = "@return listp; the justification distilled from repeated application of @see sbhl-assemble-justification-step, to JUST-PATH.")
    public static SubLObject sbhl_assemble_justification(final SubLObject just_path, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != sbhl_search_vars.sbhl_justification_assembled_p()) {
            return just_path;
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = just_path;
        SubLObject just_step = NIL;
        just_step = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(sbhl_assemble_justification_step(just_step, mt), result);
            cdolist_list_var = cdolist_list_var.rest();
            just_step = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    /**
     * Wraps the execution of METHOD (with args NODE1 NODE2 MT TV) so that justifications will be accumulated on the unwind. Justification behavior is governed by BEHAVIOR.
     */
    @LispMethod(comment = "Wraps the execution of METHOD (with args NODE1 NODE2 MT TV) so that justifications will be accumulated on the unwind. Justification behavior is governed by BEHAVIOR.")
    public static final SubLObject sbhl_handle_justification_alt(SubLObject method, SubLObject module, SubLObject node1, SubLObject node2, SubLObject mt, SubLObject tv, SubLObject behavior, SubLObject justify_node_equalityP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = sbhl_search_vars.$sbhl_justification_behavior$.getDynamicValue();
        }
        if (justify_node_equalityP == UNPROVIDED) {
            justify_node_equalityP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
            {
                SubLObject just = NIL;
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    SubLObject _prev_bind_4 = $sbhl_module$.currentBinding(thread);
                    SubLObject _prev_bind_5 = sbhl_search_vars.$sbhl_justification_assembled_p$.currentBinding(thread);
                    SubLObject _prev_bind_6 = sbhl_search_vars.$sbhl_justification_defaulted_old$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        $sbhl_module$.bind(module, thread);
                        sbhl_search_vars.$sbhl_justification_assembled_p$.bind(NIL, thread);
                        sbhl_search_vars.$sbhl_justification_defaulted_old$.bind(NIL, thread);
                        if (NIL != behavior) {
                            {
                                SubLObject _prev_bind_0_2 = sbhl_search_vars.$sbhl_justification_behavior$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_justification_behavior$.bind(behavior, thread);
                                    if (((NIL != justify_node_equalityP) && node1.equal(node2)) && (NIL != sbhl_module_utilities.sbhl_reflexive_module_p(module))) {
                                        just = list(arguments.make_hl_support($REFLEXIVE, make_binary_formula(sbhl_module_utilities.get_sbhl_link_pred(module), node1, node2), UNPROVIDED, UNPROVIDED));
                                    } else {
                                        if ((((NIL != justify_node_equalityP) && node1.equal(node2)) && (NIL != sbhl_module_utilities.sbhl_time_module_p(module))) && (NIL != sbhl_time_vars.sbhl_succession_depth_non_negative_p())) {
                                            just = list(list($$equals, node1, node2), mt, $$MonotonicallyTrue);
                                        } else {
                                            {
                                                SubLObject _prev_bind_0_3 = sbhl_search_vars.$sbhl_justification_search_p$.currentBinding(thread);
                                                SubLObject _prev_bind_1_4 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding(thread);
                                                SubLObject _prev_bind_2_5 = sbhl_search_vars.$sbhl_unwind_function$.currentBinding(thread);
                                                SubLObject _prev_bind_3_6 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
                                                SubLObject _prev_bind_4_7 = sbhl_search_vars.$sbhl_justification_result$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$sbhl_justification_search_p$.bind(T, thread);
                                                    sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind(NIL, thread);
                                                    sbhl_search_vars.$sbhl_unwind_function$.bind(NIL != sbhl_module_utilities.sbhl_time_search_p() ? ((SubLObject) (SBHL_TEMPORAL_JUSTIFICATION_UNWIND)) : SBHL_PUSH_UNWIND_ONTO_RESULT, thread);
                                                    sbhl_paranoia.$suspend_sbhl_cache_useP$.bind(T, thread);
                                                    sbhl_search_vars.$sbhl_justification_result$.bind(NIL, thread);
                                                    try {
                                                        result = funcall(method, module, node1, node2, mt, tv);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                just = sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_8, thread);
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    sbhl_search_vars.$sbhl_justification_result$.rebind(_prev_bind_4_7, thread);
                                                    sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_3_6, thread);
                                                    sbhl_search_vars.$sbhl_unwind_function$.rebind(_prev_bind_2_5, thread);
                                                    sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind(_prev_bind_1_4, thread);
                                                    sbhl_search_vars.$sbhl_justification_search_p$.rebind(_prev_bind_0_3, thread);
                                                }
                                            }
                                        }
                                    }
                                    just = com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_assemble_justification(just, mt);
                                } finally {
                                    sbhl_search_vars.$sbhl_justification_behavior$.rebind(_prev_bind_0_2, thread);
                                }
                            }
                        } else {
                            if (((NIL != justify_node_equalityP) && node1.equal(node2)) && (NIL != sbhl_module_utilities.sbhl_reflexive_module_p(module))) {
                                just = list(arguments.make_hl_support($REFLEXIVE, make_binary_formula(sbhl_module_utilities.get_sbhl_link_pred(module), node1, node2), UNPROVIDED, UNPROVIDED));
                            } else {
                                if ((((NIL != justify_node_equalityP) && node1.equal(node2)) && (NIL != sbhl_module_utilities.sbhl_time_module_p(module))) && (NIL != sbhl_time_vars.sbhl_succession_depth_non_negative_p())) {
                                    just = list(list($$equals, node1, node2), mt, $$MonotonicallyTrue);
                                } else {
                                    {
                                        SubLObject _prev_bind_0_9 = sbhl_search_vars.$sbhl_justification_search_p$.currentBinding(thread);
                                        SubLObject _prev_bind_1_10 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding(thread);
                                        SubLObject _prev_bind_2_11 = sbhl_search_vars.$sbhl_unwind_function$.currentBinding(thread);
                                        SubLObject _prev_bind_3_12 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
                                        SubLObject _prev_bind_4_13 = sbhl_search_vars.$sbhl_justification_result$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_justification_search_p$.bind(T, thread);
                                            sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind(NIL, thread);
                                            sbhl_search_vars.$sbhl_unwind_function$.bind(NIL != sbhl_module_utilities.sbhl_time_search_p() ? ((SubLObject) (SBHL_TEMPORAL_JUSTIFICATION_UNWIND)) : SBHL_PUSH_UNWIND_ONTO_RESULT, thread);
                                            sbhl_paranoia.$suspend_sbhl_cache_useP$.bind(T, thread);
                                            sbhl_search_vars.$sbhl_justification_result$.bind(NIL, thread);
                                            try {
                                                result = funcall(method, module, node1, node2, mt, tv);
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0_14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        just = sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_14, thread);
                                                    }
                                                }
                                            }
                                        } finally {
                                            sbhl_search_vars.$sbhl_justification_result$.rebind(_prev_bind_4_13, thread);
                                            sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_3_12, thread);
                                            sbhl_search_vars.$sbhl_unwind_function$.rebind(_prev_bind_2_11, thread);
                                            sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind(_prev_bind_1_10, thread);
                                            sbhl_search_vars.$sbhl_justification_search_p$.rebind(_prev_bind_0_9, thread);
                                        }
                                    }
                                }
                            }
                            just = com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_assemble_justification(just, mt);
                        }
                    } finally {
                        sbhl_search_vars.$sbhl_justification_defaulted_old$.rebind(_prev_bind_6, thread);
                        sbhl_search_vars.$sbhl_justification_assembled_p$.rebind(_prev_bind_5, thread);
                        $sbhl_module$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
                    }
                }
                if (((NIL != list_utilities.lengthGE(just, TWO_INTEGER, UNPROVIDED)) && (NIL != sbhl_module_utilities.sbhl_transitive_module_p(module))) && (NIL == sbhl_module_utilities.sbhl_inverse_module_p(module))) {
                    just = adjoin(com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_module_transitivity_support(module, mt), just, symbol_function(EQUAL), UNPROVIDED);
                }
                return NIL != just ? ((SubLObject) (just)) : result;
            }
        }
    }

    /**
     * Wraps the execution of METHOD (with args NODE1 NODE2 MT TV) so that justifications will be accumulated on the unwind. Justification behavior is governed by BEHAVIOR.
     */
    @LispMethod(comment = "Wraps the execution of METHOD (with args NODE1 NODE2 MT TV) so that justifications will be accumulated on the unwind. Justification behavior is governed by BEHAVIOR.")
    public static SubLObject sbhl_handle_justification(final SubLObject method, final SubLObject module, final SubLObject node1, final SubLObject node2, SubLObject mt, SubLObject tv, SubLObject behavior, SubLObject justify_node_equalityP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = sbhl_search_vars.$sbhl_justification_behavior$.getDynamicValue();
        }
        if (justify_node_equalityP == UNPROVIDED) {
            justify_node_equalityP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        SubLObject just = NIL;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_6 = sbhl_search_vars.$sbhl_justification_assembled_p$.currentBinding(thread);
        final SubLObject _prev_bind_7 = sbhl_search_vars.$sbhl_justification_defaulted_old$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_justification_assembled_p$.bind(NIL, thread);
            sbhl_search_vars.$sbhl_justification_defaulted_old$.bind(NIL, thread);
            if (NIL != behavior) {
                final SubLObject _prev_bind_0_$2 = sbhl_search_vars.$sbhl_justification_behavior$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_justification_behavior$.bind(behavior, thread);
                    if (((NIL != justify_node_equalityP) && node1.equal(node2)) && (NIL != sbhl_module_utilities.sbhl_reflexive_module_p(module))) {
                        just = list(arguments.make_hl_support($REFLEXIVE, make_binary_formula(sbhl_module_utilities.get_sbhl_link_pred(module), node1, node2), UNPROVIDED, UNPROVIDED));
                    } else
                        if ((((NIL != justify_node_equalityP) && node1.equal(node2)) && (NIL != sbhl_module_utilities.sbhl_time_module_p(module))) && (NIL != sbhl_time_vars.sbhl_succession_depth_non_negative_p())) {
                            just = list(list($$equals, node1, node2), mt, $$MonotonicallyTrue);
                        } else {
                            final SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_justification_search_p$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$4 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$5 = sbhl_search_vars.$sbhl_unwind_function$.currentBinding(thread);
                            final SubLObject _prev_bind_3_$6 = sbhl_search_vars.$sbhl_justification_result$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_justification_search_p$.bind(T, thread);
                                sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_unwind_function$.bind(NIL != sbhl_module_utilities.sbhl_time_search_p() ? SBHL_TEMPORAL_JUSTIFICATION_UNWIND : SBHL_PUSH_UNWIND_ONTO_RESULT, thread);
                                sbhl_search_vars.$sbhl_justification_result$.bind(NIL, thread);
                                try {
                                    result = funcall(method, module, node1, node2, mt, tv);
                                } finally {
                                    final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        just = sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread);
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                    }
                                }
                            } finally {
                                sbhl_search_vars.$sbhl_justification_result$.rebind(_prev_bind_3_$6, thread);
                                sbhl_search_vars.$sbhl_unwind_function$.rebind(_prev_bind_2_$5, thread);
                                sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind(_prev_bind_1_$4, thread);
                                sbhl_search_vars.$sbhl_justification_search_p$.rebind(_prev_bind_0_$3, thread);
                            }
                        }

                    just = sbhl_assemble_justification(just, mt);
                } finally {
                    sbhl_search_vars.$sbhl_justification_behavior$.rebind(_prev_bind_0_$2, thread);
                }
            } else {
                if (((NIL != justify_node_equalityP) && node1.equal(node2)) && (NIL != sbhl_module_utilities.sbhl_reflexive_module_p(module))) {
                    just = list(arguments.make_hl_support($REFLEXIVE, make_binary_formula(sbhl_module_utilities.get_sbhl_link_pred(module), node1, node2), UNPROVIDED, UNPROVIDED));
                } else
                    if ((((NIL != justify_node_equalityP) && node1.equal(node2)) && (NIL != sbhl_module_utilities.sbhl_time_module_p(module))) && (NIL != sbhl_time_vars.sbhl_succession_depth_non_negative_p())) {
                        just = list(list($$equals, node1, node2), mt, $$MonotonicallyTrue);
                    } else {
                        final SubLObject _prev_bind_0_$5 = sbhl_search_vars.$sbhl_justification_search_p$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$5 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$6 = sbhl_search_vars.$sbhl_unwind_function$.currentBinding(thread);
                        final SubLObject _prev_bind_3_$7 = sbhl_search_vars.$sbhl_justification_result$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_justification_search_p$.bind(T, thread);
                            sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind(NIL, thread);
                            sbhl_search_vars.$sbhl_unwind_function$.bind(NIL != sbhl_module_utilities.sbhl_time_search_p() ? SBHL_TEMPORAL_JUSTIFICATION_UNWIND : SBHL_PUSH_UNWIND_ONTO_RESULT, thread);
                            sbhl_search_vars.$sbhl_justification_result$.bind(NIL, thread);
                            try {
                                result = funcall(method, module, node1, node2, mt, tv);
                            } finally {
                                final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    just = sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread);
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                }
                            }
                        } finally {
                            sbhl_search_vars.$sbhl_justification_result$.rebind(_prev_bind_3_$7, thread);
                            sbhl_search_vars.$sbhl_unwind_function$.rebind(_prev_bind_2_$6, thread);
                            sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind(_prev_bind_1_$5, thread);
                            sbhl_search_vars.$sbhl_justification_search_p$.rebind(_prev_bind_0_$5, thread);
                        }
                    }

                just = sbhl_assemble_justification(just, mt);
            }
        } finally {
            sbhl_search_vars.$sbhl_justification_defaulted_old$.rebind(_prev_bind_7, thread);
            sbhl_search_vars.$sbhl_justification_assembled_p$.rebind(_prev_bind_6, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        if (((NIL != list_utilities.lengthGE(just, TWO_INTEGER, UNPROVIDED)) && (NIL != sbhl_module_utilities.sbhl_transitive_module_p(module))) && (NIL == sbhl_module_utilities.sbhl_inverse_module_p(module))) {
            just = adjoin(sbhl_module_transitivity_support(module, mt), just, symbol_function(EQUAL), UNPROVIDED);
        }
        return NIL != just ? just : result;
    }

    public static final SubLObject sbhl_module_transitivity_support_alt(SubLObject module, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == sbhl_module_utilities.sbhl_transitive_module_p(module)) {
                    Errors.error($str_alt22$_S_is_not_a_transitive_module, module);
                }
            }
            return removal_modules_transitivity.make_transitivity_support(sbhl_module_utilities.get_sbhl_link_pred(module), $$UniversalVocabularyMt, UNPROVIDED);
        }
    }

    public static SubLObject sbhl_module_transitivity_support(final SubLObject module, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == sbhl_module_utilities.sbhl_transitive_module_p(module))) {
            Errors.error($str22$_S_is_not_a_transitive_module, module);
        }
        return removal_modules_transitivity.make_transitivity_support(sbhl_module_utilities.get_sbhl_link_pred(module), $$UniversalVocabularyMt, UNPROVIDED);
    }

    public static final SubLObject sbhl_set_empty_extent_justification_alt(SubLObject node) {
        sbhl_search_vars.$sbhl_justification_result$.setDynamicValue(list(list(list($$disjointWith, node, node), NIL, $TRUE)));
        return NIL;
    }

    public static SubLObject sbhl_set_empty_extent_justification(final SubLObject node) {
        sbhl_search_vars.$sbhl_justification_result$.setDynamicValue(list(list(list($$disjointWith, node, node), NIL, $TRUE)));
        return NIL;
    }

    /**
     * Accessor. @return listp; the pseudo link list of the module tag for current *sbhl-module*, NODE, LINK-NODE, and the current *sbhl-link-mt*.
     */
    @LispMethod(comment = "Accessor. @return listp; the pseudo link list of the module tag for current *sbhl-module*, NODE, LINK-NODE, and the current *sbhl-link-mt*.")
    public static final SubLObject sbhl_temporal_faux_link_alt(SubLObject node, SubLObject link_node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list(sbhl_module_utilities.get_sbhl_module_tag(get_sbhl_module(UNPROVIDED)), node, link_node, sbhl_link_vars.$sbhl_link_mt$.getDynamicValue(thread));
        }
    }

    /**
     * Accessor. @return listp; the pseudo link list of the module tag for current *sbhl-module*, NODE, LINK-NODE, and the current *sbhl-link-mt*.
     */
    @LispMethod(comment = "Accessor. @return listp; the pseudo link list of the module tag for current *sbhl-module*, NODE, LINK-NODE, and the current *sbhl-link-mt*.")
    public static SubLObject sbhl_temporal_faux_link(final SubLObject node, final SubLObject link_node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list(sbhl_module_utilities.get_sbhl_module_tag(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), node, link_node, sbhl_link_vars.$sbhl_link_mt$.getDynamicValue(thread));
    }

    /**
     * returns justification for LINK.
     */
    @LispMethod(comment = "returns justification for LINK.")
    public static final SubLObject any_support_chain_of_temporal_link_alt(SubLObject link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject supports = gethash(link, sbhl_time_vars.$sbhl_temporal_link_support_table$.getGlobalValue(), UNPROVIDED);
                if (NIL == result) {
                    {
                        SubLObject csome_list_var = supports;
                        SubLObject support = NIL;
                        for (support = csome_list_var.first(); !((NIL != result) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , support = csome_list_var.first()) {
                            if (support.isKeyword()) {
                                if (NIL != sbhl_time_vars.$sbhl_temporality_verbose_justsP$.getDynamicValue(thread)) {
                                    if (NIL != sbhl_time_vars.$sbhl_temporality_include_only_links_in_verbose_justsP$.getDynamicValue(thread)) {
                                        result = cons(link, result);
                                    } else {
                                        result = cons(list(link, supports.first()), result);
                                    }
                                } else {
                                    return NIL;
                                }
                            } else {
                                if (NIL != assertions_high.valid_assertion(support, UNPROVIDED)) {
                                    if (NIL != sbhl_time_vars.$sbhl_temporality_verbose_justsP$.getDynamicValue(thread)) {
                                        if (NIL != sbhl_time_vars.$sbhl_temporality_include_only_links_in_verbose_justsP$.getDynamicValue(thread)) {
                                            result = cons(link, result);
                                        } else {
                                            result = cons(list(link, support), result);
                                        }
                                    } else {
                                        result = cons(support, result);
                                    }
                                } else {
                                    if (support.isCons()) {
                                        result = com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.any_support_chain_of_link_disjunction_consequent(support, link);
                                    }
                                }
                            }
                        }
                    }
                }
                return result;
            }
        }
    }

    /**
     * returns justification for LINK.
     */
    @LispMethod(comment = "returns justification for LINK.")
    public static SubLObject any_support_chain_of_temporal_link(final SubLObject link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject supports = gethash(link, sbhl_time_vars.$sbhl_temporal_link_support_table$.getGlobalValue(), UNPROVIDED);
        if (NIL == result) {
            SubLObject csome_list_var = supports;
            SubLObject support = NIL;
            support = csome_list_var.first();
            while ((NIL == result) && (NIL != csome_list_var)) {
                if (support.isKeyword()) {
                    if (NIL == sbhl_time_vars.$sbhl_temporality_verbose_justsP$.getDynamicValue(thread)) {
                        return NIL;
                    }
                    if (NIL != sbhl_time_vars.$sbhl_temporality_include_only_links_in_verbose_justsP$.getDynamicValue(thread)) {
                        result = cons(link, result);
                    } else {
                        result = cons(list(link, supports.first()), result);
                    }
                } else
                    if (NIL != assertions_high.valid_assertion(support, UNPROVIDED)) {
                        if (NIL != sbhl_time_vars.$sbhl_temporality_verbose_justsP$.getDynamicValue(thread)) {
                            if (NIL != sbhl_time_vars.$sbhl_temporality_include_only_links_in_verbose_justsP$.getDynamicValue(thread)) {
                                result = cons(link, result);
                            } else {
                                result = cons(list(link, support), result);
                            }
                        } else {
                            result = cons(support, result);
                        }
                    } else
                        if (support.isCons()) {
                            result = any_support_chain_of_link_disjunction_consequent(support, link);
                        }


                csome_list_var = csome_list_var.rest();
                support = csome_list_var.first();
            } 
        }
        return result;
    }

    /**
     * returns justification
     */
    @LispMethod(comment = "returns justification")
    public static final SubLObject any_support_chain_of_link_disjunction_consequent_alt(SubLObject link_disjunction, SubLObject link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject supports = gethash(link_disjunction, sbhl_time_vars.$sbhl_temporal_link_disjunction_support_table$.getGlobalValue(), UNPROVIDED);
                SubLObject consequent = gethash(link_disjunction, sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.getDynamicValue(thread), UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporality_consequent_links_search_passed_through$.currentBinding(thread);
                    try {
                        sbhl_time_vars.$sbhl_temporality_consequent_links_search_passed_through$.bind(cons(link, sbhl_time_vars.$sbhl_temporality_consequent_links_search_passed_through$.getDynamicValue(thread)), thread);
                        if (NIL == result) {
                            {
                                SubLObject csome_list_var = supports;
                                SubLObject support = NIL;
                                for (support = csome_list_var.first(); !((NIL != result) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , support = csome_list_var.first()) {
                                    if (NIL != assertions_high.valid_assertion(support, UNPROVIDED)) {
                                        if (NIL != sbhl_time_vars.$sbhl_temporality_verbose_justsP$.getDynamicValue(thread)) {
                                            if (NIL != sbhl_time_vars.$sbhl_temporality_include_only_links_in_verbose_justsP$.getDynamicValue(thread)) {
                                                result = cons(list(link, link_disjunction), result);
                                            } else {
                                                result = cons(list(link, list(link_disjunction, support)), result);
                                            }
                                        } else {
                                            result = cons(support, result);
                                        }
                                    }
                                }
                            }
                        }
                        {
                            SubLObject disjuncts = link_disjunction.first();
                            SubLObject mt = fourth(link);
                            SubLObject cdolist_list_var = disjuncts;
                            SubLObject disjunct = NIL;
                            for (disjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , disjunct = cdolist_list_var.first()) {
                                if (!disjunct.equal(consequent)) {
                                    {
                                        SubLObject negation = sbhl_time_query_processing.temporal_link_negation(disjunct);
                                        SubLObject link_tag = negation.first();
                                        SubLObject before = second(negation);
                                        SubLObject after = third(negation);
                                        result = append(sbhl_time_query_processing.why_true_temporal_quasi_linkP(link_tag, before, after, mt), result);
                                    }
                                }
                            }
                        }
                    } finally {
                        sbhl_time_vars.$sbhl_temporality_consequent_links_search_passed_through$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * returns justification
     */
    @LispMethod(comment = "returns justification")
    public static SubLObject any_support_chain_of_link_disjunction_consequent(final SubLObject link_disjunction, final SubLObject link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject supports = gethash(link_disjunction, sbhl_time_vars.$sbhl_temporal_link_disjunction_support_table$.getGlobalValue(), UNPROVIDED);
        final SubLObject consequent = gethash(link_disjunction, sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.getDynamicValue(thread), UNPROVIDED);
        final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporality_consequent_links_search_passed_through$.currentBinding(thread);
        try {
            sbhl_time_vars.$sbhl_temporality_consequent_links_search_passed_through$.bind(cons(link, sbhl_time_vars.$sbhl_temporality_consequent_links_search_passed_through$.getDynamicValue(thread)), thread);
            if (NIL == result) {
                SubLObject csome_list_var = supports;
                SubLObject support = NIL;
                support = csome_list_var.first();
                while ((NIL == result) && (NIL != csome_list_var)) {
                    if (NIL != assertions_high.valid_assertion(support, UNPROVIDED)) {
                        if (NIL != sbhl_time_vars.$sbhl_temporality_verbose_justsP$.getDynamicValue(thread)) {
                            if (NIL != sbhl_time_vars.$sbhl_temporality_include_only_links_in_verbose_justsP$.getDynamicValue(thread)) {
                                result = cons(list(link, link_disjunction), result);
                            } else {
                                result = cons(list(link, list(link_disjunction, support)), result);
                            }
                        } else {
                            result = cons(support, result);
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    support = csome_list_var.first();
                } 
            }
            final SubLObject disjuncts = link_disjunction.first();
            final SubLObject mt = fourth(link);
            SubLObject cdolist_list_var = disjuncts;
            SubLObject disjunct = NIL;
            disjunct = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (!disjunct.equal(consequent)) {
                    final SubLObject negation = sbhl_time_query_processing.temporal_link_negation(disjunct);
                    final SubLObject link_tag = negation.first();
                    final SubLObject before = second(negation);
                    final SubLObject after = third(negation);
                    result = append(sbhl_time_query_processing.why_true_temporal_quasi_linkP(link_tag, before, after, mt), result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                disjunct = cdolist_list_var.first();
            } 
        } finally {
            sbhl_time_vars.$sbhl_temporality_consequent_links_search_passed_through$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @return booleanp; whether NODE and its markings indicate that it is a valid candidate for pushing onto result.
     */
    @LispMethod(comment = "@return booleanp; whether NODE and its markings indicate that it is a valid candidate for pushing onto result.")
    public static final SubLObject sbhl_node_valid_for_temporal_search_result_p_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != sbhl_search_vars.sbhl_boolean_search_p()) {
                return sbhl_marking_utilities.sbhl_nodes_marking_non_negative_p(node, UNPROVIDED);
            } else {
                if (NIL != sbhl_marking_vars.sbhl_temporality_search_checks_nodes_in_target_space_p()) {
                    return makeBoolean((((NIL != sbhl_marking_utilities.sbhl_nodes_marking_non_negative_p(node, UNPROVIDED)) && (NIL != sbhl_marking_utilities.sbhl_current_temporal_node_not_yet_considered_p())) && (NIL != sbhl_marking_utilities.sbhl_nodes_marking_non_negative_p(node, sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread)))) && (NIL != sbhl_time_utilities.sbhl_node_passes_temporality_all_accesses_filtersP(node)));
                } else {
                    return makeBoolean(((NIL != sbhl_marking_utilities.sbhl_nodes_marking_non_negative_p(node, UNPROVIDED)) && (NIL != sbhl_marking_utilities.sbhl_current_temporal_node_not_yet_considered_p())) && (NIL != sbhl_time_utilities.sbhl_node_passes_temporality_all_accesses_filtersP(node)));
                }
            }
        }
    }

    /**
     *
     *
     * @return booleanp; whether NODE and its markings indicate that it is a valid candidate for pushing onto result.
     */
    @LispMethod(comment = "@return booleanp; whether NODE and its markings indicate that it is a valid candidate for pushing onto result.")
    public static SubLObject sbhl_node_valid_for_temporal_search_result_p(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sbhl_search_vars.sbhl_boolean_search_p()) {
            return sbhl_marking_utilities.sbhl_nodes_marking_non_negative_p(node, UNPROVIDED);
        }
        if (NIL != sbhl_marking_vars.sbhl_temporality_search_checks_nodes_in_target_space_p()) {
            return makeBoolean((((NIL != sbhl_marking_utilities.sbhl_nodes_marking_non_negative_p(node, UNPROVIDED)) && (NIL != sbhl_marking_utilities.sbhl_current_temporal_node_not_yet_considered_p())) && (NIL != sbhl_marking_utilities.sbhl_nodes_marking_non_negative_p(node, sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread)))) && (NIL != sbhl_time_utilities.sbhl_node_passes_temporality_all_accesses_filtersP(node)));
        }
        return makeBoolean(((NIL != sbhl_marking_utilities.sbhl_nodes_marking_non_negative_p(node, UNPROVIDED)) && (NIL != sbhl_marking_utilities.sbhl_current_temporal_node_not_yet_considered_p())) && (NIL != sbhl_time_utilities.sbhl_node_passes_temporality_all_accesses_filtersP(node)));
    }

    /**
     *
     *
     * @unknown removes funcalls. Applies TEST-FN (to NODE, where appropriate).  Used to determine whether to add node to result.
     */
    @LispMethod(comment = "@unknown removes funcalls. Applies TEST-FN (to NODE, where appropriate).  Used to determine whether to add node to result.")
    public static final SubLObject apply_sbhl_add_node_test_alt(SubLObject test_fn, SubLObject node) {
        {
            SubLObject pcase_var = test_fn;
            if (pcase_var.eql(NOT_GENL_INVERSE_MODE_P)) {
                return sbhl_search_vars.not_genl_inverse_mode_p();
            } else {
                if (pcase_var.eql(GENL_INVERSE_MODE_P)) {
                    return sbhl_search_vars.genl_inverse_mode_p();
                } else {
                    if (pcase_var.eql(NON_EMPTY_EXTENT)) {
                        return T;
                    } else {
                        if (pcase_var.eql(SBHL_NODE_VALID_FOR_TEMPORAL_SEARCH_RESULT_P)) {
                            return com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_node_valid_for_temporal_search_result_p(node);
                        } else {
                            sbhl_paranoia.sbhl_warn(THREE_INTEGER, $str_alt29$Using_potentially_unsupported_gat, test_fn, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            return funcall(test_fn, node);
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @unknown removes funcalls. Applies TEST-FN (to NODE, where appropriate).  Used to determine whether to add node to result.
     */
    @LispMethod(comment = "@unknown removes funcalls. Applies TEST-FN (to NODE, where appropriate).  Used to determine whether to add node to result.")
    public static SubLObject apply_sbhl_add_node_test(final SubLObject test_fn, final SubLObject node) {
        if (test_fn.eql(NOT_GENL_INVERSE_MODE_P)) {
            return sbhl_search_vars.not_genl_inverse_mode_p();
        }
        if (test_fn.eql(GENL_INVERSE_MODE_P)) {
            return sbhl_search_vars.genl_inverse_mode_p();
        }
        if (test_fn.eql(NON_EMPTY_EXTENT)) {
            return T;
        }
        if (test_fn.eql(SBHL_NODE_VALID_FOR_TEMPORAL_SEARCH_RESULT_P)) {
            return sbhl_node_valid_for_temporal_search_result_p(node);
        }
        sbhl_paranoia.sbhl_warn(THREE_INTEGER, $str29$Using_potentially_unsupported_gat, test_fn, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return funcall(test_fn, node);
    }

    /**
     *
     *
     * @unknown removes funcalls. Applies TEST-FN to MARKING. Used during searches on marked nodes to determine whether to add node to result.
     */
    @LispMethod(comment = "@unknown removes funcalls. Applies TEST-FN to MARKING. Used during searches on marked nodes to determine whether to add node to result.")
    public static final SubLObject apply_sbhl_add_unmarked_node_test_alt(SubLObject test_fn) {
        {
            SubLObject pcase_var = test_fn;
            if (pcase_var.eql(GENL_INVERSE_MODE_P)) {
                return sbhl_search_vars.genl_inverse_mode_p();
            } else {
                if (pcase_var.eql(NOT_GENL_INVERSE_MODE_P)) {
                    return sbhl_search_vars.not_genl_inverse_mode_p();
                } else {
                    sbhl_paranoia.sbhl_warn(ONE_INTEGER, $str_alt30$Using_potentially_unsupported_unm, test_fn, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return funcall(test_fn);
                }
            }
        }
    }

    /**
     *
     *
     * @unknown removes funcalls. Applies TEST-FN to MARKING. Used during searches on marked nodes to determine whether to add node to result.
     */
    @LispMethod(comment = "@unknown removes funcalls. Applies TEST-FN to MARKING. Used during searches on marked nodes to determine whether to add node to result.")
    public static SubLObject apply_sbhl_add_unmarked_node_test(final SubLObject test_fn) {
        if (test_fn.eql(GENL_INVERSE_MODE_P)) {
            return sbhl_search_vars.genl_inverse_mode_p();
        }
        if (test_fn.eql(NOT_GENL_INVERSE_MODE_P)) {
            return sbhl_search_vars.not_genl_inverse_mode_p();
        }
        sbhl_paranoia.sbhl_warn(ONE_INTEGER, $str30$Using_potentially_unsupported_unm, test_fn, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return funcall(test_fn);
    }

    /**
     * Modifier. will push NODE onto @see *sbhl-result*.
     */
    @LispMethod(comment = "Modifier. will push NODE onto @see *sbhl-result*.")
    public static final SubLObject sbhl_push_onto_result_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sbhl_search_vars.$sbhl_result$.setDynamicValue(cons(node, sbhl_search_vars.$sbhl_result$.getDynamicValue(thread)), thread);
            return NIL;
        }
    }

    /**
     * Modifier. will push NODE onto @see *sbhl-result*.
     */
    @LispMethod(comment = "Modifier. will push NODE onto @see *sbhl-result*.")
    public static SubLObject sbhl_push_onto_result(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_search_vars.$sbhl_result$.setDynamicValue(cons(node, sbhl_search_vars.$sbhl_result$.getDynamicValue(thread)), thread);
        return NIL;
    }

    /**
     * Modifier. will push NODE onto *sbhl-result* if applying *sbhl-compose-fn* to node gives a non-nil answer.
     */
    @LispMethod(comment = "Modifier. will push NODE onto *sbhl-result* if applying *sbhl-compose-fn* to node gives a non-nil answer.")
    public static final SubLObject sbhl_push_onto_result_if_alt(SubLObject node) {
        {
            SubLObject compose_fn = sbhl_search_vars.get_sbhl_compose_fn();
            SubLObject test_p = funcall(compose_fn, node);
            if (NIL != test_p) {
                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_push_onto_result(node);
            }
        }
        return NIL;
    }

    /**
     * Modifier. will push NODE onto *sbhl-result* if applying *sbhl-compose-fn* to node gives a non-nil answer.
     */
    @LispMethod(comment = "Modifier. will push NODE onto *sbhl-result* if applying *sbhl-compose-fn* to node gives a non-nil answer.")
    public static SubLObject sbhl_push_onto_result_if(final SubLObject node) {
        final SubLObject compose_fn = sbhl_search_vars.get_sbhl_compose_fn();
        final SubLObject test_p = funcall(compose_fn, node);
        if (NIL != test_p) {
            sbhl_push_onto_result(node);
        }
        return NIL;
    }

    public static final SubLObject sbhl_push_onto_result_if_and_stop_unless_alt(SubLObject node) {
        {
            SubLObject compose_fn = sbhl_search_vars.get_sbhl_compose_fn();
            SubLObject test_p = funcall(compose_fn, node);
            if (NIL != test_p) {
                sbhl_search_vars.sbhl_continue_search_path();
                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_push_onto_result(node);
            } else {
                sbhl_search_vars.sbhl_stop_search_path();
            }
        }
        return NIL;
    }

    public static SubLObject sbhl_push_onto_result_if_and_stop_unless(final SubLObject node) {
        final SubLObject compose_fn = sbhl_search_vars.get_sbhl_compose_fn();
        final SubLObject test_p = funcall(compose_fn, node);
        if (NIL != test_p) {
            sbhl_search_vars.sbhl_continue_search_path();
            sbhl_push_onto_result(node);
        } else {
            sbhl_search_vars.sbhl_stop_search_path();
        }
        return NIL;
    }

    /**
     * Modifier. Applies *sbhl-compose-fn* to node. *sbhl-compose-fn* should return a list of two values: result and done? Sets the value of *sbhl-finished?* to done? and pushes result on to *sbhl-result* when the result is non nil
     */
    @LispMethod(comment = "Modifier. Applies *sbhl-compose-fn* to node. *sbhl-compose-fn* should return a list of two values: result and done? Sets the value of *sbhl-finished?* to done? and pushes result on to *sbhl-result* when the result is non nil")
    public static final SubLObject sbhl_push_onto_result_with_prune_alt(SubLObject node) {
        {
            SubLObject compose_fn = sbhl_search_vars.get_sbhl_compose_fn();
            SubLObject v_return = funcall(compose_fn, node);
            SubLObject datum = v_return;
            SubLObject current = datum;
            SubLObject result = NIL;
            SubLObject doneP = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt31);
            result = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt31);
            doneP = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != doneP) {
                    if (NIL != result) {
                        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_push_onto_result(result);
                        sbhl_search_vars.sbhl_stop_search_path();
                    }
                } else {
                    sbhl_search_vars.sbhl_continue_search_path();
                    if (NIL != result) {
                        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_push_onto_result(result);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt31);
            }
        }
        return NIL;
    }

    /**
     * Modifier. Applies *sbhl-compose-fn* to node. *sbhl-compose-fn* should return a list of two values: result and done? Sets the value of *sbhl-finished?* to done? and pushes result on to *sbhl-result* when the result is non nil
     */
    @LispMethod(comment = "Modifier. Applies *sbhl-compose-fn* to node. *sbhl-compose-fn* should return a list of two values: result and done? Sets the value of *sbhl-finished?* to done? and pushes result on to *sbhl-result* when the result is non nil")
    public static SubLObject sbhl_push_onto_result_with_prune(final SubLObject node) {
        final SubLObject compose_fn = sbhl_search_vars.get_sbhl_compose_fn();
        final SubLObject v_return = funcall(compose_fn, node);
        SubLObject current;
        final SubLObject datum = current = v_return;
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        destructuring_bind_must_consp(current, datum, $list31);
        result = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list31);
        doneP = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != doneP) {
                if (NIL != result) {
                    sbhl_push_onto_result(result);
                    sbhl_search_vars.sbhl_stop_search_path();
                }
            } else {
                sbhl_search_vars.sbhl_continue_search_path();
                if (NIL != result) {
                    sbhl_push_onto_result(result);
                }
            }
        } else {
            cdestructuring_bind_error(datum, $list31);
        }
        return NIL;
    }

    /**
     * Modifier: will push a list of *sbhl-module*, the nodes in NODELIST, *sbhl-link-mt*, and sbhl-link-tv* onto the result. If search is a time search, instead calls @see sbhl-temporal-justification-unwind.
     */
    @LispMethod(comment = "Modifier: will push a list of *sbhl-module*, the nodes in NODELIST, *sbhl-link-mt*, and sbhl-link-tv* onto the result. If search is a time search, instead calls @see sbhl-temporal-justification-unwind.")
    public static final SubLObject sbhl_push_unwind_onto_result_alt(SubLObject nodelist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != sbhl_module_utilities.sbhl_time_search_p()) {
                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_temporal_justification_unwind(nodelist);
            } else {
                {
                    SubLObject directedP = sbhl_module_utilities.sbhl_module_directed_linksP(get_sbhl_module(UNPROVIDED));
                    SubLObject forwardP = (NIL != directedP) ? ((SubLObject) (sbhl_link_vars.sbhl_forward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction()))) : T;
                    SubLObject node1 = (NIL != forwardP) ? ((SubLObject) (nodelist.first())) : second(nodelist);
                    SubLObject node2 = (NIL != forwardP) ? ((SubLObject) (second(nodelist))) : nodelist.first();
                    if ((NIL != forts.fort_p(node1)) || (NIL == forwardP)) {
                        sbhl_search_vars.$sbhl_justification_result$.setDynamicValue(cons(list(list(sbhl_module_utilities.get_sbhl_link_pred(get_sbhl_module(UNPROVIDED)), node1, node2), sbhl_link_vars.get_sbhl_link_mt(), sbhl_link_vars.get_sbhl_link_tv()), sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread)), thread);
                    } else {
                        sbhl_search_vars.$sbhl_justification_result$.setDynamicValue(cons(sbhl_nat_utilities.sbhl_determine_naut_just_step(node1, node2, sbhl_link_vars.get_sbhl_link_generator()), sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread)), thread);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Modifier: will push a list of *sbhl-module*, the nodes in NODELIST, *sbhl-link-mt*, and sbhl-link-tv* onto the result. If search is a time search, instead calls @see sbhl-temporal-justification-unwind.
     */
    @LispMethod(comment = "Modifier: will push a list of *sbhl-module*, the nodes in NODELIST, *sbhl-link-mt*, and sbhl-link-tv* onto the result. If search is a time search, instead calls @see sbhl-temporal-justification-unwind.")
    public static SubLObject sbhl_push_unwind_onto_result(final SubLObject nodelist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sbhl_module_utilities.sbhl_time_search_p()) {
            sbhl_temporal_justification_unwind(nodelist);
        } else {
            final SubLObject directedP = sbhl_module_utilities.sbhl_module_directed_linksP(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
            final SubLObject forwardP = (NIL != directedP) ? sbhl_link_vars.sbhl_forward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction()) : T;
            final SubLObject node1 = (NIL != forwardP) ? nodelist.first() : second(nodelist);
            final SubLObject node2 = (NIL != forwardP) ? second(nodelist) : nodelist.first();
            if ((NIL != forts.fort_p(node1)) || (NIL == forwardP)) {
                sbhl_search_vars.$sbhl_justification_result$.setDynamicValue(cons(list(list(sbhl_module_utilities.get_sbhl_link_pred(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), node1, node2), sbhl_link_vars.get_sbhl_link_mt(), sbhl_link_vars.get_sbhl_link_tv()), sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread)), thread);
            } else {
                sbhl_search_vars.$sbhl_justification_result$.setDynamicValue(cons(sbhl_nat_utilities.sbhl_determine_naut_just_step(node1, node2, sbhl_link_vars.get_sbhl_link_generator()), sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread)), thread);
            }
        }
        return NIL;
    }

    /**
     * Modifier. generates a faux link from NODELIST with @see sbhl-temporal-faux-link. Unless the unwind is between the first and last date point encountered during the search-path, will push onto *sbhl-result* @see any-support-of-temporal-link, applied to the faux-link.
     */
    @LispMethod(comment = "Modifier. generates a faux link from NODELIST with @see sbhl-temporal-faux-link. Unless the unwind is between the first and last date point encountered during the search-path, will push onto *sbhl-result* @see any-support-of-temporal-link, applied to the faux-link.")
    public static final SubLObject sbhl_temporal_justification_unwind_alt(SubLObject nodelist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject node = nodelist.first();
                SubLObject link_node = second(nodelist);
                SubLObject faux_link = com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_temporal_faux_link(node, link_node);
                if (NIL != sbhl_time_utilities.hl_date_point_p(link_node)) {
                    sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.setDynamicValue(T, thread);
                }
                if (!(((NIL != sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.getDynamicValue(thread)) && (NIL != sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.getDynamicValue(thread))) && (NIL == sbhl_time_vars.$sbhl_temporality_verbose_justsP$.getDynamicValue(thread)))) {
                    {
                        SubLObject support = com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.any_support_chain_of_temporal_link(faux_link);
                        if (NIL != support) {
                            sbhl_search_vars.$sbhl_result$.setDynamicValue(cons(support, sbhl_search_vars.$sbhl_result$.getDynamicValue(thread)), thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Modifier. generates a faux link from NODELIST with @see sbhl-temporal-faux-link. Unless the unwind is between the first and last date point encountered during the search-path, will push onto *sbhl-result* @see any-support-of-temporal-link, applied to the faux-link.")
    public static SubLObject sbhl_temporal_justification_unwind(final SubLObject nodelist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject node = nodelist.first();
        final SubLObject link_node = second(nodelist);
        final SubLObject faux_link = sbhl_temporal_faux_link(node, link_node);
        if (NIL != sbhl_time_utilities.hl_date_point_p(link_node)) {
            sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.setDynamicValue(T, thread);
        }
        if (((NIL == sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.getDynamicValue(thread)) || (NIL == sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.getDynamicValue(thread))) || (NIL != sbhl_time_vars.$sbhl_temporality_verbose_justsP$.getDynamicValue(thread))) {
            final SubLObject support = any_support_chain_of_temporal_link(faux_link);
            if (NIL != support) {
                sbhl_search_vars.$sbhl_result$.setDynamicValue(cons(support, sbhl_search_vars.$sbhl_result$.getDynamicValue(thread)), thread);
            }
        }
        return NIL;
    }/**
     * Modifier. generates a faux link from NODELIST with @see sbhl-temporal-faux-link. Unless the unwind is between the first and last date point encountered during the search-path, will push onto *sbhl-result* @see any-support-of-temporal-link, applied to the faux-link.
     */


    /**
     * Modifier. Applies *sbhl-compose-fn* to NODE.
     */
    @LispMethod(comment = "Modifier. Applies *sbhl-compose-fn* to NODE.")
    public static final SubLObject sbhl_apply_compose_fn_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject compose_fn = sbhl_search_vars.get_sbhl_compose_fn();
                if (NIL != sbhl_marking_vars.sbhl_suspend_new_spaces_during_mappingP()) {
                    {
                        SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        SubLObject _prev_bind_1 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                        SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_mapping_marking_space$.getDynamicValue(thread), thread);
                            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.$sbhl_mapping_gather_marking_space$.getDynamicValue(thread), thread);
                            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(T, thread);
                            funcall(compose_fn, node);
                        } finally {
                            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_2, thread);
                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1, thread);
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    funcall(compose_fn, node);
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Modifier. Applies *sbhl-compose-fn* to NODE.")
    public static SubLObject sbhl_apply_compose_fn(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject compose_fn = sbhl_search_vars.get_sbhl_compose_fn();
        if (NIL != sbhl_marking_vars.sbhl_suspend_new_spaces_during_mappingP()) {
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            final SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_mapping_marking_space$.getDynamicValue(thread), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.$sbhl_mapping_gather_marking_space$.getDynamicValue(thread), thread);
                sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(T, thread);
                funcall(compose_fn, node);
            } finally {
                sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_3, thread);
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        } else {
            funcall(compose_fn, node);
        }
        return NIL;
    }/**
     * Modifier. Applies *sbhl-compose-fn* to NODE.
     */


    /**
     * Modifier. Applies *sbhl-compose-fn* to NODE.
     */
    @LispMethod(comment = "Modifier. Applies *sbhl-compose-fn* to NODE.")
    public static final SubLObject sbhl_apply_compose_fn_if_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject compose_fn = sbhl_search_vars.get_sbhl_compose_fn();
                SubLObject test_fn = sbhl_search_vars.get_sbhl_map_test_fn();
                if (NIL != sbhl_marking_vars.sbhl_suspend_new_spaces_during_mappingP()) {
                    {
                        SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        SubLObject _prev_bind_1 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                        SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_mapping_marking_space$.getDynamicValue(thread), thread);
                            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.$sbhl_mapping_gather_marking_space$.getDynamicValue(thread), thread);
                            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(T, thread);
                            if (NIL != funcall(test_fn, node)) {
                                funcall(compose_fn, node);
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_2, thread);
                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1, thread);
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    if (NIL != funcall(test_fn, node)) {
                        funcall(compose_fn, node);
                    }
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Modifier. Applies *sbhl-compose-fn* to NODE.")
    public static SubLObject sbhl_apply_compose_fn_if(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject compose_fn = sbhl_search_vars.get_sbhl_compose_fn();
        final SubLObject test_fn = sbhl_search_vars.get_sbhl_map_test_fn();
        if (NIL != sbhl_marking_vars.sbhl_suspend_new_spaces_during_mappingP()) {
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            final SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_mapping_marking_space$.getDynamicValue(thread), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.$sbhl_mapping_gather_marking_space$.getDynamicValue(thread), thread);
                sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(T, thread);
                if (NIL != funcall(test_fn, node)) {
                    funcall(compose_fn, node);
                }
            } finally {
                sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_3, thread);
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        } else
            if (NIL != funcall(test_fn, node)) {
                funcall(compose_fn, node);
            }

        return NIL;
    }/**
     * Modifier. Applies *sbhl-compose-fn* to NODE.
     */


    /**
     * Modifier. Applies *sbhl-compose-fn* to NODE. If non-nil, uses *sbhl-combine-fn* to combine this result with *sbhl-result*.
     */
    @LispMethod(comment = "Modifier. Applies *sbhl-compose-fn* to NODE. If non-nil, uses *sbhl-combine-fn* to combine this result with *sbhl-result*.")
    public static final SubLObject sbhl_apply_compose_fn_and_combine_with_result_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject compose_fn = sbhl_search_vars.get_sbhl_compose_fn();
                SubLObject combine_fn = sbhl_search_vars.get_sbhl_combine_fn();
                SubLObject result = NIL;
                if (NIL != sbhl_marking_vars.sbhl_suspend_new_spaces_during_mappingP()) {
                    {
                        SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        SubLObject _prev_bind_1 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                        SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_mapping_marking_space$.getDynamicValue(thread), thread);
                            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.$sbhl_mapping_gather_marking_space$.getDynamicValue(thread), thread);
                            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(T, thread);
                            result = funcall(compose_fn, node);
                        } finally {
                            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_2, thread);
                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1, thread);
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    result = funcall(compose_fn, node);
                }
                if (NIL != result) {
                    sbhl_search_vars.$sbhl_result$.setDynamicValue(funcall(combine_fn, result, sbhl_search_vars.$sbhl_result$.getDynamicValue(thread)), thread);
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Modifier. Applies *sbhl-compose-fn* to NODE. If non-nil, uses *sbhl-combine-fn* to combine this result with *sbhl-result*.")
    public static SubLObject sbhl_apply_compose_fn_and_combine_with_result(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject compose_fn = sbhl_search_vars.get_sbhl_compose_fn();
        final SubLObject combine_fn = sbhl_search_vars.get_sbhl_combine_fn();
        SubLObject result = NIL;
        if (NIL != sbhl_marking_vars.sbhl_suspend_new_spaces_during_mappingP()) {
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            final SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_mapping_marking_space$.getDynamicValue(thread), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.$sbhl_mapping_gather_marking_space$.getDynamicValue(thread), thread);
                sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(T, thread);
                result = funcall(compose_fn, node);
            } finally {
                sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_3, thread);
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        } else {
            result = funcall(compose_fn, node);
        }
        if (NIL != result) {
            sbhl_search_vars.$sbhl_result$.setDynamicValue(funcall(combine_fn, result, sbhl_search_vars.$sbhl_result$.getDynamicValue(thread)), thread);
        }
        return NIL;
    }/**
     * Modifier. Applies *sbhl-compose-fn* to NODE. If non-nil, uses *sbhl-combine-fn* to combine this result with *sbhl-result*.
     */


    /**
     * Modifier. Applies *sbhl-compose-fn* to node. If the result non-nil, sets *sbhl-result* to the result, and sets *sbhl-finished?* to true.
     */
    @LispMethod(comment = "Modifier. Applies *sbhl-compose-fn* to node. If the result non-nil, sets *sbhl-result* to the result, and sets *sbhl-finished?* to true.")
    public static final SubLObject sbhl_gather_first_non_nil_result_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject compose_fn = sbhl_search_vars.get_sbhl_compose_fn();
                SubLObject result = NIL;
                if (NIL != sbhl_marking_vars.sbhl_suspend_new_spaces_during_mappingP()) {
                    {
                        SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        SubLObject _prev_bind_1 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                        SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_mapping_marking_space$.getDynamicValue(thread), thread);
                            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.$sbhl_mapping_gather_marking_space$.getDynamicValue(thread), thread);
                            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(T, thread);
                            result = funcall(compose_fn, node);
                        } finally {
                            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_2, thread);
                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1, thread);
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    result = funcall(compose_fn, node);
                }
                if (NIL != result) {
                    sbhl_search_vars.$sbhl_result$.setDynamicValue(result, thread);
                    sbhl_search_vars.$sbhl_finishedP$.setDynamicValue(T, thread);
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Modifier. Applies *sbhl-compose-fn* to node. If the result non-nil, sets *sbhl-result* to the result, and sets *sbhl-finished?* to true.")
    public static SubLObject sbhl_gather_first_non_nil_result(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject compose_fn = sbhl_search_vars.get_sbhl_compose_fn();
        SubLObject result = NIL;
        if (NIL != sbhl_marking_vars.sbhl_suspend_new_spaces_during_mappingP()) {
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            final SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_mapping_marking_space$.getDynamicValue(thread), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.$sbhl_mapping_gather_marking_space$.getDynamicValue(thread), thread);
                sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(T, thread);
                result = funcall(compose_fn, node);
            } finally {
                sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_3, thread);
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        } else {
            result = funcall(compose_fn, node);
        }
        if (NIL != result) {
            sbhl_search_vars.$sbhl_result$.setDynamicValue(result, thread);
            sbhl_search_vars.$sbhl_finishedP$.setDynamicValue(T, thread);
        }
        return NIL;
    }/**
     * Modifier. Applies *sbhl-compose-fn* to node. If the result non-nil, sets *sbhl-result* to the result, and sets *sbhl-finished?* to true.
     */


    /**
     * Modifier. Applies *sbhl-compose-fn* to node. *sbhl-compose-fn* should return a list of two values: result and done? If the result non-nil, sets *sbhl-result* to the result, and sets *sbhl-finished?* to true. If the result is nil, sets *sbhl-finished?* to the value of done?
     */
    @LispMethod(comment = "Modifier. Applies *sbhl-compose-fn* to node. *sbhl-compose-fn* should return a list of two values: result and done? If the result non-nil, sets *sbhl-result* to the result, and sets *sbhl-finished?* to true. If the result is nil, sets *sbhl-finished?* to the value of done?")
    public static final SubLObject sbhl_gather_first_non_nil_result_with_prune_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject compose_fn = sbhl_search_vars.get_sbhl_compose_fn();
                SubLObject v_return = NIL;
                if (NIL != sbhl_marking_vars.sbhl_suspend_new_spaces_during_mappingP()) {
                    {
                        SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        SubLObject _prev_bind_1 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                        SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_mapping_marking_space$.getDynamicValue(thread), thread);
                            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.$sbhl_mapping_gather_marking_space$.getDynamicValue(thread), thread);
                            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(T, thread);
                            v_return = funcall(compose_fn, node);
                        } finally {
                            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_2, thread);
                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1, thread);
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    v_return = funcall(compose_fn, node);
                }
                {
                    SubLObject datum = v_return;
                    SubLObject current = datum;
                    SubLObject result = NIL;
                    SubLObject doneP = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt31);
                    result = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt31);
                    doneP = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != result) {
                            sbhl_search_vars.$sbhl_result$.setDynamicValue(result, thread);
                            sbhl_search_vars.$sbhl_finishedP$.setDynamicValue(T, thread);
                        } else {
                            if (NIL != doneP) {
                                sbhl_search_vars.sbhl_stop_search_path();
                            } else {
                                sbhl_search_vars.sbhl_continue_search_path();
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt31);
                    }
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Modifier. Applies *sbhl-compose-fn* to node. *sbhl-compose-fn* should return a list of two values: result and done? If the result non-nil, sets *sbhl-result* to the result, and sets *sbhl-finished?* to true. If the result is nil, sets *sbhl-finished?* to the value of done?")
    public static SubLObject sbhl_gather_first_non_nil_result_with_prune(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject compose_fn = sbhl_search_vars.get_sbhl_compose_fn();
        SubLObject v_return = NIL;
        if (NIL != sbhl_marking_vars.sbhl_suspend_new_spaces_during_mappingP()) {
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            final SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_mapping_marking_space$.getDynamicValue(thread), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.$sbhl_mapping_gather_marking_space$.getDynamicValue(thread), thread);
                sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(T, thread);
                v_return = funcall(compose_fn, node);
            } finally {
                sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_3, thread);
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        } else {
            v_return = funcall(compose_fn, node);
        }
        SubLObject current;
        final SubLObject datum = current = v_return;
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        destructuring_bind_must_consp(current, datum, $list31);
        result = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list31);
        doneP = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != result) {
                sbhl_search_vars.$sbhl_result$.setDynamicValue(result, thread);
                sbhl_search_vars.$sbhl_finishedP$.setDynamicValue(T, thread);
            } else
                if (NIL != doneP) {
                    sbhl_search_vars.sbhl_stop_search_path();
                } else {
                    sbhl_search_vars.sbhl_continue_search_path();
                }

        } else {
            cdestructuring_bind_error(datum, $list31);
        }
        return NIL;
    }/**
     * Modifier. Applies *sbhl-compose-fn* to node. *sbhl-compose-fn* should return a list of two values: result and done? If the result non-nil, sets *sbhl-result* to the result, and sets *sbhl-finished?* to true. If the result is nil, sets *sbhl-finished?* to the value of done?
     */


    /**
     * Modifier. If NODE has no accessible nodes, sets *sbhl-result* to NODE, and halts search. otherwise, enqueues NODE.
     */
    @LispMethod(comment = "Modifier. If NODE has no accessible nodes, sets *sbhl-result* to NODE, and halts search. otherwise, enqueues NODE.")
    public static final SubLObject sbhl_gather_first_dead_end_node_and_enqueue_others_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != sbhl_link_methods.no_accessible_sbhl_nodes_p(node)) {
                sbhl_search_vars.$sbhl_result$.setDynamicValue(node, thread);
                sbhl_search_vars.$sbhl_finishedP$.setDynamicValue(T, thread);
            } else {
                queues.enqueue(node, sbhl_search_vars.$sbhl_current_leaf_queue$.getDynamicValue(thread));
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Modifier. If NODE has no accessible nodes, sets *sbhl-result* to NODE, and halts search. otherwise, enqueues NODE.")
    public static SubLObject sbhl_gather_first_dead_end_node_and_enqueue_others(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sbhl_link_methods.no_accessible_sbhl_nodes_p(node)) {
            sbhl_search_vars.$sbhl_result$.setDynamicValue(node, thread);
            sbhl_search_vars.$sbhl_finishedP$.setDynamicValue(T, thread);
        } else {
            queues.enqueue(node, sbhl_search_vars.$sbhl_current_leaf_queue$.getDynamicValue(thread));
        }
        return NIL;
    }/**
     * Modifier. If NODE has no accessible nodes, sets *sbhl-result* to NODE, and halts search. otherwise, enqueues NODE.
     */


    /**
     * Modifier. Sets *sbhl-result* to NODE. Halts search.
     */
    @LispMethod(comment = "Modifier. Sets *sbhl-result* to NODE. Halts search.")
    public static final SubLObject sbhl_gather_first_node_alt(SubLObject node) {
        sbhl_search_vars.$sbhl_result$.setDynamicValue(node);
        sbhl_search_vars.$sbhl_finishedP$.setDynamicValue(T);
        return NIL;
    }

    @LispMethod(comment = "Modifier. Sets *sbhl-result* to NODE. Halts search.")
    public static SubLObject sbhl_gather_first_node(final SubLObject node) {
        sbhl_search_vars.$sbhl_result$.setDynamicValue(node);
        sbhl_search_vars.$sbhl_finishedP$.setDynamicValue(T);
        return NIL;
    }/**
     * Modifier. Sets *sbhl-result* to NODE. Halts search.
     */


    /**
     * Modifier. Sets *sbhl-result* to NODE. Halts search.
     */
    @LispMethod(comment = "Modifier. Sets *sbhl-result* to NODE. Halts search.")
    public static final SubLObject sbhl_gather_first_target_unmarked_node_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node, sbhl_marking_vars.$sbhl_target_gather_space$.getDynamicValue(thread))) {
                sbhl_search_vars.$sbhl_result$.setDynamicValue(node, thread);
                sbhl_search_vars.$sbhl_finishedP$.setDynamicValue(T, thread);
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Modifier. Sets *sbhl-result* to NODE. Halts search.")
    public static SubLObject sbhl_gather_first_target_unmarked_node(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node, sbhl_marking_vars.$sbhl_target_gather_space$.getDynamicValue(thread))) {
            sbhl_search_vars.$sbhl_result$.setDynamicValue(node, thread);
            sbhl_search_vars.$sbhl_finishedP$.setDynamicValue(T, thread);
        }
        return NIL;
    }/**
     * Modifier. Sets *sbhl-result* to NODE. Halts search.
     */


    /**
     * Accessor. @return booleanp; whether the current search has multiple goal nodes.
     */
    @LispMethod(comment = "Accessor. @return booleanp; whether the current search has multiple goal nodes.")
    public static final SubLObject sbhl_search_has_multiple_goals_p_alt() {
        if (NIL != sbhl_search_vars.get_sbhl_goal_nodes()) {
            return T;
        } else {
            return NIL;
        }
    }

    @LispMethod(comment = "Accessor. @return booleanp; whether the current search has multiple goal nodes.")
    public static SubLObject sbhl_search_has_multiple_goals_p() {
        if (NIL != sbhl_search_vars.get_sbhl_goal_nodes()) {
            return T;
        }
        return NIL;
    }/**
     * Accessor. @return booleanp; whether the current search has multiple goal nodes.
     */


    /**
     * Modifier. Sets *sbhl-result* to true, and sets *sbhl-finished?* to indicate that the goal was found.
     */
    @LispMethod(comment = "Modifier. Sets *sbhl-result* to true, and sets *sbhl-finished?* to indicate that the goal was found.")
    public static final SubLObject set_sbhl_boolean_goal_conditions_alt() {
        sbhl_search_vars.sbhl_finished_with_goal();
        if (NIL != sbhl_search_vars.sbhl_justification_search_p()) {
            sbhl_search_vars.sbhl_toggle_unwind_function_on();
        } else {
            sbhl_search_vars.$sbhl_result$.setDynamicValue(T);
        }
        return NIL;
    }

    @LispMethod(comment = "Modifier. Sets *sbhl-result* to true, and sets *sbhl-finished?* to indicate that the goal was found.")
    public static SubLObject set_sbhl_boolean_goal_conditions() {
        sbhl_search_vars.sbhl_finished_with_goal();
        if (NIL != sbhl_search_vars.sbhl_justification_search_p()) {
            sbhl_search_vars.sbhl_toggle_unwind_function_on();
        } else {
            sbhl_search_vars.$sbhl_result$.setDynamicValue(T);
        }
        return NIL;
    }/**
     * Modifier. Sets *sbhl-result* to true, and sets *sbhl-finished?* to indicate that the goal was found.
     */


    /**
     * Modifier. Determines if NODE is marked with a terminating mark in the *sbhl-goal-space*. If so, calls @see set-sbhl-boolean-goal-conditions.
     */
    @LispMethod(comment = "Modifier. Determines if NODE is marked with a terminating mark in the *sbhl-goal-space*. If so, calls @see set-sbhl-boolean-goal-conditions.")
    public static final SubLObject sbhl_node_marked_as_goal_node_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject goal_space = sbhl_marking_vars.get_sbhl_goal_space();
                if (NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(node, goal_space)) {
                    if ((NIL != sbhl_search_vars.sbhl_justification_search_p()) && (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_module_premarks_gather_nodes_p())) {
                        sbhl_marking_methods.sbhl_gather_premarked_justifications(node);
                        sbhl_search_vars.$sbhl_result$.setDynamicValue(nreverse(sbhl_search_vars.$sbhl_result$.getDynamicValue(thread)), thread);
                    }
                    com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.set_sbhl_boolean_goal_conditions();
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Modifier. Determines if NODE is marked with a terminating mark in the *sbhl-goal-space*. If so, calls @see set-sbhl-boolean-goal-conditions.")
    public static SubLObject sbhl_node_marked_as_goal_node(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject goal_space = sbhl_marking_vars.get_sbhl_goal_space();
        if (NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(node, goal_space)) {
            if ((NIL != sbhl_search_vars.sbhl_justification_search_p()) && (NIL != sbhl_module_premarks_gather_nodes_p())) {
                sbhl_marking_methods.sbhl_gather_premarked_justifications(node);
                sbhl_search_vars.$sbhl_result$.setDynamicValue(nreverse(sbhl_search_vars.$sbhl_result$.getDynamicValue(thread)), thread);
            }
            set_sbhl_boolean_goal_conditions();
        }
        return NIL;
    }/**
     * Modifier. Determines if NODE is marked with a terminating mark in the *sbhl-goal-space*. If so, calls @see set-sbhl-boolean-goal-conditions.
     */


    /**
     * Modifier. Determines if NODE is the current *sbhl-goal-node*. If so, calls @see set-sbhl-boolean-goal-conditions.
     */
    @LispMethod(comment = "Modifier. Determines if NODE is the current *sbhl-goal-node*. If so, calls @see set-sbhl-boolean-goal-conditions.")
    public static final SubLObject sbhl_node_is_goal_node_alt(SubLObject node) {
        if (NIL != sbhl_search_vars.sbhl_goal_node_p(node)) {
            com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.set_sbhl_boolean_goal_conditions();
        }
        return NIL;
    }

    @LispMethod(comment = "Modifier. Determines if NODE is the current *sbhl-goal-node*. If so, calls @see set-sbhl-boolean-goal-conditions.")
    public static SubLObject sbhl_node_is_goal_node(final SubLObject node) {
        if (NIL != sbhl_search_vars.sbhl_goal_node_p(node)) {
            set_sbhl_boolean_goal_conditions();
        }
        return NIL;
    }/**
     * Modifier. Determines if NODE is the current *sbhl-goal-node*. If so, calls @see set-sbhl-boolean-goal-conditions.
     */


    /**
     * Modifier. Determines if NODE is a member of *sbhl-goal-nodes*. If so, calls @see set-sbhl-boolean-goal-conditions.
     */
    @LispMethod(comment = "Modifier. Determines if NODE is a member of *sbhl-goal-nodes*. If so, calls @see set-sbhl-boolean-goal-conditions.")
    public static final SubLObject sbhl_node_is_a_goal_node_alt(SubLObject node) {
        if (NIL != sbhl_search_vars.sbhl_node_isa_goal_node_p(node)) {
            com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.set_sbhl_boolean_goal_conditions();
        }
        return NIL;
    }

    @LispMethod(comment = "Modifier. Determines if NODE is a member of *sbhl-goal-nodes*. If so, calls @see set-sbhl-boolean-goal-conditions.")
    public static SubLObject sbhl_node_is_a_goal_node(final SubLObject node) {
        if (NIL != sbhl_search_vars.sbhl_node_isa_goal_node_p(node)) {
            set_sbhl_boolean_goal_conditions();
        }
        return NIL;
    }/**
     * Modifier. Determines if NODE is a member of *sbhl-goal-nodes*. If so, calls @see set-sbhl-boolean-goal-conditions.
     */


    /**
     * Accessor. @return booleanp; whether current state of the search indicates that search should terminate because it has met a specified termination condition.
     */
    @LispMethod(comment = "Accessor. @return booleanp; whether current state of the search indicates that search should terminate because it has met a specified termination condition.")
    public static final SubLObject sbhl_reached_cutoff_p_alt() {
        return NIL;
    }

    @LispMethod(comment = "Accessor. @return booleanp; whether current state of the search indicates that search should terminate because it has met a specified termination condition.")
    public static SubLObject sbhl_reached_cutoff_p() {
        return NIL;
    }/**
     * Accessor. @return booleanp; whether current state of the search indicates that search should terminate because it has met a specified termination condition.
     */


    /**
     * Modifier. Checks cutoff conditions and terminates search if cutoff is reached.
     */
    @LispMethod(comment = "Modifier. Checks cutoff conditions and terminates search if cutoff is reached.")
    public static final SubLObject sbhl_check_cutoff_alt(SubLObject node) {
        return NIL;
    }

    @LispMethod(comment = "Modifier. Checks cutoff conditions and terminates search if cutoff is reached.")
    public static SubLObject sbhl_check_cutoff(final SubLObject node) {
        return NIL;
    }/**
     * Modifier. Checks cutoff conditions and terminates search if cutoff is reached.
     */


    /**
     * Modifier: applies FN to NODE. Used at each step of search.
     */
    @LispMethod(comment = "Modifier: applies FN to NODE. Used at each step of search.")
    public static final SubLObject apply_sbhl_consider_node_fn_alt(SubLObject fn, SubLObject node) {
        {
            SubLObject add_node_test = sbhl_search_vars.get_sbhl_search_add_node_test();
            SubLObject apply_fnP = T;
            if (NIL != add_node_test) {
                apply_fnP = com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.apply_sbhl_add_node_test(add_node_test, node);
            }
            if ((NIL != apply_fnP) && (NIL != fn)) {
                {
                    SubLObject pcase_var = fn;
                    if (pcase_var.eql(SBHL_PUSH_ONTO_RESULT)) {
                        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_push_onto_result(node);
                    } else {
                        if (pcase_var.eql(SBHL_PUSH_ONTO_RESULT_WITH_PRUNE)) {
                            com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_push_onto_result_with_prune(node);
                        } else {
                            if (pcase_var.eql(SBHL_NODE_IS_GOAL_NODE)) {
                                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_node_is_goal_node(node);
                            } else {
                                if (pcase_var.eql(SBHL_NODE_MARKED_AS_GOAL_NODE)) {
                                    com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_node_marked_as_goal_node(node);
                                } else {
                                    if (pcase_var.eql(SBHL_GATHER_FIRST_NON_NIL_RESULT)) {
                                        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_gather_first_non_nil_result(node);
                                    } else {
                                        if (pcase_var.eql(SBHL_GATHER_FIRST_NON_NIL_RESULT_WITH_PRUNE)) {
                                            com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_gather_first_non_nil_result_with_prune(node);
                                        } else {
                                            if (pcase_var.eql(SBHL_APPLY_COMPOSE_FN)) {
                                                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_apply_compose_fn(node);
                                            } else {
                                                if (pcase_var.eql(SBHL_APPLY_COMPOSE_FN_AND_COMBINE_WITH_RESULT)) {
                                                    com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_apply_compose_fn_and_combine_with_result(node);
                                                } else {
                                                    if (pcase_var.eql(SBHL_GATHER_DEAD_END_NODES)) {
                                                        sbhl_search_methods.sbhl_gather_dead_end_nodes(node);
                                                    } else {
                                                        if (pcase_var.eql(SBHL_GATHER_FIRST_DEAD_END_NODE_AND_ENQUEUE_OTHERS)) {
                                                            com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_gather_first_dead_end_node_and_enqueue_others(node);
                                                        } else {
                                                            funcall(fn, node);
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
        return NIL;
    }

    @LispMethod(comment = "Modifier: applies FN to NODE. Used at each step of search.")
    public static SubLObject apply_sbhl_consider_node_fn(final SubLObject fn, final SubLObject node) {
        final SubLObject add_node_test = sbhl_search_vars.get_sbhl_search_add_node_test();
        SubLObject apply_fnP = T;
        if (NIL != add_node_test) {
            apply_fnP = apply_sbhl_add_node_test(add_node_test, node);
        }
        if ((NIL != apply_fnP) && (NIL != fn)) {
            if (fn.eql(SBHL_PUSH_ONTO_RESULT)) {
                sbhl_push_onto_result(node);
            } else
                if (fn.eql(SBHL_PUSH_ONTO_RESULT_WITH_PRUNE)) {
                    sbhl_push_onto_result_with_prune(node);
                } else
                    if (fn.eql(SBHL_NODE_IS_GOAL_NODE)) {
                        sbhl_node_is_goal_node(node);
                    } else
                        if (fn.eql(SBHL_NODE_MARKED_AS_GOAL_NODE)) {
                            sbhl_node_marked_as_goal_node(node);
                        } else
                            if (fn.eql(SBHL_GATHER_FIRST_NON_NIL_RESULT)) {
                                sbhl_gather_first_non_nil_result(node);
                            } else
                                if (fn.eql(SBHL_GATHER_FIRST_NON_NIL_RESULT_WITH_PRUNE)) {
                                    sbhl_gather_first_non_nil_result_with_prune(node);
                                } else
                                    if (fn.eql(SBHL_APPLY_COMPOSE_FN)) {
                                        sbhl_apply_compose_fn(node);
                                    } else
                                        if (fn.eql(SBHL_APPLY_COMPOSE_FN_AND_COMBINE_WITH_RESULT)) {
                                            sbhl_apply_compose_fn_and_combine_with_result(node);
                                        } else
                                            if (fn.eql(SBHL_GATHER_DEAD_END_NODES)) {
                                                sbhl_search_methods.sbhl_gather_dead_end_nodes(node);
                                            } else
                                                if (fn.eql(SBHL_GATHER_FIRST_DEAD_END_NODE_AND_ENQUEUE_OTHERS)) {
                                                    sbhl_gather_first_dead_end_node_and_enqueue_others(node);
                                                } else {
                                                    funcall(fn, node);
                                                }









        }
        return NIL;
    }/**
     * Modifier: applies FN to NODE. Used at each step of search.
     */


    /**
     * Modifier: applies FN to NODE. Used at each step of some unmarking searches.
     */
    @LispMethod(comment = "Modifier: applies FN to NODE. Used at each step of some unmarking searches.")
    public static final SubLObject apply_sbhl_consider_unmarked_node_fn_alt(SubLObject fn, SubLObject node) {
        {
            SubLObject add_unmarked_node_test = sbhl_search_vars.get_sbhl_search_add_unmarked_node_test();
            SubLObject apply_fnP = T;
            if (NIL != add_unmarked_node_test) {
                apply_fnP = com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.apply_sbhl_add_unmarked_node_test(add_unmarked_node_test);
            }
            if (NIL != apply_fnP) {
                {
                    SubLObject pcase_var = fn;
                    if (pcase_var.eql(SBHL_PUSH_ONTO_RESULT)) {
                        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_push_onto_result(node);
                    } else {
                        funcall(fn, node);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Modifier: applies FN to NODE. Used at each step of some unmarking searches.")
    public static SubLObject apply_sbhl_consider_unmarked_node_fn(final SubLObject fn, final SubLObject node) {
        final SubLObject add_unmarked_node_test = sbhl_search_vars.get_sbhl_search_add_unmarked_node_test();
        SubLObject apply_fnP = T;
        if (NIL != add_unmarked_node_test) {
            apply_fnP = apply_sbhl_add_unmarked_node_test(add_unmarked_node_test);
        }
        if (NIL != apply_fnP) {
            if (fn.eql(SBHL_PUSH_ONTO_RESULT)) {
                sbhl_push_onto_result(node);
            } else {
                funcall(fn, node);
            }
        }
        return NIL;
    }/**
     * Modifier: applies FN to NODE. Used at each step of some unmarking searches.
     */


    /**
     * Modifier. Called during search on each NODE. Determines behavior with @see *sbhl-consider-node-fn*
     */
    @LispMethod(comment = "Modifier. Called during search on each NODE. Determines behavior with @see *sbhl-consider-node-fn*")
    public static final SubLObject sbhl_consider_node_alt(SubLObject node) {
        if (NIL != sbhl_search_vars.sbhl_unmarking_search_p()) {
            com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_consider_unmarked_node(node);
        } else {
            {
                SubLObject consider_node_fn = sbhl_search_vars.get_sbhl_consider_node_fn();
                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.apply_sbhl_consider_node_fn(consider_node_fn, node);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Modifier. Called during search on each NODE. Determines behavior with @see *sbhl-consider-node-fn*")
    public static SubLObject sbhl_consider_node(final SubLObject node) {
        if (NIL != sbhl_search_vars.sbhl_unmarking_search_p()) {
            sbhl_consider_unmarked_node(node);
        } else {
            final SubLObject consider_node_fn = sbhl_search_vars.get_sbhl_consider_node_fn();
            apply_sbhl_consider_node_fn(consider_node_fn, node);
        }
        return NIL;
    }/**
     * Modifier. Called during search on each NODE. Determines behavior with @see *sbhl-consider-node-fn*
     */


    /**
     * Modifier. Called during search to check any NODE, without passing through an add node test
     */
    @LispMethod(comment = "Modifier. Called during search to check any NODE, without passing through an add node test")
    public static final SubLObject sbhl_consider_any_node_alt(SubLObject node) {
        {
            SubLObject fn = sbhl_search_vars.get_sbhl_consider_node_fn();
            SubLObject pcase_var = fn;
            if (pcase_var.eql(SBHL_NODE_MARKED_AS_GOAL_NODE)) {
                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_node_marked_as_goal_node(node);
            } else {
                funcall(fn, node);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Modifier. Called during search to check any NODE, without passing through an add node test")
    public static SubLObject sbhl_consider_any_node(final SubLObject node) {
        final SubLObject pcase_var;
        final SubLObject fn = pcase_var = sbhl_search_vars.get_sbhl_consider_node_fn();
        if (pcase_var.eql(SBHL_NODE_MARKED_AS_GOAL_NODE)) {
            sbhl_node_marked_as_goal_node(node);
        } else {
            funcall(fn, node);
        }
        return NIL;
    }/**
     * Modifier. Called during search to check any NODE, without passing through an add node test
     */


    /**
     * Modifier. Called upon each NODE during unmarking searches which gather node.
     */
    @LispMethod(comment = "Modifier. Called upon each NODE during unmarking searches which gather node.")
    public static final SubLObject sbhl_consider_unmarked_node_alt(SubLObject node) {
        {
            SubLObject consider_node_fn = sbhl_search_vars.get_sbhl_consider_node_fn();
            com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.apply_sbhl_consider_unmarked_node_fn(consider_node_fn, node);
        }
        return NIL;
    }

    @LispMethod(comment = "Modifier. Called upon each NODE during unmarking searches which gather node.")
    public static SubLObject sbhl_consider_unmarked_node(final SubLObject node) {
        final SubLObject consider_node_fn = sbhl_search_vars.get_sbhl_consider_node_fn();
        apply_sbhl_consider_unmarked_node_fn(consider_node_fn, node);
        return NIL;
    }/**
     * Modifier. Called upon each NODE during unmarking searches which gather node.
     */


    /**
     * Modifier. The recursive search workhouse. Stops recurring when NODE's marking indicates path termination @see sbhl-search-path-termination-p. Dynamically rebinds @see *sbhl-search-parent-marking*, when it gathers new nodes during search, with either a search mapping function (@see apply-sbhl-mapping-function), or recurring among link-nodes (@see do-accessible-sbhl-link-nodes).
     */
    @LispMethod(comment = "Modifier. The recursive search workhouse. Stops recurring when NODE\'s marking indicates path termination @see sbhl-search-path-termination-p. Dynamically rebinds @see *sbhl-search-parent-marking*, when it gathers new nodes during search, with either a search mapping function (@see apply-sbhl-mapping-function), or recurring among link-nodes (@see do-accessible-sbhl-link-nodes).")
    public static final SubLObject sbhl_mark_and_sweep_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node, UNPROVIDED)) {
                sbhl_marking_utilities.sbhl_mark_node_marked(node, UNPROVIDED);
                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.apply_sbhl_mapping_function(node);
                if (NIL == sbhl_search_vars.sbhl_stop_search_path_p()) {
                    {
                        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(get_sbhl_module(UNPROVIDED));
                        SubLObject rest = NIL;
                        for (rest = accessible_modules; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest)); rest = rest.rest()) {
                            {
                                SubLObject module_var = rest.first();
                                {
                                    SubLObject _prev_bind_0 = $sbhl_module$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        $sbhl_module$.bind(module_var, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                        {
                                            SubLObject node_15 = function_terms.naut_to_nart(node);
                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node_15)) {
                                                {
                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_15, get_sbhl_module(UNPROVIDED));
                                                    if (NIL != d_link) {
                                                        {
                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                {
                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                    while (!((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                        thread.resetMultipleValues();
                                                                        {
                                                                            SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_16 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                        {
                                                                                            SubLObject iteration_state_17 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                            while (!((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_17)))) {
                                                                                                thread.resetMultipleValues();
                                                                                                {
                                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_17);
                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                    thread.resetMultipleValues();
                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_18 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                            try {
                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                {
                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                    SubLObject rest_19 = NIL;
                                                                                                                    for (rest_19 = new_list; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest_19)); rest_19 = rest_19.rest()) {
                                                                                                                        {
                                                                                                                            SubLObject link_node = rest_19.first();
                                                                                                                            if ((NIL != kb_access_metering.$kb_access_metering_enabledP$.getGlobalValue()) && (NIL != kb_access_metering.note_kb_access_sbhlP())) {
                                                                                                                                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.note_kb_access_sbhl_link(node, link_node);
                                                                                                                            }
                                                                                                                            com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_mark_and_sweep(link_node);
                                                                                                                            if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                                                                                                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_apply_unwind_function(list(node, link_node));
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            } finally {
                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_18, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    iteration_state_17 = dictionary_contents.do_dictionary_contents_next(iteration_state_17);
                                                                                                }
                                                                                            } 
                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_17);
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_16, thread);
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
                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt42$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                }
                                            } else {
                                                if (NIL != obsolete.cnat_p(node_15, UNPROVIDED)) {
                                                    {
                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED));
                                                        SubLObject rest_20 = NIL;
                                                        for (rest_20 = new_list; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest_20)); rest_20 = rest_20.rest()) {
                                                            {
                                                                SubLObject generating_fn = rest_20.first();
                                                                {
                                                                    SubLObject _prev_bind_0_21 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        {
                                                                            SubLObject link_nodes = funcall(generating_fn, node_15);
                                                                            SubLObject new_list_22 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                            SubLObject rest_23 = NIL;
                                                                            for (rest_23 = new_list_22; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest_23)); rest_23 = rest_23.rest()) {
                                                                                {
                                                                                    SubLObject link_node = rest_23.first();
                                                                                    if ((NIL != kb_access_metering.$kb_access_metering_enabledP$.getGlobalValue()) && (NIL != kb_access_metering.note_kb_access_sbhlP())) {
                                                                                        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.note_kb_access_sbhl_link(node, link_node);
                                                                                    }
                                                                                    com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_mark_and_sweep(link_node);
                                                                                    if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                                                        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_apply_unwind_function(list(node, link_node));
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_21, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1, thread);
                                        $sbhl_module$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Modifier. The recursive search workhouse. Stops recurring when NODE's marking indicates path termination @see sbhl-search-path-termination-p. Dynamically rebinds @see *sbhl-search-parent-marking*, when it gathers new nodes during search, with either a search mapping function (@see apply-sbhl-mapping-function), or recurring among link-nodes (@see do-accessible-sbhl-link-nodes).
     */
    @LispMethod(comment = "Modifier. The recursive search workhouse. Stops recurring when NODE\'s marking indicates path termination @see sbhl-search-path-termination-p. Dynamically rebinds @see *sbhl-search-parent-marking*, when it gathers new nodes during search, with either a search mapping function (@see apply-sbhl-mapping-function), or recurring among link-nodes (@see do-accessible-sbhl-link-nodes).")
    public static SubLObject sbhl_mark_and_sweep(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node, UNPROVIDED)) {
            sbhl_marking_utilities.sbhl_mark_node_marked(node, UNPROVIDED);
            apply_sbhl_mapping_function(node);
            if (NIL == sbhl_search_vars.sbhl_stop_search_path_p()) {
                final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                SubLObject rest;
                SubLObject module_var;
                SubLObject _prev_bind_0;
                SubLObject _prev_bind_2;
                SubLObject node_$13;
                SubLObject d_link;
                SubLObject mt_links;
                SubLObject iteration_state;
                SubLObject mt;
                SubLObject tv_links;
                SubLObject _prev_bind_0_$14;
                SubLObject iteration_state_$15;
                SubLObject tv;
                SubLObject link_nodes;
                SubLObject _prev_bind_0_$15;
                SubLObject sol;
                SubLObject set_contents_var;
                SubLObject basis_object;
                SubLObject state;
                SubLObject link_node;
                SubLObject csome_list_var;
                SubLObject link_node2;
                SubLObject new_list;
                SubLObject rest_$17;
                SubLObject generating_fn;
                SubLObject _prev_bind_0_$16;
                SubLObject sol2;
                SubLObject link_nodes2;
                SubLObject set_contents_var2;
                SubLObject basis_object2;
                SubLObject state2;
                SubLObject link_node3;
                SubLObject csome_list_var2;
                SubLObject link_node4;
                for (rest = NIL, rest = accessible_modules; (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != rest); rest = rest.rest()) {
                    module_var = rest.first();
                    _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    _prev_bind_2 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    try {
                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                        node_$13 = function_terms.naut_to_nart(node);
                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node_$13)) {
                            d_link = sbhl_graphs.get_sbhl_graph_link(node_$13, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                            if (NIL != d_link) {
                                mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                if (NIL != mt_links) {
                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                        thread.resetMultipleValues();
                                        mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                        tv_links = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                            _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                            try {
                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                for (iteration_state_$15 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$15)); iteration_state_$15 = dictionary_contents.do_dictionary_contents_next(iteration_state_$15)) {
                                                    thread.resetMultipleValues();
                                                    tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$15);
                                                    link_nodes = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                        _prev_bind_0_$15 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                            sol = link_nodes;
                                                            if (NIL != set.set_p(sol)) {
                                                                set_contents_var = set.do_set_internal(sol);
                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                    link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                    if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                                        if ((NIL != kb_access_metering.$kb_access_metering_enabledP$.getGlobalValue()) && (NIL != kb_access_metering.note_kb_access_sbhlP())) {
                                                                            note_kb_access_sbhl_link(node, link_node);
                                                                        }
                                                                        sbhl_mark_and_sweep(link_node);
                                                                        if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                                            sbhl_apply_unwind_function(list(node, link_node));
                                                                        }
                                                                    }
                                                                }
                                                            } else
                                                                if (sol.isList()) {
                                                                    if (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                                                                        csome_list_var = sol;
                                                                        link_node2 = NIL;
                                                                        link_node2 = csome_list_var.first();
                                                                        while ((NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var)) {
                                                                            if ((NIL != kb_access_metering.$kb_access_metering_enabledP$.getGlobalValue()) && (NIL != kb_access_metering.note_kb_access_sbhlP())) {
                                                                                note_kb_access_sbhl_link(node, link_node2);
                                                                            }
                                                                            sbhl_mark_and_sweep(link_node2);
                                                                            if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                                                sbhl_apply_unwind_function(list(node, link_node2));
                                                                            }
                                                                            csome_list_var = csome_list_var.rest();
                                                                            link_node2 = csome_list_var.first();
                                                                        } 
                                                                    }
                                                                } else {
                                                                    Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                }

                                                        } finally {
                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$15, thread);
                                                        }
                                                    }
                                                }
                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$15);
                                            } finally {
                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$14, thread);
                                            }
                                        }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                }
                            } else {
                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str43$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } else
                            if (NIL != obsolete.cnat_p(node_$13, UNPROVIDED)) {
                                new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                for (rest_$17 = NIL, rest_$17 = new_list; (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != rest_$17); rest_$17 = rest_$17.rest()) {
                                    generating_fn = rest_$17.first();
                                    _prev_bind_0_$16 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                    try {
                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                        link_nodes2 = sol2 = funcall(generating_fn, node_$13);
                                        if (NIL != set.set_p(sol2)) {
                                            set_contents_var2 = set.do_set_internal(sol2);
                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                if (NIL != set_contents.do_set_contents_element_validP(state2, link_node3)) {
                                                    if ((NIL != kb_access_metering.$kb_access_metering_enabledP$.getGlobalValue()) && (NIL != kb_access_metering.note_kb_access_sbhlP())) {
                                                        note_kb_access_sbhl_link(node, link_node3);
                                                    }
                                                    sbhl_mark_and_sweep(link_node3);
                                                    if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                        sbhl_apply_unwind_function(list(node, link_node3));
                                                    }
                                                }
                                            }
                                        } else
                                            if (sol2.isList()) {
                                                if (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                                                    csome_list_var2 = sol2;
                                                    link_node4 = NIL;
                                                    link_node4 = csome_list_var2.first();
                                                    while ((NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var2)) {
                                                        if ((NIL != kb_access_metering.$kb_access_metering_enabledP$.getGlobalValue()) && (NIL != kb_access_metering.note_kb_access_sbhlP())) {
                                                            note_kb_access_sbhl_link(node, link_node4);
                                                        }
                                                        sbhl_mark_and_sweep(link_node4);
                                                        if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                            sbhl_apply_unwind_function(list(node, link_node4));
                                                        }
                                                        csome_list_var2 = csome_list_var2.rest();
                                                        link_node4 = csome_list_var2.first();
                                                    } 
                                                }
                                            } else {
                                                Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                            }

                                    } finally {
                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$16, thread);
                                    }
                                }
                            }

                    } finally {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2, thread);
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Modifier. The recursive search workhouse, for searches on marked nodes. Stops recurring when NODE's marking does not indicate path termination @see sbhl-search-path-termination-p. Dynamically rebinds @see *sbhl-search-parent-marking*, when it gathers new nodes during search, with either a search mapping function (@see apply-sbhl-mapping-function), or recurring among link-nodes (@see do-accessible-sbhl-link-nodes).
     */
    @LispMethod(comment = "Modifier. The recursive search workhouse, for searches on marked nodes. Stops recurring when NODE\'s marking does not indicate path termination @see sbhl-search-path-termination-p. Dynamically rebinds @see *sbhl-search-parent-marking*, when it gathers new nodes during search, with either a search mapping function (@see apply-sbhl-mapping-function), or recurring among link-nodes (@see do-accessible-sbhl-link-nodes).")
    public static final SubLObject sbhl_unmark_and_sweep_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(node, UNPROVIDED)) {
                sbhl_marking_utilities.sbhl_mark_node_unmarked(node, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_parent_marking$.bind(sbhl_search_vars.$sbhl_search_parent_marking$.getDynamicValue(thread), thread);
                        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.apply_sbhl_mapping_function(node);
                    } finally {
                        sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL == sbhl_search_vars.sbhl_stop_search_path_p()) {
                    {
                        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(get_sbhl_module(UNPROVIDED));
                        SubLObject rest = NIL;
                        for (rest = accessible_modules; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest)); rest = rest.rest()) {
                            {
                                SubLObject module_var = rest.first();
                                {
                                    SubLObject _prev_bind_0 = $sbhl_module$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        $sbhl_module$.bind(module_var, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                        {
                                            SubLObject node_24 = function_terms.naut_to_nart(node);
                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node_24)) {
                                                {
                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_24, get_sbhl_module(UNPROVIDED));
                                                    if (NIL != d_link) {
                                                        {
                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                {
                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                    while (!((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                        thread.resetMultipleValues();
                                                                        {
                                                                            SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_25 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                        {
                                                                                            SubLObject iteration_state_26 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                            while (!((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_26)))) {
                                                                                                thread.resetMultipleValues();
                                                                                                {
                                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_26);
                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                    thread.resetMultipleValues();
                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_27 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                            try {
                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                {
                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                    SubLObject rest_28 = NIL;
                                                                                                                    for (rest_28 = new_list; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest_28)); rest_28 = rest_28.rest()) {
                                                                                                                        {
                                                                                                                            SubLObject link_node = rest_28.first();
                                                                                                                            if ((NIL != kb_access_metering.$kb_access_metering_enabledP$.getGlobalValue()) && (NIL != kb_access_metering.note_kb_access_sbhlP())) {
                                                                                                                                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.note_kb_access_sbhl_link(node, link_node);
                                                                                                                            }
                                                                                                                            {
                                                                                                                                SubLObject _prev_bind_0_29 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                                                                                try {
                                                                                                                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(sbhl_search_vars.$sbhl_search_parent_marking$.getDynamicValue(thread), thread);
                                                                                                                                    com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_unmark_and_sweep(link_node);
                                                                                                                                } finally {
                                                                                                                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_0_29, thread);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                                                                                                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_apply_unwind_function(list(node, link_node));
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            } finally {
                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_27, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    iteration_state_26 = dictionary_contents.do_dictionary_contents_next(iteration_state_26);
                                                                                                }
                                                                                            } 
                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_26);
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_25, thread);
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
                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt42$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                }
                                            } else {
                                                if (NIL != obsolete.cnat_p(node_24, UNPROVIDED)) {
                                                    {
                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED));
                                                        SubLObject rest_30 = NIL;
                                                        for (rest_30 = new_list; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest_30)); rest_30 = rest_30.rest()) {
                                                            {
                                                                SubLObject generating_fn = rest_30.first();
                                                                {
                                                                    SubLObject _prev_bind_0_31 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        {
                                                                            SubLObject link_nodes = funcall(generating_fn, node_24);
                                                                            SubLObject new_list_32 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                            SubLObject rest_33 = NIL;
                                                                            for (rest_33 = new_list_32; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest_33)); rest_33 = rest_33.rest()) {
                                                                                {
                                                                                    SubLObject link_node = rest_33.first();
                                                                                    if ((NIL != kb_access_metering.$kb_access_metering_enabledP$.getGlobalValue()) && (NIL != kb_access_metering.note_kb_access_sbhlP())) {
                                                                                        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.note_kb_access_sbhl_link(node, link_node);
                                                                                    }
                                                                                    {
                                                                                        SubLObject _prev_bind_0_34 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_search_vars.$sbhl_search_parent_marking$.bind(sbhl_search_vars.$sbhl_search_parent_marking$.getDynamicValue(thread), thread);
                                                                                            com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_unmark_and_sweep(link_node);
                                                                                        } finally {
                                                                                            sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_0_34, thread);
                                                                                        }
                                                                                    }
                                                                                    if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                                                        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_apply_unwind_function(list(node, link_node));
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_31, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1, thread);
                                        $sbhl_module$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Modifier. The recursive search workhouse, for searches on marked nodes. Stops recurring when NODE's marking does not indicate path termination @see sbhl-search-path-termination-p. Dynamically rebinds @see *sbhl-search-parent-marking*, when it gathers new nodes during search, with either a search mapping function (@see apply-sbhl-mapping-function), or recurring among link-nodes (@see do-accessible-sbhl-link-nodes).
     */
    @LispMethod(comment = "Modifier. The recursive search workhouse, for searches on marked nodes. Stops recurring when NODE\'s marking does not indicate path termination @see sbhl-search-path-termination-p. Dynamically rebinds @see *sbhl-search-parent-marking*, when it gathers new nodes during search, with either a search mapping function (@see apply-sbhl-mapping-function), or recurring among link-nodes (@see do-accessible-sbhl-link-nodes).")
    public static SubLObject sbhl_unmark_and_sweep(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(node, UNPROVIDED)) {
            sbhl_marking_utilities.sbhl_mark_node_unmarked(node, UNPROVIDED);
            final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
            try {
                sbhl_search_vars.$sbhl_search_parent_marking$.bind(sbhl_search_vars.$sbhl_search_parent_marking$.getDynamicValue(thread), thread);
                apply_sbhl_mapping_function(node);
            } finally {
                sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_0, thread);
            }
            if (NIL == sbhl_search_vars.sbhl_stop_search_path_p()) {
                final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                SubLObject rest;
                SubLObject module_var;
                SubLObject _prev_bind_2;
                SubLObject _prev_bind_3;
                SubLObject node_$19;
                SubLObject d_link;
                SubLObject mt_links;
                SubLObject iteration_state;
                SubLObject mt;
                SubLObject tv_links;
                SubLObject _prev_bind_0_$20;
                SubLObject iteration_state_$21;
                SubLObject tv;
                SubLObject link_nodes;
                SubLObject _prev_bind_0_$21;
                SubLObject sol;
                SubLObject set_contents_var;
                SubLObject basis_object;
                SubLObject state;
                SubLObject link_node;
                SubLObject _prev_bind_0_$22;
                SubLObject csome_list_var;
                SubLObject link_node2;
                SubLObject _prev_bind_0_$23;
                SubLObject new_list;
                SubLObject rest_$25;
                SubLObject generating_fn;
                SubLObject _prev_bind_0_$24;
                SubLObject sol2;
                SubLObject link_nodes2;
                SubLObject set_contents_var2;
                SubLObject basis_object2;
                SubLObject state2;
                SubLObject link_node3;
                SubLObject _prev_bind_0_$25;
                SubLObject csome_list_var2;
                SubLObject link_node4;
                SubLObject _prev_bind_0_$26;
                for (rest = NIL, rest = accessible_modules; (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != rest); rest = rest.rest()) {
                    module_var = rest.first();
                    _prev_bind_2 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    try {
                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                        node_$19 = function_terms.naut_to_nart(node);
                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node_$19)) {
                            d_link = sbhl_graphs.get_sbhl_graph_link(node_$19, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                            if (NIL != d_link) {
                                mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                if (NIL != mt_links) {
                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                        thread.resetMultipleValues();
                                        mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                        tv_links = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                            _prev_bind_0_$20 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                            try {
                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                for (iteration_state_$21 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$21)); iteration_state_$21 = dictionary_contents.do_dictionary_contents_next(iteration_state_$21)) {
                                                    thread.resetMultipleValues();
                                                    tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$21);
                                                    link_nodes = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                        _prev_bind_0_$21 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                            sol = link_nodes;
                                                            if (NIL != set.set_p(sol)) {
                                                                set_contents_var = set.do_set_internal(sol);
                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                    link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                    if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                                        if ((NIL != kb_access_metering.$kb_access_metering_enabledP$.getGlobalValue()) && (NIL != kb_access_metering.note_kb_access_sbhlP())) {
                                                                            note_kb_access_sbhl_link(node, link_node);
                                                                        }
                                                                        _prev_bind_0_$22 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_search_vars.$sbhl_search_parent_marking$.bind(sbhl_search_vars.$sbhl_search_parent_marking$.getDynamicValue(thread), thread);
                                                                            sbhl_unmark_and_sweep(link_node);
                                                                        } finally {
                                                                            sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_0_$22, thread);
                                                                        }
                                                                        if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                                            sbhl_apply_unwind_function(list(node, link_node));
                                                                        }
                                                                    }
                                                                }
                                                            } else
                                                                if (sol.isList()) {
                                                                    if (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                                                                        csome_list_var = sol;
                                                                        link_node2 = NIL;
                                                                        link_node2 = csome_list_var.first();
                                                                        while ((NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var)) {
                                                                            if ((NIL != kb_access_metering.$kb_access_metering_enabledP$.getGlobalValue()) && (NIL != kb_access_metering.note_kb_access_sbhlP())) {
                                                                                note_kb_access_sbhl_link(node, link_node2);
                                                                            }
                                                                            _prev_bind_0_$23 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_search_vars.$sbhl_search_parent_marking$.bind(sbhl_search_vars.$sbhl_search_parent_marking$.getDynamicValue(thread), thread);
                                                                                sbhl_unmark_and_sweep(link_node2);
                                                                            } finally {
                                                                                sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_0_$23, thread);
                                                                            }
                                                                            if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                                                sbhl_apply_unwind_function(list(node, link_node2));
                                                                            }
                                                                            csome_list_var = csome_list_var.rest();
                                                                            link_node2 = csome_list_var.first();
                                                                        } 
                                                                    }
                                                                } else {
                                                                    Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                }

                                                        } finally {
                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$21, thread);
                                                        }
                                                    }
                                                }
                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$21);
                                            } finally {
                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$20, thread);
                                            }
                                        }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                }
                            } else {
                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str43$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } else
                            if (NIL != obsolete.cnat_p(node_$19, UNPROVIDED)) {
                                new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                for (rest_$25 = NIL, rest_$25 = new_list; (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != rest_$25); rest_$25 = rest_$25.rest()) {
                                    generating_fn = rest_$25.first();
                                    _prev_bind_0_$24 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                    try {
                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                        link_nodes2 = sol2 = funcall(generating_fn, node_$19);
                                        if (NIL != set.set_p(sol2)) {
                                            set_contents_var2 = set.do_set_internal(sol2);
                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                if (NIL != set_contents.do_set_contents_element_validP(state2, link_node3)) {
                                                    if ((NIL != kb_access_metering.$kb_access_metering_enabledP$.getGlobalValue()) && (NIL != kb_access_metering.note_kb_access_sbhlP())) {
                                                        note_kb_access_sbhl_link(node, link_node3);
                                                    }
                                                    _prev_bind_0_$25 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_parent_marking$.bind(sbhl_search_vars.$sbhl_search_parent_marking$.getDynamicValue(thread), thread);
                                                        sbhl_unmark_and_sweep(link_node3);
                                                    } finally {
                                                        sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_0_$25, thread);
                                                    }
                                                    if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                        sbhl_apply_unwind_function(list(node, link_node3));
                                                    }
                                                }
                                            }
                                        } else
                                            if (sol2.isList()) {
                                                if (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                                                    csome_list_var2 = sol2;
                                                    link_node4 = NIL;
                                                    link_node4 = csome_list_var2.first();
                                                    while ((NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var2)) {
                                                        if ((NIL != kb_access_metering.$kb_access_metering_enabledP$.getGlobalValue()) && (NIL != kb_access_metering.note_kb_access_sbhlP())) {
                                                            note_kb_access_sbhl_link(node, link_node4);
                                                        }
                                                        _prev_bind_0_$26 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                        try {
                                                            sbhl_search_vars.$sbhl_search_parent_marking$.bind(sbhl_search_vars.$sbhl_search_parent_marking$.getDynamicValue(thread), thread);
                                                            sbhl_unmark_and_sweep(link_node4);
                                                        } finally {
                                                            sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_0_$26, thread);
                                                        }
                                                        if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                            sbhl_apply_unwind_function(list(node, link_node4));
                                                        }
                                                        csome_list_var2 = csome_list_var2.rest();
                                                        link_node4 = csome_list_var2.first();
                                                    } 
                                                }
                                            } else {
                                                Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                            }

                                    } finally {
                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$24, thread);
                                    }
                                }
                            }

                    } finally {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_2, thread);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Like @see sbhl-mark-and-sweep, but performs unwind after iterating through link-nodes.
     */
    @LispMethod(comment = "Like @see sbhl-mark-and-sweep, but performs unwind after iterating through link-nodes.")
    public static final SubLObject sbhl_mark_sweep_and_unwind_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node, UNPROVIDED)) {
                sbhl_marking_utilities.sbhl_mark_node_marked(node, UNPROVIDED);
                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.apply_sbhl_mapping_function(node);
                if (NIL == sbhl_search_vars.sbhl_stop_search_path_p()) {
                    {
                        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(get_sbhl_module(UNPROVIDED));
                        SubLObject rest = NIL;
                        for (rest = accessible_modules; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest)); rest = rest.rest()) {
                            {
                                SubLObject module_var = rest.first();
                                {
                                    SubLObject _prev_bind_0 = $sbhl_module$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        $sbhl_module$.bind(module_var, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                        {
                                            SubLObject node_35 = function_terms.naut_to_nart(node);
                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node_35)) {
                                                {
                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_35, get_sbhl_module(UNPROVIDED));
                                                    if (NIL != d_link) {
                                                        {
                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                {
                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                    while (!((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                        thread.resetMultipleValues();
                                                                        {
                                                                            SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_36 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                        {
                                                                                            SubLObject iteration_state_37 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                            while (!((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_37)))) {
                                                                                                thread.resetMultipleValues();
                                                                                                {
                                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_37);
                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                    thread.resetMultipleValues();
                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_38 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                            try {
                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                {
                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                    SubLObject rest_39 = NIL;
                                                                                                                    for (rest_39 = new_list; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest_39)); rest_39 = rest_39.rest()) {
                                                                                                                        {
                                                                                                                            SubLObject link_node = rest_39.first();
                                                                                                                            if ((NIL != kb_access_metering.$kb_access_metering_enabledP$.getGlobalValue()) && (NIL != kb_access_metering.note_kb_access_sbhlP())) {
                                                                                                                                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.note_kb_access_sbhl_link(node, link_node);
                                                                                                                            }
                                                                                                                            com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_mark_sweep_and_unwind(link_node);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            } finally {
                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_38, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    iteration_state_37 = dictionary_contents.do_dictionary_contents_next(iteration_state_37);
                                                                                                }
                                                                                            } 
                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_37);
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_36, thread);
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
                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt42$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                }
                                            } else {
                                                if (NIL != obsolete.cnat_p(node_35, UNPROVIDED)) {
                                                    {
                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED));
                                                        SubLObject rest_40 = NIL;
                                                        for (rest_40 = new_list; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest_40)); rest_40 = rest_40.rest()) {
                                                            {
                                                                SubLObject generating_fn = rest_40.first();
                                                                {
                                                                    SubLObject _prev_bind_0_41 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        {
                                                                            SubLObject link_nodes = funcall(generating_fn, node_35);
                                                                            SubLObject new_list_42 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                            SubLObject rest_43 = NIL;
                                                                            for (rest_43 = new_list_42; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest_43)); rest_43 = rest_43.rest()) {
                                                                                {
                                                                                    SubLObject link_node = rest_43.first();
                                                                                    if ((NIL != kb_access_metering.$kb_access_metering_enabledP$.getGlobalValue()) && (NIL != kb_access_metering.note_kb_access_sbhlP())) {
                                                                                        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.note_kb_access_sbhl_link(node, link_node);
                                                                                    }
                                                                                    com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_mark_sweep_and_unwind(link_node);
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_41, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1, thread);
                                        $sbhl_module$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                }
                if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                    com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_apply_unwind_function(node);
                }
            }
            return NIL;
        }
    }

    /**
     * Like @see sbhl-mark-and-sweep, but performs unwind after iterating through link-nodes.
     */
    @LispMethod(comment = "Like @see sbhl-mark-and-sweep, but performs unwind after iterating through link-nodes.")
    public static SubLObject sbhl_mark_sweep_and_unwind(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node, UNPROVIDED)) {
            sbhl_marking_utilities.sbhl_mark_node_marked(node, UNPROVIDED);
            apply_sbhl_mapping_function(node);
            if (NIL == sbhl_search_vars.sbhl_stop_search_path_p()) {
                final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                SubLObject rest;
                SubLObject module_var;
                SubLObject _prev_bind_0;
                SubLObject _prev_bind_2;
                SubLObject node_$29;
                SubLObject d_link;
                SubLObject mt_links;
                SubLObject iteration_state;
                SubLObject mt;
                SubLObject tv_links;
                SubLObject _prev_bind_0_$30;
                SubLObject iteration_state_$31;
                SubLObject tv;
                SubLObject link_nodes;
                SubLObject _prev_bind_0_$31;
                SubLObject sol;
                SubLObject set_contents_var;
                SubLObject basis_object;
                SubLObject state;
                SubLObject link_node;
                SubLObject csome_list_var;
                SubLObject link_node2;
                SubLObject new_list;
                SubLObject rest_$33;
                SubLObject generating_fn;
                SubLObject _prev_bind_0_$32;
                SubLObject sol2;
                SubLObject link_nodes2;
                SubLObject set_contents_var2;
                SubLObject basis_object2;
                SubLObject state2;
                SubLObject link_node3;
                SubLObject csome_list_var2;
                SubLObject link_node4;
                for (rest = NIL, rest = accessible_modules; (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != rest); rest = rest.rest()) {
                    module_var = rest.first();
                    _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    _prev_bind_2 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    try {
                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                        node_$29 = function_terms.naut_to_nart(node);
                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node_$29)) {
                            d_link = sbhl_graphs.get_sbhl_graph_link(node_$29, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                            if (NIL != d_link) {
                                mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                if (NIL != mt_links) {
                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                        thread.resetMultipleValues();
                                        mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                        tv_links = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                            _prev_bind_0_$30 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                            try {
                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                for (iteration_state_$31 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$31)); iteration_state_$31 = dictionary_contents.do_dictionary_contents_next(iteration_state_$31)) {
                                                    thread.resetMultipleValues();
                                                    tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$31);
                                                    link_nodes = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                        _prev_bind_0_$31 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                            sol = link_nodes;
                                                            if (NIL != set.set_p(sol)) {
                                                                set_contents_var = set.do_set_internal(sol);
                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                    link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                    if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                                        if ((NIL != kb_access_metering.$kb_access_metering_enabledP$.getGlobalValue()) && (NIL != kb_access_metering.note_kb_access_sbhlP())) {
                                                                            note_kb_access_sbhl_link(node, link_node);
                                                                        }
                                                                        sbhl_mark_sweep_and_unwind(link_node);
                                                                    }
                                                                }
                                                            } else
                                                                if (sol.isList()) {
                                                                    if (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                                                                        csome_list_var = sol;
                                                                        link_node2 = NIL;
                                                                        link_node2 = csome_list_var.first();
                                                                        while ((NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var)) {
                                                                            if ((NIL != kb_access_metering.$kb_access_metering_enabledP$.getGlobalValue()) && (NIL != kb_access_metering.note_kb_access_sbhlP())) {
                                                                                note_kb_access_sbhl_link(node, link_node2);
                                                                            }
                                                                            sbhl_mark_sweep_and_unwind(link_node2);
                                                                            csome_list_var = csome_list_var.rest();
                                                                            link_node2 = csome_list_var.first();
                                                                        } 
                                                                    }
                                                                } else {
                                                                    Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                }

                                                        } finally {
                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$31, thread);
                                                        }
                                                    }
                                                }
                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$31);
                                            } finally {
                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$30, thread);
                                            }
                                        }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                }
                            } else {
                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str43$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } else
                            if (NIL != obsolete.cnat_p(node_$29, UNPROVIDED)) {
                                new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                for (rest_$33 = NIL, rest_$33 = new_list; (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != rest_$33); rest_$33 = rest_$33.rest()) {
                                    generating_fn = rest_$33.first();
                                    _prev_bind_0_$32 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                    try {
                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                        link_nodes2 = sol2 = funcall(generating_fn, node_$29);
                                        if (NIL != set.set_p(sol2)) {
                                            set_contents_var2 = set.do_set_internal(sol2);
                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                if (NIL != set_contents.do_set_contents_element_validP(state2, link_node3)) {
                                                    if ((NIL != kb_access_metering.$kb_access_metering_enabledP$.getGlobalValue()) && (NIL != kb_access_metering.note_kb_access_sbhlP())) {
                                                        note_kb_access_sbhl_link(node, link_node3);
                                                    }
                                                    sbhl_mark_sweep_and_unwind(link_node3);
                                                }
                                            }
                                        } else
                                            if (sol2.isList()) {
                                                if (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                                                    csome_list_var2 = sol2;
                                                    link_node4 = NIL;
                                                    link_node4 = csome_list_var2.first();
                                                    while ((NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var2)) {
                                                        if ((NIL != kb_access_metering.$kb_access_metering_enabledP$.getGlobalValue()) && (NIL != kb_access_metering.note_kb_access_sbhlP())) {
                                                            note_kb_access_sbhl_link(node, link_node4);
                                                        }
                                                        sbhl_mark_sweep_and_unwind(link_node4);
                                                        csome_list_var2 = csome_list_var2.rest();
                                                        link_node4 = csome_list_var2.first();
                                                    } 
                                                }
                                            } else {
                                                Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                            }

                                    } finally {
                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$32, thread);
                                    }
                                }
                            }

                    } finally {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2, thread);
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                sbhl_apply_unwind_function(node);
            }
        }
        return NIL;
    }

    /**
     * Modifier. The recursive search workhouse. Stops recurring when NODE's marking indicates path termination @see sbhl-search-path-termination-p. Dynamically rebinds @see *sbhl-search-parent-marking*, when it gathers new nodes during search, with either a search mapping function (@see apply-sbhl-mapping-function), or recurring among link-nodes (@see do-accessible-sbhl-link-nodes).
     */
    @LispMethod(comment = "Modifier. The recursive search workhouse. Stops recurring when NODE\'s marking indicates path termination @see sbhl-search-path-termination-p. Dynamically rebinds @see *sbhl-search-parent-marking*, when it gathers new nodes during search, with either a search mapping function (@see apply-sbhl-mapping-function), or recurring among link-nodes (@see do-accessible-sbhl-link-nodes).")
    public static final SubLObject sbhl_time_mark_and_sweep_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node, UNPROVIDED)) {
                sbhl_marking_utilities.sbhl_mark_node_marked(node, UNPROVIDED);
                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.apply_sbhl_mapping_function(node);
                if (NIL == sbhl_search_vars.sbhl_stop_search_path_p()) {
                    {
                        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(get_sbhl_module(UNPROVIDED));
                        SubLObject rest = NIL;
                        for (rest = accessible_modules; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest)); rest = rest.rest()) {
                            {
                                SubLObject module_var = rest.first();
                                {
                                    SubLObject _prev_bind_0 = $sbhl_module$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        $sbhl_module$.bind(module_var, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                        {
                                            SubLObject node_44 = function_terms.naut_to_nart(node);
                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node_44)) {
                                                {
                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_44, get_sbhl_module(UNPROVIDED));
                                                    if (NIL != d_link) {
                                                        {
                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                {
                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                    while (!((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                        thread.resetMultipleValues();
                                                                        {
                                                                            SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_45 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                        {
                                                                                            SubLObject iteration_state_46 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                            while (!((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_46)))) {
                                                                                                thread.resetMultipleValues();
                                                                                                {
                                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_46);
                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                    thread.resetMultipleValues();
                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_47 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                            try {
                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                {
                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                    SubLObject rest_48 = NIL;
                                                                                                                    for (rest_48 = new_list; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest_48)); rest_48 = rest_48.rest()) {
                                                                                                                        {
                                                                                                                            SubLObject link_node = rest_48.first();
                                                                                                                            {
                                                                                                                                SubLObject _prev_bind_0_49 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                                                                                SubLObject _prev_bind_1_50 = sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.currentBinding(thread);
                                                                                                                                try {
                                                                                                                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(sbhl_search_vars.$sbhl_search_parent_marking$.getDynamicValue(thread), thread);
                                                                                                                                    sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.bind(NIL != sbhl_search_vars.sbhl_justification_search_p() ? ((SubLObject) (makeBoolean((NIL != sbhl_time_utilities.hl_date_point_p(node)) || (NIL != sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.getDynamicValue(thread))))) : NIL, thread);
                                                                                                                                    if (!((NIL != sbhl_search_vars.sbhl_justification_search_p()) && (NIL != sbhl_time_vars.sbhl_temporality_consequent_links_search_passed_through_link_p(com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_temporal_faux_link(node, link_node))))) {
                                                                                                                                        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_time_mark_and_sweep(link_node);
                                                                                                                                    }
                                                                                                                                } finally {
                                                                                                                                    sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.rebind(_prev_bind_1_50, thread);
                                                                                                                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_0_49, thread);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                                                                                                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_apply_unwind_function(list(node, link_node));
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            } finally {
                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_47, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    iteration_state_46 = dictionary_contents.do_dictionary_contents_next(iteration_state_46);
                                                                                                }
                                                                                            } 
                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_46);
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_45, thread);
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
                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt42$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                }
                                            } else {
                                                if (NIL != obsolete.cnat_p(node_44, UNPROVIDED)) {
                                                    {
                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED));
                                                        SubLObject rest_51 = NIL;
                                                        for (rest_51 = new_list; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest_51)); rest_51 = rest_51.rest()) {
                                                            {
                                                                SubLObject generating_fn = rest_51.first();
                                                                {
                                                                    SubLObject _prev_bind_0_52 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        {
                                                                            SubLObject link_nodes = funcall(generating_fn, node_44);
                                                                            SubLObject new_list_53 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                            SubLObject rest_54 = NIL;
                                                                            for (rest_54 = new_list_53; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest_54)); rest_54 = rest_54.rest()) {
                                                                                {
                                                                                    SubLObject link_node = rest_54.first();
                                                                                    {
                                                                                        SubLObject _prev_bind_0_55 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                                        SubLObject _prev_bind_1_56 = sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_search_vars.$sbhl_search_parent_marking$.bind(sbhl_search_vars.$sbhl_search_parent_marking$.getDynamicValue(thread), thread);
                                                                                            sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.bind(NIL != sbhl_search_vars.sbhl_justification_search_p() ? ((SubLObject) (makeBoolean((NIL != sbhl_time_utilities.hl_date_point_p(node)) || (NIL != sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.getDynamicValue(thread))))) : NIL, thread);
                                                                                            if (!((NIL != sbhl_search_vars.sbhl_justification_search_p()) && (NIL != sbhl_time_vars.sbhl_temporality_consequent_links_search_passed_through_link_p(com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_temporal_faux_link(node, link_node))))) {
                                                                                                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_time_mark_and_sweep(link_node);
                                                                                            }
                                                                                        } finally {
                                                                                            sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.rebind(_prev_bind_1_56, thread);
                                                                                            sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_0_55, thread);
                                                                                        }
                                                                                    }
                                                                                    if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                                                        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_apply_unwind_function(list(node, link_node));
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_52, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1, thread);
                                        $sbhl_module$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Modifier. The recursive search workhouse. Stops recurring when NODE's marking indicates path termination @see sbhl-search-path-termination-p. Dynamically rebinds @see *sbhl-search-parent-marking*, when it gathers new nodes during search, with either a search mapping function (@see apply-sbhl-mapping-function), or recurring among link-nodes (@see do-accessible-sbhl-link-nodes).
     */
    @LispMethod(comment = "Modifier. The recursive search workhouse. Stops recurring when NODE\'s marking indicates path termination @see sbhl-search-path-termination-p. Dynamically rebinds @see *sbhl-search-parent-marking*, when it gathers new nodes during search, with either a search mapping function (@see apply-sbhl-mapping-function), or recurring among link-nodes (@see do-accessible-sbhl-link-nodes).")
    public static SubLObject sbhl_time_mark_and_sweep(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node, UNPROVIDED)) {
            sbhl_marking_utilities.sbhl_mark_node_marked(node, UNPROVIDED);
            apply_sbhl_mapping_function(node);
            if (NIL == sbhl_search_vars.sbhl_stop_search_path_p()) {
                final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                SubLObject rest;
                SubLObject module_var;
                SubLObject _prev_bind_0;
                SubLObject _prev_bind_2;
                SubLObject node_$35;
                SubLObject d_link;
                SubLObject mt_links;
                SubLObject iteration_state;
                SubLObject mt;
                SubLObject tv_links;
                SubLObject _prev_bind_0_$36;
                SubLObject iteration_state_$37;
                SubLObject tv;
                SubLObject link_nodes;
                SubLObject _prev_bind_0_$37;
                SubLObject sol;
                SubLObject set_contents_var;
                SubLObject basis_object;
                SubLObject state;
                SubLObject link_node;
                SubLObject _prev_bind_0_$38;
                SubLObject _prev_bind_1_$40;
                SubLObject csome_list_var;
                SubLObject link_node2;
                SubLObject _prev_bind_0_$39;
                SubLObject _prev_bind_1_$41;
                SubLObject new_list;
                SubLObject rest_$43;
                SubLObject generating_fn;
                SubLObject _prev_bind_0_$40;
                SubLObject sol2;
                SubLObject link_nodes2;
                SubLObject set_contents_var2;
                SubLObject basis_object2;
                SubLObject state2;
                SubLObject link_node3;
                SubLObject _prev_bind_0_$41;
                SubLObject _prev_bind_1_$42;
                SubLObject csome_list_var2;
                SubLObject link_node4;
                SubLObject _prev_bind_0_$42;
                SubLObject _prev_bind_1_$43;
                for (rest = NIL, rest = accessible_modules; (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != rest); rest = rest.rest()) {
                    module_var = rest.first();
                    _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    _prev_bind_2 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    try {
                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                        node_$35 = function_terms.naut_to_nart(node);
                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node_$35)) {
                            d_link = sbhl_graphs.get_sbhl_graph_link(node_$35, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                            if (NIL != d_link) {
                                mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                if (NIL != mt_links) {
                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                        thread.resetMultipleValues();
                                        mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                        tv_links = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                            _prev_bind_0_$36 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                            try {
                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                for (iteration_state_$37 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$37)); iteration_state_$37 = dictionary_contents.do_dictionary_contents_next(iteration_state_$37)) {
                                                    thread.resetMultipleValues();
                                                    tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$37);
                                                    link_nodes = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                        _prev_bind_0_$37 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                            sol = link_nodes;
                                                            if (NIL != set.set_p(sol)) {
                                                                set_contents_var = set.do_set_internal(sol);
                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                    link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                    if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                                        _prev_bind_0_$38 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                        _prev_bind_1_$40 = sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_search_vars.$sbhl_search_parent_marking$.bind(sbhl_search_vars.$sbhl_search_parent_marking$.getDynamicValue(thread), thread);
                                                                            sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.bind(NIL != sbhl_search_vars.sbhl_justification_search_p() ? makeBoolean((NIL != sbhl_time_utilities.hl_date_point_p(node)) || (NIL != sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.getDynamicValue(thread))) : NIL, thread);
                                                                            if ((NIL == sbhl_search_vars.sbhl_justification_search_p()) || (NIL == sbhl_time_vars.sbhl_temporality_consequent_links_search_passed_through_link_p(sbhl_temporal_faux_link(node, link_node)))) {
                                                                                sbhl_time_mark_and_sweep(link_node);
                                                                            }
                                                                        } finally {
                                                                            sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.rebind(_prev_bind_1_$40, thread);
                                                                            sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_0_$38, thread);
                                                                        }
                                                                        if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                                            sbhl_apply_unwind_function(list(node, link_node));
                                                                        }
                                                                    }
                                                                }
                                                            } else
                                                                if (sol.isList()) {
                                                                    if (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                                                                        csome_list_var = sol;
                                                                        link_node2 = NIL;
                                                                        link_node2 = csome_list_var.first();
                                                                        while ((NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var)) {
                                                                            _prev_bind_0_$39 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                            _prev_bind_1_$41 = sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_search_vars.$sbhl_search_parent_marking$.bind(sbhl_search_vars.$sbhl_search_parent_marking$.getDynamicValue(thread), thread);
                                                                                sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.bind(NIL != sbhl_search_vars.sbhl_justification_search_p() ? makeBoolean((NIL != sbhl_time_utilities.hl_date_point_p(node)) || (NIL != sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.getDynamicValue(thread))) : NIL, thread);
                                                                                if ((NIL == sbhl_search_vars.sbhl_justification_search_p()) || (NIL == sbhl_time_vars.sbhl_temporality_consequent_links_search_passed_through_link_p(sbhl_temporal_faux_link(node, link_node2)))) {
                                                                                    sbhl_time_mark_and_sweep(link_node2);
                                                                                }
                                                                            } finally {
                                                                                sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.rebind(_prev_bind_1_$41, thread);
                                                                                sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_0_$39, thread);
                                                                            }
                                                                            if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                                                sbhl_apply_unwind_function(list(node, link_node2));
                                                                            }
                                                                            csome_list_var = csome_list_var.rest();
                                                                            link_node2 = csome_list_var.first();
                                                                        } 
                                                                    }
                                                                } else {
                                                                    Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                }

                                                        } finally {
                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$37, thread);
                                                        }
                                                    }
                                                }
                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$37);
                                            } finally {
                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$36, thread);
                                            }
                                        }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                }
                            } else {
                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str43$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } else
                            if (NIL != obsolete.cnat_p(node_$35, UNPROVIDED)) {
                                new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                for (rest_$43 = NIL, rest_$43 = new_list; (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != rest_$43); rest_$43 = rest_$43.rest()) {
                                    generating_fn = rest_$43.first();
                                    _prev_bind_0_$40 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                    try {
                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                        link_nodes2 = sol2 = funcall(generating_fn, node_$35);
                                        if (NIL != set.set_p(sol2)) {
                                            set_contents_var2 = set.do_set_internal(sol2);
                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                if (NIL != set_contents.do_set_contents_element_validP(state2, link_node3)) {
                                                    _prev_bind_0_$41 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                    _prev_bind_1_$42 = sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_parent_marking$.bind(sbhl_search_vars.$sbhl_search_parent_marking$.getDynamicValue(thread), thread);
                                                        sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.bind(NIL != sbhl_search_vars.sbhl_justification_search_p() ? makeBoolean((NIL != sbhl_time_utilities.hl_date_point_p(node)) || (NIL != sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.getDynamicValue(thread))) : NIL, thread);
                                                        if ((NIL == sbhl_search_vars.sbhl_justification_search_p()) || (NIL == sbhl_time_vars.sbhl_temporality_consequent_links_search_passed_through_link_p(sbhl_temporal_faux_link(node, link_node3)))) {
                                                            sbhl_time_mark_and_sweep(link_node3);
                                                        }
                                                    } finally {
                                                        sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.rebind(_prev_bind_1_$42, thread);
                                                        sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_0_$41, thread);
                                                    }
                                                    if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                        sbhl_apply_unwind_function(list(node, link_node3));
                                                    }
                                                }
                                            }
                                        } else
                                            if (sol2.isList()) {
                                                if (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                                                    csome_list_var2 = sol2;
                                                    link_node4 = NIL;
                                                    link_node4 = csome_list_var2.first();
                                                    while ((NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var2)) {
                                                        _prev_bind_0_$42 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                        _prev_bind_1_$43 = sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.currentBinding(thread);
                                                        try {
                                                            sbhl_search_vars.$sbhl_search_parent_marking$.bind(sbhl_search_vars.$sbhl_search_parent_marking$.getDynamicValue(thread), thread);
                                                            sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.bind(NIL != sbhl_search_vars.sbhl_justification_search_p() ? makeBoolean((NIL != sbhl_time_utilities.hl_date_point_p(node)) || (NIL != sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.getDynamicValue(thread))) : NIL, thread);
                                                            if ((NIL == sbhl_search_vars.sbhl_justification_search_p()) || (NIL == sbhl_time_vars.sbhl_temporality_consequent_links_search_passed_through_link_p(sbhl_temporal_faux_link(node, link_node4)))) {
                                                                sbhl_time_mark_and_sweep(link_node4);
                                                            }
                                                        } finally {
                                                            sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.rebind(_prev_bind_1_$43, thread);
                                                            sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_0_$42, thread);
                                                        }
                                                        if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                            sbhl_apply_unwind_function(list(node, link_node4));
                                                        }
                                                        csome_list_var2 = csome_list_var2.rest();
                                                        link_node4 = csome_list_var2.first();
                                                    } 
                                                }
                                            } else {
                                                Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                            }

                                    } finally {
                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$40, thread);
                                    }
                                }
                            }

                    } finally {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2, thread);
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Mofifier: Steps over NODE's accessible links, ignoring NODE's marking if SUSPEND-TEST-P is true. Does not mark node. Applies sbhl-mapping-function.
     */
    @LispMethod(comment = "Mofifier: Steps over NODE\'s accessible links, ignoring NODE\'s marking if SUSPEND-TEST-P is true. Does not mark node. Applies sbhl-mapping-function.")
    public static final SubLObject sbhl_step_and_suspend_mark_alt(SubLObject node, SubLObject suspend_test_p) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject terminate_p = NIL;
                SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(get_sbhl_module(UNPROVIDED));
                SubLObject rest = NIL;
                for (rest = accessible_modules; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest)); rest = rest.rest()) {
                    {
                        SubLObject module_var = rest.first();
                        {
                            SubLObject _prev_bind_0 = $sbhl_module$.currentBinding(thread);
                            SubLObject _prev_bind_1 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                $sbhl_module$.bind(module_var, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                {
                                    SubLObject node_57 = function_terms.naut_to_nart(node);
                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node_57)) {
                                        {
                                            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_57, get_sbhl_module(UNPROVIDED));
                                            if (NIL != d_link) {
                                                {
                                                    SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), get_sbhl_module(UNPROVIDED));
                                                    if (NIL != mt_links) {
                                                        {
                                                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                            while (!((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                thread.resetMultipleValues();
                                                                {
                                                                    SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        {
                                                                            SubLObject _prev_bind_0_58 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                {
                                                                                    SubLObject iteration_state_59 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                    while (!((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_59)))) {
                                                                                        thread.resetMultipleValues();
                                                                                        {
                                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_59);
                                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_60 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                        {
                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                            SubLObject rest_61 = NIL;
                                                                                                            for (rest_61 = new_list; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest_61)); rest_61 = rest_61.rest()) {
                                                                                                                {
                                                                                                                    SubLObject link_node = rest_61.first();
                                                                                                                    if (NIL != suspend_test_p) {
                                                                                                                        terminate_p = NIL;
                                                                                                                    } else {
                                                                                                                        terminate_p = sbhl_marking_utilities.sbhl_search_path_termination_p(link_node, UNPROVIDED);
                                                                                                                    }
                                                                                                                    if (NIL == terminate_p) {
                                                                                                                        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.apply_sbhl_mapping_function(link_node);
                                                                                                                    }
                                                                                                                    if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                                                                                        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_apply_unwind_function(list(node, link_node));
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } finally {
                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_60, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            iteration_state_59 = dictionary_contents.do_dictionary_contents_next(iteration_state_59);
                                                                                        }
                                                                                    } 
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_59);
                                                                                }
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_58, thread);
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
                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt42$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                        }
                                    } else {
                                        if (NIL != obsolete.cnat_p(node_57, UNPROVIDED)) {
                                            {
                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED));
                                                SubLObject rest_62 = NIL;
                                                for (rest_62 = new_list; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest_62)); rest_62 = rest_62.rest()) {
                                                    {
                                                        SubLObject generating_fn = rest_62.first();
                                                        {
                                                            SubLObject _prev_bind_0_63 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                {
                                                                    SubLObject link_nodes = funcall(generating_fn, node_57);
                                                                    SubLObject new_list_64 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                    SubLObject rest_65 = NIL;
                                                                    for (rest_65 = new_list_64; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest_65)); rest_65 = rest_65.rest()) {
                                                                        {
                                                                            SubLObject link_node = rest_65.first();
                                                                            if (NIL != suspend_test_p) {
                                                                                terminate_p = NIL;
                                                                            } else {
                                                                                terminate_p = sbhl_marking_utilities.sbhl_search_path_termination_p(link_node, UNPROVIDED);
                                                                            }
                                                                            if (NIL == terminate_p) {
                                                                                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.apply_sbhl_mapping_function(link_node);
                                                                            }
                                                                            if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                                                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_apply_unwind_function(list(node, link_node));
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_63, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1, thread);
                                $sbhl_module$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Mofifier: Steps over NODE's accessible links, ignoring NODE's marking if SUSPEND-TEST-P is true. Does not mark node. Applies sbhl-mapping-function.
     */
    @LispMethod(comment = "Mofifier: Steps over NODE\'s accessible links, ignoring NODE\'s marking if SUSPEND-TEST-P is true. Does not mark node. Applies sbhl-mapping-function.")
    public static SubLObject sbhl_step_and_suspend_mark(final SubLObject node, final SubLObject suspend_test_p) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject terminate_p = NIL;
        final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        SubLObject rest;
        SubLObject module_var;
        SubLObject _prev_bind_0;
        SubLObject _prev_bind_2;
        SubLObject node_$49;
        SubLObject d_link;
        SubLObject mt_links;
        SubLObject iteration_state;
        SubLObject mt;
        SubLObject tv_links;
        SubLObject _prev_bind_0_$50;
        SubLObject iteration_state_$51;
        SubLObject tv;
        SubLObject link_nodes;
        SubLObject _prev_bind_0_$51;
        SubLObject sol;
        SubLObject set_contents_var;
        SubLObject basis_object;
        SubLObject state;
        SubLObject link_node;
        SubLObject csome_list_var;
        SubLObject link_node2;
        SubLObject new_list;
        SubLObject rest_$53;
        SubLObject generating_fn;
        SubLObject _prev_bind_0_$52;
        SubLObject sol2;
        SubLObject link_nodes2;
        SubLObject set_contents_var2;
        SubLObject basis_object2;
        SubLObject state2;
        SubLObject link_node3;
        SubLObject csome_list_var2;
        SubLObject link_node4;
        for (rest = NIL, rest = accessible_modules; (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != rest); rest = rest.rest()) {
            module_var = rest.first();
            _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            _prev_bind_2 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                node_$49 = function_terms.naut_to_nart(node);
                if (NIL != sbhl_link_vars.sbhl_node_object_p(node_$49)) {
                    d_link = sbhl_graphs.get_sbhl_graph_link(node_$49, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                    if (NIL != d_link) {
                        mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                        if (NIL != mt_links) {
                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                thread.resetMultipleValues();
                                mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                    _prev_bind_0_$50 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                    try {
                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                        for (iteration_state_$51 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$51)); iteration_state_$51 = dictionary_contents.do_dictionary_contents_next(iteration_state_$51)) {
                                            thread.resetMultipleValues();
                                            tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$51);
                                            link_nodes = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                _prev_bind_0_$51 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                try {
                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                    sol = link_nodes;
                                                    if (NIL != set.set_p(sol)) {
                                                        set_contents_var = set.do_set_internal(sol);
                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                            link_node = set_contents.do_set_contents_next(basis_object, state);
                                                            if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                                if (NIL != suspend_test_p) {
                                                                    terminate_p = NIL;
                                                                } else {
                                                                    terminate_p = sbhl_marking_utilities.sbhl_search_path_termination_p(link_node, UNPROVIDED);
                                                                }
                                                                if (NIL == terminate_p) {
                                                                    apply_sbhl_mapping_function(link_node);
                                                                }
                                                                if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                                    sbhl_apply_unwind_function(list(node, link_node));
                                                                }
                                                            }
                                                        }
                                                    } else
                                                        if (sol.isList()) {
                                                            if (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                                                                csome_list_var = sol;
                                                                link_node2 = NIL;
                                                                link_node2 = csome_list_var.first();
                                                                while ((NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var)) {
                                                                    if (NIL != suspend_test_p) {
                                                                        terminate_p = NIL;
                                                                    } else {
                                                                        terminate_p = sbhl_marking_utilities.sbhl_search_path_termination_p(link_node2, UNPROVIDED);
                                                                    }
                                                                    if (NIL == terminate_p) {
                                                                        apply_sbhl_mapping_function(link_node2);
                                                                    }
                                                                    if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                                        sbhl_apply_unwind_function(list(node, link_node2));
                                                                    }
                                                                    csome_list_var = csome_list_var.rest();
                                                                    link_node2 = csome_list_var.first();
                                                                } 
                                                            }
                                                        } else {
                                                            Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                        }

                                                } finally {
                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$51, thread);
                                                }
                                            }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$51);
                                    } finally {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$50, thread);
                                    }
                                }
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                    } else {
                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str43$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                } else
                    if (NIL != obsolete.cnat_p(node_$49, UNPROVIDED)) {
                        new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                        for (rest_$53 = NIL, rest_$53 = new_list; (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != rest_$53); rest_$53 = rest_$53.rest()) {
                            generating_fn = rest_$53.first();
                            _prev_bind_0_$52 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                            try {
                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                link_nodes2 = sol2 = funcall(generating_fn, node_$49);
                                if (NIL != set.set_p(sol2)) {
                                    set_contents_var2 = set.do_set_internal(sol2);
                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                        link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                        if (NIL != set_contents.do_set_contents_element_validP(state2, link_node3)) {
                                            if (NIL != suspend_test_p) {
                                                terminate_p = NIL;
                                            } else {
                                                terminate_p = sbhl_marking_utilities.sbhl_search_path_termination_p(link_node3, UNPROVIDED);
                                            }
                                            if (NIL == terminate_p) {
                                                apply_sbhl_mapping_function(link_node3);
                                            }
                                            if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                sbhl_apply_unwind_function(list(node, link_node3));
                                            }
                                        }
                                    }
                                } else
                                    if (sol2.isList()) {
                                        if (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                                            csome_list_var2 = sol2;
                                            link_node4 = NIL;
                                            link_node4 = csome_list_var2.first();
                                            while ((NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var2)) {
                                                if (NIL != suspend_test_p) {
                                                    terminate_p = NIL;
                                                } else {
                                                    terminate_p = sbhl_marking_utilities.sbhl_search_path_termination_p(link_node4, UNPROVIDED);
                                                }
                                                if (NIL == terminate_p) {
                                                    apply_sbhl_mapping_function(link_node4);
                                                }
                                                if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                    sbhl_apply_unwind_function(list(node, link_node4));
                                                }
                                                csome_list_var2 = csome_list_var2.rest();
                                                link_node4 = csome_list_var2.first();
                                            } 
                                        }
                                    } else {
                                        Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                    }

                            } finally {
                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$52, thread);
                            }
                        }
                    }

            } finally {
                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    /**
     * Modifier: Steps of NODE's marked accessible links. Does not unmark
     */
    @LispMethod(comment = "Modifier: Steps of NODE\'s marked accessible links. Does not unmark")
    public static final SubLObject sbhl_step_and_suspend_unmark_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(get_sbhl_module(UNPROVIDED));
                SubLObject rest = NIL;
                for (rest = accessible_modules; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest)); rest = rest.rest()) {
                    {
                        SubLObject module_var = rest.first();
                        {
                            SubLObject _prev_bind_0 = $sbhl_module$.currentBinding(thread);
                            SubLObject _prev_bind_1 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                $sbhl_module$.bind(module_var, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                {
                                    SubLObject node_66 = function_terms.naut_to_nart(node);
                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node_66)) {
                                        {
                                            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_66, get_sbhl_module(UNPROVIDED));
                                            if (NIL != d_link) {
                                                {
                                                    SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), get_sbhl_module(UNPROVIDED));
                                                    if (NIL != mt_links) {
                                                        {
                                                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                            while (!((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                thread.resetMultipleValues();
                                                                {
                                                                    SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        {
                                                                            SubLObject _prev_bind_0_67 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                {
                                                                                    SubLObject iteration_state_68 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                    while (!((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_68)))) {
                                                                                        thread.resetMultipleValues();
                                                                                        {
                                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_68);
                                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_69 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                        {
                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                            SubLObject rest_70 = NIL;
                                                                                                            for (rest_70 = new_list; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest_70)); rest_70 = rest_70.rest()) {
                                                                                                                {
                                                                                                                    SubLObject link_node = rest_70.first();
                                                                                                                    if (NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(link_node, UNPROVIDED)) {
                                                                                                                        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.apply_sbhl_mapping_function(link_node);
                                                                                                                    }
                                                                                                                    if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                                                                                        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_apply_unwind_function(list(node, link_node));
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } finally {
                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_69, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            iteration_state_68 = dictionary_contents.do_dictionary_contents_next(iteration_state_68);
                                                                                        }
                                                                                    } 
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_68);
                                                                                }
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_67, thread);
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
                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt42$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                        }
                                    } else {
                                        if (NIL != obsolete.cnat_p(node_66, UNPROVIDED)) {
                                            {
                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED));
                                                SubLObject rest_71 = NIL;
                                                for (rest_71 = new_list; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest_71)); rest_71 = rest_71.rest()) {
                                                    {
                                                        SubLObject generating_fn = rest_71.first();
                                                        {
                                                            SubLObject _prev_bind_0_72 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                {
                                                                    SubLObject link_nodes = funcall(generating_fn, node_66);
                                                                    SubLObject new_list_73 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                    SubLObject rest_74 = NIL;
                                                                    for (rest_74 = new_list_73; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest_74)); rest_74 = rest_74.rest()) {
                                                                        {
                                                                            SubLObject link_node = rest_74.first();
                                                                            if (NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(link_node, UNPROVIDED)) {
                                                                                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.apply_sbhl_mapping_function(link_node);
                                                                            }
                                                                            if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                                                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_apply_unwind_function(list(node, link_node));
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_72, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1, thread);
                                $sbhl_module$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Modifier: Steps of NODE's marked accessible links. Does not unmark
     */
    @LispMethod(comment = "Modifier: Steps of NODE\'s marked accessible links. Does not unmark")
    public static SubLObject sbhl_step_and_suspend_unmark(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        SubLObject rest;
        SubLObject module_var;
        SubLObject _prev_bind_0;
        SubLObject _prev_bind_2;
        SubLObject node_$55;
        SubLObject d_link;
        SubLObject mt_links;
        SubLObject iteration_state;
        SubLObject mt;
        SubLObject tv_links;
        SubLObject _prev_bind_0_$56;
        SubLObject iteration_state_$57;
        SubLObject tv;
        SubLObject link_nodes;
        SubLObject _prev_bind_0_$57;
        SubLObject sol;
        SubLObject set_contents_var;
        SubLObject basis_object;
        SubLObject state;
        SubLObject link_node;
        SubLObject csome_list_var;
        SubLObject link_node2;
        SubLObject new_list;
        SubLObject rest_$59;
        SubLObject generating_fn;
        SubLObject _prev_bind_0_$58;
        SubLObject sol2;
        SubLObject link_nodes2;
        SubLObject set_contents_var2;
        SubLObject basis_object2;
        SubLObject state2;
        SubLObject link_node3;
        SubLObject csome_list_var2;
        SubLObject link_node4;
        for (rest = NIL, rest = accessible_modules; (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != rest); rest = rest.rest()) {
            module_var = rest.first();
            _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            _prev_bind_2 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                node_$55 = function_terms.naut_to_nart(node);
                if (NIL != sbhl_link_vars.sbhl_node_object_p(node_$55)) {
                    d_link = sbhl_graphs.get_sbhl_graph_link(node_$55, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                    if (NIL != d_link) {
                        mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                        if (NIL != mt_links) {
                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                thread.resetMultipleValues();
                                mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                    _prev_bind_0_$56 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                    try {
                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                        for (iteration_state_$57 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$57)); iteration_state_$57 = dictionary_contents.do_dictionary_contents_next(iteration_state_$57)) {
                                            thread.resetMultipleValues();
                                            tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$57);
                                            link_nodes = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                _prev_bind_0_$57 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                try {
                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                    sol = link_nodes;
                                                    if (NIL != set.set_p(sol)) {
                                                        set_contents_var = set.do_set_internal(sol);
                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                            link_node = set_contents.do_set_contents_next(basis_object, state);
                                                            if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                                if (NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(link_node, UNPROVIDED)) {
                                                                    apply_sbhl_mapping_function(link_node);
                                                                }
                                                                if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                                    sbhl_apply_unwind_function(list(node, link_node));
                                                                }
                                                            }
                                                        }
                                                    } else
                                                        if (sol.isList()) {
                                                            if (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                                                                csome_list_var = sol;
                                                                link_node2 = NIL;
                                                                link_node2 = csome_list_var.first();
                                                                while ((NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var)) {
                                                                    if (NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(link_node2, UNPROVIDED)) {
                                                                        apply_sbhl_mapping_function(link_node2);
                                                                    }
                                                                    if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                                        sbhl_apply_unwind_function(list(node, link_node2));
                                                                    }
                                                                    csome_list_var = csome_list_var.rest();
                                                                    link_node2 = csome_list_var.first();
                                                                } 
                                                            }
                                                        } else {
                                                            Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                        }

                                                } finally {
                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$57, thread);
                                                }
                                            }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$57);
                                    } finally {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$56, thread);
                                    }
                                }
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                    } else {
                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str43$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                } else
                    if (NIL != obsolete.cnat_p(node_$55, UNPROVIDED)) {
                        new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                        for (rest_$59 = NIL, rest_$59 = new_list; (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != rest_$59); rest_$59 = rest_$59.rest()) {
                            generating_fn = rest_$59.first();
                            _prev_bind_0_$58 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                            try {
                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                link_nodes2 = sol2 = funcall(generating_fn, node_$55);
                                if (NIL != set.set_p(sol2)) {
                                    set_contents_var2 = set.do_set_internal(sol2);
                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                        link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                        if (NIL != set_contents.do_set_contents_element_validP(state2, link_node3)) {
                                            if (NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(link_node3, UNPROVIDED)) {
                                                apply_sbhl_mapping_function(link_node3);
                                            }
                                            if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                sbhl_apply_unwind_function(list(node, link_node3));
                                            }
                                        }
                                    }
                                } else
                                    if (sol2.isList()) {
                                        if (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                                            csome_list_var2 = sol2;
                                            link_node4 = NIL;
                                            link_node4 = csome_list_var2.first();
                                            while ((NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var2)) {
                                                if (NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(link_node4, UNPROVIDED)) {
                                                    apply_sbhl_mapping_function(link_node4);
                                                }
                                                if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                    sbhl_apply_unwind_function(list(node, link_node4));
                                                }
                                                csome_list_var2 = csome_list_var2.rest();
                                                link_node4 = csome_list_var2.first();
                                            } 
                                        }
                                    } else {
                                        Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                    }

                            } finally {
                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$58, thread);
                            }
                        }
                    }

            } finally {
                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    /**
     * Modifier: Steps over NODE's accessible unmarked links, testing their markings and subsequently marking them. Applies sbhl-mapping-function.
     */
    @LispMethod(comment = "Modifier: Steps over NODE\'s accessible unmarked links, testing their markings and subsequently marking them. Applies sbhl-mapping-function.")
    public static final SubLObject sbhl_step_and_mark_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(get_sbhl_module(UNPROVIDED));
                SubLObject rest = NIL;
                for (rest = accessible_modules; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest)); rest = rest.rest()) {
                    {
                        SubLObject module_var = rest.first();
                        {
                            SubLObject _prev_bind_0 = $sbhl_module$.currentBinding(thread);
                            SubLObject _prev_bind_1 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                $sbhl_module$.bind(module_var, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                {
                                    SubLObject node_75 = function_terms.naut_to_nart(node);
                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node_75)) {
                                        {
                                            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_75, get_sbhl_module(UNPROVIDED));
                                            if (NIL != d_link) {
                                                {
                                                    SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), get_sbhl_module(UNPROVIDED));
                                                    if (NIL != mt_links) {
                                                        {
                                                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                            while (!((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                thread.resetMultipleValues();
                                                                {
                                                                    SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        {
                                                                            SubLObject _prev_bind_0_76 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                {
                                                                                    SubLObject iteration_state_77 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                    while (!((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_77)))) {
                                                                                        thread.resetMultipleValues();
                                                                                        {
                                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_77);
                                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_78 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                        {
                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                            SubLObject rest_79 = NIL;
                                                                                                            for (rest_79 = new_list; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest_79)); rest_79 = rest_79.rest()) {
                                                                                                                {
                                                                                                                    SubLObject link_node = rest_79.first();
                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(link_node, UNPROVIDED)) {
                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(link_node, UNPROVIDED);
                                                                                                                        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.apply_sbhl_mapping_function(link_node);
                                                                                                                    }
                                                                                                                    if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                                                                                        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_apply_unwind_function(list(node, link_node));
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } finally {
                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_78, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            iteration_state_77 = dictionary_contents.do_dictionary_contents_next(iteration_state_77);
                                                                                        }
                                                                                    } 
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_77);
                                                                                }
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_76, thread);
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
                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt42$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                        }
                                        if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node_75, get_sbhl_module(UNPROVIDED))) {
                                            if (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                                                {
                                                    SubLObject csome_list_var = sbhl_link_methods.non_fort_instance_table_lookup(node_75);
                                                    SubLObject instance_tuple = NIL;
                                                    for (instance_tuple = csome_list_var.first(); !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , instance_tuple = csome_list_var.first()) {
                                                        {
                                                            SubLObject datum = instance_tuple;
                                                            SubLObject current = datum;
                                                            SubLObject link_node = NIL;
                                                            SubLObject mt = NIL;
                                                            SubLObject tv = NIL;
                                                            destructuring_bind_must_consp(current, datum, $list_alt43);
                                                            link_node = current.first();
                                                            current = current.rest();
                                                            destructuring_bind_must_consp(current, datum, $list_alt43);
                                                            mt = current.first();
                                                            current = current.rest();
                                                            destructuring_bind_must_consp(current, datum, $list_alt43);
                                                            tv = current.first();
                                                            current = current.rest();
                                                            if (NIL == current) {
                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                    {
                                                                        SubLObject _prev_bind_0_80 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_81 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        {
                                                                                            SubLObject link_nodes = list(link_node);
                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                            SubLObject rest_82 = NIL;
                                                                                            for (rest_82 = new_list; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest_82)); rest_82 = rest_82.rest()) {
                                                                                                {
                                                                                                    SubLObject link_node_83 = rest_82.first();
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(link_node_83, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(link_node_83, UNPROVIDED);
                                                                                                        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.apply_sbhl_mapping_function(link_node_83);
                                                                                                    }
                                                                                                    if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                                                                        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_apply_unwind_function(list(node, link_node_83));
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_81, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_80, thread);
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                cdestructuring_bind_error(datum, $list_alt43);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        if (NIL != obsolete.cnat_p(node_75, UNPROVIDED)) {
                                            {
                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED));
                                                SubLObject rest_84 = NIL;
                                                for (rest_84 = new_list; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest_84)); rest_84 = rest_84.rest()) {
                                                    {
                                                        SubLObject generating_fn = rest_84.first();
                                                        {
                                                            SubLObject _prev_bind_0_85 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                {
                                                                    SubLObject link_nodes = funcall(generating_fn, node_75);
                                                                    SubLObject new_list_86 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                    SubLObject rest_87 = NIL;
                                                                    for (rest_87 = new_list_86; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest_87)); rest_87 = rest_87.rest()) {
                                                                        {
                                                                            SubLObject link_node = rest_87.first();
                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(link_node, UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(link_node, UNPROVIDED);
                                                                                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.apply_sbhl_mapping_function(link_node);
                                                                            }
                                                                            if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                                                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_apply_unwind_function(list(node, link_node));
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_85, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1, thread);
                                $sbhl_module$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Modifier: Steps over NODE's accessible unmarked links, testing their markings and subsequently marking them. Applies sbhl-mapping-function.
     */
    @LispMethod(comment = "Modifier: Steps over NODE\'s accessible unmarked links, testing their markings and subsequently marking them. Applies sbhl-mapping-function.")
    public static SubLObject sbhl_step_and_mark(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        SubLObject rest;
        SubLObject module_var;
        SubLObject _prev_bind_0;
        SubLObject _prev_bind_2;
        SubLObject node_$61;
        SubLObject d_link;
        SubLObject mt_links;
        SubLObject iteration_state;
        SubLObject mt;
        SubLObject tv_links;
        SubLObject _prev_bind_0_$62;
        SubLObject iteration_state_$63;
        SubLObject tv;
        SubLObject link_nodes;
        SubLObject _prev_bind_0_$63;
        SubLObject sol;
        SubLObject set_contents_var;
        SubLObject basis_object;
        SubLObject state;
        SubLObject link_node;
        SubLObject csome_list_var;
        SubLObject link_node2;
        SubLObject csome_list_var2;
        SubLObject instance_tuple;
        SubLObject current;
        SubLObject datum;
        SubLObject link_node3;
        SubLObject mt2;
        SubLObject tv2;
        SubLObject _prev_bind_0_$64;
        SubLObject _prev_bind_0_$65;
        SubLObject link_nodes2;
        SubLObject link_node_$67;
        SubLObject csome_list_var_$68;
        SubLObject link_node_$68;
        SubLObject new_list;
        SubLObject rest_$70;
        SubLObject generating_fn;
        SubLObject _prev_bind_0_$66;
        SubLObject sol2;
        SubLObject link_nodes3;
        SubLObject set_contents_var2;
        SubLObject basis_object2;
        SubLObject state2;
        SubLObject link_node4;
        SubLObject csome_list_var3;
        SubLObject link_node5;
        for (rest = NIL, rest = accessible_modules; (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != rest); rest = rest.rest()) {
            module_var = rest.first();
            _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            _prev_bind_2 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                node_$61 = function_terms.naut_to_nart(node);
                if (NIL != sbhl_link_vars.sbhl_node_object_p(node_$61)) {
                    d_link = sbhl_graphs.get_sbhl_graph_link(node_$61, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                    if (NIL != d_link) {
                        mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                        if (NIL != mt_links) {
                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                thread.resetMultipleValues();
                                mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                    _prev_bind_0_$62 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                    try {
                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                        for (iteration_state_$63 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$63)); iteration_state_$63 = dictionary_contents.do_dictionary_contents_next(iteration_state_$63)) {
                                            thread.resetMultipleValues();
                                            tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$63);
                                            link_nodes = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                _prev_bind_0_$63 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                try {
                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                    sol = link_nodes;
                                                    if (NIL != set.set_p(sol)) {
                                                        set_contents_var = set.do_set_internal(sol);
                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                            link_node = set_contents.do_set_contents_next(basis_object, state);
                                                            if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(link_node, UNPROVIDED)) {
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(link_node, UNPROVIDED);
                                                                    apply_sbhl_mapping_function(link_node);
                                                                }
                                                                if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                                    sbhl_apply_unwind_function(list(node, link_node));
                                                                }
                                                            }
                                                        }
                                                    } else
                                                        if (sol.isList()) {
                                                            if (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                                                                csome_list_var = sol;
                                                                link_node2 = NIL;
                                                                link_node2 = csome_list_var.first();
                                                                while ((NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var)) {
                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(link_node2, UNPROVIDED)) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(link_node2, UNPROVIDED);
                                                                        apply_sbhl_mapping_function(link_node2);
                                                                    }
                                                                    if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                                        sbhl_apply_unwind_function(list(node, link_node2));
                                                                    }
                                                                    csome_list_var = csome_list_var.rest();
                                                                    link_node2 = csome_list_var.first();
                                                                } 
                                                            }
                                                        } else {
                                                            Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                        }

                                                } finally {
                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$63, thread);
                                                }
                                            }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$63);
                                    } finally {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$62, thread);
                                    }
                                }
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                    } else {
                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str43$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    if ((NIL != sbhl_macros.do_sbhl_non_fort_linksP(node_$61, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) && (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread))) {
                        csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node_$61);
                        instance_tuple = NIL;
                        instance_tuple = csome_list_var2.first();
                        while ((NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var2)) {
                            datum = current = instance_tuple;
                            link_node3 = NIL;
                            mt2 = NIL;
                            tv2 = NIL;
                            destructuring_bind_must_consp(current, datum, $list44);
                            link_node3 = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list44);
                            mt2 = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list44);
                            tv2 = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                    _prev_bind_0_$64 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                    try {
                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                            _prev_bind_0_$65 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                            try {
                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                link_nodes2 = sol = list(link_node3);
                                                if (NIL != set.set_p(sol)) {
                                                    set_contents_var = set.do_set_internal(sol);
                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                        link_node_$67 = set_contents.do_set_contents_next(basis_object, state);
                                                        if (NIL != set_contents.do_set_contents_element_validP(state, link_node_$67)) {
                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(link_node_$67, UNPROVIDED)) {
                                                                sbhl_marking_utilities.sbhl_mark_node_marked(link_node_$67, UNPROVIDED);
                                                                apply_sbhl_mapping_function(link_node_$67);
                                                            }
                                                            if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                                sbhl_apply_unwind_function(list(node, link_node_$67));
                                                            }
                                                        }
                                                    }
                                                } else
                                                    if (sol.isList()) {
                                                        if (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                                                            csome_list_var_$68 = sol;
                                                            link_node_$68 = NIL;
                                                            link_node_$68 = csome_list_var_$68.first();
                                                            while ((NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var_$68)) {
                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(link_node_$68, UNPROVIDED)) {
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(link_node_$68, UNPROVIDED);
                                                                    apply_sbhl_mapping_function(link_node_$68);
                                                                }
                                                                if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                                    sbhl_apply_unwind_function(list(node, link_node_$68));
                                                                }
                                                                csome_list_var_$68 = csome_list_var_$68.rest();
                                                                link_node_$68 = csome_list_var_$68.first();
                                                            } 
                                                        }
                                                    } else {
                                                        Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                    }

                                            } finally {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$65, thread);
                                            }
                                        }
                                    } finally {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$64, thread);
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list44);
                            }
                            csome_list_var2 = csome_list_var2.rest();
                            instance_tuple = csome_list_var2.first();
                        } 
                    }
                } else
                    if (NIL != obsolete.cnat_p(node_$61, UNPROVIDED)) {
                        new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                        for (rest_$70 = NIL, rest_$70 = new_list; (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != rest_$70); rest_$70 = rest_$70.rest()) {
                            generating_fn = rest_$70.first();
                            _prev_bind_0_$66 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                            try {
                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                link_nodes3 = sol2 = funcall(generating_fn, node_$61);
                                if (NIL != set.set_p(sol2)) {
                                    set_contents_var2 = set.do_set_internal(sol2);
                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                        link_node4 = set_contents.do_set_contents_next(basis_object2, state2);
                                        if (NIL != set_contents.do_set_contents_element_validP(state2, link_node4)) {
                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(link_node4, UNPROVIDED)) {
                                                sbhl_marking_utilities.sbhl_mark_node_marked(link_node4, UNPROVIDED);
                                                apply_sbhl_mapping_function(link_node4);
                                            }
                                            if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                sbhl_apply_unwind_function(list(node, link_node4));
                                            }
                                        }
                                    }
                                } else
                                    if (sol2.isList()) {
                                        if (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                                            csome_list_var3 = sol2;
                                            link_node5 = NIL;
                                            link_node5 = csome_list_var3.first();
                                            while ((NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var3)) {
                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(link_node5, UNPROVIDED)) {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked(link_node5, UNPROVIDED);
                                                    apply_sbhl_mapping_function(link_node5);
                                                }
                                                if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                    sbhl_apply_unwind_function(list(node, link_node5));
                                                }
                                                csome_list_var3 = csome_list_var3.rest();
                                                link_node5 = csome_list_var3.first();
                                            } 
                                        }
                                    } else {
                                        Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                    }

                            } finally {
                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$66, thread);
                            }
                        }
                    }

            } finally {
                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    /**
     * Modifier: Steps over NODE's accessible marked links, testing their marking and subsequently unmarking them. Applies sbhl-mapping-function.
     */
    @LispMethod(comment = "Modifier: Steps over NODE\'s accessible marked links, testing their marking and subsequently unmarking them. Applies sbhl-mapping-function.")
    public static final SubLObject sbhl_step_and_unmark_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(get_sbhl_module(UNPROVIDED));
                SubLObject rest = NIL;
                for (rest = accessible_modules; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest)); rest = rest.rest()) {
                    {
                        SubLObject module_var = rest.first();
                        {
                            SubLObject _prev_bind_0 = $sbhl_module$.currentBinding(thread);
                            SubLObject _prev_bind_1 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                $sbhl_module$.bind(module_var, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                {
                                    SubLObject node_88 = function_terms.naut_to_nart(node);
                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node_88)) {
                                        {
                                            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_88, get_sbhl_module(UNPROVIDED));
                                            if (NIL != d_link) {
                                                {
                                                    SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), get_sbhl_module(UNPROVIDED));
                                                    if (NIL != mt_links) {
                                                        {
                                                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                            while (!((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                thread.resetMultipleValues();
                                                                {
                                                                    SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        {
                                                                            SubLObject _prev_bind_0_89 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                {
                                                                                    SubLObject iteration_state_90 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                    while (!((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_90)))) {
                                                                                        thread.resetMultipleValues();
                                                                                        {
                                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_90);
                                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_91 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                        {
                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                            SubLObject rest_92 = NIL;
                                                                                                            for (rest_92 = new_list; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest_92)); rest_92 = rest_92.rest()) {
                                                                                                                {
                                                                                                                    SubLObject link_node = rest_92.first();
                                                                                                                    if (NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(link_node, UNPROVIDED)) {
                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_unmarked(link_node, UNPROVIDED);
                                                                                                                        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.apply_sbhl_mapping_function(link_node);
                                                                                                                    }
                                                                                                                    if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                                                                                        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_apply_unwind_function(list(node, link_node));
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } finally {
                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_91, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            iteration_state_90 = dictionary_contents.do_dictionary_contents_next(iteration_state_90);
                                                                                        }
                                                                                    } 
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_90);
                                                                                }
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_89, thread);
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
                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt42$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                        }
                                    } else {
                                        if (NIL != obsolete.cnat_p(node_88, UNPROVIDED)) {
                                            {
                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED));
                                                SubLObject rest_93 = NIL;
                                                for (rest_93 = new_list; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest_93)); rest_93 = rest_93.rest()) {
                                                    {
                                                        SubLObject generating_fn = rest_93.first();
                                                        {
                                                            SubLObject _prev_bind_0_94 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                {
                                                                    SubLObject link_nodes = funcall(generating_fn, node_88);
                                                                    SubLObject new_list_95 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                    SubLObject rest_96 = NIL;
                                                                    for (rest_96 = new_list_95; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest_96)); rest_96 = rest_96.rest()) {
                                                                        {
                                                                            SubLObject link_node = rest_96.first();
                                                                            if (NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(link_node, UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_unmarked(link_node, UNPROVIDED);
                                                                                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.apply_sbhl_mapping_function(link_node);
                                                                            }
                                                                            if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                                                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_apply_unwind_function(list(node, link_node));
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_94, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1, thread);
                                $sbhl_module$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Modifier: Steps over NODE's accessible marked links, testing their marking and subsequently unmarking them. Applies sbhl-mapping-function.
     */
    @LispMethod(comment = "Modifier: Steps over NODE\'s accessible marked links, testing their marking and subsequently unmarking them. Applies sbhl-mapping-function.")
    public static SubLObject sbhl_step_and_unmark(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        SubLObject rest;
        SubLObject module_var;
        SubLObject _prev_bind_0;
        SubLObject _prev_bind_2;
        SubLObject node_$72;
        SubLObject d_link;
        SubLObject mt_links;
        SubLObject iteration_state;
        SubLObject mt;
        SubLObject tv_links;
        SubLObject _prev_bind_0_$73;
        SubLObject iteration_state_$74;
        SubLObject tv;
        SubLObject link_nodes;
        SubLObject _prev_bind_0_$74;
        SubLObject sol;
        SubLObject set_contents_var;
        SubLObject basis_object;
        SubLObject state;
        SubLObject link_node;
        SubLObject csome_list_var;
        SubLObject link_node2;
        SubLObject new_list;
        SubLObject rest_$76;
        SubLObject generating_fn;
        SubLObject _prev_bind_0_$75;
        SubLObject sol2;
        SubLObject link_nodes2;
        SubLObject set_contents_var2;
        SubLObject basis_object2;
        SubLObject state2;
        SubLObject link_node3;
        SubLObject csome_list_var2;
        SubLObject link_node4;
        for (rest = NIL, rest = accessible_modules; (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != rest); rest = rest.rest()) {
            module_var = rest.first();
            _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            _prev_bind_2 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                node_$72 = function_terms.naut_to_nart(node);
                if (NIL != sbhl_link_vars.sbhl_node_object_p(node_$72)) {
                    d_link = sbhl_graphs.get_sbhl_graph_link(node_$72, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                    if (NIL != d_link) {
                        mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                        if (NIL != mt_links) {
                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                thread.resetMultipleValues();
                                mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                    _prev_bind_0_$73 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                    try {
                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                        for (iteration_state_$74 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$74)); iteration_state_$74 = dictionary_contents.do_dictionary_contents_next(iteration_state_$74)) {
                                            thread.resetMultipleValues();
                                            tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$74);
                                            link_nodes = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                _prev_bind_0_$74 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                try {
                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                    sol = link_nodes;
                                                    if (NIL != set.set_p(sol)) {
                                                        set_contents_var = set.do_set_internal(sol);
                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                            link_node = set_contents.do_set_contents_next(basis_object, state);
                                                            if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                                if (NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(link_node, UNPROVIDED)) {
                                                                    sbhl_marking_utilities.sbhl_mark_node_unmarked(link_node, UNPROVIDED);
                                                                    apply_sbhl_mapping_function(link_node);
                                                                }
                                                                if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                                    sbhl_apply_unwind_function(list(node, link_node));
                                                                }
                                                            }
                                                        }
                                                    } else
                                                        if (sol.isList()) {
                                                            if (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                                                                csome_list_var = sol;
                                                                link_node2 = NIL;
                                                                link_node2 = csome_list_var.first();
                                                                while ((NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var)) {
                                                                    if (NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(link_node2, UNPROVIDED)) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_unmarked(link_node2, UNPROVIDED);
                                                                        apply_sbhl_mapping_function(link_node2);
                                                                    }
                                                                    if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                                        sbhl_apply_unwind_function(list(node, link_node2));
                                                                    }
                                                                    csome_list_var = csome_list_var.rest();
                                                                    link_node2 = csome_list_var.first();
                                                                } 
                                                            }
                                                        } else {
                                                            Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                        }

                                                } finally {
                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$74, thread);
                                                }
                                            }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$74);
                                    } finally {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$73, thread);
                                    }
                                }
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                    } else {
                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str43$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                } else
                    if (NIL != obsolete.cnat_p(node_$72, UNPROVIDED)) {
                        new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                        for (rest_$76 = NIL, rest_$76 = new_list; (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != rest_$76); rest_$76 = rest_$76.rest()) {
                            generating_fn = rest_$76.first();
                            _prev_bind_0_$75 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                            try {
                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                link_nodes2 = sol2 = funcall(generating_fn, node_$72);
                                if (NIL != set.set_p(sol2)) {
                                    set_contents_var2 = set.do_set_internal(sol2);
                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                        link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                        if (NIL != set_contents.do_set_contents_element_validP(state2, link_node3)) {
                                            if (NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(link_node3, UNPROVIDED)) {
                                                sbhl_marking_utilities.sbhl_mark_node_unmarked(link_node3, UNPROVIDED);
                                                apply_sbhl_mapping_function(link_node3);
                                            }
                                            if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                sbhl_apply_unwind_function(list(node, link_node3));
                                            }
                                        }
                                    }
                                } else
                                    if (sol2.isList()) {
                                        if (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                                            csome_list_var2 = sol2;
                                            link_node4 = NIL;
                                            link_node4 = csome_list_var2.first();
                                            while ((NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var2)) {
                                                if (NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(link_node4, UNPROVIDED)) {
                                                    sbhl_marking_utilities.sbhl_mark_node_unmarked(link_node4, UNPROVIDED);
                                                    apply_sbhl_mapping_function(link_node4);
                                                }
                                                if (NIL != sbhl_search_vars.sbhl_apply_unwind_function_p()) {
                                                    sbhl_apply_unwind_function(list(node, link_node4));
                                                }
                                                csome_list_var2 = csome_list_var2.rest();
                                                link_node4 = csome_list_var2.first();
                                            } 
                                        }
                                    } else {
                                        Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                    }

                            } finally {
                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$75, thread);
                            }
                        }
                    }

            } finally {
                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    /**
     * Takes MODULE, TV, LINK-DIRECTION, SPACE, and MAP-FN parameter and binds them for the execution of @sbhl-mark-and-sweep, as applied to NODE.
     */
    @LispMethod(comment = "Takes MODULE, TV, LINK-DIRECTION, SPACE, and MAP-FN parameter and binds them for the execution of @sbhl-mark-and-sweep, as applied to NODE.")
    public static final SubLObject sbhl_sweep_alt(SubLObject module, SubLObject link_direction, SubLObject tv, SubLObject space, SubLObject map_fn, SubLObject node, SubLObject unmarkingP) {
        if (unmarkingP == UNPROVIDED) {
            unmarkingP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
            if (NIL != unmarkingP) {
                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_unmark_sweep(module, link_direction, tv, space, map_fn, node);
            } else {
                {
                    SubLObject _prev_bind_0 = $sbhl_module$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                    SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    SubLObject _prev_bind_4 = sbhl_search_vars.$sbhl_map_function$.currentBinding(thread);
                    try {
                        $sbhl_module$.bind(module, thread);
                        sbhl_search_vars.$sbhl_tv$.bind(tv, thread);
                        sbhl_link_vars.$sbhl_link_direction$.bind(link_direction, thread);
                        sbhl_marking_vars.$sbhl_space$.bind(space, thread);
                        sbhl_search_vars.$sbhl_map_function$.bind(map_fn, thread);
                        if (NIL != sbhl_module_utilities.sbhl_time_search_p()) {
                            com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_time_mark_and_sweep(node);
                        } else {
                            com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_mark_and_sweep(node);
                        }
                    } finally {
                        sbhl_search_vars.$sbhl_map_function$.rebind(_prev_bind_4, thread);
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_3, thread);
                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_1, thread);
                        $sbhl_module$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Takes MODULE, TV, LINK-DIRECTION, SPACE, and MAP-FN parameter and binds them for the execution of @sbhl-mark-and-sweep, as applied to NODE.
     */
    @LispMethod(comment = "Takes MODULE, TV, LINK-DIRECTION, SPACE, and MAP-FN parameter and binds them for the execution of @sbhl-mark-and-sweep, as applied to NODE.")
    public static SubLObject sbhl_sweep(final SubLObject module, final SubLObject link_direction, final SubLObject tv, final SubLObject space, final SubLObject map_fn, final SubLObject node, SubLObject unmarkingP) {
        if (unmarkingP == UNPROVIDED) {
            unmarkingP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        if (NIL != unmarkingP) {
            sbhl_unmark_sweep(module, link_direction, tv, space, map_fn, node);
        } else {
            final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
            final SubLObject _prev_bind_3 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
            final SubLObject _prev_bind_4 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            final SubLObject _prev_bind_5 = sbhl_search_vars.$sbhl_map_function$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(module, thread);
                sbhl_search_vars.$sbhl_tv$.bind(tv, thread);
                sbhl_link_vars.$sbhl_link_direction$.bind(link_direction, thread);
                sbhl_marking_vars.$sbhl_space$.bind(space, thread);
                sbhl_search_vars.$sbhl_map_function$.bind(map_fn, thread);
                if (NIL != sbhl_module_utilities.sbhl_time_search_p()) {
                    sbhl_time_mark_and_sweep(node);
                } else {
                    sbhl_mark_and_sweep(node);
                }
            } finally {
                sbhl_search_vars.$sbhl_map_function$.rebind(_prev_bind_5, thread);
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_4, thread);
                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_3, thread);
                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_2, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }/**
     * Takes MODULE, TV, LINK-DIRECTION, SPACE, and MAP-FN parameter and binds them for the execution of @sbhl-mark-and-sweep, as applied to NODE.
     */


    /**
     * Takes MODULE, TV, LINK-DIRECTION, SPACE, and MAP-FN parameter and binds them for the execution of @sbhl-unmark-and-sweep, as applied to NODE.
     */
    @LispMethod(comment = "Takes MODULE, TV, LINK-DIRECTION, SPACE, and MAP-FN parameter and binds them for the execution of @sbhl-unmark-and-sweep, as applied to NODE.")
    public static final SubLObject sbhl_unmark_sweep_alt(SubLObject module, SubLObject link_direction, SubLObject tv, SubLObject space, SubLObject map_fn, SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
            {
                SubLObject _prev_bind_0 = $sbhl_module$.currentBinding(thread);
                SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                SubLObject _prev_bind_2 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                SubLObject _prev_bind_4 = sbhl_search_vars.$sbhl_map_function$.currentBinding(thread);
                SubLObject _prev_bind_5 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                try {
                    $sbhl_module$.bind(module, thread);
                    sbhl_search_vars.$sbhl_tv$.bind(tv, thread);
                    sbhl_link_vars.$sbhl_link_direction$.bind(link_direction, thread);
                    sbhl_marking_vars.$sbhl_space$.bind(space, thread);
                    sbhl_search_vars.$sbhl_map_function$.bind(map_fn, thread);
                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(sbhl_search_vars.$sbhl_search_parent_marking$.getDynamicValue(thread), thread);
                    sbhl_search_vars.set_sbhl_search_parent_marking(sbhl_marking_utilities.sbhl_marked_with(node, UNPROVIDED));
                    com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_unmark_and_sweep(node);
                } finally {
                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_5, thread);
                    sbhl_search_vars.$sbhl_map_function$.rebind(_prev_bind_4, thread);
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_3, thread);
                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_1, thread);
                    $sbhl_module$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    /**
     * Takes MODULE, TV, LINK-DIRECTION, SPACE, and MAP-FN parameter and binds them for the execution of @sbhl-unmark-and-sweep, as applied to NODE.
     */
    @LispMethod(comment = "Takes MODULE, TV, LINK-DIRECTION, SPACE, and MAP-FN parameter and binds them for the execution of @sbhl-unmark-and-sweep, as applied to NODE.")
    public static SubLObject sbhl_unmark_sweep(final SubLObject module, final SubLObject link_direction, final SubLObject tv, final SubLObject space, final SubLObject map_fn, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_search_vars.$sbhl_map_function$.currentBinding(thread);
        final SubLObject _prev_bind_6 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_tv$.bind(tv, thread);
            sbhl_link_vars.$sbhl_link_direction$.bind(link_direction, thread);
            sbhl_marking_vars.$sbhl_space$.bind(space, thread);
            sbhl_search_vars.$sbhl_map_function$.bind(map_fn, thread);
            sbhl_search_vars.$sbhl_search_parent_marking$.bind(sbhl_search_vars.$sbhl_search_parent_marking$.getDynamicValue(thread), thread);
            sbhl_search_vars.set_sbhl_search_parent_marking(sbhl_marking_utilities.sbhl_marked_with(node, UNPROVIDED));
            sbhl_unmark_and_sweep(node);
        } finally {
            sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_6, thread);
            sbhl_search_vars.$sbhl_map_function$.rebind(_prev_bind_5, thread);
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_4, thread);
            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }/**
     * Takes MODULE, TV, LINK-DIRECTION, SPACE, and MAP-FN parameter and binds them for the execution of @sbhl-unmark-and-sweep, as applied to NODE.
     */


    /**
     * Takes MODULE, TV, LINK-DIRECTION, SPACE, and MAP-FN parameter and binds them for the execution of @sbhl-mark-and-sweep, as applied to NODE.
     */
    @LispMethod(comment = "Takes MODULE, TV, LINK-DIRECTION, SPACE, and MAP-FN parameter and binds them for the execution of @sbhl-mark-and-sweep, as applied to NODE.")
    public static final SubLObject sbhl_sweep_and_unwind_alt(SubLObject module, SubLObject link_direction, SubLObject tv, SubLObject space, SubLObject map_fn, SubLObject node, SubLObject unmarkingP) {
        if (unmarkingP == UNPROVIDED) {
            unmarkingP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
            if (NIL != unmarkingP) {
                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_unmark_sweep(module, link_direction, tv, space, map_fn, node);
            } else {
                {
                    SubLObject _prev_bind_0 = $sbhl_module$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                    SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    SubLObject _prev_bind_4 = sbhl_search_vars.$sbhl_map_function$.currentBinding(thread);
                    try {
                        $sbhl_module$.bind(module, thread);
                        sbhl_search_vars.$sbhl_tv$.bind(tv, thread);
                        sbhl_link_vars.$sbhl_link_direction$.bind(link_direction, thread);
                        sbhl_marking_vars.$sbhl_space$.bind(space, thread);
                        sbhl_search_vars.$sbhl_map_function$.bind(map_fn, thread);
                        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_mark_sweep_and_unwind(node);
                    } finally {
                        sbhl_search_vars.$sbhl_map_function$.rebind(_prev_bind_4, thread);
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_3, thread);
                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_1, thread);
                        $sbhl_module$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Takes MODULE, TV, LINK-DIRECTION, SPACE, and MAP-FN parameter and binds them for the execution of @sbhl-mark-and-sweep, as applied to NODE.
     */
    @LispMethod(comment = "Takes MODULE, TV, LINK-DIRECTION, SPACE, and MAP-FN parameter and binds them for the execution of @sbhl-mark-and-sweep, as applied to NODE.")
    public static SubLObject sbhl_sweep_and_unwind(final SubLObject module, final SubLObject link_direction, final SubLObject tv, final SubLObject space, final SubLObject map_fn, final SubLObject node, SubLObject unmarkingP) {
        if (unmarkingP == UNPROVIDED) {
            unmarkingP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        if (NIL != unmarkingP) {
            sbhl_unmark_sweep(module, link_direction, tv, space, map_fn, node);
        } else {
            final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
            final SubLObject _prev_bind_3 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
            final SubLObject _prev_bind_4 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            final SubLObject _prev_bind_5 = sbhl_search_vars.$sbhl_map_function$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(module, thread);
                sbhl_search_vars.$sbhl_tv$.bind(tv, thread);
                sbhl_link_vars.$sbhl_link_direction$.bind(link_direction, thread);
                sbhl_marking_vars.$sbhl_space$.bind(space, thread);
                sbhl_search_vars.$sbhl_map_function$.bind(map_fn, thread);
                sbhl_mark_sweep_and_unwind(node);
            } finally {
                sbhl_search_vars.$sbhl_map_function$.rebind(_prev_bind_5, thread);
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_4, thread);
                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_3, thread);
                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_2, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }/**
     * Takes MODULE, TV, LINK-DIRECTION, SPACE, and MAP-FN parameter and binds them for the execution of @sbhl-mark-and-sweep, as applied to NODE.
     */


    /**
     * Takes MODULE, TV, LINK-DIRECTION, SPACE, and MAP-FN parameter and binds them for the execution of @sbhl-step-and-mark, as applied to NODE.
     */
    @LispMethod(comment = "Takes MODULE, TV, LINK-DIRECTION, SPACE, and MAP-FN parameter and binds them for the execution of @sbhl-step-and-mark, as applied to NODE.")
    public static final SubLObject sbhl_step_alt(SubLObject module, SubLObject link_direction, SubLObject tv, SubLObject space, SubLObject map_fn, SubLObject node, SubLObject suspend_marking_p, SubLObject suspend_test_p) {
        if (suspend_marking_p == UNPROVIDED) {
            suspend_marking_p = NIL;
        }
        if (suspend_test_p == UNPROVIDED) {
            suspend_test_p = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
            {
                SubLObject _prev_bind_0 = $sbhl_module$.currentBinding(thread);
                SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                SubLObject _prev_bind_2 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                SubLObject _prev_bind_4 = sbhl_search_vars.$sbhl_map_function$.currentBinding(thread);
                try {
                    $sbhl_module$.bind(module, thread);
                    sbhl_search_vars.$sbhl_tv$.bind(tv, thread);
                    sbhl_link_vars.$sbhl_link_direction$.bind(link_direction, thread);
                    sbhl_marking_vars.$sbhl_space$.bind(space, thread);
                    sbhl_search_vars.$sbhl_map_function$.bind(map_fn, thread);
                    if (NIL != suspend_marking_p) {
                        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_step_and_suspend_mark(node, suspend_test_p);
                    } else {
                        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_step_and_mark(node);
                    }
                } finally {
                    sbhl_search_vars.$sbhl_map_function$.rebind(_prev_bind_4, thread);
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_3, thread);
                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_1, thread);
                    $sbhl_module$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    /**
     * Takes MODULE, TV, LINK-DIRECTION, SPACE, and MAP-FN parameter and binds them for the execution of @sbhl-step-and-mark, as applied to NODE.
     */
    @LispMethod(comment = "Takes MODULE, TV, LINK-DIRECTION, SPACE, and MAP-FN parameter and binds them for the execution of @sbhl-step-and-mark, as applied to NODE.")
    public static SubLObject sbhl_step(final SubLObject module, final SubLObject link_direction, final SubLObject tv, final SubLObject space, final SubLObject map_fn, final SubLObject node, SubLObject suspend_marking_p, SubLObject suspend_test_p) {
        if (suspend_marking_p == UNPROVIDED) {
            suspend_marking_p = NIL;
        }
        if (suspend_test_p == UNPROVIDED) {
            suspend_test_p = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_search_vars.$sbhl_map_function$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_tv$.bind(tv, thread);
            sbhl_link_vars.$sbhl_link_direction$.bind(link_direction, thread);
            sbhl_marking_vars.$sbhl_space$.bind(space, thread);
            sbhl_search_vars.$sbhl_map_function$.bind(map_fn, thread);
            if (NIL != suspend_marking_p) {
                sbhl_step_and_suspend_mark(node, suspend_test_p);
            } else {
                sbhl_step_and_mark(node);
            }
        } finally {
            sbhl_search_vars.$sbhl_map_function$.rebind(_prev_bind_5, thread);
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_4, thread);
            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }/**
     * Takes MODULE, TV, LINK-DIRECTION, SPACE, and MAP-FN parameter and binds them for the execution of @sbhl-step-and-mark, as applied to NODE.
     */


    public static final SubLObject sbhl_step_through_alt(SubLObject module, SubLObject link_direction, SubLObject tv, SubLObject space, SubLObject map_fn, SubLObject node) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_step(module, link_direction, tv, space, map_fn, node, T, T);
        return NIL;
    }

    public static SubLObject sbhl_step_through(final SubLObject module, final SubLObject link_direction, final SubLObject tv, final SubLObject space, final SubLObject map_fn, final SubLObject node) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        sbhl_step(module, link_direction, tv, space, map_fn, node, T, T);
        return NIL;
    }

    public static final SubLObject sbhl_step_and_test_alt(SubLObject module, SubLObject link_direction, SubLObject tv, SubLObject space, SubLObject map_fn, SubLObject node, SubLObject unmarkingP) {
        if (unmarkingP == UNPROVIDED) {
            unmarkingP = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        if (NIL != unmarkingP) {
            com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_unmark_step(module, link_direction, tv, space, map_fn, node, T);
        } else {
            com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_step(module, link_direction, tv, space, map_fn, node, T, NIL);
        }
        return NIL;
    }

    public static SubLObject sbhl_step_and_test(final SubLObject module, final SubLObject link_direction, final SubLObject tv, final SubLObject space, final SubLObject map_fn, final SubLObject node, SubLObject unmarkingP) {
        if (unmarkingP == UNPROVIDED) {
            unmarkingP = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        if (NIL != unmarkingP) {
            sbhl_unmark_step(module, link_direction, tv, space, map_fn, node, T);
        } else {
            sbhl_step(module, link_direction, tv, space, map_fn, node, T, NIL);
        }
        return NIL;
    }

    public static final SubLObject sbhl_step_and_perform_marking_alt(SubLObject module, SubLObject link_direction, SubLObject tv, SubLObject space, SubLObject map_fn, SubLObject node, SubLObject unmarkingP) {
        if (unmarkingP == UNPROVIDED) {
            unmarkingP = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        if (NIL != unmarkingP) {
            com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_unmark_step(module, link_direction, tv, space, map_fn, node, UNPROVIDED);
        } else {
            com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_step(module, link_direction, tv, space, map_fn, node, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject sbhl_step_and_perform_marking(final SubLObject module, final SubLObject link_direction, final SubLObject tv, final SubLObject space, final SubLObject map_fn, final SubLObject node, SubLObject unmarkingP) {
        if (unmarkingP == UNPROVIDED) {
            unmarkingP = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        if (NIL != unmarkingP) {
            sbhl_unmark_step(module, link_direction, tv, space, map_fn, node, UNPROVIDED);
        } else {
            sbhl_step(module, link_direction, tv, space, map_fn, node, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Takes MODULE, TV, LINK-DIRECTION, SPACE, and MAP-FN parameter and binds them for the execution of @sbhl-step-and-unmark, as applied to NODE.
     */
    @LispMethod(comment = "Takes MODULE, TV, LINK-DIRECTION, SPACE, and MAP-FN parameter and binds them for the execution of @sbhl-step-and-unmark, as applied to NODE.")
    public static final SubLObject sbhl_unmark_step_alt(SubLObject module, SubLObject link_direction, SubLObject tv, SubLObject space, SubLObject map_fn, SubLObject node, SubLObject suspend_marking_p) {
        if (suspend_marking_p == UNPROVIDED) {
            suspend_marking_p = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
            {
                SubLObject _prev_bind_0 = $sbhl_module$.currentBinding(thread);
                SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                SubLObject _prev_bind_2 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                SubLObject _prev_bind_4 = sbhl_search_vars.$sbhl_map_function$.currentBinding(thread);
                SubLObject _prev_bind_5 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                try {
                    $sbhl_module$.bind(module, thread);
                    sbhl_search_vars.$sbhl_tv$.bind(tv, thread);
                    sbhl_link_vars.$sbhl_link_direction$.bind(link_direction, thread);
                    sbhl_marking_vars.$sbhl_space$.bind(space, thread);
                    sbhl_search_vars.$sbhl_map_function$.bind(map_fn, thread);
                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(sbhl_search_vars.$sbhl_search_parent_marking$.getDynamicValue(thread), thread);
                    sbhl_search_vars.set_sbhl_search_parent_marking(sbhl_marking_utilities.sbhl_marked_with(node, UNPROVIDED));
                    if (NIL != suspend_marking_p) {
                        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_step_and_suspend_unmark(node);
                    } else {
                        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_step_and_unmark(node);
                    }
                } finally {
                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_5, thread);
                    sbhl_search_vars.$sbhl_map_function$.rebind(_prev_bind_4, thread);
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_3, thread);
                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_1, thread);
                    $sbhl_module$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    /**
     * Takes MODULE, TV, LINK-DIRECTION, SPACE, and MAP-FN parameter and binds them for the execution of @sbhl-step-and-unmark, as applied to NODE.
     */
    @LispMethod(comment = "Takes MODULE, TV, LINK-DIRECTION, SPACE, and MAP-FN parameter and binds them for the execution of @sbhl-step-and-unmark, as applied to NODE.")
    public static SubLObject sbhl_unmark_step(final SubLObject module, final SubLObject link_direction, final SubLObject tv, final SubLObject space, final SubLObject map_fn, final SubLObject node, SubLObject suspend_marking_p) {
        if (suspend_marking_p == UNPROVIDED) {
            suspend_marking_p = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_search_vars.$sbhl_map_function$.currentBinding(thread);
        final SubLObject _prev_bind_6 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_tv$.bind(tv, thread);
            sbhl_link_vars.$sbhl_link_direction$.bind(link_direction, thread);
            sbhl_marking_vars.$sbhl_space$.bind(space, thread);
            sbhl_search_vars.$sbhl_map_function$.bind(map_fn, thread);
            sbhl_search_vars.$sbhl_search_parent_marking$.bind(sbhl_search_vars.$sbhl_search_parent_marking$.getDynamicValue(thread), thread);
            sbhl_search_vars.set_sbhl_search_parent_marking(sbhl_marking_utilities.sbhl_marked_with(node, UNPROVIDED));
            if (NIL != suspend_marking_p) {
                sbhl_step_and_suspend_unmark(node);
            } else {
                sbhl_step_and_unmark(node);
            }
        } finally {
            sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_6, thread);
            sbhl_search_vars.$sbhl_map_function$.rebind(_prev_bind_5, thread);
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_4, thread);
            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }/**
     * Takes MODULE, TV, LINK-DIRECTION, SPACE, and MAP-FN parameter and binds them for the execution of @sbhl-step-and-unmark, as applied to NODE.
     */


    /**
     *
     *
     * @unknown removes funcalls. Applies BEHAVIOR to NODE
     */
    @LispMethod(comment = "@unknown removes funcalls. Applies BEHAVIOR to NODE")
    public static final SubLObject apply_sbhl_search_behavior_alt(SubLObject behavior, SubLObject node) {
        {
            SubLObject pcase_var = behavior;
            if (pcase_var.eql(SBHL_SIMPLE_TRUE_SEARCH)) {
                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_simple_true_search(node);
            } else {
                if (pcase_var.eql(SBHL_SIMPLE_FALSE_SEARCH)) {
                    com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_simple_false_search(node);
                } else {
                    if (pcase_var.eql(SBHL_STEP_AND_SWEEP_WITH_TT_MODULE)) {
                        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_step_and_sweep_with_tt_module(node);
                    } else {
                        if (pcase_var.eql(SBHL_SWEEP_WITH_TT_MODULE_CARRY_STEP)) {
                            com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_sweep_with_tt_module_carry_step(node);
                        } else {
                            if (pcase_var.eql(SBHL_SWEEP_STEP_DISJOINS_AND_SWEEP_AGAIN)) {
                                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_sweep_step_disjoins_and_sweep_again(node);
                            } else {
                                if (pcase_var.eql(SBHL_SIMPLE_TRUE_SEARCH_AND_UNWIND)) {
                                    com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_simple_true_search_and_unwind(node);
                                } else {
                                    if (pcase_var.eql(SBHL_LEAF_INSTANCES_SWEEP)) {
                                        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_leaf_instances_sweep(node);
                                    } else {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt46$attempt_to_call_unsupported_sbhl_, behavior, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown removes funcalls. Applies BEHAVIOR to NODE
     */
    @LispMethod(comment = "@unknown removes funcalls. Applies BEHAVIOR to NODE")
    public static SubLObject apply_sbhl_search_behavior(final SubLObject behavior, final SubLObject node) {
        if (behavior.eql(SBHL_SIMPLE_TRUE_SEARCH)) {
            sbhl_simple_true_search(node);
        } else
            if (behavior.eql(SBHL_SIMPLE_FALSE_SEARCH)) {
                sbhl_simple_false_search(node);
            } else
                if (behavior.eql(SBHL_STEP_AND_SWEEP_WITH_TT_MODULE)) {
                    sbhl_step_and_sweep_with_tt_module(node);
                } else
                    if (behavior.eql(SBHL_SWEEP_WITH_TT_MODULE_CARRY_STEP)) {
                        sbhl_sweep_with_tt_module_carry_step(node);
                    } else
                        if (behavior.eql(SBHL_SWEEP_STEP_DISJOINS_AND_SWEEP_AGAIN)) {
                            sbhl_sweep_step_disjoins_and_sweep_again(node);
                        } else
                            if (behavior.eql(SBHL_SIMPLE_TRUE_SEARCH_AND_UNWIND)) {
                                sbhl_simple_true_search_and_unwind(node);
                            } else
                                if (behavior.eql(SBHL_LEAF_INSTANCES_SWEEP)) {
                                    sbhl_leaf_instances_sweep(node);
                                } else {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str47$attempt_to_call_unsupported_sbhl_, behavior, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }






        return NIL;
    }

    /**
     *
     *
     * @unknown removes funcalls. Applies sbhl-map-function to NODE. @see get-sbhl-map-function.
     */
    @LispMethod(comment = "@unknown removes funcalls. Applies sbhl-map-function to NODE. @see get-sbhl-map-function.")
    public static final SubLObject apply_sbhl_mapping_function_alt(SubLObject node) {
        {
            SubLObject map_fn = sbhl_search_vars.get_sbhl_map_function();
            SubLObject pcase_var = map_fn;
            if (pcase_var.eql(SBHL_CONSIDER_NODE)) {
                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_consider_node(node);
            } else {
                if (pcase_var.eql(SBHL_CONSIDER_UNMARKED_NODE)) {
                    com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_consider_unmarked_node(node);
                } else {
                    if (pcase_var.eql(SBHL_SWEEP_WITH_CARRYING_MODULE)) {
                        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_sweep_with_carrying_module(node);
                    } else {
                        if (pcase_var.eql(SBHL_STEP_WITH_CARRIED_MODULE)) {
                            com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_step_with_carried_module(node);
                        } else {
                            if (pcase_var.eql(SBHL_STEP_DISJOINS_AND_SWEEP_INHERITED)) {
                                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_step_disjoins_and_sweep_inherited(node);
                            } else {
                                if (pcase_var.eql(SBHL_SWEEP_INHERITED_DISJOINS)) {
                                    com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_sweep_inherited_disjoins(node);
                                } else {
                                    if (pcase_var.eql(SBHL_STEP_AND_CHECK_MARKINGS)) {
                                        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_step_and_check_markings(node);
                                    } else {
                                        if (pcase_var.eql(SBHL_STEP_FALSE_AND_SWEEP_OPPOSITE)) {
                                            com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_step_false_and_sweep_opposite(node);
                                        } else {
                                            if (pcase_var.eql(SBHL_SWEEP_OPPOSITE_FOR_FALSE)) {
                                                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_sweep_opposite_for_false(node);
                                            } else {
                                                if (pcase_var.eql(SBHL_CHECK_CUTOFF)) {
                                                    com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_check_cutoff(node);
                                                } else {
                                                    funcall(map_fn, node);
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
        return NIL;
    }

    /**
     *
     *
     * @unknown removes funcalls. Applies sbhl-map-function to NODE. @see get-sbhl-map-function.
     */
    @LispMethod(comment = "@unknown removes funcalls. Applies sbhl-map-function to NODE. @see get-sbhl-map-function.")
    public static SubLObject apply_sbhl_mapping_function(final SubLObject node) {
        final SubLObject pcase_var;
        final SubLObject map_fn = pcase_var = sbhl_search_vars.get_sbhl_map_function();
        if (pcase_var.eql(SBHL_CONSIDER_NODE)) {
            sbhl_consider_node(node);
        } else
            if (pcase_var.eql(SBHL_CONSIDER_UNMARKED_NODE)) {
                sbhl_consider_unmarked_node(node);
            } else
                if (pcase_var.eql(SBHL_SWEEP_WITH_CARRYING_MODULE)) {
                    sbhl_sweep_with_carrying_module(node);
                } else
                    if (pcase_var.eql(SBHL_STEP_WITH_CARRIED_MODULE)) {
                        sbhl_step_with_carried_module(node);
                    } else
                        if (pcase_var.eql(SBHL_STEP_DISJOINS_AND_SWEEP_INHERITED)) {
                            sbhl_step_disjoins_and_sweep_inherited(node);
                        } else
                            if (pcase_var.eql(SBHL_SWEEP_INHERITED_DISJOINS)) {
                                sbhl_sweep_inherited_disjoins(node);
                            } else
                                if (pcase_var.eql(SBHL_STEP_AND_CHECK_MARKINGS)) {
                                    sbhl_step_and_check_markings(node);
                                } else
                                    if (pcase_var.eql(SBHL_STEP_FALSE_AND_SWEEP_OPPOSITE)) {
                                        sbhl_step_false_and_sweep_opposite(node);
                                    } else
                                        if (pcase_var.eql(SBHL_SWEEP_OPPOSITE_FOR_FALSE)) {
                                            sbhl_sweep_opposite_for_false(node);
                                        } else
                                            if (pcase_var.eql(SBHL_CHECK_CUTOFF)) {
                                                sbhl_check_cutoff(node);
                                            } else {
                                                funcall(map_fn, node);
                                            }









        return NIL;
    }

    /**
     *
     *
     * @unknown removes funcalls. applies the *sbhl-unwind-function* to NODE.
     */
    @LispMethod(comment = "@unknown removes funcalls. applies the *sbhl-unwind-function* to NODE.")
    public static final SubLObject sbhl_apply_unwind_function_alt(SubLObject node) {
        {
            SubLObject unwind_fn = sbhl_search_vars.get_sbhl_unwind_function();
            SubLObject pcase_var = unwind_fn;
            if (pcase_var.eql(SBHL_PUSH_UNWIND_ONTO_RESULT)) {
                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_push_unwind_onto_result(node);
            } else {
                funcall(unwind_fn, node);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown removes funcalls. applies the *sbhl-unwind-function* to NODE.
     */
    @LispMethod(comment = "@unknown removes funcalls. applies the *sbhl-unwind-function* to NODE.")
    public static SubLObject sbhl_apply_unwind_function(final SubLObject node) {
        final SubLObject pcase_var;
        final SubLObject unwind_fn = pcase_var = sbhl_search_vars.get_sbhl_unwind_function();
        if (pcase_var.eql(SBHL_PUSH_UNWIND_ONTO_RESULT)) {
            sbhl_push_unwind_onto_result(node);
        } else {
            funcall(unwind_fn, node);
        }
        return NIL;
    }

    /**
     * Used for basic true searches. Applies @see sbhl-sweep, upon NODE with current search module, link direction corresponding to current search direction, with a true tv, in @see *sbhl-space*, with map-fn @see sbhl-consider-node.
     */
    @LispMethod(comment = "Used for basic true searches. Applies @see sbhl-sweep, upon NODE with current search module, link direction corresponding to current search direction, with a true tv, in @see *sbhl-space*, with map-fn @see sbhl-consider-node.")
    public static final SubLObject sbhl_simple_true_search_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_sweep(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), SBHL_CONSIDER_NODE, node, sbhl_search_vars.sbhl_unmarking_search_p());
            return NIL;
        }
    }

    /**
     * Used for basic true searches. Applies @see sbhl-sweep, upon NODE with current search module, link direction corresponding to current search direction, with a true tv, in @see *sbhl-space*, with map-fn @see sbhl-consider-node.
     */
    @LispMethod(comment = "Used for basic true searches. Applies @see sbhl-sweep, upon NODE with current search module, link direction corresponding to current search direction, with a true tv, in @see *sbhl-space*, with map-fn @see sbhl-consider-node.")
    public static SubLObject sbhl_simple_true_search(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_sweep(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), SBHL_CONSIDER_NODE, node, sbhl_search_vars.sbhl_unmarking_search_p());
        return NIL;
    }/**
     * Used for basic true searches. Applies @see sbhl-sweep, upon NODE with current search module, link direction corresponding to current search direction, with a true tv, in @see *sbhl-space*, with map-fn @see sbhl-consider-node.
     */


    /**
     * Used for basic searches that need special unwind.
     */
    @LispMethod(comment = "Used for basic searches that need special unwind.")
    public static final SubLObject sbhl_simple_true_search_and_unwind_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_sweep_and_unwind(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), SBHL_CONSIDER_NODE, node, sbhl_search_vars.sbhl_unmarking_search_p());
            return NIL;
        }
    }

    /**
     * Used for basic searches that need special unwind.
     */
    @LispMethod(comment = "Used for basic searches that need special unwind.")
    public static SubLObject sbhl_simple_true_search_and_unwind(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_sweep_and_unwind(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), SBHL_CONSIDER_NODE, node, sbhl_search_vars.sbhl_unmarking_search_p());
        return NIL;
    }/**
     * Used for basic searches that need special unwind.
     */


    /**
     * Used as first part of false searches; it gathers all nodes related by true predicate links that would carry a false relation to NODE. Applies @see sbhl-sweep, upon NODE with current search module, link direction corresponding to current search direction, with a true tv, in @see *sbhl-space*, with map-fn @see sbhl-step-false-and-sweep-opposite.
     */
    @LispMethod(comment = "Used as first part of false searches; it gathers all nodes related by true predicate links that would carry a false relation to NODE. Applies @see sbhl-sweep, upon NODE with current search module, link direction corresponding to current search direction, with a true tv, in @see *sbhl-space*, with map-fn @see sbhl-step-false-and-sweep-opposite.")
    public static final SubLObject sbhl_simple_false_search_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_sweep(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_opposite_link_direction(), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), SBHL_STEP_FALSE_AND_SWEEP_OPPOSITE, node, sbhl_search_vars.sbhl_unmarking_search_p());
            return NIL;
        }
    }

    /**
     * Used as first part of false searches; it gathers all nodes related by true predicate links that would carry a false relation to NODE. Applies @see sbhl-sweep, upon NODE with current search module, link direction corresponding to current search direction, with a true tv, in @see *sbhl-space*, with map-fn @see sbhl-step-false-and-sweep-opposite.
     */
    @LispMethod(comment = "Used as first part of false searches; it gathers all nodes related by true predicate links that would carry a false relation to NODE. Applies @see sbhl-sweep, upon NODE with current search module, link direction corresponding to current search direction, with a true tv, in @see *sbhl-space*, with map-fn @see sbhl-step-false-and-sweep-opposite.")
    public static SubLObject sbhl_simple_false_search(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_sweep(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_opposite_link_direction(), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), SBHL_STEP_FALSE_AND_SWEEP_OPPOSITE, node, sbhl_search_vars.sbhl_unmarking_search_p());
        return NIL;
    }/**
     * Used as first part of false searches; it gathers all nodes related by true predicate links that would carry a false relation to NODE. Applies @see sbhl-sweep, upon NODE with current search module, link direction corresponding to current search direction, with a true tv, in @see *sbhl-space*, with map-fn @see sbhl-step-false-and-sweep-opposite.
     */


    /**
     * Used as second part of false searches; it steps across false relations to NODE. Applies @see sbhl-step, upon NODE with current search module, current link direction, with a false tv, in @see *sbhl-gather-space*, with map-fn @see sweep-opposite-for-false.
     */
    @LispMethod(comment = "Used as second part of false searches; it steps across false relations to NODE. Applies @see sbhl-step, upon NODE with current search module, current link direction, with a false tv, in @see *sbhl-gather-space*, with map-fn @see sweep-opposite-for-false.")
    public static final SubLObject sbhl_step_false_and_sweep_opposite_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_step_and_test(sbhl_search_vars.get_sbhl_search_module(), sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_search_direction(), get_sbhl_module(UNPROVIDED)), sbhl_search_vars.sbhl_search_false_tv(), sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread), SBHL_SWEEP_OPPOSITE_FOR_FALSE, node, UNPROVIDED);
            return NIL;
        }
    }

    /**
     * Used as second part of false searches; it steps across false relations to NODE. Applies @see sbhl-step, upon NODE with current search module, current link direction, with a false tv, in @see *sbhl-gather-space*, with map-fn @see sweep-opposite-for-false.
     */
    @LispMethod(comment = "Used as second part of false searches; it steps across false relations to NODE. Applies @see sbhl-step, upon NODE with current search module, current link direction, with a false tv, in @see *sbhl-gather-space*, with map-fn @see sweep-opposite-for-false.")
    public static SubLObject sbhl_step_false_and_sweep_opposite(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_step_and_test(sbhl_search_vars.get_sbhl_search_module(), sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_search_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED)), sbhl_search_vars.sbhl_search_false_tv(), sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread), SBHL_SWEEP_OPPOSITE_FOR_FALSE, node, UNPROVIDED);
        return NIL;
    }/**
     * Used as second part of false searches; it steps across false relations to NODE. Applies @see sbhl-step, upon NODE with current search module, current link direction, with a false tv, in @see *sbhl-gather-space*, with map-fn @see sweep-opposite-for-false.
     */


    /**
     * Used as third part for false searches; it gathers all of the inherited false relations. Applies @see sbhl-sweep, upon NODE with current search module, link direction corresponding to the opposite of current link direction, with a true tv, in @see *sbhl-gather-space*, with map-fn @see sbhl-consider-node.
     */
    @LispMethod(comment = "Used as third part for false searches; it gathers all of the inherited false relations. Applies @see sbhl-sweep, upon NODE with current search module, link direction corresponding to the opposite of current link direction, with a true tv, in @see *sbhl-gather-space*, with map-fn @see sbhl-consider-node.")
    public static final SubLObject sbhl_sweep_opposite_for_false_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_sweep(sbhl_search_vars.get_sbhl_search_gather_module(), sbhl_link_vars.get_sbhl_opposite_link_direction(), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread), SBHL_CONSIDER_NODE, node, sbhl_search_vars.sbhl_unmarking_search_p());
            return NIL;
        }
    }

    /**
     * Used as third part for false searches; it gathers all of the inherited false relations. Applies @see sbhl-sweep, upon NODE with current search module, link direction corresponding to the opposite of current link direction, with a true tv, in @see *sbhl-gather-space*, with map-fn @see sbhl-consider-node.
     */
    @LispMethod(comment = "Used as third part for false searches; it gathers all of the inherited false relations. Applies @see sbhl-sweep, upon NODE with current search module, link direction corresponding to the opposite of current link direction, with a true tv, in @see *sbhl-gather-space*, with map-fn @see sbhl-consider-node.")
    public static SubLObject sbhl_sweep_opposite_for_false(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_sweep(sbhl_search_vars.get_sbhl_search_gather_module(), sbhl_link_vars.get_sbhl_opposite_link_direction(), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread), SBHL_CONSIDER_NODE, node, sbhl_search_vars.sbhl_unmarking_search_p());
        return NIL;
    }/**
     * Used as third part for false searches; it gathers all of the inherited false relations. Applies @see sbhl-sweep, upon NODE with current search module, link direction corresponding to the opposite of current link direction, with a true tv, in @see *sbhl-gather-space*, with map-fn @see sbhl-consider-node.
     */


    /**
     * Used for step part of step and sweep searches. Applies @see sbhl-step, upon NODE with current search module, link direction corresponding to current search direction, with @see *sbhl-tv*, in @see *sbhl-space*, with map-fn @see sbhl-sweep-with-carrying-module.
     */
    @LispMethod(comment = "Used for step part of step and sweep searches. Applies @see sbhl-step, upon NODE with current search module, link direction corresponding to current search direction, with @see *sbhl-tv*, in @see *sbhl-space*, with map-fn @see sbhl-sweep-with-carrying-module.")
    public static final SubLObject sbhl_step_and_sweep_with_tt_module_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_step_and_test(sbhl_search_vars.get_sbhl_search_module(), sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_search_direction(), get_sbhl_module(UNPROVIDED)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), SBHL_SWEEP_WITH_CARRYING_MODULE, node, UNPROVIDED);
            return NIL;
        }
    }

    /**
     * Used for step part of step and sweep searches. Applies @see sbhl-step, upon NODE with current search module, link direction corresponding to current search direction, with @see *sbhl-tv*, in @see *sbhl-space*, with map-fn @see sbhl-sweep-with-carrying-module.
     */
    @LispMethod(comment = "Used for step part of step and sweep searches. Applies @see sbhl-step, upon NODE with current search module, link direction corresponding to current search direction, with @see *sbhl-tv*, in @see *sbhl-space*, with map-fn @see sbhl-sweep-with-carrying-module.")
    public static SubLObject sbhl_step_and_sweep_with_tt_module(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_step_and_test(sbhl_search_vars.get_sbhl_search_module(), sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_search_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), SBHL_SWEEP_WITH_CARRYING_MODULE, node, UNPROVIDED);
        return NIL;
    }/**
     * Used for step part of step and sweep searches. Applies @see sbhl-step, upon NODE with current search module, link direction corresponding to current search direction, with @see *sbhl-tv*, in @see *sbhl-space*, with map-fn @see sbhl-sweep-with-carrying-module.
     */


    /**
     * Used for sweep part of step and sweep searches. Applies @see sbhl-sweep, upon NODE with current search transfers-through module, current link direction for inheriting true relations and opposite direction to link direction for inheriting false relations, with a true tv, in @see *sbhl-gather-space*, with map-fn @see sbhl-consider-node.
     */
    @LispMethod(comment = "Used for sweep part of step and sweep searches. Applies @see sbhl-sweep, upon NODE with current search transfers-through module, current link direction for inheriting true relations and opposite direction to link direction for inheriting false relations, with a true tv, in @see *sbhl-gather-space*, with map-fn @see sbhl-consider-node.")
    public static final SubLObject sbhl_sweep_with_carrying_module_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_sweep(sbhl_module_utilities.get_sbhl_transfers_through_module(get_sbhl_module(UNPROVIDED)), NIL != sbhl_search_vars.sbhl_true_search_p() ? ((SubLObject) (sbhl_link_vars.get_sbhl_link_direction())) : sbhl_link_vars.get_sbhl_opposite_link_direction(), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), SBHL_CONSIDER_NODE, node, sbhl_search_vars.sbhl_unmarking_search_p());
            return NIL;
        }
    }

    /**
     * Used for sweep part of step and sweep searches. Applies @see sbhl-sweep, upon NODE with current search transfers-through module, current link direction for inheriting true relations and opposite direction to link direction for inheriting false relations, with a true tv, in @see *sbhl-gather-space*, with map-fn @see sbhl-consider-node.
     */
    @LispMethod(comment = "Used for sweep part of step and sweep searches. Applies @see sbhl-sweep, upon NODE with current search transfers-through module, current link direction for inheriting true relations and opposite direction to link direction for inheriting false relations, with a true tv, in @see *sbhl-gather-space*, with map-fn @see sbhl-consider-node.")
    public static SubLObject sbhl_sweep_with_carrying_module(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_sweep(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), NIL != sbhl_search_vars.sbhl_true_search_p() ? sbhl_link_vars.get_sbhl_link_direction() : sbhl_link_vars.get_sbhl_opposite_link_direction(), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), SBHL_CONSIDER_NODE, node, sbhl_search_vars.sbhl_unmarking_search_p());
        return NIL;
    }/**
     * Used for sweep part of step and sweep searches. Applies @see sbhl-sweep, upon NODE with current search transfers-through module, current link direction for inheriting true relations and opposite direction to link direction for inheriting false relations, with a true tv, in @see *sbhl-gather-space*, with map-fn @see sbhl-consider-node.
     */


    /**
     * Used for sweep part of sweep and step searches. Applies @see sbhl-sweep, upon NODE with current transfers-through module, uses link direction corresponding to search direction for inheriting true relations and the opposite link direction for inheriting false relations, with a true tv, in @see *sbhl-space*, with map-fn @see sbhl-step-with-carried-module.
     */
    @LispMethod(comment = "Used for sweep part of sweep and step searches. Applies @see sbhl-sweep, upon NODE with current transfers-through module, uses link direction corresponding to search direction for inheriting true relations and the opposite link direction for inheriting false relations, with a true tv, in @see *sbhl-space*, with map-fn @see sbhl-step-with-carried-module.")
    public static final SubLObject sbhl_sweep_with_tt_module_carry_step_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_sweep(sbhl_module_utilities.get_sbhl_transfers_through_module(get_sbhl_module(UNPROVIDED)), NIL != sbhl_search_vars.sbhl_true_search_p() ? ((SubLObject) (sbhl_link_vars.get_sbhl_link_direction())) : sbhl_link_vars.get_sbhl_opposite_link_direction(), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), SBHL_STEP_WITH_CARRIED_MODULE, node, sbhl_search_vars.sbhl_unmarking_search_p());
            return NIL;
        }
    }

    /**
     * Used for sweep part of sweep and step searches. Applies @see sbhl-sweep, upon NODE with current transfers-through module, uses link direction corresponding to search direction for inheriting true relations and the opposite link direction for inheriting false relations, with a true tv, in @see *sbhl-space*, with map-fn @see sbhl-step-with-carried-module.
     */
    @LispMethod(comment = "Used for sweep part of sweep and step searches. Applies @see sbhl-sweep, upon NODE with current transfers-through module, uses link direction corresponding to search direction for inheriting true relations and the opposite link direction for inheriting false relations, with a true tv, in @see *sbhl-space*, with map-fn @see sbhl-step-with-carried-module.")
    public static SubLObject sbhl_sweep_with_tt_module_carry_step(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_sweep(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), NIL != sbhl_search_vars.sbhl_true_search_p() ? sbhl_link_vars.get_sbhl_link_direction() : sbhl_link_vars.get_sbhl_opposite_link_direction(), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), SBHL_STEP_WITH_CARRIED_MODULE, node, sbhl_search_vars.sbhl_unmarking_search_p());
        return NIL;
    }/**
     * Used for sweep part of sweep and step searches. Applies @see sbhl-sweep, upon NODE with current transfers-through module, uses link direction corresponding to search direction for inheriting true relations and the opposite link direction for inheriting false relations, with a true tv, in @see *sbhl-space*, with map-fn @see sbhl-step-with-carried-module.
     */


    /**
     * Used for step part of sweep and step searches. Applies @see sbhl-step, upon NODE with current search module, uses link direction for true relations and its opposite for false ones, with *sbhl-tv*, in @see *sbhl-gather-space*, with map-fn @see sbhl-consider-node.
     */
    @LispMethod(comment = "Used for step part of sweep and step searches. Applies @see sbhl-step, upon NODE with current search module, uses link direction for true relations and its opposite for false ones, with *sbhl-tv*, in @see *sbhl-gather-space*, with map-fn @see sbhl-consider-node.")
    public static final SubLObject sbhl_step_with_carried_module_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != sbhl_search_vars.sbhl_leaf_sample_search_p()) {
                queues.enqueue(node, sbhl_search_vars.$sbhl_current_leaf_queue$.getDynamicValue(thread));
            }
            com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_step_and_perform_marking(sbhl_search_vars.get_sbhl_search_module(), sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_search_direction(), get_sbhl_module(UNPROVIDED)), NIL != sbhl_search_vars.sbhl_true_search_p() ? ((SubLObject) (sbhl_search_vars.sbhl_search_true_tv())) : sbhl_search_vars.sbhl_search_false_tv(), sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread), SBHL_CONSIDER_NODE, node, sbhl_search_vars.sbhl_unmarking_search_p());
            return NIL;
        }
    }

    /**
     * Used for step part of sweep and step searches. Applies @see sbhl-step, upon NODE with current search module, uses link direction for true relations and its opposite for false ones, with *sbhl-tv*, in @see *sbhl-gather-space*, with map-fn @see sbhl-consider-node.
     */
    @LispMethod(comment = "Used for step part of sweep and step searches. Applies @see sbhl-step, upon NODE with current search module, uses link direction for true relations and its opposite for false ones, with *sbhl-tv*, in @see *sbhl-gather-space*, with map-fn @see sbhl-consider-node.")
    public static SubLObject sbhl_step_with_carried_module(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sbhl_search_vars.sbhl_leaf_sample_search_p()) {
            queues.enqueue(node, sbhl_search_vars.$sbhl_current_leaf_queue$.getDynamicValue(thread));
        }
        sbhl_step_and_perform_marking(sbhl_search_vars.get_sbhl_search_module(), sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_search_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED)), NIL != sbhl_search_vars.sbhl_true_search_p() ? sbhl_search_vars.sbhl_search_true_tv() : sbhl_search_vars.sbhl_search_false_tv(), sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread), SBHL_CONSIDER_NODE, node, sbhl_search_vars.sbhl_unmarking_search_p());
        return NIL;
    }/**
     * Used for step part of sweep and step searches. Applies @see sbhl-step, upon NODE with current search module, uses link direction for true relations and its opposite for false ones, with *sbhl-tv*, in @see *sbhl-gather-space*, with map-fn @see sbhl-consider-node.
     */


    /**
     * Used as first part of disjoins searches, or second part of boolean disjoins searches; it gathers all nodes related by true predicate links that would carry a disjoins relation to NODE. Applies @see sbhl-sweep, upon NODE with  module the disjoins transfers through, forward link direction corresponding to current search direction, with a true tv, in @see *sbhl-space*, with map-fn @see sbhl-step-disjoins-and-sweep-inherited.
     */
    @LispMethod(comment = "Used as first part of disjoins searches, or second part of boolean disjoins searches; it gathers all nodes related by true predicate links that would carry a disjoins relation to NODE. Applies @see sbhl-sweep, upon NODE with  module the disjoins transfers through, forward link direction corresponding to current search direction, with a true tv, in @see *sbhl-space*, with map-fn @see sbhl-step-disjoins-and-sweep-inherited.")
    public static final SubLObject sbhl_sweep_step_disjoins_and_sweep_again_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (((NIL != sbhl_search_vars.sbhl_true_search_p()) && (NIL != sbhl_search_vars.sbhl_boolean_search_p())) && ((NIL != com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_empty_extent_p(node)) || (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_goal_empty_extent_p()))) {
                if (NIL != sbhl_search_vars.sbhl_justification_search_p()) {
                    if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_goal_empty_extent_p()) {
                        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_set_empty_extent_justification(sbhl_search_vars.get_sbhl_goal_node());
                    } else {
                        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_set_empty_extent_justification(node);
                    }
                } else {
                    sbhl_search_vars.$sbhl_result$.setDynamicValue(T, thread);
                }
            } else {
                {
                    SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(get_sbhl_module(UNPROVIDED));
                    com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_sweep(tt_module, NIL != sbhl_search_vars.sbhl_true_search_p() ? ((SubLObject) (sbhl_module_utilities.get_sbhl_module_forward_direction(tt_module))) : sbhl_module_utilities.get_sbhl_module_backward_direction(tt_module), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), NIL != sbhl_search_vars.sbhl_true_search_p() ? ((SubLObject) (NIL != sbhl_search_vars.sbhl_boolean_search_p() ? ((SubLObject) (SBHL_STEP_AND_CHECK_MARKINGS)) : SBHL_STEP_DISJOINS_AND_SWEEP_INHERITED)) : SBHL_SWEEP_FORWARD_STEP_FALSE_DISJOINS_AND_SWEEP_FORWARD_NOTS, node, sbhl_search_vars.sbhl_unmarking_search_p());
                }
            }
            return NIL;
        }
    }

    /**
     * Used as first part of disjoins searches, or second part of boolean disjoins searches; it gathers all nodes related by true predicate links that would carry a disjoins relation to NODE. Applies @see sbhl-sweep, upon NODE with  module the disjoins transfers through, forward link direction corresponding to current search direction, with a true tv, in @see *sbhl-space*, with map-fn @see sbhl-step-disjoins-and-sweep-inherited.
     */
    @LispMethod(comment = "Used as first part of disjoins searches, or second part of boolean disjoins searches; it gathers all nodes related by true predicate links that would carry a disjoins relation to NODE. Applies @see sbhl-sweep, upon NODE with  module the disjoins transfers through, forward link direction corresponding to current search direction, with a true tv, in @see *sbhl-space*, with map-fn @see sbhl-step-disjoins-and-sweep-inherited.")
    public static SubLObject sbhl_sweep_step_disjoins_and_sweep_again(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != sbhl_search_vars.sbhl_true_search_p()) && (NIL != sbhl_search_vars.sbhl_boolean_search_p())) && ((NIL != sbhl_empty_extent_p(node)) || (NIL != sbhl_goal_empty_extent_p()))) {
            if (NIL != sbhl_search_vars.sbhl_justification_search_p()) {
                if (NIL != sbhl_goal_empty_extent_p()) {
                    sbhl_set_empty_extent_justification(sbhl_search_vars.get_sbhl_goal_node());
                } else {
                    sbhl_set_empty_extent_justification(node);
                }
            } else {
                sbhl_search_vars.$sbhl_result$.setDynamicValue(T, thread);
            }
        } else {
            final SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
            sbhl_sweep(tt_module, NIL != sbhl_search_vars.sbhl_true_search_p() ? sbhl_module_utilities.get_sbhl_module_forward_direction(tt_module) : sbhl_module_utilities.get_sbhl_module_backward_direction(tt_module), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), NIL != sbhl_search_vars.sbhl_true_search_p() ? NIL != sbhl_search_vars.sbhl_boolean_search_p() ? SBHL_STEP_AND_CHECK_MARKINGS : SBHL_STEP_DISJOINS_AND_SWEEP_INHERITED : SBHL_SWEEP_FORWARD_STEP_FALSE_DISJOINS_AND_SWEEP_FORWARD_NOTS, node, sbhl_search_vars.sbhl_unmarking_search_p());
        }
        return NIL;
    }/**
     * Used as first part of disjoins searches, or second part of boolean disjoins searches; it gathers all nodes related by true predicate links that would carry a disjoins relation to NODE. Applies @see sbhl-sweep, upon NODE with  module the disjoins transfers through, forward link direction corresponding to current search direction, with a true tv, in @see *sbhl-space*, with map-fn @see sbhl-step-disjoins-and-sweep-inherited.
     */


    /**
     * Used as second part of disjoins closure searches; it steps across disjoins relations to NODE. Applies @see sbhl-step, upon NODE with current search module, undirected link direction, with *sbhl-tv*, in @see *sbhl-gather-space*, with map-fn  @see sweep-inherited-disjoins.
     */
    @LispMethod(comment = "Used as second part of disjoins closure searches; it steps across disjoins relations to NODE. Applies @see sbhl-step, upon NODE with current search module, undirected link direction, with *sbhl-tv*, in @see *sbhl-gather-space*, with map-fn  @see sweep-inherited-disjoins.")
    public static final SubLObject sbhl_step_disjoins_and_sweep_inherited_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_step_and_test(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_undirected_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread), SBHL_SWEEP_INHERITED_DISJOINS, node, UNPROVIDED);
            return NIL;
        }
    }

    /**
     * Used as second part of disjoins closure searches; it steps across disjoins relations to NODE. Applies @see sbhl-step, upon NODE with current search module, undirected link direction, with *sbhl-tv*, in @see *sbhl-gather-space*, with map-fn  @see sweep-inherited-disjoins.
     */
    @LispMethod(comment = "Used as second part of disjoins closure searches; it steps across disjoins relations to NODE. Applies @see sbhl-step, upon NODE with current search module, undirected link direction, with *sbhl-tv*, in @see *sbhl-gather-space*, with map-fn  @see sweep-inherited-disjoins.")
    public static SubLObject sbhl_step_disjoins_and_sweep_inherited(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_step_and_test(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_undirected_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread), SBHL_SWEEP_INHERITED_DISJOINS, node, UNPROVIDED);
        return NIL;
    }/**
     * Used as second part of disjoins closure searches; it steps across disjoins relations to NODE. Applies @see sbhl-step, upon NODE with current search module, undirected link direction, with *sbhl-tv*, in @see *sbhl-gather-space*, with map-fn  @see sweep-inherited-disjoins.
     */


    /**
     * Used as third part of disjoins closure searches; it gathers all of the inherited disjoins relations. Applies @see sbhl-sweep, upon NODE with current module disjoins transfers through, forward link direction for true searches and backward link direction for false searches, with a true tv, in @see *sbhl-gather-space*, with map-fn @see sbhl-consider-node.
     */
    @LispMethod(comment = "Used as third part of disjoins closure searches; it gathers all of the inherited disjoins relations. Applies @see sbhl-sweep, upon NODE with current module disjoins transfers through, forward link direction for true searches and backward link direction for false searches, with a true tv, in @see *sbhl-gather-space*, with map-fn @see sbhl-consider-node.")
    public static final SubLObject sbhl_sweep_inherited_disjoins_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(get_sbhl_module(UNPROVIDED));
                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_sweep(tt_module, NIL != sbhl_search_vars.sbhl_true_search_p() ? ((SubLObject) (sbhl_module_utilities.get_sbhl_module_backward_direction(tt_module))) : sbhl_module_utilities.get_sbhl_module_forward_direction(tt_module), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread), SBHL_CONSIDER_NODE, node, sbhl_search_vars.sbhl_unmarking_search_p());
                return NIL;
            }
        }
    }

    /**
     * Used as third part of disjoins closure searches; it gathers all of the inherited disjoins relations. Applies @see sbhl-sweep, upon NODE with current module disjoins transfers through, forward link direction for true searches and backward link direction for false searches, with a true tv, in @see *sbhl-gather-space*, with map-fn @see sbhl-consider-node.
     */
    @LispMethod(comment = "Used as third part of disjoins closure searches; it gathers all of the inherited disjoins relations. Applies @see sbhl-sweep, upon NODE with current module disjoins transfers through, forward link direction for true searches and backward link direction for false searches, with a true tv, in @see *sbhl-gather-space*, with map-fn @see sbhl-consider-node.")
    public static SubLObject sbhl_sweep_inherited_disjoins(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        sbhl_sweep(tt_module, NIL != sbhl_search_vars.sbhl_true_search_p() ? sbhl_module_utilities.get_sbhl_module_backward_direction(tt_module) : sbhl_module_utilities.get_sbhl_module_forward_direction(tt_module), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread), SBHL_CONSIDER_NODE, node, sbhl_search_vars.sbhl_unmarking_search_p());
        return NIL;
    }/**
     * Used as third part of disjoins closure searches; it gathers all of the inherited disjoins relations. Applies @see sbhl-sweep, upon NODE with current module disjoins transfers through, forward link direction for true searches and backward link direction for false searches, with a true tv, in @see *sbhl-gather-space*, with map-fn @see sbhl-consider-node.
     */


    /**
     * Used as third part of disjoins boolean search; it steps across disjoins relations of NODE checking for link nodes marked in gather-space. Applies @see sbhl-step, upon NODE with current search module, undirected link direction, with *sbhl-tv*, in @see *sbhl-space*, with map-fn  @see sbhl-consider-any-node
     */
    @LispMethod(comment = "Used as third part of disjoins boolean search; it steps across disjoins relations of NODE checking for link nodes marked in gather-space. Applies @see sbhl-step, upon NODE with current search module, undirected link direction, with *sbhl-tv*, in @see *sbhl-space*, with map-fn  @see sbhl-consider-any-node")
    public static final SubLObject sbhl_step_and_check_markings_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_step_through(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_undirected_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), SBHL_CONSIDER_ANY_NODE, node);
            return NIL;
        }
    }

    /**
     * Used as third part of disjoins boolean search; it steps across disjoins relations of NODE checking for link nodes marked in gather-space. Applies @see sbhl-step, upon NODE with current search module, undirected link direction, with *sbhl-tv*, in @see *sbhl-space*, with map-fn  @see sbhl-consider-any-node
     */
    @LispMethod(comment = "Used as third part of disjoins boolean search; it steps across disjoins relations of NODE checking for link nodes marked in gather-space. Applies @see sbhl-step, upon NODE with current search module, undirected link direction, with *sbhl-tv*, in @see *sbhl-space*, with map-fn  @see sbhl-consider-any-node")
    public static SubLObject sbhl_step_and_check_markings(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_step_through(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_undirected_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), SBHL_CONSIDER_ANY_NODE, node);
        return NIL;
    }/**
     * Used as third part of disjoins boolean search; it steps across disjoins relations of NODE checking for link nodes marked in gather-space. Applies @see sbhl-step, upon NODE with current search module, undirected link direction, with *sbhl-tv*, in @see *sbhl-space*, with map-fn  @see sbhl-consider-any-node
     */


    public static final SubLObject sbhl_node_locally_disjoint_with_self_p_alt(SubLObject node) {
        {
            SubLObject links = sbhl_link_methods.sbhl_forward_true_link_nodes(sbhl_module_utilities.get_sbhl_disjoins_module(sbhl_search_vars.get_sbhl_search_module()), node, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject result = NIL;
            result = subl_promotions.memberP(node, links, UNPROVIDED, UNPROVIDED);
            return result;
        }
    }

    public static SubLObject sbhl_node_locally_disjoint_with_self_p(final SubLObject node) {
        final SubLObject links = sbhl_link_methods.sbhl_forward_true_link_nodes(sbhl_module_utilities.get_sbhl_disjoins_module(sbhl_search_vars.get_sbhl_search_module()), node, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject result = NIL;
        result = subl_promotions.memberP(node, links, UNPROVIDED, UNPROVIDED);
        return result;
    }

    public static final SubLObject sbhl_empty_extent_p_alt(SubLObject node) {
        return sbhl_search_methods.sbhl_gather_first_among_all_forward_true_nodes(sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(get_sbhl_module(UNPROVIDED)), node, SBHL_NODE_LOCALLY_DISJOINT_WITH_SELF_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sbhl_empty_extent_p(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == sbhl_search_methods.$sbhl_search_self_incompatibility_check_disabledP$.getDynamicValue(thread)) {
            return sbhl_search_methods.sbhl_gather_first_among_all_forward_true_nodes(sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), node, SBHL_NODE_LOCALLY_DISJOINT_WITH_SELF_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject sbhl_goal_empty_extent_p_alt() {
        {
            SubLObject goal = sbhl_search_vars.get_sbhl_goal_node();
            SubLObject goals = sbhl_search_vars.get_sbhl_goal_nodes();
            SubLObject doneP = NIL;
            if (NIL != goal) {
                return com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_empty_extent_p(goal);
            } else {
                if (NIL != goals) {
                    if (NIL == doneP) {
                        {
                            SubLObject csome_list_var = goals;
                            SubLObject node = NIL;
                            for (node = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , node = csome_list_var.first()) {
                                if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_empty_extent_p(node)) {
                                    doneP = T;
                                }
                            }
                        }
                    }
                    return doneP;
                } else {
                    return NIL;
                }
            }
        }
    }

    public static SubLObject sbhl_goal_empty_extent_p() {
        final SubLObject goal = sbhl_search_vars.get_sbhl_goal_node();
        final SubLObject goals = sbhl_search_vars.get_sbhl_goal_nodes();
        SubLObject doneP = NIL;
        if (NIL != goal) {
            return sbhl_empty_extent_p(goal);
        }
        if (NIL != goals) {
            if (NIL == doneP) {
                SubLObject csome_list_var = goals;
                SubLObject node = NIL;
                node = csome_list_var.first();
                while ((NIL == doneP) && (NIL != csome_list_var)) {
                    if (NIL != sbhl_empty_extent_p(node)) {
                        doneP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    node = csome_list_var.first();
                } 
            }
            return doneP;
        }
        return NIL;
    }

    /**
     * Used in false-disjoins searches while sweeping all backward nodes. From each it gathers the forward true closure and the local false disjoins and the closures from them.
     */
    @LispMethod(comment = "Used in false-disjoins searches while sweeping all backward nodes. From each it gathers the forward true closure and the local false disjoins and the closures from them.")
    public static final SubLObject sbhl_sweep_forward_step_false_disjoins_and_sweep_forward_nots_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(get_sbhl_module(UNPROVIDED));
                if (!((NIL != com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_empty_extent_p(node)) || (NIL == $assume_sbhl_extensions_nonempty$.getDynamicValue(thread)))) {
                    com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_sweep(tt_module, sbhl_module_utilities.get_sbhl_module_forward_direction(tt_module), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread), SBHL_CONSIDER_NODE, node, UNPROVIDED);
                }
            }
            com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_step_and_test(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_undirected_direction(), sbhl_search_vars.sbhl_search_false_tv(), sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread), SBHL_SWEEP_FORWARD_NOTS, node, UNPROVIDED);
            return NIL;
        }
    }

    /**
     * Used in false-disjoins searches while sweeping all backward nodes. From each it gathers the forward true closure and the local false disjoins and the closures from them.
     */
    @LispMethod(comment = "Used in false-disjoins searches while sweeping all backward nodes. From each it gathers the forward true closure and the local false disjoins and the closures from them.")
    public static SubLObject sbhl_sweep_forward_step_false_disjoins_and_sweep_forward_nots(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        if ((NIL == sbhl_empty_extent_p(node)) && (NIL != sbhl_module_vars.$assume_sbhl_extensions_nonempty$.getDynamicValue(thread))) {
            sbhl_sweep(tt_module, sbhl_module_utilities.get_sbhl_module_forward_direction(tt_module), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread), SBHL_CONSIDER_NODE, node, UNPROVIDED);
        }
        sbhl_step_and_test(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_undirected_direction(), sbhl_search_vars.sbhl_search_false_tv(), sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread), SBHL_SWEEP_FORWARD_NOTS, node, UNPROVIDED);
        return NIL;
    }/**
     * Used in false-disjoins searches while sweeping all backward nodes. From each it gathers the forward true closure and the local false disjoins and the closures from them.
     */


    /**
     * Gathers the forward closure proceeding from the false disjoins, in a false disjoins search.
     */
    @LispMethod(comment = "Gathers the forward closure proceeding from the false disjoins, in a false disjoins search.")
    public static final SubLObject sbhl_sweep_forward_nots_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(get_sbhl_module(UNPROVIDED));
                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_sweep(tt_module, sbhl_module_utilities.get_sbhl_module_forward_direction(tt_module), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread), SBHL_CONSIDER_NODE, node, UNPROVIDED);
            }
            return NIL;
        }
    }

    /**
     * Gathers the forward closure proceeding from the false disjoins, in a false disjoins search.
     */
    @LispMethod(comment = "Gathers the forward closure proceeding from the false disjoins, in a false disjoins search.")
    public static SubLObject sbhl_sweep_forward_nots(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        sbhl_sweep(tt_module, sbhl_module_utilities.get_sbhl_module_forward_direction(tt_module), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread), SBHL_CONSIDER_NODE, node, UNPROVIDED);
        return NIL;
    }/**
     * Gathers the forward closure proceeding from the false disjoins, in a false disjoins search.
     */


    /**
     * Used to gather the extremal disjoins. Sweeps the transfer through module and gathers asserted disjoins with @see sbhl-step-gather-disjoins.
     */
    @LispMethod(comment = "Used to gather the extremal disjoins. Sweeps the transfer through module and gathers asserted disjoins with @see sbhl-step-gather-disjoins.")
    public static final SubLObject sbhl_sweep_and_gather_disjoins_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(get_sbhl_module(UNPROVIDED));
                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_sweep(tt_module, NIL != sbhl_search_vars.sbhl_true_search_p() ? ((SubLObject) (sbhl_module_utilities.get_sbhl_module_forward_direction(tt_module))) : sbhl_module_utilities.get_sbhl_module_backward_direction(tt_module), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), SBHL_STEP_GATHER_DISJOINS, node, UNPROVIDED);
            }
            return NIL;
        }
    }

    /**
     * Used to gather the extremal disjoins. Sweeps the transfer through module and gathers asserted disjoins with @see sbhl-step-gather-disjoins.
     */
    @LispMethod(comment = "Used to gather the extremal disjoins. Sweeps the transfer through module and gathers asserted disjoins with @see sbhl-step-gather-disjoins.")
    public static SubLObject sbhl_sweep_and_gather_disjoins(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        sbhl_sweep(tt_module, NIL != sbhl_search_vars.sbhl_true_search_p() ? sbhl_module_utilities.get_sbhl_module_forward_direction(tt_module) : sbhl_module_utilities.get_sbhl_module_backward_direction(tt_module), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), SBHL_STEP_GATHER_DISJOINS, node, UNPROVIDED);
        return NIL;
    }/**
     * Used to gather the extremal disjoins. Sweeps the transfer through module and gathers asserted disjoins with @see sbhl-step-gather-disjoins.
     */


    /**
     * Steps and marks asserted disjoins of NODE. Used to gather extremal disjoins.
     */
    @LispMethod(comment = "Steps and marks asserted disjoins of NODE. Used to gather extremal disjoins.")
    public static final SubLObject sbhl_step_gather_disjoins_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_step_and_perform_marking(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_undirected_direction(), NIL != sbhl_search_vars.sbhl_true_search_p() ? ((SubLObject) (sbhl_search_vars.sbhl_search_true_tv())) : sbhl_search_vars.sbhl_search_false_tv(), sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread), SBHL_CONSIDER_NODE, node, sbhl_search_vars.sbhl_unmarking_search_p());
            return NIL;
        }
    }

    @LispMethod(comment = "Steps and marks asserted disjoins of NODE. Used to gather extremal disjoins.")
    public static SubLObject sbhl_step_gather_disjoins(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_step_and_perform_marking(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_undirected_direction(), NIL != sbhl_search_vars.sbhl_true_search_p() ? sbhl_search_vars.sbhl_search_true_tv() : sbhl_search_vars.sbhl_search_false_tv(), sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread), SBHL_CONSIDER_NODE, node, sbhl_search_vars.sbhl_unmarking_search_p());
        return NIL;
    }/**
     * Steps and marks asserted disjoins of NODE. Used to gather extremal disjoins.
     */


    /**
     * Used to return first found extremal disjoin. Sweeps the transfer through module and returns first asserted disjoins with @see sbhl-step-gather-first-disjoin.
     */
    @LispMethod(comment = "Used to return first found extremal disjoin. Sweeps the transfer through module and returns first asserted disjoins with @see sbhl-step-gather-first-disjoin.")
    public static final SubLObject sbhl_sweep_and_gather_first_disjoin_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(get_sbhl_module(UNPROVIDED));
                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_sweep(tt_module, NIL != sbhl_search_vars.sbhl_true_search_p() ? ((SubLObject) (sbhl_module_utilities.get_sbhl_module_forward_direction(tt_module))) : sbhl_module_utilities.get_sbhl_module_backward_direction(tt_module), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), SBHL_STEP_GATHER_FIRST_DISJOIN, node, UNPROVIDED);
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Used to return first found extremal disjoin. Sweeps the transfer through module and returns first asserted disjoins with @see sbhl-step-gather-first-disjoin.")
    public static SubLObject sbhl_sweep_and_gather_first_disjoin(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        sbhl_sweep(tt_module, NIL != sbhl_search_vars.sbhl_true_search_p() ? sbhl_module_utilities.get_sbhl_module_forward_direction(tt_module) : sbhl_module_utilities.get_sbhl_module_backward_direction(tt_module), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), SBHL_STEP_GATHER_FIRST_DISJOIN, node, UNPROVIDED);
        return NIL;
    }/**
     * Used to return first found extremal disjoin. Sweeps the transfer through module and returns first asserted disjoins with @see sbhl-step-gather-first-disjoin.
     */


    /**
     * Steps and gathers first found asserted disjoins of NODE.
     */
    @LispMethod(comment = "Steps and gathers first found asserted disjoins of NODE.")
    public static final SubLObject sbhl_step_gather_first_disjoin_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_step_and_perform_marking(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_undirected_direction(), NIL != sbhl_search_vars.sbhl_true_search_p() ? ((SubLObject) (sbhl_search_vars.sbhl_search_true_tv())) : sbhl_search_vars.sbhl_search_false_tv(), sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread), SBHL_CONSIDER_ANY_NODE, node, sbhl_search_vars.sbhl_unmarking_search_p());
            return NIL;
        }
    }

    @LispMethod(comment = "Steps and gathers first found asserted disjoins of NODE.")
    public static SubLObject sbhl_step_gather_first_disjoin(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_step_and_perform_marking(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_undirected_direction(), NIL != sbhl_search_vars.sbhl_true_search_p() ? sbhl_search_vars.sbhl_search_true_tv() : sbhl_search_vars.sbhl_search_false_tv(), sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread), SBHL_CONSIDER_ANY_NODE, node, sbhl_search_vars.sbhl_unmarking_search_p());
        return NIL;
    }/**
     * Steps and gathers first found asserted disjoins of NODE.
     */


    /**
     * Determines which sample leaf end behavior to use, based on whether search module is
     * transitive or transfers-through-transitive. Behavior may also change for when
     * DIFFERENT-LEAVES? is true.
     */
    @LispMethod(comment = "Determines which sample leaf end behavior to use, based on whether search module is\r\ntransitive or transfers-through-transitive. Behavior may also change for when\r\nDIFFERENT-LEAVES? is true.\nDetermines which sample leaf end behavior to use, based on whether search module is\ntransitive or transfers-through-transitive. Behavior may also change for when\nDIFFERENT-LEAVES? is true.")
    public static final SubLObject determine_sbhl_sample_leaf_consider_fn_alt(SubLObject different_leavesP) {
        if (different_leavesP == UNPROVIDED) {
            different_leavesP = NIL;
        }
        if (NIL != sbhl_module_utilities.sbhl_transitive_module_p(sbhl_search_vars.get_sbhl_search_module())) {
            return SBHL_GATHER_FIRST_DEAD_END_NODE_AND_ENQUEUE_OTHERS;
        } else {
            if (NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(sbhl_search_vars.get_sbhl_search_module())) {
                if (NIL != different_leavesP) {
                    return SBHL_GATHER_FIRST_TARGET_UNMARKED_NODE;
                } else {
                    return SBHL_GATHER_FIRST_NODE;
                }
            } else {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt65$invalid_module_type__a, sbhl_search_vars.get_sbhl_search_module(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Determines which sample leaf end behavior to use, based on whether search module is\r\ntransitive or transfers-through-transitive. Behavior may also change for when\r\nDIFFERENT-LEAVES? is true.\nDetermines which sample leaf end behavior to use, based on whether search module is\ntransitive or transfers-through-transitive. Behavior may also change for when\nDIFFERENT-LEAVES? is true.")
    public static SubLObject determine_sbhl_sample_leaf_consider_fn(SubLObject different_leavesP) {
        if (different_leavesP == UNPROVIDED) {
            different_leavesP = NIL;
        }
        if (NIL != sbhl_module_utilities.sbhl_transitive_module_p(sbhl_search_vars.get_sbhl_search_module())) {
            return SBHL_GATHER_FIRST_DEAD_END_NODE_AND_ENQUEUE_OTHERS;
        }
        if (NIL == sbhl_module_utilities.sbhl_transfers_through_module_p(sbhl_search_vars.get_sbhl_search_module())) {
            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str66$invalid_module_type__a, sbhl_search_vars.get_sbhl_search_module(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        if (NIL != different_leavesP) {
            return SBHL_GATHER_FIRST_TARGET_UNMARKED_NODE;
        }
        return SBHL_GATHER_FIRST_NODE;
    }/**
     * Determines which sample leaf end behavior to use, based on whether search module is
     * transitive or transfers-through-transitive. Behavior may also change for when
     * DIFFERENT-LEAVES? is true.
     */


    /**
     * Used during mapping for sample leaves. Store NODE in *sbhl-current-leaf-queue*
     */
    @LispMethod(comment = "Used during mapping for sample leaves. Store NODE in *sbhl-current-leaf-queue*")
    public static final SubLObject sbhl_enqueue_node_in_leaf_queue_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            queues.enqueue(node, sbhl_search_vars.$sbhl_current_leaf_queue$.getDynamicValue(thread));
            return NIL;
        }
    }

    @LispMethod(comment = "Used during mapping for sample leaves. Store NODE in *sbhl-current-leaf-queue*")
    public static SubLObject sbhl_enqueue_node_in_leaf_queue(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        queues.enqueue(node, sbhl_search_vars.$sbhl_current_leaf_queue$.getDynamicValue(thread));
        return NIL;
    }/**
     * Used during mapping for sample leaves. Store NODE in *sbhl-current-leaf-queue*
     */


    /**
     * Search behavior for @see sbhl-sample-leaf-instances.
     */
    @LispMethod(comment = "Search behavior for @see sbhl-sample-leaf-instances.")
    public static final SubLObject sbhl_leaf_instances_sweep_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_unwind_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_unwind_function$.bind(SBHL_LEAF_INSTANCES_STEP, thread);
                    sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind(T, thread);
                    com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_sweep_and_unwind(sbhl_module_utilities.get_sbhl_transfers_through_module(get_sbhl_module(UNPROVIDED)), sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), SBHL_ENQUEUE_NODE_IN_LEAF_QUEUE, node, NIL);
                } finally {
                    sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind(_prev_bind_1, thread);
                    sbhl_search_vars.$sbhl_unwind_function$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Search behavior for @see sbhl-sample-leaf-instances.")
    public static SubLObject sbhl_leaf_instances_sweep(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_unwind_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_unwind_function$.bind(SBHL_LEAF_INSTANCES_STEP, thread);
            sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind(T, thread);
            sbhl_sweep_and_unwind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), SBHL_ENQUEUE_NODE_IN_LEAF_QUEUE, node, NIL);
        } finally {
            sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_unwind_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }/**
     * Search behavior for @see sbhl-sample-leaf-instances.
     */


    /**
     * Mapping function that steps across instance links during sample leaf instances searches.
     */
    @LispMethod(comment = "Mapping function that steps across instance links during sample leaf instances searches.")
    public static final SubLObject sbhl_leaf_instances_step_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind(NIL, thread);
                    if (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_step_and_perform_marking(sbhl_search_vars.get_sbhl_search_module(), sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_search_direction(), get_sbhl_module(UNPROVIDED)), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread), SBHL_CONSIDER_NODE, node, NIL);
                        if (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                            queues.remlast_queue(sbhl_search_vars.$sbhl_current_leaf_queue$.getDynamicValue(thread));
                        }
                    }
                } finally {
                    sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Mapping function that steps across instance links during sample leaf instances searches.")
    public static SubLObject sbhl_leaf_instances_step(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind(NIL, thread);
            if (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                sbhl_step_and_perform_marking(sbhl_search_vars.get_sbhl_search_module(), sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_search_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED)), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread), SBHL_CONSIDER_NODE, node, NIL);
                if (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                    queues.remlast_queue(sbhl_search_vars.$sbhl_current_leaf_queue$.getDynamicValue(thread));
                }
            }
        } finally {
            sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }/**
     * Mapping function that steps across instance links during sample leaf instances searches.
     */


    public static final SubLObject sbhl_mark_and_sweep_extremal_independent_nodes_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != sbhl_marking_utilities.sbhl_generational_search_path_termination_p(node, UNPROVIDED)) {
                if ((NIL != sbhl_search_vars.sbhl_extremal_test_fn_p(node)) && (!sbhl_marking_utilities.sbhl_marking_generation(node, UNPROVIDED).numE(sbhl_marking_vars.get_sbhl_marking_generation()))) {
                    sbhl_marking_vars.increment_sbhl_marking_generation();
                }
            } else {
                sbhl_marking_utilities.sbhl_generational_mark_node_marked(node, UNPROVIDED);
                if (NIL != sbhl_search_vars.sbhl_extremal_test_fn_p(node)) {
                    {
                        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(get_sbhl_module(UNPROVIDED));
                        SubLObject rest = NIL;
                        for (rest = accessible_modules; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest)); rest = rest.rest()) {
                            {
                                SubLObject module_var = rest.first();
                                {
                                    SubLObject _prev_bind_0 = $sbhl_module$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        $sbhl_module$.bind(module_var, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                        {
                                            SubLObject node_97 = function_terms.naut_to_nart(node);
                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node_97)) {
                                                {
                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_97, get_sbhl_module(UNPROVIDED));
                                                    if (NIL != d_link) {
                                                        {
                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                {
                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                    while (!((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                        thread.resetMultipleValues();
                                                                        {
                                                                            SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_98 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                        {
                                                                                            SubLObject iteration_state_99 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                            while (!((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_99)))) {
                                                                                                thread.resetMultipleValues();
                                                                                                {
                                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_99);
                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                    thread.resetMultipleValues();
                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_100 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                            try {
                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                {
                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                    SubLObject rest_101 = NIL;
                                                                                                                    for (rest_101 = new_list; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest_101)); rest_101 = rest_101.rest()) {
                                                                                                                        {
                                                                                                                            SubLObject link_node = rest_101.first();
                                                                                                                            com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_mark_and_sweep_extremal_independent_nodes(link_node);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            } finally {
                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_100, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    iteration_state_99 = dictionary_contents.do_dictionary_contents_next(iteration_state_99);
                                                                                                }
                                                                                            } 
                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_99);
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_98, thread);
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
                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt42$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                }
                                            } else {
                                                if (NIL != obsolete.cnat_p(node_97, UNPROVIDED)) {
                                                    {
                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED));
                                                        SubLObject rest_102 = NIL;
                                                        for (rest_102 = new_list; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest_102)); rest_102 = rest_102.rest()) {
                                                            {
                                                                SubLObject generating_fn = rest_102.first();
                                                                {
                                                                    SubLObject _prev_bind_0_103 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        {
                                                                            SubLObject link_nodes = funcall(generating_fn, node_97);
                                                                            SubLObject new_list_104 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                            SubLObject rest_105 = NIL;
                                                                            for (rest_105 = new_list_104; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest_105)); rest_105 = rest_105.rest()) {
                                                                                {
                                                                                    SubLObject link_node = rest_105.first();
                                                                                    com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_mark_and_sweep_extremal_independent_nodes(link_node);
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_103, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1, thread);
                                        $sbhl_module$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                    if (sbhl_marking_utilities.sbhl_marking_generation(node, UNPROVIDED).numE(sbhl_marking_vars.get_sbhl_marking_generation())) {
                        sbhl_marking_vars.increment_sbhl_marking_generation();
                        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_apply_unwind_function(node);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject sbhl_mark_and_sweep_extremal_independent_nodes(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sbhl_marking_utilities.sbhl_generational_search_path_termination_p(node, UNPROVIDED)) {
            if ((NIL != sbhl_search_vars.sbhl_extremal_test_fn_p(node)) && (!sbhl_marking_utilities.sbhl_marking_generation(node, UNPROVIDED).numE(sbhl_marking_vars.get_sbhl_marking_generation()))) {
                sbhl_marking_vars.increment_sbhl_marking_generation();
            }
        } else {
            sbhl_marking_utilities.sbhl_generational_mark_node_marked(node, UNPROVIDED);
            if (NIL != sbhl_search_vars.sbhl_extremal_test_fn_p(node)) {
                final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                SubLObject rest;
                SubLObject module_var;
                SubLObject _prev_bind_0;
                SubLObject _prev_bind_2;
                SubLObject node_$78;
                SubLObject d_link;
                SubLObject mt_links;
                SubLObject iteration_state;
                SubLObject mt;
                SubLObject tv_links;
                SubLObject _prev_bind_0_$79;
                SubLObject iteration_state_$80;
                SubLObject tv;
                SubLObject link_nodes;
                SubLObject _prev_bind_0_$80;
                SubLObject sol;
                SubLObject set_contents_var;
                SubLObject basis_object;
                SubLObject state;
                SubLObject link_node;
                SubLObject csome_list_var;
                SubLObject link_node2;
                SubLObject new_list;
                SubLObject rest_$82;
                SubLObject generating_fn;
                SubLObject _prev_bind_0_$81;
                SubLObject sol2;
                SubLObject link_nodes2;
                SubLObject set_contents_var2;
                SubLObject basis_object2;
                SubLObject state2;
                SubLObject link_node3;
                SubLObject csome_list_var2;
                SubLObject link_node4;
                for (rest = NIL, rest = accessible_modules; (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != rest); rest = rest.rest()) {
                    module_var = rest.first();
                    _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    _prev_bind_2 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    try {
                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                        node_$78 = function_terms.naut_to_nart(node);
                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node_$78)) {
                            d_link = sbhl_graphs.get_sbhl_graph_link(node_$78, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                            if (NIL != d_link) {
                                mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                if (NIL != mt_links) {
                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                        thread.resetMultipleValues();
                                        mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                        tv_links = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                            _prev_bind_0_$79 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                            try {
                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                for (iteration_state_$80 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$80)); iteration_state_$80 = dictionary_contents.do_dictionary_contents_next(iteration_state_$80)) {
                                                    thread.resetMultipleValues();
                                                    tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$80);
                                                    link_nodes = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                        _prev_bind_0_$80 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                            sol = link_nodes;
                                                            if (NIL != set.set_p(sol)) {
                                                                set_contents_var = set.do_set_internal(sol);
                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                    link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                    if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                                        sbhl_mark_and_sweep_extremal_independent_nodes(link_node);
                                                                    }
                                                                }
                                                            } else
                                                                if (sol.isList()) {
                                                                    if (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                                                                        csome_list_var = sol;
                                                                        link_node2 = NIL;
                                                                        link_node2 = csome_list_var.first();
                                                                        while ((NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var)) {
                                                                            sbhl_mark_and_sweep_extremal_independent_nodes(link_node2);
                                                                            csome_list_var = csome_list_var.rest();
                                                                            link_node2 = csome_list_var.first();
                                                                        } 
                                                                    }
                                                                } else {
                                                                    Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                }

                                                        } finally {
                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$80, thread);
                                                        }
                                                    }
                                                }
                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$80);
                                            } finally {
                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$79, thread);
                                            }
                                        }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                }
                            } else {
                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str43$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } else
                            if (NIL != obsolete.cnat_p(node_$78, UNPROVIDED)) {
                                new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                for (rest_$82 = NIL, rest_$82 = new_list; (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != rest_$82); rest_$82 = rest_$82.rest()) {
                                    generating_fn = rest_$82.first();
                                    _prev_bind_0_$81 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                    try {
                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                        link_nodes2 = sol2 = funcall(generating_fn, node_$78);
                                        if (NIL != set.set_p(sol2)) {
                                            set_contents_var2 = set.do_set_internal(sol2);
                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                if (NIL != set_contents.do_set_contents_element_validP(state2, link_node3)) {
                                                    sbhl_mark_and_sweep_extremal_independent_nodes(link_node3);
                                                }
                                            }
                                        } else
                                            if (sol2.isList()) {
                                                if (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                                                    csome_list_var2 = sol2;
                                                    link_node4 = NIL;
                                                    link_node4 = csome_list_var2.first();
                                                    while ((NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var2)) {
                                                        sbhl_mark_and_sweep_extremal_independent_nodes(link_node4);
                                                        csome_list_var2 = csome_list_var2.rest();
                                                        link_node4 = csome_list_var2.first();
                                                    } 
                                                }
                                            } else {
                                                Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                            }

                                    } finally {
                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$81, thread);
                                    }
                                }
                            }

                    } finally {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2, thread);
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                    }
                }
                if (sbhl_marking_utilities.sbhl_marking_generation(node, UNPROVIDED).numE(sbhl_marking_vars.get_sbhl_marking_generation())) {
                    sbhl_marking_vars.increment_sbhl_marking_generation();
                    sbhl_apply_unwind_function(node);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject sbhl_min_backward_true_nodes_such_that_alt(SubLObject module, SubLObject node, SubLObject function, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    SubLObject _prev_bind_4 = $sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        $sbhl_module$.bind(module, thread);
                        {
                            SubLObject mt_var = mt;
                            {
                                SubLObject _prev_bind_0_106 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1_107 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2_108 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    {
                                        SubLObject tv_var = tv;
                                        {
                                            SubLObject _prev_bind_0_109 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1_110 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt70$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt70$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt70$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt75$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt70$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_111 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_112 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_113 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(get_sbhl_module(UNPROVIDED)), thread);
                                                        {
                                                            SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                                                            {
                                                                SubLObject _prev_bind_0_114 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                                try {
                                                                    sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                    {
                                                                        SubLObject _prev_bind_0_115 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                            {
                                                                                SubLObject _prev_bind_0_116 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                                                                SubLObject _prev_bind_1_117 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                                                                SubLObject _prev_bind_2_118 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                                SubLObject _prev_bind_3_119 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                                                                SubLObject _prev_bind_4_120 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                    {
                                                                                        SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                                                                        SubLObject needs_to_releaseP = NIL;
                                                                                        try {
                                                                                            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                                                                            result = com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_extremal_independent_nodes_such_that(node, function);
                                                                                        } finally {
                                                                                            if (NIL != needs_to_releaseP) {
                                                                                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_120, thread);
                                                                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_119, thread);
                                                                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_118, thread);
                                                                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_117, thread);
                                                                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_116, thread);
                                                                                }
                                                                            }
                                                                            if (source == $RESOURCE) {
                                                                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                            }
                                                                        } finally {
                                                                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_115, thread);
                                                                        }
                                                                    }
                                                                    if (source == $RESOURCE) {
                                                                        sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                                    }
                                                                } finally {
                                                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_114, thread);
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_113, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_112, thread);
                                                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_111, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_110, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_109, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_108, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_107, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_106, thread);
                                }
                            }
                        }
                    } finally {
                        $sbhl_module$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject sbhl_min_backward_true_nodes_such_that(final SubLObject module, final SubLObject node, final SubLObject function, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$84 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$85 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2_$86 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject tv_var = tv;
                final SubLObject _prev_bind_0_$85 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_1_$86 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str71$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str71$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str71$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str76$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str71$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$86 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$87 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$87 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                        final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                        final SubLObject _prev_bind_0_$87 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$88 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                final SubLObject _prev_bind_0_$89 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$88 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$88 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_3_$97 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_4_$98 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                    SubLObject needs_to_releaseP = NIL;
                                    try {
                                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                        result = sbhl_extremal_independent_nodes_such_that(node, function);
                                    } finally {
                                        if (NIL != needs_to_releaseP) {
                                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$98, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$97, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$88, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$88, thread);
                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$89, thread);
                                }
                                if (source == $RESOURCE) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$88, thread);
                            }
                            if (source == $RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$87, thread);
                        }
                    } finally {
                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$87, thread);
                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$87, thread);
                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$86, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$86, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$85, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$86, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$85, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$84, thread);
            }
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject sbhl_extremal_independent_nodes_such_that_alt(SubLObject node, SubLObject function) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_unwind_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_extremal_test_fn$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_unwind_function$.bind(SBHL_TEST_FOR_PREVIOUS_EXTREMAL_PATHS, thread);
                        sbhl_search_vars.$sbhl_extremal_test_fn$.bind(function, thread);
                        sbhl_search_vars.$sbhl_result$.bind(NIL, thread);
                        try {
                            {
                                SubLObject _prev_bind_0_121 = sbhl_marking_vars.$sbhl_marking_generation$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_marking_generation$.bind(ZERO_INTEGER, thread);
                                    com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_mark_and_sweep_extremal_independent_nodes(node);
                                } finally {
                                    sbhl_marking_vars.$sbhl_marking_generation$.rebind(_prev_bind_0_121, thread);
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0_122 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    result = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_122, thread);
                                }
                            }
                        }
                    } finally {
                        sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_extremal_test_fn$.rebind(_prev_bind_1, thread);
                        sbhl_search_vars.$sbhl_unwind_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject sbhl_extremal_independent_nodes_such_that(final SubLObject node, final SubLObject function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_unwind_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_extremal_test_fn$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_unwind_function$.bind(SBHL_TEST_FOR_PREVIOUS_EXTREMAL_PATHS, thread);
            sbhl_search_vars.$sbhl_extremal_test_fn$.bind(function, thread);
            sbhl_search_vars.$sbhl_result$.bind(NIL, thread);
            try {
                final SubLObject _prev_bind_0_$99 = sbhl_marking_vars.$sbhl_marking_generation$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_marking_generation$.bind(ZERO_INTEGER, thread);
                    sbhl_mark_and_sweep_extremal_independent_nodes(node);
                } finally {
                    sbhl_marking_vars.$sbhl_marking_generation$.rebind(_prev_bind_0_$99, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$100 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    result = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$100, thread);
                }
            }
        } finally {
            sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_extremal_test_fn$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_unwind_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject sbhl_test_for_previous_extremal_paths_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != sbhl_module_utilities.sbhl_module_indicates_predicate_search_p(sbhl_search_vars.get_sbhl_search_module())) {
                if (NIL != sbhl_search_vars.genl_inverse_mode_p()) {
                    sbhl_search_vars.$sbhl_result$.setDynamicValue(list_utilities.assoc_push(get_sbhl_module($$genlInverse), node, sbhl_search_vars.$sbhl_result$.getDynamicValue(thread), UNPROVIDED), thread);
                } else {
                    sbhl_search_vars.$sbhl_result$.setDynamicValue(list_utilities.assoc_push(get_sbhl_module($$genlPreds), node, sbhl_search_vars.$sbhl_result$.getDynamicValue(thread), UNPROVIDED), thread);
                }
            } else {
                sbhl_search_vars.$sbhl_result$.setDynamicValue(cons(node, sbhl_search_vars.$sbhl_result$.getDynamicValue(thread)), thread);
            }
            return NIL;
        }
    }

    public static SubLObject sbhl_test_for_previous_extremal_paths(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sbhl_module_utilities.sbhl_module_indicates_predicate_search_p(sbhl_search_vars.get_sbhl_search_module())) {
            if (NIL != sbhl_search_vars.genl_inverse_mode_p()) {
                sbhl_search_vars.$sbhl_result$.setDynamicValue(list_utilities.assoc_push(sbhl_module_vars.get_sbhl_module($$genlInverse), node, sbhl_search_vars.$sbhl_result$.getDynamicValue(thread), UNPROVIDED), thread);
            } else {
                sbhl_search_vars.$sbhl_result$.setDynamicValue(list_utilities.assoc_push(sbhl_module_vars.get_sbhl_module($$genlPreds), node, sbhl_search_vars.$sbhl_result$.getDynamicValue(thread), UNPROVIDED), thread);
            }
        } else {
            sbhl_search_vars.$sbhl_result$.setDynamicValue(cons(node, sbhl_search_vars.$sbhl_result$.getDynamicValue(thread)), thread);
        }
        return NIL;
    }

    /**
     * Used for implied false relations, which need to check the disjoins of all of the backward closure of NODE.
     */
    @LispMethod(comment = "Used for implied false relations, which need to check the disjoins of all of the backward closure of NODE.")
    public static final SubLObject sbhl_check_disjoins_of_all_backward_nodes_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(get_sbhl_module(UNPROVIDED));
                com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_sweep(tt_module, sbhl_module_utilities.get_sbhl_module_backward_direction(tt_module), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), SBHL_TARGET_SWEEP_STEP_DISJOINS_AND_CHECK, node, UNPROVIDED);
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Used for implied false relations, which need to check the disjoins of all of the backward closure of NODE.")
    public static SubLObject sbhl_check_disjoins_of_all_backward_nodes(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        sbhl_sweep(tt_module, sbhl_module_utilities.get_sbhl_module_backward_direction(tt_module), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), SBHL_TARGET_SWEEP_STEP_DISJOINS_AND_CHECK, node, UNPROVIDED);
        return NIL;
    }/**
     * Used for implied false relations, which need to check the disjoins of all of the backward closure of NODE.
     */


    public static final SubLObject sbhl_target_sweep_step_disjoins_and_check_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                    {
                        SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(get_sbhl_module(UNPROVIDED));
                        com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_sweep(tt_module, sbhl_module_utilities.get_sbhl_module_forward_direction(tt_module), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), SBHL_STEP_AND_CHECK_MARKINGS, node, UNPROVIDED);
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject sbhl_target_sweep_step_disjoins_and_check(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
            final SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
            sbhl_sweep(tt_module, sbhl_module_utilities.get_sbhl_module_forward_direction(tt_module), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), SBHL_STEP_AND_CHECK_MARKINGS, node, UNPROVIDED);
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject note_kb_access_sbhl_link_alt(SubLObject node, SubLObject link_node) {
        {
            SubLObject module = get_sbhl_module(UNPROVIDED);
            SubLObject direction = sbhl_link_vars.get_sbhl_link_direction();
            SubLObject tv = sbhl_link_vars.get_sbhl_link_tv();
            SubLObject mt = sbhl_search_what_mts.determine_sbhl_link_mt(node, link_node);
            SubLObject predicate = sbhl_module_utilities.get_sbhl_link_pred(module);
            if (NIL == list_utilities.member_eqP(direction, $list_alt82)) {
                Errors.error($str_alt83$Unexpected_direction____S, direction);
            }
            if (NIL != forts.fort_p(predicate)) {
                if (NIL != mt) {
                    {
                        SubLObject formula = (direction == $INVERSE) ? ((SubLObject) (make_binary_formula(predicate, link_node, node))) : make_binary_formula(predicate, node, link_node);
                        SubLObject assertion = com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities.sbhl_find_gaf(formula, mt, tv);
                        if (NIL == assertion_handles.assertion_p(assertion)) {
                            Errors.sublisp_break($str_alt85$KB_access_missed_for_SBHL__S_to__, new SubLObject[]{ node, link_node, direction });
                        }
                        if (NIL != assertion_handles.assertion_p(assertion)) {
                            return kb_access_metering.note_kb_access_assertion(assertion);
                        }
                    }
                }
            }
        }
        return Errors.warn($str_alt86$KB_access_missed_for_SBHL__S_to__, node, link_node);
    }

    public static SubLObject note_kb_access_sbhl_link(final SubLObject node, final SubLObject link_node) {
        final SubLObject module = sbhl_module_vars.get_sbhl_module(UNPROVIDED);
        final SubLObject direction = sbhl_link_vars.get_sbhl_link_direction();
        final SubLObject tv = sbhl_link_vars.get_sbhl_link_tv();
        final SubLObject mt = sbhl_search_what_mts.determine_sbhl_link_mt(node, link_node);
        final SubLObject predicate = sbhl_module_utilities.get_sbhl_link_pred(module);
        if (NIL == list_utilities.member_eqP(direction, $list83)) {
            Errors.error($str84$Unexpected_direction____S, direction);
        }
        if ((NIL != forts.fort_p(predicate)) && (NIL != mt)) {
            final SubLObject formula = (direction == $INVERSE) ? make_binary_formula(predicate, link_node, node) : make_binary_formula(predicate, node, link_node);
            final SubLObject assertion = sbhl_find_gaf(formula, mt, tv);
            if (NIL == assertion_handles.assertion_p(assertion)) {
                Errors.sublisp_break($str86$KB_access_missed_for_SBHL__S_to__, new SubLObject[]{ node, link_node, direction });
            }
            if (NIL != assertion_handles.assertion_p(assertion)) {
                return kb_access_metering.note_kb_access_assertion(assertion);
            }
        }
        return Errors.warn($str87$KB_access_missed_for_SBHL__S_to__, node, link_node);
    }

    public static SubLObject declare_sbhl_search_utilities_file() {
        declareFunction("determine_sbhl_search_behavior", "DETERMINE-SBHL-SEARCH-BEHAVIOR", 3, 0, false);
        declareFunction("determine_sbhl_terminating_marking_space", "DETERMINE-SBHL-TERMINATING-MARKING-SPACE", 1, 0, false);
        declareFunction("sbhl_module_premarks_gather_nodes_p", "SBHL-MODULE-PREMARKS-GATHER-NODES-P", 0, 0, false);
        declareFunction("sbhl_just_gaf", "SBHL-JUST-GAF", 1, 0, false);
        declareFunction("sbhl_just_mt", "SBHL-JUST-MT", 1, 0, false);
        declareFunction("sbhl_possibly_just_mt", "SBHL-POSSIBLY-JUST-MT", 1, 1, false);
        declareFunction("sbhl_just_tv", "SBHL-JUST-TV", 1, 0, false);
        declareFunction("sbhl_gaf_pred", "SBHL-GAF-PRED", 1, 0, false);
        declareFunction("hl_default_tv", "HL-DEFAULT-TV", 1, 0, false);
        declareFunction("sbhl_find_first_matching_gaf", "SBHL-FIND-FIRST-MATCHING-GAF", 1, 0, false);
        declareFunction("sbhl_find_gaf", "SBHL-FIND-GAF", 3, 0, false);
        declareFunction("sbhl_assemble_justification_step", "SBHL-ASSEMBLE-JUSTIFICATION-STEP", 1, 1, false);
        declareFunction("sbhl_assemble_justification", "SBHL-ASSEMBLE-JUSTIFICATION", 1, 1, false);
        declareFunction("sbhl_handle_justification", "SBHL-HANDLE-JUSTIFICATION", 4, 4, false);
        declareFunction("sbhl_module_transitivity_support", "SBHL-MODULE-TRANSITIVITY-SUPPORT", 1, 1, false);
        declareFunction("sbhl_set_empty_extent_justification", "SBHL-SET-EMPTY-EXTENT-JUSTIFICATION", 1, 0, false);
        declareFunction("sbhl_temporal_faux_link", "SBHL-TEMPORAL-FAUX-LINK", 2, 0, false);
        declareFunction("any_support_chain_of_temporal_link", "ANY-SUPPORT-CHAIN-OF-TEMPORAL-LINK", 1, 0, false);
        declareFunction("any_support_chain_of_link_disjunction_consequent", "ANY-SUPPORT-CHAIN-OF-LINK-DISJUNCTION-CONSEQUENT", 2, 0, false);
        declareFunction("sbhl_node_valid_for_temporal_search_result_p", "SBHL-NODE-VALID-FOR-TEMPORAL-SEARCH-RESULT-P", 1, 0, false);
        declareFunction("apply_sbhl_add_node_test", "APPLY-SBHL-ADD-NODE-TEST", 2, 0, false);
        declareFunction("apply_sbhl_add_unmarked_node_test", "APPLY-SBHL-ADD-UNMARKED-NODE-TEST", 1, 0, false);
        declareFunction("sbhl_push_onto_result", "SBHL-PUSH-ONTO-RESULT", 1, 0, false);
        declareFunction("sbhl_push_onto_result_if", "SBHL-PUSH-ONTO-RESULT-IF", 1, 0, false);
        new sbhl_search_utilities.$sbhl_push_onto_result_if$UnaryFunction();
        declareFunction("sbhl_push_onto_result_if_and_stop_unless", "SBHL-PUSH-ONTO-RESULT-IF-AND-STOP-UNLESS", 1, 0, false);
        declareFunction("sbhl_push_onto_result_with_prune", "SBHL-PUSH-ONTO-RESULT-WITH-PRUNE", 1, 0, false);
        declareFunction("sbhl_push_unwind_onto_result", "SBHL-PUSH-UNWIND-ONTO-RESULT", 1, 0, false);
        declareFunction("sbhl_temporal_justification_unwind", "SBHL-TEMPORAL-JUSTIFICATION-UNWIND", 1, 0, false);
        declareFunction("sbhl_apply_compose_fn", "SBHL-APPLY-COMPOSE-FN", 1, 0, false);
        declareFunction("sbhl_apply_compose_fn_if", "SBHL-APPLY-COMPOSE-FN-IF", 1, 0, false);
        declareFunction("sbhl_apply_compose_fn_and_combine_with_result", "SBHL-APPLY-COMPOSE-FN-AND-COMBINE-WITH-RESULT", 1, 0, false);
        declareFunction("sbhl_gather_first_non_nil_result", "SBHL-GATHER-FIRST-NON-NIL-RESULT", 1, 0, false);
        declareFunction("sbhl_gather_first_non_nil_result_with_prune", "SBHL-GATHER-FIRST-NON-NIL-RESULT-WITH-PRUNE", 1, 0, false);
        declareFunction("sbhl_gather_first_dead_end_node_and_enqueue_others", "SBHL-GATHER-FIRST-DEAD-END-NODE-AND-ENQUEUE-OTHERS", 1, 0, false);
        declareFunction("sbhl_gather_first_node", "SBHL-GATHER-FIRST-NODE", 1, 0, false);
        declareFunction("sbhl_gather_first_target_unmarked_node", "SBHL-GATHER-FIRST-TARGET-UNMARKED-NODE", 1, 0, false);
        declareFunction("sbhl_search_has_multiple_goals_p", "SBHL-SEARCH-HAS-MULTIPLE-GOALS-P", 0, 0, false);
        declareFunction("set_sbhl_boolean_goal_conditions", "SET-SBHL-BOOLEAN-GOAL-CONDITIONS", 0, 0, false);
        declareFunction("sbhl_node_marked_as_goal_node", "SBHL-NODE-MARKED-AS-GOAL-NODE", 1, 0, false);
        declareFunction("sbhl_node_is_goal_node", "SBHL-NODE-IS-GOAL-NODE", 1, 0, false);
        declareFunction("sbhl_node_is_a_goal_node", "SBHL-NODE-IS-A-GOAL-NODE", 1, 0, false);
        declareFunction("sbhl_reached_cutoff_p", "SBHL-REACHED-CUTOFF-P", 0, 0, false);
        declareFunction("sbhl_check_cutoff", "SBHL-CHECK-CUTOFF", 1, 0, false);
        new sbhl_search_utilities.$sbhl_check_cutoff$UnaryFunction();
        declareFunction("apply_sbhl_consider_node_fn", "APPLY-SBHL-CONSIDER-NODE-FN", 2, 0, false);
        declareFunction("apply_sbhl_consider_unmarked_node_fn", "APPLY-SBHL-CONSIDER-UNMARKED-NODE-FN", 2, 0, false);
        declareFunction("sbhl_consider_node", "SBHL-CONSIDER-NODE", 1, 0, false);
        declareFunction("sbhl_consider_any_node", "SBHL-CONSIDER-ANY-NODE", 1, 0, false);
        new sbhl_search_utilities.$sbhl_consider_any_node$UnaryFunction();
        declareFunction("sbhl_consider_unmarked_node", "SBHL-CONSIDER-UNMARKED-NODE", 1, 0, false);
        declareFunction("sbhl_mark_and_sweep", "SBHL-MARK-AND-SWEEP", 1, 0, false);
        declareFunction("sbhl_unmark_and_sweep", "SBHL-UNMARK-AND-SWEEP", 1, 0, false);
        declareFunction("sbhl_mark_sweep_and_unwind", "SBHL-MARK-SWEEP-AND-UNWIND", 1, 0, false);
        declareFunction("sbhl_time_mark_and_sweep", "SBHL-TIME-MARK-AND-SWEEP", 1, 0, false);
        declareFunction("sbhl_step_and_suspend_mark", "SBHL-STEP-AND-SUSPEND-MARK", 2, 0, false);
        declareFunction("sbhl_step_and_suspend_unmark", "SBHL-STEP-AND-SUSPEND-UNMARK", 1, 0, false);
        declareFunction("sbhl_step_and_mark", "SBHL-STEP-AND-MARK", 1, 0, false);
        declareFunction("sbhl_step_and_unmark", "SBHL-STEP-AND-UNMARK", 1, 0, false);
        declareFunction("sbhl_sweep", "SBHL-SWEEP", 6, 1, false);
        declareFunction("sbhl_unmark_sweep", "SBHL-UNMARK-SWEEP", 6, 0, false);
        declareFunction("sbhl_sweep_and_unwind", "SBHL-SWEEP-AND-UNWIND", 6, 1, false);
        declareFunction("sbhl_step", "SBHL-STEP", 6, 2, false);
        declareFunction("sbhl_step_through", "SBHL-STEP-THROUGH", 6, 0, false);
        declareFunction("sbhl_step_and_test", "SBHL-STEP-AND-TEST", 6, 1, false);
        declareFunction("sbhl_step_and_perform_marking", "SBHL-STEP-AND-PERFORM-MARKING", 6, 1, false);
        declareFunction("sbhl_unmark_step", "SBHL-UNMARK-STEP", 6, 1, false);
        declareFunction("apply_sbhl_search_behavior", "APPLY-SBHL-SEARCH-BEHAVIOR", 2, 0, false);
        declareFunction("apply_sbhl_mapping_function", "APPLY-SBHL-MAPPING-FUNCTION", 1, 0, false);
        declareFunction("sbhl_apply_unwind_function", "SBHL-APPLY-UNWIND-FUNCTION", 1, 0, false);
        declareFunction("sbhl_simple_true_search", "SBHL-SIMPLE-TRUE-SEARCH", 1, 0, false);
        declareFunction("sbhl_simple_true_search_and_unwind", "SBHL-SIMPLE-TRUE-SEARCH-AND-UNWIND", 1, 0, false);
        declareFunction("sbhl_simple_false_search", "SBHL-SIMPLE-FALSE-SEARCH", 1, 0, false);
        declareFunction("sbhl_step_false_and_sweep_opposite", "SBHL-STEP-FALSE-AND-SWEEP-OPPOSITE", 1, 0, false);
        declareFunction("sbhl_sweep_opposite_for_false", "SBHL-SWEEP-OPPOSITE-FOR-FALSE", 1, 0, false);
        declareFunction("sbhl_step_and_sweep_with_tt_module", "SBHL-STEP-AND-SWEEP-WITH-TT-MODULE", 1, 0, false);
        declareFunction("sbhl_sweep_with_carrying_module", "SBHL-SWEEP-WITH-CARRYING-MODULE", 1, 0, false);
        declareFunction("sbhl_sweep_with_tt_module_carry_step", "SBHL-SWEEP-WITH-TT-MODULE-CARRY-STEP", 1, 0, false);
        declareFunction("sbhl_step_with_carried_module", "SBHL-STEP-WITH-CARRIED-MODULE", 1, 0, false);
        declareFunction("sbhl_sweep_step_disjoins_and_sweep_again", "SBHL-SWEEP-STEP-DISJOINS-AND-SWEEP-AGAIN", 1, 0, false);
        declareFunction("sbhl_step_disjoins_and_sweep_inherited", "SBHL-STEP-DISJOINS-AND-SWEEP-INHERITED", 1, 0, false);
        declareFunction("sbhl_sweep_inherited_disjoins", "SBHL-SWEEP-INHERITED-DISJOINS", 1, 0, false);
        declareFunction("sbhl_step_and_check_markings", "SBHL-STEP-AND-CHECK-MARKINGS", 1, 0, false);
        declareFunction("sbhl_node_locally_disjoint_with_self_p", "SBHL-NODE-LOCALLY-DISJOINT-WITH-SELF-P", 1, 0, false);
        new sbhl_search_utilities.$sbhl_node_locally_disjoint_with_self_p$UnaryFunction();
        declareFunction("sbhl_empty_extent_p", "SBHL-EMPTY-EXTENT-P", 1, 0, false);
        declareFunction("sbhl_goal_empty_extent_p", "SBHL-GOAL-EMPTY-EXTENT-P", 0, 0, false);
        declareFunction("sbhl_sweep_forward_step_false_disjoins_and_sweep_forward_nots", "SBHL-SWEEP-FORWARD-STEP-FALSE-DISJOINS-AND-SWEEP-FORWARD-NOTS", 1, 0, false);
        declareFunction("sbhl_sweep_forward_nots", "SBHL-SWEEP-FORWARD-NOTS", 1, 0, false);
        declareFunction("sbhl_sweep_and_gather_disjoins", "SBHL-SWEEP-AND-GATHER-DISJOINS", 1, 0, false);
        declareFunction("sbhl_step_gather_disjoins", "SBHL-STEP-GATHER-DISJOINS", 1, 0, false);
        new sbhl_search_utilities.$sbhl_step_gather_disjoins$UnaryFunction();
        declareFunction("sbhl_sweep_and_gather_first_disjoin", "SBHL-SWEEP-AND-GATHER-FIRST-DISJOIN", 1, 0, false);
        declareFunction("sbhl_step_gather_first_disjoin", "SBHL-STEP-GATHER-FIRST-DISJOIN", 1, 0, false);
        declareFunction("determine_sbhl_sample_leaf_consider_fn", "DETERMINE-SBHL-SAMPLE-LEAF-CONSIDER-FN", 0, 1, false);
        declareFunction("sbhl_enqueue_node_in_leaf_queue", "SBHL-ENQUEUE-NODE-IN-LEAF-QUEUE", 1, 0, false);
        declareFunction("sbhl_leaf_instances_sweep", "SBHL-LEAF-INSTANCES-SWEEP", 1, 0, false);
        declareFunction("sbhl_leaf_instances_step", "SBHL-LEAF-INSTANCES-STEP", 1, 0, false);
        declareFunction("sbhl_mark_and_sweep_extremal_independent_nodes", "SBHL-MARK-AND-SWEEP-EXTREMAL-INDEPENDENT-NODES", 1, 0, false);
        declareFunction("sbhl_min_backward_true_nodes_such_that", "SBHL-MIN-BACKWARD-TRUE-NODES-SUCH-THAT", 3, 2, false);
        declareFunction("sbhl_extremal_independent_nodes_such_that", "SBHL-EXTREMAL-INDEPENDENT-NODES-SUCH-THAT", 2, 0, false);
        declareFunction("sbhl_test_for_previous_extremal_paths", "SBHL-TEST-FOR-PREVIOUS-EXTREMAL-PATHS", 1, 0, false);
        declareFunction("sbhl_check_disjoins_of_all_backward_nodes", "SBHL-CHECK-DISJOINS-OF-ALL-BACKWARD-NODES", 1, 0, false);
        declareFunction("sbhl_target_sweep_step_disjoins_and_check", "SBHL-TARGET-SWEEP-STEP-DISJOINS-AND-CHECK", 1, 0, false);
        declareFunction("note_kb_access_sbhl_link", "NOTE-KB-ACCESS-SBHL-LINK", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_sbhl_search_utilities_file() {
        return NIL;
    }

    public static SubLObject setup_sbhl_search_utilities_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sbhl_search_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_sbhl_search_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sbhl_search_utilities_file();
    }

    static {
    }

    public static final class $sbhl_push_onto_result_if$UnaryFunction extends UnaryFunction {
        public $sbhl_push_onto_result_if$UnaryFunction() {
            super(extractFunctionNamed("SBHL-PUSH-ONTO-RESULT-IF"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sbhl_push_onto_result_if(arg1);
        }
    }

    public static final class $sbhl_check_cutoff$UnaryFunction extends UnaryFunction {
        public $sbhl_check_cutoff$UnaryFunction() {
            super(extractFunctionNamed("SBHL-CHECK-CUTOFF"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sbhl_check_cutoff(arg1);
        }
    }

    public static final class $sbhl_consider_any_node$UnaryFunction extends UnaryFunction {
        public $sbhl_consider_any_node$UnaryFunction() {
            super(extractFunctionNamed("SBHL-CONSIDER-ANY-NODE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sbhl_consider_any_node(arg1);
        }
    }

    public static final class $sbhl_node_locally_disjoint_with_self_p$UnaryFunction extends UnaryFunction {
        public $sbhl_node_locally_disjoint_with_self_p$UnaryFunction() {
            super(extractFunctionNamed("SBHL-NODE-LOCALLY-DISJOINT-WITH-SELF-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sbhl_node_locally_disjoint_with_self_p(arg1);
        }
    }

    public static final class $sbhl_step_gather_disjoins$UnaryFunction extends UnaryFunction {
        public $sbhl_step_gather_disjoins$UnaryFunction() {
            super(extractFunctionNamed("SBHL-STEP-GATHER-DISJOINS"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sbhl_step_gather_disjoins(arg1);
        }
    }

    static private final SubLString $str_alt6$Search_behavior_not_recognized__S = makeString("Search behavior not recognized. Sorry.");

    static private final SubLString $str_alt7$Search_Behavior_not_recognized___ = makeString("Search Behavior not recognized: ~a");

    static private final SubLList $list_alt12 = list(makeSymbol("PRED"), makeSymbol("ARG1"), makeSymbol("ARG2"));

    static private final SubLString $str_alt16$incorrect_justification_assembly_ = makeString("incorrect justification assembly ~a");

    static private final SubLString $str_alt22$_S_is_not_a_transitive_module = makeString("~S is not a transitive module");

    static private final SubLString $str_alt29$Using_potentially_unsupported_gat = makeString("Using potentially unsupported gather gating behavior: ~a");

    static private final SubLString $str_alt30$Using_potentially_unsupported_unm = makeString("Using potentially unsupported unmark gather gating behavior: ~a");

    static private final SubLList $list_alt31 = list(makeSymbol("RESULT"), makeSymbol("DONE?"));

    static private final SubLString $str_alt42$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLList $list_alt43 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    static private final SubLString $str_alt46$attempt_to_call_unsupported_sbhl_ = makeString("attempt to call unsupported sbhl search behavior: ~a~%");

    static private final SubLString $str_alt65$invalid_module_type__a = makeString("invalid module type ~a");

    static private final SubLString $str_alt70$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt75$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLList $list_alt82 = list(makeKeyword("PREDICATE"), makeKeyword("INVERSE"));

    static private final SubLString $str_alt83$Unexpected_direction____S = makeString("Unexpected direction : ~S");

    static private final SubLString $str_alt85$KB_access_missed_for_SBHL__S_to__ = makeString("KB access missed for SBHL ~S to ~S for ~S");

    static private final SubLString $str_alt86$KB_access_missed_for_SBHL__S_to__ = makeString("KB access missed for SBHL ~S to ~S");
}

/**
 * Total time: 1703 ms
 */
