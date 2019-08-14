/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SHOP-PARAMETERS
 * source file: /cyc/top/cycl/shop-parameters.lisp
 * created:     2019/07/03 17:38:26
 */
public final class shop_parameters extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new shop_parameters();

 public static final String myName = "com.cyc.cycjava.cycl.shop_parameters";


    // deflexical
    // Definitions
    /**
     * the mapping of predicates to the heuristic functions which calulate the
     * likely number of currently matching bindings for a given non-ground literal.
     */
    @LispMethod(comment = "the mapping of predicates to the heuristic functions which calulate the\r\nlikely number of currently matching bindings for a given non-ground literal.\ndeflexical\nthe mapping of predicates to the heuristic functions which calulate the\nlikely number of currently matching bindings for a given non-ground literal.")
    public static final SubLSymbol $shop_heuristics$ = makeSymbol("*SHOP-HEURISTICS*");

    // defparameter
    /**
     * This should be an upper bound on the expected depth of the HTN's
     * (hierarchical task networks) in the current planning domain.
     */
    @LispMethod(comment = "This should be an upper bound on the expected depth of the HTN\'s\r\n(hierarchical task networks) in the current planning domain.\ndefparameter\nThis should be an upper bound on the expected depth of the HTN\'s\n(hierarchical task networks) in the current planning domain.")
    public static final SubLSymbol $shop_default_depth_limit$ = makeSymbol("*SHOP-DEFAULT-DEPTH-LIMIT*");

    // defparameter
    /**
     * This should be an upper bound on the expected time of a planning execution.
     * NIL means that planner should run until the entire search space is exhausted.
     */
    @LispMethod(comment = "This should be an upper bound on the expected time of a planning execution.\r\nNIL means that planner should run until the entire search space is exhausted.\ndefparameter\nThis should be an upper bound on the expected time of a planning execution.\nNIL means that planner should run until the entire search space is exhausted.")
    public static final SubLSymbol $shop_default_time_limit$ = makeSymbol("*SHOP-DEFAULT-TIME-LIMIT*");

    // defparameter
    /**
     * This should be an upper bound on the number of plans returned by the planner.
     * NIL means that planner should run until the entire search space is exhausted.
     */
    @LispMethod(comment = "This should be an upper bound on the number of plans returned by the planner.\r\nNIL means that planner should run until the entire search space is exhausted.\ndefparameter\nThis should be an upper bound on the number of plans returned by the planner.\nNIL means that planner should run until the entire search space is exhausted.")
    public static final SubLSymbol $shop_default_number_limit$ = makeSymbol("*SHOP-DEFAULT-NUMBER-LIMIT*");

    // defparameter
    /**
     * Set to T if we want KB asks to go through the same canonicalization as @xref
     * FI-ASK does. For most cases, the simpler (and faster) @xref
     * SHOP-CANONICALIZE-ASK should suffice.
     */
    @LispMethod(comment = "Set to T if we want KB asks to go through the same canonicalization as @xref\r\nFI-ASK does. For most cases, the simpler (and faster) @xref\r\nSHOP-CANONICALIZE-ASK should suffice.\ndefparameter\nSet to T if we want KB asks to go through the same canonicalization as @xref\nFI-ASK does. For most cases, the simpler (and faster) @xref\nSHOP-CANONICALIZE-ASK should suffice.")
    public static final SubLSymbol $shop_use_real_canonicalization$ = makeSymbol("*SHOP-USE-REAL-CANONICALIZATION*");

    // defparameter
    /**
     * Set to :ALL to have the default fi-ask validation level. Doing so will slow
     * down the planner -- approximately double run times.
     */
    @LispMethod(comment = "Set to :ALL to have the default fi-ask validation level. Doing so will slow\r\ndown the planner -- approximately double run times.\ndefparameter\nSet to :ALL to have the default fi-ask validation level. Doing so will slow\ndown the planner -- approximately double run times.")
    public static final SubLSymbol $shop_inference_intermediate_step_validation_level$ = makeSymbol("*SHOP-INFERENCE-INTERMEDIATE-STEP-VALIDATION-LEVEL*");

    // defparameter
    // Set to t to enforce method cycle checking.
    /**
     * Set to t to enforce method cycle checking.
     */
    @LispMethod(comment = "Set to t to enforce method cycle checking.\ndefparameter")
    public static final SubLSymbol $shop_method_cycle_checking_enabledP$ = makeSymbol("*SHOP-METHOD-CYCLE-CHECKING-ENABLED?*");

    // defparameter
    // Set to t to use multibindings to shrink search space and organize plans.
    /**
     * Set to t to use multibindings to shrink search space and organize plans.
     */
    @LispMethod(comment = "Set to t to use multibindings to shrink search space and organize plans.\ndefparameter")
    public static final SubLSymbol $shop_use_multibindingsP$ = makeSymbol("*SHOP-USE-MULTIBINDINGS?*");

    // defparameter
    /**
     * Set to t to let SHOP hypothesize (as in @xref FI-HYPOTHESIZE) bindings for
     * preconditions.
     */
    @LispMethod(comment = "Set to t to let SHOP hypothesize (as in @xref FI-HYPOTHESIZE) bindings for\r\npreconditions.\ndefparameter\nSet to t to let SHOP hypothesize (as in @xref FI-HYPOTHESIZE) bindings for\npreconditions.")
    public static final SubLSymbol $shop_hypothesize_modeP$ = makeSymbol("*SHOP-HYPOTHESIZE-MODE?*");

    // defparameter
    /**
     * Use SHOP-MT-WORLD-STATE as the data structure for world states. Uses
     * hypothetical microtheories to store intermediate facts of the world state.
     */
    @LispMethod(comment = "Use SHOP-MT-WORLD-STATE as the data structure for world states. Uses\r\nhypothetical microtheories to store intermediate facts of the world state.\ndefparameter\nUse SHOP-MT-WORLD-STATE as the data structure for world states. Uses\nhypothetical microtheories to store intermediate facts of the world state.")
    public static final SubLSymbol $shop_use_mt_world_statesP$ = makeSymbol("*SHOP-USE-MT-WORLD-STATES?*");

    // defparameter
    /**
     * Set to t to send complete rule preconditions to the inference engine, rather
     * than send each literal individually.
     */
    @LispMethod(comment = "Set to t to send complete rule preconditions to the inference engine, rather\r\nthan send each literal individually.\ndefparameter\nSet to t to send complete rule preconditions to the inference engine, rather\nthan send each literal individually.")
    public static final SubLSymbol $shop_infer_complete_preconditionsP$ = makeSymbol("*SHOP-INFER-COMPLETE-PRECONDITIONS?*");

    // defparameter
    /**
     * Set to t for inference supports to be added to the each plan state. Allows
     * for better post-analysis of found plans.
     */
    @LispMethod(comment = "Set to t for inference supports to be added to the each plan state. Allows\r\nfor better post-analysis of found plans.\ndefparameter\nSet to t for inference supports to be added to the each plan state. Allows\nfor better post-analysis of found plans.")
    public static final SubLSymbol $shop_use_inference_supportsP$ = makeSymbol("*SHOP-USE-INFERENCE-SUPPORTS?*");

    // defparameter
    // SHOP-ASK should be somewhat faster, but just as correct, as FI-ASK-INT.
    /**
     * SHOP-ASK should be somewhat faster, but just as correct, as FI-ASK-INT.
     */
    @LispMethod(comment = "SHOP-ASK should be somewhat faster, but just as correct, as FI-ASK-INT.\ndefparameter")
    public static final SubLSymbol $shop_use_shop_askP$ = makeSymbol("*SHOP-USE-SHOP-ASK?*");

    // defparameter
    /**
     * Set to t to allow object indexing. ie. allow querying for specific shop
     * objects by id number. Useful for debugging.
     */
    @LispMethod(comment = "Set to t to allow object indexing. ie. allow querying for specific shop\r\nobjects by id number. Useful for debugging.\ndefparameter\nSet to t to allow object indexing. ie. allow querying for specific shop\nobjects by id number. Useful for debugging.")
    public static final SubLSymbol $shop_object_indexingP$ = makeSymbol("*SHOP-OBJECT-INDEXING?*");

    // defparameter
    /**
     * Set to T to use the #$preconditionForMethod style of stating preconditions
     * for method rules.
     */
    @LispMethod(comment = "Set to T to use the #$preconditionForMethod style of stating preconditions\r\nfor method rules.\ndefparameter\nSet to T to use the #$preconditionForMethod style of stating preconditions\nfor method rules.")
    public static final SubLSymbol $shop_use_precondition_for_methodP$ = makeSymbol("*SHOP-USE-PRECONDITION-FOR-METHOD?*");

    // defparameter
    /**
     * The plan state that is currently available for inference. Set by the planner
     * before a call to fi-ask.
     */
    @LispMethod(comment = "The plan state that is currently available for inference. Set by the planner\r\nbefore a call to fi-ask.\ndefparameter\nThe plan state that is currently available for inference. Set by the planner\nbefore a call to fi-ask.")
    public static final SubLSymbol $shop_ask_plan_state$ = makeSymbol("*SHOP-ASK-PLAN-STATE*");

    // defparameter
    /**
     * The set of all potentially dynamic predicates in a planning domain. Set by
     * the planner before a call to fi-ask.
     */
    @LispMethod(comment = "The set of all potentially dynamic predicates in a planning domain. Set by\r\nthe planner before a call to fi-ask.\ndefparameter\nThe set of all potentially dynamic predicates in a planning domain. Set by\nthe planner before a call to fi-ask.")
    public static final SubLSymbol $shop_ask_dynamic_predicates$ = makeSymbol("*SHOP-ASK-DYNAMIC-PREDICATES*");

    // defparameter
    /**
     * The current plan state multibinding. Set by the planner before a call to
     * fi-ask.
     */
    @LispMethod(comment = "The current plan state multibinding. Set by the planner before a call to\r\nfi-ask.\ndefparameter\nThe current plan state multibinding. Set by the planner before a call to\nfi-ask.")
    public static final SubLSymbol $shop_ask_multibinding$ = makeSymbol("*SHOP-ASK-MULTIBINDING*");

    private static final SubLInteger $int$500 = makeInteger(500);

    /**
     *
     *
     * @param PRED
    predicate-p
     * 		
     * @return booleanp
     */
    @LispMethod(comment = "@param PRED\npredicate-p\r\n\t\t\r\n@return booleanp")
    public static final SubLObject shop_ask_dynamic_predicateP_alt(SubLObject pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return set.set_memberP(pred, $shop_ask_dynamic_predicates$.getDynamicValue(thread));
        }
    }

    /**
     *
     *
     * @param PRED
    predicate-p
     * 		
     * @return booleanp
     */
    @LispMethod(comment = "@param PRED\npredicate-p\r\n\t\t\r\n@return booleanp")
    public static SubLObject shop_ask_dynamic_predicateP(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return set.set_memberP(pred, $shop_ask_dynamic_predicates$.getDynamicValue(thread));
    }

    public static SubLObject declare_shop_parameters_file() {
        declareFunction("shop_ask_dynamic_predicateP", "SHOP-ASK-DYNAMIC-PREDICATE?", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_shop_parameters_file_alt() {
        deflexical("*SHOP-HEURISTICS*", dictionary.new_dictionary(symbol_function(EQ), TEN_INTEGER));
        defparameter("*SHOP-DEFAULT-DEPTH-LIMIT*", $int$75);
        defparameter("*SHOP-DEFAULT-TIME-LIMIT*", NIL);
        defparameter("*SHOP-DEFAULT-NUMBER-LIMIT*", NIL);
        defparameter("*SHOP-USE-REAL-CANONICALIZATION*", NIL);
        defparameter("*SHOP-INFERENCE-INTERMEDIATE-STEP-VALIDATION-LEVEL*", $NONE);
        defparameter("*SHOP-METHOD-CYCLE-CHECKING-ENABLED?*", T);
        defparameter("*SHOP-USE-MULTIBINDINGS?*", T);
        defparameter("*SHOP-HYPOTHESIZE-MODE?*", NIL);
        defparameter("*SHOP-USE-MT-WORLD-STATES?*", NIL);
        defparameter("*SHOP-INFER-COMPLETE-PRECONDITIONS?*", T);
        defparameter("*SHOP-USE-INFERENCE-SUPPORTS?*", T);
        defparameter("*SHOP-USE-SHOP-ASK?*", NIL);
        defparameter("*SHOP-OBJECT-INDEXING?*", T);
        defparameter("*SHOP-USE-PRECONDITION-FOR-METHOD?*", T);
        defparameter("*SHOP-ASK-PLAN-STATE*", NIL);
        defparameter("*SHOP-ASK-DYNAMIC-PREDICATES*", NIL);
        defparameter("*SHOP-ASK-MULTIBINDING*", NIL);
        return NIL;
    }

    public static SubLObject init_shop_parameters_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*SHOP-HEURISTICS*", dictionary.new_dictionary(symbol_function(EQ), TEN_INTEGER));
            defparameter("*SHOP-DEFAULT-DEPTH-LIMIT*", $int$500);
            defparameter("*SHOP-DEFAULT-TIME-LIMIT*", NIL);
            defparameter("*SHOP-DEFAULT-NUMBER-LIMIT*", NIL);
            defparameter("*SHOP-USE-REAL-CANONICALIZATION*", NIL);
            defparameter("*SHOP-INFERENCE-INTERMEDIATE-STEP-VALIDATION-LEVEL*", $NONE);
            defparameter("*SHOP-METHOD-CYCLE-CHECKING-ENABLED?*", T);
            defparameter("*SHOP-USE-MULTIBINDINGS?*", T);
            defparameter("*SHOP-HYPOTHESIZE-MODE?*", NIL);
            defparameter("*SHOP-USE-MT-WORLD-STATES?*", NIL);
            defparameter("*SHOP-INFER-COMPLETE-PRECONDITIONS?*", T);
            defparameter("*SHOP-USE-INFERENCE-SUPPORTS?*", T);
            defparameter("*SHOP-USE-SHOP-ASK?*", NIL);
            defparameter("*SHOP-OBJECT-INDEXING?*", T);
            defparameter("*SHOP-USE-PRECONDITION-FOR-METHOD?*", T);
            defparameter("*SHOP-ASK-PLAN-STATE*", NIL);
            defparameter("*SHOP-ASK-DYNAMIC-PREDICATES*", NIL);
            defparameter("*SHOP-ASK-MULTIBINDING*", NIL);
        }
        if (SubLFiles.USE_V2) {
            defparameter("*SHOP-DEFAULT-DEPTH-LIMIT*", $int$75);
        }
        return NIL;
    }

    public static SubLObject init_shop_parameters_file_Previous() {
        deflexical("*SHOP-HEURISTICS*", dictionary.new_dictionary(symbol_function(EQ), TEN_INTEGER));
        defparameter("*SHOP-DEFAULT-DEPTH-LIMIT*", $int$500);
        defparameter("*SHOP-DEFAULT-TIME-LIMIT*", NIL);
        defparameter("*SHOP-DEFAULT-NUMBER-LIMIT*", NIL);
        defparameter("*SHOP-USE-REAL-CANONICALIZATION*", NIL);
        defparameter("*SHOP-INFERENCE-INTERMEDIATE-STEP-VALIDATION-LEVEL*", $NONE);
        defparameter("*SHOP-METHOD-CYCLE-CHECKING-ENABLED?*", T);
        defparameter("*SHOP-USE-MULTIBINDINGS?*", T);
        defparameter("*SHOP-HYPOTHESIZE-MODE?*", NIL);
        defparameter("*SHOP-USE-MT-WORLD-STATES?*", NIL);
        defparameter("*SHOP-INFER-COMPLETE-PRECONDITIONS?*", T);
        defparameter("*SHOP-USE-INFERENCE-SUPPORTS?*", T);
        defparameter("*SHOP-USE-SHOP-ASK?*", NIL);
        defparameter("*SHOP-OBJECT-INDEXING?*", T);
        defparameter("*SHOP-USE-PRECONDITION-FOR-METHOD?*", T);
        defparameter("*SHOP-ASK-PLAN-STATE*", NIL);
        defparameter("*SHOP-ASK-DYNAMIC-PREDICATES*", NIL);
        defparameter("*SHOP-ASK-MULTIBINDING*", NIL);
        return NIL;
    }

    public static SubLObject setup_shop_parameters_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_shop_parameters_file();
    }

    @Override
    public void initializeVariables() {
        init_shop_parameters_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_shop_parameters_file();
    }

    static {
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLInteger $int$75 = makeInteger(75);
}

/**
 * Total time: 70 ms
 */
